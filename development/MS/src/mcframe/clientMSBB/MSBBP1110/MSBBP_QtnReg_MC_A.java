package mcframe.clientMSBB.MSBBP1110;

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
import mcframe.clientMSBB.MSBBP1110.MSBBP_QtnReg_MC.MS_MSBBL1110_Srch01Caller;
import mcframe.clientMSBB.MSBBP1110.MSBBP_QtnReg_MC.MS_MSBBL1110_Ins01Caller;
import mcframe.clientMSBB.MSBBP1110.MSBBP_QtnReg_MC.MS_MSBBL1110_Upd01Caller;
import mcframe.clientMSBB.MSBBP1110.MSBBP_QtnReg_MC.MS_MSBBL1110_Del01Caller;
import mcframe.clientMSBB.MSBBP1110.MSBBP_QtnReg_MC.MS_MSBBL1110_Sprt01Caller;
import mcframe.clientMSBB.MSBBP1110.MSBBP_QtnReg_MC.MS_MSBBL1110_Prnt01Caller;

/**
 * 画面"MSBBP_QtnReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_QtnReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1110";

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
	public MCLabel Cnd_qtn_no_Label = null;
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_qtn_no = null;
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_qtn_rev = null;
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
	/**
	 * Rev. number update 改訂番号更新.<p>
	 *
	 */
	public MCCheckBox Hdr_rev_upd_flg = null;
	public MCLabel Hdr_qtn_no_Label = null;
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_qtn_no = null;
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_qtn_rev = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCCheckBox Hdr_can_flg = null;
	public MCLabel Hdr_qtn_typ_Label = null;
	/**
	 * Quotation type 見積区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_qtn_typ = null;
	/**
	 * Quotation type name 見積区分名.<p>
	 *
	 */
	public MCTextField Hdr_qtn_typ_nm = null;
	public MCLabel Hdr_qtn_dt_Label = null;
	/**
	 * Quotation date 見積日.<p>
	 *
	 */
	public MCDateField Hdr_qtn_dt = null;
	public MCLabel Hdr_valid_dt_Label = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDateField Hdr_valid_dt = null;
	/**
	 * Quotation immediate issue 見積書即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_qtn_out_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_qtn_prnt_flg = null;
	public MCLabel Hdr_qtn_prnt_dt_Label = null;
	/**
	 * Quotation issue date 見積書発行日.<p>
	 *
	 */
	public MCDateField Hdr_qtn_prnt_dt = null;
	/**
	 * Failed order 失注.<p>
	 *
	 */
	public MCCheckBox Hdr_failure_flg = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_flg = null;
	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_back_flg = null;
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
	 * Allow correction 訂正可能.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_upd_flg = null;
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_can_flg = null;
	public mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H Hdr_dlv_p_PPanel;
	public MCTextField Hdr_dlv_cd;	// [Hdr]の[dlv_p.bp_cd]を[Hdr_dlv_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_nm;	// [Hdr]の[dlv_p.bp_nm]を[Hdr_dlv_nm]としてエイリアス定義。
	public MCCheckBox Hdr_dlv_sundry_flg;	// [Hdr]の[dlv_p.dlv_sundry_flg]を[Hdr_dlv_sundry_flg]としてエイリアス定義。
	public MCCheckBox Hdr_pri_prnt_flg;	// [Hdr]の[dlv_p.pri_prnt_flg]を[Hdr_pri_prnt_flg]としてエイリアス定義。
	public MCButton Hdr_show_dtl;	// [Hdr]の[dlv_p.show_dtl]を[Hdr_show_dtl]としてエイリアス定義。
	public MCTextComboBox Hdr_dlv_lg_grp_cd;	// [Hdr]の[dlv_p.lg_grp_cd]を[Hdr_dlv_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_lg_grp_nm;	// [Hdr]の[dlv_p.lg_grp_nm]を[Hdr_dlv_lg_grp_nm]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntry_cd;	// [Hdr]の[dlv_p.cntry_cd]を[Hdr_dlv_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntry_nm;	// [Hdr]の[dlv_p.cntry_nm]を[Hdr_dlv_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr_dlv_zip_cd;	// [Hdr]の[dlv_p.zip_cd]を[Hdr_dlv_zip_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr1;	// [Hdr]の[dlv_p.addr1]を[Hdr_dlv_addr1]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr2;	// [Hdr]の[dlv_p.addr2]を[Hdr_dlv_addr2]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr3;	// [Hdr]の[dlv_p.addr3]を[Hdr_dlv_addr3]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr4;	// [Hdr]の[dlv_p.addr4]を[Hdr_dlv_addr4]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntct_dpt;	// [Hdr]の[dlv_p.dlv_cntct_dpt]を[Hdr_dlv_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntct_psn;	// [Hdr]の[dlv_p.dlv_cntct_psn]を[Hdr_dlv_cntct_psn]としてエイリアス定義。
	public MCTextField Hdr_dlv_tel;	// [Hdr]の[dlv_p.tel]を[Hdr_dlv_tel]としてエイリアス定義。
	public MCTextField Hdr_dlv_fax;	// [Hdr]の[dlv_p.fax]を[Hdr_dlv_fax]としてエイリアス定義。
	/**
	 * Normal customer cd. 通常得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_def_cst_cd = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_prnt_lcl_cd = null;
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
	public MCLabel Hdr_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Hdr_cst_nm = null;
	public mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H Hdr_cst_addr_p_PPanel;
	public MCTextField Hdr_cst_cntry_cd;	// [Hdr]の[cst_addr_p.cntry_cd]を[Hdr_cst_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr_cst_cntry_nm;	// [Hdr]の[cst_addr_p.cntry_nm]を[Hdr_cst_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr_cst_zip_cd;	// [Hdr]の[cst_addr_p.zip_cd]を[Hdr_cst_zip_cd]としてエイリアス定義。
	public MCTextField Hdr_cst_addr1;	// [Hdr]の[cst_addr_p.addr1]を[Hdr_cst_addr1]としてエイリアス定義。
	public MCTextField Hdr_cst_addr2;	// [Hdr]の[cst_addr_p.addr2]を[Hdr_cst_addr2]としてエイリアス定義。
	public MCTextField Hdr_cst_addr3;	// [Hdr]の[cst_addr_p.addr3]を[Hdr_cst_addr3]としてエイリアス定義。
	public MCTextField Hdr_cst_addr4;	// [Hdr]の[cst_addr_p.addr4]を[Hdr_cst_addr4]としてエイリアス定義。
	public MCTextField Hdr_cst_cntct_dpt;	// [Hdr]の[cst_addr_p.cntct_dpt]を[Hdr_cst_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr_cst_cntct_psn;	// [Hdr]の[cst_addr_p.cntct_psn]を[Hdr_cst_cntct_psn]としてエイリアス定義。
	public MCTextField Hdr_cst_tel;	// [Hdr]の[cst_addr_p.tel]を[Hdr_cst_tel]としてエイリアス定義。
	public MCTextField Hdr_cst_fax;	// [Hdr]の[cst_addr_p.fax]を[Hdr_cst_fax]としてエイリアス定義。
	public MCTextComboBox Hdr_cst_lg_grp_cd;	// [Hdr]の[cst_addr_p.lg_grp_cd]を[Hdr_cst_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr_cst_lg_grp_nm;	// [Hdr]の[cst_addr_p.lg_grp_nm]を[Hdr_cst_lg_grp_nm]としてエイリアス定義。
	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public MCCheckBox Hdr_cst_sundry_flg = null;
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
	public MCLabel Hdr_qtn_term_cd_Label = null;
	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_qtn_term_cd = null;
	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public MCTextField Hdr_qtn_term_nm = null;
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
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCCheckBox Hdr_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_xrate_p_PPanel;
	public MCNumberField Hdr_xrate;	// [Hdr]の[xrate_p.xrate]を[Hdr_xrate]としてエイリアス定義。
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_xrate_cd = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Hdr_wrk_no_p_PPanel;
	public MCTextField Hdr_wrk_no;	// [Hdr]の[wrk_no_p.wrk_no]を[Hdr_wrk_no]としてエイリアス定義。
	public MCTextField Hdr_wrk_nm;	// [Hdr]の[wrk_no_p.wrk_nm]を[Hdr_wrk_nm]としてエイリアス定義。
	public MCLabel Hdr_cst_qtn_rqst_no_Label = null;
	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_cst_qtn_rqst_no = null;
	public MCLabel Hdr_prof_rate_Label = null;
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumberField Hdr_prof_rate = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_amt_p_PPanel;
	public MCNumberField Hdr_trd_cur_amt;	// [Hdr]の[trd_cur_amt_p.amt]を[Hdr_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_inc_tax_amt_p_PPanel;
	public MCNumberField Hdr_trd_cur_inc_tax_amt;	// [Hdr]の[trd_cur_inc_tax_amt_p.amt]を[Hdr_trd_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_amt_p_PPanel;
	public MCNumberField Hdr_ttl_amt;	// [Hdr]の[ttl_amt_p.amt]を[Hdr_ttl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_amt_no_cost_p_PPanel;
	public MCNumberField Hdr_ttl_amt_no_cost;	// [Hdr]の[ttl_amt_no_cost_p.amt]を[Hdr_ttl_amt_no_cost]としてエイリアス定義。
	public MCLabel Hdr_trnspt_cd_Label = null;
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_trnspt_cd = null;
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public MCTextField Hdr_trnspt_nm = null;
	public MCLabel Hdr_rcpt_dt_Label = null;
	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDateField Hdr_rcpt_dt = null;
	public MCLabel Hdr_rcpt_usr_cd_Label = null;
	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_rcpt_usr_cd = null;
	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public MCTextField Hdr_rcpt_usr_nm = null;
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
	public MCLabel Hdr_qtn_rmrks_Label = null;
	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public MCTextField Hdr_qtn_rmrks = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_qtn_rslt_rsn_cd_Label = null;
	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_qtn_rslt_rsn_cd = null;
	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public MCTextField Hdr_qtn_rslt_rsn_nm = null;
	public MCLabel Hdr_qtn_rslt_rsn_rmrks_Label = null;
	/**
	 * Quotation result reason remarks 見積結果理由備考.<p>
	 *
	 */
	public MCTextField Hdr_qtn_rslt_rsn_rmrks = null;
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
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1110.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_d_no = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
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
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_num_typ = null;
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_num_typ = null;
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_num_typ = null;
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_num_typ = null;
	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_sno1_flg = null;
	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_sno2_flg = null;
	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_sno3_flg = null;
	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_sno4_flg = null;
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_comp_spec_typ = null;
	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_comp_spec_typ_nm = null;
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
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_itm_nm = null;
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_org_cd = null;
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_org_nm = null;
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
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl_trd_cur_std_sls_upri_amt_p_PPanel;
	public MCColumnConfig columnDtl_upri_not_tgt_flg;// [Dtl]の[trd_cur_std_sls_upri_amt_p.upri_not_tgt_flg]を[columnDtl_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_std_sls_upri;// [Dtl]の[trd_cur_std_sls_upri_amt_p.trd_cur_upri]を[columnDtl_trd_cur_std_sls_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl_interim_flg;// [Dtl]の[trd_cur_std_sls_upri_amt_p.interim_flg]を[columnDtl_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_std_sls_amt;// [Dtl]の[trd_cur_std_sls_upri_amt_p.trd_cur_amt]を[columnDtl_trd_cur_std_sls_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_std_sls_inc_tax_amt;// [Dtl]の[trd_cur_std_sls_upri_amt_p.trd_cur_inc_tax_amt]を[columnDtl_trd_cur_std_sls_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_fix_flg;// [Dtl]の[trd_cur_std_sls_upri_amt_p.tax_fix_flg]を[columnDtl_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_cd;// [Dtl]の[trd_cur_std_sls_upri_amt_p.tax_cd]を[columnDtl_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_nm;// [Dtl]の[trd_cur_std_sls_upri_amt_p.tax_nm]を[columnDtl_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_rate;// [Dtl]の[trd_cur_std_sls_upri_amt_p.tax_rate]を[columnDtl_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_typ;// [Dtl]の[trd_cur_std_sls_upri_amt_p.tax_typ]を[columnDtl_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_inc_tax_flg;// [Dtl]の[trd_cur_std_sls_upri_amt_p.inc_tax_flg]を[columnDtl_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_std_sls_tax_amt;// [Dtl]の[trd_cur_std_sls_upri_amt_p.trd_cur_tax_amt]を[columnDtl_trd_cur_std_sls_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_dscnt_amt;// [Dtl]の[trd_cur_std_sls_upri_amt_p.trd_cur_dscnt_amt]を[columnDtl_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_cd;// [Dtl]の[trd_cur_std_sls_upri_amt_p.dscnt_rsn_cd]を[columnDtl_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_nm;// [Dtl]の[trd_cur_std_sls_upri_amt_p.dscnt_rsn_nm]を[columnDtl_dscnt_rsn_nm]としてエイリアス定義。
	/**
	 * Discount rate 仕切率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upri_rate = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_upri;// [Dtl]の[trd_cur_upri_p.upri]を[columnDtl_trd_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_amt;// [Dtl]の[trd_cur_amt_p.amt]を[columnDtl_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_trd_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_inc_tax_amt;// [Dtl]の[trd_cur_inc_tax_amt_p.amt]を[columnDtl_trd_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_trd_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_tax_amt;// [Dtl]の[trd_cur_tax_amt_p.amt]を[columnDtl_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_cost_upri_p_PPanel;
	public MCColumnConfig columnDtl_cost_upri;// [Dtl]の[cost_upri_p.upri]を[columnDtl_cost_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_cost_amt_p_PPanel;
	public MCColumnConfig columnDtl_cost_amt;// [Dtl]の[cost_amt_p.amt]を[columnDtl_cost_amt]としてエイリアス定義。
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prof_rate = null;
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
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_auto_flg = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_sno_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_std_sls_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_std_sls_upri;// [Dtl]の[base_cur_std_sls_upri_p.upri]を[columnDtl_base_cur_std_sls_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_std_sls_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_std_sls_amt;// [Dtl]の[base_cur_std_sls_amt_p.amt]を[columnDtl_base_cur_std_sls_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_std_sls_inc_tax_amt;// [Dtl]の[base_cur_std_sls_inc_tax_amt_p.amt]を[columnDtl_base_cur_std_sls_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_std_sls_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_std_sls_tax_amt;// [Dtl]の[base_cur_std_sls_tax_amt_p.amt]を[columnDtl_base_cur_std_sls_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_upri;// [Dtl]の[base_cur_upri_p.upri]を[columnDtl_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_amt;// [Dtl]の[base_cur_amt_p.amt]を[columnDtl_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_inc_tax_amt;// [Dtl]の[base_cur_inc_tax_amt_p.amt]を[columnDtl_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_tax_amt;// [Dtl]の[base_cur_tax_amt_p.amt]を[columnDtl_base_cur_tax_amt]としてエイリアス定義。
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_itm_grp_no = null;
	public mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D Dtl_dlv_p_PPanel;
	public MCColumnConfig columnDtl_dlv_cd;// [Dtl]の[dlv_p.bp_cd]を[columnDtl_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_nm;// [Dtl]の[dlv_p.bp_nm]を[columnDtl_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_pri_prnt_flg;// [Dtl]の[dlv_p.pri_prnt_flg]を[columnDtl_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_zip_cd;// [Dtl]の[dlv_p.zip_cd]を[columnDtl_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr1;// [Dtl]の[dlv_p.addr1]を[columnDtl_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr2;// [Dtl]の[dlv_p.addr2]を[columnDtl_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr3;// [Dtl]の[dlv_p.addr3]を[columnDtl_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr4;// [Dtl]の[dlv_p.addr4]を[columnDtl_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_dpt;// [Dtl]の[dlv_p.dlv_cntct_dpt]を[columnDtl_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_psn;// [Dtl]の[dlv_p.dlv_cntct_psn]を[columnDtl_dlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_tel;// [Dtl]の[dlv_p.tel]を[columnDtl_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_fax;// [Dtl]の[dlv_p.fax]を[columnDtl_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_sundry_flg;// [Dtl]の[dlv_p.dlv_sundry_flg]を[columnDtl_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntry_cd;// [Dtl]の[dlv_p.cntry_cd]を[columnDtl_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntry_nm;// [Dtl]の[dlv_p.cntry_nm]を[columnDtl_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_lg_grp_cd;// [Dtl]の[dlv_p.lg_grp_cd]を[columnDtl_dlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_lg_grp_nm;// [Dtl]の[dlv_p.lg_grp_nm]を[columnDtl_dlv_lg_grp_nm]としてエイリアス定義。
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prnt_lcl_cd = null;
	/**
	 * Distribution channel 1 cd. 仕向先１ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm1 = null;
	/**
	 * Distribution channel 2 cd. 仕向先２ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm2 = null;
	/**
	 * Distribution channel 3 cd. 仕向先３ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm3 = null;
	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_comp_rev_no = null;
	/**
	 * Item undefined 品目未定義.<p>
	 *
	 */
	public MCColumnConfig columnDtl_no_itm_cd_flg = null;
	/**
	 * Configuration release 構成リリース.<p>
	 *
	 */
	public MCColumnConfig columnDtl_comp_rel_flg = null;
	/**
	 * Specification exists 仕様有.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spec_flg = null;
	/**
	 * Specification remarks 仕様備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spec_sub_char1 = null;
	/**
	 * Specification spare 1 仕様予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spec_sub_char2 = null;
	/**
	 * Specification spare 2 仕様予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spec_sub_char3 = null;
	/**
	 * Specification spare 3 仕様予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spec_sub_char4 = null;
	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_d_rslt_rsn_cd = null;
	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_d_rslt_rsn_nm = null;
	/**
	 * Quotation details result reason remarks 見積明細結果理由備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qtn_d_rslt_rsn_rmrks = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trnst_qty_p_PPanel;
	public MCColumnConfig columnDtl_trnst_qty;// [Dtl]の[trnst_qty_p.qty]を[columnDtl_trnst_qty]としてエイリアス定義。
	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_qtn_rqst_d_no = null;
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
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_old_trd_cur_std_sls_upri_p_PPanel;
	public MCColumnConfig columnDtl_old_trd_cur_std_sls_upri;// [Dtl]の[old_trd_cur_std_sls_upri_p.upri]を[columnDtl_old_trd_cur_std_sls_upri]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Sales order entry 受注登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1210 = null;
	/**
	 * Sales result entry 売上実績登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1310 = null;
	/**
	 * Quotation 見積書.<p>
	 *
	 */
	public MCButton Btn_prnt_qtn = null;
	/**
	 * Reacquire unit price 単価再取得.<p>
	 *
	 */
	public MCButton Btn_sprt_srch_upri = null;
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
	public MCButton Btn_ins = null;
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
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_TRNST]モードを表す定数 */
	public static final String UPD_TRNST = "UPD_TRNST";
	/** [UPD_APRV]モードを表す定数 */
	public static final String UPD_APRV = "UPD_APRV";
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
	public static final String[] statusArray = new String[]{INS, FIX_I, SRCH, UPD, UPD_TRNST, UPD_APRV, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBBL1110_Srch01]のCallerの作成 */
	protected MSBBP_QtnReg_MC.MS_MSBBL1110_Srch01Caller createMS_MSBBL1110_Srch01() {
		MSBBP_QtnReg_MC.MS_MSBBL1110_Srch01Caller<MSBBP_QtnReg, MS_MSBBL1110_Srch01Bridge>
		caller = ((MSBBP_QtnReg_MC)this).new MS_MSBBL1110_Srch01Caller<MSBBP_QtnReg, MS_MSBBL1110_Srch01Bridge>(
					(MSBBP_QtnReg)this, new MS_MSBBL1110_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1110_Srch01]の呼び出し */
	protected void callMS_MSBBL1110_Srch01() {
		MCCaller caller = createMS_MSBBL1110_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1110_Ins01]のCallerの作成 */
	protected MSBBP_QtnReg_MC.MS_MSBBL1110_Ins01Caller createMS_MSBBL1110_Ins01() {
		MSBBP_QtnReg_MC.MS_MSBBL1110_Ins01Caller<MSBBP_QtnReg, MS_MSBBL1110_Ins01Bridge>
		caller = ((MSBBP_QtnReg_MC)this).new MS_MSBBL1110_Ins01Caller<MSBBP_QtnReg, MS_MSBBL1110_Ins01Bridge>(
					(MSBBP_QtnReg)this, new MS_MSBBL1110_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBBL1110_Ins01]の呼び出し */
	protected void callMS_MSBBL1110_Ins01() {
		MCCaller caller = createMS_MSBBL1110_Ins01();
		caller.exec();
	}
	/** [MS_MSBBL1110_Upd01]のCallerの作成 */
	protected MSBBP_QtnReg_MC.MS_MSBBL1110_Upd01Caller createMS_MSBBL1110_Upd01() {
		MSBBP_QtnReg_MC.MS_MSBBL1110_Upd01Caller<MSBBP_QtnReg, MS_MSBBL1110_Upd01Bridge>
		caller = ((MSBBP_QtnReg_MC)this).new MS_MSBBL1110_Upd01Caller<MSBBP_QtnReg, MS_MSBBL1110_Upd01Bridge>(
					(MSBBP_QtnReg)this, new MS_MSBBL1110_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL1110_Upd01]の呼び出し */
	protected void callMS_MSBBL1110_Upd01() {
		MCCaller caller = createMS_MSBBL1110_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL1110_Del01]のCallerの作成 */
	protected MSBBP_QtnReg_MC.MS_MSBBL1110_Del01Caller createMS_MSBBL1110_Del01() {
		MSBBP_QtnReg_MC.MS_MSBBL1110_Del01Caller<MSBBP_QtnReg, MS_MSBBL1110_Del01Bridge>
		caller = ((MSBBP_QtnReg_MC)this).new MS_MSBBL1110_Del01Caller<MSBBP_QtnReg, MS_MSBBL1110_Del01Bridge>(
					(MSBBP_QtnReg)this, new MS_MSBBL1110_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL1110_Del01]の呼び出し */
	protected void callMS_MSBBL1110_Del01() {
		MCCaller caller = createMS_MSBBL1110_Del01();
		caller.exec();
	}
	/** [MS_MSBBL1110_Sprt01]のCallerの作成 */
	protected MSBBP_QtnReg_MC.MS_MSBBL1110_Sprt01Caller createMS_MSBBL1110_Sprt01() {
		MSBBP_QtnReg_MC.MS_MSBBL1110_Sprt01Caller<MSBBP_QtnReg, MS_MSBBL1110_Sprt01Bridge>
		caller = ((MSBBP_QtnReg_MC)this).new MS_MSBBL1110_Sprt01Caller<MSBBP_QtnReg, MS_MSBBL1110_Sprt01Bridge>(
					(MSBBP_QtnReg)this, new MS_MSBBL1110_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBBL1110_Sprt01]の呼び出し */
	protected void callMS_MSBBL1110_Sprt01() {
		MCCaller caller = createMS_MSBBL1110_Sprt01();
		caller.exec();
	}
	/** [MS_MSBBL1110_Prnt01]のCallerの作成 */
	protected MSBBP_QtnReg_MC.MS_MSBBL1110_Prnt01Caller createMS_MSBBL1110_Prnt01() {
		MSBBP_QtnReg_MC.MS_MSBBL1110_Prnt01Caller<MSBBP_QtnReg, MS_MSBBL1110_Prnt01Bridge>
		caller = ((MSBBP_QtnReg_MC)this).new MS_MSBBL1110_Prnt01Caller<MSBBP_QtnReg, MS_MSBBL1110_Prnt01Bridge>(
					(MSBBP_QtnReg)this, new MS_MSBBL1110_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBBL1110_Prnt01]の呼び出し */
	protected void callMS_MSBBL1110_Prnt01() {
		MCCaller caller = createMS_MSBBL1110_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1110.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1110.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1110.DtlR> aDtlL;
	/** [UpriSrch]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1110.UpriSrchR> aUpriSrchL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1110.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1110.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1110.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1110.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBB.MSBBP1110.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1110.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1110.HdrR createHdrR() {
		return mcframe.clientMSBB.MSBBP1110.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBB.MSBBP1110.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1110.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBB.MSBBP1110.DtlR createDtlR() {
		return mcframe.clientMSBB.MSBBP1110.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1110.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1110.DtlR.class);
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
	 * コピーによってaUpriSrchLを設定します。
	 *
	 * aUpriSrchLのインスタンスは変更されません。
	 *
	 * @param dataset UpriSrchL
	 */
	public void setUpriSrchL(MCList<mcframe.clientMSBB.MSBBP1110.UpriSrchR> aList) {
		if (getUpriSrchL() != aList) {
			getUpriSrchL().setAll(aList);
		}
	}

	/**
	 * [UpriSrch]ブロックのコンテナaUpriSrchLを返します。
	 *
	 * @return UpriSrchL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1110.UpriSrchR> getUpriSrchL() {
		return aUpriSrchL;
	}

	/**
	 * aUpriSrchRを作成します。
	 *
	 * @return UpriSrchR
	 */
	public mcframe.clientMSBB.MSBBP1110.UpriSrchR createUpriSrchR() {
		return mcframe.clientMSBB.MSBBP1110.UpriSrchR.create();
	}

	/**
	 * aUpriSrchLを作成します。
	 *
	 * @return UpriSrchL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1110.UpriSrchR> createUpriSrchL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1110.UpriSrchR.class);
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
		if(!MCCollectionUtil.contains(ret, getUpriSrchL())) ret.add(getUpriSrchL());
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
		if(aCnt == getUpriSrchL()) return "UpriSrch";
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
		if(bId.equals("UpriSrch")) return getUpriSrchL();
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
	public MSBBP_QtnReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aUpriSrchL = createUpriSrchL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_QtnReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aUpriSrchL = createUpriSrchL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_QtnReg_MC.jbCreateScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbCreateCnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbCreateHdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbCreateHdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbCreateHdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbCreateDtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbCreateBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbCreateEastBtn((MSBBP_QtnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_QtnReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_QtnReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBBP_QtnReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBBP_QtnReg p) {
		p.Hdr_dlv_p_PPanel = mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.create(p.getHdrR().dlv_p());
		p.Hdr_dlv_p_PPanel.setName("Hdr.dlv_p");
		p.Hdr_dlv_cd = p.Hdr_dlv_p_PPanel.Dlv_bp_cd;
		p.Hdr_dlv_cd.addAliasName("Hdr.dlv_cd", p);
		p.Hdr_dlv_nm = p.Hdr_dlv_p_PPanel.Dlv_bp_nm;
		p.Hdr_dlv_nm.addAliasName("Hdr.dlv_nm", p);
		p.Hdr_dlv_sundry_flg = p.Hdr_dlv_p_PPanel.Dlv_dlv_sundry_flg;
		p.Hdr_dlv_sundry_flg.addAliasName("Hdr.dlv_sundry_flg", p);
		p.Hdr_pri_prnt_flg = p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg;
		p.Hdr_pri_prnt_flg.addAliasName("Hdr.pri_prnt_flg", p);
		p.Hdr_show_dtl = p.Hdr_dlv_p_PPanel.Dlv_show_dtl;
		p.Hdr_show_dtl.addAliasName("Hdr.show_dtl", p);
		p.Hdr_dlv_lg_grp_cd = p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd;
		p.Hdr_dlv_lg_grp_cd.addAliasName("Hdr.dlv_lg_grp_cd", p);
		p.Hdr_dlv_lg_grp_nm = p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm;
		p.Hdr_dlv_lg_grp_nm.addAliasName("Hdr.dlv_lg_grp_nm", p);
		p.Hdr_dlv_cntry_cd = p.Hdr_dlv_p_PPanel.Dlv_cntry_cd;
		p.Hdr_dlv_cntry_cd.addAliasName("Hdr.dlv_cntry_cd", p);
		p.Hdr_dlv_cntry_nm = p.Hdr_dlv_p_PPanel.Dlv_cntry_nm;
		p.Hdr_dlv_cntry_nm.addAliasName("Hdr.dlv_cntry_nm", p);
		p.Hdr_dlv_zip_cd = p.Hdr_dlv_p_PPanel.Dlv_zip_cd;
		p.Hdr_dlv_zip_cd.addAliasName("Hdr.dlv_zip_cd", p);
		p.Hdr_dlv_addr1 = p.Hdr_dlv_p_PPanel.Dlv_addr1;
		p.Hdr_dlv_addr1.addAliasName("Hdr.dlv_addr1", p);
		p.Hdr_dlv_addr2 = p.Hdr_dlv_p_PPanel.Dlv_addr2;
		p.Hdr_dlv_addr2.addAliasName("Hdr.dlv_addr2", p);
		p.Hdr_dlv_addr3 = p.Hdr_dlv_p_PPanel.Dlv_addr3;
		p.Hdr_dlv_addr3.addAliasName("Hdr.dlv_addr3", p);
		p.Hdr_dlv_addr4 = p.Hdr_dlv_p_PPanel.Dlv_addr4;
		p.Hdr_dlv_addr4.addAliasName("Hdr.dlv_addr4", p);
		p.Hdr_dlv_cntct_dpt = p.Hdr_dlv_p_PPanel.Dlv_dlv_cntct_dpt;
		p.Hdr_dlv_cntct_dpt.addAliasName("Hdr.dlv_cntct_dpt", p);
		p.Hdr_dlv_cntct_psn = p.Hdr_dlv_p_PPanel.Dlv_dlv_cntct_psn;
		p.Hdr_dlv_cntct_psn.addAliasName("Hdr.dlv_cntct_psn", p);
		p.Hdr_dlv_tel = p.Hdr_dlv_p_PPanel.Dlv_tel;
		p.Hdr_dlv_tel.addAliasName("Hdr.dlv_tel", p);
		p.Hdr_dlv_fax = p.Hdr_dlv_p_PPanel.Dlv_fax;
		p.Hdr_dlv_fax.addAliasName("Hdr.dlv_fax", p);
		p.Hdr_cst_addr_p_PPanel = mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.create(p.getHdrR().cst_addr_p());
		p.Hdr_cst_addr_p_PPanel.setName("Hdr.cst_addr_p");
		p.Hdr_cst_cntry_cd = p.Hdr_cst_addr_p_PPanel.Addr_cntry_cd;
		p.Hdr_cst_cntry_cd.addAliasName("Hdr.cst_cntry_cd", p);
		p.Hdr_cst_cntry_nm = p.Hdr_cst_addr_p_PPanel.Addr_cntry_nm;
		p.Hdr_cst_cntry_nm.addAliasName("Hdr.cst_cntry_nm", p);
		p.Hdr_cst_zip_cd = p.Hdr_cst_addr_p_PPanel.Addr_zip_cd;
		p.Hdr_cst_zip_cd.addAliasName("Hdr.cst_zip_cd", p);
		p.Hdr_cst_addr1 = p.Hdr_cst_addr_p_PPanel.Addr_addr1;
		p.Hdr_cst_addr1.addAliasName("Hdr.cst_addr1", p);
		p.Hdr_cst_addr2 = p.Hdr_cst_addr_p_PPanel.Addr_addr2;
		p.Hdr_cst_addr2.addAliasName("Hdr.cst_addr2", p);
		p.Hdr_cst_addr3 = p.Hdr_cst_addr_p_PPanel.Addr_addr3;
		p.Hdr_cst_addr3.addAliasName("Hdr.cst_addr3", p);
		p.Hdr_cst_addr4 = p.Hdr_cst_addr_p_PPanel.Addr_addr4;
		p.Hdr_cst_addr4.addAliasName("Hdr.cst_addr4", p);
		p.Hdr_cst_cntct_dpt = p.Hdr_cst_addr_p_PPanel.Addr_cntct_dpt;
		p.Hdr_cst_cntct_dpt.addAliasName("Hdr.cst_cntct_dpt", p);
		p.Hdr_cst_cntct_psn = p.Hdr_cst_addr_p_PPanel.Addr_cntct_psn;
		p.Hdr_cst_cntct_psn.addAliasName("Hdr.cst_cntct_psn", p);
		p.Hdr_cst_tel = p.Hdr_cst_addr_p_PPanel.Addr_tel;
		p.Hdr_cst_tel.addAliasName("Hdr.cst_tel", p);
		p.Hdr_cst_fax = p.Hdr_cst_addr_p_PPanel.Addr_fax;
		p.Hdr_cst_fax.addAliasName("Hdr.cst_fax", p);
		p.Hdr_cst_lg_grp_cd = p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd;
		p.Hdr_cst_lg_grp_cd.addAliasName("Hdr.cst_lg_grp_cd", p);
		p.Hdr_cst_lg_grp_nm = p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm;
		p.Hdr_cst_lg_grp_nm.addAliasName("Hdr.cst_lg_grp_nm", p);
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
		p.Hdr_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdrR().xrate_p());
		p.Hdr_xrate_p_PPanel.setName("Hdr.xrate_p");
		p.Hdr_xrate = p.Hdr_xrate_p_PPanel.Xrate_xrate;
		p.Hdr_xrate.addAliasName("Hdr.xrate", p);
		p.Hdr_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getHdrR().wrk_no_p());
		p.Hdr_wrk_no_p_PPanel.setName("Hdr.wrk_no_p");
		p.Hdr_wrk_no = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Hdr_wrk_no.addAliasName("Hdr.wrk_no", p);
		p.Hdr_wrk_nm = p.Hdr_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Hdr_wrk_nm.addAliasName("Hdr.wrk_nm", p);
		p.Hdr_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().trd_cur_amt_p());
		p.Hdr_trd_cur_amt_p_PPanel.setName("Hdr.trd_cur_amt_p");
		p.Hdr_trd_cur_amt = p.Hdr_trd_cur_amt_p_PPanel.Amt_amt;
		p.Hdr_trd_cur_amt.addAliasName("Hdr.trd_cur_amt", p);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().trd_cur_inc_tax_amt_p());
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.setName("Hdr.trd_cur_inc_tax_amt_p");
		p.Hdr_trd_cur_inc_tax_amt = p.Hdr_trd_cur_inc_tax_amt_p_PPanel.Amt_amt;
		p.Hdr_trd_cur_inc_tax_amt.addAliasName("Hdr.trd_cur_inc_tax_amt", p);
		p.Hdr_ttl_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_amt_p());
		p.Hdr_ttl_amt_p_PPanel.setName("Hdr.ttl_amt_p");
		p.Hdr_ttl_amt = p.Hdr_ttl_amt_p_PPanel.Amt_amt;
		p.Hdr_ttl_amt.addAliasName("Hdr.ttl_amt", p);
		p.Hdr_ttl_amt_no_cost_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_amt_no_cost_p());
		p.Hdr_ttl_amt_no_cost_p_PPanel.setName("Hdr.ttl_amt_no_cost_p");
		p.Hdr_ttl_amt_no_cost = p.Hdr_ttl_amt_no_cost_p_PPanel.Amt_amt;
		p.Hdr_ttl_amt_no_cost.addAliasName("Hdr.ttl_amt_no_cost", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBBP_QtnReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBBP_QtnReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$itm_p);
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
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$trd_cur_std_sls_upri_amt_p);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.setName("Dtl.trd_cur_std_sls_upri_amt_p");
		p.columnDtl_upri_not_tgt_flg = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl_upri_not_tgt_flg.addAliasName("Dtl.upri_not_tgt_flg", p);
		p.columnDtl_trd_cur_std_sls_upri = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl_trd_cur_std_sls_upri.addAliasName("Dtl.trd_cur_std_sls_upri", p);
		p.columnDtl_interim_flg = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl_interim_flg.addAliasName("Dtl.interim_flg", p);
		p.columnDtl_trd_cur_std_sls_amt = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl_trd_cur_std_sls_amt.addAliasName("Dtl.trd_cur_std_sls_amt", p);
		p.columnDtl_trd_cur_std_sls_inc_tax_amt = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl_trd_cur_std_sls_inc_tax_amt.addAliasName("Dtl.trd_cur_std_sls_inc_tax_amt", p);
		p.columnDtl_tax_fix_flg = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl_tax_fix_flg.addAliasName("Dtl.tax_fix_flg", p);
		p.columnDtl_tax_cd = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl_tax_cd.addAliasName("Dtl.tax_cd", p);
		p.columnDtl_tax_nm = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl_tax_nm.addAliasName("Dtl.tax_nm", p);
		p.columnDtl_tax_rate = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl_tax_rate.addAliasName("Dtl.tax_rate", p);
		p.columnDtl_tax_typ = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl_tax_typ.addAliasName("Dtl.tax_typ", p);
		p.columnDtl_inc_tax_flg = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl_inc_tax_flg.addAliasName("Dtl.inc_tax_flg", p);
		p.columnDtl_trd_cur_std_sls_tax_amt = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl_trd_cur_std_sls_tax_amt.addAliasName("Dtl.trd_cur_std_sls_tax_amt", p);
		p.columnDtl_trd_cur_dscnt_amt = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl_trd_cur_dscnt_amt.addAliasName("Dtl.trd_cur_dscnt_amt", p);
		p.columnDtl_dscnt_rsn_cd = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl_dscnt_rsn_cd.addAliasName("Dtl.dscnt_rsn_cd", p);
		p.columnDtl_dscnt_rsn_nm = p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl_dscnt_rsn_nm.addAliasName("Dtl.dscnt_rsn_nm", p);
		p.Dtl_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$trd_cur_upri_p);
		p.Dtl_trd_cur_upri_p_PPanel.setName("Dtl.trd_cur_upri_p");
		p.columnDtl_trd_cur_upri = p.Dtl_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_trd_cur_upri.addAliasName("Dtl.trd_cur_upri", p);
		p.Dtl_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$trd_cur_amt_p);
		p.Dtl_trd_cur_amt_p_PPanel.setName("Dtl.trd_cur_amt_p");
		p.columnDtl_trd_cur_amt = p.Dtl_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_amt.addAliasName("Dtl.trd_cur_amt", p);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$trd_cur_inc_tax_amt_p);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.setName("Dtl.trd_cur_inc_tax_amt_p");
		p.columnDtl_trd_cur_inc_tax_amt = p.Dtl_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_inc_tax_amt.addAliasName("Dtl.trd_cur_inc_tax_amt", p);
		p.Dtl_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$trd_cur_tax_amt_p);
		p.Dtl_trd_cur_tax_amt_p_PPanel.setName("Dtl.trd_cur_tax_amt_p");
		p.columnDtl_trd_cur_tax_amt = p.Dtl_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_tax_amt.addAliasName("Dtl.trd_cur_tax_amt", p);
		p.Dtl_cost_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$cost_upri_p);
		p.Dtl_cost_upri_p_PPanel.setName("Dtl.cost_upri_p");
		p.columnDtl_cost_upri = p.Dtl_cost_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_cost_upri.addAliasName("Dtl.cost_upri", p);
		p.Dtl_cost_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$cost_amt_p);
		p.Dtl_cost_amt_p_PPanel.setName("Dtl.cost_amt_p");
		p.columnDtl_cost_amt = p.Dtl_cost_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_cost_amt.addAliasName("Dtl.cost_amt", p);
		p.Dtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$sno_p);
		p.Dtl_sno_p_PPanel.setName("Dtl.sno_p");
		p.columnDtl_sno1 = p.Dtl_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.Dtl_base_cur_std_sls_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$base_cur_std_sls_upri_p);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.setName("Dtl.base_cur_std_sls_upri_p");
		p.columnDtl_base_cur_std_sls_upri = p.Dtl_base_cur_std_sls_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_std_sls_upri.addAliasName("Dtl.base_cur_std_sls_upri", p);
		p.Dtl_base_cur_std_sls_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$base_cur_std_sls_amt_p);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.setName("Dtl.base_cur_std_sls_amt_p");
		p.columnDtl_base_cur_std_sls_amt = p.Dtl_base_cur_std_sls_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_std_sls_amt.addAliasName("Dtl.base_cur_std_sls_amt", p);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$base_cur_std_sls_inc_tax_amt_p);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_std_sls_inc_tax_amt_p");
		p.columnDtl_base_cur_std_sls_inc_tax_amt = p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_std_sls_inc_tax_amt.addAliasName("Dtl.base_cur_std_sls_inc_tax_amt", p);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$base_cur_std_sls_tax_amt_p);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.setName("Dtl.base_cur_std_sls_tax_amt_p");
		p.columnDtl_base_cur_std_sls_tax_amt = p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_std_sls_tax_amt.addAliasName("Dtl.base_cur_std_sls_tax_amt", p);
		p.Dtl_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$base_cur_upri_p);
		p.Dtl_base_cur_upri_p_PPanel.setName("Dtl.base_cur_upri_p");
		p.columnDtl_base_cur_upri = p.Dtl_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_upri.addAliasName("Dtl.base_cur_upri", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$base_cur_inc_tax_amt_p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_inc_tax_amt_p");
		p.columnDtl_base_cur_inc_tax_amt = p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_inc_tax_amt.addAliasName("Dtl.base_cur_inc_tax_amt", p);
		p.Dtl_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$base_cur_tax_amt_p);
		p.Dtl_base_cur_tax_amt_p_PPanel.setName("Dtl.base_cur_tax_amt_p");
		p.columnDtl_base_cur_tax_amt = p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_tax_amt.addAliasName("Dtl.base_cur_tax_amt", p);
		p.Dtl_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$dlv_p);
		p.Dtl_dlv_p_PPanel.setName("Dtl.dlv_p");
		p.columnDtl_dlv_cd = p.Dtl_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnDtl_dlv_cd.addAliasName("Dtl.dlv_cd", p);
		p.columnDtl_dlv_nm = p.Dtl_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnDtl_dlv_nm.addAliasName("Dtl.dlv_nm", p);
		p.columnDtl_pri_prnt_flg = p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnDtl_pri_prnt_flg.addAliasName("Dtl.pri_prnt_flg", p);
		p.columnDtl_dlv_zip_cd = p.Dtl_dlv_p_PPanel.columnDlv_zip_cd;
		p.columnDtl_dlv_zip_cd.addAliasName("Dtl.dlv_zip_cd", p);
		p.columnDtl_dlv_addr1 = p.Dtl_dlv_p_PPanel.columnDlv_addr1;
		p.columnDtl_dlv_addr1.addAliasName("Dtl.dlv_addr1", p);
		p.columnDtl_dlv_addr2 = p.Dtl_dlv_p_PPanel.columnDlv_addr2;
		p.columnDtl_dlv_addr2.addAliasName("Dtl.dlv_addr2", p);
		p.columnDtl_dlv_addr3 = p.Dtl_dlv_p_PPanel.columnDlv_addr3;
		p.columnDtl_dlv_addr3.addAliasName("Dtl.dlv_addr3", p);
		p.columnDtl_dlv_addr4 = p.Dtl_dlv_p_PPanel.columnDlv_addr4;
		p.columnDtl_dlv_addr4.addAliasName("Dtl.dlv_addr4", p);
		p.columnDtl_dlv_cntct_dpt = p.Dtl_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnDtl_dlv_cntct_dpt.addAliasName("Dtl.dlv_cntct_dpt", p);
		p.columnDtl_dlv_cntct_psn = p.Dtl_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnDtl_dlv_cntct_psn.addAliasName("Dtl.dlv_cntct_psn", p);
		p.columnDtl_dlv_tel = p.Dtl_dlv_p_PPanel.columnDlv_tel;
		p.columnDtl_dlv_tel.addAliasName("Dtl.dlv_tel", p);
		p.columnDtl_dlv_fax = p.Dtl_dlv_p_PPanel.columnDlv_fax;
		p.columnDtl_dlv_fax.addAliasName("Dtl.dlv_fax", p);
		p.columnDtl_dlv_sundry_flg = p.Dtl_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDtl_dlv_sundry_flg.addAliasName("Dtl.dlv_sundry_flg", p);
		p.columnDtl_dlv_cntry_cd = p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnDtl_dlv_cntry_cd.addAliasName("Dtl.dlv_cntry_cd", p);
		p.columnDtl_dlv_cntry_nm = p.Dtl_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnDtl_dlv_cntry_nm.addAliasName("Dtl.dlv_cntry_nm", p);
		p.columnDtl_dlv_lg_grp_cd = p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnDtl_dlv_lg_grp_cd.addAliasName("Dtl.dlv_lg_grp_cd", p);
		p.columnDtl_dlv_lg_grp_nm = p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnDtl_dlv_lg_grp_nm.addAliasName("Dtl.dlv_lg_grp_nm", p);
		p.Dtl_trnst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$trnst_qty_p);
		p.Dtl_trnst_qty_p_PPanel.setName("Dtl.trnst_qty_p");
		p.columnDtl_trnst_qty = p.Dtl_trnst_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trnst_qty.addAliasName("Dtl.trnst_qty", p);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1110.DtlR.$old_trd_cur_std_sls_upri_p);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.setName("Dtl.old_trd_cur_std_sls_upri_p");
		p.columnDtl_old_trd_cur_std_sls_upri = p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_old_trd_cur_std_sls_upri.addAliasName("Dtl.old_trd_cur_std_sls_upri", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_QtnReg p) {
		p.Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_menu_move_p_PPanel.setName("Btn.menu_move_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_QtnReg p) {
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
	
	
	/** [Hdr_qtn_typ_ListPutter]の定義 */
	private MCListPutter Hdr_qtn_typ_p = null;

	/**
	 * [Hdr_qtn_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_qtn_typ_ListPutter() {
		if (Hdr_qtn_typ_p == null) {
			Hdr_qtn_typ_p = createHdr_qtn_typ_ListPutter(Hdr_qtn_typ, "qtn_typ", "qtn_typ_nm");

		}
		return Hdr_qtn_typ_p;
	}
	
	
	/** [Hdr_dlv_p_PPanel_Dlv_bp_cd_ListPutter]の定義 */
	private MCListPutter Hdr_dlv_p_PPanel_Dlv_bp_cd_p = null;

	/**
	 * [Hdr_dlv_p_PPanel_Dlv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dlv_p_PPanel_Dlv_bp_cd_ListPutter() {
		if (Hdr_dlv_p_PPanel_Dlv_bp_cd_p == null) {
			Hdr_dlv_p_PPanel_Dlv_bp_cd_p = createHdr_dlv_p_PPanel_Dlv_bp_cd_ListPutter(Hdr_dlv_p_PPanel.Dlv_bp_cd, "dlv_cd", "dlv_nm","dlv_sundry_flg","pri_prnt_flg","dlv_zip_cd","dlv_addr1","dlv_addr2","dlv_addr3","dlv_addr4","dlv_cntry_cd","dlv_cntry_nm","dlv_tel","dlv_fax","dlv_cntct_dpt","dlv_cntct_psn","dlv_lg_grp_cd","def_cst_cd","prnt_lcl_cd");
		}
		return Hdr_dlv_p_PPanel_Dlv_bp_cd_p;
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
	
	
	/** [Hdr_cst_cd_ListPutter]の定義 */
	private MCListPutter Hdr_cst_cd_p = null;

	/**
	 * [Hdr_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_cst_cd_ListPutter() {
		if (Hdr_cst_cd_p == null) {
			Hdr_cst_cd_p = createHdr_cst_cd_ListPutter(Hdr_cst_cd, "cst_cd", "cst_nm","cst_cntry_cd","cst_cntry_nm","cst_zip_cd","cst_addr1","cst_addr2","cst_addr3","cst_addr4","cst_tel","cst_fax","cst_cntct_dpt","cst_cntct_psn","cst_sundry_flg","cst_iv_flg","sls_amt_rnd_typ","sls_tax_rnd_typ","cst_usr_cd","cst_dpt_cd","trd_cur_cd");

		}
		return Hdr_cst_cd_p;
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
	
	
	/** [Hdr_qtn_term_cd_ListPutter]の定義 */
	private MCListPutter Hdr_qtn_term_cd_p = null;

	/**
	 * [Hdr_qtn_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_qtn_term_cd_ListPutter() {
		if (Hdr_qtn_term_cd_p == null) {
			Hdr_qtn_term_cd_p = createHdr_qtn_term_cd_ListPutter(Hdr_qtn_term_cd, "qtn_term_cd", "qtn_term_nm");

		}
		return Hdr_qtn_term_cd_p;
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
	
	
	/** [Hdr_trnspt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_trnspt_cd_p = null;

	/**
	 * [Hdr_trnspt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_trnspt_cd_ListPutter() {
		if (Hdr_trnspt_cd_p == null) {
			Hdr_trnspt_cd_p = createHdr_trnspt_cd_ListPutter(Hdr_trnspt_cd, "trnspt_cd", "trnspt_nm");

		}
		return Hdr_trnspt_cd_p;
	}
	
	
	/** [Hdr_rcpt_usr_cd_ListPutter]の定義 */
	private MCListPutter Hdr_rcpt_usr_cd_p = null;

	/**
	 * [Hdr_rcpt_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rcpt_usr_cd_ListPutter() {
		if (Hdr_rcpt_usr_cd_p == null) {
			Hdr_rcpt_usr_cd_p = createHdr_rcpt_usr_cd_ListPutter(Hdr_rcpt_usr_cd, "rcpt_usr_cd", "rcpt_usr_nm");

		}
		return Hdr_rcpt_usr_cd_p;
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
	
	
	/** [Hdr_qtn_rslt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Hdr_qtn_rslt_rsn_cd_p = null;

	/**
	 * [Hdr_qtn_rslt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_qtn_rslt_rsn_cd_ListPutter() {
		if (Hdr_qtn_rslt_rsn_cd_p == null) {
			Hdr_qtn_rslt_rsn_cd_p = createHdr_qtn_rslt_rsn_cd_ListPutter(Hdr_qtn_rslt_rsn_cd, "qtn_rslt_rsn_cd", "qtn_rslt_rsn_nm");

		}
		return Hdr_qtn_rslt_rsn_cd_p;
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
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","stk_mng_typ","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","cntry_org_cd","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","dscnt_itm_flg","comp_spec_typ","comp_spec_typ_nm","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","slo_sno1_flg","slo_sno2_flg","slo_sno3_flg","slo_sno4_flg");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","stk_mng_typ","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","cntry_org_cd","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","dscnt_itm_flg","comp_spec_typ","comp_spec_typ_nm","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","slo_sno1_flg","slo_sno2_flg","slo_sno3_flg","slo_sno4_flg");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","stk_mng_typ","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","cntry_org_cd","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","dscnt_itm_flg","comp_spec_typ","comp_spec_typ_nm","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","slo_sno1_flg","slo_sno2_flg","slo_sno3_flg","slo_sno4_flg");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","stk_mng_typ","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","cntry_org_cd","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","dscnt_itm_flg","comp_spec_typ","comp_spec_typ_nm","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","slo_sno1_flg","slo_sno2_flg","slo_sno3_flg","slo_sno4_flg");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_cntry_org_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cntry_org_cd_p = null;

	/**
	 * [Dtl_cntry_org_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cntry_org_cd_ListPutter() {
		if (Dtl_cntry_org_cd_p == null) {
			Dtl_cntry_org_cd_p = createDtl_cntry_org_cd_ListPutter(columnDtl_cntry_org_cd, "cntry_org_cd", "cntry_org_nm");

		}
		return Dtl_cntry_org_cd_p;
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
	
	
	/** [Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_rate","tax_typ","inc_tax_flg");
		}
		return Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p == null) {
			Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = createDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd, "dscnt_rsn_cd", "dscnt_rsn_nm");
		}
		return Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p;
	}
	
	
	/** [Dtl_gd_cd_ListPutter]の定義 */
	private MCListPutter Dtl_gd_cd_p = null;

	/**
	 * [Dtl_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_gd_cd_ListPutter() {
		if (Dtl_gd_cd_p == null) {
			Dtl_gd_cd_p = createDtl_gd_cd_ListPutter(columnDtl_gd_cd, "gd_cd", "gd_nm");

		}
		return Dtl_gd_cd_p;
	}
	
	
	/** [Dtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dlv_p_PPanel_columnDlv_bp_cd_p = null;

	/**
	 * [Dtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter() {
		if (Dtl_dlv_p_PPanel_columnDlv_bp_cd_p == null) {
			Dtl_dlv_p_PPanel_columnDlv_bp_cd_p = createDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter(Dtl_dlv_p_PPanel.columnDlv_bp_cd, "dlv_cd", "dlv_nm","dlv_sundry_flg","pri_prnt_flg","dlv_zip_cd","dlv_addr1","dlv_addr2","dlv_addr3","dlv_addr4","dlv_cntry_cd","dlv_cntry_nm","dlv_tel","dlv_fax","dlv_cntct_dpt","dlv_cntct_psn","dlv_lg_grp_cd","prnt_lcl_cd");
		}
		return Dtl_dlv_p_PPanel_columnDlv_bp_cd_p;
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
	
	
	/** [Dtl_qtn_d_rslt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_qtn_d_rslt_rsn_cd_p = null;

	/**
	 * [Dtl_qtn_d_rslt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_qtn_d_rslt_rsn_cd_ListPutter() {
		if (Dtl_qtn_d_rslt_rsn_cd_p == null) {
			Dtl_qtn_d_rslt_rsn_cd_p = createDtl_qtn_d_rslt_rsn_cd_ListPutter(columnDtl_qtn_d_rslt_rsn_cd, "qtn_d_rslt_rsn_cd", "qtn_d_rslt_rsn_nm");

		}
		return Dtl_qtn_d_rslt_rsn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_QtnReg create(){
		MSBBP_QtnReg p = new MSBBP_QtnReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_QtnReg create(String name){
		MSBBP_QtnReg p = new MSBBP_QtnReg(name);
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
		MSBBP_QtnReg_MC.jbfInitScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbfInitCnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbfInitHdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbfInitHdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbfInitHdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbfInitDtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbfInitBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbfInitEastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbInitScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbInitCnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbInitHdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbInitHdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbInitHdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbInitDtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbInitBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.jbInitEastBtn((MSBBP_QtnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_qtn_no_Label = p.beansFactory.createLabel("Cnd.qtn_no_Label");
		p.Cnd_qtn_no = p.beansFactory.createTextField("Cnd.qtn_no");
		p.Cnd_qtn_no.setLabel(p.Cnd_qtn_no_Label);
		p.Cnd_qtn_rev = p.beansFactory.createNumberField("Cnd.qtn_rev");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextComboBox("Hdr.trd_cd");
		p.Hdr_trd_cd.setLabel(p.Hdr_trd_cd_Label);
		p.Hdr_trd_nm = p.beansFactory.createTextField("Hdr.trd_nm");
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_rev_upd_flg = p.beansFactory.createCheckBox("Hdr.rev_upd_flg");
		p.Hdr_qtn_no_Label = p.beansFactory.createLabel("Hdr.qtn_no_Label");
		p.Hdr_qtn_no = p.beansFactory.createTextField("Hdr.qtn_no");
		p.Hdr_qtn_no.setLabel(p.Hdr_qtn_no_Label);
		p.Hdr_qtn_rev = p.beansFactory.createNumberField("Hdr.qtn_rev");
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_qtn_typ_Label = p.beansFactory.createLabel("Hdr.qtn_typ_Label");
		p.Hdr_qtn_typ = p.beansFactory.createTextComboBox("Hdr.qtn_typ");
		p.Hdr_qtn_typ.setLabel(p.Hdr_qtn_typ_Label);
		p.Hdr_qtn_typ_nm = p.beansFactory.createTextField("Hdr.qtn_typ_nm");
		p.Hdr_qtn_dt_Label = p.beansFactory.createLabel("Hdr.qtn_dt_Label");
		p.Hdr_qtn_dt = p.beansFactory.createDateField("Hdr.qtn_dt");
		p.Hdr_qtn_dt.setLabel(p.Hdr_qtn_dt_Label);
		p.Hdr_valid_dt_Label = p.beansFactory.createLabel("Hdr.valid_dt_Label");
		p.Hdr_valid_dt = p.beansFactory.createDateField("Hdr.valid_dt");
		p.Hdr_valid_dt.setLabel(p.Hdr_valid_dt_Label);
		p.Hdr_qtn_out_flg = p.beansFactory.createCheckBox("Hdr.qtn_out_flg");
		p.Hdr_qtn_prnt_flg = p.beansFactory.createCheckBox("Hdr.qtn_prnt_flg");
		p.Hdr_qtn_prnt_dt_Label = p.beansFactory.createLabel("Hdr.qtn_prnt_dt_Label");
		p.Hdr_qtn_prnt_dt = p.beansFactory.createDateField("Hdr.qtn_prnt_dt");
		p.Hdr_qtn_prnt_dt.setLabel(p.Hdr_qtn_prnt_dt_Label);
		p.Hdr_failure_flg = p.beansFactory.createCheckBox("Hdr.failure_flg");
		p.Hdr_aprv_flg = p.beansFactory.createCheckBox("Hdr.aprv_flg");
		p.Hdr_aprv_back_flg = p.beansFactory.createCheckBox("Hdr.aprv_back_flg");
		p.Hdr_aprv_no_Label = p.beansFactory.createLabel("Hdr.aprv_no_Label");
		p.Hdr_aprv_no = p.beansFactory.createTextField("Hdr.aprv_no");
		p.Hdr_aprv_no.setLabel(p.Hdr_aprv_no_Label);
		p.Hdr_aprv_sts_typ_Label = p.beansFactory.createLabel("Hdr.aprv_sts_typ_Label");
		p.Hdr_aprv_sts_typ = p.beansFactory.createTextField("Hdr.aprv_sts_typ");
		p.Hdr_aprv_sts_typ.setLabel(p.Hdr_aprv_sts_typ_Label);
		p.Hdr_aprv_sts_typ_nm = p.beansFactory.createTextField("Hdr.aprv_sts_typ_nm");
		p.Hdr_aprv_upd_flg = p.beansFactory.createCheckBox("Hdr.aprv_upd_flg");
		p.Hdr_aprv_can_flg = p.beansFactory.createCheckBox("Hdr.aprv_can_flg");
		p.Hdr_def_cst_cd = p.beansFactory.createTextField("Hdr.def_cst_cd");
		p.Hdr_prnt_lcl_cd = p.beansFactory.createTextField("Hdr.prnt_lcl_cd");
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
		p.Hdr_cst_cd_Label = p.beansFactory.createLabel("Hdr.cst_cd_Label");
		p.Hdr_cst_cd = p.beansFactory.createTextComboBox("Hdr.cst_cd");
		p.Hdr_cst_cd.setLabel(p.Hdr_cst_cd_Label);
		p.Hdr_cst_nm = p.beansFactory.createTextField("Hdr.cst_nm");
		p.Hdr_cst_sundry_flg = p.beansFactory.createCheckBox("Hdr.cst_sundry_flg");
		p.Hdr_cst_iv_flg = p.beansFactory.createCheckBox("Hdr.cst_iv_flg");
		p.Hdr_sls_amt_rnd_typ = p.beansFactory.createTextField("Hdr.sls_amt_rnd_typ");
		p.Hdr_sls_tax_rnd_typ = p.beansFactory.createTextField("Hdr.sls_tax_rnd_typ");
		p.Hdr_cst_usr_cd = p.beansFactory.createTextField("Hdr.cst_usr_cd");
		p.Hdr_cst_dpt_cd = p.beansFactory.createTextField("Hdr.cst_dpt_cd");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_qtn_term_cd_Label = p.beansFactory.createLabel("Hdr.qtn_term_cd_Label");
		p.Hdr_qtn_term_cd = p.beansFactory.createTextComboBox("Hdr.qtn_term_cd");
		p.Hdr_qtn_term_cd.setLabel(p.Hdr_qtn_term_cd_Label);
		p.Hdr_qtn_term_nm = p.beansFactory.createTextField("Hdr.qtn_term_nm");
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
		p.Hdr_xrate_inpt_flg = p.beansFactory.createCheckBox("Hdr.xrate_inpt_flg");
		p.Hdr_xrate_cd = p.beansFactory.createTextField("Hdr.xrate_cd");
		p.Hdr_cst_qtn_rqst_no_Label = p.beansFactory.createLabel("Hdr.cst_qtn_rqst_no_Label");
		p.Hdr_cst_qtn_rqst_no = p.beansFactory.createTextField("Hdr.cst_qtn_rqst_no");
		p.Hdr_cst_qtn_rqst_no.setLabel(p.Hdr_cst_qtn_rqst_no_Label);
		p.Hdr_prof_rate_Label = p.beansFactory.createLabel("Hdr.prof_rate_Label");
		p.Hdr_prof_rate = p.beansFactory.createNumberField("Hdr.prof_rate");
		p.Hdr_prof_rate.setLabel(p.Hdr_prof_rate_Label);
		p.Hdr_trnspt_cd_Label = p.beansFactory.createLabel("Hdr.trnspt_cd_Label");
		p.Hdr_trnspt_cd = p.beansFactory.createTextComboBox("Hdr.trnspt_cd");
		p.Hdr_trnspt_cd.setLabel(p.Hdr_trnspt_cd_Label);
		p.Hdr_trnspt_nm = p.beansFactory.createTextField("Hdr.trnspt_nm");
		p.Hdr_rcpt_dt_Label = p.beansFactory.createLabel("Hdr.rcpt_dt_Label");
		p.Hdr_rcpt_dt = p.beansFactory.createDateField("Hdr.rcpt_dt");
		p.Hdr_rcpt_dt.setLabel(p.Hdr_rcpt_dt_Label);
		p.Hdr_rcpt_usr_cd_Label = p.beansFactory.createLabel("Hdr.rcpt_usr_cd_Label");
		p.Hdr_rcpt_usr_cd = p.beansFactory.createTextField("Hdr.rcpt_usr_cd");
		p.Hdr_rcpt_usr_cd.setLabel(p.Hdr_rcpt_usr_cd_Label);
		p.Hdr_rcpt_usr_nm = p.beansFactory.createTextField("Hdr.rcpt_usr_nm");
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
		p.Hdr_qtn_rmrks_Label = p.beansFactory.createLabel("Hdr.qtn_rmrks_Label");
		p.Hdr_qtn_rmrks = p.beansFactory.createTextField("Hdr.qtn_rmrks");
		p.Hdr_qtn_rmrks.setLabel(p.Hdr_qtn_rmrks_Label);
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_qtn_rslt_rsn_cd_Label = p.beansFactory.createLabel("Hdr.qtn_rslt_rsn_cd_Label");
		p.Hdr_qtn_rslt_rsn_cd = p.beansFactory.createTextComboBox("Hdr.qtn_rslt_rsn_cd");
		p.Hdr_qtn_rslt_rsn_cd.setLabel(p.Hdr_qtn_rslt_rsn_cd_Label);
		p.Hdr_qtn_rslt_rsn_nm = p.beansFactory.createTextField("Hdr.qtn_rslt_rsn_nm");
		p.Hdr_qtn_rslt_rsn_rmrks_Label = p.beansFactory.createLabel("Hdr.qtn_rslt_rsn_rmrks_Label");
		p.Hdr_qtn_rslt_rsn_rmrks = p.beansFactory.createTextField("Hdr.qtn_rslt_rsn_rmrks");
		p.Hdr_qtn_rslt_rsn_rmrks.setLabel(p.Hdr_qtn_rslt_rsn_rmrks_Label);
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
	protected static void jbfInitHdr2(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_qtn_d_no = p.beansFactory.createTableColumn("Dtl.qtn_d_no", MCColumnType.TEXT);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno1_num_typ = p.beansFactory.createTableColumn("Dtl.sno1_num_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_num_typ = p.beansFactory.createTableColumn("Dtl.sno2_num_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_num_typ = p.beansFactory.createTableColumn("Dtl.sno3_num_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_num_typ = p.beansFactory.createTableColumn("Dtl.sno4_num_typ", MCColumnType.TEXT);
		p.columnDtl_slo_sno1_flg = p.beansFactory.createTableColumn("Dtl.slo_sno1_flg", MCColumnType.CHECK);
		p.columnDtl_slo_sno2_flg = p.beansFactory.createTableColumn("Dtl.slo_sno2_flg", MCColumnType.CHECK);
		p.columnDtl_slo_sno3_flg = p.beansFactory.createTableColumn("Dtl.slo_sno3_flg", MCColumnType.CHECK);
		p.columnDtl_slo_sno4_flg = p.beansFactory.createTableColumn("Dtl.slo_sno4_flg", MCColumnType.CHECK);
		p.columnDtl_comp_spec_typ = p.beansFactory.createTableColumn("Dtl.comp_spec_typ", MCColumnType.TEXT);
		p.columnDtl_comp_spec_typ_nm = p.beansFactory.createTableColumn("Dtl.comp_spec_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_cntry_org_cd = p.beansFactory.createTableColumn("Dtl.cntry_org_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cntry_org_nm = p.beansFactory.createTableColumn("Dtl.cntry_org_nm", MCColumnType.TEXT);
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
		p.columnDtl_upri_rate = p.beansFactory.createTableColumn("Dtl.upri_rate", MCColumnType.NUMBER);
		p.columnDtl_prof_rate = p.beansFactory.createTableColumn("Dtl.prof_rate", MCColumnType.NUMBER);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_sno_auto_flg = p.beansFactory.createTableColumn("Dtl.sno_auto_flg", MCColumnType.CHECK);
		p.columnDtl_set_itm_grp_no = p.beansFactory.createTableColumn("Dtl.set_itm_grp_no", MCColumnType.NUMBER);
		p.columnDtl_prnt_lcl_cd = p.beansFactory.createTableColumn("Dtl.prnt_lcl_cd", MCColumnType.TEXT);
		p.columnDtl_dest_cd1 = p.beansFactory.createTableColumn("Dtl.dest_cd1", MCColumnType.TEXT);
		p.columnDtl_dest_nm1 = p.beansFactory.createTableColumn("Dtl.dest_nm1", MCColumnType.TEXT);
		p.columnDtl_dest_cd2 = p.beansFactory.createTableColumn("Dtl.dest_cd2", MCColumnType.TEXT);
		p.columnDtl_dest_nm2 = p.beansFactory.createTableColumn("Dtl.dest_nm2", MCColumnType.TEXT);
		p.columnDtl_dest_cd3 = p.beansFactory.createTableColumn("Dtl.dest_cd3", MCColumnType.TEXT);
		p.columnDtl_dest_nm3 = p.beansFactory.createTableColumn("Dtl.dest_nm3", MCColumnType.TEXT);
		p.columnDtl_qtn_d_rmrks = p.beansFactory.createTableColumn("Dtl.qtn_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_itm_comp_rev_no = p.beansFactory.createTableColumn("Dtl.itm_comp_rev_no", MCColumnType.TEXT);
		p.columnDtl_no_itm_cd_flg = p.beansFactory.createTableColumn("Dtl.no_itm_cd_flg", MCColumnType.CHECK);
		p.columnDtl_comp_rel_flg = p.beansFactory.createTableColumn("Dtl.comp_rel_flg", MCColumnType.CHECK);
		p.columnDtl_spec_flg = p.beansFactory.createTableColumn("Dtl.spec_flg", MCColumnType.CHECK);
		p.columnDtl_spec_sub_char1 = p.beansFactory.createTableColumn("Dtl.spec_sub_char1", MCColumnType.TEXT);
		p.columnDtl_spec_sub_char2 = p.beansFactory.createTableColumn("Dtl.spec_sub_char2", MCColumnType.TEXT);
		p.columnDtl_spec_sub_char3 = p.beansFactory.createTableColumn("Dtl.spec_sub_char3", MCColumnType.TEXT);
		p.columnDtl_spec_sub_char4 = p.beansFactory.createTableColumn("Dtl.spec_sub_char4", MCColumnType.TEXT);
		p.columnDtl_qtn_d_rslt_rsn_cd = p.beansFactory.createTableColumn("Dtl.qtn_d_rslt_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_qtn_d_rslt_rsn_nm = p.beansFactory.createTableColumn("Dtl.qtn_d_rslt_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_qtn_d_rslt_rsn_rmrks = p.beansFactory.createTableColumn("Dtl.qtn_d_rslt_rsn_rmrks", MCColumnType.TEXT);
		p.columnDtl_cst_qtn_rqst_d_no = p.beansFactory.createTableColumn("Dtl.cst_qtn_rqst_d_no", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1210 = p.beansFactory.createButton("Btn.open_MSBBP1210", "open");
		p.Btn_open_MSBBP1310 = p.beansFactory.createButton("Btn.open_MSBBP1310", "open");
		p.Btn_prnt_qtn = p.beansFactory.createButton("Btn.prnt_qtn", "prnt");
		p.Btn_sprt_srch_upri = p.beansFactory.createButton("Btn.sprt_srch_upri");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_QtnReg p) {
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
	protected static void jbInitCnd(MSBBP_QtnReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1110.CndR.ope_META);
		p.CndPanel.add(p.Cnd_qtn_no_Label);
		p.CndPanel.add(p.Cnd_qtn_no);
		p.CndPanel.setLastBeans(p.Cnd_qtn_no);
		p.Cnd_qtn_no.setNextBeans(p.Cnd_qtn_rev);
		p.Cnd_qtn_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1110.CndR.qtn_no_META);
		p.CndPanel.add(p.Cnd_qtn_rev);
		p.Cnd_qtn_rev.setNextBeans(p.Cnd_srch);
		p.Cnd_qtn_rev.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1110.CndR.qtn_rev_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBBP_QtnReg p) {
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
	protected static void jbInitHdr(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.Hdr_trd_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cd.setLinkBeans(p.Hdr_trd_nm,p.Hdr_trd_ptn_typ);
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_rev_upd_flg);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_rev_upd_flg);
		p.Hdr_rev_upd_flg.setNextBeans(p.Hdr_qtn_no);
		p.Hdr_rev_upd_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.rev_upd_flg_META);
		p.HdrPanel.add(p.Hdr_qtn_no_Label);
		p.HdrPanel.add(p.Hdr_qtn_no);
		p.Hdr_qtn_no.setNextBeans(p.Hdr_qtn_rev);
		p.Hdr_qtn_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_no_META);
		p.HdrPanel.add(p.Hdr_qtn_rev);
		p.Hdr_qtn_rev.setNextBeans(p.Hdr_can_flg);
		p.Hdr_qtn_rev.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_rev_META);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_qtn_typ);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.can_flg_META);
		p.Hdr_qtn_typ.setListType(MCListType.STRICT);
		p.Hdr_qtn_typ.setLinkBeans(p.Hdr_qtn_typ_nm);
		p.HdrPanel.add(p.Hdr_qtn_typ_Label);
		p.HdrPanel.add(p.Hdr_qtn_typ);
		p.Hdr_qtn_typ.setNextBeans(p.Hdr_qtn_typ_nm);
		p.Hdr_qtn_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_typ_META);
		p.HdrPanel.add(p.Hdr_qtn_typ_nm);
		p.Hdr_qtn_typ_nm.setNextBeans(p.Hdr_qtn_dt);
		p.Hdr_qtn_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_typ_nm_META);
		p.HdrPanel.add(p.Hdr_qtn_dt_Label);
		p.HdrPanel.add(p.Hdr_qtn_dt);
		p.Hdr_qtn_dt.setNextBeans(p.Hdr_valid_dt);
		p.Hdr_qtn_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_dt_META);
		p.Hdr_qtn_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_valid_dt_Label);
		p.HdrPanel.add(p.Hdr_valid_dt);
		p.Hdr_valid_dt.setNextBeans(p.Hdr_qtn_out_flg);
		p.Hdr_valid_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.valid_dt_META);
		p.Hdr_valid_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_qtn_out_flg);
		p.Hdr_qtn_out_flg.setNextBeans(p.Hdr_qtn_prnt_flg);
		p.Hdr_qtn_out_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_out_flg_META);
		p.HdrPanel.add(p.Hdr_qtn_prnt_flg);
		p.Hdr_qtn_prnt_flg.setNextBeans(p.Hdr_qtn_prnt_dt);
		p.Hdr_qtn_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_qtn_prnt_dt_Label);
		p.HdrPanel.add(p.Hdr_qtn_prnt_dt);
		p.Hdr_qtn_prnt_dt.setNextBeans(p.Hdr_failure_flg);
		p.Hdr_qtn_prnt_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_prnt_dt_META);
		p.Hdr_qtn_prnt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_failure_flg);
		p.Hdr_failure_flg.setNextBeans(p.Hdr_aprv_flg);
		p.Hdr_failure_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.failure_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_flg);
		p.Hdr_aprv_flg.setNextBeans(p.Hdr_aprv_back_flg);
		p.Hdr_aprv_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.aprv_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_back_flg);
		p.Hdr_aprv_back_flg.setNextBeans(p.Hdr_aprv_no);
		p.Hdr_aprv_back_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.aprv_back_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_no_Label);
		p.HdrPanel.add(p.Hdr_aprv_no);
		p.Hdr_aprv_no.setNextBeans(p.Hdr_aprv_sts_typ);
		p.Hdr_aprv_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.aprv_no_META);
		p.HdrPanel.add(p.Hdr_aprv_sts_typ_Label);
		p.HdrPanel.add(p.Hdr_aprv_sts_typ);
		p.Hdr_aprv_sts_typ.setNextBeans(p.Hdr_aprv_sts_typ_nm);
		p.Hdr_aprv_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.aprv_sts_typ_META);
		p.HdrPanel.add(p.Hdr_aprv_sts_typ_nm);
		p.Hdr_aprv_sts_typ_nm.setNextBeans(p.Hdr_aprv_upd_flg);
		p.Hdr_aprv_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.aprv_sts_typ_nm_META);
		p.HdrPanel.add(p.Hdr_aprv_upd_flg);
		p.Hdr_aprv_upd_flg.setNextBeans(p.Hdr_aprv_can_flg);
		p.Hdr_aprv_upd_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.aprv_upd_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_can_flg);
		p.Hdr_aprv_can_flg.setNextBeans(p.Hdr_dlv_p_PPanel);
		p.Hdr_aprv_can_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.aprv_can_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_p_PPanel);
		p.Hdr_dlv_p_PPanel.setNextBeans(p.Hdr_def_cst_cd);
		p.Hdr_dlv_p_PPanel.Dlv_bp_cd.setLinkBeans(p.Hdr_dlv_nm,p.Hdr_dlv_sundry_flg,p.Hdr_pri_prnt_flg,p.Hdr_dlv_zip_cd,p.Hdr_dlv_addr1,p.Hdr_dlv_addr2,p.Hdr_dlv_addr3,p.Hdr_dlv_addr4,p.Hdr_dlv_cntry_cd,p.Hdr_dlv_cntry_nm,p.Hdr_dlv_tel,p.Hdr_dlv_fax,p.Hdr_dlv_cntct_dpt,p.Hdr_dlv_cntct_psn,p.Hdr_dlv_lg_grp_cd,p.Hdr_def_cst_cd,p.Hdr_prnt_lcl_cd);
		p.Hdr_dlv_p_PPanel.Dlv_show_dtl.setGroup("RI");
		p.HdrPanel.add(p.Hdr_def_cst_cd);
		p.Hdr_def_cst_cd.setNextBeans(p.Hdr_prnt_lcl_cd);
		p.Hdr_def_cst_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.def_cst_cd_META);
		p.HdrPanel.add(p.Hdr_prnt_lcl_cd);
		p.Hdr_prnt_lcl_cd.setNextBeans(p.Hdr_dest_cd1);
		p.Hdr_prnt_lcl_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.prnt_lcl_cd_META);
		p.HdrPanel.add(p.Hdr_dest_cd1_Label);
		p.HdrPanel.add(p.Hdr_dest_cd1);
		p.Hdr_dest_cd1.setNextBeans(p.Hdr_dest_nm1);
		p.Hdr_dest_cd1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.dest_cd1_META);
		p.Hdr_dest_cd1.addLinkBeans(p.Hdr_dest_nm1);
		p.Hdr_dest_cd1.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dest_nm1);
		p.Hdr_dest_nm1.setNextBeans(p.Hdr_dest_cd2);
		p.Hdr_dest_nm1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.dest_nm1_META);
		p.HdrPanel.add(p.Hdr_dest_cd2_Label);
		p.HdrPanel.add(p.Hdr_dest_cd2);
		p.Hdr_dest_cd2.setNextBeans(p.Hdr_dest_nm2);
		p.Hdr_dest_cd2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.dest_cd2_META);
		p.Hdr_dest_cd2.addLinkBeans(p.Hdr_dest_nm2);
		p.Hdr_dest_cd2.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dest_nm2);
		p.Hdr_dest_nm2.setNextBeans(p.Hdr_dest_cd3);
		p.Hdr_dest_nm2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.dest_nm2_META);
		p.HdrPanel.add(p.Hdr_dest_cd3_Label);
		p.HdrPanel.add(p.Hdr_dest_cd3);
		p.Hdr_dest_cd3.setNextBeans(p.Hdr_dest_nm3);
		p.Hdr_dest_cd3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.dest_cd3_META);
		p.Hdr_dest_cd3.addLinkBeans(p.Hdr_dest_nm3);
		p.Hdr_dest_cd3.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dest_nm3);
		p.Hdr_dest_nm3.setNextBeans(p.Hdr_cst_cd);
		p.Hdr_dest_nm3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.dest_nm3_META);
		p.Hdr_cst_cd.setListType(MCListType.STRICT);
		p.Hdr_cst_cd.setLinkBeans(p.Hdr_cst_nm,p.Hdr_cst_cntry_cd,p.Hdr_cst_cntry_nm,p.Hdr_cst_zip_cd,p.Hdr_cst_addr1,p.Hdr_cst_addr2,p.Hdr_cst_addr3,p.Hdr_cst_addr4,p.Hdr_cst_tel,p.Hdr_cst_fax,p.Hdr_cst_cntct_dpt,p.Hdr_cst_cntct_psn,p.Hdr_cst_sundry_flg,p.Hdr_cst_iv_flg,p.Hdr_sls_amt_rnd_typ,p.Hdr_sls_tax_rnd_typ,p.Hdr_cst_usr_cd,p.Hdr_cst_dpt_cd,p.Hdr_trd_cur_cd);
		p.HdrPanel.add(p.Hdr_cst_cd_Label);
		p.HdrPanel.add(p.Hdr_cst_cd);
		p.Hdr_cst_cd.setNextBeans(p.Hdr_cst_nm);
		p.Hdr_cst_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.cst_cd_META);
		p.HdrPanel.add(p.Hdr_cst_nm);
		p.Hdr_cst_nm.setNextBeans(p.Hdr_cst_addr_p_PPanel);
		p.Hdr_cst_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.cst_nm_META);
		p.HdrPanel.add(p.Hdr_cst_addr_p_PPanel);
		p.Hdr_cst_addr_p_PPanel.setNextBeans(p.Hdr_cst_sundry_flg);
		p.HdrPanel.add(p.Hdr_cst_sundry_flg);
		p.Hdr_cst_sundry_flg.setNextBeans(p.Hdr_cst_iv_flg);
		p.Hdr_cst_sundry_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.cst_sundry_flg_META);
		p.HdrPanel.add(p.Hdr_cst_iv_flg);
		p.Hdr_cst_iv_flg.setNextBeans(p.Hdr_sls_amt_rnd_typ);
		p.Hdr_cst_iv_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.cst_iv_flg_META);
		p.HdrPanel.add(p.Hdr_sls_amt_rnd_typ);
		p.Hdr_sls_amt_rnd_typ.setNextBeans(p.Hdr_sls_tax_rnd_typ);
		p.Hdr_sls_amt_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.sls_amt_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_sls_tax_rnd_typ);
		p.Hdr_sls_tax_rnd_typ.setNextBeans(p.Hdr_cst_usr_cd);
		p.Hdr_sls_tax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.sls_tax_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_cst_usr_cd);
		p.Hdr_cst_usr_cd.setNextBeans(p.Hdr_cst_dpt_cd);
		p.Hdr_cst_usr_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.cst_usr_cd_META);
		p.HdrPanel.add(p.Hdr_cst_dpt_cd);
		p.Hdr_cst_dpt_cd.setNextBeans(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_cst_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.cst_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_usr_dpt_p_PPanel.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_sls_dpt_nm,p.Hdr_wg_cd,p.Hdr_wg_nm);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_qtn_term_cd);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.wg_nm_META);
		p.Hdr_qtn_term_cd.setListType(MCListType.STRICT);
		p.Hdr_qtn_term_cd.setLinkBeans(p.Hdr_qtn_term_nm);
		p.HdrPanel.add(p.Hdr_qtn_term_cd_Label);
		p.HdrPanel.add(p.Hdr_qtn_term_cd);
		p.Hdr_qtn_term_cd.setNextBeans(p.Hdr_qtn_term_nm);
		p.Hdr_qtn_term_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_term_cd_META);
		p.HdrPanel.add(p.Hdr_qtn_term_nm);
		p.Hdr_qtn_term_nm.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_qtn_term_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_term_nm_META);
		p.Hdr_trd_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cur_cd.setLinkBeans(p.Hdr_trd_cur_nm,p.Hdr_trd_cur_amt_dec_place,p.Hdr_trd_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setNextBeans(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.trd_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_upri_dec_place.setNextBeans(p.Hdr_base_cur_cd);
		p.Hdr_trd_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.trd_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_amt_dec_place.setNextBeans(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.base_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_upri_dec_place.setNextBeans(p.Hdr_xrate_inpt_flg);
		p.Hdr_base_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.base_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_xrate_inpt_flg);
		p.Hdr_xrate_inpt_flg.setNextBeans(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_inpt_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.xrate_inpt_flg_META);
		p.HdrPanel.add(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_p_PPanel.setNextBeans(p.Hdr_xrate_cd);
		p.HdrPanel.add(p.Hdr_xrate_cd);
		p.Hdr_xrate_cd.setNextBeans(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_xrate_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.xrate_cd_META);
		p.HdrPanel.add(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_wrk_no_p_PPanel.setNextBeans(p.Hdr_cst_qtn_rqst_no);
		p.HdrPanel.add(p.Hdr_cst_qtn_rqst_no_Label);
		p.HdrPanel.add(p.Hdr_cst_qtn_rqst_no);
		p.Hdr_cst_qtn_rqst_no.setNextBeans(p.Hdr_prof_rate);
		p.Hdr_cst_qtn_rqst_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.cst_qtn_rqst_no_META);
		p.HdrPanel.add(p.Hdr_prof_rate_Label);
		p.HdrPanel.add(p.Hdr_prof_rate);
		p.Hdr_prof_rate.setNextBeans(p.Hdr_trd_cur_amt_p_PPanel);
		p.Hdr_prof_rate.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.prof_rate_META);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_p_PPanel);
		p.Hdr_trd_cur_amt_p_PPanel.setNextBeans(p.Hdr_trd_cur_inc_tax_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_trd_cur_inc_tax_amt_p_PPanel);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.setNextBeans(p.Hdr_ttl_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_ttl_amt_p_PPanel);
		p.Hdr_ttl_amt_p_PPanel.setNextBeans(p.Hdr_ttl_amt_no_cost_p_PPanel);
		p.HdrPanel.add(p.Hdr_ttl_amt_no_cost_p_PPanel);
		p.Hdr_ttl_amt_no_cost_p_PPanel.setNextBeans(p.Hdr_trnspt_cd);
		p.Hdr_trnspt_cd.setListType(MCListType.STRICT);
		p.Hdr_trnspt_cd.setLinkBeans(p.Hdr_trnspt_nm);
		p.HdrPanel.add(p.Hdr_trnspt_cd_Label);
		p.HdrPanel.add(p.Hdr_trnspt_cd);
		p.Hdr_trnspt_cd.setNextBeans(p.Hdr_trnspt_nm);
		p.Hdr_trnspt_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.trnspt_cd_META);
		p.HdrPanel.add(p.Hdr_trnspt_nm);
		p.Hdr_trnspt_nm.setNextBeans(p.Hdr_rcpt_dt);
		p.Hdr_trnspt_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.trnspt_nm_META);
		p.HdrPanel.add(p.Hdr_rcpt_dt_Label);
		p.HdrPanel.add(p.Hdr_rcpt_dt);
		p.Hdr_rcpt_dt.setNextBeans(p.Hdr_rcpt_usr_cd);
		p.Hdr_rcpt_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.rcpt_dt_META);
		p.Hdr_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_rcpt_usr_cd_Label);
		p.HdrPanel.add(p.Hdr_rcpt_usr_cd);
		p.Hdr_rcpt_usr_cd.setNextBeans(p.Hdr_rcpt_usr_nm);
		p.Hdr_rcpt_usr_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.rcpt_usr_cd_META);
		p.Hdr_rcpt_usr_cd.addLinkBeans(p.Hdr_rcpt_usr_nm);
		p.Hdr_rcpt_usr_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_rcpt_usr_nm);
		p.Hdr_rcpt_usr_nm.setNextBeans(p.Hdr_tterm_cd1);
		p.Hdr_rcpt_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.rcpt_usr_nm_META);
		p.Hdr_tterm_cd1.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd1.setLinkBeans(p.Hdr_tterm_nm1);
		p.HdrPanel.add(p.Hdr_tterm_cd1_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd1);
		p.Hdr_tterm_cd1.setNextBeans(p.Hdr_tterm_nm1);
		p.Hdr_tterm_cd1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.tterm_cd1_META);
		p.HdrPanel.add(p.Hdr_tterm_nm1);
		p.Hdr_tterm_nm1.setNextBeans(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_nm1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.tterm_nm1_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_rmrks1.setNextBeans(p.Hdr_tterm_cd2);
		p.Hdr_tterm_rmrks1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.tterm_rmrks1_META);
		p.Hdr_tterm_cd2.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd2.setLinkBeans(p.Hdr_tterm_nm2);
		p.HdrPanel.add(p.Hdr_tterm_cd2_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd2);
		p.Hdr_tterm_cd2.setNextBeans(p.Hdr_tterm_nm2);
		p.Hdr_tterm_cd2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.tterm_cd2_META);
		p.HdrPanel.add(p.Hdr_tterm_nm2);
		p.Hdr_tterm_nm2.setNextBeans(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_nm2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.tterm_nm2_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_rmrks2.setNextBeans(p.Hdr_tterm_cd3);
		p.Hdr_tterm_rmrks2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.tterm_rmrks2_META);
		p.Hdr_tterm_cd3.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd3.setLinkBeans(p.Hdr_tterm_nm3);
		p.HdrPanel.add(p.Hdr_tterm_cd3_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd3);
		p.Hdr_tterm_cd3.setNextBeans(p.Hdr_tterm_nm3);
		p.Hdr_tterm_cd3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.tterm_cd3_META);
		p.HdrPanel.add(p.Hdr_tterm_nm3);
		p.Hdr_tterm_nm3.setNextBeans(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_nm3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.tterm_nm3_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_rmrks3.setNextBeans(p.Hdr_qtn_rmrks);
		p.Hdr_tterm_rmrks3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.tterm_rmrks3_META);
		p.HdrPanel.add(p.Hdr_qtn_rmrks_Label);
		p.HdrPanel.add(p.Hdr_qtn_rmrks);
		p.Hdr_qtn_rmrks.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_qtn_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_rmrks_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_qtn_rslt_rsn_cd);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.intr_rmrks_META);
		p.Hdr_qtn_rslt_rsn_cd.setListType(MCListType.STRICT);
		p.Hdr_qtn_rslt_rsn_cd.setLinkBeans(p.Hdr_qtn_rslt_rsn_nm);
		p.HdrPanel.add(p.Hdr_qtn_rslt_rsn_cd_Label);
		p.HdrPanel.add(p.Hdr_qtn_rslt_rsn_cd);
		p.Hdr_qtn_rslt_rsn_cd.setNextBeans(p.Hdr_qtn_rslt_rsn_nm);
		p.Hdr_qtn_rslt_rsn_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_rslt_rsn_cd_META);
		p.HdrPanel.add(p.Hdr_qtn_rslt_rsn_nm);
		p.Hdr_qtn_rslt_rsn_nm.setNextBeans(p.Hdr_qtn_rslt_rsn_rmrks);
		p.Hdr_qtn_rslt_rsn_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_rslt_rsn_nm_META);
		p.HdrPanel.add(p.Hdr_qtn_rslt_rsn_rmrks_Label);
		p.HdrPanel.add(p.Hdr_qtn_rslt_rsn_rmrks);
		p.Hdr_qtn_rslt_rsn_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_qtn_rslt_rsn_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.qtn_rslt_rsn_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.sub_char3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1110.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBBP_QtnReg p) {
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
	protected static void jbInitBtn(MSBBP_QtnReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1210.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MSBBP1210);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP1210);
		p.Btn_open_MSBBP1210.setNextBeans(p.Btn_open_MSBBP1310);
		p.Btn_open_MSBBP1310.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_open_MSBBP1310);
		p.Btn_open_MSBBP1310.setNextBeans(p.Btn_prnt_qtn);
		p.Btn_prnt_qtn.setIcon("PRINT");
		p.Btn_prnt_qtn.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_prnt_qtn);
		p.Btn_prnt_qtn.setNextBeans(p.Btn_sprt_srch_upri);
		p.Btn_sprt_srch_upri.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_sprt_srch_upri);
		p.Btn_sprt_srch_upri.setNextBeans(p.Btn_radd);
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
		p.Btn_menu_move_p_PPanel.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
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
	protected static void jbInitEastBtn(MSBBP_QtnReg p) {
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
		MSBBP_QtnReg_MC.mcInitScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.mcInitCnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.mcInitHdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.mcInitHdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.mcInitHdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.mcInitDtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.mcInitBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.mcInitEastBtn((MSBBP_QtnReg)this);

		// [INS]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitINS_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitINS_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitINS_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitINS_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitINS_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitINS_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitINS_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitINS_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitINS_UpriSrch((MSBBP_QtnReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitFIX__I_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__I_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__I_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__I_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__I_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__I_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__I_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__I_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__I_UpriSrch((MSBBP_QtnReg)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitSRCH_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitSRCH_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitSRCH_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitSRCH_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitSRCH_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitSRCH_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitSRCH_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitSRCH_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitSRCH_UpriSrch((MSBBP_QtnReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitUPD_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD_UpriSrch((MSBBP_QtnReg)this);

		// [UPD_TRNST]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitUPD__TRNST_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__TRNST_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__TRNST_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__TRNST_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__TRNST_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__TRNST_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__TRNST_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__TRNST_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__TRNST_UpriSrch((MSBBP_QtnReg)this);

		// [UPD_APRV]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitUPD__APRV_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__APRV_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__APRV_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__APRV_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__APRV_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__APRV_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__APRV_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__APRV_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitUPD__APRV_UpriSrch((MSBBP_QtnReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitFIX__U_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__U_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__U_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__U_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__U_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__U_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__U_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__U_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__U_UpriSrch((MSBBP_QtnReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitDEL_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitDEL_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitDEL_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitDEL_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitDEL_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitDEL_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitDEL_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitDEL_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitDEL_UpriSrch((MSBBP_QtnReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitFIX__D_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__D_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__D_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__D_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__D_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__D_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__D_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__D_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitFIX__D_UpriSrch((MSBBP_QtnReg)this);

		// [REF]ステータスのモードの設定
		MSBBP_QtnReg_MC.statusInitREF_ScreenOpe((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitREF_Cnd((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitREF_HdrTab((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitREF_Hdr((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitREF_Hdr2((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitREF_Dtl((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitREF_Btn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitREF_EastBtn((MSBBP_QtnReg)this);
		MSBBP_QtnReg_MC.statusInitREF_UpriSrch((MSBBP_QtnReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_QtnReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_QtnReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_qtn_no.setListListener(p);
		p.Cnd_qtn_no.addAllListener(p);
		p.Cnd_qtn_rev.setListListener(p);
		p.Cnd_qtn_rev.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBBP_QtnReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBBP_QtnReg p) {
		p.Hdr_trd_cd.setListListener(p);
		p.Hdr_trd_cd.addAllListener(p);
		p.Hdr_trd_nm.setListListener(p);
		p.Hdr_trd_nm.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_rev_upd_flg.addAllListener(p);
		p.Hdr_qtn_no.setListListener(p);
		p.Hdr_qtn_no.addAllListener(p);
		p.Hdr_qtn_rev.setListListener(p);
		p.Hdr_qtn_rev.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_qtn_typ.setListListener(p);
		p.Hdr_qtn_typ.addAllListener(p);
		p.Hdr_qtn_typ_nm.setListListener(p);
		p.Hdr_qtn_typ_nm.addAllListener(p);
		p.Hdr_qtn_dt.setListListener(p);
		p.Hdr_qtn_dt.addAllListener(p);
		p.Hdr_valid_dt.setListListener(p);
		p.Hdr_valid_dt.addAllListener(p);
		p.Hdr_qtn_out_flg.addAllListener(p);
		p.Hdr_qtn_prnt_flg.addAllListener(p);
		p.Hdr_qtn_prnt_dt.setListListener(p);
		p.Hdr_qtn_prnt_dt.addAllListener(p);
		p.Hdr_failure_flg.addAllListener(p);
		p.Hdr_aprv_flg.addAllListener(p);
		p.Hdr_aprv_back_flg.addAllListener(p);
		p.Hdr_aprv_no.setListListener(p);
		p.Hdr_aprv_no.addAllListener(p);
		p.Hdr_aprv_sts_typ.setListListener(p);
		p.Hdr_aprv_sts_typ.addAllListener(p);
		p.Hdr_aprv_sts_typ_nm.setListListener(p);
		p.Hdr_aprv_sts_typ_nm.addAllListener(p);
		p.Hdr_aprv_upd_flg.addAllListener(p);
		p.Hdr_aprv_can_flg.addAllListener(p);
		p.Hdr_dlv_p_PPanel.Dlv_bp_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_def_cst_cd.setListListener(p);
		p.Hdr_def_cst_cd.addAllListener(p);
		p.Hdr_prnt_lcl_cd.setListListener(p);
		p.Hdr_prnt_lcl_cd.addAllListener(p);
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
		p.Hdr_cst_cd.setListListener(p);
		p.Hdr_cst_cd.addAllListener(p);
		p.Hdr_cst_nm.setListListener(p);
		p.Hdr_cst_nm.addAllListener(p);
		p.Hdr_cst_sundry_flg.addAllListener(p);
		p.Hdr_cst_iv_flg.addAllListener(p);
		p.Hdr_sls_amt_rnd_typ.setListListener(p);
		p.Hdr_sls_amt_rnd_typ.addAllListener(p);
		p.Hdr_sls_tax_rnd_typ.setListListener(p);
		p.Hdr_sls_tax_rnd_typ.addAllListener(p);
		p.Hdr_cst_usr_cd.setListListener(p);
		p.Hdr_cst_usr_cd.addAllListener(p);
		p.Hdr_cst_dpt_cd.setListListener(p);
		p.Hdr_cst_dpt_cd.addAllListener(p);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_qtn_term_cd.setListListener(p);
		p.Hdr_qtn_term_cd.addAllListener(p);
		p.Hdr_qtn_term_nm.setListListener(p);
		p.Hdr_qtn_term_nm.addAllListener(p);
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
		p.Hdr_xrate_inpt_flg.addAllListener(p);
		p.Hdr_xrate_cd.setListListener(p);
		p.Hdr_xrate_cd.addAllListener(p);
		p.Hdr_cst_qtn_rqst_no.setListListener(p);
		p.Hdr_cst_qtn_rqst_no.addAllListener(p);
		p.Hdr_prof_rate.setListListener(p);
		p.Hdr_prof_rate.addAllListener(p);
		p.Hdr_trnspt_cd.setListListener(p);
		p.Hdr_trnspt_cd.addAllListener(p);
		p.Hdr_trnspt_nm.setListListener(p);
		p.Hdr_trnspt_nm.addAllListener(p);
		p.Hdr_rcpt_dt.setListListener(p);
		p.Hdr_rcpt_dt.addAllListener(p);
		p.Hdr_rcpt_usr_cd.setListListener(p);
		p.Hdr_rcpt_usr_cd.addAllListener(p);
		p.Hdr_rcpt_usr_nm.setListListener(p);
		p.Hdr_rcpt_usr_nm.addAllListener(p);
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
		p.Hdr_qtn_rmrks.setListListener(p);
		p.Hdr_qtn_rmrks.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_qtn_rslt_rsn_cd.setListListener(p);
		p.Hdr_qtn_rslt_rsn_cd.addAllListener(p);
		p.Hdr_qtn_rslt_rsn_nm.setListListener(p);
		p.Hdr_qtn_rslt_rsn_nm.addAllListener(p);
		p.Hdr_qtn_rslt_rsn_rmrks.setListListener(p);
		p.Hdr_qtn_rslt_rsn_rmrks.addAllListener(p);
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
	protected static void mcInitHdr2(MSBBP_QtnReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBBP_QtnReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_qtn_d_no.addAllListener(p);
		p.columnDtl_qtn_d_no.setListListener(p);
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_sno1_num_typ.addAllListener(p);
		p.columnDtl_sno1_num_typ.setListListener(p);
		p.columnDtl_sno2_num_typ.addAllListener(p);
		p.columnDtl_sno2_num_typ.setListListener(p);
		p.columnDtl_sno3_num_typ.addAllListener(p);
		p.columnDtl_sno3_num_typ.setListListener(p);
		p.columnDtl_sno4_num_typ.addAllListener(p);
		p.columnDtl_sno4_num_typ.setListListener(p);
		p.columnDtl_slo_sno1_flg.addAllListener(p);
		p.columnDtl_slo_sno2_flg.addAllListener(p);
		p.columnDtl_slo_sno3_flg.addAllListener(p);
		p.columnDtl_slo_sno4_flg.addAllListener(p);
		p.columnDtl_comp_spec_typ.addAllListener(p);
		p.columnDtl_comp_spec_typ.setListListener(p);
		p.columnDtl_comp_spec_typ_nm.addAllListener(p);
		p.columnDtl_comp_spec_typ_nm.setListListener(p);
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_cntry_org_cd.addAllListener(p);
		p.columnDtl_cntry_org_cd.setListListener(p);
		p.columnDtl_cntry_org_nm.addAllListener(p);
		p.columnDtl_cntry_org_nm.setListListener(p);
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
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_upri_rate.addAllListener(p);
		p.columnDtl_upri_rate.setListListener(p);
		p.columnDtl_prof_rate.addAllListener(p);
		p.columnDtl_prof_rate.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_sno_auto_flg.addAllListener(p);
		p.columnDtl_set_itm_grp_no.addAllListener(p);
		p.columnDtl_set_itm_grp_no.setListListener(p);
		p.Dtl_dlv_p_PPanel.columnDlv_bp_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_prnt_lcl_cd.addAllListener(p);
		p.columnDtl_prnt_lcl_cd.setListListener(p);
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
		p.columnDtl_qtn_d_rmrks.addAllListener(p);
		p.columnDtl_qtn_d_rmrks.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_itm_comp_rev_no.addAllListener(p);
		p.columnDtl_itm_comp_rev_no.setListListener(p);
		p.columnDtl_no_itm_cd_flg.addAllListener(p);
		p.columnDtl_comp_rel_flg.addAllListener(p);
		p.columnDtl_spec_flg.addAllListener(p);
		p.columnDtl_spec_sub_char1.addAllListener(p);
		p.columnDtl_spec_sub_char1.setListListener(p);
		p.columnDtl_spec_sub_char2.addAllListener(p);
		p.columnDtl_spec_sub_char2.setListListener(p);
		p.columnDtl_spec_sub_char3.addAllListener(p);
		p.columnDtl_spec_sub_char3.setListListener(p);
		p.columnDtl_spec_sub_char4.addAllListener(p);
		p.columnDtl_spec_sub_char4.setListListener(p);
		p.columnDtl_qtn_d_rslt_rsn_cd.addAllListener(p);
		p.columnDtl_qtn_d_rslt_rsn_cd.setListListener(p);
		p.columnDtl_qtn_d_rslt_rsn_nm.addAllListener(p);
		p.columnDtl_qtn_d_rslt_rsn_nm.setListListener(p);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.addAllListener(p);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.setListListener(p);
		p.columnDtl_cst_qtn_rqst_d_no.addAllListener(p);
		p.columnDtl_cst_qtn_rqst_d_no.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_QtnReg p) {
		p.Btn_open_MSBBP1210.addAllListener(p);
		p.Btn_open_MSBBP1210.setAPMethodName("doBtn_open_MSBBP1210");
		p.Btn_open_MSBBP1310.addAllListener(p);
		p.Btn_open_MSBBP1310.setAPMethodName("doBtn_open_MSBBP1310");
		p.Btn_prnt_qtn.addAllListener(p);
		p.Btn_prnt_qtn.setAPMethodName("doBtn_prnt_qtn");
		p.Btn_sprt_srch_upri.addAllListener(p);
		p.Btn_sprt_srch_upri.setAPMethodName("doBtn_sprt_srch_upri");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBBP_QtnReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_qtn_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_qtn_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_valid_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_qtn_out_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_qtn_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_aprv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.ENABLE);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_dest_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_cst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.ENABLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_qtn_term_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.ENABLE);
		p.Hdr_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE);
		p.Hdr_cst_qtn_rqst_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_prof_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcpt_usr_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcpt_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_qtn_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
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

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_cntry_org_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cntry_org_nm.putMode(p, INS, MCMode.READ_ONLY);
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
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_upri_rate.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_cost_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl_sno_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.REQUIRED);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dest_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dest_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dest_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_itm_comp_rev_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_trnst_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, INS, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, INS, MCMode.DISABLE);
		p.Btn_sprt_srch_upri.putMode(p, INS, MCMode.ENABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [INS]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitINS_UpriSrch(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_qtn_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_valid_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_out_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_term_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_cst_qtn_rqst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
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

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upri_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_rev_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trnst_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_sprt_srch_upri.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_I]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_UpriSrch(MSBBP_QtnReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_qtn_rev.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_valid_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_out_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_term_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_cst_qtn_rqst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upri_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_rev_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trnst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_srch_upri.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [SRCH]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_UpriSrch(MSBBP_QtnReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_qtn_rev.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_qtn_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_valid_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_qtn_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_qtn_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_aprv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.ENABLE);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.ENABLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_qtn_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.ENABLE);
		p.Hdr_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE);
		p.Hdr_cst_qtn_rqst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_prof_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcpt_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcpt_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_qtn_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cntry_org_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cntry_org_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_upri_rate.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_cost_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.REQUIRED);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_comp_rev_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_trnst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_sprt_srch_upri.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [UPD]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD_UpriSrch(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_TRNST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__TRNST_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_TRNST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__TRNST_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, UPD_TRNST, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, UPD_TRNST, MCMode.REQUIRED);
		p.Cnd_qtn_rev.putMode(p, UPD_TRNST, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_TRNST, MCMode.ENABLE);

	}

	/**
	 * [UPD_TRNST]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__TRNST_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_TRNST]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__TRNST_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_typ_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_valid_dt.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_out_flg.putMode(p, UPD_TRNST, MCMode.REQUIRED);
		p.Hdr_qtn_prnt_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_term_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_cst_qtn_rqst_no.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Hdr_rcpt_usr_cd.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Hdr_rcpt_usr_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_rmrks.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_TRNST, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_TRNST]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__TRNST_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_TRNST]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__TRNST_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD_TRNST, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD_TRNST, MCMode.REQUIRED);
		p.columnDtl_upri_rate.putMode(p, UPD_TRNST, MCMode.REQUIRED);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_cost_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_gd_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, UPD_TRNST, MCMode.REQUIRED);
		p.Dtl_sno_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.REQUIRED);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_dest_nm1.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_dest_nm2.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_dest_nm3.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_itm_comp_rev_no.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Dtl_trnst_qty_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.columnDtl_disp_seq.putMode(p, UPD_TRNST, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(UPD_TRNST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [UPD_TRNST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__TRNST_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, UPD_TRNST, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, UPD_TRNST, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, UPD_TRNST, MCMode.DISABLE);
		p.Btn_sprt_srch_upri.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD_TRNST, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, UPD_TRNST, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_TRNST, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_TRNST, MCMode.DISABLE);

	}

	/**
	 * [UPD_TRNST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__TRNST_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_TRNST]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD__TRNST_UpriSrch(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Cnd_qtn_rev.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_APRV, MCMode.ENABLE);

	}

	/**
	 * [UPD_APRV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Hdr_qtn_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_valid_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_out_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Hdr_aprv_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_term_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD_APRV, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_cst_qtn_rqst_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_prof_rate.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_rcpt_usr_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_rcpt_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_APRV]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_upri_rate.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_gd_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_itm_comp_rev_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Dtl_trnst_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_disp_seq.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [UPD_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_sprt_srch_upri.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD_APRV, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_APRV, MCMode.DISABLE);

	}

	/**
	 * [UPD_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_UpriSrch(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_qtn_rev.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_valid_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_out_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_term_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_cst_qtn_rqst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
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

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upri_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_rev_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trnst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sprt_srch_upri.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_U]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_UpriSrch(MSBBP_QtnReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_qtn_rev.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_valid_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_out_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_term_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_cst_qtn_rqst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
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

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upri_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_rev_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trnst_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_sprt_srch_upri.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [DEL]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitDEL_UpriSrch(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_qtn_rev.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_valid_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_out_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_term_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_cst_qtn_rqst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
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

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upri_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_rev_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trnst_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_open_MSBBP1310.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_qtn.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sprt_srch_upri.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [FIX_D]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_UpriSrch(MSBBP_QtnReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_QtnReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_QtnReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_qtn_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_qtn_rev.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBBP_QtnReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBBP_QtnReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_rev_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_valid_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_out_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_prnt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_failure_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_back_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_def_cst_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_sundry_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_term_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_term_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_cst_qtn_rqst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_no_cost_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcpt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcpt_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_rslt_rsn_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Hdr2(MSBBP_QtnReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBBP_QtnReg p){
		p.columnDtl_qtn_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_slo_sno1_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_slo_sno2_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_slo_sno3_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_slo_sno4_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upri_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_auto_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_set_itm_grp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_rev_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_no_itm_cd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_comp_rel_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_spec_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_spec_sub_char4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_qtn_d_rslt_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trnst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cst_qtn_rqst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBBP_QtnReg p){
		p.Btn_open_MSBBP1210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBBP1310.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt_qtn.putMode(p, REF, MCMode.ENABLE);
		p.Btn_sprt_srch_upri.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBBP_QtnReg p){

	}

	/**
	 * [REF]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF_UpriSrch(MSBBP_QtnReg p){

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
		MSBBP_QtnReg_MC.setTableConfigDtl((MSBBP_QtnReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBBP_QtnReg p) {
		p.columnDtl_qtn_d_no.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.qtn_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_d_no);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.cst_itm_cd_META);
		p.columnDtl_cst_itm_cd.addLinkBeans(p.columnDtl_cst_itm_nm,p.columnDtl_itm_cd,p.columnDtl_itm_sub1,p.columnDtl_itm_sub2,p.columnDtl_itm_sub3);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_cntry_org_cd, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_dscnt_itm_flg, p.columnDtl_comp_spec_typ, p.columnDtl_comp_spec_typ_nm, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sno1_num_typ, p.columnDtl_sno2_num_typ, p.columnDtl_sno3_num_typ, p.columnDtl_sno4_num_typ, p.columnDtl_slo_sno1_flg, p.columnDtl_slo_sno2_flg, p.columnDtl_slo_sno3_flg, p.columnDtl_slo_sno4_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_cntry_org_cd, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_dscnt_itm_flg, p.columnDtl_comp_spec_typ, p.columnDtl_comp_spec_typ_nm, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sno1_num_typ, p.columnDtl_sno2_num_typ, p.columnDtl_sno3_num_typ, p.columnDtl_sno4_num_typ, p.columnDtl_slo_sno1_flg, p.columnDtl_slo_sno2_flg, p.columnDtl_slo_sno3_flg, p.columnDtl_slo_sno4_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_cntry_org_cd, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_dscnt_itm_flg, p.columnDtl_comp_spec_typ, p.columnDtl_comp_spec_typ_nm, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sno1_num_typ, p.columnDtl_sno2_num_typ, p.columnDtl_sno3_num_typ, p.columnDtl_sno4_num_typ, p.columnDtl_slo_sno1_flg, p.columnDtl_slo_sno2_flg, p.columnDtl_slo_sno3_flg, p.columnDtl_slo_sno4_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_cntry_org_cd, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_dscnt_itm_flg, p.columnDtl_comp_spec_typ, p.columnDtl_comp_spec_typ_nm, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sno1_num_typ, p.columnDtl_sno2_num_typ, p.columnDtl_sno3_num_typ, p.columnDtl_sno4_num_typ, p.columnDtl_slo_sno1_flg, p.columnDtl_slo_sno2_flg, p.columnDtl_slo_sno3_flg, p.columnDtl_slo_sno4_flg);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_sno1_num_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sno1_num_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_num_typ);
		p.columnDtl_sno2_num_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sno2_num_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_num_typ);
		p.columnDtl_sno3_num_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sno3_num_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_num_typ);
		p.columnDtl_sno4_num_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sno4_num_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_num_typ);
		p.columnDtl_slo_sno1_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.slo_sno1_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_sno1_flg);
		p.columnDtl_slo_sno2_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.slo_sno2_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_sno2_flg);
		p.columnDtl_slo_sno3_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.slo_sno3_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_sno3_flg);
		p.columnDtl_slo_sno4_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.slo_sno4_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_sno4_flg);
		p.columnDtl_comp_spec_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.comp_spec_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_comp_spec_typ);
		p.columnDtl_comp_spec_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.comp_spec_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_comp_spec_typ_nm);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_cntry_org_cd.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.cntry_org_cd_META);
		p.columnDtl_cntry_org_cd.addLinkBeans(p.columnDtl_cntry_org_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_org_cd);
		p.columnDtl_cntry_org_nm.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.cntry_org_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_org_nm);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_conv_qty,p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_rate, p.columnDtl_tax_typ, p.columnDtl_inc_tax_flg);
		p.Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setLinkBeans(p.columnDtl_dscnt_rsn_nm);
		p.columnDtl_upri_rate.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.upri_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upri_rate);
		p.DtlTable.addTable(p.Dtl_trd_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_cost_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_cost_amt_p_PPanel.AmtTable);
		p.columnDtl_prof_rate.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.prof_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prof_rate);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.gd_cd_META);
		p.columnDtl_gd_cd.addLinkBeans(p.columnDtl_gd_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.columnDtl_sno_auto_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sno_auto_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_auto_flg);
		p.DtlTable.addTable(p.Dtl_sno_p_PPanel.SnoTable);
		p.DtlTable.addTable(p.Dtl_base_cur_std_sls_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_std_sls_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_std_sls_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_std_sls_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_tax_amt_p_PPanel.AmtTable);
		p.columnDtl_set_itm_grp_no.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.set_itm_grp_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_set_itm_grp_no);
		p.DtlTable.addTable(p.Dtl_dlv_p_PPanel.DlvTable);
		p.Dtl_dlv_p_PPanel.columnDlv_bp_cd.setLinkBeans(p.columnDtl_dlv_nm, p.columnDtl_dlv_sundry_flg, p.columnDtl_pri_prnt_flg, p.columnDtl_dlv_zip_cd, p.columnDtl_dlv_addr1, p.columnDtl_dlv_addr2, p.columnDtl_dlv_addr3, p.columnDtl_dlv_addr4, p.columnDtl_dlv_cntry_cd, p.columnDtl_dlv_cntry_nm, p.columnDtl_dlv_tel, p.columnDtl_dlv_fax, p.columnDtl_dlv_cntct_dpt, p.columnDtl_dlv_cntct_psn, p.columnDtl_dlv_lg_grp_cd, p.columnDtl_prnt_lcl_cd);
		p.columnDtl_prnt_lcl_cd.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.prnt_lcl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prnt_lcl_cd);
		p.columnDtl_dest_cd1.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.dest_cd1_META);
		p.columnDtl_dest_cd1.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd1.addLinkBeans(p.columnDtl_dest_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd1);
		p.columnDtl_dest_nm1.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.dest_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm1);
		p.columnDtl_dest_cd2.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.dest_cd2_META);
		p.columnDtl_dest_cd2.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd2.addLinkBeans(p.columnDtl_dest_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd2);
		p.columnDtl_dest_nm2.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.dest_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm2);
		p.columnDtl_dest_cd3.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.dest_cd3_META);
		p.columnDtl_dest_cd3.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd3.addLinkBeans(p.columnDtl_dest_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd3);
		p.columnDtl_dest_nm3.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.dest_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm3);
		p.columnDtl_qtn_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.qtn_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_d_rmrks);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_itm_comp_rev_no.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.itm_comp_rev_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_comp_rev_no);
		p.columnDtl_no_itm_cd_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.no_itm_cd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_no_itm_cd_flg);
		p.columnDtl_comp_rel_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.comp_rel_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_comp_rel_flg);
		p.columnDtl_spec_flg.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.spec_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spec_flg);
		p.columnDtl_spec_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.spec_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spec_sub_char1);
		p.columnDtl_spec_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.spec_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spec_sub_char2);
		p.columnDtl_spec_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.spec_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spec_sub_char3);
		p.columnDtl_spec_sub_char4.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.spec_sub_char4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spec_sub_char4);
		p.columnDtl_qtn_d_rslt_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.qtn_d_rslt_rsn_cd_META);
		p.columnDtl_qtn_d_rslt_rsn_cd.addLinkBeans(p.columnDtl_qtn_d_rslt_rsn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_d_rslt_rsn_cd);
		p.columnDtl_qtn_d_rslt_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.qtn_d_rslt_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_d_rslt_rsn_nm);
		p.columnDtl_qtn_d_rslt_rsn_rmrks.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.qtn_d_rslt_rsn_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qtn_d_rslt_rsn_rmrks);
		p.DtlTable.addTable(p.Dtl_trnst_qty_p_PPanel.QtyTable);
		p.columnDtl_cst_qtn_rqst_d_no.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.cst_qtn_rqst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_qtn_rqst_d_no);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBB.MSBBP1110.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.DtlTable.addTable(p.Dtl_old_trd_cur_std_sls_upri_p_PPanel.UpriTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cd.getListConfig().setPutter(getHdr_trd_cd_ListPutter());
		Hdr_qtn_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_qtn_typ.getListConfig().setPutter(getHdr_qtn_typ_ListPutter());
		Hdr_dlv_p_PPanel.Dlv_bp_cd.getListConfig().setPutter(getHdr_dlv_p_PPanel_Dlv_bp_cd_ListPutter());
		Hdr_dest_cd1.getListConfig().setPutter(getHdr_dest_cd1_ListPutter());
		Hdr_dest_cd2.getListConfig().setPutter(getHdr_dest_cd2_ListPutter());
		Hdr_dest_cd3.getListConfig().setPutter(getHdr_dest_cd3_ListPutter());
		Hdr_cst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_cst_cd.getListConfig().setPutter(getHdr_cst_cd_ListPutter());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_qtn_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_qtn_term_cd.getListConfig().setPutter(getHdr_qtn_term_cd_ListPutter());
		Hdr_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cur_cd.getListConfig().setPutter(getHdr_trd_cur_cd_ListPutter());
		Hdr_trnspt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trnspt_cd.getListConfig().setPutter(getHdr_trnspt_cd_ListPutter());
		Hdr_rcpt_usr_cd.getListConfig().setPutter(getHdr_rcpt_usr_cd_ListPutter());
		Hdr_tterm_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd1.getListConfig().setPutter(getHdr_tterm_cd1_ListPutter());
		Hdr_tterm_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd2.getListConfig().setPutter(getHdr_tterm_cd2_ListPutter());
		Hdr_tterm_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd3.getListConfig().setPutter(getHdr_tterm_cd3_ListPutter());
		Hdr_qtn_rslt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_qtn_rslt_rsn_cd.getListConfig().setPutter(getHdr_qtn_rslt_rsn_cd_ListPutter());
		columnDtl_cst_itm_cd.getListConfig().setPutter(getDtl_cst_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_cntry_org_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cntry_org_cd.getListConfig().setPutter(getDtl_cntry_org_cd_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter());
		columnDtl_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_gd_cd.getListConfig().setPutter(getDtl_gd_cd_ListPutter());
		Dtl_dlv_p_PPanel.columnDlv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_dlv_p_PPanel.columnDlv_bp_cd.getListConfig().setPutter(getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter());
		columnDtl_dest_cd1.getListConfig().setPutter(getDtl_dest_cd1_ListPutter());
		columnDtl_dest_cd2.getListConfig().setPutter(getDtl_dest_cd2_ListPutter());
		columnDtl_dest_cd3.getListConfig().setPutter(getDtl_dest_cd3_ListPutter());
		columnDtl_qtn_d_rslt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_qtn_d_rslt_rsn_cd.getListConfig().setPutter(getDtl_qtn_d_rslt_rsn_cd_ListPutter());
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
	 * この画面を[UPD_TRNST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_TRNSTStatus() {
		status = UPD_TRNST;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_APRV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_APRVStatus() {
		status = UPD_APRV;
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
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_TRNST.equals(status)) {
			setUPD_TRNSTStatus();
		}
		else if (UPD_APRV.equals(status)) {
			setUPD_APRVStatus();
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
	 * [Hdr_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Hdr_qtn_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_qtn_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.QtnTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_dlv_p_PPanel_Dlv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dlv_p_PPanel_Dlv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Hdr_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Hdr_qtn_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_qtn_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.QtnTerm");
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
	 * [Hdr_trnspt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_trnspt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trnspt");
		return lp;
	}
	 
	/**
	 * [Hdr_rcpt_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rcpt_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
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
	 * [Hdr_qtn_rslt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_qtn_rslt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.QtnRsltRsn");
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
	 * [Dtl_cntry_org_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cntry_org_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
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
	 * [Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}

	/**
	 * [Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsDscntBizRsn");
		return lp;
	}

	/**
	 * [Dtl_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.CstSloStkGd");
		return lp;
	}
	 
	/**
	 * [Dtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Dtl_qtn_d_rslt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_qtn_d_rslt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.QtnRsltRsn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_trd_cd) return getHdr_trd_cd(row, info);
		if(combo == Hdr_qtn_typ) return getHdr_qtn_typ(row, info);
		if(combo == Hdr_dlv_p_PPanel.Dlv_bp_cd) return getHdr_dlv_p_PPanel_Dlv_bp_cd(row, info);
		if(combo == Hdr_dest_cd1) return getHdr_dest_cd1(row, info);
		if(combo == Hdr_dest_cd2) return getHdr_dest_cd2(row, info);
		if(combo == Hdr_dest_cd3) return getHdr_dest_cd3(row, info);
		if(combo == Hdr_cst_cd) return getHdr_cst_cd(row, info);
		if(combo == Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_qtn_term_cd) return getHdr_qtn_term_cd(row, info);
		if(combo == Hdr_trd_cur_cd) return getHdr_trd_cur_cd(row, info);
		if(combo == Hdr_trnspt_cd) return getHdr_trnspt_cd(row, info);
		if(combo == Hdr_rcpt_usr_cd) return getHdr_rcpt_usr_cd(row, info);
		if(combo == Hdr_tterm_cd1) return getHdr_tterm_cd1(row, info);
		if(combo == Hdr_tterm_cd2) return getHdr_tterm_cd2(row, info);
		if(combo == Hdr_tterm_cd3) return getHdr_tterm_cd3(row, info);
		if(combo == Hdr_qtn_rslt_rsn_cd) return getHdr_qtn_rslt_rsn_cd(row, info);
		if(combo == columnDtl_cst_itm_cd) return getDtl_cst_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_cntry_org_cd) return getDtl_cntry_org_cd(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == Dtl_trd_cur_std_sls_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd) return getDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(row, info);
		if(combo == columnDtl_gd_cd) return getDtl_gd_cd(row, info);
		if(combo == Dtl_dlv_p_PPanel.columnDlv_bp_cd) return getDtl_dlv_p_PPanel_columnDlv_bp_cd(row, info);
		if(combo == columnDtl_dest_cd1) return getDtl_dest_cd1(row, info);
		if(combo == columnDtl_dest_cd2) return getDtl_dest_cd2(row, info);
		if(combo == columnDtl_dest_cd3) return getDtl_dest_cd3(row, info);
		if(combo == columnDtl_qtn_d_rslt_rsn_cd) return getDtl_qtn_d_rslt_rsn_cd(row, info);
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
		else if (ap == Btn_open_MSBBP1210) doBtn_open_MSBBP1210(info);
		else if (ap == Btn_open_MSBBP1310) doBtn_open_MSBBP1310(info);
		else if (ap == Btn_prnt_qtn) doBtn_prnt_qtn(info);
		else if (ap == Btn_sprt_srch_upri) doBtn_sprt_srch_upri(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1210(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1310]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1310(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_qtn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_qtn(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_srch_upri]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_srch_upri(MCEventInfo info);

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
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_qtn_no) return doCnd_qtn_no_VC(info);
		if (vc == Cnd_qtn_rev) return doCnd_qtn_rev_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_rev_upd_flg) return doHdr_rev_upd_flg_VC(info);
		if (vc == Hdr_qtn_no) return doHdr_qtn_no_VC(info);
		if (vc == Hdr_qtn_rev) return doHdr_qtn_rev_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_qtn_typ) return doHdr_qtn_typ_VC(info);
		if (vc == Hdr_qtn_typ_nm) return doHdr_qtn_typ_nm_VC(info);
		if (vc == Hdr_qtn_dt) return doHdr_qtn_dt_VC(info);
		if (vc == Hdr_valid_dt) return doHdr_valid_dt_VC(info);
		if (vc == Hdr_qtn_out_flg) return doHdr_qtn_out_flg_VC(info);
		if (vc == Hdr_qtn_prnt_flg) return doHdr_qtn_prnt_flg_VC(info);
		if (vc == Hdr_qtn_prnt_dt) return doHdr_qtn_prnt_dt_VC(info);
		if (vc == Hdr_failure_flg) return doHdr_failure_flg_VC(info);
		if (vc == Hdr_aprv_flg) return doHdr_aprv_flg_VC(info);
		if (vc == Hdr_aprv_back_flg) return doHdr_aprv_back_flg_VC(info);
		if (vc == Hdr_aprv_no) return doHdr_aprv_no_VC(info);
		if (vc == Hdr_aprv_sts_typ) return doHdr_aprv_sts_typ_VC(info);
		if (vc == Hdr_aprv_sts_typ_nm) return doHdr_aprv_sts_typ_nm_VC(info);
		if (vc == Hdr_aprv_upd_flg) return doHdr_aprv_upd_flg_VC(info);
		if (vc == Hdr_aprv_can_flg) return doHdr_aprv_can_flg_VC(info);
		if (vc == Hdr_def_cst_cd) return doHdr_def_cst_cd_VC(info);
		if (vc == Hdr_prnt_lcl_cd) return doHdr_prnt_lcl_cd_VC(info);
		if (vc == Hdr_dest_cd1) return doHdr_dest_cd1_VC(info);
		if (vc == Hdr_dest_nm1) return doHdr_dest_nm1_VC(info);
		if (vc == Hdr_dest_cd2) return doHdr_dest_cd2_VC(info);
		if (vc == Hdr_dest_nm2) return doHdr_dest_nm2_VC(info);
		if (vc == Hdr_dest_cd3) return doHdr_dest_cd3_VC(info);
		if (vc == Hdr_dest_nm3) return doHdr_dest_nm3_VC(info);
		if (vc == Hdr_cst_cd) return doHdr_cst_cd_VC(info);
		if (vc == Hdr_cst_nm) return doHdr_cst_nm_VC(info);
		if (vc == Hdr_cst_sundry_flg) return doHdr_cst_sundry_flg_VC(info);
		if (vc == Hdr_cst_iv_flg) return doHdr_cst_iv_flg_VC(info);
		if (vc == Hdr_sls_amt_rnd_typ) return doHdr_sls_amt_rnd_typ_VC(info);
		if (vc == Hdr_sls_tax_rnd_typ) return doHdr_sls_tax_rnd_typ_VC(info);
		if (vc == Hdr_cst_usr_cd) return doHdr_cst_usr_cd_VC(info);
		if (vc == Hdr_cst_dpt_cd) return doHdr_cst_dpt_cd_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_qtn_term_cd) return doHdr_qtn_term_cd_VC(info);
		if (vc == Hdr_qtn_term_nm) return doHdr_qtn_term_nm_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_trd_cur_amt_dec_place) return doHdr_trd_cur_amt_dec_place_VC(info);
		if (vc == Hdr_trd_cur_upri_dec_place) return doHdr_trd_cur_upri_dec_place_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_base_cur_amt_dec_place) return doHdr_base_cur_amt_dec_place_VC(info);
		if (vc == Hdr_base_cur_upri_dec_place) return doHdr_base_cur_upri_dec_place_VC(info);
		if (vc == Hdr_xrate_inpt_flg) return doHdr_xrate_inpt_flg_VC(info);
		if (vc == Hdr_xrate_cd) return doHdr_xrate_cd_VC(info);
		if (vc == Hdr_cst_qtn_rqst_no) return doHdr_cst_qtn_rqst_no_VC(info);
		if (vc == Hdr_prof_rate) return doHdr_prof_rate_VC(info);
		if (vc == Hdr_trnspt_cd) return doHdr_trnspt_cd_VC(info);
		if (vc == Hdr_trnspt_nm) return doHdr_trnspt_nm_VC(info);
		if (vc == Hdr_rcpt_dt) return doHdr_rcpt_dt_VC(info);
		if (vc == Hdr_rcpt_usr_cd) return doHdr_rcpt_usr_cd_VC(info);
		if (vc == Hdr_rcpt_usr_nm) return doHdr_rcpt_usr_nm_VC(info);
		if (vc == Hdr_tterm_cd1) return doHdr_tterm_cd1_VC(info);
		if (vc == Hdr_tterm_nm1) return doHdr_tterm_nm1_VC(info);
		if (vc == Hdr_tterm_rmrks1) return doHdr_tterm_rmrks1_VC(info);
		if (vc == Hdr_tterm_cd2) return doHdr_tterm_cd2_VC(info);
		if (vc == Hdr_tterm_nm2) return doHdr_tterm_nm2_VC(info);
		if (vc == Hdr_tterm_rmrks2) return doHdr_tterm_rmrks2_VC(info);
		if (vc == Hdr_tterm_cd3) return doHdr_tterm_cd3_VC(info);
		if (vc == Hdr_tterm_nm3) return doHdr_tterm_nm3_VC(info);
		if (vc == Hdr_tterm_rmrks3) return doHdr_tterm_rmrks3_VC(info);
		if (vc == Hdr_qtn_rmrks) return doHdr_qtn_rmrks_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_qtn_rslt_rsn_cd) return doHdr_qtn_rslt_rsn_cd_VC(info);
		if (vc == Hdr_qtn_rslt_rsn_nm) return doHdr_qtn_rslt_rsn_nm_VC(info);
		if (vc == Hdr_qtn_rslt_rsn_rmrks) return doHdr_qtn_rslt_rsn_rmrks_VC(info);
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
		if (vc == columnDtl_qtn_d_no) return doDtl_qtn_d_no_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_sno1_num_typ) return doDtl_sno1_num_typ_VC(info);
		if (vc == columnDtl_sno2_num_typ) return doDtl_sno2_num_typ_VC(info);
		if (vc == columnDtl_sno3_num_typ) return doDtl_sno3_num_typ_VC(info);
		if (vc == columnDtl_sno4_num_typ) return doDtl_sno4_num_typ_VC(info);
		if (vc == columnDtl_slo_sno1_flg) return doDtl_slo_sno1_flg_VC(info);
		if (vc == columnDtl_slo_sno2_flg) return doDtl_slo_sno2_flg_VC(info);
		if (vc == columnDtl_slo_sno3_flg) return doDtl_slo_sno3_flg_VC(info);
		if (vc == columnDtl_slo_sno4_flg) return doDtl_slo_sno4_flg_VC(info);
		if (vc == columnDtl_comp_spec_typ) return doDtl_comp_spec_typ_VC(info);
		if (vc == columnDtl_comp_spec_typ_nm) return doDtl_comp_spec_typ_nm_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_cntry_org_cd) return doDtl_cntry_org_cd_VC(info);
		if (vc == columnDtl_cntry_org_nm) return doDtl_cntry_org_nm_VC(info);
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
		if (vc == columnDtl_upri_rate) return doDtl_upri_rate_VC(info);
		if (vc == columnDtl_prof_rate) return doDtl_prof_rate_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_sno_auto_flg) return doDtl_sno_auto_flg_VC(info);
		if (vc == columnDtl_set_itm_grp_no) return doDtl_set_itm_grp_no_VC(info);
		if (vc == columnDtl_prnt_lcl_cd) return doDtl_prnt_lcl_cd_VC(info);
		if (vc == columnDtl_dest_cd1) return doDtl_dest_cd1_VC(info);
		if (vc == columnDtl_dest_nm1) return doDtl_dest_nm1_VC(info);
		if (vc == columnDtl_dest_cd2) return doDtl_dest_cd2_VC(info);
		if (vc == columnDtl_dest_nm2) return doDtl_dest_nm2_VC(info);
		if (vc == columnDtl_dest_cd3) return doDtl_dest_cd3_VC(info);
		if (vc == columnDtl_dest_nm3) return doDtl_dest_nm3_VC(info);
		if (vc == columnDtl_qtn_d_rmrks) return doDtl_qtn_d_rmrks_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_itm_comp_rev_no) return doDtl_itm_comp_rev_no_VC(info);
		if (vc == columnDtl_no_itm_cd_flg) return doDtl_no_itm_cd_flg_VC(info);
		if (vc == columnDtl_comp_rel_flg) return doDtl_comp_rel_flg_VC(info);
		if (vc == columnDtl_spec_flg) return doDtl_spec_flg_VC(info);
		if (vc == columnDtl_spec_sub_char1) return doDtl_spec_sub_char1_VC(info);
		if (vc == columnDtl_spec_sub_char2) return doDtl_spec_sub_char2_VC(info);
		if (vc == columnDtl_spec_sub_char3) return doDtl_spec_sub_char3_VC(info);
		if (vc == columnDtl_spec_sub_char4) return doDtl_spec_sub_char4_VC(info);
		if (vc == columnDtl_qtn_d_rslt_rsn_cd) return doDtl_qtn_d_rslt_rsn_cd_VC(info);
		if (vc == columnDtl_qtn_d_rslt_rsn_nm) return doDtl_qtn_d_rslt_rsn_nm_VC(info);
		if (vc == columnDtl_qtn_d_rslt_rsn_rmrks) return doDtl_qtn_d_rslt_rsn_rmrks_VC(info);
		if (vc == columnDtl_cst_qtn_rqst_d_no) return doDtl_cst_qtn_rqst_d_no_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
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
	 * [Cnd]パネルの[qtn_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_qtn_rev_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[rev_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rev_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_rev_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[valid_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_valid_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_prnt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_prnt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[failure_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_failure_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[aprv_back_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_back_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[def_cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_def_cst_cd_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[cst_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_sundry_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_term_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[cst_qtn_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_qtn_rqst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prof_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prof_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trnspt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trnspt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcpt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcpt_usr_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_rmrks_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_rslt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_rslt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_rslt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_qtn_rslt_rsn_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_comp_spec_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_comp_spec_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_org_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_org_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upri_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prof_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prof_rate_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno_auto_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_auto_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[set_itm_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_set_itm_grp_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_d_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_comp_rev_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_comp_rev_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[no_itm_cd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_no_itm_cd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[comp_rel_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_comp_rel_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spec_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spec_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spec_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spec_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spec_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spec_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spec_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spec_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spec_sub_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spec_sub_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_d_rslt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_d_rslt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qtn_d_rslt_rsn_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_qtn_rqst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_qtn_rqst_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
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
		else if (nc == Cnd_qtn_no) doCnd_qtn_no_NC(info);
		else if (nc == Cnd_qtn_rev) doCnd_qtn_rev_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_rev_upd_flg) doHdr_rev_upd_flg_NC(info);
		else if (nc == Hdr_qtn_no) doHdr_qtn_no_NC(info);
		else if (nc == Hdr_qtn_rev) doHdr_qtn_rev_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_qtn_typ) doHdr_qtn_typ_NC(info);
		else if (nc == Hdr_qtn_typ_nm) doHdr_qtn_typ_nm_NC(info);
		else if (nc == Hdr_qtn_dt) doHdr_qtn_dt_NC(info);
		else if (nc == Hdr_valid_dt) doHdr_valid_dt_NC(info);
		else if (nc == Hdr_qtn_out_flg) doHdr_qtn_out_flg_NC(info);
		else if (nc == Hdr_qtn_prnt_flg) doHdr_qtn_prnt_flg_NC(info);
		else if (nc == Hdr_qtn_prnt_dt) doHdr_qtn_prnt_dt_NC(info);
		else if (nc == Hdr_failure_flg) doHdr_failure_flg_NC(info);
		else if (nc == Hdr_aprv_flg) doHdr_aprv_flg_NC(info);
		else if (nc == Hdr_aprv_back_flg) doHdr_aprv_back_flg_NC(info);
		else if (nc == Hdr_aprv_no) doHdr_aprv_no_NC(info);
		else if (nc == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_NC(info);
		else if (nc == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_NC(info);
		else if (nc == Hdr_aprv_upd_flg) doHdr_aprv_upd_flg_NC(info);
		else if (nc == Hdr_aprv_can_flg) doHdr_aprv_can_flg_NC(info);
		else if (nc == Hdr_def_cst_cd) doHdr_def_cst_cd_NC(info);
		else if (nc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NC(info);
		else if (nc == Hdr_dest_cd1) doHdr_dest_cd1_NC(info);
		else if (nc == Hdr_dest_nm1) doHdr_dest_nm1_NC(info);
		else if (nc == Hdr_dest_cd2) doHdr_dest_cd2_NC(info);
		else if (nc == Hdr_dest_nm2) doHdr_dest_nm2_NC(info);
		else if (nc == Hdr_dest_cd3) doHdr_dest_cd3_NC(info);
		else if (nc == Hdr_dest_nm3) doHdr_dest_nm3_NC(info);
		else if (nc == Hdr_cst_cd) doHdr_cst_cd_NC(info);
		else if (nc == Hdr_cst_nm) doHdr_cst_nm_NC(info);
		else if (nc == Hdr_cst_sundry_flg) doHdr_cst_sundry_flg_NC(info);
		else if (nc == Hdr_cst_iv_flg) doHdr_cst_iv_flg_NC(info);
		else if (nc == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_NC(info);
		else if (nc == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_NC(info);
		else if (nc == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NC(info);
		else if (nc == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_qtn_term_cd) doHdr_qtn_term_cd_NC(info);
		else if (nc == Hdr_qtn_term_nm) doHdr_qtn_term_nm_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NC(info);
		else if (nc == Hdr_xrate_cd) doHdr_xrate_cd_NC(info);
		else if (nc == Hdr_cst_qtn_rqst_no) doHdr_cst_qtn_rqst_no_NC(info);
		else if (nc == Hdr_prof_rate) doHdr_prof_rate_NC(info);
		else if (nc == Hdr_trnspt_cd) doHdr_trnspt_cd_NC(info);
		else if (nc == Hdr_trnspt_nm) doHdr_trnspt_nm_NC(info);
		else if (nc == Hdr_rcpt_dt) doHdr_rcpt_dt_NC(info);
		else if (nc == Hdr_rcpt_usr_cd) doHdr_rcpt_usr_cd_NC(info);
		else if (nc == Hdr_rcpt_usr_nm) doHdr_rcpt_usr_nm_NC(info);
		else if (nc == Hdr_tterm_cd1) doHdr_tterm_cd1_NC(info);
		else if (nc == Hdr_tterm_nm1) doHdr_tterm_nm1_NC(info);
		else if (nc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NC(info);
		else if (nc == Hdr_tterm_cd2) doHdr_tterm_cd2_NC(info);
		else if (nc == Hdr_tterm_nm2) doHdr_tterm_nm2_NC(info);
		else if (nc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NC(info);
		else if (nc == Hdr_tterm_cd3) doHdr_tterm_cd3_NC(info);
		else if (nc == Hdr_tterm_nm3) doHdr_tterm_nm3_NC(info);
		else if (nc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NC(info);
		else if (nc == Hdr_qtn_rmrks) doHdr_qtn_rmrks_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_qtn_rslt_rsn_cd) doHdr_qtn_rslt_rsn_cd_NC(info);
		else if (nc == Hdr_qtn_rslt_rsn_nm) doHdr_qtn_rslt_rsn_nm_NC(info);
		else if (nc == Hdr_qtn_rslt_rsn_rmrks) doHdr_qtn_rslt_rsn_rmrks_NC(info);
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
		else if (nc == columnDtl_qtn_d_no) doDtl_qtn_d_no_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_sno1_num_typ) doDtl_sno1_num_typ_NC(info);
		else if (nc == columnDtl_sno2_num_typ) doDtl_sno2_num_typ_NC(info);
		else if (nc == columnDtl_sno3_num_typ) doDtl_sno3_num_typ_NC(info);
		else if (nc == columnDtl_sno4_num_typ) doDtl_sno4_num_typ_NC(info);
		else if (nc == columnDtl_slo_sno1_flg) doDtl_slo_sno1_flg_NC(info);
		else if (nc == columnDtl_slo_sno2_flg) doDtl_slo_sno2_flg_NC(info);
		else if (nc == columnDtl_slo_sno3_flg) doDtl_slo_sno3_flg_NC(info);
		else if (nc == columnDtl_slo_sno4_flg) doDtl_slo_sno4_flg_NC(info);
		else if (nc == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_NC(info);
		else if (nc == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NC(info);
		else if (nc == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NC(info);
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
		else if (nc == columnDtl_upri_rate) doDtl_upri_rate_NC(info);
		else if (nc == columnDtl_prof_rate) doDtl_prof_rate_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_sno_auto_flg) doDtl_sno_auto_flg_NC(info);
		else if (nc == columnDtl_set_itm_grp_no) doDtl_set_itm_grp_no_NC(info);
		else if (nc == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NC(info);
		else if (nc == columnDtl_dest_cd1) doDtl_dest_cd1_NC(info);
		else if (nc == columnDtl_dest_nm1) doDtl_dest_nm1_NC(info);
		else if (nc == columnDtl_dest_cd2) doDtl_dest_cd2_NC(info);
		else if (nc == columnDtl_dest_nm2) doDtl_dest_nm2_NC(info);
		else if (nc == columnDtl_dest_cd3) doDtl_dest_cd3_NC(info);
		else if (nc == columnDtl_dest_nm3) doDtl_dest_nm3_NC(info);
		else if (nc == columnDtl_qtn_d_rmrks) doDtl_qtn_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_itm_comp_rev_no) doDtl_itm_comp_rev_no_NC(info);
		else if (nc == columnDtl_no_itm_cd_flg) doDtl_no_itm_cd_flg_NC(info);
		else if (nc == columnDtl_comp_rel_flg) doDtl_comp_rel_flg_NC(info);
		else if (nc == columnDtl_spec_flg) doDtl_spec_flg_NC(info);
		else if (nc == columnDtl_spec_sub_char1) doDtl_spec_sub_char1_NC(info);
		else if (nc == columnDtl_spec_sub_char2) doDtl_spec_sub_char2_NC(info);
		else if (nc == columnDtl_spec_sub_char3) doDtl_spec_sub_char3_NC(info);
		else if (nc == columnDtl_spec_sub_char4) doDtl_spec_sub_char4_NC(info);
		else if (nc == columnDtl_qtn_d_rslt_rsn_cd) doDtl_qtn_d_rslt_rsn_cd_NC(info);
		else if (nc == columnDtl_qtn_d_rslt_rsn_nm) doDtl_qtn_d_rslt_rsn_nm_NC(info);
		else if (nc == columnDtl_qtn_d_rslt_rsn_rmrks) doDtl_qtn_d_rslt_rsn_rmrks_NC(info);
		else if (nc == columnDtl_cst_qtn_rqst_d_no) doDtl_cst_qtn_rqst_d_no_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
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
	 * [Cnd]パネルの[qtn_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rev_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[rev_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rev_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rev_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[valid_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_valid_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_prnt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_prnt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[failure_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_failure_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_back_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_back_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[def_cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[cst_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_sundry_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_term_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_qtn_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_qtn_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_usr_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_rmrks_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno_auto_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_auto_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_rev_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_rev_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[no_itm_cd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_no_itm_cd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_rel_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_rel_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_qtn_rqst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_qtn_rqst_d_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
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
		else if (ne == Cnd_qtn_no) doCnd_qtn_no_NE(info);
		else if (ne == Cnd_qtn_rev) doCnd_qtn_rev_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_rev_upd_flg) doHdr_rev_upd_flg_NE(info);
		else if (ne == Hdr_qtn_no) doHdr_qtn_no_NE(info);
		else if (ne == Hdr_qtn_rev) doHdr_qtn_rev_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_qtn_typ) doHdr_qtn_typ_NE(info);
		else if (ne == Hdr_qtn_typ_nm) doHdr_qtn_typ_nm_NE(info);
		else if (ne == Hdr_qtn_dt) doHdr_qtn_dt_NE(info);
		else if (ne == Hdr_valid_dt) doHdr_valid_dt_NE(info);
		else if (ne == Hdr_qtn_out_flg) doHdr_qtn_out_flg_NE(info);
		else if (ne == Hdr_qtn_prnt_flg) doHdr_qtn_prnt_flg_NE(info);
		else if (ne == Hdr_qtn_prnt_dt) doHdr_qtn_prnt_dt_NE(info);
		else if (ne == Hdr_failure_flg) doHdr_failure_flg_NE(info);
		else if (ne == Hdr_aprv_flg) doHdr_aprv_flg_NE(info);
		else if (ne == Hdr_aprv_back_flg) doHdr_aprv_back_flg_NE(info);
		else if (ne == Hdr_aprv_no) doHdr_aprv_no_NE(info);
		else if (ne == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_NE(info);
		else if (ne == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_NE(info);
		else if (ne == Hdr_aprv_upd_flg) doHdr_aprv_upd_flg_NE(info);
		else if (ne == Hdr_aprv_can_flg) doHdr_aprv_can_flg_NE(info);
		else if (ne == Hdr_def_cst_cd) doHdr_def_cst_cd_NE(info);
		else if (ne == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NE(info);
		else if (ne == Hdr_dest_cd1) doHdr_dest_cd1_NE(info);
		else if (ne == Hdr_dest_nm1) doHdr_dest_nm1_NE(info);
		else if (ne == Hdr_dest_cd2) doHdr_dest_cd2_NE(info);
		else if (ne == Hdr_dest_nm2) doHdr_dest_nm2_NE(info);
		else if (ne == Hdr_dest_cd3) doHdr_dest_cd3_NE(info);
		else if (ne == Hdr_dest_nm3) doHdr_dest_nm3_NE(info);
		else if (ne == Hdr_cst_cd) doHdr_cst_cd_NE(info);
		else if (ne == Hdr_cst_nm) doHdr_cst_nm_NE(info);
		else if (ne == Hdr_cst_sundry_flg) doHdr_cst_sundry_flg_NE(info);
		else if (ne == Hdr_cst_iv_flg) doHdr_cst_iv_flg_NE(info);
		else if (ne == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_NE(info);
		else if (ne == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_NE(info);
		else if (ne == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NE(info);
		else if (ne == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_qtn_term_cd) doHdr_qtn_term_cd_NE(info);
		else if (ne == Hdr_qtn_term_nm) doHdr_qtn_term_nm_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NE(info);
		else if (ne == Hdr_xrate_cd) doHdr_xrate_cd_NE(info);
		else if (ne == Hdr_cst_qtn_rqst_no) doHdr_cst_qtn_rqst_no_NE(info);
		else if (ne == Hdr_prof_rate) doHdr_prof_rate_NE(info);
		else if (ne == Hdr_trnspt_cd) doHdr_trnspt_cd_NE(info);
		else if (ne == Hdr_trnspt_nm) doHdr_trnspt_nm_NE(info);
		else if (ne == Hdr_rcpt_dt) doHdr_rcpt_dt_NE(info);
		else if (ne == Hdr_rcpt_usr_cd) doHdr_rcpt_usr_cd_NE(info);
		else if (ne == Hdr_rcpt_usr_nm) doHdr_rcpt_usr_nm_NE(info);
		else if (ne == Hdr_tterm_cd1) doHdr_tterm_cd1_NE(info);
		else if (ne == Hdr_tterm_nm1) doHdr_tterm_nm1_NE(info);
		else if (ne == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NE(info);
		else if (ne == Hdr_tterm_cd2) doHdr_tterm_cd2_NE(info);
		else if (ne == Hdr_tterm_nm2) doHdr_tterm_nm2_NE(info);
		else if (ne == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NE(info);
		else if (ne == Hdr_tterm_cd3) doHdr_tterm_cd3_NE(info);
		else if (ne == Hdr_tterm_nm3) doHdr_tterm_nm3_NE(info);
		else if (ne == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NE(info);
		else if (ne == Hdr_qtn_rmrks) doHdr_qtn_rmrks_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_qtn_rslt_rsn_cd) doHdr_qtn_rslt_rsn_cd_NE(info);
		else if (ne == Hdr_qtn_rslt_rsn_nm) doHdr_qtn_rslt_rsn_nm_NE(info);
		else if (ne == Hdr_qtn_rslt_rsn_rmrks) doHdr_qtn_rslt_rsn_rmrks_NE(info);
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
		else if (ne == columnDtl_qtn_d_no) doDtl_qtn_d_no_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_sno1_num_typ) doDtl_sno1_num_typ_NE(info);
		else if (ne == columnDtl_sno2_num_typ) doDtl_sno2_num_typ_NE(info);
		else if (ne == columnDtl_sno3_num_typ) doDtl_sno3_num_typ_NE(info);
		else if (ne == columnDtl_sno4_num_typ) doDtl_sno4_num_typ_NE(info);
		else if (ne == columnDtl_slo_sno1_flg) doDtl_slo_sno1_flg_NE(info);
		else if (ne == columnDtl_slo_sno2_flg) doDtl_slo_sno2_flg_NE(info);
		else if (ne == columnDtl_slo_sno3_flg) doDtl_slo_sno3_flg_NE(info);
		else if (ne == columnDtl_slo_sno4_flg) doDtl_slo_sno4_flg_NE(info);
		else if (ne == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_NE(info);
		else if (ne == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NE(info);
		else if (ne == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NE(info);
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
		else if (ne == columnDtl_upri_rate) doDtl_upri_rate_NE(info);
		else if (ne == columnDtl_prof_rate) doDtl_prof_rate_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_sno_auto_flg) doDtl_sno_auto_flg_NE(info);
		else if (ne == columnDtl_set_itm_grp_no) doDtl_set_itm_grp_no_NE(info);
		else if (ne == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NE(info);
		else if (ne == columnDtl_dest_cd1) doDtl_dest_cd1_NE(info);
		else if (ne == columnDtl_dest_nm1) doDtl_dest_nm1_NE(info);
		else if (ne == columnDtl_dest_cd2) doDtl_dest_cd2_NE(info);
		else if (ne == columnDtl_dest_nm2) doDtl_dest_nm2_NE(info);
		else if (ne == columnDtl_dest_cd3) doDtl_dest_cd3_NE(info);
		else if (ne == columnDtl_dest_nm3) doDtl_dest_nm3_NE(info);
		else if (ne == columnDtl_qtn_d_rmrks) doDtl_qtn_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_itm_comp_rev_no) doDtl_itm_comp_rev_no_NE(info);
		else if (ne == columnDtl_no_itm_cd_flg) doDtl_no_itm_cd_flg_NE(info);
		else if (ne == columnDtl_comp_rel_flg) doDtl_comp_rel_flg_NE(info);
		else if (ne == columnDtl_spec_flg) doDtl_spec_flg_NE(info);
		else if (ne == columnDtl_spec_sub_char1) doDtl_spec_sub_char1_NE(info);
		else if (ne == columnDtl_spec_sub_char2) doDtl_spec_sub_char2_NE(info);
		else if (ne == columnDtl_spec_sub_char3) doDtl_spec_sub_char3_NE(info);
		else if (ne == columnDtl_spec_sub_char4) doDtl_spec_sub_char4_NE(info);
		else if (ne == columnDtl_qtn_d_rslt_rsn_cd) doDtl_qtn_d_rslt_rsn_cd_NE(info);
		else if (ne == columnDtl_qtn_d_rslt_rsn_nm) doDtl_qtn_d_rslt_rsn_nm_NE(info);
		else if (ne == columnDtl_qtn_d_rslt_rsn_rmrks) doDtl_qtn_d_rslt_rsn_rmrks_NE(info);
		else if (ne == columnDtl_cst_qtn_rqst_d_no) doDtl_cst_qtn_rqst_d_no_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
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
	 * [Cnd]パネルの[qtn_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rev_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[rev_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rev_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rev_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[valid_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_valid_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_prnt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_prnt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[failure_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_failure_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_back_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_back_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[def_cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[cst_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_sundry_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_term_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_qtn_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_qtn_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_usr_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_rmrks_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sno_auto_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_auto_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_rev_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_rev_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[no_itm_cd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_no_itm_cd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_rel_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_rel_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_qtn_rqst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_qtn_rqst_d_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
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
		else if (nx == Cnd_qtn_no) doCnd_qtn_no_NX(info);
		else if (nx == Cnd_qtn_rev) doCnd_qtn_rev_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_rev_upd_flg) doHdr_rev_upd_flg_NX(info);
		else if (nx == Hdr_qtn_no) doHdr_qtn_no_NX(info);
		else if (nx == Hdr_qtn_rev) doHdr_qtn_rev_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_qtn_typ) doHdr_qtn_typ_NX(info);
		else if (nx == Hdr_qtn_typ_nm) doHdr_qtn_typ_nm_NX(info);
		else if (nx == Hdr_qtn_dt) doHdr_qtn_dt_NX(info);
		else if (nx == Hdr_valid_dt) doHdr_valid_dt_NX(info);
		else if (nx == Hdr_qtn_out_flg) doHdr_qtn_out_flg_NX(info);
		else if (nx == Hdr_qtn_prnt_flg) doHdr_qtn_prnt_flg_NX(info);
		else if (nx == Hdr_qtn_prnt_dt) doHdr_qtn_prnt_dt_NX(info);
		else if (nx == Hdr_failure_flg) doHdr_failure_flg_NX(info);
		else if (nx == Hdr_aprv_flg) doHdr_aprv_flg_NX(info);
		else if (nx == Hdr_aprv_back_flg) doHdr_aprv_back_flg_NX(info);
		else if (nx == Hdr_aprv_no) doHdr_aprv_no_NX(info);
		else if (nx == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_NX(info);
		else if (nx == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_NX(info);
		else if (nx == Hdr_aprv_upd_flg) doHdr_aprv_upd_flg_NX(info);
		else if (nx == Hdr_aprv_can_flg) doHdr_aprv_can_flg_NX(info);
		else if (nx == Hdr_def_cst_cd) doHdr_def_cst_cd_NX(info);
		else if (nx == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NX(info);
		else if (nx == Hdr_dest_cd1) doHdr_dest_cd1_NX(info);
		else if (nx == Hdr_dest_nm1) doHdr_dest_nm1_NX(info);
		else if (nx == Hdr_dest_cd2) doHdr_dest_cd2_NX(info);
		else if (nx == Hdr_dest_nm2) doHdr_dest_nm2_NX(info);
		else if (nx == Hdr_dest_cd3) doHdr_dest_cd3_NX(info);
		else if (nx == Hdr_dest_nm3) doHdr_dest_nm3_NX(info);
		else if (nx == Hdr_cst_cd) doHdr_cst_cd_NX(info);
		else if (nx == Hdr_cst_nm) doHdr_cst_nm_NX(info);
		else if (nx == Hdr_cst_sundry_flg) doHdr_cst_sundry_flg_NX(info);
		else if (nx == Hdr_cst_iv_flg) doHdr_cst_iv_flg_NX(info);
		else if (nx == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_NX(info);
		else if (nx == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_NX(info);
		else if (nx == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NX(info);
		else if (nx == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_qtn_term_cd) doHdr_qtn_term_cd_NX(info);
		else if (nx == Hdr_qtn_term_nm) doHdr_qtn_term_nm_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NX(info);
		else if (nx == Hdr_xrate_cd) doHdr_xrate_cd_NX(info);
		else if (nx == Hdr_cst_qtn_rqst_no) doHdr_cst_qtn_rqst_no_NX(info);
		else if (nx == Hdr_prof_rate) doHdr_prof_rate_NX(info);
		else if (nx == Hdr_trnspt_cd) doHdr_trnspt_cd_NX(info);
		else if (nx == Hdr_trnspt_nm) doHdr_trnspt_nm_NX(info);
		else if (nx == Hdr_rcpt_dt) doHdr_rcpt_dt_NX(info);
		else if (nx == Hdr_rcpt_usr_cd) doHdr_rcpt_usr_cd_NX(info);
		else if (nx == Hdr_rcpt_usr_nm) doHdr_rcpt_usr_nm_NX(info);
		else if (nx == Hdr_tterm_cd1) doHdr_tterm_cd1_NX(info);
		else if (nx == Hdr_tterm_nm1) doHdr_tterm_nm1_NX(info);
		else if (nx == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NX(info);
		else if (nx == Hdr_tterm_cd2) doHdr_tterm_cd2_NX(info);
		else if (nx == Hdr_tterm_nm2) doHdr_tterm_nm2_NX(info);
		else if (nx == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NX(info);
		else if (nx == Hdr_tterm_cd3) doHdr_tterm_cd3_NX(info);
		else if (nx == Hdr_tterm_nm3) doHdr_tterm_nm3_NX(info);
		else if (nx == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NX(info);
		else if (nx == Hdr_qtn_rmrks) doHdr_qtn_rmrks_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_qtn_rslt_rsn_cd) doHdr_qtn_rslt_rsn_cd_NX(info);
		else if (nx == Hdr_qtn_rslt_rsn_nm) doHdr_qtn_rslt_rsn_nm_NX(info);
		else if (nx == Hdr_qtn_rslt_rsn_rmrks) doHdr_qtn_rslt_rsn_rmrks_NX(info);
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
		else if (nx == columnDtl_qtn_d_no) doDtl_qtn_d_no_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_sno1_num_typ) doDtl_sno1_num_typ_NX(info);
		else if (nx == columnDtl_sno2_num_typ) doDtl_sno2_num_typ_NX(info);
		else if (nx == columnDtl_sno3_num_typ) doDtl_sno3_num_typ_NX(info);
		else if (nx == columnDtl_sno4_num_typ) doDtl_sno4_num_typ_NX(info);
		else if (nx == columnDtl_slo_sno1_flg) doDtl_slo_sno1_flg_NX(info);
		else if (nx == columnDtl_slo_sno2_flg) doDtl_slo_sno2_flg_NX(info);
		else if (nx == columnDtl_slo_sno3_flg) doDtl_slo_sno3_flg_NX(info);
		else if (nx == columnDtl_slo_sno4_flg) doDtl_slo_sno4_flg_NX(info);
		else if (nx == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_NX(info);
		else if (nx == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NX(info);
		else if (nx == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NX(info);
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
		else if (nx == columnDtl_upri_rate) doDtl_upri_rate_NX(info);
		else if (nx == columnDtl_prof_rate) doDtl_prof_rate_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_sno_auto_flg) doDtl_sno_auto_flg_NX(info);
		else if (nx == columnDtl_set_itm_grp_no) doDtl_set_itm_grp_no_NX(info);
		else if (nx == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NX(info);
		else if (nx == columnDtl_dest_cd1) doDtl_dest_cd1_NX(info);
		else if (nx == columnDtl_dest_nm1) doDtl_dest_nm1_NX(info);
		else if (nx == columnDtl_dest_cd2) doDtl_dest_cd2_NX(info);
		else if (nx == columnDtl_dest_nm2) doDtl_dest_nm2_NX(info);
		else if (nx == columnDtl_dest_cd3) doDtl_dest_cd3_NX(info);
		else if (nx == columnDtl_dest_nm3) doDtl_dest_nm3_NX(info);
		else if (nx == columnDtl_qtn_d_rmrks) doDtl_qtn_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_itm_comp_rev_no) doDtl_itm_comp_rev_no_NX(info);
		else if (nx == columnDtl_no_itm_cd_flg) doDtl_no_itm_cd_flg_NX(info);
		else if (nx == columnDtl_comp_rel_flg) doDtl_comp_rel_flg_NX(info);
		else if (nx == columnDtl_spec_flg) doDtl_spec_flg_NX(info);
		else if (nx == columnDtl_spec_sub_char1) doDtl_spec_sub_char1_NX(info);
		else if (nx == columnDtl_spec_sub_char2) doDtl_spec_sub_char2_NX(info);
		else if (nx == columnDtl_spec_sub_char3) doDtl_spec_sub_char3_NX(info);
		else if (nx == columnDtl_spec_sub_char4) doDtl_spec_sub_char4_NX(info);
		else if (nx == columnDtl_qtn_d_rslt_rsn_cd) doDtl_qtn_d_rslt_rsn_cd_NX(info);
		else if (nx == columnDtl_qtn_d_rslt_rsn_nm) doDtl_qtn_d_rslt_rsn_nm_NX(info);
		else if (nx == columnDtl_qtn_d_rslt_rsn_rmrks) doDtl_qtn_d_rslt_rsn_rmrks_NX(info);
		else if (nx == columnDtl_cst_qtn_rqst_d_no) doDtl_cst_qtn_rqst_d_no_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
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
	 * [Cnd]パネルの[qtn_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rev_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[rev_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rev_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rev_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[valid_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_valid_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_prnt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_prnt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[failure_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_failure_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_back_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_back_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[def_cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[cst_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_sundry_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_term_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_qtn_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_qtn_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_usr_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_rmrks_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sno_auto_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_auto_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_rev_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_rev_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[no_itm_cd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_no_itm_cd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_rel_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_rel_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_qtn_rqst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_qtn_rqst_d_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_qtn_no) doCnd_qtn_no_LC(info);
		else if (lc == Cnd_qtn_rev) doCnd_qtn_rev_LC(info);
		else if (lc == Hdr_trd_cd) doHdr_trd_cd_LC(info);
		else if (lc == Hdr_trd_nm) doHdr_trd_nm_LC(info);
		else if (lc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_LC(info);
		else if (lc == Hdr_qtn_no) doHdr_qtn_no_LC(info);
		else if (lc == Hdr_qtn_rev) doHdr_qtn_rev_LC(info);
		else if (lc == Hdr_qtn_typ) doHdr_qtn_typ_LC(info);
		else if (lc == Hdr_qtn_typ_nm) doHdr_qtn_typ_nm_LC(info);
		else if (lc == Hdr_qtn_dt) doHdr_qtn_dt_LC(info);
		else if (lc == Hdr_valid_dt) doHdr_valid_dt_LC(info);
		else if (lc == Hdr_qtn_prnt_dt) doHdr_qtn_prnt_dt_LC(info);
		else if (lc == Hdr_aprv_no) doHdr_aprv_no_LC(info);
		else if (lc == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_LC(info);
		else if (lc == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_LC(info);
		else if (lc == Hdr_def_cst_cd) doHdr_def_cst_cd_LC(info);
		else if (lc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_LC(info);
		else if (lc == Hdr_dest_cd1) doHdr_dest_cd1_LC(info);
		else if (lc == Hdr_dest_nm1) doHdr_dest_nm1_LC(info);
		else if (lc == Hdr_dest_cd2) doHdr_dest_cd2_LC(info);
		else if (lc == Hdr_dest_nm2) doHdr_dest_nm2_LC(info);
		else if (lc == Hdr_dest_cd3) doHdr_dest_cd3_LC(info);
		else if (lc == Hdr_dest_nm3) doHdr_dest_nm3_LC(info);
		else if (lc == Hdr_cst_cd) doHdr_cst_cd_LC(info);
		else if (lc == Hdr_cst_nm) doHdr_cst_nm_LC(info);
		else if (lc == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_LC(info);
		else if (lc == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_LC(info);
		else if (lc == Hdr_cst_usr_cd) doHdr_cst_usr_cd_LC(info);
		else if (lc == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_qtn_term_cd) doHdr_qtn_term_cd_LC(info);
		else if (lc == Hdr_qtn_term_nm) doHdr_qtn_term_nm_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_xrate_cd) doHdr_xrate_cd_LC(info);
		else if (lc == Hdr_cst_qtn_rqst_no) doHdr_cst_qtn_rqst_no_LC(info);
		else if (lc == Hdr_prof_rate) doHdr_prof_rate_LC(info);
		else if (lc == Hdr_trnspt_cd) doHdr_trnspt_cd_LC(info);
		else if (lc == Hdr_trnspt_nm) doHdr_trnspt_nm_LC(info);
		else if (lc == Hdr_rcpt_dt) doHdr_rcpt_dt_LC(info);
		else if (lc == Hdr_rcpt_usr_cd) doHdr_rcpt_usr_cd_LC(info);
		else if (lc == Hdr_rcpt_usr_nm) doHdr_rcpt_usr_nm_LC(info);
		else if (lc == Hdr_tterm_cd1) doHdr_tterm_cd1_LC(info);
		else if (lc == Hdr_tterm_nm1) doHdr_tterm_nm1_LC(info);
		else if (lc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_LC(info);
		else if (lc == Hdr_tterm_cd2) doHdr_tterm_cd2_LC(info);
		else if (lc == Hdr_tterm_nm2) doHdr_tterm_nm2_LC(info);
		else if (lc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_LC(info);
		else if (lc == Hdr_tterm_cd3) doHdr_tterm_cd3_LC(info);
		else if (lc == Hdr_tterm_nm3) doHdr_tterm_nm3_LC(info);
		else if (lc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_LC(info);
		else if (lc == Hdr_qtn_rmrks) doHdr_qtn_rmrks_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_qtn_rslt_rsn_cd) doHdr_qtn_rslt_rsn_cd_LC(info);
		else if (lc == Hdr_qtn_rslt_rsn_nm) doHdr_qtn_rslt_rsn_nm_LC(info);
		else if (lc == Hdr_qtn_rslt_rsn_rmrks) doHdr_qtn_rslt_rsn_rmrks_LC(info);
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
		else if (lc == columnDtl_qtn_d_no) doDtl_qtn_d_no_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_sno1_num_typ) doDtl_sno1_num_typ_LC(info);
		else if (lc == columnDtl_sno2_num_typ) doDtl_sno2_num_typ_LC(info);
		else if (lc == columnDtl_sno3_num_typ) doDtl_sno3_num_typ_LC(info);
		else if (lc == columnDtl_sno4_num_typ) doDtl_sno4_num_typ_LC(info);
		else if (lc == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_LC(info);
		else if (lc == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_LC(info);
		else if (lc == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_LC(info);
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
		else if (lc == columnDtl_upri_rate) doDtl_upri_rate_LC(info);
		else if (lc == columnDtl_prof_rate) doDtl_prof_rate_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_set_itm_grp_no) doDtl_set_itm_grp_no_LC(info);
		else if (lc == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_LC(info);
		else if (lc == columnDtl_dest_cd1) doDtl_dest_cd1_LC(info);
		else if (lc == columnDtl_dest_nm1) doDtl_dest_nm1_LC(info);
		else if (lc == columnDtl_dest_cd2) doDtl_dest_cd2_LC(info);
		else if (lc == columnDtl_dest_nm2) doDtl_dest_nm2_LC(info);
		else if (lc == columnDtl_dest_cd3) doDtl_dest_cd3_LC(info);
		else if (lc == columnDtl_dest_nm3) doDtl_dest_nm3_LC(info);
		else if (lc == columnDtl_qtn_d_rmrks) doDtl_qtn_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_itm_comp_rev_no) doDtl_itm_comp_rev_no_LC(info);
		else if (lc == columnDtl_spec_sub_char1) doDtl_spec_sub_char1_LC(info);
		else if (lc == columnDtl_spec_sub_char2) doDtl_spec_sub_char2_LC(info);
		else if (lc == columnDtl_spec_sub_char3) doDtl_spec_sub_char3_LC(info);
		else if (lc == columnDtl_spec_sub_char4) doDtl_spec_sub_char4_LC(info);
		else if (lc == columnDtl_qtn_d_rslt_rsn_cd) doDtl_qtn_d_rslt_rsn_cd_LC(info);
		else if (lc == columnDtl_qtn_d_rslt_rsn_nm) doDtl_qtn_d_rslt_rsn_nm_LC(info);
		else if (lc == columnDtl_qtn_d_rslt_rsn_rmrks) doDtl_qtn_d_rslt_rsn_rmrks_LC(info);
		else if (lc == columnDtl_cst_qtn_rqst_d_no) doDtl_cst_qtn_rqst_d_no_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
	}

	/**
	 * [Cnd]パネルの[qtn_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[qtn_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_qtn_rev_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[valid_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_valid_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_prnt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_prnt_dt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[def_cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_term_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[cst_qtn_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_qtn_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_usr_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[qtn_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[qtn_rslt_rsn_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_qtn_rslt_rsn_rmrks_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[set_itm_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[qtn_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_rev_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_rev_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spec_sub_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spec_sub_char4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qtn_d_rslt_rsn_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qtn_d_rslt_rsn_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_qtn_rqst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_qtn_rqst_d_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_qtn_typ]の作成メソッド
	 */
	public MCList getHdr_qtn_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getQtnTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dlv_p_PPanel_Dlv_bp_cd]の作成メソッド
	 */
	public MCList getHdr_dlv_p_PPanel_Dlv_bp_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Hdr_cst_cd]の作成メソッド
	 */
	public MCList getHdr_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_qtn_term_cd]の作成メソッド
	 */
	public MCList getHdr_qtn_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getQtnTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cur_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trnspt_cd]の作成メソッド
	 */
	public MCList getHdr_trnspt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrnspt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rcpt_usr_cd]の作成メソッド
	 */
	public MCList getHdr_rcpt_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
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
	 * コンボ／リストのリスト[Hdr_qtn_rslt_rsn_cd]の作成メソッド
	 */
	public MCList getHdr_qtn_rslt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getQtnRsltRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cst_itm_cd]の作成メソッド
	 */
	public MCList getDtl_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
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
	 * コンボ／リストのリスト[columnDtl_cntry_org_cd]の作成メソッド
	 */
	public MCList getDtl_cntry_org_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_std_sls_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_gd_cd]の作成メソッド
	 */
	public MCList getDtl_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getCstSloStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_dlv_p_PPanel_columnDlv_bp_cd]の作成メソッド
	 */
	public MCList getDtl_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
	 * コンボ／リストのリスト[columnDtl_qtn_d_rslt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_qtn_d_rslt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getQtnRsltRsn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1110.Srch01")) {
			return new MS_MSBBL1110_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1110.Ins01")) {
			return new MS_MSBBL1110_Ins01Bridge();
		}
		if (id.equals("MS.MSBBL1110.Upd01")) {
			return new MS_MSBBL1110_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL1110.Del01")) {
			return new MS_MSBBL1110_Del01Bridge();
		}
		if (id.equals("MS.MSBBL1110.Sprt01")) {
			return new MS_MSBBL1110_Sprt01Bridge();
		}
		if (id.equals("MS.MSBBL1110.Prnt01")) {
			return new MS_MSBBL1110_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1110_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1110_Srch01Bridge() {
			p_MS_MSBBL1110_Srch01 = new MCParam(PDef.MS_MSBBL1110_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1110_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1110.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.DtlR.class));

			p_MS_MSBBL1110_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1110_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1110_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1110_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1110_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1110.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1110.CndR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP1110.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1110.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1110.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1110.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1110_Srch01.addDownBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			p_MS_MSBBL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1110_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1110.HdrR)p_MS_MSBBL1110_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1110.DtlR>)p_MS_MSBBL1110_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBBL1110_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1110_Ins01;

		/** コンストラクタ */
		protected MS_MSBBL1110_Ins01Bridge() {
			p_MS_MSBBL1110_Ins01 = new MCParam(PDef.MS_MSBBL1110_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1110_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.DtlR.class));

			p_MS_MSBBL1110_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1110_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1110_Ins01.addUpBlock(getHdrR());
			p_MS_MSBBL1110_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1110_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1110_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1110.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1110.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1110.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP1110.DtlR>)up(1);
		}

		protected mcframe.clientMSBB.MSBBP1110.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1110.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1110.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1110.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1110_Ins01.addDownBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			p_MS_MSBBL1110_Ins01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1110_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1110.HdrR)p_MS_MSBBL1110_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1110.DtlR>)p_MS_MSBBL1110_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
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
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1110_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1110_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL1110_Upd01Bridge() {
			p_MS_MSBBL1110_Upd01 = new MCParam(PDef.MS_MSBBL1110_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1110_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.DtlR.class));

			p_MS_MSBBL1110_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1110_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1110_Upd01.addUpBlock(getHdrR());
			p_MS_MSBBL1110_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1110_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1110_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1110.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1110.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1110.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP1110.DtlR>)up(1);
		}

		protected mcframe.clientMSBB.MSBBP1110.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1110.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1110.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1110.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1110_Upd01.addDownBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			p_MS_MSBBL1110_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1110_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1110.HdrR)p_MS_MSBBL1110_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1110.DtlR>)p_MS_MSBBL1110_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
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
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1110_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1110_Del01;

		/** コンストラクタ */
		protected MS_MSBBL1110_Del01Bridge() {
			p_MS_MSBBL1110_Del01 = new MCParam(PDef.MS_MSBBL1110_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1110_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			// Down

			p_MS_MSBBL1110_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1110_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1110_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1110_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1110_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1110.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1110.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBBL1110_Del01;
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
	 * [MS_MSBBL1110_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1110_Sprt01;

		/** コンストラクタ */
		protected MS_MSBBL1110_Sprt01Bridge() {
			p_MS_MSBBL1110_Sprt01 = new MCParam(PDef.MS_MSBBL1110_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1110_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.UpriSrchR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.UpriSrchR.class));

			p_MS_MSBBL1110_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1110_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1110_Sprt01.addUpBlock(getUpriSrchL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1110_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1110_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1110.UpriSrchR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1110.UpriSrchR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1110.UpriSrchR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1110.UpriSrchR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1110_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1110.UpriSrchR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1110_Sprt01;
		}

		protected void show() {
			setUpriSrchL((MCList<mcframe.clientMSBB.MSBBP1110.UpriSrchR>)p_MS_MSBBL1110_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getUpriSrchL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getUpriSrchL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getUpriSrchL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1110_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1110_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1110_Prnt01;

		/** コンストラクタ */
		protected MS_MSBBL1110_Prnt01Bridge() {
			p_MS_MSBBL1110_Prnt01 = new MCParam(PDef.MS_MSBBL1110_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1110_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1110.HdrR.create());
			// Down

			p_MS_MSBBL1110_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1110_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1110_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1110_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1110_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1110.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1110.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBBL1110_Prnt01;
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