package mcframe.clientMSBG.MSBGP0040;

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
import mcframe.clientMSBG.MSBGP0040.MSBGP_BillDSrch_MC.MS_MSBGL0040_Srch01Caller;
import mcframe.clientMSBG.MSBGP0040.MSBGP_BillDSrch_MC.MS_MSBGL0040_Upd01Caller;
import mcframe.clientMSBG.MSBGP0040.MSBGP_BillDSrch_MC.MS_MSBGL0040_Del01Caller;
import mcframe.clientMSBG.MSBGP0040.MSBGP_BillDSrch_MC.MS_MSBGL0040_Prnt01Caller;

/**
 * 画面"MSBGP_BillDSrch"パネルクラスです。<p>
 *
 * 請求明細を照会します。また、請求繰越回数の変更、請求締解除をします。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_BillDSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0040";

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
	 * UPD,Modify;DEL,Release closing;REF,View UPD,訂正する;DEL,締解除;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_mng_no = null;
	public MCLabel Cnd_bill_no_Label = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_no = null;
	/**
	 * Reversal of return/discount amount sign 返品・値引金額符号反転.<p>
	 *
	 */
	public MCCheckBox Cnd_sign_rivrs_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_bill_no_Label = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_bill_no = null;
	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_bill_rev = null;
	public MCLabel Hdr_bill_cl_ym_Label = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDateField Hdr_bill_cl_ym = null;
	public MCLabel Hdr_bill_cl_day_Label = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumberField Hdr_bill_cl_day = null;
	public MCLabel Hdr_bill_dt_Label = null;
	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public MCDateField Hdr_bill_dt = null;
	public MCLabel Hdr_rcv_schd_dt_Label = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDateField Hdr_rcv_schd_dt = null;
	/**
	 * Multiple 複数.<p>
	 *
	 */
	public MCCheckBox Hdr_multi_flg = null;
	public MCLabel Hdr_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_iv_no = null;
	public MCLabel Hdr_pre_bill_no_Label = null;
	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_pre_bill_no = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_prnt_flg = null;
	public MCLabel Hdr_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField Hdr_bill_dpt_nm = null;
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Hdr_wg_nm = null;
	public MCLabel Hdr_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField Hdr_bcst_nm = null;
	/**
	 * Foreign 国外.<p>
	 *
	 */
	public MCCheckBox Hdr_foreign_flg = null;
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public MCCheckBox Hdr_edi_flg = null;
	public MCLabel Hdr_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Hdr_trd_cur_nm = null;
	public MCLabel Hdr_base_cur_cd_Label = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCTextField Hdr_base_cur_nm = null;
	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_base_cur_amt_dec_place = null;
	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_base_cur_upri_dec_place = null;
	public MCLabel Hdr_bill_xrate_Label = null;
	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCNumberField Hdr_bill_xrate = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Hdr_wrkno_p_PPanel;
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
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_upri_dec_place = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_amt_dec_place = null;
	public MCLabel Hdr_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_nm = null;
	public MCLabel Hdr_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_nm = null;
	public MCLabel Hdr_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_nm = null;
	public MCLabel Hdr_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_nm = null;
	public MCLabel Hdr_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr_ins_ts = null;
	public MCLabel Hdr_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr_upd_ts = null;
	public MCLabel Hdr_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_upd_cntr = null;
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_bill_mng_no = null;
	// [List]ブロック関連のField定義
	public MCPanel ListPanel = null;
	// [List]ブロックの項目のField定義
	// [Dtl1Info]ブロック関連のField定義
	public MCPanel Dtl1InfoPanel = null;
	// [Dtl1Info]ブロックの項目のField定義
	// [Dtl1]ブロック関連のField定義
	public MCPanel Dtl1Panel = null;
	public MCTitledBorder Dtl1TitledBorder = null;
	public MCScrollPane Dtl1ScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0040.Dtl1R> Dtl1Table = null;
	// [Dtl1]ブロックの項目のField定義
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_row_num = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_check = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ac_dt = null;
	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_ptn_typ = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ar_typ_nm = null;
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_sls_ac_dt = null;
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_no = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_rev = null;
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_seq = null;
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_d_no = null;
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_d_seq = null;
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dlv_dt = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bill_basis_dt = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bill_crryovr_times = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl1_itm_p_PPanel;
	public MCColumnConfig columnDtl1_itm_cd;// [Dtl1]の[itm_p.itm_cd]を[columnDtl1_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub1;// [Dtl1]の[itm_p.itm_sub1]を[columnDtl1_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub2;// [Dtl1]の[itm_p.itm_sub2]を[columnDtl1_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub3;// [Dtl1]の[itm_p.itm_sub3]を[columnDtl1_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_nm;// [Dtl1]の[itm_p.itm_nm]を[columnDtl1_itm_nm]としてエイリアス定義。
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cst_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl1_sno_p_PPanel;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl1_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl1_trd_unit_qty;// [Dtl1]の[trd_unit_qty_p.qty]を[columnDtl1_trd_unit_qty]としてエイリアス定義。
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_inc_tax_flg = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_interim_flg = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trdCurUpri_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_upri;// [Dtl1]の[trdCurUpri_p.amt]を[columnDtl1_trd_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trdCurAmt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_amt;// [Dtl1]の[trdCurAmt_p.amt]を[columnDtl1_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trdIncCtax_p_PPanel;
	public MCColumnConfig columnDtl1_trd_inc_tax_amt;// [Dtl1]の[trdIncCtax_p.amt]を[columnDtl1_trd_inc_tax_amt]としてエイリアス定義。
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_tax_nm = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_tax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trdCurTax_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_tax_amt;// [Dtl1]の[trdCurTax_p.amt]を[columnDtl1_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl1_xrate_p_PPanel;
	public MCColumnConfig columnDtl1_xrate;// [Dtl1]の[xrate_p.xrate]を[columnDtl1_xrate]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trdCurDscnt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_dscnt_amt;// [Dtl1]の[trdCurDscnt_p.amt]を[columnDtl1_trd_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_upri;// [Dtl1]の[base_cur_upri_p.upri]を[columnDtl1_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_amt;// [Dtl1]の[base_cur_amt_p.amt]を[columnDtl1_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_tax_amt;// [Dtl1]の[base_cur_tax_amt_p.amt]を[columnDtl1_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_inc_tax_amt;// [Dtl1]の[base_cur_inc_tax_amt_p.amt]を[columnDtl1_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_dscnt_amt;// [Dtl1]の[base_cur_dscnt_amt_p.amt]を[columnDtl1_base_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cst_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dlv_nm = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dest_nm3 = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sls_usr_nm = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sls_dpt_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_slo_d_no = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cst_po_d_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dlv_slip_d_no = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ship_dlv_slip_no = null;
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ship_dlv_slip_d_no = null;
	/**
	 * Multiple delivery note details at shipping 出荷時納品書明細複数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ship_dlv_slip_multi_flg = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Dtl1_wrkno_p_PPanel;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Dtl1_sls_wrkno_p_PPanel;
	public MCColumnConfig columnDtl1_sls_wrk_no;// [Dtl1]の[sls_wrkno_p.wrk_no]を[columnDtl1_sls_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sls_wrk_nm;// [Dtl1]の[sls_wrkno_p.wrk_nm]を[columnDtl1_sls_wrk_nm]としてエイリアス定義。
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_d_rmrks = null;
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bill_d_no = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_cntr = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dec_place = null;
	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bill_d_typ = null;
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bill_mng_no = null;
	// [Dtl1_Btn]ブロック関連のField定義
	public MCPanel Dtl1_BtnPanel = null;
	// [Dtl1_Btn]ブロックの項目のField定義
	public mcframe.clientFXUC.FXUCP0130.FXUCP_Paging Dtl1_Btn_paging_PPanel;
	public MCButton Dtl1_Btn_p_prev;	// [Dtl1_Btn]の[paging.prev]を[Dtl1_Btn_p_prev]としてエイリアス定義。
	public MCButton Dtl1_Btn_p_next;	// [Dtl1_Btn]の[paging.next]を[Dtl1_Btn_p_next]としてエイリアス定義。
	// [Dtl2Info]ブロック関連のField定義
	public MCPanel Dtl2InfoPanel = null;
	// [Dtl2Info]ブロックの項目のField定義
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCTitledBorder Dtl2TitledBorder = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0040.Dtl2R> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_check = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ac_dt = null;
	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_ptn_typ = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ar_typ_nm = null;
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_no = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_rev = null;
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_seq = null;
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_d_no = null;
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_d_seq = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcv_dt = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bill_basis_dt = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bill_crryovr_times = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_trdCur_p_PPanel;
	public MCColumnConfig columnDtl2_trd_cur_amt;// [Dtl2]の[trdCur_p.amt]を[columnDtl2_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_setoffAmt_p_PPanel;
	public MCColumnConfig columnDtl2_setoff_amt;// [Dtl2]の[setoffAmt_p.amt]を[columnDtl2_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_setoffTaxAmt_p_PPanel;
	public MCColumnConfig columnDtl2_setoff_tax_amt;// [Dtl2]の[setoffTaxAmt_p.amt]を[columnDtl2_setoff_tax_amt]としてエイリアス定義。
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_setoff_tax_cd = null;
	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_setoff_tax_nm = null;
	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_setoff_tax_rate = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Dtl2_wrkno_p_PPanel;
	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bill_d_rmrks = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_cntr = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_dec_place = null;
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bill_d_no = null;
	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bill_d_typ = null;
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bill_mng_no = null;
	// [Dtl3]ブロック関連のField定義
	public MCPanel Dtl3Panel = null;
	public MCTitledBorder Dtl3TitledBorder = null;
	public MCScrollPane Dtl3ScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0040.Dtl3R> Dtl3Table = null;
	// [Dtl3]ブロックの項目のField定義
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ac_dt = null;
	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_trd_ptn_typ = null;
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_rcv_act_no = null;
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_rcv_act_seq = null;
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_rcv_act_rev = null;
	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_rcv_act_d_no = null;
	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_rcv_act_d_seq = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_rcv_dt = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl3_trdCur_p_PPanel;
	public MCColumnConfig columnDtl3_trd_cur_amt;// [Dtl3]の[trdCur_p.amt]を[columnDtl3_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl3_setoffAmt_p_PPanel;
	public MCColumnConfig columnDtl3_setoff_amt;// [Dtl3]の[setoffAmt_p.amt]を[columnDtl3_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl3_setoffTaxAmt_p_PPanel;
	public MCColumnConfig columnDtl3_setoff_tax_amt;// [Dtl3]の[setoffTaxAmt_p.amt]を[columnDtl3_setoff_tax_amt]としてエイリアス定義。
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_setoff_tax_cd = null;
	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_setoff_tax_nm = null;
	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_setoff_tax_rate = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Invoice 請求書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF, UPD, FIX_U, DEL, FIX_D};
	
	/** [MS_MSBGL0040_Srch01]のCallerの作成 */
	protected MSBGP_BillDSrch_MC.MS_MSBGL0040_Srch01Caller createMS_MSBGL0040_Srch01() {
		MSBGP_BillDSrch_MC.MS_MSBGL0040_Srch01Caller<MSBGP_BillDSrch, MS_MSBGL0040_Srch01Bridge>
		caller = ((MSBGP_BillDSrch_MC)this).new MS_MSBGL0040_Srch01Caller<MSBGP_BillDSrch, MS_MSBGL0040_Srch01Bridge>(
					(MSBGP_BillDSrch)this, new MS_MSBGL0040_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0040_Srch01]の呼び出し */
	protected void callMS_MSBGL0040_Srch01() {
		MCCaller caller = createMS_MSBGL0040_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0040_Upd01]のCallerの作成 */
	protected MSBGP_BillDSrch_MC.MS_MSBGL0040_Upd01Caller createMS_MSBGL0040_Upd01() {
		MSBGP_BillDSrch_MC.MS_MSBGL0040_Upd01Caller<MSBGP_BillDSrch, MS_MSBGL0040_Upd01Bridge>
		caller = ((MSBGP_BillDSrch_MC)this).new MS_MSBGL0040_Upd01Caller<MSBGP_BillDSrch, MS_MSBGL0040_Upd01Bridge>(
					(MSBGP_BillDSrch)this, new MS_MSBGL0040_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBGL0040_Upd01]の呼び出し */
	protected void callMS_MSBGL0040_Upd01() {
		MCCaller caller = createMS_MSBGL0040_Upd01();
		caller.exec();
	}
	/** [MS_MSBGL0040_Del01]のCallerの作成 */
	protected MSBGP_BillDSrch_MC.MS_MSBGL0040_Del01Caller createMS_MSBGL0040_Del01() {
		MSBGP_BillDSrch_MC.MS_MSBGL0040_Del01Caller<MSBGP_BillDSrch, MS_MSBGL0040_Del01Bridge>
		caller = ((MSBGP_BillDSrch_MC)this).new MS_MSBGL0040_Del01Caller<MSBGP_BillDSrch, MS_MSBGL0040_Del01Bridge>(
					(MSBGP_BillDSrch)this, new MS_MSBGL0040_Del01Bridge());
		return caller;
	}
	/** [MS_MSBGL0040_Del01]の呼び出し */
	protected void callMS_MSBGL0040_Del01() {
		MCCaller caller = createMS_MSBGL0040_Del01();
		caller.exec();
	}
	/** [MS_MSBGL0040_Prnt01]のCallerの作成 */
	protected MSBGP_BillDSrch_MC.MS_MSBGL0040_Prnt01Caller createMS_MSBGL0040_Prnt01() {
		MSBGP_BillDSrch_MC.MS_MSBGL0040_Prnt01Caller<MSBGP_BillDSrch, MS_MSBGL0040_Prnt01Bridge>
		caller = ((MSBGP_BillDSrch_MC)this).new MS_MSBGL0040_Prnt01Caller<MSBGP_BillDSrch, MS_MSBGL0040_Prnt01Bridge>(
					(MSBGP_BillDSrch)this, new MS_MSBGL0040_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBGL0040_Prnt01]の呼び出し */
	protected void callMS_MSBGL0040_Prnt01() {
		MCCaller caller = createMS_MSBGL0040_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0040.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0040.HdrR aHdrR;
	/** [Dtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R> aDtl1L;
	/** [Dtl1_Sub]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R> aDtl1_SubL;
	/** [Dtl1_Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0040.Dtl1_BtnR aDtl1_BtnR;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0040.Dtl2R> aDtl2L;
	/** [Dtl3]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0040.Dtl3R> aDtl3L;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0040.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0040.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0040.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBG.MSBGP0040.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0040.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0040.HdrR createHdrR() {
		return mcframe.clientMSBG.MSBGP0040.HdrR.create();
	}

	/**
	 * コピーによってaDtl1Lを設定します。
	 *
	 * aDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1L
	 */
	public void setDtl1L(MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R> aList) {
		if (getDtl1L() != aList) {
			getDtl1L().setAll(aList);
		}
	}

	/**
	 * [Dtl1]ブロックのコンテナaDtl1Lを返します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R> getDtl1L() {
		return aDtl1L;
	}

	/**
	 * aDtl1Rを作成します。
	 *
	 * @return Dtl1R
	 */
	public mcframe.clientMSBG.MSBGP0040.Dtl1R createDtl1R() {
		return mcframe.clientMSBG.MSBGP0040.Dtl1R.create();
	}

	/**
	 * aDtl1Lを作成します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R> createDtl1L() {
		return MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.class);
	}

	/**
	 * Dtl1Tableを初期化します。
	 */
	protected void createDtl1Table(){
		if(Dtl1Table == null){
			Dtl1Table = beansFactory.createTable2("Dtl1.table");
		}
	}

	/**
	 * コピーによってaDtl1_SubLを設定します。
	 *
	 * aDtl1_SubLのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1_SubL
	 */
	public void setDtl1_SubL(MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R> aList) {
		if (getDtl1_SubL() != aList) {
			getDtl1_SubL().setAll(aList);
		}
	}

	/**
	 * [Dtl1_Sub]ブロックのコンテナaDtl1_SubLを返します。
	 *
	 * @return Dtl1_SubL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R> getDtl1_SubL() {
		return aDtl1_SubL;
	}

	/**
	 * aDtl1_SubRを作成します。
	 *
	 * @return Dtl1_SubR
	 */
	public mcframe.clientMSBG.MSBGP0040.Dtl1R createDtl1_SubR() {
		return mcframe.clientMSBG.MSBGP0040.Dtl1R.create();
	}

	/**
	 * aDtl1_SubLを作成します。
	 *
	 * @return Dtl1_SubL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R> createDtl1_SubL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.class);
	}

	/**
	 * 項目コピーによってaDtl1_BtnRを設定します。
	 *
	 * aDtl1_BtnRのインスタンスは変更されません。
	 *
	 * @param row Dtl1_BtnR
	 */
	public void setDtl1_BtnR(mcframe.clientMSBG.MSBGP0040.Dtl1_BtnR row) {
		if (row != null) {
			MCRow.copyall(getDtl1_BtnR(), row);
		}
	}

	/**
	 * [Dtl1_Btn]ブロックのコンテナaDtl1_BtnRを返します。
	 *
	 * @return Dtl1_BtnR
	 */
	public mcframe.clientMSBG.MSBGP0040.Dtl1_BtnR getDtl1_BtnR() {
		return aDtl1_BtnR;
	}

	/**
	 * aDtl1_BtnRを作成します。
	 *
	 * @return Dtl1_BtnR
	 */
	public mcframe.clientMSBG.MSBGP0040.Dtl1_BtnR createDtl1_BtnR() {
		return mcframe.clientMSBG.MSBGP0040.Dtl1_BtnR.create();
	}

	/**
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMSBG.MSBGP0040.Dtl2R> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.Dtl2R> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMSBG.MSBGP0040.Dtl2R createDtl2R() {
		return mcframe.clientMSBG.MSBGP0040.Dtl2R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.Dtl2R> createDtl2L() {
		return MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl2R.class);
	}

	/**
	 * Dtl2Tableを初期化します。
	 */
	protected void createDtl2Table(){
		if(Dtl2Table == null){
			Dtl2Table = beansFactory.createTable2("Dtl2.table");
		}
	}

	/**
	 * コピーによってaDtl3Lを設定します。
	 *
	 * aDtl3Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl3L
	 */
	public void setDtl3L(MCList<mcframe.clientMSBG.MSBGP0040.Dtl3R> aList) {
		if (getDtl3L() != aList) {
			getDtl3L().setAll(aList);
		}
	}

	/**
	 * [Dtl3]ブロックのコンテナaDtl3Lを返します。
	 *
	 * @return Dtl3L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.Dtl3R> getDtl3L() {
		return aDtl3L;
	}

	/**
	 * aDtl3Rを作成します。
	 *
	 * @return Dtl3R
	 */
	public mcframe.clientMSBG.MSBGP0040.Dtl3R createDtl3R() {
		return mcframe.clientMSBG.MSBGP0040.Dtl3R.create();
	}

	/**
	 * aDtl3Lを作成します。
	 *
	 * @return Dtl3L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.Dtl3R> createDtl3L() {
		return MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl3R.class);
	}

	/**
	 * Dtl3Tableを初期化します。
	 */
	protected void createDtl3Table(){
		if(Dtl3Table == null){
			Dtl3Table = beansFactory.createTable2("Dtl3.table");
		}
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBG.MSBGP0040.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBG.MSBGP0040.RsltR createRsltR() {
		return mcframe.clientMSBG.MSBGP0040.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0040.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0040.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getDtl1L())) ret.add(getDtl1L());
		if(!MCCollectionUtil.contains(ret, getDtl1_SubL())) ret.add(getDtl1_SubL());
		if(!MCCollectionUtil.contains(ret, getDtl1_BtnR())) ret.add(getDtl1_BtnR());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
		if(!MCCollectionUtil.contains(ret, getDtl3L())) ret.add(getDtl3L());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtl1L()) return "Dtl1";
		if(aCnt == getDtl1_SubL()) return "Dtl1_Sub";
		if(aCnt == getDtl1_BtnR()) return "Dtl1_Btn";
		if(aCnt == getDtl2L()) return "Dtl2";
		if(aCnt == getDtl3L()) return "Dtl3";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Dtl1")) return getDtl1L();
		if(bId.equals("Dtl1_Sub")) return getDtl1_SubL();
		if(bId.equals("Dtl1_Btn")) return getDtl1_BtnR();
		if(bId.equals("Dtl2")) return getDtl2L();
		if(bId.equals("Dtl3")) return getDtl3L();
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
		ret.add(CndPanel);
		ret.add(HdrTabPanel);
		ret.add(Hdr2Panel);
		ret.add(HdrPanel);
		ret.add(ListPanel);
		ret.add(Dtl1InfoPanel);
		ret.add(Dtl1Panel);
		ret.add(Dtl1_BtnPanel);
		ret.add(Dtl2InfoPanel);
		ret.add(Dtl2Panel);
		ret.add(Dtl3Panel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillDSrch_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		aDtl1_SubL = createDtl1_SubL();
		aDtl1_BtnR = createDtl1_BtnR();
		aDtl2L = createDtl2L();
		aDtl3L = createDtl3L();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_BillDSrch_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		createDtl1Table();
		Dtl1Table.setRowName(name);
		aDtl1_SubL = createDtl1_SubL();
		aDtl1_BtnR = createDtl1_BtnR();
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
		aDtl3L = createDtl3L();
		createDtl3Table();
		Dtl3Table.setRowName(name);
		aRsltL = createRsltL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_BillDSrch_MC.jbCreateScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateCnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateHdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateHdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateHdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateList((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateDtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateDtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateDtl1_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateDtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateDtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateDtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateBtn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbCreateEastBtn((MSBGP_BillDSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_BillDSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_BillDSrch p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBGP_BillDSrch p) {
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBGP_BillDSrch p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBGP_BillDSrch p) {
		p.Hdr_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getHdrR().wrkno_p());
		p.Hdr_wrkno_p_PPanel.setName("Hdr.wrkno_p");
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
	protected static void jbCreateList(MSBGP_BillDSrch p) {
	}

	/**
	 * [Dtl1Info]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1Info(MSBGP_BillDSrch p) {
	}

	/**
	 * [Dtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1(MSBGP_BillDSrch p) {
		p.Dtl1_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$itm_p);
		p.Dtl1_itm_p_PPanel.setName("Dtl1.itm_p");
		p.columnDtl1_itm_cd = p.Dtl1_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl1_itm_cd.addAliasName("Dtl1.itm_cd", p);
		p.columnDtl1_itm_sub1 = p.Dtl1_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl1_itm_sub1.addAliasName("Dtl1.itm_sub1", p);
		p.columnDtl1_itm_sub2 = p.Dtl1_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl1_itm_sub2.addAliasName("Dtl1.itm_sub2", p);
		p.columnDtl1_itm_sub3 = p.Dtl1_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl1_itm_sub3.addAliasName("Dtl1.itm_sub3", p);
		p.columnDtl1_itm_nm = p.Dtl1_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl1_itm_nm.addAliasName("Dtl1.itm_nm", p);
		p.Dtl1_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$sno_p);
		p.Dtl1_sno_p_PPanel.setName("Dtl1.sno_p");
		p.Dtl1_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$trd_unit_qty_p);
		p.Dtl1_trd_unit_qty_p_PPanel.setName("Dtl1.trd_unit_qty_p");
		p.columnDtl1_trd_unit_qty = p.Dtl1_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl1_trd_unit_qty.addAliasName("Dtl1.trd_unit_qty", p);
		p.Dtl1_trdCurUpri_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$trdCurUpri_p);
		p.Dtl1_trdCurUpri_p_PPanel.setName("Dtl1.trdCurUpri_p");
		p.columnDtl1_trd_cur_upri = p.Dtl1_trdCurUpri_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_upri.addAliasName("Dtl1.trd_cur_upri", p);
		p.Dtl1_trdCurAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$trdCurAmt_p);
		p.Dtl1_trdCurAmt_p_PPanel.setName("Dtl1.trdCurAmt_p");
		p.columnDtl1_trd_cur_amt = p.Dtl1_trdCurAmt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_amt.addAliasName("Dtl1.trd_cur_amt", p);
		p.Dtl1_trdIncCtax_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$trdIncCtax_p);
		p.Dtl1_trdIncCtax_p_PPanel.setName("Dtl1.trdIncCtax_p");
		p.columnDtl1_trd_inc_tax_amt = p.Dtl1_trdIncCtax_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_inc_tax_amt.addAliasName("Dtl1.trd_inc_tax_amt", p);
		p.Dtl1_trdCurTax_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$trdCurTax_p);
		p.Dtl1_trdCurTax_p_PPanel.setName("Dtl1.trdCurTax_p");
		p.columnDtl1_trd_cur_tax_amt = p.Dtl1_trdCurTax_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_tax_amt.addAliasName("Dtl1.trd_cur_tax_amt", p);
		p.Dtl1_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$xrate_p);
		p.Dtl1_xrate_p_PPanel.setName("Dtl1.xrate_p");
		p.columnDtl1_xrate = p.Dtl1_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl1_xrate.addAliasName("Dtl1.xrate", p);
		p.Dtl1_trdCurDscnt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$trdCurDscnt_p);
		p.Dtl1_trdCurDscnt_p_PPanel.setName("Dtl1.trdCurDscnt_p");
		p.columnDtl1_trd_cur_dscnt_amt = p.Dtl1_trdCurDscnt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_dscnt_amt.addAliasName("Dtl1.trd_cur_dscnt_amt", p);
		p.Dtl1_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$base_cur_upri_p);
		p.Dtl1_base_cur_upri_p_PPanel.setName("Dtl1.base_cur_upri_p");
		p.columnDtl1_base_cur_upri = p.Dtl1_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_upri.addAliasName("Dtl1.base_cur_upri", p);
		p.Dtl1_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$base_cur_amt_p);
		p.Dtl1_base_cur_amt_p_PPanel.setName("Dtl1.base_cur_amt_p");
		p.columnDtl1_base_cur_amt = p.Dtl1_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_amt.addAliasName("Dtl1.base_cur_amt", p);
		p.Dtl1_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$base_cur_tax_amt_p);
		p.Dtl1_base_cur_tax_amt_p_PPanel.setName("Dtl1.base_cur_tax_amt_p");
		p.columnDtl1_base_cur_tax_amt = p.Dtl1_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_tax_amt.addAliasName("Dtl1.base_cur_tax_amt", p);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$base_cur_inc_tax_amt_p);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.setName("Dtl1.base_cur_inc_tax_amt_p");
		p.columnDtl1_base_cur_inc_tax_amt = p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_inc_tax_amt.addAliasName("Dtl1.base_cur_inc_tax_amt", p);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$base_cur_dscnt_amt_p);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.setName("Dtl1.base_cur_dscnt_amt_p");
		p.columnDtl1_base_cur_dscnt_amt = p.Dtl1_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_dscnt_amt.addAliasName("Dtl1.base_cur_dscnt_amt", p);
		p.Dtl1_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$wrkno_p);
		p.Dtl1_wrkno_p_PPanel.setName("Dtl1.wrkno_p");
		p.Dtl1_sls_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.$sls_wrkno_p);
		p.Dtl1_sls_wrkno_p_PPanel.setName("Dtl1.sls_wrkno_p");
		p.columnDtl1_sls_wrk_no = p.Dtl1_sls_wrkno_p_PPanel.columnWrkNo_wrk_no;
		p.columnDtl1_sls_wrk_no.addAliasName("Dtl1.sls_wrk_no", p);
		p.columnDtl1_sls_wrk_nm = p.Dtl1_sls_wrkno_p_PPanel.columnWrkNo_wrk_nm;
		p.columnDtl1_sls_wrk_nm.addAliasName("Dtl1.sls_wrk_nm", p);
	}

	/**
	 * [Dtl1_Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1_Btn(MSBGP_BillDSrch p) {
		p.Dtl1_Btn_paging_PPanel = mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.create(p.getDtl1_BtnR().paging());
		p.Dtl1_Btn_paging_PPanel.setName("Dtl1_Btn.paging");
		p.Dtl1_Btn_p_prev = p.Dtl1_Btn_paging_PPanel.Btn_prev;
		p.Dtl1_Btn_p_prev.addAliasName("Dtl1_Btn.p_prev", p);
		p.Dtl1_Btn_p_next = p.Dtl1_Btn_paging_PPanel.Btn_next;
		p.Dtl1_Btn_p_next.addAliasName("Dtl1_Btn.p_next", p);
	}

	/**
	 * [Dtl2Info]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2Info(MSBGP_BillDSrch p) {
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MSBGP_BillDSrch p) {
		p.Dtl2_trdCur_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl2R.$trdCur_p);
		p.Dtl2_trdCur_p_PPanel.setName("Dtl2.trdCur_p");
		p.columnDtl2_trd_cur_amt = p.Dtl2_trdCur_p_PPanel.columnAmt_amt;
		p.columnDtl2_trd_cur_amt.addAliasName("Dtl2.trd_cur_amt", p);
		p.Dtl2_setoffAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl2R.$setoffAmt_p);
		p.Dtl2_setoffAmt_p_PPanel.setName("Dtl2.setoffAmt_p");
		p.columnDtl2_setoff_amt = p.Dtl2_setoffAmt_p_PPanel.columnAmt_amt;
		p.columnDtl2_setoff_amt.addAliasName("Dtl2.setoff_amt", p);
		p.Dtl2_setoffTaxAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl2R.$setoffTaxAmt_p);
		p.Dtl2_setoffTaxAmt_p_PPanel.setName("Dtl2.setoffTaxAmt_p");
		p.columnDtl2_setoff_tax_amt = p.Dtl2_setoffTaxAmt_p_PPanel.columnAmt_amt;
		p.columnDtl2_setoff_tax_amt.addAliasName("Dtl2.setoff_tax_amt", p);
		p.Dtl2_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBG.MSBGP0040.Dtl2R.$wrkno_p);
		p.Dtl2_wrkno_p_PPanel.setName("Dtl2.wrkno_p");
	}

	/**
	 * [Dtl3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl3(MSBGP_BillDSrch p) {
		p.Dtl3_trdCur_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl3R.$trdCur_p);
		p.Dtl3_trdCur_p_PPanel.setName("Dtl3.trdCur_p");
		p.columnDtl3_trd_cur_amt = p.Dtl3_trdCur_p_PPanel.columnAmt_amt;
		p.columnDtl3_trd_cur_amt.addAliasName("Dtl3.trd_cur_amt", p);
		p.Dtl3_setoffAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl3R.$setoffAmt_p);
		p.Dtl3_setoffAmt_p_PPanel.setName("Dtl3.setoffAmt_p");
		p.columnDtl3_setoff_amt = p.Dtl3_setoffAmt_p_PPanel.columnAmt_amt;
		p.columnDtl3_setoff_amt.addAliasName("Dtl3.setoff_amt", p);
		p.Dtl3_setoffTaxAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0040.Dtl3R.$setoffTaxAmt_p);
		p.Dtl3_setoffTaxAmt_p_PPanel.setName("Dtl3.setoffTaxAmt_p");
		p.columnDtl3_setoff_tax_amt = p.Dtl3_setoffTaxAmt_p_PPanel.columnAmt_amt;
		p.columnDtl3_setoff_tax_amt.addAliasName("Dtl3.setoff_tax_amt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_BillDSrch p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBGP_BillDSrch p) {
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

	
	/** [Hdr_base_cur_cd_ListPutter]の定義 */
	private MCListPutter Hdr_base_cur_cd_p = null;

	/**
	 * [Hdr_base_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_base_cur_cd_ListPutter() {
		if (Hdr_base_cur_cd_p == null) {
			Hdr_base_cur_cd_p = createHdr_base_cur_cd_ListPutter(Hdr_base_cur_cd, "base_cur_cd", "base_cur_nm","base_cur_amt_dec_place","base_cur_upri_dec_place");

		}
		return Hdr_base_cur_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_BillDSrch create(){
		MSBGP_BillDSrch p = new MSBGP_BillDSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_BillDSrch create(String name){
		MSBGP_BillDSrch p = new MSBGP_BillDSrch(name);
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
		MSBGP_BillDSrch_MC.jbfInitScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitCnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitHdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitHdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitHdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitList((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitDtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitDtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitDtl1_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitDtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitDtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitDtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitBtn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbfInitEastBtn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitCnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitHdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitHdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitHdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitList((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitDtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitDtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitDtl1_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitDtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitDtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitDtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitBtn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.jbInitEastBtn((MSBGP_BillDSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_bill_mng_no = p.beansFactory.createTextField("Cnd.bill_mng_no");
		p.Cnd_bill_no_Label = p.beansFactory.createLabel("Cnd.bill_no_Label");
		p.Cnd_bill_no = p.beansFactory.createTextField("Cnd.bill_no");
		p.Cnd_bill_no.setLabel(p.Cnd_bill_no_Label);
		p.Cnd_sign_rivrs_flg = p.beansFactory.createCheckBox("Cnd.sign_rivrs_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_bill_no_Label = p.beansFactory.createLabel("Hdr.bill_no_Label");
		p.Hdr_bill_no = p.beansFactory.createTextField("Hdr.bill_no");
		p.Hdr_bill_no.setLabel(p.Hdr_bill_no_Label);
		p.Hdr_bill_rev = p.beansFactory.createNumberField("Hdr.bill_rev");
		p.Hdr_bill_cl_ym_Label = p.beansFactory.createLabel("Hdr.bill_cl_ym_Label");
		p.Hdr_bill_cl_ym = p.beansFactory.createDateField("Hdr.bill_cl_ym");
		p.Hdr_bill_cl_ym.setLabel(p.Hdr_bill_cl_ym_Label);
		p.Hdr_bill_cl_day_Label = p.beansFactory.createLabel("Hdr.bill_cl_day_Label");
		p.Hdr_bill_cl_day = p.beansFactory.createNumberField("Hdr.bill_cl_day");
		p.Hdr_bill_cl_day.setLabel(p.Hdr_bill_cl_day_Label);
		p.Hdr_bill_dt_Label = p.beansFactory.createLabel("Hdr.bill_dt_Label");
		p.Hdr_bill_dt = p.beansFactory.createDateField("Hdr.bill_dt");
		p.Hdr_bill_dt.setLabel(p.Hdr_bill_dt_Label);
		p.Hdr_rcv_schd_dt_Label = p.beansFactory.createLabel("Hdr.rcv_schd_dt_Label");
		p.Hdr_rcv_schd_dt = p.beansFactory.createDateField("Hdr.rcv_schd_dt");
		p.Hdr_rcv_schd_dt.setLabel(p.Hdr_rcv_schd_dt_Label);
		p.Hdr_multi_flg = p.beansFactory.createCheckBox("Hdr.multi_flg");
		p.Hdr_iv_no_Label = p.beansFactory.createLabel("Hdr.iv_no_Label");
		p.Hdr_iv_no = p.beansFactory.createTextField("Hdr.iv_no");
		p.Hdr_iv_no.setLabel(p.Hdr_iv_no_Label);
		p.Hdr_pre_bill_no_Label = p.beansFactory.createLabel("Hdr.pre_bill_no_Label");
		p.Hdr_pre_bill_no = p.beansFactory.createTextField("Hdr.pre_bill_no");
		p.Hdr_pre_bill_no.setLabel(p.Hdr_pre_bill_no_Label);
		p.Hdr_prnt_flg = p.beansFactory.createCheckBox("Hdr.prnt_flg");
		p.Hdr_bill_dpt_cd_Label = p.beansFactory.createLabel("Hdr.bill_dpt_cd_Label");
		p.Hdr_bill_dpt_cd = p.beansFactory.createTextField("Hdr.bill_dpt_cd");
		p.Hdr_bill_dpt_cd.setLabel(p.Hdr_bill_dpt_cd_Label);
		p.Hdr_bill_dpt_nm = p.beansFactory.createTextField("Hdr.bill_dpt_nm");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_bcst_cd_Label = p.beansFactory.createLabel("Hdr.bcst_cd_Label");
		p.Hdr_bcst_cd = p.beansFactory.createTextField("Hdr.bcst_cd");
		p.Hdr_bcst_cd.setLabel(p.Hdr_bcst_cd_Label);
		p.Hdr_bcst_nm = p.beansFactory.createTextField("Hdr.bcst_nm");
		p.Hdr_foreign_flg = p.beansFactory.createCheckBox("Hdr.foreign_flg");
		p.Hdr_edi_flg = p.beansFactory.createCheckBox("Hdr.edi_flg");
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextField("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
		p.Hdr_base_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.base_cur_amt_dec_place");
		p.Hdr_base_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.base_cur_upri_dec_place");
		p.Hdr_bill_xrate_Label = p.beansFactory.createLabel("Hdr.bill_xrate_Label");
		p.Hdr_bill_xrate = p.beansFactory.createNumberField("Hdr.bill_xrate");
		p.Hdr_bill_xrate.setLabel(p.Hdr_bill_xrate_Label);
		p.Hdr_upri_dec_place = p.beansFactory.createNumberField("Hdr.upri_dec_place");
		p.Hdr_amt_dec_place = p.beansFactory.createNumberField("Hdr.amt_dec_place");
		p.Hdr_ins_usr_id_Label = p.beansFactory.createLabel("Hdr.ins_usr_id_Label");
		p.Hdr_ins_usr_id = p.beansFactory.createTextField("Hdr.ins_usr_id");
		p.Hdr_ins_usr_id.setLabel(p.Hdr_ins_usr_id_Label);
		p.Hdr_ins_usr_nm = p.beansFactory.createTextField("Hdr.ins_usr_nm");
		p.Hdr_ins_func_id_Label = p.beansFactory.createLabel("Hdr.ins_func_id_Label");
		p.Hdr_ins_func_id = p.beansFactory.createTextField("Hdr.ins_func_id");
		p.Hdr_ins_func_id.setLabel(p.Hdr_ins_func_id_Label);
		p.Hdr_ins_func_nm = p.beansFactory.createTextField("Hdr.ins_func_nm");
		p.Hdr_upd_usr_id_Label = p.beansFactory.createLabel("Hdr.upd_usr_id_Label");
		p.Hdr_upd_usr_id = p.beansFactory.createTextField("Hdr.upd_usr_id");
		p.Hdr_upd_usr_id.setLabel(p.Hdr_upd_usr_id_Label);
		p.Hdr_upd_usr_nm = p.beansFactory.createTextField("Hdr.upd_usr_nm");
		p.Hdr_upd_func_id_Label = p.beansFactory.createLabel("Hdr.upd_func_id_Label");
		p.Hdr_upd_func_id = p.beansFactory.createTextField("Hdr.upd_func_id");
		p.Hdr_upd_func_id.setLabel(p.Hdr_upd_func_id_Label);
		p.Hdr_upd_func_nm = p.beansFactory.createTextField("Hdr.upd_func_nm");
		p.Hdr_ins_ts_Label = p.beansFactory.createLabel("Hdr.ins_ts_Label");
		p.Hdr_ins_ts = p.beansFactory.createTimestampField("Hdr.ins_ts");
		p.Hdr_ins_ts.setLabel(p.Hdr_ins_ts_Label);
		p.Hdr_upd_ts_Label = p.beansFactory.createLabel("Hdr.upd_ts_Label");
		p.Hdr_upd_ts = p.beansFactory.createTimestampField("Hdr.upd_ts");
		p.Hdr_upd_ts.setLabel(p.Hdr_upd_ts_Label);
		p.Hdr_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr.upd_srv_req_no_Label");
		p.Hdr_upd_srv_req_no = p.beansFactory.createTextField("Hdr.upd_srv_req_no");
		p.Hdr_upd_srv_req_no.setLabel(p.Hdr_upd_srv_req_no_Label);
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
		p.Hdr_bill_mng_no = p.beansFactory.createTextField("Hdr.bill_mng_no");
	}

	/**
	 * [List]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitList(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.ListPanel = p.beansFactory.createPanel("List");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1Info]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1Info(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl1InfoPanel = p.beansFactory.createPanel("Dtl1Info");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl1Panel = p.beansFactory.createPanel("Dtl1");
		p.Dtl1TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl1ScrollPane = p.beansFactory.createScrollPane("Dtl1.scroll");
		p.createDtl1Table();
		// ブロックの項目の初期化
		p.columnDtl1_row_num = p.beansFactory.createTableColumn("Dtl1.row_num", MCColumnType.NUMBER);
		p.columnDtl1_check = p.beansFactory.createTableColumn("Dtl1.check", MCColumnType.CHECK);
		p.columnDtl1_ac_ym = p.beansFactory.createTableColumn("Dtl1.ac_ym", MCColumnType.DATE);
		p.columnDtl1_ac_dt = p.beansFactory.createTableColumn("Dtl1.ac_dt", MCColumnType.DATE);
		p.columnDtl1_slip_sts_typ = p.beansFactory.createTableColumn("Dtl1.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtl1_slip_sts_typ_nm = p.beansFactory.createTableColumn("Dtl1.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_cd = p.beansFactory.createTableColumn("Dtl1.trd_cd", MCColumnType.TEXT);
		p.columnDtl1_trd_nm = p.beansFactory.createTableColumn("Dtl1.trd_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl1.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl1_ar_typ = p.beansFactory.createTableColumn("Dtl1.ar_typ", MCColumnType.TEXT);
		p.columnDtl1_ar_typ_nm = p.beansFactory.createTableColumn("Dtl1.ar_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_base_sls_ac_dt = p.beansFactory.createTableColumn("Dtl1.base_sls_ac_dt", MCColumnType.DATE);
		p.columnDtl1_act_no = p.beansFactory.createTableColumn("Dtl1.act_no", MCColumnType.TEXT);
		p.columnDtl1_act_rev = p.beansFactory.createTableColumn("Dtl1.act_rev", MCColumnType.NUMBER);
		p.columnDtl1_act_seq = p.beansFactory.createTableColumn("Dtl1.act_seq", MCColumnType.NUMBER);
		p.columnDtl1_act_d_no = p.beansFactory.createTableColumn("Dtl1.act_d_no", MCColumnType.TEXT);
		p.columnDtl1_act_d_seq = p.beansFactory.createTableColumn("Dtl1.act_d_seq", MCColumnType.NUMBER);
		p.columnDtl1_dlv_dt = p.beansFactory.createTableColumn("Dtl1.dlv_dt", MCColumnType.DATE);
		p.columnDtl1_bill_basis_dt = p.beansFactory.createTableColumn("Dtl1.bill_basis_dt", MCColumnType.DATE);
		p.columnDtl1_bill_crryovr_times = p.beansFactory.createTableColumn("Dtl1.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl1_cst_itm_cd = p.beansFactory.createTableColumn("Dtl1.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl1_cst_itm_nm = p.beansFactory.createTableColumn("Dtl1.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_cd = p.beansFactory.createTableColumn("Dtl1.trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_nm = p.beansFactory.createTableColumn("Dtl1.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_dec_place = p.beansFactory.createTableColumn("Dtl1.trd_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_inc_tax_flg = p.beansFactory.createTableColumn("Dtl1.inc_tax_flg", MCColumnType.CHECK);
		p.columnDtl1_interim_flg = p.beansFactory.createTableColumn("Dtl1.interim_flg", MCColumnType.CHECK);
		p.columnDtl1_tax_cd = p.beansFactory.createTableColumn("Dtl1.tax_cd", MCColumnType.TEXT);
		p.columnDtl1_tax_nm = p.beansFactory.createTableColumn("Dtl1.tax_nm", MCColumnType.TEXT);
		p.columnDtl1_tax_rate = p.beansFactory.createTableColumn("Dtl1.tax_rate", MCColumnType.NUMBER);
		p.columnDtl1_cst_cd = p.beansFactory.createTableColumn("Dtl1.cst_cd", MCColumnType.TEXT);
		p.columnDtl1_cst_nm = p.beansFactory.createTableColumn("Dtl1.cst_nm", MCColumnType.TEXT);
		p.columnDtl1_dlv_cd = p.beansFactory.createTableColumn("Dtl1.dlv_cd", MCColumnType.TEXT);
		p.columnDtl1_dlv_nm = p.beansFactory.createTableColumn("Dtl1.dlv_nm", MCColumnType.TEXT);
		p.columnDtl1_dest_cd1 = p.beansFactory.createTableColumn("Dtl1.dest_cd1", MCColumnType.TEXT);
		p.columnDtl1_dest_nm1 = p.beansFactory.createTableColumn("Dtl1.dest_nm1", MCColumnType.TEXT);
		p.columnDtl1_dest_cd2 = p.beansFactory.createTableColumn("Dtl1.dest_cd2", MCColumnType.TEXT);
		p.columnDtl1_dest_nm2 = p.beansFactory.createTableColumn("Dtl1.dest_nm2", MCColumnType.TEXT);
		p.columnDtl1_dest_cd3 = p.beansFactory.createTableColumn("Dtl1.dest_cd3", MCColumnType.TEXT);
		p.columnDtl1_dest_nm3 = p.beansFactory.createTableColumn("Dtl1.dest_nm3", MCColumnType.TEXT);
		p.columnDtl1_sls_usr_cd = p.beansFactory.createTableColumn("Dtl1.sls_usr_cd", MCColumnType.TEXT);
		p.columnDtl1_sls_usr_nm = p.beansFactory.createTableColumn("Dtl1.sls_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_sls_dpt_cd = p.beansFactory.createTableColumn("Dtl1.sls_dpt_cd", MCColumnType.TEXT);
		p.columnDtl1_sls_dpt_nm = p.beansFactory.createTableColumn("Dtl1.sls_dpt_nm", MCColumnType.TEXT);
		p.columnDtl1_slo_no = p.beansFactory.createTableColumn("Dtl1.slo_no", MCColumnType.TEXT);
		p.columnDtl1_slo_d_no = p.beansFactory.createTableColumn("Dtl1.slo_d_no", MCColumnType.TEXT);
		p.columnDtl1_cst_po_no = p.beansFactory.createTableColumn("Dtl1.cst_po_no", MCColumnType.TEXT);
		p.columnDtl1_cst_po_d_no = p.beansFactory.createTableColumn("Dtl1.cst_po_d_no", MCColumnType.TEXT);
		p.columnDtl1_dlv_slip_no = p.beansFactory.createTableColumn("Dtl1.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl1_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl1.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl1_ship_dlv_slip_no = p.beansFactory.createTableColumn("Dtl1.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl1_ship_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl1.ship_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl1_ship_dlv_slip_multi_flg = p.beansFactory.createTableColumn("Dtl1.ship_dlv_slip_multi_flg", MCColumnType.CHECK);
		p.columnDtl1_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl1.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl1_bill_d_no = p.beansFactory.createTableColumn("Dtl1.bill_d_no", MCColumnType.TEXT);
		p.columnDtl1_ins_usr_id = p.beansFactory.createTableColumn("Dtl1.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl1_ins_usr_nm = p.beansFactory.createTableColumn("Dtl1.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_ins_func_id = p.beansFactory.createTableColumn("Dtl1.ins_func_id", MCColumnType.TEXT);
		p.columnDtl1_ins_func_nm = p.beansFactory.createTableColumn("Dtl1.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl1_ins_ts = p.beansFactory.createTableColumn("Dtl1.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl1_upd_usr_id = p.beansFactory.createTableColumn("Dtl1.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl1_upd_usr_nm = p.beansFactory.createTableColumn("Dtl1.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_upd_func_id = p.beansFactory.createTableColumn("Dtl1.upd_func_id", MCColumnType.TEXT);
		p.columnDtl1_upd_func_nm = p.beansFactory.createTableColumn("Dtl1.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl1_upd_ts = p.beansFactory.createTableColumn("Dtl1.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl1_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl1.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl1_upd_cntr = p.beansFactory.createTableColumn("Dtl1.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl1_dec_place = p.beansFactory.createTableColumn("Dtl1.dec_place", MCColumnType.NUMBER);
		p.columnDtl1_bill_d_typ = p.beansFactory.createTableColumn("Dtl1.bill_d_typ", MCColumnType.TEXT);
		p.columnDtl1_bill_mng_no = p.beansFactory.createTableColumn("Dtl1.bill_mng_no", MCColumnType.TEXT);
	}

	/**
	 * [Dtl1_Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1_Btn(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl1_BtnPanel = p.beansFactory.createPanel("Dtl1_Btn");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2Info]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2Info(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl2InfoPanel = p.beansFactory.createPanel("Dtl2Info");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_check = p.beansFactory.createTableColumn("Dtl2.check", MCColumnType.CHECK);
		p.columnDtl2_ac_ym = p.beansFactory.createTableColumn("Dtl2.ac_ym", MCColumnType.DATE);
		p.columnDtl2_ac_dt = p.beansFactory.createTableColumn("Dtl2.ac_dt", MCColumnType.DATE);
		p.columnDtl2_slip_sts_typ = p.beansFactory.createTableColumn("Dtl2.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtl2_slip_sts_typ_nm = p.beansFactory.createTableColumn("Dtl2.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_trd_cd = p.beansFactory.createTableColumn("Dtl2.trd_cd", MCColumnType.TEXT);
		p.columnDtl2_trd_nm = p.beansFactory.createTableColumn("Dtl2.trd_nm", MCColumnType.TEXT);
		p.columnDtl2_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl2.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl2_ar_typ = p.beansFactory.createTableColumn("Dtl2.ar_typ", MCColumnType.TEXT);
		p.columnDtl2_ar_typ_nm = p.beansFactory.createTableColumn("Dtl2.ar_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_act_no = p.beansFactory.createTableColumn("Dtl2.act_no", MCColumnType.TEXT);
		p.columnDtl2_act_rev = p.beansFactory.createTableColumn("Dtl2.act_rev", MCColumnType.NUMBER);
		p.columnDtl2_act_seq = p.beansFactory.createTableColumn("Dtl2.act_seq", MCColumnType.NUMBER);
		p.columnDtl2_act_d_no = p.beansFactory.createTableColumn("Dtl2.act_d_no", MCColumnType.TEXT);
		p.columnDtl2_act_d_seq = p.beansFactory.createTableColumn("Dtl2.act_d_seq", MCColumnType.NUMBER);
		p.columnDtl2_rcv_dt = p.beansFactory.createTableColumn("Dtl2.rcv_dt", MCColumnType.DATE);
		p.columnDtl2_bill_basis_dt = p.beansFactory.createTableColumn("Dtl2.bill_basis_dt", MCColumnType.DATE);
		p.columnDtl2_bill_crryovr_times = p.beansFactory.createTableColumn("Dtl2.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl2_setoff_tax_cd = p.beansFactory.createTableColumn("Dtl2.setoff_tax_cd", MCColumnType.TEXT);
		p.columnDtl2_setoff_tax_nm = p.beansFactory.createTableColumn("Dtl2.setoff_tax_nm", MCColumnType.TEXT);
		p.columnDtl2_setoff_tax_rate = p.beansFactory.createTableColumn("Dtl2.setoff_tax_rate", MCColumnType.NUMBER);
		p.columnDtl2_bill_d_rmrks = p.beansFactory.createTableColumn("Dtl2.bill_d_rmrks", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_id = p.beansFactory.createTableColumn("Dtl2.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_nm = p.beansFactory.createTableColumn("Dtl2.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_ins_func_id = p.beansFactory.createTableColumn("Dtl2.ins_func_id", MCColumnType.TEXT);
		p.columnDtl2_ins_func_nm = p.beansFactory.createTableColumn("Dtl2.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl2_ins_ts = p.beansFactory.createTableColumn("Dtl2.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_upd_usr_id = p.beansFactory.createTableColumn("Dtl2.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl2_upd_usr_nm = p.beansFactory.createTableColumn("Dtl2.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_func_id = p.beansFactory.createTableColumn("Dtl2.upd_func_id", MCColumnType.TEXT);
		p.columnDtl2_upd_func_nm = p.beansFactory.createTableColumn("Dtl2.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_ts = p.beansFactory.createTableColumn("Dtl2.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl2.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl2_upd_cntr = p.beansFactory.createTableColumn("Dtl2.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl2_dec_place = p.beansFactory.createTableColumn("Dtl2.dec_place", MCColumnType.NUMBER);
		p.columnDtl2_bill_d_no = p.beansFactory.createTableColumn("Dtl2.bill_d_no", MCColumnType.TEXT);
		p.columnDtl2_bill_d_typ = p.beansFactory.createTableColumn("Dtl2.bill_d_typ", MCColumnType.TEXT);
		p.columnDtl2_bill_mng_no = p.beansFactory.createTableColumn("Dtl2.bill_mng_no", MCColumnType.TEXT);
	}

	/**
	 * [Dtl3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl3(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl3Panel = p.beansFactory.createPanel("Dtl3");
		p.Dtl3TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl3ScrollPane = p.beansFactory.createScrollPane("Dtl3.scroll");
		p.createDtl3Table();
		// ブロックの項目の初期化
		p.columnDtl3_ac_ym = p.beansFactory.createTableColumn("Dtl3.ac_ym", MCColumnType.DATE);
		p.columnDtl3_ac_dt = p.beansFactory.createTableColumn("Dtl3.ac_dt", MCColumnType.DATE);
		p.columnDtl3_slip_sts_typ = p.beansFactory.createTableColumn("Dtl3.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtl3_slip_sts_typ_nm = p.beansFactory.createTableColumn("Dtl3.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl3_trd_cd = p.beansFactory.createTableColumn("Dtl3.trd_cd", MCColumnType.TEXT);
		p.columnDtl3_trd_nm = p.beansFactory.createTableColumn("Dtl3.trd_nm", MCColumnType.TEXT);
		p.columnDtl3_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl3.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl3_rcv_act_no = p.beansFactory.createTableColumn("Dtl3.rcv_act_no", MCColumnType.TEXT);
		p.columnDtl3_rcv_act_seq = p.beansFactory.createTableColumn("Dtl3.rcv_act_seq", MCColumnType.NUMBER);
		p.columnDtl3_rcv_act_rev = p.beansFactory.createTableColumn("Dtl3.rcv_act_rev", MCColumnType.NUMBER);
		p.columnDtl3_rcv_act_d_no = p.beansFactory.createTableColumn("Dtl3.rcv_act_d_no", MCColumnType.TEXT);
		p.columnDtl3_rcv_act_d_seq = p.beansFactory.createTableColumn("Dtl3.rcv_act_d_seq", MCColumnType.NUMBER);
		p.columnDtl3_rcv_dt = p.beansFactory.createTableColumn("Dtl3.rcv_dt", MCColumnType.DATE);
		p.columnDtl3_setoff_tax_cd = p.beansFactory.createTableColumn("Dtl3.setoff_tax_cd", MCColumnType.TEXT);
		p.columnDtl3_setoff_tax_nm = p.beansFactory.createTableColumn("Dtl3.setoff_tax_nm", MCColumnType.TEXT);
		p.columnDtl3_setoff_tax_rate = p.beansFactory.createTableColumn("Dtl3.setoff_tax_rate", MCColumnType.NUMBER);
		p.columnDtl3_ins_usr_id = p.beansFactory.createTableColumn("Dtl3.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl3_ins_usr_nm = p.beansFactory.createTableColumn("Dtl3.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl3_ins_func_id = p.beansFactory.createTableColumn("Dtl3.ins_func_id", MCColumnType.TEXT);
		p.columnDtl3_ins_func_nm = p.beansFactory.createTableColumn("Dtl3.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl3_ins_ts = p.beansFactory.createTableColumn("Dtl3.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl3_upd_usr_id = p.beansFactory.createTableColumn("Dtl3.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl3_upd_usr_nm = p.beansFactory.createTableColumn("Dtl3.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl3_upd_func_id = p.beansFactory.createTableColumn("Dtl3.upd_func_id", MCColumnType.TEXT);
		p.columnDtl3_upd_func_nm = p.beansFactory.createTableColumn("Dtl3.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl3_upd_ts = p.beansFactory.createTableColumn("Dtl3.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl3_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl3.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_BillDSrch p) {
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
	protected static void jbInitCnd(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0040.CndR.ope_META);
		p.CndPanel.add(p.Cnd_bill_mng_no);
		p.CndPanel.setLastBeans(p.Cnd_bill_mng_no);
		p.Cnd_bill_mng_no.setNextBeans(p.Cnd_bill_no);
		p.Cnd_bill_mng_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0040.CndR.bill_mng_no_META);
		p.CndPanel.add(p.Cnd_bill_no_Label);
		p.CndPanel.add(p.Cnd_bill_no);
		p.Cnd_bill_no.setNextBeans(p.Cnd_sign_rivrs_flg);
		p.Cnd_bill_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0040.CndR.bill_no_META);
		p.CndPanel.add(p.Cnd_sign_rivrs_flg);
		p.Cnd_sign_rivrs_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_sign_rivrs_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0040.CndR.sign_rivrs_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.ListPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setValueCheck(false);
		p.HdrTabPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.HdrTabPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setValueCheck(false);
		p.Hdr2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_bill_no_Label);
		p.HdrPanel.add(p.Hdr_bill_no);
		p.HdrPanel.setLastBeans(p.Hdr_bill_no);
		p.Hdr_bill_no.setNextBeans(p.Hdr_bill_rev);
		p.Hdr_bill_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bill_no_META);
		p.HdrPanel.add(p.Hdr_bill_rev);
		p.Hdr_bill_rev.setNextBeans(p.Hdr_bill_cl_ym);
		p.Hdr_bill_rev.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bill_rev_META);
		p.HdrPanel.add(p.Hdr_bill_cl_ym_Label);
		p.HdrPanel.add(p.Hdr_bill_cl_ym);
		p.Hdr_bill_cl_ym.setNextBeans(p.Hdr_bill_cl_day);
		p.Hdr_bill_cl_ym.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bill_cl_ym_META);
		p.Hdr_bill_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_bill_cl_day_Label);
		p.HdrPanel.add(p.Hdr_bill_cl_day);
		p.Hdr_bill_cl_day.setNextBeans(p.Hdr_bill_dt);
		p.Hdr_bill_cl_day.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bill_cl_day_META);
		p.HdrPanel.add(p.Hdr_bill_dt_Label);
		p.HdrPanel.add(p.Hdr_bill_dt);
		p.Hdr_bill_dt.setNextBeans(p.Hdr_rcv_schd_dt);
		p.Hdr_bill_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bill_dt_META);
		p.Hdr_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_rcv_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_rcv_schd_dt);
		p.Hdr_rcv_schd_dt.setNextBeans(p.Hdr_multi_flg);
		p.Hdr_rcv_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.rcv_schd_dt_META);
		p.Hdr_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_multi_flg);
		p.Hdr_multi_flg.setNextBeans(p.Hdr_iv_no);
		p.Hdr_multi_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.multi_flg_META);
		p.HdrPanel.add(p.Hdr_iv_no_Label);
		p.HdrPanel.add(p.Hdr_iv_no);
		p.Hdr_iv_no.setNextBeans(p.Hdr_pre_bill_no);
		p.Hdr_iv_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.iv_no_META);
		p.HdrPanel.add(p.Hdr_pre_bill_no_Label);
		p.HdrPanel.add(p.Hdr_pre_bill_no);
		p.Hdr_pre_bill_no.setNextBeans(p.Hdr_prnt_flg);
		p.Hdr_pre_bill_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.pre_bill_no_META);
		p.HdrPanel.add(p.Hdr_prnt_flg);
		p.Hdr_prnt_flg.setNextBeans(p.Hdr_bill_dpt_cd);
		p.Hdr_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.prnt_flg_META);
		p.HdrPanel.add(p.Hdr_bill_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_bill_dpt_cd);
		p.Hdr_bill_dpt_cd.setNextBeans(p.Hdr_bill_dpt_nm);
		p.Hdr_bill_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bill_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_bill_dpt_nm);
		p.Hdr_bill_dpt_nm.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_bill_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bill_dpt_nm_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_bcst_cd);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_bcst_cd_Label);
		p.HdrPanel.add(p.Hdr_bcst_cd);
		p.Hdr_bcst_cd.setNextBeans(p.Hdr_bcst_nm);
		p.Hdr_bcst_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bcst_cd_META);
		p.HdrPanel.add(p.Hdr_bcst_nm);
		p.Hdr_bcst_nm.setNextBeans(p.Hdr_foreign_flg);
		p.Hdr_bcst_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bcst_nm_META);
		p.HdrPanel.add(p.Hdr_foreign_flg);
		p.Hdr_foreign_flg.setNextBeans(p.Hdr_edi_flg);
		p.Hdr_foreign_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.foreign_flg_META);
		p.HdrPanel.add(p.Hdr_edi_flg);
		p.Hdr_edi_flg.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_edi_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.edi_flg_META);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_base_cur_cd);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.base_cur_cd_META);
		p.Hdr_base_cur_cd.addLinkBeans(p.Hdr_base_cur_nm,p.Hdr_base_cur_amt_dec_place,p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_amt_dec_place.setNextBeans(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.base_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_upri_dec_place.setNextBeans(p.Hdr_bill_xrate);
		p.Hdr_base_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.base_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_bill_xrate_Label);
		p.HdrPanel.add(p.Hdr_bill_xrate);
		p.Hdr_bill_xrate.setNextBeans(p.Hdr_wrkno_p_PPanel);
		p.Hdr_bill_xrate.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bill_xrate_META);
		p.HdrPanel.add(p.Hdr_wrkno_p_PPanel);
		p.Hdr_wrkno_p_PPanel.setNextBeans(p.Hdr_lastBillAmt_p_PPanel);
		p.HdrPanel.add(p.Hdr_lastBillAmt_p_PPanel);
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
		p.Hdr_billAmt_p_PPanel.setNextBeans(p.Hdr_upri_dec_place);
		p.HdrPanel.add(p.Hdr_upri_dec_place);
		p.Hdr_upri_dec_place.setNextBeans(p.Hdr_amt_dec_place);
		p.Hdr_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_amt_dec_place);
		p.Hdr_amt_dec_place.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.amt_dec_place_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.upd_srv_req_no_META);
		p.HdrPanel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setNextBeans(p.Hdr_bill_mng_no);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.upd_cntr_META);
		p.HdrPanel.add(p.Hdr_bill_mng_no);
		p.Hdr_bill_mng_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0040.HdrR.bill_mng_no_META);
	}

	/**
	 * [List]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitList(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.add(p.ListPanel);
		p.ListPanel.setNextBeans(p.BtnPanel);
		p.ListPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.ListPanel.add(p.Dtl1InfoPanel, null);
		p.ListPanel.setLastBeans(p.Dtl1InfoPanel);
		p.Dtl1InfoPanel.setNextBeans(p.Dtl2InfoPanel);
		p.ListPanel.add(p.Dtl2InfoPanel, null);
	}

	/**
	 * [Dtl1Info]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1Info(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl1InfoPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.Dtl1InfoPanel.add(p.Dtl1Panel, null);
		p.Dtl1InfoPanel.setLastBeans(p.Dtl1Panel);
		p.Dtl1Panel.setNextBeans(p.Dtl1_BtnPanel);
		p.Dtl1InfoPanel.add(p.Dtl1_BtnPanel, null);
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl1Panel.setBorder(p.Dtl1TitledBorder);
		p.Dtl1Panel.add(p.Dtl1ScrollPane);
		p.Dtl1Panel.setLastBeans(p.Dtl1Table);
		p.Dtl1ScrollPane.setViewportView(p.Dtl1Table);
		p.Dtl1Table.setList(p.getDtl1L());
		p.Dtl1Table.setStatusColumnVisible(false);
		p.Dtl1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1_Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1_Btn(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl1_BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Dtl1_BtnPanel.add(p.Dtl1_Btn_paging_PPanel);
		p.Dtl1_BtnPanel.setLastBeans(p.Dtl1_Btn_paging_PPanel);
	}

	/**
	 * [Dtl2Info]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2Info(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl2InfoPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.Dtl2InfoPanel.add(p.Dtl2Panel, null);
		p.Dtl2InfoPanel.setLastBeans(p.Dtl2Panel);
		p.Dtl2Panel.setNextBeans(p.Dtl3Panel);
		p.Dtl2InfoPanel.add(p.Dtl3Panel, null);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl2Panel.setBorder(p.Dtl2TitledBorder);
		p.Dtl2Panel.add(p.Dtl2ScrollPane);
		p.Dtl2Panel.setLastBeans(p.Dtl2Table);
		p.Dtl2ScrollPane.setViewportView(p.Dtl2Table);
		p.Dtl2Table.setList(p.getDtl2L());
		p.Dtl2Table.setStatusColumnVisible(false);
		p.Dtl2Panel.setLayoutPosition("CLC+");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl3(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.Dtl3Panel.setBorder(p.Dtl3TitledBorder);
		p.Dtl3Panel.add(p.Dtl3ScrollPane);
		p.Dtl3Panel.setLastBeans(p.Dtl3Table);
		p.Dtl3ScrollPane.setViewportView(p.Dtl3Table);
		p.Dtl3Table.setList(p.getDtl3L());
		p.Dtl3Table.setStatusColumnVisible(false);
		p.Dtl3Panel.setLayoutPosition("CRC+");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_BillDSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_prnt);
		p.BtnPanel.setLastBeans(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_upd);
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
	protected static void jbInitEastBtn(MSBGP_BillDSrch p) {
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

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBGP_BillDSrch_MC.mcInitScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitCnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitHdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitHdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitHdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitList((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitDtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitDtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitDtl1_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitDtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitDtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitDtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitBtn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.mcInitEastBtn((MSBGP_BillDSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_BillDSrch_MC.statusInitSRCH_ScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Cnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_HdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Hdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Hdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_List((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Dtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Dtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Dtl1__Sub((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Dtl1__Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Dtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Dtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Dtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Rslt((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitSRCH_EastBtn((MSBGP_BillDSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_BillDSrch_MC.statusInitREF_ScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Cnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_HdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Hdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Hdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_List((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Dtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Dtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Dtl1__Sub((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Dtl1__Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Dtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Dtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Dtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Rslt((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitREF_EastBtn((MSBGP_BillDSrch)this);

		// [UPD]ステータスのモードの設定
		MSBGP_BillDSrch_MC.statusInitUPD_ScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Cnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_HdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Hdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Hdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_List((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Dtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Dtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Dtl1__Sub((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Dtl1__Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Dtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Dtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Dtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Rslt((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitUPD_EastBtn((MSBGP_BillDSrch)this);

		// [FIX_U]ステータスのモードの設定
		MSBGP_BillDSrch_MC.statusInitFIX__U_ScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Cnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_HdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Hdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Hdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_List((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Dtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Dtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Dtl1__Sub((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Dtl1__Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Dtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Dtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Dtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Rslt((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__U_EastBtn((MSBGP_BillDSrch)this);

		// [DEL]ステータスのモードの設定
		MSBGP_BillDSrch_MC.statusInitDEL_ScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Cnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_HdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Hdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Hdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_List((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Dtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Dtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Dtl1__Sub((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Dtl1__Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Dtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Dtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Dtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Rslt((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitDEL_EastBtn((MSBGP_BillDSrch)this);

		// [FIX_D]ステータスのモードの設定
		MSBGP_BillDSrch_MC.statusInitFIX__D_ScreenOpe((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Cnd((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_HdrTab((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Hdr2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Hdr((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_List((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Dtl1Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Dtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Dtl1__Sub((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Dtl1__Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Dtl2Info((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Dtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Dtl3((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Rslt((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_Btn((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.statusInitFIX__D_EastBtn((MSBGP_BillDSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_BillDSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_BillDSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_bill_mng_no.setListListener(p);
		p.Cnd_bill_mng_no.addAllListener(p);
		p.Cnd_bill_no.setListListener(p);
		p.Cnd_bill_no.addAllListener(p);
		p.Cnd_sign_rivrs_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBGP_BillDSrch p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBGP_BillDSrch p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBGP_BillDSrch p) {
		p.Hdr_bill_no.setListListener(p);
		p.Hdr_bill_no.addAllListener(p);
		p.Hdr_bill_rev.setListListener(p);
		p.Hdr_bill_rev.addAllListener(p);
		p.Hdr_bill_cl_ym.setListListener(p);
		p.Hdr_bill_cl_ym.addAllListener(p);
		p.Hdr_bill_cl_day.setListListener(p);
		p.Hdr_bill_cl_day.addAllListener(p);
		p.Hdr_bill_dt.setListListener(p);
		p.Hdr_bill_dt.addAllListener(p);
		p.Hdr_rcv_schd_dt.setListListener(p);
		p.Hdr_rcv_schd_dt.addAllListener(p);
		p.Hdr_multi_flg.addAllListener(p);
		p.Hdr_iv_no.setListListener(p);
		p.Hdr_iv_no.addAllListener(p);
		p.Hdr_pre_bill_no.setListListener(p);
		p.Hdr_pre_bill_no.addAllListener(p);
		p.Hdr_prnt_flg.addAllListener(p);
		p.Hdr_bill_dpt_cd.setListListener(p);
		p.Hdr_bill_dpt_cd.addAllListener(p);
		p.Hdr_bill_dpt_nm.setListListener(p);
		p.Hdr_bill_dpt_nm.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_bcst_cd.setListListener(p);
		p.Hdr_bcst_cd.addAllListener(p);
		p.Hdr_bcst_nm.setListListener(p);
		p.Hdr_bcst_nm.addAllListener(p);
		p.Hdr_foreign_flg.addAllListener(p);
		p.Hdr_edi_flg.addAllListener(p);
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_base_cur_nm.setListListener(p);
		p.Hdr_base_cur_nm.addAllListener(p);
		p.Hdr_base_cur_amt_dec_place.setListListener(p);
		p.Hdr_base_cur_amt_dec_place.addAllListener(p);
		p.Hdr_base_cur_upri_dec_place.setListListener(p);
		p.Hdr_base_cur_upri_dec_place.addAllListener(p);
		p.Hdr_bill_xrate.setListListener(p);
		p.Hdr_bill_xrate.addAllListener(p);
		p.Hdr_upri_dec_place.setListListener(p);
		p.Hdr_upri_dec_place.addAllListener(p);
		p.Hdr_amt_dec_place.setListListener(p);
		p.Hdr_amt_dec_place.addAllListener(p);
		p.Hdr_ins_usr_id.setListListener(p);
		p.Hdr_ins_usr_id.addAllListener(p);
		p.Hdr_ins_usr_nm.setListListener(p);
		p.Hdr_ins_usr_nm.addAllListener(p);
		p.Hdr_ins_func_id.setListListener(p);
		p.Hdr_ins_func_id.addAllListener(p);
		p.Hdr_ins_func_nm.setListListener(p);
		p.Hdr_ins_func_nm.addAllListener(p);
		p.Hdr_upd_usr_id.setListListener(p);
		p.Hdr_upd_usr_id.addAllListener(p);
		p.Hdr_upd_usr_nm.setListListener(p);
		p.Hdr_upd_usr_nm.addAllListener(p);
		p.Hdr_upd_func_id.setListListener(p);
		p.Hdr_upd_func_id.addAllListener(p);
		p.Hdr_upd_func_nm.setListListener(p);
		p.Hdr_upd_func_nm.addAllListener(p);
		p.Hdr_ins_ts.setListListener(p);
		p.Hdr_ins_ts.addAllListener(p);
		p.Hdr_upd_ts.setListListener(p);
		p.Hdr_upd_ts.addAllListener(p);
		p.Hdr_upd_srv_req_no.setListListener(p);
		p.Hdr_upd_srv_req_no.addAllListener(p);
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
		p.Hdr_bill_mng_no.setListListener(p);
		p.Hdr_bill_mng_no.addAllListener(p);
	}

	/**
	 *  [List]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitList(MSBGP_BillDSrch p) {
	}

	/**
	 *  [Dtl1Info]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1Info(MSBGP_BillDSrch p) {
	}

	/**
	 *  [Dtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1(MSBGP_BillDSrch p) {
		p.Dtl1Table.addAllListener(p);
		p.columnDtl1_row_num.addAllListener(p);
		p.columnDtl1_row_num.setListListener(p);
		p.columnDtl1_check.addAllListener(p);
		p.columnDtl1_ac_ym.addAllListener(p);
		p.columnDtl1_ac_ym.setListListener(p);
		p.columnDtl1_ac_dt.addAllListener(p);
		p.columnDtl1_ac_dt.setListListener(p);
		p.columnDtl1_slip_sts_typ.addAllListener(p);
		p.columnDtl1_slip_sts_typ.setListListener(p);
		p.columnDtl1_slip_sts_typ_nm.addAllListener(p);
		p.columnDtl1_slip_sts_typ_nm.setListListener(p);
		p.columnDtl1_trd_cd.addAllListener(p);
		p.columnDtl1_trd_cd.setListListener(p);
		p.columnDtl1_trd_nm.addAllListener(p);
		p.columnDtl1_trd_nm.setListListener(p);
		p.columnDtl1_trd_ptn_typ.addAllListener(p);
		p.columnDtl1_trd_ptn_typ.setListListener(p);
		p.columnDtl1_ar_typ.addAllListener(p);
		p.columnDtl1_ar_typ.setListListener(p);
		p.columnDtl1_ar_typ_nm.addAllListener(p);
		p.columnDtl1_ar_typ_nm.setListListener(p);
		p.columnDtl1_base_sls_ac_dt.addAllListener(p);
		p.columnDtl1_base_sls_ac_dt.setListListener(p);
		p.columnDtl1_act_no.addAllListener(p);
		p.columnDtl1_act_no.setListListener(p);
		p.columnDtl1_act_rev.addAllListener(p);
		p.columnDtl1_act_rev.setListListener(p);
		p.columnDtl1_act_seq.addAllListener(p);
		p.columnDtl1_act_seq.setListListener(p);
		p.columnDtl1_act_d_no.addAllListener(p);
		p.columnDtl1_act_d_no.setListListener(p);
		p.columnDtl1_act_d_seq.addAllListener(p);
		p.columnDtl1_act_d_seq.setListListener(p);
		p.columnDtl1_dlv_dt.addAllListener(p);
		p.columnDtl1_dlv_dt.setListListener(p);
		p.columnDtl1_bill_basis_dt.addAllListener(p);
		p.columnDtl1_bill_basis_dt.setListListener(p);
		p.columnDtl1_bill_crryovr_times.addAllListener(p);
		p.columnDtl1_bill_crryovr_times.setListListener(p);
		p.columnDtl1_cst_itm_cd.addAllListener(p);
		p.columnDtl1_cst_itm_cd.setListListener(p);
		p.columnDtl1_cst_itm_nm.addAllListener(p);
		p.columnDtl1_cst_itm_nm.setListListener(p);
		p.columnDtl1_trd_unit_cd.addAllListener(p);
		p.columnDtl1_trd_unit_cd.setListListener(p);
		p.columnDtl1_trd_unit_nm.addAllListener(p);
		p.columnDtl1_trd_unit_nm.setListListener(p);
		p.columnDtl1_trd_dec_place.addAllListener(p);
		p.columnDtl1_trd_dec_place.setListListener(p);
		p.columnDtl1_inc_tax_flg.addAllListener(p);
		p.columnDtl1_interim_flg.addAllListener(p);
		p.columnDtl1_tax_cd.addAllListener(p);
		p.columnDtl1_tax_cd.setListListener(p);
		p.columnDtl1_tax_nm.addAllListener(p);
		p.columnDtl1_tax_nm.setListListener(p);
		p.columnDtl1_tax_rate.addAllListener(p);
		p.columnDtl1_tax_rate.setListListener(p);
		p.columnDtl1_cst_cd.addAllListener(p);
		p.columnDtl1_cst_cd.setListListener(p);
		p.columnDtl1_cst_nm.addAllListener(p);
		p.columnDtl1_cst_nm.setListListener(p);
		p.columnDtl1_dlv_cd.addAllListener(p);
		p.columnDtl1_dlv_cd.setListListener(p);
		p.columnDtl1_dlv_nm.addAllListener(p);
		p.columnDtl1_dlv_nm.setListListener(p);
		p.columnDtl1_dest_cd1.addAllListener(p);
		p.columnDtl1_dest_cd1.setListListener(p);
		p.columnDtl1_dest_nm1.addAllListener(p);
		p.columnDtl1_dest_nm1.setListListener(p);
		p.columnDtl1_dest_cd2.addAllListener(p);
		p.columnDtl1_dest_cd2.setListListener(p);
		p.columnDtl1_dest_nm2.addAllListener(p);
		p.columnDtl1_dest_nm2.setListListener(p);
		p.columnDtl1_dest_cd3.addAllListener(p);
		p.columnDtl1_dest_cd3.setListListener(p);
		p.columnDtl1_dest_nm3.addAllListener(p);
		p.columnDtl1_dest_nm3.setListListener(p);
		p.columnDtl1_sls_usr_cd.addAllListener(p);
		p.columnDtl1_sls_usr_cd.setListListener(p);
		p.columnDtl1_sls_usr_nm.addAllListener(p);
		p.columnDtl1_sls_usr_nm.setListListener(p);
		p.columnDtl1_sls_dpt_cd.addAllListener(p);
		p.columnDtl1_sls_dpt_cd.setListListener(p);
		p.columnDtl1_sls_dpt_nm.addAllListener(p);
		p.columnDtl1_sls_dpt_nm.setListListener(p);
		p.columnDtl1_slo_no.addAllListener(p);
		p.columnDtl1_slo_no.setListListener(p);
		p.columnDtl1_slo_d_no.addAllListener(p);
		p.columnDtl1_slo_d_no.setListListener(p);
		p.columnDtl1_cst_po_no.addAllListener(p);
		p.columnDtl1_cst_po_no.setListListener(p);
		p.columnDtl1_cst_po_d_no.addAllListener(p);
		p.columnDtl1_cst_po_d_no.setListListener(p);
		p.columnDtl1_dlv_slip_no.addAllListener(p);
		p.columnDtl1_dlv_slip_no.setListListener(p);
		p.columnDtl1_dlv_slip_d_no.addAllListener(p);
		p.columnDtl1_dlv_slip_d_no.setListListener(p);
		p.columnDtl1_ship_dlv_slip_no.addAllListener(p);
		p.columnDtl1_ship_dlv_slip_no.setListListener(p);
		p.columnDtl1_ship_dlv_slip_d_no.addAllListener(p);
		p.columnDtl1_ship_dlv_slip_d_no.setListListener(p);
		p.columnDtl1_ship_dlv_slip_multi_flg.addAllListener(p);
		p.columnDtl1_trd_d_rmrks.addAllListener(p);
		p.columnDtl1_trd_d_rmrks.setListListener(p);
		p.columnDtl1_bill_d_no.addAllListener(p);
		p.columnDtl1_bill_d_no.setListListener(p);
		p.columnDtl1_ins_usr_id.addAllListener(p);
		p.columnDtl1_ins_usr_id.setListListener(p);
		p.columnDtl1_ins_usr_nm.addAllListener(p);
		p.columnDtl1_ins_usr_nm.setListListener(p);
		p.columnDtl1_ins_func_id.addAllListener(p);
		p.columnDtl1_ins_func_id.setListListener(p);
		p.columnDtl1_ins_func_nm.addAllListener(p);
		p.columnDtl1_ins_func_nm.setListListener(p);
		p.columnDtl1_ins_ts.addAllListener(p);
		p.columnDtl1_ins_ts.setListListener(p);
		p.columnDtl1_upd_usr_id.addAllListener(p);
		p.columnDtl1_upd_usr_id.setListListener(p);
		p.columnDtl1_upd_usr_nm.addAllListener(p);
		p.columnDtl1_upd_usr_nm.setListListener(p);
		p.columnDtl1_upd_func_id.addAllListener(p);
		p.columnDtl1_upd_func_id.setListListener(p);
		p.columnDtl1_upd_func_nm.addAllListener(p);
		p.columnDtl1_upd_func_nm.setListListener(p);
		p.columnDtl1_upd_ts.addAllListener(p);
		p.columnDtl1_upd_ts.setListListener(p);
		p.columnDtl1_upd_srv_req_no.addAllListener(p);
		p.columnDtl1_upd_srv_req_no.setListListener(p);
		p.columnDtl1_upd_cntr.addAllListener(p);
		p.columnDtl1_upd_cntr.setListListener(p);
		p.columnDtl1_dec_place.addAllListener(p);
		p.columnDtl1_dec_place.setListListener(p);
		p.columnDtl1_bill_d_typ.addAllListener(p);
		p.columnDtl1_bill_d_typ.setListListener(p);
		p.columnDtl1_bill_mng_no.addAllListener(p);
		p.columnDtl1_bill_mng_no.setListListener(p);
	}

	/**
	 *  [Dtl1_Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1_Btn(MSBGP_BillDSrch p) {
	}

	/**
	 *  [Dtl2Info]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2Info(MSBGP_BillDSrch p) {
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MSBGP_BillDSrch p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_check.addAllListener(p);
		p.columnDtl2_ac_ym.addAllListener(p);
		p.columnDtl2_ac_ym.setListListener(p);
		p.columnDtl2_ac_dt.addAllListener(p);
		p.columnDtl2_ac_dt.setListListener(p);
		p.columnDtl2_slip_sts_typ.addAllListener(p);
		p.columnDtl2_slip_sts_typ.setListListener(p);
		p.columnDtl2_slip_sts_typ_nm.addAllListener(p);
		p.columnDtl2_slip_sts_typ_nm.setListListener(p);
		p.columnDtl2_trd_cd.addAllListener(p);
		p.columnDtl2_trd_cd.setListListener(p);
		p.columnDtl2_trd_nm.addAllListener(p);
		p.columnDtl2_trd_nm.setListListener(p);
		p.columnDtl2_trd_ptn_typ.addAllListener(p);
		p.columnDtl2_trd_ptn_typ.setListListener(p);
		p.columnDtl2_ar_typ.addAllListener(p);
		p.columnDtl2_ar_typ.setListListener(p);
		p.columnDtl2_ar_typ_nm.addAllListener(p);
		p.columnDtl2_ar_typ_nm.setListListener(p);
		p.columnDtl2_act_no.addAllListener(p);
		p.columnDtl2_act_no.setListListener(p);
		p.columnDtl2_act_rev.addAllListener(p);
		p.columnDtl2_act_rev.setListListener(p);
		p.columnDtl2_act_seq.addAllListener(p);
		p.columnDtl2_act_seq.setListListener(p);
		p.columnDtl2_act_d_no.addAllListener(p);
		p.columnDtl2_act_d_no.setListListener(p);
		p.columnDtl2_act_d_seq.addAllListener(p);
		p.columnDtl2_act_d_seq.setListListener(p);
		p.columnDtl2_rcv_dt.addAllListener(p);
		p.columnDtl2_rcv_dt.setListListener(p);
		p.columnDtl2_bill_basis_dt.addAllListener(p);
		p.columnDtl2_bill_basis_dt.setListListener(p);
		p.columnDtl2_bill_crryovr_times.addAllListener(p);
		p.columnDtl2_bill_crryovr_times.setListListener(p);
		p.columnDtl2_setoff_tax_cd.addAllListener(p);
		p.columnDtl2_setoff_tax_cd.setListListener(p);
		p.columnDtl2_setoff_tax_nm.addAllListener(p);
		p.columnDtl2_setoff_tax_nm.setListListener(p);
		p.columnDtl2_setoff_tax_rate.addAllListener(p);
		p.columnDtl2_setoff_tax_rate.setListListener(p);
		p.columnDtl2_bill_d_rmrks.addAllListener(p);
		p.columnDtl2_bill_d_rmrks.setListListener(p);
		p.columnDtl2_ins_usr_id.addAllListener(p);
		p.columnDtl2_ins_usr_id.setListListener(p);
		p.columnDtl2_ins_usr_nm.addAllListener(p);
		p.columnDtl2_ins_usr_nm.setListListener(p);
		p.columnDtl2_ins_func_id.addAllListener(p);
		p.columnDtl2_ins_func_id.setListListener(p);
		p.columnDtl2_ins_func_nm.addAllListener(p);
		p.columnDtl2_ins_func_nm.setListListener(p);
		p.columnDtl2_ins_ts.addAllListener(p);
		p.columnDtl2_ins_ts.setListListener(p);
		p.columnDtl2_upd_usr_id.addAllListener(p);
		p.columnDtl2_upd_usr_id.setListListener(p);
		p.columnDtl2_upd_usr_nm.addAllListener(p);
		p.columnDtl2_upd_usr_nm.setListListener(p);
		p.columnDtl2_upd_func_id.addAllListener(p);
		p.columnDtl2_upd_func_id.setListListener(p);
		p.columnDtl2_upd_func_nm.addAllListener(p);
		p.columnDtl2_upd_func_nm.setListListener(p);
		p.columnDtl2_upd_ts.addAllListener(p);
		p.columnDtl2_upd_ts.setListListener(p);
		p.columnDtl2_upd_srv_req_no.addAllListener(p);
		p.columnDtl2_upd_srv_req_no.setListListener(p);
		p.columnDtl2_upd_cntr.addAllListener(p);
		p.columnDtl2_upd_cntr.setListListener(p);
		p.columnDtl2_dec_place.addAllListener(p);
		p.columnDtl2_dec_place.setListListener(p);
		p.columnDtl2_bill_d_no.addAllListener(p);
		p.columnDtl2_bill_d_no.setListListener(p);
		p.columnDtl2_bill_d_typ.addAllListener(p);
		p.columnDtl2_bill_d_typ.setListListener(p);
		p.columnDtl2_bill_mng_no.addAllListener(p);
		p.columnDtl2_bill_mng_no.setListListener(p);
	}

	/**
	 *  [Dtl3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl3(MSBGP_BillDSrch p) {
		p.Dtl3Table.addAllListener(p);
		p.columnDtl3_ac_ym.addAllListener(p);
		p.columnDtl3_ac_ym.setListListener(p);
		p.columnDtl3_ac_dt.addAllListener(p);
		p.columnDtl3_ac_dt.setListListener(p);
		p.columnDtl3_slip_sts_typ.addAllListener(p);
		p.columnDtl3_slip_sts_typ.setListListener(p);
		p.columnDtl3_slip_sts_typ_nm.addAllListener(p);
		p.columnDtl3_slip_sts_typ_nm.setListListener(p);
		p.columnDtl3_trd_cd.addAllListener(p);
		p.columnDtl3_trd_cd.setListListener(p);
		p.columnDtl3_trd_nm.addAllListener(p);
		p.columnDtl3_trd_nm.setListListener(p);
		p.columnDtl3_trd_ptn_typ.addAllListener(p);
		p.columnDtl3_trd_ptn_typ.setListListener(p);
		p.columnDtl3_rcv_act_no.addAllListener(p);
		p.columnDtl3_rcv_act_no.setListListener(p);
		p.columnDtl3_rcv_act_seq.addAllListener(p);
		p.columnDtl3_rcv_act_seq.setListListener(p);
		p.columnDtl3_rcv_act_rev.addAllListener(p);
		p.columnDtl3_rcv_act_rev.setListListener(p);
		p.columnDtl3_rcv_act_d_no.addAllListener(p);
		p.columnDtl3_rcv_act_d_no.setListListener(p);
		p.columnDtl3_rcv_act_d_seq.addAllListener(p);
		p.columnDtl3_rcv_act_d_seq.setListListener(p);
		p.columnDtl3_rcv_dt.addAllListener(p);
		p.columnDtl3_rcv_dt.setListListener(p);
		p.columnDtl3_setoff_tax_cd.addAllListener(p);
		p.columnDtl3_setoff_tax_cd.setListListener(p);
		p.columnDtl3_setoff_tax_nm.addAllListener(p);
		p.columnDtl3_setoff_tax_nm.setListListener(p);
		p.columnDtl3_setoff_tax_rate.addAllListener(p);
		p.columnDtl3_setoff_tax_rate.setListListener(p);
		p.columnDtl3_ins_usr_id.addAllListener(p);
		p.columnDtl3_ins_usr_id.setListListener(p);
		p.columnDtl3_ins_usr_nm.addAllListener(p);
		p.columnDtl3_ins_usr_nm.setListListener(p);
		p.columnDtl3_ins_func_id.addAllListener(p);
		p.columnDtl3_ins_func_id.setListListener(p);
		p.columnDtl3_ins_func_nm.addAllListener(p);
		p.columnDtl3_ins_func_nm.setListListener(p);
		p.columnDtl3_ins_ts.addAllListener(p);
		p.columnDtl3_ins_ts.setListListener(p);
		p.columnDtl3_upd_usr_id.addAllListener(p);
		p.columnDtl3_upd_usr_id.setListListener(p);
		p.columnDtl3_upd_usr_nm.addAllListener(p);
		p.columnDtl3_upd_usr_nm.setListListener(p);
		p.columnDtl3_upd_func_id.addAllListener(p);
		p.columnDtl3_upd_func_id.setListListener(p);
		p.columnDtl3_upd_func_nm.addAllListener(p);
		p.columnDtl3_upd_func_nm.setListListener(p);
		p.columnDtl3_upd_ts.addAllListener(p);
		p.columnDtl3_upd_ts.setListListener(p);
		p.columnDtl3_upd_srv_req_no.addAllListener(p);
		p.columnDtl3_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_BillDSrch p) {
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBGP_BillDSrch p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBGP_BillDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_BillDSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bill_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sign_rivrs_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBGP_BillDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBGP_BillDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBGP_BillDSrch p){
		p.Hdr_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_multi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pre_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_foreign_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_bill_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_lastBillAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcvAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_bfwAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_slsAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_retAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscntAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_setoffAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_taxAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_swToAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_billAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_bill_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_List(MSBGP_BillDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1Info]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1Info(MSBGP_BillDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1(MSBGP_BillDSrch p){
		p.columnDtl1_row_num.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_base_sls_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_bill_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_inc_tax_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_trdCurUpri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdCurAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdIncCtax_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_trdCurTax_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl1_trdCurDscnt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_multi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_wrkno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl1_sls_wrkno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_bill_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bill_d_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bill_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl1_Sub]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1__Sub(MSBGP_BillDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1_Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1__Btn(MSBGP_BillDSrch p){
		p.Dtl1_Btn_paging_PPanel.putStatus(SRCH, mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl2Info]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2Info(MSBGP_BillDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2(MSBGP_BillDSrch p){
		p.columnDtl2_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_bill_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl2_trdCur_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffTaxAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl2_setoff_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl2_wrkno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl2_bill_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_bill_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl3(MSBGP_BillDSrch p){
		p.columnDtl3_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl3_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_rev.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl3_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl3_trdCur_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffTaxAmt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl3_setoff_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBGP_BillDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_BillDSrch p){
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBGP_BillDSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_BillDSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_BillDSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bill_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sign_rivrs_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBGP_BillDSrch p){

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBGP_BillDSrch p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBGP_BillDSrch p){
		p.Hdr_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_multi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pre_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_foreign_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_bill_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_lastBillAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcvAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_bfwAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_slsAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_retAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscntAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_setoffAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_taxAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_swToAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_billAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_bill_mng_no.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitREF_List(MSBGP_BillDSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl1Info]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1Info(MSBGP_BillDSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1(MSBGP_BillDSrch p){
		p.columnDtl1_row_num.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_slip_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_slip_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_ar_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ar_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_base_sls_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_dlv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_bill_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_bill_crryovr_times.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_inc_tax_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_interim_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_trdCurUpri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdCurAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdIncCtax_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_trdCurTax_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl1_trdCurDscnt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_multi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_wrkno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl1_sls_wrkno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_bill_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bill_d_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bill_mng_no.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl1_Sub]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1__Sub(MSBGP_BillDSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl1_Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1__Btn(MSBGP_BillDSrch p){
		p.Dtl1_Btn_paging_PPanel.putStatus(REF, mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.ENABLE);

	}

	/**
	 * [REF]ステータスの[Dtl2Info]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2Info(MSBGP_BillDSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MSBGP_BillDSrch p){
		p.columnDtl2_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_slip_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_slip_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_ar_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ar_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_bill_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_bill_crryovr_times.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_trdCur_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffTaxAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl2_setoff_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_wrkno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl2_bill_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bill_mng_no.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl3(MSBGP_BillDSrch p){
		p.columnDtl3_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_slip_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl3_slip_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_rev.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl3_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl3_trdCur_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffTaxAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl3_setoff_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBGP_BillDSrch p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBGP_BillDSrch p){
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBGP_BillDSrch p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBGP_BillDSrch p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBGP_BillDSrch p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bill_mng_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sign_rivrs_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBGP_BillDSrch p){

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBGP_BillDSrch p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBGP_BillDSrch p){
		p.Hdr_bill_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_multi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pre_bill_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_foreign_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_bill_xrate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_lastBillAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcvAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_bfwAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_slsAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_retAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscntAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_setoffAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_taxAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_swToAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_billAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_bill_mng_no.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitUPD_List(MSBGP_BillDSrch p){

	}

	/**
	 * [UPD]ステータスの[Dtl1Info]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1Info(MSBGP_BillDSrch p){

	}

	/**
	 * [UPD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1(MSBGP_BillDSrch p){
		p.columnDtl1_row_num.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_slip_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_slip_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_ar_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ar_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_base_sls_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_dlv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_bill_basis_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_bill_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl1_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl1_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_trd_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_inc_tax_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_interim_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl1_trdCurUpri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdCurAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdIncCtax_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_tax_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl1_trdCurTax_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl1_trdCurDscnt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dlv_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_multi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl1_wrkno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl1_sls_wrkno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_bill_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bill_d_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bill_mng_no.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl1_Sub]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1__Sub(MSBGP_BillDSrch p){

	}

	/**
	 * [UPD]ステータスの[Dtl1_Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1__Btn(MSBGP_BillDSrch p){
		p.Dtl1_Btn_paging_PPanel.putStatus(UPD, mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl2Info]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2Info(MSBGP_BillDSrch p){

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MSBGP_BillDSrch p){
		p.columnDtl2_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_slip_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_slip_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_ar_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ar_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_rcv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_bill_basis_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_bill_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl2_trdCur_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffTaxAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl2_setoff_tax_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_wrkno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl2_bill_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_bill_mng_no.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl3(MSBGP_BillDSrch p){
		p.columnDtl3_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_slip_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl3_slip_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_rev.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl3_rcv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl3_trdCur_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffTaxAmt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl3_setoff_tax_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBGP_BillDSrch p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBGP_BillDSrch p){
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBGP_BillDSrch p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_bill_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sign_rivrs_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBGP_BillDSrch p){
		p.Hdr_bill_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_multi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pre_bill_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_foreign_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_bill_xrate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_lastBillAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcvAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_bfwAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_slsAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_retAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscntAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_setoffAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_taxAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_swToAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_billAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_bill_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_List(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl1Info]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl1Info(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl1(MSBGP_BillDSrch p){
		p.columnDtl1_row_num.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_slip_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_slip_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_ar_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ar_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_base_sls_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_dlv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_bill_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_bill_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl1_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_trd_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_inc_tax_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_interim_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl1_trdCurUpri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdCurAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdIncCtax_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl1_trdCurTax_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl1_trdCurDscnt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dlv_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dlv_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_multi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl1_wrkno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl1_sls_wrkno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_bill_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bill_d_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bill_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl1_Sub]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl1__Sub(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl1_Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl1__Btn(MSBGP_BillDSrch p){
		p.Dtl1_Btn_paging_PPanel.putStatus(FIX_U, mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl2Info]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl2Info(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl2(MSBGP_BillDSrch p){
		p.columnDtl2_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_slip_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_slip_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_ar_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ar_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_rcv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_bill_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_bill_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl2_trdCur_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffTaxAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl2_setoff_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl2_wrkno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl2_bill_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_bill_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl3(MSBGP_BillDSrch p){
		p.columnDtl3_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_slip_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl3_slip_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_rev.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl3_rcv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl3_trdCur_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffTaxAmt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl3_setoff_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBGP_BillDSrch p){
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBGP_BillDSrch p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBGP_BillDSrch p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBGP_BillDSrch p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_bill_mng_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sign_rivrs_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBGP_BillDSrch p){

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBGP_BillDSrch p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBGP_BillDSrch p){
		p.Hdr_bill_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_multi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pre_bill_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_foreign_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_bill_xrate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_lastBillAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcvAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_bfwAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_slsAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_retAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscntAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_setoffAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_taxAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_swToAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_billAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_bill_mng_no.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitDEL_List(MSBGP_BillDSrch p){

	}

	/**
	 * [DEL]ステータスの[Dtl1Info]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1Info(MSBGP_BillDSrch p){

	}

	/**
	 * [DEL]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1(MSBGP_BillDSrch p){
		p.columnDtl1_row_num.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_slip_sts_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_slip_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_ar_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ar_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_sls_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_dlv_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_bill_crryovr_times.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_inc_tax_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_interim_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_trdCurUpri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdCurAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdIncCtax_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_trdCurTax_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl1_trdCurDscnt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_multi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_wrkno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl1_sls_wrkno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_bill_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bill_d_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bill_mng_no.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl1_Sub]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1__Sub(MSBGP_BillDSrch p){

	}

	/**
	 * [DEL]ステータスの[Dtl1_Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1__Btn(MSBGP_BillDSrch p){
		p.Dtl1_Btn_paging_PPanel.putStatus(DEL, mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl2Info]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2Info(MSBGP_BillDSrch p){

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MSBGP_BillDSrch p){
		p.columnDtl2_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_slip_sts_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_slip_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_ar_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ar_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_rcv_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_bill_crryovr_times.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_trdCur_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffTaxAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl2_setoff_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_wrkno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl2_bill_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bill_mng_no.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl3(MSBGP_BillDSrch p){
		p.columnDtl3_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_slip_sts_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl3_slip_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_rev.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl3_rcv_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl3_trdCur_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffTaxAmt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl3_setoff_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBGP_BillDSrch p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBGP_BillDSrch p){
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBGP_BillDSrch p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_bill_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_bill_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_sign_rivrs_flg.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBGP_BillDSrch p){
		p.Hdr_bill_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_multi_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pre_bill_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_foreign_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_bill_xrate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_lastBillAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcvAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_bfwAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_slsAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_retAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscntAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_setoffAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_taxAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_swToAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_billAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_bill_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_List(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl1Info]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1Info(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1(MSBGP_BillDSrch p){
		p.columnDtl1_row_num.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_slip_sts_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_slip_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_ar_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ar_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_base_sls_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_act_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_act_d_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_dlv_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_bill_basis_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_bill_crryovr_times.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_sno_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_inc_tax_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_interim_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_trdCurUpri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdCurAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trdIncCtax_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_tax_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_tax_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_tax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_trdCurTax_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl1_trdCurDscnt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_cst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_cst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dlv_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dlv_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dest_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dest_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sls_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sls_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_slo_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_cst_po_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_dlv_slip_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ship_dlv_slip_multi_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_wrkno_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.Dtl1_sls_wrkno_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_bill_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bill_d_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bill_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl1_Sub]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1__Sub(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl1_Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1__Btn(MSBGP_BillDSrch p){
		p.Dtl1_Btn_paging_PPanel.putStatus(FIX_D, mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl2Info]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2Info(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2(MSBGP_BillDSrch p){
		p.columnDtl2_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_slip_sts_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_slip_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_ar_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ar_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_act_d_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_rcv_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_bill_basis_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_bill_crryovr_times.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_trdCur_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_setoffTaxAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl2_setoff_tax_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_setoff_tax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_wrkno_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl2_bill_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bill_d_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bill_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl3(MSBGP_BillDSrch p){
		p.columnDtl3_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_slip_sts_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl3_slip_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_rev.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl3_rcv_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_d_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl3_rcv_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl3_trdCur_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl3_setoffTaxAmt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl3_setoff_tax_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_setoff_tax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl3_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Rslt(MSBGP_BillDSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBGP_BillDSrch p){
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBGP_BillDSrch p){

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
		MSBGP_BillDSrch_MC.setTableConfigDtl1((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.setTableConfigDtl2((MSBGP_BillDSrch)this);
		MSBGP_BillDSrch_MC.setTableConfigDtl3((MSBGP_BillDSrch)this);
	}

	/**
	 * [Dtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl1(MSBGP_BillDSrch p) {
		p.columnDtl1_row_num.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.row_num_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_row_num);
		p.columnDtl1_check.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.check_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_check);
		p.columnDtl1_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ac_ym_META);
		p.columnDtl1_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ac_ym);
		p.columnDtl1_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ac_dt_META);
		p.columnDtl1_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ac_dt);
		p.columnDtl1_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.slip_sts_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_slip_sts_typ);
		p.columnDtl1_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.slip_sts_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_slip_sts_typ_nm);
		p.columnDtl1_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.trd_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_cd);
		p.columnDtl1_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.trd_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_nm);
		p.columnDtl1_trd_ptn_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.trd_ptn_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_ptn_typ);
		p.columnDtl1_ar_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ar_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ar_typ);
		p.columnDtl1_ar_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ar_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ar_typ_nm);
		p.columnDtl1_base_sls_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.base_sls_ac_dt_META);
		p.columnDtl1_base_sls_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_sls_ac_dt);
		p.columnDtl1_act_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.act_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_no);
		p.columnDtl1_act_rev.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.act_rev_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_rev);
		p.columnDtl1_act_seq.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.act_seq_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_seq);
		p.columnDtl1_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.act_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_d_no);
		p.columnDtl1_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.act_d_seq_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_d_seq);
		p.columnDtl1_dlv_dt.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dlv_dt_META);
		p.columnDtl1_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dlv_dt);
		p.columnDtl1_bill_basis_dt.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.bill_basis_dt_META);
		p.columnDtl1_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bill_basis_dt);
		p.columnDtl1_bill_crryovr_times.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.bill_crryovr_times_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bill_crryovr_times);
		p.Dtl1Table.addTable(p.Dtl1_itm_p_PPanel.ItmTable);
		p.columnDtl1_cst_itm_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.cst_itm_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cst_itm_cd);
		p.columnDtl1_cst_itm_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.cst_itm_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cst_itm_nm);
		p.Dtl1Table.addTable(p.Dtl1_sno_p_PPanel.SnoTable);
		p.columnDtl1_trd_unit_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.trd_unit_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_cd);
		p.columnDtl1_trd_unit_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.trd_unit_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_nm);
		p.columnDtl1_trd_dec_place.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.trd_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_dec_place);
		p.Dtl1Table.addTable(p.Dtl1_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl1_inc_tax_flg.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.inc_tax_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_inc_tax_flg);
		p.columnDtl1_interim_flg.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.interim_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_interim_flg);
		p.Dtl1Table.addTable(p.Dtl1_trdCurUpri_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_trdCurAmt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_trdIncCtax_p_PPanel.AmtTable);
		p.columnDtl1_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.tax_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_tax_cd);
		p.columnDtl1_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.tax_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_tax_nm);
		p.columnDtl1_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.tax_rate_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_tax_rate);
		p.Dtl1Table.addTable(p.Dtl1_trdCurTax_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_xrate_p_PPanel.XrateTable);
		p.Dtl1Table.addTable(p.Dtl1_trdCurDscnt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_amt_p_PPanel.AmtTable);
		p.Dtl1_base_cur_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_tax_amt_p_PPanel.AmtTable);
		p.Dtl1_base_cur_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnDtl1_cst_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.cst_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cst_cd);
		p.columnDtl1_cst_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.cst_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cst_nm);
		p.columnDtl1_dlv_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dlv_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dlv_cd);
		p.columnDtl1_dlv_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dlv_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dlv_nm);
		p.columnDtl1_dest_cd1.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dest_cd1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dest_cd1);
		p.columnDtl1_dest_nm1.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dest_nm1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dest_nm1);
		p.columnDtl1_dest_cd2.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dest_cd2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dest_cd2);
		p.columnDtl1_dest_nm2.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dest_nm2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dest_nm2);
		p.columnDtl1_dest_cd3.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dest_cd3_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dest_cd3);
		p.columnDtl1_dest_nm3.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dest_nm3_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dest_nm3);
		p.columnDtl1_sls_usr_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.sls_usr_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sls_usr_cd);
		p.columnDtl1_sls_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.sls_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sls_usr_nm);
		p.columnDtl1_sls_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.sls_dpt_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sls_dpt_cd);
		p.columnDtl1_sls_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.sls_dpt_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sls_dpt_nm);
		p.columnDtl1_slo_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.slo_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_slo_no);
		p.columnDtl1_slo_d_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.slo_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_slo_d_no);
		p.columnDtl1_cst_po_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.cst_po_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cst_po_no);
		p.columnDtl1_cst_po_d_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.cst_po_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cst_po_d_no);
		p.columnDtl1_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dlv_slip_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dlv_slip_no);
		p.columnDtl1_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dlv_slip_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dlv_slip_d_no);
		p.columnDtl1_ship_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ship_dlv_slip_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ship_dlv_slip_no);
		p.columnDtl1_ship_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ship_dlv_slip_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ship_dlv_slip_d_no);
		p.columnDtl1_ship_dlv_slip_multi_flg.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ship_dlv_slip_multi_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ship_dlv_slip_multi_flg);
		p.Dtl1Table.addTable(p.Dtl1_wrkno_p_PPanel.WrkNoTable);
		p.Dtl1Table.addTable(p.Dtl1_sls_wrkno_p_PPanel.WrkNoTable);
		p.columnDtl1_trd_d_rmrks.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.trd_d_rmrks_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_d_rmrks);
		p.columnDtl1_bill_d_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.bill_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bill_d_no);
		p.columnDtl1_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ins_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_id);
		p.columnDtl1_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ins_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_nm);
		p.columnDtl1_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ins_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_id);
		p.columnDtl1_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ins_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_nm);
		p.columnDtl1_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.ins_ts_META);
		p.columnDtl1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_ts);
		p.columnDtl1_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.upd_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_id);
		p.columnDtl1_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.upd_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_nm);
		p.columnDtl1_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.upd_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_id);
		p.columnDtl1_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.upd_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_nm);
		p.columnDtl1_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.upd_ts_META);
		p.columnDtl1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_ts);
		p.columnDtl1_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.upd_srv_req_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_srv_req_no);
		p.columnDtl1_upd_cntr.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.upd_cntr_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_cntr);
		p.columnDtl1_dec_place.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dec_place);
		p.columnDtl1_bill_d_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.bill_d_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bill_d_typ);
		p.columnDtl1_bill_mng_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl1R.bill_mng_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bill_mng_no);
		// スクロール固定カラムの指定
		p.Dtl1Table.setUnscrollColumn(p.columnDtl1_check);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MSBGP_BillDSrch p) {
		p.columnDtl2_check.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.check_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_check);
		p.columnDtl2_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.ac_ym_META);
		p.columnDtl2_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ac_ym);
		p.columnDtl2_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.ac_dt_META);
		p.columnDtl2_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ac_dt);
		p.columnDtl2_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.slip_sts_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_slip_sts_typ);
		p.columnDtl2_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.slip_sts_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_slip_sts_typ_nm);
		p.columnDtl2_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.trd_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_cd);
		p.columnDtl2_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.trd_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_nm);
		p.columnDtl2_trd_ptn_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.trd_ptn_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_ptn_typ);
		p.columnDtl2_ar_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.ar_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ar_typ);
		p.columnDtl2_ar_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.ar_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ar_typ_nm);
		p.columnDtl2_act_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.act_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_no);
		p.columnDtl2_act_rev.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.act_rev_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_rev);
		p.columnDtl2_act_seq.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.act_seq_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_seq);
		p.columnDtl2_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.act_d_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_d_no);
		p.columnDtl2_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.act_d_seq_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_d_seq);
		p.columnDtl2_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.rcv_dt_META);
		p.columnDtl2_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcv_dt);
		p.columnDtl2_bill_basis_dt.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.bill_basis_dt_META);
		p.columnDtl2_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bill_basis_dt);
		p.columnDtl2_bill_crryovr_times.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.bill_crryovr_times_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bill_crryovr_times);
		p.Dtl2Table.addTable(p.Dtl2_trdCur_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_setoffAmt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_setoffTaxAmt_p_PPanel.AmtTable);
		p.columnDtl2_setoff_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.setoff_tax_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_setoff_tax_cd);
		p.columnDtl2_setoff_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.setoff_tax_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_setoff_tax_nm);
		p.columnDtl2_setoff_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.setoff_tax_rate_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_setoff_tax_rate);
		p.Dtl2Table.addTable(p.Dtl2_wrkno_p_PPanel.WrkNoTable);
		p.columnDtl2_bill_d_rmrks.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.bill_d_rmrks_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bill_d_rmrks);
		p.columnDtl2_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.ins_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_id);
		p.columnDtl2_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.ins_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_nm);
		p.columnDtl2_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.ins_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_id);
		p.columnDtl2_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.ins_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_nm);
		p.columnDtl2_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.ins_ts_META);
		p.columnDtl2_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_ts);
		p.columnDtl2_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.upd_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_id);
		p.columnDtl2_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.upd_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_nm);
		p.columnDtl2_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.upd_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_id);
		p.columnDtl2_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.upd_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_nm);
		p.columnDtl2_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.upd_ts_META);
		p.columnDtl2_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_ts);
		p.columnDtl2_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.upd_srv_req_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_srv_req_no);
		p.columnDtl2_upd_cntr.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.upd_cntr_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_cntr);
		p.columnDtl2_dec_place.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_dec_place);
		p.columnDtl2_bill_d_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.bill_d_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bill_d_no);
		p.columnDtl2_bill_d_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.bill_d_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bill_d_typ);
		p.columnDtl2_bill_mng_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl2R.bill_mng_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bill_mng_no);
		// スクロール固定カラムの指定
		p.Dtl2Table.setUnscrollColumn(p.columnDtl2_check);
	}

	/**
	 * [Dtl3]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl3(MSBGP_BillDSrch p) {
		p.columnDtl3_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.ac_ym_META);
		p.columnDtl3_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ac_ym);
		p.columnDtl3_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.ac_dt_META);
		p.columnDtl3_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ac_dt);
		p.columnDtl3_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.slip_sts_typ_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_slip_sts_typ);
		p.columnDtl3_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.slip_sts_typ_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_slip_sts_typ_nm);
		p.columnDtl3_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.trd_cd_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_trd_cd);
		p.columnDtl3_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.trd_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_trd_nm);
		p.columnDtl3_trd_ptn_typ.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.trd_ptn_typ_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_trd_ptn_typ);
		p.columnDtl3_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.rcv_act_no_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_rcv_act_no);
		p.columnDtl3_rcv_act_seq.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.rcv_act_seq_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_rcv_act_seq);
		p.columnDtl3_rcv_act_rev.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.rcv_act_rev_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_rcv_act_rev);
		p.columnDtl3_rcv_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.rcv_act_d_no_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_rcv_act_d_no);
		p.columnDtl3_rcv_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.rcv_act_d_seq_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_rcv_act_d_seq);
		p.columnDtl3_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.rcv_dt_META);
		p.columnDtl3_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_rcv_dt);
		p.Dtl3Table.addTable(p.Dtl3_trdCur_p_PPanel.AmtTable);
		p.Dtl3Table.addTable(p.Dtl3_setoffAmt_p_PPanel.AmtTable);
		p.Dtl3Table.addTable(p.Dtl3_setoffTaxAmt_p_PPanel.AmtTable);
		p.columnDtl3_setoff_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.setoff_tax_cd_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_setoff_tax_cd);
		p.columnDtl3_setoff_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.setoff_tax_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_setoff_tax_nm);
		p.columnDtl3_setoff_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.setoff_tax_rate_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_setoff_tax_rate);
		p.columnDtl3_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.ins_usr_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_usr_id);
		p.columnDtl3_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.ins_usr_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_usr_nm);
		p.columnDtl3_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.ins_func_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_func_id);
		p.columnDtl3_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.ins_func_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_func_nm);
		p.columnDtl3_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.ins_ts_META);
		p.columnDtl3_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_ts);
		p.columnDtl3_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.upd_usr_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_usr_id);
		p.columnDtl3_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.upd_usr_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_usr_nm);
		p.columnDtl3_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.upd_func_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_func_id);
		p.columnDtl3_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.upd_func_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_func_nm);
		p.columnDtl3_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.upd_ts_META);
		p.columnDtl3_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_ts);
		p.columnDtl3_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0040.Dtl3R.upd_srv_req_no_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_base_cur_cd.getListConfig().setPutter(getHdr_base_cur_cd_ListPutter());
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
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
	}

	/**
	 * [Hdr_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_base_cur_cd) return getHdr_base_cur_cd(row, info);
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
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

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
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == Dtl1Table) return doDtl1_VC(info);
		if (vc == Dtl2Table) return doDtl2_VC(info);
		if (vc == Dtl3Table) return doDtl3_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_bill_mng_no) return doCnd_bill_mng_no_VC(info);
		if (vc == Cnd_bill_no) return doCnd_bill_no_VC(info);
		if (vc == Cnd_sign_rivrs_flg) return doCnd_sign_rivrs_flg_VC(info);
		if (vc == Hdr_bill_no) return doHdr_bill_no_VC(info);
		if (vc == Hdr_bill_rev) return doHdr_bill_rev_VC(info);
		if (vc == Hdr_bill_cl_ym) return doHdr_bill_cl_ym_VC(info);
		if (vc == Hdr_bill_cl_day) return doHdr_bill_cl_day_VC(info);
		if (vc == Hdr_bill_dt) return doHdr_bill_dt_VC(info);
		if (vc == Hdr_rcv_schd_dt) return doHdr_rcv_schd_dt_VC(info);
		if (vc == Hdr_multi_flg) return doHdr_multi_flg_VC(info);
		if (vc == Hdr_iv_no) return doHdr_iv_no_VC(info);
		if (vc == Hdr_pre_bill_no) return doHdr_pre_bill_no_VC(info);
		if (vc == Hdr_prnt_flg) return doHdr_prnt_flg_VC(info);
		if (vc == Hdr_bill_dpt_cd) return doHdr_bill_dpt_cd_VC(info);
		if (vc == Hdr_bill_dpt_nm) return doHdr_bill_dpt_nm_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_bcst_cd) return doHdr_bcst_cd_VC(info);
		if (vc == Hdr_bcst_nm) return doHdr_bcst_nm_VC(info);
		if (vc == Hdr_foreign_flg) return doHdr_foreign_flg_VC(info);
		if (vc == Hdr_edi_flg) return doHdr_edi_flg_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_base_cur_amt_dec_place) return doHdr_base_cur_amt_dec_place_VC(info);
		if (vc == Hdr_base_cur_upri_dec_place) return doHdr_base_cur_upri_dec_place_VC(info);
		if (vc == Hdr_bill_xrate) return doHdr_bill_xrate_VC(info);
		if (vc == Hdr_upri_dec_place) return doHdr_upri_dec_place_VC(info);
		if (vc == Hdr_amt_dec_place) return doHdr_amt_dec_place_VC(info);
		if (vc == Hdr_ins_usr_id) return doHdr_ins_usr_id_VC(info);
		if (vc == Hdr_ins_usr_nm) return doHdr_ins_usr_nm_VC(info);
		if (vc == Hdr_ins_func_id) return doHdr_ins_func_id_VC(info);
		if (vc == Hdr_ins_func_nm) return doHdr_ins_func_nm_VC(info);
		if (vc == Hdr_upd_usr_id) return doHdr_upd_usr_id_VC(info);
		if (vc == Hdr_upd_usr_nm) return doHdr_upd_usr_nm_VC(info);
		if (vc == Hdr_upd_func_id) return doHdr_upd_func_id_VC(info);
		if (vc == Hdr_upd_func_nm) return doHdr_upd_func_nm_VC(info);
		if (vc == Hdr_ins_ts) return doHdr_ins_ts_VC(info);
		if (vc == Hdr_upd_ts) return doHdr_upd_ts_VC(info);
		if (vc == Hdr_upd_srv_req_no) return doHdr_upd_srv_req_no_VC(info);
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
		if (vc == Hdr_bill_mng_no) return doHdr_bill_mng_no_VC(info);
		if (vc == columnDtl1_row_num) return doDtl1_row_num_VC(info);
		if (vc == columnDtl1_check) return doDtl1_check_VC(info);
		if (vc == columnDtl1_ac_ym) return doDtl1_ac_ym_VC(info);
		if (vc == columnDtl1_ac_dt) return doDtl1_ac_dt_VC(info);
		if (vc == columnDtl1_slip_sts_typ) return doDtl1_slip_sts_typ_VC(info);
		if (vc == columnDtl1_slip_sts_typ_nm) return doDtl1_slip_sts_typ_nm_VC(info);
		if (vc == columnDtl1_trd_cd) return doDtl1_trd_cd_VC(info);
		if (vc == columnDtl1_trd_nm) return doDtl1_trd_nm_VC(info);
		if (vc == columnDtl1_trd_ptn_typ) return doDtl1_trd_ptn_typ_VC(info);
		if (vc == columnDtl1_ar_typ) return doDtl1_ar_typ_VC(info);
		if (vc == columnDtl1_ar_typ_nm) return doDtl1_ar_typ_nm_VC(info);
		if (vc == columnDtl1_base_sls_ac_dt) return doDtl1_base_sls_ac_dt_VC(info);
		if (vc == columnDtl1_act_no) return doDtl1_act_no_VC(info);
		if (vc == columnDtl1_act_rev) return doDtl1_act_rev_VC(info);
		if (vc == columnDtl1_act_seq) return doDtl1_act_seq_VC(info);
		if (vc == columnDtl1_act_d_no) return doDtl1_act_d_no_VC(info);
		if (vc == columnDtl1_act_d_seq) return doDtl1_act_d_seq_VC(info);
		if (vc == columnDtl1_dlv_dt) return doDtl1_dlv_dt_VC(info);
		if (vc == columnDtl1_bill_basis_dt) return doDtl1_bill_basis_dt_VC(info);
		if (vc == columnDtl1_bill_crryovr_times) return doDtl1_bill_crryovr_times_VC(info);
		if (vc == columnDtl1_cst_itm_cd) return doDtl1_cst_itm_cd_VC(info);
		if (vc == columnDtl1_cst_itm_nm) return doDtl1_cst_itm_nm_VC(info);
		if (vc == columnDtl1_trd_unit_cd) return doDtl1_trd_unit_cd_VC(info);
		if (vc == columnDtl1_trd_unit_nm) return doDtl1_trd_unit_nm_VC(info);
		if (vc == columnDtl1_trd_dec_place) return doDtl1_trd_dec_place_VC(info);
		if (vc == columnDtl1_inc_tax_flg) return doDtl1_inc_tax_flg_VC(info);
		if (vc == columnDtl1_interim_flg) return doDtl1_interim_flg_VC(info);
		if (vc == columnDtl1_tax_cd) return doDtl1_tax_cd_VC(info);
		if (vc == columnDtl1_tax_nm) return doDtl1_tax_nm_VC(info);
		if (vc == columnDtl1_tax_rate) return doDtl1_tax_rate_VC(info);
		if (vc == columnDtl1_cst_cd) return doDtl1_cst_cd_VC(info);
		if (vc == columnDtl1_cst_nm) return doDtl1_cst_nm_VC(info);
		if (vc == columnDtl1_dlv_cd) return doDtl1_dlv_cd_VC(info);
		if (vc == columnDtl1_dlv_nm) return doDtl1_dlv_nm_VC(info);
		if (vc == columnDtl1_dest_cd1) return doDtl1_dest_cd1_VC(info);
		if (vc == columnDtl1_dest_nm1) return doDtl1_dest_nm1_VC(info);
		if (vc == columnDtl1_dest_cd2) return doDtl1_dest_cd2_VC(info);
		if (vc == columnDtl1_dest_nm2) return doDtl1_dest_nm2_VC(info);
		if (vc == columnDtl1_dest_cd3) return doDtl1_dest_cd3_VC(info);
		if (vc == columnDtl1_dest_nm3) return doDtl1_dest_nm3_VC(info);
		if (vc == columnDtl1_sls_usr_cd) return doDtl1_sls_usr_cd_VC(info);
		if (vc == columnDtl1_sls_usr_nm) return doDtl1_sls_usr_nm_VC(info);
		if (vc == columnDtl1_sls_dpt_cd) return doDtl1_sls_dpt_cd_VC(info);
		if (vc == columnDtl1_sls_dpt_nm) return doDtl1_sls_dpt_nm_VC(info);
		if (vc == columnDtl1_slo_no) return doDtl1_slo_no_VC(info);
		if (vc == columnDtl1_slo_d_no) return doDtl1_slo_d_no_VC(info);
		if (vc == columnDtl1_cst_po_no) return doDtl1_cst_po_no_VC(info);
		if (vc == columnDtl1_cst_po_d_no) return doDtl1_cst_po_d_no_VC(info);
		if (vc == columnDtl1_dlv_slip_no) return doDtl1_dlv_slip_no_VC(info);
		if (vc == columnDtl1_dlv_slip_d_no) return doDtl1_dlv_slip_d_no_VC(info);
		if (vc == columnDtl1_ship_dlv_slip_no) return doDtl1_ship_dlv_slip_no_VC(info);
		if (vc == columnDtl1_ship_dlv_slip_d_no) return doDtl1_ship_dlv_slip_d_no_VC(info);
		if (vc == columnDtl1_ship_dlv_slip_multi_flg) return doDtl1_ship_dlv_slip_multi_flg_VC(info);
		if (vc == columnDtl1_trd_d_rmrks) return doDtl1_trd_d_rmrks_VC(info);
		if (vc == columnDtl1_bill_d_no) return doDtl1_bill_d_no_VC(info);
		if (vc == columnDtl1_ins_usr_id) return doDtl1_ins_usr_id_VC(info);
		if (vc == columnDtl1_ins_usr_nm) return doDtl1_ins_usr_nm_VC(info);
		if (vc == columnDtl1_ins_func_id) return doDtl1_ins_func_id_VC(info);
		if (vc == columnDtl1_ins_func_nm) return doDtl1_ins_func_nm_VC(info);
		if (vc == columnDtl1_ins_ts) return doDtl1_ins_ts_VC(info);
		if (vc == columnDtl1_upd_usr_id) return doDtl1_upd_usr_id_VC(info);
		if (vc == columnDtl1_upd_usr_nm) return doDtl1_upd_usr_nm_VC(info);
		if (vc == columnDtl1_upd_func_id) return doDtl1_upd_func_id_VC(info);
		if (vc == columnDtl1_upd_func_nm) return doDtl1_upd_func_nm_VC(info);
		if (vc == columnDtl1_upd_ts) return doDtl1_upd_ts_VC(info);
		if (vc == columnDtl1_upd_srv_req_no) return doDtl1_upd_srv_req_no_VC(info);
		if (vc == columnDtl1_upd_cntr) return doDtl1_upd_cntr_VC(info);
		if (vc == columnDtl1_dec_place) return doDtl1_dec_place_VC(info);
		if (vc == columnDtl1_bill_d_typ) return doDtl1_bill_d_typ_VC(info);
		if (vc == columnDtl1_bill_mng_no) return doDtl1_bill_mng_no_VC(info);
		if (vc == columnDtl2_check) return doDtl2_check_VC(info);
		if (vc == columnDtl2_ac_ym) return doDtl2_ac_ym_VC(info);
		if (vc == columnDtl2_ac_dt) return doDtl2_ac_dt_VC(info);
		if (vc == columnDtl2_slip_sts_typ) return doDtl2_slip_sts_typ_VC(info);
		if (vc == columnDtl2_slip_sts_typ_nm) return doDtl2_slip_sts_typ_nm_VC(info);
		if (vc == columnDtl2_trd_cd) return doDtl2_trd_cd_VC(info);
		if (vc == columnDtl2_trd_nm) return doDtl2_trd_nm_VC(info);
		if (vc == columnDtl2_trd_ptn_typ) return doDtl2_trd_ptn_typ_VC(info);
		if (vc == columnDtl2_ar_typ) return doDtl2_ar_typ_VC(info);
		if (vc == columnDtl2_ar_typ_nm) return doDtl2_ar_typ_nm_VC(info);
		if (vc == columnDtl2_act_no) return doDtl2_act_no_VC(info);
		if (vc == columnDtl2_act_rev) return doDtl2_act_rev_VC(info);
		if (vc == columnDtl2_act_seq) return doDtl2_act_seq_VC(info);
		if (vc == columnDtl2_act_d_no) return doDtl2_act_d_no_VC(info);
		if (vc == columnDtl2_act_d_seq) return doDtl2_act_d_seq_VC(info);
		if (vc == columnDtl2_rcv_dt) return doDtl2_rcv_dt_VC(info);
		if (vc == columnDtl2_bill_basis_dt) return doDtl2_bill_basis_dt_VC(info);
		if (vc == columnDtl2_bill_crryovr_times) return doDtl2_bill_crryovr_times_VC(info);
		if (vc == columnDtl2_setoff_tax_cd) return doDtl2_setoff_tax_cd_VC(info);
		if (vc == columnDtl2_setoff_tax_nm) return doDtl2_setoff_tax_nm_VC(info);
		if (vc == columnDtl2_setoff_tax_rate) return doDtl2_setoff_tax_rate_VC(info);
		if (vc == columnDtl2_bill_d_rmrks) return doDtl2_bill_d_rmrks_VC(info);
		if (vc == columnDtl2_ins_usr_id) return doDtl2_ins_usr_id_VC(info);
		if (vc == columnDtl2_ins_usr_nm) return doDtl2_ins_usr_nm_VC(info);
		if (vc == columnDtl2_ins_func_id) return doDtl2_ins_func_id_VC(info);
		if (vc == columnDtl2_ins_func_nm) return doDtl2_ins_func_nm_VC(info);
		if (vc == columnDtl2_ins_ts) return doDtl2_ins_ts_VC(info);
		if (vc == columnDtl2_upd_usr_id) return doDtl2_upd_usr_id_VC(info);
		if (vc == columnDtl2_upd_usr_nm) return doDtl2_upd_usr_nm_VC(info);
		if (vc == columnDtl2_upd_func_id) return doDtl2_upd_func_id_VC(info);
		if (vc == columnDtl2_upd_func_nm) return doDtl2_upd_func_nm_VC(info);
		if (vc == columnDtl2_upd_ts) return doDtl2_upd_ts_VC(info);
		if (vc == columnDtl2_upd_srv_req_no) return doDtl2_upd_srv_req_no_VC(info);
		if (vc == columnDtl2_upd_cntr) return doDtl2_upd_cntr_VC(info);
		if (vc == columnDtl2_dec_place) return doDtl2_dec_place_VC(info);
		if (vc == columnDtl2_bill_d_no) return doDtl2_bill_d_no_VC(info);
		if (vc == columnDtl2_bill_d_typ) return doDtl2_bill_d_typ_VC(info);
		if (vc == columnDtl2_bill_mng_no) return doDtl2_bill_mng_no_VC(info);
		if (vc == columnDtl3_ac_ym) return doDtl3_ac_ym_VC(info);
		if (vc == columnDtl3_ac_dt) return doDtl3_ac_dt_VC(info);
		if (vc == columnDtl3_slip_sts_typ) return doDtl3_slip_sts_typ_VC(info);
		if (vc == columnDtl3_slip_sts_typ_nm) return doDtl3_slip_sts_typ_nm_VC(info);
		if (vc == columnDtl3_trd_cd) return doDtl3_trd_cd_VC(info);
		if (vc == columnDtl3_trd_nm) return doDtl3_trd_nm_VC(info);
		if (vc == columnDtl3_trd_ptn_typ) return doDtl3_trd_ptn_typ_VC(info);
		if (vc == columnDtl3_rcv_act_no) return doDtl3_rcv_act_no_VC(info);
		if (vc == columnDtl3_rcv_act_seq) return doDtl3_rcv_act_seq_VC(info);
		if (vc == columnDtl3_rcv_act_rev) return doDtl3_rcv_act_rev_VC(info);
		if (vc == columnDtl3_rcv_act_d_no) return doDtl3_rcv_act_d_no_VC(info);
		if (vc == columnDtl3_rcv_act_d_seq) return doDtl3_rcv_act_d_seq_VC(info);
		if (vc == columnDtl3_rcv_dt) return doDtl3_rcv_dt_VC(info);
		if (vc == columnDtl3_setoff_tax_cd) return doDtl3_setoff_tax_cd_VC(info);
		if (vc == columnDtl3_setoff_tax_nm) return doDtl3_setoff_tax_nm_VC(info);
		if (vc == columnDtl3_setoff_tax_rate) return doDtl3_setoff_tax_rate_VC(info);
		if (vc == columnDtl3_ins_usr_id) return doDtl3_ins_usr_id_VC(info);
		if (vc == columnDtl3_ins_usr_nm) return doDtl3_ins_usr_nm_VC(info);
		if (vc == columnDtl3_ins_func_id) return doDtl3_ins_func_id_VC(info);
		if (vc == columnDtl3_ins_func_nm) return doDtl3_ins_func_nm_VC(info);
		if (vc == columnDtl3_ins_ts) return doDtl3_ins_ts_VC(info);
		if (vc == columnDtl3_upd_usr_id) return doDtl3_upd_usr_id_VC(info);
		if (vc == columnDtl3_upd_usr_nm) return doDtl3_upd_usr_nm_VC(info);
		if (vc == columnDtl3_upd_func_id) return doDtl3_upd_func_id_VC(info);
		if (vc == columnDtl3_upd_func_nm) return doDtl3_upd_func_nm_VC(info);
		if (vc == columnDtl3_upd_ts) return doDtl3_upd_ts_VC(info);
		if (vc == columnDtl3_upd_srv_req_no) return doDtl3_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sign_rivrs_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sign_rivrs_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[multi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_multi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pre_bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pre_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upri_dec_place_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[row_num]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_row_num_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_sls_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_sls_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bill_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ship_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_multi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ship_dlv_slip_multi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bill_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bill_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bill_d_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bill_d_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bill_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bill_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bill_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_setoff_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_setoff_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_setoff_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bill_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bill_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bill_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bill_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bill_d_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bill_d_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bill_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bill_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[rcv_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_rcv_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[rcv_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_rcv_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_rcv_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_rcv_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_setoff_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_setoff_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_setoff_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_upd_srv_req_no_VC(MCEventInfo info){
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
		if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == Dtl1Table) doDtl1_NC(info);
		else if (nc == Dtl2Table) doDtl2_NC(info);
		else if (nc == Dtl3Table) doDtl3_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_bill_mng_no) doCnd_bill_mng_no_NC(info);
		else if (nc == Cnd_bill_no) doCnd_bill_no_NC(info);
		else if (nc == Cnd_sign_rivrs_flg) doCnd_sign_rivrs_flg_NC(info);
		else if (nc == Hdr_bill_no) doHdr_bill_no_NC(info);
		else if (nc == Hdr_bill_rev) doHdr_bill_rev_NC(info);
		else if (nc == Hdr_bill_cl_ym) doHdr_bill_cl_ym_NC(info);
		else if (nc == Hdr_bill_cl_day) doHdr_bill_cl_day_NC(info);
		else if (nc == Hdr_bill_dt) doHdr_bill_dt_NC(info);
		else if (nc == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_NC(info);
		else if (nc == Hdr_multi_flg) doHdr_multi_flg_NC(info);
		else if (nc == Hdr_iv_no) doHdr_iv_no_NC(info);
		else if (nc == Hdr_pre_bill_no) doHdr_pre_bill_no_NC(info);
		else if (nc == Hdr_prnt_flg) doHdr_prnt_flg_NC(info);
		else if (nc == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NC(info);
		else if (nc == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_bcst_cd) doHdr_bcst_cd_NC(info);
		else if (nc == Hdr_bcst_nm) doHdr_bcst_nm_NC(info);
		else if (nc == Hdr_foreign_flg) doHdr_foreign_flg_NC(info);
		else if (nc == Hdr_edi_flg) doHdr_edi_flg_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_bill_xrate) doHdr_bill_xrate_NC(info);
		else if (nc == Hdr_upri_dec_place) doHdr_upri_dec_place_NC(info);
		else if (nc == Hdr_amt_dec_place) doHdr_amt_dec_place_NC(info);
		else if (nc == Hdr_ins_usr_id) doHdr_ins_usr_id_NC(info);
		else if (nc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NC(info);
		else if (nc == Hdr_ins_func_id) doHdr_ins_func_id_NC(info);
		else if (nc == Hdr_ins_func_nm) doHdr_ins_func_nm_NC(info);
		else if (nc == Hdr_upd_usr_id) doHdr_upd_usr_id_NC(info);
		else if (nc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NC(info);
		else if (nc == Hdr_upd_func_id) doHdr_upd_func_id_NC(info);
		else if (nc == Hdr_upd_func_nm) doHdr_upd_func_nm_NC(info);
		else if (nc == Hdr_ins_ts) doHdr_ins_ts_NC(info);
		else if (nc == Hdr_upd_ts) doHdr_upd_ts_NC(info);
		else if (nc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NC(info);
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
		else if (nc == Hdr_bill_mng_no) doHdr_bill_mng_no_NC(info);
		else if (nc == columnDtl1_row_num) doDtl1_row_num_NC(info);
		else if (nc == columnDtl1_check) doDtl1_check_NC(info);
		else if (nc == columnDtl1_ac_ym) doDtl1_ac_ym_NC(info);
		else if (nc == columnDtl1_ac_dt) doDtl1_ac_dt_NC(info);
		else if (nc == columnDtl1_slip_sts_typ) doDtl1_slip_sts_typ_NC(info);
		else if (nc == columnDtl1_slip_sts_typ_nm) doDtl1_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtl1_trd_cd) doDtl1_trd_cd_NC(info);
		else if (nc == columnDtl1_trd_nm) doDtl1_trd_nm_NC(info);
		else if (nc == columnDtl1_trd_ptn_typ) doDtl1_trd_ptn_typ_NC(info);
		else if (nc == columnDtl1_ar_typ) doDtl1_ar_typ_NC(info);
		else if (nc == columnDtl1_ar_typ_nm) doDtl1_ar_typ_nm_NC(info);
		else if (nc == columnDtl1_base_sls_ac_dt) doDtl1_base_sls_ac_dt_NC(info);
		else if (nc == columnDtl1_act_no) doDtl1_act_no_NC(info);
		else if (nc == columnDtl1_act_rev) doDtl1_act_rev_NC(info);
		else if (nc == columnDtl1_act_seq) doDtl1_act_seq_NC(info);
		else if (nc == columnDtl1_act_d_no) doDtl1_act_d_no_NC(info);
		else if (nc == columnDtl1_act_d_seq) doDtl1_act_d_seq_NC(info);
		else if (nc == columnDtl1_dlv_dt) doDtl1_dlv_dt_NC(info);
		else if (nc == columnDtl1_bill_basis_dt) doDtl1_bill_basis_dt_NC(info);
		else if (nc == columnDtl1_bill_crryovr_times) doDtl1_bill_crryovr_times_NC(info);
		else if (nc == columnDtl1_cst_itm_cd) doDtl1_cst_itm_cd_NC(info);
		else if (nc == columnDtl1_cst_itm_nm) doDtl1_cst_itm_nm_NC(info);
		else if (nc == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NC(info);
		else if (nc == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NC(info);
		else if (nc == columnDtl1_trd_dec_place) doDtl1_trd_dec_place_NC(info);
		else if (nc == columnDtl1_inc_tax_flg) doDtl1_inc_tax_flg_NC(info);
		else if (nc == columnDtl1_interim_flg) doDtl1_interim_flg_NC(info);
		else if (nc == columnDtl1_tax_cd) doDtl1_tax_cd_NC(info);
		else if (nc == columnDtl1_tax_nm) doDtl1_tax_nm_NC(info);
		else if (nc == columnDtl1_tax_rate) doDtl1_tax_rate_NC(info);
		else if (nc == columnDtl1_cst_cd) doDtl1_cst_cd_NC(info);
		else if (nc == columnDtl1_cst_nm) doDtl1_cst_nm_NC(info);
		else if (nc == columnDtl1_dlv_cd) doDtl1_dlv_cd_NC(info);
		else if (nc == columnDtl1_dlv_nm) doDtl1_dlv_nm_NC(info);
		else if (nc == columnDtl1_dest_cd1) doDtl1_dest_cd1_NC(info);
		else if (nc == columnDtl1_dest_nm1) doDtl1_dest_nm1_NC(info);
		else if (nc == columnDtl1_dest_cd2) doDtl1_dest_cd2_NC(info);
		else if (nc == columnDtl1_dest_nm2) doDtl1_dest_nm2_NC(info);
		else if (nc == columnDtl1_dest_cd3) doDtl1_dest_cd3_NC(info);
		else if (nc == columnDtl1_dest_nm3) doDtl1_dest_nm3_NC(info);
		else if (nc == columnDtl1_sls_usr_cd) doDtl1_sls_usr_cd_NC(info);
		else if (nc == columnDtl1_sls_usr_nm) doDtl1_sls_usr_nm_NC(info);
		else if (nc == columnDtl1_sls_dpt_cd) doDtl1_sls_dpt_cd_NC(info);
		else if (nc == columnDtl1_sls_dpt_nm) doDtl1_sls_dpt_nm_NC(info);
		else if (nc == columnDtl1_slo_no) doDtl1_slo_no_NC(info);
		else if (nc == columnDtl1_slo_d_no) doDtl1_slo_d_no_NC(info);
		else if (nc == columnDtl1_cst_po_no) doDtl1_cst_po_no_NC(info);
		else if (nc == columnDtl1_cst_po_d_no) doDtl1_cst_po_d_no_NC(info);
		else if (nc == columnDtl1_dlv_slip_no) doDtl1_dlv_slip_no_NC(info);
		else if (nc == columnDtl1_dlv_slip_d_no) doDtl1_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl1_ship_dlv_slip_no) doDtl1_ship_dlv_slip_no_NC(info);
		else if (nc == columnDtl1_ship_dlv_slip_d_no) doDtl1_ship_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl1_ship_dlv_slip_multi_flg) doDtl1_ship_dlv_slip_multi_flg_NC(info);
		else if (nc == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_NC(info);
		else if (nc == columnDtl1_bill_d_no) doDtl1_bill_d_no_NC(info);
		else if (nc == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_NC(info);
		else if (nc == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_NC(info);
		else if (nc == columnDtl1_ins_func_id) doDtl1_ins_func_id_NC(info);
		else if (nc == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_NC(info);
		else if (nc == columnDtl1_ins_ts) doDtl1_ins_ts_NC(info);
		else if (nc == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_NC(info);
		else if (nc == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_NC(info);
		else if (nc == columnDtl1_upd_func_id) doDtl1_upd_func_id_NC(info);
		else if (nc == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_NC(info);
		else if (nc == columnDtl1_upd_ts) doDtl1_upd_ts_NC(info);
		else if (nc == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_NC(info);
		else if (nc == columnDtl1_upd_cntr) doDtl1_upd_cntr_NC(info);
		else if (nc == columnDtl1_dec_place) doDtl1_dec_place_NC(info);
		else if (nc == columnDtl1_bill_d_typ) doDtl1_bill_d_typ_NC(info);
		else if (nc == columnDtl1_bill_mng_no) doDtl1_bill_mng_no_NC(info);
		else if (nc == columnDtl2_check) doDtl2_check_NC(info);
		else if (nc == columnDtl2_ac_ym) doDtl2_ac_ym_NC(info);
		else if (nc == columnDtl2_ac_dt) doDtl2_ac_dt_NC(info);
		else if (nc == columnDtl2_slip_sts_typ) doDtl2_slip_sts_typ_NC(info);
		else if (nc == columnDtl2_slip_sts_typ_nm) doDtl2_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtl2_trd_cd) doDtl2_trd_cd_NC(info);
		else if (nc == columnDtl2_trd_nm) doDtl2_trd_nm_NC(info);
		else if (nc == columnDtl2_trd_ptn_typ) doDtl2_trd_ptn_typ_NC(info);
		else if (nc == columnDtl2_ar_typ) doDtl2_ar_typ_NC(info);
		else if (nc == columnDtl2_ar_typ_nm) doDtl2_ar_typ_nm_NC(info);
		else if (nc == columnDtl2_act_no) doDtl2_act_no_NC(info);
		else if (nc == columnDtl2_act_rev) doDtl2_act_rev_NC(info);
		else if (nc == columnDtl2_act_seq) doDtl2_act_seq_NC(info);
		else if (nc == columnDtl2_act_d_no) doDtl2_act_d_no_NC(info);
		else if (nc == columnDtl2_act_d_seq) doDtl2_act_d_seq_NC(info);
		else if (nc == columnDtl2_rcv_dt) doDtl2_rcv_dt_NC(info);
		else if (nc == columnDtl2_bill_basis_dt) doDtl2_bill_basis_dt_NC(info);
		else if (nc == columnDtl2_bill_crryovr_times) doDtl2_bill_crryovr_times_NC(info);
		else if (nc == columnDtl2_setoff_tax_cd) doDtl2_setoff_tax_cd_NC(info);
		else if (nc == columnDtl2_setoff_tax_nm) doDtl2_setoff_tax_nm_NC(info);
		else if (nc == columnDtl2_setoff_tax_rate) doDtl2_setoff_tax_rate_NC(info);
		else if (nc == columnDtl2_bill_d_rmrks) doDtl2_bill_d_rmrks_NC(info);
		else if (nc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NC(info);
		else if (nc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NC(info);
		else if (nc == columnDtl2_ins_func_id) doDtl2_ins_func_id_NC(info);
		else if (nc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NC(info);
		else if (nc == columnDtl2_ins_ts) doDtl2_ins_ts_NC(info);
		else if (nc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NC(info);
		else if (nc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NC(info);
		else if (nc == columnDtl2_upd_func_id) doDtl2_upd_func_id_NC(info);
		else if (nc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NC(info);
		else if (nc == columnDtl2_upd_ts) doDtl2_upd_ts_NC(info);
		else if (nc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NC(info);
		else if (nc == columnDtl2_upd_cntr) doDtl2_upd_cntr_NC(info);
		else if (nc == columnDtl2_dec_place) doDtl2_dec_place_NC(info);
		else if (nc == columnDtl2_bill_d_no) doDtl2_bill_d_no_NC(info);
		else if (nc == columnDtl2_bill_d_typ) doDtl2_bill_d_typ_NC(info);
		else if (nc == columnDtl2_bill_mng_no) doDtl2_bill_mng_no_NC(info);
		else if (nc == columnDtl3_ac_ym) doDtl3_ac_ym_NC(info);
		else if (nc == columnDtl3_ac_dt) doDtl3_ac_dt_NC(info);
		else if (nc == columnDtl3_slip_sts_typ) doDtl3_slip_sts_typ_NC(info);
		else if (nc == columnDtl3_slip_sts_typ_nm) doDtl3_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtl3_trd_cd) doDtl3_trd_cd_NC(info);
		else if (nc == columnDtl3_trd_nm) doDtl3_trd_nm_NC(info);
		else if (nc == columnDtl3_trd_ptn_typ) doDtl3_trd_ptn_typ_NC(info);
		else if (nc == columnDtl3_rcv_act_no) doDtl3_rcv_act_no_NC(info);
		else if (nc == columnDtl3_rcv_act_seq) doDtl3_rcv_act_seq_NC(info);
		else if (nc == columnDtl3_rcv_act_rev) doDtl3_rcv_act_rev_NC(info);
		else if (nc == columnDtl3_rcv_act_d_no) doDtl3_rcv_act_d_no_NC(info);
		else if (nc == columnDtl3_rcv_act_d_seq) doDtl3_rcv_act_d_seq_NC(info);
		else if (nc == columnDtl3_rcv_dt) doDtl3_rcv_dt_NC(info);
		else if (nc == columnDtl3_setoff_tax_cd) doDtl3_setoff_tax_cd_NC(info);
		else if (nc == columnDtl3_setoff_tax_nm) doDtl3_setoff_tax_nm_NC(info);
		else if (nc == columnDtl3_setoff_tax_rate) doDtl3_setoff_tax_rate_NC(info);
		else if (nc == columnDtl3_ins_usr_id) doDtl3_ins_usr_id_NC(info);
		else if (nc == columnDtl3_ins_usr_nm) doDtl3_ins_usr_nm_NC(info);
		else if (nc == columnDtl3_ins_func_id) doDtl3_ins_func_id_NC(info);
		else if (nc == columnDtl3_ins_func_nm) doDtl3_ins_func_nm_NC(info);
		else if (nc == columnDtl3_ins_ts) doDtl3_ins_ts_NC(info);
		else if (nc == columnDtl3_upd_usr_id) doDtl3_upd_usr_id_NC(info);
		else if (nc == columnDtl3_upd_usr_nm) doDtl3_upd_usr_nm_NC(info);
		else if (nc == columnDtl3_upd_func_id) doDtl3_upd_func_id_NC(info);
		else if (nc == columnDtl3_upd_func_nm) doDtl3_upd_func_nm_NC(info);
		else if (nc == columnDtl3_upd_ts) doDtl3_upd_ts_NC(info);
		else if (nc == columnDtl3_upd_srv_req_no) doDtl3_upd_srv_req_no_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rivrs_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rivrs_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_rev_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[multi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_multi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[row_num]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_row_num_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_sls_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_sls_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_multi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_multi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_d_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_d_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == Dtl1Table) doDtl1_NE(info);
		else if (ne == Dtl2Table) doDtl2_NE(info);
		else if (ne == Dtl3Table) doDtl3_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_bill_mng_no) doCnd_bill_mng_no_NE(info);
		else if (ne == Cnd_bill_no) doCnd_bill_no_NE(info);
		else if (ne == Cnd_sign_rivrs_flg) doCnd_sign_rivrs_flg_NE(info);
		else if (ne == Hdr_bill_no) doHdr_bill_no_NE(info);
		else if (ne == Hdr_bill_rev) doHdr_bill_rev_NE(info);
		else if (ne == Hdr_bill_cl_ym) doHdr_bill_cl_ym_NE(info);
		else if (ne == Hdr_bill_cl_day) doHdr_bill_cl_day_NE(info);
		else if (ne == Hdr_bill_dt) doHdr_bill_dt_NE(info);
		else if (ne == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_NE(info);
		else if (ne == Hdr_multi_flg) doHdr_multi_flg_NE(info);
		else if (ne == Hdr_iv_no) doHdr_iv_no_NE(info);
		else if (ne == Hdr_pre_bill_no) doHdr_pre_bill_no_NE(info);
		else if (ne == Hdr_prnt_flg) doHdr_prnt_flg_NE(info);
		else if (ne == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NE(info);
		else if (ne == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_bcst_cd) doHdr_bcst_cd_NE(info);
		else if (ne == Hdr_bcst_nm) doHdr_bcst_nm_NE(info);
		else if (ne == Hdr_foreign_flg) doHdr_foreign_flg_NE(info);
		else if (ne == Hdr_edi_flg) doHdr_edi_flg_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_bill_xrate) doHdr_bill_xrate_NE(info);
		else if (ne == Hdr_upri_dec_place) doHdr_upri_dec_place_NE(info);
		else if (ne == Hdr_amt_dec_place) doHdr_amt_dec_place_NE(info);
		else if (ne == Hdr_ins_usr_id) doHdr_ins_usr_id_NE(info);
		else if (ne == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NE(info);
		else if (ne == Hdr_ins_func_id) doHdr_ins_func_id_NE(info);
		else if (ne == Hdr_ins_func_nm) doHdr_ins_func_nm_NE(info);
		else if (ne == Hdr_upd_usr_id) doHdr_upd_usr_id_NE(info);
		else if (ne == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NE(info);
		else if (ne == Hdr_upd_func_id) doHdr_upd_func_id_NE(info);
		else if (ne == Hdr_upd_func_nm) doHdr_upd_func_nm_NE(info);
		else if (ne == Hdr_ins_ts) doHdr_ins_ts_NE(info);
		else if (ne == Hdr_upd_ts) doHdr_upd_ts_NE(info);
		else if (ne == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NE(info);
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
		else if (ne == Hdr_bill_mng_no) doHdr_bill_mng_no_NE(info);
		else if (ne == columnDtl1_row_num) doDtl1_row_num_NE(info);
		else if (ne == columnDtl1_check) doDtl1_check_NE(info);
		else if (ne == columnDtl1_ac_ym) doDtl1_ac_ym_NE(info);
		else if (ne == columnDtl1_ac_dt) doDtl1_ac_dt_NE(info);
		else if (ne == columnDtl1_slip_sts_typ) doDtl1_slip_sts_typ_NE(info);
		else if (ne == columnDtl1_slip_sts_typ_nm) doDtl1_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtl1_trd_cd) doDtl1_trd_cd_NE(info);
		else if (ne == columnDtl1_trd_nm) doDtl1_trd_nm_NE(info);
		else if (ne == columnDtl1_trd_ptn_typ) doDtl1_trd_ptn_typ_NE(info);
		else if (ne == columnDtl1_ar_typ) doDtl1_ar_typ_NE(info);
		else if (ne == columnDtl1_ar_typ_nm) doDtl1_ar_typ_nm_NE(info);
		else if (ne == columnDtl1_base_sls_ac_dt) doDtl1_base_sls_ac_dt_NE(info);
		else if (ne == columnDtl1_act_no) doDtl1_act_no_NE(info);
		else if (ne == columnDtl1_act_rev) doDtl1_act_rev_NE(info);
		else if (ne == columnDtl1_act_seq) doDtl1_act_seq_NE(info);
		else if (ne == columnDtl1_act_d_no) doDtl1_act_d_no_NE(info);
		else if (ne == columnDtl1_act_d_seq) doDtl1_act_d_seq_NE(info);
		else if (ne == columnDtl1_dlv_dt) doDtl1_dlv_dt_NE(info);
		else if (ne == columnDtl1_bill_basis_dt) doDtl1_bill_basis_dt_NE(info);
		else if (ne == columnDtl1_bill_crryovr_times) doDtl1_bill_crryovr_times_NE(info);
		else if (ne == columnDtl1_cst_itm_cd) doDtl1_cst_itm_cd_NE(info);
		else if (ne == columnDtl1_cst_itm_nm) doDtl1_cst_itm_nm_NE(info);
		else if (ne == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NE(info);
		else if (ne == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NE(info);
		else if (ne == columnDtl1_trd_dec_place) doDtl1_trd_dec_place_NE(info);
		else if (ne == columnDtl1_inc_tax_flg) doDtl1_inc_tax_flg_NE(info);
		else if (ne == columnDtl1_interim_flg) doDtl1_interim_flg_NE(info);
		else if (ne == columnDtl1_tax_cd) doDtl1_tax_cd_NE(info);
		else if (ne == columnDtl1_tax_nm) doDtl1_tax_nm_NE(info);
		else if (ne == columnDtl1_tax_rate) doDtl1_tax_rate_NE(info);
		else if (ne == columnDtl1_cst_cd) doDtl1_cst_cd_NE(info);
		else if (ne == columnDtl1_cst_nm) doDtl1_cst_nm_NE(info);
		else if (ne == columnDtl1_dlv_cd) doDtl1_dlv_cd_NE(info);
		else if (ne == columnDtl1_dlv_nm) doDtl1_dlv_nm_NE(info);
		else if (ne == columnDtl1_dest_cd1) doDtl1_dest_cd1_NE(info);
		else if (ne == columnDtl1_dest_nm1) doDtl1_dest_nm1_NE(info);
		else if (ne == columnDtl1_dest_cd2) doDtl1_dest_cd2_NE(info);
		else if (ne == columnDtl1_dest_nm2) doDtl1_dest_nm2_NE(info);
		else if (ne == columnDtl1_dest_cd3) doDtl1_dest_cd3_NE(info);
		else if (ne == columnDtl1_dest_nm3) doDtl1_dest_nm3_NE(info);
		else if (ne == columnDtl1_sls_usr_cd) doDtl1_sls_usr_cd_NE(info);
		else if (ne == columnDtl1_sls_usr_nm) doDtl1_sls_usr_nm_NE(info);
		else if (ne == columnDtl1_sls_dpt_cd) doDtl1_sls_dpt_cd_NE(info);
		else if (ne == columnDtl1_sls_dpt_nm) doDtl1_sls_dpt_nm_NE(info);
		else if (ne == columnDtl1_slo_no) doDtl1_slo_no_NE(info);
		else if (ne == columnDtl1_slo_d_no) doDtl1_slo_d_no_NE(info);
		else if (ne == columnDtl1_cst_po_no) doDtl1_cst_po_no_NE(info);
		else if (ne == columnDtl1_cst_po_d_no) doDtl1_cst_po_d_no_NE(info);
		else if (ne == columnDtl1_dlv_slip_no) doDtl1_dlv_slip_no_NE(info);
		else if (ne == columnDtl1_dlv_slip_d_no) doDtl1_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl1_ship_dlv_slip_no) doDtl1_ship_dlv_slip_no_NE(info);
		else if (ne == columnDtl1_ship_dlv_slip_d_no) doDtl1_ship_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl1_ship_dlv_slip_multi_flg) doDtl1_ship_dlv_slip_multi_flg_NE(info);
		else if (ne == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_NE(info);
		else if (ne == columnDtl1_bill_d_no) doDtl1_bill_d_no_NE(info);
		else if (ne == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_NE(info);
		else if (ne == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_NE(info);
		else if (ne == columnDtl1_ins_func_id) doDtl1_ins_func_id_NE(info);
		else if (ne == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_NE(info);
		else if (ne == columnDtl1_ins_ts) doDtl1_ins_ts_NE(info);
		else if (ne == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_NE(info);
		else if (ne == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_NE(info);
		else if (ne == columnDtl1_upd_func_id) doDtl1_upd_func_id_NE(info);
		else if (ne == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_NE(info);
		else if (ne == columnDtl1_upd_ts) doDtl1_upd_ts_NE(info);
		else if (ne == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_NE(info);
		else if (ne == columnDtl1_upd_cntr) doDtl1_upd_cntr_NE(info);
		else if (ne == columnDtl1_dec_place) doDtl1_dec_place_NE(info);
		else if (ne == columnDtl1_bill_d_typ) doDtl1_bill_d_typ_NE(info);
		else if (ne == columnDtl1_bill_mng_no) doDtl1_bill_mng_no_NE(info);
		else if (ne == columnDtl2_check) doDtl2_check_NE(info);
		else if (ne == columnDtl2_ac_ym) doDtl2_ac_ym_NE(info);
		else if (ne == columnDtl2_ac_dt) doDtl2_ac_dt_NE(info);
		else if (ne == columnDtl2_slip_sts_typ) doDtl2_slip_sts_typ_NE(info);
		else if (ne == columnDtl2_slip_sts_typ_nm) doDtl2_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtl2_trd_cd) doDtl2_trd_cd_NE(info);
		else if (ne == columnDtl2_trd_nm) doDtl2_trd_nm_NE(info);
		else if (ne == columnDtl2_trd_ptn_typ) doDtl2_trd_ptn_typ_NE(info);
		else if (ne == columnDtl2_ar_typ) doDtl2_ar_typ_NE(info);
		else if (ne == columnDtl2_ar_typ_nm) doDtl2_ar_typ_nm_NE(info);
		else if (ne == columnDtl2_act_no) doDtl2_act_no_NE(info);
		else if (ne == columnDtl2_act_rev) doDtl2_act_rev_NE(info);
		else if (ne == columnDtl2_act_seq) doDtl2_act_seq_NE(info);
		else if (ne == columnDtl2_act_d_no) doDtl2_act_d_no_NE(info);
		else if (ne == columnDtl2_act_d_seq) doDtl2_act_d_seq_NE(info);
		else if (ne == columnDtl2_rcv_dt) doDtl2_rcv_dt_NE(info);
		else if (ne == columnDtl2_bill_basis_dt) doDtl2_bill_basis_dt_NE(info);
		else if (ne == columnDtl2_bill_crryovr_times) doDtl2_bill_crryovr_times_NE(info);
		else if (ne == columnDtl2_setoff_tax_cd) doDtl2_setoff_tax_cd_NE(info);
		else if (ne == columnDtl2_setoff_tax_nm) doDtl2_setoff_tax_nm_NE(info);
		else if (ne == columnDtl2_setoff_tax_rate) doDtl2_setoff_tax_rate_NE(info);
		else if (ne == columnDtl2_bill_d_rmrks) doDtl2_bill_d_rmrks_NE(info);
		else if (ne == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NE(info);
		else if (ne == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NE(info);
		else if (ne == columnDtl2_ins_func_id) doDtl2_ins_func_id_NE(info);
		else if (ne == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NE(info);
		else if (ne == columnDtl2_ins_ts) doDtl2_ins_ts_NE(info);
		else if (ne == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NE(info);
		else if (ne == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NE(info);
		else if (ne == columnDtl2_upd_func_id) doDtl2_upd_func_id_NE(info);
		else if (ne == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NE(info);
		else if (ne == columnDtl2_upd_ts) doDtl2_upd_ts_NE(info);
		else if (ne == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NE(info);
		else if (ne == columnDtl2_upd_cntr) doDtl2_upd_cntr_NE(info);
		else if (ne == columnDtl2_dec_place) doDtl2_dec_place_NE(info);
		else if (ne == columnDtl2_bill_d_no) doDtl2_bill_d_no_NE(info);
		else if (ne == columnDtl2_bill_d_typ) doDtl2_bill_d_typ_NE(info);
		else if (ne == columnDtl2_bill_mng_no) doDtl2_bill_mng_no_NE(info);
		else if (ne == columnDtl3_ac_ym) doDtl3_ac_ym_NE(info);
		else if (ne == columnDtl3_ac_dt) doDtl3_ac_dt_NE(info);
		else if (ne == columnDtl3_slip_sts_typ) doDtl3_slip_sts_typ_NE(info);
		else if (ne == columnDtl3_slip_sts_typ_nm) doDtl3_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtl3_trd_cd) doDtl3_trd_cd_NE(info);
		else if (ne == columnDtl3_trd_nm) doDtl3_trd_nm_NE(info);
		else if (ne == columnDtl3_trd_ptn_typ) doDtl3_trd_ptn_typ_NE(info);
		else if (ne == columnDtl3_rcv_act_no) doDtl3_rcv_act_no_NE(info);
		else if (ne == columnDtl3_rcv_act_seq) doDtl3_rcv_act_seq_NE(info);
		else if (ne == columnDtl3_rcv_act_rev) doDtl3_rcv_act_rev_NE(info);
		else if (ne == columnDtl3_rcv_act_d_no) doDtl3_rcv_act_d_no_NE(info);
		else if (ne == columnDtl3_rcv_act_d_seq) doDtl3_rcv_act_d_seq_NE(info);
		else if (ne == columnDtl3_rcv_dt) doDtl3_rcv_dt_NE(info);
		else if (ne == columnDtl3_setoff_tax_cd) doDtl3_setoff_tax_cd_NE(info);
		else if (ne == columnDtl3_setoff_tax_nm) doDtl3_setoff_tax_nm_NE(info);
		else if (ne == columnDtl3_setoff_tax_rate) doDtl3_setoff_tax_rate_NE(info);
		else if (ne == columnDtl3_ins_usr_id) doDtl3_ins_usr_id_NE(info);
		else if (ne == columnDtl3_ins_usr_nm) doDtl3_ins_usr_nm_NE(info);
		else if (ne == columnDtl3_ins_func_id) doDtl3_ins_func_id_NE(info);
		else if (ne == columnDtl3_ins_func_nm) doDtl3_ins_func_nm_NE(info);
		else if (ne == columnDtl3_ins_ts) doDtl3_ins_ts_NE(info);
		else if (ne == columnDtl3_upd_usr_id) doDtl3_upd_usr_id_NE(info);
		else if (ne == columnDtl3_upd_usr_nm) doDtl3_upd_usr_nm_NE(info);
		else if (ne == columnDtl3_upd_func_id) doDtl3_upd_func_id_NE(info);
		else if (ne == columnDtl3_upd_func_nm) doDtl3_upd_func_nm_NE(info);
		else if (ne == columnDtl3_upd_ts) doDtl3_upd_ts_NE(info);
		else if (ne == columnDtl3_upd_srv_req_no) doDtl3_upd_srv_req_no_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rivrs_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rivrs_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_rev_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[multi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_multi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[row_num]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_row_num_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_sls_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_sls_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_multi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_multi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_d_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_d_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == Dtl1Table) doDtl1_NX(info);
		else if (nx == Dtl2Table) doDtl2_NX(info);
		else if (nx == Dtl3Table) doDtl3_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_bill_mng_no) doCnd_bill_mng_no_NX(info);
		else if (nx == Cnd_bill_no) doCnd_bill_no_NX(info);
		else if (nx == Cnd_sign_rivrs_flg) doCnd_sign_rivrs_flg_NX(info);
		else if (nx == Hdr_bill_no) doHdr_bill_no_NX(info);
		else if (nx == Hdr_bill_rev) doHdr_bill_rev_NX(info);
		else if (nx == Hdr_bill_cl_ym) doHdr_bill_cl_ym_NX(info);
		else if (nx == Hdr_bill_cl_day) doHdr_bill_cl_day_NX(info);
		else if (nx == Hdr_bill_dt) doHdr_bill_dt_NX(info);
		else if (nx == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_NX(info);
		else if (nx == Hdr_multi_flg) doHdr_multi_flg_NX(info);
		else if (nx == Hdr_iv_no) doHdr_iv_no_NX(info);
		else if (nx == Hdr_pre_bill_no) doHdr_pre_bill_no_NX(info);
		else if (nx == Hdr_prnt_flg) doHdr_prnt_flg_NX(info);
		else if (nx == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NX(info);
		else if (nx == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_bcst_cd) doHdr_bcst_cd_NX(info);
		else if (nx == Hdr_bcst_nm) doHdr_bcst_nm_NX(info);
		else if (nx == Hdr_foreign_flg) doHdr_foreign_flg_NX(info);
		else if (nx == Hdr_edi_flg) doHdr_edi_flg_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_bill_xrate) doHdr_bill_xrate_NX(info);
		else if (nx == Hdr_upri_dec_place) doHdr_upri_dec_place_NX(info);
		else if (nx == Hdr_amt_dec_place) doHdr_amt_dec_place_NX(info);
		else if (nx == Hdr_ins_usr_id) doHdr_ins_usr_id_NX(info);
		else if (nx == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NX(info);
		else if (nx == Hdr_ins_func_id) doHdr_ins_func_id_NX(info);
		else if (nx == Hdr_ins_func_nm) doHdr_ins_func_nm_NX(info);
		else if (nx == Hdr_upd_usr_id) doHdr_upd_usr_id_NX(info);
		else if (nx == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NX(info);
		else if (nx == Hdr_upd_func_id) doHdr_upd_func_id_NX(info);
		else if (nx == Hdr_upd_func_nm) doHdr_upd_func_nm_NX(info);
		else if (nx == Hdr_ins_ts) doHdr_ins_ts_NX(info);
		else if (nx == Hdr_upd_ts) doHdr_upd_ts_NX(info);
		else if (nx == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NX(info);
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
		else if (nx == Hdr_bill_mng_no) doHdr_bill_mng_no_NX(info);
		else if (nx == columnDtl1_row_num) doDtl1_row_num_NX(info);
		else if (nx == columnDtl1_check) doDtl1_check_NX(info);
		else if (nx == columnDtl1_ac_ym) doDtl1_ac_ym_NX(info);
		else if (nx == columnDtl1_ac_dt) doDtl1_ac_dt_NX(info);
		else if (nx == columnDtl1_slip_sts_typ) doDtl1_slip_sts_typ_NX(info);
		else if (nx == columnDtl1_slip_sts_typ_nm) doDtl1_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtl1_trd_cd) doDtl1_trd_cd_NX(info);
		else if (nx == columnDtl1_trd_nm) doDtl1_trd_nm_NX(info);
		else if (nx == columnDtl1_trd_ptn_typ) doDtl1_trd_ptn_typ_NX(info);
		else if (nx == columnDtl1_ar_typ) doDtl1_ar_typ_NX(info);
		else if (nx == columnDtl1_ar_typ_nm) doDtl1_ar_typ_nm_NX(info);
		else if (nx == columnDtl1_base_sls_ac_dt) doDtl1_base_sls_ac_dt_NX(info);
		else if (nx == columnDtl1_act_no) doDtl1_act_no_NX(info);
		else if (nx == columnDtl1_act_rev) doDtl1_act_rev_NX(info);
		else if (nx == columnDtl1_act_seq) doDtl1_act_seq_NX(info);
		else if (nx == columnDtl1_act_d_no) doDtl1_act_d_no_NX(info);
		else if (nx == columnDtl1_act_d_seq) doDtl1_act_d_seq_NX(info);
		else if (nx == columnDtl1_dlv_dt) doDtl1_dlv_dt_NX(info);
		else if (nx == columnDtl1_bill_basis_dt) doDtl1_bill_basis_dt_NX(info);
		else if (nx == columnDtl1_bill_crryovr_times) doDtl1_bill_crryovr_times_NX(info);
		else if (nx == columnDtl1_cst_itm_cd) doDtl1_cst_itm_cd_NX(info);
		else if (nx == columnDtl1_cst_itm_nm) doDtl1_cst_itm_nm_NX(info);
		else if (nx == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NX(info);
		else if (nx == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NX(info);
		else if (nx == columnDtl1_trd_dec_place) doDtl1_trd_dec_place_NX(info);
		else if (nx == columnDtl1_inc_tax_flg) doDtl1_inc_tax_flg_NX(info);
		else if (nx == columnDtl1_interim_flg) doDtl1_interim_flg_NX(info);
		else if (nx == columnDtl1_tax_cd) doDtl1_tax_cd_NX(info);
		else if (nx == columnDtl1_tax_nm) doDtl1_tax_nm_NX(info);
		else if (nx == columnDtl1_tax_rate) doDtl1_tax_rate_NX(info);
		else if (nx == columnDtl1_cst_cd) doDtl1_cst_cd_NX(info);
		else if (nx == columnDtl1_cst_nm) doDtl1_cst_nm_NX(info);
		else if (nx == columnDtl1_dlv_cd) doDtl1_dlv_cd_NX(info);
		else if (nx == columnDtl1_dlv_nm) doDtl1_dlv_nm_NX(info);
		else if (nx == columnDtl1_dest_cd1) doDtl1_dest_cd1_NX(info);
		else if (nx == columnDtl1_dest_nm1) doDtl1_dest_nm1_NX(info);
		else if (nx == columnDtl1_dest_cd2) doDtl1_dest_cd2_NX(info);
		else if (nx == columnDtl1_dest_nm2) doDtl1_dest_nm2_NX(info);
		else if (nx == columnDtl1_dest_cd3) doDtl1_dest_cd3_NX(info);
		else if (nx == columnDtl1_dest_nm3) doDtl1_dest_nm3_NX(info);
		else if (nx == columnDtl1_sls_usr_cd) doDtl1_sls_usr_cd_NX(info);
		else if (nx == columnDtl1_sls_usr_nm) doDtl1_sls_usr_nm_NX(info);
		else if (nx == columnDtl1_sls_dpt_cd) doDtl1_sls_dpt_cd_NX(info);
		else if (nx == columnDtl1_sls_dpt_nm) doDtl1_sls_dpt_nm_NX(info);
		else if (nx == columnDtl1_slo_no) doDtl1_slo_no_NX(info);
		else if (nx == columnDtl1_slo_d_no) doDtl1_slo_d_no_NX(info);
		else if (nx == columnDtl1_cst_po_no) doDtl1_cst_po_no_NX(info);
		else if (nx == columnDtl1_cst_po_d_no) doDtl1_cst_po_d_no_NX(info);
		else if (nx == columnDtl1_dlv_slip_no) doDtl1_dlv_slip_no_NX(info);
		else if (nx == columnDtl1_dlv_slip_d_no) doDtl1_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl1_ship_dlv_slip_no) doDtl1_ship_dlv_slip_no_NX(info);
		else if (nx == columnDtl1_ship_dlv_slip_d_no) doDtl1_ship_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl1_ship_dlv_slip_multi_flg) doDtl1_ship_dlv_slip_multi_flg_NX(info);
		else if (nx == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_NX(info);
		else if (nx == columnDtl1_bill_d_no) doDtl1_bill_d_no_NX(info);
		else if (nx == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_NX(info);
		else if (nx == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_NX(info);
		else if (nx == columnDtl1_ins_func_id) doDtl1_ins_func_id_NX(info);
		else if (nx == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_NX(info);
		else if (nx == columnDtl1_ins_ts) doDtl1_ins_ts_NX(info);
		else if (nx == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_NX(info);
		else if (nx == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_NX(info);
		else if (nx == columnDtl1_upd_func_id) doDtl1_upd_func_id_NX(info);
		else if (nx == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_NX(info);
		else if (nx == columnDtl1_upd_ts) doDtl1_upd_ts_NX(info);
		else if (nx == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_NX(info);
		else if (nx == columnDtl1_upd_cntr) doDtl1_upd_cntr_NX(info);
		else if (nx == columnDtl1_dec_place) doDtl1_dec_place_NX(info);
		else if (nx == columnDtl1_bill_d_typ) doDtl1_bill_d_typ_NX(info);
		else if (nx == columnDtl1_bill_mng_no) doDtl1_bill_mng_no_NX(info);
		else if (nx == columnDtl2_check) doDtl2_check_NX(info);
		else if (nx == columnDtl2_ac_ym) doDtl2_ac_ym_NX(info);
		else if (nx == columnDtl2_ac_dt) doDtl2_ac_dt_NX(info);
		else if (nx == columnDtl2_slip_sts_typ) doDtl2_slip_sts_typ_NX(info);
		else if (nx == columnDtl2_slip_sts_typ_nm) doDtl2_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtl2_trd_cd) doDtl2_trd_cd_NX(info);
		else if (nx == columnDtl2_trd_nm) doDtl2_trd_nm_NX(info);
		else if (nx == columnDtl2_trd_ptn_typ) doDtl2_trd_ptn_typ_NX(info);
		else if (nx == columnDtl2_ar_typ) doDtl2_ar_typ_NX(info);
		else if (nx == columnDtl2_ar_typ_nm) doDtl2_ar_typ_nm_NX(info);
		else if (nx == columnDtl2_act_no) doDtl2_act_no_NX(info);
		else if (nx == columnDtl2_act_rev) doDtl2_act_rev_NX(info);
		else if (nx == columnDtl2_act_seq) doDtl2_act_seq_NX(info);
		else if (nx == columnDtl2_act_d_no) doDtl2_act_d_no_NX(info);
		else if (nx == columnDtl2_act_d_seq) doDtl2_act_d_seq_NX(info);
		else if (nx == columnDtl2_rcv_dt) doDtl2_rcv_dt_NX(info);
		else if (nx == columnDtl2_bill_basis_dt) doDtl2_bill_basis_dt_NX(info);
		else if (nx == columnDtl2_bill_crryovr_times) doDtl2_bill_crryovr_times_NX(info);
		else if (nx == columnDtl2_setoff_tax_cd) doDtl2_setoff_tax_cd_NX(info);
		else if (nx == columnDtl2_setoff_tax_nm) doDtl2_setoff_tax_nm_NX(info);
		else if (nx == columnDtl2_setoff_tax_rate) doDtl2_setoff_tax_rate_NX(info);
		else if (nx == columnDtl2_bill_d_rmrks) doDtl2_bill_d_rmrks_NX(info);
		else if (nx == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NX(info);
		else if (nx == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NX(info);
		else if (nx == columnDtl2_ins_func_id) doDtl2_ins_func_id_NX(info);
		else if (nx == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NX(info);
		else if (nx == columnDtl2_ins_ts) doDtl2_ins_ts_NX(info);
		else if (nx == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NX(info);
		else if (nx == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NX(info);
		else if (nx == columnDtl2_upd_func_id) doDtl2_upd_func_id_NX(info);
		else if (nx == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NX(info);
		else if (nx == columnDtl2_upd_ts) doDtl2_upd_ts_NX(info);
		else if (nx == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NX(info);
		else if (nx == columnDtl2_upd_cntr) doDtl2_upd_cntr_NX(info);
		else if (nx == columnDtl2_dec_place) doDtl2_dec_place_NX(info);
		else if (nx == columnDtl2_bill_d_no) doDtl2_bill_d_no_NX(info);
		else if (nx == columnDtl2_bill_d_typ) doDtl2_bill_d_typ_NX(info);
		else if (nx == columnDtl2_bill_mng_no) doDtl2_bill_mng_no_NX(info);
		else if (nx == columnDtl3_ac_ym) doDtl3_ac_ym_NX(info);
		else if (nx == columnDtl3_ac_dt) doDtl3_ac_dt_NX(info);
		else if (nx == columnDtl3_slip_sts_typ) doDtl3_slip_sts_typ_NX(info);
		else if (nx == columnDtl3_slip_sts_typ_nm) doDtl3_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtl3_trd_cd) doDtl3_trd_cd_NX(info);
		else if (nx == columnDtl3_trd_nm) doDtl3_trd_nm_NX(info);
		else if (nx == columnDtl3_trd_ptn_typ) doDtl3_trd_ptn_typ_NX(info);
		else if (nx == columnDtl3_rcv_act_no) doDtl3_rcv_act_no_NX(info);
		else if (nx == columnDtl3_rcv_act_seq) doDtl3_rcv_act_seq_NX(info);
		else if (nx == columnDtl3_rcv_act_rev) doDtl3_rcv_act_rev_NX(info);
		else if (nx == columnDtl3_rcv_act_d_no) doDtl3_rcv_act_d_no_NX(info);
		else if (nx == columnDtl3_rcv_act_d_seq) doDtl3_rcv_act_d_seq_NX(info);
		else if (nx == columnDtl3_rcv_dt) doDtl3_rcv_dt_NX(info);
		else if (nx == columnDtl3_setoff_tax_cd) doDtl3_setoff_tax_cd_NX(info);
		else if (nx == columnDtl3_setoff_tax_nm) doDtl3_setoff_tax_nm_NX(info);
		else if (nx == columnDtl3_setoff_tax_rate) doDtl3_setoff_tax_rate_NX(info);
		else if (nx == columnDtl3_ins_usr_id) doDtl3_ins_usr_id_NX(info);
		else if (nx == columnDtl3_ins_usr_nm) doDtl3_ins_usr_nm_NX(info);
		else if (nx == columnDtl3_ins_func_id) doDtl3_ins_func_id_NX(info);
		else if (nx == columnDtl3_ins_func_nm) doDtl3_ins_func_nm_NX(info);
		else if (nx == columnDtl3_ins_ts) doDtl3_ins_ts_NX(info);
		else if (nx == columnDtl3_upd_usr_id) doDtl3_upd_usr_id_NX(info);
		else if (nx == columnDtl3_upd_usr_nm) doDtl3_upd_usr_nm_NX(info);
		else if (nx == columnDtl3_upd_func_id) doDtl3_upd_func_id_NX(info);
		else if (nx == columnDtl3_upd_func_nm) doDtl3_upd_func_nm_NX(info);
		else if (nx == columnDtl3_upd_ts) doDtl3_upd_ts_NX(info);
		else if (nx == columnDtl3_upd_srv_req_no) doDtl3_upd_srv_req_no_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rivrs_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rivrs_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_rev_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[multi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_multi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[row_num]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_row_num_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_sls_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_sls_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_multi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_multi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_d_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_d_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bill_mng_no) doCnd_bill_mng_no_LC(info);
		else if (lc == Cnd_bill_no) doCnd_bill_no_LC(info);
		else if (lc == Hdr_bill_no) doHdr_bill_no_LC(info);
		else if (lc == Hdr_bill_rev) doHdr_bill_rev_LC(info);
		else if (lc == Hdr_bill_cl_ym) doHdr_bill_cl_ym_LC(info);
		else if (lc == Hdr_bill_cl_day) doHdr_bill_cl_day_LC(info);
		else if (lc == Hdr_bill_dt) doHdr_bill_dt_LC(info);
		else if (lc == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_LC(info);
		else if (lc == Hdr_iv_no) doHdr_iv_no_LC(info);
		else if (lc == Hdr_pre_bill_no) doHdr_pre_bill_no_LC(info);
		else if (lc == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_LC(info);
		else if (lc == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_bcst_cd) doHdr_bcst_cd_LC(info);
		else if (lc == Hdr_bcst_nm) doHdr_bcst_nm_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_bill_xrate) doHdr_bill_xrate_LC(info);
		else if (lc == Hdr_upri_dec_place) doHdr_upri_dec_place_LC(info);
		else if (lc == Hdr_amt_dec_place) doHdr_amt_dec_place_LC(info);
		else if (lc == Hdr_ins_usr_id) doHdr_ins_usr_id_LC(info);
		else if (lc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_LC(info);
		else if (lc == Hdr_ins_func_id) doHdr_ins_func_id_LC(info);
		else if (lc == Hdr_ins_func_nm) doHdr_ins_func_nm_LC(info);
		else if (lc == Hdr_upd_usr_id) doHdr_upd_usr_id_LC(info);
		else if (lc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_LC(info);
		else if (lc == Hdr_upd_func_id) doHdr_upd_func_id_LC(info);
		else if (lc == Hdr_upd_func_nm) doHdr_upd_func_nm_LC(info);
		else if (lc == Hdr_ins_ts) doHdr_ins_ts_LC(info);
		else if (lc == Hdr_upd_ts) doHdr_upd_ts_LC(info);
		else if (lc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_LC(info);
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
		else if (lc == Hdr_bill_mng_no) doHdr_bill_mng_no_LC(info);
		else if (lc == columnDtl1_row_num) doDtl1_row_num_LC(info);
		else if (lc == columnDtl1_ac_ym) doDtl1_ac_ym_LC(info);
		else if (lc == columnDtl1_ac_dt) doDtl1_ac_dt_LC(info);
		else if (lc == columnDtl1_slip_sts_typ) doDtl1_slip_sts_typ_LC(info);
		else if (lc == columnDtl1_slip_sts_typ_nm) doDtl1_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtl1_trd_cd) doDtl1_trd_cd_LC(info);
		else if (lc == columnDtl1_trd_nm) doDtl1_trd_nm_LC(info);
		else if (lc == columnDtl1_trd_ptn_typ) doDtl1_trd_ptn_typ_LC(info);
		else if (lc == columnDtl1_ar_typ) doDtl1_ar_typ_LC(info);
		else if (lc == columnDtl1_ar_typ_nm) doDtl1_ar_typ_nm_LC(info);
		else if (lc == columnDtl1_base_sls_ac_dt) doDtl1_base_sls_ac_dt_LC(info);
		else if (lc == columnDtl1_act_no) doDtl1_act_no_LC(info);
		else if (lc == columnDtl1_act_rev) doDtl1_act_rev_LC(info);
		else if (lc == columnDtl1_act_seq) doDtl1_act_seq_LC(info);
		else if (lc == columnDtl1_act_d_no) doDtl1_act_d_no_LC(info);
		else if (lc == columnDtl1_act_d_seq) doDtl1_act_d_seq_LC(info);
		else if (lc == columnDtl1_dlv_dt) doDtl1_dlv_dt_LC(info);
		else if (lc == columnDtl1_bill_basis_dt) doDtl1_bill_basis_dt_LC(info);
		else if (lc == columnDtl1_bill_crryovr_times) doDtl1_bill_crryovr_times_LC(info);
		else if (lc == columnDtl1_cst_itm_cd) doDtl1_cst_itm_cd_LC(info);
		else if (lc == columnDtl1_cst_itm_nm) doDtl1_cst_itm_nm_LC(info);
		else if (lc == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_LC(info);
		else if (lc == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_LC(info);
		else if (lc == columnDtl1_trd_dec_place) doDtl1_trd_dec_place_LC(info);
		else if (lc == columnDtl1_tax_cd) doDtl1_tax_cd_LC(info);
		else if (lc == columnDtl1_tax_nm) doDtl1_tax_nm_LC(info);
		else if (lc == columnDtl1_tax_rate) doDtl1_tax_rate_LC(info);
		else if (lc == columnDtl1_cst_cd) doDtl1_cst_cd_LC(info);
		else if (lc == columnDtl1_cst_nm) doDtl1_cst_nm_LC(info);
		else if (lc == columnDtl1_dlv_cd) doDtl1_dlv_cd_LC(info);
		else if (lc == columnDtl1_dlv_nm) doDtl1_dlv_nm_LC(info);
		else if (lc == columnDtl1_dest_cd1) doDtl1_dest_cd1_LC(info);
		else if (lc == columnDtl1_dest_nm1) doDtl1_dest_nm1_LC(info);
		else if (lc == columnDtl1_dest_cd2) doDtl1_dest_cd2_LC(info);
		else if (lc == columnDtl1_dest_nm2) doDtl1_dest_nm2_LC(info);
		else if (lc == columnDtl1_dest_cd3) doDtl1_dest_cd3_LC(info);
		else if (lc == columnDtl1_dest_nm3) doDtl1_dest_nm3_LC(info);
		else if (lc == columnDtl1_sls_usr_cd) doDtl1_sls_usr_cd_LC(info);
		else if (lc == columnDtl1_sls_usr_nm) doDtl1_sls_usr_nm_LC(info);
		else if (lc == columnDtl1_sls_dpt_cd) doDtl1_sls_dpt_cd_LC(info);
		else if (lc == columnDtl1_sls_dpt_nm) doDtl1_sls_dpt_nm_LC(info);
		else if (lc == columnDtl1_slo_no) doDtl1_slo_no_LC(info);
		else if (lc == columnDtl1_slo_d_no) doDtl1_slo_d_no_LC(info);
		else if (lc == columnDtl1_cst_po_no) doDtl1_cst_po_no_LC(info);
		else if (lc == columnDtl1_cst_po_d_no) doDtl1_cst_po_d_no_LC(info);
		else if (lc == columnDtl1_dlv_slip_no) doDtl1_dlv_slip_no_LC(info);
		else if (lc == columnDtl1_dlv_slip_d_no) doDtl1_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl1_ship_dlv_slip_no) doDtl1_ship_dlv_slip_no_LC(info);
		else if (lc == columnDtl1_ship_dlv_slip_d_no) doDtl1_ship_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_LC(info);
		else if (lc == columnDtl1_bill_d_no) doDtl1_bill_d_no_LC(info);
		else if (lc == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_LC(info);
		else if (lc == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_LC(info);
		else if (lc == columnDtl1_ins_func_id) doDtl1_ins_func_id_LC(info);
		else if (lc == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_LC(info);
		else if (lc == columnDtl1_ins_ts) doDtl1_ins_ts_LC(info);
		else if (lc == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_LC(info);
		else if (lc == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_LC(info);
		else if (lc == columnDtl1_upd_func_id) doDtl1_upd_func_id_LC(info);
		else if (lc == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_LC(info);
		else if (lc == columnDtl1_upd_ts) doDtl1_upd_ts_LC(info);
		else if (lc == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_LC(info);
		else if (lc == columnDtl1_upd_cntr) doDtl1_upd_cntr_LC(info);
		else if (lc == columnDtl1_dec_place) doDtl1_dec_place_LC(info);
		else if (lc == columnDtl1_bill_d_typ) doDtl1_bill_d_typ_LC(info);
		else if (lc == columnDtl1_bill_mng_no) doDtl1_bill_mng_no_LC(info);
		else if (lc == columnDtl2_ac_ym) doDtl2_ac_ym_LC(info);
		else if (lc == columnDtl2_ac_dt) doDtl2_ac_dt_LC(info);
		else if (lc == columnDtl2_slip_sts_typ) doDtl2_slip_sts_typ_LC(info);
		else if (lc == columnDtl2_slip_sts_typ_nm) doDtl2_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtl2_trd_cd) doDtl2_trd_cd_LC(info);
		else if (lc == columnDtl2_trd_nm) doDtl2_trd_nm_LC(info);
		else if (lc == columnDtl2_trd_ptn_typ) doDtl2_trd_ptn_typ_LC(info);
		else if (lc == columnDtl2_ar_typ) doDtl2_ar_typ_LC(info);
		else if (lc == columnDtl2_ar_typ_nm) doDtl2_ar_typ_nm_LC(info);
		else if (lc == columnDtl2_act_no) doDtl2_act_no_LC(info);
		else if (lc == columnDtl2_act_rev) doDtl2_act_rev_LC(info);
		else if (lc == columnDtl2_act_seq) doDtl2_act_seq_LC(info);
		else if (lc == columnDtl2_act_d_no) doDtl2_act_d_no_LC(info);
		else if (lc == columnDtl2_act_d_seq) doDtl2_act_d_seq_LC(info);
		else if (lc == columnDtl2_rcv_dt) doDtl2_rcv_dt_LC(info);
		else if (lc == columnDtl2_bill_basis_dt) doDtl2_bill_basis_dt_LC(info);
		else if (lc == columnDtl2_bill_crryovr_times) doDtl2_bill_crryovr_times_LC(info);
		else if (lc == columnDtl2_setoff_tax_cd) doDtl2_setoff_tax_cd_LC(info);
		else if (lc == columnDtl2_setoff_tax_nm) doDtl2_setoff_tax_nm_LC(info);
		else if (lc == columnDtl2_setoff_tax_rate) doDtl2_setoff_tax_rate_LC(info);
		else if (lc == columnDtl2_bill_d_rmrks) doDtl2_bill_d_rmrks_LC(info);
		else if (lc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_LC(info);
		else if (lc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_LC(info);
		else if (lc == columnDtl2_ins_func_id) doDtl2_ins_func_id_LC(info);
		else if (lc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_LC(info);
		else if (lc == columnDtl2_ins_ts) doDtl2_ins_ts_LC(info);
		else if (lc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_LC(info);
		else if (lc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_LC(info);
		else if (lc == columnDtl2_upd_func_id) doDtl2_upd_func_id_LC(info);
		else if (lc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_LC(info);
		else if (lc == columnDtl2_upd_ts) doDtl2_upd_ts_LC(info);
		else if (lc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_LC(info);
		else if (lc == columnDtl2_upd_cntr) doDtl2_upd_cntr_LC(info);
		else if (lc == columnDtl2_dec_place) doDtl2_dec_place_LC(info);
		else if (lc == columnDtl2_bill_d_no) doDtl2_bill_d_no_LC(info);
		else if (lc == columnDtl2_bill_d_typ) doDtl2_bill_d_typ_LC(info);
		else if (lc == columnDtl2_bill_mng_no) doDtl2_bill_mng_no_LC(info);
		else if (lc == columnDtl3_ac_ym) doDtl3_ac_ym_LC(info);
		else if (lc == columnDtl3_ac_dt) doDtl3_ac_dt_LC(info);
		else if (lc == columnDtl3_slip_sts_typ) doDtl3_slip_sts_typ_LC(info);
		else if (lc == columnDtl3_slip_sts_typ_nm) doDtl3_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtl3_trd_cd) doDtl3_trd_cd_LC(info);
		else if (lc == columnDtl3_trd_nm) doDtl3_trd_nm_LC(info);
		else if (lc == columnDtl3_trd_ptn_typ) doDtl3_trd_ptn_typ_LC(info);
		else if (lc == columnDtl3_rcv_act_no) doDtl3_rcv_act_no_LC(info);
		else if (lc == columnDtl3_rcv_act_seq) doDtl3_rcv_act_seq_LC(info);
		else if (lc == columnDtl3_rcv_act_rev) doDtl3_rcv_act_rev_LC(info);
		else if (lc == columnDtl3_rcv_act_d_no) doDtl3_rcv_act_d_no_LC(info);
		else if (lc == columnDtl3_rcv_act_d_seq) doDtl3_rcv_act_d_seq_LC(info);
		else if (lc == columnDtl3_rcv_dt) doDtl3_rcv_dt_LC(info);
		else if (lc == columnDtl3_setoff_tax_cd) doDtl3_setoff_tax_cd_LC(info);
		else if (lc == columnDtl3_setoff_tax_nm) doDtl3_setoff_tax_nm_LC(info);
		else if (lc == columnDtl3_setoff_tax_rate) doDtl3_setoff_tax_rate_LC(info);
		else if (lc == columnDtl3_ins_usr_id) doDtl3_ins_usr_id_LC(info);
		else if (lc == columnDtl3_ins_usr_nm) doDtl3_ins_usr_nm_LC(info);
		else if (lc == columnDtl3_ins_func_id) doDtl3_ins_func_id_LC(info);
		else if (lc == columnDtl3_ins_func_nm) doDtl3_ins_func_nm_LC(info);
		else if (lc == columnDtl3_ins_ts) doDtl3_ins_ts_LC(info);
		else if (lc == columnDtl3_upd_usr_id) doDtl3_upd_usr_id_LC(info);
		else if (lc == columnDtl3_upd_usr_nm) doDtl3_upd_usr_nm_LC(info);
		else if (lc == columnDtl3_upd_func_id) doDtl3_upd_func_id_LC(info);
		else if (lc == columnDtl3_upd_func_nm) doDtl3_upd_func_nm_LC(info);
		else if (lc == columnDtl3_upd_ts) doDtl3_upd_ts_LC(info);
		else if (lc == columnDtl3_upd_srv_req_no) doDtl3_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[bill_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[row_num]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_row_num_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_sls_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_sls_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ship_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ship_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_d_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_d_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bill_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bill_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[setoff_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_setoff_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_d_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_d_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bill_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bill_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[setoff_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_setoff_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_base_cur_cd]の作成メソッド
	 */
	public MCList getHdr_base_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0040.Srch01")) {
			return new MS_MSBGL0040_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0040.Upd01")) {
			return new MS_MSBGL0040_Upd01Bridge();
		}
		if (id.equals("MS.MSBGL0040.Del01")) {
			return new MS_MSBGL0040_Del01Bridge();
		}
		if (id.equals("MS.MSBGL0040.Prnt01")) {
			return new MS_MSBGL0040_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0040_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0040_Srch01Bridge() {
			p_MS_MSBGL0040_Srch01 = new MCParam(PDef.MS_MSBGL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0040.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl2R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl3R.class));

			p_MS_MSBGL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0040.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0040.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0040.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R>)down(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0040.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBG.MSBGP0040.Dtl2R>)down(2);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0040.Dtl3R> down3() {
			return (MCList<mcframe.clientMSBG.MSBGP0040.Dtl3R>)down(3);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0040_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0040.HdrR.create());
			p_MS_MSBGL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl1R.class));
			p_MS_MSBGL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl2R.class));
			p_MS_MSBGL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0040.Dtl3R.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0040_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0040.HdrR)p_MS_MSBGL0040_Srch01.getContainerParam().getDownBlock(0));
			setDtl1L((MCList<mcframe.clientMSBG.MSBGP0040.Dtl1R>)p_MS_MSBGL0040_Srch01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBG.MSBGP0040.Dtl2R>)p_MS_MSBGL0040_Srch01.getContainerParam().getDownBlock(2));
			setDtl3L((MCList<mcframe.clientMSBG.MSBGP0040.Dtl3R>)p_MS_MSBGL0040_Srch01.getContainerParam().getDownBlock(3));
		}

		protected void clear() {
			getHdrR().clear();
			getDtl1L().clear();
			getDtl2L().clear();
			getDtl3L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtl1L());
			result.add(getDtl2L());
			result.add(getDtl3L());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0040_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0040_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0040_Upd01;

		/** コンストラクタ */
		protected MS_MSBGL0040_Upd01Bridge() {
			p_MS_MSBGL0040_Upd01 = new MCParam(PDef.MS_MSBGL0040_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0040_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0040.RsltR.class));
			// Down

			p_MS_MSBGL0040_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0040_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0040_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0040_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0040_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBG.MSBGP0040.RsltR> up0() {
			return (MCList<mcframe.clientMSBG.MSBGP0040.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0040_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBGL0040_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0040_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0040_Del01;

		/** コンストラクタ */
		protected MS_MSBGL0040_Del01Bridge() {
			p_MS_MSBGL0040_Del01 = new MCParam(PDef.MS_MSBGL0040_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0040_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0040.HdrR.create());
			// Down

			p_MS_MSBGL0040_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0040_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0040_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0040_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0040_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0040.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0040.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0040_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBGL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0040_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0040_Prnt01;

		/** コンストラクタ */
		protected MS_MSBGL0040_Prnt01Bridge() {
			p_MS_MSBGL0040_Prnt01 = new MCParam(PDef.MS_MSBGL0040_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0040_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0040.HdrR.create());
			// Down

			p_MS_MSBGL0040_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0040_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0040_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0040_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0040_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0040.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0040.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0040_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}