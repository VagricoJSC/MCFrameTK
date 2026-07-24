package mcframe.clientMSBH.MSBHP0180;

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
import mcframe.clientMSBH.MSBHP0180.MSBHP_BillRcptDSrch_MC.MS_MSBHL0180_Srch01Caller;

/**
 * 画面"MSBHP_BillRcptDSrch"パネルクラスです。<p>
 *
 * 請求受領明細を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_BillRcptDSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBHP0180";

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
	public MCLabel Cnd_bill_rcpt_no_Label = null;
	/**
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_rcpt_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr1]ブロック関連のField定義
	public MCPanel Hdr1Panel = null;
	// [Hdr1]ブロックの項目のField定義
	public MCLabel Hdr1_bill_cl_dt_Label = null;
	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCDateField Hdr1_bill_cl_dt = null;
	public MCLabel Hdr1_bill_dt_Label = null;
	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public MCDateField Hdr1_bill_dt = null;
	public MCLabel Hdr1_bill_no_Label = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_bill_no = null;
	/**
	 * Invalid flg. 無効ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Hdr1_invalid_flg = null;
	public MCLabel Hdr1_pre_bill_no_Label = null;
	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_pre_bill_no = null;
	public MCLabel Hdr1_pre_bill_dt_Label = null;
	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public MCDateField Hdr1_pre_bill_dt = null;
	public MCLabel Hdr1_bill_st_dt_Label = null;
	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public MCDateField Hdr1_bill_st_dt = null;
	public MCLabel Hdr1_bill_end_dt_Label = null;
	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public MCDateField Hdr1_bill_end_dt = null;
	public MCLabel Hdr1_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_iv_no = null;
	public MCLabel Hdr1_wrk_no_Label = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_wrk_no = null;
	public MCLabel Hdr1_wrk_nm_Label = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCTextField Hdr1_wrk_nm = null;
	public MCLabel Hdr1_bill_src_cd_Label = null;
	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_bill_src_cd = null;
	/**
	 * Billing source name 請求元名.<p>
	 *
	 */
	public MCTextField Hdr1_bill_src_nm = null;
	public MCLabel Hdr1_bill_src_dpt_Label = null;
	/**
	 * Billing source dept. 請求元部門.<p>
	 *
	 */
	public MCTextField Hdr1_bill_src_dpt = null;
	public MCLabel Hdr1_trd_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Hdr1_trd_cur_nm = null;
	public MCLabel Hdr1_base_cur_cd_Label = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCTextField Hdr1_base_cur_nm = null;
	public MCLabel Hdr1_bill_xrate_Label = null;
	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCNumberField Hdr1_bill_xrate = null;
	public MCLabel Hdr1_last_bill_amt_Label = null;
	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public MCNumberField Hdr1_last_bill_amt = null;
	public MCLabel Hdr1_rcv_amt_Label = null;
	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public MCNumberField Hdr1_rcv_amt = null;
	public MCLabel Hdr1_sw_amt_Label = null;
	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCNumberField Hdr1_sw_amt = null;
	public MCLabel Hdr1_bfw_amt_Label = null;
	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public MCNumberField Hdr1_bfw_amt = null;
	public MCLabel Hdr1_sls_amt_Label = null;
	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public MCNumberField Hdr1_sls_amt = null;
	public MCLabel Hdr1_dscnt_amt_Label = null;
	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumberField Hdr1_dscnt_amt = null;
	public MCLabel Hdr1_ret_amt_Label = null;
	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumberField Hdr1_ret_amt = null;
	public MCLabel Hdr1_setoff_amt_Label = null;
	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public MCNumberField Hdr1_setoff_amt = null;
	public MCLabel Hdr1_tax_amt_Label = null;
	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumberField Hdr1_tax_amt = null;
	public MCLabel Hdr1_sw_to_amt_Label = null;
	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumberField Hdr1_sw_to_amt = null;
	public MCLabel Hdr1_bill_amt_Label = null;
	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public MCNumberField Hdr1_bill_amt = null;
	public MCLabel Hdr1_adv_amt_bal_Label = null;
	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public MCNumberField Hdr1_adv_amt_bal = null;
	public MCLabel Hdr1_adv_amt_Label = null;
	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCNumberField Hdr1_adv_amt = null;
	public MCLabel Hdr1_adv_setoff_amt_Label = null;
	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public MCNumberField Hdr1_adv_setoff_amt = null;
	public MCLabel Hdr1_adv_setoff_tax_amt_Label = null;
	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public MCNumberField Hdr1_adv_setoff_tax_amt = null;
	public MCLabel Hdr1_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr1_ins_usr_nm = null;
	public MCLabel Hdr1_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr1_ins_func_nm = null;
	public MCLabel Hdr1_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr1_upd_usr_nm = null;
	public MCLabel Hdr1_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr1_upd_func_nm = null;
	public MCLabel Hdr1_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr1_ins_ts = null;
	public MCLabel Hdr1_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr1_upd_ts = null;
	public MCLabel Hdr1_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr1_upd_cntr = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0180.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Billing receipt details No. 請求受領明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_rcpt_d_no = null;
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
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_dt = null;
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_dt = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_dt = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_basis_dt = null;
	/**
	 * Recording date (Base) 計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_ac_dt = null;
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_d_no = null;
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
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_dlv_slip_no = null;
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_dlv_slip_d_no = null;
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_no = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_rev = null;
	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_d_no = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_qty = null;
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_upri = null;
	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_interim_flg = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_amt = null;
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_inc_tax_amt = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tax_nm = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tax_rate = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_tax_amt = null;
	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inc_tax_flg = null;
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_dscnt_amt = null;
	/**
	 * Details remarks 明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MS_MSBHL0180_Srch01]のCallerの作成 */
	protected MSBHP_BillRcptDSrch_MC.MS_MSBHL0180_Srch01Caller createMS_MSBHL0180_Srch01() {
		MSBHP_BillRcptDSrch_MC.MS_MSBHL0180_Srch01Caller<MSBHP_BillRcptDSrch, MS_MSBHL0180_Srch01Bridge>
		caller = ((MSBHP_BillRcptDSrch_MC)this).new MS_MSBHL0180_Srch01Caller<MSBHP_BillRcptDSrch, MS_MSBHL0180_Srch01Bridge>(
					(MSBHP_BillRcptDSrch)this, new MS_MSBHL0180_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0180_Srch01]の呼び出し */
	protected void callMS_MSBHL0180_Srch01() {
		MCCaller caller = createMS_MSBHL0180_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0180.CndR aCndR;
	/** [Hdr1]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0180.Hdr1R aHdr1R;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0180.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0180.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0180.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0180.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0180.CndR.create();
	}

	/**
	 * 項目コピーによってaHdr1Rを設定します。
	 *
	 * aHdr1Rのインスタンスは変更されません。
	 *
	 * @param row Hdr1R
	 */
	public void setHdr1R(mcframe.clientMSBH.MSBHP0180.Hdr1R row) {
		if (row != null) {
			MCRow.copyall(getHdr1R(), row);
		}
	}

	/**
	 * [Hdr1]ブロックのコンテナaHdr1Rを返します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBH.MSBHP0180.Hdr1R getHdr1R() {
		return aHdr1R;
	}

	/**
	 * aHdr1Rを作成します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBH.MSBHP0180.Hdr1R createHdr1R() {
		return mcframe.clientMSBH.MSBHP0180.Hdr1R.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBH.MSBHP0180.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0180.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBH.MSBHP0180.DtlR createDtlR() {
		return mcframe.clientMSBH.MSBHP0180.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0180.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0180.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getHdr1R())) ret.add(getHdr1R());
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
		if(aCnt == getHdr1R()) return "Hdr1";
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
		if(bId.equals("Hdr1")) return getHdr1R();
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
		ret.add(CndPanel);
		ret.add(HdrTabPanel);
		ret.add(Hdr1Panel);
		ret.add(Hdr2Panel);
		ret.add(DtlPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_BillRcptDSrch_MC_A() {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_BillRcptDSrch_MC_A(String name) {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBHP_BillRcptDSrch_MC.jbCreateCnd((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbCreateHdrTab((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbCreateHdr1((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbCreateHdr2((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbCreateDtl((MSBHP_BillRcptDSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_BillRcptDSrch p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBHP_BillRcptDSrch p) {
	}

	/**
	 * [Hdr1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr1(MSBHP_BillRcptDSrch p) {
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBHP_BillRcptDSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBHP_BillRcptDSrch p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBH.MSBHP0180.DtlR.$itm_p);
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
		p.Dtl_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBH.MSBHP0180.DtlR.$sno_p);
		p.Dtl_sno_p_PPanel.setName("Dtl.sno_p");
		p.columnDtl_sno1 = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
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
	public static MSBHP_BillRcptDSrch create(){
		MSBHP_BillRcptDSrch p = new MSBHP_BillRcptDSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_BillRcptDSrch create(String name){
		MSBHP_BillRcptDSrch p = new MSBHP_BillRcptDSrch(name);
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
		MSBHP_BillRcptDSrch_MC.jbfInitCnd((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbfInitHdrTab((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbfInitHdr1((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbfInitHdr2((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbfInitDtl((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbInitCnd((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbInitHdrTab((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbInitHdr1((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbInitHdr2((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.jbInitDtl((MSBHP_BillRcptDSrch)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_bill_rcpt_no_Label = p.beansFactory.createLabel("Cnd.bill_rcpt_no_Label");
		p.Cnd_bill_rcpt_no = p.beansFactory.createTextField("Cnd.bill_rcpt_no");
		p.Cnd_bill_rcpt_no.setLabel(p.Cnd_bill_rcpt_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr1(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.Hdr1Panel = p.beansFactory.createPanel("Hdr1");
		// ブロックの項目の初期化
		p.Hdr1_bill_cl_dt_Label = p.beansFactory.createLabel("Hdr1.bill_cl_dt_Label");
		p.Hdr1_bill_cl_dt = p.beansFactory.createDateField("Hdr1.bill_cl_dt");
		p.Hdr1_bill_cl_dt.setLabel(p.Hdr1_bill_cl_dt_Label);
		p.Hdr1_bill_dt_Label = p.beansFactory.createLabel("Hdr1.bill_dt_Label");
		p.Hdr1_bill_dt = p.beansFactory.createDateField("Hdr1.bill_dt");
		p.Hdr1_bill_dt.setLabel(p.Hdr1_bill_dt_Label);
		p.Hdr1_bill_no_Label = p.beansFactory.createLabel("Hdr1.bill_no_Label");
		p.Hdr1_bill_no = p.beansFactory.createTextField("Hdr1.bill_no");
		p.Hdr1_bill_no.setLabel(p.Hdr1_bill_no_Label);
		p.Hdr1_invalid_flg = p.beansFactory.createCheckBox("Hdr1.invalid_flg");
		p.Hdr1_pre_bill_no_Label = p.beansFactory.createLabel("Hdr1.pre_bill_no_Label");
		p.Hdr1_pre_bill_no = p.beansFactory.createTextField("Hdr1.pre_bill_no");
		p.Hdr1_pre_bill_no.setLabel(p.Hdr1_pre_bill_no_Label);
		p.Hdr1_pre_bill_dt_Label = p.beansFactory.createLabel("Hdr1.pre_bill_dt_Label");
		p.Hdr1_pre_bill_dt = p.beansFactory.createDateField("Hdr1.pre_bill_dt");
		p.Hdr1_pre_bill_dt.setLabel(p.Hdr1_pre_bill_dt_Label);
		p.Hdr1_bill_st_dt_Label = p.beansFactory.createLabel("Hdr1.bill_st_dt_Label");
		p.Hdr1_bill_st_dt = p.beansFactory.createDateField("Hdr1.bill_st_dt");
		p.Hdr1_bill_st_dt.setLabel(p.Hdr1_bill_st_dt_Label);
		p.Hdr1_bill_end_dt_Label = p.beansFactory.createLabel("Hdr1.bill_end_dt_Label");
		p.Hdr1_bill_end_dt = p.beansFactory.createDateField("Hdr1.bill_end_dt");
		p.Hdr1_bill_end_dt.setLabel(p.Hdr1_bill_end_dt_Label);
		p.Hdr1_iv_no_Label = p.beansFactory.createLabel("Hdr1.iv_no_Label");
		p.Hdr1_iv_no = p.beansFactory.createTextField("Hdr1.iv_no");
		p.Hdr1_iv_no.setLabel(p.Hdr1_iv_no_Label);
		p.Hdr1_wrk_no_Label = p.beansFactory.createLabel("Hdr1.wrk_no_Label");
		p.Hdr1_wrk_no = p.beansFactory.createTextField("Hdr1.wrk_no");
		p.Hdr1_wrk_no.setLabel(p.Hdr1_wrk_no_Label);
		p.Hdr1_wrk_nm_Label = p.beansFactory.createLabel("Hdr1.wrk_nm_Label");
		p.Hdr1_wrk_nm = p.beansFactory.createTextField("Hdr1.wrk_nm");
		p.Hdr1_wrk_nm.setLabel(p.Hdr1_wrk_nm_Label);
		p.Hdr1_bill_src_cd_Label = p.beansFactory.createLabel("Hdr1.bill_src_cd_Label");
		p.Hdr1_bill_src_cd = p.beansFactory.createTextField("Hdr1.bill_src_cd");
		p.Hdr1_bill_src_cd.setLabel(p.Hdr1_bill_src_cd_Label);
		p.Hdr1_bill_src_nm = p.beansFactory.createTextField("Hdr1.bill_src_nm");
		p.Hdr1_bill_src_dpt_Label = p.beansFactory.createLabel("Hdr1.bill_src_dpt_Label");
		p.Hdr1_bill_src_dpt = p.beansFactory.createTextField("Hdr1.bill_src_dpt");
		p.Hdr1_bill_src_dpt.setLabel(p.Hdr1_bill_src_dpt_Label);
		p.Hdr1_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr1.trd_cur_cd_Label");
		p.Hdr1_trd_cur_cd = p.beansFactory.createTextField("Hdr1.trd_cur_cd");
		p.Hdr1_trd_cur_cd.setLabel(p.Hdr1_trd_cur_cd_Label);
		p.Hdr1_trd_cur_nm = p.beansFactory.createTextField("Hdr1.trd_cur_nm");
		p.Hdr1_base_cur_cd_Label = p.beansFactory.createLabel("Hdr1.base_cur_cd_Label");
		p.Hdr1_base_cur_cd = p.beansFactory.createTextField("Hdr1.base_cur_cd");
		p.Hdr1_base_cur_cd.setLabel(p.Hdr1_base_cur_cd_Label);
		p.Hdr1_base_cur_nm = p.beansFactory.createTextField("Hdr1.base_cur_nm");
		p.Hdr1_bill_xrate_Label = p.beansFactory.createLabel("Hdr1.bill_xrate_Label");
		p.Hdr1_bill_xrate = p.beansFactory.createNumberField("Hdr1.bill_xrate");
		p.Hdr1_bill_xrate.setLabel(p.Hdr1_bill_xrate_Label);
		p.Hdr1_last_bill_amt_Label = p.beansFactory.createLabel("Hdr1.last_bill_amt_Label");
		p.Hdr1_last_bill_amt = p.beansFactory.createNumberField("Hdr1.last_bill_amt");
		p.Hdr1_last_bill_amt.setLabel(p.Hdr1_last_bill_amt_Label);
		p.Hdr1_rcv_amt_Label = p.beansFactory.createLabel("Hdr1.rcv_amt_Label");
		p.Hdr1_rcv_amt = p.beansFactory.createNumberField("Hdr1.rcv_amt");
		p.Hdr1_rcv_amt.setLabel(p.Hdr1_rcv_amt_Label);
		p.Hdr1_sw_amt_Label = p.beansFactory.createLabel("Hdr1.sw_amt_Label");
		p.Hdr1_sw_amt = p.beansFactory.createNumberField("Hdr1.sw_amt");
		p.Hdr1_sw_amt.setLabel(p.Hdr1_sw_amt_Label);
		p.Hdr1_bfw_amt_Label = p.beansFactory.createLabel("Hdr1.bfw_amt_Label");
		p.Hdr1_bfw_amt = p.beansFactory.createNumberField("Hdr1.bfw_amt");
		p.Hdr1_bfw_amt.setLabel(p.Hdr1_bfw_amt_Label);
		p.Hdr1_sls_amt_Label = p.beansFactory.createLabel("Hdr1.sls_amt_Label");
		p.Hdr1_sls_amt = p.beansFactory.createNumberField("Hdr1.sls_amt");
		p.Hdr1_sls_amt.setLabel(p.Hdr1_sls_amt_Label);
		p.Hdr1_dscnt_amt_Label = p.beansFactory.createLabel("Hdr1.dscnt_amt_Label");
		p.Hdr1_dscnt_amt = p.beansFactory.createNumberField("Hdr1.dscnt_amt");
		p.Hdr1_dscnt_amt.setLabel(p.Hdr1_dscnt_amt_Label);
		p.Hdr1_ret_amt_Label = p.beansFactory.createLabel("Hdr1.ret_amt_Label");
		p.Hdr1_ret_amt = p.beansFactory.createNumberField("Hdr1.ret_amt");
		p.Hdr1_ret_amt.setLabel(p.Hdr1_ret_amt_Label);
		p.Hdr1_setoff_amt_Label = p.beansFactory.createLabel("Hdr1.setoff_amt_Label");
		p.Hdr1_setoff_amt = p.beansFactory.createNumberField("Hdr1.setoff_amt");
		p.Hdr1_setoff_amt.setLabel(p.Hdr1_setoff_amt_Label);
		p.Hdr1_tax_amt_Label = p.beansFactory.createLabel("Hdr1.tax_amt_Label");
		p.Hdr1_tax_amt = p.beansFactory.createNumberField("Hdr1.tax_amt");
		p.Hdr1_tax_amt.setLabel(p.Hdr1_tax_amt_Label);
		p.Hdr1_sw_to_amt_Label = p.beansFactory.createLabel("Hdr1.sw_to_amt_Label");
		p.Hdr1_sw_to_amt = p.beansFactory.createNumberField("Hdr1.sw_to_amt");
		p.Hdr1_sw_to_amt.setLabel(p.Hdr1_sw_to_amt_Label);
		p.Hdr1_bill_amt_Label = p.beansFactory.createLabel("Hdr1.bill_amt_Label");
		p.Hdr1_bill_amt = p.beansFactory.createNumberField("Hdr1.bill_amt");
		p.Hdr1_bill_amt.setLabel(p.Hdr1_bill_amt_Label);
		p.Hdr1_adv_amt_bal_Label = p.beansFactory.createLabel("Hdr1.adv_amt_bal_Label");
		p.Hdr1_adv_amt_bal = p.beansFactory.createNumberField("Hdr1.adv_amt_bal");
		p.Hdr1_adv_amt_bal.setLabel(p.Hdr1_adv_amt_bal_Label);
		p.Hdr1_adv_amt_Label = p.beansFactory.createLabel("Hdr1.adv_amt_Label");
		p.Hdr1_adv_amt = p.beansFactory.createNumberField("Hdr1.adv_amt");
		p.Hdr1_adv_amt.setLabel(p.Hdr1_adv_amt_Label);
		p.Hdr1_adv_setoff_amt_Label = p.beansFactory.createLabel("Hdr1.adv_setoff_amt_Label");
		p.Hdr1_adv_setoff_amt = p.beansFactory.createNumberField("Hdr1.adv_setoff_amt");
		p.Hdr1_adv_setoff_amt.setLabel(p.Hdr1_adv_setoff_amt_Label);
		p.Hdr1_adv_setoff_tax_amt_Label = p.beansFactory.createLabel("Hdr1.adv_setoff_tax_amt_Label");
		p.Hdr1_adv_setoff_tax_amt = p.beansFactory.createNumberField("Hdr1.adv_setoff_tax_amt");
		p.Hdr1_adv_setoff_tax_amt.setLabel(p.Hdr1_adv_setoff_tax_amt_Label);
		p.Hdr1_ins_usr_id_Label = p.beansFactory.createLabel("Hdr1.ins_usr_id_Label");
		p.Hdr1_ins_usr_id = p.beansFactory.createTextField("Hdr1.ins_usr_id");
		p.Hdr1_ins_usr_id.setLabel(p.Hdr1_ins_usr_id_Label);
		p.Hdr1_ins_usr_nm = p.beansFactory.createTextField("Hdr1.ins_usr_nm");
		p.Hdr1_ins_func_id_Label = p.beansFactory.createLabel("Hdr1.ins_func_id_Label");
		p.Hdr1_ins_func_id = p.beansFactory.createTextField("Hdr1.ins_func_id");
		p.Hdr1_ins_func_id.setLabel(p.Hdr1_ins_func_id_Label);
		p.Hdr1_ins_func_nm = p.beansFactory.createTextField("Hdr1.ins_func_nm");
		p.Hdr1_upd_usr_id_Label = p.beansFactory.createLabel("Hdr1.upd_usr_id_Label");
		p.Hdr1_upd_usr_id = p.beansFactory.createTextField("Hdr1.upd_usr_id");
		p.Hdr1_upd_usr_id.setLabel(p.Hdr1_upd_usr_id_Label);
		p.Hdr1_upd_usr_nm = p.beansFactory.createTextField("Hdr1.upd_usr_nm");
		p.Hdr1_upd_func_id_Label = p.beansFactory.createLabel("Hdr1.upd_func_id_Label");
		p.Hdr1_upd_func_id = p.beansFactory.createTextField("Hdr1.upd_func_id");
		p.Hdr1_upd_func_id.setLabel(p.Hdr1_upd_func_id_Label);
		p.Hdr1_upd_func_nm = p.beansFactory.createTextField("Hdr1.upd_func_nm");
		p.Hdr1_ins_ts_Label = p.beansFactory.createLabel("Hdr1.ins_ts_Label");
		p.Hdr1_ins_ts = p.beansFactory.createTimestampField("Hdr1.ins_ts");
		p.Hdr1_ins_ts.setLabel(p.Hdr1_ins_ts_Label);
		p.Hdr1_upd_ts_Label = p.beansFactory.createLabel("Hdr1.upd_ts_Label");
		p.Hdr1_upd_ts = p.beansFactory.createTimestampField("Hdr1.upd_ts");
		p.Hdr1_upd_ts.setLabel(p.Hdr1_upd_ts_Label);
		p.Hdr1_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr1.upd_srv_req_no_Label");
		p.Hdr1_upd_srv_req_no = p.beansFactory.createTextField("Hdr1.upd_srv_req_no");
		p.Hdr1_upd_srv_req_no.setLabel(p.Hdr1_upd_srv_req_no_Label);
		p.Hdr1_upd_cntr = p.beansFactory.createNumberField("Hdr1.upd_cntr");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_bill_rcpt_d_no = p.beansFactory.createTableColumn("Dtl.bill_rcpt_d_no", MCColumnType.TEXT);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_ac_dt = p.beansFactory.createTableColumn("Dtl.ac_dt", MCColumnType.DATE);
		p.columnDtl_dlv_dt = p.beansFactory.createTableColumn("Dtl.dlv_dt", MCColumnType.DATE);
		p.columnDtl_rcv_dt = p.beansFactory.createTableColumn("Dtl.rcv_dt", MCColumnType.DATE);
		p.columnDtl_bill_basis_dt = p.beansFactory.createTableColumn("Dtl.bill_basis_dt", MCColumnType.DATE);
		p.columnDtl_base_ac_dt = p.beansFactory.createTableColumn("Dtl.base_ac_dt", MCColumnType.DATE);
		p.columnDtl_bill_d_no = p.beansFactory.createTableColumn("Dtl.bill_d_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_ship_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_ship_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.ship_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_act_no = p.beansFactory.createTableColumn("Dtl.act_no", MCColumnType.TEXT);
		p.columnDtl_act_rev = p.beansFactory.createTableColumn("Dtl.act_rev", MCColumnType.NUMBER);
		p.columnDtl_act_d_no = p.beansFactory.createTableColumn("Dtl.act_d_no", MCColumnType.TEXT);
		p.columnDtl_po_no = p.beansFactory.createTableColumn("Dtl.po_no", MCColumnType.TEXT);
		p.columnDtl_po_d_no = p.beansFactory.createTableColumn("Dtl.po_d_no", MCColumnType.TEXT);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_cur_upri = p.beansFactory.createTableColumn("Dtl.trd_cur_upri", MCColumnType.NUMBER);
		p.columnDtl_interim_flg = p.beansFactory.createTableColumn("Dtl.interim_flg", MCColumnType.CHECK);
		p.columnDtl_trd_cur_amt = p.beansFactory.createTableColumn("Dtl.trd_cur_amt", MCColumnType.NUMBER);
		p.columnDtl_trd_inc_tax_amt = p.beansFactory.createTableColumn("Dtl.trd_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtl_tax_cd = p.beansFactory.createTableColumn("Dtl.tax_cd", MCColumnType.TEXT);
		p.columnDtl_tax_nm = p.beansFactory.createTableColumn("Dtl.tax_nm", MCColumnType.TEXT);
		p.columnDtl_tax_rate = p.beansFactory.createTableColumn("Dtl.tax_rate", MCColumnType.NUMBER);
		p.columnDtl_trd_cur_tax_amt = p.beansFactory.createTableColumn("Dtl.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtl_inc_tax_flg = p.beansFactory.createTableColumn("Dtl.inc_tax_flg", MCColumnType.CHECK);
		p.columnDtl_trd_cur_dscnt_amt = p.beansFactory.createTableColumn("Dtl.trd_cur_dscnt_amt", MCColumnType.NUMBER);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
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
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_bill_rcpt_no_Label);
		p.CndPanel.add(p.Cnd_bill_rcpt_no);
		p.CndPanel.setLastBeans(p.Cnd_bill_rcpt_no);
		p.Cnd_bill_rcpt_no.setNextBeans(p.Cnd_srch);
		p.Cnd_bill_rcpt_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0180.CndR.bill_rcpt_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setValueCheck(false);
		p.HdrTabPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.HdrTabPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.Hdr1Panel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.Hdr1Panel);
		p.Hdr1Panel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr1(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.Hdr1Panel.setNextBeans(p.Hdr2Panel);
		p.Hdr1Panel.setValueCheck(false);
		p.Hdr1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Hdr1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Hdr1Panel.add(p.Hdr1_bill_cl_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_cl_dt);
		p.Hdr1Panel.setLastBeans(p.Hdr1_bill_cl_dt);
		p.Hdr1_bill_cl_dt.setNextBeans(p.Hdr1_bill_dt);
		p.Hdr1_bill_cl_dt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_cl_dt_META);
		p.Hdr1_bill_cl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_bill_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_dt);
		p.Hdr1_bill_dt.setNextBeans(p.Hdr1_bill_no);
		p.Hdr1_bill_dt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_dt_META);
		p.Hdr1_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_bill_no_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_no);
		p.Hdr1_bill_no.setNextBeans(p.Hdr1_invalid_flg);
		p.Hdr1_bill_no.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_no_META);
		p.Hdr1Panel.add(p.Hdr1_invalid_flg);
		p.Hdr1_invalid_flg.setNextBeans(p.Hdr1_pre_bill_no);
		p.Hdr1_invalid_flg.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.invalid_flg_META);
		p.Hdr1Panel.add(p.Hdr1_pre_bill_no_Label);
		p.Hdr1Panel.add(p.Hdr1_pre_bill_no);
		p.Hdr1_pre_bill_no.setNextBeans(p.Hdr1_pre_bill_dt);
		p.Hdr1_pre_bill_no.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.pre_bill_no_META);
		p.Hdr1Panel.add(p.Hdr1_pre_bill_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_pre_bill_dt);
		p.Hdr1_pre_bill_dt.setNextBeans(p.Hdr1_bill_st_dt);
		p.Hdr1_pre_bill_dt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.pre_bill_dt_META);
		p.Hdr1_pre_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_bill_st_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_st_dt);
		p.Hdr1_bill_st_dt.setNextBeans(p.Hdr1_bill_end_dt);
		p.Hdr1_bill_st_dt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_st_dt_META);
		p.Hdr1_bill_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_bill_end_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_end_dt);
		p.Hdr1_bill_end_dt.setNextBeans(p.Hdr1_iv_no);
		p.Hdr1_bill_end_dt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_end_dt_META);
		p.Hdr1_bill_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_iv_no_Label);
		p.Hdr1Panel.add(p.Hdr1_iv_no);
		p.Hdr1_iv_no.setNextBeans(p.Hdr1_wrk_no);
		p.Hdr1_iv_no.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.iv_no_META);
		p.Hdr1Panel.add(p.Hdr1_wrk_no_Label);
		p.Hdr1Panel.add(p.Hdr1_wrk_no);
		p.Hdr1_wrk_no.setNextBeans(p.Hdr1_wrk_nm);
		p.Hdr1_wrk_no.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.wrk_no_META);
		p.Hdr1Panel.add(p.Hdr1_wrk_nm_Label);
		p.Hdr1Panel.add(p.Hdr1_wrk_nm);
		p.Hdr1_wrk_nm.setNextBeans(p.Hdr1_bill_src_cd);
		p.Hdr1_wrk_nm.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.wrk_nm_META);
		p.Hdr1Panel.add(p.Hdr1_bill_src_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_src_cd);
		p.Hdr1_bill_src_cd.setNextBeans(p.Hdr1_bill_src_nm);
		p.Hdr1_bill_src_cd.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_src_cd_META);
		p.Hdr1Panel.add(p.Hdr1_bill_src_nm);
		p.Hdr1_bill_src_nm.setNextBeans(p.Hdr1_bill_src_dpt);
		p.Hdr1_bill_src_nm.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_src_nm_META);
		p.Hdr1Panel.add(p.Hdr1_bill_src_dpt_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_src_dpt);
		p.Hdr1_bill_src_dpt.setNextBeans(p.Hdr1_trd_cur_cd);
		p.Hdr1_bill_src_dpt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_src_dpt_META);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_cd);
		p.Hdr1_trd_cur_cd.setNextBeans(p.Hdr1_trd_cur_nm);
		p.Hdr1_trd_cur_cd.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.trd_cur_cd_META);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_nm);
		p.Hdr1_trd_cur_nm.setNextBeans(p.Hdr1_base_cur_cd);
		p.Hdr1_trd_cur_nm.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.trd_cur_nm_META);
		p.Hdr1Panel.add(p.Hdr1_base_cur_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_base_cur_cd);
		p.Hdr1_base_cur_cd.setNextBeans(p.Hdr1_base_cur_nm);
		p.Hdr1_base_cur_cd.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.base_cur_cd_META);
		p.Hdr1Panel.add(p.Hdr1_base_cur_nm);
		p.Hdr1_base_cur_nm.setNextBeans(p.Hdr1_bill_xrate);
		p.Hdr1_base_cur_nm.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.base_cur_nm_META);
		p.Hdr1Panel.add(p.Hdr1_bill_xrate_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_xrate);
		p.Hdr1_bill_xrate.setNextBeans(p.Hdr1_last_bill_amt);
		p.Hdr1_bill_xrate.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_xrate_META);
		p.Hdr1Panel.add(p.Hdr1_last_bill_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_last_bill_amt);
		p.Hdr1_last_bill_amt.setNextBeans(p.Hdr1_rcv_amt);
		p.Hdr1_last_bill_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.last_bill_amt_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_amt);
		p.Hdr1_rcv_amt.setNextBeans(p.Hdr1_sw_amt);
		p.Hdr1_rcv_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.rcv_amt_META);
		p.Hdr1Panel.add(p.Hdr1_sw_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_sw_amt);
		p.Hdr1_sw_amt.setNextBeans(p.Hdr1_bfw_amt);
		p.Hdr1_sw_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.sw_amt_META);
		p.Hdr1Panel.add(p.Hdr1_bfw_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_bfw_amt);
		p.Hdr1_bfw_amt.setNextBeans(p.Hdr1_sls_amt);
		p.Hdr1_bfw_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bfw_amt_META);
		p.Hdr1Panel.add(p.Hdr1_sls_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_sls_amt);
		p.Hdr1_sls_amt.setNextBeans(p.Hdr1_dscnt_amt);
		p.Hdr1_sls_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.sls_amt_META);
		p.Hdr1Panel.add(p.Hdr1_dscnt_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_dscnt_amt);
		p.Hdr1_dscnt_amt.setNextBeans(p.Hdr1_ret_amt);
		p.Hdr1_dscnt_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.dscnt_amt_META);
		p.Hdr1Panel.add(p.Hdr1_ret_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_ret_amt);
		p.Hdr1_ret_amt.setNextBeans(p.Hdr1_setoff_amt);
		p.Hdr1_ret_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.ret_amt_META);
		p.Hdr1Panel.add(p.Hdr1_setoff_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_setoff_amt);
		p.Hdr1_setoff_amt.setNextBeans(p.Hdr1_tax_amt);
		p.Hdr1_setoff_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.setoff_amt_META);
		p.Hdr1Panel.add(p.Hdr1_tax_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_tax_amt);
		p.Hdr1_tax_amt.setNextBeans(p.Hdr1_sw_to_amt);
		p.Hdr1_tax_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.tax_amt_META);
		p.Hdr1Panel.add(p.Hdr1_sw_to_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_sw_to_amt);
		p.Hdr1_sw_to_amt.setNextBeans(p.Hdr1_bill_amt);
		p.Hdr1_sw_to_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.sw_to_amt_META);
		p.Hdr1Panel.add(p.Hdr1_bill_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_bill_amt);
		p.Hdr1_bill_amt.setNextBeans(p.Hdr1_adv_amt_bal);
		p.Hdr1_bill_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.bill_amt_META);
		p.Hdr1Panel.add(p.Hdr1_adv_amt_bal_Label);
		p.Hdr1Panel.add(p.Hdr1_adv_amt_bal);
		p.Hdr1_adv_amt_bal.setNextBeans(p.Hdr1_adv_amt);
		p.Hdr1_adv_amt_bal.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.adv_amt_bal_META);
		p.Hdr1Panel.add(p.Hdr1_adv_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_adv_amt);
		p.Hdr1_adv_amt.setNextBeans(p.Hdr1_adv_setoff_amt);
		p.Hdr1_adv_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.adv_amt_META);
		p.Hdr1Panel.add(p.Hdr1_adv_setoff_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_adv_setoff_amt);
		p.Hdr1_adv_setoff_amt.setNextBeans(p.Hdr1_adv_setoff_tax_amt);
		p.Hdr1_adv_setoff_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.adv_setoff_amt_META);
		p.Hdr1Panel.add(p.Hdr1_adv_setoff_tax_amt_Label);
		p.Hdr1Panel.add(p.Hdr1_adv_setoff_tax_amt);
		p.Hdr1_adv_setoff_tax_amt.setNextBeans(p.Hdr1_upd_cntr);
		p.Hdr1_adv_setoff_tax_amt.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.adv_setoff_tax_amt_META);
		p.Hdr2Panel.add(p.Hdr1_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr1_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr1_ins_usr_id);
		p.Hdr1_ins_usr_id.setNextBeans(p.Hdr1_ins_usr_nm);
		p.Hdr1_ins_usr_id.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr1_ins_usr_nm);
		p.Hdr1_ins_usr_nm.setNextBeans(p.Hdr1_ins_func_id);
		p.Hdr1_ins_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr1_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr1_ins_func_id);
		p.Hdr1_ins_func_id.setNextBeans(p.Hdr1_ins_func_nm);
		p.Hdr1_ins_func_id.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr1_ins_func_nm);
		p.Hdr1_ins_func_nm.setNextBeans(p.Hdr1_upd_usr_id);
		p.Hdr1_ins_func_nm.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr1_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr1_upd_usr_id);
		p.Hdr1_upd_usr_id.setNextBeans(p.Hdr1_upd_usr_nm);
		p.Hdr1_upd_usr_id.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr1_upd_usr_nm);
		p.Hdr1_upd_usr_nm.setNextBeans(p.Hdr1_upd_func_id);
		p.Hdr1_upd_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr1_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr1_upd_func_id);
		p.Hdr1_upd_func_id.setNextBeans(p.Hdr1_upd_func_nm);
		p.Hdr1_upd_func_id.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr1_upd_func_nm);
		p.Hdr1_upd_func_nm.setNextBeans(p.Hdr1_ins_ts);
		p.Hdr1_upd_func_nm.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr1_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr1_ins_ts);
		p.Hdr1_ins_ts.setNextBeans(p.Hdr1_upd_ts);
		p.Hdr1_ins_ts.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.ins_ts_META);
		p.Hdr1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr1_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr1_upd_ts);
		p.Hdr1_upd_ts.setNextBeans(p.Hdr1_upd_srv_req_no);
		p.Hdr1_upd_ts.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.upd_ts_META);
		p.Hdr1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr1_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr1_upd_srv_req_no);
		p.Hdr1_upd_srv_req_no.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.upd_srv_req_no_META);
		p.Hdr1Panel.add(p.Hdr1_upd_cntr);
		p.Hdr1_upd_cntr.setRow(p.getHdr1R(), mcframe.clientMSBH.MSBHP0180.Hdr1R.upd_cntr_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setValueCheck(false);
		p.Hdr2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Hdr2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBHP_BillRcptDSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("CBC");
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
		MSBHP_BillRcptDSrch_MC.mcInitCnd((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.mcInitHdrTab((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.mcInitHdr1((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.mcInitHdr2((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.mcInitDtl((MSBHP_BillRcptDSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBHP_BillRcptDSrch_MC.statusInitSRCH_Cnd((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.statusInitSRCH_HdrTab((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.statusInitSRCH_Hdr1((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.statusInitSRCH_Hdr2((MSBHP_BillRcptDSrch)this);
		MSBHP_BillRcptDSrch_MC.statusInitSRCH_Dtl((MSBHP_BillRcptDSrch)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_BillRcptDSrch p) {
		p.Cnd_bill_rcpt_no.setListListener(p);
		p.Cnd_bill_rcpt_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBHP_BillRcptDSrch p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr1(MSBHP_BillRcptDSrch p) {
		p.Hdr1_bill_cl_dt.setListListener(p);
		p.Hdr1_bill_cl_dt.addAllListener(p);
		p.Hdr1_bill_dt.setListListener(p);
		p.Hdr1_bill_dt.addAllListener(p);
		p.Hdr1_bill_no.setListListener(p);
		p.Hdr1_bill_no.addAllListener(p);
		p.Hdr1_invalid_flg.addAllListener(p);
		p.Hdr1_pre_bill_no.setListListener(p);
		p.Hdr1_pre_bill_no.addAllListener(p);
		p.Hdr1_pre_bill_dt.setListListener(p);
		p.Hdr1_pre_bill_dt.addAllListener(p);
		p.Hdr1_bill_st_dt.setListListener(p);
		p.Hdr1_bill_st_dt.addAllListener(p);
		p.Hdr1_bill_end_dt.setListListener(p);
		p.Hdr1_bill_end_dt.addAllListener(p);
		p.Hdr1_iv_no.setListListener(p);
		p.Hdr1_iv_no.addAllListener(p);
		p.Hdr1_wrk_no.setListListener(p);
		p.Hdr1_wrk_no.addAllListener(p);
		p.Hdr1_wrk_nm.setListListener(p);
		p.Hdr1_wrk_nm.addAllListener(p);
		p.Hdr1_bill_src_cd.setListListener(p);
		p.Hdr1_bill_src_cd.addAllListener(p);
		p.Hdr1_bill_src_nm.setListListener(p);
		p.Hdr1_bill_src_nm.addAllListener(p);
		p.Hdr1_bill_src_dpt.setListListener(p);
		p.Hdr1_bill_src_dpt.addAllListener(p);
		p.Hdr1_trd_cur_cd.setListListener(p);
		p.Hdr1_trd_cur_cd.addAllListener(p);
		p.Hdr1_trd_cur_nm.setListListener(p);
		p.Hdr1_trd_cur_nm.addAllListener(p);
		p.Hdr1_base_cur_cd.setListListener(p);
		p.Hdr1_base_cur_cd.addAllListener(p);
		p.Hdr1_base_cur_nm.setListListener(p);
		p.Hdr1_base_cur_nm.addAllListener(p);
		p.Hdr1_bill_xrate.setListListener(p);
		p.Hdr1_bill_xrate.addAllListener(p);
		p.Hdr1_last_bill_amt.setListListener(p);
		p.Hdr1_last_bill_amt.addAllListener(p);
		p.Hdr1_rcv_amt.setListListener(p);
		p.Hdr1_rcv_amt.addAllListener(p);
		p.Hdr1_sw_amt.setListListener(p);
		p.Hdr1_sw_amt.addAllListener(p);
		p.Hdr1_bfw_amt.setListListener(p);
		p.Hdr1_bfw_amt.addAllListener(p);
		p.Hdr1_sls_amt.setListListener(p);
		p.Hdr1_sls_amt.addAllListener(p);
		p.Hdr1_dscnt_amt.setListListener(p);
		p.Hdr1_dscnt_amt.addAllListener(p);
		p.Hdr1_ret_amt.setListListener(p);
		p.Hdr1_ret_amt.addAllListener(p);
		p.Hdr1_setoff_amt.setListListener(p);
		p.Hdr1_setoff_amt.addAllListener(p);
		p.Hdr1_tax_amt.setListListener(p);
		p.Hdr1_tax_amt.addAllListener(p);
		p.Hdr1_sw_to_amt.setListListener(p);
		p.Hdr1_sw_to_amt.addAllListener(p);
		p.Hdr1_bill_amt.setListListener(p);
		p.Hdr1_bill_amt.addAllListener(p);
		p.Hdr1_adv_amt_bal.setListListener(p);
		p.Hdr1_adv_amt_bal.addAllListener(p);
		p.Hdr1_adv_amt.setListListener(p);
		p.Hdr1_adv_amt.addAllListener(p);
		p.Hdr1_adv_setoff_amt.setListListener(p);
		p.Hdr1_adv_setoff_amt.addAllListener(p);
		p.Hdr1_adv_setoff_tax_amt.setListListener(p);
		p.Hdr1_adv_setoff_tax_amt.addAllListener(p);
		p.Hdr1_ins_usr_id.setListListener(p);
		p.Hdr1_ins_usr_id.addAllListener(p);
		p.Hdr1_ins_usr_nm.setListListener(p);
		p.Hdr1_ins_usr_nm.addAllListener(p);
		p.Hdr1_ins_func_id.setListListener(p);
		p.Hdr1_ins_func_id.addAllListener(p);
		p.Hdr1_ins_func_nm.setListListener(p);
		p.Hdr1_ins_func_nm.addAllListener(p);
		p.Hdr1_upd_usr_id.setListListener(p);
		p.Hdr1_upd_usr_id.addAllListener(p);
		p.Hdr1_upd_usr_nm.setListListener(p);
		p.Hdr1_upd_usr_nm.addAllListener(p);
		p.Hdr1_upd_func_id.setListListener(p);
		p.Hdr1_upd_func_id.addAllListener(p);
		p.Hdr1_upd_func_nm.setListListener(p);
		p.Hdr1_upd_func_nm.addAllListener(p);
		p.Hdr1_ins_ts.setListListener(p);
		p.Hdr1_ins_ts.addAllListener(p);
		p.Hdr1_upd_ts.setListListener(p);
		p.Hdr1_upd_ts.addAllListener(p);
		p.Hdr1_upd_srv_req_no.setListListener(p);
		p.Hdr1_upd_srv_req_no.addAllListener(p);
		p.Hdr1_upd_cntr.setListListener(p);
		p.Hdr1_upd_cntr.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBHP_BillRcptDSrch p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBHP_BillRcptDSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_bill_rcpt_d_no.addAllListener(p);
		p.columnDtl_bill_rcpt_d_no.setListListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_ac_dt.addAllListener(p);
		p.columnDtl_ac_dt.setListListener(p);
		p.columnDtl_dlv_dt.addAllListener(p);
		p.columnDtl_dlv_dt.setListListener(p);
		p.columnDtl_rcv_dt.addAllListener(p);
		p.columnDtl_rcv_dt.setListListener(p);
		p.columnDtl_bill_basis_dt.addAllListener(p);
		p.columnDtl_bill_basis_dt.setListListener(p);
		p.columnDtl_base_ac_dt.addAllListener(p);
		p.columnDtl_base_ac_dt.setListListener(p);
		p.columnDtl_bill_d_no.addAllListener(p);
		p.columnDtl_bill_d_no.setListListener(p);
		p.columnDtl_dlv_slip_no.addAllListener(p);
		p.columnDtl_dlv_slip_no.setListListener(p);
		p.columnDtl_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_dlv_slip_d_no.setListListener(p);
		p.columnDtl_ship_dlv_slip_no.addAllListener(p);
		p.columnDtl_ship_dlv_slip_no.setListListener(p);
		p.columnDtl_ship_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_ship_dlv_slip_d_no.setListListener(p);
		p.columnDtl_act_no.addAllListener(p);
		p.columnDtl_act_no.setListListener(p);
		p.columnDtl_act_rev.addAllListener(p);
		p.columnDtl_act_rev.setListListener(p);
		p.columnDtl_act_d_no.addAllListener(p);
		p.columnDtl_act_d_no.setListListener(p);
		p.columnDtl_po_no.addAllListener(p);
		p.columnDtl_po_no.setListListener(p);
		p.columnDtl_po_d_no.addAllListener(p);
		p.columnDtl_po_d_no.setListListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_trd_unit_qty.addAllListener(p);
		p.columnDtl_trd_unit_qty.setListListener(p);
		p.columnDtl_trd_cur_upri.addAllListener(p);
		p.columnDtl_trd_cur_upri.setListListener(p);
		p.columnDtl_interim_flg.addAllListener(p);
		p.columnDtl_trd_cur_amt.addAllListener(p);
		p.columnDtl_trd_cur_amt.setListListener(p);
		p.columnDtl_trd_inc_tax_amt.addAllListener(p);
		p.columnDtl_trd_inc_tax_amt.setListListener(p);
		p.columnDtl_tax_cd.addAllListener(p);
		p.columnDtl_tax_cd.setListListener(p);
		p.columnDtl_tax_nm.addAllListener(p);
		p.columnDtl_tax_nm.setListListener(p);
		p.columnDtl_tax_rate.addAllListener(p);
		p.columnDtl_tax_rate.setListListener(p);
		p.columnDtl_trd_cur_tax_amt.addAllListener(p);
		p.columnDtl_trd_cur_tax_amt.setListListener(p);
		p.columnDtl_inc_tax_flg.addAllListener(p);
		p.columnDtl_trd_cur_dscnt_amt.addAllListener(p);
		p.columnDtl_trd_cur_dscnt_amt.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
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
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBHP_BillRcptDSrch p){
		p.Cnd_bill_rcpt_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBHP_BillRcptDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr1(MSBHP_BillRcptDSrch p){
		p.Hdr1_bill_cl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_pre_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_pre_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_src_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_src_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_src_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_last_bill_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sw_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bfw_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sls_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_dscnt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ret_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_setoff_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sw_to_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_bill_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_adv_amt_bal.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_adv_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_adv_setoff_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_adv_setoff_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBHP_BillRcptDSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBHP_BillRcptDSrch p){
		p.columnDtl_bill_rcpt_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inc_tax_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

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
		MSBHP_BillRcptDSrch_MC.setTableConfigDtl((MSBHP_BillRcptDSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBHP_BillRcptDSrch p) {
		p.columnDtl_bill_rcpt_d_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.bill_rcpt_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_rcpt_d_no);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.ac_dt_META);
		p.columnDtl_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_dt);
		p.columnDtl_dlv_dt.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.dlv_dt_META);
		p.columnDtl_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_dt);
		p.columnDtl_rcv_dt.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.rcv_dt_META);
		p.columnDtl_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_dt);
		p.columnDtl_bill_basis_dt.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.bill_basis_dt_META);
		p.columnDtl_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_basis_dt);
		p.columnDtl_base_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.base_ac_dt_META);
		p.columnDtl_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_ac_dt);
		p.columnDtl_bill_d_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.bill_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_d_no);
		p.columnDtl_dlv_slip_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_no);
		p.columnDtl_dlv_slip_d_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_d_no);
		p.columnDtl_ship_dlv_slip_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.ship_dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_dlv_slip_no);
		p.columnDtl_ship_dlv_slip_d_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.ship_dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_dlv_slip_d_no);
		p.columnDtl_act_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_no);
		p.columnDtl_act_rev.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.act_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_rev);
		p.columnDtl_act_d_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_d_no);
		p.columnDtl_po_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no);
		p.columnDtl_po_d_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_d_no);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.DtlTable.addTable(p.Dtl_sno_p_PPanel.SnoWrkNoTable);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_qty.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_unit_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_qty);
		p.columnDtl_trd_cur_upri.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_cur_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_upri);
		p.columnDtl_interim_flg.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.interim_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_interim_flg);
		p.columnDtl_trd_cur_amt.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_cur_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_amt);
		p.columnDtl_trd_inc_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_inc_tax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_inc_tax_amt);
		p.columnDtl_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.tax_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tax_cd);
		p.columnDtl_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tax_nm);
		p.columnDtl_tax_rate.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.tax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tax_rate);
		p.columnDtl_trd_cur_tax_amt.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_cur_tax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_tax_amt);
		p.columnDtl_inc_tax_flg.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.inc_tax_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inc_tax_flg);
		p.columnDtl_trd_cur_dscnt_amt.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_cur_dscnt_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_dscnt_amt);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0180.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_bill_rcpt_no) return doCnd_bill_rcpt_no_VC(info);
		if (vc == Hdr1_bill_cl_dt) return doHdr1_bill_cl_dt_VC(info);
		if (vc == Hdr1_bill_dt) return doHdr1_bill_dt_VC(info);
		if (vc == Hdr1_bill_no) return doHdr1_bill_no_VC(info);
		if (vc == Hdr1_invalid_flg) return doHdr1_invalid_flg_VC(info);
		if (vc == Hdr1_pre_bill_no) return doHdr1_pre_bill_no_VC(info);
		if (vc == Hdr1_pre_bill_dt) return doHdr1_pre_bill_dt_VC(info);
		if (vc == Hdr1_bill_st_dt) return doHdr1_bill_st_dt_VC(info);
		if (vc == Hdr1_bill_end_dt) return doHdr1_bill_end_dt_VC(info);
		if (vc == Hdr1_iv_no) return doHdr1_iv_no_VC(info);
		if (vc == Hdr1_wrk_no) return doHdr1_wrk_no_VC(info);
		if (vc == Hdr1_wrk_nm) return doHdr1_wrk_nm_VC(info);
		if (vc == Hdr1_bill_src_cd) return doHdr1_bill_src_cd_VC(info);
		if (vc == Hdr1_bill_src_nm) return doHdr1_bill_src_nm_VC(info);
		if (vc == Hdr1_bill_src_dpt) return doHdr1_bill_src_dpt_VC(info);
		if (vc == Hdr1_trd_cur_cd) return doHdr1_trd_cur_cd_VC(info);
		if (vc == Hdr1_trd_cur_nm) return doHdr1_trd_cur_nm_VC(info);
		if (vc == Hdr1_base_cur_cd) return doHdr1_base_cur_cd_VC(info);
		if (vc == Hdr1_base_cur_nm) return doHdr1_base_cur_nm_VC(info);
		if (vc == Hdr1_bill_xrate) return doHdr1_bill_xrate_VC(info);
		if (vc == Hdr1_last_bill_amt) return doHdr1_last_bill_amt_VC(info);
		if (vc == Hdr1_rcv_amt) return doHdr1_rcv_amt_VC(info);
		if (vc == Hdr1_sw_amt) return doHdr1_sw_amt_VC(info);
		if (vc == Hdr1_bfw_amt) return doHdr1_bfw_amt_VC(info);
		if (vc == Hdr1_sls_amt) return doHdr1_sls_amt_VC(info);
		if (vc == Hdr1_dscnt_amt) return doHdr1_dscnt_amt_VC(info);
		if (vc == Hdr1_ret_amt) return doHdr1_ret_amt_VC(info);
		if (vc == Hdr1_setoff_amt) return doHdr1_setoff_amt_VC(info);
		if (vc == Hdr1_tax_amt) return doHdr1_tax_amt_VC(info);
		if (vc == Hdr1_sw_to_amt) return doHdr1_sw_to_amt_VC(info);
		if (vc == Hdr1_bill_amt) return doHdr1_bill_amt_VC(info);
		if (vc == Hdr1_adv_amt_bal) return doHdr1_adv_amt_bal_VC(info);
		if (vc == Hdr1_adv_amt) return doHdr1_adv_amt_VC(info);
		if (vc == Hdr1_adv_setoff_amt) return doHdr1_adv_setoff_amt_VC(info);
		if (vc == Hdr1_adv_setoff_tax_amt) return doHdr1_adv_setoff_tax_amt_VC(info);
		if (vc == Hdr1_ins_usr_id) return doHdr1_ins_usr_id_VC(info);
		if (vc == Hdr1_ins_usr_nm) return doHdr1_ins_usr_nm_VC(info);
		if (vc == Hdr1_ins_func_id) return doHdr1_ins_func_id_VC(info);
		if (vc == Hdr1_ins_func_nm) return doHdr1_ins_func_nm_VC(info);
		if (vc == Hdr1_upd_usr_id) return doHdr1_upd_usr_id_VC(info);
		if (vc == Hdr1_upd_usr_nm) return doHdr1_upd_usr_nm_VC(info);
		if (vc == Hdr1_upd_func_id) return doHdr1_upd_func_id_VC(info);
		if (vc == Hdr1_upd_func_nm) return doHdr1_upd_func_nm_VC(info);
		if (vc == Hdr1_ins_ts) return doHdr1_ins_ts_VC(info);
		if (vc == Hdr1_upd_ts) return doHdr1_upd_ts_VC(info);
		if (vc == Hdr1_upd_srv_req_no) return doHdr1_upd_srv_req_no_VC(info);
		if (vc == Hdr1_upd_cntr) return doHdr1_upd_cntr_VC(info);
		if (vc == columnDtl_bill_rcpt_d_no) return doDtl_bill_rcpt_d_no_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_ac_dt) return doDtl_ac_dt_VC(info);
		if (vc == columnDtl_dlv_dt) return doDtl_dlv_dt_VC(info);
		if (vc == columnDtl_rcv_dt) return doDtl_rcv_dt_VC(info);
		if (vc == columnDtl_bill_basis_dt) return doDtl_bill_basis_dt_VC(info);
		if (vc == columnDtl_base_ac_dt) return doDtl_base_ac_dt_VC(info);
		if (vc == columnDtl_bill_d_no) return doDtl_bill_d_no_VC(info);
		if (vc == columnDtl_dlv_slip_no) return doDtl_dlv_slip_no_VC(info);
		if (vc == columnDtl_dlv_slip_d_no) return doDtl_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_ship_dlv_slip_no) return doDtl_ship_dlv_slip_no_VC(info);
		if (vc == columnDtl_ship_dlv_slip_d_no) return doDtl_ship_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_act_no) return doDtl_act_no_VC(info);
		if (vc == columnDtl_act_rev) return doDtl_act_rev_VC(info);
		if (vc == columnDtl_act_d_no) return doDtl_act_d_no_VC(info);
		if (vc == columnDtl_po_no) return doDtl_po_no_VC(info);
		if (vc == columnDtl_po_d_no) return doDtl_po_d_no_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_trd_unit_qty) return doDtl_trd_unit_qty_VC(info);
		if (vc == columnDtl_trd_cur_upri) return doDtl_trd_cur_upri_VC(info);
		if (vc == columnDtl_interim_flg) return doDtl_interim_flg_VC(info);
		if (vc == columnDtl_trd_cur_amt) return doDtl_trd_cur_amt_VC(info);
		if (vc == columnDtl_trd_inc_tax_amt) return doDtl_trd_inc_tax_amt_VC(info);
		if (vc == columnDtl_tax_cd) return doDtl_tax_cd_VC(info);
		if (vc == columnDtl_tax_nm) return doDtl_tax_nm_VC(info);
		if (vc == columnDtl_tax_rate) return doDtl_tax_rate_VC(info);
		if (vc == columnDtl_trd_cur_tax_amt) return doDtl_trd_cur_tax_amt_VC(info);
		if (vc == columnDtl_inc_tax_flg) return doDtl_inc_tax_flg_VC(info);
		if (vc == columnDtl_trd_cur_dscnt_amt) return doDtl_trd_cur_dscnt_amt_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
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
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_rcpt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_cl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_cl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pre_bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pre_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pre_bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pre_bill_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_src_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_src_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_src_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_src_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_src_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_src_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[last_bill_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_last_bill_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sw_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sw_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bfw_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bfw_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sls_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sls_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ret_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ret_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[setoff_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_setoff_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sw_to_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sw_to_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[bill_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_bill_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[adv_amt_bal]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_adv_amt_bal_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[adv_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_adv_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_adv_setoff_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_adv_setoff_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_rcpt_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_rcpt_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_dscnt_amt_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_bill_rcpt_no) doCnd_bill_rcpt_no_NC(info);
		else if (nc == Hdr1_bill_cl_dt) doHdr1_bill_cl_dt_NC(info);
		else if (nc == Hdr1_bill_dt) doHdr1_bill_dt_NC(info);
		else if (nc == Hdr1_bill_no) doHdr1_bill_no_NC(info);
		else if (nc == Hdr1_invalid_flg) doHdr1_invalid_flg_NC(info);
		else if (nc == Hdr1_pre_bill_no) doHdr1_pre_bill_no_NC(info);
		else if (nc == Hdr1_pre_bill_dt) doHdr1_pre_bill_dt_NC(info);
		else if (nc == Hdr1_bill_st_dt) doHdr1_bill_st_dt_NC(info);
		else if (nc == Hdr1_bill_end_dt) doHdr1_bill_end_dt_NC(info);
		else if (nc == Hdr1_iv_no) doHdr1_iv_no_NC(info);
		else if (nc == Hdr1_wrk_no) doHdr1_wrk_no_NC(info);
		else if (nc == Hdr1_wrk_nm) doHdr1_wrk_nm_NC(info);
		else if (nc == Hdr1_bill_src_cd) doHdr1_bill_src_cd_NC(info);
		else if (nc == Hdr1_bill_src_nm) doHdr1_bill_src_nm_NC(info);
		else if (nc == Hdr1_bill_src_dpt) doHdr1_bill_src_dpt_NC(info);
		else if (nc == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_NC(info);
		else if (nc == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_NC(info);
		else if (nc == Hdr1_base_cur_cd) doHdr1_base_cur_cd_NC(info);
		else if (nc == Hdr1_base_cur_nm) doHdr1_base_cur_nm_NC(info);
		else if (nc == Hdr1_bill_xrate) doHdr1_bill_xrate_NC(info);
		else if (nc == Hdr1_last_bill_amt) doHdr1_last_bill_amt_NC(info);
		else if (nc == Hdr1_rcv_amt) doHdr1_rcv_amt_NC(info);
		else if (nc == Hdr1_sw_amt) doHdr1_sw_amt_NC(info);
		else if (nc == Hdr1_bfw_amt) doHdr1_bfw_amt_NC(info);
		else if (nc == Hdr1_sls_amt) doHdr1_sls_amt_NC(info);
		else if (nc == Hdr1_dscnt_amt) doHdr1_dscnt_amt_NC(info);
		else if (nc == Hdr1_ret_amt) doHdr1_ret_amt_NC(info);
		else if (nc == Hdr1_setoff_amt) doHdr1_setoff_amt_NC(info);
		else if (nc == Hdr1_tax_amt) doHdr1_tax_amt_NC(info);
		else if (nc == Hdr1_sw_to_amt) doHdr1_sw_to_amt_NC(info);
		else if (nc == Hdr1_bill_amt) doHdr1_bill_amt_NC(info);
		else if (nc == Hdr1_adv_amt_bal) doHdr1_adv_amt_bal_NC(info);
		else if (nc == Hdr1_adv_amt) doHdr1_adv_amt_NC(info);
		else if (nc == Hdr1_adv_setoff_amt) doHdr1_adv_setoff_amt_NC(info);
		else if (nc == Hdr1_adv_setoff_tax_amt) doHdr1_adv_setoff_tax_amt_NC(info);
		else if (nc == Hdr1_ins_usr_id) doHdr1_ins_usr_id_NC(info);
		else if (nc == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_NC(info);
		else if (nc == Hdr1_ins_func_id) doHdr1_ins_func_id_NC(info);
		else if (nc == Hdr1_ins_func_nm) doHdr1_ins_func_nm_NC(info);
		else if (nc == Hdr1_upd_usr_id) doHdr1_upd_usr_id_NC(info);
		else if (nc == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_NC(info);
		else if (nc == Hdr1_upd_func_id) doHdr1_upd_func_id_NC(info);
		else if (nc == Hdr1_upd_func_nm) doHdr1_upd_func_nm_NC(info);
		else if (nc == Hdr1_ins_ts) doHdr1_ins_ts_NC(info);
		else if (nc == Hdr1_upd_ts) doHdr1_upd_ts_NC(info);
		else if (nc == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_NC(info);
		else if (nc == Hdr1_upd_cntr) doHdr1_upd_cntr_NC(info);
		else if (nc == columnDtl_bill_rcpt_d_no) doDtl_bill_rcpt_d_no_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_ac_dt) doDtl_ac_dt_NC(info);
		else if (nc == columnDtl_dlv_dt) doDtl_dlv_dt_NC(info);
		else if (nc == columnDtl_rcv_dt) doDtl_rcv_dt_NC(info);
		else if (nc == columnDtl_bill_basis_dt) doDtl_bill_basis_dt_NC(info);
		else if (nc == columnDtl_base_ac_dt) doDtl_base_ac_dt_NC(info);
		else if (nc == columnDtl_bill_d_no) doDtl_bill_d_no_NC(info);
		else if (nc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NC(info);
		else if (nc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_ship_dlv_slip_no) doDtl_ship_dlv_slip_no_NC(info);
		else if (nc == columnDtl_ship_dlv_slip_d_no) doDtl_ship_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_act_no) doDtl_act_no_NC(info);
		else if (nc == columnDtl_act_rev) doDtl_act_rev_NC(info);
		else if (nc == columnDtl_act_d_no) doDtl_act_d_no_NC(info);
		else if (nc == columnDtl_po_no) doDtl_po_no_NC(info);
		else if (nc == columnDtl_po_d_no) doDtl_po_d_no_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_NC(info);
		else if (nc == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_NC(info);
		else if (nc == columnDtl_interim_flg) doDtl_interim_flg_NC(info);
		else if (nc == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_NC(info);
		else if (nc == columnDtl_trd_inc_tax_amt) doDtl_trd_inc_tax_amt_NC(info);
		else if (nc == columnDtl_tax_cd) doDtl_tax_cd_NC(info);
		else if (nc == columnDtl_tax_nm) doDtl_tax_nm_NC(info);
		else if (nc == columnDtl_tax_rate) doDtl_tax_rate_NC(info);
		else if (nc == columnDtl_trd_cur_tax_amt) doDtl_trd_cur_tax_amt_NC(info);
		else if (nc == columnDtl_inc_tax_flg) doDtl_inc_tax_flg_NC(info);
		else if (nc == columnDtl_trd_cur_dscnt_amt) doDtl_trd_cur_dscnt_amt_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
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
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rcpt_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_cl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_cl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[last_bill_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_last_bill_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sw_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sw_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bfw_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bfw_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[setoff_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_setoff_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sw_to_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sw_to_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_amt_bal]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_amt_bal_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_setoff_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_setoff_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_rcpt_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_rcpt_d_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_d_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_bill_rcpt_no) doCnd_bill_rcpt_no_NE(info);
		else if (ne == Hdr1_bill_cl_dt) doHdr1_bill_cl_dt_NE(info);
		else if (ne == Hdr1_bill_dt) doHdr1_bill_dt_NE(info);
		else if (ne == Hdr1_bill_no) doHdr1_bill_no_NE(info);
		else if (ne == Hdr1_invalid_flg) doHdr1_invalid_flg_NE(info);
		else if (ne == Hdr1_pre_bill_no) doHdr1_pre_bill_no_NE(info);
		else if (ne == Hdr1_pre_bill_dt) doHdr1_pre_bill_dt_NE(info);
		else if (ne == Hdr1_bill_st_dt) doHdr1_bill_st_dt_NE(info);
		else if (ne == Hdr1_bill_end_dt) doHdr1_bill_end_dt_NE(info);
		else if (ne == Hdr1_iv_no) doHdr1_iv_no_NE(info);
		else if (ne == Hdr1_wrk_no) doHdr1_wrk_no_NE(info);
		else if (ne == Hdr1_wrk_nm) doHdr1_wrk_nm_NE(info);
		else if (ne == Hdr1_bill_src_cd) doHdr1_bill_src_cd_NE(info);
		else if (ne == Hdr1_bill_src_nm) doHdr1_bill_src_nm_NE(info);
		else if (ne == Hdr1_bill_src_dpt) doHdr1_bill_src_dpt_NE(info);
		else if (ne == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_NE(info);
		else if (ne == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_NE(info);
		else if (ne == Hdr1_base_cur_cd) doHdr1_base_cur_cd_NE(info);
		else if (ne == Hdr1_base_cur_nm) doHdr1_base_cur_nm_NE(info);
		else if (ne == Hdr1_bill_xrate) doHdr1_bill_xrate_NE(info);
		else if (ne == Hdr1_last_bill_amt) doHdr1_last_bill_amt_NE(info);
		else if (ne == Hdr1_rcv_amt) doHdr1_rcv_amt_NE(info);
		else if (ne == Hdr1_sw_amt) doHdr1_sw_amt_NE(info);
		else if (ne == Hdr1_bfw_amt) doHdr1_bfw_amt_NE(info);
		else if (ne == Hdr1_sls_amt) doHdr1_sls_amt_NE(info);
		else if (ne == Hdr1_dscnt_amt) doHdr1_dscnt_amt_NE(info);
		else if (ne == Hdr1_ret_amt) doHdr1_ret_amt_NE(info);
		else if (ne == Hdr1_setoff_amt) doHdr1_setoff_amt_NE(info);
		else if (ne == Hdr1_tax_amt) doHdr1_tax_amt_NE(info);
		else if (ne == Hdr1_sw_to_amt) doHdr1_sw_to_amt_NE(info);
		else if (ne == Hdr1_bill_amt) doHdr1_bill_amt_NE(info);
		else if (ne == Hdr1_adv_amt_bal) doHdr1_adv_amt_bal_NE(info);
		else if (ne == Hdr1_adv_amt) doHdr1_adv_amt_NE(info);
		else if (ne == Hdr1_adv_setoff_amt) doHdr1_adv_setoff_amt_NE(info);
		else if (ne == Hdr1_adv_setoff_tax_amt) doHdr1_adv_setoff_tax_amt_NE(info);
		else if (ne == Hdr1_ins_usr_id) doHdr1_ins_usr_id_NE(info);
		else if (ne == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_NE(info);
		else if (ne == Hdr1_ins_func_id) doHdr1_ins_func_id_NE(info);
		else if (ne == Hdr1_ins_func_nm) doHdr1_ins_func_nm_NE(info);
		else if (ne == Hdr1_upd_usr_id) doHdr1_upd_usr_id_NE(info);
		else if (ne == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_NE(info);
		else if (ne == Hdr1_upd_func_id) doHdr1_upd_func_id_NE(info);
		else if (ne == Hdr1_upd_func_nm) doHdr1_upd_func_nm_NE(info);
		else if (ne == Hdr1_ins_ts) doHdr1_ins_ts_NE(info);
		else if (ne == Hdr1_upd_ts) doHdr1_upd_ts_NE(info);
		else if (ne == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_NE(info);
		else if (ne == Hdr1_upd_cntr) doHdr1_upd_cntr_NE(info);
		else if (ne == columnDtl_bill_rcpt_d_no) doDtl_bill_rcpt_d_no_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_ac_dt) doDtl_ac_dt_NE(info);
		else if (ne == columnDtl_dlv_dt) doDtl_dlv_dt_NE(info);
		else if (ne == columnDtl_rcv_dt) doDtl_rcv_dt_NE(info);
		else if (ne == columnDtl_bill_basis_dt) doDtl_bill_basis_dt_NE(info);
		else if (ne == columnDtl_base_ac_dt) doDtl_base_ac_dt_NE(info);
		else if (ne == columnDtl_bill_d_no) doDtl_bill_d_no_NE(info);
		else if (ne == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NE(info);
		else if (ne == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_ship_dlv_slip_no) doDtl_ship_dlv_slip_no_NE(info);
		else if (ne == columnDtl_ship_dlv_slip_d_no) doDtl_ship_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_act_no) doDtl_act_no_NE(info);
		else if (ne == columnDtl_act_rev) doDtl_act_rev_NE(info);
		else if (ne == columnDtl_act_d_no) doDtl_act_d_no_NE(info);
		else if (ne == columnDtl_po_no) doDtl_po_no_NE(info);
		else if (ne == columnDtl_po_d_no) doDtl_po_d_no_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_NE(info);
		else if (ne == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_NE(info);
		else if (ne == columnDtl_interim_flg) doDtl_interim_flg_NE(info);
		else if (ne == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_NE(info);
		else if (ne == columnDtl_trd_inc_tax_amt) doDtl_trd_inc_tax_amt_NE(info);
		else if (ne == columnDtl_tax_cd) doDtl_tax_cd_NE(info);
		else if (ne == columnDtl_tax_nm) doDtl_tax_nm_NE(info);
		else if (ne == columnDtl_tax_rate) doDtl_tax_rate_NE(info);
		else if (ne == columnDtl_trd_cur_tax_amt) doDtl_trd_cur_tax_amt_NE(info);
		else if (ne == columnDtl_inc_tax_flg) doDtl_inc_tax_flg_NE(info);
		else if (ne == columnDtl_trd_cur_dscnt_amt) doDtl_trd_cur_dscnt_amt_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
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
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rcpt_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_cl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_cl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[last_bill_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_last_bill_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sw_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sw_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bfw_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bfw_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[setoff_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_setoff_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sw_to_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sw_to_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_amt_bal]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_amt_bal_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_setoff_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_setoff_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_rcpt_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_rcpt_d_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_d_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_bill_rcpt_no) doCnd_bill_rcpt_no_NX(info);
		else if (nx == Hdr1_bill_cl_dt) doHdr1_bill_cl_dt_NX(info);
		else if (nx == Hdr1_bill_dt) doHdr1_bill_dt_NX(info);
		else if (nx == Hdr1_bill_no) doHdr1_bill_no_NX(info);
		else if (nx == Hdr1_invalid_flg) doHdr1_invalid_flg_NX(info);
		else if (nx == Hdr1_pre_bill_no) doHdr1_pre_bill_no_NX(info);
		else if (nx == Hdr1_pre_bill_dt) doHdr1_pre_bill_dt_NX(info);
		else if (nx == Hdr1_bill_st_dt) doHdr1_bill_st_dt_NX(info);
		else if (nx == Hdr1_bill_end_dt) doHdr1_bill_end_dt_NX(info);
		else if (nx == Hdr1_iv_no) doHdr1_iv_no_NX(info);
		else if (nx == Hdr1_wrk_no) doHdr1_wrk_no_NX(info);
		else if (nx == Hdr1_wrk_nm) doHdr1_wrk_nm_NX(info);
		else if (nx == Hdr1_bill_src_cd) doHdr1_bill_src_cd_NX(info);
		else if (nx == Hdr1_bill_src_nm) doHdr1_bill_src_nm_NX(info);
		else if (nx == Hdr1_bill_src_dpt) doHdr1_bill_src_dpt_NX(info);
		else if (nx == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_NX(info);
		else if (nx == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_NX(info);
		else if (nx == Hdr1_base_cur_cd) doHdr1_base_cur_cd_NX(info);
		else if (nx == Hdr1_base_cur_nm) doHdr1_base_cur_nm_NX(info);
		else if (nx == Hdr1_bill_xrate) doHdr1_bill_xrate_NX(info);
		else if (nx == Hdr1_last_bill_amt) doHdr1_last_bill_amt_NX(info);
		else if (nx == Hdr1_rcv_amt) doHdr1_rcv_amt_NX(info);
		else if (nx == Hdr1_sw_amt) doHdr1_sw_amt_NX(info);
		else if (nx == Hdr1_bfw_amt) doHdr1_bfw_amt_NX(info);
		else if (nx == Hdr1_sls_amt) doHdr1_sls_amt_NX(info);
		else if (nx == Hdr1_dscnt_amt) doHdr1_dscnt_amt_NX(info);
		else if (nx == Hdr1_ret_amt) doHdr1_ret_amt_NX(info);
		else if (nx == Hdr1_setoff_amt) doHdr1_setoff_amt_NX(info);
		else if (nx == Hdr1_tax_amt) doHdr1_tax_amt_NX(info);
		else if (nx == Hdr1_sw_to_amt) doHdr1_sw_to_amt_NX(info);
		else if (nx == Hdr1_bill_amt) doHdr1_bill_amt_NX(info);
		else if (nx == Hdr1_adv_amt_bal) doHdr1_adv_amt_bal_NX(info);
		else if (nx == Hdr1_adv_amt) doHdr1_adv_amt_NX(info);
		else if (nx == Hdr1_adv_setoff_amt) doHdr1_adv_setoff_amt_NX(info);
		else if (nx == Hdr1_adv_setoff_tax_amt) doHdr1_adv_setoff_tax_amt_NX(info);
		else if (nx == Hdr1_ins_usr_id) doHdr1_ins_usr_id_NX(info);
		else if (nx == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_NX(info);
		else if (nx == Hdr1_ins_func_id) doHdr1_ins_func_id_NX(info);
		else if (nx == Hdr1_ins_func_nm) doHdr1_ins_func_nm_NX(info);
		else if (nx == Hdr1_upd_usr_id) doHdr1_upd_usr_id_NX(info);
		else if (nx == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_NX(info);
		else if (nx == Hdr1_upd_func_id) doHdr1_upd_func_id_NX(info);
		else if (nx == Hdr1_upd_func_nm) doHdr1_upd_func_nm_NX(info);
		else if (nx == Hdr1_ins_ts) doHdr1_ins_ts_NX(info);
		else if (nx == Hdr1_upd_ts) doHdr1_upd_ts_NX(info);
		else if (nx == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_NX(info);
		else if (nx == Hdr1_upd_cntr) doHdr1_upd_cntr_NX(info);
		else if (nx == columnDtl_bill_rcpt_d_no) doDtl_bill_rcpt_d_no_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_ac_dt) doDtl_ac_dt_NX(info);
		else if (nx == columnDtl_dlv_dt) doDtl_dlv_dt_NX(info);
		else if (nx == columnDtl_rcv_dt) doDtl_rcv_dt_NX(info);
		else if (nx == columnDtl_bill_basis_dt) doDtl_bill_basis_dt_NX(info);
		else if (nx == columnDtl_base_ac_dt) doDtl_base_ac_dt_NX(info);
		else if (nx == columnDtl_bill_d_no) doDtl_bill_d_no_NX(info);
		else if (nx == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NX(info);
		else if (nx == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_ship_dlv_slip_no) doDtl_ship_dlv_slip_no_NX(info);
		else if (nx == columnDtl_ship_dlv_slip_d_no) doDtl_ship_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_act_no) doDtl_act_no_NX(info);
		else if (nx == columnDtl_act_rev) doDtl_act_rev_NX(info);
		else if (nx == columnDtl_act_d_no) doDtl_act_d_no_NX(info);
		else if (nx == columnDtl_po_no) doDtl_po_no_NX(info);
		else if (nx == columnDtl_po_d_no) doDtl_po_d_no_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_NX(info);
		else if (nx == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_NX(info);
		else if (nx == columnDtl_interim_flg) doDtl_interim_flg_NX(info);
		else if (nx == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_NX(info);
		else if (nx == columnDtl_trd_inc_tax_amt) doDtl_trd_inc_tax_amt_NX(info);
		else if (nx == columnDtl_tax_cd) doDtl_tax_cd_NX(info);
		else if (nx == columnDtl_tax_nm) doDtl_tax_nm_NX(info);
		else if (nx == columnDtl_tax_rate) doDtl_tax_rate_NX(info);
		else if (nx == columnDtl_trd_cur_tax_amt) doDtl_trd_cur_tax_amt_NX(info);
		else if (nx == columnDtl_inc_tax_flg) doDtl_inc_tax_flg_NX(info);
		else if (nx == columnDtl_trd_cur_dscnt_amt) doDtl_trd_cur_dscnt_amt_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
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
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rcpt_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_cl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_cl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[last_bill_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_last_bill_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sw_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sw_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bfw_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bfw_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[setoff_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_setoff_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sw_to_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sw_to_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_amt_bal]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_amt_bal_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_setoff_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_setoff_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_rcpt_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_rcpt_d_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_d_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bill_rcpt_no) doCnd_bill_rcpt_no_LC(info);
		else if (lc == Hdr1_bill_cl_dt) doHdr1_bill_cl_dt_LC(info);
		else if (lc == Hdr1_bill_dt) doHdr1_bill_dt_LC(info);
		else if (lc == Hdr1_bill_no) doHdr1_bill_no_LC(info);
		else if (lc == Hdr1_pre_bill_no) doHdr1_pre_bill_no_LC(info);
		else if (lc == Hdr1_pre_bill_dt) doHdr1_pre_bill_dt_LC(info);
		else if (lc == Hdr1_bill_st_dt) doHdr1_bill_st_dt_LC(info);
		else if (lc == Hdr1_bill_end_dt) doHdr1_bill_end_dt_LC(info);
		else if (lc == Hdr1_iv_no) doHdr1_iv_no_LC(info);
		else if (lc == Hdr1_wrk_no) doHdr1_wrk_no_LC(info);
		else if (lc == Hdr1_wrk_nm) doHdr1_wrk_nm_LC(info);
		else if (lc == Hdr1_bill_src_cd) doHdr1_bill_src_cd_LC(info);
		else if (lc == Hdr1_bill_src_nm) doHdr1_bill_src_nm_LC(info);
		else if (lc == Hdr1_bill_src_dpt) doHdr1_bill_src_dpt_LC(info);
		else if (lc == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_LC(info);
		else if (lc == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_LC(info);
		else if (lc == Hdr1_base_cur_cd) doHdr1_base_cur_cd_LC(info);
		else if (lc == Hdr1_base_cur_nm) doHdr1_base_cur_nm_LC(info);
		else if (lc == Hdr1_bill_xrate) doHdr1_bill_xrate_LC(info);
		else if (lc == Hdr1_last_bill_amt) doHdr1_last_bill_amt_LC(info);
		else if (lc == Hdr1_rcv_amt) doHdr1_rcv_amt_LC(info);
		else if (lc == Hdr1_sw_amt) doHdr1_sw_amt_LC(info);
		else if (lc == Hdr1_bfw_amt) doHdr1_bfw_amt_LC(info);
		else if (lc == Hdr1_sls_amt) doHdr1_sls_amt_LC(info);
		else if (lc == Hdr1_dscnt_amt) doHdr1_dscnt_amt_LC(info);
		else if (lc == Hdr1_ret_amt) doHdr1_ret_amt_LC(info);
		else if (lc == Hdr1_setoff_amt) doHdr1_setoff_amt_LC(info);
		else if (lc == Hdr1_tax_amt) doHdr1_tax_amt_LC(info);
		else if (lc == Hdr1_sw_to_amt) doHdr1_sw_to_amt_LC(info);
		else if (lc == Hdr1_bill_amt) doHdr1_bill_amt_LC(info);
		else if (lc == Hdr1_adv_amt_bal) doHdr1_adv_amt_bal_LC(info);
		else if (lc == Hdr1_adv_amt) doHdr1_adv_amt_LC(info);
		else if (lc == Hdr1_adv_setoff_amt) doHdr1_adv_setoff_amt_LC(info);
		else if (lc == Hdr1_adv_setoff_tax_amt) doHdr1_adv_setoff_tax_amt_LC(info);
		else if (lc == Hdr1_ins_usr_id) doHdr1_ins_usr_id_LC(info);
		else if (lc == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_LC(info);
		else if (lc == Hdr1_ins_func_id) doHdr1_ins_func_id_LC(info);
		else if (lc == Hdr1_ins_func_nm) doHdr1_ins_func_nm_LC(info);
		else if (lc == Hdr1_upd_usr_id) doHdr1_upd_usr_id_LC(info);
		else if (lc == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_LC(info);
		else if (lc == Hdr1_upd_func_id) doHdr1_upd_func_id_LC(info);
		else if (lc == Hdr1_upd_func_nm) doHdr1_upd_func_nm_LC(info);
		else if (lc == Hdr1_ins_ts) doHdr1_ins_ts_LC(info);
		else if (lc == Hdr1_upd_ts) doHdr1_upd_ts_LC(info);
		else if (lc == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_LC(info);
		else if (lc == Hdr1_upd_cntr) doHdr1_upd_cntr_LC(info);
		else if (lc == columnDtl_bill_rcpt_d_no) doDtl_bill_rcpt_d_no_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_ac_dt) doDtl_ac_dt_LC(info);
		else if (lc == columnDtl_dlv_dt) doDtl_dlv_dt_LC(info);
		else if (lc == columnDtl_rcv_dt) doDtl_rcv_dt_LC(info);
		else if (lc == columnDtl_bill_basis_dt) doDtl_bill_basis_dt_LC(info);
		else if (lc == columnDtl_base_ac_dt) doDtl_base_ac_dt_LC(info);
		else if (lc == columnDtl_bill_d_no) doDtl_bill_d_no_LC(info);
		else if (lc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_LC(info);
		else if (lc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_ship_dlv_slip_no) doDtl_ship_dlv_slip_no_LC(info);
		else if (lc == columnDtl_ship_dlv_slip_d_no) doDtl_ship_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_act_no) doDtl_act_no_LC(info);
		else if (lc == columnDtl_act_rev) doDtl_act_rev_LC(info);
		else if (lc == columnDtl_act_d_no) doDtl_act_d_no_LC(info);
		else if (lc == columnDtl_po_no) doDtl_po_no_LC(info);
		else if (lc == columnDtl_po_d_no) doDtl_po_d_no_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_trd_unit_qty) doDtl_trd_unit_qty_LC(info);
		else if (lc == columnDtl_trd_cur_upri) doDtl_trd_cur_upri_LC(info);
		else if (lc == columnDtl_trd_cur_amt) doDtl_trd_cur_amt_LC(info);
		else if (lc == columnDtl_trd_inc_tax_amt) doDtl_trd_inc_tax_amt_LC(info);
		else if (lc == columnDtl_tax_cd) doDtl_tax_cd_LC(info);
		else if (lc == columnDtl_tax_nm) doDtl_tax_nm_LC(info);
		else if (lc == columnDtl_tax_rate) doDtl_tax_rate_LC(info);
		else if (lc == columnDtl_trd_cur_tax_amt) doDtl_trd_cur_tax_amt_LC(info);
		else if (lc == columnDtl_trd_cur_dscnt_amt) doDtl_trd_cur_dscnt_amt_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
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
	}

	/**
	 * [Cnd]パネルの[bill_rcpt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_rcpt_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_cl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_cl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_src_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_src_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[last_bill_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_last_bill_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sw_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sw_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bfw_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bfw_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[setoff_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_setoff_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sw_to_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sw_to_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[bill_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_bill_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_amt_bal]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_amt_bal_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_setoff_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[adv_setoff_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_adv_setoff_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_rcpt_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_rcpt_d_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_d_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0180.Srch01")) {
			return new MS_MSBHL0180_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0180_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0180_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0180_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0180_Srch01Bridge() {
			p_MS_MSBHL0180_Srch01 = new MCParam(PDef.MS_MSBHL0180_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0180_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0180.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBH.MSBHP0180.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0180.DtlR.class));

			p_MS_MSBHL0180_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0180_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0180_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0180_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0180_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0180.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0180.CndR)up(0);
		}

		protected mcframe.clientMSBH.MSBHP0180.Hdr1R down0() {
			return (mcframe.clientMSBH.MSBHP0180.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0180.DtlR> down1() {
			return (MCList<mcframe.clientMSBH.MSBHP0180.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0180_Srch01.addDownBlock(mcframe.clientMSBH.MSBHP0180.Hdr1R.create());
			p_MS_MSBHL0180_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0180.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0180_Srch01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBH.MSBHP0180.Hdr1R)p_MS_MSBHL0180_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBH.MSBHP0180.DtlR>)p_MS_MSBHL0180_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdr1R().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtlL());
			return result;
		}
	}
}