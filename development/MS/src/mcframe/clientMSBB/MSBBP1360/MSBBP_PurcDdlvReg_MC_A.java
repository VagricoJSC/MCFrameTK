package mcframe.clientMSBB.MSBBP1360;

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
import mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Srch01Caller;
import mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Srch02Caller;
import mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Srch03Caller;
import mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Ins01Caller;
import mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Upd01Caller;
import mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Del01Caller;
import mcframe.clientMSBB.MSBBP1360.MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Prnt01Caller;

/**
 * 画面"MSBBP_PurcDdlvReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_PurcDdlvReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1360";

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
	public MCTextComboBox Cnd_srch_tgt_typ_nm = null;
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
	public MCLabel Cnd_purc_schd_dt_Label = null;
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDateField Cnd_purc_schd_dt = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_slip = null;
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
	public MCTextField Hdr_trd_cd = null;
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
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Hdr_latest_flg = null;
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public MCCheckBox Hdr_edi_flg = null;
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCNumberField Hdr_sls_act_seq = null;
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
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_dlv_tm_p_PPanel;
	public MCDateField Hdr_dlv_dt;	// [Hdr]の[dlv_tm_p.ymd]を[Hdr_dlv_dt]としてエイリアス定義。
	public MCDateField Hdr_dlv_hm;	// [Hdr]の[dlv_tm_p.hm]を[Hdr_dlv_hm]としてエイリアス定義。
	public MCLabel Hdr_bill_basis_dt_Label = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDateField Hdr_bill_basis_dt = null;
	public mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H Hdr_dlv_p_PPanel;
	public MCTextField Hdr_dlv_cd;	// [Hdr]の[dlv_p.bp_cd]を[Hdr_dlv_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_nm;	// [Hdr]の[dlv_p.bp_nm]を[Hdr_dlv_nm]としてエイリアス定義。
	public MCCheckBox Hdr_dlv_sundry_flg;	// [Hdr]の[dlv_p.dlv_sundry_flg]を[Hdr_dlv_sundry_flg]としてエイリアス定義。
	public MCCheckBox Hdr_pri_prnt_flg;	// [Hdr]の[dlv_p.pri_prnt_flg]を[Hdr_pri_prnt_flg]としてエイリアス定義。
	public MCTextComboBox Hdr_dlv_lg_grp_cd;	// [Hdr]の[dlv_p.lg_grp_cd]を[Hdr_dlv_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_lg_grp_nm;	// [Hdr]の[dlv_p.lg_grp_nm]を[Hdr_dlv_lg_grp_nm]としてエイリアス定義。
	public MCTextField Hdr_cntry_cd;	// [Hdr]の[dlv_p.cntry_cd]を[Hdr_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr_cntry_nm;	// [Hdr]の[dlv_p.cntry_nm]を[Hdr_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr_dlv_zip_cd;	// [Hdr]の[dlv_p.zip_cd]を[Hdr_dlv_zip_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr1;	// [Hdr]の[dlv_p.addr1]を[Hdr_dlv_addr1]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr2;	// [Hdr]の[dlv_p.addr2]を[Hdr_dlv_addr2]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr3;	// [Hdr]の[dlv_p.addr3]を[Hdr_dlv_addr3]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr4;	// [Hdr]の[dlv_p.addr4]を[Hdr_dlv_addr4]としてエイリアス定義。
	public MCTextField Hdr_dlv_tel;	// [Hdr]の[dlv_p.tel]を[Hdr_dlv_tel]としてエイリアス定義。
	public MCTextField Hdr_dlv_fax;	// [Hdr]の[dlv_p.fax]を[Hdr_dlv_fax]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntct_dpt;	// [Hdr]の[dlv_p.dlv_cntct_dpt]を[Hdr_dlv_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntct_psn;	// [Hdr]の[dlv_p.dlv_cntct_psn]を[Hdr_dlv_cntct_psn]としてエイリアス定義。
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
	public MCTextField Hdr_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Hdr_cst_nm = null;
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
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_slip_out_flg = null;
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_slip_prntd_flg = null;
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
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_cred_bal_amt_p_PPanel;
	public MCNumberField Hdr_cred_bal;	// [Hdr]の[cred_bal_amt_p.amt]を[Hdr_cred_bal]としてエイリアス定義。
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
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public MCCheckBox Hdr_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_xrate_p_PPanel;
	public MCNumberField Hdr_xrate;	// [Hdr]の[xrate_p.xrate]を[Hdr_xrate]としてエイリアス定義。
	public MCLabel Hdr_xrate_cd_Label = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_xrate_cd = null;
	public MCLabel Hdr_purc_xrate_cd_Label = null;
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_purc_xrate_cd = null;
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
	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public MCCheckBox Hdr_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_ptax_xrate_p_PPanel;
	public MCNumberField Hdr_ptax_xrate;	// [Hdr]の[ptax_xrate_p.xrate]を[Hdr_ptax_xrate]としてエイリアス定義。
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
	public MCLabel Hdr_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_slo_no = null;
	public MCLabel Hdr_cst_po_no_Label = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_cst_po_no = null;
	public MCLabel Hdr_prof_rate_Label = null;
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumberField Hdr_prof_rate = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_amt_p_PPanel;
	public MCNumberField Hdr_ttl_amt;	// [Hdr]の[ttl_amt_p.amt]を[Hdr_ttl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ttl_amt_not_cost_p_PPanel;
	public MCNumberField Hdr_ttl_amt_no_cost;	// [Hdr]の[ttl_amt_not_cost_p.amt]を[Hdr_ttl_amt_no_cost]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_amt_p_PPanel;
	public MCNumberField Hdr_trd_cur_amt;	// [Hdr]の[trd_cur_amt_p.amt]を[Hdr_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_inc_tax_amt_p_PPanel;
	public MCNumberField Hdr_trd_cur_inc_tax_amt;	// [Hdr]の[trd_cur_inc_tax_amt_p.amt]を[Hdr_trd_cur_inc_tax_amt]としてエイリアス定義。
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
	public MCTextField Hdr_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCTextField Hdr_ar_dpt_nm = null;
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
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_trd_cur_amt_dec_place = null;
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_trd_cur_upri_dec_place = null;
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
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_ptax_cur_amt_dec_place = null;
	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_ptax_cur_upri_dec_place = null;
	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_xrate_rnd_typ = null;
	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_wtax_rnd_typ = null;
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
	// [List]ブロック関連のField定義
	public MCPanel ListPanel = null;
	// [List]ブロックの項目のField定義
	// [DtlInfo]ブロック関連のField定義
	public MCPanel DtlInfoPanel = null;
	// [DtlInfo]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1360.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sync_flg = null;
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl_abort_flg = null;
	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_schd_dt = null;
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
	public mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D Dtl_dlv_p_PPanel;
	public MCColumnConfig columnDtl_dlv_cd;// [Dtl]の[dlv_p.bp_cd]を[columnDtl_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_nm;// [Dtl]の[dlv_p.bp_nm]を[columnDtl_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_sundry_flg;// [Dtl]の[dlv_p.dlv_sundry_flg]を[columnDtl_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_zip_cd;// [Dtl]の[dlv_p.zip_cd]を[columnDtl_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr1;// [Dtl]の[dlv_p.addr1]を[columnDtl_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr2;// [Dtl]の[dlv_p.addr2]を[columnDtl_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr3;// [Dtl]の[dlv_p.addr3]を[columnDtl_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr4;// [Dtl]の[dlv_p.addr4]を[columnDtl_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_dpt;// [Dtl]の[dlv_p.dlv_cntct_dpt]を[columnDtl_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_psn;// [Dtl]の[dlv_p.dlv_cntct_psn]を[columnDtl_dlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_tel;// [Dtl]の[dlv_p.tel]を[columnDtl_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_fax;// [Dtl]の[dlv_p.fax]を[columnDtl_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnDtl_cntry_cd;// [Dtl]の[dlv_p.cntry_cd]を[columnDtl_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cntry_nm;// [Dtl]の[dlv_p.cntry_nm]を[columnDtl_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_pri_prnt_flg;// [Dtl]の[dlv_p.pri_prnt_flg]を[columnDtl_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_lg_grp_cd;// [Dtl]の[dlv_p.lg_grp_cd]を[columnDtl_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_lg_grp_nm;// [Dtl]の[dlv_p.lg_grp_nm]を[columnDtl_lg_grp_nm]としてエイリアス定義。
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm3 = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_sls_schd_qty_p_PPanel;
	public MCColumnConfig columnDtl_sls_schd_qty;// [Dtl]の[sls_schd_qty_p.qty]を[columnDtl_sls_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_sls_qty_p_PPanel;
	public MCColumnConfig columnDtl_sls_qty;// [Dtl]の[sls_qty_p.qty]を[columnDtl_sls_qty]としてエイリアス定義。
	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_dtl_upd_flg = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl_trd_upri_amt_p_PPanel;
	public MCColumnConfig columnDtl_upri_not_tgt_flg;// [Dtl]の[trd_upri_amt_p.upri_not_tgt_flg]を[columnDtl_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_upri;// [Dtl]の[trd_upri_amt_p.trd_cur_upri]を[columnDtl_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl_interim_flg;// [Dtl]の[trd_upri_amt_p.interim_flg]を[columnDtl_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_amt;// [Dtl]の[trd_upri_amt_p.trd_cur_amt]を[columnDtl_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_inc_tax_amt;// [Dtl]の[trd_upri_amt_p.trd_cur_inc_tax_amt]を[columnDtl_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_fix_flg;// [Dtl]の[trd_upri_amt_p.tax_fix_flg]を[columnDtl_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_cd;// [Dtl]の[trd_upri_amt_p.tax_cd]を[columnDtl_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_nm;// [Dtl]の[trd_upri_amt_p.tax_nm]を[columnDtl_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_rate;// [Dtl]の[trd_upri_amt_p.tax_rate]を[columnDtl_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_typ;// [Dtl]の[trd_upri_amt_p.tax_typ]を[columnDtl_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_inc_tax_flg;// [Dtl]の[trd_upri_amt_p.inc_tax_flg]を[columnDtl_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_tax_amt;// [Dtl]の[trd_upri_amt_p.trd_cur_tax_amt]を[columnDtl_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_dscnt_amt;// [Dtl]の[trd_upri_amt_p.trd_cur_dscnt_amt]を[columnDtl_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_cd;// [Dtl]の[trd_upri_amt_p.dscnt_rsn_cd]を[columnDtl_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_nm;// [Dtl]の[trd_upri_amt_p.dscnt_rsn_nm]を[columnDtl_dscnt_rsn_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_cost_upri_p_PPanel;
	public MCColumnConfig columnDtl_cost_upri;// [Dtl]の[cost_upri_p.upri]を[columnDtl_cost_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_cost_amt_p_PPanel;
	public MCColumnConfig columnDtl_cost_amt;// [Dtl]の[cost_amt_p.amt]を[columnDtl_cost_amt]としてエイリアス定義。
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prof_rate = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_upri;// [Dtl]の[base_cur_upri_p.upri]を[columnDtl_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_amt;// [Dtl]の[base_cur_amt_p.amt]を[columnDtl_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_inc_tax_amt;// [Dtl]の[base_cur_inc_tax_amt_p.amt]を[columnDtl_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_tax_amt;// [Dtl]の[base_cur_tax_amt_p.amt]を[columnDtl_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_dscnt_amt;// [Dtl]の[base_cur_dscnt_amt_p.amt]を[columnDtl_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_upri;// [Dtl]の[ptax_cur_upri_p.upri]を[columnDtl_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_amt;// [Dtl]の[ptax_cur_amt_p.amt]を[columnDtl_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_inc_tax_amt;// [Dtl]の[ptax_cur_inc_tax_amt_p.amt]を[columnDtl_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_tax_amt;// [Dtl]の[ptax_cur_tax_amt_p.amt]を[columnDtl_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_dscnt_amt;// [Dtl]の[ptax_cur_dscnt_amt_p.amt]を[columnDtl_ptax_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_crryovr_times = null;
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
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_d_no = null;
	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_rsn_cd = null;
	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_rsn_nm = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_nm = null;
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_wtax_amt_p_PPanel;
	public MCColumnConfig columnDtl_wtax_amt;// [Dtl]の[wtax_amt_p.amt]を[columnDtl_wtax_amt]としてエイリアス定義。
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_nm = null;
	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_purc_act_d_no = null;
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
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_d_no = null;
	/**
	 * Purchase recording month 仕入計上年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ac_ym = null;
	/**
	 * Purchase recording date 仕入計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ac_dt = null;
	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dt = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_no = null;
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_d_no = null;
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
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_nm = null;
	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_iv_flg = null;
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_subcon_flg = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_nm = null;
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_dlv_slip_no = null;
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_dlv_slip_d_no = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Dtl_lot_no_p_PPanel;
	public MCColumnConfig columnDtl_crt_lot_flg;// [Dtl]の[lot_no_p.crt_lot_flg]を[columnDtl_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_lot_no;// [Dtl]の[lot_no_p.lot_no]を[columnDtl_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_sublot_no;// [Dtl]の[lot_no_p.sublot_no]を[columnDtl_sublot_no]としてエイリアス定義。
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_lot_no = null;
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_fr_valid_dt = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D Dtl_purc_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_purc_cont_qty;// [Dtl]の[purc_cont_qty_p.purc_cont_qty]を[columnDtl_purc_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D Dtl_purc_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_purc_cont_fctr;// [Dtl]の[purc_cont_fctr_p.purc_cont_fctr]を[columnDtl_purc_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_std_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_qty;// [Dtl]の[std_cont_qty_p.cont_qty]を[columnDtl_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnDtl_cont_fctr_unit_cd;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnDtl_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cont_fctr_unit_nm;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnDtl_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_fctr;// [Dtl]の[std_cont_fctr_p.std_cont_fctr]を[columnDtl_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Purchase currency cd. 仕入通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_trd_cur_cd = null;
	/**
	 * Purchase currency name 仕入通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_trd_cur_nm = null;
	/**
	 * Specify scheduled purchase rate 仕入予定レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl_purc_xrate_p_PPanel;
	public MCColumnConfig columnDtl_purc_xrate;// [Dtl]の[purc_xrate_p.xrate]を[columnDtl_purc_xrate]としてエイリアス定義。
	/**
	 * Set scheduled purchase tax rate 仕入予定納税レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl_purc_ptax_xrate_p_PPanel;
	public MCColumnConfig columnDtl_purc_ptax_xrate;// [Dtl]の[purc_ptax_xrate_p.xrate]を[columnDtl_purc_ptax_xrate]としてエイリアス定義。
	/**
	 * Purchase details correction 仕入明細訂正.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dtl_upd_flg = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl_purc_trd_upri_amt_p_PPanel;
	public MCColumnConfig columnDtl_purc_upri_not_tgt_flg;// [Dtl]の[purc_trd_upri_amt_p.upri_not_tgt_flg]を[columnDtl_purc_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_trd_cur_upri;// [Dtl]の[purc_trd_upri_amt_p.trd_cur_upri]を[columnDtl_purc_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_interim_flg;// [Dtl]の[purc_trd_upri_amt_p.interim_flg]を[columnDtl_purc_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_trd_cur_amt;// [Dtl]の[purc_trd_upri_amt_p.trd_cur_amt]を[columnDtl_purc_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_trd_cur_inc_tax_amt;// [Dtl]の[purc_trd_upri_amt_p.trd_cur_inc_tax_amt]を[columnDtl_purc_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_tax_fix_flg;// [Dtl]の[purc_trd_upri_amt_p.tax_fix_flg]を[columnDtl_purc_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_tax_cd;// [Dtl]の[purc_trd_upri_amt_p.tax_cd]を[columnDtl_purc_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_tax_nm;// [Dtl]の[purc_trd_upri_amt_p.tax_nm]を[columnDtl_purc_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_tax_rate;// [Dtl]の[purc_trd_upri_amt_p.tax_rate]を[columnDtl_purc_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_tax_typ;// [Dtl]の[purc_trd_upri_amt_p.tax_typ]を[columnDtl_purc_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_inc_tax_flg;// [Dtl]の[purc_trd_upri_amt_p.inc_tax_flg]を[columnDtl_purc_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_trd_cur_tax_amt;// [Dtl]の[purc_trd_upri_amt_p.trd_cur_tax_amt]を[columnDtl_purc_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_trd_cur_dscnt_amt;// [Dtl]の[purc_trd_upri_amt_p.trd_cur_dscnt_amt]を[columnDtl_purc_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_dscnt_rsn_cd;// [Dtl]の[purc_trd_upri_amt_p.dscnt_rsn_cd]を[columnDtl_purc_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_dscnt_rsn_nm;// [Dtl]の[purc_trd_upri_amt_p.dscnt_rsn_nm]を[columnDtl_purc_dscnt_rsn_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_purc_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_purc_base_cur_upri;// [Dtl]の[purc_base_cur_upri_p.upri]を[columnDtl_purc_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_purc_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_purc_base_cur_amt;// [Dtl]の[purc_base_cur_amt_p.amt]を[columnDtl_purc_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_purc_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_purc_base_cur_inc_tax_amt;// [Dtl]の[purc_base_cur_inc_tax_amt_p.amt]を[columnDtl_purc_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_purc_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_purc_base_cur_tax_amt;// [Dtl]の[purc_base_cur_tax_amt_p.amt]を[columnDtl_purc_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_purc_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_purc_base_cur_dscnt_amt;// [Dtl]の[purc_base_cur_dscnt_amt_p.amt]を[columnDtl_purc_base_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_dt = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_purc_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_purc_ptax_cur_upri;// [Dtl]の[purc_ptax_cur_upri_p.upri]を[columnDtl_purc_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_purc_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_purc_ptax_cur_amt;// [Dtl]の[purc_ptax_cur_amt_p.amt]を[columnDtl_purc_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_purc_ptax_cur_inc_tax_amt;// [Dtl]の[purc_ptax_cur_inc_tax_amt_p.amt]を[columnDtl_purc_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_purc_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_purc_ptax_cur_tax_amt;// [Dtl]の[purc_ptax_cur_tax_amt_p.amt]を[columnDtl_purc_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_purc_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_purc_ptax_cur_dscnt_amt;// [Dtl]の[purc_ptax_cur_dscnt_amt_p.amt]を[columnDtl_purc_ptax_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_rsn_cd = null;
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_rsn_nm = null;
	/**
	 * Purchase charged dept. cd. 仕入負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_bd_dpt_cd = null;
	/**
	 * Purchase charged dept. name 仕入負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_bd_dpt_nm = null;
	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_wtax_rate = null;
	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_wtax_amt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_purc_qty_p_PPanel;
	public MCColumnConfig columnDtl_purc_qty;// [Dtl]の[purc_qty_p.qty]を[columnDtl_purc_qty]としてエイリアス定義。
	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_purc_schd_qty = null;
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_print_rmrks = null;
	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_print_d_rmrks = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_d_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ = null;
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no_typ = null;
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_bill_crryovr_times = null;
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
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_dec_place = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
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
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_rnd_typ = null;
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_acxfr_flg = null;
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xpns_purc_flg = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_no = null;
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_seq = null;
	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_act_d_seq = null;
	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_schd_no = null;
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_schd_no = null;
	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_row_id = null;
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_pr_no = null;
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_pr_no = null;
	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_trd_unit_conv_qty = null;
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_amt_rnd_typ = null;
	/**
	 * Rounding type (Sales unit price) 売上単価端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_rnd_typ = null;
	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_tax_rnd_typ = null;
	/**
	 * Purchase transaction amount number of decimal places 仕入取引金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_trd_cur_amt_dec_place = null;
	/**
	 * Purchase transaction unit price number of decimal places 仕入取引単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_trd_cur_upri_dec_place = null;
	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_s_trd_unit_conv_base_qty = null;
	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_s_trd_unit_conv_qty = null;
	/**
	 * Purchase transaction unit cd. 仕入取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_trd_unit_cd = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_purc_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_purc_trd_unit_qty;// [Dtl]の[purc_trd_unit_qty_p.qty]を[columnDtl_purc_trd_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_purc_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_purc_base_unit_qty;// [Dtl]の[purc_base_unit_qty_p.qty]を[columnDtl_purc_base_unit_qty]としてエイリアス定義。
	/**
	 * Purchase transaction unit conversion base qty. 仕入取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_trd_unit_conv_base_qty = null;
	/**
	 * Purchase transaction unit conversion qty. 仕入取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_trd_unit_conv_qty = null;
	/**
	 * Purchase transaction unit number of decimal places 仕入取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_trd_unit_dec_place = null;
	/**
	 * Purchase date (For exchange rate component) 仕入日（為替レート部品用）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_purc_dt = null;
	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_qty_bef = null;
	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_purc_qty = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd_noschd = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H DtlBtn_menu_move_p_PPanel;
	// [IoInfo]ブロック関連のField定義
	public MCPanel IoInfoPanel = null;
	// [IoInfo]ブロックの項目のField定義
	// [Io]ブロック関連のField定義
	public MCPanel IoPanel = null;
	public MCScrollPane IoScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1360.IoR> IoTable = null;
	// [Io]ブロックの項目のField定義
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnIo_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnIo_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Io_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnIo_trd_unit_qty;// [Io]の[trd_unit_qty_p.qty]を[columnIo_trd_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnIo_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnIo_base_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Io_base_unit_qty_p_PPanel;
	public MCColumnConfig columnIo_base_unit_qty;// [Io]の[base_unit_qty_p.qty]を[columnIo_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Io_purc_qty_p_PPanel;
	public MCColumnConfig columnIo_purc_qty;// [Io]の[purc_qty_p.qty]を[columnIo_purc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Io_sls_qty_p_PPanel;
	public MCColumnConfig columnIo_sls_qty;// [Io]の[sls_qty_p.qty]を[columnIo_sls_qty]としてエイリアス定義。
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnIo_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnIo_gd_nm = null;
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnIo_bp_dlv_slip_no = null;
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnIo_bp_dlv_slip_d_no = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Io_lot_no_p_PPanel;
	public MCColumnConfig columnIo_crt_lot_flg;// [Io]の[lot_no_p.crt_lot_flg]を[columnIo_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnIo_lot_no;// [Io]の[lot_no_p.lot_no]を[columnIo_lot_no]としてエイリアス定義。
	public MCColumnConfig columnIo_sublot_no;// [Io]の[lot_no_p.sublot_no]を[columnIo_sublot_no]としてエイリアス定義。
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnIo_bp_lot_no = null;
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCColumnConfig columnIo_ship_fr_valid_dt = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Io_ver_no_p_PPanel;
	public MCColumnConfig columnIo_ver_no;// [Io]の[ver_no_p.ver_no]を[columnIo_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Io_purc_base_unit_qty_p_PPanel;
	public MCColumnConfig columnIo_purc_base_unit_qty;// [Io]の[purc_base_unit_qty_p.qty]を[columnIo_purc_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D Io_purc_cont_qty_p_PPanel;
	public MCColumnConfig columnIo_purc_cont_qty;// [Io]の[purc_cont_qty_p.purc_cont_qty]を[columnIo_purc_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D Io_purc_cont_fctr_p_PPanel;
	public MCColumnConfig columnIo_purc_cont_fctr;// [Io]の[purc_cont_fctr_p.purc_cont_fctr]を[columnIo_purc_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Io_std_cont_qty_p_PPanel;
	public MCColumnConfig columnIo_std_cont_qty;// [Io]の[std_cont_qty_p.cont_qty]を[columnIo_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Io_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnIo_cont_fctr_unit_cd;// [Io]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnIo_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnIo_cont_fctr_unit_nm;// [Io]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnIo_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Io_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnIo_std_cont_fctr;// [Io]の[std_cont_fctr_p.std_cont_fctr]を[columnIo_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Io_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnIo_sno1;// [Io]の[sno_wrk_no_p.sno1]を[columnIo_sno1]としてエイリアス定義。
	public MCColumnConfig columnIo_sno2;// [Io]の[sno_wrk_no_p.sno2]を[columnIo_sno2]としてエイリアス定義。
	public MCColumnConfig columnIo_sno3;// [Io]の[sno_wrk_no_p.sno3]を[columnIo_sno3]としてエイリアス定義。
	public MCColumnConfig columnIo_sno4;// [Io]の[sno_wrk_no_p.sno4]を[columnIo_sno4]としてエイリアス定義。
	public MCColumnConfig columnIo_wrk_no;// [Io]の[sno_wrk_no_p.wrk_no]を[columnIo_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnIo_wrk_nm;// [Io]の[sno_wrk_no_p.wrk_nm]を[columnIo_wrk_nm]としてエイリアス定義。
	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnIo_purc_act_io_no = null;
	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnIo_sls_act_io_no = null;
	/**
	 * Details spare 1 詳細予備１.<p>
	 *
	 */
	public MCColumnConfig columnIo_sub_char1 = null;
	/**
	 * Details spare 2 詳細予備２.<p>
	 *
	 */
	public MCColumnConfig columnIo_sub_char2 = null;
	/**
	 * Details spare 3 詳細予備３.<p>
	 *
	 */
	public MCColumnConfig columnIo_sub_char3 = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnIo_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnIo_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnIo_trd_unit_conv_qty = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_trd_unit_rnd_typ = null;
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnIo_itm_cd = null;
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public MCColumnConfig columnIo_itm_sub1 = null;
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public MCColumnConfig columnIo_itm_sub2 = null;
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public MCColumnConfig columnIo_itm_sub3 = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_sublot_mng_typ = null;
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_lot_no_typ = null;
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_sublot_no_typ = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_sno4_mng_typ = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_stk_mng_typ = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnIo_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_base_unit_rnd_typ = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnIo_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnIo_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnIo_cont_fctr_dec_place = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnIo_ver_flg = null;
	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public MCColumnConfig columnIo_sls_act_io_seq = null;
	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public MCColumnConfig columnIo_purc_act_io_seq = null;
	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnIo_dtl_row_id = null;
	// [IoBtn]ブロック関連のField定義
	public MCPanel IoBtnPanel = null;
	// [IoBtn]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton IoBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton IoBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton IoBtn_rcopy = null;
	/**
	 * Apply details 明細反映.<p>
	 *
	 */
	public MCButton IoBtn_upd_dtl = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Delivery note 納品書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
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
	/** [INS_SRCH]モードを表す定数 */
	public static final String INS_SRCH = "INS_SRCH";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
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
	public static final String[] statusArray = new String[]{INS_SRCH, INS, FIX_I, SRCH, UPD, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBBL1360_Srch01]のCallerの作成 */
	protected MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Srch01Caller createMS_MSBBL1360_Srch01() {
		MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Srch01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Srch01Bridge>
		caller = ((MSBBP_PurcDdlvReg_MC)this).new MS_MSBBL1360_Srch01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Srch01Bridge>(
					(MSBBP_PurcDdlvReg)this, new MS_MSBBL1360_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1360_Srch01]の呼び出し */
	protected void callMS_MSBBL1360_Srch01() {
		MCCaller caller = createMS_MSBBL1360_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1360_Srch02]のCallerの作成 */
	protected MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Srch02Caller createMS_MSBBL1360_Srch02() {
		MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Srch02Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Srch02Bridge>
		caller = ((MSBBP_PurcDdlvReg_MC)this).new MS_MSBBL1360_Srch02Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Srch02Bridge>(
					(MSBBP_PurcDdlvReg)this, new MS_MSBBL1360_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBBL1360_Srch02]の呼び出し */
	protected void callMS_MSBBL1360_Srch02() {
		MCCaller caller = createMS_MSBBL1360_Srch02();
		caller.exec();
	}
	/** [MS_MSBBL1360_Srch03]のCallerの作成 */
	protected MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Srch03Caller createMS_MSBBL1360_Srch03() {
		MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Srch03Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Srch03Bridge>
		caller = ((MSBBP_PurcDdlvReg_MC)this).new MS_MSBBL1360_Srch03Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Srch03Bridge>(
					(MSBBP_PurcDdlvReg)this, new MS_MSBBL1360_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBBL1360_Srch03]の呼び出し */
	protected void callMS_MSBBL1360_Srch03() {
		MCCaller caller = createMS_MSBBL1360_Srch03();
		caller.exec();
	}
	/** [MS_MSBBL1360_Ins01]のCallerの作成 */
	protected MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Ins01Caller createMS_MSBBL1360_Ins01() {
		MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Ins01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Ins01Bridge>
		caller = ((MSBBP_PurcDdlvReg_MC)this).new MS_MSBBL1360_Ins01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Ins01Bridge>(
					(MSBBP_PurcDdlvReg)this, new MS_MSBBL1360_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBBL1360_Ins01]の呼び出し */
	protected void callMS_MSBBL1360_Ins01() {
		MCCaller caller = createMS_MSBBL1360_Ins01();
		caller.exec();
	}
	/** [MS_MSBBL1360_Upd01]のCallerの作成 */
	protected MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Upd01Caller createMS_MSBBL1360_Upd01() {
		MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Upd01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Upd01Bridge>
		caller = ((MSBBP_PurcDdlvReg_MC)this).new MS_MSBBL1360_Upd01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Upd01Bridge>(
					(MSBBP_PurcDdlvReg)this, new MS_MSBBL1360_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL1360_Upd01]の呼び出し */
	protected void callMS_MSBBL1360_Upd01() {
		MCCaller caller = createMS_MSBBL1360_Upd01();
		caller.exec();
	}
	/** [MS_MSBBL1360_Del01]のCallerの作成 */
	protected MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Del01Caller createMS_MSBBL1360_Del01() {
		MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Del01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Del01Bridge>
		caller = ((MSBBP_PurcDdlvReg_MC)this).new MS_MSBBL1360_Del01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Del01Bridge>(
					(MSBBP_PurcDdlvReg)this, new MS_MSBBL1360_Del01Bridge());
		return caller;
	}
	/** [MS_MSBBL1360_Del01]の呼び出し */
	protected void callMS_MSBBL1360_Del01() {
		MCCaller caller = createMS_MSBBL1360_Del01();
		caller.exec();
	}
	/** [MS_MSBBL1360_Prnt01]のCallerの作成 */
	protected MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Prnt01Caller createMS_MSBBL1360_Prnt01() {
		MSBBP_PurcDdlvReg_MC.MS_MSBBL1360_Prnt01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Prnt01Bridge>
		caller = ((MSBBP_PurcDdlvReg_MC)this).new MS_MSBBL1360_Prnt01Caller<MSBBP_PurcDdlvReg, MS_MSBBL1360_Prnt01Bridge>(
					(MSBBP_PurcDdlvReg)this, new MS_MSBBL1360_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBBL1360_Prnt01]の呼び出し */
	protected void callMS_MSBBL1360_Prnt01() {
		MCCaller caller = createMS_MSBBL1360_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1360.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1360.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1360.DtlR> aDtlL;
	/** [Io]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1360.IoR> aIoL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1360.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1360.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1360.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1360.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBB.MSBBP1360.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1360.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1360.HdrR createHdrR() {
		return mcframe.clientMSBB.MSBBP1360.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBB.MSBBP1360.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1360.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBB.MSBBP1360.DtlR createDtlR() {
		return mcframe.clientMSBB.MSBBP1360.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1360.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class);
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
	 * コピーによってaIoLを設定します。
	 *
	 * aIoLのインスタンスは変更されません。
	 *
	 * @param dataset IoL
	 */
	public void setIoL(MCList<mcframe.clientMSBB.MSBBP1360.IoR> aList) {
		if (getIoL() != aList) {
			getIoL().setAll(aList);
		}
	}

	/**
	 * [Io]ブロックのコンテナaIoLを返します。
	 *
	 * @return IoL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1360.IoR> getIoL() {
		return aIoL;
	}

	/**
	 * aIoRを作成します。
	 *
	 * @return IoR
	 */
	public mcframe.clientMSBB.MSBBP1360.IoR createIoR() {
		return mcframe.clientMSBB.MSBBP1360.IoR.create();
	}

	/**
	 * aIoLを作成します。
	 *
	 * @return IoL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1360.IoR> createIoL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class);
	}

	/**
	 * IoTableを初期化します。
	 */
	protected void createIoTable(){
		if(IoTable == null){
			IoTable = beansFactory.createTable2("Io.table");
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
		if(!MCCollectionUtil.contains(ret, getIoL())) ret.add(getIoL());
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
		if(aCnt == getIoL()) return "Io";
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
		if(bId.equals("Io")) return getIoL();
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
		ret.add(ListPanel);
		ret.add(DtlInfoPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(IoInfoPanel);
		ret.add(IoPanel);
		ret.add(IoBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_PurcDdlvReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aIoL = createIoL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_PurcDdlvReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aIoL = createIoL();
		createIoTable();
		IoTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_PurcDdlvReg_MC.jbCreateScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateCnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateHdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateHdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateHdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateList((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateDtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateDtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateDtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateIoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateIo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateIoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbCreateEastBtn((MSBBP_PurcDdlvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBBP_PurcDdlvReg p) {
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
		p.Hdr_dlv_tm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().dlv_tm_p());
		p.Hdr_dlv_tm_p_PPanel.setName("Hdr.dlv_tm_p");
		p.Hdr_dlv_dt = p.Hdr_dlv_tm_p_PPanel.YmdHm_ymd;
		p.Hdr_dlv_dt.addAliasName("Hdr.dlv_dt", p);
		p.Hdr_dlv_hm = p.Hdr_dlv_tm_p_PPanel.YmdHm_hm;
		p.Hdr_dlv_hm.addAliasName("Hdr.dlv_hm", p);
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
		p.Hdr_dlv_lg_grp_cd = p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd;
		p.Hdr_dlv_lg_grp_cd.addAliasName("Hdr.dlv_lg_grp_cd", p);
		p.Hdr_dlv_lg_grp_nm = p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm;
		p.Hdr_dlv_lg_grp_nm.addAliasName("Hdr.dlv_lg_grp_nm", p);
		p.Hdr_cntry_cd = p.Hdr_dlv_p_PPanel.Dlv_cntry_cd;
		p.Hdr_cntry_cd.addAliasName("Hdr.cntry_cd", p);
		p.Hdr_cntry_nm = p.Hdr_dlv_p_PPanel.Dlv_cntry_nm;
		p.Hdr_cntry_nm.addAliasName("Hdr.cntry_nm", p);
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
		p.Hdr_dlv_tel = p.Hdr_dlv_p_PPanel.Dlv_tel;
		p.Hdr_dlv_tel.addAliasName("Hdr.dlv_tel", p);
		p.Hdr_dlv_fax = p.Hdr_dlv_p_PPanel.Dlv_fax;
		p.Hdr_dlv_fax.addAliasName("Hdr.dlv_fax", p);
		p.Hdr_dlv_cntct_dpt = p.Hdr_dlv_p_PPanel.Dlv_dlv_cntct_dpt;
		p.Hdr_dlv_cntct_dpt.addAliasName("Hdr.dlv_cntct_dpt", p);
		p.Hdr_dlv_cntct_psn = p.Hdr_dlv_p_PPanel.Dlv_dlv_cntct_psn;
		p.Hdr_dlv_cntct_psn.addAliasName("Hdr.dlv_cntct_psn", p);
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
		p.Hdr_cred_bal_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().cred_bal_amt_p());
		p.Hdr_cred_bal_amt_p_PPanel.setName("Hdr.cred_bal_amt_p");
		p.Hdr_cred_bal = p.Hdr_cred_bal_amt_p_PPanel.Amt_amt;
		p.Hdr_cred_bal.addAliasName("Hdr.cred_bal", p);
		p.Hdr_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdrR().xrate_p());
		p.Hdr_xrate_p_PPanel.setName("Hdr.xrate_p");
		p.Hdr_xrate = p.Hdr_xrate_p_PPanel.Xrate_xrate;
		p.Hdr_xrate.addAliasName("Hdr.xrate", p);
		p.Hdr_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdrR().ptax_xrate_p());
		p.Hdr_ptax_xrate_p_PPanel.setName("Hdr.ptax_xrate_p");
		p.Hdr_ptax_xrate = p.Hdr_ptax_xrate_p_PPanel.Xrate_xrate;
		p.Hdr_ptax_xrate.addAliasName("Hdr.ptax_xrate", p);
		p.Hdr_ttl_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_amt_p());
		p.Hdr_ttl_amt_p_PPanel.setName("Hdr.ttl_amt_p");
		p.Hdr_ttl_amt = p.Hdr_ttl_amt_p_PPanel.Amt_amt;
		p.Hdr_ttl_amt.addAliasName("Hdr.ttl_amt", p);
		p.Hdr_ttl_amt_not_cost_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ttl_amt_not_cost_p());
		p.Hdr_ttl_amt_not_cost_p_PPanel.setName("Hdr.ttl_amt_not_cost_p");
		p.Hdr_ttl_amt_no_cost = p.Hdr_ttl_amt_not_cost_p_PPanel.Amt_amt;
		p.Hdr_ttl_amt_no_cost.addAliasName("Hdr.ttl_amt_no_cost", p);
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
	protected static void jbCreateHdr2(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [List]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateList(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [DtlInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlInfo(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBBP_PurcDdlvReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$itm_p);
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
		p.Dtl_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$dlv_p);
		p.Dtl_dlv_p_PPanel.setName("Dtl.dlv_p");
		p.columnDtl_dlv_cd = p.Dtl_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnDtl_dlv_cd.addAliasName("Dtl.dlv_cd", p);
		p.columnDtl_dlv_nm = p.Dtl_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnDtl_dlv_nm.addAliasName("Dtl.dlv_nm", p);
		p.columnDtl_dlv_sundry_flg = p.Dtl_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDtl_dlv_sundry_flg.addAliasName("Dtl.dlv_sundry_flg", p);
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
		p.columnDtl_cntry_cd = p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnDtl_cntry_cd.addAliasName("Dtl.cntry_cd", p);
		p.columnDtl_cntry_nm = p.Dtl_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnDtl_cntry_nm.addAliasName("Dtl.cntry_nm", p);
		p.columnDtl_pri_prnt_flg = p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnDtl_pri_prnt_flg.addAliasName("Dtl.pri_prnt_flg", p);
		p.columnDtl_lg_grp_cd = p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnDtl_lg_grp_cd.addAliasName("Dtl.lg_grp_cd", p);
		p.columnDtl_lg_grp_nm = p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnDtl_lg_grp_nm.addAliasName("Dtl.lg_grp_nm", p);
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_sls_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$sls_schd_qty_p);
		p.Dtl_sls_schd_qty_p_PPanel.setName("Dtl.sls_schd_qty_p");
		p.columnDtl_sls_schd_qty = p.Dtl_sls_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtl_sls_schd_qty.addAliasName("Dtl.sls_schd_qty", p);
		p.Dtl_sls_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$sls_qty_p);
		p.Dtl_sls_qty_p_PPanel.setName("Dtl.sls_qty_p");
		p.columnDtl_sls_qty = p.Dtl_sls_qty_p_PPanel.columnQty_qty;
		p.columnDtl_sls_qty.addAliasName("Dtl.sls_qty", p);
		p.Dtl_trd_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$trd_upri_amt_p);
		p.Dtl_trd_upri_amt_p_PPanel.setName("Dtl.trd_upri_amt_p");
		p.columnDtl_upri_not_tgt_flg = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl_upri_not_tgt_flg.addAliasName("Dtl.upri_not_tgt_flg", p);
		p.columnDtl_trd_cur_upri = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl_trd_cur_upri.addAliasName("Dtl.trd_cur_upri", p);
		p.columnDtl_interim_flg = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl_interim_flg.addAliasName("Dtl.interim_flg", p);
		p.columnDtl_trd_cur_amt = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl_trd_cur_amt.addAliasName("Dtl.trd_cur_amt", p);
		p.columnDtl_trd_cur_inc_tax_amt = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl_trd_cur_inc_tax_amt.addAliasName("Dtl.trd_cur_inc_tax_amt", p);
		p.columnDtl_tax_fix_flg = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl_tax_fix_flg.addAliasName("Dtl.tax_fix_flg", p);
		p.columnDtl_tax_cd = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl_tax_cd.addAliasName("Dtl.tax_cd", p);
		p.columnDtl_tax_nm = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl_tax_nm.addAliasName("Dtl.tax_nm", p);
		p.columnDtl_tax_rate = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl_tax_rate.addAliasName("Dtl.tax_rate", p);
		p.columnDtl_tax_typ = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl_tax_typ.addAliasName("Dtl.tax_typ", p);
		p.columnDtl_inc_tax_flg = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl_inc_tax_flg.addAliasName("Dtl.inc_tax_flg", p);
		p.columnDtl_trd_cur_tax_amt = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl_trd_cur_tax_amt.addAliasName("Dtl.trd_cur_tax_amt", p);
		p.columnDtl_trd_cur_dscnt_amt = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl_trd_cur_dscnt_amt.addAliasName("Dtl.trd_cur_dscnt_amt", p);
		p.columnDtl_dscnt_rsn_cd = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl_dscnt_rsn_cd.addAliasName("Dtl.dscnt_rsn_cd", p);
		p.columnDtl_dscnt_rsn_nm = p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl_dscnt_rsn_nm.addAliasName("Dtl.dscnt_rsn_nm", p);
		p.Dtl_cost_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$cost_upri_p);
		p.Dtl_cost_upri_p_PPanel.setName("Dtl.cost_upri_p");
		p.columnDtl_cost_upri = p.Dtl_cost_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_cost_upri.addAliasName("Dtl.cost_upri", p);
		p.Dtl_cost_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$cost_amt_p);
		p.Dtl_cost_amt_p_PPanel.setName("Dtl.cost_amt_p");
		p.columnDtl_cost_amt = p.Dtl_cost_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_cost_amt.addAliasName("Dtl.cost_amt", p);
		p.Dtl_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$base_cur_upri_p);
		p.Dtl_base_cur_upri_p_PPanel.setName("Dtl.base_cur_upri_p");
		p.columnDtl_base_cur_upri = p.Dtl_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_upri.addAliasName("Dtl.base_cur_upri", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$base_cur_inc_tax_amt_p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_inc_tax_amt_p");
		p.columnDtl_base_cur_inc_tax_amt = p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_inc_tax_amt.addAliasName("Dtl.base_cur_inc_tax_amt", p);
		p.Dtl_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$base_cur_tax_amt_p);
		p.Dtl_base_cur_tax_amt_p_PPanel.setName("Dtl.base_cur_tax_amt_p");
		p.columnDtl_base_cur_tax_amt = p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_tax_amt.addAliasName("Dtl.base_cur_tax_amt", p);
		p.Dtl_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$base_cur_dscnt_amt_p);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.setName("Dtl.base_cur_dscnt_amt_p");
		p.columnDtl_base_cur_dscnt_amt = p.Dtl_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_dscnt_amt.addAliasName("Dtl.base_cur_dscnt_amt", p);
		p.Dtl_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$ptax_cur_upri_p);
		p.Dtl_ptax_cur_upri_p_PPanel.setName("Dtl.ptax_cur_upri_p");
		p.columnDtl_ptax_cur_upri = p.Dtl_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_upri.addAliasName("Dtl.ptax_cur_upri", p);
		p.Dtl_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$ptax_cur_amt_p);
		p.Dtl_ptax_cur_amt_p_PPanel.setName("Dtl.ptax_cur_amt_p");
		p.columnDtl_ptax_cur_amt = p.Dtl_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_amt.addAliasName("Dtl.ptax_cur_amt", p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$ptax_cur_inc_tax_amt_p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl.ptax_cur_inc_tax_amt_p");
		p.columnDtl_ptax_cur_inc_tax_amt = p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_inc_tax_amt.addAliasName("Dtl.ptax_cur_inc_tax_amt", p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$ptax_cur_tax_amt_p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.setName("Dtl.ptax_cur_tax_amt_p");
		p.columnDtl_ptax_cur_tax_amt = p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_tax_amt.addAliasName("Dtl.ptax_cur_tax_amt", p);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$ptax_cur_dscnt_amt_p);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.setName("Dtl.ptax_cur_dscnt_amt_p");
		p.columnDtl_ptax_cur_dscnt_amt = p.Dtl_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_dscnt_amt.addAliasName("Dtl.ptax_cur_dscnt_amt", p);
		p.Dtl_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$wtax_amt_p);
		p.Dtl_wtax_amt_p_PPanel.setName("Dtl.wtax_amt_p");
		p.columnDtl_wtax_amt = p.Dtl_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_wtax_amt.addAliasName("Dtl.wtax_amt", p);
		p.Dtl_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$lot_no_p);
		p.Dtl_lot_no_p_PPanel.setName("Dtl.lot_no_p");
		p.columnDtl_crt_lot_flg = p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtl_crt_lot_flg.addAliasName("Dtl.crt_lot_flg", p);
		p.columnDtl_lot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtl_lot_no.addAliasName("Dtl.lot_no", p);
		p.columnDtl_sublot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtl_sublot_no.addAliasName("Dtl.sublot_no", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_purc_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_cont_qty_p);
		p.Dtl_purc_cont_qty_p_PPanel.setName("Dtl.purc_cont_qty_p");
		p.columnDtl_purc_cont_qty = p.Dtl_purc_cont_qty_p_PPanel.columnPurcContQty_purc_cont_qty;
		p.columnDtl_purc_cont_qty.addAliasName("Dtl.purc_cont_qty", p);
		p.Dtl_purc_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_cont_fctr_p);
		p.Dtl_purc_cont_fctr_p_PPanel.setName("Dtl.purc_cont_fctr_p");
		p.columnDtl_purc_cont_fctr = p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr;
		p.columnDtl_purc_cont_fctr.addAliasName("Dtl.purc_cont_fctr", p);
		p.Dtl_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$std_cont_qty_p);
		p.Dtl_std_cont_qty_p_PPanel.setName("Dtl.std_cont_qty_p");
		p.columnDtl_std_cont_qty = p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_std_cont_qty.addAliasName("Dtl.std_cont_qty", p);
		p.Dtl_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$cont_fctr_unit_p);
		p.Dtl_cont_fctr_unit_p_PPanel.setName("Dtl.cont_fctr_unit_p");
		p.columnDtl_cont_fctr_unit_cd = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl_cont_fctr_unit_cd.addAliasName("Dtl.cont_fctr_unit_cd", p);
		p.columnDtl_cont_fctr_unit_nm = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl_cont_fctr_unit_nm.addAliasName("Dtl.cont_fctr_unit_nm", p);
		p.Dtl_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$std_cont_fctr_p);
		p.Dtl_std_cont_fctr_p_PPanel.setName("Dtl.std_cont_fctr_p");
		p.columnDtl_std_cont_fctr = p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl_std_cont_fctr.addAliasName("Dtl.std_cont_fctr", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$sno_wrk_no_p);
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
		p.Dtl_purc_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_xrate_p);
		p.Dtl_purc_xrate_p_PPanel.setName("Dtl.purc_xrate_p");
		p.columnDtl_purc_xrate = p.Dtl_purc_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl_purc_xrate.addAliasName("Dtl.purc_xrate", p);
		p.Dtl_purc_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_ptax_xrate_p);
		p.Dtl_purc_ptax_xrate_p_PPanel.setName("Dtl.purc_ptax_xrate_p");
		p.columnDtl_purc_ptax_xrate = p.Dtl_purc_ptax_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl_purc_ptax_xrate.addAliasName("Dtl.purc_ptax_xrate", p);
		p.Dtl_purc_trd_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_trd_upri_amt_p);
		p.Dtl_purc_trd_upri_amt_p_PPanel.setName("Dtl.purc_trd_upri_amt_p");
		p.columnDtl_purc_upri_not_tgt_flg = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl_purc_upri_not_tgt_flg.addAliasName("Dtl.purc_upri_not_tgt_flg", p);
		p.columnDtl_purc_trd_cur_upri = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl_purc_trd_cur_upri.addAliasName("Dtl.purc_trd_cur_upri", p);
		p.columnDtl_purc_interim_flg = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl_purc_interim_flg.addAliasName("Dtl.purc_interim_flg", p);
		p.columnDtl_purc_trd_cur_amt = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl_purc_trd_cur_amt.addAliasName("Dtl.purc_trd_cur_amt", p);
		p.columnDtl_purc_trd_cur_inc_tax_amt = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl_purc_trd_cur_inc_tax_amt.addAliasName("Dtl.purc_trd_cur_inc_tax_amt", p);
		p.columnDtl_purc_tax_fix_flg = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl_purc_tax_fix_flg.addAliasName("Dtl.purc_tax_fix_flg", p);
		p.columnDtl_purc_tax_cd = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl_purc_tax_cd.addAliasName("Dtl.purc_tax_cd", p);
		p.columnDtl_purc_tax_nm = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl_purc_tax_nm.addAliasName("Dtl.purc_tax_nm", p);
		p.columnDtl_purc_tax_rate = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl_purc_tax_rate.addAliasName("Dtl.purc_tax_rate", p);
		p.columnDtl_purc_tax_typ = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl_purc_tax_typ.addAliasName("Dtl.purc_tax_typ", p);
		p.columnDtl_purc_inc_tax_flg = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl_purc_inc_tax_flg.addAliasName("Dtl.purc_inc_tax_flg", p);
		p.columnDtl_purc_trd_cur_tax_amt = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl_purc_trd_cur_tax_amt.addAliasName("Dtl.purc_trd_cur_tax_amt", p);
		p.columnDtl_purc_trd_cur_dscnt_amt = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl_purc_trd_cur_dscnt_amt.addAliasName("Dtl.purc_trd_cur_dscnt_amt", p);
		p.columnDtl_purc_dscnt_rsn_cd = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl_purc_dscnt_rsn_cd.addAliasName("Dtl.purc_dscnt_rsn_cd", p);
		p.columnDtl_purc_dscnt_rsn_nm = p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl_purc_dscnt_rsn_nm.addAliasName("Dtl.purc_dscnt_rsn_nm", p);
		p.Dtl_purc_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_base_cur_upri_p);
		p.Dtl_purc_base_cur_upri_p_PPanel.setName("Dtl.purc_base_cur_upri_p");
		p.columnDtl_purc_base_cur_upri = p.Dtl_purc_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_purc_base_cur_upri.addAliasName("Dtl.purc_base_cur_upri", p);
		p.Dtl_purc_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_base_cur_amt_p);
		p.Dtl_purc_base_cur_amt_p_PPanel.setName("Dtl.purc_base_cur_amt_p");
		p.columnDtl_purc_base_cur_amt = p.Dtl_purc_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_purc_base_cur_amt.addAliasName("Dtl.purc_base_cur_amt", p);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_base_cur_inc_tax_amt_p);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.purc_base_cur_inc_tax_amt_p");
		p.columnDtl_purc_base_cur_inc_tax_amt = p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_purc_base_cur_inc_tax_amt.addAliasName("Dtl.purc_base_cur_inc_tax_amt", p);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_base_cur_tax_amt_p);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.setName("Dtl.purc_base_cur_tax_amt_p");
		p.columnDtl_purc_base_cur_tax_amt = p.Dtl_purc_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_purc_base_cur_tax_amt.addAliasName("Dtl.purc_base_cur_tax_amt", p);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_base_cur_dscnt_amt_p);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.setName("Dtl.purc_base_cur_dscnt_amt_p");
		p.columnDtl_purc_base_cur_dscnt_amt = p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_purc_base_cur_dscnt_amt.addAliasName("Dtl.purc_base_cur_dscnt_amt", p);
		p.Dtl_purc_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_ptax_cur_upri_p);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.setName("Dtl.purc_ptax_cur_upri_p");
		p.columnDtl_purc_ptax_cur_upri = p.Dtl_purc_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_purc_ptax_cur_upri.addAliasName("Dtl.purc_ptax_cur_upri", p);
		p.Dtl_purc_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_ptax_cur_amt_p);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.setName("Dtl.purc_ptax_cur_amt_p");
		p.columnDtl_purc_ptax_cur_amt = p.Dtl_purc_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_purc_ptax_cur_amt.addAliasName("Dtl.purc_ptax_cur_amt", p);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_ptax_cur_inc_tax_amt_p);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl.purc_ptax_cur_inc_tax_amt_p");
		p.columnDtl_purc_ptax_cur_inc_tax_amt = p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_purc_ptax_cur_inc_tax_amt.addAliasName("Dtl.purc_ptax_cur_inc_tax_amt", p);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_ptax_cur_tax_amt_p);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.setName("Dtl.purc_ptax_cur_tax_amt_p");
		p.columnDtl_purc_ptax_cur_tax_amt = p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_purc_ptax_cur_tax_amt.addAliasName("Dtl.purc_ptax_cur_tax_amt", p);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_ptax_cur_dscnt_amt_p);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.setName("Dtl.purc_ptax_cur_dscnt_amt_p");
		p.columnDtl_purc_ptax_cur_dscnt_amt = p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_purc_ptax_cur_dscnt_amt.addAliasName("Dtl.purc_ptax_cur_dscnt_amt", p);
		p.Dtl_purc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_qty_p);
		p.Dtl_purc_qty_p_PPanel.setName("Dtl.purc_qty_p");
		p.columnDtl_purc_qty = p.Dtl_purc_qty_p_PPanel.columnQty_qty;
		p.columnDtl_purc_qty.addAliasName("Dtl.purc_qty", p);
		p.Dtl_purc_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_trd_unit_qty_p);
		p.Dtl_purc_trd_unit_qty_p_PPanel.setName("Dtl.purc_trd_unit_qty_p");
		p.columnDtl_purc_trd_unit_qty = p.Dtl_purc_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_purc_trd_unit_qty.addAliasName("Dtl.purc_trd_unit_qty", p);
		p.Dtl_purc_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.DtlR.$purc_base_unit_qty_p);
		p.Dtl_purc_base_unit_qty_p_PPanel.setName("Dtl.purc_base_unit_qty_p");
		p.columnDtl_purc_base_unit_qty = p.Dtl_purc_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_purc_base_unit_qty.addAliasName("Dtl.purc_base_unit_qty", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MSBBP_PurcDdlvReg p) {
		p.DtlBtn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.DtlBtn_menu_move_p_PPanel.setName("DtlBtn.menu_move_p");
	}

	/**
	 * [IoInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIoInfo(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [Io]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIo(MSBBP_PurcDdlvReg p) {
		p.Io_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$trd_unit_qty_p);
		p.Io_trd_unit_qty_p_PPanel.setName("Io.trd_unit_qty_p");
		p.columnIo_trd_unit_qty = p.Io_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnIo_trd_unit_qty.addAliasName("Io.trd_unit_qty", p);
		p.Io_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$base_unit_qty_p);
		p.Io_base_unit_qty_p_PPanel.setName("Io.base_unit_qty_p");
		p.columnIo_base_unit_qty = p.Io_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnIo_base_unit_qty.addAliasName("Io.base_unit_qty", p);
		p.Io_purc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$purc_qty_p);
		p.Io_purc_qty_p_PPanel.setName("Io.purc_qty_p");
		p.columnIo_purc_qty = p.Io_purc_qty_p_PPanel.columnQty_qty;
		p.columnIo_purc_qty.addAliasName("Io.purc_qty", p);
		p.Io_sls_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$sls_qty_p);
		p.Io_sls_qty_p_PPanel.setName("Io.sls_qty_p");
		p.columnIo_sls_qty = p.Io_sls_qty_p_PPanel.columnQty_qty;
		p.columnIo_sls_qty.addAliasName("Io.sls_qty", p);
		p.Io_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$lot_no_p);
		p.Io_lot_no_p_PPanel.setName("Io.lot_no_p");
		p.columnIo_crt_lot_flg = p.Io_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnIo_crt_lot_flg.addAliasName("Io.crt_lot_flg", p);
		p.columnIo_lot_no = p.Io_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnIo_lot_no.addAliasName("Io.lot_no", p);
		p.columnIo_sublot_no = p.Io_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnIo_sublot_no.addAliasName("Io.sublot_no", p);
		p.Io_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$ver_no_p);
		p.Io_ver_no_p_PPanel.setName("Io.ver_no_p");
		p.columnIo_ver_no = p.Io_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnIo_ver_no.addAliasName("Io.ver_no", p);
		p.Io_purc_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$purc_base_unit_qty_p);
		p.Io_purc_base_unit_qty_p_PPanel.setName("Io.purc_base_unit_qty_p");
		p.columnIo_purc_base_unit_qty = p.Io_purc_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnIo_purc_base_unit_qty.addAliasName("Io.purc_base_unit_qty", p);
		p.Io_purc_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$purc_cont_qty_p);
		p.Io_purc_cont_qty_p_PPanel.setName("Io.purc_cont_qty_p");
		p.columnIo_purc_cont_qty = p.Io_purc_cont_qty_p_PPanel.columnPurcContQty_purc_cont_qty;
		p.columnIo_purc_cont_qty.addAliasName("Io.purc_cont_qty", p);
		p.Io_purc_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$purc_cont_fctr_p);
		p.Io_purc_cont_fctr_p_PPanel.setName("Io.purc_cont_fctr_p");
		p.columnIo_purc_cont_fctr = p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr;
		p.columnIo_purc_cont_fctr.addAliasName("Io.purc_cont_fctr", p);
		p.Io_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$std_cont_qty_p);
		p.Io_std_cont_qty_p_PPanel.setName("Io.std_cont_qty_p");
		p.columnIo_std_cont_qty = p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnIo_std_cont_qty.addAliasName("Io.std_cont_qty", p);
		p.Io_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$cont_fctr_unit_p);
		p.Io_cont_fctr_unit_p_PPanel.setName("Io.cont_fctr_unit_p");
		p.columnIo_cont_fctr_unit_cd = p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnIo_cont_fctr_unit_cd.addAliasName("Io.cont_fctr_unit_cd", p);
		p.columnIo_cont_fctr_unit_nm = p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnIo_cont_fctr_unit_nm.addAliasName("Io.cont_fctr_unit_nm", p);
		p.Io_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$std_cont_fctr_p);
		p.Io_std_cont_fctr_p_PPanel.setName("Io.std_cont_fctr_p");
		p.columnIo_std_cont_fctr = p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnIo_std_cont_fctr.addAliasName("Io.std_cont_fctr", p);
		p.Io_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBB.MSBBP1360.IoR.$sno_wrk_no_p);
		p.Io_sno_wrk_no_p_PPanel.setName("Io.sno_wrk_no_p");
		p.columnIo_sno1 = p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnIo_sno1.addAliasName("Io.sno1", p);
		p.columnIo_sno2 = p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnIo_sno2.addAliasName("Io.sno2", p);
		p.columnIo_sno3 = p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnIo_sno3.addAliasName("Io.sno3", p);
		p.columnIo_sno4 = p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnIo_sno4.addAliasName("Io.sno4", p);
		p.columnIo_wrk_no = p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnIo_wrk_no.addAliasName("Io.wrk_no", p);
		p.columnIo_wrk_nm = p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnIo_wrk_nm.addAliasName("Io.wrk_nm", p);
	}

	/**
	 * [IoBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIoBtn(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBBP_PurcDdlvReg p) {
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
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","stk_mng_typ","dscnt_itm_flg","lot_no_typ","sublot_no_typ","trd_unit_cd","itm_bill_crryovr_times");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","stk_mng_typ","dscnt_itm_flg","lot_no_typ","sublot_no_typ","trd_unit_cd","itm_bill_crryovr_times");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","stk_mng_typ","dscnt_itm_flg","lot_no_typ","sublot_no_typ","trd_unit_cd","itm_bill_crryovr_times");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","asset_mng_typ","asset_mng_typ_nm","sundry_itm_flg","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","stk_mng_typ","dscnt_itm_flg","lot_no_typ","sublot_no_typ","trd_unit_cd","itm_bill_crryovr_times");
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
	
	
	/** [Dtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dlv_p_PPanel_columnDlv_bp_cd_p = null;

	/**
	 * [Dtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter() {
		if (Dtl_dlv_p_PPanel_columnDlv_bp_cd_p == null) {
			Dtl_dlv_p_PPanel_columnDlv_bp_cd_p = createDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter(Dtl_dlv_p_PPanel.columnDlv_bp_cd, "dlv_cd", "dlv_nm","dlv_sundry_flg","pri_prnt_flg","dlv_zip_cd","dlv_addr1","dlv_addr2","dlv_addr3","dlv_addr4","cntry_cd","cntry_nm","dlv_tel","dlv_fax","dlv_cntct_dpt","dlv_cntct_psn");
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
	
	
	/** [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_rate","inc_tax_flg","tax_typ");
		}
		return Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p == null) {
			Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = createDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd, "dscnt_rsn_cd", "dscnt_rsn_nm");
		}
		return Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p;
	}
	
	
	/** [Dtl_sls_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sls_rsn_cd_p = null;

	/**
	 * [Dtl_sls_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_rsn_cd_ListPutter() {
		if (Dtl_sls_rsn_cd_p == null) {
			Dtl_sls_rsn_cd_p = createDtl_sls_rsn_cd_ListPutter(columnDtl_sls_rsn_cd, "sls_rsn_cd", "sls_rsn_nm","sls_acxfr_flg");

		}
		return Dtl_sls_rsn_cd_p;
	}
	
	
	/** [Dtl_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bd_dpt_cd_p = null;

	/**
	 * [Dtl_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bd_dpt_cd_ListPutter() {
		if (Dtl_bd_dpt_cd_p == null) {
			Dtl_bd_dpt_cd_p = createDtl_bd_dpt_cd_ListPutter(columnDtl_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Dtl_bd_dpt_cd_p;
	}
	
	
	/** [Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd, "purc_tax_cd", "purc_tax_nm","purc_tax_rate","purc_inc_tax_flg","purc_tax_typ");
		}
		return Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p == null) {
			Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = createDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd, "purc_dscnt_rsn_cd", "purc_dscnt_rsn_nm");
		}
		return Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p;
	}
	
	
	/** [Dtl_purc_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_purc_rsn_cd_p = null;

	/**
	 * [Dtl_purc_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_rsn_cd_ListPutter() {
		if (Dtl_purc_rsn_cd_p == null) {
			Dtl_purc_rsn_cd_p = createDtl_purc_rsn_cd_ListPutter(columnDtl_purc_rsn_cd, "purc_rsn_cd", "purc_rsn_nm","xpns_purc_flg");

		}
		return Dtl_purc_rsn_cd_p;
	}
	
	
	/** [Dtl_purc_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_purc_bd_dpt_cd_p = null;

	/**
	 * [Dtl_purc_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_bd_dpt_cd_ListPutter() {
		if (Dtl_purc_bd_dpt_cd_p == null) {
			Dtl_purc_bd_dpt_cd_p = createDtl_purc_bd_dpt_cd_ListPutter(columnDtl_purc_bd_dpt_cd, "purc_bd_dpt_cd", "purc_bd_dpt_nm");

		}
		return Dtl_purc_bd_dpt_cd_p;
	}
	
	
	/** [Io_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Io_trd_unit_cd_p = null;

	/**
	 * [Io_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getIo_trd_unit_cd_ListPutter() {
		if (Io_trd_unit_cd_p == null) {
			Io_trd_unit_cd_p = createIo_trd_unit_cd_ListPutter(columnIo_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_rnd_typ");

		}
		return Io_trd_unit_cd_p;
	}
	
	
	/** [Io_gd_cd_ListPutter]の定義 */
	private MCListPutter Io_gd_cd_p = null;

	/**
	 * [Io_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getIo_gd_cd_ListPutter() {
		if (Io_gd_cd_p == null) {
			Io_gd_cd_p = createIo_gd_cd_ListPutter(columnIo_gd_cd, "gd_cd", "gd_nm");

		}
		return Io_gd_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_PurcDdlvReg create(){
		MSBBP_PurcDdlvReg p = new MSBBP_PurcDdlvReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_PurcDdlvReg create(String name){
		MSBBP_PurcDdlvReg p = new MSBBP_PurcDdlvReg(name);
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
		MSBBP_PurcDdlvReg_MC.jbfInitScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitCnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitHdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitHdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitHdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitList((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitDtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitDtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitDtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitIoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitIo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitIoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbfInitEastBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitCnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitHdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitHdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitHdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitList((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitDtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitDtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitDtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitIoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitIo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitIoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.jbInitEastBtn((MSBBP_PurcDdlvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_PurcDdlvReg p) {
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
		p.Cnd_srch_tgt_typ_nm = p.beansFactory.createTextComboBox("Cnd.srch_tgt_typ_nm");
		p.Cnd_srch_tgt_typ_nm.setLabel(p.Cnd_srch_tgt_typ_nm_Label);
		p.Cnd_srch_tgt_no = p.beansFactory.createTextField("Cnd.srch_tgt_no");
		p.Cnd_srch_tgt_rev = p.beansFactory.createNumberField("Cnd.srch_tgt_rev");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_purc_schd_dt_Label = p.beansFactory.createLabel("Cnd.purc_schd_dt_Label");
		p.Cnd_purc_schd_dt = p.beansFactory.createDateField("Cnd.purc_schd_dt");
		p.Cnd_purc_schd_dt.setLabel(p.Cnd_purc_schd_dt_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
		p.Cnd_srch_slip = p.beansFactory.createButton("Cnd.srch_slip", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextField("Hdr.trd_cd");
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
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_edi_flg = p.beansFactory.createCheckBox("Hdr.edi_flg");
		p.Hdr_sls_act_seq = p.beansFactory.createNumberField("Hdr.sls_act_seq");
		p.Hdr_dlv_slip_no_Label = p.beansFactory.createLabel("Hdr.dlv_slip_no_Label");
		p.Hdr_dlv_slip_no = p.beansFactory.createTextField("Hdr.dlv_slip_no");
		p.Hdr_dlv_slip_no.setLabel(p.Hdr_dlv_slip_no_Label);
		p.Hdr_sls_dt_Label = p.beansFactory.createLabel("Hdr.sls_dt_Label");
		p.Hdr_sls_dt = p.beansFactory.createDateField("Hdr.sls_dt");
		p.Hdr_sls_dt.setLabel(p.Hdr_sls_dt_Label);
		p.Hdr_bill_basis_dt_Label = p.beansFactory.createLabel("Hdr.bill_basis_dt_Label");
		p.Hdr_bill_basis_dt = p.beansFactory.createDateField("Hdr.bill_basis_dt");
		p.Hdr_bill_basis_dt.setLabel(p.Hdr_bill_basis_dt_Label);
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
		p.Hdr_cst_cd = p.beansFactory.createTextField("Hdr.cst_cd");
		p.Hdr_cst_cd.setLabel(p.Hdr_cst_cd_Label);
		p.Hdr_cst_nm = p.beansFactory.createTextField("Hdr.cst_nm");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_dlv_slip_out_flg = p.beansFactory.createCheckBox("Hdr.dlv_slip_out_flg");
		p.Hdr_dlv_slip_prntd_flg = p.beansFactory.createCheckBox("Hdr.dlv_slip_prntd_flg");
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextComboBox("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
		p.Hdr_xrate_inpt_flg = p.beansFactory.createCheckBox("Hdr.xrate_inpt_flg");
		p.Hdr_xrate_cd_Label = p.beansFactory.createLabel("Hdr.xrate_cd_Label");
		p.Hdr_xrate_cd = p.beansFactory.createTextField("Hdr.xrate_cd");
		p.Hdr_xrate_cd.setLabel(p.Hdr_xrate_cd_Label);
		p.Hdr_purc_xrate_cd_Label = p.beansFactory.createLabel("Hdr.purc_xrate_cd_Label");
		p.Hdr_purc_xrate_cd = p.beansFactory.createTextField("Hdr.purc_xrate_cd");
		p.Hdr_purc_xrate_cd.setLabel(p.Hdr_purc_xrate_cd_Label);
		p.Hdr_ptax_cur_cd_Label = p.beansFactory.createLabel("Hdr.ptax_cur_cd_Label");
		p.Hdr_ptax_cur_cd = p.beansFactory.createTextField("Hdr.ptax_cur_cd");
		p.Hdr_ptax_cur_cd.setLabel(p.Hdr_ptax_cur_cd_Label);
		p.Hdr_ptax_cur_nm = p.beansFactory.createTextField("Hdr.ptax_cur_nm");
		p.Hdr_ptax_xrate_inpt_flg = p.beansFactory.createCheckBox("Hdr.ptax_xrate_inpt_flg");
		p.Hdr_qtn_no_Label = p.beansFactory.createLabel("Hdr.qtn_no_Label");
		p.Hdr_qtn_no = p.beansFactory.createTextField("Hdr.qtn_no");
		p.Hdr_qtn_no.setLabel(p.Hdr_qtn_no_Label);
		p.Hdr_qtn_rev = p.beansFactory.createNumberField("Hdr.qtn_rev");
		p.Hdr_slo_no_Label = p.beansFactory.createLabel("Hdr.slo_no_Label");
		p.Hdr_slo_no = p.beansFactory.createTextField("Hdr.slo_no");
		p.Hdr_slo_no.setLabel(p.Hdr_slo_no_Label);
		p.Hdr_cst_po_no_Label = p.beansFactory.createLabel("Hdr.cst_po_no_Label");
		p.Hdr_cst_po_no = p.beansFactory.createTextField("Hdr.cst_po_no");
		p.Hdr_cst_po_no.setLabel(p.Hdr_cst_po_no_Label);
		p.Hdr_prof_rate_Label = p.beansFactory.createLabel("Hdr.prof_rate_Label");
		p.Hdr_prof_rate = p.beansFactory.createNumberField("Hdr.prof_rate");
		p.Hdr_prof_rate.setLabel(p.Hdr_prof_rate_Label);
		p.Hdr_acst_cd_Label = p.beansFactory.createLabel("Hdr.acst_cd_Label");
		p.Hdr_acst_cd = p.beansFactory.createTextField("Hdr.acst_cd");
		p.Hdr_acst_cd.setLabel(p.Hdr_acst_cd_Label);
		p.Hdr_acst_nm = p.beansFactory.createTextField("Hdr.acst_nm");
		p.Hdr_ar_dpt_cd_Label = p.beansFactory.createLabel("Hdr.ar_dpt_cd_Label");
		p.Hdr_ar_dpt_cd = p.beansFactory.createTextField("Hdr.ar_dpt_cd");
		p.Hdr_ar_dpt_cd.setLabel(p.Hdr_ar_dpt_cd_Label);
		p.Hdr_ar_dpt_nm = p.beansFactory.createTextField("Hdr.ar_dpt_nm");
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
		p.Hdr_sls_amt_rnd_typ = p.beansFactory.createTextField("Hdr.sls_amt_rnd_typ");
		p.Hdr_sls_tax_rnd_typ = p.beansFactory.createTextField("Hdr.sls_tax_rnd_typ");
		p.Hdr_trd_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.trd_cur_amt_dec_place");
		p.Hdr_trd_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.trd_cur_upri_dec_place");
		p.Hdr_base_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.base_cur_amt_dec_place");
		p.Hdr_base_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.base_cur_upri_dec_place");
		p.Hdr_ptax_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.ptax_cur_amt_dec_place");
		p.Hdr_ptax_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.ptax_cur_upri_dec_place");
		p.Hdr_xrate_rnd_typ = p.beansFactory.createTextField("Hdr.xrate_rnd_typ");
		p.Hdr_wtax_rnd_typ = p.beansFactory.createTextField("Hdr.wtax_rnd_typ");
		p.Hdr_ar_dpt_typ = p.beansFactory.createTextField("Hdr.ar_dpt_typ");
		p.Hdr_cst_bill_crryovr_times = p.beansFactory.createNumberField("Hdr.cst_bill_crryovr_times");
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
	protected static void jbfInitHdr2(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [List]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitList(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.ListPanel = p.beansFactory.createPanel("List");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlInfo(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.DtlInfoPanel = p.beansFactory.createPanel("DtlInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_sync_flg = p.beansFactory.createTableColumn("Dtl.sync_flg", MCColumnType.CHECK);
		p.columnDtl_abort_flg = p.beansFactory.createTableColumn("Dtl.abort_flg", MCColumnType.CHECK);
		p.columnDtl_dlv_schd_dt = p.beansFactory.createTableColumn("Dtl.dlv_schd_dt", MCColumnType.DATE);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_dest_cd1 = p.beansFactory.createTableColumn("Dtl.dest_cd1", MCColumnType.TEXT);
		p.columnDtl_dest_nm1 = p.beansFactory.createTableColumn("Dtl.dest_nm1", MCColumnType.TEXT);
		p.columnDtl_dest_cd2 = p.beansFactory.createTableColumn("Dtl.dest_cd2", MCColumnType.TEXT);
		p.columnDtl_dest_nm2 = p.beansFactory.createTableColumn("Dtl.dest_nm2", MCColumnType.TEXT);
		p.columnDtl_dest_cd3 = p.beansFactory.createTableColumn("Dtl.dest_cd3", MCColumnType.TEXT);
		p.columnDtl_dest_nm3 = p.beansFactory.createTableColumn("Dtl.dest_nm3", MCColumnType.TEXT);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_sls_dtl_upd_flg = p.beansFactory.createTableColumn("Dtl.sls_dtl_upd_flg", MCColumnType.CHECK);
		p.columnDtl_prof_rate = p.beansFactory.createTableColumn("Dtl.prof_rate", MCColumnType.NUMBER);
		p.columnDtl_bill_crryovr_times = p.beansFactory.createTableColumn("Dtl.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_cst_po_d_no = p.beansFactory.createTableColumn("Dtl.cst_po_d_no", MCColumnType.TEXT);
		p.columnDtl_sls_rsn_cd = p.beansFactory.createTableColumn("Dtl.sls_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_rsn_nm = p.beansFactory.createTableColumn("Dtl.sls_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_bd_dpt_cd = p.beansFactory.createTableColumn("Dtl.bd_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_bd_dpt_nm = p.beansFactory.createTableColumn("Dtl.bd_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_wtax_rate = p.beansFactory.createTableColumn("Dtl.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_ext_sys_cd = p.beansFactory.createTableColumn("Dtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnDtl_ext_sys_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_nm", MCColumnType.TEXT);
		p.columnDtl_ext_purc_act_d_no = p.beansFactory.createTableColumn("Dtl.ext_purc_act_d_no", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_sls_act_d_no = p.beansFactory.createTableColumn("Dtl.sls_act_d_no", MCColumnType.TEXT);
		p.columnDtl_purc_ac_ym = p.beansFactory.createTableColumn("Dtl.purc_ac_ym", MCColumnType.DATE);
		p.columnDtl_purc_ac_dt = p.beansFactory.createTableColumn("Dtl.purc_ac_dt", MCColumnType.DATE);
		p.columnDtl_purc_dt = p.beansFactory.createTableColumn("Dtl.purc_dt", MCColumnType.DATE);
		p.columnDtl_purc_act_no = p.beansFactory.createTableColumn("Dtl.purc_act_no", MCColumnType.TEXT);
		p.columnDtl_purc_act_d_no = p.beansFactory.createTableColumn("Dtl.purc_act_d_no", MCColumnType.TEXT);
		p.columnDtl_po_no = p.beansFactory.createTableColumn("Dtl.po_no", MCColumnType.TEXT);
		p.columnDtl_po_d_no = p.beansFactory.createTableColumn("Dtl.po_d_no", MCColumnType.TEXT);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_nm = p.beansFactory.createTableColumn("Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_iv_flg = p.beansFactory.createTableColumn("Dtl.sppl_iv_flg", MCColumnType.CHECK);
		p.columnDtl_subcon_flg = p.beansFactory.createTableColumn("Dtl.subcon_flg", MCColumnType.CHECK);
		p.columnDtl_maker_cd = p.beansFactory.createTableColumn("Dtl.maker_cd", MCColumnType.TEXT);
		p.columnDtl_maker_nm = p.beansFactory.createTableColumn("Dtl.maker_nm", MCColumnType.TEXT);
		p.columnDtl_bp_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.bp_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_bp_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.bp_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_bp_lot_no = p.beansFactory.createTableColumn("Dtl.bp_lot_no", MCColumnType.TEXT);
		p.columnDtl_ship_fr_valid_dt = p.beansFactory.createTableColumn("Dtl.ship_fr_valid_dt", MCColumnType.DATE);
		p.columnDtl_purc_trd_cur_cd = p.beansFactory.createTableColumn("Dtl.purc_trd_cur_cd", MCColumnType.TEXT);
		p.columnDtl_purc_trd_cur_nm = p.beansFactory.createTableColumn("Dtl.purc_trd_cur_nm", MCColumnType.TEXT);
		p.columnDtl_purc_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.purc_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_purc_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.purc_ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_purc_dtl_upd_flg = p.beansFactory.createTableColumn("Dtl.purc_dtl_upd_flg", MCColumnType.CHECK);
		p.columnDtl_ptax_dt = p.beansFactory.createTableColumn("Dtl.ptax_dt", MCColumnType.DATE);
		p.columnDtl_purc_rsn_cd = p.beansFactory.createTableColumn("Dtl.purc_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_rsn_nm = p.beansFactory.createTableColumn("Dtl.purc_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_purc_bd_dpt_cd = p.beansFactory.createTableColumn("Dtl.purc_bd_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_purc_bd_dpt_nm = p.beansFactory.createTableColumn("Dtl.purc_bd_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_purc_wtax_rate = p.beansFactory.createTableColumn("Dtl.purc_wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_purc_wtax_amt = p.beansFactory.createTableColumn("Dtl.purc_wtax_amt", MCColumnType.NUMBER);
		p.columnDtl_base_unit_purc_schd_qty = p.beansFactory.createTableColumn("Dtl.base_unit_purc_schd_qty", MCColumnType.NUMBER);
		p.columnDtl_po_print_rmrks = p.beansFactory.createTableColumn("Dtl.po_print_rmrks", MCColumnType.TEXT);
		p.columnDtl_po_print_d_rmrks = p.beansFactory.createTableColumn("Dtl.po_print_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_lot_no_typ = p.beansFactory.createTableColumn("Dtl.lot_no_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_no_typ = p.beansFactory.createTableColumn("Dtl.sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_itm_bill_crryovr_times = p.beansFactory.createTableColumn("Dtl.itm_bill_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_sls_acxfr_flg = p.beansFactory.createTableColumn("Dtl.sls_acxfr_flg", MCColumnType.CHECK);
		p.columnDtl_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl.xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl_sls_act_no = p.beansFactory.createTableColumn("Dtl.sls_act_no", MCColumnType.TEXT);
		p.columnDtl_sls_act_seq = p.beansFactory.createTableColumn("Dtl.sls_act_seq", MCColumnType.NUMBER);
		p.columnDtl_sls_act_d_seq = p.beansFactory.createTableColumn("Dtl.sls_act_d_seq", MCColumnType.NUMBER);
		p.columnDtl_sls_schd_no = p.beansFactory.createTableColumn("Dtl.sls_schd_no", MCColumnType.TEXT);
		p.columnDtl_purc_schd_no = p.beansFactory.createTableColumn("Dtl.purc_schd_no", MCColumnType.TEXT);
		p.columnDtl_dtl_row_id = p.beansFactory.createTableColumn("Dtl.dtl_row_id", MCColumnType.NUMBER);
		p.columnDtl_arr_pr_no = p.beansFactory.createTableColumn("Dtl.arr_pr_no", MCColumnType.TEXT);
		p.columnDtl_ship_pr_no = p.beansFactory.createTableColumn("Dtl.ship_pr_no", MCColumnType.TEXT);
		p.columnDtl_schd_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.schd_trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_schd_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.schd_trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_purc_amt_rnd_typ = p.beansFactory.createTableColumn("Dtl.purc_amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_purc_upri_rnd_typ = p.beansFactory.createTableColumn("Dtl.purc_upri_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_purc_tax_rnd_typ = p.beansFactory.createTableColumn("Dtl.purc_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_purc_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.purc_trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_purc_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.purc_trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_purc_s_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.purc_s_trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_purc_s_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.purc_s_trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_purc_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.purc_trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_purc_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.purc_trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_purc_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.purc_trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_purc_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.purc_trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_xrate_purc_dt = p.beansFactory.createTableColumn("Dtl.xrate_purc_dt", MCColumnType.DATE);
		p.columnDtl_base_unit_qty_bef = p.beansFactory.createTableColumn("Dtl.base_unit_qty_bef", MCColumnType.NUMBER);
		p.columnDtl_base_unit_purc_qty = p.beansFactory.createTableColumn("Dtl.base_unit_purc_qty", MCColumnType.NUMBER);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_radd_noschd = p.beansFactory.createButton("DtlBtn.radd_noschd", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
	}

	/**
	 * [IoInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIoInfo(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.IoInfoPanel = p.beansFactory.createPanel("IoInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [Io]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIo(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.IoPanel = p.beansFactory.createPanel("Io");
		p.IoScrollPane = p.beansFactory.createScrollPane("Io.scroll");
		p.createIoTable();
		// ブロックの項目の初期化
		p.columnIo_trd_unit_cd = p.beansFactory.createTableColumn("Io.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnIo_trd_unit_nm = p.beansFactory.createTableColumn("Io.trd_unit_nm", MCColumnType.TEXT);
		p.columnIo_base_unit_cd = p.beansFactory.createTableColumn("Io.base_unit_cd", MCColumnType.TEXT);
		p.columnIo_base_unit_nm = p.beansFactory.createTableColumn("Io.base_unit_nm", MCColumnType.TEXT);
		p.columnIo_gd_cd = p.beansFactory.createTableColumn("Io.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnIo_gd_nm = p.beansFactory.createTableColumn("Io.gd_nm", MCColumnType.TEXT);
		p.columnIo_bp_dlv_slip_no = p.beansFactory.createTableColumn("Io.bp_dlv_slip_no", MCColumnType.TEXT);
		p.columnIo_bp_dlv_slip_d_no = p.beansFactory.createTableColumn("Io.bp_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnIo_bp_lot_no = p.beansFactory.createTableColumn("Io.bp_lot_no", MCColumnType.TEXT);
		p.columnIo_ship_fr_valid_dt = p.beansFactory.createTableColumn("Io.ship_fr_valid_dt", MCColumnType.DATE);
		p.columnIo_purc_act_io_no = p.beansFactory.createTableColumn("Io.purc_act_io_no", MCColumnType.TEXT);
		p.columnIo_sls_act_io_no = p.beansFactory.createTableColumn("Io.sls_act_io_no", MCColumnType.TEXT);
		p.columnIo_sub_char1 = p.beansFactory.createTableColumn("Io.sub_char1", MCColumnType.TEXT);
		p.columnIo_sub_char2 = p.beansFactory.createTableColumn("Io.sub_char2", MCColumnType.TEXT);
		p.columnIo_sub_char3 = p.beansFactory.createTableColumn("Io.sub_char3", MCColumnType.TEXT);
		p.columnIo_trd_unit_dec_place = p.beansFactory.createTableColumn("Io.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnIo_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Io.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnIo_trd_unit_conv_qty = p.beansFactory.createTableColumn("Io.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnIo_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Io.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnIo_itm_cd = p.beansFactory.createTableColumn("Io.itm_cd", MCColumnType.TEXT);
		p.columnIo_itm_sub1 = p.beansFactory.createTableColumn("Io.itm_sub1", MCColumnType.TEXT);
		p.columnIo_itm_sub2 = p.beansFactory.createTableColumn("Io.itm_sub2", MCColumnType.TEXT);
		p.columnIo_itm_sub3 = p.beansFactory.createTableColumn("Io.itm_sub3", MCColumnType.TEXT);
		p.columnIo_lot_mng_typ = p.beansFactory.createTableColumn("Io.lot_mng_typ", MCColumnType.TEXT);
		p.columnIo_sublot_mng_typ = p.beansFactory.createTableColumn("Io.sublot_mng_typ", MCColumnType.TEXT);
		p.columnIo_lot_no_typ = p.beansFactory.createTableColumn("Io.lot_no_typ", MCColumnType.TEXT);
		p.columnIo_sublot_no_typ = p.beansFactory.createTableColumn("Io.sublot_no_typ", MCColumnType.TEXT);
		p.columnIo_sno1_mng_typ = p.beansFactory.createTableColumn("Io.sno1_mng_typ", MCColumnType.TEXT);
		p.columnIo_sno2_mng_typ = p.beansFactory.createTableColumn("Io.sno2_mng_typ", MCColumnType.TEXT);
		p.columnIo_sno3_mng_typ = p.beansFactory.createTableColumn("Io.sno3_mng_typ", MCColumnType.TEXT);
		p.columnIo_sno4_mng_typ = p.beansFactory.createTableColumn("Io.sno4_mng_typ", MCColumnType.TEXT);
		p.columnIo_stk_mng_typ = p.beansFactory.createTableColumn("Io.stk_mng_typ", MCColumnType.TEXT);
		p.columnIo_base_unit_dec_place = p.beansFactory.createTableColumn("Io.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnIo_base_unit_rnd_typ = p.beansFactory.createTableColumn("Io.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnIo_cont_fctr_flg = p.beansFactory.createTableColumn("Io.cont_fctr_flg", MCColumnType.CHECK);
		p.columnIo_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Io.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnIo_cont_fctr_dec_place = p.beansFactory.createTableColumn("Io.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnIo_ver_flg = p.beansFactory.createTableColumn("Io.ver_flg", MCColumnType.CHECK);
		p.columnIo_sls_act_io_seq = p.beansFactory.createTableColumn("Io.sls_act_io_seq", MCColumnType.NUMBER);
		p.columnIo_purc_act_io_seq = p.beansFactory.createTableColumn("Io.purc_act_io_seq", MCColumnType.NUMBER);
		p.columnIo_dtl_row_id = p.beansFactory.createTableColumn("Io.dtl_row_id", MCColumnType.NUMBER);
	}

	/**
	 * [IoBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIoBtn(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.IoBtnPanel = p.beansFactory.createPanel("IoBtn");
		// ブロックの項目の初期化
		p.IoBtn_radd = p.beansFactory.createButton("IoBtn.radd", "no_border");
		p.IoBtn_rdel = p.beansFactory.createButton("IoBtn.rdel", "no_border");
		p.IoBtn_rcopy = p.beansFactory.createButton("IoBtn.rcopy", "no_border");
		p.IoBtn_upd_dtl = p.beansFactory.createButton("IoBtn.upd_dtl");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NXC");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1360.CndR.ope_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ);
		p.CndPanel.setLastBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ.setNextBeans(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1360.CndR.srch_tgt_typ_META);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.Cnd_srch_tgt_typ_nm.setLinkBeans(p.Cnd_srch_tgt_typ);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ_nm.setNextBeans(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1360.CndR.srch_tgt_typ_nm_META);
		p.CndPanel.add(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_no.setNextBeans(p.Cnd_srch_tgt_rev);
		p.Cnd_srch_tgt_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1360.CndR.srch_tgt_no_META);
		p.CndPanel.add(p.Cnd_srch_tgt_rev);
		p.Cnd_srch_tgt_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_srch_tgt_rev.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1360.CndR.srch_tgt_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_purc_schd_dt);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1360.CndR.latest_flg_META);
		p.CndPanel.add(p.Cnd_purc_schd_dt_Label);
		p.CndPanel.add(p.Cnd_purc_schd_dt);
		p.Cnd_purc_schd_dt.setNextBeans(p.Cnd_srch);
		p.Cnd_purc_schd_dt.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1360.CndR.purc_schd_dt_META);
		p.Cnd_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
		p.Cnd_srch.setNextBeans(p.Cnd_srch_slip);
		p.Cnd_srch_slip.setIcon("SEARCH");
		p.Cnd_srch_slip.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_slip);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.ListPanel);
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
	protected static void jbInitHdr(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_ac_ym);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_ac_ym_Label);
		p.HdrPanel.add(p.Hdr_ac_ym);
		p.Hdr_ac_ym.setNextBeans(p.Hdr_sls_act_no);
		p.Hdr_ac_ym.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ac_ym_META);
		p.Hdr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_sls_act_no_Label);
		p.HdrPanel.add(p.Hdr_sls_act_no);
		p.Hdr_sls_act_no.setNextBeans(p.Hdr_sls_act_rev);
		p.Hdr_sls_act_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.sls_act_no_META);
		p.HdrPanel.add(p.Hdr_sls_act_rev);
		p.Hdr_sls_act_rev.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_sls_act_rev.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.sls_act_rev_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_edi_flg);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_edi_flg);
		p.Hdr_edi_flg.setNextBeans(p.Hdr_sls_act_seq);
		p.Hdr_edi_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.edi_flg_META);
		p.HdrPanel.add(p.Hdr_sls_act_seq);
		p.Hdr_sls_act_seq.setNextBeans(p.Hdr_dlv_slip_no);
		p.Hdr_sls_act_seq.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.sls_act_seq_META);
		p.HdrPanel.add(p.Hdr_dlv_slip_no_Label);
		p.HdrPanel.add(p.Hdr_dlv_slip_no);
		p.Hdr_dlv_slip_no.setNextBeans(p.Hdr_sls_dt);
		p.Hdr_dlv_slip_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.dlv_slip_no_META);
		p.HdrPanel.add(p.Hdr_sls_dt_Label);
		p.HdrPanel.add(p.Hdr_sls_dt);
		p.Hdr_sls_dt.setNextBeans(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_sls_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.sls_dt_META);
		p.Hdr_sls_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_ac_dt_p_PPanel.setNextBeans(p.Hdr_can_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_can_ac_dt_p_PPanel.setNextBeans(p.Hdr_dlv_tm_p_PPanel);
		p.HdrPanel.add(p.Hdr_dlv_tm_p_PPanel);
		p.Hdr_dlv_tm_p_PPanel.setNextBeans(p.Hdr_bill_basis_dt);
		p.HdrPanel.add(p.Hdr_bill_basis_dt_Label);
		p.HdrPanel.add(p.Hdr_bill_basis_dt);
		p.Hdr_bill_basis_dt.setNextBeans(p.Hdr_dlv_p_PPanel);
		p.Hdr_bill_basis_dt.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.bill_basis_dt_META);
		p.Hdr_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_dlv_p_PPanel);
		p.Hdr_dlv_p_PPanel.setNextBeans(p.Hdr_dest_cd1);
		p.HdrPanel.add(p.Hdr_dest_cd1_Label);
		p.HdrPanel.add(p.Hdr_dest_cd1);
		p.Hdr_dest_cd1.setNextBeans(p.Hdr_dest_nm1);
		p.Hdr_dest_cd1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.dest_cd1_META);
		p.Hdr_dest_cd1.addLinkBeans(p.Hdr_dest_nm1);
		p.Hdr_dest_cd1.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dest_nm1);
		p.Hdr_dest_nm1.setNextBeans(p.Hdr_dest_cd2);
		p.Hdr_dest_nm1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.dest_nm1_META);
		p.HdrPanel.add(p.Hdr_dest_cd2_Label);
		p.HdrPanel.add(p.Hdr_dest_cd2);
		p.Hdr_dest_cd2.setNextBeans(p.Hdr_dest_nm2);
		p.Hdr_dest_cd2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.dest_cd2_META);
		p.Hdr_dest_cd2.addLinkBeans(p.Hdr_dest_nm2);
		p.Hdr_dest_cd2.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dest_nm2);
		p.Hdr_dest_nm2.setNextBeans(p.Hdr_dest_cd3);
		p.Hdr_dest_nm2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.dest_nm2_META);
		p.HdrPanel.add(p.Hdr_dest_cd3_Label);
		p.HdrPanel.add(p.Hdr_dest_cd3);
		p.Hdr_dest_cd3.setNextBeans(p.Hdr_dest_nm3);
		p.Hdr_dest_cd3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.dest_cd3_META);
		p.Hdr_dest_cd3.addLinkBeans(p.Hdr_dest_nm3);
		p.Hdr_dest_cd3.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dest_nm3);
		p.Hdr_dest_nm3.setNextBeans(p.Hdr_cst_cd);
		p.Hdr_dest_nm3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.dest_nm3_META);
		p.HdrPanel.add(p.Hdr_cst_cd_Label);
		p.HdrPanel.add(p.Hdr_cst_cd);
		p.Hdr_cst_cd.setNextBeans(p.Hdr_cst_nm);
		p.Hdr_cst_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.cst_cd_META);
		p.HdrPanel.add(p.Hdr_cst_nm);
		p.Hdr_cst_nm.setNextBeans(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_cst_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.cst_nm_META);
		p.HdrPanel.add(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_usr_dpt_p_PPanel.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_sls_dpt_nm,p.Hdr_wg_cd,p.Hdr_wg_nm);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_dlv_slip_out_flg);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_dlv_slip_out_flg);
		p.Hdr_dlv_slip_out_flg.setNextBeans(p.Hdr_dlv_slip_prntd_flg);
		p.Hdr_dlv_slip_out_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.dlv_slip_out_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_slip_prntd_flg);
		p.Hdr_dlv_slip_prntd_flg.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_dlv_slip_prntd_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.dlv_slip_prntd_flg_META);
		p.Hdr_trd_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cur_cd.setLinkBeans(p.Hdr_trd_cur_nm,p.Hdr_trd_cur_amt_dec_place,p.Hdr_trd_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_cred_bal_amt_p_PPanel);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_cred_bal_amt_p_PPanel);
		p.Hdr_cred_bal_amt_p_PPanel.setNextBeans(p.Hdr_base_cur_cd);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_xrate_inpt_flg);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_xrate_inpt_flg);
		p.Hdr_xrate_inpt_flg.setNextBeans(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_inpt_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.xrate_inpt_flg_META);
		p.HdrPanel.add(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_p_PPanel.setNextBeans(p.Hdr_xrate_cd);
		p.HdrPanel.add(p.Hdr_xrate_cd_Label);
		p.HdrPanel.add(p.Hdr_xrate_cd);
		p.Hdr_xrate_cd.setNextBeans(p.Hdr_purc_xrate_cd);
		p.Hdr_xrate_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.xrate_cd_META);
		p.HdrPanel.add(p.Hdr_purc_xrate_cd_Label);
		p.HdrPanel.add(p.Hdr_purc_xrate_cd);
		p.Hdr_purc_xrate_cd.setNextBeans(p.Hdr_ptax_cur_cd);
		p.Hdr_purc_xrate_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.purc_xrate_cd_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd);
		p.Hdr_ptax_cur_cd.setNextBeans(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ptax_cur_cd_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_nm.setNextBeans(p.Hdr_ptax_xrate_inpt_flg);
		p.Hdr_ptax_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ptax_cur_nm_META);
		p.HdrPanel.add(p.Hdr_ptax_xrate_inpt_flg);
		p.Hdr_ptax_xrate_inpt_flg.setNextBeans(p.Hdr_ptax_xrate_p_PPanel);
		p.Hdr_ptax_xrate_inpt_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ptax_xrate_inpt_flg_META);
		p.HdrPanel.add(p.Hdr_ptax_xrate_p_PPanel);
		p.Hdr_ptax_xrate_p_PPanel.setNextBeans(p.Hdr_qtn_no);
		p.HdrPanel.add(p.Hdr_qtn_no_Label);
		p.HdrPanel.add(p.Hdr_qtn_no);
		p.Hdr_qtn_no.setNextBeans(p.Hdr_qtn_rev);
		p.Hdr_qtn_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.qtn_no_META);
		p.HdrPanel.add(p.Hdr_qtn_rev);
		p.Hdr_qtn_rev.setNextBeans(p.Hdr_slo_no);
		p.Hdr_qtn_rev.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.qtn_rev_META);
		p.HdrPanel.add(p.Hdr_slo_no_Label);
		p.HdrPanel.add(p.Hdr_slo_no);
		p.Hdr_slo_no.setNextBeans(p.Hdr_cst_po_no);
		p.Hdr_slo_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.slo_no_META);
		p.HdrPanel.add(p.Hdr_cst_po_no_Label);
		p.HdrPanel.add(p.Hdr_cst_po_no);
		p.Hdr_cst_po_no.setNextBeans(p.Hdr_prof_rate);
		p.Hdr_cst_po_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.cst_po_no_META);
		p.HdrPanel.add(p.Hdr_prof_rate_Label);
		p.HdrPanel.add(p.Hdr_prof_rate);
		p.Hdr_prof_rate.setNextBeans(p.Hdr_ttl_amt_p_PPanel);
		p.Hdr_prof_rate.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.prof_rate_META);
		p.HdrPanel.add(p.Hdr_ttl_amt_p_PPanel);
		p.Hdr_ttl_amt_p_PPanel.setNextBeans(p.Hdr_ttl_amt_not_cost_p_PPanel);
		p.HdrPanel.add(p.Hdr_ttl_amt_not_cost_p_PPanel);
		p.Hdr_ttl_amt_not_cost_p_PPanel.setNextBeans(p.Hdr_trd_cur_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_p_PPanel);
		p.Hdr_trd_cur_amt_p_PPanel.setNextBeans(p.Hdr_trd_cur_inc_tax_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_trd_cur_inc_tax_amt_p_PPanel);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.setNextBeans(p.Hdr_acst_cd);
		p.HdrPanel.add(p.Hdr_acst_cd_Label);
		p.HdrPanel.add(p.Hdr_acst_cd);
		p.Hdr_acst_cd.setNextBeans(p.Hdr_acst_nm);
		p.Hdr_acst_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.acst_cd_META);
		p.HdrPanel.add(p.Hdr_acst_nm);
		p.Hdr_acst_nm.setNextBeans(p.Hdr_ar_dpt_cd);
		p.Hdr_acst_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.acst_nm_META);
		p.HdrPanel.add(p.Hdr_ar_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_ar_dpt_cd);
		p.Hdr_ar_dpt_cd.setNextBeans(p.Hdr_ar_dpt_nm);
		p.Hdr_ar_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ar_dpt_cd_META);
		p.Hdr_ar_dpt_cd.addLinkBeans(p.Hdr_ar_dpt_nm);
		p.Hdr_ar_dpt_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_ar_dpt_nm);
		p.Hdr_ar_dpt_nm.setNextBeans(p.Hdr_tterm_cd1);
		p.Hdr_ar_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ar_dpt_nm_META);
		p.Hdr_tterm_cd1.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd1.setLinkBeans(p.Hdr_tterm_nm1);
		p.HdrPanel.add(p.Hdr_tterm_cd1_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd1);
		p.Hdr_tterm_cd1.setNextBeans(p.Hdr_tterm_nm1);
		p.Hdr_tterm_cd1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.tterm_cd1_META);
		p.HdrPanel.add(p.Hdr_tterm_nm1);
		p.Hdr_tterm_nm1.setNextBeans(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_nm1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.tterm_nm1_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_rmrks1.setNextBeans(p.Hdr_tterm_cd2);
		p.Hdr_tterm_rmrks1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.tterm_rmrks1_META);
		p.Hdr_tterm_cd2.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd2.setLinkBeans(p.Hdr_tterm_nm2);
		p.HdrPanel.add(p.Hdr_tterm_cd2_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd2);
		p.Hdr_tterm_cd2.setNextBeans(p.Hdr_tterm_nm2);
		p.Hdr_tterm_cd2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.tterm_cd2_META);
		p.HdrPanel.add(p.Hdr_tterm_nm2);
		p.Hdr_tterm_nm2.setNextBeans(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_nm2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.tterm_nm2_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_rmrks2.setNextBeans(p.Hdr_tterm_cd3);
		p.Hdr_tterm_rmrks2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.tterm_rmrks2_META);
		p.Hdr_tterm_cd3.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd3.setLinkBeans(p.Hdr_tterm_nm3);
		p.HdrPanel.add(p.Hdr_tterm_cd3_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd3);
		p.Hdr_tterm_cd3.setNextBeans(p.Hdr_tterm_nm3);
		p.Hdr_tterm_cd3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.tterm_cd3_META);
		p.HdrPanel.add(p.Hdr_tterm_nm3);
		p.Hdr_tterm_nm3.setNextBeans(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_nm3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.tterm_nm3_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_rmrks3.setNextBeans(p.Hdr_trd_rmrks);
		p.Hdr_tterm_rmrks3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.tterm_rmrks3_META);
		p.HdrPanel.add(p.Hdr_trd_rmrks_Label);
		p.HdrPanel.add(p.Hdr_trd_rmrks);
		p.Hdr_trd_rmrks.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_trd_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.trd_rmrks_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_sls_amt_rnd_typ);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.sub_char3_META);
		p.HdrPanel.add(p.Hdr_sls_amt_rnd_typ);
		p.Hdr_sls_amt_rnd_typ.setNextBeans(p.Hdr_sls_tax_rnd_typ);
		p.Hdr_sls_amt_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.sls_amt_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_sls_tax_rnd_typ);
		p.Hdr_sls_tax_rnd_typ.setNextBeans(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_sls_tax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.sls_tax_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setNextBeans(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.trd_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_upri_dec_place.setNextBeans(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_trd_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.trd_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_amt_dec_place.setNextBeans(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.base_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_upri_dec_place.setNextBeans(p.Hdr_ptax_cur_amt_dec_place);
		p.Hdr_base_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.base_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_amt_dec_place);
		p.Hdr_ptax_cur_amt_dec_place.setNextBeans(p.Hdr_ptax_cur_upri_dec_place);
		p.Hdr_ptax_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ptax_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_upri_dec_place);
		p.Hdr_ptax_cur_upri_dec_place.setNextBeans(p.Hdr_xrate_rnd_typ);
		p.Hdr_ptax_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ptax_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_xrate_rnd_typ);
		p.Hdr_xrate_rnd_typ.setNextBeans(p.Hdr_wtax_rnd_typ);
		p.Hdr_xrate_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.xrate_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_wtax_rnd_typ);
		p.Hdr_wtax_rnd_typ.setNextBeans(p.Hdr_ar_dpt_typ);
		p.Hdr_wtax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.wtax_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_ar_dpt_typ);
		p.Hdr_ar_dpt_typ.setNextBeans(p.Hdr_cst_bill_crryovr_times);
		p.Hdr_ar_dpt_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ar_dpt_typ_META);
		p.HdrPanel.add(p.Hdr_cst_bill_crryovr_times);
		p.Hdr_cst_bill_crryovr_times.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.cst_bill_crryovr_times_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1360.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [List]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitList(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.add(p.ListPanel);
		p.ListPanel.setNextBeans(p.BtnPanel);
		p.ListPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.ListPanel.add(p.DtlInfoPanel, null);
		p.ListPanel.setLastBeans(p.DtlInfoPanel);
		p.DtlInfoPanel.setNextBeans(p.IoInfoPanel);
		p.ListPanel.add(p.IoInfoPanel, null);
	}

	/**
	 * [DtlInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlInfo(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.DtlInfoPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.DtlInfoPanel.add(p.DtlPanel, null);
		p.DtlInfoPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.DtlInfoPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtn_radd_noschd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd_noschd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd_noschd);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_radd_noschd);
		p.DtlBtn_radd_noschd.setNextBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setNextBeans(p.DtlBtn_menu_move_p_PPanel);
		p.DtlBtnPanel.add(p.DtlBtn_menu_move_p_PPanel);
	}

	/**
	 * [IoInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIoInfo(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.IoInfoPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.IoInfoPanel.add(p.IoPanel, null);
		p.IoInfoPanel.setLastBeans(p.IoPanel);
		p.IoPanel.setNextBeans(p.IoBtnPanel);
		p.IoInfoPanel.add(p.IoBtnPanel, null);
	}

	/**
	 * [Io]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIo(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.IoPanel.add(p.IoScrollPane);
		p.IoPanel.setLastBeans(p.IoTable);
		p.IoScrollPane.setViewportView(p.IoTable);
		p.IoTable.setList(p.getIoL());
		p.IoPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [IoBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIoBtn(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.IoBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.IoBtn_radd.setIcon("INSERT_RECORD");
		p.IoBtn_radd.setFunctionKey(MCFunctionKey.F13);
		p.IoBtnPanel.add(p.IoBtn_radd);
		p.IoBtnPanel.setLastBeans(p.IoBtn_radd);
		p.IoBtn_radd.setNextBeans(p.IoBtn_rdel);
		p.IoBtn_rdel.setIcon("DELETE_RECORD");
		p.IoBtn_rdel.setFunctionKey(MCFunctionKey.F14);
		p.IoBtnPanel.add(p.IoBtn_rdel);
		p.IoBtn_rdel.setNextBeans(p.IoBtn_rcopy);
		p.IoBtn_rcopy.setIcon("COPY_RECORD");
		p.IoBtn_rcopy.setFunctionKey(MCFunctionKey.F23);
		p.IoBtnPanel.add(p.IoBtn_rcopy);
		p.IoBtn_rcopy.setNextBeans(p.IoBtn_upd_dtl);
		p.IoBtn_upd_dtl.setFunctionKey(MCFunctionKey.F7);
		p.IoBtnPanel.add(p.IoBtn_upd_dtl);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_PurcDdlvReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_prnt);
		p.BtnPanel.setLastBeans(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_ins);
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
	protected static void jbInitEastBtn(MSBBP_PurcDdlvReg p) {
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
		MSBBP_PurcDdlvReg_MC.mcInitScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitCnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitHdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitHdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitHdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitList((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitDtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitDtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitDtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitIoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitIo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitIoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.mcInitEastBtn((MSBBP_PurcDdlvReg)this);

		// [INS_SRCH]ステータスのモードの設定
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_ScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_Cnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_HdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_Hdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_Hdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_List((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_DtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_Dtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_DtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_IoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_Io((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_IoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_Btn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS__SRCH_EastBtn((MSBBP_PurcDdlvReg)this);

		// [INS]ステータスのモードの設定
		MSBBP_PurcDdlvReg_MC.statusInitINS_ScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_Cnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_HdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_Hdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_Hdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_List((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_DtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_Dtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_DtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_IoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_Io((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_IoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_Btn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitINS_EastBtn((MSBBP_PurcDdlvReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_ScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_Cnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_HdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_Hdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_Hdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_List((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_DtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_Dtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_DtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_IoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_Io((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_IoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_Btn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__I_EastBtn((MSBBP_PurcDdlvReg)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_ScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_Cnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_HdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_Hdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_Hdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_List((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_DtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_Dtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_DtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_IoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_Io((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_IoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_Btn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitSRCH_EastBtn((MSBBP_PurcDdlvReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_PurcDdlvReg_MC.statusInitUPD_ScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_Cnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_HdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_Hdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_Hdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_List((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_DtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_Dtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_DtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_IoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_Io((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_IoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_Btn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitUPD_EastBtn((MSBBP_PurcDdlvReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_ScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_Cnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_HdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_Hdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_Hdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_List((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_DtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_Dtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_DtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_IoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_Io((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_IoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_Btn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__U_EastBtn((MSBBP_PurcDdlvReg)this);

		// [DEL]ステータスのモードの設定
		MSBBP_PurcDdlvReg_MC.statusInitDEL_ScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_Cnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_HdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_Hdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_Hdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_List((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_DtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_Dtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_DtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_IoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_Io((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_IoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_Btn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitDEL_EastBtn((MSBBP_PurcDdlvReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_ScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_Cnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_HdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_Hdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_Hdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_List((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_DtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_Dtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_DtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_IoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_Io((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_IoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_Btn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitFIX__D_EastBtn((MSBBP_PurcDdlvReg)this);

		// [REF]ステータスのモードの設定
		MSBBP_PurcDdlvReg_MC.statusInitREF_ScreenOpe((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_Cnd((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_HdrTab((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_Hdr((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_Hdr2((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_List((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_DtlInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_Dtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_DtlBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_IoInfo((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_Io((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_IoBtn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_Btn((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.statusInitREF_EastBtn((MSBBP_PurcDdlvReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_PurcDdlvReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_PurcDdlvReg p) {
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
		p.Cnd_purc_schd_dt.setListListener(p);
		p.Cnd_purc_schd_dt.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
		p.Cnd_srch_slip.addAllListener(p);
		p.Cnd_srch_slip.setAPMethodName("doCnd_srch_slip");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBBP_PurcDdlvReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBBP_PurcDdlvReg p) {
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
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_edi_flg.addAllListener(p);
		p.Hdr_sls_act_seq.setListListener(p);
		p.Hdr_sls_act_seq.addAllListener(p);
		p.Hdr_dlv_slip_no.setListListener(p);
		p.Hdr_dlv_slip_no.addAllListener(p);
		p.Hdr_sls_dt.setListListener(p);
		p.Hdr_sls_dt.addAllListener(p);
		p.Hdr_bill_basis_dt.setListListener(p);
		p.Hdr_bill_basis_dt.addAllListener(p);
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
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_dlv_slip_out_flg.addAllListener(p);
		p.Hdr_dlv_slip_prntd_flg.addAllListener(p);
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_base_cur_nm.setListListener(p);
		p.Hdr_base_cur_nm.addAllListener(p);
		p.Hdr_xrate_inpt_flg.addAllListener(p);
		p.Hdr_xrate_cd.setListListener(p);
		p.Hdr_xrate_cd.addAllListener(p);
		p.Hdr_purc_xrate_cd.setListListener(p);
		p.Hdr_purc_xrate_cd.addAllListener(p);
		p.Hdr_ptax_cur_cd.setListListener(p);
		p.Hdr_ptax_cur_cd.addAllListener(p);
		p.Hdr_ptax_cur_nm.setListListener(p);
		p.Hdr_ptax_cur_nm.addAllListener(p);
		p.Hdr_ptax_xrate_inpt_flg.addAllListener(p);
		p.Hdr_qtn_no.setListListener(p);
		p.Hdr_qtn_no.addAllListener(p);
		p.Hdr_qtn_rev.setListListener(p);
		p.Hdr_qtn_rev.addAllListener(p);
		p.Hdr_slo_no.setListListener(p);
		p.Hdr_slo_no.addAllListener(p);
		p.Hdr_cst_po_no.setListListener(p);
		p.Hdr_cst_po_no.addAllListener(p);
		p.Hdr_prof_rate.setListListener(p);
		p.Hdr_prof_rate.addAllListener(p);
		p.Hdr_acst_cd.setListListener(p);
		p.Hdr_acst_cd.addAllListener(p);
		p.Hdr_acst_nm.setListListener(p);
		p.Hdr_acst_nm.addAllListener(p);
		p.Hdr_ar_dpt_cd.setListListener(p);
		p.Hdr_ar_dpt_cd.addAllListener(p);
		p.Hdr_ar_dpt_nm.setListListener(p);
		p.Hdr_ar_dpt_nm.addAllListener(p);
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
		p.Hdr_sls_amt_rnd_typ.setListListener(p);
		p.Hdr_sls_amt_rnd_typ.addAllListener(p);
		p.Hdr_sls_tax_rnd_typ.setListListener(p);
		p.Hdr_sls_tax_rnd_typ.addAllListener(p);
		p.Hdr_trd_cur_amt_dec_place.setListListener(p);
		p.Hdr_trd_cur_amt_dec_place.addAllListener(p);
		p.Hdr_trd_cur_upri_dec_place.setListListener(p);
		p.Hdr_trd_cur_upri_dec_place.addAllListener(p);
		p.Hdr_base_cur_amt_dec_place.setListListener(p);
		p.Hdr_base_cur_amt_dec_place.addAllListener(p);
		p.Hdr_base_cur_upri_dec_place.setListListener(p);
		p.Hdr_base_cur_upri_dec_place.addAllListener(p);
		p.Hdr_ptax_cur_amt_dec_place.setListListener(p);
		p.Hdr_ptax_cur_amt_dec_place.addAllListener(p);
		p.Hdr_ptax_cur_upri_dec_place.setListListener(p);
		p.Hdr_ptax_cur_upri_dec_place.addAllListener(p);
		p.Hdr_xrate_rnd_typ.setListListener(p);
		p.Hdr_xrate_rnd_typ.addAllListener(p);
		p.Hdr_wtax_rnd_typ.setListListener(p);
		p.Hdr_wtax_rnd_typ.addAllListener(p);
		p.Hdr_ar_dpt_typ.setListListener(p);
		p.Hdr_ar_dpt_typ.addAllListener(p);
		p.Hdr_cst_bill_crryovr_times.setListListener(p);
		p.Hdr_cst_bill_crryovr_times.addAllListener(p);
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
	protected static void mcInitHdr2(MSBBP_PurcDdlvReg p) {
	}

	/**
	 *  [List]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitList(MSBBP_PurcDdlvReg p) {
	}

	/**
	 *  [DtlInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlInfo(MSBBP_PurcDdlvReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBBP_PurcDdlvReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_sync_flg.addAllListener(p);
		p.columnDtl_abort_flg.addAllListener(p);
		p.columnDtl_dlv_schd_dt.addAllListener(p);
		p.columnDtl_dlv_schd_dt.setListListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.Dtl_dlv_p_PPanel.columnDlv_bp_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
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
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_sls_dtl_upd_flg.addAllListener(p);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_prof_rate.addAllListener(p);
		p.columnDtl_prof_rate.setListListener(p);
		p.columnDtl_bill_crryovr_times.addAllListener(p);
		p.columnDtl_bill_crryovr_times.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_cst_po_d_no.addAllListener(p);
		p.columnDtl_cst_po_d_no.setListListener(p);
		p.columnDtl_sls_rsn_cd.addAllListener(p);
		p.columnDtl_sls_rsn_cd.setListListener(p);
		p.columnDtl_sls_rsn_nm.addAllListener(p);
		p.columnDtl_sls_rsn_nm.setListListener(p);
		p.columnDtl_bd_dpt_cd.addAllListener(p);
		p.columnDtl_bd_dpt_cd.setListListener(p);
		p.columnDtl_bd_dpt_nm.addAllListener(p);
		p.columnDtl_bd_dpt_nm.setListListener(p);
		p.columnDtl_wtax_rate.addAllListener(p);
		p.columnDtl_wtax_rate.setListListener(p);
		p.columnDtl_ext_sys_cd.addAllListener(p);
		p.columnDtl_ext_sys_cd.setListListener(p);
		p.columnDtl_ext_sys_nm.addAllListener(p);
		p.columnDtl_ext_sys_nm.setListListener(p);
		p.columnDtl_ext_purc_act_d_no.addAllListener(p);
		p.columnDtl_ext_purc_act_d_no.setListListener(p);
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
		p.columnDtl_sls_act_d_no.addAllListener(p);
		p.columnDtl_sls_act_d_no.setListListener(p);
		p.columnDtl_purc_ac_ym.addAllListener(p);
		p.columnDtl_purc_ac_ym.setListListener(p);
		p.columnDtl_purc_ac_dt.addAllListener(p);
		p.columnDtl_purc_ac_dt.setListListener(p);
		p.columnDtl_purc_dt.addAllListener(p);
		p.columnDtl_purc_dt.setListListener(p);
		p.columnDtl_purc_act_no.addAllListener(p);
		p.columnDtl_purc_act_no.setListListener(p);
		p.columnDtl_purc_act_d_no.addAllListener(p);
		p.columnDtl_purc_act_d_no.setListListener(p);
		p.columnDtl_po_no.addAllListener(p);
		p.columnDtl_po_no.setListListener(p);
		p.columnDtl_po_d_no.addAllListener(p);
		p.columnDtl_po_d_no.setListListener(p);
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_sppl_nm.addAllListener(p);
		p.columnDtl_sppl_nm.setListListener(p);
		p.columnDtl_sppl_iv_flg.addAllListener(p);
		p.columnDtl_subcon_flg.addAllListener(p);
		p.columnDtl_maker_cd.addAllListener(p);
		p.columnDtl_maker_cd.setListListener(p);
		p.columnDtl_maker_nm.addAllListener(p);
		p.columnDtl_maker_nm.setListListener(p);
		p.columnDtl_bp_dlv_slip_no.addAllListener(p);
		p.columnDtl_bp_dlv_slip_no.setListListener(p);
		p.columnDtl_bp_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_bp_dlv_slip_d_no.setListListener(p);
		p.columnDtl_bp_lot_no.addAllListener(p);
		p.columnDtl_bp_lot_no.setListListener(p);
		p.columnDtl_ship_fr_valid_dt.addAllListener(p);
		p.columnDtl_ship_fr_valid_dt.setListListener(p);
		p.columnDtl_purc_trd_cur_cd.addAllListener(p);
		p.columnDtl_purc_trd_cur_cd.setListListener(p);
		p.columnDtl_purc_trd_cur_nm.addAllListener(p);
		p.columnDtl_purc_trd_cur_nm.setListListener(p);
		p.columnDtl_purc_xrate_inpt_flg.addAllListener(p);
		p.columnDtl_purc_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnDtl_purc_dtl_upd_flg.addAllListener(p);
		p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_ptax_dt.addAllListener(p);
		p.columnDtl_ptax_dt.setListListener(p);
		p.columnDtl_purc_rsn_cd.addAllListener(p);
		p.columnDtl_purc_rsn_cd.setListListener(p);
		p.columnDtl_purc_rsn_nm.addAllListener(p);
		p.columnDtl_purc_rsn_nm.setListListener(p);
		p.columnDtl_purc_bd_dpt_cd.addAllListener(p);
		p.columnDtl_purc_bd_dpt_cd.setListListener(p);
		p.columnDtl_purc_bd_dpt_nm.addAllListener(p);
		p.columnDtl_purc_bd_dpt_nm.setListListener(p);
		p.columnDtl_purc_wtax_rate.addAllListener(p);
		p.columnDtl_purc_wtax_rate.setListListener(p);
		p.columnDtl_purc_wtax_amt.addAllListener(p);
		p.columnDtl_purc_wtax_amt.setListListener(p);
		p.columnDtl_base_unit_purc_schd_qty.addAllListener(p);
		p.columnDtl_base_unit_purc_schd_qty.setListListener(p);
		p.columnDtl_po_print_rmrks.addAllListener(p);
		p.columnDtl_po_print_rmrks.setListListener(p);
		p.columnDtl_po_print_d_rmrks.addAllListener(p);
		p.columnDtl_po_print_d_rmrks.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.columnDtl_lot_no_typ.addAllListener(p);
		p.columnDtl_lot_no_typ.setListListener(p);
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
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_itm_bill_crryovr_times.addAllListener(p);
		p.columnDtl_itm_bill_crryovr_times.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_cont_fctr_flg.addAllListener(p);
		p.columnDtl_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.setListListener(p);
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
		p.columnDtl_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl_sls_acxfr_flg.addAllListener(p);
		p.columnDtl_xpns_purc_flg.addAllListener(p);
		p.columnDtl_sls_act_no.addAllListener(p);
		p.columnDtl_sls_act_no.setListListener(p);
		p.columnDtl_sls_act_seq.addAllListener(p);
		p.columnDtl_sls_act_seq.setListListener(p);
		p.columnDtl_sls_act_d_seq.addAllListener(p);
		p.columnDtl_sls_act_d_seq.setListListener(p);
		p.columnDtl_sls_schd_no.addAllListener(p);
		p.columnDtl_sls_schd_no.setListListener(p);
		p.columnDtl_purc_schd_no.addAllListener(p);
		p.columnDtl_purc_schd_no.setListListener(p);
		p.columnDtl_dtl_row_id.addAllListener(p);
		p.columnDtl_dtl_row_id.setListListener(p);
		p.columnDtl_arr_pr_no.addAllListener(p);
		p.columnDtl_arr_pr_no.setListListener(p);
		p.columnDtl_ship_pr_no.addAllListener(p);
		p.columnDtl_ship_pr_no.setListListener(p);
		p.columnDtl_schd_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_schd_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_schd_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_schd_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_purc_amt_rnd_typ.addAllListener(p);
		p.columnDtl_purc_amt_rnd_typ.setListListener(p);
		p.columnDtl_purc_upri_rnd_typ.addAllListener(p);
		p.columnDtl_purc_upri_rnd_typ.setListListener(p);
		p.columnDtl_purc_tax_rnd_typ.addAllListener(p);
		p.columnDtl_purc_tax_rnd_typ.setListListener(p);
		p.columnDtl_purc_trd_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_purc_trd_cur_amt_dec_place.setListListener(p);
		p.columnDtl_purc_trd_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_purc_trd_cur_upri_dec_place.setListListener(p);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_purc_s_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_purc_s_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_purc_trd_unit_cd.addAllListener(p);
		p.columnDtl_purc_trd_unit_cd.setListListener(p);
		p.columnDtl_purc_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_purc_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_purc_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_purc_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_purc_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_purc_trd_unit_dec_place.setListListener(p);
		p.columnDtl_xrate_purc_dt.addAllListener(p);
		p.columnDtl_xrate_purc_dt.setListListener(p);
		p.columnDtl_base_unit_qty_bef.addAllListener(p);
		p.columnDtl_base_unit_qty_bef.setListListener(p);
		p.columnDtl_base_unit_purc_qty.addAllListener(p);
		p.columnDtl_base_unit_purc_qty.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MSBBP_PurcDdlvReg p) {
		p.DtlBtn_radd_noschd.addAllListener(p);
		p.DtlBtn_radd_noschd.setAPMethodName("doDtlBtn_radd_noschd");
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
	}

	/**
	 *  [IoInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIoInfo(MSBBP_PurcDdlvReg p) {
	}

	/**
	 *  [Io]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIo(MSBBP_PurcDdlvReg p) {
		p.IoTable.addAllListener(p);
		p.columnIo_trd_unit_cd.addAllListener(p);
		p.columnIo_trd_unit_cd.setListListener(p);
		p.columnIo_trd_unit_nm.addAllListener(p);
		p.columnIo_trd_unit_nm.setListListener(p);
		p.columnIo_base_unit_cd.addAllListener(p);
		p.columnIo_base_unit_cd.setListListener(p);
		p.columnIo_base_unit_nm.addAllListener(p);
		p.columnIo_base_unit_nm.setListListener(p);
		p.columnIo_gd_cd.addAllListener(p);
		p.columnIo_gd_cd.setListListener(p);
		p.columnIo_gd_nm.addAllListener(p);
		p.columnIo_gd_nm.setListListener(p);
		p.columnIo_bp_dlv_slip_no.addAllListener(p);
		p.columnIo_bp_dlv_slip_no.setListListener(p);
		p.columnIo_bp_dlv_slip_d_no.addAllListener(p);
		p.columnIo_bp_dlv_slip_d_no.setListListener(p);
		p.columnIo_bp_lot_no.addAllListener(p);
		p.columnIo_bp_lot_no.setListListener(p);
		p.columnIo_ship_fr_valid_dt.addAllListener(p);
		p.columnIo_ship_fr_valid_dt.setListListener(p);
		p.columnIo_purc_act_io_no.addAllListener(p);
		p.columnIo_purc_act_io_no.setListListener(p);
		p.columnIo_sls_act_io_no.addAllListener(p);
		p.columnIo_sls_act_io_no.setListListener(p);
		p.columnIo_sub_char1.addAllListener(p);
		p.columnIo_sub_char1.setListListener(p);
		p.columnIo_sub_char2.addAllListener(p);
		p.columnIo_sub_char2.setListListener(p);
		p.columnIo_sub_char3.addAllListener(p);
		p.columnIo_sub_char3.setListListener(p);
		p.columnIo_trd_unit_dec_place.addAllListener(p);
		p.columnIo_trd_unit_dec_place.setListListener(p);
		p.columnIo_trd_unit_conv_base_qty.addAllListener(p);
		p.columnIo_trd_unit_conv_base_qty.setListListener(p);
		p.columnIo_trd_unit_conv_qty.addAllListener(p);
		p.columnIo_trd_unit_conv_qty.setListListener(p);
		p.columnIo_trd_unit_rnd_typ.addAllListener(p);
		p.columnIo_trd_unit_rnd_typ.setListListener(p);
		p.columnIo_itm_cd.addAllListener(p);
		p.columnIo_itm_cd.setListListener(p);
		p.columnIo_itm_sub1.addAllListener(p);
		p.columnIo_itm_sub1.setListListener(p);
		p.columnIo_itm_sub2.addAllListener(p);
		p.columnIo_itm_sub2.setListListener(p);
		p.columnIo_itm_sub3.addAllListener(p);
		p.columnIo_itm_sub3.setListListener(p);
		p.columnIo_lot_mng_typ.addAllListener(p);
		p.columnIo_lot_mng_typ.setListListener(p);
		p.columnIo_sublot_mng_typ.addAllListener(p);
		p.columnIo_sublot_mng_typ.setListListener(p);
		p.columnIo_lot_no_typ.addAllListener(p);
		p.columnIo_lot_no_typ.setListListener(p);
		p.columnIo_sublot_no_typ.addAllListener(p);
		p.columnIo_sublot_no_typ.setListListener(p);
		p.columnIo_sno1_mng_typ.addAllListener(p);
		p.columnIo_sno1_mng_typ.setListListener(p);
		p.columnIo_sno2_mng_typ.addAllListener(p);
		p.columnIo_sno2_mng_typ.setListListener(p);
		p.columnIo_sno3_mng_typ.addAllListener(p);
		p.columnIo_sno3_mng_typ.setListListener(p);
		p.columnIo_sno4_mng_typ.addAllListener(p);
		p.columnIo_sno4_mng_typ.setListListener(p);
		p.columnIo_stk_mng_typ.addAllListener(p);
		p.columnIo_stk_mng_typ.setListListener(p);
		p.columnIo_base_unit_dec_place.addAllListener(p);
		p.columnIo_base_unit_dec_place.setListListener(p);
		p.columnIo_base_unit_rnd_typ.addAllListener(p);
		p.columnIo_base_unit_rnd_typ.setListListener(p);
		p.columnIo_cont_fctr_flg.addAllListener(p);
		p.columnIo_cont_fctr_rnd_typ.addAllListener(p);
		p.columnIo_cont_fctr_rnd_typ.setListListener(p);
		p.columnIo_cont_fctr_dec_place.addAllListener(p);
		p.columnIo_cont_fctr_dec_place.setListListener(p);
		p.columnIo_ver_flg.addAllListener(p);
		p.columnIo_sls_act_io_seq.addAllListener(p);
		p.columnIo_sls_act_io_seq.setListListener(p);
		p.columnIo_purc_act_io_seq.addAllListener(p);
		p.columnIo_purc_act_io_seq.setListListener(p);
		p.columnIo_dtl_row_id.addAllListener(p);
		p.columnIo_dtl_row_id.setListListener(p);
	}

	/**
	 *  [IoBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIoBtn(MSBBP_PurcDdlvReg p) {
		p.IoBtn_radd.addAllListener(p);
		p.IoBtn_radd.setAPMethodName("doIoBtn_radd");
		p.IoBtn_rdel.addAllListener(p);
		p.IoBtn_rdel.setAPMethodName("doIoBtn_rdel");
		p.IoBtn_rcopy.addAllListener(p);
		p.IoBtn_rcopy.setAPMethodName("doIoBtn_rcopy");
		p.IoBtn_upd_dtl.addAllListener(p);
		p.IoBtn_upd_dtl.setAPMethodName("doIoBtn_upd_dtl");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_PurcDdlvReg p) {
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
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
	protected static void mcInitEastBtn(MSBBP_PurcDdlvReg p) {
	}

	/**
	 * [INS_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_ScreenOpe(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Cnd(MSBBP_PurcDdlvReg p){
		p.Cnd_ope_Group.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Cnd_srch_slip.putMode(p, INS_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_HdrTab(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Hdr(MSBBP_PurcDdlvReg p){
		p.Hdr_trd_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_dlv_tm_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_out_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prntd_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.Amt_amt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_xrate_inpt_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_xrate_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_slo_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_not_cost_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_amt_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [INS_SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Hdr2(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_List(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[DtlInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_DtlInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Dtl(MSBBP_PurcDdlvReg p){
		p.columnDtl_sync_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_schd_dt.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_schd_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_dtl_upd_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_ym.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_subcon_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_valid_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_trd_cur_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_trd_cur_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_xrate_inpt_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_purc_xrate_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_ptax_xrate_inpt_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_xrate_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_purc_trd_upri_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_purc_base_cur_upri_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_base_cur_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_wtax_rate.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_wtax_amt.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_purc_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_purc_schd_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_po_print_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_act_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_schd_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dtl_row_id.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_arr_pr_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_base_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_amt_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_upri_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_purc_trd_unit_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_base_unit_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_base_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_xrate_purc_dt.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_purc_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_DtlBtn(MSBBP_PurcDdlvReg p){
		p.DtlBtn_radd_noschd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.DtlBtn_radd.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.DtlBtn_menu_move_p_PPanel.putStatus(INS_SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [INS_SRCH]ステータスの[IoInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_IoInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Io]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Io(MSBBP_PurcDdlvReg p){
		p.columnIo_trd_unit_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_trd_unit_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Io_trd_unit_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_base_unit_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_base_unit_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Io_base_unit_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_purc_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_sls_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_gd_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_gd_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Io_lot_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnIo_bp_lot_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_ship_fr_valid_dt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Io_ver_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Io_purc_base_unit_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Io_purc_cont_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_sls_act_io_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_sub_char1.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_sub_char2.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_sub_char3.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnIo_trd_unit_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_base_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_trd_unit_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_itm_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_itm_sub1.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_itm_sub2.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_itm_sub3.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_lot_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_sublot_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_lot_no_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_sublot_no_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_sno1_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_sno2_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_sno3_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_sno4_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_stk_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_base_unit_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_base_unit_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_ver_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_sls_act_io_seq.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_seq.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnIo_dtl_row_id.putMode(p, INS_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH]ステータスの[IoBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_IoBtn(MSBBP_PurcDdlvReg p){
		p.IoBtn_radd.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.IoBtn_rdel.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.IoBtn_rcopy.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.IoBtn_upd_dtl.putMode(p, INS_SRCH, MCMode.DISABLE);

	}

	/**
	 * [INS_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Btn(MSBBP_PurcDdlvReg p){
		p.Btn_prnt.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, INS_SRCH, MCMode.DISABLE);

	}

	/**
	 * [INS_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_EastBtn(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBBP_PurcDdlvReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch_slip.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBBP_PurcDdlvReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_dlv_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_dlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_out_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_dlv_slip_prntd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.Amt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_qtn_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_prof_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_not_cost_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ar_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
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
		p.Hdr_sls_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);
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
	protected static void statusInitINS_Hdr2(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitINS_List(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS]ステータスの[DtlInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBBP_PurcDdlvReg p){
		p.columnDtl_sync_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_dlv_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_asset_mng_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.REQUIRED);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_dtl_upd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_cost_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_cost_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_gd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sls_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sls_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sls_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_subcon_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.columnDtl_bp_lot_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_ship_fr_valid_dt.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.ENABLE);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.ENABLE);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.ENABLE);
		p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.ENABLE);
		p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.ENABLE);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.ENABLE);
		p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_trd_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_purc_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnDtl_purc_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_purc_trd_upri_amt_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_purc_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_purc_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_purc_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_wtax_rate.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_wtax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_purc_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_purc_schd_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_po_print_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sls_act_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sls_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dtl_row_id.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_arr_pr_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_purc_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_xrate_purc_dt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_purc_qty.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlBtn(MSBBP_PurcDdlvReg p){
		p.DtlBtn_radd_noschd.putMode(p, INS, MCMode.INVISIBLE);
		p.DtlBtn_radd.putMode(p, INS, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.DtlBtn_menu_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);

	}

	/**
	 * [INS]ステータスの[IoInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS_IoInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [INS]ステータスの[Io]ブロックのモードの設定
	 */
	protected static void statusInitINS_Io(MSBBP_PurcDdlvReg p){
		p.columnIo_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnIo_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Io_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnIo_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnIo_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Io_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_purc_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_sls_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_gd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnIo_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_no.putMode(p, INS, MCMode.ENABLE);
		p.columnIo_bp_dlv_slip_d_no.putMode(p, INS, MCMode.ENABLE);
		p.Io_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.columnIo_bp_lot_no.putMode(p, INS, MCMode.ENABLE);
		p.columnIo_ship_fr_valid_dt.putMode(p, INS, MCMode.ENABLE);
		p.Io_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.Io_purc_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Io_purc_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.ENABLE);
		p.Io_purc_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.ENABLE);
		p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, INS, MCMode.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.ENABLE);
		p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.ENABLE);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.ENABLE);
		p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, INS, MCMode.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnIo_sls_act_io_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnIo_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnIo_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnIo_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnIo_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_itm_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_itm_sub1.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_itm_sub2.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_itm_sub3.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_sls_act_io_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnIo_dtl_row_id.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[IoBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_IoBtn(MSBBP_PurcDdlvReg p){
		p.IoBtn_radd.putMode(p, INS, MCMode.ENABLE);
		p.IoBtn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.IoBtn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.IoBtn_upd_dtl.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBBP_PurcDdlvReg p){
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBBP_PurcDdlvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_srch_slip.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBBP_PurcDdlvReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_dlv_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_out_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prntd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.Amt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_not_cost_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.Hdr_sls_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xrate_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);
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
	protected static void statusInitFIX__I_Hdr2(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_I]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_List(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_I]ステータスの[DtlInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBBP_PurcDdlvReg p){
		p.columnDtl_sync_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_dtl_upd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_subcon_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_valid_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_purc_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_ptax_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_purc_trd_upri_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_purc_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_wtax_rate.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_wtax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_purc_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_purc_schd_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_po_print_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sls_act_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sls_schd_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dtl_row_id.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_arr_pr_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_purc_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_xrate_purc_dt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_purc_qty.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlBtn(MSBBP_PurcDdlvReg p){
		p.DtlBtn_radd_noschd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.DtlBtn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.DtlBtn_menu_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[IoInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_IoInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Io]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Io(MSBBP_PurcDdlvReg p){
		p.columnIo_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Io_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Io_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_purc_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_sls_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Io_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnIo_bp_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_ship_fr_valid_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Io_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Io_purc_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Io_purc_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_sls_act_io_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnIo_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_itm_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_itm_sub1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_itm_sub2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_itm_sub3.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_sls_act_io_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnIo_dtl_row_id.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[IoBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_IoBtn(MSBBP_PurcDdlvReg p){
		p.IoBtn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.IoBtn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.IoBtn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.IoBtn_upd_dtl.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBBP_PurcDdlvReg p){
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_PurcDdlvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_slip.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBBP_PurcDdlvReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_dlv_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_out_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prntd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.Amt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_not_cost_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Hdr_sls_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH_Hdr2(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [SRCH]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_List(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBBP_PurcDdlvReg p){
		p.columnDtl_sync_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_schd_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_dtl_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_subcon_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_valid_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_purc_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_purc_trd_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_purc_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_wtax_rate.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_wtax_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_purc_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_purc_schd_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_po_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_act_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dtl_row_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_arr_pr_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_purc_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_xrate_purc_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_purc_qty.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlBtn(MSBBP_PurcDdlvReg p){
		p.DtlBtn_radd_noschd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.DtlBtn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[IoInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_IoInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [SRCH]ステータスの[Io]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Io(MSBBP_PurcDdlvReg p){
		p.columnIo_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Io_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Io_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_purc_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_sls_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Io_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnIo_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_ship_fr_valid_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Io_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Io_purc_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Io_purc_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_sls_act_io_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnIo_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_itm_sub1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_itm_sub2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_itm_sub3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_sls_act_io_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnIo_dtl_row_id.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[IoBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_IoBtn(MSBBP_PurcDdlvReg p){
		p.IoBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.IoBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.IoBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.IoBtn_upd_dtl.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBBP_PurcDdlvReg p){
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_PurcDdlvReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_slip.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBBP_PurcDdlvReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_dlv_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_bill_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_dlv_slip_prntd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.Amt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_qtn_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_prof_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_not_cost_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ar_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.Hdr_sls_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xrate_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);
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
	protected static void statusInitUPD_Hdr2(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [UPD]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitUPD_List(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [UPD]ステータスの[DtlInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBBP_PurcDdlvReg p){
		p.columnDtl_sync_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dlv_schd_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.REQUIRED);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_dtl_upd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_cost_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_cost_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_subcon_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.columnDtl_bp_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_fr_valid_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.ENABLE);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.ENABLE);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.ENABLE);
		p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.ENABLE);
		p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.ENABLE);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.ENABLE);
		p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_purc_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnDtl_purc_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_purc_trd_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_purc_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_wtax_rate.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_wtax_amt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_purc_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_purc_schd_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_po_print_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dtl_row_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_arr_pr_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_purc_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_purc_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_purc_qty.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MSBBP_PurcDdlvReg p){
		p.DtlBtn_radd_noschd.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);

	}

	/**
	 * [UPD]ステータスの[IoInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD_IoInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [UPD]ステータスの[Io]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Io(MSBBP_PurcDdlvReg p){
		p.columnIo_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnIo_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Io_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnIo_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnIo_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Io_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_purc_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_sls_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnIo_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnIo_bp_dlv_slip_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Io_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.columnIo_bp_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnIo_ship_fr_valid_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Io_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.Io_purc_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Io_purc_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.ENABLE);
		p.Io_purc_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.ENABLE);
		p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.ENABLE);
		p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.ENABLE);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.ENABLE);
		p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnIo_sls_act_io_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnIo_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnIo_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnIo_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnIo_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_itm_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_itm_sub1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_itm_sub2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_itm_sub3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_sls_act_io_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnIo_dtl_row_id.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[IoBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_IoBtn(MSBBP_PurcDdlvReg p){
		p.IoBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.IoBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.IoBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.IoBtn_upd_dtl.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_PurcDdlvReg p){
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_PurcDdlvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_slip.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBBP_PurcDdlvReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_dlv_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_out_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prntd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.Amt_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_not_cost_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Hdr_sls_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xrate_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);
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
	protected static void statusInitFIX__U_Hdr2(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_U]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_List(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_U]ステータスの[DtlInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBBP_PurcDdlvReg p){
		p.columnDtl_sync_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_schd_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_dtl_upd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_subcon_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_valid_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_purc_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_ptax_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_purc_trd_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_purc_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_wtax_rate.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_wtax_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_purc_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_purc_schd_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_po_print_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dtl_row_id.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_arr_pr_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_purc_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_xrate_purc_dt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_purc_qty.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlBtn(MSBBP_PurcDdlvReg p){
		p.DtlBtn_radd_noschd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DtlBtn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[IoInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_IoInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Io]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Io(MSBBP_PurcDdlvReg p){
		p.columnIo_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Io_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Io_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_purc_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_sls_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Io_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnIo_bp_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_ship_fr_valid_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Io_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Io_purc_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Io_purc_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_sls_act_io_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnIo_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_itm_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_itm_sub1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_itm_sub2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_itm_sub3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_sls_act_io_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnIo_dtl_row_id.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[IoBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_IoBtn(MSBBP_PurcDdlvReg p){
		p.IoBtn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.IoBtn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.IoBtn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.IoBtn_upd_dtl.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBBP_PurcDdlvReg p){
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBBP_PurcDdlvReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_slip.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBBP_PurcDdlvReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_dlv_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_out_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Hdr_dlv_slip_prntd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.Amt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_not_cost_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Hdr_sls_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xrate_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);
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
	protected static void statusInitDEL_Hdr2(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [DEL]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitDEL_List(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [DEL]ステータスの[DtlInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBBP_PurcDdlvReg p){
		p.columnDtl_sync_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_schd_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_dtl_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_subcon_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_valid_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_purc_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_purc_trd_upri_amt_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_purc_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_wtax_rate.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_wtax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_purc_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_purc_schd_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_po_print_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sls_act_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sls_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dtl_row_id.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_arr_pr_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_purc_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_xrate_purc_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_purc_qty.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MSBBP_PurcDdlvReg p){
		p.DtlBtn_radd_noschd.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [DEL]ステータスの[IoInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL_IoInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [DEL]ステータスの[Io]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Io(MSBBP_PurcDdlvReg p){
		p.columnIo_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Io_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Io_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_purc_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_sls_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Io_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnIo_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_ship_fr_valid_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Io_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Io_purc_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Io_purc_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_sls_act_io_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnIo_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_itm_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_itm_sub1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_itm_sub2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_itm_sub3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_sls_act_io_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnIo_dtl_row_id.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[IoBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_IoBtn(MSBBP_PurcDdlvReg p){
		p.IoBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.IoBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.IoBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.IoBtn_upd_dtl.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBBP_PurcDdlvReg p){
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBBP_PurcDdlvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_slip.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBBP_PurcDdlvReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_dlv_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_out_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prntd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.Amt_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_not_cost_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.Hdr_sls_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xrate_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);
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
	protected static void statusInitFIX__D_Hdr2(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_D]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_List(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_D]ステータスの[DtlInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBBP_PurcDdlvReg p){
		p.columnDtl_sync_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_schd_dt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_schd_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_dtl_upd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_subcon_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_valid_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_purc_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_ptax_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_purc_trd_upri_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_purc_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_wtax_rate.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_wtax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_purc_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_purc_schd_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_po_print_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sls_act_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sls_schd_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dtl_row_id.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_arr_pr_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_purc_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_xrate_purc_dt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_purc_qty.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlBtn(MSBBP_PurcDdlvReg p){
		p.DtlBtn_radd_noschd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.DtlBtn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[IoInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_IoInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Io]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Io(MSBBP_PurcDdlvReg p){
		p.columnIo_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Io_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Io_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_purc_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_sls_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Io_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnIo_bp_lot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_ship_fr_valid_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Io_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Io_purc_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Io_purc_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_sls_act_io_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnIo_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_itm_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_itm_sub1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_itm_sub2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_itm_sub3.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_sls_act_io_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnIo_dtl_row_id.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[IoBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_IoBtn(MSBBP_PurcDdlvReg p){
		p.IoBtn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.IoBtn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.IoBtn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.IoBtn_upd_dtl.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBBP_PurcDdlvReg p){
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_PurcDdlvReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_purc_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_slip.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBBP_PurcDdlvReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_dlv_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0210.MAUBP_Dlv_H.READ_ONLY);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_p_PPanel.Dlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_out_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prntd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cred_bal_amt_p_PPanel.Amt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_qtn_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_qtn_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_prof_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ttl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ttl_amt_not_cost_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_acst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_acst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Hdr_sls_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sls_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xrate_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_bill_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);
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
	protected static void statusInitREF_Hdr2(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [REF]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitREF_List(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [REF]ステータスの[DtlInfo]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBBP_PurcDdlvReg p){
		p.columnDtl_sync_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_schd_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_sls_dtl_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_upri_amt_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_cost_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_cost_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_prof_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_purc_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_subcon_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_valid_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_purc_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_purc_trd_upri_amt_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_purc_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_purc_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_wtax_rate.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_wtax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_purc_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_purc_schd_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_po_print_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_bill_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_acxfr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_act_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dtl_row_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_arr_pr_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_schd_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_s_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_purc_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xrate_purc_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_purc_qty.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MSBBP_PurcDdlvReg p){
		p.DtlBtn_radd_noschd.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [REF]ステータスの[IoInfo]ブロックのモードの設定
	 */
	protected static void statusInitREF_IoInfo(MSBBP_PurcDdlvReg p){

	}

	/**
	 * [REF]ステータスの[Io]ブロックのモードの設定
	 */
	protected static void statusInitREF_Io(MSBBP_PurcDdlvReg p){
		p.columnIo_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Io_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Io_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_purc_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Io_sls_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnIo_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_bp_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Io_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.columnIo_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_ship_fr_valid_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Io_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Io_purc_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Io_purc_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Io_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr.putMode(p, REF, MCMode.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Io_std_cont_qty_p_PPanel.columnContQty_cont_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Io_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Io_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr.putMode(p, REF, MCMode.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Io_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_sls_act_io_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnIo_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_itm_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_itm_sub1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_itm_sub2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_itm_sub3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_sls_act_io_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_purc_act_io_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnIo_dtl_row_id.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[IoBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_IoBtn(MSBBP_PurcDdlvReg p){
		p.IoBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.IoBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.IoBtn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.IoBtn_upd_dtl.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBBP_PurcDdlvReg p){
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBBP_PurcDdlvReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS_SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_PurcDdlvReg_MC.setTableConfigDtl((MSBBP_PurcDdlvReg)this);
		MSBBP_PurcDdlvReg_MC.setTableConfigIo((MSBBP_PurcDdlvReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBBP_PurcDdlvReg p) {
		p.columnDtl_sync_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sync_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sync_flg);
		p.columnDtl_abort_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.abort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_abort_flg);
		p.columnDtl_dlv_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.dlv_schd_dt_META);
		p.columnDtl_dlv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_schd_dt);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_stk_mng_typ, p.columnDtl_dscnt_itm_flg, p.columnDtl_lot_no_typ, p.columnDtl_sublot_no_typ, p.columnDtl_trd_unit_cd, p.columnDtl_itm_bill_crryovr_times);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_stk_mng_typ, p.columnDtl_dscnt_itm_flg, p.columnDtl_lot_no_typ, p.columnDtl_sublot_no_typ, p.columnDtl_trd_unit_cd, p.columnDtl_itm_bill_crryovr_times);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_stk_mng_typ, p.columnDtl_dscnt_itm_flg, p.columnDtl_lot_no_typ, p.columnDtl_sublot_no_typ, p.columnDtl_trd_unit_cd, p.columnDtl_itm_bill_crryovr_times);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_stk_mng_typ, p.columnDtl_dscnt_itm_flg, p.columnDtl_lot_no_typ, p.columnDtl_sublot_no_typ, p.columnDtl_trd_unit_cd, p.columnDtl_itm_bill_crryovr_times);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.cst_itm_cd_META);
		p.columnDtl_cst_itm_cd.addLinkBeans(p.columnDtl_cst_itm_nm,p.columnDtl_itm_cd,p.columnDtl_itm_sub1,p.columnDtl_itm_sub2,p.columnDtl_itm_sub3);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.DtlTable.addTable(p.Dtl_dlv_p_PPanel.DlvTable);
		p.Dtl_dlv_p_PPanel.columnDlv_bp_cd.setLinkBeans(p.columnDtl_dlv_nm, p.columnDtl_dlv_sundry_flg, p.columnDtl_pri_prnt_flg, p.columnDtl_dlv_zip_cd, p.columnDtl_dlv_addr1, p.columnDtl_dlv_addr2, p.columnDtl_dlv_addr3, p.columnDtl_dlv_addr4, p.columnDtl_cntry_cd, p.columnDtl_cntry_nm, p.columnDtl_dlv_tel, p.columnDtl_dlv_fax, p.columnDtl_dlv_cntct_dpt, p.columnDtl_dlv_cntct_psn);
		p.columnDtl_dest_cd1.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.dest_cd1_META);
		p.columnDtl_dest_cd1.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd1.addLinkBeans(p.columnDtl_dest_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd1);
		p.columnDtl_dest_nm1.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.dest_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm1);
		p.columnDtl_dest_cd2.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.dest_cd2_META);
		p.columnDtl_dest_cd2.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd2.addLinkBeans(p.columnDtl_dest_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd2);
		p.columnDtl_dest_nm2.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.dest_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm2);
		p.columnDtl_dest_cd3.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.dest_cd3_META);
		p.columnDtl_dest_cd3.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd3.addLinkBeans(p.columnDtl_dest_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd3);
		p.columnDtl_dest_nm3.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.dest_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm3);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_conv_qty,p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_sls_schd_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_sls_qty_p_PPanel.QtyTable);
		p.columnDtl_sls_dtl_upd_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sls_dtl_upd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_dtl_upd_flg);
		p.DtlTable.addTable(p.Dtl_trd_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_rate, p.columnDtl_inc_tax_flg, p.columnDtl_tax_typ);
		p.Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setLinkBeans(p.columnDtl_dscnt_rsn_nm);
		p.DtlTable.addTable(p.Dtl_cost_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_cost_amt_p_PPanel.AmtTable);
		p.columnDtl_prof_rate.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.prof_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prof_rate);
		p.DtlTable.addTable(p.Dtl_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnDtl_bill_crryovr_times.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.bill_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_crryovr_times);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.gd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.columnDtl_cst_po_d_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.cst_po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_d_no);
		p.columnDtl_sls_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sls_rsn_cd_META);
		p.columnDtl_sls_rsn_cd.addLinkBeans(p.columnDtl_sls_rsn_nm,p.columnDtl_sls_acxfr_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_rsn_cd);
		p.columnDtl_sls_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sls_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_rsn_nm);
		p.columnDtl_bd_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.bd_dpt_cd_META);
		p.columnDtl_bd_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_bd_dpt_cd.addLinkBeans(p.columnDtl_bd_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_cd);
		p.columnDtl_bd_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.bd_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_nm);
		p.columnDtl_wtax_rate.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rate);
		p.DtlTable.addTable(p.Dtl_wtax_amt_p_PPanel.AmtTable);
		p.columnDtl_ext_sys_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.ext_sys_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_cd);
		p.columnDtl_ext_sys_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.ext_sys_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_nm);
		p.columnDtl_ext_purc_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.ext_purc_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_purc_act_d_no);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_sls_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sls_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_d_no);
		p.columnDtl_purc_ac_ym.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_ac_ym_META);
		p.columnDtl_purc_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ac_ym);
		p.columnDtl_purc_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_ac_dt_META);
		p.columnDtl_purc_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ac_dt);
		p.columnDtl_purc_dt.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_dt_META);
		p.columnDtl_purc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dt);
		p.columnDtl_purc_act_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_no);
		p.columnDtl_purc_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_d_no);
		p.columnDtl_po_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no);
		p.columnDtl_po_d_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_d_no);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_sppl_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_nm);
		p.columnDtl_sppl_iv_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sppl_iv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_iv_flg);
		p.columnDtl_subcon_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.subcon_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_subcon_flg);
		p.columnDtl_maker_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.maker_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_cd);
		p.columnDtl_maker_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.maker_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_nm);
		p.columnDtl_bp_dlv_slip_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.bp_dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_dlv_slip_no);
		p.columnDtl_bp_dlv_slip_d_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.bp_dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_dlv_slip_d_no);
		p.DtlTable.addTable(p.Dtl_lot_no_p_PPanel.LotNoTable);
		p.columnDtl_bp_lot_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.bp_lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_lot_no);
		p.columnDtl_ship_fr_valid_dt.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.ship_fr_valid_dt_META);
		p.columnDtl_ship_fr_valid_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_fr_valid_dt);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.DtlTable.addTable(p.Dtl_purc_cont_qty_p_PPanel.PurcContQtyTable);
		p.DtlTable.addTable(p.Dtl_purc_cont_fctr_p_PPanel.PurcContFctrTable);
		p.DtlTable.addTable(p.Dtl_std_cont_qty_p_PPanel.ContQtyTable);
		p.DtlTable.addTable(p.Dtl_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.DtlTable.addTable(p.Dtl_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_purc_trd_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_trd_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_trd_cur_cd);
		p.columnDtl_purc_trd_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_trd_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_trd_cur_nm);
		p.columnDtl_purc_xrate_inpt_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_xrate_inpt_flg);
		p.DtlTable.addTable(p.Dtl_purc_xrate_p_PPanel.XrateTable);
		p.columnDtl_purc_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_ptax_xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ptax_xrate_inpt_flg);
		p.DtlTable.addTable(p.Dtl_purc_ptax_xrate_p_PPanel.XrateTable);
		p.columnDtl_purc_dtl_upd_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_dtl_upd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dtl_upd_flg);
		p.DtlTable.addTable(p.Dtl_purc_trd_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_purc_tax_nm, p.columnDtl_purc_tax_rate, p.columnDtl_purc_inc_tax_flg, p.columnDtl_purc_tax_typ);
		p.Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setLinkBeans(p.columnDtl_purc_dscnt_rsn_nm);
		p.DtlTable.addTable(p.Dtl_purc_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_purc_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_purc_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_purc_base_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_purc_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnDtl_ptax_dt.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.ptax_dt_META);
		p.columnDtl_ptax_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_dt);
		p.DtlTable.addTable(p.Dtl_purc_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_purc_ptax_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_purc_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_purc_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_purc_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnDtl_purc_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_rsn_cd_META);
		p.columnDtl_purc_rsn_cd.addLinkBeans(p.columnDtl_purc_rsn_nm,p.columnDtl_xpns_purc_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_rsn_cd);
		p.columnDtl_purc_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_rsn_nm);
		p.columnDtl_purc_bd_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_bd_dpt_cd_META);
		p.columnDtl_purc_bd_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_purc_bd_dpt_cd.addLinkBeans(p.columnDtl_purc_bd_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_bd_dpt_cd);
		p.columnDtl_purc_bd_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_bd_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_bd_dpt_nm);
		p.columnDtl_purc_wtax_rate.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_wtax_rate);
		p.columnDtl_purc_wtax_amt.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_wtax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_wtax_amt);
		p.DtlTable.addTable(p.Dtl_purc_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_purc_schd_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.base_unit_purc_schd_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_purc_schd_qty);
		p.columnDtl_po_print_rmrks.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.po_print_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_print_rmrks);
		p.columnDtl_po_print_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.po_print_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_print_d_rmrks);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.columnDtl_lot_no_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.lot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no_typ);
		p.columnDtl_sublot_no_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sublot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no_typ);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_itm_bill_crryovr_times.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.itm_bill_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_bill_crryovr_times);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.columnDtl_cont_fctr_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.cont_fctr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_flg);
		p.columnDtl_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.cont_fctr_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_rnd_typ);
		p.columnDtl_cont_fctr_dec_place.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.cont_fctr_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_dec_place);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.columnDtl_sls_acxfr_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sls_acxfr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_acxfr_flg);
		p.columnDtl_xpns_purc_flg.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.xpns_purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xpns_purc_flg);
		p.columnDtl_sls_act_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sls_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_no);
		p.columnDtl_sls_act_seq.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sls_act_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_seq);
		p.columnDtl_sls_act_d_seq.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sls_act_d_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_act_d_seq);
		p.columnDtl_sls_schd_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.sls_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_schd_no);
		p.columnDtl_purc_schd_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_schd_no);
		p.columnDtl_dtl_row_id.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.dtl_row_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_row_id);
		p.columnDtl_arr_pr_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.arr_pr_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_pr_no);
		p.columnDtl_ship_pr_no.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.ship_pr_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_pr_no);
		p.columnDtl_schd_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.schd_trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_trd_unit_conv_base_qty);
		p.columnDtl_schd_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.schd_trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_trd_unit_conv_qty);
		p.columnDtl_purc_amt_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_amt_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_amt_rnd_typ);
		p.columnDtl_purc_upri_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_upri_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_rnd_typ);
		p.columnDtl_purc_tax_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_tax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_rnd_typ);
		p.columnDtl_purc_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_trd_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_trd_cur_amt_dec_place);
		p.columnDtl_purc_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_trd_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_trd_cur_upri_dec_place);
		p.columnDtl_purc_s_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_s_trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_s_trd_unit_conv_base_qty);
		p.columnDtl_purc_s_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_s_trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_s_trd_unit_conv_qty);
		p.columnDtl_purc_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_trd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_trd_unit_cd);
		p.DtlTable.addTable(p.Dtl_purc_trd_unit_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_purc_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_purc_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_trd_unit_conv_base_qty);
		p.columnDtl_purc_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_trd_unit_conv_qty);
		p.columnDtl_purc_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.purc_trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_trd_unit_dec_place);
		p.columnDtl_xrate_purc_dt.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.xrate_purc_dt_META);
		p.columnDtl_xrate_purc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_purc_dt);
		p.columnDtl_base_unit_qty_bef.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.base_unit_qty_bef_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_qty_bef);
		p.columnDtl_base_unit_purc_qty.setMeta(mcframe.clientMSBB.MSBBP1360.DtlR.base_unit_purc_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_purc_qty);
	}

	/**
	 * [Io]ブロックのTableの設定
	 */
	protected static void setTableConfigIo(MSBBP_PurcDdlvReg p) {
		p.columnIo_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.trd_unit_cd_META);
		p.columnIo_trd_unit_cd.addLinkBeans(p.columnIo_trd_unit_nm,p.columnIo_trd_unit_dec_place,p.columnIo_trd_unit_conv_base_qty,p.columnIo_trd_unit_conv_qty,p.columnIo_trd_unit_rnd_typ);
		p.IoTable.addColumnConfig(p.columnIo_trd_unit_cd);
		p.columnIo_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.trd_unit_nm_META);
		p.IoTable.addColumnConfig(p.columnIo_trd_unit_nm);
		p.IoTable.addTable(p.Io_trd_unit_qty_p_PPanel.QtyTable);
		p.columnIo_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.base_unit_cd_META);
		p.IoTable.addColumnConfig(p.columnIo_base_unit_cd);
		p.columnIo_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.base_unit_nm_META);
		p.IoTable.addColumnConfig(p.columnIo_base_unit_nm);
		p.IoTable.addTable(p.Io_base_unit_qty_p_PPanel.QtyTable);
		p.IoTable.addTable(p.Io_purc_qty_p_PPanel.QtyTable);
		p.IoTable.addTable(p.Io_sls_qty_p_PPanel.QtyTable);
		p.columnIo_gd_cd.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.gd_cd_META);
		p.columnIo_gd_cd.addLinkBeans(p.columnIo_gd_nm);
		p.IoTable.addColumnConfig(p.columnIo_gd_cd);
		p.columnIo_gd_nm.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.gd_nm_META);
		p.IoTable.addColumnConfig(p.columnIo_gd_nm);
		p.columnIo_bp_dlv_slip_no.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.bp_dlv_slip_no_META);
		p.IoTable.addColumnConfig(p.columnIo_bp_dlv_slip_no);
		p.columnIo_bp_dlv_slip_d_no.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.bp_dlv_slip_d_no_META);
		p.IoTable.addColumnConfig(p.columnIo_bp_dlv_slip_d_no);
		p.IoTable.addTable(p.Io_lot_no_p_PPanel.LotNoTable);
		p.columnIo_bp_lot_no.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.bp_lot_no_META);
		p.IoTable.addColumnConfig(p.columnIo_bp_lot_no);
		p.columnIo_ship_fr_valid_dt.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.ship_fr_valid_dt_META);
		p.columnIo_ship_fr_valid_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.IoTable.addColumnConfig(p.columnIo_ship_fr_valid_dt);
		p.IoTable.addTable(p.Io_ver_no_p_PPanel.VerNoTable);
		p.IoTable.addTable(p.Io_purc_base_unit_qty_p_PPanel.QtyTable);
		p.IoTable.addTable(p.Io_purc_cont_qty_p_PPanel.PurcContQtyTable);
		p.IoTable.addTable(p.Io_purc_cont_fctr_p_PPanel.PurcContFctrTable);
		p.IoTable.addTable(p.Io_std_cont_qty_p_PPanel.ContQtyTable);
		p.IoTable.addTable(p.Io_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.IoTable.addTable(p.Io_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.IoTable.addTable(p.Io_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnIo_purc_act_io_no.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.purc_act_io_no_META);
		p.IoTable.addColumnConfig(p.columnIo_purc_act_io_no);
		p.columnIo_sls_act_io_no.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sls_act_io_no_META);
		p.IoTable.addColumnConfig(p.columnIo_sls_act_io_no);
		p.columnIo_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sub_char1_META);
		p.IoTable.addColumnConfig(p.columnIo_sub_char1);
		p.columnIo_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sub_char2_META);
		p.IoTable.addColumnConfig(p.columnIo_sub_char2);
		p.columnIo_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sub_char3_META);
		p.IoTable.addColumnConfig(p.columnIo_sub_char3);
		p.columnIo_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.trd_unit_dec_place_META);
		p.IoTable.addColumnConfig(p.columnIo_trd_unit_dec_place);
		p.columnIo_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.trd_unit_conv_base_qty_META);
		p.IoTable.addColumnConfig(p.columnIo_trd_unit_conv_base_qty);
		p.columnIo_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.trd_unit_conv_qty_META);
		p.IoTable.addColumnConfig(p.columnIo_trd_unit_conv_qty);
		p.columnIo_trd_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.trd_unit_rnd_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_trd_unit_rnd_typ);
		p.columnIo_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.itm_cd_META);
		p.IoTable.addColumnConfig(p.columnIo_itm_cd);
		p.columnIo_itm_sub1.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.itm_sub1_META);
		p.IoTable.addColumnConfig(p.columnIo_itm_sub1);
		p.columnIo_itm_sub2.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.itm_sub2_META);
		p.IoTable.addColumnConfig(p.columnIo_itm_sub2);
		p.columnIo_itm_sub3.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.itm_sub3_META);
		p.IoTable.addColumnConfig(p.columnIo_itm_sub3);
		p.columnIo_lot_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.lot_mng_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_lot_mng_typ);
		p.columnIo_sublot_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sublot_mng_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_sublot_mng_typ);
		p.columnIo_lot_no_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.lot_no_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_lot_no_typ);
		p.columnIo_sublot_no_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sublot_no_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_sublot_no_typ);
		p.columnIo_sno1_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sno1_mng_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_sno1_mng_typ);
		p.columnIo_sno2_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sno2_mng_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_sno2_mng_typ);
		p.columnIo_sno3_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sno3_mng_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_sno3_mng_typ);
		p.columnIo_sno4_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sno4_mng_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_sno4_mng_typ);
		p.columnIo_stk_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.stk_mng_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_stk_mng_typ);
		p.columnIo_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.base_unit_dec_place_META);
		p.IoTable.addColumnConfig(p.columnIo_base_unit_dec_place);
		p.columnIo_base_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.base_unit_rnd_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_base_unit_rnd_typ);
		p.columnIo_cont_fctr_flg.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.cont_fctr_flg_META);
		p.IoTable.addColumnConfig(p.columnIo_cont_fctr_flg);
		p.columnIo_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.cont_fctr_rnd_typ_META);
		p.IoTable.addColumnConfig(p.columnIo_cont_fctr_rnd_typ);
		p.columnIo_cont_fctr_dec_place.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.cont_fctr_dec_place_META);
		p.IoTable.addColumnConfig(p.columnIo_cont_fctr_dec_place);
		p.columnIo_ver_flg.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.ver_flg_META);
		p.IoTable.addColumnConfig(p.columnIo_ver_flg);
		p.columnIo_sls_act_io_seq.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.sls_act_io_seq_META);
		p.IoTable.addColumnConfig(p.columnIo_sls_act_io_seq);
		p.columnIo_purc_act_io_seq.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.purc_act_io_seq_META);
		p.IoTable.addColumnConfig(p.columnIo_purc_act_io_seq);
		p.columnIo_dtl_row_id.setMeta(mcframe.clientMSBB.MSBBP1360.IoR.dtl_row_id_META);
		p.IoTable.addColumnConfig(p.columnIo_dtl_row_id);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_srch_tgt_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_srch_tgt_typ_nm.getListConfig().setPutter(getCnd_srch_tgt_typ_nm_ListPutter());
		Hdr_dest_cd1.getListConfig().setPutter(getHdr_dest_cd1_ListPutter());
		Hdr_dest_cd2.getListConfig().setPutter(getHdr_dest_cd2_ListPutter());
		Hdr_dest_cd3.getListConfig().setPutter(getHdr_dest_cd3_ListPutter());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cur_cd.getListConfig().setPutter(getHdr_trd_cur_cd_ListPutter());
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
		Dtl_dlv_p_PPanel.columnDlv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_dlv_p_PPanel.columnDlv_bp_cd.getListConfig().setPutter(getDtl_dlv_p_PPanel_columnDlv_bp_cd_ListPutter());
		columnDtl_dest_cd1.getListConfig().setPutter(getDtl_dest_cd1_ListPutter());
		columnDtl_dest_cd2.getListConfig().setPutter(getDtl_dest_cd2_ListPutter());
		columnDtl_dest_cd3.getListConfig().setPutter(getDtl_dest_cd3_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter());
		columnDtl_sls_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_rsn_cd.getListConfig().setPutter(getDtl_sls_rsn_cd_ListPutter());
		columnDtl_bd_dpt_cd.getListConfig().setPutter(getDtl_bd_dpt_cd_ListPutter());
		Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter());
		columnDtl_purc_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_rsn_cd.getListConfig().setPutter(getDtl_purc_rsn_cd_ListPutter());
		columnDtl_purc_bd_dpt_cd.getListConfig().setPutter(getDtl_purc_bd_dpt_cd_ListPutter());
		columnIo_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnIo_trd_unit_cd.getListConfig().setPutter(getIo_trd_unit_cd_ListPutter());
		columnIo_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnIo_gd_cd.getListConfig().setPutter(getIo_gd_cd_ListPutter());
	}

	/**
	 * この画面を[INS_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_SRCHStatus() {
		status = INS_SRCH;
		setAllStatus(status);
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
		if (INS_SRCH.equals(status)) {
			setINS_SRCHStatus();
		}
		else if (INS.equals(status)) {
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
	 * [Dtl_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}

	/**
	 * [Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsDscntBizRsn");
		return lp;
	}

	/**
	 * [Dtl_sls_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}

	/**
	 * [Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcDscntBizRsn");
		return lp;
	}

	/**
	 * [Dtl_purc_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Io_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createIo_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Io_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createIo_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_srch_tgt_typ_nm) return getCnd_srch_tgt_typ_nm(row, info);
		if(combo == Hdr_dest_cd1) return getHdr_dest_cd1(row, info);
		if(combo == Hdr_dest_cd2) return getHdr_dest_cd2(row, info);
		if(combo == Hdr_dest_cd3) return getHdr_dest_cd3(row, info);
		if(combo == Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_trd_cur_cd) return getHdr_trd_cur_cd(row, info);
		if(combo == Hdr_ar_dpt_cd) return getHdr_ar_dpt_cd(row, info);
		if(combo == Hdr_tterm_cd1) return getHdr_tterm_cd1(row, info);
		if(combo == Hdr_tterm_cd2) return getHdr_tterm_cd2(row, info);
		if(combo == Hdr_tterm_cd3) return getHdr_tterm_cd3(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_cst_itm_cd) return getDtl_cst_itm_cd(row, info);
		if(combo == Dtl_dlv_p_PPanel.columnDlv_bp_cd) return getDtl_dlv_p_PPanel_columnDlv_bp_cd(row, info);
		if(combo == columnDtl_dest_cd1) return getDtl_dest_cd1(row, info);
		if(combo == columnDtl_dest_cd2) return getDtl_dest_cd2(row, info);
		if(combo == columnDtl_dest_cd3) return getDtl_dest_cd3(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == Dtl_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd) return getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(row, info);
		if(combo == columnDtl_sls_rsn_cd) return getDtl_sls_rsn_cd(row, info);
		if(combo == columnDtl_bd_dpt_cd) return getDtl_bd_dpt_cd(row, info);
		if(combo == Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == Dtl_purc_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd) return getDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(row, info);
		if(combo == columnDtl_purc_rsn_cd) return getDtl_purc_rsn_cd(row, info);
		if(combo == columnDtl_purc_bd_dpt_cd) return getDtl_purc_bd_dpt_cd(row, info);
		if(combo == columnIo_trd_unit_cd) return getIo_trd_unit_cd(row, info);
		if(combo == columnIo_gd_cd) return getIo_gd_cd(row, info);
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
		else if (ap == Cnd_srch_slip) doCnd_srch_slip(info);
		else if (ap == DtlBtn_radd_noschd) doDtlBtn_radd_noschd(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == IoBtn_radd) doIoBtn_radd(info);
		else if (ap == IoBtn_rdel) doIoBtn_rdel(info);
		else if (ap == IoBtn_rcopy) doIoBtn_rcopy(info);
		else if (ap == IoBtn_upd_dtl) doIoBtn_upd_dtl(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_slip]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_slip(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd_noschd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd_noschd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [IoBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doIoBtn_radd(MCEventInfo info);

	/**
	 * [IoBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doIoBtn_rdel(MCEventInfo info);

	/**
	 * [IoBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doIoBtn_rcopy(MCEventInfo info);

	/**
	 * [IoBtn]パネルの[upd_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doIoBtn_upd_dtl(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

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
		if (vc == IoTable) return doIo_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_srch_tgt_typ) return doCnd_srch_tgt_typ_VC(info);
		if (vc == Cnd_srch_tgt_typ_nm) return doCnd_srch_tgt_typ_nm_VC(info);
		if (vc == Cnd_srch_tgt_no) return doCnd_srch_tgt_no_VC(info);
		if (vc == Cnd_srch_tgt_rev) return doCnd_srch_tgt_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Cnd_purc_schd_dt) return doCnd_purc_schd_dt_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_ac_ym) return doHdr_ac_ym_VC(info);
		if (vc == Hdr_sls_act_no) return doHdr_sls_act_no_VC(info);
		if (vc == Hdr_sls_act_rev) return doHdr_sls_act_rev_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_edi_flg) return doHdr_edi_flg_VC(info);
		if (vc == Hdr_sls_act_seq) return doHdr_sls_act_seq_VC(info);
		if (vc == Hdr_dlv_slip_no) return doHdr_dlv_slip_no_VC(info);
		if (vc == Hdr_sls_dt) return doHdr_sls_dt_VC(info);
		if (vc == Hdr_bill_basis_dt) return doHdr_bill_basis_dt_VC(info);
		if (vc == Hdr_dest_cd1) return doHdr_dest_cd1_VC(info);
		if (vc == Hdr_dest_nm1) return doHdr_dest_nm1_VC(info);
		if (vc == Hdr_dest_cd2) return doHdr_dest_cd2_VC(info);
		if (vc == Hdr_dest_nm2) return doHdr_dest_nm2_VC(info);
		if (vc == Hdr_dest_cd3) return doHdr_dest_cd3_VC(info);
		if (vc == Hdr_dest_nm3) return doHdr_dest_nm3_VC(info);
		if (vc == Hdr_cst_cd) return doHdr_cst_cd_VC(info);
		if (vc == Hdr_cst_nm) return doHdr_cst_nm_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_dlv_slip_out_flg) return doHdr_dlv_slip_out_flg_VC(info);
		if (vc == Hdr_dlv_slip_prntd_flg) return doHdr_dlv_slip_prntd_flg_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_xrate_inpt_flg) return doHdr_xrate_inpt_flg_VC(info);
		if (vc == Hdr_xrate_cd) return doHdr_xrate_cd_VC(info);
		if (vc == Hdr_purc_xrate_cd) return doHdr_purc_xrate_cd_VC(info);
		if (vc == Hdr_ptax_cur_cd) return doHdr_ptax_cur_cd_VC(info);
		if (vc == Hdr_ptax_cur_nm) return doHdr_ptax_cur_nm_VC(info);
		if (vc == Hdr_ptax_xrate_inpt_flg) return doHdr_ptax_xrate_inpt_flg_VC(info);
		if (vc == Hdr_qtn_no) return doHdr_qtn_no_VC(info);
		if (vc == Hdr_qtn_rev) return doHdr_qtn_rev_VC(info);
		if (vc == Hdr_slo_no) return doHdr_slo_no_VC(info);
		if (vc == Hdr_cst_po_no) return doHdr_cst_po_no_VC(info);
		if (vc == Hdr_prof_rate) return doHdr_prof_rate_VC(info);
		if (vc == Hdr_acst_cd) return doHdr_acst_cd_VC(info);
		if (vc == Hdr_acst_nm) return doHdr_acst_nm_VC(info);
		if (vc == Hdr_ar_dpt_cd) return doHdr_ar_dpt_cd_VC(info);
		if (vc == Hdr_ar_dpt_nm) return doHdr_ar_dpt_nm_VC(info);
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
		if (vc == Hdr_sls_amt_rnd_typ) return doHdr_sls_amt_rnd_typ_VC(info);
		if (vc == Hdr_sls_tax_rnd_typ) return doHdr_sls_tax_rnd_typ_VC(info);
		if (vc == Hdr_trd_cur_amt_dec_place) return doHdr_trd_cur_amt_dec_place_VC(info);
		if (vc == Hdr_trd_cur_upri_dec_place) return doHdr_trd_cur_upri_dec_place_VC(info);
		if (vc == Hdr_base_cur_amt_dec_place) return doHdr_base_cur_amt_dec_place_VC(info);
		if (vc == Hdr_base_cur_upri_dec_place) return doHdr_base_cur_upri_dec_place_VC(info);
		if (vc == Hdr_ptax_cur_amt_dec_place) return doHdr_ptax_cur_amt_dec_place_VC(info);
		if (vc == Hdr_ptax_cur_upri_dec_place) return doHdr_ptax_cur_upri_dec_place_VC(info);
		if (vc == Hdr_xrate_rnd_typ) return doHdr_xrate_rnd_typ_VC(info);
		if (vc == Hdr_wtax_rnd_typ) return doHdr_wtax_rnd_typ_VC(info);
		if (vc == Hdr_ar_dpt_typ) return doHdr_ar_dpt_typ_VC(info);
		if (vc == Hdr_cst_bill_crryovr_times) return doHdr_cst_bill_crryovr_times_VC(info);
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
		if (vc == columnDtl_sync_flg) return doDtl_sync_flg_VC(info);
		if (vc == columnDtl_abort_flg) return doDtl_abort_flg_VC(info);
		if (vc == columnDtl_dlv_schd_dt) return doDtl_dlv_schd_dt_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_dest_cd1) return doDtl_dest_cd1_VC(info);
		if (vc == columnDtl_dest_nm1) return doDtl_dest_nm1_VC(info);
		if (vc == columnDtl_dest_cd2) return doDtl_dest_cd2_VC(info);
		if (vc == columnDtl_dest_nm2) return doDtl_dest_nm2_VC(info);
		if (vc == columnDtl_dest_cd3) return doDtl_dest_cd3_VC(info);
		if (vc == columnDtl_dest_nm3) return doDtl_dest_nm3_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_sls_dtl_upd_flg) return doDtl_sls_dtl_upd_flg_VC(info);
		if (vc == columnDtl_prof_rate) return doDtl_prof_rate_VC(info);
		if (vc == columnDtl_bill_crryovr_times) return doDtl_bill_crryovr_times_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_cst_po_d_no) return doDtl_cst_po_d_no_VC(info);
		if (vc == columnDtl_sls_rsn_cd) return doDtl_sls_rsn_cd_VC(info);
		if (vc == columnDtl_sls_rsn_nm) return doDtl_sls_rsn_nm_VC(info);
		if (vc == columnDtl_bd_dpt_cd) return doDtl_bd_dpt_cd_VC(info);
		if (vc == columnDtl_bd_dpt_nm) return doDtl_bd_dpt_nm_VC(info);
		if (vc == columnDtl_wtax_rate) return doDtl_wtax_rate_VC(info);
		if (vc == columnDtl_ext_sys_cd) return doDtl_ext_sys_cd_VC(info);
		if (vc == columnDtl_ext_sys_nm) return doDtl_ext_sys_nm_VC(info);
		if (vc == columnDtl_ext_purc_act_d_no) return doDtl_ext_purc_act_d_no_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_sls_act_d_no) return doDtl_sls_act_d_no_VC(info);
		if (vc == columnDtl_purc_ac_ym) return doDtl_purc_ac_ym_VC(info);
		if (vc == columnDtl_purc_ac_dt) return doDtl_purc_ac_dt_VC(info);
		if (vc == columnDtl_purc_dt) return doDtl_purc_dt_VC(info);
		if (vc == columnDtl_purc_act_no) return doDtl_purc_act_no_VC(info);
		if (vc == columnDtl_purc_act_d_no) return doDtl_purc_act_d_no_VC(info);
		if (vc == columnDtl_po_no) return doDtl_po_no_VC(info);
		if (vc == columnDtl_po_d_no) return doDtl_po_d_no_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_sppl_nm) return doDtl_sppl_nm_VC(info);
		if (vc == columnDtl_sppl_iv_flg) return doDtl_sppl_iv_flg_VC(info);
		if (vc == columnDtl_subcon_flg) return doDtl_subcon_flg_VC(info);
		if (vc == columnDtl_maker_cd) return doDtl_maker_cd_VC(info);
		if (vc == columnDtl_maker_nm) return doDtl_maker_nm_VC(info);
		if (vc == columnDtl_bp_dlv_slip_no) return doDtl_bp_dlv_slip_no_VC(info);
		if (vc == columnDtl_bp_dlv_slip_d_no) return doDtl_bp_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_bp_lot_no) return doDtl_bp_lot_no_VC(info);
		if (vc == columnDtl_ship_fr_valid_dt) return doDtl_ship_fr_valid_dt_VC(info);
		if (vc == columnDtl_purc_trd_cur_cd) return doDtl_purc_trd_cur_cd_VC(info);
		if (vc == columnDtl_purc_trd_cur_nm) return doDtl_purc_trd_cur_nm_VC(info);
		if (vc == columnDtl_purc_xrate_inpt_flg) return doDtl_purc_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_purc_ptax_xrate_inpt_flg) return doDtl_purc_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_purc_dtl_upd_flg) return doDtl_purc_dtl_upd_flg_VC(info);
		if (vc == columnDtl_ptax_dt) return doDtl_ptax_dt_VC(info);
		if (vc == columnDtl_purc_rsn_cd) return doDtl_purc_rsn_cd_VC(info);
		if (vc == columnDtl_purc_rsn_nm) return doDtl_purc_rsn_nm_VC(info);
		if (vc == columnDtl_purc_bd_dpt_cd) return doDtl_purc_bd_dpt_cd_VC(info);
		if (vc == columnDtl_purc_bd_dpt_nm) return doDtl_purc_bd_dpt_nm_VC(info);
		if (vc == columnDtl_purc_wtax_rate) return doDtl_purc_wtax_rate_VC(info);
		if (vc == columnDtl_purc_wtax_amt) return doDtl_purc_wtax_amt_VC(info);
		if (vc == columnDtl_base_unit_purc_schd_qty) return doDtl_base_unit_purc_schd_qty_VC(info);
		if (vc == columnDtl_po_print_rmrks) return doDtl_po_print_rmrks_VC(info);
		if (vc == columnDtl_po_print_d_rmrks) return doDtl_po_print_d_rmrks_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_lot_no_typ) return doDtl_lot_no_typ_VC(info);
		if (vc == columnDtl_sublot_no_typ) return doDtl_sublot_no_typ_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_itm_bill_crryovr_times) return doDtl_itm_bill_crryovr_times_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_cont_fctr_flg) return doDtl_cont_fctr_flg_VC(info);
		if (vc == columnDtl_cont_fctr_rnd_typ) return doDtl_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl_cont_fctr_dec_place) return doDtl_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_trd_unit_rnd_typ) return doDtl_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_sls_acxfr_flg) return doDtl_sls_acxfr_flg_VC(info);
		if (vc == columnDtl_xpns_purc_flg) return doDtl_xpns_purc_flg_VC(info);
		if (vc == columnDtl_sls_act_no) return doDtl_sls_act_no_VC(info);
		if (vc == columnDtl_sls_act_seq) return doDtl_sls_act_seq_VC(info);
		if (vc == columnDtl_sls_act_d_seq) return doDtl_sls_act_d_seq_VC(info);
		if (vc == columnDtl_sls_schd_no) return doDtl_sls_schd_no_VC(info);
		if (vc == columnDtl_purc_schd_no) return doDtl_purc_schd_no_VC(info);
		if (vc == columnDtl_dtl_row_id) return doDtl_dtl_row_id_VC(info);
		if (vc == columnDtl_arr_pr_no) return doDtl_arr_pr_no_VC(info);
		if (vc == columnDtl_ship_pr_no) return doDtl_ship_pr_no_VC(info);
		if (vc == columnDtl_schd_trd_unit_conv_base_qty) return doDtl_schd_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_schd_trd_unit_conv_qty) return doDtl_schd_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_purc_amt_rnd_typ) return doDtl_purc_amt_rnd_typ_VC(info);
		if (vc == columnDtl_purc_upri_rnd_typ) return doDtl_purc_upri_rnd_typ_VC(info);
		if (vc == columnDtl_purc_tax_rnd_typ) return doDtl_purc_tax_rnd_typ_VC(info);
		if (vc == columnDtl_purc_trd_cur_amt_dec_place) return doDtl_purc_trd_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_purc_trd_cur_upri_dec_place) return doDtl_purc_trd_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_purc_s_trd_unit_conv_base_qty) return doDtl_purc_s_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_purc_s_trd_unit_conv_qty) return doDtl_purc_s_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_purc_trd_unit_cd) return doDtl_purc_trd_unit_cd_VC(info);
		if (vc == columnDtl_purc_trd_unit_conv_base_qty) return doDtl_purc_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_purc_trd_unit_conv_qty) return doDtl_purc_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_purc_trd_unit_dec_place) return doDtl_purc_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_xrate_purc_dt) return doDtl_xrate_purc_dt_VC(info);
		if (vc == columnDtl_base_unit_qty_bef) return doDtl_base_unit_qty_bef_VC(info);
		if (vc == columnDtl_base_unit_purc_qty) return doDtl_base_unit_purc_qty_VC(info);
		if (vc == columnIo_trd_unit_cd) return doIo_trd_unit_cd_VC(info);
		if (vc == columnIo_trd_unit_nm) return doIo_trd_unit_nm_VC(info);
		if (vc == columnIo_base_unit_cd) return doIo_base_unit_cd_VC(info);
		if (vc == columnIo_base_unit_nm) return doIo_base_unit_nm_VC(info);
		if (vc == columnIo_gd_cd) return doIo_gd_cd_VC(info);
		if (vc == columnIo_gd_nm) return doIo_gd_nm_VC(info);
		if (vc == columnIo_bp_dlv_slip_no) return doIo_bp_dlv_slip_no_VC(info);
		if (vc == columnIo_bp_dlv_slip_d_no) return doIo_bp_dlv_slip_d_no_VC(info);
		if (vc == columnIo_bp_lot_no) return doIo_bp_lot_no_VC(info);
		if (vc == columnIo_ship_fr_valid_dt) return doIo_ship_fr_valid_dt_VC(info);
		if (vc == columnIo_purc_act_io_no) return doIo_purc_act_io_no_VC(info);
		if (vc == columnIo_sls_act_io_no) return doIo_sls_act_io_no_VC(info);
		if (vc == columnIo_sub_char1) return doIo_sub_char1_VC(info);
		if (vc == columnIo_sub_char2) return doIo_sub_char2_VC(info);
		if (vc == columnIo_sub_char3) return doIo_sub_char3_VC(info);
		if (vc == columnIo_trd_unit_dec_place) return doIo_trd_unit_dec_place_VC(info);
		if (vc == columnIo_trd_unit_conv_base_qty) return doIo_trd_unit_conv_base_qty_VC(info);
		if (vc == columnIo_trd_unit_conv_qty) return doIo_trd_unit_conv_qty_VC(info);
		if (vc == columnIo_trd_unit_rnd_typ) return doIo_trd_unit_rnd_typ_VC(info);
		if (vc == columnIo_itm_cd) return doIo_itm_cd_VC(info);
		if (vc == columnIo_itm_sub1) return doIo_itm_sub1_VC(info);
		if (vc == columnIo_itm_sub2) return doIo_itm_sub2_VC(info);
		if (vc == columnIo_itm_sub3) return doIo_itm_sub3_VC(info);
		if (vc == columnIo_lot_mng_typ) return doIo_lot_mng_typ_VC(info);
		if (vc == columnIo_sublot_mng_typ) return doIo_sublot_mng_typ_VC(info);
		if (vc == columnIo_lot_no_typ) return doIo_lot_no_typ_VC(info);
		if (vc == columnIo_sublot_no_typ) return doIo_sublot_no_typ_VC(info);
		if (vc == columnIo_sno1_mng_typ) return doIo_sno1_mng_typ_VC(info);
		if (vc == columnIo_sno2_mng_typ) return doIo_sno2_mng_typ_VC(info);
		if (vc == columnIo_sno3_mng_typ) return doIo_sno3_mng_typ_VC(info);
		if (vc == columnIo_sno4_mng_typ) return doIo_sno4_mng_typ_VC(info);
		if (vc == columnIo_stk_mng_typ) return doIo_stk_mng_typ_VC(info);
		if (vc == columnIo_base_unit_dec_place) return doIo_base_unit_dec_place_VC(info);
		if (vc == columnIo_base_unit_rnd_typ) return doIo_base_unit_rnd_typ_VC(info);
		if (vc == columnIo_cont_fctr_flg) return doIo_cont_fctr_flg_VC(info);
		if (vc == columnIo_cont_fctr_rnd_typ) return doIo_cont_fctr_rnd_typ_VC(info);
		if (vc == columnIo_cont_fctr_dec_place) return doIo_cont_fctr_dec_place_VC(info);
		if (vc == columnIo_ver_flg) return doIo_ver_flg_VC(info);
		if (vc == columnIo_sls_act_io_seq) return doIo_sls_act_io_seq_VC(info);
		if (vc == columnIo_purc_act_io_seq) return doIo_purc_act_io_seq_VC(info);
		if (vc == columnIo_dtl_row_id) return doIo_dtl_row_id_VC(info);
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
	 * [Io]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_schd_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_latest_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[sls_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_act_seq_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[dlv_slip_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_slip_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prntd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_slip_prntd_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_xrate_cd_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ptax_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_slo_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[prof_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prof_rate_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xrate_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wtax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wtax_rnd_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sync_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sync_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_schd_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_dtl_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_dtl_upd_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_crryovr_times_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_purc_act_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_subcon_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_dlv_slip_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_fr_valid_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_fr_valid_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ptax_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dtl_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dtl_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_wtax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_wtax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_schd_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_purc_schd_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_print_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_print_d_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mng_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_mng_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_bill_crryovr_times_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_acxfr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_row_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_row_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upri_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upri_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_trd_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_s_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_s_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_purc_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_purc_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_qty_bef_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_purc_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_bp_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_bp_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[ship_fr_valid_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_ship_fr_valid_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[purc_act_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_purc_act_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sls_act_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sls_act_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[sls_act_io_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_sls_act_io_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[purc_act_io_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_purc_act_io_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Io]パネルの[dtl_row_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doIo_dtl_row_id_VC(MCEventInfo info){
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
		else if (nc == IoTable) doIo_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NC(info);
		else if (nc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NC(info);
		else if (nc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NC(info);
		else if (nc == Cnd_srch_tgt_rev) doCnd_srch_tgt_rev_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Cnd_purc_schd_dt) doCnd_purc_schd_dt_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_ac_ym) doHdr_ac_ym_NC(info);
		else if (nc == Hdr_sls_act_no) doHdr_sls_act_no_NC(info);
		else if (nc == Hdr_sls_act_rev) doHdr_sls_act_rev_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_edi_flg) doHdr_edi_flg_NC(info);
		else if (nc == Hdr_sls_act_seq) doHdr_sls_act_seq_NC(info);
		else if (nc == Hdr_dlv_slip_no) doHdr_dlv_slip_no_NC(info);
		else if (nc == Hdr_sls_dt) doHdr_sls_dt_NC(info);
		else if (nc == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NC(info);
		else if (nc == Hdr_dest_cd1) doHdr_dest_cd1_NC(info);
		else if (nc == Hdr_dest_nm1) doHdr_dest_nm1_NC(info);
		else if (nc == Hdr_dest_cd2) doHdr_dest_cd2_NC(info);
		else if (nc == Hdr_dest_nm2) doHdr_dest_nm2_NC(info);
		else if (nc == Hdr_dest_cd3) doHdr_dest_cd3_NC(info);
		else if (nc == Hdr_dest_nm3) doHdr_dest_nm3_NC(info);
		else if (nc == Hdr_cst_cd) doHdr_cst_cd_NC(info);
		else if (nc == Hdr_cst_nm) doHdr_cst_nm_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_dlv_slip_out_flg) doHdr_dlv_slip_out_flg_NC(info);
		else if (nc == Hdr_dlv_slip_prntd_flg) doHdr_dlv_slip_prntd_flg_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NC(info);
		else if (nc == Hdr_xrate_cd) doHdr_xrate_cd_NC(info);
		else if (nc == Hdr_purc_xrate_cd) doHdr_purc_xrate_cd_NC(info);
		else if (nc == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NC(info);
		else if (nc == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NC(info);
		else if (nc == Hdr_ptax_xrate_inpt_flg) doHdr_ptax_xrate_inpt_flg_NC(info);
		else if (nc == Hdr_qtn_no) doHdr_qtn_no_NC(info);
		else if (nc == Hdr_qtn_rev) doHdr_qtn_rev_NC(info);
		else if (nc == Hdr_slo_no) doHdr_slo_no_NC(info);
		else if (nc == Hdr_cst_po_no) doHdr_cst_po_no_NC(info);
		else if (nc == Hdr_prof_rate) doHdr_prof_rate_NC(info);
		else if (nc == Hdr_acst_cd) doHdr_acst_cd_NC(info);
		else if (nc == Hdr_acst_nm) doHdr_acst_nm_NC(info);
		else if (nc == Hdr_ar_dpt_cd) doHdr_ar_dpt_cd_NC(info);
		else if (nc == Hdr_ar_dpt_nm) doHdr_ar_dpt_nm_NC(info);
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
		else if (nc == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_NC(info);
		else if (nc == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_NC(info);
		else if (nc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_xrate_rnd_typ) doHdr_xrate_rnd_typ_NC(info);
		else if (nc == Hdr_wtax_rnd_typ) doHdr_wtax_rnd_typ_NC(info);
		else if (nc == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_NC(info);
		else if (nc == Hdr_cst_bill_crryovr_times) doHdr_cst_bill_crryovr_times_NC(info);
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
		else if (nc == columnDtl_sync_flg) doDtl_sync_flg_NC(info);
		else if (nc == columnDtl_abort_flg) doDtl_abort_flg_NC(info);
		else if (nc == columnDtl_dlv_schd_dt) doDtl_dlv_schd_dt_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_dest_cd1) doDtl_dest_cd1_NC(info);
		else if (nc == columnDtl_dest_nm1) doDtl_dest_nm1_NC(info);
		else if (nc == columnDtl_dest_cd2) doDtl_dest_cd2_NC(info);
		else if (nc == columnDtl_dest_nm2) doDtl_dest_nm2_NC(info);
		else if (nc == columnDtl_dest_cd3) doDtl_dest_cd3_NC(info);
		else if (nc == columnDtl_dest_nm3) doDtl_dest_nm3_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_sls_dtl_upd_flg) doDtl_sls_dtl_upd_flg_NC(info);
		else if (nc == columnDtl_prof_rate) doDtl_prof_rate_NC(info);
		else if (nc == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NC(info);
		else if (nc == columnDtl_sls_rsn_cd) doDtl_sls_rsn_cd_NC(info);
		else if (nc == columnDtl_sls_rsn_nm) doDtl_sls_rsn_nm_NC(info);
		else if (nc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NC(info);
		else if (nc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NC(info);
		else if (nc == columnDtl_wtax_rate) doDtl_wtax_rate_NC(info);
		else if (nc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NC(info);
		else if (nc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NC(info);
		else if (nc == columnDtl_ext_purc_act_d_no) doDtl_ext_purc_act_d_no_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_NC(info);
		else if (nc == columnDtl_purc_ac_ym) doDtl_purc_ac_ym_NC(info);
		else if (nc == columnDtl_purc_ac_dt) doDtl_purc_ac_dt_NC(info);
		else if (nc == columnDtl_purc_dt) doDtl_purc_dt_NC(info);
		else if (nc == columnDtl_purc_act_no) doDtl_purc_act_no_NC(info);
		else if (nc == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NC(info);
		else if (nc == columnDtl_po_no) doDtl_po_no_NC(info);
		else if (nc == columnDtl_po_d_no) doDtl_po_d_no_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_sppl_nm) doDtl_sppl_nm_NC(info);
		else if (nc == columnDtl_sppl_iv_flg) doDtl_sppl_iv_flg_NC(info);
		else if (nc == columnDtl_subcon_flg) doDtl_subcon_flg_NC(info);
		else if (nc == columnDtl_maker_cd) doDtl_maker_cd_NC(info);
		else if (nc == columnDtl_maker_nm) doDtl_maker_nm_NC(info);
		else if (nc == columnDtl_bp_dlv_slip_no) doDtl_bp_dlv_slip_no_NC(info);
		else if (nc == columnDtl_bp_dlv_slip_d_no) doDtl_bp_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_bp_lot_no) doDtl_bp_lot_no_NC(info);
		else if (nc == columnDtl_ship_fr_valid_dt) doDtl_ship_fr_valid_dt_NC(info);
		else if (nc == columnDtl_purc_trd_cur_cd) doDtl_purc_trd_cur_cd_NC(info);
		else if (nc == columnDtl_purc_trd_cur_nm) doDtl_purc_trd_cur_nm_NC(info);
		else if (nc == columnDtl_purc_xrate_inpt_flg) doDtl_purc_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_purc_ptax_xrate_inpt_flg) doDtl_purc_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_purc_dtl_upd_flg) doDtl_purc_dtl_upd_flg_NC(info);
		else if (nc == columnDtl_ptax_dt) doDtl_ptax_dt_NC(info);
		else if (nc == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_NC(info);
		else if (nc == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NC(info);
		else if (nc == columnDtl_purc_bd_dpt_cd) doDtl_purc_bd_dpt_cd_NC(info);
		else if (nc == columnDtl_purc_bd_dpt_nm) doDtl_purc_bd_dpt_nm_NC(info);
		else if (nc == columnDtl_purc_wtax_rate) doDtl_purc_wtax_rate_NC(info);
		else if (nc == columnDtl_purc_wtax_amt) doDtl_purc_wtax_amt_NC(info);
		else if (nc == columnDtl_base_unit_purc_schd_qty) doDtl_base_unit_purc_schd_qty_NC(info);
		else if (nc == columnDtl_po_print_rmrks) doDtl_po_print_rmrks_NC(info);
		else if (nc == columnDtl_po_print_d_rmrks) doDtl_po_print_d_rmrks_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_lot_no_typ) doDtl_lot_no_typ_NC(info);
		else if (nc == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_itm_bill_crryovr_times) doDtl_itm_bill_crryovr_times_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NC(info);
		else if (nc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NC(info);
		else if (nc == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NC(info);
		else if (nc == columnDtl_sls_act_no) doDtl_sls_act_no_NC(info);
		else if (nc == columnDtl_sls_act_seq) doDtl_sls_act_seq_NC(info);
		else if (nc == columnDtl_sls_act_d_seq) doDtl_sls_act_d_seq_NC(info);
		else if (nc == columnDtl_sls_schd_no) doDtl_sls_schd_no_NC(info);
		else if (nc == columnDtl_purc_schd_no) doDtl_purc_schd_no_NC(info);
		else if (nc == columnDtl_dtl_row_id) doDtl_dtl_row_id_NC(info);
		else if (nc == columnDtl_arr_pr_no) doDtl_arr_pr_no_NC(info);
		else if (nc == columnDtl_ship_pr_no) doDtl_ship_pr_no_NC(info);
		else if (nc == columnDtl_schd_trd_unit_conv_base_qty) doDtl_schd_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_schd_trd_unit_conv_qty) doDtl_schd_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_NC(info);
		else if (nc == columnDtl_purc_upri_rnd_typ) doDtl_purc_upri_rnd_typ_NC(info);
		else if (nc == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_NC(info);
		else if (nc == columnDtl_purc_trd_cur_amt_dec_place) doDtl_purc_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_purc_trd_cur_upri_dec_place) doDtl_purc_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_purc_s_trd_unit_conv_base_qty) doDtl_purc_s_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_purc_s_trd_unit_conv_qty) doDtl_purc_s_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_purc_trd_unit_cd) doDtl_purc_trd_unit_cd_NC(info);
		else if (nc == columnDtl_purc_trd_unit_conv_base_qty) doDtl_purc_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_purc_trd_unit_conv_qty) doDtl_purc_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_purc_trd_unit_dec_place) doDtl_purc_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_xrate_purc_dt) doDtl_xrate_purc_dt_NC(info);
		else if (nc == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_NC(info);
		else if (nc == columnDtl_base_unit_purc_qty) doDtl_base_unit_purc_qty_NC(info);
		else if (nc == columnIo_trd_unit_cd) doIo_trd_unit_cd_NC(info);
		else if (nc == columnIo_trd_unit_nm) doIo_trd_unit_nm_NC(info);
		else if (nc == columnIo_base_unit_cd) doIo_base_unit_cd_NC(info);
		else if (nc == columnIo_base_unit_nm) doIo_base_unit_nm_NC(info);
		else if (nc == columnIo_gd_cd) doIo_gd_cd_NC(info);
		else if (nc == columnIo_gd_nm) doIo_gd_nm_NC(info);
		else if (nc == columnIo_bp_dlv_slip_no) doIo_bp_dlv_slip_no_NC(info);
		else if (nc == columnIo_bp_dlv_slip_d_no) doIo_bp_dlv_slip_d_no_NC(info);
		else if (nc == columnIo_bp_lot_no) doIo_bp_lot_no_NC(info);
		else if (nc == columnIo_ship_fr_valid_dt) doIo_ship_fr_valid_dt_NC(info);
		else if (nc == columnIo_purc_act_io_no) doIo_purc_act_io_no_NC(info);
		else if (nc == columnIo_sls_act_io_no) doIo_sls_act_io_no_NC(info);
		else if (nc == columnIo_sub_char1) doIo_sub_char1_NC(info);
		else if (nc == columnIo_sub_char2) doIo_sub_char2_NC(info);
		else if (nc == columnIo_sub_char3) doIo_sub_char3_NC(info);
		else if (nc == columnIo_trd_unit_dec_place) doIo_trd_unit_dec_place_NC(info);
		else if (nc == columnIo_trd_unit_conv_base_qty) doIo_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnIo_trd_unit_conv_qty) doIo_trd_unit_conv_qty_NC(info);
		else if (nc == columnIo_trd_unit_rnd_typ) doIo_trd_unit_rnd_typ_NC(info);
		else if (nc == columnIo_itm_cd) doIo_itm_cd_NC(info);
		else if (nc == columnIo_itm_sub1) doIo_itm_sub1_NC(info);
		else if (nc == columnIo_itm_sub2) doIo_itm_sub2_NC(info);
		else if (nc == columnIo_itm_sub3) doIo_itm_sub3_NC(info);
		else if (nc == columnIo_lot_mng_typ) doIo_lot_mng_typ_NC(info);
		else if (nc == columnIo_sublot_mng_typ) doIo_sublot_mng_typ_NC(info);
		else if (nc == columnIo_lot_no_typ) doIo_lot_no_typ_NC(info);
		else if (nc == columnIo_sublot_no_typ) doIo_sublot_no_typ_NC(info);
		else if (nc == columnIo_sno1_mng_typ) doIo_sno1_mng_typ_NC(info);
		else if (nc == columnIo_sno2_mng_typ) doIo_sno2_mng_typ_NC(info);
		else if (nc == columnIo_sno3_mng_typ) doIo_sno3_mng_typ_NC(info);
		else if (nc == columnIo_sno4_mng_typ) doIo_sno4_mng_typ_NC(info);
		else if (nc == columnIo_stk_mng_typ) doIo_stk_mng_typ_NC(info);
		else if (nc == columnIo_base_unit_dec_place) doIo_base_unit_dec_place_NC(info);
		else if (nc == columnIo_base_unit_rnd_typ) doIo_base_unit_rnd_typ_NC(info);
		else if (nc == columnIo_cont_fctr_flg) doIo_cont_fctr_flg_NC(info);
		else if (nc == columnIo_cont_fctr_rnd_typ) doIo_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnIo_cont_fctr_dec_place) doIo_cont_fctr_dec_place_NC(info);
		else if (nc == columnIo_ver_flg) doIo_ver_flg_NC(info);
		else if (nc == columnIo_sls_act_io_seq) doIo_sls_act_io_seq_NC(info);
		else if (nc == columnIo_purc_act_io_seq) doIo_purc_act_io_seq_NC(info);
		else if (nc == columnIo_dtl_row_id) doIo_dtl_row_id_NC(info);
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
	 * [Io]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_seq_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[dlv_slip_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prntd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_prntd_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_xrate_cd_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_xrate_inpt_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wtax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wtax_rnd_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_schd_dt_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_dtl_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dtl_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_purc_act_d_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_subcon_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_valid_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_valid_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dtl_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dtl_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_wtax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_wtax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_schd_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_purc_schd_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_bill_crryovr_times_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_row_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_row_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_s_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_s_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_purc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_purc_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_purc_qty_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[ship_fr_valid_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_ship_fr_valid_dt_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[purc_act_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_purc_act_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sls_act_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sls_act_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sls_act_io_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sls_act_io_seq_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[purc_act_io_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_purc_act_io_seq_NC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[dtl_row_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_dtl_row_id_NC(MCEventInfo info){
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
		else if (ne == IoTable) doIo_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NE(info);
		else if (ne == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NE(info);
		else if (ne == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NE(info);
		else if (ne == Cnd_srch_tgt_rev) doCnd_srch_tgt_rev_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Cnd_purc_schd_dt) doCnd_purc_schd_dt_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_ac_ym) doHdr_ac_ym_NE(info);
		else if (ne == Hdr_sls_act_no) doHdr_sls_act_no_NE(info);
		else if (ne == Hdr_sls_act_rev) doHdr_sls_act_rev_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_edi_flg) doHdr_edi_flg_NE(info);
		else if (ne == Hdr_sls_act_seq) doHdr_sls_act_seq_NE(info);
		else if (ne == Hdr_dlv_slip_no) doHdr_dlv_slip_no_NE(info);
		else if (ne == Hdr_sls_dt) doHdr_sls_dt_NE(info);
		else if (ne == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NE(info);
		else if (ne == Hdr_dest_cd1) doHdr_dest_cd1_NE(info);
		else if (ne == Hdr_dest_nm1) doHdr_dest_nm1_NE(info);
		else if (ne == Hdr_dest_cd2) doHdr_dest_cd2_NE(info);
		else if (ne == Hdr_dest_nm2) doHdr_dest_nm2_NE(info);
		else if (ne == Hdr_dest_cd3) doHdr_dest_cd3_NE(info);
		else if (ne == Hdr_dest_nm3) doHdr_dest_nm3_NE(info);
		else if (ne == Hdr_cst_cd) doHdr_cst_cd_NE(info);
		else if (ne == Hdr_cst_nm) doHdr_cst_nm_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_dlv_slip_out_flg) doHdr_dlv_slip_out_flg_NE(info);
		else if (ne == Hdr_dlv_slip_prntd_flg) doHdr_dlv_slip_prntd_flg_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NE(info);
		else if (ne == Hdr_xrate_cd) doHdr_xrate_cd_NE(info);
		else if (ne == Hdr_purc_xrate_cd) doHdr_purc_xrate_cd_NE(info);
		else if (ne == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NE(info);
		else if (ne == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NE(info);
		else if (ne == Hdr_ptax_xrate_inpt_flg) doHdr_ptax_xrate_inpt_flg_NE(info);
		else if (ne == Hdr_qtn_no) doHdr_qtn_no_NE(info);
		else if (ne == Hdr_qtn_rev) doHdr_qtn_rev_NE(info);
		else if (ne == Hdr_slo_no) doHdr_slo_no_NE(info);
		else if (ne == Hdr_cst_po_no) doHdr_cst_po_no_NE(info);
		else if (ne == Hdr_prof_rate) doHdr_prof_rate_NE(info);
		else if (ne == Hdr_acst_cd) doHdr_acst_cd_NE(info);
		else if (ne == Hdr_acst_nm) doHdr_acst_nm_NE(info);
		else if (ne == Hdr_ar_dpt_cd) doHdr_ar_dpt_cd_NE(info);
		else if (ne == Hdr_ar_dpt_nm) doHdr_ar_dpt_nm_NE(info);
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
		else if (ne == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_NE(info);
		else if (ne == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_NE(info);
		else if (ne == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_xrate_rnd_typ) doHdr_xrate_rnd_typ_NE(info);
		else if (ne == Hdr_wtax_rnd_typ) doHdr_wtax_rnd_typ_NE(info);
		else if (ne == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_NE(info);
		else if (ne == Hdr_cst_bill_crryovr_times) doHdr_cst_bill_crryovr_times_NE(info);
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
		else if (ne == columnDtl_sync_flg) doDtl_sync_flg_NE(info);
		else if (ne == columnDtl_abort_flg) doDtl_abort_flg_NE(info);
		else if (ne == columnDtl_dlv_schd_dt) doDtl_dlv_schd_dt_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_dest_cd1) doDtl_dest_cd1_NE(info);
		else if (ne == columnDtl_dest_nm1) doDtl_dest_nm1_NE(info);
		else if (ne == columnDtl_dest_cd2) doDtl_dest_cd2_NE(info);
		else if (ne == columnDtl_dest_nm2) doDtl_dest_nm2_NE(info);
		else if (ne == columnDtl_dest_cd3) doDtl_dest_cd3_NE(info);
		else if (ne == columnDtl_dest_nm3) doDtl_dest_nm3_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_sls_dtl_upd_flg) doDtl_sls_dtl_upd_flg_NE(info);
		else if (ne == columnDtl_prof_rate) doDtl_prof_rate_NE(info);
		else if (ne == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NE(info);
		else if (ne == columnDtl_sls_rsn_cd) doDtl_sls_rsn_cd_NE(info);
		else if (ne == columnDtl_sls_rsn_nm) doDtl_sls_rsn_nm_NE(info);
		else if (ne == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NE(info);
		else if (ne == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NE(info);
		else if (ne == columnDtl_wtax_rate) doDtl_wtax_rate_NE(info);
		else if (ne == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NE(info);
		else if (ne == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NE(info);
		else if (ne == columnDtl_ext_purc_act_d_no) doDtl_ext_purc_act_d_no_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_NE(info);
		else if (ne == columnDtl_purc_ac_ym) doDtl_purc_ac_ym_NE(info);
		else if (ne == columnDtl_purc_ac_dt) doDtl_purc_ac_dt_NE(info);
		else if (ne == columnDtl_purc_dt) doDtl_purc_dt_NE(info);
		else if (ne == columnDtl_purc_act_no) doDtl_purc_act_no_NE(info);
		else if (ne == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NE(info);
		else if (ne == columnDtl_po_no) doDtl_po_no_NE(info);
		else if (ne == columnDtl_po_d_no) doDtl_po_d_no_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_sppl_nm) doDtl_sppl_nm_NE(info);
		else if (ne == columnDtl_sppl_iv_flg) doDtl_sppl_iv_flg_NE(info);
		else if (ne == columnDtl_subcon_flg) doDtl_subcon_flg_NE(info);
		else if (ne == columnDtl_maker_cd) doDtl_maker_cd_NE(info);
		else if (ne == columnDtl_maker_nm) doDtl_maker_nm_NE(info);
		else if (ne == columnDtl_bp_dlv_slip_no) doDtl_bp_dlv_slip_no_NE(info);
		else if (ne == columnDtl_bp_dlv_slip_d_no) doDtl_bp_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_bp_lot_no) doDtl_bp_lot_no_NE(info);
		else if (ne == columnDtl_ship_fr_valid_dt) doDtl_ship_fr_valid_dt_NE(info);
		else if (ne == columnDtl_purc_trd_cur_cd) doDtl_purc_trd_cur_cd_NE(info);
		else if (ne == columnDtl_purc_trd_cur_nm) doDtl_purc_trd_cur_nm_NE(info);
		else if (ne == columnDtl_purc_xrate_inpt_flg) doDtl_purc_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_purc_ptax_xrate_inpt_flg) doDtl_purc_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_purc_dtl_upd_flg) doDtl_purc_dtl_upd_flg_NE(info);
		else if (ne == columnDtl_ptax_dt) doDtl_ptax_dt_NE(info);
		else if (ne == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_NE(info);
		else if (ne == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NE(info);
		else if (ne == columnDtl_purc_bd_dpt_cd) doDtl_purc_bd_dpt_cd_NE(info);
		else if (ne == columnDtl_purc_bd_dpt_nm) doDtl_purc_bd_dpt_nm_NE(info);
		else if (ne == columnDtl_purc_wtax_rate) doDtl_purc_wtax_rate_NE(info);
		else if (ne == columnDtl_purc_wtax_amt) doDtl_purc_wtax_amt_NE(info);
		else if (ne == columnDtl_base_unit_purc_schd_qty) doDtl_base_unit_purc_schd_qty_NE(info);
		else if (ne == columnDtl_po_print_rmrks) doDtl_po_print_rmrks_NE(info);
		else if (ne == columnDtl_po_print_d_rmrks) doDtl_po_print_d_rmrks_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_lot_no_typ) doDtl_lot_no_typ_NE(info);
		else if (ne == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_itm_bill_crryovr_times) doDtl_itm_bill_crryovr_times_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NE(info);
		else if (ne == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NE(info);
		else if (ne == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NE(info);
		else if (ne == columnDtl_sls_act_no) doDtl_sls_act_no_NE(info);
		else if (ne == columnDtl_sls_act_seq) doDtl_sls_act_seq_NE(info);
		else if (ne == columnDtl_sls_act_d_seq) doDtl_sls_act_d_seq_NE(info);
		else if (ne == columnDtl_sls_schd_no) doDtl_sls_schd_no_NE(info);
		else if (ne == columnDtl_purc_schd_no) doDtl_purc_schd_no_NE(info);
		else if (ne == columnDtl_dtl_row_id) doDtl_dtl_row_id_NE(info);
		else if (ne == columnDtl_arr_pr_no) doDtl_arr_pr_no_NE(info);
		else if (ne == columnDtl_ship_pr_no) doDtl_ship_pr_no_NE(info);
		else if (ne == columnDtl_schd_trd_unit_conv_base_qty) doDtl_schd_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_schd_trd_unit_conv_qty) doDtl_schd_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_NE(info);
		else if (ne == columnDtl_purc_upri_rnd_typ) doDtl_purc_upri_rnd_typ_NE(info);
		else if (ne == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_NE(info);
		else if (ne == columnDtl_purc_trd_cur_amt_dec_place) doDtl_purc_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_purc_trd_cur_upri_dec_place) doDtl_purc_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_purc_s_trd_unit_conv_base_qty) doDtl_purc_s_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_purc_s_trd_unit_conv_qty) doDtl_purc_s_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_purc_trd_unit_cd) doDtl_purc_trd_unit_cd_NE(info);
		else if (ne == columnDtl_purc_trd_unit_conv_base_qty) doDtl_purc_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_purc_trd_unit_conv_qty) doDtl_purc_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_purc_trd_unit_dec_place) doDtl_purc_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_xrate_purc_dt) doDtl_xrate_purc_dt_NE(info);
		else if (ne == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_NE(info);
		else if (ne == columnDtl_base_unit_purc_qty) doDtl_base_unit_purc_qty_NE(info);
		else if (ne == columnIo_trd_unit_cd) doIo_trd_unit_cd_NE(info);
		else if (ne == columnIo_trd_unit_nm) doIo_trd_unit_nm_NE(info);
		else if (ne == columnIo_base_unit_cd) doIo_base_unit_cd_NE(info);
		else if (ne == columnIo_base_unit_nm) doIo_base_unit_nm_NE(info);
		else if (ne == columnIo_gd_cd) doIo_gd_cd_NE(info);
		else if (ne == columnIo_gd_nm) doIo_gd_nm_NE(info);
		else if (ne == columnIo_bp_dlv_slip_no) doIo_bp_dlv_slip_no_NE(info);
		else if (ne == columnIo_bp_dlv_slip_d_no) doIo_bp_dlv_slip_d_no_NE(info);
		else if (ne == columnIo_bp_lot_no) doIo_bp_lot_no_NE(info);
		else if (ne == columnIo_ship_fr_valid_dt) doIo_ship_fr_valid_dt_NE(info);
		else if (ne == columnIo_purc_act_io_no) doIo_purc_act_io_no_NE(info);
		else if (ne == columnIo_sls_act_io_no) doIo_sls_act_io_no_NE(info);
		else if (ne == columnIo_sub_char1) doIo_sub_char1_NE(info);
		else if (ne == columnIo_sub_char2) doIo_sub_char2_NE(info);
		else if (ne == columnIo_sub_char3) doIo_sub_char3_NE(info);
		else if (ne == columnIo_trd_unit_dec_place) doIo_trd_unit_dec_place_NE(info);
		else if (ne == columnIo_trd_unit_conv_base_qty) doIo_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnIo_trd_unit_conv_qty) doIo_trd_unit_conv_qty_NE(info);
		else if (ne == columnIo_trd_unit_rnd_typ) doIo_trd_unit_rnd_typ_NE(info);
		else if (ne == columnIo_itm_cd) doIo_itm_cd_NE(info);
		else if (ne == columnIo_itm_sub1) doIo_itm_sub1_NE(info);
		else if (ne == columnIo_itm_sub2) doIo_itm_sub2_NE(info);
		else if (ne == columnIo_itm_sub3) doIo_itm_sub3_NE(info);
		else if (ne == columnIo_lot_mng_typ) doIo_lot_mng_typ_NE(info);
		else if (ne == columnIo_sublot_mng_typ) doIo_sublot_mng_typ_NE(info);
		else if (ne == columnIo_lot_no_typ) doIo_lot_no_typ_NE(info);
		else if (ne == columnIo_sublot_no_typ) doIo_sublot_no_typ_NE(info);
		else if (ne == columnIo_sno1_mng_typ) doIo_sno1_mng_typ_NE(info);
		else if (ne == columnIo_sno2_mng_typ) doIo_sno2_mng_typ_NE(info);
		else if (ne == columnIo_sno3_mng_typ) doIo_sno3_mng_typ_NE(info);
		else if (ne == columnIo_sno4_mng_typ) doIo_sno4_mng_typ_NE(info);
		else if (ne == columnIo_stk_mng_typ) doIo_stk_mng_typ_NE(info);
		else if (ne == columnIo_base_unit_dec_place) doIo_base_unit_dec_place_NE(info);
		else if (ne == columnIo_base_unit_rnd_typ) doIo_base_unit_rnd_typ_NE(info);
		else if (ne == columnIo_cont_fctr_flg) doIo_cont_fctr_flg_NE(info);
		else if (ne == columnIo_cont_fctr_rnd_typ) doIo_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnIo_cont_fctr_dec_place) doIo_cont_fctr_dec_place_NE(info);
		else if (ne == columnIo_ver_flg) doIo_ver_flg_NE(info);
		else if (ne == columnIo_sls_act_io_seq) doIo_sls_act_io_seq_NE(info);
		else if (ne == columnIo_purc_act_io_seq) doIo_purc_act_io_seq_NE(info);
		else if (ne == columnIo_dtl_row_id) doIo_dtl_row_id_NE(info);
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
	 * [Io]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_seq_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[dlv_slip_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prntd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_prntd_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_xrate_cd_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_xrate_inpt_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wtax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wtax_rnd_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_schd_dt_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_dtl_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dtl_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_purc_act_d_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_subcon_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_valid_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_valid_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dtl_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dtl_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_wtax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_wtax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_schd_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_purc_schd_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_bill_crryovr_times_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_row_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_row_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_s_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_s_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_purc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_purc_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_purc_qty_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[ship_fr_valid_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_ship_fr_valid_dt_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[purc_act_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_purc_act_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sls_act_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sls_act_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sls_act_io_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sls_act_io_seq_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[purc_act_io_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_purc_act_io_seq_NE(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[dtl_row_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_dtl_row_id_NE(MCEventInfo info){
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
		else if (nx == IoTable) doIo_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NX(info);
		else if (nx == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NX(info);
		else if (nx == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NX(info);
		else if (nx == Cnd_srch_tgt_rev) doCnd_srch_tgt_rev_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Cnd_purc_schd_dt) doCnd_purc_schd_dt_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_ac_ym) doHdr_ac_ym_NX(info);
		else if (nx == Hdr_sls_act_no) doHdr_sls_act_no_NX(info);
		else if (nx == Hdr_sls_act_rev) doHdr_sls_act_rev_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_edi_flg) doHdr_edi_flg_NX(info);
		else if (nx == Hdr_sls_act_seq) doHdr_sls_act_seq_NX(info);
		else if (nx == Hdr_dlv_slip_no) doHdr_dlv_slip_no_NX(info);
		else if (nx == Hdr_sls_dt) doHdr_sls_dt_NX(info);
		else if (nx == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NX(info);
		else if (nx == Hdr_dest_cd1) doHdr_dest_cd1_NX(info);
		else if (nx == Hdr_dest_nm1) doHdr_dest_nm1_NX(info);
		else if (nx == Hdr_dest_cd2) doHdr_dest_cd2_NX(info);
		else if (nx == Hdr_dest_nm2) doHdr_dest_nm2_NX(info);
		else if (nx == Hdr_dest_cd3) doHdr_dest_cd3_NX(info);
		else if (nx == Hdr_dest_nm3) doHdr_dest_nm3_NX(info);
		else if (nx == Hdr_cst_cd) doHdr_cst_cd_NX(info);
		else if (nx == Hdr_cst_nm) doHdr_cst_nm_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_dlv_slip_out_flg) doHdr_dlv_slip_out_flg_NX(info);
		else if (nx == Hdr_dlv_slip_prntd_flg) doHdr_dlv_slip_prntd_flg_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NX(info);
		else if (nx == Hdr_xrate_cd) doHdr_xrate_cd_NX(info);
		else if (nx == Hdr_purc_xrate_cd) doHdr_purc_xrate_cd_NX(info);
		else if (nx == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NX(info);
		else if (nx == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NX(info);
		else if (nx == Hdr_ptax_xrate_inpt_flg) doHdr_ptax_xrate_inpt_flg_NX(info);
		else if (nx == Hdr_qtn_no) doHdr_qtn_no_NX(info);
		else if (nx == Hdr_qtn_rev) doHdr_qtn_rev_NX(info);
		else if (nx == Hdr_slo_no) doHdr_slo_no_NX(info);
		else if (nx == Hdr_cst_po_no) doHdr_cst_po_no_NX(info);
		else if (nx == Hdr_prof_rate) doHdr_prof_rate_NX(info);
		else if (nx == Hdr_acst_cd) doHdr_acst_cd_NX(info);
		else if (nx == Hdr_acst_nm) doHdr_acst_nm_NX(info);
		else if (nx == Hdr_ar_dpt_cd) doHdr_ar_dpt_cd_NX(info);
		else if (nx == Hdr_ar_dpt_nm) doHdr_ar_dpt_nm_NX(info);
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
		else if (nx == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_NX(info);
		else if (nx == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_NX(info);
		else if (nx == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_xrate_rnd_typ) doHdr_xrate_rnd_typ_NX(info);
		else if (nx == Hdr_wtax_rnd_typ) doHdr_wtax_rnd_typ_NX(info);
		else if (nx == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_NX(info);
		else if (nx == Hdr_cst_bill_crryovr_times) doHdr_cst_bill_crryovr_times_NX(info);
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
		else if (nx == columnDtl_sync_flg) doDtl_sync_flg_NX(info);
		else if (nx == columnDtl_abort_flg) doDtl_abort_flg_NX(info);
		else if (nx == columnDtl_dlv_schd_dt) doDtl_dlv_schd_dt_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_dest_cd1) doDtl_dest_cd1_NX(info);
		else if (nx == columnDtl_dest_nm1) doDtl_dest_nm1_NX(info);
		else if (nx == columnDtl_dest_cd2) doDtl_dest_cd2_NX(info);
		else if (nx == columnDtl_dest_nm2) doDtl_dest_nm2_NX(info);
		else if (nx == columnDtl_dest_cd3) doDtl_dest_cd3_NX(info);
		else if (nx == columnDtl_dest_nm3) doDtl_dest_nm3_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_sls_dtl_upd_flg) doDtl_sls_dtl_upd_flg_NX(info);
		else if (nx == columnDtl_prof_rate) doDtl_prof_rate_NX(info);
		else if (nx == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NX(info);
		else if (nx == columnDtl_sls_rsn_cd) doDtl_sls_rsn_cd_NX(info);
		else if (nx == columnDtl_sls_rsn_nm) doDtl_sls_rsn_nm_NX(info);
		else if (nx == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NX(info);
		else if (nx == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NX(info);
		else if (nx == columnDtl_wtax_rate) doDtl_wtax_rate_NX(info);
		else if (nx == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NX(info);
		else if (nx == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NX(info);
		else if (nx == columnDtl_ext_purc_act_d_no) doDtl_ext_purc_act_d_no_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_NX(info);
		else if (nx == columnDtl_purc_ac_ym) doDtl_purc_ac_ym_NX(info);
		else if (nx == columnDtl_purc_ac_dt) doDtl_purc_ac_dt_NX(info);
		else if (nx == columnDtl_purc_dt) doDtl_purc_dt_NX(info);
		else if (nx == columnDtl_purc_act_no) doDtl_purc_act_no_NX(info);
		else if (nx == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NX(info);
		else if (nx == columnDtl_po_no) doDtl_po_no_NX(info);
		else if (nx == columnDtl_po_d_no) doDtl_po_d_no_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_sppl_nm) doDtl_sppl_nm_NX(info);
		else if (nx == columnDtl_sppl_iv_flg) doDtl_sppl_iv_flg_NX(info);
		else if (nx == columnDtl_subcon_flg) doDtl_subcon_flg_NX(info);
		else if (nx == columnDtl_maker_cd) doDtl_maker_cd_NX(info);
		else if (nx == columnDtl_maker_nm) doDtl_maker_nm_NX(info);
		else if (nx == columnDtl_bp_dlv_slip_no) doDtl_bp_dlv_slip_no_NX(info);
		else if (nx == columnDtl_bp_dlv_slip_d_no) doDtl_bp_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_bp_lot_no) doDtl_bp_lot_no_NX(info);
		else if (nx == columnDtl_ship_fr_valid_dt) doDtl_ship_fr_valid_dt_NX(info);
		else if (nx == columnDtl_purc_trd_cur_cd) doDtl_purc_trd_cur_cd_NX(info);
		else if (nx == columnDtl_purc_trd_cur_nm) doDtl_purc_trd_cur_nm_NX(info);
		else if (nx == columnDtl_purc_xrate_inpt_flg) doDtl_purc_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_purc_ptax_xrate_inpt_flg) doDtl_purc_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_purc_dtl_upd_flg) doDtl_purc_dtl_upd_flg_NX(info);
		else if (nx == columnDtl_ptax_dt) doDtl_ptax_dt_NX(info);
		else if (nx == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_NX(info);
		else if (nx == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NX(info);
		else if (nx == columnDtl_purc_bd_dpt_cd) doDtl_purc_bd_dpt_cd_NX(info);
		else if (nx == columnDtl_purc_bd_dpt_nm) doDtl_purc_bd_dpt_nm_NX(info);
		else if (nx == columnDtl_purc_wtax_rate) doDtl_purc_wtax_rate_NX(info);
		else if (nx == columnDtl_purc_wtax_amt) doDtl_purc_wtax_amt_NX(info);
		else if (nx == columnDtl_base_unit_purc_schd_qty) doDtl_base_unit_purc_schd_qty_NX(info);
		else if (nx == columnDtl_po_print_rmrks) doDtl_po_print_rmrks_NX(info);
		else if (nx == columnDtl_po_print_d_rmrks) doDtl_po_print_d_rmrks_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_lot_no_typ) doDtl_lot_no_typ_NX(info);
		else if (nx == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_itm_bill_crryovr_times) doDtl_itm_bill_crryovr_times_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NX(info);
		else if (nx == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NX(info);
		else if (nx == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NX(info);
		else if (nx == columnDtl_sls_act_no) doDtl_sls_act_no_NX(info);
		else if (nx == columnDtl_sls_act_seq) doDtl_sls_act_seq_NX(info);
		else if (nx == columnDtl_sls_act_d_seq) doDtl_sls_act_d_seq_NX(info);
		else if (nx == columnDtl_sls_schd_no) doDtl_sls_schd_no_NX(info);
		else if (nx == columnDtl_purc_schd_no) doDtl_purc_schd_no_NX(info);
		else if (nx == columnDtl_dtl_row_id) doDtl_dtl_row_id_NX(info);
		else if (nx == columnDtl_arr_pr_no) doDtl_arr_pr_no_NX(info);
		else if (nx == columnDtl_ship_pr_no) doDtl_ship_pr_no_NX(info);
		else if (nx == columnDtl_schd_trd_unit_conv_base_qty) doDtl_schd_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_schd_trd_unit_conv_qty) doDtl_schd_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_NX(info);
		else if (nx == columnDtl_purc_upri_rnd_typ) doDtl_purc_upri_rnd_typ_NX(info);
		else if (nx == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_NX(info);
		else if (nx == columnDtl_purc_trd_cur_amt_dec_place) doDtl_purc_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_purc_trd_cur_upri_dec_place) doDtl_purc_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_purc_s_trd_unit_conv_base_qty) doDtl_purc_s_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_purc_s_trd_unit_conv_qty) doDtl_purc_s_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_purc_trd_unit_cd) doDtl_purc_trd_unit_cd_NX(info);
		else if (nx == columnDtl_purc_trd_unit_conv_base_qty) doDtl_purc_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_purc_trd_unit_conv_qty) doDtl_purc_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_purc_trd_unit_dec_place) doDtl_purc_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_xrate_purc_dt) doDtl_xrate_purc_dt_NX(info);
		else if (nx == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_NX(info);
		else if (nx == columnDtl_base_unit_purc_qty) doDtl_base_unit_purc_qty_NX(info);
		else if (nx == columnIo_trd_unit_cd) doIo_trd_unit_cd_NX(info);
		else if (nx == columnIo_trd_unit_nm) doIo_trd_unit_nm_NX(info);
		else if (nx == columnIo_base_unit_cd) doIo_base_unit_cd_NX(info);
		else if (nx == columnIo_base_unit_nm) doIo_base_unit_nm_NX(info);
		else if (nx == columnIo_gd_cd) doIo_gd_cd_NX(info);
		else if (nx == columnIo_gd_nm) doIo_gd_nm_NX(info);
		else if (nx == columnIo_bp_dlv_slip_no) doIo_bp_dlv_slip_no_NX(info);
		else if (nx == columnIo_bp_dlv_slip_d_no) doIo_bp_dlv_slip_d_no_NX(info);
		else if (nx == columnIo_bp_lot_no) doIo_bp_lot_no_NX(info);
		else if (nx == columnIo_ship_fr_valid_dt) doIo_ship_fr_valid_dt_NX(info);
		else if (nx == columnIo_purc_act_io_no) doIo_purc_act_io_no_NX(info);
		else if (nx == columnIo_sls_act_io_no) doIo_sls_act_io_no_NX(info);
		else if (nx == columnIo_sub_char1) doIo_sub_char1_NX(info);
		else if (nx == columnIo_sub_char2) doIo_sub_char2_NX(info);
		else if (nx == columnIo_sub_char3) doIo_sub_char3_NX(info);
		else if (nx == columnIo_trd_unit_dec_place) doIo_trd_unit_dec_place_NX(info);
		else if (nx == columnIo_trd_unit_conv_base_qty) doIo_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnIo_trd_unit_conv_qty) doIo_trd_unit_conv_qty_NX(info);
		else if (nx == columnIo_trd_unit_rnd_typ) doIo_trd_unit_rnd_typ_NX(info);
		else if (nx == columnIo_itm_cd) doIo_itm_cd_NX(info);
		else if (nx == columnIo_itm_sub1) doIo_itm_sub1_NX(info);
		else if (nx == columnIo_itm_sub2) doIo_itm_sub2_NX(info);
		else if (nx == columnIo_itm_sub3) doIo_itm_sub3_NX(info);
		else if (nx == columnIo_lot_mng_typ) doIo_lot_mng_typ_NX(info);
		else if (nx == columnIo_sublot_mng_typ) doIo_sublot_mng_typ_NX(info);
		else if (nx == columnIo_lot_no_typ) doIo_lot_no_typ_NX(info);
		else if (nx == columnIo_sublot_no_typ) doIo_sublot_no_typ_NX(info);
		else if (nx == columnIo_sno1_mng_typ) doIo_sno1_mng_typ_NX(info);
		else if (nx == columnIo_sno2_mng_typ) doIo_sno2_mng_typ_NX(info);
		else if (nx == columnIo_sno3_mng_typ) doIo_sno3_mng_typ_NX(info);
		else if (nx == columnIo_sno4_mng_typ) doIo_sno4_mng_typ_NX(info);
		else if (nx == columnIo_stk_mng_typ) doIo_stk_mng_typ_NX(info);
		else if (nx == columnIo_base_unit_dec_place) doIo_base_unit_dec_place_NX(info);
		else if (nx == columnIo_base_unit_rnd_typ) doIo_base_unit_rnd_typ_NX(info);
		else if (nx == columnIo_cont_fctr_flg) doIo_cont_fctr_flg_NX(info);
		else if (nx == columnIo_cont_fctr_rnd_typ) doIo_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnIo_cont_fctr_dec_place) doIo_cont_fctr_dec_place_NX(info);
		else if (nx == columnIo_ver_flg) doIo_ver_flg_NX(info);
		else if (nx == columnIo_sls_act_io_seq) doIo_sls_act_io_seq_NX(info);
		else if (nx == columnIo_purc_act_io_seq) doIo_purc_act_io_seq_NX(info);
		else if (nx == columnIo_dtl_row_id) doIo_dtl_row_id_NX(info);
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
	 * [Io]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_act_seq_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[dlv_slip_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prntd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_prntd_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_xrate_cd_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_xrate_inpt_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wtax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wtax_rnd_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_schd_dt_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_dtl_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dtl_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prof_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_purc_act_d_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_subcon_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_valid_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_valid_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dtl_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dtl_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_wtax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_wtax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_schd_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_purc_schd_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_bill_crryovr_times_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_row_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_row_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_s_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_s_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_purc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_purc_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_purc_qty_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[ship_fr_valid_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_ship_fr_valid_dt_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[purc_act_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_purc_act_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sls_act_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sls_act_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sls_act_io_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sls_act_io_seq_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[purc_act_io_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_purc_act_io_seq_NX(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[dtl_row_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_dtl_row_id_NX(MCEventInfo info){
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
		else if (lc == Cnd_purc_schd_dt) doCnd_purc_schd_dt_LC(info);
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
		else if (lc == Hdr_dest_cd1) doHdr_dest_cd1_LC(info);
		else if (lc == Hdr_dest_nm1) doHdr_dest_nm1_LC(info);
		else if (lc == Hdr_dest_cd2) doHdr_dest_cd2_LC(info);
		else if (lc == Hdr_dest_nm2) doHdr_dest_nm2_LC(info);
		else if (lc == Hdr_dest_cd3) doHdr_dest_cd3_LC(info);
		else if (lc == Hdr_dest_nm3) doHdr_dest_nm3_LC(info);
		else if (lc == Hdr_cst_cd) doHdr_cst_cd_LC(info);
		else if (lc == Hdr_cst_nm) doHdr_cst_nm_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_xrate_cd) doHdr_xrate_cd_LC(info);
		else if (lc == Hdr_purc_xrate_cd) doHdr_purc_xrate_cd_LC(info);
		else if (lc == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_LC(info);
		else if (lc == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_LC(info);
		else if (lc == Hdr_qtn_no) doHdr_qtn_no_LC(info);
		else if (lc == Hdr_qtn_rev) doHdr_qtn_rev_LC(info);
		else if (lc == Hdr_slo_no) doHdr_slo_no_LC(info);
		else if (lc == Hdr_cst_po_no) doHdr_cst_po_no_LC(info);
		else if (lc == Hdr_prof_rate) doHdr_prof_rate_LC(info);
		else if (lc == Hdr_acst_cd) doHdr_acst_cd_LC(info);
		else if (lc == Hdr_acst_nm) doHdr_acst_nm_LC(info);
		else if (lc == Hdr_ar_dpt_cd) doHdr_ar_dpt_cd_LC(info);
		else if (lc == Hdr_ar_dpt_nm) doHdr_ar_dpt_nm_LC(info);
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
		else if (lc == Hdr_sls_amt_rnd_typ) doHdr_sls_amt_rnd_typ_LC(info);
		else if (lc == Hdr_sls_tax_rnd_typ) doHdr_sls_tax_rnd_typ_LC(info);
		else if (lc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_xrate_rnd_typ) doHdr_xrate_rnd_typ_LC(info);
		else if (lc == Hdr_wtax_rnd_typ) doHdr_wtax_rnd_typ_LC(info);
		else if (lc == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_LC(info);
		else if (lc == Hdr_cst_bill_crryovr_times) doHdr_cst_bill_crryovr_times_LC(info);
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
		else if (lc == columnDtl_dlv_schd_dt) doDtl_dlv_schd_dt_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_dest_cd1) doDtl_dest_cd1_LC(info);
		else if (lc == columnDtl_dest_nm1) doDtl_dest_nm1_LC(info);
		else if (lc == columnDtl_dest_cd2) doDtl_dest_cd2_LC(info);
		else if (lc == columnDtl_dest_nm2) doDtl_dest_nm2_LC(info);
		else if (lc == columnDtl_dest_cd3) doDtl_dest_cd3_LC(info);
		else if (lc == columnDtl_dest_nm3) doDtl_dest_nm3_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_prof_rate) doDtl_prof_rate_LC(info);
		else if (lc == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_LC(info);
		else if (lc == columnDtl_sls_rsn_cd) doDtl_sls_rsn_cd_LC(info);
		else if (lc == columnDtl_sls_rsn_nm) doDtl_sls_rsn_nm_LC(info);
		else if (lc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_LC(info);
		else if (lc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_LC(info);
		else if (lc == columnDtl_wtax_rate) doDtl_wtax_rate_LC(info);
		else if (lc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_LC(info);
		else if (lc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_LC(info);
		else if (lc == columnDtl_ext_purc_act_d_no) doDtl_ext_purc_act_d_no_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_sls_act_d_no) doDtl_sls_act_d_no_LC(info);
		else if (lc == columnDtl_purc_ac_ym) doDtl_purc_ac_ym_LC(info);
		else if (lc == columnDtl_purc_ac_dt) doDtl_purc_ac_dt_LC(info);
		else if (lc == columnDtl_purc_dt) doDtl_purc_dt_LC(info);
		else if (lc == columnDtl_purc_act_no) doDtl_purc_act_no_LC(info);
		else if (lc == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_LC(info);
		else if (lc == columnDtl_po_no) doDtl_po_no_LC(info);
		else if (lc == columnDtl_po_d_no) doDtl_po_d_no_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_sppl_nm) doDtl_sppl_nm_LC(info);
		else if (lc == columnDtl_maker_cd) doDtl_maker_cd_LC(info);
		else if (lc == columnDtl_maker_nm) doDtl_maker_nm_LC(info);
		else if (lc == columnDtl_bp_dlv_slip_no) doDtl_bp_dlv_slip_no_LC(info);
		else if (lc == columnDtl_bp_dlv_slip_d_no) doDtl_bp_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_bp_lot_no) doDtl_bp_lot_no_LC(info);
		else if (lc == columnDtl_ship_fr_valid_dt) doDtl_ship_fr_valid_dt_LC(info);
		else if (lc == columnDtl_purc_trd_cur_cd) doDtl_purc_trd_cur_cd_LC(info);
		else if (lc == columnDtl_purc_trd_cur_nm) doDtl_purc_trd_cur_nm_LC(info);
		else if (lc == columnDtl_ptax_dt) doDtl_ptax_dt_LC(info);
		else if (lc == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_LC(info);
		else if (lc == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_LC(info);
		else if (lc == columnDtl_purc_bd_dpt_cd) doDtl_purc_bd_dpt_cd_LC(info);
		else if (lc == columnDtl_purc_bd_dpt_nm) doDtl_purc_bd_dpt_nm_LC(info);
		else if (lc == columnDtl_purc_wtax_rate) doDtl_purc_wtax_rate_LC(info);
		else if (lc == columnDtl_purc_wtax_amt) doDtl_purc_wtax_amt_LC(info);
		else if (lc == columnDtl_base_unit_purc_schd_qty) doDtl_base_unit_purc_schd_qty_LC(info);
		else if (lc == columnDtl_po_print_rmrks) doDtl_po_print_rmrks_LC(info);
		else if (lc == columnDtl_po_print_d_rmrks) doDtl_po_print_d_rmrks_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_lot_no_typ) doDtl_lot_no_typ_LC(info);
		else if (lc == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_itm_bill_crryovr_times) doDtl_itm_bill_crryovr_times_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_sls_act_no) doDtl_sls_act_no_LC(info);
		else if (lc == columnDtl_sls_act_seq) doDtl_sls_act_seq_LC(info);
		else if (lc == columnDtl_sls_act_d_seq) doDtl_sls_act_d_seq_LC(info);
		else if (lc == columnDtl_sls_schd_no) doDtl_sls_schd_no_LC(info);
		else if (lc == columnDtl_purc_schd_no) doDtl_purc_schd_no_LC(info);
		else if (lc == columnDtl_dtl_row_id) doDtl_dtl_row_id_LC(info);
		else if (lc == columnDtl_arr_pr_no) doDtl_arr_pr_no_LC(info);
		else if (lc == columnDtl_ship_pr_no) doDtl_ship_pr_no_LC(info);
		else if (lc == columnDtl_schd_trd_unit_conv_base_qty) doDtl_schd_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_schd_trd_unit_conv_qty) doDtl_schd_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_LC(info);
		else if (lc == columnDtl_purc_upri_rnd_typ) doDtl_purc_upri_rnd_typ_LC(info);
		else if (lc == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_LC(info);
		else if (lc == columnDtl_purc_trd_cur_amt_dec_place) doDtl_purc_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_purc_trd_cur_upri_dec_place) doDtl_purc_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_purc_s_trd_unit_conv_base_qty) doDtl_purc_s_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_purc_s_trd_unit_conv_qty) doDtl_purc_s_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_purc_trd_unit_cd) doDtl_purc_trd_unit_cd_LC(info);
		else if (lc == columnDtl_purc_trd_unit_conv_base_qty) doDtl_purc_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_purc_trd_unit_conv_qty) doDtl_purc_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_purc_trd_unit_dec_place) doDtl_purc_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_xrate_purc_dt) doDtl_xrate_purc_dt_LC(info);
		else if (lc == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_LC(info);
		else if (lc == columnDtl_base_unit_purc_qty) doDtl_base_unit_purc_qty_LC(info);
		else if (lc == columnIo_trd_unit_cd) doIo_trd_unit_cd_LC(info);
		else if (lc == columnIo_trd_unit_nm) doIo_trd_unit_nm_LC(info);
		else if (lc == columnIo_base_unit_cd) doIo_base_unit_cd_LC(info);
		else if (lc == columnIo_base_unit_nm) doIo_base_unit_nm_LC(info);
		else if (lc == columnIo_gd_cd) doIo_gd_cd_LC(info);
		else if (lc == columnIo_gd_nm) doIo_gd_nm_LC(info);
		else if (lc == columnIo_bp_dlv_slip_no) doIo_bp_dlv_slip_no_LC(info);
		else if (lc == columnIo_bp_dlv_slip_d_no) doIo_bp_dlv_slip_d_no_LC(info);
		else if (lc == columnIo_bp_lot_no) doIo_bp_lot_no_LC(info);
		else if (lc == columnIo_ship_fr_valid_dt) doIo_ship_fr_valid_dt_LC(info);
		else if (lc == columnIo_purc_act_io_no) doIo_purc_act_io_no_LC(info);
		else if (lc == columnIo_sls_act_io_no) doIo_sls_act_io_no_LC(info);
		else if (lc == columnIo_sub_char1) doIo_sub_char1_LC(info);
		else if (lc == columnIo_sub_char2) doIo_sub_char2_LC(info);
		else if (lc == columnIo_sub_char3) doIo_sub_char3_LC(info);
		else if (lc == columnIo_trd_unit_dec_place) doIo_trd_unit_dec_place_LC(info);
		else if (lc == columnIo_trd_unit_conv_base_qty) doIo_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnIo_trd_unit_conv_qty) doIo_trd_unit_conv_qty_LC(info);
		else if (lc == columnIo_trd_unit_rnd_typ) doIo_trd_unit_rnd_typ_LC(info);
		else if (lc == columnIo_itm_cd) doIo_itm_cd_LC(info);
		else if (lc == columnIo_itm_sub1) doIo_itm_sub1_LC(info);
		else if (lc == columnIo_itm_sub2) doIo_itm_sub2_LC(info);
		else if (lc == columnIo_itm_sub3) doIo_itm_sub3_LC(info);
		else if (lc == columnIo_lot_mng_typ) doIo_lot_mng_typ_LC(info);
		else if (lc == columnIo_sublot_mng_typ) doIo_sublot_mng_typ_LC(info);
		else if (lc == columnIo_lot_no_typ) doIo_lot_no_typ_LC(info);
		else if (lc == columnIo_sublot_no_typ) doIo_sublot_no_typ_LC(info);
		else if (lc == columnIo_sno1_mng_typ) doIo_sno1_mng_typ_LC(info);
		else if (lc == columnIo_sno2_mng_typ) doIo_sno2_mng_typ_LC(info);
		else if (lc == columnIo_sno3_mng_typ) doIo_sno3_mng_typ_LC(info);
		else if (lc == columnIo_sno4_mng_typ) doIo_sno4_mng_typ_LC(info);
		else if (lc == columnIo_stk_mng_typ) doIo_stk_mng_typ_LC(info);
		else if (lc == columnIo_base_unit_dec_place) doIo_base_unit_dec_place_LC(info);
		else if (lc == columnIo_base_unit_rnd_typ) doIo_base_unit_rnd_typ_LC(info);
		else if (lc == columnIo_cont_fctr_rnd_typ) doIo_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnIo_cont_fctr_dec_place) doIo_cont_fctr_dec_place_LC(info);
		else if (lc == columnIo_sls_act_io_seq) doIo_sls_act_io_seq_LC(info);
		else if (lc == columnIo_purc_act_io_seq) doIo_purc_act_io_seq_LC(info);
		else if (lc == columnIo_dtl_row_id) doIo_dtl_row_id_LC(info);
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
	 * [Cnd]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_xrate_cd_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wtax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wtax_rnd_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_schd_dt_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[prof_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prof_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_purc_act_d_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_valid_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_valid_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_wtax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_wtax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_schd_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_purc_schd_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_bill_crryovr_times_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_row_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_row_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_s_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_s_trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_s_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_purc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_purc_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_purc_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_purc_qty_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[ship_fr_valid_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_ship_fr_valid_dt_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[purc_act_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_purc_act_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sls_act_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sls_act_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[sls_act_io_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_sls_act_io_seq_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[purc_act_io_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_purc_act_io_seq_LC(MCEventInfo info){
	}

	/**
	 * [Io]パネルの[dtl_row_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doIo_dtl_row_id_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getSlsSrchTgtTyp(row, info);
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
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_sls_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_purc_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_purc_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_purc_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnIo_trd_unit_cd]の作成メソッド
	 */
	public MCList getIo_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnIo_gd_cd]の作成メソッド
	 */
	public MCList getIo_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1360.Srch01")) {
			return new MS_MSBBL1360_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1360.Srch02")) {
			return new MS_MSBBL1360_Srch02Bridge();
		}
		if (id.equals("MS.MSBBL1360.Srch03")) {
			return new MS_MSBBL1360_Srch03Bridge();
		}
		if (id.equals("MS.MSBBL1360.Ins01")) {
			return new MS_MSBBL1360_Ins01Bridge();
		}
		if (id.equals("MS.MSBBL1360.Upd01")) {
			return new MS_MSBBL1360_Upd01Bridge();
		}
		if (id.equals("MS.MSBBL1360.Del01")) {
			return new MS_MSBBL1360_Del01Bridge();
		}
		if (id.equals("MS.MSBBL1360.Prnt01")) {
			return new MS_MSBBL1360_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1360_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1360_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1360_Srch01Bridge() {
			p_MS_MSBBL1360_Srch01 = new MCParam(PDef.MS_MSBBL1360_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1360_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1360.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class));

			p_MS_MSBBL1360_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1360_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1360_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1360_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1360_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1360.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1360.CndR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP1360.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.IoR> down2() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.IoR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1360_Srch01.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			p_MS_MSBBL1360_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
			p_MS_MSBBL1360_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1360_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1360.HdrR)p_MS_MSBBL1360_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)p_MS_MSBBL1360_Srch01.getContainerParam().getDownBlock(1));
			setIoL((MCList<mcframe.clientMSBB.MSBBP1360.IoR>)p_MS_MSBBL1360_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getIoL().clear();
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
			result.add(getIoL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1360_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1360_Srch02;

		/** コンストラクタ */
		protected MS_MSBBL1360_Srch02Bridge() {
			p_MS_MSBBL1360_Srch02 = new MCParam(PDef.MS_MSBBL1360_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1360_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1360.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class));

			p_MS_MSBBL1360_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1360_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1360_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1360_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1360_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1360.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1360.CndR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP1360.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.IoR> down2() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.IoR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1360_Srch02.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			p_MS_MSBBL1360_Srch02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
			p_MS_MSBBL1360_Srch02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1360_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1360.HdrR)p_MS_MSBBL1360_Srch02.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)p_MS_MSBBL1360_Srch02.getContainerParam().getDownBlock(1));
			setIoL((MCList<mcframe.clientMSBB.MSBBP1360.IoR>)p_MS_MSBBL1360_Srch02.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getIoL().clear();
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
			result.add(getIoL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1360_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1360_Srch03;

		/** コンストラクタ */
		protected MS_MSBBL1360_Srch03Bridge() {
			p_MS_MSBBL1360_Srch03 = new MCParam(PDef.MS_MSBBL1360_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1360_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1360.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class));

			p_MS_MSBBL1360_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1360_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1360_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1360_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1360_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1360.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1360.CndR)up(0);
		}

		protected mcframe.clientMSBB.MSBBP1360.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.IoR> down2() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.IoR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1360_Srch03.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			p_MS_MSBBL1360_Srch03.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
			p_MS_MSBBL1360_Srch03.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1360_Srch03;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1360.HdrR)p_MS_MSBBL1360_Srch03.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)p_MS_MSBBL1360_Srch03.getContainerParam().getDownBlock(1));
			setIoL((MCList<mcframe.clientMSBB.MSBBP1360.IoR>)p_MS_MSBBL1360_Srch03.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getIoL().clear();
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
			result.add(getIoL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1360_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1360_Ins01;

		/** コンストラクタ */
		protected MS_MSBBL1360_Ins01Bridge() {
			p_MS_MSBBL1360_Ins01 = new MCParam(PDef.MS_MSBBL1360_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1360_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));

			p_MS_MSBBL1360_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1360_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1360_Ins01.addUpBlock(getHdrR());
			p_MS_MSBBL1360_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBBL1360_Ins01.addUpBlock(getIoL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1360_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1360_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1360.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.IoR> up2() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.IoR>)up(2);
		}

		protected mcframe.clientMSBB.MSBBP1360.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1360_Ins01.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			p_MS_MSBBL1360_Ins01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1360_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1360.HdrR)p_MS_MSBBL1360_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)p_MS_MSBBL1360_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getIoL());
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
	 * [MS_MSBBL1360_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1360_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL1360_Upd01Bridge() {
			p_MS_MSBBL1360_Upd01 = new MCParam(PDef.MS_MSBBL1360_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1360_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));

			p_MS_MSBBL1360_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1360_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1360_Upd01.addUpBlock(getHdrR());
			p_MS_MSBBL1360_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBBL1360_Upd01.addUpBlock(getIoL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1360_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1360_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1360.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.IoR> up2() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.IoR>)up(2);
		}

		protected mcframe.clientMSBB.MSBBP1360.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.DtlR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1360_Upd01.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			p_MS_MSBBL1360_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1360_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1360.HdrR)p_MS_MSBBL1360_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)p_MS_MSBBL1360_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getIoL());
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
	 * [MS_MSBBL1360_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1360_Del01;

		/** コンストラクタ */
		protected MS_MSBBL1360_Del01Bridge() {
			p_MS_MSBBL1360_Del01 = new MCParam(PDef.MS_MSBBL1360_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1360_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1360.IoR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());

			p_MS_MSBBL1360_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1360_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1360_Del01.addUpBlock(getHdrR());
			p_MS_MSBBL1360_Del01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBBL1360_Del01.addUpBlock(getIoL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1360_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1360_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1360.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.DtlR> up1() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1360.IoR> up2() {
			return (MCList<mcframe.clientMSBB.MSBBP1360.IoR>)up(2);
		}

		protected mcframe.clientMSBB.MSBBP1360.HdrR down0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1360_Del01.addDownBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBBL1360_Del01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBB.MSBBP1360.HdrR)p_MS_MSBBL1360_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getIoL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1360_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1360_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1360_Prnt01;

		/** コンストラクタ */
		protected MS_MSBBL1360_Prnt01Bridge() {
			p_MS_MSBBL1360_Prnt01 = new MCParam(PDef.MS_MSBBL1360_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1360_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1360.HdrR.create());
			// Down

			p_MS_MSBBL1360_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1360_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1360_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1360_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1360_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1360.HdrR up0() {
			return (mcframe.clientMSBB.MSBBP1360.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBBL1360_Prnt01;
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