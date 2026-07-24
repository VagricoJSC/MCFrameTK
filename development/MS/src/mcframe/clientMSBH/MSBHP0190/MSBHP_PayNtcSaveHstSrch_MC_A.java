package mcframe.clientMSBH.MSBHP0190;

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
import mcframe.clientMSBH.MSBHP0190.MSBHP_PayNtcSaveHstSrch_MC.MS_MSBHL0190_Srch01Caller;

/**
 * 画面"MSBHP_PayNtcSaveHstSrch"パネルクラスです。<p>
 *
 * 支払通知書の履歴を照会する<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_PayNtcSaveHstSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBHP0190";

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
	public MCLabel Cnd_pay_chk_no_Label = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pay_chk_no = null;
	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_pay_ntc_rev = null;
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
	public MCLabel Hdr_pay_chk_no_Label = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_pay_chk_no = null;
	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_pay_ntc_rev = null;
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
	public MCLabel Hdr_bsppl_cl_dt_Label = null;
	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCDateField Hdr_bsppl_cl_dt = null;
	public MCLabel Hdr_reg_dt_Label = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDateField Hdr_reg_dt = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCCheckBox Hdr_pay_spot_flg = null;
	public MCLabel Hdr_rcpt_iv_no_Label = null;
	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_rcpt_iv_no = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Hdr_wrk_no_p_PPanel;
	public MCTextField Hdr_wrk_no;	// [Hdr]の[wrk_no_p.wrk_no]を[Hdr_wrk_no]としてエイリアス定義。
	public MCTextField Hdr_wrk_nm;	// [Hdr]の[wrk_no_p.wrk_nm]を[Hdr_wrk_nm]としてエイリアス定義。
	public MCLabel Hdr_bsppl_cd_Label = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCTextField Hdr_bsppl_nm = null;
	public MCLabel Hdr_bsppl_dpt_cd_Label = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCTextField Hdr_bsppl_dpt_nm = null;
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
	public MCLabel Hdr_pay_xrate_Label = null;
	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumberField Hdr_pay_xrate = null;
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
	public MCLabel Hdr_last_pay_schd_amt_Label = null;
	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public MCNumberField Hdr_last_pay_schd_amt = null;
	public MCLabel Hdr_pay_amt_Label = null;
	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public MCNumberField Hdr_pay_amt = null;
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
	public MCLabel Hdr_purc_amt_Label = null;
	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public MCNumberField Hdr_purc_amt = null;
	public MCLabel Hdr_purc_dscnt_amt_Label = null;
	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumberField Hdr_purc_dscnt_amt = null;
	public MCLabel Hdr_purc_ret_amt_Label = null;
	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumberField Hdr_purc_ret_amt = null;
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
	public MCLabel Hdr_schd_pay_amt_Label = null;
	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public MCNumberField Hdr_schd_pay_amt = null;
	public MCLabel Hdr_adv_pay_bal_Label = null;
	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public MCNumberField Hdr_adv_pay_bal = null;
	public MCLabel Hdr_adv_pay_amt_Label = null;
	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public MCNumberField Hdr_adv_pay_amt = null;
	public MCLabel Hdr_adv_pay_setoff_amt_Label = null;
	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public MCNumberField Hdr_adv_pay_setoff_amt = null;
	public MCLabel Hdr_adv_pay_setoff_tax_amt_Label = null;
	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public MCNumberField Hdr_adv_pay_setoff_tax_amt = null;
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
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [DtlApd]ブロック関連のField定義
	public MCPanel DtlApdPanel = null;
	public MCTitledBorder DtlApdTitledBorder = null;
	public MCScrollPane DtlApdScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0190.DtlApdR> DtlApdTable = null;
	// [DtlApd]ブロックの項目のField定義
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_nm = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_slip_sts_typ = null;
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_slip_sts_typ_nm = null;
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_act_dt = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DtlApd_itm_p_PPanel;
	public MCColumnConfig columnDtlApd_itm_cd;// [DtlApd]の[itm_p.itm_cd]を[columnDtlApd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlApd_itm_sub1;// [DtlApd]の[itm_p.itm_sub1]を[columnDtlApd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtlApd_itm_sub2;// [DtlApd]の[itm_p.itm_sub2]を[columnDtlApd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtlApd_itm_sub3;// [DtlApd]の[itm_p.itm_sub3]を[columnDtlApd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtlApd_itm_nm;// [DtlApd]の[itm_p.itm_nm]を[columnDtlApd_itm_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_sundry_itm_flg = null;
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_sppl_itm_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_unit_nm = null;
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_unit_qty = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_tax_nm = null;
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_inc_tax_flg = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_tax_rate = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_interim_flg = null;
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_cur_upri = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_cur_amt = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_cur_tax_amt = null;
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_cur_inc_tax_amt = null;
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_trd_cur_dscnt_amt = null;
	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_base_cur_upri = null;
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_base_cur_amt = null;
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_base_cur_tax_amt = null;
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_base_cur_inc_tax_amt = null;
	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_base_cur_dscnt_amt = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_sppl_nm = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_asppl_nm = null;
	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_pay_mtd_typ = null;
	/**
	 * Payment method type name 支払方式区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_pay_mtd_typ_nm = null;
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_base_purc_ac_dt = null;
	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_pay_ntc_d_print_rmrks = null;
	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_ap_d_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_po_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_po_d_no = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_purc_act_no = null;
	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_purc_act_rev = null;
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_purc_act_d_no = null;
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_bp_dlv_slip_no = null;
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_bp_dlv_slip_d_no = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_upd_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlApd_upd_srv_req_no = null;
	// [DtlPanel]ブロック関連のField定義
	public MCPanel DtlPanelPanel = null;
	// [DtlPanel]ブロックの項目のField定義
	// [DtlAct]ブロック関連のField定義
	public MCPanel DtlActPanel = null;
	public MCTitledBorder DtlActTitledBorder = null;
	public MCScrollPane DtlActScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0190.DtlActR> DtlActTable = null;
	// [DtlAct]ブロックの項目のField定義
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_pay_act_no = null;
	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_pay_act_seq = null;
	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_pay_act_d_no = null;
	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_pay_act_d_seq = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_ap_sttl_nm = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_slip_sts_typ = null;
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_slip_sts_typ_nm = null;
	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_pay_act_dt = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_tax_nm = null;
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_inc_tax_flg = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_tax_rate = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_trd_cur_amt = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_trd_cur_tax_amt = null;
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_trd_cur_inc_tax_amt = null;
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_base_cur_amt = null;
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_base_cur_tax_amt = null;
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_base_cur_inc_tax_amt = null;
	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_pay_ntc_d_print_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_upd_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAct_upd_srv_req_no = null;
	// [DtlAdvPayAct]ブロック関連のField定義
	public MCPanel DtlAdvPayActPanel = null;
	public MCTitledBorder DtlAdvPayActTitledBorder = null;
	public MCScrollPane DtlAdvPayActScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR> DtlAdvPayActTable = null;
	// [DtlAdvPayAct]ブロックの項目のField定義
	/**
	 * Advance payment result No. 前渡金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_adv_pay_act_no = null;
	/**
	 * Advance payment result sequence number 前渡金実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_adv_pay_act_seq = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_ap_sttl_nm = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_slip_sts_typ = null;
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_slip_sts_typ_nm = null;
	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_pay_act_dt = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_tax_nm = null;
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_inc_tax_flg = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_tax_rate = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_trd_cur_amt = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_trd_cur_tax_amt = null;
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_trd_cur_inc_tax_amt = null;
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_base_cur_amt = null;
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_base_cur_tax_amt = null;
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_base_cur_inc_tax_amt = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_upd_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlAdvPayAct_upd_srv_req_no = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MS_MSBHL0190_Srch01]のCallerの作成 */
	protected MSBHP_PayNtcSaveHstSrch_MC.MS_MSBHL0190_Srch01Caller createMS_MSBHL0190_Srch01() {
		MSBHP_PayNtcSaveHstSrch_MC.MS_MSBHL0190_Srch01Caller<MSBHP_PayNtcSaveHstSrch, MS_MSBHL0190_Srch01Bridge>
		caller = ((MSBHP_PayNtcSaveHstSrch_MC)this).new MS_MSBHL0190_Srch01Caller<MSBHP_PayNtcSaveHstSrch, MS_MSBHL0190_Srch01Bridge>(
					(MSBHP_PayNtcSaveHstSrch)this, new MS_MSBHL0190_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0190_Srch01]の呼び出し */
	protected void callMS_MSBHL0190_Srch01() {
		MCCaller caller = createMS_MSBHL0190_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0190.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0190.HdrR aHdrR;
	/** [DtlApd]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0190.DtlApdR> aDtlApdL;
	/** [DtlAct]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0190.DtlActR> aDtlActL;
	/** [DtlAdvPayAct]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR> aDtlAdvPayActL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0190.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0190.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0190.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0190.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBH.MSBHP0190.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBH.MSBHP0190.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBH.MSBHP0190.HdrR createHdrR() {
		return mcframe.clientMSBH.MSBHP0190.HdrR.create();
	}

	/**
	 * コピーによってaDtlApdLを設定します。
	 *
	 * aDtlApdLのインスタンスは変更されません。
	 *
	 * @param dataset DtlApdL
	 */
	public void setDtlApdL(MCList<mcframe.clientMSBH.MSBHP0190.DtlApdR> aList) {
		if (getDtlApdL() != aList) {
			getDtlApdL().setAll(aList);
		}
	}

	/**
	 * [DtlApd]ブロックのコンテナaDtlApdLを返します。
	 *
	 * @return DtlApdL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0190.DtlApdR> getDtlApdL() {
		return aDtlApdL;
	}

	/**
	 * aDtlApdRを作成します。
	 *
	 * @return DtlApdR
	 */
	public mcframe.clientMSBH.MSBHP0190.DtlApdR createDtlApdR() {
		return mcframe.clientMSBH.MSBHP0190.DtlApdR.create();
	}

	/**
	 * aDtlApdLを作成します。
	 *
	 * @return DtlApdL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0190.DtlApdR> createDtlApdL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0190.DtlApdR.class);
	}

	/**
	 * DtlApdTableを初期化します。
	 */
	protected void createDtlApdTable(){
		if(DtlApdTable == null){
			DtlApdTable = beansFactory.createTable2("DtlApd.table");
		}
	}

	/**
	 * コピーによってaDtlActLを設定します。
	 *
	 * aDtlActLのインスタンスは変更されません。
	 *
	 * @param dataset DtlActL
	 */
	public void setDtlActL(MCList<mcframe.clientMSBH.MSBHP0190.DtlActR> aList) {
		if (getDtlActL() != aList) {
			getDtlActL().setAll(aList);
		}
	}

	/**
	 * [DtlAct]ブロックのコンテナaDtlActLを返します。
	 *
	 * @return DtlActL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0190.DtlActR> getDtlActL() {
		return aDtlActL;
	}

	/**
	 * aDtlActRを作成します。
	 *
	 * @return DtlActR
	 */
	public mcframe.clientMSBH.MSBHP0190.DtlActR createDtlActR() {
		return mcframe.clientMSBH.MSBHP0190.DtlActR.create();
	}

	/**
	 * aDtlActLを作成します。
	 *
	 * @return DtlActL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0190.DtlActR> createDtlActL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0190.DtlActR.class);
	}

	/**
	 * DtlActTableを初期化します。
	 */
	protected void createDtlActTable(){
		if(DtlActTable == null){
			DtlActTable = beansFactory.createTable2("DtlAct.table");
		}
	}

	/**
	 * コピーによってaDtlAdvPayActLを設定します。
	 *
	 * aDtlAdvPayActLのインスタンスは変更されません。
	 *
	 * @param dataset DtlAdvPayActL
	 */
	public void setDtlAdvPayActL(MCList<mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR> aList) {
		if (getDtlAdvPayActL() != aList) {
			getDtlAdvPayActL().setAll(aList);
		}
	}

	/**
	 * [DtlAdvPayAct]ブロックのコンテナaDtlAdvPayActLを返します。
	 *
	 * @return DtlAdvPayActL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR> getDtlAdvPayActL() {
		return aDtlAdvPayActL;
	}

	/**
	 * aDtlAdvPayActRを作成します。
	 *
	 * @return DtlAdvPayActR
	 */
	public mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR createDtlAdvPayActR() {
		return mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.create();
	}

	/**
	 * aDtlAdvPayActLを作成します。
	 *
	 * @return DtlAdvPayActL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR> createDtlAdvPayActL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.class);
	}

	/**
	 * DtlAdvPayActTableを初期化します。
	 */
	protected void createDtlAdvPayActTable(){
		if(DtlAdvPayActTable == null){
			DtlAdvPayActTable = beansFactory.createTable2("DtlAdvPayAct.table");
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
		if(!MCCollectionUtil.contains(ret, getDtlApdL())) ret.add(getDtlApdL());
		if(!MCCollectionUtil.contains(ret, getDtlActL())) ret.add(getDtlActL());
		if(!MCCollectionUtil.contains(ret, getDtlAdvPayActL())) ret.add(getDtlAdvPayActL());
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
		if(aCnt == getDtlApdL()) return "DtlApd";
		if(aCnt == getDtlActL()) return "DtlAct";
		if(aCnt == getDtlAdvPayActL()) return "DtlAdvPayAct";
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
		if(bId.equals("DtlApd")) return getDtlApdL();
		if(bId.equals("DtlAct")) return getDtlActL();
		if(bId.equals("DtlAdvPayAct")) return getDtlAdvPayActL();
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
		ret.add(DtlApdPanel);
		ret.add(DtlPanelPanel);
		ret.add(DtlActPanel);
		ret.add(DtlAdvPayActPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_PayNtcSaveHstSrch_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlApdL = createDtlApdL();
		aDtlActL = createDtlActL();
		aDtlAdvPayActL = createDtlAdvPayActL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_PayNtcSaveHstSrch_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlApdL = createDtlApdL();
		createDtlApdTable();
		DtlApdTable.setRowName(name);
		aDtlActL = createDtlActL();
		createDtlActTable();
		DtlActTable.setRowName(name);
		aDtlAdvPayActL = createDtlAdvPayActL();
		createDtlAdvPayActTable();
		DtlAdvPayActTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBHP_PayNtcSaveHstSrch_MC.jbCreateCnd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbCreateHdrTab((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbCreateHdr((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbCreateHdr2((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbCreateDtlApd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbCreateDtlPanel((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbCreateDtlAct((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbCreateDtlAdvPayAct((MSBHP_PayNtcSaveHstSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_PayNtcSaveHstSrch p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBHP_PayNtcSaveHstSrch p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBHP_PayNtcSaveHstSrch p) {
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
	protected static void jbCreateHdr2(MSBHP_PayNtcSaveHstSrch p) {
	}

	/**
	 * [DtlApd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlApd(MSBHP_PayNtcSaveHstSrch p) {
		p.DtlApd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBH.MSBHP0190.DtlApdR.$itm_p);
		p.DtlApd_itm_p_PPanel.setName("DtlApd.itm_p");
		p.columnDtlApd_itm_cd = p.DtlApd_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtlApd_itm_cd.addAliasName("DtlApd.itm_cd", p);
		p.columnDtlApd_itm_sub1 = p.DtlApd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtlApd_itm_sub1.addAliasName("DtlApd.itm_sub1", p);
		p.columnDtlApd_itm_sub2 = p.DtlApd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtlApd_itm_sub2.addAliasName("DtlApd.itm_sub2", p);
		p.columnDtlApd_itm_sub3 = p.DtlApd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtlApd_itm_sub3.addAliasName("DtlApd.itm_sub3", p);
		p.columnDtlApd_itm_nm = p.DtlApd_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtlApd_itm_nm.addAliasName("DtlApd.itm_nm", p);
	}

	/**
	 * [DtlPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlPanel(MSBHP_PayNtcSaveHstSrch p) {
	}

	/**
	 * [DtlAct]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlAct(MSBHP_PayNtcSaveHstSrch p) {
	}

	/**
	 * [DtlAdvPayAct]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlAdvPayAct(MSBHP_PayNtcSaveHstSrch p) {
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
	public static MSBHP_PayNtcSaveHstSrch create(){
		MSBHP_PayNtcSaveHstSrch p = new MSBHP_PayNtcSaveHstSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_PayNtcSaveHstSrch create(String name){
		MSBHP_PayNtcSaveHstSrch p = new MSBHP_PayNtcSaveHstSrch(name);
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
		MSBHP_PayNtcSaveHstSrch_MC.jbfInitCnd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbfInitHdrTab((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbfInitHdr((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbfInitHdr2((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbfInitDtlApd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbfInitDtlPanel((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbfInitDtlAct((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbfInitDtlAdvPayAct((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbInitCnd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbInitHdrTab((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbInitHdr((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbInitHdr2((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbInitDtlApd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbInitDtlPanel((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbInitDtlAct((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.jbInitDtlAdvPayAct((MSBHP_PayNtcSaveHstSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_pay_chk_no_Label = p.beansFactory.createLabel("Cnd.pay_chk_no_Label");
		p.Cnd_pay_chk_no = p.beansFactory.createTextField("Cnd.pay_chk_no");
		p.Cnd_pay_chk_no.setLabel(p.Cnd_pay_chk_no_Label);
		p.Cnd_pay_ntc_rev = p.beansFactory.createNumberField("Cnd.pay_ntc_rev");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_pay_chk_no_Label = p.beansFactory.createLabel("Hdr.pay_chk_no_Label");
		p.Hdr_pay_chk_no = p.beansFactory.createTextField("Hdr.pay_chk_no");
		p.Hdr_pay_chk_no.setLabel(p.Hdr_pay_chk_no_Label);
		p.Hdr_pay_ntc_rev = p.beansFactory.createNumberField("Hdr.pay_ntc_rev");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_bsppl_cl_dt_Label = p.beansFactory.createLabel("Hdr.bsppl_cl_dt_Label");
		p.Hdr_bsppl_cl_dt = p.beansFactory.createDateField("Hdr.bsppl_cl_dt");
		p.Hdr_bsppl_cl_dt.setLabel(p.Hdr_bsppl_cl_dt_Label);
		p.Hdr_reg_dt_Label = p.beansFactory.createLabel("Hdr.reg_dt_Label");
		p.Hdr_reg_dt = p.beansFactory.createDateField("Hdr.reg_dt");
		p.Hdr_reg_dt.setLabel(p.Hdr_reg_dt_Label);
		p.Hdr_pay_spot_flg = p.beansFactory.createCheckBox("Hdr.pay_spot_flg");
		p.Hdr_rcpt_iv_no_Label = p.beansFactory.createLabel("Hdr.rcpt_iv_no_Label");
		p.Hdr_rcpt_iv_no = p.beansFactory.createTextField("Hdr.rcpt_iv_no");
		p.Hdr_rcpt_iv_no.setLabel(p.Hdr_rcpt_iv_no_Label);
		p.Hdr_bsppl_cd_Label = p.beansFactory.createLabel("Hdr.bsppl_cd_Label");
		p.Hdr_bsppl_cd = p.beansFactory.createTextField("Hdr.bsppl_cd");
		p.Hdr_bsppl_cd.setLabel(p.Hdr_bsppl_cd_Label);
		p.Hdr_bsppl_nm = p.beansFactory.createTextField("Hdr.bsppl_nm");
		p.Hdr_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Hdr.bsppl_dpt_cd_Label");
		p.Hdr_bsppl_dpt_cd = p.beansFactory.createTextField("Hdr.bsppl_dpt_cd");
		p.Hdr_bsppl_dpt_cd.setLabel(p.Hdr_bsppl_dpt_cd_Label);
		p.Hdr_bsppl_dpt_nm = p.beansFactory.createTextField("Hdr.bsppl_dpt_nm");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_pay_xrate_Label = p.beansFactory.createLabel("Hdr.pay_xrate_Label");
		p.Hdr_pay_xrate = p.beansFactory.createNumberField("Hdr.pay_xrate");
		p.Hdr_pay_xrate.setLabel(p.Hdr_pay_xrate_Label);
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextField("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
		p.Hdr_last_pay_schd_amt_Label = p.beansFactory.createLabel("Hdr.last_pay_schd_amt_Label");
		p.Hdr_last_pay_schd_amt = p.beansFactory.createNumberField("Hdr.last_pay_schd_amt");
		p.Hdr_last_pay_schd_amt.setLabel(p.Hdr_last_pay_schd_amt_Label);
		p.Hdr_pay_amt_Label = p.beansFactory.createLabel("Hdr.pay_amt_Label");
		p.Hdr_pay_amt = p.beansFactory.createNumberField("Hdr.pay_amt");
		p.Hdr_pay_amt.setLabel(p.Hdr_pay_amt_Label);
		p.Hdr_sw_amt_Label = p.beansFactory.createLabel("Hdr.sw_amt_Label");
		p.Hdr_sw_amt = p.beansFactory.createNumberField("Hdr.sw_amt");
		p.Hdr_sw_amt.setLabel(p.Hdr_sw_amt_Label);
		p.Hdr_bfw_amt_Label = p.beansFactory.createLabel("Hdr.bfw_amt_Label");
		p.Hdr_bfw_amt = p.beansFactory.createNumberField("Hdr.bfw_amt");
		p.Hdr_bfw_amt.setLabel(p.Hdr_bfw_amt_Label);
		p.Hdr_purc_amt_Label = p.beansFactory.createLabel("Hdr.purc_amt_Label");
		p.Hdr_purc_amt = p.beansFactory.createNumberField("Hdr.purc_amt");
		p.Hdr_purc_amt.setLabel(p.Hdr_purc_amt_Label);
		p.Hdr_purc_dscnt_amt_Label = p.beansFactory.createLabel("Hdr.purc_dscnt_amt_Label");
		p.Hdr_purc_dscnt_amt = p.beansFactory.createNumberField("Hdr.purc_dscnt_amt");
		p.Hdr_purc_dscnt_amt.setLabel(p.Hdr_purc_dscnt_amt_Label);
		p.Hdr_purc_ret_amt_Label = p.beansFactory.createLabel("Hdr.purc_ret_amt_Label");
		p.Hdr_purc_ret_amt = p.beansFactory.createNumberField("Hdr.purc_ret_amt");
		p.Hdr_purc_ret_amt.setLabel(p.Hdr_purc_ret_amt_Label);
		p.Hdr_setoff_amt_Label = p.beansFactory.createLabel("Hdr.setoff_amt_Label");
		p.Hdr_setoff_amt = p.beansFactory.createNumberField("Hdr.setoff_amt");
		p.Hdr_setoff_amt.setLabel(p.Hdr_setoff_amt_Label);
		p.Hdr_tax_amt_Label = p.beansFactory.createLabel("Hdr.tax_amt_Label");
		p.Hdr_tax_amt = p.beansFactory.createNumberField("Hdr.tax_amt");
		p.Hdr_tax_amt.setLabel(p.Hdr_tax_amt_Label);
		p.Hdr_sw_to_amt_Label = p.beansFactory.createLabel("Hdr.sw_to_amt_Label");
		p.Hdr_sw_to_amt = p.beansFactory.createNumberField("Hdr.sw_to_amt");
		p.Hdr_sw_to_amt.setLabel(p.Hdr_sw_to_amt_Label);
		p.Hdr_schd_pay_amt_Label = p.beansFactory.createLabel("Hdr.schd_pay_amt_Label");
		p.Hdr_schd_pay_amt = p.beansFactory.createNumberField("Hdr.schd_pay_amt");
		p.Hdr_schd_pay_amt.setLabel(p.Hdr_schd_pay_amt_Label);
		p.Hdr_adv_pay_bal_Label = p.beansFactory.createLabel("Hdr.adv_pay_bal_Label");
		p.Hdr_adv_pay_bal = p.beansFactory.createNumberField("Hdr.adv_pay_bal");
		p.Hdr_adv_pay_bal.setLabel(p.Hdr_adv_pay_bal_Label);
		p.Hdr_adv_pay_amt_Label = p.beansFactory.createLabel("Hdr.adv_pay_amt_Label");
		p.Hdr_adv_pay_amt = p.beansFactory.createNumberField("Hdr.adv_pay_amt");
		p.Hdr_adv_pay_amt.setLabel(p.Hdr_adv_pay_amt_Label);
		p.Hdr_adv_pay_setoff_amt_Label = p.beansFactory.createLabel("Hdr.adv_pay_setoff_amt_Label");
		p.Hdr_adv_pay_setoff_amt = p.beansFactory.createNumberField("Hdr.adv_pay_setoff_amt");
		p.Hdr_adv_pay_setoff_amt.setLabel(p.Hdr_adv_pay_setoff_amt_Label);
		p.Hdr_adv_pay_setoff_tax_amt_Label = p.beansFactory.createLabel("Hdr.adv_pay_setoff_tax_amt_Label");
		p.Hdr_adv_pay_setoff_tax_amt = p.beansFactory.createNumberField("Hdr.adv_pay_setoff_tax_amt");
		p.Hdr_adv_pay_setoff_tax_amt.setLabel(p.Hdr_adv_pay_setoff_tax_amt_Label);
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
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlApd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlApd(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlApdPanel = p.beansFactory.createPanel("DtlApd");
		p.DtlApdTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlApdScrollPane = p.beansFactory.createScrollPane("DtlApd.scroll");
		p.createDtlApdTable();
		// ブロックの項目の初期化
		p.columnDtlApd_trd_cd = p.beansFactory.createTableColumn("DtlApd.trd_cd", MCColumnType.TEXT);
		p.columnDtlApd_trd_nm = p.beansFactory.createTableColumn("DtlApd.trd_nm", MCColumnType.TEXT);
		p.columnDtlApd_slip_sts_typ = p.beansFactory.createTableColumn("DtlApd.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtlApd_slip_sts_typ_nm = p.beansFactory.createTableColumn("DtlApd.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtlApd_act_dt = p.beansFactory.createTableColumn("DtlApd.act_dt", MCColumnType.DATE);
		p.columnDtlApd_sundry_itm_flg = p.beansFactory.createTableColumn("DtlApd.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtlApd_sppl_itm_cd = p.beansFactory.createTableColumn("DtlApd.sppl_itm_cd", MCColumnType.TEXT);
		p.columnDtlApd_sppl_itm_nm = p.beansFactory.createTableColumn("DtlApd.sppl_itm_nm", MCColumnType.TEXT);
		p.columnDtlApd_trd_unit_cd = p.beansFactory.createTableColumn("DtlApd.trd_unit_cd", MCColumnType.TEXT);
		p.columnDtlApd_trd_unit_nm = p.beansFactory.createTableColumn("DtlApd.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtlApd_trd_unit_qty = p.beansFactory.createTableColumn("DtlApd.trd_unit_qty", MCColumnType.NUMBER);
		p.columnDtlApd_tax_cd = p.beansFactory.createTableColumn("DtlApd.tax_cd", MCColumnType.TEXT);
		p.columnDtlApd_tax_nm = p.beansFactory.createTableColumn("DtlApd.tax_nm", MCColumnType.TEXT);
		p.columnDtlApd_inc_tax_flg = p.beansFactory.createTableColumn("DtlApd.inc_tax_flg", MCColumnType.CHECK);
		p.columnDtlApd_tax_rate = p.beansFactory.createTableColumn("DtlApd.tax_rate", MCColumnType.NUMBER);
		p.columnDtlApd_interim_flg = p.beansFactory.createTableColumn("DtlApd.interim_flg", MCColumnType.CHECK);
		p.columnDtlApd_trd_cur_upri = p.beansFactory.createTableColumn("DtlApd.trd_cur_upri", MCColumnType.NUMBER);
		p.columnDtlApd_trd_cur_amt = p.beansFactory.createTableColumn("DtlApd.trd_cur_amt", MCColumnType.NUMBER);
		p.columnDtlApd_trd_cur_tax_amt = p.beansFactory.createTableColumn("DtlApd.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlApd_trd_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlApd.trd_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlApd_trd_cur_dscnt_amt = p.beansFactory.createTableColumn("DtlApd.trd_cur_dscnt_amt", MCColumnType.NUMBER);
		p.columnDtlApd_base_cur_upri = p.beansFactory.createTableColumn("DtlApd.base_cur_upri", MCColumnType.NUMBER);
		p.columnDtlApd_base_cur_amt = p.beansFactory.createTableColumn("DtlApd.base_cur_amt", MCColumnType.NUMBER);
		p.columnDtlApd_base_cur_tax_amt = p.beansFactory.createTableColumn("DtlApd.base_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlApd_base_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlApd.base_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlApd_base_cur_dscnt_amt = p.beansFactory.createTableColumn("DtlApd.base_cur_dscnt_amt", MCColumnType.NUMBER);
		p.columnDtlApd_sppl_cd = p.beansFactory.createTableColumn("DtlApd.sppl_cd", MCColumnType.TEXT);
		p.columnDtlApd_sppl_nm = p.beansFactory.createTableColumn("DtlApd.sppl_nm", MCColumnType.TEXT);
		p.columnDtlApd_asppl_cd = p.beansFactory.createTableColumn("DtlApd.asppl_cd", MCColumnType.TEXT);
		p.columnDtlApd_asppl_nm = p.beansFactory.createTableColumn("DtlApd.asppl_nm", MCColumnType.TEXT);
		p.columnDtlApd_pay_mtd_typ = p.beansFactory.createTableColumn("DtlApd.pay_mtd_typ", MCColumnType.TEXT);
		p.columnDtlApd_pay_mtd_typ_nm = p.beansFactory.createTableColumn("DtlApd.pay_mtd_typ_nm", MCColumnType.TEXT);
		p.columnDtlApd_base_purc_ac_dt = p.beansFactory.createTableColumn("DtlApd.base_purc_ac_dt", MCColumnType.DATE);
		p.columnDtlApd_pay_ntc_d_print_rmrks = p.beansFactory.createTableColumn("DtlApd.pay_ntc_d_print_rmrks", MCColumnType.TEXT);
		p.columnDtlApd_ap_d_no = p.beansFactory.createTableColumn("DtlApd.ap_d_no", MCColumnType.TEXT);
		p.columnDtlApd_po_no = p.beansFactory.createTableColumn("DtlApd.po_no", MCColumnType.TEXT);
		p.columnDtlApd_po_d_no = p.beansFactory.createTableColumn("DtlApd.po_d_no", MCColumnType.TEXT);
		p.columnDtlApd_purc_act_no = p.beansFactory.createTableColumn("DtlApd.purc_act_no", MCColumnType.TEXT);
		p.columnDtlApd_purc_act_rev = p.beansFactory.createTableColumn("DtlApd.purc_act_rev", MCColumnType.NUMBER);
		p.columnDtlApd_purc_act_d_no = p.beansFactory.createTableColumn("DtlApd.purc_act_d_no", MCColumnType.TEXT);
		p.columnDtlApd_bp_dlv_slip_no = p.beansFactory.createTableColumn("DtlApd.bp_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtlApd_bp_dlv_slip_d_no = p.beansFactory.createTableColumn("DtlApd.bp_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtlApd_sub_char1 = p.beansFactory.createTableColumn("DtlApd.sub_char1", MCColumnType.TEXT);
		p.columnDtlApd_sub_char2 = p.beansFactory.createTableColumn("DtlApd.sub_char2", MCColumnType.TEXT);
		p.columnDtlApd_sub_char3 = p.beansFactory.createTableColumn("DtlApd.sub_char3", MCColumnType.TEXT);
		p.columnDtlApd_ins_usr_id = p.beansFactory.createTableColumn("DtlApd.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlApd_ins_usr_nm = p.beansFactory.createTableColumn("DtlApd.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlApd_ins_func_id = p.beansFactory.createTableColumn("DtlApd.ins_func_id", MCColumnType.TEXT);
		p.columnDtlApd_ins_func_nm = p.beansFactory.createTableColumn("DtlApd.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlApd_upd_usr_id = p.beansFactory.createTableColumn("DtlApd.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlApd_upd_usr_nm = p.beansFactory.createTableColumn("DtlApd.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlApd_upd_func_id = p.beansFactory.createTableColumn("DtlApd.upd_func_id", MCColumnType.TEXT);
		p.columnDtlApd_upd_func_nm = p.beansFactory.createTableColumn("DtlApd.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlApd_ins_ts = p.beansFactory.createTableColumn("DtlApd.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlApd_upd_ts = p.beansFactory.createTableColumn("DtlApd.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlApd_upd_srv_req_no = p.beansFactory.createTableColumn("DtlApd.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [DtlPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlPanel(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlPanelPanel = p.beansFactory.createPanel("DtlPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlAct]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlAct(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlActPanel = p.beansFactory.createPanel("DtlAct");
		p.DtlActTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlActScrollPane = p.beansFactory.createScrollPane("DtlAct.scroll");
		p.createDtlActTable();
		// ブロックの項目の初期化
		p.columnDtlAct_pay_act_no = p.beansFactory.createTableColumn("DtlAct.pay_act_no", MCColumnType.TEXT);
		p.columnDtlAct_pay_act_seq = p.beansFactory.createTableColumn("DtlAct.pay_act_seq", MCColumnType.NUMBER);
		p.columnDtlAct_pay_act_d_no = p.beansFactory.createTableColumn("DtlAct.pay_act_d_no", MCColumnType.TEXT);
		p.columnDtlAct_pay_act_d_seq = p.beansFactory.createTableColumn("DtlAct.pay_act_d_seq", MCColumnType.NUMBER);
		p.columnDtlAct_ap_sttl_cd = p.beansFactory.createTableColumn("DtlAct.ap_sttl_cd", MCColumnType.TEXT);
		p.columnDtlAct_ap_sttl_nm = p.beansFactory.createTableColumn("DtlAct.ap_sttl_nm", MCColumnType.TEXT);
		p.columnDtlAct_slip_sts_typ = p.beansFactory.createTableColumn("DtlAct.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtlAct_slip_sts_typ_nm = p.beansFactory.createTableColumn("DtlAct.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtlAct_pay_act_dt = p.beansFactory.createTableColumn("DtlAct.pay_act_dt", MCColumnType.DATE);
		p.columnDtlAct_tax_cd = p.beansFactory.createTableColumn("DtlAct.tax_cd", MCColumnType.TEXT);
		p.columnDtlAct_tax_nm = p.beansFactory.createTableColumn("DtlAct.tax_nm", MCColumnType.TEXT);
		p.columnDtlAct_inc_tax_flg = p.beansFactory.createTableColumn("DtlAct.inc_tax_flg", MCColumnType.CHECK);
		p.columnDtlAct_tax_rate = p.beansFactory.createTableColumn("DtlAct.tax_rate", MCColumnType.NUMBER);
		p.columnDtlAct_trd_cur_amt = p.beansFactory.createTableColumn("DtlAct.trd_cur_amt", MCColumnType.NUMBER);
		p.columnDtlAct_trd_cur_tax_amt = p.beansFactory.createTableColumn("DtlAct.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAct_trd_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlAct.trd_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAct_base_cur_amt = p.beansFactory.createTableColumn("DtlAct.base_cur_amt", MCColumnType.NUMBER);
		p.columnDtlAct_base_cur_tax_amt = p.beansFactory.createTableColumn("DtlAct.base_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAct_base_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlAct.base_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAct_pay_ntc_d_print_rmrks = p.beansFactory.createTableColumn("DtlAct.pay_ntc_d_print_rmrks", MCColumnType.TEXT);
		p.columnDtlAct_sub_char1 = p.beansFactory.createTableColumn("DtlAct.sub_char1", MCColumnType.TEXT);
		p.columnDtlAct_sub_char2 = p.beansFactory.createTableColumn("DtlAct.sub_char2", MCColumnType.TEXT);
		p.columnDtlAct_sub_char3 = p.beansFactory.createTableColumn("DtlAct.sub_char3", MCColumnType.TEXT);
		p.columnDtlAct_ins_usr_id = p.beansFactory.createTableColumn("DtlAct.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlAct_ins_usr_nm = p.beansFactory.createTableColumn("DtlAct.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlAct_ins_func_id = p.beansFactory.createTableColumn("DtlAct.ins_func_id", MCColumnType.TEXT);
		p.columnDtlAct_ins_func_nm = p.beansFactory.createTableColumn("DtlAct.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlAct_upd_usr_id = p.beansFactory.createTableColumn("DtlAct.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlAct_upd_usr_nm = p.beansFactory.createTableColumn("DtlAct.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlAct_upd_func_id = p.beansFactory.createTableColumn("DtlAct.upd_func_id", MCColumnType.TEXT);
		p.columnDtlAct_upd_func_nm = p.beansFactory.createTableColumn("DtlAct.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlAct_ins_ts = p.beansFactory.createTableColumn("DtlAct.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlAct_upd_ts = p.beansFactory.createTableColumn("DtlAct.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlAct_upd_srv_req_no = p.beansFactory.createTableColumn("DtlAct.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [DtlAdvPayAct]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlAdvPayAct(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlAdvPayActPanel = p.beansFactory.createPanel("DtlAdvPayAct");
		p.DtlAdvPayActTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlAdvPayActScrollPane = p.beansFactory.createScrollPane("DtlAdvPayAct.scroll");
		p.createDtlAdvPayActTable();
		// ブロックの項目の初期化
		p.columnDtlAdvPayAct_adv_pay_act_no = p.beansFactory.createTableColumn("DtlAdvPayAct.adv_pay_act_no", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_adv_pay_act_seq = p.beansFactory.createTableColumn("DtlAdvPayAct.adv_pay_act_seq", MCColumnType.NUMBER);
		p.columnDtlAdvPayAct_ap_sttl_cd = p.beansFactory.createTableColumn("DtlAdvPayAct.ap_sttl_cd", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_ap_sttl_nm = p.beansFactory.createTableColumn("DtlAdvPayAct.ap_sttl_nm", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_slip_sts_typ = p.beansFactory.createTableColumn("DtlAdvPayAct.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_slip_sts_typ_nm = p.beansFactory.createTableColumn("DtlAdvPayAct.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_pay_act_dt = p.beansFactory.createTableColumn("DtlAdvPayAct.pay_act_dt", MCColumnType.DATE);
		p.columnDtlAdvPayAct_tax_cd = p.beansFactory.createTableColumn("DtlAdvPayAct.tax_cd", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_tax_nm = p.beansFactory.createTableColumn("DtlAdvPayAct.tax_nm", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_inc_tax_flg = p.beansFactory.createTableColumn("DtlAdvPayAct.inc_tax_flg", MCColumnType.CHECK);
		p.columnDtlAdvPayAct_tax_rate = p.beansFactory.createTableColumn("DtlAdvPayAct.tax_rate", MCColumnType.NUMBER);
		p.columnDtlAdvPayAct_trd_cur_amt = p.beansFactory.createTableColumn("DtlAdvPayAct.trd_cur_amt", MCColumnType.NUMBER);
		p.columnDtlAdvPayAct_trd_cur_tax_amt = p.beansFactory.createTableColumn("DtlAdvPayAct.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAdvPayAct_trd_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlAdvPayAct.trd_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAdvPayAct_base_cur_amt = p.beansFactory.createTableColumn("DtlAdvPayAct.base_cur_amt", MCColumnType.NUMBER);
		p.columnDtlAdvPayAct_base_cur_tax_amt = p.beansFactory.createTableColumn("DtlAdvPayAct.base_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAdvPayAct_base_cur_inc_tax_amt = p.beansFactory.createTableColumn("DtlAdvPayAct.base_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtlAdvPayAct_sub_char1 = p.beansFactory.createTableColumn("DtlAdvPayAct.sub_char1", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_sub_char2 = p.beansFactory.createTableColumn("DtlAdvPayAct.sub_char2", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_sub_char3 = p.beansFactory.createTableColumn("DtlAdvPayAct.sub_char3", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_ins_usr_id = p.beansFactory.createTableColumn("DtlAdvPayAct.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_ins_usr_nm = p.beansFactory.createTableColumn("DtlAdvPayAct.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_ins_func_id = p.beansFactory.createTableColumn("DtlAdvPayAct.ins_func_id", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_ins_func_nm = p.beansFactory.createTableColumn("DtlAdvPayAct.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_upd_usr_id = p.beansFactory.createTableColumn("DtlAdvPayAct.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_upd_usr_nm = p.beansFactory.createTableColumn("DtlAdvPayAct.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_upd_func_id = p.beansFactory.createTableColumn("DtlAdvPayAct.upd_func_id", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_upd_func_nm = p.beansFactory.createTableColumn("DtlAdvPayAct.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlAdvPayAct_ins_ts = p.beansFactory.createTableColumn("DtlAdvPayAct.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlAdvPayAct_upd_ts = p.beansFactory.createTableColumn("DtlAdvPayAct.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlAdvPayAct_upd_srv_req_no = p.beansFactory.createTableColumn("DtlAdvPayAct.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_pay_chk_no_Label);
		p.CndPanel.add(p.Cnd_pay_chk_no);
		p.CndPanel.setLastBeans(p.Cnd_pay_chk_no);
		p.Cnd_pay_chk_no.setNextBeans(p.Cnd_pay_ntc_rev);
		p.Cnd_pay_chk_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0190.CndR.pay_chk_no_META);
		p.CndPanel.add(p.Cnd_pay_ntc_rev);
		p.Cnd_pay_ntc_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_pay_ntc_rev.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0190.CndR.pay_ntc_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0190.CndR.latest_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlApdPanel);
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
	protected static void jbInitHdr(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_pay_chk_no_Label);
		p.HdrPanel.add(p.Hdr_pay_chk_no);
		p.HdrPanel.setLastBeans(p.Hdr_pay_chk_no);
		p.Hdr_pay_chk_no.setNextBeans(p.Hdr_pay_ntc_rev);
		p.Hdr_pay_chk_no.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.pay_chk_no_META);
		p.HdrPanel.add(p.Hdr_pay_ntc_rev);
		p.Hdr_pay_ntc_rev.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_pay_ntc_rev.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.pay_ntc_rev_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_can_flg);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_bsppl_cl_dt);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.can_flg_META);
		p.HdrPanel.add(p.Hdr_bsppl_cl_dt_Label);
		p.HdrPanel.add(p.Hdr_bsppl_cl_dt);
		p.Hdr_bsppl_cl_dt.setNextBeans(p.Hdr_reg_dt);
		p.Hdr_bsppl_cl_dt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.bsppl_cl_dt_META);
		p.Hdr_bsppl_cl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_reg_dt_Label);
		p.HdrPanel.add(p.Hdr_reg_dt);
		p.Hdr_reg_dt.setNextBeans(p.Hdr_pay_spot_flg);
		p.Hdr_reg_dt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.reg_dt_META);
		p.Hdr_reg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_pay_spot_flg);
		p.Hdr_pay_spot_flg.setNextBeans(p.Hdr_rcpt_iv_no);
		p.Hdr_pay_spot_flg.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.pay_spot_flg_META);
		p.HdrPanel.add(p.Hdr_rcpt_iv_no_Label);
		p.HdrPanel.add(p.Hdr_rcpt_iv_no);
		p.Hdr_rcpt_iv_no.setNextBeans(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_rcpt_iv_no.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.rcpt_iv_no_META);
		p.HdrPanel.add(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_wrk_no_p_PPanel.setNextBeans(p.Hdr_bsppl_cd);
		p.HdrPanel.add(p.Hdr_bsppl_cd_Label);
		p.HdrPanel.add(p.Hdr_bsppl_cd);
		p.Hdr_bsppl_cd.setNextBeans(p.Hdr_bsppl_nm);
		p.Hdr_bsppl_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.bsppl_cd_META);
		p.HdrPanel.add(p.Hdr_bsppl_nm);
		p.Hdr_bsppl_nm.setNextBeans(p.Hdr_bsppl_dpt_cd);
		p.Hdr_bsppl_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.bsppl_nm_META);
		p.HdrPanel.add(p.Hdr_bsppl_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_bsppl_dpt_cd);
		p.Hdr_bsppl_dpt_cd.setNextBeans(p.Hdr_bsppl_dpt_nm);
		p.Hdr_bsppl_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.bsppl_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_bsppl_dpt_nm);
		p.Hdr_bsppl_dpt_nm.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_bsppl_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.bsppl_dpt_nm_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_pay_xrate);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_pay_xrate_Label);
		p.HdrPanel.add(p.Hdr_pay_xrate);
		p.Hdr_pay_xrate.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_pay_xrate.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.pay_xrate_META);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_base_cur_cd);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_last_pay_schd_amt);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_last_pay_schd_amt_Label);
		p.HdrPanel.add(p.Hdr_last_pay_schd_amt);
		p.Hdr_last_pay_schd_amt.setNextBeans(p.Hdr_pay_amt);
		p.Hdr_last_pay_schd_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.last_pay_schd_amt_META);
		p.HdrPanel.add(p.Hdr_pay_amt_Label);
		p.HdrPanel.add(p.Hdr_pay_amt);
		p.Hdr_pay_amt.setNextBeans(p.Hdr_sw_amt);
		p.Hdr_pay_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.pay_amt_META);
		p.HdrPanel.add(p.Hdr_sw_amt_Label);
		p.HdrPanel.add(p.Hdr_sw_amt);
		p.Hdr_sw_amt.setNextBeans(p.Hdr_bfw_amt);
		p.Hdr_sw_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.sw_amt_META);
		p.HdrPanel.add(p.Hdr_bfw_amt_Label);
		p.HdrPanel.add(p.Hdr_bfw_amt);
		p.Hdr_bfw_amt.setNextBeans(p.Hdr_purc_amt);
		p.Hdr_bfw_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.bfw_amt_META);
		p.HdrPanel.add(p.Hdr_purc_amt_Label);
		p.HdrPanel.add(p.Hdr_purc_amt);
		p.Hdr_purc_amt.setNextBeans(p.Hdr_purc_dscnt_amt);
		p.Hdr_purc_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.purc_amt_META);
		p.HdrPanel.add(p.Hdr_purc_dscnt_amt_Label);
		p.HdrPanel.add(p.Hdr_purc_dscnt_amt);
		p.Hdr_purc_dscnt_amt.setNextBeans(p.Hdr_purc_ret_amt);
		p.Hdr_purc_dscnt_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.purc_dscnt_amt_META);
		p.HdrPanel.add(p.Hdr_purc_ret_amt_Label);
		p.HdrPanel.add(p.Hdr_purc_ret_amt);
		p.Hdr_purc_ret_amt.setNextBeans(p.Hdr_setoff_amt);
		p.Hdr_purc_ret_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.purc_ret_amt_META);
		p.HdrPanel.add(p.Hdr_setoff_amt_Label);
		p.HdrPanel.add(p.Hdr_setoff_amt);
		p.Hdr_setoff_amt.setNextBeans(p.Hdr_tax_amt);
		p.Hdr_setoff_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.setoff_amt_META);
		p.HdrPanel.add(p.Hdr_tax_amt_Label);
		p.HdrPanel.add(p.Hdr_tax_amt);
		p.Hdr_tax_amt.setNextBeans(p.Hdr_sw_to_amt);
		p.Hdr_tax_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.tax_amt_META);
		p.HdrPanel.add(p.Hdr_sw_to_amt_Label);
		p.HdrPanel.add(p.Hdr_sw_to_amt);
		p.Hdr_sw_to_amt.setNextBeans(p.Hdr_schd_pay_amt);
		p.Hdr_sw_to_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.sw_to_amt_META);
		p.HdrPanel.add(p.Hdr_schd_pay_amt_Label);
		p.HdrPanel.add(p.Hdr_schd_pay_amt);
		p.Hdr_schd_pay_amt.setNextBeans(p.Hdr_adv_pay_bal);
		p.Hdr_schd_pay_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.schd_pay_amt_META);
		p.HdrPanel.add(p.Hdr_adv_pay_bal_Label);
		p.HdrPanel.add(p.Hdr_adv_pay_bal);
		p.Hdr_adv_pay_bal.setNextBeans(p.Hdr_adv_pay_amt);
		p.Hdr_adv_pay_bal.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.adv_pay_bal_META);
		p.HdrPanel.add(p.Hdr_adv_pay_amt_Label);
		p.HdrPanel.add(p.Hdr_adv_pay_amt);
		p.Hdr_adv_pay_amt.setNextBeans(p.Hdr_adv_pay_setoff_amt);
		p.Hdr_adv_pay_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.adv_pay_amt_META);
		p.HdrPanel.add(p.Hdr_adv_pay_setoff_amt_Label);
		p.HdrPanel.add(p.Hdr_adv_pay_setoff_amt);
		p.Hdr_adv_pay_setoff_amt.setNextBeans(p.Hdr_adv_pay_setoff_tax_amt);
		p.Hdr_adv_pay_setoff_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.adv_pay_setoff_amt_META);
		p.HdrPanel.add(p.Hdr_adv_pay_setoff_tax_amt_Label);
		p.HdrPanel.add(p.Hdr_adv_pay_setoff_tax_amt);
		p.Hdr_adv_pay_setoff_tax_amt.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_adv_pay_setoff_tax_amt.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.adv_pay_setoff_tax_amt_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.sub_char3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0190.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [DtlApd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlApd(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlApdPanel.setBorder(p.DtlApdTitledBorder);
		p.add(p.DtlApdPanel);
		p.DtlApdPanel.setNextBeans(p.DtlPanelPanel);
		p.DtlApdPanel.add(p.DtlApdScrollPane);
		p.DtlApdPanel.setLastBeans(p.DtlApdTable);
		p.DtlApdScrollPane.setViewportView(p.DtlApdTable);
		p.DtlApdTable.setList(p.getDtlApdL());
		p.DtlApdTable.setStatusColumnVisible(false);
		p.DtlApdPanel.setLayoutPosition("CBCTC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlPanel(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanelPanel);
		p.DtlPanelPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.DtlPanelPanel.add(p.DtlActPanel, null);
		p.DtlPanelPanel.setLastBeans(p.DtlActPanel);
		p.DtlActPanel.setNextBeans(p.DtlAdvPayActPanel);
		p.DtlPanelPanel.add(p.DtlAdvPayActPanel, null);
	}

	/**
	 * [DtlAct]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlAct(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlActPanel.setBorder(p.DtlActTitledBorder);
		p.DtlActPanel.add(p.DtlActScrollPane);
		p.DtlActPanel.setLastBeans(p.DtlActTable);
		p.DtlActScrollPane.setViewportView(p.DtlActTable);
		p.DtlActTable.setList(p.getDtlActL());
		p.DtlActTable.setStatusColumnVisible(false);
		p.DtlActPanel.setLayoutPosition("CLC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlAdvPayAct]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlAdvPayAct(MSBHP_PayNtcSaveHstSrch p) {
		// ブロック関連の初期化
		p.DtlAdvPayActPanel.setBorder(p.DtlAdvPayActTitledBorder);
		p.DtlAdvPayActPanel.add(p.DtlAdvPayActScrollPane);
		p.DtlAdvPayActPanel.setLastBeans(p.DtlAdvPayActTable);
		p.DtlAdvPayActScrollPane.setViewportView(p.DtlAdvPayActTable);
		p.DtlAdvPayActTable.setList(p.getDtlAdvPayActL());
		p.DtlAdvPayActTable.setStatusColumnVisible(false);
		p.DtlAdvPayActPanel.setLayoutPosition("CRC");
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
		MSBHP_PayNtcSaveHstSrch_MC.mcInitCnd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.mcInitHdrTab((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.mcInitHdr((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.mcInitHdr2((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.mcInitDtlApd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.mcInitDtlPanel((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.mcInitDtlAct((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.mcInitDtlAdvPayAct((MSBHP_PayNtcSaveHstSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBHP_PayNtcSaveHstSrch_MC.statusInitSRCH_Cnd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.statusInitSRCH_HdrTab((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.statusInitSRCH_Hdr((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.statusInitSRCH_Hdr2((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.statusInitSRCH_DtlApd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.statusInitSRCH_DtlPanel((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.statusInitSRCH_DtlAct((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.statusInitSRCH_DtlAdvPayAct((MSBHP_PayNtcSaveHstSrch)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_PayNtcSaveHstSrch p) {
		p.Cnd_pay_chk_no.setListListener(p);
		p.Cnd_pay_chk_no.addAllListener(p);
		p.Cnd_pay_ntc_rev.setListListener(p);
		p.Cnd_pay_ntc_rev.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBHP_PayNtcSaveHstSrch p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBHP_PayNtcSaveHstSrch p) {
		p.Hdr_pay_chk_no.setListListener(p);
		p.Hdr_pay_chk_no.addAllListener(p);
		p.Hdr_pay_ntc_rev.setListListener(p);
		p.Hdr_pay_ntc_rev.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_bsppl_cl_dt.setListListener(p);
		p.Hdr_bsppl_cl_dt.addAllListener(p);
		p.Hdr_reg_dt.setListListener(p);
		p.Hdr_reg_dt.addAllListener(p);
		p.Hdr_pay_spot_flg.addAllListener(p);
		p.Hdr_rcpt_iv_no.setListListener(p);
		p.Hdr_rcpt_iv_no.addAllListener(p);
		p.Hdr_bsppl_cd.setListListener(p);
		p.Hdr_bsppl_cd.addAllListener(p);
		p.Hdr_bsppl_nm.setListListener(p);
		p.Hdr_bsppl_nm.addAllListener(p);
		p.Hdr_bsppl_dpt_cd.setListListener(p);
		p.Hdr_bsppl_dpt_cd.addAllListener(p);
		p.Hdr_bsppl_dpt_nm.setListListener(p);
		p.Hdr_bsppl_dpt_nm.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_pay_xrate.setListListener(p);
		p.Hdr_pay_xrate.addAllListener(p);
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_base_cur_nm.setListListener(p);
		p.Hdr_base_cur_nm.addAllListener(p);
		p.Hdr_last_pay_schd_amt.setListListener(p);
		p.Hdr_last_pay_schd_amt.addAllListener(p);
		p.Hdr_pay_amt.setListListener(p);
		p.Hdr_pay_amt.addAllListener(p);
		p.Hdr_sw_amt.setListListener(p);
		p.Hdr_sw_amt.addAllListener(p);
		p.Hdr_bfw_amt.setListListener(p);
		p.Hdr_bfw_amt.addAllListener(p);
		p.Hdr_purc_amt.setListListener(p);
		p.Hdr_purc_amt.addAllListener(p);
		p.Hdr_purc_dscnt_amt.setListListener(p);
		p.Hdr_purc_dscnt_amt.addAllListener(p);
		p.Hdr_purc_ret_amt.setListListener(p);
		p.Hdr_purc_ret_amt.addAllListener(p);
		p.Hdr_setoff_amt.setListListener(p);
		p.Hdr_setoff_amt.addAllListener(p);
		p.Hdr_tax_amt.setListListener(p);
		p.Hdr_tax_amt.addAllListener(p);
		p.Hdr_sw_to_amt.setListListener(p);
		p.Hdr_sw_to_amt.addAllListener(p);
		p.Hdr_schd_pay_amt.setListListener(p);
		p.Hdr_schd_pay_amt.addAllListener(p);
		p.Hdr_adv_pay_bal.setListListener(p);
		p.Hdr_adv_pay_bal.addAllListener(p);
		p.Hdr_adv_pay_amt.setListListener(p);
		p.Hdr_adv_pay_amt.addAllListener(p);
		p.Hdr_adv_pay_setoff_amt.setListListener(p);
		p.Hdr_adv_pay_setoff_amt.addAllListener(p);
		p.Hdr_adv_pay_setoff_tax_amt.setListListener(p);
		p.Hdr_adv_pay_setoff_tax_amt.addAllListener(p);
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
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBHP_PayNtcSaveHstSrch p) {
	}

	/**
	 *  [DtlApd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlApd(MSBHP_PayNtcSaveHstSrch p) {
		p.DtlApdTable.addAllListener(p);
		p.columnDtlApd_trd_cd.addAllListener(p);
		p.columnDtlApd_trd_cd.setListListener(p);
		p.columnDtlApd_trd_nm.addAllListener(p);
		p.columnDtlApd_trd_nm.setListListener(p);
		p.columnDtlApd_slip_sts_typ.addAllListener(p);
		p.columnDtlApd_slip_sts_typ.setListListener(p);
		p.columnDtlApd_slip_sts_typ_nm.addAllListener(p);
		p.columnDtlApd_slip_sts_typ_nm.setListListener(p);
		p.columnDtlApd_act_dt.addAllListener(p);
		p.columnDtlApd_act_dt.setListListener(p);
		p.columnDtlApd_sundry_itm_flg.addAllListener(p);
		p.columnDtlApd_sppl_itm_cd.addAllListener(p);
		p.columnDtlApd_sppl_itm_cd.setListListener(p);
		p.columnDtlApd_sppl_itm_nm.addAllListener(p);
		p.columnDtlApd_sppl_itm_nm.setListListener(p);
		p.columnDtlApd_trd_unit_cd.addAllListener(p);
		p.columnDtlApd_trd_unit_cd.setListListener(p);
		p.columnDtlApd_trd_unit_nm.addAllListener(p);
		p.columnDtlApd_trd_unit_nm.setListListener(p);
		p.columnDtlApd_trd_unit_qty.addAllListener(p);
		p.columnDtlApd_trd_unit_qty.setListListener(p);
		p.columnDtlApd_tax_cd.addAllListener(p);
		p.columnDtlApd_tax_cd.setListListener(p);
		p.columnDtlApd_tax_nm.addAllListener(p);
		p.columnDtlApd_tax_nm.setListListener(p);
		p.columnDtlApd_inc_tax_flg.addAllListener(p);
		p.columnDtlApd_tax_rate.addAllListener(p);
		p.columnDtlApd_tax_rate.setListListener(p);
		p.columnDtlApd_interim_flg.addAllListener(p);
		p.columnDtlApd_trd_cur_upri.addAllListener(p);
		p.columnDtlApd_trd_cur_upri.setListListener(p);
		p.columnDtlApd_trd_cur_amt.addAllListener(p);
		p.columnDtlApd_trd_cur_amt.setListListener(p);
		p.columnDtlApd_trd_cur_tax_amt.addAllListener(p);
		p.columnDtlApd_trd_cur_tax_amt.setListListener(p);
		p.columnDtlApd_trd_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlApd_trd_cur_inc_tax_amt.setListListener(p);
		p.columnDtlApd_trd_cur_dscnt_amt.addAllListener(p);
		p.columnDtlApd_trd_cur_dscnt_amt.setListListener(p);
		p.columnDtlApd_base_cur_upri.addAllListener(p);
		p.columnDtlApd_base_cur_upri.setListListener(p);
		p.columnDtlApd_base_cur_amt.addAllListener(p);
		p.columnDtlApd_base_cur_amt.setListListener(p);
		p.columnDtlApd_base_cur_tax_amt.addAllListener(p);
		p.columnDtlApd_base_cur_tax_amt.setListListener(p);
		p.columnDtlApd_base_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlApd_base_cur_inc_tax_amt.setListListener(p);
		p.columnDtlApd_base_cur_dscnt_amt.addAllListener(p);
		p.columnDtlApd_base_cur_dscnt_amt.setListListener(p);
		p.columnDtlApd_sppl_cd.addAllListener(p);
		p.columnDtlApd_sppl_cd.setListListener(p);
		p.columnDtlApd_sppl_nm.addAllListener(p);
		p.columnDtlApd_sppl_nm.setListListener(p);
		p.columnDtlApd_asppl_cd.addAllListener(p);
		p.columnDtlApd_asppl_cd.setListListener(p);
		p.columnDtlApd_asppl_nm.addAllListener(p);
		p.columnDtlApd_asppl_nm.setListListener(p);
		p.columnDtlApd_pay_mtd_typ.addAllListener(p);
		p.columnDtlApd_pay_mtd_typ.setListListener(p);
		p.columnDtlApd_pay_mtd_typ_nm.addAllListener(p);
		p.columnDtlApd_pay_mtd_typ_nm.setListListener(p);
		p.columnDtlApd_base_purc_ac_dt.addAllListener(p);
		p.columnDtlApd_base_purc_ac_dt.setListListener(p);
		p.columnDtlApd_pay_ntc_d_print_rmrks.addAllListener(p);
		p.columnDtlApd_pay_ntc_d_print_rmrks.setListListener(p);
		p.columnDtlApd_ap_d_no.addAllListener(p);
		p.columnDtlApd_ap_d_no.setListListener(p);
		p.columnDtlApd_po_no.addAllListener(p);
		p.columnDtlApd_po_no.setListListener(p);
		p.columnDtlApd_po_d_no.addAllListener(p);
		p.columnDtlApd_po_d_no.setListListener(p);
		p.columnDtlApd_purc_act_no.addAllListener(p);
		p.columnDtlApd_purc_act_no.setListListener(p);
		p.columnDtlApd_purc_act_rev.addAllListener(p);
		p.columnDtlApd_purc_act_rev.setListListener(p);
		p.columnDtlApd_purc_act_d_no.addAllListener(p);
		p.columnDtlApd_purc_act_d_no.setListListener(p);
		p.columnDtlApd_bp_dlv_slip_no.addAllListener(p);
		p.columnDtlApd_bp_dlv_slip_no.setListListener(p);
		p.columnDtlApd_bp_dlv_slip_d_no.addAllListener(p);
		p.columnDtlApd_bp_dlv_slip_d_no.setListListener(p);
		p.columnDtlApd_sub_char1.addAllListener(p);
		p.columnDtlApd_sub_char1.setListListener(p);
		p.columnDtlApd_sub_char2.addAllListener(p);
		p.columnDtlApd_sub_char2.setListListener(p);
		p.columnDtlApd_sub_char3.addAllListener(p);
		p.columnDtlApd_sub_char3.setListListener(p);
		p.columnDtlApd_ins_usr_id.addAllListener(p);
		p.columnDtlApd_ins_usr_id.setListListener(p);
		p.columnDtlApd_ins_usr_nm.addAllListener(p);
		p.columnDtlApd_ins_usr_nm.setListListener(p);
		p.columnDtlApd_ins_func_id.addAllListener(p);
		p.columnDtlApd_ins_func_id.setListListener(p);
		p.columnDtlApd_ins_func_nm.addAllListener(p);
		p.columnDtlApd_ins_func_nm.setListListener(p);
		p.columnDtlApd_upd_usr_id.addAllListener(p);
		p.columnDtlApd_upd_usr_id.setListListener(p);
		p.columnDtlApd_upd_usr_nm.addAllListener(p);
		p.columnDtlApd_upd_usr_nm.setListListener(p);
		p.columnDtlApd_upd_func_id.addAllListener(p);
		p.columnDtlApd_upd_func_id.setListListener(p);
		p.columnDtlApd_upd_func_nm.addAllListener(p);
		p.columnDtlApd_upd_func_nm.setListListener(p);
		p.columnDtlApd_ins_ts.addAllListener(p);
		p.columnDtlApd_ins_ts.setListListener(p);
		p.columnDtlApd_upd_ts.addAllListener(p);
		p.columnDtlApd_upd_ts.setListListener(p);
		p.columnDtlApd_upd_srv_req_no.addAllListener(p);
		p.columnDtlApd_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [DtlPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlPanel(MSBHP_PayNtcSaveHstSrch p) {
	}

	/**
	 *  [DtlAct]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlAct(MSBHP_PayNtcSaveHstSrch p) {
		p.DtlActTable.addAllListener(p);
		p.columnDtlAct_pay_act_no.addAllListener(p);
		p.columnDtlAct_pay_act_no.setListListener(p);
		p.columnDtlAct_pay_act_seq.addAllListener(p);
		p.columnDtlAct_pay_act_seq.setListListener(p);
		p.columnDtlAct_pay_act_d_no.addAllListener(p);
		p.columnDtlAct_pay_act_d_no.setListListener(p);
		p.columnDtlAct_pay_act_d_seq.addAllListener(p);
		p.columnDtlAct_pay_act_d_seq.setListListener(p);
		p.columnDtlAct_ap_sttl_cd.addAllListener(p);
		p.columnDtlAct_ap_sttl_cd.setListListener(p);
		p.columnDtlAct_ap_sttl_nm.addAllListener(p);
		p.columnDtlAct_ap_sttl_nm.setListListener(p);
		p.columnDtlAct_slip_sts_typ.addAllListener(p);
		p.columnDtlAct_slip_sts_typ.setListListener(p);
		p.columnDtlAct_slip_sts_typ_nm.addAllListener(p);
		p.columnDtlAct_slip_sts_typ_nm.setListListener(p);
		p.columnDtlAct_pay_act_dt.addAllListener(p);
		p.columnDtlAct_pay_act_dt.setListListener(p);
		p.columnDtlAct_tax_cd.addAllListener(p);
		p.columnDtlAct_tax_cd.setListListener(p);
		p.columnDtlAct_tax_nm.addAllListener(p);
		p.columnDtlAct_tax_nm.setListListener(p);
		p.columnDtlAct_inc_tax_flg.addAllListener(p);
		p.columnDtlAct_tax_rate.addAllListener(p);
		p.columnDtlAct_tax_rate.setListListener(p);
		p.columnDtlAct_trd_cur_amt.addAllListener(p);
		p.columnDtlAct_trd_cur_amt.setListListener(p);
		p.columnDtlAct_trd_cur_tax_amt.addAllListener(p);
		p.columnDtlAct_trd_cur_tax_amt.setListListener(p);
		p.columnDtlAct_trd_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlAct_trd_cur_inc_tax_amt.setListListener(p);
		p.columnDtlAct_base_cur_amt.addAllListener(p);
		p.columnDtlAct_base_cur_amt.setListListener(p);
		p.columnDtlAct_base_cur_tax_amt.addAllListener(p);
		p.columnDtlAct_base_cur_tax_amt.setListListener(p);
		p.columnDtlAct_base_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlAct_base_cur_inc_tax_amt.setListListener(p);
		p.columnDtlAct_pay_ntc_d_print_rmrks.addAllListener(p);
		p.columnDtlAct_pay_ntc_d_print_rmrks.setListListener(p);
		p.columnDtlAct_sub_char1.addAllListener(p);
		p.columnDtlAct_sub_char1.setListListener(p);
		p.columnDtlAct_sub_char2.addAllListener(p);
		p.columnDtlAct_sub_char2.setListListener(p);
		p.columnDtlAct_sub_char3.addAllListener(p);
		p.columnDtlAct_sub_char3.setListListener(p);
		p.columnDtlAct_ins_usr_id.addAllListener(p);
		p.columnDtlAct_ins_usr_id.setListListener(p);
		p.columnDtlAct_ins_usr_nm.addAllListener(p);
		p.columnDtlAct_ins_usr_nm.setListListener(p);
		p.columnDtlAct_ins_func_id.addAllListener(p);
		p.columnDtlAct_ins_func_id.setListListener(p);
		p.columnDtlAct_ins_func_nm.addAllListener(p);
		p.columnDtlAct_ins_func_nm.setListListener(p);
		p.columnDtlAct_upd_usr_id.addAllListener(p);
		p.columnDtlAct_upd_usr_id.setListListener(p);
		p.columnDtlAct_upd_usr_nm.addAllListener(p);
		p.columnDtlAct_upd_usr_nm.setListListener(p);
		p.columnDtlAct_upd_func_id.addAllListener(p);
		p.columnDtlAct_upd_func_id.setListListener(p);
		p.columnDtlAct_upd_func_nm.addAllListener(p);
		p.columnDtlAct_upd_func_nm.setListListener(p);
		p.columnDtlAct_ins_ts.addAllListener(p);
		p.columnDtlAct_ins_ts.setListListener(p);
		p.columnDtlAct_upd_ts.addAllListener(p);
		p.columnDtlAct_upd_ts.setListListener(p);
		p.columnDtlAct_upd_srv_req_no.addAllListener(p);
		p.columnDtlAct_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [DtlAdvPayAct]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlAdvPayAct(MSBHP_PayNtcSaveHstSrch p) {
		p.DtlAdvPayActTable.addAllListener(p);
		p.columnDtlAdvPayAct_adv_pay_act_no.addAllListener(p);
		p.columnDtlAdvPayAct_adv_pay_act_no.setListListener(p);
		p.columnDtlAdvPayAct_adv_pay_act_seq.addAllListener(p);
		p.columnDtlAdvPayAct_adv_pay_act_seq.setListListener(p);
		p.columnDtlAdvPayAct_ap_sttl_cd.addAllListener(p);
		p.columnDtlAdvPayAct_ap_sttl_cd.setListListener(p);
		p.columnDtlAdvPayAct_ap_sttl_nm.addAllListener(p);
		p.columnDtlAdvPayAct_ap_sttl_nm.setListListener(p);
		p.columnDtlAdvPayAct_slip_sts_typ.addAllListener(p);
		p.columnDtlAdvPayAct_slip_sts_typ.setListListener(p);
		p.columnDtlAdvPayAct_slip_sts_typ_nm.addAllListener(p);
		p.columnDtlAdvPayAct_slip_sts_typ_nm.setListListener(p);
		p.columnDtlAdvPayAct_pay_act_dt.addAllListener(p);
		p.columnDtlAdvPayAct_pay_act_dt.setListListener(p);
		p.columnDtlAdvPayAct_tax_cd.addAllListener(p);
		p.columnDtlAdvPayAct_tax_cd.setListListener(p);
		p.columnDtlAdvPayAct_tax_nm.addAllListener(p);
		p.columnDtlAdvPayAct_tax_nm.setListListener(p);
		p.columnDtlAdvPayAct_inc_tax_flg.addAllListener(p);
		p.columnDtlAdvPayAct_tax_rate.addAllListener(p);
		p.columnDtlAdvPayAct_tax_rate.setListListener(p);
		p.columnDtlAdvPayAct_trd_cur_amt.addAllListener(p);
		p.columnDtlAdvPayAct_trd_cur_amt.setListListener(p);
		p.columnDtlAdvPayAct_trd_cur_tax_amt.addAllListener(p);
		p.columnDtlAdvPayAct_trd_cur_tax_amt.setListListener(p);
		p.columnDtlAdvPayAct_trd_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlAdvPayAct_trd_cur_inc_tax_amt.setListListener(p);
		p.columnDtlAdvPayAct_base_cur_amt.addAllListener(p);
		p.columnDtlAdvPayAct_base_cur_amt.setListListener(p);
		p.columnDtlAdvPayAct_base_cur_tax_amt.addAllListener(p);
		p.columnDtlAdvPayAct_base_cur_tax_amt.setListListener(p);
		p.columnDtlAdvPayAct_base_cur_inc_tax_amt.addAllListener(p);
		p.columnDtlAdvPayAct_base_cur_inc_tax_amt.setListListener(p);
		p.columnDtlAdvPayAct_sub_char1.addAllListener(p);
		p.columnDtlAdvPayAct_sub_char1.setListListener(p);
		p.columnDtlAdvPayAct_sub_char2.addAllListener(p);
		p.columnDtlAdvPayAct_sub_char2.setListListener(p);
		p.columnDtlAdvPayAct_sub_char3.addAllListener(p);
		p.columnDtlAdvPayAct_sub_char3.setListListener(p);
		p.columnDtlAdvPayAct_ins_usr_id.addAllListener(p);
		p.columnDtlAdvPayAct_ins_usr_id.setListListener(p);
		p.columnDtlAdvPayAct_ins_usr_nm.addAllListener(p);
		p.columnDtlAdvPayAct_ins_usr_nm.setListListener(p);
		p.columnDtlAdvPayAct_ins_func_id.addAllListener(p);
		p.columnDtlAdvPayAct_ins_func_id.setListListener(p);
		p.columnDtlAdvPayAct_ins_func_nm.addAllListener(p);
		p.columnDtlAdvPayAct_ins_func_nm.setListListener(p);
		p.columnDtlAdvPayAct_upd_usr_id.addAllListener(p);
		p.columnDtlAdvPayAct_upd_usr_id.setListListener(p);
		p.columnDtlAdvPayAct_upd_usr_nm.addAllListener(p);
		p.columnDtlAdvPayAct_upd_usr_nm.setListListener(p);
		p.columnDtlAdvPayAct_upd_func_id.addAllListener(p);
		p.columnDtlAdvPayAct_upd_func_id.setListListener(p);
		p.columnDtlAdvPayAct_upd_func_nm.addAllListener(p);
		p.columnDtlAdvPayAct_upd_func_nm.setListListener(p);
		p.columnDtlAdvPayAct_ins_ts.addAllListener(p);
		p.columnDtlAdvPayAct_ins_ts.setListListener(p);
		p.columnDtlAdvPayAct_upd_ts.addAllListener(p);
		p.columnDtlAdvPayAct_upd_ts.setListListener(p);
		p.columnDtlAdvPayAct_upd_srv_req_no.addAllListener(p);
		p.columnDtlAdvPayAct_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBHP_PayNtcSaveHstSrch p){
		p.Cnd_pay_chk_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pay_ntc_rev.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBHP_PayNtcSaveHstSrch p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBHP_PayNtcSaveHstSrch p){
		p.Hdr_pay_chk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bsppl_cl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_reg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_spot_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_bsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bsppl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bsppl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_last_pay_schd_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sw_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bfw_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_dscnt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_ret_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_setoff_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sw_to_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_schd_pay_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_adv_pay_bal.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_adv_pay_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_adv_pay_setoff_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_adv_pay_setoff_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
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

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBHP_PayNtcSaveHstSrch p){

	}

	/**
	 * [SRCH]ステータスの[DtlApd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlApd(MSBHP_PayNtcSaveHstSrch p){
		p.columnDtlApd_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_slip_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlApd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlApd_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_sppl_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_sppl_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_trd_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_inc_tax_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_trd_cur_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_trd_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_base_cur_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_base_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_base_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_base_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_base_cur_dscnt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_pay_mtd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_pay_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_base_purc_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_pay_ntc_d_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_ap_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_purc_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_purc_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_bp_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_bp_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlApd_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlPanel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlPanel(MSBHP_PayNtcSaveHstSrch p){

	}

	/**
	 * [SRCH]ステータスの[DtlAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlAct(MSBHP_PayNtcSaveHstSrch p){
		p.columnDtlAct_pay_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_pay_act_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_pay_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_pay_act_d_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_slip_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_pay_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_inc_tax_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_trd_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_base_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_base_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_base_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_pay_ntc_d_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAct_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlAdvPayAct]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlAdvPayAct(MSBHP_PayNtcSaveHstSrch p){
		p.columnDtlAdvPayAct_adv_pay_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_adv_pay_act_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_slip_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_pay_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_inc_tax_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_trd_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_base_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_base_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_base_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlAdvPayAct_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

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
		MSBHP_PayNtcSaveHstSrch_MC.setTableConfigDtlApd((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.setTableConfigDtlAct((MSBHP_PayNtcSaveHstSrch)this);
		MSBHP_PayNtcSaveHstSrch_MC.setTableConfigDtlAdvPayAct((MSBHP_PayNtcSaveHstSrch)this);
	}

	/**
	 * [DtlApd]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlApd(MSBHP_PayNtcSaveHstSrch p) {
		p.columnDtlApd_trd_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_cd_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_cd);
		p.columnDtlApd_trd_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_nm);
		p.columnDtlApd_slip_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.slip_sts_typ_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_slip_sts_typ);
		p.columnDtlApd_slip_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.slip_sts_typ_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_slip_sts_typ_nm);
		p.columnDtlApd_act_dt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.act_dt_META);
		p.columnDtlApd_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_act_dt);
		p.DtlApdTable.addTable(p.DtlApd_itm_p_PPanel.ItmTable);
		p.columnDtlApd_sundry_itm_flg.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.sundry_itm_flg_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_sundry_itm_flg);
		p.columnDtlApd_sppl_itm_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.sppl_itm_cd_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_sppl_itm_cd);
		p.columnDtlApd_sppl_itm_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.sppl_itm_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_sppl_itm_nm);
		p.columnDtlApd_trd_unit_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_unit_cd_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_unit_cd);
		p.columnDtlApd_trd_unit_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_unit_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_unit_nm);
		p.columnDtlApd_trd_unit_qty.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_unit_qty_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_unit_qty);
		p.columnDtlApd_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.tax_cd_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_tax_cd);
		p.columnDtlApd_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.tax_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_tax_nm);
		p.columnDtlApd_inc_tax_flg.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.inc_tax_flg_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_inc_tax_flg);
		p.columnDtlApd_tax_rate.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.tax_rate_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_tax_rate);
		p.columnDtlApd_interim_flg.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.interim_flg_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_interim_flg);
		p.columnDtlApd_trd_cur_upri.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_cur_upri_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_cur_upri);
		p.columnDtlApd_trd_cur_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_cur_amt_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_cur_amt);
		p.columnDtlApd_trd_cur_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_cur_tax_amt_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_cur_tax_amt);
		p.columnDtlApd_trd_cur_inc_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_cur_inc_tax_amt_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_cur_inc_tax_amt);
		p.columnDtlApd_trd_cur_dscnt_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.trd_cur_dscnt_amt_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_trd_cur_dscnt_amt);
		p.columnDtlApd_base_cur_upri.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.base_cur_upri_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_base_cur_upri);
		p.columnDtlApd_base_cur_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.base_cur_amt_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_base_cur_amt);
		p.columnDtlApd_base_cur_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.base_cur_tax_amt_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_base_cur_tax_amt);
		p.columnDtlApd_base_cur_inc_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.base_cur_inc_tax_amt_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_base_cur_inc_tax_amt);
		p.columnDtlApd_base_cur_dscnt_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.base_cur_dscnt_amt_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_base_cur_dscnt_amt);
		p.columnDtlApd_sppl_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.sppl_cd_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_sppl_cd);
		p.columnDtlApd_sppl_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.sppl_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_sppl_nm);
		p.columnDtlApd_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.asppl_cd_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_asppl_cd);
		p.columnDtlApd_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.asppl_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_asppl_nm);
		p.columnDtlApd_pay_mtd_typ.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.pay_mtd_typ_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_pay_mtd_typ);
		p.columnDtlApd_pay_mtd_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.pay_mtd_typ_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_pay_mtd_typ_nm);
		p.columnDtlApd_base_purc_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.base_purc_ac_dt_META);
		p.columnDtlApd_base_purc_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_base_purc_ac_dt);
		p.columnDtlApd_pay_ntc_d_print_rmrks.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.pay_ntc_d_print_rmrks_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_pay_ntc_d_print_rmrks);
		p.columnDtlApd_ap_d_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.ap_d_no_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_ap_d_no);
		p.columnDtlApd_po_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.po_no_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_po_no);
		p.columnDtlApd_po_d_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.po_d_no_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_po_d_no);
		p.columnDtlApd_purc_act_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.purc_act_no_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_purc_act_no);
		p.columnDtlApd_purc_act_rev.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.purc_act_rev_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_purc_act_rev);
		p.columnDtlApd_purc_act_d_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.purc_act_d_no_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_purc_act_d_no);
		p.columnDtlApd_bp_dlv_slip_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.bp_dlv_slip_no_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_bp_dlv_slip_no);
		p.columnDtlApd_bp_dlv_slip_d_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.bp_dlv_slip_d_no_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_bp_dlv_slip_d_no);
		p.columnDtlApd_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.sub_char1_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_sub_char1);
		p.columnDtlApd_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.sub_char2_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_sub_char2);
		p.columnDtlApd_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.sub_char3_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_sub_char3);
		p.columnDtlApd_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.ins_usr_id_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_ins_usr_id);
		p.columnDtlApd_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.ins_usr_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_ins_usr_nm);
		p.columnDtlApd_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.ins_func_id_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_ins_func_id);
		p.columnDtlApd_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.ins_func_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_ins_func_nm);
		p.columnDtlApd_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.upd_usr_id_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_upd_usr_id);
		p.columnDtlApd_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.upd_usr_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_upd_usr_nm);
		p.columnDtlApd_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.upd_func_id_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_upd_func_id);
		p.columnDtlApd_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.upd_func_nm_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_upd_func_nm);
		p.columnDtlApd_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.ins_ts_META);
		p.columnDtlApd_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_ins_ts);
		p.columnDtlApd_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.upd_ts_META);
		p.columnDtlApd_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_upd_ts);
		p.columnDtlApd_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlApdR.upd_srv_req_no_META);
		p.DtlApdTable.addColumnConfig(p.columnDtlApd_upd_srv_req_no);
	}

	/**
	 * [DtlAct]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlAct(MSBHP_PayNtcSaveHstSrch p) {
		p.columnDtlAct_pay_act_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.pay_act_no_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_pay_act_no);
		p.columnDtlAct_pay_act_seq.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.pay_act_seq_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_pay_act_seq);
		p.columnDtlAct_pay_act_d_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.pay_act_d_no_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_pay_act_d_no);
		p.columnDtlAct_pay_act_d_seq.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.pay_act_d_seq_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_pay_act_d_seq);
		p.columnDtlAct_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.ap_sttl_cd_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_ap_sttl_cd);
		p.columnDtlAct_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.ap_sttl_nm_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_ap_sttl_nm);
		p.columnDtlAct_slip_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.slip_sts_typ_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_slip_sts_typ);
		p.columnDtlAct_slip_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.slip_sts_typ_nm_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_slip_sts_typ_nm);
		p.columnDtlAct_pay_act_dt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.pay_act_dt_META);
		p.columnDtlAct_pay_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_pay_act_dt);
		p.columnDtlAct_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.tax_cd_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_tax_cd);
		p.columnDtlAct_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.tax_nm_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_tax_nm);
		p.columnDtlAct_inc_tax_flg.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.inc_tax_flg_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_inc_tax_flg);
		p.columnDtlAct_tax_rate.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.tax_rate_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_tax_rate);
		p.columnDtlAct_trd_cur_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.trd_cur_amt_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_trd_cur_amt);
		p.columnDtlAct_trd_cur_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.trd_cur_tax_amt_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_trd_cur_tax_amt);
		p.columnDtlAct_trd_cur_inc_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.trd_cur_inc_tax_amt_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_trd_cur_inc_tax_amt);
		p.columnDtlAct_base_cur_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.base_cur_amt_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_base_cur_amt);
		p.columnDtlAct_base_cur_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.base_cur_tax_amt_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_base_cur_tax_amt);
		p.columnDtlAct_base_cur_inc_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.base_cur_inc_tax_amt_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_base_cur_inc_tax_amt);
		p.columnDtlAct_pay_ntc_d_print_rmrks.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.pay_ntc_d_print_rmrks_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_pay_ntc_d_print_rmrks);
		p.columnDtlAct_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.sub_char1_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_sub_char1);
		p.columnDtlAct_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.sub_char2_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_sub_char2);
		p.columnDtlAct_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.sub_char3_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_sub_char3);
		p.columnDtlAct_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.ins_usr_id_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_ins_usr_id);
		p.columnDtlAct_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.ins_usr_nm_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_ins_usr_nm);
		p.columnDtlAct_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.ins_func_id_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_ins_func_id);
		p.columnDtlAct_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.ins_func_nm_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_ins_func_nm);
		p.columnDtlAct_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.upd_usr_id_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_upd_usr_id);
		p.columnDtlAct_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.upd_usr_nm_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_upd_usr_nm);
		p.columnDtlAct_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.upd_func_id_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_upd_func_id);
		p.columnDtlAct_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.upd_func_nm_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_upd_func_nm);
		p.columnDtlAct_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.ins_ts_META);
		p.columnDtlAct_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_ins_ts);
		p.columnDtlAct_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.upd_ts_META);
		p.columnDtlAct_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_upd_ts);
		p.columnDtlAct_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlActR.upd_srv_req_no_META);
		p.DtlActTable.addColumnConfig(p.columnDtlAct_upd_srv_req_no);
	}

	/**
	 * [DtlAdvPayAct]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlAdvPayAct(MSBHP_PayNtcSaveHstSrch p) {
		p.columnDtlAdvPayAct_adv_pay_act_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.adv_pay_act_no_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_adv_pay_act_no);
		p.columnDtlAdvPayAct_adv_pay_act_seq.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.adv_pay_act_seq_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_adv_pay_act_seq);
		p.columnDtlAdvPayAct_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.ap_sttl_cd_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_ap_sttl_cd);
		p.columnDtlAdvPayAct_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.ap_sttl_nm_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_ap_sttl_nm);
		p.columnDtlAdvPayAct_slip_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.slip_sts_typ_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_slip_sts_typ);
		p.columnDtlAdvPayAct_slip_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.slip_sts_typ_nm_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_slip_sts_typ_nm);
		p.columnDtlAdvPayAct_pay_act_dt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.pay_act_dt_META);
		p.columnDtlAdvPayAct_pay_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_pay_act_dt);
		p.columnDtlAdvPayAct_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.tax_cd_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_tax_cd);
		p.columnDtlAdvPayAct_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.tax_nm_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_tax_nm);
		p.columnDtlAdvPayAct_inc_tax_flg.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.inc_tax_flg_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_inc_tax_flg);
		p.columnDtlAdvPayAct_tax_rate.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.tax_rate_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_tax_rate);
		p.columnDtlAdvPayAct_trd_cur_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.trd_cur_amt_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_trd_cur_amt);
		p.columnDtlAdvPayAct_trd_cur_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.trd_cur_tax_amt_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_trd_cur_tax_amt);
		p.columnDtlAdvPayAct_trd_cur_inc_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.trd_cur_inc_tax_amt_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_trd_cur_inc_tax_amt);
		p.columnDtlAdvPayAct_base_cur_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.base_cur_amt_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_base_cur_amt);
		p.columnDtlAdvPayAct_base_cur_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.base_cur_tax_amt_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_base_cur_tax_amt);
		p.columnDtlAdvPayAct_base_cur_inc_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.base_cur_inc_tax_amt_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_base_cur_inc_tax_amt);
		p.columnDtlAdvPayAct_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.sub_char1_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_sub_char1);
		p.columnDtlAdvPayAct_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.sub_char2_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_sub_char2);
		p.columnDtlAdvPayAct_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.sub_char3_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_sub_char3);
		p.columnDtlAdvPayAct_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.ins_usr_id_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_ins_usr_id);
		p.columnDtlAdvPayAct_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.ins_usr_nm_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_ins_usr_nm);
		p.columnDtlAdvPayAct_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.ins_func_id_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_ins_func_id);
		p.columnDtlAdvPayAct_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.ins_func_nm_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_ins_func_nm);
		p.columnDtlAdvPayAct_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.upd_usr_id_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_upd_usr_id);
		p.columnDtlAdvPayAct_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.upd_usr_nm_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_upd_usr_nm);
		p.columnDtlAdvPayAct_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.upd_func_id_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_upd_func_id);
		p.columnDtlAdvPayAct_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.upd_func_nm_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_upd_func_nm);
		p.columnDtlAdvPayAct_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.ins_ts_META);
		p.columnDtlAdvPayAct_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_ins_ts);
		p.columnDtlAdvPayAct_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.upd_ts_META);
		p.columnDtlAdvPayAct_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_upd_ts);
		p.columnDtlAdvPayAct_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.upd_srv_req_no_META);
		p.DtlAdvPayActTable.addColumnConfig(p.columnDtlAdvPayAct_upd_srv_req_no);
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
		if (vc == DtlApdTable) return doDtlApd_VC(info);
		if (vc == DtlActTable) return doDtlAct_VC(info);
		if (vc == DtlAdvPayActTable) return doDtlAdvPayAct_VC(info);
		if (vc == Cnd_pay_chk_no) return doCnd_pay_chk_no_VC(info);
		if (vc == Cnd_pay_ntc_rev) return doCnd_pay_ntc_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Hdr_pay_chk_no) return doHdr_pay_chk_no_VC(info);
		if (vc == Hdr_pay_ntc_rev) return doHdr_pay_ntc_rev_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_bsppl_cl_dt) return doHdr_bsppl_cl_dt_VC(info);
		if (vc == Hdr_reg_dt) return doHdr_reg_dt_VC(info);
		if (vc == Hdr_pay_spot_flg) return doHdr_pay_spot_flg_VC(info);
		if (vc == Hdr_rcpt_iv_no) return doHdr_rcpt_iv_no_VC(info);
		if (vc == Hdr_bsppl_cd) return doHdr_bsppl_cd_VC(info);
		if (vc == Hdr_bsppl_nm) return doHdr_bsppl_nm_VC(info);
		if (vc == Hdr_bsppl_dpt_cd) return doHdr_bsppl_dpt_cd_VC(info);
		if (vc == Hdr_bsppl_dpt_nm) return doHdr_bsppl_dpt_nm_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_pay_xrate) return doHdr_pay_xrate_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_last_pay_schd_amt) return doHdr_last_pay_schd_amt_VC(info);
		if (vc == Hdr_pay_amt) return doHdr_pay_amt_VC(info);
		if (vc == Hdr_sw_amt) return doHdr_sw_amt_VC(info);
		if (vc == Hdr_bfw_amt) return doHdr_bfw_amt_VC(info);
		if (vc == Hdr_purc_amt) return doHdr_purc_amt_VC(info);
		if (vc == Hdr_purc_dscnt_amt) return doHdr_purc_dscnt_amt_VC(info);
		if (vc == Hdr_purc_ret_amt) return doHdr_purc_ret_amt_VC(info);
		if (vc == Hdr_setoff_amt) return doHdr_setoff_amt_VC(info);
		if (vc == Hdr_tax_amt) return doHdr_tax_amt_VC(info);
		if (vc == Hdr_sw_to_amt) return doHdr_sw_to_amt_VC(info);
		if (vc == Hdr_schd_pay_amt) return doHdr_schd_pay_amt_VC(info);
		if (vc == Hdr_adv_pay_bal) return doHdr_adv_pay_bal_VC(info);
		if (vc == Hdr_adv_pay_amt) return doHdr_adv_pay_amt_VC(info);
		if (vc == Hdr_adv_pay_setoff_amt) return doHdr_adv_pay_setoff_amt_VC(info);
		if (vc == Hdr_adv_pay_setoff_tax_amt) return doHdr_adv_pay_setoff_tax_amt_VC(info);
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
		if (vc == columnDtlApd_trd_cd) return doDtlApd_trd_cd_VC(info);
		if (vc == columnDtlApd_trd_nm) return doDtlApd_trd_nm_VC(info);
		if (vc == columnDtlApd_slip_sts_typ) return doDtlApd_slip_sts_typ_VC(info);
		if (vc == columnDtlApd_slip_sts_typ_nm) return doDtlApd_slip_sts_typ_nm_VC(info);
		if (vc == columnDtlApd_act_dt) return doDtlApd_act_dt_VC(info);
		if (vc == columnDtlApd_sundry_itm_flg) return doDtlApd_sundry_itm_flg_VC(info);
		if (vc == columnDtlApd_sppl_itm_cd) return doDtlApd_sppl_itm_cd_VC(info);
		if (vc == columnDtlApd_sppl_itm_nm) return doDtlApd_sppl_itm_nm_VC(info);
		if (vc == columnDtlApd_trd_unit_cd) return doDtlApd_trd_unit_cd_VC(info);
		if (vc == columnDtlApd_trd_unit_nm) return doDtlApd_trd_unit_nm_VC(info);
		if (vc == columnDtlApd_trd_unit_qty) return doDtlApd_trd_unit_qty_VC(info);
		if (vc == columnDtlApd_tax_cd) return doDtlApd_tax_cd_VC(info);
		if (vc == columnDtlApd_tax_nm) return doDtlApd_tax_nm_VC(info);
		if (vc == columnDtlApd_inc_tax_flg) return doDtlApd_inc_tax_flg_VC(info);
		if (vc == columnDtlApd_tax_rate) return doDtlApd_tax_rate_VC(info);
		if (vc == columnDtlApd_interim_flg) return doDtlApd_interim_flg_VC(info);
		if (vc == columnDtlApd_trd_cur_upri) return doDtlApd_trd_cur_upri_VC(info);
		if (vc == columnDtlApd_trd_cur_amt) return doDtlApd_trd_cur_amt_VC(info);
		if (vc == columnDtlApd_trd_cur_tax_amt) return doDtlApd_trd_cur_tax_amt_VC(info);
		if (vc == columnDtlApd_trd_cur_inc_tax_amt) return doDtlApd_trd_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlApd_trd_cur_dscnt_amt) return doDtlApd_trd_cur_dscnt_amt_VC(info);
		if (vc == columnDtlApd_base_cur_upri) return doDtlApd_base_cur_upri_VC(info);
		if (vc == columnDtlApd_base_cur_amt) return doDtlApd_base_cur_amt_VC(info);
		if (vc == columnDtlApd_base_cur_tax_amt) return doDtlApd_base_cur_tax_amt_VC(info);
		if (vc == columnDtlApd_base_cur_inc_tax_amt) return doDtlApd_base_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlApd_base_cur_dscnt_amt) return doDtlApd_base_cur_dscnt_amt_VC(info);
		if (vc == columnDtlApd_sppl_cd) return doDtlApd_sppl_cd_VC(info);
		if (vc == columnDtlApd_sppl_nm) return doDtlApd_sppl_nm_VC(info);
		if (vc == columnDtlApd_asppl_cd) return doDtlApd_asppl_cd_VC(info);
		if (vc == columnDtlApd_asppl_nm) return doDtlApd_asppl_nm_VC(info);
		if (vc == columnDtlApd_pay_mtd_typ) return doDtlApd_pay_mtd_typ_VC(info);
		if (vc == columnDtlApd_pay_mtd_typ_nm) return doDtlApd_pay_mtd_typ_nm_VC(info);
		if (vc == columnDtlApd_base_purc_ac_dt) return doDtlApd_base_purc_ac_dt_VC(info);
		if (vc == columnDtlApd_pay_ntc_d_print_rmrks) return doDtlApd_pay_ntc_d_print_rmrks_VC(info);
		if (vc == columnDtlApd_ap_d_no) return doDtlApd_ap_d_no_VC(info);
		if (vc == columnDtlApd_po_no) return doDtlApd_po_no_VC(info);
		if (vc == columnDtlApd_po_d_no) return doDtlApd_po_d_no_VC(info);
		if (vc == columnDtlApd_purc_act_no) return doDtlApd_purc_act_no_VC(info);
		if (vc == columnDtlApd_purc_act_rev) return doDtlApd_purc_act_rev_VC(info);
		if (vc == columnDtlApd_purc_act_d_no) return doDtlApd_purc_act_d_no_VC(info);
		if (vc == columnDtlApd_bp_dlv_slip_no) return doDtlApd_bp_dlv_slip_no_VC(info);
		if (vc == columnDtlApd_bp_dlv_slip_d_no) return doDtlApd_bp_dlv_slip_d_no_VC(info);
		if (vc == columnDtlApd_sub_char1) return doDtlApd_sub_char1_VC(info);
		if (vc == columnDtlApd_sub_char2) return doDtlApd_sub_char2_VC(info);
		if (vc == columnDtlApd_sub_char3) return doDtlApd_sub_char3_VC(info);
		if (vc == columnDtlApd_ins_usr_id) return doDtlApd_ins_usr_id_VC(info);
		if (vc == columnDtlApd_ins_usr_nm) return doDtlApd_ins_usr_nm_VC(info);
		if (vc == columnDtlApd_ins_func_id) return doDtlApd_ins_func_id_VC(info);
		if (vc == columnDtlApd_ins_func_nm) return doDtlApd_ins_func_nm_VC(info);
		if (vc == columnDtlApd_upd_usr_id) return doDtlApd_upd_usr_id_VC(info);
		if (vc == columnDtlApd_upd_usr_nm) return doDtlApd_upd_usr_nm_VC(info);
		if (vc == columnDtlApd_upd_func_id) return doDtlApd_upd_func_id_VC(info);
		if (vc == columnDtlApd_upd_func_nm) return doDtlApd_upd_func_nm_VC(info);
		if (vc == columnDtlApd_ins_ts) return doDtlApd_ins_ts_VC(info);
		if (vc == columnDtlApd_upd_ts) return doDtlApd_upd_ts_VC(info);
		if (vc == columnDtlApd_upd_srv_req_no) return doDtlApd_upd_srv_req_no_VC(info);
		if (vc == columnDtlAct_pay_act_no) return doDtlAct_pay_act_no_VC(info);
		if (vc == columnDtlAct_pay_act_seq) return doDtlAct_pay_act_seq_VC(info);
		if (vc == columnDtlAct_pay_act_d_no) return doDtlAct_pay_act_d_no_VC(info);
		if (vc == columnDtlAct_pay_act_d_seq) return doDtlAct_pay_act_d_seq_VC(info);
		if (vc == columnDtlAct_ap_sttl_cd) return doDtlAct_ap_sttl_cd_VC(info);
		if (vc == columnDtlAct_ap_sttl_nm) return doDtlAct_ap_sttl_nm_VC(info);
		if (vc == columnDtlAct_slip_sts_typ) return doDtlAct_slip_sts_typ_VC(info);
		if (vc == columnDtlAct_slip_sts_typ_nm) return doDtlAct_slip_sts_typ_nm_VC(info);
		if (vc == columnDtlAct_pay_act_dt) return doDtlAct_pay_act_dt_VC(info);
		if (vc == columnDtlAct_tax_cd) return doDtlAct_tax_cd_VC(info);
		if (vc == columnDtlAct_tax_nm) return doDtlAct_tax_nm_VC(info);
		if (vc == columnDtlAct_inc_tax_flg) return doDtlAct_inc_tax_flg_VC(info);
		if (vc == columnDtlAct_tax_rate) return doDtlAct_tax_rate_VC(info);
		if (vc == columnDtlAct_trd_cur_amt) return doDtlAct_trd_cur_amt_VC(info);
		if (vc == columnDtlAct_trd_cur_tax_amt) return doDtlAct_trd_cur_tax_amt_VC(info);
		if (vc == columnDtlAct_trd_cur_inc_tax_amt) return doDtlAct_trd_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlAct_base_cur_amt) return doDtlAct_base_cur_amt_VC(info);
		if (vc == columnDtlAct_base_cur_tax_amt) return doDtlAct_base_cur_tax_amt_VC(info);
		if (vc == columnDtlAct_base_cur_inc_tax_amt) return doDtlAct_base_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlAct_pay_ntc_d_print_rmrks) return doDtlAct_pay_ntc_d_print_rmrks_VC(info);
		if (vc == columnDtlAct_sub_char1) return doDtlAct_sub_char1_VC(info);
		if (vc == columnDtlAct_sub_char2) return doDtlAct_sub_char2_VC(info);
		if (vc == columnDtlAct_sub_char3) return doDtlAct_sub_char3_VC(info);
		if (vc == columnDtlAct_ins_usr_id) return doDtlAct_ins_usr_id_VC(info);
		if (vc == columnDtlAct_ins_usr_nm) return doDtlAct_ins_usr_nm_VC(info);
		if (vc == columnDtlAct_ins_func_id) return doDtlAct_ins_func_id_VC(info);
		if (vc == columnDtlAct_ins_func_nm) return doDtlAct_ins_func_nm_VC(info);
		if (vc == columnDtlAct_upd_usr_id) return doDtlAct_upd_usr_id_VC(info);
		if (vc == columnDtlAct_upd_usr_nm) return doDtlAct_upd_usr_nm_VC(info);
		if (vc == columnDtlAct_upd_func_id) return doDtlAct_upd_func_id_VC(info);
		if (vc == columnDtlAct_upd_func_nm) return doDtlAct_upd_func_nm_VC(info);
		if (vc == columnDtlAct_ins_ts) return doDtlAct_ins_ts_VC(info);
		if (vc == columnDtlAct_upd_ts) return doDtlAct_upd_ts_VC(info);
		if (vc == columnDtlAct_upd_srv_req_no) return doDtlAct_upd_srv_req_no_VC(info);
		if (vc == columnDtlAdvPayAct_adv_pay_act_no) return doDtlAdvPayAct_adv_pay_act_no_VC(info);
		if (vc == columnDtlAdvPayAct_adv_pay_act_seq) return doDtlAdvPayAct_adv_pay_act_seq_VC(info);
		if (vc == columnDtlAdvPayAct_ap_sttl_cd) return doDtlAdvPayAct_ap_sttl_cd_VC(info);
		if (vc == columnDtlAdvPayAct_ap_sttl_nm) return doDtlAdvPayAct_ap_sttl_nm_VC(info);
		if (vc == columnDtlAdvPayAct_slip_sts_typ) return doDtlAdvPayAct_slip_sts_typ_VC(info);
		if (vc == columnDtlAdvPayAct_slip_sts_typ_nm) return doDtlAdvPayAct_slip_sts_typ_nm_VC(info);
		if (vc == columnDtlAdvPayAct_pay_act_dt) return doDtlAdvPayAct_pay_act_dt_VC(info);
		if (vc == columnDtlAdvPayAct_tax_cd) return doDtlAdvPayAct_tax_cd_VC(info);
		if (vc == columnDtlAdvPayAct_tax_nm) return doDtlAdvPayAct_tax_nm_VC(info);
		if (vc == columnDtlAdvPayAct_inc_tax_flg) return doDtlAdvPayAct_inc_tax_flg_VC(info);
		if (vc == columnDtlAdvPayAct_tax_rate) return doDtlAdvPayAct_tax_rate_VC(info);
		if (vc == columnDtlAdvPayAct_trd_cur_amt) return doDtlAdvPayAct_trd_cur_amt_VC(info);
		if (vc == columnDtlAdvPayAct_trd_cur_tax_amt) return doDtlAdvPayAct_trd_cur_tax_amt_VC(info);
		if (vc == columnDtlAdvPayAct_trd_cur_inc_tax_amt) return doDtlAdvPayAct_trd_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlAdvPayAct_base_cur_amt) return doDtlAdvPayAct_base_cur_amt_VC(info);
		if (vc == columnDtlAdvPayAct_base_cur_tax_amt) return doDtlAdvPayAct_base_cur_tax_amt_VC(info);
		if (vc == columnDtlAdvPayAct_base_cur_inc_tax_amt) return doDtlAdvPayAct_base_cur_inc_tax_amt_VC(info);
		if (vc == columnDtlAdvPayAct_sub_char1) return doDtlAdvPayAct_sub_char1_VC(info);
		if (vc == columnDtlAdvPayAct_sub_char2) return doDtlAdvPayAct_sub_char2_VC(info);
		if (vc == columnDtlAdvPayAct_sub_char3) return doDtlAdvPayAct_sub_char3_VC(info);
		if (vc == columnDtlAdvPayAct_ins_usr_id) return doDtlAdvPayAct_ins_usr_id_VC(info);
		if (vc == columnDtlAdvPayAct_ins_usr_nm) return doDtlAdvPayAct_ins_usr_nm_VC(info);
		if (vc == columnDtlAdvPayAct_ins_func_id) return doDtlAdvPayAct_ins_func_id_VC(info);
		if (vc == columnDtlAdvPayAct_ins_func_nm) return doDtlAdvPayAct_ins_func_nm_VC(info);
		if (vc == columnDtlAdvPayAct_upd_usr_id) return doDtlAdvPayAct_upd_usr_id_VC(info);
		if (vc == columnDtlAdvPayAct_upd_usr_nm) return doDtlAdvPayAct_upd_usr_nm_VC(info);
		if (vc == columnDtlAdvPayAct_upd_func_id) return doDtlAdvPayAct_upd_func_id_VC(info);
		if (vc == columnDtlAdvPayAct_upd_func_nm) return doDtlAdvPayAct_upd_func_nm_VC(info);
		if (vc == columnDtlAdvPayAct_ins_ts) return doDtlAdvPayAct_ins_ts_VC(info);
		if (vc == columnDtlAdvPayAct_upd_ts) return doDtlAdvPayAct_upd_ts_VC(info);
		if (vc == columnDtlAdvPayAct_upd_srv_req_no) return doDtlAdvPayAct_upd_srv_req_no_VC(info);
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
	 * [DtlApd]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_chk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_ntc_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_ntc_rev_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_chk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_rev_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[bsppl_cl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_cl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[reg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_reg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_dpt_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[pay_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_xrate_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[last_pay_schd_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_last_pay_schd_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_amt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_ret_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_ret_amt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[schd_pay_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_schd_pay_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[adv_pay_bal]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_adv_pay_bal_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[adv_pay_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_adv_pay_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_adv_pay_setoff_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_adv_pay_setoff_tax_amt_VC(MCEventInfo info){
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
	 * [DtlApd]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_sppl_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[trd_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[trd_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[trd_cur_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_trd_cur_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[base_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_base_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[base_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_base_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[base_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_base_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[base_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_base_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[base_cur_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_base_cur_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_pay_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_pay_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[base_purc_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_base_purc_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[pay_ntc_d_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_pay_ntc_d_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[ap_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_ap_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[purc_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_purc_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_bp_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_bp_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlApd]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlApd_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[pay_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_pay_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_pay_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_pay_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[pay_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_pay_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[trd_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_trd_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[base_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_base_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[base_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_base_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[base_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_base_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[pay_ntc_d_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_pay_ntc_d_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAct]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAct_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_adv_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_adv_pay_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[pay_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_pay_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_trd_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_base_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_base_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_base_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlAdvPayAct_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == DtlApdTable) doDtlApd_NC(info);
		else if (nc == DtlActTable) doDtlAct_NC(info);
		else if (nc == DtlAdvPayActTable) doDtlAdvPayAct_NC(info);
		else if (nc == Cnd_pay_chk_no) doCnd_pay_chk_no_NC(info);
		else if (nc == Cnd_pay_ntc_rev) doCnd_pay_ntc_rev_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Hdr_pay_chk_no) doHdr_pay_chk_no_NC(info);
		else if (nc == Hdr_pay_ntc_rev) doHdr_pay_ntc_rev_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_bsppl_cl_dt) doHdr_bsppl_cl_dt_NC(info);
		else if (nc == Hdr_reg_dt) doHdr_reg_dt_NC(info);
		else if (nc == Hdr_pay_spot_flg) doHdr_pay_spot_flg_NC(info);
		else if (nc == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NC(info);
		else if (nc == Hdr_bsppl_cd) doHdr_bsppl_cd_NC(info);
		else if (nc == Hdr_bsppl_nm) doHdr_bsppl_nm_NC(info);
		else if (nc == Hdr_bsppl_dpt_cd) doHdr_bsppl_dpt_cd_NC(info);
		else if (nc == Hdr_bsppl_dpt_nm) doHdr_bsppl_dpt_nm_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_pay_xrate) doHdr_pay_xrate_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_last_pay_schd_amt) doHdr_last_pay_schd_amt_NC(info);
		else if (nc == Hdr_pay_amt) doHdr_pay_amt_NC(info);
		else if (nc == Hdr_sw_amt) doHdr_sw_amt_NC(info);
		else if (nc == Hdr_bfw_amt) doHdr_bfw_amt_NC(info);
		else if (nc == Hdr_purc_amt) doHdr_purc_amt_NC(info);
		else if (nc == Hdr_purc_dscnt_amt) doHdr_purc_dscnt_amt_NC(info);
		else if (nc == Hdr_purc_ret_amt) doHdr_purc_ret_amt_NC(info);
		else if (nc == Hdr_setoff_amt) doHdr_setoff_amt_NC(info);
		else if (nc == Hdr_tax_amt) doHdr_tax_amt_NC(info);
		else if (nc == Hdr_sw_to_amt) doHdr_sw_to_amt_NC(info);
		else if (nc == Hdr_schd_pay_amt) doHdr_schd_pay_amt_NC(info);
		else if (nc == Hdr_adv_pay_bal) doHdr_adv_pay_bal_NC(info);
		else if (nc == Hdr_adv_pay_amt) doHdr_adv_pay_amt_NC(info);
		else if (nc == Hdr_adv_pay_setoff_amt) doHdr_adv_pay_setoff_amt_NC(info);
		else if (nc == Hdr_adv_pay_setoff_tax_amt) doHdr_adv_pay_setoff_tax_amt_NC(info);
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
		else if (nc == columnDtlApd_trd_cd) doDtlApd_trd_cd_NC(info);
		else if (nc == columnDtlApd_trd_nm) doDtlApd_trd_nm_NC(info);
		else if (nc == columnDtlApd_slip_sts_typ) doDtlApd_slip_sts_typ_NC(info);
		else if (nc == columnDtlApd_slip_sts_typ_nm) doDtlApd_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtlApd_act_dt) doDtlApd_act_dt_NC(info);
		else if (nc == columnDtlApd_sundry_itm_flg) doDtlApd_sundry_itm_flg_NC(info);
		else if (nc == columnDtlApd_sppl_itm_cd) doDtlApd_sppl_itm_cd_NC(info);
		else if (nc == columnDtlApd_sppl_itm_nm) doDtlApd_sppl_itm_nm_NC(info);
		else if (nc == columnDtlApd_trd_unit_cd) doDtlApd_trd_unit_cd_NC(info);
		else if (nc == columnDtlApd_trd_unit_nm) doDtlApd_trd_unit_nm_NC(info);
		else if (nc == columnDtlApd_trd_unit_qty) doDtlApd_trd_unit_qty_NC(info);
		else if (nc == columnDtlApd_tax_cd) doDtlApd_tax_cd_NC(info);
		else if (nc == columnDtlApd_tax_nm) doDtlApd_tax_nm_NC(info);
		else if (nc == columnDtlApd_inc_tax_flg) doDtlApd_inc_tax_flg_NC(info);
		else if (nc == columnDtlApd_tax_rate) doDtlApd_tax_rate_NC(info);
		else if (nc == columnDtlApd_interim_flg) doDtlApd_interim_flg_NC(info);
		else if (nc == columnDtlApd_trd_cur_upri) doDtlApd_trd_cur_upri_NC(info);
		else if (nc == columnDtlApd_trd_cur_amt) doDtlApd_trd_cur_amt_NC(info);
		else if (nc == columnDtlApd_trd_cur_tax_amt) doDtlApd_trd_cur_tax_amt_NC(info);
		else if (nc == columnDtlApd_trd_cur_inc_tax_amt) doDtlApd_trd_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlApd_trd_cur_dscnt_amt) doDtlApd_trd_cur_dscnt_amt_NC(info);
		else if (nc == columnDtlApd_base_cur_upri) doDtlApd_base_cur_upri_NC(info);
		else if (nc == columnDtlApd_base_cur_amt) doDtlApd_base_cur_amt_NC(info);
		else if (nc == columnDtlApd_base_cur_tax_amt) doDtlApd_base_cur_tax_amt_NC(info);
		else if (nc == columnDtlApd_base_cur_inc_tax_amt) doDtlApd_base_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlApd_base_cur_dscnt_amt) doDtlApd_base_cur_dscnt_amt_NC(info);
		else if (nc == columnDtlApd_sppl_cd) doDtlApd_sppl_cd_NC(info);
		else if (nc == columnDtlApd_sppl_nm) doDtlApd_sppl_nm_NC(info);
		else if (nc == columnDtlApd_asppl_cd) doDtlApd_asppl_cd_NC(info);
		else if (nc == columnDtlApd_asppl_nm) doDtlApd_asppl_nm_NC(info);
		else if (nc == columnDtlApd_pay_mtd_typ) doDtlApd_pay_mtd_typ_NC(info);
		else if (nc == columnDtlApd_pay_mtd_typ_nm) doDtlApd_pay_mtd_typ_nm_NC(info);
		else if (nc == columnDtlApd_base_purc_ac_dt) doDtlApd_base_purc_ac_dt_NC(info);
		else if (nc == columnDtlApd_pay_ntc_d_print_rmrks) doDtlApd_pay_ntc_d_print_rmrks_NC(info);
		else if (nc == columnDtlApd_ap_d_no) doDtlApd_ap_d_no_NC(info);
		else if (nc == columnDtlApd_po_no) doDtlApd_po_no_NC(info);
		else if (nc == columnDtlApd_po_d_no) doDtlApd_po_d_no_NC(info);
		else if (nc == columnDtlApd_purc_act_no) doDtlApd_purc_act_no_NC(info);
		else if (nc == columnDtlApd_purc_act_rev) doDtlApd_purc_act_rev_NC(info);
		else if (nc == columnDtlApd_purc_act_d_no) doDtlApd_purc_act_d_no_NC(info);
		else if (nc == columnDtlApd_bp_dlv_slip_no) doDtlApd_bp_dlv_slip_no_NC(info);
		else if (nc == columnDtlApd_bp_dlv_slip_d_no) doDtlApd_bp_dlv_slip_d_no_NC(info);
		else if (nc == columnDtlApd_sub_char1) doDtlApd_sub_char1_NC(info);
		else if (nc == columnDtlApd_sub_char2) doDtlApd_sub_char2_NC(info);
		else if (nc == columnDtlApd_sub_char3) doDtlApd_sub_char3_NC(info);
		else if (nc == columnDtlApd_ins_usr_id) doDtlApd_ins_usr_id_NC(info);
		else if (nc == columnDtlApd_ins_usr_nm) doDtlApd_ins_usr_nm_NC(info);
		else if (nc == columnDtlApd_ins_func_id) doDtlApd_ins_func_id_NC(info);
		else if (nc == columnDtlApd_ins_func_nm) doDtlApd_ins_func_nm_NC(info);
		else if (nc == columnDtlApd_upd_usr_id) doDtlApd_upd_usr_id_NC(info);
		else if (nc == columnDtlApd_upd_usr_nm) doDtlApd_upd_usr_nm_NC(info);
		else if (nc == columnDtlApd_upd_func_id) doDtlApd_upd_func_id_NC(info);
		else if (nc == columnDtlApd_upd_func_nm) doDtlApd_upd_func_nm_NC(info);
		else if (nc == columnDtlApd_ins_ts) doDtlApd_ins_ts_NC(info);
		else if (nc == columnDtlApd_upd_ts) doDtlApd_upd_ts_NC(info);
		else if (nc == columnDtlApd_upd_srv_req_no) doDtlApd_upd_srv_req_no_NC(info);
		else if (nc == columnDtlAct_pay_act_no) doDtlAct_pay_act_no_NC(info);
		else if (nc == columnDtlAct_pay_act_seq) doDtlAct_pay_act_seq_NC(info);
		else if (nc == columnDtlAct_pay_act_d_no) doDtlAct_pay_act_d_no_NC(info);
		else if (nc == columnDtlAct_pay_act_d_seq) doDtlAct_pay_act_d_seq_NC(info);
		else if (nc == columnDtlAct_ap_sttl_cd) doDtlAct_ap_sttl_cd_NC(info);
		else if (nc == columnDtlAct_ap_sttl_nm) doDtlAct_ap_sttl_nm_NC(info);
		else if (nc == columnDtlAct_slip_sts_typ) doDtlAct_slip_sts_typ_NC(info);
		else if (nc == columnDtlAct_slip_sts_typ_nm) doDtlAct_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtlAct_pay_act_dt) doDtlAct_pay_act_dt_NC(info);
		else if (nc == columnDtlAct_tax_cd) doDtlAct_tax_cd_NC(info);
		else if (nc == columnDtlAct_tax_nm) doDtlAct_tax_nm_NC(info);
		else if (nc == columnDtlAct_inc_tax_flg) doDtlAct_inc_tax_flg_NC(info);
		else if (nc == columnDtlAct_tax_rate) doDtlAct_tax_rate_NC(info);
		else if (nc == columnDtlAct_trd_cur_amt) doDtlAct_trd_cur_amt_NC(info);
		else if (nc == columnDtlAct_trd_cur_tax_amt) doDtlAct_trd_cur_tax_amt_NC(info);
		else if (nc == columnDtlAct_trd_cur_inc_tax_amt) doDtlAct_trd_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlAct_base_cur_amt) doDtlAct_base_cur_amt_NC(info);
		else if (nc == columnDtlAct_base_cur_tax_amt) doDtlAct_base_cur_tax_amt_NC(info);
		else if (nc == columnDtlAct_base_cur_inc_tax_amt) doDtlAct_base_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlAct_pay_ntc_d_print_rmrks) doDtlAct_pay_ntc_d_print_rmrks_NC(info);
		else if (nc == columnDtlAct_sub_char1) doDtlAct_sub_char1_NC(info);
		else if (nc == columnDtlAct_sub_char2) doDtlAct_sub_char2_NC(info);
		else if (nc == columnDtlAct_sub_char3) doDtlAct_sub_char3_NC(info);
		else if (nc == columnDtlAct_ins_usr_id) doDtlAct_ins_usr_id_NC(info);
		else if (nc == columnDtlAct_ins_usr_nm) doDtlAct_ins_usr_nm_NC(info);
		else if (nc == columnDtlAct_ins_func_id) doDtlAct_ins_func_id_NC(info);
		else if (nc == columnDtlAct_ins_func_nm) doDtlAct_ins_func_nm_NC(info);
		else if (nc == columnDtlAct_upd_usr_id) doDtlAct_upd_usr_id_NC(info);
		else if (nc == columnDtlAct_upd_usr_nm) doDtlAct_upd_usr_nm_NC(info);
		else if (nc == columnDtlAct_upd_func_id) doDtlAct_upd_func_id_NC(info);
		else if (nc == columnDtlAct_upd_func_nm) doDtlAct_upd_func_nm_NC(info);
		else if (nc == columnDtlAct_ins_ts) doDtlAct_ins_ts_NC(info);
		else if (nc == columnDtlAct_upd_ts) doDtlAct_upd_ts_NC(info);
		else if (nc == columnDtlAct_upd_srv_req_no) doDtlAct_upd_srv_req_no_NC(info);
		else if (nc == columnDtlAdvPayAct_adv_pay_act_no) doDtlAdvPayAct_adv_pay_act_no_NC(info);
		else if (nc == columnDtlAdvPayAct_adv_pay_act_seq) doDtlAdvPayAct_adv_pay_act_seq_NC(info);
		else if (nc == columnDtlAdvPayAct_ap_sttl_cd) doDtlAdvPayAct_ap_sttl_cd_NC(info);
		else if (nc == columnDtlAdvPayAct_ap_sttl_nm) doDtlAdvPayAct_ap_sttl_nm_NC(info);
		else if (nc == columnDtlAdvPayAct_slip_sts_typ) doDtlAdvPayAct_slip_sts_typ_NC(info);
		else if (nc == columnDtlAdvPayAct_slip_sts_typ_nm) doDtlAdvPayAct_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtlAdvPayAct_pay_act_dt) doDtlAdvPayAct_pay_act_dt_NC(info);
		else if (nc == columnDtlAdvPayAct_tax_cd) doDtlAdvPayAct_tax_cd_NC(info);
		else if (nc == columnDtlAdvPayAct_tax_nm) doDtlAdvPayAct_tax_nm_NC(info);
		else if (nc == columnDtlAdvPayAct_inc_tax_flg) doDtlAdvPayAct_inc_tax_flg_NC(info);
		else if (nc == columnDtlAdvPayAct_tax_rate) doDtlAdvPayAct_tax_rate_NC(info);
		else if (nc == columnDtlAdvPayAct_trd_cur_amt) doDtlAdvPayAct_trd_cur_amt_NC(info);
		else if (nc == columnDtlAdvPayAct_trd_cur_tax_amt) doDtlAdvPayAct_trd_cur_tax_amt_NC(info);
		else if (nc == columnDtlAdvPayAct_trd_cur_inc_tax_amt) doDtlAdvPayAct_trd_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlAdvPayAct_base_cur_amt) doDtlAdvPayAct_base_cur_amt_NC(info);
		else if (nc == columnDtlAdvPayAct_base_cur_tax_amt) doDtlAdvPayAct_base_cur_tax_amt_NC(info);
		else if (nc == columnDtlAdvPayAct_base_cur_inc_tax_amt) doDtlAdvPayAct_base_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtlAdvPayAct_sub_char1) doDtlAdvPayAct_sub_char1_NC(info);
		else if (nc == columnDtlAdvPayAct_sub_char2) doDtlAdvPayAct_sub_char2_NC(info);
		else if (nc == columnDtlAdvPayAct_sub_char3) doDtlAdvPayAct_sub_char3_NC(info);
		else if (nc == columnDtlAdvPayAct_ins_usr_id) doDtlAdvPayAct_ins_usr_id_NC(info);
		else if (nc == columnDtlAdvPayAct_ins_usr_nm) doDtlAdvPayAct_ins_usr_nm_NC(info);
		else if (nc == columnDtlAdvPayAct_ins_func_id) doDtlAdvPayAct_ins_func_id_NC(info);
		else if (nc == columnDtlAdvPayAct_ins_func_nm) doDtlAdvPayAct_ins_func_nm_NC(info);
		else if (nc == columnDtlAdvPayAct_upd_usr_id) doDtlAdvPayAct_upd_usr_id_NC(info);
		else if (nc == columnDtlAdvPayAct_upd_usr_nm) doDtlAdvPayAct_upd_usr_nm_NC(info);
		else if (nc == columnDtlAdvPayAct_upd_func_id) doDtlAdvPayAct_upd_func_id_NC(info);
		else if (nc == columnDtlAdvPayAct_upd_func_nm) doDtlAdvPayAct_upd_func_nm_NC(info);
		else if (nc == columnDtlAdvPayAct_ins_ts) doDtlAdvPayAct_ins_ts_NC(info);
		else if (nc == columnDtlAdvPayAct_upd_ts) doDtlAdvPayAct_upd_ts_NC(info);
		else if (nc == columnDtlAdvPayAct_upd_srv_req_no) doDtlAdvPayAct_upd_srv_req_no_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_ntc_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_ntc_rev_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_rev_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[bsppl_cl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_cl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[reg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_reg_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[pay_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_xrate_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[last_pay_schd_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_pay_schd_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_amt_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ret_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ret_amt_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[schd_pay_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_schd_pay_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_bal]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_bal_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_setoff_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_setoff_tax_amt_NC(MCEventInfo info){
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
	 * [DtlApd]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_purc_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_purc_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_ntc_d_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_ntc_d_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ap_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ap_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_bp_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_bp_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_ntc_d_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_ntc_d_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_adv_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_adv_pay_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[pay_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_pay_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == DtlApdTable) doDtlApd_NE(info);
		else if (ne == DtlActTable) doDtlAct_NE(info);
		else if (ne == DtlAdvPayActTable) doDtlAdvPayAct_NE(info);
		else if (ne == Cnd_pay_chk_no) doCnd_pay_chk_no_NE(info);
		else if (ne == Cnd_pay_ntc_rev) doCnd_pay_ntc_rev_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Hdr_pay_chk_no) doHdr_pay_chk_no_NE(info);
		else if (ne == Hdr_pay_ntc_rev) doHdr_pay_ntc_rev_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_bsppl_cl_dt) doHdr_bsppl_cl_dt_NE(info);
		else if (ne == Hdr_reg_dt) doHdr_reg_dt_NE(info);
		else if (ne == Hdr_pay_spot_flg) doHdr_pay_spot_flg_NE(info);
		else if (ne == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NE(info);
		else if (ne == Hdr_bsppl_cd) doHdr_bsppl_cd_NE(info);
		else if (ne == Hdr_bsppl_nm) doHdr_bsppl_nm_NE(info);
		else if (ne == Hdr_bsppl_dpt_cd) doHdr_bsppl_dpt_cd_NE(info);
		else if (ne == Hdr_bsppl_dpt_nm) doHdr_bsppl_dpt_nm_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_pay_xrate) doHdr_pay_xrate_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_last_pay_schd_amt) doHdr_last_pay_schd_amt_NE(info);
		else if (ne == Hdr_pay_amt) doHdr_pay_amt_NE(info);
		else if (ne == Hdr_sw_amt) doHdr_sw_amt_NE(info);
		else if (ne == Hdr_bfw_amt) doHdr_bfw_amt_NE(info);
		else if (ne == Hdr_purc_amt) doHdr_purc_amt_NE(info);
		else if (ne == Hdr_purc_dscnt_amt) doHdr_purc_dscnt_amt_NE(info);
		else if (ne == Hdr_purc_ret_amt) doHdr_purc_ret_amt_NE(info);
		else if (ne == Hdr_setoff_amt) doHdr_setoff_amt_NE(info);
		else if (ne == Hdr_tax_amt) doHdr_tax_amt_NE(info);
		else if (ne == Hdr_sw_to_amt) doHdr_sw_to_amt_NE(info);
		else if (ne == Hdr_schd_pay_amt) doHdr_schd_pay_amt_NE(info);
		else if (ne == Hdr_adv_pay_bal) doHdr_adv_pay_bal_NE(info);
		else if (ne == Hdr_adv_pay_amt) doHdr_adv_pay_amt_NE(info);
		else if (ne == Hdr_adv_pay_setoff_amt) doHdr_adv_pay_setoff_amt_NE(info);
		else if (ne == Hdr_adv_pay_setoff_tax_amt) doHdr_adv_pay_setoff_tax_amt_NE(info);
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
		else if (ne == columnDtlApd_trd_cd) doDtlApd_trd_cd_NE(info);
		else if (ne == columnDtlApd_trd_nm) doDtlApd_trd_nm_NE(info);
		else if (ne == columnDtlApd_slip_sts_typ) doDtlApd_slip_sts_typ_NE(info);
		else if (ne == columnDtlApd_slip_sts_typ_nm) doDtlApd_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtlApd_act_dt) doDtlApd_act_dt_NE(info);
		else if (ne == columnDtlApd_sundry_itm_flg) doDtlApd_sundry_itm_flg_NE(info);
		else if (ne == columnDtlApd_sppl_itm_cd) doDtlApd_sppl_itm_cd_NE(info);
		else if (ne == columnDtlApd_sppl_itm_nm) doDtlApd_sppl_itm_nm_NE(info);
		else if (ne == columnDtlApd_trd_unit_cd) doDtlApd_trd_unit_cd_NE(info);
		else if (ne == columnDtlApd_trd_unit_nm) doDtlApd_trd_unit_nm_NE(info);
		else if (ne == columnDtlApd_trd_unit_qty) doDtlApd_trd_unit_qty_NE(info);
		else if (ne == columnDtlApd_tax_cd) doDtlApd_tax_cd_NE(info);
		else if (ne == columnDtlApd_tax_nm) doDtlApd_tax_nm_NE(info);
		else if (ne == columnDtlApd_inc_tax_flg) doDtlApd_inc_tax_flg_NE(info);
		else if (ne == columnDtlApd_tax_rate) doDtlApd_tax_rate_NE(info);
		else if (ne == columnDtlApd_interim_flg) doDtlApd_interim_flg_NE(info);
		else if (ne == columnDtlApd_trd_cur_upri) doDtlApd_trd_cur_upri_NE(info);
		else if (ne == columnDtlApd_trd_cur_amt) doDtlApd_trd_cur_amt_NE(info);
		else if (ne == columnDtlApd_trd_cur_tax_amt) doDtlApd_trd_cur_tax_amt_NE(info);
		else if (ne == columnDtlApd_trd_cur_inc_tax_amt) doDtlApd_trd_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlApd_trd_cur_dscnt_amt) doDtlApd_trd_cur_dscnt_amt_NE(info);
		else if (ne == columnDtlApd_base_cur_upri) doDtlApd_base_cur_upri_NE(info);
		else if (ne == columnDtlApd_base_cur_amt) doDtlApd_base_cur_amt_NE(info);
		else if (ne == columnDtlApd_base_cur_tax_amt) doDtlApd_base_cur_tax_amt_NE(info);
		else if (ne == columnDtlApd_base_cur_inc_tax_amt) doDtlApd_base_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlApd_base_cur_dscnt_amt) doDtlApd_base_cur_dscnt_amt_NE(info);
		else if (ne == columnDtlApd_sppl_cd) doDtlApd_sppl_cd_NE(info);
		else if (ne == columnDtlApd_sppl_nm) doDtlApd_sppl_nm_NE(info);
		else if (ne == columnDtlApd_asppl_cd) doDtlApd_asppl_cd_NE(info);
		else if (ne == columnDtlApd_asppl_nm) doDtlApd_asppl_nm_NE(info);
		else if (ne == columnDtlApd_pay_mtd_typ) doDtlApd_pay_mtd_typ_NE(info);
		else if (ne == columnDtlApd_pay_mtd_typ_nm) doDtlApd_pay_mtd_typ_nm_NE(info);
		else if (ne == columnDtlApd_base_purc_ac_dt) doDtlApd_base_purc_ac_dt_NE(info);
		else if (ne == columnDtlApd_pay_ntc_d_print_rmrks) doDtlApd_pay_ntc_d_print_rmrks_NE(info);
		else if (ne == columnDtlApd_ap_d_no) doDtlApd_ap_d_no_NE(info);
		else if (ne == columnDtlApd_po_no) doDtlApd_po_no_NE(info);
		else if (ne == columnDtlApd_po_d_no) doDtlApd_po_d_no_NE(info);
		else if (ne == columnDtlApd_purc_act_no) doDtlApd_purc_act_no_NE(info);
		else if (ne == columnDtlApd_purc_act_rev) doDtlApd_purc_act_rev_NE(info);
		else if (ne == columnDtlApd_purc_act_d_no) doDtlApd_purc_act_d_no_NE(info);
		else if (ne == columnDtlApd_bp_dlv_slip_no) doDtlApd_bp_dlv_slip_no_NE(info);
		else if (ne == columnDtlApd_bp_dlv_slip_d_no) doDtlApd_bp_dlv_slip_d_no_NE(info);
		else if (ne == columnDtlApd_sub_char1) doDtlApd_sub_char1_NE(info);
		else if (ne == columnDtlApd_sub_char2) doDtlApd_sub_char2_NE(info);
		else if (ne == columnDtlApd_sub_char3) doDtlApd_sub_char3_NE(info);
		else if (ne == columnDtlApd_ins_usr_id) doDtlApd_ins_usr_id_NE(info);
		else if (ne == columnDtlApd_ins_usr_nm) doDtlApd_ins_usr_nm_NE(info);
		else if (ne == columnDtlApd_ins_func_id) doDtlApd_ins_func_id_NE(info);
		else if (ne == columnDtlApd_ins_func_nm) doDtlApd_ins_func_nm_NE(info);
		else if (ne == columnDtlApd_upd_usr_id) doDtlApd_upd_usr_id_NE(info);
		else if (ne == columnDtlApd_upd_usr_nm) doDtlApd_upd_usr_nm_NE(info);
		else if (ne == columnDtlApd_upd_func_id) doDtlApd_upd_func_id_NE(info);
		else if (ne == columnDtlApd_upd_func_nm) doDtlApd_upd_func_nm_NE(info);
		else if (ne == columnDtlApd_ins_ts) doDtlApd_ins_ts_NE(info);
		else if (ne == columnDtlApd_upd_ts) doDtlApd_upd_ts_NE(info);
		else if (ne == columnDtlApd_upd_srv_req_no) doDtlApd_upd_srv_req_no_NE(info);
		else if (ne == columnDtlAct_pay_act_no) doDtlAct_pay_act_no_NE(info);
		else if (ne == columnDtlAct_pay_act_seq) doDtlAct_pay_act_seq_NE(info);
		else if (ne == columnDtlAct_pay_act_d_no) doDtlAct_pay_act_d_no_NE(info);
		else if (ne == columnDtlAct_pay_act_d_seq) doDtlAct_pay_act_d_seq_NE(info);
		else if (ne == columnDtlAct_ap_sttl_cd) doDtlAct_ap_sttl_cd_NE(info);
		else if (ne == columnDtlAct_ap_sttl_nm) doDtlAct_ap_sttl_nm_NE(info);
		else if (ne == columnDtlAct_slip_sts_typ) doDtlAct_slip_sts_typ_NE(info);
		else if (ne == columnDtlAct_slip_sts_typ_nm) doDtlAct_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtlAct_pay_act_dt) doDtlAct_pay_act_dt_NE(info);
		else if (ne == columnDtlAct_tax_cd) doDtlAct_tax_cd_NE(info);
		else if (ne == columnDtlAct_tax_nm) doDtlAct_tax_nm_NE(info);
		else if (ne == columnDtlAct_inc_tax_flg) doDtlAct_inc_tax_flg_NE(info);
		else if (ne == columnDtlAct_tax_rate) doDtlAct_tax_rate_NE(info);
		else if (ne == columnDtlAct_trd_cur_amt) doDtlAct_trd_cur_amt_NE(info);
		else if (ne == columnDtlAct_trd_cur_tax_amt) doDtlAct_trd_cur_tax_amt_NE(info);
		else if (ne == columnDtlAct_trd_cur_inc_tax_amt) doDtlAct_trd_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlAct_base_cur_amt) doDtlAct_base_cur_amt_NE(info);
		else if (ne == columnDtlAct_base_cur_tax_amt) doDtlAct_base_cur_tax_amt_NE(info);
		else if (ne == columnDtlAct_base_cur_inc_tax_amt) doDtlAct_base_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlAct_pay_ntc_d_print_rmrks) doDtlAct_pay_ntc_d_print_rmrks_NE(info);
		else if (ne == columnDtlAct_sub_char1) doDtlAct_sub_char1_NE(info);
		else if (ne == columnDtlAct_sub_char2) doDtlAct_sub_char2_NE(info);
		else if (ne == columnDtlAct_sub_char3) doDtlAct_sub_char3_NE(info);
		else if (ne == columnDtlAct_ins_usr_id) doDtlAct_ins_usr_id_NE(info);
		else if (ne == columnDtlAct_ins_usr_nm) doDtlAct_ins_usr_nm_NE(info);
		else if (ne == columnDtlAct_ins_func_id) doDtlAct_ins_func_id_NE(info);
		else if (ne == columnDtlAct_ins_func_nm) doDtlAct_ins_func_nm_NE(info);
		else if (ne == columnDtlAct_upd_usr_id) doDtlAct_upd_usr_id_NE(info);
		else if (ne == columnDtlAct_upd_usr_nm) doDtlAct_upd_usr_nm_NE(info);
		else if (ne == columnDtlAct_upd_func_id) doDtlAct_upd_func_id_NE(info);
		else if (ne == columnDtlAct_upd_func_nm) doDtlAct_upd_func_nm_NE(info);
		else if (ne == columnDtlAct_ins_ts) doDtlAct_ins_ts_NE(info);
		else if (ne == columnDtlAct_upd_ts) doDtlAct_upd_ts_NE(info);
		else if (ne == columnDtlAct_upd_srv_req_no) doDtlAct_upd_srv_req_no_NE(info);
		else if (ne == columnDtlAdvPayAct_adv_pay_act_no) doDtlAdvPayAct_adv_pay_act_no_NE(info);
		else if (ne == columnDtlAdvPayAct_adv_pay_act_seq) doDtlAdvPayAct_adv_pay_act_seq_NE(info);
		else if (ne == columnDtlAdvPayAct_ap_sttl_cd) doDtlAdvPayAct_ap_sttl_cd_NE(info);
		else if (ne == columnDtlAdvPayAct_ap_sttl_nm) doDtlAdvPayAct_ap_sttl_nm_NE(info);
		else if (ne == columnDtlAdvPayAct_slip_sts_typ) doDtlAdvPayAct_slip_sts_typ_NE(info);
		else if (ne == columnDtlAdvPayAct_slip_sts_typ_nm) doDtlAdvPayAct_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtlAdvPayAct_pay_act_dt) doDtlAdvPayAct_pay_act_dt_NE(info);
		else if (ne == columnDtlAdvPayAct_tax_cd) doDtlAdvPayAct_tax_cd_NE(info);
		else if (ne == columnDtlAdvPayAct_tax_nm) doDtlAdvPayAct_tax_nm_NE(info);
		else if (ne == columnDtlAdvPayAct_inc_tax_flg) doDtlAdvPayAct_inc_tax_flg_NE(info);
		else if (ne == columnDtlAdvPayAct_tax_rate) doDtlAdvPayAct_tax_rate_NE(info);
		else if (ne == columnDtlAdvPayAct_trd_cur_amt) doDtlAdvPayAct_trd_cur_amt_NE(info);
		else if (ne == columnDtlAdvPayAct_trd_cur_tax_amt) doDtlAdvPayAct_trd_cur_tax_amt_NE(info);
		else if (ne == columnDtlAdvPayAct_trd_cur_inc_tax_amt) doDtlAdvPayAct_trd_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlAdvPayAct_base_cur_amt) doDtlAdvPayAct_base_cur_amt_NE(info);
		else if (ne == columnDtlAdvPayAct_base_cur_tax_amt) doDtlAdvPayAct_base_cur_tax_amt_NE(info);
		else if (ne == columnDtlAdvPayAct_base_cur_inc_tax_amt) doDtlAdvPayAct_base_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtlAdvPayAct_sub_char1) doDtlAdvPayAct_sub_char1_NE(info);
		else if (ne == columnDtlAdvPayAct_sub_char2) doDtlAdvPayAct_sub_char2_NE(info);
		else if (ne == columnDtlAdvPayAct_sub_char3) doDtlAdvPayAct_sub_char3_NE(info);
		else if (ne == columnDtlAdvPayAct_ins_usr_id) doDtlAdvPayAct_ins_usr_id_NE(info);
		else if (ne == columnDtlAdvPayAct_ins_usr_nm) doDtlAdvPayAct_ins_usr_nm_NE(info);
		else if (ne == columnDtlAdvPayAct_ins_func_id) doDtlAdvPayAct_ins_func_id_NE(info);
		else if (ne == columnDtlAdvPayAct_ins_func_nm) doDtlAdvPayAct_ins_func_nm_NE(info);
		else if (ne == columnDtlAdvPayAct_upd_usr_id) doDtlAdvPayAct_upd_usr_id_NE(info);
		else if (ne == columnDtlAdvPayAct_upd_usr_nm) doDtlAdvPayAct_upd_usr_nm_NE(info);
		else if (ne == columnDtlAdvPayAct_upd_func_id) doDtlAdvPayAct_upd_func_id_NE(info);
		else if (ne == columnDtlAdvPayAct_upd_func_nm) doDtlAdvPayAct_upd_func_nm_NE(info);
		else if (ne == columnDtlAdvPayAct_ins_ts) doDtlAdvPayAct_ins_ts_NE(info);
		else if (ne == columnDtlAdvPayAct_upd_ts) doDtlAdvPayAct_upd_ts_NE(info);
		else if (ne == columnDtlAdvPayAct_upd_srv_req_no) doDtlAdvPayAct_upd_srv_req_no_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_ntc_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_ntc_rev_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_rev_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[bsppl_cl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_cl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[reg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_reg_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[pay_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_xrate_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[last_pay_schd_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_pay_schd_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_amt_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ret_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ret_amt_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[schd_pay_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_schd_pay_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_bal]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_bal_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_setoff_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_setoff_tax_amt_NE(MCEventInfo info){
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
	 * [DtlApd]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_purc_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_purc_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_ntc_d_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_ntc_d_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ap_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ap_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_bp_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_bp_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_ntc_d_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_ntc_d_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_adv_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_adv_pay_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[pay_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_pay_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == DtlApdTable) doDtlApd_NX(info);
		else if (nx == DtlActTable) doDtlAct_NX(info);
		else if (nx == DtlAdvPayActTable) doDtlAdvPayAct_NX(info);
		else if (nx == Cnd_pay_chk_no) doCnd_pay_chk_no_NX(info);
		else if (nx == Cnd_pay_ntc_rev) doCnd_pay_ntc_rev_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Hdr_pay_chk_no) doHdr_pay_chk_no_NX(info);
		else if (nx == Hdr_pay_ntc_rev) doHdr_pay_ntc_rev_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_bsppl_cl_dt) doHdr_bsppl_cl_dt_NX(info);
		else if (nx == Hdr_reg_dt) doHdr_reg_dt_NX(info);
		else if (nx == Hdr_pay_spot_flg) doHdr_pay_spot_flg_NX(info);
		else if (nx == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NX(info);
		else if (nx == Hdr_bsppl_cd) doHdr_bsppl_cd_NX(info);
		else if (nx == Hdr_bsppl_nm) doHdr_bsppl_nm_NX(info);
		else if (nx == Hdr_bsppl_dpt_cd) doHdr_bsppl_dpt_cd_NX(info);
		else if (nx == Hdr_bsppl_dpt_nm) doHdr_bsppl_dpt_nm_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_pay_xrate) doHdr_pay_xrate_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_last_pay_schd_amt) doHdr_last_pay_schd_amt_NX(info);
		else if (nx == Hdr_pay_amt) doHdr_pay_amt_NX(info);
		else if (nx == Hdr_sw_amt) doHdr_sw_amt_NX(info);
		else if (nx == Hdr_bfw_amt) doHdr_bfw_amt_NX(info);
		else if (nx == Hdr_purc_amt) doHdr_purc_amt_NX(info);
		else if (nx == Hdr_purc_dscnt_amt) doHdr_purc_dscnt_amt_NX(info);
		else if (nx == Hdr_purc_ret_amt) doHdr_purc_ret_amt_NX(info);
		else if (nx == Hdr_setoff_amt) doHdr_setoff_amt_NX(info);
		else if (nx == Hdr_tax_amt) doHdr_tax_amt_NX(info);
		else if (nx == Hdr_sw_to_amt) doHdr_sw_to_amt_NX(info);
		else if (nx == Hdr_schd_pay_amt) doHdr_schd_pay_amt_NX(info);
		else if (nx == Hdr_adv_pay_bal) doHdr_adv_pay_bal_NX(info);
		else if (nx == Hdr_adv_pay_amt) doHdr_adv_pay_amt_NX(info);
		else if (nx == Hdr_adv_pay_setoff_amt) doHdr_adv_pay_setoff_amt_NX(info);
		else if (nx == Hdr_adv_pay_setoff_tax_amt) doHdr_adv_pay_setoff_tax_amt_NX(info);
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
		else if (nx == columnDtlApd_trd_cd) doDtlApd_trd_cd_NX(info);
		else if (nx == columnDtlApd_trd_nm) doDtlApd_trd_nm_NX(info);
		else if (nx == columnDtlApd_slip_sts_typ) doDtlApd_slip_sts_typ_NX(info);
		else if (nx == columnDtlApd_slip_sts_typ_nm) doDtlApd_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtlApd_act_dt) doDtlApd_act_dt_NX(info);
		else if (nx == columnDtlApd_sundry_itm_flg) doDtlApd_sundry_itm_flg_NX(info);
		else if (nx == columnDtlApd_sppl_itm_cd) doDtlApd_sppl_itm_cd_NX(info);
		else if (nx == columnDtlApd_sppl_itm_nm) doDtlApd_sppl_itm_nm_NX(info);
		else if (nx == columnDtlApd_trd_unit_cd) doDtlApd_trd_unit_cd_NX(info);
		else if (nx == columnDtlApd_trd_unit_nm) doDtlApd_trd_unit_nm_NX(info);
		else if (nx == columnDtlApd_trd_unit_qty) doDtlApd_trd_unit_qty_NX(info);
		else if (nx == columnDtlApd_tax_cd) doDtlApd_tax_cd_NX(info);
		else if (nx == columnDtlApd_tax_nm) doDtlApd_tax_nm_NX(info);
		else if (nx == columnDtlApd_inc_tax_flg) doDtlApd_inc_tax_flg_NX(info);
		else if (nx == columnDtlApd_tax_rate) doDtlApd_tax_rate_NX(info);
		else if (nx == columnDtlApd_interim_flg) doDtlApd_interim_flg_NX(info);
		else if (nx == columnDtlApd_trd_cur_upri) doDtlApd_trd_cur_upri_NX(info);
		else if (nx == columnDtlApd_trd_cur_amt) doDtlApd_trd_cur_amt_NX(info);
		else if (nx == columnDtlApd_trd_cur_tax_amt) doDtlApd_trd_cur_tax_amt_NX(info);
		else if (nx == columnDtlApd_trd_cur_inc_tax_amt) doDtlApd_trd_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlApd_trd_cur_dscnt_amt) doDtlApd_trd_cur_dscnt_amt_NX(info);
		else if (nx == columnDtlApd_base_cur_upri) doDtlApd_base_cur_upri_NX(info);
		else if (nx == columnDtlApd_base_cur_amt) doDtlApd_base_cur_amt_NX(info);
		else if (nx == columnDtlApd_base_cur_tax_amt) doDtlApd_base_cur_tax_amt_NX(info);
		else if (nx == columnDtlApd_base_cur_inc_tax_amt) doDtlApd_base_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlApd_base_cur_dscnt_amt) doDtlApd_base_cur_dscnt_amt_NX(info);
		else if (nx == columnDtlApd_sppl_cd) doDtlApd_sppl_cd_NX(info);
		else if (nx == columnDtlApd_sppl_nm) doDtlApd_sppl_nm_NX(info);
		else if (nx == columnDtlApd_asppl_cd) doDtlApd_asppl_cd_NX(info);
		else if (nx == columnDtlApd_asppl_nm) doDtlApd_asppl_nm_NX(info);
		else if (nx == columnDtlApd_pay_mtd_typ) doDtlApd_pay_mtd_typ_NX(info);
		else if (nx == columnDtlApd_pay_mtd_typ_nm) doDtlApd_pay_mtd_typ_nm_NX(info);
		else if (nx == columnDtlApd_base_purc_ac_dt) doDtlApd_base_purc_ac_dt_NX(info);
		else if (nx == columnDtlApd_pay_ntc_d_print_rmrks) doDtlApd_pay_ntc_d_print_rmrks_NX(info);
		else if (nx == columnDtlApd_ap_d_no) doDtlApd_ap_d_no_NX(info);
		else if (nx == columnDtlApd_po_no) doDtlApd_po_no_NX(info);
		else if (nx == columnDtlApd_po_d_no) doDtlApd_po_d_no_NX(info);
		else if (nx == columnDtlApd_purc_act_no) doDtlApd_purc_act_no_NX(info);
		else if (nx == columnDtlApd_purc_act_rev) doDtlApd_purc_act_rev_NX(info);
		else if (nx == columnDtlApd_purc_act_d_no) doDtlApd_purc_act_d_no_NX(info);
		else if (nx == columnDtlApd_bp_dlv_slip_no) doDtlApd_bp_dlv_slip_no_NX(info);
		else if (nx == columnDtlApd_bp_dlv_slip_d_no) doDtlApd_bp_dlv_slip_d_no_NX(info);
		else if (nx == columnDtlApd_sub_char1) doDtlApd_sub_char1_NX(info);
		else if (nx == columnDtlApd_sub_char2) doDtlApd_sub_char2_NX(info);
		else if (nx == columnDtlApd_sub_char3) doDtlApd_sub_char3_NX(info);
		else if (nx == columnDtlApd_ins_usr_id) doDtlApd_ins_usr_id_NX(info);
		else if (nx == columnDtlApd_ins_usr_nm) doDtlApd_ins_usr_nm_NX(info);
		else if (nx == columnDtlApd_ins_func_id) doDtlApd_ins_func_id_NX(info);
		else if (nx == columnDtlApd_ins_func_nm) doDtlApd_ins_func_nm_NX(info);
		else if (nx == columnDtlApd_upd_usr_id) doDtlApd_upd_usr_id_NX(info);
		else if (nx == columnDtlApd_upd_usr_nm) doDtlApd_upd_usr_nm_NX(info);
		else if (nx == columnDtlApd_upd_func_id) doDtlApd_upd_func_id_NX(info);
		else if (nx == columnDtlApd_upd_func_nm) doDtlApd_upd_func_nm_NX(info);
		else if (nx == columnDtlApd_ins_ts) doDtlApd_ins_ts_NX(info);
		else if (nx == columnDtlApd_upd_ts) doDtlApd_upd_ts_NX(info);
		else if (nx == columnDtlApd_upd_srv_req_no) doDtlApd_upd_srv_req_no_NX(info);
		else if (nx == columnDtlAct_pay_act_no) doDtlAct_pay_act_no_NX(info);
		else if (nx == columnDtlAct_pay_act_seq) doDtlAct_pay_act_seq_NX(info);
		else if (nx == columnDtlAct_pay_act_d_no) doDtlAct_pay_act_d_no_NX(info);
		else if (nx == columnDtlAct_pay_act_d_seq) doDtlAct_pay_act_d_seq_NX(info);
		else if (nx == columnDtlAct_ap_sttl_cd) doDtlAct_ap_sttl_cd_NX(info);
		else if (nx == columnDtlAct_ap_sttl_nm) doDtlAct_ap_sttl_nm_NX(info);
		else if (nx == columnDtlAct_slip_sts_typ) doDtlAct_slip_sts_typ_NX(info);
		else if (nx == columnDtlAct_slip_sts_typ_nm) doDtlAct_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtlAct_pay_act_dt) doDtlAct_pay_act_dt_NX(info);
		else if (nx == columnDtlAct_tax_cd) doDtlAct_tax_cd_NX(info);
		else if (nx == columnDtlAct_tax_nm) doDtlAct_tax_nm_NX(info);
		else if (nx == columnDtlAct_inc_tax_flg) doDtlAct_inc_tax_flg_NX(info);
		else if (nx == columnDtlAct_tax_rate) doDtlAct_tax_rate_NX(info);
		else if (nx == columnDtlAct_trd_cur_amt) doDtlAct_trd_cur_amt_NX(info);
		else if (nx == columnDtlAct_trd_cur_tax_amt) doDtlAct_trd_cur_tax_amt_NX(info);
		else if (nx == columnDtlAct_trd_cur_inc_tax_amt) doDtlAct_trd_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlAct_base_cur_amt) doDtlAct_base_cur_amt_NX(info);
		else if (nx == columnDtlAct_base_cur_tax_amt) doDtlAct_base_cur_tax_amt_NX(info);
		else if (nx == columnDtlAct_base_cur_inc_tax_amt) doDtlAct_base_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlAct_pay_ntc_d_print_rmrks) doDtlAct_pay_ntc_d_print_rmrks_NX(info);
		else if (nx == columnDtlAct_sub_char1) doDtlAct_sub_char1_NX(info);
		else if (nx == columnDtlAct_sub_char2) doDtlAct_sub_char2_NX(info);
		else if (nx == columnDtlAct_sub_char3) doDtlAct_sub_char3_NX(info);
		else if (nx == columnDtlAct_ins_usr_id) doDtlAct_ins_usr_id_NX(info);
		else if (nx == columnDtlAct_ins_usr_nm) doDtlAct_ins_usr_nm_NX(info);
		else if (nx == columnDtlAct_ins_func_id) doDtlAct_ins_func_id_NX(info);
		else if (nx == columnDtlAct_ins_func_nm) doDtlAct_ins_func_nm_NX(info);
		else if (nx == columnDtlAct_upd_usr_id) doDtlAct_upd_usr_id_NX(info);
		else if (nx == columnDtlAct_upd_usr_nm) doDtlAct_upd_usr_nm_NX(info);
		else if (nx == columnDtlAct_upd_func_id) doDtlAct_upd_func_id_NX(info);
		else if (nx == columnDtlAct_upd_func_nm) doDtlAct_upd_func_nm_NX(info);
		else if (nx == columnDtlAct_ins_ts) doDtlAct_ins_ts_NX(info);
		else if (nx == columnDtlAct_upd_ts) doDtlAct_upd_ts_NX(info);
		else if (nx == columnDtlAct_upd_srv_req_no) doDtlAct_upd_srv_req_no_NX(info);
		else if (nx == columnDtlAdvPayAct_adv_pay_act_no) doDtlAdvPayAct_adv_pay_act_no_NX(info);
		else if (nx == columnDtlAdvPayAct_adv_pay_act_seq) doDtlAdvPayAct_adv_pay_act_seq_NX(info);
		else if (nx == columnDtlAdvPayAct_ap_sttl_cd) doDtlAdvPayAct_ap_sttl_cd_NX(info);
		else if (nx == columnDtlAdvPayAct_ap_sttl_nm) doDtlAdvPayAct_ap_sttl_nm_NX(info);
		else if (nx == columnDtlAdvPayAct_slip_sts_typ) doDtlAdvPayAct_slip_sts_typ_NX(info);
		else if (nx == columnDtlAdvPayAct_slip_sts_typ_nm) doDtlAdvPayAct_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtlAdvPayAct_pay_act_dt) doDtlAdvPayAct_pay_act_dt_NX(info);
		else if (nx == columnDtlAdvPayAct_tax_cd) doDtlAdvPayAct_tax_cd_NX(info);
		else if (nx == columnDtlAdvPayAct_tax_nm) doDtlAdvPayAct_tax_nm_NX(info);
		else if (nx == columnDtlAdvPayAct_inc_tax_flg) doDtlAdvPayAct_inc_tax_flg_NX(info);
		else if (nx == columnDtlAdvPayAct_tax_rate) doDtlAdvPayAct_tax_rate_NX(info);
		else if (nx == columnDtlAdvPayAct_trd_cur_amt) doDtlAdvPayAct_trd_cur_amt_NX(info);
		else if (nx == columnDtlAdvPayAct_trd_cur_tax_amt) doDtlAdvPayAct_trd_cur_tax_amt_NX(info);
		else if (nx == columnDtlAdvPayAct_trd_cur_inc_tax_amt) doDtlAdvPayAct_trd_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlAdvPayAct_base_cur_amt) doDtlAdvPayAct_base_cur_amt_NX(info);
		else if (nx == columnDtlAdvPayAct_base_cur_tax_amt) doDtlAdvPayAct_base_cur_tax_amt_NX(info);
		else if (nx == columnDtlAdvPayAct_base_cur_inc_tax_amt) doDtlAdvPayAct_base_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtlAdvPayAct_sub_char1) doDtlAdvPayAct_sub_char1_NX(info);
		else if (nx == columnDtlAdvPayAct_sub_char2) doDtlAdvPayAct_sub_char2_NX(info);
		else if (nx == columnDtlAdvPayAct_sub_char3) doDtlAdvPayAct_sub_char3_NX(info);
		else if (nx == columnDtlAdvPayAct_ins_usr_id) doDtlAdvPayAct_ins_usr_id_NX(info);
		else if (nx == columnDtlAdvPayAct_ins_usr_nm) doDtlAdvPayAct_ins_usr_nm_NX(info);
		else if (nx == columnDtlAdvPayAct_ins_func_id) doDtlAdvPayAct_ins_func_id_NX(info);
		else if (nx == columnDtlAdvPayAct_ins_func_nm) doDtlAdvPayAct_ins_func_nm_NX(info);
		else if (nx == columnDtlAdvPayAct_upd_usr_id) doDtlAdvPayAct_upd_usr_id_NX(info);
		else if (nx == columnDtlAdvPayAct_upd_usr_nm) doDtlAdvPayAct_upd_usr_nm_NX(info);
		else if (nx == columnDtlAdvPayAct_upd_func_id) doDtlAdvPayAct_upd_func_id_NX(info);
		else if (nx == columnDtlAdvPayAct_upd_func_nm) doDtlAdvPayAct_upd_func_nm_NX(info);
		else if (nx == columnDtlAdvPayAct_ins_ts) doDtlAdvPayAct_ins_ts_NX(info);
		else if (nx == columnDtlAdvPayAct_upd_ts) doDtlAdvPayAct_upd_ts_NX(info);
		else if (nx == columnDtlAdvPayAct_upd_srv_req_no) doDtlAdvPayAct_upd_srv_req_no_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_ntc_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_ntc_rev_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_rev_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[bsppl_cl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_cl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[reg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_reg_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[pay_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_xrate_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[last_pay_schd_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_pay_schd_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_amt_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ret_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ret_amt_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[schd_pay_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_schd_pay_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_bal]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_bal_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_setoff_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_setoff_tax_amt_NX(MCEventInfo info){
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
	 * [DtlApd]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_purc_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_purc_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_ntc_d_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_ntc_d_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ap_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ap_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_bp_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_bp_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_ntc_d_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_ntc_d_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_adv_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_adv_pay_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[pay_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_pay_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_pay_chk_no) doCnd_pay_chk_no_LC(info);
		else if (lc == Cnd_pay_ntc_rev) doCnd_pay_ntc_rev_LC(info);
		else if (lc == Hdr_pay_chk_no) doHdr_pay_chk_no_LC(info);
		else if (lc == Hdr_pay_ntc_rev) doHdr_pay_ntc_rev_LC(info);
		else if (lc == Hdr_bsppl_cl_dt) doHdr_bsppl_cl_dt_LC(info);
		else if (lc == Hdr_reg_dt) doHdr_reg_dt_LC(info);
		else if (lc == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_LC(info);
		else if (lc == Hdr_bsppl_cd) doHdr_bsppl_cd_LC(info);
		else if (lc == Hdr_bsppl_nm) doHdr_bsppl_nm_LC(info);
		else if (lc == Hdr_bsppl_dpt_cd) doHdr_bsppl_dpt_cd_LC(info);
		else if (lc == Hdr_bsppl_dpt_nm) doHdr_bsppl_dpt_nm_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_pay_xrate) doHdr_pay_xrate_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_last_pay_schd_amt) doHdr_last_pay_schd_amt_LC(info);
		else if (lc == Hdr_pay_amt) doHdr_pay_amt_LC(info);
		else if (lc == Hdr_sw_amt) doHdr_sw_amt_LC(info);
		else if (lc == Hdr_bfw_amt) doHdr_bfw_amt_LC(info);
		else if (lc == Hdr_purc_amt) doHdr_purc_amt_LC(info);
		else if (lc == Hdr_purc_dscnt_amt) doHdr_purc_dscnt_amt_LC(info);
		else if (lc == Hdr_purc_ret_amt) doHdr_purc_ret_amt_LC(info);
		else if (lc == Hdr_setoff_amt) doHdr_setoff_amt_LC(info);
		else if (lc == Hdr_tax_amt) doHdr_tax_amt_LC(info);
		else if (lc == Hdr_sw_to_amt) doHdr_sw_to_amt_LC(info);
		else if (lc == Hdr_schd_pay_amt) doHdr_schd_pay_amt_LC(info);
		else if (lc == Hdr_adv_pay_bal) doHdr_adv_pay_bal_LC(info);
		else if (lc == Hdr_adv_pay_amt) doHdr_adv_pay_amt_LC(info);
		else if (lc == Hdr_adv_pay_setoff_amt) doHdr_adv_pay_setoff_amt_LC(info);
		else if (lc == Hdr_adv_pay_setoff_tax_amt) doHdr_adv_pay_setoff_tax_amt_LC(info);
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
		else if (lc == columnDtlApd_trd_cd) doDtlApd_trd_cd_LC(info);
		else if (lc == columnDtlApd_trd_nm) doDtlApd_trd_nm_LC(info);
		else if (lc == columnDtlApd_slip_sts_typ) doDtlApd_slip_sts_typ_LC(info);
		else if (lc == columnDtlApd_slip_sts_typ_nm) doDtlApd_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtlApd_act_dt) doDtlApd_act_dt_LC(info);
		else if (lc == columnDtlApd_sppl_itm_cd) doDtlApd_sppl_itm_cd_LC(info);
		else if (lc == columnDtlApd_sppl_itm_nm) doDtlApd_sppl_itm_nm_LC(info);
		else if (lc == columnDtlApd_trd_unit_cd) doDtlApd_trd_unit_cd_LC(info);
		else if (lc == columnDtlApd_trd_unit_nm) doDtlApd_trd_unit_nm_LC(info);
		else if (lc == columnDtlApd_trd_unit_qty) doDtlApd_trd_unit_qty_LC(info);
		else if (lc == columnDtlApd_tax_cd) doDtlApd_tax_cd_LC(info);
		else if (lc == columnDtlApd_tax_nm) doDtlApd_tax_nm_LC(info);
		else if (lc == columnDtlApd_tax_rate) doDtlApd_tax_rate_LC(info);
		else if (lc == columnDtlApd_trd_cur_upri) doDtlApd_trd_cur_upri_LC(info);
		else if (lc == columnDtlApd_trd_cur_amt) doDtlApd_trd_cur_amt_LC(info);
		else if (lc == columnDtlApd_trd_cur_tax_amt) doDtlApd_trd_cur_tax_amt_LC(info);
		else if (lc == columnDtlApd_trd_cur_inc_tax_amt) doDtlApd_trd_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlApd_trd_cur_dscnt_amt) doDtlApd_trd_cur_dscnt_amt_LC(info);
		else if (lc == columnDtlApd_base_cur_upri) doDtlApd_base_cur_upri_LC(info);
		else if (lc == columnDtlApd_base_cur_amt) doDtlApd_base_cur_amt_LC(info);
		else if (lc == columnDtlApd_base_cur_tax_amt) doDtlApd_base_cur_tax_amt_LC(info);
		else if (lc == columnDtlApd_base_cur_inc_tax_amt) doDtlApd_base_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlApd_base_cur_dscnt_amt) doDtlApd_base_cur_dscnt_amt_LC(info);
		else if (lc == columnDtlApd_sppl_cd) doDtlApd_sppl_cd_LC(info);
		else if (lc == columnDtlApd_sppl_nm) doDtlApd_sppl_nm_LC(info);
		else if (lc == columnDtlApd_asppl_cd) doDtlApd_asppl_cd_LC(info);
		else if (lc == columnDtlApd_asppl_nm) doDtlApd_asppl_nm_LC(info);
		else if (lc == columnDtlApd_pay_mtd_typ) doDtlApd_pay_mtd_typ_LC(info);
		else if (lc == columnDtlApd_pay_mtd_typ_nm) doDtlApd_pay_mtd_typ_nm_LC(info);
		else if (lc == columnDtlApd_base_purc_ac_dt) doDtlApd_base_purc_ac_dt_LC(info);
		else if (lc == columnDtlApd_pay_ntc_d_print_rmrks) doDtlApd_pay_ntc_d_print_rmrks_LC(info);
		else if (lc == columnDtlApd_ap_d_no) doDtlApd_ap_d_no_LC(info);
		else if (lc == columnDtlApd_po_no) doDtlApd_po_no_LC(info);
		else if (lc == columnDtlApd_po_d_no) doDtlApd_po_d_no_LC(info);
		else if (lc == columnDtlApd_purc_act_no) doDtlApd_purc_act_no_LC(info);
		else if (lc == columnDtlApd_purc_act_rev) doDtlApd_purc_act_rev_LC(info);
		else if (lc == columnDtlApd_purc_act_d_no) doDtlApd_purc_act_d_no_LC(info);
		else if (lc == columnDtlApd_bp_dlv_slip_no) doDtlApd_bp_dlv_slip_no_LC(info);
		else if (lc == columnDtlApd_bp_dlv_slip_d_no) doDtlApd_bp_dlv_slip_d_no_LC(info);
		else if (lc == columnDtlApd_sub_char1) doDtlApd_sub_char1_LC(info);
		else if (lc == columnDtlApd_sub_char2) doDtlApd_sub_char2_LC(info);
		else if (lc == columnDtlApd_sub_char3) doDtlApd_sub_char3_LC(info);
		else if (lc == columnDtlApd_ins_usr_id) doDtlApd_ins_usr_id_LC(info);
		else if (lc == columnDtlApd_ins_usr_nm) doDtlApd_ins_usr_nm_LC(info);
		else if (lc == columnDtlApd_ins_func_id) doDtlApd_ins_func_id_LC(info);
		else if (lc == columnDtlApd_ins_func_nm) doDtlApd_ins_func_nm_LC(info);
		else if (lc == columnDtlApd_upd_usr_id) doDtlApd_upd_usr_id_LC(info);
		else if (lc == columnDtlApd_upd_usr_nm) doDtlApd_upd_usr_nm_LC(info);
		else if (lc == columnDtlApd_upd_func_id) doDtlApd_upd_func_id_LC(info);
		else if (lc == columnDtlApd_upd_func_nm) doDtlApd_upd_func_nm_LC(info);
		else if (lc == columnDtlApd_ins_ts) doDtlApd_ins_ts_LC(info);
		else if (lc == columnDtlApd_upd_ts) doDtlApd_upd_ts_LC(info);
		else if (lc == columnDtlApd_upd_srv_req_no) doDtlApd_upd_srv_req_no_LC(info);
		else if (lc == columnDtlAct_pay_act_no) doDtlAct_pay_act_no_LC(info);
		else if (lc == columnDtlAct_pay_act_seq) doDtlAct_pay_act_seq_LC(info);
		else if (lc == columnDtlAct_pay_act_d_no) doDtlAct_pay_act_d_no_LC(info);
		else if (lc == columnDtlAct_pay_act_d_seq) doDtlAct_pay_act_d_seq_LC(info);
		else if (lc == columnDtlAct_ap_sttl_cd) doDtlAct_ap_sttl_cd_LC(info);
		else if (lc == columnDtlAct_ap_sttl_nm) doDtlAct_ap_sttl_nm_LC(info);
		else if (lc == columnDtlAct_slip_sts_typ) doDtlAct_slip_sts_typ_LC(info);
		else if (lc == columnDtlAct_slip_sts_typ_nm) doDtlAct_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtlAct_pay_act_dt) doDtlAct_pay_act_dt_LC(info);
		else if (lc == columnDtlAct_tax_cd) doDtlAct_tax_cd_LC(info);
		else if (lc == columnDtlAct_tax_nm) doDtlAct_tax_nm_LC(info);
		else if (lc == columnDtlAct_tax_rate) doDtlAct_tax_rate_LC(info);
		else if (lc == columnDtlAct_trd_cur_amt) doDtlAct_trd_cur_amt_LC(info);
		else if (lc == columnDtlAct_trd_cur_tax_amt) doDtlAct_trd_cur_tax_amt_LC(info);
		else if (lc == columnDtlAct_trd_cur_inc_tax_amt) doDtlAct_trd_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlAct_base_cur_amt) doDtlAct_base_cur_amt_LC(info);
		else if (lc == columnDtlAct_base_cur_tax_amt) doDtlAct_base_cur_tax_amt_LC(info);
		else if (lc == columnDtlAct_base_cur_inc_tax_amt) doDtlAct_base_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlAct_pay_ntc_d_print_rmrks) doDtlAct_pay_ntc_d_print_rmrks_LC(info);
		else if (lc == columnDtlAct_sub_char1) doDtlAct_sub_char1_LC(info);
		else if (lc == columnDtlAct_sub_char2) doDtlAct_sub_char2_LC(info);
		else if (lc == columnDtlAct_sub_char3) doDtlAct_sub_char3_LC(info);
		else if (lc == columnDtlAct_ins_usr_id) doDtlAct_ins_usr_id_LC(info);
		else if (lc == columnDtlAct_ins_usr_nm) doDtlAct_ins_usr_nm_LC(info);
		else if (lc == columnDtlAct_ins_func_id) doDtlAct_ins_func_id_LC(info);
		else if (lc == columnDtlAct_ins_func_nm) doDtlAct_ins_func_nm_LC(info);
		else if (lc == columnDtlAct_upd_usr_id) doDtlAct_upd_usr_id_LC(info);
		else if (lc == columnDtlAct_upd_usr_nm) doDtlAct_upd_usr_nm_LC(info);
		else if (lc == columnDtlAct_upd_func_id) doDtlAct_upd_func_id_LC(info);
		else if (lc == columnDtlAct_upd_func_nm) doDtlAct_upd_func_nm_LC(info);
		else if (lc == columnDtlAct_ins_ts) doDtlAct_ins_ts_LC(info);
		else if (lc == columnDtlAct_upd_ts) doDtlAct_upd_ts_LC(info);
		else if (lc == columnDtlAct_upd_srv_req_no) doDtlAct_upd_srv_req_no_LC(info);
		else if (lc == columnDtlAdvPayAct_adv_pay_act_no) doDtlAdvPayAct_adv_pay_act_no_LC(info);
		else if (lc == columnDtlAdvPayAct_adv_pay_act_seq) doDtlAdvPayAct_adv_pay_act_seq_LC(info);
		else if (lc == columnDtlAdvPayAct_ap_sttl_cd) doDtlAdvPayAct_ap_sttl_cd_LC(info);
		else if (lc == columnDtlAdvPayAct_ap_sttl_nm) doDtlAdvPayAct_ap_sttl_nm_LC(info);
		else if (lc == columnDtlAdvPayAct_slip_sts_typ) doDtlAdvPayAct_slip_sts_typ_LC(info);
		else if (lc == columnDtlAdvPayAct_slip_sts_typ_nm) doDtlAdvPayAct_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtlAdvPayAct_pay_act_dt) doDtlAdvPayAct_pay_act_dt_LC(info);
		else if (lc == columnDtlAdvPayAct_tax_cd) doDtlAdvPayAct_tax_cd_LC(info);
		else if (lc == columnDtlAdvPayAct_tax_nm) doDtlAdvPayAct_tax_nm_LC(info);
		else if (lc == columnDtlAdvPayAct_tax_rate) doDtlAdvPayAct_tax_rate_LC(info);
		else if (lc == columnDtlAdvPayAct_trd_cur_amt) doDtlAdvPayAct_trd_cur_amt_LC(info);
		else if (lc == columnDtlAdvPayAct_trd_cur_tax_amt) doDtlAdvPayAct_trd_cur_tax_amt_LC(info);
		else if (lc == columnDtlAdvPayAct_trd_cur_inc_tax_amt) doDtlAdvPayAct_trd_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlAdvPayAct_base_cur_amt) doDtlAdvPayAct_base_cur_amt_LC(info);
		else if (lc == columnDtlAdvPayAct_base_cur_tax_amt) doDtlAdvPayAct_base_cur_tax_amt_LC(info);
		else if (lc == columnDtlAdvPayAct_base_cur_inc_tax_amt) doDtlAdvPayAct_base_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtlAdvPayAct_sub_char1) doDtlAdvPayAct_sub_char1_LC(info);
		else if (lc == columnDtlAdvPayAct_sub_char2) doDtlAdvPayAct_sub_char2_LC(info);
		else if (lc == columnDtlAdvPayAct_sub_char3) doDtlAdvPayAct_sub_char3_LC(info);
		else if (lc == columnDtlAdvPayAct_ins_usr_id) doDtlAdvPayAct_ins_usr_id_LC(info);
		else if (lc == columnDtlAdvPayAct_ins_usr_nm) doDtlAdvPayAct_ins_usr_nm_LC(info);
		else if (lc == columnDtlAdvPayAct_ins_func_id) doDtlAdvPayAct_ins_func_id_LC(info);
		else if (lc == columnDtlAdvPayAct_ins_func_nm) doDtlAdvPayAct_ins_func_nm_LC(info);
		else if (lc == columnDtlAdvPayAct_upd_usr_id) doDtlAdvPayAct_upd_usr_id_LC(info);
		else if (lc == columnDtlAdvPayAct_upd_usr_nm) doDtlAdvPayAct_upd_usr_nm_LC(info);
		else if (lc == columnDtlAdvPayAct_upd_func_id) doDtlAdvPayAct_upd_func_id_LC(info);
		else if (lc == columnDtlAdvPayAct_upd_func_nm) doDtlAdvPayAct_upd_func_nm_LC(info);
		else if (lc == columnDtlAdvPayAct_ins_ts) doDtlAdvPayAct_ins_ts_LC(info);
		else if (lc == columnDtlAdvPayAct_upd_ts) doDtlAdvPayAct_upd_ts_LC(info);
		else if (lc == columnDtlAdvPayAct_upd_srv_req_no) doDtlAdvPayAct_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_ntc_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_ntc_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_cl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_cl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[reg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_reg_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[pay_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_xrate_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[last_pay_schd_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_pay_schd_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_amt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ret_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ret_amt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[schd_pay_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_schd_pay_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_bal]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_bal_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_setoff_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[adv_pay_setoff_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_adv_pay_setoff_tax_amt_LC(MCEventInfo info){
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
	 * [DtlApd]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[trd_cur_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_trd_cur_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_cur_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_cur_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[base_purc_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_base_purc_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[pay_ntc_d_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_pay_ntc_d_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ap_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ap_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_bp_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[bp_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_bp_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlApd]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlApd_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[trd_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_trd_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[base_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_base_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[pay_ntc_d_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_pay_ntc_d_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlAct]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAct_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_adv_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[adv_pay_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_adv_pay_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[pay_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_pay_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[trd_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_trd_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[base_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_base_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlAdvPayAct]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlAdvPayAct_upd_srv_req_no_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0190.Srch01")) {
			return new MS_MSBHL0190_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0190_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0190_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0190_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0190_Srch01Bridge() {
			p_MS_MSBHL0190_Srch01 = new MCParam(PDef.MS_MSBHL0190_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0190_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0190.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBH.MSBHP0190.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0190.DtlApdR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0190.DtlActR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.class));

			p_MS_MSBHL0190_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0190_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0190_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0190_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0190_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0190.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0190.CndR)up(0);
		}

		protected mcframe.clientMSBH.MSBHP0190.HdrR down0() {
			return (mcframe.clientMSBH.MSBHP0190.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0190.DtlApdR> down1() {
			return (MCList<mcframe.clientMSBH.MSBHP0190.DtlApdR>)down(1);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0190.DtlActR> down2() {
			return (MCList<mcframe.clientMSBH.MSBHP0190.DtlActR>)down(2);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR> down3() {
			return (MCList<mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR>)down(3);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0190_Srch01.addDownBlock(mcframe.clientMSBH.MSBHP0190.HdrR.create());
			p_MS_MSBHL0190_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0190.DtlApdR.class));
			p_MS_MSBHL0190_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0190.DtlActR.class));
			p_MS_MSBHL0190_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0190_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBH.MSBHP0190.HdrR)p_MS_MSBHL0190_Srch01.getContainerParam().getDownBlock(0));
			setDtlApdL((MCList<mcframe.clientMSBH.MSBHP0190.DtlApdR>)p_MS_MSBHL0190_Srch01.getContainerParam().getDownBlock(1));
			setDtlActL((MCList<mcframe.clientMSBH.MSBHP0190.DtlActR>)p_MS_MSBHL0190_Srch01.getContainerParam().getDownBlock(2));
			setDtlAdvPayActL((MCList<mcframe.clientMSBH.MSBHP0190.DtlAdvPayActR>)p_MS_MSBHL0190_Srch01.getContainerParam().getDownBlock(3));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlApdL().clear();
			getDtlActL().clear();
			getDtlAdvPayActL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlApdL());
			result.add(getDtlActL());
			result.add(getDtlAdvPayActL());
			return result;
		}
	}
}