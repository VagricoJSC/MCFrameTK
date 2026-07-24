package mcframe.clientMSBG.MSBGP0080;

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
import mcframe.clientMSBG.MSBGP0080.MSBGP_RcvSchdAdjstReg_MC.MS_MSBGL0080_Srch01Caller;
import mcframe.clientMSBG.MSBGP0080.MSBGP_RcvSchdAdjstReg_MC.MS_MSBGL0080_Upd01Caller;

/**
 * 画面"MSBGP_RcvSchdAdjstReg"パネルクラスです。<p>
 *
 * 請求締処理で作成した入金予定をマニュアルで分割・まとめ・調整します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_RcvSchdAdjstReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0080";

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
	 * UPD,Modify,0;REF,View,1 UPD,訂正する,0;REF,参照する,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_bill_no_Label = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_no = null;
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
	public MCLabel Hdr_bill_ym_Label = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDateField Hdr_bill_ym = null;
	public MCLabel Hdr_bill_cl_day_Label = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumberField Hdr_bill_cl_day = null;
	public MCLabel Hdr_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_iv_no = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_prnt_flg = null;
	/**
	 * Display payment receipt schedule in invoice details 請求書明細入金予定表示.<p>
	 *
	 */
	public MCCheckBox Hdr_bfw_bal_disp_flg = null;
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
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_upri_dec_place = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Hdr_wrk_no_p_PPanel;
	public MCTextField Hdr_wrk_no;	// [Hdr]の[wrk_no_p.wrk_no]を[Hdr_wrk_no]としてエイリアス定義。
	public MCTextField Hdr_wrk_nm;	// [Hdr]の[wrk_no_p.wrk_nm]を[Hdr_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_sls_amt_p_PPanel;
	public MCNumberField Hdr_sls_amt;	// [Hdr]の[sls_amt_p.amt]を[Hdr_sls_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ret_amt_p_PPanel;
	public MCNumberField Hdr_ret_amt;	// [Hdr]の[ret_amt_p.amt]を[Hdr_ret_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_dscnt_amt_p_PPanel;
	public MCNumberField Hdr_dscnt_amt;	// [Hdr]の[dscnt_amt_p.amt]を[Hdr_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_tax_amt_p_PPanel;
	public MCNumberField Hdr_tax_amt;	// [Hdr]の[tax_amt_p.amt]を[Hdr_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_sw_to_amt_p_PPanel;
	public MCNumberField Hdr_sw_to_amt;	// [Hdr]の[sw_to_amt_p.amt]を[Hdr_sw_to_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_rcv_schd_amt_total_p_PPanel;
	public MCNumberField Hdr_rcv_schd_amt_total;	// [Hdr]の[rcv_schd_amt_total_p.amt]を[Hdr_rcv_schd_amt_total]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_rcv_act_amt_total_p_PPanel;
	public MCNumberField Hdr_rcv_act_amt_total;	// [Hdr]の[rcv_act_amt_total_p.amt]を[Hdr_rcv_act_amt_total]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_rcv_schd_amt_bal_p_PPanel;
	public MCNumberField Hdr_rcv_schd_amt_bal;	// [Hdr]の[rcv_schd_amt_bal_p.amt]を[Hdr_rcv_schd_amt_bal]としてエイリアス定義。
	/**
	 * Payment receipt schedule adjusted 入金予定調整済.<p>
	 *
	 */
	public MCCheckBox Hdr_rcv_schd_adjst_flg = null;
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_bill_mng_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_upd_cntr = null;
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
	// [Test]ブロック関連のField定義
	public MCPanel TestPanel = null;
	// [Test]ブロックの項目のField定義
	// [RcvSchdDtl]ブロック関連のField定義
	public MCPanel RcvSchdDtlPanel = null;
	// [RcvSchdDtl]ブロックの項目のField定義
	// [Dtl1]ブロック関連のField定義
	public MCPanel Dtl1Panel = null;
	public MCTitledBorder Dtl1TitledBorder = null;
	public MCScrollPane Dtl1ScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0080.Dtl1R> Dtl1Table = null;
	// [Dtl1]ブロックの項目のField定義
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rcv_schd_dt = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rcv_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rcv_nm = null;
	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rcv_typ = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_rcv_schd_amt_p_PPanel;
	public MCColumnConfig columnDtl1_rcv_schd_amt;// [Dtl1]の[rcv_schd_amt_p.amt]を[columnDtl1_rcv_schd_amt]としてエイリアス定義。
	/**
	 * Payment receipt schedule No. 入金予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rcv_schd_no = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char3 = null;
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
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCTitledBorder Dtl2TitledBorder = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0080.Dtl2R> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcv_schd_dt = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcv_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcv_nm = null;
	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcv_typ = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_rcv_schd_amt_p_PPanel;
	public MCColumnConfig columnDtl2_rcv_schd_amt;// [Dtl2]の[rcv_schd_amt_p.amt]を[columnDtl2_rcv_schd_amt]としてエイリアス定義。
	/**
	 * Payment receipt schedule No. 入金予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcv_schd_no = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char3 = null;
	// [Dtl2Btn]ブロック関連のField定義
	public MCPanel Dtl2BtnPanel = null;
	// [Dtl2Btn]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Dtl2Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Dtl2Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Dtl2Btn_rcopy = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Dtl2Btn_schd_amt_ttl_p_PPanel;
	public MCNumberField Dtl2Btn_schd_amt_ttl;	// [Dtl2Btn]の[schd_amt_ttl_p.amt]を[Dtl2Btn_schd_amt_ttl]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Dtl2Btn_schd_amt_diff_p_PPanel;
	public MCNumberField Dtl2Btn_schd_amt_diff;	// [Dtl2Btn]の[schd_amt_diff_p.amt]を[Dtl2Btn_schd_amt_diff]としてエイリアス定義。
	// [Dtl3]ブロック関連のField定義
	public MCPanel Dtl3Panel = null;
	public MCTitledBorder Dtl3TitledBorder = null;
	public MCScrollPane Dtl3ScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0080.Dtl3R> Dtl3Table = null;
	// [Dtl3]ブロックの項目のField定義
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_rcv_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_rcv_nm = null;
	/**
	 * Actual payment received date 入金実績日.<p>
	 *
	 */
	public MCColumnConfig columnDtl3_rcv_act_dt = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl3_rcv_act_amt_p_PPanel;
	public MCColumnConfig columnDtl3_rcv_act_amt;// [Dtl3]の[rcv_act_amt_p.amt]を[columnDtl3_rcv_act_amt]としてエイリアス定義。
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{REF, UPD};
	
	/** [MS_MSBGL0080_Srch01]のCallerの作成 */
	protected MSBGP_RcvSchdAdjstReg_MC.MS_MSBGL0080_Srch01Caller createMS_MSBGL0080_Srch01() {
		MSBGP_RcvSchdAdjstReg_MC.MS_MSBGL0080_Srch01Caller<MSBGP_RcvSchdAdjstReg, MS_MSBGL0080_Srch01Bridge>
		caller = ((MSBGP_RcvSchdAdjstReg_MC)this).new MS_MSBGL0080_Srch01Caller<MSBGP_RcvSchdAdjstReg, MS_MSBGL0080_Srch01Bridge>(
					(MSBGP_RcvSchdAdjstReg)this, new MS_MSBGL0080_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0080_Srch01]の呼び出し */
	protected void callMS_MSBGL0080_Srch01() {
		MCCaller caller = createMS_MSBGL0080_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0080_Upd01]のCallerの作成 */
	protected MSBGP_RcvSchdAdjstReg_MC.MS_MSBGL0080_Upd01Caller createMS_MSBGL0080_Upd01() {
		MSBGP_RcvSchdAdjstReg_MC.MS_MSBGL0080_Upd01Caller<MSBGP_RcvSchdAdjstReg, MS_MSBGL0080_Upd01Bridge>
		caller = ((MSBGP_RcvSchdAdjstReg_MC)this).new MS_MSBGL0080_Upd01Caller<MSBGP_RcvSchdAdjstReg, MS_MSBGL0080_Upd01Bridge>(
					(MSBGP_RcvSchdAdjstReg)this, new MS_MSBGL0080_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBGL0080_Upd01]の呼び出し */
	protected void callMS_MSBGL0080_Upd01() {
		MCCaller caller = createMS_MSBGL0080_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0080.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0080.HdrR aHdrR;
	/** [Dtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0080.Dtl1R> aDtl1L;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0080.Dtl2R> aDtl2L;
	/** [Dtl2Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0080.Dtl2BtnR aDtl2BtnR;
	/** [Dtl3]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0080.Dtl3R> aDtl3L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0080.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0080.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0080.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0080.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBG.MSBGP0080.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0080.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBG.MSBGP0080.HdrR createHdrR() {
		return mcframe.clientMSBG.MSBGP0080.HdrR.create();
	}

	/**
	 * コピーによってaDtl1Lを設定します。
	 *
	 * aDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1L
	 */
	public void setDtl1L(MCList<mcframe.clientMSBG.MSBGP0080.Dtl1R> aList) {
		if (getDtl1L() != aList) {
			getDtl1L().setAll(aList);
		}
	}

	/**
	 * [Dtl1]ブロックのコンテナaDtl1Lを返します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0080.Dtl1R> getDtl1L() {
		return aDtl1L;
	}

	/**
	 * aDtl1Rを作成します。
	 *
	 * @return Dtl1R
	 */
	public mcframe.clientMSBG.MSBGP0080.Dtl1R createDtl1R() {
		return mcframe.clientMSBG.MSBGP0080.Dtl1R.create();
	}

	/**
	 * aDtl1Lを作成します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0080.Dtl1R> createDtl1L() {
		return MCList.create(mcframe.clientMSBG.MSBGP0080.Dtl1R.class);
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
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMSBG.MSBGP0080.Dtl2R> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0080.Dtl2R> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMSBG.MSBGP0080.Dtl2R createDtl2R() {
		return mcframe.clientMSBG.MSBGP0080.Dtl2R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0080.Dtl2R> createDtl2L() {
		return MCList.create(mcframe.clientMSBG.MSBGP0080.Dtl2R.class);
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
	 * 項目コピーによってaDtl2BtnRを設定します。
	 *
	 * aDtl2BtnRのインスタンスは変更されません。
	 *
	 * @param row Dtl2BtnR
	 */
	public void setDtl2BtnR(mcframe.clientMSBG.MSBGP0080.Dtl2BtnR row) {
		if (row != null) {
			MCRow.copyall(getDtl2BtnR(), row);
		}
	}

	/**
	 * [Dtl2Btn]ブロックのコンテナaDtl2BtnRを返します。
	 *
	 * @return Dtl2BtnR
	 */
	public mcframe.clientMSBG.MSBGP0080.Dtl2BtnR getDtl2BtnR() {
		return aDtl2BtnR;
	}

	/**
	 * aDtl2BtnRを作成します。
	 *
	 * @return Dtl2BtnR
	 */
	public mcframe.clientMSBG.MSBGP0080.Dtl2BtnR createDtl2BtnR() {
		return mcframe.clientMSBG.MSBGP0080.Dtl2BtnR.create();
	}

	/**
	 * コピーによってaDtl3Lを設定します。
	 *
	 * aDtl3Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl3L
	 */
	public void setDtl3L(MCList<mcframe.clientMSBG.MSBGP0080.Dtl3R> aList) {
		if (getDtl3L() != aList) {
			getDtl3L().setAll(aList);
		}
	}

	/**
	 * [Dtl3]ブロックのコンテナaDtl3Lを返します。
	 *
	 * @return Dtl3L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0080.Dtl3R> getDtl3L() {
		return aDtl3L;
	}

	/**
	 * aDtl3Rを作成します。
	 *
	 * @return Dtl3R
	 */
	public mcframe.clientMSBG.MSBGP0080.Dtl3R createDtl3R() {
		return mcframe.clientMSBG.MSBGP0080.Dtl3R.create();
	}

	/**
	 * aDtl3Lを作成します。
	 *
	 * @return Dtl3L
	 */
	public MCList<mcframe.clientMSBG.MSBGP0080.Dtl3R> createDtl3L() {
		return MCList.create(mcframe.clientMSBG.MSBGP0080.Dtl3R.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtl1L())) ret.add(getDtl1L());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
		if(!MCCollectionUtil.contains(ret, getDtl2BtnR())) ret.add(getDtl2BtnR());
		if(!MCCollectionUtil.contains(ret, getDtl3L())) ret.add(getDtl3L());
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
		if(aCnt == getDtl2L()) return "Dtl2";
		if(aCnt == getDtl2BtnR()) return "Dtl2Btn";
		if(aCnt == getDtl3L()) return "Dtl3";
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
		if(bId.equals("Dtl2")) return getDtl2L();
		if(bId.equals("Dtl2Btn")) return getDtl2BtnR();
		if(bId.equals("Dtl3")) return getDtl3L();
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
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(TestPanel);
		ret.add(RcvSchdDtlPanel);
		ret.add(Dtl1Panel);
		ret.add(WrkPanel);
		ret.add(Dtl2Panel);
		ret.add(Dtl2BtnPanel);
		ret.add(Dtl3Panel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_RcvSchdAdjstReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		aDtl2L = createDtl2L();
		aDtl2BtnR = createDtl2BtnR();
		aDtl3L = createDtl3L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_RcvSchdAdjstReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		createDtl1Table();
		Dtl1Table.setRowName(name);
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
		aDtl2BtnR = createDtl2BtnR();
		aDtl3L = createDtl3L();
		createDtl3Table();
		Dtl3Table.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_RcvSchdAdjstReg_MC.jbCreateScreenOpe((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateCnd((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateHdrTab((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateHdr((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateHdr2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateTest((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateRcvSchdDtl((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateDtl1((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateWrk((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateDtl2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateDtl2Btn((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateDtl3((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbCreateBtn((MSBGP_RcvSchdAdjstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBGP_RcvSchdAdjstReg p) {
		p.Hdr_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getHdrR().wrk_no_p());
		p.Hdr_wrk_no_p_PPanel.setName("Hdr.wrk_no_p");
		p.Hdr_wrk_no = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Hdr_wrk_no.addAliasName("Hdr.wrk_no", p);
		p.Hdr_wrk_nm = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Hdr_wrk_nm.addAliasName("Hdr.wrk_nm", p);
		p.Hdr_sls_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().sls_amt_p());
		p.Hdr_sls_amt_p_PPanel.setName("Hdr.sls_amt_p");
		p.Hdr_sls_amt = p.Hdr_sls_amt_p_PPanel.Amt_amt;
		p.Hdr_sls_amt.addAliasName("Hdr.sls_amt", p);
		p.Hdr_ret_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ret_amt_p());
		p.Hdr_ret_amt_p_PPanel.setName("Hdr.ret_amt_p");
		p.Hdr_ret_amt = p.Hdr_ret_amt_p_PPanel.Amt_amt;
		p.Hdr_ret_amt.addAliasName("Hdr.ret_amt", p);
		p.Hdr_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().dscnt_amt_p());
		p.Hdr_dscnt_amt_p_PPanel.setName("Hdr.dscnt_amt_p");
		p.Hdr_dscnt_amt = p.Hdr_dscnt_amt_p_PPanel.Amt_amt;
		p.Hdr_dscnt_amt.addAliasName("Hdr.dscnt_amt", p);
		p.Hdr_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().tax_amt_p());
		p.Hdr_tax_amt_p_PPanel.setName("Hdr.tax_amt_p");
		p.Hdr_tax_amt = p.Hdr_tax_amt_p_PPanel.Amt_amt;
		p.Hdr_tax_amt.addAliasName("Hdr.tax_amt", p);
		p.Hdr_sw_to_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().sw_to_amt_p());
		p.Hdr_sw_to_amt_p_PPanel.setName("Hdr.sw_to_amt_p");
		p.Hdr_sw_to_amt = p.Hdr_sw_to_amt_p_PPanel.Amt_amt;
		p.Hdr_sw_to_amt.addAliasName("Hdr.sw_to_amt", p);
		p.Hdr_rcv_schd_amt_total_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().rcv_schd_amt_total_p());
		p.Hdr_rcv_schd_amt_total_p_PPanel.setName("Hdr.rcv_schd_amt_total_p");
		p.Hdr_rcv_schd_amt_total = p.Hdr_rcv_schd_amt_total_p_PPanel.Amt_amt;
		p.Hdr_rcv_schd_amt_total.addAliasName("Hdr.rcv_schd_amt_total", p);
		p.Hdr_rcv_act_amt_total_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().rcv_act_amt_total_p());
		p.Hdr_rcv_act_amt_total_p_PPanel.setName("Hdr.rcv_act_amt_total_p");
		p.Hdr_rcv_act_amt_total = p.Hdr_rcv_act_amt_total_p_PPanel.Amt_amt;
		p.Hdr_rcv_act_amt_total.addAliasName("Hdr.rcv_act_amt_total", p);
		p.Hdr_rcv_schd_amt_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().rcv_schd_amt_bal_p());
		p.Hdr_rcv_schd_amt_bal_p_PPanel.setName("Hdr.rcv_schd_amt_bal_p");
		p.Hdr_rcv_schd_amt_bal = p.Hdr_rcv_schd_amt_bal_p_PPanel.Amt_amt;
		p.Hdr_rcv_schd_amt_bal.addAliasName("Hdr.rcv_schd_amt_bal", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 * [Test]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTest(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 * [RcvSchdDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvSchdDtl(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 * [Dtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1(MSBGP_RcvSchdAdjstReg p) {
		p.Dtl1_rcv_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0080.Dtl1R.$rcv_schd_amt_p);
		p.Dtl1_rcv_schd_amt_p_PPanel.setName("Dtl1.rcv_schd_amt_p");
		p.columnDtl1_rcv_schd_amt = p.Dtl1_rcv_schd_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_rcv_schd_amt.addAliasName("Dtl1.rcv_schd_amt", p);
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MSBGP_RcvSchdAdjstReg p) {
		p.Dtl2_rcv_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0080.Dtl2R.$rcv_schd_amt_p);
		p.Dtl2_rcv_schd_amt_p_PPanel.setName("Dtl2.rcv_schd_amt_p");
		p.columnDtl2_rcv_schd_amt = p.Dtl2_rcv_schd_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_rcv_schd_amt.addAliasName("Dtl2.rcv_schd_amt", p);
	}

	/**
	 * [Dtl2Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2Btn(MSBGP_RcvSchdAdjstReg p) {
		p.Dtl2Btn_schd_amt_ttl_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getDtl2BtnR().schd_amt_ttl_p());
		p.Dtl2Btn_schd_amt_ttl_p_PPanel.setName("Dtl2Btn.schd_amt_ttl_p");
		p.Dtl2Btn_schd_amt_ttl = p.Dtl2Btn_schd_amt_ttl_p_PPanel.Amt_amt;
		p.Dtl2Btn_schd_amt_ttl.addAliasName("Dtl2Btn.schd_amt_ttl", p);
		p.Dtl2Btn_schd_amt_diff_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getDtl2BtnR().schd_amt_diff_p());
		p.Dtl2Btn_schd_amt_diff_p_PPanel.setName("Dtl2Btn.schd_amt_diff_p");
		p.Dtl2Btn_schd_amt_diff = p.Dtl2Btn_schd_amt_diff_p_PPanel.Amt_amt;
		p.Dtl2Btn_schd_amt_diff.addAliasName("Dtl2Btn.schd_amt_diff", p);
	}

	/**
	 * [Dtl3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl3(MSBGP_RcvSchdAdjstReg p) {
		p.Dtl3_rcv_act_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0080.Dtl3R.$rcv_act_amt_p);
		p.Dtl3_rcv_act_amt_p_PPanel.setName("Dtl3.rcv_act_amt_p");
		p.columnDtl3_rcv_act_amt = p.Dtl3_rcv_act_amt_p_PPanel.columnAmt_amt;
		p.columnDtl3_rcv_act_amt.addAliasName("Dtl3.rcv_act_amt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_RcvSchdAdjstReg p) {
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

	
	/** [Dtl2_rcv_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_rcv_cd_p = null;

	/**
	 * [Dtl2_rcv_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_rcv_cd_ListPutter() {
		if (Dtl2_rcv_cd_p == null) {
			Dtl2_rcv_cd_p = createDtl2_rcv_cd_ListPutter(columnDtl2_rcv_cd, "rcv_cd", "rcv_nm","rcv_typ");

		}
		return Dtl2_rcv_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvSchdAdjstReg create(){
		MSBGP_RcvSchdAdjstReg p = new MSBGP_RcvSchdAdjstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvSchdAdjstReg create(String name){
		MSBGP_RcvSchdAdjstReg p = new MSBGP_RcvSchdAdjstReg(name);
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
		MSBGP_RcvSchdAdjstReg_MC.jbfInitScreenOpe((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitCnd((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitHdrTab((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitHdr((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitHdr2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitTest((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitRcvSchdDtl((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitDtl1((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitWrk((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitDtl2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitDtl2Btn((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitDtl3((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbfInitBtn((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitScreenOpe((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitCnd((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitHdrTab((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitHdr((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitHdr2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitTest((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitRcvSchdDtl((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitDtl1((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitWrk((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitDtl2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitDtl2Btn((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitDtl3((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.jbInitBtn((MSBGP_RcvSchdAdjstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_bill_no_Label = p.beansFactory.createLabel("Cnd.bill_no_Label");
		p.Cnd_bill_no = p.beansFactory.createTextField("Cnd.bill_no");
		p.Cnd_bill_no.setLabel(p.Cnd_bill_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_bill_ym_Label = p.beansFactory.createLabel("Hdr.bill_ym_Label");
		p.Hdr_bill_ym = p.beansFactory.createDateField("Hdr.bill_ym");
		p.Hdr_bill_ym.setLabel(p.Hdr_bill_ym_Label);
		p.Hdr_bill_cl_day_Label = p.beansFactory.createLabel("Hdr.bill_cl_day_Label");
		p.Hdr_bill_cl_day = p.beansFactory.createNumberField("Hdr.bill_cl_day");
		p.Hdr_bill_cl_day.setLabel(p.Hdr_bill_cl_day_Label);
		p.Hdr_iv_no_Label = p.beansFactory.createLabel("Hdr.iv_no_Label");
		p.Hdr_iv_no = p.beansFactory.createTextField("Hdr.iv_no");
		p.Hdr_iv_no.setLabel(p.Hdr_iv_no_Label);
		p.Hdr_prnt_flg = p.beansFactory.createCheckBox("Hdr.prnt_flg");
		p.Hdr_bfw_bal_disp_flg = p.beansFactory.createCheckBox("Hdr.bfw_bal_disp_flg");
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
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextField("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_amt_dec_place = p.beansFactory.createNumberField("Hdr.amt_dec_place");
		p.Hdr_upri_dec_place = p.beansFactory.createNumberField("Hdr.upri_dec_place");
		p.Hdr_rcv_schd_adjst_flg = p.beansFactory.createCheckBox("Hdr.rcv_schd_adjst_flg");
		p.Hdr_bill_mng_no = p.beansFactory.createTextField("Hdr.bill_mng_no");
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
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
	protected static void jbfInitHdr2(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Test]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTest(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.TestPanel = p.beansFactory.createPanel("Test");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvSchdDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvSchdDtl(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.RcvSchdDtlPanel = p.beansFactory.createPanel("RcvSchdDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel = p.beansFactory.createPanel("Dtl1");
		p.Dtl1TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl1ScrollPane = p.beansFactory.createScrollPane("Dtl1.scroll");
		p.createDtl1Table();
		// ブロックの項目の初期化
		p.columnDtl1_rcv_schd_dt = p.beansFactory.createTableColumn("Dtl1.rcv_schd_dt", MCColumnType.DATE);
		p.columnDtl1_rcv_cd = p.beansFactory.createTableColumn("Dtl1.rcv_cd", MCColumnType.TEXT);
		p.columnDtl1_rcv_nm = p.beansFactory.createTableColumn("Dtl1.rcv_nm", MCColumnType.TEXT);
		p.columnDtl1_rcv_typ = p.beansFactory.createTableColumn("Dtl1.rcv_typ", MCColumnType.TEXT);
		p.columnDtl1_rcv_schd_no = p.beansFactory.createTableColumn("Dtl1.rcv_schd_no", MCColumnType.TEXT);
		p.columnDtl1_sub_char1 = p.beansFactory.createTableColumn("Dtl1.sub_char1", MCColumnType.TEXT);
		p.columnDtl1_sub_char2 = p.beansFactory.createTableColumn("Dtl1.sub_char2", MCColumnType.TEXT);
		p.columnDtl1_sub_char3 = p.beansFactory.createTableColumn("Dtl1.sub_char3", MCColumnType.TEXT);
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
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_rcv_schd_dt = p.beansFactory.createTableColumn("Dtl2.rcv_schd_dt", MCColumnType.DATE);
		p.columnDtl2_rcv_cd = p.beansFactory.createTableColumn("Dtl2.rcv_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_rcv_nm = p.beansFactory.createTableColumn("Dtl2.rcv_nm", MCColumnType.TEXT);
		p.columnDtl2_rcv_typ = p.beansFactory.createTableColumn("Dtl2.rcv_typ", MCColumnType.TEXT);
		p.columnDtl2_rcv_schd_no = p.beansFactory.createTableColumn("Dtl2.rcv_schd_no", MCColumnType.TEXT);
		p.columnDtl2_sub_char1 = p.beansFactory.createTableColumn("Dtl2.sub_char1", MCColumnType.TEXT);
		p.columnDtl2_sub_char2 = p.beansFactory.createTableColumn("Dtl2.sub_char2", MCColumnType.TEXT);
		p.columnDtl2_sub_char3 = p.beansFactory.createTableColumn("Dtl2.sub_char3", MCColumnType.TEXT);
	}

	/**
	 * [Dtl2Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2Btn(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.Dtl2BtnPanel = p.beansFactory.createPanel("Dtl2Btn");
		// ブロックの項目の初期化
		p.Dtl2Btn_radd = p.beansFactory.createButton("Dtl2Btn.radd", "no_border");
		p.Dtl2Btn_rdel = p.beansFactory.createButton("Dtl2Btn.rdel", "no_border");
		p.Dtl2Btn_rcopy = p.beansFactory.createButton("Dtl2Btn.rcopy", "no_border");
	}

	/**
	 * [Dtl3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl3(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.Dtl3Panel = p.beansFactory.createPanel("Dtl3");
		p.Dtl3TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl3ScrollPane = p.beansFactory.createScrollPane("Dtl3.scroll");
		p.createDtl3Table();
		// ブロックの項目の初期化
		p.columnDtl3_rcv_cd = p.beansFactory.createTableColumn("Dtl3.rcv_cd", MCColumnType.TEXT);
		p.columnDtl3_rcv_nm = p.beansFactory.createTableColumn("Dtl3.rcv_nm", MCColumnType.TEXT);
		p.columnDtl3_rcv_act_dt = p.beansFactory.createTableColumn("Dtl3.rcv_act_dt", MCColumnType.DATE);
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
	protected static void jbfInitBtn(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_RcvSchdAdjstReg p) {
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
	protected static void jbInitCnd(MSBGP_RcvSchdAdjstReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0080.CndR.ope_META);
		p.CndPanel.add(p.Cnd_bill_no_Label);
		p.CndPanel.add(p.Cnd_bill_no);
		p.CndPanel.setLastBeans(p.Cnd_bill_no);
		p.Cnd_bill_no.setNextBeans(p.Cnd_srch);
		p.Cnd_bill_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0080.CndR.bill_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.TestPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_bill_ym_Label);
		p.HdrPanel.add(p.Hdr_bill_ym);
		p.HdrPanel.setLastBeans(p.Hdr_bill_ym);
		p.Hdr_bill_ym.setNextBeans(p.Hdr_bill_cl_day);
		p.Hdr_bill_ym.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.bill_ym_META);
		p.Hdr_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_bill_cl_day_Label);
		p.HdrPanel.add(p.Hdr_bill_cl_day);
		p.Hdr_bill_cl_day.setNextBeans(p.Hdr_iv_no);
		p.Hdr_bill_cl_day.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.bill_cl_day_META);
		p.HdrPanel.add(p.Hdr_iv_no_Label);
		p.HdrPanel.add(p.Hdr_iv_no);
		p.Hdr_iv_no.setNextBeans(p.Hdr_prnt_flg);
		p.Hdr_iv_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.iv_no_META);
		p.HdrPanel.add(p.Hdr_prnt_flg);
		p.Hdr_prnt_flg.setNextBeans(p.Hdr_bfw_bal_disp_flg);
		p.Hdr_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.prnt_flg_META);
		p.HdrPanel.add(p.Hdr_bfw_bal_disp_flg);
		p.Hdr_bfw_bal_disp_flg.setNextBeans(p.Hdr_bill_dpt_cd);
		p.Hdr_bfw_bal_disp_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.bfw_bal_disp_flg_META);
		p.HdrPanel.add(p.Hdr_bill_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_bill_dpt_cd);
		p.Hdr_bill_dpt_cd.setNextBeans(p.Hdr_bill_dpt_nm);
		p.Hdr_bill_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.bill_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_bill_dpt_nm);
		p.Hdr_bill_dpt_nm.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_bill_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.bill_dpt_nm_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_bcst_cd);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_bcst_cd_Label);
		p.HdrPanel.add(p.Hdr_bcst_cd);
		p.Hdr_bcst_cd.setNextBeans(p.Hdr_bcst_nm);
		p.Hdr_bcst_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.bcst_cd_META);
		p.HdrPanel.add(p.Hdr_bcst_nm);
		p.Hdr_bcst_nm.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_bcst_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.bcst_nm_META);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_amt_dec_place);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_amt_dec_place);
		p.Hdr_amt_dec_place.setNextBeans(p.Hdr_upri_dec_place);
		p.Hdr_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_upri_dec_place);
		p.Hdr_upri_dec_place.setNextBeans(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_wrk_no_p_PPanel.setNextBeans(p.Hdr_sls_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_sls_amt_p_PPanel);
		p.Hdr_sls_amt_p_PPanel.setNextBeans(p.Hdr_ret_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_ret_amt_p_PPanel);
		p.Hdr_ret_amt_p_PPanel.setNextBeans(p.Hdr_dscnt_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_dscnt_amt_p_PPanel);
		p.Hdr_dscnt_amt_p_PPanel.setNextBeans(p.Hdr_tax_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_tax_amt_p_PPanel);
		p.Hdr_tax_amt_p_PPanel.setNextBeans(p.Hdr_sw_to_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_sw_to_amt_p_PPanel);
		p.Hdr_sw_to_amt_p_PPanel.setNextBeans(p.Hdr_rcv_schd_amt_total_p_PPanel);
		p.HdrPanel.add(p.Hdr_rcv_schd_amt_total_p_PPanel);
		p.Hdr_rcv_schd_amt_total_p_PPanel.setNextBeans(p.Hdr_rcv_act_amt_total_p_PPanel);
		p.HdrPanel.add(p.Hdr_rcv_act_amt_total_p_PPanel);
		p.Hdr_rcv_act_amt_total_p_PPanel.setNextBeans(p.Hdr_rcv_schd_amt_bal_p_PPanel);
		p.HdrPanel.add(p.Hdr_rcv_schd_amt_bal_p_PPanel);
		p.Hdr_rcv_schd_amt_bal_p_PPanel.setNextBeans(p.Hdr_rcv_schd_adjst_flg);
		p.HdrPanel.add(p.Hdr_rcv_schd_adjst_flg);
		p.Hdr_rcv_schd_adjst_flg.setNextBeans(p.Hdr_bill_mng_no);
		p.Hdr_rcv_schd_adjst_flg.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.rcv_schd_adjst_flg_META);
		p.HdrPanel.add(p.Hdr_bill_mng_no);
		p.Hdr_bill_mng_no.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_bill_mng_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.bill_mng_no_META);
		p.HdrPanel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.upd_cntr_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBG.MSBGP0080.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Test]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTest(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.add(p.TestPanel);
		p.TestPanel.setNextBeans(p.Dtl3Panel);
		p.TestPanel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.TestPanel.add(p.RcvSchdDtlPanel, null);
		p.TestPanel.setLastBeans(p.RcvSchdDtlPanel);
		p.RcvSchdDtlPanel.setNextBeans(p.WrkPanel);
		p.TestPanel.add(p.WrkPanel, null);
	}

	/**
	 * [RcvSchdDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvSchdDtl(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.RcvSchdDtlPanel.setLayoutPosition("CLC+");
		// ブロックの項目の初期化
		p.RcvSchdDtlPanel.add(p.Dtl1Panel, null);
		p.RcvSchdDtlPanel.setLastBeans(p.Dtl1Panel);
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel.setBorder(p.Dtl1TitledBorder);
		p.Dtl1Panel.add(p.Dtl1ScrollPane);
		p.Dtl1Panel.setLastBeans(p.Dtl1Table);
		p.Dtl1ScrollPane.setViewportView(p.Dtl1Table);
		p.Dtl1Table.setList(p.getDtl1L());
		p.Dtl1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.WrkPanel.setLayoutPosition("CRC+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.Dtl2Panel, null);
		p.WrkPanel.setLastBeans(p.Dtl2Panel);
		p.Dtl2Panel.setNextBeans(p.Dtl2BtnPanel);
		p.WrkPanel.add(p.Dtl2BtnPanel, null);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel.setBorder(p.Dtl2TitledBorder);
		p.Dtl2Panel.add(p.Dtl2ScrollPane);
		p.Dtl2Panel.setLastBeans(p.Dtl2Table);
		p.Dtl2ScrollPane.setViewportView(p.Dtl2Table);
		p.Dtl2Table.setList(p.getDtl2L());
		p.Dtl2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2Btn(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.Dtl2BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Dtl2Btn_radd.setIcon("INSERT_RECORD");
		p.Dtl2Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Dtl2BtnPanel.add(p.Dtl2Btn_radd);
		p.Dtl2BtnPanel.setLastBeans(p.Dtl2Btn_radd);
		p.Dtl2Btn_radd.setNextBeans(p.Dtl2Btn_rdel);
		p.Dtl2Btn_rdel.setIcon("DELETE_RECORD");
		p.Dtl2Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Dtl2BtnPanel.add(p.Dtl2Btn_rdel);
		p.Dtl2Btn_rdel.setNextBeans(p.Dtl2Btn_rcopy);
		p.Dtl2Btn_rcopy.setIcon("COPY_RECORD");
		p.Dtl2Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Dtl2BtnPanel.add(p.Dtl2Btn_rcopy);
		p.Dtl2Btn_rcopy.setNextBeans(p.Dtl2Btn_schd_amt_ttl_p_PPanel);
		p.Dtl2BtnPanel.add(p.Dtl2Btn_schd_amt_ttl_p_PPanel);
		p.Dtl2Btn_schd_amt_ttl_p_PPanel.setNextBeans(p.Dtl2Btn_schd_amt_diff_p_PPanel);
		p.Dtl2BtnPanel.add(p.Dtl2Btn_schd_amt_diff_p_PPanel);
		p.Dtl2Btn_schd_amt_diff_p_PPanel.Amt_amt.setMinusEnable(true);
	}

	/**
	 * [Dtl3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl3(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.Dtl3Panel.setBorder(p.Dtl3TitledBorder);
		p.add(p.Dtl3Panel);
		p.Dtl3Panel.setNextBeans(p.BtnPanel);
		p.Dtl3Panel.add(p.Dtl3ScrollPane);
		p.Dtl3Panel.setLastBeans(p.Dtl3Table);
		p.Dtl3ScrollPane.setViewportView(p.Dtl3Table);
		p.Dtl3Table.setList(p.getDtl3L());
		p.Dtl3Panel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_RcvSchdAdjstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
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
		MSBGP_RcvSchdAdjstReg_MC.mcInitScreenOpe((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitCnd((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitHdrTab((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitHdr((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitHdr2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitTest((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitRcvSchdDtl((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitDtl1((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitWrk((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitDtl2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitDtl2Btn((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitDtl3((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.mcInitBtn((MSBGP_RcvSchdAdjstReg)this);

		// [REF]ステータスのモードの設定
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_ScreenOpe((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Cnd((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_HdrTab((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Hdr((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Hdr2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Test((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_RcvSchdDtl((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Dtl1((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Wrk((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Dtl2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Dtl2Btn((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Dtl3((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitREF_Btn((MSBGP_RcvSchdAdjstReg)this);

		// [UPD]ステータスのモードの設定
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_ScreenOpe((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Cnd((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_HdrTab((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Hdr((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Hdr2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Test((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_RcvSchdDtl((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Dtl1((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Wrk((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Dtl2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Dtl2Btn((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Dtl3((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.statusInitUPD_Btn((MSBGP_RcvSchdAdjstReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_RcvSchdAdjstReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_bill_no.setListListener(p);
		p.Cnd_bill_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBGP_RcvSchdAdjstReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBGP_RcvSchdAdjstReg p) {
		p.Hdr_bill_ym.setListListener(p);
		p.Hdr_bill_ym.addAllListener(p);
		p.Hdr_bill_cl_day.setListListener(p);
		p.Hdr_bill_cl_day.addAllListener(p);
		p.Hdr_iv_no.setListListener(p);
		p.Hdr_iv_no.addAllListener(p);
		p.Hdr_prnt_flg.addAllListener(p);
		p.Hdr_bfw_bal_disp_flg.addAllListener(p);
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
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_amt_dec_place.setListListener(p);
		p.Hdr_amt_dec_place.addAllListener(p);
		p.Hdr_upri_dec_place.setListListener(p);
		p.Hdr_upri_dec_place.addAllListener(p);
		p.Hdr_rcv_schd_adjst_flg.addAllListener(p);
		p.Hdr_bill_mng_no.setListListener(p);
		p.Hdr_bill_mng_no.addAllListener(p);
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
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
	protected static void mcInitHdr2(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 *  [Test]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTest(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 *  [RcvSchdDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvSchdDtl(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 *  [Dtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1(MSBGP_RcvSchdAdjstReg p) {
		p.Dtl1Table.addAllListener(p);
		p.columnDtl1_rcv_schd_dt.addAllListener(p);
		p.columnDtl1_rcv_schd_dt.setListListener(p);
		p.columnDtl1_rcv_cd.addAllListener(p);
		p.columnDtl1_rcv_cd.setListListener(p);
		p.columnDtl1_rcv_nm.addAllListener(p);
		p.columnDtl1_rcv_nm.setListListener(p);
		p.columnDtl1_rcv_typ.addAllListener(p);
		p.columnDtl1_rcv_typ.setListListener(p);
		p.columnDtl1_rcv_schd_no.addAllListener(p);
		p.columnDtl1_rcv_schd_no.setListListener(p);
		p.columnDtl1_sub_char1.addAllListener(p);
		p.columnDtl1_sub_char1.setListListener(p);
		p.columnDtl1_sub_char2.addAllListener(p);
		p.columnDtl1_sub_char2.setListListener(p);
		p.columnDtl1_sub_char3.addAllListener(p);
		p.columnDtl1_sub_char3.setListListener(p);
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
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MSBGP_RcvSchdAdjstReg p) {
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MSBGP_RcvSchdAdjstReg p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_rcv_schd_dt.addAllListener(p);
		p.columnDtl2_rcv_schd_dt.setListListener(p);
		p.columnDtl2_rcv_cd.addAllListener(p);
		p.columnDtl2_rcv_cd.setListListener(p);
		p.columnDtl2_rcv_nm.addAllListener(p);
		p.columnDtl2_rcv_nm.setListListener(p);
		p.columnDtl2_rcv_typ.addAllListener(p);
		p.columnDtl2_rcv_typ.setListListener(p);
		p.columnDtl2_rcv_schd_no.addAllListener(p);
		p.columnDtl2_rcv_schd_no.setListListener(p);
		p.columnDtl2_sub_char1.addAllListener(p);
		p.columnDtl2_sub_char1.setListListener(p);
		p.columnDtl2_sub_char2.addAllListener(p);
		p.columnDtl2_sub_char2.setListListener(p);
		p.columnDtl2_sub_char3.addAllListener(p);
		p.columnDtl2_sub_char3.setListListener(p);
	}

	/**
	 *  [Dtl2Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2Btn(MSBGP_RcvSchdAdjstReg p) {
		p.Dtl2Btn_radd.addAllListener(p);
		p.Dtl2Btn_radd.setAPMethodName("doDtl2Btn_radd");
		p.Dtl2Btn_rdel.addAllListener(p);
		p.Dtl2Btn_rdel.setAPMethodName("doDtl2Btn_rdel");
		p.Dtl2Btn_rcopy.addAllListener(p);
		p.Dtl2Btn_rcopy.setAPMethodName("doDtl2Btn_rcopy");
	}

	/**
	 *  [Dtl3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl3(MSBGP_RcvSchdAdjstReg p) {
		p.Dtl3Table.addAllListener(p);
		p.columnDtl3_rcv_cd.addAllListener(p);
		p.columnDtl3_rcv_cd.setListListener(p);
		p.columnDtl3_rcv_nm.addAllListener(p);
		p.columnDtl3_rcv_nm.setListListener(p);
		p.columnDtl3_rcv_act_dt.addAllListener(p);
		p.columnDtl3_rcv_act_dt.setListListener(p);
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
	protected static void mcInitBtn(MSBGP_RcvSchdAdjstReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_RcvSchdAdjstReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bill_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBGP_RcvSchdAdjstReg p){
		p.Hdr_bill_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bfw_bal_disp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_sls_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ret_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_sw_to_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_schd_amt_total_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_act_amt_total_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_schd_amt_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_schd_adjst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
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

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [REF]ステータスの[Test]ブロックのモードの設定
	 */
	protected static void statusInitREF_Test(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [REF]ステータスの[RcvSchdDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvSchdDtl(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1(MSBGP_RcvSchdAdjstReg p){
		p.columnDtl1_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_rcv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_rcv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_rcv_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_rcv_schd_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_rcv_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
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

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MSBGP_RcvSchdAdjstReg p){
		p.columnDtl2_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_rcv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_rcv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_rcv_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_rcv_schd_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl2_rcv_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2Btn(MSBGP_RcvSchdAdjstReg p){
		p.Dtl2Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Dtl2Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Dtl2Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Dtl2Btn_schd_amt_ttl_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Dtl2Btn_schd_amt_diff_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl3(MSBGP_RcvSchdAdjstReg p){
		p.columnDtl3_rcv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_rcv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl3_rcv_act_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
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
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBGP_RcvSchdAdjstReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBGP_RcvSchdAdjstReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bill_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBGP_RcvSchdAdjstReg p){
		p.Hdr_bill_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bfw_bal_disp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_bill_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_sls_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ret_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_sw_to_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_schd_amt_total_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_act_amt_total_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_schd_amt_bal_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_rcv_schd_adjst_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_mng_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
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

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [UPD]ステータスの[Test]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Test(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [UPD]ステータスの[RcvSchdDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RcvSchdDtl(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1(MSBGP_RcvSchdAdjstReg p){
		p.columnDtl1_rcv_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_rcv_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_rcv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_rcv_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_rcv_schd_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_rcv_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
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

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MSBGP_RcvSchdAdjstReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MSBGP_RcvSchdAdjstReg p){
		p.columnDtl2_rcv_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_rcv_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_rcv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_rcv_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl2_rcv_schd_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.columnDtl2_rcv_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_sub_char3.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2Btn(MSBGP_RcvSchdAdjstReg p){
		p.Dtl2Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl2Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl2Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl2Btn_schd_amt_ttl_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Dtl2Btn_schd_amt_diff_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl3(MSBGP_RcvSchdAdjstReg p){
		p.columnDtl3_rcv_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_rcv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl3_rcv_act_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl3_rcv_act_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
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
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBGP_RcvSchdAdjstReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return REF;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBGP_RcvSchdAdjstReg_MC.setTableConfigDtl1((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.setTableConfigDtl2((MSBGP_RcvSchdAdjstReg)this);
		MSBGP_RcvSchdAdjstReg_MC.setTableConfigDtl3((MSBGP_RcvSchdAdjstReg)this);
	}

	/**
	 * [Dtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl1(MSBGP_RcvSchdAdjstReg p) {
		p.columnDtl1_rcv_schd_dt.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.rcv_schd_dt_META);
		p.columnDtl1_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rcv_schd_dt);
		p.columnDtl1_rcv_cd.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.rcv_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rcv_cd);
		p.columnDtl1_rcv_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.rcv_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rcv_nm);
		p.columnDtl1_rcv_typ.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.rcv_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rcv_typ);
		p.Dtl1Table.addTable(p.Dtl1_rcv_schd_amt_p_PPanel.AmtTable);
		p.columnDtl1_rcv_schd_no.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.rcv_schd_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rcv_schd_no);
		p.columnDtl1_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.sub_char1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char1);
		p.columnDtl1_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.sub_char2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char2);
		p.columnDtl1_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.sub_char3_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char3);
		p.columnDtl1_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.ins_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_id);
		p.columnDtl1_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.ins_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_nm);
		p.columnDtl1_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.ins_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_id);
		p.columnDtl1_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.ins_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_nm);
		p.columnDtl1_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.ins_ts_META);
		p.columnDtl1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_ts);
		p.columnDtl1_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.upd_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_id);
		p.columnDtl1_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.upd_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_nm);
		p.columnDtl1_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.upd_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_id);
		p.columnDtl1_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.upd_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_nm);
		p.columnDtl1_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.upd_ts_META);
		p.columnDtl1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_ts);
		p.columnDtl1_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl1R.upd_srv_req_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_srv_req_no);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MSBGP_RcvSchdAdjstReg p) {
		p.columnDtl2_rcv_schd_dt.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl2R.rcv_schd_dt_META);
		p.columnDtl2_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcv_schd_dt);
		p.columnDtl2_rcv_cd.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl2R.rcv_cd_META);
		p.columnDtl2_rcv_cd.addLinkBeans(p.columnDtl2_rcv_nm,p.columnDtl2_rcv_typ);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcv_cd);
		p.columnDtl2_rcv_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl2R.rcv_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcv_nm);
		p.columnDtl2_rcv_typ.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl2R.rcv_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcv_typ);
		p.Dtl2Table.addTable(p.Dtl2_rcv_schd_amt_p_PPanel.AmtTable);
		p.Dtl2_rcv_schd_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnDtl2_rcv_schd_no.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl2R.rcv_schd_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcv_schd_no);
		p.columnDtl2_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl2R.sub_char1_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char1);
		p.columnDtl2_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl2R.sub_char2_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char2);
		p.columnDtl2_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl2R.sub_char3_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char3);
	}

	/**
	 * [Dtl3]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl3(MSBGP_RcvSchdAdjstReg p) {
		p.columnDtl3_rcv_cd.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.rcv_cd_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_rcv_cd);
		p.columnDtl3_rcv_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.rcv_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_rcv_nm);
		p.columnDtl3_rcv_act_dt.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.rcv_act_dt_META);
		p.columnDtl3_rcv_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_rcv_act_dt);
		p.Dtl3Table.addTable(p.Dtl3_rcv_act_amt_p_PPanel.AmtTable);
		p.columnDtl3_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.ins_usr_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_usr_id);
		p.columnDtl3_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.ins_usr_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_usr_nm);
		p.columnDtl3_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.ins_func_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_func_id);
		p.columnDtl3_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.ins_func_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_func_nm);
		p.columnDtl3_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.ins_ts_META);
		p.columnDtl3_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_ins_ts);
		p.columnDtl3_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.upd_usr_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_usr_id);
		p.columnDtl3_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.upd_usr_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_usr_nm);
		p.columnDtl3_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.upd_func_id_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_func_id);
		p.columnDtl3_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.upd_func_nm_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_func_nm);
		p.columnDtl3_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.upd_ts_META);
		p.columnDtl3_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_ts);
		p.columnDtl3_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0080.Dtl3R.upd_srv_req_no_META);
		p.Dtl3Table.addColumnConfig(p.columnDtl3_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnDtl2_rcv_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_rcv_cd.getListConfig().setPutter(getDtl2_rcv_cd_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (REF.equals(status)) {
			setREFStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
	}

	/**
	 * [Dtl2_rcv_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_rcv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArSttlNotRcvSchd");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnDtl2_rcv_cd) return getDtl2_rcv_cd(row, info);
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
		else if (ap == Dtl2Btn_radd) doDtl2Btn_radd(info);
		else if (ap == Dtl2Btn_rdel) doDtl2Btn_rdel(info);
		else if (ap == Dtl2Btn_rcopy) doDtl2Btn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Dtl2Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl2Btn_radd(MCEventInfo info);

	/**
	 * [Dtl2Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl2Btn_rdel(MCEventInfo info);

	/**
	 * [Dtl2Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl2Btn_rcopy(MCEventInfo info);

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
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == Dtl1Table) return doDtl1_VC(info);
		if (vc == Dtl2Table) return doDtl2_VC(info);
		if (vc == Dtl3Table) return doDtl3_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_bill_no) return doCnd_bill_no_VC(info);
		if (vc == Hdr_bill_ym) return doHdr_bill_ym_VC(info);
		if (vc == Hdr_bill_cl_day) return doHdr_bill_cl_day_VC(info);
		if (vc == Hdr_iv_no) return doHdr_iv_no_VC(info);
		if (vc == Hdr_prnt_flg) return doHdr_prnt_flg_VC(info);
		if (vc == Hdr_bfw_bal_disp_flg) return doHdr_bfw_bal_disp_flg_VC(info);
		if (vc == Hdr_bill_dpt_cd) return doHdr_bill_dpt_cd_VC(info);
		if (vc == Hdr_bill_dpt_nm) return doHdr_bill_dpt_nm_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_bcst_cd) return doHdr_bcst_cd_VC(info);
		if (vc == Hdr_bcst_nm) return doHdr_bcst_nm_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_amt_dec_place) return doHdr_amt_dec_place_VC(info);
		if (vc == Hdr_upri_dec_place) return doHdr_upri_dec_place_VC(info);
		if (vc == Hdr_rcv_schd_adjst_flg) return doHdr_rcv_schd_adjst_flg_VC(info);
		if (vc == Hdr_bill_mng_no) return doHdr_bill_mng_no_VC(info);
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
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
		if (vc == columnDtl1_rcv_schd_dt) return doDtl1_rcv_schd_dt_VC(info);
		if (vc == columnDtl1_rcv_cd) return doDtl1_rcv_cd_VC(info);
		if (vc == columnDtl1_rcv_nm) return doDtl1_rcv_nm_VC(info);
		if (vc == columnDtl1_rcv_typ) return doDtl1_rcv_typ_VC(info);
		if (vc == columnDtl1_rcv_schd_no) return doDtl1_rcv_schd_no_VC(info);
		if (vc == columnDtl1_sub_char1) return doDtl1_sub_char1_VC(info);
		if (vc == columnDtl1_sub_char2) return doDtl1_sub_char2_VC(info);
		if (vc == columnDtl1_sub_char3) return doDtl1_sub_char3_VC(info);
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
		if (vc == columnDtl2_rcv_schd_dt) return doDtl2_rcv_schd_dt_VC(info);
		if (vc == columnDtl2_rcv_cd) return doDtl2_rcv_cd_VC(info);
		if (vc == columnDtl2_rcv_nm) return doDtl2_rcv_nm_VC(info);
		if (vc == columnDtl2_rcv_typ) return doDtl2_rcv_typ_VC(info);
		if (vc == columnDtl2_rcv_schd_no) return doDtl2_rcv_schd_no_VC(info);
		if (vc == columnDtl2_sub_char1) return doDtl2_sub_char1_VC(info);
		if (vc == columnDtl2_sub_char2) return doDtl2_sub_char2_VC(info);
		if (vc == columnDtl2_sub_char3) return doDtl2_sub_char3_VC(info);
		if (vc == columnDtl3_rcv_cd) return doDtl3_rcv_cd_VC(info);
		if (vc == columnDtl3_rcv_nm) return doDtl3_rcv_nm_VC(info);
		if (vc == columnDtl3_rcv_act_dt) return doDtl3_rcv_act_dt_VC(info);
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
	 * [Cnd]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_ym_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[bfw_bal_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bfw_bal_disp_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_amt_dec_place_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcv_schd_adjst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_schd_adjst_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_cntr_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rcv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rcv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rcv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rcv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rcv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rcv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rcv_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rcv_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char3_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rcv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rcv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rcv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rcv_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcv_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[rcv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_rcv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[rcv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_rcv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl3]パネルの[rcv_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl3_rcv_act_dt_VC(MCEventInfo info){
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
		else if (nc == Cnd_bill_no) doCnd_bill_no_NC(info);
		else if (nc == Hdr_bill_ym) doHdr_bill_ym_NC(info);
		else if (nc == Hdr_bill_cl_day) doHdr_bill_cl_day_NC(info);
		else if (nc == Hdr_iv_no) doHdr_iv_no_NC(info);
		else if (nc == Hdr_prnt_flg) doHdr_prnt_flg_NC(info);
		else if (nc == Hdr_bfw_bal_disp_flg) doHdr_bfw_bal_disp_flg_NC(info);
		else if (nc == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NC(info);
		else if (nc == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_bcst_cd) doHdr_bcst_cd_NC(info);
		else if (nc == Hdr_bcst_nm) doHdr_bcst_nm_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_amt_dec_place) doHdr_amt_dec_place_NC(info);
		else if (nc == Hdr_upri_dec_place) doHdr_upri_dec_place_NC(info);
		else if (nc == Hdr_rcv_schd_adjst_flg) doHdr_rcv_schd_adjst_flg_NC(info);
		else if (nc == Hdr_bill_mng_no) doHdr_bill_mng_no_NC(info);
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
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
		else if (nc == columnDtl1_rcv_schd_dt) doDtl1_rcv_schd_dt_NC(info);
		else if (nc == columnDtl1_rcv_cd) doDtl1_rcv_cd_NC(info);
		else if (nc == columnDtl1_rcv_nm) doDtl1_rcv_nm_NC(info);
		else if (nc == columnDtl1_rcv_typ) doDtl1_rcv_typ_NC(info);
		else if (nc == columnDtl1_rcv_schd_no) doDtl1_rcv_schd_no_NC(info);
		else if (nc == columnDtl1_sub_char1) doDtl1_sub_char1_NC(info);
		else if (nc == columnDtl1_sub_char2) doDtl1_sub_char2_NC(info);
		else if (nc == columnDtl1_sub_char3) doDtl1_sub_char3_NC(info);
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
		else if (nc == columnDtl2_rcv_schd_dt) doDtl2_rcv_schd_dt_NC(info);
		else if (nc == columnDtl2_rcv_cd) doDtl2_rcv_cd_NC(info);
		else if (nc == columnDtl2_rcv_nm) doDtl2_rcv_nm_NC(info);
		else if (nc == columnDtl2_rcv_typ) doDtl2_rcv_typ_NC(info);
		else if (nc == columnDtl2_rcv_schd_no) doDtl2_rcv_schd_no_NC(info);
		else if (nc == columnDtl2_sub_char1) doDtl2_sub_char1_NC(info);
		else if (nc == columnDtl2_sub_char2) doDtl2_sub_char2_NC(info);
		else if (nc == columnDtl2_sub_char3) doDtl2_sub_char3_NC(info);
		else if (nc == columnDtl3_rcv_cd) doDtl3_rcv_cd_NC(info);
		else if (nc == columnDtl3_rcv_nm) doDtl3_rcv_nm_NC(info);
		else if (nc == columnDtl3_rcv_act_dt) doDtl3_rcv_act_dt_NC(info);
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
	 * [Cnd]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_bal_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_bal_disp_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_adjst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_adjst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
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
	 * [Dtl1]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_NC(MCEventInfo info){
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
	 * [Dtl2]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_dt_NC(MCEventInfo info){
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
		else if (ne == Cnd_bill_no) doCnd_bill_no_NE(info);
		else if (ne == Hdr_bill_ym) doHdr_bill_ym_NE(info);
		else if (ne == Hdr_bill_cl_day) doHdr_bill_cl_day_NE(info);
		else if (ne == Hdr_iv_no) doHdr_iv_no_NE(info);
		else if (ne == Hdr_prnt_flg) doHdr_prnt_flg_NE(info);
		else if (ne == Hdr_bfw_bal_disp_flg) doHdr_bfw_bal_disp_flg_NE(info);
		else if (ne == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NE(info);
		else if (ne == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_bcst_cd) doHdr_bcst_cd_NE(info);
		else if (ne == Hdr_bcst_nm) doHdr_bcst_nm_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_amt_dec_place) doHdr_amt_dec_place_NE(info);
		else if (ne == Hdr_upri_dec_place) doHdr_upri_dec_place_NE(info);
		else if (ne == Hdr_rcv_schd_adjst_flg) doHdr_rcv_schd_adjst_flg_NE(info);
		else if (ne == Hdr_bill_mng_no) doHdr_bill_mng_no_NE(info);
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
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
		else if (ne == columnDtl1_rcv_schd_dt) doDtl1_rcv_schd_dt_NE(info);
		else if (ne == columnDtl1_rcv_cd) doDtl1_rcv_cd_NE(info);
		else if (ne == columnDtl1_rcv_nm) doDtl1_rcv_nm_NE(info);
		else if (ne == columnDtl1_rcv_typ) doDtl1_rcv_typ_NE(info);
		else if (ne == columnDtl1_rcv_schd_no) doDtl1_rcv_schd_no_NE(info);
		else if (ne == columnDtl1_sub_char1) doDtl1_sub_char1_NE(info);
		else if (ne == columnDtl1_sub_char2) doDtl1_sub_char2_NE(info);
		else if (ne == columnDtl1_sub_char3) doDtl1_sub_char3_NE(info);
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
		else if (ne == columnDtl2_rcv_schd_dt) doDtl2_rcv_schd_dt_NE(info);
		else if (ne == columnDtl2_rcv_cd) doDtl2_rcv_cd_NE(info);
		else if (ne == columnDtl2_rcv_nm) doDtl2_rcv_nm_NE(info);
		else if (ne == columnDtl2_rcv_typ) doDtl2_rcv_typ_NE(info);
		else if (ne == columnDtl2_rcv_schd_no) doDtl2_rcv_schd_no_NE(info);
		else if (ne == columnDtl2_sub_char1) doDtl2_sub_char1_NE(info);
		else if (ne == columnDtl2_sub_char2) doDtl2_sub_char2_NE(info);
		else if (ne == columnDtl2_sub_char3) doDtl2_sub_char3_NE(info);
		else if (ne == columnDtl3_rcv_cd) doDtl3_rcv_cd_NE(info);
		else if (ne == columnDtl3_rcv_nm) doDtl3_rcv_nm_NE(info);
		else if (ne == columnDtl3_rcv_act_dt) doDtl3_rcv_act_dt_NE(info);
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
	 * [Cnd]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_bal_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_bal_disp_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_adjst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_adjst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
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
	 * [Dtl1]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_NE(MCEventInfo info){
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
	 * [Dtl2]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_dt_NE(MCEventInfo info){
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
		else if (nx == Cnd_bill_no) doCnd_bill_no_NX(info);
		else if (nx == Hdr_bill_ym) doHdr_bill_ym_NX(info);
		else if (nx == Hdr_bill_cl_day) doHdr_bill_cl_day_NX(info);
		else if (nx == Hdr_iv_no) doHdr_iv_no_NX(info);
		else if (nx == Hdr_prnt_flg) doHdr_prnt_flg_NX(info);
		else if (nx == Hdr_bfw_bal_disp_flg) doHdr_bfw_bal_disp_flg_NX(info);
		else if (nx == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_NX(info);
		else if (nx == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_bcst_cd) doHdr_bcst_cd_NX(info);
		else if (nx == Hdr_bcst_nm) doHdr_bcst_nm_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_amt_dec_place) doHdr_amt_dec_place_NX(info);
		else if (nx == Hdr_upri_dec_place) doHdr_upri_dec_place_NX(info);
		else if (nx == Hdr_rcv_schd_adjst_flg) doHdr_rcv_schd_adjst_flg_NX(info);
		else if (nx == Hdr_bill_mng_no) doHdr_bill_mng_no_NX(info);
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
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
		else if (nx == columnDtl1_rcv_schd_dt) doDtl1_rcv_schd_dt_NX(info);
		else if (nx == columnDtl1_rcv_cd) doDtl1_rcv_cd_NX(info);
		else if (nx == columnDtl1_rcv_nm) doDtl1_rcv_nm_NX(info);
		else if (nx == columnDtl1_rcv_typ) doDtl1_rcv_typ_NX(info);
		else if (nx == columnDtl1_rcv_schd_no) doDtl1_rcv_schd_no_NX(info);
		else if (nx == columnDtl1_sub_char1) doDtl1_sub_char1_NX(info);
		else if (nx == columnDtl1_sub_char2) doDtl1_sub_char2_NX(info);
		else if (nx == columnDtl1_sub_char3) doDtl1_sub_char3_NX(info);
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
		else if (nx == columnDtl2_rcv_schd_dt) doDtl2_rcv_schd_dt_NX(info);
		else if (nx == columnDtl2_rcv_cd) doDtl2_rcv_cd_NX(info);
		else if (nx == columnDtl2_rcv_nm) doDtl2_rcv_nm_NX(info);
		else if (nx == columnDtl2_rcv_typ) doDtl2_rcv_typ_NX(info);
		else if (nx == columnDtl2_rcv_schd_no) doDtl2_rcv_schd_no_NX(info);
		else if (nx == columnDtl2_sub_char1) doDtl2_sub_char1_NX(info);
		else if (nx == columnDtl2_sub_char2) doDtl2_sub_char2_NX(info);
		else if (nx == columnDtl2_sub_char3) doDtl2_sub_char3_NX(info);
		else if (nx == columnDtl3_rcv_cd) doDtl3_rcv_cd_NX(info);
		else if (nx == columnDtl3_rcv_nm) doDtl3_rcv_nm_NX(info);
		else if (nx == columnDtl3_rcv_act_dt) doDtl3_rcv_act_dt_NX(info);
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
	 * [Cnd]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_bal_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_bal_disp_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_adjst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_adjst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
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
	 * [Dtl1]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_NX(MCEventInfo info){
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
	 * [Dtl2]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_dt_NX(MCEventInfo info){
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
		if (lc == Cnd_bill_no) doCnd_bill_no_LC(info);
		else if (lc == Hdr_bill_ym) doHdr_bill_ym_LC(info);
		else if (lc == Hdr_bill_cl_day) doHdr_bill_cl_day_LC(info);
		else if (lc == Hdr_iv_no) doHdr_iv_no_LC(info);
		else if (lc == Hdr_bill_dpt_cd) doHdr_bill_dpt_cd_LC(info);
		else if (lc == Hdr_bill_dpt_nm) doHdr_bill_dpt_nm_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_bcst_cd) doHdr_bcst_cd_LC(info);
		else if (lc == Hdr_bcst_nm) doHdr_bcst_nm_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_amt_dec_place) doHdr_amt_dec_place_LC(info);
		else if (lc == Hdr_upri_dec_place) doHdr_upri_dec_place_LC(info);
		else if (lc == Hdr_bill_mng_no) doHdr_bill_mng_no_LC(info);
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
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
		else if (lc == columnDtl1_rcv_schd_dt) doDtl1_rcv_schd_dt_LC(info);
		else if (lc == columnDtl1_rcv_cd) doDtl1_rcv_cd_LC(info);
		else if (lc == columnDtl1_rcv_nm) doDtl1_rcv_nm_LC(info);
		else if (lc == columnDtl1_rcv_typ) doDtl1_rcv_typ_LC(info);
		else if (lc == columnDtl1_rcv_schd_no) doDtl1_rcv_schd_no_LC(info);
		else if (lc == columnDtl1_sub_char1) doDtl1_sub_char1_LC(info);
		else if (lc == columnDtl1_sub_char2) doDtl1_sub_char2_LC(info);
		else if (lc == columnDtl1_sub_char3) doDtl1_sub_char3_LC(info);
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
		else if (lc == columnDtl2_rcv_schd_dt) doDtl2_rcv_schd_dt_LC(info);
		else if (lc == columnDtl2_rcv_cd) doDtl2_rcv_cd_LC(info);
		else if (lc == columnDtl2_rcv_nm) doDtl2_rcv_nm_LC(info);
		else if (lc == columnDtl2_rcv_typ) doDtl2_rcv_typ_LC(info);
		else if (lc == columnDtl2_rcv_schd_no) doDtl2_rcv_schd_no_LC(info);
		else if (lc == columnDtl2_sub_char1) doDtl2_sub_char1_LC(info);
		else if (lc == columnDtl2_sub_char2) doDtl2_sub_char2_LC(info);
		else if (lc == columnDtl2_sub_char3) doDtl2_sub_char3_LC(info);
		else if (lc == columnDtl3_rcv_cd) doDtl3_rcv_cd_LC(info);
		else if (lc == columnDtl3_rcv_nm) doDtl3_rcv_nm_LC(info);
		else if (lc == columnDtl3_rcv_act_dt) doDtl3_rcv_act_dt_LC(info);
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
	 * [Cnd]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
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
	 * [Dtl1]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcv_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcv_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_LC(MCEventInfo info){
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
	 * [Dtl2]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcv_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcv_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl3]パネルの[rcv_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl3_rcv_act_dt_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[columnDtl2_rcv_cd]の作成メソッド
	 */
	public MCList getDtl2_rcv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArSttlNotRcvSchd(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0080.Srch01")) {
			return new MS_MSBGL0080_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0080.Upd01")) {
			return new MS_MSBGL0080_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0080_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0080_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0080_Srch01Bridge() {
			p_MS_MSBGL0080_Srch01 = new MCParam(PDef.MS_MSBGL0080_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0080_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0080.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0080.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0080.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0080.Dtl3R.class));

			p_MS_MSBGL0080_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0080_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0080_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0080_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0080_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0080.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0080.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0080.HdrR down0() {
			return (mcframe.clientMSBG.MSBGP0080.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0080.Dtl1R> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0080.Dtl1R>)down(1);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0080.Dtl3R> down2() {
			return (MCList<mcframe.clientMSBG.MSBGP0080.Dtl3R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0080_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0080.HdrR.create());
			p_MS_MSBGL0080_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0080.Dtl1R.class));
			p_MS_MSBGL0080_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0080.Dtl3R.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0080_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBG.MSBGP0080.HdrR)p_MS_MSBGL0080_Srch01.getContainerParam().getDownBlock(0));
			setDtl1L((MCList<mcframe.clientMSBG.MSBGP0080.Dtl1R>)p_MS_MSBGL0080_Srch01.getContainerParam().getDownBlock(1));
			setDtl3L((MCList<mcframe.clientMSBG.MSBGP0080.Dtl3R>)p_MS_MSBGL0080_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtl1L().clear();
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
			result.add(getDtl3L());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0080_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0080_Upd01;

		/** コンストラクタ */
		protected MS_MSBGL0080_Upd01Bridge() {
			p_MS_MSBGL0080_Upd01 = new MCParam(PDef.MS_MSBGL0080_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0080_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0080.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0080.Dtl2R.class));
			// Down

			p_MS_MSBGL0080_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0080_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0080_Upd01.addUpBlock(getHdrR());
			p_MS_MSBGL0080_Upd01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0080_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0080_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0080.HdrR up0() {
			return (mcframe.clientMSBG.MSBGP0080.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0080.Dtl2R> up1() {
			return (MCList<mcframe.clientMSBG.MSBGP0080.Dtl2R>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0080_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}