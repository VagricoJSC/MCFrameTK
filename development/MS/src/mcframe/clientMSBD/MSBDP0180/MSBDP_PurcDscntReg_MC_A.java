package mcframe.clientMSBD.MSBDP0180;

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
import mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Srch01Caller;
import mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Srch02Caller;
import mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Ins01Caller;
import mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Upd01Caller;
import mcframe.clientMSBD.MSBDP0180.MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Del01Caller;

/**
 * 画面"MSBDP_PurcDscntReg"パネルクラスです。<p>
 *
 * 仕入値引、仕入値増を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PurcDscntReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBDP0180";

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
	public MCButton Cnd_srch_purc_act = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_purc_dscnt = null;
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
	public MCLabel Hdr_purc_act_no_Label = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_purc_act_no = null;
	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_purc_act_rev = null;
	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumberField Hdr_purc_act_seq = null;
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
	public MCLabel Hdr_purc_dt_Label = null;
	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDateField Hdr_purc_dt = null;
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H Hdr_ac_dt_p_PPanel;
	public MCDateField Hdr_ac_dt;	// [Hdr]の[ac_dt_p.ac_dt]を[Hdr_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H Hdr_can_ac_dt_p_PPanel;
	public MCDateField Hdr_can_ac_dt_for_input;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_input]を[Hdr_can_ac_dt_for_input]としてエイリアス定義。
	public MCDateField Hdr_can_ac_dt;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_call]を[Hdr_can_ac_dt]としてエイリアス定義。
	public MCDateField Hdr_ac_dt_after_srch;	// [Hdr]の[can_ac_dt_p.ac_dt_after_srch]を[Hdr_ac_dt_after_srch]としてエイリアス定義。
	public MCLabel Hdr_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField Hdr_ac_ym = null;
	public MCLabel Hdr_pay_basis_dt_Label = null;
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDateField Hdr_pay_basis_dt = null;
	public MCLabel Hdr_pay_schd_dt_Label = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDateField Hdr_pay_schd_dt = null;
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
	public MCLabel Hdr_rcpt_iv_no_Label = null;
	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_rcpt_iv_no = null;
	public MCLabel Hdr_ref_rcpt_iv_no_Label = null;
	/**
	 * Corresponding receipt I/V No. 対応受領Ｉ／Ｖ　ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ref_rcpt_iv_no = null;
	/**
	 * For I/V transaction Ｉ／Ｖ取引対象.<p>
	 *
	 */
	public MCCheckBox Hdr_sppl_iv_flg = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCCheckBox Hdr_pay_spot_flg = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_prnt_lcl_cd = null;
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
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public MCTextField Hdr_purc_tax_calc_typ = null;
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
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public MCNumberField Hdr_sppl_pay_crryovr_times = null;
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
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_xrate_p_PPanel;
	public MCNumberField Hdr_xrate;	// [Hdr]の[xrate_p.xrate]を[Hdr_xrate]としてエイリアス定義。
	public MCLabel Hdr_ptax_cur_cd_Label = null;
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_ptax_cur_cd = null;
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
	public MCLabel Hdr_ptax_dt_Label = null;
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCDateField Hdr_ptax_dt = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_prax_xrate_p_PPanel;
	public MCNumberField Hdr_ptax_xrate;	// [Hdr]の[prax_xrate_p.xrate]を[Hdr_ptax_xrate]としてエイリアス定義。
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_xrate_cd = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_amt_p_PPanel;
	public MCNumberField Hdr_trd_cur_amt;	// [Hdr]の[trd_cur_amt_p.amt]を[Hdr_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_inc_tax_amt_p_PPanel;
	public MCNumberField Hdr_trd_cur_inc_tax_amt;	// [Hdr]の[trd_cur_inc_tax_amt_p.amt]を[Hdr_trd_cur_inc_tax_amt]としてエイリアス定義。
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
	public MCLabel Hdr_ref_no_Label = null;
	/**
	 * Reference info. No. 参考情報ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ref_no = null;
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
	 * Allow unit price change 単価変更許可.<p>
	 *
	 */
	public MCCheckBox Hdr_dummy_upri_cng_flg = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_ap_dpt_cd_Label = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField BulkSet_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCTextField BulkSet_ap_dpt_nm = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0180.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
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
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_pay_crryovr_times = null;
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
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
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_itm_nm = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Dtl_lot_no_p_PPanel;
	public MCColumnConfig columnDtl_crt_lot_flg;// [Dtl]の[lot_no_p.crt_lot_flg]を[columnDtl_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_lot_no;// [Dtl]の[lot_no_p.lot_no]を[columnDtl_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_sublot_no;// [Dtl]の[lot_no_p.sublot_no]を[columnDtl_sublot_no]としてエイリアス定義。
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
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
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
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_crryovr_times = null;
	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dtl_upd_flg = null;
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
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_wtax_amt_p_PPanel;
	public MCColumnConfig columnDtl_wtax_amt;// [Dtl]の[wtax_amt_p.amt]を[columnDtl_wtax_amt]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_typ = null;
	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_typ_nm = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_no = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_no = null;
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
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_d_no = null;
	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_d_seq = null;
	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_purc_act_no = null;
	/**
	 * Reference purchase result rev. number 参照仕入実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_purc_act_rev = null;
	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_purc_act_seq = null;
	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_purc_act_d_no = null;
	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_purc_act_d_seq = null;
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_purc_ac_dt = null;
	/**
	 * Result recording date 実績計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_ac_dt = null;
	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_unit_qty = null;
	/**
	 * Result unit cd. 実績単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_unit_cd = null;
	/**
	 * Result unit name 実績単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_unit_nm = null;
	/**
	 * Result unit price 実績単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_cur_upri = null;
	/**
	 * Result amount 実績金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_cur_amt = null;
	/**
	 * Tax included result amount 実績税込金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_tax_amt = null;
	/**
	 * Result tax cd. 実績税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_tax_cd = null;
	/**
	 * Result tax name 実績税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_tax_nm = null;
	/**
	 * Result tax rate 実績税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_tax_rate = null;
	/**
	 * Result tax amount 実績税額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_cur_tax_amt = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	/** [INS_ACT]モードを表す定数 */
	public static final String INS_ACT = "INS_ACT";
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
	public static final String[] statusArray = new String[]{INS, INS_ACT, FIX_I, SRCH, UPD, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBDL0180_Srch01]のCallerの作成 */
	protected MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Srch01Caller createMS_MSBDL0180_Srch01() {
		MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Srch01Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Srch01Bridge>
		caller = ((MSBDP_PurcDscntReg_MC)this).new MS_MSBDL0180_Srch01Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Srch01Bridge>(
					(MSBDP_PurcDscntReg)this, new MS_MSBDL0180_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0180_Srch01]の呼び出し */
	protected void callMS_MSBDL0180_Srch01() {
		MCCaller caller = createMS_MSBDL0180_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0180_Srch02]のCallerの作成 */
	protected MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Srch02Caller createMS_MSBDL0180_Srch02() {
		MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Srch02Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Srch02Bridge>
		caller = ((MSBDP_PurcDscntReg_MC)this).new MS_MSBDL0180_Srch02Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Srch02Bridge>(
					(MSBDP_PurcDscntReg)this, new MS_MSBDL0180_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBDL0180_Srch02]の呼び出し */
	protected void callMS_MSBDL0180_Srch02() {
		MCCaller caller = createMS_MSBDL0180_Srch02();
		caller.exec();
	}
	/** [MS_MSBDL0180_Ins01]のCallerの作成 */
	protected MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Ins01Caller createMS_MSBDL0180_Ins01() {
		MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Ins01Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Ins01Bridge>
		caller = ((MSBDP_PurcDscntReg_MC)this).new MS_MSBDL0180_Ins01Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Ins01Bridge>(
					(MSBDP_PurcDscntReg)this, new MS_MSBDL0180_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBDL0180_Ins01]の呼び出し */
	protected void callMS_MSBDL0180_Ins01() {
		MCCaller caller = createMS_MSBDL0180_Ins01();
		caller.exec();
	}
	/** [MS_MSBDL0180_Upd01]のCallerの作成 */
	protected MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Upd01Caller createMS_MSBDL0180_Upd01() {
		MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Upd01Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Upd01Bridge>
		caller = ((MSBDP_PurcDscntReg_MC)this).new MS_MSBDL0180_Upd01Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Upd01Bridge>(
					(MSBDP_PurcDscntReg)this, new MS_MSBDL0180_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBDL0180_Upd01]の呼び出し */
	protected void callMS_MSBDL0180_Upd01() {
		MCCaller caller = createMS_MSBDL0180_Upd01();
		caller.exec();
	}
	/** [MS_MSBDL0180_Del01]のCallerの作成 */
	protected MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Del01Caller createMS_MSBDL0180_Del01() {
		MSBDP_PurcDscntReg_MC.MS_MSBDL0180_Del01Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Del01Bridge>
		caller = ((MSBDP_PurcDscntReg_MC)this).new MS_MSBDL0180_Del01Caller<MSBDP_PurcDscntReg, MS_MSBDL0180_Del01Bridge>(
					(MSBDP_PurcDscntReg)this, new MS_MSBDL0180_Del01Bridge());
		return caller;
	}
	/** [MS_MSBDL0180_Del01]の呼び出し */
	protected void callMS_MSBDL0180_Del01() {
		MCCaller caller = createMS_MSBDL0180_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0180.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0180.HdrR aHdrR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0180.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0180.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0180.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0180.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0180.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0180.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBD.MSBDP0180.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBD.MSBDP0180.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBD.MSBDP0180.HdrR createHdrR() {
		return mcframe.clientMSBD.MSBDP0180.HdrR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBD.MSBDP0180.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBD.MSBDP0180.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBD.MSBDP0180.BulkSetR createBulkSetR() {
		return mcframe.clientMSBD.MSBDP0180.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBD.MSBDP0180.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0180.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBD.MSBDP0180.DtlR createDtlR() {
		return mcframe.clientMSBD.MSBDP0180.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0180.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
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
		ret.add(TOPPanel);
		ret.add(HdrTabPanel);
		ret.add(TabPanel);
		ret.add(Tab2Panel);
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcDscntReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PurcDscntReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBDP_PurcDscntReg_MC.jbCreateScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateCnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateTOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateHdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateTab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateHdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateHdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateBulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateDtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateBtn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbCreateEastBtn((MSBDP_PurcDscntReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PurcDscntReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PurcDscntReg p) {
	}

	/**
	 * [TOP]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTOP(MSBDP_PurcDscntReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBDP_PurcDscntReg p) {
	}

	/**
	 * [Tab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab(MSBDP_PurcDscntReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBDP_PurcDscntReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBDP_PurcDscntReg p) {
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
	protected static void jbCreateHdr2(MSBDP_PurcDscntReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBDP_PurcDscntReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBDP_PurcDscntReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$itm_p);
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
		p.Dtl_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$lot_no_p);
		p.Dtl_lot_no_p_PPanel.setName("Dtl.lot_no_p");
		p.columnDtl_crt_lot_flg = p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtl_crt_lot_flg.addAliasName("Dtl.crt_lot_flg", p);
		p.columnDtl_lot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtl_lot_no.addAliasName("Dtl.lot_no", p);
		p.columnDtl_sublot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtl_sublot_no.addAliasName("Dtl.sublot_no", p);
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_trd_cur_upri_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$trd_cur_upri_p);
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
		p.Dtl_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$base_cur_upri_p);
		p.Dtl_base_cur_upri_p_PPanel.setName("Dtl.base_cur_upri_p");
		p.columnDtl_base_cur_upri = p.Dtl_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_upri.addAliasName("Dtl.base_cur_upri", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$base_cur_tax_amt_p);
		p.Dtl_base_cur_tax_amt_p_PPanel.setName("Dtl.base_cur_tax_amt_p");
		p.columnDtl_base_cur_tax_amt = p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_tax_amt.addAliasName("Dtl.base_cur_tax_amt", p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$base_cur_inc_tax_amt_p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_inc_tax_amt_p");
		p.columnDtl_base_cur_inc_tax_amt = p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_inc_tax_amt.addAliasName("Dtl.base_cur_inc_tax_amt", p);
		p.Dtl_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$ptax_cur_upri_p);
		p.Dtl_ptax_cur_upri_p_PPanel.setName("Dtl.ptax_cur_upri_p");
		p.columnDtl_ptax_cur_upri = p.Dtl_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_upri.addAliasName("Dtl.ptax_cur_upri", p);
		p.Dtl_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$ptax_cur_amt_p);
		p.Dtl_ptax_cur_amt_p_PPanel.setName("Dtl.ptax_cur_amt_p");
		p.columnDtl_ptax_cur_amt = p.Dtl_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_amt.addAliasName("Dtl.ptax_cur_amt", p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$ptax_cur_tax_amt_p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.setName("Dtl.ptax_cur_tax_amt_p");
		p.columnDtl_ptax_cur_tax_amt = p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_tax_amt.addAliasName("Dtl.ptax_cur_tax_amt", p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$ptax_cur_inc_tax_amt_p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl.ptax_cur_inc_tax_amt_p");
		p.columnDtl_ptax_cur_inc_tax_amt = p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_inc_tax_amt.addAliasName("Dtl.ptax_cur_inc_tax_amt", p);
		p.Dtl_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$wtax_amt_p);
		p.Dtl_wtax_amt_p_PPanel.setName("Dtl.wtax_amt_p");
		p.columnDtl_wtax_amt = p.Dtl_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_wtax_amt.addAliasName("Dtl.wtax_amt", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$sno_wrk_no_p);
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
		p.Dtl_bditm_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBD.MSBDP0180.DtlR.$bditm_p);
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
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBDP_PurcDscntReg p) {
		p.Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_menu_move_p_PPanel.setName("Btn.menu_move_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBDP_PurcDscntReg p) {
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
	
	
	/** [Hdr_sppl_cd_ListPutter]の定義 */
	private MCListPutter Hdr_sppl_cd_p = null;

	/**
	 * [Hdr_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_sppl_cd_ListPutter() {
		if (Hdr_sppl_cd_p == null) {
			Hdr_sppl_cd_p = createHdr_sppl_cd_ListPutter(Hdr_sppl_cd, "sppl_cd", "sppl_nm","trd_cur_cd","sppl_cntct_dpt","sppl_cntct_psn","sppl_tel","sppl_fax","sppl_cntry_cd","sppl_cntry_nm","sppl_zip_cd","sppl_addr1","sppl_addr2","sppl_addr3","sppl_addr4","sppl_iv_flg","prnt_lcl_cd","asppl_cd","sppl_pay_crryovr_times","pay_spot_flg","purc_amt_rnd_typ","purc_tax_rnd_typ","purc_tax_calc_typ","def_purc_usr_cd","def_purc_dpt_cd","ap_dpt_cd","mst_ap_dpt_cd","tterm_cd1","tterm_cd2","tterm_cd3");

		}
		return Hdr_sppl_cd_p;
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
	
	
	/** [Hdr_ptax_cur_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ptax_cur_cd_p = null;

	/**
	 * [Hdr_ptax_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ptax_cur_cd_ListPutter() {
		if (Hdr_ptax_cur_cd_p == null) {
			Hdr_ptax_cur_cd_p = createHdr_ptax_cur_cd_ListPutter(Hdr_ptax_cur_cd, "ptax_cur_cd", "ptax_cur_nm","ptax_cur_amt_dec_place","ptax_cur_upri_dec_place");

		}
		return Hdr_ptax_cur_cd_p;
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
	
	
	/** [BulkSet_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_ap_dpt_cd_p = null;

	/**
	 * [BulkSet_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_ap_dpt_cd_ListPutter() {
		if (BulkSet_ap_dpt_cd_p == null) {
			BulkSet_ap_dpt_cd_p = createBulkSet_ap_dpt_cd_ListPutter(BulkSet_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return BulkSet_ap_dpt_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","wtax_rate","itm_pay_crryovr_times","lot_mng_typ","sublot_mng_typ","stk_mng_typ");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","wtax_rate","itm_pay_crryovr_times","lot_mng_typ","sublot_mng_typ","stk_mng_typ");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","wtax_rate","itm_pay_crryovr_times","lot_mng_typ","sublot_mng_typ","stk_mng_typ");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","wtax_rate","itm_pay_crryovr_times","lot_mng_typ","sublot_mng_typ","stk_mng_typ");
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
	
	
	/** [Dtl_maker_cd_ListPutter]の定義 */
	private MCListPutter Dtl_maker_cd_p = null;

	/**
	 * [Dtl_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_maker_cd_ListPutter() {
		if (Dtl_maker_cd_p == null) {
			Dtl_maker_cd_p = createDtl_maker_cd_ListPutter(columnDtl_maker_cd, "maker_cd", "maker_nm");

		}
		return Dtl_maker_cd_p;
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
	
	
	/** [Dtl_purc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_purc_typ_p = null;

	/**
	 * [Dtl_purc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_typ_ListPutter() {
		if (Dtl_purc_typ_p == null) {
			Dtl_purc_typ_p = createDtl_purc_typ_ListPutter(columnDtl_purc_typ, "purc_typ", "purc_typ_nm");

		}
		return Dtl_purc_typ_p;
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
	public static MSBDP_PurcDscntReg create(){
		MSBDP_PurcDscntReg p = new MSBDP_PurcDscntReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcDscntReg create(String name){
		MSBDP_PurcDscntReg p = new MSBDP_PurcDscntReg(name);
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
		MSBDP_PurcDscntReg_MC.jbfInitScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitCnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitTOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitHdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitTab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitHdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitHdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitBulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitDtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitBtn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbfInitEastBtn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitCnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitTOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitHdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitTab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitHdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitHdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitBulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitDtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitBtn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.jbInitEastBtn((MSBDP_PurcDscntReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PurcDscntReg p) {
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
		p.Cnd_rev_no = p.beansFactory.createNumberField("Cnd.rev_no");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_srch_purc_act = p.beansFactory.createButton("Cnd.srch_purc_act", "srch");
		p.Cnd_srch_purc_dscnt = p.beansFactory.createButton("Cnd.srch_purc_dscnt", "srch");
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTOP(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.TOPPanel = p.beansFactory.createPanel("TOP");
		// ブロックの項目の初期化
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.TabPanel = p.beansFactory.createPanel("Tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextComboBox("Hdr.trd_cd");
		p.Hdr_trd_cd.setLabel(p.Hdr_trd_cd_Label);
		p.Hdr_trd_nm = p.beansFactory.createTextField("Hdr.trd_nm");
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_purc_act_no_Label = p.beansFactory.createLabel("Hdr.purc_act_no_Label");
		p.Hdr_purc_act_no = p.beansFactory.createTextField("Hdr.purc_act_no");
		p.Hdr_purc_act_no.setLabel(p.Hdr_purc_act_no_Label);
		p.Hdr_purc_act_rev = p.beansFactory.createNumberField("Hdr.purc_act_rev");
		p.Hdr_purc_act_seq = p.beansFactory.createNumberField("Hdr.purc_act_seq");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_purc_dt_Label = p.beansFactory.createLabel("Hdr.purc_dt_Label");
		p.Hdr_purc_dt = p.beansFactory.createDateField("Hdr.purc_dt");
		p.Hdr_purc_dt.setLabel(p.Hdr_purc_dt_Label);
		p.Hdr_ac_ym_Label = p.beansFactory.createLabel("Hdr.ac_ym_Label");
		p.Hdr_ac_ym = p.beansFactory.createDateField("Hdr.ac_ym");
		p.Hdr_ac_ym.setLabel(p.Hdr_ac_ym_Label);
		p.Hdr_pay_basis_dt_Label = p.beansFactory.createLabel("Hdr.pay_basis_dt_Label");
		p.Hdr_pay_basis_dt = p.beansFactory.createDateField("Hdr.pay_basis_dt");
		p.Hdr_pay_basis_dt.setLabel(p.Hdr_pay_basis_dt_Label);
		p.Hdr_pay_schd_dt_Label = p.beansFactory.createLabel("Hdr.pay_schd_dt_Label");
		p.Hdr_pay_schd_dt = p.beansFactory.createDateField("Hdr.pay_schd_dt");
		p.Hdr_pay_schd_dt.setLabel(p.Hdr_pay_schd_dt_Label);
		p.Hdr_sppl_cd_Label = p.beansFactory.createLabel("Hdr.sppl_cd_Label");
		p.Hdr_sppl_cd = p.beansFactory.createTextField("Hdr.sppl_cd");
		p.Hdr_sppl_cd.setLabel(p.Hdr_sppl_cd_Label);
		p.Hdr_sppl_nm = p.beansFactory.createTextField("Hdr.sppl_nm");
		p.Hdr_asppl_cd_Label = p.beansFactory.createLabel("Hdr.asppl_cd_Label");
		p.Hdr_asppl_cd = p.beansFactory.createTextComboBox("Hdr.asppl_cd");
		p.Hdr_asppl_cd.setLabel(p.Hdr_asppl_cd_Label);
		p.Hdr_asppl_nm = p.beansFactory.createTextField("Hdr.asppl_nm");
		p.Hdr_rcpt_iv_no_Label = p.beansFactory.createLabel("Hdr.rcpt_iv_no_Label");
		p.Hdr_rcpt_iv_no = p.beansFactory.createTextField("Hdr.rcpt_iv_no");
		p.Hdr_rcpt_iv_no.setLabel(p.Hdr_rcpt_iv_no_Label);
		p.Hdr_ref_rcpt_iv_no_Label = p.beansFactory.createLabel("Hdr.ref_rcpt_iv_no_Label");
		p.Hdr_ref_rcpt_iv_no = p.beansFactory.createTextField("Hdr.ref_rcpt_iv_no");
		p.Hdr_ref_rcpt_iv_no.setLabel(p.Hdr_ref_rcpt_iv_no_Label);
		p.Hdr_sppl_iv_flg = p.beansFactory.createCheckBox("Hdr.sppl_iv_flg");
		p.Hdr_pay_spot_flg = p.beansFactory.createCheckBox("Hdr.pay_spot_flg");
		p.Hdr_prnt_lcl_cd = p.beansFactory.createTextField("Hdr.prnt_lcl_cd");
		p.Hdr_purc_amt_rnd_typ = p.beansFactory.createTextField("Hdr.purc_amt_rnd_typ");
		p.Hdr_purc_tax_rnd_typ = p.beansFactory.createTextField("Hdr.purc_tax_rnd_typ");
		p.Hdr_purc_tax_calc_typ = p.beansFactory.createTextField("Hdr.purc_tax_calc_typ");
		p.Hdr_ap_dpt_cd = p.beansFactory.createTextField("Hdr.ap_dpt_cd");
		p.Hdr_mst_ap_dpt_cd = p.beansFactory.createTextField("Hdr.mst_ap_dpt_cd");
		p.Hdr_sppl_pay_crryovr_times = p.beansFactory.createNumberField("Hdr.sppl_pay_crryovr_times");
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
		p.Hdr_ptax_cur_cd_Label = p.beansFactory.createLabel("Hdr.ptax_cur_cd_Label");
		p.Hdr_ptax_cur_cd = p.beansFactory.createTextComboBox("Hdr.ptax_cur_cd");
		p.Hdr_ptax_cur_cd.setLabel(p.Hdr_ptax_cur_cd_Label);
		p.Hdr_ptax_cur_nm = p.beansFactory.createTextField("Hdr.ptax_cur_nm");
		p.Hdr_ptax_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.ptax_cur_amt_dec_place");
		p.Hdr_ptax_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.ptax_cur_upri_dec_place");
		p.Hdr_ptax_dt_Label = p.beansFactory.createLabel("Hdr.ptax_dt_Label");
		p.Hdr_ptax_dt = p.beansFactory.createDateField("Hdr.ptax_dt");
		p.Hdr_ptax_dt.setLabel(p.Hdr_ptax_dt_Label);
		p.Hdr_xrate_cd = p.beansFactory.createTextField("Hdr.xrate_cd");
		p.Hdr_trd_rmrks_Label = p.beansFactory.createLabel("Hdr.trd_rmrks_Label");
		p.Hdr_trd_rmrks = p.beansFactory.createTextField("Hdr.trd_rmrks");
		p.Hdr_trd_rmrks.setLabel(p.Hdr_trd_rmrks_Label);
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
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
		p.Hdr_ref_no_Label = p.beansFactory.createLabel("Hdr.ref_no_Label");
		p.Hdr_ref_no = p.beansFactory.createTextField("Hdr.ref_no");
		p.Hdr_ref_no.setLabel(p.Hdr_ref_no_Label);
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
		p.Hdr_dummy_upri_cng_flg = p.beansFactory.createCheckBox("Hdr.dummy_upri_cng_flg");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_ap_dpt_cd_Label = p.beansFactory.createLabel("BulkSet.ap_dpt_cd_Label");
		p.BulkSet_ap_dpt_cd = p.beansFactory.createTextField("BulkSet.ap_dpt_cd");
		p.BulkSet_ap_dpt_cd.setLabel(p.BulkSet_ap_dpt_cd_Label);
		p.BulkSet_ap_dpt_nm = p.beansFactory.createTextField("BulkSet.ap_dpt_nm");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_itm_pay_crryovr_times = p.beansFactory.createTableColumn("Dtl.itm_pay_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_maker_cd = p.beansFactory.createTableColumn("Dtl.maker_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_maker_nm = p.beansFactory.createTableColumn("Dtl.maker_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_itm_cd = p.beansFactory.createTableColumn("Dtl.sppl_itm_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_itm_nm = p.beansFactory.createTableColumn("Dtl.sppl_itm_nm", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl.ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_nm = p.beansFactory.createTableColumn("Dtl.ap_dpt_nm", MCColumnType.TEXT);
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
		p.columnDtl_pay_crryovr_times = p.beansFactory.createTableColumn("Dtl.pay_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_purc_dtl_upd_flg = p.beansFactory.createTableColumn("Dtl.purc_dtl_upd_flg", MCColumnType.CHECK);
		p.columnDtl_dscnt_rsn_cd = p.beansFactory.createTableColumn("Dtl.dscnt_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dscnt_rsn_nm = p.beansFactory.createTableColumn("Dtl.dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_wtax_rate = p.beansFactory.createTableColumn("Dtl.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_purc_typ = p.beansFactory.createTableColumn("Dtl.purc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_po_no = p.beansFactory.createTableColumn("Dtl.po_no", MCColumnType.TEXT);
		p.columnDtl_bd_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_lot_no_typ = p.beansFactory.createTableColumn("Dtl.bd_lot_no_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sublot_no_typ = p.beansFactory.createTableColumn("Dtl.bd_sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_purc_act_d_no = p.beansFactory.createTableColumn("Dtl.purc_act_d_no", MCColumnType.TEXT);
		p.columnDtl_purc_act_d_seq = p.beansFactory.createTableColumn("Dtl.purc_act_d_seq", MCColumnType.NUMBER);
		p.columnDtl_ref_purc_act_no = p.beansFactory.createTableColumn("Dtl.ref_purc_act_no", MCColumnType.TEXT);
		p.columnDtl_ref_purc_act_rev = p.beansFactory.createTableColumn("Dtl.ref_purc_act_rev", MCColumnType.NUMBER);
		p.columnDtl_ref_purc_act_seq = p.beansFactory.createTableColumn("Dtl.ref_purc_act_seq", MCColumnType.NUMBER);
		p.columnDtl_ref_purc_act_d_no = p.beansFactory.createTableColumn("Dtl.ref_purc_act_d_no", MCColumnType.TEXT);
		p.columnDtl_ref_purc_act_d_seq = p.beansFactory.createTableColumn("Dtl.ref_purc_act_d_seq", MCColumnType.NUMBER);
		p.columnDtl_base_purc_ac_dt = p.beansFactory.createTableColumn("Dtl.base_purc_ac_dt", MCColumnType.DATE);
		p.columnDtl_act_ac_dt = p.beansFactory.createTableColumn("Dtl.act_ac_dt", MCColumnType.DATE);
		p.columnDtl_act_unit_qty = p.beansFactory.createTableColumn("Dtl.act_unit_qty", MCColumnType.NUMBER);
		p.columnDtl_act_unit_cd = p.beansFactory.createTableColumn("Dtl.act_unit_cd", MCColumnType.TEXT);
		p.columnDtl_act_unit_nm = p.beansFactory.createTableColumn("Dtl.act_unit_nm", MCColumnType.TEXT);
		p.columnDtl_act_cur_upri = p.beansFactory.createTableColumn("Dtl.act_cur_upri", MCColumnType.NUMBER);
		p.columnDtl_act_cur_amt = p.beansFactory.createTableColumn("Dtl.act_cur_amt", MCColumnType.NUMBER);
		p.columnDtl_act_tax_amt = p.beansFactory.createTableColumn("Dtl.act_tax_amt", MCColumnType.NUMBER);
		p.columnDtl_act_tax_cd = p.beansFactory.createTableColumn("Dtl.act_tax_cd", MCColumnType.TEXT);
		p.columnDtl_act_tax_nm = p.beansFactory.createTableColumn("Dtl.act_tax_nm", MCColumnType.TEXT);
		p.columnDtl_act_tax_rate = p.beansFactory.createTableColumn("Dtl.act_tax_rate", MCColumnType.NUMBER);
		p.columnDtl_act_cur_tax_amt = p.beansFactory.createTableColumn("Dtl.act_cur_tax_amt", MCColumnType.NUMBER);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
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
	protected static void jbfInitEastBtn(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PurcDscntReg p) {
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
	protected static void jbInitCnd(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.TOPPanel);
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0180.CndR.ope_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ);
		p.CndPanel.setLastBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ.setNextBeans(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0180.CndR.srch_tgt_typ_META);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.Cnd_srch_tgt_typ_nm.setLinkBeans(p.Cnd_srch_tgt_typ);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ_nm.setNextBeans(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0180.CndR.srch_tgt_typ_nm_META);
		p.CndPanel.add(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_no.setNextBeans(p.Cnd_rev_no);
		p.Cnd_srch_tgt_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0180.CndR.srch_tgt_no_META);
		p.CndPanel.add(p.Cnd_rev_no);
		p.Cnd_rev_no.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_rev_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0180.CndR.rev_no_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch_purc_act);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0180.CndR.latest_flg_META);
		p.Cnd_srch_purc_act.setIcon("SEARCH");
		p.Cnd_srch_purc_act.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_purc_act);
		p.Cnd_srch_purc_act.setNextBeans(p.Cnd_srch_purc_dscnt);
		p.Cnd_srch_purc_dscnt.setIcon("SEARCH");
		p.Cnd_srch_purc_dscnt.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_purc_dscnt);
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTOP(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.add(p.TOPPanel);
		p.TOPPanel.setNextBeans(p.BulkSetPanel);
		p.TOPPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.TOPPanel.add(p.HdrTabPanel, null);
		p.TOPPanel.setLastBeans(p.HdrTabPanel);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.TabPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.TabPanel);
		p.TabPanel.setNextBeans(p.Tab2Panel);
		p.HdrTabTab.add(p.Tab2Panel, "HdrTab.tab2");
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.TabPanel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
		p.TabPanel.add(p.HdrPanel, null);
		p.TabPanel.setLastBeans(p.HdrPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Hdr2Panel, null);
		p.Tab2Panel.setLastBeans(p.Hdr2Panel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
		p.Hdr_trd_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cd.setLinkBeans(p.Hdr_trd_nm,p.Hdr_trd_ptn_typ);
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_purc_act_no);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_purc_act_no_Label);
		p.HdrPanel.add(p.Hdr_purc_act_no);
		p.Hdr_purc_act_no.setNextBeans(p.Hdr_purc_act_rev);
		p.Hdr_purc_act_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.purc_act_no_META);
		p.HdrPanel.add(p.Hdr_purc_act_rev);
		p.Hdr_purc_act_rev.setNextBeans(p.Hdr_purc_act_seq);
		p.Hdr_purc_act_rev.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.purc_act_rev_META);
		p.HdrPanel.add(p.Hdr_purc_act_seq);
		p.Hdr_purc_act_seq.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_purc_act_seq.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.purc_act_seq_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_can_flg);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_purc_dt);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.can_flg_META);
		p.HdrPanel.add(p.Hdr_purc_dt_Label);
		p.HdrPanel.add(p.Hdr_purc_dt);
		p.Hdr_purc_dt.setNextBeans(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_purc_dt.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.purc_dt_META);
		p.Hdr_purc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_ac_dt_p_PPanel.setNextBeans(p.Hdr_can_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_can_ac_dt_p_PPanel.setNextBeans(p.Hdr_ac_ym);
		p.HdrPanel.add(p.Hdr_ac_ym_Label);
		p.HdrPanel.add(p.Hdr_ac_ym);
		p.Hdr_ac_ym.setNextBeans(p.Hdr_pay_basis_dt);
		p.Hdr_ac_ym.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ac_ym_META);
		p.Hdr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_pay_basis_dt_Label);
		p.HdrPanel.add(p.Hdr_pay_basis_dt);
		p.Hdr_pay_basis_dt.setNextBeans(p.Hdr_pay_schd_dt);
		p.Hdr_pay_basis_dt.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.pay_basis_dt_META);
		p.Hdr_pay_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_pay_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_pay_schd_dt);
		p.Hdr_pay_schd_dt.setNextBeans(p.Hdr_sppl_cd);
		p.Hdr_pay_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.pay_schd_dt_META);
		p.Hdr_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_sppl_cd_Label);
		p.HdrPanel.add(p.Hdr_sppl_cd);
		p.Hdr_sppl_cd.setNextBeans(p.Hdr_sppl_nm);
		p.Hdr_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.sppl_cd_META);
		p.Hdr_sppl_cd.addLinkBeans(p.Hdr_sppl_nm,p.Hdr_trd_cur_cd,p.Hdr_sppl_cntct_dpt,p.Hdr_sppl_cntct_psn,p.Hdr_sppl_tel,p.Hdr_sppl_fax,p.Hdr_sppl_cntry_cd,p.Hdr_sppl_cntry_nm,p.Hdr_sppl_zip_cd,p.Hdr_sppl_addr1,p.Hdr_sppl_addr2,p.Hdr_sppl_addr3,p.Hdr_sppl_addr4,p.Hdr_sppl_iv_flg,p.Hdr_prnt_lcl_cd,p.Hdr_asppl_cd,p.Hdr_sppl_pay_crryovr_times,p.Hdr_pay_spot_flg,p.Hdr_purc_amt_rnd_typ,p.Hdr_purc_tax_rnd_typ,p.Hdr_purc_tax_calc_typ,p.Hdr_def_purc_usr_cd,p.Hdr_def_purc_dpt_cd,p.Hdr_ap_dpt_cd,p.Hdr_mst_ap_dpt_cd,p.Hdr_tterm_cd1,p.Hdr_tterm_cd2,p.Hdr_tterm_cd3);
		p.Hdr_sppl_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_sppl_nm);
		p.Hdr_sppl_nm.setNextBeans(p.Hdr_sppl_p_PPanel);
		p.Hdr_sppl_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.sppl_nm_META);
		p.HdrPanel.add(p.Hdr_sppl_p_PPanel);
		p.Hdr_sppl_p_PPanel.setNextBeans(p.Hdr_asppl_cd);
		p.Hdr_asppl_cd.setListType(MCListType.STRICT);
		p.Hdr_asppl_cd.setLinkBeans(p.Hdr_asppl_nm);
		p.HdrPanel.add(p.Hdr_asppl_cd_Label);
		p.HdrPanel.add(p.Hdr_asppl_cd);
		p.Hdr_asppl_cd.setNextBeans(p.Hdr_asppl_nm);
		p.Hdr_asppl_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.asppl_cd_META);
		p.HdrPanel.add(p.Hdr_asppl_nm);
		p.Hdr_asppl_nm.setNextBeans(p.Hdr_rcpt_iv_no);
		p.Hdr_asppl_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.asppl_nm_META);
		p.HdrPanel.add(p.Hdr_rcpt_iv_no_Label);
		p.HdrPanel.add(p.Hdr_rcpt_iv_no);
		p.Hdr_rcpt_iv_no.setNextBeans(p.Hdr_ref_rcpt_iv_no);
		p.Hdr_rcpt_iv_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.rcpt_iv_no_META);
		p.HdrPanel.add(p.Hdr_ref_rcpt_iv_no_Label);
		p.HdrPanel.add(p.Hdr_ref_rcpt_iv_no);
		p.Hdr_ref_rcpt_iv_no.setNextBeans(p.Hdr_sppl_iv_flg);
		p.Hdr_ref_rcpt_iv_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ref_rcpt_iv_no_META);
		p.HdrPanel.add(p.Hdr_sppl_iv_flg);
		p.Hdr_sppl_iv_flg.setNextBeans(p.Hdr_pay_spot_flg);
		p.Hdr_sppl_iv_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.sppl_iv_flg_META);
		p.HdrPanel.add(p.Hdr_pay_spot_flg);
		p.Hdr_pay_spot_flg.setNextBeans(p.Hdr_prnt_lcl_cd);
		p.Hdr_pay_spot_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.pay_spot_flg_META);
		p.HdrPanel.add(p.Hdr_prnt_lcl_cd);
		p.Hdr_prnt_lcl_cd.setNextBeans(p.Hdr_purc_amt_rnd_typ);
		p.Hdr_prnt_lcl_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.prnt_lcl_cd_META);
		p.HdrPanel.add(p.Hdr_purc_amt_rnd_typ);
		p.Hdr_purc_amt_rnd_typ.setNextBeans(p.Hdr_purc_tax_rnd_typ);
		p.Hdr_purc_amt_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.purc_amt_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_purc_tax_rnd_typ);
		p.Hdr_purc_tax_rnd_typ.setNextBeans(p.Hdr_purc_tax_calc_typ);
		p.Hdr_purc_tax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.purc_tax_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_purc_tax_calc_typ);
		p.Hdr_purc_tax_calc_typ.setNextBeans(p.Hdr_ap_dpt_cd);
		p.Hdr_purc_tax_calc_typ.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.purc_tax_calc_typ_META);
		p.HdrPanel.add(p.Hdr_ap_dpt_cd);
		p.Hdr_ap_dpt_cd.setNextBeans(p.Hdr_mst_ap_dpt_cd);
		p.Hdr_ap_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ap_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_mst_ap_dpt_cd);
		p.Hdr_mst_ap_dpt_cd.setNextBeans(p.Hdr_sppl_pay_crryovr_times);
		p.Hdr_mst_ap_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.mst_ap_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_sppl_pay_crryovr_times);
		p.Hdr_sppl_pay_crryovr_times.setNextBeans(p.Hdr_purc_usr_dpt_p_PPanel);
		p.Hdr_sppl_pay_crryovr_times.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.sppl_pay_crryovr_times_META);
		p.HdrPanel.add(p.Hdr_purc_usr_dpt_p_PPanel);
		p.Hdr_purc_usr_dpt_p_PPanel.setNextBeans(p.Hdr_def_purc_usr_cd);
		p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_purc_dpt_nm,p.Hdr_purc_dpt_wg_cd,p.Hdr_purc_dpt_wg_nm,p.Hdr_ap_dpt_flg);
		p.HdrPanel.add(p.Hdr_def_purc_usr_cd);
		p.Hdr_def_purc_usr_cd.setNextBeans(p.Hdr_def_purc_dpt_cd);
		p.Hdr_def_purc_usr_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.def_purc_usr_cd_META);
		p.HdrPanel.add(p.Hdr_def_purc_dpt_cd);
		p.Hdr_def_purc_dpt_cd.setNextBeans(p.Hdr_ap_dpt_flg);
		p.Hdr_def_purc_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.def_purc_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_ap_dpt_flg);
		p.Hdr_ap_dpt_flg.setNextBeans(p.Hdr_purc_dpt_wg_cd);
		p.Hdr_ap_dpt_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ap_dpt_flg_META);
		p.HdrPanel.add(p.Hdr_purc_dpt_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_purc_dpt_wg_cd);
		p.Hdr_purc_dpt_wg_cd.setNextBeans(p.Hdr_purc_dpt_wg_nm);
		p.Hdr_purc_dpt_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.purc_dpt_wg_cd_META);
		p.HdrPanel.add(p.Hdr_purc_dpt_wg_nm);
		p.Hdr_purc_dpt_wg_nm.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_purc_dpt_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.purc_dpt_wg_nm_META);
		p.Hdr_trd_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cur_cd.setLinkBeans(p.Hdr_trd_cur_nm,p.Hdr_trd_cur_amt_dec_place,p.Hdr_trd_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setNextBeans(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.trd_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_upri_dec_place.setNextBeans(p.Hdr_base_cur_cd);
		p.Hdr_trd_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.trd_cur_upri_dec_place_META);
		p.Hdr_base_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_base_cur_cd.setLinkBeans(p.Hdr_base_cur_nm,p.Hdr_base_cur_amt_dec_place,p.Hdr_base_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_base_cur_amt_dec_place);
		p.Hdr_base_cur_amt_dec_place.setNextBeans(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.base_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_cur_upri_dec_place);
		p.Hdr_base_cur_upri_dec_place.setNextBeans(p.Hdr_xrate_p_PPanel);
		p.Hdr_base_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.base_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_p_PPanel.setNextBeans(p.Hdr_ptax_cur_cd);
		p.Hdr_ptax_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_ptax_cur_cd.setLinkBeans(p.Hdr_ptax_cur_nm,p.Hdr_ptax_cur_amt_dec_place,p.Hdr_ptax_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd);
		p.Hdr_ptax_cur_cd.setNextBeans(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ptax_cur_cd_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_nm.setNextBeans(p.Hdr_ptax_cur_amt_dec_place);
		p.Hdr_ptax_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ptax_cur_nm_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_amt_dec_place);
		p.Hdr_ptax_cur_amt_dec_place.setNextBeans(p.Hdr_ptax_cur_upri_dec_place);
		p.Hdr_ptax_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ptax_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_upri_dec_place);
		p.Hdr_ptax_cur_upri_dec_place.setNextBeans(p.Hdr_ptax_dt);
		p.Hdr_ptax_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ptax_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_ptax_dt_Label);
		p.HdrPanel.add(p.Hdr_ptax_dt);
		p.Hdr_ptax_dt.setNextBeans(p.Hdr_prax_xrate_p_PPanel);
		p.Hdr_ptax_dt.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ptax_dt_META);
		p.Hdr_ptax_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_prax_xrate_p_PPanel);
		p.Hdr_prax_xrate_p_PPanel.setNextBeans(p.Hdr_xrate_cd);
		p.HdrPanel.add(p.Hdr_xrate_cd);
		p.Hdr_xrate_cd.setNextBeans(p.Hdr_trd_cur_amt_p_PPanel);
		p.Hdr_xrate_cd.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.xrate_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_p_PPanel);
		p.Hdr_trd_cur_amt_p_PPanel.setNextBeans(p.Hdr_trd_cur_inc_tax_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_trd_cur_inc_tax_amt_p_PPanel);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.setNextBeans(p.Hdr_trd_rmrks);
		p.HdrPanel.add(p.Hdr_trd_rmrks_Label);
		p.HdrPanel.add(p.Hdr_trd_rmrks);
		p.Hdr_trd_rmrks.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_trd_rmrks.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.trd_rmrks_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_tterm_cd1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.intr_rmrks_META);
		p.Hdr_tterm_cd1.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd1.setLinkBeans(p.Hdr_tterm_nm1);
		p.HdrPanel.add(p.Hdr_tterm_cd1_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd1);
		p.Hdr_tterm_cd1.setNextBeans(p.Hdr_tterm_nm1);
		p.Hdr_tterm_cd1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.tterm_cd1_META);
		p.HdrPanel.add(p.Hdr_tterm_nm1);
		p.Hdr_tterm_nm1.setNextBeans(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_nm1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.tterm_nm1_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_rmrks1.setNextBeans(p.Hdr_tterm_cd2);
		p.Hdr_tterm_rmrks1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.tterm_rmrks1_META);
		p.Hdr_tterm_cd2.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd2.setLinkBeans(p.Hdr_tterm_nm2);
		p.HdrPanel.add(p.Hdr_tterm_cd2_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd2);
		p.Hdr_tterm_cd2.setNextBeans(p.Hdr_tterm_nm2);
		p.Hdr_tterm_cd2.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.tterm_cd2_META);
		p.HdrPanel.add(p.Hdr_tterm_nm2);
		p.Hdr_tterm_nm2.setNextBeans(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_nm2.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.tterm_nm2_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_rmrks2.setNextBeans(p.Hdr_tterm_cd3);
		p.Hdr_tterm_rmrks2.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.tterm_rmrks2_META);
		p.Hdr_tterm_cd3.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd3.setLinkBeans(p.Hdr_tterm_nm3);
		p.HdrPanel.add(p.Hdr_tterm_cd3_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd3);
		p.Hdr_tterm_cd3.setNextBeans(p.Hdr_tterm_nm3);
		p.Hdr_tterm_cd3.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.tterm_cd3_META);
		p.HdrPanel.add(p.Hdr_tterm_nm3);
		p.Hdr_tterm_nm3.setNextBeans(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_nm3.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.tterm_nm3_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_rmrks3.setNextBeans(p.Hdr_ref_no);
		p.Hdr_tterm_rmrks3.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.tterm_rmrks3_META);
		p.HdrPanel.add(p.Hdr_ref_no_Label);
		p.HdrPanel.add(p.Hdr_ref_no);
		p.Hdr_ref_no.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_ref_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ref_no_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_dummy_upri_cng_flg);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.sub_char3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.upd_srv_req_no_META);
		p.HdrPanel.add(p.Hdr_dummy_upri_cng_flg);
		p.Hdr_dummy_upri_cng_flg.setRow(p.getHdrR(), mcframe.clientMSBD.MSBDP0180.HdrR.dummy_upri_cng_flg_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_ap_dpt_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_ap_dpt_cd);
		p.BulkSetPanel.setLastBeans(p.BulkSet_ap_dpt_cd);
		p.BulkSet_ap_dpt_cd.setNextBeans(p.BulkSet_ap_dpt_nm);
		p.BulkSet_ap_dpt_cd.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0180.BulkSetR.ap_dpt_cd_META);
		p.BulkSet_ap_dpt_cd.addLinkBeans(p.BulkSet_ap_dpt_nm);
		p.BulkSet_ap_dpt_cd.setListType(MCListType.STRICT);
		p.BulkSetPanel.add(p.BulkSet_ap_dpt_nm);
		p.BulkSet_ap_dpt_nm.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0180.BulkSetR.ap_dpt_nm_META);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBDP_PurcDscntReg p) {
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
	protected static void jbInitBtn(MSBDP_PurcDscntReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.BtnPanel.setLastBeans(p.Btn_radd);
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
	protected static void jbInitEastBtn(MSBDP_PurcDscntReg p) {
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
		MSBDP_PurcDscntReg_MC.mcInitScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitCnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitTOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitHdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitTab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitHdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitHdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitBulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitDtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitBtn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.mcInitEastBtn((MSBDP_PurcDscntReg)this);

		// [INS]ステータスのモードの設定
		MSBDP_PurcDscntReg_MC.statusInitINS_ScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_Cnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_TOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_HdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_Tab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_Tab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_Hdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_Hdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_BulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_Dtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_Btn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS_EastBtn((MSBDP_PurcDscntReg)this);

		// [INS_ACT]ステータスのモードの設定
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_ScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_Cnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_TOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_HdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_Tab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_Tab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_Hdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_Hdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_BulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_Dtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_Btn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitINS__ACT_EastBtn((MSBDP_PurcDscntReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_ScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_Cnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_TOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_HdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_Tab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_Tab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_Hdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_Hdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_BulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_Dtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_Btn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__I_EastBtn((MSBDP_PurcDscntReg)this);

		// [SRCH]ステータスのモードの設定
		MSBDP_PurcDscntReg_MC.statusInitSRCH_ScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_Cnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_TOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_HdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_Tab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_Tab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_Hdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_Hdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_BulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_Dtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_Btn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitSRCH_EastBtn((MSBDP_PurcDscntReg)this);

		// [UPD]ステータスのモードの設定
		MSBDP_PurcDscntReg_MC.statusInitUPD_ScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_Cnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_TOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_HdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_Tab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_Tab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_Hdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_Hdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_BulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_Dtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_Btn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitUPD_EastBtn((MSBDP_PurcDscntReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_ScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_Cnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_TOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_HdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_Tab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_Tab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_Hdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_Hdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_BulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_Dtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_Btn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__U_EastBtn((MSBDP_PurcDscntReg)this);

		// [DEL]ステータスのモードの設定
		MSBDP_PurcDscntReg_MC.statusInitDEL_ScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_Cnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_TOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_HdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_Tab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_Tab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_Hdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_Hdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_BulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_Dtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_Btn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitDEL_EastBtn((MSBDP_PurcDscntReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_ScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_Cnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_TOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_HdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_Tab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_Tab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_Hdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_Hdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_BulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_Dtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_Btn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitFIX__D_EastBtn((MSBDP_PurcDscntReg)this);

		// [REF]ステータスのモードの設定
		MSBDP_PurcDscntReg_MC.statusInitREF_ScreenOpe((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_Cnd((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_TOP((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_HdrTab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_Tab((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_Tab2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_Hdr((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_Hdr2((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_BulkSet((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_Dtl((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_Btn((MSBDP_PurcDscntReg)this);
		MSBDP_PurcDscntReg_MC.statusInitREF_EastBtn((MSBDP_PurcDscntReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PurcDscntReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PurcDscntReg p) {
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
		p.Cnd_rev_no.setListListener(p);
		p.Cnd_rev_no.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_srch_purc_act.addAllListener(p);
		p.Cnd_srch_purc_act.setAPMethodName("doCnd_srch_purc_act");
		p.Cnd_srch_purc_dscnt.addAllListener(p);
		p.Cnd_srch_purc_dscnt.setAPMethodName("doCnd_srch_purc_dscnt");
	}

	/**
	 *  [TOP]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTOP(MSBDP_PurcDscntReg p) {
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBDP_PurcDscntReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Tab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab(MSBDP_PurcDscntReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBDP_PurcDscntReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBDP_PurcDscntReg p) {
		p.Hdr_trd_cd.setListListener(p);
		p.Hdr_trd_cd.addAllListener(p);
		p.Hdr_trd_nm.setListListener(p);
		p.Hdr_trd_nm.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_purc_act_no.setListListener(p);
		p.Hdr_purc_act_no.addAllListener(p);
		p.Hdr_purc_act_rev.setListListener(p);
		p.Hdr_purc_act_rev.addAllListener(p);
		p.Hdr_purc_act_seq.setListListener(p);
		p.Hdr_purc_act_seq.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_purc_dt.setListListener(p);
		p.Hdr_purc_dt.addAllListener(p);
		p.Hdr_ac_ym.setListListener(p);
		p.Hdr_ac_ym.addAllListener(p);
		p.Hdr_pay_basis_dt.setListListener(p);
		p.Hdr_pay_basis_dt.addAllListener(p);
		p.Hdr_pay_schd_dt.setListListener(p);
		p.Hdr_pay_schd_dt.addAllListener(p);
		p.Hdr_sppl_cd.setListListener(p);
		p.Hdr_sppl_cd.addAllListener(p);
		p.Hdr_sppl_nm.setListListener(p);
		p.Hdr_sppl_nm.addAllListener(p);
		p.Hdr_asppl_cd.setListListener(p);
		p.Hdr_asppl_cd.addAllListener(p);
		p.Hdr_asppl_nm.setListListener(p);
		p.Hdr_asppl_nm.addAllListener(p);
		p.Hdr_rcpt_iv_no.setListListener(p);
		p.Hdr_rcpt_iv_no.addAllListener(p);
		p.Hdr_ref_rcpt_iv_no.setListListener(p);
		p.Hdr_ref_rcpt_iv_no.addAllListener(p);
		p.Hdr_sppl_iv_flg.addAllListener(p);
		p.Hdr_pay_spot_flg.addAllListener(p);
		p.Hdr_prnt_lcl_cd.setListListener(p);
		p.Hdr_prnt_lcl_cd.addAllListener(p);
		p.Hdr_purc_amt_rnd_typ.setListListener(p);
		p.Hdr_purc_amt_rnd_typ.addAllListener(p);
		p.Hdr_purc_tax_rnd_typ.setListListener(p);
		p.Hdr_purc_tax_rnd_typ.addAllListener(p);
		p.Hdr_purc_tax_calc_typ.setListListener(p);
		p.Hdr_purc_tax_calc_typ.addAllListener(p);
		p.Hdr_ap_dpt_cd.setListListener(p);
		p.Hdr_ap_dpt_cd.addAllListener(p);
		p.Hdr_mst_ap_dpt_cd.setListListener(p);
		p.Hdr_mst_ap_dpt_cd.addAllListener(p);
		p.Hdr_sppl_pay_crryovr_times.setListListener(p);
		p.Hdr_sppl_pay_crryovr_times.addAllListener(p);
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
		p.Hdr_ptax_cur_cd.setListListener(p);
		p.Hdr_ptax_cur_cd.addAllListener(p);
		p.Hdr_ptax_cur_nm.setListListener(p);
		p.Hdr_ptax_cur_nm.addAllListener(p);
		p.Hdr_ptax_cur_amt_dec_place.setListListener(p);
		p.Hdr_ptax_cur_amt_dec_place.addAllListener(p);
		p.Hdr_ptax_cur_upri_dec_place.setListListener(p);
		p.Hdr_ptax_cur_upri_dec_place.addAllListener(p);
		p.Hdr_ptax_dt.setListListener(p);
		p.Hdr_ptax_dt.addAllListener(p);
		p.Hdr_xrate_cd.setListListener(p);
		p.Hdr_xrate_cd.addAllListener(p);
		p.Hdr_trd_rmrks.setListListener(p);
		p.Hdr_trd_rmrks.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
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
		p.Hdr_ref_no.setListListener(p);
		p.Hdr_ref_no.addAllListener(p);
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
		p.Hdr_dummy_upri_cng_flg.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBDP_PurcDscntReg p) {
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBDP_PurcDscntReg p) {
		p.BulkSet_ap_dpt_cd.setListListener(p);
		p.BulkSet_ap_dpt_cd.addAllListener(p);
		p.BulkSet_ap_dpt_nm.setListListener(p);
		p.BulkSet_ap_dpt_nm.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBDP_PurcDscntReg p) {
		p.DtlTable.addAllListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_itm_pay_crryovr_times.addAllListener(p);
		p.columnDtl_itm_pay_crryovr_times.setListListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_maker_cd.addAllListener(p);
		p.columnDtl_maker_cd.setListListener(p);
		p.columnDtl_maker_nm.addAllListener(p);
		p.columnDtl_maker_nm.setListListener(p);
		p.columnDtl_sppl_itm_cd.addAllListener(p);
		p.columnDtl_sppl_itm_cd.setListListener(p);
		p.columnDtl_sppl_itm_nm.addAllListener(p);
		p.columnDtl_sppl_itm_nm.setListListener(p);
		p.columnDtl_ap_dpt_cd.addAllListener(p);
		p.columnDtl_ap_dpt_cd.setListListener(p);
		p.columnDtl_ap_dpt_nm.addAllListener(p);
		p.columnDtl_ap_dpt_nm.setListListener(p);
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
		p.columnDtl_pay_crryovr_times.addAllListener(p);
		p.columnDtl_pay_crryovr_times.setListListener(p);
		p.columnDtl_purc_dtl_upd_flg.addAllListener(p);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_dscnt_rsn_cd.addAllListener(p);
		p.columnDtl_dscnt_rsn_cd.setListListener(p);
		p.columnDtl_dscnt_rsn_nm.addAllListener(p);
		p.columnDtl_dscnt_rsn_nm.setListListener(p);
		p.columnDtl_wtax_rate.addAllListener(p);
		p.columnDtl_wtax_rate.setListListener(p);
		p.columnDtl_purc_typ.addAllListener(p);
		p.columnDtl_purc_typ.setListListener(p);
		p.columnDtl_purc_typ_nm.addAllListener(p);
		p.columnDtl_purc_typ_nm.setListListener(p);
		p.columnDtl_mfg_inst_no.addAllListener(p);
		p.columnDtl_mfg_inst_no.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_po_no.addAllListener(p);
		p.columnDtl_po_no.setListListener(p);
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
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_purc_act_d_no.addAllListener(p);
		p.columnDtl_purc_act_d_no.setListListener(p);
		p.columnDtl_purc_act_d_seq.addAllListener(p);
		p.columnDtl_purc_act_d_seq.setListListener(p);
		p.columnDtl_ref_purc_act_no.addAllListener(p);
		p.columnDtl_ref_purc_act_no.setListListener(p);
		p.columnDtl_ref_purc_act_rev.addAllListener(p);
		p.columnDtl_ref_purc_act_rev.setListListener(p);
		p.columnDtl_ref_purc_act_seq.addAllListener(p);
		p.columnDtl_ref_purc_act_seq.setListListener(p);
		p.columnDtl_ref_purc_act_d_no.addAllListener(p);
		p.columnDtl_ref_purc_act_d_no.setListListener(p);
		p.columnDtl_ref_purc_act_d_seq.addAllListener(p);
		p.columnDtl_ref_purc_act_d_seq.setListListener(p);
		p.columnDtl_base_purc_ac_dt.addAllListener(p);
		p.columnDtl_base_purc_ac_dt.setListListener(p);
		p.columnDtl_act_ac_dt.addAllListener(p);
		p.columnDtl_act_ac_dt.setListListener(p);
		p.columnDtl_act_unit_qty.addAllListener(p);
		p.columnDtl_act_unit_qty.setListListener(p);
		p.columnDtl_act_unit_cd.addAllListener(p);
		p.columnDtl_act_unit_cd.setListListener(p);
		p.columnDtl_act_unit_nm.addAllListener(p);
		p.columnDtl_act_unit_nm.setListListener(p);
		p.columnDtl_act_cur_upri.addAllListener(p);
		p.columnDtl_act_cur_upri.setListListener(p);
		p.columnDtl_act_cur_amt.addAllListener(p);
		p.columnDtl_act_cur_amt.setListListener(p);
		p.columnDtl_act_tax_amt.addAllListener(p);
		p.columnDtl_act_tax_amt.setListListener(p);
		p.columnDtl_act_tax_cd.addAllListener(p);
		p.columnDtl_act_tax_cd.setListListener(p);
		p.columnDtl_act_tax_nm.addAllListener(p);
		p.columnDtl_act_tax_nm.setListListener(p);
		p.columnDtl_act_tax_rate.addAllListener(p);
		p.columnDtl_act_tax_rate.setListListener(p);
		p.columnDtl_act_cur_tax_amt.addAllListener(p);
		p.columnDtl_act_cur_tax_amt.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBDP_PurcDscntReg p) {
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
	protected static void mcInitEastBtn(MSBDP_PurcDscntReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBDP_PurcDscntReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch_purc_act.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch_purc_dscnt.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitINS_TOP(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBDP_PurcDscntReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_purc_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_purc_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_purc_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_pay_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_sppl_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_asppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ref_rcpt_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sppl_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_pay_spot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_tax_calc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_def_purc_usr_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_prax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ref_no.putMode(p, INS, MCMode.INVISIBLE);
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
		p.Hdr_dummy_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINS_BulkSet(MSBDP_PurcDscntReg p){
		p.BulkSet_ap_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_ap_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBDP_PurcDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_iv_itm_nm.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sppl_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
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
		p.columnDtl_pay_crryovr_times.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dscnt_rsn_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_dscnt_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtl_purc_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_purc_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_po_no.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_bditm_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
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
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_purc_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_d_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_act_ac_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_unit_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_cur_upri.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_cur_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_tax_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_tax_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_tax_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_tax_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_cur_tax_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBDP_PurcDscntReg p){
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
	protected static void statusInitINS_EastBtn(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS_ACT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_ScreenOpe(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_Cnd(MSBDP_PurcDscntReg p){
		p.Cnd_ope_Group.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Cnd_srch_tgt_no.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Cnd_srch_purc_act.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Cnd_srch_purc_dscnt.putMode(p, INS_ACT, MCMode.INVISIBLE);

	}

	/**
	 * [INS_ACT]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_TOP(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS_ACT]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_HdrTab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS_ACT]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_Tab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_Tab2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS_ACT]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_Hdr(MSBDP_PurcDscntReg p){
		p.Hdr_trd_cd.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.Hdr_trd_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_purc_act_no.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_purc_act_rev.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_purc_act_seq.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_purc_dt.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.Hdr_pay_schd_dt.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.Hdr_sppl_cd.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.Hdr_sppl_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_asppl_cd.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_ref_rcpt_iv_no.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_sppl_iv_flg.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_pay_spot_flg.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_purc_amt_rnd_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_purc_tax_calc_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.Hdr_def_purc_usr_cd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.Hdr_trd_cur_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_cd.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_ptax_dt.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_prax_xrate_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_xrate_cd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_tterm_cd1.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_ref_no.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Hdr_sub_char1.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Hdr_dummy_upri_cng_flg.putMode(p, INS_ACT, MCMode.INVISIBLE);

	}

	/**
	 * [INS_ACT]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_Hdr2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [INS_ACT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_BulkSet(MSBDP_PurcDscntReg p){
		p.BulkSet_ap_dpt_cd.putMode(p, INS_ACT, MCMode.ENABLE);
		p.BulkSet_ap_dpt_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);

	}

	/**
	 * [INS_ACT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_Dtl(MSBDP_PurcDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_iv_itm_nm.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.columnDtl_stk_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, INS_ACT, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, INS_ACT, MCMode.ENABLE);
		p.columnDtl_sppl_itm_nm.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS_ACT, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_cd.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(INS_ACT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_dscnt_rsn_cd.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.columnDtl_dscnt_rsn_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(INS_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS_ACT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtl_purc_typ.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.columnDtl_purc_typ_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, INS_ACT, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, INS_ACT, MCMode.ENABLE);
		p.columnDtl_po_no.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Dtl_bditm_p_PPanel.putStatus(INS_ACT, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.columnDtl_bd_lot_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, INS_ACT, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS_ACT, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS_ACT, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS_ACT, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS_ACT, MCMode.ENABLE);
		p.columnDtl_purc_act_d_no.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_no.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_rev.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_seq.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_d_no.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_d_seq.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, INS_ACT, MCMode.REQUIRED);
		p.columnDtl_act_ac_dt.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_unit_qty.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_unit_cd.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_unit_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_cur_upri.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_cur_amt.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_tax_amt.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_tax_cd.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_tax_nm.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_tax_rate.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_act_cur_tax_amt.putMode(p, INS_ACT, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_ACT, MCMode.READ_ONLY);

	}

	/**
	 * [INS_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_Btn(MSBDP_PurcDscntReg p){
		p.Btn_radd.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS_ACT, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, INS_ACT, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS_ACT, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_ACT, MCMode.DISABLE);

	}

	/**
	 * [INS_ACT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__ACT_EastBtn(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBDP_PurcDscntReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_rev_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_purc_act.putMode(p, FIX_I, MCMode.DISABLE);
		p.Cnd_srch_purc_dscnt.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_TOP(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBDP_PurcDscntReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_purc_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_purc_act_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_purc_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, FIX_I, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_asppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ref_rcpt_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_iv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_pay_spot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_tax_calc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);
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
		p.Hdr_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, FIX_I, MCMode.INVISIBLE);
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
		p.Hdr_dummy_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_I]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_BulkSet(MSBDP_PurcDscntReg p){
		p.BulkSet_ap_dpt_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.BulkSet_ap_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBDP_PurcDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.columnDtl_pay_crryovr_times.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dscnt_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_d_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_unit_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_cur_upri.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_cur_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_tax_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_tax_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_tax_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_tax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_cur_tax_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBDP_PurcDscntReg p){
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
	protected static void statusInitFIX__I_EastBtn(MSBDP_PurcDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBDP_PurcDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBDP_PurcDscntReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch_tgt_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_purc_act.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_purc_dscnt.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TOP(MSBDP_PurcDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBDP_PurcDscntReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, SRCH, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ref_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_pay_spot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_tax_calc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);
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
		p.Hdr_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, SRCH, MCMode.INVISIBLE);
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
		p.Hdr_dummy_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBDP_PurcDscntReg p){
		p.BulkSet_ap_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.BulkSet_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBDP_PurcDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnDtl_pay_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dscnt_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_cur_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBDP_PurcDscntReg p){
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBDP_PurcDscntReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBDP_PurcDscntReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBDP_PurcDscntReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch_tgt_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_purc_act.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_purc_dscnt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TOP(MSBDP_PurcDscntReg p){

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [UPD]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBDP_PurcDscntReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_asppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ref_rcpt_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sppl_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_pay_spot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_tax_calc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_def_purc_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_def_purc_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_dpt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_dpt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ptax_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_prax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ref_no.putMode(p, UPD, MCMode.INVISIBLE);
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
		p.Hdr_dummy_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBDP_PurcDscntReg p){
		p.BulkSet_ap_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBDP_PurcDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sppl_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.columnDtl_pay_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dscnt_rsn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dscnt_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtl_purc_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_bditm_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
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
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_act_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_unit_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_cur_upri.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_cur_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_tax_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_tax_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_cur_tax_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBDP_PurcDscntReg p){
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
	protected static void statusInitUPD_EastBtn(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBDP_PurcDscntReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_purc_act.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_purc_dscnt.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_TOP(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBDP_PurcDscntReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_purc_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_purc_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_purc_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, FIX_U, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_asppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ref_rcpt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_pay_spot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_tax_calc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);
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
		p.Hdr_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, FIX_U, MCMode.INVISIBLE);
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
		p.Hdr_dummy_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBDP_PurcDscntReg p){
		p.BulkSet_ap_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.BulkSet_ap_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBDP_PurcDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.columnDtl_pay_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dscnt_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_unit_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_cur_upri.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_cur_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_tax_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_cur_tax_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBDP_PurcDscntReg p){
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBDP_PurcDscntReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBDP_PurcDscntReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBDP_PurcDscntReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_srch_tgt_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_purc_act.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_purc_dscnt.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TOP(MSBDP_PurcDscntReg p){

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [DEL]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBDP_PurcDscntReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_purc_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_purc_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_purc_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_asppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ref_rcpt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_pay_spot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_tax_calc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);
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
		p.Hdr_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, DEL, MCMode.INVISIBLE);
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
		p.Hdr_dummy_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBDP_PurcDscntReg p){
		p.BulkSet_ap_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.BulkSet_ap_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBDP_PurcDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.columnDtl_pay_crryovr_times.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dscnt_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_unit_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_cur_upri.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_cur_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_tax_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_cur_tax_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBDP_PurcDscntReg p){
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBDP_PurcDscntReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_purc_act.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_purc_dscnt.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_TOP(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBDP_PurcDscntReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_purc_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_purc_act_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_purc_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, FIX_D, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_asppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ref_rcpt_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_iv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_pay_spot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_tax_calc_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);
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
		p.Hdr_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, FIX_D, MCMode.INVISIBLE);
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
		p.Hdr_dummy_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [FIX_D]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_BulkSet(MSBDP_PurcDscntReg p){
		p.BulkSet_ap_dpt_cd.putMode(p, FIX_D, MCMode.ENABLE);
		p.BulkSet_ap_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBDP_PurcDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.columnDtl_pay_crryovr_times.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dscnt_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.columnDtl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_d_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_unit_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_cur_upri.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_cur_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_tax_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_tax_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_tax_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_tax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_cur_tax_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBDP_PurcDscntReg p){
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBDP_PurcDscntReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBDP_PurcDscntReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBDP_PurcDscntReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch_tgt_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rev_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_purc_act.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_purc_dscnt.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitREF_TOP(MSBDP_PurcDscntReg p){

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [REF]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab(MSBDP_PurcDscntReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBDP_PurcDscntReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_sppl_p_PPanel.Addr_show_dtl.putMode(p, REF, MCMode.ENABLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sppl_p_PPanel.Addr_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_asppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ref_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_pay_spot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_tax_calc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ap_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_mst_ap_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sppl_pay_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);
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
		p.Hdr_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_prax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ref_no.putMode(p, REF, MCMode.INVISIBLE);
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
		p.Hdr_dummy_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBDP_PurcDscntReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBDP_PurcDscntReg p){
		p.BulkSet_ap_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.BulkSet_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBDP_PurcDscntReg p){
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_pay_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDtl_pay_crryovr_times.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_dtl_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dscnt_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dscnt_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_wtax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ref_purc_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ref_purc_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_cur_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_cur_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_cur_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBDP_PurcDscntReg p){
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBDP_PurcDscntReg p){

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
		MSBDP_PurcDscntReg_MC.setTableConfigDtl((MSBDP_PurcDscntReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBDP_PurcDscntReg p) {
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_wtax_rate, p.columnDtl_itm_pay_crryovr_times, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_stk_mng_typ);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_wtax_rate, p.columnDtl_itm_pay_crryovr_times, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_stk_mng_typ);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_wtax_rate, p.columnDtl_itm_pay_crryovr_times, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_stk_mng_typ);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_wtax_rate, p.columnDtl_itm_pay_crryovr_times, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_stk_mng_typ);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.asset_mng_typ_META);
		p.columnDtl_asset_mng_typ.addLinkBeans(p.columnDtl_asset_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_itm_pay_crryovr_times.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.itm_pay_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_pay_crryovr_times);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_maker_cd.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.maker_cd_META);
		p.columnDtl_maker_cd.addLinkBeans(p.columnDtl_maker_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_cd);
		p.columnDtl_maker_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.maker_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_nm);
		p.columnDtl_sppl_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sppl_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_itm_cd);
		p.columnDtl_sppl_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sppl_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_itm_nm);
		p.DtlTable.addTable(p.Dtl_lot_no_p_PPanel.LotNoTable);
		p.columnDtl_ap_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.ap_dpt_cd_META);
		p.columnDtl_ap_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_ap_dpt_cd.addLinkBeans(p.columnDtl_ap_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_cd);
		p.columnDtl_ap_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.ap_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_nm);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_rnd_typ,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_conv_qty);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_pay_crryovr_times.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.pay_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_crryovr_times);
		p.columnDtl_purc_dtl_upd_flg.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.purc_dtl_upd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dtl_upd_flg);
		p.DtlTable.addTable(p.Dtl_trd_cur_upri_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_typ, p.columnDtl_tax_rate, p.columnDtl_inc_tax_flg);
		p.columnDtl_dscnt_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.dscnt_rsn_cd_META);
		p.columnDtl_dscnt_rsn_cd.addLinkBeans(p.columnDtl_dscnt_rsn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_rsn_cd);
		p.columnDtl_dscnt_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.dscnt_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_rsn_nm);
		p.DtlTable.addTable(p.Dtl_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.columnDtl_wtax_rate.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rate);
		p.DtlTable.addTable(p.Dtl_wtax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_purc_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.purc_typ_META);
		p.columnDtl_purc_typ.addLinkBeans(p.columnDtl_purc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_typ);
		p.columnDtl_purc_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.purc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_typ_nm);
		p.columnDtl_mfg_inst_no.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_no);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_po_no.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no);
		p.DtlTable.addTable(p.Dtl_bditm_p_PPanel.BdItemTable);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setLinkBeans(p.columnDtl_bd_dpt_nm);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd.setLinkBeans(p.columnDtl_bd_itm_sub1, p.columnDtl_bd_itm_sub2, p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setLinkBeans(p.columnDtl_bd_itm_sub2, p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setLinkBeans(p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setLinkBeans(p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.columnDtl_bd_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.bd_lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_lot_mng_typ);
		p.columnDtl_bd_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.bd_sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sublot_mng_typ);
		p.columnDtl_bd_lot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.bd_lot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_lot_no_typ);
		p.columnDtl_bd_sublot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.bd_sublot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sublot_no_typ);
		p.columnDtl_bd_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.bd_sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno1_mng_typ);
		p.columnDtl_bd_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.bd_sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno2_mng_typ);
		p.columnDtl_bd_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.bd_sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno3_mng_typ);
		p.columnDtl_bd_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.bd_sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno4_mng_typ);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_purc_act_d_no.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.purc_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_d_no);
		p.columnDtl_purc_act_d_seq.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.purc_act_d_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_d_seq);
		p.columnDtl_ref_purc_act_no.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.ref_purc_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_purc_act_no);
		p.columnDtl_ref_purc_act_rev.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.ref_purc_act_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_purc_act_rev);
		p.columnDtl_ref_purc_act_seq.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.ref_purc_act_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_purc_act_seq);
		p.columnDtl_ref_purc_act_d_no.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.ref_purc_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_purc_act_d_no);
		p.columnDtl_ref_purc_act_d_seq.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.ref_purc_act_d_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_purc_act_d_seq);
		p.columnDtl_base_purc_ac_dt.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.base_purc_ac_dt_META);
		p.columnDtl_base_purc_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_purc_ac_dt);
		p.columnDtl_act_ac_dt.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_ac_dt_META);
		p.columnDtl_act_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_act_ac_dt);
		p.columnDtl_act_unit_qty.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_unit_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_unit_qty);
		p.columnDtl_act_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_unit_cd);
		p.columnDtl_act_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_unit_nm);
		p.columnDtl_act_cur_upri.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_cur_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_cur_upri);
		p.columnDtl_act_cur_amt.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_cur_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_cur_amt);
		p.columnDtl_act_tax_amt.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_tax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_tax_amt);
		p.columnDtl_act_tax_cd.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_tax_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_tax_cd);
		p.columnDtl_act_tax_nm.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_tax_nm);
		p.columnDtl_act_tax_rate.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_tax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_tax_rate);
		p.columnDtl_act_cur_tax_amt.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.act_cur_tax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_cur_tax_amt);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBD.MSBDP0180.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_srch_tgt_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_srch_tgt_typ_nm.getListConfig().setPutter(getCnd_srch_tgt_typ_nm_ListPutter());
		Hdr_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cd.getListConfig().setPutter(getHdr_trd_cd_ListPutter());
		Hdr_sppl_cd.getListConfig().setPutter(getHdr_sppl_cd_ListPutter());
		Hdr_asppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_asppl_cd.getListConfig().setPutter(getHdr_asppl_cd_ListPutter());
		Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cur_cd.getListConfig().setPutter(getHdr_trd_cur_cd_ListPutter());
		Hdr_base_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_base_cur_cd.getListConfig().setPutter(getHdr_base_cur_cd_ListPutter());
		Hdr_ptax_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ptax_cur_cd.getListConfig().setPutter(getHdr_ptax_cur_cd_ListPutter());
		Hdr_tterm_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd1.getListConfig().setPutter(getHdr_tterm_cd1_ListPutter());
		Hdr_tterm_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd2.getListConfig().setPutter(getHdr_tterm_cd2_ListPutter());
		Hdr_tterm_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd3.getListConfig().setPutter(getHdr_tterm_cd3_ListPutter());
		BulkSet_ap_dpt_cd.getListConfig().setPutter(getBulkSet_ap_dpt_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_asset_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_asset_mng_typ.getListConfig().setPutter(getDtl_asset_mng_typ_ListPutter());
		columnDtl_maker_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_maker_cd.getListConfig().setPutter(getDtl_maker_cd_ListPutter());
		columnDtl_ap_dpt_cd.getListConfig().setPutter(getDtl_ap_dpt_cd_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		columnDtl_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dscnt_rsn_cd.getListConfig().setPutter(getDtl_dscnt_rsn_cd_ListPutter());
		columnDtl_purc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_typ.getListConfig().setPutter(getDtl_purc_typ_ListPutter());
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
	 * この画面を[INS_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_ACTStatus() {
		status = INS_ACT;
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
		else if (INS_ACT.equals(status)) {
			setINS_ACTStatus();
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
		lp.setListLogicId("MS.MSUAP0010.PurcSrchTgtTyp");
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
	 * [Hdr_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Hdr_ptax_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ptax_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
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
	 * [BulkSet_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Dtl_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Dtl_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
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
	 * [Dtl_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcDscntBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTyp");
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
		if(combo == Cnd_srch_tgt_typ_nm) return getCnd_srch_tgt_typ_nm(row, info);
		if(combo == Hdr_trd_cd) return getHdr_trd_cd(row, info);
		if(combo == Hdr_sppl_cd) return getHdr_sppl_cd(row, info);
		if(combo == Hdr_asppl_cd) return getHdr_asppl_cd(row, info);
		if(combo == Hdr_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_trd_cur_cd) return getHdr_trd_cur_cd(row, info);
		if(combo == Hdr_base_cur_cd) return getHdr_base_cur_cd(row, info);
		if(combo == Hdr_ptax_cur_cd) return getHdr_ptax_cur_cd(row, info);
		if(combo == Hdr_tterm_cd1) return getHdr_tterm_cd1(row, info);
		if(combo == Hdr_tterm_cd2) return getHdr_tterm_cd2(row, info);
		if(combo == Hdr_tterm_cd3) return getHdr_tterm_cd3(row, info);
		if(combo == BulkSet_ap_dpt_cd) return getBulkSet_ap_dpt_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_asset_mng_typ) return getDtl_asset_mng_typ(row, info);
		if(combo == columnDtl_maker_cd) return getDtl_maker_cd(row, info);
		if(combo == columnDtl_ap_dpt_cd) return getDtl_ap_dpt_cd(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == columnDtl_dscnt_rsn_cd) return getDtl_dscnt_rsn_cd(row, info);
		if(combo == columnDtl_purc_typ) return getDtl_purc_typ(row, info);
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
		if (ap == Cnd_srch_purc_act) doCnd_srch_purc_act(info);
		else if (ap == Cnd_srch_purc_dscnt) doCnd_srch_purc_dscnt(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch_purc_act]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_purc_act(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_purc_dscnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_purc_dscnt(MCEventInfo info);

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
		if (vc == Cnd_srch_tgt_typ) return doCnd_srch_tgt_typ_VC(info);
		if (vc == Cnd_srch_tgt_typ_nm) return doCnd_srch_tgt_typ_nm_VC(info);
		if (vc == Cnd_srch_tgt_no) return doCnd_srch_tgt_no_VC(info);
		if (vc == Cnd_rev_no) return doCnd_rev_no_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_purc_act_no) return doHdr_purc_act_no_VC(info);
		if (vc == Hdr_purc_act_rev) return doHdr_purc_act_rev_VC(info);
		if (vc == Hdr_purc_act_seq) return doHdr_purc_act_seq_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_purc_dt) return doHdr_purc_dt_VC(info);
		if (vc == Hdr_ac_ym) return doHdr_ac_ym_VC(info);
		if (vc == Hdr_pay_basis_dt) return doHdr_pay_basis_dt_VC(info);
		if (vc == Hdr_pay_schd_dt) return doHdr_pay_schd_dt_VC(info);
		if (vc == Hdr_sppl_cd) return doHdr_sppl_cd_VC(info);
		if (vc == Hdr_sppl_nm) return doHdr_sppl_nm_VC(info);
		if (vc == Hdr_asppl_cd) return doHdr_asppl_cd_VC(info);
		if (vc == Hdr_asppl_nm) return doHdr_asppl_nm_VC(info);
		if (vc == Hdr_rcpt_iv_no) return doHdr_rcpt_iv_no_VC(info);
		if (vc == Hdr_ref_rcpt_iv_no) return doHdr_ref_rcpt_iv_no_VC(info);
		if (vc == Hdr_sppl_iv_flg) return doHdr_sppl_iv_flg_VC(info);
		if (vc == Hdr_pay_spot_flg) return doHdr_pay_spot_flg_VC(info);
		if (vc == Hdr_prnt_lcl_cd) return doHdr_prnt_lcl_cd_VC(info);
		if (vc == Hdr_purc_amt_rnd_typ) return doHdr_purc_amt_rnd_typ_VC(info);
		if (vc == Hdr_purc_tax_rnd_typ) return doHdr_purc_tax_rnd_typ_VC(info);
		if (vc == Hdr_purc_tax_calc_typ) return doHdr_purc_tax_calc_typ_VC(info);
		if (vc == Hdr_ap_dpt_cd) return doHdr_ap_dpt_cd_VC(info);
		if (vc == Hdr_mst_ap_dpt_cd) return doHdr_mst_ap_dpt_cd_VC(info);
		if (vc == Hdr_sppl_pay_crryovr_times) return doHdr_sppl_pay_crryovr_times_VC(info);
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
		if (vc == Hdr_ptax_cur_cd) return doHdr_ptax_cur_cd_VC(info);
		if (vc == Hdr_ptax_cur_nm) return doHdr_ptax_cur_nm_VC(info);
		if (vc == Hdr_ptax_cur_amt_dec_place) return doHdr_ptax_cur_amt_dec_place_VC(info);
		if (vc == Hdr_ptax_cur_upri_dec_place) return doHdr_ptax_cur_upri_dec_place_VC(info);
		if (vc == Hdr_ptax_dt) return doHdr_ptax_dt_VC(info);
		if (vc == Hdr_xrate_cd) return doHdr_xrate_cd_VC(info);
		if (vc == Hdr_trd_rmrks) return doHdr_trd_rmrks_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_tterm_cd1) return doHdr_tterm_cd1_VC(info);
		if (vc == Hdr_tterm_nm1) return doHdr_tterm_nm1_VC(info);
		if (vc == Hdr_tterm_rmrks1) return doHdr_tterm_rmrks1_VC(info);
		if (vc == Hdr_tterm_cd2) return doHdr_tterm_cd2_VC(info);
		if (vc == Hdr_tterm_nm2) return doHdr_tterm_nm2_VC(info);
		if (vc == Hdr_tterm_rmrks2) return doHdr_tterm_rmrks2_VC(info);
		if (vc == Hdr_tterm_cd3) return doHdr_tterm_cd3_VC(info);
		if (vc == Hdr_tterm_nm3) return doHdr_tterm_nm3_VC(info);
		if (vc == Hdr_tterm_rmrks3) return doHdr_tterm_rmrks3_VC(info);
		if (vc == Hdr_ref_no) return doHdr_ref_no_VC(info);
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
		if (vc == Hdr_dummy_upri_cng_flg) return doHdr_dummy_upri_cng_flg_VC(info);
		if (vc == BulkSet_ap_dpt_cd) return doBulkSet_ap_dpt_cd_VC(info);
		if (vc == BulkSet_ap_dpt_nm) return doBulkSet_ap_dpt_nm_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_itm_pay_crryovr_times) return doDtl_itm_pay_crryovr_times_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_maker_cd) return doDtl_maker_cd_VC(info);
		if (vc == columnDtl_maker_nm) return doDtl_maker_nm_VC(info);
		if (vc == columnDtl_sppl_itm_cd) return doDtl_sppl_itm_cd_VC(info);
		if (vc == columnDtl_sppl_itm_nm) return doDtl_sppl_itm_nm_VC(info);
		if (vc == columnDtl_ap_dpt_cd) return doDtl_ap_dpt_cd_VC(info);
		if (vc == columnDtl_ap_dpt_nm) return doDtl_ap_dpt_nm_VC(info);
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
		if (vc == columnDtl_pay_crryovr_times) return doDtl_pay_crryovr_times_VC(info);
		if (vc == columnDtl_purc_dtl_upd_flg) return doDtl_purc_dtl_upd_flg_VC(info);
		if (vc == columnDtl_dscnt_rsn_cd) return doDtl_dscnt_rsn_cd_VC(info);
		if (vc == columnDtl_dscnt_rsn_nm) return doDtl_dscnt_rsn_nm_VC(info);
		if (vc == columnDtl_wtax_rate) return doDtl_wtax_rate_VC(info);
		if (vc == columnDtl_purc_typ) return doDtl_purc_typ_VC(info);
		if (vc == columnDtl_purc_typ_nm) return doDtl_purc_typ_nm_VC(info);
		if (vc == columnDtl_mfg_inst_no) return doDtl_mfg_inst_no_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_po_no) return doDtl_po_no_VC(info);
		if (vc == columnDtl_bd_lot_mng_typ) return doDtl_bd_lot_mng_typ_VC(info);
		if (vc == columnDtl_bd_sublot_mng_typ) return doDtl_bd_sublot_mng_typ_VC(info);
		if (vc == columnDtl_bd_lot_no_typ) return doDtl_bd_lot_no_typ_VC(info);
		if (vc == columnDtl_bd_sublot_no_typ) return doDtl_bd_sublot_no_typ_VC(info);
		if (vc == columnDtl_bd_sno1_mng_typ) return doDtl_bd_sno1_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno2_mng_typ) return doDtl_bd_sno2_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno3_mng_typ) return doDtl_bd_sno3_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno4_mng_typ) return doDtl_bd_sno4_mng_typ_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_purc_act_d_no) return doDtl_purc_act_d_no_VC(info);
		if (vc == columnDtl_purc_act_d_seq) return doDtl_purc_act_d_seq_VC(info);
		if (vc == columnDtl_ref_purc_act_no) return doDtl_ref_purc_act_no_VC(info);
		if (vc == columnDtl_ref_purc_act_rev) return doDtl_ref_purc_act_rev_VC(info);
		if (vc == columnDtl_ref_purc_act_seq) return doDtl_ref_purc_act_seq_VC(info);
		if (vc == columnDtl_ref_purc_act_d_no) return doDtl_ref_purc_act_d_no_VC(info);
		if (vc == columnDtl_ref_purc_act_d_seq) return doDtl_ref_purc_act_d_seq_VC(info);
		if (vc == columnDtl_base_purc_ac_dt) return doDtl_base_purc_ac_dt_VC(info);
		if (vc == columnDtl_act_ac_dt) return doDtl_act_ac_dt_VC(info);
		if (vc == columnDtl_act_unit_qty) return doDtl_act_unit_qty_VC(info);
		if (vc == columnDtl_act_unit_cd) return doDtl_act_unit_cd_VC(info);
		if (vc == columnDtl_act_unit_nm) return doDtl_act_unit_nm_VC(info);
		if (vc == columnDtl_act_cur_upri) return doDtl_act_cur_upri_VC(info);
		if (vc == columnDtl_act_cur_amt) return doDtl_act_cur_amt_VC(info);
		if (vc == columnDtl_act_tax_amt) return doDtl_act_tax_amt_VC(info);
		if (vc == columnDtl_act_tax_cd) return doDtl_act_tax_cd_VC(info);
		if (vc == columnDtl_act_tax_nm) return doDtl_act_tax_nm_VC(info);
		if (vc == columnDtl_act_tax_rate) return doDtl_act_tax_rate_VC(info);
		if (vc == columnDtl_act_cur_tax_amt) return doDtl_act_cur_tax_amt_VC(info);
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
	 * [Hdr]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_act_seq_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[pay_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_schd_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ref_rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ref_rcpt_iv_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_spot_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_tax_calc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_tax_calc_typ_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_pay_crryovr_times_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ptax_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ref_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[dummy_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dummy_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_ap_dpt_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_pay_crryovr_times_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_crryovr_times_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_inst_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_purc_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_purc_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_purc_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_purc_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_cur_tax_amt_VC(MCEventInfo info){
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
		else if (nc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NC(info);
		else if (nc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NC(info);
		else if (nc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NC(info);
		else if (nc == Cnd_rev_no) doCnd_rev_no_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_purc_act_no) doHdr_purc_act_no_NC(info);
		else if (nc == Hdr_purc_act_rev) doHdr_purc_act_rev_NC(info);
		else if (nc == Hdr_purc_act_seq) doHdr_purc_act_seq_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_purc_dt) doHdr_purc_dt_NC(info);
		else if (nc == Hdr_ac_ym) doHdr_ac_ym_NC(info);
		else if (nc == Hdr_pay_basis_dt) doHdr_pay_basis_dt_NC(info);
		else if (nc == Hdr_pay_schd_dt) doHdr_pay_schd_dt_NC(info);
		else if (nc == Hdr_sppl_cd) doHdr_sppl_cd_NC(info);
		else if (nc == Hdr_sppl_nm) doHdr_sppl_nm_NC(info);
		else if (nc == Hdr_asppl_cd) doHdr_asppl_cd_NC(info);
		else if (nc == Hdr_asppl_nm) doHdr_asppl_nm_NC(info);
		else if (nc == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NC(info);
		else if (nc == Hdr_ref_rcpt_iv_no) doHdr_ref_rcpt_iv_no_NC(info);
		else if (nc == Hdr_sppl_iv_flg) doHdr_sppl_iv_flg_NC(info);
		else if (nc == Hdr_pay_spot_flg) doHdr_pay_spot_flg_NC(info);
		else if (nc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NC(info);
		else if (nc == Hdr_purc_amt_rnd_typ) doHdr_purc_amt_rnd_typ_NC(info);
		else if (nc == Hdr_purc_tax_rnd_typ) doHdr_purc_tax_rnd_typ_NC(info);
		else if (nc == Hdr_purc_tax_calc_typ) doHdr_purc_tax_calc_typ_NC(info);
		else if (nc == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_NC(info);
		else if (nc == Hdr_mst_ap_dpt_cd) doHdr_mst_ap_dpt_cd_NC(info);
		else if (nc == Hdr_sppl_pay_crryovr_times) doHdr_sppl_pay_crryovr_times_NC(info);
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
		else if (nc == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NC(info);
		else if (nc == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NC(info);
		else if (nc == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_ptax_dt) doHdr_ptax_dt_NC(info);
		else if (nc == Hdr_xrate_cd) doHdr_xrate_cd_NC(info);
		else if (nc == Hdr_trd_rmrks) doHdr_trd_rmrks_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_tterm_cd1) doHdr_tterm_cd1_NC(info);
		else if (nc == Hdr_tterm_nm1) doHdr_tterm_nm1_NC(info);
		else if (nc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NC(info);
		else if (nc == Hdr_tterm_cd2) doHdr_tterm_cd2_NC(info);
		else if (nc == Hdr_tterm_nm2) doHdr_tterm_nm2_NC(info);
		else if (nc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NC(info);
		else if (nc == Hdr_tterm_cd3) doHdr_tterm_cd3_NC(info);
		else if (nc == Hdr_tterm_nm3) doHdr_tterm_nm3_NC(info);
		else if (nc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NC(info);
		else if (nc == Hdr_ref_no) doHdr_ref_no_NC(info);
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
		else if (nc == Hdr_dummy_upri_cng_flg) doHdr_dummy_upri_cng_flg_NC(info);
		else if (nc == BulkSet_ap_dpt_cd) doBulkSet_ap_dpt_cd_NC(info);
		else if (nc == BulkSet_ap_dpt_nm) doBulkSet_ap_dpt_nm_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_itm_pay_crryovr_times) doDtl_itm_pay_crryovr_times_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_maker_cd) doDtl_maker_cd_NC(info);
		else if (nc == columnDtl_maker_nm) doDtl_maker_nm_NC(info);
		else if (nc == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NC(info);
		else if (nc == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NC(info);
		else if (nc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NC(info);
		else if (nc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NC(info);
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
		else if (nc == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NC(info);
		else if (nc == columnDtl_purc_dtl_upd_flg) doDtl_purc_dtl_upd_flg_NC(info);
		else if (nc == columnDtl_dscnt_rsn_cd) doDtl_dscnt_rsn_cd_NC(info);
		else if (nc == columnDtl_dscnt_rsn_nm) doDtl_dscnt_rsn_nm_NC(info);
		else if (nc == columnDtl_wtax_rate) doDtl_wtax_rate_NC(info);
		else if (nc == columnDtl_purc_typ) doDtl_purc_typ_NC(info);
		else if (nc == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_NC(info);
		else if (nc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_po_no) doDtl_po_no_NC(info);
		else if (nc == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NC(info);
		else if (nc == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NC(info);
		else if (nc == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NC(info);
		else if (nc == columnDtl_purc_act_d_seq) doDtl_purc_act_d_seq_NC(info);
		else if (nc == columnDtl_ref_purc_act_no) doDtl_ref_purc_act_no_NC(info);
		else if (nc == columnDtl_ref_purc_act_rev) doDtl_ref_purc_act_rev_NC(info);
		else if (nc == columnDtl_ref_purc_act_seq) doDtl_ref_purc_act_seq_NC(info);
		else if (nc == columnDtl_ref_purc_act_d_no) doDtl_ref_purc_act_d_no_NC(info);
		else if (nc == columnDtl_ref_purc_act_d_seq) doDtl_ref_purc_act_d_seq_NC(info);
		else if (nc == columnDtl_base_purc_ac_dt) doDtl_base_purc_ac_dt_NC(info);
		else if (nc == columnDtl_act_ac_dt) doDtl_act_ac_dt_NC(info);
		else if (nc == columnDtl_act_unit_qty) doDtl_act_unit_qty_NC(info);
		else if (nc == columnDtl_act_unit_cd) doDtl_act_unit_cd_NC(info);
		else if (nc == columnDtl_act_unit_nm) doDtl_act_unit_nm_NC(info);
		else if (nc == columnDtl_act_cur_upri) doDtl_act_cur_upri_NC(info);
		else if (nc == columnDtl_act_cur_amt) doDtl_act_cur_amt_NC(info);
		else if (nc == columnDtl_act_tax_amt) doDtl_act_tax_amt_NC(info);
		else if (nc == columnDtl_act_tax_cd) doDtl_act_tax_cd_NC(info);
		else if (nc == columnDtl_act_tax_nm) doDtl_act_tax_nm_NC(info);
		else if (nc == columnDtl_act_tax_rate) doDtl_act_tax_rate_NC(info);
		else if (nc == columnDtl_act_cur_tax_amt) doDtl_act_cur_tax_amt_NC(info);
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
	 * [Hdr]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_seq_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_dt_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ref_rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_tax_calc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_tax_calc_typ_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_pay_crryovr_times_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_no_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[dummy_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dummy_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ap_dpt_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dtl_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dtl_upd_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_purc_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_tax_amt_NC(MCEventInfo info){
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
		else if (ne == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NE(info);
		else if (ne == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NE(info);
		else if (ne == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NE(info);
		else if (ne == Cnd_rev_no) doCnd_rev_no_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_purc_act_no) doHdr_purc_act_no_NE(info);
		else if (ne == Hdr_purc_act_rev) doHdr_purc_act_rev_NE(info);
		else if (ne == Hdr_purc_act_seq) doHdr_purc_act_seq_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_purc_dt) doHdr_purc_dt_NE(info);
		else if (ne == Hdr_ac_ym) doHdr_ac_ym_NE(info);
		else if (ne == Hdr_pay_basis_dt) doHdr_pay_basis_dt_NE(info);
		else if (ne == Hdr_pay_schd_dt) doHdr_pay_schd_dt_NE(info);
		else if (ne == Hdr_sppl_cd) doHdr_sppl_cd_NE(info);
		else if (ne == Hdr_sppl_nm) doHdr_sppl_nm_NE(info);
		else if (ne == Hdr_asppl_cd) doHdr_asppl_cd_NE(info);
		else if (ne == Hdr_asppl_nm) doHdr_asppl_nm_NE(info);
		else if (ne == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NE(info);
		else if (ne == Hdr_ref_rcpt_iv_no) doHdr_ref_rcpt_iv_no_NE(info);
		else if (ne == Hdr_sppl_iv_flg) doHdr_sppl_iv_flg_NE(info);
		else if (ne == Hdr_pay_spot_flg) doHdr_pay_spot_flg_NE(info);
		else if (ne == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NE(info);
		else if (ne == Hdr_purc_amt_rnd_typ) doHdr_purc_amt_rnd_typ_NE(info);
		else if (ne == Hdr_purc_tax_rnd_typ) doHdr_purc_tax_rnd_typ_NE(info);
		else if (ne == Hdr_purc_tax_calc_typ) doHdr_purc_tax_calc_typ_NE(info);
		else if (ne == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_NE(info);
		else if (ne == Hdr_mst_ap_dpt_cd) doHdr_mst_ap_dpt_cd_NE(info);
		else if (ne == Hdr_sppl_pay_crryovr_times) doHdr_sppl_pay_crryovr_times_NE(info);
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
		else if (ne == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NE(info);
		else if (ne == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NE(info);
		else if (ne == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_ptax_dt) doHdr_ptax_dt_NE(info);
		else if (ne == Hdr_xrate_cd) doHdr_xrate_cd_NE(info);
		else if (ne == Hdr_trd_rmrks) doHdr_trd_rmrks_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_tterm_cd1) doHdr_tterm_cd1_NE(info);
		else if (ne == Hdr_tterm_nm1) doHdr_tterm_nm1_NE(info);
		else if (ne == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NE(info);
		else if (ne == Hdr_tterm_cd2) doHdr_tterm_cd2_NE(info);
		else if (ne == Hdr_tterm_nm2) doHdr_tterm_nm2_NE(info);
		else if (ne == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NE(info);
		else if (ne == Hdr_tterm_cd3) doHdr_tterm_cd3_NE(info);
		else if (ne == Hdr_tterm_nm3) doHdr_tterm_nm3_NE(info);
		else if (ne == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NE(info);
		else if (ne == Hdr_ref_no) doHdr_ref_no_NE(info);
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
		else if (ne == Hdr_dummy_upri_cng_flg) doHdr_dummy_upri_cng_flg_NE(info);
		else if (ne == BulkSet_ap_dpt_cd) doBulkSet_ap_dpt_cd_NE(info);
		else if (ne == BulkSet_ap_dpt_nm) doBulkSet_ap_dpt_nm_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_itm_pay_crryovr_times) doDtl_itm_pay_crryovr_times_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_maker_cd) doDtl_maker_cd_NE(info);
		else if (ne == columnDtl_maker_nm) doDtl_maker_nm_NE(info);
		else if (ne == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NE(info);
		else if (ne == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NE(info);
		else if (ne == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NE(info);
		else if (ne == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NE(info);
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
		else if (ne == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NE(info);
		else if (ne == columnDtl_purc_dtl_upd_flg) doDtl_purc_dtl_upd_flg_NE(info);
		else if (ne == columnDtl_dscnt_rsn_cd) doDtl_dscnt_rsn_cd_NE(info);
		else if (ne == columnDtl_dscnt_rsn_nm) doDtl_dscnt_rsn_nm_NE(info);
		else if (ne == columnDtl_wtax_rate) doDtl_wtax_rate_NE(info);
		else if (ne == columnDtl_purc_typ) doDtl_purc_typ_NE(info);
		else if (ne == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_NE(info);
		else if (ne == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_po_no) doDtl_po_no_NE(info);
		else if (ne == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NE(info);
		else if (ne == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NE(info);
		else if (ne == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NE(info);
		else if (ne == columnDtl_purc_act_d_seq) doDtl_purc_act_d_seq_NE(info);
		else if (ne == columnDtl_ref_purc_act_no) doDtl_ref_purc_act_no_NE(info);
		else if (ne == columnDtl_ref_purc_act_rev) doDtl_ref_purc_act_rev_NE(info);
		else if (ne == columnDtl_ref_purc_act_seq) doDtl_ref_purc_act_seq_NE(info);
		else if (ne == columnDtl_ref_purc_act_d_no) doDtl_ref_purc_act_d_no_NE(info);
		else if (ne == columnDtl_ref_purc_act_d_seq) doDtl_ref_purc_act_d_seq_NE(info);
		else if (ne == columnDtl_base_purc_ac_dt) doDtl_base_purc_ac_dt_NE(info);
		else if (ne == columnDtl_act_ac_dt) doDtl_act_ac_dt_NE(info);
		else if (ne == columnDtl_act_unit_qty) doDtl_act_unit_qty_NE(info);
		else if (ne == columnDtl_act_unit_cd) doDtl_act_unit_cd_NE(info);
		else if (ne == columnDtl_act_unit_nm) doDtl_act_unit_nm_NE(info);
		else if (ne == columnDtl_act_cur_upri) doDtl_act_cur_upri_NE(info);
		else if (ne == columnDtl_act_cur_amt) doDtl_act_cur_amt_NE(info);
		else if (ne == columnDtl_act_tax_amt) doDtl_act_tax_amt_NE(info);
		else if (ne == columnDtl_act_tax_cd) doDtl_act_tax_cd_NE(info);
		else if (ne == columnDtl_act_tax_nm) doDtl_act_tax_nm_NE(info);
		else if (ne == columnDtl_act_tax_rate) doDtl_act_tax_rate_NE(info);
		else if (ne == columnDtl_act_cur_tax_amt) doDtl_act_cur_tax_amt_NE(info);
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
	 * [Hdr]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_seq_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_dt_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ref_rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_tax_calc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_tax_calc_typ_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_pay_crryovr_times_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_no_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[dummy_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dummy_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ap_dpt_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dtl_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dtl_upd_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_purc_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_tax_amt_NE(MCEventInfo info){
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
		else if (nx == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NX(info);
		else if (nx == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NX(info);
		else if (nx == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NX(info);
		else if (nx == Cnd_rev_no) doCnd_rev_no_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_purc_act_no) doHdr_purc_act_no_NX(info);
		else if (nx == Hdr_purc_act_rev) doHdr_purc_act_rev_NX(info);
		else if (nx == Hdr_purc_act_seq) doHdr_purc_act_seq_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_purc_dt) doHdr_purc_dt_NX(info);
		else if (nx == Hdr_ac_ym) doHdr_ac_ym_NX(info);
		else if (nx == Hdr_pay_basis_dt) doHdr_pay_basis_dt_NX(info);
		else if (nx == Hdr_pay_schd_dt) doHdr_pay_schd_dt_NX(info);
		else if (nx == Hdr_sppl_cd) doHdr_sppl_cd_NX(info);
		else if (nx == Hdr_sppl_nm) doHdr_sppl_nm_NX(info);
		else if (nx == Hdr_asppl_cd) doHdr_asppl_cd_NX(info);
		else if (nx == Hdr_asppl_nm) doHdr_asppl_nm_NX(info);
		else if (nx == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NX(info);
		else if (nx == Hdr_ref_rcpt_iv_no) doHdr_ref_rcpt_iv_no_NX(info);
		else if (nx == Hdr_sppl_iv_flg) doHdr_sppl_iv_flg_NX(info);
		else if (nx == Hdr_pay_spot_flg) doHdr_pay_spot_flg_NX(info);
		else if (nx == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NX(info);
		else if (nx == Hdr_purc_amt_rnd_typ) doHdr_purc_amt_rnd_typ_NX(info);
		else if (nx == Hdr_purc_tax_rnd_typ) doHdr_purc_tax_rnd_typ_NX(info);
		else if (nx == Hdr_purc_tax_calc_typ) doHdr_purc_tax_calc_typ_NX(info);
		else if (nx == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_NX(info);
		else if (nx == Hdr_mst_ap_dpt_cd) doHdr_mst_ap_dpt_cd_NX(info);
		else if (nx == Hdr_sppl_pay_crryovr_times) doHdr_sppl_pay_crryovr_times_NX(info);
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
		else if (nx == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NX(info);
		else if (nx == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NX(info);
		else if (nx == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_ptax_cur_upri_dec_place) doHdr_ptax_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_ptax_dt) doHdr_ptax_dt_NX(info);
		else if (nx == Hdr_xrate_cd) doHdr_xrate_cd_NX(info);
		else if (nx == Hdr_trd_rmrks) doHdr_trd_rmrks_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_tterm_cd1) doHdr_tterm_cd1_NX(info);
		else if (nx == Hdr_tterm_nm1) doHdr_tterm_nm1_NX(info);
		else if (nx == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NX(info);
		else if (nx == Hdr_tterm_cd2) doHdr_tterm_cd2_NX(info);
		else if (nx == Hdr_tterm_nm2) doHdr_tterm_nm2_NX(info);
		else if (nx == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NX(info);
		else if (nx == Hdr_tterm_cd3) doHdr_tterm_cd3_NX(info);
		else if (nx == Hdr_tterm_nm3) doHdr_tterm_nm3_NX(info);
		else if (nx == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NX(info);
		else if (nx == Hdr_ref_no) doHdr_ref_no_NX(info);
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
		else if (nx == Hdr_dummy_upri_cng_flg) doHdr_dummy_upri_cng_flg_NX(info);
		else if (nx == BulkSet_ap_dpt_cd) doBulkSet_ap_dpt_cd_NX(info);
		else if (nx == BulkSet_ap_dpt_nm) doBulkSet_ap_dpt_nm_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_itm_pay_crryovr_times) doDtl_itm_pay_crryovr_times_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_maker_cd) doDtl_maker_cd_NX(info);
		else if (nx == columnDtl_maker_nm) doDtl_maker_nm_NX(info);
		else if (nx == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NX(info);
		else if (nx == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NX(info);
		else if (nx == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NX(info);
		else if (nx == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NX(info);
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
		else if (nx == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NX(info);
		else if (nx == columnDtl_purc_dtl_upd_flg) doDtl_purc_dtl_upd_flg_NX(info);
		else if (nx == columnDtl_dscnt_rsn_cd) doDtl_dscnt_rsn_cd_NX(info);
		else if (nx == columnDtl_dscnt_rsn_nm) doDtl_dscnt_rsn_nm_NX(info);
		else if (nx == columnDtl_wtax_rate) doDtl_wtax_rate_NX(info);
		else if (nx == columnDtl_purc_typ) doDtl_purc_typ_NX(info);
		else if (nx == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_NX(info);
		else if (nx == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_po_no) doDtl_po_no_NX(info);
		else if (nx == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NX(info);
		else if (nx == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NX(info);
		else if (nx == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NX(info);
		else if (nx == columnDtl_purc_act_d_seq) doDtl_purc_act_d_seq_NX(info);
		else if (nx == columnDtl_ref_purc_act_no) doDtl_ref_purc_act_no_NX(info);
		else if (nx == columnDtl_ref_purc_act_rev) doDtl_ref_purc_act_rev_NX(info);
		else if (nx == columnDtl_ref_purc_act_seq) doDtl_ref_purc_act_seq_NX(info);
		else if (nx == columnDtl_ref_purc_act_d_no) doDtl_ref_purc_act_d_no_NX(info);
		else if (nx == columnDtl_ref_purc_act_d_seq) doDtl_ref_purc_act_d_seq_NX(info);
		else if (nx == columnDtl_base_purc_ac_dt) doDtl_base_purc_ac_dt_NX(info);
		else if (nx == columnDtl_act_ac_dt) doDtl_act_ac_dt_NX(info);
		else if (nx == columnDtl_act_unit_qty) doDtl_act_unit_qty_NX(info);
		else if (nx == columnDtl_act_unit_cd) doDtl_act_unit_cd_NX(info);
		else if (nx == columnDtl_act_unit_nm) doDtl_act_unit_nm_NX(info);
		else if (nx == columnDtl_act_cur_upri) doDtl_act_cur_upri_NX(info);
		else if (nx == columnDtl_act_cur_amt) doDtl_act_cur_amt_NX(info);
		else if (nx == columnDtl_act_tax_amt) doDtl_act_tax_amt_NX(info);
		else if (nx == columnDtl_act_tax_cd) doDtl_act_tax_cd_NX(info);
		else if (nx == columnDtl_act_tax_nm) doDtl_act_tax_nm_NX(info);
		else if (nx == columnDtl_act_tax_rate) doDtl_act_tax_rate_NX(info);
		else if (nx == columnDtl_act_cur_tax_amt) doDtl_act_cur_tax_amt_NX(info);
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
	 * [Hdr]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_seq_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_dt_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ref_rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_tax_calc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_tax_calc_typ_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_pay_crryovr_times_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_no_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[dummy_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dummy_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ap_dpt_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dtl_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dtl_upd_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_purc_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_tax_amt_NX(MCEventInfo info){
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
		if (lc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_LC(info);
		else if (lc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_LC(info);
		else if (lc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_LC(info);
		else if (lc == Cnd_rev_no) doCnd_rev_no_LC(info);
		else if (lc == Hdr_trd_cd) doHdr_trd_cd_LC(info);
		else if (lc == Hdr_trd_nm) doHdr_trd_nm_LC(info);
		else if (lc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_LC(info);
		else if (lc == Hdr_purc_act_no) doHdr_purc_act_no_LC(info);
		else if (lc == Hdr_purc_act_rev) doHdr_purc_act_rev_LC(info);
		else if (lc == Hdr_purc_act_seq) doHdr_purc_act_seq_LC(info);
		else if (lc == Hdr_purc_dt) doHdr_purc_dt_LC(info);
		else if (lc == Hdr_ac_ym) doHdr_ac_ym_LC(info);
		else if (lc == Hdr_pay_basis_dt) doHdr_pay_basis_dt_LC(info);
		else if (lc == Hdr_pay_schd_dt) doHdr_pay_schd_dt_LC(info);
		else if (lc == Hdr_sppl_cd) doHdr_sppl_cd_LC(info);
		else if (lc == Hdr_sppl_nm) doHdr_sppl_nm_LC(info);
		else if (lc == Hdr_asppl_cd) doHdr_asppl_cd_LC(info);
		else if (lc == Hdr_asppl_nm) doHdr_asppl_nm_LC(info);
		else if (lc == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_LC(info);
		else if (lc == Hdr_ref_rcpt_iv_no) doHdr_ref_rcpt_iv_no_LC(info);
		else if (lc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_LC(info);
		else if (lc == Hdr_purc_amt_rnd_typ) doHdr_purc_amt_rnd_typ_LC(info);
		else if (lc == Hdr_purc_tax_rnd_typ) doHdr_purc_tax_rnd_typ_LC(info);
		else if (lc == Hdr_purc_tax_calc_typ) doHdr_purc_tax_calc_typ_LC(info);
		else if (lc == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_LC(info);
		else if (lc == Hdr_mst_ap_dpt_cd) doHdr_mst_ap_dpt_cd_LC(info);
		else if (lc == Hdr_sppl_pay_crryovr_times) doHdr_sppl_pay_crryovr_times_LC(info);
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
		else if (lc == Hdr_ptax_dt) doHdr_ptax_dt_LC(info);
		else if (lc == Hdr_xrate_cd) doHdr_xrate_cd_LC(info);
		else if (lc == Hdr_trd_rmrks) doHdr_trd_rmrks_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_tterm_cd1) doHdr_tterm_cd1_LC(info);
		else if (lc == Hdr_tterm_nm1) doHdr_tterm_nm1_LC(info);
		else if (lc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_LC(info);
		else if (lc == Hdr_tterm_cd2) doHdr_tterm_cd2_LC(info);
		else if (lc == Hdr_tterm_nm2) doHdr_tterm_nm2_LC(info);
		else if (lc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_LC(info);
		else if (lc == Hdr_tterm_cd3) doHdr_tterm_cd3_LC(info);
		else if (lc == Hdr_tterm_nm3) doHdr_tterm_nm3_LC(info);
		else if (lc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_LC(info);
		else if (lc == Hdr_ref_no) doHdr_ref_no_LC(info);
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
		else if (lc == BulkSet_ap_dpt_cd) doBulkSet_ap_dpt_cd_LC(info);
		else if (lc == BulkSet_ap_dpt_nm) doBulkSet_ap_dpt_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_itm_pay_crryovr_times) doDtl_itm_pay_crryovr_times_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_maker_cd) doDtl_maker_cd_LC(info);
		else if (lc == columnDtl_maker_nm) doDtl_maker_nm_LC(info);
		else if (lc == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_LC(info);
		else if (lc == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_LC(info);
		else if (lc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_LC(info);
		else if (lc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_LC(info);
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
		else if (lc == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_LC(info);
		else if (lc == columnDtl_dscnt_rsn_cd) doDtl_dscnt_rsn_cd_LC(info);
		else if (lc == columnDtl_dscnt_rsn_nm) doDtl_dscnt_rsn_nm_LC(info);
		else if (lc == columnDtl_wtax_rate) doDtl_wtax_rate_LC(info);
		else if (lc == columnDtl_purc_typ) doDtl_purc_typ_LC(info);
		else if (lc == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_LC(info);
		else if (lc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_po_no) doDtl_po_no_LC(info);
		else if (lc == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_LC(info);
		else if (lc == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_LC(info);
		else if (lc == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_LC(info);
		else if (lc == columnDtl_purc_act_d_seq) doDtl_purc_act_d_seq_LC(info);
		else if (lc == columnDtl_ref_purc_act_no) doDtl_ref_purc_act_no_LC(info);
		else if (lc == columnDtl_ref_purc_act_rev) doDtl_ref_purc_act_rev_LC(info);
		else if (lc == columnDtl_ref_purc_act_seq) doDtl_ref_purc_act_seq_LC(info);
		else if (lc == columnDtl_ref_purc_act_d_no) doDtl_ref_purc_act_d_no_LC(info);
		else if (lc == columnDtl_ref_purc_act_d_seq) doDtl_ref_purc_act_d_seq_LC(info);
		else if (lc == columnDtl_base_purc_ac_dt) doDtl_base_purc_ac_dt_LC(info);
		else if (lc == columnDtl_act_ac_dt) doDtl_act_ac_dt_LC(info);
		else if (lc == columnDtl_act_unit_qty) doDtl_act_unit_qty_LC(info);
		else if (lc == columnDtl_act_unit_cd) doDtl_act_unit_cd_LC(info);
		else if (lc == columnDtl_act_unit_nm) doDtl_act_unit_nm_LC(info);
		else if (lc == columnDtl_act_cur_upri) doDtl_act_cur_upri_LC(info);
		else if (lc == columnDtl_act_cur_amt) doDtl_act_cur_amt_LC(info);
		else if (lc == columnDtl_act_tax_amt) doDtl_act_tax_amt_LC(info);
		else if (lc == columnDtl_act_tax_cd) doDtl_act_tax_cd_LC(info);
		else if (lc == columnDtl_act_tax_nm) doDtl_act_tax_nm_LC(info);
		else if (lc == columnDtl_act_tax_rate) doDtl_act_tax_rate_LC(info);
		else if (lc == columnDtl_act_cur_tax_amt) doDtl_act_cur_tax_amt_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
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
	 * [Cnd]パネルの[rev_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rev_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_dt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ref_rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[purc_tax_calc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_tax_calc_typ_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_pay_crryovr_times_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[ref_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ref_no_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ap_dpt_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_pay_crryovr_times_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_purc_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_purc_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_purc_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPurcSrchTgtTyp(row, info);
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
	 * コンボ／リストのリスト[Hdr_asppl_cd]の作成メソッド
	 */
	public MCList getHdr_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
	 * コンボ／リストのリスト[Hdr_ptax_cur_cd]の作成メソッド
	 */
	public MCList getHdr_ptax_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
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
	 * コンボ／リストのリスト[BulkSet_ap_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
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
	 * コンボ／リストのリスト[columnDtl_asset_mng_typ]の作成メソッド
	 */
	public MCList getDtl_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_maker_cd]の作成メソッド
	 */
	public MCList getDtl_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_typ]の作成メソッド
	 */
	public MCList getDtl_purc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTyp(row, info);
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
		if (id.equals("MS.MSBDL0180.Srch01")) {
			return new MS_MSBDL0180_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0180.Srch02")) {
			return new MS_MSBDL0180_Srch02Bridge();
		}
		if (id.equals("MS.MSBDL0180.Ins01")) {
			return new MS_MSBDL0180_Ins01Bridge();
		}
		if (id.equals("MS.MSBDL0180.Upd01")) {
			return new MS_MSBDL0180_Upd01Bridge();
		}
		if (id.equals("MS.MSBDL0180.Del01")) {
			return new MS_MSBDL0180_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0180_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0180_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0180_Srch01Bridge() {
			p_MS_MSBDL0180_Srch01 = new MCParam(PDef.MS_MSBDL0180_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0180_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0180.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));

			p_MS_MSBDL0180_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0180_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0180_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0180_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0180_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0180.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0180.CndR)up(0);
		}

		protected mcframe.clientMSBD.MSBDP0180.HdrR down0() {
			return (mcframe.clientMSBD.MSBDP0180.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0180.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0180_Srch01.addDownBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			p_MS_MSBDL0180_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0180_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBD.MSBDP0180.HdrR)p_MS_MSBDL0180_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)p_MS_MSBDL0180_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBDL0180_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0180_Srch02;

		/** コンストラクタ */
		protected MS_MSBDL0180_Srch02Bridge() {
			p_MS_MSBDL0180_Srch02 = new MCParam(PDef.MS_MSBDL0180_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0180_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0180.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));

			p_MS_MSBDL0180_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0180_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0180_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0180_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0180_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0180.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0180.CndR)up(0);
		}

		protected mcframe.clientMSBD.MSBDP0180.HdrR down0() {
			return (mcframe.clientMSBD.MSBDP0180.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0180.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0180_Srch02.addDownBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			p_MS_MSBDL0180_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0180_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBD.MSBDP0180.HdrR)p_MS_MSBDL0180_Srch02.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)p_MS_MSBDL0180_Srch02.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBDL0180_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0180_Ins01;

		/** コンストラクタ */
		protected MS_MSBDL0180_Ins01Bridge() {
			p_MS_MSBDL0180_Ins01 = new MCParam(PDef.MS_MSBDL0180_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0180_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));

			p_MS_MSBDL0180_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0180_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0180_Ins01.addUpBlock(getHdrR());
			p_MS_MSBDL0180_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0180_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0180_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0180.HdrR up0() {
			return (mcframe.clientMSBD.MSBDP0180.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0180.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)up(1);
		}

		protected mcframe.clientMSBD.MSBDP0180.HdrR down0() {
			return (mcframe.clientMSBD.MSBDP0180.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0180.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0180_Ins01.addDownBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			p_MS_MSBDL0180_Ins01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0180_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBD.MSBDP0180.HdrR)p_MS_MSBDL0180_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)p_MS_MSBDL0180_Ins01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBDL0180_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0180_Upd01;

		/** コンストラクタ */
		protected MS_MSBDL0180_Upd01Bridge() {
			p_MS_MSBDL0180_Upd01 = new MCParam(PDef.MS_MSBDL0180_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0180_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));

			p_MS_MSBDL0180_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0180_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0180_Upd01.addUpBlock(getHdrR());
			p_MS_MSBDL0180_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0180_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0180_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0180.HdrR up0() {
			return (mcframe.clientMSBD.MSBDP0180.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0180.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)up(1);
		}

		protected mcframe.clientMSBD.MSBDP0180.HdrR down0() {
			return (mcframe.clientMSBD.MSBDP0180.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0180.DtlR> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0180_Upd01.addDownBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			p_MS_MSBDL0180_Upd01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0180_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBD.MSBDP0180.HdrR)p_MS_MSBDL0180_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)p_MS_MSBDL0180_Upd01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBDL0180_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0180_Del01;

		/** コンストラクタ */
		protected MS_MSBDL0180_Del01Bridge() {
			p_MS_MSBDL0180_Del01 = new MCParam(PDef.MS_MSBDL0180_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0180_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0180.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0180.DtlR.class));
			// Down

			p_MS_MSBDL0180_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0180_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0180_Del01.addUpBlock(getHdrR());
			p_MS_MSBDL0180_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0180_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0180_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0180.HdrR up0() {
			return (mcframe.clientMSBD.MSBDP0180.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0180.DtlR> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0180.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBDL0180_Del01;
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