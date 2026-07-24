package mcframe.clientMSBE.MSBEP0110;

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
import mcframe.clientMSBE.MSBEP0110.MSBEP_StkListPrnt_MC.MS_MSBEL0110_Srch01Caller;
import mcframe.clientMSBE.MSBEP0110.MSBEP_StkListPrnt_MC.MS_MSBEL0110_Prnt01Caller;

/**
 * 画面"MSBEP_StkListPrnt"パネルクラスです。<p>
 *
 * 現品票を発行します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_StkListPrnt_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP0110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0110.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_alt_nm1 = null;
	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_alt_nm2 = null;
	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_alt_nm3 = null;
	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_alt_nm4 = null;
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	/**
	 * Number of print sheets 印刷枚数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prnt_all_qty = null;
	/**
	 * Print fraction 端数印刷.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rmndr_prnt_flg = null;
	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_lst_prnt_flg = null;
	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_cd = null;
	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_nm = null;
	/**
	 * Packaged item unit cd. 梱包入数単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_cd_per_pckg_unit = null;
	/**
	 * Packaged item unit name 梱包入数単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_nm_per_pckg_unit = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty_per_pckg_unit_p_PPanel;
	public MCColumnConfig columnDtl_qty_per_pckg_unit;// [Dtl]の[qty_per_pckg_unit_p.qty]を[columnDtl_qty_per_pckg_unit]としてエイリアス定義。
	/**
	 * Fraction unit cd. 端数単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rmndr_unit_cd = null;
	/**
	 * Fraction name 端数名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rmndr_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_rmndr_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_rmndr_unit_qty;// [Dtl]の[rmndr_unit_qty_p.qty]を[columnDtl_rmndr_unit_qty]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_pack_unit_qty;// [Dtl]の[pack_unit_qty_p.qty]を[columnDtl_pack_unit_qty]としてエイリアス定義。
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
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	/**
	 * Delivery order cd. 納入指示単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_inst_unit_cd = null;
	/**
	 * Delivery order unit name 納入指示単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_inst_unit_nm = null;
	/**
	 * Delivery order unit number of decimal places 納入指示単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_inst_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_dlv_inst_qty_p_PPanel;
	public MCColumnConfig columnDtl_dlv_inst_qty;// [Dtl]の[dlv_inst_qty_p.qty]を[columnDtl_dlv_inst_qty]としてエイリアス定義。
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_grp_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_p_PPanel;
	public MCColumnConfig columnDtl_sno1_null_flg;// [Dtl]の[sno_p.sno1_null_flg]を[columnDtl_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2_null_flg;// [Dtl]の[sno_p.sno2_null_flg]を[columnDtl_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3_null_flg;// [Dtl]の[sno_p.sno3_null_flg]を[columnDtl_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4_null_flg;// [Dtl]の[sno_p.sno4_null_flg]を[columnDtl_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_lot_no = null;
	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unreg_lmt_flg = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnDtl_vld_dt = null;
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lmt_dt = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ_nm = null;
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
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_xfr_typ = null;
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_xfr_typ_nm = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_insp_typ_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ = null;
	/**
	 * Inventory identification name 在庫識別名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ_nm = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_bp_nm = null;
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_no_typ = null;
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_no_typ_nm = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_no = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_arrv_bp_nm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_nm = null;
	/**
	 * Customer alias name 1 得意先別名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_alt_nm1 = null;
	/**
	 * Customer alias name 2 得意先別名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_alt_nm2 = null;
	/**
	 * Customer alias name 3 得意先別名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_alt_nm3 = null;
	/**
	 * Customer alias name 4 得意先別名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_alt_nm4 = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_nm = null;
	/**
	 * Delivery destination alias name 1 納品先別名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_alt_nm1 = null;
	/**
	 * Delivery destination alias name 2 納品先別名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_alt_nm2 = null;
	/**
	 * Delivery destination alias name 3 納品先別名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_alt_nm3 = null;
	/**
	 * Delivery destination alias name 4 納品先別名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_alt_nm4 = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_d_no = null;
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_act_no = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_no = null;
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_d_no = null;
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_alloc_sts_no = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_no = null;
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_d_no = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_no = null;
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_schd_no = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_act_no = null;
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_act_no = null;
	/**
	 * By-product 副産品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_byprod_flg = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prnt_lcl_cd = null;
	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_lst_form_cd = null;
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_cd = null;
	/**
	 * Company name 会社名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_nm = null;
	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_dlv_inst_no = null;
	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_dlv_inst_d_no = null;
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_rqst_dt = null;
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_rqst_tm = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * Remarks 1 (Receipt result) 備考１(入荷実績).<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_act_sub_char1 = null;
	/**
	 * Remarks 2 (Receipt result) 備考２(入荷実績).<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_act_sub_char2 = null;
	/**
	 * Remarks 3 (Receipt result) 備考３(入荷実績).<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_act_sub_char3 = null;
	/**
	 * Remarks 1 (Shipping result details) 備考１(出荷実績明細).<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_d_sub_char1 = null;
	/**
	 * Remarks 2 (Shipping result details) 備考２(出荷実績明細).<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_d_sub_char2 = null;
	/**
	 * Remarks 3 (Shipping result details) 備考３(出荷実績明細).<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_d_sub_char3 = null;
	/**
	 * Remarks 1 (Shipping allocation status) 備考１(出荷引当状況).<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_alloc_sts_sub_char1 = null;
	/**
	 * Remarks 2 (Shipping allocation status) 備考２(出荷引当状況).<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_alloc_sts_sub_char2 = null;
	/**
	 * Remarks 3 (Shipping allocation status) 備考３(出荷引当状況).<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_alloc_sts_sub_char3 = null;
	/**
	 * Remarks 1 (Output schedule) 備考１(出来高予定).<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_schd_sub_char1 = null;
	/**
	 * Remarks 2 (Output schedule) 備考２(出来高予定).<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_schd_sub_char2 = null;
	/**
	 * Remarks 3 (Output schedule) 備考３(出来高予定).<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_schd_sub_char3 = null;
	/**
	 * Remarks 1 (Output result) 備考１(出来高実績).<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_act_sub_char1 = null;
	/**
	 * Remarks 2 (Output result) 備考２(出来高実績).<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_act_sub_char2 = null;
	/**
	 * Remarks 3 (Output result) 備考３(出来高実績).<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_act_sub_char3 = null;
	/**
	 * Remarks 1 (Current inventory) 備考１(現状在庫).<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_sub_char1 = null;
	/**
	 * Remarks 2 (Current inventory) 備考２(現状在庫).<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_sub_char2 = null;
	/**
	 * Remarks 3 (Current inventory) 備考３(現状在庫).<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_sub_char3 = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_cd = null;
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_nm = null;
	/**
	 * Delivery destination identification alias name 1 納品先識別別名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_alt_nm1 = null;
	/**
	 * Delivery destination identification alias name 2 納品先識別別名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_alt_nm2 = null;
	/**
	 * Delivery destination identification alias name 3 納品先識別別名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_alt_nm3 = null;
	/**
	 * Delivery destination identification alias name 4 納品先識別別名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_alt_nm4 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_rtn_sts_typ_nm;// [Dtl]の[rts_msg_p.rtn_sts_typ_nm]を[columnDtl_rtn_sts_typ_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg_id;// [Dtl]の[rts_msg_p.msg_id]を[columnDtl_msg_id]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg;// [Dtl]の[rts_msg_p.msg]を[columnDtl_msg]としてエイリアス定義。
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_d_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_d_no = null;
	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_dpt_cd = null;
	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_dpt_nm = null;
	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_usr_cd = null;
	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_usr_nm = null;
	/**
	 * Receiving dept. cd. 受入部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acpt_dpt_cd = null;
	/**
	 * Receiving dept. name 受入部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acpt_dpt_nm = null;
	/**
	 * Receipt PIC cd. 受入担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acpt_usr_cd = null;
	/**
	 * Receipt PIC name 受入担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acpt_usr_nm = null;
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_rmrks = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Identification tag 現品票.<p>
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
	/** [PRNT_ARR]モードを表す定数 */
	public static final String PRNT_ARR = "PRNT_ARR";
	/** [FIX_ARR]モードを表す定数 */
	public static final String FIX_ARR = "FIX_ARR";
	/** [PRNT_SHIP]モードを表す定数 */
	public static final String PRNT_SHIP = "PRNT_SHIP";
	/** [FIX_SHIP]モードを表す定数 */
	public static final String FIX_SHIP = "FIX_SHIP";
	/** [PRNT_MFG]モードを表す定数 */
	public static final String PRNT_MFG = "PRNT_MFG";
	/** [FIX_MFG]モードを表す定数 */
	public static final String FIX_MFG = "FIX_MFG";
	/** [PRNT_STK]モードを表す定数 */
	public static final String PRNT_STK = "PRNT_STK";
	/** [FIX_STK]モードを表す定数 */
	public static final String FIX_STK = "FIX_STK";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{PRNT_ARR, FIX_ARR, PRNT_SHIP, FIX_SHIP, PRNT_MFG, FIX_MFG, PRNT_STK, FIX_STK};
	
	/** [MS_MSBEL0110_Srch01]のCallerの作成 */
	protected MSBEP_StkListPrnt_MC.MS_MSBEL0110_Srch01Caller createMS_MSBEL0110_Srch01() {
		MSBEP_StkListPrnt_MC.MS_MSBEL0110_Srch01Caller<MSBEP_StkListPrnt, MS_MSBEL0110_Srch01Bridge>
		caller = ((MSBEP_StkListPrnt_MC)this).new MS_MSBEL0110_Srch01Caller<MSBEP_StkListPrnt, MS_MSBEL0110_Srch01Bridge>(
					(MSBEP_StkListPrnt)this, new MS_MSBEL0110_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL0110_Srch01]の呼び出し */
	protected void callMS_MSBEL0110_Srch01() {
		MCCaller caller = createMS_MSBEL0110_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL0110_Prnt01]のCallerの作成 */
	protected MSBEP_StkListPrnt_MC.MS_MSBEL0110_Prnt01Caller createMS_MSBEL0110_Prnt01() {
		MSBEP_StkListPrnt_MC.MS_MSBEL0110_Prnt01Caller<MSBEP_StkListPrnt, MS_MSBEL0110_Prnt01Bridge>
		caller = ((MSBEP_StkListPrnt_MC)this).new MS_MSBEL0110_Prnt01Caller<MSBEP_StkListPrnt, MS_MSBEL0110_Prnt01Bridge>(
					(MSBEP_StkListPrnt)this, new MS_MSBEL0110_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL0110_Prnt01]の呼び出し */
	protected void callMS_MSBEL0110_Prnt01() {
		MCCaller caller = createMS_MSBEL0110_Prnt01();
		caller.exec();
	}
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0110.DtlR> aDtlL;

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP0110.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0110.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP0110.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP0110.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0110.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0110.DtlR.class);
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
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkListPrnt_MC_A() {
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_StkListPrnt_MC_A(String name) {
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_StkListPrnt_MC.jbCreateDtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.jbCreateBtn((MSBEP_StkListPrnt)this);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_StkListPrnt p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP0110.DtlR.$itm_p);
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
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP0110.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_qty_per_pckg_unit_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0110.DtlR.$qty_per_pckg_unit_p);
		p.Dtl_qty_per_pckg_unit_p_PPanel.setName("Dtl.qty_per_pckg_unit_p");
		p.columnDtl_qty_per_pckg_unit = p.Dtl_qty_per_pckg_unit_p_PPanel.columnQty_qty;
		p.columnDtl_qty_per_pckg_unit.addAliasName("Dtl.qty_per_pckg_unit", p);
		p.Dtl_rmndr_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0110.DtlR.$rmndr_unit_qty_p);
		p.Dtl_rmndr_unit_qty_p_PPanel.setName("Dtl.rmndr_unit_qty_p");
		p.columnDtl_rmndr_unit_qty = p.Dtl_rmndr_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_rmndr_unit_qty.addAliasName("Dtl.rmndr_unit_qty", p);
		p.Dtl_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0110.DtlR.$pack_unit_qty_p);
		p.Dtl_pack_unit_qty_p_PPanel.setName("Dtl.pack_unit_qty_p");
		p.columnDtl_pack_unit_qty = p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_pack_unit_qty.addAliasName("Dtl.pack_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0110.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_dlv_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0110.DtlR.$dlv_inst_qty_p);
		p.Dtl_dlv_inst_qty_p_PPanel.setName("Dtl.dlv_inst_qty_p");
		p.columnDtl_dlv_inst_qty = p.Dtl_dlv_inst_qty_p_PPanel.columnQty_qty;
		p.columnDtl_dlv_inst_qty.addAliasName("Dtl.dlv_inst_qty", p);
		p.Dtl_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP0110.DtlR.$sno_p);
		p.Dtl_sno_p_PPanel.setName("Dtl.sno_p");
		p.columnDtl_sno1_null_flg = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnDtl_sno1_null_flg.addAliasName("Dtl.sno1_null_flg", p);
		p.columnDtl_sno1 = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2_null_flg = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnDtl_sno2_null_flg.addAliasName("Dtl.sno2_null_flg", p);
		p.columnDtl_sno2 = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3_null_flg = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnDtl_sno3_null_flg.addAliasName("Dtl.sno3_null_flg", p);
		p.columnDtl_sno3 = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4_null_flg = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnDtl_sno4_null_flg.addAliasName("Dtl.sno4_null_flg", p);
		p.columnDtl_sno4 = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_wrk_no = p.Dtl_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP0110.DtlR.$rts_msg_p);
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
	protected static void jbCreateBtn(MSBEP_StkListPrnt p) {
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

	
	/** [Dtl_sublot_no_ListPutter]の定義 */
	private MCListPutter Dtl_sublot_no_p = null;

	/**
	 * [Dtl_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sublot_no_ListPutter() {
		if (Dtl_sublot_no_p == null) {
			Dtl_sublot_no_p = createDtl_sublot_no_ListPutter(columnDtl_sublot_no, "sublot_no");

		}
		return Dtl_sublot_no_p;
	}
	
	
	/** [Dtl_pckg_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_pckg_unit_cd_p = null;

	/**
	 * [Dtl_pckg_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pckg_unit_cd_ListPutter() {
		if (Dtl_pckg_unit_cd_p == null) {
			Dtl_pckg_unit_cd_p = createDtl_pckg_unit_cd_ListPutter(columnDtl_pckg_unit_cd, "pckg_unit_cd");

		}
		return Dtl_pckg_unit_cd_p;
	}
	
	
	/** [Dtl_unit_cd_per_pckg_unit_ListPutter]の定義 */
	private MCListPutter Dtl_unit_cd_per_pckg_unit_p = null;

	/**
	 * [Dtl_unit_cd_per_pckg_unit_ListPutter]の取得
	 */
	protected MCListPutter getDtl_unit_cd_per_pckg_unit_ListPutter() {
		if (Dtl_unit_cd_per_pckg_unit_p == null) {
			Dtl_unit_cd_per_pckg_unit_p = createDtl_unit_cd_per_pckg_unit_ListPutter(columnDtl_unit_cd_per_pckg_unit, "unit_cd_per_pckg_unit");

		}
		return Dtl_unit_cd_per_pckg_unit_p;
	}
	
	
	/** [Dtl_rmndr_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rmndr_unit_cd_p = null;

	/**
	 * [Dtl_rmndr_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rmndr_unit_cd_ListPutter() {
		if (Dtl_rmndr_unit_cd_p == null) {
			Dtl_rmndr_unit_cd_p = createDtl_rmndr_unit_cd_ListPutter(columnDtl_rmndr_unit_cd, "rmndr_unit_cd");

		}
		return Dtl_rmndr_unit_cd_p;
	}
	
	
	/** [Dtl_pack_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_pack_unit_cd_p = null;

	/**
	 * [Dtl_pack_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pack_unit_cd_ListPutter() {
		if (Dtl_pack_unit_cd_p == null) {
			Dtl_pack_unit_cd_p = createDtl_pack_unit_cd_ListPutter(columnDtl_pack_unit_cd, "pack_unit_cd");

		}
		return Dtl_pack_unit_cd_p;
	}
	
	
	/** [Dtl_base_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_base_unit_cd_p = null;

	/**
	 * [Dtl_base_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_base_unit_cd_ListPutter() {
		if (Dtl_base_unit_cd_p == null) {
			Dtl_base_unit_cd_p = createDtl_base_unit_cd_ListPutter(columnDtl_base_unit_cd, "base_unit_cd");

		}
		return Dtl_base_unit_cd_p;
	}
	
	
	/** [Dtl_dlv_inst_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dlv_inst_unit_cd_p = null;

	/**
	 * [Dtl_dlv_inst_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dlv_inst_unit_cd_ListPutter() {
		if (Dtl_dlv_inst_unit_cd_p == null) {
			Dtl_dlv_inst_unit_cd_p = createDtl_dlv_inst_unit_cd_ListPutter(columnDtl_dlv_inst_unit_cd, "dlv_inst_unit_cd");

		}
		return Dtl_dlv_inst_unit_cd_p;
	}
	
	
	/** [Dtl_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_loc_cd_p = null;

	/**
	 * [Dtl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_loc_cd_ListPutter() {
		if (Dtl_loc_cd_p == null) {
			Dtl_loc_cd_p = createDtl_loc_cd_ListPutter(columnDtl_loc_cd, "loc_cd");

		}
		return Dtl_loc_cd_p;
	}
	
	
	/** [Dtl_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Dtl_str_ln_cd_p = null;

	/**
	 * [Dtl_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_str_ln_cd_ListPutter() {
		if (Dtl_str_ln_cd_p == null) {
			Dtl_str_ln_cd_p = createDtl_str_ln_cd_ListPutter(columnDtl_str_ln_cd, "str_ln_cd");

		}
		return Dtl_str_ln_cd_p;
	}
	
	
	/** [Dtl_site_cd_ListPutter]の定義 */
	private MCListPutter Dtl_site_cd_p = null;

	/**
	 * [Dtl_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_site_cd_ListPutter() {
		if (Dtl_site_cd_p == null) {
			Dtl_site_cd_p = createDtl_site_cd_ListPutter(columnDtl_site_cd, "site_cd");

		}
		return Dtl_site_cd_p;
	}
	
	
	/** [Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wg_cd_p = null;

	/**
	 * [Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_cd_ListPutter() {
		if (Dtl_wg_cd_p == null) {
			Dtl_wg_cd_p = createDtl_wg_cd_ListPutter(columnDtl_wg_cd, "wg_cd");

		}
		return Dtl_wg_cd_p;
	}
	
	
	/** [Dtl_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_loc_grp_cd_p = null;

	/**
	 * [Dtl_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_loc_grp_cd_ListPutter() {
		if (Dtl_loc_grp_cd_p == null) {
			Dtl_loc_grp_cd_p = createDtl_loc_grp_cd_ListPutter(columnDtl_loc_grp_cd, "loc_grp_cd");

		}
		return Dtl_loc_grp_cd_p;
	}
	
	
	/** [Dtl_quality_typ_ListPutter]の定義 */
	private MCListPutter Dtl_quality_typ_p = null;

	/**
	 * [Dtl_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_quality_typ_ListPutter() {
		if (Dtl_quality_typ_p == null) {
			Dtl_quality_typ_p = createDtl_quality_typ_ListPutter(columnDtl_quality_typ, "quality_typ");

		}
		return Dtl_quality_typ_p;
	}
	
	
	/** [Dtl_gd_cd_ListPutter]の定義 */
	private MCListPutter Dtl_gd_cd_p = null;

	/**
	 * [Dtl_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_gd_cd_ListPutter() {
		if (Dtl_gd_cd_p == null) {
			Dtl_gd_cd_p = createDtl_gd_cd_ListPutter(columnDtl_gd_cd, "gd_cd");

		}
		return Dtl_gd_cd_p;
	}
	
	
	/** [Dtl_in_xfr_typ_ListPutter]の定義 */
	private MCListPutter Dtl_in_xfr_typ_p = null;

	/**
	 * [Dtl_in_xfr_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_in_xfr_typ_ListPutter() {
		if (Dtl_in_xfr_typ_p == null) {
			Dtl_in_xfr_typ_p = createDtl_in_xfr_typ_ListPutter(columnDtl_in_xfr_typ, "in_xfr_typ");

		}
		return Dtl_in_xfr_typ_p;
	}
	
	
	/** [Dtl_stk_insp_typ_ListPutter]の定義 */
	private MCListPutter Dtl_stk_insp_typ_p = null;

	/**
	 * [Dtl_stk_insp_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_stk_insp_typ_ListPutter() {
		if (Dtl_stk_insp_typ_p == null) {
			Dtl_stk_insp_typ_p = createDtl_stk_insp_typ_ListPutter(columnDtl_stk_insp_typ, "stk_insp_typ");

		}
		return Dtl_stk_insp_typ_p;
	}
	
	
	/** [Dtl_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl_stk_id_typ_p = null;

	/**
	 * [Dtl_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_stk_id_typ_ListPutter() {
		if (Dtl_stk_id_typ_p == null) {
			Dtl_stk_id_typ_p = createDtl_stk_id_typ_ListPutter(columnDtl_stk_id_typ, "stk_id_typ");

		}
		return Dtl_stk_id_typ_p;
	}
	
	
	/** [Dtl_stk_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_stk_bp_cd_p = null;

	/**
	 * [Dtl_stk_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_stk_bp_cd_ListPutter() {
		if (Dtl_stk_bp_cd_p == null) {
			Dtl_stk_bp_cd_p = createDtl_stk_bp_cd_ListPutter(columnDtl_stk_bp_cd, "stk_bp_cd");

		}
		return Dtl_stk_bp_cd_p;
	}
	
	
	/** [Dtl_fix_no_typ_ListPutter]の定義 */
	private MCListPutter Dtl_fix_no_typ_p = null;

	/**
	 * [Dtl_fix_no_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_fix_no_typ_ListPutter() {
		if (Dtl_fix_no_typ_p == null) {
			Dtl_fix_no_typ_p = createDtl_fix_no_typ_ListPutter(columnDtl_fix_no_typ, "fix_no_typ");

		}
		return Dtl_fix_no_typ_p;
	}
	
	
	/** [Dtl_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_stk_arrv_bp_cd_p = null;

	/**
	 * [Dtl_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_stk_arrv_bp_cd_ListPutter() {
		if (Dtl_stk_arrv_bp_cd_p == null) {
			Dtl_stk_arrv_bp_cd_p = createDtl_stk_arrv_bp_cd_ListPutter(columnDtl_stk_arrv_bp_cd, "stk_arrv_bp_cd");

		}
		return Dtl_stk_arrv_bp_cd_p;
	}
	
	
	/** [Dtl_cst_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cst_cd_p = null;

	/**
	 * [Dtl_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cst_cd_ListPutter() {
		if (Dtl_cst_cd_p == null) {
			Dtl_cst_cd_p = createDtl_cst_cd_ListPutter(columnDtl_cst_cd, "cst_cd");

		}
		return Dtl_cst_cd_p;
	}
	
	
	/** [Dtl_dlv_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dlv_cd_p = null;

	/**
	 * [Dtl_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dlv_cd_ListPutter() {
		if (Dtl_dlv_cd_p == null) {
			Dtl_dlv_cd_p = createDtl_dlv_cd_ListPutter(columnDtl_dlv_cd, "dlv_cd");

		}
		return Dtl_dlv_cd_p;
	}
	
	
	/** [Dtl_cst_po_no_ListPutter]の定義 */
	private MCListPutter Dtl_cst_po_no_p = null;

	/**
	 * [Dtl_cst_po_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cst_po_no_ListPutter() {
		if (Dtl_cst_po_no_p == null) {
			Dtl_cst_po_no_p = createDtl_cst_po_no_ListPutter(columnDtl_cst_po_no, "cst_po_no");

		}
		return Dtl_cst_po_no_p;
	}
	
	
	/** [Dtl_arr_act_no_ListPutter]の定義 */
	private MCListPutter Dtl_arr_act_no_p = null;

	/**
	 * [Dtl_arr_act_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_arr_act_no_ListPutter() {
		if (Dtl_arr_act_no_p == null) {
			Dtl_arr_act_no_p = createDtl_arr_act_no_ListPutter(columnDtl_arr_act_no, "arr_act_no");

		}
		return Dtl_arr_act_no_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkListPrnt create(){
		MSBEP_StkListPrnt p = new MSBEP_StkListPrnt();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkListPrnt create(String name){
		MSBEP_StkListPrnt p = new MSBEP_StkListPrnt(name);
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
		MSBEP_StkListPrnt_MC.jbfInitDtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.jbfInitBtn((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.jbInitDtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.jbInitBtn((MSBEP_StkListPrnt)this);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_StkListPrnt p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_itm_alt_nm1 = p.beansFactory.createTableColumn("Dtl.itm_alt_nm1", MCColumnType.TEXT);
		p.columnDtl_itm_alt_nm2 = p.beansFactory.createTableColumn("Dtl.itm_alt_nm2", MCColumnType.TEXT);
		p.columnDtl_itm_alt_nm3 = p.beansFactory.createTableColumn("Dtl.itm_alt_nm3", MCColumnType.TEXT);
		p.columnDtl_itm_alt_nm4 = p.beansFactory.createTableColumn("Dtl.itm_alt_nm4", MCColumnType.TEXT);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_lot_no = p.beansFactory.createTableColumn("Dtl.lot_no", MCColumnType.TEXT);
		p.columnDtl_sublot_no = p.beansFactory.createTableColumn("Dtl.sublot_no", MCColumnType.TEXT_COMBO);
		p.columnDtl_prnt_all_qty = p.beansFactory.createTableColumn("Dtl.prnt_all_qty", MCColumnType.NUMBER);
		p.columnDtl_rmndr_prnt_flg = p.beansFactory.createTableColumn("Dtl.rmndr_prnt_flg", MCColumnType.CHECK);
		p.columnDtl_stk_lst_prnt_flg = p.beansFactory.createTableColumn("Dtl.stk_lst_prnt_flg", MCColumnType.CHECK);
		p.columnDtl_pckg_unit_cd = p.beansFactory.createTableColumn("Dtl.pckg_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_pckg_unit_nm = p.beansFactory.createTableColumn("Dtl.pckg_unit_nm", MCColumnType.TEXT);
		p.columnDtl_unit_cd_per_pckg_unit = p.beansFactory.createTableColumn("Dtl.unit_cd_per_pckg_unit", MCColumnType.TEXT_COMBO);
		p.columnDtl_unit_nm_per_pckg_unit = p.beansFactory.createTableColumn("Dtl.unit_nm_per_pckg_unit", MCColumnType.TEXT);
		p.columnDtl_rmndr_unit_cd = p.beansFactory.createTableColumn("Dtl.rmndr_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_rmndr_unit_nm = p.beansFactory.createTableColumn("Dtl.rmndr_unit_nm", MCColumnType.TEXT);
		p.columnDtl_pack_unit_cd = p.beansFactory.createTableColumn("Dtl.pack_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_pack_unit_nm = p.beansFactory.createTableColumn("Dtl.pack_unit_nm", MCColumnType.TEXT);
		p.columnDtl_pack_unit_dec_place = p.beansFactory.createTableColumn("Dtl.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_dlv_inst_unit_cd = p.beansFactory.createTableColumn("Dtl.dlv_inst_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dlv_inst_unit_nm = p.beansFactory.createTableColumn("Dtl.dlv_inst_unit_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_inst_unit_dec_place = p.beansFactory.createTableColumn("Dtl.dlv_inst_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_str_ln_cd = p.beansFactory.createTableColumn("Dtl.str_ln_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_str_ln_nm = p.beansFactory.createTableColumn("Dtl.str_ln_nm", MCColumnType.TEXT);
		p.columnDtl_site_cd = p.beansFactory.createTableColumn("Dtl.site_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_site_nm = p.beansFactory.createTableColumn("Dtl.site_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_loc_grp_cd = p.beansFactory.createTableColumn("Dtl.loc_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_loc_grp_nm = p.beansFactory.createTableColumn("Dtl.loc_grp_nm", MCColumnType.TEXT);
		p.columnDtl_bp_lot_no = p.beansFactory.createTableColumn("Dtl.bp_lot_no", MCColumnType.TEXT);
		p.columnDtl_unreg_lmt_flg = p.beansFactory.createTableColumn("Dtl.unreg_lmt_flg", MCColumnType.CHECK);
		p.columnDtl_vld_dt = p.beansFactory.createTableColumn("Dtl.vld_dt", MCColumnType.DATE);
		p.columnDtl_lmt_dt = p.beansFactory.createTableColumn("Dtl.lmt_dt", MCColumnType.DATE);
		p.columnDtl_quality_typ = p.beansFactory.createTableColumn("Dtl.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_quality_typ_nm = p.beansFactory.createTableColumn("Dtl.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_in_xfr_typ = p.beansFactory.createTableColumn("Dtl.in_xfr_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_in_xfr_typ_nm = p.beansFactory.createTableColumn("Dtl.in_xfr_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_insp_typ = p.beansFactory.createTableColumn("Dtl.stk_insp_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_stk_insp_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_asst_typ = p.beansFactory.createTableColumn("Dtl.asst_typ", MCColumnType.TEXT);
		p.columnDtl_asst_typ_nm = p.beansFactory.createTableColumn("Dtl.asst_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_id_typ = p.beansFactory.createTableColumn("Dtl.stk_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_stk_id_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_bp_cd = p.beansFactory.createTableColumn("Dtl.stk_bp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_stk_bp_nm = p.beansFactory.createTableColumn("Dtl.stk_bp_nm", MCColumnType.TEXT);
		p.columnDtl_fix_no_typ = p.beansFactory.createTableColumn("Dtl.fix_no_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_fix_no_typ_nm = p.beansFactory.createTableColumn("Dtl.fix_no_typ_nm", MCColumnType.TEXT);
		p.columnDtl_fix_no = p.beansFactory.createTableColumn("Dtl.fix_no", MCColumnType.TEXT);
		p.columnDtl_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Dtl.stk_arrv_bp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Dtl.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnDtl_cst_cd = p.beansFactory.createTableColumn("Dtl.cst_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cst_nm = p.beansFactory.createTableColumn("Dtl.cst_nm", MCColumnType.TEXT);
		p.columnDtl_cst_alt_nm1 = p.beansFactory.createTableColumn("Dtl.cst_alt_nm1", MCColumnType.TEXT);
		p.columnDtl_cst_alt_nm2 = p.beansFactory.createTableColumn("Dtl.cst_alt_nm2", MCColumnType.TEXT);
		p.columnDtl_cst_alt_nm3 = p.beansFactory.createTableColumn("Dtl.cst_alt_nm3", MCColumnType.TEXT);
		p.columnDtl_cst_alt_nm4 = p.beansFactory.createTableColumn("Dtl.cst_alt_nm4", MCColumnType.TEXT);
		p.columnDtl_dlv_cd = p.beansFactory.createTableColumn("Dtl.dlv_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dlv_nm = p.beansFactory.createTableColumn("Dtl.dlv_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_alt_nm1 = p.beansFactory.createTableColumn("Dtl.dlv_alt_nm1", MCColumnType.TEXT);
		p.columnDtl_dlv_alt_nm2 = p.beansFactory.createTableColumn("Dtl.dlv_alt_nm2", MCColumnType.TEXT);
		p.columnDtl_dlv_alt_nm3 = p.beansFactory.createTableColumn("Dtl.dlv_alt_nm3", MCColumnType.TEXT);
		p.columnDtl_dlv_alt_nm4 = p.beansFactory.createTableColumn("Dtl.dlv_alt_nm4", MCColumnType.TEXT);
		p.columnDtl_cst_po_no = p.beansFactory.createTableColumn("Dtl.cst_po_no", MCColumnType.TEXT_COMBO);
		p.columnDtl_cst_po_d_no = p.beansFactory.createTableColumn("Dtl.cst_po_d_no", MCColumnType.TEXT);
		p.columnDtl_arr_act_no = p.beansFactory.createTableColumn("Dtl.arr_act_no", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_inst_no = p.beansFactory.createTableColumn("Dtl.ship_inst_no", MCColumnType.TEXT);
		p.columnDtl_ship_inst_d_no = p.beansFactory.createTableColumn("Dtl.ship_inst_d_no", MCColumnType.TEXT);
		p.columnDtl_ship_alloc_sts_no = p.beansFactory.createTableColumn("Dtl.ship_alloc_sts_no", MCColumnType.TEXT);
		p.columnDtl_ship_act_no = p.beansFactory.createTableColumn("Dtl.ship_act_no", MCColumnType.TEXT);
		p.columnDtl_ship_act_d_no = p.beansFactory.createTableColumn("Dtl.ship_act_d_no", MCColumnType.TEXT);
		p.columnDtl_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_yield_schd_no = p.beansFactory.createTableColumn("Dtl.yield_schd_no", MCColumnType.TEXT);
		p.columnDtl_mfg_act_no = p.beansFactory.createTableColumn("Dtl.mfg_act_no", MCColumnType.TEXT);
		p.columnDtl_yield_act_no = p.beansFactory.createTableColumn("Dtl.yield_act_no", MCColumnType.TEXT);
		p.columnDtl_byprod_flg = p.beansFactory.createTableColumn("Dtl.byprod_flg", MCColumnType.CHECK);
		p.columnDtl_prnt_lcl_cd = p.beansFactory.createTableColumn("Dtl.prnt_lcl_cd", MCColumnType.TEXT);
		p.columnDtl_stk_lst_form_cd = p.beansFactory.createTableColumn("Dtl.stk_lst_form_cd", MCColumnType.TEXT);
		p.columnDtl_co_cd = p.beansFactory.createTableColumn("Dtl.co_cd", MCColumnType.TEXT);
		p.columnDtl_co_nm = p.beansFactory.createTableColumn("Dtl.co_nm", MCColumnType.TEXT);
		p.columnDtl_cst_dlv_inst_no = p.beansFactory.createTableColumn("Dtl.cst_dlv_inst_no", MCColumnType.TEXT);
		p.columnDtl_cst_dlv_inst_d_no = p.beansFactory.createTableColumn("Dtl.cst_dlv_inst_d_no", MCColumnType.TEXT);
		p.columnDtl_dlv_rqst_dt = p.beansFactory.createTableColumn("Dtl.dlv_rqst_dt", MCColumnType.DATE);
		p.columnDtl_dlv_rqst_tm = p.beansFactory.createTableColumn("Dtl.dlv_rqst_tm", MCColumnType.DATE);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_arr_act_sub_char1 = p.beansFactory.createTableColumn("Dtl.arr_act_sub_char1", MCColumnType.TEXT);
		p.columnDtl_arr_act_sub_char2 = p.beansFactory.createTableColumn("Dtl.arr_act_sub_char2", MCColumnType.TEXT);
		p.columnDtl_arr_act_sub_char3 = p.beansFactory.createTableColumn("Dtl.arr_act_sub_char3", MCColumnType.TEXT);
		p.columnDtl_ship_act_d_sub_char1 = p.beansFactory.createTableColumn("Dtl.ship_act_d_sub_char1", MCColumnType.TEXT);
		p.columnDtl_ship_act_d_sub_char2 = p.beansFactory.createTableColumn("Dtl.ship_act_d_sub_char2", MCColumnType.TEXT);
		p.columnDtl_ship_act_d_sub_char3 = p.beansFactory.createTableColumn("Dtl.ship_act_d_sub_char3", MCColumnType.TEXT);
		p.columnDtl_ship_alloc_sts_sub_char1 = p.beansFactory.createTableColumn("Dtl.ship_alloc_sts_sub_char1", MCColumnType.TEXT);
		p.columnDtl_ship_alloc_sts_sub_char2 = p.beansFactory.createTableColumn("Dtl.ship_alloc_sts_sub_char2", MCColumnType.TEXT);
		p.columnDtl_ship_alloc_sts_sub_char3 = p.beansFactory.createTableColumn("Dtl.ship_alloc_sts_sub_char3", MCColumnType.TEXT);
		p.columnDtl_yield_schd_sub_char1 = p.beansFactory.createTableColumn("Dtl.yield_schd_sub_char1", MCColumnType.TEXT);
		p.columnDtl_yield_schd_sub_char2 = p.beansFactory.createTableColumn("Dtl.yield_schd_sub_char2", MCColumnType.TEXT);
		p.columnDtl_yield_schd_sub_char3 = p.beansFactory.createTableColumn("Dtl.yield_schd_sub_char3", MCColumnType.TEXT);
		p.columnDtl_yield_act_sub_char1 = p.beansFactory.createTableColumn("Dtl.yield_act_sub_char1", MCColumnType.TEXT);
		p.columnDtl_yield_act_sub_char2 = p.beansFactory.createTableColumn("Dtl.yield_act_sub_char2", MCColumnType.TEXT);
		p.columnDtl_yield_act_sub_char3 = p.beansFactory.createTableColumn("Dtl.yield_act_sub_char3", MCColumnType.TEXT);
		p.columnDtl_stk_sub_char1 = p.beansFactory.createTableColumn("Dtl.stk_sub_char1", MCColumnType.TEXT);
		p.columnDtl_stk_sub_char2 = p.beansFactory.createTableColumn("Dtl.stk_sub_char2", MCColumnType.TEXT);
		p.columnDtl_stk_sub_char3 = p.beansFactory.createTableColumn("Dtl.stk_sub_char3", MCColumnType.TEXT);
		p.columnDtl_dlv_id_cd = p.beansFactory.createTableColumn("Dtl.dlv_id_cd", MCColumnType.TEXT);
		p.columnDtl_dlv_id_nm = p.beansFactory.createTableColumn("Dtl.dlv_id_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_id_alt_nm1 = p.beansFactory.createTableColumn("Dtl.dlv_id_alt_nm1", MCColumnType.TEXT);
		p.columnDtl_dlv_id_alt_nm2 = p.beansFactory.createTableColumn("Dtl.dlv_id_alt_nm2", MCColumnType.TEXT);
		p.columnDtl_dlv_id_alt_nm3 = p.beansFactory.createTableColumn("Dtl.dlv_id_alt_nm3", MCColumnType.TEXT);
		p.columnDtl_dlv_id_alt_nm4 = p.beansFactory.createTableColumn("Dtl.dlv_id_alt_nm4", MCColumnType.TEXT);
		p.columnDtl_po_d_no = p.beansFactory.createTableColumn("Dtl.po_d_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_arr_dpt_cd = p.beansFactory.createTableColumn("Dtl.arr_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_arr_dpt_nm = p.beansFactory.createTableColumn("Dtl.arr_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_arr_usr_cd = p.beansFactory.createTableColumn("Dtl.arr_usr_cd", MCColumnType.TEXT);
		p.columnDtl_arr_usr_nm = p.beansFactory.createTableColumn("Dtl.arr_usr_nm", MCColumnType.TEXT);
		p.columnDtl_acpt_dpt_cd = p.beansFactory.createTableColumn("Dtl.acpt_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_acpt_dpt_nm = p.beansFactory.createTableColumn("Dtl.acpt_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_acpt_usr_cd = p.beansFactory.createTableColumn("Dtl.acpt_usr_cd", MCColumnType.TEXT);
		p.columnDtl_acpt_usr_nm = p.beansFactory.createTableColumn("Dtl.acpt_usr_nm", MCColumnType.TEXT);
		p.columnDtl_lot_rmrks = p.beansFactory.createTableColumn("Dtl.lot_rmrks", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_StkListPrnt p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_StkListPrnt p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_StkListPrnt p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_prnt);
		p.BtnPanel.setLastBeans(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
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
		MSBEP_StkListPrnt_MC.mcInitDtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.mcInitBtn((MSBEP_StkListPrnt)this);

		// [PRNT_ARR]ステータスのモードの設定
		MSBEP_StkListPrnt_MC.statusInitPRNT__ARR_Dtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.statusInitPRNT__ARR_Btn((MSBEP_StkListPrnt)this);

		// [FIX_ARR]ステータスのモードの設定
		MSBEP_StkListPrnt_MC.statusInitFIX__ARR_Dtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.statusInitFIX__ARR_Btn((MSBEP_StkListPrnt)this);

		// [PRNT_SHIP]ステータスのモードの設定
		MSBEP_StkListPrnt_MC.statusInitPRNT__SHIP_Dtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.statusInitPRNT__SHIP_Btn((MSBEP_StkListPrnt)this);

		// [FIX_SHIP]ステータスのモードの設定
		MSBEP_StkListPrnt_MC.statusInitFIX__SHIP_Dtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.statusInitFIX__SHIP_Btn((MSBEP_StkListPrnt)this);

		// [PRNT_MFG]ステータスのモードの設定
		MSBEP_StkListPrnt_MC.statusInitPRNT__MFG_Dtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.statusInitPRNT__MFG_Btn((MSBEP_StkListPrnt)this);

		// [FIX_MFG]ステータスのモードの設定
		MSBEP_StkListPrnt_MC.statusInitFIX__MFG_Dtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.statusInitFIX__MFG_Btn((MSBEP_StkListPrnt)this);

		// [PRNT_STK]ステータスのモードの設定
		MSBEP_StkListPrnt_MC.statusInitPRNT__STK_Dtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.statusInitPRNT__STK_Btn((MSBEP_StkListPrnt)this);

		// [FIX_STK]ステータスのモードの設定
		MSBEP_StkListPrnt_MC.statusInitFIX__STK_Dtl((MSBEP_StkListPrnt)this);
		MSBEP_StkListPrnt_MC.statusInitFIX__STK_Btn((MSBEP_StkListPrnt)this);

	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_StkListPrnt p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_itm_alt_nm1.addAllListener(p);
		p.columnDtl_itm_alt_nm1.setListListener(p);
		p.columnDtl_itm_alt_nm2.addAllListener(p);
		p.columnDtl_itm_alt_nm2.setListListener(p);
		p.columnDtl_itm_alt_nm3.addAllListener(p);
		p.columnDtl_itm_alt_nm3.setListListener(p);
		p.columnDtl_itm_alt_nm4.addAllListener(p);
		p.columnDtl_itm_alt_nm4.setListListener(p);
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_lot_no.addAllListener(p);
		p.columnDtl_lot_no.setListListener(p);
		p.columnDtl_sublot_no.addAllListener(p);
		p.columnDtl_sublot_no.setListListener(p);
		p.columnDtl_prnt_all_qty.addAllListener(p);
		p.columnDtl_prnt_all_qty.setListListener(p);
		p.columnDtl_rmndr_prnt_flg.addAllListener(p);
		p.columnDtl_stk_lst_prnt_flg.addAllListener(p);
		p.columnDtl_pckg_unit_cd.addAllListener(p);
		p.columnDtl_pckg_unit_cd.setListListener(p);
		p.columnDtl_pckg_unit_nm.addAllListener(p);
		p.columnDtl_pckg_unit_nm.setListListener(p);
		p.columnDtl_unit_cd_per_pckg_unit.addAllListener(p);
		p.columnDtl_unit_cd_per_pckg_unit.setListListener(p);
		p.columnDtl_unit_nm_per_pckg_unit.addAllListener(p);
		p.columnDtl_unit_nm_per_pckg_unit.setListListener(p);
		p.columnDtl_rmndr_unit_cd.addAllListener(p);
		p.columnDtl_rmndr_unit_cd.setListListener(p);
		p.columnDtl_rmndr_unit_nm.addAllListener(p);
		p.columnDtl_rmndr_unit_nm.setListListener(p);
		p.columnDtl_pack_unit_cd.addAllListener(p);
		p.columnDtl_pack_unit_cd.setListListener(p);
		p.columnDtl_pack_unit_nm.addAllListener(p);
		p.columnDtl_pack_unit_nm.setListListener(p);
		p.columnDtl_pack_unit_dec_place.addAllListener(p);
		p.columnDtl_pack_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_dlv_inst_unit_cd.addAllListener(p);
		p.columnDtl_dlv_inst_unit_cd.setListListener(p);
		p.columnDtl_dlv_inst_unit_nm.addAllListener(p);
		p.columnDtl_dlv_inst_unit_nm.setListListener(p);
		p.columnDtl_dlv_inst_unit_dec_place.addAllListener(p);
		p.columnDtl_dlv_inst_unit_dec_place.setListListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_str_ln_cd.addAllListener(p);
		p.columnDtl_str_ln_cd.setListListener(p);
		p.columnDtl_str_ln_nm.addAllListener(p);
		p.columnDtl_str_ln_nm.setListListener(p);
		p.columnDtl_site_cd.addAllListener(p);
		p.columnDtl_site_cd.setListListener(p);
		p.columnDtl_site_nm.addAllListener(p);
		p.columnDtl_site_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_loc_grp_cd.addAllListener(p);
		p.columnDtl_loc_grp_cd.setListListener(p);
		p.columnDtl_loc_grp_nm.addAllListener(p);
		p.columnDtl_loc_grp_nm.setListListener(p);
		p.columnDtl_bp_lot_no.addAllListener(p);
		p.columnDtl_bp_lot_no.setListListener(p);
		p.columnDtl_unreg_lmt_flg.addAllListener(p);
		p.columnDtl_vld_dt.addAllListener(p);
		p.columnDtl_vld_dt.setListListener(p);
		p.columnDtl_lmt_dt.addAllListener(p);
		p.columnDtl_lmt_dt.setListListener(p);
		p.columnDtl_quality_typ.addAllListener(p);
		p.columnDtl_quality_typ.setListListener(p);
		p.columnDtl_quality_typ_nm.addAllListener(p);
		p.columnDtl_quality_typ_nm.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_in_xfr_typ.addAllListener(p);
		p.columnDtl_in_xfr_typ.setListListener(p);
		p.columnDtl_in_xfr_typ_nm.addAllListener(p);
		p.columnDtl_in_xfr_typ_nm.setListListener(p);
		p.columnDtl_stk_insp_typ.addAllListener(p);
		p.columnDtl_stk_insp_typ.setListListener(p);
		p.columnDtl_stk_insp_typ_nm.addAllListener(p);
		p.columnDtl_stk_insp_typ_nm.setListListener(p);
		p.columnDtl_asst_typ.addAllListener(p);
		p.columnDtl_asst_typ.setListListener(p);
		p.columnDtl_asst_typ_nm.addAllListener(p);
		p.columnDtl_asst_typ_nm.setListListener(p);
		p.columnDtl_stk_id_typ.addAllListener(p);
		p.columnDtl_stk_id_typ.setListListener(p);
		p.columnDtl_stk_id_typ_nm.addAllListener(p);
		p.columnDtl_stk_id_typ_nm.setListListener(p);
		p.columnDtl_stk_bp_cd.addAllListener(p);
		p.columnDtl_stk_bp_cd.setListListener(p);
		p.columnDtl_stk_bp_nm.addAllListener(p);
		p.columnDtl_stk_bp_nm.setListListener(p);
		p.columnDtl_fix_no_typ.addAllListener(p);
		p.columnDtl_fix_no_typ.setListListener(p);
		p.columnDtl_fix_no_typ_nm.addAllListener(p);
		p.columnDtl_fix_no_typ_nm.setListListener(p);
		p.columnDtl_fix_no.addAllListener(p);
		p.columnDtl_fix_no.setListListener(p);
		p.columnDtl_stk_arrv_bp_cd.addAllListener(p);
		p.columnDtl_stk_arrv_bp_cd.setListListener(p);
		p.columnDtl_stk_arrv_bp_nm.addAllListener(p);
		p.columnDtl_stk_arrv_bp_nm.setListListener(p);
		p.columnDtl_cst_cd.addAllListener(p);
		p.columnDtl_cst_cd.setListListener(p);
		p.columnDtl_cst_nm.addAllListener(p);
		p.columnDtl_cst_nm.setListListener(p);
		p.columnDtl_cst_alt_nm1.addAllListener(p);
		p.columnDtl_cst_alt_nm1.setListListener(p);
		p.columnDtl_cst_alt_nm2.addAllListener(p);
		p.columnDtl_cst_alt_nm2.setListListener(p);
		p.columnDtl_cst_alt_nm3.addAllListener(p);
		p.columnDtl_cst_alt_nm3.setListListener(p);
		p.columnDtl_cst_alt_nm4.addAllListener(p);
		p.columnDtl_cst_alt_nm4.setListListener(p);
		p.columnDtl_dlv_cd.addAllListener(p);
		p.columnDtl_dlv_cd.setListListener(p);
		p.columnDtl_dlv_nm.addAllListener(p);
		p.columnDtl_dlv_nm.setListListener(p);
		p.columnDtl_dlv_alt_nm1.addAllListener(p);
		p.columnDtl_dlv_alt_nm1.setListListener(p);
		p.columnDtl_dlv_alt_nm2.addAllListener(p);
		p.columnDtl_dlv_alt_nm2.setListListener(p);
		p.columnDtl_dlv_alt_nm3.addAllListener(p);
		p.columnDtl_dlv_alt_nm3.setListListener(p);
		p.columnDtl_dlv_alt_nm4.addAllListener(p);
		p.columnDtl_dlv_alt_nm4.setListListener(p);
		p.columnDtl_cst_po_no.addAllListener(p);
		p.columnDtl_cst_po_no.setListListener(p);
		p.columnDtl_cst_po_d_no.addAllListener(p);
		p.columnDtl_cst_po_d_no.setListListener(p);
		p.columnDtl_arr_act_no.addAllListener(p);
		p.columnDtl_arr_act_no.setListListener(p);
		p.columnDtl_ship_inst_no.addAllListener(p);
		p.columnDtl_ship_inst_no.setListListener(p);
		p.columnDtl_ship_inst_d_no.addAllListener(p);
		p.columnDtl_ship_inst_d_no.setListListener(p);
		p.columnDtl_ship_alloc_sts_no.addAllListener(p);
		p.columnDtl_ship_alloc_sts_no.setListListener(p);
		p.columnDtl_ship_act_no.addAllListener(p);
		p.columnDtl_ship_act_no.setListListener(p);
		p.columnDtl_ship_act_d_no.addAllListener(p);
		p.columnDtl_ship_act_d_no.setListListener(p);
		p.columnDtl_mfg_inst_no.addAllListener(p);
		p.columnDtl_mfg_inst_no.setListListener(p);
		p.columnDtl_yield_schd_no.addAllListener(p);
		p.columnDtl_yield_schd_no.setListListener(p);
		p.columnDtl_mfg_act_no.addAllListener(p);
		p.columnDtl_mfg_act_no.setListListener(p);
		p.columnDtl_yield_act_no.addAllListener(p);
		p.columnDtl_yield_act_no.setListListener(p);
		p.columnDtl_byprod_flg.addAllListener(p);
		p.columnDtl_prnt_lcl_cd.addAllListener(p);
		p.columnDtl_prnt_lcl_cd.setListListener(p);
		p.columnDtl_stk_lst_form_cd.addAllListener(p);
		p.columnDtl_stk_lst_form_cd.setListListener(p);
		p.columnDtl_co_cd.addAllListener(p);
		p.columnDtl_co_cd.setListListener(p);
		p.columnDtl_co_nm.addAllListener(p);
		p.columnDtl_co_nm.setListListener(p);
		p.columnDtl_cst_dlv_inst_no.addAllListener(p);
		p.columnDtl_cst_dlv_inst_no.setListListener(p);
		p.columnDtl_cst_dlv_inst_d_no.addAllListener(p);
		p.columnDtl_cst_dlv_inst_d_no.setListListener(p);
		p.columnDtl_dlv_rqst_dt.addAllListener(p);
		p.columnDtl_dlv_rqst_dt.setListListener(p);
		p.columnDtl_dlv_rqst_tm.addAllListener(p);
		p.columnDtl_dlv_rqst_tm.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_arr_act_sub_char1.addAllListener(p);
		p.columnDtl_arr_act_sub_char1.setListListener(p);
		p.columnDtl_arr_act_sub_char2.addAllListener(p);
		p.columnDtl_arr_act_sub_char2.setListListener(p);
		p.columnDtl_arr_act_sub_char3.addAllListener(p);
		p.columnDtl_arr_act_sub_char3.setListListener(p);
		p.columnDtl_ship_act_d_sub_char1.addAllListener(p);
		p.columnDtl_ship_act_d_sub_char1.setListListener(p);
		p.columnDtl_ship_act_d_sub_char2.addAllListener(p);
		p.columnDtl_ship_act_d_sub_char2.setListListener(p);
		p.columnDtl_ship_act_d_sub_char3.addAllListener(p);
		p.columnDtl_ship_act_d_sub_char3.setListListener(p);
		p.columnDtl_ship_alloc_sts_sub_char1.addAllListener(p);
		p.columnDtl_ship_alloc_sts_sub_char1.setListListener(p);
		p.columnDtl_ship_alloc_sts_sub_char2.addAllListener(p);
		p.columnDtl_ship_alloc_sts_sub_char2.setListListener(p);
		p.columnDtl_ship_alloc_sts_sub_char3.addAllListener(p);
		p.columnDtl_ship_alloc_sts_sub_char3.setListListener(p);
		p.columnDtl_yield_schd_sub_char1.addAllListener(p);
		p.columnDtl_yield_schd_sub_char1.setListListener(p);
		p.columnDtl_yield_schd_sub_char2.addAllListener(p);
		p.columnDtl_yield_schd_sub_char2.setListListener(p);
		p.columnDtl_yield_schd_sub_char3.addAllListener(p);
		p.columnDtl_yield_schd_sub_char3.setListListener(p);
		p.columnDtl_yield_act_sub_char1.addAllListener(p);
		p.columnDtl_yield_act_sub_char1.setListListener(p);
		p.columnDtl_yield_act_sub_char2.addAllListener(p);
		p.columnDtl_yield_act_sub_char2.setListListener(p);
		p.columnDtl_yield_act_sub_char3.addAllListener(p);
		p.columnDtl_yield_act_sub_char3.setListListener(p);
		p.columnDtl_stk_sub_char1.addAllListener(p);
		p.columnDtl_stk_sub_char1.setListListener(p);
		p.columnDtl_stk_sub_char2.addAllListener(p);
		p.columnDtl_stk_sub_char2.setListListener(p);
		p.columnDtl_stk_sub_char3.addAllListener(p);
		p.columnDtl_stk_sub_char3.setListListener(p);
		p.columnDtl_dlv_id_cd.addAllListener(p);
		p.columnDtl_dlv_id_cd.setListListener(p);
		p.columnDtl_dlv_id_nm.addAllListener(p);
		p.columnDtl_dlv_id_nm.setListListener(p);
		p.columnDtl_dlv_id_alt_nm1.addAllListener(p);
		p.columnDtl_dlv_id_alt_nm1.setListListener(p);
		p.columnDtl_dlv_id_alt_nm2.addAllListener(p);
		p.columnDtl_dlv_id_alt_nm2.setListListener(p);
		p.columnDtl_dlv_id_alt_nm3.addAllListener(p);
		p.columnDtl_dlv_id_alt_nm3.setListListener(p);
		p.columnDtl_dlv_id_alt_nm4.addAllListener(p);
		p.columnDtl_dlv_id_alt_nm4.setListListener(p);
		p.columnDtl_po_d_no.addAllListener(p);
		p.columnDtl_po_d_no.setListListener(p);
		p.columnDtl_dlv_slip_no.addAllListener(p);
		p.columnDtl_dlv_slip_no.setListListener(p);
		p.columnDtl_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_dlv_slip_d_no.setListListener(p);
		p.columnDtl_arr_dpt_cd.addAllListener(p);
		p.columnDtl_arr_dpt_cd.setListListener(p);
		p.columnDtl_arr_dpt_nm.addAllListener(p);
		p.columnDtl_arr_dpt_nm.setListListener(p);
		p.columnDtl_arr_usr_cd.addAllListener(p);
		p.columnDtl_arr_usr_cd.setListListener(p);
		p.columnDtl_arr_usr_nm.addAllListener(p);
		p.columnDtl_arr_usr_nm.setListListener(p);
		p.columnDtl_acpt_dpt_cd.addAllListener(p);
		p.columnDtl_acpt_dpt_cd.setListListener(p);
		p.columnDtl_acpt_dpt_nm.addAllListener(p);
		p.columnDtl_acpt_dpt_nm.setListListener(p);
		p.columnDtl_acpt_usr_cd.addAllListener(p);
		p.columnDtl_acpt_usr_cd.setListListener(p);
		p.columnDtl_acpt_usr_nm.addAllListener(p);
		p.columnDtl_acpt_usr_nm.setListListener(p);
		p.columnDtl_lot_rmrks.addAllListener(p);
		p.columnDtl_lot_rmrks.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_StkListPrnt p) {
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
	}

	/**
	 * [PRNT_ARR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ARR_Dtl(MSBEP_StkListPrnt p){
		p.columnDtl_check.putMode(p, PRNT_ARR, MCMode.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(PRNT_ARR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_alt_nm1.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm2.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm3.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm4.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(PRNT_ARR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_prnt_all_qty.putMode(p, PRNT_ARR, MCMode.REQUIRED);
		p.columnDtl_rmndr_prnt_flg.putMode(p, PRNT_ARR, MCMode.REQUIRED);
		p.columnDtl_stk_lst_prnt_flg.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_unit_cd_per_pckg_unit.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_unit_nm_per_pckg_unit.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.Dtl_qty_per_pckg_unit_p_PPanel.putStatus(PRNT_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rmndr_unit_cd.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_rmndr_unit_nm.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.Dtl_rmndr_unit_qty_p_PPanel.putStatus(PRNT_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dec_place.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(PRNT_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(PRNT_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_dec_place.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.Dtl_dlv_inst_qty_p_PPanel.putStatus(PRNT_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_dlv_inst_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(PRNT_ARR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_unreg_lmt_flg.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_vld_dt.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_lmt_dt.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_in_xfr_typ.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_in_xfr_typ_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_asst_typ.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_asst_typ_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_fix_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm1.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm2.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm3.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm4.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm1.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm2.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm3.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm4.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_po_d_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_mfg_act_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_act_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_form_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_co_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_dt.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_tm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char1.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_arr_act_sub_char2.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_arr_act_sub_char3.putMode(p, PRNT_ARR, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_sub_char1.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char2.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char3.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char1.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char2.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char3.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char1.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char2.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char3.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char1.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char2.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char3.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char1.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char2.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char3.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm1.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm2.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm3.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm4.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(PRNT_ARR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_cd.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_nm.putMode(p, PRNT_ARR, MCMode.INVISIBLE);
		p.columnDtl_lot_rmrks.putMode(p, PRNT_ARR, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_ARR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ARR_Btn(MSBEP_StkListPrnt p){
		p.Btn_prnt.putMode(p, PRNT_ARR, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT_ARR, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_ARR, MCMode.ENABLE);

	}

	/**
	 * [FIX_ARR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ARR_Dtl(MSBEP_StkListPrnt p){
		p.columnDtl_check.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_ARR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_alt_nm1.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm2.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm3.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm4.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_ARR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_prnt_all_qty.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_rmndr_prnt_flg.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_stk_lst_prnt_flg.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_unit_cd_per_pckg_unit.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_unit_nm_per_pckg_unit.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.Dtl_qty_per_pckg_unit_p_PPanel.putStatus(FIX_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rmndr_unit_cd.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_rmndr_unit_nm.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.Dtl_rmndr_unit_qty_p_PPanel.putStatus(FIX_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dec_place.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(FIX_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_dec_place.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.Dtl_dlv_inst_qty_p_PPanel.putStatus(FIX_ARR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_dlv_inst_qty_p_PPanel.columnQty_qty.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_ARR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_unreg_lmt_flg.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_vld_dt.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_lmt_dt.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_in_xfr_typ.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_in_xfr_typ_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_asst_typ.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_asst_typ_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_fix_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm1.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm2.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm3.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm4.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm1.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm2.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm3.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm4.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_mfg_act_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_act_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_form_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_co_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_dt.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_tm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char1.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_arr_act_sub_char2.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_arr_act_sub_char3.putMode(p, FIX_ARR, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_sub_char1.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char2.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char3.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char1.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char2.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char3.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char1.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char2.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char3.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char1.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char2.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char3.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char1.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char2.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char3.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm1.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm2.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm3.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm4.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_ARR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_cd.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_nm.putMode(p, FIX_ARR, MCMode.INVISIBLE);
		p.columnDtl_lot_rmrks.putMode(p, FIX_ARR, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_ARR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__ARR_Btn(MSBEP_StkListPrnt p){
		p.Btn_prnt.putMode(p, FIX_ARR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_ARR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_ARR, MCMode.DISABLE);

	}

	/**
	 * [PRNT_SHIP]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__SHIP_Dtl(MSBEP_StkListPrnt p){
		p.columnDtl_check.putMode(p, PRNT_SHIP, MCMode.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(PRNT_SHIP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_alt_nm1.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm2.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm3.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm4.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(PRNT_SHIP, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_prnt_all_qty.putMode(p, PRNT_SHIP, MCMode.REQUIRED);
		p.columnDtl_rmndr_prnt_flg.putMode(p, PRNT_SHIP, MCMode.REQUIRED);
		p.columnDtl_stk_lst_prnt_flg.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_unit_cd_per_pckg_unit.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_unit_nm_per_pckg_unit.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.Dtl_qty_per_pckg_unit_p_PPanel.putStatus(PRNT_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rmndr_unit_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_rmndr_unit_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.Dtl_rmndr_unit_qty_p_PPanel.putStatus(PRNT_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dec_place.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(PRNT_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(PRNT_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_unit_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_unit_dec_place.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.Dtl_dlv_inst_qty_p_PPanel.putStatus(PRNT_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_dlv_inst_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(PRNT_SHIP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_unreg_lmt_flg.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_vld_dt.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_lmt_dt.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_in_xfr_typ.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_in_xfr_typ_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_asst_typ.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_asst_typ_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_fix_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_alt_nm1.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm2.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm3.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm4.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_alt_nm1.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm2.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm3.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm4.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_arr_act_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_mfg_act_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_act_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_form_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_co_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_tm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char1.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char2.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char3.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char1.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_sub_char2.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_sub_char3.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_sub_char1.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_sub_char2.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_sub_char3.putMode(p, PRNT_SHIP, MCMode.READ_ONLY);
		p.columnDtl_yield_schd_sub_char1.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char2.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char3.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char1.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char2.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char3.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char1.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char2.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char3.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm1.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm2.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm3.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm4.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(PRNT_SHIP, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_cd.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_nm.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);
		p.columnDtl_lot_rmrks.putMode(p, PRNT_SHIP, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_SHIP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__SHIP_Btn(MSBEP_StkListPrnt p){
		p.Btn_prnt.putMode(p, PRNT_SHIP, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT_SHIP, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_SHIP, MCMode.ENABLE);

	}

	/**
	 * [FIX_SHIP]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Dtl(MSBEP_StkListPrnt p){
		p.columnDtl_check.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_alt_nm1.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm2.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm3.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm4.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_prnt_all_qty.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_rmndr_prnt_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_stk_lst_prnt_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_unit_cd_per_pckg_unit.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_unit_nm_per_pckg_unit.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Dtl_qty_per_pckg_unit_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rmndr_unit_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_rmndr_unit_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Dtl_rmndr_unit_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dec_place.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_unit_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_unit_dec_place.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Dtl_dlv_inst_qty_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_dlv_inst_qty_p_PPanel.columnQty_qty.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_unreg_lmt_flg.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_vld_dt.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_lmt_dt.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_in_xfr_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_in_xfr_typ_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_asst_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_asst_typ_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_fix_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_alt_nm1.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm2.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm3.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm4.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_alt_nm1.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm2.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm3.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm4.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_arr_act_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_mfg_act_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_act_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_form_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_co_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_tm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char1.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char2.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char3.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char1.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_sub_char2.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_act_d_sub_char3.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_sub_char1.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_sub_char2.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_sub_char3.putMode(p, FIX_SHIP, MCMode.READ_ONLY);
		p.columnDtl_yield_schd_sub_char1.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char2.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char3.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char1.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char2.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char3.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char1.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char2.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char3.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm1.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm2.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm3.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm4.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_SHIP, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_cd.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_nm.putMode(p, FIX_SHIP, MCMode.INVISIBLE);
		p.columnDtl_lot_rmrks.putMode(p, FIX_SHIP, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_SHIP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__SHIP_Btn(MSBEP_StkListPrnt p){
		p.Btn_prnt.putMode(p, FIX_SHIP, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_SHIP, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_SHIP, MCMode.DISABLE);

	}

	/**
	 * [PRNT_MFG]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__MFG_Dtl(MSBEP_StkListPrnt p){
		p.columnDtl_check.putMode(p, PRNT_MFG, MCMode.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(PRNT_MFG, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_alt_nm1.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm2.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm3.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm4.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(PRNT_MFG, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_prnt_all_qty.putMode(p, PRNT_MFG, MCMode.REQUIRED);
		p.columnDtl_rmndr_prnt_flg.putMode(p, PRNT_MFG, MCMode.REQUIRED);
		p.columnDtl_stk_lst_prnt_flg.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_unit_cd_per_pckg_unit.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_unit_nm_per_pckg_unit.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.Dtl_qty_per_pckg_unit_p_PPanel.putStatus(PRNT_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rmndr_unit_cd.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_rmndr_unit_nm.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.Dtl_rmndr_unit_qty_p_PPanel.putStatus(PRNT_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dec_place.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(PRNT_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(PRNT_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_dec_place.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.Dtl_dlv_inst_qty_p_PPanel.putStatus(PRNT_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_dlv_inst_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(PRNT_MFG, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_unreg_lmt_flg.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_vld_dt.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_lmt_dt.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_in_xfr_typ.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_in_xfr_typ_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_asst_typ.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_asst_typ_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_fix_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm1.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm2.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm3.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm4.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm1.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm2.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm3.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm4.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_po_d_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_schd_no.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_act_no.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_byprod_flg.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_form_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_co_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_dt.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_tm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char1.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char2.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char3.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char1.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char2.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char3.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char1.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char2.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char3.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char1.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_schd_sub_char2.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_schd_sub_char3.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_act_sub_char1.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_act_sub_char2.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_act_sub_char3.putMode(p, PRNT_MFG, MCMode.READ_ONLY);
		p.columnDtl_stk_sub_char1.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char2.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char3.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm1.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm2.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm3.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm4.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(PRNT_MFG, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_cd.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_nm.putMode(p, PRNT_MFG, MCMode.INVISIBLE);
		p.columnDtl_lot_rmrks.putMode(p, PRNT_MFG, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_MFG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__MFG_Btn(MSBEP_StkListPrnt p){
		p.Btn_prnt.putMode(p, PRNT_MFG, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT_MFG, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_MFG, MCMode.ENABLE);

	}

	/**
	 * [FIX_MFG]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MFG_Dtl(MSBEP_StkListPrnt p){
		p.columnDtl_check.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_MFG, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_alt_nm1.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm2.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm3.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm4.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_MFG, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_prnt_all_qty.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_rmndr_prnt_flg.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_stk_lst_prnt_flg.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_unit_cd_per_pckg_unit.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_unit_nm_per_pckg_unit.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.Dtl_qty_per_pckg_unit_p_PPanel.putStatus(FIX_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rmndr_unit_cd.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_rmndr_unit_nm.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.Dtl_rmndr_unit_qty_p_PPanel.putStatus(FIX_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dec_place.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(FIX_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_dec_place.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.Dtl_dlv_inst_qty_p_PPanel.putStatus(FIX_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_dlv_inst_qty_p_PPanel.columnQty_qty.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_MFG, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_unreg_lmt_flg.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_vld_dt.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_lmt_dt.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_in_xfr_typ.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_in_xfr_typ_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_asst_typ.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_asst_typ_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_fix_no_typ_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_fix_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm1.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm2.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm3.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm4.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm1.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm2.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm3.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm4.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_schd_no.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_act_no.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_byprod_flg.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_prnt_lcl_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_form_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_co_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_dt.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_tm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char1.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char2.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char3.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char1.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char2.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char3.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char1.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char2.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char3.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char1.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_schd_sub_char2.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_schd_sub_char3.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_act_sub_char1.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_act_sub_char2.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_act_sub_char3.putMode(p, FIX_MFG, MCMode.READ_ONLY);
		p.columnDtl_stk_sub_char1.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char2.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char3.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm1.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm2.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm3.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm4.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_MFG, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_cd.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_nm.putMode(p, FIX_MFG, MCMode.INVISIBLE);
		p.columnDtl_lot_rmrks.putMode(p, FIX_MFG, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_MFG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MFG_Btn(MSBEP_StkListPrnt p){
		p.Btn_prnt.putMode(p, FIX_MFG, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_MFG, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_MFG, MCMode.DISABLE);

	}

	/**
	 * [PRNT_STK]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__STK_Dtl(MSBEP_StkListPrnt p){
		p.columnDtl_check.putMode(p, PRNT_STK, MCMode.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(PRNT_STK, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_alt_nm1.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm2.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm3.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm4.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(PRNT_STK, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_prnt_all_qty.putMode(p, PRNT_STK, MCMode.REQUIRED);
		p.columnDtl_rmndr_prnt_flg.putMode(p, PRNT_STK, MCMode.REQUIRED);
		p.columnDtl_stk_lst_prnt_flg.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_unit_cd_per_pckg_unit.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_unit_nm_per_pckg_unit.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.Dtl_qty_per_pckg_unit_p_PPanel.putStatus(PRNT_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rmndr_unit_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_rmndr_unit_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.Dtl_rmndr_unit_qty_p_PPanel.putStatus(PRNT_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dec_place.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(PRNT_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(PRNT_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_dec_place.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.Dtl_dlv_inst_qty_p_PPanel.putStatus(PRNT_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_dlv_inst_qty_p_PPanel.columnQty_qty.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(PRNT_STK, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_unreg_lmt_flg.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_vld_dt.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_lmt_dt.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_in_xfr_typ.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_in_xfr_typ_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm1.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm2.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm3.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm4.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm1.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm2.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm3.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm4.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_po_d_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_mfg_act_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_act_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_form_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_co_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_dt.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_tm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char1.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char2.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char3.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char1.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char2.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char3.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char1.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char2.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char3.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char1.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char2.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char3.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char1.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char2.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char3.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char1.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_sub_char2.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_sub_char3.putMode(p, PRNT_STK, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm1.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm2.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm3.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm4.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(PRNT_STK, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_cd.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_nm.putMode(p, PRNT_STK, MCMode.INVISIBLE);
		p.columnDtl_lot_rmrks.putMode(p, PRNT_STK, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT_STK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__STK_Btn(MSBEP_StkListPrnt p){
		p.Btn_prnt.putMode(p, PRNT_STK, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT_STK, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT_STK, MCMode.ENABLE);

	}

	/**
	 * [FIX_STK]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__STK_Dtl(MSBEP_StkListPrnt p){
		p.columnDtl_check.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_STK, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_alt_nm1.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm2.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm3.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_itm_alt_nm4.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_STK, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_prnt_all_qty.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_rmndr_prnt_flg.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_lst_prnt_flg.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_unit_cd_per_pckg_unit.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_unit_nm_per_pckg_unit.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.Dtl_qty_per_pckg_unit_p_PPanel.putStatus(FIX_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rmndr_unit_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_rmndr_unit_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.Dtl_rmndr_unit_qty_p_PPanel.putStatus(FIX_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dec_place.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(FIX_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_inst_unit_dec_place.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.Dtl_dlv_inst_qty_p_PPanel.putStatus(FIX_STK, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_dlv_inst_qty_p_PPanel.columnQty_qty.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_loc_grp_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_STK, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_unreg_lmt_flg.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_vld_dt.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_lmt_dt.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_in_xfr_typ.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_in_xfr_typ_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm1.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm2.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm3.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_alt_nm4.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm1.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm2.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm3.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_alt_nm4.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_mfg_act_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_act_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_form_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_co_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_dt.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_tm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char1.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char2.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_act_sub_char3.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char1.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char2.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_sub_char3.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char1.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char2.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_sub_char3.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char1.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char2.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_schd_sub_char3.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char1.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char2.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_yield_act_sub_char3.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_stk_sub_char1.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_sub_char2.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_stk_sub_char3.putMode(p, FIX_STK, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm1.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm2.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm3.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_alt_nm4.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_STK, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_dpt_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_arr_usr_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_acpt_dpt_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_cd.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_acpt_usr_nm.putMode(p, FIX_STK, MCMode.INVISIBLE);
		p.columnDtl_lot_rmrks.putMode(p, FIX_STK, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_STK]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__STK_Btn(MSBEP_StkListPrnt p){
		p.Btn_prnt.putMode(p, FIX_STK, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_STK, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_STK, MCMode.DISABLE);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_StkListPrnt_MC.setTableConfigDtl((MSBEP_StkListPrnt)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_StkListPrnt p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_itm_alt_nm1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.itm_alt_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_alt_nm1);
		p.columnDtl_itm_alt_nm2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.itm_alt_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_alt_nm2);
		p.columnDtl_itm_alt_nm3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.itm_alt_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_alt_nm3);
		p.columnDtl_itm_alt_nm4.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.itm_alt_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_alt_nm4);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_lot_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no);
		p.columnDtl_sublot_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_prnt_all_qty.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.prnt_all_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prnt_all_qty);
		p.columnDtl_rmndr_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.rmndr_prnt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rmndr_prnt_flg);
		p.columnDtl_stk_lst_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_lst_prnt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_lst_prnt_flg);
		p.columnDtl_pckg_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.pckg_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_cd);
		p.columnDtl_pckg_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.pckg_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_nm);
		p.columnDtl_unit_cd_per_pckg_unit.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.unit_cd_per_pckg_unit_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_cd_per_pckg_unit);
		p.columnDtl_unit_nm_per_pckg_unit.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.unit_nm_per_pckg_unit_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_nm_per_pckg_unit);
		p.DtlTable.addTable(p.Dtl_qty_per_pckg_unit_p_PPanel.QtyTable);
		p.columnDtl_rmndr_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.rmndr_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rmndr_unit_cd);
		p.columnDtl_rmndr_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.rmndr_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rmndr_unit_nm);
		p.DtlTable.addTable(p.Dtl_rmndr_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.pack_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_cd);
		p.columnDtl_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.pack_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_nm);
		p.columnDtl_pack_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.pack_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_dec_place);
		p.DtlTable.addTable(p.Dtl_pack_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_dlv_inst_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_inst_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_inst_unit_cd);
		p.columnDtl_dlv_inst_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_inst_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_inst_unit_nm);
		p.columnDtl_dlv_inst_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_inst_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_inst_unit_dec_place);
		p.DtlTable.addTable(p.Dtl_dlv_inst_qty_p_PPanel.QtyTable);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.columnDtl_str_ln_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.str_ln_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_cd);
		p.columnDtl_str_ln_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.str_ln_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_nm);
		p.columnDtl_site_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.site_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_cd);
		p.columnDtl_site_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.site_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_loc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.loc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_grp_cd);
		p.columnDtl_loc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.loc_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_grp_nm);
		p.DtlTable.addTable(p.Dtl_sno_p_PPanel.SnoWrkNoTable);
		p.columnDtl_bp_lot_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.bp_lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_lot_no);
		p.columnDtl_unreg_lmt_flg.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.unreg_lmt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unreg_lmt_flg);
		p.columnDtl_vld_dt.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.vld_dt_META);
		p.columnDtl_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_vld_dt);
		p.columnDtl_lmt_dt.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.lmt_dt_META);
		p.columnDtl_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_lmt_dt);
		p.columnDtl_quality_typ.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.quality_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ);
		p.columnDtl_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.quality_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ_nm);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.gd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.columnDtl_in_xfr_typ.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.in_xfr_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_xfr_typ);
		p.columnDtl_in_xfr_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.in_xfr_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_xfr_typ_nm);
		p.columnDtl_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_insp_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_insp_typ);
		p.columnDtl_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_insp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_insp_typ_nm);
		p.columnDtl_asst_typ.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.asst_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_typ);
		p.columnDtl_asst_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.asst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_typ_nm);
		p.columnDtl_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_id_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ);
		p.columnDtl_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ_nm);
		p.columnDtl_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_bp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_bp_cd);
		p.columnDtl_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_bp_nm);
		p.columnDtl_fix_no_typ.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.fix_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_no_typ);
		p.columnDtl_fix_no_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.fix_no_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_no_typ_nm);
		p.columnDtl_fix_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.fix_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_no);
		p.columnDtl_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_arrv_bp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_arrv_bp_cd);
		p.columnDtl_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_arrv_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_arrv_bp_nm);
		p.columnDtl_cst_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
		p.columnDtl_cst_alt_nm1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_alt_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_alt_nm1);
		p.columnDtl_cst_alt_nm2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_alt_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_alt_nm2);
		p.columnDtl_cst_alt_nm3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_alt_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_alt_nm3);
		p.columnDtl_cst_alt_nm4.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_alt_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_alt_nm4);
		p.columnDtl_dlv_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cd);
		p.columnDtl_dlv_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_nm);
		p.columnDtl_dlv_alt_nm1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_alt_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_alt_nm1);
		p.columnDtl_dlv_alt_nm2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_alt_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_alt_nm2);
		p.columnDtl_dlv_alt_nm3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_alt_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_alt_nm3);
		p.columnDtl_dlv_alt_nm4.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_alt_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_alt_nm4);
		p.columnDtl_cst_po_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_no);
		p.columnDtl_cst_po_d_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_d_no);
		p.columnDtl_arr_act_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.arr_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_act_no);
		p.columnDtl_ship_inst_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_no);
		p.columnDtl_ship_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_inst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_d_no);
		p.columnDtl_ship_alloc_sts_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_alloc_sts_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_alloc_sts_no);
		p.columnDtl_ship_act_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_no);
		p.columnDtl_ship_act_d_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_d_no);
		p.columnDtl_mfg_inst_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_no);
		p.columnDtl_yield_schd_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.yield_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_schd_no);
		p.columnDtl_mfg_act_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.mfg_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_act_no);
		p.columnDtl_yield_act_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.yield_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_act_no);
		p.columnDtl_byprod_flg.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.byprod_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_byprod_flg);
		p.columnDtl_prnt_lcl_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.prnt_lcl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prnt_lcl_cd);
		p.columnDtl_stk_lst_form_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_lst_form_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_lst_form_cd);
		p.columnDtl_co_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.co_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_cd);
		p.columnDtl_co_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.co_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_nm);
		p.columnDtl_cst_dlv_inst_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_dlv_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_dlv_inst_no);
		p.columnDtl_cst_dlv_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.cst_dlv_inst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_dlv_inst_d_no);
		p.columnDtl_dlv_rqst_dt.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_rqst_dt_META);
		p.columnDtl_dlv_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_rqst_dt);
		p.columnDtl_dlv_rqst_tm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_rqst_tm_META);
		p.columnDtl_dlv_rqst_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_rqst_tm);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_arr_act_sub_char1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.arr_act_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_act_sub_char1);
		p.columnDtl_arr_act_sub_char2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.arr_act_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_act_sub_char2);
		p.columnDtl_arr_act_sub_char3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.arr_act_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_act_sub_char3);
		p.columnDtl_ship_act_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_act_d_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_d_sub_char1);
		p.columnDtl_ship_act_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_act_d_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_d_sub_char2);
		p.columnDtl_ship_act_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_act_d_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_d_sub_char3);
		p.columnDtl_ship_alloc_sts_sub_char1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_alloc_sts_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_alloc_sts_sub_char1);
		p.columnDtl_ship_alloc_sts_sub_char2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_alloc_sts_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_alloc_sts_sub_char2);
		p.columnDtl_ship_alloc_sts_sub_char3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.ship_alloc_sts_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_alloc_sts_sub_char3);
		p.columnDtl_yield_schd_sub_char1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.yield_schd_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_schd_sub_char1);
		p.columnDtl_yield_schd_sub_char2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.yield_schd_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_schd_sub_char2);
		p.columnDtl_yield_schd_sub_char3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.yield_schd_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_schd_sub_char3);
		p.columnDtl_yield_act_sub_char1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.yield_act_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_act_sub_char1);
		p.columnDtl_yield_act_sub_char2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.yield_act_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_act_sub_char2);
		p.columnDtl_yield_act_sub_char3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.yield_act_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_act_sub_char3);
		p.columnDtl_stk_sub_char1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_sub_char1);
		p.columnDtl_stk_sub_char2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_sub_char2);
		p.columnDtl_stk_sub_char3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.stk_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_sub_char3);
		p.columnDtl_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_id_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_cd);
		p.columnDtl_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_id_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_nm);
		p.columnDtl_dlv_id_alt_nm1.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_id_alt_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_alt_nm1);
		p.columnDtl_dlv_id_alt_nm2.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_id_alt_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_alt_nm2);
		p.columnDtl_dlv_id_alt_nm3.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_id_alt_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_alt_nm3);
		p.columnDtl_dlv_id_alt_nm4.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_id_alt_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_alt_nm4);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		p.columnDtl_po_d_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_d_no);
		p.columnDtl_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_no);
		p.columnDtl_dlv_slip_d_no.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_d_no);
		p.columnDtl_arr_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.arr_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_dpt_cd);
		p.columnDtl_arr_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.arr_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_dpt_nm);
		p.columnDtl_arr_usr_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.arr_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_usr_cd);
		p.columnDtl_arr_usr_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.arr_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_usr_nm);
		p.columnDtl_acpt_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.acpt_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acpt_dpt_cd);
		p.columnDtl_acpt_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.acpt_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acpt_dpt_nm);
		p.columnDtl_acpt_usr_cd.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.acpt_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acpt_usr_cd);
		p.columnDtl_acpt_usr_nm.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.acpt_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acpt_usr_nm);
		p.columnDtl_lot_rmrks.setMeta(mcframe.clientMSBE.MSBEP0110.DtlR.lot_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_rmrks);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnDtl_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sublot_no.getListConfig().setPutter(getDtl_sublot_no_ListPutter());
		columnDtl_pckg_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pckg_unit_cd.getListConfig().setPutter(getDtl_pckg_unit_cd_ListPutter());
		columnDtl_unit_cd_per_pckg_unit.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_unit_cd_per_pckg_unit.getListConfig().setPutter(getDtl_unit_cd_per_pckg_unit_ListPutter());
		columnDtl_rmndr_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rmndr_unit_cd.getListConfig().setPutter(getDtl_rmndr_unit_cd_ListPutter());
		columnDtl_pack_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pack_unit_cd.getListConfig().setPutter(getDtl_pack_unit_cd_ListPutter());
		columnDtl_base_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_base_unit_cd.getListConfig().setPutter(getDtl_base_unit_cd_ListPutter());
		columnDtl_dlv_inst_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dlv_inst_unit_cd.getListConfig().setPutter(getDtl_dlv_inst_unit_cd_ListPutter());
		columnDtl_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_loc_cd.getListConfig().setPutter(getDtl_loc_cd_ListPutter());
		columnDtl_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_str_ln_cd.getListConfig().setPutter(getDtl_str_ln_cd_ListPutter());
		columnDtl_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_site_cd.getListConfig().setPutter(getDtl_site_cd_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		columnDtl_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_loc_grp_cd.getListConfig().setPutter(getDtl_loc_grp_cd_ListPutter());
		columnDtl_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_quality_typ.getListConfig().setPutter(getDtl_quality_typ_ListPutter());
		columnDtl_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_gd_cd.getListConfig().setPutter(getDtl_gd_cd_ListPutter());
		columnDtl_in_xfr_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_in_xfr_typ.getListConfig().setPutter(getDtl_in_xfr_typ_ListPutter());
		columnDtl_stk_insp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_stk_insp_typ.getListConfig().setPutter(getDtl_stk_insp_typ_ListPutter());
		columnDtl_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_stk_id_typ.getListConfig().setPutter(getDtl_stk_id_typ_ListPutter());
		columnDtl_stk_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_stk_bp_cd.getListConfig().setPutter(getDtl_stk_bp_cd_ListPutter());
		columnDtl_fix_no_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_fix_no_typ.getListConfig().setPutter(getDtl_fix_no_typ_ListPutter());
		columnDtl_stk_arrv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_stk_arrv_bp_cd.getListConfig().setPutter(getDtl_stk_arrv_bp_cd_ListPutter());
		columnDtl_cst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cst_cd.getListConfig().setPutter(getDtl_cst_cd_ListPutter());
		columnDtl_dlv_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dlv_cd.getListConfig().setPutter(getDtl_dlv_cd_ListPutter());
		columnDtl_cst_po_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cst_po_no.getListConfig().setPutter(getDtl_cst_po_no_ListPutter());
		columnDtl_arr_act_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_arr_act_no.getListConfig().setPutter(getDtl_arr_act_no_ListPutter());
	}

	/**
	 * この画面を[PRNT_ARR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_ARRStatus() {
		status = PRNT_ARR;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_ARR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_ARRStatus() {
		status = FIX_ARR;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT_SHIP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_SHIPStatus() {
		status = PRNT_SHIP;
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
	 * この画面を[PRNT_MFG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_MFGStatus() {
		status = PRNT_MFG;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_MFG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_MFGStatus() {
		status = FIX_MFG;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT_STK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_STKStatus() {
		status = PRNT_STK;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_STK]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_STKStatus() {
		status = FIX_STK;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (PRNT_ARR.equals(status)) {
			setPRNT_ARRStatus();
		}
		else if (FIX_ARR.equals(status)) {
			setFIX_ARRStatus();
		}
		else if (PRNT_SHIP.equals(status)) {
			setPRNT_SHIPStatus();
		}
		else if (FIX_SHIP.equals(status)) {
			setFIX_SHIPStatus();
		}
		else if (PRNT_MFG.equals(status)) {
			setPRNT_MFGStatus();
		}
		else if (FIX_MFG.equals(status)) {
			setFIX_MFGStatus();
		}
		else if (PRNT_STK.equals(status)) {
			setPRNT_STKStatus();
		}
		else if (FIX_STK.equals(status)) {
			setFIX_STKStatus();
		}
	}

	/**
	 * [Dtl_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_pckg_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pckg_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_unit_cd_per_pckg_unit_ListPutter]の作成
	 */
	protected MCListPutter createDtl_unit_cd_per_pckg_unit_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_rmndr_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rmndr_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_pack_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pack_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_base_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_base_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_dlv_inst_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dlv_inst_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_in_xfr_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_in_xfr_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_stk_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_stk_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_stk_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_stk_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_fix_no_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_fix_no_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_cst_po_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cst_po_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_arr_act_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_arr_act_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnDtl_sublot_no) return getDtl_sublot_no(row, info);
		if(combo == columnDtl_pckg_unit_cd) return getDtl_pckg_unit_cd(row, info);
		if(combo == columnDtl_unit_cd_per_pckg_unit) return getDtl_unit_cd_per_pckg_unit(row, info);
		if(combo == columnDtl_rmndr_unit_cd) return getDtl_rmndr_unit_cd(row, info);
		if(combo == columnDtl_pack_unit_cd) return getDtl_pack_unit_cd(row, info);
		if(combo == columnDtl_base_unit_cd) return getDtl_base_unit_cd(row, info);
		if(combo == columnDtl_dlv_inst_unit_cd) return getDtl_dlv_inst_unit_cd(row, info);
		if(combo == columnDtl_loc_cd) return getDtl_loc_cd(row, info);
		if(combo == columnDtl_str_ln_cd) return getDtl_str_ln_cd(row, info);
		if(combo == columnDtl_site_cd) return getDtl_site_cd(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == columnDtl_loc_grp_cd) return getDtl_loc_grp_cd(row, info);
		if(combo == columnDtl_quality_typ) return getDtl_quality_typ(row, info);
		if(combo == columnDtl_gd_cd) return getDtl_gd_cd(row, info);
		if(combo == columnDtl_in_xfr_typ) return getDtl_in_xfr_typ(row, info);
		if(combo == columnDtl_stk_insp_typ) return getDtl_stk_insp_typ(row, info);
		if(combo == columnDtl_stk_id_typ) return getDtl_stk_id_typ(row, info);
		if(combo == columnDtl_stk_bp_cd) return getDtl_stk_bp_cd(row, info);
		if(combo == columnDtl_fix_no_typ) return getDtl_fix_no_typ(row, info);
		if(combo == columnDtl_stk_arrv_bp_cd) return getDtl_stk_arrv_bp_cd(row, info);
		if(combo == columnDtl_cst_cd) return getDtl_cst_cd(row, info);
		if(combo == columnDtl_dlv_cd) return getDtl_dlv_cd(row, info);
		if(combo == columnDtl_cst_po_no) return getDtl_cst_po_no(row, info);
		if(combo == columnDtl_arr_act_no) return getDtl_arr_act_no(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
	}

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_itm_alt_nm1) return doDtl_itm_alt_nm1_VC(info);
		if (vc == columnDtl_itm_alt_nm2) return doDtl_itm_alt_nm2_VC(info);
		if (vc == columnDtl_itm_alt_nm3) return doDtl_itm_alt_nm3_VC(info);
		if (vc == columnDtl_itm_alt_nm4) return doDtl_itm_alt_nm4_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_lot_no) return doDtl_lot_no_VC(info);
		if (vc == columnDtl_sublot_no) return doDtl_sublot_no_VC(info);
		if (vc == columnDtl_prnt_all_qty) return doDtl_prnt_all_qty_VC(info);
		if (vc == columnDtl_rmndr_prnt_flg) return doDtl_rmndr_prnt_flg_VC(info);
		if (vc == columnDtl_stk_lst_prnt_flg) return doDtl_stk_lst_prnt_flg_VC(info);
		if (vc == columnDtl_pckg_unit_cd) return doDtl_pckg_unit_cd_VC(info);
		if (vc == columnDtl_pckg_unit_nm) return doDtl_pckg_unit_nm_VC(info);
		if (vc == columnDtl_unit_cd_per_pckg_unit) return doDtl_unit_cd_per_pckg_unit_VC(info);
		if (vc == columnDtl_unit_nm_per_pckg_unit) return doDtl_unit_nm_per_pckg_unit_VC(info);
		if (vc == columnDtl_rmndr_unit_cd) return doDtl_rmndr_unit_cd_VC(info);
		if (vc == columnDtl_rmndr_unit_nm) return doDtl_rmndr_unit_nm_VC(info);
		if (vc == columnDtl_pack_unit_cd) return doDtl_pack_unit_cd_VC(info);
		if (vc == columnDtl_pack_unit_nm) return doDtl_pack_unit_nm_VC(info);
		if (vc == columnDtl_pack_unit_dec_place) return doDtl_pack_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_dlv_inst_unit_cd) return doDtl_dlv_inst_unit_cd_VC(info);
		if (vc == columnDtl_dlv_inst_unit_nm) return doDtl_dlv_inst_unit_nm_VC(info);
		if (vc == columnDtl_dlv_inst_unit_dec_place) return doDtl_dlv_inst_unit_dec_place_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_str_ln_cd) return doDtl_str_ln_cd_VC(info);
		if (vc == columnDtl_str_ln_nm) return doDtl_str_ln_nm_VC(info);
		if (vc == columnDtl_site_cd) return doDtl_site_cd_VC(info);
		if (vc == columnDtl_site_nm) return doDtl_site_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_loc_grp_cd) return doDtl_loc_grp_cd_VC(info);
		if (vc == columnDtl_loc_grp_nm) return doDtl_loc_grp_nm_VC(info);
		if (vc == columnDtl_bp_lot_no) return doDtl_bp_lot_no_VC(info);
		if (vc == columnDtl_unreg_lmt_flg) return doDtl_unreg_lmt_flg_VC(info);
		if (vc == columnDtl_vld_dt) return doDtl_vld_dt_VC(info);
		if (vc == columnDtl_lmt_dt) return doDtl_lmt_dt_VC(info);
		if (vc == columnDtl_quality_typ) return doDtl_quality_typ_VC(info);
		if (vc == columnDtl_quality_typ_nm) return doDtl_quality_typ_nm_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_in_xfr_typ) return doDtl_in_xfr_typ_VC(info);
		if (vc == columnDtl_in_xfr_typ_nm) return doDtl_in_xfr_typ_nm_VC(info);
		if (vc == columnDtl_stk_insp_typ) return doDtl_stk_insp_typ_VC(info);
		if (vc == columnDtl_stk_insp_typ_nm) return doDtl_stk_insp_typ_nm_VC(info);
		if (vc == columnDtl_asst_typ) return doDtl_asst_typ_VC(info);
		if (vc == columnDtl_asst_typ_nm) return doDtl_asst_typ_nm_VC(info);
		if (vc == columnDtl_stk_id_typ) return doDtl_stk_id_typ_VC(info);
		if (vc == columnDtl_stk_id_typ_nm) return doDtl_stk_id_typ_nm_VC(info);
		if (vc == columnDtl_stk_bp_cd) return doDtl_stk_bp_cd_VC(info);
		if (vc == columnDtl_stk_bp_nm) return doDtl_stk_bp_nm_VC(info);
		if (vc == columnDtl_fix_no_typ) return doDtl_fix_no_typ_VC(info);
		if (vc == columnDtl_fix_no_typ_nm) return doDtl_fix_no_typ_nm_VC(info);
		if (vc == columnDtl_fix_no) return doDtl_fix_no_VC(info);
		if (vc == columnDtl_stk_arrv_bp_cd) return doDtl_stk_arrv_bp_cd_VC(info);
		if (vc == columnDtl_stk_arrv_bp_nm) return doDtl_stk_arrv_bp_nm_VC(info);
		if (vc == columnDtl_cst_cd) return doDtl_cst_cd_VC(info);
		if (vc == columnDtl_cst_nm) return doDtl_cst_nm_VC(info);
		if (vc == columnDtl_cst_alt_nm1) return doDtl_cst_alt_nm1_VC(info);
		if (vc == columnDtl_cst_alt_nm2) return doDtl_cst_alt_nm2_VC(info);
		if (vc == columnDtl_cst_alt_nm3) return doDtl_cst_alt_nm3_VC(info);
		if (vc == columnDtl_cst_alt_nm4) return doDtl_cst_alt_nm4_VC(info);
		if (vc == columnDtl_dlv_cd) return doDtl_dlv_cd_VC(info);
		if (vc == columnDtl_dlv_nm) return doDtl_dlv_nm_VC(info);
		if (vc == columnDtl_dlv_alt_nm1) return doDtl_dlv_alt_nm1_VC(info);
		if (vc == columnDtl_dlv_alt_nm2) return doDtl_dlv_alt_nm2_VC(info);
		if (vc == columnDtl_dlv_alt_nm3) return doDtl_dlv_alt_nm3_VC(info);
		if (vc == columnDtl_dlv_alt_nm4) return doDtl_dlv_alt_nm4_VC(info);
		if (vc == columnDtl_cst_po_no) return doDtl_cst_po_no_VC(info);
		if (vc == columnDtl_cst_po_d_no) return doDtl_cst_po_d_no_VC(info);
		if (vc == columnDtl_arr_act_no) return doDtl_arr_act_no_VC(info);
		if (vc == columnDtl_ship_inst_no) return doDtl_ship_inst_no_VC(info);
		if (vc == columnDtl_ship_inst_d_no) return doDtl_ship_inst_d_no_VC(info);
		if (vc == columnDtl_ship_alloc_sts_no) return doDtl_ship_alloc_sts_no_VC(info);
		if (vc == columnDtl_ship_act_no) return doDtl_ship_act_no_VC(info);
		if (vc == columnDtl_ship_act_d_no) return doDtl_ship_act_d_no_VC(info);
		if (vc == columnDtl_mfg_inst_no) return doDtl_mfg_inst_no_VC(info);
		if (vc == columnDtl_yield_schd_no) return doDtl_yield_schd_no_VC(info);
		if (vc == columnDtl_mfg_act_no) return doDtl_mfg_act_no_VC(info);
		if (vc == columnDtl_yield_act_no) return doDtl_yield_act_no_VC(info);
		if (vc == columnDtl_byprod_flg) return doDtl_byprod_flg_VC(info);
		if (vc == columnDtl_prnt_lcl_cd) return doDtl_prnt_lcl_cd_VC(info);
		if (vc == columnDtl_stk_lst_form_cd) return doDtl_stk_lst_form_cd_VC(info);
		if (vc == columnDtl_co_cd) return doDtl_co_cd_VC(info);
		if (vc == columnDtl_co_nm) return doDtl_co_nm_VC(info);
		if (vc == columnDtl_cst_dlv_inst_no) return doDtl_cst_dlv_inst_no_VC(info);
		if (vc == columnDtl_cst_dlv_inst_d_no) return doDtl_cst_dlv_inst_d_no_VC(info);
		if (vc == columnDtl_dlv_rqst_dt) return doDtl_dlv_rqst_dt_VC(info);
		if (vc == columnDtl_dlv_rqst_tm) return doDtl_dlv_rqst_tm_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_arr_act_sub_char1) return doDtl_arr_act_sub_char1_VC(info);
		if (vc == columnDtl_arr_act_sub_char2) return doDtl_arr_act_sub_char2_VC(info);
		if (vc == columnDtl_arr_act_sub_char3) return doDtl_arr_act_sub_char3_VC(info);
		if (vc == columnDtl_ship_act_d_sub_char1) return doDtl_ship_act_d_sub_char1_VC(info);
		if (vc == columnDtl_ship_act_d_sub_char2) return doDtl_ship_act_d_sub_char2_VC(info);
		if (vc == columnDtl_ship_act_d_sub_char3) return doDtl_ship_act_d_sub_char3_VC(info);
		if (vc == columnDtl_ship_alloc_sts_sub_char1) return doDtl_ship_alloc_sts_sub_char1_VC(info);
		if (vc == columnDtl_ship_alloc_sts_sub_char2) return doDtl_ship_alloc_sts_sub_char2_VC(info);
		if (vc == columnDtl_ship_alloc_sts_sub_char3) return doDtl_ship_alloc_sts_sub_char3_VC(info);
		if (vc == columnDtl_yield_schd_sub_char1) return doDtl_yield_schd_sub_char1_VC(info);
		if (vc == columnDtl_yield_schd_sub_char2) return doDtl_yield_schd_sub_char2_VC(info);
		if (vc == columnDtl_yield_schd_sub_char3) return doDtl_yield_schd_sub_char3_VC(info);
		if (vc == columnDtl_yield_act_sub_char1) return doDtl_yield_act_sub_char1_VC(info);
		if (vc == columnDtl_yield_act_sub_char2) return doDtl_yield_act_sub_char2_VC(info);
		if (vc == columnDtl_yield_act_sub_char3) return doDtl_yield_act_sub_char3_VC(info);
		if (vc == columnDtl_stk_sub_char1) return doDtl_stk_sub_char1_VC(info);
		if (vc == columnDtl_stk_sub_char2) return doDtl_stk_sub_char2_VC(info);
		if (vc == columnDtl_stk_sub_char3) return doDtl_stk_sub_char3_VC(info);
		if (vc == columnDtl_dlv_id_cd) return doDtl_dlv_id_cd_VC(info);
		if (vc == columnDtl_dlv_id_nm) return doDtl_dlv_id_nm_VC(info);
		if (vc == columnDtl_dlv_id_alt_nm1) return doDtl_dlv_id_alt_nm1_VC(info);
		if (vc == columnDtl_dlv_id_alt_nm2) return doDtl_dlv_id_alt_nm2_VC(info);
		if (vc == columnDtl_dlv_id_alt_nm3) return doDtl_dlv_id_alt_nm3_VC(info);
		if (vc == columnDtl_dlv_id_alt_nm4) return doDtl_dlv_id_alt_nm4_VC(info);
		if (vc == columnDtl_po_d_no) return doDtl_po_d_no_VC(info);
		if (vc == columnDtl_dlv_slip_no) return doDtl_dlv_slip_no_VC(info);
		if (vc == columnDtl_dlv_slip_d_no) return doDtl_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_arr_dpt_cd) return doDtl_arr_dpt_cd_VC(info);
		if (vc == columnDtl_arr_dpt_nm) return doDtl_arr_dpt_nm_VC(info);
		if (vc == columnDtl_arr_usr_cd) return doDtl_arr_usr_cd_VC(info);
		if (vc == columnDtl_arr_usr_nm) return doDtl_arr_usr_nm_VC(info);
		if (vc == columnDtl_acpt_dpt_cd) return doDtl_acpt_dpt_cd_VC(info);
		if (vc == columnDtl_acpt_dpt_nm) return doDtl_acpt_dpt_nm_VC(info);
		if (vc == columnDtl_acpt_usr_cd) return doDtl_acpt_usr_cd_VC(info);
		if (vc == columnDtl_acpt_usr_nm) return doDtl_acpt_usr_nm_VC(info);
		if (vc == columnDtl_lot_rmrks) return doDtl_lot_rmrks_VC(info);
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
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_alt_nm4_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[prnt_all_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prnt_all_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rmndr_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rmndr_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_lst_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_lst_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pckg_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pckg_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_cd_per_pckg_unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_cd_per_pckg_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_nm_per_pckg_unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_nm_per_pckg_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rmndr_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rmndr_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_dec_place_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_inst_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_inst_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_inst_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_inst_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_grp_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[unreg_lmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unreg_lmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lmt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[in_xfr_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_xfr_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_xfr_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_xfr_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_alloc_sts_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[yield_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_byprod_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_lst_form_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_lst_form_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[co_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_dlv_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_dlv_inst_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_rqst_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_rqst_tm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[arr_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_d_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_alloc_sts_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_alloc_sts_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_alloc_sts_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_schd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_schd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_schd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_alt_nm4_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acpt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acpt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acpt_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acpt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acpt_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acpt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_rmrks_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_itm_alt_nm1) doDtl_itm_alt_nm1_NC(info);
		else if (nc == columnDtl_itm_alt_nm2) doDtl_itm_alt_nm2_NC(info);
		else if (nc == columnDtl_itm_alt_nm3) doDtl_itm_alt_nm3_NC(info);
		else if (nc == columnDtl_itm_alt_nm4) doDtl_itm_alt_nm4_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_lot_no) doDtl_lot_no_NC(info);
		else if (nc == columnDtl_sublot_no) doDtl_sublot_no_NC(info);
		else if (nc == columnDtl_prnt_all_qty) doDtl_prnt_all_qty_NC(info);
		else if (nc == columnDtl_rmndr_prnt_flg) doDtl_rmndr_prnt_flg_NC(info);
		else if (nc == columnDtl_stk_lst_prnt_flg) doDtl_stk_lst_prnt_flg_NC(info);
		else if (nc == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_NC(info);
		else if (nc == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_NC(info);
		else if (nc == columnDtl_unit_cd_per_pckg_unit) doDtl_unit_cd_per_pckg_unit_NC(info);
		else if (nc == columnDtl_unit_nm_per_pckg_unit) doDtl_unit_nm_per_pckg_unit_NC(info);
		else if (nc == columnDtl_rmndr_unit_cd) doDtl_rmndr_unit_cd_NC(info);
		else if (nc == columnDtl_rmndr_unit_nm) doDtl_rmndr_unit_nm_NC(info);
		else if (nc == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_NC(info);
		else if (nc == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_NC(info);
		else if (nc == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_dlv_inst_unit_cd) doDtl_dlv_inst_unit_cd_NC(info);
		else if (nc == columnDtl_dlv_inst_unit_nm) doDtl_dlv_inst_unit_nm_NC(info);
		else if (nc == columnDtl_dlv_inst_unit_dec_place) doDtl_dlv_inst_unit_dec_place_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_str_ln_cd) doDtl_str_ln_cd_NC(info);
		else if (nc == columnDtl_str_ln_nm) doDtl_str_ln_nm_NC(info);
		else if (nc == columnDtl_site_cd) doDtl_site_cd_NC(info);
		else if (nc == columnDtl_site_nm) doDtl_site_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NC(info);
		else if (nc == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_NC(info);
		else if (nc == columnDtl_bp_lot_no) doDtl_bp_lot_no_NC(info);
		else if (nc == columnDtl_unreg_lmt_flg) doDtl_unreg_lmt_flg_NC(info);
		else if (nc == columnDtl_vld_dt) doDtl_vld_dt_NC(info);
		else if (nc == columnDtl_lmt_dt) doDtl_lmt_dt_NC(info);
		else if (nc == columnDtl_quality_typ) doDtl_quality_typ_NC(info);
		else if (nc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_in_xfr_typ) doDtl_in_xfr_typ_NC(info);
		else if (nc == columnDtl_in_xfr_typ_nm) doDtl_in_xfr_typ_nm_NC(info);
		else if (nc == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NC(info);
		else if (nc == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NC(info);
		else if (nc == columnDtl_asst_typ) doDtl_asst_typ_NC(info);
		else if (nc == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NC(info);
		else if (nc == columnDtl_stk_id_typ) doDtl_stk_id_typ_NC(info);
		else if (nc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NC(info);
		else if (nc == columnDtl_stk_bp_cd) doDtl_stk_bp_cd_NC(info);
		else if (nc == columnDtl_stk_bp_nm) doDtl_stk_bp_nm_NC(info);
		else if (nc == columnDtl_fix_no_typ) doDtl_fix_no_typ_NC(info);
		else if (nc == columnDtl_fix_no_typ_nm) doDtl_fix_no_typ_nm_NC(info);
		else if (nc == columnDtl_fix_no) doDtl_fix_no_NC(info);
		else if (nc == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NC(info);
		else if (nc == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NC(info);
		else if (nc == columnDtl_cst_cd) doDtl_cst_cd_NC(info);
		else if (nc == columnDtl_cst_nm) doDtl_cst_nm_NC(info);
		else if (nc == columnDtl_cst_alt_nm1) doDtl_cst_alt_nm1_NC(info);
		else if (nc == columnDtl_cst_alt_nm2) doDtl_cst_alt_nm2_NC(info);
		else if (nc == columnDtl_cst_alt_nm3) doDtl_cst_alt_nm3_NC(info);
		else if (nc == columnDtl_cst_alt_nm4) doDtl_cst_alt_nm4_NC(info);
		else if (nc == columnDtl_dlv_cd) doDtl_dlv_cd_NC(info);
		else if (nc == columnDtl_dlv_nm) doDtl_dlv_nm_NC(info);
		else if (nc == columnDtl_dlv_alt_nm1) doDtl_dlv_alt_nm1_NC(info);
		else if (nc == columnDtl_dlv_alt_nm2) doDtl_dlv_alt_nm2_NC(info);
		else if (nc == columnDtl_dlv_alt_nm3) doDtl_dlv_alt_nm3_NC(info);
		else if (nc == columnDtl_dlv_alt_nm4) doDtl_dlv_alt_nm4_NC(info);
		else if (nc == columnDtl_cst_po_no) doDtl_cst_po_no_NC(info);
		else if (nc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NC(info);
		else if (nc == columnDtl_arr_act_no) doDtl_arr_act_no_NC(info);
		else if (nc == columnDtl_ship_inst_no) doDtl_ship_inst_no_NC(info);
		else if (nc == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NC(info);
		else if (nc == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NC(info);
		else if (nc == columnDtl_ship_act_no) doDtl_ship_act_no_NC(info);
		else if (nc == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NC(info);
		else if (nc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NC(info);
		else if (nc == columnDtl_yield_schd_no) doDtl_yield_schd_no_NC(info);
		else if (nc == columnDtl_mfg_act_no) doDtl_mfg_act_no_NC(info);
		else if (nc == columnDtl_yield_act_no) doDtl_yield_act_no_NC(info);
		else if (nc == columnDtl_byprod_flg) doDtl_byprod_flg_NC(info);
		else if (nc == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NC(info);
		else if (nc == columnDtl_stk_lst_form_cd) doDtl_stk_lst_form_cd_NC(info);
		else if (nc == columnDtl_co_cd) doDtl_co_cd_NC(info);
		else if (nc == columnDtl_co_nm) doDtl_co_nm_NC(info);
		else if (nc == columnDtl_cst_dlv_inst_no) doDtl_cst_dlv_inst_no_NC(info);
		else if (nc == columnDtl_cst_dlv_inst_d_no) doDtl_cst_dlv_inst_d_no_NC(info);
		else if (nc == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_NC(info);
		else if (nc == columnDtl_dlv_rqst_tm) doDtl_dlv_rqst_tm_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_arr_act_sub_char1) doDtl_arr_act_sub_char1_NC(info);
		else if (nc == columnDtl_arr_act_sub_char2) doDtl_arr_act_sub_char2_NC(info);
		else if (nc == columnDtl_arr_act_sub_char3) doDtl_arr_act_sub_char3_NC(info);
		else if (nc == columnDtl_ship_act_d_sub_char1) doDtl_ship_act_d_sub_char1_NC(info);
		else if (nc == columnDtl_ship_act_d_sub_char2) doDtl_ship_act_d_sub_char2_NC(info);
		else if (nc == columnDtl_ship_act_d_sub_char3) doDtl_ship_act_d_sub_char3_NC(info);
		else if (nc == columnDtl_ship_alloc_sts_sub_char1) doDtl_ship_alloc_sts_sub_char1_NC(info);
		else if (nc == columnDtl_ship_alloc_sts_sub_char2) doDtl_ship_alloc_sts_sub_char2_NC(info);
		else if (nc == columnDtl_ship_alloc_sts_sub_char3) doDtl_ship_alloc_sts_sub_char3_NC(info);
		else if (nc == columnDtl_yield_schd_sub_char1) doDtl_yield_schd_sub_char1_NC(info);
		else if (nc == columnDtl_yield_schd_sub_char2) doDtl_yield_schd_sub_char2_NC(info);
		else if (nc == columnDtl_yield_schd_sub_char3) doDtl_yield_schd_sub_char3_NC(info);
		else if (nc == columnDtl_yield_act_sub_char1) doDtl_yield_act_sub_char1_NC(info);
		else if (nc == columnDtl_yield_act_sub_char2) doDtl_yield_act_sub_char2_NC(info);
		else if (nc == columnDtl_yield_act_sub_char3) doDtl_yield_act_sub_char3_NC(info);
		else if (nc == columnDtl_stk_sub_char1) doDtl_stk_sub_char1_NC(info);
		else if (nc == columnDtl_stk_sub_char2) doDtl_stk_sub_char2_NC(info);
		else if (nc == columnDtl_stk_sub_char3) doDtl_stk_sub_char3_NC(info);
		else if (nc == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_NC(info);
		else if (nc == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_NC(info);
		else if (nc == columnDtl_dlv_id_alt_nm1) doDtl_dlv_id_alt_nm1_NC(info);
		else if (nc == columnDtl_dlv_id_alt_nm2) doDtl_dlv_id_alt_nm2_NC(info);
		else if (nc == columnDtl_dlv_id_alt_nm3) doDtl_dlv_id_alt_nm3_NC(info);
		else if (nc == columnDtl_dlv_id_alt_nm4) doDtl_dlv_id_alt_nm4_NC(info);
		else if (nc == columnDtl_po_d_no) doDtl_po_d_no_NC(info);
		else if (nc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NC(info);
		else if (nc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_arr_dpt_cd) doDtl_arr_dpt_cd_NC(info);
		else if (nc == columnDtl_arr_dpt_nm) doDtl_arr_dpt_nm_NC(info);
		else if (nc == columnDtl_arr_usr_cd) doDtl_arr_usr_cd_NC(info);
		else if (nc == columnDtl_arr_usr_nm) doDtl_arr_usr_nm_NC(info);
		else if (nc == columnDtl_acpt_dpt_cd) doDtl_acpt_dpt_cd_NC(info);
		else if (nc == columnDtl_acpt_dpt_nm) doDtl_acpt_dpt_nm_NC(info);
		else if (nc == columnDtl_acpt_usr_cd) doDtl_acpt_usr_cd_NC(info);
		else if (nc == columnDtl_acpt_usr_nm) doDtl_acpt_usr_nm_NC(info);
		else if (nc == columnDtl_lot_rmrks) doDtl_lot_rmrks_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm4_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[prnt_all_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_all_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd_per_pckg_unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_per_pckg_unit_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm_per_pckg_unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_per_pckg_unit_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_inst_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unreg_lmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unreg_lmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[in_xfr_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_xfr_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_xfr_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_xfr_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_form_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_form_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_tm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_rmrks_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_itm_alt_nm1) doDtl_itm_alt_nm1_NE(info);
		else if (ne == columnDtl_itm_alt_nm2) doDtl_itm_alt_nm2_NE(info);
		else if (ne == columnDtl_itm_alt_nm3) doDtl_itm_alt_nm3_NE(info);
		else if (ne == columnDtl_itm_alt_nm4) doDtl_itm_alt_nm4_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_lot_no) doDtl_lot_no_NE(info);
		else if (ne == columnDtl_sublot_no) doDtl_sublot_no_NE(info);
		else if (ne == columnDtl_prnt_all_qty) doDtl_prnt_all_qty_NE(info);
		else if (ne == columnDtl_rmndr_prnt_flg) doDtl_rmndr_prnt_flg_NE(info);
		else if (ne == columnDtl_stk_lst_prnt_flg) doDtl_stk_lst_prnt_flg_NE(info);
		else if (ne == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_NE(info);
		else if (ne == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_NE(info);
		else if (ne == columnDtl_unit_cd_per_pckg_unit) doDtl_unit_cd_per_pckg_unit_NE(info);
		else if (ne == columnDtl_unit_nm_per_pckg_unit) doDtl_unit_nm_per_pckg_unit_NE(info);
		else if (ne == columnDtl_rmndr_unit_cd) doDtl_rmndr_unit_cd_NE(info);
		else if (ne == columnDtl_rmndr_unit_nm) doDtl_rmndr_unit_nm_NE(info);
		else if (ne == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_NE(info);
		else if (ne == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_NE(info);
		else if (ne == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_dlv_inst_unit_cd) doDtl_dlv_inst_unit_cd_NE(info);
		else if (ne == columnDtl_dlv_inst_unit_nm) doDtl_dlv_inst_unit_nm_NE(info);
		else if (ne == columnDtl_dlv_inst_unit_dec_place) doDtl_dlv_inst_unit_dec_place_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_str_ln_cd) doDtl_str_ln_cd_NE(info);
		else if (ne == columnDtl_str_ln_nm) doDtl_str_ln_nm_NE(info);
		else if (ne == columnDtl_site_cd) doDtl_site_cd_NE(info);
		else if (ne == columnDtl_site_nm) doDtl_site_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NE(info);
		else if (ne == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_NE(info);
		else if (ne == columnDtl_bp_lot_no) doDtl_bp_lot_no_NE(info);
		else if (ne == columnDtl_unreg_lmt_flg) doDtl_unreg_lmt_flg_NE(info);
		else if (ne == columnDtl_vld_dt) doDtl_vld_dt_NE(info);
		else if (ne == columnDtl_lmt_dt) doDtl_lmt_dt_NE(info);
		else if (ne == columnDtl_quality_typ) doDtl_quality_typ_NE(info);
		else if (ne == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_in_xfr_typ) doDtl_in_xfr_typ_NE(info);
		else if (ne == columnDtl_in_xfr_typ_nm) doDtl_in_xfr_typ_nm_NE(info);
		else if (ne == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NE(info);
		else if (ne == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NE(info);
		else if (ne == columnDtl_asst_typ) doDtl_asst_typ_NE(info);
		else if (ne == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NE(info);
		else if (ne == columnDtl_stk_id_typ) doDtl_stk_id_typ_NE(info);
		else if (ne == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NE(info);
		else if (ne == columnDtl_stk_bp_cd) doDtl_stk_bp_cd_NE(info);
		else if (ne == columnDtl_stk_bp_nm) doDtl_stk_bp_nm_NE(info);
		else if (ne == columnDtl_fix_no_typ) doDtl_fix_no_typ_NE(info);
		else if (ne == columnDtl_fix_no_typ_nm) doDtl_fix_no_typ_nm_NE(info);
		else if (ne == columnDtl_fix_no) doDtl_fix_no_NE(info);
		else if (ne == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NE(info);
		else if (ne == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NE(info);
		else if (ne == columnDtl_cst_cd) doDtl_cst_cd_NE(info);
		else if (ne == columnDtl_cst_nm) doDtl_cst_nm_NE(info);
		else if (ne == columnDtl_cst_alt_nm1) doDtl_cst_alt_nm1_NE(info);
		else if (ne == columnDtl_cst_alt_nm2) doDtl_cst_alt_nm2_NE(info);
		else if (ne == columnDtl_cst_alt_nm3) doDtl_cst_alt_nm3_NE(info);
		else if (ne == columnDtl_cst_alt_nm4) doDtl_cst_alt_nm4_NE(info);
		else if (ne == columnDtl_dlv_cd) doDtl_dlv_cd_NE(info);
		else if (ne == columnDtl_dlv_nm) doDtl_dlv_nm_NE(info);
		else if (ne == columnDtl_dlv_alt_nm1) doDtl_dlv_alt_nm1_NE(info);
		else if (ne == columnDtl_dlv_alt_nm2) doDtl_dlv_alt_nm2_NE(info);
		else if (ne == columnDtl_dlv_alt_nm3) doDtl_dlv_alt_nm3_NE(info);
		else if (ne == columnDtl_dlv_alt_nm4) doDtl_dlv_alt_nm4_NE(info);
		else if (ne == columnDtl_cst_po_no) doDtl_cst_po_no_NE(info);
		else if (ne == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NE(info);
		else if (ne == columnDtl_arr_act_no) doDtl_arr_act_no_NE(info);
		else if (ne == columnDtl_ship_inst_no) doDtl_ship_inst_no_NE(info);
		else if (ne == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NE(info);
		else if (ne == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NE(info);
		else if (ne == columnDtl_ship_act_no) doDtl_ship_act_no_NE(info);
		else if (ne == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NE(info);
		else if (ne == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NE(info);
		else if (ne == columnDtl_yield_schd_no) doDtl_yield_schd_no_NE(info);
		else if (ne == columnDtl_mfg_act_no) doDtl_mfg_act_no_NE(info);
		else if (ne == columnDtl_yield_act_no) doDtl_yield_act_no_NE(info);
		else if (ne == columnDtl_byprod_flg) doDtl_byprod_flg_NE(info);
		else if (ne == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NE(info);
		else if (ne == columnDtl_stk_lst_form_cd) doDtl_stk_lst_form_cd_NE(info);
		else if (ne == columnDtl_co_cd) doDtl_co_cd_NE(info);
		else if (ne == columnDtl_co_nm) doDtl_co_nm_NE(info);
		else if (ne == columnDtl_cst_dlv_inst_no) doDtl_cst_dlv_inst_no_NE(info);
		else if (ne == columnDtl_cst_dlv_inst_d_no) doDtl_cst_dlv_inst_d_no_NE(info);
		else if (ne == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_NE(info);
		else if (ne == columnDtl_dlv_rqst_tm) doDtl_dlv_rqst_tm_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_arr_act_sub_char1) doDtl_arr_act_sub_char1_NE(info);
		else if (ne == columnDtl_arr_act_sub_char2) doDtl_arr_act_sub_char2_NE(info);
		else if (ne == columnDtl_arr_act_sub_char3) doDtl_arr_act_sub_char3_NE(info);
		else if (ne == columnDtl_ship_act_d_sub_char1) doDtl_ship_act_d_sub_char1_NE(info);
		else if (ne == columnDtl_ship_act_d_sub_char2) doDtl_ship_act_d_sub_char2_NE(info);
		else if (ne == columnDtl_ship_act_d_sub_char3) doDtl_ship_act_d_sub_char3_NE(info);
		else if (ne == columnDtl_ship_alloc_sts_sub_char1) doDtl_ship_alloc_sts_sub_char1_NE(info);
		else if (ne == columnDtl_ship_alloc_sts_sub_char2) doDtl_ship_alloc_sts_sub_char2_NE(info);
		else if (ne == columnDtl_ship_alloc_sts_sub_char3) doDtl_ship_alloc_sts_sub_char3_NE(info);
		else if (ne == columnDtl_yield_schd_sub_char1) doDtl_yield_schd_sub_char1_NE(info);
		else if (ne == columnDtl_yield_schd_sub_char2) doDtl_yield_schd_sub_char2_NE(info);
		else if (ne == columnDtl_yield_schd_sub_char3) doDtl_yield_schd_sub_char3_NE(info);
		else if (ne == columnDtl_yield_act_sub_char1) doDtl_yield_act_sub_char1_NE(info);
		else if (ne == columnDtl_yield_act_sub_char2) doDtl_yield_act_sub_char2_NE(info);
		else if (ne == columnDtl_yield_act_sub_char3) doDtl_yield_act_sub_char3_NE(info);
		else if (ne == columnDtl_stk_sub_char1) doDtl_stk_sub_char1_NE(info);
		else if (ne == columnDtl_stk_sub_char2) doDtl_stk_sub_char2_NE(info);
		else if (ne == columnDtl_stk_sub_char3) doDtl_stk_sub_char3_NE(info);
		else if (ne == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_NE(info);
		else if (ne == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_NE(info);
		else if (ne == columnDtl_dlv_id_alt_nm1) doDtl_dlv_id_alt_nm1_NE(info);
		else if (ne == columnDtl_dlv_id_alt_nm2) doDtl_dlv_id_alt_nm2_NE(info);
		else if (ne == columnDtl_dlv_id_alt_nm3) doDtl_dlv_id_alt_nm3_NE(info);
		else if (ne == columnDtl_dlv_id_alt_nm4) doDtl_dlv_id_alt_nm4_NE(info);
		else if (ne == columnDtl_po_d_no) doDtl_po_d_no_NE(info);
		else if (ne == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NE(info);
		else if (ne == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_arr_dpt_cd) doDtl_arr_dpt_cd_NE(info);
		else if (ne == columnDtl_arr_dpt_nm) doDtl_arr_dpt_nm_NE(info);
		else if (ne == columnDtl_arr_usr_cd) doDtl_arr_usr_cd_NE(info);
		else if (ne == columnDtl_arr_usr_nm) doDtl_arr_usr_nm_NE(info);
		else if (ne == columnDtl_acpt_dpt_cd) doDtl_acpt_dpt_cd_NE(info);
		else if (ne == columnDtl_acpt_dpt_nm) doDtl_acpt_dpt_nm_NE(info);
		else if (ne == columnDtl_acpt_usr_cd) doDtl_acpt_usr_cd_NE(info);
		else if (ne == columnDtl_acpt_usr_nm) doDtl_acpt_usr_nm_NE(info);
		else if (ne == columnDtl_lot_rmrks) doDtl_lot_rmrks_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm4_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[prnt_all_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_all_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd_per_pckg_unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_per_pckg_unit_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm_per_pckg_unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_per_pckg_unit_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_inst_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unreg_lmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unreg_lmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[in_xfr_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_xfr_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_xfr_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_xfr_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_form_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_form_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_tm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_rmrks_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_itm_alt_nm1) doDtl_itm_alt_nm1_NX(info);
		else if (nx == columnDtl_itm_alt_nm2) doDtl_itm_alt_nm2_NX(info);
		else if (nx == columnDtl_itm_alt_nm3) doDtl_itm_alt_nm3_NX(info);
		else if (nx == columnDtl_itm_alt_nm4) doDtl_itm_alt_nm4_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_lot_no) doDtl_lot_no_NX(info);
		else if (nx == columnDtl_sublot_no) doDtl_sublot_no_NX(info);
		else if (nx == columnDtl_prnt_all_qty) doDtl_prnt_all_qty_NX(info);
		else if (nx == columnDtl_rmndr_prnt_flg) doDtl_rmndr_prnt_flg_NX(info);
		else if (nx == columnDtl_stk_lst_prnt_flg) doDtl_stk_lst_prnt_flg_NX(info);
		else if (nx == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_NX(info);
		else if (nx == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_NX(info);
		else if (nx == columnDtl_unit_cd_per_pckg_unit) doDtl_unit_cd_per_pckg_unit_NX(info);
		else if (nx == columnDtl_unit_nm_per_pckg_unit) doDtl_unit_nm_per_pckg_unit_NX(info);
		else if (nx == columnDtl_rmndr_unit_cd) doDtl_rmndr_unit_cd_NX(info);
		else if (nx == columnDtl_rmndr_unit_nm) doDtl_rmndr_unit_nm_NX(info);
		else if (nx == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_NX(info);
		else if (nx == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_NX(info);
		else if (nx == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_dlv_inst_unit_cd) doDtl_dlv_inst_unit_cd_NX(info);
		else if (nx == columnDtl_dlv_inst_unit_nm) doDtl_dlv_inst_unit_nm_NX(info);
		else if (nx == columnDtl_dlv_inst_unit_dec_place) doDtl_dlv_inst_unit_dec_place_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_str_ln_cd) doDtl_str_ln_cd_NX(info);
		else if (nx == columnDtl_str_ln_nm) doDtl_str_ln_nm_NX(info);
		else if (nx == columnDtl_site_cd) doDtl_site_cd_NX(info);
		else if (nx == columnDtl_site_nm) doDtl_site_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NX(info);
		else if (nx == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_NX(info);
		else if (nx == columnDtl_bp_lot_no) doDtl_bp_lot_no_NX(info);
		else if (nx == columnDtl_unreg_lmt_flg) doDtl_unreg_lmt_flg_NX(info);
		else if (nx == columnDtl_vld_dt) doDtl_vld_dt_NX(info);
		else if (nx == columnDtl_lmt_dt) doDtl_lmt_dt_NX(info);
		else if (nx == columnDtl_quality_typ) doDtl_quality_typ_NX(info);
		else if (nx == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_in_xfr_typ) doDtl_in_xfr_typ_NX(info);
		else if (nx == columnDtl_in_xfr_typ_nm) doDtl_in_xfr_typ_nm_NX(info);
		else if (nx == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NX(info);
		else if (nx == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NX(info);
		else if (nx == columnDtl_asst_typ) doDtl_asst_typ_NX(info);
		else if (nx == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NX(info);
		else if (nx == columnDtl_stk_id_typ) doDtl_stk_id_typ_NX(info);
		else if (nx == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NX(info);
		else if (nx == columnDtl_stk_bp_cd) doDtl_stk_bp_cd_NX(info);
		else if (nx == columnDtl_stk_bp_nm) doDtl_stk_bp_nm_NX(info);
		else if (nx == columnDtl_fix_no_typ) doDtl_fix_no_typ_NX(info);
		else if (nx == columnDtl_fix_no_typ_nm) doDtl_fix_no_typ_nm_NX(info);
		else if (nx == columnDtl_fix_no) doDtl_fix_no_NX(info);
		else if (nx == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NX(info);
		else if (nx == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NX(info);
		else if (nx == columnDtl_cst_cd) doDtl_cst_cd_NX(info);
		else if (nx == columnDtl_cst_nm) doDtl_cst_nm_NX(info);
		else if (nx == columnDtl_cst_alt_nm1) doDtl_cst_alt_nm1_NX(info);
		else if (nx == columnDtl_cst_alt_nm2) doDtl_cst_alt_nm2_NX(info);
		else if (nx == columnDtl_cst_alt_nm3) doDtl_cst_alt_nm3_NX(info);
		else if (nx == columnDtl_cst_alt_nm4) doDtl_cst_alt_nm4_NX(info);
		else if (nx == columnDtl_dlv_cd) doDtl_dlv_cd_NX(info);
		else if (nx == columnDtl_dlv_nm) doDtl_dlv_nm_NX(info);
		else if (nx == columnDtl_dlv_alt_nm1) doDtl_dlv_alt_nm1_NX(info);
		else if (nx == columnDtl_dlv_alt_nm2) doDtl_dlv_alt_nm2_NX(info);
		else if (nx == columnDtl_dlv_alt_nm3) doDtl_dlv_alt_nm3_NX(info);
		else if (nx == columnDtl_dlv_alt_nm4) doDtl_dlv_alt_nm4_NX(info);
		else if (nx == columnDtl_cst_po_no) doDtl_cst_po_no_NX(info);
		else if (nx == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NX(info);
		else if (nx == columnDtl_arr_act_no) doDtl_arr_act_no_NX(info);
		else if (nx == columnDtl_ship_inst_no) doDtl_ship_inst_no_NX(info);
		else if (nx == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NX(info);
		else if (nx == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NX(info);
		else if (nx == columnDtl_ship_act_no) doDtl_ship_act_no_NX(info);
		else if (nx == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NX(info);
		else if (nx == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NX(info);
		else if (nx == columnDtl_yield_schd_no) doDtl_yield_schd_no_NX(info);
		else if (nx == columnDtl_mfg_act_no) doDtl_mfg_act_no_NX(info);
		else if (nx == columnDtl_yield_act_no) doDtl_yield_act_no_NX(info);
		else if (nx == columnDtl_byprod_flg) doDtl_byprod_flg_NX(info);
		else if (nx == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NX(info);
		else if (nx == columnDtl_stk_lst_form_cd) doDtl_stk_lst_form_cd_NX(info);
		else if (nx == columnDtl_co_cd) doDtl_co_cd_NX(info);
		else if (nx == columnDtl_co_nm) doDtl_co_nm_NX(info);
		else if (nx == columnDtl_cst_dlv_inst_no) doDtl_cst_dlv_inst_no_NX(info);
		else if (nx == columnDtl_cst_dlv_inst_d_no) doDtl_cst_dlv_inst_d_no_NX(info);
		else if (nx == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_NX(info);
		else if (nx == columnDtl_dlv_rqst_tm) doDtl_dlv_rqst_tm_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_arr_act_sub_char1) doDtl_arr_act_sub_char1_NX(info);
		else if (nx == columnDtl_arr_act_sub_char2) doDtl_arr_act_sub_char2_NX(info);
		else if (nx == columnDtl_arr_act_sub_char3) doDtl_arr_act_sub_char3_NX(info);
		else if (nx == columnDtl_ship_act_d_sub_char1) doDtl_ship_act_d_sub_char1_NX(info);
		else if (nx == columnDtl_ship_act_d_sub_char2) doDtl_ship_act_d_sub_char2_NX(info);
		else if (nx == columnDtl_ship_act_d_sub_char3) doDtl_ship_act_d_sub_char3_NX(info);
		else if (nx == columnDtl_ship_alloc_sts_sub_char1) doDtl_ship_alloc_sts_sub_char1_NX(info);
		else if (nx == columnDtl_ship_alloc_sts_sub_char2) doDtl_ship_alloc_sts_sub_char2_NX(info);
		else if (nx == columnDtl_ship_alloc_sts_sub_char3) doDtl_ship_alloc_sts_sub_char3_NX(info);
		else if (nx == columnDtl_yield_schd_sub_char1) doDtl_yield_schd_sub_char1_NX(info);
		else if (nx == columnDtl_yield_schd_sub_char2) doDtl_yield_schd_sub_char2_NX(info);
		else if (nx == columnDtl_yield_schd_sub_char3) doDtl_yield_schd_sub_char3_NX(info);
		else if (nx == columnDtl_yield_act_sub_char1) doDtl_yield_act_sub_char1_NX(info);
		else if (nx == columnDtl_yield_act_sub_char2) doDtl_yield_act_sub_char2_NX(info);
		else if (nx == columnDtl_yield_act_sub_char3) doDtl_yield_act_sub_char3_NX(info);
		else if (nx == columnDtl_stk_sub_char1) doDtl_stk_sub_char1_NX(info);
		else if (nx == columnDtl_stk_sub_char2) doDtl_stk_sub_char2_NX(info);
		else if (nx == columnDtl_stk_sub_char3) doDtl_stk_sub_char3_NX(info);
		else if (nx == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_NX(info);
		else if (nx == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_NX(info);
		else if (nx == columnDtl_dlv_id_alt_nm1) doDtl_dlv_id_alt_nm1_NX(info);
		else if (nx == columnDtl_dlv_id_alt_nm2) doDtl_dlv_id_alt_nm2_NX(info);
		else if (nx == columnDtl_dlv_id_alt_nm3) doDtl_dlv_id_alt_nm3_NX(info);
		else if (nx == columnDtl_dlv_id_alt_nm4) doDtl_dlv_id_alt_nm4_NX(info);
		else if (nx == columnDtl_po_d_no) doDtl_po_d_no_NX(info);
		else if (nx == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NX(info);
		else if (nx == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_arr_dpt_cd) doDtl_arr_dpt_cd_NX(info);
		else if (nx == columnDtl_arr_dpt_nm) doDtl_arr_dpt_nm_NX(info);
		else if (nx == columnDtl_arr_usr_cd) doDtl_arr_usr_cd_NX(info);
		else if (nx == columnDtl_arr_usr_nm) doDtl_arr_usr_nm_NX(info);
		else if (nx == columnDtl_acpt_dpt_cd) doDtl_acpt_dpt_cd_NX(info);
		else if (nx == columnDtl_acpt_dpt_nm) doDtl_acpt_dpt_nm_NX(info);
		else if (nx == columnDtl_acpt_usr_cd) doDtl_acpt_usr_cd_NX(info);
		else if (nx == columnDtl_acpt_usr_nm) doDtl_acpt_usr_nm_NX(info);
		else if (nx == columnDtl_lot_rmrks) doDtl_lot_rmrks_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm4_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[prnt_all_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_all_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd_per_pckg_unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_per_pckg_unit_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm_per_pckg_unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_per_pckg_unit_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_inst_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unreg_lmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unreg_lmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[in_xfr_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_xfr_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_xfr_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_xfr_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_form_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_form_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_tm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_itm_alt_nm1) doDtl_itm_alt_nm1_LC(info);
		else if (lc == columnDtl_itm_alt_nm2) doDtl_itm_alt_nm2_LC(info);
		else if (lc == columnDtl_itm_alt_nm3) doDtl_itm_alt_nm3_LC(info);
		else if (lc == columnDtl_itm_alt_nm4) doDtl_itm_alt_nm4_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_lot_no) doDtl_lot_no_LC(info);
		else if (lc == columnDtl_sublot_no) doDtl_sublot_no_LC(info);
		else if (lc == columnDtl_prnt_all_qty) doDtl_prnt_all_qty_LC(info);
		else if (lc == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_LC(info);
		else if (lc == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_LC(info);
		else if (lc == columnDtl_unit_cd_per_pckg_unit) doDtl_unit_cd_per_pckg_unit_LC(info);
		else if (lc == columnDtl_unit_nm_per_pckg_unit) doDtl_unit_nm_per_pckg_unit_LC(info);
		else if (lc == columnDtl_rmndr_unit_cd) doDtl_rmndr_unit_cd_LC(info);
		else if (lc == columnDtl_rmndr_unit_nm) doDtl_rmndr_unit_nm_LC(info);
		else if (lc == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_LC(info);
		else if (lc == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_LC(info);
		else if (lc == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_dlv_inst_unit_cd) doDtl_dlv_inst_unit_cd_LC(info);
		else if (lc == columnDtl_dlv_inst_unit_nm) doDtl_dlv_inst_unit_nm_LC(info);
		else if (lc == columnDtl_dlv_inst_unit_dec_place) doDtl_dlv_inst_unit_dec_place_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_str_ln_cd) doDtl_str_ln_cd_LC(info);
		else if (lc == columnDtl_str_ln_nm) doDtl_str_ln_nm_LC(info);
		else if (lc == columnDtl_site_cd) doDtl_site_cd_LC(info);
		else if (lc == columnDtl_site_nm) doDtl_site_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_LC(info);
		else if (lc == columnDtl_loc_grp_nm) doDtl_loc_grp_nm_LC(info);
		else if (lc == columnDtl_bp_lot_no) doDtl_bp_lot_no_LC(info);
		else if (lc == columnDtl_vld_dt) doDtl_vld_dt_LC(info);
		else if (lc == columnDtl_lmt_dt) doDtl_lmt_dt_LC(info);
		else if (lc == columnDtl_quality_typ) doDtl_quality_typ_LC(info);
		else if (lc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_in_xfr_typ) doDtl_in_xfr_typ_LC(info);
		else if (lc == columnDtl_in_xfr_typ_nm) doDtl_in_xfr_typ_nm_LC(info);
		else if (lc == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_LC(info);
		else if (lc == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_LC(info);
		else if (lc == columnDtl_asst_typ) doDtl_asst_typ_LC(info);
		else if (lc == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_LC(info);
		else if (lc == columnDtl_stk_id_typ) doDtl_stk_id_typ_LC(info);
		else if (lc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_LC(info);
		else if (lc == columnDtl_stk_bp_cd) doDtl_stk_bp_cd_LC(info);
		else if (lc == columnDtl_stk_bp_nm) doDtl_stk_bp_nm_LC(info);
		else if (lc == columnDtl_fix_no_typ) doDtl_fix_no_typ_LC(info);
		else if (lc == columnDtl_fix_no_typ_nm) doDtl_fix_no_typ_nm_LC(info);
		else if (lc == columnDtl_fix_no) doDtl_fix_no_LC(info);
		else if (lc == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_LC(info);
		else if (lc == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_LC(info);
		else if (lc == columnDtl_cst_cd) doDtl_cst_cd_LC(info);
		else if (lc == columnDtl_cst_nm) doDtl_cst_nm_LC(info);
		else if (lc == columnDtl_cst_alt_nm1) doDtl_cst_alt_nm1_LC(info);
		else if (lc == columnDtl_cst_alt_nm2) doDtl_cst_alt_nm2_LC(info);
		else if (lc == columnDtl_cst_alt_nm3) doDtl_cst_alt_nm3_LC(info);
		else if (lc == columnDtl_cst_alt_nm4) doDtl_cst_alt_nm4_LC(info);
		else if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		else if (lc == columnDtl_dlv_nm) doDtl_dlv_nm_LC(info);
		else if (lc == columnDtl_dlv_alt_nm1) doDtl_dlv_alt_nm1_LC(info);
		else if (lc == columnDtl_dlv_alt_nm2) doDtl_dlv_alt_nm2_LC(info);
		else if (lc == columnDtl_dlv_alt_nm3) doDtl_dlv_alt_nm3_LC(info);
		else if (lc == columnDtl_dlv_alt_nm4) doDtl_dlv_alt_nm4_LC(info);
		else if (lc == columnDtl_cst_po_no) doDtl_cst_po_no_LC(info);
		else if (lc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_LC(info);
		else if (lc == columnDtl_arr_act_no) doDtl_arr_act_no_LC(info);
		else if (lc == columnDtl_ship_inst_no) doDtl_ship_inst_no_LC(info);
		else if (lc == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_LC(info);
		else if (lc == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_LC(info);
		else if (lc == columnDtl_ship_act_no) doDtl_ship_act_no_LC(info);
		else if (lc == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_LC(info);
		else if (lc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_LC(info);
		else if (lc == columnDtl_yield_schd_no) doDtl_yield_schd_no_LC(info);
		else if (lc == columnDtl_mfg_act_no) doDtl_mfg_act_no_LC(info);
		else if (lc == columnDtl_yield_act_no) doDtl_yield_act_no_LC(info);
		else if (lc == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_LC(info);
		else if (lc == columnDtl_stk_lst_form_cd) doDtl_stk_lst_form_cd_LC(info);
		else if (lc == columnDtl_co_cd) doDtl_co_cd_LC(info);
		else if (lc == columnDtl_co_nm) doDtl_co_nm_LC(info);
		else if (lc == columnDtl_cst_dlv_inst_no) doDtl_cst_dlv_inst_no_LC(info);
		else if (lc == columnDtl_cst_dlv_inst_d_no) doDtl_cst_dlv_inst_d_no_LC(info);
		else if (lc == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_LC(info);
		else if (lc == columnDtl_dlv_rqst_tm) doDtl_dlv_rqst_tm_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_arr_act_sub_char1) doDtl_arr_act_sub_char1_LC(info);
		else if (lc == columnDtl_arr_act_sub_char2) doDtl_arr_act_sub_char2_LC(info);
		else if (lc == columnDtl_arr_act_sub_char3) doDtl_arr_act_sub_char3_LC(info);
		else if (lc == columnDtl_ship_act_d_sub_char1) doDtl_ship_act_d_sub_char1_LC(info);
		else if (lc == columnDtl_ship_act_d_sub_char2) doDtl_ship_act_d_sub_char2_LC(info);
		else if (lc == columnDtl_ship_act_d_sub_char3) doDtl_ship_act_d_sub_char3_LC(info);
		else if (lc == columnDtl_ship_alloc_sts_sub_char1) doDtl_ship_alloc_sts_sub_char1_LC(info);
		else if (lc == columnDtl_ship_alloc_sts_sub_char2) doDtl_ship_alloc_sts_sub_char2_LC(info);
		else if (lc == columnDtl_ship_alloc_sts_sub_char3) doDtl_ship_alloc_sts_sub_char3_LC(info);
		else if (lc == columnDtl_yield_schd_sub_char1) doDtl_yield_schd_sub_char1_LC(info);
		else if (lc == columnDtl_yield_schd_sub_char2) doDtl_yield_schd_sub_char2_LC(info);
		else if (lc == columnDtl_yield_schd_sub_char3) doDtl_yield_schd_sub_char3_LC(info);
		else if (lc == columnDtl_yield_act_sub_char1) doDtl_yield_act_sub_char1_LC(info);
		else if (lc == columnDtl_yield_act_sub_char2) doDtl_yield_act_sub_char2_LC(info);
		else if (lc == columnDtl_yield_act_sub_char3) doDtl_yield_act_sub_char3_LC(info);
		else if (lc == columnDtl_stk_sub_char1) doDtl_stk_sub_char1_LC(info);
		else if (lc == columnDtl_stk_sub_char2) doDtl_stk_sub_char2_LC(info);
		else if (lc == columnDtl_stk_sub_char3) doDtl_stk_sub_char3_LC(info);
		else if (lc == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_LC(info);
		else if (lc == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_LC(info);
		else if (lc == columnDtl_dlv_id_alt_nm1) doDtl_dlv_id_alt_nm1_LC(info);
		else if (lc == columnDtl_dlv_id_alt_nm2) doDtl_dlv_id_alt_nm2_LC(info);
		else if (lc == columnDtl_dlv_id_alt_nm3) doDtl_dlv_id_alt_nm3_LC(info);
		else if (lc == columnDtl_dlv_id_alt_nm4) doDtl_dlv_id_alt_nm4_LC(info);
		else if (lc == columnDtl_po_d_no) doDtl_po_d_no_LC(info);
		else if (lc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_LC(info);
		else if (lc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_arr_dpt_cd) doDtl_arr_dpt_cd_LC(info);
		else if (lc == columnDtl_arr_dpt_nm) doDtl_arr_dpt_nm_LC(info);
		else if (lc == columnDtl_arr_usr_cd) doDtl_arr_usr_cd_LC(info);
		else if (lc == columnDtl_arr_usr_nm) doDtl_arr_usr_nm_LC(info);
		else if (lc == columnDtl_acpt_dpt_cd) doDtl_acpt_dpt_cd_LC(info);
		else if (lc == columnDtl_acpt_dpt_nm) doDtl_acpt_dpt_nm_LC(info);
		else if (lc == columnDtl_acpt_usr_cd) doDtl_acpt_usr_cd_LC(info);
		else if (lc == columnDtl_acpt_usr_nm) doDtl_acpt_usr_nm_LC(info);
		else if (lc == columnDtl_lot_rmrks) doDtl_lot_rmrks_LC(info);
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alt_nm4_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[prnt_all_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_all_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd_per_pckg_unit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_per_pckg_unit_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm_per_pckg_unit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_per_pckg_unit_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rmndr_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rmndr_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_inst_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[in_xfr_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_xfr_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_xfr_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_xfr_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_form_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_form_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_tm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_schd_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_schd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acpt_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acpt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sublot_no]の作成メソッド
	 */
	public MCList getDtl_sublot_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pckg_unit_cd]の作成メソッド
	 */
	public MCList getDtl_pckg_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_unit_cd_per_pckg_unit]の作成メソッド
	 */
	public MCList getDtl_unit_cd_per_pckg_unit(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rmndr_unit_cd]の作成メソッド
	 */
	public MCList getDtl_rmndr_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pack_unit_cd]の作成メソッド
	 */
	public MCList getDtl_pack_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_base_unit_cd]の作成メソッド
	 */
	public MCList getDtl_base_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dlv_inst_unit_cd]の作成メソッド
	 */
	public MCList getDtl_dlv_inst_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_loc_cd]の作成メソッド
	 */
	public MCList getDtl_loc_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_str_ln_cd]の作成メソッド
	 */
	public MCList getDtl_str_ln_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_site_cd]の作成メソッド
	 */
	public MCList getDtl_site_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_loc_grp_cd]の作成メソッド
	 */
	public MCList getDtl_loc_grp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_quality_typ]の作成メソッド
	 */
	public MCList getDtl_quality_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_gd_cd]の作成メソッド
	 */
	public MCList getDtl_gd_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_in_xfr_typ]の作成メソッド
	 */
	public MCList getDtl_in_xfr_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_stk_insp_typ]の作成メソッド
	 */
	public MCList getDtl_stk_insp_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_stk_id_typ]の作成メソッド
	 */
	public MCList getDtl_stk_id_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_stk_bp_cd]の作成メソッド
	 */
	public MCList getDtl_stk_bp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_fix_no_typ]の作成メソッド
	 */
	public MCList getDtl_fix_no_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getDtl_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cst_cd]の作成メソッド
	 */
	public MCList getDtl_cst_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dlv_cd]の作成メソッド
	 */
	public MCList getDtl_dlv_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cst_po_no]の作成メソッド
	 */
	public MCList getDtl_cst_po_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_arr_act_no]の作成メソッド
	 */
	public MCList getDtl_arr_act_no(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL0110.Srch01")) {
			return new MS_MSBEL0110_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL0110.Prnt01")) {
			return new MS_MSBEL0110_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0110_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0110_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL0110_Srch01Bridge() {
			p_MS_MSBEL0110_Srch01 = new MCParam(PDef.MS_MSBEL0110_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0110_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP0110.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0110.DtlR.class));

			p_MS_MSBEL0110_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0110_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0110_Srch01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0110_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0110_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP0110.DtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP0110.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0110.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0110.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0110_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0110.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0110_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP0110.DtlR>)p_MS_MSBEL0110_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL0110_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0110_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0110_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL0110_Prnt01Bridge() {
			p_MS_MSBEL0110_Prnt01 = new MCParam(PDef.MS_MSBEL0110_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0110_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP0110.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0110.DtlR.class));

			p_MS_MSBEL0110_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0110_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0110_Prnt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0110_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0110_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP0110.DtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP0110.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0110.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0110.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0110_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0110.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0110_Prnt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP0110.DtlR>)p_MS_MSBEL0110_Prnt01.getContainerParam().getDownBlock(0));
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