package mcframe.clientMSBE.MSBEP1000;

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
import mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Srch01Caller;
import mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Imp01Caller;
import mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Upd01Caller;
import mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Del01Caller;
import mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Upd03Caller;
import mcframe.clientMSBE.MSBEP1000.MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Sprt01Caller;

/**
 * 画面"MSBEP_XfrSchdReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_XfrSchdReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1000";

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
	// [RqstMod]ブロック関連のField定義
	public MCPanel RqstModPanel = null;
	public MCTitledBorder RqstModTitledBorder = null;
	// [RqstMod]ブロックの項目のField定義
	// [RqstCan]ブロック関連のField定義
	public MCPanel RqstCanPanel = null;
	public MCTitledBorder RqstCanTitledBorder = null;
	// [RqstCan]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,Refer;REQ_MOD,View (Edited by request source) UPD,登録・訂正する;DEL,取り消す;REF,参照する;REQ_MOD,依頼元訂正あり.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_REQ_MOD = null;
	/**
	 * On オン.<p>
	 *
	 */
	public MCCheckBox Cnd_rqst_mod_t_flg = null;
	/**
	 * Off オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_rqst_mod_f_flg = null;
	/**
	 * On オン.<p>
	 *
	 */
	public MCCheckBox Cnd_rqst_can_t_flg = null;
	/**
	 * Off オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_rqst_can_f_flg = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_gi_rqst_tm_frto_p_PPanel;
	public MCDateField Cnd_gi_rqst_dt_fr;	// [Cnd]の[gi_rqst_tm_frto_p.ymd_fr]を[Cnd_gi_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_gi_rqst_hm_fr;	// [Cnd]の[gi_rqst_tm_frto_p.hm_fr]を[Cnd_gi_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_gi_rqst_dt_to;	// [Cnd]の[gi_rqst_tm_frto_p.ymd_to]を[Cnd_gi_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_gi_rqst_hm_to;	// [Cnd]の[gi_rqst_tm_frto_p.hm_to]を[Cnd_gi_rqst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_gr_rqst_tm_frto_p_PPanel;
	public MCDateField Cnd_gr_rqst_dt_fr;	// [Cnd]の[gr_rqst_tm_frto_p.ymd_fr]を[Cnd_gr_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_gr_rqst_hm_fr;	// [Cnd]の[gr_rqst_tm_frto_p.hm_fr]を[Cnd_gr_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_gr_rqst_dt_to;	// [Cnd]の[gr_rqst_tm_frto_p.ymd_to]を[Cnd_gr_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_gr_rqst_hm_to;	// [Cnd]の[gr_rqst_tm_frto_p.hm_to]を[Cnd_gr_rqst_hm_to]としてエイリアス定義。
	public MCLabel Cnd_rcpt_dt_fr_Label = null;
	/**
	 * Receiving date FROM 受付日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_rcpt_dt_fr = null;
	public MCLabel Cnd_rcpt_dt_to_Label = null;
	/**
	 * Receiving date TO 受付日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_rcpt_dt_to = null;
	/**
	 * Include subsequent order 指図以降含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inst_inc_flg = null;
	public MCLabel Cnd_gi_loc_cd_Label = null;
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_gi_loc_cd = null;
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public MCTextField Cnd_gi_loc_nm = null;
	public MCLabel Cnd_gi_str_ln_cd_Label = null;
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gi_str_ln_cd = null;
	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_gi_str_ln_nm = null;
	public MCLabel Cnd_gi_stk_arrv_bp_cd_Label = null;
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_gi_stk_arrv_bp_cd = null;
	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public MCTextField Cnd_gi_stk_arrv_bp_nm = null;
	public MCLabel Cnd_gi_site_cd_Label = null;
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gi_site_cd = null;
	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_gi_site_nm = null;
	public MCLabel Cnd_gi_wg_cd_Label = null;
	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gi_wg_cd = null;
	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_gi_wg_nm = null;
	public MCLabel Cnd_gi_lg_grp_cd_Label = null;
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gi_lg_grp_cd = null;
	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_gi_lg_grp_nm = null;
	public MCLabel Cnd_gr_loc_cd_Label = null;
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_gr_loc_cd = null;
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public MCTextField Cnd_gr_loc_nm = null;
	public MCLabel Cnd_gr_str_ln_cd_Label = null;
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_str_ln_cd = null;
	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_gr_str_ln_nm = null;
	public MCLabel Cnd_gr_site_cd_Label = null;
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_site_cd = null;
	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_gr_site_nm = null;
	public MCLabel Cnd_gr_wg_cd_Label = null;
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_wg_cd = null;
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_gr_wg_nm = null;
	public MCLabel Cnd_gr_lg_grp_cd_Label = null;
	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gr_lg_grp_cd = null;
	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_gr_lg_grp_nm = null;
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
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCCheckBox Cnd_def_ver_flg = null;
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
	public MCLabel Cnd_trd_unit_cd_Label = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCTextField Cnd_trd_unit_nm = null;
	public MCLabel Cnd_base_unit_cd_Label = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCTextField Cnd_base_unit_nm = null;
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
	public MCLabel Cnd_quality_typ_Label = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCTextField Cnd_quality_typ_nm = null;
	public MCLabel Cnd_stk_id_typ_Label = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_stk_id_typ_nm = null;
	public MCLabel Cnd_stk_bp_cd_Label = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCTextField Cnd_stk_bp_nm = null;
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
	public MCLabel Cnd_ship_term_cd_Label = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCTextField Cnd_ship_term_nm = null;
	public MCLabel Cnd_ship_inst_typ_Label = null;
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_inst_typ = null;
	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public MCTextField Cnd_ship_inst_typ_nm = null;
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
	public MCLabel Cnd_bd_dpt_cd_Label = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCTextField Cnd_bd_dpt_nm = null;
	public MCLabel Cnd_ship_to_id_typ_Label = null;
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_to_id_typ = null;
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_ship_to_id_typ_nm = null;
	public MCLabel Cnd_ship_to_id_cd_Label = null;
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_to_id_cd = null;
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public MCTextField Cnd_ship_to_id_nm = null;
	public MCLabel Cnd_prov_typ_Label = null;
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCTextField Cnd_prov_typ_nm = null;
	public MCLabel Cnd_prov_basis_typ_Label = null;
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_prov_basis_typ = null;
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public MCTextField Cnd_prov_basis_typ_nm = null;
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
	public MCLabel Cnd_tax_typ_Label = null;
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_tax_typ = null;
	/**
	 * Tax type name 税区分名.<p>
	 *
	 */
	public MCTextField Cnd_tax_typ_nm = null;
	public MCLabel Cnd_ptax_cur_cd_Label = null;
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCTextField Cnd_ptax_cur_nm = null;
	public MCLabel Cnd_ret_prov_typ_Label = null;
	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public MCTextComboBox Cnd_ret_prov_typ = null;
	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public MCTextField Cnd_ret_prov_typ_nm = null;
	public MCLabel Cnd_ret_prov_basis_typ_Label = null;
	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public MCTextComboBox Cnd_ret_prov_basis_typ = null;
	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public MCTextField Cnd_ret_prov_basis_typ_nm = null;
	public MCLabel Cnd_ret_trd_cur_cd_Label = null;
	/**
	 * Currency cd. (Return) 通貨ＣＤ（返品）.<p>
	 *
	 */
	public MCTextComboBox Cnd_ret_trd_cur_cd = null;
	/**
	 * Currency name (Return) 通貨名（返品）.<p>
	 *
	 */
	public MCTextField Cnd_ret_trd_cur_nm = null;
	public MCLabel Cnd_ret_tax_cd_Label = null;
	/**
	 * Tax cd. (Return) 税ＣＤ（返品）.<p>
	 *
	 */
	public MCTextComboBox Cnd_ret_tax_cd = null;
	/**
	 * Tax name (Return) 税名（返品）.<p>
	 *
	 */
	public MCTextField Cnd_ret_tax_nm = null;
	public MCLabel Cnd_ret_tax_typ_Label = null;
	/**
	 * Tax type (Return) 税区分（返品）.<p>
	 *
	 */
	public MCTextComboBox Cnd_ret_tax_typ = null;
	/**
	 * Tax type name (Return) 税区分名（返品）.<p>
	 *
	 */
	public MCTextField Cnd_ret_tax_typ_nm = null;
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
	public MCLabel Cnd_rqst_cnt_rmrks_Label = null;
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_rqst_cnt_rmrks = null;
	public MCLabel Cnd_ship_cnt_rmrks_Label = null;
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_ship_cnt_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
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
	public MCLabel Cnd_xfr_src_typ_Label = null;
	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_xfr_src_typ = null;
	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public MCTextField Cnd_xfr_src_typ_nm = null;
	public MCLabel Cnd_xfr_src_no_Label = null;
	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_xfr_src_no = null;
	public MCLabel Cnd_xfr_schd_no_Label = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_xfr_schd_no = null;
	public MCLabel Cnd_itm_ord_no_Label = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_ord_no = null;
	public MCLabel Cnd_mfg_inst_no_Label = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_no = null;
	public MCLabel Cnd_oper_inst_no_Label = null;
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_inst_no = null;
	public MCLabel Cnd_inpt_schd_no_Label = null;
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_inpt_schd_no = null;
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
	// [ItmGrpCnd]ブロック関連のField定義
	public MCPanel ItmGrpCndPanel = null;
	// [ItmGrpCnd]ブロックの項目のField定義
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
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_gi_rqst_dt_p_PPanel;
	public MCDateField BulkSet_gi_rqst_dt;	// [BulkSet]の[gi_rqst_dt_p.ymd]を[BulkSet_gi_rqst_dt]としてエイリアス定義。
	public MCDateField BulkSet_gi_rqst_hm;	// [BulkSet]の[gi_rqst_dt_p.hm]を[BulkSet_gi_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_gr_rqst_dt_p_PPanel;
	public MCDateField BulkSet_gr_rqst_dt;	// [BulkSet]の[gr_rqst_dt_p.ymd]を[BulkSet_gr_rqst_dt]としてエイリアス定義。
	public MCDateField BulkSet_gr_rqst_hm;	// [BulkSet]の[gr_rqst_dt_p.hm]を[BulkSet_gr_rqst_hm]としてエイリアス定義。
	public MCLabel BulkSet_rcpt_dt_Label = null;
	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDateField BulkSet_rcpt_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_rqst_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_rqst_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_rqst_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_rqst_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_rqst_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_rqst_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_rqst_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_rqst_dpt_nm]としてエイリアス定義。
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1000.RsltR> RsltTable = null;
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
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ = null;
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
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ = null;
	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_upri_cng_flg = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_itm_flg = null;
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_flg = null;
	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_none_flg = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Rslt_lot_no_p_PPanel;
	public MCColumnConfig columnRslt_crt_lot_flg;// [Rslt]の[lot_no_p.crt_lot_flg]を[columnRslt_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_lot_no;// [Rslt]の[lot_no_p.lot_no]を[columnRslt_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_sublot_no;// [Rslt]の[lot_no_p.sublot_no]を[columnRslt_sublot_no]としてエイリアス定義。
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
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
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
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
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
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
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient) 有効成分端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_inpt_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_inpt_cont_qty;// [Rslt]の[inpt_cont_qty_p.qty]を[columnRslt_inpt_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Rslt_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_fctr;// [Rslt]の[act_cont_fctr_p.act_cont_fctr]を[columnRslt_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_act_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_qty;// [Rslt]の[act_cont_qty_p.cont_qty]を[columnRslt_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_cont_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_std_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_qty;// [Rslt]の[std_cont_qty_p.cont_qty]を[columnRslt_std_cont_qty]としてエイリアス定義。
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_loc_cd = null;
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_loc_nm = null;
	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_gi_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_gi_str_ln_cd;// [Rslt]の[gi_str_ln_p.str_ln_cd]を[columnRslt_gi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_gi_str_ln_nm;// [Rslt]の[gi_str_ln_p.str_ln_nm]を[columnRslt_gi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_gi_str_ln_cd_none_flg;// [Rslt]の[gi_str_ln_p.str_ln_cd_none_flg]を[columnRslt_gi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_lg_grp_cd = null;
	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_lg_grp_nm = null;
	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_wg_cd = null;
	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_wg_nm = null;
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_site_cd = null;
	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_site_nm = null;
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_loc_cd = null;
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_loc_nm = null;
	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_gr_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_gr_str_ln_cd;// [Rslt]の[gr_str_ln_p.str_ln_cd]を[columnRslt_gr_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_gr_str_ln_nm;// [Rslt]の[gr_str_ln_p.str_ln_nm]を[columnRslt_gr_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_gr_str_ln_cd_none_flg;// [Rslt]の[gr_str_ln_p.str_ln_cd_none_flg]を[columnRslt_gr_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_lg_grp_cd = null;
	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_lg_grp_nm = null;
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_wg_cd = null;
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_wg_nm = null;
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_site_cd = null;
	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_site_nm = null;
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
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno1_null_flg;// [Rslt]の[sno_wrk_no_p.sno1_null_flg]を[columnRslt_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2_null_flg;// [Rslt]の[sno_wrk_no_p.sno2_null_flg]を[columnRslt_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3_null_flg;// [Rslt]の[sno_wrk_no_p.sno3_null_flg]を[columnRslt_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4_null_flg;// [Rslt]の[sno_wrk_no_p.sno4_null_flg]を[columnRslt_sno4_null_flg]としてエイリアス定義。
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
	public mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D Rslt_stk_bp_p_PPanel;
	public MCColumnConfig columnRslt_stk_bp_cd;// [Rslt]の[stk_bp_p.stk_bp_cd]を[columnRslt_stk_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_stk_bp_nm;// [Rslt]の[stk_bp_p.stk_bp_nm]を[columnRslt_stk_bp_nm]としてエイリアス定義。
	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_sppl_cd = null;
	/**
	 * GI currency cd. 出庫通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_cur_cd = null;
	/**
	 * GI subcontract 出庫下請け.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_subcon_flg = null;
	/**
	 * GI chargeable supplier 出庫有償支給先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_onr_prsppl_flg = null;
	/**
	 * Allow GI supply unit change 出庫支給単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_prov_upri_cng_flg = null;
	/**
	 * GI supply amount rounding type 出庫支給金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_prov_amt_rnd_typ = null;
	/**
	 * GI supply tax rounding type 出庫支給税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_prov_tax_rnd_typ = null;
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_stk_arrv_bp_cd = null;
	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_stk_arrv_bp_nm = null;
	/**
	 * GR supplier cd. 入庫発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_sppl_cd = null;
	/**
	 * GR currency cd. 入庫通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_cur_cd = null;
	/**
	 * GR subcontract 入庫下請け.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_subcon_flg = null;
	/**
	 * GR chargeable supplier 入庫有償支給先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_onr_prsppl_flg = null;
	/**
	 * GR supply in-transit management type 入庫支給積送管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_prov_rcv_typ = null;
	/**
	 * GR supply recording type 入庫支給計上区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_prov_basis_typ = null;
	/**
	 * Allow GR supply unit price change 入庫支給単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_prov_upri_cng_flg = null;
	/**
	 * Rounding type (GR supply amount) 入庫支給金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_prov_amt_rnd_typ = null;
	/**
	 * Rounding type (GR supply tax) 入庫支給税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gr_prov_tax_rnd_typ = null;
	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_gi_rqst_tm_p_PPanel;
	public MCColumnConfig columnRslt_gi_rqst_dt;// [Rslt]の[gi_rqst_tm_p.ymd]を[columnRslt_gi_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_gi_rqst_hm;// [Rslt]の[gi_rqst_tm_p.hm]を[columnRslt_gi_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_gr_rqst_tm_p_PPanel;
	public MCColumnConfig columnRslt_gr_rqst_dt;// [Rslt]の[gr_rqst_tm_p.ymd]を[columnRslt_gr_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_gr_rqst_hm;// [Rslt]の[gr_rqst_tm_p.hm]を[columnRslt_gr_rqst_hm]としてエイリアス定義。
	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_trd_flg = null;
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_tm = null;
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_schd_tm = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_rqst_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_rqst_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_rqst_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_rqst_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_rqst_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_rqst_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_rqst_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_rqst_dpt_nm]としてエイリアス定義。
	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_mod_flg = null;
	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_can_flg = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_term_nm = null;
	public MCColumnConfig columnRslt_ship_term_cd_inv = null;
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_typ = null;
	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_typ_nm = null;
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
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_gi_flg = null;
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
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_block_flg = null;
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_typ = null;
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_typ_nm = null;
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_cd = null;
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_nm = null;
	public mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D Rslt_ship_to_addr_p_PPanel;
	public MCColumnConfig columnRslt_cntry_cd;// [Rslt]の[ship_to_addr_p.cntry_cd]を[columnRslt_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cntry_nm;// [Rslt]の[ship_to_addr_p.cntry_nm]を[columnRslt_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_zip_cd;// [Rslt]の[ship_to_addr_p.zip_cd]を[columnRslt_ship_to_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr1;// [Rslt]の[ship_to_addr_p.addr1]を[columnRslt_ship_to_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr2;// [Rslt]の[ship_to_addr_p.addr2]を[columnRslt_ship_to_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr3;// [Rslt]の[ship_to_addr_p.addr3]を[columnRslt_ship_to_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr4;// [Rslt]の[ship_to_addr_p.addr4]を[columnRslt_ship_to_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntct_dpt;// [Rslt]の[ship_to_addr_p.cntct_dpt]を[columnRslt_ship_to_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntct_psn;// [Rslt]の[ship_to_addr_p.cntct_psn]を[columnRslt_ship_to_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_tel;// [Rslt]の[ship_to_addr_p.tel]を[columnRslt_ship_to_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_fax;// [Rslt]の[ship_to_addr_p.fax]を[columnRslt_ship_to_fax]としてエイリアス定義。
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_sundry_flg = null;
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
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_typ_nm = null;
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
	public MCColumnConfig columnRslt_trd_cur_amt_dec_place = null;
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_upri_dec_place = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Rslt_prov_upri_amt_p_PPanel;
	public MCColumnConfig columnRslt_upri_not_tgt_flg;// [Rslt]の[prov_upri_amt_p.upri_not_tgt_flg]を[columnRslt_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_upri;// [Rslt]の[prov_upri_amt_p.trd_cur_upri]を[columnRslt_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnRslt_interim_flg;// [Rslt]の[prov_upri_amt_p.interim_flg]を[columnRslt_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[prov_upri_amt_p.trd_cur_amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_inc_tax_amt;// [Rslt]の[prov_upri_amt_p.trd_cur_inc_tax_amt]を[columnRslt_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_fix_flg;// [Rslt]の[prov_upri_amt_p.tax_fix_flg]を[columnRslt_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_cd;// [Rslt]の[prov_upri_amt_p.tax_cd]を[columnRslt_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_nm;// [Rslt]の[prov_upri_amt_p.tax_nm]を[columnRslt_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_rate;// [Rslt]の[prov_upri_amt_p.tax_rate]を[columnRslt_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_typ;// [Rslt]の[prov_upri_amt_p.tax_typ]を[columnRslt_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnRslt_inc_tax_flg;// [Rslt]の[prov_upri_amt_p.inc_tax_flg]を[columnRslt_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_tax_amt;// [Rslt]の[prov_upri_amt_p.trd_cur_tax_amt]を[columnRslt_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_dscnt_amt;// [Rslt]の[prov_upri_amt_p.trd_cur_dscnt_amt]を[columnRslt_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dscnt_rsn_cd;// [Rslt]の[prov_upri_amt_p.dscnt_rsn_cd]を[columnRslt_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dscnt_rsn_nm;// [Rslt]の[prov_upri_amt_p.dscnt_rsn_nm]を[columnRslt_dscnt_rsn_nm]としてエイリアス定義。
	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_xrate_cd = null;
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_xrate_p_PPanel;
	public MCColumnConfig columnRslt_xrate;// [Rslt]の[xrate_p.xrate]を[columnRslt_xrate]としてエイリアス定義。
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
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
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
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_amt_dec_place = null;
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_ptax_xrate_p_PPanel;
	public MCColumnConfig columnRslt_ptax_xrate;// [Rslt]の[ptax_xrate_p.xrate]を[columnRslt_ptax_xrate]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_amt;// [Rslt]の[ptax_amt_p.amt]を[columnRslt_ptax_amt]としてエイリアス定義。
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_wtax_amt_p_PPanel;
	public MCColumnConfig columnRslt_wtax_amt;// [Rslt]の[wtax_amt_p.amt]を[columnRslt_wtax_amt]としてエイリアス定義。
	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_prov_typ = null;
	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_prov_typ_nm = null;
	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_prov_basis_typ = null;
	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_prov_basis_typ_nm = null;
	/**
	 * Currency cd. (Return) 通貨ＣＤ（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_trd_cur_cd = null;
	/**
	 * Currency name (Return) 通貨名（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_trd_cur_nm = null;
	/**
	 * Transaction amount number of decimal places (Return) 取引金額小数部有効桁数（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_trd_cur_amt_dec_place = null;
	/**
	 * Transaction unit price number of decimal places (Return) 取引単価小数部有効桁数（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_trd_cur_upri_dec_place = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Rslt_ret_prov_upri_amt_p_PPanel;
	public MCColumnConfig columnRslt_ret_upri_not_tgt_flg;// [Rslt]の[ret_prov_upri_amt_p.upri_not_tgt_flg]を[columnRslt_ret_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_trd_cur_upri;// [Rslt]の[ret_prov_upri_amt_p.trd_cur_upri]を[columnRslt_ret_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_interim_flg;// [Rslt]の[ret_prov_upri_amt_p.interim_flg]を[columnRslt_ret_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_trd_cur_amt;// [Rslt]の[ret_prov_upri_amt_p.trd_cur_amt]を[columnRslt_ret_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_trd_cur_inc_tax_amt;// [Rslt]の[ret_prov_upri_amt_p.trd_cur_inc_tax_amt]を[columnRslt_ret_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_tax_fix_flg;// [Rslt]の[ret_prov_upri_amt_p.tax_fix_flg]を[columnRslt_ret_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_tax_cd;// [Rslt]の[ret_prov_upri_amt_p.tax_cd]を[columnRslt_ret_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_tax_nm;// [Rslt]の[ret_prov_upri_amt_p.tax_nm]を[columnRslt_ret_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_tax_rate;// [Rslt]の[ret_prov_upri_amt_p.tax_rate]を[columnRslt_ret_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_tax_typ;// [Rslt]の[ret_prov_upri_amt_p.tax_typ]を[columnRslt_ret_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_inc_tax_flg;// [Rslt]の[ret_prov_upri_amt_p.inc_tax_flg]を[columnRslt_ret_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_trd_cur_tax_amt;// [Rslt]の[ret_prov_upri_amt_p.trd_cur_tax_amt]を[columnRslt_ret_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_trd_cur_dscnt_amt;// [Rslt]の[ret_prov_upri_amt_p.trd_cur_dscnt_amt]を[columnRslt_ret_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_dscnt_rsn_cd;// [Rslt]の[ret_prov_upri_amt_p.dscnt_rsn_cd]を[columnRslt_ret_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_dscnt_rsn_nm;// [Rslt]の[ret_prov_upri_amt_p.dscnt_rsn_nm]を[columnRslt_ret_dscnt_rsn_nm]としてエイリアス定義。
	/**
	 * Set exchange rate (Return) 為替レート指定（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_ret_xrate_p_PPanel;
	public MCColumnConfig columnRslt_ret_xrate;// [Rslt]の[ret_xrate_p.xrate]を[columnRslt_ret_xrate]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ret_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_ret_base_cur_amt;// [Rslt]の[ret_base_cur_amt_p.amt]を[columnRslt_ret_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ret_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ret_base_cur_tax_amt;// [Rslt]の[ret_base_cur_tax_amt_p.amt]を[columnRslt_ret_base_cur_tax_amt]としてエイリアス定義。
	/**
	 * Set tax exchange rate (Return) 納税為替レート指定（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_ret_ptax_xrate_p_PPanel;
	public MCColumnConfig columnRslt_ret_ptax_xrate;// [Rslt]の[ret_ptax_xrate_p.xrate]を[columnRslt_ret_ptax_xrate]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ret_ptax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ret_ptax_amt;// [Rslt]の[ret_ptax_amt_p.amt]を[columnRslt_ret_ptax_amt]としてエイリアス定義。
	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ret_wtax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ret_wtax_amt;// [Rslt]の[ret_wtax_amt_p.amt]を[columnRslt_ret_wtax_amt]としてエイリアス定義。
	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_dlv_slip_no = null;
	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_prov_act_no = null;
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_ac_dt = null;
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_cnt_rmrks = null;
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_cnt_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_d_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
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
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xfr_src_typ = null;
	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xfr_src_typ_nm = null;
	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xfr_src_no = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xfr_schd_no = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_no = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_no = null;
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_inst_no = null;
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inpt_schd_no = null;
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
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_pr_no = null;
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_lot_mix_flg = null;
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_sublot_mix_flg = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt_fr = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt_to = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rtn_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rtn_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_dtl = null;
	public mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H Btn_Btn_open_MSBEP0500_PPanel;
	/**
	 * Acquire supply date 支給日取得.<p>
	 *
	 */
	public MCButton Btn_sprt_ac_dt = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [REQ_MOD]モードを表す定数 */
	public static final String REQ_MOD = "REQ_MOD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH, DEL, REF, REQ_MOD};
	
	/** [MS_MSBEL1000_Srch01]のCallerの作成 */
	protected MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Srch01Caller createMS_MSBEL1000_Srch01() {
		MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Srch01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Srch01Bridge>
		caller = ((MSBEP_XfrSchdReg_MC)this).new MS_MSBEL1000_Srch01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Srch01Bridge>(
					(MSBEP_XfrSchdReg)this, new MS_MSBEL1000_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1000_Srch01]の呼び出し */
	protected void callMS_MSBEL1000_Srch01() {
		MCCaller caller = createMS_MSBEL1000_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1000_Imp01]のCallerの作成 */
	protected MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Imp01Caller createMS_MSBEL1000_Imp01() {
		MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Imp01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Imp01Bridge>
		caller = ((MSBEP_XfrSchdReg_MC)this).new MS_MSBEL1000_Imp01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Imp01Bridge>(
					(MSBEP_XfrSchdReg)this, new MS_MSBEL1000_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBEL1000_Imp01]の呼び出し */
	protected void callMS_MSBEL1000_Imp01() {
		MCCaller caller = createMS_MSBEL1000_Imp01();
		caller.exec();
	}
	/** [MS_MSBEL1000_Upd01]のCallerの作成 */
	protected MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Upd01Caller createMS_MSBEL1000_Upd01() {
		MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Upd01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Upd01Bridge>
		caller = ((MSBEP_XfrSchdReg_MC)this).new MS_MSBEL1000_Upd01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Upd01Bridge>(
					(MSBEP_XfrSchdReg)this, new MS_MSBEL1000_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1000_Upd01]の呼び出し */
	protected void callMS_MSBEL1000_Upd01() {
		MCCaller caller = createMS_MSBEL1000_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1000_Del01]のCallerの作成 */
	protected MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Del01Caller createMS_MSBEL1000_Del01() {
		MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Del01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Del01Bridge>
		caller = ((MSBEP_XfrSchdReg_MC)this).new MS_MSBEL1000_Del01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Del01Bridge>(
					(MSBEP_XfrSchdReg)this, new MS_MSBEL1000_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1000_Del01]の呼び出し */
	protected void callMS_MSBEL1000_Del01() {
		MCCaller caller = createMS_MSBEL1000_Del01();
		caller.exec();
	}
	/** [MS_MSBEL1000_Upd03]のCallerの作成 */
	protected MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Upd03Caller createMS_MSBEL1000_Upd03() {
		MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Upd03Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Upd03Bridge>
		caller = ((MSBEP_XfrSchdReg_MC)this).new MS_MSBEL1000_Upd03Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Upd03Bridge>(
					(MSBEP_XfrSchdReg)this, new MS_MSBEL1000_Upd03Bridge());
		return caller;
	}
	/** [MS_MSBEL1000_Upd03]の呼び出し */
	protected void callMS_MSBEL1000_Upd03() {
		MCCaller caller = createMS_MSBEL1000_Upd03();
		caller.exec();
	}
	/** [MS_MSBEL1000_Sprt01]のCallerの作成 */
	protected MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Sprt01Caller createMS_MSBEL1000_Sprt01() {
		MSBEP_XfrSchdReg_MC.MS_MSBEL1000_Sprt01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Sprt01Bridge>
		caller = ((MSBEP_XfrSchdReg_MC)this).new MS_MSBEL1000_Sprt01Caller<MSBEP_XfrSchdReg, MS_MSBEL1000_Sprt01Bridge>(
					(MSBEP_XfrSchdReg)this, new MS_MSBEL1000_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1000_Sprt01]の呼び出し */
	protected void callMS_MSBEL1000_Sprt01() {
		MCCaller caller = createMS_MSBEL1000_Sprt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1000.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1000.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1000.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1000.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1000.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1000.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1000.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBE.MSBEP1000.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1000.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1000.BulkSetR createBulkSetR() {
		return mcframe.clientMSBE.MSBEP1000.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1000.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1000.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1000.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1000.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1000.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(RqstModPanel);
		ret.add(RqstCanPanel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(ItmGrpCndPanel);
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
	public MSBEP_XfrSchdReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_XfrSchdReg_MC_A(String name) {
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
		MSBEP_XfrSchdReg_MC.jbCreateScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateTop((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateFold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateTab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateRqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateRqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateTab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateCtrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateRPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateBulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateRslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateBtn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbCreateEastBtn((MSBEP_XfrSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [RqstMod]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRqstMod(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [RqstCan]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRqstCan(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_XfrSchdReg p) {
		p.Cnd_gi_rqst_tm_frto_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().gi_rqst_tm_frto_p());
		p.Cnd_gi_rqst_tm_frto_p_PPanel.setName("Cnd.gi_rqst_tm_frto_p");
		p.Cnd_gi_rqst_dt_fr = p.Cnd_gi_rqst_tm_frto_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_gi_rqst_dt_fr.addAliasName("Cnd.gi_rqst_dt_fr", p);
		p.Cnd_gi_rqst_hm_fr = p.Cnd_gi_rqst_tm_frto_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_gi_rqst_hm_fr.addAliasName("Cnd.gi_rqst_hm_fr", p);
		p.Cnd_gi_rqst_dt_to = p.Cnd_gi_rqst_tm_frto_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_gi_rqst_dt_to.addAliasName("Cnd.gi_rqst_dt_to", p);
		p.Cnd_gi_rqst_hm_to = p.Cnd_gi_rqst_tm_frto_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_gi_rqst_hm_to.addAliasName("Cnd.gi_rqst_hm_to", p);
		p.Cnd_gr_rqst_tm_frto_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().gr_rqst_tm_frto_p());
		p.Cnd_gr_rqst_tm_frto_p_PPanel.setName("Cnd.gr_rqst_tm_frto_p");
		p.Cnd_gr_rqst_dt_fr = p.Cnd_gr_rqst_tm_frto_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_gr_rqst_dt_fr.addAliasName("Cnd.gr_rqst_dt_fr", p);
		p.Cnd_gr_rqst_hm_fr = p.Cnd_gr_rqst_tm_frto_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_gr_rqst_hm_fr.addAliasName("Cnd.gr_rqst_hm_fr", p);
		p.Cnd_gr_rqst_dt_to = p.Cnd_gr_rqst_tm_frto_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_gr_rqst_dt_to.addAliasName("Cnd.gr_rqst_dt_to", p);
		p.Cnd_gr_rqst_hm_to = p.Cnd_gr_rqst_tm_frto_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_gr_rqst_hm_to.addAliasName("Cnd.gr_rqst_hm_to", p);
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
	 * [ItmGrpCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrpCnd(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_XfrSchdReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBEP_XfrSchdReg p) {
		p.BulkSet_gi_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().gi_rqst_dt_p());
		p.BulkSet_gi_rqst_dt_p_PPanel.setName("BulkSet.gi_rqst_dt_p");
		p.BulkSet_gi_rqst_dt = p.BulkSet_gi_rqst_dt_p_PPanel.YmdHm_ymd;
		p.BulkSet_gi_rqst_dt.addAliasName("BulkSet.gi_rqst_dt", p);
		p.BulkSet_gi_rqst_hm = p.BulkSet_gi_rqst_dt_p_PPanel.YmdHm_hm;
		p.BulkSet_gi_rqst_hm.addAliasName("BulkSet.gi_rqst_hm", p);
		p.BulkSet_gr_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().gr_rqst_dt_p());
		p.BulkSet_gr_rqst_dt_p_PPanel.setName("BulkSet.gr_rqst_dt_p");
		p.BulkSet_gr_rqst_dt = p.BulkSet_gr_rqst_dt_p_PPanel.YmdHm_ymd;
		p.BulkSet_gr_rqst_dt.addAliasName("BulkSet.gr_rqst_dt", p);
		p.BulkSet_gr_rqst_hm = p.BulkSet_gr_rqst_dt_p_PPanel.YmdHm_hm;
		p.BulkSet_gr_rqst_hm.addAliasName("BulkSet.gr_rqst_hm", p);
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_rqst_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_rqst_usr_cd.addAliasName("BulkSet.rqst_usr_cd", p);
		p.BulkSet_rqst_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_rqst_usr_nm.addAliasName("BulkSet.rqst_usr_nm", p);
		p.BulkSet_rqst_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_rqst_dpt_cd.addAliasName("BulkSet.rqst_dpt_cd", p);
		p.BulkSet_rqst_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_rqst_dpt_nm.addAliasName("BulkSet.rqst_dpt_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_XfrSchdReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$itm_p);
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
		p.Rslt_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$lot_no_p);
		p.Rslt_lot_no_p_PPanel.setName("Rslt.lot_no_p");
		p.columnRslt_crt_lot_flg = p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnRslt_crt_lot_flg.addAliasName("Rslt.crt_lot_flg", p);
		p.columnRslt_lot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnRslt_lot_no.addAliasName("Rslt.lot_no", p);
		p.columnRslt_sublot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnRslt_sublot_no.addAliasName("Rslt.sublot_no", p);
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$cont_fctr_unit_p);
		p.Rslt_cont_fctr_unit_p_PPanel.setName("Rslt.cont_fctr_unit_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_inpt_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$inpt_cont_qty_p);
		p.Rslt_inpt_cont_qty_p_PPanel.setName("Rslt.inpt_cont_qty_p");
		p.columnRslt_inpt_cont_qty = p.Rslt_inpt_cont_qty_p_PPanel.columnQty_qty;
		p.columnRslt_inpt_cont_qty.addAliasName("Rslt.inpt_cont_qty", p);
		p.Rslt_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$act_cont_fctr_p);
		p.Rslt_act_cont_fctr_p_PPanel.setName("Rslt.act_cont_fctr_p");
		p.columnRslt_act_cont_fctr = p.Rslt_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRslt_act_cont_fctr.addAliasName("Rslt.act_cont_fctr", p);
		p.Rslt_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$act_cont_qty_p);
		p.Rslt_act_cont_qty_p_PPanel.setName("Rslt.act_cont_qty_p");
		p.columnRslt_act_cont_qty = p.Rslt_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_act_cont_qty.addAliasName("Rslt.act_cont_qty", p);
		p.Rslt_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$std_cont_fctr_p);
		p.Rslt_std_cont_fctr_p_PPanel.setName("Rslt.std_cont_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$std_cont_qty_p);
		p.Rslt_std_cont_qty_p_PPanel.setName("Rslt.std_cont_qty_p");
		p.columnRslt_std_cont_qty = p.Rslt_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_std_cont_qty.addAliasName("Rslt.std_cont_qty", p);
		p.Rslt_gi_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$gi_str_ln_p);
		p.Rslt_gi_str_ln_p_PPanel.setName("Rslt.gi_str_ln_p");
		p.columnRslt_gi_str_ln_cd = p.Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_gi_str_ln_cd.addAliasName("Rslt.gi_str_ln_cd", p);
		p.columnRslt_gi_str_ln_nm = p.Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_gi_str_ln_nm.addAliasName("Rslt.gi_str_ln_nm", p);
		p.columnRslt_gi_str_ln_cd_none_flg = p.Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_gi_str_ln_cd_none_flg.addAliasName("Rslt.gi_str_ln_cd_none_flg", p);
		p.Rslt_gr_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$gr_str_ln_p);
		p.Rslt_gr_str_ln_p_PPanel.setName("Rslt.gr_str_ln_p");
		p.columnRslt_gr_str_ln_cd = p.Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_gr_str_ln_cd.addAliasName("Rslt.gr_str_ln_cd", p);
		p.columnRslt_gr_str_ln_nm = p.Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_gr_str_ln_nm.addAliasName("Rslt.gr_str_ln_nm", p);
		p.columnRslt_gr_str_ln_cd_none_flg = p.Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_gr_str_ln_cd_none_flg.addAliasName("Rslt.gr_str_ln_cd_none_flg", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$sno_wrk_no_p);
		p.Rslt_sno_wrk_no_p_PPanel.setName("Rslt.sno_wrk_no_p");
		p.columnRslt_sno1 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno1_null_flg = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnRslt_sno1_null_flg.addAliasName("Rslt.sno1_null_flg", p);
		p.columnRslt_sno2 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno2_null_flg = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnRslt_sno2_null_flg.addAliasName("Rslt.sno2_null_flg", p);
		p.columnRslt_sno3 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno3_null_flg = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnRslt_sno3_null_flg.addAliasName("Rslt.sno3_null_flg", p);
		p.columnRslt_sno4 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_sno4_null_flg = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnRslt_sno4_null_flg.addAliasName("Rslt.sno4_null_flg", p);
		p.columnRslt_wrk_no = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_stk_bp_p_PPanel = mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$stk_bp_p);
		p.Rslt_stk_bp_p_PPanel.setName("Rslt.stk_bp_p");
		p.columnRslt_stk_bp_cd = p.Rslt_stk_bp_p_PPanel.columnStkBp_stk_bp_cd;
		p.columnRslt_stk_bp_cd.addAliasName("Rslt.stk_bp_cd", p);
		p.columnRslt_stk_bp_nm = p.Rslt_stk_bp_p_PPanel.columnStkBp_stk_bp_nm;
		p.columnRslt_stk_bp_nm.addAliasName("Rslt.stk_bp_nm", p);
		p.Rslt_gi_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$gi_rqst_tm_p);
		p.Rslt_gi_rqst_tm_p_PPanel.setName("Rslt.gi_rqst_tm_p");
		p.columnRslt_gi_rqst_dt = p.Rslt_gi_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_gi_rqst_dt.addAliasName("Rslt.gi_rqst_dt", p);
		p.columnRslt_gi_rqst_hm = p.Rslt_gi_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_gi_rqst_hm.addAliasName("Rslt.gi_rqst_hm", p);
		p.Rslt_gr_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$gr_rqst_tm_p);
		p.Rslt_gr_rqst_tm_p_PPanel.setName("Rslt.gr_rqst_tm_p");
		p.columnRslt_gr_rqst_dt = p.Rslt_gr_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_gr_rqst_dt.addAliasName("Rslt.gr_rqst_dt", p);
		p.columnRslt_gr_rqst_hm = p.Rslt_gr_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_gr_rqst_hm.addAliasName("Rslt.gr_rqst_hm", p);
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_rqst_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_rqst_usr_cd.addAliasName("Rslt.rqst_usr_cd", p);
		p.columnRslt_rqst_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_rqst_usr_nm.addAliasName("Rslt.rqst_usr_nm", p);
		p.columnRslt_rqst_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_rqst_dpt_cd.addAliasName("Rslt.rqst_dpt_cd", p);
		p.columnRslt_rqst_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_rqst_dpt_nm.addAliasName("Rslt.rqst_dpt_nm", p);
		p.Rslt_ship_to_addr_p_PPanel = mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ship_to_addr_p);
		p.Rslt_ship_to_addr_p_PPanel.setName("Rslt.ship_to_addr_p");
		p.columnRslt_cntry_cd = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd;
		p.columnRslt_cntry_cd.addAliasName("Rslt.cntry_cd", p);
		p.columnRslt_cntry_nm = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm;
		p.columnRslt_cntry_nm.addAliasName("Rslt.cntry_nm", p);
		p.columnRslt_ship_to_zip_cd = p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd;
		p.columnRslt_ship_to_zip_cd.addAliasName("Rslt.ship_to_zip_cd", p);
		p.columnRslt_ship_to_addr1 = p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1;
		p.columnRslt_ship_to_addr1.addAliasName("Rslt.ship_to_addr1", p);
		p.columnRslt_ship_to_addr2 = p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2;
		p.columnRslt_ship_to_addr2.addAliasName("Rslt.ship_to_addr2", p);
		p.columnRslt_ship_to_addr3 = p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3;
		p.columnRslt_ship_to_addr3.addAliasName("Rslt.ship_to_addr3", p);
		p.columnRslt_ship_to_addr4 = p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4;
		p.columnRslt_ship_to_addr4.addAliasName("Rslt.ship_to_addr4", p);
		p.columnRslt_ship_to_cntct_dpt = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt;
		p.columnRslt_ship_to_cntct_dpt.addAliasName("Rslt.ship_to_cntct_dpt", p);
		p.columnRslt_ship_to_cntct_psn = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn;
		p.columnRslt_ship_to_cntct_psn.addAliasName("Rslt.ship_to_cntct_psn", p);
		p.columnRslt_ship_to_tel = p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel;
		p.columnRslt_ship_to_tel.addAliasName("Rslt.ship_to_tel", p);
		p.columnRslt_ship_to_fax = p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax;
		p.columnRslt_ship_to_fax.addAliasName("Rslt.ship_to_fax", p);
		p.Rslt_prov_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$prov_upri_amt_p);
		p.Rslt_prov_upri_amt_p_PPanel.setName("Rslt.prov_upri_amt_p");
		p.columnRslt_upri_not_tgt_flg = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnRslt_upri_not_tgt_flg.addAliasName("Rslt.upri_not_tgt_flg", p);
		p.columnRslt_trd_cur_upri = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.columnRslt_interim_flg = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnRslt_interim_flg.addAliasName("Rslt.interim_flg", p);
		p.columnRslt_trd_cur_amt = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.columnRslt_trd_cur_inc_tax_amt = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnRslt_trd_cur_inc_tax_amt.addAliasName("Rslt.trd_cur_inc_tax_amt", p);
		p.columnRslt_tax_fix_flg = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnRslt_tax_fix_flg.addAliasName("Rslt.tax_fix_flg", p);
		p.columnRslt_tax_cd = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnRslt_tax_cd.addAliasName("Rslt.tax_cd", p);
		p.columnRslt_tax_nm = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnRslt_tax_nm.addAliasName("Rslt.tax_nm", p);
		p.columnRslt_tax_rate = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnRslt_tax_rate.addAliasName("Rslt.tax_rate", p);
		p.columnRslt_tax_typ = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnRslt_tax_typ.addAliasName("Rslt.tax_typ", p);
		p.columnRslt_inc_tax_flg = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnRslt_inc_tax_flg.addAliasName("Rslt.inc_tax_flg", p);
		p.columnRslt_trd_cur_tax_amt = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.columnRslt_dscnt_rsn_cd = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnRslt_dscnt_rsn_cd.addAliasName("Rslt.dscnt_rsn_cd", p);
		p.columnRslt_dscnt_rsn_nm = p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnRslt_dscnt_rsn_nm.addAliasName("Rslt.dscnt_rsn_nm", p);
		p.Rslt_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$xrate_p);
		p.Rslt_xrate_p_PPanel.setName("Rslt.xrate_p");
		p.columnRslt_xrate = p.Rslt_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_xrate.addAliasName("Rslt.xrate", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ptax_xrate_p);
		p.Rslt_ptax_xrate_p_PPanel.setName("Rslt.ptax_xrate_p");
		p.columnRslt_ptax_xrate = p.Rslt_ptax_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_ptax_xrate.addAliasName("Rslt.ptax_xrate", p);
		p.Rslt_ptax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ptax_amt_p);
		p.Rslt_ptax_amt_p_PPanel.setName("Rslt.ptax_amt_p");
		p.columnRslt_ptax_amt = p.Rslt_ptax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_amt.addAliasName("Rslt.ptax_amt", p);
		p.Rslt_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$wtax_amt_p);
		p.Rslt_wtax_amt_p_PPanel.setName("Rslt.wtax_amt_p");
		p.columnRslt_wtax_amt = p.Rslt_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_wtax_amt.addAliasName("Rslt.wtax_amt", p);
		p.Rslt_ret_prov_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ret_prov_upri_amt_p);
		p.Rslt_ret_prov_upri_amt_p_PPanel.setName("Rslt.ret_prov_upri_amt_p");
		p.columnRslt_ret_upri_not_tgt_flg = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnRslt_ret_upri_not_tgt_flg.addAliasName("Rslt.ret_upri_not_tgt_flg", p);
		p.columnRslt_ret_trd_cur_upri = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnRslt_ret_trd_cur_upri.addAliasName("Rslt.ret_trd_cur_upri", p);
		p.columnRslt_ret_interim_flg = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnRslt_ret_interim_flg.addAliasName("Rslt.ret_interim_flg", p);
		p.columnRslt_ret_trd_cur_amt = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnRslt_ret_trd_cur_amt.addAliasName("Rslt.ret_trd_cur_amt", p);
		p.columnRslt_ret_trd_cur_inc_tax_amt = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnRslt_ret_trd_cur_inc_tax_amt.addAliasName("Rslt.ret_trd_cur_inc_tax_amt", p);
		p.columnRslt_ret_tax_fix_flg = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnRslt_ret_tax_fix_flg.addAliasName("Rslt.ret_tax_fix_flg", p);
		p.columnRslt_ret_tax_cd = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnRslt_ret_tax_cd.addAliasName("Rslt.ret_tax_cd", p);
		p.columnRslt_ret_tax_nm = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnRslt_ret_tax_nm.addAliasName("Rslt.ret_tax_nm", p);
		p.columnRslt_ret_tax_rate = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnRslt_ret_tax_rate.addAliasName("Rslt.ret_tax_rate", p);
		p.columnRslt_ret_tax_typ = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnRslt_ret_tax_typ.addAliasName("Rslt.ret_tax_typ", p);
		p.columnRslt_ret_inc_tax_flg = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnRslt_ret_inc_tax_flg.addAliasName("Rslt.ret_inc_tax_flg", p);
		p.columnRslt_ret_trd_cur_tax_amt = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnRslt_ret_trd_cur_tax_amt.addAliasName("Rslt.ret_trd_cur_tax_amt", p);
		p.columnRslt_ret_trd_cur_dscnt_amt = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnRslt_ret_trd_cur_dscnt_amt.addAliasName("Rslt.ret_trd_cur_dscnt_amt", p);
		p.columnRslt_ret_dscnt_rsn_cd = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnRslt_ret_dscnt_rsn_cd.addAliasName("Rslt.ret_dscnt_rsn_cd", p);
		p.columnRslt_ret_dscnt_rsn_nm = p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnRslt_ret_dscnt_rsn_nm.addAliasName("Rslt.ret_dscnt_rsn_nm", p);
		p.Rslt_ret_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ret_xrate_p);
		p.Rslt_ret_xrate_p_PPanel.setName("Rslt.ret_xrate_p");
		p.columnRslt_ret_xrate = p.Rslt_ret_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_ret_xrate.addAliasName("Rslt.ret_xrate", p);
		p.Rslt_ret_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ret_base_cur_amt_p);
		p.Rslt_ret_base_cur_amt_p_PPanel.setName("Rslt.ret_base_cur_amt_p");
		p.columnRslt_ret_base_cur_amt = p.Rslt_ret_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ret_base_cur_amt.addAliasName("Rslt.ret_base_cur_amt", p);
		p.Rslt_ret_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ret_base_cur_tax_amt_p);
		p.Rslt_ret_base_cur_tax_amt_p_PPanel.setName("Rslt.ret_base_cur_tax_amt_p");
		p.columnRslt_ret_base_cur_tax_amt = p.Rslt_ret_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ret_base_cur_tax_amt.addAliasName("Rslt.ret_base_cur_tax_amt", p);
		p.Rslt_ret_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ret_ptax_xrate_p);
		p.Rslt_ret_ptax_xrate_p_PPanel.setName("Rslt.ret_ptax_xrate_p");
		p.columnRslt_ret_ptax_xrate = p.Rslt_ret_ptax_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_ret_ptax_xrate.addAliasName("Rslt.ret_ptax_xrate", p);
		p.Rslt_ret_ptax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ret_ptax_amt_p);
		p.Rslt_ret_ptax_amt_p_PPanel.setName("Rslt.ret_ptax_amt_p");
		p.columnRslt_ret_ptax_amt = p.Rslt_ret_ptax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ret_ptax_amt.addAliasName("Rslt.ret_ptax_amt", p);
		p.Rslt_ret_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$ret_wtax_amt_p);
		p.Rslt_ret_wtax_amt_p_PPanel.setName("Rslt.ret_wtax_amt_p");
		p.columnRslt_ret_wtax_amt = p.Rslt_ret_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ret_wtax_amt.addAliasName("Rslt.ret_wtax_amt", p);
		p.Rslt_rtn_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$rtn_msg_p);
		p.Rslt_rtn_msg_p_PPanel.setName("Rslt.rtn_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rtn_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP1000.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBEP_XfrSchdReg p) {
		p.Btn_Btn_open_MSBEP0500_PPanel = mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.create();
		p.Btn_Btn_open_MSBEP0500_PPanel.setName("Btn.Btn_open_MSBEP0500");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_XfrSchdReg p) {
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

	
	/** [Cnd_gi_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gi_loc_cd_p = null;

	/**
	 * [Cnd_gi_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gi_loc_cd_ListPutter() {
		if (Cnd_gi_loc_cd_p == null) {
			Cnd_gi_loc_cd_p = createCnd_gi_loc_cd_ListPutter(Cnd_gi_loc_cd, "gi_loc_cd", "gi_loc_nm");

		}
		return Cnd_gi_loc_cd_p;
	}
	
	
	/** [Cnd_gi_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gi_str_ln_cd_p = null;

	/**
	 * [Cnd_gi_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gi_str_ln_cd_ListPutter() {
		if (Cnd_gi_str_ln_cd_p == null) {
			Cnd_gi_str_ln_cd_p = createCnd_gi_str_ln_cd_ListPutter(Cnd_gi_str_ln_cd, "gi_str_ln_cd", "gi_str_ln_nm");

		}
		return Cnd_gi_str_ln_cd_p;
	}
	
	
	/** [Cnd_gi_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gi_stk_arrv_bp_cd_p = null;

	/**
	 * [Cnd_gi_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gi_stk_arrv_bp_cd_ListPutter() {
		if (Cnd_gi_stk_arrv_bp_cd_p == null) {
			Cnd_gi_stk_arrv_bp_cd_p = createCnd_gi_stk_arrv_bp_cd_ListPutter(Cnd_gi_stk_arrv_bp_cd, "gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_nm");

		}
		return Cnd_gi_stk_arrv_bp_cd_p;
	}
	
	
	/** [Cnd_gi_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gi_site_cd_p = null;

	/**
	 * [Cnd_gi_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gi_site_cd_ListPutter() {
		if (Cnd_gi_site_cd_p == null) {
			Cnd_gi_site_cd_p = createCnd_gi_site_cd_ListPutter(Cnd_gi_site_cd, "gi_site_cd", "gi_site_nm");

		}
		return Cnd_gi_site_cd_p;
	}
	
	
	/** [Cnd_gi_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gi_wg_cd_p = null;

	/**
	 * [Cnd_gi_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gi_wg_cd_ListPutter() {
		if (Cnd_gi_wg_cd_p == null) {
			Cnd_gi_wg_cd_p = createCnd_gi_wg_cd_ListPutter(Cnd_gi_wg_cd, "gi_wg_cd", "gi_wg_nm");

		}
		return Cnd_gi_wg_cd_p;
	}
	
	
	/** [Cnd_gi_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gi_lg_grp_cd_p = null;

	/**
	 * [Cnd_gi_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gi_lg_grp_cd_ListPutter() {
		if (Cnd_gi_lg_grp_cd_p == null) {
			Cnd_gi_lg_grp_cd_p = createCnd_gi_lg_grp_cd_ListPutter(Cnd_gi_lg_grp_cd, "gi_lg_grp_cd", "gi_lg_grp_nm");

		}
		return Cnd_gi_lg_grp_cd_p;
	}
	
	
	/** [Cnd_gr_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_loc_cd_p = null;

	/**
	 * [Cnd_gr_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_loc_cd_ListPutter() {
		if (Cnd_gr_loc_cd_p == null) {
			Cnd_gr_loc_cd_p = createCnd_gr_loc_cd_ListPutter(Cnd_gr_loc_cd, "gr_loc_cd", "gr_loc_nm");

		}
		return Cnd_gr_loc_cd_p;
	}
	
	
	/** [Cnd_gr_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_str_ln_cd_p = null;

	/**
	 * [Cnd_gr_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_str_ln_cd_ListPutter() {
		if (Cnd_gr_str_ln_cd_p == null) {
			Cnd_gr_str_ln_cd_p = createCnd_gr_str_ln_cd_ListPutter(Cnd_gr_str_ln_cd, "gr_str_ln_cd", "gr_str_ln_nm");

		}
		return Cnd_gr_str_ln_cd_p;
	}
	
	
	/** [Cnd_gr_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_site_cd_p = null;

	/**
	 * [Cnd_gr_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_site_cd_ListPutter() {
		if (Cnd_gr_site_cd_p == null) {
			Cnd_gr_site_cd_p = createCnd_gr_site_cd_ListPutter(Cnd_gr_site_cd, "gr_site_cd", "gr_site_nm");

		}
		return Cnd_gr_site_cd_p;
	}
	
	
	/** [Cnd_gr_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_wg_cd_p = null;

	/**
	 * [Cnd_gr_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_wg_cd_ListPutter() {
		if (Cnd_gr_wg_cd_p == null) {
			Cnd_gr_wg_cd_p = createCnd_gr_wg_cd_ListPutter(Cnd_gr_wg_cd, "gr_wg_cd", "gr_wg_nm");

		}
		return Cnd_gr_wg_cd_p;
	}
	
	
	/** [Cnd_gr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_lg_grp_cd_p = null;

	/**
	 * [Cnd_gr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_lg_grp_cd_ListPutter() {
		if (Cnd_gr_lg_grp_cd_p == null) {
			Cnd_gr_lg_grp_cd_p = createCnd_gr_lg_grp_cd_ListPutter(Cnd_gr_lg_grp_cd, "gr_lg_grp_cd", "gr_lg_grp_nm");

		}
		return Cnd_gr_lg_grp_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","def_ver_flg");
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
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","def_ver_flg");
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
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","def_ver_flg");
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
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm","def_ver_flg");
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
	
	
	/** [Cnd_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_unit_cd_p = null;

	/**
	 * [Cnd_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_unit_cd_ListPutter() {
		if (Cnd_trd_unit_cd_p == null) {
			Cnd_trd_unit_cd_p = createCnd_trd_unit_cd_ListPutter(Cnd_trd_unit_cd, "trd_unit_cd", "trd_unit_nm");

		}
		return Cnd_trd_unit_cd_p;
	}
	
	
	/** [Cnd_base_unit_cd_ListPutter]の定義 */
	private MCListPutter Cnd_base_unit_cd_p = null;

	/**
	 * [Cnd_base_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_base_unit_cd_ListPutter() {
		if (Cnd_base_unit_cd_p == null) {
			Cnd_base_unit_cd_p = createCnd_base_unit_cd_ListPutter(Cnd_base_unit_cd, "base_unit_cd", "base_unit_nm");

		}
		return Cnd_base_unit_cd_p;
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
	
	
	/** [Cnd_quality_typ_ListPutter]の定義 */
	private MCListPutter Cnd_quality_typ_p = null;

	/**
	 * [Cnd_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_quality_typ_ListPutter() {
		if (Cnd_quality_typ_p == null) {
			Cnd_quality_typ_p = createCnd_quality_typ_ListPutter(Cnd_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Cnd_quality_typ_p;
	}
	
	
	/** [Cnd_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_stk_id_typ_p = null;

	/**
	 * [Cnd_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_id_typ_ListPutter() {
		if (Cnd_stk_id_typ_p == null) {
			Cnd_stk_id_typ_p = createCnd_stk_id_typ_ListPutter(Cnd_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return Cnd_stk_id_typ_p;
	}
	
	
	/** [Cnd_stk_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_stk_bp_cd_p = null;

	/**
	 * [Cnd_stk_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_bp_cd_ListPutter() {
		if (Cnd_stk_bp_cd_p == null) {
			Cnd_stk_bp_cd_p = createCnd_stk_bp_cd_ListPutter(Cnd_stk_bp_cd, "stk_bp_cd", "stk_bp_nm");

		}
		return Cnd_stk_bp_cd_p;
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
	
	
	/** [Cnd_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_term_cd_p = null;

	/**
	 * [Cnd_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_term_cd_ListPutter() {
		if (Cnd_ship_term_cd_p == null) {
			Cnd_ship_term_cd_p = createCnd_ship_term_cd_ListPutter(Cnd_ship_term_cd, "ship_term_cd", "ship_term_nm");

		}
		return Cnd_ship_term_cd_p;
	}
	
	
	/** [Cnd_ship_inst_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ship_inst_typ_p = null;

	/**
	 * [Cnd_ship_inst_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_inst_typ_ListPutter() {
		if (Cnd_ship_inst_typ_p == null) {
			Cnd_ship_inst_typ_p = createCnd_ship_inst_typ_ListPutter(Cnd_ship_inst_typ, "ship_inst_typ", "ship_inst_typ_nm");

		}
		return Cnd_ship_inst_typ_p;
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
	
	
	/** [Cnd_ship_to_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ship_to_id_typ_p = null;

	/**
	 * [Cnd_ship_to_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_to_id_typ_ListPutter() {
		if (Cnd_ship_to_id_typ_p == null) {
			Cnd_ship_to_id_typ_p = createCnd_ship_to_id_typ_ListPutter(Cnd_ship_to_id_typ, "ship_to_id_typ", "ship_to_id_typ_nm");

		}
		return Cnd_ship_to_id_typ_p;
	}
	
	
	/** [Cnd_ship_to_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_to_id_cd_p = null;

	/**
	 * [Cnd_ship_to_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_to_id_cd_ListPutter() {
		if (Cnd_ship_to_id_cd_p == null) {
			Cnd_ship_to_id_cd_p = createCnd_ship_to_id_cd_ListPutter(Cnd_ship_to_id_cd, "ship_to_id_cd", "ship_to_id_nm");

		}
		return Cnd_ship_to_id_cd_p;
	}
	
	
	/** [Cnd_prov_typ_ListPutter]の定義 */
	private MCListPutter Cnd_prov_typ_p = null;

	/**
	 * [Cnd_prov_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prov_typ_ListPutter() {
		if (Cnd_prov_typ_p == null) {
			Cnd_prov_typ_p = createCnd_prov_typ_ListPutter(Cnd_prov_typ, "prov_typ", "prov_typ_nm");

		}
		return Cnd_prov_typ_p;
	}
	
	
	/** [Cnd_prov_basis_typ_ListPutter]の定義 */
	private MCListPutter Cnd_prov_basis_typ_p = null;

	/**
	 * [Cnd_prov_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prov_basis_typ_ListPutter() {
		if (Cnd_prov_basis_typ_p == null) {
			Cnd_prov_basis_typ_p = createCnd_prov_basis_typ_ListPutter(Cnd_prov_basis_typ, "prov_basis_typ", "prov_basis_typ_nm");

		}
		return Cnd_prov_basis_typ_p;
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
			Cnd_tax_cd_p = createCnd_tax_cd_ListPutter(Cnd_tax_cd, "tax_cd", "tax_nm","tax_typ");

		}
		return Cnd_tax_cd_p;
	}
	
	
	/** [Cnd_tax_typ_ListPutter]の定義 */
	private MCListPutter Cnd_tax_typ_p = null;

	/**
	 * [Cnd_tax_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tax_typ_ListPutter() {
		if (Cnd_tax_typ_p == null) {
			Cnd_tax_typ_p = createCnd_tax_typ_ListPutter(Cnd_tax_typ, "tax_typ", "tax_typ_nm");

		}
		return Cnd_tax_typ_p;
	}
	
	
	/** [Cnd_ptax_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ptax_cur_cd_p = null;

	/**
	 * [Cnd_ptax_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ptax_cur_cd_ListPutter() {
		if (Cnd_ptax_cur_cd_p == null) {
			Cnd_ptax_cur_cd_p = createCnd_ptax_cur_cd_ListPutter(Cnd_ptax_cur_cd, "ptax_cur_cd", "ptax_cur_nm");

		}
		return Cnd_ptax_cur_cd_p;
	}
	
	
	/** [Cnd_ret_prov_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ret_prov_typ_p = null;

	/**
	 * [Cnd_ret_prov_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ret_prov_typ_ListPutter() {
		if (Cnd_ret_prov_typ_p == null) {
			Cnd_ret_prov_typ_p = createCnd_ret_prov_typ_ListPutter(Cnd_ret_prov_typ, "ret_prov_typ", "ret_prov_typ_nm");

		}
		return Cnd_ret_prov_typ_p;
	}
	
	
	/** [Cnd_ret_prov_basis_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ret_prov_basis_typ_p = null;

	/**
	 * [Cnd_ret_prov_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ret_prov_basis_typ_ListPutter() {
		if (Cnd_ret_prov_basis_typ_p == null) {
			Cnd_ret_prov_basis_typ_p = createCnd_ret_prov_basis_typ_ListPutter(Cnd_ret_prov_basis_typ, "ret_prov_basis_typ", "ret_prov_basis_typ_nm");

		}
		return Cnd_ret_prov_basis_typ_p;
	}
	
	
	/** [Cnd_ret_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ret_trd_cur_cd_p = null;

	/**
	 * [Cnd_ret_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ret_trd_cur_cd_ListPutter() {
		if (Cnd_ret_trd_cur_cd_p == null) {
			Cnd_ret_trd_cur_cd_p = createCnd_ret_trd_cur_cd_ListPutter(Cnd_ret_trd_cur_cd, "ret_trd_cur_cd", "ret_trd_cur_nm");

		}
		return Cnd_ret_trd_cur_cd_p;
	}
	
	
	/** [Cnd_ret_tax_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ret_tax_cd_p = null;

	/**
	 * [Cnd_ret_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ret_tax_cd_ListPutter() {
		if (Cnd_ret_tax_cd_p == null) {
			Cnd_ret_tax_cd_p = createCnd_ret_tax_cd_ListPutter(Cnd_ret_tax_cd, "ret_tax_cd", "ret_tax_nm","ret_tax_typ");

		}
		return Cnd_ret_tax_cd_p;
	}
	
	
	/** [Cnd_ret_tax_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ret_tax_typ_p = null;

	/**
	 * [Cnd_ret_tax_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ret_tax_typ_ListPutter() {
		if (Cnd_ret_tax_typ_p == null) {
			Cnd_ret_tax_typ_p = createCnd_ret_tax_typ_ListPutter(Cnd_ret_tax_typ, "ret_tax_typ", "ret_tax_typ_nm");

		}
		return Cnd_ret_tax_typ_p;
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
	
	
	/** [Cnd_xfr_src_typ_ListPutter]の定義 */
	private MCListPutter Cnd_xfr_src_typ_p = null;

	/**
	 * [Cnd_xfr_src_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_xfr_src_typ_ListPutter() {
		if (Cnd_xfr_src_typ_p == null) {
			Cnd_xfr_src_typ_p = createCnd_xfr_src_typ_ListPutter(Cnd_xfr_src_typ, "xfr_src_typ", "xfr_src_typ_nm");

		}
		return Cnd_xfr_src_typ_p;
	}
	
	
	/** [Rslt_trd_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_cd_p = null;

	/**
	 * [Rslt_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_cd_ListPutter() {
		if (Rslt_trd_cd_p == null) {
			Rslt_trd_cd_p = createRslt_trd_cd_ListPutter(columnRslt_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ");

		}
		return Rslt_trd_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","asset_mng_typ","ver_flg","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","prov_upri_cng_flg","ship_inst_typ","ship_term_cd_inv","ship_term_cd");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","asset_mng_typ","ver_flg","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","prov_upri_cng_flg","ship_inst_typ","ship_term_cd_inv","ship_term_cd");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","asset_mng_typ","ver_flg","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","prov_upri_cng_flg","ship_inst_typ","ship_term_cd_inv","ship_term_cd");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","asset_mng_typ","ver_flg","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","prov_upri_cng_flg","ship_inst_typ","ship_term_cd_inv","ship_term_cd");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の定義 */
	private MCListPutter Rslt_lot_no_p_PPanel_columnLotNo_lot_no_p = null;

	/**
	 * [Rslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter() {
		if (Rslt_lot_no_p_PPanel_columnLotNo_lot_no_p == null) {
			Rslt_lot_no_p_PPanel_columnLotNo_lot_no_p = createRslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(Rslt_lot_no_p_PPanel.columnLotNo_lot_no, "lot_no", "sublot_no","ver_no","act_cont_fctr");
		}
		return Rslt_lot_no_p_PPanel_columnLotNo_lot_no_p;
	}
	
	
	/** [Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_p = null;

	/**
	 * [Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter() {
		if (Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_p == null) {
			Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_p = createRslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(Rslt_lot_no_p_PPanel.columnLotNo_sublot_no, "sublot_no", "ver_no","act_cont_fctr");
		}
		return Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_p;
	}
	
	
	/** [Rslt_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_unit_cd_p = null;

	/**
	 * [Rslt_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_unit_cd_ListPutter() {
		if (Rslt_trd_unit_cd_p == null) {
			Rslt_trd_unit_cd_p = createRslt_trd_unit_cd_ListPutter(columnRslt_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_dec_place","trd_unit_rnd_typ");

		}
		return Rslt_trd_unit_cd_p;
	}
	
	
	/** [Rslt_gi_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gi_loc_cd_p = null;

	/**
	 * [Rslt_gi_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gi_loc_cd_ListPutter() {
		if (Rslt_gi_loc_cd_p == null) {
			Rslt_gi_loc_cd_p = createRslt_gi_loc_cd_ListPutter(columnRslt_gi_loc_cd, "gi_loc_cd", "gi_loc_nm","gi_lg_grp_cd","gi_lg_grp_nm","gi_wg_cd","gi_wg_nm","gi_site_cd","gi_site_nm","gi_str_ln_tgt_flg","gi_sppl_cd");

		}
		return Rslt_gi_loc_cd_p;
	}
	
	
	/** [Rslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Rslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Rslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Rslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createRslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd, "gi_str_ln_cd", "gi_str_ln_nm");
		}
		return Rslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Rslt_gi_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gi_lg_grp_cd_p = null;

	/**
	 * [Rslt_gi_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gi_lg_grp_cd_ListPutter() {
		if (Rslt_gi_lg_grp_cd_p == null) {
			Rslt_gi_lg_grp_cd_p = createRslt_gi_lg_grp_cd_ListPutter(columnRslt_gi_lg_grp_cd, "gi_lg_grp_cd", "gi_lg_grp_nm","gi_wg_cd");

		}
		return Rslt_gi_lg_grp_cd_p;
	}
	
	
	/** [Rslt_gi_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gi_wg_cd_p = null;

	/**
	 * [Rslt_gi_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gi_wg_cd_ListPutter() {
		if (Rslt_gi_wg_cd_p == null) {
			Rslt_gi_wg_cd_p = createRslt_gi_wg_cd_ListPutter(columnRslt_gi_wg_cd, "gi_wg_cd", "gi_wg_nm");

		}
		return Rslt_gi_wg_cd_p;
	}
	
	
	/** [Rslt_gi_site_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gi_site_cd_p = null;

	/**
	 * [Rslt_gi_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gi_site_cd_ListPutter() {
		if (Rslt_gi_site_cd_p == null) {
			Rslt_gi_site_cd_p = createRslt_gi_site_cd_ListPutter(columnRslt_gi_site_cd, "gi_site_cd", "gi_site_nm");

		}
		return Rslt_gi_site_cd_p;
	}
	
	
	/** [Rslt_gr_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gr_loc_cd_p = null;

	/**
	 * [Rslt_gr_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gr_loc_cd_ListPutter() {
		if (Rslt_gr_loc_cd_p == null) {
			Rslt_gr_loc_cd_p = createRslt_gr_loc_cd_ListPutter(columnRslt_gr_loc_cd, "gr_loc_cd", "gr_loc_nm","gr_lg_grp_cd","gr_lg_grp_nm","gr_wg_cd","gr_wg_nm","gr_site_cd","gr_site_nm","gr_str_ln_tgt_flg","gr_sppl_cd","gr_str_ln_cd","gr_str_ln_cd_none_flg");

		}
		return Rslt_gr_loc_cd_p;
	}
	
	
	/** [Rslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Rslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Rslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Rslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createRslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd, "gr_str_ln_cd", "gr_str_ln_nm");
		}
		return Rslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Rslt_gr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gr_lg_grp_cd_p = null;

	/**
	 * [Rslt_gr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gr_lg_grp_cd_ListPutter() {
		if (Rslt_gr_lg_grp_cd_p == null) {
			Rslt_gr_lg_grp_cd_p = createRslt_gr_lg_grp_cd_ListPutter(columnRslt_gr_lg_grp_cd, "gr_lg_grp_cd", "gr_lg_grp_nm");

		}
		return Rslt_gr_lg_grp_cd_p;
	}
	
	
	/** [Rslt_gr_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gr_wg_cd_p = null;

	/**
	 * [Rslt_gr_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gr_wg_cd_ListPutter() {
		if (Rslt_gr_wg_cd_p == null) {
			Rslt_gr_wg_cd_p = createRslt_gr_wg_cd_ListPutter(columnRslt_gr_wg_cd, "gr_wg_cd", "gr_wg_nm");

		}
		return Rslt_gr_wg_cd_p;
	}
	
	
	/** [Rslt_gr_site_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gr_site_cd_p = null;

	/**
	 * [Rslt_gr_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gr_site_cd_ListPutter() {
		if (Rslt_gr_site_cd_p == null) {
			Rslt_gr_site_cd_p = createRslt_gr_site_cd_ListPutter(columnRslt_gr_site_cd, "gr_site_cd", "gr_site_nm");

		}
		return Rslt_gr_site_cd_p;
	}
	
	
	/** [Rslt_quality_typ_ListPutter]の定義 */
	private MCListPutter Rslt_quality_typ_p = null;

	/**
	 * [Rslt_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_quality_typ_ListPutter() {
		if (Rslt_quality_typ_p == null) {
			Rslt_quality_typ_p = createRslt_quality_typ_ListPutter(columnRslt_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Rslt_quality_typ_p;
	}
	
	
	/** [Rslt_gd_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gd_cd_p = null;

	/**
	 * [Rslt_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gd_cd_ListPutter() {
		if (Rslt_gd_cd_p == null) {
			Rslt_gd_cd_p = createRslt_gd_cd_ListPutter(columnRslt_gd_cd, "gd_cd", "gd_nm");

		}
		return Rslt_gd_cd_p;
	}
	
	
	/** [Rslt_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Rslt_stk_id_typ_p = null;

	/**
	 * [Rslt_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_stk_id_typ_ListPutter() {
		if (Rslt_stk_id_typ_p == null) {
			Rslt_stk_id_typ_p = createRslt_stk_id_typ_ListPutter(columnRslt_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return Rslt_stk_id_typ_p;
	}
	
	
	/** [Rslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_p = null;

	/**
	 * [Rslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_ListPutter() {
		if (Rslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_p == null) {
			Rslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_p = createRslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_ListPutter(Rslt_stk_bp_p_PPanel.columnStkBp_stk_bp_cd, "stk_bp_cd", "stk_bp_nm");
		}
		return Rslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_p;
	}
	
	
	/** [Rslt_gi_sppl_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gi_sppl_cd_p = null;

	/**
	 * [Rslt_gi_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gi_sppl_cd_ListPutter() {
		if (Rslt_gi_sppl_cd_p == null) {
			Rslt_gi_sppl_cd_p = createRslt_gi_sppl_cd_ListPutter(columnRslt_gi_sppl_cd, "gi_sppl_cd", "gi_subcon_flg","gi_onr_prsppl_flg","gi_cur_cd","gi_prov_upri_cng_flg","gi_prov_amt_rnd_typ","gi_prov_tax_rnd_typ");

		}
		return Rslt_gi_sppl_cd_p;
	}
	
	
	/** [Rslt_gi_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gi_stk_arrv_bp_cd_p = null;

	/**
	 * [Rslt_gi_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gi_stk_arrv_bp_cd_ListPutter() {
		if (Rslt_gi_stk_arrv_bp_cd_p == null) {
			Rslt_gi_stk_arrv_bp_cd_p = createRslt_gi_stk_arrv_bp_cd_ListPutter(columnRslt_gi_stk_arrv_bp_cd, "gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_nm");

		}
		return Rslt_gi_stk_arrv_bp_cd_p;
	}
	
	
	/** [Rslt_gr_sppl_cd_ListPutter]の定義 */
	private MCListPutter Rslt_gr_sppl_cd_p = null;

	/**
	 * [Rslt_gr_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_gr_sppl_cd_ListPutter() {
		if (Rslt_gr_sppl_cd_p == null) {
			Rslt_gr_sppl_cd_p = createRslt_gr_sppl_cd_ListPutter(columnRslt_gr_sppl_cd, "gr_sppl_cd", "gr_subcon_flg","gr_onr_prsppl_flg","gr_cur_cd","gr_prov_basis_typ","gr_prov_rcv_typ","gr_prov_upri_cng_flg","gr_prov_amt_rnd_typ","gr_prov_tax_rnd_typ");

		}
		return Rslt_gr_sppl_cd_p;
	}
	
	
	/** [Rslt_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ship_term_cd_p = null;

	/**
	 * [Rslt_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ship_term_cd_ListPutter() {
		if (Rslt_ship_term_cd_p == null) {
			Rslt_ship_term_cd_p = createRslt_ship_term_cd_ListPutter(columnRslt_ship_term_cd, "ship_term_cd", "ship_term_nm");

		}
		return Rslt_ship_term_cd_p;
	}
	
	
	/** [Rslt_ship_inst_typ_ListPutter]の定義 */
	private MCListPutter Rslt_ship_inst_typ_p = null;

	/**
	 * [Rslt_ship_inst_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ship_inst_typ_ListPutter() {
		if (Rslt_ship_inst_typ_p == null) {
			Rslt_ship_inst_typ_p = createRslt_ship_inst_typ_ListPutter(columnRslt_ship_inst_typ, "ship_inst_typ", "ship_inst_typ_nm");

		}
		return Rslt_ship_inst_typ_p;
	}
	
	
	/** [Rslt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_rsn_cd_p = null;

	/**
	 * [Rslt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_rsn_cd_ListPutter() {
		if (Rslt_rsn_cd_p == null) {
			Rslt_rsn_cd_p = createRslt_rsn_cd_ListPutter(columnRslt_rsn_cd, "rsn_cd", "rsn_nm","acxfr_gi_flg");

		}
		return Rslt_rsn_cd_p;
	}
	
	
	/** [Rslt_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_bd_dpt_cd_p = null;

	/**
	 * [Rslt_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_bd_dpt_cd_ListPutter() {
		if (Rslt_bd_dpt_cd_p == null) {
			Rslt_bd_dpt_cd_p = createRslt_bd_dpt_cd_ListPutter(columnRslt_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Rslt_bd_dpt_cd_p;
	}
	
	
	/** [Rslt_ship_to_id_typ_ListPutter]の定義 */
	private MCListPutter Rslt_ship_to_id_typ_p = null;

	/**
	 * [Rslt_ship_to_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ship_to_id_typ_ListPutter() {
		if (Rslt_ship_to_id_typ_p == null) {
			Rslt_ship_to_id_typ_p = createRslt_ship_to_id_typ_ListPutter(columnRslt_ship_to_id_typ, "ship_to_id_typ", "ship_to_id_typ_nm");

		}
		return Rslt_ship_to_id_typ_p;
	}
	
	
	/** [Rslt_ship_to_id_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ship_to_id_cd_p = null;

	/**
	 * [Rslt_ship_to_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ship_to_id_cd_ListPutter() {
		if (Rslt_ship_to_id_cd_p == null) {
			Rslt_ship_to_id_cd_p = createRslt_ship_to_id_cd_ListPutter(columnRslt_ship_to_id_cd, "ship_to_id_cd", "ship_to_id_nm","ship_to_zip_cd","ship_to_addr1","ship_to_addr2","ship_to_addr3","ship_to_addr4","ship_to_cntct_dpt","ship_to_cntct_psn","ship_to_tel","ship_to_fax","ship_to_sundry_flg","via_dlv_typ","cntry_cd","cntry_nm");

		}
		return Rslt_ship_to_id_cd_p;
	}
	
	
	/** [Rslt_via_dlv_typ_ListPutter]の定義 */
	private MCListPutter Rslt_via_dlv_typ_p = null;

	/**
	 * [Rslt_via_dlv_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_via_dlv_typ_ListPutter() {
		if (Rslt_via_dlv_typ_p == null) {
			Rslt_via_dlv_typ_p = createRslt_via_dlv_typ_ListPutter(columnRslt_via_dlv_typ, "via_dlv_typ", "via_dlv_typ_nm");

		}
		return Rslt_via_dlv_typ_p;
	}
	
	
	/** [Rslt_prov_typ_ListPutter]の定義 */
	private MCListPutter Rslt_prov_typ_p = null;

	/**
	 * [Rslt_prov_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_prov_typ_ListPutter() {
		if (Rslt_prov_typ_p == null) {
			Rslt_prov_typ_p = createRslt_prov_typ_ListPutter(columnRslt_prov_typ, "prov_typ", "prov_typ_nm");

		}
		return Rslt_prov_typ_p;
	}
	
	
	/** [Rslt_prov_basis_typ_ListPutter]の定義 */
	private MCListPutter Rslt_prov_basis_typ_p = null;

	/**
	 * [Rslt_prov_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_prov_basis_typ_ListPutter() {
		if (Rslt_prov_basis_typ_p == null) {
			Rslt_prov_basis_typ_p = createRslt_prov_basis_typ_ListPutter(columnRslt_prov_basis_typ, "prov_basis_typ", "prov_basis_typ_nm");

		}
		return Rslt_prov_basis_typ_p;
	}
	
	
	/** [Rslt_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_cur_cd_p = null;

	/**
	 * [Rslt_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_cur_cd_ListPutter() {
		if (Rslt_trd_cur_cd_p == null) {
			Rslt_trd_cur_cd_p = createRslt_trd_cur_cd_ListPutter(columnRslt_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","trd_cur_amt_dec_place","trd_cur_upri_dec_place");

		}
		return Rslt_trd_cur_cd_p;
	}
	
	
	/** [Rslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Rslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Rslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Rslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Rslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = createRslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_rate","tax_typ","inc_tax_flg");
		}
		return Rslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Rslt_base_cur_cd_ListPutter]の定義 */
	private MCListPutter Rslt_base_cur_cd_p = null;

	/**
	 * [Rslt_base_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_base_cur_cd_ListPutter() {
		if (Rslt_base_cur_cd_p == null) {
			Rslt_base_cur_cd_p = createRslt_base_cur_cd_ListPutter(columnRslt_base_cur_cd, "base_cur_cd", "base_cur_nm","base_cur_amt_dec_place");

		}
		return Rslt_base_cur_cd_p;
	}
	
	
	/** [Rslt_ptax_cur_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ptax_cur_cd_p = null;

	/**
	 * [Rslt_ptax_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ptax_cur_cd_ListPutter() {
		if (Rslt_ptax_cur_cd_p == null) {
			Rslt_ptax_cur_cd_p = createRslt_ptax_cur_cd_ListPutter(columnRslt_ptax_cur_cd, "ptax_cur_cd", "ptax_cur_nm","ptax_cur_amt_dec_place");

		}
		return Rslt_ptax_cur_cd_p;
	}
	
	
	/** [Rslt_ret_prov_typ_ListPutter]の定義 */
	private MCListPutter Rslt_ret_prov_typ_p = null;

	/**
	 * [Rslt_ret_prov_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ret_prov_typ_ListPutter() {
		if (Rslt_ret_prov_typ_p == null) {
			Rslt_ret_prov_typ_p = createRslt_ret_prov_typ_ListPutter(columnRslt_ret_prov_typ, "ret_prov_typ", "ret_prov_typ_nm");

		}
		return Rslt_ret_prov_typ_p;
	}
	
	
	/** [Rslt_ret_prov_basis_typ_ListPutter]の定義 */
	private MCListPutter Rslt_ret_prov_basis_typ_p = null;

	/**
	 * [Rslt_ret_prov_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ret_prov_basis_typ_ListPutter() {
		if (Rslt_ret_prov_basis_typ_p == null) {
			Rslt_ret_prov_basis_typ_p = createRslt_ret_prov_basis_typ_ListPutter(columnRslt_ret_prov_basis_typ, "ret_prov_basis_typ", "ret_prov_basis_typ_nm");

		}
		return Rslt_ret_prov_basis_typ_p;
	}
	
	
	/** [Rslt_ret_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ret_trd_cur_cd_p = null;

	/**
	 * [Rslt_ret_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ret_trd_cur_cd_ListPutter() {
		if (Rslt_ret_trd_cur_cd_p == null) {
			Rslt_ret_trd_cur_cd_p = createRslt_ret_trd_cur_cd_ListPutter(columnRslt_ret_trd_cur_cd, "ret_trd_cur_cd", "ret_trd_cur_nm","ret_trd_cur_amt_dec_place","ret_trd_cur_upri_dec_place");

		}
		return Rslt_ret_trd_cur_cd_p;
	}
	
	
	/** [Rslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Rslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Rslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Rslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = createRslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd, "ret_tax_cd", "ret_tax_nm","ret_tax_rate","ret_tax_typ");
		}
		return Rslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Rslt_xfr_src_typ_ListPutter]の定義 */
	private MCListPutter Rslt_xfr_src_typ_p = null;

	/**
	 * [Rslt_xfr_src_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_xfr_src_typ_ListPutter() {
		if (Rslt_xfr_src_typ_p == null) {
			Rslt_xfr_src_typ_p = createRslt_xfr_src_typ_ListPutter(columnRslt_xfr_src_typ, "xfr_src_typ", "xfr_src_typ_nm");

		}
		return Rslt_xfr_src_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_XfrSchdReg create(){
		MSBEP_XfrSchdReg p = new MSBEP_XfrSchdReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_XfrSchdReg create(String name){
		MSBEP_XfrSchdReg p = new MSBEP_XfrSchdReg(name);
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
		MSBEP_XfrSchdReg_MC.jbfInitScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitTop((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitFold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitTab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitRqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitRqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitTab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitCtrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitRPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitBulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitRslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitBtn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbfInitEastBtn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitTop((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitFold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitTab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitRqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitRqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitTab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitCtrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitRPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitBulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitRslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitBtn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.jbInitEastBtn((MSBEP_XfrSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_XfrSchdReg p) {
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
	protected static void jbfInitTab1(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [RqstMod]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRqstMod(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.RqstModPanel = p.beansFactory.createPanel("RqstMod");
		p.RqstModTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RqstCan]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRqstCan(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.RqstCanPanel = p.beansFactory.createPanel("RqstCan");
		p.RqstCanTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_REQ_MOD = p.beansFactory.createRadioButton("Cnd.ope_REQ_MOD");
		p.Cnd_rqst_mod_t_flg = p.beansFactory.createCheckBox("Cnd.rqst_mod_t_flg");
		p.Cnd_rqst_mod_f_flg = p.beansFactory.createCheckBox("Cnd.rqst_mod_f_flg");
		p.Cnd_rqst_can_t_flg = p.beansFactory.createCheckBox("Cnd.rqst_can_t_flg");
		p.Cnd_rqst_can_f_flg = p.beansFactory.createCheckBox("Cnd.rqst_can_f_flg");
		p.Cnd_rcpt_dt_fr_Label = p.beansFactory.createLabel("Cnd.rcpt_dt_fr_Label");
		p.Cnd_rcpt_dt_fr = p.beansFactory.createDateField("Cnd.rcpt_dt_fr");
		p.Cnd_rcpt_dt_fr.setLabel(p.Cnd_rcpt_dt_fr_Label);
		p.Cnd_rcpt_dt_to_Label = p.beansFactory.createLabel("Cnd.rcpt_dt_to_Label");
		p.Cnd_rcpt_dt_to = p.beansFactory.createDateField("Cnd.rcpt_dt_to");
		p.Cnd_rcpt_dt_to.setLabel(p.Cnd_rcpt_dt_to_Label);
		p.Cnd_inst_inc_flg = p.beansFactory.createCheckBox("Cnd.inst_inc_flg");
		p.Cnd_gi_loc_cd_Label = p.beansFactory.createLabel("Cnd.gi_loc_cd_Label");
		p.Cnd_gi_loc_cd = p.beansFactory.createTextField("Cnd.gi_loc_cd");
		p.Cnd_gi_loc_cd.setLabel(p.Cnd_gi_loc_cd_Label);
		p.Cnd_gi_loc_nm = p.beansFactory.createTextField("Cnd.gi_loc_nm");
		p.Cnd_gi_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.gi_str_ln_cd_Label");
		p.Cnd_gi_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.gi_str_ln_cd");
		p.Cnd_gi_str_ln_cd.setLabel(p.Cnd_gi_str_ln_cd_Label);
		p.Cnd_gi_str_ln_nm = p.beansFactory.createTextField("Cnd.gi_str_ln_nm");
		p.Cnd_gi_stk_arrv_bp_cd_Label = p.beansFactory.createLabel("Cnd.gi_stk_arrv_bp_cd_Label");
		p.Cnd_gi_stk_arrv_bp_cd = p.beansFactory.createTextField("Cnd.gi_stk_arrv_bp_cd");
		p.Cnd_gi_stk_arrv_bp_cd.setLabel(p.Cnd_gi_stk_arrv_bp_cd_Label);
		p.Cnd_gi_stk_arrv_bp_nm = p.beansFactory.createTextField("Cnd.gi_stk_arrv_bp_nm");
		p.Cnd_gi_site_cd_Label = p.beansFactory.createLabel("Cnd.gi_site_cd_Label");
		p.Cnd_gi_site_cd = p.beansFactory.createTextComboBox("Cnd.gi_site_cd");
		p.Cnd_gi_site_cd.setLabel(p.Cnd_gi_site_cd_Label);
		p.Cnd_gi_site_nm = p.beansFactory.createTextField("Cnd.gi_site_nm");
		p.Cnd_gi_wg_cd_Label = p.beansFactory.createLabel("Cnd.gi_wg_cd_Label");
		p.Cnd_gi_wg_cd = p.beansFactory.createTextComboBox("Cnd.gi_wg_cd");
		p.Cnd_gi_wg_cd.setLabel(p.Cnd_gi_wg_cd_Label);
		p.Cnd_gi_wg_nm = p.beansFactory.createTextField("Cnd.gi_wg_nm");
		p.Cnd_gi_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.gi_lg_grp_cd_Label");
		p.Cnd_gi_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.gi_lg_grp_cd");
		p.Cnd_gi_lg_grp_cd.setLabel(p.Cnd_gi_lg_grp_cd_Label);
		p.Cnd_gi_lg_grp_nm = p.beansFactory.createTextField("Cnd.gi_lg_grp_nm");
		p.Cnd_gr_loc_cd_Label = p.beansFactory.createLabel("Cnd.gr_loc_cd_Label");
		p.Cnd_gr_loc_cd = p.beansFactory.createTextField("Cnd.gr_loc_cd");
		p.Cnd_gr_loc_cd.setLabel(p.Cnd_gr_loc_cd_Label);
		p.Cnd_gr_loc_nm = p.beansFactory.createTextField("Cnd.gr_loc_nm");
		p.Cnd_gr_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.gr_str_ln_cd_Label");
		p.Cnd_gr_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.gr_str_ln_cd");
		p.Cnd_gr_str_ln_cd.setLabel(p.Cnd_gr_str_ln_cd_Label);
		p.Cnd_gr_str_ln_nm = p.beansFactory.createTextField("Cnd.gr_str_ln_nm");
		p.Cnd_gr_site_cd_Label = p.beansFactory.createLabel("Cnd.gr_site_cd_Label");
		p.Cnd_gr_site_cd = p.beansFactory.createTextComboBox("Cnd.gr_site_cd");
		p.Cnd_gr_site_cd.setLabel(p.Cnd_gr_site_cd_Label);
		p.Cnd_gr_site_nm = p.beansFactory.createTextField("Cnd.gr_site_nm");
		p.Cnd_gr_wg_cd_Label = p.beansFactory.createLabel("Cnd.gr_wg_cd_Label");
		p.Cnd_gr_wg_cd = p.beansFactory.createTextComboBox("Cnd.gr_wg_cd");
		p.Cnd_gr_wg_cd.setLabel(p.Cnd_gr_wg_cd_Label);
		p.Cnd_gr_wg_nm = p.beansFactory.createTextField("Cnd.gr_wg_nm");
		p.Cnd_gr_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.gr_lg_grp_cd_Label");
		p.Cnd_gr_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.gr_lg_grp_cd");
		p.Cnd_gr_lg_grp_cd.setLabel(p.Cnd_gr_lg_grp_cd_Label);
		p.Cnd_gr_lg_grp_nm = p.beansFactory.createTextField("Cnd.gr_lg_grp_nm");
		p.Cnd_def_ver_flg = p.beansFactory.createCheckBox("Cnd.def_ver_flg");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_trd_unit_cd_Label = p.beansFactory.createLabel("Cnd.trd_unit_cd_Label");
		p.Cnd_trd_unit_cd = p.beansFactory.createTextComboBox("Cnd.trd_unit_cd");
		p.Cnd_trd_unit_cd.setLabel(p.Cnd_trd_unit_cd_Label);
		p.Cnd_trd_unit_nm = p.beansFactory.createTextField("Cnd.trd_unit_nm");
		p.Cnd_base_unit_cd_Label = p.beansFactory.createLabel("Cnd.base_unit_cd_Label");
		p.Cnd_base_unit_cd = p.beansFactory.createTextComboBox("Cnd.base_unit_cd");
		p.Cnd_base_unit_cd.setLabel(p.Cnd_base_unit_cd_Label);
		p.Cnd_base_unit_nm = p.beansFactory.createTextField("Cnd.base_unit_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_quality_typ_Label = p.beansFactory.createLabel("Cnd.quality_typ_Label");
		p.Cnd_quality_typ = p.beansFactory.createTextComboBox("Cnd.quality_typ");
		p.Cnd_quality_typ.setLabel(p.Cnd_quality_typ_Label);
		p.Cnd_quality_typ_nm = p.beansFactory.createTextField("Cnd.quality_typ_nm");
		p.Cnd_stk_id_typ_Label = p.beansFactory.createLabel("Cnd.stk_id_typ_Label");
		p.Cnd_stk_id_typ = p.beansFactory.createTextComboBox("Cnd.stk_id_typ");
		p.Cnd_stk_id_typ.setLabel(p.Cnd_stk_id_typ_Label);
		p.Cnd_stk_id_typ_nm = p.beansFactory.createTextField("Cnd.stk_id_typ_nm");
		p.Cnd_stk_bp_cd_Label = p.beansFactory.createLabel("Cnd.stk_bp_cd_Label");
		p.Cnd_stk_bp_cd = p.beansFactory.createTextField("Cnd.stk_bp_cd");
		p.Cnd_stk_bp_cd.setLabel(p.Cnd_stk_bp_cd_Label);
		p.Cnd_stk_bp_nm = p.beansFactory.createTextField("Cnd.stk_bp_nm");
		p.Cnd_rqst_usr_cd_Label = p.beansFactory.createLabel("Cnd.rqst_usr_cd_Label");
		p.Cnd_rqst_usr_cd = p.beansFactory.createTextField("Cnd.rqst_usr_cd");
		p.Cnd_rqst_usr_cd.setLabel(p.Cnd_rqst_usr_cd_Label);
		p.Cnd_rqst_usr_nm = p.beansFactory.createTextField("Cnd.rqst_usr_nm");
		p.Cnd_rqst_dpt_cd_Label = p.beansFactory.createLabel("Cnd.rqst_dpt_cd_Label");
		p.Cnd_rqst_dpt_cd = p.beansFactory.createTextField("Cnd.rqst_dpt_cd");
		p.Cnd_rqst_dpt_cd.setLabel(p.Cnd_rqst_dpt_cd_Label);
		p.Cnd_rqst_dpt_nm = p.beansFactory.createTextField("Cnd.rqst_dpt_nm");
		p.Cnd_ship_term_cd_Label = p.beansFactory.createLabel("Cnd.ship_term_cd_Label");
		p.Cnd_ship_term_cd = p.beansFactory.createTextComboBox("Cnd.ship_term_cd");
		p.Cnd_ship_term_cd.setLabel(p.Cnd_ship_term_cd_Label);
		p.Cnd_ship_term_nm = p.beansFactory.createTextField("Cnd.ship_term_nm");
		p.Cnd_ship_inst_typ_Label = p.beansFactory.createLabel("Cnd.ship_inst_typ_Label");
		p.Cnd_ship_inst_typ = p.beansFactory.createTextComboBox("Cnd.ship_inst_typ");
		p.Cnd_ship_inst_typ.setLabel(p.Cnd_ship_inst_typ_Label);
		p.Cnd_ship_inst_typ_nm = p.beansFactory.createTextField("Cnd.ship_inst_typ_nm");
		p.Cnd_rsn_cd_Label = p.beansFactory.createLabel("Cnd.rsn_cd_Label");
		p.Cnd_rsn_cd = p.beansFactory.createTextComboBox("Cnd.rsn_cd");
		p.Cnd_rsn_cd.setLabel(p.Cnd_rsn_cd_Label);
		p.Cnd_rsn_nm = p.beansFactory.createTextField("Cnd.rsn_nm");
		p.Cnd_bd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bd_dpt_cd_Label");
		p.Cnd_bd_dpt_cd = p.beansFactory.createTextField("Cnd.bd_dpt_cd");
		p.Cnd_bd_dpt_cd.setLabel(p.Cnd_bd_dpt_cd_Label);
		p.Cnd_bd_dpt_nm = p.beansFactory.createTextField("Cnd.bd_dpt_nm");
		p.Cnd_ship_to_id_typ_Label = p.beansFactory.createLabel("Cnd.ship_to_id_typ_Label");
		p.Cnd_ship_to_id_typ = p.beansFactory.createTextComboBox("Cnd.ship_to_id_typ");
		p.Cnd_ship_to_id_typ.setLabel(p.Cnd_ship_to_id_typ_Label);
		p.Cnd_ship_to_id_typ_nm = p.beansFactory.createTextField("Cnd.ship_to_id_typ_nm");
		p.Cnd_ship_to_id_cd_Label = p.beansFactory.createLabel("Cnd.ship_to_id_cd_Label");
		p.Cnd_ship_to_id_cd = p.beansFactory.createTextField("Cnd.ship_to_id_cd");
		p.Cnd_ship_to_id_cd.setLabel(p.Cnd_ship_to_id_cd_Label);
		p.Cnd_ship_to_id_nm = p.beansFactory.createTextField("Cnd.ship_to_id_nm");
		p.Cnd_prov_typ_Label = p.beansFactory.createLabel("Cnd.prov_typ_Label");
		p.Cnd_prov_typ = p.beansFactory.createTextComboBox("Cnd.prov_typ");
		p.Cnd_prov_typ.setLabel(p.Cnd_prov_typ_Label);
		p.Cnd_prov_typ_nm = p.beansFactory.createTextField("Cnd.prov_typ_nm");
		p.Cnd_prov_basis_typ_Label = p.beansFactory.createLabel("Cnd.prov_basis_typ_Label");
		p.Cnd_prov_basis_typ = p.beansFactory.createTextComboBox("Cnd.prov_basis_typ");
		p.Cnd_prov_basis_typ.setLabel(p.Cnd_prov_basis_typ_Label);
		p.Cnd_prov_basis_typ_nm = p.beansFactory.createTextField("Cnd.prov_basis_typ_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_tax_cd_Label = p.beansFactory.createLabel("Cnd.tax_cd_Label");
		p.Cnd_tax_cd = p.beansFactory.createTextComboBox("Cnd.tax_cd");
		p.Cnd_tax_cd.setLabel(p.Cnd_tax_cd_Label);
		p.Cnd_tax_nm = p.beansFactory.createTextField("Cnd.tax_nm");
		p.Cnd_tax_typ_Label = p.beansFactory.createLabel("Cnd.tax_typ_Label");
		p.Cnd_tax_typ = p.beansFactory.createTextComboBox("Cnd.tax_typ");
		p.Cnd_tax_typ.setLabel(p.Cnd_tax_typ_Label);
		p.Cnd_tax_typ_nm = p.beansFactory.createTextField("Cnd.tax_typ_nm");
		p.Cnd_ptax_cur_cd_Label = p.beansFactory.createLabel("Cnd.ptax_cur_cd_Label");
		p.Cnd_ptax_cur_cd = p.beansFactory.createTextComboBox("Cnd.ptax_cur_cd");
		p.Cnd_ptax_cur_cd.setLabel(p.Cnd_ptax_cur_cd_Label);
		p.Cnd_ptax_cur_nm = p.beansFactory.createTextField("Cnd.ptax_cur_nm");
		p.Cnd_ret_prov_typ_Label = p.beansFactory.createLabel("Cnd.ret_prov_typ_Label");
		p.Cnd_ret_prov_typ = p.beansFactory.createTextComboBox("Cnd.ret_prov_typ");
		p.Cnd_ret_prov_typ.setLabel(p.Cnd_ret_prov_typ_Label);
		p.Cnd_ret_prov_typ_nm = p.beansFactory.createTextField("Cnd.ret_prov_typ_nm");
		p.Cnd_ret_prov_basis_typ_Label = p.beansFactory.createLabel("Cnd.ret_prov_basis_typ_Label");
		p.Cnd_ret_prov_basis_typ = p.beansFactory.createTextComboBox("Cnd.ret_prov_basis_typ");
		p.Cnd_ret_prov_basis_typ.setLabel(p.Cnd_ret_prov_basis_typ_Label);
		p.Cnd_ret_prov_basis_typ_nm = p.beansFactory.createTextField("Cnd.ret_prov_basis_typ_nm");
		p.Cnd_ret_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.ret_trd_cur_cd_Label");
		p.Cnd_ret_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.ret_trd_cur_cd");
		p.Cnd_ret_trd_cur_cd.setLabel(p.Cnd_ret_trd_cur_cd_Label);
		p.Cnd_ret_trd_cur_nm = p.beansFactory.createTextField("Cnd.ret_trd_cur_nm");
		p.Cnd_ret_tax_cd_Label = p.beansFactory.createLabel("Cnd.ret_tax_cd_Label");
		p.Cnd_ret_tax_cd = p.beansFactory.createTextComboBox("Cnd.ret_tax_cd");
		p.Cnd_ret_tax_cd.setLabel(p.Cnd_ret_tax_cd_Label);
		p.Cnd_ret_tax_nm = p.beansFactory.createTextField("Cnd.ret_tax_nm");
		p.Cnd_ret_tax_typ_Label = p.beansFactory.createLabel("Cnd.ret_tax_typ_Label");
		p.Cnd_ret_tax_typ = p.beansFactory.createTextComboBox("Cnd.ret_tax_typ");
		p.Cnd_ret_tax_typ.setLabel(p.Cnd_ret_tax_typ_Label);
		p.Cnd_ret_tax_typ_nm = p.beansFactory.createTextField("Cnd.ret_tax_typ_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_rqst_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.rqst_cnt_rmrks_Label");
		p.Cnd_rqst_cnt_rmrks = p.beansFactory.createTextField("Cnd.rqst_cnt_rmrks");
		p.Cnd_rqst_cnt_rmrks.setLabel(p.Cnd_rqst_cnt_rmrks_Label);
		p.Cnd_ship_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.ship_cnt_rmrks_Label");
		p.Cnd_ship_cnt_rmrks = p.beansFactory.createTextField("Cnd.ship_cnt_rmrks");
		p.Cnd_ship_cnt_rmrks.setLabel(p.Cnd_ship_cnt_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_xfr_src_typ_Label = p.beansFactory.createLabel("Cnd.xfr_src_typ_Label");
		p.Cnd_xfr_src_typ = p.beansFactory.createTextComboBox("Cnd.xfr_src_typ");
		p.Cnd_xfr_src_typ.setLabel(p.Cnd_xfr_src_typ_Label);
		p.Cnd_xfr_src_typ_nm = p.beansFactory.createTextField("Cnd.xfr_src_typ_nm");
		p.Cnd_xfr_src_no_Label = p.beansFactory.createLabel("Cnd.xfr_src_no_Label");
		p.Cnd_xfr_src_no = p.beansFactory.createTextField("Cnd.xfr_src_no");
		p.Cnd_xfr_src_no.setLabel(p.Cnd_xfr_src_no_Label);
		p.Cnd_xfr_schd_no_Label = p.beansFactory.createLabel("Cnd.xfr_schd_no_Label");
		p.Cnd_xfr_schd_no = p.beansFactory.createTextField("Cnd.xfr_schd_no");
		p.Cnd_xfr_schd_no.setLabel(p.Cnd_xfr_schd_no_Label);
		p.Cnd_itm_ord_no_Label = p.beansFactory.createLabel("Cnd.itm_ord_no_Label");
		p.Cnd_itm_ord_no = p.beansFactory.createTextField("Cnd.itm_ord_no");
		p.Cnd_itm_ord_no.setLabel(p.Cnd_itm_ord_no_Label);
		p.Cnd_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.mfg_inst_no_Label");
		p.Cnd_mfg_inst_no = p.beansFactory.createTextField("Cnd.mfg_inst_no");
		p.Cnd_mfg_inst_no.setLabel(p.Cnd_mfg_inst_no_Label);
		p.Cnd_oper_inst_no_Label = p.beansFactory.createLabel("Cnd.oper_inst_no_Label");
		p.Cnd_oper_inst_no = p.beansFactory.createTextField("Cnd.oper_inst_no");
		p.Cnd_oper_inst_no.setLabel(p.Cnd_oper_inst_no_Label);
		p.Cnd_inpt_schd_no_Label = p.beansFactory.createLabel("Cnd.inpt_schd_no_Label");
		p.Cnd_inpt_schd_no = p.beansFactory.createTextField("Cnd.inpt_schd_no");
		p.Cnd_inpt_schd_no.setLabel(p.Cnd_inpt_schd_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_slo_d_no_Label = p.beansFactory.createLabel("Cnd.slo_d_no_Label");
		p.Cnd_slo_d_no = p.beansFactory.createTextField("Cnd.slo_d_no");
		p.Cnd_slo_d_no.setLabel(p.Cnd_slo_d_no_Label);
	}

	/**
	 * [ItmGrpCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrpCnd(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.ItmGrpCndPanel = p.beansFactory.createPanel("ItmGrpCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_rcpt_dt_Label = p.beansFactory.createLabel("BulkSet.rcpt_dt_Label");
		p.BulkSet_rcpt_dt = p.beansFactory.createDateField("BulkSet.rcpt_dt");
		p.BulkSet_rcpt_dt.setLabel(p.BulkSet_rcpt_dt_Label);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_lot_mng_typ = p.beansFactory.createTableColumn("Rslt.lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ = p.beansFactory.createTableColumn("Rslt.asset_mng_typ", MCColumnType.TEXT);
		p.columnRslt_prov_upri_cng_flg = p.beansFactory.createTableColumn("Rslt.prov_upri_cng_flg", MCColumnType.CHECK);
		p.columnRslt_dscnt_itm_flg = p.beansFactory.createTableColumn("Rslt.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnRslt_alloc_flg = p.beansFactory.createTableColumn("Rslt.alloc_flg", MCColumnType.CHECK);
		p.columnRslt_lot_none_flg = p.beansFactory.createTableColumn("Rslt.lot_none_flg", MCColumnType.CHECK);
		p.columnRslt_ver_flg = p.beansFactory.createTableColumn("Rslt.ver_flg", MCColumnType.CHECK);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_gi_loc_cd = p.beansFactory.createTableColumn("Rslt.gi_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gi_loc_nm = p.beansFactory.createTableColumn("Rslt.gi_loc_nm", MCColumnType.TEXT);
		p.columnRslt_gi_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt.gi_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_gi_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.gi_lg_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gi_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.gi_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_gi_wg_cd = p.beansFactory.createTableColumn("Rslt.gi_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gi_wg_nm = p.beansFactory.createTableColumn("Rslt.gi_wg_nm", MCColumnType.TEXT);
		p.columnRslt_gi_site_cd = p.beansFactory.createTableColumn("Rslt.gi_site_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gi_site_nm = p.beansFactory.createTableColumn("Rslt.gi_site_nm", MCColumnType.TEXT);
		p.columnRslt_gr_loc_cd = p.beansFactory.createTableColumn("Rslt.gr_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gr_loc_nm = p.beansFactory.createTableColumn("Rslt.gr_loc_nm", MCColumnType.TEXT);
		p.columnRslt_gr_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt.gr_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_gr_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.gr_lg_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gr_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.gr_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_gr_wg_cd = p.beansFactory.createTableColumn("Rslt.gr_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gr_wg_nm = p.beansFactory.createTableColumn("Rslt.gr_wg_nm", MCColumnType.TEXT);
		p.columnRslt_gr_site_cd = p.beansFactory.createTableColumn("Rslt.gr_site_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gr_site_nm = p.beansFactory.createTableColumn("Rslt.gr_site_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_gi_sppl_cd = p.beansFactory.createTableColumn("Rslt.gi_sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gi_cur_cd = p.beansFactory.createTableColumn("Rslt.gi_cur_cd", MCColumnType.TEXT);
		p.columnRslt_gi_subcon_flg = p.beansFactory.createTableColumn("Rslt.gi_subcon_flg", MCColumnType.CHECK);
		p.columnRslt_gi_onr_prsppl_flg = p.beansFactory.createTableColumn("Rslt.gi_onr_prsppl_flg", MCColumnType.CHECK);
		p.columnRslt_gi_prov_upri_cng_flg = p.beansFactory.createTableColumn("Rslt.gi_prov_upri_cng_flg", MCColumnType.CHECK);
		p.columnRslt_gi_prov_amt_rnd_typ = p.beansFactory.createTableColumn("Rslt.gi_prov_amt_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_gi_prov_tax_rnd_typ = p.beansFactory.createTableColumn("Rslt.gi_prov_tax_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_gi_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.gi_stk_arrv_bp_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gi_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Rslt.gi_stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRslt_gr_sppl_cd = p.beansFactory.createTableColumn("Rslt.gr_sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_gr_cur_cd = p.beansFactory.createTableColumn("Rslt.gr_cur_cd", MCColumnType.TEXT);
		p.columnRslt_gr_subcon_flg = p.beansFactory.createTableColumn("Rslt.gr_subcon_flg", MCColumnType.CHECK);
		p.columnRslt_gr_onr_prsppl_flg = p.beansFactory.createTableColumn("Rslt.gr_onr_prsppl_flg", MCColumnType.CHECK);
		p.columnRslt_gr_prov_rcv_typ = p.beansFactory.createTableColumn("Rslt.gr_prov_rcv_typ", MCColumnType.TEXT);
		p.columnRslt_gr_prov_basis_typ = p.beansFactory.createTableColumn("Rslt.gr_prov_basis_typ", MCColumnType.TEXT);
		p.columnRslt_gr_prov_upri_cng_flg = p.beansFactory.createTableColumn("Rslt.gr_prov_upri_cng_flg", MCColumnType.CHECK);
		p.columnRslt_gr_prov_amt_rnd_typ = p.beansFactory.createTableColumn("Rslt.gr_prov_amt_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_gr_prov_tax_rnd_typ = p.beansFactory.createTableColumn("Rslt.gr_prov_tax_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_rcpt_dt = p.beansFactory.createTableColumn("Rslt.rcpt_dt", MCColumnType.DATE);
		p.columnRslt_iv_trd_flg = p.beansFactory.createTableColumn("Rslt.iv_trd_flg", MCColumnType.CHECK);
		p.columnRslt_ship_schd_tm = p.beansFactory.createTableColumn("Rslt.ship_schd_tm", MCColumnType.DATE);
		p.columnRslt_dlv_schd_tm = p.beansFactory.createTableColumn("Rslt.dlv_schd_tm", MCColumnType.DATE);
		p.columnRslt_rqst_mod_flg = p.beansFactory.createTableColumn("Rslt.rqst_mod_flg", MCColumnType.CHECK);
		p.columnRslt_rqst_can_flg = p.beansFactory.createTableColumn("Rslt.rqst_can_flg", MCColumnType.CHECK);
		p.columnRslt_ship_term_cd = p.beansFactory.createTableColumn("Rslt.ship_term_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_ship_term_nm = p.beansFactory.createTableColumn("Rslt.ship_term_nm", MCColumnType.TEXT);
		p.columnRslt_ship_term_cd_inv = p.beansFactory.createTableColumn("Rslt.ship_term_cd_inv", MCColumnType.TEXT);
		p.columnRslt_ship_inst_typ = p.beansFactory.createTableColumn("Rslt.ship_inst_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_ship_inst_typ_nm = p.beansFactory.createTableColumn("Rslt.ship_inst_typ_nm", MCColumnType.TEXT);
		p.columnRslt_rsn_cd = p.beansFactory.createTableColumn("Rslt.rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_rsn_nm = p.beansFactory.createTableColumn("Rslt.rsn_nm", MCColumnType.TEXT);
		p.columnRslt_acxfr_gi_flg = p.beansFactory.createTableColumn("Rslt.acxfr_gi_flg", MCColumnType.CHECK);
		p.columnRslt_bd_dpt_cd = p.beansFactory.createTableColumn("Rslt.bd_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_bd_dpt_nm = p.beansFactory.createTableColumn("Rslt.bd_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ship_block_flg = p.beansFactory.createTableColumn("Rslt.ship_block_flg", MCColumnType.CHECK);
		p.columnRslt_ship_to_id_typ = p.beansFactory.createTableColumn("Rslt.ship_to_id_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_ship_to_id_typ_nm = p.beansFactory.createTableColumn("Rslt.ship_to_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_cd = p.beansFactory.createTableColumn("Rslt.ship_to_id_cd", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_nm = p.beansFactory.createTableColumn("Rslt.ship_to_id_nm", MCColumnType.TEXT);
		p.columnRslt_ship_to_sundry_flg = p.beansFactory.createTableColumn("Rslt.ship_to_sundry_flg", MCColumnType.CHECK);
		p.columnRslt_via_dlv_typ = p.beansFactory.createTableColumn("Rslt.via_dlv_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_via_dlv_typ_nm = p.beansFactory.createTableColumn("Rslt.via_dlv_typ_nm", MCColumnType.TEXT);
		p.columnRslt_prov_typ = p.beansFactory.createTableColumn("Rslt.prov_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_prov_typ_nm = p.beansFactory.createTableColumn("Rslt.prov_typ_nm", MCColumnType.TEXT);
		p.columnRslt_prov_basis_typ = p.beansFactory.createTableColumn("Rslt.prov_basis_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_prov_basis_typ_nm = p.beansFactory.createTableColumn("Rslt.prov_basis_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_prov_xrate_cd = p.beansFactory.createTableColumn("Rslt.prov_xrate_cd", MCColumnType.TEXT);
		p.columnRslt_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_ptax_cur_nm = p.beansFactory.createTableColumn("Rslt.ptax_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_wtax_rate = p.beansFactory.createTableColumn("Rslt.wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_ret_prov_typ = p.beansFactory.createTableColumn("Rslt.ret_prov_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_ret_prov_typ_nm = p.beansFactory.createTableColumn("Rslt.ret_prov_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ret_prov_basis_typ = p.beansFactory.createTableColumn("Rslt.ret_prov_basis_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_ret_prov_basis_typ_nm = p.beansFactory.createTableColumn("Rslt.ret_prov_basis_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ret_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.ret_trd_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_ret_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.ret_trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ret_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.ret_trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ret_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Rslt.ret_trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ret_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ret_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_ret_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ret_ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_ret_wtax_rate = p.beansFactory.createTableColumn("Rslt.ret_wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_base_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.base_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_base_prov_act_no = p.beansFactory.createTableColumn("Rslt.base_prov_act_no", MCColumnType.TEXT);
		p.columnRslt_base_ac_dt = p.beansFactory.createTableColumn("Rslt.base_ac_dt", MCColumnType.DATE);
		p.columnRslt_rqst_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.rqst_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_ship_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.ship_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_xfr_src_typ = p.beansFactory.createTableColumn("Rslt.xfr_src_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_xfr_src_typ_nm = p.beansFactory.createTableColumn("Rslt.xfr_src_typ_nm", MCColumnType.TEXT);
		p.columnRslt_xfr_src_no = p.beansFactory.createTableColumn("Rslt.xfr_src_no", MCColumnType.TEXT);
		p.columnRslt_xfr_schd_no = p.beansFactory.createTableColumn("Rslt.xfr_schd_no", MCColumnType.TEXT);
		p.columnRslt_itm_ord_no = p.beansFactory.createTableColumn("Rslt.itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_oper_inst_no = p.beansFactory.createTableColumn("Rslt.oper_inst_no", MCColumnType.TEXT);
		p.columnRslt_inpt_schd_no = p.beansFactory.createTableColumn("Rslt.inpt_schd_no", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_io_schd_pr_no = p.beansFactory.createTableColumn("Rslt.io_schd_pr_no", MCColumnType.TEXT);
		p.columnRslt_not_lot_mix_flg = p.beansFactory.createTableColumn("Rslt.not_lot_mix_flg", MCColumnType.CHECK);
		p.columnRslt_not_sublot_mix_flg = p.beansFactory.createTableColumn("Rslt.not_sublot_mix_flg", MCColumnType.CHECK);
		p.columnRslt_vld_dt_fr = p.beansFactory.createTableColumn("Rslt.vld_dt_fr", MCColumnType.DATE);
		p.columnRslt_vld_dt_to = p.beansFactory.createTableColumn("Rslt.vld_dt_to", MCColumnType.DATE);
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
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_dtl = p.beansFactory.createButton("Btn.open_dtl", "open");
		p.Btn_sprt_ac_dt = p.beansFactory.createButton("Btn.sprt_ac_dt");
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
	protected static void jbfInitEastBtn(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_XfrSchdReg p) {
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
	protected static void jbInitFold(MSBEP_XfrSchdReg p) {
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
	protected static void jbInitTab1(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.RqstModPanel, null);
		p.Tab1Panel.setLastBeans(p.RqstModPanel);
		p.RqstModPanel.setNextBeans(p.RqstCanPanel);
		p.Tab1Panel.add(p.RqstCanPanel, null);
		p.RqstCanPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [RqstMod]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRqstMod(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.RqstModPanel.setBorder(p.RqstModTitledBorder);
		p.RqstModPanel.setValueCheck(false);
		p.RqstModPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RqstModPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RqstCan]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRqstCan(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.RqstCanPanel.setBorder(p.RqstCanTitledBorder);
		p.RqstCanPanel.setValueCheck(false);
		p.RqstCanPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RqstCanPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ItmGrpCndPanel, null);
		p.Tab2Panel.setLastBeans(p.ItmGrpCndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_XfrSchdReg p) {
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
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_REQ_MOD);
		p.Cnd_ope_REQ_MOD.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REQ_MOD);
		p.ScreenOpePanel.add(p.Cnd_ope_REQ_MOD);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ope_META);
		p.RqstModPanel.add(p.Cnd_rqst_mod_t_flg);
		p.RqstModPanel.setLastBeans(p.Cnd_rqst_mod_t_flg);
		p.Cnd_rqst_mod_t_flg.setNextBeans(p.Cnd_rqst_mod_f_flg);
		p.Cnd_rqst_mod_t_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rqst_mod_t_flg_META);
		p.RqstModPanel.add(p.Cnd_rqst_mod_f_flg);
		p.Cnd_rqst_mod_f_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rqst_mod_f_flg_META);
		p.RqstCanPanel.add(p.Cnd_rqst_can_t_flg);
		p.RqstCanPanel.setLastBeans(p.Cnd_rqst_can_t_flg);
		p.Cnd_rqst_can_t_flg.setNextBeans(p.Cnd_rqst_can_f_flg);
		p.Cnd_rqst_can_t_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rqst_can_t_flg_META);
		p.RqstCanPanel.add(p.Cnd_rqst_can_f_flg);
		p.Cnd_rqst_can_f_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rqst_can_f_flg_META);
		p.CndPanel.add(p.Cnd_gi_rqst_tm_frto_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_gi_rqst_tm_frto_p_PPanel);
		p.Cnd_gi_rqst_tm_frto_p_PPanel.setNextBeans(p.Cnd_gr_rqst_tm_frto_p_PPanel);
		p.CndPanel.add(p.Cnd_gr_rqst_tm_frto_p_PPanel);
		p.Cnd_gr_rqst_tm_frto_p_PPanel.setNextBeans(p.Cnd_rcpt_dt_fr);
		p.CndPanel.add(p.Cnd_rcpt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rcpt_dt_fr);
		p.Cnd_rcpt_dt_fr.setNextBeans(p.Cnd_rcpt_dt_to);
		p.Cnd_rcpt_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rcpt_dt_fr_META);
		p.Cnd_rcpt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcpt_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcpt_dt_to);
		p.Cnd_rcpt_dt_to.setNextBeans(p.Cnd_inst_inc_flg);
		p.Cnd_rcpt_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rcpt_dt_to_META);
		p.Cnd_rcpt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_inst_inc_flg);
		p.Cnd_inst_inc_flg.setNextBeans(p.Cnd_gi_loc_cd);
		p.Cnd_inst_inc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.inst_inc_flg_META);
		p.CndPanel.add(p.Cnd_gi_loc_cd_Label);
		p.CndPanel.add(p.Cnd_gi_loc_cd);
		p.Cnd_gi_loc_cd.setNextBeans(p.Cnd_gi_loc_nm);
		p.Cnd_gi_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_loc_cd_META);
		p.Cnd_gi_loc_cd.addLinkBeans(p.Cnd_gi_loc_nm);
		p.Cnd_gi_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gi_loc_cd, true);
		p.CndPanel.add(p.Cnd_gi_loc_nm);
		p.Cnd_gi_loc_nm.setNextBeans(p.Cnd_gi_str_ln_cd);
		p.Cnd_gi_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_gi_loc_nm, true);
		p.Cnd_gi_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gi_str_ln_cd, true);
		p.Cnd_gi_str_ln_cd.setLinkBeans(p.Cnd_gi_str_ln_nm);
		p.CndPanel.add(p.Cnd_gi_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_gi_str_ln_cd);
		p.Cnd_gi_str_ln_cd.setNextBeans(p.Cnd_gi_str_ln_nm);
		p.Cnd_gi_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_gi_str_ln_nm);
		p.Cnd_gi_str_ln_nm.setNextBeans(p.Cnd_gi_stk_arrv_bp_cd);
		p.Cnd_gi_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_gi_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_gi_stk_arrv_bp_cd_Label);
		p.CndPanel.add(p.Cnd_gi_stk_arrv_bp_cd);
		p.Cnd_gi_stk_arrv_bp_cd.setNextBeans(p.Cnd_gi_stk_arrv_bp_nm);
		p.Cnd_gi_stk_arrv_bp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_stk_arrv_bp_cd_META);
		p.Cnd_gi_stk_arrv_bp_cd.addLinkBeans(p.Cnd_gi_stk_arrv_bp_nm);
		p.Cnd_gi_stk_arrv_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gi_stk_arrv_bp_cd, true);
		p.CndPanel.add(p.Cnd_gi_stk_arrv_bp_nm);
		p.Cnd_gi_stk_arrv_bp_nm.setNextBeans(p.Cnd_gi_site_cd);
		p.Cnd_gi_stk_arrv_bp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_stk_arrv_bp_nm_META);
		p.setPluralValueEnable(p.Cnd_gi_stk_arrv_bp_nm, true);
		p.Cnd_gi_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gi_site_cd, true);
		p.Cnd_gi_site_cd.setLinkBeans(p.Cnd_gi_site_nm);
		p.CndPanel.add(p.Cnd_gi_site_cd_Label);
		p.CndPanel.add(p.Cnd_gi_site_cd);
		p.Cnd_gi_site_cd.setNextBeans(p.Cnd_gi_site_nm);
		p.Cnd_gi_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_site_cd_META);
		p.CndPanel.add(p.Cnd_gi_site_nm);
		p.Cnd_gi_site_nm.setNextBeans(p.Cnd_gi_wg_cd);
		p.Cnd_gi_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_site_nm_META);
		p.setPluralValueEnable(p.Cnd_gi_site_nm, true);
		p.Cnd_gi_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gi_wg_cd, true);
		p.Cnd_gi_wg_cd.setLinkBeans(p.Cnd_gi_wg_nm);
		p.CndPanel.add(p.Cnd_gi_wg_cd_Label);
		p.CndPanel.add(p.Cnd_gi_wg_cd);
		p.Cnd_gi_wg_cd.setNextBeans(p.Cnd_gi_wg_nm);
		p.Cnd_gi_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_wg_cd_META);
		p.CndPanel.add(p.Cnd_gi_wg_nm);
		p.Cnd_gi_wg_nm.setNextBeans(p.Cnd_gi_lg_grp_cd);
		p.Cnd_gi_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_gi_wg_nm, true);
		p.Cnd_gi_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gi_lg_grp_cd, true);
		p.Cnd_gi_lg_grp_cd.setLinkBeans(p.Cnd_gi_lg_grp_nm);
		p.CndPanel.add(p.Cnd_gi_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_gi_lg_grp_cd);
		p.Cnd_gi_lg_grp_cd.setNextBeans(p.Cnd_gi_lg_grp_nm);
		p.Cnd_gi_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_gi_lg_grp_nm);
		p.Cnd_gi_lg_grp_nm.setNextBeans(p.Cnd_gr_loc_cd);
		p.Cnd_gi_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gi_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_gi_lg_grp_nm, true);
		p.CndPanel.add(p.Cnd_gr_loc_cd_Label);
		p.CndPanel.add(p.Cnd_gr_loc_cd);
		p.Cnd_gr_loc_cd.setNextBeans(p.Cnd_gr_loc_nm);
		p.Cnd_gr_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_loc_cd_META);
		p.Cnd_gr_loc_cd.addLinkBeans(p.Cnd_gr_loc_nm);
		p.Cnd_gr_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_loc_cd, true);
		p.CndPanel.add(p.Cnd_gr_loc_nm);
		p.Cnd_gr_loc_nm.setNextBeans(p.Cnd_gr_str_ln_cd);
		p.Cnd_gr_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_loc_nm, true);
		p.Cnd_gr_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_str_ln_cd, true);
		p.Cnd_gr_str_ln_cd.setLinkBeans(p.Cnd_gr_str_ln_nm);
		p.CndPanel.add(p.Cnd_gr_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_gr_str_ln_cd);
		p.Cnd_gr_str_ln_cd.setNextBeans(p.Cnd_gr_str_ln_nm);
		p.Cnd_gr_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_gr_str_ln_nm);
		p.Cnd_gr_str_ln_nm.setNextBeans(p.Cnd_gr_site_cd);
		p.Cnd_gr_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_str_ln_nm, true);
		p.Cnd_gr_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_site_cd, true);
		p.Cnd_gr_site_cd.setLinkBeans(p.Cnd_gr_site_nm);
		p.CndPanel.add(p.Cnd_gr_site_cd_Label);
		p.CndPanel.add(p.Cnd_gr_site_cd);
		p.Cnd_gr_site_cd.setNextBeans(p.Cnd_gr_site_nm);
		p.Cnd_gr_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_site_cd_META);
		p.CndPanel.add(p.Cnd_gr_site_nm);
		p.Cnd_gr_site_nm.setNextBeans(p.Cnd_gr_wg_cd);
		p.Cnd_gr_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_site_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_site_nm, true);
		p.Cnd_gr_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_wg_cd, true);
		p.Cnd_gr_wg_cd.setLinkBeans(p.Cnd_gr_wg_nm);
		p.CndPanel.add(p.Cnd_gr_wg_cd_Label);
		p.CndPanel.add(p.Cnd_gr_wg_cd);
		p.Cnd_gr_wg_cd.setNextBeans(p.Cnd_gr_wg_nm);
		p.Cnd_gr_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_wg_cd_META);
		p.CndPanel.add(p.Cnd_gr_wg_nm);
		p.Cnd_gr_wg_nm.setNextBeans(p.Cnd_gr_lg_grp_cd);
		p.Cnd_gr_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_wg_nm, true);
		p.Cnd_gr_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_lg_grp_cd, true);
		p.Cnd_gr_lg_grp_cd.setLinkBeans(p.Cnd_gr_lg_grp_nm);
		p.CndPanel.add(p.Cnd_gr_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_gr_lg_grp_cd);
		p.Cnd_gr_lg_grp_cd.setNextBeans(p.Cnd_gr_lg_grp_nm);
		p.Cnd_gr_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_gr_lg_grp_nm);
		p.Cnd_gr_lg_grp_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_gr_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gr_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_lg_grp_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_def_ver_flg);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_itm_nm,p.Cnd_def_ver_flg);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_itm_nm,p.Cnd_def_ver_flg);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_sub3,p.Cnd_itm_nm,p.Cnd_def_ver_flg);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm,p.Cnd_def_ver_flg);
		p.CndPanel.add(p.Cnd_def_ver_flg);
		p.Cnd_def_ver_flg.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_def_ver_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.def_ver_flg_META);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_trd_unit_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.Cnd_trd_unit_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_unit_cd, true);
		p.Cnd_trd_unit_cd.setLinkBeans(p.Cnd_trd_unit_nm);
		p.CndPanel.add(p.Cnd_trd_unit_cd_Label);
		p.CndPanel.add(p.Cnd_trd_unit_cd);
		p.Cnd_trd_unit_cd.setNextBeans(p.Cnd_trd_unit_nm);
		p.Cnd_trd_unit_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.trd_unit_cd_META);
		p.CndPanel.add(p.Cnd_trd_unit_nm);
		p.Cnd_trd_unit_nm.setNextBeans(p.Cnd_base_unit_cd);
		p.Cnd_trd_unit_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.trd_unit_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_unit_nm, true);
		p.Cnd_base_unit_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_base_unit_cd, true);
		p.Cnd_base_unit_cd.setLinkBeans(p.Cnd_base_unit_nm);
		p.CndPanel.add(p.Cnd_base_unit_cd_Label);
		p.CndPanel.add(p.Cnd_base_unit_cd);
		p.Cnd_base_unit_cd.setNextBeans(p.Cnd_base_unit_nm);
		p.Cnd_base_unit_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.base_unit_cd_META);
		p.CndPanel.add(p.Cnd_base_unit_nm);
		p.Cnd_base_unit_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_base_unit_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.base_unit_nm_META);
		p.setPluralValueEnable(p.Cnd_base_unit_nm, true);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_quality_typ);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.Cnd_quality_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_quality_typ, true);
		p.Cnd_quality_typ.setLinkBeans(p.Cnd_quality_typ_nm);
		p.CndPanel.add(p.Cnd_quality_typ_Label);
		p.CndPanel.add(p.Cnd_quality_typ);
		p.Cnd_quality_typ.setNextBeans(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.quality_typ_META);
		p.CndPanel.add(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ_nm.setNextBeans(p.Cnd_stk_id_typ);
		p.Cnd_quality_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.quality_typ_nm_META);
		p.Cnd_stk_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_id_typ, true);
		p.Cnd_stk_id_typ.setLinkBeans(p.Cnd_stk_id_typ_nm);
		p.CndPanel.add(p.Cnd_stk_id_typ_Label);
		p.CndPanel.add(p.Cnd_stk_id_typ);
		p.Cnd_stk_id_typ.setNextBeans(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.stk_id_typ_META);
		p.CndPanel.add(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ_nm.setNextBeans(p.Cnd_stk_bp_cd);
		p.Cnd_stk_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.stk_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_stk_bp_cd_Label);
		p.CndPanel.add(p.Cnd_stk_bp_cd);
		p.Cnd_stk_bp_cd.setNextBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.stk_bp_cd_META);
		p.Cnd_stk_bp_cd.addLinkBeans(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_bp_cd, true);
		p.CndPanel.add(p.Cnd_stk_bp_nm);
		p.Cnd_stk_bp_nm.setNextBeans(p.Cnd_rqst_usr_cd);
		p.Cnd_stk_bp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.stk_bp_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_bp_nm, true);
		p.CndPanel.add(p.Cnd_rqst_usr_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_usr_cd);
		p.Cnd_rqst_usr_cd.setNextBeans(p.Cnd_rqst_usr_nm);
		p.Cnd_rqst_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rqst_usr_cd_META);
		p.Cnd_rqst_usr_cd.addLinkBeans(p.Cnd_rqst_usr_nm);
		p.Cnd_rqst_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_usr_cd, true);
		p.CndPanel.add(p.Cnd_rqst_usr_nm);
		p.Cnd_rqst_usr_nm.setNextBeans(p.Cnd_rqst_dpt_cd);
		p.Cnd_rqst_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rqst_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_usr_nm, true);
		p.CndPanel.add(p.Cnd_rqst_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_dpt_cd);
		p.Cnd_rqst_dpt_cd.setNextBeans(p.Cnd_rqst_dpt_nm);
		p.Cnd_rqst_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rqst_dpt_cd_META);
		p.Cnd_rqst_dpt_cd.addLinkBeans(p.Cnd_rqst_dpt_nm);
		p.Cnd_rqst_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_dpt_cd, true);
		p.CndPanel.add(p.Cnd_rqst_dpt_nm);
		p.Cnd_rqst_dpt_nm.setNextBeans(p.Cnd_ship_term_cd);
		p.Cnd_rqst_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rqst_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_dpt_nm, true);
		p.Cnd_ship_term_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_term_cd, true);
		p.Cnd_ship_term_cd.setLinkBeans(p.Cnd_ship_term_nm);
		p.CndPanel.add(p.Cnd_ship_term_cd_Label);
		p.CndPanel.add(p.Cnd_ship_term_cd);
		p.Cnd_ship_term_cd.setNextBeans(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ship_term_cd_META);
		p.CndPanel.add(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_nm.setNextBeans(p.Cnd_ship_inst_typ);
		p.Cnd_ship_term_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ship_term_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_term_nm, true);
		p.Cnd_ship_inst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_inst_typ, true);
		p.Cnd_ship_inst_typ.setLinkBeans(p.Cnd_ship_inst_typ_nm);
		p.CndPanel.add(p.Cnd_ship_inst_typ_Label);
		p.CndPanel.add(p.Cnd_ship_inst_typ);
		p.Cnd_ship_inst_typ.setNextBeans(p.Cnd_ship_inst_typ_nm);
		p.Cnd_ship_inst_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ship_inst_typ_META);
		p.CndPanel.add(p.Cnd_ship_inst_typ_nm);
		p.Cnd_ship_inst_typ_nm.setNextBeans(p.Cnd_rsn_cd);
		p.Cnd_ship_inst_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ship_inst_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_inst_typ_nm, true);
		p.Cnd_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rsn_cd, true);
		p.Cnd_rsn_cd.setLinkBeans(p.Cnd_rsn_nm);
		p.CndPanel.add(p.Cnd_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_rsn_cd);
		p.Cnd_rsn_cd.setNextBeans(p.Cnd_rsn_nm);
		p.Cnd_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rsn_cd_META);
		p.CndPanel.add(p.Cnd_rsn_nm);
		p.Cnd_rsn_nm.setNextBeans(p.Cnd_bd_dpt_cd);
		p.Cnd_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_rsn_nm, true);
		p.CndPanel.add(p.Cnd_bd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bd_dpt_cd);
		p.Cnd_bd_dpt_cd.setNextBeans(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.bd_dpt_cd_META);
		p.Cnd_bd_dpt_cd.addLinkBeans(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_nm.setNextBeans(p.Cnd_ship_to_id_typ);
		p.Cnd_bd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.bd_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bd_dpt_nm, true);
		p.Cnd_ship_to_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_to_id_typ, true);
		p.Cnd_ship_to_id_typ.setLinkBeans(p.Cnd_ship_to_id_typ_nm);
		p.CndPanel.add(p.Cnd_ship_to_id_typ_Label);
		p.CndPanel.add(p.Cnd_ship_to_id_typ);
		p.Cnd_ship_to_id_typ.setNextBeans(p.Cnd_ship_to_id_typ_nm);
		p.Cnd_ship_to_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ship_to_id_typ_META);
		p.CndPanel.add(p.Cnd_ship_to_id_typ_nm);
		p.Cnd_ship_to_id_typ_nm.setNextBeans(p.Cnd_ship_to_id_cd);
		p.Cnd_ship_to_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ship_to_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_ship_to_id_cd_Label);
		p.CndPanel.add(p.Cnd_ship_to_id_cd);
		p.Cnd_ship_to_id_cd.setNextBeans(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ship_to_id_cd_META);
		p.Cnd_ship_to_id_cd.addLinkBeans(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_to_id_cd, true);
		p.CndPanel.add(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_nm.setNextBeans(p.Cnd_prov_typ);
		p.Cnd_ship_to_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ship_to_id_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_to_id_nm, true);
		p.Cnd_prov_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prov_typ, true);
		p.Cnd_prov_typ.setLinkBeans(p.Cnd_prov_typ_nm);
		p.CndPanel.add(p.Cnd_prov_typ_Label);
		p.CndPanel.add(p.Cnd_prov_typ);
		p.Cnd_prov_typ.setNextBeans(p.Cnd_prov_typ_nm);
		p.Cnd_prov_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.prov_typ_META);
		p.CndPanel.add(p.Cnd_prov_typ_nm);
		p.Cnd_prov_typ_nm.setNextBeans(p.Cnd_prov_basis_typ);
		p.Cnd_prov_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.prov_typ_nm_META);
		p.Cnd_prov_basis_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prov_basis_typ, true);
		p.Cnd_prov_basis_typ.setLinkBeans(p.Cnd_prov_basis_typ_nm);
		p.CndPanel.add(p.Cnd_prov_basis_typ_Label);
		p.CndPanel.add(p.Cnd_prov_basis_typ);
		p.Cnd_prov_basis_typ.setNextBeans(p.Cnd_prov_basis_typ_nm);
		p.Cnd_prov_basis_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.prov_basis_typ_META);
		p.CndPanel.add(p.Cnd_prov_basis_typ_nm);
		p.Cnd_prov_basis_typ_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_prov_basis_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.prov_basis_typ_nm_META);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_tax_cd);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.Cnd_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tax_cd, true);
		p.Cnd_tax_cd.setLinkBeans(p.Cnd_tax_nm,p.Cnd_tax_typ);
		p.CndPanel.add(p.Cnd_tax_cd_Label);
		p.CndPanel.add(p.Cnd_tax_cd);
		p.Cnd_tax_cd.setNextBeans(p.Cnd_tax_nm);
		p.Cnd_tax_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.tax_cd_META);
		p.CndPanel.add(p.Cnd_tax_nm);
		p.Cnd_tax_nm.setNextBeans(p.Cnd_tax_typ);
		p.Cnd_tax_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.tax_nm_META);
		p.setPluralValueEnable(p.Cnd_tax_nm, true);
		p.Cnd_tax_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tax_typ, true);
		p.Cnd_tax_typ.setLinkBeans(p.Cnd_tax_typ_nm);
		p.CndPanel.add(p.Cnd_tax_typ_Label);
		p.CndPanel.add(p.Cnd_tax_typ);
		p.Cnd_tax_typ.setNextBeans(p.Cnd_tax_typ_nm);
		p.Cnd_tax_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.tax_typ_META);
		p.CndPanel.add(p.Cnd_tax_typ_nm);
		p.Cnd_tax_typ_nm.setNextBeans(p.Cnd_ptax_cur_cd);
		p.Cnd_tax_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.tax_typ_nm_META);
		p.Cnd_ptax_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ptax_cur_cd, true);
		p.Cnd_ptax_cur_cd.setLinkBeans(p.Cnd_ptax_cur_nm);
		p.CndPanel.add(p.Cnd_ptax_cur_cd_Label);
		p.CndPanel.add(p.Cnd_ptax_cur_cd);
		p.Cnd_ptax_cur_cd.setNextBeans(p.Cnd_ptax_cur_nm);
		p.Cnd_ptax_cur_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ptax_cur_cd_META);
		p.CndPanel.add(p.Cnd_ptax_cur_nm);
		p.Cnd_ptax_cur_nm.setNextBeans(p.Cnd_ret_prov_typ);
		p.Cnd_ptax_cur_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ptax_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_ptax_cur_nm, true);
		p.Cnd_ret_prov_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ret_prov_typ, true);
		p.Cnd_ret_prov_typ.setLinkBeans(p.Cnd_ret_prov_typ_nm);
		p.CndPanel.add(p.Cnd_ret_prov_typ_Label);
		p.CndPanel.add(p.Cnd_ret_prov_typ);
		p.Cnd_ret_prov_typ.setNextBeans(p.Cnd_ret_prov_typ_nm);
		p.Cnd_ret_prov_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_prov_typ_META);
		p.CndPanel.add(p.Cnd_ret_prov_typ_nm);
		p.Cnd_ret_prov_typ_nm.setNextBeans(p.Cnd_ret_prov_basis_typ);
		p.Cnd_ret_prov_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_prov_typ_nm_META);
		p.Cnd_ret_prov_basis_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ret_prov_basis_typ, true);
		p.Cnd_ret_prov_basis_typ.setLinkBeans(p.Cnd_ret_prov_basis_typ_nm);
		p.CndPanel.add(p.Cnd_ret_prov_basis_typ_Label);
		p.CndPanel.add(p.Cnd_ret_prov_basis_typ);
		p.Cnd_ret_prov_basis_typ.setNextBeans(p.Cnd_ret_prov_basis_typ_nm);
		p.Cnd_ret_prov_basis_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_prov_basis_typ_META);
		p.CndPanel.add(p.Cnd_ret_prov_basis_typ_nm);
		p.Cnd_ret_prov_basis_typ_nm.setNextBeans(p.Cnd_ret_trd_cur_cd);
		p.Cnd_ret_prov_basis_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_prov_basis_typ_nm_META);
		p.Cnd_ret_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ret_trd_cur_cd, true);
		p.Cnd_ret_trd_cur_cd.setLinkBeans(p.Cnd_ret_trd_cur_nm);
		p.CndPanel.add(p.Cnd_ret_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_ret_trd_cur_cd);
		p.Cnd_ret_trd_cur_cd.setNextBeans(p.Cnd_ret_trd_cur_nm);
		p.Cnd_ret_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_ret_trd_cur_nm);
		p.Cnd_ret_trd_cur_nm.setNextBeans(p.Cnd_ret_tax_cd);
		p.Cnd_ret_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_ret_trd_cur_nm, true);
		p.Cnd_ret_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ret_tax_cd, true);
		p.Cnd_ret_tax_cd.setLinkBeans(p.Cnd_ret_tax_nm,p.Cnd_ret_tax_typ);
		p.CndPanel.add(p.Cnd_ret_tax_cd_Label);
		p.CndPanel.add(p.Cnd_ret_tax_cd);
		p.Cnd_ret_tax_cd.setNextBeans(p.Cnd_ret_tax_nm);
		p.Cnd_ret_tax_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_tax_cd_META);
		p.CndPanel.add(p.Cnd_ret_tax_nm);
		p.Cnd_ret_tax_nm.setNextBeans(p.Cnd_ret_tax_typ);
		p.Cnd_ret_tax_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_tax_nm_META);
		p.setPluralValueEnable(p.Cnd_ret_tax_nm, true);
		p.Cnd_ret_tax_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ret_tax_typ, true);
		p.Cnd_ret_tax_typ.setLinkBeans(p.Cnd_ret_tax_typ_nm);
		p.CndPanel.add(p.Cnd_ret_tax_typ_Label);
		p.CndPanel.add(p.Cnd_ret_tax_typ);
		p.Cnd_ret_tax_typ.setNextBeans(p.Cnd_ret_tax_typ_nm);
		p.Cnd_ret_tax_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_tax_typ_META);
		p.CndPanel.add(p.Cnd_ret_tax_typ_nm);
		p.Cnd_ret_tax_typ_nm.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_ret_tax_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ret_tax_typ_nm_META);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_rqst_cnt_rmrks);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.CndPanel.add(p.Cnd_rqst_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_rqst_cnt_rmrks);
		p.Cnd_rqst_cnt_rmrks.setNextBeans(p.Cnd_ship_cnt_rmrks);
		p.Cnd_rqst_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.rqst_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_rqst_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_ship_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_ship_cnt_rmrks);
		p.Cnd_ship_cnt_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_ship_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.ship_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_ship_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_xfr_src_typ);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd_xfr_src_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_xfr_src_typ, true);
		p.Cnd_xfr_src_typ.setLinkBeans(p.Cnd_xfr_src_typ_nm);
		p.CndPanel.add(p.Cnd_xfr_src_typ_Label);
		p.CndPanel.add(p.Cnd_xfr_src_typ);
		p.Cnd_xfr_src_typ.setNextBeans(p.Cnd_xfr_src_typ_nm);
		p.Cnd_xfr_src_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.xfr_src_typ_META);
		p.CndPanel.add(p.Cnd_xfr_src_typ_nm);
		p.Cnd_xfr_src_typ_nm.setNextBeans(p.Cnd_xfr_src_no);
		p.Cnd_xfr_src_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.xfr_src_typ_nm_META);
		p.CndPanel.add(p.Cnd_xfr_src_no_Label);
		p.CndPanel.add(p.Cnd_xfr_src_no);
		p.Cnd_xfr_src_no.setNextBeans(p.Cnd_xfr_schd_no);
		p.Cnd_xfr_src_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.xfr_src_no_META);
		p.setPluralValueEnable(p.Cnd_xfr_src_no, true);
		p.CndPanel.add(p.Cnd_xfr_schd_no_Label);
		p.CndPanel.add(p.Cnd_xfr_schd_no);
		p.Cnd_xfr_schd_no.setNextBeans(p.Cnd_itm_ord_no);
		p.Cnd_xfr_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.xfr_schd_no_META);
		p.setPluralValueEnable(p.Cnd_xfr_schd_no, true);
		p.CndPanel.add(p.Cnd_itm_ord_no_Label);
		p.CndPanel.add(p.Cnd_itm_ord_no);
		p.Cnd_itm_ord_no.setNextBeans(p.Cnd_mfg_inst_no);
		p.Cnd_itm_ord_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.itm_ord_no_META);
		p.setPluralValueEnable(p.Cnd_itm_ord_no, true);
		p.CndPanel.add(p.Cnd_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_no);
		p.Cnd_mfg_inst_no.setNextBeans(p.Cnd_oper_inst_no);
		p.Cnd_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_oper_inst_no_Label);
		p.CndPanel.add(p.Cnd_oper_inst_no);
		p.Cnd_oper_inst_no.setNextBeans(p.Cnd_inpt_schd_no);
		p.Cnd_oper_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.oper_inst_no_META);
		p.setPluralValueEnable(p.Cnd_oper_inst_no, true);
		p.CndPanel.add(p.Cnd_inpt_schd_no_Label);
		p.CndPanel.add(p.Cnd_inpt_schd_no);
		p.Cnd_inpt_schd_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_inpt_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.inpt_schd_no_META);
		p.setPluralValueEnable(p.Cnd_inpt_schd_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1000.CndR.slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_slo_d_no, true);
		p.ItmGrpCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmGrpCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [ItmGrpCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrpCnd(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.ItmGrpCndPanel.setValueCheck(false);
		p.ItmGrpCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmGrpCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_XfrSchdReg p) {
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
	protected static void jbInitRPnl(MSBEP_XfrSchdReg p) {
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
	protected static void jbInitBulkSet(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_gi_rqst_dt_p_PPanel);
		p.BulkSetPanel.setLastBeans(p.BulkSet_gi_rqst_dt_p_PPanel);
		p.BulkSet_gi_rqst_dt_p_PPanel.setNextBeans(p.BulkSet_gr_rqst_dt_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_gr_rqst_dt_p_PPanel);
		p.BulkSet_gr_rqst_dt_p_PPanel.setNextBeans(p.BulkSet_rcpt_dt);
		p.BulkSetPanel.add(p.BulkSet_rcpt_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_rcpt_dt);
		p.BulkSet_rcpt_dt.setNextBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_rcpt_dt.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1000.BulkSetR.rcpt_dt_META);
		p.BulkSet_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_XfrSchdReg p) {
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
	protected static void jbInitBtn(MSBEP_XfrSchdReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_dtl.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_dtl);
		p.BtnPanel.setLastBeans(p.Btn_open_dtl);
		p.Btn_open_dtl.setNextBeans(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.BtnPanel.add(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.Btn_Btn_open_MSBEP0500_PPanel.setNextBeans(p.Btn_sprt_ac_dt);
		p.Btn_sprt_ac_dt.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_sprt_ac_dt);
		p.Btn_sprt_ac_dt.setNextBeans(p.Btn_select_all);
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
	protected static void jbInitEastBtn(MSBEP_XfrSchdReg p) {
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
		MSBEP_XfrSchdReg_MC.mcInitScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitTop((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitFold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitTab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitRqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitRqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitTab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitCtrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitRPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitBulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitRslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitBtn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.mcInitEastBtn((MSBEP_XfrSchdReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_XfrSchdReg_MC.statusInitUPD_ScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_Top((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_Fold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_Tab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_RqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_RqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_Tab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_Cnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_ItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_Ctrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_RPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_BulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_Rslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_Btn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitUPD_EastBtn((MSBEP_XfrSchdReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_Top((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_Fold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_Tab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_RqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_RqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_Tab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_Cnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_ItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_Ctrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_RPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_BulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_Rslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_Btn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitFIX__U_EastBtn((MSBEP_XfrSchdReg)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_XfrSchdReg_MC.statusInitSRCH_ScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_Top((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_Fold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_Tab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_RqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_RqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_Tab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_Cnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_ItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_Ctrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_RPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_BulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_Rslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_Btn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitSRCH_EastBtn((MSBEP_XfrSchdReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_XfrSchdReg_MC.statusInitDEL_ScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_Top((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_Fold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_Tab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_RqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_RqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_Tab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_Cnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_ItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_Ctrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_RPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_BulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_Rslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_Btn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitDEL_EastBtn((MSBEP_XfrSchdReg)this);

		// [REF]ステータスのモードの設定
		MSBEP_XfrSchdReg_MC.statusInitREF_ScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_Top((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_Fold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_Tab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_RqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_RqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_Tab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_Cnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_ItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_Ctrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_RPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_BulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_Rslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_Btn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREF_EastBtn((MSBEP_XfrSchdReg)this);

		// [REQ_MOD]ステータスのモードの設定
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_ScreenOpe((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_Top((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_Fold((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_Tab1((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_RqstMod((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_RqstCan((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_Tab2((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_Cnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_ItmGrpCnd((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_Ctrl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_RPnl((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_BulkSet((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_Rslt((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_Btn((MSBEP_XfrSchdReg)this);
		MSBEP_XfrSchdReg_MC.statusInitREQ__MOD_EastBtn((MSBEP_XfrSchdReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_XfrSchdReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_XfrSchdReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_XfrSchdReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_XfrSchdReg p) {
	}

	/**
	 *  [RqstMod]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRqstMod(MSBEP_XfrSchdReg p) {
	}

	/**
	 *  [RqstCan]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRqstCan(MSBEP_XfrSchdReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_XfrSchdReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_XfrSchdReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_REQ_MOD.addAllListener(p);
		p.Cnd_rqst_mod_t_flg.addAllListener(p);
		p.Cnd_rqst_mod_f_flg.addAllListener(p);
		p.Cnd_rqst_can_t_flg.addAllListener(p);
		p.Cnd_rqst_can_f_flg.addAllListener(p);
		p.Cnd_rcpt_dt_fr.setListListener(p);
		p.Cnd_rcpt_dt_fr.addAllListener(p);
		p.Cnd_rcpt_dt_to.setListListener(p);
		p.Cnd_rcpt_dt_to.addAllListener(p);
		p.Cnd_inst_inc_flg.addAllListener(p);
		p.Cnd_gi_loc_cd.setListListener(p);
		p.Cnd_gi_loc_cd.addAllListener(p);
		p.Cnd_gi_loc_nm.setListListener(p);
		p.Cnd_gi_loc_nm.addAllListener(p);
		p.Cnd_gi_str_ln_cd.setListListener(p);
		p.Cnd_gi_str_ln_cd.addAllListener(p);
		p.Cnd_gi_str_ln_nm.setListListener(p);
		p.Cnd_gi_str_ln_nm.addAllListener(p);
		p.Cnd_gi_stk_arrv_bp_cd.setListListener(p);
		p.Cnd_gi_stk_arrv_bp_cd.addAllListener(p);
		p.Cnd_gi_stk_arrv_bp_nm.setListListener(p);
		p.Cnd_gi_stk_arrv_bp_nm.addAllListener(p);
		p.Cnd_gi_site_cd.setListListener(p);
		p.Cnd_gi_site_cd.addAllListener(p);
		p.Cnd_gi_site_nm.setListListener(p);
		p.Cnd_gi_site_nm.addAllListener(p);
		p.Cnd_gi_wg_cd.setListListener(p);
		p.Cnd_gi_wg_cd.addAllListener(p);
		p.Cnd_gi_wg_nm.setListListener(p);
		p.Cnd_gi_wg_nm.addAllListener(p);
		p.Cnd_gi_lg_grp_cd.setListListener(p);
		p.Cnd_gi_lg_grp_cd.addAllListener(p);
		p.Cnd_gi_lg_grp_nm.setListListener(p);
		p.Cnd_gi_lg_grp_nm.addAllListener(p);
		p.Cnd_gr_loc_cd.setListListener(p);
		p.Cnd_gr_loc_cd.addAllListener(p);
		p.Cnd_gr_loc_nm.setListListener(p);
		p.Cnd_gr_loc_nm.addAllListener(p);
		p.Cnd_gr_str_ln_cd.setListListener(p);
		p.Cnd_gr_str_ln_cd.addAllListener(p);
		p.Cnd_gr_str_ln_nm.setListListener(p);
		p.Cnd_gr_str_ln_nm.addAllListener(p);
		p.Cnd_gr_site_cd.setListListener(p);
		p.Cnd_gr_site_cd.addAllListener(p);
		p.Cnd_gr_site_nm.setListListener(p);
		p.Cnd_gr_site_nm.addAllListener(p);
		p.Cnd_gr_wg_cd.setListListener(p);
		p.Cnd_gr_wg_cd.addAllListener(p);
		p.Cnd_gr_wg_nm.setListListener(p);
		p.Cnd_gr_wg_nm.addAllListener(p);
		p.Cnd_gr_lg_grp_cd.setListListener(p);
		p.Cnd_gr_lg_grp_cd.addAllListener(p);
		p.Cnd_gr_lg_grp_nm.setListListener(p);
		p.Cnd_gr_lg_grp_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_def_ver_flg.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_trd_unit_cd.setListListener(p);
		p.Cnd_trd_unit_cd.addAllListener(p);
		p.Cnd_trd_unit_nm.setListListener(p);
		p.Cnd_trd_unit_nm.addAllListener(p);
		p.Cnd_base_unit_cd.setListListener(p);
		p.Cnd_base_unit_cd.addAllListener(p);
		p.Cnd_base_unit_nm.setListListener(p);
		p.Cnd_base_unit_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_quality_typ.setListListener(p);
		p.Cnd_quality_typ.addAllListener(p);
		p.Cnd_quality_typ_nm.setListListener(p);
		p.Cnd_quality_typ_nm.addAllListener(p);
		p.Cnd_stk_id_typ.setListListener(p);
		p.Cnd_stk_id_typ.addAllListener(p);
		p.Cnd_stk_id_typ_nm.setListListener(p);
		p.Cnd_stk_id_typ_nm.addAllListener(p);
		p.Cnd_stk_bp_cd.setListListener(p);
		p.Cnd_stk_bp_cd.addAllListener(p);
		p.Cnd_stk_bp_nm.setListListener(p);
		p.Cnd_stk_bp_nm.addAllListener(p);
		p.Cnd_rqst_usr_cd.setListListener(p);
		p.Cnd_rqst_usr_cd.addAllListener(p);
		p.Cnd_rqst_usr_nm.setListListener(p);
		p.Cnd_rqst_usr_nm.addAllListener(p);
		p.Cnd_rqst_dpt_cd.setListListener(p);
		p.Cnd_rqst_dpt_cd.addAllListener(p);
		p.Cnd_rqst_dpt_nm.setListListener(p);
		p.Cnd_rqst_dpt_nm.addAllListener(p);
		p.Cnd_ship_term_cd.setListListener(p);
		p.Cnd_ship_term_cd.addAllListener(p);
		p.Cnd_ship_term_nm.setListListener(p);
		p.Cnd_ship_term_nm.addAllListener(p);
		p.Cnd_ship_inst_typ.setListListener(p);
		p.Cnd_ship_inst_typ.addAllListener(p);
		p.Cnd_ship_inst_typ_nm.setListListener(p);
		p.Cnd_ship_inst_typ_nm.addAllListener(p);
		p.Cnd_rsn_cd.setListListener(p);
		p.Cnd_rsn_cd.addAllListener(p);
		p.Cnd_rsn_nm.setListListener(p);
		p.Cnd_rsn_nm.addAllListener(p);
		p.Cnd_bd_dpt_cd.setListListener(p);
		p.Cnd_bd_dpt_cd.addAllListener(p);
		p.Cnd_bd_dpt_nm.setListListener(p);
		p.Cnd_bd_dpt_nm.addAllListener(p);
		p.Cnd_ship_to_id_typ.setListListener(p);
		p.Cnd_ship_to_id_typ.addAllListener(p);
		p.Cnd_ship_to_id_typ_nm.setListListener(p);
		p.Cnd_ship_to_id_typ_nm.addAllListener(p);
		p.Cnd_ship_to_id_cd.setListListener(p);
		p.Cnd_ship_to_id_cd.addAllListener(p);
		p.Cnd_ship_to_id_nm.setListListener(p);
		p.Cnd_ship_to_id_nm.addAllListener(p);
		p.Cnd_prov_typ.setListListener(p);
		p.Cnd_prov_typ.addAllListener(p);
		p.Cnd_prov_typ_nm.setListListener(p);
		p.Cnd_prov_typ_nm.addAllListener(p);
		p.Cnd_prov_basis_typ.setListListener(p);
		p.Cnd_prov_basis_typ.addAllListener(p);
		p.Cnd_prov_basis_typ_nm.setListListener(p);
		p.Cnd_prov_basis_typ_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_tax_cd.setListListener(p);
		p.Cnd_tax_cd.addAllListener(p);
		p.Cnd_tax_nm.setListListener(p);
		p.Cnd_tax_nm.addAllListener(p);
		p.Cnd_tax_typ.setListListener(p);
		p.Cnd_tax_typ.addAllListener(p);
		p.Cnd_tax_typ_nm.setListListener(p);
		p.Cnd_tax_typ_nm.addAllListener(p);
		p.Cnd_ptax_cur_cd.setListListener(p);
		p.Cnd_ptax_cur_cd.addAllListener(p);
		p.Cnd_ptax_cur_nm.setListListener(p);
		p.Cnd_ptax_cur_nm.addAllListener(p);
		p.Cnd_ret_prov_typ.setListListener(p);
		p.Cnd_ret_prov_typ.addAllListener(p);
		p.Cnd_ret_prov_typ_nm.setListListener(p);
		p.Cnd_ret_prov_typ_nm.addAllListener(p);
		p.Cnd_ret_prov_basis_typ.setListListener(p);
		p.Cnd_ret_prov_basis_typ.addAllListener(p);
		p.Cnd_ret_prov_basis_typ_nm.setListListener(p);
		p.Cnd_ret_prov_basis_typ_nm.addAllListener(p);
		p.Cnd_ret_trd_cur_cd.setListListener(p);
		p.Cnd_ret_trd_cur_cd.addAllListener(p);
		p.Cnd_ret_trd_cur_nm.setListListener(p);
		p.Cnd_ret_trd_cur_nm.addAllListener(p);
		p.Cnd_ret_tax_cd.setListListener(p);
		p.Cnd_ret_tax_cd.addAllListener(p);
		p.Cnd_ret_tax_nm.setListListener(p);
		p.Cnd_ret_tax_nm.addAllListener(p);
		p.Cnd_ret_tax_typ.setListListener(p);
		p.Cnd_ret_tax_typ.addAllListener(p);
		p.Cnd_ret_tax_typ_nm.setListListener(p);
		p.Cnd_ret_tax_typ_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_rqst_cnt_rmrks.setListListener(p);
		p.Cnd_rqst_cnt_rmrks.addAllListener(p);
		p.Cnd_ship_cnt_rmrks.setListListener(p);
		p.Cnd_ship_cnt_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_xfr_src_typ.setListListener(p);
		p.Cnd_xfr_src_typ.addAllListener(p);
		p.Cnd_xfr_src_typ_nm.setListListener(p);
		p.Cnd_xfr_src_typ_nm.addAllListener(p);
		p.Cnd_xfr_src_no.setListListener(p);
		p.Cnd_xfr_src_no.addAllListener(p);
		p.Cnd_xfr_schd_no.setListListener(p);
		p.Cnd_xfr_schd_no.addAllListener(p);
		p.Cnd_itm_ord_no.setListListener(p);
		p.Cnd_itm_ord_no.addAllListener(p);
		p.Cnd_mfg_inst_no.setListListener(p);
		p.Cnd_mfg_inst_no.addAllListener(p);
		p.Cnd_oper_inst_no.setListListener(p);
		p.Cnd_oper_inst_no.addAllListener(p);
		p.Cnd_inpt_schd_no.setListListener(p);
		p.Cnd_inpt_schd_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_slo_d_no.setListListener(p);
		p.Cnd_slo_d_no.addAllListener(p);
	}

	/**
	 *  [ItmGrpCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrpCnd(MSBEP_XfrSchdReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_XfrSchdReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_XfrSchdReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBEP_XfrSchdReg p) {
		p.BulkSet_rcpt_dt.setListListener(p);
		p.BulkSet_rcpt_dt.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_XfrSchdReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
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
		p.columnRslt_asset_mng_typ.addAllListener(p);
		p.columnRslt_asset_mng_typ.setListListener(p);
		p.columnRslt_prov_upri_cng_flg.addAllListener(p);
		p.columnRslt_dscnt_itm_flg.addAllListener(p);
		p.columnRslt_alloc_flg.addAllListener(p);
		p.columnRslt_lot_none_flg.addAllListener(p);
		p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_ver_flg.addAllListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_qty.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_rnd_typ.addAllListener(p);
		p.columnRslt_trd_unit_rnd_typ.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_gi_loc_cd.addAllListener(p);
		p.columnRslt_gi_loc_cd.setListListener(p);
		p.columnRslt_gi_loc_nm.addAllListener(p);
		p.columnRslt_gi_loc_nm.setListListener(p);
		p.columnRslt_gi_str_ln_tgt_flg.addAllListener(p);
		p.Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_gi_lg_grp_cd.addAllListener(p);
		p.columnRslt_gi_lg_grp_cd.setListListener(p);
		p.columnRslt_gi_lg_grp_nm.addAllListener(p);
		p.columnRslt_gi_lg_grp_nm.setListListener(p);
		p.columnRslt_gi_wg_cd.addAllListener(p);
		p.columnRslt_gi_wg_cd.setListListener(p);
		p.columnRslt_gi_wg_nm.addAllListener(p);
		p.columnRslt_gi_wg_nm.setListListener(p);
		p.columnRslt_gi_site_cd.addAllListener(p);
		p.columnRslt_gi_site_cd.setListListener(p);
		p.columnRslt_gi_site_nm.addAllListener(p);
		p.columnRslt_gi_site_nm.setListListener(p);
		p.columnRslt_gr_loc_cd.addAllListener(p);
		p.columnRslt_gr_loc_cd.setListListener(p);
		p.columnRslt_gr_loc_nm.addAllListener(p);
		p.columnRslt_gr_loc_nm.setListListener(p);
		p.columnRslt_gr_str_ln_tgt_flg.addAllListener(p);
		p.Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_gr_lg_grp_cd.addAllListener(p);
		p.columnRslt_gr_lg_grp_cd.setListListener(p);
		p.columnRslt_gr_lg_grp_nm.addAllListener(p);
		p.columnRslt_gr_lg_grp_nm.setListListener(p);
		p.columnRslt_gr_wg_cd.addAllListener(p);
		p.columnRslt_gr_wg_cd.setListListener(p);
		p.columnRslt_gr_wg_nm.addAllListener(p);
		p.columnRslt_gr_wg_nm.setListListener(p);
		p.columnRslt_gr_site_cd.addAllListener(p);
		p.columnRslt_gr_site_cd.setListListener(p);
		p.columnRslt_gr_site_nm.addAllListener(p);
		p.columnRslt_gr_site_nm.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.Rslt_stk_bp_p_PPanel.columnStkBp_stk_bp_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_gi_sppl_cd.addAllListener(p);
		p.columnRslt_gi_sppl_cd.setListListener(p);
		p.columnRslt_gi_cur_cd.addAllListener(p);
		p.columnRslt_gi_cur_cd.setListListener(p);
		p.columnRslt_gi_subcon_flg.addAllListener(p);
		p.columnRslt_gi_onr_prsppl_flg.addAllListener(p);
		p.columnRslt_gi_prov_upri_cng_flg.addAllListener(p);
		p.columnRslt_gi_prov_amt_rnd_typ.addAllListener(p);
		p.columnRslt_gi_prov_amt_rnd_typ.setListListener(p);
		p.columnRslt_gi_prov_tax_rnd_typ.addAllListener(p);
		p.columnRslt_gi_prov_tax_rnd_typ.setListListener(p);
		p.columnRslt_gi_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_gi_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_gi_stk_arrv_bp_nm.addAllListener(p);
		p.columnRslt_gi_stk_arrv_bp_nm.setListListener(p);
		p.columnRslt_gr_sppl_cd.addAllListener(p);
		p.columnRslt_gr_sppl_cd.setListListener(p);
		p.columnRslt_gr_cur_cd.addAllListener(p);
		p.columnRslt_gr_cur_cd.setListListener(p);
		p.columnRslt_gr_subcon_flg.addAllListener(p);
		p.columnRslt_gr_onr_prsppl_flg.addAllListener(p);
		p.columnRslt_gr_prov_rcv_typ.addAllListener(p);
		p.columnRslt_gr_prov_rcv_typ.setListListener(p);
		p.columnRslt_gr_prov_basis_typ.addAllListener(p);
		p.columnRslt_gr_prov_basis_typ.setListListener(p);
		p.columnRslt_gr_prov_upri_cng_flg.addAllListener(p);
		p.columnRslt_gr_prov_amt_rnd_typ.addAllListener(p);
		p.columnRslt_gr_prov_amt_rnd_typ.setListListener(p);
		p.columnRslt_gr_prov_tax_rnd_typ.addAllListener(p);
		p.columnRslt_gr_prov_tax_rnd_typ.setListListener(p);
		p.columnRslt_rcpt_dt.addAllListener(p);
		p.columnRslt_rcpt_dt.setListListener(p);
		p.columnRslt_iv_trd_flg.addAllListener(p);
		p.columnRslt_ship_schd_tm.addAllListener(p);
		p.columnRslt_ship_schd_tm.setListListener(p);
		p.columnRslt_dlv_schd_tm.addAllListener(p);
		p.columnRslt_dlv_schd_tm.setListListener(p);
		p.columnRslt_rqst_mod_flg.addAllListener(p);
		p.columnRslt_rqst_can_flg.addAllListener(p);
		p.columnRslt_ship_term_cd.addAllListener(p);
		p.columnRslt_ship_term_cd.setListListener(p);
		p.columnRslt_ship_term_nm.addAllListener(p);
		p.columnRslt_ship_term_nm.setListListener(p);
		p.columnRslt_ship_term_cd_inv.addAllListener(p);
		p.columnRslt_ship_term_cd_inv.setListListener(p);
		p.columnRslt_ship_inst_typ.addAllListener(p);
		p.columnRslt_ship_inst_typ.setListListener(p);
		p.columnRslt_ship_inst_typ_nm.addAllListener(p);
		p.columnRslt_ship_inst_typ_nm.setListListener(p);
		p.columnRslt_rsn_cd.addAllListener(p);
		p.columnRslt_rsn_cd.setListListener(p);
		p.columnRslt_rsn_nm.addAllListener(p);
		p.columnRslt_rsn_nm.setListListener(p);
		p.columnRslt_acxfr_gi_flg.addAllListener(p);
		p.columnRslt_bd_dpt_cd.addAllListener(p);
		p.columnRslt_bd_dpt_cd.setListListener(p);
		p.columnRslt_bd_dpt_nm.addAllListener(p);
		p.columnRslt_bd_dpt_nm.setListListener(p);
		p.columnRslt_ship_block_flg.addAllListener(p);
		p.columnRslt_ship_to_id_typ.addAllListener(p);
		p.columnRslt_ship_to_id_typ.setListListener(p);
		p.columnRslt_ship_to_id_typ_nm.addAllListener(p);
		p.columnRslt_ship_to_id_typ_nm.setListListener(p);
		p.columnRslt_ship_to_id_cd.addAllListener(p);
		p.columnRslt_ship_to_id_cd.setListListener(p);
		p.columnRslt_ship_to_id_nm.addAllListener(p);
		p.columnRslt_ship_to_id_nm.setListListener(p);
		p.columnRslt_ship_to_sundry_flg.addAllListener(p);
		p.columnRslt_via_dlv_typ.addAllListener(p);
		p.columnRslt_via_dlv_typ.setListListener(p);
		p.columnRslt_via_dlv_typ_nm.addAllListener(p);
		p.columnRslt_via_dlv_typ_nm.setListListener(p);
		p.columnRslt_prov_typ.addAllListener(p);
		p.columnRslt_prov_typ.setListListener(p);
		p.columnRslt_prov_typ_nm.addAllListener(p);
		p.columnRslt_prov_typ_nm.setListListener(p);
		p.columnRslt_prov_basis_typ.addAllListener(p);
		p.columnRslt_prov_basis_typ.setListListener(p);
		p.columnRslt_prov_basis_typ_nm.addAllListener(p);
		p.columnRslt_prov_basis_typ_nm.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_trd_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_upri_dec_place.setListListener(p);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_prov_xrate_cd.addAllListener(p);
		p.columnRslt_prov_xrate_cd.setListListener(p);
		p.columnRslt_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
		p.columnRslt_ptax_cur_cd.addAllListener(p);
		p.columnRslt_ptax_cur_cd.setListListener(p);
		p.columnRslt_ptax_cur_nm.addAllListener(p);
		p.columnRslt_ptax_cur_nm.setListListener(p);
		p.columnRslt_ptax_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_ptax_cur_amt_dec_place.setListListener(p);
		p.columnRslt_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_wtax_rate.addAllListener(p);
		p.columnRslt_wtax_rate.setListListener(p);
		p.columnRslt_ret_prov_typ.addAllListener(p);
		p.columnRslt_ret_prov_typ.setListListener(p);
		p.columnRslt_ret_prov_typ_nm.addAllListener(p);
		p.columnRslt_ret_prov_typ_nm.setListListener(p);
		p.columnRslt_ret_prov_basis_typ.addAllListener(p);
		p.columnRslt_ret_prov_basis_typ.setListListener(p);
		p.columnRslt_ret_prov_basis_typ_nm.addAllListener(p);
		p.columnRslt_ret_prov_basis_typ_nm.setListListener(p);
		p.columnRslt_ret_trd_cur_cd.addAllListener(p);
		p.columnRslt_ret_trd_cur_cd.setListListener(p);
		p.columnRslt_ret_trd_cur_nm.addAllListener(p);
		p.columnRslt_ret_trd_cur_nm.setListListener(p);
		p.columnRslt_ret_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_ret_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_ret_trd_cur_upri_dec_place.addAllListener(p);
		p.columnRslt_ret_trd_cur_upri_dec_place.setListListener(p);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_ret_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_ret_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_ret_wtax_rate.addAllListener(p);
		p.columnRslt_ret_wtax_rate.setListListener(p);
		p.columnRslt_base_dlv_slip_no.addAllListener(p);
		p.columnRslt_base_dlv_slip_no.setListListener(p);
		p.columnRslt_base_prov_act_no.addAllListener(p);
		p.columnRslt_base_prov_act_no.setListListener(p);
		p.columnRslt_base_ac_dt.addAllListener(p);
		p.columnRslt_base_ac_dt.setListListener(p);
		p.columnRslt_rqst_cnt_rmrks.addAllListener(p);
		p.columnRslt_rqst_cnt_rmrks.setListListener(p);
		p.columnRslt_ship_cnt_rmrks.addAllListener(p);
		p.columnRslt_ship_cnt_rmrks.setListListener(p);
		p.columnRslt_trd_d_rmrks.addAllListener(p);
		p.columnRslt_trd_d_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_xfr_src_typ.addAllListener(p);
		p.columnRslt_xfr_src_typ.setListListener(p);
		p.columnRslt_xfr_src_typ_nm.addAllListener(p);
		p.columnRslt_xfr_src_typ_nm.setListListener(p);
		p.columnRslt_xfr_src_no.addAllListener(p);
		p.columnRslt_xfr_src_no.setListListener(p);
		p.columnRslt_xfr_schd_no.addAllListener(p);
		p.columnRslt_xfr_schd_no.setListListener(p);
		p.columnRslt_itm_ord_no.addAllListener(p);
		p.columnRslt_itm_ord_no.setListListener(p);
		p.columnRslt_mfg_inst_no.addAllListener(p);
		p.columnRslt_mfg_inst_no.setListListener(p);
		p.columnRslt_oper_inst_no.addAllListener(p);
		p.columnRslt_oper_inst_no.setListListener(p);
		p.columnRslt_inpt_schd_no.addAllListener(p);
		p.columnRslt_inpt_schd_no.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_io_schd_pr_no.addAllListener(p);
		p.columnRslt_io_schd_pr_no.setListListener(p);
		p.columnRslt_not_lot_mix_flg.addAllListener(p);
		p.columnRslt_not_sublot_mix_flg.addAllListener(p);
		p.columnRslt_vld_dt_fr.addAllListener(p);
		p.columnRslt_vld_dt_fr.setListListener(p);
		p.columnRslt_vld_dt_to.addAllListener(p);
		p.columnRslt_vld_dt_to.setListListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_XfrSchdReg p) {
		p.Btn_open_dtl.addAllListener(p);
		p.Btn_open_dtl.setAPMethodName("doBtn_open_dtl");
		p.Btn_sprt_ac_dt.addAllListener(p);
		p.Btn_sprt_ac_dt.setAPMethodName("doBtn_sprt_ac_dt");
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
	protected static void mcInitEastBtn(MSBEP_XfrSchdReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_XfrSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBEP_XfrSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBEP_XfrSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBEP_XfrSchdReg p){

	}

	/**
	 * [UPD]ステータスの[RqstMod]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RqstMod(MSBEP_XfrSchdReg p){

	}

	/**
	 * [UPD]ステータスの[RqstCan]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RqstCan(MSBEP_XfrSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBEP_XfrSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_XfrSchdReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rqst_mod_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rqst_mod_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rqst_can_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rqst_can_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_gi_rqst_tm_frto_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_rqst_tm_frto_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_inst_inc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_gi_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_def_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_unit_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_base_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_base_unit_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ptax_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ptax_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ret_prov_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ret_prov_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ret_prov_basis_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ret_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ret_trd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ret_trd_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ret_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ret_tax_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ret_tax_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ret_tax_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_xfr_src_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_xfr_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_xfr_src_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ItmGrpCnd(MSBEP_XfrSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBEP_XfrSchdReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBEP_XfrSchdReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBEP_XfrSchdReg p){
		p.BulkSet_gi_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_gr_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_rcpt_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBEP_XfrSchdReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_trd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_prov_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_lot_none_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnRslt_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_inpt_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_gi_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_gi_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gi_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_gi_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnRslt_gi_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_gi_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gi_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gi_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_gr_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gr_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_gr_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnRslt_gr_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gr_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gr_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_stk_id_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_stk_bp_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnRslt_gi_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gi_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gi_subcon_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gi_onr_prsppl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gi_stk_arrv_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_gi_stk_arrv_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gr_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gr_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gr_subcon_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gr_onr_prsppl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_rcv_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_basis_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rcpt_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_gi_rqst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_gr_rqst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_iv_trd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_tm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_tm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_rqst_mod_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rqst_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_ship_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd_inv.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_ship_inst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_acxfr_gi_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_ship_to_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_ship_to_id_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.ENABLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_via_dlv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_prov_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.ENABLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_prov_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnRslt_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.Rslt_ptax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_prov_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_ret_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ret_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.ENABLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ret_xrate_inpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_ret_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.Rslt_ret_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ret_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_ret_ptax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.Rslt_ret_ptax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_ret_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_base_prov_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_base_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_rqst_cnt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_xfr_src_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_XfrSchdReg p){
		p.Btn_open_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_sprt_ac_dt.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_EastBtn(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[RqstMod]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RqstMod(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[RqstCan]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RqstCan(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_XfrSchdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rqst_mod_t_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rqst_mod_f_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rqst_can_t_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rqst_can_f_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_gi_rqst_tm_frto_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_rqst_tm_frto_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_inst_inc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_gi_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_str_ln_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_str_ln_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_def_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_unit_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_unit_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_base_unit_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_base_unit_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_usr_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_rsn_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prov_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tax_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tax_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ptax_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ptax_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ret_prov_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ret_prov_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ret_prov_basis_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ret_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ret_trd_cur_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ret_trd_cur_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ret_tax_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ret_tax_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ret_tax_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ret_tax_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_rqst_cnt_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_xfr_src_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_xfr_src_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_xfr_src_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ItmGrpCnd(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBEP_XfrSchdReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_U, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBEP_XfrSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBEP_XfrSchdReg p){
		p.BulkSet_gi_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_gr_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rcpt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBEP_XfrSchdReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_prov_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_none_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_inpt_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_gi_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gi_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gi_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_gi_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gi_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gi_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gi_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gi_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gr_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_gr_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gr_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gr_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_stk_bp_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnRslt_gi_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gi_cur_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gi_subcon_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gi_onr_prsppl_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gi_stk_arrv_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gi_stk_arrv_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_gr_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gr_cur_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gr_subcon_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gr_onr_prsppl_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_rcv_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_basis_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_rcpt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_gi_rqst_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_gr_rqst_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_tm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_tm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_rqst_mod_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rqst_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd_inv.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_acxfr_gi_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_prov_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_prov_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ret_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ret_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ret_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ret_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_ptax_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ret_ptax_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_ptax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_wtax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ret_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_rqst_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_XfrSchdReg p){
		p.Btn_open_dtl.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_U, MCMode.DISABLE);
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
	protected static void statusInitFIX__U_EastBtn(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[RqstMod]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RqstMod(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[RqstCan]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RqstCan(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_XfrSchdReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rqst_mod_t_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rqst_mod_f_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rqst_can_t_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rqst_can_f_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gi_rqst_tm_frto_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_rqst_tm_frto_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inst_inc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_gi_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_def_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_unit_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_unit_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_base_unit_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_base_unit_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rsn_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tax_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ptax_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ptax_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ret_prov_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ret_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ret_prov_basis_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ret_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ret_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ret_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ret_tax_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ret_tax_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ret_tax_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ret_tax_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rqst_cnt_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_xfr_src_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_xfr_src_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_xfr_src_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmGrpCnd(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_XfrSchdReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBEP_XfrSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBEP_XfrSchdReg p){
		p.BulkSet_gi_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_gr_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rcpt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBEP_XfrSchdReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_prov_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_lot_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_inpt_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_gi_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gi_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_gr_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gr_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_stk_bp_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnRslt_gi_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gi_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gi_subcon_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gi_onr_prsppl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gi_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gi_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gr_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gr_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gr_subcon_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gr_onr_prsppl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_rcv_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_basis_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rcpt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_gi_rqst_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_gr_rqst_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_tm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_tm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_rqst_mod_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rqst_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd_inv.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acxfr_gi_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_prov_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ret_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ret_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ret_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ret_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ret_ptax_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_ptax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ret_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rqst_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_to.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
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
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_XfrSchdReg p){
		p.Btn_open_dtl.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[RqstMod]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RqstMod(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[RqstCan]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RqstCan(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_XfrSchdReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rqst_mod_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rqst_mod_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rqst_can_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rqst_can_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_gi_rqst_tm_frto_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_rqst_tm_frto_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_inst_inc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_gi_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_str_ln_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_str_ln_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_def_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_unit_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_unit_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_base_unit_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_base_unit_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_rsn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prov_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tax_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tax_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ptax_cur_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ptax_cur_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ret_prov_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ret_prov_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ret_prov_basis_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ret_prov_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ret_trd_cur_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ret_trd_cur_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ret_tax_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ret_tax_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ret_tax_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ret_tax_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_cnt_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_xfr_src_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_xfr_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_xfr_src_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ItmGrpCnd(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBEP_XfrSchdReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBEP_XfrSchdReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBEP_XfrSchdReg p){
		p.BulkSet_gi_rqst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_gr_rqst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rcpt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBEP_XfrSchdReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_prov_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_none_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_inpt_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_gi_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_gi_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gi_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gr_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_gr_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gr_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gr_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gr_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gr_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_stk_bp_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnRslt_gi_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gi_cur_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gi_subcon_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gi_onr_prsppl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gi_stk_arrv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_stk_arrv_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gr_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gr_cur_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gr_subcon_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gr_onr_prsppl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_rcv_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_basis_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rcpt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_gi_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_gr_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_tm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_tm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_rqst_mod_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd_inv.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_acxfr_gi_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_prov_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_prov_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ret_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ret_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ret_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ret_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ret_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_ptax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_wtax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ret_wtax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_XfrSchdReg p){
		p.Btn_open_dtl.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, DEL, MCMode.DISABLE);
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
	protected static void statusInitDEL_EastBtn(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[RqstMod]ブロックのモードの設定
	 */
	protected static void statusInitREF_RqstMod(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[RqstCan]ブロックのモードの設定
	 */
	protected static void statusInitREF_RqstCan(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_XfrSchdReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rqst_mod_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rqst_mod_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rqst_can_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rqst_can_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gi_rqst_tm_frto_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_rqst_tm_frto_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inst_inc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_gi_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_def_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_unit_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_unit_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_base_unit_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_base_unit_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rsn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prov_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tax_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tax_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ptax_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ptax_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ret_prov_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ret_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ret_prov_basis_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ret_prov_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ret_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ret_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ret_tax_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ret_tax_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ret_tax_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ret_tax_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_cnt_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_xfr_src_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_xfr_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_xfr_src_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmGrpCnd(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBEP_XfrSchdReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBEP_XfrSchdReg p){
		p.BulkSet_gi_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_gr_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rcpt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBEP_XfrSchdReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_prov_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_lot_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_inpt_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_gi_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gi_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_gr_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gr_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_stk_bp_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnRslt_gi_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gi_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gi_subcon_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gi_onr_prsppl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gi_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gr_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gr_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gr_subcon_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gr_onr_prsppl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_rcv_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_basis_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rcpt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_gi_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_gr_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_tm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_tm.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_rqst_mod_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd_inv.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acxfr_gi_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_prov_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_prov_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ret_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ret_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ret_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ret_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ret_ptax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_ptax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ret_wtax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_XfrSchdReg p){
		p.Btn_open_dtl.putMode(p, REF, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_ScreenOpe(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_Top(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_Fold(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_Tab1(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[RqstMod]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_RqstMod(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[RqstCan]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_RqstCan(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_Tab2(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_Cnd(MSBEP_XfrSchdReg p){
		p.Cnd_ope_Group.putMode(p, REQ_MOD, MCMode.REQUIRED);
		p.Cnd_rqst_mod_t_flg.putMode(p, REQ_MOD, MCMode.REQUIRED);
		p.Cnd_rqst_mod_f_flg.putMode(p, REQ_MOD, MCMode.REQUIRED);
		p.Cnd_rqst_can_t_flg.putMode(p, REQ_MOD, MCMode.REQUIRED);
		p.Cnd_rqst_can_f_flg.putMode(p, REQ_MOD, MCMode.REQUIRED);
		p.Cnd_gi_rqst_tm_frto_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_gr_rqst_tm_frto_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rcpt_dt_fr.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_rcpt_dt_to.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_inst_inc_flg.putMode(p, REQ_MOD, MCMode.REQUIRED);
		p.Cnd_gi_loc_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_loc_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_str_ln_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_str_ln_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_stk_arrv_bp_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_site_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_site_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_wg_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_wg_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gi_lg_grp_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_str_ln_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_str_ln_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_site_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_site_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_wg_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_wg_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gr_lg_grp_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_def_ver_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REQ_MOD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_trd_unit_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_trd_unit_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_base_unit_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_base_unit_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_stk_bp_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_stk_bp_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_rqst_usr_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_rsn_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_prov_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_prov_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_prov_basis_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_prov_basis_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_tax_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_tax_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_ptax_cur_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ptax_cur_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ret_prov_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ret_prov_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_ret_prov_basis_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ret_prov_basis_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_ret_trd_cur_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ret_trd_cur_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ret_tax_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ret_tax_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ret_tax_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ret_tax_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_rqst_cnt_rmrks.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_xfr_src_typ.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_xfr_src_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Cnd_xfr_src_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_inpt_schd_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REQ_MOD]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_ItmGrpCnd(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_Ctrl(MSBEP_XfrSchdReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REQ_MOD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REQ_MOD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_RPnl(MSBEP_XfrSchdReg p){

	}

	/**
	 * [REQ_MOD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_BulkSet(MSBEP_XfrSchdReg p){
		p.BulkSet_gi_rqst_dt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_gr_rqst_dt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rcpt_dt.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [REQ_MOD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_Rslt(MSBEP_XfrSchdReg p){
		p.columnRslt_check.putMode(p, REQ_MOD, MCMode.REQUIRED);
		p.columnRslt_trd_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_prov_upri_cng_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_lot_none_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REQ_MOD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_inpt_cont_qty_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_act_cont_qty_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_std_cont_qty_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_gi_loc_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gi_loc_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gi_str_ln_tgt_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_gi_str_ln_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gi_lg_grp_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gi_lg_grp_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gi_wg_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gi_site_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gi_site_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gr_loc_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gr_str_ln_tgt_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_gr_str_ln_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_gr_lg_grp_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gr_lg_grp_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gr_wg_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gr_site_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gr_site_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REQ_MOD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_stk_bp_p_PPanel.putStatus(REQ_MOD, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnRslt_gi_sppl_cd.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gi_cur_cd.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gi_subcon_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gi_onr_prsppl_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_upri_cng_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_amt_rnd_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gi_prov_tax_rnd_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gi_stk_arrv_bp_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gi_stk_arrv_bp_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_gr_sppl_cd.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gr_cur_cd.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gr_subcon_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gr_onr_prsppl_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_rcv_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_basis_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_upri_cng_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_amt_rnd_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_gr_prov_tax_rnd_typ.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_rcpt_dt.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_gi_rqst_tm_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_gr_rqst_tm_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_tm.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_dlv_schd_tm.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_rqst_mod_flg.putMode(p, REQ_MOD, MCMode.REQUIRED);
		p.columnRslt_rqst_can_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd_inv.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_acxfr_gi_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_ship_to_sundry_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_prov_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_prov_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_upri_dec_place.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_prov_xrate_cd.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_amt_dec_place.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_prov_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ret_prov_basis_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ret_trd_cur_amt_dec_place.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_ret_trd_cur_upri_dec_place.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REQ_MOD, MCMode.INVISIBLE);
		p.columnRslt_ret_xrate_inpt_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_ret_xrate_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_base_cur_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ret_base_cur_tax_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_ptax_xrate_inpt_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_ret_ptax_xrate_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ret_ptax_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ret_wtax_rate.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_ret_wtax_amt_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_cnt_rmrks.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_xfr_src_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_inpt_schd_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_not_lot_mix_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_to.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.Rslt_rtn_msg_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REQ_MOD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REQ_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REQ_MOD, MCMode.INVISIBLE);

	}

	/**
	 * [REQ_MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_Btn(MSBEP_XfrSchdReg p){
		p.Btn_open_dtl.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(REQ_MOD, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, REQ_MOD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REQ_MOD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REQ_MOD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REQ_MOD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REQ_MOD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REQ_MOD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REQ_MOD, MCMode.ENABLE);
		p.Btn_del.putMode(p, REQ_MOD, MCMode.DISABLE);

	}

	/**
	 * [REQ_MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREQ__MOD_EastBtn(MSBEP_XfrSchdReg p){

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
		MSBEP_XfrSchdReg_MC.setTableConfigRslt((MSBEP_XfrSchdReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_XfrSchdReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_cd_META);
		p.columnRslt_trd_cd.addLinkBeans(p.columnRslt_trd_nm,p.columnRslt_trd_ptn_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_itm_nm, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_base_unit_rnd_typ, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_asset_mng_typ, p.columnRslt_ver_flg, p.columnRslt_cont_fctr_flg, p.columnRslt_std_cont_fctr, p.columnRslt_cont_fctr_unit_cd, p.columnRslt_cont_fctr_unit_nm, p.columnRslt_cont_fctr_rnd_typ, p.columnRslt_cont_fctr_dec_place, p.columnRslt_prov_upri_cng_flg, p.columnRslt_ship_inst_typ, p.columnRslt_ship_term_cd_inv, p.columnRslt_ship_term_cd);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_itm_nm, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_base_unit_rnd_typ, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_asset_mng_typ, p.columnRslt_ver_flg, p.columnRslt_cont_fctr_flg, p.columnRslt_std_cont_fctr, p.columnRslt_cont_fctr_unit_cd, p.columnRslt_cont_fctr_unit_nm, p.columnRslt_cont_fctr_rnd_typ, p.columnRslt_cont_fctr_dec_place, p.columnRslt_prov_upri_cng_flg, p.columnRslt_ship_inst_typ, p.columnRslt_ship_term_cd_inv, p.columnRslt_ship_term_cd);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_sub3, p.columnRslt_itm_nm, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_base_unit_rnd_typ, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_asset_mng_typ, p.columnRslt_ver_flg, p.columnRslt_cont_fctr_flg, p.columnRslt_std_cont_fctr, p.columnRslt_cont_fctr_unit_cd, p.columnRslt_cont_fctr_unit_nm, p.columnRslt_cont_fctr_rnd_typ, p.columnRslt_cont_fctr_dec_place, p.columnRslt_prov_upri_cng_flg, p.columnRslt_ship_inst_typ, p.columnRslt_ship_term_cd_inv, p.columnRslt_ship_term_cd);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_base_unit_cd, p.columnRslt_base_unit_nm, p.columnRslt_base_unit_dec_place, p.columnRslt_base_unit_rnd_typ, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_asset_mng_typ, p.columnRslt_ver_flg, p.columnRslt_cont_fctr_flg, p.columnRslt_std_cont_fctr, p.columnRslt_cont_fctr_unit_cd, p.columnRslt_cont_fctr_unit_nm, p.columnRslt_cont_fctr_rnd_typ, p.columnRslt_cont_fctr_dec_place, p.columnRslt_prov_upri_cng_flg, p.columnRslt_ship_inst_typ, p.columnRslt_ship_term_cd_inv, p.columnRslt_ship_term_cd);
		p.columnRslt_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.lot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ);
		p.columnRslt_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.sublot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.columnRslt_asset_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.asset_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ);
		p.columnRslt_prov_upri_cng_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.prov_upri_cng_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_upri_cng_flg);
		p.columnRslt_dscnt_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.dscnt_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_itm_flg);
		p.columnRslt_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_flg);
		p.columnRslt_lot_none_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.lot_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_none_flg);
		p.RsltTable.addTable(p.Rslt_lot_no_p_PPanel.LotNoTable);
		p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnRslt_sublot_no, p.columnRslt_ver_no, p.columnRslt_act_cont_fctr);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnRslt_ver_no, p.columnRslt_act_cont_fctr);
		p.columnRslt_ver_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ver_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_flg);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_unit_cd_META);
		p.columnRslt_trd_unit_cd.addLinkBeans(p.columnRslt_trd_unit_nm,p.columnRslt_trd_unit_conv_base_qty,p.columnRslt_trd_unit_conv_qty,p.columnRslt_trd_unit_dec_place,p.columnRslt_trd_unit_rnd_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_base_qty);
		p.columnRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_qty);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.RsltTable.addTable(p.Rslt_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.setLinkBeans(p.columnRslt_cont_fctr_unit_nm, p.columnRslt_cont_fctr_dec_place, p.columnRslt_cont_fctr_rnd_typ);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.RsltTable.addTable(p.Rslt_inpt_cont_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.RsltTable.addTable(p.Rslt_act_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.RsltTable.addTable(p.Rslt_std_cont_qty_p_PPanel.ContQtyTable);
		p.columnRslt_gi_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_loc_cd_META);
		p.columnRslt_gi_loc_cd.addLinkBeans(p.columnRslt_gi_loc_nm,p.columnRslt_gi_lg_grp_cd,p.columnRslt_gi_lg_grp_nm,p.columnRslt_gi_wg_cd,p.columnRslt_gi_wg_nm,p.columnRslt_gi_site_cd,p.columnRslt_gi_site_nm,p.columnRslt_gi_str_ln_tgt_flg,p.columnRslt_gi_sppl_cd);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_loc_cd);
		p.columnRslt_gi_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_loc_nm);
		p.columnRslt_gi_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_str_ln_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_str_ln_tgt_flg);
		p.RsltTable.addTable(p.Rslt_gi_str_ln_p_PPanel.StrLnTable);
		p.Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnRslt_gi_str_ln_nm);
		p.columnRslt_gi_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_lg_grp_cd_META);
		p.columnRslt_gi_lg_grp_cd.addLinkBeans(p.columnRslt_gi_lg_grp_nm,p.columnRslt_gi_wg_cd);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_lg_grp_cd);
		p.columnRslt_gi_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_lg_grp_nm);
		p.columnRslt_gi_wg_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_wg_cd_META);
		p.columnRslt_gi_wg_cd.addLinkBeans(p.columnRslt_gi_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_wg_cd);
		p.columnRslt_gi_wg_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_wg_nm);
		p.columnRslt_gi_site_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_site_cd_META);
		p.columnRslt_gi_site_cd.addLinkBeans(p.columnRslt_gi_site_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_site_cd);
		p.columnRslt_gi_site_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_site_nm);
		p.columnRslt_gr_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_loc_cd_META);
		p.columnRslt_gr_loc_cd.addLinkBeans(p.columnRslt_gr_loc_nm,p.columnRslt_gr_lg_grp_cd,p.columnRslt_gr_lg_grp_nm,p.columnRslt_gr_wg_cd,p.columnRslt_gr_wg_nm,p.columnRslt_gr_site_cd,p.columnRslt_gr_site_nm,p.columnRslt_gr_str_ln_tgt_flg,p.columnRslt_gr_sppl_cd,p.columnRslt_gr_str_ln_cd,p.columnRslt_gr_str_ln_cd_none_flg);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_loc_cd);
		p.columnRslt_gr_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_loc_nm);
		p.columnRslt_gr_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_str_ln_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_str_ln_tgt_flg);
		p.RsltTable.addTable(p.Rslt_gr_str_ln_p_PPanel.StrLnTable);
		p.Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnRslt_gr_str_ln_nm);
		p.columnRslt_gr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_lg_grp_cd_META);
		p.columnRslt_gr_lg_grp_cd.addLinkBeans(p.columnRslt_gr_lg_grp_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_lg_grp_cd);
		p.columnRslt_gr_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_lg_grp_nm);
		p.columnRslt_gr_wg_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_wg_cd_META);
		p.columnRslt_gr_wg_cd.addLinkBeans(p.columnRslt_gr_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_wg_cd);
		p.columnRslt_gr_wg_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_wg_nm);
		p.columnRslt_gr_site_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_site_cd_META);
		p.columnRslt_gr_site_cd.addLinkBeans(p.columnRslt_gr_site_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_site_cd);
		p.columnRslt_gr_site_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_site_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.quality_typ_META);
		p.columnRslt_quality_typ.addLinkBeans(p.columnRslt_quality_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gd_cd_META);
		p.columnRslt_gd_cd.addLinkBeans(p.columnRslt_gd_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.stk_id_typ_META);
		p.columnRslt_stk_id_typ.addLinkBeans(p.columnRslt_stk_id_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.RsltTable.addTable(p.Rslt_stk_bp_p_PPanel.StkBpTable);
		p.Rslt_stk_bp_p_PPanel.columnStkBp_stk_bp_cd.setLinkBeans(p.columnRslt_stk_bp_nm);
		p.columnRslt_gi_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_sppl_cd_META);
		p.columnRslt_gi_sppl_cd.addLinkBeans(p.columnRslt_gi_subcon_flg,p.columnRslt_gi_onr_prsppl_flg,p.columnRslt_gi_cur_cd,p.columnRslt_gi_prov_upri_cng_flg,p.columnRslt_gi_prov_amt_rnd_typ,p.columnRslt_gi_prov_tax_rnd_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_sppl_cd);
		p.columnRslt_gi_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_cur_cd);
		p.columnRslt_gi_subcon_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_subcon_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_subcon_flg);
		p.columnRslt_gi_onr_prsppl_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_onr_prsppl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_onr_prsppl_flg);
		p.columnRslt_gi_prov_upri_cng_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_prov_upri_cng_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_prov_upri_cng_flg);
		p.columnRslt_gi_prov_amt_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_prov_amt_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_prov_amt_rnd_typ);
		p.columnRslt_gi_prov_tax_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_prov_tax_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_prov_tax_rnd_typ);
		p.columnRslt_gi_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_stk_arrv_bp_cd_META);
		p.columnRslt_gi_stk_arrv_bp_cd.addLinkBeans(p.columnRslt_gi_stk_arrv_bp_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_stk_arrv_bp_cd);
		p.columnRslt_gi_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gi_stk_arrv_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_stk_arrv_bp_nm);
		p.columnRslt_gr_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_sppl_cd_META);
		p.columnRslt_gr_sppl_cd.addLinkBeans(p.columnRslt_gr_subcon_flg,p.columnRslt_gr_onr_prsppl_flg,p.columnRslt_gr_cur_cd,p.columnRslt_gr_prov_basis_typ,p.columnRslt_gr_prov_rcv_typ,p.columnRslt_gr_prov_upri_cng_flg,p.columnRslt_gr_prov_amt_rnd_typ,p.columnRslt_gr_prov_tax_rnd_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_sppl_cd);
		p.columnRslt_gr_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_cur_cd);
		p.columnRslt_gr_subcon_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_subcon_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_subcon_flg);
		p.columnRslt_gr_onr_prsppl_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_onr_prsppl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_onr_prsppl_flg);
		p.columnRslt_gr_prov_rcv_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_prov_rcv_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_prov_rcv_typ);
		p.columnRslt_gr_prov_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_prov_basis_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_prov_basis_typ);
		p.columnRslt_gr_prov_upri_cng_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_prov_upri_cng_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_prov_upri_cng_flg);
		p.columnRslt_gr_prov_amt_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_prov_amt_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_prov_amt_rnd_typ);
		p.columnRslt_gr_prov_tax_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.gr_prov_tax_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gr_prov_tax_rnd_typ);
		p.columnRslt_rcpt_dt.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.rcpt_dt_META);
		p.columnRslt_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_dt);
		p.RsltTable.addTable(p.Rslt_gi_rqst_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_gr_rqst_tm_p_PPanel.YmdHmTable);
		p.columnRslt_iv_trd_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.iv_trd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_trd_flg);
		p.columnRslt_ship_schd_tm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_schd_tm_META);
		p.columnRslt_ship_schd_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_tm);
		p.columnRslt_dlv_schd_tm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.dlv_schd_tm_META);
		p.columnRslt_dlv_schd_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_schd_tm);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.columnRslt_rqst_mod_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.rqst_mod_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_mod_flg);
		p.columnRslt_rqst_can_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.rqst_can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_can_flg);
		p.columnRslt_ship_term_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_term_cd_META);
		p.columnRslt_ship_term_cd.addLinkBeans(p.columnRslt_ship_term_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_cd);
		p.columnRslt_ship_term_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_term_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_nm);
		p.columnRslt_ship_term_cd_inv.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_term_cd_inv_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_cd_inv);
		p.columnRslt_ship_inst_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_inst_typ_META);
		p.columnRslt_ship_inst_typ.addLinkBeans(p.columnRslt_ship_inst_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_typ);
		p.columnRslt_ship_inst_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_inst_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_typ_nm);
		p.columnRslt_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.rsn_cd_META);
		p.columnRslt_rsn_cd.addLinkBeans(p.columnRslt_rsn_nm,p.columnRslt_acxfr_gi_flg);
		p.RsltTable.addColumnConfig(p.columnRslt_rsn_cd);
		p.columnRslt_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsn_nm);
		p.columnRslt_acxfr_gi_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.acxfr_gi_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_gi_flg);
		p.columnRslt_bd_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.bd_dpt_cd_META);
		p.columnRslt_bd_dpt_cd.addLinkBeans(p.columnRslt_bd_dpt_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_cd);
		p.columnRslt_bd_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.bd_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_nm);
		p.columnRslt_ship_block_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_block_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_block_flg);
		p.columnRslt_ship_to_id_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_to_id_typ_META);
		p.columnRslt_ship_to_id_typ.addLinkBeans(p.columnRslt_ship_to_id_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_typ);
		p.columnRslt_ship_to_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_to_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_typ_nm);
		p.columnRslt_ship_to_id_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_to_id_cd_META);
		p.columnRslt_ship_to_id_cd.setListType(MCListType.STRICT);
		p.columnRslt_ship_to_id_cd.addLinkBeans(p.columnRslt_ship_to_id_nm,p.columnRslt_ship_to_zip_cd,p.columnRslt_ship_to_addr1,p.columnRslt_ship_to_addr2,p.columnRslt_ship_to_addr3,p.columnRslt_ship_to_addr4,p.columnRslt_ship_to_cntct_dpt,p.columnRslt_ship_to_cntct_psn,p.columnRslt_ship_to_tel,p.columnRslt_ship_to_fax,p.columnRslt_ship_to_sundry_flg,p.columnRslt_via_dlv_typ,p.columnRslt_cntry_cd,p.columnRslt_cntry_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_cd);
		p.columnRslt_ship_to_id_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_to_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_nm);
		p.RsltTable.addTable(p.Rslt_ship_to_addr_p_PPanel.AddrTable);
		p.columnRslt_ship_to_sundry_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_to_sundry_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_sundry_flg);
		p.columnRslt_via_dlv_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.via_dlv_typ_META);
		p.columnRslt_via_dlv_typ.addLinkBeans(p.columnRslt_via_dlv_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ);
		p.columnRslt_via_dlv_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.via_dlv_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ_nm);
		p.columnRslt_prov_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.prov_typ_META);
		p.columnRslt_prov_typ.addLinkBeans(p.columnRslt_prov_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_typ);
		p.columnRslt_prov_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.prov_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_typ_nm);
		p.columnRslt_prov_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.prov_basis_typ_META);
		p.columnRslt_prov_basis_typ.addLinkBeans(p.columnRslt_prov_basis_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_basis_typ);
		p.columnRslt_prov_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.prov_basis_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_basis_typ_nm);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_cur_cd_META);
		p.columnRslt_trd_cur_cd.addLinkBeans(p.columnRslt_trd_cur_nm,p.columnRslt_trd_cur_amt_dec_place,p.columnRslt_trd_cur_upri_dec_place);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.columnRslt_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_upri_dec_place);
		p.RsltTable.addTable(p.Rslt_prov_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnRslt_tax_nm, p.columnRslt_tax_rate, p.columnRslt_tax_typ, p.columnRslt_inc_tax_flg);
		p.columnRslt_prov_xrate_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.prov_xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_xrate_cd);
		p.columnRslt_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_inpt_flg);
		p.RsltTable.addTable(p.Rslt_xrate_p_PPanel.XrateTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_cur_cd_META);
		p.columnRslt_base_cur_cd.addLinkBeans(p.columnRslt_base_cur_nm,p.columnRslt_base_cur_amt_dec_place);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ptax_cur_cd_META);
		p.columnRslt_ptax_cur_cd.addLinkBeans(p.columnRslt_ptax_cur_nm,p.columnRslt_ptax_cur_amt_dec_place);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_ptax_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ptax_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_nm);
		p.columnRslt_ptax_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ptax_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_amt_dec_place);
		p.columnRslt_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ptax_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_inpt_flg);
		p.RsltTable.addTable(p.Rslt_ptax_xrate_p_PPanel.XrateTable);
		p.RsltTable.addTable(p.Rslt_ptax_amt_p_PPanel.AmtTable);
		p.columnRslt_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rate);
		p.RsltTable.addTable(p.Rslt_wtax_amt_p_PPanel.AmtTable);
		p.columnRslt_ret_prov_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_prov_typ_META);
		p.columnRslt_ret_prov_typ.addLinkBeans(p.columnRslt_ret_prov_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_prov_typ);
		p.columnRslt_ret_prov_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_prov_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_prov_typ_nm);
		p.columnRslt_ret_prov_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_prov_basis_typ_META);
		p.columnRslt_ret_prov_basis_typ.addLinkBeans(p.columnRslt_ret_prov_basis_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_prov_basis_typ);
		p.columnRslt_ret_prov_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_prov_basis_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_prov_basis_typ_nm);
		p.columnRslt_ret_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_trd_cur_cd_META);
		p.columnRslt_ret_trd_cur_cd.addLinkBeans(p.columnRslt_ret_trd_cur_nm,p.columnRslt_ret_trd_cur_amt_dec_place,p.columnRslt_ret_trd_cur_upri_dec_place);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_trd_cur_cd);
		p.columnRslt_ret_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_trd_cur_nm);
		p.columnRslt_ret_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_trd_cur_amt_dec_place);
		p.columnRslt_ret_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_trd_cur_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_trd_cur_upri_dec_place);
		p.RsltTable.addTable(p.Rslt_ret_prov_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnRslt_ret_tax_nm, p.columnRslt_ret_tax_rate, p.columnRslt_ret_tax_typ);
		p.columnRslt_ret_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_xrate_inpt_flg);
		p.RsltTable.addTable(p.Rslt_ret_xrate_p_PPanel.XrateTable);
		p.RsltTable.addTable(p.Rslt_ret_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ret_base_cur_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_ret_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_ptax_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_ptax_xrate_inpt_flg);
		p.RsltTable.addTable(p.Rslt_ret_ptax_xrate_p_PPanel.XrateTable);
		p.RsltTable.addTable(p.Rslt_ret_ptax_amt_p_PPanel.AmtTable);
		p.columnRslt_ret_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ret_wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_wtax_rate);
		p.RsltTable.addTable(p.Rslt_ret_wtax_amt_p_PPanel.AmtTable);
		p.columnRslt_base_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_dlv_slip_no);
		p.columnRslt_base_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_prov_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_prov_act_no);
		p.columnRslt_base_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.base_ac_dt_META);
		p.columnRslt_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_base_ac_dt);
		p.columnRslt_rqst_cnt_rmrks.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.rqst_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_cnt_rmrks);
		p.columnRslt_ship_cnt_rmrks.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ship_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_cnt_rmrks);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_xfr_src_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.xfr_src_typ_META);
		p.columnRslt_xfr_src_typ.addLinkBeans(p.columnRslt_xfr_src_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_xfr_src_typ);
		p.columnRslt_xfr_src_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.xfr_src_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xfr_src_typ_nm);
		p.columnRslt_xfr_src_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.xfr_src_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xfr_src_no);
		p.columnRslt_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.xfr_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xfr_schd_no);
		p.columnRslt_itm_ord_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_no);
		p.columnRslt_mfg_inst_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_no);
		p.columnRslt_oper_inst_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.oper_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_inst_no);
		p.columnRslt_inpt_schd_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.inpt_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inpt_schd_no);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_io_schd_pr_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.io_schd_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_pr_no);
		p.columnRslt_not_lot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.not_lot_mix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_lot_mix_flg);
		p.columnRslt_not_sublot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.not_sublot_mix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_sublot_mix_flg);
		p.columnRslt_vld_dt_fr.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.vld_dt_fr_META);
		p.columnRslt_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt_fr);
		p.columnRslt_vld_dt_to.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.vld_dt_to_META);
		p.columnRslt_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt_to);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rtn_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1000.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_gi_loc_cd.getListConfig().setPutter(getCnd_gi_loc_cd_ListPutter());
		Cnd_gi_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gi_str_ln_cd.getListConfig().setPutter(getCnd_gi_str_ln_cd_ListPutter());
		Cnd_gi_stk_arrv_bp_cd.getListConfig().setPutter(getCnd_gi_stk_arrv_bp_cd_ListPutter());
		Cnd_gi_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gi_site_cd.getListConfig().setPutter(getCnd_gi_site_cd_ListPutter());
		Cnd_gi_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gi_wg_cd.getListConfig().setPutter(getCnd_gi_wg_cd_ListPutter());
		Cnd_gi_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gi_lg_grp_cd.getListConfig().setPutter(getCnd_gi_lg_grp_cd_ListPutter());
		Cnd_gr_loc_cd.getListConfig().setPutter(getCnd_gr_loc_cd_ListPutter());
		Cnd_gr_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_str_ln_cd.getListConfig().setPutter(getCnd_gr_str_ln_cd_ListPutter());
		Cnd_gr_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_site_cd.getListConfig().setPutter(getCnd_gr_site_cd_ListPutter());
		Cnd_gr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_wg_cd.getListConfig().setPutter(getCnd_gr_wg_cd_ListPutter());
		Cnd_gr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gr_lg_grp_cd.getListConfig().setPutter(getCnd_gr_lg_grp_cd_ListPutter());
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
		Cnd_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_unit_cd.getListConfig().setPutter(getCnd_trd_unit_cd_ListPutter());
		Cnd_base_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_base_unit_cd.getListConfig().setPutter(getCnd_base_unit_cd_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_quality_typ.getListConfig().setPutter(getCnd_quality_typ_ListPutter());
		Cnd_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_id_typ.getListConfig().setPutter(getCnd_stk_id_typ_ListPutter());
		Cnd_stk_bp_cd.getListConfig().setPutter(getCnd_stk_bp_cd_ListPutter());
		Cnd_rqst_usr_cd.getListConfig().setPutter(getCnd_rqst_usr_cd_ListPutter());
		Cnd_rqst_dpt_cd.getListConfig().setPutter(getCnd_rqst_dpt_cd_ListPutter());
		Cnd_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_term_cd.getListConfig().setPutter(getCnd_ship_term_cd_ListPutter());
		Cnd_ship_inst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_inst_typ.getListConfig().setPutter(getCnd_ship_inst_typ_ListPutter());
		Cnd_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rsn_cd.getListConfig().setPutter(getCnd_rsn_cd_ListPutter());
		Cnd_bd_dpt_cd.getListConfig().setPutter(getCnd_bd_dpt_cd_ListPutter());
		Cnd_ship_to_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_to_id_typ.getListConfig().setPutter(getCnd_ship_to_id_typ_ListPutter());
		Cnd_ship_to_id_cd.getListConfig().setPutter(getCnd_ship_to_id_cd_ListPutter());
		Cnd_prov_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prov_typ.getListConfig().setPutter(getCnd_prov_typ_ListPutter());
		Cnd_prov_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prov_basis_typ.getListConfig().setPutter(getCnd_prov_basis_typ_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_tax_cd.getListConfig().setPutter(getCnd_tax_cd_ListPutter());
		Cnd_tax_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_tax_typ.getListConfig().setPutter(getCnd_tax_typ_ListPutter());
		Cnd_ptax_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ptax_cur_cd.getListConfig().setPutter(getCnd_ptax_cur_cd_ListPutter());
		Cnd_ret_prov_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ret_prov_typ.getListConfig().setPutter(getCnd_ret_prov_typ_ListPutter());
		Cnd_ret_prov_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ret_prov_basis_typ.getListConfig().setPutter(getCnd_ret_prov_basis_typ_ListPutter());
		Cnd_ret_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ret_trd_cur_cd.getListConfig().setPutter(getCnd_ret_trd_cur_cd_ListPutter());
		Cnd_ret_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ret_tax_cd.getListConfig().setPutter(getCnd_ret_tax_cd_ListPutter());
		Cnd_ret_tax_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ret_tax_typ.getListConfig().setPutter(getCnd_ret_tax_typ_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_xfr_src_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_xfr_src_typ.getListConfig().setPutter(getCnd_xfr_src_typ_ListPutter());
		columnRslt_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_cd.getListConfig().setPutter(getRslt_trd_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		Rslt_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getRslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getRslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
		columnRslt_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_unit_cd.getListConfig().setPutter(getRslt_trd_unit_cd_ListPutter());
		columnRslt_gi_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gi_loc_cd.getListConfig().setPutter(getRslt_gi_loc_cd_ListPutter());
		Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getRslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnRslt_gi_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gi_lg_grp_cd.getListConfig().setPutter(getRslt_gi_lg_grp_cd_ListPutter());
		columnRslt_gi_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gi_wg_cd.getListConfig().setPutter(getRslt_gi_wg_cd_ListPutter());
		columnRslt_gi_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gi_site_cd.getListConfig().setPutter(getRslt_gi_site_cd_ListPutter());
		columnRslt_gr_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gr_loc_cd.getListConfig().setPutter(getRslt_gr_loc_cd_ListPutter());
		Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getRslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnRslt_gr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gr_lg_grp_cd.getListConfig().setPutter(getRslt_gr_lg_grp_cd_ListPutter());
		columnRslt_gr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gr_wg_cd.getListConfig().setPutter(getRslt_gr_wg_cd_ListPutter());
		columnRslt_gr_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gr_site_cd.getListConfig().setPutter(getRslt_gr_site_cd_ListPutter());
		columnRslt_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_quality_typ.getListConfig().setPutter(getRslt_quality_typ_ListPutter());
		columnRslt_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gd_cd.getListConfig().setPutter(getRslt_gd_cd_ListPutter());
		columnRslt_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_stk_id_typ.getListConfig().setPutter(getRslt_stk_id_typ_ListPutter());
		Rslt_stk_bp_p_PPanel.columnStkBp_stk_bp_cd.getListConfig().setPutter(getRslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_ListPutter());
		columnRslt_gi_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gi_sppl_cd.getListConfig().setPutter(getRslt_gi_sppl_cd_ListPutter());
		columnRslt_gi_stk_arrv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gi_stk_arrv_bp_cd.getListConfig().setPutter(getRslt_gi_stk_arrv_bp_cd_ListPutter());
		columnRslt_gr_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_gr_sppl_cd.getListConfig().setPutter(getRslt_gr_sppl_cd_ListPutter());
		columnRslt_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ship_term_cd.getListConfig().setPutter(getRslt_ship_term_cd_ListPutter());
		columnRslt_ship_inst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ship_inst_typ.getListConfig().setPutter(getRslt_ship_inst_typ_ListPutter());
		columnRslt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_rsn_cd.getListConfig().setPutter(getRslt_rsn_cd_ListPutter());
		columnRslt_bd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_bd_dpt_cd.getListConfig().setPutter(getRslt_bd_dpt_cd_ListPutter());
		columnRslt_ship_to_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ship_to_id_typ.getListConfig().setPutter(getRslt_ship_to_id_typ_ListPutter());
		columnRslt_ship_to_id_cd.getListConfig().setPutter(getRslt_ship_to_id_cd_ListPutter());
		columnRslt_via_dlv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_via_dlv_typ.getListConfig().setPutter(getRslt_via_dlv_typ_ListPutter());
		columnRslt_prov_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_prov_typ.getListConfig().setPutter(getRslt_prov_typ_ListPutter());
		columnRslt_prov_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_prov_basis_typ.getListConfig().setPutter(getRslt_prov_basis_typ_ListPutter());
		columnRslt_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_cur_cd.getListConfig().setPutter(getRslt_trd_cur_cd_ListPutter());
		Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getRslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		columnRslt_base_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_base_cur_cd.getListConfig().setPutter(getRslt_base_cur_cd_ListPutter());
		columnRslt_ptax_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ptax_cur_cd.getListConfig().setPutter(getRslt_ptax_cur_cd_ListPutter());
		columnRslt_ret_prov_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ret_prov_typ.getListConfig().setPutter(getRslt_ret_prov_typ_ListPutter());
		columnRslt_ret_prov_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ret_prov_basis_typ.getListConfig().setPutter(getRslt_ret_prov_basis_typ_ListPutter());
		columnRslt_ret_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ret_trd_cur_cd.getListConfig().setPutter(getRslt_ret_trd_cur_cd_ListPutter());
		Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getRslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		columnRslt_xfr_src_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_xfr_src_typ.getListConfig().setPutter(getRslt_xfr_src_typ_ListPutter());
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
	 * この画面を[REQ_MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREQ_MODStatus() {
		status = REQ_MOD;
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
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (REQ_MOD.equals(status)) {
			setREQ_MODStatus();
		}
	}

	/**
	 * [Cnd_gi_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gi_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_gi_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gi_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_gi_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gi_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_gi_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gi_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_gi_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gi_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_gi_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gi_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_gr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
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
	 * [Cnd_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Cnd_base_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_base_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
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
	 * [Cnd_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_stk_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_ship_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipTerm");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_inst_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_inst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipInstTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.XfrBizRsn");
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
	 * [Cnd_ship_to_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_to_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ShipToIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_to_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_to_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.ShipToId");
		return lp;
	}
	 
	/**
	 * [Cnd_prov_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prov_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_prov_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prov_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvBasisTyp");
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
		lp.setListLogicId("MA.MAUAP0010.Tax");
		return lp;
	}
	 
	/**
	 * [Cnd_tax_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tax_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.TaxTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ptax_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ptax_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_ret_prov_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ret_prov_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ret_prov_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ret_prov_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvBasisTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ret_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ret_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_ret_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ret_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tax");
		return lp;
	}
	 
	/**
	 * [Cnd_ret_tax_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ret_tax_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.TaxTyp");
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
	 * [Cnd_xfr_src_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_xfr_src_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.XfrSrcTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
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
	 * [Rslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}

	/**
	 * [Rslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}

	/**
	 * [Rslt_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Rslt_gi_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gi_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Rslt_gi_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gi_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Rslt_gi_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gi_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Rslt_gi_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gi_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Rslt_gr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Rslt_gr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Rslt_gr_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gr_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Rslt_gr_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gr_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Rslt_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Rslt_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}

	/**
	 * [Rslt_gi_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gi_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_gi_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gi_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_gr_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_gr_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_ship_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ship_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipTerm");
		return lp;
	}
	 
	/**
	 * [Rslt_ship_inst_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ship_inst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipInstTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.XfrBizRsn");
		return lp;
	}
	 
	/**
	 * [Rslt_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Rslt_ship_to_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ship_to_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ShipToIdTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_ship_to_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ship_to_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.ShipToId");
		return lp;
	}
	 
	/**
	 * [Rslt_via_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_via_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ViaDlvTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_prov_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_prov_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.ProvTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_prov_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_prov_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvBasisTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tax");
		return lp;
	}

	/**
	 * [Rslt_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rslt_ptax_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ptax_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rslt_ret_prov_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ret_prov_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_ret_prov_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ret_prov_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvBasisTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_ret_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ret_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tax");
		return lp;
	}

	/**
	 * [Rslt_xfr_src_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_xfr_src_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.XfrSrcTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_gi_loc_cd) return getCnd_gi_loc_cd(row, info);
		if(combo == Cnd_gi_str_ln_cd) return getCnd_gi_str_ln_cd(row, info);
		if(combo == Cnd_gi_stk_arrv_bp_cd) return getCnd_gi_stk_arrv_bp_cd(row, info);
		if(combo == Cnd_gi_site_cd) return getCnd_gi_site_cd(row, info);
		if(combo == Cnd_gi_wg_cd) return getCnd_gi_wg_cd(row, info);
		if(combo == Cnd_gi_lg_grp_cd) return getCnd_gi_lg_grp_cd(row, info);
		if(combo == Cnd_gr_loc_cd) return getCnd_gr_loc_cd(row, info);
		if(combo == Cnd_gr_str_ln_cd) return getCnd_gr_str_ln_cd(row, info);
		if(combo == Cnd_gr_site_cd) return getCnd_gr_site_cd(row, info);
		if(combo == Cnd_gr_wg_cd) return getCnd_gr_wg_cd(row, info);
		if(combo == Cnd_gr_lg_grp_cd) return getCnd_gr_lg_grp_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_trd_unit_cd) return getCnd_trd_unit_cd(row, info);
		if(combo == Cnd_base_unit_cd) return getCnd_base_unit_cd(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_quality_typ) return getCnd_quality_typ(row, info);
		if(combo == Cnd_stk_id_typ) return getCnd_stk_id_typ(row, info);
		if(combo == Cnd_stk_bp_cd) return getCnd_stk_bp_cd(row, info);
		if(combo == Cnd_rqst_usr_cd) return getCnd_rqst_usr_cd(row, info);
		if(combo == Cnd_rqst_dpt_cd) return getCnd_rqst_dpt_cd(row, info);
		if(combo == Cnd_ship_term_cd) return getCnd_ship_term_cd(row, info);
		if(combo == Cnd_ship_inst_typ) return getCnd_ship_inst_typ(row, info);
		if(combo == Cnd_rsn_cd) return getCnd_rsn_cd(row, info);
		if(combo == Cnd_bd_dpt_cd) return getCnd_bd_dpt_cd(row, info);
		if(combo == Cnd_ship_to_id_typ) return getCnd_ship_to_id_typ(row, info);
		if(combo == Cnd_ship_to_id_cd) return getCnd_ship_to_id_cd(row, info);
		if(combo == Cnd_prov_typ) return getCnd_prov_typ(row, info);
		if(combo == Cnd_prov_basis_typ) return getCnd_prov_basis_typ(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_tax_cd) return getCnd_tax_cd(row, info);
		if(combo == Cnd_tax_typ) return getCnd_tax_typ(row, info);
		if(combo == Cnd_ptax_cur_cd) return getCnd_ptax_cur_cd(row, info);
		if(combo == Cnd_ret_prov_typ) return getCnd_ret_prov_typ(row, info);
		if(combo == Cnd_ret_prov_basis_typ) return getCnd_ret_prov_basis_typ(row, info);
		if(combo == Cnd_ret_trd_cur_cd) return getCnd_ret_trd_cur_cd(row, info);
		if(combo == Cnd_ret_tax_cd) return getCnd_ret_tax_cd(row, info);
		if(combo == Cnd_ret_tax_typ) return getCnd_ret_tax_typ(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_xfr_src_typ) return getCnd_xfr_src_typ(row, info);
		if(combo == columnRslt_trd_cd) return getRslt_trd_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == Rslt_lot_no_p_PPanel.columnLotNo_lot_no) return getRslt_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == Rslt_lot_no_p_PPanel.columnLotNo_sublot_no) return getRslt_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		if(combo == columnRslt_trd_unit_cd) return getRslt_trd_unit_cd(row, info);
		if(combo == columnRslt_gi_loc_cd) return getRslt_gi_loc_cd(row, info);
		if(combo == Rslt_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getRslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == columnRslt_gi_lg_grp_cd) return getRslt_gi_lg_grp_cd(row, info);
		if(combo == columnRslt_gi_wg_cd) return getRslt_gi_wg_cd(row, info);
		if(combo == columnRslt_gi_site_cd) return getRslt_gi_site_cd(row, info);
		if(combo == columnRslt_gr_loc_cd) return getRslt_gr_loc_cd(row, info);
		if(combo == Rslt_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getRslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == columnRslt_gr_lg_grp_cd) return getRslt_gr_lg_grp_cd(row, info);
		if(combo == columnRslt_gr_wg_cd) return getRslt_gr_wg_cd(row, info);
		if(combo == columnRslt_gr_site_cd) return getRslt_gr_site_cd(row, info);
		if(combo == columnRslt_quality_typ) return getRslt_quality_typ(row, info);
		if(combo == columnRslt_gd_cd) return getRslt_gd_cd(row, info);
		if(combo == columnRslt_stk_id_typ) return getRslt_stk_id_typ(row, info);
		if(combo == Rslt_stk_bp_p_PPanel.columnStkBp_stk_bp_cd) return getRslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd(row, info);
		if(combo == columnRslt_gi_sppl_cd) return getRslt_gi_sppl_cd(row, info);
		if(combo == columnRslt_gi_stk_arrv_bp_cd) return getRslt_gi_stk_arrv_bp_cd(row, info);
		if(combo == columnRslt_gr_sppl_cd) return getRslt_gr_sppl_cd(row, info);
		if(combo == columnRslt_ship_term_cd) return getRslt_ship_term_cd(row, info);
		if(combo == columnRslt_ship_inst_typ) return getRslt_ship_inst_typ(row, info);
		if(combo == columnRslt_rsn_cd) return getRslt_rsn_cd(row, info);
		if(combo == columnRslt_bd_dpt_cd) return getRslt_bd_dpt_cd(row, info);
		if(combo == columnRslt_ship_to_id_typ) return getRslt_ship_to_id_typ(row, info);
		if(combo == columnRslt_ship_to_id_cd) return getRslt_ship_to_id_cd(row, info);
		if(combo == columnRslt_via_dlv_typ) return getRslt_via_dlv_typ(row, info);
		if(combo == columnRslt_prov_typ) return getRslt_prov_typ(row, info);
		if(combo == columnRslt_prov_basis_typ) return getRslt_prov_basis_typ(row, info);
		if(combo == columnRslt_trd_cur_cd) return getRslt_trd_cur_cd(row, info);
		if(combo == Rslt_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getRslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == columnRslt_base_cur_cd) return getRslt_base_cur_cd(row, info);
		if(combo == columnRslt_ptax_cur_cd) return getRslt_ptax_cur_cd(row, info);
		if(combo == columnRslt_ret_prov_typ) return getRslt_ret_prov_typ(row, info);
		if(combo == columnRslt_ret_prov_basis_typ) return getRslt_ret_prov_basis_typ(row, info);
		if(combo == columnRslt_ret_trd_cur_cd) return getRslt_ret_trd_cur_cd(row, info);
		if(combo == Rslt_ret_prov_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getRslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == columnRslt_xfr_src_typ) return getRslt_xfr_src_typ(row, info);
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
		else if (ap == Btn_open_dtl) doBtn_open_dtl(info);
		else if (ap == Btn_sprt_ac_dt) doBtn_sprt_ac_dt(info);
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
	 * [Btn]パネルの[open_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_dtl(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_ac_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_ac_dt(MCEventInfo info);

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
		if (vc == Cnd_rqst_mod_t_flg) return doCnd_rqst_mod_t_flg_VC(info);
		if (vc == Cnd_rqst_mod_f_flg) return doCnd_rqst_mod_f_flg_VC(info);
		if (vc == Cnd_rqst_can_t_flg) return doCnd_rqst_can_t_flg_VC(info);
		if (vc == Cnd_rqst_can_f_flg) return doCnd_rqst_can_f_flg_VC(info);
		if (vc == Cnd_rcpt_dt_fr) return doCnd_rcpt_dt_fr_VC(info);
		if (vc == Cnd_rcpt_dt_to) return doCnd_rcpt_dt_to_VC(info);
		if (vc == Cnd_inst_inc_flg) return doCnd_inst_inc_flg_VC(info);
		if (vc == Cnd_gi_loc_cd) return doCnd_gi_loc_cd_VC(info);
		if (vc == Cnd_gi_loc_nm) return doCnd_gi_loc_nm_VC(info);
		if (vc == Cnd_gi_str_ln_cd) return doCnd_gi_str_ln_cd_VC(info);
		if (vc == Cnd_gi_str_ln_nm) return doCnd_gi_str_ln_nm_VC(info);
		if (vc == Cnd_gi_stk_arrv_bp_cd) return doCnd_gi_stk_arrv_bp_cd_VC(info);
		if (vc == Cnd_gi_stk_arrv_bp_nm) return doCnd_gi_stk_arrv_bp_nm_VC(info);
		if (vc == Cnd_gi_site_cd) return doCnd_gi_site_cd_VC(info);
		if (vc == Cnd_gi_site_nm) return doCnd_gi_site_nm_VC(info);
		if (vc == Cnd_gi_wg_cd) return doCnd_gi_wg_cd_VC(info);
		if (vc == Cnd_gi_wg_nm) return doCnd_gi_wg_nm_VC(info);
		if (vc == Cnd_gi_lg_grp_cd) return doCnd_gi_lg_grp_cd_VC(info);
		if (vc == Cnd_gi_lg_grp_nm) return doCnd_gi_lg_grp_nm_VC(info);
		if (vc == Cnd_gr_loc_cd) return doCnd_gr_loc_cd_VC(info);
		if (vc == Cnd_gr_loc_nm) return doCnd_gr_loc_nm_VC(info);
		if (vc == Cnd_gr_str_ln_cd) return doCnd_gr_str_ln_cd_VC(info);
		if (vc == Cnd_gr_str_ln_nm) return doCnd_gr_str_ln_nm_VC(info);
		if (vc == Cnd_gr_site_cd) return doCnd_gr_site_cd_VC(info);
		if (vc == Cnd_gr_site_nm) return doCnd_gr_site_nm_VC(info);
		if (vc == Cnd_gr_wg_cd) return doCnd_gr_wg_cd_VC(info);
		if (vc == Cnd_gr_wg_nm) return doCnd_gr_wg_nm_VC(info);
		if (vc == Cnd_gr_lg_grp_cd) return doCnd_gr_lg_grp_cd_VC(info);
		if (vc == Cnd_gr_lg_grp_nm) return doCnd_gr_lg_grp_nm_VC(info);
		if (vc == Cnd_def_ver_flg) return doCnd_def_ver_flg_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_trd_unit_cd) return doCnd_trd_unit_cd_VC(info);
		if (vc == Cnd_trd_unit_nm) return doCnd_trd_unit_nm_VC(info);
		if (vc == Cnd_base_unit_cd) return doCnd_base_unit_cd_VC(info);
		if (vc == Cnd_base_unit_nm) return doCnd_base_unit_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_quality_typ) return doCnd_quality_typ_VC(info);
		if (vc == Cnd_quality_typ_nm) return doCnd_quality_typ_nm_VC(info);
		if (vc == Cnd_stk_id_typ) return doCnd_stk_id_typ_VC(info);
		if (vc == Cnd_stk_id_typ_nm) return doCnd_stk_id_typ_nm_VC(info);
		if (vc == Cnd_stk_bp_cd) return doCnd_stk_bp_cd_VC(info);
		if (vc == Cnd_stk_bp_nm) return doCnd_stk_bp_nm_VC(info);
		if (vc == Cnd_rqst_usr_cd) return doCnd_rqst_usr_cd_VC(info);
		if (vc == Cnd_rqst_usr_nm) return doCnd_rqst_usr_nm_VC(info);
		if (vc == Cnd_rqst_dpt_cd) return doCnd_rqst_dpt_cd_VC(info);
		if (vc == Cnd_rqst_dpt_nm) return doCnd_rqst_dpt_nm_VC(info);
		if (vc == Cnd_ship_term_cd) return doCnd_ship_term_cd_VC(info);
		if (vc == Cnd_ship_term_nm) return doCnd_ship_term_nm_VC(info);
		if (vc == Cnd_ship_inst_typ) return doCnd_ship_inst_typ_VC(info);
		if (vc == Cnd_ship_inst_typ_nm) return doCnd_ship_inst_typ_nm_VC(info);
		if (vc == Cnd_rsn_cd) return doCnd_rsn_cd_VC(info);
		if (vc == Cnd_rsn_nm) return doCnd_rsn_nm_VC(info);
		if (vc == Cnd_bd_dpt_cd) return doCnd_bd_dpt_cd_VC(info);
		if (vc == Cnd_bd_dpt_nm) return doCnd_bd_dpt_nm_VC(info);
		if (vc == Cnd_ship_to_id_typ) return doCnd_ship_to_id_typ_VC(info);
		if (vc == Cnd_ship_to_id_typ_nm) return doCnd_ship_to_id_typ_nm_VC(info);
		if (vc == Cnd_ship_to_id_cd) return doCnd_ship_to_id_cd_VC(info);
		if (vc == Cnd_ship_to_id_nm) return doCnd_ship_to_id_nm_VC(info);
		if (vc == Cnd_prov_typ) return doCnd_prov_typ_VC(info);
		if (vc == Cnd_prov_typ_nm) return doCnd_prov_typ_nm_VC(info);
		if (vc == Cnd_prov_basis_typ) return doCnd_prov_basis_typ_VC(info);
		if (vc == Cnd_prov_basis_typ_nm) return doCnd_prov_basis_typ_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_tax_cd) return doCnd_tax_cd_VC(info);
		if (vc == Cnd_tax_nm) return doCnd_tax_nm_VC(info);
		if (vc == Cnd_tax_typ) return doCnd_tax_typ_VC(info);
		if (vc == Cnd_tax_typ_nm) return doCnd_tax_typ_nm_VC(info);
		if (vc == Cnd_ptax_cur_cd) return doCnd_ptax_cur_cd_VC(info);
		if (vc == Cnd_ptax_cur_nm) return doCnd_ptax_cur_nm_VC(info);
		if (vc == Cnd_ret_prov_typ) return doCnd_ret_prov_typ_VC(info);
		if (vc == Cnd_ret_prov_typ_nm) return doCnd_ret_prov_typ_nm_VC(info);
		if (vc == Cnd_ret_prov_basis_typ) return doCnd_ret_prov_basis_typ_VC(info);
		if (vc == Cnd_ret_prov_basis_typ_nm) return doCnd_ret_prov_basis_typ_nm_VC(info);
		if (vc == Cnd_ret_trd_cur_cd) return doCnd_ret_trd_cur_cd_VC(info);
		if (vc == Cnd_ret_trd_cur_nm) return doCnd_ret_trd_cur_nm_VC(info);
		if (vc == Cnd_ret_tax_cd) return doCnd_ret_tax_cd_VC(info);
		if (vc == Cnd_ret_tax_nm) return doCnd_ret_tax_nm_VC(info);
		if (vc == Cnd_ret_tax_typ) return doCnd_ret_tax_typ_VC(info);
		if (vc == Cnd_ret_tax_typ_nm) return doCnd_ret_tax_typ_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_rqst_cnt_rmrks) return doCnd_rqst_cnt_rmrks_VC(info);
		if (vc == Cnd_ship_cnt_rmrks) return doCnd_ship_cnt_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_xfr_src_typ) return doCnd_xfr_src_typ_VC(info);
		if (vc == Cnd_xfr_src_typ_nm) return doCnd_xfr_src_typ_nm_VC(info);
		if (vc == Cnd_xfr_src_no) return doCnd_xfr_src_no_VC(info);
		if (vc == Cnd_xfr_schd_no) return doCnd_xfr_schd_no_VC(info);
		if (vc == Cnd_itm_ord_no) return doCnd_itm_ord_no_VC(info);
		if (vc == Cnd_mfg_inst_no) return doCnd_mfg_inst_no_VC(info);
		if (vc == Cnd_oper_inst_no) return doCnd_oper_inst_no_VC(info);
		if (vc == Cnd_inpt_schd_no) return doCnd_inpt_schd_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == BulkSet_rcpt_dt) return doBulkSet_rcpt_dt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_lot_mng_typ) return doRslt_lot_mng_typ_VC(info);
		if (vc == columnRslt_sublot_mng_typ) return doRslt_sublot_mng_typ_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_asset_mng_typ) return doRslt_asset_mng_typ_VC(info);
		if (vc == columnRslt_prov_upri_cng_flg) return doRslt_prov_upri_cng_flg_VC(info);
		if (vc == columnRslt_dscnt_itm_flg) return doRslt_dscnt_itm_flg_VC(info);
		if (vc == columnRslt_alloc_flg) return doRslt_alloc_flg_VC(info);
		if (vc == columnRslt_lot_none_flg) return doRslt_lot_none_flg_VC(info);
		if (vc == columnRslt_ver_flg) return doRslt_ver_flg_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_conv_base_qty) return doRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_trd_unit_conv_qty) return doRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_rnd_typ) return doRslt_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_gi_loc_cd) return doRslt_gi_loc_cd_VC(info);
		if (vc == columnRslt_gi_loc_nm) return doRslt_gi_loc_nm_VC(info);
		if (vc == columnRslt_gi_str_ln_tgt_flg) return doRslt_gi_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt_gi_lg_grp_cd) return doRslt_gi_lg_grp_cd_VC(info);
		if (vc == columnRslt_gi_lg_grp_nm) return doRslt_gi_lg_grp_nm_VC(info);
		if (vc == columnRslt_gi_wg_cd) return doRslt_gi_wg_cd_VC(info);
		if (vc == columnRslt_gi_wg_nm) return doRslt_gi_wg_nm_VC(info);
		if (vc == columnRslt_gi_site_cd) return doRslt_gi_site_cd_VC(info);
		if (vc == columnRslt_gi_site_nm) return doRslt_gi_site_nm_VC(info);
		if (vc == columnRslt_gr_loc_cd) return doRslt_gr_loc_cd_VC(info);
		if (vc == columnRslt_gr_loc_nm) return doRslt_gr_loc_nm_VC(info);
		if (vc == columnRslt_gr_str_ln_tgt_flg) return doRslt_gr_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt_gr_lg_grp_cd) return doRslt_gr_lg_grp_cd_VC(info);
		if (vc == columnRslt_gr_lg_grp_nm) return doRslt_gr_lg_grp_nm_VC(info);
		if (vc == columnRslt_gr_wg_cd) return doRslt_gr_wg_cd_VC(info);
		if (vc == columnRslt_gr_wg_nm) return doRslt_gr_wg_nm_VC(info);
		if (vc == columnRslt_gr_site_cd) return doRslt_gr_site_cd_VC(info);
		if (vc == columnRslt_gr_site_nm) return doRslt_gr_site_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_gi_sppl_cd) return doRslt_gi_sppl_cd_VC(info);
		if (vc == columnRslt_gi_cur_cd) return doRslt_gi_cur_cd_VC(info);
		if (vc == columnRslt_gi_subcon_flg) return doRslt_gi_subcon_flg_VC(info);
		if (vc == columnRslt_gi_onr_prsppl_flg) return doRslt_gi_onr_prsppl_flg_VC(info);
		if (vc == columnRslt_gi_prov_upri_cng_flg) return doRslt_gi_prov_upri_cng_flg_VC(info);
		if (vc == columnRslt_gi_prov_amt_rnd_typ) return doRslt_gi_prov_amt_rnd_typ_VC(info);
		if (vc == columnRslt_gi_prov_tax_rnd_typ) return doRslt_gi_prov_tax_rnd_typ_VC(info);
		if (vc == columnRslt_gi_stk_arrv_bp_cd) return doRslt_gi_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_gi_stk_arrv_bp_nm) return doRslt_gi_stk_arrv_bp_nm_VC(info);
		if (vc == columnRslt_gr_sppl_cd) return doRslt_gr_sppl_cd_VC(info);
		if (vc == columnRslt_gr_cur_cd) return doRslt_gr_cur_cd_VC(info);
		if (vc == columnRslt_gr_subcon_flg) return doRslt_gr_subcon_flg_VC(info);
		if (vc == columnRslt_gr_onr_prsppl_flg) return doRslt_gr_onr_prsppl_flg_VC(info);
		if (vc == columnRslt_gr_prov_rcv_typ) return doRslt_gr_prov_rcv_typ_VC(info);
		if (vc == columnRslt_gr_prov_basis_typ) return doRslt_gr_prov_basis_typ_VC(info);
		if (vc == columnRslt_gr_prov_upri_cng_flg) return doRslt_gr_prov_upri_cng_flg_VC(info);
		if (vc == columnRslt_gr_prov_amt_rnd_typ) return doRslt_gr_prov_amt_rnd_typ_VC(info);
		if (vc == columnRslt_gr_prov_tax_rnd_typ) return doRslt_gr_prov_tax_rnd_typ_VC(info);
		if (vc == columnRslt_rcpt_dt) return doRslt_rcpt_dt_VC(info);
		if (vc == columnRslt_iv_trd_flg) return doRslt_iv_trd_flg_VC(info);
		if (vc == columnRslt_ship_schd_tm) return doRslt_ship_schd_tm_VC(info);
		if (vc == columnRslt_dlv_schd_tm) return doRslt_dlv_schd_tm_VC(info);
		if (vc == columnRslt_rqst_mod_flg) return doRslt_rqst_mod_flg_VC(info);
		if (vc == columnRslt_rqst_can_flg) return doRslt_rqst_can_flg_VC(info);
		if (vc == columnRslt_ship_term_cd) return doRslt_ship_term_cd_VC(info);
		if (vc == columnRslt_ship_term_nm) return doRslt_ship_term_nm_VC(info);
		if (vc == columnRslt_ship_term_cd_inv) return doRslt_ship_term_cd_inv_VC(info);
		if (vc == columnRslt_ship_inst_typ) return doRslt_ship_inst_typ_VC(info);
		if (vc == columnRslt_ship_inst_typ_nm) return doRslt_ship_inst_typ_nm_VC(info);
		if (vc == columnRslt_rsn_cd) return doRslt_rsn_cd_VC(info);
		if (vc == columnRslt_rsn_nm) return doRslt_rsn_nm_VC(info);
		if (vc == columnRslt_acxfr_gi_flg) return doRslt_acxfr_gi_flg_VC(info);
		if (vc == columnRslt_bd_dpt_cd) return doRslt_bd_dpt_cd_VC(info);
		if (vc == columnRslt_bd_dpt_nm) return doRslt_bd_dpt_nm_VC(info);
		if (vc == columnRslt_ship_block_flg) return doRslt_ship_block_flg_VC(info);
		if (vc == columnRslt_ship_to_id_typ) return doRslt_ship_to_id_typ_VC(info);
		if (vc == columnRslt_ship_to_id_typ_nm) return doRslt_ship_to_id_typ_nm_VC(info);
		if (vc == columnRslt_ship_to_id_cd) return doRslt_ship_to_id_cd_VC(info);
		if (vc == columnRslt_ship_to_id_nm) return doRslt_ship_to_id_nm_VC(info);
		if (vc == columnRslt_ship_to_sundry_flg) return doRslt_ship_to_sundry_flg_VC(info);
		if (vc == columnRslt_via_dlv_typ) return doRslt_via_dlv_typ_VC(info);
		if (vc == columnRslt_via_dlv_typ_nm) return doRslt_via_dlv_typ_nm_VC(info);
		if (vc == columnRslt_prov_typ) return doRslt_prov_typ_VC(info);
		if (vc == columnRslt_prov_typ_nm) return doRslt_prov_typ_nm_VC(info);
		if (vc == columnRslt_prov_basis_typ) return doRslt_prov_basis_typ_VC(info);
		if (vc == columnRslt_prov_basis_typ_nm) return doRslt_prov_basis_typ_nm_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_upri_dec_place) return doRslt_trd_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_prov_xrate_cd) return doRslt_prov_xrate_cd_VC(info);
		if (vc == columnRslt_xrate_inpt_flg) return doRslt_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_ptax_cur_nm) return doRslt_ptax_cur_nm_VC(info);
		if (vc == columnRslt_ptax_cur_amt_dec_place) return doRslt_ptax_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_ptax_xrate_inpt_flg) return doRslt_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_wtax_rate) return doRslt_wtax_rate_VC(info);
		if (vc == columnRslt_ret_prov_typ) return doRslt_ret_prov_typ_VC(info);
		if (vc == columnRslt_ret_prov_typ_nm) return doRslt_ret_prov_typ_nm_VC(info);
		if (vc == columnRslt_ret_prov_basis_typ) return doRslt_ret_prov_basis_typ_VC(info);
		if (vc == columnRslt_ret_prov_basis_typ_nm) return doRslt_ret_prov_basis_typ_nm_VC(info);
		if (vc == columnRslt_ret_trd_cur_cd) return doRslt_ret_trd_cur_cd_VC(info);
		if (vc == columnRslt_ret_trd_cur_nm) return doRslt_ret_trd_cur_nm_VC(info);
		if (vc == columnRslt_ret_trd_cur_amt_dec_place) return doRslt_ret_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_ret_trd_cur_upri_dec_place) return doRslt_ret_trd_cur_upri_dec_place_VC(info);
		if (vc == columnRslt_ret_xrate_inpt_flg) return doRslt_ret_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_ret_ptax_xrate_inpt_flg) return doRslt_ret_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_ret_wtax_rate) return doRslt_ret_wtax_rate_VC(info);
		if (vc == columnRslt_base_dlv_slip_no) return doRslt_base_dlv_slip_no_VC(info);
		if (vc == columnRslt_base_prov_act_no) return doRslt_base_prov_act_no_VC(info);
		if (vc == columnRslt_base_ac_dt) return doRslt_base_ac_dt_VC(info);
		if (vc == columnRslt_rqst_cnt_rmrks) return doRslt_rqst_cnt_rmrks_VC(info);
		if (vc == columnRslt_ship_cnt_rmrks) return doRslt_ship_cnt_rmrks_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_xfr_src_typ) return doRslt_xfr_src_typ_VC(info);
		if (vc == columnRslt_xfr_src_typ_nm) return doRslt_xfr_src_typ_nm_VC(info);
		if (vc == columnRslt_xfr_src_no) return doRslt_xfr_src_no_VC(info);
		if (vc == columnRslt_xfr_schd_no) return doRslt_xfr_schd_no_VC(info);
		if (vc == columnRslt_itm_ord_no) return doRslt_itm_ord_no_VC(info);
		if (vc == columnRslt_mfg_inst_no) return doRslt_mfg_inst_no_VC(info);
		if (vc == columnRslt_oper_inst_no) return doRslt_oper_inst_no_VC(info);
		if (vc == columnRslt_inpt_schd_no) return doRslt_inpt_schd_no_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_io_schd_pr_no) return doRslt_io_schd_pr_no_VC(info);
		if (vc == columnRslt_not_lot_mix_flg) return doRslt_not_lot_mix_flg_VC(info);
		if (vc == columnRslt_not_sublot_mix_flg) return doRslt_not_sublot_mix_flg_VC(info);
		if (vc == columnRslt_vld_dt_fr) return doRslt_vld_dt_fr_VC(info);
		if (vc == columnRslt_vld_dt_to) return doRslt_vld_dt_to_VC(info);
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
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
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
	 * [Cnd]パネルの[rqst_mod_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_mod_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_mod_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_mod_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_can_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_can_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_can_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_can_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_inc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_inc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[def_ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_def_ver_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_unit_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_bp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_basis_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[tax_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_prov_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_tax_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_tax_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[xfr_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xfr_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xfr_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_schd_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inpt_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_schd_no_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rcpt_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prov_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_itm_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_none_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_rnd_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_site_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_subcon_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_onr_prsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_onr_prsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_prov_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_prov_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_prov_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_prov_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_prov_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_prov_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_subcon_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_onr_prsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_onr_prsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_prov_rcv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_prov_rcv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_prov_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_prov_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_prov_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_prov_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gr_prov_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gr_prov_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_trd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_trd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_schd_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_schd_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_schd_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_schd_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_mod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_mod_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_term_cd_inv]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_term_cd_inv_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[acxfr_gi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_gi_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_block_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_block_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_sundry_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prov_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_xrate_cd_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_amt_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_amt_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ret_prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_prov_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_trd_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_ptax_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_prov_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xfr_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xfr_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xfr_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xfr_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xfr_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xfr_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inpt_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inpt_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_to_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == Cnd_rqst_mod_t_flg) doCnd_rqst_mod_t_flg_NC(info);
		else if (nc == Cnd_rqst_mod_f_flg) doCnd_rqst_mod_f_flg_NC(info);
		else if (nc == Cnd_rqst_can_t_flg) doCnd_rqst_can_t_flg_NC(info);
		else if (nc == Cnd_rqst_can_f_flg) doCnd_rqst_can_f_flg_NC(info);
		else if (nc == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_NC(info);
		else if (nc == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_NC(info);
		else if (nc == Cnd_inst_inc_flg) doCnd_inst_inc_flg_NC(info);
		else if (nc == Cnd_gi_loc_cd) doCnd_gi_loc_cd_NC(info);
		else if (nc == Cnd_gi_loc_nm) doCnd_gi_loc_nm_NC(info);
		else if (nc == Cnd_gi_str_ln_cd) doCnd_gi_str_ln_cd_NC(info);
		else if (nc == Cnd_gi_str_ln_nm) doCnd_gi_str_ln_nm_NC(info);
		else if (nc == Cnd_gi_stk_arrv_bp_cd) doCnd_gi_stk_arrv_bp_cd_NC(info);
		else if (nc == Cnd_gi_stk_arrv_bp_nm) doCnd_gi_stk_arrv_bp_nm_NC(info);
		else if (nc == Cnd_gi_site_cd) doCnd_gi_site_cd_NC(info);
		else if (nc == Cnd_gi_site_nm) doCnd_gi_site_nm_NC(info);
		else if (nc == Cnd_gi_wg_cd) doCnd_gi_wg_cd_NC(info);
		else if (nc == Cnd_gi_wg_nm) doCnd_gi_wg_nm_NC(info);
		else if (nc == Cnd_gi_lg_grp_cd) doCnd_gi_lg_grp_cd_NC(info);
		else if (nc == Cnd_gi_lg_grp_nm) doCnd_gi_lg_grp_nm_NC(info);
		else if (nc == Cnd_gr_loc_cd) doCnd_gr_loc_cd_NC(info);
		else if (nc == Cnd_gr_loc_nm) doCnd_gr_loc_nm_NC(info);
		else if (nc == Cnd_gr_str_ln_cd) doCnd_gr_str_ln_cd_NC(info);
		else if (nc == Cnd_gr_str_ln_nm) doCnd_gr_str_ln_nm_NC(info);
		else if (nc == Cnd_gr_site_cd) doCnd_gr_site_cd_NC(info);
		else if (nc == Cnd_gr_site_nm) doCnd_gr_site_nm_NC(info);
		else if (nc == Cnd_gr_wg_cd) doCnd_gr_wg_cd_NC(info);
		else if (nc == Cnd_gr_wg_nm) doCnd_gr_wg_nm_NC(info);
		else if (nc == Cnd_gr_lg_grp_cd) doCnd_gr_lg_grp_cd_NC(info);
		else if (nc == Cnd_gr_lg_grp_nm) doCnd_gr_lg_grp_nm_NC(info);
		else if (nc == Cnd_def_ver_flg) doCnd_def_ver_flg_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_trd_unit_cd) doCnd_trd_unit_cd_NC(info);
		else if (nc == Cnd_trd_unit_nm) doCnd_trd_unit_nm_NC(info);
		else if (nc == Cnd_base_unit_cd) doCnd_base_unit_cd_NC(info);
		else if (nc == Cnd_base_unit_nm) doCnd_base_unit_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_quality_typ) doCnd_quality_typ_NC(info);
		else if (nc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NC(info);
		else if (nc == Cnd_stk_id_typ) doCnd_stk_id_typ_NC(info);
		else if (nc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NC(info);
		else if (nc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NC(info);
		else if (nc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NC(info);
		else if (nc == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_NC(info);
		else if (nc == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_NC(info);
		else if (nc == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_NC(info);
		else if (nc == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_NC(info);
		else if (nc == Cnd_ship_term_cd) doCnd_ship_term_cd_NC(info);
		else if (nc == Cnd_ship_term_nm) doCnd_ship_term_nm_NC(info);
		else if (nc == Cnd_ship_inst_typ) doCnd_ship_inst_typ_NC(info);
		else if (nc == Cnd_ship_inst_typ_nm) doCnd_ship_inst_typ_nm_NC(info);
		else if (nc == Cnd_rsn_cd) doCnd_rsn_cd_NC(info);
		else if (nc == Cnd_rsn_nm) doCnd_rsn_nm_NC(info);
		else if (nc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NC(info);
		else if (nc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NC(info);
		else if (nc == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_NC(info);
		else if (nc == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_NC(info);
		else if (nc == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_NC(info);
		else if (nc == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_NC(info);
		else if (nc == Cnd_prov_typ) doCnd_prov_typ_NC(info);
		else if (nc == Cnd_prov_typ_nm) doCnd_prov_typ_nm_NC(info);
		else if (nc == Cnd_prov_basis_typ) doCnd_prov_basis_typ_NC(info);
		else if (nc == Cnd_prov_basis_typ_nm) doCnd_prov_basis_typ_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_tax_cd) doCnd_tax_cd_NC(info);
		else if (nc == Cnd_tax_nm) doCnd_tax_nm_NC(info);
		else if (nc == Cnd_tax_typ) doCnd_tax_typ_NC(info);
		else if (nc == Cnd_tax_typ_nm) doCnd_tax_typ_nm_NC(info);
		else if (nc == Cnd_ptax_cur_cd) doCnd_ptax_cur_cd_NC(info);
		else if (nc == Cnd_ptax_cur_nm) doCnd_ptax_cur_nm_NC(info);
		else if (nc == Cnd_ret_prov_typ) doCnd_ret_prov_typ_NC(info);
		else if (nc == Cnd_ret_prov_typ_nm) doCnd_ret_prov_typ_nm_NC(info);
		else if (nc == Cnd_ret_prov_basis_typ) doCnd_ret_prov_basis_typ_NC(info);
		else if (nc == Cnd_ret_prov_basis_typ_nm) doCnd_ret_prov_basis_typ_nm_NC(info);
		else if (nc == Cnd_ret_trd_cur_cd) doCnd_ret_trd_cur_cd_NC(info);
		else if (nc == Cnd_ret_trd_cur_nm) doCnd_ret_trd_cur_nm_NC(info);
		else if (nc == Cnd_ret_tax_cd) doCnd_ret_tax_cd_NC(info);
		else if (nc == Cnd_ret_tax_nm) doCnd_ret_tax_nm_NC(info);
		else if (nc == Cnd_ret_tax_typ) doCnd_ret_tax_typ_NC(info);
		else if (nc == Cnd_ret_tax_typ_nm) doCnd_ret_tax_typ_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_rqst_cnt_rmrks) doCnd_rqst_cnt_rmrks_NC(info);
		else if (nc == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_xfr_src_typ) doCnd_xfr_src_typ_NC(info);
		else if (nc == Cnd_xfr_src_typ_nm) doCnd_xfr_src_typ_nm_NC(info);
		else if (nc == Cnd_xfr_src_no) doCnd_xfr_src_no_NC(info);
		else if (nc == Cnd_xfr_schd_no) doCnd_xfr_schd_no_NC(info);
		else if (nc == Cnd_itm_ord_no) doCnd_itm_ord_no_NC(info);
		else if (nc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NC(info);
		else if (nc == Cnd_oper_inst_no) doCnd_oper_inst_no_NC(info);
		else if (nc == Cnd_inpt_schd_no) doCnd_inpt_schd_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == BulkSet_rcpt_dt) doBulkSet_rcpt_dt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NC(info);
		else if (nc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NC(info);
		else if (nc == columnRslt_prov_upri_cng_flg) doRslt_prov_upri_cng_flg_NC(info);
		else if (nc == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NC(info);
		else if (nc == columnRslt_alloc_flg) doRslt_alloc_flg_NC(info);
		else if (nc == columnRslt_lot_none_flg) doRslt_lot_none_flg_NC(info);
		else if (nc == columnRslt_ver_flg) doRslt_ver_flg_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_gi_loc_cd) doRslt_gi_loc_cd_NC(info);
		else if (nc == columnRslt_gi_loc_nm) doRslt_gi_loc_nm_NC(info);
		else if (nc == columnRslt_gi_str_ln_tgt_flg) doRslt_gi_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt_gi_lg_grp_cd) doRslt_gi_lg_grp_cd_NC(info);
		else if (nc == columnRslt_gi_lg_grp_nm) doRslt_gi_lg_grp_nm_NC(info);
		else if (nc == columnRslt_gi_wg_cd) doRslt_gi_wg_cd_NC(info);
		else if (nc == columnRslt_gi_wg_nm) doRslt_gi_wg_nm_NC(info);
		else if (nc == columnRslt_gi_site_cd) doRslt_gi_site_cd_NC(info);
		else if (nc == columnRslt_gi_site_nm) doRslt_gi_site_nm_NC(info);
		else if (nc == columnRslt_gr_loc_cd) doRslt_gr_loc_cd_NC(info);
		else if (nc == columnRslt_gr_loc_nm) doRslt_gr_loc_nm_NC(info);
		else if (nc == columnRslt_gr_str_ln_tgt_flg) doRslt_gr_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt_gr_lg_grp_cd) doRslt_gr_lg_grp_cd_NC(info);
		else if (nc == columnRslt_gr_lg_grp_nm) doRslt_gr_lg_grp_nm_NC(info);
		else if (nc == columnRslt_gr_wg_cd) doRslt_gr_wg_cd_NC(info);
		else if (nc == columnRslt_gr_wg_nm) doRslt_gr_wg_nm_NC(info);
		else if (nc == columnRslt_gr_site_cd) doRslt_gr_site_cd_NC(info);
		else if (nc == columnRslt_gr_site_nm) doRslt_gr_site_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_gi_sppl_cd) doRslt_gi_sppl_cd_NC(info);
		else if (nc == columnRslt_gi_cur_cd) doRslt_gi_cur_cd_NC(info);
		else if (nc == columnRslt_gi_subcon_flg) doRslt_gi_subcon_flg_NC(info);
		else if (nc == columnRslt_gi_onr_prsppl_flg) doRslt_gi_onr_prsppl_flg_NC(info);
		else if (nc == columnRslt_gi_prov_upri_cng_flg) doRslt_gi_prov_upri_cng_flg_NC(info);
		else if (nc == columnRslt_gi_prov_amt_rnd_typ) doRslt_gi_prov_amt_rnd_typ_NC(info);
		else if (nc == columnRslt_gi_prov_tax_rnd_typ) doRslt_gi_prov_tax_rnd_typ_NC(info);
		else if (nc == columnRslt_gi_stk_arrv_bp_cd) doRslt_gi_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_gi_stk_arrv_bp_nm) doRslt_gi_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRslt_gr_sppl_cd) doRslt_gr_sppl_cd_NC(info);
		else if (nc == columnRslt_gr_cur_cd) doRslt_gr_cur_cd_NC(info);
		else if (nc == columnRslt_gr_subcon_flg) doRslt_gr_subcon_flg_NC(info);
		else if (nc == columnRslt_gr_onr_prsppl_flg) doRslt_gr_onr_prsppl_flg_NC(info);
		else if (nc == columnRslt_gr_prov_rcv_typ) doRslt_gr_prov_rcv_typ_NC(info);
		else if (nc == columnRslt_gr_prov_basis_typ) doRslt_gr_prov_basis_typ_NC(info);
		else if (nc == columnRslt_gr_prov_upri_cng_flg) doRslt_gr_prov_upri_cng_flg_NC(info);
		else if (nc == columnRslt_gr_prov_amt_rnd_typ) doRslt_gr_prov_amt_rnd_typ_NC(info);
		else if (nc == columnRslt_gr_prov_tax_rnd_typ) doRslt_gr_prov_tax_rnd_typ_NC(info);
		else if (nc == columnRslt_rcpt_dt) doRslt_rcpt_dt_NC(info);
		else if (nc == columnRslt_iv_trd_flg) doRslt_iv_trd_flg_NC(info);
		else if (nc == columnRslt_ship_schd_tm) doRslt_ship_schd_tm_NC(info);
		else if (nc == columnRslt_dlv_schd_tm) doRslt_dlv_schd_tm_NC(info);
		else if (nc == columnRslt_rqst_mod_flg) doRslt_rqst_mod_flg_NC(info);
		else if (nc == columnRslt_rqst_can_flg) doRslt_rqst_can_flg_NC(info);
		else if (nc == columnRslt_ship_term_cd) doRslt_ship_term_cd_NC(info);
		else if (nc == columnRslt_ship_term_nm) doRslt_ship_term_nm_NC(info);
		else if (nc == columnRslt_ship_term_cd_inv) doRslt_ship_term_cd_inv_NC(info);
		else if (nc == columnRslt_ship_inst_typ) doRslt_ship_inst_typ_NC(info);
		else if (nc == columnRslt_ship_inst_typ_nm) doRslt_ship_inst_typ_nm_NC(info);
		else if (nc == columnRslt_rsn_cd) doRslt_rsn_cd_NC(info);
		else if (nc == columnRslt_rsn_nm) doRslt_rsn_nm_NC(info);
		else if (nc == columnRslt_acxfr_gi_flg) doRslt_acxfr_gi_flg_NC(info);
		else if (nc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NC(info);
		else if (nc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_ship_block_flg) doRslt_ship_block_flg_NC(info);
		else if (nc == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NC(info);
		else if (nc == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NC(info);
		else if (nc == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_NC(info);
		else if (nc == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_NC(info);
		else if (nc == columnRslt_ship_to_sundry_flg) doRslt_ship_to_sundry_flg_NC(info);
		else if (nc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NC(info);
		else if (nc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NC(info);
		else if (nc == columnRslt_prov_typ) doRslt_prov_typ_NC(info);
		else if (nc == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_NC(info);
		else if (nc == columnRslt_prov_basis_typ) doRslt_prov_basis_typ_NC(info);
		else if (nc == columnRslt_prov_basis_typ_nm) doRslt_prov_basis_typ_nm_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_prov_xrate_cd) doRslt_prov_xrate_cd_NC(info);
		else if (nc == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NC(info);
		else if (nc == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_wtax_rate) doRslt_wtax_rate_NC(info);
		else if (nc == columnRslt_ret_prov_typ) doRslt_ret_prov_typ_NC(info);
		else if (nc == columnRslt_ret_prov_typ_nm) doRslt_ret_prov_typ_nm_NC(info);
		else if (nc == columnRslt_ret_prov_basis_typ) doRslt_ret_prov_basis_typ_NC(info);
		else if (nc == columnRslt_ret_prov_basis_typ_nm) doRslt_ret_prov_basis_typ_nm_NC(info);
		else if (nc == columnRslt_ret_trd_cur_cd) doRslt_ret_trd_cur_cd_NC(info);
		else if (nc == columnRslt_ret_trd_cur_nm) doRslt_ret_trd_cur_nm_NC(info);
		else if (nc == columnRslt_ret_trd_cur_amt_dec_place) doRslt_ret_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_ret_trd_cur_upri_dec_place) doRslt_ret_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnRslt_ret_xrate_inpt_flg) doRslt_ret_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_ret_ptax_xrate_inpt_flg) doRslt_ret_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_ret_wtax_rate) doRslt_ret_wtax_rate_NC(info);
		else if (nc == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NC(info);
		else if (nc == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NC(info);
		else if (nc == columnRslt_base_ac_dt) doRslt_base_ac_dt_NC(info);
		else if (nc == columnRslt_rqst_cnt_rmrks) doRslt_rqst_cnt_rmrks_NC(info);
		else if (nc == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_xfr_src_typ) doRslt_xfr_src_typ_NC(info);
		else if (nc == columnRslt_xfr_src_typ_nm) doRslt_xfr_src_typ_nm_NC(info);
		else if (nc == columnRslt_xfr_src_no) doRslt_xfr_src_no_NC(info);
		else if (nc == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_NC(info);
		else if (nc == columnRslt_itm_ord_no) doRslt_itm_ord_no_NC(info);
		else if (nc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NC(info);
		else if (nc == columnRslt_oper_inst_no) doRslt_oper_inst_no_NC(info);
		else if (nc == columnRslt_inpt_schd_no) doRslt_inpt_schd_no_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NC(info);
		else if (nc == columnRslt_not_lot_mix_flg) doRslt_not_lot_mix_flg_NC(info);
		else if (nc == columnRslt_not_sublot_mix_flg) doRslt_not_sublot_mix_flg_NC(info);
		else if (nc == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_NC(info);
		else if (nc == columnRslt_vld_dt_to) doRslt_vld_dt_to_NC(info);
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
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
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
	 * [Cnd]パネルの[rqst_mod_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_mod_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_mod_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_mod_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_can_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_can_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_can_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_can_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_inc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_inc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[def_ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_def_ver_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_unit_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[tax_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[xfr_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_no_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcpt_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_site_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_subcon_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_onr_prsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_onr_prsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_subcon_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_onr_prsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_onr_prsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_rcv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_rcv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_trd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_trd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_mod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_mod_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd_inv]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_inv_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[acxfr_gi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_gi_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_block_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_block_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_sundry_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_xrate_cd_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ret_prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_prov_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_to_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == Cnd_rqst_mod_t_flg) doCnd_rqst_mod_t_flg_NE(info);
		else if (ne == Cnd_rqst_mod_f_flg) doCnd_rqst_mod_f_flg_NE(info);
		else if (ne == Cnd_rqst_can_t_flg) doCnd_rqst_can_t_flg_NE(info);
		else if (ne == Cnd_rqst_can_f_flg) doCnd_rqst_can_f_flg_NE(info);
		else if (ne == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_NE(info);
		else if (ne == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_NE(info);
		else if (ne == Cnd_inst_inc_flg) doCnd_inst_inc_flg_NE(info);
		else if (ne == Cnd_gi_loc_cd) doCnd_gi_loc_cd_NE(info);
		else if (ne == Cnd_gi_loc_nm) doCnd_gi_loc_nm_NE(info);
		else if (ne == Cnd_gi_str_ln_cd) doCnd_gi_str_ln_cd_NE(info);
		else if (ne == Cnd_gi_str_ln_nm) doCnd_gi_str_ln_nm_NE(info);
		else if (ne == Cnd_gi_stk_arrv_bp_cd) doCnd_gi_stk_arrv_bp_cd_NE(info);
		else if (ne == Cnd_gi_stk_arrv_bp_nm) doCnd_gi_stk_arrv_bp_nm_NE(info);
		else if (ne == Cnd_gi_site_cd) doCnd_gi_site_cd_NE(info);
		else if (ne == Cnd_gi_site_nm) doCnd_gi_site_nm_NE(info);
		else if (ne == Cnd_gi_wg_cd) doCnd_gi_wg_cd_NE(info);
		else if (ne == Cnd_gi_wg_nm) doCnd_gi_wg_nm_NE(info);
		else if (ne == Cnd_gi_lg_grp_cd) doCnd_gi_lg_grp_cd_NE(info);
		else if (ne == Cnd_gi_lg_grp_nm) doCnd_gi_lg_grp_nm_NE(info);
		else if (ne == Cnd_gr_loc_cd) doCnd_gr_loc_cd_NE(info);
		else if (ne == Cnd_gr_loc_nm) doCnd_gr_loc_nm_NE(info);
		else if (ne == Cnd_gr_str_ln_cd) doCnd_gr_str_ln_cd_NE(info);
		else if (ne == Cnd_gr_str_ln_nm) doCnd_gr_str_ln_nm_NE(info);
		else if (ne == Cnd_gr_site_cd) doCnd_gr_site_cd_NE(info);
		else if (ne == Cnd_gr_site_nm) doCnd_gr_site_nm_NE(info);
		else if (ne == Cnd_gr_wg_cd) doCnd_gr_wg_cd_NE(info);
		else if (ne == Cnd_gr_wg_nm) doCnd_gr_wg_nm_NE(info);
		else if (ne == Cnd_gr_lg_grp_cd) doCnd_gr_lg_grp_cd_NE(info);
		else if (ne == Cnd_gr_lg_grp_nm) doCnd_gr_lg_grp_nm_NE(info);
		else if (ne == Cnd_def_ver_flg) doCnd_def_ver_flg_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_trd_unit_cd) doCnd_trd_unit_cd_NE(info);
		else if (ne == Cnd_trd_unit_nm) doCnd_trd_unit_nm_NE(info);
		else if (ne == Cnd_base_unit_cd) doCnd_base_unit_cd_NE(info);
		else if (ne == Cnd_base_unit_nm) doCnd_base_unit_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_quality_typ) doCnd_quality_typ_NE(info);
		else if (ne == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NE(info);
		else if (ne == Cnd_stk_id_typ) doCnd_stk_id_typ_NE(info);
		else if (ne == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NE(info);
		else if (ne == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NE(info);
		else if (ne == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NE(info);
		else if (ne == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_NE(info);
		else if (ne == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_NE(info);
		else if (ne == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_NE(info);
		else if (ne == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_NE(info);
		else if (ne == Cnd_ship_term_cd) doCnd_ship_term_cd_NE(info);
		else if (ne == Cnd_ship_term_nm) doCnd_ship_term_nm_NE(info);
		else if (ne == Cnd_ship_inst_typ) doCnd_ship_inst_typ_NE(info);
		else if (ne == Cnd_ship_inst_typ_nm) doCnd_ship_inst_typ_nm_NE(info);
		else if (ne == Cnd_rsn_cd) doCnd_rsn_cd_NE(info);
		else if (ne == Cnd_rsn_nm) doCnd_rsn_nm_NE(info);
		else if (ne == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NE(info);
		else if (ne == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NE(info);
		else if (ne == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_NE(info);
		else if (ne == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_NE(info);
		else if (ne == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_NE(info);
		else if (ne == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_NE(info);
		else if (ne == Cnd_prov_typ) doCnd_prov_typ_NE(info);
		else if (ne == Cnd_prov_typ_nm) doCnd_prov_typ_nm_NE(info);
		else if (ne == Cnd_prov_basis_typ) doCnd_prov_basis_typ_NE(info);
		else if (ne == Cnd_prov_basis_typ_nm) doCnd_prov_basis_typ_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_tax_cd) doCnd_tax_cd_NE(info);
		else if (ne == Cnd_tax_nm) doCnd_tax_nm_NE(info);
		else if (ne == Cnd_tax_typ) doCnd_tax_typ_NE(info);
		else if (ne == Cnd_tax_typ_nm) doCnd_tax_typ_nm_NE(info);
		else if (ne == Cnd_ptax_cur_cd) doCnd_ptax_cur_cd_NE(info);
		else if (ne == Cnd_ptax_cur_nm) doCnd_ptax_cur_nm_NE(info);
		else if (ne == Cnd_ret_prov_typ) doCnd_ret_prov_typ_NE(info);
		else if (ne == Cnd_ret_prov_typ_nm) doCnd_ret_prov_typ_nm_NE(info);
		else if (ne == Cnd_ret_prov_basis_typ) doCnd_ret_prov_basis_typ_NE(info);
		else if (ne == Cnd_ret_prov_basis_typ_nm) doCnd_ret_prov_basis_typ_nm_NE(info);
		else if (ne == Cnd_ret_trd_cur_cd) doCnd_ret_trd_cur_cd_NE(info);
		else if (ne == Cnd_ret_trd_cur_nm) doCnd_ret_trd_cur_nm_NE(info);
		else if (ne == Cnd_ret_tax_cd) doCnd_ret_tax_cd_NE(info);
		else if (ne == Cnd_ret_tax_nm) doCnd_ret_tax_nm_NE(info);
		else if (ne == Cnd_ret_tax_typ) doCnd_ret_tax_typ_NE(info);
		else if (ne == Cnd_ret_tax_typ_nm) doCnd_ret_tax_typ_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_rqst_cnt_rmrks) doCnd_rqst_cnt_rmrks_NE(info);
		else if (ne == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_xfr_src_typ) doCnd_xfr_src_typ_NE(info);
		else if (ne == Cnd_xfr_src_typ_nm) doCnd_xfr_src_typ_nm_NE(info);
		else if (ne == Cnd_xfr_src_no) doCnd_xfr_src_no_NE(info);
		else if (ne == Cnd_xfr_schd_no) doCnd_xfr_schd_no_NE(info);
		else if (ne == Cnd_itm_ord_no) doCnd_itm_ord_no_NE(info);
		else if (ne == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NE(info);
		else if (ne == Cnd_oper_inst_no) doCnd_oper_inst_no_NE(info);
		else if (ne == Cnd_inpt_schd_no) doCnd_inpt_schd_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == BulkSet_rcpt_dt) doBulkSet_rcpt_dt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NE(info);
		else if (ne == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NE(info);
		else if (ne == columnRslt_prov_upri_cng_flg) doRslt_prov_upri_cng_flg_NE(info);
		else if (ne == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NE(info);
		else if (ne == columnRslt_alloc_flg) doRslt_alloc_flg_NE(info);
		else if (ne == columnRslt_lot_none_flg) doRslt_lot_none_flg_NE(info);
		else if (ne == columnRslt_ver_flg) doRslt_ver_flg_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_gi_loc_cd) doRslt_gi_loc_cd_NE(info);
		else if (ne == columnRslt_gi_loc_nm) doRslt_gi_loc_nm_NE(info);
		else if (ne == columnRslt_gi_str_ln_tgt_flg) doRslt_gi_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt_gi_lg_grp_cd) doRslt_gi_lg_grp_cd_NE(info);
		else if (ne == columnRslt_gi_lg_grp_nm) doRslt_gi_lg_grp_nm_NE(info);
		else if (ne == columnRslt_gi_wg_cd) doRslt_gi_wg_cd_NE(info);
		else if (ne == columnRslt_gi_wg_nm) doRslt_gi_wg_nm_NE(info);
		else if (ne == columnRslt_gi_site_cd) doRslt_gi_site_cd_NE(info);
		else if (ne == columnRslt_gi_site_nm) doRslt_gi_site_nm_NE(info);
		else if (ne == columnRslt_gr_loc_cd) doRslt_gr_loc_cd_NE(info);
		else if (ne == columnRslt_gr_loc_nm) doRslt_gr_loc_nm_NE(info);
		else if (ne == columnRslt_gr_str_ln_tgt_flg) doRslt_gr_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt_gr_lg_grp_cd) doRslt_gr_lg_grp_cd_NE(info);
		else if (ne == columnRslt_gr_lg_grp_nm) doRslt_gr_lg_grp_nm_NE(info);
		else if (ne == columnRslt_gr_wg_cd) doRslt_gr_wg_cd_NE(info);
		else if (ne == columnRslt_gr_wg_nm) doRslt_gr_wg_nm_NE(info);
		else if (ne == columnRslt_gr_site_cd) doRslt_gr_site_cd_NE(info);
		else if (ne == columnRslt_gr_site_nm) doRslt_gr_site_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_gi_sppl_cd) doRslt_gi_sppl_cd_NE(info);
		else if (ne == columnRslt_gi_cur_cd) doRslt_gi_cur_cd_NE(info);
		else if (ne == columnRslt_gi_subcon_flg) doRslt_gi_subcon_flg_NE(info);
		else if (ne == columnRslt_gi_onr_prsppl_flg) doRslt_gi_onr_prsppl_flg_NE(info);
		else if (ne == columnRslt_gi_prov_upri_cng_flg) doRslt_gi_prov_upri_cng_flg_NE(info);
		else if (ne == columnRslt_gi_prov_amt_rnd_typ) doRslt_gi_prov_amt_rnd_typ_NE(info);
		else if (ne == columnRslt_gi_prov_tax_rnd_typ) doRslt_gi_prov_tax_rnd_typ_NE(info);
		else if (ne == columnRslt_gi_stk_arrv_bp_cd) doRslt_gi_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_gi_stk_arrv_bp_nm) doRslt_gi_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRslt_gr_sppl_cd) doRslt_gr_sppl_cd_NE(info);
		else if (ne == columnRslt_gr_cur_cd) doRslt_gr_cur_cd_NE(info);
		else if (ne == columnRslt_gr_subcon_flg) doRslt_gr_subcon_flg_NE(info);
		else if (ne == columnRslt_gr_onr_prsppl_flg) doRslt_gr_onr_prsppl_flg_NE(info);
		else if (ne == columnRslt_gr_prov_rcv_typ) doRslt_gr_prov_rcv_typ_NE(info);
		else if (ne == columnRslt_gr_prov_basis_typ) doRslt_gr_prov_basis_typ_NE(info);
		else if (ne == columnRslt_gr_prov_upri_cng_flg) doRslt_gr_prov_upri_cng_flg_NE(info);
		else if (ne == columnRslt_gr_prov_amt_rnd_typ) doRslt_gr_prov_amt_rnd_typ_NE(info);
		else if (ne == columnRslt_gr_prov_tax_rnd_typ) doRslt_gr_prov_tax_rnd_typ_NE(info);
		else if (ne == columnRslt_rcpt_dt) doRslt_rcpt_dt_NE(info);
		else if (ne == columnRslt_iv_trd_flg) doRslt_iv_trd_flg_NE(info);
		else if (ne == columnRslt_ship_schd_tm) doRslt_ship_schd_tm_NE(info);
		else if (ne == columnRslt_dlv_schd_tm) doRslt_dlv_schd_tm_NE(info);
		else if (ne == columnRslt_rqst_mod_flg) doRslt_rqst_mod_flg_NE(info);
		else if (ne == columnRslt_rqst_can_flg) doRslt_rqst_can_flg_NE(info);
		else if (ne == columnRslt_ship_term_cd) doRslt_ship_term_cd_NE(info);
		else if (ne == columnRslt_ship_term_nm) doRslt_ship_term_nm_NE(info);
		else if (ne == columnRslt_ship_term_cd_inv) doRslt_ship_term_cd_inv_NE(info);
		else if (ne == columnRslt_ship_inst_typ) doRslt_ship_inst_typ_NE(info);
		else if (ne == columnRslt_ship_inst_typ_nm) doRslt_ship_inst_typ_nm_NE(info);
		else if (ne == columnRslt_rsn_cd) doRslt_rsn_cd_NE(info);
		else if (ne == columnRslt_rsn_nm) doRslt_rsn_nm_NE(info);
		else if (ne == columnRslt_acxfr_gi_flg) doRslt_acxfr_gi_flg_NE(info);
		else if (ne == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NE(info);
		else if (ne == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_ship_block_flg) doRslt_ship_block_flg_NE(info);
		else if (ne == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NE(info);
		else if (ne == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NE(info);
		else if (ne == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_NE(info);
		else if (ne == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_NE(info);
		else if (ne == columnRslt_ship_to_sundry_flg) doRslt_ship_to_sundry_flg_NE(info);
		else if (ne == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NE(info);
		else if (ne == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NE(info);
		else if (ne == columnRslt_prov_typ) doRslt_prov_typ_NE(info);
		else if (ne == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_NE(info);
		else if (ne == columnRslt_prov_basis_typ) doRslt_prov_basis_typ_NE(info);
		else if (ne == columnRslt_prov_basis_typ_nm) doRslt_prov_basis_typ_nm_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_prov_xrate_cd) doRslt_prov_xrate_cd_NE(info);
		else if (ne == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NE(info);
		else if (ne == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_wtax_rate) doRslt_wtax_rate_NE(info);
		else if (ne == columnRslt_ret_prov_typ) doRslt_ret_prov_typ_NE(info);
		else if (ne == columnRslt_ret_prov_typ_nm) doRslt_ret_prov_typ_nm_NE(info);
		else if (ne == columnRslt_ret_prov_basis_typ) doRslt_ret_prov_basis_typ_NE(info);
		else if (ne == columnRslt_ret_prov_basis_typ_nm) doRslt_ret_prov_basis_typ_nm_NE(info);
		else if (ne == columnRslt_ret_trd_cur_cd) doRslt_ret_trd_cur_cd_NE(info);
		else if (ne == columnRslt_ret_trd_cur_nm) doRslt_ret_trd_cur_nm_NE(info);
		else if (ne == columnRslt_ret_trd_cur_amt_dec_place) doRslt_ret_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_ret_trd_cur_upri_dec_place) doRslt_ret_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnRslt_ret_xrate_inpt_flg) doRslt_ret_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_ret_ptax_xrate_inpt_flg) doRslt_ret_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_ret_wtax_rate) doRslt_ret_wtax_rate_NE(info);
		else if (ne == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NE(info);
		else if (ne == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NE(info);
		else if (ne == columnRslt_base_ac_dt) doRslt_base_ac_dt_NE(info);
		else if (ne == columnRslt_rqst_cnt_rmrks) doRslt_rqst_cnt_rmrks_NE(info);
		else if (ne == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_xfr_src_typ) doRslt_xfr_src_typ_NE(info);
		else if (ne == columnRslt_xfr_src_typ_nm) doRslt_xfr_src_typ_nm_NE(info);
		else if (ne == columnRslt_xfr_src_no) doRslt_xfr_src_no_NE(info);
		else if (ne == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_NE(info);
		else if (ne == columnRslt_itm_ord_no) doRslt_itm_ord_no_NE(info);
		else if (ne == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NE(info);
		else if (ne == columnRslt_oper_inst_no) doRslt_oper_inst_no_NE(info);
		else if (ne == columnRslt_inpt_schd_no) doRslt_inpt_schd_no_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NE(info);
		else if (ne == columnRslt_not_lot_mix_flg) doRslt_not_lot_mix_flg_NE(info);
		else if (ne == columnRslt_not_sublot_mix_flg) doRslt_not_sublot_mix_flg_NE(info);
		else if (ne == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_NE(info);
		else if (ne == columnRslt_vld_dt_to) doRslt_vld_dt_to_NE(info);
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
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
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
	 * [Cnd]パネルの[rqst_mod_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_mod_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_mod_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_mod_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_can_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_can_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_can_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_can_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_inc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_inc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[def_ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_def_ver_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_unit_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[tax_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[xfr_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_no_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcpt_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_site_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_subcon_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_onr_prsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_onr_prsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_subcon_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_onr_prsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_onr_prsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_rcv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_rcv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_trd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_trd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_mod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_mod_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd_inv]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_inv_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[acxfr_gi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_gi_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_block_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_block_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_sundry_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_xrate_cd_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ret_prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_prov_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_to_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == Cnd_rqst_mod_t_flg) doCnd_rqst_mod_t_flg_NX(info);
		else if (nx == Cnd_rqst_mod_f_flg) doCnd_rqst_mod_f_flg_NX(info);
		else if (nx == Cnd_rqst_can_t_flg) doCnd_rqst_can_t_flg_NX(info);
		else if (nx == Cnd_rqst_can_f_flg) doCnd_rqst_can_f_flg_NX(info);
		else if (nx == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_NX(info);
		else if (nx == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_NX(info);
		else if (nx == Cnd_inst_inc_flg) doCnd_inst_inc_flg_NX(info);
		else if (nx == Cnd_gi_loc_cd) doCnd_gi_loc_cd_NX(info);
		else if (nx == Cnd_gi_loc_nm) doCnd_gi_loc_nm_NX(info);
		else if (nx == Cnd_gi_str_ln_cd) doCnd_gi_str_ln_cd_NX(info);
		else if (nx == Cnd_gi_str_ln_nm) doCnd_gi_str_ln_nm_NX(info);
		else if (nx == Cnd_gi_stk_arrv_bp_cd) doCnd_gi_stk_arrv_bp_cd_NX(info);
		else if (nx == Cnd_gi_stk_arrv_bp_nm) doCnd_gi_stk_arrv_bp_nm_NX(info);
		else if (nx == Cnd_gi_site_cd) doCnd_gi_site_cd_NX(info);
		else if (nx == Cnd_gi_site_nm) doCnd_gi_site_nm_NX(info);
		else if (nx == Cnd_gi_wg_cd) doCnd_gi_wg_cd_NX(info);
		else if (nx == Cnd_gi_wg_nm) doCnd_gi_wg_nm_NX(info);
		else if (nx == Cnd_gi_lg_grp_cd) doCnd_gi_lg_grp_cd_NX(info);
		else if (nx == Cnd_gi_lg_grp_nm) doCnd_gi_lg_grp_nm_NX(info);
		else if (nx == Cnd_gr_loc_cd) doCnd_gr_loc_cd_NX(info);
		else if (nx == Cnd_gr_loc_nm) doCnd_gr_loc_nm_NX(info);
		else if (nx == Cnd_gr_str_ln_cd) doCnd_gr_str_ln_cd_NX(info);
		else if (nx == Cnd_gr_str_ln_nm) doCnd_gr_str_ln_nm_NX(info);
		else if (nx == Cnd_gr_site_cd) doCnd_gr_site_cd_NX(info);
		else if (nx == Cnd_gr_site_nm) doCnd_gr_site_nm_NX(info);
		else if (nx == Cnd_gr_wg_cd) doCnd_gr_wg_cd_NX(info);
		else if (nx == Cnd_gr_wg_nm) doCnd_gr_wg_nm_NX(info);
		else if (nx == Cnd_gr_lg_grp_cd) doCnd_gr_lg_grp_cd_NX(info);
		else if (nx == Cnd_gr_lg_grp_nm) doCnd_gr_lg_grp_nm_NX(info);
		else if (nx == Cnd_def_ver_flg) doCnd_def_ver_flg_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_trd_unit_cd) doCnd_trd_unit_cd_NX(info);
		else if (nx == Cnd_trd_unit_nm) doCnd_trd_unit_nm_NX(info);
		else if (nx == Cnd_base_unit_cd) doCnd_base_unit_cd_NX(info);
		else if (nx == Cnd_base_unit_nm) doCnd_base_unit_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_quality_typ) doCnd_quality_typ_NX(info);
		else if (nx == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NX(info);
		else if (nx == Cnd_stk_id_typ) doCnd_stk_id_typ_NX(info);
		else if (nx == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NX(info);
		else if (nx == Cnd_stk_bp_cd) doCnd_stk_bp_cd_NX(info);
		else if (nx == Cnd_stk_bp_nm) doCnd_stk_bp_nm_NX(info);
		else if (nx == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_NX(info);
		else if (nx == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_NX(info);
		else if (nx == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_NX(info);
		else if (nx == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_NX(info);
		else if (nx == Cnd_ship_term_cd) doCnd_ship_term_cd_NX(info);
		else if (nx == Cnd_ship_term_nm) doCnd_ship_term_nm_NX(info);
		else if (nx == Cnd_ship_inst_typ) doCnd_ship_inst_typ_NX(info);
		else if (nx == Cnd_ship_inst_typ_nm) doCnd_ship_inst_typ_nm_NX(info);
		else if (nx == Cnd_rsn_cd) doCnd_rsn_cd_NX(info);
		else if (nx == Cnd_rsn_nm) doCnd_rsn_nm_NX(info);
		else if (nx == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NX(info);
		else if (nx == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NX(info);
		else if (nx == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_NX(info);
		else if (nx == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_NX(info);
		else if (nx == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_NX(info);
		else if (nx == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_NX(info);
		else if (nx == Cnd_prov_typ) doCnd_prov_typ_NX(info);
		else if (nx == Cnd_prov_typ_nm) doCnd_prov_typ_nm_NX(info);
		else if (nx == Cnd_prov_basis_typ) doCnd_prov_basis_typ_NX(info);
		else if (nx == Cnd_prov_basis_typ_nm) doCnd_prov_basis_typ_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_tax_cd) doCnd_tax_cd_NX(info);
		else if (nx == Cnd_tax_nm) doCnd_tax_nm_NX(info);
		else if (nx == Cnd_tax_typ) doCnd_tax_typ_NX(info);
		else if (nx == Cnd_tax_typ_nm) doCnd_tax_typ_nm_NX(info);
		else if (nx == Cnd_ptax_cur_cd) doCnd_ptax_cur_cd_NX(info);
		else if (nx == Cnd_ptax_cur_nm) doCnd_ptax_cur_nm_NX(info);
		else if (nx == Cnd_ret_prov_typ) doCnd_ret_prov_typ_NX(info);
		else if (nx == Cnd_ret_prov_typ_nm) doCnd_ret_prov_typ_nm_NX(info);
		else if (nx == Cnd_ret_prov_basis_typ) doCnd_ret_prov_basis_typ_NX(info);
		else if (nx == Cnd_ret_prov_basis_typ_nm) doCnd_ret_prov_basis_typ_nm_NX(info);
		else if (nx == Cnd_ret_trd_cur_cd) doCnd_ret_trd_cur_cd_NX(info);
		else if (nx == Cnd_ret_trd_cur_nm) doCnd_ret_trd_cur_nm_NX(info);
		else if (nx == Cnd_ret_tax_cd) doCnd_ret_tax_cd_NX(info);
		else if (nx == Cnd_ret_tax_nm) doCnd_ret_tax_nm_NX(info);
		else if (nx == Cnd_ret_tax_typ) doCnd_ret_tax_typ_NX(info);
		else if (nx == Cnd_ret_tax_typ_nm) doCnd_ret_tax_typ_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_rqst_cnt_rmrks) doCnd_rqst_cnt_rmrks_NX(info);
		else if (nx == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_xfr_src_typ) doCnd_xfr_src_typ_NX(info);
		else if (nx == Cnd_xfr_src_typ_nm) doCnd_xfr_src_typ_nm_NX(info);
		else if (nx == Cnd_xfr_src_no) doCnd_xfr_src_no_NX(info);
		else if (nx == Cnd_xfr_schd_no) doCnd_xfr_schd_no_NX(info);
		else if (nx == Cnd_itm_ord_no) doCnd_itm_ord_no_NX(info);
		else if (nx == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NX(info);
		else if (nx == Cnd_oper_inst_no) doCnd_oper_inst_no_NX(info);
		else if (nx == Cnd_inpt_schd_no) doCnd_inpt_schd_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == BulkSet_rcpt_dt) doBulkSet_rcpt_dt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NX(info);
		else if (nx == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NX(info);
		else if (nx == columnRslt_prov_upri_cng_flg) doRslt_prov_upri_cng_flg_NX(info);
		else if (nx == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NX(info);
		else if (nx == columnRslt_alloc_flg) doRslt_alloc_flg_NX(info);
		else if (nx == columnRslt_lot_none_flg) doRslt_lot_none_flg_NX(info);
		else if (nx == columnRslt_ver_flg) doRslt_ver_flg_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_gi_loc_cd) doRslt_gi_loc_cd_NX(info);
		else if (nx == columnRslt_gi_loc_nm) doRslt_gi_loc_nm_NX(info);
		else if (nx == columnRslt_gi_str_ln_tgt_flg) doRslt_gi_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt_gi_lg_grp_cd) doRslt_gi_lg_grp_cd_NX(info);
		else if (nx == columnRslt_gi_lg_grp_nm) doRslt_gi_lg_grp_nm_NX(info);
		else if (nx == columnRslt_gi_wg_cd) doRslt_gi_wg_cd_NX(info);
		else if (nx == columnRslt_gi_wg_nm) doRslt_gi_wg_nm_NX(info);
		else if (nx == columnRslt_gi_site_cd) doRslt_gi_site_cd_NX(info);
		else if (nx == columnRslt_gi_site_nm) doRslt_gi_site_nm_NX(info);
		else if (nx == columnRslt_gr_loc_cd) doRslt_gr_loc_cd_NX(info);
		else if (nx == columnRslt_gr_loc_nm) doRslt_gr_loc_nm_NX(info);
		else if (nx == columnRslt_gr_str_ln_tgt_flg) doRslt_gr_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt_gr_lg_grp_cd) doRslt_gr_lg_grp_cd_NX(info);
		else if (nx == columnRslt_gr_lg_grp_nm) doRslt_gr_lg_grp_nm_NX(info);
		else if (nx == columnRslt_gr_wg_cd) doRslt_gr_wg_cd_NX(info);
		else if (nx == columnRslt_gr_wg_nm) doRslt_gr_wg_nm_NX(info);
		else if (nx == columnRslt_gr_site_cd) doRslt_gr_site_cd_NX(info);
		else if (nx == columnRslt_gr_site_nm) doRslt_gr_site_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_gi_sppl_cd) doRslt_gi_sppl_cd_NX(info);
		else if (nx == columnRslt_gi_cur_cd) doRslt_gi_cur_cd_NX(info);
		else if (nx == columnRslt_gi_subcon_flg) doRslt_gi_subcon_flg_NX(info);
		else if (nx == columnRslt_gi_onr_prsppl_flg) doRslt_gi_onr_prsppl_flg_NX(info);
		else if (nx == columnRslt_gi_prov_upri_cng_flg) doRslt_gi_prov_upri_cng_flg_NX(info);
		else if (nx == columnRslt_gi_prov_amt_rnd_typ) doRslt_gi_prov_amt_rnd_typ_NX(info);
		else if (nx == columnRslt_gi_prov_tax_rnd_typ) doRslt_gi_prov_tax_rnd_typ_NX(info);
		else if (nx == columnRslt_gi_stk_arrv_bp_cd) doRslt_gi_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_gi_stk_arrv_bp_nm) doRslt_gi_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRslt_gr_sppl_cd) doRslt_gr_sppl_cd_NX(info);
		else if (nx == columnRslt_gr_cur_cd) doRslt_gr_cur_cd_NX(info);
		else if (nx == columnRslt_gr_subcon_flg) doRslt_gr_subcon_flg_NX(info);
		else if (nx == columnRslt_gr_onr_prsppl_flg) doRslt_gr_onr_prsppl_flg_NX(info);
		else if (nx == columnRslt_gr_prov_rcv_typ) doRslt_gr_prov_rcv_typ_NX(info);
		else if (nx == columnRslt_gr_prov_basis_typ) doRslt_gr_prov_basis_typ_NX(info);
		else if (nx == columnRslt_gr_prov_upri_cng_flg) doRslt_gr_prov_upri_cng_flg_NX(info);
		else if (nx == columnRslt_gr_prov_amt_rnd_typ) doRslt_gr_prov_amt_rnd_typ_NX(info);
		else if (nx == columnRslt_gr_prov_tax_rnd_typ) doRslt_gr_prov_tax_rnd_typ_NX(info);
		else if (nx == columnRslt_rcpt_dt) doRslt_rcpt_dt_NX(info);
		else if (nx == columnRslt_iv_trd_flg) doRslt_iv_trd_flg_NX(info);
		else if (nx == columnRslt_ship_schd_tm) doRslt_ship_schd_tm_NX(info);
		else if (nx == columnRslt_dlv_schd_tm) doRslt_dlv_schd_tm_NX(info);
		else if (nx == columnRslt_rqst_mod_flg) doRslt_rqst_mod_flg_NX(info);
		else if (nx == columnRslt_rqst_can_flg) doRslt_rqst_can_flg_NX(info);
		else if (nx == columnRslt_ship_term_cd) doRslt_ship_term_cd_NX(info);
		else if (nx == columnRslt_ship_term_nm) doRslt_ship_term_nm_NX(info);
		else if (nx == columnRslt_ship_term_cd_inv) doRslt_ship_term_cd_inv_NX(info);
		else if (nx == columnRslt_ship_inst_typ) doRslt_ship_inst_typ_NX(info);
		else if (nx == columnRslt_ship_inst_typ_nm) doRslt_ship_inst_typ_nm_NX(info);
		else if (nx == columnRslt_rsn_cd) doRslt_rsn_cd_NX(info);
		else if (nx == columnRslt_rsn_nm) doRslt_rsn_nm_NX(info);
		else if (nx == columnRslt_acxfr_gi_flg) doRslt_acxfr_gi_flg_NX(info);
		else if (nx == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NX(info);
		else if (nx == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_ship_block_flg) doRslt_ship_block_flg_NX(info);
		else if (nx == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NX(info);
		else if (nx == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NX(info);
		else if (nx == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_NX(info);
		else if (nx == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_NX(info);
		else if (nx == columnRslt_ship_to_sundry_flg) doRslt_ship_to_sundry_flg_NX(info);
		else if (nx == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NX(info);
		else if (nx == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NX(info);
		else if (nx == columnRslt_prov_typ) doRslt_prov_typ_NX(info);
		else if (nx == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_NX(info);
		else if (nx == columnRslt_prov_basis_typ) doRslt_prov_basis_typ_NX(info);
		else if (nx == columnRslt_prov_basis_typ_nm) doRslt_prov_basis_typ_nm_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_prov_xrate_cd) doRslt_prov_xrate_cd_NX(info);
		else if (nx == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NX(info);
		else if (nx == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_wtax_rate) doRslt_wtax_rate_NX(info);
		else if (nx == columnRslt_ret_prov_typ) doRslt_ret_prov_typ_NX(info);
		else if (nx == columnRslt_ret_prov_typ_nm) doRslt_ret_prov_typ_nm_NX(info);
		else if (nx == columnRslt_ret_prov_basis_typ) doRslt_ret_prov_basis_typ_NX(info);
		else if (nx == columnRslt_ret_prov_basis_typ_nm) doRslt_ret_prov_basis_typ_nm_NX(info);
		else if (nx == columnRslt_ret_trd_cur_cd) doRslt_ret_trd_cur_cd_NX(info);
		else if (nx == columnRslt_ret_trd_cur_nm) doRslt_ret_trd_cur_nm_NX(info);
		else if (nx == columnRslt_ret_trd_cur_amt_dec_place) doRslt_ret_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_ret_trd_cur_upri_dec_place) doRslt_ret_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnRslt_ret_xrate_inpt_flg) doRslt_ret_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_ret_ptax_xrate_inpt_flg) doRslt_ret_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_ret_wtax_rate) doRslt_ret_wtax_rate_NX(info);
		else if (nx == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NX(info);
		else if (nx == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NX(info);
		else if (nx == columnRslt_base_ac_dt) doRslt_base_ac_dt_NX(info);
		else if (nx == columnRslt_rqst_cnt_rmrks) doRslt_rqst_cnt_rmrks_NX(info);
		else if (nx == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_xfr_src_typ) doRslt_xfr_src_typ_NX(info);
		else if (nx == columnRslt_xfr_src_typ_nm) doRslt_xfr_src_typ_nm_NX(info);
		else if (nx == columnRslt_xfr_src_no) doRslt_xfr_src_no_NX(info);
		else if (nx == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_NX(info);
		else if (nx == columnRslt_itm_ord_no) doRslt_itm_ord_no_NX(info);
		else if (nx == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NX(info);
		else if (nx == columnRslt_oper_inst_no) doRslt_oper_inst_no_NX(info);
		else if (nx == columnRslt_inpt_schd_no) doRslt_inpt_schd_no_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NX(info);
		else if (nx == columnRslt_not_lot_mix_flg) doRslt_not_lot_mix_flg_NX(info);
		else if (nx == columnRslt_not_sublot_mix_flg) doRslt_not_sublot_mix_flg_NX(info);
		else if (nx == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_NX(info);
		else if (nx == columnRslt_vld_dt_to) doRslt_vld_dt_to_NX(info);
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
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
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
	 * [Cnd]パネルの[rqst_mod_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_mod_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_mod_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_mod_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_can_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_can_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_can_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_can_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_inc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_inc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[def_ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_def_ver_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_unit_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[tax_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[xfr_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_no_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcpt_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_site_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_subcon_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_onr_prsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_onr_prsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_subcon_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_onr_prsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_onr_prsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_rcv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_rcv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_trd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_trd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_mod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_mod_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd_inv]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_inv_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[acxfr_gi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_gi_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_block_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_block_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_sundry_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_xrate_cd_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ret_prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_prov_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_to_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_rcpt_dt_fr) doCnd_rcpt_dt_fr_LC(info);
		else if (lc == Cnd_rcpt_dt_to) doCnd_rcpt_dt_to_LC(info);
		else if (lc == Cnd_gi_loc_cd) doCnd_gi_loc_cd_LC(info);
		else if (lc == Cnd_gi_loc_nm) doCnd_gi_loc_nm_LC(info);
		else if (lc == Cnd_gi_str_ln_cd) doCnd_gi_str_ln_cd_LC(info);
		else if (lc == Cnd_gi_str_ln_nm) doCnd_gi_str_ln_nm_LC(info);
		else if (lc == Cnd_gi_stk_arrv_bp_cd) doCnd_gi_stk_arrv_bp_cd_LC(info);
		else if (lc == Cnd_gi_stk_arrv_bp_nm) doCnd_gi_stk_arrv_bp_nm_LC(info);
		else if (lc == Cnd_gi_site_cd) doCnd_gi_site_cd_LC(info);
		else if (lc == Cnd_gi_site_nm) doCnd_gi_site_nm_LC(info);
		else if (lc == Cnd_gi_wg_cd) doCnd_gi_wg_cd_LC(info);
		else if (lc == Cnd_gi_wg_nm) doCnd_gi_wg_nm_LC(info);
		else if (lc == Cnd_gi_lg_grp_cd) doCnd_gi_lg_grp_cd_LC(info);
		else if (lc == Cnd_gi_lg_grp_nm) doCnd_gi_lg_grp_nm_LC(info);
		else if (lc == Cnd_gr_loc_cd) doCnd_gr_loc_cd_LC(info);
		else if (lc == Cnd_gr_loc_nm) doCnd_gr_loc_nm_LC(info);
		else if (lc == Cnd_gr_str_ln_cd) doCnd_gr_str_ln_cd_LC(info);
		else if (lc == Cnd_gr_str_ln_nm) doCnd_gr_str_ln_nm_LC(info);
		else if (lc == Cnd_gr_site_cd) doCnd_gr_site_cd_LC(info);
		else if (lc == Cnd_gr_site_nm) doCnd_gr_site_nm_LC(info);
		else if (lc == Cnd_gr_wg_cd) doCnd_gr_wg_cd_LC(info);
		else if (lc == Cnd_gr_wg_nm) doCnd_gr_wg_nm_LC(info);
		else if (lc == Cnd_gr_lg_grp_cd) doCnd_gr_lg_grp_cd_LC(info);
		else if (lc == Cnd_gr_lg_grp_nm) doCnd_gr_lg_grp_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_trd_unit_cd) doCnd_trd_unit_cd_LC(info);
		else if (lc == Cnd_trd_unit_nm) doCnd_trd_unit_nm_LC(info);
		else if (lc == Cnd_base_unit_cd) doCnd_base_unit_cd_LC(info);
		else if (lc == Cnd_base_unit_nm) doCnd_base_unit_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_quality_typ) doCnd_quality_typ_LC(info);
		else if (lc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_LC(info);
		else if (lc == Cnd_stk_id_typ) doCnd_stk_id_typ_LC(info);
		else if (lc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_LC(info);
		else if (lc == Cnd_stk_bp_cd) doCnd_stk_bp_cd_LC(info);
		else if (lc == Cnd_stk_bp_nm) doCnd_stk_bp_nm_LC(info);
		else if (lc == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_LC(info);
		else if (lc == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_LC(info);
		else if (lc == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_LC(info);
		else if (lc == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_LC(info);
		else if (lc == Cnd_ship_term_cd) doCnd_ship_term_cd_LC(info);
		else if (lc == Cnd_ship_term_nm) doCnd_ship_term_nm_LC(info);
		else if (lc == Cnd_ship_inst_typ) doCnd_ship_inst_typ_LC(info);
		else if (lc == Cnd_ship_inst_typ_nm) doCnd_ship_inst_typ_nm_LC(info);
		else if (lc == Cnd_rsn_cd) doCnd_rsn_cd_LC(info);
		else if (lc == Cnd_rsn_nm) doCnd_rsn_nm_LC(info);
		else if (lc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_LC(info);
		else if (lc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_LC(info);
		else if (lc == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_LC(info);
		else if (lc == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_LC(info);
		else if (lc == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_LC(info);
		else if (lc == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_LC(info);
		else if (lc == Cnd_prov_typ) doCnd_prov_typ_LC(info);
		else if (lc == Cnd_prov_typ_nm) doCnd_prov_typ_nm_LC(info);
		else if (lc == Cnd_prov_basis_typ) doCnd_prov_basis_typ_LC(info);
		else if (lc == Cnd_prov_basis_typ_nm) doCnd_prov_basis_typ_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_tax_cd) doCnd_tax_cd_LC(info);
		else if (lc == Cnd_tax_nm) doCnd_tax_nm_LC(info);
		else if (lc == Cnd_tax_typ) doCnd_tax_typ_LC(info);
		else if (lc == Cnd_tax_typ_nm) doCnd_tax_typ_nm_LC(info);
		else if (lc == Cnd_ptax_cur_cd) doCnd_ptax_cur_cd_LC(info);
		else if (lc == Cnd_ptax_cur_nm) doCnd_ptax_cur_nm_LC(info);
		else if (lc == Cnd_ret_prov_typ) doCnd_ret_prov_typ_LC(info);
		else if (lc == Cnd_ret_prov_typ_nm) doCnd_ret_prov_typ_nm_LC(info);
		else if (lc == Cnd_ret_prov_basis_typ) doCnd_ret_prov_basis_typ_LC(info);
		else if (lc == Cnd_ret_prov_basis_typ_nm) doCnd_ret_prov_basis_typ_nm_LC(info);
		else if (lc == Cnd_ret_trd_cur_cd) doCnd_ret_trd_cur_cd_LC(info);
		else if (lc == Cnd_ret_trd_cur_nm) doCnd_ret_trd_cur_nm_LC(info);
		else if (lc == Cnd_ret_tax_cd) doCnd_ret_tax_cd_LC(info);
		else if (lc == Cnd_ret_tax_nm) doCnd_ret_tax_nm_LC(info);
		else if (lc == Cnd_ret_tax_typ) doCnd_ret_tax_typ_LC(info);
		else if (lc == Cnd_ret_tax_typ_nm) doCnd_ret_tax_typ_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_rqst_cnt_rmrks) doCnd_rqst_cnt_rmrks_LC(info);
		else if (lc == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_xfr_src_typ) doCnd_xfr_src_typ_LC(info);
		else if (lc == Cnd_xfr_src_typ_nm) doCnd_xfr_src_typ_nm_LC(info);
		else if (lc == Cnd_xfr_src_no) doCnd_xfr_src_no_LC(info);
		else if (lc == Cnd_xfr_schd_no) doCnd_xfr_schd_no_LC(info);
		else if (lc == Cnd_itm_ord_no) doCnd_itm_ord_no_LC(info);
		else if (lc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_LC(info);
		else if (lc == Cnd_oper_inst_no) doCnd_oper_inst_no_LC(info);
		else if (lc == Cnd_inpt_schd_no) doCnd_inpt_schd_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == BulkSet_rcpt_dt) doBulkSet_rcpt_dt_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_LC(info);
		else if (lc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_gi_loc_cd) doRslt_gi_loc_cd_LC(info);
		else if (lc == columnRslt_gi_loc_nm) doRslt_gi_loc_nm_LC(info);
		else if (lc == columnRslt_gi_lg_grp_cd) doRslt_gi_lg_grp_cd_LC(info);
		else if (lc == columnRslt_gi_lg_grp_nm) doRslt_gi_lg_grp_nm_LC(info);
		else if (lc == columnRslt_gi_wg_cd) doRslt_gi_wg_cd_LC(info);
		else if (lc == columnRslt_gi_wg_nm) doRslt_gi_wg_nm_LC(info);
		else if (lc == columnRslt_gi_site_cd) doRslt_gi_site_cd_LC(info);
		else if (lc == columnRslt_gi_site_nm) doRslt_gi_site_nm_LC(info);
		else if (lc == columnRslt_gr_loc_cd) doRslt_gr_loc_cd_LC(info);
		else if (lc == columnRslt_gr_loc_nm) doRslt_gr_loc_nm_LC(info);
		else if (lc == columnRslt_gr_lg_grp_cd) doRslt_gr_lg_grp_cd_LC(info);
		else if (lc == columnRslt_gr_lg_grp_nm) doRslt_gr_lg_grp_nm_LC(info);
		else if (lc == columnRslt_gr_wg_cd) doRslt_gr_wg_cd_LC(info);
		else if (lc == columnRslt_gr_wg_nm) doRslt_gr_wg_nm_LC(info);
		else if (lc == columnRslt_gr_site_cd) doRslt_gr_site_cd_LC(info);
		else if (lc == columnRslt_gr_site_nm) doRslt_gr_site_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_gi_sppl_cd) doRslt_gi_sppl_cd_LC(info);
		else if (lc == columnRslt_gi_cur_cd) doRslt_gi_cur_cd_LC(info);
		else if (lc == columnRslt_gi_prov_amt_rnd_typ) doRslt_gi_prov_amt_rnd_typ_LC(info);
		else if (lc == columnRslt_gi_prov_tax_rnd_typ) doRslt_gi_prov_tax_rnd_typ_LC(info);
		else if (lc == columnRslt_gi_stk_arrv_bp_cd) doRslt_gi_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_gi_stk_arrv_bp_nm) doRslt_gi_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRslt_gr_sppl_cd) doRslt_gr_sppl_cd_LC(info);
		else if (lc == columnRslt_gr_cur_cd) doRslt_gr_cur_cd_LC(info);
		else if (lc == columnRslt_gr_prov_rcv_typ) doRslt_gr_prov_rcv_typ_LC(info);
		else if (lc == columnRslt_gr_prov_basis_typ) doRslt_gr_prov_basis_typ_LC(info);
		else if (lc == columnRslt_gr_prov_amt_rnd_typ) doRslt_gr_prov_amt_rnd_typ_LC(info);
		else if (lc == columnRslt_gr_prov_tax_rnd_typ) doRslt_gr_prov_tax_rnd_typ_LC(info);
		else if (lc == columnRslt_rcpt_dt) doRslt_rcpt_dt_LC(info);
		else if (lc == columnRslt_ship_schd_tm) doRslt_ship_schd_tm_LC(info);
		else if (lc == columnRslt_dlv_schd_tm) doRslt_dlv_schd_tm_LC(info);
		else if (lc == columnRslt_ship_term_cd) doRslt_ship_term_cd_LC(info);
		else if (lc == columnRslt_ship_term_nm) doRslt_ship_term_nm_LC(info);
		else if (lc == columnRslt_ship_term_cd_inv) doRslt_ship_term_cd_inv_LC(info);
		else if (lc == columnRslt_ship_inst_typ) doRslt_ship_inst_typ_LC(info);
		else if (lc == columnRslt_ship_inst_typ_nm) doRslt_ship_inst_typ_nm_LC(info);
		else if (lc == columnRslt_rsn_cd) doRslt_rsn_cd_LC(info);
		else if (lc == columnRslt_rsn_nm) doRslt_rsn_nm_LC(info);
		else if (lc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_LC(info);
		else if (lc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_LC(info);
		else if (lc == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_LC(info);
		else if (lc == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_LC(info);
		else if (lc == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_LC(info);
		else if (lc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_LC(info);
		else if (lc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_LC(info);
		else if (lc == columnRslt_prov_typ) doRslt_prov_typ_LC(info);
		else if (lc == columnRslt_prov_typ_nm) doRslt_prov_typ_nm_LC(info);
		else if (lc == columnRslt_prov_basis_typ) doRslt_prov_basis_typ_LC(info);
		else if (lc == columnRslt_prov_basis_typ_nm) doRslt_prov_basis_typ_nm_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_upri_dec_place) doRslt_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_prov_xrate_cd) doRslt_prov_xrate_cd_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_LC(info);
		else if (lc == columnRslt_ptax_cur_amt_dec_place) doRslt_ptax_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_wtax_rate) doRslt_wtax_rate_LC(info);
		else if (lc == columnRslt_ret_prov_typ) doRslt_ret_prov_typ_LC(info);
		else if (lc == columnRslt_ret_prov_typ_nm) doRslt_ret_prov_typ_nm_LC(info);
		else if (lc == columnRslt_ret_prov_basis_typ) doRslt_ret_prov_basis_typ_LC(info);
		else if (lc == columnRslt_ret_prov_basis_typ_nm) doRslt_ret_prov_basis_typ_nm_LC(info);
		else if (lc == columnRslt_ret_trd_cur_cd) doRslt_ret_trd_cur_cd_LC(info);
		else if (lc == columnRslt_ret_trd_cur_nm) doRslt_ret_trd_cur_nm_LC(info);
		else if (lc == columnRslt_ret_trd_cur_amt_dec_place) doRslt_ret_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_ret_trd_cur_upri_dec_place) doRslt_ret_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnRslt_ret_wtax_rate) doRslt_ret_wtax_rate_LC(info);
		else if (lc == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_LC(info);
		else if (lc == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_LC(info);
		else if (lc == columnRslt_base_ac_dt) doRslt_base_ac_dt_LC(info);
		else if (lc == columnRslt_rqst_cnt_rmrks) doRslt_rqst_cnt_rmrks_LC(info);
		else if (lc == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_xfr_src_typ) doRslt_xfr_src_typ_LC(info);
		else if (lc == columnRslt_xfr_src_typ_nm) doRslt_xfr_src_typ_nm_LC(info);
		else if (lc == columnRslt_xfr_src_no) doRslt_xfr_src_no_LC(info);
		else if (lc == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_LC(info);
		else if (lc == columnRslt_itm_ord_no) doRslt_itm_ord_no_LC(info);
		else if (lc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_LC(info);
		else if (lc == columnRslt_oper_inst_no) doRslt_oper_inst_no_LC(info);
		else if (lc == columnRslt_inpt_schd_no) doRslt_inpt_schd_no_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_LC(info);
		else if (lc == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_LC(info);
		else if (lc == columnRslt_vld_dt_to) doRslt_vld_dt_to_LC(info);
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
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_lg_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_unit_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_bp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_basis_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[tax_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_prov_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_tax_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_tax_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[xfr_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_schd_no_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rcpt_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_site_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[gi_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_prov_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_prov_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_rcv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_rcv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gr_prov_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gr_prov_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_schd_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_schd_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_term_cd_inv]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_term_cd_inv_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_id_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_xrate_cd_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_prov_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_prov_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_prov_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inpt_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inpt_schd_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_to_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_gi_loc_cd]の作成メソッド
	 */
	public MCList getCnd_gi_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gi_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_gi_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gi_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getCnd_gi_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gi_site_cd]の作成メソッド
	 */
	public MCList getCnd_gi_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gi_wg_cd]の作成メソッド
	 */
	public MCList getCnd_gi_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gi_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_gi_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_loc_cd]の作成メソッド
	 */
	public MCList getCnd_gr_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_gr_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_site_cd]の作成メソッド
	 */
	public MCList getCnd_gr_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_wg_cd]の作成メソッド
	 */
	public MCList getCnd_gr_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_gr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
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
	 * コンボ／リストのリスト[Cnd_trd_unit_cd]の作成メソッド
	 */
	public MCList getCnd_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_base_unit_cd]の作成メソッド
	 */
	public MCList getCnd_base_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_quality_typ]の作成メソッド
	 */
	public MCList getCnd_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_id_typ]の作成メソッド
	 */
	public MCList getCnd_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_bp_cd]の作成メソッド
	 */
	public MCList getCnd_stk_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
	 * コンボ／リストのリスト[Cnd_ship_term_cd]の作成メソッド
	 */
	public MCList getCnd_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_inst_typ]の作成メソッド
	 */
	public MCList getCnd_ship_inst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipInstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXfrBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_to_id_typ]の作成メソッド
	 */
	public MCList getCnd_ship_to_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getShipToIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_to_id_cd]の作成メソッド
	 */
	public MCList getCnd_ship_to_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getShipToId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prov_typ]の作成メソッド
	 */
	public MCList getCnd_prov_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prov_basis_typ]の作成メソッド
	 */
	public MCList getCnd_prov_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvBasisTyp(row, info);
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
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tax_typ]の作成メソッド
	 */
	public MCList getCnd_tax_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTaxTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ptax_cur_cd]の作成メソッド
	 */
	public MCList getCnd_ptax_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ret_prov_typ]の作成メソッド
	 */
	public MCList getCnd_ret_prov_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ret_prov_basis_typ]の作成メソッド
	 */
	public MCList getCnd_ret_prov_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvBasisTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ret_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_ret_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ret_tax_cd]の作成メソッド
	 */
	public MCList getCnd_ret_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ret_tax_typ]の作成メソッド
	 */
	public MCList getCnd_ret_tax_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTaxTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_xfr_src_typ]の作成メソッド
	 */
	public MCList getCnd_xfr_src_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getXfrSrcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_cd]の作成メソッド
	 */
	public MCList getRslt_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
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

	/**
	 * コンボ／リストのリスト[Rslt_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getRslt_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getRslt_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_unit_cd]の作成メソッド
	 */
	public MCList getRslt_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gi_loc_cd]の作成メソッド
	 */
	public MCList getRslt_gi_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getRslt_gi_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gi_lg_grp_cd]の作成メソッド
	 */
	public MCList getRslt_gi_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gi_wg_cd]の作成メソッド
	 */
	public MCList getRslt_gi_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gi_site_cd]の作成メソッド
	 */
	public MCList getRslt_gi_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gr_loc_cd]の作成メソッド
	 */
	public MCList getRslt_gr_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getRslt_gr_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gr_lg_grp_cd]の作成メソッド
	 */
	public MCList getRslt_gr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gr_wg_cd]の作成メソッド
	 */
	public MCList getRslt_gr_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gr_site_cd]の作成メソッド
	 */
	public MCList getRslt_gr_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_quality_typ]の作成メソッド
	 */
	public MCList getRslt_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gd_cd]の作成メソッド
	 */
	public MCList getRslt_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_stk_id_typ]の作成メソッド
	 */
	public MCList getRslt_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd]の作成メソッド
	 */
	public MCList getRslt_stk_bp_p_PPanel_columnStkBp_stk_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gi_sppl_cd]の作成メソッド
	 */
	public MCList getRslt_gi_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gi_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getRslt_gi_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_gr_sppl_cd]の作成メソッド
	 */
	public MCList getRslt_gr_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ship_term_cd]の作成メソッド
	 */
	public MCList getRslt_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ship_inst_typ]の作成メソッド
	 */
	public MCList getRslt_ship_inst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipInstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXfrBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_bd_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ship_to_id_typ]の作成メソッド
	 */
	public MCList getRslt_ship_to_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getShipToIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ship_to_id_cd]の作成メソッド
	 */
	public MCList getRslt_ship_to_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getShipToId(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_via_dlv_typ]の作成メソッド
	 */
	public MCList getRslt_via_dlv_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getViaDlvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_prov_typ]の作成メソッド
	 */
	public MCList getRslt_prov_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getProvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_prov_basis_typ]の作成メソッド
	 */
	public MCList getRslt_prov_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvBasisTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_cur_cd]の作成メソッド
	 */
	public MCList getRslt_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getRslt_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_base_cur_cd]の作成メソッド
	 */
	public MCList getRslt_base_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ptax_cur_cd]の作成メソッド
	 */
	public MCList getRslt_ptax_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ret_prov_typ]の作成メソッド
	 */
	public MCList getRslt_ret_prov_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ret_prov_basis_typ]の作成メソッド
	 */
	public MCList getRslt_ret_prov_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvBasisTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ret_trd_cur_cd]の作成メソッド
	 */
	public MCList getRslt_ret_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getRslt_ret_prov_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_xfr_src_typ]の作成メソッド
	 */
	public MCList getRslt_xfr_src_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getXfrSrcTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1000.Srch01")) {
			return new MS_MSBEL1000_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1000.Imp01")) {
			return new MS_MSBEL1000_Imp01Bridge();
		}
		if (id.equals("MS.MSBEL1000.Upd01")) {
			return new MS_MSBEL1000_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1000.Del01")) {
			return new MS_MSBEL1000_Del01Bridge();
		}
		if (id.equals("MS.MSBEL1000.Upd03")) {
			return new MS_MSBEL1000_Upd03Bridge();
		}
		if (id.equals("MS.MSBEL1000.Sprt01")) {
			return new MS_MSBEL1000_Sprt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1000_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1000_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1000_Srch01Bridge() {
			p_MS_MSBEL1000_Srch01 = new MCParam(PDef.MS_MSBEL1000_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1000_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1000.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));

			p_MS_MSBEL1000_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1000_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1000_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1000_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1000_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1000.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1000.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1000_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1000_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)p_MS_MSBEL1000_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1000_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1000_Imp01;

		/** コンストラクタ */
		protected MS_MSBEL1000_Imp01Bridge() {
			p_MS_MSBEL1000_Imp01 = new MCParam(PDef.MS_MSBEL1000_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1000_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));

			p_MS_MSBEL1000_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1000_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1000_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1000_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1000_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1000_Imp01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1000_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)p_MS_MSBEL1000_Imp01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1000_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1000_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1000_Upd01Bridge() {
			p_MS_MSBEL1000_Upd01 = new MCParam(PDef.MS_MSBEL1000_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1000_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));

			p_MS_MSBEL1000_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1000_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1000_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1000_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1000_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1000_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1000_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)p_MS_MSBEL1000_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1000_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1000_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1000_Del01Bridge() {
			p_MS_MSBEL1000_Del01 = new MCParam(PDef.MS_MSBEL1000_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1000_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));

			p_MS_MSBEL1000_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1000_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1000_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1000_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1000_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1000_Del01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1000_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)p_MS_MSBEL1000_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1000_Upd03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Upd03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1000_Upd03;

		/** コンストラクタ */
		protected MS_MSBEL1000_Upd03Bridge() {
			p_MS_MSBEL1000_Upd03 = new MCParam(PDef.MS_MSBEL1000_Upd03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1000_Upd03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));

			p_MS_MSBEL1000_Upd03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1000_Upd03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1000_Upd03.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1000_Upd03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1000_Upd03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1000_Upd03.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1000_Upd03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)p_MS_MSBEL1000_Upd03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1000_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1000_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1000_Sprt01;

		/** コンストラクタ */
		protected MS_MSBEL1000_Sprt01Bridge() {
			p_MS_MSBEL1000_Sprt01 = new MCParam(PDef.MS_MSBEL1000_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1000_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));

			p_MS_MSBEL1000_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1000_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1000_Sprt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1000_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1000_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1000.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1000_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1000.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1000_Sprt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1000.RsltR>)p_MS_MSBEL1000_Sprt01.getContainerParam().getDownBlock(0));
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