package mcframe.clientMSBB.MSBBP1380;

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
import mcframe.clientMSBB.MSBBP1380.MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Srch01Caller;
import mcframe.clientMSBB.MSBBP1380.MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Srch02Caller;
import mcframe.clientMSBB.MSBBP1380.MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Ins01Caller;
import mcframe.clientMSBB.MSBBP1380.MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Upd01Caller;
import mcframe.clientMSBB.MSBBP1380.MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Del01Caller;
import mcframe.clientMSBB.MSBBP1380.MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Prnt01Caller;

/**
 * 画面"MSBBP_SlsDscntReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_SlsDscntReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBBP1380";

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
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_typ = null;
	public MCLabel Cnd_srch_tgt_typ_nm_Label = null;
	/**
	 * Search target type name 検索対象区分名.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_typ_nm = null;
	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_no = null;
	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_srch_tgt_rev = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Cnd_latest_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_sls_dscnt = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_sls = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Hdr_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCTextField Hdr_trd_ptn_typ = null;
	public MCLabel Hdr_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField Hdr_ac_ym = null;
	public MCLabel Hdr_sls_act_no_Label = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_sls_act_no = null;
	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_sls_act_rev = null;
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCNumberField Hdr_sls_act_seq = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Hdr_latest_flg = null;
	public MCLabel Hdr_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_dlv_slip_no = null;
	public MCLabel Hdr_sls_dt_Label = null;
	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public MCDateField Hdr_sls_dt = null;
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H Hdr_ac_dt_p_PPanel;
	public MCDateField Hdr_ac_dt;	// [Hdr]の[ac_dt_p.ac_dt]を[Hdr_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H Hdr_can_ac_dt_p_PPanel;
	public MCDateField Hdr_can_ac_dt_for_input;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_input]を[Hdr_can_ac_dt_for_input]としてエイリアス定義。
	public MCDateField Hdr_can_ac_dt;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_call]を[Hdr_can_ac_dt]としてエイリアス定義。
	public MCDateField Hdr_ac_dt_after_srch;	// [Hdr]の[can_ac_dt_p.ac_dt_after_srch]を[Hdr_ac_dt_after_srch]としてエイリアス定義。
	public MCLabel Hdr_bill_basis_dt_Label = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDateField Hdr_bill_basis_dt = null;
	/**
	 * Sales slip immediate issue 売上伝票即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_sls_slip_out_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_sls_slip_prnted_flg = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_flg = null;
	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_ret_flg = null;
	public MCLabel Hdr_aprv_no_Label = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_aprv_no = null;
	public MCLabel Hdr_aprv_sts_typ_Label = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCTextField Hdr_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCTextField Hdr_aprv_sts_typ_nm = null;
	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_upd_flg = null;
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_can_flg = null;
	public MCLabel Hdr_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Hdr_cst_nm = null;
	/**
	 * Customer PIC cd. 得意先担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cst_usr_cd = null;
	/**
	 * Customer dept. in charge cd. 得意先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cst_dpt_cd = null;
	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public MCTextField Hdr_ar_dpt_typ = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumberField Hdr_cst_bill_crryovr_times = null;
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public MCCheckBox Hdr_cst_iv_flg = null;
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_sls_amt_rnd_typ = null;
	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_sls_tax_rnd_typ = null;
	public MCLabel Hdr_dest_cd1_Label = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCTextField Hdr_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCTextField Hdr_dest_nm1 = null;
	public MCLabel Hdr_dest_cd2_Label = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCTextField Hdr_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCTextField Hdr_dest_nm2 = null;
	public MCLabel Hdr_dest_cd3_Label = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCTextField Hdr_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCTextField Hdr_dest_nm3 = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_usr_dpt_p_PPanel;
	public MCTextField Hdr_sls_usr_cd;	// [Hdr]の[usr_dpt_p.usr_cd]を[Hdr_sls_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_sls_usr_nm;	// [Hdr]の[usr_dpt_p.usr_nm]を[Hdr_sls_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_sls_dpt_cd;	// [Hdr]の[usr_dpt_p.dpt_cd]を[Hdr_sls_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_sls_dpt_nm;	// [Hdr]の[usr_dpt_p.dpt_nm]を[Hdr_sls_dpt_nm]としてエイリアス定義。
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
	public MCLabel Hdr_trd_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Hdr_trd_cur_nm = null;
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_trd_cur_amt_dec_place = null;
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_trd_cur_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_cred_bal_p_PPanel;
	public MCNumberField Hdr_cred_bal;	// [Hdr]の[cred_bal_p.amt]を[Hdr_cred_bal]としてエイリアス定義。
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
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_base_cur_amt_dec_place = null;
	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_base_cur_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_xrate_p_PPanel;
	public MCNumberField Hdr_xrate;	// [Hdr]の[xrate_p.xrate]を[Hdr_xrate]としてエイリアス定義。
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_xrate_cd = null;
	public MCLabel Hdr_ptax_cur_cd_Label = null;
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCTextField Hdr_ptax_cur_nm = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_ptax_xrate_p_PPanel;
	public MCNumberField Hdr_ptax_xrate;	// [Hdr]の[ptax_xrate_p.xrate]を[Hdr_ptax_xrate]としてエイリアス定義。
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_ptax_cur_amt_dec_place = null;
	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_ptax_cur_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_amt_p_PPanel;
	public MCNumberField Hdr_trd_cur_amt;	// [Hdr]の[trd_cur_amt_p.amt]を[Hdr_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_inc_tax_amt_p_PPanel;
	public MCNumberField Hdr_trd_cur_inc_tax_amt;	// [Hdr]の[trd_cur_inc_tax_amt_p.amt]を[Hdr_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCLabel Hdr_cst_po_no_Label = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_cst_po_no = null;
	public MCLabel Hdr_acst_cd_Label = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCTextField Hdr_acst_nm = null;
	public MCLabel Hdr_ar_dpt_cd_Label = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCTextField Hdr_ar_dpt_nm = null;
	public MCLabel Hdr_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_iv_no = null;
	/**
	 * Auto 自動.<p>
	 *
	 */
	public MCCheckBox Hdr_num_flg = null;
	public MCLabel Hdr_ref_iv_no_Label = null;
	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ref_iv_no = null;
	public MCLabel Hdr_rcv_schd_dt_Label = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDateField Hdr_rcv_schd_dt = null;
	public MCLabel Hdr_tterm_cd1_Label = null;
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Hdr_tterm_cd1 = null;
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public MCTextField Hdr_tterm_nm1 = null;
	public MCLabel Hdr_tterm_rmrks1_Label = null;
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public MCTextField Hdr_tterm_rmrks1 = null;
	public MCLabel Hdr_tterm_cd2_Label = null;
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Hdr_tterm_cd2 = null;
	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public MCTextField Hdr_tterm_nm2 = null;
	public MCLabel Hdr_tterm_rmrks2_Label = null;
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public MCTextField Hdr_tterm_rmrks2 = null;
	public MCLabel Hdr_tterm_cd3_Label = null;
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Hdr_tterm_cd3 = null;
	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public MCTextField Hdr_tterm_nm3 = null;
	public MCLabel Hdr_tterm_rmrks3_Label = null;
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public MCTextField Hdr_tterm_rmrks3 = null;
	public MCLabel Hdr_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Hdr_trd_rmrks = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
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
	/**
	 * Reference No. (For exchange rate part) 参照ＮＯ（為替レート部品用）.<p>
	 *
	 */
	public MCTextField Hdr_ref_no = null;
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
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_prnt_lcl_cd = null;
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public MCTextField Hdr_bill_cl_typ = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1380.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
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
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_itm_nm = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sundry_itm_flg = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ = null;
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no_typ = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_mng_typ = null;
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_rnd_typ = null;
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty;// [Dtl]の[trd_unit_qty_p.qty]を[columnDtl_trd_unit_qty]としてエイリアス定義。
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
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl_trd_cur_upri_amt_p_PPanel;
	public MCColumnConfig columnDtl_upri_not_tgt_flg;// [Dtl]の[trd_cur_upri_amt_p.upri_not_tgt_flg]を[columnDtl_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_upri;// [Dtl]の[trd_cur_upri_amt_p.trd_cur_upri]を[columnDtl_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl_interim_flg;// [Dtl]の[trd_cur_upri_amt_p.interim_flg]を[columnDtl_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_amt;// [Dtl]の[trd_cur_upri_amt_p.trd_cur_amt]を[columnDtl_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_inc_tax_amt;// [Dtl]の[trd_cur_upri_amt_p.trd_cur_inc_tax_amt]を[columnDtl_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_fix_flg;// [Dtl]の[trd_cur_upri_amt_p.tax_fix_flg]を[columnDtl_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_cd;// [Dtl]の[trd_cur_upri_amt_p.tax_cd]を[columnDtl_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_nm;// [Dtl]の[trd_cur_upri_amt_p.tax_nm]を[columnDtl_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_rate;// [Dtl]の[trd_cur_upri_amt_p.tax_rate]を[columnDtl_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_typ;// [Dtl]の[trd_cur_upri_amt_p.tax_typ]を[columnDtl_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_inc_tax_flg;// [Dtl]の[trd_cur_upri_amt_p.inc_tax_flg]を[columnDtl_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_tax_amt;// [Dtl]の[trd_cur_upri_amt_p.trd_cur_tax_amt]を[columnDtl_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_dscnt_amt;// [Dtl]の[trd_cur_upri_amt_p.trd_cur_dscnt_amt]を[columnDtl_trd_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_upri;// [Dtl]の[base_cur_upri_p.upri]を[columnDtl_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_amt;// [Dtl]の[base_cur_amt_p.amt]を[columnDtl_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_tax_amt;// [Dtl]の[base_cur_tax_amt_p.amt]を[columnDtl_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_inc_tax_amt;// [Dtl]の[base_cur_inc_tax_amt_p.amt]を[columnDtl_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_upri;// [Dtl]の[ptax_cur_upri_p.upri]を[columnDtl_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_amt;// [Dtl]の[ptax_cur_amt_p.amt]を[columnDtl_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_tax_amt;// [Dtl]の[ptax_cur_tax_amt_p.amt]を[columnDtl_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_inc_tax_amt;// [Dtl]の[ptax_cur_inc_tax_amt_p.amt]を[columnDtl_ptax_cur_inc_tax_amt]としてエイリアス定義。
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_rsn_cd = null;
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_rsn_nm = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_crryovr_times = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_d_no = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm3 = null;
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_d_no = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_d_no = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Dtl_lot_no_p_PPanel;
	public MCColumnConfig columnDtl_crt_lot_flg;// [Dtl]の[lot_no_p.crt_lot_flg]を[columnDtl_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_lot_no;// [Dtl]の[lot_no_p.lot_no]を[columnDtl_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_sublot_no;// [Dtl]の[lot_no_p.sublot_no]を[columnDtl_sublot_no]としてエイリアス定義。
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_wtax_amt_p_PPanel;
	public MCColumnConfig columnDtl_wtax_amt;// [Dtl]の[wtax_amt_p.amt]を[columnDtl_wtax_amt]としてエイリアス定義。
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	/**
	 * Reference sales result No. 参照売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_sls_act_no = null;
	/**
	 * Reference rev. number 参照改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_sls_act_rev = null;
	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_sls_act_seq = null;
	/**
	 * Reference sales result details No. 参照売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_sls_act_d_no = null;
	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_sls_act_d_seq = null;
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_sls_ac_dt = null;
	/**
	 * Result recording date 実績計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_ac_dt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_ref_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_ref_trd_unit_qty;// [Dtl]の[ref_trd_unit_qty_p.qty]を[columnDtl_ref_trd_unit_qty]としてエイリアス定義。
	/**
	 * Result unit cd. 実績単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_trd_unit_cd = null;
	/**
	 * Result unit name 実績単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_trd_unit_nm = null;
	/**
	 * Result unit number of decimal places 実績単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_trd_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ref_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_ref_trd_cur_upri;// [Dtl]の[ref_trd_cur_upri_p.upri]を[columnDtl_ref_trd_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ref_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_ref_trd_cur_amt;// [Dtl]の[ref_trd_cur_amt_p.amt]を[columnDtl_ref_trd_cur_amt]としてエイリアス定義。
	/**
	 * Tax included result amount 実績税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_trd_cur_inc_tax_amt = null;
	/**
	 * Result tax cd. 実績税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_tax_cd = null;
	/**
	 * Result tax name 実績税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_tax_nm = null;
	/**
	 * Result tax rate 実績税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_tax_rate = null;
	public MCColumnConfig columnDtl_ref_trd_cur_tax_amt;// [Dtl]の[ref_trd_cur_amt_p.tax_amt]を[columnDtl_ref_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ref_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_ref_base_cur_upri;// [Dtl]の[ref_base_cur_upri_p.upri]を[columnDtl_ref_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ref_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_ref_base_cur_amt;// [Dtl]の[ref_base_cur_amt_p.amt]を[columnDtl_ref_base_cur_amt]としてエイリアス定義。
	/**
	 * Tax included result amount (Base currency) 基準通貨実績税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_base_cur_inc_tax_amt = null;
	public MCColumnConfig columnDtl_ref_base_cur_tax_amt;// [Dtl]の[ref_base_cur_amt_p.tax_amt]を[columnDtl_ref_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ref_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_ref_ptax_cur_upri;// [Dtl]の[ref_ptax_cur_upri_p.upri]を[columnDtl_ref_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ref_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_ref_ptax_cur_amt;// [Dtl]の[ref_ptax_cur_amt_p.amt]を[columnDtl_ref_ptax_cur_amt]としてエイリアス定義。
	/**
	 * Tax included result amount (Tax currency) 納税通貨実績税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_ptax_cur_inc_tax_amt = null;
	public MCColumnConfig columnDtl_ref_ptax_cur_tax_amt;// [Dtl]の[ref_ptax_cur_amt_p.tax_amt]を[columnDtl_ref_ptax_cur_tax_amt]としてエイリアス定義。
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_bill_crryovr_times = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Sales slip 売上伝票.<p>
	 *
	 */
	public MCButton Btn_prnt01 = null;
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
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H Btn_menu_move_p_PPanel;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins01 = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd01 = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del01 = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [INS_REF]モードを表す定数 */
	public static final String INS_REF = "INS_REF";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, INS_REF, FIX_I, SRCH, UPD, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBBL1380_Srch01]のCallerの作成 */
	protected MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Srch01Caller createMS_MSBBL1380_Srch01() {
		MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Srch01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Srch01Bridge>
		caller = ((MSBBP_SlsDscntReg_MC)this).new MS_MSBBL1380_Srch01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Srch01Bridge>(
					(MSBBP_SlsDscntReg)this, new MS_MSBBL1380_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1380_Srch01]の呼び出し */
	protected void callMS_MSBBL1380_Srch01() {
		MCCaller caller = createMS_MSBBL1380_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1380_Srch02]のCallerの作成 */
	protected MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Srch02Caller createMS_MSBBL1380_Srch02() {
		MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Srch02Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Srch02Bridge>
		caller = ((MSBBP_SlsDscntReg_MC)this).new MS_MSBBL1380_Srch02Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Srch02Bridge>(
					(MSBBP_SlsDscntReg)this, new MS_MSBBL1380_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBBL1380_Srch02]の呼び出し */
	protected void callMS_MSBBL1380_Srch02() {
		MCCaller caller = createMS_MSBBL1380_Srch02();
		caller.exec();
	}
	/** [MS_MSBBL1380_Ins01]のCallerの作成 */
	protected MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Ins01Caller createMS_MSBBL1380_Ins01() {
		MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Ins01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Ins01Bridge>
		caller = ((MSBBP_SlsDscntReg_MC)this).new MS_MSBBL1380_Ins01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Ins01Bridge>(
					(MSBBP_SlsDscntReg)this, new MS_MSBBL1380_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBBL1380_Ins01]の呼び出し */
	protected void callMS_MSBBL1380_Ins01() {
		MCCaller caller = createMS_MSBBL1380_Ins01();
		caller.exec();
	}
	/** [MS_MSBBL1380_Upd01]のCallerの作成 */
	protected MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Upd01Caller createMS_MSBBL1380_Upd01() {
		MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Upd01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Upd01Bridge>
		caller = ((MSBBP_SlsDscntReg_MC)this).new MS_MSBBL1380_Upd01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Upd01Bridge>(
					(MSBBP_SlsDscntReg)this, new MS_MSBBL1380_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL1380_Upd01]の呼び出し */
	protected void callMS_MSBBL1380_Upd01() {
		MCCaller caller = createMS_MSBBL1380_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL1380_Del01]のCallerの作成 */
	protected MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Del01Caller createMS_MSBBL1380_Del01() {
		MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Del01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Del01Bridge>
		caller = ((MSBBP_SlsDscntReg_MC)this).new MS_MSBBL1380_Del01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Del01Bridge>(
					(MSBBP_SlsDscntReg)this, new MS_MSBBL1380_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL1380_Del01]の呼び出し */
	protected void callMS_MSBBL1380_Del01() {
		MCCaller caller = createMS_MSBBL1380_Del01();
		caller.exec();
	}
	/** [MS_MSBBL1380_Prnt01]のCallerの作成 */
	protected MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Prnt01Caller createMS_MSBBL1380_Prnt01() {
		MSBBP_SlsDscntReg_MC.MS_MSBBL1380_Prnt01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Prnt01Bridge>
		caller = ((MSBBP_SlsDscntReg_MC)this).new MS_MSBBL1380_Prnt01Caller<MSBBP_SlsDscntReg, MS_MSBBL1380_Prnt01Bridge>(
					(MSBBP_SlsDscntReg)this, new MS_MSBBL1380_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBBL1380_Prnt01]の呼び出し */
	protected void callMS_MSBBL1380_Prnt01() {
		MCCaller caller = createMS_MSBBL1380_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1380.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1380.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1380.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1380.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1380.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1380.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1380.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBB.MSBBP1380.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1380.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1380.HdrR createHdrR() {
		return mcframe.clientMSBB.MSBBP1380.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBB.MSBBP1380.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1380.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBB.MSBBP1380.DtlR createDtlR() {
		return mcframe.clientMSBB.MSBBP1380.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1380.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1380.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
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
		if(aCnt == getHdrR()) return "Hdr";
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
		if(bId.equals("Hdr")) return getHdrR();
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
		ret.add(ScreenOpePanel);
		ret.add(CndPanel);
		ret.add(HdrTabPanel);
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsDscntReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_SlsDscntReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_SlsDscntReg_MC.jbCreateScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbCreateCnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbCreateHdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbCreateHdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbCreateHdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbCreateDtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbCreateBtn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbCreateEastBtn((MSBBP_SlsDscntReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_SlsDscntReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_SlsDscntReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBBP_SlsDscntReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBBP_SlsDscntReg p) {
		p.Hdr_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.create(p.getHdrR().ac_dt_p());
		p.Hdr_ac_dt_p_PPanel.setName("Hdr.ac_dt_p");
		p.Hdr_ac_dt = p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt;
		p.Hdr_ac_dt.addAliasName("Hdr.ac_dt", p);
		p.Hdr_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.create(p.getHdrR().can_ac_dt_p());
		p.Hdr_can_ac_dt_p_PPanel.setName("Hdr.can_ac_dt_p");
		p.Hdr_can_ac_dt_for_input = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_can_ac_dt_for_input;
		p.Hdr_can_ac_dt_for_input.addAliasName("Hdr.can_ac_dt_for_input", p);
		p.Hdr_can_ac_dt = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_can_ac_dt_for_call;
		p.Hdr_can_ac_dt.addAliasName("Hdr.can_ac_dt", p);
		p.Hdr_ac_dt_after_srch = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_ac_dt_after_srch;
		p.Hdr_ac_dt_after_srch.addAliasName("Hdr.ac_dt_after_srch", p);
		p.Hdr_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().usr_dpt_p());
		p.Hdr_usr_dpt_p_PPanel.setName("Hdr.usr_dpt_p");
		p.Hdr_sls_usr_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_sls_usr_cd.addAliasName("Hdr.sls_usr_cd", p);
		p.Hdr_sls_usr_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_sls_usr_nm.addAliasName("Hdr.sls_usr_nm", p);
		p.Hdr_sls_dpt_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_sls_dpt_cd.addAliasName("Hdr.sls_dpt_cd", p);
		p.Hdr_sls_dpt_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_sls_dpt_nm.addAliasName("Hdr.sls_dpt_nm", p);
		p.Hdr_cred_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().cred_bal_p());
		p.Hdr_cred_bal_p_PPanel.setName("Hdr.cred_bal_p");
		p.Hdr_cred_bal = p.Hdr_cred_bal_p_PPanel.Amt_amt;
		p.Hdr_cred_bal.addAliasName("Hdr.cred_bal", p);
		p.Hdr_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdrR().xrate_p());
		p.Hdr_xrate_p_PPanel.setName("Hdr.xrate_p");
		p.Hdr_xrate = p.Hdr_xrate_p_PPanel.Xrate_xrate;
		p.Hdr_xrate.addAliasName("Hdr.xrate", p);
		p.Hdr_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdrR().ptax_xrate_p());
		p.Hdr_ptax_xrate_p_PPanel.setName("Hdr.ptax_xrate_p");
		p.Hdr_ptax_xrate = p.Hdr_ptax_xrate_p_PPanel.Xrate_xrate;
		p.Hdr_ptax_xrate.addAliasName("Hdr.ptax_xrate", p);
		p.Hdr_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().trd_cur_amt_p());
		p.Hdr_trd_cur_amt_p_PPanel.setName("Hdr.trd_cur_amt_p");
		p.Hdr_trd_cur_amt = p.Hdr_trd_cur_amt_p_PPanel.Amt_amt;
		p.Hdr_trd_cur_amt.addAliasName("Hdr.trd_cur_amt", p);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().trd_cur_inc_tax_amt_p());
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.setName("Hdr.trd_cur_inc_tax_amt_p");
		p.Hdr_trd_cur_inc_tax_amt = p.Hdr_trd_cur_inc_tax_amt_p_PPanel.Amt_amt;
		p.Hdr_trd_cur_inc_tax_amt.addAliasName("Hdr.trd_cur_inc_tax_amt", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBBP_SlsDscntReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBBP_SlsDscntReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$itm_p);
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
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_trd_cur_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$trd_cur_upri_amt_p);
		p.Dtl_trd_cur_upri_amt_p_PPanel.setName("Dtl.trd_cur_upri_amt_p");
		p.columnDtl_upri_not_tgt_flg = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl_upri_not_tgt_flg.addAliasName("Dtl.upri_not_tgt_flg", p);
		p.columnDtl_trd_cur_upri = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl_trd_cur_upri.addAliasName("Dtl.trd_cur_upri", p);
		p.columnDtl_interim_flg = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl_interim_flg.addAliasName("Dtl.interim_flg", p);
		p.columnDtl_trd_cur_amt = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl_trd_cur_amt.addAliasName("Dtl.trd_cur_amt", p);
		p.columnDtl_trd_cur_inc_tax_amt = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl_trd_cur_inc_tax_amt.addAliasName("Dtl.trd_cur_inc_tax_amt", p);
		p.columnDtl_tax_fix_flg = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl_tax_fix_flg.addAliasName("Dtl.tax_fix_flg", p);
		p.columnDtl_tax_cd = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl_tax_cd.addAliasName("Dtl.tax_cd", p);
		p.columnDtl_tax_nm = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl_tax_nm.addAliasName("Dtl.tax_nm", p);
		p.columnDtl_tax_rate = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl_tax_rate.addAliasName("Dtl.tax_rate", p);
		p.columnDtl_tax_typ = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl_tax_typ.addAliasName("Dtl.tax_typ", p);
		p.columnDtl_inc_tax_flg = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl_inc_tax_flg.addAliasName("Dtl.inc_tax_flg", p);
		p.columnDtl_trd_cur_tax_amt = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl_trd_cur_tax_amt.addAliasName("Dtl.trd_cur_tax_amt", p);
		p.columnDtl_trd_cur_dscnt_amt = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl_trd_cur_dscnt_amt.addAliasName("Dtl.trd_cur_dscnt_amt", p);
		p.Dtl_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$base_cur_upri_p);
		p.Dtl_base_cur_upri_p_PPanel.setName("Dtl.base_cur_upri_p");
		p.columnDtl_base_cur_upri = p.Dtl_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_upri.addAliasName("Dtl.base_cur_upri", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$base_cur_tax_amt_p);
		p.Dtl_base_cur_tax_amt_p_PPanel.setName("Dtl.base_cur_tax_amt_p");
		p.columnDtl_base_cur_tax_amt = p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_tax_amt.addAliasName("Dtl.base_cur_tax_amt", p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$base_cur_inc_tax_amt_p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_inc_tax_amt_p");
		p.columnDtl_base_cur_inc_tax_amt = p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_inc_tax_amt.addAliasName("Dtl.base_cur_inc_tax_amt", p);
		p.Dtl_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ptax_cur_upri_p);
		p.Dtl_ptax_cur_upri_p_PPanel.setName("Dtl.ptax_cur_upri_p");
		p.columnDtl_ptax_cur_upri = p.Dtl_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_upri.addAliasName("Dtl.ptax_cur_upri", p);
		p.Dtl_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ptax_cur_amt_p);
		p.Dtl_ptax_cur_amt_p_PPanel.setName("Dtl.ptax_cur_amt_p");
		p.columnDtl_ptax_cur_amt = p.Dtl_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_amt.addAliasName("Dtl.ptax_cur_amt", p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ptax_cur_tax_amt_p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.setName("Dtl.ptax_cur_tax_amt_p");
		p.columnDtl_ptax_cur_tax_amt = p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_tax_amt.addAliasName("Dtl.ptax_cur_tax_amt", p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ptax_cur_inc_tax_amt_p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl.ptax_cur_inc_tax_amt_p");
		p.columnDtl_ptax_cur_inc_tax_amt = p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_inc_tax_amt.addAliasName("Dtl.ptax_cur_inc_tax_amt", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$sno_wrk_no_p);
		p.Dtl_sno_wrk_no_p_PPanel.setName("Dtl.sno_wrk_no_p");
		p.columnDtl_sno1 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_wrk_no = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$lot_no_p);
		p.Dtl_lot_no_p_PPanel.setName("Dtl.lot_no_p");
		p.columnDtl_crt_lot_flg = p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtl_crt_lot_flg.addAliasName("Dtl.crt_lot_flg", p);
		p.columnDtl_lot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtl_lot_no.addAliasName("Dtl.lot_no", p);
		p.columnDtl_sublot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtl_sublot_no.addAliasName("Dtl.sublot_no", p);
		p.Dtl_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$wtax_amt_p);
		p.Dtl_wtax_amt_p_PPanel.setName("Dtl.wtax_amt_p");
		p.columnDtl_wtax_amt = p.Dtl_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_wtax_amt.addAliasName("Dtl.wtax_amt", p);
		p.Dtl_ref_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ref_trd_unit_qty_p);
		p.Dtl_ref_trd_unit_qty_p_PPanel.setName("Dtl.ref_trd_unit_qty_p");
		p.columnDtl_ref_trd_unit_qty = p.Dtl_ref_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_ref_trd_unit_qty.addAliasName("Dtl.ref_trd_unit_qty", p);
		p.Dtl_ref_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ref_trd_cur_upri_p);
		p.Dtl_ref_trd_cur_upri_p_PPanel.setName("Dtl.ref_trd_cur_upri_p");
		p.columnDtl_ref_trd_cur_upri = p.Dtl_ref_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ref_trd_cur_upri.addAliasName("Dtl.ref_trd_cur_upri", p);
		p.Dtl_ref_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ref_trd_cur_amt_p);
		p.Dtl_ref_trd_cur_amt_p_PPanel.setName("Dtl.ref_trd_cur_amt_p");
		p.columnDtl_ref_trd_cur_amt = p.Dtl_ref_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ref_trd_cur_amt.addAliasName("Dtl.ref_trd_cur_amt", p);
		p.columnDtl_ref_trd_cur_tax_amt = p.Dtl_ref_trd_cur_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl_ref_trd_cur_tax_amt.addAliasName("Dtl.ref_trd_cur_tax_amt", p);
		p.Dtl_ref_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ref_base_cur_upri_p);
		p.Dtl_ref_base_cur_upri_p_PPanel.setName("Dtl.ref_base_cur_upri_p");
		p.columnDtl_ref_base_cur_upri = p.Dtl_ref_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ref_base_cur_upri.addAliasName("Dtl.ref_base_cur_upri", p);
		p.Dtl_ref_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ref_base_cur_amt_p);
		p.Dtl_ref_base_cur_amt_p_PPanel.setName("Dtl.ref_base_cur_amt_p");
		p.columnDtl_ref_base_cur_amt = p.Dtl_ref_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ref_base_cur_amt.addAliasName("Dtl.ref_base_cur_amt", p);
		p.columnDtl_ref_base_cur_tax_amt = p.Dtl_ref_base_cur_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl_ref_base_cur_tax_amt.addAliasName("Dtl.ref_base_cur_tax_amt", p);
		p.Dtl_ref_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ref_ptax_cur_upri_p);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.setName("Dtl.ref_ptax_cur_upri_p");
		p.columnDtl_ref_ptax_cur_upri = p.Dtl_ref_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ref_ptax_cur_upri.addAliasName("Dtl.ref_ptax_cur_upri", p);
		p.Dtl_ref_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1380.DtlR.$ref_ptax_cur_amt_p);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.setName("Dtl.ref_ptax_cur_amt_p");
		p.columnDtl_ref_ptax_cur_amt = p.Dtl_ref_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ref_ptax_cur_amt.addAliasName("Dtl.ref_ptax_cur_amt", p);
		p.columnDtl_ref_ptax_cur_tax_amt = p.Dtl_ref_ptax_cur_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl_ref_ptax_cur_tax_amt.addAliasName("Dtl.ref_ptax_cur_tax_amt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_SlsDscntReg p) {
		p.Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_menu_move_p_PPanel.setName("Btn.menu_move_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_SlsDscntReg p) {
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

	
	/** [Cnd_srch_tgt_typ_nm_ListPutter]の定義 */
	private MCListPutter Cnd_srch_tgt_typ_nm_p = null;

	/**
	 * [Cnd_srch_tgt_typ_nm_ListPutter]の取得
	 */
	protected MCListPutter getCnd_srch_tgt_typ_nm_ListPutter() {
		if (Cnd_srch_tgt_typ_nm_p == null) {
			Cnd_srch_tgt_typ_nm_p = createCnd_srch_tgt_typ_nm_ListPutter(Cnd_srch_tgt_typ_nm, "srch_tgt_typ_nm", "srch_tgt_typ");

		}
		return Cnd_srch_tgt_typ_nm_p;
	}
	
	
	/** [Hdr_trd_cd_ListPutter]の定義 */
	private MCListPutter Hdr_trd_cd_p = null;

	/**
	 * [Hdr_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_trd_cd_ListPutter() {
		if (Hdr_trd_cd_p == null) {
			Hdr_trd_cd_p = createHdr_trd_cd_ListPutter(Hdr_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ");

		}
		return Hdr_trd_cd_p;
	}
	
	
	/** [Hdr_cst_cd_ListPutter]の定義 */
	private MCListPutter Hdr_cst_cd_p = null;

	/**
	 * [Hdr_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_cst_cd_ListPutter() {
		if (Hdr_cst_cd_p == null) {
			Hdr_cst_cd_p = createHdr_cst_cd_ListPutter(Hdr_cst_cd, "cst_cd", "cst_nm","ar_dpt_cd","trd_cur_cd","tterm_cd1","tterm_cd2","tterm_cd3","acst_cd","acst_nm","cst_iv_flg","sls_amt_rnd_typ","sls_tax_rnd_typ","cst_usr_cd","cst_dpt_cd","ar_dpt_typ","cst_bill_crryovr_times","prnt_lcl_cd","bill_cl_typ");

		}
		return Hdr_cst_cd_p;
	}
	
	
	/** [Hdr_dest_cd1_ListPutter]の定義 */
	private MCListPutter Hdr_dest_cd1_p = null;

	/**
	 * [Hdr_dest_cd1_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dest_cd1_ListPutter() {
		if (Hdr_dest_cd1_p == null) {
			Hdr_dest_cd1_p = createHdr_dest_cd1_ListPutter(Hdr_dest_cd1, "dest_cd1", "dest_nm1");

		}
		return Hdr_dest_cd1_p;
	}
	
	
	/** [Hdr_dest_cd2_ListPutter]の定義 */
	private MCListPutter Hdr_dest_cd2_p = null;

	/**
	 * [Hdr_dest_cd2_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dest_cd2_ListPutter() {
		if (Hdr_dest_cd2_p == null) {
			Hdr_dest_cd2_p = createHdr_dest_cd2_ListPutter(Hdr_dest_cd2, "dest_cd2", "dest_nm2");

		}
		return Hdr_dest_cd2_p;
	}
	
	
	/** [Hdr_dest_cd3_ListPutter]の定義 */
	private MCListPutter Hdr_dest_cd3_p = null;

	/**
	 * [Hdr_dest_cd3_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dest_cd3_ListPutter() {
		if (Hdr_dest_cd3_p == null) {
			Hdr_dest_cd3_p = createHdr_dest_cd3_ListPutter(Hdr_dest_cd3, "dest_cd3", "dest_nm3");

		}
		return Hdr_dest_cd3_p;
	}
	
	
	/** [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "sls_dpt_cd", "sls_dpt_nm","wg_cd","wg_nm");
		}
		return Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Hdr_trd_cur_cd_p = null;

	/**
	 * [Hdr_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_trd_cur_cd_ListPutter() {
		if (Hdr_trd_cur_cd_p == null) {
			Hdr_trd_cur_cd_p = createHdr_trd_cur_cd_ListPutter(Hdr_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","trd_cur_amt_dec_place","trd_cur_upri_dec_place");

		}
		return Hdr_trd_cur_cd_p;
	}
	
	
	/** [Hdr_acst_cd_ListPutter]の定義 */
	private MCListPutter Hdr_acst_cd_p = null;

	/**
	 * [Hdr_acst_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_acst_cd_ListPutter() {
		if (Hdr_acst_cd_p == null) {
			Hdr_acst_cd_p = createHdr_acst_cd_ListPutter(Hdr_acst_cd, "acst_cd");

		}
		return Hdr_acst_cd_p;
	}
	
	
	/** [Hdr_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ar_dpt_cd_p = null;

	/**
	 * [Hdr_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ar_dpt_cd_ListPutter() {
		if (Hdr_ar_dpt_cd_p == null) {
			Hdr_ar_dpt_cd_p = createHdr_ar_dpt_cd_ListPutter(Hdr_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Hdr_ar_dpt_cd_p;
	}
	
	
	/** [Hdr_tterm_cd1_ListPutter]の定義 */
	private MCListPutter Hdr_tterm_cd1_p = null;

	/**
	 * [Hdr_tterm_cd1_ListPutter]の取得
	 */
	protected MCListPutter getHdr_tterm_cd1_ListPutter() {
		if (Hdr_tterm_cd1_p == null) {
			Hdr_tterm_cd1_p = createHdr_tterm_cd1_ListPutter(Hdr_tterm_cd1, "tterm_cd1", "tterm_nm1");

		}
		return Hdr_tterm_cd1_p;
	}
	
	
	/** [Hdr_tterm_cd2_ListPutter]の定義 */
	private MCListPutter Hdr_tterm_cd2_p = null;

	/**
	 * [Hdr_tterm_cd2_ListPutter]の取得
	 */
	protected MCListPutter getHdr_tterm_cd2_ListPutter() {
		if (Hdr_tterm_cd2_p == null) {
			Hdr_tterm_cd2_p = createHdr_tterm_cd2_ListPutter(Hdr_tterm_cd2, "tterm_cd2", "tterm_nm2");

		}
		return Hdr_tterm_cd2_p;
	}
	
	
	/** [Hdr_tterm_cd3_ListPutter]の定義 */
	private MCListPutter Hdr_tterm_cd3_p = null;

	/**
	 * [Hdr_tterm_cd3_ListPutter]の取得
	 */
	protected MCListPutter getHdr_tterm_cd3_ListPutter() {
		if (Hdr_tterm_cd3_p == null) {
			Hdr_tterm_cd3_p = createHdr_tterm_cd3_ListPutter(Hdr_tterm_cd3, "tterm_cd3", "tterm_nm3");

		}
		return Hdr_tterm_cd3_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","trd_unit_cd","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","wtax_rate","dscnt_itm_flg","itm_bill_crryovr_times","stk_mng_typ");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","trd_unit_cd","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","wtax_rate","dscnt_itm_flg","itm_bill_crryovr_times","stk_mng_typ");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","trd_unit_cd","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","wtax_rate","dscnt_itm_flg","itm_bill_crryovr_times","stk_mng_typ");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","trd_unit_cd","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","wtax_rate","dscnt_itm_flg","itm_bill_crryovr_times","stk_mng_typ");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_cst_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cst_itm_cd_p = null;

	/**
	 * [Dtl_cst_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cst_itm_cd_ListPutter() {
		if (Dtl_cst_itm_cd_p == null) {
			Dtl_cst_itm_cd_p = createDtl_cst_itm_cd_ListPutter(columnDtl_cst_itm_cd, "cst_itm_cd", "cst_itm_nm","itm_cd","itm_sub1","itm_sub2","itm_sub3");

		}
		return Dtl_cst_itm_cd_p;
	}
	
	
	/** [Dtl_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_unit_cd_p = null;

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_unit_cd_ListPutter() {
		if (Dtl_trd_unit_cd_p == null) {
			Dtl_trd_unit_cd_p = createDtl_trd_unit_cd_ListPutter(columnDtl_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_rnd_typ");

		}
		return Dtl_trd_unit_cd_p;
	}
	
	
	/** [Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_rate","tax_typ","inc_tax_flg");
		}
		return Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dscnt_rsn_cd_p = null;

	/**
	 * [Dtl_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dscnt_rsn_cd_ListPutter() {
		if (Dtl_dscnt_rsn_cd_p == null) {
			Dtl_dscnt_rsn_cd_p = createDtl_dscnt_rsn_cd_ListPutter(columnDtl_dscnt_rsn_cd, "dscnt_rsn_cd", "dscnt_rsn_nm");

		}
		return Dtl_dscnt_rsn_cd_p;
	}
	
	
	/** [Dtl_dest_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_dest_cd1_p = null;

	/**
	 * [Dtl_dest_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dest_cd1_ListPutter() {
		if (Dtl_dest_cd1_p == null) {
			Dtl_dest_cd1_p = createDtl_dest_cd1_ListPutter(columnDtl_dest_cd1, "dest_cd1", "dest_nm1");

		}
		return Dtl_dest_cd1_p;
	}
	
	
	/** [Dtl_dest_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_dest_cd2_p = null;

	/**
	 * [Dtl_dest_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dest_cd2_ListPutter() {
		if (Dtl_dest_cd2_p == null) {
			Dtl_dest_cd2_p = createDtl_dest_cd2_ListPutter(columnDtl_dest_cd2, "dest_cd2", "dest_nm2");

		}
		return Dtl_dest_cd2_p;
	}
	
	
	/** [Dtl_dest_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_dest_cd3_p = null;

	/**
	 * [Dtl_dest_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dest_cd3_ListPutter() {
		if (Dtl_dest_cd3_p == null) {
			Dtl_dest_cd3_p = createDtl_dest_cd3_ListPutter(columnDtl_dest_cd3, "dest_cd3", "dest_nm3");

		}
		return Dtl_dest_cd3_p;
	}
	
	
	/** [Dtl_slo_no_ListPutter]の定義 */
	private MCListPutter Dtl_slo_no_p = null;

	/**
	 * [Dtl_slo_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_slo_no_ListPutter() {
		if (Dtl_slo_no_p == null) {
			Dtl_slo_no_p = createDtl_slo_no_ListPutter(columnDtl_slo_no, "slo_no", "slo_d_no");

		}
		return Dtl_slo_no_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsDscntReg create(){
		MSBBP_SlsDscntReg p = new MSBBP_SlsDscntReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsDscntReg create(String name){
		MSBBP_SlsDscntReg p = new MSBBP_SlsDscntReg(name);
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
		MSBBP_SlsDscntReg_MC.jbfInitScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbfInitCnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbfInitHdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbfInitHdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbfInitHdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbfInitDtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbfInitBtn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbfInitEastBtn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbInitScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbInitCnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbInitHdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbInitHdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbInitHdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbInitDtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbInitBtn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.jbInitEastBtn((MSBBP_SlsDscntReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_srch_tgt_typ = p.beansFactory.createTextField("Cnd.srch_tgt_typ");
		p.Cnd_srch_tgt_typ_nm_Label = p.beansFactory.createLabel("Cnd.srch_tgt_typ_nm_Label");
		p.Cnd_srch_tgt_typ_nm = p.beansFactory.createTextField("Cnd.srch_tgt_typ_nm");
		p.Cnd_srch_tgt_typ_nm.setLabel(p.Cnd_srch_tgt_typ_nm_Label);
		p.Cnd_srch_tgt_no = p.beansFactory.createTextField("Cnd.srch_tgt_no");
		p.Cnd_srch_tgt_rev = p.beansFactory.createNumberField("Cnd.srch_tgt_rev");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_srch_sls_dscnt = p.beansFactory.createButton("Cnd.srch_sls_dscnt", "srch");
		p.Cnd_srch_sls = p.beansFactory.createButton("Cnd.srch_sls", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextComboBox("Hdr.trd_cd");
		p.Hdr_trd_cd.setLabel(p.Hdr_trd_cd_Label);
		p.Hdr_trd_nm = p.beansFactory.createTextField("Hdr.trd_nm");
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_ac_ym_Label = p.beansFactory.createLabel("Hdr.ac_ym_Label");
		p.Hdr_ac_ym = p.beansFactory.createDateField("Hdr.ac_ym");
		p.Hdr_ac_ym.setLabel(p.Hdr_ac_ym_Label);
		p.Hdr_sls_act_no_Label = p.beansFactory.createLabel("Hdr.sls_act_no_Label");
		p.Hdr_sls_act_no = p.beansFactory.createTextField("Hdr.sls_act_no");
		p.Hdr_sls_act_no.setLabel(p.Hdr_sls_act_no_Label);
		p.Hdr_sls_act_rev = p.beansFactory.createNumberField("Hdr.sls_act_rev");
		p.Hdr_sls_act_seq = p.beansFactory.createNumberField("Hdr.sls_act_seq");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_dlv_slip_no_Label = p.beansFactory.createLabel("Hdr.dlv_slip_no_Label");
		p.Hdr_dlv_slip_no = p.beansFactory.createTextField("Hdr.dlv_slip_no");
		p.Hdr_dlv_slip_no.setLabel(p.Hdr_dlv_slip_no_Label);
		p.Hdr_sls_dt_Label = p.beansFactory.createLabel("Hdr.sls_dt_Label");
		p.Hdr_sls_dt = p.beansFactory.createDateField("Hdr.sls_dt");
		p.Hdr_sls_dt.setLabel(p.Hdr_sls_dt_Label);
		p.Hdr_bill_basis_dt_Label = p.beansFactory.createLabel("Hdr.bill_basis_dt_Label");
		p.Hdr_bill_basis_dt = p.beansFactory.createDateField("Hdr.bill_basis_dt");
		p.Hdr_bill_basis_dt.setLabel(p.Hdr_bill_basis_dt_Label);
		p.Hdr_sls_slip_out_flg = p.beansFactory.createCheckBox("Hdr.sls_slip_out_flg");
		p.Hdr_sls_slip_prnted_flg = p.beansFactory.createCheckBox("Hdr.sls_slip_prnted_flg");
		p.Hdr_aprv_flg = p.beansFactory.createCheckBox("Hdr.aprv_flg");
		p.Hdr_aprv_ret_flg = p.beansFactory.createCheckBox("Hdr.aprv_ret_flg");
		p.Hdr_aprv_no_Label = p.beansFactory.createLabel("Hdr.aprv_no_Label");
		p.Hdr_aprv_no = p.beansFactory.createTextField("Hdr.aprv_no");
		p.Hdr_aprv_no.setLabel(p.Hdr_aprv_no_Label);
		p.Hdr_aprv_sts_typ_Label = p.beansFactory.createLabel("Hdr.aprv_sts_typ_Label");
		p.Hdr_aprv_sts_typ = p.beansFactory.createTextField("Hdr.aprv_sts_typ");
		p.Hdr_aprv_sts_typ.setLabel(p.Hdr_aprv_sts_typ_Label);
		p.Hdr_aprv_sts_typ_nm = p.beansFactory.createTextField("Hdr.aprv_sts_typ_nm");
		p.Hdr_aprv_upd_flg = p.beansFactory.createCheckBox("Hdr.aprv_upd_flg");
		p.Hdr_aprv_can_flg = p.beansFactory.createCheckBox("Hdr.aprv_can_flg");
		p.Hdr_cst_cd_Label = p.beansFactory.createLabel("Hdr.cst_cd_Label");
		p.Hdr_cst_cd = p.beansFactory.createTextField("Hdr.cst_cd");
		p.Hdr_cst_cd.setLabel(p.Hdr_cst_cd_Label);
		p.Hdr_cst_nm = p.beansFactory.createTextField("Hdr.cst_nm");
		p.Hdr_cst_usr_cd = p.beansFactory.createTextField("Hdr.cst_usr_cd");
		p.Hdr_cst_dpt_cd = p.beansFactory.createTextField("Hdr.cst_dpt_cd");
		p.Hdr_ar_dpt_typ = p.beansFactory.createTextField("Hdr.ar_dpt_typ");
		p.Hdr_cst_bill_crryovr_times = p.beansFactory.createNumberField("Hdr.cst_bill_crryovr_times");
		p.Hdr_cst_iv_flg = p.beansFactory.createCheckBox("Hdr.cst_iv_flg");
		p.Hdr_sls_amt_rnd_typ = p.beansFactory.createTextField("Hdr.sls_amt_rnd_typ");
		p.Hdr_sls_tax_rnd_typ = p.beansFactory.createTextField("Hdr.sls_tax_rnd_typ");
		p.Hdr_dest_cd1_Label = p.beansFactory.createLabel("Hdr.dest_cd1_Label");
		p.Hdr_dest_cd1 = p.beansFactory.createTextField("Hdr.dest_cd1");
		p.Hdr_dest_cd1.setLabel(p.Hdr_dest_cd1_Label);
		p.Hdr_dest_nm1 = p.beansFactory.createTextField("Hdr.dest_nm1");
		p.Hdr_dest_cd2_Label = p.beansFactory.createLabel("Hdr.dest_cd2_Label");
		p.Hdr_dest_cd2 = p.beansFactory.createTextField("Hdr.dest_cd2");
		p.Hdr_dest_cd2.setLabel(p.Hdr_dest_cd2_Label);
		p.Hdr_dest_nm2 = p.beansFactory.createTextField("Hdr.dest_nm2");
		p.Hdr_dest_cd3_Label = p.beansFactory.createLabel("Hdr.dest_cd3_Label");
		p.Hdr_dest_cd3 = p.beansFactory.createTextField("Hdr.dest_cd3");
		p.Hdr_dest_cd3.setLabel(p.Hdr_dest_cd3_Label);
		p.Hdr_dest_nm3 = p.beansFactory.createTextField("Hdr.dest_nm3");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextComboBox("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_trd_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.trd_cur_amt_dec_place");
		p.Hdr_trd_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.trd_cur_upri_dec_place");
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
		p.Hdr_base_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.base_cur_amt_dec_place");
		p.Hdr_base_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.base_cur_upri_dec_place");
		p.Hdr_xrate_cd = p.beansFactory.createTextField("Hdr.xrate_cd");
		p.Hdr_ptax_cur_cd_Label = p.beansFactory.createLabel("Hdr.ptax_cur_cd_Label");
		p.Hdr_ptax_cur_cd = p.beansFactory.createTextField("Hdr.ptax_cur_cd");
		p.Hdr_ptax_cur_cd.setLabel(p.Hdr_ptax_cur_cd_Label);
		p.Hdr_ptax_cur_nm = p.beansFactory.createTextField("Hdr.ptax_cur_nm");
		p.Hdr_ptax_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.ptax_cur_amt_dec_place");
		p.Hdr_ptax_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.ptax_cur_upri_dec_place");
		p.Hdr_cst_po_no_Label = p.beansFactory.createLabel("Hdr.cst_po_no_Label");
		p.Hdr_cst_po_no = p.beansFactory.createTextField("Hdr.cst_po_no");
		p.Hdr_cst_po_no.setLabel(p.Hdr_cst_po_no_Label);
		p.Hdr_acst_cd_Label = p.beansFactory.createLabel("Hdr.acst_cd_Label");
		p.Hdr_acst_cd = p.beansFactory.createTextField("Hdr.acst_cd");
		p.Hdr_acst_cd.setLabel(p.Hdr_acst_cd_Label);
		p.Hdr_acst_nm = p.beansFactory.createTextField("Hdr.acst_nm");
		p.Hdr_ar_dpt_cd_Label = p.beansFactory.createLabel("Hdr.ar_dpt_cd_Label");
		p.Hdr_ar_dpt_cd = p.beansFactory.createTextComboBox("Hdr.ar_dpt_cd");
		p.Hdr_ar_dpt_cd.setLabel(p.Hdr_ar_dpt_cd_Label);
		p.Hdr_ar_dpt_nm = p.beansFactory.createTextField("Hdr.ar_dpt_nm");
		p.Hdr_iv_no_Label = p.beansFactory.createLabel("Hdr.iv_no_Label");
		p.Hdr_iv_no = p.beansFactory.createTextField("Hdr.iv_no");
		p.Hdr_iv_no.setLabel(p.Hdr_iv_no_Label);
		p.Hdr_num_flg = p.beansFactory.createCheckBox("Hdr.num_flg");
		p.Hdr_ref_iv_no_Label = p.beansFactory.createLabel("Hdr.ref_iv_no_Label");
		p.Hdr_ref_iv_no = p.beansFactory.createTextField("Hdr.ref_iv_no");
		p.Hdr_ref_iv_no.setLabel(p.Hdr_ref_iv_no_Label);
		p.Hdr_rcv_schd_dt_Label = p.beansFactory.createLabel("Hdr.rcv_schd_dt_Label");
		p.Hdr_rcv_schd_dt = p.beansFactory.createDateField("Hdr.rcv_schd_dt");
		p.Hdr_rcv_schd_dt.setLabel(p.Hdr_rcv_schd_dt_Label);
		p.Hdr_tterm_cd1_Label = p.beansFactory.createLabel("Hdr.tterm_cd1_Label");
		p.Hdr_tterm_cd1 = p.beansFactory.createTextComboBox("Hdr.tterm_cd1");
		p.Hdr_tterm_cd1.setLabel(p.Hdr_tterm_cd1_Label);
		p.Hdr_tterm_nm1 = p.beansFactory.createTextField("Hdr.tterm_nm1");
		p.Hdr_tterm_rmrks1_Label = p.beansFactory.createLabel("Hdr.tterm_rmrks1_Label");
		p.Hdr_tterm_rmrks1 = p.beansFactory.createTextField("Hdr.tterm_rmrks1");
		p.Hdr_tterm_rmrks1.setLabel(p.Hdr_tterm_rmrks1_Label);
		p.Hdr_tterm_cd2_Label = p.beansFactory.createLabel("Hdr.tterm_cd2_Label");
		p.Hdr_tterm_cd2 = p.beansFactory.createTextComboBox("Hdr.tterm_cd2");
		p.Hdr_tterm_cd2.setLabel(p.Hdr_tterm_cd2_Label);
		p.Hdr_tterm_nm2 = p.beansFactory.createTextField("Hdr.tterm_nm2");
		p.Hdr_tterm_rmrks2_Label = p.beansFactory.createLabel("Hdr.tterm_rmrks2_Label");
		p.Hdr_tterm_rmrks2 = p.beansFactory.createTextField("Hdr.tterm_rmrks2");
		p.Hdr_tterm_rmrks2.setLabel(p.Hdr_tterm_rmrks2_Label);
		p.Hdr_tterm_cd3_Label = p.beansFactory.createLabel("Hdr.tterm_cd3_Label");
		p.Hdr_tterm_cd3 = p.beansFactory.createTextComboBox("Hdr.tterm_cd3");
		p.Hdr_tterm_cd3.setLabel(p.Hdr_tterm_cd3_Label);
		p.Hdr_tterm_nm3 = p.beansFactory.createTextField("Hdr.tterm_nm3");
		p.Hdr_tterm_rmrks3_Label = p.beansFactory.createLabel("Hdr.tterm_rmrks3_Label");
		p.Hdr_tterm_rmrks3 = p.beansFactory.createTextField("Hdr.tterm_rmrks3");
		p.Hdr_tterm_rmrks3.setLabel(p.Hdr_tterm_rmrks3_Label);
		p.Hdr_trd_rmrks_Label = p.beansFactory.createLabel("Hdr.trd_rmrks_Label");
		p.Hdr_trd_rmrks = p.beansFactory.createTextField("Hdr.trd_rmrks");
		p.Hdr_trd_rmrks.setLabel(p.Hdr_trd_rmrks_Label);
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_ref_no = p.beansFactory.createTextField("Hdr.ref_no");
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
		p.Hdr_prnt_lcl_cd = p.beansFactory.createTextField("Hdr.prnt_lcl_cd");
		p.Hdr_bill_cl_typ = p.beansFactory.createTextField("Hdr.bill_cl_typ");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_lot_no_typ = p.beansFactory.createTableColumn("Dtl.lot_no_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_no_typ = p.beansFactory.createTableColumn("Dtl.sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_dscnt_rsn_cd = p.beansFactory.createTableColumn("Dtl.dscnt_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dscnt_rsn_nm = p.beansFactory.createTableColumn("Dtl.dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_bill_crryovr_times = p.beansFactory.createTableColumn("Dtl.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_cst_po_d_no = p.beansFactory.createTableColumn("Dtl.cst_po_d_no", MCColumnType.TEXT);
		p.columnDtl_dest_cd1 = p.beansFactory.createTableColumn("Dtl.dest_cd1", MCColumnType.TEXT);
		p.columnDtl_dest_nm1 = p.beansFactory.createTableColumn("Dtl.dest_nm1", MCColumnType.TEXT);
		p.columnDtl_dest_cd2 = p.beansFactory.createTableColumn("Dtl.dest_cd2", MCColumnType.TEXT);
		p.columnDtl_dest_nm2 = p.beansFactory.createTableColumn("Dtl.dest_nm2", MCColumnType.TEXT);
		p.columnDtl_dest_cd3 = p.beansFactory.createTableColumn("Dtl.dest_cd3", MCColumnType.TEXT);
		p.columnDtl_dest_nm3 = p.beansFactory.createTableColumn("Dtl.dest_nm3", MCColumnType.TEXT);
		p.columnDtl_sls_act_d_no = p.beansFactory.createTableColumn("Dtl.sls_act_d_no", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_wtax_rate = p.beansFactory.createTableColumn("Dtl.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_ref_sls_act_no = p.beansFactory.createTableColumn("Dtl.ref_sls_act_no", MCColumnType.TEXT);
		p.columnDtl_ref_sls_act_rev = p.beansFactory.createTableColumn("Dtl.ref_sls_act_rev", MCColumnType.NUMBER);
		p.columnDtl_ref_sls_act_seq = p.beansFactory.createTableColumn("Dtl.ref_sls_act_seq", MCColumnType.NUMBER);
		p.columnDtl_ref_sls_act_d_no = p.beansFactory.createTableColumn("Dtl.ref_sls_act_d_no", MCColumnType.TEXT);
		p.columnDtl_ref_sls_act_d_seq = p.beansFactory.createTableColumn("Dtl.ref_sls_act_d_seq", MCColumnType.NUMBER);
		p.columnDtl_base_sls_ac_dt = p.beansFactory.createTableColumn("Dtl.base_sls_ac_dt", MCColumnType.DATE);
		p.columnDtl_ref_ac_dt = p.beansFactory.createTableColumn("Dtl.ref_ac_dt", MCColumnType.DATE);
		p.columnDtl_ref_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.ref_trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_ref_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.ref_trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_ref_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.ref_trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ref_trd_cur_inc_tax_amt = p.beansFactory.createTableColumn("Dtl.ref_trd_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtl_ref_tax_cd = p.beansFactory.createTableColumn("Dtl.ref_tax_cd", MCColumnType.TEXT);
		p.columnDtl_ref_tax_nm = p.beansFactory.createTableColumn("Dtl.ref_tax_nm", MCColumnType.TEXT);
		p.columnDtl_ref_tax_rate = p.beansFactory.createTableColumn("Dtl.ref_tax_rate", MCColumnType.NUMBER);
		p.columnDtl_ref_base_cur_inc_tax_amt = p.beansFactory.createTableColumn("Dtl.ref_base_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtl_ref_ptax_cur_inc_tax_amt = p.beansFactory.createTableColumn("Dtl.ref_ptax_cur_inc_tax_amt", MCColumnType.NUMBER);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_itm_bill_crryovr_times = p.beansFactory.createTableColumn("Dtl.itm_bill_crryovr_times", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt01 = p.beansFactory.createButton("Btn.prnt01", "prnt");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins01 = p.beansFactory.createButton("Btn.ins01", "upd");
		p.Btn_upd01 = p.beansFactory.createButton("Btn.upd01", "upd");
		p.Btn_del01 = p.beansFactory.createButton("Btn.del01", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_SlsDscntReg p) {
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
	protected static void jbInitCnd(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1380.CndR.ope_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ);
		p.CndPanel.setLastBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ.setNextBeans(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1380.CndR.srch_tgt_typ_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ_nm.setNextBeans(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1380.CndR.srch_tgt_typ_nm_META);
		p.Cnd_srch_tgt_typ_nm.addLinkBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_no.setNextBeans(p.Cnd_srch_tgt_rev);
		p.Cnd_srch_tgt_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1380.CndR.srch_tgt_no_META);
		p.CndPanel.add(p.Cnd_srch_tgt_rev);
		p.Cnd_srch_tgt_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_srch_tgt_rev.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1380.CndR.srch_tgt_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch_sls_dscnt);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1380.CndR.latest_flg_META);
		p.Cnd_srch_sls_dscnt.setIcon("SEARCH");
		p.Cnd_srch_sls_dscnt.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_sls_dscnt);
		p.Cnd_srch_sls_dscnt.setNextBeans(p.Cnd_srch_sls);
		p.Cnd_srch_sls.setIcon("SEARCH");
		p.Cnd_srch_sls.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_sls);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.Hdr_trd_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cd.setLinkBeans(p.Hdr_trd_nm,p.Hdr_trd_ptn_typ);
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_ac_ym);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_ac_ym_Label);
		p.HdrPanel.add(p.Hdr_ac_ym);
		p.Hdr_ac_ym.setNextBeans(p.Hdr_sls_act_no);
		p.Hdr_ac_ym.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ac_ym_META);
		p.Hdr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_sls_act_no_Label);
		p.HdrPanel.add(p.Hdr_sls_act_no);
		p.Hdr_sls_act_no.setNextBeans(p.Hdr_sls_act_rev);
		p.Hdr_sls_act_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sls_act_no_META);
		p.HdrPanel.add(p.Hdr_sls_act_rev);
		p.Hdr_sls_act_rev.setNextBeans(p.Hdr_sls_act_seq);
		p.Hdr_sls_act_rev.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sls_act_rev_META);
		p.HdrPanel.add(p.Hdr_sls_act_seq);
		p.Hdr_sls_act_seq.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_sls_act_seq.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sls_act_seq_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_dlv_slip_no);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_slip_no_Label);
		p.HdrPanel.add(p.Hdr_dlv_slip_no);
		p.Hdr_dlv_slip_no.setNextBeans(p.Hdr_sls_dt);
		p.Hdr_dlv_slip_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.dlv_slip_no_META);
		p.HdrPanel.add(p.Hdr_sls_dt_Label);
		p.HdrPanel.add(p.Hdr_sls_dt);
		p.Hdr_sls_dt.setNextBeans(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_sls_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sls_dt_META);
		p.Hdr_sls_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_ac_dt_p_PPanel.setNextBeans(p.Hdr_can_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_can_ac_dt_p_PPanel.setNextBeans(p.Hdr_bill_basis_dt);
		p.HdrPanel.add(p.Hdr_bill_basis_dt_Label);
		p.HdrPanel.add(p.Hdr_bill_basis_dt);
		p.Hdr_bill_basis_dt.setNextBeans(p.Hdr_sls_slip_out_flg);
		p.Hdr_bill_basis_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.bill_basis_dt_META);
		p.Hdr_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_sls_slip_out_flg);
		p.Hdr_sls_slip_out_flg.setNextBeans(p.Hdr_sls_slip_prnted_flg);
		p.Hdr_sls_slip_out_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sls_slip_out_flg_META);
		p.HdrPanel.add(p.Hdr_sls_slip_prnted_flg);
		p.Hdr_sls_slip_prnted_flg.setNextBeans(p.Hdr_aprv_flg);
		p.Hdr_sls_slip_prnted_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sls_slip_prnted_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_flg);
		p.Hdr_aprv_flg.setNextBeans(p.Hdr_aprv_ret_flg);
		p.Hdr_aprv_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.aprv_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_ret_flg);
		p.Hdr_aprv_ret_flg.setNextBeans(p.Hdr_aprv_no);
		p.Hdr_aprv_ret_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.aprv_ret_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_no_Label);
		p.HdrPanel.add(p.Hdr_aprv_no);
		p.Hdr_aprv_no.setNextBeans(p.Hdr_aprv_sts_typ);
		p.Hdr_aprv_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.aprv_no_META);
		p.HdrPanel.add(p.Hdr_aprv_sts_typ_Label);
		p.HdrPanel.add(p.Hdr_aprv_sts_typ);
		p.Hdr_aprv_sts_typ.setNextBeans(p.Hdr_aprv_sts_typ_nm);
		p.Hdr_aprv_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.aprv_sts_typ_META);
		p.HdrPanel.add(p.Hdr_aprv_sts_typ_nm);
		p.Hdr_aprv_sts_typ_nm.setNextBeans(p.Hdr_aprv_upd_flg);
		p.Hdr_aprv_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.aprv_sts_typ_nm_META);
		p.HdrPanel.add(p.Hdr_aprv_upd_flg);
		p.Hdr_aprv_upd_flg.setNextBeans(p.Hdr_aprv_can_flg);
		p.Hdr_aprv_upd_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.aprv_upd_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_can_flg);
		p.Hdr_aprv_can_flg.setNextBeans(p.Hdr_cst_cd);
		p.Hdr_aprv_can_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.aprv_can_flg_META);
		p.HdrPanel.add(p.Hdr_cst_cd_Label);
		p.HdrPanel.add(p.Hdr_cst_cd);
		p.Hdr_cst_cd.setNextBeans(p.Hdr_cst_nm);
		p.Hdr_cst_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.cst_cd_META);
		p.Hdr_cst_cd.addLinkBeans(p.Hdr_cst_nm,p.Hdr_ar_dpt_cd,p.Hdr_trd_cur_cd,p.Hdr_tterm_cd1,p.Hdr_tterm_cd2,p.Hdr_tterm_cd3,p.Hdr_acst_cd,p.Hdr_acst_nm,p.Hdr_cst_iv_flg,p.Hdr_sls_amt_rnd_typ,p.Hdr_sls_tax_rnd_typ,p.Hdr_cst_usr_cd,p.Hdr_cst_dpt_cd,p.Hdr_ar_dpt_typ,p.Hdr_cst_bill_crryovr_times,p.Hdr_prnt_lcl_cd,p.Hdr_bill_cl_typ);
		p.Hdr_cst_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_cst_nm);
		p.Hdr_cst_nm.setNextBeans(p.Hdr_cst_usr_cd);
		p.Hdr_cst_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.cst_nm_META);
		p.HdrPanel.add(p.Hdr_cst_usr_cd);
		p.Hdr_cst_usr_cd.setNextBeans(p.Hdr_cst_dpt_cd);
		p.Hdr_cst_usr_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.cst_usr_cd_META);
		p.HdrPanel.add(p.Hdr_cst_dpt_cd);
		p.Hdr_cst_dpt_cd.setNextBeans(p.Hdr_ar_dpt_typ);
		p.Hdr_cst_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.cst_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_ar_dpt_typ);
		p.Hdr_ar_dpt_typ.setNextBeans(p.Hdr_cst_bill_crryovr_times);
		p.Hdr_ar_dpt_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ar_dpt_typ_META);
		p.HdrPanel.add(p.Hdr_cst_bill_crryovr_times);
		p.Hdr_cst_bill_crryovr_times.setNextBeans(p.Hdr_cst_iv_flg);
		p.Hdr_cst_bill_crryovr_times.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.cst_bill_crryovr_times_META);
		p.HdrPanel.add(p.Hdr_cst_iv_flg);
		p.Hdr_cst_iv_flg.setNextBeans(p.Hdr_sls_amt_rnd_typ);
		p.Hdr_cst_iv_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.cst_iv_flg_META);
		p.HdrPanel.add(p.Hdr_sls_amt_rnd_typ);
		p.Hdr_sls_amt_rnd_typ.setNextBeans(p.Hdr_sls_tax_rnd_typ);
		p.Hdr_sls_amt_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sls_amt_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_sls_tax_rnd_typ);
		p.Hdr_sls_tax_rnd_typ.setNextBeans(p.Hdr_dest_cd1);
		p.Hdr_sls_tax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sls_tax_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_dest_cd1_Label);
		p.HdrPanel.add(p.Hdr_dest_cd1);
		p.Hdr_dest_cd1.setNextBeans(p.Hdr_dest_nm1);
		p.Hdr_dest_cd1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.dest_cd1_META);
		p.Hdr_dest_cd1.addLinkBeans(p.Hdr_dest_nm1);
		p.Hdr_dest_cd1.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dest_nm1);
		p.Hdr_dest_nm1.setNextBeans(p.Hdr_dest_cd2);
		p.Hdr_dest_nm1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.dest_nm1_META);
		p.HdrPanel.add(p.Hdr_dest_cd2_Label);
		p.HdrPanel.add(p.Hdr_dest_cd2);
		p.Hdr_dest_cd2.setNextBeans(p.Hdr_dest_nm2);
		p.Hdr_dest_cd2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.dest_cd2_META);
		p.Hdr_dest_cd2.addLinkBeans(p.Hdr_dest_nm2);
		p.Hdr_dest_cd2.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dest_nm2);
		p.Hdr_dest_nm2.setNextBeans(p.Hdr_dest_cd3);
		p.Hdr_dest_nm2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.dest_nm2_META);
		p.HdrPanel.add(p.Hdr_dest_cd3_Label);
		p.HdrPanel.add(p.Hdr_dest_cd3);
		p.Hdr_dest_cd3.setNextBeans(p.Hdr_dest_nm3);
		p.Hdr_dest_cd3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.dest_cd3_META);
		p.Hdr_dest_cd3.addLinkBeans(p.Hdr_dest_nm3);
		p.Hdr_dest_cd3.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dest_nm3);
		p.Hdr_dest_nm3.setNextBeans(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_dest_nm3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.dest_nm3_META);
		p.HdrPanel.add(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_usr_dpt_p_PPanel.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_sls_dpt_nm,p.Hdr_wg_cd,p.Hdr_wg_nm);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.wg_nm_META);
		p.Hdr_trd_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cur_cd.setLinkBeans(p.Hdr_trd_cur_nm,p.Hdr_trd_cur_amt_dec_place,p.Hdr_trd_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setNextBeans(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.trd_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_upri_dec_place.setNextBeans(p.Hdr_cred_bal_p_PPanel);
		p.Hdr_trd_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.trd_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_cred_bal_p_PPanel);
		p.Hdr_cred_bal_p_PPanel.setNextBeans(p.Hdr_base_cur_cd);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_amt_dec_place.setNextBeans(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.base_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_upri_dec_place.setNextBeans(p.Hdr_xrate_p_PPanel);
		p.Hdr_base_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.base_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_p_PPanel.setNextBeans(p.Hdr_xrate_cd);
		p.HdrPanel.add(p.Hdr_xrate_cd);
		p.Hdr_xrate_cd.setNextBeans(p.Hdr_ptax_cur_cd);
		p.Hdr_xrate_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.xrate_cd_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd);
		p.Hdr_ptax_cur_cd.setNextBeans(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ptax_cur_cd_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_nm.setNextBeans(p.Hdr_ptax_xrate_p_PPanel);
		p.Hdr_ptax_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ptax_cur_nm_META);
		p.HdrPanel.add(p.Hdr_ptax_xrate_p_PPanel);
		p.Hdr_ptax_xrate_p_PPanel.setNextBeans(p.Hdr_ptax_cur_amt_dec_place);
		p.HdrPanel.add(p.Hdr_ptax_cur_amt_dec_place);
		p.Hdr_ptax_cur_amt_dec_place.setNextBeans(p.Hdr_ptax_cur_upri_dec_place);
		p.Hdr_ptax_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ptax_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_upri_dec_place);
		p.Hdr_ptax_cur_upri_dec_place.setNextBeans(p.Hdr_trd_cur_amt_p_PPanel);
		p.Hdr_ptax_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ptax_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_p_PPanel);
		p.Hdr_trd_cur_amt_p_PPanel.setNextBeans(p.Hdr_trd_cur_inc_tax_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_trd_cur_inc_tax_amt_p_PPanel);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.setNextBeans(p.Hdr_cst_po_no);
		p.HdrPanel.add(p.Hdr_cst_po_no_Label);
		p.HdrPanel.add(p.Hdr_cst_po_no);
		p.Hdr_cst_po_no.setNextBeans(p.Hdr_acst_cd);
		p.Hdr_cst_po_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.cst_po_no_META);
		p.HdrPanel.add(p.Hdr_acst_cd_Label);
		p.HdrPanel.add(p.Hdr_acst_cd);
		p.Hdr_acst_cd.setNextBeans(p.Hdr_acst_nm);
		p.Hdr_acst_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.acst_cd_META);
		p.Hdr_acst_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_acst_nm);
		p.Hdr_acst_nm.setNextBeans(p.Hdr_ar_dpt_cd);
		p.Hdr_acst_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.acst_nm_META);
		p.Hdr_ar_dpt_cd.setListType(MCListType.STRICT);
		p.Hdr_ar_dpt_cd.setLinkBeans(p.Hdr_ar_dpt_nm);
		p.HdrPanel.add(p.Hdr_ar_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_ar_dpt_cd);
		p.Hdr_ar_dpt_cd.setNextBeans(p.Hdr_ar_dpt_nm);
		p.Hdr_ar_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ar_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_ar_dpt_nm);
		p.Hdr_ar_dpt_nm.setNextBeans(p.Hdr_iv_no);
		p.Hdr_ar_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ar_dpt_nm_META);
		p.HdrPanel.add(p.Hdr_iv_no_Label);
		p.HdrPanel.add(p.Hdr_iv_no);
		p.Hdr_iv_no.setNextBeans(p.Hdr_num_flg);
		p.Hdr_iv_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.iv_no_META);
		p.HdrPanel.add(p.Hdr_num_flg);
		p.Hdr_num_flg.setNextBeans(p.Hdr_ref_iv_no);
		p.Hdr_num_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.num_flg_META);
		p.HdrPanel.add(p.Hdr_ref_iv_no_Label);
		p.HdrPanel.add(p.Hdr_ref_iv_no);
		p.Hdr_ref_iv_no.setNextBeans(p.Hdr_rcv_schd_dt);
		p.Hdr_ref_iv_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ref_iv_no_META);
		p.HdrPanel.add(p.Hdr_rcv_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_rcv_schd_dt);
		p.Hdr_rcv_schd_dt.setNextBeans(p.Hdr_tterm_cd1);
		p.Hdr_rcv_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.rcv_schd_dt_META);
		p.Hdr_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr_tterm_cd1.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd1.setLinkBeans(p.Hdr_tterm_nm1);
		p.HdrPanel.add(p.Hdr_tterm_cd1_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd1);
		p.Hdr_tterm_cd1.setNextBeans(p.Hdr_tterm_nm1);
		p.Hdr_tterm_cd1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.tterm_cd1_META);
		p.HdrPanel.add(p.Hdr_tterm_nm1);
		p.Hdr_tterm_nm1.setNextBeans(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_nm1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.tterm_nm1_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_rmrks1.setNextBeans(p.Hdr_tterm_cd2);
		p.Hdr_tterm_rmrks1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.tterm_rmrks1_META);
		p.Hdr_tterm_cd2.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd2.setLinkBeans(p.Hdr_tterm_nm2);
		p.HdrPanel.add(p.Hdr_tterm_cd2_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd2);
		p.Hdr_tterm_cd2.setNextBeans(p.Hdr_tterm_nm2);
		p.Hdr_tterm_cd2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.tterm_cd2_META);
		p.HdrPanel.add(p.Hdr_tterm_nm2);
		p.Hdr_tterm_nm2.setNextBeans(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_nm2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.tterm_nm2_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_rmrks2.setNextBeans(p.Hdr_tterm_cd3);
		p.Hdr_tterm_rmrks2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.tterm_rmrks2_META);
		p.Hdr_tterm_cd3.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd3.setLinkBeans(p.Hdr_tterm_nm3);
		p.HdrPanel.add(p.Hdr_tterm_cd3_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd3);
		p.Hdr_tterm_cd3.setNextBeans(p.Hdr_tterm_nm3);
		p.Hdr_tterm_cd3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.tterm_cd3_META);
		p.HdrPanel.add(p.Hdr_tterm_nm3);
		p.Hdr_tterm_nm3.setNextBeans(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_nm3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.tterm_nm3_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_rmrks3.setNextBeans(p.Hdr_trd_rmrks);
		p.Hdr_tterm_rmrks3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.tterm_rmrks3_META);
		p.HdrPanel.add(p.Hdr_trd_rmrks_Label);
		p.HdrPanel.add(p.Hdr_trd_rmrks);
		p.Hdr_trd_rmrks.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_trd_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.trd_rmrks_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_ref_no);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.sub_char3_META);
		p.HdrPanel.add(p.Hdr_ref_no);
		p.Hdr_ref_no.setNextBeans(p.Hdr_prnt_lcl_cd);
		p.Hdr_ref_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ref_no_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.upd_srv_req_no_META);
		p.HdrPanel.add(p.Hdr_prnt_lcl_cd);
		p.Hdr_prnt_lcl_cd.setNextBeans(p.Hdr_bill_cl_typ);
		p.Hdr_prnt_lcl_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.prnt_lcl_cd_META);
		p.HdrPanel.add(p.Hdr_bill_cl_typ);
		p.Hdr_bill_cl_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1380.HdrR.bill_cl_typ_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_SlsDscntReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_prnt01.setIcon("PRINT");
		p.Btn_prnt01.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_prnt01);
		p.BtnPanel.setLastBeans(p.Btn_prnt01);
		p.Btn_prnt01.setNextBeans(p.Btn_radd);
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
		p.Btn_rcopy.setNextBeans(p.Btn_menu_move_p_PPanel);
		p.BtnPanel.add(p.Btn_menu_move_p_PPanel);
		p.Btn_menu_move_p_PPanel.setNextBeans(p.Btn_ins01);
		p.Btn_ins01.setIcon("REGISTER");
		p.Btn_ins01.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins01);
		p.Btn_ins01.setNextBeans(p.Btn_upd01);
		p.Btn_upd01.setIcon("REGISTER");
		p.Btn_upd01.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd01);
		p.Btn_del01.setIcon("CANCEL");
		p.Btn_del01.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del01);
		p.EastBtnPanel.add(p.Btn_del01);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBBP_SlsDscntReg p) {
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
		MSBBP_SlsDscntReg_MC.mcInitScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.mcInitCnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.mcInitHdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.mcInitHdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.mcInitHdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.mcInitDtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.mcInitBtn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.mcInitEastBtn((MSBBP_SlsDscntReg)this);

		// [INS]ステータスのモードの設定
		MSBBP_SlsDscntReg_MC.statusInitINS_ScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS_Cnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS_HdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS_Hdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS_Hdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS_Dtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS_Btn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS_EastBtn((MSBBP_SlsDscntReg)this);

		// [INS_REF]ステータスのモードの設定
		MSBBP_SlsDscntReg_MC.statusInitINS__REF_ScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS__REF_Cnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS__REF_HdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS__REF_Hdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS__REF_Hdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS__REF_Dtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS__REF_Btn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitINS__REF_EastBtn((MSBBP_SlsDscntReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBBP_SlsDscntReg_MC.statusInitFIX__I_ScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__I_Cnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__I_HdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__I_Hdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__I_Hdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__I_Dtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__I_Btn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__I_EastBtn((MSBBP_SlsDscntReg)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_SlsDscntReg_MC.statusInitSRCH_ScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitSRCH_Cnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitSRCH_HdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitSRCH_Hdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitSRCH_Hdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitSRCH_Dtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitSRCH_Btn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitSRCH_EastBtn((MSBBP_SlsDscntReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_SlsDscntReg_MC.statusInitUPD_ScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitUPD_Cnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitUPD_HdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitUPD_Hdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitUPD_Hdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitUPD_Dtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitUPD_Btn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitUPD_EastBtn((MSBBP_SlsDscntReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_SlsDscntReg_MC.statusInitFIX__U_ScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__U_Cnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__U_HdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__U_Hdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__U_Hdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__U_Dtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__U_Btn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__U_EastBtn((MSBBP_SlsDscntReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_SlsDscntReg_MC.statusInitDEL_ScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitDEL_Cnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitDEL_HdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitDEL_Hdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitDEL_Hdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitDEL_Dtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitDEL_Btn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitDEL_EastBtn((MSBBP_SlsDscntReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBBP_SlsDscntReg_MC.statusInitFIX__D_ScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__D_Cnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__D_HdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__D_Hdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__D_Hdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__D_Dtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__D_Btn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitFIX__D_EastBtn((MSBBP_SlsDscntReg)this);

		// [REF]ステータスのモードの設定
		MSBBP_SlsDscntReg_MC.statusInitREF_ScreenOpe((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitREF_Cnd((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitREF_HdrTab((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitREF_Hdr((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitREF_Hdr2((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitREF_Dtl((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitREF_Btn((MSBBP_SlsDscntReg)this);
		MSBBP_SlsDscntReg_MC.statusInitREF_EastBtn((MSBBP_SlsDscntReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_SlsDscntReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_SlsDscntReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_srch_tgt_typ.setListListener(p);
		p.Cnd_srch_tgt_typ.addAllListener(p);
		p.Cnd_srch_tgt_typ_nm.setListListener(p);
		p.Cnd_srch_tgt_typ_nm.addAllListener(p);
		p.Cnd_srch_tgt_no.setListListener(p);
		p.Cnd_srch_tgt_no.addAllListener(p);
		p.Cnd_srch_tgt_rev.setListListener(p);
		p.Cnd_srch_tgt_rev.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_srch_sls_dscnt.addAllListener(p);
		p.Cnd_srch_sls_dscnt.setAPMethodName("doCnd_srch_sls_dscnt");
		p.Cnd_srch_sls.addAllListener(p);
		p.Cnd_srch_sls.setAPMethodName("doCnd_srch_sls");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBBP_SlsDscntReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBBP_SlsDscntReg p) {
		p.Hdr_trd_cd.setListListener(p);
		p.Hdr_trd_cd.addAllListener(p);
		p.Hdr_trd_nm.setListListener(p);
		p.Hdr_trd_nm.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_ac_ym.setListListener(p);
		p.Hdr_ac_ym.addAllListener(p);
		p.Hdr_sls_act_no.setListListener(p);
		p.Hdr_sls_act_no.addAllListener(p);
		p.Hdr_sls_act_rev.setListListener(p);
		p.Hdr_sls_act_rev.addAllListener(p);
		p.Hdr_sls_act_seq.setListListener(p);
		p.Hdr_sls_act_seq.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_dlv_slip_no.setListListener(p);
		p.Hdr_dlv_slip_no.addAllListener(p);
		p.Hdr_sls_dt.setListListener(p);
		p.Hdr_sls_dt.addAllListener(p);
		p.Hdr_bill_basis_dt.setListListener(p);
		p.Hdr_bill_basis_dt.addAllListener(p);
		p.Hdr_sls_slip_out_flg.addAllListener(p);
		p.Hdr_sls_slip_prnted_flg.addAllListener(p);
		p.Hdr_aprv_flg.addAllListener(p);
		p.Hdr_aprv_ret_flg.addAllListener(p);
		p.Hdr_aprv_no.setListListener(p);
		p.Hdr_aprv_no.addAllListener(p);
		p.Hdr_aprv_sts_typ.setListListener(p);
		p.Hdr_aprv_sts_typ.addAllListener(p);
		p.Hdr_aprv_sts_typ_nm.setListListener(p);
		p.Hdr_aprv_sts_typ_nm.addAllListener(p);
		p.Hdr_aprv_upd_flg.addAllListener(p);
		p.Hdr_aprv_can_flg.addAllListener(p);
		p.Hdr_cst_cd.setListListener(p);
		p.Hdr_cst_cd.addAllListener(p);
		p.Hdr_cst_nm.setListListener(p);
		p.Hdr_cst_nm.addAllListener(p);
		p.Hdr_cst_usr_cd.setListListener(p);
		p.Hdr_cst_usr_cd.addAllListener(p);
		p.Hdr_cst_dpt_cd.setListListener(p);
		p.Hdr_cst_dpt_cd.addAllListener(p);
		p.Hdr_ar_dpt_typ.setListListener(p);
		p.Hdr_ar_dpt_typ.addAllListener(p);
		p.Hdr_cst_bill_crryovr_times.setListListener(p);
		p.Hdr_cst_bill_crryovr_times.addAllListener(p);
		p.Hdr_cst_iv_flg.addAllListener(p);
		p.Hdr_sls_amt_rnd_typ.setListListener(p);
		p.Hdr_sls_amt_rnd_typ.addAllListener(p);
		p.Hdr_sls_tax_rnd_typ.setListListener(p);
		p.Hdr_sls_tax_rnd_typ.addAllListener(p);
		p.Hdr_dest_cd1.setListListener(p);
		p.Hdr_dest_cd1.addAllListener(p);
		p.Hdr_dest_nm1.setListListener(p);
		p.Hdr_dest_nm1.addAllListener(p);
		p.Hdr_dest_cd2.setListListener(p);
		p.Hdr_dest_cd2.addAllListener(p);
		p.Hdr_dest_nm2.setListListener(p);
		p.Hdr_dest_nm2.addAllListener(p);
		p.Hdr_dest_cd3.setListListener(p);
		p.Hdr_dest_cd3.addAllListener(p);
		p.Hdr_dest_nm3.setListListener(p);
		p.Hdr_dest_nm3.addAllListener(p);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_trd_cur_amt_dec_place.setListListener(p);
		p.Hdr_trd_cur_amt_dec_place.addAllListener(p);
		p.Hdr_trd_cur_upri_dec_place.setListListener(p);
		p.Hdr_trd_cur_upri_dec_place.addAllListener(p);
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_base_cur_nm.setListListener(p);
		p.Hdr_base_cur_nm.addAllListener(p);
		p.Hdr_base_cur_amt_dec_place.setListListener(p);
		p.Hdr_base_cur_amt_dec_place.addAllListener(p);
		p.Hdr_base_cur_upri_dec_place.setListListener(p);
		p.Hdr_base_cur_upri_dec_place.addAllListener(p);
		p.Hdr_xrate_cd.setListListener(p);
		p.Hdr_xrate_cd.addAllListener(p);
		p.Hdr_ptax_cur_cd.setListListener(p);
		p.Hdr_ptax_cur_cd.addAllListener(p);
		p.Hdr_ptax_cur_nm.setListListener(p);
		p.Hdr_ptax_cur_nm.addAllListener(p);
		p.Hdr_ptax_cur_amt_dec_place.setListListener(p);
		p.Hdr_ptax_cur_amt_dec_place.addAllListener(p);
		p.Hdr_ptax_cur_upri_dec_place.setListListener(p);
		p.Hdr_ptax_cur_upri_dec_place.addAllListener(p);
		p.Hdr_cst_po_no.setListListener(p);
		p.Hdr_cst_po_no.addAllListener(p);
		p.Hdr_acst_cd.setListListener(p);
		p.Hdr_acst_cd.addAllListener(p);
		p.Hdr_acst_nm.setListListener(p);
		p.Hdr_acst_nm.addAllListener(p);
		p.Hdr_ar_dpt_cd.setListListener(p);
		p.Hdr_ar_dpt_cd.addAllListener(p);
		p.Hdr_ar_dpt_nm.setListListener(p);
		p.Hdr_ar_dpt_nm.addAllListener(p);
		p.Hdr_iv_no.setListListener(p);
		p.Hdr_iv_no.addAllListener(p);
		p.Hdr_num_flg.addAllListener(p);
		p.Hdr_ref_iv_no.setListListener(p);
		p.Hdr_ref_iv_no.addAllListener(p);
		p.Hdr_rcv_schd_dt.setListListener(p);
		p.Hdr_rcv_schd_dt.addAllListener(p);
		p.Hdr_tterm_cd1.setListListener(p);
		p.Hdr_tterm_cd1.addAllListener(p);
		p.Hdr_tterm_nm1.setListListener(p);
		p.Hdr_tterm_nm1.addAllListener(p);
		p.Hdr_tterm_rmrks1.setListListener(p);
		p.Hdr_tterm_rmrks1.addAllListener(p);
		p.Hdr_tterm_cd2.setListListener(p);
		p.Hdr_tterm_cd2.addAllListener(p);
		p.Hdr_tterm_nm2.setListListener(p);
		p.Hdr_tterm_nm2.addAllListener(p);
		p.Hdr_tterm_rmrks2.setListListener(p);
		p.Hdr_tterm_rmrks2.addAllListener(p);
		p.Hdr_tterm_cd3.setListListener(p);
		p.Hdr_tterm_cd3.addAllListener(p);
		p.Hdr_tterm_nm3.setListListener(p);
		p.Hdr_tterm_nm3.addAllListener(p);
		p.Hdr_tterm_rmrks3.setListListener(p);
		p.Hdr_tterm_rmrks3.addAllListener(p);
		p.Hdr_trd_rmrks.setListListener(p);
		p.Hdr_trd_rmrks.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_ref_no.setListListener(p);
		p.Hdr_ref_no.addAllListener(p);
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
		p.Hdr_prnt_lcl_cd.setListListener(p);
		p.Hdr_prnt_lcl_cd.addAllListener(p);
		p.Hdr_bill_cl_typ.setListListener(p);
		p.Hdr_bill_cl_typ.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBBP_SlsDscntReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBBP_SlsDscntReg p) {
		p.DtlTable.addAllListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_lot_no_typ.addAllListener(p);
		p.columnDtl_lot_no_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.columnDtl_sublot_no_typ.addAllListener(p);
		p.columnDtl_sublot_no_typ.setListListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
		p.columnDtl_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_dscnt_rsn_cd.addAllListener(p);
		p.columnDtl_dscnt_rsn_cd.setListListener(p);
		p.columnDtl_dscnt_rsn_nm.addAllListener(p);
		p.columnDtl_dscnt_rsn_nm.setListListener(p);
		p.columnDtl_bill_crryovr_times.addAllListener(p);
		p.columnDtl_bill_crryovr_times.setListListener(p);
		p.columnDtl_cst_po_d_no.addAllListener(p);
		p.columnDtl_cst_po_d_no.setListListener(p);
		p.columnDtl_dest_cd1.addAllListener(p);
		p.columnDtl_dest_cd1.setListListener(p);
		p.columnDtl_dest_nm1.addAllListener(p);
		p.columnDtl_dest_nm1.setListListener(p);
		p.columnDtl_dest_cd2.addAllListener(p);
		p.columnDtl_dest_cd2.setListListener(p);
		p.columnDtl_dest_nm2.addAllListener(p);
		p.columnDtl_dest_nm2.setListListener(p);
		p.columnDtl_dest_cd3.addAllListener(p);
		p.columnDtl_dest_cd3.setListListener(p);
		p.columnDtl_dest_nm3.addAllListener(p);
		p.columnDtl_dest_nm3.setListListener(p);
		p.columnDtl_sls_act_d_no.addAllListener(p);
		p.columnDtl_sls_act_d_no.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_wtax_rate.addAllListener(p);
		p.columnDtl_wtax_rate.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_ref_sls_act_no.addAllListener(p);
		p.columnDtl_ref_sls_act_no.setListListener(p);
		p.columnDtl_ref_sls_act_rev.addAllListener(p);
		p.columnDtl_ref_sls_act_rev.setListListener(p);
		p.columnDtl_ref_sls_act_seq.addAllListener(p);
		p.columnDtl_ref_sls_act_seq.setListListener(p);
		p.columnDtl_ref_sls_act_d_no.addAllListener(p);
		p.columnDtl_ref_sls_act_d_no.setListListener(p);
		p.columnDtl_ref_sls_act_d_seq.addAllListener(p);
		p.columnDtl_ref_sls_act_d_seq.setListListener(p);
		p.columnDtl_base_sls_ac_dt.addAllListener(p);
		p.columnDtl_base_sls_ac_dt.setListListener(p);
		p.columnDtl_ref_ac_dt.addAllListener(p);
		p.columnDtl_ref_ac_dt.setListListener(p);
		p.columnDtl_ref_trd_unit_cd.addAllListener(p);
		p.columnDtl_ref_trd_unit_cd.setListListener(p);
		p.columnDtl_ref_trd_unit_nm.addAllListener(p);
		p.columnDtl_ref_trd_unit_nm.setListListener(p);
		p.columnDtl_ref_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_ref_trd_unit_dec_place.setListListener(p);
		p.columnDtl_ref_trd_cur_inc_tax_amt.addAllListener(p);
		p.columnDtl_ref_trd_cur_inc_tax_amt.setListListener(p);
		p.columnDtl_ref_tax_cd.addAllListener(p);
		p.columnDtl_ref_tax_cd.setListListener(p);
		p.columnDtl_ref_tax_nm.addAllListener(p);
		p.columnDtl_ref_tax_nm.setListListener(p);
		p.columnDtl_ref_tax_rate.addAllListener(p);
		p.columnDtl_ref_tax_rate.setListListener(p);
		p.columnDtl_ref_base_cur_inc_tax_amt.addAllListener(p);
		p.columnDtl_ref_base_cur_inc_tax_amt.setListListener(p);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.addAllListener(p);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_itm_bill_crryovr_times.addAllListener(p);
		p.columnDtl_itm_bill_crryovr_times.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_SlsDscntReg p) {
		p.Btn_prnt01.addAllListener(p);
		p.Btn_prnt01.setAPMethodName("doBtn_prnt01");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_ins01.addAllListener(p);
		p.Btn_ins01.setAPMethodName("doBtn_ins01");
		p.Btn_upd01.addAllListener(p);
		p.Btn_upd01.setAPMethodName("doBtn_upd01");
		p.Btn_del01.addAllListener(p);
		p.Btn_del01.setAPMethodName("doBtn_del01");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBBP_SlsDscntReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBBP_SlsDscntReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBBP_SlsDscntReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch_sls_dscnt.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBBP_SlsDscntReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBBP_SlsDscntReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_sls_slip_out_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_sls_slip_prnted_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_ret_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_cst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sls_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_dest_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_dest_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_dest_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cred_bal_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_acst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ar_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_num_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ref_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcv_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_tterm_cd1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ref_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBBP_SlsDscntReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBBP_SlsDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_dscnt_rsn_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_dscnt_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_cst_po_d_no.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtl_dest_cd1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dest_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dest_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dest_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_slo_d_no.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_ref_sls_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ref_sls_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_d_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_ref_ac_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_ref_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ref_trd_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_ref_trd_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_trd_cur_inc_tax_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_ref_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_base_cur_inc_tax_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBBP_SlsDscntReg p){
		p.Btn_prnt01.putMode(p, INS, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins01.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd01.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBBP_SlsDscntReg p){

	}

	/**
	 * [INS_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF_ScreenOpe(MSBBP_SlsDscntReg p){

	}

	/**
	 * [INS_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF_Cnd(MSBBP_SlsDscntReg p){
		p.Cnd_ope_Group.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Cnd_srch_sls_dscnt.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Cnd_srch_sls.putMode(p, INS_REF, MCMode.ENABLE);

	}

	/**
	 * [INS_REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF_HdrTab(MSBBP_SlsDscntReg p){

	}

	/**
	 * [INS_REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF_Hdr(MSBBP_SlsDscntReg p){
		p.Hdr_trd_cd.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Hdr_trd_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Hdr_sls_slip_out_flg.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Hdr_sls_slip_prnted_flg.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_aprv_ret_flg.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Hdr_cst_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_sls_amt_rnd_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_dest_nm1.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_dest_nm2.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_dest_nm3.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_cred_bal_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_xrate_cd.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_acst_cd.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Hdr_ar_dpt_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_num_flg.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_ref_iv_no.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_rcv_schd_dt.putMode(p, INS_REF, MCMode.REQUIRED);
		p.Hdr_tterm_cd1.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_trd_rmrks.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_REF, MCMode.ENABLE);
		p.Hdr_ref_no.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, INS_REF, MCMode.INVISIBLE);

	}

	/**
	 * [INS_REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF_Hdr2(MSBBP_SlsDscntReg p){

	}

	/**
	 * [INS_REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF_Dtl(MSBBP_SlsDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_stk_mng_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, INS_REF, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_dscnt_rsn_cd.putMode(p, INS_REF, MCMode.REQUIRED);
		p.columnDtl_dscnt_rsn_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, INS_REF, MCMode.REQUIRED);
		p.columnDtl_cst_po_d_no.putMode(p, INS_REF, MCMode.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS_REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtl_dest_cd1.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_dest_nm1.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_dest_nm2.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_dest_nm3.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_slo_d_no.putMode(p, INS_REF, MCMode.ENABLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS_REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, INS_REF, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_ref_sls_act_no.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_rev.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_seq.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_ref_sls_act_d_no.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_d_seq.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, INS_REF, MCMode.ENABLE);
		p.columnDtl_ref_ac_dt.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Dtl_ref_trd_unit_qty_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ref_trd_unit_cd.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_dec_place.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Dtl_ref_trd_cur_upri_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_trd_cur_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_trd_cur_inc_tax_amt.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_cd.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_nm.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_rate.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Dtl_ref_base_cur_upri_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_base_cur_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_base_cur_inc_tax_amt.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.putStatus(INS_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_REF, MCMode.READ_ONLY);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, INS_REF, MCMode.INVISIBLE);

	}

	/**
	 * [INS_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF_Btn(MSBBP_SlsDscntReg p){
		p.Btn_prnt01.putMode(p, INS_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_REF, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS_REF, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS_REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins01.putMode(p, INS_REF, MCMode.ENABLE);
		p.Btn_upd01.putMode(p, INS_REF, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, INS_REF, MCMode.DISABLE);

	}

	/**
	 * [INS_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__REF_EastBtn(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBBP_SlsDscntReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_sls_dscnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Cnd_srch_sls.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBBP_SlsDscntReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_slip_out_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_slip_prnted_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_ret_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sls_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cred_bal_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_num_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ref_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBBP_SlsDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_dscnt_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ref_sls_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_d_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_ref_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ref_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_ref_trd_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_trd_cur_inc_tax_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_ref_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_base_cur_inc_tax_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBBP_SlsDscntReg p){
		p.Btn_prnt01.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins01.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd01.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del01.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBBP_SlsDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_SlsDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_SlsDscntReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_sls_dscnt.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBBP_SlsDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBBP_SlsDscntReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_slip_out_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_slip_prnted_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_ret_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cred_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_num_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ref_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, SRCH, MCMode.INVISIBLE);
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
		p.Hdr_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBBP_SlsDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBBP_SlsDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_dscnt_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ref_sls_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_ref_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ref_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_ref_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_trd_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_ref_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_base_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBBP_SlsDscntReg p){
		p.Btn_prnt01.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins01.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd01.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del01.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBBP_SlsDscntReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_SlsDscntReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_SlsDscntReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_sls_dscnt.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBBP_SlsDscntReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBBP_SlsDscntReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_sls_slip_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_sls_slip_prnted_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_ret_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sls_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cred_bal_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_acst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ar_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_num_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ref_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcv_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_tterm_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ref_no.putMode(p, UPD, MCMode.INVISIBLE);
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
		p.Hdr_prnt_lcl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBBP_SlsDscntReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBBP_SlsDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_dscnt_rsn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dscnt_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cst_po_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtl_dest_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_slo_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ref_sls_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ref_sls_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ref_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ref_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ref_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ref_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_trd_cur_inc_tax_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ref_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_base_cur_inc_tax_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_SlsDscntReg p){
		p.Btn_prnt01.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins01.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd01.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del01.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_SlsDscntReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_sls_dscnt.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBBP_SlsDscntReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_slip_out_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_slip_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_ret_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sls_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cred_bal_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_num_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ref_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, FIX_U, MCMode.INVISIBLE);
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
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBBP_SlsDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_dscnt_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ref_sls_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_ref_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ref_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_ref_trd_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_trd_cur_inc_tax_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_ref_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_base_cur_inc_tax_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBBP_SlsDscntReg p){
		p.Btn_prnt01.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins01.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd01.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del01.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBBP_SlsDscntReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_SlsDscntReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_SlsDscntReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_sls_dscnt.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBBP_SlsDscntReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBBP_SlsDscntReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_slip_out_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Hdr_sls_slip_prnted_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_ret_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sls_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cred_bal_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_num_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ref_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, DEL, MCMode.INVISIBLE);
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
		p.Hdr_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBBP_SlsDscntReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBBP_SlsDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_dscnt_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ref_sls_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ref_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ref_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_ref_trd_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_trd_cur_inc_tax_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ref_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_base_cur_inc_tax_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBBP_SlsDscntReg p){
		p.Btn_prnt01.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins01.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd01.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del01.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBBP_SlsDscntReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_sls_dscnt.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBBP_SlsDscntReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_slip_out_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_slip_prnted_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_ret_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sls_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cred_bal_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_num_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ref_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, FIX_D, MCMode.INVISIBLE);
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
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBBP_SlsDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBBP_SlsDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_dscnt_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ref_sls_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_d_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_ref_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ref_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_ref_trd_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_trd_cur_inc_tax_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_ref_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_base_cur_inc_tax_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBBP_SlsDscntReg p){
		p.Btn_prnt01.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins01.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd01.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del01.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBBP_SlsDscntReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_SlsDscntReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_SlsDscntReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_sls_dscnt.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch_sls.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBBP_SlsDscntReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBBP_SlsDscntReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_slip_out_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_slip_prnted_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_ret_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sls_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cred_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_num_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ref_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, REF, MCMode.INVISIBLE);
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
		p.Hdr_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBBP_SlsDscntReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBBP_SlsDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_dscnt_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ref_sls_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_sls_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_sls_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ref_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ref_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ref_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_trd_cur_inc_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ref_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_base_cur_inc_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ref_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ref_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBBP_SlsDscntReg p){
		p.Btn_prnt01.putMode(p, REF, MCMode.ENABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins01.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd01.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del01.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBBP_SlsDscntReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_SlsDscntReg_MC.setTableConfigDtl((MSBBP_SlsDscntReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBBP_SlsDscntReg p) {
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_trd_unit_cd, p.columnDtl_lot_mng_typ, p.columnDtl_lot_no_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sublot_no_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_wtax_rate, p.columnDtl_dscnt_itm_flg, p.columnDtl_itm_bill_crryovr_times, p.columnDtl_stk_mng_typ);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_trd_unit_cd, p.columnDtl_lot_mng_typ, p.columnDtl_lot_no_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sublot_no_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_wtax_rate, p.columnDtl_dscnt_itm_flg, p.columnDtl_itm_bill_crryovr_times, p.columnDtl_stk_mng_typ);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_trd_unit_cd, p.columnDtl_lot_mng_typ, p.columnDtl_lot_no_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sublot_no_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_wtax_rate, p.columnDtl_dscnt_itm_flg, p.columnDtl_itm_bill_crryovr_times, p.columnDtl_stk_mng_typ);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_trd_unit_cd, p.columnDtl_lot_mng_typ, p.columnDtl_lot_no_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sublot_no_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_wtax_rate, p.columnDtl_dscnt_itm_flg, p.columnDtl_itm_bill_crryovr_times, p.columnDtl_stk_mng_typ);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.cst_itm_cd_META);
		p.columnDtl_cst_itm_cd.addLinkBeans(p.columnDtl_cst_itm_nm,p.columnDtl_itm_cd,p.columnDtl_itm_sub1,p.columnDtl_itm_sub2,p.columnDtl_itm_sub3);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_lot_no_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.lot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no_typ);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.columnDtl_sublot_no_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sublot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no_typ);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_conv_qty,p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_rate, p.columnDtl_tax_typ, p.columnDtl_inc_tax_flg);
		p.DtlTable.addTable(p.Dtl_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.columnDtl_dscnt_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.dscnt_rsn_cd_META);
		p.columnDtl_dscnt_rsn_cd.addLinkBeans(p.columnDtl_dscnt_rsn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_rsn_cd);
		p.columnDtl_dscnt_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.dscnt_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_rsn_nm);
		p.columnDtl_bill_crryovr_times.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.bill_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_crryovr_times);
		p.columnDtl_cst_po_d_no.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.cst_po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_d_no);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_dest_cd1.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.dest_cd1_META);
		p.columnDtl_dest_cd1.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd1.addLinkBeans(p.columnDtl_dest_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd1);
		p.columnDtl_dest_nm1.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.dest_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm1);
		p.columnDtl_dest_cd2.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.dest_cd2_META);
		p.columnDtl_dest_cd2.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd2.addLinkBeans(p.columnDtl_dest_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd2);
		p.columnDtl_dest_nm2.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.dest_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm2);
		p.columnDtl_dest_cd3.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.dest_cd3_META);
		p.columnDtl_dest_cd3.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd3.addLinkBeans(p.columnDtl_dest_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd3);
		p.columnDtl_dest_nm3.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.dest_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm3);
		p.columnDtl_sls_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sls_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_d_no);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.slo_no_META);
		p.columnDtl_slo_no.setListType(MCListType.STRICT);
		p.columnDtl_slo_no.addLinkBeans(p.columnDtl_slo_d_no);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.DtlTable.addTable(p.Dtl_lot_no_p_PPanel.LotNoTable);
		p.columnDtl_wtax_rate.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rate);
		p.DtlTable.addTable(p.Dtl_wtax_amt_p_PPanel.AmtTable);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_ref_sls_act_no.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_sls_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_sls_act_no);
		p.columnDtl_ref_sls_act_rev.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_sls_act_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_sls_act_rev);
		p.columnDtl_ref_sls_act_seq.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_sls_act_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_sls_act_seq);
		p.columnDtl_ref_sls_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_sls_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_sls_act_d_no);
		p.columnDtl_ref_sls_act_d_seq.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_sls_act_d_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_sls_act_d_seq);
		p.columnDtl_base_sls_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.base_sls_ac_dt_META);
		p.columnDtl_base_sls_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_sls_ac_dt);
		p.columnDtl_ref_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_ac_dt_META);
		p.columnDtl_ref_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_ac_dt);
		p.DtlTable.addTable(p.Dtl_ref_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_ref_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_trd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_trd_unit_cd);
		p.columnDtl_ref_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_trd_unit_nm);
		p.columnDtl_ref_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_trd_unit_dec_place);
		p.DtlTable.addTable(p.Dtl_ref_trd_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ref_trd_cur_amt_p_PPanel.AmtTable);
		p.columnDtl_ref_trd_cur_inc_tax_amt.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_trd_cur_inc_tax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_trd_cur_inc_tax_amt);
		p.columnDtl_ref_tax_cd.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_tax_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_tax_cd);
		p.columnDtl_ref_tax_nm.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_tax_nm);
		p.columnDtl_ref_tax_rate.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_tax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_tax_rate);
		p.DtlTable.addTable(p.Dtl_ref_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ref_base_cur_amt_p_PPanel.AmtTable);
		p.columnDtl_ref_base_cur_inc_tax_amt.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_base_cur_inc_tax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_base_cur_inc_tax_amt);
		p.DtlTable.addTable(p.Dtl_ref_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ref_ptax_cur_amt_p_PPanel.AmtTable);
		p.columnDtl_ref_ptax_cur_inc_tax_amt.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.ref_ptax_cur_inc_tax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_ptax_cur_inc_tax_amt);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_itm_bill_crryovr_times.setMeta(mcframe.clientMSBB.MSBBP1380.DtlR.itm_bill_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_bill_crryovr_times);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_srch_tgt_typ_nm.getListConfig().setPutter(getCnd_srch_tgt_typ_nm_ListPutter());
		Hdr_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cd.getListConfig().setPutter(getHdr_trd_cd_ListPutter());
		Hdr_cst_cd.getListConfig().setPutter(getHdr_cst_cd_ListPutter());
		Hdr_dest_cd1.getListConfig().setPutter(getHdr_dest_cd1_ListPutter());
		Hdr_dest_cd2.getListConfig().setPutter(getHdr_dest_cd2_ListPutter());
		Hdr_dest_cd3.getListConfig().setPutter(getHdr_dest_cd3_ListPutter());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cur_cd.getListConfig().setPutter(getHdr_trd_cur_cd_ListPutter());
		Hdr_acst_cd.getListConfig().setPutter(getHdr_acst_cd_ListPutter());
		Hdr_ar_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ar_dpt_cd.getListConfig().setPutter(getHdr_ar_dpt_cd_ListPutter());
		Hdr_tterm_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd1.getListConfig().setPutter(getHdr_tterm_cd1_ListPutter());
		Hdr_tterm_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd2.getListConfig().setPutter(getHdr_tterm_cd2_ListPutter());
		Hdr_tterm_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd3.getListConfig().setPutter(getHdr_tterm_cd3_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_cst_itm_cd.getListConfig().setPutter(getDtl_cst_itm_cd_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		columnDtl_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dscnt_rsn_cd.getListConfig().setPutter(getDtl_dscnt_rsn_cd_ListPutter());
		columnDtl_dest_cd1.getListConfig().setPutter(getDtl_dest_cd1_ListPutter());
		columnDtl_dest_cd2.getListConfig().setPutter(getDtl_dest_cd2_ListPutter());
		columnDtl_dest_cd3.getListConfig().setPutter(getDtl_dest_cd3_ListPutter());
		columnDtl_slo_no.getListConfig().setPutter(getDtl_slo_no_ListPutter());
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_REFStatus() {
		status = INS_REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
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
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (INS_REF.equals(status)) {
			setINS_REFStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
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
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_srch_tgt_typ_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_srch_tgt_typ_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.SlsSrchTgtTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Hdr_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_dest_cd1_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dest_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_dest_cd2_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dest_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_dest_cd3_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dest_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Hdr_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Hdr_acst_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_acst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Hdr_tterm_cd1_ListPutter]の作成
	 */
	protected MCListPutter createHdr_tterm_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm1");
		return lp;
	}
	 
	/**
	 * [Hdr_tterm_cd2_ListPutter]の作成
	 */
	protected MCListPutter createHdr_tterm_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm2");
		return lp;
	}
	 
	/**
	 * [Hdr_tterm_cd3_ListPutter]の作成
	 */
	protected MCListPutter createHdr_tterm_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm3");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl_cst_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}

	/**
	 * [Dtl_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsDscntBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_dest_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dest_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_dest_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dest_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_dest_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dest_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_slo_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_slo_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SloNo");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_srch_tgt_typ_nm) return getCnd_srch_tgt_typ_nm(row, info);
		if(combo == Hdr_trd_cd) return getHdr_trd_cd(row, info);
		if(combo == Hdr_cst_cd) return getHdr_cst_cd(row, info);
		if(combo == Hdr_dest_cd1) return getHdr_dest_cd1(row, info);
		if(combo == Hdr_dest_cd2) return getHdr_dest_cd2(row, info);
		if(combo == Hdr_dest_cd3) return getHdr_dest_cd3(row, info);
		if(combo == Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_trd_cur_cd) return getHdr_trd_cur_cd(row, info);
		if(combo == Hdr_acst_cd) return getHdr_acst_cd(row, info);
		if(combo == Hdr_ar_dpt_cd) return getHdr_ar_dpt_cd(row, info);
		if(combo == Hdr_tterm_cd1) return getHdr_tterm_cd1(row, info);
		if(combo == Hdr_tterm_cd2) return getHdr_tterm_cd2(row, info);
		if(combo == Hdr_tterm_cd3) return getHdr_tterm_cd3(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_cst_itm_cd) return getDtl_cst_itm_cd(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == columnDtl_dscnt_rsn_cd) return getDtl_dscnt_rsn_cd(row, info);
		if(combo == columnDtl_dest_cd1) return getDtl_dest_cd1(row, info);
		if(combo == columnDtl_dest_cd2) return getDtl_dest_cd2(row, info);
		if(combo == columnDtl_dest_cd3) return getDtl_dest_cd3(row, info);
		if(combo == columnDtl_slo_no) return getDtl_slo_no(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_sls_dscnt) doCnd_srch_sls_dscnt(info);
		else if (ap == Cnd_srch_sls) doCnd_srch_sls(info);
		else if (ap == Btn_prnt01) doBtn_prnt01(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins01) doBtn_ins01(info);
		else if (ap == Btn_upd01) doBtn_upd01(info);
		else if (ap == Btn_del01) doBtn_del01(info);
	}

	/**
	 * [Cnd]パネルの[srch_sls_dscnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_sls_dscnt(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_sls]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_sls(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt01(MCEventInfo info);

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
	 * [Btn]パネルの[ins01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins01(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd01(MCEventInfo info);

	/**
	 * [Btn]パネルの[del01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del01(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_srch_tgt_typ) return doCnd_srch_tgt_typ_VC(info);
		if (vc == Cnd_srch_tgt_typ_nm) return doCnd_srch_tgt_typ_nm_VC(info);
		if (vc == Cnd_srch_tgt_no) return doCnd_srch_tgt_no_VC(info);
		if (vc == Cnd_srch_tgt_rev) return doCnd_srch_tgt_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_ac_ym) return doHdr_ac_ym_VC(info);
		if (vc == Hdr_sls_act_no) return doHdr_sls_act_no_VC(info);
		if (vc == Hdr_sls_act_rev) return doHdr_sls_act_rev_VC(info);
		if (vc == Hdr_sls_act_seq) return doHdr_sls_act_seq_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_dlv_slip_no) return doHdr_dlv_slip_no_VC(info);
		if (vc == Hdr_sls_dt) return doHdr_sls_dt_VC(info);
		if (vc == Hdr_bill_basis_dt) return doHdr_bill_basis_dt_VC(info);
		if (vc == Hdr_sls_slip_out_flg) return doHdr_sls_slip_out_flg_VC(info);
		if (vc == Hdr_sls_slip_prnted_flg) return doHdr_sls_slip_prnted_flg_VC(info);
		if (vc == Hdr_aprv_flg) return doHdr_aprv_flg_VC(info);
		if (vc == Hdr_aprv_ret_flg) return doHdr_aprv_ret_flg_VC(info);
		if (vc == Hdr_aprv_no) return doHdr_aprv_no_VC(info);
		if (vc == Hdr_aprv_sts_typ) return doHdr_aprv_sts_typ_VC(info);
		if (vc == Hdr_aprv_sts_typ_nm) return doHdr_aprv_sts_typ_nm_VC(info);
		if (vc == Hdr_aprv_upd_flg) return doHdr_aprv_upd_flg_VC(info);
		if (vc == Hdr_aprv_can_flg) return doHdr_aprv_can_flg_VC(info);
		if (vc == Hdr_cst_cd) return doHdr_cst_cd_VC(info);
		if (vc == Hdr_cst_nm) return doHdr_cst_nm_VC(info);
		if (vc == Hdr_cst_usr_cd) return doHdr_cst_usr_cd_VC(info);
		if (vc == Hdr_cst_dpt_cd) return doHdr_cst_dpt_cd_VC(info);
		if (vc == Hdr_ar_dpt_typ) return doHdr_ar_dpt_typ_VC(info);
		if (vc == Hdr_cst_bill_crryovr_times) return doHdr_cst_bill_crryovr_times_VC(info);
		if (vc == Hdr_cst_iv_flg) return doHdr_cst_iv_flg_VC(info);
		if (vc == Hdr_sls_amt_rnd_typ) return doHdr_sls_amt_rnd_typ_VC(info);
		if (vc == Hdr_sls_tax_rnd_typ) return doHdr_sls_tax_rnd_typ_VC(info);
		if (vc == Hdr_dest_cd1) return doHdr_dest_cd1_VC(info);
		if (vc == Hdr_dest_nm1) return doHdr_dest_nm1_VC(info);
		if (vc == Hdr_dest_cd2) return doHdr_dest_cd2_VC(info);
		if (vc == Hdr_dest_nm2) return doHdr_dest_nm2_VC(info);
		if (vc == Hdr_dest_cd3) return doHdr_dest_cd3_VC(info);
		if (vc == Hdr_dest_nm3) return doHdr_dest_nm3_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_trd_cur_amt_dec_place) return doHdr_trd_cur_amt_dec_place_VC(info);
		if (vc == Hdr_trd_cur_upri_dec_place) return doHdr_trd_cur_upri_dec_place_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_base_cur_amt_dec_place) return doHdr_base_cur_amt_dec_place_VC(info);
		if (vc == Hdr_base_cur_upri_dec_place) return doHdr_base_cur_upri_dec_place_VC(info);
		if (vc == Hdr_xrate_cd) return doHdr_xrate_cd_VC(info);
		if (vc == Hdr_ptax_cur_cd) return doHdr_ptax_cur_cd_VC(info);
		if (vc == Hdr_ptax_cur_nm) return doHdr_ptax_cur_nm_VC(info);
		if (vc == Hdr_ptax_cur_amt_dec_place) return doHdr_ptax_cur_amt_dec_place_VC(info);
		if (vc == Hdr_ptax_cur_upri_dec_place) return doHdr_ptax_cur_upri_dec_place_VC(info);
		if (vc == Hdr_cst_po_no) return doHdr_cst_po_no_VC(info);
		if (vc == Hdr_acst_cd) return doHdr_acst_cd_VC(info);
		if (vc == Hdr_acst_nm) return doHdr_acst_nm_VC(info);
		if (vc == Hdr_ar_dpt_cd) return doHdr_ar_dpt_cd_VC(info);
		if (vc == Hdr_ar_dpt_nm) return doHdr_ar_dpt_nm_VC(info);
		if (vc == Hdr_iv_no) return doHdr_iv_no_VC(info);
		if (vc == Hdr_num_flg) return doHdr_num_flg_VC(info);
		if (vc == Hdr_ref_iv_no) return doHdr_ref_iv_no_VC(info);
		if (vc == Hdr_rcv_schd_dt) return doHdr_rcv_schd_dt_VC(info);
		if (vc == Hdr_tterm_cd1) return doHdr_tterm_cd1_VC(info);
		if (vc == Hdr_tterm_nm1) return doHdr_tterm_nm1_VC(info);
		if (vc == Hdr_tterm_rmrks1) return doHdr_tterm_rmrks1_VC(info);
		if (vc == Hdr_tterm_cd2) return doHdr_tterm_cd2_VC(info);
		if (vc == Hdr_tterm_nm2) return doHdr_tterm_nm2_VC(info);
		if (vc == Hdr_tterm_rmrks2) return doHdr_tterm_rmrks2_VC(info);
		if (vc == Hdr_tterm_cd3) return doHdr_tterm_cd3_VC(info);
		if (vc == Hdr_tterm_nm3) return doHdr_tterm_nm3_VC(info);
		if (vc == Hdr_tterm_rmrks3) return doHdr_tterm_rmrks3_VC(info);
		if (vc == Hdr_trd_rmrks) return doHdr_trd_rmrks_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_ref_no) return doHdr_ref_no_VC(info);
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
		if (vc == Hdr_prnt_lcl_cd) return doHdr_prnt_lcl_cd_VC(info);
		if (vc == Hdr_bill_cl_typ) return doHdr_bill_cl_typ_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_lot_no_typ) return doDtl_lot_no_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_no_typ) return doDtl_sublot_no_typ_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_rnd_typ) return doDtl_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_dscnt_rsn_cd) return doDtl_dscnt_rsn_cd_VC(info);
		if (vc == columnDtl_dscnt_rsn_nm) return doDtl_dscnt_rsn_nm_VC(info);
		if (vc == columnDtl_bill_crryovr_times) return doDtl_bill_crryovr_times_VC(info);
		if (vc == columnDtl_cst_po_d_no) return doDtl_cst_po_d_no_VC(info);
		if (vc == columnDtl_dest_cd1) return doDtl_dest_cd1_VC(info);
		if (vc == columnDtl_dest_nm1) return doDtl_dest_nm1_VC(info);
		if (vc == columnDtl_dest_cd2) return doDtl_dest_cd2_VC(info);
		if (vc == columnDtl_dest_nm2) return doDtl_dest_nm2_VC(info);
		if (vc == columnDtl_dest_cd3) return doDtl_dest_cd3_VC(info);
		if (vc == columnDtl_dest_nm3) return doDtl_dest_nm3_VC(info);
		if (vc == columnDtl_sls_act_d_no) return doDtl_sls_act_d_no_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_wtax_rate) return doDtl_wtax_rate_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_ref_sls_act_no) return doDtl_ref_sls_act_no_VC(info);
		if (vc == columnDtl_ref_sls_act_rev) return doDtl_ref_sls_act_rev_VC(info);
		if (vc == columnDtl_ref_sls_act_seq) return doDtl_ref_sls_act_seq_VC(info);
		if (vc == columnDtl_ref_sls_act_d_no) return doDtl_ref_sls_act_d_no_VC(info);
		if (vc == columnDtl_ref_sls_act_d_seq) return doDtl_ref_sls_act_d_seq_VC(info);
		if (vc == columnDtl_base_sls_ac_dt) return doDtl_base_sls_ac_dt_VC(info);
		if (vc == columnDtl_ref_ac_dt) return doDtl_ref_ac_dt_VC(info);
		if (vc == columnDtl_ref_trd_unit_cd) return doDtl_ref_trd_unit_cd_VC(info);
		if (vc == columnDtl_ref_trd_unit_nm) return doDtl_ref_trd_unit_nm_VC(info);
		if (vc == columnDtl_ref_trd_unit_dec_place) return doDtl_ref_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_ref_trd_cur_inc_tax_amt) return doDtl_ref_trd_cur_inc_tax_amt_VC(info);
		if (vc == columnDtl_ref_tax_cd) return doDtl_ref_tax_cd_VC(info);
		if (vc == columnDtl_ref_tax_nm) return doDtl_ref_tax_nm_VC(info);
		if (vc == columnDtl_ref_tax_rate) return doDtl_ref_tax_rate_VC(info);
		if (vc == columnDtl_ref_base_cur_inc_tax_amt) return doDtl_ref_base_cur_inc_tax_amt_VC(info);
		if (vc == columnDtl_ref_ptax_cur_inc_tax_amt) return doDtl_ref_ptax_cur_inc_tax_amt_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_itm_bill_crryovr_times) return doDtl_itm_bill_crryovr_times_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_rev_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_act_seq_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_slip_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_slip_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_slip_prnted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_slip_prnted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_ret_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_ret_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ar_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ar_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_bill_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dest_nm3_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_upri_dec_place_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ptax_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ptax_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ptax_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ptax_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ar_dpt_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[num_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_num_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ref_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ref_iv_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tterm_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tterm_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tterm_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tterm_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tterm_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tterm_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tterm_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tterm_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_intr_rmrks_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ref_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[prnt_lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prnt_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_mng_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_qty_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dscnt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dscnt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_crryovr_times_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rate_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_sls_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_sls_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_sls_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_sls_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_trd_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_trd_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_base_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_base_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_ptax_cur_inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_ptax_cur_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_bill_crryovr_times_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NC(info);
		else if (nc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NC(info);
		else if (nc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NC(info);
		else if (nc == Cnd_srch_tgt_rev) doCnd_srch_tgt_rev_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_ac_ym) doHdr_ac_ym_NC(info);
		else if (nc == Hdr_sls_act_no) doHdr_sls_act_no_NC(info);
		else if (nc == Hdr_sls_act_rev) doHdr_sls_act_rev_NC(info);
		else if (nc == Hdr_sls_act_seq) doHdr_sls_act_seq_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_dlv_slip_no) doHdr_dlv_slip_no_NC(info);
		else if (nc == Hdr_sls_dt) doHdr_sls_dt_NC(info);
		else if (nc == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NC(info);
		else if (nc == Hdr_sls_slip_out_flg) doHdr_sls_slip_out_flg_NC(info);
		else if (nc == Hdr_sls_slip_prnted_flg) doHdr_sls_slip_prnted_flg_NC(info);
		else if (nc == Hdr_aprv_flg) doHdr_aprv_flg_NC(info);
		else if (nc == Hdr_aprv_ret_flg) doHdr_aprv_ret_flg_NC(info);
		else if (nc == Hdr_aprv_no) doHdr_aprv_no_NC(info);
		else if (nc == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_NC(info);
		else if (nc == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_NC(info);
		else if (nc == Hdr_aprv_upd_flg) doHdr_aprv_upd_flg_NC(info);
		else if (nc == Hdr_aprv_can_flg) doHdr_aprv_can_flg_NC(info);
		else if (nc == Hdr_cst_cd) doHdr_cst_cd_NC(info);
		else if (nc == Hdr_cst_nm) doHdr_cst_nm_NC(info);
		else if (nc == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NC(info);
		else if (nc == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NC(info);
		else if (nc == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_NC(info);
		else if (nc == Hdr_cst_bill_crryovr_times) doHdr_cst_bill_crryovr_times_NC(info);
		else if (nc == Hdr_cst_iv_flg) doHdr_cst_iv_flg_NC(info);
		else if (nc == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_NC(info);
		else if (nc == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_NC(info);
		else if (nc == Hdr_dest_cd1) doHdr_dest_cd1_NC(info);
		else if (nc == Hdr_dest_nm1) doHdr_dest_nm1_NC(info);
		else if (nc == Hdr_dest_cd2) doHdr_dest_cd2_NC(info);
		else if (nc == Hdr_dest_nm2) doHdr_dest_nm2_NC(info);
		else if (nc == Hdr_dest_cd3) doHdr_dest_cd3_NC(info);
		else if (nc == Hdr_dest_nm3) doHdr_dest_nm3_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_xrate_cd) doHdr_xrate_cd_NC(info);
		else if (nc == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NC(info);
		else if (nc == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NC(info);
		else if (nc == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_cst_po_no) doHdr_cst_po_no_NC(info);
		else if (nc == Hdr_acst_cd) doHdr_acst_cd_NC(info);
		else if (nc == Hdr_acst_nm) doHdr_acst_nm_NC(info);
		else if (nc == Hdr_ar_dpt_cd) doHdr_ar_dpt_cd_NC(info);
		else if (nc == Hdr_ar_dpt_nm) doHdr_ar_dpt_nm_NC(info);
		else if (nc == Hdr_iv_no) doHdr_iv_no_NC(info);
		else if (nc == Hdr_num_flg) doHdr_num_flg_NC(info);
		else if (nc == Hdr_ref_iv_no) doHdr_ref_iv_no_NC(info);
		else if (nc == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_NC(info);
		else if (nc == Hdr_tterm_cd1) doHdr_tterm_cd1_NC(info);
		else if (nc == Hdr_tterm_nm1) doHdr_tterm_nm1_NC(info);
		else if (nc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NC(info);
		else if (nc == Hdr_tterm_cd2) doHdr_tterm_cd2_NC(info);
		else if (nc == Hdr_tterm_nm2) doHdr_tterm_nm2_NC(info);
		else if (nc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NC(info);
		else if (nc == Hdr_tterm_cd3) doHdr_tterm_cd3_NC(info);
		else if (nc == Hdr_tterm_nm3) doHdr_tterm_nm3_NC(info);
		else if (nc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NC(info);
		else if (nc == Hdr_trd_rmrks) doHdr_trd_rmrks_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_ref_no) doHdr_ref_no_NC(info);
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
		else if (nc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NC(info);
		else if (nc == Hdr_bill_cl_typ) doHdr_bill_cl_typ_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_lot_no_typ) doDtl_lot_no_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_dscnt_rsn_cd) doDtl_dscnt_rsn_cd_NC(info);
		else if (nc == columnDtl_dscnt_rsn_nm) doDtl_dscnt_rsn_nm_NC(info);
		else if (nc == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NC(info);
		else if (nc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NC(info);
		else if (nc == columnDtl_dest_cd1) doDtl_dest_cd1_NC(info);
		else if (nc == columnDtl_dest_nm1) doDtl_dest_nm1_NC(info);
		else if (nc == columnDtl_dest_cd2) doDtl_dest_cd2_NC(info);
		else if (nc == columnDtl_dest_nm2) doDtl_dest_nm2_NC(info);
		else if (nc == columnDtl_dest_cd3) doDtl_dest_cd3_NC(info);
		else if (nc == columnDtl_dest_nm3) doDtl_dest_nm3_NC(info);
		else if (nc == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_wtax_rate) doDtl_wtax_rate_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_ref_sls_act_no) doDtl_ref_sls_act_no_NC(info);
		else if (nc == columnDtl_ref_sls_act_rev) doDtl_ref_sls_act_rev_NC(info);
		else if (nc == columnDtl_ref_sls_act_seq) doDtl_ref_sls_act_seq_NC(info);
		else if (nc == columnDtl_ref_sls_act_d_no) doDtl_ref_sls_act_d_no_NC(info);
		else if (nc == columnDtl_ref_sls_act_d_seq) doDtl_ref_sls_act_d_seq_NC(info);
		else if (nc == columnDtl_base_sls_ac_dt) doDtl_base_sls_ac_dt_NC(info);
		else if (nc == columnDtl_ref_ac_dt) doDtl_ref_ac_dt_NC(info);
		else if (nc == columnDtl_ref_trd_unit_cd) doDtl_ref_trd_unit_cd_NC(info);
		else if (nc == columnDtl_ref_trd_unit_nm) doDtl_ref_trd_unit_nm_NC(info);
		else if (nc == columnDtl_ref_trd_unit_dec_place) doDtl_ref_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_ref_trd_cur_inc_tax_amt) doDtl_ref_trd_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtl_ref_tax_cd) doDtl_ref_tax_cd_NC(info);
		else if (nc == columnDtl_ref_tax_nm) doDtl_ref_tax_nm_NC(info);
		else if (nc == columnDtl_ref_tax_rate) doDtl_ref_tax_rate_NC(info);
		else if (nc == columnDtl_ref_base_cur_inc_tax_amt) doDtl_ref_base_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtl_ref_ptax_cur_inc_tax_amt) doDtl_ref_ptax_cur_inc_tax_amt_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_itm_bill_crryovr_times) doDtl_itm_bill_crryovr_times_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_rev_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_slip_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_slip_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_slip_prnted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_slip_prnted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_ret_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_ret_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm3_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_upri_dec_place_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[num_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_num_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ref_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_no_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_sls_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_base_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_base_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_ptax_cur_inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_ptax_cur_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_bill_crryovr_times_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NE(info);
		else if (ne == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NE(info);
		else if (ne == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NE(info);
		else if (ne == Cnd_srch_tgt_rev) doCnd_srch_tgt_rev_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_ac_ym) doHdr_ac_ym_NE(info);
		else if (ne == Hdr_sls_act_no) doHdr_sls_act_no_NE(info);
		else if (ne == Hdr_sls_act_rev) doHdr_sls_act_rev_NE(info);
		else if (ne == Hdr_sls_act_seq) doHdr_sls_act_seq_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_dlv_slip_no) doHdr_dlv_slip_no_NE(info);
		else if (ne == Hdr_sls_dt) doHdr_sls_dt_NE(info);
		else if (ne == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NE(info);
		else if (ne == Hdr_sls_slip_out_flg) doHdr_sls_slip_out_flg_NE(info);
		else if (ne == Hdr_sls_slip_prnted_flg) doHdr_sls_slip_prnted_flg_NE(info);
		else if (ne == Hdr_aprv_flg) doHdr_aprv_flg_NE(info);
		else if (ne == Hdr_aprv_ret_flg) doHdr_aprv_ret_flg_NE(info);
		else if (ne == Hdr_aprv_no) doHdr_aprv_no_NE(info);
		else if (ne == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_NE(info);
		else if (ne == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_NE(info);
		else if (ne == Hdr_aprv_upd_flg) doHdr_aprv_upd_flg_NE(info);
		else if (ne == Hdr_aprv_can_flg) doHdr_aprv_can_flg_NE(info);
		else if (ne == Hdr_cst_cd) doHdr_cst_cd_NE(info);
		else if (ne == Hdr_cst_nm) doHdr_cst_nm_NE(info);
		else if (ne == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NE(info);
		else if (ne == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NE(info);
		else if (ne == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_NE(info);
		else if (ne == Hdr_cst_bill_crryovr_times) doHdr_cst_bill_crryovr_times_NE(info);
		else if (ne == Hdr_cst_iv_flg) doHdr_cst_iv_flg_NE(info);
		else if (ne == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_NE(info);
		else if (ne == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_NE(info);
		else if (ne == Hdr_dest_cd1) doHdr_dest_cd1_NE(info);
		else if (ne == Hdr_dest_nm1) doHdr_dest_nm1_NE(info);
		else if (ne == Hdr_dest_cd2) doHdr_dest_cd2_NE(info);
		else if (ne == Hdr_dest_nm2) doHdr_dest_nm2_NE(info);
		else if (ne == Hdr_dest_cd3) doHdr_dest_cd3_NE(info);
		else if (ne == Hdr_dest_nm3) doHdr_dest_nm3_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_xrate_cd) doHdr_xrate_cd_NE(info);
		else if (ne == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NE(info);
		else if (ne == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NE(info);
		else if (ne == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_cst_po_no) doHdr_cst_po_no_NE(info);
		else if (ne == Hdr_acst_cd) doHdr_acst_cd_NE(info);
		else if (ne == Hdr_acst_nm) doHdr_acst_nm_NE(info);
		else if (ne == Hdr_ar_dpt_cd) doHdr_ar_dpt_cd_NE(info);
		else if (ne == Hdr_ar_dpt_nm) doHdr_ar_dpt_nm_NE(info);
		else if (ne == Hdr_iv_no) doHdr_iv_no_NE(info);
		else if (ne == Hdr_num_flg) doHdr_num_flg_NE(info);
		else if (ne == Hdr_ref_iv_no) doHdr_ref_iv_no_NE(info);
		else if (ne == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_NE(info);
		else if (ne == Hdr_tterm_cd1) doHdr_tterm_cd1_NE(info);
		else if (ne == Hdr_tterm_nm1) doHdr_tterm_nm1_NE(info);
		else if (ne == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NE(info);
		else if (ne == Hdr_tterm_cd2) doHdr_tterm_cd2_NE(info);
		else if (ne == Hdr_tterm_nm2) doHdr_tterm_nm2_NE(info);
		else if (ne == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NE(info);
		else if (ne == Hdr_tterm_cd3) doHdr_tterm_cd3_NE(info);
		else if (ne == Hdr_tterm_nm3) doHdr_tterm_nm3_NE(info);
		else if (ne == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NE(info);
		else if (ne == Hdr_trd_rmrks) doHdr_trd_rmrks_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_ref_no) doHdr_ref_no_NE(info);
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
		else if (ne == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NE(info);
		else if (ne == Hdr_bill_cl_typ) doHdr_bill_cl_typ_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_lot_no_typ) doDtl_lot_no_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_dscnt_rsn_cd) doDtl_dscnt_rsn_cd_NE(info);
		else if (ne == columnDtl_dscnt_rsn_nm) doDtl_dscnt_rsn_nm_NE(info);
		else if (ne == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NE(info);
		else if (ne == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NE(info);
		else if (ne == columnDtl_dest_cd1) doDtl_dest_cd1_NE(info);
		else if (ne == columnDtl_dest_nm1) doDtl_dest_nm1_NE(info);
		else if (ne == columnDtl_dest_cd2) doDtl_dest_cd2_NE(info);
		else if (ne == columnDtl_dest_nm2) doDtl_dest_nm2_NE(info);
		else if (ne == columnDtl_dest_cd3) doDtl_dest_cd3_NE(info);
		else if (ne == columnDtl_dest_nm3) doDtl_dest_nm3_NE(info);
		else if (ne == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_wtax_rate) doDtl_wtax_rate_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_ref_sls_act_no) doDtl_ref_sls_act_no_NE(info);
		else if (ne == columnDtl_ref_sls_act_rev) doDtl_ref_sls_act_rev_NE(info);
		else if (ne == columnDtl_ref_sls_act_seq) doDtl_ref_sls_act_seq_NE(info);
		else if (ne == columnDtl_ref_sls_act_d_no) doDtl_ref_sls_act_d_no_NE(info);
		else if (ne == columnDtl_ref_sls_act_d_seq) doDtl_ref_sls_act_d_seq_NE(info);
		else if (ne == columnDtl_base_sls_ac_dt) doDtl_base_sls_ac_dt_NE(info);
		else if (ne == columnDtl_ref_ac_dt) doDtl_ref_ac_dt_NE(info);
		else if (ne == columnDtl_ref_trd_unit_cd) doDtl_ref_trd_unit_cd_NE(info);
		else if (ne == columnDtl_ref_trd_unit_nm) doDtl_ref_trd_unit_nm_NE(info);
		else if (ne == columnDtl_ref_trd_unit_dec_place) doDtl_ref_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_ref_trd_cur_inc_tax_amt) doDtl_ref_trd_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtl_ref_tax_cd) doDtl_ref_tax_cd_NE(info);
		else if (ne == columnDtl_ref_tax_nm) doDtl_ref_tax_nm_NE(info);
		else if (ne == columnDtl_ref_tax_rate) doDtl_ref_tax_rate_NE(info);
		else if (ne == columnDtl_ref_base_cur_inc_tax_amt) doDtl_ref_base_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtl_ref_ptax_cur_inc_tax_amt) doDtl_ref_ptax_cur_inc_tax_amt_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_itm_bill_crryovr_times) doDtl_itm_bill_crryovr_times_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_rev_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_slip_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_slip_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_slip_prnted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_slip_prnted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_ret_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_ret_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm3_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_upri_dec_place_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[num_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_num_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ref_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_no_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_sls_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_base_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_base_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_ptax_cur_inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_ptax_cur_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_bill_crryovr_times_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NX(info);
		else if (nx == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NX(info);
		else if (nx == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NX(info);
		else if (nx == Cnd_srch_tgt_rev) doCnd_srch_tgt_rev_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_ac_ym) doHdr_ac_ym_NX(info);
		else if (nx == Hdr_sls_act_no) doHdr_sls_act_no_NX(info);
		else if (nx == Hdr_sls_act_rev) doHdr_sls_act_rev_NX(info);
		else if (nx == Hdr_sls_act_seq) doHdr_sls_act_seq_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_dlv_slip_no) doHdr_dlv_slip_no_NX(info);
		else if (nx == Hdr_sls_dt) doHdr_sls_dt_NX(info);
		else if (nx == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NX(info);
		else if (nx == Hdr_sls_slip_out_flg) doHdr_sls_slip_out_flg_NX(info);
		else if (nx == Hdr_sls_slip_prnted_flg) doHdr_sls_slip_prnted_flg_NX(info);
		else if (nx == Hdr_aprv_flg) doHdr_aprv_flg_NX(info);
		else if (nx == Hdr_aprv_ret_flg) doHdr_aprv_ret_flg_NX(info);
		else if (nx == Hdr_aprv_no) doHdr_aprv_no_NX(info);
		else if (nx == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_NX(info);
		else if (nx == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_NX(info);
		else if (nx == Hdr_aprv_upd_flg) doHdr_aprv_upd_flg_NX(info);
		else if (nx == Hdr_aprv_can_flg) doHdr_aprv_can_flg_NX(info);
		else if (nx == Hdr_cst_cd) doHdr_cst_cd_NX(info);
		else if (nx == Hdr_cst_nm) doHdr_cst_nm_NX(info);
		else if (nx == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NX(info);
		else if (nx == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NX(info);
		else if (nx == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_NX(info);
		else if (nx == Hdr_cst_bill_crryovr_times) doHdr_cst_bill_crryovr_times_NX(info);
		else if (nx == Hdr_cst_iv_flg) doHdr_cst_iv_flg_NX(info);
		else if (nx == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_NX(info);
		else if (nx == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_NX(info);
		else if (nx == Hdr_dest_cd1) doHdr_dest_cd1_NX(info);
		else if (nx == Hdr_dest_nm1) doHdr_dest_nm1_NX(info);
		else if (nx == Hdr_dest_cd2) doHdr_dest_cd2_NX(info);
		else if (nx == Hdr_dest_nm2) doHdr_dest_nm2_NX(info);
		else if (nx == Hdr_dest_cd3) doHdr_dest_cd3_NX(info);
		else if (nx == Hdr_dest_nm3) doHdr_dest_nm3_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_xrate_cd) doHdr_xrate_cd_NX(info);
		else if (nx == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NX(info);
		else if (nx == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NX(info);
		else if (nx == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_cst_po_no) doHdr_cst_po_no_NX(info);
		else if (nx == Hdr_acst_cd) doHdr_acst_cd_NX(info);
		else if (nx == Hdr_acst_nm) doHdr_acst_nm_NX(info);
		else if (nx == Hdr_ar_dpt_cd) doHdr_ar_dpt_cd_NX(info);
		else if (nx == Hdr_ar_dpt_nm) doHdr_ar_dpt_nm_NX(info);
		else if (nx == Hdr_iv_no) doHdr_iv_no_NX(info);
		else if (nx == Hdr_num_flg) doHdr_num_flg_NX(info);
		else if (nx == Hdr_ref_iv_no) doHdr_ref_iv_no_NX(info);
		else if (nx == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_NX(info);
		else if (nx == Hdr_tterm_cd1) doHdr_tterm_cd1_NX(info);
		else if (nx == Hdr_tterm_nm1) doHdr_tterm_nm1_NX(info);
		else if (nx == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NX(info);
		else if (nx == Hdr_tterm_cd2) doHdr_tterm_cd2_NX(info);
		else if (nx == Hdr_tterm_nm2) doHdr_tterm_nm2_NX(info);
		else if (nx == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NX(info);
		else if (nx == Hdr_tterm_cd3) doHdr_tterm_cd3_NX(info);
		else if (nx == Hdr_tterm_nm3) doHdr_tterm_nm3_NX(info);
		else if (nx == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NX(info);
		else if (nx == Hdr_trd_rmrks) doHdr_trd_rmrks_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_ref_no) doHdr_ref_no_NX(info);
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
		else if (nx == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NX(info);
		else if (nx == Hdr_bill_cl_typ) doHdr_bill_cl_typ_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_lot_no_typ) doDtl_lot_no_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_dscnt_rsn_cd) doDtl_dscnt_rsn_cd_NX(info);
		else if (nx == columnDtl_dscnt_rsn_nm) doDtl_dscnt_rsn_nm_NX(info);
		else if (nx == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NX(info);
		else if (nx == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NX(info);
		else if (nx == columnDtl_dest_cd1) doDtl_dest_cd1_NX(info);
		else if (nx == columnDtl_dest_nm1) doDtl_dest_nm1_NX(info);
		else if (nx == columnDtl_dest_cd2) doDtl_dest_cd2_NX(info);
		else if (nx == columnDtl_dest_nm2) doDtl_dest_nm2_NX(info);
		else if (nx == columnDtl_dest_cd3) doDtl_dest_cd3_NX(info);
		else if (nx == columnDtl_dest_nm3) doDtl_dest_nm3_NX(info);
		else if (nx == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_wtax_rate) doDtl_wtax_rate_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_ref_sls_act_no) doDtl_ref_sls_act_no_NX(info);
		else if (nx == columnDtl_ref_sls_act_rev) doDtl_ref_sls_act_rev_NX(info);
		else if (nx == columnDtl_ref_sls_act_seq) doDtl_ref_sls_act_seq_NX(info);
		else if (nx == columnDtl_ref_sls_act_d_no) doDtl_ref_sls_act_d_no_NX(info);
		else if (nx == columnDtl_ref_sls_act_d_seq) doDtl_ref_sls_act_d_seq_NX(info);
		else if (nx == columnDtl_base_sls_ac_dt) doDtl_base_sls_ac_dt_NX(info);
		else if (nx == columnDtl_ref_ac_dt) doDtl_ref_ac_dt_NX(info);
		else if (nx == columnDtl_ref_trd_unit_cd) doDtl_ref_trd_unit_cd_NX(info);
		else if (nx == columnDtl_ref_trd_unit_nm) doDtl_ref_trd_unit_nm_NX(info);
		else if (nx == columnDtl_ref_trd_unit_dec_place) doDtl_ref_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_ref_trd_cur_inc_tax_amt) doDtl_ref_trd_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtl_ref_tax_cd) doDtl_ref_tax_cd_NX(info);
		else if (nx == columnDtl_ref_tax_nm) doDtl_ref_tax_nm_NX(info);
		else if (nx == columnDtl_ref_tax_rate) doDtl_ref_tax_rate_NX(info);
		else if (nx == columnDtl_ref_base_cur_inc_tax_amt) doDtl_ref_base_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtl_ref_ptax_cur_inc_tax_amt) doDtl_ref_ptax_cur_inc_tax_amt_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_itm_bill_crryovr_times) doDtl_itm_bill_crryovr_times_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_rev_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_slip_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_slip_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_slip_prnted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_slip_prnted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_ret_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_ret_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm3_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_upri_dec_place_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[num_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_num_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ref_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_no_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_sls_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_base_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_base_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_ptax_cur_inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_ptax_cur_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_LC(info);
		else if (lc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_LC(info);
		else if (lc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_LC(info);
		else if (lc == Cnd_srch_tgt_rev) doCnd_srch_tgt_rev_LC(info);
		else if (lc == Hdr_trd_cd) doHdr_trd_cd_LC(info);
		else if (lc == Hdr_trd_nm) doHdr_trd_nm_LC(info);
		else if (lc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_LC(info);
		else if (lc == Hdr_ac_ym) doHdr_ac_ym_LC(info);
		else if (lc == Hdr_sls_act_no) doHdr_sls_act_no_LC(info);
		else if (lc == Hdr_sls_act_rev) doHdr_sls_act_rev_LC(info);
		else if (lc == Hdr_sls_act_seq) doHdr_sls_act_seq_LC(info);
		else if (lc == Hdr_dlv_slip_no) doHdr_dlv_slip_no_LC(info);
		else if (lc == Hdr_sls_dt) doHdr_sls_dt_LC(info);
		else if (lc == Hdr_bill_basis_dt) doHdr_bill_basis_dt_LC(info);
		else if (lc == Hdr_aprv_no) doHdr_aprv_no_LC(info);
		else if (lc == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_LC(info);
		else if (lc == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_LC(info);
		else if (lc == Hdr_cst_cd) doHdr_cst_cd_LC(info);
		else if (lc == Hdr_cst_nm) doHdr_cst_nm_LC(info);
		else if (lc == Hdr_cst_usr_cd) doHdr_cst_usr_cd_LC(info);
		else if (lc == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_LC(info);
		else if (lc == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_LC(info);
		else if (lc == Hdr_cst_bill_crryovr_times) doHdr_cst_bill_crryovr_times_LC(info);
		else if (lc == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_LC(info);
		else if (lc == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_LC(info);
		else if (lc == Hdr_dest_cd1) doHdr_dest_cd1_LC(info);
		else if (lc == Hdr_dest_nm1) doHdr_dest_nm1_LC(info);
		else if (lc == Hdr_dest_cd2) doHdr_dest_cd2_LC(info);
		else if (lc == Hdr_dest_nm2) doHdr_dest_nm2_LC(info);
		else if (lc == Hdr_dest_cd3) doHdr_dest_cd3_LC(info);
		else if (lc == Hdr_dest_nm3) doHdr_dest_nm3_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_xrate_cd) doHdr_xrate_cd_LC(info);
		else if (lc == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_LC(info);
		else if (lc == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_LC(info);
		else if (lc == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_cst_po_no) doHdr_cst_po_no_LC(info);
		else if (lc == Hdr_acst_cd) doHdr_acst_cd_LC(info);
		else if (lc == Hdr_acst_nm) doHdr_acst_nm_LC(info);
		else if (lc == Hdr_ar_dpt_cd) doHdr_ar_dpt_cd_LC(info);
		else if (lc == Hdr_ar_dpt_nm) doHdr_ar_dpt_nm_LC(info);
		else if (lc == Hdr_iv_no) doHdr_iv_no_LC(info);
		else if (lc == Hdr_ref_iv_no) doHdr_ref_iv_no_LC(info);
		else if (lc == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_LC(info);
		else if (lc == Hdr_tterm_cd1) doHdr_tterm_cd1_LC(info);
		else if (lc == Hdr_tterm_nm1) doHdr_tterm_nm1_LC(info);
		else if (lc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_LC(info);
		else if (lc == Hdr_tterm_cd2) doHdr_tterm_cd2_LC(info);
		else if (lc == Hdr_tterm_nm2) doHdr_tterm_nm2_LC(info);
		else if (lc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_LC(info);
		else if (lc == Hdr_tterm_cd3) doHdr_tterm_cd3_LC(info);
		else if (lc == Hdr_tterm_nm3) doHdr_tterm_nm3_LC(info);
		else if (lc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_LC(info);
		else if (lc == Hdr_trd_rmrks) doHdr_trd_rmrks_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_ref_no) doHdr_ref_no_LC(info);
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
		else if (lc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_LC(info);
		else if (lc == Hdr_bill_cl_typ) doHdr_bill_cl_typ_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_lot_no_typ) doDtl_lot_no_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_dscnt_rsn_cd) doDtl_dscnt_rsn_cd_LC(info);
		else if (lc == columnDtl_dscnt_rsn_nm) doDtl_dscnt_rsn_nm_LC(info);
		else if (lc == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_LC(info);
		else if (lc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_LC(info);
		else if (lc == columnDtl_dest_cd1) doDtl_dest_cd1_LC(info);
		else if (lc == columnDtl_dest_nm1) doDtl_dest_nm1_LC(info);
		else if (lc == columnDtl_dest_cd2) doDtl_dest_cd2_LC(info);
		else if (lc == columnDtl_dest_nm2) doDtl_dest_nm2_LC(info);
		else if (lc == columnDtl_dest_cd3) doDtl_dest_cd3_LC(info);
		else if (lc == columnDtl_dest_nm3) doDtl_dest_nm3_LC(info);
		else if (lc == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_wtax_rate) doDtl_wtax_rate_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_ref_sls_act_no) doDtl_ref_sls_act_no_LC(info);
		else if (lc == columnDtl_ref_sls_act_rev) doDtl_ref_sls_act_rev_LC(info);
		else if (lc == columnDtl_ref_sls_act_seq) doDtl_ref_sls_act_seq_LC(info);
		else if (lc == columnDtl_ref_sls_act_d_no) doDtl_ref_sls_act_d_no_LC(info);
		else if (lc == columnDtl_ref_sls_act_d_seq) doDtl_ref_sls_act_d_seq_LC(info);
		else if (lc == columnDtl_base_sls_ac_dt) doDtl_base_sls_ac_dt_LC(info);
		else if (lc == columnDtl_ref_ac_dt) doDtl_ref_ac_dt_LC(info);
		else if (lc == columnDtl_ref_trd_unit_cd) doDtl_ref_trd_unit_cd_LC(info);
		else if (lc == columnDtl_ref_trd_unit_nm) doDtl_ref_trd_unit_nm_LC(info);
		else if (lc == columnDtl_ref_trd_unit_dec_place) doDtl_ref_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_ref_trd_cur_inc_tax_amt) doDtl_ref_trd_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtl_ref_tax_cd) doDtl_ref_tax_cd_LC(info);
		else if (lc == columnDtl_ref_tax_nm) doDtl_ref_tax_nm_LC(info);
		else if (lc == columnDtl_ref_tax_rate) doDtl_ref_tax_rate_LC(info);
		else if (lc == columnDtl_ref_base_cur_inc_tax_amt) doDtl_ref_base_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtl_ref_ptax_cur_inc_tax_amt) doDtl_ref_ptax_cur_inc_tax_amt_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_itm_bill_crryovr_times) doDtl_itm_bill_crryovr_times_LC(info);
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dest_nm3_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_upri_dec_place_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ptax_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ref_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tterm_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_sls_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_sls_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_sls_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_sls_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_trd_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_trd_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_base_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_base_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_ptax_cur_inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_ptax_cur_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getSlsSrchTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_cst_cd]の作成メソッド
	 */
	public MCList getHdr_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dest_cd1]の作成メソッド
	 */
	public MCList getHdr_dest_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dest_cd2]の作成メソッド
	 */
	public MCList getHdr_dest_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dest_cd3]の作成メソッド
	 */
	public MCList getHdr_dest_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cur_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_acst_cd]の作成メソッド
	 */
	public MCList getHdr_acst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ar_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_tterm_cd1]の作成メソッド
	 */
	public MCList getHdr_tterm_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_tterm_cd2]の作成メソッド
	 */
	public MCList getHdr_tterm_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_tterm_cd3]の作成メソッド
	 */
	public MCList getHdr_tterm_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cst_itm_cd]の作成メソッド
	 */
	public MCList getDtl_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dest_cd1]の作成メソッド
	 */
	public MCList getDtl_dest_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dest_cd2]の作成メソッド
	 */
	public MCList getDtl_dest_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dest_cd3]の作成メソッド
	 */
	public MCList getDtl_dest_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_slo_no]の作成メソッド
	 */
	public MCList getDtl_slo_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSloNo(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1380.Srch01")) {
			return new MS_MSBBL1380_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1380.Srch02")) {
			return new MS_MSBBL1380_Srch02Bridge();
		}
		if (id.equals("MS.MSBBL1380.Ins01")) {
			return new MS_MSBBL1380_Ins01Bridge();
		}
		if (id.equals("MS.MSBBL1380.Upd01")) {
			return new MS_MSBBL1380_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL1380.Del01")) {
			return new MS_MSBBL1380_Del01Bridge();
		}
		if (id.equals("MS.MSBBL1380.Prnt01")) {
			return new MS_MSBBL1380_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1380_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1380_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1380_Srch01Bridge() {
			p_MS_MSBBL1380_Srch01 = new MCParam(PDef.MS_MSBBL1380_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1380_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1380.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1380.DtlR.class));

			p_MS_MSBBL1380_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1380_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1380_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1380_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1380_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1380.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1380.CndR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP1380.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1380.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1380.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1380.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1380_Srch01.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
			p_MS_MSBBL1380_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1380.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1380_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1380.HdrR)p_MS_MSBBL1380_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1380.DtlR>)p_MS_MSBBL1380_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1380_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1380_Srch02;

		/** コンストラクタ */
		protected MS_MSBBL1380_Srch02Bridge() {
			p_MS_MSBBL1380_Srch02 = new MCParam(PDef.MS_MSBBL1380_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1380_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1380.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1380.DtlR.class));

			p_MS_MSBBL1380_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1380_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1380_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1380_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1380_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1380.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1380.CndR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP1380.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1380.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1380.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1380.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1380_Srch02.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
			p_MS_MSBBL1380_Srch02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1380.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1380_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1380.HdrR)p_MS_MSBBL1380_Srch02.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1380.DtlR>)p_MS_MSBBL1380_Srch02.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1380_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1380_Ins01;

		/** コンストラクタ */
		protected MS_MSBBL1380_Ins01Bridge() {
			p_MS_MSBBL1380_Ins01 = new MCParam(PDef.MS_MSBBL1380_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1380_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1380.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());

			p_MS_MSBBL1380_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1380_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1380_Ins01.addUpBlock(getHdrR());
			p_MS_MSBBL1380_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1380_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1380_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1380.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1380.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1380.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP1380.DtlR>)up(1);
		}

		protected mcframe.clientMSBB.MSBBP1380.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1380.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1380_Ins01.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBBL1380_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1380.HdrR)p_MS_MSBBL1380_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1380_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1380_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL1380_Upd01Bridge() {
			p_MS_MSBBL1380_Upd01 = new MCParam(PDef.MS_MSBBL1380_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1380_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1380.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());

			p_MS_MSBBL1380_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1380_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1380_Upd01.addUpBlock(getHdrR());
			p_MS_MSBBL1380_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1380_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1380_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1380.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1380.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1380.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP1380.DtlR>)up(1);
		}

		protected mcframe.clientMSBB.MSBBP1380.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1380.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1380_Upd01.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBBL1380_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1380.HdrR)p_MS_MSBBL1380_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1380_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1380_Del01;

		/** コンストラクタ */
		protected MS_MSBBL1380_Del01Bridge() {
			p_MS_MSBBL1380_Del01 = new MCParam(PDef.MS_MSBBL1380_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1380_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());

			p_MS_MSBBL1380_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1380_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1380_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1380_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1380_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1380.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1380.HdrR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP1380.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1380.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1380_Del01.addDownBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBBL1380_Del01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1380.HdrR)p_MS_MSBBL1380_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1380_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1380_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1380_Prnt01;

		/** コンストラクタ */
		protected MS_MSBBL1380_Prnt01Bridge() {
			p_MS_MSBBL1380_Prnt01 = new MCParam(PDef.MS_MSBBL1380_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1380_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1380.HdrR.create());
			// Down

			p_MS_MSBBL1380_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1380_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1380_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1380_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1380_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1380.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1380.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBBL1380_Prnt01;
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