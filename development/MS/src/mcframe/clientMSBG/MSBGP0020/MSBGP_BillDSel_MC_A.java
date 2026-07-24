package mcframe.clientMSBG.MSBGP0020;

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
import mcframe.clientMSBG.MSBGP0020.MSBGP_BillDSel_MC.MS_MSBGL0020_Srch01Caller;

/**
 * 画面"MSBGP_BillDSel"パネルクラスです。<p>
 *
 * マニュアルで請求締する際の対象を選択します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_BillDSel_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBGP0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_bill_ym_Label = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDateField Cnd_bill_ym = null;
	public MCLabel Cnd_bill_cl_day_Label = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumberField Cnd_bill_cl_day = null;
	public MCLabel Cnd_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField Cnd_bcst_nm = null;
	public MCLabel Cnd_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField Cnd_bill_dpt_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrkno_p_PPanel;
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	public MCLabel Cnd_base_cur_cd_Label = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCTextField Cnd_base_cur_nm = null;
	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Cnd_base_cur_amt_dec_place = null;
	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Cnd_base_cur_upri_dec_place = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_lastBillAmt_p_PPanel;
	public MCNumberField Hdr_last_bill_amt;	// [Hdr]の[lastBillAmt_p.amt]を[Hdr_last_bill_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_rcvAmt_p_PPanel;
	public MCNumberField Hdr_rcv_amt;	// [Hdr]の[rcvAmt_p.amt]を[Hdr_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_bfwAmt_p_PPanel;
	public MCNumberField Hdr_bfw_amt;	// [Hdr]の[bfwAmt_p.amt]を[Hdr_bfw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_slsAmt_p_PPanel;
	public MCNumberField Hdr_sls_amt;	// [Hdr]の[slsAmt_p.amt]を[Hdr_sls_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_retAmt_p_PPanel;
	public MCNumberField Hdr_ret_amt;	// [Hdr]の[retAmt_p.amt]を[Hdr_ret_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_dscntAmt_p_PPanel;
	public MCNumberField Hdr_dscnt_amt;	// [Hdr]の[dscntAmt_p.amt]を[Hdr_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_setoffAmt_p_PPanel;
	public MCNumberField Hdr_setoff_amt;	// [Hdr]の[setoffAmt_p.amt]を[Hdr_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_taxAmt_p_PPanel;
	public MCNumberField Hdr_tax_amt;	// [Hdr]の[taxAmt_p.amt]を[Hdr_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_swToAmt_p_PPanel;
	public MCNumberField Hdr_sw_to_amt;	// [Hdr]の[swToAmt_p.amt]を[Hdr_sw_to_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_billAmt_p_PPanel;
	public MCNumberField Hdr_bill_amt;	// [Hdr]の[billAmt_p.amt]を[Hdr_bill_amt]としてエイリアス定義。
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_amt_dec_place = null;
	// [List]ブロック関連のField定義
	public MCPanel ListPanel = null;
	// [List]ブロックの項目のField定義
	// [SlsInfo]ブロック関連のField定義
	public MCPanel SlsInfoPanel = null;
	// [SlsInfo]ブロックの項目のField定義
	// [DtlSls]ブロック関連のField定義
	public MCPanel DtlSlsPanel = null;
	public MCTitledBorder DtlSlsTitledBorder = null;
	public MCScrollPane DtlSlsScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0020.DtlSlsR> DtlSlsTable = null;
	// [DtlSls]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_check = null;
	/**
	 * Invoice output 請求書出力.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_bill_prnt_tgt_flg = null;
	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_bill_mtd_typ = null;
	/**
	 * Billing system type name 請求方式区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_bill_mtd_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlSls_prtAmt_p_PPanel;
	public MCColumnConfig columnDtlSls_prt_amt;// [DtlSls]の[prtAmt_p.amt]を[columnDtlSls_prt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_prt_tax_amt;// [DtlSls]の[prtAmt_p.tax_amt]を[columnDtlSls_prt_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlSls_prtIncTaxAmt_p_PPanel;
	public MCColumnConfig columnDtlSls_prt_inc_tax_amt;// [DtlSls]の[prtIncTaxAmt_p.amt]を[columnDtlSls_prt_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlSls_amt_p_PPanel;
	public MCColumnConfig columnDtlSls_trd_cur_amt;// [DtlSls]の[amt_p.amt]を[columnDtlSls_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_trd_cur_tax_amt;// [DtlSls]の[amt_p.tax_amt]を[columnDtlSls_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlSls_incTaxAmt_p_PPanel;
	public MCColumnConfig columnDtlSls_inc_tax_amt;// [DtlSls]の[incTaxAmt_p.amt]を[columnDtlSls_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlSls_dscntAmt_p_PPanel;
	public MCColumnConfig columnDtlSls_trd_cur_dscnt_amt;// [DtlSls]の[dscntAmt_p.amt]を[columnDtlSls_trd_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_bill_ym = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_bill_cl_day = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ac_dt = null;
	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_slip_sts_typ = null;
	/**
	 * Status type name 状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_nm = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ar_typ_nm = null;
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_base_sls_ac_dt = null;
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_act_no = null;
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_act_seq = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_act_rev = null;
	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_act_d_no = null;
	/**
	 * Details result sequence number 明細実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_act_d_seq = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DtlSls_itm_p_PPanel;
	public MCColumnConfig columnDtlSls_itm_cd;// [DtlSls]の[itm_p.itm_cd]を[columnDtlSls_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_itm_sub1;// [DtlSls]の[itm_p.itm_sub1]を[columnDtlSls_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_itm_sub2;// [DtlSls]の[itm_p.itm_sub2]を[columnDtlSls_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_itm_sub3;// [DtlSls]の[itm_p.itm_sub3]を[columnDtlSls_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_itm_nm;// [DtlSls]の[itm_p.itm_nm]を[columnDtlSls_itm_nm]としてエイリアス定義。
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_cst_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D DtlSls_sno_p_PPanel;
	public MCColumnConfig columnDtlSls_sno1;// [DtlSls]の[sno_p.sno1]を[columnDtlSls_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_sno2;// [DtlSls]の[sno_p.sno2]を[columnDtlSls_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_sno3;// [DtlSls]の[sno_p.sno3]を[columnDtlSls_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_sno4;// [DtlSls]の[sno_p.sno4]を[columnDtlSls_sno4]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlSls_unitQty_p_PPanel;
	public MCColumnConfig columnDtlSls_trd_unit_qty;// [DtlSls]の[unitQty_p.qty]を[columnDtlSls_trd_unit_qty]としてエイリアス定義。
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_inc_tax_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D DtlSls_curUpri_p_PPanel;
	public MCColumnConfig columnDtlSls_trd_cur_upri;// [DtlSls]の[curUpri_p.upri]を[columnDtlSls_trd_cur_upri]としてエイリアス定義。
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_interim_flg = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_tax_nm = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_tax_rate = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D DtlSls_xrate_p_PPanel;
	public MCColumnConfig columnDtlSls_xrate;// [DtlSls]の[xrate_p.xrate]を[columnDtlSls_xrate]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D DtlSls_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtlSls_base_cur_upri;// [DtlSls]の[base_cur_upri_p.upri]を[columnDtlSls_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlSls_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtlSls_base_cur_amt;// [DtlSls]の[base_cur_amt_p.amt]を[columnDtlSls_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlSls_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtlSls_base_cur_tax_amt;// [DtlSls]の[base_cur_tax_amt_p.amt]を[columnDtlSls_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlSls_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtlSls_base_cur_inc_tax_amt;// [DtlSls]の[base_cur_inc_tax_amt_p.amt]を[columnDtlSls_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlSls_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtlSls_base_cur_dscnt_amt;// [DtlSls]の[base_cur_dscnt_amt_p.amt]を[columnDtlSls_base_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dlv_dt = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_bill_basis_dt = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_bill_crryovr_times = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_cst_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_scst_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_scst_nm = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dest_nm3 = null;
	/**
	 * Sales dept. 売上部門.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_dpt_nm = null;
	/**
	 * Sales PIC 売上担当者.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_usr_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_slo_d_no = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_cst_po_d_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dlv_slip_d_no = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ship_dlv_slip_no = null;
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ship_dlv_slip_d_no = null;
	/**
	 * Multiple delivery note details at shipping 出荷時納品書明細複数.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ship_dlv_slip_multi_flg = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_wrk_nm = null;
	/**
	 * Sales recorded project No. 売上案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_wrk_no = null;
	/**
	 * Sales recorded project name 売上案件名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_wrk_nm = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_d_rmrks = null;
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_bill_d_no = null;
	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_schd_bill_dt = null;
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ar_trd_grp_typ = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dec_place = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_upri_dec_place = null;
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_amt_rnd_typ = null;
	/**
	 * Tax amount rounding type 税額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_tax_rnd_typ = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_ptn_typ = null;
	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_bill_can_slip_typ = null;
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_interim_cl_flg = null;
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_row_num = null;
	public MCColumnConfig columnDtlSls_crryovr_flg = null;
	public MCColumnConfig columnDtlSls_bill_dtl_subttl_typ = null;
	public MCColumnConfig columnDtlSls_acst_cd = null;
	public MCColumnConfig columnDtlSls_sls_dtl_outp_typ = null;
	// [DtlSlsBtn]ブロック関連のField定義
	public MCPanel DtlSlsBtnPanel = null;
	// [DtlSlsBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlSlsBtn_sls_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlSlsBtn_sls_deselect_all = null;
	public mcframe.clientFXUC.FXUCP0130.FXUCP_Paging DtlSlsBtn_paging_PPanel;
	public MCButton DtlSlsBtn_p_prev;	// [DtlSlsBtn]の[paging.prev]を[DtlSlsBtn_p_prev]としてエイリアス定義。
	public MCButton DtlSlsBtn_p_next;	// [DtlSlsBtn]の[paging.next]を[DtlSlsBtn_p_next]としてエイリアス定義。
	// [RcvInfo]ブロック関連のField定義
	public MCPanel RcvInfoPanel = null;
	// [RcvInfo]ブロックの項目のField定義
	// [Rcv]ブロック関連のField定義
	public MCPanel RcvPanel = null;
	// [Rcv]ブロックの項目のField定義
	// [Adv]ブロック関連のField定義
	public MCPanel AdvPanel = null;
	// [Adv]ブロックの項目のField定義
	// [DtlRcv]ブロック関連のField定義
	public MCPanel DtlRcvPanel = null;
	public MCTitledBorder DtlRcvTitledBorder = null;
	public MCScrollPane DtlRcvScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0020.DtlRcvR> DtlRcvTable = null;
	// [DtlRcv]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_check = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_bill_ym = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_bill_cl_day = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_ac_dt = null;
	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_trd_nm = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_ar_typ_nm = null;
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_act_no = null;
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_act_seq = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_act_rev = null;
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_act_d_no = null;
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_act_d_seq = null;
	/**
	 * Payment received method 入金方法.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_rcv_mtd_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_rcv_mtd_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlRcv_amt_p_PPanel;
	public MCColumnConfig columnDtlRcv_trd_cur_amt;// [DtlRcv]の[amt_p.amt]を[columnDtlRcv_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlRcv_setoffAmt_p_PPanel;
	public MCColumnConfig columnDtlRcv_setoff_amt;// [DtlRcv]の[setoffAmt_p.amt]を[columnDtlRcv_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlRcv_setoffTaxAmt_p_PPanel;
	public MCColumnConfig columnDtlRcv_setoff_tax_amt;// [DtlRcv]の[setoffTaxAmt_p.amt]を[columnDtlRcv_setoff_tax_amt]としてエイリアス定義。
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_setoff_tax_cd = null;
	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_setoff_tax_nm = null;
	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_setoff_tax_rate = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_rcv_dt = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_bill_basis_dt = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_bill_crryovr_times = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_wrk_nm = null;
	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_bill_d_rmrks = null;
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_bill_d_no = null;
	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_schd_bill_dt = null;
	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_bill_can_slip_typ = null;
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_sls_interim_cl_flg = null;
	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_bill_tax_disp_flg = null;
	// [DtlRcvBtn]ブロック関連のField定義
	public MCPanel DtlRcvBtnPanel = null;
	// [DtlRcvBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlRcvBtn_rcv_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlRcvBtn_rcv_deselect_all = null;
	// [DtlAdv]ブロック関連のField定義
	public MCPanel DtlAdvPanel = null;
	public MCTitledBorder DtlAdvTitledBorder = null;
	public MCScrollPane DtlAdvScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0020.DtlAdvR> DtlAdvTable = null;
	// [DtlAdv]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_check = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_ac_dt = null;
	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_trd_nm = null;
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_act_no = null;
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_act_seq = null;
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_act_rev = null;
	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_act_d_no = null;
	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_act_d_seq = null;
	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_act_upd_cntr = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_dt = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAdv_amt_p_PPanel;
	public MCColumnConfig columnDtlAdv_trd_cur_amt;// [DtlAdv]の[amt_p.amt]を[columnDtlAdv_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAdv_setoffAmt_p_PPanel;
	public MCColumnConfig columnDtlAdv_setoff_amt;// [DtlAdv]の[setoffAmt_p.amt]を[columnDtlAdv_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D DtlAdv_setoffTaxAmt_p_PPanel;
	public MCColumnConfig columnDtlAdv_setoff_tax_amt;// [DtlAdv]の[setoffTaxAmt_p.amt]を[columnDtlAdv_setoff_tax_amt]としてエイリアス定義。
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_setoff_tax_cd = null;
	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_setoff_tax_nm = null;
	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_setoff_tax_rate = null;
	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_bill_tax_disp_flg = null;
	// [DtlAdvBtn]ブロック関連のField定義
	public MCPanel DtlAdvBtnPanel = null;
	// [DtlAdvBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlAdvBtn_adv_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlAdvBtn_adv_deselect_all = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Accept 決定する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MS_MSBGL0020_Srch01]のCallerの作成 */
	protected MSBGP_BillDSel_MC.MS_MSBGL0020_Srch01Caller createMS_MSBGL0020_Srch01() {
		MSBGP_BillDSel_MC.MS_MSBGL0020_Srch01Caller<MSBGP_BillDSel, MS_MSBGL0020_Srch01Bridge>
		caller = ((MSBGP_BillDSel_MC)this).new MS_MSBGL0020_Srch01Caller<MSBGP_BillDSel, MS_MSBGL0020_Srch01Bridge>(
					(MSBGP_BillDSel)this, new MS_MSBGL0020_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0020_Srch01]の呼び出し */
	protected void callMS_MSBGL0020_Srch01() {
		MCCaller caller = createMS_MSBGL0020_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0020.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0020.HdrR aHdrR;
	/** [DtlSls]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsR> aDtlSlsL;
	/** [DtlSlsBtn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0020.DtlSlsBtnR aDtlSlsBtnR;
	/** [DtlSlsSub]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsSubR> aDtlSlsSubL;
	/** [DtlRcv]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0020.DtlRcvR> aDtlRcvL;
	/** [DtlAdv]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0020.DtlAdvR> aDtlAdvL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0020.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0020.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBG.MSBGP0020.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0020.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0020.HdrR createHdrR() {
		return mcframe.clientMSBG.MSBGP0020.HdrR.create();
	}

	/**
	 * コピーによってaDtlSlsLを設定します。
	 *
	 * aDtlSlsLのインスタンスは変更されません。
	 *
	 * @param dataset DtlSlsL
	 */
	public void setDtlSlsL(MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsR> aList) {
		if (getDtlSlsL() != aList) {
			getDtlSlsL().setAll(aList);
		}
	}

	/**
	 * [DtlSls]ブロックのコンテナaDtlSlsLを返します。
	 *
	 * @return DtlSlsL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsR> getDtlSlsL() {
		return aDtlSlsL;
	}

	/**
	 * aDtlSlsRを作成します。
	 *
	 * @return DtlSlsR
	 */
	public mcframe.clientMSBG.MSBGP0020.DtlSlsR createDtlSlsR() {
		return mcframe.clientMSBG.MSBGP0020.DtlSlsR.create();
	}

	/**
	 * aDtlSlsLを作成します。
	 *
	 * @return DtlSlsL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsR> createDtlSlsL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.class);
	}

	/**
	 * DtlSlsTableを初期化します。
	 */
	protected void createDtlSlsTable(){
		if(DtlSlsTable == null){
			DtlSlsTable = beansFactory.createTable2("DtlSls.table");
		}
	}

	/**
	 * 項目コピーによってaDtlSlsBtnRを設定します。
	 *
	 * aDtlSlsBtnRのインスタンスは変更されません。
	 *
	 * @param row DtlSlsBtnR
	 */
	public void setDtlSlsBtnR(mcframe.clientMSBG.MSBGP0020.DtlSlsBtnR row) {
		if (row != null) {
			MCRow.copyall(getDtlSlsBtnR(), row);
		}
	}

	/**
	 * [DtlSlsBtn]ブロックのコンテナaDtlSlsBtnRを返します。
	 *
	 * @return DtlSlsBtnR
	 */
	public mcframe.clientMSBG.MSBGP0020.DtlSlsBtnR getDtlSlsBtnR() {
		return aDtlSlsBtnR;
	}

	/**
	 * aDtlSlsBtnRを作成します。
	 *
	 * @return DtlSlsBtnR
	 */
	public mcframe.clientMSBG.MSBGP0020.DtlSlsBtnR createDtlSlsBtnR() {
		return mcframe.clientMSBG.MSBGP0020.DtlSlsBtnR.create();
	}

	/**
	 * コピーによってaDtlSlsSubLを設定します。
	 *
	 * aDtlSlsSubLのインスタンスは変更されません。
	 *
	 * @param dataset DtlSlsSubL
	 */
	public void setDtlSlsSubL(MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsSubR> aList) {
		if (getDtlSlsSubL() != aList) {
			getDtlSlsSubL().setAll(aList);
		}
	}

	/**
	 * [DtlSlsSub]ブロックのコンテナaDtlSlsSubLを返します。
	 *
	 * @return DtlSlsSubL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsSubR> getDtlSlsSubL() {
		return aDtlSlsSubL;
	}

	/**
	 * aDtlSlsSubRを作成します。
	 *
	 * @return DtlSlsSubR
	 */
	public mcframe.clientMSBG.MSBGP0020.DtlSlsSubR createDtlSlsSubR() {
		return mcframe.clientMSBG.MSBGP0020.DtlSlsSubR.create();
	}

	/**
	 * aDtlSlsSubLを作成します。
	 *
	 * @return DtlSlsSubL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsSubR> createDtlSlsSubL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0020.DtlSlsSubR.class);
	}

	/**
	 * コピーによってaDtlRcvLを設定します。
	 *
	 * aDtlRcvLのインスタンスは変更されません。
	 *
	 * @param dataset DtlRcvL
	 */
	public void setDtlRcvL(MCList<mcframe.clientMSBG.MSBGP0020.DtlRcvR> aList) {
		if (getDtlRcvL() != aList) {
			getDtlRcvL().setAll(aList);
		}
	}

	/**
	 * [DtlRcv]ブロックのコンテナaDtlRcvLを返します。
	 *
	 * @return DtlRcvL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0020.DtlRcvR> getDtlRcvL() {
		return aDtlRcvL;
	}

	/**
	 * aDtlRcvRを作成します。
	 *
	 * @return DtlRcvR
	 */
	public mcframe.clientMSBG.MSBGP0020.DtlRcvR createDtlRcvR() {
		return mcframe.clientMSBG.MSBGP0020.DtlRcvR.create();
	}

	/**
	 * aDtlRcvLを作成します。
	 *
	 * @return DtlRcvL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0020.DtlRcvR> createDtlRcvL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0020.DtlRcvR.class);
	}

	/**
	 * DtlRcvTableを初期化します。
	 */
	protected void createDtlRcvTable(){
		if(DtlRcvTable == null){
			DtlRcvTable = beansFactory.createTable2("DtlRcv.table");
		}
	}

	/**
	 * コピーによってaDtlAdvLを設定します。
	 *
	 * aDtlAdvLのインスタンスは変更されません。
	 *
	 * @param dataset DtlAdvL
	 */
	public void setDtlAdvL(MCList<mcframe.clientMSBG.MSBGP0020.DtlAdvR> aList) {
		if (getDtlAdvL() != aList) {
			getDtlAdvL().setAll(aList);
		}
	}

	/**
	 * [DtlAdv]ブロックのコンテナaDtlAdvLを返します。
	 *
	 * @return DtlAdvL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0020.DtlAdvR> getDtlAdvL() {
		return aDtlAdvL;
	}

	/**
	 * aDtlAdvRを作成します。
	 *
	 * @return DtlAdvR
	 */
	public mcframe.clientMSBG.MSBGP0020.DtlAdvR createDtlAdvR() {
		return mcframe.clientMSBG.MSBGP0020.DtlAdvR.create();
	}

	/**
	 * aDtlAdvLを作成します。
	 *
	 * @return DtlAdvL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0020.DtlAdvR> createDtlAdvL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0020.DtlAdvR.class);
	}

	/**
	 * DtlAdvTableを初期化します。
	 */
	protected void createDtlAdvTable(){
		if(DtlAdvTable == null){
			DtlAdvTable = beansFactory.createTable2("DtlAdv.table");
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlSlsL())) ret.add(getDtlSlsL());
		if(!MCCollectionUtil.contains(ret, getDtlSlsBtnR())) ret.add(getDtlSlsBtnR());
		if(!MCCollectionUtil.contains(ret, getDtlSlsSubL())) ret.add(getDtlSlsSubL());
		if(!MCCollectionUtil.contains(ret, getDtlRcvL())) ret.add(getDtlRcvL());
		if(!MCCollectionUtil.contains(ret, getDtlAdvL())) ret.add(getDtlAdvL());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtlSlsL()) return "DtlSls";
		if(aCnt == getDtlSlsBtnR()) return "DtlSlsBtn";
		if(aCnt == getDtlSlsSubL()) return "DtlSlsSub";
		if(aCnt == getDtlRcvL()) return "DtlRcv";
		if(aCnt == getDtlAdvL()) return "DtlAdv";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("DtlSls")) return getDtlSlsL();
		if(bId.equals("DtlSlsBtn")) return getDtlSlsBtnR();
		if(bId.equals("DtlSlsSub")) return getDtlSlsSubL();
		if(bId.equals("DtlRcv")) return getDtlRcvL();
		if(bId.equals("DtlAdv")) return getDtlAdvL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(CndPanel);
		ret.add(HdrPanel);
		ret.add(ListPanel);
		ret.add(SlsInfoPanel);
		ret.add(DtlSlsPanel);
		ret.add(DtlSlsBtnPanel);
		ret.add(RcvInfoPanel);
		ret.add(RcvPanel);
		ret.add(AdvPanel);
		ret.add(DtlRcvPanel);
		ret.add(DtlRcvBtnPanel);
		ret.add(DtlAdvPanel);
		ret.add(DtlAdvBtnPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillDSel_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlSlsL = createDtlSlsL();
		aDtlSlsBtnR = createDtlSlsBtnR();
		aDtlSlsSubL = createDtlSlsSubL();
		aDtlRcvL = createDtlRcvL();
		aDtlAdvL = createDtlAdvL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_BillDSel_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlSlsL = createDtlSlsL();
		createDtlSlsTable();
		DtlSlsTable.setRowName(name);
		aDtlSlsBtnR = createDtlSlsBtnR();
		aDtlSlsSubL = createDtlSlsSubL();
		aDtlRcvL = createDtlRcvL();
		createDtlRcvTable();
		DtlRcvTable.setRowName(name);
		aDtlAdvL = createDtlAdvL();
		createDtlAdvTable();
		DtlAdvTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_BillDSel_MC.jbCreateCnd((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateHdr((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateList((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateSlsInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateDtlSls((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateDtlSlsBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateRcvInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateAdv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateDtlRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateDtlRcvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateDtlAdv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateDtlAdvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbCreateBtn((MSBGP_BillDSel)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_BillDSel p) {
		p.Cnd_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrkno_p());
		p.Cnd_wrkno_p_PPanel.setName("Cnd.wrkno_p");
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBGP_BillDSel p) {
		p.Hdr_lastBillAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().lastBillAmt_p());
		p.Hdr_lastBillAmt_p_PPanel.setName("Hdr.lastBillAmt_p");
		p.Hdr_last_bill_amt = p.Hdr_lastBillAmt_p_PPanel.Amt_amt;
		p.Hdr_last_bill_amt.addAliasName("Hdr.last_bill_amt", p);
		p.Hdr_rcvAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().rcvAmt_p());
		p.Hdr_rcvAmt_p_PPanel.setName("Hdr.rcvAmt_p");
		p.Hdr_rcv_amt = p.Hdr_rcvAmt_p_PPanel.Amt_amt;
		p.Hdr_rcv_amt.addAliasName("Hdr.rcv_amt", p);
		p.Hdr_bfwAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().bfwAmt_p());
		p.Hdr_bfwAmt_p_PPanel.setName("Hdr.bfwAmt_p");
		p.Hdr_bfw_amt = p.Hdr_bfwAmt_p_PPanel.Amt_amt;
		p.Hdr_bfw_amt.addAliasName("Hdr.bfw_amt", p);
		p.Hdr_slsAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().slsAmt_p());
		p.Hdr_slsAmt_p_PPanel.setName("Hdr.slsAmt_p");
		p.Hdr_sls_amt = p.Hdr_slsAmt_p_PPanel.Amt_amt;
		p.Hdr_sls_amt.addAliasName("Hdr.sls_amt", p);
		p.Hdr_retAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().retAmt_p());
		p.Hdr_retAmt_p_PPanel.setName("Hdr.retAmt_p");
		p.Hdr_ret_amt = p.Hdr_retAmt_p_PPanel.Amt_amt;
		p.Hdr_ret_amt.addAliasName("Hdr.ret_amt", p);
		p.Hdr_dscntAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().dscntAmt_p());
		p.Hdr_dscntAmt_p_PPanel.setName("Hdr.dscntAmt_p");
		p.Hdr_dscnt_amt = p.Hdr_dscntAmt_p_PPanel.Amt_amt;
		p.Hdr_dscnt_amt.addAliasName("Hdr.dscnt_amt", p);
		p.Hdr_setoffAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().setoffAmt_p());
		p.Hdr_setoffAmt_p_PPanel.setName("Hdr.setoffAmt_p");
		p.Hdr_setoff_amt = p.Hdr_setoffAmt_p_PPanel.Amt_amt;
		p.Hdr_setoff_amt.addAliasName("Hdr.setoff_amt", p);
		p.Hdr_taxAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().taxAmt_p());
		p.Hdr_taxAmt_p_PPanel.setName("Hdr.taxAmt_p");
		p.Hdr_tax_amt = p.Hdr_taxAmt_p_PPanel.Amt_amt;
		p.Hdr_tax_amt.addAliasName("Hdr.tax_amt", p);
		p.Hdr_swToAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().swToAmt_p());
		p.Hdr_swToAmt_p_PPanel.setName("Hdr.swToAmt_p");
		p.Hdr_sw_to_amt = p.Hdr_swToAmt_p_PPanel.Amt_amt;
		p.Hdr_sw_to_amt.addAliasName("Hdr.sw_to_amt", p);
		p.Hdr_billAmt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().billAmt_p());
		p.Hdr_billAmt_p_PPanel.setName("Hdr.billAmt_p");
		p.Hdr_bill_amt = p.Hdr_billAmt_p_PPanel.Amt_amt;
		p.Hdr_bill_amt.addAliasName("Hdr.bill_amt", p);
	}

	/**
	 * [List]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateList(MSBGP_BillDSel p) {
	}

	/**
	 * [SlsInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSlsInfo(MSBGP_BillDSel p) {
	}

	/**
	 * [DtlSls]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlSls(MSBGP_BillDSel p) {
		p.DtlSls_prtAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$prtAmt_p);
		p.DtlSls_prtAmt_p_PPanel.setName("DtlSls.prtAmt_p");
		p.columnDtlSls_prt_amt = p.DtlSls_prtAmt_p_PPanel.columnAmt_amt;
		p.columnDtlSls_prt_amt.addAliasName("DtlSls.prt_amt", p);
		p.columnDtlSls_prt_tax_amt = p.DtlSls_prtAmt_p_PPanel.columnAmt_tax_amt;
		p.columnDtlSls_prt_tax_amt.addAliasName("DtlSls.prt_tax_amt", p);
		p.DtlSls_prtIncTaxAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$prtIncTaxAmt_p);
		p.DtlSls_prtIncTaxAmt_p_PPanel.setName("DtlSls.prtIncTaxAmt_p");
		p.columnDtlSls_prt_inc_tax_amt = p.DtlSls_prtIncTaxAmt_p_PPanel.columnAmt_amt;
		p.columnDtlSls_prt_inc_tax_amt.addAliasName("DtlSls.prt_inc_tax_amt", p);
		p.DtlSls_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$amt_p);
		p.DtlSls_amt_p_PPanel.setName("DtlSls.amt_p");
		p.columnDtlSls_trd_cur_amt = p.DtlSls_amt_p_PPanel.columnAmt_amt;
		p.columnDtlSls_trd_cur_amt.addAliasName("DtlSls.trd_cur_amt", p);
		p.columnDtlSls_trd_cur_tax_amt = p.DtlSls_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtlSls_trd_cur_tax_amt.addAliasName("DtlSls.trd_cur_tax_amt", p);
		p.DtlSls_incTaxAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$incTaxAmt_p);
		p.DtlSls_incTaxAmt_p_PPanel.setName("DtlSls.incTaxAmt_p");
		p.columnDtlSls_inc_tax_amt = p.DtlSls_incTaxAmt_p_PPanel.columnAmt_amt;
		p.columnDtlSls_inc_tax_amt.addAliasName("DtlSls.inc_tax_amt", p);
		p.DtlSls_dscntAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$dscntAmt_p);
		p.DtlSls_dscntAmt_p_PPanel.setName("DtlSls.dscntAmt_p");
		p.columnDtlSls_trd_cur_dscnt_amt = p.DtlSls_dscntAmt_p_PPanel.columnAmt_amt;
		p.columnDtlSls_trd_cur_dscnt_amt.addAliasName("DtlSls.trd_cur_dscnt_amt", p);
		p.DtlSls_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$itm_p);
		p.DtlSls_itm_p_PPanel.setName("DtlSls.itm_p");
		p.columnDtlSls_itm_cd = p.DtlSls_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtlSls_itm_cd.addAliasName("DtlSls.itm_cd", p);
		p.columnDtlSls_itm_sub1 = p.DtlSls_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtlSls_itm_sub1.addAliasName("DtlSls.itm_sub1", p);
		p.columnDtlSls_itm_sub2 = p.DtlSls_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtlSls_itm_sub2.addAliasName("DtlSls.itm_sub2", p);
		p.columnDtlSls_itm_sub3 = p.DtlSls_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtlSls_itm_sub3.addAliasName("DtlSls.itm_sub3", p);
		p.columnDtlSls_itm_nm = p.DtlSls_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtlSls_itm_nm.addAliasName("DtlSls.itm_nm", p);
		p.DtlSls_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$sno_p);
		p.DtlSls_sno_p_PPanel.setName("DtlSls.sno_p");
		p.columnDtlSls_sno1 = p.DtlSls_sno_p_PPanel.columnSno_sno1;
		p.columnDtlSls_sno1.addAliasName("DtlSls.sno1", p);
		p.columnDtlSls_sno2 = p.DtlSls_sno_p_PPanel.columnSno_sno2;
		p.columnDtlSls_sno2.addAliasName("DtlSls.sno2", p);
		p.columnDtlSls_sno3 = p.DtlSls_sno_p_PPanel.columnSno_sno3;
		p.columnDtlSls_sno3.addAliasName("DtlSls.sno3", p);
		p.columnDtlSls_sno4 = p.DtlSls_sno_p_PPanel.columnSno_sno4;
		p.columnDtlSls_sno4.addAliasName("DtlSls.sno4", p);
		p.DtlSls_unitQty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$unitQty_p);
		p.DtlSls_unitQty_p_PPanel.setName("DtlSls.unitQty_p");
		p.columnDtlSls_trd_unit_qty = p.DtlSls_unitQty_p_PPanel.columnQty_qty;
		p.columnDtlSls_trd_unit_qty.addAliasName("DtlSls.trd_unit_qty", p);
		p.DtlSls_curUpri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$curUpri_p);
		p.DtlSls_curUpri_p_PPanel.setName("DtlSls.curUpri_p");
		p.columnDtlSls_trd_cur_upri = p.DtlSls_curUpri_p_PPanel.columnUpri_upri;
		p.columnDtlSls_trd_cur_upri.addAliasName("DtlSls.trd_cur_upri", p);
		p.DtlSls_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$xrate_p);
		p.DtlSls_xrate_p_PPanel.setName("DtlSls.xrate_p");
		p.columnDtlSls_xrate = p.DtlSls_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtlSls_xrate.addAliasName("DtlSls.xrate", p);
		p.DtlSls_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$base_cur_upri_p);
		p.DtlSls_base_cur_upri_p_PPanel.setName("DtlSls.base_cur_upri_p");
		p.columnDtlSls_base_cur_upri = p.DtlSls_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtlSls_base_cur_upri.addAliasName("DtlSls.base_cur_upri", p);
		p.DtlSls_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$base_cur_amt_p);
		p.DtlSls_base_cur_amt_p_PPanel.setName("DtlSls.base_cur_amt_p");
		p.columnDtlSls_base_cur_amt = p.DtlSls_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtlSls_base_cur_amt.addAliasName("DtlSls.base_cur_amt", p);
		p.DtlSls_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$base_cur_tax_amt_p);
		p.DtlSls_base_cur_tax_amt_p_PPanel.setName("DtlSls.base_cur_tax_amt_p");
		p.columnDtlSls_base_cur_tax_amt = p.DtlSls_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtlSls_base_cur_tax_amt.addAliasName("DtlSls.base_cur_tax_amt", p);
		p.DtlSls_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$base_cur_inc_tax_amt_p);
		p.DtlSls_base_cur_inc_tax_amt_p_PPanel.setName("DtlSls.base_cur_inc_tax_amt_p");
		p.columnDtlSls_base_cur_inc_tax_amt = p.DtlSls_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtlSls_base_cur_inc_tax_amt.addAliasName("DtlSls.base_cur_inc_tax_amt", p);
		p.DtlSls_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.$base_cur_dscnt_amt_p);
		p.DtlSls_base_cur_dscnt_amt_p_PPanel.setName("DtlSls.base_cur_dscnt_amt_p");
		p.columnDtlSls_base_cur_dscnt_amt = p.DtlSls_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtlSls_base_cur_dscnt_amt.addAliasName("DtlSls.base_cur_dscnt_amt", p);
	}

	/**
	 * [DtlSlsBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlSlsBtn(MSBGP_BillDSel p) {
		p.DtlSlsBtn_paging_PPanel = mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.create(p.getDtlSlsBtnR().paging());
		p.DtlSlsBtn_paging_PPanel.setName("DtlSlsBtn.paging");
		p.DtlSlsBtn_p_prev = p.DtlSlsBtn_paging_PPanel.Btn_prev;
		p.DtlSlsBtn_p_prev.addAliasName("DtlSlsBtn.p_prev", p);
		p.DtlSlsBtn_p_next = p.DtlSlsBtn_paging_PPanel.Btn_next;
		p.DtlSlsBtn_p_next.addAliasName("DtlSlsBtn.p_next", p);
	}

	/**
	 * [RcvInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvInfo(MSBGP_BillDSel p) {
	}

	/**
	 * [Rcv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcv(MSBGP_BillDSel p) {
	}

	/**
	 * [Adv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAdv(MSBGP_BillDSel p) {
	}

	/**
	 * [DtlRcv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlRcv(MSBGP_BillDSel p) {
		p.DtlRcv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlRcvR.$amt_p);
		p.DtlRcv_amt_p_PPanel.setName("DtlRcv.amt_p");
		p.columnDtlRcv_trd_cur_amt = p.DtlRcv_amt_p_PPanel.columnAmt_amt;
		p.columnDtlRcv_trd_cur_amt.addAliasName("DtlRcv.trd_cur_amt", p);
		p.DtlRcv_setoffAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlRcvR.$setoffAmt_p);
		p.DtlRcv_setoffAmt_p_PPanel.setName("DtlRcv.setoffAmt_p");
		p.columnDtlRcv_setoff_amt = p.DtlRcv_setoffAmt_p_PPanel.columnAmt_amt;
		p.columnDtlRcv_setoff_amt.addAliasName("DtlRcv.setoff_amt", p);
		p.DtlRcv_setoffTaxAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlRcvR.$setoffTaxAmt_p);
		p.DtlRcv_setoffTaxAmt_p_PPanel.setName("DtlRcv.setoffTaxAmt_p");
		p.columnDtlRcv_setoff_tax_amt = p.DtlRcv_setoffTaxAmt_p_PPanel.columnAmt_amt;
		p.columnDtlRcv_setoff_tax_amt.addAliasName("DtlRcv.setoff_tax_amt", p);
	}

	/**
	 * [DtlRcvBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlRcvBtn(MSBGP_BillDSel p) {
	}

	/**
	 * [DtlAdv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlAdv(MSBGP_BillDSel p) {
		p.DtlAdv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlAdvR.$amt_p);
		p.DtlAdv_amt_p_PPanel.setName("DtlAdv.amt_p");
		p.columnDtlAdv_trd_cur_amt = p.DtlAdv_amt_p_PPanel.columnAmt_amt;
		p.columnDtlAdv_trd_cur_amt.addAliasName("DtlAdv.trd_cur_amt", p);
		p.DtlAdv_setoffAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlAdvR.$setoffAmt_p);
		p.DtlAdv_setoffAmt_p_PPanel.setName("DtlAdv.setoffAmt_p");
		p.columnDtlAdv_setoff_amt = p.DtlAdv_setoffAmt_p_PPanel.columnAmt_amt;
		p.columnDtlAdv_setoff_amt.addAliasName("DtlAdv.setoff_amt", p);
		p.DtlAdv_setoffTaxAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0020.DtlAdvR.$setoffTaxAmt_p);
		p.DtlAdv_setoffTaxAmt_p_PPanel.setName("DtlAdv.setoffTaxAmt_p");
		p.columnDtlAdv_setoff_tax_amt = p.DtlAdv_setoffTaxAmt_p_PPanel.columnAmt_amt;
		p.columnDtlAdv_setoff_tax_amt.addAliasName("DtlAdv.setoff_tax_amt", p);
	}

	/**
	 * [DtlAdvBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlAdvBtn(MSBGP_BillDSel p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_BillDSel p) {
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

	
	/** [Cnd_base_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_base_cur_cd_p = null;

	/**
	 * [Cnd_base_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_base_cur_cd_ListPutter() {
		if (Cnd_base_cur_cd_p == null) {
			Cnd_base_cur_cd_p = createCnd_base_cur_cd_ListPutter(Cnd_base_cur_cd, "base_cur_cd", "base_cur_nm","base_cur_amt_dec_place","base_cur_upri_dec_place");

		}
		return Cnd_base_cur_cd_p;
	}
	
	
	/** [DtlSls_bill_mtd_typ_ListPutter]の定義 */
	private MCListPutter DtlSls_bill_mtd_typ_p = null;

	/**
	 * [DtlSls_bill_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlSls_bill_mtd_typ_ListPutter() {
		if (DtlSls_bill_mtd_typ_p == null) {
			DtlSls_bill_mtd_typ_p = createDtlSls_bill_mtd_typ_ListPutter(columnDtlSls_bill_mtd_typ, "bill_mtd_typ", "bill_mtd_typ_nm");

		}
		return DtlSls_bill_mtd_typ_p;
	}
	
	
	/** [DtlSls_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter DtlSls_trd_unit_cd_p = null;

	/**
	 * [DtlSls_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlSls_trd_unit_cd_ListPutter() {
		if (DtlSls_trd_unit_cd_p == null) {
			DtlSls_trd_unit_cd_p = createDtlSls_trd_unit_cd_ListPutter(columnDtlSls_trd_unit_cd, "trd_unit_cd");

		}
		return DtlSls_trd_unit_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_BillDSel create(){
		MSBGP_BillDSel p = new MSBGP_BillDSel();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_BillDSel create(String name){
		MSBGP_BillDSel p = new MSBGP_BillDSel(name);
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
		MSBGP_BillDSel_MC.jbfInitCnd((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitHdr((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitList((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitSlsInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitDtlSls((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitDtlSlsBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitRcvInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitAdv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitDtlRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitDtlRcvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitDtlAdv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitDtlAdvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbfInitBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitCnd((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitHdr((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitList((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitSlsInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitDtlSls((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitDtlSlsBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitRcvInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitAdv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitDtlRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitDtlRcvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitDtlAdv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitDtlAdvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.jbInitBtn((MSBGP_BillDSel)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_bill_ym_Label = p.beansFactory.createLabel("Cnd.bill_ym_Label");
		p.Cnd_bill_ym = p.beansFactory.createDateField("Cnd.bill_ym");
		p.Cnd_bill_ym.setLabel(p.Cnd_bill_ym_Label);
		p.Cnd_bill_cl_day_Label = p.beansFactory.createLabel("Cnd.bill_cl_day_Label");
		p.Cnd_bill_cl_day = p.beansFactory.createNumberField("Cnd.bill_cl_day");
		p.Cnd_bill_cl_day.setLabel(p.Cnd_bill_cl_day_Label);
		p.Cnd_bcst_cd_Label = p.beansFactory.createLabel("Cnd.bcst_cd_Label");
		p.Cnd_bcst_cd = p.beansFactory.createTextField("Cnd.bcst_cd");
		p.Cnd_bcst_cd.setLabel(p.Cnd_bcst_cd_Label);
		p.Cnd_bcst_nm = p.beansFactory.createTextField("Cnd.bcst_nm");
		p.Cnd_bill_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bill_dpt_cd_Label");
		p.Cnd_bill_dpt_cd = p.beansFactory.createTextField("Cnd.bill_dpt_cd");
		p.Cnd_bill_dpt_cd.setLabel(p.Cnd_bill_dpt_cd_Label);
		p.Cnd_bill_dpt_nm = p.beansFactory.createTextField("Cnd.bill_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextField("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextField("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_base_cur_cd_Label = p.beansFactory.createLabel("Cnd.base_cur_cd_Label");
		p.Cnd_base_cur_cd = p.beansFactory.createTextField("Cnd.base_cur_cd");
		p.Cnd_base_cur_cd.setLabel(p.Cnd_base_cur_cd_Label);
		p.Cnd_base_cur_nm = p.beansFactory.createTextField("Cnd.base_cur_nm");
		p.Cnd_base_cur_amt_dec_place = p.beansFactory.createNumberField("Cnd.base_cur_amt_dec_place");
		p.Cnd_base_cur_upri_dec_place = p.beansFactory.createNumberField("Cnd.base_cur_upri_dec_place");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_amt_dec_place = p.beansFactory.createNumberField("Hdr.amt_dec_place");
	}

	/**
	 * [List]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitList(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.ListPanel = p.beansFactory.createPanel("List");
		// ブロックの項目の初期化
	}

	/**
	 * [SlsInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSlsInfo(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.SlsInfoPanel = p.beansFactory.createPanel("SlsInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSls]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlSls(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlSlsPanel = p.beansFactory.createPanel("DtlSls");
		p.DtlSlsTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlSlsScrollPane = p.beansFactory.createScrollPane("DtlSls.scroll");
		p.createDtlSlsTable();
		// ブロックの項目の初期化
		p.columnDtlSls_check = p.beansFactory.createTableColumn("DtlSls.check", MCColumnType.CHECK);
		p.columnDtlSls_bill_prnt_tgt_flg = p.beansFactory.createTableColumn("DtlSls.bill_prnt_tgt_flg", MCColumnType.CHECK);
		p.columnDtlSls_bill_mtd_typ = p.beansFactory.createTableColumn("DtlSls.bill_mtd_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlSls_bill_mtd_typ_nm = p.beansFactory.createTableColumn("DtlSls.bill_mtd_typ_nm", MCColumnType.TEXT);
		p.columnDtlSls_bill_ym = p.beansFactory.createTableColumn("DtlSls.bill_ym", MCColumnType.DATE);
		p.columnDtlSls_bill_cl_day = p.beansFactory.createTableColumn("DtlSls.bill_cl_day", MCColumnType.NUMBER);
		p.columnDtlSls_ac_dt = p.beansFactory.createTableColumn("DtlSls.ac_dt", MCColumnType.DATE);
		p.columnDtlSls_slip_sts_typ = p.beansFactory.createTableColumn("DtlSls.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtlSls_slip_sts_typ_nm = p.beansFactory.createTableColumn("DtlSls.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtlSls_trd_cd = p.beansFactory.createTableColumn("DtlSls.trd_cd", MCColumnType.TEXT);
		p.columnDtlSls_trd_nm = p.beansFactory.createTableColumn("DtlSls.trd_nm", MCColumnType.TEXT);
		p.columnDtlSls_ar_typ = p.beansFactory.createTableColumn("DtlSls.ar_typ", MCColumnType.TEXT);
		p.columnDtlSls_ar_typ_nm = p.beansFactory.createTableColumn("DtlSls.ar_typ_nm", MCColumnType.TEXT);
		p.columnDtlSls_base_sls_ac_dt = p.beansFactory.createTableColumn("DtlSls.base_sls_ac_dt", MCColumnType.DATE);
		p.columnDtlSls_act_no = p.beansFactory.createTableColumn("DtlSls.act_no", MCColumnType.TEXT);
		p.columnDtlSls_act_seq = p.beansFactory.createTableColumn("DtlSls.act_seq", MCColumnType.NUMBER);
		p.columnDtlSls_act_rev = p.beansFactory.createTableColumn("DtlSls.act_rev", MCColumnType.NUMBER);
		p.columnDtlSls_act_d_no = p.beansFactory.createTableColumn("DtlSls.act_d_no", MCColumnType.TEXT);
		p.columnDtlSls_act_d_seq = p.beansFactory.createTableColumn("DtlSls.act_d_seq", MCColumnType.NUMBER);
		p.columnDtlSls_cst_itm_cd = p.beansFactory.createTableColumn("DtlSls.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtlSls_cst_itm_nm = p.beansFactory.createTableColumn("DtlSls.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtlSls_trd_unit_cd = p.beansFactory.createTableColumn("DtlSls.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlSls_trd_unit_nm = p.beansFactory.createTableColumn("DtlSls.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtlSls_inc_tax_flg = p.beansFactory.createTableColumn("DtlSls.inc_tax_flg", MCColumnType.CHECK);
		p.columnDtlSls_interim_flg = p.beansFactory.createTableColumn("DtlSls.interim_flg", MCColumnType.CHECK);
		p.columnDtlSls_tax_cd = p.beansFactory.createTableColumn("DtlSls.tax_cd", MCColumnType.TEXT);
		p.columnDtlSls_tax_nm = p.beansFactory.createTableColumn("DtlSls.tax_nm", MCColumnType.TEXT);
		p.columnDtlSls_tax_rate = p.beansFactory.createTableColumn("DtlSls.tax_rate", MCColumnType.NUMBER);
		p.columnDtlSls_dlv_dt = p.beansFactory.createTableColumn("DtlSls.dlv_dt", MCColumnType.DATE);
		p.columnDtlSls_bill_basis_dt = p.beansFactory.createTableColumn("DtlSls.bill_basis_dt", MCColumnType.DATE);
		p.columnDtlSls_bill_crryovr_times = p.beansFactory.createTableColumn("DtlSls.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnDtlSls_cst_cd = p.beansFactory.createTableColumn("DtlSls.cst_cd", MCColumnType.TEXT);
		p.columnDtlSls_cst_nm = p.beansFactory.createTableColumn("DtlSls.cst_nm", MCColumnType.TEXT);
		p.columnDtlSls_scst_cd = p.beansFactory.createTableColumn("DtlSls.scst_cd", MCColumnType.TEXT);
		p.columnDtlSls_scst_nm = p.beansFactory.createTableColumn("DtlSls.scst_nm", MCColumnType.TEXT);
		p.columnDtlSls_dest_cd1 = p.beansFactory.createTableColumn("DtlSls.dest_cd1", MCColumnType.TEXT);
		p.columnDtlSls_dest_nm1 = p.beansFactory.createTableColumn("DtlSls.dest_nm1", MCColumnType.TEXT);
		p.columnDtlSls_dest_cd2 = p.beansFactory.createTableColumn("DtlSls.dest_cd2", MCColumnType.TEXT);
		p.columnDtlSls_dest_nm2 = p.beansFactory.createTableColumn("DtlSls.dest_nm2", MCColumnType.TEXT);
		p.columnDtlSls_dest_cd3 = p.beansFactory.createTableColumn("DtlSls.dest_cd3", MCColumnType.TEXT);
		p.columnDtlSls_dest_nm3 = p.beansFactory.createTableColumn("DtlSls.dest_nm3", MCColumnType.TEXT);
		p.columnDtlSls_sls_dpt_cd = p.beansFactory.createTableColumn("DtlSls.sls_dpt_cd", MCColumnType.TEXT);
		p.columnDtlSls_sls_dpt_nm = p.beansFactory.createTableColumn("DtlSls.sls_dpt_nm", MCColumnType.TEXT);
		p.columnDtlSls_sls_usr_cd = p.beansFactory.createTableColumn("DtlSls.sls_usr_cd", MCColumnType.TEXT);
		p.columnDtlSls_sls_usr_nm = p.beansFactory.createTableColumn("DtlSls.sls_usr_nm", MCColumnType.TEXT);
		p.columnDtlSls_slo_no = p.beansFactory.createTableColumn("DtlSls.slo_no", MCColumnType.TEXT);
		p.columnDtlSls_slo_d_no = p.beansFactory.createTableColumn("DtlSls.slo_d_no", MCColumnType.TEXT);
		p.columnDtlSls_cst_po_no = p.beansFactory.createTableColumn("DtlSls.cst_po_no", MCColumnType.TEXT);
		p.columnDtlSls_cst_po_d_no = p.beansFactory.createTableColumn("DtlSls.cst_po_d_no", MCColumnType.TEXT);
		p.columnDtlSls_dlv_slip_no = p.beansFactory.createTableColumn("DtlSls.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtlSls_dlv_slip_d_no = p.beansFactory.createTableColumn("DtlSls.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtlSls_ship_dlv_slip_no = p.beansFactory.createTableColumn("DtlSls.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtlSls_ship_dlv_slip_d_no = p.beansFactory.createTableColumn("DtlSls.ship_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtlSls_ship_dlv_slip_multi_flg = p.beansFactory.createTableColumn("DtlSls.ship_dlv_slip_multi_flg", MCColumnType.CHECK);
		p.columnDtlSls_wrk_no = p.beansFactory.createTableColumn("DtlSls.wrk_no", MCColumnType.TEXT);
		p.columnDtlSls_wrk_nm = p.beansFactory.createTableColumn("DtlSls.wrk_nm", MCColumnType.TEXT);
		p.columnDtlSls_sls_wrk_no = p.beansFactory.createTableColumn("DtlSls.sls_wrk_no", MCColumnType.TEXT);
		p.columnDtlSls_sls_wrk_nm = p.beansFactory.createTableColumn("DtlSls.sls_wrk_nm", MCColumnType.TEXT);
		p.columnDtlSls_trd_d_rmrks = p.beansFactory.createTableColumn("DtlSls.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtlSls_bill_d_no = p.beansFactory.createTableColumn("DtlSls.bill_d_no", MCColumnType.TEXT);
		p.columnDtlSls_schd_bill_dt = p.beansFactory.createTableColumn("DtlSls.schd_bill_dt", MCColumnType.DATE);
		p.columnDtlSls_ar_trd_grp_typ = p.beansFactory.createTableColumn("DtlSls.ar_trd_grp_typ", MCColumnType.TEXT);
		p.columnDtlSls_dec_place = p.beansFactory.createTableColumn("DtlSls.dec_place", MCColumnType.NUMBER);
		p.columnDtlSls_amt_dec_place = p.beansFactory.createTableColumn("DtlSls.amt_dec_place", MCColumnType.NUMBER);
		p.columnDtlSls_upri_dec_place = p.beansFactory.createTableColumn("DtlSls.upri_dec_place", MCColumnType.NUMBER);
		p.columnDtlSls_sls_amt_rnd_typ = p.beansFactory.createTableColumn("DtlSls.sls_amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtlSls_sls_tax_rnd_typ = p.beansFactory.createTableColumn("DtlSls.sls_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtlSls_trd_ptn_typ = p.beansFactory.createTableColumn("DtlSls.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtlSls_bill_can_slip_typ = p.beansFactory.createTableColumn("DtlSls.bill_can_slip_typ", MCColumnType.TEXT);
		p.columnDtlSls_sls_interim_cl_flg = p.beansFactory.createTableColumn("DtlSls.sls_interim_cl_flg", MCColumnType.CHECK);
		p.columnDtlSls_row_num = p.beansFactory.createTableColumn("DtlSls.row_num", MCColumnType.NUMBER);
		p.columnDtlSls_crryovr_flg = p.beansFactory.createTableColumn("DtlSls.crryovr_flg", MCColumnType.CHECK);
		p.columnDtlSls_bill_dtl_subttl_typ = p.beansFactory.createTableColumn("DtlSls.bill_dtl_subttl_typ", MCColumnType.TEXT);
		p.columnDtlSls_acst_cd = p.beansFactory.createTableColumn("DtlSls.acst_cd", MCColumnType.TEXT);
		p.columnDtlSls_sls_dtl_outp_typ = p.beansFactory.createTableColumn("DtlSls.sls_dtl_outp_typ", MCColumnType.TEXT);
	}

	/**
	 * [DtlSlsBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlSlsBtn(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlSlsBtnPanel = p.beansFactory.createPanel("DtlSlsBtn");
		// ブロックの項目の初期化
		p.DtlSlsBtn_sls_select_all = p.beansFactory.createButton("DtlSlsBtn.sls_select_all", "no_border");
		p.DtlSlsBtn_sls_deselect_all = p.beansFactory.createButton("DtlSlsBtn.sls_deselect_all", "no_border");
	}

	/**
	 * [RcvInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvInfo(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.RcvInfoPanel = p.beansFactory.createPanel("RcvInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [Rcv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcv(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.RcvPanel = p.beansFactory.createPanel("Rcv");
		// ブロックの項目の初期化
	}

	/**
	 * [Adv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAdv(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.AdvPanel = p.beansFactory.createPanel("Adv");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlRcv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlRcv(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlRcvPanel = p.beansFactory.createPanel("DtlRcv");
		p.DtlRcvTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlRcvScrollPane = p.beansFactory.createScrollPane("DtlRcv.scroll");
		p.createDtlRcvTable();
		// ブロックの項目の初期化
		p.columnDtlRcv_check = p.beansFactory.createTableColumn("DtlRcv.check", MCColumnType.CHECK);
		p.columnDtlRcv_bill_ym = p.beansFactory.createTableColumn("DtlRcv.bill_ym", MCColumnType.DATE);
		p.columnDtlRcv_bill_cl_day = p.beansFactory.createTableColumn("DtlRcv.bill_cl_day", MCColumnType.NUMBER);
		p.columnDtlRcv_ac_dt = p.beansFactory.createTableColumn("DtlRcv.ac_dt", MCColumnType.DATE);
		p.columnDtlRcv_slip_sts_typ = p.beansFactory.createTableColumn("DtlRcv.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtlRcv_slip_sts_typ_nm = p.beansFactory.createTableColumn("DtlRcv.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtlRcv_trd_cd = p.beansFactory.createTableColumn("DtlRcv.trd_cd", MCColumnType.TEXT);
		p.columnDtlRcv_trd_nm = p.beansFactory.createTableColumn("DtlRcv.trd_nm", MCColumnType.TEXT);
		p.columnDtlRcv_ar_typ = p.beansFactory.createTableColumn("DtlRcv.ar_typ", MCColumnType.TEXT);
		p.columnDtlRcv_ar_typ_nm = p.beansFactory.createTableColumn("DtlRcv.ar_typ_nm", MCColumnType.TEXT);
		p.columnDtlRcv_act_no = p.beansFactory.createTableColumn("DtlRcv.act_no", MCColumnType.TEXT);
		p.columnDtlRcv_act_seq = p.beansFactory.createTableColumn("DtlRcv.act_seq", MCColumnType.NUMBER);
		p.columnDtlRcv_act_rev = p.beansFactory.createTableColumn("DtlRcv.act_rev", MCColumnType.NUMBER);
		p.columnDtlRcv_act_d_no = p.beansFactory.createTableColumn("DtlRcv.act_d_no", MCColumnType.TEXT);
		p.columnDtlRcv_act_d_seq = p.beansFactory.createTableColumn("DtlRcv.act_d_seq", MCColumnType.NUMBER);
		p.columnDtlRcv_rcv_mtd_cd = p.beansFactory.createTableColumn("DtlRcv.rcv_mtd_cd", MCColumnType.TEXT);
		p.columnDtlRcv_rcv_mtd_nm = p.beansFactory.createTableColumn("DtlRcv.rcv_mtd_nm", MCColumnType.TEXT);
		p.columnDtlRcv_setoff_tax_cd = p.beansFactory.createTableColumn("DtlRcv.setoff_tax_cd", MCColumnType.TEXT);
		p.columnDtlRcv_setoff_tax_nm = p.beansFactory.createTableColumn("DtlRcv.setoff_tax_nm", MCColumnType.TEXT);
		p.columnDtlRcv_setoff_tax_rate = p.beansFactory.createTableColumn("DtlRcv.setoff_tax_rate", MCColumnType.NUMBER);
		p.columnDtlRcv_rcv_dt = p.beansFactory.createTableColumn("DtlRcv.rcv_dt", MCColumnType.DATE);
		p.columnDtlRcv_bill_basis_dt = p.beansFactory.createTableColumn("DtlRcv.bill_basis_dt", MCColumnType.DATE);
		p.columnDtlRcv_bill_crryovr_times = p.beansFactory.createTableColumn("DtlRcv.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnDtlRcv_wrk_no = p.beansFactory.createTableColumn("DtlRcv.wrk_no", MCColumnType.TEXT);
		p.columnDtlRcv_wrk_nm = p.beansFactory.createTableColumn("DtlRcv.wrk_nm", MCColumnType.TEXT);
		p.columnDtlRcv_bill_d_rmrks = p.beansFactory.createTableColumn("DtlRcv.bill_d_rmrks", MCColumnType.TEXT);
		p.columnDtlRcv_bill_d_no = p.beansFactory.createTableColumn("DtlRcv.bill_d_no", MCColumnType.TEXT);
		p.columnDtlRcv_schd_bill_dt = p.beansFactory.createTableColumn("DtlRcv.schd_bill_dt", MCColumnType.DATE);
		p.columnDtlRcv_bill_can_slip_typ = p.beansFactory.createTableColumn("DtlRcv.bill_can_slip_typ", MCColumnType.TEXT);
		p.columnDtlRcv_sls_interim_cl_flg = p.beansFactory.createTableColumn("DtlRcv.sls_interim_cl_flg", MCColumnType.CHECK);
		p.columnDtlRcv_bill_tax_disp_flg = p.beansFactory.createTableColumn("DtlRcv.bill_tax_disp_flg", MCColumnType.CHECK);
	}

	/**
	 * [DtlRcvBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlRcvBtn(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlRcvBtnPanel = p.beansFactory.createPanel("DtlRcvBtn");
		// ブロックの項目の初期化
		p.DtlRcvBtn_rcv_select_all = p.beansFactory.createButton("DtlRcvBtn.rcv_select_all", "no_border");
		p.DtlRcvBtn_rcv_deselect_all = p.beansFactory.createButton("DtlRcvBtn.rcv_deselect_all", "no_border");
	}

	/**
	 * [DtlAdv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlAdv(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlAdvPanel = p.beansFactory.createPanel("DtlAdv");
		p.DtlAdvTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlAdvScrollPane = p.beansFactory.createScrollPane("DtlAdv.scroll");
		p.createDtlAdvTable();
		// ブロックの項目の初期化
		p.columnDtlAdv_check = p.beansFactory.createTableColumn("DtlAdv.check", MCColumnType.CHECK);
		p.columnDtlAdv_ac_dt = p.beansFactory.createTableColumn("DtlAdv.ac_dt", MCColumnType.DATE);
		p.columnDtlAdv_slip_sts_typ = p.beansFactory.createTableColumn("DtlAdv.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtlAdv_slip_sts_typ_nm = p.beansFactory.createTableColumn("DtlAdv.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtlAdv_trd_cd = p.beansFactory.createTableColumn("DtlAdv.trd_cd", MCColumnType.TEXT);
		p.columnDtlAdv_trd_nm = p.beansFactory.createTableColumn("DtlAdv.trd_nm", MCColumnType.TEXT);
		p.columnDtlAdv_rcv_act_no = p.beansFactory.createTableColumn("DtlAdv.rcv_act_no", MCColumnType.TEXT);
		p.columnDtlAdv_rcv_act_seq = p.beansFactory.createTableColumn("DtlAdv.rcv_act_seq", MCColumnType.NUMBER);
		p.columnDtlAdv_rcv_act_rev = p.beansFactory.createTableColumn("DtlAdv.rcv_act_rev", MCColumnType.NUMBER);
		p.columnDtlAdv_rcv_act_d_no = p.beansFactory.createTableColumn("DtlAdv.rcv_act_d_no", MCColumnType.TEXT);
		p.columnDtlAdv_rcv_act_d_seq = p.beansFactory.createTableColumn("DtlAdv.rcv_act_d_seq", MCColumnType.NUMBER);
		p.columnDtlAdv_rcv_act_upd_cntr = p.beansFactory.createTableColumn("DtlAdv.rcv_act_upd_cntr", MCColumnType.NUMBER);
		p.columnDtlAdv_rcv_dt = p.beansFactory.createTableColumn("DtlAdv.rcv_dt", MCColumnType.DATE);
		p.columnDtlAdv_setoff_tax_cd = p.beansFactory.createTableColumn("DtlAdv.setoff_tax_cd", MCColumnType.TEXT);
		p.columnDtlAdv_setoff_tax_nm = p.beansFactory.createTableColumn("DtlAdv.setoff_tax_nm", MCColumnType.TEXT);
		p.columnDtlAdv_setoff_tax_rate = p.beansFactory.createTableColumn("DtlAdv.setoff_tax_rate", MCColumnType.NUMBER);
		p.columnDtlAdv_bill_tax_disp_flg = p.beansFactory.createTableColumn("DtlAdv.bill_tax_disp_flg", MCColumnType.CHECK);
	}

	/**
	 * [DtlAdvBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlAdvBtn(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlAdvBtnPanel = p.beansFactory.createPanel("DtlAdvBtn");
		// ブロックの項目の初期化
		p.DtlAdvBtn_adv_select_all = p.beansFactory.createButton("DtlAdvBtn.adv_select_all", "no_border");
		p.DtlAdvBtn_adv_deselect_all = p.beansFactory.createButton("DtlAdvBtn.adv_deselect_all", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_bill_ym_Label);
		p.CndPanel.add(p.Cnd_bill_ym);
		p.CndPanel.setLastBeans(p.Cnd_bill_ym);
		p.Cnd_bill_ym.setNextBeans(p.Cnd_bill_cl_day);
		p.Cnd_bill_ym.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.bill_ym_META);
		p.Cnd_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_bill_cl_day_Label);
		p.CndPanel.add(p.Cnd_bill_cl_day);
		p.Cnd_bill_cl_day.setNextBeans(p.Cnd_bcst_cd);
		p.Cnd_bill_cl_day.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.bill_cl_day_META);
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.bcst_cd_META);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_bill_dpt_cd);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.bcst_nm_META);
		p.CndPanel.add(p.Cnd_bill_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bill_dpt_cd);
		p.Cnd_bill_dpt_cd.setNextBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.bill_dpt_cd_META);
		p.CndPanel.add(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_bill_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.bill_dpt_nm_META);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_wrkno_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_wrkno_p_PPanel);
		p.Cnd_wrkno_p_PPanel.setNextBeans(p.Cnd_trd_cur_cd);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_base_cur_cd);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.trd_cur_nm_META);
		p.CndPanel.add(p.Cnd_base_cur_cd_Label);
		p.CndPanel.add(p.Cnd_base_cur_cd);
		p.Cnd_base_cur_cd.setNextBeans(p.Cnd_base_cur_nm);
		p.Cnd_base_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.base_cur_cd_META);
		p.Cnd_base_cur_cd.addLinkBeans(p.Cnd_base_cur_nm,p.Cnd_base_cur_amt_dec_place,p.Cnd_base_cur_upri_dec_place);
		p.Cnd_base_cur_cd.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_base_cur_nm);
		p.Cnd_base_cur_nm.setNextBeans(p.Cnd_base_cur_amt_dec_place);
		p.Cnd_base_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.base_cur_nm_META);
		p.CndPanel.add(p.Cnd_base_cur_amt_dec_place);
		p.Cnd_base_cur_amt_dec_place.setNextBeans(p.Cnd_base_cur_upri_dec_place);
		p.Cnd_base_cur_amt_dec_place.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.base_cur_amt_dec_place_META);
		p.CndPanel.add(p.Cnd_base_cur_upri_dec_place);
		p.Cnd_base_cur_upri_dec_place.setNextBeans(p.Cnd_srch);
		p.Cnd_base_cur_upri_dec_place.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0020.CndR.base_cur_upri_dec_place_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.add(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.ListPanel);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.HdrPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_lastBillAmt_p_PPanel);
		p.HdrPanel.setLastBeans(p.Hdr_lastBillAmt_p_PPanel);
		p.Hdr_lastBillAmt_p_PPanel.setNextBeans(p.Hdr_rcvAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_rcvAmt_p_PPanel);
		p.Hdr_rcvAmt_p_PPanel.setNextBeans(p.Hdr_bfwAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_bfwAmt_p_PPanel);
		p.Hdr_bfwAmt_p_PPanel.setNextBeans(p.Hdr_slsAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_slsAmt_p_PPanel);
		p.Hdr_slsAmt_p_PPanel.setNextBeans(p.Hdr_retAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_retAmt_p_PPanel);
		p.Hdr_retAmt_p_PPanel.setNextBeans(p.Hdr_dscntAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_dscntAmt_p_PPanel);
		p.Hdr_dscntAmt_p_PPanel.setNextBeans(p.Hdr_setoffAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_setoffAmt_p_PPanel);
		p.Hdr_setoffAmt_p_PPanel.setNextBeans(p.Hdr_taxAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_taxAmt_p_PPanel);
		p.Hdr_taxAmt_p_PPanel.setNextBeans(p.Hdr_swToAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_swToAmt_p_PPanel);
		p.Hdr_swToAmt_p_PPanel.setNextBeans(p.Hdr_billAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_billAmt_p_PPanel);
		p.Hdr_billAmt_p_PPanel.setNextBeans(p.Hdr_amt_dec_place);
		p.HdrPanel.add(p.Hdr_amt_dec_place);
		p.Hdr_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0020.HdrR.amt_dec_place_META);
	}

	/**
	 * [List]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitList(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.add(p.ListPanel);
		p.ListPanel.setNextBeans(p.BtnPanel);
		p.ListPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.ListPanel.add(p.SlsInfoPanel, null);
		p.ListPanel.setLastBeans(p.SlsInfoPanel);
		p.SlsInfoPanel.setNextBeans(p.RcvInfoPanel);
		p.ListPanel.add(p.RcvInfoPanel, null);
	}

	/**
	 * [SlsInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSlsInfo(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.SlsInfoPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.SlsInfoPanel.add(p.DtlSlsPanel, null);
		p.SlsInfoPanel.setLastBeans(p.DtlSlsPanel);
		p.DtlSlsPanel.setNextBeans(p.DtlSlsBtnPanel);
		p.SlsInfoPanel.add(p.DtlSlsBtnPanel, null);
	}

	/**
	 * [DtlSls]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlSls(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlSlsPanel.setBorder(p.DtlSlsTitledBorder);
		p.DtlSlsPanel.add(p.DtlSlsScrollPane);
		p.DtlSlsPanel.setLastBeans(p.DtlSlsTable);
		p.DtlSlsScrollPane.setViewportView(p.DtlSlsTable);
		p.DtlSlsTable.setList(p.getDtlSlsL());
		p.DtlSlsTable.setStatusColumnVisible(false);
		p.DtlSlsPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSlsBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlSlsBtn(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlSlsBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlSlsBtn_sls_select_all.setIcon("SELECT_ALL");
		p.DtlSlsBtn_sls_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlSlsBtnPanel.add(p.DtlSlsBtn_sls_select_all);
		p.DtlSlsBtnPanel.setLastBeans(p.DtlSlsBtn_sls_select_all);
		p.DtlSlsBtn_sls_select_all.setNextBeans(p.DtlSlsBtn_sls_deselect_all);
		p.DtlSlsBtn_sls_deselect_all.setIcon("DESELECT_ALL");
		p.DtlSlsBtn_sls_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlSlsBtnPanel.add(p.DtlSlsBtn_sls_deselect_all);
		p.DtlSlsBtn_sls_deselect_all.setNextBeans(p.DtlSlsBtn_paging_PPanel);
		p.DtlSlsBtnPanel.add(p.DtlSlsBtn_paging_PPanel);
	}

	/**
	 * [RcvInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvInfo(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.RcvInfoPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.RcvInfoPanel.add(p.RcvPanel, null);
		p.RcvInfoPanel.setLastBeans(p.RcvPanel);
		p.RcvPanel.setNextBeans(p.AdvPanel);
		p.RcvInfoPanel.add(p.AdvPanel, null);
	}

	/**
	 * [Rcv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcv(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.RcvPanel.setLayoutPosition("CLC+");
		// ブロックの項目の初期化
		p.RcvPanel.add(p.DtlRcvPanel, null);
		p.RcvPanel.setLastBeans(p.DtlRcvPanel);
		p.DtlRcvPanel.setNextBeans(p.DtlRcvBtnPanel);
		p.RcvPanel.add(p.DtlRcvBtnPanel, null);
	}

	/**
	 * [Adv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAdv(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.AdvPanel.setLayoutPosition("CRC+");
		// ブロックの項目の初期化
		p.AdvPanel.add(p.DtlAdvPanel, null);
		p.AdvPanel.setLastBeans(p.DtlAdvPanel);
		p.DtlAdvPanel.setNextBeans(p.DtlAdvBtnPanel);
		p.AdvPanel.add(p.DtlAdvBtnPanel, null);
	}

	/**
	 * [DtlRcv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlRcv(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlRcvPanel.setBorder(p.DtlRcvTitledBorder);
		p.DtlRcvPanel.add(p.DtlRcvScrollPane);
		p.DtlRcvPanel.setLastBeans(p.DtlRcvTable);
		p.DtlRcvScrollPane.setViewportView(p.DtlRcvTable);
		p.DtlRcvTable.setList(p.getDtlRcvL());
		p.DtlRcvTable.setStatusColumnVisible(false);
		p.DtlRcvPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlRcvBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlRcvBtn(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlRcvBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlRcvBtn_rcv_select_all.setIcon("SELECT_ALL");
		p.DtlRcvBtn_rcv_select_all.setFunctionKey(MCFunctionKey.F15);
		p.DtlRcvBtnPanel.add(p.DtlRcvBtn_rcv_select_all);
		p.DtlRcvBtnPanel.setLastBeans(p.DtlRcvBtn_rcv_select_all);
		p.DtlRcvBtn_rcv_select_all.setNextBeans(p.DtlRcvBtn_rcv_deselect_all);
		p.DtlRcvBtn_rcv_deselect_all.setIcon("DESELECT_ALL");
		p.DtlRcvBtn_rcv_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.DtlRcvBtnPanel.add(p.DtlRcvBtn_rcv_deselect_all);
	}

	/**
	 * [DtlAdv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlAdv(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlAdvPanel.setBorder(p.DtlAdvTitledBorder);
		p.DtlAdvPanel.add(p.DtlAdvScrollPane);
		p.DtlAdvPanel.setLastBeans(p.DtlAdvTable);
		p.DtlAdvScrollPane.setViewportView(p.DtlAdvTable);
		p.DtlAdvTable.setList(p.getDtlAdvL());
		p.DtlAdvTable.setStatusColumnVisible(false);
		p.DtlAdvPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlAdvBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlAdvBtn(MSBGP_BillDSel p) {
		// ブロック関連の初期化
		p.DtlAdvBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlAdvBtn_adv_select_all.setIcon("SELECT_ALL");
		p.DtlAdvBtn_adv_select_all.setFunctionKey(MCFunctionKey.F17);
		p.DtlAdvBtnPanel.add(p.DtlAdvBtn_adv_select_all);
		p.DtlAdvBtnPanel.setLastBeans(p.DtlAdvBtn_adv_select_all);
		p.DtlAdvBtn_adv_select_all.setNextBeans(p.DtlAdvBtn_adv_deselect_all);
		p.DtlAdvBtn_adv_deselect_all.setIcon("DESELECT_ALL");
		p.DtlAdvBtn_adv_deselect_all.setFunctionKey(MCFunctionKey.F18);
		p.DtlAdvBtnPanel.add(p.DtlAdvBtn_adv_deselect_all);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_BillDSel p) {
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
		MSBGP_BillDSel_MC.mcInitCnd((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitHdr((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitList((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitSlsInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitDtlSls((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitDtlSlsBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitRcvInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitAdv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitDtlRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitDtlRcvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitDtlAdv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitDtlAdvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.mcInitBtn((MSBGP_BillDSel)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_BillDSel_MC.statusInitSRCH_Cnd((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_Hdr((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_List((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_SlsInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_DtlSls((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_DtlSlsBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_DtlSlsSub((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_RcvInfo((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_Rcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_Adv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_DtlRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_DtlRcvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_DtlAdv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_DtlAdvBtn((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.statusInitSRCH_Btn((MSBGP_BillDSel)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_BillDSel p) {
		p.Cnd_bill_ym.setListListener(p);
		p.Cnd_bill_ym.addAllListener(p);
		p.Cnd_bill_cl_day.setListListener(p);
		p.Cnd_bill_cl_day.addAllListener(p);
		p.Cnd_bcst_cd.setListListener(p);
		p.Cnd_bcst_cd.addAllListener(p);
		p.Cnd_bcst_nm.setListListener(p);
		p.Cnd_bcst_nm.addAllListener(p);
		p.Cnd_bill_dpt_cd.setListListener(p);
		p.Cnd_bill_dpt_cd.addAllListener(p);
		p.Cnd_bill_dpt_nm.setListListener(p);
		p.Cnd_bill_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_base_cur_cd.setListListener(p);
		p.Cnd_base_cur_cd.addAllListener(p);
		p.Cnd_base_cur_nm.setListListener(p);
		p.Cnd_base_cur_nm.addAllListener(p);
		p.Cnd_base_cur_amt_dec_place.setListListener(p);
		p.Cnd_base_cur_amt_dec_place.addAllListener(p);
		p.Cnd_base_cur_upri_dec_place.setListListener(p);
		p.Cnd_base_cur_upri_dec_place.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBGP_BillDSel p) {
		p.Hdr_amt_dec_place.setListListener(p);
		p.Hdr_amt_dec_place.addAllListener(p);
	}

	/**
	 *  [List]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitList(MSBGP_BillDSel p) {
	}

	/**
	 *  [SlsInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSlsInfo(MSBGP_BillDSel p) {
	}

	/**
	 *  [DtlSls]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlSls(MSBGP_BillDSel p) {
		p.DtlSlsTable.addAllListener(p);
		p.columnDtlSls_check.addAllListener(p);
		p.columnDtlSls_bill_prnt_tgt_flg.addAllListener(p);
		p.columnDtlSls_bill_mtd_typ.addAllListener(p);
		p.columnDtlSls_bill_mtd_typ.setListListener(p);
		p.columnDtlSls_bill_mtd_typ_nm.addAllListener(p);
		p.columnDtlSls_bill_mtd_typ_nm.setListListener(p);
		p.columnDtlSls_bill_ym.addAllListener(p);
		p.columnDtlSls_bill_ym.setListListener(p);
		p.columnDtlSls_bill_cl_day.addAllListener(p);
		p.columnDtlSls_bill_cl_day.setListListener(p);
		p.columnDtlSls_ac_dt.addAllListener(p);
		p.columnDtlSls_ac_dt.setListListener(p);
		p.columnDtlSls_slip_sts_typ.addAllListener(p);
		p.columnDtlSls_slip_sts_typ.setListListener(p);
		p.columnDtlSls_slip_sts_typ_nm.addAllListener(p);
		p.columnDtlSls_slip_sts_typ_nm.setListListener(p);
		p.columnDtlSls_trd_cd.addAllListener(p);
		p.columnDtlSls_trd_cd.setListListener(p);
		p.columnDtlSls_trd_nm.addAllListener(p);
		p.columnDtlSls_trd_nm.setListListener(p);
		p.columnDtlSls_ar_typ.addAllListener(p);
		p.columnDtlSls_ar_typ.setListListener(p);
		p.columnDtlSls_ar_typ_nm.addAllListener(p);
		p.columnDtlSls_ar_typ_nm.setListListener(p);
		p.columnDtlSls_base_sls_ac_dt.addAllListener(p);
		p.columnDtlSls_base_sls_ac_dt.setListListener(p);
		p.columnDtlSls_act_no.addAllListener(p);
		p.columnDtlSls_act_no.setListListener(p);
		p.columnDtlSls_act_seq.addAllListener(p);
		p.columnDtlSls_act_seq.setListListener(p);
		p.columnDtlSls_act_rev.addAllListener(p);
		p.columnDtlSls_act_rev.setListListener(p);
		p.columnDtlSls_act_d_no.addAllListener(p);
		p.columnDtlSls_act_d_no.setListListener(p);
		p.columnDtlSls_act_d_seq.addAllListener(p);
		p.columnDtlSls_act_d_seq.setListListener(p);
		p.columnDtlSls_cst_itm_cd.addAllListener(p);
		p.columnDtlSls_cst_itm_cd.setListListener(p);
		p.columnDtlSls_cst_itm_nm.addAllListener(p);
		p.columnDtlSls_cst_itm_nm.setListListener(p);
		p.columnDtlSls_trd_unit_cd.addAllListener(p);
		p.columnDtlSls_trd_unit_cd.setListListener(p);
		p.columnDtlSls_trd_unit_nm.addAllListener(p);
		p.columnDtlSls_trd_unit_nm.setListListener(p);
		p.columnDtlSls_inc_tax_flg.addAllListener(p);
		p.columnDtlSls_interim_flg.addAllListener(p);
		p.columnDtlSls_tax_cd.addAllListener(p);
		p.columnDtlSls_tax_cd.setListListener(p);
		p.columnDtlSls_tax_nm.addAllListener(p);
		p.columnDtlSls_tax_nm.setListListener(p);
		p.columnDtlSls_tax_rate.addAllListener(p);
		p.columnDtlSls_tax_rate.setListListener(p);
		p.columnDtlSls_dlv_dt.addAllListener(p);
		p.columnDtlSls_dlv_dt.setListListener(p);
		p.columnDtlSls_bill_basis_dt.addAllListener(p);
		p.columnDtlSls_bill_basis_dt.setListListener(p);
		p.columnDtlSls_bill_crryovr_times.addAllListener(p);
		p.columnDtlSls_bill_crryovr_times.setListListener(p);
		p.columnDtlSls_cst_cd.addAllListener(p);
		p.columnDtlSls_cst_cd.setListListener(p);
		p.columnDtlSls_cst_nm.addAllListener(p);
		p.columnDtlSls_cst_nm.setListListener(p);
		p.columnDtlSls_scst_cd.addAllListener(p);
		p.columnDtlSls_scst_cd.setListListener(p);
		p.columnDtlSls_scst_nm.addAllListener(p);
		p.columnDtlSls_scst_nm.setListListener(p);
		p.columnDtlSls_dest_cd1.addAllListener(p);
		p.columnDtlSls_dest_cd1.setListListener(p);
		p.columnDtlSls_dest_nm1.addAllListener(p);
		p.columnDtlSls_dest_nm1.setListListener(p);
		p.columnDtlSls_dest_cd2.addAllListener(p);
		p.columnDtlSls_dest_cd2.setListListener(p);
		p.columnDtlSls_dest_nm2.addAllListener(p);
		p.columnDtlSls_dest_nm2.setListListener(p);
		p.columnDtlSls_dest_cd3.addAllListener(p);
		p.columnDtlSls_dest_cd3.setListListener(p);
		p.columnDtlSls_dest_nm3.addAllListener(p);
		p.columnDtlSls_dest_nm3.setListListener(p);
		p.columnDtlSls_sls_dpt_cd.addAllListener(p);
		p.columnDtlSls_sls_dpt_cd.setListListener(p);
		p.columnDtlSls_sls_dpt_nm.addAllListener(p);
		p.columnDtlSls_sls_dpt_nm.setListListener(p);
		p.columnDtlSls_sls_usr_cd.addAllListener(p);
		p.columnDtlSls_sls_usr_cd.setListListener(p);
		p.columnDtlSls_sls_usr_nm.addAllListener(p);
		p.columnDtlSls_sls_usr_nm.setListListener(p);
		p.columnDtlSls_slo_no.addAllListener(p);
		p.columnDtlSls_slo_no.setListListener(p);
		p.columnDtlSls_slo_d_no.addAllListener(p);
		p.columnDtlSls_slo_d_no.setListListener(p);
		p.columnDtlSls_cst_po_no.addAllListener(p);
		p.columnDtlSls_cst_po_no.setListListener(p);
		p.columnDtlSls_cst_po_d_no.addAllListener(p);
		p.columnDtlSls_cst_po_d_no.setListListener(p);
		p.columnDtlSls_dlv_slip_no.addAllListener(p);
		p.columnDtlSls_dlv_slip_no.setListListener(p);
		p.columnDtlSls_dlv_slip_d_no.addAllListener(p);
		p.columnDtlSls_dlv_slip_d_no.setListListener(p);
		p.columnDtlSls_ship_dlv_slip_no.addAllListener(p);
		p.columnDtlSls_ship_dlv_slip_no.setListListener(p);
		p.columnDtlSls_ship_dlv_slip_d_no.addAllListener(p);
		p.columnDtlSls_ship_dlv_slip_d_no.setListListener(p);
		p.columnDtlSls_ship_dlv_slip_multi_flg.addAllListener(p);
		p.columnDtlSls_wrk_no.addAllListener(p);
		p.columnDtlSls_wrk_no.setListListener(p);
		p.columnDtlSls_wrk_nm.addAllListener(p);
		p.columnDtlSls_wrk_nm.setListListener(p);
		p.columnDtlSls_sls_wrk_no.addAllListener(p);
		p.columnDtlSls_sls_wrk_no.setListListener(p);
		p.columnDtlSls_sls_wrk_nm.addAllListener(p);
		p.columnDtlSls_sls_wrk_nm.setListListener(p);
		p.columnDtlSls_trd_d_rmrks.addAllListener(p);
		p.columnDtlSls_trd_d_rmrks.setListListener(p);
		p.columnDtlSls_bill_d_no.addAllListener(p);
		p.columnDtlSls_bill_d_no.setListListener(p);
		p.columnDtlSls_schd_bill_dt.addAllListener(p);
		p.columnDtlSls_schd_bill_dt.setListListener(p);
		p.columnDtlSls_ar_trd_grp_typ.addAllListener(p);
		p.columnDtlSls_ar_trd_grp_typ.setListListener(p);
		p.columnDtlSls_dec_place.addAllListener(p);
		p.columnDtlSls_dec_place.setListListener(p);
		p.columnDtlSls_amt_dec_place.addAllListener(p);
		p.columnDtlSls_amt_dec_place.setListListener(p);
		p.columnDtlSls_upri_dec_place.addAllListener(p);
		p.columnDtlSls_upri_dec_place.setListListener(p);
		p.columnDtlSls_sls_amt_rnd_typ.addAllListener(p);
		p.columnDtlSls_sls_amt_rnd_typ.setListListener(p);
		p.columnDtlSls_sls_tax_rnd_typ.addAllListener(p);
		p.columnDtlSls_sls_tax_rnd_typ.setListListener(p);
		p.columnDtlSls_trd_ptn_typ.addAllListener(p);
		p.columnDtlSls_trd_ptn_typ.setListListener(p);
		p.columnDtlSls_bill_can_slip_typ.addAllListener(p);
		p.columnDtlSls_bill_can_slip_typ.setListListener(p);
		p.columnDtlSls_sls_interim_cl_flg.addAllListener(p);
		p.columnDtlSls_row_num.addAllListener(p);
		p.columnDtlSls_row_num.setListListener(p);
		p.columnDtlSls_crryovr_flg.addAllListener(p);
		p.columnDtlSls_bill_dtl_subttl_typ.addAllListener(p);
		p.columnDtlSls_bill_dtl_subttl_typ.setListListener(p);
		p.columnDtlSls_acst_cd.addAllListener(p);
		p.columnDtlSls_acst_cd.setListListener(p);
		p.columnDtlSls_sls_dtl_outp_typ.addAllListener(p);
		p.columnDtlSls_sls_dtl_outp_typ.setListListener(p);
	}

	/**
	 *  [DtlSlsBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlSlsBtn(MSBGP_BillDSel p) {
		p.DtlSlsBtn_sls_select_all.addAllListener(p);
		p.DtlSlsBtn_sls_select_all.setAPMethodName("doDtlSlsBtn_sls_select_all");
		p.DtlSlsBtn_sls_deselect_all.addAllListener(p);
		p.DtlSlsBtn_sls_deselect_all.setAPMethodName("doDtlSlsBtn_sls_deselect_all");
	}

	/**
	 *  [RcvInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvInfo(MSBGP_BillDSel p) {
	}

	/**
	 *  [Rcv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcv(MSBGP_BillDSel p) {
	}

	/**
	 *  [Adv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAdv(MSBGP_BillDSel p) {
	}

	/**
	 *  [DtlRcv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlRcv(MSBGP_BillDSel p) {
		p.DtlRcvTable.addAllListener(p);
		p.columnDtlRcv_check.addAllListener(p);
		p.columnDtlRcv_bill_ym.addAllListener(p);
		p.columnDtlRcv_bill_ym.setListListener(p);
		p.columnDtlRcv_bill_cl_day.addAllListener(p);
		p.columnDtlRcv_bill_cl_day.setListListener(p);
		p.columnDtlRcv_ac_dt.addAllListener(p);
		p.columnDtlRcv_ac_dt.setListListener(p);
		p.columnDtlRcv_slip_sts_typ.addAllListener(p);
		p.columnDtlRcv_slip_sts_typ.setListListener(p);
		p.columnDtlRcv_slip_sts_typ_nm.addAllListener(p);
		p.columnDtlRcv_slip_sts_typ_nm.setListListener(p);
		p.columnDtlRcv_trd_cd.addAllListener(p);
		p.columnDtlRcv_trd_cd.setListListener(p);
		p.columnDtlRcv_trd_nm.addAllListener(p);
		p.columnDtlRcv_trd_nm.setListListener(p);
		p.columnDtlRcv_ar_typ.addAllListener(p);
		p.columnDtlRcv_ar_typ.setListListener(p);
		p.columnDtlRcv_ar_typ_nm.addAllListener(p);
		p.columnDtlRcv_ar_typ_nm.setListListener(p);
		p.columnDtlRcv_act_no.addAllListener(p);
		p.columnDtlRcv_act_no.setListListener(p);
		p.columnDtlRcv_act_seq.addAllListener(p);
		p.columnDtlRcv_act_seq.setListListener(p);
		p.columnDtlRcv_act_rev.addAllListener(p);
		p.columnDtlRcv_act_rev.setListListener(p);
		p.columnDtlRcv_act_d_no.addAllListener(p);
		p.columnDtlRcv_act_d_no.setListListener(p);
		p.columnDtlRcv_act_d_seq.addAllListener(p);
		p.columnDtlRcv_act_d_seq.setListListener(p);
		p.columnDtlRcv_rcv_mtd_cd.addAllListener(p);
		p.columnDtlRcv_rcv_mtd_cd.setListListener(p);
		p.columnDtlRcv_rcv_mtd_nm.addAllListener(p);
		p.columnDtlRcv_rcv_mtd_nm.setListListener(p);
		p.columnDtlRcv_setoff_tax_cd.addAllListener(p);
		p.columnDtlRcv_setoff_tax_cd.setListListener(p);
		p.columnDtlRcv_setoff_tax_nm.addAllListener(p);
		p.columnDtlRcv_setoff_tax_nm.setListListener(p);
		p.columnDtlRcv_setoff_tax_rate.addAllListener(p);
		p.columnDtlRcv_setoff_tax_rate.setListListener(p);
		p.columnDtlRcv_rcv_dt.addAllListener(p);
		p.columnDtlRcv_rcv_dt.setListListener(p);
		p.columnDtlRcv_bill_basis_dt.addAllListener(p);
		p.columnDtlRcv_bill_basis_dt.setListListener(p);
		p.columnDtlRcv_bill_crryovr_times.addAllListener(p);
		p.columnDtlRcv_bill_crryovr_times.setListListener(p);
		p.columnDtlRcv_wrk_no.addAllListener(p);
		p.columnDtlRcv_wrk_no.setListListener(p);
		p.columnDtlRcv_wrk_nm.addAllListener(p);
		p.columnDtlRcv_wrk_nm.setListListener(p);
		p.columnDtlRcv_bill_d_rmrks.addAllListener(p);
		p.columnDtlRcv_bill_d_rmrks.setListListener(p);
		p.columnDtlRcv_bill_d_no.addAllListener(p);
		p.columnDtlRcv_bill_d_no.setListListener(p);
		p.columnDtlRcv_schd_bill_dt.addAllListener(p);
		p.columnDtlRcv_schd_bill_dt.setListListener(p);
		p.columnDtlRcv_bill_can_slip_typ.addAllListener(p);
		p.columnDtlRcv_bill_can_slip_typ.setListListener(p);
		p.columnDtlRcv_sls_interim_cl_flg.addAllListener(p);
		p.columnDtlRcv_bill_tax_disp_flg.addAllListener(p);
	}

	/**
	 *  [DtlRcvBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlRcvBtn(MSBGP_BillDSel p) {
		p.DtlRcvBtn_rcv_select_all.addAllListener(p);
		p.DtlRcvBtn_rcv_select_all.setAPMethodName("doDtlRcvBtn_rcv_select_all");
		p.DtlRcvBtn_rcv_deselect_all.addAllListener(p);
		p.DtlRcvBtn_rcv_deselect_all.setAPMethodName("doDtlRcvBtn_rcv_deselect_all");
	}

	/**
	 *  [DtlAdv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlAdv(MSBGP_BillDSel p) {
		p.DtlAdvTable.addAllListener(p);
		p.columnDtlAdv_check.addAllListener(p);
		p.columnDtlAdv_ac_dt.addAllListener(p);
		p.columnDtlAdv_ac_dt.setListListener(p);
		p.columnDtlAdv_slip_sts_typ.addAllListener(p);
		p.columnDtlAdv_slip_sts_typ.setListListener(p);
		p.columnDtlAdv_slip_sts_typ_nm.addAllListener(p);
		p.columnDtlAdv_slip_sts_typ_nm.setListListener(p);
		p.columnDtlAdv_trd_cd.addAllListener(p);
		p.columnDtlAdv_trd_cd.setListListener(p);
		p.columnDtlAdv_trd_nm.addAllListener(p);
		p.columnDtlAdv_trd_nm.setListListener(p);
		p.columnDtlAdv_rcv_act_no.addAllListener(p);
		p.columnDtlAdv_rcv_act_no.setListListener(p);
		p.columnDtlAdv_rcv_act_seq.addAllListener(p);
		p.columnDtlAdv_rcv_act_seq.setListListener(p);
		p.columnDtlAdv_rcv_act_rev.addAllListener(p);
		p.columnDtlAdv_rcv_act_rev.setListListener(p);
		p.columnDtlAdv_rcv_act_d_no.addAllListener(p);
		p.columnDtlAdv_rcv_act_d_no.setListListener(p);
		p.columnDtlAdv_rcv_act_d_seq.addAllListener(p);
		p.columnDtlAdv_rcv_act_d_seq.setListListener(p);
		p.columnDtlAdv_rcv_act_upd_cntr.addAllListener(p);
		p.columnDtlAdv_rcv_act_upd_cntr.setListListener(p);
		p.columnDtlAdv_rcv_dt.addAllListener(p);
		p.columnDtlAdv_rcv_dt.setListListener(p);
		p.columnDtlAdv_setoff_tax_cd.addAllListener(p);
		p.columnDtlAdv_setoff_tax_cd.setListListener(p);
		p.columnDtlAdv_setoff_tax_nm.addAllListener(p);
		p.columnDtlAdv_setoff_tax_nm.setListListener(p);
		p.columnDtlAdv_setoff_tax_rate.addAllListener(p);
		p.columnDtlAdv_setoff_tax_rate.setListListener(p);
		p.columnDtlAdv_bill_tax_disp_flg.addAllListener(p);
	}

	/**
	 *  [DtlAdvBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlAdvBtn(MSBGP_BillDSel p) {
		p.DtlAdvBtn_adv_select_all.addAllListener(p);
		p.DtlAdvBtn_adv_select_all.setAPMethodName("doDtlAdvBtn_adv_select_all");
		p.DtlAdvBtn_adv_deselect_all.addAllListener(p);
		p.DtlAdvBtn_adv_deselect_all.setAPMethodName("doDtlAdvBtn_adv_deselect_all");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_BillDSel p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_BillDSel p){
		p.Cnd_bill_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bill_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wrkno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_base_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBGP_BillDSel p){
		p.Hdr_lastBillAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcvAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_bfwAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_slsAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_retAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscntAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_setoffAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_taxAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_swToAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_billAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.ENABLE);
		p.Hdr_billAmt_p_PPanel.Amt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_List(MSBGP_BillDSel p){

	}

	/**
	 * [SRCH]ステータスの[SlsInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SlsInfo(MSBGP_BillDSel p){

	}

	/**
	 * [SRCH]ステータスの[DtlSls]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlSls(MSBGP_BillDSel p){
		p.columnDtlSls_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtlSls_bill_prnt_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_bill_mtd_typ.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtlSls_bill_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlSls_prtAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlSls_prtAmt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlSls_prtIncTaxAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlSls_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlSls_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlSls_incTaxAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlSls_dscntAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtlSls_bill_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_bill_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_base_sls_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlSls_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlSls_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlSls_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtlSls_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlSls_unitQty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSls_inc_tax_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlSls_curUpri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtlSls_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlSls_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.DtlSls_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.DtlSls_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlSls_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlSls_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlSls_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtlSls_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_bill_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_scst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_scst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ship_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ship_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ship_dlv_slip_multi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_bill_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_schd_bill_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_ar_trd_grp_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_sls_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_sls_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_bill_can_slip_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_sls_interim_cl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_row_num.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_crryovr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_bill_dtl_subttl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_acst_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSls_sls_dtl_outp_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[DtlSlsBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlSlsBtn(MSBGP_BillDSel p){
		p.DtlSlsBtn_sls_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlSlsBtn_sls_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DtlSlsSub]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlSlsSub(MSBGP_BillDSel p){

	}

	/**
	 * [SRCH]ステータスの[RcvInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcvInfo(MSBGP_BillDSel p){

	}

	/**
	 * [SRCH]ステータスの[Rcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rcv(MSBGP_BillDSel p){

	}

	/**
	 * [SRCH]ステータスの[Adv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Adv(MSBGP_BillDSel p){

	}

	/**
	 * [SRCH]ステータスの[DtlRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlRcv(MSBGP_BillDSel p){
		p.columnDtlRcv_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtlRcv_bill_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_bill_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlRcv_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlRcv_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlRcv_rcv_mtd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_rcv_mtd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlRcv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlRcv_setoffAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlRcv_setoffTaxAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtlRcv_setoff_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_setoff_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_setoff_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_bill_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_bill_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_bill_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlRcv_schd_bill_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlRcv_bill_can_slip_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlRcv_sls_interim_cl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlRcv_bill_tax_disp_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[DtlRcvBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlRcvBtn(MSBGP_BillDSel p){
		p.DtlRcvBtn_rcv_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlRcvBtn_rcv_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DtlAdv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlAdv(MSBGP_BillDSel p){
		p.columnDtlAdv_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtlAdv_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlAdv_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlAdv_rcv_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlAdv_rcv_act_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlAdv_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlAdv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAdv_setoffAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.DtlAdv_setoffTaxAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtlAdv_setoff_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_setoff_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_setoff_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_bill_tax_disp_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[DtlAdvBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlAdvBtn(MSBGP_BillDSel p){
		p.DtlAdvBtn_adv_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlAdvBtn_adv_deselect_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_BillDSel p){
		p.Btn_upd.putMode(p, SRCH, MCMode.ENABLE);

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
		MSBGP_BillDSel_MC.setTableConfigDtlSls((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.setTableConfigDtlRcv((MSBGP_BillDSel)this);
		MSBGP_BillDSel_MC.setTableConfigDtlAdv((MSBGP_BillDSel)this);
	}

	/**
	 * [DtlSls]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlSls(MSBGP_BillDSel p) {
		p.columnDtlSls_check.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.check_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_check);
		p.columnDtlSls_bill_prnt_tgt_flg.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_prnt_tgt_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_prnt_tgt_flg);
		p.columnDtlSls_bill_mtd_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_mtd_typ_META);
		p.columnDtlSls_bill_mtd_typ.addLinkBeans(p.columnDtlSls_bill_mtd_typ_nm);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_mtd_typ);
		p.columnDtlSls_bill_mtd_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_mtd_typ_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_mtd_typ_nm);
		p.DtlSlsTable.addTable(p.DtlSls_prtAmt_p_PPanel.AmtTable);
		p.DtlSlsTable.addTable(p.DtlSls_prtIncTaxAmt_p_PPanel.AmtTable);
		p.DtlSlsTable.addTable(p.DtlSls_amt_p_PPanel.AmtTable);
		p.DtlSlsTable.addTable(p.DtlSls_incTaxAmt_p_PPanel.AmtTable);
		p.DtlSlsTable.addTable(p.DtlSls_dscntAmt_p_PPanel.AmtTable);
		p.columnDtlSls_bill_ym.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_ym_META);
		p.columnDtlSls_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_ym);
		p.columnDtlSls_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_cl_day_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_cl_day);
		p.columnDtlSls_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.ac_dt_META);
		p.columnDtlSls_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ac_dt);
		p.columnDtlSls_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.slip_sts_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_slip_sts_typ);
		p.columnDtlSls_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.slip_sts_typ_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_slip_sts_typ_nm);
		p.columnDtlSls_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.trd_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_cd);
		p.columnDtlSls_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.trd_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_nm);
		p.columnDtlSls_ar_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.ar_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ar_typ);
		p.columnDtlSls_ar_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.ar_typ_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ar_typ_nm);
		p.columnDtlSls_base_sls_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.base_sls_ac_dt_META);
		p.columnDtlSls_base_sls_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_base_sls_ac_dt);
		p.columnDtlSls_act_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.act_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_act_no);
		p.columnDtlSls_act_seq.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.act_seq_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_act_seq);
		p.columnDtlSls_act_rev.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.act_rev_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_act_rev);
		p.columnDtlSls_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.act_d_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_act_d_no);
		p.columnDtlSls_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.act_d_seq_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_act_d_seq);
		p.DtlSlsTable.addTable(p.DtlSls_itm_p_PPanel.ItmTable);
		p.columnDtlSls_cst_itm_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.cst_itm_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_itm_cd);
		p.columnDtlSls_cst_itm_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.cst_itm_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_itm_nm);
		p.DtlSlsTable.addTable(p.DtlSls_sno_p_PPanel.SnoTable);
		p.columnDtlSls_trd_unit_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.trd_unit_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_unit_cd);
		p.columnDtlSls_trd_unit_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.trd_unit_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_unit_nm);
		p.DtlSlsTable.addTable(p.DtlSls_unitQty_p_PPanel.QtyTable);
		p.columnDtlSls_inc_tax_flg.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.inc_tax_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_inc_tax_flg);
		p.DtlSlsTable.addTable(p.DtlSls_curUpri_p_PPanel.UpriTable);
		p.columnDtlSls_interim_flg.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.interim_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_interim_flg);
		p.columnDtlSls_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.tax_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_tax_cd);
		p.columnDtlSls_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.tax_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_tax_nm);
		p.columnDtlSls_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.tax_rate_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_tax_rate);
		p.DtlSlsTable.addTable(p.DtlSls_xrate_p_PPanel.XrateTable);
		p.DtlSlsTable.addTable(p.DtlSls_base_cur_upri_p_PPanel.UpriTable);
		p.DtlSlsTable.addTable(p.DtlSls_base_cur_amt_p_PPanel.AmtTable);
		p.DtlSls_base_cur_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.DtlSlsTable.addTable(p.DtlSls_base_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlSls_base_cur_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.DtlSlsTable.addTable(p.DtlSls_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlSls_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.DtlSlsTable.addTable(p.DtlSls_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.DtlSls_base_cur_dscnt_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnDtlSls_dlv_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dlv_dt_META);
		p.columnDtlSls_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dlv_dt);
		p.columnDtlSls_bill_basis_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_basis_dt_META);
		p.columnDtlSls_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_basis_dt);
		p.columnDtlSls_bill_crryovr_times.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_crryovr_times_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_crryovr_times);
		p.columnDtlSls_cst_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.cst_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_cd);
		p.columnDtlSls_cst_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.cst_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_nm);
		p.columnDtlSls_scst_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.scst_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_scst_cd);
		p.columnDtlSls_scst_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.scst_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_scst_nm);
		p.columnDtlSls_dest_cd1.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dest_cd1_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dest_cd1);
		p.columnDtlSls_dest_nm1.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dest_nm1_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dest_nm1);
		p.columnDtlSls_dest_cd2.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dest_cd2_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dest_cd2);
		p.columnDtlSls_dest_nm2.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dest_nm2_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dest_nm2);
		p.columnDtlSls_dest_cd3.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dest_cd3_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dest_cd3);
		p.columnDtlSls_dest_nm3.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dest_nm3_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dest_nm3);
		p.columnDtlSls_sls_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_dpt_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_dpt_cd);
		p.columnDtlSls_sls_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_dpt_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_dpt_nm);
		p.columnDtlSls_sls_usr_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_usr_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_usr_cd);
		p.columnDtlSls_sls_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_usr_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_usr_nm);
		p.columnDtlSls_slo_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.slo_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_slo_no);
		p.columnDtlSls_slo_d_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.slo_d_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_slo_d_no);
		p.columnDtlSls_cst_po_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.cst_po_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_po_no);
		p.columnDtlSls_cst_po_d_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.cst_po_d_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_po_d_no);
		p.columnDtlSls_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dlv_slip_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dlv_slip_no);
		p.columnDtlSls_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dlv_slip_d_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dlv_slip_d_no);
		p.columnDtlSls_ship_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.ship_dlv_slip_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ship_dlv_slip_no);
		p.columnDtlSls_ship_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.ship_dlv_slip_d_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ship_dlv_slip_d_no);
		p.columnDtlSls_ship_dlv_slip_multi_flg.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.ship_dlv_slip_multi_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ship_dlv_slip_multi_flg);
		p.columnDtlSls_wrk_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.wrk_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_wrk_no);
		p.columnDtlSls_wrk_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.wrk_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_wrk_nm);
		p.columnDtlSls_sls_wrk_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_wrk_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_wrk_no);
		p.columnDtlSls_sls_wrk_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_wrk_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_wrk_nm);
		p.columnDtlSls_trd_d_rmrks.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.trd_d_rmrks_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_d_rmrks);
		p.columnDtlSls_bill_d_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_d_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_d_no);
		p.columnDtlSls_schd_bill_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.schd_bill_dt_META);
		p.columnDtlSls_schd_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_schd_bill_dt);
		p.columnDtlSls_ar_trd_grp_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.ar_trd_grp_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ar_trd_grp_typ);
		p.columnDtlSls_dec_place.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.dec_place_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dec_place);
		p.columnDtlSls_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.amt_dec_place_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_amt_dec_place);
		p.columnDtlSls_upri_dec_place.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.upri_dec_place_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_upri_dec_place);
		p.columnDtlSls_sls_amt_rnd_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_amt_rnd_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_amt_rnd_typ);
		p.columnDtlSls_sls_tax_rnd_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_tax_rnd_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_tax_rnd_typ);
		p.columnDtlSls_trd_ptn_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.trd_ptn_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_ptn_typ);
		p.columnDtlSls_bill_can_slip_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_can_slip_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_can_slip_typ);
		p.columnDtlSls_sls_interim_cl_flg.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_interim_cl_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_interim_cl_flg);
		p.columnDtlSls_row_num.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.row_num_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_row_num);
		p.columnDtlSls_crryovr_flg.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.crryovr_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_crryovr_flg);
		p.columnDtlSls_bill_dtl_subttl_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.bill_dtl_subttl_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_dtl_subttl_typ);
		p.columnDtlSls_acst_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.acst_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_acst_cd);
		p.columnDtlSls_sls_dtl_outp_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlSlsR.sls_dtl_outp_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_dtl_outp_typ);
		// スクロール固定カラムの指定
		p.DtlSlsTable.setUnscrollColumn(p.columnDtlSls_check);
	}

	/**
	 * [DtlRcv]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlRcv(MSBGP_BillDSel p) {
		p.columnDtlRcv_check.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.check_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_check);
		p.columnDtlRcv_bill_ym.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.bill_ym_META);
		p.columnDtlRcv_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_bill_ym);
		p.columnDtlRcv_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.bill_cl_day_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_bill_cl_day);
		p.columnDtlRcv_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.ac_dt_META);
		p.columnDtlRcv_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_ac_dt);
		p.columnDtlRcv_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.slip_sts_typ_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_slip_sts_typ);
		p.columnDtlRcv_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.slip_sts_typ_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_slip_sts_typ_nm);
		p.columnDtlRcv_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.trd_cd_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_trd_cd);
		p.columnDtlRcv_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.trd_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_trd_nm);
		p.columnDtlRcv_ar_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.ar_typ_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_ar_typ);
		p.columnDtlRcv_ar_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.ar_typ_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_ar_typ_nm);
		p.columnDtlRcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.act_no_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_act_no);
		p.columnDtlRcv_act_seq.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.act_seq_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_act_seq);
		p.columnDtlRcv_act_rev.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.act_rev_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_act_rev);
		p.columnDtlRcv_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.act_d_no_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_act_d_no);
		p.columnDtlRcv_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.act_d_seq_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_act_d_seq);
		p.columnDtlRcv_rcv_mtd_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.rcv_mtd_cd_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_mtd_cd);
		p.columnDtlRcv_rcv_mtd_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.rcv_mtd_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_mtd_nm);
		p.DtlRcvTable.addTable(p.DtlRcv_amt_p_PPanel.AmtTable);
		p.DtlRcvTable.addTable(p.DtlRcv_setoffAmt_p_PPanel.AmtTable);
		p.DtlRcvTable.addTable(p.DtlRcv_setoffTaxAmt_p_PPanel.AmtTable);
		p.columnDtlRcv_setoff_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.setoff_tax_cd_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_setoff_tax_cd);
		p.columnDtlRcv_setoff_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.setoff_tax_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_setoff_tax_nm);
		p.columnDtlRcv_setoff_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.setoff_tax_rate_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_setoff_tax_rate);
		p.columnDtlRcv_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.rcv_dt_META);
		p.columnDtlRcv_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_dt);
		p.columnDtlRcv_bill_basis_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.bill_basis_dt_META);
		p.columnDtlRcv_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_bill_basis_dt);
		p.columnDtlRcv_bill_crryovr_times.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.bill_crryovr_times_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_bill_crryovr_times);
		p.columnDtlRcv_wrk_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.wrk_no_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_wrk_no);
		p.columnDtlRcv_wrk_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.wrk_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_wrk_nm);
		p.columnDtlRcv_bill_d_rmrks.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.bill_d_rmrks_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_bill_d_rmrks);
		p.columnDtlRcv_bill_d_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.bill_d_no_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_bill_d_no);
		p.columnDtlRcv_schd_bill_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.schd_bill_dt_META);
		p.columnDtlRcv_schd_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_schd_bill_dt);
		p.columnDtlRcv_bill_can_slip_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.bill_can_slip_typ_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_bill_can_slip_typ);
		p.columnDtlRcv_sls_interim_cl_flg.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.sls_interim_cl_flg_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_sls_interim_cl_flg);
		p.columnDtlRcv_bill_tax_disp_flg.setMeta(mcframe.clientMSBG.MSBGP0020.DtlRcvR.bill_tax_disp_flg_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_bill_tax_disp_flg);
		// スクロール固定カラムの指定
		p.DtlRcvTable.setUnscrollColumn(p.columnDtlRcv_check);
	}

	/**
	 * [DtlAdv]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlAdv(MSBGP_BillDSel p) {
		p.columnDtlAdv_check.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.check_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_check);
		p.columnDtlAdv_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.ac_dt_META);
		p.columnDtlAdv_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_ac_dt);
		p.columnDtlAdv_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.slip_sts_typ_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_slip_sts_typ);
		p.columnDtlAdv_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.slip_sts_typ_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_slip_sts_typ_nm);
		p.columnDtlAdv_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.trd_cd_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_trd_cd);
		p.columnDtlAdv_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.trd_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_trd_nm);
		p.columnDtlAdv_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.rcv_act_no_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_no);
		p.columnDtlAdv_rcv_act_seq.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.rcv_act_seq_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_seq);
		p.columnDtlAdv_rcv_act_rev.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.rcv_act_rev_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_rev);
		p.columnDtlAdv_rcv_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.rcv_act_d_no_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_d_no);
		p.columnDtlAdv_rcv_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.rcv_act_d_seq_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_d_seq);
		p.columnDtlAdv_rcv_act_upd_cntr.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.rcv_act_upd_cntr_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_upd_cntr);
		p.columnDtlAdv_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.rcv_dt_META);
		p.columnDtlAdv_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_dt);
		p.DtlAdvTable.addTable(p.DtlAdv_amt_p_PPanel.AmtTable);
		p.DtlAdvTable.addTable(p.DtlAdv_setoffAmt_p_PPanel.AmtTable);
		p.DtlAdvTable.addTable(p.DtlAdv_setoffTaxAmt_p_PPanel.AmtTable);
		p.columnDtlAdv_setoff_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.setoff_tax_cd_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_setoff_tax_cd);
		p.columnDtlAdv_setoff_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.setoff_tax_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_setoff_tax_nm);
		p.columnDtlAdv_setoff_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.setoff_tax_rate_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_setoff_tax_rate);
		p.columnDtlAdv_bill_tax_disp_flg.setMeta(mcframe.clientMSBG.MSBGP0020.DtlAdvR.bill_tax_disp_flg_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_bill_tax_disp_flg);
		// スクロール固定カラムの指定
		p.DtlAdvTable.setUnscrollColumn(p.columnDtlAdv_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_base_cur_cd.getListConfig().setPutter(getCnd_base_cur_cd_ListPutter());
		columnDtlSls_bill_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlSls_bill_mtd_typ.getListConfig().setPutter(getDtlSls_bill_mtd_typ_ListPutter());
		columnDtlSls_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlSls_trd_unit_cd.getListConfig().setPutter(getDtlSls_trd_unit_cd_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
	}

	/**
	 * [Cnd_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [DtlSls_bill_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlSls_bill_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.BillMtdTyp");
		return lp;
	}
	 
	/**
	 * [DtlSls_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlSls_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_base_cur_cd) return getCnd_base_cur_cd(row, info);
		if(combo == columnDtlSls_bill_mtd_typ) return getDtlSls_bill_mtd_typ(row, info);
		if(combo == columnDtlSls_trd_unit_cd) return getDtlSls_trd_unit_cd(row, info);
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
		else if (ap == DtlSlsBtn_sls_select_all) doDtlSlsBtn_sls_select_all(info);
		else if (ap == DtlSlsBtn_sls_deselect_all) doDtlSlsBtn_sls_deselect_all(info);
		else if (ap == DtlRcvBtn_rcv_select_all) doDtlRcvBtn_rcv_select_all(info);
		else if (ap == DtlRcvBtn_rcv_deselect_all) doDtlRcvBtn_rcv_deselect_all(info);
		else if (ap == DtlAdvBtn_adv_select_all) doDtlAdvBtn_adv_select_all(info);
		else if (ap == DtlAdvBtn_adv_deselect_all) doDtlAdvBtn_adv_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [DtlSlsBtn]パネルの[sls_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlSlsBtn_sls_select_all(MCEventInfo info);

	/**
	 * [DtlSlsBtn]パネルの[sls_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlSlsBtn_sls_deselect_all(MCEventInfo info);

	/**
	 * [DtlRcvBtn]パネルの[rcv_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlRcvBtn_rcv_select_all(MCEventInfo info);

	/**
	 * [DtlRcvBtn]パネルの[rcv_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlRcvBtn_rcv_deselect_all(MCEventInfo info);

	/**
	 * [DtlAdvBtn]パネルの[adv_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlAdvBtn_adv_select_all(MCEventInfo info);

	/**
	 * [DtlAdvBtn]パネルの[adv_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlAdvBtn_adv_deselect_all(MCEventInfo info);

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
		if (vc == DtlSlsTable) return doDtlSls_VC(info);
		if (vc == DtlRcvTable) return doDtlRcv_VC(info);
		if (vc == DtlAdvTable) return doDtlAdv_VC(info);
		if (vc == Cnd_bill_ym) return doCnd_bill_ym_VC(info);
		if (vc == Cnd_bill_cl_day) return doCnd_bill_cl_day_VC(info);
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_bill_dpt_cd) return doCnd_bill_dpt_cd_VC(info);
		if (vc == Cnd_bill_dpt_nm) return doCnd_bill_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_base_cur_cd) return doCnd_base_cur_cd_VC(info);
		if (vc == Cnd_base_cur_nm) return doCnd_base_cur_nm_VC(info);
		if (vc == Cnd_base_cur_amt_dec_place) return doCnd_base_cur_amt_dec_place_VC(info);
		if (vc == Cnd_base_cur_upri_dec_place) return doCnd_base_cur_upri_dec_place_VC(info);
		if (vc == Hdr_amt_dec_place) return doHdr_amt_dec_place_VC(info);
		if (vc == columnDtlSls_check) return doDtlSls_check_VC(info);
		if (vc == columnDtlSls_bill_prnt_tgt_flg) return doDtlSls_bill_prnt_tgt_flg_VC(info);
		if (vc == columnDtlSls_bill_mtd_typ) return doDtlSls_bill_mtd_typ_VC(info);
		if (vc == columnDtlSls_bill_mtd_typ_nm) return doDtlSls_bill_mtd_typ_nm_VC(info);
		if (vc == columnDtlSls_bill_ym) return doDtlSls_bill_ym_VC(info);
		if (vc == columnDtlSls_bill_cl_day) return doDtlSls_bill_cl_day_VC(info);
		if (vc == columnDtlSls_ac_dt) return doDtlSls_ac_dt_VC(info);
		if (vc == columnDtlSls_slip_sts_typ) return doDtlSls_slip_sts_typ_VC(info);
		if (vc == columnDtlSls_slip_sts_typ_nm) return doDtlSls_slip_sts_typ_nm_VC(info);
		if (vc == columnDtlSls_trd_cd) return doDtlSls_trd_cd_VC(info);
		if (vc == columnDtlSls_trd_nm) return doDtlSls_trd_nm_VC(info);
		if (vc == columnDtlSls_ar_typ) return doDtlSls_ar_typ_VC(info);
		if (vc == columnDtlSls_ar_typ_nm) return doDtlSls_ar_typ_nm_VC(info);
		if (vc == columnDtlSls_base_sls_ac_dt) return doDtlSls_base_sls_ac_dt_VC(info);
		if (vc == columnDtlSls_act_no) return doDtlSls_act_no_VC(info);
		if (vc == columnDtlSls_act_seq) return doDtlSls_act_seq_VC(info);
		if (vc == columnDtlSls_act_rev) return doDtlSls_act_rev_VC(info);
		if (vc == columnDtlSls_act_d_no) return doDtlSls_act_d_no_VC(info);
		if (vc == columnDtlSls_act_d_seq) return doDtlSls_act_d_seq_VC(info);
		if (vc == columnDtlSls_cst_itm_cd) return doDtlSls_cst_itm_cd_VC(info);
		if (vc == columnDtlSls_cst_itm_nm) return doDtlSls_cst_itm_nm_VC(info);
		if (vc == columnDtlSls_trd_unit_cd) return doDtlSls_trd_unit_cd_VC(info);
		if (vc == columnDtlSls_trd_unit_nm) return doDtlSls_trd_unit_nm_VC(info);
		if (vc == columnDtlSls_inc_tax_flg) return doDtlSls_inc_tax_flg_VC(info);
		if (vc == columnDtlSls_interim_flg) return doDtlSls_interim_flg_VC(info);
		if (vc == columnDtlSls_tax_cd) return doDtlSls_tax_cd_VC(info);
		if (vc == columnDtlSls_tax_nm) return doDtlSls_tax_nm_VC(info);
		if (vc == columnDtlSls_tax_rate) return doDtlSls_tax_rate_VC(info);
		if (vc == columnDtlSls_dlv_dt) return doDtlSls_dlv_dt_VC(info);
		if (vc == columnDtlSls_bill_basis_dt) return doDtlSls_bill_basis_dt_VC(info);
		if (vc == columnDtlSls_bill_crryovr_times) return doDtlSls_bill_crryovr_times_VC(info);
		if (vc == columnDtlSls_cst_cd) return doDtlSls_cst_cd_VC(info);
		if (vc == columnDtlSls_cst_nm) return doDtlSls_cst_nm_VC(info);
		if (vc == columnDtlSls_scst_cd) return doDtlSls_scst_cd_VC(info);
		if (vc == columnDtlSls_scst_nm) return doDtlSls_scst_nm_VC(info);
		if (vc == columnDtlSls_dest_cd1) return doDtlSls_dest_cd1_VC(info);
		if (vc == columnDtlSls_dest_nm1) return doDtlSls_dest_nm1_VC(info);
		if (vc == columnDtlSls_dest_cd2) return doDtlSls_dest_cd2_VC(info);
		if (vc == columnDtlSls_dest_nm2) return doDtlSls_dest_nm2_VC(info);
		if (vc == columnDtlSls_dest_cd3) return doDtlSls_dest_cd3_VC(info);
		if (vc == columnDtlSls_dest_nm3) return doDtlSls_dest_nm3_VC(info);
		if (vc == columnDtlSls_sls_dpt_cd) return doDtlSls_sls_dpt_cd_VC(info);
		if (vc == columnDtlSls_sls_dpt_nm) return doDtlSls_sls_dpt_nm_VC(info);
		if (vc == columnDtlSls_sls_usr_cd) return doDtlSls_sls_usr_cd_VC(info);
		if (vc == columnDtlSls_sls_usr_nm) return doDtlSls_sls_usr_nm_VC(info);
		if (vc == columnDtlSls_slo_no) return doDtlSls_slo_no_VC(info);
		if (vc == columnDtlSls_slo_d_no) return doDtlSls_slo_d_no_VC(info);
		if (vc == columnDtlSls_cst_po_no) return doDtlSls_cst_po_no_VC(info);
		if (vc == columnDtlSls_cst_po_d_no) return doDtlSls_cst_po_d_no_VC(info);
		if (vc == columnDtlSls_dlv_slip_no) return doDtlSls_dlv_slip_no_VC(info);
		if (vc == columnDtlSls_dlv_slip_d_no) return doDtlSls_dlv_slip_d_no_VC(info);
		if (vc == columnDtlSls_ship_dlv_slip_no) return doDtlSls_ship_dlv_slip_no_VC(info);
		if (vc == columnDtlSls_ship_dlv_slip_d_no) return doDtlSls_ship_dlv_slip_d_no_VC(info);
		if (vc == columnDtlSls_ship_dlv_slip_multi_flg) return doDtlSls_ship_dlv_slip_multi_flg_VC(info);
		if (vc == columnDtlSls_wrk_no) return doDtlSls_wrk_no_VC(info);
		if (vc == columnDtlSls_wrk_nm) return doDtlSls_wrk_nm_VC(info);
		if (vc == columnDtlSls_sls_wrk_no) return doDtlSls_sls_wrk_no_VC(info);
		if (vc == columnDtlSls_sls_wrk_nm) return doDtlSls_sls_wrk_nm_VC(info);
		if (vc == columnDtlSls_trd_d_rmrks) return doDtlSls_trd_d_rmrks_VC(info);
		if (vc == columnDtlSls_bill_d_no) return doDtlSls_bill_d_no_VC(info);
		if (vc == columnDtlSls_schd_bill_dt) return doDtlSls_schd_bill_dt_VC(info);
		if (vc == columnDtlSls_ar_trd_grp_typ) return doDtlSls_ar_trd_grp_typ_VC(info);
		if (vc == columnDtlSls_dec_place) return doDtlSls_dec_place_VC(info);
		if (vc == columnDtlSls_amt_dec_place) return doDtlSls_amt_dec_place_VC(info);
		if (vc == columnDtlSls_upri_dec_place) return doDtlSls_upri_dec_place_VC(info);
		if (vc == columnDtlSls_sls_amt_rnd_typ) return doDtlSls_sls_amt_rnd_typ_VC(info);
		if (vc == columnDtlSls_sls_tax_rnd_typ) return doDtlSls_sls_tax_rnd_typ_VC(info);
		if (vc == columnDtlSls_trd_ptn_typ) return doDtlSls_trd_ptn_typ_VC(info);
		if (vc == columnDtlSls_bill_can_slip_typ) return doDtlSls_bill_can_slip_typ_VC(info);
		if (vc == columnDtlSls_sls_interim_cl_flg) return doDtlSls_sls_interim_cl_flg_VC(info);
		if (vc == columnDtlSls_row_num) return doDtlSls_row_num_VC(info);
		if (vc == columnDtlSls_crryovr_flg) return doDtlSls_crryovr_flg_VC(info);
		if (vc == columnDtlSls_bill_dtl_subttl_typ) return doDtlSls_bill_dtl_subttl_typ_VC(info);
		if (vc == columnDtlSls_acst_cd) return doDtlSls_acst_cd_VC(info);
		if (vc == columnDtlSls_sls_dtl_outp_typ) return doDtlSls_sls_dtl_outp_typ_VC(info);
		if (vc == columnDtlRcv_check) return doDtlRcv_check_VC(info);
		if (vc == columnDtlRcv_bill_ym) return doDtlRcv_bill_ym_VC(info);
		if (vc == columnDtlRcv_bill_cl_day) return doDtlRcv_bill_cl_day_VC(info);
		if (vc == columnDtlRcv_ac_dt) return doDtlRcv_ac_dt_VC(info);
		if (vc == columnDtlRcv_slip_sts_typ) return doDtlRcv_slip_sts_typ_VC(info);
		if (vc == columnDtlRcv_slip_sts_typ_nm) return doDtlRcv_slip_sts_typ_nm_VC(info);
		if (vc == columnDtlRcv_trd_cd) return doDtlRcv_trd_cd_VC(info);
		if (vc == columnDtlRcv_trd_nm) return doDtlRcv_trd_nm_VC(info);
		if (vc == columnDtlRcv_ar_typ) return doDtlRcv_ar_typ_VC(info);
		if (vc == columnDtlRcv_ar_typ_nm) return doDtlRcv_ar_typ_nm_VC(info);
		if (vc == columnDtlRcv_act_no) return doDtlRcv_act_no_VC(info);
		if (vc == columnDtlRcv_act_seq) return doDtlRcv_act_seq_VC(info);
		if (vc == columnDtlRcv_act_rev) return doDtlRcv_act_rev_VC(info);
		if (vc == columnDtlRcv_act_d_no) return doDtlRcv_act_d_no_VC(info);
		if (vc == columnDtlRcv_act_d_seq) return doDtlRcv_act_d_seq_VC(info);
		if (vc == columnDtlRcv_rcv_mtd_cd) return doDtlRcv_rcv_mtd_cd_VC(info);
		if (vc == columnDtlRcv_rcv_mtd_nm) return doDtlRcv_rcv_mtd_nm_VC(info);
		if (vc == columnDtlRcv_setoff_tax_cd) return doDtlRcv_setoff_tax_cd_VC(info);
		if (vc == columnDtlRcv_setoff_tax_nm) return doDtlRcv_setoff_tax_nm_VC(info);
		if (vc == columnDtlRcv_setoff_tax_rate) return doDtlRcv_setoff_tax_rate_VC(info);
		if (vc == columnDtlRcv_rcv_dt) return doDtlRcv_rcv_dt_VC(info);
		if (vc == columnDtlRcv_bill_basis_dt) return doDtlRcv_bill_basis_dt_VC(info);
		if (vc == columnDtlRcv_bill_crryovr_times) return doDtlRcv_bill_crryovr_times_VC(info);
		if (vc == columnDtlRcv_wrk_no) return doDtlRcv_wrk_no_VC(info);
		if (vc == columnDtlRcv_wrk_nm) return doDtlRcv_wrk_nm_VC(info);
		if (vc == columnDtlRcv_bill_d_rmrks) return doDtlRcv_bill_d_rmrks_VC(info);
		if (vc == columnDtlRcv_bill_d_no) return doDtlRcv_bill_d_no_VC(info);
		if (vc == columnDtlRcv_schd_bill_dt) return doDtlRcv_schd_bill_dt_VC(info);
		if (vc == columnDtlRcv_bill_can_slip_typ) return doDtlRcv_bill_can_slip_typ_VC(info);
		if (vc == columnDtlRcv_sls_interim_cl_flg) return doDtlRcv_sls_interim_cl_flg_VC(info);
		if (vc == columnDtlRcv_bill_tax_disp_flg) return doDtlRcv_bill_tax_disp_flg_VC(info);
		if (vc == columnDtlAdv_check) return doDtlAdv_check_VC(info);
		if (vc == columnDtlAdv_ac_dt) return doDtlAdv_ac_dt_VC(info);
		if (vc == columnDtlAdv_slip_sts_typ) return doDtlAdv_slip_sts_typ_VC(info);
		if (vc == columnDtlAdv_slip_sts_typ_nm) return doDtlAdv_slip_sts_typ_nm_VC(info);
		if (vc == columnDtlAdv_trd_cd) return doDtlAdv_trd_cd_VC(info);
		if (vc == columnDtlAdv_trd_nm) return doDtlAdv_trd_nm_VC(info);
		if (vc == columnDtlAdv_rcv_act_no) return doDtlAdv_rcv_act_no_VC(info);
		if (vc == columnDtlAdv_rcv_act_seq) return doDtlAdv_rcv_act_seq_VC(info);
		if (vc == columnDtlAdv_rcv_act_rev) return doDtlAdv_rcv_act_rev_VC(info);
		if (vc == columnDtlAdv_rcv_act_d_no) return doDtlAdv_rcv_act_d_no_VC(info);
		if (vc == columnDtlAdv_rcv_act_d_seq) return doDtlAdv_rcv_act_d_seq_VC(info);
		if (vc == columnDtlAdv_rcv_act_upd_cntr) return doDtlAdv_rcv_act_upd_cntr_VC(info);
		if (vc == columnDtlAdv_rcv_dt) return doDtlAdv_rcv_dt_VC(info);
		if (vc == columnDtlAdv_setoff_tax_cd) return doDtlAdv_setoff_tax_cd_VC(info);
		if (vc == columnDtlAdv_setoff_tax_nm) return doDtlAdv_setoff_tax_nm_VC(info);
		if (vc == columnDtlAdv_setoff_tax_rate) return doDtlAdv_setoff_tax_rate_VC(info);
		if (vc == columnDtlAdv_bill_tax_disp_flg) return doDtlAdv_bill_tax_disp_flg_VC(info);
		return true;
	}

	/**
	 * [DtlSls]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_prnt_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_prnt_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[base_sls_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_base_sls_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[scst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_scst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[scst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_scst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ship_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_multi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ship_dlv_slip_multi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[schd_bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_schd_bill_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ar_trd_grp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ar_trd_grp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_can_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_can_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_interim_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_interim_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[row_num]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_row_num_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[crryovr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_crryovr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[bill_dtl_subttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_bill_dtl_subttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_dtl_outp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_dtl_outp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_rcv_mtd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_rcv_mtd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_setoff_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_setoff_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_setoff_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_bill_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[bill_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_bill_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[bill_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_bill_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[schd_bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_schd_bill_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[bill_can_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_bill_can_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[sls_interim_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_sls_interim_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[bill_tax_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_bill_tax_disp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_rcv_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_rcv_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_rcv_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_rcv_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_rcv_act_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_setoff_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_setoff_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_setoff_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[bill_tax_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_bill_tax_disp_flg_VC(MCEventInfo info){
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
		if (nc == DtlSlsTable) doDtlSls_NC(info);
		else if (nc == DtlRcvTable) doDtlRcv_NC(info);
		else if (nc == DtlAdvTable) doDtlAdv_NC(info);
		else if (nc == Cnd_bill_ym) doCnd_bill_ym_NC(info);
		else if (nc == Cnd_bill_cl_day) doCnd_bill_cl_day_NC(info);
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NC(info);
		else if (nc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_base_cur_cd) doCnd_base_cur_cd_NC(info);
		else if (nc == Cnd_base_cur_nm) doCnd_base_cur_nm_NC(info);
		else if (nc == Cnd_base_cur_amt_dec_place) doCnd_base_cur_amt_dec_place_NC(info);
		else if (nc == Cnd_base_cur_upri_dec_place) doCnd_base_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_amt_dec_place) doHdr_amt_dec_place_NC(info);
		else if (nc == columnDtlSls_check) doDtlSls_check_NC(info);
		else if (nc == columnDtlSls_bill_prnt_tgt_flg) doDtlSls_bill_prnt_tgt_flg_NC(info);
		else if (nc == columnDtlSls_bill_mtd_typ) doDtlSls_bill_mtd_typ_NC(info);
		else if (nc == columnDtlSls_bill_mtd_typ_nm) doDtlSls_bill_mtd_typ_nm_NC(info);
		else if (nc == columnDtlSls_bill_ym) doDtlSls_bill_ym_NC(info);
		else if (nc == columnDtlSls_bill_cl_day) doDtlSls_bill_cl_day_NC(info);
		else if (nc == columnDtlSls_ac_dt) doDtlSls_ac_dt_NC(info);
		else if (nc == columnDtlSls_slip_sts_typ) doDtlSls_slip_sts_typ_NC(info);
		else if (nc == columnDtlSls_slip_sts_typ_nm) doDtlSls_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtlSls_trd_cd) doDtlSls_trd_cd_NC(info);
		else if (nc == columnDtlSls_trd_nm) doDtlSls_trd_nm_NC(info);
		else if (nc == columnDtlSls_ar_typ) doDtlSls_ar_typ_NC(info);
		else if (nc == columnDtlSls_ar_typ_nm) doDtlSls_ar_typ_nm_NC(info);
		else if (nc == columnDtlSls_base_sls_ac_dt) doDtlSls_base_sls_ac_dt_NC(info);
		else if (nc == columnDtlSls_act_no) doDtlSls_act_no_NC(info);
		else if (nc == columnDtlSls_act_seq) doDtlSls_act_seq_NC(info);
		else if (nc == columnDtlSls_act_rev) doDtlSls_act_rev_NC(info);
		else if (nc == columnDtlSls_act_d_no) doDtlSls_act_d_no_NC(info);
		else if (nc == columnDtlSls_act_d_seq) doDtlSls_act_d_seq_NC(info);
		else if (nc == columnDtlSls_cst_itm_cd) doDtlSls_cst_itm_cd_NC(info);
		else if (nc == columnDtlSls_cst_itm_nm) doDtlSls_cst_itm_nm_NC(info);
		else if (nc == columnDtlSls_trd_unit_cd) doDtlSls_trd_unit_cd_NC(info);
		else if (nc == columnDtlSls_trd_unit_nm) doDtlSls_trd_unit_nm_NC(info);
		else if (nc == columnDtlSls_inc_tax_flg) doDtlSls_inc_tax_flg_NC(info);
		else if (nc == columnDtlSls_interim_flg) doDtlSls_interim_flg_NC(info);
		else if (nc == columnDtlSls_tax_cd) doDtlSls_tax_cd_NC(info);
		else if (nc == columnDtlSls_tax_nm) doDtlSls_tax_nm_NC(info);
		else if (nc == columnDtlSls_tax_rate) doDtlSls_tax_rate_NC(info);
		else if (nc == columnDtlSls_dlv_dt) doDtlSls_dlv_dt_NC(info);
		else if (nc == columnDtlSls_bill_basis_dt) doDtlSls_bill_basis_dt_NC(info);
		else if (nc == columnDtlSls_bill_crryovr_times) doDtlSls_bill_crryovr_times_NC(info);
		else if (nc == columnDtlSls_cst_cd) doDtlSls_cst_cd_NC(info);
		else if (nc == columnDtlSls_cst_nm) doDtlSls_cst_nm_NC(info);
		else if (nc == columnDtlSls_scst_cd) doDtlSls_scst_cd_NC(info);
		else if (nc == columnDtlSls_scst_nm) doDtlSls_scst_nm_NC(info);
		else if (nc == columnDtlSls_dest_cd1) doDtlSls_dest_cd1_NC(info);
		else if (nc == columnDtlSls_dest_nm1) doDtlSls_dest_nm1_NC(info);
		else if (nc == columnDtlSls_dest_cd2) doDtlSls_dest_cd2_NC(info);
		else if (nc == columnDtlSls_dest_nm2) doDtlSls_dest_nm2_NC(info);
		else if (nc == columnDtlSls_dest_cd3) doDtlSls_dest_cd3_NC(info);
		else if (nc == columnDtlSls_dest_nm3) doDtlSls_dest_nm3_NC(info);
		else if (nc == columnDtlSls_sls_dpt_cd) doDtlSls_sls_dpt_cd_NC(info);
		else if (nc == columnDtlSls_sls_dpt_nm) doDtlSls_sls_dpt_nm_NC(info);
		else if (nc == columnDtlSls_sls_usr_cd) doDtlSls_sls_usr_cd_NC(info);
		else if (nc == columnDtlSls_sls_usr_nm) doDtlSls_sls_usr_nm_NC(info);
		else if (nc == columnDtlSls_slo_no) doDtlSls_slo_no_NC(info);
		else if (nc == columnDtlSls_slo_d_no) doDtlSls_slo_d_no_NC(info);
		else if (nc == columnDtlSls_cst_po_no) doDtlSls_cst_po_no_NC(info);
		else if (nc == columnDtlSls_cst_po_d_no) doDtlSls_cst_po_d_no_NC(info);
		else if (nc == columnDtlSls_dlv_slip_no) doDtlSls_dlv_slip_no_NC(info);
		else if (nc == columnDtlSls_dlv_slip_d_no) doDtlSls_dlv_slip_d_no_NC(info);
		else if (nc == columnDtlSls_ship_dlv_slip_no) doDtlSls_ship_dlv_slip_no_NC(info);
		else if (nc == columnDtlSls_ship_dlv_slip_d_no) doDtlSls_ship_dlv_slip_d_no_NC(info);
		else if (nc == columnDtlSls_ship_dlv_slip_multi_flg) doDtlSls_ship_dlv_slip_multi_flg_NC(info);
		else if (nc == columnDtlSls_wrk_no) doDtlSls_wrk_no_NC(info);
		else if (nc == columnDtlSls_wrk_nm) doDtlSls_wrk_nm_NC(info);
		else if (nc == columnDtlSls_sls_wrk_no) doDtlSls_sls_wrk_no_NC(info);
		else if (nc == columnDtlSls_sls_wrk_nm) doDtlSls_sls_wrk_nm_NC(info);
		else if (nc == columnDtlSls_trd_d_rmrks) doDtlSls_trd_d_rmrks_NC(info);
		else if (nc == columnDtlSls_bill_d_no) doDtlSls_bill_d_no_NC(info);
		else if (nc == columnDtlSls_schd_bill_dt) doDtlSls_schd_bill_dt_NC(info);
		else if (nc == columnDtlSls_ar_trd_grp_typ) doDtlSls_ar_trd_grp_typ_NC(info);
		else if (nc == columnDtlSls_dec_place) doDtlSls_dec_place_NC(info);
		else if (nc == columnDtlSls_amt_dec_place) doDtlSls_amt_dec_place_NC(info);
		else if (nc == columnDtlSls_upri_dec_place) doDtlSls_upri_dec_place_NC(info);
		else if (nc == columnDtlSls_sls_amt_rnd_typ) doDtlSls_sls_amt_rnd_typ_NC(info);
		else if (nc == columnDtlSls_sls_tax_rnd_typ) doDtlSls_sls_tax_rnd_typ_NC(info);
		else if (nc == columnDtlSls_trd_ptn_typ) doDtlSls_trd_ptn_typ_NC(info);
		else if (nc == columnDtlSls_bill_can_slip_typ) doDtlSls_bill_can_slip_typ_NC(info);
		else if (nc == columnDtlSls_sls_interim_cl_flg) doDtlSls_sls_interim_cl_flg_NC(info);
		else if (nc == columnDtlSls_row_num) doDtlSls_row_num_NC(info);
		else if (nc == columnDtlSls_crryovr_flg) doDtlSls_crryovr_flg_NC(info);
		else if (nc == columnDtlSls_bill_dtl_subttl_typ) doDtlSls_bill_dtl_subttl_typ_NC(info);
		else if (nc == columnDtlSls_acst_cd) doDtlSls_acst_cd_NC(info);
		else if (nc == columnDtlSls_sls_dtl_outp_typ) doDtlSls_sls_dtl_outp_typ_NC(info);
		else if (nc == columnDtlRcv_check) doDtlRcv_check_NC(info);
		else if (nc == columnDtlRcv_bill_ym) doDtlRcv_bill_ym_NC(info);
		else if (nc == columnDtlRcv_bill_cl_day) doDtlRcv_bill_cl_day_NC(info);
		else if (nc == columnDtlRcv_ac_dt) doDtlRcv_ac_dt_NC(info);
		else if (nc == columnDtlRcv_slip_sts_typ) doDtlRcv_slip_sts_typ_NC(info);
		else if (nc == columnDtlRcv_slip_sts_typ_nm) doDtlRcv_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtlRcv_trd_cd) doDtlRcv_trd_cd_NC(info);
		else if (nc == columnDtlRcv_trd_nm) doDtlRcv_trd_nm_NC(info);
		else if (nc == columnDtlRcv_ar_typ) doDtlRcv_ar_typ_NC(info);
		else if (nc == columnDtlRcv_ar_typ_nm) doDtlRcv_ar_typ_nm_NC(info);
		else if (nc == columnDtlRcv_act_no) doDtlRcv_act_no_NC(info);
		else if (nc == columnDtlRcv_act_seq) doDtlRcv_act_seq_NC(info);
		else if (nc == columnDtlRcv_act_rev) doDtlRcv_act_rev_NC(info);
		else if (nc == columnDtlRcv_act_d_no) doDtlRcv_act_d_no_NC(info);
		else if (nc == columnDtlRcv_act_d_seq) doDtlRcv_act_d_seq_NC(info);
		else if (nc == columnDtlRcv_rcv_mtd_cd) doDtlRcv_rcv_mtd_cd_NC(info);
		else if (nc == columnDtlRcv_rcv_mtd_nm) doDtlRcv_rcv_mtd_nm_NC(info);
		else if (nc == columnDtlRcv_setoff_tax_cd) doDtlRcv_setoff_tax_cd_NC(info);
		else if (nc == columnDtlRcv_setoff_tax_nm) doDtlRcv_setoff_tax_nm_NC(info);
		else if (nc == columnDtlRcv_setoff_tax_rate) doDtlRcv_setoff_tax_rate_NC(info);
		else if (nc == columnDtlRcv_rcv_dt) doDtlRcv_rcv_dt_NC(info);
		else if (nc == columnDtlRcv_bill_basis_dt) doDtlRcv_bill_basis_dt_NC(info);
		else if (nc == columnDtlRcv_bill_crryovr_times) doDtlRcv_bill_crryovr_times_NC(info);
		else if (nc == columnDtlRcv_wrk_no) doDtlRcv_wrk_no_NC(info);
		else if (nc == columnDtlRcv_wrk_nm) doDtlRcv_wrk_nm_NC(info);
		else if (nc == columnDtlRcv_bill_d_rmrks) doDtlRcv_bill_d_rmrks_NC(info);
		else if (nc == columnDtlRcv_bill_d_no) doDtlRcv_bill_d_no_NC(info);
		else if (nc == columnDtlRcv_schd_bill_dt) doDtlRcv_schd_bill_dt_NC(info);
		else if (nc == columnDtlRcv_bill_can_slip_typ) doDtlRcv_bill_can_slip_typ_NC(info);
		else if (nc == columnDtlRcv_sls_interim_cl_flg) doDtlRcv_sls_interim_cl_flg_NC(info);
		else if (nc == columnDtlRcv_bill_tax_disp_flg) doDtlRcv_bill_tax_disp_flg_NC(info);
		else if (nc == columnDtlAdv_check) doDtlAdv_check_NC(info);
		else if (nc == columnDtlAdv_ac_dt) doDtlAdv_ac_dt_NC(info);
		else if (nc == columnDtlAdv_slip_sts_typ) doDtlAdv_slip_sts_typ_NC(info);
		else if (nc == columnDtlAdv_slip_sts_typ_nm) doDtlAdv_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtlAdv_trd_cd) doDtlAdv_trd_cd_NC(info);
		else if (nc == columnDtlAdv_trd_nm) doDtlAdv_trd_nm_NC(info);
		else if (nc == columnDtlAdv_rcv_act_no) doDtlAdv_rcv_act_no_NC(info);
		else if (nc == columnDtlAdv_rcv_act_seq) doDtlAdv_rcv_act_seq_NC(info);
		else if (nc == columnDtlAdv_rcv_act_rev) doDtlAdv_rcv_act_rev_NC(info);
		else if (nc == columnDtlAdv_rcv_act_d_no) doDtlAdv_rcv_act_d_no_NC(info);
		else if (nc == columnDtlAdv_rcv_act_d_seq) doDtlAdv_rcv_act_d_seq_NC(info);
		else if (nc == columnDtlAdv_rcv_act_upd_cntr) doDtlAdv_rcv_act_upd_cntr_NC(info);
		else if (nc == columnDtlAdv_rcv_dt) doDtlAdv_rcv_dt_NC(info);
		else if (nc == columnDtlAdv_setoff_tax_cd) doDtlAdv_setoff_tax_cd_NC(info);
		else if (nc == columnDtlAdv_setoff_tax_nm) doDtlAdv_setoff_tax_nm_NC(info);
		else if (nc == columnDtlAdv_setoff_tax_rate) doDtlAdv_setoff_tax_rate_NC(info);
		else if (nc == columnDtlAdv_bill_tax_disp_flg) doDtlAdv_bill_tax_disp_flg_NC(info);
	}

	/**
	 * [DtlSls]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_prnt_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_prnt_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_sls_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_sls_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[scst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_scst_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[scst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_scst_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_multi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_multi_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[schd_bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_schd_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_trd_grp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_trd_grp_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_can_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_can_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_interim_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_interim_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[row_num]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_row_num_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[crryovr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_crryovr_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_dtl_subttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_dtl_subttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dtl_outp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dtl_outp_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_mtd_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_mtd_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[schd_bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_schd_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_can_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_can_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sls_interim_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sls_interim_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_tax_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_tax_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[bill_tax_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_bill_tax_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlSlsTable) doDtlSls_NE(info);
		else if (ne == DtlRcvTable) doDtlRcv_NE(info);
		else if (ne == DtlAdvTable) doDtlAdv_NE(info);
		else if (ne == Cnd_bill_ym) doCnd_bill_ym_NE(info);
		else if (ne == Cnd_bill_cl_day) doCnd_bill_cl_day_NE(info);
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NE(info);
		else if (ne == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_base_cur_cd) doCnd_base_cur_cd_NE(info);
		else if (ne == Cnd_base_cur_nm) doCnd_base_cur_nm_NE(info);
		else if (ne == Cnd_base_cur_amt_dec_place) doCnd_base_cur_amt_dec_place_NE(info);
		else if (ne == Cnd_base_cur_upri_dec_place) doCnd_base_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_amt_dec_place) doHdr_amt_dec_place_NE(info);
		else if (ne == columnDtlSls_check) doDtlSls_check_NE(info);
		else if (ne == columnDtlSls_bill_prnt_tgt_flg) doDtlSls_bill_prnt_tgt_flg_NE(info);
		else if (ne == columnDtlSls_bill_mtd_typ) doDtlSls_bill_mtd_typ_NE(info);
		else if (ne == columnDtlSls_bill_mtd_typ_nm) doDtlSls_bill_mtd_typ_nm_NE(info);
		else if (ne == columnDtlSls_bill_ym) doDtlSls_bill_ym_NE(info);
		else if (ne == columnDtlSls_bill_cl_day) doDtlSls_bill_cl_day_NE(info);
		else if (ne == columnDtlSls_ac_dt) doDtlSls_ac_dt_NE(info);
		else if (ne == columnDtlSls_slip_sts_typ) doDtlSls_slip_sts_typ_NE(info);
		else if (ne == columnDtlSls_slip_sts_typ_nm) doDtlSls_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtlSls_trd_cd) doDtlSls_trd_cd_NE(info);
		else if (ne == columnDtlSls_trd_nm) doDtlSls_trd_nm_NE(info);
		else if (ne == columnDtlSls_ar_typ) doDtlSls_ar_typ_NE(info);
		else if (ne == columnDtlSls_ar_typ_nm) doDtlSls_ar_typ_nm_NE(info);
		else if (ne == columnDtlSls_base_sls_ac_dt) doDtlSls_base_sls_ac_dt_NE(info);
		else if (ne == columnDtlSls_act_no) doDtlSls_act_no_NE(info);
		else if (ne == columnDtlSls_act_seq) doDtlSls_act_seq_NE(info);
		else if (ne == columnDtlSls_act_rev) doDtlSls_act_rev_NE(info);
		else if (ne == columnDtlSls_act_d_no) doDtlSls_act_d_no_NE(info);
		else if (ne == columnDtlSls_act_d_seq) doDtlSls_act_d_seq_NE(info);
		else if (ne == columnDtlSls_cst_itm_cd) doDtlSls_cst_itm_cd_NE(info);
		else if (ne == columnDtlSls_cst_itm_nm) doDtlSls_cst_itm_nm_NE(info);
		else if (ne == columnDtlSls_trd_unit_cd) doDtlSls_trd_unit_cd_NE(info);
		else if (ne == columnDtlSls_trd_unit_nm) doDtlSls_trd_unit_nm_NE(info);
		else if (ne == columnDtlSls_inc_tax_flg) doDtlSls_inc_tax_flg_NE(info);
		else if (ne == columnDtlSls_interim_flg) doDtlSls_interim_flg_NE(info);
		else if (ne == columnDtlSls_tax_cd) doDtlSls_tax_cd_NE(info);
		else if (ne == columnDtlSls_tax_nm) doDtlSls_tax_nm_NE(info);
		else if (ne == columnDtlSls_tax_rate) doDtlSls_tax_rate_NE(info);
		else if (ne == columnDtlSls_dlv_dt) doDtlSls_dlv_dt_NE(info);
		else if (ne == columnDtlSls_bill_basis_dt) doDtlSls_bill_basis_dt_NE(info);
		else if (ne == columnDtlSls_bill_crryovr_times) doDtlSls_bill_crryovr_times_NE(info);
		else if (ne == columnDtlSls_cst_cd) doDtlSls_cst_cd_NE(info);
		else if (ne == columnDtlSls_cst_nm) doDtlSls_cst_nm_NE(info);
		else if (ne == columnDtlSls_scst_cd) doDtlSls_scst_cd_NE(info);
		else if (ne == columnDtlSls_scst_nm) doDtlSls_scst_nm_NE(info);
		else if (ne == columnDtlSls_dest_cd1) doDtlSls_dest_cd1_NE(info);
		else if (ne == columnDtlSls_dest_nm1) doDtlSls_dest_nm1_NE(info);
		else if (ne == columnDtlSls_dest_cd2) doDtlSls_dest_cd2_NE(info);
		else if (ne == columnDtlSls_dest_nm2) doDtlSls_dest_nm2_NE(info);
		else if (ne == columnDtlSls_dest_cd3) doDtlSls_dest_cd3_NE(info);
		else if (ne == columnDtlSls_dest_nm3) doDtlSls_dest_nm3_NE(info);
		else if (ne == columnDtlSls_sls_dpt_cd) doDtlSls_sls_dpt_cd_NE(info);
		else if (ne == columnDtlSls_sls_dpt_nm) doDtlSls_sls_dpt_nm_NE(info);
		else if (ne == columnDtlSls_sls_usr_cd) doDtlSls_sls_usr_cd_NE(info);
		else if (ne == columnDtlSls_sls_usr_nm) doDtlSls_sls_usr_nm_NE(info);
		else if (ne == columnDtlSls_slo_no) doDtlSls_slo_no_NE(info);
		else if (ne == columnDtlSls_slo_d_no) doDtlSls_slo_d_no_NE(info);
		else if (ne == columnDtlSls_cst_po_no) doDtlSls_cst_po_no_NE(info);
		else if (ne == columnDtlSls_cst_po_d_no) doDtlSls_cst_po_d_no_NE(info);
		else if (ne == columnDtlSls_dlv_slip_no) doDtlSls_dlv_slip_no_NE(info);
		else if (ne == columnDtlSls_dlv_slip_d_no) doDtlSls_dlv_slip_d_no_NE(info);
		else if (ne == columnDtlSls_ship_dlv_slip_no) doDtlSls_ship_dlv_slip_no_NE(info);
		else if (ne == columnDtlSls_ship_dlv_slip_d_no) doDtlSls_ship_dlv_slip_d_no_NE(info);
		else if (ne == columnDtlSls_ship_dlv_slip_multi_flg) doDtlSls_ship_dlv_slip_multi_flg_NE(info);
		else if (ne == columnDtlSls_wrk_no) doDtlSls_wrk_no_NE(info);
		else if (ne == columnDtlSls_wrk_nm) doDtlSls_wrk_nm_NE(info);
		else if (ne == columnDtlSls_sls_wrk_no) doDtlSls_sls_wrk_no_NE(info);
		else if (ne == columnDtlSls_sls_wrk_nm) doDtlSls_sls_wrk_nm_NE(info);
		else if (ne == columnDtlSls_trd_d_rmrks) doDtlSls_trd_d_rmrks_NE(info);
		else if (ne == columnDtlSls_bill_d_no) doDtlSls_bill_d_no_NE(info);
		else if (ne == columnDtlSls_schd_bill_dt) doDtlSls_schd_bill_dt_NE(info);
		else if (ne == columnDtlSls_ar_trd_grp_typ) doDtlSls_ar_trd_grp_typ_NE(info);
		else if (ne == columnDtlSls_dec_place) doDtlSls_dec_place_NE(info);
		else if (ne == columnDtlSls_amt_dec_place) doDtlSls_amt_dec_place_NE(info);
		else if (ne == columnDtlSls_upri_dec_place) doDtlSls_upri_dec_place_NE(info);
		else if (ne == columnDtlSls_sls_amt_rnd_typ) doDtlSls_sls_amt_rnd_typ_NE(info);
		else if (ne == columnDtlSls_sls_tax_rnd_typ) doDtlSls_sls_tax_rnd_typ_NE(info);
		else if (ne == columnDtlSls_trd_ptn_typ) doDtlSls_trd_ptn_typ_NE(info);
		else if (ne == columnDtlSls_bill_can_slip_typ) doDtlSls_bill_can_slip_typ_NE(info);
		else if (ne == columnDtlSls_sls_interim_cl_flg) doDtlSls_sls_interim_cl_flg_NE(info);
		else if (ne == columnDtlSls_row_num) doDtlSls_row_num_NE(info);
		else if (ne == columnDtlSls_crryovr_flg) doDtlSls_crryovr_flg_NE(info);
		else if (ne == columnDtlSls_bill_dtl_subttl_typ) doDtlSls_bill_dtl_subttl_typ_NE(info);
		else if (ne == columnDtlSls_acst_cd) doDtlSls_acst_cd_NE(info);
		else if (ne == columnDtlSls_sls_dtl_outp_typ) doDtlSls_sls_dtl_outp_typ_NE(info);
		else if (ne == columnDtlRcv_check) doDtlRcv_check_NE(info);
		else if (ne == columnDtlRcv_bill_ym) doDtlRcv_bill_ym_NE(info);
		else if (ne == columnDtlRcv_bill_cl_day) doDtlRcv_bill_cl_day_NE(info);
		else if (ne == columnDtlRcv_ac_dt) doDtlRcv_ac_dt_NE(info);
		else if (ne == columnDtlRcv_slip_sts_typ) doDtlRcv_slip_sts_typ_NE(info);
		else if (ne == columnDtlRcv_slip_sts_typ_nm) doDtlRcv_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtlRcv_trd_cd) doDtlRcv_trd_cd_NE(info);
		else if (ne == columnDtlRcv_trd_nm) doDtlRcv_trd_nm_NE(info);
		else if (ne == columnDtlRcv_ar_typ) doDtlRcv_ar_typ_NE(info);
		else if (ne == columnDtlRcv_ar_typ_nm) doDtlRcv_ar_typ_nm_NE(info);
		else if (ne == columnDtlRcv_act_no) doDtlRcv_act_no_NE(info);
		else if (ne == columnDtlRcv_act_seq) doDtlRcv_act_seq_NE(info);
		else if (ne == columnDtlRcv_act_rev) doDtlRcv_act_rev_NE(info);
		else if (ne == columnDtlRcv_act_d_no) doDtlRcv_act_d_no_NE(info);
		else if (ne == columnDtlRcv_act_d_seq) doDtlRcv_act_d_seq_NE(info);
		else if (ne == columnDtlRcv_rcv_mtd_cd) doDtlRcv_rcv_mtd_cd_NE(info);
		else if (ne == columnDtlRcv_rcv_mtd_nm) doDtlRcv_rcv_mtd_nm_NE(info);
		else if (ne == columnDtlRcv_setoff_tax_cd) doDtlRcv_setoff_tax_cd_NE(info);
		else if (ne == columnDtlRcv_setoff_tax_nm) doDtlRcv_setoff_tax_nm_NE(info);
		else if (ne == columnDtlRcv_setoff_tax_rate) doDtlRcv_setoff_tax_rate_NE(info);
		else if (ne == columnDtlRcv_rcv_dt) doDtlRcv_rcv_dt_NE(info);
		else if (ne == columnDtlRcv_bill_basis_dt) doDtlRcv_bill_basis_dt_NE(info);
		else if (ne == columnDtlRcv_bill_crryovr_times) doDtlRcv_bill_crryovr_times_NE(info);
		else if (ne == columnDtlRcv_wrk_no) doDtlRcv_wrk_no_NE(info);
		else if (ne == columnDtlRcv_wrk_nm) doDtlRcv_wrk_nm_NE(info);
		else if (ne == columnDtlRcv_bill_d_rmrks) doDtlRcv_bill_d_rmrks_NE(info);
		else if (ne == columnDtlRcv_bill_d_no) doDtlRcv_bill_d_no_NE(info);
		else if (ne == columnDtlRcv_schd_bill_dt) doDtlRcv_schd_bill_dt_NE(info);
		else if (ne == columnDtlRcv_bill_can_slip_typ) doDtlRcv_bill_can_slip_typ_NE(info);
		else if (ne == columnDtlRcv_sls_interim_cl_flg) doDtlRcv_sls_interim_cl_flg_NE(info);
		else if (ne == columnDtlRcv_bill_tax_disp_flg) doDtlRcv_bill_tax_disp_flg_NE(info);
		else if (ne == columnDtlAdv_check) doDtlAdv_check_NE(info);
		else if (ne == columnDtlAdv_ac_dt) doDtlAdv_ac_dt_NE(info);
		else if (ne == columnDtlAdv_slip_sts_typ) doDtlAdv_slip_sts_typ_NE(info);
		else if (ne == columnDtlAdv_slip_sts_typ_nm) doDtlAdv_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtlAdv_trd_cd) doDtlAdv_trd_cd_NE(info);
		else if (ne == columnDtlAdv_trd_nm) doDtlAdv_trd_nm_NE(info);
		else if (ne == columnDtlAdv_rcv_act_no) doDtlAdv_rcv_act_no_NE(info);
		else if (ne == columnDtlAdv_rcv_act_seq) doDtlAdv_rcv_act_seq_NE(info);
		else if (ne == columnDtlAdv_rcv_act_rev) doDtlAdv_rcv_act_rev_NE(info);
		else if (ne == columnDtlAdv_rcv_act_d_no) doDtlAdv_rcv_act_d_no_NE(info);
		else if (ne == columnDtlAdv_rcv_act_d_seq) doDtlAdv_rcv_act_d_seq_NE(info);
		else if (ne == columnDtlAdv_rcv_act_upd_cntr) doDtlAdv_rcv_act_upd_cntr_NE(info);
		else if (ne == columnDtlAdv_rcv_dt) doDtlAdv_rcv_dt_NE(info);
		else if (ne == columnDtlAdv_setoff_tax_cd) doDtlAdv_setoff_tax_cd_NE(info);
		else if (ne == columnDtlAdv_setoff_tax_nm) doDtlAdv_setoff_tax_nm_NE(info);
		else if (ne == columnDtlAdv_setoff_tax_rate) doDtlAdv_setoff_tax_rate_NE(info);
		else if (ne == columnDtlAdv_bill_tax_disp_flg) doDtlAdv_bill_tax_disp_flg_NE(info);
	}

	/**
	 * [DtlSls]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_prnt_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_prnt_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_sls_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_sls_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[scst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_scst_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[scst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_scst_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_multi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_multi_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[schd_bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_schd_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_trd_grp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_trd_grp_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_can_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_can_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_interim_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_interim_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[row_num]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_row_num_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[crryovr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_crryovr_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_dtl_subttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_dtl_subttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dtl_outp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dtl_outp_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_mtd_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_mtd_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[schd_bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_schd_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_can_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_can_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sls_interim_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sls_interim_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_tax_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_tax_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[bill_tax_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_bill_tax_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlSlsTable) doDtlSls_NX(info);
		else if (nx == DtlRcvTable) doDtlRcv_NX(info);
		else if (nx == DtlAdvTable) doDtlAdv_NX(info);
		else if (nx == Cnd_bill_ym) doCnd_bill_ym_NX(info);
		else if (nx == Cnd_bill_cl_day) doCnd_bill_cl_day_NX(info);
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NX(info);
		else if (nx == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_base_cur_cd) doCnd_base_cur_cd_NX(info);
		else if (nx == Cnd_base_cur_nm) doCnd_base_cur_nm_NX(info);
		else if (nx == Cnd_base_cur_amt_dec_place) doCnd_base_cur_amt_dec_place_NX(info);
		else if (nx == Cnd_base_cur_upri_dec_place) doCnd_base_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_amt_dec_place) doHdr_amt_dec_place_NX(info);
		else if (nx == columnDtlSls_check) doDtlSls_check_NX(info);
		else if (nx == columnDtlSls_bill_prnt_tgt_flg) doDtlSls_bill_prnt_tgt_flg_NX(info);
		else if (nx == columnDtlSls_bill_mtd_typ) doDtlSls_bill_mtd_typ_NX(info);
		else if (nx == columnDtlSls_bill_mtd_typ_nm) doDtlSls_bill_mtd_typ_nm_NX(info);
		else if (nx == columnDtlSls_bill_ym) doDtlSls_bill_ym_NX(info);
		else if (nx == columnDtlSls_bill_cl_day) doDtlSls_bill_cl_day_NX(info);
		else if (nx == columnDtlSls_ac_dt) doDtlSls_ac_dt_NX(info);
		else if (nx == columnDtlSls_slip_sts_typ) doDtlSls_slip_sts_typ_NX(info);
		else if (nx == columnDtlSls_slip_sts_typ_nm) doDtlSls_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtlSls_trd_cd) doDtlSls_trd_cd_NX(info);
		else if (nx == columnDtlSls_trd_nm) doDtlSls_trd_nm_NX(info);
		else if (nx == columnDtlSls_ar_typ) doDtlSls_ar_typ_NX(info);
		else if (nx == columnDtlSls_ar_typ_nm) doDtlSls_ar_typ_nm_NX(info);
		else if (nx == columnDtlSls_base_sls_ac_dt) doDtlSls_base_sls_ac_dt_NX(info);
		else if (nx == columnDtlSls_act_no) doDtlSls_act_no_NX(info);
		else if (nx == columnDtlSls_act_seq) doDtlSls_act_seq_NX(info);
		else if (nx == columnDtlSls_act_rev) doDtlSls_act_rev_NX(info);
		else if (nx == columnDtlSls_act_d_no) doDtlSls_act_d_no_NX(info);
		else if (nx == columnDtlSls_act_d_seq) doDtlSls_act_d_seq_NX(info);
		else if (nx == columnDtlSls_cst_itm_cd) doDtlSls_cst_itm_cd_NX(info);
		else if (nx == columnDtlSls_cst_itm_nm) doDtlSls_cst_itm_nm_NX(info);
		else if (nx == columnDtlSls_trd_unit_cd) doDtlSls_trd_unit_cd_NX(info);
		else if (nx == columnDtlSls_trd_unit_nm) doDtlSls_trd_unit_nm_NX(info);
		else if (nx == columnDtlSls_inc_tax_flg) doDtlSls_inc_tax_flg_NX(info);
		else if (nx == columnDtlSls_interim_flg) doDtlSls_interim_flg_NX(info);
		else if (nx == columnDtlSls_tax_cd) doDtlSls_tax_cd_NX(info);
		else if (nx == columnDtlSls_tax_nm) doDtlSls_tax_nm_NX(info);
		else if (nx == columnDtlSls_tax_rate) doDtlSls_tax_rate_NX(info);
		else if (nx == columnDtlSls_dlv_dt) doDtlSls_dlv_dt_NX(info);
		else if (nx == columnDtlSls_bill_basis_dt) doDtlSls_bill_basis_dt_NX(info);
		else if (nx == columnDtlSls_bill_crryovr_times) doDtlSls_bill_crryovr_times_NX(info);
		else if (nx == columnDtlSls_cst_cd) doDtlSls_cst_cd_NX(info);
		else if (nx == columnDtlSls_cst_nm) doDtlSls_cst_nm_NX(info);
		else if (nx == columnDtlSls_scst_cd) doDtlSls_scst_cd_NX(info);
		else if (nx == columnDtlSls_scst_nm) doDtlSls_scst_nm_NX(info);
		else if (nx == columnDtlSls_dest_cd1) doDtlSls_dest_cd1_NX(info);
		else if (nx == columnDtlSls_dest_nm1) doDtlSls_dest_nm1_NX(info);
		else if (nx == columnDtlSls_dest_cd2) doDtlSls_dest_cd2_NX(info);
		else if (nx == columnDtlSls_dest_nm2) doDtlSls_dest_nm2_NX(info);
		else if (nx == columnDtlSls_dest_cd3) doDtlSls_dest_cd3_NX(info);
		else if (nx == columnDtlSls_dest_nm3) doDtlSls_dest_nm3_NX(info);
		else if (nx == columnDtlSls_sls_dpt_cd) doDtlSls_sls_dpt_cd_NX(info);
		else if (nx == columnDtlSls_sls_dpt_nm) doDtlSls_sls_dpt_nm_NX(info);
		else if (nx == columnDtlSls_sls_usr_cd) doDtlSls_sls_usr_cd_NX(info);
		else if (nx == columnDtlSls_sls_usr_nm) doDtlSls_sls_usr_nm_NX(info);
		else if (nx == columnDtlSls_slo_no) doDtlSls_slo_no_NX(info);
		else if (nx == columnDtlSls_slo_d_no) doDtlSls_slo_d_no_NX(info);
		else if (nx == columnDtlSls_cst_po_no) doDtlSls_cst_po_no_NX(info);
		else if (nx == columnDtlSls_cst_po_d_no) doDtlSls_cst_po_d_no_NX(info);
		else if (nx == columnDtlSls_dlv_slip_no) doDtlSls_dlv_slip_no_NX(info);
		else if (nx == columnDtlSls_dlv_slip_d_no) doDtlSls_dlv_slip_d_no_NX(info);
		else if (nx == columnDtlSls_ship_dlv_slip_no) doDtlSls_ship_dlv_slip_no_NX(info);
		else if (nx == columnDtlSls_ship_dlv_slip_d_no) doDtlSls_ship_dlv_slip_d_no_NX(info);
		else if (nx == columnDtlSls_ship_dlv_slip_multi_flg) doDtlSls_ship_dlv_slip_multi_flg_NX(info);
		else if (nx == columnDtlSls_wrk_no) doDtlSls_wrk_no_NX(info);
		else if (nx == columnDtlSls_wrk_nm) doDtlSls_wrk_nm_NX(info);
		else if (nx == columnDtlSls_sls_wrk_no) doDtlSls_sls_wrk_no_NX(info);
		else if (nx == columnDtlSls_sls_wrk_nm) doDtlSls_sls_wrk_nm_NX(info);
		else if (nx == columnDtlSls_trd_d_rmrks) doDtlSls_trd_d_rmrks_NX(info);
		else if (nx == columnDtlSls_bill_d_no) doDtlSls_bill_d_no_NX(info);
		else if (nx == columnDtlSls_schd_bill_dt) doDtlSls_schd_bill_dt_NX(info);
		else if (nx == columnDtlSls_ar_trd_grp_typ) doDtlSls_ar_trd_grp_typ_NX(info);
		else if (nx == columnDtlSls_dec_place) doDtlSls_dec_place_NX(info);
		else if (nx == columnDtlSls_amt_dec_place) doDtlSls_amt_dec_place_NX(info);
		else if (nx == columnDtlSls_upri_dec_place) doDtlSls_upri_dec_place_NX(info);
		else if (nx == columnDtlSls_sls_amt_rnd_typ) doDtlSls_sls_amt_rnd_typ_NX(info);
		else if (nx == columnDtlSls_sls_tax_rnd_typ) doDtlSls_sls_tax_rnd_typ_NX(info);
		else if (nx == columnDtlSls_trd_ptn_typ) doDtlSls_trd_ptn_typ_NX(info);
		else if (nx == columnDtlSls_bill_can_slip_typ) doDtlSls_bill_can_slip_typ_NX(info);
		else if (nx == columnDtlSls_sls_interim_cl_flg) doDtlSls_sls_interim_cl_flg_NX(info);
		else if (nx == columnDtlSls_row_num) doDtlSls_row_num_NX(info);
		else if (nx == columnDtlSls_crryovr_flg) doDtlSls_crryovr_flg_NX(info);
		else if (nx == columnDtlSls_bill_dtl_subttl_typ) doDtlSls_bill_dtl_subttl_typ_NX(info);
		else if (nx == columnDtlSls_acst_cd) doDtlSls_acst_cd_NX(info);
		else if (nx == columnDtlSls_sls_dtl_outp_typ) doDtlSls_sls_dtl_outp_typ_NX(info);
		else if (nx == columnDtlRcv_check) doDtlRcv_check_NX(info);
		else if (nx == columnDtlRcv_bill_ym) doDtlRcv_bill_ym_NX(info);
		else if (nx == columnDtlRcv_bill_cl_day) doDtlRcv_bill_cl_day_NX(info);
		else if (nx == columnDtlRcv_ac_dt) doDtlRcv_ac_dt_NX(info);
		else if (nx == columnDtlRcv_slip_sts_typ) doDtlRcv_slip_sts_typ_NX(info);
		else if (nx == columnDtlRcv_slip_sts_typ_nm) doDtlRcv_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtlRcv_trd_cd) doDtlRcv_trd_cd_NX(info);
		else if (nx == columnDtlRcv_trd_nm) doDtlRcv_trd_nm_NX(info);
		else if (nx == columnDtlRcv_ar_typ) doDtlRcv_ar_typ_NX(info);
		else if (nx == columnDtlRcv_ar_typ_nm) doDtlRcv_ar_typ_nm_NX(info);
		else if (nx == columnDtlRcv_act_no) doDtlRcv_act_no_NX(info);
		else if (nx == columnDtlRcv_act_seq) doDtlRcv_act_seq_NX(info);
		else if (nx == columnDtlRcv_act_rev) doDtlRcv_act_rev_NX(info);
		else if (nx == columnDtlRcv_act_d_no) doDtlRcv_act_d_no_NX(info);
		else if (nx == columnDtlRcv_act_d_seq) doDtlRcv_act_d_seq_NX(info);
		else if (nx == columnDtlRcv_rcv_mtd_cd) doDtlRcv_rcv_mtd_cd_NX(info);
		else if (nx == columnDtlRcv_rcv_mtd_nm) doDtlRcv_rcv_mtd_nm_NX(info);
		else if (nx == columnDtlRcv_setoff_tax_cd) doDtlRcv_setoff_tax_cd_NX(info);
		else if (nx == columnDtlRcv_setoff_tax_nm) doDtlRcv_setoff_tax_nm_NX(info);
		else if (nx == columnDtlRcv_setoff_tax_rate) doDtlRcv_setoff_tax_rate_NX(info);
		else if (nx == columnDtlRcv_rcv_dt) doDtlRcv_rcv_dt_NX(info);
		else if (nx == columnDtlRcv_bill_basis_dt) doDtlRcv_bill_basis_dt_NX(info);
		else if (nx == columnDtlRcv_bill_crryovr_times) doDtlRcv_bill_crryovr_times_NX(info);
		else if (nx == columnDtlRcv_wrk_no) doDtlRcv_wrk_no_NX(info);
		else if (nx == columnDtlRcv_wrk_nm) doDtlRcv_wrk_nm_NX(info);
		else if (nx == columnDtlRcv_bill_d_rmrks) doDtlRcv_bill_d_rmrks_NX(info);
		else if (nx == columnDtlRcv_bill_d_no) doDtlRcv_bill_d_no_NX(info);
		else if (nx == columnDtlRcv_schd_bill_dt) doDtlRcv_schd_bill_dt_NX(info);
		else if (nx == columnDtlRcv_bill_can_slip_typ) doDtlRcv_bill_can_slip_typ_NX(info);
		else if (nx == columnDtlRcv_sls_interim_cl_flg) doDtlRcv_sls_interim_cl_flg_NX(info);
		else if (nx == columnDtlRcv_bill_tax_disp_flg) doDtlRcv_bill_tax_disp_flg_NX(info);
		else if (nx == columnDtlAdv_check) doDtlAdv_check_NX(info);
		else if (nx == columnDtlAdv_ac_dt) doDtlAdv_ac_dt_NX(info);
		else if (nx == columnDtlAdv_slip_sts_typ) doDtlAdv_slip_sts_typ_NX(info);
		else if (nx == columnDtlAdv_slip_sts_typ_nm) doDtlAdv_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtlAdv_trd_cd) doDtlAdv_trd_cd_NX(info);
		else if (nx == columnDtlAdv_trd_nm) doDtlAdv_trd_nm_NX(info);
		else if (nx == columnDtlAdv_rcv_act_no) doDtlAdv_rcv_act_no_NX(info);
		else if (nx == columnDtlAdv_rcv_act_seq) doDtlAdv_rcv_act_seq_NX(info);
		else if (nx == columnDtlAdv_rcv_act_rev) doDtlAdv_rcv_act_rev_NX(info);
		else if (nx == columnDtlAdv_rcv_act_d_no) doDtlAdv_rcv_act_d_no_NX(info);
		else if (nx == columnDtlAdv_rcv_act_d_seq) doDtlAdv_rcv_act_d_seq_NX(info);
		else if (nx == columnDtlAdv_rcv_act_upd_cntr) doDtlAdv_rcv_act_upd_cntr_NX(info);
		else if (nx == columnDtlAdv_rcv_dt) doDtlAdv_rcv_dt_NX(info);
		else if (nx == columnDtlAdv_setoff_tax_cd) doDtlAdv_setoff_tax_cd_NX(info);
		else if (nx == columnDtlAdv_setoff_tax_nm) doDtlAdv_setoff_tax_nm_NX(info);
		else if (nx == columnDtlAdv_setoff_tax_rate) doDtlAdv_setoff_tax_rate_NX(info);
		else if (nx == columnDtlAdv_bill_tax_disp_flg) doDtlAdv_bill_tax_disp_flg_NX(info);
	}

	/**
	 * [DtlSls]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_prnt_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_prnt_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_sls_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_sls_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[scst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_scst_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[scst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_scst_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_multi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_multi_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[schd_bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_schd_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_trd_grp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_trd_grp_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_can_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_can_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_interim_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_interim_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[row_num]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_row_num_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[crryovr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_crryovr_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_dtl_subttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_dtl_subttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dtl_outp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dtl_outp_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_mtd_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_mtd_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[schd_bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_schd_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_can_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_can_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sls_interim_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sls_interim_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_tax_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_tax_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[bill_tax_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_bill_tax_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bill_ym) doCnd_bill_ym_LC(info);
		else if (lc == Cnd_bill_cl_day) doCnd_bill_cl_day_LC(info);
		else if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_LC(info);
		else if (lc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_base_cur_cd) doCnd_base_cur_cd_LC(info);
		else if (lc == Cnd_base_cur_nm) doCnd_base_cur_nm_LC(info);
		else if (lc == Cnd_base_cur_amt_dec_place) doCnd_base_cur_amt_dec_place_LC(info);
		else if (lc == Cnd_base_cur_upri_dec_place) doCnd_base_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_amt_dec_place) doHdr_amt_dec_place_LC(info);
		else if (lc == columnDtlSls_bill_mtd_typ) doDtlSls_bill_mtd_typ_LC(info);
		else if (lc == columnDtlSls_bill_mtd_typ_nm) doDtlSls_bill_mtd_typ_nm_LC(info);
		else if (lc == columnDtlSls_bill_ym) doDtlSls_bill_ym_LC(info);
		else if (lc == columnDtlSls_bill_cl_day) doDtlSls_bill_cl_day_LC(info);
		else if (lc == columnDtlSls_ac_dt) doDtlSls_ac_dt_LC(info);
		else if (lc == columnDtlSls_slip_sts_typ) doDtlSls_slip_sts_typ_LC(info);
		else if (lc == columnDtlSls_slip_sts_typ_nm) doDtlSls_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtlSls_trd_cd) doDtlSls_trd_cd_LC(info);
		else if (lc == columnDtlSls_trd_nm) doDtlSls_trd_nm_LC(info);
		else if (lc == columnDtlSls_ar_typ) doDtlSls_ar_typ_LC(info);
		else if (lc == columnDtlSls_ar_typ_nm) doDtlSls_ar_typ_nm_LC(info);
		else if (lc == columnDtlSls_base_sls_ac_dt) doDtlSls_base_sls_ac_dt_LC(info);
		else if (lc == columnDtlSls_act_no) doDtlSls_act_no_LC(info);
		else if (lc == columnDtlSls_act_seq) doDtlSls_act_seq_LC(info);
		else if (lc == columnDtlSls_act_rev) doDtlSls_act_rev_LC(info);
		else if (lc == columnDtlSls_act_d_no) doDtlSls_act_d_no_LC(info);
		else if (lc == columnDtlSls_act_d_seq) doDtlSls_act_d_seq_LC(info);
		else if (lc == columnDtlSls_cst_itm_cd) doDtlSls_cst_itm_cd_LC(info);
		else if (lc == columnDtlSls_cst_itm_nm) doDtlSls_cst_itm_nm_LC(info);
		else if (lc == columnDtlSls_trd_unit_cd) doDtlSls_trd_unit_cd_LC(info);
		else if (lc == columnDtlSls_trd_unit_nm) doDtlSls_trd_unit_nm_LC(info);
		else if (lc == columnDtlSls_tax_cd) doDtlSls_tax_cd_LC(info);
		else if (lc == columnDtlSls_tax_nm) doDtlSls_tax_nm_LC(info);
		else if (lc == columnDtlSls_tax_rate) doDtlSls_tax_rate_LC(info);
		else if (lc == columnDtlSls_dlv_dt) doDtlSls_dlv_dt_LC(info);
		else if (lc == columnDtlSls_bill_basis_dt) doDtlSls_bill_basis_dt_LC(info);
		else if (lc == columnDtlSls_bill_crryovr_times) doDtlSls_bill_crryovr_times_LC(info);
		else if (lc == columnDtlSls_cst_cd) doDtlSls_cst_cd_LC(info);
		else if (lc == columnDtlSls_cst_nm) doDtlSls_cst_nm_LC(info);
		else if (lc == columnDtlSls_scst_cd) doDtlSls_scst_cd_LC(info);
		else if (lc == columnDtlSls_scst_nm) doDtlSls_scst_nm_LC(info);
		else if (lc == columnDtlSls_dest_cd1) doDtlSls_dest_cd1_LC(info);
		else if (lc == columnDtlSls_dest_nm1) doDtlSls_dest_nm1_LC(info);
		else if (lc == columnDtlSls_dest_cd2) doDtlSls_dest_cd2_LC(info);
		else if (lc == columnDtlSls_dest_nm2) doDtlSls_dest_nm2_LC(info);
		else if (lc == columnDtlSls_dest_cd3) doDtlSls_dest_cd3_LC(info);
		else if (lc == columnDtlSls_dest_nm3) doDtlSls_dest_nm3_LC(info);
		else if (lc == columnDtlSls_sls_dpt_cd) doDtlSls_sls_dpt_cd_LC(info);
		else if (lc == columnDtlSls_sls_dpt_nm) doDtlSls_sls_dpt_nm_LC(info);
		else if (lc == columnDtlSls_sls_usr_cd) doDtlSls_sls_usr_cd_LC(info);
		else if (lc == columnDtlSls_sls_usr_nm) doDtlSls_sls_usr_nm_LC(info);
		else if (lc == columnDtlSls_slo_no) doDtlSls_slo_no_LC(info);
		else if (lc == columnDtlSls_slo_d_no) doDtlSls_slo_d_no_LC(info);
		else if (lc == columnDtlSls_cst_po_no) doDtlSls_cst_po_no_LC(info);
		else if (lc == columnDtlSls_cst_po_d_no) doDtlSls_cst_po_d_no_LC(info);
		else if (lc == columnDtlSls_dlv_slip_no) doDtlSls_dlv_slip_no_LC(info);
		else if (lc == columnDtlSls_dlv_slip_d_no) doDtlSls_dlv_slip_d_no_LC(info);
		else if (lc == columnDtlSls_ship_dlv_slip_no) doDtlSls_ship_dlv_slip_no_LC(info);
		else if (lc == columnDtlSls_ship_dlv_slip_d_no) doDtlSls_ship_dlv_slip_d_no_LC(info);
		else if (lc == columnDtlSls_wrk_no) doDtlSls_wrk_no_LC(info);
		else if (lc == columnDtlSls_wrk_nm) doDtlSls_wrk_nm_LC(info);
		else if (lc == columnDtlSls_sls_wrk_no) doDtlSls_sls_wrk_no_LC(info);
		else if (lc == columnDtlSls_sls_wrk_nm) doDtlSls_sls_wrk_nm_LC(info);
		else if (lc == columnDtlSls_trd_d_rmrks) doDtlSls_trd_d_rmrks_LC(info);
		else if (lc == columnDtlSls_bill_d_no) doDtlSls_bill_d_no_LC(info);
		else if (lc == columnDtlSls_schd_bill_dt) doDtlSls_schd_bill_dt_LC(info);
		else if (lc == columnDtlSls_ar_trd_grp_typ) doDtlSls_ar_trd_grp_typ_LC(info);
		else if (lc == columnDtlSls_dec_place) doDtlSls_dec_place_LC(info);
		else if (lc == columnDtlSls_amt_dec_place) doDtlSls_amt_dec_place_LC(info);
		else if (lc == columnDtlSls_upri_dec_place) doDtlSls_upri_dec_place_LC(info);
		else if (lc == columnDtlSls_sls_amt_rnd_typ) doDtlSls_sls_amt_rnd_typ_LC(info);
		else if (lc == columnDtlSls_sls_tax_rnd_typ) doDtlSls_sls_tax_rnd_typ_LC(info);
		else if (lc == columnDtlSls_trd_ptn_typ) doDtlSls_trd_ptn_typ_LC(info);
		else if (lc == columnDtlSls_bill_can_slip_typ) doDtlSls_bill_can_slip_typ_LC(info);
		else if (lc == columnDtlSls_row_num) doDtlSls_row_num_LC(info);
		else if (lc == columnDtlSls_bill_dtl_subttl_typ) doDtlSls_bill_dtl_subttl_typ_LC(info);
		else if (lc == columnDtlSls_acst_cd) doDtlSls_acst_cd_LC(info);
		else if (lc == columnDtlSls_sls_dtl_outp_typ) doDtlSls_sls_dtl_outp_typ_LC(info);
		else if (lc == columnDtlRcv_bill_ym) doDtlRcv_bill_ym_LC(info);
		else if (lc == columnDtlRcv_bill_cl_day) doDtlRcv_bill_cl_day_LC(info);
		else if (lc == columnDtlRcv_ac_dt) doDtlRcv_ac_dt_LC(info);
		else if (lc == columnDtlRcv_slip_sts_typ) doDtlRcv_slip_sts_typ_LC(info);
		else if (lc == columnDtlRcv_slip_sts_typ_nm) doDtlRcv_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtlRcv_trd_cd) doDtlRcv_trd_cd_LC(info);
		else if (lc == columnDtlRcv_trd_nm) doDtlRcv_trd_nm_LC(info);
		else if (lc == columnDtlRcv_ar_typ) doDtlRcv_ar_typ_LC(info);
		else if (lc == columnDtlRcv_ar_typ_nm) doDtlRcv_ar_typ_nm_LC(info);
		else if (lc == columnDtlRcv_act_no) doDtlRcv_act_no_LC(info);
		else if (lc == columnDtlRcv_act_seq) doDtlRcv_act_seq_LC(info);
		else if (lc == columnDtlRcv_act_rev) doDtlRcv_act_rev_LC(info);
		else if (lc == columnDtlRcv_act_d_no) doDtlRcv_act_d_no_LC(info);
		else if (lc == columnDtlRcv_act_d_seq) doDtlRcv_act_d_seq_LC(info);
		else if (lc == columnDtlRcv_rcv_mtd_cd) doDtlRcv_rcv_mtd_cd_LC(info);
		else if (lc == columnDtlRcv_rcv_mtd_nm) doDtlRcv_rcv_mtd_nm_LC(info);
		else if (lc == columnDtlRcv_setoff_tax_cd) doDtlRcv_setoff_tax_cd_LC(info);
		else if (lc == columnDtlRcv_setoff_tax_nm) doDtlRcv_setoff_tax_nm_LC(info);
		else if (lc == columnDtlRcv_setoff_tax_rate) doDtlRcv_setoff_tax_rate_LC(info);
		else if (lc == columnDtlRcv_rcv_dt) doDtlRcv_rcv_dt_LC(info);
		else if (lc == columnDtlRcv_bill_basis_dt) doDtlRcv_bill_basis_dt_LC(info);
		else if (lc == columnDtlRcv_bill_crryovr_times) doDtlRcv_bill_crryovr_times_LC(info);
		else if (lc == columnDtlRcv_wrk_no) doDtlRcv_wrk_no_LC(info);
		else if (lc == columnDtlRcv_wrk_nm) doDtlRcv_wrk_nm_LC(info);
		else if (lc == columnDtlRcv_bill_d_rmrks) doDtlRcv_bill_d_rmrks_LC(info);
		else if (lc == columnDtlRcv_bill_d_no) doDtlRcv_bill_d_no_LC(info);
		else if (lc == columnDtlRcv_schd_bill_dt) doDtlRcv_schd_bill_dt_LC(info);
		else if (lc == columnDtlRcv_bill_can_slip_typ) doDtlRcv_bill_can_slip_typ_LC(info);
		else if (lc == columnDtlAdv_ac_dt) doDtlAdv_ac_dt_LC(info);
		else if (lc == columnDtlAdv_slip_sts_typ) doDtlAdv_slip_sts_typ_LC(info);
		else if (lc == columnDtlAdv_slip_sts_typ_nm) doDtlAdv_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtlAdv_trd_cd) doDtlAdv_trd_cd_LC(info);
		else if (lc == columnDtlAdv_trd_nm) doDtlAdv_trd_nm_LC(info);
		else if (lc == columnDtlAdv_rcv_act_no) doDtlAdv_rcv_act_no_LC(info);
		else if (lc == columnDtlAdv_rcv_act_seq) doDtlAdv_rcv_act_seq_LC(info);
		else if (lc == columnDtlAdv_rcv_act_rev) doDtlAdv_rcv_act_rev_LC(info);
		else if (lc == columnDtlAdv_rcv_act_d_no) doDtlAdv_rcv_act_d_no_LC(info);
		else if (lc == columnDtlAdv_rcv_act_d_seq) doDtlAdv_rcv_act_d_seq_LC(info);
		else if (lc == columnDtlAdv_rcv_act_upd_cntr) doDtlAdv_rcv_act_upd_cntr_LC(info);
		else if (lc == columnDtlAdv_rcv_dt) doDtlAdv_rcv_dt_LC(info);
		else if (lc == columnDtlAdv_setoff_tax_cd) doDtlAdv_setoff_tax_cd_LC(info);
		else if (lc == columnDtlAdv_setoff_tax_nm) doDtlAdv_setoff_tax_nm_LC(info);
		else if (lc == columnDtlAdv_setoff_tax_rate) doDtlAdv_setoff_tax_rate_LC(info);
	}

	/**
	 * [Cnd]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_sls_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_sls_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[scst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_scst_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[scst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_scst_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ship_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ship_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[schd_bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_schd_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ar_trd_grp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ar_trd_grp_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_can_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_can_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[row_num]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_row_num_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[bill_dtl_subttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_bill_dtl_subttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_dtl_outp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_dtl_outp_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_mtd_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_mtd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_mtd_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[setoff_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_setoff_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[schd_bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_schd_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_can_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_can_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_act_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_act_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[setoff_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_setoff_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_base_cur_cd]の作成メソッド
	 */
	public MCList getCnd_base_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlSls_bill_mtd_typ]の作成メソッド
	 */
	public MCList getDtlSls_bill_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getBillMtdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlSls_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtlSls_trd_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0020.Srch01")) {
			return new MS_MSBGL0020_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0020_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0020_Srch01Bridge() {
			p_MS_MSBGL0020_Srch01 = new MCParam(PDef.MS_MSBGL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0020.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0020.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0020.DtlSlsSubR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0020.DtlRcvR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0020.DtlAdvR.class));

			p_MS_MSBGL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0020.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0020.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0020.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0020.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsR> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsR>)down(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsSubR> down2() {
			return (MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsSubR>)down(2);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0020.DtlRcvR> down3() {
			return (MCList<mcframe.clientMSBG.MSBGP0020.DtlRcvR>)down(3);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0020.DtlAdvR> down4() {
			return (MCList<mcframe.clientMSBG.MSBGP0020.DtlAdvR>)down(4);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0020_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0020.HdrR.create());
			p_MS_MSBGL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0020.DtlSlsR.class));
			p_MS_MSBGL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0020.DtlSlsSubR.class));
			p_MS_MSBGL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0020.DtlRcvR.class));
			p_MS_MSBGL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0020.DtlAdvR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0020_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0020.HdrR)p_MS_MSBGL0020_Srch01.getContainerParam().getDownBlock(0));
			setDtlSlsL((MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsR>)p_MS_MSBGL0020_Srch01.getContainerParam().getDownBlock(1));
			setDtlSlsSubL((MCList<mcframe.clientMSBG.MSBGP0020.DtlSlsSubR>)p_MS_MSBGL0020_Srch01.getContainerParam().getDownBlock(2));
			setDtlRcvL((MCList<mcframe.clientMSBG.MSBGP0020.DtlRcvR>)p_MS_MSBGL0020_Srch01.getContainerParam().getDownBlock(3));
			setDtlAdvL((MCList<mcframe.clientMSBG.MSBGP0020.DtlAdvR>)p_MS_MSBGL0020_Srch01.getContainerParam().getDownBlock(4));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlSlsL().clear();
			getDtlSlsSubL().clear();
			getDtlRcvL().clear();
			getDtlAdvL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlSlsL());
			result.add(getDtlSlsSubL());
			result.add(getDtlRcvL());
			result.add(getDtlAdvL());
			return result;
		}
	}
}