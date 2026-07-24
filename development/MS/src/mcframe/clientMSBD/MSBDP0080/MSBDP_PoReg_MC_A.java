package mcframe.clientMSBD.MSBDP0080;

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
import mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg_MC.MS_MSBDL0080_Srch01Caller;
import mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg_MC.MS_MSBDL0080_Srch02Caller;
import mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg_MC.MS_MSBDL0080_Ins01Caller;
import mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg_MC.MS_MSBDL0080_Upd01Caller;
import mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg_MC.MS_MSBDL0080_Del01Caller;
import mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg_MC.MS_MSBDL0080_Sprt02Caller;
import mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg_MC.MS_MSBDL0080_Sprt03Caller;
import mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg_MC.MS_MSBDL0080_Sprt04Caller;
import mcframe.clientMSBD.MSBDP0080.MSBDP_PoReg_MC.MS_MSBDL0080_Prnt01Caller;

/**
 * 画面"MSBDP_PoReg"パネルクラスです。<p>
 *
 * 発注を登録し、注文書を発行します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PoReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBDP0080";

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
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3; INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_rev_no = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Cnd_latest_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_po = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_po_schd = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	public MCScrollPane Cnd2ScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0080.Cnd2R> Cnd2Table = null;
	// [Cnd2]ブロックの項目のField定義
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnCnd2_po_schd_no = null;
	// [TOP]ブロック関連のField定義
	public MCPanel TOPPanel = null;
	// [TOP]ブロックの項目のField定義
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Tab]ブロック関連のField定義
	public MCPanel TabPanel = null;
	// [Tab]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
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
	public MCLabel Hdr_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_po_no = null;
	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_po_rev = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Hdr_latest_flg = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCCheckBox Hdr_can_flg = null;
	public MCLabel Hdr_po_print_dt_Label = null;
	/**
	 * PO sheet issue date and time 注文書発行日時.<p>
	 *
	 */
	public MCDateField Hdr_po_print_dt = null;
	/**
	 * PO sheet issued 注文書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_po_print_flg = null;
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_print_flg = null;
	/**
	 * Direct delivery delivery note issued 仕入直送納品書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_purc_ddlv_dlv_print_flg = null;
	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_rvrs_flg = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_flg = null;
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
	public MCLabel Hdr_po_dt_Label = null;
	/**
	 * PO date 発注日.<p>
	 *
	 */
	public MCDateField Hdr_po_dt = null;
	public MCLabel Hdr_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Hdr_sppl_nm = null;
	public mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H Hdr_sppl_p_PPanel;
	public MCButton Hdr_show_dtl;	// [Hdr]の[sppl_p.show_dtl]を[Hdr_show_dtl]としてエイリアス定義。
	public MCTextField Hdr_sppl_cntry_cd;	// [Hdr]の[sppl_p.cntry_cd]を[Hdr_sppl_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr_sppl_cntry_nm;	// [Hdr]の[sppl_p.cntry_nm]を[Hdr_sppl_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr_sppl_zip_cd;	// [Hdr]の[sppl_p.zip_cd]を[Hdr_sppl_zip_cd]としてエイリアス定義。
	public MCTextField Hdr_sppl_addr1;	// [Hdr]の[sppl_p.addr1]を[Hdr_sppl_addr1]としてエイリアス定義。
	public MCTextField Hdr_sppl_addr2;	// [Hdr]の[sppl_p.addr2]を[Hdr_sppl_addr2]としてエイリアス定義。
	public MCTextField Hdr_sppl_addr3;	// [Hdr]の[sppl_p.addr3]を[Hdr_sppl_addr3]としてエイリアス定義。
	public MCTextField Hdr_sppl_addr4;	// [Hdr]の[sppl_p.addr4]を[Hdr_sppl_addr4]としてエイリアス定義。
	public MCTextField Hdr_sppl_tel;	// [Hdr]の[sppl_p.tel]を[Hdr_sppl_tel]としてエイリアス定義。
	public MCTextField Hdr_sppl_fax;	// [Hdr]の[sppl_p.fax]を[Hdr_sppl_fax]としてエイリアス定義。
	public MCTextField Hdr_sppl_cntct_dpt;	// [Hdr]の[sppl_p.cntct_dpt]を[Hdr_sppl_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr_sppl_cntct_psn;	// [Hdr]の[sppl_p.cntct_psn]を[Hdr_sppl_cntct_psn]としてエイリアス定義。
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_purc_amt_rnd_typ = null;
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_purc_tax_rnd_typ = null;
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_sppl_cal_cd = null;
	/**
	 * Allow changing supplier purchasing unit price 発注先購買単価変更許可.<p>
	 *
	 */
	public MCCheckBox Hdr_sppl_purc_upri_cng_flg = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_prnt_lcl_cd = null;
	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_sppl_ship_form_cd = null;
	/**
	 * Delivery note at PO 発注時納品書.<p>
	 *
	 */
	public MCCheckBox Hdr_po_dlv_slip_flg = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ap_dpt_cd = null;
	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_mst_ap_dpt_cd = null;
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public MCTextField Hdr_purc_upri_req_typ = null;
	/**
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public MCNumberField Hdr_sppl_pay_crryovr_times = null;
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public MCCheckBox Hdr_subcon_flg = null;
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCCheckBox Hdr_repurc_obli_flg = null;
	public MCLabel Hdr_outsrc_upri_typ_Label = null;
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCTextField Hdr_outsrc_upri_typ = null;
	/**
	 * For I/V transaction Ｉ／Ｖ取引対象.<p>
	 *
	 */
	public MCCheckBox Hdr_sppl_iv_flg = null;
	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public MCCheckBox Hdr_edi_flg = null;
	/**
	 * Last EDI 前回ＥＤＩ.<p>
	 *
	 */
	public MCCheckBox Hdr_last_edi_flg = null;
	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public MCCheckBox Hdr_edi_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_purc_usr_dpt_p_PPanel;
	public MCTextField Hdr_purc_usr_cd;	// [Hdr]の[purc_usr_dpt_p.usr_cd]を[Hdr_purc_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_purc_usr_nm;	// [Hdr]の[purc_usr_dpt_p.usr_nm]を[Hdr_purc_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_purc_dpt_cd;	// [Hdr]の[purc_usr_dpt_p.dpt_cd]を[Hdr_purc_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_purc_dpt_nm;	// [Hdr]の[purc_usr_dpt_p.dpt_nm]を[Hdr_purc_dpt_nm]としてエイリアス定義。
	/**
	 * Default purchasing PIC cd. デフォルト購買担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_def_purc_usr_cd = null;
	/**
	 * Default purchasing dept. cd. デフォルト購買部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_def_purc_dpt_cd = null;
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public MCCheckBox Hdr_ap_dpt_flg = null;
	public MCLabel Hdr_purc_dpt_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_purc_dpt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Hdr_purc_dpt_wg_nm = null;
	public MCLabel Hdr_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
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
	public MCTextComboBox Hdr_base_cur_cd = null;
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
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCCheckBox Hdr_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_prax_xrate_p_PPanel;
	public MCNumberField Hdr_ptax_xrate;	// [Hdr]の[prax_xrate_p.xrate]を[Hdr_ptax_xrate]としてエイリアス定義。
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_purc_xrate_cd = null;
	public MCLabel Hdr_wtax_rnd_typ_Label = null;
	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_wtax_rnd_typ = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Hdr_wrk_no_p_PPanel;
	public MCTextField Hdr_wrk_no;	// [Hdr]の[wrk_no_p.wrk_no]を[Hdr_wrk_no]としてエイリアス定義。
	public MCTextField Hdr_wrk_nm;	// [Hdr]の[wrk_no_p.wrk_nm]を[Hdr_wrk_nm]としてエイリアス定義。
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
	public MCLabel Hdr_po_print_rmrks_Label = null;
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public MCTextField Hdr_po_print_rmrks = null;
	public MCLabel Hdr_dlv_slip_rmrks_Label = null;
	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public MCTextField Hdr_dlv_slip_rmrks = null;
	public MCLabel Hdr_po_print_cd_Label = null;
	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_po_print_cd = null;
	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public MCTextField Hdr_po_print_nm = null;
	public MCLabel Hdr_upd_po_print_schd_dt_Label = null;
	/**
	 * Scheduled change PO sheet issue date after change 変更注文書発行予定日.<p>
	 *
	 */
	public MCDateField Hdr_upd_po_print_schd_dt = null;
	public MCLabel Hdr_po_crct_rsn_cd_Label = null;
	/**
	 * Correction reason cd. 訂正理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_po_crct_rsn_cd = null;
	/**
	 * Correction reason name 訂正理由名.<p>
	 *
	 */
	public MCTextField Hdr_po_crct_rsn_nm = null;
	/**
	 * Correction reason remarks 訂正理由備考.<p>
	 *
	 */
	public MCTextField Hdr_po_crct_rsn_rmrks = null;
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
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public MCTextField Hdr_tterm_rmrks3 = null;
	public MCLabel Hdr_asppl_cd_Label = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCTextField Hdr_asppl_nm = null;
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
	public MCLabel Hdr_edi_sub_char1_Label = null;
	/**
	 * EDI spare character string 1 ＥＤＩ予備文字列１.<p>
	 *
	 */
	public MCTextField Hdr_edi_sub_char1 = null;
	public MCLabel Hdr_edi_sub_char2_Label = null;
	/**
	 * EDI spare character string 2 ＥＤＩ予備文字列２.<p>
	 *
	 */
	public MCTextField Hdr_edi_sub_char2 = null;
	public MCLabel Hdr_edi_sub_char3_Label = null;
	/**
	 * EDI spare character string 3 ＥＤＩ予備文字列３.<p>
	 *
	 */
	public MCTextField Hdr_edi_sub_char3 = null;
	public MCLabel Hdr_edi_sub_char4_Label = null;
	/**
	 * EDI spare character string 4 ＥＤＩ予備文字列４.<p>
	 *
	 */
	public MCTextField Hdr_edi_sub_char4 = null;
	public MCLabel Hdr_edi_sub_char5_Label = null;
	/**
	 * EDI spare character string 5 ＥＤＩ予備文字列５.<p>
	 *
	 */
	public MCTextField Hdr_edi_sub_char5 = null;
	public MCLabel Hdr_edi_sub_num1_Label = null;
	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public MCNumberField Hdr_edi_sub_num1 = null;
	public MCLabel Hdr_edi_sub_dt1_Label = null;
	/**
	 * EDI spare date ＥＤＩ予備日付.<p>
	 *
	 */
	public MCDateField Hdr_edi_sub_dt1 = null;
	/**
	 * Purchasing IF 購買ＩＦ.<p>
	 *
	 */
	public MCCheckBox Hdr_purc_if_flg = null;
	public MCLabel Hdr_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField Hdr_ext_sys_nm = null;
	public MCLabel Hdr_ext_po_no_Label = null;
	/**
	 * External PO No. 外部発注ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ext_po_no = null;
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
	 * Update counter (PO) 更新カウンタ(発注).<p>
	 *
	 */
	public MCNumberField Hdr_po_upd_cntr = null;
	/**
	 * Next completed process 次処理済.<p>
	 *
	 */
	public MCCheckBox Hdr_next_opr_flg = null;
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_po_schd_no = null;
	/**
	 * PO sheet 注文書.<p>
	 *
	 */
	public MCCheckBox Hdr_prnt_po_flg = null;
	/**
	 * Delivery note 納品書.<p>
	 *
	 */
	public MCCheckBox Hdr_prnt_dlv_flg = null;
	/**
	 * Direct delivery delivery note 仕入直送納品書.<p>
	 *
	 */
	public MCCheckBox Hdr_prnt_purc_ddlv_dlv_flg = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Hdr_indiv_prnt_flg = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_dlv_rqst_tm_p_PPanel;
	public MCDateField BulkSet_dlv_rqst_dt;	// [BulkSet]の[dlv_rqst_tm_p.ymd]を[BulkSet_dlv_rqst_dt]としてエイリアス定義。
	public MCDateField BulkSet_dlv_rqst_hm;	// [BulkSet]の[dlv_rqst_tm_p.hm]を[BulkSet_dlv_rqst_hm]としてエイリアス定義。
	public MCLabel BulkSet_rqst_avl_rqst_dt_Label = null;
	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDateField BulkSet_rqst_avl_rqst_dt = null;
	public MCLabel BulkSet_amt_Label = null;
	/**
	 * Total amount 金額合計.<p>
	 *
	 */
	public MCNumberField BulkSet_amt = null;
	public MCLabel BulkSet_inc_tax_amt_Label = null;
	/**
	 * Total tax included amount 税込金額合計.<p>
	 *
	 */
	public MCNumberField BulkSet_inc_tax_amt = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0080.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_peg_no = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D Dtl_in_to_loc_p_PPanel;
	public MCColumnConfig columnDtl_show_dtl;// [Dtl]の[in_to_loc_p.show_dtl]を[columnDtl_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnDtl_in_to_loc_zip_cd;// [Dtl]の[in_to_loc_p.zip_cd]を[columnDtl_in_to_loc_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_in_to_loc_addr1;// [Dtl]の[in_to_loc_p.addr1]を[columnDtl_in_to_loc_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl_in_to_loc_addr2;// [Dtl]の[in_to_loc_p.addr2]を[columnDtl_in_to_loc_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl_in_to_loc_addr3;// [Dtl]の[in_to_loc_p.addr3]を[columnDtl_in_to_loc_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl_in_to_loc_addr4;// [Dtl]の[in_to_loc_p.addr4]を[columnDtl_in_to_loc_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl_in_to_loc_tel;// [Dtl]の[in_to_loc_p.tel]を[columnDtl_in_to_loc_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl_in_to_loc_fax;// [Dtl]の[in_to_loc_p.fax]を[columnDtl_in_to_loc_fax]としてエイリアス定義。
	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_wg_cd = null;
	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_wg_nm = null;
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pri_prnt_flg = null;
	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_drct_dlv_typ = null;
	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_drct_dlv_typ_nm = null;
	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_sppl_cd = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_tgt_flg = null;
	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_mng_typ = null;
	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_cal_cd = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_cd = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_grp_cd = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_grp_cd = null;
	/**
	 * Available delivery location WG cd. (Before change) 変更前納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bef_in_to_loc_wg_cd = null;
	/**
	 * Distribution group cd. (Before change) 変更前物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bef_lg_grp_cd = null;
	/**
	 * Before change mfg. location group cd. 変更前製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bef_loc_grp_cd = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnDtl_dlv_rqst_dt;// [Dtl]の[dlv_rqst_tm_p.ymd]を[columnDtl_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_rqst_hm;// [Dtl]の[dlv_rqst_tm_p.hm]を[columnDtl_dlv_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_itm_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sundry_itm_flg = null;
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
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl_str_ln_p_PPanel;
	public MCColumnConfig columnDtl_str_ln_cd;// [Dtl]の[str_ln_p.str_ln_cd]を[columnDtl_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_str_ln_nm;// [Dtl]の[str_ln_p.str_ln_nm]を[columnDtl_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_str_ln_cd_none_flg;// [Dtl]の[str_ln_p.str_ln_cd_none_flg]を[columnDtl_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_skip_flg = null;
	/**
	 * For purchase delivery note 購買納品書対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dlv_slip_flg = null;
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
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_avl_rqst_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_rqst_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnDtl_rqst_dlv_rqst_dt;// [Dtl]の[rqst_dlv_rqst_tm_p.ymd]を[columnDtl_rqst_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_rqst_dlv_rqst_hm;// [Dtl]の[rqst_dlv_rqst_tm_p.hm]を[columnDtl_rqst_dlv_rqst_hm]としてエイリアス定義。
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_schd_dt = null;
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_basis_typ = null;
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_basis_typ_nm = null;
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sync_flg = null;
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_purc_upri_cng_flg = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_pay_crryovr_times = null;
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
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_lot_no = null;
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_itm_nm = null;
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
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Dtl_dlv_p_PPanel;
	public MCColumnConfig columnDtl_dlv_cd;// [Dtl]の[dlv_p.bp_cd]を[columnDtl_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_nm;// [Dtl]の[dlv_p.bp_nm]を[columnDtl_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_sundry_flg;// [Dtl]の[dlv_p.dlv_sundry_flg]を[columnDtl_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_show_dtl;// [Dtl]の[dlv_p.show_dtl]を[columnDtl_dlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntry_cd;// [Dtl]の[dlv_p.cntry_cd]を[columnDtl_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntry_nm;// [Dtl]の[dlv_p.cntry_nm]を[columnDtl_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_zip_cd;// [Dtl]の[dlv_p.zip_cd]を[columnDtl_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr1;// [Dtl]の[dlv_p.addr1]を[columnDtl_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr2;// [Dtl]の[dlv_p.addr2]を[columnDtl_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr3;// [Dtl]の[dlv_p.addr3]を[columnDtl_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr4;// [Dtl]の[dlv_p.addr4]を[columnDtl_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_tel;// [Dtl]の[dlv_p.tel]を[columnDtl_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_fax;// [Dtl]の[dlv_p.fax]を[columnDtl_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_dpt;// [Dtl]の[dlv_p.dlv_cntct_dpt]を[columnDtl_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_psn;// [Dtl]の[dlv_p.dlv_cntct_psn]を[columnDtl_dlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cal_cd = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Dtl_tdlv_p_PPanel;
	public MCColumnConfig columnDtl_tdlv_cd;// [Dtl]の[tdlv_p.bp_cd]を[columnDtl_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_nm;// [Dtl]の[tdlv_p.bp_nm]を[columnDtl_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_sundry_flg;// [Dtl]の[tdlv_p.dlv_sundry_flg]を[columnDtl_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_show_dtl;// [Dtl]の[tdlv_p.show_dtl]を[columnDtl_tdlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_cntry_cd;// [Dtl]の[tdlv_p.cntry_cd]を[columnDtl_tdlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_cntry_nm;// [Dtl]の[tdlv_p.cntry_nm]を[columnDtl_tdlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_zip_cd;// [Dtl]の[tdlv_p.zip_cd]を[columnDtl_tdlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_addr1;// [Dtl]の[tdlv_p.addr1]を[columnDtl_tdlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_addr2;// [Dtl]の[tdlv_p.addr2]を[columnDtl_tdlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_addr3;// [Dtl]の[tdlv_p.addr3]を[columnDtl_tdlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_addr4;// [Dtl]の[tdlv_p.addr4]を[columnDtl_tdlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_tel;// [Dtl]の[tdlv_p.tel]を[columnDtl_tdlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_fax;// [Dtl]の[tdlv_p.fax]を[columnDtl_tdlv_fax]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_cntct_dpt;// [Dtl]の[tdlv_p.dlv_cntct_dpt]を[columnDtl_tdlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_cntct_psn;// [Dtl]の[tdlv_p.dlv_cntct_psn]を[columnDtl_tdlv_cntct_psn]としてエイリアス定義。
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_id_typ = null;
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_id_typ_nm = null;
	/**
	 * Confirmation received 請書受領.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_conf_rcpt_flg = null;
	/**
	 * Confirmation received date 請書受領日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_conf_rcpt_dt = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_rnd_typ = null;
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_base_qty = null;
	/**
	 * Conversion qty. 換算数量.<p>
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
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl_abort_flg = null;
	/**
	 * Last cancel remaining 前回打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bef_abort_flg = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_inst_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_cont_qty;// [Dtl]の[inst_cont_qty_p.cont_qty]を[columnDtl_cont_qty]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_flg = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl_cont_unit_p_PPanel;
	public MCColumnConfig columnDtl_cont_fctr_unit_cd;// [Dtl]の[cont_unit_p.cont_fctr_unit_cd]を[columnDtl_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cont_fctr_unit_nm;// [Dtl]の[cont_unit_p.cont_fctr_unit_nm]を[columnDtl_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl_std_cont_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_fctr;// [Dtl]の[std_cont_p.std_cont_fctr]を[columnDtl_std_cont_fctr]としてエイリアス定義。
	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_sts_typ = null;
	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_sts_typ_nm = null;
	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_inst_qty = null;
	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_inst_prms_rcpt_qty = null;
	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcpt_iv_qty = null;
	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_qty = null;
	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_qty = null;
	/**
	 * Split receipt schedule 入荷予定分割.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_schd_split_flg = null;
	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_cmpl_flg = null;
	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_cmpl_flg = null;
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_crryovr_times = null;
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_req_typ = null;
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_req_typ_nm = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_upri_not_tgt_flg;// [Dtl]の[trd_cur_upri_p.upri_not_tgt_flg]を[columnDtl_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_upri;// [Dtl]の[trd_cur_upri_p.trd_cur_upri]を[columnDtl_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl_interim_flg;// [Dtl]の[trd_cur_upri_p.interim_flg]を[columnDtl_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_amt;// [Dtl]の[trd_cur_upri_p.trd_cur_amt]を[columnDtl_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_inc_tax_amt;// [Dtl]の[trd_cur_upri_p.trd_cur_inc_tax_amt]を[columnDtl_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_fix_flg;// [Dtl]の[trd_cur_upri_p.tax_fix_flg]を[columnDtl_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_cd;// [Dtl]の[trd_cur_upri_p.tax_cd]を[columnDtl_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_nm;// [Dtl]の[trd_cur_upri_p.tax_nm]を[columnDtl_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_rate;// [Dtl]の[trd_cur_upri_p.tax_rate]を[columnDtl_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_typ;// [Dtl]の[trd_cur_upri_p.tax_typ]を[columnDtl_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_inc_tax_flg;// [Dtl]の[trd_cur_upri_p.inc_tax_flg]を[columnDtl_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_tax_amt;// [Dtl]の[trd_cur_upri_p.trd_cur_tax_amt]を[columnDtl_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_dscnt_amt;// [Dtl]の[trd_cur_upri_p.trd_cur_dscnt_amt]を[columnDtl_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_cd;// [Dtl]の[trd_cur_upri_p.dscnt_rsn_cd]を[columnDtl_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_nm;// [Dtl]の[trd_cur_upri_p.dscnt_rsn_nm]を[columnDtl_dscnt_rsn_nm]としてエイリアス定義。
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnDtl_repurc_obli_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_proc_upri;// [Dtl]の[trd_cur_proc_upri_p.upri]を[columnDtl_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_proc_amt;// [Dtl]の[trd_cur_proc_amt_p.amt]を[columnDtl_trd_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_proc_tax_amt;// [Dtl]の[trd_cur_proc_amt_p.tax_amt]を[columnDtl_trd_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_onr_prov_upri;// [Dtl]の[trd_cur_onr_prov_upri_p.upri]を[columnDtl_trd_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_onr_prov_amt;// [Dtl]の[trd_cur_onr_prov_amt_p.amt]を[columnDtl_trd_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_onr_prov_tax_amt;// [Dtl]の[trd_cur_onr_prov_amt_p.tax_amt]を[columnDtl_trd_cur_onr_prov_tax_amt]としてエイリアス定義。
	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_trd_cur_upri = null;
	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_trd_cur_proc_upri = null;
	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_trd_cur_onr_prov_upri = null;
	/**
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_interim_flg = null;
	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_trd_cur_dscnt_amt = null;
	/**
	 * Discount reason before change 変更前値引理由.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_dscnt_rsn_cd = null;
	/**
	 * Discount reason name before change 変更前値引理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_dscnt_rsn_nm = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_upri;// [Dtl]の[base_cur_upri_p.upri]を[columnDtl_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_dscnt_amt;// [Dtl]の[base_cur_dscnt_amt_p.amt]を[columnDtl_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_amt;// [Dtl]の[base_cur_amt_p.amt]を[columnDtl_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_tax_amt;// [Dtl]の[base_cur_tax_amt_p.amt]を[columnDtl_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_inc_tax_amt;// [Dtl]の[base_cur_inc_tax_amt_p.amt]を[columnDtl_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_proc_upri;// [Dtl]の[base_cur_proc_upri_p.upri]を[columnDtl_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_proc_amt;// [Dtl]の[base_cur_proc_amt_p.amt]を[columnDtl_base_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_onr_prov_upri;// [Dtl]の[base_cur_onr_prov_upri_p.upri]を[columnDtl_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_onr_prov_amt;// [Dtl]の[base_cur_onr_prov_amt_p.amt]を[columnDtl_base_cur_onr_prov_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_upri;// [Dtl]の[ptax_cur_upri_p.upri]を[columnDtl_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_dscnt_amt;// [Dtl]の[ptax_cur_dscnt_amt_p.amt]を[columnDtl_ptax_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_amt;// [Dtl]の[ptax_cur_amt_p.amt]を[columnDtl_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_tax_amt;// [Dtl]の[ptax_cur_tax_amt_p.amt]を[columnDtl_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_inc_tax_amt;// [Dtl]の[ptax_cur_inc_tax_amt_p.amt]を[columnDtl_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_proc_upri;// [Dtl]の[ptax_cur_proc_upri_p.upri]を[columnDtl_ptax_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_proc_amt;// [Dtl]の[ptax_cur_proc_amt_p.amt]を[columnDtl_ptax_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_onr_prov_upri;// [Dtl]の[ptax_cur_onr_prov_upri_p.upri]を[columnDtl_ptax_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_onr_prov_amt;// [Dtl]の[ptax_cur_onr_prov_amt_p.amt]を[columnDtl_ptax_cur_onr_prov_amt]としてエイリアス定義。
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_wtax_amt_p_PPanel;
	public MCColumnConfig columnDtl_wtax_amt;// [Dtl]の[wtax_amt_p.amt]を[columnDtl_wtax_amt]としてエイリアス定義。
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_loc_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_flg = null;
	/**
	 * Mfg. ordered 製造指図済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_flg = null;
	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_itm_ord_no = null;
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
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xpns_purc_flg = null;
	/**
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_xpns_purc_flg = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D Dtl_bditm_p_PPanel;
	public MCColumnConfig columnDtl_bd_dpt_cd;// [Dtl]の[bditm_p.bd_dpt_cd]を[columnDtl_bd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_dpt_nm;// [Dtl]の[bditm_p.bd_dpt_nm]を[columnDtl_bd_dpt_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_cd;// [Dtl]の[bditm_p.bd_itm_cd]を[columnDtl_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_sub1;// [Dtl]の[bditm_p.bd_itm_sub1]を[columnDtl_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_sub2;// [Dtl]の[bditm_p.bd_itm_sub2]を[columnDtl_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_sub3;// [Dtl]の[bditm_p.bd_itm_sub3]を[columnDtl_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_nm;// [Dtl]の[bditm_p.bd_itm_nm]を[columnDtl_bd_itm_nm]としてエイリアス定義。
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_lot_mng_typ = null;
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sublot_mng_typ = null;
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_lot_no_typ = null;
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sublot_no_typ = null;
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sno1_mng_typ = null;
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sno2_mng_typ = null;
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sno3_mng_typ = null;
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sno4_mng_typ = null;
	public MCColumnConfig columnDtl_bd_lot_no;// [Dtl]の[bditm_p.bd_lot_no]を[columnDtl_bd_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sublot_no;// [Dtl]の[bditm_p.bd_sublot_no]を[columnDtl_bd_sublot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sno1;// [Dtl]の[bditm_p.bd_sno1]を[columnDtl_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sno2;// [Dtl]の[bditm_p.bd_sno2]を[columnDtl_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sno3;// [Dtl]の[bditm_p.bd_sno3]を[columnDtl_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sno4;// [Dtl]の[bditm_p.bd_sno4]を[columnDtl_bd_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_bp_cd;// [Dtl]の[bditm_p.bd_bp_cd]を[columnDtl_bd_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_bp_nm;// [Dtl]の[bditm_p.bd_bp_nm]を[columnDtl_bd_bp_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_loc_cd;// [Dtl]の[bditm_p.bd_loc_cd]を[columnDtl_bd_loc_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_loc_nm;// [Dtl]の[bditm_p.bd_loc_nm]を[columnDtl_bd_loc_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_ctg_cd;// [Dtl]の[bditm_p.bd_ctg_cd]を[columnDtl_bd_ctg_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_ctg_nm;// [Dtl]の[bditm_p.bd_ctg_nm]を[columnDtl_bd_ctg_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_oper_cd;// [Dtl]の[bditm_p.bd_oper_cd]を[columnDtl_bd_oper_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_oper_nm;// [Dtl]の[bditm_p.bd_oper_nm]を[columnDtl_bd_oper_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_iv_no;// [Dtl]の[bditm_p.bd_iv_no]を[columnDtl_bd_iv_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_slo_no;// [Dtl]の[bditm_p.bd_slo_no]を[columnDtl_bd_slo_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_po_no;// [Dtl]の[bditm_p.bd_po_no]を[columnDtl_bd_po_no]としてエイリアス定義。
	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_can_flg = null;
	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_cnt_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_print_d_rmrks = null;
	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_d_rmrks = null;
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_cnt_rmrks = null;
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
	 * EDI details spare character string 1 ＥＤＩ明細予備文字列１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_edi_sub_d_char1 = null;
	/**
	 * EDI details spare character string 2 ＥＤＩ明細予備文字列２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_edi_sub_d_char2 = null;
	/**
	 * EDI details spare character string 3 ＥＤＩ明細予備文字列３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_edi_sub_d_char3 = null;
	/**
	 * EDI details spare character string 4 ＥＤＩ明細予備文字列４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_edi_sub_d_char4 = null;
	/**
	 * EDI details spare character string 5 ＥＤＩ明細予備文字列５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_edi_sub_d_char5 = null;
	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public MCColumnConfig columnDtl_edi_sub_d_num1 = null;
	/**
	 * EDI details spare date ＥＤＩ明細予備日付.<p>
	 *
	 */
	public MCColumnConfig columnDtl_edi_sub_d_dt1 = null;
	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_po_d_no = null;
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
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_no = null;
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_seq = null;
	/**
	 * Not for delivery note 納品書対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_invalid_flg = null;
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_dlv_slip_no = null;
	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_mng_no = null;
	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_mng_seq = null;
	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_src_typ = null;
	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_src_typ_nm = null;
	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_src_no = null;
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_fr_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_fr_usr_nm = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_fr_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_fr_dpt_nm = null;
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bndl_flg = null;
	/**
	 * Request source sales order 依頼元受注.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_slo_flg = null;
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_d_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Received 入荷済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_flg = null;
	/**
	 * Purchased 仕入済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_flg = null;
	/**
	 * Purchase invoice entered 受領インボイス登録済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcpt_iv_flg = null;
	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_loc_wg_cd = null;
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0080.Dtl2R> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_dtl_peg_no = null;
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_po_schd_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_po_d_no = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_can_flg = null;
	/**
	 * Update counter (PO schedule) 更新カウンタ(発注予定).<p>
	 *
	 */
	public MCColumnConfig columnDtl2_po_schd_upd_cntr = null;
	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public MCColumnConfig columnDtl2_arr_pr_upd_cntr = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Purchase delivery date adjustment entry 購買納期調整登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0120 = null;
	/**
	 * Issue purchase delivery note 購買納品書発行.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0250 = null;
	/**
	 * Schedule aggregation 予定まとめ.<p>
	 *
	 */
	public MCButton Btn_bndl_schd = null;
	/**
	 * Reacquire unit price 単価再取得.<p>
	 *
	 */
	public MCButton Btn_srch_upri = null;
	/**
	 * Delivery destination acquisition 納品先取得.<p>
	 *
	 */
	public MCButton Btn_srch_dlv = null;
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H Btn_menu_move_p_PPanel;
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
	/**
	 * Issue report 帳票発行.<p>
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
	// [Btn1]ブロック関連のField定義
	public MCPanel Btn1Panel = null;
	// [Btn1]ブロックの項目のField定義
	// [Btn2]ブロック関連のField定義
	public MCPanel Btn2Panel = null;
	// [Btn2]ブロックの項目のField定義
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_NEXT]モードを表す定数 */
	public static final String UPD_NEXT = "UPD_NEXT";
	/** [UPD_APRV]モードを表す定数 */
	public static final String UPD_APRV = "UPD_APRV";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [DEL_APRV]モードを表す定数 */
	public static final String DEL_APRV = "DEL_APRV";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, UPD, UPD_NEXT, UPD_APRV, DEL, DEL_APRV, SRCH, FIX_I, FIX_U, FIX_D, REF};
	
	/** [MS_MSBDL0080_Srch01]のCallerの作成 */
	protected MSBDP_PoReg_MC.MS_MSBDL0080_Srch01Caller createMS_MSBDL0080_Srch01() {
		MSBDP_PoReg_MC.MS_MSBDL0080_Srch01Caller<MSBDP_PoReg, MS_MSBDL0080_Srch01Bridge>
		caller = ((MSBDP_PoReg_MC)this).new MS_MSBDL0080_Srch01Caller<MSBDP_PoReg, MS_MSBDL0080_Srch01Bridge>(
					(MSBDP_PoReg)this, new MS_MSBDL0080_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0080_Srch01]の呼び出し */
	protected void callMS_MSBDL0080_Srch01() {
		MCCaller caller = createMS_MSBDL0080_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0080_Srch02]のCallerの作成 */
	protected MSBDP_PoReg_MC.MS_MSBDL0080_Srch02Caller createMS_MSBDL0080_Srch02() {
		MSBDP_PoReg_MC.MS_MSBDL0080_Srch02Caller<MSBDP_PoReg, MS_MSBDL0080_Srch02Bridge>
		caller = ((MSBDP_PoReg_MC)this).new MS_MSBDL0080_Srch02Caller<MSBDP_PoReg, MS_MSBDL0080_Srch02Bridge>(
					(MSBDP_PoReg)this, new MS_MSBDL0080_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBDL0080_Srch02]の呼び出し */
	protected void callMS_MSBDL0080_Srch02() {
		MCCaller caller = createMS_MSBDL0080_Srch02();
		caller.exec();
	}
	/** [MS_MSBDL0080_Ins01]のCallerの作成 */
	protected MSBDP_PoReg_MC.MS_MSBDL0080_Ins01Caller createMS_MSBDL0080_Ins01() {
		MSBDP_PoReg_MC.MS_MSBDL0080_Ins01Caller<MSBDP_PoReg, MS_MSBDL0080_Ins01Bridge>
		caller = ((MSBDP_PoReg_MC)this).new MS_MSBDL0080_Ins01Caller<MSBDP_PoReg, MS_MSBDL0080_Ins01Bridge>(
					(MSBDP_PoReg)this, new MS_MSBDL0080_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBDL0080_Ins01]の呼び出し */
	protected void callMS_MSBDL0080_Ins01() {
		MCCaller caller = createMS_MSBDL0080_Ins01();
		caller.exec();
	}
	/** [MS_MSBDL0080_Upd01]のCallerの作成 */
	protected MSBDP_PoReg_MC.MS_MSBDL0080_Upd01Caller createMS_MSBDL0080_Upd01() {
		MSBDP_PoReg_MC.MS_MSBDL0080_Upd01Caller<MSBDP_PoReg, MS_MSBDL0080_Upd01Bridge>
		caller = ((MSBDP_PoReg_MC)this).new MS_MSBDL0080_Upd01Caller<MSBDP_PoReg, MS_MSBDL0080_Upd01Bridge>(
					(MSBDP_PoReg)this, new MS_MSBDL0080_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBDL0080_Upd01]の呼び出し */
	protected void callMS_MSBDL0080_Upd01() {
		MCCaller caller = createMS_MSBDL0080_Upd01();
		caller.exec();
	}
	/** [MS_MSBDL0080_Del01]のCallerの作成 */
	protected MSBDP_PoReg_MC.MS_MSBDL0080_Del01Caller createMS_MSBDL0080_Del01() {
		MSBDP_PoReg_MC.MS_MSBDL0080_Del01Caller<MSBDP_PoReg, MS_MSBDL0080_Del01Bridge>
		caller = ((MSBDP_PoReg_MC)this).new MS_MSBDL0080_Del01Caller<MSBDP_PoReg, MS_MSBDL0080_Del01Bridge>(
					(MSBDP_PoReg)this, new MS_MSBDL0080_Del01Bridge());
		return caller;
	}
	/** [MS_MSBDL0080_Del01]の呼び出し */
	protected void callMS_MSBDL0080_Del01() {
		MCCaller caller = createMS_MSBDL0080_Del01();
		caller.exec();
	}
	/** [MS_MSBDL0080_Sprt02]のCallerの作成 */
	protected MSBDP_PoReg_MC.MS_MSBDL0080_Sprt02Caller createMS_MSBDL0080_Sprt02() {
		MSBDP_PoReg_MC.MS_MSBDL0080_Sprt02Caller<MSBDP_PoReg, MS_MSBDL0080_Sprt02Bridge>
		caller = ((MSBDP_PoReg_MC)this).new MS_MSBDL0080_Sprt02Caller<MSBDP_PoReg, MS_MSBDL0080_Sprt02Bridge>(
					(MSBDP_PoReg)this, new MS_MSBDL0080_Sprt02Bridge());
		return caller;
	}
	/** [MS_MSBDL0080_Sprt02]の呼び出し */
	protected void callMS_MSBDL0080_Sprt02() {
		MCCaller caller = createMS_MSBDL0080_Sprt02();
		caller.exec();
	}
	/** [MS_MSBDL0080_Sprt03]のCallerの作成 */
	protected MSBDP_PoReg_MC.MS_MSBDL0080_Sprt03Caller createMS_MSBDL0080_Sprt03() {
		MSBDP_PoReg_MC.MS_MSBDL0080_Sprt03Caller<MSBDP_PoReg, MS_MSBDL0080_Sprt03Bridge>
		caller = ((MSBDP_PoReg_MC)this).new MS_MSBDL0080_Sprt03Caller<MSBDP_PoReg, MS_MSBDL0080_Sprt03Bridge>(
					(MSBDP_PoReg)this, new MS_MSBDL0080_Sprt03Bridge());
		return caller;
	}
	/** [MS_MSBDL0080_Sprt03]の呼び出し */
	protected void callMS_MSBDL0080_Sprt03() {
		MCCaller caller = createMS_MSBDL0080_Sprt03();
		caller.exec();
	}
	/** [MS_MSBDL0080_Sprt04]のCallerの作成 */
	protected MSBDP_PoReg_MC.MS_MSBDL0080_Sprt04Caller createMS_MSBDL0080_Sprt04() {
		MSBDP_PoReg_MC.MS_MSBDL0080_Sprt04Caller<MSBDP_PoReg, MS_MSBDL0080_Sprt04Bridge>
		caller = ((MSBDP_PoReg_MC)this).new MS_MSBDL0080_Sprt04Caller<MSBDP_PoReg, MS_MSBDL0080_Sprt04Bridge>(
					(MSBDP_PoReg)this, new MS_MSBDL0080_Sprt04Bridge());
		return caller;
	}
	/** [MS_MSBDL0080_Sprt04]の呼び出し */
	protected void callMS_MSBDL0080_Sprt04() {
		MCCaller caller = createMS_MSBDL0080_Sprt04();
		caller.exec();
	}
	/** [MS_MSBDL0080_Prnt01]のCallerの作成 */
	protected MSBDP_PoReg_MC.MS_MSBDL0080_Prnt01Caller createMS_MSBDL0080_Prnt01() {
		MSBDP_PoReg_MC.MS_MSBDL0080_Prnt01Caller<MSBDP_PoReg, MS_MSBDL0080_Prnt01Bridge>
		caller = ((MSBDP_PoReg_MC)this).new MS_MSBDL0080_Prnt01Caller<MSBDP_PoReg, MS_MSBDL0080_Prnt01Bridge>(
					(MSBDP_PoReg)this, new MS_MSBDL0080_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBDL0080_Prnt01]の呼び出し */
	protected void callMS_MSBDL0080_Prnt01() {
		MCCaller caller = createMS_MSBDL0080_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0080.CndR aCndR;
	/** [Cnd2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0080.Cnd2R> aCnd2L;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0080.HdrR aHdrR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0080.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0080.DtlR> aDtlL;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R> aDtl2L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0080.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0080.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0080.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0080.CndR.create();
	}

	/**
	 * コピーによってaCnd2Lを設定します。
	 *
	 * aCnd2Lのインスタンスは変更されません。
	 *
	 * @param dataset Cnd2L
	 */
	public void setCnd2L(MCList<mcframe.clientMSBD.MSBDP0080.Cnd2R> aList) {
		if (getCnd2L() != aList) {
			getCnd2L().setAll(aList);
		}
	}

	/**
	 * [Cnd2]ブロックのコンテナaCnd2Lを返します。
	 *
	 * @return Cnd2L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0080.Cnd2R> getCnd2L() {
		return aCnd2L;
	}

	/**
	 * aCnd2Rを作成します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMSBD.MSBDP0080.Cnd2R createCnd2R() {
		return mcframe.clientMSBD.MSBDP0080.Cnd2R.create();
	}

	/**
	 * aCnd2Lを作成します。
	 *
	 * @return Cnd2L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0080.Cnd2R> createCnd2L() {
		return MCList.create(mcframe.clientMSBD.MSBDP0080.Cnd2R.class);
	}

	/**
	 * Cnd2Tableを初期化します。
	 */
	protected void createCnd2Table(){
		if(Cnd2Table == null){
			Cnd2Table = beansFactory.createTable2("Cnd2.table");
		}
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBD.MSBDP0080.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBD.MSBDP0080.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBD.MSBDP0080.HdrR createHdrR() {
		return mcframe.clientMSBD.MSBDP0080.HdrR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBD.MSBDP0080.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBD.MSBDP0080.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBD.MSBDP0080.BulkSetR createBulkSetR() {
		return mcframe.clientMSBD.MSBDP0080.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBD.MSBDP0080.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0080.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBD.MSBDP0080.DtlR createDtlR() {
		return mcframe.clientMSBD.MSBDP0080.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0080.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class);
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
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMSBD.MSBDP0080.Dtl2R createDtl2R() {
		return mcframe.clientMSBD.MSBDP0080.Dtl2R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R> createDtl2L() {
		return MCList.create(mcframe.clientMSBD.MSBDP0080.Dtl2R.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getCnd2L())) ret.add(getCnd2L());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
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
		if(aCnt == getCnd2L()) return "Cnd2";
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getBulkSetR()) return "BulkSet";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtl2L()) return "Dtl2";
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
		if(bId.equals("Cnd2")) return getCnd2L();
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("BulkSet")) return getBulkSetR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Dtl2")) return getDtl2L();
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
		ret.add(Cnd2Panel);
		ret.add(TOPPanel);
		ret.add(HdrTabPanel);
		ret.add(TabPanel);
		ret.add(Tab2Panel);
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(Dtl2Panel);
		ret.add(BtnPanel);
		ret.add(Btn1Panel);
		ret.add(Btn2Panel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PoReg_MC_A() {
		aCndR = createCndR();
		aCnd2L = createCnd2L();
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		aDtl2L = createDtl2L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PoReg_MC_A(String name) {
		aCndR = createCndR();
		aCnd2L = createCnd2L();
		createCnd2Table();
		Cnd2Table.setRowName(name);
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBDP_PoReg_MC.jbCreateScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateCnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateCnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateTOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateHdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateTab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateHdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateHdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateBulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateDtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateDtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateBtn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateBtn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateBtn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbCreateEastBtn((MSBDP_PoReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PoReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PoReg p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBDP_PoReg p) {
	}

	/**
	 * [TOP]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTOP(MSBDP_PoReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBDP_PoReg p) {
	}

	/**
	 * [Tab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab(MSBDP_PoReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBDP_PoReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBDP_PoReg p) {
		p.Hdr_sppl_p_PPanel = mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.create(p.getHdrR().sppl_p());
		p.Hdr_sppl_p_PPanel.setName("Hdr.sppl_p");
		p.Hdr_show_dtl = p.Hdr_sppl_p_PPanel.Addr_show_dtl;
		p.Hdr_show_dtl.addAliasName("Hdr.show_dtl", p);
		p.Hdr_sppl_cntry_cd = p.Hdr_sppl_p_PPanel.Addr_cntry_cd;
		p.Hdr_sppl_cntry_cd.addAliasName("Hdr.sppl_cntry_cd", p);
		p.Hdr_sppl_cntry_nm = p.Hdr_sppl_p_PPanel.Addr_cntry_nm;
		p.Hdr_sppl_cntry_nm.addAliasName("Hdr.sppl_cntry_nm", p);
		p.Hdr_sppl_zip_cd = p.Hdr_sppl_p_PPanel.Addr_zip_cd;
		p.Hdr_sppl_zip_cd.addAliasName("Hdr.sppl_zip_cd", p);
		p.Hdr_sppl_addr1 = p.Hdr_sppl_p_PPanel.Addr_addr1;
		p.Hdr_sppl_addr1.addAliasName("Hdr.sppl_addr1", p);
		p.Hdr_sppl_addr2 = p.Hdr_sppl_p_PPanel.Addr_addr2;
		p.Hdr_sppl_addr2.addAliasName("Hdr.sppl_addr2", p);
		p.Hdr_sppl_addr3 = p.Hdr_sppl_p_PPanel.Addr_addr3;
		p.Hdr_sppl_addr3.addAliasName("Hdr.sppl_addr3", p);
		p.Hdr_sppl_addr4 = p.Hdr_sppl_p_PPanel.Addr_addr4;
		p.Hdr_sppl_addr4.addAliasName("Hdr.sppl_addr4", p);
		p.Hdr_sppl_tel = p.Hdr_sppl_p_PPanel.Addr_tel;
		p.Hdr_sppl_tel.addAliasName("Hdr.sppl_tel", p);
		p.Hdr_sppl_fax = p.Hdr_sppl_p_PPanel.Addr_fax;
		p.Hdr_sppl_fax.addAliasName("Hdr.sppl_fax", p);
		p.Hdr_sppl_cntct_dpt = p.Hdr_sppl_p_PPanel.Addr_cntct_dpt;
		p.Hdr_sppl_cntct_dpt.addAliasName("Hdr.sppl_cntct_dpt", p);
		p.Hdr_sppl_cntct_psn = p.Hdr_sppl_p_PPanel.Addr_cntct_psn;
		p.Hdr_sppl_cntct_psn.addAliasName("Hdr.sppl_cntct_psn", p);
		p.Hdr_purc_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().purc_usr_dpt_p());
		p.Hdr_purc_usr_dpt_p_PPanel.setName("Hdr.purc_usr_dpt_p");
		p.Hdr_purc_usr_cd = p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_purc_usr_cd.addAliasName("Hdr.purc_usr_cd", p);
		p.Hdr_purc_usr_nm = p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_purc_usr_nm.addAliasName("Hdr.purc_usr_nm", p);
		p.Hdr_purc_dpt_cd = p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_purc_dpt_cd.addAliasName("Hdr.purc_dpt_cd", p);
		p.Hdr_purc_dpt_nm = p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_purc_dpt_nm.addAliasName("Hdr.purc_dpt_nm", p);
		p.Hdr_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdrR().xrate_p());
		p.Hdr_xrate_p_PPanel.setName("Hdr.xrate_p");
		p.Hdr_xrate = p.Hdr_xrate_p_PPanel.Xrate_xrate;
		p.Hdr_xrate.addAliasName("Hdr.xrate", p);
		p.Hdr_prax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdrR().prax_xrate_p());
		p.Hdr_prax_xrate_p_PPanel.setName("Hdr.prax_xrate_p");
		p.Hdr_ptax_xrate = p.Hdr_prax_xrate_p_PPanel.Xrate_xrate;
		p.Hdr_ptax_xrate.addAliasName("Hdr.ptax_xrate", p);
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
	protected static void jbCreateHdr2(MSBDP_PoReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBDP_PoReg p) {
		p.BulkSet_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().dlv_rqst_tm_p());
		p.BulkSet_dlv_rqst_tm_p_PPanel.setName("BulkSet.dlv_rqst_tm_p");
		p.BulkSet_dlv_rqst_dt = p.BulkSet_dlv_rqst_tm_p_PPanel.YmdHm_ymd;
		p.BulkSet_dlv_rqst_dt.addAliasName("BulkSet.dlv_rqst_dt", p);
		p.BulkSet_dlv_rqst_hm = p.BulkSet_dlv_rqst_tm_p_PPanel.YmdHm_hm;
		p.BulkSet_dlv_rqst_hm.addAliasName("BulkSet.dlv_rqst_hm", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBDP_PoReg p) {
		p.Dtl_in_to_loc_p_PPanel = mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$in_to_loc_p);
		p.Dtl_in_to_loc_p_PPanel.setName("Dtl.in_to_loc_p");
		p.columnDtl_show_dtl = p.Dtl_in_to_loc_p_PPanel.columnAddr_show_dtl;
		p.columnDtl_show_dtl.addAliasName("Dtl.show_dtl", p);
		p.columnDtl_in_to_loc_zip_cd = p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd;
		p.columnDtl_in_to_loc_zip_cd.addAliasName("Dtl.in_to_loc_zip_cd", p);
		p.columnDtl_in_to_loc_addr1 = p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1;
		p.columnDtl_in_to_loc_addr1.addAliasName("Dtl.in_to_loc_addr1", p);
		p.columnDtl_in_to_loc_addr2 = p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2;
		p.columnDtl_in_to_loc_addr2.addAliasName("Dtl.in_to_loc_addr2", p);
		p.columnDtl_in_to_loc_addr3 = p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3;
		p.columnDtl_in_to_loc_addr3.addAliasName("Dtl.in_to_loc_addr3", p);
		p.columnDtl_in_to_loc_addr4 = p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4;
		p.columnDtl_in_to_loc_addr4.addAliasName("Dtl.in_to_loc_addr4", p);
		p.columnDtl_in_to_loc_tel = p.Dtl_in_to_loc_p_PPanel.columnAddr_tel;
		p.columnDtl_in_to_loc_tel.addAliasName("Dtl.in_to_loc_tel", p);
		p.columnDtl_in_to_loc_fax = p.Dtl_in_to_loc_p_PPanel.columnAddr_fax;
		p.columnDtl_in_to_loc_fax.addAliasName("Dtl.in_to_loc_fax", p);
		p.Dtl_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$dlv_rqst_tm_p);
		p.Dtl_dlv_rqst_tm_p_PPanel.setName("Dtl.dlv_rqst_tm_p");
		p.columnDtl_dlv_rqst_dt = p.Dtl_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_dlv_rqst_dt.addAliasName("Dtl.dlv_rqst_dt", p);
		p.columnDtl_dlv_rqst_hm = p.Dtl_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_dlv_rqst_hm.addAliasName("Dtl.dlv_rqst_hm", p);
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$itm_p);
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
		p.Dtl_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$str_ln_p);
		p.Dtl_str_ln_p_PPanel.setName("Dtl.str_ln_p");
		p.columnDtl_str_ln_cd = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl_str_ln_cd.addAliasName("Dtl.str_ln_cd", p);
		p.columnDtl_str_ln_nm = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl_str_ln_nm.addAliasName("Dtl.str_ln_nm", p);
		p.columnDtl_str_ln_cd_none_flg = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl_str_ln_cd_none_flg.addAliasName("Dtl.str_ln_cd_none_flg", p);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$rqst_dlv_rqst_tm_p);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.setName("Dtl.rqst_dlv_rqst_tm_p");
		p.columnDtl_rqst_dlv_rqst_dt = p.Dtl_rqst_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_rqst_dlv_rqst_dt.addAliasName("Dtl.rqst_dlv_rqst_dt", p);
		p.columnDtl_rqst_dlv_rqst_hm = p.Dtl_rqst_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_rqst_dlv_rqst_hm.addAliasName("Dtl.rqst_dlv_rqst_hm", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$dlv_p);
		p.Dtl_dlv_p_PPanel.setName("Dtl.dlv_p");
		p.columnDtl_dlv_cd = p.Dtl_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnDtl_dlv_cd.addAliasName("Dtl.dlv_cd", p);
		p.columnDtl_dlv_nm = p.Dtl_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnDtl_dlv_nm.addAliasName("Dtl.dlv_nm", p);
		p.columnDtl_dlv_sundry_flg = p.Dtl_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDtl_dlv_sundry_flg.addAliasName("Dtl.dlv_sundry_flg", p);
		p.columnDtl_dlv_show_dtl = p.Dtl_dlv_p_PPanel.columnDlv_show_dtl;
		p.columnDtl_dlv_show_dtl.addAliasName("Dtl.dlv_show_dtl", p);
		p.columnDtl_dlv_cntry_cd = p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnDtl_dlv_cntry_cd.addAliasName("Dtl.dlv_cntry_cd", p);
		p.columnDtl_dlv_cntry_nm = p.Dtl_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnDtl_dlv_cntry_nm.addAliasName("Dtl.dlv_cntry_nm", p);
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
		p.columnDtl_dlv_tel = p.Dtl_dlv_p_PPanel.columnDlv_tel;
		p.columnDtl_dlv_tel.addAliasName("Dtl.dlv_tel", p);
		p.columnDtl_dlv_fax = p.Dtl_dlv_p_PPanel.columnDlv_fax;
		p.columnDtl_dlv_fax.addAliasName("Dtl.dlv_fax", p);
		p.columnDtl_dlv_cntct_dpt = p.Dtl_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnDtl_dlv_cntct_dpt.addAliasName("Dtl.dlv_cntct_dpt", p);
		p.columnDtl_dlv_cntct_psn = p.Dtl_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnDtl_dlv_cntct_psn.addAliasName("Dtl.dlv_cntct_psn", p);
		p.Dtl_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$tdlv_p);
		p.Dtl_tdlv_p_PPanel.setName("Dtl.tdlv_p");
		p.columnDtl_tdlv_cd = p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnDtl_tdlv_cd.addAliasName("Dtl.tdlv_cd", p);
		p.columnDtl_tdlv_nm = p.Dtl_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnDtl_tdlv_nm.addAliasName("Dtl.tdlv_nm", p);
		p.columnDtl_tdlv_sundry_flg = p.Dtl_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDtl_tdlv_sundry_flg.addAliasName("Dtl.tdlv_sundry_flg", p);
		p.columnDtl_tdlv_show_dtl = p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl;
		p.columnDtl_tdlv_show_dtl.addAliasName("Dtl.tdlv_show_dtl", p);
		p.columnDtl_tdlv_cntry_cd = p.Dtl_tdlv_p_PPanel.columnDlv_cntry_cd;
		p.columnDtl_tdlv_cntry_cd.addAliasName("Dtl.tdlv_cntry_cd", p);
		p.columnDtl_tdlv_cntry_nm = p.Dtl_tdlv_p_PPanel.columnDlv_cntry_nm;
		p.columnDtl_tdlv_cntry_nm.addAliasName("Dtl.tdlv_cntry_nm", p);
		p.columnDtl_tdlv_zip_cd = p.Dtl_tdlv_p_PPanel.columnDlv_zip_cd;
		p.columnDtl_tdlv_zip_cd.addAliasName("Dtl.tdlv_zip_cd", p);
		p.columnDtl_tdlv_addr1 = p.Dtl_tdlv_p_PPanel.columnDlv_addr1;
		p.columnDtl_tdlv_addr1.addAliasName("Dtl.tdlv_addr1", p);
		p.columnDtl_tdlv_addr2 = p.Dtl_tdlv_p_PPanel.columnDlv_addr2;
		p.columnDtl_tdlv_addr2.addAliasName("Dtl.tdlv_addr2", p);
		p.columnDtl_tdlv_addr3 = p.Dtl_tdlv_p_PPanel.columnDlv_addr3;
		p.columnDtl_tdlv_addr3.addAliasName("Dtl.tdlv_addr3", p);
		p.columnDtl_tdlv_addr4 = p.Dtl_tdlv_p_PPanel.columnDlv_addr4;
		p.columnDtl_tdlv_addr4.addAliasName("Dtl.tdlv_addr4", p);
		p.columnDtl_tdlv_tel = p.Dtl_tdlv_p_PPanel.columnDlv_tel;
		p.columnDtl_tdlv_tel.addAliasName("Dtl.tdlv_tel", p);
		p.columnDtl_tdlv_fax = p.Dtl_tdlv_p_PPanel.columnDlv_fax;
		p.columnDtl_tdlv_fax.addAliasName("Dtl.tdlv_fax", p);
		p.columnDtl_tdlv_cntct_dpt = p.Dtl_tdlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnDtl_tdlv_cntct_dpt.addAliasName("Dtl.tdlv_cntct_dpt", p);
		p.columnDtl_tdlv_cntct_psn = p.Dtl_tdlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnDtl_tdlv_cntct_psn.addAliasName("Dtl.tdlv_cntct_psn", p);
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_inst_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$inst_cont_qty_p);
		p.Dtl_inst_cont_qty_p_PPanel.setName("Dtl.inst_cont_qty_p");
		p.columnDtl_cont_qty = p.Dtl_inst_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_cont_qty.addAliasName("Dtl.cont_qty", p);
		p.Dtl_cont_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$cont_unit_p);
		p.Dtl_cont_unit_p_PPanel.setName("Dtl.cont_unit_p");
		p.columnDtl_cont_fctr_unit_cd = p.Dtl_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl_cont_fctr_unit_cd.addAliasName("Dtl.cont_fctr_unit_cd", p);
		p.columnDtl_cont_fctr_unit_nm = p.Dtl_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl_cont_fctr_unit_nm.addAliasName("Dtl.cont_fctr_unit_nm", p);
		p.Dtl_std_cont_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$std_cont_p);
		p.Dtl_std_cont_p_PPanel.setName("Dtl.std_cont_p");
		p.columnDtl_std_cont_fctr = p.Dtl_std_cont_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl_std_cont_fctr.addAliasName("Dtl.std_cont_fctr", p);
		p.Dtl_trd_cur_upri_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$trd_cur_upri_p);
		p.Dtl_trd_cur_upri_p_PPanel.setName("Dtl.trd_cur_upri_p");
		p.columnDtl_upri_not_tgt_flg = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl_upri_not_tgt_flg.addAliasName("Dtl.upri_not_tgt_flg", p);
		p.columnDtl_trd_cur_upri = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl_trd_cur_upri.addAliasName("Dtl.trd_cur_upri", p);
		p.columnDtl_interim_flg = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl_interim_flg.addAliasName("Dtl.interim_flg", p);
		p.columnDtl_trd_cur_amt = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl_trd_cur_amt.addAliasName("Dtl.trd_cur_amt", p);
		p.columnDtl_trd_cur_inc_tax_amt = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl_trd_cur_inc_tax_amt.addAliasName("Dtl.trd_cur_inc_tax_amt", p);
		p.columnDtl_tax_fix_flg = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl_tax_fix_flg.addAliasName("Dtl.tax_fix_flg", p);
		p.columnDtl_tax_cd = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl_tax_cd.addAliasName("Dtl.tax_cd", p);
		p.columnDtl_tax_nm = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl_tax_nm.addAliasName("Dtl.tax_nm", p);
		p.columnDtl_tax_rate = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl_tax_rate.addAliasName("Dtl.tax_rate", p);
		p.columnDtl_tax_typ = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl_tax_typ.addAliasName("Dtl.tax_typ", p);
		p.columnDtl_inc_tax_flg = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl_inc_tax_flg.addAliasName("Dtl.inc_tax_flg", p);
		p.columnDtl_trd_cur_tax_amt = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl_trd_cur_tax_amt.addAliasName("Dtl.trd_cur_tax_amt", p);
		p.columnDtl_trd_cur_dscnt_amt = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl_trd_cur_dscnt_amt.addAliasName("Dtl.trd_cur_dscnt_amt", p);
		p.columnDtl_dscnt_rsn_cd = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl_dscnt_rsn_cd.addAliasName("Dtl.dscnt_rsn_cd", p);
		p.columnDtl_dscnt_rsn_nm = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl_dscnt_rsn_nm.addAliasName("Dtl.dscnt_rsn_nm", p);
		p.Dtl_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$trd_cur_proc_upri_p);
		p.Dtl_trd_cur_proc_upri_p_PPanel.setName("Dtl.trd_cur_proc_upri_p");
		p.columnDtl_trd_cur_proc_upri = p.Dtl_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_trd_cur_proc_upri.addAliasName("Dtl.trd_cur_proc_upri", p);
		p.Dtl_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$trd_cur_proc_amt_p);
		p.Dtl_trd_cur_proc_amt_p_PPanel.setName("Dtl.trd_cur_proc_amt_p");
		p.columnDtl_trd_cur_proc_amt = p.Dtl_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_proc_amt.addAliasName("Dtl.trd_cur_proc_amt", p);
		p.columnDtl_trd_cur_proc_tax_amt = p.Dtl_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl_trd_cur_proc_tax_amt.addAliasName("Dtl.trd_cur_proc_tax_amt", p);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$trd_cur_onr_prov_upri_p);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.setName("Dtl.trd_cur_onr_prov_upri_p");
		p.columnDtl_trd_cur_onr_prov_upri = p.Dtl_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_trd_cur_onr_prov_upri.addAliasName("Dtl.trd_cur_onr_prov_upri", p);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$trd_cur_onr_prov_amt_p);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.setName("Dtl.trd_cur_onr_prov_amt_p");
		p.columnDtl_trd_cur_onr_prov_amt = p.Dtl_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_onr_prov_amt.addAliasName("Dtl.trd_cur_onr_prov_amt", p);
		p.columnDtl_trd_cur_onr_prov_tax_amt = p.Dtl_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl_trd_cur_onr_prov_tax_amt.addAliasName("Dtl.trd_cur_onr_prov_tax_amt", p);
		p.Dtl_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_cur_upri_p);
		p.Dtl_base_cur_upri_p_PPanel.setName("Dtl.base_cur_upri_p");
		p.columnDtl_base_cur_upri = p.Dtl_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_upri.addAliasName("Dtl.base_cur_upri", p);
		p.Dtl_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_cur_dscnt_amt_p);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.setName("Dtl.base_cur_dscnt_amt_p");
		p.columnDtl_base_cur_dscnt_amt = p.Dtl_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_dscnt_amt.addAliasName("Dtl.base_cur_dscnt_amt", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_cur_tax_amt_p);
		p.Dtl_base_cur_tax_amt_p_PPanel.setName("Dtl.base_cur_tax_amt_p");
		p.columnDtl_base_cur_tax_amt = p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_tax_amt.addAliasName("Dtl.base_cur_tax_amt", p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_cur_inc_tax_amt_p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_inc_tax_amt_p");
		p.columnDtl_base_cur_inc_tax_amt = p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_inc_tax_amt.addAliasName("Dtl.base_cur_inc_tax_amt", p);
		p.Dtl_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_cur_proc_upri_p);
		p.Dtl_base_cur_proc_upri_p_PPanel.setName("Dtl.base_cur_proc_upri_p");
		p.columnDtl_base_cur_proc_upri = p.Dtl_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_proc_upri.addAliasName("Dtl.base_cur_proc_upri", p);
		p.Dtl_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_cur_proc_amt_p);
		p.Dtl_base_cur_proc_amt_p_PPanel.setName("Dtl.base_cur_proc_amt_p");
		p.columnDtl_base_cur_proc_amt = p.Dtl_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_proc_amt.addAliasName("Dtl.base_cur_proc_amt", p);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_cur_onr_prov_upri_p);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.setName("Dtl.base_cur_onr_prov_upri_p");
		p.columnDtl_base_cur_onr_prov_upri = p.Dtl_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_onr_prov_upri.addAliasName("Dtl.base_cur_onr_prov_upri", p);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$base_cur_onr_prov_amt_p);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.setName("Dtl.base_cur_onr_prov_amt_p");
		p.columnDtl_base_cur_onr_prov_amt = p.Dtl_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_onr_prov_amt.addAliasName("Dtl.base_cur_onr_prov_amt", p);
		p.Dtl_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ptax_cur_upri_p);
		p.Dtl_ptax_cur_upri_p_PPanel.setName("Dtl.ptax_cur_upri_p");
		p.columnDtl_ptax_cur_upri = p.Dtl_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_upri.addAliasName("Dtl.ptax_cur_upri", p);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ptax_cur_dscnt_amt_p);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.setName("Dtl.ptax_cur_dscnt_amt_p");
		p.columnDtl_ptax_cur_dscnt_amt = p.Dtl_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_dscnt_amt.addAliasName("Dtl.ptax_cur_dscnt_amt", p);
		p.Dtl_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ptax_cur_amt_p);
		p.Dtl_ptax_cur_amt_p_PPanel.setName("Dtl.ptax_cur_amt_p");
		p.columnDtl_ptax_cur_amt = p.Dtl_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_amt.addAliasName("Dtl.ptax_cur_amt", p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ptax_cur_tax_amt_p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.setName("Dtl.ptax_cur_tax_amt_p");
		p.columnDtl_ptax_cur_tax_amt = p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_tax_amt.addAliasName("Dtl.ptax_cur_tax_amt", p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ptax_cur_inc_tax_amt_p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl.ptax_cur_inc_tax_amt_p");
		p.columnDtl_ptax_cur_inc_tax_amt = p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_inc_tax_amt.addAliasName("Dtl.ptax_cur_inc_tax_amt", p);
		p.Dtl_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ptax_cur_proc_upri_p);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.setName("Dtl.ptax_cur_proc_upri_p");
		p.columnDtl_ptax_cur_proc_upri = p.Dtl_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_proc_upri.addAliasName("Dtl.ptax_cur_proc_upri", p);
		p.Dtl_ptax_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ptax_cur_proc_amt_p);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.setName("Dtl.ptax_cur_proc_amt_p");
		p.columnDtl_ptax_cur_proc_amt = p.Dtl_ptax_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_proc_amt.addAliasName("Dtl.ptax_cur_proc_amt", p);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ptax_cur_onr_prov_upri_p);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.setName("Dtl.ptax_cur_onr_prov_upri_p");
		p.columnDtl_ptax_cur_onr_prov_upri = p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_onr_prov_upri.addAliasName("Dtl.ptax_cur_onr_prov_upri", p);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$ptax_cur_onr_prov_amt_p);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.setName("Dtl.ptax_cur_onr_prov_amt_p");
		p.columnDtl_ptax_cur_onr_prov_amt = p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_onr_prov_amt.addAliasName("Dtl.ptax_cur_onr_prov_amt", p);
		p.Dtl_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$wtax_amt_p);
		p.Dtl_wtax_amt_p_PPanel.setName("Dtl.wtax_amt_p");
		p.columnDtl_wtax_amt = p.Dtl_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_wtax_amt.addAliasName("Dtl.wtax_amt", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$sno_wrk_no_p);
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
		p.Dtl_bditm_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBD.MSBDP0080.DtlR.$bditm_p);
		p.Dtl_bditm_p_PPanel.setName("Dtl.bditm_p");
		p.columnDtl_bd_dpt_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd;
		p.columnDtl_bd_dpt_cd.addAliasName("Dtl.bd_dpt_cd", p);
		p.columnDtl_bd_dpt_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_nm;
		p.columnDtl_bd_dpt_nm.addAliasName("Dtl.bd_dpt_nm", p);
		p.columnDtl_bd_itm_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd;
		p.columnDtl_bd_itm_cd.addAliasName("Dtl.bd_itm_cd", p);
		p.columnDtl_bd_itm_sub1 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1;
		p.columnDtl_bd_itm_sub1.addAliasName("Dtl.bd_itm_sub1", p);
		p.columnDtl_bd_itm_sub2 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2;
		p.columnDtl_bd_itm_sub2.addAliasName("Dtl.bd_itm_sub2", p);
		p.columnDtl_bd_itm_sub3 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3;
		p.columnDtl_bd_itm_sub3.addAliasName("Dtl.bd_itm_sub3", p);
		p.columnDtl_bd_itm_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_nm;
		p.columnDtl_bd_itm_nm.addAliasName("Dtl.bd_itm_nm", p);
		p.columnDtl_bd_lot_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_lot_no;
		p.columnDtl_bd_lot_no.addAliasName("Dtl.bd_lot_no", p);
		p.columnDtl_bd_sublot_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sublot_no;
		p.columnDtl_bd_sublot_no.addAliasName("Dtl.bd_sublot_no", p);
		p.columnDtl_bd_sno1 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sno1;
		p.columnDtl_bd_sno1.addAliasName("Dtl.bd_sno1", p);
		p.columnDtl_bd_sno2 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sno2;
		p.columnDtl_bd_sno2.addAliasName("Dtl.bd_sno2", p);
		p.columnDtl_bd_sno3 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sno3;
		p.columnDtl_bd_sno3.addAliasName("Dtl.bd_sno3", p);
		p.columnDtl_bd_sno4 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sno4;
		p.columnDtl_bd_sno4.addAliasName("Dtl.bd_sno4", p);
		p.columnDtl_bd_bp_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd;
		p.columnDtl_bd_bp_cd.addAliasName("Dtl.bd_bp_cd", p);
		p.columnDtl_bd_bp_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm;
		p.columnDtl_bd_bp_nm.addAliasName("Dtl.bd_bp_nm", p);
		p.columnDtl_bd_loc_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_loc_cd;
		p.columnDtl_bd_loc_cd.addAliasName("Dtl.bd_loc_cd", p);
		p.columnDtl_bd_loc_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_loc_nm;
		p.columnDtl_bd_loc_nm.addAliasName("Dtl.bd_loc_nm", p);
		p.columnDtl_bd_ctg_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_ctg_cd;
		p.columnDtl_bd_ctg_cd.addAliasName("Dtl.bd_ctg_cd", p);
		p.columnDtl_bd_ctg_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_ctg_nm;
		p.columnDtl_bd_ctg_nm.addAliasName("Dtl.bd_ctg_nm", p);
		p.columnDtl_bd_oper_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_oper_cd;
		p.columnDtl_bd_oper_cd.addAliasName("Dtl.bd_oper_cd", p);
		p.columnDtl_bd_oper_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_oper_nm;
		p.columnDtl_bd_oper_nm.addAliasName("Dtl.bd_oper_nm", p);
		p.columnDtl_bd_iv_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_iv_no;
		p.columnDtl_bd_iv_no.addAliasName("Dtl.bd_iv_no", p);
		p.columnDtl_bd_slo_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_slo_no;
		p.columnDtl_bd_slo_no.addAliasName("Dtl.bd_slo_no", p);
		p.columnDtl_bd_po_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_po_no;
		p.columnDtl_bd_po_no.addAliasName("Dtl.bd_po_no", p);
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MSBDP_PoReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBDP_PoReg p) {
		p.Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_menu_move_p_PPanel.setName("Btn.menu_move_p");
	}

	/**
	 * [Btn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn1(MSBDP_PoReg p) {
	}

	/**
	 * [Btn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn2(MSBDP_PoReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBDP_PoReg p) {
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
	
	
	/** [Hdr_sppl_cd_ListPutter]の定義 */
	private MCListPutter Hdr_sppl_cd_p = null;

	/**
	 * [Hdr_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_sppl_cd_ListPutter() {
		if (Hdr_sppl_cd_p == null) {
			Hdr_sppl_cd_p = createHdr_sppl_cd_ListPutter(Hdr_sppl_cd, "sppl_cd", "sppl_nm","asppl_cd","trd_cur_cd","def_purc_usr_cd","def_purc_dpt_cd","ap_dpt_cd","mst_ap_dpt_cd","sppl_iv_flg","prnt_lcl_cd","sppl_purc_upri_cng_flg","purc_upri_req_typ","sppl_cal_cd","purc_amt_rnd_typ","purc_tax_rnd_typ","subcon_flg","sppl_ship_form_cd","sppl_tel","sppl_fax","sppl_zip_cd","sppl_addr1","sppl_addr2","sppl_addr3","sppl_addr4","sppl_cntct_dpt","sppl_cntct_psn","sppl_cntry_cd","sppl_cntry_nm","sppl_pay_crryovr_times","po_print_cd","edi_tgt_flg","tterm_cd1","tterm_cd2","tterm_cd3","repurc_obli_flg","outsrc_upri_typ");

		}
		return Hdr_sppl_cd_p;
	}
	
	
	/** [Hdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "purc_dpt_cd", "purc_dpt_nm","purc_dpt_wg_cd","purc_dpt_wg_nm","ap_dpt_flg");
		}
		return Hdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
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
	
	
	/** [Hdr_po_print_cd_ListPutter]の定義 */
	private MCListPutter Hdr_po_print_cd_p = null;

	/**
	 * [Hdr_po_print_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_po_print_cd_ListPutter() {
		if (Hdr_po_print_cd_p == null) {
			Hdr_po_print_cd_p = createHdr_po_print_cd_ListPutter(Hdr_po_print_cd, "po_print_cd", "po_print_nm");

		}
		return Hdr_po_print_cd_p;
	}
	
	
	/** [Hdr_po_crct_rsn_cd_ListPutter]の定義 */
	private MCListPutter Hdr_po_crct_rsn_cd_p = null;

	/**
	 * [Hdr_po_crct_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_po_crct_rsn_cd_ListPutter() {
		if (Hdr_po_crct_rsn_cd_p == null) {
			Hdr_po_crct_rsn_cd_p = createHdr_po_crct_rsn_cd_ListPutter(Hdr_po_crct_rsn_cd, "po_crct_rsn_cd", "po_crct_rsn_nm","po_crct_rsn_rmrks");

		}
		return Hdr_po_crct_rsn_cd_p;
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
	
	
	/** [Hdr_asppl_cd_ListPutter]の定義 */
	private MCListPutter Hdr_asppl_cd_p = null;

	/**
	 * [Hdr_asppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_asppl_cd_ListPutter() {
		if (Hdr_asppl_cd_p == null) {
			Hdr_asppl_cd_p = createHdr_asppl_cd_ListPutter(Hdr_asppl_cd, "asppl_cd", "asppl_nm");

		}
		return Hdr_asppl_cd_p;
	}
	
	
	/** [Dtl_in_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_in_to_loc_cd_p = null;

	/**
	 * [Dtl_in_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_in_to_loc_cd_ListPutter() {
		if (Dtl_in_to_loc_cd_p == null) {
			Dtl_in_to_loc_cd_p = createDtl_in_to_loc_cd_ListPutter(columnDtl_in_to_loc_cd, "in_to_loc_cd", "in_to_loc_nm","str_ln_tgt_flg","outsrc_sppl_cd","in_to_loc_wg_cd","in_to_loc_wg_nm","loc_mng_typ","in_to_loc_zip_cd","in_to_loc_addr1","in_to_loc_addr2","in_to_loc_addr3","in_to_loc_addr4","in_to_loc_tel","in_to_loc_fax","in_to_loc_cal_cd","site_cd","lg_grp_cd","loc_grp_cd","str_ln_cd","str_ln_cd_none_flg");

		}
		return Dtl_in_to_loc_cd_p;
	}
	
	
	/** [Dtl_drct_dlv_typ_ListPutter]の定義 */
	private MCListPutter Dtl_drct_dlv_typ_p = null;

	/**
	 * [Dtl_drct_dlv_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_drct_dlv_typ_ListPutter() {
		if (Dtl_drct_dlv_typ_p == null) {
			Dtl_drct_dlv_typ_p = createDtl_drct_dlv_typ_ListPutter(columnDtl_drct_dlv_typ, "drct_dlv_typ", "drct_dlv_typ_nm");

		}
		return Dtl_drct_dlv_typ_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","stk_mng_typ","ver_flg","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_dec_place","cont_fctr_rnd_typ","itm_purc_upri_cng_flg","tax_cd","wtax_rate","itm_pay_crryovr_times","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","arr_skip_flg","maker_nm","purc_id_typ","maker_cd","mfg_loc_wg_cd","mfg_loc_nm","bom_ptn","mfg_loc_cd","purc_basis_typ","purc_dlv_slip_flg");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","stk_mng_typ","ver_flg","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_dec_place","cont_fctr_rnd_typ","itm_purc_upri_cng_flg","tax_cd","wtax_rate","itm_pay_crryovr_times","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","arr_skip_flg","maker_nm","purc_id_typ","maker_cd","mfg_loc_wg_cd","mfg_loc_nm","bom_ptn","mfg_loc_cd","purc_basis_typ","purc_dlv_slip_flg");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","stk_mng_typ","ver_flg","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_dec_place","cont_fctr_rnd_typ","itm_purc_upri_cng_flg","tax_cd","wtax_rate","itm_pay_crryovr_times","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","arr_skip_flg","maker_nm","purc_id_typ","maker_cd","mfg_loc_wg_cd","mfg_loc_nm","bom_ptn","mfg_loc_cd","purc_basis_typ","purc_dlv_slip_flg");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","stk_mng_typ","ver_flg","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_dec_place","cont_fctr_rnd_typ","itm_purc_upri_cng_flg","tax_cd","wtax_rate","itm_pay_crryovr_times","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","arr_skip_flg","maker_nm","purc_id_typ","maker_cd","mfg_loc_wg_cd","mfg_loc_nm","bom_ptn","mfg_loc_cd","purc_basis_typ","purc_dlv_slip_flg");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_asset_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_asset_mng_typ_p = null;

	/**
	 * [Dtl_asset_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_asset_mng_typ_ListPutter() {
		if (Dtl_asset_mng_typ_p == null) {
			Dtl_asset_mng_typ_p = createDtl_asset_mng_typ_ListPutter(columnDtl_asset_mng_typ, "asset_mng_typ", "asset_mng_typ_nm");

		}
		return Dtl_asset_mng_typ_p;
	}
	
	
	/** [Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd, "str_ln_cd", "str_ln_nm");
		}
		return Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Dtl_maker_cd_ListPutter]の定義 */
	private MCListPutter Dtl_maker_cd_p = null;

	/**
	 * [Dtl_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_maker_cd_ListPutter() {
		if (Dtl_maker_cd_p == null) {
			Dtl_maker_cd_p = createDtl_maker_cd_ListPutter(columnDtl_maker_cd, "maker_cd", "maker_nm","purc_id_typ","purc_basis_typ");

		}
		return Dtl_maker_cd_p;
	}
	
	
	/** [Dtl_purc_basis_typ_ListPutter]の定義 */
	private MCListPutter Dtl_purc_basis_typ_p = null;

	/**
	 * [Dtl_purc_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_basis_typ_ListPutter() {
		if (Dtl_purc_basis_typ_p == null) {
			Dtl_purc_basis_typ_p = createDtl_purc_basis_typ_ListPutter(columnDtl_purc_basis_typ, "purc_basis_typ", "purc_basis_typ_nm");

		}
		return Dtl_purc_basis_typ_p;
	}
	
	
	/** [Dtl_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ap_dpt_cd_p = null;

	/**
	 * [Dtl_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ap_dpt_cd_ListPutter() {
		if (Dtl_ap_dpt_cd_p == null) {
			Dtl_ap_dpt_cd_p = createDtl_ap_dpt_cd_ListPutter(columnDtl_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Dtl_ap_dpt_cd_p;
	}
	
	
	/** [Dtl_purc_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl_purc_id_typ_p = null;

	/**
	 * [Dtl_purc_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_id_typ_ListPutter() {
		if (Dtl_purc_id_typ_p == null) {
			Dtl_purc_id_typ_p = createDtl_purc_id_typ_ListPutter(columnDtl_purc_id_typ, "purc_id_typ", "purc_id_typ_nm");

		}
		return Dtl_purc_id_typ_p;
	}
	
	
	/** [Dtl_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_unit_cd_p = null;

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_unit_cd_ListPutter() {
		if (Dtl_trd_unit_cd_p == null) {
			Dtl_trd_unit_cd_p = createDtl_trd_unit_cd_ListPutter(columnDtl_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_rnd_typ","trd_unit_conv_base_qty","trd_unit_conv_qty");

		}
		return Dtl_trd_unit_cd_p;
	}
	
	
	/** [Dtl_purc_upri_req_typ_ListPutter]の定義 */
	private MCListPutter Dtl_purc_upri_req_typ_p = null;

	/**
	 * [Dtl_purc_upri_req_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_upri_req_typ_ListPutter() {
		if (Dtl_purc_upri_req_typ_p == null) {
			Dtl_purc_upri_req_typ_p = createDtl_purc_upri_req_typ_ListPutter(columnDtl_purc_upri_req_typ, "purc_upri_req_typ", "purc_upri_req_typ_nm");

		}
		return Dtl_purc_upri_req_typ_p;
	}
	
	
	/** [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_typ","tax_rate","inc_tax_flg");
		}
		return Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p == null) {
			Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = createDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd, "dscnt_rsn_cd", "dscnt_rsn_nm");
		}
		return Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p;
	}
	
	
	/** [Dtl_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_mfg_loc_cd_p = null;

	/**
	 * [Dtl_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mfg_loc_cd_ListPutter() {
		if (Dtl_mfg_loc_cd_p == null) {
			Dtl_mfg_loc_cd_p = createDtl_mfg_loc_cd_ListPutter(columnDtl_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm","mfg_loc_wg_cd","purc_id_typ","purc_basis_typ");

		}
		return Dtl_mfg_loc_cd_p;
	}
	
	
	/** [Dtl_bom_ptn_ListPutter]の定義 */
	private MCListPutter Dtl_bom_ptn_p = null;

	/**
	 * [Dtl_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bom_ptn_ListPutter() {
		if (Dtl_bom_ptn_p == null) {
			Dtl_bom_ptn_p = createDtl_bom_ptn_ListPutter(columnDtl_bom_ptn, "bom_ptn", "purc_id_typ","purc_basis_typ");

		}
		return Dtl_bom_ptn_p;
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
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p = createDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p;
	}
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = createDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd, "bd_itm_cd", "bd_itm_sub1","bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_p;
	}
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1, "bd_itm_sub1", "bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p;
	}
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2, "bd_itm_sub2", "bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p;
	}
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3, "bd_itm_sub3", "bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PoReg create(){
		MSBDP_PoReg p = new MSBDP_PoReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PoReg create(String name){
		MSBDP_PoReg p = new MSBDP_PoReg(name);
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
		MSBDP_PoReg_MC.jbfInitScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitCnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitCnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitTOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitHdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitTab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitHdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitHdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitBulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitDtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitDtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitBtn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitBtn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitBtn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbfInitEastBtn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitCnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitCnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitTOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitHdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitTab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitHdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitHdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitBulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitDtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitDtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitBtn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitBtn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitBtn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.jbInitEastBtn((MSBDP_PoReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_rev_no = p.beansFactory.createNumberField("Cnd.rev_no");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_srch_po = p.beansFactory.createButton("Cnd.srch_po", "srch");
		p.Cnd_srch_po_schd = p.beansFactory.createButton("Cnd.srch_po_schd", "srch");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		p.Cnd2ScrollPane = p.beansFactory.createScrollPane("Cnd2.scroll");
		p.createCnd2Table();
		// ブロックの項目の初期化
		p.columnCnd2_po_schd_no = p.beansFactory.createTableColumn("Cnd2.po_schd_no", MCColumnType.TEXT);
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTOP(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.TOPPanel = p.beansFactory.createPanel("TOP");
		// ブロックの項目の初期化
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.TabPanel = p.beansFactory.createPanel("Tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextComboBox("Hdr.trd_cd");
		p.Hdr_trd_cd.setLabel(p.Hdr_trd_cd_Label);
		p.Hdr_trd_nm = p.beansFactory.createTextField("Hdr.trd_nm");
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_po_no_Label = p.beansFactory.createLabel("Hdr.po_no_Label");
		p.Hdr_po_no = p.beansFactory.createTextField("Hdr.po_no");
		p.Hdr_po_no.setLabel(p.Hdr_po_no_Label);
		p.Hdr_po_rev = p.beansFactory.createNumberField("Hdr.po_rev");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_po_print_dt_Label = p.beansFactory.createLabel("Hdr.po_print_dt_Label");
		p.Hdr_po_print_dt = p.beansFactory.createDateField("Hdr.po_print_dt");
		p.Hdr_po_print_dt.setLabel(p.Hdr_po_print_dt_Label);
		p.Hdr_po_print_flg = p.beansFactory.createCheckBox("Hdr.po_print_flg");
		p.Hdr_dlv_print_flg = p.beansFactory.createCheckBox("Hdr.dlv_print_flg");
		p.Hdr_purc_ddlv_dlv_print_flg = p.beansFactory.createCheckBox("Hdr.purc_ddlv_dlv_print_flg");
		p.Hdr_aprv_rvrs_flg = p.beansFactory.createCheckBox("Hdr.aprv_rvrs_flg");
		p.Hdr_aprv_flg = p.beansFactory.createCheckBox("Hdr.aprv_flg");
		p.Hdr_aprv_no_Label = p.beansFactory.createLabel("Hdr.aprv_no_Label");
		p.Hdr_aprv_no = p.beansFactory.createTextField("Hdr.aprv_no");
		p.Hdr_aprv_no.setLabel(p.Hdr_aprv_no_Label);
		p.Hdr_aprv_sts_typ_Label = p.beansFactory.createLabel("Hdr.aprv_sts_typ_Label");
		p.Hdr_aprv_sts_typ = p.beansFactory.createTextField("Hdr.aprv_sts_typ");
		p.Hdr_aprv_sts_typ.setLabel(p.Hdr_aprv_sts_typ_Label);
		p.Hdr_aprv_sts_typ_nm = p.beansFactory.createTextField("Hdr.aprv_sts_typ_nm");
		p.Hdr_aprv_upd_flg = p.beansFactory.createCheckBox("Hdr.aprv_upd_flg");
		p.Hdr_aprv_can_flg = p.beansFactory.createCheckBox("Hdr.aprv_can_flg");
		p.Hdr_po_dt_Label = p.beansFactory.createLabel("Hdr.po_dt_Label");
		p.Hdr_po_dt = p.beansFactory.createDateField("Hdr.po_dt");
		p.Hdr_po_dt.setLabel(p.Hdr_po_dt_Label);
		p.Hdr_sppl_cd_Label = p.beansFactory.createLabel("Hdr.sppl_cd_Label");
		p.Hdr_sppl_cd = p.beansFactory.createTextField("Hdr.sppl_cd");
		p.Hdr_sppl_cd.setLabel(p.Hdr_sppl_cd_Label);
		p.Hdr_sppl_nm = p.beansFactory.createTextField("Hdr.sppl_nm");
		p.Hdr_purc_amt_rnd_typ = p.beansFactory.createTextField("Hdr.purc_amt_rnd_typ");
		p.Hdr_purc_tax_rnd_typ = p.beansFactory.createTextField("Hdr.purc_tax_rnd_typ");
		p.Hdr_sppl_cal_cd = p.beansFactory.createTextField("Hdr.sppl_cal_cd");
		p.Hdr_sppl_purc_upri_cng_flg = p.beansFactory.createCheckBox("Hdr.sppl_purc_upri_cng_flg");
		p.Hdr_prnt_lcl_cd = p.beansFactory.createTextField("Hdr.prnt_lcl_cd");
		p.Hdr_sppl_ship_form_cd = p.beansFactory.createTextField("Hdr.sppl_ship_form_cd");
		p.Hdr_po_dlv_slip_flg = p.beansFactory.createCheckBox("Hdr.po_dlv_slip_flg");
		p.Hdr_ap_dpt_cd = p.beansFactory.createTextField("Hdr.ap_dpt_cd");
		p.Hdr_mst_ap_dpt_cd = p.beansFactory.createTextField("Hdr.mst_ap_dpt_cd");
		p.Hdr_purc_upri_req_typ = p.beansFactory.createTextField("Hdr.purc_upri_req_typ");
		p.Hdr_sppl_pay_crryovr_times = p.beansFactory.createNumberField("Hdr.sppl_pay_crryovr_times");
		p.Hdr_subcon_flg = p.beansFactory.createCheckBox("Hdr.subcon_flg");
		p.Hdr_repurc_obli_flg = p.beansFactory.createCheckBox("Hdr.repurc_obli_flg");
		p.Hdr_outsrc_upri_typ_Label = p.beansFactory.createLabel("Hdr.outsrc_upri_typ_Label");
		p.Hdr_outsrc_upri_typ = p.beansFactory.createTextField("Hdr.outsrc_upri_typ");
		p.Hdr_outsrc_upri_typ.setLabel(p.Hdr_outsrc_upri_typ_Label);
		p.Hdr_sppl_iv_flg = p.beansFactory.createCheckBox("Hdr.sppl_iv_flg");
		p.Hdr_edi_flg = p.beansFactory.createCheckBox("Hdr.edi_flg");
		p.Hdr_last_edi_flg = p.beansFactory.createCheckBox("Hdr.last_edi_flg");
		p.Hdr_edi_tgt_flg = p.beansFactory.createCheckBox("Hdr.edi_tgt_flg");
		p.Hdr_def_purc_usr_cd = p.beansFactory.createTextField("Hdr.def_purc_usr_cd");
		p.Hdr_def_purc_dpt_cd = p.beansFactory.createTextField("Hdr.def_purc_dpt_cd");
		p.Hdr_ap_dpt_flg = p.beansFactory.createCheckBox("Hdr.ap_dpt_flg");
		p.Hdr_purc_dpt_wg_cd_Label = p.beansFactory.createLabel("Hdr.purc_dpt_wg_cd_Label");
		p.Hdr_purc_dpt_wg_cd = p.beansFactory.createTextField("Hdr.purc_dpt_wg_cd");
		p.Hdr_purc_dpt_wg_cd.setLabel(p.Hdr_purc_dpt_wg_cd_Label);
		p.Hdr_purc_dpt_wg_nm = p.beansFactory.createTextField("Hdr.purc_dpt_wg_nm");
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextComboBox("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_trd_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.trd_cur_amt_dec_place");
		p.Hdr_trd_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.trd_cur_upri_dec_place");
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextComboBox("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
		p.Hdr_base_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.base_cur_amt_dec_place");
		p.Hdr_base_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.base_cur_upri_dec_place");
		p.Hdr_xrate_inpt_flg = p.beansFactory.createCheckBox("Hdr.xrate_inpt_flg");
		p.Hdr_ptax_cur_cd_Label = p.beansFactory.createLabel("Hdr.ptax_cur_cd_Label");
		p.Hdr_ptax_cur_cd = p.beansFactory.createTextField("Hdr.ptax_cur_cd");
		p.Hdr_ptax_cur_cd.setLabel(p.Hdr_ptax_cur_cd_Label);
		p.Hdr_ptax_cur_nm = p.beansFactory.createTextField("Hdr.ptax_cur_nm");
		p.Hdr_ptax_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.ptax_cur_amt_dec_place");
		p.Hdr_ptax_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.ptax_cur_upri_dec_place");
		p.Hdr_ptax_xrate_inpt_flg = p.beansFactory.createCheckBox("Hdr.ptax_xrate_inpt_flg");
		p.Hdr_purc_xrate_cd = p.beansFactory.createTextField("Hdr.purc_xrate_cd");
		p.Hdr_wtax_rnd_typ_Label = p.beansFactory.createLabel("Hdr.wtax_rnd_typ_Label");
		p.Hdr_wtax_rnd_typ = p.beansFactory.createTextField("Hdr.wtax_rnd_typ");
		p.Hdr_wtax_rnd_typ.setLabel(p.Hdr_wtax_rnd_typ_Label);
		p.Hdr_trd_rmrks_Label = p.beansFactory.createLabel("Hdr.trd_rmrks_Label");
		p.Hdr_trd_rmrks = p.beansFactory.createTextField("Hdr.trd_rmrks");
		p.Hdr_trd_rmrks.setLabel(p.Hdr_trd_rmrks_Label);
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_po_print_rmrks_Label = p.beansFactory.createLabel("Hdr.po_print_rmrks_Label");
		p.Hdr_po_print_rmrks = p.beansFactory.createTextField("Hdr.po_print_rmrks");
		p.Hdr_po_print_rmrks.setLabel(p.Hdr_po_print_rmrks_Label);
		p.Hdr_dlv_slip_rmrks_Label = p.beansFactory.createLabel("Hdr.dlv_slip_rmrks_Label");
		p.Hdr_dlv_slip_rmrks = p.beansFactory.createTextField("Hdr.dlv_slip_rmrks");
		p.Hdr_dlv_slip_rmrks.setLabel(p.Hdr_dlv_slip_rmrks_Label);
		p.Hdr_po_print_cd_Label = p.beansFactory.createLabel("Hdr.po_print_cd_Label");
		p.Hdr_po_print_cd = p.beansFactory.createTextComboBox("Hdr.po_print_cd");
		p.Hdr_po_print_cd.setLabel(p.Hdr_po_print_cd_Label);
		p.Hdr_po_print_nm = p.beansFactory.createTextField("Hdr.po_print_nm");
		p.Hdr_upd_po_print_schd_dt_Label = p.beansFactory.createLabel("Hdr.upd_po_print_schd_dt_Label");
		p.Hdr_upd_po_print_schd_dt = p.beansFactory.createDateField("Hdr.upd_po_print_schd_dt");
		p.Hdr_upd_po_print_schd_dt.setLabel(p.Hdr_upd_po_print_schd_dt_Label);
		p.Hdr_po_crct_rsn_cd_Label = p.beansFactory.createLabel("Hdr.po_crct_rsn_cd_Label");
		p.Hdr_po_crct_rsn_cd = p.beansFactory.createTextComboBox("Hdr.po_crct_rsn_cd");
		p.Hdr_po_crct_rsn_cd.setLabel(p.Hdr_po_crct_rsn_cd_Label);
		p.Hdr_po_crct_rsn_nm = p.beansFactory.createTextField("Hdr.po_crct_rsn_nm");
		p.Hdr_po_crct_rsn_rmrks = p.beansFactory.createTextField("Hdr.po_crct_rsn_rmrks");
		p.Hdr_tterm_cd1_Label = p.beansFactory.createLabel("Hdr.tterm_cd1_Label");
		p.Hdr_tterm_cd1 = p.beansFactory.createTextComboBox("Hdr.tterm_cd1");
		p.Hdr_tterm_cd1.setLabel(p.Hdr_tterm_cd1_Label);
		p.Hdr_tterm_nm1 = p.beansFactory.createTextField("Hdr.tterm_nm1");
		p.Hdr_tterm_rmrks1 = p.beansFactory.createTextField("Hdr.tterm_rmrks1");
		p.Hdr_tterm_cd2_Label = p.beansFactory.createLabel("Hdr.tterm_cd2_Label");
		p.Hdr_tterm_cd2 = p.beansFactory.createTextComboBox("Hdr.tterm_cd2");
		p.Hdr_tterm_cd2.setLabel(p.Hdr_tterm_cd2_Label);
		p.Hdr_tterm_nm2 = p.beansFactory.createTextField("Hdr.tterm_nm2");
		p.Hdr_tterm_rmrks2 = p.beansFactory.createTextField("Hdr.tterm_rmrks2");
		p.Hdr_tterm_cd3_Label = p.beansFactory.createLabel("Hdr.tterm_cd3_Label");
		p.Hdr_tterm_cd3 = p.beansFactory.createTextComboBox("Hdr.tterm_cd3");
		p.Hdr_tterm_cd3.setLabel(p.Hdr_tterm_cd3_Label);
		p.Hdr_tterm_nm3 = p.beansFactory.createTextField("Hdr.tterm_nm3");
		p.Hdr_tterm_rmrks3 = p.beansFactory.createTextField("Hdr.tterm_rmrks3");
		p.Hdr_asppl_cd_Label = p.beansFactory.createLabel("Hdr.asppl_cd_Label");
		p.Hdr_asppl_cd = p.beansFactory.createTextComboBox("Hdr.asppl_cd");
		p.Hdr_asppl_cd.setLabel(p.Hdr_asppl_cd_Label);
		p.Hdr_asppl_nm = p.beansFactory.createTextField("Hdr.asppl_nm");
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_edi_sub_char1_Label = p.beansFactory.createLabel("Hdr.edi_sub_char1_Label");
		p.Hdr_edi_sub_char1 = p.beansFactory.createTextField("Hdr.edi_sub_char1");
		p.Hdr_edi_sub_char1.setLabel(p.Hdr_edi_sub_char1_Label);
		p.Hdr_edi_sub_char2_Label = p.beansFactory.createLabel("Hdr.edi_sub_char2_Label");
		p.Hdr_edi_sub_char2 = p.beansFactory.createTextField("Hdr.edi_sub_char2");
		p.Hdr_edi_sub_char2.setLabel(p.Hdr_edi_sub_char2_Label);
		p.Hdr_edi_sub_char3_Label = p.beansFactory.createLabel("Hdr.edi_sub_char3_Label");
		p.Hdr_edi_sub_char3 = p.beansFactory.createTextField("Hdr.edi_sub_char3");
		p.Hdr_edi_sub_char3.setLabel(p.Hdr_edi_sub_char3_Label);
		p.Hdr_edi_sub_char4_Label = p.beansFactory.createLabel("Hdr.edi_sub_char4_Label");
		p.Hdr_edi_sub_char4 = p.beansFactory.createTextField("Hdr.edi_sub_char4");
		p.Hdr_edi_sub_char4.setLabel(p.Hdr_edi_sub_char4_Label);
		p.Hdr_edi_sub_char5_Label = p.beansFactory.createLabel("Hdr.edi_sub_char5_Label");
		p.Hdr_edi_sub_char5 = p.beansFactory.createTextField("Hdr.edi_sub_char5");
		p.Hdr_edi_sub_char5.setLabel(p.Hdr_edi_sub_char5_Label);
		p.Hdr_edi_sub_num1_Label = p.beansFactory.createLabel("Hdr.edi_sub_num1_Label");
		p.Hdr_edi_sub_num1 = p.beansFactory.createNumberField("Hdr.edi_sub_num1");
		p.Hdr_edi_sub_num1.setLabel(p.Hdr_edi_sub_num1_Label);
		p.Hdr_edi_sub_dt1_Label = p.beansFactory.createLabel("Hdr.edi_sub_dt1_Label");
		p.Hdr_edi_sub_dt1 = p.beansFactory.createDateField("Hdr.edi_sub_dt1");
		p.Hdr_edi_sub_dt1.setLabel(p.Hdr_edi_sub_dt1_Label);
		p.Hdr_purc_if_flg = p.beansFactory.createCheckBox("Hdr.purc_if_flg");
		p.Hdr_ext_sys_cd_Label = p.beansFactory.createLabel("Hdr.ext_sys_cd_Label");
		p.Hdr_ext_sys_cd = p.beansFactory.createTextField("Hdr.ext_sys_cd");
		p.Hdr_ext_sys_cd.setLabel(p.Hdr_ext_sys_cd_Label);
		p.Hdr_ext_sys_nm = p.beansFactory.createTextField("Hdr.ext_sys_nm");
		p.Hdr_ext_po_no_Label = p.beansFactory.createLabel("Hdr.ext_po_no_Label");
		p.Hdr_ext_po_no = p.beansFactory.createTextField("Hdr.ext_po_no");
		p.Hdr_ext_po_no.setLabel(p.Hdr_ext_po_no_Label);
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
		p.Hdr_po_upd_cntr = p.beansFactory.createNumberField("Hdr.po_upd_cntr");
		p.Hdr_next_opr_flg = p.beansFactory.createCheckBox("Hdr.next_opr_flg");
		p.Hdr_po_schd_no = p.beansFactory.createTextField("Hdr.po_schd_no");
		p.Hdr_prnt_po_flg = p.beansFactory.createCheckBox("Hdr.prnt_po_flg");
		p.Hdr_prnt_dlv_flg = p.beansFactory.createCheckBox("Hdr.prnt_dlv_flg");
		p.Hdr_prnt_purc_ddlv_dlv_flg = p.beansFactory.createCheckBox("Hdr.prnt_purc_ddlv_dlv_flg");
		p.Hdr_indiv_prnt_flg = p.beansFactory.createCheckBox("Hdr.indiv_prnt_flg");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_rqst_avl_rqst_dt_Label = p.beansFactory.createLabel("BulkSet.rqst_avl_rqst_dt_Label");
		p.BulkSet_rqst_avl_rqst_dt = p.beansFactory.createDateField("BulkSet.rqst_avl_rqst_dt");
		p.BulkSet_rqst_avl_rqst_dt.setLabel(p.BulkSet_rqst_avl_rqst_dt_Label);
		p.BulkSet_amt_Label = p.beansFactory.createLabel("BulkSet.amt_Label");
		p.BulkSet_amt = p.beansFactory.createNumberField("BulkSet.amt");
		p.BulkSet_amt.setLabel(p.BulkSet_amt_Label);
		p.BulkSet_inc_tax_amt_Label = p.beansFactory.createLabel("BulkSet.inc_tax_amt_Label");
		p.BulkSet_inc_tax_amt = p.beansFactory.createNumberField("BulkSet.inc_tax_amt");
		p.BulkSet_inc_tax_amt.setLabel(p.BulkSet_inc_tax_amt_Label);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_dtl_peg_no = p.beansFactory.createTableColumn("Dtl.dtl_peg_no", MCColumnType.NUMBER);
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_in_to_loc_cd = p.beansFactory.createTableColumn("Dtl.in_to_loc_cd", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_nm = p.beansFactory.createTableColumn("Dtl.in_to_loc_nm", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_wg_cd = p.beansFactory.createTableColumn("Dtl.in_to_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_wg_nm = p.beansFactory.createTableColumn("Dtl.in_to_loc_wg_nm", MCColumnType.TEXT);
		p.columnDtl_pri_prnt_flg = p.beansFactory.createTableColumn("Dtl.pri_prnt_flg", MCColumnType.CHECK);
		p.columnDtl_drct_dlv_typ = p.beansFactory.createTableColumn("Dtl.drct_dlv_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_drct_dlv_typ_nm = p.beansFactory.createTableColumn("Dtl.drct_dlv_typ_nm", MCColumnType.TEXT);
		p.columnDtl_outsrc_sppl_cd = p.beansFactory.createTableColumn("Dtl.outsrc_sppl_cd", MCColumnType.TEXT);
		p.columnDtl_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_loc_mng_typ = p.beansFactory.createTableColumn("Dtl.loc_mng_typ", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_cal_cd = p.beansFactory.createTableColumn("Dtl.in_to_loc_cal_cd", MCColumnType.TEXT);
		p.columnDtl_site_cd = p.beansFactory.createTableColumn("Dtl.site_cd", MCColumnType.TEXT);
		p.columnDtl_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_loc_grp_cd = p.beansFactory.createTableColumn("Dtl.loc_grp_cd", MCColumnType.TEXT);
		p.columnDtl_bef_in_to_loc_wg_cd = p.beansFactory.createTableColumn("Dtl.bef_in_to_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl_bef_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.bef_lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_bef_loc_grp_cd = p.beansFactory.createTableColumn("Dtl.bef_loc_grp_cd", MCColumnType.TEXT);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_arr_skip_flg = p.beansFactory.createTableColumn("Dtl.arr_skip_flg", MCColumnType.CHECK);
		p.columnDtl_purc_dlv_slip_flg = p.beansFactory.createTableColumn("Dtl.purc_dlv_slip_flg", MCColumnType.CHECK);
		p.columnDtl_maker_cd = p.beansFactory.createTableColumn("Dtl.maker_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_maker_nm = p.beansFactory.createTableColumn("Dtl.maker_nm", MCColumnType.TEXT);
		p.columnDtl_rqst_avl_rqst_dt = p.beansFactory.createTableColumn("Dtl.rqst_avl_rqst_dt", MCColumnType.DATE);
		p.columnDtl_purc_schd_dt = p.beansFactory.createTableColumn("Dtl.purc_schd_dt", MCColumnType.DATE);
		p.columnDtl_purc_basis_typ = p.beansFactory.createTableColumn("Dtl.purc_basis_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_basis_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_basis_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sync_flg = p.beansFactory.createTableColumn("Dtl.sync_flg", MCColumnType.CHECK);
		p.columnDtl_itm_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.itm_purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_itm_pay_crryovr_times = p.beansFactory.createTableColumn("Dtl.itm_pay_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bp_lot_no = p.beansFactory.createTableColumn("Dtl.bp_lot_no", MCColumnType.TEXT);
		p.columnDtl_sppl_itm_cd = p.beansFactory.createTableColumn("Dtl.sppl_itm_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_itm_nm = p.beansFactory.createTableColumn("Dtl.sppl_itm_nm", MCColumnType.TEXT);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl.ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_nm = p.beansFactory.createTableColumn("Dtl.ap_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_cal_cd = p.beansFactory.createTableColumn("Dtl.dlv_cal_cd", MCColumnType.TEXT);
		p.columnDtl_purc_id_typ = p.beansFactory.createTableColumn("Dtl.purc_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_id_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_po_conf_rcpt_flg = p.beansFactory.createTableColumn("Dtl.po_conf_rcpt_flg", MCColumnType.CHECK);
		p.columnDtl_po_conf_rcpt_dt = p.beansFactory.createTableColumn("Dtl.po_conf_rcpt_dt", MCColumnType.DATE);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_abort_flg = p.beansFactory.createTableColumn("Dtl.abort_flg", MCColumnType.CHECK);
		p.columnDtl_bef_abort_flg = p.beansFactory.createTableColumn("Dtl.bef_abort_flg", MCColumnType.CHECK);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_purc_sts_typ = p.beansFactory.createTableColumn("Dtl.purc_sts_typ", MCColumnType.TEXT);
		p.columnDtl_purc_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_inst_qty = p.beansFactory.createTableColumn("Dtl.dlv_inst_qty", MCColumnType.NUMBER);
		p.columnDtl_dlv_inst_prms_rcpt_qty = p.beansFactory.createTableColumn("Dtl.dlv_inst_prms_rcpt_qty", MCColumnType.NUMBER);
		p.columnDtl_rcpt_iv_qty = p.beansFactory.createTableColumn("Dtl.rcpt_iv_qty", MCColumnType.NUMBER);
		p.columnDtl_arr_qty = p.beansFactory.createTableColumn("Dtl.arr_qty", MCColumnType.NUMBER);
		p.columnDtl_purc_qty = p.beansFactory.createTableColumn("Dtl.purc_qty", MCColumnType.NUMBER);
		p.columnDtl_arr_schd_split_flg = p.beansFactory.createTableColumn("Dtl.arr_schd_split_flg", MCColumnType.CHECK);
		p.columnDtl_arr_cmpl_flg = p.beansFactory.createTableColumn("Dtl.arr_cmpl_flg", MCColumnType.CHECK);
		p.columnDtl_purc_cmpl_flg = p.beansFactory.createTableColumn("Dtl.purc_cmpl_flg", MCColumnType.CHECK);
		p.columnDtl_pay_crryovr_times = p.beansFactory.createTableColumn("Dtl.pay_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_purc_upri_req_typ = p.beansFactory.createTableColumn("Dtl.purc_upri_req_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_upri_req_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_upri_req_typ_nm", MCColumnType.TEXT);
		p.columnDtl_repurc_obli_flg = p.beansFactory.createTableColumn("Dtl.repurc_obli_flg", MCColumnType.CHECK);
		p.columnDtl_old_trd_cur_upri = p.beansFactory.createTableColumn("Dtl.old_trd_cur_upri", MCColumnType.NUMBER);
		p.columnDtl_old_trd_cur_proc_upri = p.beansFactory.createTableColumn("Dtl.old_trd_cur_proc_upri", MCColumnType.NUMBER);
		p.columnDtl_old_trd_cur_onr_prov_upri = p.beansFactory.createTableColumn("Dtl.old_trd_cur_onr_prov_upri", MCColumnType.NUMBER);
		p.columnDtl_old_interim_flg = p.beansFactory.createTableColumn("Dtl.old_interim_flg", MCColumnType.CHECK);
		p.columnDtl_old_trd_cur_dscnt_amt = p.beansFactory.createTableColumn("Dtl.old_trd_cur_dscnt_amt", MCColumnType.NUMBER);
		p.columnDtl_old_dscnt_rsn_cd = p.beansFactory.createTableColumn("Dtl.old_dscnt_rsn_cd", MCColumnType.TEXT);
		p.columnDtl_old_dscnt_rsn_nm = p.beansFactory.createTableColumn("Dtl.old_dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_wtax_rate = p.beansFactory.createTableColumn("Dtl.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_mfg_loc_cd = p.beansFactory.createTableColumn("Dtl.mfg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_mfg_loc_nm = p.beansFactory.createTableColumn("Dtl.mfg_loc_nm", MCColumnType.TEXT);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT_COMBO);
		p.columnDtl_outsrc_flg = p.beansFactory.createTableColumn("Dtl.outsrc_flg", MCColumnType.CHECK);
		p.columnDtl_mfg_inst_flg = p.beansFactory.createTableColumn("Dtl.mfg_inst_flg", MCColumnType.CHECK);
		p.columnDtl_outsrc_itm_ord_no = p.beansFactory.createTableColumn("Dtl.outsrc_itm_ord_no", MCColumnType.TEXT);
		p.columnDtl_purc_rsn_cd = p.beansFactory.createTableColumn("Dtl.purc_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_rsn_nm = p.beansFactory.createTableColumn("Dtl.purc_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl.xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl_not_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl.not_xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl_bd_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_lot_no_typ = p.beansFactory.createTableColumn("Dtl.bd_lot_no_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sublot_no_typ = p.beansFactory.createTableColumn("Dtl.bd_sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_rqst_can_flg = p.beansFactory.createTableColumn("Dtl.rqst_can_flg", MCColumnType.CHECK);
		p.columnDtl_po_cnt_rmrks = p.beansFactory.createTableColumn("Dtl.po_cnt_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_po_print_d_rmrks = p.beansFactory.createTableColumn("Dtl.po_print_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_d_rmrks = p.beansFactory.createTableColumn("Dtl.dlv_slip_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_arr_cnt_rmrks = p.beansFactory.createTableColumn("Dtl.arr_cnt_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_edi_sub_d_char1 = p.beansFactory.createTableColumn("Dtl.edi_sub_d_char1", MCColumnType.TEXT);
		p.columnDtl_edi_sub_d_char2 = p.beansFactory.createTableColumn("Dtl.edi_sub_d_char2", MCColumnType.TEXT);
		p.columnDtl_edi_sub_d_char3 = p.beansFactory.createTableColumn("Dtl.edi_sub_d_char3", MCColumnType.TEXT);
		p.columnDtl_edi_sub_d_char4 = p.beansFactory.createTableColumn("Dtl.edi_sub_d_char4", MCColumnType.TEXT);
		p.columnDtl_edi_sub_d_char5 = p.beansFactory.createTableColumn("Dtl.edi_sub_d_char5", MCColumnType.TEXT);
		p.columnDtl_edi_sub_d_num1 = p.beansFactory.createTableColumn("Dtl.edi_sub_d_num1", MCColumnType.NUMBER);
		p.columnDtl_edi_sub_d_dt1 = p.beansFactory.createTableColumn("Dtl.edi_sub_d_dt1", MCColumnType.DATE);
		p.columnDtl_ext_po_d_no = p.beansFactory.createTableColumn("Dtl.ext_po_d_no", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_seq = p.beansFactory.createTableColumn("Dtl.dlv_slip_seq", MCColumnType.NUMBER);
		p.columnDtl_dlv_slip_invalid_flg = p.beansFactory.createTableColumn("Dtl.dlv_slip_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_purc_ddlv_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.purc_ddlv_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_mng_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_mng_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_mng_seq = p.beansFactory.createTableColumn("Dtl.dlv_slip_mng_seq", MCColumnType.NUMBER);
		p.columnDtl_po_schd_src_typ = p.beansFactory.createTableColumn("Dtl.po_schd_src_typ", MCColumnType.TEXT);
		p.columnDtl_po_schd_src_typ_nm = p.beansFactory.createTableColumn("Dtl.po_schd_src_typ_nm", MCColumnType.TEXT);
		p.columnDtl_po_schd_src_no = p.beansFactory.createTableColumn("Dtl.po_schd_src_no", MCColumnType.TEXT);
		p.columnDtl_rqst_fr_usr_cd = p.beansFactory.createTableColumn("Dtl.rqst_fr_usr_cd", MCColumnType.TEXT);
		p.columnDtl_rqst_fr_usr_nm = p.beansFactory.createTableColumn("Dtl.rqst_fr_usr_nm", MCColumnType.TEXT);
		p.columnDtl_rqst_fr_dpt_cd = p.beansFactory.createTableColumn("Dtl.rqst_fr_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_rqst_fr_dpt_nm = p.beansFactory.createTableColumn("Dtl.rqst_fr_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_bndl_flg = p.beansFactory.createTableColumn("Dtl.bndl_flg", MCColumnType.CHECK);
		p.columnDtl_rqst_slo_flg = p.beansFactory.createTableColumn("Dtl.rqst_slo_flg", MCColumnType.CHECK);
		p.columnDtl_po_schd_no = p.beansFactory.createTableColumn("Dtl.po_schd_no", MCColumnType.TEXT);
		p.columnDtl_po_d_no = p.beansFactory.createTableColumn("Dtl.po_d_no", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_arr_flg = p.beansFactory.createTableColumn("Dtl.arr_flg", MCColumnType.CHECK);
		p.columnDtl_purc_flg = p.beansFactory.createTableColumn("Dtl.purc_flg", MCColumnType.CHECK);
		p.columnDtl_rcpt_iv_flg = p.beansFactory.createTableColumn("Dtl.rcpt_iv_flg", MCColumnType.CHECK);
		p.columnDtl_mfg_loc_wg_cd = p.beansFactory.createTableColumn("Dtl.mfg_loc_wg_cd", MCColumnType.TEXT);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_dtl_peg_no = p.beansFactory.createTableColumn("Dtl2.dtl_peg_no", MCColumnType.NUMBER);
		p.columnDtl2_po_schd_no = p.beansFactory.createTableColumn("Dtl2.po_schd_no", MCColumnType.TEXT);
		p.columnDtl2_po_d_no = p.beansFactory.createTableColumn("Dtl2.po_d_no", MCColumnType.TEXT);
		p.columnDtl2_can_flg = p.beansFactory.createTableColumn("Dtl2.can_flg", MCColumnType.CHECK);
		p.columnDtl2_po_schd_upd_cntr = p.beansFactory.createTableColumn("Dtl2.po_schd_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl2_arr_pr_upd_cntr = p.beansFactory.createTableColumn("Dtl2.arr_pr_upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0120 = p.beansFactory.createButton("Btn.open_MSBDP0120", "open");
		p.Btn_open_MSBDP0250 = p.beansFactory.createButton("Btn.open_MSBDP0250", "open");
		p.Btn_bndl_schd = p.beansFactory.createButton("Btn.bndl_schd");
		p.Btn_srch_upri = p.beansFactory.createButton("Btn.srch_upri");
		p.Btn_srch_dlv = p.beansFactory.createButton("Btn.srch_dlv");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [Btn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn1(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.Btn1Panel = p.beansFactory.createPanel("Btn1");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.Btn2Panel = p.beansFactory.createPanel("Btn2");
		// ブロックの項目の初期化
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PoReg p) {
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
	protected static void jbInitCnd(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.Cnd2Panel);
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0080.CndR.ope_META);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.CndPanel.setLastBeans(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_rev_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0080.CndR.po_no_META);
		p.CndPanel.add(p.Cnd_rev_no);
		p.Cnd_rev_no.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_rev_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0080.CndR.rev_no_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch_po);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0080.CndR.latest_flg_META);
		p.Cnd_srch_po.setIcon("SEARCH");
		p.Cnd_srch_po.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_po);
		p.Cnd_srch_po.setNextBeans(p.Cnd_srch_po_schd);
		p.Cnd_srch_po_schd.setIcon("SEARCH");
		p.Cnd_srch_po_schd.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_po_schd);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.add(p.Cnd2Panel);
		p.Cnd2Panel.setNextBeans(p.TOPPanel);
		p.Cnd2Panel.add(p.Cnd2ScrollPane);
		p.Cnd2Panel.setLastBeans(p.Cnd2Table);
		p.Cnd2ScrollPane.setViewportView(p.Cnd2Table);
		p.Cnd2Table.setList(p.getCnd2L());
		p.Cnd2Panel.setLayoutPosition("NS");
		// ブロックの項目の初期化
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTOP(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.add(p.TOPPanel);
		p.TOPPanel.setNextBeans(p.BulkSetPanel);
		p.TOPPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TOPPanel.add(p.HdrTabPanel, null);
		p.TOPPanel.setLastBeans(p.HdrTabPanel);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.TabPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.TabPanel);
		p.TabPanel.setNextBeans(p.Tab2Panel);
		p.HdrTabTab.add(p.Tab2Panel, "HdrTab.tab2");
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.TabPanel.setNextBeans(p.Tab2Panel);
		p.TabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.TabPanel.add(p.HdrPanel, null);
		p.TabPanel.setLastBeans(p.HdrPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Hdr2Panel, null);
		p.Tab2Panel.setLastBeans(p.Hdr2Panel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Hdr_trd_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cd.setLinkBeans(p.Hdr_trd_nm,p.Hdr_trd_ptn_typ);
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_po_no);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_po_no_Label);
		p.HdrPanel.add(p.Hdr_po_no);
		p.Hdr_po_no.setNextBeans(p.Hdr_po_rev);
		p.Hdr_po_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_no_META);
		p.HdrPanel.add(p.Hdr_po_rev);
		p.Hdr_po_rev.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_po_rev.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_rev_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_can_flg);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_po_print_dt);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.can_flg_META);
		p.HdrPanel.add(p.Hdr_po_print_dt_Label);
		p.HdrPanel.add(p.Hdr_po_print_dt);
		p.Hdr_po_print_dt.setNextBeans(p.Hdr_po_print_flg);
		p.Hdr_po_print_dt.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_print_dt_META);
		p.Hdr_po_print_dt.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.HdrPanel.add(p.Hdr_po_print_flg);
		p.Hdr_po_print_flg.setNextBeans(p.Hdr_dlv_print_flg);
		p.Hdr_po_print_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_print_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_print_flg);
		p.Hdr_dlv_print_flg.setNextBeans(p.Hdr_purc_ddlv_dlv_print_flg);
		p.Hdr_dlv_print_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.dlv_print_flg_META);
		p.HdrPanel.add(p.Hdr_purc_ddlv_dlv_print_flg);
		p.Hdr_purc_ddlv_dlv_print_flg.setNextBeans(p.Hdr_aprv_rvrs_flg);
		p.Hdr_purc_ddlv_dlv_print_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.purc_ddlv_dlv_print_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_rvrs_flg);
		p.Hdr_aprv_rvrs_flg.setNextBeans(p.Hdr_aprv_flg);
		p.Hdr_aprv_rvrs_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.aprv_rvrs_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_flg);
		p.Hdr_aprv_flg.setNextBeans(p.Hdr_aprv_no);
		p.Hdr_aprv_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.aprv_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_no_Label);
		p.HdrPanel.add(p.Hdr_aprv_no);
		p.Hdr_aprv_no.setNextBeans(p.Hdr_aprv_sts_typ);
		p.Hdr_aprv_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.aprv_no_META);
		p.HdrPanel.add(p.Hdr_aprv_sts_typ_Label);
		p.HdrPanel.add(p.Hdr_aprv_sts_typ);
		p.Hdr_aprv_sts_typ.setNextBeans(p.Hdr_aprv_sts_typ_nm);
		p.Hdr_aprv_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.aprv_sts_typ_META);
		p.HdrPanel.add(p.Hdr_aprv_sts_typ_nm);
		p.Hdr_aprv_sts_typ_nm.setNextBeans(p.Hdr_aprv_upd_flg);
		p.Hdr_aprv_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.aprv_sts_typ_nm_META);
		p.HdrPanel.add(p.Hdr_aprv_upd_flg);
		p.Hdr_aprv_upd_flg.setNextBeans(p.Hdr_aprv_can_flg);
		p.Hdr_aprv_upd_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.aprv_upd_flg_META);
		p.HdrPanel.add(p.Hdr_aprv_can_flg);
		p.Hdr_aprv_can_flg.setNextBeans(p.Hdr_po_dt);
		p.Hdr_aprv_can_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.aprv_can_flg_META);
		p.HdrPanel.add(p.Hdr_po_dt_Label);
		p.HdrPanel.add(p.Hdr_po_dt);
		p.Hdr_po_dt.setNextBeans(p.Hdr_sppl_cd);
		p.Hdr_po_dt.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_dt_META);
		p.Hdr_po_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_sppl_cd_Label);
		p.HdrPanel.add(p.Hdr_sppl_cd);
		p.Hdr_sppl_cd.setNextBeans(p.Hdr_sppl_nm);
		p.Hdr_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sppl_cd_META);
		p.Hdr_sppl_cd.addLinkBeans(p.Hdr_sppl_nm,p.Hdr_asppl_cd,p.Hdr_trd_cur_cd,p.Hdr_def_purc_usr_cd,p.Hdr_def_purc_dpt_cd,p.Hdr_ap_dpt_cd,p.Hdr_mst_ap_dpt_cd,p.Hdr_sppl_iv_flg,p.Hdr_prnt_lcl_cd,p.Hdr_sppl_purc_upri_cng_flg,p.Hdr_purc_upri_req_typ,p.Hdr_sppl_cal_cd,p.Hdr_purc_amt_rnd_typ,p.Hdr_purc_tax_rnd_typ,p.Hdr_subcon_flg,p.Hdr_sppl_ship_form_cd,p.Hdr_sppl_tel,p.Hdr_sppl_fax,p.Hdr_sppl_zip_cd,p.Hdr_sppl_addr1,p.Hdr_sppl_addr2,p.Hdr_sppl_addr3,p.Hdr_sppl_addr4,p.Hdr_sppl_cntct_dpt,p.Hdr_sppl_cntct_psn,p.Hdr_sppl_cntry_cd,p.Hdr_sppl_cntry_nm,p.Hdr_sppl_pay_crryovr_times,p.Hdr_po_print_cd,p.Hdr_edi_tgt_flg,p.Hdr_tterm_cd1,p.Hdr_tterm_cd2,p.Hdr_tterm_cd3,p.Hdr_repurc_obli_flg,p.Hdr_outsrc_upri_typ);
		p.Hdr_sppl_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_sppl_nm);
		p.Hdr_sppl_nm.setNextBeans(p.Hdr_sppl_p_PPanel);
		p.Hdr_sppl_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sppl_nm_META);
		p.HdrPanel.add(p.Hdr_sppl_p_PPanel);
		p.Hdr_sppl_p_PPanel.setNextBeans(p.Hdr_purc_amt_rnd_typ);
		p.HdrPanel.add(p.Hdr_purc_amt_rnd_typ);
		p.Hdr_purc_amt_rnd_typ.setNextBeans(p.Hdr_purc_tax_rnd_typ);
		p.Hdr_purc_amt_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.purc_amt_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_purc_tax_rnd_typ);
		p.Hdr_purc_tax_rnd_typ.setNextBeans(p.Hdr_sppl_cal_cd);
		p.Hdr_purc_tax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.purc_tax_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_sppl_cal_cd);
		p.Hdr_sppl_cal_cd.setNextBeans(p.Hdr_sppl_purc_upri_cng_flg);
		p.Hdr_sppl_cal_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sppl_cal_cd_META);
		p.HdrPanel.add(p.Hdr_sppl_purc_upri_cng_flg);
		p.Hdr_sppl_purc_upri_cng_flg.setNextBeans(p.Hdr_prnt_lcl_cd);
		p.Hdr_sppl_purc_upri_cng_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sppl_purc_upri_cng_flg_META);
		p.HdrPanel.add(p.Hdr_prnt_lcl_cd);
		p.Hdr_prnt_lcl_cd.setNextBeans(p.Hdr_sppl_ship_form_cd);
		p.Hdr_prnt_lcl_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.prnt_lcl_cd_META);
		p.HdrPanel.add(p.Hdr_sppl_ship_form_cd);
		p.Hdr_sppl_ship_form_cd.setNextBeans(p.Hdr_po_dlv_slip_flg);
		p.Hdr_sppl_ship_form_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sppl_ship_form_cd_META);
		p.HdrPanel.add(p.Hdr_po_dlv_slip_flg);
		p.Hdr_po_dlv_slip_flg.setNextBeans(p.Hdr_ap_dpt_cd);
		p.Hdr_po_dlv_slip_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_dlv_slip_flg_META);
		p.HdrPanel.add(p.Hdr_ap_dpt_cd);
		p.Hdr_ap_dpt_cd.setNextBeans(p.Hdr_mst_ap_dpt_cd);
		p.Hdr_ap_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ap_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_mst_ap_dpt_cd);
		p.Hdr_mst_ap_dpt_cd.setNextBeans(p.Hdr_purc_upri_req_typ);
		p.Hdr_mst_ap_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.mst_ap_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_purc_upri_req_typ);
		p.Hdr_purc_upri_req_typ.setNextBeans(p.Hdr_sppl_pay_crryovr_times);
		p.Hdr_purc_upri_req_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.purc_upri_req_typ_META);
		p.HdrPanel.add(p.Hdr_sppl_pay_crryovr_times);
		p.Hdr_sppl_pay_crryovr_times.setNextBeans(p.Hdr_subcon_flg);
		p.Hdr_sppl_pay_crryovr_times.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sppl_pay_crryovr_times_META);
		p.HdrPanel.add(p.Hdr_subcon_flg);
		p.Hdr_subcon_flg.setNextBeans(p.Hdr_repurc_obli_flg);
		p.Hdr_subcon_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.subcon_flg_META);
		p.HdrPanel.add(p.Hdr_repurc_obli_flg);
		p.Hdr_repurc_obli_flg.setNextBeans(p.Hdr_outsrc_upri_typ);
		p.Hdr_repurc_obli_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.repurc_obli_flg_META);
		p.HdrPanel.add(p.Hdr_outsrc_upri_typ_Label);
		p.HdrPanel.add(p.Hdr_outsrc_upri_typ);
		p.Hdr_outsrc_upri_typ.setNextBeans(p.Hdr_sppl_iv_flg);
		p.Hdr_outsrc_upri_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.outsrc_upri_typ_META);
		p.HdrPanel.add(p.Hdr_sppl_iv_flg);
		p.Hdr_sppl_iv_flg.setNextBeans(p.Hdr_edi_flg);
		p.Hdr_sppl_iv_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sppl_iv_flg_META);
		p.HdrPanel.add(p.Hdr_edi_flg);
		p.Hdr_edi_flg.setNextBeans(p.Hdr_last_edi_flg);
		p.Hdr_edi_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.edi_flg_META);
		p.HdrPanel.add(p.Hdr_last_edi_flg);
		p.Hdr_last_edi_flg.setNextBeans(p.Hdr_edi_tgt_flg);
		p.Hdr_last_edi_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.last_edi_flg_META);
		p.HdrPanel.add(p.Hdr_edi_tgt_flg);
		p.Hdr_edi_tgt_flg.setNextBeans(p.Hdr_purc_usr_dpt_p_PPanel);
		p.Hdr_edi_tgt_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.edi_tgt_flg_META);
		p.HdrPanel.add(p.Hdr_purc_usr_dpt_p_PPanel);
		p.Hdr_purc_usr_dpt_p_PPanel.setNextBeans(p.Hdr_def_purc_usr_cd);
		p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_purc_dpt_nm,p.Hdr_purc_dpt_wg_cd,p.Hdr_purc_dpt_wg_nm,p.Hdr_ap_dpt_flg);
		p.HdrPanel.add(p.Hdr_def_purc_usr_cd);
		p.Hdr_def_purc_usr_cd.setNextBeans(p.Hdr_def_purc_dpt_cd);
		p.Hdr_def_purc_usr_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.def_purc_usr_cd_META);
		p.HdrPanel.add(p.Hdr_def_purc_dpt_cd);
		p.Hdr_def_purc_dpt_cd.setNextBeans(p.Hdr_ap_dpt_flg);
		p.Hdr_def_purc_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.def_purc_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_ap_dpt_flg);
		p.Hdr_ap_dpt_flg.setNextBeans(p.Hdr_purc_dpt_wg_cd);
		p.Hdr_ap_dpt_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ap_dpt_flg_META);
		p.HdrPanel.add(p.Hdr_purc_dpt_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_purc_dpt_wg_cd);
		p.Hdr_purc_dpt_wg_cd.setNextBeans(p.Hdr_purc_dpt_wg_nm);
		p.Hdr_purc_dpt_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.purc_dpt_wg_cd_META);
		p.HdrPanel.add(p.Hdr_purc_dpt_wg_nm);
		p.Hdr_purc_dpt_wg_nm.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_purc_dpt_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.purc_dpt_wg_nm_META);
		p.Hdr_trd_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cur_cd.setLinkBeans(p.Hdr_trd_cur_nm,p.Hdr_trd_cur_amt_dec_place,p.Hdr_trd_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setNextBeans(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.trd_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_upri_dec_place.setNextBeans(p.Hdr_base_cur_cd);
		p.Hdr_trd_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.trd_cur_upri_dec_place_META);
		p.Hdr_base_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_base_cur_cd.setLinkBeans(p.Hdr_base_cur_nm,p.Hdr_base_cur_amt_dec_place,p.Hdr_base_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_amt_dec_place.setNextBeans(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.base_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_upri_dec_place.setNextBeans(p.Hdr_xrate_inpt_flg);
		p.Hdr_base_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.base_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_xrate_inpt_flg);
		p.Hdr_xrate_inpt_flg.setNextBeans(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_inpt_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.xrate_inpt_flg_META);
		p.HdrPanel.add(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_p_PPanel.setNextBeans(p.Hdr_ptax_cur_cd);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd);
		p.Hdr_ptax_cur_cd.setNextBeans(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ptax_cur_cd_META);
		p.Hdr_ptax_cur_cd.addLinkBeans(p.Hdr_ptax_cur_nm,p.Hdr_ptax_cur_amt_dec_place,p.Hdr_ptax_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_nm.setNextBeans(p.Hdr_ptax_cur_amt_dec_place);
		p.Hdr_ptax_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ptax_cur_nm_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_amt_dec_place);
		p.Hdr_ptax_cur_amt_dec_place.setNextBeans(p.Hdr_ptax_cur_upri_dec_place);
		p.Hdr_ptax_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ptax_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_upri_dec_place);
		p.Hdr_ptax_cur_upri_dec_place.setNextBeans(p.Hdr_ptax_xrate_inpt_flg);
		p.Hdr_ptax_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ptax_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_ptax_xrate_inpt_flg);
		p.Hdr_ptax_xrate_inpt_flg.setNextBeans(p.Hdr_prax_xrate_p_PPanel);
		p.Hdr_ptax_xrate_inpt_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ptax_xrate_inpt_flg_META);
		p.HdrPanel.add(p.Hdr_prax_xrate_p_PPanel);
		p.Hdr_prax_xrate_p_PPanel.setNextBeans(p.Hdr_purc_xrate_cd);
		p.HdrPanel.add(p.Hdr_purc_xrate_cd);
		p.Hdr_purc_xrate_cd.setNextBeans(p.Hdr_wtax_rnd_typ);
		p.Hdr_purc_xrate_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.purc_xrate_cd_META);
		p.HdrPanel.add(p.Hdr_wtax_rnd_typ_Label);
		p.HdrPanel.add(p.Hdr_wtax_rnd_typ);
		p.Hdr_wtax_rnd_typ.setNextBeans(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_wtax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.wtax_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_wrk_no_p_PPanel);
		p.Hdr_wrk_no_p_PPanel.setNextBeans(p.Hdr_trd_rmrks);
		p.HdrPanel.add(p.Hdr_trd_rmrks_Label);
		p.HdrPanel.add(p.Hdr_trd_rmrks);
		p.Hdr_trd_rmrks.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_trd_rmrks.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.trd_rmrks_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_po_print_rmrks);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_po_print_rmrks_Label);
		p.HdrPanel.add(p.Hdr_po_print_rmrks);
		p.Hdr_po_print_rmrks.setNextBeans(p.Hdr_dlv_slip_rmrks);
		p.Hdr_po_print_rmrks.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_print_rmrks_META);
		p.HdrPanel.add(p.Hdr_dlv_slip_rmrks_Label);
		p.HdrPanel.add(p.Hdr_dlv_slip_rmrks);
		p.Hdr_dlv_slip_rmrks.setNextBeans(p.Hdr_po_print_cd);
		p.Hdr_dlv_slip_rmrks.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.dlv_slip_rmrks_META);
		p.Hdr_po_print_cd.setListType(MCListType.STRICT);
		p.Hdr_po_print_cd.setLinkBeans(p.Hdr_po_print_nm);
		p.HdrPanel.add(p.Hdr_po_print_cd_Label);
		p.HdrPanel.add(p.Hdr_po_print_cd);
		p.Hdr_po_print_cd.setNextBeans(p.Hdr_po_print_nm);
		p.Hdr_po_print_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_print_cd_META);
		p.HdrPanel.add(p.Hdr_po_print_nm);
		p.Hdr_po_print_nm.setNextBeans(p.Hdr_upd_po_print_schd_dt);
		p.Hdr_po_print_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_print_nm_META);
		p.HdrPanel.add(p.Hdr_upd_po_print_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_upd_po_print_schd_dt);
		p.Hdr_upd_po_print_schd_dt.setNextBeans(p.Hdr_po_crct_rsn_cd);
		p.Hdr_upd_po_print_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.upd_po_print_schd_dt_META);
		p.Hdr_upd_po_print_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr_po_crct_rsn_cd.setListType(MCListType.STRICT);
		p.Hdr_po_crct_rsn_cd.setLinkBeans(p.Hdr_po_crct_rsn_nm,p.Hdr_po_crct_rsn_rmrks);
		p.HdrPanel.add(p.Hdr_po_crct_rsn_cd_Label);
		p.HdrPanel.add(p.Hdr_po_crct_rsn_cd);
		p.Hdr_po_crct_rsn_cd.setNextBeans(p.Hdr_po_crct_rsn_nm);
		p.Hdr_po_crct_rsn_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_crct_rsn_cd_META);
		p.HdrPanel.add(p.Hdr_po_crct_rsn_nm);
		p.Hdr_po_crct_rsn_nm.setNextBeans(p.Hdr_po_crct_rsn_rmrks);
		p.Hdr_po_crct_rsn_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_crct_rsn_nm_META);
		p.HdrPanel.add(p.Hdr_po_crct_rsn_rmrks);
		p.Hdr_po_crct_rsn_rmrks.setNextBeans(p.Hdr_tterm_cd1);
		p.Hdr_po_crct_rsn_rmrks.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_crct_rsn_rmrks_META);
		p.Hdr_tterm_cd1.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd1.setLinkBeans(p.Hdr_tterm_nm1);
		p.HdrPanel.add(p.Hdr_tterm_cd1_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd1);
		p.Hdr_tterm_cd1.setNextBeans(p.Hdr_tterm_nm1);
		p.Hdr_tterm_cd1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.tterm_cd1_META);
		p.HdrPanel.add(p.Hdr_tterm_nm1);
		p.Hdr_tterm_nm1.setNextBeans(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_nm1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.tterm_nm1_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_rmrks1.setNextBeans(p.Hdr_tterm_cd2);
		p.Hdr_tterm_rmrks1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.tterm_rmrks1_META);
		p.Hdr_tterm_cd2.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd2.setLinkBeans(p.Hdr_tterm_nm2);
		p.HdrPanel.add(p.Hdr_tterm_cd2_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd2);
		p.Hdr_tterm_cd2.setNextBeans(p.Hdr_tterm_nm2);
		p.Hdr_tterm_cd2.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.tterm_cd2_META);
		p.HdrPanel.add(p.Hdr_tterm_nm2);
		p.Hdr_tterm_nm2.setNextBeans(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_nm2.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.tterm_nm2_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_rmrks2.setNextBeans(p.Hdr_tterm_cd3);
		p.Hdr_tterm_rmrks2.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.tterm_rmrks2_META);
		p.Hdr_tterm_cd3.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd3.setLinkBeans(p.Hdr_tterm_nm3);
		p.HdrPanel.add(p.Hdr_tterm_cd3_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd3);
		p.Hdr_tterm_cd3.setNextBeans(p.Hdr_tterm_nm3);
		p.Hdr_tterm_cd3.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.tterm_cd3_META);
		p.HdrPanel.add(p.Hdr_tterm_nm3);
		p.Hdr_tterm_nm3.setNextBeans(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_nm3.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.tterm_nm3_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_rmrks3.setNextBeans(p.Hdr_asppl_cd);
		p.Hdr_tterm_rmrks3.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.tterm_rmrks3_META);
		p.Hdr_asppl_cd.setListType(MCListType.STRICT);
		p.Hdr_asppl_cd.setLinkBeans(p.Hdr_asppl_nm);
		p.HdrPanel.add(p.Hdr_asppl_cd_Label);
		p.HdrPanel.add(p.Hdr_asppl_cd);
		p.Hdr_asppl_cd.setNextBeans(p.Hdr_asppl_nm);
		p.Hdr_asppl_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.asppl_cd_META);
		p.HdrPanel.add(p.Hdr_asppl_nm);
		p.Hdr_asppl_nm.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_asppl_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.asppl_nm_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_edi_sub_char1);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.sub_char3_META);
		p.HdrPanel.add(p.Hdr_edi_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_edi_sub_char1);
		p.Hdr_edi_sub_char1.setNextBeans(p.Hdr_edi_sub_char2);
		p.Hdr_edi_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.edi_sub_char1_META);
		p.HdrPanel.add(p.Hdr_edi_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_edi_sub_char2);
		p.Hdr_edi_sub_char2.setNextBeans(p.Hdr_edi_sub_char3);
		p.Hdr_edi_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.edi_sub_char2_META);
		p.HdrPanel.add(p.Hdr_edi_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_edi_sub_char3);
		p.Hdr_edi_sub_char3.setNextBeans(p.Hdr_edi_sub_char4);
		p.Hdr_edi_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.edi_sub_char3_META);
		p.HdrPanel.add(p.Hdr_edi_sub_char4_Label);
		p.HdrPanel.add(p.Hdr_edi_sub_char4);
		p.Hdr_edi_sub_char4.setNextBeans(p.Hdr_edi_sub_char5);
		p.Hdr_edi_sub_char4.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.edi_sub_char4_META);
		p.HdrPanel.add(p.Hdr_edi_sub_char5_Label);
		p.HdrPanel.add(p.Hdr_edi_sub_char5);
		p.Hdr_edi_sub_char5.setNextBeans(p.Hdr_edi_sub_num1);
		p.Hdr_edi_sub_char5.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.edi_sub_char5_META);
		p.HdrPanel.add(p.Hdr_edi_sub_num1_Label);
		p.HdrPanel.add(p.Hdr_edi_sub_num1);
		p.Hdr_edi_sub_num1.setNextBeans(p.Hdr_edi_sub_dt1);
		p.Hdr_edi_sub_num1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.edi_sub_num1_META);
		p.HdrPanel.add(p.Hdr_edi_sub_dt1_Label);
		p.HdrPanel.add(p.Hdr_edi_sub_dt1);
		p.Hdr_edi_sub_dt1.setNextBeans(p.Hdr_purc_if_flg);
		p.Hdr_edi_sub_dt1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.edi_sub_dt1_META);
		p.Hdr_edi_sub_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_purc_if_flg);
		p.Hdr_purc_if_flg.setNextBeans(p.Hdr_ext_sys_cd);
		p.Hdr_purc_if_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.purc_if_flg_META);
		p.HdrPanel.add(p.Hdr_ext_sys_cd_Label);
		p.HdrPanel.add(p.Hdr_ext_sys_cd);
		p.Hdr_ext_sys_cd.setNextBeans(p.Hdr_ext_sys_nm);
		p.Hdr_ext_sys_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ext_sys_cd_META);
		p.HdrPanel.add(p.Hdr_ext_sys_nm);
		p.Hdr_ext_sys_nm.setNextBeans(p.Hdr_ext_po_no);
		p.Hdr_ext_sys_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ext_sys_nm_META);
		p.HdrPanel.add(p.Hdr_ext_po_no_Label);
		p.HdrPanel.add(p.Hdr_ext_po_no);
		p.Hdr_ext_po_no.setNextBeans(p.Hdr_po_upd_cntr);
		p.Hdr_ext_po_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ext_po_no_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.upd_srv_req_no_META);
		p.HdrPanel.add(p.Hdr_po_upd_cntr);
		p.Hdr_po_upd_cntr.setNextBeans(p.Hdr_next_opr_flg);
		p.Hdr_po_upd_cntr.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_upd_cntr_META);
		p.HdrPanel.add(p.Hdr_next_opr_flg);
		p.Hdr_next_opr_flg.setNextBeans(p.Hdr_po_schd_no);
		p.Hdr_next_opr_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.next_opr_flg_META);
		p.HdrPanel.add(p.Hdr_po_schd_no);
		p.Hdr_po_schd_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.po_schd_no_META);
		p.Btn2Panel.add(p.Hdr_prnt_po_flg);
		p.Btn2Panel.setLastBeans(p.Hdr_prnt_po_flg);
		p.Hdr_prnt_po_flg.setNextBeans(p.Hdr_prnt_dlv_flg);
		p.Hdr_prnt_po_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.prnt_po_flg_META);
		p.Btn2Panel.add(p.Hdr_prnt_dlv_flg);
		p.Hdr_prnt_dlv_flg.setNextBeans(p.Hdr_prnt_purc_ddlv_dlv_flg);
		p.Hdr_prnt_dlv_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.prnt_dlv_flg_META);
		p.Btn2Panel.add(p.Hdr_prnt_purc_ddlv_dlv_flg);
		p.Hdr_prnt_purc_ddlv_dlv_flg.setNextBeans(p.Hdr_indiv_prnt_flg);
		p.Hdr_prnt_purc_ddlv_dlv_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.prnt_purc_ddlv_dlv_flg_META);
		p.Btn2Panel.add(p.Hdr_indiv_prnt_flg);
		p.Hdr_indiv_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0080.HdrR.indiv_prnt_flg_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_dlv_rqst_tm_p_PPanel);
		p.BulkSetPanel.setLastBeans(p.BulkSet_dlv_rqst_tm_p_PPanel);
		p.BulkSet_dlv_rqst_tm_p_PPanel.setNextBeans(p.BulkSet_rqst_avl_rqst_dt);
		p.BulkSetPanel.add(p.BulkSet_rqst_avl_rqst_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_rqst_avl_rqst_dt);
		p.BulkSet_rqst_avl_rqst_dt.setNextBeans(p.BulkSet_amt);
		p.BulkSet_rqst_avl_rqst_dt.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0080.BulkSetR.rqst_avl_rqst_dt_META);
		p.BulkSet_rqst_avl_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_amt_Label);
		p.BulkSetPanel.add(p.BulkSet_amt);
		p.BulkSet_amt.setNextBeans(p.BulkSet_inc_tax_amt);
		p.BulkSet_amt.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0080.BulkSetR.amt_META);
		p.BulkSet_amt.setMinusEnable(true);
		p.BulkSetPanel.add(p.BulkSet_inc_tax_amt_Label);
		p.BulkSetPanel.add(p.BulkSet_inc_tax_amt);
		p.BulkSet_inc_tax_amt.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0080.BulkSetR.inc_tax_amt_META);
		p.BulkSet_inc_tax_amt.setMinusEnable(true);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.Dtl2Panel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.add(p.Dtl2Panel);
		p.Dtl2Panel.setNextBeans(p.BtnPanel);
		p.Dtl2Panel.add(p.Dtl2ScrollPane);
		p.Dtl2Panel.setLastBeans(p.Dtl2Table);
		p.Dtl2ScrollPane.setViewportView(p.Dtl2Table);
		p.Dtl2Table.setList(p.getDtl2L());
		p.Dtl2Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.Btn1Panel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0120.setFunctionKey(MCFunctionKey.F3);
		p.Btn1Panel.setLastBeans(p.Btn_open_MSBDP0120);
		p.Btn1Panel.add(p.Btn_open_MSBDP0120);
		p.Btn_open_MSBDP0120.setNextBeans(p.Btn_open_MSBDP0250);
		p.Btn_open_MSBDP0250.setFunctionKey(MCFunctionKey.F4);
		p.Btn1Panel.add(p.Btn_open_MSBDP0250);
		p.Btn_open_MSBDP0250.setNextBeans(p.Btn_bndl_schd);
		p.Btn_bndl_schd.setFunctionKey(MCFunctionKey.F15);
		p.Btn1Panel.add(p.Btn_bndl_schd);
		p.Btn_bndl_schd.setNextBeans(p.Btn_srch_upri);
		p.Btn_srch_upri.setFunctionKey(MCFunctionKey.F16);
		p.Btn1Panel.add(p.Btn_srch_upri);
		p.Btn_srch_upri.setNextBeans(p.Btn_srch_dlv);
		p.Btn_srch_dlv.setFunctionKey(MCFunctionKey.F23);
		p.Btn1Panel.add(p.Btn_srch_dlv);
		p.Btn_srch_dlv.setNextBeans(p.Btn_menu_move_p_PPanel);
		p.Btn1Panel.add(p.Btn_menu_move_p_PPanel);
		p.Btn_menu_move_p_PPanel.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Btn1Panel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Btn1Panel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F8);
		p.Btn1Panel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F9);
		p.Btn1Panel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.Btn1Panel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.Btn1Panel.add(p.Btn_upd);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [Btn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn1(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.add(p.Btn1Panel);
		p.Btn1Panel.setNextBeans(p.Btn2Panel);
		p.Btn1Panel.setLayoutPosition("SWN");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn2(MSBDP_PoReg p) {
		// ブロック関連の初期化
		p.add(p.Btn2Panel);
		p.Btn2Panel.setNextBeans(p.EastBtnPanel);
		p.Btn2Panel.setLayoutPosition("SWS");
		// ブロックの項目の初期化
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBDP_PoReg p) {
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
		MSBDP_PoReg_MC.mcInitScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitCnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitCnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitTOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitHdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitTab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitHdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitHdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitBulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitDtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitDtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitBtn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitBtn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitBtn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.mcInitEastBtn((MSBDP_PoReg)this);

		// [INS]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitINS_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitINS_EastBtn((MSBDP_PoReg)this);

		// [UPD]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitUPD_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD_EastBtn((MSBDP_PoReg)this);

		// [UPD_NEXT]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitUPD__NEXT_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__NEXT_EastBtn((MSBDP_PoReg)this);

		// [UPD_APRV]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitUPD__APRV_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitUPD__APRV_EastBtn((MSBDP_PoReg)this);

		// [DEL]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitDEL_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL_EastBtn((MSBDP_PoReg)this);

		// [DEL_APRV]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitDEL__APRV_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitDEL__APRV_EastBtn((MSBDP_PoReg)this);

		// [SRCH]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitSRCH_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitSRCH_EastBtn((MSBDP_PoReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitFIX__I_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__I_EastBtn((MSBDP_PoReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitFIX__U_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__U_EastBtn((MSBDP_PoReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitFIX__D_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitFIX__D_EastBtn((MSBDP_PoReg)this);

		// [REF]ステータスのモードの設定
		MSBDP_PoReg_MC.statusInitREF_ScreenOpe((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Cnd((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Cnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_TOP((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_HdrTab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Tab((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Tab2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Hdr((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Hdr2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_BulkSet((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Dtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Dtl2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Btn((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Btn1((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_Btn2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.statusInitREF_EastBtn((MSBDP_PoReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PoReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PoReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_rev_no.setListListener(p);
		p.Cnd_rev_no.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_srch_po.addAllListener(p);
		p.Cnd_srch_po.setAPMethodName("doCnd_srch_po");
		p.Cnd_srch_po_schd.addAllListener(p);
		p.Cnd_srch_po_schd.setAPMethodName("doCnd_srch_po_schd");
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBDP_PoReg p) {
		p.Cnd2Table.addAllListener(p);
		p.columnCnd2_po_schd_no.addAllListener(p);
		p.columnCnd2_po_schd_no.setListListener(p);
	}

	/**
	 *  [TOP]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTOP(MSBDP_PoReg p) {
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBDP_PoReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Tab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab(MSBDP_PoReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBDP_PoReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBDP_PoReg p) {
		p.Hdr_trd_cd.setListListener(p);
		p.Hdr_trd_cd.addAllListener(p);
		p.Hdr_trd_nm.setListListener(p);
		p.Hdr_trd_nm.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_po_no.setListListener(p);
		p.Hdr_po_no.addAllListener(p);
		p.Hdr_po_rev.setListListener(p);
		p.Hdr_po_rev.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_po_print_dt.setListListener(p);
		p.Hdr_po_print_dt.addAllListener(p);
		p.Hdr_po_print_flg.addAllListener(p);
		p.Hdr_dlv_print_flg.addAllListener(p);
		p.Hdr_purc_ddlv_dlv_print_flg.addAllListener(p);
		p.Hdr_aprv_rvrs_flg.addAllListener(p);
		p.Hdr_aprv_flg.addAllListener(p);
		p.Hdr_aprv_no.setListListener(p);
		p.Hdr_aprv_no.addAllListener(p);
		p.Hdr_aprv_sts_typ.setListListener(p);
		p.Hdr_aprv_sts_typ.addAllListener(p);
		p.Hdr_aprv_sts_typ_nm.setListListener(p);
		p.Hdr_aprv_sts_typ_nm.addAllListener(p);
		p.Hdr_aprv_upd_flg.addAllListener(p);
		p.Hdr_aprv_can_flg.addAllListener(p);
		p.Hdr_po_dt.setListListener(p);
		p.Hdr_po_dt.addAllListener(p);
		p.Hdr_sppl_cd.setListListener(p);
		p.Hdr_sppl_cd.addAllListener(p);
		p.Hdr_sppl_nm.setListListener(p);
		p.Hdr_sppl_nm.addAllListener(p);
		p.Hdr_purc_amt_rnd_typ.setListListener(p);
		p.Hdr_purc_amt_rnd_typ.addAllListener(p);
		p.Hdr_purc_tax_rnd_typ.setListListener(p);
		p.Hdr_purc_tax_rnd_typ.addAllListener(p);
		p.Hdr_sppl_cal_cd.setListListener(p);
		p.Hdr_sppl_cal_cd.addAllListener(p);
		p.Hdr_sppl_purc_upri_cng_flg.addAllListener(p);
		p.Hdr_prnt_lcl_cd.setListListener(p);
		p.Hdr_prnt_lcl_cd.addAllListener(p);
		p.Hdr_sppl_ship_form_cd.setListListener(p);
		p.Hdr_sppl_ship_form_cd.addAllListener(p);
		p.Hdr_po_dlv_slip_flg.addAllListener(p);
		p.Hdr_ap_dpt_cd.setListListener(p);
		p.Hdr_ap_dpt_cd.addAllListener(p);
		p.Hdr_mst_ap_dpt_cd.setListListener(p);
		p.Hdr_mst_ap_dpt_cd.addAllListener(p);
		p.Hdr_purc_upri_req_typ.setListListener(p);
		p.Hdr_purc_upri_req_typ.addAllListener(p);
		p.Hdr_sppl_pay_crryovr_times.setListListener(p);
		p.Hdr_sppl_pay_crryovr_times.addAllListener(p);
		p.Hdr_subcon_flg.addAllListener(p);
		p.Hdr_repurc_obli_flg.addAllListener(p);
		p.Hdr_outsrc_upri_typ.setListListener(p);
		p.Hdr_outsrc_upri_typ.addAllListener(p);
		p.Hdr_sppl_iv_flg.addAllListener(p);
		p.Hdr_edi_flg.addAllListener(p);
		p.Hdr_last_edi_flg.addAllListener(p);
		p.Hdr_edi_tgt_flg.addAllListener(p);
		p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_usr_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_def_purc_usr_cd.setListListener(p);
		p.Hdr_def_purc_usr_cd.addAllListener(p);
		p.Hdr_def_purc_dpt_cd.setListListener(p);
		p.Hdr_def_purc_dpt_cd.addAllListener(p);
		p.Hdr_ap_dpt_flg.addAllListener(p);
		p.Hdr_purc_dpt_wg_cd.setListListener(p);
		p.Hdr_purc_dpt_wg_cd.addAllListener(p);
		p.Hdr_purc_dpt_wg_nm.setListListener(p);
		p.Hdr_purc_dpt_wg_nm.addAllListener(p);
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
		p.Hdr_ptax_cur_cd.setListListener(p);
		p.Hdr_ptax_cur_cd.addAllListener(p);
		p.Hdr_ptax_cur_nm.setListListener(p);
		p.Hdr_ptax_cur_nm.addAllListener(p);
		p.Hdr_ptax_cur_amt_dec_place.setListListener(p);
		p.Hdr_ptax_cur_amt_dec_place.addAllListener(p);
		p.Hdr_ptax_cur_upri_dec_place.setListListener(p);
		p.Hdr_ptax_cur_upri_dec_place.addAllListener(p);
		p.Hdr_ptax_xrate_inpt_flg.addAllListener(p);
		p.Hdr_purc_xrate_cd.setListListener(p);
		p.Hdr_purc_xrate_cd.addAllListener(p);
		p.Hdr_wtax_rnd_typ.setListListener(p);
		p.Hdr_wtax_rnd_typ.addAllListener(p);
		p.Hdr_trd_rmrks.setListListener(p);
		p.Hdr_trd_rmrks.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_po_print_rmrks.setListListener(p);
		p.Hdr_po_print_rmrks.addAllListener(p);
		p.Hdr_dlv_slip_rmrks.setListListener(p);
		p.Hdr_dlv_slip_rmrks.addAllListener(p);
		p.Hdr_po_print_cd.setListListener(p);
		p.Hdr_po_print_cd.addAllListener(p);
		p.Hdr_po_print_nm.setListListener(p);
		p.Hdr_po_print_nm.addAllListener(p);
		p.Hdr_upd_po_print_schd_dt.setListListener(p);
		p.Hdr_upd_po_print_schd_dt.addAllListener(p);
		p.Hdr_po_crct_rsn_cd.setListListener(p);
		p.Hdr_po_crct_rsn_cd.addAllListener(p);
		p.Hdr_po_crct_rsn_nm.setListListener(p);
		p.Hdr_po_crct_rsn_nm.addAllListener(p);
		p.Hdr_po_crct_rsn_rmrks.setListListener(p);
		p.Hdr_po_crct_rsn_rmrks.addAllListener(p);
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
		p.Hdr_asppl_cd.setListListener(p);
		p.Hdr_asppl_cd.addAllListener(p);
		p.Hdr_asppl_nm.setListListener(p);
		p.Hdr_asppl_nm.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_edi_sub_char1.setListListener(p);
		p.Hdr_edi_sub_char1.addAllListener(p);
		p.Hdr_edi_sub_char2.setListListener(p);
		p.Hdr_edi_sub_char2.addAllListener(p);
		p.Hdr_edi_sub_char3.setListListener(p);
		p.Hdr_edi_sub_char3.addAllListener(p);
		p.Hdr_edi_sub_char4.setListListener(p);
		p.Hdr_edi_sub_char4.addAllListener(p);
		p.Hdr_edi_sub_char5.setListListener(p);
		p.Hdr_edi_sub_char5.addAllListener(p);
		p.Hdr_edi_sub_num1.setListListener(p);
		p.Hdr_edi_sub_num1.addAllListener(p);
		p.Hdr_edi_sub_dt1.setListListener(p);
		p.Hdr_edi_sub_dt1.addAllListener(p);
		p.Hdr_purc_if_flg.addAllListener(p);
		p.Hdr_ext_sys_cd.setListListener(p);
		p.Hdr_ext_sys_cd.addAllListener(p);
		p.Hdr_ext_sys_nm.setListListener(p);
		p.Hdr_ext_sys_nm.addAllListener(p);
		p.Hdr_ext_po_no.setListListener(p);
		p.Hdr_ext_po_no.addAllListener(p);
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
		p.Hdr_po_upd_cntr.setListListener(p);
		p.Hdr_po_upd_cntr.addAllListener(p);
		p.Hdr_next_opr_flg.addAllListener(p);
		p.Hdr_po_schd_no.setListListener(p);
		p.Hdr_po_schd_no.addAllListener(p);
		p.Hdr_prnt_po_flg.addAllListener(p);
		p.Hdr_prnt_dlv_flg.addAllListener(p);
		p.Hdr_prnt_purc_ddlv_dlv_flg.addAllListener(p);
		p.Hdr_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBDP_PoReg p) {
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBDP_PoReg p) {
		p.BulkSet_rqst_avl_rqst_dt.setListListener(p);
		p.BulkSet_rqst_avl_rqst_dt.addAllListener(p);
		p.BulkSet_amt.setListListener(p);
		p.BulkSet_amt.addAllListener(p);
		p.BulkSet_inc_tax_amt.setListListener(p);
		p.BulkSet_inc_tax_amt.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBDP_PoReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_dtl_peg_no.addAllListener(p);
		p.columnDtl_dtl_peg_no.setListListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_in_to_loc_cd.addAllListener(p);
		p.columnDtl_in_to_loc_cd.setListListener(p);
		p.columnDtl_in_to_loc_nm.addAllListener(p);
		p.columnDtl_in_to_loc_nm.setListListener(p);
		p.columnDtl_in_to_loc_wg_cd.addAllListener(p);
		p.columnDtl_in_to_loc_wg_cd.setListListener(p);
		p.columnDtl_in_to_loc_wg_nm.addAllListener(p);
		p.columnDtl_in_to_loc_wg_nm.setListListener(p);
		p.columnDtl_pri_prnt_flg.addAllListener(p);
		p.columnDtl_drct_dlv_typ.addAllListener(p);
		p.columnDtl_drct_dlv_typ.setListListener(p);
		p.columnDtl_drct_dlv_typ_nm.addAllListener(p);
		p.columnDtl_drct_dlv_typ_nm.setListListener(p);
		p.columnDtl_outsrc_sppl_cd.addAllListener(p);
		p.columnDtl_outsrc_sppl_cd.setListListener(p);
		p.columnDtl_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_loc_mng_typ.addAllListener(p);
		p.columnDtl_loc_mng_typ.setListListener(p);
		p.columnDtl_in_to_loc_cal_cd.addAllListener(p);
		p.columnDtl_in_to_loc_cal_cd.setListListener(p);
		p.columnDtl_site_cd.addAllListener(p);
		p.columnDtl_site_cd.setListListener(p);
		p.columnDtl_lg_grp_cd.addAllListener(p);
		p.columnDtl_lg_grp_cd.setListListener(p);
		p.columnDtl_loc_grp_cd.addAllListener(p);
		p.columnDtl_loc_grp_cd.setListListener(p);
		p.columnDtl_bef_in_to_loc_wg_cd.addAllListener(p);
		p.columnDtl_bef_in_to_loc_wg_cd.setListListener(p);
		p.columnDtl_bef_lg_grp_cd.addAllListener(p);
		p.columnDtl_bef_lg_grp_cd.setListListener(p);
		p.columnDtl_bef_loc_grp_cd.addAllListener(p);
		p.columnDtl_bef_loc_grp_cd.setListListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_arr_skip_flg.addAllListener(p);
		p.columnDtl_purc_dlv_slip_flg.addAllListener(p);
		p.columnDtl_maker_cd.addAllListener(p);
		p.columnDtl_maker_cd.setListListener(p);
		p.columnDtl_maker_nm.addAllListener(p);
		p.columnDtl_maker_nm.setListListener(p);
		p.columnDtl_rqst_avl_rqst_dt.addAllListener(p);
		p.columnDtl_rqst_avl_rqst_dt.setListListener(p);
		p.columnDtl_purc_schd_dt.addAllListener(p);
		p.columnDtl_purc_schd_dt.setListListener(p);
		p.columnDtl_purc_basis_typ.addAllListener(p);
		p.columnDtl_purc_basis_typ.setListListener(p);
		p.columnDtl_purc_basis_typ_nm.addAllListener(p);
		p.columnDtl_purc_basis_typ_nm.setListListener(p);
		p.columnDtl_sync_flg.addAllListener(p);
		p.columnDtl_itm_purc_upri_cng_flg.addAllListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_itm_pay_crryovr_times.addAllListener(p);
		p.columnDtl_itm_pay_crryovr_times.setListListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_bp_lot_no.addAllListener(p);
		p.columnDtl_bp_lot_no.setListListener(p);
		p.columnDtl_sppl_itm_cd.addAllListener(p);
		p.columnDtl_sppl_itm_cd.setListListener(p);
		p.columnDtl_sppl_itm_nm.addAllListener(p);
		p.columnDtl_sppl_itm_nm.setListListener(p);
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_ap_dpt_cd.addAllListener(p);
		p.columnDtl_ap_dpt_cd.setListListener(p);
		p.columnDtl_ap_dpt_nm.addAllListener(p);
		p.columnDtl_ap_dpt_nm.setListListener(p);
		p.columnDtl_dlv_cal_cd.addAllListener(p);
		p.columnDtl_dlv_cal_cd.setListListener(p);
		p.columnDtl_purc_id_typ.addAllListener(p);
		p.columnDtl_purc_id_typ.setListListener(p);
		p.columnDtl_purc_id_typ_nm.addAllListener(p);
		p.columnDtl_purc_id_typ_nm.setListListener(p);
		p.columnDtl_po_conf_rcpt_flg.addAllListener(p);
		p.columnDtl_po_conf_rcpt_dt.addAllListener(p);
		p.columnDtl_po_conf_rcpt_dt.setListListener(p);
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
		p.columnDtl_abort_flg.addAllListener(p);
		p.columnDtl_bef_abort_flg.addAllListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_cont_fctr_flg.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.setListListener(p);
		p.columnDtl_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl_purc_sts_typ.addAllListener(p);
		p.columnDtl_purc_sts_typ.setListListener(p);
		p.columnDtl_purc_sts_typ_nm.addAllListener(p);
		p.columnDtl_purc_sts_typ_nm.setListListener(p);
		p.columnDtl_dlv_inst_qty.addAllListener(p);
		p.columnDtl_dlv_inst_qty.setListListener(p);
		p.columnDtl_dlv_inst_prms_rcpt_qty.addAllListener(p);
		p.columnDtl_dlv_inst_prms_rcpt_qty.setListListener(p);
		p.columnDtl_rcpt_iv_qty.addAllListener(p);
		p.columnDtl_rcpt_iv_qty.setListListener(p);
		p.columnDtl_arr_qty.addAllListener(p);
		p.columnDtl_arr_qty.setListListener(p);
		p.columnDtl_purc_qty.addAllListener(p);
		p.columnDtl_purc_qty.setListListener(p);
		p.columnDtl_arr_schd_split_flg.addAllListener(p);
		p.columnDtl_arr_cmpl_flg.addAllListener(p);
		p.columnDtl_purc_cmpl_flg.addAllListener(p);
		p.columnDtl_pay_crryovr_times.addAllListener(p);
		p.columnDtl_pay_crryovr_times.setListListener(p);
		p.columnDtl_purc_upri_req_typ.addAllListener(p);
		p.columnDtl_purc_upri_req_typ.setListListener(p);
		p.columnDtl_purc_upri_req_typ_nm.addAllListener(p);
		p.columnDtl_purc_upri_req_typ_nm.setListListener(p);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_repurc_obli_flg.addAllListener(p);
		p.columnDtl_old_trd_cur_upri.addAllListener(p);
		p.columnDtl_old_trd_cur_upri.setListListener(p);
		p.columnDtl_old_trd_cur_proc_upri.addAllListener(p);
		p.columnDtl_old_trd_cur_proc_upri.setListListener(p);
		p.columnDtl_old_trd_cur_onr_prov_upri.addAllListener(p);
		p.columnDtl_old_trd_cur_onr_prov_upri.setListListener(p);
		p.columnDtl_old_interim_flg.addAllListener(p);
		p.columnDtl_old_trd_cur_dscnt_amt.addAllListener(p);
		p.columnDtl_old_trd_cur_dscnt_amt.setListListener(p);
		p.columnDtl_old_dscnt_rsn_cd.addAllListener(p);
		p.columnDtl_old_dscnt_rsn_cd.setListListener(p);
		p.columnDtl_old_dscnt_rsn_nm.addAllListener(p);
		p.columnDtl_old_dscnt_rsn_nm.setListListener(p);
		p.columnDtl_wtax_rate.addAllListener(p);
		p.columnDtl_wtax_rate.setListListener(p);
		p.columnDtl_mfg_loc_cd.addAllListener(p);
		p.columnDtl_mfg_loc_cd.setListListener(p);
		p.columnDtl_mfg_loc_nm.addAllListener(p);
		p.columnDtl_mfg_loc_nm.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_outsrc_flg.addAllListener(p);
		p.columnDtl_mfg_inst_flg.addAllListener(p);
		p.columnDtl_outsrc_itm_ord_no.addAllListener(p);
		p.columnDtl_outsrc_itm_ord_no.setListListener(p);
		p.columnDtl_purc_rsn_cd.addAllListener(p);
		p.columnDtl_purc_rsn_cd.setListListener(p);
		p.columnDtl_purc_rsn_nm.addAllListener(p);
		p.columnDtl_purc_rsn_nm.setListListener(p);
		p.columnDtl_xpns_purc_flg.addAllListener(p);
		p.columnDtl_not_xpns_purc_flg.addAllListener(p);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_bd_lot_mng_typ.addAllListener(p);
		p.columnDtl_bd_lot_mng_typ.setListListener(p);
		p.columnDtl_bd_sublot_mng_typ.addAllListener(p);
		p.columnDtl_bd_sublot_mng_typ.setListListener(p);
		p.columnDtl_bd_lot_no_typ.addAllListener(p);
		p.columnDtl_bd_lot_no_typ.setListListener(p);
		p.columnDtl_bd_sublot_no_typ.addAllListener(p);
		p.columnDtl_bd_sublot_no_typ.setListListener(p);
		p.columnDtl_bd_sno1_mng_typ.addAllListener(p);
		p.columnDtl_bd_sno1_mng_typ.setListListener(p);
		p.columnDtl_bd_sno2_mng_typ.addAllListener(p);
		p.columnDtl_bd_sno2_mng_typ.setListListener(p);
		p.columnDtl_bd_sno3_mng_typ.addAllListener(p);
		p.columnDtl_bd_sno3_mng_typ.setListListener(p);
		p.columnDtl_bd_sno4_mng_typ.addAllListener(p);
		p.columnDtl_bd_sno4_mng_typ.setListListener(p);
		p.columnDtl_rqst_can_flg.addAllListener(p);
		p.columnDtl_po_cnt_rmrks.addAllListener(p);
		p.columnDtl_po_cnt_rmrks.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_po_print_d_rmrks.addAllListener(p);
		p.columnDtl_po_print_d_rmrks.setListListener(p);
		p.columnDtl_dlv_slip_d_rmrks.addAllListener(p);
		p.columnDtl_dlv_slip_d_rmrks.setListListener(p);
		p.columnDtl_arr_cnt_rmrks.addAllListener(p);
		p.columnDtl_arr_cnt_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_edi_sub_d_char1.addAllListener(p);
		p.columnDtl_edi_sub_d_char1.setListListener(p);
		p.columnDtl_edi_sub_d_char2.addAllListener(p);
		p.columnDtl_edi_sub_d_char2.setListListener(p);
		p.columnDtl_edi_sub_d_char3.addAllListener(p);
		p.columnDtl_edi_sub_d_char3.setListListener(p);
		p.columnDtl_edi_sub_d_char4.addAllListener(p);
		p.columnDtl_edi_sub_d_char4.setListListener(p);
		p.columnDtl_edi_sub_d_char5.addAllListener(p);
		p.columnDtl_edi_sub_d_char5.setListListener(p);
		p.columnDtl_edi_sub_d_num1.addAllListener(p);
		p.columnDtl_edi_sub_d_num1.setListListener(p);
		p.columnDtl_edi_sub_d_dt1.addAllListener(p);
		p.columnDtl_edi_sub_d_dt1.setListListener(p);
		p.columnDtl_ext_po_d_no.addAllListener(p);
		p.columnDtl_ext_po_d_no.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_dlv_slip_no.addAllListener(p);
		p.columnDtl_dlv_slip_no.setListListener(p);
		p.columnDtl_dlv_slip_seq.addAllListener(p);
		p.columnDtl_dlv_slip_seq.setListListener(p);
		p.columnDtl_dlv_slip_invalid_flg.addAllListener(p);
		p.columnDtl_purc_ddlv_dlv_slip_no.addAllListener(p);
		p.columnDtl_purc_ddlv_dlv_slip_no.setListListener(p);
		p.columnDtl_dlv_slip_mng_no.addAllListener(p);
		p.columnDtl_dlv_slip_mng_no.setListListener(p);
		p.columnDtl_dlv_slip_mng_seq.addAllListener(p);
		p.columnDtl_dlv_slip_mng_seq.setListListener(p);
		p.columnDtl_po_schd_src_typ.addAllListener(p);
		p.columnDtl_po_schd_src_typ.setListListener(p);
		p.columnDtl_po_schd_src_typ_nm.addAllListener(p);
		p.columnDtl_po_schd_src_typ_nm.setListListener(p);
		p.columnDtl_po_schd_src_no.addAllListener(p);
		p.columnDtl_po_schd_src_no.setListListener(p);
		p.columnDtl_rqst_fr_usr_cd.addAllListener(p);
		p.columnDtl_rqst_fr_usr_cd.setListListener(p);
		p.columnDtl_rqst_fr_usr_nm.addAllListener(p);
		p.columnDtl_rqst_fr_usr_nm.setListListener(p);
		p.columnDtl_rqst_fr_dpt_cd.addAllListener(p);
		p.columnDtl_rqst_fr_dpt_cd.setListListener(p);
		p.columnDtl_rqst_fr_dpt_nm.addAllListener(p);
		p.columnDtl_rqst_fr_dpt_nm.setListListener(p);
		p.columnDtl_bndl_flg.addAllListener(p);
		p.columnDtl_rqst_slo_flg.addAllListener(p);
		p.columnDtl_po_schd_no.addAllListener(p);
		p.columnDtl_po_schd_no.setListListener(p);
		p.columnDtl_po_d_no.addAllListener(p);
		p.columnDtl_po_d_no.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_arr_flg.addAllListener(p);
		p.columnDtl_purc_flg.addAllListener(p);
		p.columnDtl_rcpt_iv_flg.addAllListener(p);
		p.columnDtl_mfg_loc_wg_cd.addAllListener(p);
		p.columnDtl_mfg_loc_wg_cd.setListListener(p);
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MSBDP_PoReg p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_dtl_peg_no.addAllListener(p);
		p.columnDtl2_dtl_peg_no.setListListener(p);
		p.columnDtl2_po_schd_no.addAllListener(p);
		p.columnDtl2_po_schd_no.setListListener(p);
		p.columnDtl2_po_d_no.addAllListener(p);
		p.columnDtl2_po_d_no.setListListener(p);
		p.columnDtl2_can_flg.addAllListener(p);
		p.columnDtl2_po_schd_upd_cntr.addAllListener(p);
		p.columnDtl2_po_schd_upd_cntr.setListListener(p);
		p.columnDtl2_arr_pr_upd_cntr.addAllListener(p);
		p.columnDtl2_arr_pr_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBDP_PoReg p) {
		p.Btn_open_MSBDP0120.addAllListener(p);
		p.Btn_open_MSBDP0120.setAPMethodName("doBtn_open_MSBDP0120");
		p.Btn_open_MSBDP0250.addAllListener(p);
		p.Btn_open_MSBDP0250.setAPMethodName("doBtn_open_MSBDP0250");
		p.Btn_bndl_schd.addAllListener(p);
		p.Btn_bndl_schd.setAPMethodName("doBtn_bndl_schd");
		p.Btn_srch_upri.addAllListener(p);
		p.Btn_srch_upri.setAPMethodName("doBtn_srch_upri");
		p.Btn_srch_dlv.addAllListener(p);
		p.Btn_srch_dlv.setAPMethodName("doBtn_srch_dlv");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
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
	 *  [Btn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn1(MSBDP_PoReg p) {
	}

	/**
	 *  [Btn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn2(MSBDP_PoReg p) {
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBDP_PoReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rev_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch_po.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_po_schd.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitINS_TOP(MSBDP_PoReg p){

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [INS]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab(MSBDP_PoReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_sppl_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_last_edi_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_def_purc_usr_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_prax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_purc_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_po_print_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_dlv_slip_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_po_print_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_po_print_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_po_crct_rsn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_asppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_edi_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_edi_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_edi_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_edi_sub_char4.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_edi_sub_char5.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_edi_sub_num1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_edi_sub_dt1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_purc_if_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, INS, MCMode.READ_ONLY);
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
		p.Hdr_po_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_prnt_dlv_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_indiv_prnt_flg.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINS_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.ENABLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_drct_dlv_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_iv_itm_nm.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_purc_basis_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_purc_basis_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_bp_lot_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sppl_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sppl_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_purc_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_purc_upri_req_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_repurc_obli_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_purc_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_bd_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_po_print_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char4.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char5.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_num1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_dt1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_ext_po_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBDP0250.putMode(p, INS, MCMode.DISABLE);
		p.Btn_bndl_schd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_srch_upri.putMode(p, INS, MCMode.ENABLE);
		p.Btn_srch_dlv.putMode(p, INS, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [INS]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_po.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch_po_schd.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TOP(MSBDP_PoReg p){

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [UPD]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab(MSBDP_PoReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_last_edi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_def_purc_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_prax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_purc_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_po_print_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_dlv_slip_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_po_print_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_po_print_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_po_crct_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_po_crct_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_asppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_edi_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_edi_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_edi_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_edi_sub_char4.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_edi_sub_char5.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_edi_sub_num1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_edi_sub_dt1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_purc_if_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.Hdr_po_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_prnt_dlv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_indiv_prnt_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.ENABLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_drct_dlv_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_basis_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_bp_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sppl_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sppl_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bef_abort_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_upri_req_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_repurc_obli_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bd_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_po_print_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_num1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_dt1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ext_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_bndl_schd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_srch_upri.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_srch_dlv.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [UPD]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [UPD_NEXT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [UPD_NEXT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Cnd_srch_po.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Cnd_srch_po_schd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_NEXT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, UPD_NEXT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_NEXT]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_TOP(MSBDP_PoReg p){

	}

	/**
	 * [UPD_NEXT]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [UPD_NEXT]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Tab(MSBDP_PoReg p){

	}

	/**
	 * [UPD_NEXT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [UPD_NEXT]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.Hdr_aprv_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_last_edi_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_purc_usr_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_purc_xrate_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_po_print_rmrks.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_rmrks.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_po_print_cd.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_po_print_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_po_crct_rsn_cd.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_po_crct_rsn_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_edi_sub_char1.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_edi_sub_char2.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_edi_sub_char3.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_edi_sub_char4.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_edi_sub_char5.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_edi_sub_num1.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_edi_sub_dt1.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_purc_if_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Hdr_po_upd_cntr.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_prnt_dlv_flg.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Hdr_indiv_prnt_flg.putMode(p, UPD_NEXT, MCMode.ENABLE);

	}

	/**
	 * [UPD_NEXT]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [UPD_NEXT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.BulkSet_amt.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, UPD_NEXT, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_NEXT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_cd.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.ENABLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_drct_dlv_typ.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_iv_itm_nm.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_stk_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_purc_basis_typ.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_purc_basis_typ_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_bp_lot_no.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_sppl_itm_cd.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_sppl_itm_nm.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_cst_itm_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_purc_id_typ_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_bef_abort_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_purc_upri_req_typ.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_repurc_obli_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_purc_rsn_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(UPD_NEXT, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.putMode(p, UPD_NEXT, MCMode.REQUIRED);
		p.columnDtl_bd_lot_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_po_print_d_rmrks.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char1.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char2.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char3.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char4.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char5.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_num1.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_dt1.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.columnDtl_ext_po_d_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_NEXT, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, UPD_NEXT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_NEXT]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, UPD_NEXT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_NEXT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, UPD_NEXT, MCMode.DISABLE);
		p.Btn_bndl_schd.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Btn_srch_upri.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Btn_srch_dlv.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD_NEXT, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_radd.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD_NEXT, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_NEXT, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_NEXT, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_NEXT, MCMode.DISABLE);

	}

	/**
	 * [UPD_NEXT]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [UPD_NEXT]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [UPD_NEXT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NEXT_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_srch_po.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Cnd_srch_po_schd.putMode(p, UPD_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APRV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APRV]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_TOP(MSBDP_PoReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Tab(MSBDP_PoReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Hdr_aprv_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_last_edi_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_purc_usr_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
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
		p.Hdr_ptax_cur_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_purc_xrate_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(UPD_APRV, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_po_print_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_po_print_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_po_print_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_edi_sub_char1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_edi_sub_char2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_edi_sub_char3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_edi_sub_char4.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_edi_sub_char5.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_edi_sub_num1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_edi_sub_dt1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_purc_if_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
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
		p.Hdr_po_upd_cntr.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_prnt_dlv_flg.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Hdr_indiv_prnt_flg.putMode(p, UPD_APRV, MCMode.ENABLE);

	}

	/**
	 * [UPD_APRV]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.BulkSet_amt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, UPD_APRV, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_APRV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_bef_abort_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD_APRV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(UPD_APRV, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char2.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char3.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char4.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_char5.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_num1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_edi_sub_d_dt1.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.columnDtl_ext_po_d_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APRV]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, UPD_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_bndl_schd.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD_APRV, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_APRV, MCMode.DISABLE);

	}

	/**
	 * [UPD_APRV]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_po.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_srch_po_schd.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TOP(MSBDP_PoReg p){

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [DEL]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab(MSBDP_PoReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Hdr_last_edi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_purc_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Hdr_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_purc_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_po_print_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_po_print_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_po_print_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_po_crct_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char5.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_sub_num1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_edi_sub_dt1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_purc_if_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Hdr_po_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_prnt_dlv_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_indiv_prnt_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bef_abort_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_num1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_dt1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBDP0250.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_bndl_schd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [DEL]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_srch_po.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Cnd_srch_po_schd.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_TOP(MSBDP_PoReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Tab(MSBDP_PoReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.Hdr_aprv_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_last_edi_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_purc_usr_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_purc_xrate_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(DEL_APRV, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_print_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_print_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_print_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char4.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char5.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_sub_num1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_edi_sub_dt1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_purc_if_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_po_upd_cntr.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Hdr_prnt_dlv_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, DEL_APRV, MCMode.ENABLE);
		p.Hdr_indiv_prnt_flg.putMode(p, DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [DEL_APRV]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.BulkSet_amt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, DEL_APRV, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_APRV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_bef_abort_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(DEL_APRV, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL_APRV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char4.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char5.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_num1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_dt1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_ext_po_d_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_open_MSBDP0250.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_bndl_schd.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL_APRV, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL_APRV, MCMode.DISABLE);

	}

	/**
	 * [DEL_APRV]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_po.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch_po_schd.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TOP(MSBDP_PoReg p){

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab(MSBDP_PoReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, SRCH, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_last_edi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_purc_usr_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Hdr_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_purc_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_print_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_print_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_sub_num1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_edi_sub_dt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_if_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Hdr_po_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_dlv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_indiv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.BulkSet_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bef_abort_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_num1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_dt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBDP0250.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_bndl_schd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [SRCH]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_rev_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_po.putMode(p, FIX_I, MCMode.DISABLE);
		p.Cnd_srch_po_schd.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_TOP(MSBDP_PoReg p){

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab(MSBDP_PoReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, FIX_I, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_last_edi_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_purc_usr_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.Hdr_ptax_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_purc_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_print_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_print_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_print_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char4.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char5.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_sub_num1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_edi_sub_dt1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_purc_if_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.Hdr_po_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prnt_dlv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_indiv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [FIX_I]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.BulkSet_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bef_abort_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char4.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char5.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_num1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_dt1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_bndl_schd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [FIX_I]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_po.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch_po_schd.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_TOP(MSBDP_PoReg p){

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab(MSBDP_PoReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, FIX_U, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_last_edi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_purc_usr_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Hdr_ptax_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_purc_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_print_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_print_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_print_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_sub_num1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_edi_sub_dt1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_purc_if_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Hdr_po_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prnt_dlv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_indiv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bef_abort_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_num1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_dt1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_bndl_schd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [FIX_U]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_po.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_srch_po_schd.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_TOP(MSBDP_PoReg p){

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab(MSBDP_PoReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, FIX_D, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_last_edi_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_purc_usr_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.Hdr_ptax_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_purc_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_print_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_print_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_print_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char4.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char5.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_sub_num1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_edi_sub_dt1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_purc_if_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.Hdr_po_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prnt_dlv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_indiv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [FIX_D]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.BulkSet_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bef_abort_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char4.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char5.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_num1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_dt1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_po_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_open_MSBDP0250.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_bndl_schd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [FIX_D]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBDP_PoReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBDP_PoReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBDP_PoReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_po_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_po.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch_po_schd.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBDP_PoReg p){
		p.columnCnd2_po_schd_no.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitREF_TOP(MSBDP_PoReg p){

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBDP_PoReg p){

	}

	/**
	 * [REF]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab(MSBDP_PoReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBDP_PoReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBDP_PoReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_print_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_print_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_print_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_ddlv_dlv_print_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_rvrs_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, REF, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_cntct_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sppl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sppl_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sppl_ship_form_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_po_dlv_slip_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_upri_req_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_subcon_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_repurc_obli_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_outsrc_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sppl_iv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_last_edi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_def_purc_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Hdr_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_purc_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wtax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_print_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_print_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_print_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_po_print_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_crct_rsn_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char4.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_sub_char5.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_sub_num1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_edi_sub_dt1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_if_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_po_no.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Hdr_po_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_next_opr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_po_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_prnt_po_flg.putMode(p, REF, MCMode.ENABLE);
		p.Hdr_prnt_dlv_flg.putMode(p, REF, MCMode.ENABLE);
		p.Hdr_prnt_purc_ddlv_dlv_flg.putMode(p, REF, MCMode.ENABLE);
		p.Hdr_indiv_prnt_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBDP_PoReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBDP_PoReg p){
		p.BulkSet_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_rqst_avl_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_inc_tax_amt.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBDP_PoReg p){
		p.columnDtl_dtl_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_dpt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_in_to_loc_p_PPanel.columnAddr_cntct_psn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_loc_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_arr_skip_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sync_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_conf_rcpt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bef_abort_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_inst_prms_rcpt_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_arr_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_arr_schd_split_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_arr_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_dscnt_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_old_dscnt_rsn_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rqst_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_print_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_char5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_num1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_edi_sub_d_dt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_mng_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_po_schd_src_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_fr_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_slo_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_arr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_wg_cd.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MSBDP_PoReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_po_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_can_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_arr_pr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBDP_PoReg p){
		p.Btn_open_MSBDP0120.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBDP0250.putMode(p, REF, MCMode.ENABLE);
		p.Btn_bndl_schd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, REF, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, REF, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn1(MSBDP_PoReg p){

	}

	/**
	 * [REF]ステータスの[Btn2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn2(MSBDP_PoReg p){

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBDP_PoReg p){

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
		MSBDP_PoReg_MC.setTableConfigCnd2((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.setTableConfigDtl((MSBDP_PoReg)this);
		MSBDP_PoReg_MC.setTableConfigDtl2((MSBDP_PoReg)this);
	}

	/**
	 * [Cnd2]ブロックのTableの設定
	 */
	protected static void setTableConfigCnd2(MSBDP_PoReg p) {
		p.columnCnd2_po_schd_no.setMeta(mcframe.clientMSBD.MSBDP0080.Cnd2R.po_schd_no_META);
		p.Cnd2Table.addColumnConfig(p.columnCnd2_po_schd_no);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBDP_PoReg p) {
		p.columnDtl_dtl_peg_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dtl_peg_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_peg_no);
		p.columnDtl_check.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_in_to_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.in_to_loc_cd_META);
		p.columnDtl_in_to_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_in_to_loc_cd.addLinkBeans(p.columnDtl_in_to_loc_nm,p.columnDtl_str_ln_tgt_flg,p.columnDtl_outsrc_sppl_cd,p.columnDtl_in_to_loc_wg_cd,p.columnDtl_in_to_loc_wg_nm,p.columnDtl_loc_mng_typ,p.columnDtl_in_to_loc_zip_cd,p.columnDtl_in_to_loc_addr1,p.columnDtl_in_to_loc_addr2,p.columnDtl_in_to_loc_addr3,p.columnDtl_in_to_loc_addr4,p.columnDtl_in_to_loc_tel,p.columnDtl_in_to_loc_fax,p.columnDtl_in_to_loc_cal_cd,p.columnDtl_site_cd,p.columnDtl_lg_grp_cd,p.columnDtl_loc_grp_cd,p.columnDtl_str_ln_cd,p.columnDtl_str_ln_cd_none_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_cd);
		p.columnDtl_in_to_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.in_to_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_nm);
		p.DtlTable.addTable(p.Dtl_in_to_loc_p_PPanel.AddrTable);
		p.columnDtl_in_to_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.in_to_loc_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_wg_cd);
		p.columnDtl_in_to_loc_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.in_to_loc_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_wg_nm);
		p.columnDtl_pri_prnt_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.pri_prnt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pri_prnt_flg);
		p.columnDtl_drct_dlv_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.drct_dlv_typ_META);
		p.columnDtl_drct_dlv_typ.addLinkBeans(p.columnDtl_drct_dlv_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_drct_dlv_typ);
		p.columnDtl_drct_dlv_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.drct_dlv_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_drct_dlv_typ_nm);
		p.columnDtl_outsrc_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.outsrc_sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_sppl_cd);
		p.columnDtl_str_ln_tgt_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_tgt_flg);
		p.columnDtl_loc_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.loc_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_mng_typ);
		p.columnDtl_in_to_loc_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.in_to_loc_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_cal_cd);
		p.columnDtl_site_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.site_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_cd);
		p.columnDtl_lg_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_grp_cd);
		p.columnDtl_loc_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.loc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_grp_cd);
		p.columnDtl_bef_in_to_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bef_in_to_loc_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bef_in_to_loc_wg_cd);
		p.columnDtl_bef_lg_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bef_lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bef_lg_grp_cd);
		p.columnDtl_bef_loc_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bef_loc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bef_loc_grp_cd);
		p.DtlTable.addTable(p.Dtl_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_stk_mng_typ, p.columnDtl_ver_flg, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_dec_place, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_itm_purc_upri_cng_flg, p.columnDtl_tax_cd, p.columnDtl_wtax_rate, p.columnDtl_itm_pay_crryovr_times, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_arr_skip_flg, p.columnDtl_maker_nm, p.columnDtl_purc_id_typ, p.columnDtl_maker_cd, p.columnDtl_mfg_loc_wg_cd, p.columnDtl_mfg_loc_nm, p.columnDtl_bom_ptn, p.columnDtl_mfg_loc_cd, p.columnDtl_purc_basis_typ, p.columnDtl_purc_dlv_slip_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_stk_mng_typ, p.columnDtl_ver_flg, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_dec_place, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_itm_purc_upri_cng_flg, p.columnDtl_tax_cd, p.columnDtl_wtax_rate, p.columnDtl_itm_pay_crryovr_times, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_arr_skip_flg, p.columnDtl_maker_nm, p.columnDtl_purc_id_typ, p.columnDtl_maker_cd, p.columnDtl_mfg_loc_wg_cd, p.columnDtl_mfg_loc_nm, p.columnDtl_bom_ptn, p.columnDtl_mfg_loc_cd, p.columnDtl_purc_basis_typ, p.columnDtl_purc_dlv_slip_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_stk_mng_typ, p.columnDtl_ver_flg, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_dec_place, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_itm_purc_upri_cng_flg, p.columnDtl_tax_cd, p.columnDtl_wtax_rate, p.columnDtl_itm_pay_crryovr_times, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_arr_skip_flg, p.columnDtl_maker_nm, p.columnDtl_purc_id_typ, p.columnDtl_maker_cd, p.columnDtl_mfg_loc_wg_cd, p.columnDtl_mfg_loc_nm, p.columnDtl_bom_ptn, p.columnDtl_mfg_loc_cd, p.columnDtl_purc_basis_typ, p.columnDtl_purc_dlv_slip_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_stk_mng_typ, p.columnDtl_ver_flg, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_dec_place, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_itm_purc_upri_cng_flg, p.columnDtl_tax_cd, p.columnDtl_wtax_rate, p.columnDtl_itm_pay_crryovr_times, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_arr_skip_flg, p.columnDtl_maker_nm, p.columnDtl_purc_id_typ, p.columnDtl_maker_cd, p.columnDtl_mfg_loc_wg_cd, p.columnDtl_mfg_loc_nm, p.columnDtl_bom_ptn, p.columnDtl_mfg_loc_cd, p.columnDtl_purc_basis_typ, p.columnDtl_purc_dlv_slip_flg);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.asset_mng_typ_META);
		p.columnDtl_asset_mng_typ.addLinkBeans(p.columnDtl_asset_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.DtlTable.addTable(p.Dtl_str_ln_p_PPanel.StrLnTable);
		p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnDtl_str_ln_nm);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_arr_skip_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.arr_skip_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_skip_flg);
		p.columnDtl_purc_dlv_slip_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_dlv_slip_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dlv_slip_flg);
		p.columnDtl_maker_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.maker_cd_META);
		p.columnDtl_maker_cd.addLinkBeans(p.columnDtl_maker_nm,p.columnDtl_purc_id_typ,p.columnDtl_purc_basis_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_cd);
		p.columnDtl_maker_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.maker_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_nm);
		p.columnDtl_rqst_avl_rqst_dt.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.rqst_avl_rqst_dt_META);
		p.columnDtl_rqst_avl_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_avl_rqst_dt);
		p.DtlTable.addTable(p.Dtl_rqst_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.columnDtl_purc_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_schd_dt_META);
		p.columnDtl_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_schd_dt);
		p.columnDtl_purc_basis_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_basis_typ_META);
		p.columnDtl_purc_basis_typ.addLinkBeans(p.columnDtl_purc_basis_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_basis_typ);
		p.columnDtl_purc_basis_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_basis_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_basis_typ_nm);
		p.columnDtl_sync_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sync_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sync_flg);
		p.columnDtl_itm_purc_upri_cng_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.itm_purc_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_purc_upri_cng_flg);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.columnDtl_itm_pay_crryovr_times.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.itm_pay_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_pay_crryovr_times);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_bp_lot_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bp_lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_lot_no);
		p.columnDtl_sppl_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sppl_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_itm_cd);
		p.columnDtl_sppl_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sppl_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_itm_nm);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.cst_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_ap_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.ap_dpt_cd_META);
		p.columnDtl_ap_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_ap_dpt_cd.addLinkBeans(p.columnDtl_ap_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_cd);
		p.columnDtl_ap_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.ap_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_nm);
		p.DtlTable.addTable(p.Dtl_dlv_p_PPanel.DlvTable);
		p.columnDtl_dlv_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dlv_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cal_cd);
		p.DtlTable.addTable(p.Dtl_tdlv_p_PPanel.DlvTable);
		p.columnDtl_purc_id_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_id_typ_META);
		p.columnDtl_purc_id_typ.addLinkBeans(p.columnDtl_purc_id_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_id_typ);
		p.columnDtl_purc_id_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_id_typ_nm);
		p.columnDtl_po_conf_rcpt_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.po_conf_rcpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_conf_rcpt_flg);
		p.columnDtl_po_conf_rcpt_dt.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.po_conf_rcpt_dt_META);
		p.columnDtl_po_conf_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_po_conf_rcpt_dt);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_rnd_typ,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_conv_qty);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_abort_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.abort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_abort_flg);
		p.columnDtl_bef_abort_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bef_abort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bef_abort_flg);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_inst_cont_qty_p_PPanel.ContQtyTable);
		p.columnDtl_cont_fctr_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.cont_fctr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_flg);
		p.columnDtl_cont_fctr_dec_place.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.cont_fctr_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_dec_place);
		p.columnDtl_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.cont_fctr_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_rnd_typ);
		p.DtlTable.addTable(p.Dtl_cont_unit_p_PPanel.ContFctrUnitTable);
		p.DtlTable.addTable(p.Dtl_std_cont_p_PPanel.StdContFctrTable);
		p.columnDtl_purc_sts_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_sts_typ_META);
		p.columnDtl_purc_sts_typ.addLinkBeans(p.columnDtl_purc_sts_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_sts_typ);
		p.columnDtl_purc_sts_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_sts_typ_nm);
		p.columnDtl_dlv_inst_qty.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dlv_inst_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_inst_qty);
		p.columnDtl_dlv_inst_prms_rcpt_qty.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dlv_inst_prms_rcpt_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_inst_prms_rcpt_qty);
		p.columnDtl_rcpt_iv_qty.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.rcpt_iv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcpt_iv_qty);
		p.columnDtl_arr_qty.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.arr_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_qty);
		p.columnDtl_purc_qty.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_qty);
		p.columnDtl_arr_schd_split_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.arr_schd_split_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_schd_split_flg);
		p.columnDtl_arr_cmpl_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.arr_cmpl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_cmpl_flg);
		p.columnDtl_purc_cmpl_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_cmpl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_cmpl_flg);
		p.columnDtl_pay_crryovr_times.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.pay_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_crryovr_times);
		p.columnDtl_purc_upri_req_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_upri_req_typ_META);
		p.columnDtl_purc_upri_req_typ.addLinkBeans(p.columnDtl_purc_upri_req_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_req_typ);
		p.columnDtl_purc_upri_req_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_upri_req_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_req_typ_nm);
		p.DtlTable.addTable(p.Dtl_trd_cur_upri_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_typ, p.columnDtl_tax_rate, p.columnDtl_inc_tax_flg);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setLinkBeans(p.columnDtl_dscnt_rsn_nm);
		p.columnDtl_repurc_obli_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.repurc_obli_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_repurc_obli_flg);
		p.DtlTable.addTable(p.Dtl_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl_old_trd_cur_upri.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.old_trd_cur_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_trd_cur_upri);
		p.columnDtl_old_trd_cur_proc_upri.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.old_trd_cur_proc_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_trd_cur_proc_upri);
		p.columnDtl_old_trd_cur_onr_prov_upri.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.old_trd_cur_onr_prov_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_trd_cur_onr_prov_upri);
		p.columnDtl_old_interim_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.old_interim_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_interim_flg);
		p.columnDtl_old_trd_cur_dscnt_amt.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.old_trd_cur_dscnt_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_trd_cur_dscnt_amt);
		p.columnDtl_old_dscnt_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.old_dscnt_rsn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_dscnt_rsn_cd);
		p.columnDtl_old_dscnt_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.old_dscnt_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_dscnt_rsn_nm);
		p.DtlTable.addTable(p.Dtl_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_proc_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_proc_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl_wtax_rate.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rate);
		p.DtlTable.addTable(p.Dtl_wtax_amt_p_PPanel.AmtTable);
		p.columnDtl_mfg_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.mfg_loc_cd_META);
		p.columnDtl_mfg_loc_cd.addLinkBeans(p.columnDtl_mfg_loc_nm,p.columnDtl_mfg_loc_wg_cd,p.columnDtl_purc_id_typ,p.columnDtl_purc_basis_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_cd);
		p.columnDtl_mfg_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.mfg_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_nm);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bom_ptn_META);
		p.columnDtl_bom_ptn.addLinkBeans(p.columnDtl_purc_id_typ,p.columnDtl_purc_basis_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_outsrc_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.outsrc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_flg);
		p.columnDtl_mfg_inst_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.mfg_inst_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_flg);
		p.columnDtl_outsrc_itm_ord_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.outsrc_itm_ord_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_itm_ord_no);
		p.columnDtl_purc_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_rsn_cd_META);
		p.columnDtl_purc_rsn_cd.addLinkBeans(p.columnDtl_purc_rsn_nm,p.columnDtl_xpns_purc_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_rsn_cd);
		p.columnDtl_purc_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_rsn_nm);
		p.columnDtl_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.xpns_purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xpns_purc_flg);
		p.columnDtl_not_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.not_xpns_purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_xpns_purc_flg);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.DtlTable.addTable(p.Dtl_bditm_p_PPanel.BdItemTable);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setLinkBeans(p.columnDtl_bd_dpt_nm);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd.setLinkBeans(p.columnDtl_bd_itm_sub1, p.columnDtl_bd_itm_sub2, p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setLinkBeans(p.columnDtl_bd_itm_sub2, p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setLinkBeans(p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setLinkBeans(p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.columnDtl_bd_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bd_lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_lot_mng_typ);
		p.columnDtl_bd_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bd_sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sublot_mng_typ);
		p.columnDtl_bd_lot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bd_lot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_lot_no_typ);
		p.columnDtl_bd_sublot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bd_sublot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sublot_no_typ);
		p.columnDtl_bd_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bd_sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno1_mng_typ);
		p.columnDtl_bd_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bd_sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno2_mng_typ);
		p.columnDtl_bd_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bd_sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno3_mng_typ);
		p.columnDtl_bd_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bd_sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno4_mng_typ);
		p.columnDtl_rqst_can_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.rqst_can_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_can_flg);
		p.columnDtl_po_cnt_rmrks.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.po_cnt_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_cnt_rmrks);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_po_print_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.po_print_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_print_d_rmrks);
		p.columnDtl_dlv_slip_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dlv_slip_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_d_rmrks);
		p.columnDtl_arr_cnt_rmrks.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.arr_cnt_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_cnt_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_edi_sub_d_char1.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.edi_sub_d_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_edi_sub_d_char1);
		p.columnDtl_edi_sub_d_char2.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.edi_sub_d_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_edi_sub_d_char2);
		p.columnDtl_edi_sub_d_char3.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.edi_sub_d_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_edi_sub_d_char3);
		p.columnDtl_edi_sub_d_char4.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.edi_sub_d_char4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_edi_sub_d_char4);
		p.columnDtl_edi_sub_d_char5.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.edi_sub_d_char5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_edi_sub_d_char5);
		p.columnDtl_edi_sub_d_num1.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.edi_sub_d_num1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_edi_sub_d_num1);
		p.columnDtl_edi_sub_d_dt1.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.edi_sub_d_dt1_META);
		p.columnDtl_edi_sub_d_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_edi_sub_d_dt1);
		p.columnDtl_ext_po_d_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.ext_po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_po_d_no);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.columnDtl_dlv_slip_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_no);
		p.columnDtl_dlv_slip_seq.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dlv_slip_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_seq);
		p.columnDtl_dlv_slip_invalid_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dlv_slip_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_invalid_flg);
		p.columnDtl_purc_ddlv_dlv_slip_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_ddlv_dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_dlv_slip_no);
		p.columnDtl_dlv_slip_mng_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dlv_slip_mng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_mng_no);
		p.columnDtl_dlv_slip_mng_seq.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.dlv_slip_mng_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_mng_seq);
		p.columnDtl_po_schd_src_typ.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.po_schd_src_typ_META);
		p.columnDtl_po_schd_src_typ.addLinkBeans(p.columnDtl_po_schd_src_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_src_typ);
		p.columnDtl_po_schd_src_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.po_schd_src_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_src_typ_nm);
		p.columnDtl_po_schd_src_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.po_schd_src_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_src_no);
		p.columnDtl_rqst_fr_usr_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.rqst_fr_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_fr_usr_cd);
		p.columnDtl_rqst_fr_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.rqst_fr_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_fr_usr_nm);
		p.columnDtl_rqst_fr_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.rqst_fr_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_fr_dpt_cd);
		p.columnDtl_rqst_fr_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.rqst_fr_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_fr_dpt_nm);
		p.columnDtl_bndl_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.bndl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bndl_flg);
		p.columnDtl_rqst_slo_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.rqst_slo_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_slo_flg);
		p.columnDtl_po_schd_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.po_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_no);
		p.columnDtl_po_d_no.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_d_no);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_arr_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.arr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_flg);
		p.columnDtl_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_flg);
		p.columnDtl_rcpt_iv_flg.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.rcpt_iv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcpt_iv_flg);
		p.columnDtl_mfg_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0080.DtlR.mfg_loc_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_wg_cd);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MSBDP_PoReg p) {
		p.columnDtl2_dtl_peg_no.setMeta(mcframe.clientMSBD.MSBDP0080.Dtl2R.dtl_peg_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_dtl_peg_no);
		p.columnDtl2_po_schd_no.setMeta(mcframe.clientMSBD.MSBDP0080.Dtl2R.po_schd_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_po_schd_no);
		p.columnDtl2_po_d_no.setMeta(mcframe.clientMSBD.MSBDP0080.Dtl2R.po_d_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_po_d_no);
		p.columnDtl2_can_flg.setMeta(mcframe.clientMSBD.MSBDP0080.Dtl2R.can_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_can_flg);
		p.columnDtl2_po_schd_upd_cntr.setMeta(mcframe.clientMSBD.MSBDP0080.Dtl2R.po_schd_upd_cntr_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_po_schd_upd_cntr);
		p.columnDtl2_arr_pr_upd_cntr.setMeta(mcframe.clientMSBD.MSBDP0080.Dtl2R.arr_pr_upd_cntr_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_arr_pr_upd_cntr);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cd.getListConfig().setPutter(getHdr_trd_cd_ListPutter());
		Hdr_sppl_cd.getListConfig().setPutter(getHdr_sppl_cd_ListPutter());
		Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cur_cd.getListConfig().setPutter(getHdr_trd_cur_cd_ListPutter());
		Hdr_base_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_base_cur_cd.getListConfig().setPutter(getHdr_base_cur_cd_ListPutter());
		Hdr_po_print_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_po_print_cd.getListConfig().setPutter(getHdr_po_print_cd_ListPutter());
		Hdr_po_crct_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_po_crct_rsn_cd.getListConfig().setPutter(getHdr_po_crct_rsn_cd_ListPutter());
		Hdr_tterm_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd1.getListConfig().setPutter(getHdr_tterm_cd1_ListPutter());
		Hdr_tterm_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd2.getListConfig().setPutter(getHdr_tterm_cd2_ListPutter());
		Hdr_tterm_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd3.getListConfig().setPutter(getHdr_tterm_cd3_ListPutter());
		Hdr_asppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_asppl_cd.getListConfig().setPutter(getHdr_asppl_cd_ListPutter());
		columnDtl_in_to_loc_cd.getListConfig().setPutter(getDtl_in_to_loc_cd_ListPutter());
		columnDtl_drct_dlv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_drct_dlv_typ.getListConfig().setPutter(getDtl_drct_dlv_typ_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_asset_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_asset_mng_typ.getListConfig().setPutter(getDtl_asset_mng_typ_ListPutter());
		Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnDtl_maker_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_maker_cd.getListConfig().setPutter(getDtl_maker_cd_ListPutter());
		columnDtl_purc_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_basis_typ.getListConfig().setPutter(getDtl_purc_basis_typ_ListPutter());
		columnDtl_ap_dpt_cd.getListConfig().setPutter(getDtl_ap_dpt_cd_ListPutter());
		columnDtl_purc_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_id_typ.getListConfig().setPutter(getDtl_purc_id_typ_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		columnDtl_purc_upri_req_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_upri_req_typ.getListConfig().setPutter(getDtl_purc_upri_req_typ_ListPutter());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter());
		columnDtl_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mfg_loc_cd.getListConfig().setPutter(getDtl_mfg_loc_cd_ListPutter());
		columnDtl_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bom_ptn.getListConfig().setPutter(getDtl_bom_ptn_ListPutter());
		columnDtl_purc_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_rsn_cd.getListConfig().setPutter(getDtl_purc_rsn_cd_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter());
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
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_NEXT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_NEXTStatus() {
		status = UPD_NEXT;
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
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_APRV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_APRVStatus() {
		status = DEL_APRV;
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
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
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
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_NEXT.equals(status)) {
			setUPD_NEXTStatus();
		}
		else if (UPD_APRV.equals(status)) {
			setUPD_APRVStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (DEL_APRV.equals(status)) {
			setDEL_APRVStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
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
	 * [Hdr_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Hdr_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Hdr_po_print_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_po_print_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PoPrint");
		return lp;
	}
	 
	/**
	 * [Hdr_po_crct_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_po_crct_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0050.PoCrctRsn");
		return lp;
	}
	 
	/**
	 * [Hdr_tterm_cd1_ListPutter]の作成
	 */
	protected MCListPutter createHdr_tterm_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Hdr_tterm_cd2_ListPutter]の作成
	 */
	protected MCListPutter createHdr_tterm_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Hdr_tterm_cd3_ListPutter]の作成
	 */
	protected MCListPutter createHdr_tterm_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Hdr_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_in_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_in_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_drct_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_drct_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DrctDlvTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlWithSpplMaker");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSub1WithSpplMaker");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSub2WithSpplMaker");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSub3WithSpplMaker");
		return lp;
	}

	/**
	 * [Dtl_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Dtl_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMaker");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcBasisTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcIdTyp");
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
	 * [Dtl_purc_upri_req_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_upri_req_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcUpriReqTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}

	/**
	 * [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcDscntBizRsn");
		return lp;
	}

	/**
	 * [Dtl_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [Dtl_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlBomPtn");
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
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_trd_cd) return getHdr_trd_cd(row, info);
		if(combo == Hdr_sppl_cd) return getHdr_sppl_cd(row, info);
		if(combo == Hdr_purc_usr_dpt_p_PPanel.UsrDpt_usr_cd) return getHdr_purc_usr_dpt_p_PPanel_UsrDpt_usr_cd(row, info);
		if(combo == Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_trd_cur_cd) return getHdr_trd_cur_cd(row, info);
		if(combo == Hdr_base_cur_cd) return getHdr_base_cur_cd(row, info);
		if(combo == Hdr_po_print_cd) return getHdr_po_print_cd(row, info);
		if(combo == Hdr_po_crct_rsn_cd) return getHdr_po_crct_rsn_cd(row, info);
		if(combo == Hdr_tterm_cd1) return getHdr_tterm_cd1(row, info);
		if(combo == Hdr_tterm_cd2) return getHdr_tterm_cd2(row, info);
		if(combo == Hdr_tterm_cd3) return getHdr_tterm_cd3(row, info);
		if(combo == Hdr_asppl_cd) return getHdr_asppl_cd(row, info);
		if(combo == columnDtl_in_to_loc_cd) return getDtl_in_to_loc_cd(row, info);
		if(combo == columnDtl_drct_dlv_typ) return getDtl_drct_dlv_typ(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_asset_mng_typ) return getDtl_asset_mng_typ(row, info);
		if(combo == Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == columnDtl_maker_cd) return getDtl_maker_cd(row, info);
		if(combo == columnDtl_purc_basis_typ) return getDtl_purc_basis_typ(row, info);
		if(combo == Dtl_ver_no_p_PPanel.columnVerNo_ver_no) return getDtl_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
		if(combo == columnDtl_ap_dpt_cd) return getDtl_ap_dpt_cd(row, info);
		if(combo == columnDtl_purc_id_typ) return getDtl_purc_id_typ(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == columnDtl_purc_upri_req_typ) return getDtl_purc_upri_req_typ(row, info);
		if(combo == Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd) return getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(row, info);
		if(combo == columnDtl_mfg_loc_cd) return getDtl_mfg_loc_cd(row, info);
		if(combo == columnDtl_bom_ptn) return getDtl_bom_ptn(row, info);
		if(combo == columnDtl_purc_rsn_cd) return getDtl_purc_rsn_cd(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd) return getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd) return getDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1) return getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2) return getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3) return getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_po) doCnd_srch_po(info);
		else if (ap == Cnd_srch_po_schd) doCnd_srch_po_schd(info);
		else if (ap == Btn_open_MSBDP0120) doBtn_open_MSBDP0120(info);
		else if (ap == Btn_open_MSBDP0250) doBtn_open_MSBDP0250(info);
		else if (ap == Btn_bndl_schd) doBtn_bndl_schd(info);
		else if (ap == Btn_srch_upri) doBtn_srch_upri(info);
		else if (ap == Btn_srch_dlv) doBtn_srch_dlv(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch_po]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_po(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_po_schd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_po_schd(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBDP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0120(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBDP0250]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0250(MCEventInfo info);

	/**
	 * [Btn]パネルの[bndl_schd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_bndl_schd(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch_upri]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch_upri(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch_dlv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch_dlv(MCEventInfo info);

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
		if (vc == Cnd2Table) return doCnd2_VC(info);
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Dtl2Table) return doDtl2_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_rev_no) return doCnd_rev_no_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == columnCnd2_po_schd_no) return doCnd2_po_schd_no_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_po_no) return doHdr_po_no_VC(info);
		if (vc == Hdr_po_rev) return doHdr_po_rev_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_po_print_dt) return doHdr_po_print_dt_VC(info);
		if (vc == Hdr_po_print_flg) return doHdr_po_print_flg_VC(info);
		if (vc == Hdr_dlv_print_flg) return doHdr_dlv_print_flg_VC(info);
		if (vc == Hdr_purc_ddlv_dlv_print_flg) return doHdr_purc_ddlv_dlv_print_flg_VC(info);
		if (vc == Hdr_aprv_rvrs_flg) return doHdr_aprv_rvrs_flg_VC(info);
		if (vc == Hdr_aprv_flg) return doHdr_aprv_flg_VC(info);
		if (vc == Hdr_aprv_no) return doHdr_aprv_no_VC(info);
		if (vc == Hdr_aprv_sts_typ) return doHdr_aprv_sts_typ_VC(info);
		if (vc == Hdr_aprv_sts_typ_nm) return doHdr_aprv_sts_typ_nm_VC(info);
		if (vc == Hdr_aprv_upd_flg) return doHdr_aprv_upd_flg_VC(info);
		if (vc == Hdr_aprv_can_flg) return doHdr_aprv_can_flg_VC(info);
		if (vc == Hdr_po_dt) return doHdr_po_dt_VC(info);
		if (vc == Hdr_sppl_cd) return doHdr_sppl_cd_VC(info);
		if (vc == Hdr_sppl_nm) return doHdr_sppl_nm_VC(info);
		if (vc == Hdr_purc_amt_rnd_typ) return doHdr_purc_amt_rnd_typ_VC(info);
		if (vc == Hdr_purc_tax_rnd_typ) return doHdr_purc_tax_rnd_typ_VC(info);
		if (vc == Hdr_sppl_cal_cd) return doHdr_sppl_cal_cd_VC(info);
		if (vc == Hdr_sppl_purc_upri_cng_flg) return doHdr_sppl_purc_upri_cng_flg_VC(info);
		if (vc == Hdr_prnt_lcl_cd) return doHdr_prnt_lcl_cd_VC(info);
		if (vc == Hdr_sppl_ship_form_cd) return doHdr_sppl_ship_form_cd_VC(info);
		if (vc == Hdr_po_dlv_slip_flg) return doHdr_po_dlv_slip_flg_VC(info);
		if (vc == Hdr_ap_dpt_cd) return doHdr_ap_dpt_cd_VC(info);
		if (vc == Hdr_mst_ap_dpt_cd) return doHdr_mst_ap_dpt_cd_VC(info);
		if (vc == Hdr_purc_upri_req_typ) return doHdr_purc_upri_req_typ_VC(info);
		if (vc == Hdr_sppl_pay_crryovr_times) return doHdr_sppl_pay_crryovr_times_VC(info);
		if (vc == Hdr_subcon_flg) return doHdr_subcon_flg_VC(info);
		if (vc == Hdr_repurc_obli_flg) return doHdr_repurc_obli_flg_VC(info);
		if (vc == Hdr_outsrc_upri_typ) return doHdr_outsrc_upri_typ_VC(info);
		if (vc == Hdr_sppl_iv_flg) return doHdr_sppl_iv_flg_VC(info);
		if (vc == Hdr_edi_flg) return doHdr_edi_flg_VC(info);
		if (vc == Hdr_last_edi_flg) return doHdr_last_edi_flg_VC(info);
		if (vc == Hdr_edi_tgt_flg) return doHdr_edi_tgt_flg_VC(info);
		if (vc == Hdr_def_purc_usr_cd) return doHdr_def_purc_usr_cd_VC(info);
		if (vc == Hdr_def_purc_dpt_cd) return doHdr_def_purc_dpt_cd_VC(info);
		if (vc == Hdr_ap_dpt_flg) return doHdr_ap_dpt_flg_VC(info);
		if (vc == Hdr_purc_dpt_wg_cd) return doHdr_purc_dpt_wg_cd_VC(info);
		if (vc == Hdr_purc_dpt_wg_nm) return doHdr_purc_dpt_wg_nm_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_trd_cur_amt_dec_place) return doHdr_trd_cur_amt_dec_place_VC(info);
		if (vc == Hdr_trd_cur_upri_dec_place) return doHdr_trd_cur_upri_dec_place_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_base_cur_amt_dec_place) return doHdr_base_cur_amt_dec_place_VC(info);
		if (vc == Hdr_base_cur_upri_dec_place) return doHdr_base_cur_upri_dec_place_VC(info);
		if (vc == Hdr_xrate_inpt_flg) return doHdr_xrate_inpt_flg_VC(info);
		if (vc == Hdr_ptax_cur_cd) return doHdr_ptax_cur_cd_VC(info);
		if (vc == Hdr_ptax_cur_nm) return doHdr_ptax_cur_nm_VC(info);
		if (vc == Hdr_ptax_cur_amt_dec_place) return doHdr_ptax_cur_amt_dec_place_VC(info);
		if (vc == Hdr_ptax_cur_upri_dec_place) return doHdr_ptax_cur_upri_dec_place_VC(info);
		if (vc == Hdr_ptax_xrate_inpt_flg) return doHdr_ptax_xrate_inpt_flg_VC(info);
		if (vc == Hdr_purc_xrate_cd) return doHdr_purc_xrate_cd_VC(info);
		if (vc == Hdr_wtax_rnd_typ) return doHdr_wtax_rnd_typ_VC(info);
		if (vc == Hdr_trd_rmrks) return doHdr_trd_rmrks_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_po_print_rmrks) return doHdr_po_print_rmrks_VC(info);
		if (vc == Hdr_dlv_slip_rmrks) return doHdr_dlv_slip_rmrks_VC(info);
		if (vc == Hdr_po_print_cd) return doHdr_po_print_cd_VC(info);
		if (vc == Hdr_po_print_nm) return doHdr_po_print_nm_VC(info);
		if (vc == Hdr_upd_po_print_schd_dt) return doHdr_upd_po_print_schd_dt_VC(info);
		if (vc == Hdr_po_crct_rsn_cd) return doHdr_po_crct_rsn_cd_VC(info);
		if (vc == Hdr_po_crct_rsn_nm) return doHdr_po_crct_rsn_nm_VC(info);
		if (vc == Hdr_po_crct_rsn_rmrks) return doHdr_po_crct_rsn_rmrks_VC(info);
		if (vc == Hdr_tterm_cd1) return doHdr_tterm_cd1_VC(info);
		if (vc == Hdr_tterm_nm1) return doHdr_tterm_nm1_VC(info);
		if (vc == Hdr_tterm_rmrks1) return doHdr_tterm_rmrks1_VC(info);
		if (vc == Hdr_tterm_cd2) return doHdr_tterm_cd2_VC(info);
		if (vc == Hdr_tterm_nm2) return doHdr_tterm_nm2_VC(info);
		if (vc == Hdr_tterm_rmrks2) return doHdr_tterm_rmrks2_VC(info);
		if (vc == Hdr_tterm_cd3) return doHdr_tterm_cd3_VC(info);
		if (vc == Hdr_tterm_nm3) return doHdr_tterm_nm3_VC(info);
		if (vc == Hdr_tterm_rmrks3) return doHdr_tterm_rmrks3_VC(info);
		if (vc == Hdr_asppl_cd) return doHdr_asppl_cd_VC(info);
		if (vc == Hdr_asppl_nm) return doHdr_asppl_nm_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_edi_sub_char1) return doHdr_edi_sub_char1_VC(info);
		if (vc == Hdr_edi_sub_char2) return doHdr_edi_sub_char2_VC(info);
		if (vc == Hdr_edi_sub_char3) return doHdr_edi_sub_char3_VC(info);
		if (vc == Hdr_edi_sub_char4) return doHdr_edi_sub_char4_VC(info);
		if (vc == Hdr_edi_sub_char5) return doHdr_edi_sub_char5_VC(info);
		if (vc == Hdr_edi_sub_num1) return doHdr_edi_sub_num1_VC(info);
		if (vc == Hdr_edi_sub_dt1) return doHdr_edi_sub_dt1_VC(info);
		if (vc == Hdr_purc_if_flg) return doHdr_purc_if_flg_VC(info);
		if (vc == Hdr_ext_sys_cd) return doHdr_ext_sys_cd_VC(info);
		if (vc == Hdr_ext_sys_nm) return doHdr_ext_sys_nm_VC(info);
		if (vc == Hdr_ext_po_no) return doHdr_ext_po_no_VC(info);
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
		if (vc == Hdr_po_upd_cntr) return doHdr_po_upd_cntr_VC(info);
		if (vc == Hdr_next_opr_flg) return doHdr_next_opr_flg_VC(info);
		if (vc == Hdr_po_schd_no) return doHdr_po_schd_no_VC(info);
		if (vc == Hdr_prnt_po_flg) return doHdr_prnt_po_flg_VC(info);
		if (vc == Hdr_prnt_dlv_flg) return doHdr_prnt_dlv_flg_VC(info);
		if (vc == Hdr_prnt_purc_ddlv_dlv_flg) return doHdr_prnt_purc_ddlv_dlv_flg_VC(info);
		if (vc == Hdr_indiv_prnt_flg) return doHdr_indiv_prnt_flg_VC(info);
		if (vc == BulkSet_rqst_avl_rqst_dt) return doBulkSet_rqst_avl_rqst_dt_VC(info);
		if (vc == BulkSet_amt) return doBulkSet_amt_VC(info);
		if (vc == BulkSet_inc_tax_amt) return doBulkSet_inc_tax_amt_VC(info);
		if (vc == columnDtl_dtl_peg_no) return doDtl_dtl_peg_no_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_in_to_loc_cd) return doDtl_in_to_loc_cd_VC(info);
		if (vc == columnDtl_in_to_loc_nm) return doDtl_in_to_loc_nm_VC(info);
		if (vc == columnDtl_in_to_loc_wg_cd) return doDtl_in_to_loc_wg_cd_VC(info);
		if (vc == columnDtl_in_to_loc_wg_nm) return doDtl_in_to_loc_wg_nm_VC(info);
		if (vc == columnDtl_pri_prnt_flg) return doDtl_pri_prnt_flg_VC(info);
		if (vc == columnDtl_drct_dlv_typ) return doDtl_drct_dlv_typ_VC(info);
		if (vc == columnDtl_drct_dlv_typ_nm) return doDtl_drct_dlv_typ_nm_VC(info);
		if (vc == columnDtl_outsrc_sppl_cd) return doDtl_outsrc_sppl_cd_VC(info);
		if (vc == columnDtl_str_ln_tgt_flg) return doDtl_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_loc_mng_typ) return doDtl_loc_mng_typ_VC(info);
		if (vc == columnDtl_in_to_loc_cal_cd) return doDtl_in_to_loc_cal_cd_VC(info);
		if (vc == columnDtl_site_cd) return doDtl_site_cd_VC(info);
		if (vc == columnDtl_lg_grp_cd) return doDtl_lg_grp_cd_VC(info);
		if (vc == columnDtl_loc_grp_cd) return doDtl_loc_grp_cd_VC(info);
		if (vc == columnDtl_bef_in_to_loc_wg_cd) return doDtl_bef_in_to_loc_wg_cd_VC(info);
		if (vc == columnDtl_bef_lg_grp_cd) return doDtl_bef_lg_grp_cd_VC(info);
		if (vc == columnDtl_bef_loc_grp_cd) return doDtl_bef_loc_grp_cd_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_arr_skip_flg) return doDtl_arr_skip_flg_VC(info);
		if (vc == columnDtl_purc_dlv_slip_flg) return doDtl_purc_dlv_slip_flg_VC(info);
		if (vc == columnDtl_maker_cd) return doDtl_maker_cd_VC(info);
		if (vc == columnDtl_maker_nm) return doDtl_maker_nm_VC(info);
		if (vc == columnDtl_rqst_avl_rqst_dt) return doDtl_rqst_avl_rqst_dt_VC(info);
		if (vc == columnDtl_purc_schd_dt) return doDtl_purc_schd_dt_VC(info);
		if (vc == columnDtl_purc_basis_typ) return doDtl_purc_basis_typ_VC(info);
		if (vc == columnDtl_purc_basis_typ_nm) return doDtl_purc_basis_typ_nm_VC(info);
		if (vc == columnDtl_sync_flg) return doDtl_sync_flg_VC(info);
		if (vc == columnDtl_itm_purc_upri_cng_flg) return doDtl_itm_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_itm_pay_crryovr_times) return doDtl_itm_pay_crryovr_times_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_bp_lot_no) return doDtl_bp_lot_no_VC(info);
		if (vc == columnDtl_sppl_itm_cd) return doDtl_sppl_itm_cd_VC(info);
		if (vc == columnDtl_sppl_itm_nm) return doDtl_sppl_itm_nm_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_ap_dpt_cd) return doDtl_ap_dpt_cd_VC(info);
		if (vc == columnDtl_ap_dpt_nm) return doDtl_ap_dpt_nm_VC(info);
		if (vc == columnDtl_dlv_cal_cd) return doDtl_dlv_cal_cd_VC(info);
		if (vc == columnDtl_purc_id_typ) return doDtl_purc_id_typ_VC(info);
		if (vc == columnDtl_purc_id_typ_nm) return doDtl_purc_id_typ_nm_VC(info);
		if (vc == columnDtl_po_conf_rcpt_flg) return doDtl_po_conf_rcpt_flg_VC(info);
		if (vc == columnDtl_po_conf_rcpt_dt) return doDtl_po_conf_rcpt_dt_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_rnd_typ) return doDtl_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_abort_flg) return doDtl_abort_flg_VC(info);
		if (vc == columnDtl_bef_abort_flg) return doDtl_bef_abort_flg_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_cont_fctr_flg) return doDtl_cont_fctr_flg_VC(info);
		if (vc == columnDtl_cont_fctr_dec_place) return doDtl_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl_cont_fctr_rnd_typ) return doDtl_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl_purc_sts_typ) return doDtl_purc_sts_typ_VC(info);
		if (vc == columnDtl_purc_sts_typ_nm) return doDtl_purc_sts_typ_nm_VC(info);
		if (vc == columnDtl_dlv_inst_qty) return doDtl_dlv_inst_qty_VC(info);
		if (vc == columnDtl_dlv_inst_prms_rcpt_qty) return doDtl_dlv_inst_prms_rcpt_qty_VC(info);
		if (vc == columnDtl_rcpt_iv_qty) return doDtl_rcpt_iv_qty_VC(info);
		if (vc == columnDtl_arr_qty) return doDtl_arr_qty_VC(info);
		if (vc == columnDtl_purc_qty) return doDtl_purc_qty_VC(info);
		if (vc == columnDtl_arr_schd_split_flg) return doDtl_arr_schd_split_flg_VC(info);
		if (vc == columnDtl_arr_cmpl_flg) return doDtl_arr_cmpl_flg_VC(info);
		if (vc == columnDtl_purc_cmpl_flg) return doDtl_purc_cmpl_flg_VC(info);
		if (vc == columnDtl_pay_crryovr_times) return doDtl_pay_crryovr_times_VC(info);
		if (vc == columnDtl_purc_upri_req_typ) return doDtl_purc_upri_req_typ_VC(info);
		if (vc == columnDtl_purc_upri_req_typ_nm) return doDtl_purc_upri_req_typ_nm_VC(info);
		if (vc == columnDtl_repurc_obli_flg) return doDtl_repurc_obli_flg_VC(info);
		if (vc == columnDtl_old_trd_cur_upri) return doDtl_old_trd_cur_upri_VC(info);
		if (vc == columnDtl_old_trd_cur_proc_upri) return doDtl_old_trd_cur_proc_upri_VC(info);
		if (vc == columnDtl_old_trd_cur_onr_prov_upri) return doDtl_old_trd_cur_onr_prov_upri_VC(info);
		if (vc == columnDtl_old_interim_flg) return doDtl_old_interim_flg_VC(info);
		if (vc == columnDtl_old_trd_cur_dscnt_amt) return doDtl_old_trd_cur_dscnt_amt_VC(info);
		if (vc == columnDtl_old_dscnt_rsn_cd) return doDtl_old_dscnt_rsn_cd_VC(info);
		if (vc == columnDtl_old_dscnt_rsn_nm) return doDtl_old_dscnt_rsn_nm_VC(info);
		if (vc == columnDtl_wtax_rate) return doDtl_wtax_rate_VC(info);
		if (vc == columnDtl_mfg_loc_cd) return doDtl_mfg_loc_cd_VC(info);
		if (vc == columnDtl_mfg_loc_nm) return doDtl_mfg_loc_nm_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_outsrc_flg) return doDtl_outsrc_flg_VC(info);
		if (vc == columnDtl_mfg_inst_flg) return doDtl_mfg_inst_flg_VC(info);
		if (vc == columnDtl_outsrc_itm_ord_no) return doDtl_outsrc_itm_ord_no_VC(info);
		if (vc == columnDtl_purc_rsn_cd) return doDtl_purc_rsn_cd_VC(info);
		if (vc == columnDtl_purc_rsn_nm) return doDtl_purc_rsn_nm_VC(info);
		if (vc == columnDtl_xpns_purc_flg) return doDtl_xpns_purc_flg_VC(info);
		if (vc == columnDtl_not_xpns_purc_flg) return doDtl_not_xpns_purc_flg_VC(info);
		if (vc == columnDtl_bd_lot_mng_typ) return doDtl_bd_lot_mng_typ_VC(info);
		if (vc == columnDtl_bd_sublot_mng_typ) return doDtl_bd_sublot_mng_typ_VC(info);
		if (vc == columnDtl_bd_lot_no_typ) return doDtl_bd_lot_no_typ_VC(info);
		if (vc == columnDtl_bd_sublot_no_typ) return doDtl_bd_sublot_no_typ_VC(info);
		if (vc == columnDtl_bd_sno1_mng_typ) return doDtl_bd_sno1_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno2_mng_typ) return doDtl_bd_sno2_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno3_mng_typ) return doDtl_bd_sno3_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno4_mng_typ) return doDtl_bd_sno4_mng_typ_VC(info);
		if (vc == columnDtl_rqst_can_flg) return doDtl_rqst_can_flg_VC(info);
		if (vc == columnDtl_po_cnt_rmrks) return doDtl_po_cnt_rmrks_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_po_print_d_rmrks) return doDtl_po_print_d_rmrks_VC(info);
		if (vc == columnDtl_dlv_slip_d_rmrks) return doDtl_dlv_slip_d_rmrks_VC(info);
		if (vc == columnDtl_arr_cnt_rmrks) return doDtl_arr_cnt_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_edi_sub_d_char1) return doDtl_edi_sub_d_char1_VC(info);
		if (vc == columnDtl_edi_sub_d_char2) return doDtl_edi_sub_d_char2_VC(info);
		if (vc == columnDtl_edi_sub_d_char3) return doDtl_edi_sub_d_char3_VC(info);
		if (vc == columnDtl_edi_sub_d_char4) return doDtl_edi_sub_d_char4_VC(info);
		if (vc == columnDtl_edi_sub_d_char5) return doDtl_edi_sub_d_char5_VC(info);
		if (vc == columnDtl_edi_sub_d_num1) return doDtl_edi_sub_d_num1_VC(info);
		if (vc == columnDtl_edi_sub_d_dt1) return doDtl_edi_sub_d_dt1_VC(info);
		if (vc == columnDtl_ext_po_d_no) return doDtl_ext_po_d_no_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_dlv_slip_no) return doDtl_dlv_slip_no_VC(info);
		if (vc == columnDtl_dlv_slip_seq) return doDtl_dlv_slip_seq_VC(info);
		if (vc == columnDtl_dlv_slip_invalid_flg) return doDtl_dlv_slip_invalid_flg_VC(info);
		if (vc == columnDtl_purc_ddlv_dlv_slip_no) return doDtl_purc_ddlv_dlv_slip_no_VC(info);
		if (vc == columnDtl_dlv_slip_mng_no) return doDtl_dlv_slip_mng_no_VC(info);
		if (vc == columnDtl_dlv_slip_mng_seq) return doDtl_dlv_slip_mng_seq_VC(info);
		if (vc == columnDtl_po_schd_src_typ) return doDtl_po_schd_src_typ_VC(info);
		if (vc == columnDtl_po_schd_src_typ_nm) return doDtl_po_schd_src_typ_nm_VC(info);
		if (vc == columnDtl_po_schd_src_no) return doDtl_po_schd_src_no_VC(info);
		if (vc == columnDtl_rqst_fr_usr_cd) return doDtl_rqst_fr_usr_cd_VC(info);
		if (vc == columnDtl_rqst_fr_usr_nm) return doDtl_rqst_fr_usr_nm_VC(info);
		if (vc == columnDtl_rqst_fr_dpt_cd) return doDtl_rqst_fr_dpt_cd_VC(info);
		if (vc == columnDtl_rqst_fr_dpt_nm) return doDtl_rqst_fr_dpt_nm_VC(info);
		if (vc == columnDtl_bndl_flg) return doDtl_bndl_flg_VC(info);
		if (vc == columnDtl_rqst_slo_flg) return doDtl_rqst_slo_flg_VC(info);
		if (vc == columnDtl_po_schd_no) return doDtl_po_schd_no_VC(info);
		if (vc == columnDtl_po_d_no) return doDtl_po_d_no_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_arr_flg) return doDtl_arr_flg_VC(info);
		if (vc == columnDtl_purc_flg) return doDtl_purc_flg_VC(info);
		if (vc == columnDtl_rcpt_iv_flg) return doDtl_rcpt_iv_flg_VC(info);
		if (vc == columnDtl_mfg_loc_wg_cd) return doDtl_mfg_loc_wg_cd_VC(info);
		if (vc == columnDtl2_dtl_peg_no) return doDtl2_dtl_peg_no_VC(info);
		if (vc == columnDtl2_po_schd_no) return doDtl2_po_schd_no_VC(info);
		if (vc == columnDtl2_po_d_no) return doDtl2_po_d_no_VC(info);
		if (vc == columnDtl2_can_flg) return doDtl2_can_flg_VC(info);
		if (vc == columnDtl2_po_schd_upd_cntr) return doDtl2_po_schd_upd_cntr_VC(info);
		if (vc == columnDtl2_arr_pr_upd_cntr) return doDtl2_arr_pr_upd_cntr_VC(info);
		return true;
	}

	/**
	 * [Cnd2]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd2_VC(MCEventInfo info){
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
	 * [Dtl2]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rev_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rev_no_VC(MCEventInfo info){
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
	 * [Cnd2]パネルの[po_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd2_po_schd_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_rev_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_print_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_print_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_print_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_print_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_print_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_print_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_ddlv_dlv_print_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_ddlv_dlv_print_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_rvrs_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_rvrs_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sppl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sppl_purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_purc_upri_cng_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_ship_form_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_ship_form_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_dlv_slip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_dlv_slip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[mst_ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_mst_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_upri_req_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_upri_req_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_pay_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_subcon_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sppl_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_iv_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[last_edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_last_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edi_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[def_purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_def_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[def_purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_def_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_dpt_wg_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ptax_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[wtax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wtax_rnd_typ_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_slip_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_slip_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_print_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_print_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_print_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_print_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_po_print_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_po_print_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_crct_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_crct_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_crct_rsn_rmrks_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_asppl_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[edi_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edi_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edi_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edi_sub_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_sub_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edi_sub_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_sub_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edi_sub_num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_sub_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[edi_sub_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_edi_sub_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_if_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_if_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ext_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_po_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[next_opr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_next_opr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prnt_po_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prnt_po_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prnt_dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prnt_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prnt_purc_ddlv_dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prnt_purc_ddlv_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[indiv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_indiv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rqst_avl_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rqst_avl_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[inc_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_inc_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_peg_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[in_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pri_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_drct_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_drct_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_cal_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_grp_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bef_in_to_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bef_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bef_loc_grp_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sundry_itm_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_skip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_skip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dlv_slip_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_avl_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_basis_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_purc_upri_cng_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_pay_crryovr_times_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_itm_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_conf_rcpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_conf_rcpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_conf_rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_conf_rcpt_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bef_abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bef_abort_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_dec_place_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_inst_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_inst_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_inst_prms_rcpt_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_inst_prms_rcpt_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcpt_iv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_schd_split_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_schd_split_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upri_req_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upri_req_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_trd_cur_proc_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_trd_cur_onr_prov_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_trd_cur_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_dscnt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_dscnt_rsn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[outsrc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_itm_ord_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_d_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_slip_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[edi_sub_d_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_edi_sub_d_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_edi_sub_d_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_edi_sub_d_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_edi_sub_d_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_edi_sub_d_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_edi_sub_d_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_edi_sub_d_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_po_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_mng_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_fr_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_fr_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_fr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_fr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bndl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bndl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcpt_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_dtl_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_po_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_po_schd_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[arr_pr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_arr_pr_upd_cntr_VC(MCEventInfo info){
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
		if (nc == Cnd2Table) doCnd2_NC(info);
		else if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Dtl2Table) doDtl2_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_rev_no) doCnd_rev_no_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == columnCnd2_po_schd_no) doCnd2_po_schd_no_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_po_no) doHdr_po_no_NC(info);
		else if (nc == Hdr_po_rev) doHdr_po_rev_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_po_print_dt) doHdr_po_print_dt_NC(info);
		else if (nc == Hdr_po_print_flg) doHdr_po_print_flg_NC(info);
		else if (nc == Hdr_dlv_print_flg) doHdr_dlv_print_flg_NC(info);
		else if (nc == Hdr_purc_ddlv_dlv_print_flg) doHdr_purc_ddlv_dlv_print_flg_NC(info);
		else if (nc == Hdr_aprv_rvrs_flg) doHdr_aprv_rvrs_flg_NC(info);
		else if (nc == Hdr_aprv_flg) doHdr_aprv_flg_NC(info);
		else if (nc == Hdr_aprv_no) doHdr_aprv_no_NC(info);
		else if (nc == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_NC(info);
		else if (nc == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_NC(info);
		else if (nc == Hdr_aprv_upd_flg) doHdr_aprv_upd_flg_NC(info);
		else if (nc == Hdr_aprv_can_flg) doHdr_aprv_can_flg_NC(info);
		else if (nc == Hdr_po_dt) doHdr_po_dt_NC(info);
		else if (nc == Hdr_sppl_cd) doHdr_sppl_cd_NC(info);
		else if (nc == Hdr_sppl_nm) doHdr_sppl_nm_NC(info);
		else if (nc == Hdr_purc_amt_rnd_typ) doHdr_purc_amt_rnd_typ_NC(info);
		else if (nc == Hdr_purc_tax_rnd_typ) doHdr_purc_tax_rnd_typ_NC(info);
		else if (nc == Hdr_sppl_cal_cd) doHdr_sppl_cal_cd_NC(info);
		else if (nc == Hdr_sppl_purc_upri_cng_flg) doHdr_sppl_purc_upri_cng_flg_NC(info);
		else if (nc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NC(info);
		else if (nc == Hdr_sppl_ship_form_cd) doHdr_sppl_ship_form_cd_NC(info);
		else if (nc == Hdr_po_dlv_slip_flg) doHdr_po_dlv_slip_flg_NC(info);
		else if (nc == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_NC(info);
		else if (nc == Hdr_mst_ap_dpt_cd) doHdr_mst_ap_dpt_cd_NC(info);
		else if (nc == Hdr_purc_upri_req_typ) doHdr_purc_upri_req_typ_NC(info);
		else if (nc == Hdr_sppl_pay_crryovr_times) doHdr_sppl_pay_crryovr_times_NC(info);
		else if (nc == Hdr_subcon_flg) doHdr_subcon_flg_NC(info);
		else if (nc == Hdr_repurc_obli_flg) doHdr_repurc_obli_flg_NC(info);
		else if (nc == Hdr_outsrc_upri_typ) doHdr_outsrc_upri_typ_NC(info);
		else if (nc == Hdr_sppl_iv_flg) doHdr_sppl_iv_flg_NC(info);
		else if (nc == Hdr_edi_flg) doHdr_edi_flg_NC(info);
		else if (nc == Hdr_last_edi_flg) doHdr_last_edi_flg_NC(info);
		else if (nc == Hdr_edi_tgt_flg) doHdr_edi_tgt_flg_NC(info);
		else if (nc == Hdr_def_purc_usr_cd) doHdr_def_purc_usr_cd_NC(info);
		else if (nc == Hdr_def_purc_dpt_cd) doHdr_def_purc_dpt_cd_NC(info);
		else if (nc == Hdr_ap_dpt_flg) doHdr_ap_dpt_flg_NC(info);
		else if (nc == Hdr_purc_dpt_wg_cd) doHdr_purc_dpt_wg_cd_NC(info);
		else if (nc == Hdr_purc_dpt_wg_nm) doHdr_purc_dpt_wg_nm_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NC(info);
		else if (nc == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NC(info);
		else if (nc == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NC(info);
		else if (nc == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_ptax_xrate_inpt_flg) doHdr_ptax_xrate_inpt_flg_NC(info);
		else if (nc == Hdr_purc_xrate_cd) doHdr_purc_xrate_cd_NC(info);
		else if (nc == Hdr_wtax_rnd_typ) doHdr_wtax_rnd_typ_NC(info);
		else if (nc == Hdr_trd_rmrks) doHdr_trd_rmrks_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_po_print_rmrks) doHdr_po_print_rmrks_NC(info);
		else if (nc == Hdr_dlv_slip_rmrks) doHdr_dlv_slip_rmrks_NC(info);
		else if (nc == Hdr_po_print_cd) doHdr_po_print_cd_NC(info);
		else if (nc == Hdr_po_print_nm) doHdr_po_print_nm_NC(info);
		else if (nc == Hdr_upd_po_print_schd_dt) doHdr_upd_po_print_schd_dt_NC(info);
		else if (nc == Hdr_po_crct_rsn_cd) doHdr_po_crct_rsn_cd_NC(info);
		else if (nc == Hdr_po_crct_rsn_nm) doHdr_po_crct_rsn_nm_NC(info);
		else if (nc == Hdr_po_crct_rsn_rmrks) doHdr_po_crct_rsn_rmrks_NC(info);
		else if (nc == Hdr_tterm_cd1) doHdr_tterm_cd1_NC(info);
		else if (nc == Hdr_tterm_nm1) doHdr_tterm_nm1_NC(info);
		else if (nc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NC(info);
		else if (nc == Hdr_tterm_cd2) doHdr_tterm_cd2_NC(info);
		else if (nc == Hdr_tterm_nm2) doHdr_tterm_nm2_NC(info);
		else if (nc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NC(info);
		else if (nc == Hdr_tterm_cd3) doHdr_tterm_cd3_NC(info);
		else if (nc == Hdr_tterm_nm3) doHdr_tterm_nm3_NC(info);
		else if (nc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NC(info);
		else if (nc == Hdr_asppl_cd) doHdr_asppl_cd_NC(info);
		else if (nc == Hdr_asppl_nm) doHdr_asppl_nm_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_edi_sub_char1) doHdr_edi_sub_char1_NC(info);
		else if (nc == Hdr_edi_sub_char2) doHdr_edi_sub_char2_NC(info);
		else if (nc == Hdr_edi_sub_char3) doHdr_edi_sub_char3_NC(info);
		else if (nc == Hdr_edi_sub_char4) doHdr_edi_sub_char4_NC(info);
		else if (nc == Hdr_edi_sub_char5) doHdr_edi_sub_char5_NC(info);
		else if (nc == Hdr_edi_sub_num1) doHdr_edi_sub_num1_NC(info);
		else if (nc == Hdr_edi_sub_dt1) doHdr_edi_sub_dt1_NC(info);
		else if (nc == Hdr_purc_if_flg) doHdr_purc_if_flg_NC(info);
		else if (nc == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NC(info);
		else if (nc == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NC(info);
		else if (nc == Hdr_ext_po_no) doHdr_ext_po_no_NC(info);
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
		else if (nc == Hdr_po_upd_cntr) doHdr_po_upd_cntr_NC(info);
		else if (nc == Hdr_next_opr_flg) doHdr_next_opr_flg_NC(info);
		else if (nc == Hdr_po_schd_no) doHdr_po_schd_no_NC(info);
		else if (nc == Hdr_prnt_po_flg) doHdr_prnt_po_flg_NC(info);
		else if (nc == Hdr_prnt_dlv_flg) doHdr_prnt_dlv_flg_NC(info);
		else if (nc == Hdr_prnt_purc_ddlv_dlv_flg) doHdr_prnt_purc_ddlv_dlv_flg_NC(info);
		else if (nc == Hdr_indiv_prnt_flg) doHdr_indiv_prnt_flg_NC(info);
		else if (nc == BulkSet_rqst_avl_rqst_dt) doBulkSet_rqst_avl_rqst_dt_NC(info);
		else if (nc == BulkSet_amt) doBulkSet_amt_NC(info);
		else if (nc == BulkSet_inc_tax_amt) doBulkSet_inc_tax_amt_NC(info);
		else if (nc == columnDtl_dtl_peg_no) doDtl_dtl_peg_no_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_NC(info);
		else if (nc == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_NC(info);
		else if (nc == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_NC(info);
		else if (nc == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_NC(info);
		else if (nc == columnDtl_pri_prnt_flg) doDtl_pri_prnt_flg_NC(info);
		else if (nc == columnDtl_drct_dlv_typ) doDtl_drct_dlv_typ_NC(info);
		else if (nc == columnDtl_drct_dlv_typ_nm) doDtl_drct_dlv_typ_nm_NC(info);
		else if (nc == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_NC(info);
		else if (nc == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_NC(info);
		else if (nc == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_NC(info);
		else if (nc == columnDtl_site_cd) doDtl_site_cd_NC(info);
		else if (nc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NC(info);
		else if (nc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NC(info);
		else if (nc == columnDtl_bef_in_to_loc_wg_cd) doDtl_bef_in_to_loc_wg_cd_NC(info);
		else if (nc == columnDtl_bef_lg_grp_cd) doDtl_bef_lg_grp_cd_NC(info);
		else if (nc == columnDtl_bef_loc_grp_cd) doDtl_bef_loc_grp_cd_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_arr_skip_flg) doDtl_arr_skip_flg_NC(info);
		else if (nc == columnDtl_purc_dlv_slip_flg) doDtl_purc_dlv_slip_flg_NC(info);
		else if (nc == columnDtl_maker_cd) doDtl_maker_cd_NC(info);
		else if (nc == columnDtl_maker_nm) doDtl_maker_nm_NC(info);
		else if (nc == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_NC(info);
		else if (nc == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_NC(info);
		else if (nc == columnDtl_purc_basis_typ) doDtl_purc_basis_typ_NC(info);
		else if (nc == columnDtl_purc_basis_typ_nm) doDtl_purc_basis_typ_nm_NC(info);
		else if (nc == columnDtl_sync_flg) doDtl_sync_flg_NC(info);
		else if (nc == columnDtl_itm_purc_upri_cng_flg) doDtl_itm_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_itm_pay_crryovr_times) doDtl_itm_pay_crryovr_times_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_bp_lot_no) doDtl_bp_lot_no_NC(info);
		else if (nc == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NC(info);
		else if (nc == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NC(info);
		else if (nc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NC(info);
		else if (nc == columnDtl_dlv_cal_cd) doDtl_dlv_cal_cd_NC(info);
		else if (nc == columnDtl_purc_id_typ) doDtl_purc_id_typ_NC(info);
		else if (nc == columnDtl_purc_id_typ_nm) doDtl_purc_id_typ_nm_NC(info);
		else if (nc == columnDtl_po_conf_rcpt_flg) doDtl_po_conf_rcpt_flg_NC(info);
		else if (nc == columnDtl_po_conf_rcpt_dt) doDtl_po_conf_rcpt_dt_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_abort_flg) doDtl_abort_flg_NC(info);
		else if (nc == columnDtl_bef_abort_flg) doDtl_bef_abort_flg_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NC(info);
		else if (nc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl_purc_sts_typ) doDtl_purc_sts_typ_NC(info);
		else if (nc == columnDtl_purc_sts_typ_nm) doDtl_purc_sts_typ_nm_NC(info);
		else if (nc == columnDtl_dlv_inst_qty) doDtl_dlv_inst_qty_NC(info);
		else if (nc == columnDtl_dlv_inst_prms_rcpt_qty) doDtl_dlv_inst_prms_rcpt_qty_NC(info);
		else if (nc == columnDtl_rcpt_iv_qty) doDtl_rcpt_iv_qty_NC(info);
		else if (nc == columnDtl_arr_qty) doDtl_arr_qty_NC(info);
		else if (nc == columnDtl_purc_qty) doDtl_purc_qty_NC(info);
		else if (nc == columnDtl_arr_schd_split_flg) doDtl_arr_schd_split_flg_NC(info);
		else if (nc == columnDtl_arr_cmpl_flg) doDtl_arr_cmpl_flg_NC(info);
		else if (nc == columnDtl_purc_cmpl_flg) doDtl_purc_cmpl_flg_NC(info);
		else if (nc == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NC(info);
		else if (nc == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NC(info);
		else if (nc == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NC(info);
		else if (nc == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NC(info);
		else if (nc == columnDtl_old_trd_cur_upri) doDtl_old_trd_cur_upri_NC(info);
		else if (nc == columnDtl_old_trd_cur_proc_upri) doDtl_old_trd_cur_proc_upri_NC(info);
		else if (nc == columnDtl_old_trd_cur_onr_prov_upri) doDtl_old_trd_cur_onr_prov_upri_NC(info);
		else if (nc == columnDtl_old_interim_flg) doDtl_old_interim_flg_NC(info);
		else if (nc == columnDtl_old_trd_cur_dscnt_amt) doDtl_old_trd_cur_dscnt_amt_NC(info);
		else if (nc == columnDtl_old_dscnt_rsn_cd) doDtl_old_dscnt_rsn_cd_NC(info);
		else if (nc == columnDtl_old_dscnt_rsn_nm) doDtl_old_dscnt_rsn_nm_NC(info);
		else if (nc == columnDtl_wtax_rate) doDtl_wtax_rate_NC(info);
		else if (nc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NC(info);
		else if (nc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_outsrc_flg) doDtl_outsrc_flg_NC(info);
		else if (nc == columnDtl_mfg_inst_flg) doDtl_mfg_inst_flg_NC(info);
		else if (nc == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_NC(info);
		else if (nc == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_NC(info);
		else if (nc == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NC(info);
		else if (nc == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NC(info);
		else if (nc == columnDtl_not_xpns_purc_flg) doDtl_not_xpns_purc_flg_NC(info);
		else if (nc == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NC(info);
		else if (nc == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NC(info);
		else if (nc == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_rqst_can_flg) doDtl_rqst_can_flg_NC(info);
		else if (nc == columnDtl_po_cnt_rmrks) doDtl_po_cnt_rmrks_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_po_print_d_rmrks) doDtl_po_print_d_rmrks_NC(info);
		else if (nc == columnDtl_dlv_slip_d_rmrks) doDtl_dlv_slip_d_rmrks_NC(info);
		else if (nc == columnDtl_arr_cnt_rmrks) doDtl_arr_cnt_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_edi_sub_d_char1) doDtl_edi_sub_d_char1_NC(info);
		else if (nc == columnDtl_edi_sub_d_char2) doDtl_edi_sub_d_char2_NC(info);
		else if (nc == columnDtl_edi_sub_d_char3) doDtl_edi_sub_d_char3_NC(info);
		else if (nc == columnDtl_edi_sub_d_char4) doDtl_edi_sub_d_char4_NC(info);
		else if (nc == columnDtl_edi_sub_d_char5) doDtl_edi_sub_d_char5_NC(info);
		else if (nc == columnDtl_edi_sub_d_num1) doDtl_edi_sub_d_num1_NC(info);
		else if (nc == columnDtl_edi_sub_d_dt1) doDtl_edi_sub_d_dt1_NC(info);
		else if (nc == columnDtl_ext_po_d_no) doDtl_ext_po_d_no_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NC(info);
		else if (nc == columnDtl_dlv_slip_seq) doDtl_dlv_slip_seq_NC(info);
		else if (nc == columnDtl_dlv_slip_invalid_flg) doDtl_dlv_slip_invalid_flg_NC(info);
		else if (nc == columnDtl_purc_ddlv_dlv_slip_no) doDtl_purc_ddlv_dlv_slip_no_NC(info);
		else if (nc == columnDtl_dlv_slip_mng_no) doDtl_dlv_slip_mng_no_NC(info);
		else if (nc == columnDtl_dlv_slip_mng_seq) doDtl_dlv_slip_mng_seq_NC(info);
		else if (nc == columnDtl_po_schd_src_typ) doDtl_po_schd_src_typ_NC(info);
		else if (nc == columnDtl_po_schd_src_typ_nm) doDtl_po_schd_src_typ_nm_NC(info);
		else if (nc == columnDtl_po_schd_src_no) doDtl_po_schd_src_no_NC(info);
		else if (nc == columnDtl_rqst_fr_usr_cd) doDtl_rqst_fr_usr_cd_NC(info);
		else if (nc == columnDtl_rqst_fr_usr_nm) doDtl_rqst_fr_usr_nm_NC(info);
		else if (nc == columnDtl_rqst_fr_dpt_cd) doDtl_rqst_fr_dpt_cd_NC(info);
		else if (nc == columnDtl_rqst_fr_dpt_nm) doDtl_rqst_fr_dpt_nm_NC(info);
		else if (nc == columnDtl_bndl_flg) doDtl_bndl_flg_NC(info);
		else if (nc == columnDtl_rqst_slo_flg) doDtl_rqst_slo_flg_NC(info);
		else if (nc == columnDtl_po_schd_no) doDtl_po_schd_no_NC(info);
		else if (nc == columnDtl_po_d_no) doDtl_po_d_no_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_arr_flg) doDtl_arr_flg_NC(info);
		else if (nc == columnDtl_purc_flg) doDtl_purc_flg_NC(info);
		else if (nc == columnDtl_rcpt_iv_flg) doDtl_rcpt_iv_flg_NC(info);
		else if (nc == columnDtl_mfg_loc_wg_cd) doDtl_mfg_loc_wg_cd_NC(info);
		else if (nc == columnDtl2_dtl_peg_no) doDtl2_dtl_peg_no_NC(info);
		else if (nc == columnDtl2_po_schd_no) doDtl2_po_schd_no_NC(info);
		else if (nc == columnDtl2_po_d_no) doDtl2_po_d_no_NC(info);
		else if (nc == columnDtl2_can_flg) doDtl2_can_flg_NC(info);
		else if (nc == columnDtl2_po_schd_upd_cntr) doDtl2_po_schd_upd_cntr_NC(info);
		else if (nc == columnDtl2_arr_pr_upd_cntr) doDtl2_arr_pr_upd_cntr_NC(info);
	}

	/**
	 * [Cnd2]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_NC(MCEventInfo info){
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
	 * [Dtl2]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rev_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rev_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[po_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_po_schd_no_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_rev_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_print_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_print_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_print_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ddlv_dlv_print_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ddlv_dlv_print_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_rvrs_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_rvrs_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_ship_form_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_ship_form_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_dlv_slip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_dlv_slip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mst_ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mst_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_subcon_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dpt_wg_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wtax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wtax_rnd_typ_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_po_print_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_po_print_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_rmrks_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[edi_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char4_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char5_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_num1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_if_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_if_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_po_no_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[next_opr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_next_opr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_po_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_po_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_purc_ddlv_dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_purc_ddlv_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_indiv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_avl_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_avl_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_amt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[inc_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_inc_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pri_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_in_to_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_skip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_skip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_pay_crryovr_times_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_conf_rcpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_conf_rcpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_conf_rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_conf_rcpt_dt_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_abort_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_prms_rcpt_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_prms_rcpt_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_schd_split_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_schd_split_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_proc_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_onr_prov_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_dscnt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_dscnt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cnt_rmrks_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[edi_sub_d_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_num1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_po_d_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bndl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bndl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[arr_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_arr_pr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Cnd2Table) doCnd2_NE(info);
		else if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Dtl2Table) doDtl2_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_rev_no) doCnd_rev_no_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == columnCnd2_po_schd_no) doCnd2_po_schd_no_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_po_no) doHdr_po_no_NE(info);
		else if (ne == Hdr_po_rev) doHdr_po_rev_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_po_print_dt) doHdr_po_print_dt_NE(info);
		else if (ne == Hdr_po_print_flg) doHdr_po_print_flg_NE(info);
		else if (ne == Hdr_dlv_print_flg) doHdr_dlv_print_flg_NE(info);
		else if (ne == Hdr_purc_ddlv_dlv_print_flg) doHdr_purc_ddlv_dlv_print_flg_NE(info);
		else if (ne == Hdr_aprv_rvrs_flg) doHdr_aprv_rvrs_flg_NE(info);
		else if (ne == Hdr_aprv_flg) doHdr_aprv_flg_NE(info);
		else if (ne == Hdr_aprv_no) doHdr_aprv_no_NE(info);
		else if (ne == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_NE(info);
		else if (ne == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_NE(info);
		else if (ne == Hdr_aprv_upd_flg) doHdr_aprv_upd_flg_NE(info);
		else if (ne == Hdr_aprv_can_flg) doHdr_aprv_can_flg_NE(info);
		else if (ne == Hdr_po_dt) doHdr_po_dt_NE(info);
		else if (ne == Hdr_sppl_cd) doHdr_sppl_cd_NE(info);
		else if (ne == Hdr_sppl_nm) doHdr_sppl_nm_NE(info);
		else if (ne == Hdr_purc_amt_rnd_typ) doHdr_purc_amt_rnd_typ_NE(info);
		else if (ne == Hdr_purc_tax_rnd_typ) doHdr_purc_tax_rnd_typ_NE(info);
		else if (ne == Hdr_sppl_cal_cd) doHdr_sppl_cal_cd_NE(info);
		else if (ne == Hdr_sppl_purc_upri_cng_flg) doHdr_sppl_purc_upri_cng_flg_NE(info);
		else if (ne == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NE(info);
		else if (ne == Hdr_sppl_ship_form_cd) doHdr_sppl_ship_form_cd_NE(info);
		else if (ne == Hdr_po_dlv_slip_flg) doHdr_po_dlv_slip_flg_NE(info);
		else if (ne == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_NE(info);
		else if (ne == Hdr_mst_ap_dpt_cd) doHdr_mst_ap_dpt_cd_NE(info);
		else if (ne == Hdr_purc_upri_req_typ) doHdr_purc_upri_req_typ_NE(info);
		else if (ne == Hdr_sppl_pay_crryovr_times) doHdr_sppl_pay_crryovr_times_NE(info);
		else if (ne == Hdr_subcon_flg) doHdr_subcon_flg_NE(info);
		else if (ne == Hdr_repurc_obli_flg) doHdr_repurc_obli_flg_NE(info);
		else if (ne == Hdr_outsrc_upri_typ) doHdr_outsrc_upri_typ_NE(info);
		else if (ne == Hdr_sppl_iv_flg) doHdr_sppl_iv_flg_NE(info);
		else if (ne == Hdr_edi_flg) doHdr_edi_flg_NE(info);
		else if (ne == Hdr_last_edi_flg) doHdr_last_edi_flg_NE(info);
		else if (ne == Hdr_edi_tgt_flg) doHdr_edi_tgt_flg_NE(info);
		else if (ne == Hdr_def_purc_usr_cd) doHdr_def_purc_usr_cd_NE(info);
		else if (ne == Hdr_def_purc_dpt_cd) doHdr_def_purc_dpt_cd_NE(info);
		else if (ne == Hdr_ap_dpt_flg) doHdr_ap_dpt_flg_NE(info);
		else if (ne == Hdr_purc_dpt_wg_cd) doHdr_purc_dpt_wg_cd_NE(info);
		else if (ne == Hdr_purc_dpt_wg_nm) doHdr_purc_dpt_wg_nm_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NE(info);
		else if (ne == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NE(info);
		else if (ne == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NE(info);
		else if (ne == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_ptax_xrate_inpt_flg) doHdr_ptax_xrate_inpt_flg_NE(info);
		else if (ne == Hdr_purc_xrate_cd) doHdr_purc_xrate_cd_NE(info);
		else if (ne == Hdr_wtax_rnd_typ) doHdr_wtax_rnd_typ_NE(info);
		else if (ne == Hdr_trd_rmrks) doHdr_trd_rmrks_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_po_print_rmrks) doHdr_po_print_rmrks_NE(info);
		else if (ne == Hdr_dlv_slip_rmrks) doHdr_dlv_slip_rmrks_NE(info);
		else if (ne == Hdr_po_print_cd) doHdr_po_print_cd_NE(info);
		else if (ne == Hdr_po_print_nm) doHdr_po_print_nm_NE(info);
		else if (ne == Hdr_upd_po_print_schd_dt) doHdr_upd_po_print_schd_dt_NE(info);
		else if (ne == Hdr_po_crct_rsn_cd) doHdr_po_crct_rsn_cd_NE(info);
		else if (ne == Hdr_po_crct_rsn_nm) doHdr_po_crct_rsn_nm_NE(info);
		else if (ne == Hdr_po_crct_rsn_rmrks) doHdr_po_crct_rsn_rmrks_NE(info);
		else if (ne == Hdr_tterm_cd1) doHdr_tterm_cd1_NE(info);
		else if (ne == Hdr_tterm_nm1) doHdr_tterm_nm1_NE(info);
		else if (ne == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NE(info);
		else if (ne == Hdr_tterm_cd2) doHdr_tterm_cd2_NE(info);
		else if (ne == Hdr_tterm_nm2) doHdr_tterm_nm2_NE(info);
		else if (ne == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NE(info);
		else if (ne == Hdr_tterm_cd3) doHdr_tterm_cd3_NE(info);
		else if (ne == Hdr_tterm_nm3) doHdr_tterm_nm3_NE(info);
		else if (ne == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NE(info);
		else if (ne == Hdr_asppl_cd) doHdr_asppl_cd_NE(info);
		else if (ne == Hdr_asppl_nm) doHdr_asppl_nm_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_edi_sub_char1) doHdr_edi_sub_char1_NE(info);
		else if (ne == Hdr_edi_sub_char2) doHdr_edi_sub_char2_NE(info);
		else if (ne == Hdr_edi_sub_char3) doHdr_edi_sub_char3_NE(info);
		else if (ne == Hdr_edi_sub_char4) doHdr_edi_sub_char4_NE(info);
		else if (ne == Hdr_edi_sub_char5) doHdr_edi_sub_char5_NE(info);
		else if (ne == Hdr_edi_sub_num1) doHdr_edi_sub_num1_NE(info);
		else if (ne == Hdr_edi_sub_dt1) doHdr_edi_sub_dt1_NE(info);
		else if (ne == Hdr_purc_if_flg) doHdr_purc_if_flg_NE(info);
		else if (ne == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NE(info);
		else if (ne == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NE(info);
		else if (ne == Hdr_ext_po_no) doHdr_ext_po_no_NE(info);
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
		else if (ne == Hdr_po_upd_cntr) doHdr_po_upd_cntr_NE(info);
		else if (ne == Hdr_next_opr_flg) doHdr_next_opr_flg_NE(info);
		else if (ne == Hdr_po_schd_no) doHdr_po_schd_no_NE(info);
		else if (ne == Hdr_prnt_po_flg) doHdr_prnt_po_flg_NE(info);
		else if (ne == Hdr_prnt_dlv_flg) doHdr_prnt_dlv_flg_NE(info);
		else if (ne == Hdr_prnt_purc_ddlv_dlv_flg) doHdr_prnt_purc_ddlv_dlv_flg_NE(info);
		else if (ne == Hdr_indiv_prnt_flg) doHdr_indiv_prnt_flg_NE(info);
		else if (ne == BulkSet_rqst_avl_rqst_dt) doBulkSet_rqst_avl_rqst_dt_NE(info);
		else if (ne == BulkSet_amt) doBulkSet_amt_NE(info);
		else if (ne == BulkSet_inc_tax_amt) doBulkSet_inc_tax_amt_NE(info);
		else if (ne == columnDtl_dtl_peg_no) doDtl_dtl_peg_no_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_NE(info);
		else if (ne == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_NE(info);
		else if (ne == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_NE(info);
		else if (ne == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_NE(info);
		else if (ne == columnDtl_pri_prnt_flg) doDtl_pri_prnt_flg_NE(info);
		else if (ne == columnDtl_drct_dlv_typ) doDtl_drct_dlv_typ_NE(info);
		else if (ne == columnDtl_drct_dlv_typ_nm) doDtl_drct_dlv_typ_nm_NE(info);
		else if (ne == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_NE(info);
		else if (ne == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_NE(info);
		else if (ne == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_NE(info);
		else if (ne == columnDtl_site_cd) doDtl_site_cd_NE(info);
		else if (ne == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NE(info);
		else if (ne == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NE(info);
		else if (ne == columnDtl_bef_in_to_loc_wg_cd) doDtl_bef_in_to_loc_wg_cd_NE(info);
		else if (ne == columnDtl_bef_lg_grp_cd) doDtl_bef_lg_grp_cd_NE(info);
		else if (ne == columnDtl_bef_loc_grp_cd) doDtl_bef_loc_grp_cd_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_arr_skip_flg) doDtl_arr_skip_flg_NE(info);
		else if (ne == columnDtl_purc_dlv_slip_flg) doDtl_purc_dlv_slip_flg_NE(info);
		else if (ne == columnDtl_maker_cd) doDtl_maker_cd_NE(info);
		else if (ne == columnDtl_maker_nm) doDtl_maker_nm_NE(info);
		else if (ne == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_NE(info);
		else if (ne == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_NE(info);
		else if (ne == columnDtl_purc_basis_typ) doDtl_purc_basis_typ_NE(info);
		else if (ne == columnDtl_purc_basis_typ_nm) doDtl_purc_basis_typ_nm_NE(info);
		else if (ne == columnDtl_sync_flg) doDtl_sync_flg_NE(info);
		else if (ne == columnDtl_itm_purc_upri_cng_flg) doDtl_itm_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_itm_pay_crryovr_times) doDtl_itm_pay_crryovr_times_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_bp_lot_no) doDtl_bp_lot_no_NE(info);
		else if (ne == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NE(info);
		else if (ne == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NE(info);
		else if (ne == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NE(info);
		else if (ne == columnDtl_dlv_cal_cd) doDtl_dlv_cal_cd_NE(info);
		else if (ne == columnDtl_purc_id_typ) doDtl_purc_id_typ_NE(info);
		else if (ne == columnDtl_purc_id_typ_nm) doDtl_purc_id_typ_nm_NE(info);
		else if (ne == columnDtl_po_conf_rcpt_flg) doDtl_po_conf_rcpt_flg_NE(info);
		else if (ne == columnDtl_po_conf_rcpt_dt) doDtl_po_conf_rcpt_dt_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_abort_flg) doDtl_abort_flg_NE(info);
		else if (ne == columnDtl_bef_abort_flg) doDtl_bef_abort_flg_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NE(info);
		else if (ne == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl_purc_sts_typ) doDtl_purc_sts_typ_NE(info);
		else if (ne == columnDtl_purc_sts_typ_nm) doDtl_purc_sts_typ_nm_NE(info);
		else if (ne == columnDtl_dlv_inst_qty) doDtl_dlv_inst_qty_NE(info);
		else if (ne == columnDtl_dlv_inst_prms_rcpt_qty) doDtl_dlv_inst_prms_rcpt_qty_NE(info);
		else if (ne == columnDtl_rcpt_iv_qty) doDtl_rcpt_iv_qty_NE(info);
		else if (ne == columnDtl_arr_qty) doDtl_arr_qty_NE(info);
		else if (ne == columnDtl_purc_qty) doDtl_purc_qty_NE(info);
		else if (ne == columnDtl_arr_schd_split_flg) doDtl_arr_schd_split_flg_NE(info);
		else if (ne == columnDtl_arr_cmpl_flg) doDtl_arr_cmpl_flg_NE(info);
		else if (ne == columnDtl_purc_cmpl_flg) doDtl_purc_cmpl_flg_NE(info);
		else if (ne == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NE(info);
		else if (ne == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NE(info);
		else if (ne == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NE(info);
		else if (ne == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NE(info);
		else if (ne == columnDtl_old_trd_cur_upri) doDtl_old_trd_cur_upri_NE(info);
		else if (ne == columnDtl_old_trd_cur_proc_upri) doDtl_old_trd_cur_proc_upri_NE(info);
		else if (ne == columnDtl_old_trd_cur_onr_prov_upri) doDtl_old_trd_cur_onr_prov_upri_NE(info);
		else if (ne == columnDtl_old_interim_flg) doDtl_old_interim_flg_NE(info);
		else if (ne == columnDtl_old_trd_cur_dscnt_amt) doDtl_old_trd_cur_dscnt_amt_NE(info);
		else if (ne == columnDtl_old_dscnt_rsn_cd) doDtl_old_dscnt_rsn_cd_NE(info);
		else if (ne == columnDtl_old_dscnt_rsn_nm) doDtl_old_dscnt_rsn_nm_NE(info);
		else if (ne == columnDtl_wtax_rate) doDtl_wtax_rate_NE(info);
		else if (ne == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NE(info);
		else if (ne == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_outsrc_flg) doDtl_outsrc_flg_NE(info);
		else if (ne == columnDtl_mfg_inst_flg) doDtl_mfg_inst_flg_NE(info);
		else if (ne == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_NE(info);
		else if (ne == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_NE(info);
		else if (ne == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NE(info);
		else if (ne == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NE(info);
		else if (ne == columnDtl_not_xpns_purc_flg) doDtl_not_xpns_purc_flg_NE(info);
		else if (ne == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NE(info);
		else if (ne == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NE(info);
		else if (ne == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_rqst_can_flg) doDtl_rqst_can_flg_NE(info);
		else if (ne == columnDtl_po_cnt_rmrks) doDtl_po_cnt_rmrks_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_po_print_d_rmrks) doDtl_po_print_d_rmrks_NE(info);
		else if (ne == columnDtl_dlv_slip_d_rmrks) doDtl_dlv_slip_d_rmrks_NE(info);
		else if (ne == columnDtl_arr_cnt_rmrks) doDtl_arr_cnt_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_edi_sub_d_char1) doDtl_edi_sub_d_char1_NE(info);
		else if (ne == columnDtl_edi_sub_d_char2) doDtl_edi_sub_d_char2_NE(info);
		else if (ne == columnDtl_edi_sub_d_char3) doDtl_edi_sub_d_char3_NE(info);
		else if (ne == columnDtl_edi_sub_d_char4) doDtl_edi_sub_d_char4_NE(info);
		else if (ne == columnDtl_edi_sub_d_char5) doDtl_edi_sub_d_char5_NE(info);
		else if (ne == columnDtl_edi_sub_d_num1) doDtl_edi_sub_d_num1_NE(info);
		else if (ne == columnDtl_edi_sub_d_dt1) doDtl_edi_sub_d_dt1_NE(info);
		else if (ne == columnDtl_ext_po_d_no) doDtl_ext_po_d_no_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NE(info);
		else if (ne == columnDtl_dlv_slip_seq) doDtl_dlv_slip_seq_NE(info);
		else if (ne == columnDtl_dlv_slip_invalid_flg) doDtl_dlv_slip_invalid_flg_NE(info);
		else if (ne == columnDtl_purc_ddlv_dlv_slip_no) doDtl_purc_ddlv_dlv_slip_no_NE(info);
		else if (ne == columnDtl_dlv_slip_mng_no) doDtl_dlv_slip_mng_no_NE(info);
		else if (ne == columnDtl_dlv_slip_mng_seq) doDtl_dlv_slip_mng_seq_NE(info);
		else if (ne == columnDtl_po_schd_src_typ) doDtl_po_schd_src_typ_NE(info);
		else if (ne == columnDtl_po_schd_src_typ_nm) doDtl_po_schd_src_typ_nm_NE(info);
		else if (ne == columnDtl_po_schd_src_no) doDtl_po_schd_src_no_NE(info);
		else if (ne == columnDtl_rqst_fr_usr_cd) doDtl_rqst_fr_usr_cd_NE(info);
		else if (ne == columnDtl_rqst_fr_usr_nm) doDtl_rqst_fr_usr_nm_NE(info);
		else if (ne == columnDtl_rqst_fr_dpt_cd) doDtl_rqst_fr_dpt_cd_NE(info);
		else if (ne == columnDtl_rqst_fr_dpt_nm) doDtl_rqst_fr_dpt_nm_NE(info);
		else if (ne == columnDtl_bndl_flg) doDtl_bndl_flg_NE(info);
		else if (ne == columnDtl_rqst_slo_flg) doDtl_rqst_slo_flg_NE(info);
		else if (ne == columnDtl_po_schd_no) doDtl_po_schd_no_NE(info);
		else if (ne == columnDtl_po_d_no) doDtl_po_d_no_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_arr_flg) doDtl_arr_flg_NE(info);
		else if (ne == columnDtl_purc_flg) doDtl_purc_flg_NE(info);
		else if (ne == columnDtl_rcpt_iv_flg) doDtl_rcpt_iv_flg_NE(info);
		else if (ne == columnDtl_mfg_loc_wg_cd) doDtl_mfg_loc_wg_cd_NE(info);
		else if (ne == columnDtl2_dtl_peg_no) doDtl2_dtl_peg_no_NE(info);
		else if (ne == columnDtl2_po_schd_no) doDtl2_po_schd_no_NE(info);
		else if (ne == columnDtl2_po_d_no) doDtl2_po_d_no_NE(info);
		else if (ne == columnDtl2_can_flg) doDtl2_can_flg_NE(info);
		else if (ne == columnDtl2_po_schd_upd_cntr) doDtl2_po_schd_upd_cntr_NE(info);
		else if (ne == columnDtl2_arr_pr_upd_cntr) doDtl2_arr_pr_upd_cntr_NE(info);
	}

	/**
	 * [Cnd2]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_NE(MCEventInfo info){
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
	 * [Dtl2]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rev_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rev_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[po_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_po_schd_no_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_rev_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[po_print_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_print_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_print_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ddlv_dlv_print_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ddlv_dlv_print_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_rvrs_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_rvrs_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[po_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_ship_form_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_ship_form_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_dlv_slip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_dlv_slip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mst_ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mst_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_subcon_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dpt_wg_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wtax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wtax_rnd_typ_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[po_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_po_print_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_po_print_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_rmrks_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[edi_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char4_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char5_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_num1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_if_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_if_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_po_no_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[po_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[next_opr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_next_opr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_po_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_po_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_purc_ddlv_dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_purc_ddlv_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_indiv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_avl_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_avl_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_amt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[inc_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_inc_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pri_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_in_to_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_skip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_skip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_pay_crryovr_times_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_conf_rcpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_conf_rcpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_conf_rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_conf_rcpt_dt_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_abort_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_prms_rcpt_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_prms_rcpt_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_schd_split_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_schd_split_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_proc_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_onr_prov_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_dscnt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_dscnt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cnt_rmrks_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[edi_sub_d_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_num1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_po_d_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bndl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bndl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[arr_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_arr_pr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Cnd2Table) doCnd2_NX(info);
		else if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Dtl2Table) doDtl2_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_rev_no) doCnd_rev_no_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == columnCnd2_po_schd_no) doCnd2_po_schd_no_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_po_no) doHdr_po_no_NX(info);
		else if (nx == Hdr_po_rev) doHdr_po_rev_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_po_print_dt) doHdr_po_print_dt_NX(info);
		else if (nx == Hdr_po_print_flg) doHdr_po_print_flg_NX(info);
		else if (nx == Hdr_dlv_print_flg) doHdr_dlv_print_flg_NX(info);
		else if (nx == Hdr_purc_ddlv_dlv_print_flg) doHdr_purc_ddlv_dlv_print_flg_NX(info);
		else if (nx == Hdr_aprv_rvrs_flg) doHdr_aprv_rvrs_flg_NX(info);
		else if (nx == Hdr_aprv_flg) doHdr_aprv_flg_NX(info);
		else if (nx == Hdr_aprv_no) doHdr_aprv_no_NX(info);
		else if (nx == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_NX(info);
		else if (nx == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_NX(info);
		else if (nx == Hdr_aprv_upd_flg) doHdr_aprv_upd_flg_NX(info);
		else if (nx == Hdr_aprv_can_flg) doHdr_aprv_can_flg_NX(info);
		else if (nx == Hdr_po_dt) doHdr_po_dt_NX(info);
		else if (nx == Hdr_sppl_cd) doHdr_sppl_cd_NX(info);
		else if (nx == Hdr_sppl_nm) doHdr_sppl_nm_NX(info);
		else if (nx == Hdr_purc_amt_rnd_typ) doHdr_purc_amt_rnd_typ_NX(info);
		else if (nx == Hdr_purc_tax_rnd_typ) doHdr_purc_tax_rnd_typ_NX(info);
		else if (nx == Hdr_sppl_cal_cd) doHdr_sppl_cal_cd_NX(info);
		else if (nx == Hdr_sppl_purc_upri_cng_flg) doHdr_sppl_purc_upri_cng_flg_NX(info);
		else if (nx == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NX(info);
		else if (nx == Hdr_sppl_ship_form_cd) doHdr_sppl_ship_form_cd_NX(info);
		else if (nx == Hdr_po_dlv_slip_flg) doHdr_po_dlv_slip_flg_NX(info);
		else if (nx == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_NX(info);
		else if (nx == Hdr_mst_ap_dpt_cd) doHdr_mst_ap_dpt_cd_NX(info);
		else if (nx == Hdr_purc_upri_req_typ) doHdr_purc_upri_req_typ_NX(info);
		else if (nx == Hdr_sppl_pay_crryovr_times) doHdr_sppl_pay_crryovr_times_NX(info);
		else if (nx == Hdr_subcon_flg) doHdr_subcon_flg_NX(info);
		else if (nx == Hdr_repurc_obli_flg) doHdr_repurc_obli_flg_NX(info);
		else if (nx == Hdr_outsrc_upri_typ) doHdr_outsrc_upri_typ_NX(info);
		else if (nx == Hdr_sppl_iv_flg) doHdr_sppl_iv_flg_NX(info);
		else if (nx == Hdr_edi_flg) doHdr_edi_flg_NX(info);
		else if (nx == Hdr_last_edi_flg) doHdr_last_edi_flg_NX(info);
		else if (nx == Hdr_edi_tgt_flg) doHdr_edi_tgt_flg_NX(info);
		else if (nx == Hdr_def_purc_usr_cd) doHdr_def_purc_usr_cd_NX(info);
		else if (nx == Hdr_def_purc_dpt_cd) doHdr_def_purc_dpt_cd_NX(info);
		else if (nx == Hdr_ap_dpt_flg) doHdr_ap_dpt_flg_NX(info);
		else if (nx == Hdr_purc_dpt_wg_cd) doHdr_purc_dpt_wg_cd_NX(info);
		else if (nx == Hdr_purc_dpt_wg_nm) doHdr_purc_dpt_wg_nm_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NX(info);
		else if (nx == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NX(info);
		else if (nx == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NX(info);
		else if (nx == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_ptax_xrate_inpt_flg) doHdr_ptax_xrate_inpt_flg_NX(info);
		else if (nx == Hdr_purc_xrate_cd) doHdr_purc_xrate_cd_NX(info);
		else if (nx == Hdr_wtax_rnd_typ) doHdr_wtax_rnd_typ_NX(info);
		else if (nx == Hdr_trd_rmrks) doHdr_trd_rmrks_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_po_print_rmrks) doHdr_po_print_rmrks_NX(info);
		else if (nx == Hdr_dlv_slip_rmrks) doHdr_dlv_slip_rmrks_NX(info);
		else if (nx == Hdr_po_print_cd) doHdr_po_print_cd_NX(info);
		else if (nx == Hdr_po_print_nm) doHdr_po_print_nm_NX(info);
		else if (nx == Hdr_upd_po_print_schd_dt) doHdr_upd_po_print_schd_dt_NX(info);
		else if (nx == Hdr_po_crct_rsn_cd) doHdr_po_crct_rsn_cd_NX(info);
		else if (nx == Hdr_po_crct_rsn_nm) doHdr_po_crct_rsn_nm_NX(info);
		else if (nx == Hdr_po_crct_rsn_rmrks) doHdr_po_crct_rsn_rmrks_NX(info);
		else if (nx == Hdr_tterm_cd1) doHdr_tterm_cd1_NX(info);
		else if (nx == Hdr_tterm_nm1) doHdr_tterm_nm1_NX(info);
		else if (nx == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NX(info);
		else if (nx == Hdr_tterm_cd2) doHdr_tterm_cd2_NX(info);
		else if (nx == Hdr_tterm_nm2) doHdr_tterm_nm2_NX(info);
		else if (nx == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NX(info);
		else if (nx == Hdr_tterm_cd3) doHdr_tterm_cd3_NX(info);
		else if (nx == Hdr_tterm_nm3) doHdr_tterm_nm3_NX(info);
		else if (nx == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NX(info);
		else if (nx == Hdr_asppl_cd) doHdr_asppl_cd_NX(info);
		else if (nx == Hdr_asppl_nm) doHdr_asppl_nm_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_edi_sub_char1) doHdr_edi_sub_char1_NX(info);
		else if (nx == Hdr_edi_sub_char2) doHdr_edi_sub_char2_NX(info);
		else if (nx == Hdr_edi_sub_char3) doHdr_edi_sub_char3_NX(info);
		else if (nx == Hdr_edi_sub_char4) doHdr_edi_sub_char4_NX(info);
		else if (nx == Hdr_edi_sub_char5) doHdr_edi_sub_char5_NX(info);
		else if (nx == Hdr_edi_sub_num1) doHdr_edi_sub_num1_NX(info);
		else if (nx == Hdr_edi_sub_dt1) doHdr_edi_sub_dt1_NX(info);
		else if (nx == Hdr_purc_if_flg) doHdr_purc_if_flg_NX(info);
		else if (nx == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NX(info);
		else if (nx == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NX(info);
		else if (nx == Hdr_ext_po_no) doHdr_ext_po_no_NX(info);
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
		else if (nx == Hdr_po_upd_cntr) doHdr_po_upd_cntr_NX(info);
		else if (nx == Hdr_next_opr_flg) doHdr_next_opr_flg_NX(info);
		else if (nx == Hdr_po_schd_no) doHdr_po_schd_no_NX(info);
		else if (nx == Hdr_prnt_po_flg) doHdr_prnt_po_flg_NX(info);
		else if (nx == Hdr_prnt_dlv_flg) doHdr_prnt_dlv_flg_NX(info);
		else if (nx == Hdr_prnt_purc_ddlv_dlv_flg) doHdr_prnt_purc_ddlv_dlv_flg_NX(info);
		else if (nx == Hdr_indiv_prnt_flg) doHdr_indiv_prnt_flg_NX(info);
		else if (nx == BulkSet_rqst_avl_rqst_dt) doBulkSet_rqst_avl_rqst_dt_NX(info);
		else if (nx == BulkSet_amt) doBulkSet_amt_NX(info);
		else if (nx == BulkSet_inc_tax_amt) doBulkSet_inc_tax_amt_NX(info);
		else if (nx == columnDtl_dtl_peg_no) doDtl_dtl_peg_no_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_NX(info);
		else if (nx == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_NX(info);
		else if (nx == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_NX(info);
		else if (nx == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_NX(info);
		else if (nx == columnDtl_pri_prnt_flg) doDtl_pri_prnt_flg_NX(info);
		else if (nx == columnDtl_drct_dlv_typ) doDtl_drct_dlv_typ_NX(info);
		else if (nx == columnDtl_drct_dlv_typ_nm) doDtl_drct_dlv_typ_nm_NX(info);
		else if (nx == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_NX(info);
		else if (nx == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_NX(info);
		else if (nx == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_NX(info);
		else if (nx == columnDtl_site_cd) doDtl_site_cd_NX(info);
		else if (nx == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NX(info);
		else if (nx == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NX(info);
		else if (nx == columnDtl_bef_in_to_loc_wg_cd) doDtl_bef_in_to_loc_wg_cd_NX(info);
		else if (nx == columnDtl_bef_lg_grp_cd) doDtl_bef_lg_grp_cd_NX(info);
		else if (nx == columnDtl_bef_loc_grp_cd) doDtl_bef_loc_grp_cd_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_arr_skip_flg) doDtl_arr_skip_flg_NX(info);
		else if (nx == columnDtl_purc_dlv_slip_flg) doDtl_purc_dlv_slip_flg_NX(info);
		else if (nx == columnDtl_maker_cd) doDtl_maker_cd_NX(info);
		else if (nx == columnDtl_maker_nm) doDtl_maker_nm_NX(info);
		else if (nx == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_NX(info);
		else if (nx == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_NX(info);
		else if (nx == columnDtl_purc_basis_typ) doDtl_purc_basis_typ_NX(info);
		else if (nx == columnDtl_purc_basis_typ_nm) doDtl_purc_basis_typ_nm_NX(info);
		else if (nx == columnDtl_sync_flg) doDtl_sync_flg_NX(info);
		else if (nx == columnDtl_itm_purc_upri_cng_flg) doDtl_itm_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_itm_pay_crryovr_times) doDtl_itm_pay_crryovr_times_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_bp_lot_no) doDtl_bp_lot_no_NX(info);
		else if (nx == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NX(info);
		else if (nx == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NX(info);
		else if (nx == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NX(info);
		else if (nx == columnDtl_dlv_cal_cd) doDtl_dlv_cal_cd_NX(info);
		else if (nx == columnDtl_purc_id_typ) doDtl_purc_id_typ_NX(info);
		else if (nx == columnDtl_purc_id_typ_nm) doDtl_purc_id_typ_nm_NX(info);
		else if (nx == columnDtl_po_conf_rcpt_flg) doDtl_po_conf_rcpt_flg_NX(info);
		else if (nx == columnDtl_po_conf_rcpt_dt) doDtl_po_conf_rcpt_dt_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_abort_flg) doDtl_abort_flg_NX(info);
		else if (nx == columnDtl_bef_abort_flg) doDtl_bef_abort_flg_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NX(info);
		else if (nx == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl_purc_sts_typ) doDtl_purc_sts_typ_NX(info);
		else if (nx == columnDtl_purc_sts_typ_nm) doDtl_purc_sts_typ_nm_NX(info);
		else if (nx == columnDtl_dlv_inst_qty) doDtl_dlv_inst_qty_NX(info);
		else if (nx == columnDtl_dlv_inst_prms_rcpt_qty) doDtl_dlv_inst_prms_rcpt_qty_NX(info);
		else if (nx == columnDtl_rcpt_iv_qty) doDtl_rcpt_iv_qty_NX(info);
		else if (nx == columnDtl_arr_qty) doDtl_arr_qty_NX(info);
		else if (nx == columnDtl_purc_qty) doDtl_purc_qty_NX(info);
		else if (nx == columnDtl_arr_schd_split_flg) doDtl_arr_schd_split_flg_NX(info);
		else if (nx == columnDtl_arr_cmpl_flg) doDtl_arr_cmpl_flg_NX(info);
		else if (nx == columnDtl_purc_cmpl_flg) doDtl_purc_cmpl_flg_NX(info);
		else if (nx == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NX(info);
		else if (nx == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NX(info);
		else if (nx == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NX(info);
		else if (nx == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NX(info);
		else if (nx == columnDtl_old_trd_cur_upri) doDtl_old_trd_cur_upri_NX(info);
		else if (nx == columnDtl_old_trd_cur_proc_upri) doDtl_old_trd_cur_proc_upri_NX(info);
		else if (nx == columnDtl_old_trd_cur_onr_prov_upri) doDtl_old_trd_cur_onr_prov_upri_NX(info);
		else if (nx == columnDtl_old_interim_flg) doDtl_old_interim_flg_NX(info);
		else if (nx == columnDtl_old_trd_cur_dscnt_amt) doDtl_old_trd_cur_dscnt_amt_NX(info);
		else if (nx == columnDtl_old_dscnt_rsn_cd) doDtl_old_dscnt_rsn_cd_NX(info);
		else if (nx == columnDtl_old_dscnt_rsn_nm) doDtl_old_dscnt_rsn_nm_NX(info);
		else if (nx == columnDtl_wtax_rate) doDtl_wtax_rate_NX(info);
		else if (nx == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NX(info);
		else if (nx == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_outsrc_flg) doDtl_outsrc_flg_NX(info);
		else if (nx == columnDtl_mfg_inst_flg) doDtl_mfg_inst_flg_NX(info);
		else if (nx == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_NX(info);
		else if (nx == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_NX(info);
		else if (nx == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NX(info);
		else if (nx == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NX(info);
		else if (nx == columnDtl_not_xpns_purc_flg) doDtl_not_xpns_purc_flg_NX(info);
		else if (nx == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NX(info);
		else if (nx == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NX(info);
		else if (nx == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_rqst_can_flg) doDtl_rqst_can_flg_NX(info);
		else if (nx == columnDtl_po_cnt_rmrks) doDtl_po_cnt_rmrks_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_po_print_d_rmrks) doDtl_po_print_d_rmrks_NX(info);
		else if (nx == columnDtl_dlv_slip_d_rmrks) doDtl_dlv_slip_d_rmrks_NX(info);
		else if (nx == columnDtl_arr_cnt_rmrks) doDtl_arr_cnt_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_edi_sub_d_char1) doDtl_edi_sub_d_char1_NX(info);
		else if (nx == columnDtl_edi_sub_d_char2) doDtl_edi_sub_d_char2_NX(info);
		else if (nx == columnDtl_edi_sub_d_char3) doDtl_edi_sub_d_char3_NX(info);
		else if (nx == columnDtl_edi_sub_d_char4) doDtl_edi_sub_d_char4_NX(info);
		else if (nx == columnDtl_edi_sub_d_char5) doDtl_edi_sub_d_char5_NX(info);
		else if (nx == columnDtl_edi_sub_d_num1) doDtl_edi_sub_d_num1_NX(info);
		else if (nx == columnDtl_edi_sub_d_dt1) doDtl_edi_sub_d_dt1_NX(info);
		else if (nx == columnDtl_ext_po_d_no) doDtl_ext_po_d_no_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NX(info);
		else if (nx == columnDtl_dlv_slip_seq) doDtl_dlv_slip_seq_NX(info);
		else if (nx == columnDtl_dlv_slip_invalid_flg) doDtl_dlv_slip_invalid_flg_NX(info);
		else if (nx == columnDtl_purc_ddlv_dlv_slip_no) doDtl_purc_ddlv_dlv_slip_no_NX(info);
		else if (nx == columnDtl_dlv_slip_mng_no) doDtl_dlv_slip_mng_no_NX(info);
		else if (nx == columnDtl_dlv_slip_mng_seq) doDtl_dlv_slip_mng_seq_NX(info);
		else if (nx == columnDtl_po_schd_src_typ) doDtl_po_schd_src_typ_NX(info);
		else if (nx == columnDtl_po_schd_src_typ_nm) doDtl_po_schd_src_typ_nm_NX(info);
		else if (nx == columnDtl_po_schd_src_no) doDtl_po_schd_src_no_NX(info);
		else if (nx == columnDtl_rqst_fr_usr_cd) doDtl_rqst_fr_usr_cd_NX(info);
		else if (nx == columnDtl_rqst_fr_usr_nm) doDtl_rqst_fr_usr_nm_NX(info);
		else if (nx == columnDtl_rqst_fr_dpt_cd) doDtl_rqst_fr_dpt_cd_NX(info);
		else if (nx == columnDtl_rqst_fr_dpt_nm) doDtl_rqst_fr_dpt_nm_NX(info);
		else if (nx == columnDtl_bndl_flg) doDtl_bndl_flg_NX(info);
		else if (nx == columnDtl_rqst_slo_flg) doDtl_rqst_slo_flg_NX(info);
		else if (nx == columnDtl_po_schd_no) doDtl_po_schd_no_NX(info);
		else if (nx == columnDtl_po_d_no) doDtl_po_d_no_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_arr_flg) doDtl_arr_flg_NX(info);
		else if (nx == columnDtl_purc_flg) doDtl_purc_flg_NX(info);
		else if (nx == columnDtl_rcpt_iv_flg) doDtl_rcpt_iv_flg_NX(info);
		else if (nx == columnDtl_mfg_loc_wg_cd) doDtl_mfg_loc_wg_cd_NX(info);
		else if (nx == columnDtl2_dtl_peg_no) doDtl2_dtl_peg_no_NX(info);
		else if (nx == columnDtl2_po_schd_no) doDtl2_po_schd_no_NX(info);
		else if (nx == columnDtl2_po_d_no) doDtl2_po_d_no_NX(info);
		else if (nx == columnDtl2_can_flg) doDtl2_can_flg_NX(info);
		else if (nx == columnDtl2_po_schd_upd_cntr) doDtl2_po_schd_upd_cntr_NX(info);
		else if (nx == columnDtl2_arr_pr_upd_cntr) doDtl2_arr_pr_upd_cntr_NX(info);
	}

	/**
	 * [Cnd2]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_NX(MCEventInfo info){
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
	 * [Dtl2]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rev_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rev_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[po_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_po_schd_no_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_rev_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[po_print_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_print_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_print_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ddlv_dlv_print_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ddlv_dlv_print_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_rvrs_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_rvrs_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[po_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_ship_form_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_ship_form_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_dlv_slip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_dlv_slip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mst_ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mst_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_subcon_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dpt_wg_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wtax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wtax_rnd_typ_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[po_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_po_print_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_po_print_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_rmrks_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[edi_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char4_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char5_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_num1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_if_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_if_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_po_no_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[po_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[next_opr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_next_opr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_po_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_po_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_purc_ddlv_dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_purc_ddlv_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_indiv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_avl_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_avl_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_amt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[inc_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_inc_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pri_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_in_to_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_skip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_skip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_pay_crryovr_times_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_conf_rcpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_conf_rcpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_conf_rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_conf_rcpt_dt_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_abort_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_prms_rcpt_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_prms_rcpt_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_schd_split_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_schd_split_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_proc_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_onr_prov_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_dscnt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_dscnt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cnt_rmrks_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[edi_sub_d_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_num1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_po_d_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bndl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bndl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[arr_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_arr_pr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_rev_no) doCnd_rev_no_LC(info);
		else if (lc == columnCnd2_po_schd_no) doCnd2_po_schd_no_LC(info);
		else if (lc == Hdr_trd_cd) doHdr_trd_cd_LC(info);
		else if (lc == Hdr_trd_nm) doHdr_trd_nm_LC(info);
		else if (lc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_LC(info);
		else if (lc == Hdr_po_no) doHdr_po_no_LC(info);
		else if (lc == Hdr_po_rev) doHdr_po_rev_LC(info);
		else if (lc == Hdr_po_print_dt) doHdr_po_print_dt_LC(info);
		else if (lc == Hdr_aprv_no) doHdr_aprv_no_LC(info);
		else if (lc == Hdr_aprv_sts_typ) doHdr_aprv_sts_typ_LC(info);
		else if (lc == Hdr_aprv_sts_typ_nm) doHdr_aprv_sts_typ_nm_LC(info);
		else if (lc == Hdr_po_dt) doHdr_po_dt_LC(info);
		else if (lc == Hdr_sppl_cd) doHdr_sppl_cd_LC(info);
		else if (lc == Hdr_sppl_nm) doHdr_sppl_nm_LC(info);
		else if (lc == Hdr_purc_amt_rnd_typ) doHdr_purc_amt_rnd_typ_LC(info);
		else if (lc == Hdr_purc_tax_rnd_typ) doHdr_purc_tax_rnd_typ_LC(info);
		else if (lc == Hdr_sppl_cal_cd) doHdr_sppl_cal_cd_LC(info);
		else if (lc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_LC(info);
		else if (lc == Hdr_sppl_ship_form_cd) doHdr_sppl_ship_form_cd_LC(info);
		else if (lc == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_LC(info);
		else if (lc == Hdr_mst_ap_dpt_cd) doHdr_mst_ap_dpt_cd_LC(info);
		else if (lc == Hdr_purc_upri_req_typ) doHdr_purc_upri_req_typ_LC(info);
		else if (lc == Hdr_sppl_pay_crryovr_times) doHdr_sppl_pay_crryovr_times_LC(info);
		else if (lc == Hdr_outsrc_upri_typ) doHdr_outsrc_upri_typ_LC(info);
		else if (lc == Hdr_def_purc_usr_cd) doHdr_def_purc_usr_cd_LC(info);
		else if (lc == Hdr_def_purc_dpt_cd) doHdr_def_purc_dpt_cd_LC(info);
		else if (lc == Hdr_purc_dpt_wg_cd) doHdr_purc_dpt_wg_cd_LC(info);
		else if (lc == Hdr_purc_dpt_wg_nm) doHdr_purc_dpt_wg_nm_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_base_cur_amt_dec_place) doHdr_base_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_base_cur_upri_dec_place) doHdr_base_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_LC(info);
		else if (lc == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_LC(info);
		else if (lc == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_purc_xrate_cd) doHdr_purc_xrate_cd_LC(info);
		else if (lc == Hdr_wtax_rnd_typ) doHdr_wtax_rnd_typ_LC(info);
		else if (lc == Hdr_trd_rmrks) doHdr_trd_rmrks_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_po_print_rmrks) doHdr_po_print_rmrks_LC(info);
		else if (lc == Hdr_dlv_slip_rmrks) doHdr_dlv_slip_rmrks_LC(info);
		else if (lc == Hdr_po_print_cd) doHdr_po_print_cd_LC(info);
		else if (lc == Hdr_po_print_nm) doHdr_po_print_nm_LC(info);
		else if (lc == Hdr_upd_po_print_schd_dt) doHdr_upd_po_print_schd_dt_LC(info);
		else if (lc == Hdr_po_crct_rsn_cd) doHdr_po_crct_rsn_cd_LC(info);
		else if (lc == Hdr_po_crct_rsn_nm) doHdr_po_crct_rsn_nm_LC(info);
		else if (lc == Hdr_po_crct_rsn_rmrks) doHdr_po_crct_rsn_rmrks_LC(info);
		else if (lc == Hdr_tterm_cd1) doHdr_tterm_cd1_LC(info);
		else if (lc == Hdr_tterm_nm1) doHdr_tterm_nm1_LC(info);
		else if (lc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_LC(info);
		else if (lc == Hdr_tterm_cd2) doHdr_tterm_cd2_LC(info);
		else if (lc == Hdr_tterm_nm2) doHdr_tterm_nm2_LC(info);
		else if (lc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_LC(info);
		else if (lc == Hdr_tterm_cd3) doHdr_tterm_cd3_LC(info);
		else if (lc == Hdr_tterm_nm3) doHdr_tterm_nm3_LC(info);
		else if (lc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_LC(info);
		else if (lc == Hdr_asppl_cd) doHdr_asppl_cd_LC(info);
		else if (lc == Hdr_asppl_nm) doHdr_asppl_nm_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_edi_sub_char1) doHdr_edi_sub_char1_LC(info);
		else if (lc == Hdr_edi_sub_char2) doHdr_edi_sub_char2_LC(info);
		else if (lc == Hdr_edi_sub_char3) doHdr_edi_sub_char3_LC(info);
		else if (lc == Hdr_edi_sub_char4) doHdr_edi_sub_char4_LC(info);
		else if (lc == Hdr_edi_sub_char5) doHdr_edi_sub_char5_LC(info);
		else if (lc == Hdr_edi_sub_num1) doHdr_edi_sub_num1_LC(info);
		else if (lc == Hdr_edi_sub_dt1) doHdr_edi_sub_dt1_LC(info);
		else if (lc == Hdr_ext_sys_cd) doHdr_ext_sys_cd_LC(info);
		else if (lc == Hdr_ext_sys_nm) doHdr_ext_sys_nm_LC(info);
		else if (lc == Hdr_ext_po_no) doHdr_ext_po_no_LC(info);
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
		else if (lc == Hdr_po_upd_cntr) doHdr_po_upd_cntr_LC(info);
		else if (lc == Hdr_po_schd_no) doHdr_po_schd_no_LC(info);
		else if (lc == BulkSet_rqst_avl_rqst_dt) doBulkSet_rqst_avl_rqst_dt_LC(info);
		else if (lc == BulkSet_amt) doBulkSet_amt_LC(info);
		else if (lc == BulkSet_inc_tax_amt) doBulkSet_inc_tax_amt_LC(info);
		else if (lc == columnDtl_dtl_peg_no) doDtl_dtl_peg_no_LC(info);
		else if (lc == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_LC(info);
		else if (lc == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_LC(info);
		else if (lc == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_LC(info);
		else if (lc == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_LC(info);
		else if (lc == columnDtl_drct_dlv_typ) doDtl_drct_dlv_typ_LC(info);
		else if (lc == columnDtl_drct_dlv_typ_nm) doDtl_drct_dlv_typ_nm_LC(info);
		else if (lc == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_LC(info);
		else if (lc == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_LC(info);
		else if (lc == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_LC(info);
		else if (lc == columnDtl_site_cd) doDtl_site_cd_LC(info);
		else if (lc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_LC(info);
		else if (lc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_LC(info);
		else if (lc == columnDtl_bef_in_to_loc_wg_cd) doDtl_bef_in_to_loc_wg_cd_LC(info);
		else if (lc == columnDtl_bef_lg_grp_cd) doDtl_bef_lg_grp_cd_LC(info);
		else if (lc == columnDtl_bef_loc_grp_cd) doDtl_bef_loc_grp_cd_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_maker_cd) doDtl_maker_cd_LC(info);
		else if (lc == columnDtl_maker_nm) doDtl_maker_nm_LC(info);
		else if (lc == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_LC(info);
		else if (lc == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_LC(info);
		else if (lc == columnDtl_purc_basis_typ) doDtl_purc_basis_typ_LC(info);
		else if (lc == columnDtl_purc_basis_typ_nm) doDtl_purc_basis_typ_nm_LC(info);
		else if (lc == columnDtl_itm_pay_crryovr_times) doDtl_itm_pay_crryovr_times_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_bp_lot_no) doDtl_bp_lot_no_LC(info);
		else if (lc == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_LC(info);
		else if (lc == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_LC(info);
		else if (lc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_LC(info);
		else if (lc == columnDtl_dlv_cal_cd) doDtl_dlv_cal_cd_LC(info);
		else if (lc == columnDtl_purc_id_typ) doDtl_purc_id_typ_LC(info);
		else if (lc == columnDtl_purc_id_typ_nm) doDtl_purc_id_typ_nm_LC(info);
		else if (lc == columnDtl_po_conf_rcpt_dt) doDtl_po_conf_rcpt_dt_LC(info);
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
		else if (lc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl_purc_sts_typ) doDtl_purc_sts_typ_LC(info);
		else if (lc == columnDtl_purc_sts_typ_nm) doDtl_purc_sts_typ_nm_LC(info);
		else if (lc == columnDtl_dlv_inst_qty) doDtl_dlv_inst_qty_LC(info);
		else if (lc == columnDtl_dlv_inst_prms_rcpt_qty) doDtl_dlv_inst_prms_rcpt_qty_LC(info);
		else if (lc == columnDtl_rcpt_iv_qty) doDtl_rcpt_iv_qty_LC(info);
		else if (lc == columnDtl_arr_qty) doDtl_arr_qty_LC(info);
		else if (lc == columnDtl_purc_qty) doDtl_purc_qty_LC(info);
		else if (lc == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_LC(info);
		else if (lc == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_LC(info);
		else if (lc == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_LC(info);
		else if (lc == columnDtl_old_trd_cur_upri) doDtl_old_trd_cur_upri_LC(info);
		else if (lc == columnDtl_old_trd_cur_proc_upri) doDtl_old_trd_cur_proc_upri_LC(info);
		else if (lc == columnDtl_old_trd_cur_onr_prov_upri) doDtl_old_trd_cur_onr_prov_upri_LC(info);
		else if (lc == columnDtl_old_trd_cur_dscnt_amt) doDtl_old_trd_cur_dscnt_amt_LC(info);
		else if (lc == columnDtl_old_dscnt_rsn_cd) doDtl_old_dscnt_rsn_cd_LC(info);
		else if (lc == columnDtl_old_dscnt_rsn_nm) doDtl_old_dscnt_rsn_nm_LC(info);
		else if (lc == columnDtl_wtax_rate) doDtl_wtax_rate_LC(info);
		else if (lc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_LC(info);
		else if (lc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_LC(info);
		else if (lc == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_LC(info);
		else if (lc == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_LC(info);
		else if (lc == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_LC(info);
		else if (lc == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_LC(info);
		else if (lc == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_po_cnt_rmrks) doDtl_po_cnt_rmrks_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_po_print_d_rmrks) doDtl_po_print_d_rmrks_LC(info);
		else if (lc == columnDtl_dlv_slip_d_rmrks) doDtl_dlv_slip_d_rmrks_LC(info);
		else if (lc == columnDtl_arr_cnt_rmrks) doDtl_arr_cnt_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_edi_sub_d_char1) doDtl_edi_sub_d_char1_LC(info);
		else if (lc == columnDtl_edi_sub_d_char2) doDtl_edi_sub_d_char2_LC(info);
		else if (lc == columnDtl_edi_sub_d_char3) doDtl_edi_sub_d_char3_LC(info);
		else if (lc == columnDtl_edi_sub_d_char4) doDtl_edi_sub_d_char4_LC(info);
		else if (lc == columnDtl_edi_sub_d_char5) doDtl_edi_sub_d_char5_LC(info);
		else if (lc == columnDtl_edi_sub_d_num1) doDtl_edi_sub_d_num1_LC(info);
		else if (lc == columnDtl_edi_sub_d_dt1) doDtl_edi_sub_d_dt1_LC(info);
		else if (lc == columnDtl_ext_po_d_no) doDtl_ext_po_d_no_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_LC(info);
		else if (lc == columnDtl_dlv_slip_seq) doDtl_dlv_slip_seq_LC(info);
		else if (lc == columnDtl_purc_ddlv_dlv_slip_no) doDtl_purc_ddlv_dlv_slip_no_LC(info);
		else if (lc == columnDtl_dlv_slip_mng_no) doDtl_dlv_slip_mng_no_LC(info);
		else if (lc == columnDtl_dlv_slip_mng_seq) doDtl_dlv_slip_mng_seq_LC(info);
		else if (lc == columnDtl_po_schd_src_typ) doDtl_po_schd_src_typ_LC(info);
		else if (lc == columnDtl_po_schd_src_typ_nm) doDtl_po_schd_src_typ_nm_LC(info);
		else if (lc == columnDtl_po_schd_src_no) doDtl_po_schd_src_no_LC(info);
		else if (lc == columnDtl_rqst_fr_usr_cd) doDtl_rqst_fr_usr_cd_LC(info);
		else if (lc == columnDtl_rqst_fr_usr_nm) doDtl_rqst_fr_usr_nm_LC(info);
		else if (lc == columnDtl_rqst_fr_dpt_cd) doDtl_rqst_fr_dpt_cd_LC(info);
		else if (lc == columnDtl_rqst_fr_dpt_nm) doDtl_rqst_fr_dpt_nm_LC(info);
		else if (lc == columnDtl_po_schd_no) doDtl_po_schd_no_LC(info);
		else if (lc == columnDtl_po_d_no) doDtl_po_d_no_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_mfg_loc_wg_cd) doDtl_mfg_loc_wg_cd_LC(info);
		else if (lc == columnDtl2_dtl_peg_no) doDtl2_dtl_peg_no_LC(info);
		else if (lc == columnDtl2_po_schd_no) doDtl2_po_schd_no_LC(info);
		else if (lc == columnDtl2_po_d_no) doDtl2_po_d_no_LC(info);
		else if (lc == columnDtl2_po_schd_upd_cntr) doDtl2_po_schd_upd_cntr_LC(info);
		else if (lc == columnDtl2_arr_pr_upd_cntr) doDtl2_arr_pr_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rev_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rev_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd2]パネルの[po_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd2_po_schd_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_dt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_ship_form_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_ship_form_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mst_ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mst_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_pay_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dpt_wg_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wtax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wtax_rnd_typ_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_print_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_print_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_po_print_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_po_print_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_crct_rsn_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_crct_rsn_rmrks_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[edi_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char4_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_char5_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_num1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[edi_sub_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_edi_sub_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_po_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[po_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_avl_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_avl_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_amt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[inc_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_inc_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_in_to_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_pay_crryovr_times_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_conf_rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_conf_rcpt_dt_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_inst_prms_rcpt_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_inst_prms_rcpt_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_proc_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_onr_prov_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_dscnt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_dscnt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_dscnt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[bd_lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cnt_rmrks_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[edi_sub_d_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_char5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_num1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_sub_d_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_sub_d_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_po_d_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_mng_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_mng_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_fr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_fr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[arr_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_arr_pr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_sppl_cd]の作成メソッド
	 */
	public MCList getHdr_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_purc_usr_dpt_p_PPanel_UsrDpt_usr_cd]の作成メソッド
	 */
	public MCList getHdr_purc_usr_dpt_p_PPanel_UsrDpt_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cur_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_base_cur_cd]の作成メソッド
	 */
	public MCList getHdr_base_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_po_print_cd]の作成メソッド
	 */
	public MCList getHdr_po_print_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPoPrint(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_po_crct_rsn_cd]の作成メソッド
	 */
	public MCList getHdr_po_crct_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0050.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0050.MSUAP_List", this)).getPoCrctRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_tterm_cd1]の作成メソッド
	 */
	public MCList getHdr_tterm_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_tterm_cd2]の作成メソッド
	 */
	public MCList getHdr_tterm_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_tterm_cd3]の作成メソッド
	 */
	public MCList getHdr_tterm_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_asppl_cd]の作成メソッド
	 */
	public MCList getHdr_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_in_to_loc_cd]の作成メソッド
	 */
	public MCList getDtl_in_to_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_drct_dlv_typ]の作成メソッド
	 */
	public MCList getDtl_drct_dlv_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDrctDlvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlWithSpplMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSub1WithSpplMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSub2WithSpplMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSub3WithSpplMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_asset_mng_typ]の作成メソッド
	 */
	public MCList getDtl_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_maker_cd]の作成メソッド
	 */
	public MCList getDtl_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_basis_typ]の作成メソッド
	 */
	public MCList getDtl_purc_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBasisTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getDtl_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_id_typ]の作成メソッド
	 */
	public MCList getDtl_purc_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_upri_req_typ]の作成メソッド
	 */
	public MCList getDtl_purc_upri_req_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcUpriReqTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mfg_loc_cd]の作成メソッド
	 */
	public MCList getDtl_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bom_ptn]の作成メソッド
	 */
	public MCList getDtl_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_purc_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBDL0080.Srch01")) {
			return new MS_MSBDL0080_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0080.Srch02")) {
			return new MS_MSBDL0080_Srch02Bridge();
		}
		if (id.equals("MS.MSBDL0080.Ins01")) {
			return new MS_MSBDL0080_Ins01Bridge();
		}
		if (id.equals("MS.MSBDL0080.Upd01")) {
			return new MS_MSBDL0080_Upd01Bridge();
		}
		if (id.equals("MS.MSBDL0080.Del01")) {
			return new MS_MSBDL0080_Del01Bridge();
		}
		if (id.equals("MS.MSBDL0080.Sprt02")) {
			return new MS_MSBDL0080_Sprt02Bridge();
		}
		if (id.equals("MS.MSBDL0080.Sprt03")) {
			return new MS_MSBDL0080_Sprt03Bridge();
		}
		if (id.equals("MS.MSBDL0080.Sprt04")) {
			return new MS_MSBDL0080_Sprt04Bridge();
		}
		if (id.equals("MS.MSBDL0080.Prnt01")) {
			return new MS_MSBDL0080_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0080_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0080_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0080_Srch01Bridge() {
			p_MS_MSBDL0080_Srch01 = new MCParam(PDef.MS_MSBDL0080_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0080_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0080.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.Dtl2R.class));

			p_MS_MSBDL0080_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0080_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0080_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0080_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0080_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0080.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0080.CndR)up(0);
		}

		protected mcframe.clientMSBD.MSBDP0080.HdrR down0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0080_Srch01.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			p_MS_MSBDL0080_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			p_MS_MSBDL0080_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0080_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBD.MSBDP0080.HdrR)p_MS_MSBDL0080_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)p_MS_MSBDL0080_Srch01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R>)p_MS_MSBDL0080_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getDtl2L().clear();
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
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0080_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0080_Srch02;

		/** コンストラクタ */
		protected MS_MSBDL0080_Srch02Bridge() {
			p_MS_MSBDL0080_Srch02 = new MCParam(PDef.MS_MSBDL0080_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0080_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.Cnd2R.class));
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.Dtl2R.class));

			p_MS_MSBDL0080_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0080_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0080_Srch02.addUpBlock(getCnd2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0080_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0080_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0080.Cnd2R> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.Cnd2R>)up(0);
		}

		protected mcframe.clientMSBD.MSBDP0080.HdrR down0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0080_Srch02.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			p_MS_MSBDL0080_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			p_MS_MSBDL0080_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0080_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBD.MSBDP0080.HdrR)p_MS_MSBDL0080_Srch02.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)p_MS_MSBDL0080_Srch02.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R>)p_MS_MSBDL0080_Srch02.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCnd2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0080_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0080_Ins01;

		/** コンストラクタ */
		protected MS_MSBDL0080_Ins01Bridge() {
			p_MS_MSBDL0080_Ins01 = new MCParam(PDef.MS_MSBDL0080_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0080_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.Dtl2R.class));
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));

			p_MS_MSBDL0080_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0080_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0080_Ins01.addUpBlock(getHdrR());
			p_MS_MSBDL0080_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBDL0080_Ins01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0080_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0080_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0080.HdrR up0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R> up2() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R>)up(2);
		}

		protected mcframe.clientMSBD.MSBDP0080.HdrR down0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0080_Ins01.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			p_MS_MSBDL0080_Ins01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0080_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBD.MSBDP0080.HdrR)p_MS_MSBDL0080_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)p_MS_MSBDL0080_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtl2L());
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
	 * [MS_MSBDL0080_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0080_Upd01;

		/** コンストラクタ */
		protected MS_MSBDL0080_Upd01Bridge() {
			p_MS_MSBDL0080_Upd01 = new MCParam(PDef.MS_MSBDL0080_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0080_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.Dtl2R.class));
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));

			p_MS_MSBDL0080_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0080_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0080_Upd01.addUpBlock(getHdrR());
			p_MS_MSBDL0080_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBDL0080_Upd01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0080_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0080_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0080.HdrR up0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R> up2() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R>)up(2);
		}

		protected mcframe.clientMSBD.MSBDP0080.HdrR down0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0080_Upd01.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			p_MS_MSBDL0080_Upd01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0080_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBD.MSBDP0080.HdrR)p_MS_MSBDL0080_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)p_MS_MSBDL0080_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtl2L());
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
	 * [MS_MSBDL0080_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0080_Del01;

		/** コンストラクタ */
		protected MS_MSBDL0080_Del01Bridge() {
			p_MS_MSBDL0080_Del01 = new MCParam(PDef.MS_MSBDL0080_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0080_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.Dtl2R.class));
			// Down

			p_MS_MSBDL0080_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0080_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0080_Del01.addUpBlock(getHdrR());
			p_MS_MSBDL0080_Del01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBDL0080_Del01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0080_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0080_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0080.HdrR up0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R> up2() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.Dtl2R>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBDL0080_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBDL0080_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Sprt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0080_Sprt02;

		/** コンストラクタ */
		protected MS_MSBDL0080_Sprt02Bridge() {
			p_MS_MSBDL0080_Sprt02 = new MCParam(PDef.MS_MSBDL0080_Sprt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0080_Sprt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));

			p_MS_MSBDL0080_Sprt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0080_Sprt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0080_Sprt02.addUpBlock(getHdrR());
			p_MS_MSBDL0080_Sprt02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0080_Sprt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0080_Sprt02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0080.HdrR up0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0080_Sprt02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0080_Sprt02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)p_MS_MSBDL0080_Sprt02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
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
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0080_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Sprt03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0080_Sprt03;

		/** コンストラクタ */
		protected MS_MSBDL0080_Sprt03Bridge() {
			p_MS_MSBDL0080_Sprt03 = new MCParam(PDef.MS_MSBDL0080_Sprt03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0080_Sprt03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));

			p_MS_MSBDL0080_Sprt03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0080_Sprt03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0080_Sprt03.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0080_Sprt03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0080_Sprt03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0080_Sprt03.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0080_Sprt03;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)p_MS_MSBDL0080_Sprt03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0080_Sprt04]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Sprt04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0080_Sprt04;

		/** コンストラクタ */
		protected MS_MSBDL0080_Sprt04Bridge() {
			p_MS_MSBDL0080_Sprt04 = new MCParam(PDef.MS_MSBDL0080_Sprt04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0080_Sprt04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));

			p_MS_MSBDL0080_Sprt04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0080_Sprt04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0080_Sprt04.addUpBlock(getHdrR());
			p_MS_MSBDL0080_Sprt04.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0080_Sprt04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0080_Sprt04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0080.HdrR up0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)up(1);
		}

		protected mcframe.clientMSBD.MSBDP0080.HdrR down0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0080_Sprt04.addDownBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			p_MS_MSBDL0080_Sprt04.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0080_Sprt04;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBD.MSBDP0080.HdrR)p_MS_MSBDL0080_Sprt04.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)p_MS_MSBDL0080_Sprt04.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBDL0080_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0080_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0080_Prnt01;

		/** コンストラクタ */
		protected MS_MSBDL0080_Prnt01Bridge() {
			p_MS_MSBDL0080_Prnt01 = new MCParam(PDef.MS_MSBDL0080_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0080_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0080.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0080.DtlR.class));
			// Down

			p_MS_MSBDL0080_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0080_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0080_Prnt01.addUpBlock(getHdrR());
			p_MS_MSBDL0080_Prnt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0080_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0080_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0080.HdrR up0() {
			return (mcframe.clientMSBD.MSBDP0080.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0080.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0080.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBDL0080_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}