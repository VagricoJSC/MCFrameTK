package mcframe.clientMSBE.MSBEP1420;

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
import mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Srch01Caller;
import mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Srch02Caller;
import mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Upd01Caller;
import mcframe.clientMSBE.MSBEP1420.MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Sprt01Caller;

/**
 * 画面"MSBEP_ShipSchdReg"パネルクラスです。<p>
 *
 * 出荷予定の変更登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_ShipSchdReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1420";

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
	// [PrSts]ブロック関連のField定義
	public MCPanel PrStsPanel = null;
	public MCTitledBorder PrStsTitledBorder = null;
	// [PrSts]ブロックの項目のField定義
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
	// [AllocSts]ブロック関連のField定義
	public MCPanel AllocStsPanel = null;
	public MCTitledBorder AllocStsTitledBorder = null;
	// [AllocSts]ブロックの項目のField定義
	// [ShipBlk]ブロック関連のField定義
	public MCPanel ShipBlkPanel = null;
	public MCTitledBorder ShipBlkTitledBorder = null;
	// [ShipBlk]ブロックの項目のField定義
	// [ShipSts]ブロック関連のField定義
	public MCPanel ShipStsPanel = null;
	public MCTitledBorder ShipStsTitledBorder = null;
	// [ShipSts]ブロックの項目のField定義
	// [DlvCnd]ブロック関連のField定義
	public MCPanel DlvCndPanel = null;
	// [DlvCnd]ブロックの項目のField定義
	// [CstCnd]ブロック関連のField定義
	public MCPanel CstCndPanel = null;
	// [CstCnd]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Edit;REF,Refer UPD,訂正する;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * SHIP,Shipping schedule;ALLOC,Allocation status SHIP,出荷予定;ALLOC,引当状況.<p>
	 *
	 */
	public MCButtonGroup Cnd_md_Group = null;
	public MCRadioButton Cnd_md_SHIP = null;
	public MCRadioButton Cnd_md_ALLOC = null;
	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public MCCheckBox Cnd_no_lot_chk_flg = null;
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
	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public MCCheckBox Cnd_not_alloc_flg = null;
	/**
	 * Partial allocation 一部引当.<p>
	 *
	 */
	public MCCheckBox Cnd_part_alloc_flg = null;
	/**
	 * 100% allocation 全数引当.<p>
	 *
	 */
	public MCCheckBox Cnd_all_alloc_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_alloc_invalid_flg = null;
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_block_flg = null;
	/**
	 * Non-pending shipping 出荷留め以外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_ship_block_flg = null;
	/**
	 * Desired delivery date delayed 納入希望日遅れ.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_rqst_flg = null;
	/**
	 * Desired shipping date delayed 出荷希望日遅れ.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_rqst_flg = null;
	/**
	 * Delivery request date delayed 納品依頼日遅れ.<p>
	 *
	 */
	public MCCheckBox Cnd_pd_inst_dlv_flg = null;
	public MCLabel Cnd_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_lg_grp_nm = null;
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
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ssdt_p_PPanel;
	public MCDateField Cnd_ship_schd_dt_fr;	// [Cnd]の[ssdt_p.ymd_fr]を[Cnd_ship_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_fr;	// [Cnd]の[ssdt_p.hm_fr]を[Cnd_ship_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_dt_to;	// [Cnd]の[ssdt_p.ymd_to]を[Cnd_ship_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_to;	// [Cnd]の[ssdt_p.hm_to]を[Cnd_ship_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dsdt_p_PPanel;
	public MCDateField Cnd_dlv_schd_dt_fr;	// [Cnd]の[dsdt_p.ymd_fr]を[Cnd_dlv_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_hm_fr;	// [Cnd]の[dsdt_p.hm_fr]を[Cnd_dlv_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_dt_to;	// [Cnd]の[dsdt_p.ymd_to]を[Cnd_dlv_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_hm_to;	// [Cnd]の[dsdt_p.hm_to]を[Cnd_dlv_schd_hm_to]としてエイリアス定義。
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_cd = null;
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
	public MCLabel Cnd_alloc_grp_cd_Label = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_alloc_grp_nm = null;
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
	 * Receiving point cd. 送付先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_to_id_cd = null;
	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public MCTextField Cnd_ship_to_id_nm = null;
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
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_nm = null;
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
	public MCLabel Cnd_via_dlv_typ_Label = null;
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_via_dlv_typ = null;
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public MCTextField Cnd_via_dlv_typ_nm = null;
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
	public MCLabel Cnd_ship_wk_cd_Label = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCTextField Cnd_ship_wk_nm = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_wrk_no_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_wrk_no_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_wrk_no_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_wrk_no_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_wrk_no_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
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
	public MCLabel Cnd_slo_d_no_Label = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_d_no = null;
	public MCLabel Cnd_xfr_schd_no_Label = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_xfr_schd_no = null;
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
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public MCCheckBox Cnd_abort_flg = null;
	public MCLabel Cnd_ship_cnt_rmrks_Label = null;
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_ship_cnt_rmrks = null;
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	public MCLabel Cnd_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_d_rmrks = null;
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
	public MCTitledBorder BulkSetTitledBorder = null;
	// [BulkSet]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_ship_schd_p_PPanel;
	public MCDateField BulkSet_ship_schd_dt;	// [BulkSet]の[ship_schd_p.ymd]を[BulkSet_ship_schd_dt]としてエイリアス定義。
	public MCDateField BulkSet_ship_schd_hm;	// [BulkSet]の[ship_schd_p.hm]を[BulkSet_ship_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_dlv_schd_p_PPanel;
	public MCDateField BulkSet_dlv_schd_dt;	// [BulkSet]の[dlv_schd_p.ymd]を[BulkSet_dlv_schd_dt]としてエイリアス定義。
	public MCDateField BulkSet_dlv_schd_hm;	// [BulkSet]の[dlv_schd_p.hm]を[BulkSet_dlv_schd_hm]としてエイリアス定義。
	public MCLabel BulkSet_ship_wk_cd_Label = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCTextComboBox BulkSet_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCTextField BulkSet_ship_wk_nm = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1420.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	 * Allocation status type 引当状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_sts_typ = null;
	/**
	 * Allocation status type name 引当状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_sts_typ_nm = null;
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_block_flg = null;
	/**
	 * Shipping available 出荷可能.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_abl_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_flg = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_rqst_p_PPanel;
	public MCColumnConfig columnRslt_dlv_rqst_dt;// [Rslt]の[dlv_rqst_p.ymd]を[columnRslt_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_rqst_hm;// [Rslt]の[dlv_rqst_p.hm]を[columnRslt_dlv_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_pd_inst_dlv_p_PPanel;
	public MCColumnConfig columnRslt_pd_inst_dlv_dt;// [Rslt]の[pd_inst_dlv_p.ymd]を[columnRslt_pd_inst_dlv_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_pd_inst_dlv_hm;// [Rslt]の[pd_inst_dlv_p.hm]を[columnRslt_pd_inst_dlv_hm]としてエイリアス定義。
	/**
	 * Arrival day type (Week) 着曜日区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_day_week_typ = null;
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_day_week_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_rqst_p_PPanel;
	public MCColumnConfig columnRslt_ship_rqst_dt;// [Rslt]の[ship_rqst_p.ymd]を[columnRslt_ship_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_hm;// [Rslt]の[ship_rqst_p.hm]を[columnRslt_ship_rqst_hm]としてエイリアス定義。
	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public MCColumnConfig columnRslt_no_calc_flg = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_src_ship_schd_p_PPanel;
	public MCColumnConfig columnRslt_src_ship_schd_dt;// [Rslt]の[src_ship_schd_p.ymd]を[columnRslt_src_ship_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_src_ship_schd_hm;// [Rslt]の[src_ship_schd_p.hm]を[columnRslt_src_ship_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ent_ship_schd_p_PPanel;
	public MCColumnConfig columnRslt_ent_ship_schd_dt;// [Rslt]の[ent_ship_schd_p.ymd]を[columnRslt_ent_ship_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ent_ship_schd_hm;// [Rslt]の[ent_ship_schd_p.hm]を[columnRslt_ent_ship_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_schd_p_PPanel;
	public MCColumnConfig columnRslt_ship_schd_dt;// [Rslt]の[ship_schd_p.ymd]を[columnRslt_ship_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_schd_hm;// [Rslt]の[ship_schd_p.hm]を[columnRslt_ship_schd_hm]としてエイリアス定義。
	/**
	 * Shipping schedule time 出荷予定時間.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_time = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_fix_ship_schd_p_PPanel;
	public MCColumnConfig columnRslt_fix_ship_schd_dt;// [Rslt]の[fix_ship_schd_p.ymd]を[columnRslt_fix_ship_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_fix_ship_schd_hm;// [Rslt]の[fix_ship_schd_p.hm]を[columnRslt_fix_ship_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_schd_p_PPanel;
	public MCColumnConfig columnRslt_dlv_schd_dt;// [Rslt]の[dlv_schd_p.ymd]を[columnRslt_dlv_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_schd_hm;// [Rslt]の[dlv_schd_p.hm]を[columnRslt_dlv_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ent_dlv_schd_p_PPanel;
	public MCColumnConfig columnRslt_ent_dlv_schd_dt;// [Rslt]の[ent_dlv_schd_p.ymd]を[columnRslt_ent_dlv_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ent_dlv_schd_hm;// [Rslt]の[ent_dlv_schd_p.hm]を[columnRslt_ent_dlv_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_fix_dlv_schd_p_PPanel;
	public MCColumnConfig columnRslt_fix_dlv_schd_dt;// [Rslt]の[fix_dlv_schd_p.ymd]を[columnRslt_fix_dlv_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_fix_dlv_schd_hm;// [Rslt]の[fix_dlv_schd_p.hm]を[columnRslt_fix_dlv_schd_hm]としてエイリアス定義。
	/**
	 * Closing time check 締時間チェック.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cl_time_chk_flg = null;
	/**
	 * Shipping date check 出荷日チェック.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dt_chk_flg = null;
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
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_grp_cd = null;
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_grp_nm = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_wk_nm = null;
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_lg_grp_nm = null;
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_lg_grp_cd = null;
	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_lg_grp_nm = null;
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
	 * Receiving point cd. 送付先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_cd = null;
	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_id_nm = null;
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_to_sundry_flg = null;
	public mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D Rslt_ship_to_addr_p_PPanel;
	public MCColumnConfig columnRslt_ship_to_show_dtl;// [Rslt]の[ship_to_addr_p.show_dtl]を[columnRslt_ship_to_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_zip_cd;// [Rslt]の[ship_to_addr_p.zip_cd]を[columnRslt_ship_to_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr1;// [Rslt]の[ship_to_addr_p.addr1]を[columnRslt_ship_to_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr2;// [Rslt]の[ship_to_addr_p.addr2]を[columnRslt_ship_to_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr3;// [Rslt]の[ship_to_addr_p.addr3]を[columnRslt_ship_to_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_addr4;// [Rslt]の[ship_to_addr_p.addr4]を[columnRslt_ship_to_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntct_dpt;// [Rslt]の[ship_to_addr_p.cntct_dpt]を[columnRslt_ship_to_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntct_psn;// [Rslt]の[ship_to_addr_p.cntct_psn]を[columnRslt_ship_to_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_tel;// [Rslt]の[ship_to_addr_p.tel]を[columnRslt_ship_to_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_fax;// [Rslt]の[ship_to_addr_p.fax]を[columnRslt_ship_to_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntry_cd;// [Rslt]の[ship_to_addr_p.cntry_cd]を[columnRslt_ship_to_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_to_cntry_nm;// [Rslt]の[ship_to_addr_p.cntry_nm]を[columnRslt_ship_to_cntry_nm]としてエイリアス定義。
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
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_nm = null;
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
	 * Request PIC cd. 依頼担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_usr_cd = null;
	/**
	 * Request PIC name 依頼担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_usr_nm = null;
	/**
	 * Request dept. cd. 依頼部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dpt_cd = null;
	/**
	 * Request dept. name 依頼部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dpt_nm = null;
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
	public MCColumnConfig columnRslt_stk_mng_typ = null;
	public MCColumnConfig columnRslt_dscnt_itm_flg = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno1_null_flg;// [Rslt]の[sno_p.sno1_null_flg]を[columnRslt_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2_null_flg;// [Rslt]の[sno_p.sno2_null_flg]を[columnRslt_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3_null_flg;// [Rslt]の[sno_p.sno3_null_flg]を[columnRslt_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4_null_flg;// [Rslt]の[sno_p.sno4_null_flg]を[columnRslt_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_alloc_sno_p_PPanel;
	public MCColumnConfig columnRslt_alloc_sno1;// [Rslt]の[alloc_sno_p.sno1]を[columnRslt_alloc_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_alloc_sno2;// [Rslt]の[alloc_sno_p.sno2]を[columnRslt_alloc_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_alloc_sno3;// [Rslt]の[alloc_sno_p.sno3]を[columnRslt_alloc_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_alloc_sno4;// [Rslt]の[alloc_sno_p.sno4]を[columnRslt_alloc_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_alloc_wrk_no;// [Rslt]の[alloc_sno_p.wrk_no]を[columnRslt_alloc_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_alloc_wrk_nm;// [Rslt]の[alloc_sno_p.wrk_nm]を[columnRslt_alloc_wrk_nm]としてエイリアス定義。
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
	/**
	 * Unit cd. (Allocation) 単位ＣＤ（引当）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ent_unit_cd = null;
	/**
	 * Unit name (Allocation) 単位名（引当）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ent_unit_nm = null;
	/**
	 * Number of decimal places (Allocation) 小数部有効桁数（引当）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ent_unit_dec_place = null;
	/**
	 * Transaction unit conversion base qty. (Allocation) 取引単位換算基準数量（引当）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ent_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. (Allocation) 取引単位換算数量（引当）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ent_unit_conv_qty = null;
	/**
	 * Transaction unit rounding type (Allocation) 取引単位端数処理区分（引当）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ent_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_alloc_qty_p_PPanel;
	public MCColumnConfig columnRslt_alloc_ent_unit_qty;// [Rslt]の[alloc_qty_p.qty]を[columnRslt_alloc_ent_unit_qty]としてエイリアス定義。
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abort_flg = null;
	/**
	 * Split 分割済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_div_flg = null;
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	/**
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_conv_base_qty = null;
	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_conv_qty = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_alloc_base_qty_p_PPanel;
	public MCColumnConfig columnRslt_alloc_base_unit_qty;// [Rslt]の[alloc_base_qty_p.qty]を[columnRslt_alloc_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_schd_alloc_qty_p_PPanel;
	public MCColumnConfig columnRslt_schd_alloc_qty;// [Rslt]の[schd_alloc_qty_p.qty]を[columnRslt_schd_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_schd_wait_qty_p_PPanel;
	public MCColumnConfig columnRslt_schd_wait_qty;// [Rslt]の[schd_wait_qty_p.qty]を[columnRslt_schd_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_ship_inst_qty;// [Rslt]の[inst_qty_p.qty]を[columnRslt_ship_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_ship_act_qty;// [Rslt]の[act_qty_p.qty]を[columnRslt_ship_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_iv_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_iv_schd_qty;// [Rslt]の[iv_schd_qty_p.qty]を[columnRslt_iv_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_iv_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_iv_act_qty;// [Rslt]の[iv_act_qty_p.qty]を[columnRslt_iv_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_act_cont_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_qty;// [Rslt]の[act_cont_p.cont_qty]を[columnRslt_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Rslt_act_fctr_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_fctr;// [Rslt]の[act_fctr_p.act_cont_fctr]を[columnRslt_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_std_cont_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_qty;// [Rslt]の[std_cont_p.cont_qty]を[columnRslt_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_unit_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_unit_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_unit_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wt = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dim = null;
	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_flg = null;
	/**
	 * Gross allocation 総量引当.<p>
	 *
	 */
	public MCColumnConfig columnRslt_grp_alloc_flg = null;
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
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mng_typ = null;
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ = null;
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no_typ = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_flg = null;
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
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_grp_nm = null;
	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_def_loc_cd = null;
	/**
	 * Normal shipping location name 通常出荷場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_def_loc_nm = null;
	/**
	 * Normal shipping location priority 通常出荷場所優先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_loc_prio_flg = null;
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_assort_typ = null;
	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_assort_typ_nm = null;
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_set_itm_grp_no = null;
	/**
	 * Assortment status 品揃状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_assort_sts_mark = null;
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_typ = null;
	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_typ_nm = null;
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
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_cnt_rmrks = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_d_rmrks = null;
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
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xfr_schd_no = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * I/V transaction Ｉ／Ｖ取引.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_trd_flg = null;
	/**
	 * I/V entered Ｉ／Ｖ登録済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_reg_flg = null;
	/**
	 * I/V unit shipping Ｉ／Ｖ単位出荷.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_ship_flg = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_no = null;
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_alloc_sts_no = null;
	public MCColumnConfig columnRslt_org_ship_alloc_sts_no = null;
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
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_typ = null;
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_pr_no = null;
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_scope_typ = null;
	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_itm_nm = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_cd = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_pr_upd_cntr = null;
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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_peg_no = null;
	/**
	 * Remaining allocation 引当残.<p>
	 *
	 */
	public MCColumnConfig columnRslt_no_alloc_flg = null;
	/**
	 * Source firm 元確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_org_fix_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Shipping order entry 出荷指図登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1400 = null;
	/**
	 * Shipping result entry 出荷実績登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1440 = null;
	/**
	 * Shipping plan 出荷計画.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1430 = null;
	public mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H Btn_Btn_open_MSBEP0500_PPanel;
	/**
	 * Suggest lot/location ロット・場所提案.<p>
	 *
	 */
	public MCButton Btn_srch02 = null;
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
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [UPD_SHIP]モードを表す定数 */
	public static final String UPD_SHIP = "UPD_SHIP";
	/** [UPD_ALLOC]モードを表す定数 */
	public static final String UPD_ALLOC = "UPD_ALLOC";
	/** [REF_SHIP]モードを表す定数 */
	public static final String REF_SHIP = "REF_SHIP";
	/** [REF_ALLOC]モードを表す定数 */
	public static final String REF_ALLOC = "REF_ALLOC";
	/** [FIX_SHIP]モードを表す定数 */
	public static final String FIX_SHIP = "FIX_SHIP";
	/** [FIX_ALLOC]モードを表す定数 */
	public static final String FIX_ALLOC = "FIX_ALLOC";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_UPD, SRCH_REF, UPD_SHIP, UPD_ALLOC, REF_SHIP, REF_ALLOC, FIX_SHIP, FIX_ALLOC};
	
	/** [MS_MSBEL1420_Srch01]のCallerの作成 */
	protected MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Srch01Caller createMS_MSBEL1420_Srch01() {
		MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Srch01Caller<MSBEP_ShipSchdReg, MS_MSBEL1420_Srch01Bridge>
		caller = ((MSBEP_ShipSchdReg_MC)this).new MS_MSBEL1420_Srch01Caller<MSBEP_ShipSchdReg, MS_MSBEL1420_Srch01Bridge>(
					(MSBEP_ShipSchdReg)this, new MS_MSBEL1420_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1420_Srch01]の呼び出し */
	protected void callMS_MSBEL1420_Srch01() {
		MCCaller caller = createMS_MSBEL1420_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1420_Srch02]のCallerの作成 */
	protected MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Srch02Caller createMS_MSBEL1420_Srch02() {
		MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Srch02Caller<MSBEP_ShipSchdReg, MS_MSBEL1420_Srch02Bridge>
		caller = ((MSBEP_ShipSchdReg_MC)this).new MS_MSBEL1420_Srch02Caller<MSBEP_ShipSchdReg, MS_MSBEL1420_Srch02Bridge>(
					(MSBEP_ShipSchdReg)this, new MS_MSBEL1420_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL1420_Srch02]の呼び出し */
	protected void callMS_MSBEL1420_Srch02() {
		MCCaller caller = createMS_MSBEL1420_Srch02();
		caller.exec();
	}
	/** [MS_MSBEL1420_Upd01]のCallerの作成 */
	protected MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Upd01Caller createMS_MSBEL1420_Upd01() {
		MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Upd01Caller<MSBEP_ShipSchdReg, MS_MSBEL1420_Upd01Bridge>
		caller = ((MSBEP_ShipSchdReg_MC)this).new MS_MSBEL1420_Upd01Caller<MSBEP_ShipSchdReg, MS_MSBEL1420_Upd01Bridge>(
					(MSBEP_ShipSchdReg)this, new MS_MSBEL1420_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1420_Upd01]の呼び出し */
	protected void callMS_MSBEL1420_Upd01() {
		MCCaller caller = createMS_MSBEL1420_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1420_Sprt01]のCallerの作成 */
	protected MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Sprt01Caller createMS_MSBEL1420_Sprt01() {
		MSBEP_ShipSchdReg_MC.MS_MSBEL1420_Sprt01Caller<MSBEP_ShipSchdReg, MS_MSBEL1420_Sprt01Bridge>
		caller = ((MSBEP_ShipSchdReg_MC)this).new MS_MSBEL1420_Sprt01Caller<MSBEP_ShipSchdReg, MS_MSBEL1420_Sprt01Bridge>(
					(MSBEP_ShipSchdReg)this, new MS_MSBEL1420_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1420_Sprt01]の呼び出し */
	protected void callMS_MSBEL1420_Sprt01() {
		MCCaller caller = createMS_MSBEL1420_Sprt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1420.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1420.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1420.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1420.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1420.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1420.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1420.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBE.MSBEP1420.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1420.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBE.MSBEP1420.BulkSetR createBulkSetR() {
		return mcframe.clientMSBE.MSBEP1420.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1420.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1420.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1420.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1420.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1420.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class);
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
		ret.add(SrchModePanel);
		ret.add(PrStsPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(AllocStsPanel);
		ret.add(ShipBlkPanel);
		ret.add(ShipStsPanel);
		ret.add(DlvCndPanel);
		ret.add(CstCndPanel);
		ret.add(ItmCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipSchdReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_ShipSchdReg_MC_A(String name) {
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
		MSBEP_ShipSchdReg_MC.jbCreateScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateSrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreatePrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateTop((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateFold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateTab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateTab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateTab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateTab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateAllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateDlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateCstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateCtrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateRPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateBulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateRslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbCreateBtn((MSBEP_ShipSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [PrSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrSts(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [AllocSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAllocSts(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [ShipBlk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipBlk(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [ShipSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipSts(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [CstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstCnd(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_ShipSchdReg p) {
		p.Cnd_ssdt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ssdt_p());
		p.Cnd_ssdt_p_PPanel.setName("Cnd.ssdt_p");
		p.Cnd_ship_schd_dt_fr = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_schd_dt_fr.addAliasName("Cnd.ship_schd_dt_fr", p);
		p.Cnd_ship_schd_hm_fr = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_schd_hm_fr.addAliasName("Cnd.ship_schd_hm_fr", p);
		p.Cnd_ship_schd_dt_to = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_schd_dt_to.addAliasName("Cnd.ship_schd_dt_to", p);
		p.Cnd_ship_schd_hm_to = p.Cnd_ssdt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_schd_hm_to.addAliasName("Cnd.ship_schd_hm_to", p);
		p.Cnd_dsdt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dsdt_p());
		p.Cnd_dsdt_p_PPanel.setName("Cnd.dsdt_p");
		p.Cnd_dlv_schd_dt_fr = p.Cnd_dsdt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_schd_dt_fr.addAliasName("Cnd.dlv_schd_dt_fr", p);
		p.Cnd_dlv_schd_hm_fr = p.Cnd_dsdt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_schd_hm_fr.addAliasName("Cnd.dlv_schd_hm_fr", p);
		p.Cnd_dlv_schd_dt_to = p.Cnd_dsdt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_schd_dt_to.addAliasName("Cnd.dlv_schd_dt_to", p);
		p.Cnd_dlv_schd_hm_to = p.Cnd_dsdt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_schd_hm_to.addAliasName("Cnd.dlv_schd_hm_to", p);
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
		p.Cnd_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_wrk_no_p());
		p.Cnd_sno_wrk_no_p_PPanel.setName("Cnd.sno_wrk_no_p");
		p.Cnd_sno1 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_wrk_no = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm;
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
	protected static void jbCreateCtrl(MSBEP_ShipSchdReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_ShipSchdReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBEP_ShipSchdReg p) {
		p.BulkSet_ship_schd_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().ship_schd_p());
		p.BulkSet_ship_schd_p_PPanel.setName("BulkSet.ship_schd_p");
		p.BulkSet_ship_schd_dt = p.BulkSet_ship_schd_p_PPanel.YmdHm_ymd;
		p.BulkSet_ship_schd_dt.addAliasName("BulkSet.ship_schd_dt", p);
		p.BulkSet_ship_schd_hm = p.BulkSet_ship_schd_p_PPanel.YmdHm_hm;
		p.BulkSet_ship_schd_hm.addAliasName("BulkSet.ship_schd_hm", p);
		p.BulkSet_dlv_schd_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().dlv_schd_p());
		p.BulkSet_dlv_schd_p_PPanel.setName("BulkSet.dlv_schd_p");
		p.BulkSet_dlv_schd_dt = p.BulkSet_dlv_schd_p_PPanel.YmdHm_ymd;
		p.BulkSet_dlv_schd_dt.addAliasName("BulkSet.dlv_schd_dt", p);
		p.BulkSet_dlv_schd_hm = p.BulkSet_dlv_schd_p_PPanel.YmdHm_hm;
		p.BulkSet_dlv_schd_hm.addAliasName("BulkSet.dlv_schd_hm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_ShipSchdReg p) {
		p.Rslt_dlv_rqst_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$dlv_rqst_p);
		p.Rslt_dlv_rqst_p_PPanel.setName("Rslt.dlv_rqst_p");
		p.columnRslt_dlv_rqst_dt = p.Rslt_dlv_rqst_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_rqst_dt.addAliasName("Rslt.dlv_rqst_dt", p);
		p.columnRslt_dlv_rqst_hm = p.Rslt_dlv_rqst_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_rqst_hm.addAliasName("Rslt.dlv_rqst_hm", p);
		p.Rslt_pd_inst_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$pd_inst_dlv_p);
		p.Rslt_pd_inst_dlv_p_PPanel.setName("Rslt.pd_inst_dlv_p");
		p.columnRslt_pd_inst_dlv_dt = p.Rslt_pd_inst_dlv_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_pd_inst_dlv_dt.addAliasName("Rslt.pd_inst_dlv_dt", p);
		p.columnRslt_pd_inst_dlv_hm = p.Rslt_pd_inst_dlv_p_PPanel.columnYmdHm_hm;
		p.columnRslt_pd_inst_dlv_hm.addAliasName("Rslt.pd_inst_dlv_hm", p);
		p.Rslt_ship_rqst_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$ship_rqst_p);
		p.Rslt_ship_rqst_p_PPanel.setName("Rslt.ship_rqst_p");
		p.columnRslt_ship_rqst_dt = p.Rslt_ship_rqst_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_rqst_dt.addAliasName("Rslt.ship_rqst_dt", p);
		p.columnRslt_ship_rqst_hm = p.Rslt_ship_rqst_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_rqst_hm.addAliasName("Rslt.ship_rqst_hm", p);
		p.Rslt_src_ship_schd_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$src_ship_schd_p);
		p.Rslt_src_ship_schd_p_PPanel.setName("Rslt.src_ship_schd_p");
		p.columnRslt_src_ship_schd_dt = p.Rslt_src_ship_schd_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_src_ship_schd_dt.addAliasName("Rslt.src_ship_schd_dt", p);
		p.columnRslt_src_ship_schd_hm = p.Rslt_src_ship_schd_p_PPanel.columnYmdHm_hm;
		p.columnRslt_src_ship_schd_hm.addAliasName("Rslt.src_ship_schd_hm", p);
		p.Rslt_ent_ship_schd_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$ent_ship_schd_p);
		p.Rslt_ent_ship_schd_p_PPanel.setName("Rslt.ent_ship_schd_p");
		p.columnRslt_ent_ship_schd_dt = p.Rslt_ent_ship_schd_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ent_ship_schd_dt.addAliasName("Rslt.ent_ship_schd_dt", p);
		p.columnRslt_ent_ship_schd_hm = p.Rslt_ent_ship_schd_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ent_ship_schd_hm.addAliasName("Rslt.ent_ship_schd_hm", p);
		p.Rslt_ship_schd_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$ship_schd_p);
		p.Rslt_ship_schd_p_PPanel.setName("Rslt.ship_schd_p");
		p.columnRslt_ship_schd_dt = p.Rslt_ship_schd_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_schd_dt.addAliasName("Rslt.ship_schd_dt", p);
		p.columnRslt_ship_schd_hm = p.Rslt_ship_schd_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_schd_hm.addAliasName("Rslt.ship_schd_hm", p);
		p.Rslt_fix_ship_schd_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$fix_ship_schd_p);
		p.Rslt_fix_ship_schd_p_PPanel.setName("Rslt.fix_ship_schd_p");
		p.columnRslt_fix_ship_schd_dt = p.Rslt_fix_ship_schd_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_fix_ship_schd_dt.addAliasName("Rslt.fix_ship_schd_dt", p);
		p.columnRslt_fix_ship_schd_hm = p.Rslt_fix_ship_schd_p_PPanel.columnYmdHm_hm;
		p.columnRslt_fix_ship_schd_hm.addAliasName("Rslt.fix_ship_schd_hm", p);
		p.Rslt_dlv_schd_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$dlv_schd_p);
		p.Rslt_dlv_schd_p_PPanel.setName("Rslt.dlv_schd_p");
		p.columnRslt_dlv_schd_dt = p.Rslt_dlv_schd_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_schd_dt.addAliasName("Rslt.dlv_schd_dt", p);
		p.columnRslt_dlv_schd_hm = p.Rslt_dlv_schd_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_schd_hm.addAliasName("Rslt.dlv_schd_hm", p);
		p.Rslt_ent_dlv_schd_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$ent_dlv_schd_p);
		p.Rslt_ent_dlv_schd_p_PPanel.setName("Rslt.ent_dlv_schd_p");
		p.columnRslt_ent_dlv_schd_dt = p.Rslt_ent_dlv_schd_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ent_dlv_schd_dt.addAliasName("Rslt.ent_dlv_schd_dt", p);
		p.columnRslt_ent_dlv_schd_hm = p.Rslt_ent_dlv_schd_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ent_dlv_schd_hm.addAliasName("Rslt.ent_dlv_schd_hm", p);
		p.Rslt_fix_dlv_schd_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$fix_dlv_schd_p);
		p.Rslt_fix_dlv_schd_p_PPanel.setName("Rslt.fix_dlv_schd_p");
		p.columnRslt_fix_dlv_schd_dt = p.Rslt_fix_dlv_schd_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_fix_dlv_schd_dt.addAliasName("Rslt.fix_dlv_schd_dt", p);
		p.columnRslt_fix_dlv_schd_hm = p.Rslt_fix_dlv_schd_p_PPanel.columnYmdHm_hm;
		p.columnRslt_fix_dlv_schd_hm.addAliasName("Rslt.fix_dlv_schd_hm", p);
		p.Rslt_ship_to_addr_p_PPanel = mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$ship_to_addr_p);
		p.Rslt_ship_to_addr_p_PPanel.setName("Rslt.ship_to_addr_p");
		p.columnRslt_ship_to_show_dtl = p.Rslt_ship_to_addr_p_PPanel.columnAddr_show_dtl;
		p.columnRslt_ship_to_show_dtl.addAliasName("Rslt.ship_to_show_dtl", p);
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
		p.columnRslt_ship_to_cntry_cd = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd;
		p.columnRslt_ship_to_cntry_cd.addAliasName("Rslt.ship_to_cntry_cd", p);
		p.columnRslt_ship_to_cntry_nm = p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm;
		p.columnRslt_ship_to_cntry_nm.addAliasName("Rslt.ship_to_cntry_nm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$itm_p);
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
		p.Rslt_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno1_null_flg = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnRslt_sno1_null_flg.addAliasName("Rslt.sno1_null_flg", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno2_null_flg = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnRslt_sno2_null_flg.addAliasName("Rslt.sno2_null_flg", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno3_null_flg = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnRslt_sno3_null_flg.addAliasName("Rslt.sno3_null_flg", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_sno4_null_flg = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnRslt_sno4_null_flg.addAliasName("Rslt.sno4_null_flg", p);
		p.columnRslt_wrk_no = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_alloc_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$alloc_sno_p);
		p.Rslt_alloc_sno_p_PPanel.setName("Rslt.alloc_sno_p");
		p.columnRslt_alloc_sno1 = p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_alloc_sno1.addAliasName("Rslt.alloc_sno1", p);
		p.columnRslt_alloc_sno2 = p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_alloc_sno2.addAliasName("Rslt.alloc_sno2", p);
		p.columnRslt_alloc_sno3 = p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_alloc_sno3.addAliasName("Rslt.alloc_sno3", p);
		p.columnRslt_alloc_sno4 = p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_alloc_sno4.addAliasName("Rslt.alloc_sno4", p);
		p.columnRslt_alloc_wrk_no = p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_alloc_wrk_no.addAliasName("Rslt.alloc_wrk_no", p);
		p.columnRslt_alloc_wrk_nm = p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_alloc_wrk_nm.addAliasName("Rslt.alloc_wrk_nm", p);
		p.Rslt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$qty_p);
		p.Rslt_qty_p_PPanel.setName("Rslt.qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$alloc_qty_p);
		p.Rslt_alloc_qty_p_PPanel.setName("Rslt.alloc_qty_p");
		p.columnRslt_alloc_ent_unit_qty = p.Rslt_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRslt_alloc_ent_unit_qty.addAliasName("Rslt.alloc_ent_unit_qty", p);
		p.Rslt_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$base_qty_p);
		p.Rslt_base_qty_p_PPanel.setName("Rslt.base_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_alloc_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$alloc_base_qty_p);
		p.Rslt_alloc_base_qty_p_PPanel.setName("Rslt.alloc_base_qty_p");
		p.columnRslt_alloc_base_unit_qty = p.Rslt_alloc_base_qty_p_PPanel.columnQty_qty;
		p.columnRslt_alloc_base_unit_qty.addAliasName("Rslt.alloc_base_unit_qty", p);
		p.Rslt_schd_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$schd_alloc_qty_p);
		p.Rslt_schd_alloc_qty_p_PPanel.setName("Rslt.schd_alloc_qty_p");
		p.columnRslt_schd_alloc_qty = p.Rslt_schd_alloc_qty_p_PPanel.columnQty_qty;
		p.columnRslt_schd_alloc_qty.addAliasName("Rslt.schd_alloc_qty", p);
		p.Rslt_schd_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$schd_wait_qty_p);
		p.Rslt_schd_wait_qty_p_PPanel.setName("Rslt.schd_wait_qty_p");
		p.columnRslt_schd_wait_qty = p.Rslt_schd_wait_qty_p_PPanel.columnQty_qty;
		p.columnRslt_schd_wait_qty.addAliasName("Rslt.schd_wait_qty", p);
		p.Rslt_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$inst_qty_p);
		p.Rslt_inst_qty_p_PPanel.setName("Rslt.inst_qty_p");
		p.columnRslt_ship_inst_qty = p.Rslt_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_ship_inst_qty.addAliasName("Rslt.ship_inst_qty", p);
		p.Rslt_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$act_qty_p);
		p.Rslt_act_qty_p_PPanel.setName("Rslt.act_qty_p");
		p.columnRslt_ship_act_qty = p.Rslt_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_ship_act_qty.addAliasName("Rslt.ship_act_qty", p);
		p.Rslt_iv_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$iv_schd_qty_p);
		p.Rslt_iv_schd_qty_p_PPanel.setName("Rslt.iv_schd_qty_p");
		p.columnRslt_iv_schd_qty = p.Rslt_iv_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_iv_schd_qty.addAliasName("Rslt.iv_schd_qty", p);
		p.Rslt_iv_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$iv_act_qty_p);
		p.Rslt_iv_act_qty_p_PPanel.setName("Rslt.iv_act_qty_p");
		p.columnRslt_iv_act_qty = p.Rslt_iv_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_iv_act_qty.addAliasName("Rslt.iv_act_qty", p);
		p.Rslt_act_cont_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$act_cont_p);
		p.Rslt_act_cont_p_PPanel.setName("Rslt.act_cont_p");
		p.columnRslt_act_cont_qty = p.Rslt_act_cont_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_act_cont_qty.addAliasName("Rslt.act_cont_qty", p);
		p.Rslt_act_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$act_fctr_p);
		p.Rslt_act_fctr_p_PPanel.setName("Rslt.act_fctr_p");
		p.columnRslt_act_cont_fctr = p.Rslt_act_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRslt_act_cont_fctr.addAliasName("Rslt.act_cont_fctr", p);
		p.Rslt_std_cont_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$std_cont_p);
		p.Rslt_std_cont_p_PPanel.setName("Rslt.std_cont_p");
		p.columnRslt_std_cont_qty = p.Rslt_std_cont_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_std_cont_qty.addAliasName("Rslt.std_cont_qty", p);
		p.Rslt_std_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$std_fctr_p);
		p.Rslt_std_fctr_p_PPanel.setName("Rslt.std_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_cont_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$cont_unit_p);
		p.Rslt_cont_unit_p_PPanel.setName("Rslt.cont_unit_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$str_ln_p);
		p.Rslt_str_ln_p_PPanel.setName("Rslt.str_ln_p");
		p.columnRslt_str_ln_cd = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_str_ln_cd.addAliasName("Rslt.str_ln_cd", p);
		p.columnRslt_str_ln_nm = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_str_ln_nm.addAliasName("Rslt.str_ln_nm", p);
		p.columnRslt_str_ln_cd_none_flg = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_str_ln_cd_none_flg.addAliasName("Rslt.str_ln_cd_none_flg", p);
		p.Rslt_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$lot_no_p);
		p.Rslt_lot_no_p_PPanel.setName("Rslt.lot_no_p");
		p.columnRslt_crt_lot_flg = p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnRslt_crt_lot_flg.addAliasName("Rslt.crt_lot_flg", p);
		p.columnRslt_lot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnRslt_lot_no.addAliasName("Rslt.lot_no", p);
		p.columnRslt_sublot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnRslt_sublot_no.addAliasName("Rslt.sublot_no", p);
		p.Rslt_ver_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$ver_p);
		p.Rslt_ver_p_PPanel.setName("Rslt.ver_p");
		p.columnRslt_ver_no = p.Rslt_ver_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$dlv_grp_p);
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
		p.Rslt_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$cst_grp_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$itm_grp_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP1420.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_ShipSchdReg p) {
		p.Btn_Btn_open_MSBEP0500_PPanel = mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.create();
		p.Btn_Btn_open_MSBEP0500_PPanel.setName("Btn.Btn_open_MSBEP0500");
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

	
	/** [Cnd_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_lg_grp_cd_p = null;

	/**
	 * [Cnd_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lg_grp_cd_ListPutter() {
		if (Cnd_lg_grp_cd_p == null) {
			Cnd_lg_grp_cd_p = createCnd_lg_grp_cd_ListPutter(Cnd_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Cnd_lg_grp_cd_p;
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
	
	
	/** [Cnd_alloc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_alloc_grp_cd_p = null;

	/**
	 * [Cnd_alloc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_alloc_grp_cd_ListPutter() {
		if (Cnd_alloc_grp_cd_p == null) {
			Cnd_alloc_grp_cd_p = createCnd_alloc_grp_cd_ListPutter(Cnd_alloc_grp_cd, "alloc_grp_cd", "alloc_grp_nm");

		}
		return Cnd_alloc_grp_cd_p;
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
	
	
	/** [Cnd_via_dlv_typ_ListPutter]の定義 */
	private MCListPutter Cnd_via_dlv_typ_p = null;

	/**
	 * [Cnd_via_dlv_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_via_dlv_typ_ListPutter() {
		if (Cnd_via_dlv_typ_p == null) {
			Cnd_via_dlv_typ_p = createCnd_via_dlv_typ_ListPutter(Cnd_via_dlv_typ, "via_dlv_typ", "via_dlv_typ_nm");

		}
		return Cnd_via_dlv_typ_p;
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
	
	
	/** [Cnd_ship_wk_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_wk_cd_p = null;

	/**
	 * [Cnd_ship_wk_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_wk_cd_ListPutter() {
		if (Cnd_ship_wk_cd_p == null) {
			Cnd_ship_wk_cd_p = createCnd_ship_wk_cd_ListPutter(Cnd_ship_wk_cd, "ship_wk_cd", "ship_wk_nm");

		}
		return Cnd_ship_wk_cd_p;
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
	
	
	/** [BulkSet_ship_wk_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_ship_wk_cd_p = null;

	/**
	 * [BulkSet_ship_wk_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_ship_wk_cd_ListPutter() {
		if (BulkSet_ship_wk_cd_p == null) {
			BulkSet_ship_wk_cd_p = createBulkSet_ship_wk_cd_ListPutter(BulkSet_ship_wk_cd, "ship_wk_cd", "ship_wk_nm");

		}
		return BulkSet_ship_wk_cd_p;
	}
	
	
	/** [Rslt_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ship_term_cd_p = null;

	/**
	 * [Rslt_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ship_term_cd_ListPutter() {
		if (Rslt_ship_term_cd_p == null) {
			Rslt_ship_term_cd_p = createRslt_ship_term_cd_ListPutter(columnRslt_ship_term_cd, "ship_term_cd", "ship_term_nm","ship_wk_grp_cd","ship_wk_grp_nm","ship_wk_cd","ship_wk_nm");

		}
		return Rslt_ship_term_cd_p;
	}
	
	
	/** [Rslt_ship_wk_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ship_wk_cd_p = null;

	/**
	 * [Rslt_ship_wk_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ship_wk_cd_ListPutter() {
		if (Rslt_ship_wk_cd_p == null) {
			Rslt_ship_wk_cd_p = createRslt_ship_wk_cd_ListPutter(columnRslt_ship_wk_cd, "ship_wk_cd", "ship_wk_nm");

		}
		return Rslt_ship_wk_cd_p;
	}
	
	
	/** [Rslt_alloc_ent_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt_alloc_ent_unit_cd_p = null;

	/**
	 * [Rslt_alloc_ent_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_alloc_ent_unit_cd_ListPutter() {
		if (Rslt_alloc_ent_unit_cd_p == null) {
			Rslt_alloc_ent_unit_cd_p = createRslt_alloc_ent_unit_cd_ListPutter(columnRslt_alloc_ent_unit_cd, "alloc_ent_unit_cd", "alloc_ent_unit_nm","alloc_ent_unit_conv_base_qty","alloc_ent_unit_conv_qty","alloc_ent_unit_dec_place","alloc_ent_unit_rnd_typ");

		}
		return Rslt_alloc_ent_unit_cd_p;
	}
	
	
	/** [Rslt_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_loc_cd_p = null;

	/**
	 * [Rslt_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_loc_cd_ListPutter() {
		if (Rslt_loc_cd_p == null) {
			Rslt_loc_cd_p = createRslt_loc_cd_ListPutter(columnRslt_loc_cd, "loc_cd", "loc_nm","str_ln_tgt_flg");

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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipSchdReg create(){
		MSBEP_ShipSchdReg p = new MSBEP_ShipSchdReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipSchdReg create(String name){
		MSBEP_ShipSchdReg p = new MSBEP_ShipSchdReg(name);
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
		MSBEP_ShipSchdReg_MC.jbfInitScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitSrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitPrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitTop((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitFold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitTab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitTab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitTab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitTab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitAllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitDlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitCstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitCtrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitRPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitBulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitRslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbfInitBtn((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitSrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitPrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitTop((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitFold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitTab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitTab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitTab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitTab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitAllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitDlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitCstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitCtrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitRPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitBulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitRslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.jbInitBtn((MSBEP_ShipSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PrSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrSts(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.PrStsPanel = p.beansFactory.createPanel("PrSts");
		p.PrStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_ShipSchdReg p) {
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
	protected static void jbfInitTab1(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [AllocSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAllocSts(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.AllocStsPanel = p.beansFactory.createPanel("AllocSts");
		p.AllocStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ShipBlk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipBlk(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.ShipBlkPanel = p.beansFactory.createPanel("ShipBlk");
		p.ShipBlkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ShipSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipSts(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.ShipStsPanel = p.beansFactory.createPanel("ShipSts");
		p.ShipStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstCnd(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.CstCndPanel = p.beansFactory.createPanel("CstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_md_Group = p.beansFactory.createButtonGroup("Cnd.md");
		p.Cnd_md_SHIP = p.beansFactory.createRadioButton("Cnd.md_SHIP");
		p.Cnd_md_ALLOC = p.beansFactory.createRadioButton("Cnd.md_ALLOC");
		p.Cnd_no_lot_chk_flg = p.beansFactory.createCheckBox("Cnd.no_lot_chk_flg");
		p.Cnd_not_inst_flg = p.beansFactory.createCheckBox("Cnd.not_inst_flg");
		p.Cnd_inst_flg = p.beansFactory.createCheckBox("Cnd.inst_flg");
		p.Cnd_not_ship_flg = p.beansFactory.createCheckBox("Cnd.not_ship_flg");
		p.Cnd_part_ship_flg = p.beansFactory.createCheckBox("Cnd.part_ship_flg");
		p.Cnd_ship_flg = p.beansFactory.createCheckBox("Cnd.ship_flg");
		p.Cnd_not_alloc_flg = p.beansFactory.createCheckBox("Cnd.not_alloc_flg");
		p.Cnd_part_alloc_flg = p.beansFactory.createCheckBox("Cnd.part_alloc_flg");
		p.Cnd_all_alloc_flg = p.beansFactory.createCheckBox("Cnd.all_alloc_flg");
		p.Cnd_alloc_invalid_flg = p.beansFactory.createCheckBox("Cnd.alloc_invalid_flg");
		p.Cnd_ship_block_flg = p.beansFactory.createCheckBox("Cnd.ship_block_flg");
		p.Cnd_not_ship_block_flg = p.beansFactory.createCheckBox("Cnd.not_ship_block_flg");
		p.Cnd_dlv_rqst_flg = p.beansFactory.createCheckBox("Cnd.dlv_rqst_flg");
		p.Cnd_ship_rqst_flg = p.beansFactory.createCheckBox("Cnd.ship_rqst_flg");
		p.Cnd_pd_inst_dlv_flg = p.beansFactory.createCheckBox("Cnd.pd_inst_dlv_flg");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextComboBox("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_alloc_grp_cd_Label = p.beansFactory.createLabel("Cnd.alloc_grp_cd_Label");
		p.Cnd_alloc_grp_cd = p.beansFactory.createTextComboBox("Cnd.alloc_grp_cd");
		p.Cnd_alloc_grp_cd.setLabel(p.Cnd_alloc_grp_cd_Label);
		p.Cnd_alloc_grp_nm = p.beansFactory.createTextField("Cnd.alloc_grp_nm");
		p.Cnd_ship_to_id_typ_Label = p.beansFactory.createLabel("Cnd.ship_to_id_typ_Label");
		p.Cnd_ship_to_id_typ = p.beansFactory.createTextComboBox("Cnd.ship_to_id_typ");
		p.Cnd_ship_to_id_typ.setLabel(p.Cnd_ship_to_id_typ_Label);
		p.Cnd_ship_to_id_typ_nm = p.beansFactory.createTextField("Cnd.ship_to_id_typ_nm");
		p.Cnd_ship_to_id_cd_Label = p.beansFactory.createLabel("Cnd.ship_to_id_cd_Label");
		p.Cnd_ship_to_id_cd = p.beansFactory.createTextField("Cnd.ship_to_id_cd");
		p.Cnd_ship_to_id_cd.setLabel(p.Cnd_ship_to_id_cd_Label);
		p.Cnd_ship_to_id_nm = p.beansFactory.createTextField("Cnd.ship_to_id_nm");
		p.Cnd_dlv_id_typ_Label = p.beansFactory.createLabel("Cnd.dlv_id_typ_Label");
		p.Cnd_dlv_id_typ = p.beansFactory.createTextComboBox("Cnd.dlv_id_typ");
		p.Cnd_dlv_id_typ.setLabel(p.Cnd_dlv_id_typ_Label);
		p.Cnd_dlv_id_typ_nm = p.beansFactory.createTextField("Cnd.dlv_id_typ_nm");
		p.Cnd_dlv_id_cd_Label = p.beansFactory.createLabel("Cnd.dlv_id_cd_Label");
		p.Cnd_dlv_id_cd = p.beansFactory.createTextField("Cnd.dlv_id_cd");
		p.Cnd_dlv_id_cd.setLabel(p.Cnd_dlv_id_cd_Label);
		p.Cnd_dlv_id_nm = p.beansFactory.createTextField("Cnd.dlv_id_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_via_dlv_typ_Label = p.beansFactory.createLabel("Cnd.via_dlv_typ_Label");
		p.Cnd_via_dlv_typ = p.beansFactory.createTextComboBox("Cnd.via_dlv_typ");
		p.Cnd_via_dlv_typ.setLabel(p.Cnd_via_dlv_typ_Label);
		p.Cnd_via_dlv_typ_nm = p.beansFactory.createTextField("Cnd.via_dlv_typ_nm");
		p.Cnd_ship_term_cd_Label = p.beansFactory.createLabel("Cnd.ship_term_cd_Label");
		p.Cnd_ship_term_cd = p.beansFactory.createTextComboBox("Cnd.ship_term_cd");
		p.Cnd_ship_term_cd.setLabel(p.Cnd_ship_term_cd_Label);
		p.Cnd_ship_term_nm = p.beansFactory.createTextField("Cnd.ship_term_nm");
		p.Cnd_ship_wk_cd_Label = p.beansFactory.createLabel("Cnd.ship_wk_cd_Label");
		p.Cnd_ship_wk_cd = p.beansFactory.createTextComboBox("Cnd.ship_wk_cd");
		p.Cnd_ship_wk_cd.setLabel(p.Cnd_ship_wk_cd_Label);
		p.Cnd_ship_wk_nm = p.beansFactory.createTextField("Cnd.ship_wk_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_rqst_usr_cd_Label = p.beansFactory.createLabel("Cnd.rqst_usr_cd_Label");
		p.Cnd_rqst_usr_cd = p.beansFactory.createTextField("Cnd.rqst_usr_cd");
		p.Cnd_rqst_usr_cd.setLabel(p.Cnd_rqst_usr_cd_Label);
		p.Cnd_rqst_usr_nm = p.beansFactory.createTextField("Cnd.rqst_usr_nm");
		p.Cnd_rqst_dpt_cd_Label = p.beansFactory.createLabel("Cnd.rqst_dpt_cd_Label");
		p.Cnd_rqst_dpt_cd = p.beansFactory.createTextField("Cnd.rqst_dpt_cd");
		p.Cnd_rqst_dpt_cd.setLabel(p.Cnd_rqst_dpt_cd_Label);
		p.Cnd_rqst_dpt_nm = p.beansFactory.createTextField("Cnd.rqst_dpt_nm");
		p.Cnd_ship_inst_typ_Label = p.beansFactory.createLabel("Cnd.ship_inst_typ_Label");
		p.Cnd_ship_inst_typ = p.beansFactory.createTextComboBox("Cnd.ship_inst_typ");
		p.Cnd_ship_inst_typ.setLabel(p.Cnd_ship_inst_typ_Label);
		p.Cnd_ship_inst_typ_nm = p.beansFactory.createTextField("Cnd.ship_inst_typ_nm");
		p.Cnd_ship_schd_no_Label = p.beansFactory.createLabel("Cnd.ship_schd_no_Label");
		p.Cnd_ship_schd_no = p.beansFactory.createTextField("Cnd.ship_schd_no");
		p.Cnd_ship_schd_no.setLabel(p.Cnd_ship_schd_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_slo_d_no_Label = p.beansFactory.createLabel("Cnd.slo_d_no_Label");
		p.Cnd_slo_d_no = p.beansFactory.createTextField("Cnd.slo_d_no");
		p.Cnd_slo_d_no.setLabel(p.Cnd_slo_d_no_Label);
		p.Cnd_xfr_schd_no_Label = p.beansFactory.createLabel("Cnd.xfr_schd_no_Label");
		p.Cnd_xfr_schd_no = p.beansFactory.createTextField("Cnd.xfr_schd_no");
		p.Cnd_xfr_schd_no.setLabel(p.Cnd_xfr_schd_no_Label);
		p.Cnd_ship_inst_no_Label = p.beansFactory.createLabel("Cnd.ship_inst_no_Label");
		p.Cnd_ship_inst_no = p.beansFactory.createTextField("Cnd.ship_inst_no");
		p.Cnd_ship_inst_no.setLabel(p.Cnd_ship_inst_no_Label);
		p.Cnd_ship_inst_d_no_Label = p.beansFactory.createLabel("Cnd.ship_inst_d_no_Label");
		p.Cnd_ship_inst_d_no = p.beansFactory.createTextField("Cnd.ship_inst_d_no");
		p.Cnd_ship_inst_d_no.setLabel(p.Cnd_ship_inst_d_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_abort_flg = p.beansFactory.createCheckBox("Cnd.abort_flg");
		p.Cnd_ship_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.ship_cnt_rmrks_Label");
		p.Cnd_ship_cnt_rmrks = p.beansFactory.createTextField("Cnd.ship_cnt_rmrks");
		p.Cnd_ship_cnt_rmrks.setLabel(p.Cnd_ship_cnt_rmrks_Label);
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_d_rmrks_Label");
		p.Cnd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.trd_d_rmrks");
		p.Cnd_trd_d_rmrks.setLabel(p.Cnd_trd_d_rmrks_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		p.BulkSetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.BulkSet_ship_wk_cd_Label = p.beansFactory.createLabel("BulkSet.ship_wk_cd_Label");
		p.BulkSet_ship_wk_cd = p.beansFactory.createTextComboBox("BulkSet.ship_wk_cd");
		p.BulkSet_ship_wk_cd.setLabel(p.BulkSet_ship_wk_cd_Label);
		p.BulkSet_ship_wk_nm = p.beansFactory.createTextField("BulkSet.ship_wk_nm");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_pr_sts_typ = p.beansFactory.createTableColumn("Rslt.pr_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pr_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_sts_typ = p.beansFactory.createTableColumn("Rslt.alloc_sts_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.alloc_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_block_flg = p.beansFactory.createTableColumn("Rslt.ship_block_flg", MCColumnType.CHECK);
		p.columnRslt_ship_abl_flg = p.beansFactory.createTableColumn("Rslt.ship_abl_flg", MCColumnType.CHECK);
		p.columnRslt_fix_flg = p.beansFactory.createTableColumn("Rslt.fix_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_day_week_typ = p.beansFactory.createTableColumn("Rslt.dlv_day_week_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_day_week_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_day_week_typ_nm", MCColumnType.TEXT);
		p.columnRslt_no_calc_flg = p.beansFactory.createTableColumn("Rslt.no_calc_flg", MCColumnType.CHECK);
		p.columnRslt_ship_schd_time = p.beansFactory.createTableColumn("Rslt.ship_schd_time", MCColumnType.TEXT);
		p.columnRslt_cl_time_chk_flg = p.beansFactory.createTableColumn("Rslt.cl_time_chk_flg", MCColumnType.CHECK);
		p.columnRslt_ship_dt_chk_flg = p.beansFactory.createTableColumn("Rslt.ship_dt_chk_flg", MCColumnType.CHECK);
		p.columnRslt_ship_term_cd = p.beansFactory.createTableColumn("Rslt.ship_term_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_ship_term_nm = p.beansFactory.createTableColumn("Rslt.ship_term_nm", MCColumnType.TEXT);
		p.columnRslt_ship_wk_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_wk_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_wk_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_wk_grp_nm", MCColumnType.TEXT);
		p.columnRslt_ship_wk_cd = p.beansFactory.createTableColumn("Rslt.ship_wk_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_ship_wk_nm = p.beansFactory.createTableColumn("Rslt.ship_wk_nm", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_ship_to_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_to_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_to_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_to_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_typ = p.beansFactory.createTableColumn("Rslt.ship_to_id_typ", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_typ_nm = p.beansFactory.createTableColumn("Rslt.ship_to_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_cd = p.beansFactory.createTableColumn("Rslt.ship_to_id_cd", MCColumnType.TEXT);
		p.columnRslt_ship_to_id_nm = p.beansFactory.createTableColumn("Rslt.ship_to_id_nm", MCColumnType.TEXT);
		p.columnRslt_ship_to_sundry_flg = p.beansFactory.createTableColumn("Rslt.ship_to_sundry_flg", MCColumnType.CHECK);
		p.columnRslt_via_dlv_typ = p.beansFactory.createTableColumn("Rslt.via_dlv_typ", MCColumnType.TEXT);
		p.columnRslt_via_dlv_typ_nm = p.beansFactory.createTableColumn("Rslt.via_dlv_typ_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ = p.beansFactory.createTableColumn("Rslt.dlv_id_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_cd = p.beansFactory.createTableColumn("Rslt.dlv_id_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_id_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_nm", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_usr_cd = p.beansFactory.createTableColumn("Rslt.rqst_usr_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_usr_nm = p.beansFactory.createTableColumn("Rslt.rqst_usr_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_dpt_cd = p.beansFactory.createTableColumn("Rslt.rqst_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_dpt_nm = p.beansFactory.createTableColumn("Rslt.rqst_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_stk_mng_typ = p.beansFactory.createTableColumn("Rslt.stk_mng_typ", MCColumnType.TEXT);
		p.columnRslt_dscnt_itm_flg = p.beansFactory.createTableColumn("Rslt.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_alloc_ent_unit_cd = p.beansFactory.createTableColumn("Rslt.alloc_ent_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_alloc_ent_unit_nm = p.beansFactory.createTableColumn("Rslt.alloc_ent_unit_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_ent_unit_dec_place = p.beansFactory.createTableColumn("Rslt.alloc_ent_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_alloc_ent_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.alloc_ent_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_alloc_ent_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.alloc_ent_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_alloc_ent_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.alloc_ent_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_abort_flg = p.beansFactory.createTableColumn("Rslt.abort_flg", MCColumnType.CHECK);
		p.columnRslt_div_flg = p.beansFactory.createTableColumn("Rslt.div_flg", MCColumnType.CHECK);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.base_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.base_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_wt = p.beansFactory.createTableColumn("Rslt.wt", MCColumnType.NUMBER);
		p.columnRslt_dim = p.beansFactory.createTableColumn("Rslt.dim", MCColumnType.NUMBER);
		p.columnRslt_alloc_flg = p.beansFactory.createTableColumn("Rslt.alloc_flg", MCColumnType.CHECK);
		p.columnRslt_grp_alloc_flg = p.beansFactory.createTableColumn("Rslt.grp_alloc_flg", MCColumnType.CHECK);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_lot_none_flg = p.beansFactory.createTableColumn("Rslt.lot_none_flg", MCColumnType.CHECK);
		p.columnRslt_lot_mng_typ = p.beansFactory.createTableColumn("Rslt.lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_lot_no_typ = p.beansFactory.createTableColumn("Rslt.lot_no_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_no_typ = p.beansFactory.createTableColumn("Rslt.sublot_no_typ", MCColumnType.TEXT);
		p.columnRslt_ver_flg = p.beansFactory.createTableColumn("Rslt.ver_flg", MCColumnType.CHECK);
		p.columnRslt_not_lot_mix_flg = p.beansFactory.createTableColumn("Rslt.not_lot_mix_flg", MCColumnType.CHECK);
		p.columnRslt_not_sublot_mix_flg = p.beansFactory.createTableColumn("Rslt.not_sublot_mix_flg", MCColumnType.CHECK);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_grp_cd = p.beansFactory.createTableColumn("Rslt.alloc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alloc_grp_nm = p.beansFactory.createTableColumn("Rslt.alloc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_def_loc_cd = p.beansFactory.createTableColumn("Rslt.def_loc_cd", MCColumnType.TEXT);
		p.columnRslt_def_loc_nm = p.beansFactory.createTableColumn("Rslt.def_loc_nm", MCColumnType.TEXT);
		p.columnRslt_ship_loc_prio_flg = p.beansFactory.createTableColumn("Rslt.ship_loc_prio_flg", MCColumnType.CHECK);
		p.columnRslt_assort_typ = p.beansFactory.createTableColumn("Rslt.assort_typ", MCColumnType.TEXT);
		p.columnRslt_assort_typ_nm = p.beansFactory.createTableColumn("Rslt.assort_typ_nm", MCColumnType.TEXT);
		p.columnRslt_set_itm_grp_no = p.beansFactory.createTableColumn("Rslt.set_itm_grp_no", MCColumnType.NUMBER);
		p.columnRslt_assort_sts_mark = p.beansFactory.createTableColumn("Rslt.assort_sts_mark", MCColumnType.TEXT);
		p.columnRslt_alloc_typ = p.beansFactory.createTableColumn("Rslt.alloc_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_typ_nm = p.beansFactory.createTableColumn("Rslt.alloc_typ_nm", MCColumnType.TEXT);
		p.columnRslt_base_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.base_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_base_prov_act_no = p.beansFactory.createTableColumn("Rslt.base_prov_act_no", MCColumnType.TEXT);
		p.columnRslt_base_ac_dt = p.beansFactory.createTableColumn("Rslt.base_ac_dt", MCColumnType.DATE);
		p.columnRslt_ship_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.ship_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_xfr_schd_no = p.beansFactory.createTableColumn("Rslt.xfr_schd_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_iv_trd_flg = p.beansFactory.createTableColumn("Rslt.iv_trd_flg", MCColumnType.CHECK);
		p.columnRslt_iv_reg_flg = p.beansFactory.createTableColumn("Rslt.iv_reg_flg", MCColumnType.CHECK);
		p.columnRslt_iv_ship_flg = p.beansFactory.createTableColumn("Rslt.iv_ship_flg", MCColumnType.CHECK);
		p.columnRslt_ship_schd_no = p.beansFactory.createTableColumn("Rslt.ship_schd_no", MCColumnType.TEXT);
		p.columnRslt_ship_alloc_sts_no = p.beansFactory.createTableColumn("Rslt.ship_alloc_sts_no", MCColumnType.TEXT);
		p.columnRslt_org_ship_alloc_sts_no = p.beansFactory.createTableColumn("Rslt.org_ship_alloc_sts_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_no = p.beansFactory.createTableColumn("Rslt.ship_inst_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_d_no = p.beansFactory.createTableColumn("Rslt.ship_inst_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_typ = p.beansFactory.createTableColumn("Rslt.ship_inst_typ", MCColumnType.TEXT);
		p.columnRslt_ship_pr_no = p.beansFactory.createTableColumn("Rslt.ship_pr_no", MCColumnType.TEXT);
		p.columnRslt_alloc_scope_typ = p.beansFactory.createTableColumn("Rslt.alloc_scope_typ", MCColumnType.TEXT);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_ship_pr_upd_cntr = p.beansFactory.createTableColumn("Rslt.ship_pr_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRslt_lot_peg_no = p.beansFactory.createTableColumn("Rslt.lot_peg_no", MCColumnType.NUMBER);
		p.columnRslt_no_alloc_flg = p.beansFactory.createTableColumn("Rslt.no_alloc_flg", MCColumnType.CHECK);
		p.columnRslt_org_fix_flg = p.beansFactory.createTableColumn("Rslt.org_fix_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1400 = p.beansFactory.createButton("Btn.open_MSBEP1400", "open");
		p.Btn_open_MSBEP1440 = p.beansFactory.createButton("Btn.open_MSBEP1440", "open");
		p.Btn_open_MSBEP1430 = p.beansFactory.createButton("Btn.open_MSBEP1430", "open");
		p.Btn_srch02 = p.beansFactory.createButton("Btn.srch02", "calc");
		p.Btn_sprt_ac_dt = p.beansFactory.createButton("Btn.sprt_ac_dt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_ShipSchdReg p) {
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
	protected static void jbInitSrchMode(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.SrchModePanel.setBorder(p.SrchModeTitledBorder);
		p.add(p.SrchModePanel);
		p.SrchModePanel.setNextBeans(p.PrStsPanel);
		p.SrchModePanel.setValueCheck(false);
		p.SrchModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchModePanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [PrSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrSts(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.PrStsPanel.setBorder(p.PrStsTitledBorder);
		p.add(p.PrStsPanel);
		p.PrStsPanel.setNextBeans(p.TopPanel);
		p.PrStsPanel.setValueCheck(false);
		p.PrStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PrStsPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_ShipSchdReg p) {
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
	protected static void jbInitFold(MSBEP_ShipSchdReg p) {
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
	protected static void jbInitTab1(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.AllocStsPanel, null);
		p.Tab1Panel.setLastBeans(p.AllocStsPanel);
		p.AllocStsPanel.setNextBeans(p.ShipBlkPanel);
		p.Tab1Panel.add(p.ShipBlkPanel, null);
		p.ShipBlkPanel.setNextBeans(p.ShipStsPanel);
		p.Tab1Panel.add(p.ShipStsPanel, null);
		p.ShipStsPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_ShipSchdReg p) {
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
	protected static void jbInitTab3(MSBEP_ShipSchdReg p) {
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
	protected static void jbInitTab4(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.ItmCndPanel, null);
		p.Tab4Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [AllocSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAllocSts(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.AllocStsPanel.setBorder(p.AllocStsTitledBorder);
		p.AllocStsPanel.setValueCheck(false);
		p.AllocStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AllocStsPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [ShipBlk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipBlk(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.ShipBlkPanel.setBorder(p.ShipBlkTitledBorder);
		p.ShipBlkPanel.setValueCheck(false);
		p.ShipBlkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ShipBlkPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [ShipSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipSts(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.ShipStsPanel.setBorder(p.ShipStsTitledBorder);
		p.ShipStsPanel.setValueCheck(false);
		p.ShipStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ShipStsPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstCnd(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.CstCndPanel.setValueCheck(false);
		p.CstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_ShipSchdReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ope_META);
		p.SrchModePanel.setLastBeans(p.Cnd_md_Group);
		p.Cnd_md_Group.setFirstBeans(p.Cnd_md_SHIP);
		p.Cnd_md_SHIP.setActionCommand("0");
		p.Cnd_md_Group.add(p.Cnd_md_SHIP);
		p.SrchModePanel.add(p.Cnd_md_SHIP);
		p.Cnd_md_SHIP.setNextBeans(p.Cnd_md_ALLOC);
		p.Cnd_md_ALLOC.setActionCommand("1");
		p.Cnd_md_Group.add(p.Cnd_md_ALLOC);
		p.SrchModePanel.add(p.Cnd_md_ALLOC);
		p.Cnd_md_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.md_META);
		p.BtnPanel.add(p.Cnd_no_lot_chk_flg);
		p.Cnd_no_lot_chk_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.no_lot_chk_flg_META);
		p.PrStsPanel.add(p.Cnd_not_inst_flg);
		p.PrStsPanel.setLastBeans(p.Cnd_not_inst_flg);
		p.Cnd_not_inst_flg.setNextBeans(p.Cnd_inst_flg);
		p.Cnd_not_inst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.not_inst_flg_META);
		p.PrStsPanel.add(p.Cnd_inst_flg);
		p.Cnd_inst_flg.setNextBeans(p.Cnd_not_ship_flg);
		p.Cnd_inst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.inst_flg_META);
		p.PrStsPanel.add(p.Cnd_not_ship_flg);
		p.Cnd_not_ship_flg.setNextBeans(p.Cnd_part_ship_flg);
		p.Cnd_not_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.not_ship_flg_META);
		p.PrStsPanel.add(p.Cnd_part_ship_flg);
		p.Cnd_part_ship_flg.setNextBeans(p.Cnd_ship_flg);
		p.Cnd_part_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.part_ship_flg_META);
		p.PrStsPanel.add(p.Cnd_ship_flg);
		p.Cnd_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_flg_META);
		p.AllocStsPanel.add(p.Cnd_not_alloc_flg);
		p.AllocStsPanel.setLastBeans(p.Cnd_not_alloc_flg);
		p.Cnd_not_alloc_flg.setNextBeans(p.Cnd_part_alloc_flg);
		p.Cnd_not_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.not_alloc_flg_META);
		p.AllocStsPanel.add(p.Cnd_part_alloc_flg);
		p.Cnd_part_alloc_flg.setNextBeans(p.Cnd_all_alloc_flg);
		p.Cnd_part_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.part_alloc_flg_META);
		p.AllocStsPanel.add(p.Cnd_all_alloc_flg);
		p.Cnd_all_alloc_flg.setNextBeans(p.Cnd_alloc_invalid_flg);
		p.Cnd_all_alloc_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.all_alloc_flg_META);
		p.AllocStsPanel.add(p.Cnd_alloc_invalid_flg);
		p.Cnd_alloc_invalid_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.alloc_invalid_flg_META);
		p.ShipBlkPanel.add(p.Cnd_ship_block_flg);
		p.ShipBlkPanel.setLastBeans(p.Cnd_ship_block_flg);
		p.Cnd_ship_block_flg.setNextBeans(p.Cnd_not_ship_block_flg);
		p.Cnd_ship_block_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_block_flg_META);
		p.ShipBlkPanel.add(p.Cnd_not_ship_block_flg);
		p.Cnd_not_ship_block_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.not_ship_block_flg_META);
		p.ShipStsPanel.add(p.Cnd_dlv_rqst_flg);
		p.ShipStsPanel.setLastBeans(p.Cnd_dlv_rqst_flg);
		p.Cnd_dlv_rqst_flg.setNextBeans(p.Cnd_ship_rqst_flg);
		p.Cnd_dlv_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.dlv_rqst_flg_META);
		p.ShipStsPanel.add(p.Cnd_ship_rqst_flg);
		p.Cnd_ship_rqst_flg.setNextBeans(p.Cnd_pd_inst_dlv_flg);
		p.Cnd_ship_rqst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_rqst_flg_META);
		p.ShipStsPanel.add(p.Cnd_pd_inst_dlv_flg);
		p.Cnd_pd_inst_dlv_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.pd_inst_dlv_flg_META);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.lg_grp_nm_META);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ssdt_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_ssdt_p_PPanel);
		p.Cnd_ssdt_p_PPanel.setNextBeans(p.Cnd_dsdt_p_PPanel);
		p.CndPanel.add(p.Cnd_dsdt_p_PPanel);
		p.Cnd_dsdt_p_PPanel.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.Cnd_loc_cd.setLinkBeans(p.Cnd_loc_nm);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.loc_cd_META);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_alloc_grp_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.Cnd_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_alloc_grp_cd, true);
		p.Cnd_alloc_grp_cd.setLinkBeans(p.Cnd_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_alloc_grp_cd);
		p.Cnd_alloc_grp_cd.setNextBeans(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_alloc_grp_nm);
		p.Cnd_alloc_grp_nm.setNextBeans(p.Cnd_ship_to_id_typ);
		p.Cnd_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_alloc_grp_nm, true);
		p.Cnd_ship_to_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_to_id_typ, true);
		p.Cnd_ship_to_id_typ.setLinkBeans(p.Cnd_ship_to_id_typ_nm);
		p.CndPanel.add(p.Cnd_ship_to_id_typ_Label);
		p.CndPanel.add(p.Cnd_ship_to_id_typ);
		p.Cnd_ship_to_id_typ.setNextBeans(p.Cnd_ship_to_id_typ_nm);
		p.Cnd_ship_to_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_to_id_typ_META);
		p.CndPanel.add(p.Cnd_ship_to_id_typ_nm);
		p.Cnd_ship_to_id_typ_nm.setNextBeans(p.Cnd_ship_to_id_cd);
		p.Cnd_ship_to_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_to_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_ship_to_id_cd_Label);
		p.CndPanel.add(p.Cnd_ship_to_id_cd);
		p.Cnd_ship_to_id_cd.setNextBeans(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_to_id_cd_META);
		p.Cnd_ship_to_id_cd.addLinkBeans(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_to_id_cd, true);
		p.CndPanel.add(p.Cnd_ship_to_id_nm);
		p.Cnd_ship_to_id_nm.setNextBeans(p.Cnd_dlv_id_typ);
		p.Cnd_ship_to_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_to_id_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_to_id_nm, true);
		p.Cnd_dlv_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_typ, true);
		p.Cnd_dlv_id_typ.setLinkBeans(p.Cnd_dlv_id_typ_nm);
		p.CndPanel.add(p.Cnd_dlv_id_typ_Label);
		p.CndPanel.add(p.Cnd_dlv_id_typ);
		p.Cnd_dlv_id_typ.setNextBeans(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.dlv_id_typ_META);
		p.CndPanel.add(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ_nm.setNextBeans(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.dlv_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_dlv_id_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_cd.setNextBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.dlv_id_cd_META);
		p.Cnd_dlv_id_cd.addLinkBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_cd, true);
		p.CndPanel.add(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_dlv_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.dlv_id_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_via_dlv_typ);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.Cnd_via_dlv_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_via_dlv_typ, true);
		p.Cnd_via_dlv_typ.setLinkBeans(p.Cnd_via_dlv_typ_nm);
		p.CndPanel.add(p.Cnd_via_dlv_typ_Label);
		p.CndPanel.add(p.Cnd_via_dlv_typ);
		p.Cnd_via_dlv_typ.setNextBeans(p.Cnd_via_dlv_typ_nm);
		p.Cnd_via_dlv_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.via_dlv_typ_META);
		p.CndPanel.add(p.Cnd_via_dlv_typ_nm);
		p.Cnd_via_dlv_typ_nm.setNextBeans(p.Cnd_ship_term_cd);
		p.Cnd_via_dlv_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.via_dlv_typ_nm_META);
		p.Cnd_ship_term_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_term_cd, true);
		p.Cnd_ship_term_cd.setLinkBeans(p.Cnd_ship_term_nm);
		p.CndPanel.add(p.Cnd_ship_term_cd_Label);
		p.CndPanel.add(p.Cnd_ship_term_cd);
		p.Cnd_ship_term_cd.setNextBeans(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_term_cd_META);
		p.CndPanel.add(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_nm.setNextBeans(p.Cnd_ship_wk_cd);
		p.Cnd_ship_term_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_term_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_term_nm, true);
		p.Cnd_ship_wk_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_wk_cd, true);
		p.Cnd_ship_wk_cd.setLinkBeans(p.Cnd_ship_wk_nm);
		p.CndPanel.add(p.Cnd_ship_wk_cd_Label);
		p.CndPanel.add(p.Cnd_ship_wk_cd);
		p.Cnd_ship_wk_cd.setNextBeans(p.Cnd_ship_wk_nm);
		p.Cnd_ship_wk_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_wk_cd_META);
		p.CndPanel.add(p.Cnd_ship_wk_nm);
		p.Cnd_ship_wk_nm.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_ship_wk_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_wk_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_wk_nm, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.cst_itm_nm_META);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_rqst_usr_cd);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_rqst_usr_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_usr_cd);
		p.Cnd_rqst_usr_cd.setNextBeans(p.Cnd_rqst_usr_nm);
		p.Cnd_rqst_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.rqst_usr_cd_META);
		p.Cnd_rqst_usr_cd.addLinkBeans(p.Cnd_rqst_usr_nm);
		p.Cnd_rqst_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_usr_cd, true);
		p.CndPanel.add(p.Cnd_rqst_usr_nm);
		p.Cnd_rqst_usr_nm.setNextBeans(p.Cnd_rqst_dpt_cd);
		p.Cnd_rqst_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.rqst_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_usr_nm, true);
		p.CndPanel.add(p.Cnd_rqst_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_dpt_cd);
		p.Cnd_rqst_dpt_cd.setNextBeans(p.Cnd_rqst_dpt_nm);
		p.Cnd_rqst_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.rqst_dpt_cd_META);
		p.Cnd_rqst_dpt_cd.addLinkBeans(p.Cnd_rqst_dpt_nm);
		p.Cnd_rqst_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_dpt_cd, true);
		p.CndPanel.add(p.Cnd_rqst_dpt_nm);
		p.Cnd_rqst_dpt_nm.setNextBeans(p.Cnd_ship_inst_typ);
		p.Cnd_rqst_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.rqst_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_dpt_nm, true);
		p.Cnd_ship_inst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_inst_typ, true);
		p.Cnd_ship_inst_typ.setLinkBeans(p.Cnd_ship_inst_typ_nm);
		p.CndPanel.add(p.Cnd_ship_inst_typ_Label);
		p.CndPanel.add(p.Cnd_ship_inst_typ);
		p.Cnd_ship_inst_typ.setNextBeans(p.Cnd_ship_inst_typ_nm);
		p.Cnd_ship_inst_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_inst_typ_META);
		p.CndPanel.add(p.Cnd_ship_inst_typ_nm);
		p.Cnd_ship_inst_typ_nm.setNextBeans(p.Cnd_ship_schd_no);
		p.Cnd_ship_inst_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_inst_typ_nm_META);
		p.CndPanel.add(p.Cnd_ship_schd_no_Label);
		p.CndPanel.add(p.Cnd_ship_schd_no);
		p.Cnd_ship_schd_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_ship_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_schd_no_META);
		p.setPluralValueEnable(p.Cnd_ship_schd_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setNextBeans(p.Cnd_xfr_schd_no);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_slo_d_no, true);
		p.CndPanel.add(p.Cnd_xfr_schd_no_Label);
		p.CndPanel.add(p.Cnd_xfr_schd_no);
		p.Cnd_xfr_schd_no.setNextBeans(p.Cnd_ship_inst_no);
		p.Cnd_xfr_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.xfr_schd_no_META);
		p.setPluralValueEnable(p.Cnd_xfr_schd_no, true);
		p.CndPanel.add(p.Cnd_ship_inst_no_Label);
		p.CndPanel.add(p.Cnd_ship_inst_no);
		p.Cnd_ship_inst_no.setNextBeans(p.Cnd_ship_inst_d_no);
		p.Cnd_ship_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_inst_no_META);
		p.setPluralValueEnable(p.Cnd_ship_inst_no, true);
		p.CndPanel.add(p.Cnd_ship_inst_d_no_Label);
		p.CndPanel.add(p.Cnd_ship_inst_d_no);
		p.Cnd_ship_inst_d_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_ship_inst_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_inst_d_no_META);
		p.setPluralValueEnable(p.Cnd_ship_inst_d_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_abort_flg);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_abort_flg);
		p.Cnd_abort_flg.setNextBeans(p.Cnd_ship_cnt_rmrks);
		p.Cnd_abort_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.abort_flg_META);
		p.CndPanel.add(p.Cnd_ship_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_ship_cnt_rmrks);
		p.Cnd_ship_cnt_rmrks.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_ship_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.ship_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_ship_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1420.CndR.trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_d_rmrks, true);
		p.DlvCndPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvCndPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.CstCndPanel.add(p.Cnd_cst_grp_p_PPanel);
		p.CstCndPanel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_ShipSchdReg p) {
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
	protected static void jbInitRPnl(MSBEP_ShipSchdReg p) {
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
	protected static void jbInitBulkSet(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel.setBorder(p.BulkSetTitledBorder);
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_ship_schd_p_PPanel);
		p.BulkSetPanel.setLastBeans(p.BulkSet_ship_schd_p_PPanel);
		p.BulkSet_ship_schd_p_PPanel.setNextBeans(p.BulkSet_dlv_schd_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_dlv_schd_p_PPanel);
		p.BulkSet_dlv_schd_p_PPanel.setNextBeans(p.BulkSet_ship_wk_cd);
		p.BulkSet_ship_wk_cd.setListType(MCListType.STRICT);
		p.BulkSet_ship_wk_cd.setLinkBeans(p.BulkSet_ship_wk_nm);
		p.BulkSetPanel.add(p.BulkSet_ship_wk_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_ship_wk_cd);
		p.BulkSet_ship_wk_cd.setNextBeans(p.BulkSet_ship_wk_nm);
		p.BulkSet_ship_wk_cd.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1420.BulkSetR.ship_wk_cd_META);
		p.BulkSetPanel.add(p.BulkSet_ship_wk_nm);
		p.BulkSet_ship_wk_nm.setRow(p.getBulkSetR(), mcframe.clientMSBE.MSBEP1420.BulkSetR.ship_wk_nm_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_ShipSchdReg p) {
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
	protected static void jbInitBtn(MSBEP_ShipSchdReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1400.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP1400);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP1400);
		p.Btn_open_MSBEP1400.setNextBeans(p.Btn_open_MSBEP1440);
		p.Btn_open_MSBEP1440.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP1440);
		p.Btn_open_MSBEP1440.setNextBeans(p.Btn_open_MSBEP1430);
		p.Btn_open_MSBEP1430.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MSBEP1430);
		p.Btn_open_MSBEP1430.setNextBeans(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.BtnPanel.add(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.Btn_Btn_open_MSBEP0500_PPanel.setNextBeans(p.Btn_srch02);
		p.Btn_srch02.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_srch02);
		p.Btn_srch02.setNextBeans(p.Btn_sprt_ac_dt);
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
		p.Btn_deselect_all.setNextBeans(p.Btn_rdel);
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
		p.Btn_upd.setNextBeans(p.Cnd_no_lot_chk_flg);
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
		MSBEP_ShipSchdReg_MC.mcInitScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitSrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitPrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitTop((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitFold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitTab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitTab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitTab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitTab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitAllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitDlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitCstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitCtrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitRPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitBulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitRslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.mcInitBtn((MSBEP_ShipSchdReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_ScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_SrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_PrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Top((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Fold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Tab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Tab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Tab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Tab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_AllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_ShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_ShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_DlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_CstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_ItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Cnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Ctrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_RPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_BulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Rslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__UPD_Btn((MSBEP_ShipSchdReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_ScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_SrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_PrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Top((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Fold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Tab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Tab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Tab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Tab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_AllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_ShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_ShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_DlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_CstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_ItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Cnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Ctrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_RPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_BulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Rslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitSRCH__REF_Btn((MSBEP_ShipSchdReg)this);

		// [UPD_SHIP]ステータスのモードの設定
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_ScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_SrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_PrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Top((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Fold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Tab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Tab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Tab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Tab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_AllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_ShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_ShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_DlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_CstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_ItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Cnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Ctrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_RPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_BulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Rslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__SHIP_Btn((MSBEP_ShipSchdReg)this);

		// [UPD_ALLOC]ステータスのモードの設定
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_ScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_SrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_PrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Top((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Fold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Tab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Tab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Tab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Tab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_AllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_ShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_ShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_DlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_CstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_ItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Cnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Ctrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_RPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_BulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Rslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitUPD__ALLOC_Btn((MSBEP_ShipSchdReg)this);

		// [REF_SHIP]ステータスのモードの設定
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_ScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_SrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_PrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Top((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Fold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Tab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Tab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Tab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Tab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_AllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_ShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_ShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_DlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_CstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_ItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Cnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Ctrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_RPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_BulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Rslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__SHIP_Btn((MSBEP_ShipSchdReg)this);

		// [REF_ALLOC]ステータスのモードの設定
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_ScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_SrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_PrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Top((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Fold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Tab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Tab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Tab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Tab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_AllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_ShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_ShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_DlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_CstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_ItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Cnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Ctrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_RPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_BulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Rslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitREF__ALLOC_Btn((MSBEP_ShipSchdReg)this);

		// [FIX_SHIP]ステータスのモードの設定
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_ScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_SrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_PrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Top((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Fold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Tab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Tab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Tab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Tab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_AllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_ShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_ShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_DlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_CstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_ItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Cnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Ctrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_RPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_BulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Rslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__SHIP_Btn((MSBEP_ShipSchdReg)this);

		// [FIX_ALLOC]ステータスのモードの設定
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_ScreenOpe((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_SrchMode((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_PrSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Top((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Fold((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Tab1((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Tab2((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Tab3((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Tab4((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_AllocSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_ShipBlk((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_ShipSts((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_DlvCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_CstCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_ItmCnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Cnd((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Ctrl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_RPnl((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_BulkSet((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Rslt((MSBEP_ShipSchdReg)this);
		MSBEP_ShipSchdReg_MC.statusInitFIX__ALLOC_Btn((MSBEP_ShipSchdReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [PrSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrSts(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_ShipSchdReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [AllocSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAllocSts(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [ShipBlk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipBlk(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [ShipSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipSts(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [CstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstCnd(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBEP_ShipSchdReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_ShipSchdReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_md_Group.addAllListener(p);
		p.Cnd_md_SHIP.addAllListener(p);
		p.Cnd_md_ALLOC.addAllListener(p);
		p.Cnd_no_lot_chk_flg.addAllListener(p);
		p.Cnd_not_inst_flg.addAllListener(p);
		p.Cnd_inst_flg.addAllListener(p);
		p.Cnd_not_ship_flg.addAllListener(p);
		p.Cnd_part_ship_flg.addAllListener(p);
		p.Cnd_ship_flg.addAllListener(p);
		p.Cnd_not_alloc_flg.addAllListener(p);
		p.Cnd_part_alloc_flg.addAllListener(p);
		p.Cnd_all_alloc_flg.addAllListener(p);
		p.Cnd_alloc_invalid_flg.addAllListener(p);
		p.Cnd_ship_block_flg.addAllListener(p);
		p.Cnd_not_ship_block_flg.addAllListener(p);
		p.Cnd_dlv_rqst_flg.addAllListener(p);
		p.Cnd_ship_rqst_flg.addAllListener(p);
		p.Cnd_pd_inst_dlv_flg.addAllListener(p);
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_alloc_grp_cd.setListListener(p);
		p.Cnd_alloc_grp_cd.addAllListener(p);
		p.Cnd_alloc_grp_nm.setListListener(p);
		p.Cnd_alloc_grp_nm.addAllListener(p);
		p.Cnd_ship_to_id_typ.setListListener(p);
		p.Cnd_ship_to_id_typ.addAllListener(p);
		p.Cnd_ship_to_id_typ_nm.setListListener(p);
		p.Cnd_ship_to_id_typ_nm.addAllListener(p);
		p.Cnd_ship_to_id_cd.setListListener(p);
		p.Cnd_ship_to_id_cd.addAllListener(p);
		p.Cnd_ship_to_id_nm.setListListener(p);
		p.Cnd_ship_to_id_nm.addAllListener(p);
		p.Cnd_dlv_id_typ.setListListener(p);
		p.Cnd_dlv_id_typ.addAllListener(p);
		p.Cnd_dlv_id_typ_nm.setListListener(p);
		p.Cnd_dlv_id_typ_nm.addAllListener(p);
		p.Cnd_dlv_id_cd.setListListener(p);
		p.Cnd_dlv_id_cd.addAllListener(p);
		p.Cnd_dlv_id_nm.setListListener(p);
		p.Cnd_dlv_id_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_via_dlv_typ.setListListener(p);
		p.Cnd_via_dlv_typ.addAllListener(p);
		p.Cnd_via_dlv_typ_nm.setListListener(p);
		p.Cnd_via_dlv_typ_nm.addAllListener(p);
		p.Cnd_ship_term_cd.setListListener(p);
		p.Cnd_ship_term_cd.addAllListener(p);
		p.Cnd_ship_term_nm.setListListener(p);
		p.Cnd_ship_term_nm.addAllListener(p);
		p.Cnd_ship_wk_cd.setListListener(p);
		p.Cnd_ship_wk_cd.addAllListener(p);
		p.Cnd_ship_wk_nm.setListListener(p);
		p.Cnd_ship_wk_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_rqst_usr_cd.setListListener(p);
		p.Cnd_rqst_usr_cd.addAllListener(p);
		p.Cnd_rqst_usr_nm.setListListener(p);
		p.Cnd_rqst_usr_nm.addAllListener(p);
		p.Cnd_rqst_dpt_cd.setListListener(p);
		p.Cnd_rqst_dpt_cd.addAllListener(p);
		p.Cnd_rqst_dpt_nm.setListListener(p);
		p.Cnd_rqst_dpt_nm.addAllListener(p);
		p.Cnd_ship_inst_typ.setListListener(p);
		p.Cnd_ship_inst_typ.addAllListener(p);
		p.Cnd_ship_inst_typ_nm.setListListener(p);
		p.Cnd_ship_inst_typ_nm.addAllListener(p);
		p.Cnd_ship_schd_no.setListListener(p);
		p.Cnd_ship_schd_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_slo_d_no.setListListener(p);
		p.Cnd_slo_d_no.addAllListener(p);
		p.Cnd_xfr_schd_no.setListListener(p);
		p.Cnd_xfr_schd_no.addAllListener(p);
		p.Cnd_ship_inst_no.setListListener(p);
		p.Cnd_ship_inst_no.addAllListener(p);
		p.Cnd_ship_inst_d_no.setListListener(p);
		p.Cnd_ship_inst_d_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_abort_flg.addAllListener(p);
		p.Cnd_ship_cnt_rmrks.setListListener(p);
		p.Cnd_ship_cnt_rmrks.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_trd_d_rmrks.setListListener(p);
		p.Cnd_trd_d_rmrks.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_ShipSchdReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_ShipSchdReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBEP_ShipSchdReg p) {
		p.BulkSet_ship_wk_cd.setListListener(p);
		p.BulkSet_ship_wk_cd.addAllListener(p);
		p.BulkSet_ship_wk_nm.setListListener(p);
		p.BulkSet_ship_wk_nm.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_ShipSchdReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_pr_sts_typ.addAllListener(p);
		p.columnRslt_pr_sts_typ.setListListener(p);
		p.columnRslt_pr_sts_typ_nm.addAllListener(p);
		p.columnRslt_pr_sts_typ_nm.setListListener(p);
		p.columnRslt_alloc_sts_typ.addAllListener(p);
		p.columnRslt_alloc_sts_typ.setListListener(p);
		p.columnRslt_alloc_sts_typ_nm.addAllListener(p);
		p.columnRslt_alloc_sts_typ_nm.setListListener(p);
		p.columnRslt_ship_block_flg.addAllListener(p);
		p.columnRslt_ship_abl_flg.addAllListener(p);
		p.columnRslt_fix_flg.addAllListener(p);
		p.columnRslt_dlv_day_week_typ.addAllListener(p);
		p.columnRslt_dlv_day_week_typ.setListListener(p);
		p.columnRslt_dlv_day_week_typ_nm.addAllListener(p);
		p.columnRslt_dlv_day_week_typ_nm.setListListener(p);
		p.columnRslt_no_calc_flg.addAllListener(p);
		p.columnRslt_ship_schd_time.addAllListener(p);
		p.columnRslt_ship_schd_time.setListListener(p);
		p.columnRslt_cl_time_chk_flg.addAllListener(p);
		p.columnRslt_ship_dt_chk_flg.addAllListener(p);
		p.columnRslt_ship_term_cd.addAllListener(p);
		p.columnRslt_ship_term_cd.setListListener(p);
		p.columnRslt_ship_term_nm.addAllListener(p);
		p.columnRslt_ship_term_nm.setListListener(p);
		p.columnRslt_ship_wk_grp_cd.addAllListener(p);
		p.columnRslt_ship_wk_grp_cd.setListListener(p);
		p.columnRslt_ship_wk_grp_nm.addAllListener(p);
		p.columnRslt_ship_wk_grp_nm.setListListener(p);
		p.columnRslt_ship_wk_cd.addAllListener(p);
		p.columnRslt_ship_wk_cd.setListListener(p);
		p.columnRslt_ship_wk_nm.addAllListener(p);
		p.columnRslt_ship_wk_nm.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.setListListener(p);
		p.columnRslt_ship_to_lg_grp_cd.addAllListener(p);
		p.columnRslt_ship_to_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_to_lg_grp_nm.addAllListener(p);
		p.columnRslt_ship_to_lg_grp_nm.setListListener(p);
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
		p.columnRslt_dlv_id_typ.addAllListener(p);
		p.columnRslt_dlv_id_typ.setListListener(p);
		p.columnRslt_dlv_id_typ_nm.addAllListener(p);
		p.columnRslt_dlv_id_typ_nm.setListListener(p);
		p.columnRslt_dlv_id_cd.addAllListener(p);
		p.columnRslt_dlv_id_cd.setListListener(p);
		p.columnRslt_dlv_id_nm.addAllListener(p);
		p.columnRslt_dlv_id_nm.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_rqst_usr_cd.addAllListener(p);
		p.columnRslt_rqst_usr_cd.setListListener(p);
		p.columnRslt_rqst_usr_nm.addAllListener(p);
		p.columnRslt_rqst_usr_nm.setListListener(p);
		p.columnRslt_rqst_dpt_cd.addAllListener(p);
		p.columnRslt_rqst_dpt_cd.setListListener(p);
		p.columnRslt_rqst_dpt_nm.addAllListener(p);
		p.columnRslt_rqst_dpt_nm.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_stk_mng_typ.addAllListener(p);
		p.columnRslt_stk_mng_typ.setListListener(p);
		p.columnRslt_dscnt_itm_flg.addAllListener(p);
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_qty.setListListener(p);
		p.columnRslt_alloc_ent_unit_cd.addAllListener(p);
		p.columnRslt_alloc_ent_unit_cd.setListListener(p);
		p.columnRslt_alloc_ent_unit_nm.addAllListener(p);
		p.columnRslt_alloc_ent_unit_nm.setListListener(p);
		p.columnRslt_alloc_ent_unit_dec_place.addAllListener(p);
		p.columnRslt_alloc_ent_unit_dec_place.setListListener(p);
		p.columnRslt_alloc_ent_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_alloc_ent_unit_conv_base_qty.setListListener(p);
		p.columnRslt_alloc_ent_unit_conv_qty.addAllListener(p);
		p.columnRslt_alloc_ent_unit_conv_qty.setListListener(p);
		p.columnRslt_alloc_ent_unit_rnd_typ.addAllListener(p);
		p.columnRslt_alloc_ent_unit_rnd_typ.setListListener(p);
		p.columnRslt_abort_flg.addAllListener(p);
		p.columnRslt_div_flg.addAllListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_base_unit_conv_base_qty.setListListener(p);
		p.columnRslt_base_unit_conv_qty.addAllListener(p);
		p.columnRslt_base_unit_conv_qty.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_wt.addAllListener(p);
		p.columnRslt_wt.setListListener(p);
		p.columnRslt_dim.addAllListener(p);
		p.columnRslt_dim.setListListener(p);
		p.columnRslt_alloc_flg.addAllListener(p);
		p.columnRslt_grp_alloc_flg.addAllListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_tgt_flg.addAllListener(p);
		p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_lot_none_flg.addAllListener(p);
		p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_lot_mng_typ.addAllListener(p);
		p.columnRslt_lot_mng_typ.setListListener(p);
		p.columnRslt_lot_no_typ.addAllListener(p);
		p.columnRslt_lot_no_typ.setListListener(p);
		p.columnRslt_sublot_mng_typ.addAllListener(p);
		p.columnRslt_sublot_mng_typ.setListListener(p);
		p.columnRslt_sublot_no_typ.addAllListener(p);
		p.columnRslt_sublot_no_typ.setListListener(p);
		p.columnRslt_ver_flg.addAllListener(p);
		p.columnRslt_not_lot_mix_flg.addAllListener(p);
		p.columnRslt_not_sublot_mix_flg.addAllListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
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
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_stk_bp_nm.addAllListener(p);
		p.columnRslt_stk_bp_nm.setListListener(p);
		p.columnRslt_alloc_grp_cd.addAllListener(p);
		p.columnRslt_alloc_grp_cd.setListListener(p);
		p.columnRslt_alloc_grp_nm.addAllListener(p);
		p.columnRslt_alloc_grp_nm.setListListener(p);
		p.columnRslt_def_loc_cd.addAllListener(p);
		p.columnRslt_def_loc_cd.setListListener(p);
		p.columnRslt_def_loc_nm.addAllListener(p);
		p.columnRslt_def_loc_nm.setListListener(p);
		p.columnRslt_ship_loc_prio_flg.addAllListener(p);
		p.columnRslt_assort_typ.addAllListener(p);
		p.columnRslt_assort_typ.setListListener(p);
		p.columnRslt_assort_typ_nm.addAllListener(p);
		p.columnRslt_assort_typ_nm.setListListener(p);
		p.columnRslt_set_itm_grp_no.addAllListener(p);
		p.columnRslt_set_itm_grp_no.setListListener(p);
		p.columnRslt_assort_sts_mark.addAllListener(p);
		p.columnRslt_assort_sts_mark.setListListener(p);
		p.columnRslt_alloc_typ.addAllListener(p);
		p.columnRslt_alloc_typ.setListListener(p);
		p.columnRslt_alloc_typ_nm.addAllListener(p);
		p.columnRslt_alloc_typ_nm.setListListener(p);
		p.columnRslt_base_dlv_slip_no.addAllListener(p);
		p.columnRslt_base_dlv_slip_no.setListListener(p);
		p.columnRslt_base_prov_act_no.addAllListener(p);
		p.columnRslt_base_prov_act_no.setListListener(p);
		p.columnRslt_base_ac_dt.addAllListener(p);
		p.columnRslt_base_ac_dt.setListListener(p);
		p.columnRslt_ship_cnt_rmrks.addAllListener(p);
		p.columnRslt_ship_cnt_rmrks.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_trd_d_rmrks.addAllListener(p);
		p.columnRslt_trd_d_rmrks.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_xfr_schd_no.addAllListener(p);
		p.columnRslt_xfr_schd_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_iv_trd_flg.addAllListener(p);
		p.columnRslt_iv_reg_flg.addAllListener(p);
		p.columnRslt_iv_ship_flg.addAllListener(p);
		p.columnRslt_ship_schd_no.addAllListener(p);
		p.columnRslt_ship_schd_no.setListListener(p);
		p.columnRslt_ship_alloc_sts_no.addAllListener(p);
		p.columnRslt_ship_alloc_sts_no.setListListener(p);
		p.columnRslt_org_ship_alloc_sts_no.addAllListener(p);
		p.columnRslt_org_ship_alloc_sts_no.setListListener(p);
		p.columnRslt_ship_inst_no.addAllListener(p);
		p.columnRslt_ship_inst_no.setListListener(p);
		p.columnRslt_ship_inst_d_no.addAllListener(p);
		p.columnRslt_ship_inst_d_no.setListListener(p);
		p.columnRslt_ship_inst_typ.addAllListener(p);
		p.columnRslt_ship_inst_typ.setListListener(p);
		p.columnRslt_ship_pr_no.addAllListener(p);
		p.columnRslt_ship_pr_no.setListListener(p);
		p.columnRslt_alloc_scope_typ.addAllListener(p);
		p.columnRslt_alloc_scope_typ.setListListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_ship_pr_upd_cntr.addAllListener(p);
		p.columnRslt_ship_pr_upd_cntr.setListListener(p);
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
		p.columnRslt_lot_peg_no.addAllListener(p);
		p.columnRslt_lot_peg_no.setListListener(p);
		p.columnRslt_no_alloc_flg.addAllListener(p);
		p.columnRslt_org_fix_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_ShipSchdReg p) {
		p.Btn_open_MSBEP1400.addAllListener(p);
		p.Btn_open_MSBEP1400.setAPMethodName("doBtn_open_MSBEP1400");
		p.Btn_open_MSBEP1440.addAllListener(p);
		p.Btn_open_MSBEP1440.setAPMethodName("doBtn_open_MSBEP1440");
		p.Btn_open_MSBEP1430.addAllListener(p);
		p.Btn_open_MSBEP1430.setAPMethodName("doBtn_open_MSBEP1430");
		p.Btn_srch02.addAllListener(p);
		p.Btn_srch02.setAPMethodName("doBtn_srch02");
		p.Btn_sprt_ac_dt.addAllListener(p);
		p.Btn_sprt_ac_dt.setAPMethodName("doBtn_sprt_ac_dt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_SrchMode(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_PrSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab2(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab3(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab4(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_AllocSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ShipBlk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ShipBlk(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ShipSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_DlvCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_CstCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ItmCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBEP_ShipSchdReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_no_lot_chk_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_part_ship_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_ship_block_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_ship_block_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_via_dlv_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_via_dlv_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_usr_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_ship_inst_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_ship_cnt_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_RPnl(MSBEP_ShipSchdReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_BulkSet(MSBEP_ShipSchdReg p){
		p.BulkSet_ship_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_dlv_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ship_wk_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.BulkSet_ship_wk_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MSBEP_ShipSchdReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_abl_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_no_calc_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_src_ship_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_ship_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_ship_schd_time.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_fix_ship_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_dlv_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_fix_dlv_schd_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cl_time_chk_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_dt_chk_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_to_sundry_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alloc_ent_unit_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_base_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_base_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_base_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_wait_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_schd_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_act_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_grp_alloc_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_lot_none_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_not_lot_mix_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_def_loc_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_def_loc_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_prio_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_assort_sts_mark.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_org_ship_alloc_sts_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_lot_peg_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_no_alloc_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_org_fix_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBEP_ShipSchdReg p){
		p.Btn_open_MSBEP1400.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP1440.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP1430.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_srch02.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_SrchMode(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_PrSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab3(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab4(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_AllocSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ShipBlk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ShipBlk(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ShipSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_DlvCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_CstCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ItmCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBEP_ShipSchdReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_no_lot_chk_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_ship_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_part_ship_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_alloc_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_ship_block_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_ship_block_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_via_dlv_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_via_dlv_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_usr_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ship_inst_d_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_ship_cnt_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MSBEP_ShipSchdReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RPnl(MSBEP_ShipSchdReg p){
		p.RPnl_dwnld.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_BulkSet(MSBEP_ShipSchdReg p){
		p.BulkSet_ship_schd_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_schd_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ship_wk_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.BulkSet_ship_wk_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MSBEP_ShipSchdReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_abl_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_no_calc_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_src_ship_schd_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_ship_schd_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_ship_schd_time.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_fix_ship_schd_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_schd_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_dlv_schd_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_fix_dlv_schd_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_cl_time_chk_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ship_dt_chk_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_to_sundry_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alloc_ent_unit_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_base_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_base_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_base_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_wait_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_schd_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_act_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_grp_alloc_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_lot_none_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_not_lot_mix_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_def_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_def_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_prio_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_assort_sts_mark.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_org_ship_alloc_sts_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_lot_peg_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_no_alloc_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_org_fix_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBEP_ShipSchdReg p){
		p.Btn_open_MSBEP1400.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MSBEP1440.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MSBEP1430.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_srch02.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [UPD_SHIP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_ScreenOpe(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_SrchMode(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_PrSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Top(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Fold(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Tab1(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Tab2(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Tab3(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Tab4(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_AllocSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[ShipBlk]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_ShipBlk(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_ShipSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_DlvCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_CstCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_ItmCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Cnd(MSBEP_ShipSchdReg p){
		p.Cnd_ope_Group.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Cnd_no_lot_chk_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_part_ship_flg.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Cnd_ship_block_flg.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_not_ship_block_flg.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_via_dlv_typ.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_via_dlv_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_usr_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_inst_d_no.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Cnd_ship_cnt_rmrks.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_SHIP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Ctrl(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_SHIP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_RPnl(MSBEP_ShipSchdReg p){
		p.RPnl_dwnld.putMode(p, UPD_SHIP, MCMode.ENABLE);

	}

	/**
	 * [UPD_SHIP]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_BulkSet(MSBEP_ShipSchdReg p){
		p.BulkSet_ship_schd_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_dlv_schd_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_ship_wk_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.BulkSet_ship_wk_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_SHIP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Rslt(MSBEP_ShipSchdReg p){
		p.columnRslt_check.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.columnRslt_ship_abl_flg.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_no_calc_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.Rslt_src_ship_schd_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_ship_schd_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.Rslt_ship_schd_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_ship_schd_time.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_fix_ship_schd_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_dlv_schd_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.Rslt_fix_dlv_schd_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cl_time_chk_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.columnRslt_ship_dt_chk_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.columnRslt_ship_term_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.columnRslt_ship_term_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_cd.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.columnRslt_ship_wk_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_sundry_flg.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_alloc_ent_unit_cd.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_nm.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_dec_place.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_base_qty.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_qty.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_rnd_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, UPD_SHIP, MCMode.REQUIRED);
		p.columnRslt_div_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_base_qty.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_qty.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_base_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_wait_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_schd_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_act_qty_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_lot_none_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_not_lot_mix_flg.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_def_loc_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_def_loc_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_prio_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_assort_sts_mark.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.columnRslt_base_prov_act_no.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.columnRslt_base_ac_dt.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.columnRslt_ship_cnt_rmrks.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_org_ship_alloc_sts_no.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_SHIP, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_SHIP, MCMode.READ_ONLY);
		p.columnRslt_lot_peg_no.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_no_alloc_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);
		p.columnRslt_org_fix_flg.putMode(p, UPD_SHIP, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SHIP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SHIP_Btn(MSBEP_ShipSchdReg p){
		p.Btn_open_MSBEP1400.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Btn_open_MSBEP1440.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Btn_open_MSBEP1430.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD_SHIP, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_srch02.putMode(p, UPD_SHIP, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_SHIP, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD_SHIP, MCMode.ENABLE);

	}

	/**
	 * [UPD_ALLOC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_ScreenOpe(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_SrchMode(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_PrSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Top(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Fold(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Tab1(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Tab2(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Tab3(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Tab4(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_AllocSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[ShipBlk]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_ShipBlk(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_ShipSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_DlvCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_CstCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_ItmCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Cnd(MSBEP_ShipSchdReg p){
		p.Cnd_ope_Group.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.Cnd_no_lot_chk_flg.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_part_ship_flg.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.Cnd_ship_block_flg.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_not_ship_block_flg.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_via_dlv_typ.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_via_dlv_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_usr_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_inst_d_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.Cnd_ship_cnt_rmrks.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_ALLOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Ctrl(MSBEP_ShipSchdReg p){

	}

	/**
	 * [UPD_ALLOC]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_RPnl(MSBEP_ShipSchdReg p){
		p.RPnl_dwnld.putMode(p, UPD_ALLOC, MCMode.ENABLE);

	}

	/**
	 * [UPD_ALLOC]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_BulkSet(MSBEP_ShipSchdReg p){
		p.BulkSet_ship_schd_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_schd_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ship_wk_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.BulkSet_ship_wk_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ALLOC]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Rslt(MSBEP_ShipSchdReg p){
		p.columnRslt_check.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_sts_typ_nm.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_abl_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_no_calc_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_src_ship_schd_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_ship_schd_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_ship_schd_time.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_fix_ship_schd_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_dlv_schd_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_fix_dlv_schd_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cl_time_chk_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_dt_chk_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_sundry_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_alloc_sno_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alloc_ent_unit_cd.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.columnRslt_alloc_ent_unit_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_ent_unit_dec_place.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_base_qty.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_qty.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_rnd_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_abort_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_base_qty.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_qty.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_base_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_wait_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_schd_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_act_qty_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_dim.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.columnRslt_grp_alloc_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.columnRslt_loc_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnRslt_lot_none_flg.putMode(p, UPD_ALLOC, MCMode.REQUIRED);
		p.Rslt_lot_no_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnRslt_ver_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_not_lot_mix_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_def_loc_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_def_loc_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_prio_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_assort_sts_mark.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_org_ship_alloc_sts_no.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_ALLOC, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_peg_no.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_no_alloc_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_org_fix_flg.putMode(p, UPD_ALLOC, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ALLOC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ALLOC_Btn(MSBEP_ShipSchdReg p){
		p.Btn_open_MSBEP1400.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Btn_open_MSBEP1440.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Btn_open_MSBEP1430.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD_ALLOC, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_srch02.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Btn_sprt_ac_dt.putMode(p, UPD_ALLOC, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_ALLOC, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD_ALLOC, MCMode.ENABLE);

	}

	/**
	 * [REF_SHIP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_ScreenOpe(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_SrchMode(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_PrSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Top(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Fold(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Tab1(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Tab2(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Tab3(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Tab4(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_AllocSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[ShipBlk]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_ShipBlk(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_ShipSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_DlvCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_CstCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_ItmCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Cnd(MSBEP_ShipSchdReg p){
		p.Cnd_ope_Group.putMode(p, REF_SHIP, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, REF_SHIP, MCMode.REQUIRED);
		p.Cnd_no_lot_chk_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_not_ship_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_part_ship_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_not_alloc_flg.putMode(p, REF_SHIP, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, REF_SHIP, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, REF_SHIP, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, REF_SHIP, MCMode.REQUIRED);
		p.Cnd_ship_block_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_not_ship_block_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_via_dlv_typ.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_via_dlv_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF_SHIP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_usr_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_d_no.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, REF_SHIP, MCMode.REQUIRED);
		p.Cnd_ship_cnt_rmrks.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SHIP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Ctrl(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_SHIP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_RPnl(MSBEP_ShipSchdReg p){
		p.RPnl_dwnld.putMode(p, REF_SHIP, MCMode.ENABLE);

	}

	/**
	 * [REF_SHIP]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_BulkSet(MSBEP_ShipSchdReg p){
		p.BulkSet_ship_schd_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_schd_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ship_wk_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.BulkSet_ship_wk_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SHIP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Rslt(MSBEP_ShipSchdReg p){
		p.columnRslt_check.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_abl_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_no_calc_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_src_ship_schd_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_ship_schd_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_ship_schd_time.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_fix_ship_schd_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_schd_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_dlv_schd_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_fix_dlv_schd_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_cl_time_chk_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_dt_chk_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_sundry_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_SHIP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.putStatus(REF_SHIP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alloc_ent_unit_cd.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_nm.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_dec_place.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_base_qty.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_qty.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_rnd_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_base_qty.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_qty.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_base_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_wait_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_schd_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_act_qty_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_lot_none_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_SHIP, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_not_lot_mix_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_def_loc_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_def_loc_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_prio_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_assort_sts_mark.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_org_ship_alloc_sts_no.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_SHIP, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_SHIP, MCMode.READ_ONLY);
		p.columnRslt_lot_peg_no.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_no_alloc_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);
		p.columnRslt_org_fix_flg.putMode(p, REF_SHIP, MCMode.INVISIBLE);

	}

	/**
	 * [REF_SHIP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SHIP_Btn(MSBEP_ShipSchdReg p){
		p.Btn_open_MSBEP1400.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Btn_open_MSBEP1440.putMode(p, REF_SHIP, MCMode.DISABLE);
		p.Btn_open_MSBEP1430.putMode(p, REF_SHIP, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF_SHIP, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_srch02.putMode(p, REF_SHIP, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, REF_SHIP, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_SHIP, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_SHIP, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_SHIP, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_SHIP, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_SHIP, MCMode.DISABLE);

	}

	/**
	 * [REF_ALLOC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_ScreenOpe(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_SrchMode(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_PrSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Top(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Fold(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Tab1(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Tab2(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Tab3(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Tab4(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_AllocSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[ShipBlk]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_ShipBlk(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_ShipSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_DlvCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_CstCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_ItmCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Cnd(MSBEP_ShipSchdReg p){
		p.Cnd_ope_Group.putMode(p, REF_ALLOC, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, REF_ALLOC, MCMode.REQUIRED);
		p.Cnd_no_lot_chk_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_not_ship_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_part_ship_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_not_alloc_flg.putMode(p, REF_ALLOC, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, REF_ALLOC, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, REF_ALLOC, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, REF_ALLOC, MCMode.REQUIRED);
		p.Cnd_ship_block_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_not_ship_block_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_via_dlv_typ.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_via_dlv_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_usr_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_d_no.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, REF_ALLOC, MCMode.REQUIRED);
		p.Cnd_ship_cnt_rmrks.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ALLOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Ctrl(MSBEP_ShipSchdReg p){

	}

	/**
	 * [REF_ALLOC]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_RPnl(MSBEP_ShipSchdReg p){
		p.RPnl_dwnld.putMode(p, REF_ALLOC, MCMode.ENABLE);

	}

	/**
	 * [REF_ALLOC]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_BulkSet(MSBEP_ShipSchdReg p){
		p.BulkSet_ship_schd_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_schd_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ship_wk_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.BulkSet_ship_wk_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ALLOC]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Rslt(MSBEP_ShipSchdReg p){
		p.columnRslt_check.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_sts_typ_nm.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_abl_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_no_calc_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_src_ship_schd_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_ship_schd_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_ship_schd_time.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_fix_ship_schd_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_schd_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_dlv_schd_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_fix_dlv_schd_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_cl_time_chk_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_dt_chk_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_sundry_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_alloc_sno_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alloc_ent_unit_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_ent_unit_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_ent_unit_dec_place.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_base_qty.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_qty.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_rnd_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_base_qty.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_qty.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_base_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_wait_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_schd_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_act_qty_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_dim.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_grp_alloc_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_lot_none_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_not_lot_mix_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_def_loc_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_def_loc_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_prio_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_assort_sts_mark.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_org_ship_alloc_sts_no.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_ALLOC, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_peg_no.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_no_alloc_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_org_fix_flg.putMode(p, REF_ALLOC, MCMode.INVISIBLE);

	}

	/**
	 * [REF_ALLOC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ALLOC_Btn(MSBEP_ShipSchdReg p){
		p.Btn_open_MSBEP1400.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Btn_open_MSBEP1440.putMode(p, REF_ALLOC, MCMode.DISABLE);
		p.Btn_open_MSBEP1430.putMode(p, REF_ALLOC, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF_ALLOC, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_srch02.putMode(p, REF_ALLOC, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, REF_ALLOC, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_ALLOC, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_ALLOC, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_ALLOC, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_ALLOC, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_ALLOC, MCMode.DISABLE);

	}

	/**
	 * [FIX_SHIP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_ScreenOpe(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_SrchMode(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_PrSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Top(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Fold(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Tab1(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Tab2(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Tab3(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Tab4(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_AllocSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[ShipBlk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_ShipBlk(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_ShipSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_DlvCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_CstCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_ItmCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Cnd(MSBEP_ShipSchdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_SHIP, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, FIX_SHIP, MCMode.REQUIRED);
		p.Cnd_no_lot_chk_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_part_ship_flg.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, FIX_SHIP, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, FIX_SHIP, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, FIX_SHIP, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, FIX_SHIP, MCMode.REQUIRED);
		p.Cnd_ship_block_flg.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_not_ship_block_flg.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_via_dlv_typ.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_via_dlv_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_usr_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_ship_inst_d_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, FIX_SHIP, MCMode.REQUIRED);
		p.Cnd_ship_cnt_rmrks.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_SHIP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Ctrl(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_SHIP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_RPnl(MSBEP_ShipSchdReg p){
		p.RPnl_dwnld.putMode(p, FIX_SHIP, MCMode.ENABLE);

	}

	/**
	 * [FIX_SHIP]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_BulkSet(MSBEP_ShipSchdReg p){
		p.BulkSet_ship_schd_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_schd_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ship_wk_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.BulkSet_ship_wk_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_SHIP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Rslt(MSBEP_ShipSchdReg p){
		p.columnRslt_check.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_block_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_abl_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_no_calc_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_src_ship_schd_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_ship_schd_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ship_schd_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_ship_schd_time.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_fix_ship_schd_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_dlv_schd_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_fix_dlv_schd_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cl_time_chk_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_dt_chk_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_term_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_to_sundry_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alloc_ent_unit_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_dec_place.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_base_qty.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_qty.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_rnd_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_base_qty.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_qty.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_base_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_wait_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_schd_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_act_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_dim.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_grp_alloc_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_lot_none_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_not_lot_mix_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_def_loc_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_def_loc_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_prio_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_assort_sts_mark.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_org_ship_alloc_sts_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnRslt_lot_peg_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_no_alloc_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnRslt_org_fix_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_SHIP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Btn(MSBEP_ShipSchdReg p){
		p.Btn_open_MSBEP1400.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Btn_open_MSBEP1440.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Btn_open_MSBEP1430.putMode(p, FIX_SHIP, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_SHIP, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_srch02.putMode(p, FIX_SHIP, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_SHIP, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_SHIP, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_SHIP, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_SHIP, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_SHIP, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_SHIP, MCMode.DISABLE);

	}

	/**
	 * [FIX_ALLOC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_ScreenOpe(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_SrchMode(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[PrSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_PrSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Top(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Fold(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Tab1(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Tab2(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Tab3(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Tab4(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[AllocSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_AllocSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[ShipBlk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_ShipBlk(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[ShipSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_ShipSts(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_DlvCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_CstCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_ItmCnd(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Cnd(MSBEP_ShipSchdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_ALLOC, MCMode.REQUIRED);
		p.Cnd_md_Group.putMode(p, FIX_ALLOC, MCMode.REQUIRED);
		p.Cnd_no_lot_chk_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_not_inst_flg.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_inst_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_part_ship_flg.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_not_alloc_flg.putMode(p, FIX_ALLOC, MCMode.REQUIRED);
		p.Cnd_part_alloc_flg.putMode(p, FIX_ALLOC, MCMode.REQUIRED);
		p.Cnd_all_alloc_flg.putMode(p, FIX_ALLOC, MCMode.REQUIRED);
		p.Cnd_alloc_invalid_flg.putMode(p, FIX_ALLOC, MCMode.REQUIRED);
		p.Cnd_ship_block_flg.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_not_ship_block_flg.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_rqst_flg.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_rqst_flg.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_pd_inst_dlv_flg.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ssdt_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dsdt_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_alloc_grp_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_to_id_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_to_id_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_to_id_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_via_dlv_typ.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_via_dlv_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_term_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqst_usr_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_rqst_usr_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_rqst_dpt_cd.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_rqst_dpt_nm.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_typ.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_schd_no.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_xfr_schd_no.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_ship_inst_d_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, FIX_ALLOC, MCMode.REQUIRED);
		p.Cnd_ship_cnt_rmrks.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_ALLOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Ctrl(MSBEP_ShipSchdReg p){

	}

	/**
	 * [FIX_ALLOC]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_RPnl(MSBEP_ShipSchdReg p){
		p.RPnl_dwnld.putMode(p, FIX_ALLOC, MCMode.ENABLE);

	}

	/**
	 * [FIX_ALLOC]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_BulkSet(MSBEP_ShipSchdReg p){
		p.BulkSet_ship_schd_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_dlv_schd_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_ship_wk_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.BulkSet_ship_wk_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_ALLOC]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Rslt(MSBEP_ShipSchdReg p){
		p.columnRslt_check.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_sts_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_sts_typ_nm.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_block_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_abl_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_dlv_rqst_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_pd_inst_dlv_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_dlv_day_week_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_dlv_day_week_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_rqst_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_no_calc_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_src_ship_schd_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_ship_schd_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_ship_schd_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_ship_schd_time.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_fix_ship_schd_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_schd_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_ent_dlv_schd_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_fix_dlv_schd_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_cl_time_chk_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_dt_chk_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_term_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_term_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_grp_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_wk_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_lg_grp_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_id_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_to_sundry_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr1.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr2.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr3.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_addr4.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_tel.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_fax.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ship_to_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_usr_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_rqst_dpt_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_mng_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_alloc_sno_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_alloc_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_alloc_ent_unit_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_ent_unit_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_ent_unit_dec_place.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_base_qty.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_conv_qty.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_ent_unit_rnd_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_alloc_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_div_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_base_qty.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_qty.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_base_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_alloc_base_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_schd_alloc_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_schd_wait_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_inst_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_schd_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_iv_act_qty_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_act_cont_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_act_fctr_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_std_fctr_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_wt.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_dim.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_grp_alloc_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_lot_none_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_ver_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_not_lot_mix_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_not_sublot_mix_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_grp_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_def_loc_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_def_loc_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_loc_prio_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_assort_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_assort_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_set_itm_grp_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_assort_sts_mark.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_alloc_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_dlv_slip_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_prov_act_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_base_ac_dt.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_cnt_rmrks.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_xfr_schd_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_trd_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_reg_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_iv_ship_flg.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ship_alloc_sts_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_org_ship_alloc_sts_no.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_no.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_d_no.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_inst_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_no.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_alloc_scope_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_ALLOC, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_ship_pr_upd_cntr.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_ALLOC, MCMode.READ_ONLY);
		p.columnRslt_lot_peg_no.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_no_alloc_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);
		p.columnRslt_org_fix_flg.putMode(p, FIX_ALLOC, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_ALLOC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ALLOC_Btn(MSBEP_ShipSchdReg p){
		p.Btn_open_MSBEP1400.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Btn_open_MSBEP1440.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Btn_open_MSBEP1430.putMode(p, FIX_ALLOC, MCMode.ENABLE);
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_ALLOC, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_srch02.putMode(p, FIX_ALLOC, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_ALLOC, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_ALLOC, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_ALLOC, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_ALLOC, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_ALLOC, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_ALLOC, MCMode.DISABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_ShipSchdReg_MC.setTableConfigRslt((MSBEP_ShipSchdReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_ShipSchdReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.pr_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ);
		p.columnRslt_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.pr_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ_nm);
		p.columnRslt_alloc_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_sts_typ);
		p.columnRslt_alloc_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_sts_typ_nm);
		p.columnRslt_ship_block_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_block_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_block_flg);
		p.columnRslt_ship_abl_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_abl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_abl_flg);
		p.columnRslt_fix_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_flg);
		p.RsltTable.addTable(p.Rslt_dlv_rqst_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_pd_inst_dlv_p_PPanel.YmdHmTable);
		p.columnRslt_dlv_day_week_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.dlv_day_week_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_day_week_typ);
		p.columnRslt_dlv_day_week_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.dlv_day_week_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_day_week_typ_nm);
		p.RsltTable.addTable(p.Rslt_ship_rqst_p_PPanel.YmdHmTable);
		p.columnRslt_no_calc_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.no_calc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_no_calc_flg);
		p.RsltTable.addTable(p.Rslt_src_ship_schd_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ent_ship_schd_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ship_schd_p_PPanel.YmdHmTable);
		p.columnRslt_ship_schd_time.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_schd_time_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_time);
		p.RsltTable.addTable(p.Rslt_fix_ship_schd_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_dlv_schd_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_ent_dlv_schd_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_fix_dlv_schd_p_PPanel.YmdHmTable);
		p.columnRslt_cl_time_chk_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.cl_time_chk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cl_time_chk_flg);
		p.columnRslt_ship_dt_chk_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_dt_chk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dt_chk_flg);
		p.columnRslt_ship_term_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_term_cd_META);
		p.columnRslt_ship_term_cd.addLinkBeans(p.columnRslt_ship_term_nm,p.columnRslt_ship_wk_grp_cd,p.columnRslt_ship_wk_grp_nm,p.columnRslt_ship_wk_cd,p.columnRslt_ship_wk_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_cd);
		p.columnRslt_ship_term_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_term_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_term_nm);
		p.columnRslt_ship_wk_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_wk_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_grp_cd);
		p.columnRslt_ship_wk_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_wk_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_grp_nm);
		p.columnRslt_ship_wk_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_wk_cd_META);
		p.columnRslt_ship_wk_cd.addLinkBeans(p.columnRslt_ship_wk_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_cd);
		p.columnRslt_ship_wk_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_wk_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_wk_nm);
		p.columnRslt_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_fr_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_cd);
		p.columnRslt_ship_fr_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_fr_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_nm);
		p.columnRslt_ship_to_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_to_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_lg_grp_cd);
		p.columnRslt_ship_to_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_to_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_lg_grp_nm);
		p.columnRslt_ship_to_id_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_to_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_typ);
		p.columnRslt_ship_to_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_to_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_typ_nm);
		p.columnRslt_ship_to_id_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_to_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_cd);
		p.columnRslt_ship_to_id_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_to_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_id_nm);
		p.columnRslt_ship_to_sundry_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_to_sundry_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_to_sundry_flg);
		p.RsltTable.addTable(p.Rslt_ship_to_addr_p_PPanel.AddrTable);
		p.columnRslt_via_dlv_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.via_dlv_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ);
		p.columnRslt_via_dlv_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.via_dlv_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ_nm);
		p.columnRslt_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.dlv_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ);
		p.columnRslt_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.dlv_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ_nm);
		p.columnRslt_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.dlv_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_cd);
		p.columnRslt_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.dlv_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_nm);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_rqst_usr_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.rqst_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_usr_cd);
		p.columnRslt_rqst_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.rqst_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_usr_nm);
		p.columnRslt_rqst_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.rqst_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dpt_cd);
		p.columnRslt_rqst_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.rqst_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dpt_nm);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.columnRslt_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.stk_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ);
		p.columnRslt_dscnt_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.dscnt_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_itm_flg);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoWrkNoTable);
		p.RsltTable.addTable(p.Rslt_alloc_sno_p_PPanel.SnoWrkNoTable);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_base_qty);
		p.columnRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_qty);
		p.RsltTable.addTable(p.Rslt_qty_p_PPanel.QtyTable);
		p.columnRslt_alloc_ent_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_ent_unit_cd_META);
		p.columnRslt_alloc_ent_unit_cd.addLinkBeans(p.columnRslt_alloc_ent_unit_nm,p.columnRslt_alloc_ent_unit_conv_base_qty,p.columnRslt_alloc_ent_unit_conv_qty,p.columnRslt_alloc_ent_unit_dec_place,p.columnRslt_alloc_ent_unit_rnd_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ent_unit_cd);
		p.columnRslt_alloc_ent_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_ent_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ent_unit_nm);
		p.columnRslt_alloc_ent_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_ent_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ent_unit_dec_place);
		p.columnRslt_alloc_ent_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_ent_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ent_unit_conv_base_qty);
		p.columnRslt_alloc_ent_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_ent_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ent_unit_conv_qty);
		p.columnRslt_alloc_ent_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_ent_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ent_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_alloc_qty_p_PPanel.QtyTable);
		p.columnRslt_abort_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abort_flg);
		p.columnRslt_div_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.div_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_div_flg);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.base_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_conv_base_qty);
		p.columnRslt_base_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.base_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_conv_qty);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_base_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_alloc_base_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_schd_alloc_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_schd_wait_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_inst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_act_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_iv_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_iv_act_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_act_cont_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_act_fctr_p_PPanel.ActContFctrTable);
		p.RsltTable.addTable(p.Rslt_std_cont_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_std_fctr_p_PPanel.StdContFctrTable);
		p.RsltTable.addTable(p.Rslt_cont_unit_p_PPanel.ContFctrUnitTable);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.columnRslt_wt.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.wt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wt);
		p.columnRslt_dim.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.dim_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dim);
		p.columnRslt_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_flg);
		p.columnRslt_grp_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.grp_alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_grp_alloc_flg);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.loc_cd_META);
		p.columnRslt_loc_cd.addLinkBeans(p.columnRslt_loc_nm,p.columnRslt_str_ln_tgt_flg);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.str_ln_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_tgt_flg);
		p.RsltTable.addTable(p.Rslt_str_ln_p_PPanel.StrLnTable);
		p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnRslt_str_ln_nm);
		p.columnRslt_lot_none_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.lot_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_none_flg);
		p.RsltTable.addTable(p.Rslt_lot_no_p_PPanel.LotNoTable);
		p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnRslt_sublot_no, p.columnRslt_ver_no, p.columnRslt_act_cont_fctr);
		p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnRslt_ver_no, p.columnRslt_act_cont_fctr);
		p.columnRslt_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.lot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ);
		p.columnRslt_lot_no_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.lot_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no_typ);
		p.columnRslt_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.sublot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ);
		p.columnRslt_sublot_no_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.sublot_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no_typ);
		p.RsltTable.addTable(p.Rslt_ver_p_PPanel.VerNoTable);
		p.columnRslt_ver_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ver_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_flg);
		p.columnRslt_not_lot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.not_lot_mix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_lot_mix_flg);
		p.columnRslt_not_sublot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.not_sublot_mix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_sublot_mix_flg);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.columnRslt_alloc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_grp_cd);
		p.columnRslt_alloc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_grp_nm);
		p.columnRslt_def_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.def_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_def_loc_cd);
		p.columnRslt_def_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.def_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_def_loc_nm);
		p.columnRslt_ship_loc_prio_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_loc_prio_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_loc_prio_flg);
		p.columnRslt_assort_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.assort_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_assort_typ);
		p.columnRslt_assort_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.assort_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_assort_typ_nm);
		p.columnRslt_set_itm_grp_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.set_itm_grp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_set_itm_grp_no);
		p.columnRslt_assort_sts_mark.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.assort_sts_mark_META);
		p.RsltTable.addColumnConfig(p.columnRslt_assort_sts_mark);
		p.columnRslt_alloc_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_typ);
		p.columnRslt_alloc_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_typ_nm);
		p.columnRslt_base_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.base_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_dlv_slip_no);
		p.columnRslt_base_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.base_prov_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_prov_act_no);
		p.columnRslt_base_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.base_ac_dt_META);
		p.columnRslt_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_base_ac_dt);
		p.columnRslt_ship_cnt_rmrks.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_cnt_rmrks);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.xfr_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xfr_schd_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_iv_trd_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.iv_trd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_trd_flg);
		p.columnRslt_iv_reg_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.iv_reg_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_reg_flg);
		p.columnRslt_iv_ship_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.iv_ship_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_ship_flg);
		p.columnRslt_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_no);
		p.columnRslt_ship_alloc_sts_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_alloc_sts_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_alloc_sts_no);
		p.columnRslt_org_ship_alloc_sts_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.org_ship_alloc_sts_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_org_ship_alloc_sts_no);
		p.columnRslt_ship_inst_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_no);
		p.columnRslt_ship_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_inst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_d_no);
		p.columnRslt_ship_inst_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_inst_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_typ);
		p.columnRslt_ship_pr_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_pr_no);
		p.columnRslt_alloc_scope_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.alloc_scope_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_scope_typ);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.stk_arrv_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_cd);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_cst_grp_p_PPanel.BpGrpTable);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_ship_pr_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.ship_pr_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_pr_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_lot_peg_no.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.lot_peg_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_peg_no);
		p.columnRslt_no_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.no_alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_no_alloc_flg);
		p.columnRslt_org_fix_flg.setMeta(mcframe.clientMSBE.MSBEP1420.RsltR.org_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_org_fix_flg);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_alloc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_alloc_grp_cd.getListConfig().setPutter(getCnd_alloc_grp_cd_ListPutter());
		Cnd_ship_to_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_to_id_typ.getListConfig().setPutter(getCnd_ship_to_id_typ_ListPutter());
		Cnd_ship_to_id_cd.getListConfig().setPutter(getCnd_ship_to_id_cd_ListPutter());
		Cnd_dlv_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_id_typ.getListConfig().setPutter(getCnd_dlv_id_typ_ListPutter());
		Cnd_dlv_id_cd.getListConfig().setPutter(getCnd_dlv_id_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_via_dlv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_via_dlv_typ.getListConfig().setPutter(getCnd_via_dlv_typ_ListPutter());
		Cnd_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_term_cd.getListConfig().setPutter(getCnd_ship_term_cd_ListPutter());
		Cnd_ship_wk_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_wk_cd.getListConfig().setPutter(getCnd_ship_wk_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_rqst_usr_cd.getListConfig().setPutter(getCnd_rqst_usr_cd_ListPutter());
		Cnd_rqst_dpt_cd.getListConfig().setPutter(getCnd_rqst_dpt_cd_ListPutter());
		Cnd_ship_inst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_inst_typ.getListConfig().setPutter(getCnd_ship_inst_typ_ListPutter());
		BulkSet_ship_wk_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_ship_wk_cd.getListConfig().setPutter(getBulkSet_ship_wk_cd_ListPutter());
		columnRslt_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ship_term_cd.getListConfig().setPutter(getRslt_ship_term_cd_ListPutter());
		columnRslt_ship_wk_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ship_wk_cd.getListConfig().setPutter(getRslt_ship_wk_cd_ListPutter());
		columnRslt_alloc_ent_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_alloc_ent_unit_cd.getListConfig().setPutter(getRslt_alloc_ent_unit_cd_ListPutter());
		columnRslt_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_loc_cd.getListConfig().setPutter(getRslt_loc_cd_ListPutter());
		Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		Rslt_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getRslt_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getRslt_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
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
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_SHIP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_SHIPStatus() {
		status = UPD_SHIP;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_ALLOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_ALLOCStatus() {
		status = UPD_ALLOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SHIP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SHIPStatus() {
		status = REF_SHIP;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ALLOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ALLOCStatus() {
		status = REF_ALLOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_SHIP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_SHIPStatus() {
		status = FIX_SHIP;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_ALLOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_ALLOCStatus() {
		status = FIX_ALLOC;
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
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (UPD_SHIP.equals(status)) {
			setUPD_SHIPStatus();
		}
		else if (UPD_ALLOC.equals(status)) {
			setUPD_ALLOCStatus();
		}
		else if (REF_SHIP.equals(status)) {
			setREF_SHIPStatus();
		}
		else if (REF_ALLOC.equals(status)) {
			setREF_ALLOCStatus();
		}
		else if (FIX_SHIP.equals(status)) {
			setFIX_SHIPStatus();
		}
		else if (FIX_ALLOC.equals(status)) {
			setFIX_ALLOCStatus();
		}
	}

	/**
	 * [Cnd_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
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
	 * [Cnd_alloc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_alloc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocGrp");
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
	 * [Cnd_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_via_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_via_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ViaDlvTyp");
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
	 * [Cnd_ship_wk_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_wk_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWk");
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
	 * [Cnd_ship_inst_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_inst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipInstTyp");
		return lp;
	}
	 
	/**
	 * [BulkSet_ship_wk_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_ship_wk_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWk");
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
	 * [Rslt_ship_wk_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ship_wk_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWk");
		return lp;
	}
	 
	/**
	 * [Rslt_alloc_ent_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_alloc_ent_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_alloc_grp_cd) return getCnd_alloc_grp_cd(row, info);
		if(combo == Cnd_ship_to_id_typ) return getCnd_ship_to_id_typ(row, info);
		if(combo == Cnd_ship_to_id_cd) return getCnd_ship_to_id_cd(row, info);
		if(combo == Cnd_dlv_id_typ) return getCnd_dlv_id_typ(row, info);
		if(combo == Cnd_dlv_id_cd) return getCnd_dlv_id_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_via_dlv_typ) return getCnd_via_dlv_typ(row, info);
		if(combo == Cnd_ship_term_cd) return getCnd_ship_term_cd(row, info);
		if(combo == Cnd_ship_wk_cd) return getCnd_ship_wk_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_rqst_usr_cd) return getCnd_rqst_usr_cd(row, info);
		if(combo == Cnd_rqst_dpt_cd) return getCnd_rqst_dpt_cd(row, info);
		if(combo == Cnd_ship_inst_typ) return getCnd_ship_inst_typ(row, info);
		if(combo == BulkSet_ship_wk_cd) return getBulkSet_ship_wk_cd(row, info);
		if(combo == columnRslt_ship_term_cd) return getRslt_ship_term_cd(row, info);
		if(combo == columnRslt_ship_wk_cd) return getRslt_ship_wk_cd(row, info);
		if(combo == columnRslt_alloc_ent_unit_cd) return getRslt_alloc_ent_unit_cd(row, info);
		if(combo == columnRslt_loc_cd) return getRslt_loc_cd(row, info);
		if(combo == Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == Rslt_lot_no_p_PPanel.columnLotNo_lot_no) return getRslt_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == Rslt_lot_no_p_PPanel.columnLotNo_sublot_no) return getRslt_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
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
		else if (ap == Btn_open_MSBEP1400) doBtn_open_MSBEP1400(info);
		else if (ap == Btn_open_MSBEP1440) doBtn_open_MSBEP1440(info);
		else if (ap == Btn_open_MSBEP1430) doBtn_open_MSBEP1430(info);
		else if (ap == Btn_srch02) doBtn_srch02(info);
		else if (ap == Btn_sprt_ac_dt) doBtn_sprt_ac_dt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
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
	 * [Btn]パネルの[open_MSBEP1400]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1400(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1440]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1440(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1430]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1430(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch02]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch02(MCEventInfo info);

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
		if (vc == Cnd_md_Group) return doCnd_md_VC(info);
		if (vc == Cnd_no_lot_chk_flg) return doCnd_no_lot_chk_flg_VC(info);
		if (vc == Cnd_not_inst_flg) return doCnd_not_inst_flg_VC(info);
		if (vc == Cnd_inst_flg) return doCnd_inst_flg_VC(info);
		if (vc == Cnd_not_ship_flg) return doCnd_not_ship_flg_VC(info);
		if (vc == Cnd_part_ship_flg) return doCnd_part_ship_flg_VC(info);
		if (vc == Cnd_ship_flg) return doCnd_ship_flg_VC(info);
		if (vc == Cnd_not_alloc_flg) return doCnd_not_alloc_flg_VC(info);
		if (vc == Cnd_part_alloc_flg) return doCnd_part_alloc_flg_VC(info);
		if (vc == Cnd_all_alloc_flg) return doCnd_all_alloc_flg_VC(info);
		if (vc == Cnd_alloc_invalid_flg) return doCnd_alloc_invalid_flg_VC(info);
		if (vc == Cnd_ship_block_flg) return doCnd_ship_block_flg_VC(info);
		if (vc == Cnd_not_ship_block_flg) return doCnd_not_ship_block_flg_VC(info);
		if (vc == Cnd_dlv_rqst_flg) return doCnd_dlv_rqst_flg_VC(info);
		if (vc == Cnd_ship_rqst_flg) return doCnd_ship_rqst_flg_VC(info);
		if (vc == Cnd_pd_inst_dlv_flg) return doCnd_pd_inst_dlv_flg_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_alloc_grp_cd) return doCnd_alloc_grp_cd_VC(info);
		if (vc == Cnd_alloc_grp_nm) return doCnd_alloc_grp_nm_VC(info);
		if (vc == Cnd_ship_to_id_typ) return doCnd_ship_to_id_typ_VC(info);
		if (vc == Cnd_ship_to_id_typ_nm) return doCnd_ship_to_id_typ_nm_VC(info);
		if (vc == Cnd_ship_to_id_cd) return doCnd_ship_to_id_cd_VC(info);
		if (vc == Cnd_ship_to_id_nm) return doCnd_ship_to_id_nm_VC(info);
		if (vc == Cnd_dlv_id_typ) return doCnd_dlv_id_typ_VC(info);
		if (vc == Cnd_dlv_id_typ_nm) return doCnd_dlv_id_typ_nm_VC(info);
		if (vc == Cnd_dlv_id_cd) return doCnd_dlv_id_cd_VC(info);
		if (vc == Cnd_dlv_id_nm) return doCnd_dlv_id_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_via_dlv_typ) return doCnd_via_dlv_typ_VC(info);
		if (vc == Cnd_via_dlv_typ_nm) return doCnd_via_dlv_typ_nm_VC(info);
		if (vc == Cnd_ship_term_cd) return doCnd_ship_term_cd_VC(info);
		if (vc == Cnd_ship_term_nm) return doCnd_ship_term_nm_VC(info);
		if (vc == Cnd_ship_wk_cd) return doCnd_ship_wk_cd_VC(info);
		if (vc == Cnd_ship_wk_nm) return doCnd_ship_wk_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_rqst_usr_cd) return doCnd_rqst_usr_cd_VC(info);
		if (vc == Cnd_rqst_usr_nm) return doCnd_rqst_usr_nm_VC(info);
		if (vc == Cnd_rqst_dpt_cd) return doCnd_rqst_dpt_cd_VC(info);
		if (vc == Cnd_rqst_dpt_nm) return doCnd_rqst_dpt_nm_VC(info);
		if (vc == Cnd_ship_inst_typ) return doCnd_ship_inst_typ_VC(info);
		if (vc == Cnd_ship_inst_typ_nm) return doCnd_ship_inst_typ_nm_VC(info);
		if (vc == Cnd_ship_schd_no) return doCnd_ship_schd_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == Cnd_xfr_schd_no) return doCnd_xfr_schd_no_VC(info);
		if (vc == Cnd_ship_inst_no) return doCnd_ship_inst_no_VC(info);
		if (vc == Cnd_ship_inst_d_no) return doCnd_ship_inst_d_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_abort_flg) return doCnd_abort_flg_VC(info);
		if (vc == Cnd_ship_cnt_rmrks) return doCnd_ship_cnt_rmrks_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_trd_d_rmrks) return doCnd_trd_d_rmrks_VC(info);
		if (vc == BulkSet_ship_wk_cd) return doBulkSet_ship_wk_cd_VC(info);
		if (vc == BulkSet_ship_wk_nm) return doBulkSet_ship_wk_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_pr_sts_typ) return doRslt_pr_sts_typ_VC(info);
		if (vc == columnRslt_pr_sts_typ_nm) return doRslt_pr_sts_typ_nm_VC(info);
		if (vc == columnRslt_alloc_sts_typ) return doRslt_alloc_sts_typ_VC(info);
		if (vc == columnRslt_alloc_sts_typ_nm) return doRslt_alloc_sts_typ_nm_VC(info);
		if (vc == columnRslt_ship_block_flg) return doRslt_ship_block_flg_VC(info);
		if (vc == columnRslt_ship_abl_flg) return doRslt_ship_abl_flg_VC(info);
		if (vc == columnRslt_fix_flg) return doRslt_fix_flg_VC(info);
		if (vc == columnRslt_dlv_day_week_typ) return doRslt_dlv_day_week_typ_VC(info);
		if (vc == columnRslt_dlv_day_week_typ_nm) return doRslt_dlv_day_week_typ_nm_VC(info);
		if (vc == columnRslt_no_calc_flg) return doRslt_no_calc_flg_VC(info);
		if (vc == columnRslt_ship_schd_time) return doRslt_ship_schd_time_VC(info);
		if (vc == columnRslt_cl_time_chk_flg) return doRslt_cl_time_chk_flg_VC(info);
		if (vc == columnRslt_ship_dt_chk_flg) return doRslt_ship_dt_chk_flg_VC(info);
		if (vc == columnRslt_ship_term_cd) return doRslt_ship_term_cd_VC(info);
		if (vc == columnRslt_ship_term_nm) return doRslt_ship_term_nm_VC(info);
		if (vc == columnRslt_ship_wk_grp_cd) return doRslt_ship_wk_grp_cd_VC(info);
		if (vc == columnRslt_ship_wk_grp_nm) return doRslt_ship_wk_grp_nm_VC(info);
		if (vc == columnRslt_ship_wk_cd) return doRslt_ship_wk_cd_VC(info);
		if (vc == columnRslt_ship_wk_nm) return doRslt_ship_wk_nm_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_cd) return doRslt_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_nm) return doRslt_ship_fr_lg_grp_nm_VC(info);
		if (vc == columnRslt_ship_to_lg_grp_cd) return doRslt_ship_to_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_to_lg_grp_nm) return doRslt_ship_to_lg_grp_nm_VC(info);
		if (vc == columnRslt_ship_to_id_typ) return doRslt_ship_to_id_typ_VC(info);
		if (vc == columnRslt_ship_to_id_typ_nm) return doRslt_ship_to_id_typ_nm_VC(info);
		if (vc == columnRslt_ship_to_id_cd) return doRslt_ship_to_id_cd_VC(info);
		if (vc == columnRslt_ship_to_id_nm) return doRslt_ship_to_id_nm_VC(info);
		if (vc == columnRslt_ship_to_sundry_flg) return doRslt_ship_to_sundry_flg_VC(info);
		if (vc == columnRslt_via_dlv_typ) return doRslt_via_dlv_typ_VC(info);
		if (vc == columnRslt_via_dlv_typ_nm) return doRslt_via_dlv_typ_nm_VC(info);
		if (vc == columnRslt_dlv_id_typ) return doRslt_dlv_id_typ_VC(info);
		if (vc == columnRslt_dlv_id_typ_nm) return doRslt_dlv_id_typ_nm_VC(info);
		if (vc == columnRslt_dlv_id_cd) return doRslt_dlv_id_cd_VC(info);
		if (vc == columnRslt_dlv_id_nm) return doRslt_dlv_id_nm_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_rqst_usr_cd) return doRslt_rqst_usr_cd_VC(info);
		if (vc == columnRslt_rqst_usr_nm) return doRslt_rqst_usr_nm_VC(info);
		if (vc == columnRslt_rqst_dpt_cd) return doRslt_rqst_dpt_cd_VC(info);
		if (vc == columnRslt_rqst_dpt_nm) return doRslt_rqst_dpt_nm_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_stk_mng_typ) return doRslt_stk_mng_typ_VC(info);
		if (vc == columnRslt_dscnt_itm_flg) return doRslt_dscnt_itm_flg_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_conv_base_qty) return doRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_trd_unit_conv_qty) return doRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt_alloc_ent_unit_cd) return doRslt_alloc_ent_unit_cd_VC(info);
		if (vc == columnRslt_alloc_ent_unit_nm) return doRslt_alloc_ent_unit_nm_VC(info);
		if (vc == columnRslt_alloc_ent_unit_dec_place) return doRslt_alloc_ent_unit_dec_place_VC(info);
		if (vc == columnRslt_alloc_ent_unit_conv_base_qty) return doRslt_alloc_ent_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_alloc_ent_unit_conv_qty) return doRslt_alloc_ent_unit_conv_qty_VC(info);
		if (vc == columnRslt_alloc_ent_unit_rnd_typ) return doRslt_alloc_ent_unit_rnd_typ_VC(info);
		if (vc == columnRslt_abort_flg) return doRslt_abort_flg_VC(info);
		if (vc == columnRslt_div_flg) return doRslt_div_flg_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_conv_base_qty) return doRslt_base_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_base_unit_conv_qty) return doRslt_base_unit_conv_qty_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_wt) return doRslt_wt_VC(info);
		if (vc == columnRslt_dim) return doRslt_dim_VC(info);
		if (vc == columnRslt_alloc_flg) return doRslt_alloc_flg_VC(info);
		if (vc == columnRslt_grp_alloc_flg) return doRslt_grp_alloc_flg_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_tgt_flg) return doRslt_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt_lot_none_flg) return doRslt_lot_none_flg_VC(info);
		if (vc == columnRslt_lot_mng_typ) return doRslt_lot_mng_typ_VC(info);
		if (vc == columnRslt_lot_no_typ) return doRslt_lot_no_typ_VC(info);
		if (vc == columnRslt_sublot_mng_typ) return doRslt_sublot_mng_typ_VC(info);
		if (vc == columnRslt_sublot_no_typ) return doRslt_sublot_no_typ_VC(info);
		if (vc == columnRslt_ver_flg) return doRslt_ver_flg_VC(info);
		if (vc == columnRslt_not_lot_mix_flg) return doRslt_not_lot_mix_flg_VC(info);
		if (vc == columnRslt_not_sublot_mix_flg) return doRslt_not_sublot_mix_flg_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_stk_bp_nm) return doRslt_stk_bp_nm_VC(info);
		if (vc == columnRslt_alloc_grp_cd) return doRslt_alloc_grp_cd_VC(info);
		if (vc == columnRslt_alloc_grp_nm) return doRslt_alloc_grp_nm_VC(info);
		if (vc == columnRslt_def_loc_cd) return doRslt_def_loc_cd_VC(info);
		if (vc == columnRslt_def_loc_nm) return doRslt_def_loc_nm_VC(info);
		if (vc == columnRslt_ship_loc_prio_flg) return doRslt_ship_loc_prio_flg_VC(info);
		if (vc == columnRslt_assort_typ) return doRslt_assort_typ_VC(info);
		if (vc == columnRslt_assort_typ_nm) return doRslt_assort_typ_nm_VC(info);
		if (vc == columnRslt_set_itm_grp_no) return doRslt_set_itm_grp_no_VC(info);
		if (vc == columnRslt_assort_sts_mark) return doRslt_assort_sts_mark_VC(info);
		if (vc == columnRslt_alloc_typ) return doRslt_alloc_typ_VC(info);
		if (vc == columnRslt_alloc_typ_nm) return doRslt_alloc_typ_nm_VC(info);
		if (vc == columnRslt_base_dlv_slip_no) return doRslt_base_dlv_slip_no_VC(info);
		if (vc == columnRslt_base_prov_act_no) return doRslt_base_prov_act_no_VC(info);
		if (vc == columnRslt_base_ac_dt) return doRslt_base_ac_dt_VC(info);
		if (vc == columnRslt_ship_cnt_rmrks) return doRslt_ship_cnt_rmrks_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_xfr_schd_no) return doRslt_xfr_schd_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_iv_trd_flg) return doRslt_iv_trd_flg_VC(info);
		if (vc == columnRslt_iv_reg_flg) return doRslt_iv_reg_flg_VC(info);
		if (vc == columnRslt_iv_ship_flg) return doRslt_iv_ship_flg_VC(info);
		if (vc == columnRslt_ship_schd_no) return doRslt_ship_schd_no_VC(info);
		if (vc == columnRslt_ship_alloc_sts_no) return doRslt_ship_alloc_sts_no_VC(info);
		if (vc == columnRslt_org_ship_alloc_sts_no) return doRslt_org_ship_alloc_sts_no_VC(info);
		if (vc == columnRslt_ship_inst_no) return doRslt_ship_inst_no_VC(info);
		if (vc == columnRslt_ship_inst_d_no) return doRslt_ship_inst_d_no_VC(info);
		if (vc == columnRslt_ship_inst_typ) return doRslt_ship_inst_typ_VC(info);
		if (vc == columnRslt_ship_pr_no) return doRslt_ship_pr_no_VC(info);
		if (vc == columnRslt_alloc_scope_typ) return doRslt_alloc_scope_typ_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_stk_arrv_bp_cd) return doRslt_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_ship_pr_upd_cntr) return doRslt_ship_pr_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnRslt_lot_peg_no) return doRslt_lot_peg_no_VC(info);
		if (vc == columnRslt_no_alloc_flg) return doRslt_no_alloc_flg_VC(info);
		if (vc == columnRslt_org_fix_flg) return doRslt_org_fix_flg_VC(info);
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
	 * [Cnd]パネルの[md]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_md_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_lot_chk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_lot_chk_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_all_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_block_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_block_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_ship_block_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_ship_block_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pd_inst_dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pd_inst_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alloc_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[via_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_via_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[via_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_via_dlv_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_ship_wk_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_abl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_abl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[no_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_no_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_schd_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_schd_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cl_time_chk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cl_time_chk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dt_chk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dt_chk_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_wk_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_to_lg_grp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_ent_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ent_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ent_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ent_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ent_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ent_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ent_unit_rnd_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[div_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_div_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_conv_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_rnd_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dim_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[grp_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_grp_alloc_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_none_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[def_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_def_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[def_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_def_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_loc_prio_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_loc_prio_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[assort_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_assort_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_assort_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_set_itm_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[assort_sts_mark]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_assort_sts_mark_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xfr_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_trd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_trd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_reg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_reg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_ship_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_alloc_sts_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_alloc_sts_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[org_ship_alloc_sts_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_org_ship_alloc_sts_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_scope_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_cd_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_pr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_pr_upd_cntr_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[no_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_no_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[org_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_org_fix_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_md_Group) doCnd_md_NC(info);
		else if (nc == Cnd_no_lot_chk_flg) doCnd_no_lot_chk_flg_NC(info);
		else if (nc == Cnd_not_inst_flg) doCnd_not_inst_flg_NC(info);
		else if (nc == Cnd_inst_flg) doCnd_inst_flg_NC(info);
		else if (nc == Cnd_not_ship_flg) doCnd_not_ship_flg_NC(info);
		else if (nc == Cnd_part_ship_flg) doCnd_part_ship_flg_NC(info);
		else if (nc == Cnd_ship_flg) doCnd_ship_flg_NC(info);
		else if (nc == Cnd_not_alloc_flg) doCnd_not_alloc_flg_NC(info);
		else if (nc == Cnd_part_alloc_flg) doCnd_part_alloc_flg_NC(info);
		else if (nc == Cnd_all_alloc_flg) doCnd_all_alloc_flg_NC(info);
		else if (nc == Cnd_alloc_invalid_flg) doCnd_alloc_invalid_flg_NC(info);
		else if (nc == Cnd_ship_block_flg) doCnd_ship_block_flg_NC(info);
		else if (nc == Cnd_not_ship_block_flg) doCnd_not_ship_block_flg_NC(info);
		else if (nc == Cnd_dlv_rqst_flg) doCnd_dlv_rqst_flg_NC(info);
		else if (nc == Cnd_ship_rqst_flg) doCnd_ship_rqst_flg_NC(info);
		else if (nc == Cnd_pd_inst_dlv_flg) doCnd_pd_inst_dlv_flg_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NC(info);
		else if (nc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NC(info);
		else if (nc == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_NC(info);
		else if (nc == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_NC(info);
		else if (nc == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_NC(info);
		else if (nc == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_NC(info);
		else if (nc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NC(info);
		else if (nc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NC(info);
		else if (nc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NC(info);
		else if (nc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_via_dlv_typ) doCnd_via_dlv_typ_NC(info);
		else if (nc == Cnd_via_dlv_typ_nm) doCnd_via_dlv_typ_nm_NC(info);
		else if (nc == Cnd_ship_term_cd) doCnd_ship_term_cd_NC(info);
		else if (nc == Cnd_ship_term_nm) doCnd_ship_term_nm_NC(info);
		else if (nc == Cnd_ship_wk_cd) doCnd_ship_wk_cd_NC(info);
		else if (nc == Cnd_ship_wk_nm) doCnd_ship_wk_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_NC(info);
		else if (nc == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_NC(info);
		else if (nc == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_NC(info);
		else if (nc == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_NC(info);
		else if (nc == Cnd_ship_inst_typ) doCnd_ship_inst_typ_NC(info);
		else if (nc == Cnd_ship_inst_typ_nm) doCnd_ship_inst_typ_nm_NC(info);
		else if (nc == Cnd_ship_schd_no) doCnd_ship_schd_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == Cnd_xfr_schd_no) doCnd_xfr_schd_no_NC(info);
		else if (nc == Cnd_ship_inst_no) doCnd_ship_inst_no_NC(info);
		else if (nc == Cnd_ship_inst_d_no) doCnd_ship_inst_d_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_abort_flg) doCnd_abort_flg_NC(info);
		else if (nc == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NC(info);
		else if (nc == BulkSet_ship_wk_cd) doBulkSet_ship_wk_cd_NC(info);
		else if (nc == BulkSet_ship_wk_nm) doBulkSet_ship_wk_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NC(info);
		else if (nc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NC(info);
		else if (nc == columnRslt_alloc_sts_typ) doRslt_alloc_sts_typ_NC(info);
		else if (nc == columnRslt_alloc_sts_typ_nm) doRslt_alloc_sts_typ_nm_NC(info);
		else if (nc == columnRslt_ship_block_flg) doRslt_ship_block_flg_NC(info);
		else if (nc == columnRslt_ship_abl_flg) doRslt_ship_abl_flg_NC(info);
		else if (nc == columnRslt_fix_flg) doRslt_fix_flg_NC(info);
		else if (nc == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_NC(info);
		else if (nc == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_NC(info);
		else if (nc == columnRslt_no_calc_flg) doRslt_no_calc_flg_NC(info);
		else if (nc == columnRslt_ship_schd_time) doRslt_ship_schd_time_NC(info);
		else if (nc == columnRslt_cl_time_chk_flg) doRslt_cl_time_chk_flg_NC(info);
		else if (nc == columnRslt_ship_dt_chk_flg) doRslt_ship_dt_chk_flg_NC(info);
		else if (nc == columnRslt_ship_term_cd) doRslt_ship_term_cd_NC(info);
		else if (nc == columnRslt_ship_term_nm) doRslt_ship_term_nm_NC(info);
		else if (nc == columnRslt_ship_wk_grp_cd) doRslt_ship_wk_grp_cd_NC(info);
		else if (nc == columnRslt_ship_wk_grp_nm) doRslt_ship_wk_grp_nm_NC(info);
		else if (nc == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_NC(info);
		else if (nc == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NC(info);
		else if (nc == columnRslt_ship_to_lg_grp_cd) doRslt_ship_to_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_to_lg_grp_nm) doRslt_ship_to_lg_grp_nm_NC(info);
		else if (nc == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NC(info);
		else if (nc == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NC(info);
		else if (nc == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_NC(info);
		else if (nc == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_NC(info);
		else if (nc == columnRslt_ship_to_sundry_flg) doRslt_ship_to_sundry_flg_NC(info);
		else if (nc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NC(info);
		else if (nc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NC(info);
		else if (nc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NC(info);
		else if (nc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NC(info);
		else if (nc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NC(info);
		else if (nc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NC(info);
		else if (nc == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NC(info);
		else if (nc == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NC(info);
		else if (nc == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NC(info);
		else if (nc == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt_alloc_ent_unit_cd) doRslt_alloc_ent_unit_cd_NC(info);
		else if (nc == columnRslt_alloc_ent_unit_nm) doRslt_alloc_ent_unit_nm_NC(info);
		else if (nc == columnRslt_alloc_ent_unit_dec_place) doRslt_alloc_ent_unit_dec_place_NC(info);
		else if (nc == columnRslt_alloc_ent_unit_conv_base_qty) doRslt_alloc_ent_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_alloc_ent_unit_conv_qty) doRslt_alloc_ent_unit_conv_qty_NC(info);
		else if (nc == columnRslt_alloc_ent_unit_rnd_typ) doRslt_alloc_ent_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_abort_flg) doRslt_abort_flg_NC(info);
		else if (nc == columnRslt_div_flg) doRslt_div_flg_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_conv_base_qty) doRslt_base_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_base_unit_conv_qty) doRslt_base_unit_conv_qty_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_wt) doRslt_wt_NC(info);
		else if (nc == columnRslt_dim) doRslt_dim_NC(info);
		else if (nc == columnRslt_alloc_flg) doRslt_alloc_flg_NC(info);
		else if (nc == columnRslt_grp_alloc_flg) doRslt_grp_alloc_flg_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt_lot_none_flg) doRslt_lot_none_flg_NC(info);
		else if (nc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NC(info);
		else if (nc == columnRslt_lot_no_typ) doRslt_lot_no_typ_NC(info);
		else if (nc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_NC(info);
		else if (nc == columnRslt_ver_flg) doRslt_ver_flg_NC(info);
		else if (nc == columnRslt_not_lot_mix_flg) doRslt_not_lot_mix_flg_NC(info);
		else if (nc == columnRslt_not_sublot_mix_flg) doRslt_not_sublot_mix_flg_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NC(info);
		else if (nc == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NC(info);
		else if (nc == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NC(info);
		else if (nc == columnRslt_def_loc_cd) doRslt_def_loc_cd_NC(info);
		else if (nc == columnRslt_def_loc_nm) doRslt_def_loc_nm_NC(info);
		else if (nc == columnRslt_ship_loc_prio_flg) doRslt_ship_loc_prio_flg_NC(info);
		else if (nc == columnRslt_assort_typ) doRslt_assort_typ_NC(info);
		else if (nc == columnRslt_assort_typ_nm) doRslt_assort_typ_nm_NC(info);
		else if (nc == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_NC(info);
		else if (nc == columnRslt_assort_sts_mark) doRslt_assort_sts_mark_NC(info);
		else if (nc == columnRslt_alloc_typ) doRslt_alloc_typ_NC(info);
		else if (nc == columnRslt_alloc_typ_nm) doRslt_alloc_typ_nm_NC(info);
		else if (nc == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NC(info);
		else if (nc == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NC(info);
		else if (nc == columnRslt_base_ac_dt) doRslt_base_ac_dt_NC(info);
		else if (nc == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_iv_trd_flg) doRslt_iv_trd_flg_NC(info);
		else if (nc == columnRslt_iv_reg_flg) doRslt_iv_reg_flg_NC(info);
		else if (nc == columnRslt_iv_ship_flg) doRslt_iv_ship_flg_NC(info);
		else if (nc == columnRslt_ship_schd_no) doRslt_ship_schd_no_NC(info);
		else if (nc == columnRslt_ship_alloc_sts_no) doRslt_ship_alloc_sts_no_NC(info);
		else if (nc == columnRslt_org_ship_alloc_sts_no) doRslt_org_ship_alloc_sts_no_NC(info);
		else if (nc == columnRslt_ship_inst_no) doRslt_ship_inst_no_NC(info);
		else if (nc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NC(info);
		else if (nc == columnRslt_ship_inst_typ) doRslt_ship_inst_typ_NC(info);
		else if (nc == columnRslt_ship_pr_no) doRslt_ship_pr_no_NC(info);
		else if (nc == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnRslt_lot_peg_no) doRslt_lot_peg_no_NC(info);
		else if (nc == columnRslt_no_alloc_flg) doRslt_no_alloc_flg_NC(info);
		else if (nc == columnRslt_org_fix_flg) doRslt_org_fix_flg_NC(info);
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
	 * [Cnd]パネルの[md]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_md_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_lot_chk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_lot_chk_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_block_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_block_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_block_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_block_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pd_inst_dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pd_inst_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[via_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_dlv_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ship_wk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_block_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_block_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_abl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_abl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_time_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cl_time_chk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cl_time_chk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dt_chk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dt_chk_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_ent_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_qty_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dim_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_alloc_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_prio_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_prio_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_sts_mark]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_sts_mark_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_trd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_trd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_reg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_reg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_alloc_sts_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_alloc_sts_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_ship_alloc_sts_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_ship_alloc_sts_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_fix_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_md_Group) doCnd_md_NE(info);
		else if (ne == Cnd_no_lot_chk_flg) doCnd_no_lot_chk_flg_NE(info);
		else if (ne == Cnd_not_inst_flg) doCnd_not_inst_flg_NE(info);
		else if (ne == Cnd_inst_flg) doCnd_inst_flg_NE(info);
		else if (ne == Cnd_not_ship_flg) doCnd_not_ship_flg_NE(info);
		else if (ne == Cnd_part_ship_flg) doCnd_part_ship_flg_NE(info);
		else if (ne == Cnd_ship_flg) doCnd_ship_flg_NE(info);
		else if (ne == Cnd_not_alloc_flg) doCnd_not_alloc_flg_NE(info);
		else if (ne == Cnd_part_alloc_flg) doCnd_part_alloc_flg_NE(info);
		else if (ne == Cnd_all_alloc_flg) doCnd_all_alloc_flg_NE(info);
		else if (ne == Cnd_alloc_invalid_flg) doCnd_alloc_invalid_flg_NE(info);
		else if (ne == Cnd_ship_block_flg) doCnd_ship_block_flg_NE(info);
		else if (ne == Cnd_not_ship_block_flg) doCnd_not_ship_block_flg_NE(info);
		else if (ne == Cnd_dlv_rqst_flg) doCnd_dlv_rqst_flg_NE(info);
		else if (ne == Cnd_ship_rqst_flg) doCnd_ship_rqst_flg_NE(info);
		else if (ne == Cnd_pd_inst_dlv_flg) doCnd_pd_inst_dlv_flg_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NE(info);
		else if (ne == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NE(info);
		else if (ne == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_NE(info);
		else if (ne == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_NE(info);
		else if (ne == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_NE(info);
		else if (ne == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_NE(info);
		else if (ne == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NE(info);
		else if (ne == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NE(info);
		else if (ne == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NE(info);
		else if (ne == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_via_dlv_typ) doCnd_via_dlv_typ_NE(info);
		else if (ne == Cnd_via_dlv_typ_nm) doCnd_via_dlv_typ_nm_NE(info);
		else if (ne == Cnd_ship_term_cd) doCnd_ship_term_cd_NE(info);
		else if (ne == Cnd_ship_term_nm) doCnd_ship_term_nm_NE(info);
		else if (ne == Cnd_ship_wk_cd) doCnd_ship_wk_cd_NE(info);
		else if (ne == Cnd_ship_wk_nm) doCnd_ship_wk_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_NE(info);
		else if (ne == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_NE(info);
		else if (ne == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_NE(info);
		else if (ne == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_NE(info);
		else if (ne == Cnd_ship_inst_typ) doCnd_ship_inst_typ_NE(info);
		else if (ne == Cnd_ship_inst_typ_nm) doCnd_ship_inst_typ_nm_NE(info);
		else if (ne == Cnd_ship_schd_no) doCnd_ship_schd_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == Cnd_xfr_schd_no) doCnd_xfr_schd_no_NE(info);
		else if (ne == Cnd_ship_inst_no) doCnd_ship_inst_no_NE(info);
		else if (ne == Cnd_ship_inst_d_no) doCnd_ship_inst_d_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_abort_flg) doCnd_abort_flg_NE(info);
		else if (ne == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NE(info);
		else if (ne == BulkSet_ship_wk_cd) doBulkSet_ship_wk_cd_NE(info);
		else if (ne == BulkSet_ship_wk_nm) doBulkSet_ship_wk_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NE(info);
		else if (ne == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NE(info);
		else if (ne == columnRslt_alloc_sts_typ) doRslt_alloc_sts_typ_NE(info);
		else if (ne == columnRslt_alloc_sts_typ_nm) doRslt_alloc_sts_typ_nm_NE(info);
		else if (ne == columnRslt_ship_block_flg) doRslt_ship_block_flg_NE(info);
		else if (ne == columnRslt_ship_abl_flg) doRslt_ship_abl_flg_NE(info);
		else if (ne == columnRslt_fix_flg) doRslt_fix_flg_NE(info);
		else if (ne == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_NE(info);
		else if (ne == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_NE(info);
		else if (ne == columnRslt_no_calc_flg) doRslt_no_calc_flg_NE(info);
		else if (ne == columnRslt_ship_schd_time) doRslt_ship_schd_time_NE(info);
		else if (ne == columnRslt_cl_time_chk_flg) doRslt_cl_time_chk_flg_NE(info);
		else if (ne == columnRslt_ship_dt_chk_flg) doRslt_ship_dt_chk_flg_NE(info);
		else if (ne == columnRslt_ship_term_cd) doRslt_ship_term_cd_NE(info);
		else if (ne == columnRslt_ship_term_nm) doRslt_ship_term_nm_NE(info);
		else if (ne == columnRslt_ship_wk_grp_cd) doRslt_ship_wk_grp_cd_NE(info);
		else if (ne == columnRslt_ship_wk_grp_nm) doRslt_ship_wk_grp_nm_NE(info);
		else if (ne == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_NE(info);
		else if (ne == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NE(info);
		else if (ne == columnRslt_ship_to_lg_grp_cd) doRslt_ship_to_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_to_lg_grp_nm) doRslt_ship_to_lg_grp_nm_NE(info);
		else if (ne == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NE(info);
		else if (ne == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NE(info);
		else if (ne == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_NE(info);
		else if (ne == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_NE(info);
		else if (ne == columnRslt_ship_to_sundry_flg) doRslt_ship_to_sundry_flg_NE(info);
		else if (ne == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NE(info);
		else if (ne == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NE(info);
		else if (ne == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NE(info);
		else if (ne == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NE(info);
		else if (ne == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NE(info);
		else if (ne == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NE(info);
		else if (ne == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NE(info);
		else if (ne == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NE(info);
		else if (ne == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NE(info);
		else if (ne == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt_alloc_ent_unit_cd) doRslt_alloc_ent_unit_cd_NE(info);
		else if (ne == columnRslt_alloc_ent_unit_nm) doRslt_alloc_ent_unit_nm_NE(info);
		else if (ne == columnRslt_alloc_ent_unit_dec_place) doRslt_alloc_ent_unit_dec_place_NE(info);
		else if (ne == columnRslt_alloc_ent_unit_conv_base_qty) doRslt_alloc_ent_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_alloc_ent_unit_conv_qty) doRslt_alloc_ent_unit_conv_qty_NE(info);
		else if (ne == columnRslt_alloc_ent_unit_rnd_typ) doRslt_alloc_ent_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_abort_flg) doRslt_abort_flg_NE(info);
		else if (ne == columnRslt_div_flg) doRslt_div_flg_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_conv_base_qty) doRslt_base_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_base_unit_conv_qty) doRslt_base_unit_conv_qty_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_wt) doRslt_wt_NE(info);
		else if (ne == columnRslt_dim) doRslt_dim_NE(info);
		else if (ne == columnRslt_alloc_flg) doRslt_alloc_flg_NE(info);
		else if (ne == columnRslt_grp_alloc_flg) doRslt_grp_alloc_flg_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt_lot_none_flg) doRslt_lot_none_flg_NE(info);
		else if (ne == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NE(info);
		else if (ne == columnRslt_lot_no_typ) doRslt_lot_no_typ_NE(info);
		else if (ne == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_NE(info);
		else if (ne == columnRslt_ver_flg) doRslt_ver_flg_NE(info);
		else if (ne == columnRslt_not_lot_mix_flg) doRslt_not_lot_mix_flg_NE(info);
		else if (ne == columnRslt_not_sublot_mix_flg) doRslt_not_sublot_mix_flg_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NE(info);
		else if (ne == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NE(info);
		else if (ne == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NE(info);
		else if (ne == columnRslt_def_loc_cd) doRslt_def_loc_cd_NE(info);
		else if (ne == columnRslt_def_loc_nm) doRslt_def_loc_nm_NE(info);
		else if (ne == columnRslt_ship_loc_prio_flg) doRslt_ship_loc_prio_flg_NE(info);
		else if (ne == columnRslt_assort_typ) doRslt_assort_typ_NE(info);
		else if (ne == columnRslt_assort_typ_nm) doRslt_assort_typ_nm_NE(info);
		else if (ne == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_NE(info);
		else if (ne == columnRslt_assort_sts_mark) doRslt_assort_sts_mark_NE(info);
		else if (ne == columnRslt_alloc_typ) doRslt_alloc_typ_NE(info);
		else if (ne == columnRslt_alloc_typ_nm) doRslt_alloc_typ_nm_NE(info);
		else if (ne == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NE(info);
		else if (ne == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NE(info);
		else if (ne == columnRslt_base_ac_dt) doRslt_base_ac_dt_NE(info);
		else if (ne == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_iv_trd_flg) doRslt_iv_trd_flg_NE(info);
		else if (ne == columnRslt_iv_reg_flg) doRslt_iv_reg_flg_NE(info);
		else if (ne == columnRslt_iv_ship_flg) doRslt_iv_ship_flg_NE(info);
		else if (ne == columnRslt_ship_schd_no) doRslt_ship_schd_no_NE(info);
		else if (ne == columnRslt_ship_alloc_sts_no) doRslt_ship_alloc_sts_no_NE(info);
		else if (ne == columnRslt_org_ship_alloc_sts_no) doRslt_org_ship_alloc_sts_no_NE(info);
		else if (ne == columnRslt_ship_inst_no) doRslt_ship_inst_no_NE(info);
		else if (ne == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NE(info);
		else if (ne == columnRslt_ship_inst_typ) doRslt_ship_inst_typ_NE(info);
		else if (ne == columnRslt_ship_pr_no) doRslt_ship_pr_no_NE(info);
		else if (ne == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnRslt_lot_peg_no) doRslt_lot_peg_no_NE(info);
		else if (ne == columnRslt_no_alloc_flg) doRslt_no_alloc_flg_NE(info);
		else if (ne == columnRslt_org_fix_flg) doRslt_org_fix_flg_NE(info);
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
	 * [Cnd]パネルの[md]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_md_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_lot_chk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_lot_chk_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[not_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_block_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_block_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_block_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_block_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pd_inst_dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pd_inst_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[via_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_dlv_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ship_wk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_block_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_block_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_abl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_abl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_time_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cl_time_chk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cl_time_chk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dt_chk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dt_chk_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_ent_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_qty_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dim_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_alloc_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_prio_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_prio_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_sts_mark]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_sts_mark_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_trd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_trd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_reg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_reg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_alloc_sts_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_alloc_sts_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_ship_alloc_sts_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_ship_alloc_sts_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_fix_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_md_Group) doCnd_md_NX(info);
		else if (nx == Cnd_no_lot_chk_flg) doCnd_no_lot_chk_flg_NX(info);
		else if (nx == Cnd_not_inst_flg) doCnd_not_inst_flg_NX(info);
		else if (nx == Cnd_inst_flg) doCnd_inst_flg_NX(info);
		else if (nx == Cnd_not_ship_flg) doCnd_not_ship_flg_NX(info);
		else if (nx == Cnd_part_ship_flg) doCnd_part_ship_flg_NX(info);
		else if (nx == Cnd_ship_flg) doCnd_ship_flg_NX(info);
		else if (nx == Cnd_not_alloc_flg) doCnd_not_alloc_flg_NX(info);
		else if (nx == Cnd_part_alloc_flg) doCnd_part_alloc_flg_NX(info);
		else if (nx == Cnd_all_alloc_flg) doCnd_all_alloc_flg_NX(info);
		else if (nx == Cnd_alloc_invalid_flg) doCnd_alloc_invalid_flg_NX(info);
		else if (nx == Cnd_ship_block_flg) doCnd_ship_block_flg_NX(info);
		else if (nx == Cnd_not_ship_block_flg) doCnd_not_ship_block_flg_NX(info);
		else if (nx == Cnd_dlv_rqst_flg) doCnd_dlv_rqst_flg_NX(info);
		else if (nx == Cnd_ship_rqst_flg) doCnd_ship_rqst_flg_NX(info);
		else if (nx == Cnd_pd_inst_dlv_flg) doCnd_pd_inst_dlv_flg_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_NX(info);
		else if (nx == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_NX(info);
		else if (nx == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_NX(info);
		else if (nx == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_NX(info);
		else if (nx == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_NX(info);
		else if (nx == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_NX(info);
		else if (nx == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NX(info);
		else if (nx == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NX(info);
		else if (nx == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NX(info);
		else if (nx == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_via_dlv_typ) doCnd_via_dlv_typ_NX(info);
		else if (nx == Cnd_via_dlv_typ_nm) doCnd_via_dlv_typ_nm_NX(info);
		else if (nx == Cnd_ship_term_cd) doCnd_ship_term_cd_NX(info);
		else if (nx == Cnd_ship_term_nm) doCnd_ship_term_nm_NX(info);
		else if (nx == Cnd_ship_wk_cd) doCnd_ship_wk_cd_NX(info);
		else if (nx == Cnd_ship_wk_nm) doCnd_ship_wk_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_NX(info);
		else if (nx == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_NX(info);
		else if (nx == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_NX(info);
		else if (nx == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_NX(info);
		else if (nx == Cnd_ship_inst_typ) doCnd_ship_inst_typ_NX(info);
		else if (nx == Cnd_ship_inst_typ_nm) doCnd_ship_inst_typ_nm_NX(info);
		else if (nx == Cnd_ship_schd_no) doCnd_ship_schd_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == Cnd_xfr_schd_no) doCnd_xfr_schd_no_NX(info);
		else if (nx == Cnd_ship_inst_no) doCnd_ship_inst_no_NX(info);
		else if (nx == Cnd_ship_inst_d_no) doCnd_ship_inst_d_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_abort_flg) doCnd_abort_flg_NX(info);
		else if (nx == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NX(info);
		else if (nx == BulkSet_ship_wk_cd) doBulkSet_ship_wk_cd_NX(info);
		else if (nx == BulkSet_ship_wk_nm) doBulkSet_ship_wk_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NX(info);
		else if (nx == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NX(info);
		else if (nx == columnRslt_alloc_sts_typ) doRslt_alloc_sts_typ_NX(info);
		else if (nx == columnRslt_alloc_sts_typ_nm) doRslt_alloc_sts_typ_nm_NX(info);
		else if (nx == columnRslt_ship_block_flg) doRslt_ship_block_flg_NX(info);
		else if (nx == columnRslt_ship_abl_flg) doRslt_ship_abl_flg_NX(info);
		else if (nx == columnRslt_fix_flg) doRslt_fix_flg_NX(info);
		else if (nx == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_NX(info);
		else if (nx == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_NX(info);
		else if (nx == columnRslt_no_calc_flg) doRslt_no_calc_flg_NX(info);
		else if (nx == columnRslt_ship_schd_time) doRslt_ship_schd_time_NX(info);
		else if (nx == columnRslt_cl_time_chk_flg) doRslt_cl_time_chk_flg_NX(info);
		else if (nx == columnRslt_ship_dt_chk_flg) doRslt_ship_dt_chk_flg_NX(info);
		else if (nx == columnRslt_ship_term_cd) doRslt_ship_term_cd_NX(info);
		else if (nx == columnRslt_ship_term_nm) doRslt_ship_term_nm_NX(info);
		else if (nx == columnRslt_ship_wk_grp_cd) doRslt_ship_wk_grp_cd_NX(info);
		else if (nx == columnRslt_ship_wk_grp_nm) doRslt_ship_wk_grp_nm_NX(info);
		else if (nx == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_NX(info);
		else if (nx == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NX(info);
		else if (nx == columnRslt_ship_to_lg_grp_cd) doRslt_ship_to_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_to_lg_grp_nm) doRslt_ship_to_lg_grp_nm_NX(info);
		else if (nx == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_NX(info);
		else if (nx == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_NX(info);
		else if (nx == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_NX(info);
		else if (nx == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_NX(info);
		else if (nx == columnRslt_ship_to_sundry_flg) doRslt_ship_to_sundry_flg_NX(info);
		else if (nx == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NX(info);
		else if (nx == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NX(info);
		else if (nx == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NX(info);
		else if (nx == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NX(info);
		else if (nx == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NX(info);
		else if (nx == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NX(info);
		else if (nx == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NX(info);
		else if (nx == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NX(info);
		else if (nx == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NX(info);
		else if (nx == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt_alloc_ent_unit_cd) doRslt_alloc_ent_unit_cd_NX(info);
		else if (nx == columnRslt_alloc_ent_unit_nm) doRslt_alloc_ent_unit_nm_NX(info);
		else if (nx == columnRslt_alloc_ent_unit_dec_place) doRslt_alloc_ent_unit_dec_place_NX(info);
		else if (nx == columnRslt_alloc_ent_unit_conv_base_qty) doRslt_alloc_ent_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_alloc_ent_unit_conv_qty) doRslt_alloc_ent_unit_conv_qty_NX(info);
		else if (nx == columnRslt_alloc_ent_unit_rnd_typ) doRslt_alloc_ent_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_abort_flg) doRslt_abort_flg_NX(info);
		else if (nx == columnRslt_div_flg) doRslt_div_flg_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_conv_base_qty) doRslt_base_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_base_unit_conv_qty) doRslt_base_unit_conv_qty_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_wt) doRslt_wt_NX(info);
		else if (nx == columnRslt_dim) doRslt_dim_NX(info);
		else if (nx == columnRslt_alloc_flg) doRslt_alloc_flg_NX(info);
		else if (nx == columnRslt_grp_alloc_flg) doRslt_grp_alloc_flg_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt_lot_none_flg) doRslt_lot_none_flg_NX(info);
		else if (nx == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NX(info);
		else if (nx == columnRslt_lot_no_typ) doRslt_lot_no_typ_NX(info);
		else if (nx == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_NX(info);
		else if (nx == columnRslt_ver_flg) doRslt_ver_flg_NX(info);
		else if (nx == columnRslt_not_lot_mix_flg) doRslt_not_lot_mix_flg_NX(info);
		else if (nx == columnRslt_not_sublot_mix_flg) doRslt_not_sublot_mix_flg_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NX(info);
		else if (nx == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_NX(info);
		else if (nx == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_NX(info);
		else if (nx == columnRslt_def_loc_cd) doRslt_def_loc_cd_NX(info);
		else if (nx == columnRslt_def_loc_nm) doRslt_def_loc_nm_NX(info);
		else if (nx == columnRslt_ship_loc_prio_flg) doRslt_ship_loc_prio_flg_NX(info);
		else if (nx == columnRslt_assort_typ) doRslt_assort_typ_NX(info);
		else if (nx == columnRslt_assort_typ_nm) doRslt_assort_typ_nm_NX(info);
		else if (nx == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_NX(info);
		else if (nx == columnRslt_assort_sts_mark) doRslt_assort_sts_mark_NX(info);
		else if (nx == columnRslt_alloc_typ) doRslt_alloc_typ_NX(info);
		else if (nx == columnRslt_alloc_typ_nm) doRslt_alloc_typ_nm_NX(info);
		else if (nx == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_NX(info);
		else if (nx == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_NX(info);
		else if (nx == columnRslt_base_ac_dt) doRslt_base_ac_dt_NX(info);
		else if (nx == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_iv_trd_flg) doRslt_iv_trd_flg_NX(info);
		else if (nx == columnRslt_iv_reg_flg) doRslt_iv_reg_flg_NX(info);
		else if (nx == columnRslt_iv_ship_flg) doRslt_iv_ship_flg_NX(info);
		else if (nx == columnRslt_ship_schd_no) doRslt_ship_schd_no_NX(info);
		else if (nx == columnRslt_ship_alloc_sts_no) doRslt_ship_alloc_sts_no_NX(info);
		else if (nx == columnRslt_org_ship_alloc_sts_no) doRslt_org_ship_alloc_sts_no_NX(info);
		else if (nx == columnRslt_ship_inst_no) doRslt_ship_inst_no_NX(info);
		else if (nx == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NX(info);
		else if (nx == columnRslt_ship_inst_typ) doRslt_ship_inst_typ_NX(info);
		else if (nx == columnRslt_ship_pr_no) doRslt_ship_pr_no_NX(info);
		else if (nx == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnRslt_lot_peg_no) doRslt_lot_peg_no_NX(info);
		else if (nx == columnRslt_no_alloc_flg) doRslt_no_alloc_flg_NX(info);
		else if (nx == columnRslt_org_fix_flg) doRslt_org_fix_flg_NX(info);
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
	 * [Cnd]パネルの[md]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_md_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_lot_chk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_lot_chk_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[not_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_block_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_block_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ship_block_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_block_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pd_inst_dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pd_inst_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[via_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_dlv_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ship_wk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_block_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_block_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_abl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_abl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_time_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cl_time_chk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cl_time_chk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dt_chk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dt_chk_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_ent_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_qty_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dim_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[grp_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_grp_alloc_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_loc_prio_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_loc_prio_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_sts_mark]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_sts_mark_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_trd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_trd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_reg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_reg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_alloc_sts_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_alloc_sts_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_ship_alloc_sts_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_ship_alloc_sts_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[no_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_no_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_alloc_grp_cd) doCnd_alloc_grp_cd_LC(info);
		else if (lc == Cnd_alloc_grp_nm) doCnd_alloc_grp_nm_LC(info);
		else if (lc == Cnd_ship_to_id_typ) doCnd_ship_to_id_typ_LC(info);
		else if (lc == Cnd_ship_to_id_typ_nm) doCnd_ship_to_id_typ_nm_LC(info);
		else if (lc == Cnd_ship_to_id_cd) doCnd_ship_to_id_cd_LC(info);
		else if (lc == Cnd_ship_to_id_nm) doCnd_ship_to_id_nm_LC(info);
		else if (lc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_LC(info);
		else if (lc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_LC(info);
		else if (lc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_LC(info);
		else if (lc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_via_dlv_typ) doCnd_via_dlv_typ_LC(info);
		else if (lc == Cnd_via_dlv_typ_nm) doCnd_via_dlv_typ_nm_LC(info);
		else if (lc == Cnd_ship_term_cd) doCnd_ship_term_cd_LC(info);
		else if (lc == Cnd_ship_term_nm) doCnd_ship_term_nm_LC(info);
		else if (lc == Cnd_ship_wk_cd) doCnd_ship_wk_cd_LC(info);
		else if (lc == Cnd_ship_wk_nm) doCnd_ship_wk_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_LC(info);
		else if (lc == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_LC(info);
		else if (lc == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_LC(info);
		else if (lc == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_LC(info);
		else if (lc == Cnd_ship_inst_typ) doCnd_ship_inst_typ_LC(info);
		else if (lc == Cnd_ship_inst_typ_nm) doCnd_ship_inst_typ_nm_LC(info);
		else if (lc == Cnd_ship_schd_no) doCnd_ship_schd_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == Cnd_xfr_schd_no) doCnd_xfr_schd_no_LC(info);
		else if (lc == Cnd_ship_inst_no) doCnd_ship_inst_no_LC(info);
		else if (lc == Cnd_ship_inst_d_no) doCnd_ship_inst_d_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_LC(info);
		else if (lc == BulkSet_ship_wk_cd) doBulkSet_ship_wk_cd_LC(info);
		else if (lc == BulkSet_ship_wk_nm) doBulkSet_ship_wk_nm_LC(info);
		else if (lc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_LC(info);
		else if (lc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_LC(info);
		else if (lc == columnRslt_alloc_sts_typ) doRslt_alloc_sts_typ_LC(info);
		else if (lc == columnRslt_alloc_sts_typ_nm) doRslt_alloc_sts_typ_nm_LC(info);
		else if (lc == columnRslt_dlv_day_week_typ) doRslt_dlv_day_week_typ_LC(info);
		else if (lc == columnRslt_dlv_day_week_typ_nm) doRslt_dlv_day_week_typ_nm_LC(info);
		else if (lc == columnRslt_ship_schd_time) doRslt_ship_schd_time_LC(info);
		else if (lc == columnRslt_ship_term_cd) doRslt_ship_term_cd_LC(info);
		else if (lc == columnRslt_ship_term_nm) doRslt_ship_term_nm_LC(info);
		else if (lc == columnRslt_ship_wk_grp_cd) doRslt_ship_wk_grp_cd_LC(info);
		else if (lc == columnRslt_ship_wk_grp_nm) doRslt_ship_wk_grp_nm_LC(info);
		else if (lc == columnRslt_ship_wk_cd) doRslt_ship_wk_cd_LC(info);
		else if (lc == columnRslt_ship_wk_nm) doRslt_ship_wk_nm_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_LC(info);
		else if (lc == columnRslt_ship_to_lg_grp_cd) doRslt_ship_to_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_to_lg_grp_nm) doRslt_ship_to_lg_grp_nm_LC(info);
		else if (lc == columnRslt_ship_to_id_typ) doRslt_ship_to_id_typ_LC(info);
		else if (lc == columnRslt_ship_to_id_typ_nm) doRslt_ship_to_id_typ_nm_LC(info);
		else if (lc == columnRslt_ship_to_id_cd) doRslt_ship_to_id_cd_LC(info);
		else if (lc == columnRslt_ship_to_id_nm) doRslt_ship_to_id_nm_LC(info);
		else if (lc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_LC(info);
		else if (lc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_LC(info);
		else if (lc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_LC(info);
		else if (lc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_LC(info);
		else if (lc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_LC(info);
		else if (lc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_LC(info);
		else if (lc == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_LC(info);
		else if (lc == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_LC(info);
		else if (lc == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt_alloc_ent_unit_cd) doRslt_alloc_ent_unit_cd_LC(info);
		else if (lc == columnRslt_alloc_ent_unit_nm) doRslt_alloc_ent_unit_nm_LC(info);
		else if (lc == columnRslt_alloc_ent_unit_dec_place) doRslt_alloc_ent_unit_dec_place_LC(info);
		else if (lc == columnRslt_alloc_ent_unit_conv_base_qty) doRslt_alloc_ent_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_alloc_ent_unit_conv_qty) doRslt_alloc_ent_unit_conv_qty_LC(info);
		else if (lc == columnRslt_alloc_ent_unit_rnd_typ) doRslt_alloc_ent_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_conv_base_qty) doRslt_base_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_base_unit_conv_qty) doRslt_base_unit_conv_qty_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_wt) doRslt_wt_LC(info);
		else if (lc == columnRslt_dim) doRslt_dim_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_LC(info);
		else if (lc == columnRslt_lot_no_typ) doRslt_lot_no_typ_LC(info);
		else if (lc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_LC(info);
		else if (lc == columnRslt_alloc_grp_cd) doRslt_alloc_grp_cd_LC(info);
		else if (lc == columnRslt_alloc_grp_nm) doRslt_alloc_grp_nm_LC(info);
		else if (lc == columnRslt_def_loc_cd) doRslt_def_loc_cd_LC(info);
		else if (lc == columnRslt_def_loc_nm) doRslt_def_loc_nm_LC(info);
		else if (lc == columnRslt_assort_typ) doRslt_assort_typ_LC(info);
		else if (lc == columnRslt_assort_typ_nm) doRslt_assort_typ_nm_LC(info);
		else if (lc == columnRslt_set_itm_grp_no) doRslt_set_itm_grp_no_LC(info);
		else if (lc == columnRslt_assort_sts_mark) doRslt_assort_sts_mark_LC(info);
		else if (lc == columnRslt_alloc_typ) doRslt_alloc_typ_LC(info);
		else if (lc == columnRslt_alloc_typ_nm) doRslt_alloc_typ_nm_LC(info);
		else if (lc == columnRslt_base_dlv_slip_no) doRslt_base_dlv_slip_no_LC(info);
		else if (lc == columnRslt_base_prov_act_no) doRslt_base_prov_act_no_LC(info);
		else if (lc == columnRslt_base_ac_dt) doRslt_base_ac_dt_LC(info);
		else if (lc == columnRslt_ship_cnt_rmrks) doRslt_ship_cnt_rmrks_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_xfr_schd_no) doRslt_xfr_schd_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_ship_schd_no) doRslt_ship_schd_no_LC(info);
		else if (lc == columnRslt_ship_alloc_sts_no) doRslt_ship_alloc_sts_no_LC(info);
		else if (lc == columnRslt_org_ship_alloc_sts_no) doRslt_org_ship_alloc_sts_no_LC(info);
		else if (lc == columnRslt_ship_inst_no) doRslt_ship_inst_no_LC(info);
		else if (lc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_LC(info);
		else if (lc == columnRslt_ship_inst_typ) doRslt_ship_inst_typ_LC(info);
		else if (lc == columnRslt_ship_pr_no) doRslt_ship_pr_no_LC(info);
		else if (lc == columnRslt_alloc_scope_typ) doRslt_alloc_scope_typ_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_ship_pr_upd_cntr) doRslt_ship_pr_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == columnRslt_lot_peg_no) doRslt_lot_peg_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alloc_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[via_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_dlv_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_schd_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ship_wk_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_time_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_wk_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_wk_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_to_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_to_lg_grp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_ent_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ent_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ent_unit_rnd_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dim_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[set_itm_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_set_itm_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[assort_sts_mark]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_assort_sts_mark_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_alloc_sts_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_alloc_sts_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[org_ship_alloc_sts_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_org_ship_alloc_sts_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_scope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_scope_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_pr_upd_cntr_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_peg_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
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
	 * コンボ／リストのリスト[Cnd_alloc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_alloc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocGrp(row, info);
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
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_via_dlv_typ]の作成メソッド
	 */
	public MCList getCnd_via_dlv_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getViaDlvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_term_cd]の作成メソッド
	 */
	public MCList getCnd_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_wk_cd]の作成メソッド
	 */
	public MCList getCnd_ship_wk_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
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
	 * コンボ／リストのリスト[Cnd_ship_inst_typ]の作成メソッド
	 */
	public MCList getCnd_ship_inst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipInstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_ship_wk_cd]の作成メソッド
	 */
	public MCList getBulkSet_ship_wk_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ship_term_cd]の作成メソッド
	 */
	public MCList getRslt_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ship_wk_cd]の作成メソッド
	 */
	public MCList getRslt_ship_wk_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_alloc_ent_unit_cd]の作成メソッド
	 */
	public MCList getRslt_alloc_ent_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1420.Srch01")) {
			return new MS_MSBEL1420_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1420.Srch02")) {
			return new MS_MSBEL1420_Srch02Bridge();
		}
		if (id.equals("MS.MSBEL1420.Upd01")) {
			return new MS_MSBEL1420_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1420.Sprt01")) {
			return new MS_MSBEL1420_Sprt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1420_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1420_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1420_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1420_Srch01Bridge() {
			p_MS_MSBEL1420_Srch01 = new MCParam(PDef.MS_MSBEL1420_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1420_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1420.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));

			p_MS_MSBEL1420_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1420_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1420_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1420_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1420_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1420.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1420.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1420.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1420_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1420_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)p_MS_MSBEL1420_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1420_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1420_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1420_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL1420_Srch02Bridge() {
			p_MS_MSBEL1420_Srch02 = new MCParam(PDef.MS_MSBEL1420_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1420_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1420.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));

			p_MS_MSBEL1420_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1420_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1420_Srch02.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1420_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1420_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1420_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1420.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1420.CndR up1() {
			return (mcframe.clientMSBE.MSBEP1420.CndR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1420.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1420_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1420_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)p_MS_MSBEL1420_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
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
	 * [MS_MSBEL1420_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1420_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1420_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1420_Upd01Bridge() {
			p_MS_MSBEL1420_Upd01 = new MCParam(PDef.MS_MSBEL1420_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1420_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1420.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));

			p_MS_MSBEL1420_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1420_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1420_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBEL1420_Upd01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1420_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1420_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1420.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1420.CndR up1() {
			return (mcframe.clientMSBE.MSBEP1420.CndR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1420.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1420_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1420_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)p_MS_MSBEL1420_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
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
	 * [MS_MSBEL1420_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1420_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1420_Sprt01;

		/** コンストラクタ */
		protected MS_MSBEL1420_Sprt01Bridge() {
			p_MS_MSBEL1420_Sprt01 = new MCParam(PDef.MS_MSBEL1420_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1420_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));

			p_MS_MSBEL1420_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1420_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1420_Sprt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1420_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1420_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1420.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1420.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1420_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1420.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1420_Sprt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1420.RsltR>)p_MS_MSBEL1420_Sprt01.getContainerParam().getDownBlock(0));
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