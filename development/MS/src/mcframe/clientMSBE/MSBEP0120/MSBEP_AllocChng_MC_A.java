package mcframe.clientMSBE.MSBEP0120;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
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
import mcframe.clientMSBE.MSBEP0120.MSBEP_AllocChng_MC.MS_MSBEL0120_Srch01Caller;
import mcframe.clientMSBE.MSBEP0120.MSBEP_AllocChng_MC.MS_MSBEL0120_Upd01Caller;

/**
 * 画面"MSBEP_AllocChng"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_AllocChng_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP0120";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * CHNG,Change,0;REF,View,1 CHNG,変更する,0;REF,参照する,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_CHNG = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_ship_schd_no_Label = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_schd_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [ShipSchdRslt]ブロック関連のField定義
	public MCPanel ShipSchdRsltPanel = null;
	public MCTitledBorder ShipSchdRsltTitledBorder = null;
	// [ShipSchdRslt]ブロックの項目のField定義
	public MCLabel ShipSchdRslt_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_trd_nm = null;
	public MCLabel ShipSchdRslt_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_slo_no = null;
	public MCLabel ShipSchdRslt_slo_d_no_Label = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_slo_d_no = null;
	public MCLabel ShipSchdRslt_xfr_schd_no_Label = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_xfr_schd_no = null;
	public MCLabel ShipSchdRslt_ship_schd_no_Label = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_ship_schd_no = null;
	public MCLabel ShipSchdRslt_dlv_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_dlv_id_typ_nm = null;
	public MCLabel ShipSchdRslt_dlv_id_cd_Label = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_dlv_id_cd = null;
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_dlv_id_nm = null;
	public MCLabel ShipSchdRslt_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_cst_nm = null;
	public MCLabel ShipSchdRslt_ship_to_id_typ_Label = null;
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_ship_to_id_typ = null;
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_ship_to_id_typ_nm = null;
	public MCLabel ShipSchdRslt_ship_to_id_cd_Label = null;
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_ship_to_id_cd = null;
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_ship_to_id_nm = null;
	public MCLabel ShipSchdRslt_rqst_usr_cd_Label = null;
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_rqst_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_rqst_usr_nm = null;
	public MCLabel ShipSchdRslt_rqst_dpt_cd_Label = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_rqst_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_rqst_dpt_nm = null;
	public MCLabel ShipSchdRslt_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_loc_nm = null;
	public MCLabel ShipSchdRslt_str_ln_cd_Label = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_str_ln_nm = null;
	public MCLabel ShipSchdRslt_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_sublot_no = null;
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H ShipSchdRslt_ver_no_p_PPanel;
	public MCTextComboBox ShipSchdRslt_ver_no;	// [ShipSchdRslt]の[ver_no_p.ver_no]を[ShipSchdRslt_ver_no]としてエイリアス定義。
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCCheckBox ShipSchdRslt_ver_flg = null;
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public MCCheckBox ShipSchdRslt_not_lot_mix_flg = null;
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public MCCheckBox ShipSchdRslt_not_sublot_mix_flg = null;
	public MCLabel ShipSchdRslt_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_wg_nm = null;
	public MCLabel ShipSchdRslt_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_site_nm = null;
	public MCLabel ShipSchdRslt_ship_lg_grp_cd_Label = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_ship_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_ship_lg_grp_nm = null;
	public MCLabel ShipSchdRslt_alloc_grp_cd_Label = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_alloc_grp_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H ShipSchdRslt_itm_p_PPanel;
	public MCTextField ShipSchdRslt_itm_cd;	// [ShipSchdRslt]の[itm_p.itm_cd]を[ShipSchdRslt_itm_cd]としてエイリアス定義。
	public MCTextComboBox ShipSchdRslt_itm_sub1;	// [ShipSchdRslt]の[itm_p.itm_sub1]を[ShipSchdRslt_itm_sub1]としてエイリアス定義。
	public MCTextComboBox ShipSchdRslt_itm_sub2;	// [ShipSchdRslt]の[itm_p.itm_sub2]を[ShipSchdRslt_itm_sub2]としてエイリアス定義。
	public MCTextComboBox ShipSchdRslt_itm_sub3;	// [ShipSchdRslt]の[itm_p.itm_sub3]を[ShipSchdRslt_itm_sub3]としてエイリアス定義。
	public MCTextField ShipSchdRslt_itm_nm;	// [ShipSchdRslt]の[itm_p.itm_nm]を[ShipSchdRslt_itm_nm]としてエイリアス定義。
	public MCLabel ShipSchdRslt_gd_cd_Label = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_gd_nm = null;
	public MCLabel ShipSchdRslt_quality_typ_Label = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_quality_typ_nm = null;
	public MCLabel ShipSchdRslt_stk_insp_typ_Label = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_stk_insp_typ_nm = null;
	public MCLabel ShipSchdRslt_stk_id_typ_Label = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_stk_id_typ_nm = null;
	public MCLabel ShipSchdRslt_stk_bp_cd_Label = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_stk_bp_nm = null;
	public mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H ShipSchdRslt_sno_p_PPanel;
	public MCCheckBox ShipSchdRslt_sno1_null_flg;	// [ShipSchdRslt]の[sno_p.sno1_null_flg]を[ShipSchdRslt_sno1_null_flg]としてエイリアス定義。
	public MCTextField ShipSchdRslt_sno1;	// [ShipSchdRslt]の[sno_p.sno1]を[ShipSchdRslt_sno1]としてエイリアス定義。
	public MCCheckBox ShipSchdRslt_sno2_null_flg;	// [ShipSchdRslt]の[sno_p.sno2_null_flg]を[ShipSchdRslt_sno2_null_flg]としてエイリアス定義。
	public MCTextField ShipSchdRslt_sno2;	// [ShipSchdRslt]の[sno_p.sno2]を[ShipSchdRslt_sno2]としてエイリアス定義。
	public MCCheckBox ShipSchdRslt_sno3_null_flg;	// [ShipSchdRslt]の[sno_p.sno3_null_flg]を[ShipSchdRslt_sno3_null_flg]としてエイリアス定義。
	public MCTextField ShipSchdRslt_sno3;	// [ShipSchdRslt]の[sno_p.sno3]を[ShipSchdRslt_sno3]としてエイリアス定義。
	public MCCheckBox ShipSchdRslt_sno4_null_flg;	// [ShipSchdRslt]の[sno_p.sno4_null_flg]を[ShipSchdRslt_sno4_null_flg]としてエイリアス定義。
	public MCTextField ShipSchdRslt_sno4;	// [ShipSchdRslt]の[sno_p.sno4]を[ShipSchdRslt_sno4]としてエイリアス定義。
	public MCTextField ShipSchdRslt_wrk_no;	// [ShipSchdRslt]の[sno_p.wrk_no]を[ShipSchdRslt_wrk_no]としてエイリアス定義。
	public MCTextField ShipSchdRslt_wrk_nm;	// [ShipSchdRslt]の[sno_p.wrk_nm]を[ShipSchdRslt_wrk_nm]としてエイリアス定義。
	public MCLabel ShipSchdRslt_ship_schd_split_typ_Label = null;
	/**
	 * Split type 分割区分.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_ship_schd_split_typ = null;
	/**
	 * Split type name 分割区分名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_ship_schd_split_typ_nm = null;
	public MCLabel ShipSchdRslt_alloc_scope_typ_Label = null;
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_alloc_scope_typ = null;
	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_alloc_scope_typ_nm = null;
	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public MCCheckBox ShipSchdRslt_not_lg_mix_flg = null;
	public MCLabel ShipSchdRslt_dlv_rqst_dt_Label = null;
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_dlv_rqst_dt = null;
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_dlv_rqst_hm = null;
	public MCLabel ShipSchdRslt_ship_rqst_dt_Label = null;
	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_ship_rqst_dt = null;
	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_ship_rqst_hm = null;
	public MCLabel ShipSchdRslt_pd_inst_dlv_dt_Label = null;
	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_pd_inst_dlv_dt = null;
	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_pd_inst_dlv_hm = null;
	public MCLabel ShipSchdRslt_dlv_inst_dt_Label = null;
	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_dlv_inst_dt = null;
	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_dlv_inst_hm = null;
	public MCLabel ShipSchdRslt_ship_schd_dt_Label = null;
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_ship_schd_dt = null;
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_ship_schd_hm = null;
	public MCLabel ShipSchdRslt_dlv_schd_dt_Label = null;
	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_dlv_schd_dt = null;
	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCDateField ShipSchdRslt_dlv_schd_hm = null;
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public MCCheckBox ShipSchdRslt_ship_block_flg = null;
	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public MCCheckBox ShipSchdRslt_pack_alloc_flg = null;
	public MCLabel ShipSchdRslt_trd_unit_cd_Label = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumberField ShipSchdRslt_trd_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H ShipSchdRslt_trd_unit_qty_p_PPanel;
	public MCNumberField ShipSchdRslt_trd_unit_qty;	// [ShipSchdRslt]の[trd_unit_qty_p.qty]を[ShipSchdRslt_trd_unit_qty]としてエイリアス定義。
	public MCLabel ShipSchdRslt_base_unit_cd_Label = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCTextField ShipSchdRslt_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumberField ShipSchdRslt_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H ShipSchdRslt_base_unit_qty_p_PPanel;
	public MCNumberField ShipSchdRslt_base_unit_qty;	// [ShipSchdRslt]の[base_unit_qty_p.qty]を[ShipSchdRslt_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H ShipSchdRslt_alloc_qty_p_PPanel;
	public MCNumberField ShipSchdRslt_alloc_qty;	// [ShipSchdRslt]の[alloc_qty_p.qty]を[ShipSchdRslt_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H ShipSchdRslt_wait_qty_p_PPanel;
	public MCNumberField ShipSchdRslt_wait_qty;	// [ShipSchdRslt]の[wait_qty_p.qty]を[ShipSchdRslt_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H ShipSchdRslt_wait_rem_qty_p_PPanel;
	public MCNumberField ShipSchdRslt_wait_rem_qty;	// [ShipSchdRslt]の[wait_rem_qty_p.qty]を[ShipSchdRslt_wait_rem_qty]としてエイリアス定義。
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumberField ShipSchdRslt_ship_pr_upd_cntr = null;
	// [ShipAllocRslt]ブロック関連のField定義
	public MCPanel ShipAllocRsltPanel = null;
	public MCTitledBorder ShipAllocRsltTitledBorder = null;
	public MCScrollPane ShipAllocRsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR> ShipAllocRsltTable = null;
	// [ShipAllocRslt]ブロックの項目のField定義
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_slo_d_no = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_xfr_schd_no = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_schd_no = null;
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_alloc_sts_no = null;
	/**
	 * Inventory/GR schedule 在庫・入庫予定.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_vstk_in_schd_flg = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_cst_nm = null;
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_loc_cd = null;
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D ShipAllocRslt_str_ln_p_PPanel;
	public MCColumnConfig columnShipAllocRslt_ship_str_ln_cd;// [ShipAllocRslt]の[str_ln_p.str_ln_cd]を[columnShipAllocRslt_ship_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_ship_str_ln_nm;// [ShipAllocRslt]の[str_ln_p.str_ln_nm]を[columnShipAllocRslt_ship_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_str_ln_cd_none_flg;// [ShipAllocRslt]の[str_ln_p.str_ln_cd_none_flg]を[columnShipAllocRslt_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_wg_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_site_nm = null;
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_fr_lg_grp_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_alloc_grp_nm = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D ShipAllocRslt_lot_no_p_PPanel;
	public MCColumnConfig columnShipAllocRslt_crt_lot_flg;// [ShipAllocRslt]の[lot_no_p.crt_lot_flg]を[columnShipAllocRslt_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_lot_no;// [ShipAllocRslt]の[lot_no_p.lot_no]を[columnShipAllocRslt_lot_no]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_sublot_no;// [ShipAllocRslt]の[lot_no_p.sublot_no]を[columnShipAllocRslt_sublot_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D ShipAllocRslt_ver_no_p_PPanel;
	public MCColumnConfig columnShipAllocRslt_ver_no;// [ShipAllocRslt]の[ver_no_p.ver_no]を[columnShipAllocRslt_ver_no]としてエイリアス定義。
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ver_flg = null;
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_not_lot_mix_flg = null;
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_not_sublot_mix_flg = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D ShipAllocRslt_sno_p_PPanel;
	public MCColumnConfig columnShipAllocRslt_sno1_null_flg;// [ShipAllocRslt]の[sno_p.sno1_null_flg]を[columnShipAllocRslt_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_sno1;// [ShipAllocRslt]の[sno_p.sno1]を[columnShipAllocRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_sno2_null_flg;// [ShipAllocRslt]の[sno_p.sno2_null_flg]を[columnShipAllocRslt_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_sno2;// [ShipAllocRslt]の[sno_p.sno2]を[columnShipAllocRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_sno3_null_flg;// [ShipAllocRslt]の[sno_p.sno3_null_flg]を[columnShipAllocRslt_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_sno3;// [ShipAllocRslt]の[sno_p.sno3]を[columnShipAllocRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_sno4_null_flg;// [ShipAllocRslt]の[sno_p.sno4_null_flg]を[columnShipAllocRslt_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_sno4;// [ShipAllocRslt]の[sno_p.sno4]を[columnShipAllocRslt_sno4]としてエイリアス定義。
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_stk_id_typ_nm = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_stk_bp_nm = null;
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_pack_unit_dec_place = null;
	/**
	 * SKU denominator qty. 荷姿単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_pack_unit_conv_base_qty = null;
	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_pack_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipAllocRslt_alloc_abl_qty_p_PPanel;
	public MCColumnConfig columnShipAllocRslt_alloc_abl_qty;// [ShipAllocRslt]の[alloc_abl_qty_p.qty]を[columnShipAllocRslt_alloc_abl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipAllocRslt_alloc_chng_qty_p_PPanel;
	public MCColumnConfig columnShipAllocRslt_alloc_chng_qty;// [ShipAllocRslt]の[alloc_chng_qty_p.qty]を[columnShipAllocRslt_alloc_chng_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnShipAllocRslt_alloc_abl_base_unit_qty;// [ShipAllocRslt]の[alloc_abl_base_unit_qty_p.qty]を[columnShipAllocRslt_alloc_abl_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel;
	public MCColumnConfig columnShipAllocRslt_alloc_chng_base_unit_qty;// [ShipAllocRslt]の[alloc_chng_base_unit_qty_p.qty]を[columnShipAllocRslt_alloc_chng_base_unit_qty]としてエイリアス定義。
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_dlv_rqst_dt = null;
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_dlv_rqst_hm = null;
	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_rqst_dt = null;
	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_rqst_hm = null;
	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_pd_inst_dlv_dt = null;
	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_pd_inst_dlv_hm = null;
	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_dlv_inst_dt = null;
	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_dlv_inst_hm = null;
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_schd_dt = null;
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_schd_hm = null;
	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_dlv_schd_dt = null;
	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_dlv_schd_hm = null;
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_rqst_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_rqst_usr_nm = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_rqst_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_rqst_dpt_nm = null;
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_to_id_typ = null;
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_to_id_typ_nm = null;
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_to_id_cd = null;
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_to_id_nm = null;
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_alloc_scope_typ = null;
	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_alloc_scope_typ_nm = null;
	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_not_lg_mix_flg = null;
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_pr_no = null;
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnShipAllocRslt_ship_pr_upd_cntr = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ShipAllocRslt_itm_p_PPanel;
	public MCColumnConfig columnShipAllocRslt_itm_cd;// [ShipAllocRslt]の[itm_p.itm_cd]を[columnShipAllocRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_itm_sub1;// [ShipAllocRslt]の[itm_p.itm_sub1]を[columnShipAllocRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_itm_sub2;// [ShipAllocRslt]の[itm_p.itm_sub2]を[columnShipAllocRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnShipAllocRslt_itm_sub3;// [ShipAllocRslt]の[itm_p.itm_sub3]を[columnShipAllocRslt_itm_sub3]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	
	/** [MS_MSBEL0120_Srch01]のCallerの作成 */
	protected MSBEP_AllocChng_MC.MS_MSBEL0120_Srch01Caller createMS_MSBEL0120_Srch01() {
		MSBEP_AllocChng_MC.MS_MSBEL0120_Srch01Caller<MSBEP_AllocChng, MS_MSBEL0120_Srch01Bridge>
		caller = ((MSBEP_AllocChng_MC)this).new MS_MSBEL0120_Srch01Caller<MSBEP_AllocChng, MS_MSBEL0120_Srch01Bridge>(
					(MSBEP_AllocChng)this, new MS_MSBEL0120_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL0120_Srch01]の呼び出し */
	protected void callMS_MSBEL0120_Srch01() {
		MCCaller caller = createMS_MSBEL0120_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL0120_Upd01]のCallerの作成 */
	protected MSBEP_AllocChng_MC.MS_MSBEL0120_Upd01Caller createMS_MSBEL0120_Upd01() {
		MSBEP_AllocChng_MC.MS_MSBEL0120_Upd01Caller<MSBEP_AllocChng, MS_MSBEL0120_Upd01Bridge>
		caller = ((MSBEP_AllocChng_MC)this).new MS_MSBEL0120_Upd01Caller<MSBEP_AllocChng, MS_MSBEL0120_Upd01Bridge>(
					(MSBEP_AllocChng)this, new MS_MSBEL0120_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL0120_Upd01]の呼び出し */
	protected void callMS_MSBEL0120_Upd01() {
		MCCaller caller = createMS_MSBEL0120_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0120.CndR aCndR;
	/** [ShipSchdRslt]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR aShipSchdRsltR;
	/** [ShipAllocRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR> aShipAllocRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP0120.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0120.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0120.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP0120.CndR.create();
	}

	/**
	 * 項目コピーによってaShipSchdRsltRを設定します。
	 *
	 * aShipSchdRsltRのインスタンスは変更されません。
	 *
	 * @param row ShipSchdRsltR
	 */
	public void setShipSchdRsltR(mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR row) {
		if (row != null) {
			MCRow.copyall(getShipSchdRsltR(), row);
		}
	}

	/**
	 * [ShipSchdRslt]ブロックのコンテナaShipSchdRsltRを返します。
	 *
	 * @return ShipSchdRsltR
	 */
	public mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR getShipSchdRsltR() {
		return aShipSchdRsltR;
	}

	/**
	 * aShipSchdRsltRを作成します。
	 *
	 * @return ShipSchdRsltR
	 */
	public mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR createShipSchdRsltR() {
		return mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.create();
	}

	/**
	 * コピーによってaShipAllocRsltLを設定します。
	 *
	 * aShipAllocRsltLのインスタンスは変更されません。
	 *
	 * @param dataset ShipAllocRsltL
	 */
	public void setShipAllocRsltL(MCList<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR> aList) {
		if (getShipAllocRsltL() != aList) {
			getShipAllocRsltL().setAll(aList);
		}
	}

	/**
	 * [ShipAllocRslt]ブロックのコンテナaShipAllocRsltLを返します。
	 *
	 * @return ShipAllocRsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR> getShipAllocRsltL() {
		return aShipAllocRsltL;
	}

	/**
	 * aShipAllocRsltRを作成します。
	 *
	 * @return ShipAllocRsltR
	 */
	public mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR createShipAllocRsltR() {
		return mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.create();
	}

	/**
	 * aShipAllocRsltLを作成します。
	 *
	 * @return ShipAllocRsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR> createShipAllocRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.class);
	}

	/**
	 * ShipAllocRsltTableを初期化します。
	 */
	protected void createShipAllocRsltTable(){
		if(ShipAllocRsltTable == null){
			ShipAllocRsltTable = beansFactory.createTable2("ShipAllocRslt.table");
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
		if(!MCCollectionUtil.contains(ret, getShipSchdRsltR())) ret.add(getShipSchdRsltR());
		if(!MCCollectionUtil.contains(ret, getShipAllocRsltL())) ret.add(getShipAllocRsltL());
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
		if(aCnt == getShipSchdRsltR()) return "ShipSchdRslt";
		if(aCnt == getShipAllocRsltL()) return "ShipAllocRslt";
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
		if(bId.equals("ShipSchdRslt")) return getShipSchdRsltR();
		if(bId.equals("ShipAllocRslt")) return getShipAllocRsltL();
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
		ret.add(CndPanel);
		ret.add(ShipSchdRsltPanel);
		ret.add(ShipAllocRsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AllocChng_MC_A() {
		aCndR = createCndR();
		aShipSchdRsltR = createShipSchdRsltR();
		aShipAllocRsltL = createShipAllocRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_AllocChng_MC_A(String name) {
		aCndR = createCndR();
		aShipSchdRsltR = createShipSchdRsltR();
		aShipAllocRsltL = createShipAllocRsltL();
		createShipAllocRsltTable();
		ShipAllocRsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_AllocChng_MC.jbCreateScreenOpe((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbCreateCnd((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbCreateShipSchdRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbCreateShipAllocRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbCreateBtn((MSBEP_AllocChng)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_AllocChng p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_AllocChng p) {
	}

	/**
	 * [ShipSchdRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipSchdRslt(MSBEP_AllocChng p) {
		p.ShipSchdRslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getShipSchdRsltR().ver_no_p());
		p.ShipSchdRslt_ver_no_p_PPanel.setName("ShipSchdRslt.ver_no_p");
		p.ShipSchdRslt_ver_no = p.ShipSchdRslt_ver_no_p_PPanel.VerNo_ver_no;
		p.ShipSchdRslt_ver_no.addAliasName("ShipSchdRslt.ver_no", p);
		p.ShipSchdRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getShipSchdRsltR().itm_p());
		p.ShipSchdRslt_itm_p_PPanel.setName("ShipSchdRslt.itm_p");
		p.ShipSchdRslt_itm_cd = p.ShipSchdRslt_itm_p_PPanel.Itm_itm_cd;
		p.ShipSchdRslt_itm_cd.addAliasName("ShipSchdRslt.itm_cd", p);
		p.ShipSchdRslt_itm_sub1 = p.ShipSchdRslt_itm_p_PPanel.Itm_itm_sub1;
		p.ShipSchdRslt_itm_sub1.addAliasName("ShipSchdRslt.itm_sub1", p);
		p.ShipSchdRslt_itm_sub2 = p.ShipSchdRslt_itm_p_PPanel.Itm_itm_sub2;
		p.ShipSchdRslt_itm_sub2.addAliasName("ShipSchdRslt.itm_sub2", p);
		p.ShipSchdRslt_itm_sub3 = p.ShipSchdRslt_itm_p_PPanel.Itm_itm_sub3;
		p.ShipSchdRslt_itm_sub3.addAliasName("ShipSchdRslt.itm_sub3", p);
		p.ShipSchdRslt_itm_nm = p.ShipSchdRslt_itm_p_PPanel.Itm_itm_nm;
		p.ShipSchdRslt_itm_nm.addAliasName("ShipSchdRslt.itm_nm", p);
		p.ShipSchdRslt_sno_p_PPanel = mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.create(p.getShipSchdRsltR().sno_p());
		p.ShipSchdRslt_sno_p_PPanel.setName("ShipSchdRslt.sno_p");
		p.ShipSchdRslt_sno1_null_flg = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_sno1_null_flg;
		p.ShipSchdRslt_sno1_null_flg.addAliasName("ShipSchdRslt.sno1_null_flg", p);
		p.ShipSchdRslt_sno1 = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_sno1;
		p.ShipSchdRslt_sno1.addAliasName("ShipSchdRslt.sno1", p);
		p.ShipSchdRslt_sno2_null_flg = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_sno2_null_flg;
		p.ShipSchdRslt_sno2_null_flg.addAliasName("ShipSchdRslt.sno2_null_flg", p);
		p.ShipSchdRslt_sno2 = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_sno2;
		p.ShipSchdRslt_sno2.addAliasName("ShipSchdRslt.sno2", p);
		p.ShipSchdRslt_sno3_null_flg = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_sno3_null_flg;
		p.ShipSchdRslt_sno3_null_flg.addAliasName("ShipSchdRslt.sno3_null_flg", p);
		p.ShipSchdRslt_sno3 = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_sno3;
		p.ShipSchdRslt_sno3.addAliasName("ShipSchdRslt.sno3", p);
		p.ShipSchdRslt_sno4_null_flg = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_sno4_null_flg;
		p.ShipSchdRslt_sno4_null_flg.addAliasName("ShipSchdRslt.sno4_null_flg", p);
		p.ShipSchdRslt_sno4 = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_sno4;
		p.ShipSchdRslt_sno4.addAliasName("ShipSchdRslt.sno4", p);
		p.ShipSchdRslt_wrk_no = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_wrk_no;
		p.ShipSchdRslt_wrk_no.addAliasName("ShipSchdRslt.wrk_no", p);
		p.ShipSchdRslt_wrk_nm = p.ShipSchdRslt_sno_p_PPanel.SnoWrkNo_wrk_nm;
		p.ShipSchdRslt_wrk_nm.addAliasName("ShipSchdRslt.wrk_nm", p);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getShipSchdRsltR().trd_unit_qty_p());
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.setName("ShipSchdRslt.trd_unit_qty_p");
		p.ShipSchdRslt_trd_unit_qty = p.ShipSchdRslt_trd_unit_qty_p_PPanel.Qty_qty;
		p.ShipSchdRslt_trd_unit_qty.addAliasName("ShipSchdRslt.trd_unit_qty", p);
		p.ShipSchdRslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getShipSchdRsltR().base_unit_qty_p());
		p.ShipSchdRslt_base_unit_qty_p_PPanel.setName("ShipSchdRslt.base_unit_qty_p");
		p.ShipSchdRslt_base_unit_qty = p.ShipSchdRslt_base_unit_qty_p_PPanel.Qty_qty;
		p.ShipSchdRslt_base_unit_qty.addAliasName("ShipSchdRslt.base_unit_qty", p);
		p.ShipSchdRslt_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getShipSchdRsltR().alloc_qty_p());
		p.ShipSchdRslt_alloc_qty_p_PPanel.setName("ShipSchdRslt.alloc_qty_p");
		p.ShipSchdRslt_alloc_qty = p.ShipSchdRslt_alloc_qty_p_PPanel.Qty_qty;
		p.ShipSchdRslt_alloc_qty.addAliasName("ShipSchdRslt.alloc_qty", p);
		p.ShipSchdRslt_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getShipSchdRsltR().wait_qty_p());
		p.ShipSchdRslt_wait_qty_p_PPanel.setName("ShipSchdRslt.wait_qty_p");
		p.ShipSchdRslt_wait_qty = p.ShipSchdRslt_wait_qty_p_PPanel.Qty_qty;
		p.ShipSchdRslt_wait_qty.addAliasName("ShipSchdRslt.wait_qty", p);
		p.ShipSchdRslt_wait_rem_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getShipSchdRsltR().wait_rem_qty_p());
		p.ShipSchdRslt_wait_rem_qty_p_PPanel.setName("ShipSchdRslt.wait_rem_qty_p");
		p.ShipSchdRslt_wait_rem_qty = p.ShipSchdRslt_wait_rem_qty_p_PPanel.Qty_qty;
		p.ShipSchdRslt_wait_rem_qty.addAliasName("ShipSchdRslt.wait_rem_qty", p);
	}

	/**
	 * [ShipAllocRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipAllocRslt(MSBEP_AllocChng p) {
		p.ShipAllocRslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.$str_ln_p);
		p.ShipAllocRslt_str_ln_p_PPanel.setName("ShipAllocRslt.str_ln_p");
		p.columnShipAllocRslt_ship_str_ln_cd = p.ShipAllocRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnShipAllocRslt_ship_str_ln_cd.addAliasName("ShipAllocRslt.ship_str_ln_cd", p);
		p.columnShipAllocRslt_ship_str_ln_nm = p.ShipAllocRslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnShipAllocRslt_ship_str_ln_nm.addAliasName("ShipAllocRslt.ship_str_ln_nm", p);
		p.columnShipAllocRslt_str_ln_cd_none_flg = p.ShipAllocRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnShipAllocRslt_str_ln_cd_none_flg.addAliasName("ShipAllocRslt.str_ln_cd_none_flg", p);
		p.ShipAllocRslt_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.$lot_no_p);
		p.ShipAllocRslt_lot_no_p_PPanel.setName("ShipAllocRslt.lot_no_p");
		p.columnShipAllocRslt_crt_lot_flg = p.ShipAllocRslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnShipAllocRslt_crt_lot_flg.addAliasName("ShipAllocRslt.crt_lot_flg", p);
		p.columnShipAllocRslt_lot_no = p.ShipAllocRslt_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnShipAllocRslt_lot_no.addAliasName("ShipAllocRslt.lot_no", p);
		p.columnShipAllocRslt_sublot_no = p.ShipAllocRslt_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnShipAllocRslt_sublot_no.addAliasName("ShipAllocRslt.sublot_no", p);
		p.ShipAllocRslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.$ver_no_p);
		p.ShipAllocRslt_ver_no_p_PPanel.setName("ShipAllocRslt.ver_no_p");
		p.columnShipAllocRslt_ver_no = p.ShipAllocRslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnShipAllocRslt_ver_no.addAliasName("ShipAllocRslt.ver_no", p);
		p.ShipAllocRslt_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.$sno_p);
		p.ShipAllocRslt_sno_p_PPanel.setName("ShipAllocRslt.sno_p");
		p.columnShipAllocRslt_sno1_null_flg = p.ShipAllocRslt_sno_p_PPanel.columnSno_sno1_null_flg;
		p.columnShipAllocRslt_sno1_null_flg.addAliasName("ShipAllocRslt.sno1_null_flg", p);
		p.columnShipAllocRslt_sno1 = p.ShipAllocRslt_sno_p_PPanel.columnSno_sno1;
		p.columnShipAllocRslt_sno1.addAliasName("ShipAllocRslt.sno1", p);
		p.columnShipAllocRslt_sno2_null_flg = p.ShipAllocRslt_sno_p_PPanel.columnSno_sno2_null_flg;
		p.columnShipAllocRslt_sno2_null_flg.addAliasName("ShipAllocRslt.sno2_null_flg", p);
		p.columnShipAllocRslt_sno2 = p.ShipAllocRslt_sno_p_PPanel.columnSno_sno2;
		p.columnShipAllocRslt_sno2.addAliasName("ShipAllocRslt.sno2", p);
		p.columnShipAllocRslt_sno3_null_flg = p.ShipAllocRslt_sno_p_PPanel.columnSno_sno3_null_flg;
		p.columnShipAllocRslt_sno3_null_flg.addAliasName("ShipAllocRslt.sno3_null_flg", p);
		p.columnShipAllocRslt_sno3 = p.ShipAllocRslt_sno_p_PPanel.columnSno_sno3;
		p.columnShipAllocRslt_sno3.addAliasName("ShipAllocRslt.sno3", p);
		p.columnShipAllocRslt_sno4_null_flg = p.ShipAllocRslt_sno_p_PPanel.columnSno_sno4_null_flg;
		p.columnShipAllocRslt_sno4_null_flg.addAliasName("ShipAllocRslt.sno4_null_flg", p);
		p.columnShipAllocRslt_sno4 = p.ShipAllocRslt_sno_p_PPanel.columnSno_sno4;
		p.columnShipAllocRslt_sno4.addAliasName("ShipAllocRslt.sno4", p);
		p.ShipAllocRslt_alloc_abl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.$alloc_abl_qty_p);
		p.ShipAllocRslt_alloc_abl_qty_p_PPanel.setName("ShipAllocRslt.alloc_abl_qty_p");
		p.columnShipAllocRslt_alloc_abl_qty = p.ShipAllocRslt_alloc_abl_qty_p_PPanel.columnQty_qty;
		p.columnShipAllocRslt_alloc_abl_qty.addAliasName("ShipAllocRslt.alloc_abl_qty", p);
		p.ShipAllocRslt_alloc_chng_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.$alloc_chng_qty_p);
		p.ShipAllocRslt_alloc_chng_qty_p_PPanel.setName("ShipAllocRslt.alloc_chng_qty_p");
		p.columnShipAllocRslt_alloc_chng_qty = p.ShipAllocRslt_alloc_chng_qty_p_PPanel.columnQty_qty;
		p.columnShipAllocRslt_alloc_chng_qty.addAliasName("ShipAllocRslt.alloc_chng_qty", p);
		p.ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.$alloc_abl_base_unit_qty_p);
		p.ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel.setName("ShipAllocRslt.alloc_abl_base_unit_qty_p");
		p.columnShipAllocRslt_alloc_abl_base_unit_qty = p.ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnShipAllocRslt_alloc_abl_base_unit_qty.addAliasName("ShipAllocRslt.alloc_abl_base_unit_qty", p);
		p.ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.$alloc_chng_base_unit_qty_p);
		p.ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel.setName("ShipAllocRslt.alloc_chng_base_unit_qty_p");
		p.columnShipAllocRslt_alloc_chng_base_unit_qty = p.ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnShipAllocRslt_alloc_chng_base_unit_qty.addAliasName("ShipAllocRslt.alloc_chng_base_unit_qty", p);
		p.ShipAllocRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.$itm_p);
		p.ShipAllocRslt_itm_p_PPanel.setName("ShipAllocRslt.itm_p");
		p.columnShipAllocRslt_itm_cd = p.ShipAllocRslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnShipAllocRslt_itm_cd.addAliasName("ShipAllocRslt.itm_cd", p);
		p.columnShipAllocRslt_itm_sub1 = p.ShipAllocRslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnShipAllocRslt_itm_sub1.addAliasName("ShipAllocRslt.itm_sub1", p);
		p.columnShipAllocRslt_itm_sub2 = p.ShipAllocRslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnShipAllocRslt_itm_sub2.addAliasName("ShipAllocRslt.itm_sub2", p);
		p.columnShipAllocRslt_itm_sub3 = p.ShipAllocRslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnShipAllocRslt_itm_sub3.addAliasName("ShipAllocRslt.itm_sub3", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_AllocChng p) {
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


	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_AllocChng create(){
		MSBEP_AllocChng p = new MSBEP_AllocChng();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_AllocChng create(String name){
		MSBEP_AllocChng p = new MSBEP_AllocChng(name);
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
		MSBEP_AllocChng_MC.jbfInitScreenOpe((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbfInitCnd((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbfInitShipSchdRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbfInitShipAllocRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbfInitBtn((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbInitScreenOpe((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbInitCnd((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbInitShipSchdRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbInitShipAllocRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.jbInitBtn((MSBEP_AllocChng)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_CHNG = p.beansFactory.createRadioButton("Cnd.ope_CHNG");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ship_schd_no_Label = p.beansFactory.createLabel("Cnd.ship_schd_no_Label");
		p.Cnd_ship_schd_no = p.beansFactory.createTextField("Cnd.ship_schd_no");
		p.Cnd_ship_schd_no.setLabel(p.Cnd_ship_schd_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [ShipSchdRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipSchdRslt(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.ShipSchdRsltPanel = p.beansFactory.createPanel("ShipSchdRslt");
		p.ShipSchdRsltTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.ShipSchdRslt_trd_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.trd_cd_Label");
		p.ShipSchdRslt_trd_cd = p.beansFactory.createTextField("ShipSchdRslt.trd_cd");
		p.ShipSchdRslt_trd_cd.setLabel(p.ShipSchdRslt_trd_cd_Label);
		p.ShipSchdRslt_trd_nm = p.beansFactory.createTextField("ShipSchdRslt.trd_nm");
		p.ShipSchdRslt_slo_no_Label = p.beansFactory.createLabel("ShipSchdRslt.slo_no_Label");
		p.ShipSchdRslt_slo_no = p.beansFactory.createTextField("ShipSchdRslt.slo_no");
		p.ShipSchdRslt_slo_no.setLabel(p.ShipSchdRslt_slo_no_Label);
		p.ShipSchdRslt_slo_d_no_Label = p.beansFactory.createLabel("ShipSchdRslt.slo_d_no_Label");
		p.ShipSchdRslt_slo_d_no = p.beansFactory.createTextField("ShipSchdRslt.slo_d_no");
		p.ShipSchdRslt_slo_d_no.setLabel(p.ShipSchdRslt_slo_d_no_Label);
		p.ShipSchdRslt_xfr_schd_no_Label = p.beansFactory.createLabel("ShipSchdRslt.xfr_schd_no_Label");
		p.ShipSchdRslt_xfr_schd_no = p.beansFactory.createTextField("ShipSchdRslt.xfr_schd_no");
		p.ShipSchdRslt_xfr_schd_no.setLabel(p.ShipSchdRslt_xfr_schd_no_Label);
		p.ShipSchdRslt_ship_schd_no_Label = p.beansFactory.createLabel("ShipSchdRslt.ship_schd_no_Label");
		p.ShipSchdRslt_ship_schd_no = p.beansFactory.createTextField("ShipSchdRslt.ship_schd_no");
		p.ShipSchdRslt_ship_schd_no.setLabel(p.ShipSchdRslt_ship_schd_no_Label);
		p.ShipSchdRslt_dlv_id_typ_Label = p.beansFactory.createLabel("ShipSchdRslt.dlv_id_typ_Label");
		p.ShipSchdRslt_dlv_id_typ = p.beansFactory.createTextField("ShipSchdRslt.dlv_id_typ");
		p.ShipSchdRslt_dlv_id_typ.setLabel(p.ShipSchdRslt_dlv_id_typ_Label);
		p.ShipSchdRslt_dlv_id_typ_nm = p.beansFactory.createTextField("ShipSchdRslt.dlv_id_typ_nm");
		p.ShipSchdRslt_dlv_id_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.dlv_id_cd_Label");
		p.ShipSchdRslt_dlv_id_cd = p.beansFactory.createTextField("ShipSchdRslt.dlv_id_cd");
		p.ShipSchdRslt_dlv_id_cd.setLabel(p.ShipSchdRslt_dlv_id_cd_Label);
		p.ShipSchdRslt_dlv_id_nm = p.beansFactory.createTextField("ShipSchdRslt.dlv_id_nm");
		p.ShipSchdRslt_cst_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.cst_cd_Label");
		p.ShipSchdRslt_cst_cd = p.beansFactory.createTextField("ShipSchdRslt.cst_cd");
		p.ShipSchdRslt_cst_cd.setLabel(p.ShipSchdRslt_cst_cd_Label);
		p.ShipSchdRslt_cst_nm = p.beansFactory.createTextField("ShipSchdRslt.cst_nm");
		p.ShipSchdRslt_ship_to_id_typ_Label = p.beansFactory.createLabel("ShipSchdRslt.ship_to_id_typ_Label");
		p.ShipSchdRslt_ship_to_id_typ = p.beansFactory.createTextField("ShipSchdRslt.ship_to_id_typ");
		p.ShipSchdRslt_ship_to_id_typ.setLabel(p.ShipSchdRslt_ship_to_id_typ_Label);
		p.ShipSchdRslt_ship_to_id_typ_nm = p.beansFactory.createTextField("ShipSchdRslt.ship_to_id_typ_nm");
		p.ShipSchdRslt_ship_to_id_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.ship_to_id_cd_Label");
		p.ShipSchdRslt_ship_to_id_cd = p.beansFactory.createTextField("ShipSchdRslt.ship_to_id_cd");
		p.ShipSchdRslt_ship_to_id_cd.setLabel(p.ShipSchdRslt_ship_to_id_cd_Label);
		p.ShipSchdRslt_ship_to_id_nm = p.beansFactory.createTextField("ShipSchdRslt.ship_to_id_nm");
		p.ShipSchdRslt_rqst_usr_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.rqst_usr_cd_Label");
		p.ShipSchdRslt_rqst_usr_cd = p.beansFactory.createTextField("ShipSchdRslt.rqst_usr_cd");
		p.ShipSchdRslt_rqst_usr_cd.setLabel(p.ShipSchdRslt_rqst_usr_cd_Label);
		p.ShipSchdRslt_rqst_usr_nm = p.beansFactory.createTextField("ShipSchdRslt.rqst_usr_nm");
		p.ShipSchdRslt_rqst_dpt_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.rqst_dpt_cd_Label");
		p.ShipSchdRslt_rqst_dpt_cd = p.beansFactory.createTextField("ShipSchdRslt.rqst_dpt_cd");
		p.ShipSchdRslt_rqst_dpt_cd.setLabel(p.ShipSchdRslt_rqst_dpt_cd_Label);
		p.ShipSchdRslt_rqst_dpt_nm = p.beansFactory.createTextField("ShipSchdRslt.rqst_dpt_nm");
		p.ShipSchdRslt_loc_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.loc_cd_Label");
		p.ShipSchdRslt_loc_cd = p.beansFactory.createTextField("ShipSchdRslt.loc_cd");
		p.ShipSchdRslt_loc_cd.setLabel(p.ShipSchdRslt_loc_cd_Label);
		p.ShipSchdRslt_loc_nm = p.beansFactory.createTextField("ShipSchdRslt.loc_nm");
		p.ShipSchdRslt_str_ln_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.str_ln_cd_Label");
		p.ShipSchdRslt_str_ln_cd = p.beansFactory.createTextField("ShipSchdRslt.str_ln_cd");
		p.ShipSchdRslt_str_ln_cd.setLabel(p.ShipSchdRslt_str_ln_cd_Label);
		p.ShipSchdRslt_str_ln_nm = p.beansFactory.createTextField("ShipSchdRslt.str_ln_nm");
		p.ShipSchdRslt_lot_no_Label = p.beansFactory.createLabel("ShipSchdRslt.lot_no_Label");
		p.ShipSchdRslt_lot_no = p.beansFactory.createTextField("ShipSchdRslt.lot_no");
		p.ShipSchdRslt_lot_no.setLabel(p.ShipSchdRslt_lot_no_Label);
		p.ShipSchdRslt_sublot_no = p.beansFactory.createTextField("ShipSchdRslt.sublot_no");
		p.ShipSchdRslt_ver_flg = p.beansFactory.createCheckBox("ShipSchdRslt.ver_flg");
		p.ShipSchdRslt_not_lot_mix_flg = p.beansFactory.createCheckBox("ShipSchdRslt.not_lot_mix_flg");
		p.ShipSchdRslt_not_sublot_mix_flg = p.beansFactory.createCheckBox("ShipSchdRslt.not_sublot_mix_flg");
		p.ShipSchdRslt_wg_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.wg_cd_Label");
		p.ShipSchdRslt_wg_cd = p.beansFactory.createTextField("ShipSchdRslt.wg_cd");
		p.ShipSchdRslt_wg_cd.setLabel(p.ShipSchdRslt_wg_cd_Label);
		p.ShipSchdRslt_wg_nm = p.beansFactory.createTextField("ShipSchdRslt.wg_nm");
		p.ShipSchdRslt_site_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.site_cd_Label");
		p.ShipSchdRslt_site_cd = p.beansFactory.createTextField("ShipSchdRslt.site_cd");
		p.ShipSchdRslt_site_cd.setLabel(p.ShipSchdRslt_site_cd_Label);
		p.ShipSchdRslt_site_nm = p.beansFactory.createTextField("ShipSchdRslt.site_nm");
		p.ShipSchdRslt_ship_lg_grp_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.ship_lg_grp_cd_Label");
		p.ShipSchdRslt_ship_lg_grp_cd = p.beansFactory.createTextField("ShipSchdRslt.ship_lg_grp_cd");
		p.ShipSchdRslt_ship_lg_grp_cd.setLabel(p.ShipSchdRslt_ship_lg_grp_cd_Label);
		p.ShipSchdRslt_ship_lg_grp_nm = p.beansFactory.createTextField("ShipSchdRslt.ship_lg_grp_nm");
		p.ShipSchdRslt_alloc_grp_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.alloc_grp_cd_Label");
		p.ShipSchdRslt_alloc_grp_cd = p.beansFactory.createTextField("ShipSchdRslt.alloc_grp_cd");
		p.ShipSchdRslt_alloc_grp_cd.setLabel(p.ShipSchdRslt_alloc_grp_cd_Label);
		p.ShipSchdRslt_alloc_grp_nm = p.beansFactory.createTextField("ShipSchdRslt.alloc_grp_nm");
		p.ShipSchdRslt_gd_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.gd_cd_Label");
		p.ShipSchdRslt_gd_cd = p.beansFactory.createTextField("ShipSchdRslt.gd_cd");
		p.ShipSchdRslt_gd_cd.setLabel(p.ShipSchdRslt_gd_cd_Label);
		p.ShipSchdRslt_gd_nm = p.beansFactory.createTextField("ShipSchdRslt.gd_nm");
		p.ShipSchdRslt_quality_typ_Label = p.beansFactory.createLabel("ShipSchdRslt.quality_typ_Label");
		p.ShipSchdRslt_quality_typ = p.beansFactory.createTextField("ShipSchdRslt.quality_typ");
		p.ShipSchdRslt_quality_typ.setLabel(p.ShipSchdRslt_quality_typ_Label);
		p.ShipSchdRslt_quality_typ_nm = p.beansFactory.createTextField("ShipSchdRslt.quality_typ_nm");
		p.ShipSchdRslt_stk_insp_typ_Label = p.beansFactory.createLabel("ShipSchdRslt.stk_insp_typ_Label");
		p.ShipSchdRslt_stk_insp_typ = p.beansFactory.createTextField("ShipSchdRslt.stk_insp_typ");
		p.ShipSchdRslt_stk_insp_typ.setLabel(p.ShipSchdRslt_stk_insp_typ_Label);
		p.ShipSchdRslt_stk_insp_typ_nm = p.beansFactory.createTextField("ShipSchdRslt.stk_insp_typ_nm");
		p.ShipSchdRslt_stk_id_typ_Label = p.beansFactory.createLabel("ShipSchdRslt.stk_id_typ_Label");
		p.ShipSchdRslt_stk_id_typ = p.beansFactory.createTextField("ShipSchdRslt.stk_id_typ");
		p.ShipSchdRslt_stk_id_typ.setLabel(p.ShipSchdRslt_stk_id_typ_Label);
		p.ShipSchdRslt_stk_id_typ_nm = p.beansFactory.createTextField("ShipSchdRslt.stk_id_typ_nm");
		p.ShipSchdRslt_stk_bp_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.stk_bp_cd_Label");
		p.ShipSchdRslt_stk_bp_cd = p.beansFactory.createTextField("ShipSchdRslt.stk_bp_cd");
		p.ShipSchdRslt_stk_bp_cd.setLabel(p.ShipSchdRslt_stk_bp_cd_Label);
		p.ShipSchdRslt_stk_bp_nm = p.beansFactory.createTextField("ShipSchdRslt.stk_bp_nm");
		p.ShipSchdRslt_ship_schd_split_typ_Label = p.beansFactory.createLabel("ShipSchdRslt.ship_schd_split_typ_Label");
		p.ShipSchdRslt_ship_schd_split_typ = p.beansFactory.createTextField("ShipSchdRslt.ship_schd_split_typ");
		p.ShipSchdRslt_ship_schd_split_typ.setLabel(p.ShipSchdRslt_ship_schd_split_typ_Label);
		p.ShipSchdRslt_ship_schd_split_typ_nm = p.beansFactory.createTextField("ShipSchdRslt.ship_schd_split_typ_nm");
		p.ShipSchdRslt_alloc_scope_typ_Label = p.beansFactory.createLabel("ShipSchdRslt.alloc_scope_typ_Label");
		p.ShipSchdRslt_alloc_scope_typ = p.beansFactory.createTextField("ShipSchdRslt.alloc_scope_typ");
		p.ShipSchdRslt_alloc_scope_typ.setLabel(p.ShipSchdRslt_alloc_scope_typ_Label);
		p.ShipSchdRslt_alloc_scope_typ_nm = p.beansFactory.createTextField("ShipSchdRslt.alloc_scope_typ_nm");
		p.ShipSchdRslt_not_lg_mix_flg = p.beansFactory.createCheckBox("ShipSchdRslt.not_lg_mix_flg");
		p.ShipSchdRslt_dlv_rqst_dt_Label = p.beansFactory.createLabel("ShipSchdRslt.dlv_rqst_dt_Label");
		p.ShipSchdRslt_dlv_rqst_dt = p.beansFactory.createDateField("ShipSchdRslt.dlv_rqst_dt");
		p.ShipSchdRslt_dlv_rqst_dt.setLabel(p.ShipSchdRslt_dlv_rqst_dt_Label);
		p.ShipSchdRslt_dlv_rqst_hm = p.beansFactory.createDateField("ShipSchdRslt.dlv_rqst_hm");
		p.ShipSchdRslt_ship_rqst_dt_Label = p.beansFactory.createLabel("ShipSchdRslt.ship_rqst_dt_Label");
		p.ShipSchdRslt_ship_rqst_dt = p.beansFactory.createDateField("ShipSchdRslt.ship_rqst_dt");
		p.ShipSchdRslt_ship_rqst_dt.setLabel(p.ShipSchdRslt_ship_rqst_dt_Label);
		p.ShipSchdRslt_ship_rqst_hm = p.beansFactory.createDateField("ShipSchdRslt.ship_rqst_hm");
		p.ShipSchdRslt_pd_inst_dlv_dt_Label = p.beansFactory.createLabel("ShipSchdRslt.pd_inst_dlv_dt_Label");
		p.ShipSchdRslt_pd_inst_dlv_dt = p.beansFactory.createDateField("ShipSchdRslt.pd_inst_dlv_dt");
		p.ShipSchdRslt_pd_inst_dlv_dt.setLabel(p.ShipSchdRslt_pd_inst_dlv_dt_Label);
		p.ShipSchdRslt_pd_inst_dlv_hm = p.beansFactory.createDateField("ShipSchdRslt.pd_inst_dlv_hm");
		p.ShipSchdRslt_dlv_inst_dt_Label = p.beansFactory.createLabel("ShipSchdRslt.dlv_inst_dt_Label");
		p.ShipSchdRslt_dlv_inst_dt = p.beansFactory.createDateField("ShipSchdRslt.dlv_inst_dt");
		p.ShipSchdRslt_dlv_inst_dt.setLabel(p.ShipSchdRslt_dlv_inst_dt_Label);
		p.ShipSchdRslt_dlv_inst_hm = p.beansFactory.createDateField("ShipSchdRslt.dlv_inst_hm");
		p.ShipSchdRslt_ship_schd_dt_Label = p.beansFactory.createLabel("ShipSchdRslt.ship_schd_dt_Label");
		p.ShipSchdRslt_ship_schd_dt = p.beansFactory.createDateField("ShipSchdRslt.ship_schd_dt");
		p.ShipSchdRslt_ship_schd_dt.setLabel(p.ShipSchdRslt_ship_schd_dt_Label);
		p.ShipSchdRslt_ship_schd_hm = p.beansFactory.createDateField("ShipSchdRslt.ship_schd_hm");
		p.ShipSchdRslt_dlv_schd_dt_Label = p.beansFactory.createLabel("ShipSchdRslt.dlv_schd_dt_Label");
		p.ShipSchdRslt_dlv_schd_dt = p.beansFactory.createDateField("ShipSchdRslt.dlv_schd_dt");
		p.ShipSchdRslt_dlv_schd_dt.setLabel(p.ShipSchdRslt_dlv_schd_dt_Label);
		p.ShipSchdRslt_dlv_schd_hm = p.beansFactory.createDateField("ShipSchdRslt.dlv_schd_hm");
		p.ShipSchdRslt_ship_block_flg = p.beansFactory.createCheckBox("ShipSchdRslt.ship_block_flg");
		p.ShipSchdRslt_pack_alloc_flg = p.beansFactory.createCheckBox("ShipSchdRslt.pack_alloc_flg");
		p.ShipSchdRslt_trd_unit_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.trd_unit_cd_Label");
		p.ShipSchdRslt_trd_unit_cd = p.beansFactory.createTextField("ShipSchdRslt.trd_unit_cd");
		p.ShipSchdRslt_trd_unit_cd.setLabel(p.ShipSchdRslt_trd_unit_cd_Label);
		p.ShipSchdRslt_trd_unit_nm = p.beansFactory.createTextField("ShipSchdRslt.trd_unit_nm");
		p.ShipSchdRslt_trd_unit_dec_place = p.beansFactory.createNumberField("ShipSchdRslt.trd_unit_dec_place");
		p.ShipSchdRslt_base_unit_cd_Label = p.beansFactory.createLabel("ShipSchdRslt.base_unit_cd_Label");
		p.ShipSchdRslt_base_unit_cd = p.beansFactory.createTextField("ShipSchdRslt.base_unit_cd");
		p.ShipSchdRslt_base_unit_cd.setLabel(p.ShipSchdRslt_base_unit_cd_Label);
		p.ShipSchdRslt_base_unit_nm = p.beansFactory.createTextField("ShipSchdRslt.base_unit_nm");
		p.ShipSchdRslt_base_unit_dec_place = p.beansFactory.createNumberField("ShipSchdRslt.base_unit_dec_place");
		p.ShipSchdRslt_ship_pr_upd_cntr = p.beansFactory.createNumberField("ShipSchdRslt.ship_pr_upd_cntr");
	}

	/**
	 * [ShipAllocRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipAllocRslt(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.ShipAllocRsltPanel = p.beansFactory.createPanel("ShipAllocRslt");
		p.ShipAllocRsltTitledBorder = p.beansFactory.createTitledBorder();
		p.ShipAllocRsltScrollPane = p.beansFactory.createScrollPane("ShipAllocRslt.scroll");
		p.createShipAllocRsltTable();
		// ブロックの項目の初期化
		p.columnShipAllocRslt_slo_no = p.beansFactory.createTableColumn("ShipAllocRslt.slo_no", MCColumnType.TEXT);
		p.columnShipAllocRslt_slo_d_no = p.beansFactory.createTableColumn("ShipAllocRslt.slo_d_no", MCColumnType.TEXT);
		p.columnShipAllocRslt_xfr_schd_no = p.beansFactory.createTableColumn("ShipAllocRslt.xfr_schd_no", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_schd_no = p.beansFactory.createTableColumn("ShipAllocRslt.ship_schd_no", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_alloc_sts_no = p.beansFactory.createTableColumn("ShipAllocRslt.ship_alloc_sts_no", MCColumnType.TEXT);
		p.columnShipAllocRslt_vstk_in_schd_flg = p.beansFactory.createTableColumn("ShipAllocRslt.vstk_in_schd_flg", MCColumnType.CHECK);
		p.columnShipAllocRslt_cst_cd = p.beansFactory.createTableColumn("ShipAllocRslt.cst_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_cst_nm = p.beansFactory.createTableColumn("ShipAllocRslt.cst_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_loc_cd = p.beansFactory.createTableColumn("ShipAllocRslt.ship_loc_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_loc_nm = p.beansFactory.createTableColumn("ShipAllocRslt.ship_loc_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_wg_cd = p.beansFactory.createTableColumn("ShipAllocRslt.wg_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_wg_nm = p.beansFactory.createTableColumn("ShipAllocRslt.wg_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_site_cd = p.beansFactory.createTableColumn("ShipAllocRslt.site_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_site_nm = p.beansFactory.createTableColumn("ShipAllocRslt.site_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("ShipAllocRslt.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_fr_lg_grp_nm = p.beansFactory.createTableColumn("ShipAllocRslt.ship_fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_alloc_grp_cd = p.beansFactory.createTableColumn("ShipAllocRslt.alloc_grp_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_alloc_grp_nm = p.beansFactory.createTableColumn("ShipAllocRslt.alloc_grp_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_ver_flg = p.beansFactory.createTableColumn("ShipAllocRslt.ver_flg", MCColumnType.CHECK);
		p.columnShipAllocRslt_not_lot_mix_flg = p.beansFactory.createTableColumn("ShipAllocRslt.not_lot_mix_flg", MCColumnType.CHECK);
		p.columnShipAllocRslt_not_sublot_mix_flg = p.beansFactory.createTableColumn("ShipAllocRslt.not_sublot_mix_flg", MCColumnType.CHECK);
		p.columnShipAllocRslt_stk_id_typ = p.beansFactory.createTableColumn("ShipAllocRslt.stk_id_typ", MCColumnType.TEXT);
		p.columnShipAllocRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("ShipAllocRslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_stk_bp_cd = p.beansFactory.createTableColumn("ShipAllocRslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_stk_bp_nm = p.beansFactory.createTableColumn("ShipAllocRslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_pack_unit_cd = p.beansFactory.createTableColumn("ShipAllocRslt.pack_unit_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_pack_unit_nm = p.beansFactory.createTableColumn("ShipAllocRslt.pack_unit_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_pack_unit_dec_place = p.beansFactory.createTableColumn("ShipAllocRslt.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnShipAllocRslt_pack_unit_conv_base_qty = p.beansFactory.createTableColumn("ShipAllocRslt.pack_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnShipAllocRslt_pack_unit_conv_qty = p.beansFactory.createTableColumn("ShipAllocRslt.pack_unit_conv_qty", MCColumnType.NUMBER);
		p.columnShipAllocRslt_base_unit_cd = p.beansFactory.createTableColumn("ShipAllocRslt.base_unit_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_base_unit_nm = p.beansFactory.createTableColumn("ShipAllocRslt.base_unit_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_base_unit_dec_place = p.beansFactory.createTableColumn("ShipAllocRslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnShipAllocRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("ShipAllocRslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnShipAllocRslt_dlv_rqst_dt = p.beansFactory.createTableColumn("ShipAllocRslt.dlv_rqst_dt", MCColumnType.DATE);
		p.columnShipAllocRslt_dlv_rqst_hm = p.beansFactory.createTableColumn("ShipAllocRslt.dlv_rqst_hm", MCColumnType.DATE);
		p.columnShipAllocRslt_ship_rqst_dt = p.beansFactory.createTableColumn("ShipAllocRslt.ship_rqst_dt", MCColumnType.DATE);
		p.columnShipAllocRslt_ship_rqst_hm = p.beansFactory.createTableColumn("ShipAllocRslt.ship_rqst_hm", MCColumnType.DATE);
		p.columnShipAllocRslt_pd_inst_dlv_dt = p.beansFactory.createTableColumn("ShipAllocRslt.pd_inst_dlv_dt", MCColumnType.DATE);
		p.columnShipAllocRslt_pd_inst_dlv_hm = p.beansFactory.createTableColumn("ShipAllocRslt.pd_inst_dlv_hm", MCColumnType.DATE);
		p.columnShipAllocRslt_dlv_inst_dt = p.beansFactory.createTableColumn("ShipAllocRslt.dlv_inst_dt", MCColumnType.DATE);
		p.columnShipAllocRslt_dlv_inst_hm = p.beansFactory.createTableColumn("ShipAllocRslt.dlv_inst_hm", MCColumnType.DATE);
		p.columnShipAllocRslt_ship_schd_dt = p.beansFactory.createTableColumn("ShipAllocRslt.ship_schd_dt", MCColumnType.DATE);
		p.columnShipAllocRslt_ship_schd_hm = p.beansFactory.createTableColumn("ShipAllocRslt.ship_schd_hm", MCColumnType.DATE);
		p.columnShipAllocRslt_dlv_schd_dt = p.beansFactory.createTableColumn("ShipAllocRslt.dlv_schd_dt", MCColumnType.DATE);
		p.columnShipAllocRslt_dlv_schd_hm = p.beansFactory.createTableColumn("ShipAllocRslt.dlv_schd_hm", MCColumnType.DATE);
		p.columnShipAllocRslt_rqst_usr_cd = p.beansFactory.createTableColumn("ShipAllocRslt.rqst_usr_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_rqst_usr_nm = p.beansFactory.createTableColumn("ShipAllocRslt.rqst_usr_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_rqst_dpt_cd = p.beansFactory.createTableColumn("ShipAllocRslt.rqst_dpt_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_rqst_dpt_nm = p.beansFactory.createTableColumn("ShipAllocRslt.rqst_dpt_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_to_id_typ = p.beansFactory.createTableColumn("ShipAllocRslt.ship_to_id_typ", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_to_id_typ_nm = p.beansFactory.createTableColumn("ShipAllocRslt.ship_to_id_typ_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_to_id_cd = p.beansFactory.createTableColumn("ShipAllocRslt.ship_to_id_cd", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_to_id_nm = p.beansFactory.createTableColumn("ShipAllocRslt.ship_to_id_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_alloc_scope_typ = p.beansFactory.createTableColumn("ShipAllocRslt.alloc_scope_typ", MCColumnType.TEXT);
		p.columnShipAllocRslt_alloc_scope_typ_nm = p.beansFactory.createTableColumn("ShipAllocRslt.alloc_scope_typ_nm", MCColumnType.TEXT);
		p.columnShipAllocRslt_not_lg_mix_flg = p.beansFactory.createTableColumn("ShipAllocRslt.not_lg_mix_flg", MCColumnType.CHECK);
		p.columnShipAllocRslt_ship_pr_no = p.beansFactory.createTableColumn("ShipAllocRslt.ship_pr_no", MCColumnType.TEXT);
		p.columnShipAllocRslt_ship_pr_upd_cntr = p.beansFactory.createTableColumn("ShipAllocRslt.ship_pr_upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.ShipSchdRsltPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_CHNG);
		p.Cnd_ope_CHNG.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_CHNG);
		p.ScreenOpePanel.add(p.Cnd_ope_CHNG);
		p.Cnd_ope_CHNG.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0120.CndR.ope_META);
		p.CndPanel.add(p.Cnd_ship_schd_no_Label);
		p.CndPanel.add(p.Cnd_ship_schd_no);
		p.CndPanel.setLastBeans(p.Cnd_ship_schd_no);
		p.Cnd_ship_schd_no.setNextBeans(p.Cnd_srch);
		p.Cnd_ship_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0120.CndR.ship_schd_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [ShipSchdRslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipSchdRslt(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.ShipSchdRsltPanel.setBorder(p.ShipSchdRsltTitledBorder);
		p.add(p.ShipSchdRsltPanel);
		p.ShipSchdRsltPanel.setNextBeans(p.ShipAllocRsltPanel);
		p.ShipSchdRsltPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_trd_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_trd_cd);
		p.ShipSchdRsltPanel.setLastBeans(p.ShipSchdRslt_trd_cd);
		p.ShipSchdRslt_trd_cd.setNextBeans(p.ShipSchdRslt_trd_nm);
		p.ShipSchdRslt_trd_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.trd_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_trd_nm);
		p.ShipSchdRslt_trd_nm.setNextBeans(p.ShipSchdRslt_slo_no);
		p.ShipSchdRslt_trd_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.trd_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_slo_no_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_slo_no);
		p.ShipSchdRslt_slo_no.setNextBeans(p.ShipSchdRslt_slo_d_no);
		p.ShipSchdRslt_slo_no.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.slo_no_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_slo_d_no_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_slo_d_no);
		p.ShipSchdRslt_slo_d_no.setNextBeans(p.ShipSchdRslt_xfr_schd_no);
		p.ShipSchdRslt_slo_d_no.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.slo_d_no_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_xfr_schd_no_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_xfr_schd_no);
		p.ShipSchdRslt_xfr_schd_no.setNextBeans(p.ShipSchdRslt_ship_schd_no);
		p.ShipSchdRslt_xfr_schd_no.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.xfr_schd_no_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_schd_no_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_schd_no);
		p.ShipSchdRslt_ship_schd_no.setNextBeans(p.ShipSchdRslt_dlv_id_typ);
		p.ShipSchdRslt_ship_schd_no.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_schd_no_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_id_typ_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_id_typ);
		p.ShipSchdRslt_dlv_id_typ.setNextBeans(p.ShipSchdRslt_dlv_id_typ_nm);
		p.ShipSchdRslt_dlv_id_typ.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_id_typ_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_id_typ_nm);
		p.ShipSchdRslt_dlv_id_typ_nm.setNextBeans(p.ShipSchdRslt_dlv_id_cd);
		p.ShipSchdRslt_dlv_id_typ_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_id_typ_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_id_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_id_cd);
		p.ShipSchdRslt_dlv_id_cd.setNextBeans(p.ShipSchdRslt_dlv_id_nm);
		p.ShipSchdRslt_dlv_id_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_id_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_id_nm);
		p.ShipSchdRslt_dlv_id_nm.setNextBeans(p.ShipSchdRslt_cst_cd);
		p.ShipSchdRslt_dlv_id_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_id_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_cst_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_cst_cd);
		p.ShipSchdRslt_cst_cd.setNextBeans(p.ShipSchdRslt_cst_nm);
		p.ShipSchdRslt_cst_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.cst_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_cst_nm);
		p.ShipSchdRslt_cst_nm.setNextBeans(p.ShipSchdRslt_ship_to_id_typ);
		p.ShipSchdRslt_cst_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.cst_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_to_id_typ_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_to_id_typ);
		p.ShipSchdRslt_ship_to_id_typ.setNextBeans(p.ShipSchdRslt_ship_to_id_typ_nm);
		p.ShipSchdRslt_ship_to_id_typ.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_to_id_typ_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_to_id_typ_nm);
		p.ShipSchdRslt_ship_to_id_typ_nm.setNextBeans(p.ShipSchdRslt_ship_to_id_cd);
		p.ShipSchdRslt_ship_to_id_typ_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_to_id_typ_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_to_id_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_to_id_cd);
		p.ShipSchdRslt_ship_to_id_cd.setNextBeans(p.ShipSchdRslt_ship_to_id_nm);
		p.ShipSchdRslt_ship_to_id_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_to_id_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_to_id_nm);
		p.ShipSchdRslt_ship_to_id_nm.setNextBeans(p.ShipSchdRslt_rqst_usr_cd);
		p.ShipSchdRslt_ship_to_id_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_to_id_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_rqst_usr_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_rqst_usr_cd);
		p.ShipSchdRslt_rqst_usr_cd.setNextBeans(p.ShipSchdRslt_rqst_usr_nm);
		p.ShipSchdRslt_rqst_usr_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.rqst_usr_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_rqst_usr_nm);
		p.ShipSchdRslt_rqst_usr_nm.setNextBeans(p.ShipSchdRslt_rqst_dpt_cd);
		p.ShipSchdRslt_rqst_usr_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.rqst_usr_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_rqst_dpt_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_rqst_dpt_cd);
		p.ShipSchdRslt_rqst_dpt_cd.setNextBeans(p.ShipSchdRslt_rqst_dpt_nm);
		p.ShipSchdRslt_rqst_dpt_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.rqst_dpt_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_rqst_dpt_nm);
		p.ShipSchdRslt_rqst_dpt_nm.setNextBeans(p.ShipSchdRslt_loc_cd);
		p.ShipSchdRslt_rqst_dpt_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.rqst_dpt_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_loc_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_loc_cd);
		p.ShipSchdRslt_loc_cd.setNextBeans(p.ShipSchdRslt_loc_nm);
		p.ShipSchdRslt_loc_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.loc_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_loc_nm);
		p.ShipSchdRslt_loc_nm.setNextBeans(p.ShipSchdRslt_str_ln_cd);
		p.ShipSchdRslt_loc_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.loc_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_str_ln_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_str_ln_cd);
		p.ShipSchdRslt_str_ln_cd.setNextBeans(p.ShipSchdRslt_str_ln_nm);
		p.ShipSchdRslt_str_ln_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.str_ln_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_str_ln_nm);
		p.ShipSchdRslt_str_ln_nm.setNextBeans(p.ShipSchdRslt_lot_no);
		p.ShipSchdRslt_str_ln_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.str_ln_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_lot_no_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_lot_no);
		p.ShipSchdRslt_lot_no.setNextBeans(p.ShipSchdRslt_sublot_no);
		p.ShipSchdRslt_lot_no.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.lot_no_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_sublot_no);
		p.ShipSchdRslt_sublot_no.setNextBeans(p.ShipSchdRslt_ver_no_p_PPanel);
		p.ShipSchdRslt_sublot_no.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.sublot_no_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ver_no_p_PPanel);
		p.ShipSchdRslt_ver_no_p_PPanel.setNextBeans(p.ShipSchdRslt_ver_flg);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ver_flg);
		p.ShipSchdRslt_ver_flg.setNextBeans(p.ShipSchdRslt_not_lot_mix_flg);
		p.ShipSchdRslt_ver_flg.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ver_flg_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_not_lot_mix_flg);
		p.ShipSchdRslt_not_lot_mix_flg.setNextBeans(p.ShipSchdRslt_not_sublot_mix_flg);
		p.ShipSchdRslt_not_lot_mix_flg.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.not_lot_mix_flg_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_not_sublot_mix_flg);
		p.ShipSchdRslt_not_sublot_mix_flg.setNextBeans(p.ShipSchdRslt_wg_cd);
		p.ShipSchdRslt_not_sublot_mix_flg.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.not_sublot_mix_flg_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_wg_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_wg_cd);
		p.ShipSchdRslt_wg_cd.setNextBeans(p.ShipSchdRslt_wg_nm);
		p.ShipSchdRslt_wg_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.wg_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_wg_nm);
		p.ShipSchdRslt_wg_nm.setNextBeans(p.ShipSchdRslt_site_cd);
		p.ShipSchdRslt_wg_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.wg_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_site_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_site_cd);
		p.ShipSchdRslt_site_cd.setNextBeans(p.ShipSchdRslt_site_nm);
		p.ShipSchdRslt_site_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.site_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_site_nm);
		p.ShipSchdRslt_site_nm.setNextBeans(p.ShipSchdRslt_ship_lg_grp_cd);
		p.ShipSchdRslt_site_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.site_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_lg_grp_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_lg_grp_cd);
		p.ShipSchdRslt_ship_lg_grp_cd.setNextBeans(p.ShipSchdRslt_ship_lg_grp_nm);
		p.ShipSchdRslt_ship_lg_grp_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_lg_grp_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_lg_grp_nm);
		p.ShipSchdRslt_ship_lg_grp_nm.setNextBeans(p.ShipSchdRslt_alloc_grp_cd);
		p.ShipSchdRslt_ship_lg_grp_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_lg_grp_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_alloc_grp_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_alloc_grp_cd);
		p.ShipSchdRslt_alloc_grp_cd.setNextBeans(p.ShipSchdRslt_alloc_grp_nm);
		p.ShipSchdRslt_alloc_grp_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.alloc_grp_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_alloc_grp_nm);
		p.ShipSchdRslt_alloc_grp_nm.setNextBeans(p.ShipSchdRslt_itm_p_PPanel);
		p.ShipSchdRslt_alloc_grp_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.alloc_grp_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_itm_p_PPanel);
		p.ShipSchdRslt_itm_p_PPanel.setNextBeans(p.ShipSchdRslt_gd_cd);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_gd_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_gd_cd);
		p.ShipSchdRslt_gd_cd.setNextBeans(p.ShipSchdRslt_gd_nm);
		p.ShipSchdRslt_gd_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.gd_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_gd_nm);
		p.ShipSchdRslt_gd_nm.setNextBeans(p.ShipSchdRslt_quality_typ);
		p.ShipSchdRslt_gd_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.gd_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_quality_typ_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_quality_typ);
		p.ShipSchdRslt_quality_typ.setNextBeans(p.ShipSchdRslt_quality_typ_nm);
		p.ShipSchdRslt_quality_typ.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.quality_typ_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_quality_typ_nm);
		p.ShipSchdRslt_quality_typ_nm.setNextBeans(p.ShipSchdRslt_stk_insp_typ);
		p.ShipSchdRslt_quality_typ_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.quality_typ_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_stk_insp_typ_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_stk_insp_typ);
		p.ShipSchdRslt_stk_insp_typ.setNextBeans(p.ShipSchdRslt_stk_insp_typ_nm);
		p.ShipSchdRslt_stk_insp_typ.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.stk_insp_typ_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_stk_insp_typ_nm);
		p.ShipSchdRslt_stk_insp_typ_nm.setNextBeans(p.ShipSchdRslt_stk_id_typ);
		p.ShipSchdRslt_stk_insp_typ_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.stk_insp_typ_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_stk_id_typ_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_stk_id_typ);
		p.ShipSchdRslt_stk_id_typ.setNextBeans(p.ShipSchdRslt_stk_id_typ_nm);
		p.ShipSchdRslt_stk_id_typ.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.stk_id_typ_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_stk_id_typ_nm);
		p.ShipSchdRslt_stk_id_typ_nm.setNextBeans(p.ShipSchdRslt_stk_bp_cd);
		p.ShipSchdRslt_stk_id_typ_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.stk_id_typ_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_stk_bp_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_stk_bp_cd);
		p.ShipSchdRslt_stk_bp_cd.setNextBeans(p.ShipSchdRslt_stk_bp_nm);
		p.ShipSchdRslt_stk_bp_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.stk_bp_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_stk_bp_nm);
		p.ShipSchdRslt_stk_bp_nm.setNextBeans(p.ShipSchdRslt_sno_p_PPanel);
		p.ShipSchdRslt_stk_bp_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.stk_bp_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_sno_p_PPanel);
		p.ShipSchdRslt_sno_p_PPanel.setNextBeans(p.ShipSchdRslt_ship_schd_split_typ);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_schd_split_typ_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_schd_split_typ);
		p.ShipSchdRslt_ship_schd_split_typ.setNextBeans(p.ShipSchdRslt_ship_schd_split_typ_nm);
		p.ShipSchdRslt_ship_schd_split_typ.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_schd_split_typ_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_schd_split_typ_nm);
		p.ShipSchdRslt_ship_schd_split_typ_nm.setNextBeans(p.ShipSchdRslt_alloc_scope_typ);
		p.ShipSchdRslt_ship_schd_split_typ_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_schd_split_typ_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_alloc_scope_typ_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_alloc_scope_typ);
		p.ShipSchdRslt_alloc_scope_typ.setNextBeans(p.ShipSchdRslt_alloc_scope_typ_nm);
		p.ShipSchdRslt_alloc_scope_typ.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.alloc_scope_typ_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_alloc_scope_typ_nm);
		p.ShipSchdRslt_alloc_scope_typ_nm.setNextBeans(p.ShipSchdRslt_not_lg_mix_flg);
		p.ShipSchdRslt_alloc_scope_typ_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.alloc_scope_typ_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_not_lg_mix_flg);
		p.ShipSchdRslt_not_lg_mix_flg.setNextBeans(p.ShipSchdRslt_dlv_rqst_dt);
		p.ShipSchdRslt_not_lg_mix_flg.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.not_lg_mix_flg_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_rqst_dt_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_rqst_dt);
		p.ShipSchdRslt_dlv_rqst_dt.setNextBeans(p.ShipSchdRslt_dlv_rqst_hm);
		p.ShipSchdRslt_dlv_rqst_dt.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_rqst_dt_META);
		p.ShipSchdRslt_dlv_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_rqst_hm);
		p.ShipSchdRslt_dlv_rqst_hm.setNextBeans(p.ShipSchdRslt_ship_rqst_dt);
		p.ShipSchdRslt_dlv_rqst_hm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_rqst_hm_META);
		p.ShipSchdRslt_dlv_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_rqst_dt_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_rqst_dt);
		p.ShipSchdRslt_ship_rqst_dt.setNextBeans(p.ShipSchdRslt_ship_rqst_hm);
		p.ShipSchdRslt_ship_rqst_dt.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_rqst_dt_META);
		p.ShipSchdRslt_ship_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_rqst_hm);
		p.ShipSchdRslt_ship_rqst_hm.setNextBeans(p.ShipSchdRslt_pd_inst_dlv_dt);
		p.ShipSchdRslt_ship_rqst_hm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_rqst_hm_META);
		p.ShipSchdRslt_ship_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_pd_inst_dlv_dt_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_pd_inst_dlv_dt);
		p.ShipSchdRslt_pd_inst_dlv_dt.setNextBeans(p.ShipSchdRslt_pd_inst_dlv_hm);
		p.ShipSchdRslt_pd_inst_dlv_dt.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.pd_inst_dlv_dt_META);
		p.ShipSchdRslt_pd_inst_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_pd_inst_dlv_hm);
		p.ShipSchdRslt_pd_inst_dlv_hm.setNextBeans(p.ShipSchdRslt_dlv_inst_dt);
		p.ShipSchdRslt_pd_inst_dlv_hm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.pd_inst_dlv_hm_META);
		p.ShipSchdRslt_pd_inst_dlv_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_inst_dt_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_inst_dt);
		p.ShipSchdRslt_dlv_inst_dt.setNextBeans(p.ShipSchdRslt_dlv_inst_hm);
		p.ShipSchdRslt_dlv_inst_dt.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_inst_dt_META);
		p.ShipSchdRslt_dlv_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_inst_hm);
		p.ShipSchdRslt_dlv_inst_hm.setNextBeans(p.ShipSchdRslt_ship_schd_dt);
		p.ShipSchdRslt_dlv_inst_hm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_inst_hm_META);
		p.ShipSchdRslt_dlv_inst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_schd_dt_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_schd_dt);
		p.ShipSchdRslt_ship_schd_dt.setNextBeans(p.ShipSchdRslt_ship_schd_hm);
		p.ShipSchdRslt_ship_schd_dt.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_schd_dt_META);
		p.ShipSchdRslt_ship_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_schd_hm);
		p.ShipSchdRslt_ship_schd_hm.setNextBeans(p.ShipSchdRslt_dlv_schd_dt);
		p.ShipSchdRslt_ship_schd_hm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_schd_hm_META);
		p.ShipSchdRslt_ship_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_schd_dt_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_schd_dt);
		p.ShipSchdRslt_dlv_schd_dt.setNextBeans(p.ShipSchdRslt_dlv_schd_hm);
		p.ShipSchdRslt_dlv_schd_dt.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_schd_dt_META);
		p.ShipSchdRslt_dlv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_dlv_schd_hm);
		p.ShipSchdRslt_dlv_schd_hm.setNextBeans(p.ShipSchdRslt_ship_block_flg);
		p.ShipSchdRslt_dlv_schd_hm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.dlv_schd_hm_META);
		p.ShipSchdRslt_dlv_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_block_flg);
		p.ShipSchdRslt_ship_block_flg.setNextBeans(p.ShipSchdRslt_pack_alloc_flg);
		p.ShipSchdRslt_ship_block_flg.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_block_flg_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_pack_alloc_flg);
		p.ShipSchdRslt_pack_alloc_flg.setNextBeans(p.ShipSchdRslt_trd_unit_cd);
		p.ShipSchdRslt_pack_alloc_flg.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.pack_alloc_flg_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_trd_unit_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_trd_unit_cd);
		p.ShipSchdRslt_trd_unit_cd.setNextBeans(p.ShipSchdRslt_trd_unit_nm);
		p.ShipSchdRslt_trd_unit_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.trd_unit_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_trd_unit_nm);
		p.ShipSchdRslt_trd_unit_nm.setNextBeans(p.ShipSchdRslt_trd_unit_dec_place);
		p.ShipSchdRslt_trd_unit_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.trd_unit_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_trd_unit_dec_place);
		p.ShipSchdRslt_trd_unit_dec_place.setNextBeans(p.ShipSchdRslt_trd_unit_qty_p_PPanel);
		p.ShipSchdRslt_trd_unit_dec_place.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.trd_unit_dec_place_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_trd_unit_qty_p_PPanel);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.setNextBeans(p.ShipSchdRslt_base_unit_cd);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_base_unit_cd_Label);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_base_unit_cd);
		p.ShipSchdRslt_base_unit_cd.setNextBeans(p.ShipSchdRslt_base_unit_nm);
		p.ShipSchdRslt_base_unit_cd.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.base_unit_cd_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_base_unit_nm);
		p.ShipSchdRslt_base_unit_nm.setNextBeans(p.ShipSchdRslt_base_unit_dec_place);
		p.ShipSchdRslt_base_unit_nm.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.base_unit_nm_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_base_unit_dec_place);
		p.ShipSchdRslt_base_unit_dec_place.setNextBeans(p.ShipSchdRslt_base_unit_qty_p_PPanel);
		p.ShipSchdRslt_base_unit_dec_place.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.base_unit_dec_place_META);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_base_unit_qty_p_PPanel);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.setNextBeans(p.ShipSchdRslt_alloc_qty_p_PPanel);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_alloc_qty_p_PPanel);
		p.ShipSchdRslt_alloc_qty_p_PPanel.setNextBeans(p.ShipSchdRslt_wait_qty_p_PPanel);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_wait_qty_p_PPanel);
		p.ShipSchdRslt_wait_qty_p_PPanel.setNextBeans(p.ShipSchdRslt_wait_rem_qty_p_PPanel);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_wait_rem_qty_p_PPanel);
		p.ShipSchdRslt_wait_rem_qty_p_PPanel.setNextBeans(p.ShipSchdRslt_ship_pr_upd_cntr);
		p.ShipSchdRsltPanel.add(p.ShipSchdRslt_ship_pr_upd_cntr);
		p.ShipSchdRslt_ship_pr_upd_cntr.setRow(p.getShipSchdRsltR(), mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.ship_pr_upd_cntr_META);
	}

	/**
	 * [ShipAllocRslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipAllocRslt(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.ShipAllocRsltPanel.setBorder(p.ShipAllocRsltTitledBorder);
		p.add(p.ShipAllocRsltPanel);
		p.ShipAllocRsltPanel.setNextBeans(p.BtnPanel);
		p.ShipAllocRsltPanel.add(p.ShipAllocRsltScrollPane);
		p.ShipAllocRsltPanel.setLastBeans(p.ShipAllocRsltTable);
		p.ShipAllocRsltScrollPane.setViewportView(p.ShipAllocRsltTable);
		p.ShipAllocRsltTable.setList(p.getShipAllocRsltL());
		p.ShipAllocRsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_AllocChng p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBEP_AllocChng_MC.mcInitScreenOpe((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.mcInitCnd((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.mcInitShipSchdRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.mcInitShipAllocRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.mcInitBtn((MSBEP_AllocChng)this);

		// [UPD]ステータスのモードの設定
		MSBEP_AllocChng_MC.statusInitUPD_ScreenOpe((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitUPD_Cnd((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitUPD_ShipSchdRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitUPD_ShipAllocRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitUPD_Btn((MSBEP_AllocChng)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_AllocChng_MC.statusInitFIX__U_ScreenOpe((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitFIX__U_Cnd((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitFIX__U_ShipSchdRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitFIX__U_ShipAllocRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitFIX__U_Btn((MSBEP_AllocChng)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_AllocChng_MC.statusInitSRCH_ScreenOpe((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitSRCH_Cnd((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitSRCH_ShipSchdRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitSRCH_ShipAllocRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitSRCH_Btn((MSBEP_AllocChng)this);

		// [REF]ステータスのモードの設定
		MSBEP_AllocChng_MC.statusInitREF_ScreenOpe((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitREF_Cnd((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitREF_ShipSchdRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitREF_ShipAllocRslt((MSBEP_AllocChng)this);
		MSBEP_AllocChng_MC.statusInitREF_Btn((MSBEP_AllocChng)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_AllocChng p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_AllocChng p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_CHNG.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ship_schd_no.setListListener(p);
		p.Cnd_ship_schd_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [ShipSchdRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipSchdRslt(MSBEP_AllocChng p) {
		p.ShipSchdRslt_trd_cd.setListListener(p);
		p.ShipSchdRslt_trd_cd.addAllListener(p);
		p.ShipSchdRslt_trd_nm.setListListener(p);
		p.ShipSchdRslt_trd_nm.addAllListener(p);
		p.ShipSchdRslt_slo_no.setListListener(p);
		p.ShipSchdRslt_slo_no.addAllListener(p);
		p.ShipSchdRslt_slo_d_no.setListListener(p);
		p.ShipSchdRslt_slo_d_no.addAllListener(p);
		p.ShipSchdRslt_xfr_schd_no.setListListener(p);
		p.ShipSchdRslt_xfr_schd_no.addAllListener(p);
		p.ShipSchdRslt_ship_schd_no.setListListener(p);
		p.ShipSchdRslt_ship_schd_no.addAllListener(p);
		p.ShipSchdRslt_dlv_id_typ.setListListener(p);
		p.ShipSchdRslt_dlv_id_typ.addAllListener(p);
		p.ShipSchdRslt_dlv_id_typ_nm.setListListener(p);
		p.ShipSchdRslt_dlv_id_typ_nm.addAllListener(p);
		p.ShipSchdRslt_dlv_id_cd.setListListener(p);
		p.ShipSchdRslt_dlv_id_cd.addAllListener(p);
		p.ShipSchdRslt_dlv_id_nm.setListListener(p);
		p.ShipSchdRslt_dlv_id_nm.addAllListener(p);
		p.ShipSchdRslt_cst_cd.setListListener(p);
		p.ShipSchdRslt_cst_cd.addAllListener(p);
		p.ShipSchdRslt_cst_nm.setListListener(p);
		p.ShipSchdRslt_cst_nm.addAllListener(p);
		p.ShipSchdRslt_ship_to_id_typ.setListListener(p);
		p.ShipSchdRslt_ship_to_id_typ.addAllListener(p);
		p.ShipSchdRslt_ship_to_id_typ_nm.setListListener(p);
		p.ShipSchdRslt_ship_to_id_typ_nm.addAllListener(p);
		p.ShipSchdRslt_ship_to_id_cd.setListListener(p);
		p.ShipSchdRslt_ship_to_id_cd.addAllListener(p);
		p.ShipSchdRslt_ship_to_id_nm.setListListener(p);
		p.ShipSchdRslt_ship_to_id_nm.addAllListener(p);
		p.ShipSchdRslt_rqst_usr_cd.setListListener(p);
		p.ShipSchdRslt_rqst_usr_cd.addAllListener(p);
		p.ShipSchdRslt_rqst_usr_nm.setListListener(p);
		p.ShipSchdRslt_rqst_usr_nm.addAllListener(p);
		p.ShipSchdRslt_rqst_dpt_cd.setListListener(p);
		p.ShipSchdRslt_rqst_dpt_cd.addAllListener(p);
		p.ShipSchdRslt_rqst_dpt_nm.setListListener(p);
		p.ShipSchdRslt_rqst_dpt_nm.addAllListener(p);
		p.ShipSchdRslt_loc_cd.setListListener(p);
		p.ShipSchdRslt_loc_cd.addAllListener(p);
		p.ShipSchdRslt_loc_nm.setListListener(p);
		p.ShipSchdRslt_loc_nm.addAllListener(p);
		p.ShipSchdRslt_str_ln_cd.setListListener(p);
		p.ShipSchdRslt_str_ln_cd.addAllListener(p);
		p.ShipSchdRslt_str_ln_nm.setListListener(p);
		p.ShipSchdRslt_str_ln_nm.addAllListener(p);
		p.ShipSchdRslt_lot_no.setListListener(p);
		p.ShipSchdRslt_lot_no.addAllListener(p);
		p.ShipSchdRslt_sublot_no.setListListener(p);
		p.ShipSchdRslt_sublot_no.addAllListener(p);
		p.ShipSchdRslt_ver_flg.addAllListener(p);
		p.ShipSchdRslt_not_lot_mix_flg.addAllListener(p);
		p.ShipSchdRslt_not_sublot_mix_flg.addAllListener(p);
		p.ShipSchdRslt_wg_cd.setListListener(p);
		p.ShipSchdRslt_wg_cd.addAllListener(p);
		p.ShipSchdRslt_wg_nm.setListListener(p);
		p.ShipSchdRslt_wg_nm.addAllListener(p);
		p.ShipSchdRslt_site_cd.setListListener(p);
		p.ShipSchdRslt_site_cd.addAllListener(p);
		p.ShipSchdRslt_site_nm.setListListener(p);
		p.ShipSchdRslt_site_nm.addAllListener(p);
		p.ShipSchdRslt_ship_lg_grp_cd.setListListener(p);
		p.ShipSchdRslt_ship_lg_grp_cd.addAllListener(p);
		p.ShipSchdRslt_ship_lg_grp_nm.setListListener(p);
		p.ShipSchdRslt_ship_lg_grp_nm.addAllListener(p);
		p.ShipSchdRslt_alloc_grp_cd.setListListener(p);
		p.ShipSchdRslt_alloc_grp_cd.addAllListener(p);
		p.ShipSchdRslt_alloc_grp_nm.setListListener(p);
		p.ShipSchdRslt_alloc_grp_nm.addAllListener(p);
		p.ShipSchdRslt_gd_cd.setListListener(p);
		p.ShipSchdRslt_gd_cd.addAllListener(p);
		p.ShipSchdRslt_gd_nm.setListListener(p);
		p.ShipSchdRslt_gd_nm.addAllListener(p);
		p.ShipSchdRslt_quality_typ.setListListener(p);
		p.ShipSchdRslt_quality_typ.addAllListener(p);
		p.ShipSchdRslt_quality_typ_nm.setListListener(p);
		p.ShipSchdRslt_quality_typ_nm.addAllListener(p);
		p.ShipSchdRslt_stk_insp_typ.setListListener(p);
		p.ShipSchdRslt_stk_insp_typ.addAllListener(p);
		p.ShipSchdRslt_stk_insp_typ_nm.setListListener(p);
		p.ShipSchdRslt_stk_insp_typ_nm.addAllListener(p);
		p.ShipSchdRslt_stk_id_typ.setListListener(p);
		p.ShipSchdRslt_stk_id_typ.addAllListener(p);
		p.ShipSchdRslt_stk_id_typ_nm.setListListener(p);
		p.ShipSchdRslt_stk_id_typ_nm.addAllListener(p);
		p.ShipSchdRslt_stk_bp_cd.setListListener(p);
		p.ShipSchdRslt_stk_bp_cd.addAllListener(p);
		p.ShipSchdRslt_stk_bp_nm.setListListener(p);
		p.ShipSchdRslt_stk_bp_nm.addAllListener(p);
		p.ShipSchdRslt_ship_schd_split_typ.setListListener(p);
		p.ShipSchdRslt_ship_schd_split_typ.addAllListener(p);
		p.ShipSchdRslt_ship_schd_split_typ_nm.setListListener(p);
		p.ShipSchdRslt_ship_schd_split_typ_nm.addAllListener(p);
		p.ShipSchdRslt_alloc_scope_typ.setListListener(p);
		p.ShipSchdRslt_alloc_scope_typ.addAllListener(p);
		p.ShipSchdRslt_alloc_scope_typ_nm.setListListener(p);
		p.ShipSchdRslt_alloc_scope_typ_nm.addAllListener(p);
		p.ShipSchdRslt_not_lg_mix_flg.addAllListener(p);
		p.ShipSchdRslt_dlv_rqst_dt.setListListener(p);
		p.ShipSchdRslt_dlv_rqst_dt.addAllListener(p);
		p.ShipSchdRslt_dlv_rqst_hm.setListListener(p);
		p.ShipSchdRslt_dlv_rqst_hm.addAllListener(p);
		p.ShipSchdRslt_ship_rqst_dt.setListListener(p);
		p.ShipSchdRslt_ship_rqst_dt.addAllListener(p);
		p.ShipSchdRslt_ship_rqst_hm.setListListener(p);
		p.ShipSchdRslt_ship_rqst_hm.addAllListener(p);
		p.ShipSchdRslt_pd_inst_dlv_dt.setListListener(p);
		p.ShipSchdRslt_pd_inst_dlv_dt.addAllListener(p);
		p.ShipSchdRslt_pd_inst_dlv_hm.setListListener(p);
		p.ShipSchdRslt_pd_inst_dlv_hm.addAllListener(p);
		p.ShipSchdRslt_dlv_inst_dt.setListListener(p);
		p.ShipSchdRslt_dlv_inst_dt.addAllListener(p);
		p.ShipSchdRslt_dlv_inst_hm.setListListener(p);
		p.ShipSchdRslt_dlv_inst_hm.addAllListener(p);
		p.ShipSchdRslt_ship_schd_dt.setListListener(p);
		p.ShipSchdRslt_ship_schd_dt.addAllListener(p);
		p.ShipSchdRslt_ship_schd_hm.setListListener(p);
		p.ShipSchdRslt_ship_schd_hm.addAllListener(p);
		p.ShipSchdRslt_dlv_schd_dt.setListListener(p);
		p.ShipSchdRslt_dlv_schd_dt.addAllListener(p);
		p.ShipSchdRslt_dlv_schd_hm.setListListener(p);
		p.ShipSchdRslt_dlv_schd_hm.addAllListener(p);
		p.ShipSchdRslt_ship_block_flg.addAllListener(p);
		p.ShipSchdRslt_pack_alloc_flg.addAllListener(p);
		p.ShipSchdRslt_trd_unit_cd.setListListener(p);
		p.ShipSchdRslt_trd_unit_cd.addAllListener(p);
		p.ShipSchdRslt_trd_unit_nm.setListListener(p);
		p.ShipSchdRslt_trd_unit_nm.addAllListener(p);
		p.ShipSchdRslt_trd_unit_dec_place.setListListener(p);
		p.ShipSchdRslt_trd_unit_dec_place.addAllListener(p);
		p.ShipSchdRslt_base_unit_cd.setListListener(p);
		p.ShipSchdRslt_base_unit_cd.addAllListener(p);
		p.ShipSchdRslt_base_unit_nm.setListListener(p);
		p.ShipSchdRslt_base_unit_nm.addAllListener(p);
		p.ShipSchdRslt_base_unit_dec_place.setListListener(p);
		p.ShipSchdRslt_base_unit_dec_place.addAllListener(p);
		p.ShipSchdRslt_ship_pr_upd_cntr.setListListener(p);
		p.ShipSchdRslt_ship_pr_upd_cntr.addAllListener(p);
	}

	/**
	 *  [ShipAllocRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipAllocRslt(MSBEP_AllocChng p) {
		p.ShipAllocRsltTable.addAllListener(p);
		p.columnShipAllocRslt_slo_no.addAllListener(p);
		p.columnShipAllocRslt_slo_no.setListListener(p);
		p.columnShipAllocRslt_slo_d_no.addAllListener(p);
		p.columnShipAllocRslt_slo_d_no.setListListener(p);
		p.columnShipAllocRslt_xfr_schd_no.addAllListener(p);
		p.columnShipAllocRslt_xfr_schd_no.setListListener(p);
		p.columnShipAllocRslt_ship_schd_no.addAllListener(p);
		p.columnShipAllocRslt_ship_schd_no.setListListener(p);
		p.columnShipAllocRslt_ship_alloc_sts_no.addAllListener(p);
		p.columnShipAllocRslt_ship_alloc_sts_no.setListListener(p);
		p.columnShipAllocRslt_vstk_in_schd_flg.addAllListener(p);
		p.columnShipAllocRslt_cst_cd.addAllListener(p);
		p.columnShipAllocRslt_cst_cd.setListListener(p);
		p.columnShipAllocRslt_cst_nm.addAllListener(p);
		p.columnShipAllocRslt_cst_nm.setListListener(p);
		p.columnShipAllocRslt_ship_loc_cd.addAllListener(p);
		p.columnShipAllocRslt_ship_loc_cd.setListListener(p);
		p.columnShipAllocRslt_ship_loc_nm.addAllListener(p);
		p.columnShipAllocRslt_ship_loc_nm.setListListener(p);
		p.columnShipAllocRslt_wg_cd.addAllListener(p);
		p.columnShipAllocRslt_wg_cd.setListListener(p);
		p.columnShipAllocRslt_wg_nm.addAllListener(p);
		p.columnShipAllocRslt_wg_nm.setListListener(p);
		p.columnShipAllocRslt_site_cd.addAllListener(p);
		p.columnShipAllocRslt_site_cd.setListListener(p);
		p.columnShipAllocRslt_site_nm.addAllListener(p);
		p.columnShipAllocRslt_site_nm.setListListener(p);
		p.columnShipAllocRslt_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnShipAllocRslt_ship_fr_lg_grp_cd.setListListener(p);
		p.columnShipAllocRslt_ship_fr_lg_grp_nm.addAllListener(p);
		p.columnShipAllocRslt_ship_fr_lg_grp_nm.setListListener(p);
		p.columnShipAllocRslt_alloc_grp_cd.addAllListener(p);
		p.columnShipAllocRslt_alloc_grp_cd.setListListener(p);
		p.columnShipAllocRslt_alloc_grp_nm.addAllListener(p);
		p.columnShipAllocRslt_alloc_grp_nm.setListListener(p);
		p.columnShipAllocRslt_ver_flg.addAllListener(p);
		p.columnShipAllocRslt_not_lot_mix_flg.addAllListener(p);
		p.columnShipAllocRslt_not_sublot_mix_flg.addAllListener(p);
		p.columnShipAllocRslt_stk_id_typ.addAllListener(p);
		p.columnShipAllocRslt_stk_id_typ.setListListener(p);
		p.columnShipAllocRslt_stk_id_typ_nm.addAllListener(p);
		p.columnShipAllocRslt_stk_id_typ_nm.setListListener(p);
		p.columnShipAllocRslt_stk_bp_cd.addAllListener(p);
		p.columnShipAllocRslt_stk_bp_cd.setListListener(p);
		p.columnShipAllocRslt_stk_bp_nm.addAllListener(p);
		p.columnShipAllocRslt_stk_bp_nm.setListListener(p);
		p.columnShipAllocRslt_pack_unit_cd.addAllListener(p);
		p.columnShipAllocRslt_pack_unit_cd.setListListener(p);
		p.columnShipAllocRslt_pack_unit_nm.addAllListener(p);
		p.columnShipAllocRslt_pack_unit_nm.setListListener(p);
		p.columnShipAllocRslt_pack_unit_dec_place.addAllListener(p);
		p.columnShipAllocRslt_pack_unit_dec_place.setListListener(p);
		p.columnShipAllocRslt_pack_unit_conv_base_qty.addAllListener(p);
		p.columnShipAllocRslt_pack_unit_conv_base_qty.setListListener(p);
		p.columnShipAllocRslt_pack_unit_conv_qty.addAllListener(p);
		p.columnShipAllocRslt_pack_unit_conv_qty.setListListener(p);
		p.columnShipAllocRslt_base_unit_cd.addAllListener(p);
		p.columnShipAllocRslt_base_unit_cd.setListListener(p);
		p.columnShipAllocRslt_base_unit_nm.addAllListener(p);
		p.columnShipAllocRslt_base_unit_nm.setListListener(p);
		p.columnShipAllocRslt_base_unit_dec_place.addAllListener(p);
		p.columnShipAllocRslt_base_unit_dec_place.setListListener(p);
		p.columnShipAllocRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnShipAllocRslt_base_unit_rnd_typ.setListListener(p);
		p.columnShipAllocRslt_dlv_rqst_dt.addAllListener(p);
		p.columnShipAllocRslt_dlv_rqst_dt.setListListener(p);
		p.columnShipAllocRslt_dlv_rqst_hm.addAllListener(p);
		p.columnShipAllocRslt_dlv_rqst_hm.setListListener(p);
		p.columnShipAllocRslt_ship_rqst_dt.addAllListener(p);
		p.columnShipAllocRslt_ship_rqst_dt.setListListener(p);
		p.columnShipAllocRslt_ship_rqst_hm.addAllListener(p);
		p.columnShipAllocRslt_ship_rqst_hm.setListListener(p);
		p.columnShipAllocRslt_pd_inst_dlv_dt.addAllListener(p);
		p.columnShipAllocRslt_pd_inst_dlv_dt.setListListener(p);
		p.columnShipAllocRslt_pd_inst_dlv_hm.addAllListener(p);
		p.columnShipAllocRslt_pd_inst_dlv_hm.setListListener(p);
		p.columnShipAllocRslt_dlv_inst_dt.addAllListener(p);
		p.columnShipAllocRslt_dlv_inst_dt.setListListener(p);
		p.columnShipAllocRslt_dlv_inst_hm.addAllListener(p);
		p.columnShipAllocRslt_dlv_inst_hm.setListListener(p);
		p.columnShipAllocRslt_ship_schd_dt.addAllListener(p);
		p.columnShipAllocRslt_ship_schd_dt.setListListener(p);
		p.columnShipAllocRslt_ship_schd_hm.addAllListener(p);
		p.columnShipAllocRslt_ship_schd_hm.setListListener(p);
		p.columnShipAllocRslt_dlv_schd_dt.addAllListener(p);
		p.columnShipAllocRslt_dlv_schd_dt.setListListener(p);
		p.columnShipAllocRslt_dlv_schd_hm.addAllListener(p);
		p.columnShipAllocRslt_dlv_schd_hm.setListListener(p);
		p.columnShipAllocRslt_rqst_usr_cd.addAllListener(p);
		p.columnShipAllocRslt_rqst_usr_cd.setListListener(p);
		p.columnShipAllocRslt_rqst_usr_nm.addAllListener(p);
		p.columnShipAllocRslt_rqst_usr_nm.setListListener(p);
		p.columnShipAllocRslt_rqst_dpt_cd.addAllListener(p);
		p.columnShipAllocRslt_rqst_dpt_cd.setListListener(p);
		p.columnShipAllocRslt_rqst_dpt_nm.addAllListener(p);
		p.columnShipAllocRslt_rqst_dpt_nm.setListListener(p);
		p.columnShipAllocRslt_ship_to_id_typ.addAllListener(p);
		p.columnShipAllocRslt_ship_to_id_typ.setListListener(p);
		p.columnShipAllocRslt_ship_to_id_typ_nm.addAllListener(p);
		p.columnShipAllocRslt_ship_to_id_typ_nm.setListListener(p);
		p.columnShipAllocRslt_ship_to_id_cd.addAllListener(p);
		p.columnShipAllocRslt_ship_to_id_cd.setListListener(p);
		p.columnShipAllocRslt_ship_to_id_nm.addAllListener(p);
		p.columnShipAllocRslt_ship_to_id_nm.setListListener(p);
		p.columnShipAllocRslt_alloc_scope_typ.addAllListener(p);
		p.columnShipAllocRslt_alloc_scope_typ.setListListener(p);
		p.columnShipAllocRslt_alloc_scope_typ_nm.addAllListener(p);
		p.columnShipAllocRslt_alloc_scope_typ_nm.setListListener(p);
		p.columnShipAllocRslt_not_lg_mix_flg.addAllListener(p);
		p.columnShipAllocRslt_ship_pr_no.addAllListener(p);
		p.columnShipAllocRslt_ship_pr_no.setListListener(p);
		p.columnShipAllocRslt_ship_pr_upd_cntr.addAllListener(p);
		p.columnShipAllocRslt_ship_pr_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_AllocChng p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_AllocChng p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_AllocChng p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ship_schd_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[ShipSchdRslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ShipSchdRslt(MSBEP_AllocChng p){
		p.ShipSchdRslt_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_xfr_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_str_ln_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_str_ln_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_sublot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.ShipSchdRslt_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipSchdRslt_not_lot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_not_sublot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.ShipSchdRslt_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_quality_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_insp_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_insp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.ShipSchdRslt_ship_schd_split_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_split_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_scope_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_scope_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_not_lg_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_rqst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_rqst_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_rqst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_rqst_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_pd_inst_dlv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_pd_inst_dlv_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_inst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_inst_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_block_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_pack_alloc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_alloc_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_wait_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_wait_rem_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_ship_pr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[ShipAllocRslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ShipAllocRslt(MSBEP_AllocChng p){
		p.columnShipAllocRslt_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_xfr_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_alloc_sts_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_vstk_in_schd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipAllocRslt_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.ShipAllocRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnShipAllocRslt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_fr_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_fr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipAllocRslt_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.ShipAllocRslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipAllocRslt_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnShipAllocRslt_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnShipAllocRslt_not_lot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_not_sublot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipAllocRslt_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnShipAllocRslt_stk_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnShipAllocRslt_pack_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnShipAllocRslt_pack_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipAllocRslt_alloc_abl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipAllocRslt_alloc_chng_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnShipAllocRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnShipAllocRslt_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipAllocRslt_dlv_rqst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_rqst_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_rqst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_rqst_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pd_inst_dlv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pd_inst_dlv_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_inst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_inst_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_scope_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_scope_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_not_lg_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_pr_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_pr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipAllocRslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_AllocChng p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_AllocChng p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_AllocChng p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ship_schd_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[ShipSchdRslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ShipSchdRslt(MSBEP_AllocChng p){
		p.ShipSchdRslt_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_xfr_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_str_ln_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_str_ln_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_sublot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.ShipSchdRslt_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipSchdRslt_not_lot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_not_sublot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.ShipSchdRslt_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_insp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_insp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.ShipSchdRslt_ship_schd_split_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_split_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_scope_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_scope_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_not_lg_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_rqst_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_rqst_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_pd_inst_dlv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_pd_inst_dlv_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_inst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_inst_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_block_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_pack_alloc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_alloc_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_wait_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_wait_rem_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_ship_pr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[ShipAllocRslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ShipAllocRslt(MSBEP_AllocChng p){
		p.columnShipAllocRslt_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_xfr_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_alloc_sts_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_vstk_in_schd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipAllocRslt_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.ShipAllocRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnShipAllocRslt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_fr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipAllocRslt_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.ShipAllocRslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipAllocRslt_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnShipAllocRslt_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnShipAllocRslt_not_lot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_not_sublot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipAllocRslt_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnShipAllocRslt_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnShipAllocRslt_pack_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnShipAllocRslt_pack_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipAllocRslt_alloc_abl_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipAllocRslt_alloc_chng_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipAllocRslt_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnShipAllocRslt_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipAllocRslt_dlv_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_rqst_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_rqst_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pd_inst_dlv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pd_inst_dlv_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_inst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_inst_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_scope_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_scope_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_not_lg_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_pr_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_pr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipAllocRslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_AllocChng p){
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_AllocChng p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_AllocChng p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ship_schd_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[ShipSchdRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ShipSchdRslt(MSBEP_AllocChng p){
		p.ShipSchdRslt_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_xfr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.ShipSchdRslt_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipSchdRslt_not_lot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_not_sublot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.ShipSchdRslt_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.ShipSchdRslt_ship_schd_split_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_split_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_scope_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_scope_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_not_lg_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_rqst_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_rqst_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_pd_inst_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_pd_inst_dlv_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_inst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_inst_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_block_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_pack_alloc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_alloc_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_wait_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_wait_rem_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_ship_pr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[ShipAllocRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ShipAllocRslt(MSBEP_AllocChng p){
		p.columnShipAllocRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_xfr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_alloc_sts_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_vstk_in_schd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipAllocRslt_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.ShipAllocRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnShipAllocRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_fr_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipAllocRslt_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.ShipAllocRslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipAllocRslt_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnShipAllocRslt_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnShipAllocRslt_not_lot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_not_sublot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipAllocRslt_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnShipAllocRslt_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnShipAllocRslt_pack_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnShipAllocRslt_pack_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipAllocRslt_alloc_abl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipAllocRslt_alloc_chng_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipAllocRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnShipAllocRslt_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipAllocRslt_dlv_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_rqst_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_rqst_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pd_inst_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pd_inst_dlv_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_inst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_inst_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_scope_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_scope_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_not_lg_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_pr_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_pr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipAllocRslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_AllocChng p){
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_AllocChng p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_AllocChng p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ship_schd_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[ShipSchdRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_ShipSchdRslt(MSBEP_AllocChng p){
		p.ShipSchdRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_xfr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_to_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_rqst_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.ShipSchdRslt_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipSchdRslt_not_lot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_not_sublot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.ShipSchdRslt_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_stk_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.ShipSchdRslt_ship_schd_split_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_split_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_scope_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_alloc_scope_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_not_lg_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_rqst_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_rqst_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_pd_inst_dlv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_pd_inst_dlv_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_inst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_inst_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_ship_block_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_pack_alloc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_alloc_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_wait_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_wait_rem_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.ShipSchdRslt_ship_pr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[ShipAllocRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_ShipAllocRslt(MSBEP_AllocChng p){
		p.columnShipAllocRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_xfr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_alloc_sts_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_vstk_in_schd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipAllocRslt_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.ShipAllocRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnShipAllocRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_fr_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_fr_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipAllocRslt_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.ShipAllocRslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipAllocRslt_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnShipAllocRslt_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnShipAllocRslt_not_lot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_not_sublot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipAllocRslt_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnShipAllocRslt_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_stk_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pack_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnShipAllocRslt_pack_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnShipAllocRslt_pack_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipAllocRslt_alloc_abl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipAllocRslt_alloc_chng_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipAllocRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnShipAllocRslt_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipAllocRslt_dlv_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_rqst_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_rqst_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pd_inst_dlv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_pd_inst_dlv_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_inst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_inst_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_dlv_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_rqst_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_to_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_scope_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_alloc_scope_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_not_lg_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_pr_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipAllocRslt_ship_pr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipAllocRslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_AllocChng p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

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
		MSBEP_AllocChng_MC.setTableConfigShipAllocRslt((MSBEP_AllocChng)this);
	}

	/**
	 * [ShipAllocRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigShipAllocRslt(MSBEP_AllocChng p) {
		p.columnShipAllocRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.slo_no_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_slo_no);
		p.columnShipAllocRslt_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.slo_d_no_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_slo_d_no);
		p.columnShipAllocRslt_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.xfr_schd_no_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_xfr_schd_no);
		p.columnShipAllocRslt_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_schd_no_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_schd_no);
		p.columnShipAllocRslt_ship_alloc_sts_no.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_alloc_sts_no_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_alloc_sts_no);
		p.columnShipAllocRslt_vstk_in_schd_flg.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.vstk_in_schd_flg_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_vstk_in_schd_flg);
		p.columnShipAllocRslt_cst_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.cst_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_cst_cd);
		p.columnShipAllocRslt_cst_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.cst_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_cst_nm);
		p.columnShipAllocRslt_ship_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_loc_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_loc_cd);
		p.columnShipAllocRslt_ship_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_loc_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_loc_nm);
		p.ShipAllocRsltTable.addTable(p.ShipAllocRslt_str_ln_p_PPanel.StrLnTable);
		p.columnShipAllocRslt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.wg_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_wg_cd);
		p.columnShipAllocRslt_wg_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.wg_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_wg_nm);
		p.columnShipAllocRslt_site_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.site_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_site_cd);
		p.columnShipAllocRslt_site_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.site_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_site_nm);
		p.columnShipAllocRslt_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_fr_lg_grp_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_fr_lg_grp_cd);
		p.columnShipAllocRslt_ship_fr_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_fr_lg_grp_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_fr_lg_grp_nm);
		p.columnShipAllocRslt_alloc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.alloc_grp_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_alloc_grp_cd);
		p.columnShipAllocRslt_alloc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.alloc_grp_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_alloc_grp_nm);
		p.ShipAllocRsltTable.addTable(p.ShipAllocRslt_lot_no_p_PPanel.LotNoTable);
		p.ShipAllocRsltTable.addTable(p.ShipAllocRslt_ver_no_p_PPanel.VerNoTable);
		p.columnShipAllocRslt_ver_flg.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ver_flg_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ver_flg);
		p.columnShipAllocRslt_not_lot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.not_lot_mix_flg_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_not_lot_mix_flg);
		p.columnShipAllocRslt_not_sublot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.not_sublot_mix_flg_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_not_sublot_mix_flg);
		p.ShipAllocRsltTable.addTable(p.ShipAllocRslt_sno_p_PPanel.SnoTable);
		p.columnShipAllocRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.stk_id_typ_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_stk_id_typ);
		p.columnShipAllocRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.stk_id_typ_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_stk_id_typ_nm);
		p.columnShipAllocRslt_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.stk_bp_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_stk_bp_cd);
		p.columnShipAllocRslt_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.stk_bp_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_stk_bp_nm);
		p.columnShipAllocRslt_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.pack_unit_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_pack_unit_cd);
		p.columnShipAllocRslt_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.pack_unit_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_pack_unit_nm);
		p.columnShipAllocRslt_pack_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.pack_unit_dec_place_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_pack_unit_dec_place);
		p.columnShipAllocRslt_pack_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.pack_unit_conv_base_qty_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_pack_unit_conv_base_qty);
		p.columnShipAllocRslt_pack_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.pack_unit_conv_qty_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_pack_unit_conv_qty);
		p.ShipAllocRsltTable.addTable(p.ShipAllocRslt_alloc_abl_qty_p_PPanel.QtyTable);
		p.ShipAllocRsltTable.addTable(p.ShipAllocRslt_alloc_chng_qty_p_PPanel.QtyTable);
		p.columnShipAllocRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.base_unit_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_base_unit_cd);
		p.columnShipAllocRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.base_unit_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_base_unit_nm);
		p.columnShipAllocRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.base_unit_dec_place_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_base_unit_dec_place);
		p.columnShipAllocRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.base_unit_rnd_typ_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_base_unit_rnd_typ);
		p.ShipAllocRsltTable.addTable(p.ShipAllocRslt_alloc_abl_base_unit_qty_p_PPanel.QtyTable);
		p.ShipAllocRsltTable.addTable(p.ShipAllocRslt_alloc_chng_base_unit_qty_p_PPanel.QtyTable);
		p.columnShipAllocRslt_dlv_rqst_dt.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.dlv_rqst_dt_META);
		p.columnShipAllocRslt_dlv_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_dlv_rqst_dt);
		p.columnShipAllocRslt_dlv_rqst_hm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.dlv_rqst_hm_META);
		p.columnShipAllocRslt_dlv_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_dlv_rqst_hm);
		p.columnShipAllocRslt_ship_rqst_dt.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_rqst_dt_META);
		p.columnShipAllocRslt_ship_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_rqst_dt);
		p.columnShipAllocRslt_ship_rqst_hm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_rqst_hm_META);
		p.columnShipAllocRslt_ship_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_rqst_hm);
		p.columnShipAllocRslt_pd_inst_dlv_dt.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.pd_inst_dlv_dt_META);
		p.columnShipAllocRslt_pd_inst_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_pd_inst_dlv_dt);
		p.columnShipAllocRslt_pd_inst_dlv_hm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.pd_inst_dlv_hm_META);
		p.columnShipAllocRslt_pd_inst_dlv_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_pd_inst_dlv_hm);
		p.columnShipAllocRslt_dlv_inst_dt.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.dlv_inst_dt_META);
		p.columnShipAllocRslt_dlv_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_dlv_inst_dt);
		p.columnShipAllocRslt_dlv_inst_hm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.dlv_inst_hm_META);
		p.columnShipAllocRslt_dlv_inst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_dlv_inst_hm);
		p.columnShipAllocRslt_ship_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_schd_dt_META);
		p.columnShipAllocRslt_ship_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_schd_dt);
		p.columnShipAllocRslt_ship_schd_hm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_schd_hm_META);
		p.columnShipAllocRslt_ship_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_schd_hm);
		p.columnShipAllocRslt_dlv_schd_dt.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.dlv_schd_dt_META);
		p.columnShipAllocRslt_dlv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_dlv_schd_dt);
		p.columnShipAllocRslt_dlv_schd_hm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.dlv_schd_hm_META);
		p.columnShipAllocRslt_dlv_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_dlv_schd_hm);
		p.columnShipAllocRslt_rqst_usr_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.rqst_usr_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_rqst_usr_cd);
		p.columnShipAllocRslt_rqst_usr_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.rqst_usr_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_rqst_usr_nm);
		p.columnShipAllocRslt_rqst_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.rqst_dpt_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_rqst_dpt_cd);
		p.columnShipAllocRslt_rqst_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.rqst_dpt_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_rqst_dpt_nm);
		p.columnShipAllocRslt_ship_to_id_typ.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_to_id_typ_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_to_id_typ);
		p.columnShipAllocRslt_ship_to_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_to_id_typ_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_to_id_typ_nm);
		p.columnShipAllocRslt_ship_to_id_cd.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_to_id_cd_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_to_id_cd);
		p.columnShipAllocRslt_ship_to_id_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_to_id_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_to_id_nm);
		p.columnShipAllocRslt_alloc_scope_typ.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.alloc_scope_typ_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_alloc_scope_typ);
		p.columnShipAllocRslt_alloc_scope_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.alloc_scope_typ_nm_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_alloc_scope_typ_nm);
		p.columnShipAllocRslt_not_lg_mix_flg.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.not_lg_mix_flg_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_not_lg_mix_flg);
		p.columnShipAllocRslt_ship_pr_no.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_pr_no_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_pr_no);
		p.columnShipAllocRslt_ship_pr_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.ship_pr_upd_cntr_META);
		p.ShipAllocRsltTable.addColumnConfig(p.columnShipAllocRslt_ship_pr_upd_cntr);
		p.ShipAllocRsltTable.addTable(p.ShipAllocRslt_itm_p_PPanel.ItmTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

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
		if (vc == ShipAllocRsltTable) return doShipAllocRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ship_schd_no) return doCnd_ship_schd_no_VC(info);
		if (vc == ShipSchdRslt_trd_cd) return doShipSchdRslt_trd_cd_VC(info);
		if (vc == ShipSchdRslt_trd_nm) return doShipSchdRslt_trd_nm_VC(info);
		if (vc == ShipSchdRslt_slo_no) return doShipSchdRslt_slo_no_VC(info);
		if (vc == ShipSchdRslt_slo_d_no) return doShipSchdRslt_slo_d_no_VC(info);
		if (vc == ShipSchdRslt_xfr_schd_no) return doShipSchdRslt_xfr_schd_no_VC(info);
		if (vc == ShipSchdRslt_ship_schd_no) return doShipSchdRslt_ship_schd_no_VC(info);
		if (vc == ShipSchdRslt_dlv_id_typ) return doShipSchdRslt_dlv_id_typ_VC(info);
		if (vc == ShipSchdRslt_dlv_id_typ_nm) return doShipSchdRslt_dlv_id_typ_nm_VC(info);
		if (vc == ShipSchdRslt_dlv_id_cd) return doShipSchdRslt_dlv_id_cd_VC(info);
		if (vc == ShipSchdRslt_dlv_id_nm) return doShipSchdRslt_dlv_id_nm_VC(info);
		if (vc == ShipSchdRslt_cst_cd) return doShipSchdRslt_cst_cd_VC(info);
		if (vc == ShipSchdRslt_cst_nm) return doShipSchdRslt_cst_nm_VC(info);
		if (vc == ShipSchdRslt_ship_to_id_typ) return doShipSchdRslt_ship_to_id_typ_VC(info);
		if (vc == ShipSchdRslt_ship_to_id_typ_nm) return doShipSchdRslt_ship_to_id_typ_nm_VC(info);
		if (vc == ShipSchdRslt_ship_to_id_cd) return doShipSchdRslt_ship_to_id_cd_VC(info);
		if (vc == ShipSchdRslt_ship_to_id_nm) return doShipSchdRslt_ship_to_id_nm_VC(info);
		if (vc == ShipSchdRslt_rqst_usr_cd) return doShipSchdRslt_rqst_usr_cd_VC(info);
		if (vc == ShipSchdRslt_rqst_usr_nm) return doShipSchdRslt_rqst_usr_nm_VC(info);
		if (vc == ShipSchdRslt_rqst_dpt_cd) return doShipSchdRslt_rqst_dpt_cd_VC(info);
		if (vc == ShipSchdRslt_rqst_dpt_nm) return doShipSchdRslt_rqst_dpt_nm_VC(info);
		if (vc == ShipSchdRslt_loc_cd) return doShipSchdRslt_loc_cd_VC(info);
		if (vc == ShipSchdRslt_loc_nm) return doShipSchdRslt_loc_nm_VC(info);
		if (vc == ShipSchdRslt_str_ln_cd) return doShipSchdRslt_str_ln_cd_VC(info);
		if (vc == ShipSchdRslt_str_ln_nm) return doShipSchdRslt_str_ln_nm_VC(info);
		if (vc == ShipSchdRslt_lot_no) return doShipSchdRslt_lot_no_VC(info);
		if (vc == ShipSchdRslt_sublot_no) return doShipSchdRslt_sublot_no_VC(info);
		if (vc == ShipSchdRslt_ver_flg) return doShipSchdRslt_ver_flg_VC(info);
		if (vc == ShipSchdRslt_not_lot_mix_flg) return doShipSchdRslt_not_lot_mix_flg_VC(info);
		if (vc == ShipSchdRslt_not_sublot_mix_flg) return doShipSchdRslt_not_sublot_mix_flg_VC(info);
		if (vc == ShipSchdRslt_wg_cd) return doShipSchdRslt_wg_cd_VC(info);
		if (vc == ShipSchdRslt_wg_nm) return doShipSchdRslt_wg_nm_VC(info);
		if (vc == ShipSchdRslt_site_cd) return doShipSchdRslt_site_cd_VC(info);
		if (vc == ShipSchdRslt_site_nm) return doShipSchdRslt_site_nm_VC(info);
		if (vc == ShipSchdRslt_ship_lg_grp_cd) return doShipSchdRslt_ship_lg_grp_cd_VC(info);
		if (vc == ShipSchdRslt_ship_lg_grp_nm) return doShipSchdRslt_ship_lg_grp_nm_VC(info);
		if (vc == ShipSchdRslt_alloc_grp_cd) return doShipSchdRslt_alloc_grp_cd_VC(info);
		if (vc == ShipSchdRslt_alloc_grp_nm) return doShipSchdRslt_alloc_grp_nm_VC(info);
		if (vc == ShipSchdRslt_gd_cd) return doShipSchdRslt_gd_cd_VC(info);
		if (vc == ShipSchdRslt_gd_nm) return doShipSchdRslt_gd_nm_VC(info);
		if (vc == ShipSchdRslt_quality_typ) return doShipSchdRslt_quality_typ_VC(info);
		if (vc == ShipSchdRslt_quality_typ_nm) return doShipSchdRslt_quality_typ_nm_VC(info);
		if (vc == ShipSchdRslt_stk_insp_typ) return doShipSchdRslt_stk_insp_typ_VC(info);
		if (vc == ShipSchdRslt_stk_insp_typ_nm) return doShipSchdRslt_stk_insp_typ_nm_VC(info);
		if (vc == ShipSchdRslt_stk_id_typ) return doShipSchdRslt_stk_id_typ_VC(info);
		if (vc == ShipSchdRslt_stk_id_typ_nm) return doShipSchdRslt_stk_id_typ_nm_VC(info);
		if (vc == ShipSchdRslt_stk_bp_cd) return doShipSchdRslt_stk_bp_cd_VC(info);
		if (vc == ShipSchdRslt_stk_bp_nm) return doShipSchdRslt_stk_bp_nm_VC(info);
		if (vc == ShipSchdRslt_ship_schd_split_typ) return doShipSchdRslt_ship_schd_split_typ_VC(info);
		if (vc == ShipSchdRslt_ship_schd_split_typ_nm) return doShipSchdRslt_ship_schd_split_typ_nm_VC(info);
		if (vc == ShipSchdRslt_alloc_scope_typ) return doShipSchdRslt_alloc_scope_typ_VC(info);
		if (vc == ShipSchdRslt_alloc_scope_typ_nm) return doShipSchdRslt_alloc_scope_typ_nm_VC(info);
		if (vc == ShipSchdRslt_not_lg_mix_flg) return doShipSchdRslt_not_lg_mix_flg_VC(info);
		if (vc == ShipSchdRslt_dlv_rqst_dt) return doShipSchdRslt_dlv_rqst_dt_VC(info);
		if (vc == ShipSchdRslt_dlv_rqst_hm) return doShipSchdRslt_dlv_rqst_hm_VC(info);
		if (vc == ShipSchdRslt_ship_rqst_dt) return doShipSchdRslt_ship_rqst_dt_VC(info);
		if (vc == ShipSchdRslt_ship_rqst_hm) return doShipSchdRslt_ship_rqst_hm_VC(info);
		if (vc == ShipSchdRslt_pd_inst_dlv_dt) return doShipSchdRslt_pd_inst_dlv_dt_VC(info);
		if (vc == ShipSchdRslt_pd_inst_dlv_hm) return doShipSchdRslt_pd_inst_dlv_hm_VC(info);
		if (vc == ShipSchdRslt_dlv_inst_dt) return doShipSchdRslt_dlv_inst_dt_VC(info);
		if (vc == ShipSchdRslt_dlv_inst_hm) return doShipSchdRslt_dlv_inst_hm_VC(info);
		if (vc == ShipSchdRslt_ship_schd_dt) return doShipSchdRslt_ship_schd_dt_VC(info);
		if (vc == ShipSchdRslt_ship_schd_hm) return doShipSchdRslt_ship_schd_hm_VC(info);
		if (vc == ShipSchdRslt_dlv_schd_dt) return doShipSchdRslt_dlv_schd_dt_VC(info);
		if (vc == ShipSchdRslt_dlv_schd_hm) return doShipSchdRslt_dlv_schd_hm_VC(info);
		if (vc == ShipSchdRslt_ship_block_flg) return doShipSchdRslt_ship_block_flg_VC(info);
		if (vc == ShipSchdRslt_pack_alloc_flg) return doShipSchdRslt_pack_alloc_flg_VC(info);
		if (vc == ShipSchdRslt_trd_unit_cd) return doShipSchdRslt_trd_unit_cd_VC(info);
		if (vc == ShipSchdRslt_trd_unit_nm) return doShipSchdRslt_trd_unit_nm_VC(info);
		if (vc == ShipSchdRslt_trd_unit_dec_place) return doShipSchdRslt_trd_unit_dec_place_VC(info);
		if (vc == ShipSchdRslt_base_unit_cd) return doShipSchdRslt_base_unit_cd_VC(info);
		if (vc == ShipSchdRslt_base_unit_nm) return doShipSchdRslt_base_unit_nm_VC(info);
		if (vc == ShipSchdRslt_base_unit_dec_place) return doShipSchdRslt_base_unit_dec_place_VC(info);
		if (vc == ShipSchdRslt_ship_pr_upd_cntr) return doShipSchdRslt_ship_pr_upd_cntr_VC(info);
		if (vc == columnShipAllocRslt_slo_no) return doShipAllocRslt_slo_no_VC(info);
		if (vc == columnShipAllocRslt_slo_d_no) return doShipAllocRslt_slo_d_no_VC(info);
		if (vc == columnShipAllocRslt_xfr_schd_no) return doShipAllocRslt_xfr_schd_no_VC(info);
		if (vc == columnShipAllocRslt_ship_schd_no) return doShipAllocRslt_ship_schd_no_VC(info);
		if (vc == columnShipAllocRslt_ship_alloc_sts_no) return doShipAllocRslt_ship_alloc_sts_no_VC(info);
		if (vc == columnShipAllocRslt_vstk_in_schd_flg) return doShipAllocRslt_vstk_in_schd_flg_VC(info);
		if (vc == columnShipAllocRslt_cst_cd) return doShipAllocRslt_cst_cd_VC(info);
		if (vc == columnShipAllocRslt_cst_nm) return doShipAllocRslt_cst_nm_VC(info);
		if (vc == columnShipAllocRslt_ship_loc_cd) return doShipAllocRslt_ship_loc_cd_VC(info);
		if (vc == columnShipAllocRslt_ship_loc_nm) return doShipAllocRslt_ship_loc_nm_VC(info);
		if (vc == columnShipAllocRslt_wg_cd) return doShipAllocRslt_wg_cd_VC(info);
		if (vc == columnShipAllocRslt_wg_nm) return doShipAllocRslt_wg_nm_VC(info);
		if (vc == columnShipAllocRslt_site_cd) return doShipAllocRslt_site_cd_VC(info);
		if (vc == columnShipAllocRslt_site_nm) return doShipAllocRslt_site_nm_VC(info);
		if (vc == columnShipAllocRslt_ship_fr_lg_grp_cd) return doShipAllocRslt_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnShipAllocRslt_ship_fr_lg_grp_nm) return doShipAllocRslt_ship_fr_lg_grp_nm_VC(info);
		if (vc == columnShipAllocRslt_alloc_grp_cd) return doShipAllocRslt_alloc_grp_cd_VC(info);
		if (vc == columnShipAllocRslt_alloc_grp_nm) return doShipAllocRslt_alloc_grp_nm_VC(info);
		if (vc == columnShipAllocRslt_ver_flg) return doShipAllocRslt_ver_flg_VC(info);
		if (vc == columnShipAllocRslt_not_lot_mix_flg) return doShipAllocRslt_not_lot_mix_flg_VC(info);
		if (vc == columnShipAllocRslt_not_sublot_mix_flg) return doShipAllocRslt_not_sublot_mix_flg_VC(info);
		if (vc == columnShipAllocRslt_stk_id_typ) return doShipAllocRslt_stk_id_typ_VC(info);
		if (vc == columnShipAllocRslt_stk_id_typ_nm) return doShipAllocRslt_stk_id_typ_nm_VC(info);
		if (vc == columnShipAllocRslt_stk_bp_cd) return doShipAllocRslt_stk_bp_cd_VC(info);
		if (vc == columnShipAllocRslt_stk_bp_nm) return doShipAllocRslt_stk_bp_nm_VC(info);
		if (vc == columnShipAllocRslt_pack_unit_cd) return doShipAllocRslt_pack_unit_cd_VC(info);
		if (vc == columnShipAllocRslt_pack_unit_nm) return doShipAllocRslt_pack_unit_nm_VC(info);
		if (vc == columnShipAllocRslt_pack_unit_dec_place) return doShipAllocRslt_pack_unit_dec_place_VC(info);
		if (vc == columnShipAllocRslt_pack_unit_conv_base_qty) return doShipAllocRslt_pack_unit_conv_base_qty_VC(info);
		if (vc == columnShipAllocRslt_pack_unit_conv_qty) return doShipAllocRslt_pack_unit_conv_qty_VC(info);
		if (vc == columnShipAllocRslt_base_unit_cd) return doShipAllocRslt_base_unit_cd_VC(info);
		if (vc == columnShipAllocRslt_base_unit_nm) return doShipAllocRslt_base_unit_nm_VC(info);
		if (vc == columnShipAllocRslt_base_unit_dec_place) return doShipAllocRslt_base_unit_dec_place_VC(info);
		if (vc == columnShipAllocRslt_base_unit_rnd_typ) return doShipAllocRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnShipAllocRslt_dlv_rqst_dt) return doShipAllocRslt_dlv_rqst_dt_VC(info);
		if (vc == columnShipAllocRslt_dlv_rqst_hm) return doShipAllocRslt_dlv_rqst_hm_VC(info);
		if (vc == columnShipAllocRslt_ship_rqst_dt) return doShipAllocRslt_ship_rqst_dt_VC(info);
		if (vc == columnShipAllocRslt_ship_rqst_hm) return doShipAllocRslt_ship_rqst_hm_VC(info);
		if (vc == columnShipAllocRslt_pd_inst_dlv_dt) return doShipAllocRslt_pd_inst_dlv_dt_VC(info);
		if (vc == columnShipAllocRslt_pd_inst_dlv_hm) return doShipAllocRslt_pd_inst_dlv_hm_VC(info);
		if (vc == columnShipAllocRslt_dlv_inst_dt) return doShipAllocRslt_dlv_inst_dt_VC(info);
		if (vc == columnShipAllocRslt_dlv_inst_hm) return doShipAllocRslt_dlv_inst_hm_VC(info);
		if (vc == columnShipAllocRslt_ship_schd_dt) return doShipAllocRslt_ship_schd_dt_VC(info);
		if (vc == columnShipAllocRslt_ship_schd_hm) return doShipAllocRslt_ship_schd_hm_VC(info);
		if (vc == columnShipAllocRslt_dlv_schd_dt) return doShipAllocRslt_dlv_schd_dt_VC(info);
		if (vc == columnShipAllocRslt_dlv_schd_hm) return doShipAllocRslt_dlv_schd_hm_VC(info);
		if (vc == columnShipAllocRslt_rqst_usr_cd) return doShipAllocRslt_rqst_usr_cd_VC(info);
		if (vc == columnShipAllocRslt_rqst_usr_nm) return doShipAllocRslt_rqst_usr_nm_VC(info);
		if (vc == columnShipAllocRslt_rqst_dpt_cd) return doShipAllocRslt_rqst_dpt_cd_VC(info);
		if (vc == columnShipAllocRslt_rqst_dpt_nm) return doShipAllocRslt_rqst_dpt_nm_VC(info);
		if (vc == columnShipAllocRslt_ship_to_id_typ) return doShipAllocRslt_ship_to_id_typ_VC(info);
		if (vc == columnShipAllocRslt_ship_to_id_typ_nm) return doShipAllocRslt_ship_to_id_typ_nm_VC(info);
		if (vc == columnShipAllocRslt_ship_to_id_cd) return doShipAllocRslt_ship_to_id_cd_VC(info);
		if (vc == columnShipAllocRslt_ship_to_id_nm) return doShipAllocRslt_ship_to_id_nm_VC(info);
		if (vc == columnShipAllocRslt_alloc_scope_typ) return doShipAllocRslt_alloc_scope_typ_VC(info);
		if (vc == columnShipAllocRslt_alloc_scope_typ_nm) return doShipAllocRslt_alloc_scope_typ_nm_VC(info);
		if (vc == columnShipAllocRslt_not_lg_mix_flg) return doShipAllocRslt_not_lg_mix_flg_VC(info);
		if (vc == columnShipAllocRslt_ship_pr_no) return doShipAllocRslt_ship_pr_no_VC(info);
		if (vc == columnShipAllocRslt_ship_pr_upd_cntr) return doShipAllocRslt_ship_pr_upd_cntr_VC(info);
		return true;
	}

	/**
	 * [ShipAllocRslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_slo_no_VC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_xfr_schd_no_VC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_rqst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_rqst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_rqst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_rqst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[not_lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_not_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[not_sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_not_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_schd_split_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_schd_split_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_alloc_scope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_alloc_scope_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[not_lg_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_not_lg_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_rqst_hm_VC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[dlv_inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_inst_hm_VC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[pack_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_pack_alloc_flg_VC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[ship_pr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_pr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_xfr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_alloc_sts_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_alloc_sts_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[vstk_in_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_vstk_in_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[not_lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_not_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[not_sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_not_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_pack_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_pack_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_dlv_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_dlv_rqst_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_rqst_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_pd_inst_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_pd_inst_dlv_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_dlv_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_dlv_inst_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_dlv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_dlv_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_rqst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_rqst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_rqst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_rqst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_alloc_scope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_alloc_scope_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[not_lg_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_not_lg_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipAllocRslt_ship_pr_upd_cntr_VC(MCEventInfo info){
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
		if (nc == ShipAllocRsltTable) doShipAllocRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ship_schd_no) doCnd_ship_schd_no_NC(info);
		else if (nc == ShipSchdRslt_trd_cd) doShipSchdRslt_trd_cd_NC(info);
		else if (nc == ShipSchdRslt_trd_nm) doShipSchdRslt_trd_nm_NC(info);
		else if (nc == ShipSchdRslt_slo_no) doShipSchdRslt_slo_no_NC(info);
		else if (nc == ShipSchdRslt_slo_d_no) doShipSchdRslt_slo_d_no_NC(info);
		else if (nc == ShipSchdRslt_xfr_schd_no) doShipSchdRslt_xfr_schd_no_NC(info);
		else if (nc == ShipSchdRslt_ship_schd_no) doShipSchdRslt_ship_schd_no_NC(info);
		else if (nc == ShipSchdRslt_dlv_id_typ) doShipSchdRslt_dlv_id_typ_NC(info);
		else if (nc == ShipSchdRslt_dlv_id_typ_nm) doShipSchdRslt_dlv_id_typ_nm_NC(info);
		else if (nc == ShipSchdRslt_dlv_id_cd) doShipSchdRslt_dlv_id_cd_NC(info);
		else if (nc == ShipSchdRslt_dlv_id_nm) doShipSchdRslt_dlv_id_nm_NC(info);
		else if (nc == ShipSchdRslt_cst_cd) doShipSchdRslt_cst_cd_NC(info);
		else if (nc == ShipSchdRslt_cst_nm) doShipSchdRslt_cst_nm_NC(info);
		else if (nc == ShipSchdRslt_ship_to_id_typ) doShipSchdRslt_ship_to_id_typ_NC(info);
		else if (nc == ShipSchdRslt_ship_to_id_typ_nm) doShipSchdRslt_ship_to_id_typ_nm_NC(info);
		else if (nc == ShipSchdRslt_ship_to_id_cd) doShipSchdRslt_ship_to_id_cd_NC(info);
		else if (nc == ShipSchdRslt_ship_to_id_nm) doShipSchdRslt_ship_to_id_nm_NC(info);
		else if (nc == ShipSchdRslt_rqst_usr_cd) doShipSchdRslt_rqst_usr_cd_NC(info);
		else if (nc == ShipSchdRslt_rqst_usr_nm) doShipSchdRslt_rqst_usr_nm_NC(info);
		else if (nc == ShipSchdRslt_rqst_dpt_cd) doShipSchdRslt_rqst_dpt_cd_NC(info);
		else if (nc == ShipSchdRslt_rqst_dpt_nm) doShipSchdRslt_rqst_dpt_nm_NC(info);
		else if (nc == ShipSchdRslt_loc_cd) doShipSchdRslt_loc_cd_NC(info);
		else if (nc == ShipSchdRslt_loc_nm) doShipSchdRslt_loc_nm_NC(info);
		else if (nc == ShipSchdRslt_str_ln_cd) doShipSchdRslt_str_ln_cd_NC(info);
		else if (nc == ShipSchdRslt_str_ln_nm) doShipSchdRslt_str_ln_nm_NC(info);
		else if (nc == ShipSchdRslt_lot_no) doShipSchdRslt_lot_no_NC(info);
		else if (nc == ShipSchdRslt_sublot_no) doShipSchdRslt_sublot_no_NC(info);
		else if (nc == ShipSchdRslt_ver_flg) doShipSchdRslt_ver_flg_NC(info);
		else if (nc == ShipSchdRslt_not_lot_mix_flg) doShipSchdRslt_not_lot_mix_flg_NC(info);
		else if (nc == ShipSchdRslt_not_sublot_mix_flg) doShipSchdRslt_not_sublot_mix_flg_NC(info);
		else if (nc == ShipSchdRslt_wg_cd) doShipSchdRslt_wg_cd_NC(info);
		else if (nc == ShipSchdRslt_wg_nm) doShipSchdRslt_wg_nm_NC(info);
		else if (nc == ShipSchdRslt_site_cd) doShipSchdRslt_site_cd_NC(info);
		else if (nc == ShipSchdRslt_site_nm) doShipSchdRslt_site_nm_NC(info);
		else if (nc == ShipSchdRslt_ship_lg_grp_cd) doShipSchdRslt_ship_lg_grp_cd_NC(info);
		else if (nc == ShipSchdRslt_ship_lg_grp_nm) doShipSchdRslt_ship_lg_grp_nm_NC(info);
		else if (nc == ShipSchdRslt_alloc_grp_cd) doShipSchdRslt_alloc_grp_cd_NC(info);
		else if (nc == ShipSchdRslt_alloc_grp_nm) doShipSchdRslt_alloc_grp_nm_NC(info);
		else if (nc == ShipSchdRslt_gd_cd) doShipSchdRslt_gd_cd_NC(info);
		else if (nc == ShipSchdRslt_gd_nm) doShipSchdRslt_gd_nm_NC(info);
		else if (nc == ShipSchdRslt_quality_typ) doShipSchdRslt_quality_typ_NC(info);
		else if (nc == ShipSchdRslt_quality_typ_nm) doShipSchdRslt_quality_typ_nm_NC(info);
		else if (nc == ShipSchdRslt_stk_insp_typ) doShipSchdRslt_stk_insp_typ_NC(info);
		else if (nc == ShipSchdRslt_stk_insp_typ_nm) doShipSchdRslt_stk_insp_typ_nm_NC(info);
		else if (nc == ShipSchdRslt_stk_id_typ) doShipSchdRslt_stk_id_typ_NC(info);
		else if (nc == ShipSchdRslt_stk_id_typ_nm) doShipSchdRslt_stk_id_typ_nm_NC(info);
		else if (nc == ShipSchdRslt_stk_bp_cd) doShipSchdRslt_stk_bp_cd_NC(info);
		else if (nc == ShipSchdRslt_stk_bp_nm) doShipSchdRslt_stk_bp_nm_NC(info);
		else if (nc == ShipSchdRslt_ship_schd_split_typ) doShipSchdRslt_ship_schd_split_typ_NC(info);
		else if (nc == ShipSchdRslt_ship_schd_split_typ_nm) doShipSchdRslt_ship_schd_split_typ_nm_NC(info);
		else if (nc == ShipSchdRslt_alloc_scope_typ) doShipSchdRslt_alloc_scope_typ_NC(info);
		else if (nc == ShipSchdRslt_alloc_scope_typ_nm) doShipSchdRslt_alloc_scope_typ_nm_NC(info);
		else if (nc == ShipSchdRslt_not_lg_mix_flg) doShipSchdRslt_not_lg_mix_flg_NC(info);
		else if (nc == ShipSchdRslt_dlv_rqst_dt) doShipSchdRslt_dlv_rqst_dt_NC(info);
		else if (nc == ShipSchdRslt_dlv_rqst_hm) doShipSchdRslt_dlv_rqst_hm_NC(info);
		else if (nc == ShipSchdRslt_ship_rqst_dt) doShipSchdRslt_ship_rqst_dt_NC(info);
		else if (nc == ShipSchdRslt_ship_rqst_hm) doShipSchdRslt_ship_rqst_hm_NC(info);
		else if (nc == ShipSchdRslt_pd_inst_dlv_dt) doShipSchdRslt_pd_inst_dlv_dt_NC(info);
		else if (nc == ShipSchdRslt_pd_inst_dlv_hm) doShipSchdRslt_pd_inst_dlv_hm_NC(info);
		else if (nc == ShipSchdRslt_dlv_inst_dt) doShipSchdRslt_dlv_inst_dt_NC(info);
		else if (nc == ShipSchdRslt_dlv_inst_hm) doShipSchdRslt_dlv_inst_hm_NC(info);
		else if (nc == ShipSchdRslt_ship_schd_dt) doShipSchdRslt_ship_schd_dt_NC(info);
		else if (nc == ShipSchdRslt_ship_schd_hm) doShipSchdRslt_ship_schd_hm_NC(info);
		else if (nc == ShipSchdRslt_dlv_schd_dt) doShipSchdRslt_dlv_schd_dt_NC(info);
		else if (nc == ShipSchdRslt_dlv_schd_hm) doShipSchdRslt_dlv_schd_hm_NC(info);
		else if (nc == ShipSchdRslt_ship_block_flg) doShipSchdRslt_ship_block_flg_NC(info);
		else if (nc == ShipSchdRslt_pack_alloc_flg) doShipSchdRslt_pack_alloc_flg_NC(info);
		else if (nc == ShipSchdRslt_trd_unit_cd) doShipSchdRslt_trd_unit_cd_NC(info);
		else if (nc == ShipSchdRslt_trd_unit_nm) doShipSchdRslt_trd_unit_nm_NC(info);
		else if (nc == ShipSchdRslt_trd_unit_dec_place) doShipSchdRslt_trd_unit_dec_place_NC(info);
		else if (nc == ShipSchdRslt_base_unit_cd) doShipSchdRslt_base_unit_cd_NC(info);
		else if (nc == ShipSchdRslt_base_unit_nm) doShipSchdRslt_base_unit_nm_NC(info);
		else if (nc == ShipSchdRslt_base_unit_dec_place) doShipSchdRslt_base_unit_dec_place_NC(info);
		else if (nc == ShipSchdRslt_ship_pr_upd_cntr) doShipSchdRslt_ship_pr_upd_cntr_NC(info);
		else if (nc == columnShipAllocRslt_slo_no) doShipAllocRslt_slo_no_NC(info);
		else if (nc == columnShipAllocRslt_slo_d_no) doShipAllocRslt_slo_d_no_NC(info);
		else if (nc == columnShipAllocRslt_xfr_schd_no) doShipAllocRslt_xfr_schd_no_NC(info);
		else if (nc == columnShipAllocRslt_ship_schd_no) doShipAllocRslt_ship_schd_no_NC(info);
		else if (nc == columnShipAllocRslt_ship_alloc_sts_no) doShipAllocRslt_ship_alloc_sts_no_NC(info);
		else if (nc == columnShipAllocRslt_vstk_in_schd_flg) doShipAllocRslt_vstk_in_schd_flg_NC(info);
		else if (nc == columnShipAllocRslt_cst_cd) doShipAllocRslt_cst_cd_NC(info);
		else if (nc == columnShipAllocRslt_cst_nm) doShipAllocRslt_cst_nm_NC(info);
		else if (nc == columnShipAllocRslt_ship_loc_cd) doShipAllocRslt_ship_loc_cd_NC(info);
		else if (nc == columnShipAllocRslt_ship_loc_nm) doShipAllocRslt_ship_loc_nm_NC(info);
		else if (nc == columnShipAllocRslt_wg_cd) doShipAllocRslt_wg_cd_NC(info);
		else if (nc == columnShipAllocRslt_wg_nm) doShipAllocRslt_wg_nm_NC(info);
		else if (nc == columnShipAllocRslt_site_cd) doShipAllocRslt_site_cd_NC(info);
		else if (nc == columnShipAllocRslt_site_nm) doShipAllocRslt_site_nm_NC(info);
		else if (nc == columnShipAllocRslt_ship_fr_lg_grp_cd) doShipAllocRslt_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnShipAllocRslt_ship_fr_lg_grp_nm) doShipAllocRslt_ship_fr_lg_grp_nm_NC(info);
		else if (nc == columnShipAllocRslt_alloc_grp_cd) doShipAllocRslt_alloc_grp_cd_NC(info);
		else if (nc == columnShipAllocRslt_alloc_grp_nm) doShipAllocRslt_alloc_grp_nm_NC(info);
		else if (nc == columnShipAllocRslt_ver_flg) doShipAllocRslt_ver_flg_NC(info);
		else if (nc == columnShipAllocRslt_not_lot_mix_flg) doShipAllocRslt_not_lot_mix_flg_NC(info);
		else if (nc == columnShipAllocRslt_not_sublot_mix_flg) doShipAllocRslt_not_sublot_mix_flg_NC(info);
		else if (nc == columnShipAllocRslt_stk_id_typ) doShipAllocRslt_stk_id_typ_NC(info);
		else if (nc == columnShipAllocRslt_stk_id_typ_nm) doShipAllocRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnShipAllocRslt_stk_bp_cd) doShipAllocRslt_stk_bp_cd_NC(info);
		else if (nc == columnShipAllocRslt_stk_bp_nm) doShipAllocRslt_stk_bp_nm_NC(info);
		else if (nc == columnShipAllocRslt_pack_unit_cd) doShipAllocRslt_pack_unit_cd_NC(info);
		else if (nc == columnShipAllocRslt_pack_unit_nm) doShipAllocRslt_pack_unit_nm_NC(info);
		else if (nc == columnShipAllocRslt_pack_unit_dec_place) doShipAllocRslt_pack_unit_dec_place_NC(info);
		else if (nc == columnShipAllocRslt_pack_unit_conv_base_qty) doShipAllocRslt_pack_unit_conv_base_qty_NC(info);
		else if (nc == columnShipAllocRslt_pack_unit_conv_qty) doShipAllocRslt_pack_unit_conv_qty_NC(info);
		else if (nc == columnShipAllocRslt_base_unit_cd) doShipAllocRslt_base_unit_cd_NC(info);
		else if (nc == columnShipAllocRslt_base_unit_nm) doShipAllocRslt_base_unit_nm_NC(info);
		else if (nc == columnShipAllocRslt_base_unit_dec_place) doShipAllocRslt_base_unit_dec_place_NC(info);
		else if (nc == columnShipAllocRslt_base_unit_rnd_typ) doShipAllocRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnShipAllocRslt_dlv_rqst_dt) doShipAllocRslt_dlv_rqst_dt_NC(info);
		else if (nc == columnShipAllocRslt_dlv_rqst_hm) doShipAllocRslt_dlv_rqst_hm_NC(info);
		else if (nc == columnShipAllocRslt_ship_rqst_dt) doShipAllocRslt_ship_rqst_dt_NC(info);
		else if (nc == columnShipAllocRslt_ship_rqst_hm) doShipAllocRslt_ship_rqst_hm_NC(info);
		else if (nc == columnShipAllocRslt_pd_inst_dlv_dt) doShipAllocRslt_pd_inst_dlv_dt_NC(info);
		else if (nc == columnShipAllocRslt_pd_inst_dlv_hm) doShipAllocRslt_pd_inst_dlv_hm_NC(info);
		else if (nc == columnShipAllocRslt_dlv_inst_dt) doShipAllocRslt_dlv_inst_dt_NC(info);
		else if (nc == columnShipAllocRslt_dlv_inst_hm) doShipAllocRslt_dlv_inst_hm_NC(info);
		else if (nc == columnShipAllocRslt_ship_schd_dt) doShipAllocRslt_ship_schd_dt_NC(info);
		else if (nc == columnShipAllocRslt_ship_schd_hm) doShipAllocRslt_ship_schd_hm_NC(info);
		else if (nc == columnShipAllocRslt_dlv_schd_dt) doShipAllocRslt_dlv_schd_dt_NC(info);
		else if (nc == columnShipAllocRslt_dlv_schd_hm) doShipAllocRslt_dlv_schd_hm_NC(info);
		else if (nc == columnShipAllocRslt_rqst_usr_cd) doShipAllocRslt_rqst_usr_cd_NC(info);
		else if (nc == columnShipAllocRslt_rqst_usr_nm) doShipAllocRslt_rqst_usr_nm_NC(info);
		else if (nc == columnShipAllocRslt_rqst_dpt_cd) doShipAllocRslt_rqst_dpt_cd_NC(info);
		else if (nc == columnShipAllocRslt_rqst_dpt_nm) doShipAllocRslt_rqst_dpt_nm_NC(info);
		else if (nc == columnShipAllocRslt_ship_to_id_typ) doShipAllocRslt_ship_to_id_typ_NC(info);
		else if (nc == columnShipAllocRslt_ship_to_id_typ_nm) doShipAllocRslt_ship_to_id_typ_nm_NC(info);
		else if (nc == columnShipAllocRslt_ship_to_id_cd) doShipAllocRslt_ship_to_id_cd_NC(info);
		else if (nc == columnShipAllocRslt_ship_to_id_nm) doShipAllocRslt_ship_to_id_nm_NC(info);
		else if (nc == columnShipAllocRslt_alloc_scope_typ) doShipAllocRslt_alloc_scope_typ_NC(info);
		else if (nc == columnShipAllocRslt_alloc_scope_typ_nm) doShipAllocRslt_alloc_scope_typ_nm_NC(info);
		else if (nc == columnShipAllocRslt_not_lg_mix_flg) doShipAllocRslt_not_lg_mix_flg_NC(info);
		else if (nc == columnShipAllocRslt_ship_pr_no) doShipAllocRslt_ship_pr_no_NC(info);
		else if (nc == columnShipAllocRslt_ship_pr_upd_cntr) doShipAllocRslt_ship_pr_upd_cntr_NC(info);
	}

	/**
	 * [ShipAllocRslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_split_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_split_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_scope_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_scope_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_lg_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_lg_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_rqst_hm_NC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[dlv_inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_hm_NC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[pack_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pack_alloc_flg_NC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[ship_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_pr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_alloc_sts_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_alloc_sts_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[vstk_in_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_vstk_in_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[not_lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_not_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[not_sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_not_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_rqst_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_rqst_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pd_inst_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pd_inst_dlv_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_inst_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_scope_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_scope_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[not_lg_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_not_lg_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_pr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == ShipAllocRsltTable) doShipAllocRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ship_schd_no) doCnd_ship_schd_no_NE(info);
		else if (ne == ShipSchdRslt_trd_cd) doShipSchdRslt_trd_cd_NE(info);
		else if (ne == ShipSchdRslt_trd_nm) doShipSchdRslt_trd_nm_NE(info);
		else if (ne == ShipSchdRslt_slo_no) doShipSchdRslt_slo_no_NE(info);
		else if (ne == ShipSchdRslt_slo_d_no) doShipSchdRslt_slo_d_no_NE(info);
		else if (ne == ShipSchdRslt_xfr_schd_no) doShipSchdRslt_xfr_schd_no_NE(info);
		else if (ne == ShipSchdRslt_ship_schd_no) doShipSchdRslt_ship_schd_no_NE(info);
		else if (ne == ShipSchdRslt_dlv_id_typ) doShipSchdRslt_dlv_id_typ_NE(info);
		else if (ne == ShipSchdRslt_dlv_id_typ_nm) doShipSchdRslt_dlv_id_typ_nm_NE(info);
		else if (ne == ShipSchdRslt_dlv_id_cd) doShipSchdRslt_dlv_id_cd_NE(info);
		else if (ne == ShipSchdRslt_dlv_id_nm) doShipSchdRslt_dlv_id_nm_NE(info);
		else if (ne == ShipSchdRslt_cst_cd) doShipSchdRslt_cst_cd_NE(info);
		else if (ne == ShipSchdRslt_cst_nm) doShipSchdRslt_cst_nm_NE(info);
		else if (ne == ShipSchdRslt_ship_to_id_typ) doShipSchdRslt_ship_to_id_typ_NE(info);
		else if (ne == ShipSchdRslt_ship_to_id_typ_nm) doShipSchdRslt_ship_to_id_typ_nm_NE(info);
		else if (ne == ShipSchdRslt_ship_to_id_cd) doShipSchdRslt_ship_to_id_cd_NE(info);
		else if (ne == ShipSchdRslt_ship_to_id_nm) doShipSchdRslt_ship_to_id_nm_NE(info);
		else if (ne == ShipSchdRslt_rqst_usr_cd) doShipSchdRslt_rqst_usr_cd_NE(info);
		else if (ne == ShipSchdRslt_rqst_usr_nm) doShipSchdRslt_rqst_usr_nm_NE(info);
		else if (ne == ShipSchdRslt_rqst_dpt_cd) doShipSchdRslt_rqst_dpt_cd_NE(info);
		else if (ne == ShipSchdRslt_rqst_dpt_nm) doShipSchdRslt_rqst_dpt_nm_NE(info);
		else if (ne == ShipSchdRslt_loc_cd) doShipSchdRslt_loc_cd_NE(info);
		else if (ne == ShipSchdRslt_loc_nm) doShipSchdRslt_loc_nm_NE(info);
		else if (ne == ShipSchdRslt_str_ln_cd) doShipSchdRslt_str_ln_cd_NE(info);
		else if (ne == ShipSchdRslt_str_ln_nm) doShipSchdRslt_str_ln_nm_NE(info);
		else if (ne == ShipSchdRslt_lot_no) doShipSchdRslt_lot_no_NE(info);
		else if (ne == ShipSchdRslt_sublot_no) doShipSchdRslt_sublot_no_NE(info);
		else if (ne == ShipSchdRslt_ver_flg) doShipSchdRslt_ver_flg_NE(info);
		else if (ne == ShipSchdRslt_not_lot_mix_flg) doShipSchdRslt_not_lot_mix_flg_NE(info);
		else if (ne == ShipSchdRslt_not_sublot_mix_flg) doShipSchdRslt_not_sublot_mix_flg_NE(info);
		else if (ne == ShipSchdRslt_wg_cd) doShipSchdRslt_wg_cd_NE(info);
		else if (ne == ShipSchdRslt_wg_nm) doShipSchdRslt_wg_nm_NE(info);
		else if (ne == ShipSchdRslt_site_cd) doShipSchdRslt_site_cd_NE(info);
		else if (ne == ShipSchdRslt_site_nm) doShipSchdRslt_site_nm_NE(info);
		else if (ne == ShipSchdRslt_ship_lg_grp_cd) doShipSchdRslt_ship_lg_grp_cd_NE(info);
		else if (ne == ShipSchdRslt_ship_lg_grp_nm) doShipSchdRslt_ship_lg_grp_nm_NE(info);
		else if (ne == ShipSchdRslt_alloc_grp_cd) doShipSchdRslt_alloc_grp_cd_NE(info);
		else if (ne == ShipSchdRslt_alloc_grp_nm) doShipSchdRslt_alloc_grp_nm_NE(info);
		else if (ne == ShipSchdRslt_gd_cd) doShipSchdRslt_gd_cd_NE(info);
		else if (ne == ShipSchdRslt_gd_nm) doShipSchdRslt_gd_nm_NE(info);
		else if (ne == ShipSchdRslt_quality_typ) doShipSchdRslt_quality_typ_NE(info);
		else if (ne == ShipSchdRslt_quality_typ_nm) doShipSchdRslt_quality_typ_nm_NE(info);
		else if (ne == ShipSchdRslt_stk_insp_typ) doShipSchdRslt_stk_insp_typ_NE(info);
		else if (ne == ShipSchdRslt_stk_insp_typ_nm) doShipSchdRslt_stk_insp_typ_nm_NE(info);
		else if (ne == ShipSchdRslt_stk_id_typ) doShipSchdRslt_stk_id_typ_NE(info);
		else if (ne == ShipSchdRslt_stk_id_typ_nm) doShipSchdRslt_stk_id_typ_nm_NE(info);
		else if (ne == ShipSchdRslt_stk_bp_cd) doShipSchdRslt_stk_bp_cd_NE(info);
		else if (ne == ShipSchdRslt_stk_bp_nm) doShipSchdRslt_stk_bp_nm_NE(info);
		else if (ne == ShipSchdRslt_ship_schd_split_typ) doShipSchdRslt_ship_schd_split_typ_NE(info);
		else if (ne == ShipSchdRslt_ship_schd_split_typ_nm) doShipSchdRslt_ship_schd_split_typ_nm_NE(info);
		else if (ne == ShipSchdRslt_alloc_scope_typ) doShipSchdRslt_alloc_scope_typ_NE(info);
		else if (ne == ShipSchdRslt_alloc_scope_typ_nm) doShipSchdRslt_alloc_scope_typ_nm_NE(info);
		else if (ne == ShipSchdRslt_not_lg_mix_flg) doShipSchdRslt_not_lg_mix_flg_NE(info);
		else if (ne == ShipSchdRslt_dlv_rqst_dt) doShipSchdRslt_dlv_rqst_dt_NE(info);
		else if (ne == ShipSchdRslt_dlv_rqst_hm) doShipSchdRslt_dlv_rqst_hm_NE(info);
		else if (ne == ShipSchdRslt_ship_rqst_dt) doShipSchdRslt_ship_rqst_dt_NE(info);
		else if (ne == ShipSchdRslt_ship_rqst_hm) doShipSchdRslt_ship_rqst_hm_NE(info);
		else if (ne == ShipSchdRslt_pd_inst_dlv_dt) doShipSchdRslt_pd_inst_dlv_dt_NE(info);
		else if (ne == ShipSchdRslt_pd_inst_dlv_hm) doShipSchdRslt_pd_inst_dlv_hm_NE(info);
		else if (ne == ShipSchdRslt_dlv_inst_dt) doShipSchdRslt_dlv_inst_dt_NE(info);
		else if (ne == ShipSchdRslt_dlv_inst_hm) doShipSchdRslt_dlv_inst_hm_NE(info);
		else if (ne == ShipSchdRslt_ship_schd_dt) doShipSchdRslt_ship_schd_dt_NE(info);
		else if (ne == ShipSchdRslt_ship_schd_hm) doShipSchdRslt_ship_schd_hm_NE(info);
		else if (ne == ShipSchdRslt_dlv_schd_dt) doShipSchdRslt_dlv_schd_dt_NE(info);
		else if (ne == ShipSchdRslt_dlv_schd_hm) doShipSchdRslt_dlv_schd_hm_NE(info);
		else if (ne == ShipSchdRslt_ship_block_flg) doShipSchdRslt_ship_block_flg_NE(info);
		else if (ne == ShipSchdRslt_pack_alloc_flg) doShipSchdRslt_pack_alloc_flg_NE(info);
		else if (ne == ShipSchdRslt_trd_unit_cd) doShipSchdRslt_trd_unit_cd_NE(info);
		else if (ne == ShipSchdRslt_trd_unit_nm) doShipSchdRslt_trd_unit_nm_NE(info);
		else if (ne == ShipSchdRslt_trd_unit_dec_place) doShipSchdRslt_trd_unit_dec_place_NE(info);
		else if (ne == ShipSchdRslt_base_unit_cd) doShipSchdRslt_base_unit_cd_NE(info);
		else if (ne == ShipSchdRslt_base_unit_nm) doShipSchdRslt_base_unit_nm_NE(info);
		else if (ne == ShipSchdRslt_base_unit_dec_place) doShipSchdRslt_base_unit_dec_place_NE(info);
		else if (ne == ShipSchdRslt_ship_pr_upd_cntr) doShipSchdRslt_ship_pr_upd_cntr_NE(info);
		else if (ne == columnShipAllocRslt_slo_no) doShipAllocRslt_slo_no_NE(info);
		else if (ne == columnShipAllocRslt_slo_d_no) doShipAllocRslt_slo_d_no_NE(info);
		else if (ne == columnShipAllocRslt_xfr_schd_no) doShipAllocRslt_xfr_schd_no_NE(info);
		else if (ne == columnShipAllocRslt_ship_schd_no) doShipAllocRslt_ship_schd_no_NE(info);
		else if (ne == columnShipAllocRslt_ship_alloc_sts_no) doShipAllocRslt_ship_alloc_sts_no_NE(info);
		else if (ne == columnShipAllocRslt_vstk_in_schd_flg) doShipAllocRslt_vstk_in_schd_flg_NE(info);
		else if (ne == columnShipAllocRslt_cst_cd) doShipAllocRslt_cst_cd_NE(info);
		else if (ne == columnShipAllocRslt_cst_nm) doShipAllocRslt_cst_nm_NE(info);
		else if (ne == columnShipAllocRslt_ship_loc_cd) doShipAllocRslt_ship_loc_cd_NE(info);
		else if (ne == columnShipAllocRslt_ship_loc_nm) doShipAllocRslt_ship_loc_nm_NE(info);
		else if (ne == columnShipAllocRslt_wg_cd) doShipAllocRslt_wg_cd_NE(info);
		else if (ne == columnShipAllocRslt_wg_nm) doShipAllocRslt_wg_nm_NE(info);
		else if (ne == columnShipAllocRslt_site_cd) doShipAllocRslt_site_cd_NE(info);
		else if (ne == columnShipAllocRslt_site_nm) doShipAllocRslt_site_nm_NE(info);
		else if (ne == columnShipAllocRslt_ship_fr_lg_grp_cd) doShipAllocRslt_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnShipAllocRslt_ship_fr_lg_grp_nm) doShipAllocRslt_ship_fr_lg_grp_nm_NE(info);
		else if (ne == columnShipAllocRslt_alloc_grp_cd) doShipAllocRslt_alloc_grp_cd_NE(info);
		else if (ne == columnShipAllocRslt_alloc_grp_nm) doShipAllocRslt_alloc_grp_nm_NE(info);
		else if (ne == columnShipAllocRslt_ver_flg) doShipAllocRslt_ver_flg_NE(info);
		else if (ne == columnShipAllocRslt_not_lot_mix_flg) doShipAllocRslt_not_lot_mix_flg_NE(info);
		else if (ne == columnShipAllocRslt_not_sublot_mix_flg) doShipAllocRslt_not_sublot_mix_flg_NE(info);
		else if (ne == columnShipAllocRslt_stk_id_typ) doShipAllocRslt_stk_id_typ_NE(info);
		else if (ne == columnShipAllocRslt_stk_id_typ_nm) doShipAllocRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnShipAllocRslt_stk_bp_cd) doShipAllocRslt_stk_bp_cd_NE(info);
		else if (ne == columnShipAllocRslt_stk_bp_nm) doShipAllocRslt_stk_bp_nm_NE(info);
		else if (ne == columnShipAllocRslt_pack_unit_cd) doShipAllocRslt_pack_unit_cd_NE(info);
		else if (ne == columnShipAllocRslt_pack_unit_nm) doShipAllocRslt_pack_unit_nm_NE(info);
		else if (ne == columnShipAllocRslt_pack_unit_dec_place) doShipAllocRslt_pack_unit_dec_place_NE(info);
		else if (ne == columnShipAllocRslt_pack_unit_conv_base_qty) doShipAllocRslt_pack_unit_conv_base_qty_NE(info);
		else if (ne == columnShipAllocRslt_pack_unit_conv_qty) doShipAllocRslt_pack_unit_conv_qty_NE(info);
		else if (ne == columnShipAllocRslt_base_unit_cd) doShipAllocRslt_base_unit_cd_NE(info);
		else if (ne == columnShipAllocRslt_base_unit_nm) doShipAllocRslt_base_unit_nm_NE(info);
		else if (ne == columnShipAllocRslt_base_unit_dec_place) doShipAllocRslt_base_unit_dec_place_NE(info);
		else if (ne == columnShipAllocRslt_base_unit_rnd_typ) doShipAllocRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnShipAllocRslt_dlv_rqst_dt) doShipAllocRslt_dlv_rqst_dt_NE(info);
		else if (ne == columnShipAllocRslt_dlv_rqst_hm) doShipAllocRslt_dlv_rqst_hm_NE(info);
		else if (ne == columnShipAllocRslt_ship_rqst_dt) doShipAllocRslt_ship_rqst_dt_NE(info);
		else if (ne == columnShipAllocRslt_ship_rqst_hm) doShipAllocRslt_ship_rqst_hm_NE(info);
		else if (ne == columnShipAllocRslt_pd_inst_dlv_dt) doShipAllocRslt_pd_inst_dlv_dt_NE(info);
		else if (ne == columnShipAllocRslt_pd_inst_dlv_hm) doShipAllocRslt_pd_inst_dlv_hm_NE(info);
		else if (ne == columnShipAllocRslt_dlv_inst_dt) doShipAllocRslt_dlv_inst_dt_NE(info);
		else if (ne == columnShipAllocRslt_dlv_inst_hm) doShipAllocRslt_dlv_inst_hm_NE(info);
		else if (ne == columnShipAllocRslt_ship_schd_dt) doShipAllocRslt_ship_schd_dt_NE(info);
		else if (ne == columnShipAllocRslt_ship_schd_hm) doShipAllocRslt_ship_schd_hm_NE(info);
		else if (ne == columnShipAllocRslt_dlv_schd_dt) doShipAllocRslt_dlv_schd_dt_NE(info);
		else if (ne == columnShipAllocRslt_dlv_schd_hm) doShipAllocRslt_dlv_schd_hm_NE(info);
		else if (ne == columnShipAllocRslt_rqst_usr_cd) doShipAllocRslt_rqst_usr_cd_NE(info);
		else if (ne == columnShipAllocRslt_rqst_usr_nm) doShipAllocRslt_rqst_usr_nm_NE(info);
		else if (ne == columnShipAllocRslt_rqst_dpt_cd) doShipAllocRslt_rqst_dpt_cd_NE(info);
		else if (ne == columnShipAllocRslt_rqst_dpt_nm) doShipAllocRslt_rqst_dpt_nm_NE(info);
		else if (ne == columnShipAllocRslt_ship_to_id_typ) doShipAllocRslt_ship_to_id_typ_NE(info);
		else if (ne == columnShipAllocRslt_ship_to_id_typ_nm) doShipAllocRslt_ship_to_id_typ_nm_NE(info);
		else if (ne == columnShipAllocRslt_ship_to_id_cd) doShipAllocRslt_ship_to_id_cd_NE(info);
		else if (ne == columnShipAllocRslt_ship_to_id_nm) doShipAllocRslt_ship_to_id_nm_NE(info);
		else if (ne == columnShipAllocRslt_alloc_scope_typ) doShipAllocRslt_alloc_scope_typ_NE(info);
		else if (ne == columnShipAllocRslt_alloc_scope_typ_nm) doShipAllocRslt_alloc_scope_typ_nm_NE(info);
		else if (ne == columnShipAllocRslt_not_lg_mix_flg) doShipAllocRslt_not_lg_mix_flg_NE(info);
		else if (ne == columnShipAllocRslt_ship_pr_no) doShipAllocRslt_ship_pr_no_NE(info);
		else if (ne == columnShipAllocRslt_ship_pr_upd_cntr) doShipAllocRslt_ship_pr_upd_cntr_NE(info);
	}

	/**
	 * [ShipAllocRslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_split_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_split_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_scope_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_scope_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_lg_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_lg_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_rqst_hm_NE(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[dlv_inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_hm_NE(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[pack_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pack_alloc_flg_NE(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[ship_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_pr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_alloc_sts_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_alloc_sts_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[vstk_in_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_vstk_in_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[not_lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_not_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[not_sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_not_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_rqst_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_rqst_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pd_inst_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pd_inst_dlv_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_inst_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_scope_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_scope_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[not_lg_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_not_lg_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_pr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == ShipAllocRsltTable) doShipAllocRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ship_schd_no) doCnd_ship_schd_no_NX(info);
		else if (nx == ShipSchdRslt_trd_cd) doShipSchdRslt_trd_cd_NX(info);
		else if (nx == ShipSchdRslt_trd_nm) doShipSchdRslt_trd_nm_NX(info);
		else if (nx == ShipSchdRslt_slo_no) doShipSchdRslt_slo_no_NX(info);
		else if (nx == ShipSchdRslt_slo_d_no) doShipSchdRslt_slo_d_no_NX(info);
		else if (nx == ShipSchdRslt_xfr_schd_no) doShipSchdRslt_xfr_schd_no_NX(info);
		else if (nx == ShipSchdRslt_ship_schd_no) doShipSchdRslt_ship_schd_no_NX(info);
		else if (nx == ShipSchdRslt_dlv_id_typ) doShipSchdRslt_dlv_id_typ_NX(info);
		else if (nx == ShipSchdRslt_dlv_id_typ_nm) doShipSchdRslt_dlv_id_typ_nm_NX(info);
		else if (nx == ShipSchdRslt_dlv_id_cd) doShipSchdRslt_dlv_id_cd_NX(info);
		else if (nx == ShipSchdRslt_dlv_id_nm) doShipSchdRslt_dlv_id_nm_NX(info);
		else if (nx == ShipSchdRslt_cst_cd) doShipSchdRslt_cst_cd_NX(info);
		else if (nx == ShipSchdRslt_cst_nm) doShipSchdRslt_cst_nm_NX(info);
		else if (nx == ShipSchdRslt_ship_to_id_typ) doShipSchdRslt_ship_to_id_typ_NX(info);
		else if (nx == ShipSchdRslt_ship_to_id_typ_nm) doShipSchdRslt_ship_to_id_typ_nm_NX(info);
		else if (nx == ShipSchdRslt_ship_to_id_cd) doShipSchdRslt_ship_to_id_cd_NX(info);
		else if (nx == ShipSchdRslt_ship_to_id_nm) doShipSchdRslt_ship_to_id_nm_NX(info);
		else if (nx == ShipSchdRslt_rqst_usr_cd) doShipSchdRslt_rqst_usr_cd_NX(info);
		else if (nx == ShipSchdRslt_rqst_usr_nm) doShipSchdRslt_rqst_usr_nm_NX(info);
		else if (nx == ShipSchdRslt_rqst_dpt_cd) doShipSchdRslt_rqst_dpt_cd_NX(info);
		else if (nx == ShipSchdRslt_rqst_dpt_nm) doShipSchdRslt_rqst_dpt_nm_NX(info);
		else if (nx == ShipSchdRslt_loc_cd) doShipSchdRslt_loc_cd_NX(info);
		else if (nx == ShipSchdRslt_loc_nm) doShipSchdRslt_loc_nm_NX(info);
		else if (nx == ShipSchdRslt_str_ln_cd) doShipSchdRslt_str_ln_cd_NX(info);
		else if (nx == ShipSchdRslt_str_ln_nm) doShipSchdRslt_str_ln_nm_NX(info);
		else if (nx == ShipSchdRslt_lot_no) doShipSchdRslt_lot_no_NX(info);
		else if (nx == ShipSchdRslt_sublot_no) doShipSchdRslt_sublot_no_NX(info);
		else if (nx == ShipSchdRslt_ver_flg) doShipSchdRslt_ver_flg_NX(info);
		else if (nx == ShipSchdRslt_not_lot_mix_flg) doShipSchdRslt_not_lot_mix_flg_NX(info);
		else if (nx == ShipSchdRslt_not_sublot_mix_flg) doShipSchdRslt_not_sublot_mix_flg_NX(info);
		else if (nx == ShipSchdRslt_wg_cd) doShipSchdRslt_wg_cd_NX(info);
		else if (nx == ShipSchdRslt_wg_nm) doShipSchdRslt_wg_nm_NX(info);
		else if (nx == ShipSchdRslt_site_cd) doShipSchdRslt_site_cd_NX(info);
		else if (nx == ShipSchdRslt_site_nm) doShipSchdRslt_site_nm_NX(info);
		else if (nx == ShipSchdRslt_ship_lg_grp_cd) doShipSchdRslt_ship_lg_grp_cd_NX(info);
		else if (nx == ShipSchdRslt_ship_lg_grp_nm) doShipSchdRslt_ship_lg_grp_nm_NX(info);
		else if (nx == ShipSchdRslt_alloc_grp_cd) doShipSchdRslt_alloc_grp_cd_NX(info);
		else if (nx == ShipSchdRslt_alloc_grp_nm) doShipSchdRslt_alloc_grp_nm_NX(info);
		else if (nx == ShipSchdRslt_gd_cd) doShipSchdRslt_gd_cd_NX(info);
		else if (nx == ShipSchdRslt_gd_nm) doShipSchdRslt_gd_nm_NX(info);
		else if (nx == ShipSchdRslt_quality_typ) doShipSchdRslt_quality_typ_NX(info);
		else if (nx == ShipSchdRslt_quality_typ_nm) doShipSchdRslt_quality_typ_nm_NX(info);
		else if (nx == ShipSchdRslt_stk_insp_typ) doShipSchdRslt_stk_insp_typ_NX(info);
		else if (nx == ShipSchdRslt_stk_insp_typ_nm) doShipSchdRslt_stk_insp_typ_nm_NX(info);
		else if (nx == ShipSchdRslt_stk_id_typ) doShipSchdRslt_stk_id_typ_NX(info);
		else if (nx == ShipSchdRslt_stk_id_typ_nm) doShipSchdRslt_stk_id_typ_nm_NX(info);
		else if (nx == ShipSchdRslt_stk_bp_cd) doShipSchdRslt_stk_bp_cd_NX(info);
		else if (nx == ShipSchdRslt_stk_bp_nm) doShipSchdRslt_stk_bp_nm_NX(info);
		else if (nx == ShipSchdRslt_ship_schd_split_typ) doShipSchdRslt_ship_schd_split_typ_NX(info);
		else if (nx == ShipSchdRslt_ship_schd_split_typ_nm) doShipSchdRslt_ship_schd_split_typ_nm_NX(info);
		else if (nx == ShipSchdRslt_alloc_scope_typ) doShipSchdRslt_alloc_scope_typ_NX(info);
		else if (nx == ShipSchdRslt_alloc_scope_typ_nm) doShipSchdRslt_alloc_scope_typ_nm_NX(info);
		else if (nx == ShipSchdRslt_not_lg_mix_flg) doShipSchdRslt_not_lg_mix_flg_NX(info);
		else if (nx == ShipSchdRslt_dlv_rqst_dt) doShipSchdRslt_dlv_rqst_dt_NX(info);
		else if (nx == ShipSchdRslt_dlv_rqst_hm) doShipSchdRslt_dlv_rqst_hm_NX(info);
		else if (nx == ShipSchdRslt_ship_rqst_dt) doShipSchdRslt_ship_rqst_dt_NX(info);
		else if (nx == ShipSchdRslt_ship_rqst_hm) doShipSchdRslt_ship_rqst_hm_NX(info);
		else if (nx == ShipSchdRslt_pd_inst_dlv_dt) doShipSchdRslt_pd_inst_dlv_dt_NX(info);
		else if (nx == ShipSchdRslt_pd_inst_dlv_hm) doShipSchdRslt_pd_inst_dlv_hm_NX(info);
		else if (nx == ShipSchdRslt_dlv_inst_dt) doShipSchdRslt_dlv_inst_dt_NX(info);
		else if (nx == ShipSchdRslt_dlv_inst_hm) doShipSchdRslt_dlv_inst_hm_NX(info);
		else if (nx == ShipSchdRslt_ship_schd_dt) doShipSchdRslt_ship_schd_dt_NX(info);
		else if (nx == ShipSchdRslt_ship_schd_hm) doShipSchdRslt_ship_schd_hm_NX(info);
		else if (nx == ShipSchdRslt_dlv_schd_dt) doShipSchdRslt_dlv_schd_dt_NX(info);
		else if (nx == ShipSchdRslt_dlv_schd_hm) doShipSchdRslt_dlv_schd_hm_NX(info);
		else if (nx == ShipSchdRslt_ship_block_flg) doShipSchdRslt_ship_block_flg_NX(info);
		else if (nx == ShipSchdRslt_pack_alloc_flg) doShipSchdRslt_pack_alloc_flg_NX(info);
		else if (nx == ShipSchdRslt_trd_unit_cd) doShipSchdRslt_trd_unit_cd_NX(info);
		else if (nx == ShipSchdRslt_trd_unit_nm) doShipSchdRslt_trd_unit_nm_NX(info);
		else if (nx == ShipSchdRslt_trd_unit_dec_place) doShipSchdRslt_trd_unit_dec_place_NX(info);
		else if (nx == ShipSchdRslt_base_unit_cd) doShipSchdRslt_base_unit_cd_NX(info);
		else if (nx == ShipSchdRslt_base_unit_nm) doShipSchdRslt_base_unit_nm_NX(info);
		else if (nx == ShipSchdRslt_base_unit_dec_place) doShipSchdRslt_base_unit_dec_place_NX(info);
		else if (nx == ShipSchdRslt_ship_pr_upd_cntr) doShipSchdRslt_ship_pr_upd_cntr_NX(info);
		else if (nx == columnShipAllocRslt_slo_no) doShipAllocRslt_slo_no_NX(info);
		else if (nx == columnShipAllocRslt_slo_d_no) doShipAllocRslt_slo_d_no_NX(info);
		else if (nx == columnShipAllocRslt_xfr_schd_no) doShipAllocRslt_xfr_schd_no_NX(info);
		else if (nx == columnShipAllocRslt_ship_schd_no) doShipAllocRslt_ship_schd_no_NX(info);
		else if (nx == columnShipAllocRslt_ship_alloc_sts_no) doShipAllocRslt_ship_alloc_sts_no_NX(info);
		else if (nx == columnShipAllocRslt_vstk_in_schd_flg) doShipAllocRslt_vstk_in_schd_flg_NX(info);
		else if (nx == columnShipAllocRslt_cst_cd) doShipAllocRslt_cst_cd_NX(info);
		else if (nx == columnShipAllocRslt_cst_nm) doShipAllocRslt_cst_nm_NX(info);
		else if (nx == columnShipAllocRslt_ship_loc_cd) doShipAllocRslt_ship_loc_cd_NX(info);
		else if (nx == columnShipAllocRslt_ship_loc_nm) doShipAllocRslt_ship_loc_nm_NX(info);
		else if (nx == columnShipAllocRslt_wg_cd) doShipAllocRslt_wg_cd_NX(info);
		else if (nx == columnShipAllocRslt_wg_nm) doShipAllocRslt_wg_nm_NX(info);
		else if (nx == columnShipAllocRslt_site_cd) doShipAllocRslt_site_cd_NX(info);
		else if (nx == columnShipAllocRslt_site_nm) doShipAllocRslt_site_nm_NX(info);
		else if (nx == columnShipAllocRslt_ship_fr_lg_grp_cd) doShipAllocRslt_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnShipAllocRslt_ship_fr_lg_grp_nm) doShipAllocRslt_ship_fr_lg_grp_nm_NX(info);
		else if (nx == columnShipAllocRslt_alloc_grp_cd) doShipAllocRslt_alloc_grp_cd_NX(info);
		else if (nx == columnShipAllocRslt_alloc_grp_nm) doShipAllocRslt_alloc_grp_nm_NX(info);
		else if (nx == columnShipAllocRslt_ver_flg) doShipAllocRslt_ver_flg_NX(info);
		else if (nx == columnShipAllocRslt_not_lot_mix_flg) doShipAllocRslt_not_lot_mix_flg_NX(info);
		else if (nx == columnShipAllocRslt_not_sublot_mix_flg) doShipAllocRslt_not_sublot_mix_flg_NX(info);
		else if (nx == columnShipAllocRslt_stk_id_typ) doShipAllocRslt_stk_id_typ_NX(info);
		else if (nx == columnShipAllocRslt_stk_id_typ_nm) doShipAllocRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnShipAllocRslt_stk_bp_cd) doShipAllocRslt_stk_bp_cd_NX(info);
		else if (nx == columnShipAllocRslt_stk_bp_nm) doShipAllocRslt_stk_bp_nm_NX(info);
		else if (nx == columnShipAllocRslt_pack_unit_cd) doShipAllocRslt_pack_unit_cd_NX(info);
		else if (nx == columnShipAllocRslt_pack_unit_nm) doShipAllocRslt_pack_unit_nm_NX(info);
		else if (nx == columnShipAllocRslt_pack_unit_dec_place) doShipAllocRslt_pack_unit_dec_place_NX(info);
		else if (nx == columnShipAllocRslt_pack_unit_conv_base_qty) doShipAllocRslt_pack_unit_conv_base_qty_NX(info);
		else if (nx == columnShipAllocRslt_pack_unit_conv_qty) doShipAllocRslt_pack_unit_conv_qty_NX(info);
		else if (nx == columnShipAllocRslt_base_unit_cd) doShipAllocRslt_base_unit_cd_NX(info);
		else if (nx == columnShipAllocRslt_base_unit_nm) doShipAllocRslt_base_unit_nm_NX(info);
		else if (nx == columnShipAllocRslt_base_unit_dec_place) doShipAllocRslt_base_unit_dec_place_NX(info);
		else if (nx == columnShipAllocRslt_base_unit_rnd_typ) doShipAllocRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnShipAllocRslt_dlv_rqst_dt) doShipAllocRslt_dlv_rqst_dt_NX(info);
		else if (nx == columnShipAllocRslt_dlv_rqst_hm) doShipAllocRslt_dlv_rqst_hm_NX(info);
		else if (nx == columnShipAllocRslt_ship_rqst_dt) doShipAllocRslt_ship_rqst_dt_NX(info);
		else if (nx == columnShipAllocRslt_ship_rqst_hm) doShipAllocRslt_ship_rqst_hm_NX(info);
		else if (nx == columnShipAllocRslt_pd_inst_dlv_dt) doShipAllocRslt_pd_inst_dlv_dt_NX(info);
		else if (nx == columnShipAllocRslt_pd_inst_dlv_hm) doShipAllocRslt_pd_inst_dlv_hm_NX(info);
		else if (nx == columnShipAllocRslt_dlv_inst_dt) doShipAllocRslt_dlv_inst_dt_NX(info);
		else if (nx == columnShipAllocRslt_dlv_inst_hm) doShipAllocRslt_dlv_inst_hm_NX(info);
		else if (nx == columnShipAllocRslt_ship_schd_dt) doShipAllocRslt_ship_schd_dt_NX(info);
		else if (nx == columnShipAllocRslt_ship_schd_hm) doShipAllocRslt_ship_schd_hm_NX(info);
		else if (nx == columnShipAllocRslt_dlv_schd_dt) doShipAllocRslt_dlv_schd_dt_NX(info);
		else if (nx == columnShipAllocRslt_dlv_schd_hm) doShipAllocRslt_dlv_schd_hm_NX(info);
		else if (nx == columnShipAllocRslt_rqst_usr_cd) doShipAllocRslt_rqst_usr_cd_NX(info);
		else if (nx == columnShipAllocRslt_rqst_usr_nm) doShipAllocRslt_rqst_usr_nm_NX(info);
		else if (nx == columnShipAllocRslt_rqst_dpt_cd) doShipAllocRslt_rqst_dpt_cd_NX(info);
		else if (nx == columnShipAllocRslt_rqst_dpt_nm) doShipAllocRslt_rqst_dpt_nm_NX(info);
		else if (nx == columnShipAllocRslt_ship_to_id_typ) doShipAllocRslt_ship_to_id_typ_NX(info);
		else if (nx == columnShipAllocRslt_ship_to_id_typ_nm) doShipAllocRslt_ship_to_id_typ_nm_NX(info);
		else if (nx == columnShipAllocRslt_ship_to_id_cd) doShipAllocRslt_ship_to_id_cd_NX(info);
		else if (nx == columnShipAllocRslt_ship_to_id_nm) doShipAllocRslt_ship_to_id_nm_NX(info);
		else if (nx == columnShipAllocRslt_alloc_scope_typ) doShipAllocRslt_alloc_scope_typ_NX(info);
		else if (nx == columnShipAllocRslt_alloc_scope_typ_nm) doShipAllocRslt_alloc_scope_typ_nm_NX(info);
		else if (nx == columnShipAllocRslt_not_lg_mix_flg) doShipAllocRslt_not_lg_mix_flg_NX(info);
		else if (nx == columnShipAllocRslt_ship_pr_no) doShipAllocRslt_ship_pr_no_NX(info);
		else if (nx == columnShipAllocRslt_ship_pr_upd_cntr) doShipAllocRslt_ship_pr_upd_cntr_NX(info);
	}

	/**
	 * [ShipAllocRslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_split_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_split_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_scope_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_scope_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_lg_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_lg_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_rqst_hm_NX(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[dlv_inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_hm_NX(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[pack_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pack_alloc_flg_NX(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[ship_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_pr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_alloc_sts_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_alloc_sts_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[vstk_in_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_vstk_in_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[not_lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_not_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[not_sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_not_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_rqst_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_rqst_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pd_inst_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pd_inst_dlv_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_inst_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_scope_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_scope_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[not_lg_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_not_lg_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_pr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ship_schd_no) doCnd_ship_schd_no_LC(info);
		else if (lc == ShipSchdRslt_trd_cd) doShipSchdRslt_trd_cd_LC(info);
		else if (lc == ShipSchdRslt_trd_nm) doShipSchdRslt_trd_nm_LC(info);
		else if (lc == ShipSchdRslt_slo_no) doShipSchdRslt_slo_no_LC(info);
		else if (lc == ShipSchdRslt_slo_d_no) doShipSchdRslt_slo_d_no_LC(info);
		else if (lc == ShipSchdRslt_xfr_schd_no) doShipSchdRslt_xfr_schd_no_LC(info);
		else if (lc == ShipSchdRslt_ship_schd_no) doShipSchdRslt_ship_schd_no_LC(info);
		else if (lc == ShipSchdRslt_dlv_id_typ) doShipSchdRslt_dlv_id_typ_LC(info);
		else if (lc == ShipSchdRslt_dlv_id_typ_nm) doShipSchdRslt_dlv_id_typ_nm_LC(info);
		else if (lc == ShipSchdRslt_dlv_id_cd) doShipSchdRslt_dlv_id_cd_LC(info);
		else if (lc == ShipSchdRslt_dlv_id_nm) doShipSchdRslt_dlv_id_nm_LC(info);
		else if (lc == ShipSchdRslt_cst_cd) doShipSchdRslt_cst_cd_LC(info);
		else if (lc == ShipSchdRslt_cst_nm) doShipSchdRslt_cst_nm_LC(info);
		else if (lc == ShipSchdRslt_ship_to_id_typ) doShipSchdRslt_ship_to_id_typ_LC(info);
		else if (lc == ShipSchdRslt_ship_to_id_typ_nm) doShipSchdRslt_ship_to_id_typ_nm_LC(info);
		else if (lc == ShipSchdRslt_ship_to_id_cd) doShipSchdRslt_ship_to_id_cd_LC(info);
		else if (lc == ShipSchdRslt_ship_to_id_nm) doShipSchdRslt_ship_to_id_nm_LC(info);
		else if (lc == ShipSchdRslt_rqst_usr_cd) doShipSchdRslt_rqst_usr_cd_LC(info);
		else if (lc == ShipSchdRslt_rqst_usr_nm) doShipSchdRslt_rqst_usr_nm_LC(info);
		else if (lc == ShipSchdRslt_rqst_dpt_cd) doShipSchdRslt_rqst_dpt_cd_LC(info);
		else if (lc == ShipSchdRslt_rqst_dpt_nm) doShipSchdRslt_rqst_dpt_nm_LC(info);
		else if (lc == ShipSchdRslt_loc_cd) doShipSchdRslt_loc_cd_LC(info);
		else if (lc == ShipSchdRslt_loc_nm) doShipSchdRslt_loc_nm_LC(info);
		else if (lc == ShipSchdRslt_str_ln_cd) doShipSchdRslt_str_ln_cd_LC(info);
		else if (lc == ShipSchdRslt_str_ln_nm) doShipSchdRslt_str_ln_nm_LC(info);
		else if (lc == ShipSchdRslt_lot_no) doShipSchdRslt_lot_no_LC(info);
		else if (lc == ShipSchdRslt_sublot_no) doShipSchdRslt_sublot_no_LC(info);
		else if (lc == ShipSchdRslt_wg_cd) doShipSchdRslt_wg_cd_LC(info);
		else if (lc == ShipSchdRslt_wg_nm) doShipSchdRslt_wg_nm_LC(info);
		else if (lc == ShipSchdRslt_site_cd) doShipSchdRslt_site_cd_LC(info);
		else if (lc == ShipSchdRslt_site_nm) doShipSchdRslt_site_nm_LC(info);
		else if (lc == ShipSchdRslt_ship_lg_grp_cd) doShipSchdRslt_ship_lg_grp_cd_LC(info);
		else if (lc == ShipSchdRslt_ship_lg_grp_nm) doShipSchdRslt_ship_lg_grp_nm_LC(info);
		else if (lc == ShipSchdRslt_alloc_grp_cd) doShipSchdRslt_alloc_grp_cd_LC(info);
		else if (lc == ShipSchdRslt_alloc_grp_nm) doShipSchdRslt_alloc_grp_nm_LC(info);
		else if (lc == ShipSchdRslt_gd_cd) doShipSchdRslt_gd_cd_LC(info);
		else if (lc == ShipSchdRslt_gd_nm) doShipSchdRslt_gd_nm_LC(info);
		else if (lc == ShipSchdRslt_quality_typ) doShipSchdRslt_quality_typ_LC(info);
		else if (lc == ShipSchdRslt_quality_typ_nm) doShipSchdRslt_quality_typ_nm_LC(info);
		else if (lc == ShipSchdRslt_stk_insp_typ) doShipSchdRslt_stk_insp_typ_LC(info);
		else if (lc == ShipSchdRslt_stk_insp_typ_nm) doShipSchdRslt_stk_insp_typ_nm_LC(info);
		else if (lc == ShipSchdRslt_stk_id_typ) doShipSchdRslt_stk_id_typ_LC(info);
		else if (lc == ShipSchdRslt_stk_id_typ_nm) doShipSchdRslt_stk_id_typ_nm_LC(info);
		else if (lc == ShipSchdRslt_stk_bp_cd) doShipSchdRslt_stk_bp_cd_LC(info);
		else if (lc == ShipSchdRslt_stk_bp_nm) doShipSchdRslt_stk_bp_nm_LC(info);
		else if (lc == ShipSchdRslt_ship_schd_split_typ) doShipSchdRslt_ship_schd_split_typ_LC(info);
		else if (lc == ShipSchdRslt_ship_schd_split_typ_nm) doShipSchdRslt_ship_schd_split_typ_nm_LC(info);
		else if (lc == ShipSchdRslt_alloc_scope_typ) doShipSchdRslt_alloc_scope_typ_LC(info);
		else if (lc == ShipSchdRslt_alloc_scope_typ_nm) doShipSchdRslt_alloc_scope_typ_nm_LC(info);
		else if (lc == ShipSchdRslt_dlv_rqst_dt) doShipSchdRslt_dlv_rqst_dt_LC(info);
		else if (lc == ShipSchdRslt_dlv_rqst_hm) doShipSchdRslt_dlv_rqst_hm_LC(info);
		else if (lc == ShipSchdRslt_ship_rqst_dt) doShipSchdRslt_ship_rqst_dt_LC(info);
		else if (lc == ShipSchdRslt_ship_rqst_hm) doShipSchdRslt_ship_rqst_hm_LC(info);
		else if (lc == ShipSchdRslt_pd_inst_dlv_dt) doShipSchdRslt_pd_inst_dlv_dt_LC(info);
		else if (lc == ShipSchdRslt_pd_inst_dlv_hm) doShipSchdRslt_pd_inst_dlv_hm_LC(info);
		else if (lc == ShipSchdRslt_dlv_inst_dt) doShipSchdRslt_dlv_inst_dt_LC(info);
		else if (lc == ShipSchdRslt_dlv_inst_hm) doShipSchdRslt_dlv_inst_hm_LC(info);
		else if (lc == ShipSchdRslt_ship_schd_dt) doShipSchdRslt_ship_schd_dt_LC(info);
		else if (lc == ShipSchdRslt_ship_schd_hm) doShipSchdRslt_ship_schd_hm_LC(info);
		else if (lc == ShipSchdRslt_dlv_schd_dt) doShipSchdRslt_dlv_schd_dt_LC(info);
		else if (lc == ShipSchdRslt_dlv_schd_hm) doShipSchdRslt_dlv_schd_hm_LC(info);
		else if (lc == ShipSchdRslt_trd_unit_cd) doShipSchdRslt_trd_unit_cd_LC(info);
		else if (lc == ShipSchdRslt_trd_unit_nm) doShipSchdRslt_trd_unit_nm_LC(info);
		else if (lc == ShipSchdRslt_trd_unit_dec_place) doShipSchdRslt_trd_unit_dec_place_LC(info);
		else if (lc == ShipSchdRslt_base_unit_cd) doShipSchdRslt_base_unit_cd_LC(info);
		else if (lc == ShipSchdRslt_base_unit_nm) doShipSchdRslt_base_unit_nm_LC(info);
		else if (lc == ShipSchdRslt_base_unit_dec_place) doShipSchdRslt_base_unit_dec_place_LC(info);
		else if (lc == ShipSchdRslt_ship_pr_upd_cntr) doShipSchdRslt_ship_pr_upd_cntr_LC(info);
		else if (lc == columnShipAllocRslt_slo_no) doShipAllocRslt_slo_no_LC(info);
		else if (lc == columnShipAllocRslt_slo_d_no) doShipAllocRslt_slo_d_no_LC(info);
		else if (lc == columnShipAllocRslt_xfr_schd_no) doShipAllocRslt_xfr_schd_no_LC(info);
		else if (lc == columnShipAllocRslt_ship_schd_no) doShipAllocRslt_ship_schd_no_LC(info);
		else if (lc == columnShipAllocRslt_ship_alloc_sts_no) doShipAllocRslt_ship_alloc_sts_no_LC(info);
		else if (lc == columnShipAllocRslt_cst_cd) doShipAllocRslt_cst_cd_LC(info);
		else if (lc == columnShipAllocRslt_cst_nm) doShipAllocRslt_cst_nm_LC(info);
		else if (lc == columnShipAllocRslt_ship_loc_cd) doShipAllocRslt_ship_loc_cd_LC(info);
		else if (lc == columnShipAllocRslt_ship_loc_nm) doShipAllocRslt_ship_loc_nm_LC(info);
		else if (lc == columnShipAllocRslt_wg_cd) doShipAllocRslt_wg_cd_LC(info);
		else if (lc == columnShipAllocRslt_wg_nm) doShipAllocRslt_wg_nm_LC(info);
		else if (lc == columnShipAllocRslt_site_cd) doShipAllocRslt_site_cd_LC(info);
		else if (lc == columnShipAllocRslt_site_nm) doShipAllocRslt_site_nm_LC(info);
		else if (lc == columnShipAllocRslt_ship_fr_lg_grp_cd) doShipAllocRslt_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnShipAllocRslt_ship_fr_lg_grp_nm) doShipAllocRslt_ship_fr_lg_grp_nm_LC(info);
		else if (lc == columnShipAllocRslt_alloc_grp_cd) doShipAllocRslt_alloc_grp_cd_LC(info);
		else if (lc == columnShipAllocRslt_alloc_grp_nm) doShipAllocRslt_alloc_grp_nm_LC(info);
		else if (lc == columnShipAllocRslt_stk_id_typ) doShipAllocRslt_stk_id_typ_LC(info);
		else if (lc == columnShipAllocRslt_stk_id_typ_nm) doShipAllocRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnShipAllocRslt_stk_bp_cd) doShipAllocRslt_stk_bp_cd_LC(info);
		else if (lc == columnShipAllocRslt_stk_bp_nm) doShipAllocRslt_stk_bp_nm_LC(info);
		else if (lc == columnShipAllocRslt_pack_unit_cd) doShipAllocRslt_pack_unit_cd_LC(info);
		else if (lc == columnShipAllocRslt_pack_unit_nm) doShipAllocRslt_pack_unit_nm_LC(info);
		else if (lc == columnShipAllocRslt_pack_unit_dec_place) doShipAllocRslt_pack_unit_dec_place_LC(info);
		else if (lc == columnShipAllocRslt_pack_unit_conv_base_qty) doShipAllocRslt_pack_unit_conv_base_qty_LC(info);
		else if (lc == columnShipAllocRslt_pack_unit_conv_qty) doShipAllocRslt_pack_unit_conv_qty_LC(info);
		else if (lc == columnShipAllocRslt_base_unit_cd) doShipAllocRslt_base_unit_cd_LC(info);
		else if (lc == columnShipAllocRslt_base_unit_nm) doShipAllocRslt_base_unit_nm_LC(info);
		else if (lc == columnShipAllocRslt_base_unit_dec_place) doShipAllocRslt_base_unit_dec_place_LC(info);
		else if (lc == columnShipAllocRslt_base_unit_rnd_typ) doShipAllocRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnShipAllocRslt_dlv_rqst_dt) doShipAllocRslt_dlv_rqst_dt_LC(info);
		else if (lc == columnShipAllocRslt_dlv_rqst_hm) doShipAllocRslt_dlv_rqst_hm_LC(info);
		else if (lc == columnShipAllocRslt_ship_rqst_dt) doShipAllocRslt_ship_rqst_dt_LC(info);
		else if (lc == columnShipAllocRslt_ship_rqst_hm) doShipAllocRslt_ship_rqst_hm_LC(info);
		else if (lc == columnShipAllocRslt_pd_inst_dlv_dt) doShipAllocRslt_pd_inst_dlv_dt_LC(info);
		else if (lc == columnShipAllocRslt_pd_inst_dlv_hm) doShipAllocRslt_pd_inst_dlv_hm_LC(info);
		else if (lc == columnShipAllocRslt_dlv_inst_dt) doShipAllocRslt_dlv_inst_dt_LC(info);
		else if (lc == columnShipAllocRslt_dlv_inst_hm) doShipAllocRslt_dlv_inst_hm_LC(info);
		else if (lc == columnShipAllocRslt_ship_schd_dt) doShipAllocRslt_ship_schd_dt_LC(info);
		else if (lc == columnShipAllocRslt_ship_schd_hm) doShipAllocRslt_ship_schd_hm_LC(info);
		else if (lc == columnShipAllocRslt_dlv_schd_dt) doShipAllocRslt_dlv_schd_dt_LC(info);
		else if (lc == columnShipAllocRslt_dlv_schd_hm) doShipAllocRslt_dlv_schd_hm_LC(info);
		else if (lc == columnShipAllocRslt_rqst_usr_cd) doShipAllocRslt_rqst_usr_cd_LC(info);
		else if (lc == columnShipAllocRslt_rqst_usr_nm) doShipAllocRslt_rqst_usr_nm_LC(info);
		else if (lc == columnShipAllocRslt_rqst_dpt_cd) doShipAllocRslt_rqst_dpt_cd_LC(info);
		else if (lc == columnShipAllocRslt_rqst_dpt_nm) doShipAllocRslt_rqst_dpt_nm_LC(info);
		else if (lc == columnShipAllocRslt_ship_to_id_typ) doShipAllocRslt_ship_to_id_typ_LC(info);
		else if (lc == columnShipAllocRslt_ship_to_id_typ_nm) doShipAllocRslt_ship_to_id_typ_nm_LC(info);
		else if (lc == columnShipAllocRslt_ship_to_id_cd) doShipAllocRslt_ship_to_id_cd_LC(info);
		else if (lc == columnShipAllocRslt_ship_to_id_nm) doShipAllocRslt_ship_to_id_nm_LC(info);
		else if (lc == columnShipAllocRslt_alloc_scope_typ) doShipAllocRslt_alloc_scope_typ_LC(info);
		else if (lc == columnShipAllocRslt_alloc_scope_typ_nm) doShipAllocRslt_alloc_scope_typ_nm_LC(info);
		else if (lc == columnShipAllocRslt_ship_pr_no) doShipAllocRslt_ship_pr_no_LC(info);
		else if (lc == columnShipAllocRslt_ship_pr_upd_cntr) doShipAllocRslt_ship_pr_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[rqst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_rqst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_split_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_split_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_split_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_scope_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_scope_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_scope_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_rqst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_rqst_hm_LC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[dlv_inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_hm_LC(MCEventInfo info){
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
	 * [ShipSchdRslt]パネルの[ship_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_pr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_alloc_sts_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_alloc_sts_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pack_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pack_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_rqst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_rqst_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_rqst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_rqst_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pd_inst_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[pd_inst_dlv_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_pd_inst_dlv_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_inst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_inst_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[dlv_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_dlv_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[rqst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_rqst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_scope_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[alloc_scope_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_alloc_scope_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipAllocRslt]パネルの[ship_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipAllocRslt_ship_pr_upd_cntr_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL0120.Srch01")) {
			return new MS_MSBEL0120_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL0120.Upd01")) {
			return new MS_MSBEL0120_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0120_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0120_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL0120_Srch01Bridge() {
			p_MS_MSBEL0120_Srch01 = new MCParam(PDef.MS_MSBEL0120_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0120_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0120.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.class));

			p_MS_MSBEL0120_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0120_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0120_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0120_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0120_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0120.CndR up0() {
			return (mcframe.clientMSBE.MSBEP0120.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR down0() {
			return (mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0120_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.create());
			p_MS_MSBEL0120_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0120_Srch01;
		}

		protected void show() {
			setShipSchdRsltR((mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR)p_MS_MSBEL0120_Srch01.getContainerParam().getDownBlock(0));
			setShipAllocRsltL((MCList<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR>)p_MS_MSBEL0120_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getShipSchdRsltR().clear();
			getShipAllocRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getShipSchdRsltR());
			result.add(getShipAllocRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL0120_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0120_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0120_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL0120_Upd01Bridge() {
			p_MS_MSBEL0120_Upd01 = new MCParam(PDef.MS_MSBEL0120_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0120_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR.class));
			// Down

			p_MS_MSBEL0120_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0120_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0120_Upd01.addUpBlock(getShipSchdRsltR());
			p_MS_MSBEL0120_Upd01.addUpBlock(getShipAllocRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0120_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0120_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR up0() {
			return (mcframe.clientMSBE.MSBEP0120.ShipSchdRsltR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP0120.ShipAllocRsltR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL0120_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getShipSchdRsltR());
			result.add(getShipAllocRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}