package mcframe.clientMSBG.MSBGP0290;

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
import mcframe.clientMSBG.MSBGP0290.MSBGP_BillSaveHstSrch_MC.MS_MSBGL0290_Srch01Caller;

/**
 * 画面"MSBGP_BillSaveHstSrch"パネルクラスです。<p>
 *
 * 請求書の履歴を照会する<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_BillSaveHstSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0290";

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
	public MCLabel Cnd_bill_no_Label = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_no = null;
	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_bill_rev = null;
	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_latest_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
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
	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Hdr_latest_flg = null;
	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Hdr_can_flg = null;
	public MCLabel Hdr_bill_cl_dt_Label = null;
	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCDateField Hdr_bill_cl_dt = null;
	public MCLabel Hdr_bill_dt_Label = null;
	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public MCDateField Hdr_bill_dt = null;
	/**
	 * Billing at each sales flg. 売上都度請求ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Hdr_bill_each_sls_flg = null;
	public MCLabel Hdr_iv_no_Label = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_iv_no = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Hdr_wrk_no_p_PPanel;
	public MCTextField Hdr_wrk_no;	// [Hdr]の[wrk_no_p.wrk_no]を[Hdr_wrk_no]としてエイリアス定義。
	public MCTextField Hdr_wrk_nm;	// [Hdr]の[wrk_no_p.wrk_nm]を[Hdr_wrk_nm]としてエイリアス定義。
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
	public MCLabel Hdr_bill_xrate_Label = null;
	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCNumberField Hdr_bill_xrate = null;
	public MCLabel Hdr_trd_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
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
	public MCLabel Hdr_last_bill_amt_Label = null;
	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public MCNumberField Hdr_last_bill_amt = null;
	public MCLabel Hdr_rcv_amt_Label = null;
	/**
	 * Current payment received amount 今回入金額.<p>
	 *
	 */
	public MCNumberField Hdr_rcv_amt = null;
	public MCLabel Hdr_sw_amt_Label = null;
	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumberField Hdr_sw_amt = null;
	public MCLabel Hdr_bfw_amt_Label = null;
	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public MCNumberField Hdr_bfw_amt = null;
	public MCLabel Hdr_sls_amt_Label = null;
	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public MCNumberField Hdr_sls_amt = null;
	public MCLabel Hdr_dscnt_amt_Label = null;
	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumberField Hdr_dscnt_amt = null;
	public MCLabel Hdr_ret_amt_Label = null;
	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumberField Hdr_ret_amt = null;
	public MCLabel Hdr_setoff_amt_Label = null;
	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public MCNumberField Hdr_setoff_amt = null;
	public MCLabel Hdr_tax_amt_Label = null;
	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumberField Hdr_tax_amt = null;
	public MCLabel Hdr_sw_to_amt_Label = null;
	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public MCNumberField Hdr_sw_to_amt = null;
	public MCLabel Hdr_bill_amt_Label = null;
	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public MCNumberField Hdr_bill_amt = null;
	public MCLabel Hdr_adv_amt_bal_Label = null;
	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public MCNumberField Hdr_adv_amt_bal = null;
	public MCLabel Hdr_adv_amt_Label = null;
	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCNumberField Hdr_adv_amt = null;
	public MCLabel Hdr_adv_setoff_amt_Label = null;
	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public MCNumberField Hdr_adv_setoff_amt = null;
	public MCLabel Hdr_adv_setoff_tax_amt_Label = null;
	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public MCNumberField Hdr_adv_setoff_tax_amt = null;
	public MCLabel Hdr_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr_sub_char1 = null;
	public MCLabel Hdr_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr_sub_char2 = null;
	public MCLabel Hdr_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr_sub_char3 = null;
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
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public MCCheckBox Hdr_edi_flg = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [DtlSls]ブロック関連のField定義
	public MCPanel DtlSlsPanel = null;
	public MCTitledBorder DtlSlsTitledBorder = null;
	public MCScrollPane DtlSlsScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0290.DtlSlsR> DtlSlsTable = null;
	// [DtlSls]ブロックの項目のField定義
	/**
	 * Transaction 取引.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_nm = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_slip_sts_typ_nm = null;
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dlv_dt = null;
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_base_sls_ac_dt = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DtlSls_itm_p_PPanel;
	public MCColumnConfig columnDtlSls_itm_cd;// [DtlSls]の[itm_p.itm_cd]を[columnDtlSls_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_itm_sub1;// [DtlSls]の[itm_p.itm_sub1]を[columnDtlSls_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_itm_sub2;// [DtlSls]の[itm_p.itm_sub2]を[columnDtlSls_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_itm_sub3;// [DtlSls]の[itm_p.itm_sub3]を[columnDtlSls_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtlSls_itm_nm;// [DtlSls]の[itm_p.itm_nm]を[columnDtlSls_itm_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sundry_itm_flg = null;
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
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_unit_qty = null;
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
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_inc_tax_flg = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_tax_rate = null;
	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_interim_flg = null;
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_cur_upri = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_cur_amt = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_cur_tax_amt = null;
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_cur_inc_tax_amt = null;
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_cur_dscnt_amt = null;
	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_base_cur_upri = null;
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_base_cur_amt = null;
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_base_cur_tax_amt = null;
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_base_cur_inc_tax_amt = null;
	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_base_cur_dscnt_amt = null;
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
	public MCColumnConfig columnDtlSls_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_dlv_nm = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_trd_d_rmrks = null;
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
	 * Multiple delivery note details at shipping flg. 出荷時納品書明細複数ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ship_dlv_slip_multi_flg = null;
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
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_act_no = null;
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_act_seq = null;
	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_act_rev = null;
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_act_d_no = null;
	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sls_act_d_seq = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_upd_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSls_upd_srv_req_no = null;
	// [DtlPanel]ブロック関連のField定義
	public MCPanel DtlPanelPanel = null;
	// [DtlPanel]ブロックの項目のField定義
	// [DtlRcv]ブロック関連のField定義
	public MCPanel DtlRcvPanel = null;
	public MCTitledBorder DtlRcvTitledBorder = null;
	public MCScrollPane DtlRcvScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0290.DtlRcvR> DtlRcvTable = null;
	// [DtlRcv]ブロックの項目のField定義
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_rcv_act_no = null;
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_rcv_act_seq = null;
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_rcv_act_rev = null;
	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_rcv_act_d_no = null;
	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_rcv_act_d_seq = null;
	/**
	 * Transaction 取引.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_trd_nm = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_slip_sts_typ_nm = null;
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
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_rcv_dt = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_tax_nm = null;
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_inc_tax_flg = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_tax_rate = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_trd_cur_amt = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_trd_cur_tax_amt = null;
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_trd_cur_inc_tax_amt = null;
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_base_cur_amt = null;
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_base_cur_tax_amt = null;
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_base_cur_inc_tax_amt = null;
	/**
	 * Invoice details remarks 請求書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_bill_d_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_upd_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlRcv_upd_srv_req_no = null;
	// [DtlAdv]ブロック関連のField定義
	public MCPanel DtlAdvPanel = null;
	public MCTitledBorder DtlAdvTitledBorder = null;
	public MCScrollPane DtlAdvScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0290.DtlAdvR> DtlAdvTable = null;
	// [DtlAdv]ブロックの項目のField定義
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
	 * Transaction 取引.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_trd_nm = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_slip_sts_typ_nm = null;
	/**
	 * Payment received method 入金方法.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_mtd_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_mtd_nm = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_rcv_dt = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_tax_nm = null;
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_inc_tax_flg = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_tax_rate = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_trd_cur_amt = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_trd_cur_tax_amt = null;
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_trd_cur_inc_tax_amt = null;
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_base_cur_amt = null;
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_base_cur_tax_amt = null;
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_base_cur_inc_tax_amt = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_upd_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdv_upd_srv_req_no = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MS_MSBGL0290_Srch01]のCallerの作成 */
	protected MSBGP_BillSaveHstSrch_MC.MS_MSBGL0290_Srch01Caller createMS_MSBGL0290_Srch01() {
		MSBGP_BillSaveHstSrch_MC.MS_MSBGL0290_Srch01Caller<MSBGP_BillSaveHstSrch, MS_MSBGL0290_Srch01Bridge>
		caller = ((MSBGP_BillSaveHstSrch_MC)this).new MS_MSBGL0290_Srch01Caller<MSBGP_BillSaveHstSrch, MS_MSBGL0290_Srch01Bridge>(
					(MSBGP_BillSaveHstSrch)this, new MS_MSBGL0290_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0290_Srch01]の呼び出し */
	protected void callMS_MSBGL0290_Srch01() {
		MCCaller caller = createMS_MSBGL0290_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0290.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0290.HdrR aHdrR;
	/** [DtlSls]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0290.DtlSlsR> aDtlSlsL;
	/** [DtlRcv]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0290.DtlRcvR> aDtlRcvL;
	/** [DtlAdv]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0290.DtlAdvR> aDtlAdvL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0290.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0290.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0290.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0290.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBG.MSBGP0290.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0290.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0290.HdrR createHdrR() {
		return mcframe.clientMSBG.MSBGP0290.HdrR.create();
	}

	/**
	 * コピーによってaDtlSlsLを設定します。
	 *
	 * aDtlSlsLのインスタンスは変更されません。
	 *
	 * @param dataset DtlSlsL
	 */
	public void setDtlSlsL(MCList<mcframe.clientMSBG.MSBGP0290.DtlSlsR> aList) {
		if (getDtlSlsL() != aList) {
			getDtlSlsL().setAll(aList);
		}
	}

	/**
	 * [DtlSls]ブロックのコンテナaDtlSlsLを返します。
	 *
	 * @return DtlSlsL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0290.DtlSlsR> getDtlSlsL() {
		return aDtlSlsL;
	}

	/**
	 * aDtlSlsRを作成します。
	 *
	 * @return DtlSlsR
	 */
	public mcframe.clientMSBG.MSBGP0290.DtlSlsR createDtlSlsR() {
		return mcframe.clientMSBG.MSBGP0290.DtlSlsR.create();
	}

	/**
	 * aDtlSlsLを作成します。
	 *
	 * @return DtlSlsL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0290.DtlSlsR> createDtlSlsL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0290.DtlSlsR.class);
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
	 * コピーによってaDtlRcvLを設定します。
	 *
	 * aDtlRcvLのインスタンスは変更されません。
	 *
	 * @param dataset DtlRcvL
	 */
	public void setDtlRcvL(MCList<mcframe.clientMSBG.MSBGP0290.DtlRcvR> aList) {
		if (getDtlRcvL() != aList) {
			getDtlRcvL().setAll(aList);
		}
	}

	/**
	 * [DtlRcv]ブロックのコンテナaDtlRcvLを返します。
	 *
	 * @return DtlRcvL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0290.DtlRcvR> getDtlRcvL() {
		return aDtlRcvL;
	}

	/**
	 * aDtlRcvRを作成します。
	 *
	 * @return DtlRcvR
	 */
	public mcframe.clientMSBG.MSBGP0290.DtlRcvR createDtlRcvR() {
		return mcframe.clientMSBG.MSBGP0290.DtlRcvR.create();
	}

	/**
	 * aDtlRcvLを作成します。
	 *
	 * @return DtlRcvL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0290.DtlRcvR> createDtlRcvL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0290.DtlRcvR.class);
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
	public void setDtlAdvL(MCList<mcframe.clientMSBG.MSBGP0290.DtlAdvR> aList) {
		if (getDtlAdvL() != aList) {
			getDtlAdvL().setAll(aList);
		}
	}

	/**
	 * [DtlAdv]ブロックのコンテナaDtlAdvLを返します。
	 *
	 * @return DtlAdvL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0290.DtlAdvR> getDtlAdvL() {
		return aDtlAdvL;
	}

	/**
	 * aDtlAdvRを作成します。
	 *
	 * @return DtlAdvR
	 */
	public mcframe.clientMSBG.MSBGP0290.DtlAdvR createDtlAdvR() {
		return mcframe.clientMSBG.MSBGP0290.DtlAdvR.create();
	}

	/**
	 * aDtlAdvLを作成します。
	 *
	 * @return DtlAdvL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0290.DtlAdvR> createDtlAdvL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0290.DtlAdvR.class);
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
		ret.add(HdrTabPanel);
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(DtlSlsPanel);
		ret.add(DtlPanelPanel);
		ret.add(DtlRcvPanel);
		ret.add(DtlAdvPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillSaveHstSrch_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlSlsL = createDtlSlsL();
		aDtlRcvL = createDtlRcvL();
		aDtlAdvL = createDtlAdvL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_BillSaveHstSrch_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlSlsL = createDtlSlsL();
		createDtlSlsTable();
		DtlSlsTable.setRowName(name);
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
		MSBGP_BillSaveHstSrch_MC.jbCreateCnd((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbCreateHdrTab((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbCreateHdr((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbCreateHdr2((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbCreateDtlSls((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbCreateDtlPanel((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbCreateDtlRcv((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbCreateDtlAdv((MSBGP_BillSaveHstSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_BillSaveHstSrch p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBGP_BillSaveHstSrch p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBGP_BillSaveHstSrch p) {
		p.Hdr_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getHdrR().wrk_no_p());
		p.Hdr_wrk_no_p_PPanel.setName("Hdr.wrk_no_p");
		p.Hdr_wrk_no = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Hdr_wrk_no.addAliasName("Hdr.wrk_no", p);
		p.Hdr_wrk_nm = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Hdr_wrk_nm.addAliasName("Hdr.wrk_nm", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBGP_BillSaveHstSrch p) {
	}

	/**
	 * [DtlSls]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlSls(MSBGP_BillSaveHstSrch p) {
		p.DtlSls_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBG.MSBGP0290.DtlSlsR.$itm_p);
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
	}

	/**
	 * [DtlPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlPanel(MSBGP_BillSaveHstSrch p) {
	}

	/**
	 * [DtlRcv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlRcv(MSBGP_BillSaveHstSrch p) {
	}

	/**
	 * [DtlAdv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlAdv(MSBGP_BillSaveHstSrch p) {
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
	public static MSBGP_BillSaveHstSrch create(){
		MSBGP_BillSaveHstSrch p = new MSBGP_BillSaveHstSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_BillSaveHstSrch create(String name){
		MSBGP_BillSaveHstSrch p = new MSBGP_BillSaveHstSrch(name);
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
		MSBGP_BillSaveHstSrch_MC.jbfInitCnd((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbfInitHdrTab((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbfInitHdr((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbfInitHdr2((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbfInitDtlSls((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbfInitDtlPanel((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbfInitDtlRcv((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbfInitDtlAdv((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbInitCnd((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbInitHdrTab((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbInitHdr((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbInitHdr2((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbInitDtlSls((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbInitDtlPanel((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbInitDtlRcv((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.jbInitDtlAdv((MSBGP_BillSaveHstSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_bill_no_Label = p.beansFactory.createLabel("Cnd.bill_no_Label");
		p.Cnd_bill_no = p.beansFactory.createTextField("Cnd.bill_no");
		p.Cnd_bill_no.setLabel(p.Cnd_bill_no_Label);
		p.Cnd_bill_rev = p.beansFactory.createNumberField("Cnd.bill_rev");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_bill_no_Label = p.beansFactory.createLabel("Hdr.bill_no_Label");
		p.Hdr_bill_no = p.beansFactory.createTextField("Hdr.bill_no");
		p.Hdr_bill_no.setLabel(p.Hdr_bill_no_Label);
		p.Hdr_bill_rev = p.beansFactory.createNumberField("Hdr.bill_rev");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_bill_cl_dt_Label = p.beansFactory.createLabel("Hdr.bill_cl_dt_Label");
		p.Hdr_bill_cl_dt = p.beansFactory.createDateField("Hdr.bill_cl_dt");
		p.Hdr_bill_cl_dt.setLabel(p.Hdr_bill_cl_dt_Label);
		p.Hdr_bill_dt_Label = p.beansFactory.createLabel("Hdr.bill_dt_Label");
		p.Hdr_bill_dt = p.beansFactory.createDateField("Hdr.bill_dt");
		p.Hdr_bill_dt.setLabel(p.Hdr_bill_dt_Label);
		p.Hdr_bill_each_sls_flg = p.beansFactory.createCheckBox("Hdr.bill_each_sls_flg");
		p.Hdr_iv_no_Label = p.beansFactory.createLabel("Hdr.iv_no_Label");
		p.Hdr_iv_no = p.beansFactory.createTextField("Hdr.iv_no");
		p.Hdr_iv_no.setLabel(p.Hdr_iv_no_Label);
		p.Hdr_bcst_cd_Label = p.beansFactory.createLabel("Hdr.bcst_cd_Label");
		p.Hdr_bcst_cd = p.beansFactory.createTextField("Hdr.bcst_cd");
		p.Hdr_bcst_cd.setLabel(p.Hdr_bcst_cd_Label);
		p.Hdr_bcst_nm = p.beansFactory.createTextField("Hdr.bcst_nm");
		p.Hdr_bill_dpt_cd_Label = p.beansFactory.createLabel("Hdr.bill_dpt_cd_Label");
		p.Hdr_bill_dpt_cd = p.beansFactory.createTextField("Hdr.bill_dpt_cd");
		p.Hdr_bill_dpt_cd.setLabel(p.Hdr_bill_dpt_cd_Label);
		p.Hdr_bill_dpt_nm = p.beansFactory.createTextField("Hdr.bill_dpt_nm");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_bill_xrate_Label = p.beansFactory.createLabel("Hdr.bill_xrate_Label");
		p.Hdr_bill_xrate = p.beansFactory.createNumberField("Hdr.bill_xrate");
		p.Hdr_bill_xrate.setLabel(p.Hdr_bill_xrate_Label);
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextField("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
		p.Hdr_last_bill_amt_Label = p.beansFactory.createLabel("Hdr.last_bill_amt_Label");
		p.Hdr_last_bill_amt = p.beansFactory.createNumberField("Hdr.last_bill_amt");
		p.Hdr_last_bill_amt.setLabel(p.Hdr_last_bill_amt_Label);
		p.Hdr_rcv_amt_Label = p.beansFactory.createLabel("Hdr.rcv_amt_Label");
		p.Hdr_rcv_amt = p.beansFactory.createNumberField("Hdr.rcv_amt");
		p.Hdr_rcv_amt.setLabel(p.Hdr_rcv_amt_Label);
		p.Hdr_sw_amt_Label = p.beansFactory.createLabel("Hdr.sw_amt_Label");
		p.Hdr_sw_amt = p.beansFactory.createNumberField("Hdr.sw_amt");
		p.Hdr_sw_amt.setLabel(p.Hdr_sw_amt_Label);
		p.Hdr_bfw_amt_Label = p.beansFactory.createLabel("Hdr.bfw_amt_Label");
		p.Hdr_bfw_amt = p.beansFactory.createNumberField("Hdr.bfw_amt");
		p.Hdr_bfw_amt.setLabel(p.Hdr_bfw_amt_Label);
		p.Hdr_sls_amt_Label = p.beansFactory.createLabel("Hdr.sls_amt_Label");
		p.Hdr_sls_amt = p.beansFactory.createNumberField("Hdr.sls_amt");
		p.Hdr_sls_amt.setLabel(p.Hdr_sls_amt_Label);
		p.Hdr_dscnt_amt_Label = p.beansFactory.createLabel("Hdr.dscnt_amt_Label");
		p.Hdr_dscnt_amt = p.beansFactory.createNumberField("Hdr.dscnt_amt");
		p.Hdr_dscnt_amt.setLabel(p.Hdr_dscnt_amt_Label);
		p.Hdr_ret_amt_Label = p.beansFactory.createLabel("Hdr.ret_amt_Label");
		p.Hdr_ret_amt = p.beansFactory.createNumberField("Hdr.ret_amt");
		p.Hdr_ret_amt.setLabel(p.Hdr_ret_amt_Label);
		p.Hdr_setoff_amt_Label = p.beansFactory.createLabel("Hdr.setoff_amt_Label");
		p.Hdr_setoff_amt = p.beansFactory.createNumberField("Hdr.setoff_amt");
		p.Hdr_setoff_amt.setLabel(p.Hdr_setoff_amt_Label);
		p.Hdr_tax_amt_Label = p.beansFactory.createLabel("Hdr.tax_amt_Label");
		p.Hdr_tax_amt = p.beansFactory.createNumberField("Hdr.tax_amt");
		p.Hdr_tax_amt.setLabel(p.Hdr_tax_amt_Label);
		p.Hdr_sw_to_amt_Label = p.beansFactory.createLabel("Hdr.sw_to_amt_Label");
		p.Hdr_sw_to_amt = p.beansFactory.createNumberField("Hdr.sw_to_amt");
		p.Hdr_sw_to_amt.setLabel(p.Hdr_sw_to_amt_Label);
		p.Hdr_bill_amt_Label = p.beansFactory.createLabel("Hdr.bill_amt_Label");
		p.Hdr_bill_amt = p.beansFactory.createNumberField("Hdr.bill_amt");
		p.Hdr_bill_amt.setLabel(p.Hdr_bill_amt_Label);
		p.Hdr_adv_amt_bal_Label = p.beansFactory.createLabel("Hdr.adv_amt_bal_Label");
		p.Hdr_adv_amt_bal = p.beansFactory.createNumberField("Hdr.adv_amt_bal");
		p.Hdr_adv_amt_bal.setLabel(p.Hdr_adv_amt_bal_Label);
		p.Hdr_adv_amt_Label = p.beansFactory.createLabel("Hdr.adv_amt_Label");
		p.Hdr_adv_amt = p.beansFactory.createNumberField("Hdr.adv_amt");
		p.Hdr_adv_amt.setLabel(p.Hdr_adv_amt_Label);
		p.Hdr_adv_setoff_amt_Label = p.beansFactory.createLabel("Hdr.adv_setoff_amt_Label");
		p.Hdr_adv_setoff_amt = p.beansFactory.createNumberField("Hdr.adv_setoff_amt");
		p.Hdr_adv_setoff_amt.setLabel(p.Hdr_adv_setoff_amt_Label);
		p.Hdr_adv_setoff_tax_amt_Label = p.beansFactory.createLabel("Hdr.adv_setoff_tax_amt_Label");
		p.Hdr_adv_setoff_tax_amt = p.beansFactory.createNumberField("Hdr.adv_setoff_tax_amt");
		p.Hdr_adv_setoff_tax_amt.setLabel(p.Hdr_adv_setoff_tax_amt_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
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
		p.Hdr_edi_flg = p.beansFactory.createCheckBox("Hdr.edi_flg");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSls]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlSls(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlSlsPanel = p.beansFactory.createPanel("DtlSls");
		p.DtlSlsTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlSlsScrollPane = p.beansFactory.createScrollPane("DtlSls.scroll");
		p.createDtlSlsTable();
		// ブロックの項目の初期化
		p.columnDtlSls_trd_cd = p.beansFactory.createTableColumn("DtlSls.trd_cd", MCColumnType.TEXT);
		p.columnDtlSls_trd_nm = p.beansFactory.createTableColumn("DtlSls.trd_nm", MCColumnType.TEXT);
		p.columnDtlSls_slip_sts_typ = p.beansFactory.createTableColumn("DtlSls.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtlSls_slip_sts_typ_nm = p.beansFactory.createTableColumn("DtlSls.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtlSls_dlv_dt = p.beansFactory.createTableColumn("DtlSls.dlv_dt", MCColumnType.DATE);
		p.columnDtlSls_base_sls_ac_dt = p.beansFactory.createTableColumn("DtlSls.base_sls_ac_dt", MCColumnType.DATE);
		p.columnDtlSls_sundry_itm_flg = p.beansFactory.createTableColumn("DtlSls.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtlSls_cst_itm_cd = p.beansFactory.createTableColumn("DtlSls.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtlSls_cst_itm_nm = p.beansFactory.createTableColumn("DtlSls.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtlSls_trd_unit_cd = p.beansFactory.createTableColumn("DtlSls.trd_unit_cd", MCColumnType.TEXT);
		p.columnDtlSls_trd_unit_nm = p.beansFactory.createTableColumn("DtlSls.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtlSls_trd_unit_qty = p.beansFactory.createTableColumn("DtlSls.trd_unit_qty", MCColumnType.NUMBER);
		p.columnDtlSls_tax_cd = p.beansFactory.createTableColumn("DtlSls.tax_cd", MCColumnType.TEXT);
		p.columnDtlSls_tax_nm = p.beansFactory.createTableColumn("DtlSls.tax_nm", MCColumnType.TEXT);
		p.columnDtlSls_inc_tax_flg = p.beansFactory.createTableColumn("DtlSls.inc_tax_flg", MCColumnType.CHECK);
		p.columnDtlSls_tax_rate = p.beansFactory.createTableColumn("DtlSls.tax_rate", MCColumnType.NUMBER);
		p.columnDtlSls_interim_flg = p.beansFactory.createTableColumn("DtlSls.interim_flg", MCColumnType.CHECK);
		p.columnDtlSls_trd_cur_upri = p.beansFactory.createTableColumn("DtlSls.trd_cur_upri", MCColumnType.NUMBER);
		p.columnDtlSls_trd_cur_amt = p.beansFactory.createTableColumn("DtlSls.trd_cur_amt", MCColumnType.NUMBER);
		p.columnDtlSls_trd_cur_tax_amt = p.beansFactory.createTableColumn("DtlSls.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlSls_trd_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlSls.trd_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlSls_trd_cur_dscnt_amt = p.beansFactory.createTableColumn("DtlSls.trd_cur_dscnt_amt", MCColumnType.NUMBER);
		p.columnDtlSls_base_cur_upri = p.beansFactory.createTableColumn("DtlSls.base_cur_upri", MCColumnType.NUMBER);
		p.columnDtlSls_base_cur_amt = p.beansFactory.createTableColumn("DtlSls.base_cur_amt", MCColumnType.NUMBER);
		p.columnDtlSls_base_cur_tax_amt = p.beansFactory.createTableColumn("DtlSls.base_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlSls_base_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlSls.base_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlSls_base_cur_dscnt_amt = p.beansFactory.createTableColumn("DtlSls.base_cur_dscnt_amt", MCColumnType.NUMBER);
		p.columnDtlSls_cst_cd = p.beansFactory.createTableColumn("DtlSls.cst_cd", MCColumnType.TEXT);
		p.columnDtlSls_cst_nm = p.beansFactory.createTableColumn("DtlSls.cst_nm", MCColumnType.TEXT);
		p.columnDtlSls_dlv_cd = p.beansFactory.createTableColumn("DtlSls.dlv_cd", MCColumnType.TEXT);
		p.columnDtlSls_dlv_nm = p.beansFactory.createTableColumn("DtlSls.dlv_nm", MCColumnType.TEXT);
		p.columnDtlSls_trd_d_rmrks = p.beansFactory.createTableColumn("DtlSls.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtlSls_dlv_slip_no = p.beansFactory.createTableColumn("DtlSls.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtlSls_dlv_slip_d_no = p.beansFactory.createTableColumn("DtlSls.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtlSls_ship_dlv_slip_no = p.beansFactory.createTableColumn("DtlSls.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtlSls_ship_dlv_slip_d_no = p.beansFactory.createTableColumn("DtlSls.ship_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtlSls_ship_dlv_slip_multi_flg = p.beansFactory.createTableColumn("DtlSls.ship_dlv_slip_multi_flg", MCColumnType.CHECK);
		p.columnDtlSls_bill_mtd_typ = p.beansFactory.createTableColumn("DtlSls.bill_mtd_typ", MCColumnType.TEXT);
		p.columnDtlSls_bill_mtd_typ_nm = p.beansFactory.createTableColumn("DtlSls.bill_mtd_typ_nm", MCColumnType.TEXT);
		p.columnDtlSls_sls_act_no = p.beansFactory.createTableColumn("DtlSls.sls_act_no", MCColumnType.TEXT);
		p.columnDtlSls_sls_act_seq = p.beansFactory.createTableColumn("DtlSls.sls_act_seq", MCColumnType.NUMBER);
		p.columnDtlSls_sls_act_rev = p.beansFactory.createTableColumn("DtlSls.sls_act_rev", MCColumnType.NUMBER);
		p.columnDtlSls_sls_act_d_no = p.beansFactory.createTableColumn("DtlSls.sls_act_d_no", MCColumnType.TEXT);
		p.columnDtlSls_sls_act_d_seq = p.beansFactory.createTableColumn("DtlSls.sls_act_d_seq", MCColumnType.NUMBER);
		p.columnDtlSls_sub_char1 = p.beansFactory.createTableColumn("DtlSls.sub_char1", MCColumnType.TEXT);
		p.columnDtlSls_sub_char2 = p.beansFactory.createTableColumn("DtlSls.sub_char2", MCColumnType.TEXT);
		p.columnDtlSls_sub_char3 = p.beansFactory.createTableColumn("DtlSls.sub_char3", MCColumnType.TEXT);
		p.columnDtlSls_ins_usr_id = p.beansFactory.createTableColumn("DtlSls.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlSls_ins_usr_nm = p.beansFactory.createTableColumn("DtlSls.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlSls_ins_func_id = p.beansFactory.createTableColumn("DtlSls.ins_func_id", MCColumnType.TEXT);
		p.columnDtlSls_ins_func_nm = p.beansFactory.createTableColumn("DtlSls.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlSls_upd_usr_id = p.beansFactory.createTableColumn("DtlSls.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlSls_upd_usr_nm = p.beansFactory.createTableColumn("DtlSls.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlSls_upd_func_id = p.beansFactory.createTableColumn("DtlSls.upd_func_id", MCColumnType.TEXT);
		p.columnDtlSls_upd_func_nm = p.beansFactory.createTableColumn("DtlSls.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlSls_ins_ts = p.beansFactory.createTableColumn("DtlSls.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlSls_upd_ts = p.beansFactory.createTableColumn("DtlSls.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlSls_upd_srv_req_no = p.beansFactory.createTableColumn("DtlSls.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [DtlPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlPanel(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlPanelPanel = p.beansFactory.createPanel("DtlPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlRcv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlRcv(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlRcvPanel = p.beansFactory.createPanel("DtlRcv");
		p.DtlRcvTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlRcvScrollPane = p.beansFactory.createScrollPane("DtlRcv.scroll");
		p.createDtlRcvTable();
		// ブロックの項目の初期化
		p.columnDtlRcv_rcv_act_no = p.beansFactory.createTableColumn("DtlRcv.rcv_act_no", MCColumnType.TEXT);
		p.columnDtlRcv_rcv_act_seq = p.beansFactory.createTableColumn("DtlRcv.rcv_act_seq", MCColumnType.NUMBER);
		p.columnDtlRcv_rcv_act_rev = p.beansFactory.createTableColumn("DtlRcv.rcv_act_rev", MCColumnType.NUMBER);
		p.columnDtlRcv_rcv_act_d_no = p.beansFactory.createTableColumn("DtlRcv.rcv_act_d_no", MCColumnType.TEXT);
		p.columnDtlRcv_rcv_act_d_seq = p.beansFactory.createTableColumn("DtlRcv.rcv_act_d_seq", MCColumnType.NUMBER);
		p.columnDtlRcv_trd_cd = p.beansFactory.createTableColumn("DtlRcv.trd_cd", MCColumnType.TEXT);
		p.columnDtlRcv_trd_nm = p.beansFactory.createTableColumn("DtlRcv.trd_nm", MCColumnType.TEXT);
		p.columnDtlRcv_slip_sts_typ = p.beansFactory.createTableColumn("DtlRcv.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtlRcv_slip_sts_typ_nm = p.beansFactory.createTableColumn("DtlRcv.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtlRcv_rcv_mtd_cd = p.beansFactory.createTableColumn("DtlRcv.rcv_mtd_cd", MCColumnType.TEXT);
		p.columnDtlRcv_rcv_mtd_nm = p.beansFactory.createTableColumn("DtlRcv.rcv_mtd_nm", MCColumnType.TEXT);
		p.columnDtlRcv_rcv_dt = p.beansFactory.createTableColumn("DtlRcv.rcv_dt", MCColumnType.DATE);
		p.columnDtlRcv_tax_cd = p.beansFactory.createTableColumn("DtlRcv.tax_cd", MCColumnType.TEXT);
		p.columnDtlRcv_tax_nm = p.beansFactory.createTableColumn("DtlRcv.tax_nm", MCColumnType.TEXT);
		p.columnDtlRcv_inc_tax_flg = p.beansFactory.createTableColumn("DtlRcv.inc_tax_flg", MCColumnType.CHECK);
		p.columnDtlRcv_tax_rate = p.beansFactory.createTableColumn("DtlRcv.tax_rate", MCColumnType.NUMBER);
		p.columnDtlRcv_trd_cur_amt = p.beansFactory.createTableColumn("DtlRcv.trd_cur_amt", MCColumnType.NUMBER);
		p.columnDtlRcv_trd_cur_tax_amt = p.beansFactory.createTableColumn("DtlRcv.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlRcv_trd_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlRcv.trd_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlRcv_base_cur_amt = p.beansFactory.createTableColumn("DtlRcv.base_cur_amt", MCColumnType.NUMBER);
		p.columnDtlRcv_base_cur_tax_amt = p.beansFactory.createTableColumn("DtlRcv.base_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlRcv_base_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlRcv.base_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlRcv_bill_d_rmrks = p.beansFactory.createTableColumn("DtlRcv.bill_d_rmrks", MCColumnType.TEXT);
		p.columnDtlRcv_sub_char1 = p.beansFactory.createTableColumn("DtlRcv.sub_char1", MCColumnType.TEXT);
		p.columnDtlRcv_sub_char2 = p.beansFactory.createTableColumn("DtlRcv.sub_char2", MCColumnType.TEXT);
		p.columnDtlRcv_sub_char3 = p.beansFactory.createTableColumn("DtlRcv.sub_char3", MCColumnType.TEXT);
		p.columnDtlRcv_ins_usr_id = p.beansFactory.createTableColumn("DtlRcv.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlRcv_ins_usr_nm = p.beansFactory.createTableColumn("DtlRcv.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlRcv_ins_func_id = p.beansFactory.createTableColumn("DtlRcv.ins_func_id", MCColumnType.TEXT);
		p.columnDtlRcv_ins_func_nm = p.beansFactory.createTableColumn("DtlRcv.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlRcv_upd_usr_id = p.beansFactory.createTableColumn("DtlRcv.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlRcv_upd_usr_nm = p.beansFactory.createTableColumn("DtlRcv.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlRcv_upd_func_id = p.beansFactory.createTableColumn("DtlRcv.upd_func_id", MCColumnType.TEXT);
		p.columnDtlRcv_upd_func_nm = p.beansFactory.createTableColumn("DtlRcv.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlRcv_ins_ts = p.beansFactory.createTableColumn("DtlRcv.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlRcv_upd_ts = p.beansFactory.createTableColumn("DtlRcv.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlRcv_upd_srv_req_no = p.beansFactory.createTableColumn("DtlRcv.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [DtlAdv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlAdv(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlAdvPanel = p.beansFactory.createPanel("DtlAdv");
		p.DtlAdvTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlAdvScrollPane = p.beansFactory.createScrollPane("DtlAdv.scroll");
		p.createDtlAdvTable();
		// ブロックの項目の初期化
		p.columnDtlAdv_rcv_act_no = p.beansFactory.createTableColumn("DtlAdv.rcv_act_no", MCColumnType.TEXT);
		p.columnDtlAdv_rcv_act_seq = p.beansFactory.createTableColumn("DtlAdv.rcv_act_seq", MCColumnType.NUMBER);
		p.columnDtlAdv_rcv_act_rev = p.beansFactory.createTableColumn("DtlAdv.rcv_act_rev", MCColumnType.NUMBER);
		p.columnDtlAdv_rcv_act_d_no = p.beansFactory.createTableColumn("DtlAdv.rcv_act_d_no", MCColumnType.TEXT);
		p.columnDtlAdv_rcv_act_d_seq = p.beansFactory.createTableColumn("DtlAdv.rcv_act_d_seq", MCColumnType.NUMBER);
		p.columnDtlAdv_trd_cd = p.beansFactory.createTableColumn("DtlAdv.trd_cd", MCColumnType.TEXT);
		p.columnDtlAdv_trd_nm = p.beansFactory.createTableColumn("DtlAdv.trd_nm", MCColumnType.TEXT);
		p.columnDtlAdv_slip_sts_typ = p.beansFactory.createTableColumn("DtlAdv.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtlAdv_slip_sts_typ_nm = p.beansFactory.createTableColumn("DtlAdv.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtlAdv_rcv_mtd_cd = p.beansFactory.createTableColumn("DtlAdv.rcv_mtd_cd", MCColumnType.TEXT);
		p.columnDtlAdv_rcv_mtd_nm = p.beansFactory.createTableColumn("DtlAdv.rcv_mtd_nm", MCColumnType.TEXT);
		p.columnDtlAdv_rcv_dt = p.beansFactory.createTableColumn("DtlAdv.rcv_dt", MCColumnType.DATE);
		p.columnDtlAdv_tax_cd = p.beansFactory.createTableColumn("DtlAdv.tax_cd", MCColumnType.TEXT);
		p.columnDtlAdv_tax_nm = p.beansFactory.createTableColumn("DtlAdv.tax_nm", MCColumnType.TEXT);
		p.columnDtlAdv_inc_tax_flg = p.beansFactory.createTableColumn("DtlAdv.inc_tax_flg", MCColumnType.CHECK);
		p.columnDtlAdv_tax_rate = p.beansFactory.createTableColumn("DtlAdv.tax_rate", MCColumnType.NUMBER);
		p.columnDtlAdv_trd_cur_amt = p.beansFactory.createTableColumn("DtlAdv.trd_cur_amt", MCColumnType.NUMBER);
		p.columnDtlAdv_trd_cur_tax_amt = p.beansFactory.createTableColumn("DtlAdv.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAdv_trd_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlAdv.trd_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAdv_base_cur_amt = p.beansFactory.createTableColumn("DtlAdv.base_cur_amt", MCColumnType.NUMBER);
		p.columnDtlAdv_base_cur_tax_amt = p.beansFactory.createTableColumn("DtlAdv.base_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAdv_base_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlAdv.base_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAdv_sub_char1 = p.beansFactory.createTableColumn("DtlAdv.sub_char1", MCColumnType.TEXT);
		p.columnDtlAdv_sub_char2 = p.beansFactory.createTableColumn("DtlAdv.sub_char2", MCColumnType.TEXT);
		p.columnDtlAdv_sub_char3 = p.beansFactory.createTableColumn("DtlAdv.sub_char3", MCColumnType.TEXT);
		p.columnDtlAdv_ins_usr_id = p.beansFactory.createTableColumn("DtlAdv.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlAdv_ins_usr_nm = p.beansFactory.createTableColumn("DtlAdv.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlAdv_ins_func_id = p.beansFactory.createTableColumn("DtlAdv.ins_func_id", MCColumnType.TEXT);
		p.columnDtlAdv_ins_func_nm = p.beansFactory.createTableColumn("DtlAdv.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlAdv_upd_usr_id = p.beansFactory.createTableColumn("DtlAdv.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlAdv_upd_usr_nm = p.beansFactory.createTableColumn("DtlAdv.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlAdv_upd_func_id = p.beansFactory.createTableColumn("DtlAdv.upd_func_id", MCColumnType.TEXT);
		p.columnDtlAdv_upd_func_nm = p.beansFactory.createTableColumn("DtlAdv.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlAdv_ins_ts = p.beansFactory.createTableColumn("DtlAdv.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlAdv_upd_ts = p.beansFactory.createTableColumn("DtlAdv.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlAdv_upd_srv_req_no = p.beansFactory.createTableColumn("DtlAdv.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_bill_no_Label);
		p.CndPanel.add(p.Cnd_bill_no);
		p.CndPanel.setLastBeans(p.Cnd_bill_no);
		p.Cnd_bill_no.setNextBeans(p.Cnd_bill_rev);
		p.Cnd_bill_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0290.CndR.bill_no_META);
		p.CndPanel.add(p.Cnd_bill_rev);
		p.Cnd_bill_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_bill_rev.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0290.CndR.bill_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0290.CndR.latest_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlSlsPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.hdr");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.hdr2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_bill_no_Label);
		p.HdrPanel.add(p.Hdr_bill_no);
		p.HdrPanel.setLastBeans(p.Hdr_bill_no);
		p.Hdr_bill_no.setNextBeans(p.Hdr_bill_rev);
		p.Hdr_bill_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bill_no_META);
		p.HdrPanel.add(p.Hdr_bill_rev);
		p.Hdr_bill_rev.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_bill_rev.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bill_rev_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_can_flg);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_bill_cl_dt);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.can_flg_META);
		p.HdrPanel.add(p.Hdr_bill_cl_dt_Label);
		p.HdrPanel.add(p.Hdr_bill_cl_dt);
		p.Hdr_bill_cl_dt.setNextBeans(p.Hdr_bill_dt);
		p.Hdr_bill_cl_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bill_cl_dt_META);
		p.Hdr_bill_cl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_bill_dt_Label);
		p.HdrPanel.add(p.Hdr_bill_dt);
		p.Hdr_bill_dt.setNextBeans(p.Hdr_bill_each_sls_flg);
		p.Hdr_bill_dt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bill_dt_META);
		p.Hdr_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_bill_each_sls_flg);
		p.Hdr_bill_each_sls_flg.setNextBeans(p.Hdr_iv_no);
		p.Hdr_bill_each_sls_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bill_each_sls_flg_META);
		p.HdrPanel.add(p.Hdr_iv_no_Label);
		p.HdrPanel.add(p.Hdr_iv_no);
		p.Hdr_iv_no.setNextBeans(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_iv_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.iv_no_META);
		p.HdrPanel.add(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_wrk_no_p_PPanel.setNextBeans(p.Hdr_bcst_cd);
		p.HdrPanel.add(p.Hdr_bcst_cd_Label);
		p.HdrPanel.add(p.Hdr_bcst_cd);
		p.Hdr_bcst_cd.setNextBeans(p.Hdr_bcst_nm);
		p.Hdr_bcst_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bcst_cd_META);
		p.HdrPanel.add(p.Hdr_bcst_nm);
		p.Hdr_bcst_nm.setNextBeans(p.Hdr_bill_dpt_cd);
		p.Hdr_bcst_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bcst_nm_META);
		p.HdrPanel.add(p.Hdr_bill_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_bill_dpt_cd);
		p.Hdr_bill_dpt_cd.setNextBeans(p.Hdr_bill_dpt_nm);
		p.Hdr_bill_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bill_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_bill_dpt_nm);
		p.Hdr_bill_dpt_nm.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_bill_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bill_dpt_nm_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_bill_xrate);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_bill_xrate_Label);
		p.HdrPanel.add(p.Hdr_bill_xrate);
		p.Hdr_bill_xrate.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_bill_xrate.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bill_xrate_META);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_base_cur_cd);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_last_bill_amt);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_last_bill_amt_Label);
		p.HdrPanel.add(p.Hdr_last_bill_amt);
		p.Hdr_last_bill_amt.setNextBeans(p.Hdr_rcv_amt);
		p.Hdr_last_bill_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.last_bill_amt_META);
		p.HdrPanel.add(p.Hdr_rcv_amt_Label);
		p.HdrPanel.add(p.Hdr_rcv_amt);
		p.Hdr_rcv_amt.setNextBeans(p.Hdr_sw_amt);
		p.Hdr_rcv_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.rcv_amt_META);
		p.HdrPanel.add(p.Hdr_sw_amt_Label);
		p.HdrPanel.add(p.Hdr_sw_amt);
		p.Hdr_sw_amt.setNextBeans(p.Hdr_bfw_amt);
		p.Hdr_sw_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.sw_amt_META);
		p.HdrPanel.add(p.Hdr_bfw_amt_Label);
		p.HdrPanel.add(p.Hdr_bfw_amt);
		p.Hdr_bfw_amt.setNextBeans(p.Hdr_sls_amt);
		p.Hdr_bfw_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bfw_amt_META);
		p.HdrPanel.add(p.Hdr_sls_amt_Label);
		p.HdrPanel.add(p.Hdr_sls_amt);
		p.Hdr_sls_amt.setNextBeans(p.Hdr_dscnt_amt);
		p.Hdr_sls_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.sls_amt_META);
		p.HdrPanel.add(p.Hdr_dscnt_amt_Label);
		p.HdrPanel.add(p.Hdr_dscnt_amt);
		p.Hdr_dscnt_amt.setNextBeans(p.Hdr_ret_amt);
		p.Hdr_dscnt_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.dscnt_amt_META);
		p.HdrPanel.add(p.Hdr_ret_amt_Label);
		p.HdrPanel.add(p.Hdr_ret_amt);
		p.Hdr_ret_amt.setNextBeans(p.Hdr_setoff_amt);
		p.Hdr_ret_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.ret_amt_META);
		p.HdrPanel.add(p.Hdr_setoff_amt_Label);
		p.HdrPanel.add(p.Hdr_setoff_amt);
		p.Hdr_setoff_amt.setNextBeans(p.Hdr_tax_amt);
		p.Hdr_setoff_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.setoff_amt_META);
		p.HdrPanel.add(p.Hdr_tax_amt_Label);
		p.HdrPanel.add(p.Hdr_tax_amt);
		p.Hdr_tax_amt.setNextBeans(p.Hdr_sw_to_amt);
		p.Hdr_tax_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.tax_amt_META);
		p.HdrPanel.add(p.Hdr_sw_to_amt_Label);
		p.HdrPanel.add(p.Hdr_sw_to_amt);
		p.Hdr_sw_to_amt.setNextBeans(p.Hdr_bill_amt);
		p.Hdr_sw_to_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.sw_to_amt_META);
		p.HdrPanel.add(p.Hdr_bill_amt_Label);
		p.HdrPanel.add(p.Hdr_bill_amt);
		p.Hdr_bill_amt.setNextBeans(p.Hdr_adv_amt_bal);
		p.Hdr_bill_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.bill_amt_META);
		p.HdrPanel.add(p.Hdr_adv_amt_bal_Label);
		p.HdrPanel.add(p.Hdr_adv_amt_bal);
		p.Hdr_adv_amt_bal.setNextBeans(p.Hdr_adv_amt);
		p.Hdr_adv_amt_bal.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.adv_amt_bal_META);
		p.HdrPanel.add(p.Hdr_adv_amt_Label);
		p.HdrPanel.add(p.Hdr_adv_amt);
		p.Hdr_adv_amt.setNextBeans(p.Hdr_adv_setoff_amt);
		p.Hdr_adv_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.adv_amt_META);
		p.HdrPanel.add(p.Hdr_adv_setoff_amt_Label);
		p.HdrPanel.add(p.Hdr_adv_setoff_amt);
		p.Hdr_adv_setoff_amt.setNextBeans(p.Hdr_adv_setoff_tax_amt);
		p.Hdr_adv_setoff_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.adv_setoff_amt_META);
		p.HdrPanel.add(p.Hdr_adv_setoff_tax_amt_Label);
		p.HdrPanel.add(p.Hdr_adv_setoff_tax_amt);
		p.Hdr_adv_setoff_tax_amt.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_adv_setoff_tax_amt.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.adv_setoff_tax_amt_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_edi_flg);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.sub_char3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.upd_srv_req_no_META);
		p.HdrPanel.add(p.Hdr_edi_flg);
		p.Hdr_edi_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0290.HdrR.edi_flg_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSls]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlSls(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlSlsPanel.setBorder(p.DtlSlsTitledBorder);
		p.add(p.DtlSlsPanel);
		p.DtlSlsPanel.setNextBeans(p.DtlPanelPanel);
		p.DtlSlsPanel.add(p.DtlSlsScrollPane);
		p.DtlSlsPanel.setLastBeans(p.DtlSlsTable);
		p.DtlSlsScrollPane.setViewportView(p.DtlSlsTable);
		p.DtlSlsTable.setList(p.getDtlSlsL());
		p.DtlSlsTable.setStatusColumnVisible(false);
		p.DtlSlsPanel.setLayoutPosition("CBCTC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlPanel(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanelPanel);
		p.DtlPanelPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.DtlPanelPanel.add(p.DtlRcvPanel, null);
		p.DtlPanelPanel.setLastBeans(p.DtlRcvPanel);
		p.DtlRcvPanel.setNextBeans(p.DtlAdvPanel);
		p.DtlPanelPanel.add(p.DtlAdvPanel, null);
	}

	/**
	 * [DtlRcv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlRcv(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlRcvPanel.setBorder(p.DtlRcvTitledBorder);
		p.DtlRcvPanel.add(p.DtlRcvScrollPane);
		p.DtlRcvPanel.setLastBeans(p.DtlRcvTable);
		p.DtlRcvScrollPane.setViewportView(p.DtlRcvTable);
		p.DtlRcvTable.setList(p.getDtlRcvL());
		p.DtlRcvTable.setStatusColumnVisible(false);
		p.DtlRcvPanel.setLayoutPosition("CLC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlAdv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlAdv(MSBGP_BillSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlAdvPanel.setBorder(p.DtlAdvTitledBorder);
		p.DtlAdvPanel.add(p.DtlAdvScrollPane);
		p.DtlAdvPanel.setLastBeans(p.DtlAdvTable);
		p.DtlAdvScrollPane.setViewportView(p.DtlAdvTable);
		p.DtlAdvTable.setList(p.getDtlAdvL());
		p.DtlAdvTable.setStatusColumnVisible(false);
		p.DtlAdvPanel.setLayoutPosition("CRC");
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
		MSBGP_BillSaveHstSrch_MC.mcInitCnd((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.mcInitHdrTab((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.mcInitHdr((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.mcInitHdr2((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.mcInitDtlSls((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.mcInitDtlPanel((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.mcInitDtlRcv((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.mcInitDtlAdv((MSBGP_BillSaveHstSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_BillSaveHstSrch_MC.statusInitSRCH_Cnd((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.statusInitSRCH_HdrTab((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.statusInitSRCH_Hdr((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.statusInitSRCH_Hdr2((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.statusInitSRCH_DtlSls((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.statusInitSRCH_DtlPanel((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.statusInitSRCH_DtlRcv((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.statusInitSRCH_DtlAdv((MSBGP_BillSaveHstSrch)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_BillSaveHstSrch p) {
		p.Cnd_bill_no.setListListener(p);
		p.Cnd_bill_no.addAllListener(p);
		p.Cnd_bill_rev.setListListener(p);
		p.Cnd_bill_rev.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBGP_BillSaveHstSrch p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBGP_BillSaveHstSrch p) {
		p.Hdr_bill_no.setListListener(p);
		p.Hdr_bill_no.addAllListener(p);
		p.Hdr_bill_rev.setListListener(p);
		p.Hdr_bill_rev.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_bill_cl_dt.setListListener(p);
		p.Hdr_bill_cl_dt.addAllListener(p);
		p.Hdr_bill_dt.setListListener(p);
		p.Hdr_bill_dt.addAllListener(p);
		p.Hdr_bill_each_sls_flg.addAllListener(p);
		p.Hdr_iv_no.setListListener(p);
		p.Hdr_iv_no.addAllListener(p);
		p.Hdr_bcst_cd.setListListener(p);
		p.Hdr_bcst_cd.addAllListener(p);
		p.Hdr_bcst_nm.setListListener(p);
		p.Hdr_bcst_nm.addAllListener(p);
		p.Hdr_bill_dpt_cd.setListListener(p);
		p.Hdr_bill_dpt_cd.addAllListener(p);
		p.Hdr_bill_dpt_nm.setListListener(p);
		p.Hdr_bill_dpt_nm.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_bill_xrate.setListListener(p);
		p.Hdr_bill_xrate.addAllListener(p);
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_base_cur_nm.setListListener(p);
		p.Hdr_base_cur_nm.addAllListener(p);
		p.Hdr_last_bill_amt.setListListener(p);
		p.Hdr_last_bill_amt.addAllListener(p);
		p.Hdr_rcv_amt.setListListener(p);
		p.Hdr_rcv_amt.addAllListener(p);
		p.Hdr_sw_amt.setListListener(p);
		p.Hdr_sw_amt.addAllListener(p);
		p.Hdr_bfw_amt.setListListener(p);
		p.Hdr_bfw_amt.addAllListener(p);
		p.Hdr_sls_amt.setListListener(p);
		p.Hdr_sls_amt.addAllListener(p);
		p.Hdr_dscnt_amt.setListListener(p);
		p.Hdr_dscnt_amt.addAllListener(p);
		p.Hdr_ret_amt.setListListener(p);
		p.Hdr_ret_amt.addAllListener(p);
		p.Hdr_setoff_amt.setListListener(p);
		p.Hdr_setoff_amt.addAllListener(p);
		p.Hdr_tax_amt.setListListener(p);
		p.Hdr_tax_amt.addAllListener(p);
		p.Hdr_sw_to_amt.setListListener(p);
		p.Hdr_sw_to_amt.addAllListener(p);
		p.Hdr_bill_amt.setListListener(p);
		p.Hdr_bill_amt.addAllListener(p);
		p.Hdr_adv_amt_bal.setListListener(p);
		p.Hdr_adv_amt_bal.addAllListener(p);
		p.Hdr_adv_amt.setListListener(p);
		p.Hdr_adv_amt.addAllListener(p);
		p.Hdr_adv_setoff_amt.setListListener(p);
		p.Hdr_adv_setoff_amt.addAllListener(p);
		p.Hdr_adv_setoff_tax_amt.setListListener(p);
		p.Hdr_adv_setoff_tax_amt.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
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
		p.Hdr_edi_flg.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBGP_BillSaveHstSrch p) {
	}

	/**
	 *  [DtlSls]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlSls(MSBGP_BillSaveHstSrch p) {
		p.DtlSlsTable.addAllListener(p);
		p.columnDtlSls_trd_cd.addAllListener(p);
		p.columnDtlSls_trd_cd.setListListener(p);
		p.columnDtlSls_trd_nm.addAllListener(p);
		p.columnDtlSls_trd_nm.setListListener(p);
		p.columnDtlSls_slip_sts_typ.addAllListener(p);
		p.columnDtlSls_slip_sts_typ.setListListener(p);
		p.columnDtlSls_slip_sts_typ_nm.addAllListener(p);
		p.columnDtlSls_slip_sts_typ_nm.setListListener(p);
		p.columnDtlSls_dlv_dt.addAllListener(p);
		p.columnDtlSls_dlv_dt.setListListener(p);
		p.columnDtlSls_base_sls_ac_dt.addAllListener(p);
		p.columnDtlSls_base_sls_ac_dt.setListListener(p);
		p.columnDtlSls_sundry_itm_flg.addAllListener(p);
		p.columnDtlSls_cst_itm_cd.addAllListener(p);
		p.columnDtlSls_cst_itm_cd.setListListener(p);
		p.columnDtlSls_cst_itm_nm.addAllListener(p);
		p.columnDtlSls_cst_itm_nm.setListListener(p);
		p.columnDtlSls_trd_unit_cd.addAllListener(p);
		p.columnDtlSls_trd_unit_cd.setListListener(p);
		p.columnDtlSls_trd_unit_nm.addAllListener(p);
		p.columnDtlSls_trd_unit_nm.setListListener(p);
		p.columnDtlSls_trd_unit_qty.addAllListener(p);
		p.columnDtlSls_trd_unit_qty.setListListener(p);
		p.columnDtlSls_tax_cd.addAllListener(p);
		p.columnDtlSls_tax_cd.setListListener(p);
		p.columnDtlSls_tax_nm.addAllListener(p);
		p.columnDtlSls_tax_nm.setListListener(p);
		p.columnDtlSls_inc_tax_flg.addAllListener(p);
		p.columnDtlSls_tax_rate.addAllListener(p);
		p.columnDtlSls_tax_rate.setListListener(p);
		p.columnDtlSls_interim_flg.addAllListener(p);
		p.columnDtlSls_trd_cur_upri.addAllListener(p);
		p.columnDtlSls_trd_cur_upri.setListListener(p);
		p.columnDtlSls_trd_cur_amt.addAllListener(p);
		p.columnDtlSls_trd_cur_amt.setListListener(p);
		p.columnDtlSls_trd_cur_tax_amt.addAllListener(p);
		p.columnDtlSls_trd_cur_tax_amt.setListListener(p);
		p.columnDtlSls_trd_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlSls_trd_cur_inc_tax_amt.setListListener(p);
		p.columnDtlSls_trd_cur_dscnt_amt.addAllListener(p);
		p.columnDtlSls_trd_cur_dscnt_amt.setListListener(p);
		p.columnDtlSls_base_cur_upri.addAllListener(p);
		p.columnDtlSls_base_cur_upri.setListListener(p);
		p.columnDtlSls_base_cur_amt.addAllListener(p);
		p.columnDtlSls_base_cur_amt.setListListener(p);
		p.columnDtlSls_base_cur_tax_amt.addAllListener(p);
		p.columnDtlSls_base_cur_tax_amt.setListListener(p);
		p.columnDtlSls_base_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlSls_base_cur_inc_tax_amt.setListListener(p);
		p.columnDtlSls_base_cur_dscnt_amt.addAllListener(p);
		p.columnDtlSls_base_cur_dscnt_amt.setListListener(p);
		p.columnDtlSls_cst_cd.addAllListener(p);
		p.columnDtlSls_cst_cd.setListListener(p);
		p.columnDtlSls_cst_nm.addAllListener(p);
		p.columnDtlSls_cst_nm.setListListener(p);
		p.columnDtlSls_dlv_cd.addAllListener(p);
		p.columnDtlSls_dlv_cd.setListListener(p);
		p.columnDtlSls_dlv_nm.addAllListener(p);
		p.columnDtlSls_dlv_nm.setListListener(p);
		p.columnDtlSls_trd_d_rmrks.addAllListener(p);
		p.columnDtlSls_trd_d_rmrks.setListListener(p);
		p.columnDtlSls_dlv_slip_no.addAllListener(p);
		p.columnDtlSls_dlv_slip_no.setListListener(p);
		p.columnDtlSls_dlv_slip_d_no.addAllListener(p);
		p.columnDtlSls_dlv_slip_d_no.setListListener(p);
		p.columnDtlSls_ship_dlv_slip_no.addAllListener(p);
		p.columnDtlSls_ship_dlv_slip_no.setListListener(p);
		p.columnDtlSls_ship_dlv_slip_d_no.addAllListener(p);
		p.columnDtlSls_ship_dlv_slip_d_no.setListListener(p);
		p.columnDtlSls_ship_dlv_slip_multi_flg.addAllListener(p);
		p.columnDtlSls_bill_mtd_typ.addAllListener(p);
		p.columnDtlSls_bill_mtd_typ.setListListener(p);
		p.columnDtlSls_bill_mtd_typ_nm.addAllListener(p);
		p.columnDtlSls_bill_mtd_typ_nm.setListListener(p);
		p.columnDtlSls_sls_act_no.addAllListener(p);
		p.columnDtlSls_sls_act_no.setListListener(p);
		p.columnDtlSls_sls_act_seq.addAllListener(p);
		p.columnDtlSls_sls_act_seq.setListListener(p);
		p.columnDtlSls_sls_act_rev.addAllListener(p);
		p.columnDtlSls_sls_act_rev.setListListener(p);
		p.columnDtlSls_sls_act_d_no.addAllListener(p);
		p.columnDtlSls_sls_act_d_no.setListListener(p);
		p.columnDtlSls_sls_act_d_seq.addAllListener(p);
		p.columnDtlSls_sls_act_d_seq.setListListener(p);
		p.columnDtlSls_sub_char1.addAllListener(p);
		p.columnDtlSls_sub_char1.setListListener(p);
		p.columnDtlSls_sub_char2.addAllListener(p);
		p.columnDtlSls_sub_char2.setListListener(p);
		p.columnDtlSls_sub_char3.addAllListener(p);
		p.columnDtlSls_sub_char3.setListListener(p);
		p.columnDtlSls_ins_usr_id.addAllListener(p);
		p.columnDtlSls_ins_usr_id.setListListener(p);
		p.columnDtlSls_ins_usr_nm.addAllListener(p);
		p.columnDtlSls_ins_usr_nm.setListListener(p);
		p.columnDtlSls_ins_func_id.addAllListener(p);
		p.columnDtlSls_ins_func_id.setListListener(p);
		p.columnDtlSls_ins_func_nm.addAllListener(p);
		p.columnDtlSls_ins_func_nm.setListListener(p);
		p.columnDtlSls_upd_usr_id.addAllListener(p);
		p.columnDtlSls_upd_usr_id.setListListener(p);
		p.columnDtlSls_upd_usr_nm.addAllListener(p);
		p.columnDtlSls_upd_usr_nm.setListListener(p);
		p.columnDtlSls_upd_func_id.addAllListener(p);
		p.columnDtlSls_upd_func_id.setListListener(p);
		p.columnDtlSls_upd_func_nm.addAllListener(p);
		p.columnDtlSls_upd_func_nm.setListListener(p);
		p.columnDtlSls_ins_ts.addAllListener(p);
		p.columnDtlSls_ins_ts.setListListener(p);
		p.columnDtlSls_upd_ts.addAllListener(p);
		p.columnDtlSls_upd_ts.setListListener(p);
		p.columnDtlSls_upd_srv_req_no.addAllListener(p);
		p.columnDtlSls_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [DtlPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlPanel(MSBGP_BillSaveHstSrch p) {
	}

	/**
	 *  [DtlRcv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlRcv(MSBGP_BillSaveHstSrch p) {
		p.DtlRcvTable.addAllListener(p);
		p.columnDtlRcv_rcv_act_no.addAllListener(p);
		p.columnDtlRcv_rcv_act_no.setListListener(p);
		p.columnDtlRcv_rcv_act_seq.addAllListener(p);
		p.columnDtlRcv_rcv_act_seq.setListListener(p);
		p.columnDtlRcv_rcv_act_rev.addAllListener(p);
		p.columnDtlRcv_rcv_act_rev.setListListener(p);
		p.columnDtlRcv_rcv_act_d_no.addAllListener(p);
		p.columnDtlRcv_rcv_act_d_no.setListListener(p);
		p.columnDtlRcv_rcv_act_d_seq.addAllListener(p);
		p.columnDtlRcv_rcv_act_d_seq.setListListener(p);
		p.columnDtlRcv_trd_cd.addAllListener(p);
		p.columnDtlRcv_trd_cd.setListListener(p);
		p.columnDtlRcv_trd_nm.addAllListener(p);
		p.columnDtlRcv_trd_nm.setListListener(p);
		p.columnDtlRcv_slip_sts_typ.addAllListener(p);
		p.columnDtlRcv_slip_sts_typ.setListListener(p);
		p.columnDtlRcv_slip_sts_typ_nm.addAllListener(p);
		p.columnDtlRcv_slip_sts_typ_nm.setListListener(p);
		p.columnDtlRcv_rcv_mtd_cd.addAllListener(p);
		p.columnDtlRcv_rcv_mtd_cd.setListListener(p);
		p.columnDtlRcv_rcv_mtd_nm.addAllListener(p);
		p.columnDtlRcv_rcv_mtd_nm.setListListener(p);
		p.columnDtlRcv_rcv_dt.addAllListener(p);
		p.columnDtlRcv_rcv_dt.setListListener(p);
		p.columnDtlRcv_tax_cd.addAllListener(p);
		p.columnDtlRcv_tax_cd.setListListener(p);
		p.columnDtlRcv_tax_nm.addAllListener(p);
		p.columnDtlRcv_tax_nm.setListListener(p);
		p.columnDtlRcv_inc_tax_flg.addAllListener(p);
		p.columnDtlRcv_tax_rate.addAllListener(p);
		p.columnDtlRcv_tax_rate.setListListener(p);
		p.columnDtlRcv_trd_cur_amt.addAllListener(p);
		p.columnDtlRcv_trd_cur_amt.setListListener(p);
		p.columnDtlRcv_trd_cur_tax_amt.addAllListener(p);
		p.columnDtlRcv_trd_cur_tax_amt.setListListener(p);
		p.columnDtlRcv_trd_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlRcv_trd_cur_inc_tax_amt.setListListener(p);
		p.columnDtlRcv_base_cur_amt.addAllListener(p);
		p.columnDtlRcv_base_cur_amt.setListListener(p);
		p.columnDtlRcv_base_cur_tax_amt.addAllListener(p);
		p.columnDtlRcv_base_cur_tax_amt.setListListener(p);
		p.columnDtlRcv_base_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlRcv_base_cur_inc_tax_amt.setListListener(p);
		p.columnDtlRcv_bill_d_rmrks.addAllListener(p);
		p.columnDtlRcv_bill_d_rmrks.setListListener(p);
		p.columnDtlRcv_sub_char1.addAllListener(p);
		p.columnDtlRcv_sub_char1.setListListener(p);
		p.columnDtlRcv_sub_char2.addAllListener(p);
		p.columnDtlRcv_sub_char2.setListListener(p);
		p.columnDtlRcv_sub_char3.addAllListener(p);
		p.columnDtlRcv_sub_char3.setListListener(p);
		p.columnDtlRcv_ins_usr_id.addAllListener(p);
		p.columnDtlRcv_ins_usr_id.setListListener(p);
		p.columnDtlRcv_ins_usr_nm.addAllListener(p);
		p.columnDtlRcv_ins_usr_nm.setListListener(p);
		p.columnDtlRcv_ins_func_id.addAllListener(p);
		p.columnDtlRcv_ins_func_id.setListListener(p);
		p.columnDtlRcv_ins_func_nm.addAllListener(p);
		p.columnDtlRcv_ins_func_nm.setListListener(p);
		p.columnDtlRcv_upd_usr_id.addAllListener(p);
		p.columnDtlRcv_upd_usr_id.setListListener(p);
		p.columnDtlRcv_upd_usr_nm.addAllListener(p);
		p.columnDtlRcv_upd_usr_nm.setListListener(p);
		p.columnDtlRcv_upd_func_id.addAllListener(p);
		p.columnDtlRcv_upd_func_id.setListListener(p);
		p.columnDtlRcv_upd_func_nm.addAllListener(p);
		p.columnDtlRcv_upd_func_nm.setListListener(p);
		p.columnDtlRcv_ins_ts.addAllListener(p);
		p.columnDtlRcv_ins_ts.setListListener(p);
		p.columnDtlRcv_upd_ts.addAllListener(p);
		p.columnDtlRcv_upd_ts.setListListener(p);
		p.columnDtlRcv_upd_srv_req_no.addAllListener(p);
		p.columnDtlRcv_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [DtlAdv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlAdv(MSBGP_BillSaveHstSrch p) {
		p.DtlAdvTable.addAllListener(p);
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
		p.columnDtlAdv_trd_cd.addAllListener(p);
		p.columnDtlAdv_trd_cd.setListListener(p);
		p.columnDtlAdv_trd_nm.addAllListener(p);
		p.columnDtlAdv_trd_nm.setListListener(p);
		p.columnDtlAdv_slip_sts_typ.addAllListener(p);
		p.columnDtlAdv_slip_sts_typ.setListListener(p);
		p.columnDtlAdv_slip_sts_typ_nm.addAllListener(p);
		p.columnDtlAdv_slip_sts_typ_nm.setListListener(p);
		p.columnDtlAdv_rcv_mtd_cd.addAllListener(p);
		p.columnDtlAdv_rcv_mtd_cd.setListListener(p);
		p.columnDtlAdv_rcv_mtd_nm.addAllListener(p);
		p.columnDtlAdv_rcv_mtd_nm.setListListener(p);
		p.columnDtlAdv_rcv_dt.addAllListener(p);
		p.columnDtlAdv_rcv_dt.setListListener(p);
		p.columnDtlAdv_tax_cd.addAllListener(p);
		p.columnDtlAdv_tax_cd.setListListener(p);
		p.columnDtlAdv_tax_nm.addAllListener(p);
		p.columnDtlAdv_tax_nm.setListListener(p);
		p.columnDtlAdv_inc_tax_flg.addAllListener(p);
		p.columnDtlAdv_tax_rate.addAllListener(p);
		p.columnDtlAdv_tax_rate.setListListener(p);
		p.columnDtlAdv_trd_cur_amt.addAllListener(p);
		p.columnDtlAdv_trd_cur_amt.setListListener(p);
		p.columnDtlAdv_trd_cur_tax_amt.addAllListener(p);
		p.columnDtlAdv_trd_cur_tax_amt.setListListener(p);
		p.columnDtlAdv_trd_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlAdv_trd_cur_inc_tax_amt.setListListener(p);
		p.columnDtlAdv_base_cur_amt.addAllListener(p);
		p.columnDtlAdv_base_cur_amt.setListListener(p);
		p.columnDtlAdv_base_cur_tax_amt.addAllListener(p);
		p.columnDtlAdv_base_cur_tax_amt.setListListener(p);
		p.columnDtlAdv_base_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlAdv_base_cur_inc_tax_amt.setListListener(p);
		p.columnDtlAdv_sub_char1.addAllListener(p);
		p.columnDtlAdv_sub_char1.setListListener(p);
		p.columnDtlAdv_sub_char2.addAllListener(p);
		p.columnDtlAdv_sub_char2.setListListener(p);
		p.columnDtlAdv_sub_char3.addAllListener(p);
		p.columnDtlAdv_sub_char3.setListListener(p);
		p.columnDtlAdv_ins_usr_id.addAllListener(p);
		p.columnDtlAdv_ins_usr_id.setListListener(p);
		p.columnDtlAdv_ins_usr_nm.addAllListener(p);
		p.columnDtlAdv_ins_usr_nm.setListListener(p);
		p.columnDtlAdv_ins_func_id.addAllListener(p);
		p.columnDtlAdv_ins_func_id.setListListener(p);
		p.columnDtlAdv_ins_func_nm.addAllListener(p);
		p.columnDtlAdv_ins_func_nm.setListListener(p);
		p.columnDtlAdv_upd_usr_id.addAllListener(p);
		p.columnDtlAdv_upd_usr_id.setListListener(p);
		p.columnDtlAdv_upd_usr_nm.addAllListener(p);
		p.columnDtlAdv_upd_usr_nm.setListListener(p);
		p.columnDtlAdv_upd_func_id.addAllListener(p);
		p.columnDtlAdv_upd_func_id.setListListener(p);
		p.columnDtlAdv_upd_func_nm.addAllListener(p);
		p.columnDtlAdv_upd_func_nm.setListListener(p);
		p.columnDtlAdv_ins_ts.addAllListener(p);
		p.columnDtlAdv_ins_ts.setListListener(p);
		p.columnDtlAdv_upd_ts.addAllListener(p);
		p.columnDtlAdv_upd_ts.setListListener(p);
		p.columnDtlAdv_upd_srv_req_no.addAllListener(p);
		p.columnDtlAdv_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_BillSaveHstSrch p){
		p.Cnd_bill_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bill_rev.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBGP_BillSaveHstSrch p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBGP_BillSaveHstSrch p){
		p.Hdr_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_each_sls_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_last_bill_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sw_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bfw_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dscnt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ret_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_setoff_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sw_to_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_adv_amt_bal.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_adv_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_adv_setoff_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_adv_setoff_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Hdr_edi_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBGP_BillSaveHstSrch p){

	}

	/**
	 * [SRCH]ステータスの[DtlSls]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlSls(MSBGP_BillSaveHstSrch p){
		p.columnDtlSls_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_slip_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_base_sls_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlSls_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlSls_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_inc_tax_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_cur_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_base_cur_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_base_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_base_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_base_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_base_cur_dscnt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ship_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ship_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ship_dlv_slip_multi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_bill_mtd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_bill_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_act_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sls_act_d_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSls_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlPanel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlPanel(MSBGP_BillSaveHstSrch p){

	}

	/**
	 * [SRCH]ステータスの[DtlRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlRcv(MSBGP_BillSaveHstSrch p){
		p.columnDtlRcv_rcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_rcv_act_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_rcv_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_rcv_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_rcv_act_d_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_slip_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_rcv_mtd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_rcv_mtd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_inc_tax_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_trd_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_base_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_base_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_base_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_bill_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlRcv_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlAdv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlAdv(MSBGP_BillSaveHstSrch p){
		p.columnDtlAdv_rcv_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_act_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_act_d_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_slip_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_mtd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_mtd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_inc_tax_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_trd_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_base_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_base_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_base_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdv_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

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
		MSBGP_BillSaveHstSrch_MC.setTableConfigDtlSls((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.setTableConfigDtlRcv((MSBGP_BillSaveHstSrch)this);
		MSBGP_BillSaveHstSrch_MC.setTableConfigDtlAdv((MSBGP_BillSaveHstSrch)this);
	}

	/**
	 * [DtlSls]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlSls(MSBGP_BillSaveHstSrch p) {
		p.columnDtlSls_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_cd);
		p.columnDtlSls_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_nm);
		p.columnDtlSls_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.slip_sts_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_slip_sts_typ);
		p.columnDtlSls_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.slip_sts_typ_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_slip_sts_typ_nm);
		p.columnDtlSls_dlv_dt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.dlv_dt_META);
		p.columnDtlSls_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dlv_dt);
		p.columnDtlSls_base_sls_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.base_sls_ac_dt_META);
		p.columnDtlSls_base_sls_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_base_sls_ac_dt);
		p.DtlSlsTable.addTable(p.DtlSls_itm_p_PPanel.ItmTable);
		p.columnDtlSls_sundry_itm_flg.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.sundry_itm_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sundry_itm_flg);
		p.columnDtlSls_cst_itm_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.cst_itm_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_itm_cd);
		p.columnDtlSls_cst_itm_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.cst_itm_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_itm_nm);
		p.columnDtlSls_trd_unit_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_unit_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_unit_cd);
		p.columnDtlSls_trd_unit_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_unit_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_unit_nm);
		p.columnDtlSls_trd_unit_qty.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_unit_qty_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_unit_qty);
		p.columnDtlSls_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.tax_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_tax_cd);
		p.columnDtlSls_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.tax_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_tax_nm);
		p.columnDtlSls_inc_tax_flg.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.inc_tax_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_inc_tax_flg);
		p.columnDtlSls_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.tax_rate_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_tax_rate);
		p.columnDtlSls_interim_flg.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.interim_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_interim_flg);
		p.columnDtlSls_trd_cur_upri.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_cur_upri_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_cur_upri);
		p.columnDtlSls_trd_cur_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_cur_amt_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_cur_amt);
		p.columnDtlSls_trd_cur_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_cur_tax_amt_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_cur_tax_amt);
		p.columnDtlSls_trd_cur_inc_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_cur_inc_tax_amt_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_cur_inc_tax_amt);
		p.columnDtlSls_trd_cur_dscnt_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_cur_dscnt_amt_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_cur_dscnt_amt);
		p.columnDtlSls_base_cur_upri.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.base_cur_upri_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_base_cur_upri);
		p.columnDtlSls_base_cur_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.base_cur_amt_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_base_cur_amt);
		p.columnDtlSls_base_cur_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.base_cur_tax_amt_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_base_cur_tax_amt);
		p.columnDtlSls_base_cur_inc_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.base_cur_inc_tax_amt_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_base_cur_inc_tax_amt);
		p.columnDtlSls_base_cur_dscnt_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.base_cur_dscnt_amt_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_base_cur_dscnt_amt);
		p.columnDtlSls_cst_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.cst_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_cd);
		p.columnDtlSls_cst_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.cst_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_cst_nm);
		p.columnDtlSls_dlv_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.dlv_cd_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dlv_cd);
		p.columnDtlSls_dlv_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.dlv_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dlv_nm);
		p.columnDtlSls_trd_d_rmrks.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.trd_d_rmrks_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_trd_d_rmrks);
		p.columnDtlSls_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.dlv_slip_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dlv_slip_no);
		p.columnDtlSls_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.dlv_slip_d_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_dlv_slip_d_no);
		p.columnDtlSls_ship_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.ship_dlv_slip_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ship_dlv_slip_no);
		p.columnDtlSls_ship_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.ship_dlv_slip_d_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ship_dlv_slip_d_no);
		p.columnDtlSls_ship_dlv_slip_multi_flg.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.ship_dlv_slip_multi_flg_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ship_dlv_slip_multi_flg);
		p.columnDtlSls_bill_mtd_typ.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.bill_mtd_typ_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_mtd_typ);
		p.columnDtlSls_bill_mtd_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.bill_mtd_typ_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_bill_mtd_typ_nm);
		p.columnDtlSls_sls_act_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.sls_act_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_act_no);
		p.columnDtlSls_sls_act_seq.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.sls_act_seq_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_act_seq);
		p.columnDtlSls_sls_act_rev.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.sls_act_rev_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_act_rev);
		p.columnDtlSls_sls_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.sls_act_d_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_act_d_no);
		p.columnDtlSls_sls_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.sls_act_d_seq_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sls_act_d_seq);
		p.columnDtlSls_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.sub_char1_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sub_char1);
		p.columnDtlSls_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.sub_char2_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sub_char2);
		p.columnDtlSls_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.sub_char3_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_sub_char3);
		p.columnDtlSls_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.ins_usr_id_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ins_usr_id);
		p.columnDtlSls_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.ins_usr_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ins_usr_nm);
		p.columnDtlSls_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.ins_func_id_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ins_func_id);
		p.columnDtlSls_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.ins_func_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ins_func_nm);
		p.columnDtlSls_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.upd_usr_id_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_upd_usr_id);
		p.columnDtlSls_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.upd_usr_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_upd_usr_nm);
		p.columnDtlSls_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.upd_func_id_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_upd_func_id);
		p.columnDtlSls_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.upd_func_nm_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_upd_func_nm);
		p.columnDtlSls_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.ins_ts_META);
		p.columnDtlSls_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_ins_ts);
		p.columnDtlSls_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.upd_ts_META);
		p.columnDtlSls_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_upd_ts);
		p.columnDtlSls_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlSlsR.upd_srv_req_no_META);
		p.DtlSlsTable.addColumnConfig(p.columnDtlSls_upd_srv_req_no);
	}

	/**
	 * [DtlRcv]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlRcv(MSBGP_BillSaveHstSrch p) {
		p.columnDtlRcv_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.rcv_act_no_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_act_no);
		p.columnDtlRcv_rcv_act_seq.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.rcv_act_seq_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_act_seq);
		p.columnDtlRcv_rcv_act_rev.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.rcv_act_rev_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_act_rev);
		p.columnDtlRcv_rcv_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.rcv_act_d_no_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_act_d_no);
		p.columnDtlRcv_rcv_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.rcv_act_d_seq_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_act_d_seq);
		p.columnDtlRcv_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.trd_cd_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_trd_cd);
		p.columnDtlRcv_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.trd_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_trd_nm);
		p.columnDtlRcv_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.slip_sts_typ_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_slip_sts_typ);
		p.columnDtlRcv_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.slip_sts_typ_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_slip_sts_typ_nm);
		p.columnDtlRcv_rcv_mtd_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.rcv_mtd_cd_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_mtd_cd);
		p.columnDtlRcv_rcv_mtd_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.rcv_mtd_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_mtd_nm);
		p.columnDtlRcv_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.rcv_dt_META);
		p.columnDtlRcv_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_rcv_dt);
		p.columnDtlRcv_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.tax_cd_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_tax_cd);
		p.columnDtlRcv_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.tax_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_tax_nm);
		p.columnDtlRcv_inc_tax_flg.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.inc_tax_flg_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_inc_tax_flg);
		p.columnDtlRcv_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.tax_rate_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_tax_rate);
		p.columnDtlRcv_trd_cur_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.trd_cur_amt_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_trd_cur_amt);
		p.columnDtlRcv_trd_cur_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.trd_cur_tax_amt_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_trd_cur_tax_amt);
		p.columnDtlRcv_trd_cur_inc_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.trd_cur_inc_tax_amt_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_trd_cur_inc_tax_amt);
		p.columnDtlRcv_base_cur_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.base_cur_amt_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_base_cur_amt);
		p.columnDtlRcv_base_cur_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.base_cur_tax_amt_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_base_cur_tax_amt);
		p.columnDtlRcv_base_cur_inc_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.base_cur_inc_tax_amt_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_base_cur_inc_tax_amt);
		p.columnDtlRcv_bill_d_rmrks.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.bill_d_rmrks_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_bill_d_rmrks);
		p.columnDtlRcv_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.sub_char1_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_sub_char1);
		p.columnDtlRcv_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.sub_char2_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_sub_char2);
		p.columnDtlRcv_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.sub_char3_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_sub_char3);
		p.columnDtlRcv_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.ins_usr_id_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_ins_usr_id);
		p.columnDtlRcv_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.ins_usr_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_ins_usr_nm);
		p.columnDtlRcv_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.ins_func_id_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_ins_func_id);
		p.columnDtlRcv_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.ins_func_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_ins_func_nm);
		p.columnDtlRcv_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.upd_usr_id_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_upd_usr_id);
		p.columnDtlRcv_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.upd_usr_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_upd_usr_nm);
		p.columnDtlRcv_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.upd_func_id_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_upd_func_id);
		p.columnDtlRcv_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.upd_func_nm_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_upd_func_nm);
		p.columnDtlRcv_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.ins_ts_META);
		p.columnDtlRcv_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_ins_ts);
		p.columnDtlRcv_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.upd_ts_META);
		p.columnDtlRcv_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_upd_ts);
		p.columnDtlRcv_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlRcvR.upd_srv_req_no_META);
		p.DtlRcvTable.addColumnConfig(p.columnDtlRcv_upd_srv_req_no);
	}

	/**
	 * [DtlAdv]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlAdv(MSBGP_BillSaveHstSrch p) {
		p.columnDtlAdv_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.rcv_act_no_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_no);
		p.columnDtlAdv_rcv_act_seq.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.rcv_act_seq_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_seq);
		p.columnDtlAdv_rcv_act_rev.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.rcv_act_rev_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_rev);
		p.columnDtlAdv_rcv_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.rcv_act_d_no_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_d_no);
		p.columnDtlAdv_rcv_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.rcv_act_d_seq_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_act_d_seq);
		p.columnDtlAdv_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.trd_cd_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_trd_cd);
		p.columnDtlAdv_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.trd_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_trd_nm);
		p.columnDtlAdv_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.slip_sts_typ_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_slip_sts_typ);
		p.columnDtlAdv_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.slip_sts_typ_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_slip_sts_typ_nm);
		p.columnDtlAdv_rcv_mtd_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.rcv_mtd_cd_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_mtd_cd);
		p.columnDtlAdv_rcv_mtd_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.rcv_mtd_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_mtd_nm);
		p.columnDtlAdv_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.rcv_dt_META);
		p.columnDtlAdv_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_rcv_dt);
		p.columnDtlAdv_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.tax_cd_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_tax_cd);
		p.columnDtlAdv_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.tax_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_tax_nm);
		p.columnDtlAdv_inc_tax_flg.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.inc_tax_flg_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_inc_tax_flg);
		p.columnDtlAdv_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.tax_rate_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_tax_rate);
		p.columnDtlAdv_trd_cur_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.trd_cur_amt_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_trd_cur_amt);
		p.columnDtlAdv_trd_cur_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.trd_cur_tax_amt_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_trd_cur_tax_amt);
		p.columnDtlAdv_trd_cur_inc_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.trd_cur_inc_tax_amt_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_trd_cur_inc_tax_amt);
		p.columnDtlAdv_base_cur_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.base_cur_amt_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_base_cur_amt);
		p.columnDtlAdv_base_cur_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.base_cur_tax_amt_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_base_cur_tax_amt);
		p.columnDtlAdv_base_cur_inc_tax_amt.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.base_cur_inc_tax_amt_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_base_cur_inc_tax_amt);
		p.columnDtlAdv_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.sub_char1_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_sub_char1);
		p.columnDtlAdv_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.sub_char2_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_sub_char2);
		p.columnDtlAdv_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.sub_char3_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_sub_char3);
		p.columnDtlAdv_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.ins_usr_id_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_ins_usr_id);
		p.columnDtlAdv_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.ins_usr_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_ins_usr_nm);
		p.columnDtlAdv_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.ins_func_id_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_ins_func_id);
		p.columnDtlAdv_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.ins_func_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_ins_func_nm);
		p.columnDtlAdv_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.upd_usr_id_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_upd_usr_id);
		p.columnDtlAdv_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.upd_usr_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_upd_usr_nm);
		p.columnDtlAdv_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.upd_func_id_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_upd_func_id);
		p.columnDtlAdv_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.upd_func_nm_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_upd_func_nm);
		p.columnDtlAdv_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.ins_ts_META);
		p.columnDtlAdv_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_ins_ts);
		p.columnDtlAdv_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.upd_ts_META);
		p.columnDtlAdv_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_upd_ts);
		p.columnDtlAdv_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0290.DtlAdvR.upd_srv_req_no_META);
		p.DtlAdvTable.addColumnConfig(p.columnDtlAdv_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
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
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

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
		if (vc == DtlSlsTable) return doDtlSls_VC(info);
		if (vc == DtlRcvTable) return doDtlRcv_VC(info);
		if (vc == DtlAdvTable) return doDtlAdv_VC(info);
		if (vc == Cnd_bill_no) return doCnd_bill_no_VC(info);
		if (vc == Cnd_bill_rev) return doCnd_bill_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Hdr_bill_no) return doHdr_bill_no_VC(info);
		if (vc == Hdr_bill_rev) return doHdr_bill_rev_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_bill_cl_dt) return doHdr_bill_cl_dt_VC(info);
		if (vc == Hdr_bill_dt) return doHdr_bill_dt_VC(info);
		if (vc == Hdr_bill_each_sls_flg) return doHdr_bill_each_sls_flg_VC(info);
		if (vc == Hdr_iv_no) return doHdr_iv_no_VC(info);
		if (vc == Hdr_bcst_cd) return doHdr_bcst_cd_VC(info);
		if (vc == Hdr_bcst_nm) return doHdr_bcst_nm_VC(info);
		if (vc == Hdr_bill_dpt_cd) return doHdr_bill_dpt_cd_VC(info);
		if (vc == Hdr_bill_dpt_nm) return doHdr_bill_dpt_nm_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_bill_xrate) return doHdr_bill_xrate_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_last_bill_amt) return doHdr_last_bill_amt_VC(info);
		if (vc == Hdr_rcv_amt) return doHdr_rcv_amt_VC(info);
		if (vc == Hdr_sw_amt) return doHdr_sw_amt_VC(info);
		if (vc == Hdr_bfw_amt) return doHdr_bfw_amt_VC(info);
		if (vc == Hdr_sls_amt) return doHdr_sls_amt_VC(info);
		if (vc == Hdr_dscnt_amt) return doHdr_dscnt_amt_VC(info);
		if (vc == Hdr_ret_amt) return doHdr_ret_amt_VC(info);
		if (vc == Hdr_setoff_amt) return doHdr_setoff_amt_VC(info);
		if (vc == Hdr_tax_amt) return doHdr_tax_amt_VC(info);
		if (vc == Hdr_sw_to_amt) return doHdr_sw_to_amt_VC(info);
		if (vc == Hdr_bill_amt) return doHdr_bill_amt_VC(info);
		if (vc == Hdr_adv_amt_bal) return doHdr_adv_amt_bal_VC(info);
		if (vc == Hdr_adv_amt) return doHdr_adv_amt_VC(info);
		if (vc == Hdr_adv_setoff_amt) return doHdr_adv_setoff_amt_VC(info);
		if (vc == Hdr_adv_setoff_tax_amt) return doHdr_adv_setoff_tax_amt_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
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
		if (vc == Hdr_edi_flg) return doHdr_edi_flg_VC(info);
		if (vc == columnDtlSls_trd_cd) return doDtlSls_trd_cd_VC(info);
		if (vc == columnDtlSls_trd_nm) return doDtlSls_trd_nm_VC(info);
		if (vc == columnDtlSls_slip_sts_typ) return doDtlSls_slip_sts_typ_VC(info);
		if (vc == columnDtlSls_slip_sts_typ_nm) return doDtlSls_slip_sts_typ_nm_VC(info);
		if (vc == columnDtlSls_dlv_dt) return doDtlSls_dlv_dt_VC(info);
		if (vc == columnDtlSls_base_sls_ac_dt) return doDtlSls_base_sls_ac_dt_VC(info);
		if (vc == columnDtlSls_sundry_itm_flg) return doDtlSls_sundry_itm_flg_VC(info);
		if (vc == columnDtlSls_cst_itm_cd) return doDtlSls_cst_itm_cd_VC(info);
		if (vc == columnDtlSls_cst_itm_nm) return doDtlSls_cst_itm_nm_VC(info);
		if (vc == columnDtlSls_trd_unit_cd) return doDtlSls_trd_unit_cd_VC(info);
		if (vc == columnDtlSls_trd_unit_nm) return doDtlSls_trd_unit_nm_VC(info);
		if (vc == columnDtlSls_trd_unit_qty) return doDtlSls_trd_unit_qty_VC(info);
		if (vc == columnDtlSls_tax_cd) return doDtlSls_tax_cd_VC(info);
		if (vc == columnDtlSls_tax_nm) return doDtlSls_tax_nm_VC(info);
		if (vc == columnDtlSls_inc_tax_flg) return doDtlSls_inc_tax_flg_VC(info);
		if (vc == columnDtlSls_tax_rate) return doDtlSls_tax_rate_VC(info);
		if (vc == columnDtlSls_interim_flg) return doDtlSls_interim_flg_VC(info);
		if (vc == columnDtlSls_trd_cur_upri) return doDtlSls_trd_cur_upri_VC(info);
		if (vc == columnDtlSls_trd_cur_amt) return doDtlSls_trd_cur_amt_VC(info);
		if (vc == columnDtlSls_trd_cur_tax_amt) return doDtlSls_trd_cur_tax_amt_VC(info);
		if (vc == columnDtlSls_trd_cur_inc_tax_amt) return doDtlSls_trd_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlSls_trd_cur_dscnt_amt) return doDtlSls_trd_cur_dscnt_amt_VC(info);
		if (vc == columnDtlSls_base_cur_upri) return doDtlSls_base_cur_upri_VC(info);
		if (vc == columnDtlSls_base_cur_amt) return doDtlSls_base_cur_amt_VC(info);
		if (vc == columnDtlSls_base_cur_tax_amt) return doDtlSls_base_cur_tax_amt_VC(info);
		if (vc == columnDtlSls_base_cur_inc_tax_amt) return doDtlSls_base_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlSls_base_cur_dscnt_amt) return doDtlSls_base_cur_dscnt_amt_VC(info);
		if (vc == columnDtlSls_cst_cd) return doDtlSls_cst_cd_VC(info);
		if (vc == columnDtlSls_cst_nm) return doDtlSls_cst_nm_VC(info);
		if (vc == columnDtlSls_dlv_cd) return doDtlSls_dlv_cd_VC(info);
		if (vc == columnDtlSls_dlv_nm) return doDtlSls_dlv_nm_VC(info);
		if (vc == columnDtlSls_trd_d_rmrks) return doDtlSls_trd_d_rmrks_VC(info);
		if (vc == columnDtlSls_dlv_slip_no) return doDtlSls_dlv_slip_no_VC(info);
		if (vc == columnDtlSls_dlv_slip_d_no) return doDtlSls_dlv_slip_d_no_VC(info);
		if (vc == columnDtlSls_ship_dlv_slip_no) return doDtlSls_ship_dlv_slip_no_VC(info);
		if (vc == columnDtlSls_ship_dlv_slip_d_no) return doDtlSls_ship_dlv_slip_d_no_VC(info);
		if (vc == columnDtlSls_ship_dlv_slip_multi_flg) return doDtlSls_ship_dlv_slip_multi_flg_VC(info);
		if (vc == columnDtlSls_bill_mtd_typ) return doDtlSls_bill_mtd_typ_VC(info);
		if (vc == columnDtlSls_bill_mtd_typ_nm) return doDtlSls_bill_mtd_typ_nm_VC(info);
		if (vc == columnDtlSls_sls_act_no) return doDtlSls_sls_act_no_VC(info);
		if (vc == columnDtlSls_sls_act_seq) return doDtlSls_sls_act_seq_VC(info);
		if (vc == columnDtlSls_sls_act_rev) return doDtlSls_sls_act_rev_VC(info);
		if (vc == columnDtlSls_sls_act_d_no) return doDtlSls_sls_act_d_no_VC(info);
		if (vc == columnDtlSls_sls_act_d_seq) return doDtlSls_sls_act_d_seq_VC(info);
		if (vc == columnDtlSls_sub_char1) return doDtlSls_sub_char1_VC(info);
		if (vc == columnDtlSls_sub_char2) return doDtlSls_sub_char2_VC(info);
		if (vc == columnDtlSls_sub_char3) return doDtlSls_sub_char3_VC(info);
		if (vc == columnDtlSls_ins_usr_id) return doDtlSls_ins_usr_id_VC(info);
		if (vc == columnDtlSls_ins_usr_nm) return doDtlSls_ins_usr_nm_VC(info);
		if (vc == columnDtlSls_ins_func_id) return doDtlSls_ins_func_id_VC(info);
		if (vc == columnDtlSls_ins_func_nm) return doDtlSls_ins_func_nm_VC(info);
		if (vc == columnDtlSls_upd_usr_id) return doDtlSls_upd_usr_id_VC(info);
		if (vc == columnDtlSls_upd_usr_nm) return doDtlSls_upd_usr_nm_VC(info);
		if (vc == columnDtlSls_upd_func_id) return doDtlSls_upd_func_id_VC(info);
		if (vc == columnDtlSls_upd_func_nm) return doDtlSls_upd_func_nm_VC(info);
		if (vc == columnDtlSls_ins_ts) return doDtlSls_ins_ts_VC(info);
		if (vc == columnDtlSls_upd_ts) return doDtlSls_upd_ts_VC(info);
		if (vc == columnDtlSls_upd_srv_req_no) return doDtlSls_upd_srv_req_no_VC(info);
		if (vc == columnDtlRcv_rcv_act_no) return doDtlRcv_rcv_act_no_VC(info);
		if (vc == columnDtlRcv_rcv_act_seq) return doDtlRcv_rcv_act_seq_VC(info);
		if (vc == columnDtlRcv_rcv_act_rev) return doDtlRcv_rcv_act_rev_VC(info);
		if (vc == columnDtlRcv_rcv_act_d_no) return doDtlRcv_rcv_act_d_no_VC(info);
		if (vc == columnDtlRcv_rcv_act_d_seq) return doDtlRcv_rcv_act_d_seq_VC(info);
		if (vc == columnDtlRcv_trd_cd) return doDtlRcv_trd_cd_VC(info);
		if (vc == columnDtlRcv_trd_nm) return doDtlRcv_trd_nm_VC(info);
		if (vc == columnDtlRcv_slip_sts_typ) return doDtlRcv_slip_sts_typ_VC(info);
		if (vc == columnDtlRcv_slip_sts_typ_nm) return doDtlRcv_slip_sts_typ_nm_VC(info);
		if (vc == columnDtlRcv_rcv_mtd_cd) return doDtlRcv_rcv_mtd_cd_VC(info);
		if (vc == columnDtlRcv_rcv_mtd_nm) return doDtlRcv_rcv_mtd_nm_VC(info);
		if (vc == columnDtlRcv_rcv_dt) return doDtlRcv_rcv_dt_VC(info);
		if (vc == columnDtlRcv_tax_cd) return doDtlRcv_tax_cd_VC(info);
		if (vc == columnDtlRcv_tax_nm) return doDtlRcv_tax_nm_VC(info);
		if (vc == columnDtlRcv_inc_tax_flg) return doDtlRcv_inc_tax_flg_VC(info);
		if (vc == columnDtlRcv_tax_rate) return doDtlRcv_tax_rate_VC(info);
		if (vc == columnDtlRcv_trd_cur_amt) return doDtlRcv_trd_cur_amt_VC(info);
		if (vc == columnDtlRcv_trd_cur_tax_amt) return doDtlRcv_trd_cur_tax_amt_VC(info);
		if (vc == columnDtlRcv_trd_cur_inc_tax_amt) return doDtlRcv_trd_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlRcv_base_cur_amt) return doDtlRcv_base_cur_amt_VC(info);
		if (vc == columnDtlRcv_base_cur_tax_amt) return doDtlRcv_base_cur_tax_amt_VC(info);
		if (vc == columnDtlRcv_base_cur_inc_tax_amt) return doDtlRcv_base_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlRcv_bill_d_rmrks) return doDtlRcv_bill_d_rmrks_VC(info);
		if (vc == columnDtlRcv_sub_char1) return doDtlRcv_sub_char1_VC(info);
		if (vc == columnDtlRcv_sub_char2) return doDtlRcv_sub_char2_VC(info);
		if (vc == columnDtlRcv_sub_char3) return doDtlRcv_sub_char3_VC(info);
		if (vc == columnDtlRcv_ins_usr_id) return doDtlRcv_ins_usr_id_VC(info);
		if (vc == columnDtlRcv_ins_usr_nm) return doDtlRcv_ins_usr_nm_VC(info);
		if (vc == columnDtlRcv_ins_func_id) return doDtlRcv_ins_func_id_VC(info);
		if (vc == columnDtlRcv_ins_func_nm) return doDtlRcv_ins_func_nm_VC(info);
		if (vc == columnDtlRcv_upd_usr_id) return doDtlRcv_upd_usr_id_VC(info);
		if (vc == columnDtlRcv_upd_usr_nm) return doDtlRcv_upd_usr_nm_VC(info);
		if (vc == columnDtlRcv_upd_func_id) return doDtlRcv_upd_func_id_VC(info);
		if (vc == columnDtlRcv_upd_func_nm) return doDtlRcv_upd_func_nm_VC(info);
		if (vc == columnDtlRcv_ins_ts) return doDtlRcv_ins_ts_VC(info);
		if (vc == columnDtlRcv_upd_ts) return doDtlRcv_upd_ts_VC(info);
		if (vc == columnDtlRcv_upd_srv_req_no) return doDtlRcv_upd_srv_req_no_VC(info);
		if (vc == columnDtlAdv_rcv_act_no) return doDtlAdv_rcv_act_no_VC(info);
		if (vc == columnDtlAdv_rcv_act_seq) return doDtlAdv_rcv_act_seq_VC(info);
		if (vc == columnDtlAdv_rcv_act_rev) return doDtlAdv_rcv_act_rev_VC(info);
		if (vc == columnDtlAdv_rcv_act_d_no) return doDtlAdv_rcv_act_d_no_VC(info);
		if (vc == columnDtlAdv_rcv_act_d_seq) return doDtlAdv_rcv_act_d_seq_VC(info);
		if (vc == columnDtlAdv_trd_cd) return doDtlAdv_trd_cd_VC(info);
		if (vc == columnDtlAdv_trd_nm) return doDtlAdv_trd_nm_VC(info);
		if (vc == columnDtlAdv_slip_sts_typ) return doDtlAdv_slip_sts_typ_VC(info);
		if (vc == columnDtlAdv_slip_sts_typ_nm) return doDtlAdv_slip_sts_typ_nm_VC(info);
		if (vc == columnDtlAdv_rcv_mtd_cd) return doDtlAdv_rcv_mtd_cd_VC(info);
		if (vc == columnDtlAdv_rcv_mtd_nm) return doDtlAdv_rcv_mtd_nm_VC(info);
		if (vc == columnDtlAdv_rcv_dt) return doDtlAdv_rcv_dt_VC(info);
		if (vc == columnDtlAdv_tax_cd) return doDtlAdv_tax_cd_VC(info);
		if (vc == columnDtlAdv_tax_nm) return doDtlAdv_tax_nm_VC(info);
		if (vc == columnDtlAdv_inc_tax_flg) return doDtlAdv_inc_tax_flg_VC(info);
		if (vc == columnDtlAdv_tax_rate) return doDtlAdv_tax_rate_VC(info);
		if (vc == columnDtlAdv_trd_cur_amt) return doDtlAdv_trd_cur_amt_VC(info);
		if (vc == columnDtlAdv_trd_cur_tax_amt) return doDtlAdv_trd_cur_tax_amt_VC(info);
		if (vc == columnDtlAdv_trd_cur_inc_tax_amt) return doDtlAdv_trd_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlAdv_base_cur_amt) return doDtlAdv_base_cur_amt_VC(info);
		if (vc == columnDtlAdv_base_cur_tax_amt) return doDtlAdv_base_cur_tax_amt_VC(info);
		if (vc == columnDtlAdv_base_cur_inc_tax_amt) return doDtlAdv_base_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlAdv_sub_char1) return doDtlAdv_sub_char1_VC(info);
		if (vc == columnDtlAdv_sub_char2) return doDtlAdv_sub_char2_VC(info);
		if (vc == columnDtlAdv_sub_char3) return doDtlAdv_sub_char3_VC(info);
		if (vc == columnDtlAdv_ins_usr_id) return doDtlAdv_ins_usr_id_VC(info);
		if (vc == columnDtlAdv_ins_usr_nm) return doDtlAdv_ins_usr_nm_VC(info);
		if (vc == columnDtlAdv_ins_func_id) return doDtlAdv_ins_func_id_VC(info);
		if (vc == columnDtlAdv_ins_func_nm) return doDtlAdv_ins_func_nm_VC(info);
		if (vc == columnDtlAdv_upd_usr_id) return doDtlAdv_upd_usr_id_VC(info);
		if (vc == columnDtlAdv_upd_usr_nm) return doDtlAdv_upd_usr_nm_VC(info);
		if (vc == columnDtlAdv_upd_func_id) return doDtlAdv_upd_func_id_VC(info);
		if (vc == columnDtlAdv_upd_func_nm) return doDtlAdv_upd_func_nm_VC(info);
		if (vc == columnDtlAdv_ins_ts) return doDtlAdv_ins_ts_VC(info);
		if (vc == columnDtlAdv_upd_ts) return doDtlAdv_upd_ts_VC(info);
		if (vc == columnDtlAdv_upd_srv_req_no) return doDtlAdv_upd_srv_req_no_VC(info);
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
	 * [Cnd]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_latest_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_each_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_each_sls_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_xrate_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[last_bill_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_last_bill_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sw_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sw_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bfw_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bfw_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ret_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ret_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[setoff_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_setoff_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sw_to_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sw_to_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[adv_amt_bal]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_adv_amt_bal_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[adv_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_adv_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[adv_setoff_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_adv_setoff_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[adv_setoff_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_adv_setoff_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char3_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_flg_VC(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dlv_dt_VC(MCEventInfo info){
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
	 * [DtlSls]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sundry_itm_flg_VC(MCEventInfo info){
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
	 * [DtlSls]パネルの[trd_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_unit_qty_VC(MCEventInfo info){
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
	 * [DtlSls]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_inc_tax_flg_VC(MCEventInfo info){
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
	 * [DtlSls]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[trd_cur_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_trd_cur_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[base_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_base_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[base_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_base_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[base_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_base_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[base_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_base_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[base_cur_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_base_cur_dscnt_amt_VC(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_dlv_nm_VC(MCEventInfo info){
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
	 * [DtlSls]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sls_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSls]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSls_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_rcv_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_rcv_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_rcv_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_rcv_act_d_seq_VC(MCEventInfo info){
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
	 * [DtlRcv]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_trd_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[base_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_base_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[base_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_base_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[base_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_base_cur_inc_tax_amt_VC(MCEventInfo info){
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
	 * [DtlRcv]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlRcv]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlRcv_upd_srv_req_no_VC(MCEventInfo info){
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
	 * [DtlAdv]パネルの[rcv_mtd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_rcv_mtd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[rcv_mtd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_rcv_mtd_nm_VC(MCEventInfo info){
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
	 * [DtlAdv]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_trd_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[base_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_base_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[base_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_base_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[base_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_base_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdv]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdv_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == DtlSlsTable) doDtlSls_NC(info);
		else if (nc == DtlRcvTable) doDtlRcv_NC(info);
		else if (nc == DtlAdvTable) doDtlAdv_NC(info);
		else if (nc == Cnd_bill_no) doCnd_bill_no_NC(info);
		else if (nc == Cnd_bill_rev) doCnd_bill_rev_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Hdr_bill_no) doHdr_bill_no_NC(info);
		else if (nc == Hdr_bill_rev) doHdr_bill_rev_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_bill_cl_dt) doHdr_bill_cl_dt_NC(info);
		else if (nc == Hdr_bill_dt) doHdr_bill_dt_NC(info);
		else if (nc == Hdr_bill_each_sls_flg) doHdr_bill_each_sls_flg_NC(info);
		else if (nc == Hdr_iv_no) doHdr_iv_no_NC(info);
		else if (nc == Hdr_bcst_cd) doHdr_bcst_cd_NC(info);
		else if (nc == Hdr_bcst_nm) doHdr_bcst_nm_NC(info);
		else if (nc == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NC(info);
		else if (nc == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_bill_xrate) doHdr_bill_xrate_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_last_bill_amt) doHdr_last_bill_amt_NC(info);
		else if (nc == Hdr_rcv_amt) doHdr_rcv_amt_NC(info);
		else if (nc == Hdr_sw_amt) doHdr_sw_amt_NC(info);
		else if (nc == Hdr_bfw_amt) doHdr_bfw_amt_NC(info);
		else if (nc == Hdr_sls_amt) doHdr_sls_amt_NC(info);
		else if (nc == Hdr_dscnt_amt) doHdr_dscnt_amt_NC(info);
		else if (nc == Hdr_ret_amt) doHdr_ret_amt_NC(info);
		else if (nc == Hdr_setoff_amt) doHdr_setoff_amt_NC(info);
		else if (nc == Hdr_tax_amt) doHdr_tax_amt_NC(info);
		else if (nc == Hdr_sw_to_amt) doHdr_sw_to_amt_NC(info);
		else if (nc == Hdr_bill_amt) doHdr_bill_amt_NC(info);
		else if (nc == Hdr_adv_amt_bal) doHdr_adv_amt_bal_NC(info);
		else if (nc == Hdr_adv_amt) doHdr_adv_amt_NC(info);
		else if (nc == Hdr_adv_setoff_amt) doHdr_adv_setoff_amt_NC(info);
		else if (nc == Hdr_adv_setoff_tax_amt) doHdr_adv_setoff_tax_amt_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
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
		else if (nc == Hdr_edi_flg) doHdr_edi_flg_NC(info);
		else if (nc == columnDtlSls_trd_cd) doDtlSls_trd_cd_NC(info);
		else if (nc == columnDtlSls_trd_nm) doDtlSls_trd_nm_NC(info);
		else if (nc == columnDtlSls_slip_sts_typ) doDtlSls_slip_sts_typ_NC(info);
		else if (nc == columnDtlSls_slip_sts_typ_nm) doDtlSls_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtlSls_dlv_dt) doDtlSls_dlv_dt_NC(info);
		else if (nc == columnDtlSls_base_sls_ac_dt) doDtlSls_base_sls_ac_dt_NC(info);
		else if (nc == columnDtlSls_sundry_itm_flg) doDtlSls_sundry_itm_flg_NC(info);
		else if (nc == columnDtlSls_cst_itm_cd) doDtlSls_cst_itm_cd_NC(info);
		else if (nc == columnDtlSls_cst_itm_nm) doDtlSls_cst_itm_nm_NC(info);
		else if (nc == columnDtlSls_trd_unit_cd) doDtlSls_trd_unit_cd_NC(info);
		else if (nc == columnDtlSls_trd_unit_nm) doDtlSls_trd_unit_nm_NC(info);
		else if (nc == columnDtlSls_trd_unit_qty) doDtlSls_trd_unit_qty_NC(info);
		else if (nc == columnDtlSls_tax_cd) doDtlSls_tax_cd_NC(info);
		else if (nc == columnDtlSls_tax_nm) doDtlSls_tax_nm_NC(info);
		else if (nc == columnDtlSls_inc_tax_flg) doDtlSls_inc_tax_flg_NC(info);
		else if (nc == columnDtlSls_tax_rate) doDtlSls_tax_rate_NC(info);
		else if (nc == columnDtlSls_interim_flg) doDtlSls_interim_flg_NC(info);
		else if (nc == columnDtlSls_trd_cur_upri) doDtlSls_trd_cur_upri_NC(info);
		else if (nc == columnDtlSls_trd_cur_amt) doDtlSls_trd_cur_amt_NC(info);
		else if (nc == columnDtlSls_trd_cur_tax_amt) doDtlSls_trd_cur_tax_amt_NC(info);
		else if (nc == columnDtlSls_trd_cur_inc_tax_amt) doDtlSls_trd_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlSls_trd_cur_dscnt_amt) doDtlSls_trd_cur_dscnt_amt_NC(info);
		else if (nc == columnDtlSls_base_cur_upri) doDtlSls_base_cur_upri_NC(info);
		else if (nc == columnDtlSls_base_cur_amt) doDtlSls_base_cur_amt_NC(info);
		else if (nc == columnDtlSls_base_cur_tax_amt) doDtlSls_base_cur_tax_amt_NC(info);
		else if (nc == columnDtlSls_base_cur_inc_tax_amt) doDtlSls_base_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlSls_base_cur_dscnt_amt) doDtlSls_base_cur_dscnt_amt_NC(info);
		else if (nc == columnDtlSls_cst_cd) doDtlSls_cst_cd_NC(info);
		else if (nc == columnDtlSls_cst_nm) doDtlSls_cst_nm_NC(info);
		else if (nc == columnDtlSls_dlv_cd) doDtlSls_dlv_cd_NC(info);
		else if (nc == columnDtlSls_dlv_nm) doDtlSls_dlv_nm_NC(info);
		else if (nc == columnDtlSls_trd_d_rmrks) doDtlSls_trd_d_rmrks_NC(info);
		else if (nc == columnDtlSls_dlv_slip_no) doDtlSls_dlv_slip_no_NC(info);
		else if (nc == columnDtlSls_dlv_slip_d_no) doDtlSls_dlv_slip_d_no_NC(info);
		else if (nc == columnDtlSls_ship_dlv_slip_no) doDtlSls_ship_dlv_slip_no_NC(info);
		else if (nc == columnDtlSls_ship_dlv_slip_d_no) doDtlSls_ship_dlv_slip_d_no_NC(info);
		else if (nc == columnDtlSls_ship_dlv_slip_multi_flg) doDtlSls_ship_dlv_slip_multi_flg_NC(info);
		else if (nc == columnDtlSls_bill_mtd_typ) doDtlSls_bill_mtd_typ_NC(info);
		else if (nc == columnDtlSls_bill_mtd_typ_nm) doDtlSls_bill_mtd_typ_nm_NC(info);
		else if (nc == columnDtlSls_sls_act_no) doDtlSls_sls_act_no_NC(info);
		else if (nc == columnDtlSls_sls_act_seq) doDtlSls_sls_act_seq_NC(info);
		else if (nc == columnDtlSls_sls_act_rev) doDtlSls_sls_act_rev_NC(info);
		else if (nc == columnDtlSls_sls_act_d_no) doDtlSls_sls_act_d_no_NC(info);
		else if (nc == columnDtlSls_sls_act_d_seq) doDtlSls_sls_act_d_seq_NC(info);
		else if (nc == columnDtlSls_sub_char1) doDtlSls_sub_char1_NC(info);
		else if (nc == columnDtlSls_sub_char2) doDtlSls_sub_char2_NC(info);
		else if (nc == columnDtlSls_sub_char3) doDtlSls_sub_char3_NC(info);
		else if (nc == columnDtlSls_ins_usr_id) doDtlSls_ins_usr_id_NC(info);
		else if (nc == columnDtlSls_ins_usr_nm) doDtlSls_ins_usr_nm_NC(info);
		else if (nc == columnDtlSls_ins_func_id) doDtlSls_ins_func_id_NC(info);
		else if (nc == columnDtlSls_ins_func_nm) doDtlSls_ins_func_nm_NC(info);
		else if (nc == columnDtlSls_upd_usr_id) doDtlSls_upd_usr_id_NC(info);
		else if (nc == columnDtlSls_upd_usr_nm) doDtlSls_upd_usr_nm_NC(info);
		else if (nc == columnDtlSls_upd_func_id) doDtlSls_upd_func_id_NC(info);
		else if (nc == columnDtlSls_upd_func_nm) doDtlSls_upd_func_nm_NC(info);
		else if (nc == columnDtlSls_ins_ts) doDtlSls_ins_ts_NC(info);
		else if (nc == columnDtlSls_upd_ts) doDtlSls_upd_ts_NC(info);
		else if (nc == columnDtlSls_upd_srv_req_no) doDtlSls_upd_srv_req_no_NC(info);
		else if (nc == columnDtlRcv_rcv_act_no) doDtlRcv_rcv_act_no_NC(info);
		else if (nc == columnDtlRcv_rcv_act_seq) doDtlRcv_rcv_act_seq_NC(info);
		else if (nc == columnDtlRcv_rcv_act_rev) doDtlRcv_rcv_act_rev_NC(info);
		else if (nc == columnDtlRcv_rcv_act_d_no) doDtlRcv_rcv_act_d_no_NC(info);
		else if (nc == columnDtlRcv_rcv_act_d_seq) doDtlRcv_rcv_act_d_seq_NC(info);
		else if (nc == columnDtlRcv_trd_cd) doDtlRcv_trd_cd_NC(info);
		else if (nc == columnDtlRcv_trd_nm) doDtlRcv_trd_nm_NC(info);
		else if (nc == columnDtlRcv_slip_sts_typ) doDtlRcv_slip_sts_typ_NC(info);
		else if (nc == columnDtlRcv_slip_sts_typ_nm) doDtlRcv_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtlRcv_rcv_mtd_cd) doDtlRcv_rcv_mtd_cd_NC(info);
		else if (nc == columnDtlRcv_rcv_mtd_nm) doDtlRcv_rcv_mtd_nm_NC(info);
		else if (nc == columnDtlRcv_rcv_dt) doDtlRcv_rcv_dt_NC(info);
		else if (nc == columnDtlRcv_tax_cd) doDtlRcv_tax_cd_NC(info);
		else if (nc == columnDtlRcv_tax_nm) doDtlRcv_tax_nm_NC(info);
		else if (nc == columnDtlRcv_inc_tax_flg) doDtlRcv_inc_tax_flg_NC(info);
		else if (nc == columnDtlRcv_tax_rate) doDtlRcv_tax_rate_NC(info);
		else if (nc == columnDtlRcv_trd_cur_amt) doDtlRcv_trd_cur_amt_NC(info);
		else if (nc == columnDtlRcv_trd_cur_tax_amt) doDtlRcv_trd_cur_tax_amt_NC(info);
		else if (nc == columnDtlRcv_trd_cur_inc_tax_amt) doDtlRcv_trd_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlRcv_base_cur_amt) doDtlRcv_base_cur_amt_NC(info);
		else if (nc == columnDtlRcv_base_cur_tax_amt) doDtlRcv_base_cur_tax_amt_NC(info);
		else if (nc == columnDtlRcv_base_cur_inc_tax_amt) doDtlRcv_base_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlRcv_bill_d_rmrks) doDtlRcv_bill_d_rmrks_NC(info);
		else if (nc == columnDtlRcv_sub_char1) doDtlRcv_sub_char1_NC(info);
		else if (nc == columnDtlRcv_sub_char2) doDtlRcv_sub_char2_NC(info);
		else if (nc == columnDtlRcv_sub_char3) doDtlRcv_sub_char3_NC(info);
		else if (nc == columnDtlRcv_ins_usr_id) doDtlRcv_ins_usr_id_NC(info);
		else if (nc == columnDtlRcv_ins_usr_nm) doDtlRcv_ins_usr_nm_NC(info);
		else if (nc == columnDtlRcv_ins_func_id) doDtlRcv_ins_func_id_NC(info);
		else if (nc == columnDtlRcv_ins_func_nm) doDtlRcv_ins_func_nm_NC(info);
		else if (nc == columnDtlRcv_upd_usr_id) doDtlRcv_upd_usr_id_NC(info);
		else if (nc == columnDtlRcv_upd_usr_nm) doDtlRcv_upd_usr_nm_NC(info);
		else if (nc == columnDtlRcv_upd_func_id) doDtlRcv_upd_func_id_NC(info);
		else if (nc == columnDtlRcv_upd_func_nm) doDtlRcv_upd_func_nm_NC(info);
		else if (nc == columnDtlRcv_ins_ts) doDtlRcv_ins_ts_NC(info);
		else if (nc == columnDtlRcv_upd_ts) doDtlRcv_upd_ts_NC(info);
		else if (nc == columnDtlRcv_upd_srv_req_no) doDtlRcv_upd_srv_req_no_NC(info);
		else if (nc == columnDtlAdv_rcv_act_no) doDtlAdv_rcv_act_no_NC(info);
		else if (nc == columnDtlAdv_rcv_act_seq) doDtlAdv_rcv_act_seq_NC(info);
		else if (nc == columnDtlAdv_rcv_act_rev) doDtlAdv_rcv_act_rev_NC(info);
		else if (nc == columnDtlAdv_rcv_act_d_no) doDtlAdv_rcv_act_d_no_NC(info);
		else if (nc == columnDtlAdv_rcv_act_d_seq) doDtlAdv_rcv_act_d_seq_NC(info);
		else if (nc == columnDtlAdv_trd_cd) doDtlAdv_trd_cd_NC(info);
		else if (nc == columnDtlAdv_trd_nm) doDtlAdv_trd_nm_NC(info);
		else if (nc == columnDtlAdv_slip_sts_typ) doDtlAdv_slip_sts_typ_NC(info);
		else if (nc == columnDtlAdv_slip_sts_typ_nm) doDtlAdv_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtlAdv_rcv_mtd_cd) doDtlAdv_rcv_mtd_cd_NC(info);
		else if (nc == columnDtlAdv_rcv_mtd_nm) doDtlAdv_rcv_mtd_nm_NC(info);
		else if (nc == columnDtlAdv_rcv_dt) doDtlAdv_rcv_dt_NC(info);
		else if (nc == columnDtlAdv_tax_cd) doDtlAdv_tax_cd_NC(info);
		else if (nc == columnDtlAdv_tax_nm) doDtlAdv_tax_nm_NC(info);
		else if (nc == columnDtlAdv_inc_tax_flg) doDtlAdv_inc_tax_flg_NC(info);
		else if (nc == columnDtlAdv_tax_rate) doDtlAdv_tax_rate_NC(info);
		else if (nc == columnDtlAdv_trd_cur_amt) doDtlAdv_trd_cur_amt_NC(info);
		else if (nc == columnDtlAdv_trd_cur_tax_amt) doDtlAdv_trd_cur_tax_amt_NC(info);
		else if (nc == columnDtlAdv_trd_cur_inc_tax_amt) doDtlAdv_trd_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlAdv_base_cur_amt) doDtlAdv_base_cur_amt_NC(info);
		else if (nc == columnDtlAdv_base_cur_tax_amt) doDtlAdv_base_cur_tax_amt_NC(info);
		else if (nc == columnDtlAdv_base_cur_inc_tax_amt) doDtlAdv_base_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlAdv_sub_char1) doDtlAdv_sub_char1_NC(info);
		else if (nc == columnDtlAdv_sub_char2) doDtlAdv_sub_char2_NC(info);
		else if (nc == columnDtlAdv_sub_char3) doDtlAdv_sub_char3_NC(info);
		else if (nc == columnDtlAdv_ins_usr_id) doDtlAdv_ins_usr_id_NC(info);
		else if (nc == columnDtlAdv_ins_usr_nm) doDtlAdv_ins_usr_nm_NC(info);
		else if (nc == columnDtlAdv_ins_func_id) doDtlAdv_ins_func_id_NC(info);
		else if (nc == columnDtlAdv_ins_func_nm) doDtlAdv_ins_func_nm_NC(info);
		else if (nc == columnDtlAdv_upd_usr_id) doDtlAdv_upd_usr_id_NC(info);
		else if (nc == columnDtlAdv_upd_usr_nm) doDtlAdv_upd_usr_nm_NC(info);
		else if (nc == columnDtlAdv_upd_func_id) doDtlAdv_upd_func_id_NC(info);
		else if (nc == columnDtlAdv_upd_func_nm) doDtlAdv_upd_func_nm_NC(info);
		else if (nc == columnDtlAdv_ins_ts) doDtlAdv_ins_ts_NC(info);
		else if (nc == columnDtlAdv_upd_ts) doDtlAdv_upd_ts_NC(info);
		else if (nc == columnDtlAdv_upd_srv_req_no) doDtlAdv_upd_srv_req_no_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rev_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_each_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_each_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_xrate_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[last_bill_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sw_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sw_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ret_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ret_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sw_to_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sw_to_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_amt_bal]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_amt_bal_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_setoff_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_setoff_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_setoff_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_setoff_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NC(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_sls_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_sls_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sundry_itm_flg_NC(MCEventInfo info){
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
	 * [DtlSls]パネルの[trd_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_qty_NC(MCEventInfo info){
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
	 * [DtlSls]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_dscnt_amt_NC(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_d_rmrks_NC(MCEventInfo info){
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
	 * [DtlSls]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_d_seq_NC(MCEventInfo info){
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
	 * [DtlRcv]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_srv_req_no_NC(MCEventInfo info){
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
	 * [DtlAdv]パネルの[rcv_mtd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_mtd_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_mtd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_mtd_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == DtlSlsTable) doDtlSls_NE(info);
		else if (ne == DtlRcvTable) doDtlRcv_NE(info);
		else if (ne == DtlAdvTable) doDtlAdv_NE(info);
		else if (ne == Cnd_bill_no) doCnd_bill_no_NE(info);
		else if (ne == Cnd_bill_rev) doCnd_bill_rev_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Hdr_bill_no) doHdr_bill_no_NE(info);
		else if (ne == Hdr_bill_rev) doHdr_bill_rev_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_bill_cl_dt) doHdr_bill_cl_dt_NE(info);
		else if (ne == Hdr_bill_dt) doHdr_bill_dt_NE(info);
		else if (ne == Hdr_bill_each_sls_flg) doHdr_bill_each_sls_flg_NE(info);
		else if (ne == Hdr_iv_no) doHdr_iv_no_NE(info);
		else if (ne == Hdr_bcst_cd) doHdr_bcst_cd_NE(info);
		else if (ne == Hdr_bcst_nm) doHdr_bcst_nm_NE(info);
		else if (ne == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NE(info);
		else if (ne == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_bill_xrate) doHdr_bill_xrate_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_last_bill_amt) doHdr_last_bill_amt_NE(info);
		else if (ne == Hdr_rcv_amt) doHdr_rcv_amt_NE(info);
		else if (ne == Hdr_sw_amt) doHdr_sw_amt_NE(info);
		else if (ne == Hdr_bfw_amt) doHdr_bfw_amt_NE(info);
		else if (ne == Hdr_sls_amt) doHdr_sls_amt_NE(info);
		else if (ne == Hdr_dscnt_amt) doHdr_dscnt_amt_NE(info);
		else if (ne == Hdr_ret_amt) doHdr_ret_amt_NE(info);
		else if (ne == Hdr_setoff_amt) doHdr_setoff_amt_NE(info);
		else if (ne == Hdr_tax_amt) doHdr_tax_amt_NE(info);
		else if (ne == Hdr_sw_to_amt) doHdr_sw_to_amt_NE(info);
		else if (ne == Hdr_bill_amt) doHdr_bill_amt_NE(info);
		else if (ne == Hdr_adv_amt_bal) doHdr_adv_amt_bal_NE(info);
		else if (ne == Hdr_adv_amt) doHdr_adv_amt_NE(info);
		else if (ne == Hdr_adv_setoff_amt) doHdr_adv_setoff_amt_NE(info);
		else if (ne == Hdr_adv_setoff_tax_amt) doHdr_adv_setoff_tax_amt_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
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
		else if (ne == Hdr_edi_flg) doHdr_edi_flg_NE(info);
		else if (ne == columnDtlSls_trd_cd) doDtlSls_trd_cd_NE(info);
		else if (ne == columnDtlSls_trd_nm) doDtlSls_trd_nm_NE(info);
		else if (ne == columnDtlSls_slip_sts_typ) doDtlSls_slip_sts_typ_NE(info);
		else if (ne == columnDtlSls_slip_sts_typ_nm) doDtlSls_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtlSls_dlv_dt) doDtlSls_dlv_dt_NE(info);
		else if (ne == columnDtlSls_base_sls_ac_dt) doDtlSls_base_sls_ac_dt_NE(info);
		else if (ne == columnDtlSls_sundry_itm_flg) doDtlSls_sundry_itm_flg_NE(info);
		else if (ne == columnDtlSls_cst_itm_cd) doDtlSls_cst_itm_cd_NE(info);
		else if (ne == columnDtlSls_cst_itm_nm) doDtlSls_cst_itm_nm_NE(info);
		else if (ne == columnDtlSls_trd_unit_cd) doDtlSls_trd_unit_cd_NE(info);
		else if (ne == columnDtlSls_trd_unit_nm) doDtlSls_trd_unit_nm_NE(info);
		else if (ne == columnDtlSls_trd_unit_qty) doDtlSls_trd_unit_qty_NE(info);
		else if (ne == columnDtlSls_tax_cd) doDtlSls_tax_cd_NE(info);
		else if (ne == columnDtlSls_tax_nm) doDtlSls_tax_nm_NE(info);
		else if (ne == columnDtlSls_inc_tax_flg) doDtlSls_inc_tax_flg_NE(info);
		else if (ne == columnDtlSls_tax_rate) doDtlSls_tax_rate_NE(info);
		else if (ne == columnDtlSls_interim_flg) doDtlSls_interim_flg_NE(info);
		else if (ne == columnDtlSls_trd_cur_upri) doDtlSls_trd_cur_upri_NE(info);
		else if (ne == columnDtlSls_trd_cur_amt) doDtlSls_trd_cur_amt_NE(info);
		else if (ne == columnDtlSls_trd_cur_tax_amt) doDtlSls_trd_cur_tax_amt_NE(info);
		else if (ne == columnDtlSls_trd_cur_inc_tax_amt) doDtlSls_trd_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlSls_trd_cur_dscnt_amt) doDtlSls_trd_cur_dscnt_amt_NE(info);
		else if (ne == columnDtlSls_base_cur_upri) doDtlSls_base_cur_upri_NE(info);
		else if (ne == columnDtlSls_base_cur_amt) doDtlSls_base_cur_amt_NE(info);
		else if (ne == columnDtlSls_base_cur_tax_amt) doDtlSls_base_cur_tax_amt_NE(info);
		else if (ne == columnDtlSls_base_cur_inc_tax_amt) doDtlSls_base_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlSls_base_cur_dscnt_amt) doDtlSls_base_cur_dscnt_amt_NE(info);
		else if (ne == columnDtlSls_cst_cd) doDtlSls_cst_cd_NE(info);
		else if (ne == columnDtlSls_cst_nm) doDtlSls_cst_nm_NE(info);
		else if (ne == columnDtlSls_dlv_cd) doDtlSls_dlv_cd_NE(info);
		else if (ne == columnDtlSls_dlv_nm) doDtlSls_dlv_nm_NE(info);
		else if (ne == columnDtlSls_trd_d_rmrks) doDtlSls_trd_d_rmrks_NE(info);
		else if (ne == columnDtlSls_dlv_slip_no) doDtlSls_dlv_slip_no_NE(info);
		else if (ne == columnDtlSls_dlv_slip_d_no) doDtlSls_dlv_slip_d_no_NE(info);
		else if (ne == columnDtlSls_ship_dlv_slip_no) doDtlSls_ship_dlv_slip_no_NE(info);
		else if (ne == columnDtlSls_ship_dlv_slip_d_no) doDtlSls_ship_dlv_slip_d_no_NE(info);
		else if (ne == columnDtlSls_ship_dlv_slip_multi_flg) doDtlSls_ship_dlv_slip_multi_flg_NE(info);
		else if (ne == columnDtlSls_bill_mtd_typ) doDtlSls_bill_mtd_typ_NE(info);
		else if (ne == columnDtlSls_bill_mtd_typ_nm) doDtlSls_bill_mtd_typ_nm_NE(info);
		else if (ne == columnDtlSls_sls_act_no) doDtlSls_sls_act_no_NE(info);
		else if (ne == columnDtlSls_sls_act_seq) doDtlSls_sls_act_seq_NE(info);
		else if (ne == columnDtlSls_sls_act_rev) doDtlSls_sls_act_rev_NE(info);
		else if (ne == columnDtlSls_sls_act_d_no) doDtlSls_sls_act_d_no_NE(info);
		else if (ne == columnDtlSls_sls_act_d_seq) doDtlSls_sls_act_d_seq_NE(info);
		else if (ne == columnDtlSls_sub_char1) doDtlSls_sub_char1_NE(info);
		else if (ne == columnDtlSls_sub_char2) doDtlSls_sub_char2_NE(info);
		else if (ne == columnDtlSls_sub_char3) doDtlSls_sub_char3_NE(info);
		else if (ne == columnDtlSls_ins_usr_id) doDtlSls_ins_usr_id_NE(info);
		else if (ne == columnDtlSls_ins_usr_nm) doDtlSls_ins_usr_nm_NE(info);
		else if (ne == columnDtlSls_ins_func_id) doDtlSls_ins_func_id_NE(info);
		else if (ne == columnDtlSls_ins_func_nm) doDtlSls_ins_func_nm_NE(info);
		else if (ne == columnDtlSls_upd_usr_id) doDtlSls_upd_usr_id_NE(info);
		else if (ne == columnDtlSls_upd_usr_nm) doDtlSls_upd_usr_nm_NE(info);
		else if (ne == columnDtlSls_upd_func_id) doDtlSls_upd_func_id_NE(info);
		else if (ne == columnDtlSls_upd_func_nm) doDtlSls_upd_func_nm_NE(info);
		else if (ne == columnDtlSls_ins_ts) doDtlSls_ins_ts_NE(info);
		else if (ne == columnDtlSls_upd_ts) doDtlSls_upd_ts_NE(info);
		else if (ne == columnDtlSls_upd_srv_req_no) doDtlSls_upd_srv_req_no_NE(info);
		else if (ne == columnDtlRcv_rcv_act_no) doDtlRcv_rcv_act_no_NE(info);
		else if (ne == columnDtlRcv_rcv_act_seq) doDtlRcv_rcv_act_seq_NE(info);
		else if (ne == columnDtlRcv_rcv_act_rev) doDtlRcv_rcv_act_rev_NE(info);
		else if (ne == columnDtlRcv_rcv_act_d_no) doDtlRcv_rcv_act_d_no_NE(info);
		else if (ne == columnDtlRcv_rcv_act_d_seq) doDtlRcv_rcv_act_d_seq_NE(info);
		else if (ne == columnDtlRcv_trd_cd) doDtlRcv_trd_cd_NE(info);
		else if (ne == columnDtlRcv_trd_nm) doDtlRcv_trd_nm_NE(info);
		else if (ne == columnDtlRcv_slip_sts_typ) doDtlRcv_slip_sts_typ_NE(info);
		else if (ne == columnDtlRcv_slip_sts_typ_nm) doDtlRcv_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtlRcv_rcv_mtd_cd) doDtlRcv_rcv_mtd_cd_NE(info);
		else if (ne == columnDtlRcv_rcv_mtd_nm) doDtlRcv_rcv_mtd_nm_NE(info);
		else if (ne == columnDtlRcv_rcv_dt) doDtlRcv_rcv_dt_NE(info);
		else if (ne == columnDtlRcv_tax_cd) doDtlRcv_tax_cd_NE(info);
		else if (ne == columnDtlRcv_tax_nm) doDtlRcv_tax_nm_NE(info);
		else if (ne == columnDtlRcv_inc_tax_flg) doDtlRcv_inc_tax_flg_NE(info);
		else if (ne == columnDtlRcv_tax_rate) doDtlRcv_tax_rate_NE(info);
		else if (ne == columnDtlRcv_trd_cur_amt) doDtlRcv_trd_cur_amt_NE(info);
		else if (ne == columnDtlRcv_trd_cur_tax_amt) doDtlRcv_trd_cur_tax_amt_NE(info);
		else if (ne == columnDtlRcv_trd_cur_inc_tax_amt) doDtlRcv_trd_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlRcv_base_cur_amt) doDtlRcv_base_cur_amt_NE(info);
		else if (ne == columnDtlRcv_base_cur_tax_amt) doDtlRcv_base_cur_tax_amt_NE(info);
		else if (ne == columnDtlRcv_base_cur_inc_tax_amt) doDtlRcv_base_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlRcv_bill_d_rmrks) doDtlRcv_bill_d_rmrks_NE(info);
		else if (ne == columnDtlRcv_sub_char1) doDtlRcv_sub_char1_NE(info);
		else if (ne == columnDtlRcv_sub_char2) doDtlRcv_sub_char2_NE(info);
		else if (ne == columnDtlRcv_sub_char3) doDtlRcv_sub_char3_NE(info);
		else if (ne == columnDtlRcv_ins_usr_id) doDtlRcv_ins_usr_id_NE(info);
		else if (ne == columnDtlRcv_ins_usr_nm) doDtlRcv_ins_usr_nm_NE(info);
		else if (ne == columnDtlRcv_ins_func_id) doDtlRcv_ins_func_id_NE(info);
		else if (ne == columnDtlRcv_ins_func_nm) doDtlRcv_ins_func_nm_NE(info);
		else if (ne == columnDtlRcv_upd_usr_id) doDtlRcv_upd_usr_id_NE(info);
		else if (ne == columnDtlRcv_upd_usr_nm) doDtlRcv_upd_usr_nm_NE(info);
		else if (ne == columnDtlRcv_upd_func_id) doDtlRcv_upd_func_id_NE(info);
		else if (ne == columnDtlRcv_upd_func_nm) doDtlRcv_upd_func_nm_NE(info);
		else if (ne == columnDtlRcv_ins_ts) doDtlRcv_ins_ts_NE(info);
		else if (ne == columnDtlRcv_upd_ts) doDtlRcv_upd_ts_NE(info);
		else if (ne == columnDtlRcv_upd_srv_req_no) doDtlRcv_upd_srv_req_no_NE(info);
		else if (ne == columnDtlAdv_rcv_act_no) doDtlAdv_rcv_act_no_NE(info);
		else if (ne == columnDtlAdv_rcv_act_seq) doDtlAdv_rcv_act_seq_NE(info);
		else if (ne == columnDtlAdv_rcv_act_rev) doDtlAdv_rcv_act_rev_NE(info);
		else if (ne == columnDtlAdv_rcv_act_d_no) doDtlAdv_rcv_act_d_no_NE(info);
		else if (ne == columnDtlAdv_rcv_act_d_seq) doDtlAdv_rcv_act_d_seq_NE(info);
		else if (ne == columnDtlAdv_trd_cd) doDtlAdv_trd_cd_NE(info);
		else if (ne == columnDtlAdv_trd_nm) doDtlAdv_trd_nm_NE(info);
		else if (ne == columnDtlAdv_slip_sts_typ) doDtlAdv_slip_sts_typ_NE(info);
		else if (ne == columnDtlAdv_slip_sts_typ_nm) doDtlAdv_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtlAdv_rcv_mtd_cd) doDtlAdv_rcv_mtd_cd_NE(info);
		else if (ne == columnDtlAdv_rcv_mtd_nm) doDtlAdv_rcv_mtd_nm_NE(info);
		else if (ne == columnDtlAdv_rcv_dt) doDtlAdv_rcv_dt_NE(info);
		else if (ne == columnDtlAdv_tax_cd) doDtlAdv_tax_cd_NE(info);
		else if (ne == columnDtlAdv_tax_nm) doDtlAdv_tax_nm_NE(info);
		else if (ne == columnDtlAdv_inc_tax_flg) doDtlAdv_inc_tax_flg_NE(info);
		else if (ne == columnDtlAdv_tax_rate) doDtlAdv_tax_rate_NE(info);
		else if (ne == columnDtlAdv_trd_cur_amt) doDtlAdv_trd_cur_amt_NE(info);
		else if (ne == columnDtlAdv_trd_cur_tax_amt) doDtlAdv_trd_cur_tax_amt_NE(info);
		else if (ne == columnDtlAdv_trd_cur_inc_tax_amt) doDtlAdv_trd_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlAdv_base_cur_amt) doDtlAdv_base_cur_amt_NE(info);
		else if (ne == columnDtlAdv_base_cur_tax_amt) doDtlAdv_base_cur_tax_amt_NE(info);
		else if (ne == columnDtlAdv_base_cur_inc_tax_amt) doDtlAdv_base_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlAdv_sub_char1) doDtlAdv_sub_char1_NE(info);
		else if (ne == columnDtlAdv_sub_char2) doDtlAdv_sub_char2_NE(info);
		else if (ne == columnDtlAdv_sub_char3) doDtlAdv_sub_char3_NE(info);
		else if (ne == columnDtlAdv_ins_usr_id) doDtlAdv_ins_usr_id_NE(info);
		else if (ne == columnDtlAdv_ins_usr_nm) doDtlAdv_ins_usr_nm_NE(info);
		else if (ne == columnDtlAdv_ins_func_id) doDtlAdv_ins_func_id_NE(info);
		else if (ne == columnDtlAdv_ins_func_nm) doDtlAdv_ins_func_nm_NE(info);
		else if (ne == columnDtlAdv_upd_usr_id) doDtlAdv_upd_usr_id_NE(info);
		else if (ne == columnDtlAdv_upd_usr_nm) doDtlAdv_upd_usr_nm_NE(info);
		else if (ne == columnDtlAdv_upd_func_id) doDtlAdv_upd_func_id_NE(info);
		else if (ne == columnDtlAdv_upd_func_nm) doDtlAdv_upd_func_nm_NE(info);
		else if (ne == columnDtlAdv_ins_ts) doDtlAdv_ins_ts_NE(info);
		else if (ne == columnDtlAdv_upd_ts) doDtlAdv_upd_ts_NE(info);
		else if (ne == columnDtlAdv_upd_srv_req_no) doDtlAdv_upd_srv_req_no_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rev_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_each_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_each_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_xrate_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[last_bill_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sw_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sw_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ret_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ret_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sw_to_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sw_to_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_amt_bal]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_amt_bal_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_setoff_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_setoff_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_setoff_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_setoff_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NE(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_sls_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_sls_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sundry_itm_flg_NE(MCEventInfo info){
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
	 * [DtlSls]パネルの[trd_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_qty_NE(MCEventInfo info){
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
	 * [DtlSls]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_dscnt_amt_NE(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_d_rmrks_NE(MCEventInfo info){
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
	 * [DtlSls]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_d_seq_NE(MCEventInfo info){
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
	 * [DtlRcv]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_srv_req_no_NE(MCEventInfo info){
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
	 * [DtlAdv]パネルの[rcv_mtd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_mtd_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_mtd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_mtd_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == DtlSlsTable) doDtlSls_NX(info);
		else if (nx == DtlRcvTable) doDtlRcv_NX(info);
		else if (nx == DtlAdvTable) doDtlAdv_NX(info);
		else if (nx == Cnd_bill_no) doCnd_bill_no_NX(info);
		else if (nx == Cnd_bill_rev) doCnd_bill_rev_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Hdr_bill_no) doHdr_bill_no_NX(info);
		else if (nx == Hdr_bill_rev) doHdr_bill_rev_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_bill_cl_dt) doHdr_bill_cl_dt_NX(info);
		else if (nx == Hdr_bill_dt) doHdr_bill_dt_NX(info);
		else if (nx == Hdr_bill_each_sls_flg) doHdr_bill_each_sls_flg_NX(info);
		else if (nx == Hdr_iv_no) doHdr_iv_no_NX(info);
		else if (nx == Hdr_bcst_cd) doHdr_bcst_cd_NX(info);
		else if (nx == Hdr_bcst_nm) doHdr_bcst_nm_NX(info);
		else if (nx == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NX(info);
		else if (nx == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_bill_xrate) doHdr_bill_xrate_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_last_bill_amt) doHdr_last_bill_amt_NX(info);
		else if (nx == Hdr_rcv_amt) doHdr_rcv_amt_NX(info);
		else if (nx == Hdr_sw_amt) doHdr_sw_amt_NX(info);
		else if (nx == Hdr_bfw_amt) doHdr_bfw_amt_NX(info);
		else if (nx == Hdr_sls_amt) doHdr_sls_amt_NX(info);
		else if (nx == Hdr_dscnt_amt) doHdr_dscnt_amt_NX(info);
		else if (nx == Hdr_ret_amt) doHdr_ret_amt_NX(info);
		else if (nx == Hdr_setoff_amt) doHdr_setoff_amt_NX(info);
		else if (nx == Hdr_tax_amt) doHdr_tax_amt_NX(info);
		else if (nx == Hdr_sw_to_amt) doHdr_sw_to_amt_NX(info);
		else if (nx == Hdr_bill_amt) doHdr_bill_amt_NX(info);
		else if (nx == Hdr_adv_amt_bal) doHdr_adv_amt_bal_NX(info);
		else if (nx == Hdr_adv_amt) doHdr_adv_amt_NX(info);
		else if (nx == Hdr_adv_setoff_amt) doHdr_adv_setoff_amt_NX(info);
		else if (nx == Hdr_adv_setoff_tax_amt) doHdr_adv_setoff_tax_amt_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
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
		else if (nx == Hdr_edi_flg) doHdr_edi_flg_NX(info);
		else if (nx == columnDtlSls_trd_cd) doDtlSls_trd_cd_NX(info);
		else if (nx == columnDtlSls_trd_nm) doDtlSls_trd_nm_NX(info);
		else if (nx == columnDtlSls_slip_sts_typ) doDtlSls_slip_sts_typ_NX(info);
		else if (nx == columnDtlSls_slip_sts_typ_nm) doDtlSls_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtlSls_dlv_dt) doDtlSls_dlv_dt_NX(info);
		else if (nx == columnDtlSls_base_sls_ac_dt) doDtlSls_base_sls_ac_dt_NX(info);
		else if (nx == columnDtlSls_sundry_itm_flg) doDtlSls_sundry_itm_flg_NX(info);
		else if (nx == columnDtlSls_cst_itm_cd) doDtlSls_cst_itm_cd_NX(info);
		else if (nx == columnDtlSls_cst_itm_nm) doDtlSls_cst_itm_nm_NX(info);
		else if (nx == columnDtlSls_trd_unit_cd) doDtlSls_trd_unit_cd_NX(info);
		else if (nx == columnDtlSls_trd_unit_nm) doDtlSls_trd_unit_nm_NX(info);
		else if (nx == columnDtlSls_trd_unit_qty) doDtlSls_trd_unit_qty_NX(info);
		else if (nx == columnDtlSls_tax_cd) doDtlSls_tax_cd_NX(info);
		else if (nx == columnDtlSls_tax_nm) doDtlSls_tax_nm_NX(info);
		else if (nx == columnDtlSls_inc_tax_flg) doDtlSls_inc_tax_flg_NX(info);
		else if (nx == columnDtlSls_tax_rate) doDtlSls_tax_rate_NX(info);
		else if (nx == columnDtlSls_interim_flg) doDtlSls_interim_flg_NX(info);
		else if (nx == columnDtlSls_trd_cur_upri) doDtlSls_trd_cur_upri_NX(info);
		else if (nx == columnDtlSls_trd_cur_amt) doDtlSls_trd_cur_amt_NX(info);
		else if (nx == columnDtlSls_trd_cur_tax_amt) doDtlSls_trd_cur_tax_amt_NX(info);
		else if (nx == columnDtlSls_trd_cur_inc_tax_amt) doDtlSls_trd_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlSls_trd_cur_dscnt_amt) doDtlSls_trd_cur_dscnt_amt_NX(info);
		else if (nx == columnDtlSls_base_cur_upri) doDtlSls_base_cur_upri_NX(info);
		else if (nx == columnDtlSls_base_cur_amt) doDtlSls_base_cur_amt_NX(info);
		else if (nx == columnDtlSls_base_cur_tax_amt) doDtlSls_base_cur_tax_amt_NX(info);
		else if (nx == columnDtlSls_base_cur_inc_tax_amt) doDtlSls_base_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlSls_base_cur_dscnt_amt) doDtlSls_base_cur_dscnt_amt_NX(info);
		else if (nx == columnDtlSls_cst_cd) doDtlSls_cst_cd_NX(info);
		else if (nx == columnDtlSls_cst_nm) doDtlSls_cst_nm_NX(info);
		else if (nx == columnDtlSls_dlv_cd) doDtlSls_dlv_cd_NX(info);
		else if (nx == columnDtlSls_dlv_nm) doDtlSls_dlv_nm_NX(info);
		else if (nx == columnDtlSls_trd_d_rmrks) doDtlSls_trd_d_rmrks_NX(info);
		else if (nx == columnDtlSls_dlv_slip_no) doDtlSls_dlv_slip_no_NX(info);
		else if (nx == columnDtlSls_dlv_slip_d_no) doDtlSls_dlv_slip_d_no_NX(info);
		else if (nx == columnDtlSls_ship_dlv_slip_no) doDtlSls_ship_dlv_slip_no_NX(info);
		else if (nx == columnDtlSls_ship_dlv_slip_d_no) doDtlSls_ship_dlv_slip_d_no_NX(info);
		else if (nx == columnDtlSls_ship_dlv_slip_multi_flg) doDtlSls_ship_dlv_slip_multi_flg_NX(info);
		else if (nx == columnDtlSls_bill_mtd_typ) doDtlSls_bill_mtd_typ_NX(info);
		else if (nx == columnDtlSls_bill_mtd_typ_nm) doDtlSls_bill_mtd_typ_nm_NX(info);
		else if (nx == columnDtlSls_sls_act_no) doDtlSls_sls_act_no_NX(info);
		else if (nx == columnDtlSls_sls_act_seq) doDtlSls_sls_act_seq_NX(info);
		else if (nx == columnDtlSls_sls_act_rev) doDtlSls_sls_act_rev_NX(info);
		else if (nx == columnDtlSls_sls_act_d_no) doDtlSls_sls_act_d_no_NX(info);
		else if (nx == columnDtlSls_sls_act_d_seq) doDtlSls_sls_act_d_seq_NX(info);
		else if (nx == columnDtlSls_sub_char1) doDtlSls_sub_char1_NX(info);
		else if (nx == columnDtlSls_sub_char2) doDtlSls_sub_char2_NX(info);
		else if (nx == columnDtlSls_sub_char3) doDtlSls_sub_char3_NX(info);
		else if (nx == columnDtlSls_ins_usr_id) doDtlSls_ins_usr_id_NX(info);
		else if (nx == columnDtlSls_ins_usr_nm) doDtlSls_ins_usr_nm_NX(info);
		else if (nx == columnDtlSls_ins_func_id) doDtlSls_ins_func_id_NX(info);
		else if (nx == columnDtlSls_ins_func_nm) doDtlSls_ins_func_nm_NX(info);
		else if (nx == columnDtlSls_upd_usr_id) doDtlSls_upd_usr_id_NX(info);
		else if (nx == columnDtlSls_upd_usr_nm) doDtlSls_upd_usr_nm_NX(info);
		else if (nx == columnDtlSls_upd_func_id) doDtlSls_upd_func_id_NX(info);
		else if (nx == columnDtlSls_upd_func_nm) doDtlSls_upd_func_nm_NX(info);
		else if (nx == columnDtlSls_ins_ts) doDtlSls_ins_ts_NX(info);
		else if (nx == columnDtlSls_upd_ts) doDtlSls_upd_ts_NX(info);
		else if (nx == columnDtlSls_upd_srv_req_no) doDtlSls_upd_srv_req_no_NX(info);
		else if (nx == columnDtlRcv_rcv_act_no) doDtlRcv_rcv_act_no_NX(info);
		else if (nx == columnDtlRcv_rcv_act_seq) doDtlRcv_rcv_act_seq_NX(info);
		else if (nx == columnDtlRcv_rcv_act_rev) doDtlRcv_rcv_act_rev_NX(info);
		else if (nx == columnDtlRcv_rcv_act_d_no) doDtlRcv_rcv_act_d_no_NX(info);
		else if (nx == columnDtlRcv_rcv_act_d_seq) doDtlRcv_rcv_act_d_seq_NX(info);
		else if (nx == columnDtlRcv_trd_cd) doDtlRcv_trd_cd_NX(info);
		else if (nx == columnDtlRcv_trd_nm) doDtlRcv_trd_nm_NX(info);
		else if (nx == columnDtlRcv_slip_sts_typ) doDtlRcv_slip_sts_typ_NX(info);
		else if (nx == columnDtlRcv_slip_sts_typ_nm) doDtlRcv_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtlRcv_rcv_mtd_cd) doDtlRcv_rcv_mtd_cd_NX(info);
		else if (nx == columnDtlRcv_rcv_mtd_nm) doDtlRcv_rcv_mtd_nm_NX(info);
		else if (nx == columnDtlRcv_rcv_dt) doDtlRcv_rcv_dt_NX(info);
		else if (nx == columnDtlRcv_tax_cd) doDtlRcv_tax_cd_NX(info);
		else if (nx == columnDtlRcv_tax_nm) doDtlRcv_tax_nm_NX(info);
		else if (nx == columnDtlRcv_inc_tax_flg) doDtlRcv_inc_tax_flg_NX(info);
		else if (nx == columnDtlRcv_tax_rate) doDtlRcv_tax_rate_NX(info);
		else if (nx == columnDtlRcv_trd_cur_amt) doDtlRcv_trd_cur_amt_NX(info);
		else if (nx == columnDtlRcv_trd_cur_tax_amt) doDtlRcv_trd_cur_tax_amt_NX(info);
		else if (nx == columnDtlRcv_trd_cur_inc_tax_amt) doDtlRcv_trd_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlRcv_base_cur_amt) doDtlRcv_base_cur_amt_NX(info);
		else if (nx == columnDtlRcv_base_cur_tax_amt) doDtlRcv_base_cur_tax_amt_NX(info);
		else if (nx == columnDtlRcv_base_cur_inc_tax_amt) doDtlRcv_base_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlRcv_bill_d_rmrks) doDtlRcv_bill_d_rmrks_NX(info);
		else if (nx == columnDtlRcv_sub_char1) doDtlRcv_sub_char1_NX(info);
		else if (nx == columnDtlRcv_sub_char2) doDtlRcv_sub_char2_NX(info);
		else if (nx == columnDtlRcv_sub_char3) doDtlRcv_sub_char3_NX(info);
		else if (nx == columnDtlRcv_ins_usr_id) doDtlRcv_ins_usr_id_NX(info);
		else if (nx == columnDtlRcv_ins_usr_nm) doDtlRcv_ins_usr_nm_NX(info);
		else if (nx == columnDtlRcv_ins_func_id) doDtlRcv_ins_func_id_NX(info);
		else if (nx == columnDtlRcv_ins_func_nm) doDtlRcv_ins_func_nm_NX(info);
		else if (nx == columnDtlRcv_upd_usr_id) doDtlRcv_upd_usr_id_NX(info);
		else if (nx == columnDtlRcv_upd_usr_nm) doDtlRcv_upd_usr_nm_NX(info);
		else if (nx == columnDtlRcv_upd_func_id) doDtlRcv_upd_func_id_NX(info);
		else if (nx == columnDtlRcv_upd_func_nm) doDtlRcv_upd_func_nm_NX(info);
		else if (nx == columnDtlRcv_ins_ts) doDtlRcv_ins_ts_NX(info);
		else if (nx == columnDtlRcv_upd_ts) doDtlRcv_upd_ts_NX(info);
		else if (nx == columnDtlRcv_upd_srv_req_no) doDtlRcv_upd_srv_req_no_NX(info);
		else if (nx == columnDtlAdv_rcv_act_no) doDtlAdv_rcv_act_no_NX(info);
		else if (nx == columnDtlAdv_rcv_act_seq) doDtlAdv_rcv_act_seq_NX(info);
		else if (nx == columnDtlAdv_rcv_act_rev) doDtlAdv_rcv_act_rev_NX(info);
		else if (nx == columnDtlAdv_rcv_act_d_no) doDtlAdv_rcv_act_d_no_NX(info);
		else if (nx == columnDtlAdv_rcv_act_d_seq) doDtlAdv_rcv_act_d_seq_NX(info);
		else if (nx == columnDtlAdv_trd_cd) doDtlAdv_trd_cd_NX(info);
		else if (nx == columnDtlAdv_trd_nm) doDtlAdv_trd_nm_NX(info);
		else if (nx == columnDtlAdv_slip_sts_typ) doDtlAdv_slip_sts_typ_NX(info);
		else if (nx == columnDtlAdv_slip_sts_typ_nm) doDtlAdv_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtlAdv_rcv_mtd_cd) doDtlAdv_rcv_mtd_cd_NX(info);
		else if (nx == columnDtlAdv_rcv_mtd_nm) doDtlAdv_rcv_mtd_nm_NX(info);
		else if (nx == columnDtlAdv_rcv_dt) doDtlAdv_rcv_dt_NX(info);
		else if (nx == columnDtlAdv_tax_cd) doDtlAdv_tax_cd_NX(info);
		else if (nx == columnDtlAdv_tax_nm) doDtlAdv_tax_nm_NX(info);
		else if (nx == columnDtlAdv_inc_tax_flg) doDtlAdv_inc_tax_flg_NX(info);
		else if (nx == columnDtlAdv_tax_rate) doDtlAdv_tax_rate_NX(info);
		else if (nx == columnDtlAdv_trd_cur_amt) doDtlAdv_trd_cur_amt_NX(info);
		else if (nx == columnDtlAdv_trd_cur_tax_amt) doDtlAdv_trd_cur_tax_amt_NX(info);
		else if (nx == columnDtlAdv_trd_cur_inc_tax_amt) doDtlAdv_trd_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlAdv_base_cur_amt) doDtlAdv_base_cur_amt_NX(info);
		else if (nx == columnDtlAdv_base_cur_tax_amt) doDtlAdv_base_cur_tax_amt_NX(info);
		else if (nx == columnDtlAdv_base_cur_inc_tax_amt) doDtlAdv_base_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlAdv_sub_char1) doDtlAdv_sub_char1_NX(info);
		else if (nx == columnDtlAdv_sub_char2) doDtlAdv_sub_char2_NX(info);
		else if (nx == columnDtlAdv_sub_char3) doDtlAdv_sub_char3_NX(info);
		else if (nx == columnDtlAdv_ins_usr_id) doDtlAdv_ins_usr_id_NX(info);
		else if (nx == columnDtlAdv_ins_usr_nm) doDtlAdv_ins_usr_nm_NX(info);
		else if (nx == columnDtlAdv_ins_func_id) doDtlAdv_ins_func_id_NX(info);
		else if (nx == columnDtlAdv_ins_func_nm) doDtlAdv_ins_func_nm_NX(info);
		else if (nx == columnDtlAdv_upd_usr_id) doDtlAdv_upd_usr_id_NX(info);
		else if (nx == columnDtlAdv_upd_usr_nm) doDtlAdv_upd_usr_nm_NX(info);
		else if (nx == columnDtlAdv_upd_func_id) doDtlAdv_upd_func_id_NX(info);
		else if (nx == columnDtlAdv_upd_func_nm) doDtlAdv_upd_func_nm_NX(info);
		else if (nx == columnDtlAdv_ins_ts) doDtlAdv_ins_ts_NX(info);
		else if (nx == columnDtlAdv_upd_ts) doDtlAdv_upd_ts_NX(info);
		else if (nx == columnDtlAdv_upd_srv_req_no) doDtlAdv_upd_srv_req_no_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rev_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_each_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_each_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_xrate_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[last_bill_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sw_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sw_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ret_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ret_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sw_to_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sw_to_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_amt_bal]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_amt_bal_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_setoff_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_setoff_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_setoff_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_setoff_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NX(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_sls_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_sls_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sundry_itm_flg_NX(MCEventInfo info){
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
	 * [DtlSls]パネルの[trd_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_qty_NX(MCEventInfo info){
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
	 * [DtlSls]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_dscnt_amt_NX(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_d_rmrks_NX(MCEventInfo info){
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
	 * [DtlSls]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_d_seq_NX(MCEventInfo info){
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
	 * [DtlRcv]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_srv_req_no_NX(MCEventInfo info){
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
	 * [DtlAdv]パネルの[rcv_mtd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_mtd_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_mtd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_mtd_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bill_no) doCnd_bill_no_LC(info);
		else if (lc == Cnd_bill_rev) doCnd_bill_rev_LC(info);
		else if (lc == Hdr_bill_no) doHdr_bill_no_LC(info);
		else if (lc == Hdr_bill_rev) doHdr_bill_rev_LC(info);
		else if (lc == Hdr_bill_cl_dt) doHdr_bill_cl_dt_LC(info);
		else if (lc == Hdr_bill_dt) doHdr_bill_dt_LC(info);
		else if (lc == Hdr_iv_no) doHdr_iv_no_LC(info);
		else if (lc == Hdr_bcst_cd) doHdr_bcst_cd_LC(info);
		else if (lc == Hdr_bcst_nm) doHdr_bcst_nm_LC(info);
		else if (lc == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_LC(info);
		else if (lc == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_bill_xrate) doHdr_bill_xrate_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_last_bill_amt) doHdr_last_bill_amt_LC(info);
		else if (lc == Hdr_rcv_amt) doHdr_rcv_amt_LC(info);
		else if (lc == Hdr_sw_amt) doHdr_sw_amt_LC(info);
		else if (lc == Hdr_bfw_amt) doHdr_bfw_amt_LC(info);
		else if (lc == Hdr_sls_amt) doHdr_sls_amt_LC(info);
		else if (lc == Hdr_dscnt_amt) doHdr_dscnt_amt_LC(info);
		else if (lc == Hdr_ret_amt) doHdr_ret_amt_LC(info);
		else if (lc == Hdr_setoff_amt) doHdr_setoff_amt_LC(info);
		else if (lc == Hdr_tax_amt) doHdr_tax_amt_LC(info);
		else if (lc == Hdr_sw_to_amt) doHdr_sw_to_amt_LC(info);
		else if (lc == Hdr_bill_amt) doHdr_bill_amt_LC(info);
		else if (lc == Hdr_adv_amt_bal) doHdr_adv_amt_bal_LC(info);
		else if (lc == Hdr_adv_amt) doHdr_adv_amt_LC(info);
		else if (lc == Hdr_adv_setoff_amt) doHdr_adv_setoff_amt_LC(info);
		else if (lc == Hdr_adv_setoff_tax_amt) doHdr_adv_setoff_tax_amt_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
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
		else if (lc == columnDtlSls_trd_cd) doDtlSls_trd_cd_LC(info);
		else if (lc == columnDtlSls_trd_nm) doDtlSls_trd_nm_LC(info);
		else if (lc == columnDtlSls_slip_sts_typ) doDtlSls_slip_sts_typ_LC(info);
		else if (lc == columnDtlSls_slip_sts_typ_nm) doDtlSls_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtlSls_dlv_dt) doDtlSls_dlv_dt_LC(info);
		else if (lc == columnDtlSls_base_sls_ac_dt) doDtlSls_base_sls_ac_dt_LC(info);
		else if (lc == columnDtlSls_cst_itm_cd) doDtlSls_cst_itm_cd_LC(info);
		else if (lc == columnDtlSls_cst_itm_nm) doDtlSls_cst_itm_nm_LC(info);
		else if (lc == columnDtlSls_trd_unit_cd) doDtlSls_trd_unit_cd_LC(info);
		else if (lc == columnDtlSls_trd_unit_nm) doDtlSls_trd_unit_nm_LC(info);
		else if (lc == columnDtlSls_trd_unit_qty) doDtlSls_trd_unit_qty_LC(info);
		else if (lc == columnDtlSls_tax_cd) doDtlSls_tax_cd_LC(info);
		else if (lc == columnDtlSls_tax_nm) doDtlSls_tax_nm_LC(info);
		else if (lc == columnDtlSls_tax_rate) doDtlSls_tax_rate_LC(info);
		else if (lc == columnDtlSls_trd_cur_upri) doDtlSls_trd_cur_upri_LC(info);
		else if (lc == columnDtlSls_trd_cur_amt) doDtlSls_trd_cur_amt_LC(info);
		else if (lc == columnDtlSls_trd_cur_tax_amt) doDtlSls_trd_cur_tax_amt_LC(info);
		else if (lc == columnDtlSls_trd_cur_inc_tax_amt) doDtlSls_trd_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlSls_trd_cur_dscnt_amt) doDtlSls_trd_cur_dscnt_amt_LC(info);
		else if (lc == columnDtlSls_base_cur_upri) doDtlSls_base_cur_upri_LC(info);
		else if (lc == columnDtlSls_base_cur_amt) doDtlSls_base_cur_amt_LC(info);
		else if (lc == columnDtlSls_base_cur_tax_amt) doDtlSls_base_cur_tax_amt_LC(info);
		else if (lc == columnDtlSls_base_cur_inc_tax_amt) doDtlSls_base_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlSls_base_cur_dscnt_amt) doDtlSls_base_cur_dscnt_amt_LC(info);
		else if (lc == columnDtlSls_cst_cd) doDtlSls_cst_cd_LC(info);
		else if (lc == columnDtlSls_cst_nm) doDtlSls_cst_nm_LC(info);
		else if (lc == columnDtlSls_dlv_cd) doDtlSls_dlv_cd_LC(info);
		else if (lc == columnDtlSls_dlv_nm) doDtlSls_dlv_nm_LC(info);
		else if (lc == columnDtlSls_trd_d_rmrks) doDtlSls_trd_d_rmrks_LC(info);
		else if (lc == columnDtlSls_dlv_slip_no) doDtlSls_dlv_slip_no_LC(info);
		else if (lc == columnDtlSls_dlv_slip_d_no) doDtlSls_dlv_slip_d_no_LC(info);
		else if (lc == columnDtlSls_ship_dlv_slip_no) doDtlSls_ship_dlv_slip_no_LC(info);
		else if (lc == columnDtlSls_ship_dlv_slip_d_no) doDtlSls_ship_dlv_slip_d_no_LC(info);
		else if (lc == columnDtlSls_bill_mtd_typ) doDtlSls_bill_mtd_typ_LC(info);
		else if (lc == columnDtlSls_bill_mtd_typ_nm) doDtlSls_bill_mtd_typ_nm_LC(info);
		else if (lc == columnDtlSls_sls_act_no) doDtlSls_sls_act_no_LC(info);
		else if (lc == columnDtlSls_sls_act_seq) doDtlSls_sls_act_seq_LC(info);
		else if (lc == columnDtlSls_sls_act_rev) doDtlSls_sls_act_rev_LC(info);
		else if (lc == columnDtlSls_sls_act_d_no) doDtlSls_sls_act_d_no_LC(info);
		else if (lc == columnDtlSls_sls_act_d_seq) doDtlSls_sls_act_d_seq_LC(info);
		else if (lc == columnDtlSls_sub_char1) doDtlSls_sub_char1_LC(info);
		else if (lc == columnDtlSls_sub_char2) doDtlSls_sub_char2_LC(info);
		else if (lc == columnDtlSls_sub_char3) doDtlSls_sub_char3_LC(info);
		else if (lc == columnDtlSls_ins_usr_id) doDtlSls_ins_usr_id_LC(info);
		else if (lc == columnDtlSls_ins_usr_nm) doDtlSls_ins_usr_nm_LC(info);
		else if (lc == columnDtlSls_ins_func_id) doDtlSls_ins_func_id_LC(info);
		else if (lc == columnDtlSls_ins_func_nm) doDtlSls_ins_func_nm_LC(info);
		else if (lc == columnDtlSls_upd_usr_id) doDtlSls_upd_usr_id_LC(info);
		else if (lc == columnDtlSls_upd_usr_nm) doDtlSls_upd_usr_nm_LC(info);
		else if (lc == columnDtlSls_upd_func_id) doDtlSls_upd_func_id_LC(info);
		else if (lc == columnDtlSls_upd_func_nm) doDtlSls_upd_func_nm_LC(info);
		else if (lc == columnDtlSls_ins_ts) doDtlSls_ins_ts_LC(info);
		else if (lc == columnDtlSls_upd_ts) doDtlSls_upd_ts_LC(info);
		else if (lc == columnDtlSls_upd_srv_req_no) doDtlSls_upd_srv_req_no_LC(info);
		else if (lc == columnDtlRcv_rcv_act_no) doDtlRcv_rcv_act_no_LC(info);
		else if (lc == columnDtlRcv_rcv_act_seq) doDtlRcv_rcv_act_seq_LC(info);
		else if (lc == columnDtlRcv_rcv_act_rev) doDtlRcv_rcv_act_rev_LC(info);
		else if (lc == columnDtlRcv_rcv_act_d_no) doDtlRcv_rcv_act_d_no_LC(info);
		else if (lc == columnDtlRcv_rcv_act_d_seq) doDtlRcv_rcv_act_d_seq_LC(info);
		else if (lc == columnDtlRcv_trd_cd) doDtlRcv_trd_cd_LC(info);
		else if (lc == columnDtlRcv_trd_nm) doDtlRcv_trd_nm_LC(info);
		else if (lc == columnDtlRcv_slip_sts_typ) doDtlRcv_slip_sts_typ_LC(info);
		else if (lc == columnDtlRcv_slip_sts_typ_nm) doDtlRcv_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtlRcv_rcv_mtd_cd) doDtlRcv_rcv_mtd_cd_LC(info);
		else if (lc == columnDtlRcv_rcv_mtd_nm) doDtlRcv_rcv_mtd_nm_LC(info);
		else if (lc == columnDtlRcv_rcv_dt) doDtlRcv_rcv_dt_LC(info);
		else if (lc == columnDtlRcv_tax_cd) doDtlRcv_tax_cd_LC(info);
		else if (lc == columnDtlRcv_tax_nm) doDtlRcv_tax_nm_LC(info);
		else if (lc == columnDtlRcv_tax_rate) doDtlRcv_tax_rate_LC(info);
		else if (lc == columnDtlRcv_trd_cur_amt) doDtlRcv_trd_cur_amt_LC(info);
		else if (lc == columnDtlRcv_trd_cur_tax_amt) doDtlRcv_trd_cur_tax_amt_LC(info);
		else if (lc == columnDtlRcv_trd_cur_inc_tax_amt) doDtlRcv_trd_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlRcv_base_cur_amt) doDtlRcv_base_cur_amt_LC(info);
		else if (lc == columnDtlRcv_base_cur_tax_amt) doDtlRcv_base_cur_tax_amt_LC(info);
		else if (lc == columnDtlRcv_base_cur_inc_tax_amt) doDtlRcv_base_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlRcv_bill_d_rmrks) doDtlRcv_bill_d_rmrks_LC(info);
		else if (lc == columnDtlRcv_sub_char1) doDtlRcv_sub_char1_LC(info);
		else if (lc == columnDtlRcv_sub_char2) doDtlRcv_sub_char2_LC(info);
		else if (lc == columnDtlRcv_sub_char3) doDtlRcv_sub_char3_LC(info);
		else if (lc == columnDtlRcv_ins_usr_id) doDtlRcv_ins_usr_id_LC(info);
		else if (lc == columnDtlRcv_ins_usr_nm) doDtlRcv_ins_usr_nm_LC(info);
		else if (lc == columnDtlRcv_ins_func_id) doDtlRcv_ins_func_id_LC(info);
		else if (lc == columnDtlRcv_ins_func_nm) doDtlRcv_ins_func_nm_LC(info);
		else if (lc == columnDtlRcv_upd_usr_id) doDtlRcv_upd_usr_id_LC(info);
		else if (lc == columnDtlRcv_upd_usr_nm) doDtlRcv_upd_usr_nm_LC(info);
		else if (lc == columnDtlRcv_upd_func_id) doDtlRcv_upd_func_id_LC(info);
		else if (lc == columnDtlRcv_upd_func_nm) doDtlRcv_upd_func_nm_LC(info);
		else if (lc == columnDtlRcv_ins_ts) doDtlRcv_ins_ts_LC(info);
		else if (lc == columnDtlRcv_upd_ts) doDtlRcv_upd_ts_LC(info);
		else if (lc == columnDtlRcv_upd_srv_req_no) doDtlRcv_upd_srv_req_no_LC(info);
		else if (lc == columnDtlAdv_rcv_act_no) doDtlAdv_rcv_act_no_LC(info);
		else if (lc == columnDtlAdv_rcv_act_seq) doDtlAdv_rcv_act_seq_LC(info);
		else if (lc == columnDtlAdv_rcv_act_rev) doDtlAdv_rcv_act_rev_LC(info);
		else if (lc == columnDtlAdv_rcv_act_d_no) doDtlAdv_rcv_act_d_no_LC(info);
		else if (lc == columnDtlAdv_rcv_act_d_seq) doDtlAdv_rcv_act_d_seq_LC(info);
		else if (lc == columnDtlAdv_trd_cd) doDtlAdv_trd_cd_LC(info);
		else if (lc == columnDtlAdv_trd_nm) doDtlAdv_trd_nm_LC(info);
		else if (lc == columnDtlAdv_slip_sts_typ) doDtlAdv_slip_sts_typ_LC(info);
		else if (lc == columnDtlAdv_slip_sts_typ_nm) doDtlAdv_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtlAdv_rcv_mtd_cd) doDtlAdv_rcv_mtd_cd_LC(info);
		else if (lc == columnDtlAdv_rcv_mtd_nm) doDtlAdv_rcv_mtd_nm_LC(info);
		else if (lc == columnDtlAdv_rcv_dt) doDtlAdv_rcv_dt_LC(info);
		else if (lc == columnDtlAdv_tax_cd) doDtlAdv_tax_cd_LC(info);
		else if (lc == columnDtlAdv_tax_nm) doDtlAdv_tax_nm_LC(info);
		else if (lc == columnDtlAdv_tax_rate) doDtlAdv_tax_rate_LC(info);
		else if (lc == columnDtlAdv_trd_cur_amt) doDtlAdv_trd_cur_amt_LC(info);
		else if (lc == columnDtlAdv_trd_cur_tax_amt) doDtlAdv_trd_cur_tax_amt_LC(info);
		else if (lc == columnDtlAdv_trd_cur_inc_tax_amt) doDtlAdv_trd_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlAdv_base_cur_amt) doDtlAdv_base_cur_amt_LC(info);
		else if (lc == columnDtlAdv_base_cur_tax_amt) doDtlAdv_base_cur_tax_amt_LC(info);
		else if (lc == columnDtlAdv_base_cur_inc_tax_amt) doDtlAdv_base_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlAdv_sub_char1) doDtlAdv_sub_char1_LC(info);
		else if (lc == columnDtlAdv_sub_char2) doDtlAdv_sub_char2_LC(info);
		else if (lc == columnDtlAdv_sub_char3) doDtlAdv_sub_char3_LC(info);
		else if (lc == columnDtlAdv_ins_usr_id) doDtlAdv_ins_usr_id_LC(info);
		else if (lc == columnDtlAdv_ins_usr_nm) doDtlAdv_ins_usr_nm_LC(info);
		else if (lc == columnDtlAdv_ins_func_id) doDtlAdv_ins_func_id_LC(info);
		else if (lc == columnDtlAdv_ins_func_nm) doDtlAdv_ins_func_nm_LC(info);
		else if (lc == columnDtlAdv_upd_usr_id) doDtlAdv_upd_usr_id_LC(info);
		else if (lc == columnDtlAdv_upd_usr_nm) doDtlAdv_upd_usr_nm_LC(info);
		else if (lc == columnDtlAdv_upd_func_id) doDtlAdv_upd_func_id_LC(info);
		else if (lc == columnDtlAdv_upd_func_nm) doDtlAdv_upd_func_nm_LC(info);
		else if (lc == columnDtlAdv_ins_ts) doDtlAdv_ins_ts_LC(info);
		else if (lc == columnDtlAdv_upd_ts) doDtlAdv_upd_ts_LC(info);
		else if (lc == columnDtlAdv_upd_srv_req_no) doDtlAdv_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rev_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_cl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_xrate_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[last_bill_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_bill_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sw_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sw_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ret_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ret_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[setoff_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_setoff_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sw_to_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sw_to_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_amt_bal]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_amt_bal_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_setoff_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_setoff_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_setoff_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_setoff_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_LC(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_sls_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_sls_ac_dt_LC(MCEventInfo info){
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
	 * [DtlSls]パネルの[trd_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_unit_qty_LC(MCEventInfo info){
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
	 * [DtlSls]パネルの[trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_cur_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_cur_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[base_cur_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_base_cur_dscnt_amt_LC(MCEventInfo info){
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
	 * [DtlSls]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_trd_d_rmrks_LC(MCEventInfo info){
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
	 * [DtlSls]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sls_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sls_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlSls]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSls_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[rcv_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_act_d_seq_LC(MCEventInfo info){
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
	 * [DtlRcv]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[trd_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_trd_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[base_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_base_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[bill_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_bill_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlRcv]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlRcv_upd_srv_req_no_LC(MCEventInfo info){
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
	 * [DtlAdv]パネルの[rcv_mtd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_mtd_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_mtd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_mtd_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[trd_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_trd_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[base_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_base_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdv]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdv_upd_srv_req_no_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0290.Srch01")) {
			return new MS_MSBGL0290_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0290_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0290_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0290_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0290_Srch01Bridge() {
			p_MS_MSBGL0290_Srch01 = new MCParam(PDef.MS_MSBGL0290_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0290_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0290.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0290.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0290.DtlSlsR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0290.DtlRcvR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0290.DtlAdvR.class));

			p_MS_MSBGL0290_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0290_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0290_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0290_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0290_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0290.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0290.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0290.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0290.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0290.DtlSlsR> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0290.DtlSlsR>)down(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0290.DtlRcvR> down2() {
			return (MCList<mcframe.clientMSBG.MSBGP0290.DtlRcvR>)down(2);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0290.DtlAdvR> down3() {
			return (MCList<mcframe.clientMSBG.MSBGP0290.DtlAdvR>)down(3);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0290_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0290.HdrR.create());
			p_MS_MSBGL0290_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0290.DtlSlsR.class));
			p_MS_MSBGL0290_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0290.DtlRcvR.class));
			p_MS_MSBGL0290_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0290.DtlAdvR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0290_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0290.HdrR)p_MS_MSBGL0290_Srch01.getContainerParam().getDownBlock(0));
			setDtlSlsL((MCList<mcframe.clientMSBG.MSBGP0290.DtlSlsR>)p_MS_MSBGL0290_Srch01.getContainerParam().getDownBlock(1));
			setDtlRcvL((MCList<mcframe.clientMSBG.MSBGP0290.DtlRcvR>)p_MS_MSBGL0290_Srch01.getContainerParam().getDownBlock(2));
			setDtlAdvL((MCList<mcframe.clientMSBG.MSBGP0290.DtlAdvR>)p_MS_MSBGL0290_Srch01.getContainerParam().getDownBlock(3));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlSlsL().clear();
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
			result.add(getDtlRcvL());
			result.add(getDtlAdvL());
			return result;
		}
	}
}