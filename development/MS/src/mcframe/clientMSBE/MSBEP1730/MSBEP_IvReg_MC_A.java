package mcframe.clientMSBE.MSBEP1730;

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
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg_MC.MS_MSBEL1730_Srch01Caller;
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg_MC.MS_MSBEL1730_Srch02Caller;
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg_MC.MS_MSBEL1730_Srch04Caller;
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg_MC.MS_MSBEL1730_Ins01Caller;
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg_MC.MS_MSBEL1730_Upd01Caller;
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg_MC.MS_MSBEL1730_Del01Caller;
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg_MC.MS_MSBEL1730_Prnt01Caller;
import mcframe.clientMSBE.MSBEP1730.MSBEP_IvReg_MC.MS_MSBEL1730_Sprt01Caller;

/**
 * 画面"MSBEP_IvReg"パネルクラスです。<p>
 *
 * インボイスを登録する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_IvReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP1730";

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
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_mng_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	/**
	 * Search 2 検索する２.<p>
	 *
	 */
	public MCButton Cnd_srch_2 = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_iv_mng_no = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_rcpt_iv_mng_no = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCTextField Hdr_trd_ptn_typ = null;
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public MCTextField Hdr_sls_basis_typ = null;
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public MCTextField Hdr_prov_basis_typ = null;
	public MCLabel Hdr_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_iv_no = null;
	/**
	 * Is IV_NO that was numbered beforehand on the sales side 販売側事前に発番したIV_NOか.<p>
	 *
	 */
	public MCCheckBox Hdr_is_slo_iv_no = null;
	/**
	 * Auto 自動.<p>
	 *
	 */
	public MCCheckBox Hdr_num_flg = null;
	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_iv_rev = null;
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
	public MCLabel Hdr_iv_dt_Label = null;
	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public MCDateField Hdr_iv_dt = null;
	public MCLabel Hdr_iv_src_typ_Label = null;
	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public MCTextField Hdr_iv_src_typ = null;
	/**
	 * Invoice creating source type name インボイス作成元区分名.<p>
	 *
	 */
	public MCTextField Hdr_iv_src_typ_nm = null;
	public MCLabel Hdr_rcpt_iv_no_Label = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_rcpt_iv_no = null;
	public MCLabel Hdr_cmpl_schd_dt_Label = null;
	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public MCDateField Hdr_cmpl_schd_dt = null;
	public MCLabel Hdr_arr_schd_dt_Label = null;
	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCDateField Hdr_arr_schd_dt = null;
	public MCLabel Hdr_sls_schd_dt_Label = null;
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCDateField Hdr_sls_schd_dt = null;
	public MCLabel Hdr_cmpl_dt_Label = null;
	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public MCDateField Hdr_cmpl_dt = null;
	public MCLabel Hdr_ac_dt_Label = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDateField Hdr_ac_dt = null;
	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public MCCheckBox Hdr_iv_ship_flg = null;
	/**
	 * Invoice immediate issue インボイス即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_iv_immed_prnt_flg = null;
	/**
	 * Invoice issued インボイス発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_iv_prnt_flg = null;
	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public MCCheckBox Hdr_pl_skip_flg = null;
	/**
	 * Packing list entered パッキングリスト登録済.<p>
	 *
	 */
	public MCCheckBox Hdr_pl_reg_flg = null;
	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public MCCheckBox Hdr_non_cmpl_flg = null;
	/**
	 * Completed 完了済.<p>
	 *
	 */
	public MCCheckBox Hdr_cmpl_flg = null;
	/**
	 * Invoice unit shipping (Initial value) インボイス単位出荷（初期値）.<p>
	 *
	 */
	public MCCheckBox Hdr_old_iv_ship_flg = null;
	public MCLabel Hdr_dlv_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_typ_nm = null;
	public MCLabel Hdr_dlv_id_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_nm = null;
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_sundry_flg = null;
	public mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H Hdr_dlv_addr_p_PPanel;
	public MCTextComboBox Hdr_dlv_lg_grp_cd;	// [Hdr]の[dlv_addr_p.lg_grp_cd]を[Hdr_dlv_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_lg_grp_nm;	// [Hdr]の[dlv_addr_p.lg_grp_nm]を[Hdr_dlv_lg_grp_nm]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntry_cd;	// [Hdr]の[dlv_addr_p.cntry_cd]を[Hdr_dlv_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntry_nm;	// [Hdr]の[dlv_addr_p.cntry_nm]を[Hdr_dlv_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr_dlv_zip_cd;	// [Hdr]の[dlv_addr_p.zip_cd]を[Hdr_dlv_zip_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr1;	// [Hdr]の[dlv_addr_p.addr1]を[Hdr_dlv_addr1]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr2;	// [Hdr]の[dlv_addr_p.addr2]を[Hdr_dlv_addr2]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr3;	// [Hdr]の[dlv_addr_p.addr3]を[Hdr_dlv_addr3]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr4;	// [Hdr]の[dlv_addr_p.addr4]を[Hdr_dlv_addr4]としてエイリアス定義。
	public MCTextField Hdr_dlv_tel;	// [Hdr]の[dlv_addr_p.tel]を[Hdr_dlv_tel]としてエイリアス定義。
	public MCTextField Hdr_dlv_fax;	// [Hdr]の[dlv_addr_p.fax]を[Hdr_dlv_fax]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntct_dpt;	// [Hdr]の[dlv_addr_p.cntct_dpt]を[Hdr_dlv_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntct_psn;	// [Hdr]の[dlv_addr_p.cntct_psn]を[Hdr_dlv_cntct_psn]としてエイリアス定義。
	public MCLabel Hdr_ship_rqst_id_typ_Label = null;
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public MCTextField Hdr_ship_rqst_id_typ = null;
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public MCTextField Hdr_ship_rqst_id_typ_nm = null;
	public MCLabel Hdr_ship_rqst_id_cd_Label = null;
	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ship_rqst_id_cd = null;
	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public MCTextField Hdr_ship_rqst_id_nm = null;
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public MCCheckBox Hdr_sls_upri_cng_flg = null;
	public MCLabel Hdr_via_dlv_typ_Label = null;
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public MCTextField Hdr_via_dlv_typ = null;
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public MCTextField Hdr_via_dlv_typ_nm = null;
	public MCLabel Hdr_tdlv_cd_Label = null;
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_tdlv_cd = null;
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public MCTextField Hdr_tdlv_nm = null;
	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public MCCheckBox Hdr_tdlv_sundry_flg = null;
	public mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H Hdr_tdlv_addr_p_PPanel;
	public MCTextComboBox Hdr_tdlv_lg_grp_cd;	// [Hdr]の[tdlv_addr_p.lg_grp_cd]を[Hdr_tdlv_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr_tdlv_lg_grp_nm;	// [Hdr]の[tdlv_addr_p.lg_grp_nm]を[Hdr_tdlv_lg_grp_nm]としてエイリアス定義。
	public MCTextField Hdr_tdlv_cntry_cd;	// [Hdr]の[tdlv_addr_p.cntry_cd]を[Hdr_tdlv_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr_tdlv_cntry_nm;	// [Hdr]の[tdlv_addr_p.cntry_nm]を[Hdr_tdlv_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr_tdlv_zip_cd;	// [Hdr]の[tdlv_addr_p.zip_cd]を[Hdr_tdlv_zip_cd]としてエイリアス定義。
	public MCTextField Hdr_tdlv_addr1;	// [Hdr]の[tdlv_addr_p.addr1]を[Hdr_tdlv_addr1]としてエイリアス定義。
	public MCTextField Hdr_tdlv_addr2;	// [Hdr]の[tdlv_addr_p.addr2]を[Hdr_tdlv_addr2]としてエイリアス定義。
	public MCTextField Hdr_tdlv_addr3;	// [Hdr]の[tdlv_addr_p.addr3]を[Hdr_tdlv_addr3]としてエイリアス定義。
	public MCTextField Hdr_tdlv_addr4;	// [Hdr]の[tdlv_addr_p.addr4]を[Hdr_tdlv_addr4]としてエイリアス定義。
	public MCTextField Hdr_tdlv_tel;	// [Hdr]の[tdlv_addr_p.tel]を[Hdr_tdlv_tel]としてエイリアス定義。
	public MCTextField Hdr_tdlv_fax;	// [Hdr]の[tdlv_addr_p.fax]を[Hdr_tdlv_fax]としてエイリアス定義。
	public MCTextField Hdr_tdlv_cntct_dpt;	// [Hdr]の[tdlv_addr_p.cntct_dpt]を[Hdr_tdlv_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr_tdlv_cntct_psn;	// [Hdr]の[tdlv_addr_p.cntct_psn]を[Hdr_tdlv_cntct_psn]としてエイリアス定義。
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public MCCheckBox Hdr_sls_cststk_flg = null;
	/**
	 * Sold 売上済.<p>
	 *
	 */
	public MCCheckBox Hdr_sls_cmpl_flg = null;
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
	public MCLabel Hdr_vssl_flght_Label = null;
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public MCTextField Hdr_vssl_flght = null;
	public MCLabel Hdr_load_port_cd_Label = null;
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_load_port_cd = null;
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public MCTextField Hdr_load_port_nm = null;
	public MCLabel Hdr_etd_dt_Label = null;
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDateField Hdr_etd_dt = null;
	public MCLabel Hdr_dschrg_port_cd_Label = null;
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_dschrg_port_cd = null;
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public MCTextField Hdr_dschrg_port_nm = null;
	public MCLabel Hdr_eta_dt_Label = null;
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDateField Hdr_eta_dt = null;
	public MCLabel Hdr_via_port_cd_Label = null;
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_via_port_cd = null;
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public MCTextField Hdr_via_port_nm = null;
	public MCLabel Hdr_via_schd_dt_Label = null;
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDateField Hdr_via_schd_dt = null;
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
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_trd_cur_upri_dec_place = null;
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_trd_cur_amt_dec_place = null;
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_trd_amt_rnd_typ = null;
	/**
	 * Tax amount rounding type 税額端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_trd_tax_rnd_typ = null;
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
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_xrate_cd = null;
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
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCCheckBox Hdr_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr_ptax_xrate_p_PPanel;
	public MCNumberField Hdr_ptax_xrate;	// [Hdr]の[ptax_xrate_p.xrate]を[Hdr_ptax_xrate]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_amt_p_PPanel;
	public MCNumberField Hdr_trd_cur_amt;	// [Hdr]の[trd_cur_amt_p.amt]を[Hdr_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_trd_cur_amt_inc_tax_p_PPanel;
	public MCNumberField Hdr_trd_cur_amt_inc_tax;	// [Hdr]の[trd_cur_amt_inc_tax_p.amt]を[Hdr_trd_cur_amt_inc_tax]としてエイリアス定義。
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
	public MCLabel Hdr_bill_basis_dt_Label = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDateField Hdr_bill_basis_dt = null;
	public MCLabel Hdr_rcv_schd_dt_Label = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDateField Hdr_rcv_schd_dt = null;
	public MCLabel Hdr_lc_no_Label = null;
	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_lc_no = null;
	public MCLabel Hdr_lc_dt_Label = null;
	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCDateField Hdr_lc_dt = null;
	public MCLabel Hdr_lc_rmrks_Label = null;
	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public MCTextField Hdr_lc_rmrks = null;
	public MCLabel Hdr_bl_no_Label = null;
	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_bl_no = null;
	public MCLabel Hdr_bl_dt_Label = null;
	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCDateField Hdr_bl_dt = null;
	public MCLabel Hdr_bl_rmrks_Label = null;
	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public MCTextField Hdr_bl_rmrks = null;
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ship_fr_lg_grp_cd = null;
	public MCLabel Hdr_iv_rmrks_Label = null;
	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public MCTextField Hdr_iv_rmrks = null;
	public MCLabel Hdr_case_mrk1_Label = null;
	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public MCTextField Hdr_case_mrk1 = null;
	public MCLabel Hdr_case_mrk2_Label = null;
	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public MCTextField Hdr_case_mrk2 = null;
	public MCLabel Hdr_case_mrk3_Label = null;
	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public MCTextField Hdr_case_mrk3 = null;
	public MCLabel Hdr_case_mrk4_Label = null;
	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public MCTextField Hdr_case_mrk4 = null;
	public MCLabel Hdr_case_mrk5_Label = null;
	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public MCTextField Hdr_case_mrk5 = null;
	public MCLabel Hdr_case_mrk6_Label = null;
	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public MCTextField Hdr_case_mrk6 = null;
	/**
	 * Purchase invoice temporary entry flg. 受領インボイス仮登録ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Hdr_pre_rcpt_iv_flg = null;
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
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public MCTextField Hdr_bill_cl_typ = null;
	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Hdr_purc_ddlv_flg = null;
	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public MCTextField Hdr_ar_dpt_typ = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_lnk_ar_dpt_cd = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_prnt_lcl_cd = null;
	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_iv_upd_cntr = null;
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
	// [Ttl]ブロック関連のField定義
	public MCPanel TtlPanel = null;
	// [Ttl]ブロックの項目のField定義
	public MCLabel Ttl_ttl_iv_amt_Label = null;
	/**
	 * Total amount for invoice インボイス表記金額計.<p>
	 *
	 */
	public MCNumberField Ttl_ttl_iv_amt = null;
	public MCLabel Ttl_ttl_ncv_amt_Label = null;
	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public MCNumberField Ttl_ttl_ncv_amt = null;
	public MCLabel Ttl_ttl_base_amt_Label = null;
	/**
	 * Main body 本体.<p>
	 *
	 */
	public MCNumberField Ttl_ttl_base_amt = null;
	public MCLabel Ttl_ttl_freight_amt_Label = null;
	/**
	 * Freight 運賃.<p>
	 *
	 */
	public MCNumberField Ttl_ttl_freight_amt = null;
	public MCLabel Ttl_ttl_insurance_amt_Label = null;
	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public MCNumberField Ttl_ttl_insurance_amt = null;
	public MCLabel Ttl_ttl_other_amt_Label = null;
	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public MCNumberField Ttl_ttl_other_amt = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1730.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_mng_no = null;
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
	 * Aggregation flg. まとめＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bndl_flg = null;
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
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_exim_xpns_typ = null;
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
	 * Discount item 値引品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
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
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_qty = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty;// [Dtl]の[trd_unit_qty_p.qty]を[columnDtl_trd_unit_qty]としてエイリアス定義。
	/**
	 * Unit price qty. 単価数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upri_qty = null;
	/**
	 * Maximum standard unit qty. that can be entered 登録可能な最大基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_max_base_unit_qty = null;
	/**
	 * Maximum transaction unit qty. that can be entered (message display only) 登録可能な最大取引単位数量（メッセージ表示のみ）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_max_trd_unit_qty = null;
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
	public MCColumnConfig columnDtl_dscnt_rsn_cd;// [Dtl]の[trd_cur_upri_amt_p.dscnt_rsn_cd]を[columnDtl_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_nm;// [Dtl]の[trd_cur_upri_amt_p.dscnt_rsn_nm]を[columnDtl_dscnt_rsn_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_old_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_old_trd_cur_upri;// [Dtl]の[old_trd_cur_upri_p.upri]を[columnDtl_old_trd_cur_upri]としてエイリアス定義。
	/**
	 * Initial discount amount (For discount calculation) (Transaction currency) 当初取引通貨値引額（値引額計算用）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_trd_cur_dscnt_amt = null;
	/**
	 * Initial base unit qty. (For discount calculation) 当初基準単位数量（値引額計算用）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_base_unit_qty = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_iv_upri_p_PPanel;
	public MCColumnConfig columnDtl_iv_upri;// [Dtl]の[iv_upri_p.upri]を[columnDtl_iv_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_iv_amt_p_PPanel;
	public MCColumnConfig columnDtl_iv_amt;// [Dtl]の[iv_amt_p.amt]を[columnDtl_iv_amt]としてエイリアス定義。
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_d_no = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Multiple shipping distribution group flg. 複数出荷物流グループＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_multi_ship_fr_lg_grp_flg = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_fr_lg_grp_nm = null;
	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_cd = null;
	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_nm = null;
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_acxfr_flg = null;
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
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl_usr_dpt_p_PPanel;
	public MCColumnConfig columnDtl_sls_usr_cd;// [Dtl]の[usr_dpt_p.usr_cd]を[columnDtl_sls_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_sls_usr_nm;// [Dtl]の[usr_dpt_p.usr_nm]を[columnDtl_sls_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_sls_dpt_cd;// [Dtl]の[usr_dpt_p.dpt_cd]を[columnDtl_sls_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_sls_dpt_nm;// [Dtl]の[usr_dpt_p.dpt_nm]を[columnDtl_sls_dpt_nm]としてエイリアス定義。
	/**
	 * Sales dept. WG 売上部門のワーキンググループ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_dpt_wg_cd = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_nm = null;
	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_d_rmrks = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_d_rmrks = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dtl_sub_char3 = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no = null;
	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_rqst_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_d_no = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_schd_no = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_no = null;
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_d_no = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_no = null;
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_d_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_d_no = null;
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_alloc_sts_no = null;
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_uplnd_flg = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd3 = null;
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_cng_flg = null;
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_schd_no = null;
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_d_no = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_dlv_rqst_dt_p_PPanel;
	public MCColumnConfig columnDtl_dlv_rqst_dt;// [Dtl]の[dlv_rqst_dt_p.ymd]を[columnDtl_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_rqst_hm;// [Dtl]の[dlv_rqst_dt_p.hm]を[columnDtl_dlv_rqst_hm]としてエイリアス定義。
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_d_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_amt = null;
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rate = null;
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_amt = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_no = null;
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pr_sts_typ = null;
	/**
	 * Manual addition flg. マニュアル追加ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_manual_add_flg = null;
	/**
	 * Existing data flg. 既存データＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_existed_flg = null;
	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_flg = null;
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_pr_no = null;
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_typ = null;
	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_qty = null;
	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_qty = null;
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_pr_upd_cntr = null;
	/**
	 * Index for initially searched details data 初期検索した明細データのindex.<p>
	 *
	 */
	public MCColumnConfig columnDtl_index = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Select additional sales invoice details インボイス明細追加選択.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1740 = null;
	/**
	 * Print packing list パッキングリスト登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1750 = null;
	/**
	 * Reacquire unit price 単価再取得.<p>
	 *
	 */
	public MCButton Btn_sprt = null;
	/**
	 * Re-issue invoice インボイス再発行.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
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
	 * Move to top row 最上行へ移動.<p>
	 *
	 */
	public MCButton Btn_move_top = null;
	/**
	 * Move one row up 一つ上の行に移動.<p>
	 *
	 */
	public MCButton Btn_move_up = null;
	/**
	 * Move one row down 一つ下の行に移動.<p>
	 *
	 */
	public MCButton Btn_move_down = null;
	/**
	 * Move to bottom row 最下行へ移動.<p>
	 *
	 */
	public MCButton Btn_move_bottom = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [UPD1]モードを表す定数 */
	public static final String UPD1 = "UPD1";
	/** [UPD2]モードを表す定数 */
	public static final String UPD2 = "UPD2";
	/** [UPD3]モードを表す定数 */
	public static final String UPD3 = "UPD3";
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
	public static final String[] statusArray = new String[]{SRCH, INS, FIX_I, UPD1, UPD2, UPD3, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBEL1730_Srch01]のCallerの作成 */
	protected MSBEP_IvReg_MC.MS_MSBEL1730_Srch01Caller createMS_MSBEL1730_Srch01() {
		MSBEP_IvReg_MC.MS_MSBEL1730_Srch01Caller<MSBEP_IvReg, MS_MSBEL1730_Srch01Bridge>
		caller = ((MSBEP_IvReg_MC)this).new MS_MSBEL1730_Srch01Caller<MSBEP_IvReg, MS_MSBEL1730_Srch01Bridge>(
					(MSBEP_IvReg)this, new MS_MSBEL1730_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1730_Srch01]の呼び出し */
	protected void callMS_MSBEL1730_Srch01() {
		MCCaller caller = createMS_MSBEL1730_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1730_Srch02]のCallerの作成 */
	protected MSBEP_IvReg_MC.MS_MSBEL1730_Srch02Caller createMS_MSBEL1730_Srch02() {
		MSBEP_IvReg_MC.MS_MSBEL1730_Srch02Caller<MSBEP_IvReg, MS_MSBEL1730_Srch02Bridge>
		caller = ((MSBEP_IvReg_MC)this).new MS_MSBEL1730_Srch02Caller<MSBEP_IvReg, MS_MSBEL1730_Srch02Bridge>(
					(MSBEP_IvReg)this, new MS_MSBEL1730_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL1730_Srch02]の呼び出し */
	protected void callMS_MSBEL1730_Srch02() {
		MCCaller caller = createMS_MSBEL1730_Srch02();
		caller.exec();
	}
	/** [MS_MSBEL1730_Srch04]のCallerの作成 */
	protected MSBEP_IvReg_MC.MS_MSBEL1730_Srch04Caller createMS_MSBEL1730_Srch04() {
		MSBEP_IvReg_MC.MS_MSBEL1730_Srch04Caller<MSBEP_IvReg, MS_MSBEL1730_Srch04Bridge>
		caller = ((MSBEP_IvReg_MC)this).new MS_MSBEL1730_Srch04Caller<MSBEP_IvReg, MS_MSBEL1730_Srch04Bridge>(
					(MSBEP_IvReg)this, new MS_MSBEL1730_Srch04Bridge());
		return caller;
	}
	/** [MS_MSBEL1730_Srch04]の呼び出し */
	protected void callMS_MSBEL1730_Srch04() {
		MCCaller caller = createMS_MSBEL1730_Srch04();
		caller.exec();
	}
	/** [MS_MSBEL1730_Ins01]のCallerの作成 */
	protected MSBEP_IvReg_MC.MS_MSBEL1730_Ins01Caller createMS_MSBEL1730_Ins01() {
		MSBEP_IvReg_MC.MS_MSBEL1730_Ins01Caller<MSBEP_IvReg, MS_MSBEL1730_Ins01Bridge>
		caller = ((MSBEP_IvReg_MC)this).new MS_MSBEL1730_Ins01Caller<MSBEP_IvReg, MS_MSBEL1730_Ins01Bridge>(
					(MSBEP_IvReg)this, new MS_MSBEL1730_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBEL1730_Ins01]の呼び出し */
	protected void callMS_MSBEL1730_Ins01() {
		MCCaller caller = createMS_MSBEL1730_Ins01();
		caller.exec();
	}
	/** [MS_MSBEL1730_Upd01]のCallerの作成 */
	protected MSBEP_IvReg_MC.MS_MSBEL1730_Upd01Caller createMS_MSBEL1730_Upd01() {
		MSBEP_IvReg_MC.MS_MSBEL1730_Upd01Caller<MSBEP_IvReg, MS_MSBEL1730_Upd01Bridge>
		caller = ((MSBEP_IvReg_MC)this).new MS_MSBEL1730_Upd01Caller<MSBEP_IvReg, MS_MSBEL1730_Upd01Bridge>(
					(MSBEP_IvReg)this, new MS_MSBEL1730_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1730_Upd01]の呼び出し */
	protected void callMS_MSBEL1730_Upd01() {
		MCCaller caller = createMS_MSBEL1730_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1730_Del01]のCallerの作成 */
	protected MSBEP_IvReg_MC.MS_MSBEL1730_Del01Caller createMS_MSBEL1730_Del01() {
		MSBEP_IvReg_MC.MS_MSBEL1730_Del01Caller<MSBEP_IvReg, MS_MSBEL1730_Del01Bridge>
		caller = ((MSBEP_IvReg_MC)this).new MS_MSBEL1730_Del01Caller<MSBEP_IvReg, MS_MSBEL1730_Del01Bridge>(
					(MSBEP_IvReg)this, new MS_MSBEL1730_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1730_Del01]の呼び出し */
	protected void callMS_MSBEL1730_Del01() {
		MCCaller caller = createMS_MSBEL1730_Del01();
		caller.exec();
	}
	/** [MS_MSBEL1730_Prnt01]のCallerの作成 */
	protected MSBEP_IvReg_MC.MS_MSBEL1730_Prnt01Caller createMS_MSBEL1730_Prnt01() {
		MSBEP_IvReg_MC.MS_MSBEL1730_Prnt01Caller<MSBEP_IvReg, MS_MSBEL1730_Prnt01Bridge>
		caller = ((MSBEP_IvReg_MC)this).new MS_MSBEL1730_Prnt01Caller<MSBEP_IvReg, MS_MSBEL1730_Prnt01Bridge>(
					(MSBEP_IvReg)this, new MS_MSBEL1730_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1730_Prnt01]の呼び出し */
	protected void callMS_MSBEL1730_Prnt01() {
		MCCaller caller = createMS_MSBEL1730_Prnt01();
		caller.exec();
	}
	/** [MS_MSBEL1730_Sprt01]のCallerの作成 */
	protected MSBEP_IvReg_MC.MS_MSBEL1730_Sprt01Caller createMS_MSBEL1730_Sprt01() {
		MSBEP_IvReg_MC.MS_MSBEL1730_Sprt01Caller<MSBEP_IvReg, MS_MSBEL1730_Sprt01Bridge>
		caller = ((MSBEP_IvReg_MC)this).new MS_MSBEL1730_Sprt01Caller<MSBEP_IvReg, MS_MSBEL1730_Sprt01Bridge>(
					(MSBEP_IvReg)this, new MS_MSBEL1730_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1730_Sprt01]の呼び出し */
	protected void callMS_MSBEL1730_Sprt01() {
		MCCaller caller = createMS_MSBEL1730_Sprt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1730.CndR aCndR;
	/** [Cnd2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1730.Cnd2R> aCnd2L;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1730.HdrR aHdrR;
	/** [Ttl]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1730.TtlR aTtlR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1730.DtlR> aDtlL;
	/** [MapDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> aMapDtlL;
	/** [ShipInstMapDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR> aShipInstMapDtlL;
	/** [ShipActMapDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR> aShipActMapDtlL;
	/** [UpriSrch]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1730.UpriSrchR> aUpriSrchL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1730.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1730.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1730.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1730.CndR.create();
	}

	/**
	 * コピーによってaCnd2Lを設定します。
	 *
	 * aCnd2Lのインスタンスは変更されません。
	 *
	 * @param dataset Cnd2L
	 */
	public void setCnd2L(MCList<mcframe.clientMSBE.MSBEP1730.Cnd2R> aList) {
		if (getCnd2L() != aList) {
			getCnd2L().setAll(aList);
		}
	}

	/**
	 * [Cnd2]ブロックのコンテナaCnd2Lを返します。
	 *
	 * @return Cnd2L
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.Cnd2R> getCnd2L() {
		return aCnd2L;
	}

	/**
	 * aCnd2Rを作成します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMSBE.MSBEP1730.Cnd2R createCnd2R() {
		return mcframe.clientMSBE.MSBEP1730.Cnd2R.create();
	}

	/**
	 * aCnd2Lを作成します。
	 *
	 * @return Cnd2L
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.Cnd2R> createCnd2L() {
		return MCList.create(mcframe.clientMSBE.MSBEP1730.Cnd2R.class);
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBE.MSBEP1730.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1730.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1730.HdrR createHdrR() {
		return mcframe.clientMSBE.MSBEP1730.HdrR.create();
	}

	/**
	 * 項目コピーによってaTtlRを設定します。
	 *
	 * aTtlRのインスタンスは変更されません。
	 *
	 * @param row TtlR
	 */
	public void setTtlR(mcframe.clientMSBE.MSBEP1730.TtlR row) {
		if (row != null) {
			MCRow.copyall(getTtlR(), row);
		}
	}

	/**
	 * [Ttl]ブロックのコンテナaTtlRを返します。
	 *
	 * @return TtlR
	 */
	public mcframe.clientMSBE.MSBEP1730.TtlR getTtlR() {
		return aTtlR;
	}

	/**
	 * aTtlRを作成します。
	 *
	 * @return TtlR
	 */
	public mcframe.clientMSBE.MSBEP1730.TtlR createTtlR() {
		return mcframe.clientMSBE.MSBEP1730.TtlR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP1730.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP1730.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP1730.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class);
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
	 * コピーによってaMapDtlLを設定します。
	 *
	 * aMapDtlLのインスタンスは変更されません。
	 *
	 * @param dataset MapDtlL
	 */
	public void setMapDtlL(MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> aList) {
		if (getMapDtlL() != aList) {
			getMapDtlL().setAll(aList);
		}
	}

	/**
	 * [MapDtl]ブロックのコンテナaMapDtlLを返します。
	 *
	 * @return MapDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> getMapDtlL() {
		return aMapDtlL;
	}

	/**
	 * aMapDtlRを作成します。
	 *
	 * @return MapDtlR
	 */
	public mcframe.clientMSBE.MSBEP1730.MapDtlR createMapDtlR() {
		return mcframe.clientMSBE.MSBEP1730.MapDtlR.create();
	}

	/**
	 * aMapDtlLを作成します。
	 *
	 * @return MapDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> createMapDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class);
	}

	/**
	 * コピーによってaShipInstMapDtlLを設定します。
	 *
	 * aShipInstMapDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ShipInstMapDtlL
	 */
	public void setShipInstMapDtlL(MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR> aList) {
		if (getShipInstMapDtlL() != aList) {
			getShipInstMapDtlL().setAll(aList);
		}
	}

	/**
	 * [ShipInstMapDtl]ブロックのコンテナaShipInstMapDtlLを返します。
	 *
	 * @return ShipInstMapDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR> getShipInstMapDtlL() {
		return aShipInstMapDtlL;
	}

	/**
	 * aShipInstMapDtlRを作成します。
	 *
	 * @return ShipInstMapDtlR
	 */
	public mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR createShipInstMapDtlR() {
		return mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.create();
	}

	/**
	 * aShipInstMapDtlLを作成します。
	 *
	 * @return ShipInstMapDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR> createShipInstMapDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.class);
	}

	/**
	 * コピーによってaShipActMapDtlLを設定します。
	 *
	 * aShipActMapDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ShipActMapDtlL
	 */
	public void setShipActMapDtlL(MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR> aList) {
		if (getShipActMapDtlL() != aList) {
			getShipActMapDtlL().setAll(aList);
		}
	}

	/**
	 * [ShipActMapDtl]ブロックのコンテナaShipActMapDtlLを返します。
	 *
	 * @return ShipActMapDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR> getShipActMapDtlL() {
		return aShipActMapDtlL;
	}

	/**
	 * aShipActMapDtlRを作成します。
	 *
	 * @return ShipActMapDtlR
	 */
	public mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR createShipActMapDtlR() {
		return mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.create();
	}

	/**
	 * aShipActMapDtlLを作成します。
	 *
	 * @return ShipActMapDtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR> createShipActMapDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.class);
	}

	/**
	 * コピーによってaUpriSrchLを設定します。
	 *
	 * aUpriSrchLのインスタンスは変更されません。
	 *
	 * @param dataset UpriSrchL
	 */
	public void setUpriSrchL(MCList<mcframe.clientMSBE.MSBEP1730.UpriSrchR> aList) {
		if (getUpriSrchL() != aList) {
			getUpriSrchL().setAll(aList);
		}
	}

	/**
	 * [UpriSrch]ブロックのコンテナaUpriSrchLを返します。
	 *
	 * @return UpriSrchL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.UpriSrchR> getUpriSrchL() {
		return aUpriSrchL;
	}

	/**
	 * aUpriSrchRを作成します。
	 *
	 * @return UpriSrchR
	 */
	public mcframe.clientMSBE.MSBEP1730.UpriSrchR createUpriSrchR() {
		return mcframe.clientMSBE.MSBEP1730.UpriSrchR.create();
	}

	/**
	 * aUpriSrchLを作成します。
	 *
	 * @return UpriSrchL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1730.UpriSrchR> createUpriSrchL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1730.UpriSrchR.class);
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
		if(!MCCollectionUtil.contains(ret, getTtlR())) ret.add(getTtlR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getMapDtlL())) ret.add(getMapDtlL());
		if(!MCCollectionUtil.contains(ret, getShipInstMapDtlL())) ret.add(getShipInstMapDtlL());
		if(!MCCollectionUtil.contains(ret, getShipActMapDtlL())) ret.add(getShipActMapDtlL());
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
		if(aCnt == getCnd2L()) return "Cnd2";
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getTtlR()) return "Ttl";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getMapDtlL()) return "MapDtl";
		if(aCnt == getShipInstMapDtlL()) return "ShipInstMapDtl";
		if(aCnt == getShipActMapDtlL()) return "ShipActMapDtl";
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
		if(bId.equals("Cnd2")) return getCnd2L();
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Ttl")) return getTtlR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("MapDtl")) return getMapDtlL();
		if(bId.equals("ShipInstMapDtl")) return getShipInstMapDtlL();
		if(bId.equals("ShipActMapDtl")) return getShipActMapDtlL();
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
		ret.add(TtlPanel);
		ret.add(Hdr2Panel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IvReg_MC_A() {
		aCndR = createCndR();
		aCnd2L = createCnd2L();
		aHdrR = createHdrR();
		aTtlR = createTtlR();
		aDtlL = createDtlL();
		aMapDtlL = createMapDtlL();
		aShipInstMapDtlL = createShipInstMapDtlL();
		aShipActMapDtlL = createShipActMapDtlL();
		aUpriSrchL = createUpriSrchL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_IvReg_MC_A(String name) {
		aCndR = createCndR();
		aCnd2L = createCnd2L();
		aHdrR = createHdrR();
		aTtlR = createTtlR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aMapDtlL = createMapDtlL();
		aShipInstMapDtlL = createShipInstMapDtlL();
		aShipActMapDtlL = createShipActMapDtlL();
		aUpriSrchL = createUpriSrchL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_IvReg_MC.jbCreateScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbCreateCnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbCreateHdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbCreateHdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbCreateTtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbCreateHdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbCreateDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbCreateBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbCreateEastBtn((MSBEP_IvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_IvReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_IvReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBEP_IvReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBEP_IvReg p) {
		p.Hdr_dlv_addr_p_PPanel = mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.create(p.getHdrR().dlv_addr_p());
		p.Hdr_dlv_addr_p_PPanel.setName("Hdr.dlv_addr_p");
		p.Hdr_dlv_lg_grp_cd = p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd;
		p.Hdr_dlv_lg_grp_cd.addAliasName("Hdr.dlv_lg_grp_cd", p);
		p.Hdr_dlv_lg_grp_nm = p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm;
		p.Hdr_dlv_lg_grp_nm.addAliasName("Hdr.dlv_lg_grp_nm", p);
		p.Hdr_dlv_cntry_cd = p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd;
		p.Hdr_dlv_cntry_cd.addAliasName("Hdr.dlv_cntry_cd", p);
		p.Hdr_dlv_cntry_nm = p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm;
		p.Hdr_dlv_cntry_nm.addAliasName("Hdr.dlv_cntry_nm", p);
		p.Hdr_dlv_zip_cd = p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd;
		p.Hdr_dlv_zip_cd.addAliasName("Hdr.dlv_zip_cd", p);
		p.Hdr_dlv_addr1 = p.Hdr_dlv_addr_p_PPanel.Addr_addr1;
		p.Hdr_dlv_addr1.addAliasName("Hdr.dlv_addr1", p);
		p.Hdr_dlv_addr2 = p.Hdr_dlv_addr_p_PPanel.Addr_addr2;
		p.Hdr_dlv_addr2.addAliasName("Hdr.dlv_addr2", p);
		p.Hdr_dlv_addr3 = p.Hdr_dlv_addr_p_PPanel.Addr_addr3;
		p.Hdr_dlv_addr3.addAliasName("Hdr.dlv_addr3", p);
		p.Hdr_dlv_addr4 = p.Hdr_dlv_addr_p_PPanel.Addr_addr4;
		p.Hdr_dlv_addr4.addAliasName("Hdr.dlv_addr4", p);
		p.Hdr_dlv_tel = p.Hdr_dlv_addr_p_PPanel.Addr_tel;
		p.Hdr_dlv_tel.addAliasName("Hdr.dlv_tel", p);
		p.Hdr_dlv_fax = p.Hdr_dlv_addr_p_PPanel.Addr_fax;
		p.Hdr_dlv_fax.addAliasName("Hdr.dlv_fax", p);
		p.Hdr_dlv_cntct_dpt = p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt;
		p.Hdr_dlv_cntct_dpt.addAliasName("Hdr.dlv_cntct_dpt", p);
		p.Hdr_dlv_cntct_psn = p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn;
		p.Hdr_dlv_cntct_psn.addAliasName("Hdr.dlv_cntct_psn", p);
		p.Hdr_tdlv_addr_p_PPanel = mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.create(p.getHdrR().tdlv_addr_p());
		p.Hdr_tdlv_addr_p_PPanel.setName("Hdr.tdlv_addr_p");
		p.Hdr_tdlv_lg_grp_cd = p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd;
		p.Hdr_tdlv_lg_grp_cd.addAliasName("Hdr.tdlv_lg_grp_cd", p);
		p.Hdr_tdlv_lg_grp_nm = p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm;
		p.Hdr_tdlv_lg_grp_nm.addAliasName("Hdr.tdlv_lg_grp_nm", p);
		p.Hdr_tdlv_cntry_cd = p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd;
		p.Hdr_tdlv_cntry_cd.addAliasName("Hdr.tdlv_cntry_cd", p);
		p.Hdr_tdlv_cntry_nm = p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm;
		p.Hdr_tdlv_cntry_nm.addAliasName("Hdr.tdlv_cntry_nm", p);
		p.Hdr_tdlv_zip_cd = p.Hdr_tdlv_addr_p_PPanel.Addr_zip_cd;
		p.Hdr_tdlv_zip_cd.addAliasName("Hdr.tdlv_zip_cd", p);
		p.Hdr_tdlv_addr1 = p.Hdr_tdlv_addr_p_PPanel.Addr_addr1;
		p.Hdr_tdlv_addr1.addAliasName("Hdr.tdlv_addr1", p);
		p.Hdr_tdlv_addr2 = p.Hdr_tdlv_addr_p_PPanel.Addr_addr2;
		p.Hdr_tdlv_addr2.addAliasName("Hdr.tdlv_addr2", p);
		p.Hdr_tdlv_addr3 = p.Hdr_tdlv_addr_p_PPanel.Addr_addr3;
		p.Hdr_tdlv_addr3.addAliasName("Hdr.tdlv_addr3", p);
		p.Hdr_tdlv_addr4 = p.Hdr_tdlv_addr_p_PPanel.Addr_addr4;
		p.Hdr_tdlv_addr4.addAliasName("Hdr.tdlv_addr4", p);
		p.Hdr_tdlv_tel = p.Hdr_tdlv_addr_p_PPanel.Addr_tel;
		p.Hdr_tdlv_tel.addAliasName("Hdr.tdlv_tel", p);
		p.Hdr_tdlv_fax = p.Hdr_tdlv_addr_p_PPanel.Addr_fax;
		p.Hdr_tdlv_fax.addAliasName("Hdr.tdlv_fax", p);
		p.Hdr_tdlv_cntct_dpt = p.Hdr_tdlv_addr_p_PPanel.Addr_cntct_dpt;
		p.Hdr_tdlv_cntct_dpt.addAliasName("Hdr.tdlv_cntct_dpt", p);
		p.Hdr_tdlv_cntct_psn = p.Hdr_tdlv_addr_p_PPanel.Addr_cntct_psn;
		p.Hdr_tdlv_cntct_psn.addAliasName("Hdr.tdlv_cntct_psn", p);
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
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().trd_cur_amt_inc_tax_p());
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.setName("Hdr.trd_cur_amt_inc_tax_p");
		p.Hdr_trd_cur_amt_inc_tax = p.Hdr_trd_cur_amt_inc_tax_p_PPanel.Amt_amt;
		p.Hdr_trd_cur_amt_inc_tax.addAliasName("Hdr.trd_cur_amt_inc_tax", p);
	}

	/**
	 * [Ttl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTtl(MSBEP_IvReg p) {
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBEP_IvReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_IvReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$itm_p);
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
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_trd_cur_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$trd_cur_upri_amt_p);
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
		p.columnDtl_dscnt_rsn_cd = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl_dscnt_rsn_cd.addAliasName("Dtl.dscnt_rsn_cd", p);
		p.columnDtl_dscnt_rsn_nm = p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl_dscnt_rsn_nm.addAliasName("Dtl.dscnt_rsn_nm", p);
		p.Dtl_old_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$old_trd_cur_upri_p);
		p.Dtl_old_trd_cur_upri_p_PPanel.setName("Dtl.old_trd_cur_upri_p");
		p.columnDtl_old_trd_cur_upri = p.Dtl_old_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_old_trd_cur_upri.addAliasName("Dtl.old_trd_cur_upri", p);
		p.Dtl_iv_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$iv_upri_p);
		p.Dtl_iv_upri_p_PPanel.setName("Dtl.iv_upri_p");
		p.columnDtl_iv_upri = p.Dtl_iv_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_iv_upri.addAliasName("Dtl.iv_upri", p);
		p.Dtl_iv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$iv_amt_p);
		p.Dtl_iv_amt_p_PPanel.setName("Dtl.iv_amt_p");
		p.columnDtl_iv_amt = p.Dtl_iv_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_iv_amt.addAliasName("Dtl.iv_amt", p);
		p.Dtl_sno_wrk_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$sno_wrk_p);
		p.Dtl_sno_wrk_p_PPanel.setName("Dtl.sno_wrk_p");
		p.columnDtl_sno1 = p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_wrk_no = p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$usr_dpt_p);
		p.Dtl_usr_dpt_p_PPanel.setName("Dtl.usr_dpt_p");
		p.columnDtl_sls_usr_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl_sls_usr_cd.addAliasName("Dtl.sls_usr_cd", p);
		p.columnDtl_sls_usr_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl_sls_usr_nm.addAliasName("Dtl.sls_usr_nm", p);
		p.columnDtl_sls_dpt_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl_sls_dpt_cd.addAliasName("Dtl.sls_dpt_cd", p);
		p.columnDtl_sls_dpt_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl_sls_dpt_nm.addAliasName("Dtl.sls_dpt_nm", p);
		p.Dtl_dlv_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1730.DtlR.$dlv_rqst_dt_p);
		p.Dtl_dlv_rqst_dt_p_PPanel.setName("Dtl.dlv_rqst_dt_p");
		p.columnDtl_dlv_rqst_dt = p.Dtl_dlv_rqst_dt_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_dlv_rqst_dt.addAliasName("Dtl.dlv_rqst_dt", p);
		p.columnDtl_dlv_rqst_hm = p.Dtl_dlv_rqst_dt_p_PPanel.columnYmdHm_hm;
		p.columnDtl_dlv_rqst_hm.addAliasName("Dtl.dlv_rqst_hm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_IvReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_IvReg p) {
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
	
	
	/** [Hdr_load_port_cd_ListPutter]の定義 */
	private MCListPutter Hdr_load_port_cd_p = null;

	/**
	 * [Hdr_load_port_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_load_port_cd_ListPutter() {
		if (Hdr_load_port_cd_p == null) {
			Hdr_load_port_cd_p = createHdr_load_port_cd_ListPutter(Hdr_load_port_cd, "load_port_cd", "load_port_nm");

		}
		return Hdr_load_port_cd_p;
	}
	
	
	/** [Hdr_dschrg_port_cd_ListPutter]の定義 */
	private MCListPutter Hdr_dschrg_port_cd_p = null;

	/**
	 * [Hdr_dschrg_port_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dschrg_port_cd_ListPutter() {
		if (Hdr_dschrg_port_cd_p == null) {
			Hdr_dschrg_port_cd_p = createHdr_dschrg_port_cd_ListPutter(Hdr_dschrg_port_cd, "dschrg_port_cd", "dschrg_port_nm");

		}
		return Hdr_dschrg_port_cd_p;
	}
	
	
	/** [Hdr_via_port_cd_ListPutter]の定義 */
	private MCListPutter Hdr_via_port_cd_p = null;

	/**
	 * [Hdr_via_port_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_via_port_cd_ListPutter() {
		if (Hdr_via_port_cd_p == null) {
			Hdr_via_port_cd_p = createHdr_via_port_cd_ListPutter(Hdr_via_port_cd, "via_port_cd", "via_port_nm");

		}
		return Hdr_via_port_cd_p;
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
	
	
	/** [Dtl_trd_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cd_p = null;

	/**
	 * [Dtl_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cd_ListPutter() {
		if (Dtl_trd_cd_p == null) {
			Dtl_trd_cd_p = createDtl_trd_cd_ListPutter(columnDtl_trd_cd, "trd_cd", "trd_nm");

		}
		return Dtl_trd_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","exim_xpns_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sundry_itm_flg","dscnt_itm_flg","stk_mng_typ","asset_mng_typ","asset_mng_typ_nm","trd_unit_cd","sls_upri_cng_flg");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","exim_xpns_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sundry_itm_flg","dscnt_itm_flg","stk_mng_typ","asset_mng_typ","asset_mng_typ_nm","trd_unit_cd","sls_upri_cng_flg");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","exim_xpns_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sundry_itm_flg","dscnt_itm_flg","stk_mng_typ","asset_mng_typ","asset_mng_typ_nm","trd_unit_cd","sls_upri_cng_flg");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","exim_xpns_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sundry_itm_flg","dscnt_itm_flg","stk_mng_typ","asset_mng_typ","asset_mng_typ_nm","trd_unit_cd","sls_upri_cng_flg");
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
			Dtl_trd_unit_cd_p = createDtl_trd_unit_cd_ListPutter(columnDtl_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_dec_place","trd_unit_rnd_typ");

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
	
	
	/** [Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p == null) {
			Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = createDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd, "dscnt_rsn_cd", "dscnt_rsn_nm");
		}
		return Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p;
	}
	
	
	/** [Dtl_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rsn_cd_p = null;

	/**
	 * [Dtl_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rsn_cd_ListPutter() {
		if (Dtl_rsn_cd_p == null) {
			Dtl_rsn_cd_p = createDtl_rsn_cd_ListPutter(columnDtl_rsn_cd, "rsn_cd", "rsn_nm","sls_acxfr_flg");

		}
		return Dtl_rsn_cd_p;
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
	
	
	/** [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "sls_dpt_cd", "sls_dpt_nm","sls_dpt_wg_cd");
		}
		return Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ar_dpt_cd_p = null;

	/**
	 * [Dtl_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ar_dpt_cd_ListPutter() {
		if (Dtl_ar_dpt_cd_p == null) {
			Dtl_ar_dpt_cd_p = createDtl_ar_dpt_cd_ListPutter(columnDtl_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Dtl_ar_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_IvReg create(){
		MSBEP_IvReg p = new MSBEP_IvReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_IvReg create(String name){
		MSBEP_IvReg p = new MSBEP_IvReg(name);
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
		MSBEP_IvReg_MC.jbfInitScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbfInitCnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbfInitHdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbfInitHdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbfInitTtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbfInitHdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbfInitDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbfInitBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbfInitEastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbInitScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbInitCnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbInitHdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbInitHdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbInitTtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbInitHdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbInitDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbInitBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.jbInitEastBtn((MSBEP_IvReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_IvReg p) {
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
		p.Cnd_rcpt_iv_mng_no = p.beansFactory.createTextField("Cnd.rcpt_iv_mng_no");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
		p.Cnd_srch_2 = p.beansFactory.createButton("Cnd.srch_2", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_iv_mng_no = p.beansFactory.createTextField("Hdr.iv_mng_no");
		p.Hdr_rcpt_iv_mng_no = p.beansFactory.createTextField("Hdr.rcpt_iv_mng_no");
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_sls_basis_typ = p.beansFactory.createTextField("Hdr.sls_basis_typ");
		p.Hdr_prov_basis_typ = p.beansFactory.createTextField("Hdr.prov_basis_typ");
		p.Hdr_iv_no_Label = p.beansFactory.createLabel("Hdr.iv_no_Label");
		p.Hdr_iv_no = p.beansFactory.createTextField("Hdr.iv_no");
		p.Hdr_iv_no.setLabel(p.Hdr_iv_no_Label);
		p.Hdr_is_slo_iv_no = p.beansFactory.createCheckBox("Hdr.is_slo_iv_no");
		p.Hdr_num_flg = p.beansFactory.createCheckBox("Hdr.num_flg");
		p.Hdr_iv_rev = p.beansFactory.createNumberField("Hdr.iv_rev");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_iv_dt_Label = p.beansFactory.createLabel("Hdr.iv_dt_Label");
		p.Hdr_iv_dt = p.beansFactory.createDateField("Hdr.iv_dt");
		p.Hdr_iv_dt.setLabel(p.Hdr_iv_dt_Label);
		p.Hdr_iv_src_typ_Label = p.beansFactory.createLabel("Hdr.iv_src_typ_Label");
		p.Hdr_iv_src_typ = p.beansFactory.createTextField("Hdr.iv_src_typ");
		p.Hdr_iv_src_typ.setLabel(p.Hdr_iv_src_typ_Label);
		p.Hdr_iv_src_typ_nm = p.beansFactory.createTextField("Hdr.iv_src_typ_nm");
		p.Hdr_rcpt_iv_no_Label = p.beansFactory.createLabel("Hdr.rcpt_iv_no_Label");
		p.Hdr_rcpt_iv_no = p.beansFactory.createTextField("Hdr.rcpt_iv_no");
		p.Hdr_rcpt_iv_no.setLabel(p.Hdr_rcpt_iv_no_Label);
		p.Hdr_cmpl_schd_dt_Label = p.beansFactory.createLabel("Hdr.cmpl_schd_dt_Label");
		p.Hdr_cmpl_schd_dt = p.beansFactory.createDateField("Hdr.cmpl_schd_dt");
		p.Hdr_cmpl_schd_dt.setLabel(p.Hdr_cmpl_schd_dt_Label);
		p.Hdr_arr_schd_dt_Label = p.beansFactory.createLabel("Hdr.arr_schd_dt_Label");
		p.Hdr_arr_schd_dt = p.beansFactory.createDateField("Hdr.arr_schd_dt");
		p.Hdr_arr_schd_dt.setLabel(p.Hdr_arr_schd_dt_Label);
		p.Hdr_sls_schd_dt_Label = p.beansFactory.createLabel("Hdr.sls_schd_dt_Label");
		p.Hdr_sls_schd_dt = p.beansFactory.createDateField("Hdr.sls_schd_dt");
		p.Hdr_sls_schd_dt.setLabel(p.Hdr_sls_schd_dt_Label);
		p.Hdr_cmpl_dt_Label = p.beansFactory.createLabel("Hdr.cmpl_dt_Label");
		p.Hdr_cmpl_dt = p.beansFactory.createDateField("Hdr.cmpl_dt");
		p.Hdr_cmpl_dt.setLabel(p.Hdr_cmpl_dt_Label);
		p.Hdr_ac_dt_Label = p.beansFactory.createLabel("Hdr.ac_dt_Label");
		p.Hdr_ac_dt = p.beansFactory.createDateField("Hdr.ac_dt");
		p.Hdr_ac_dt.setLabel(p.Hdr_ac_dt_Label);
		p.Hdr_iv_ship_flg = p.beansFactory.createCheckBox("Hdr.iv_ship_flg");
		p.Hdr_iv_immed_prnt_flg = p.beansFactory.createCheckBox("Hdr.iv_immed_prnt_flg");
		p.Hdr_iv_prnt_flg = p.beansFactory.createCheckBox("Hdr.iv_prnt_flg");
		p.Hdr_pl_skip_flg = p.beansFactory.createCheckBox("Hdr.pl_skip_flg");
		p.Hdr_pl_reg_flg = p.beansFactory.createCheckBox("Hdr.pl_reg_flg");
		p.Hdr_non_cmpl_flg = p.beansFactory.createCheckBox("Hdr.non_cmpl_flg");
		p.Hdr_cmpl_flg = p.beansFactory.createCheckBox("Hdr.cmpl_flg");
		p.Hdr_old_iv_ship_flg = p.beansFactory.createCheckBox("Hdr.old_iv_ship_flg");
		p.Hdr_dlv_id_typ_Label = p.beansFactory.createLabel("Hdr.dlv_id_typ_Label");
		p.Hdr_dlv_id_typ = p.beansFactory.createTextField("Hdr.dlv_id_typ");
		p.Hdr_dlv_id_typ.setLabel(p.Hdr_dlv_id_typ_Label);
		p.Hdr_dlv_id_typ_nm = p.beansFactory.createTextField("Hdr.dlv_id_typ_nm");
		p.Hdr_dlv_id_cd_Label = p.beansFactory.createLabel("Hdr.dlv_id_cd_Label");
		p.Hdr_dlv_id_cd = p.beansFactory.createTextField("Hdr.dlv_id_cd");
		p.Hdr_dlv_id_cd.setLabel(p.Hdr_dlv_id_cd_Label);
		p.Hdr_dlv_id_nm = p.beansFactory.createTextField("Hdr.dlv_id_nm");
		p.Hdr_dlv_sundry_flg = p.beansFactory.createCheckBox("Hdr.dlv_sundry_flg");
		p.Hdr_ship_rqst_id_typ_Label = p.beansFactory.createLabel("Hdr.ship_rqst_id_typ_Label");
		p.Hdr_ship_rqst_id_typ = p.beansFactory.createTextField("Hdr.ship_rqst_id_typ");
		p.Hdr_ship_rqst_id_typ.setLabel(p.Hdr_ship_rqst_id_typ_Label);
		p.Hdr_ship_rqst_id_typ_nm = p.beansFactory.createTextField("Hdr.ship_rqst_id_typ_nm");
		p.Hdr_ship_rqst_id_cd_Label = p.beansFactory.createLabel("Hdr.ship_rqst_id_cd_Label");
		p.Hdr_ship_rqst_id_cd = p.beansFactory.createTextField("Hdr.ship_rqst_id_cd");
		p.Hdr_ship_rqst_id_cd.setLabel(p.Hdr_ship_rqst_id_cd_Label);
		p.Hdr_ship_rqst_id_nm = p.beansFactory.createTextField("Hdr.ship_rqst_id_nm");
		p.Hdr_sls_upri_cng_flg = p.beansFactory.createCheckBox("Hdr.sls_upri_cng_flg");
		p.Hdr_via_dlv_typ_Label = p.beansFactory.createLabel("Hdr.via_dlv_typ_Label");
		p.Hdr_via_dlv_typ = p.beansFactory.createTextField("Hdr.via_dlv_typ");
		p.Hdr_via_dlv_typ.setLabel(p.Hdr_via_dlv_typ_Label);
		p.Hdr_via_dlv_typ_nm = p.beansFactory.createTextField("Hdr.via_dlv_typ_nm");
		p.Hdr_tdlv_cd_Label = p.beansFactory.createLabel("Hdr.tdlv_cd_Label");
		p.Hdr_tdlv_cd = p.beansFactory.createTextField("Hdr.tdlv_cd");
		p.Hdr_tdlv_cd.setLabel(p.Hdr_tdlv_cd_Label);
		p.Hdr_tdlv_nm = p.beansFactory.createTextField("Hdr.tdlv_nm");
		p.Hdr_tdlv_sundry_flg = p.beansFactory.createCheckBox("Hdr.tdlv_sundry_flg");
		p.Hdr_sls_cststk_flg = p.beansFactory.createCheckBox("Hdr.sls_cststk_flg");
		p.Hdr_sls_cmpl_flg = p.beansFactory.createCheckBox("Hdr.sls_cmpl_flg");
		p.Hdr_trnspt_cd_Label = p.beansFactory.createLabel("Hdr.trnspt_cd_Label");
		p.Hdr_trnspt_cd = p.beansFactory.createTextComboBox("Hdr.trnspt_cd");
		p.Hdr_trnspt_cd.setLabel(p.Hdr_trnspt_cd_Label);
		p.Hdr_trnspt_nm = p.beansFactory.createTextField("Hdr.trnspt_nm");
		p.Hdr_vssl_flght_Label = p.beansFactory.createLabel("Hdr.vssl_flght_Label");
		p.Hdr_vssl_flght = p.beansFactory.createTextField("Hdr.vssl_flght");
		p.Hdr_vssl_flght.setLabel(p.Hdr_vssl_flght_Label);
		p.Hdr_load_port_cd_Label = p.beansFactory.createLabel("Hdr.load_port_cd_Label");
		p.Hdr_load_port_cd = p.beansFactory.createTextComboBox("Hdr.load_port_cd");
		p.Hdr_load_port_cd.setLabel(p.Hdr_load_port_cd_Label);
		p.Hdr_load_port_nm = p.beansFactory.createTextField("Hdr.load_port_nm");
		p.Hdr_etd_dt_Label = p.beansFactory.createLabel("Hdr.etd_dt_Label");
		p.Hdr_etd_dt = p.beansFactory.createDateField("Hdr.etd_dt");
		p.Hdr_etd_dt.setLabel(p.Hdr_etd_dt_Label);
		p.Hdr_dschrg_port_cd_Label = p.beansFactory.createLabel("Hdr.dschrg_port_cd_Label");
		p.Hdr_dschrg_port_cd = p.beansFactory.createTextComboBox("Hdr.dschrg_port_cd");
		p.Hdr_dschrg_port_cd.setLabel(p.Hdr_dschrg_port_cd_Label);
		p.Hdr_dschrg_port_nm = p.beansFactory.createTextField("Hdr.dschrg_port_nm");
		p.Hdr_eta_dt_Label = p.beansFactory.createLabel("Hdr.eta_dt_Label");
		p.Hdr_eta_dt = p.beansFactory.createDateField("Hdr.eta_dt");
		p.Hdr_eta_dt.setLabel(p.Hdr_eta_dt_Label);
		p.Hdr_via_port_cd_Label = p.beansFactory.createLabel("Hdr.via_port_cd_Label");
		p.Hdr_via_port_cd = p.beansFactory.createTextComboBox("Hdr.via_port_cd");
		p.Hdr_via_port_cd.setLabel(p.Hdr_via_port_cd_Label);
		p.Hdr_via_port_nm = p.beansFactory.createTextField("Hdr.via_port_nm");
		p.Hdr_via_schd_dt_Label = p.beansFactory.createLabel("Hdr.via_schd_dt_Label");
		p.Hdr_via_schd_dt = p.beansFactory.createDateField("Hdr.via_schd_dt");
		p.Hdr_via_schd_dt.setLabel(p.Hdr_via_schd_dt_Label);
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
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextComboBox("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_trd_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr.trd_cur_upri_dec_place");
		p.Hdr_trd_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.trd_cur_amt_dec_place");
		p.Hdr_trd_amt_rnd_typ = p.beansFactory.createTextField("Hdr.trd_amt_rnd_typ");
		p.Hdr_trd_tax_rnd_typ = p.beansFactory.createTextField("Hdr.trd_tax_rnd_typ");
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
		p.Hdr_xrate_cd = p.beansFactory.createTextField("Hdr.xrate_cd");
		p.Hdr_xrate_inpt_flg = p.beansFactory.createCheckBox("Hdr.xrate_inpt_flg");
		p.Hdr_ptax_cur_cd_Label = p.beansFactory.createLabel("Hdr.ptax_cur_cd_Label");
		p.Hdr_ptax_cur_cd = p.beansFactory.createTextField("Hdr.ptax_cur_cd");
		p.Hdr_ptax_cur_cd.setLabel(p.Hdr_ptax_cur_cd_Label);
		p.Hdr_ptax_cur_nm = p.beansFactory.createTextField("Hdr.ptax_cur_nm");
		p.Hdr_ptax_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr.ptax_cur_amt_dec_place");
		p.Hdr_ptax_xrate_inpt_flg = p.beansFactory.createCheckBox("Hdr.ptax_xrate_inpt_flg");
		p.Hdr_tterm_cd3_Label = p.beansFactory.createLabel("Hdr.tterm_cd3_Label");
		p.Hdr_tterm_cd3 = p.beansFactory.createTextComboBox("Hdr.tterm_cd3");
		p.Hdr_tterm_cd3.setLabel(p.Hdr_tterm_cd3_Label);
		p.Hdr_tterm_nm3 = p.beansFactory.createTextField("Hdr.tterm_nm3");
		p.Hdr_tterm_rmrks3_Label = p.beansFactory.createLabel("Hdr.tterm_rmrks3_Label");
		p.Hdr_tterm_rmrks3 = p.beansFactory.createTextField("Hdr.tterm_rmrks3");
		p.Hdr_tterm_rmrks3.setLabel(p.Hdr_tterm_rmrks3_Label);
		p.Hdr_bill_basis_dt_Label = p.beansFactory.createLabel("Hdr.bill_basis_dt_Label");
		p.Hdr_bill_basis_dt = p.beansFactory.createDateField("Hdr.bill_basis_dt");
		p.Hdr_bill_basis_dt.setLabel(p.Hdr_bill_basis_dt_Label);
		p.Hdr_rcv_schd_dt_Label = p.beansFactory.createLabel("Hdr.rcv_schd_dt_Label");
		p.Hdr_rcv_schd_dt = p.beansFactory.createDateField("Hdr.rcv_schd_dt");
		p.Hdr_rcv_schd_dt.setLabel(p.Hdr_rcv_schd_dt_Label);
		p.Hdr_lc_no_Label = p.beansFactory.createLabel("Hdr.lc_no_Label");
		p.Hdr_lc_no = p.beansFactory.createTextField("Hdr.lc_no");
		p.Hdr_lc_no.setLabel(p.Hdr_lc_no_Label);
		p.Hdr_lc_dt_Label = p.beansFactory.createLabel("Hdr.lc_dt_Label");
		p.Hdr_lc_dt = p.beansFactory.createDateField("Hdr.lc_dt");
		p.Hdr_lc_dt.setLabel(p.Hdr_lc_dt_Label);
		p.Hdr_lc_rmrks_Label = p.beansFactory.createLabel("Hdr.lc_rmrks_Label");
		p.Hdr_lc_rmrks = p.beansFactory.createTextField("Hdr.lc_rmrks");
		p.Hdr_lc_rmrks.setLabel(p.Hdr_lc_rmrks_Label);
		p.Hdr_bl_no_Label = p.beansFactory.createLabel("Hdr.bl_no_Label");
		p.Hdr_bl_no = p.beansFactory.createTextField("Hdr.bl_no");
		p.Hdr_bl_no.setLabel(p.Hdr_bl_no_Label);
		p.Hdr_bl_dt_Label = p.beansFactory.createLabel("Hdr.bl_dt_Label");
		p.Hdr_bl_dt = p.beansFactory.createDateField("Hdr.bl_dt");
		p.Hdr_bl_dt.setLabel(p.Hdr_bl_dt_Label);
		p.Hdr_bl_rmrks_Label = p.beansFactory.createLabel("Hdr.bl_rmrks_Label");
		p.Hdr_bl_rmrks = p.beansFactory.createTextField("Hdr.bl_rmrks");
		p.Hdr_bl_rmrks.setLabel(p.Hdr_bl_rmrks_Label);
		p.Hdr_ship_fr_lg_grp_cd = p.beansFactory.createTextField("Hdr.ship_fr_lg_grp_cd");
		p.Hdr_iv_rmrks_Label = p.beansFactory.createLabel("Hdr.iv_rmrks_Label");
		p.Hdr_iv_rmrks = p.beansFactory.createTextField("Hdr.iv_rmrks");
		p.Hdr_iv_rmrks.setLabel(p.Hdr_iv_rmrks_Label);
		p.Hdr_case_mrk1_Label = p.beansFactory.createLabel("Hdr.case_mrk1_Label");
		p.Hdr_case_mrk1 = p.beansFactory.createTextField("Hdr.case_mrk1");
		p.Hdr_case_mrk1.setLabel(p.Hdr_case_mrk1_Label);
		p.Hdr_case_mrk2_Label = p.beansFactory.createLabel("Hdr.case_mrk2_Label");
		p.Hdr_case_mrk2 = p.beansFactory.createTextField("Hdr.case_mrk2");
		p.Hdr_case_mrk2.setLabel(p.Hdr_case_mrk2_Label);
		p.Hdr_case_mrk3_Label = p.beansFactory.createLabel("Hdr.case_mrk3_Label");
		p.Hdr_case_mrk3 = p.beansFactory.createTextField("Hdr.case_mrk3");
		p.Hdr_case_mrk3.setLabel(p.Hdr_case_mrk3_Label);
		p.Hdr_case_mrk4_Label = p.beansFactory.createLabel("Hdr.case_mrk4_Label");
		p.Hdr_case_mrk4 = p.beansFactory.createTextField("Hdr.case_mrk4");
		p.Hdr_case_mrk4.setLabel(p.Hdr_case_mrk4_Label);
		p.Hdr_case_mrk5_Label = p.beansFactory.createLabel("Hdr.case_mrk5_Label");
		p.Hdr_case_mrk5 = p.beansFactory.createTextField("Hdr.case_mrk5");
		p.Hdr_case_mrk5.setLabel(p.Hdr_case_mrk5_Label);
		p.Hdr_case_mrk6_Label = p.beansFactory.createLabel("Hdr.case_mrk6_Label");
		p.Hdr_case_mrk6 = p.beansFactory.createTextField("Hdr.case_mrk6");
		p.Hdr_case_mrk6.setLabel(p.Hdr_case_mrk6_Label);
		p.Hdr_pre_rcpt_iv_flg = p.beansFactory.createCheckBox("Hdr.pre_rcpt_iv_flg");
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
		p.Hdr_bill_cl_typ = p.beansFactory.createTextField("Hdr.bill_cl_typ");
		p.Hdr_purc_ddlv_flg = p.beansFactory.createCheckBox("Hdr.purc_ddlv_flg");
		p.Hdr_ar_dpt_typ = p.beansFactory.createTextField("Hdr.ar_dpt_typ");
		p.Hdr_lnk_ar_dpt_cd = p.beansFactory.createTextField("Hdr.lnk_ar_dpt_cd");
		p.Hdr_prnt_lcl_cd = p.beansFactory.createTextField("Hdr.prnt_lcl_cd");
		p.Hdr_iv_upd_cntr = p.beansFactory.createNumberField("Hdr.iv_upd_cntr");
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
	 * [Ttl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTtl(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.TtlPanel = p.beansFactory.createPanel("Ttl");
		// ブロックの項目の初期化
		p.Ttl_ttl_iv_amt_Label = p.beansFactory.createLabel("Ttl.ttl_iv_amt_Label");
		p.Ttl_ttl_iv_amt = p.beansFactory.createNumberField("Ttl.ttl_iv_amt");
		p.Ttl_ttl_iv_amt.setLabel(p.Ttl_ttl_iv_amt_Label);
		p.Ttl_ttl_ncv_amt_Label = p.beansFactory.createLabel("Ttl.ttl_ncv_amt_Label");
		p.Ttl_ttl_ncv_amt = p.beansFactory.createNumberField("Ttl.ttl_ncv_amt");
		p.Ttl_ttl_ncv_amt.setLabel(p.Ttl_ttl_ncv_amt_Label);
		p.Ttl_ttl_base_amt_Label = p.beansFactory.createLabel("Ttl.ttl_base_amt_Label");
		p.Ttl_ttl_base_amt = p.beansFactory.createNumberField("Ttl.ttl_base_amt");
		p.Ttl_ttl_base_amt.setLabel(p.Ttl_ttl_base_amt_Label);
		p.Ttl_ttl_freight_amt_Label = p.beansFactory.createLabel("Ttl.ttl_freight_amt_Label");
		p.Ttl_ttl_freight_amt = p.beansFactory.createNumberField("Ttl.ttl_freight_amt");
		p.Ttl_ttl_freight_amt.setLabel(p.Ttl_ttl_freight_amt_Label);
		p.Ttl_ttl_insurance_amt_Label = p.beansFactory.createLabel("Ttl.ttl_insurance_amt_Label");
		p.Ttl_ttl_insurance_amt = p.beansFactory.createNumberField("Ttl.ttl_insurance_amt");
		p.Ttl_ttl_insurance_amt.setLabel(p.Ttl_ttl_insurance_amt_Label);
		p.Ttl_ttl_other_amt_Label = p.beansFactory.createLabel("Ttl.ttl_other_amt_Label");
		p.Ttl_ttl_other_amt = p.beansFactory.createNumberField("Ttl.ttl_other_amt");
		p.Ttl_ttl_other_amt.setLabel(p.Ttl_ttl_other_amt_Label);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_iv_mng_no = p.beansFactory.createTableColumn("Dtl.iv_mng_no", MCColumnType.TEXT);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_bndl_flg = p.beansFactory.createTableColumn("Dtl.bndl_flg", MCColumnType.CHECK);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_exim_xpns_typ = p.beansFactory.createTableColumn("Dtl.exim_xpns_typ", MCColumnType.TEXT);
		p.columnDtl_cntry_org_cd = p.beansFactory.createTableColumn("Dtl.cntry_org_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cntry_org_nm = p.beansFactory.createTableColumn("Dtl.cntry_org_nm", MCColumnType.TEXT);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_upri_qty = p.beansFactory.createTableColumn("Dtl.upri_qty", MCColumnType.NUMBER);
		p.columnDtl_max_base_unit_qty = p.beansFactory.createTableColumn("Dtl.max_base_unit_qty", MCColumnType.NUMBER);
		p.columnDtl_max_trd_unit_qty = p.beansFactory.createTableColumn("Dtl.max_trd_unit_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_schd_trd_cur_dscnt_amt = p.beansFactory.createTableColumn("Dtl.schd_trd_cur_dscnt_amt", MCColumnType.NUMBER);
		p.columnDtl_schd_base_unit_qty = p.beansFactory.createTableColumn("Dtl.schd_base_unit_qty", MCColumnType.NUMBER);
		p.columnDtl_cst_po_no = p.beansFactory.createTableColumn("Dtl.cst_po_no", MCColumnType.TEXT);
		p.columnDtl_cst_po_d_no = p.beansFactory.createTableColumn("Dtl.cst_po_d_no", MCColumnType.TEXT);
		p.columnDtl_multi_ship_fr_lg_grp_flg = p.beansFactory.createTableColumn("Dtl.multi_ship_fr_lg_grp_flg", MCColumnType.CHECK);
		p.columnDtl_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_ship_fr_lg_grp_nm = p.beansFactory.createTableColumn("Dtl.ship_fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnDtl_rsn_cd = p.beansFactory.createTableColumn("Dtl.rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_rsn_nm = p.beansFactory.createTableColumn("Dtl.rsn_nm", MCColumnType.TEXT);
		p.columnDtl_sls_acxfr_flg = p.beansFactory.createTableColumn("Dtl.sls_acxfr_flg", MCColumnType.CHECK);
		p.columnDtl_bd_dpt_cd = p.beansFactory.createTableColumn("Dtl.bd_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_bd_dpt_nm = p.beansFactory.createTableColumn("Dtl.bd_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_sls_dpt_wg_cd = p.beansFactory.createTableColumn("Dtl.sls_dpt_wg_cd", MCColumnType.TEXT);
		p.columnDtl_ar_dpt_cd = p.beansFactory.createTableColumn("Dtl.ar_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_ar_dpt_nm = p.beansFactory.createTableColumn("Dtl.ar_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_iv_d_rmrks = p.beansFactory.createTableColumn("Dtl.iv_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_rmrks = p.beansFactory.createTableColumn("Dtl.trd_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_d_rmrks = p.beansFactory.createTableColumn("Dtl.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_dtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.dtl_sub_char1", MCColumnType.TEXT);
		p.columnDtl_dtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.dtl_sub_char2", MCColumnType.TEXT);
		p.columnDtl_dtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.dtl_sub_char3", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_ship_rqst_no = p.beansFactory.createTableColumn("Dtl.ship_rqst_no", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_xfr_schd_no = p.beansFactory.createTableColumn("Dtl.xfr_schd_no", MCColumnType.TEXT);
		p.columnDtl_ship_inst_no = p.beansFactory.createTableColumn("Dtl.ship_inst_no", MCColumnType.TEXT);
		p.columnDtl_ship_inst_d_no = p.beansFactory.createTableColumn("Dtl.ship_inst_d_no", MCColumnType.TEXT);
		p.columnDtl_ship_act_no = p.beansFactory.createTableColumn("Dtl.ship_act_no", MCColumnType.TEXT);
		p.columnDtl_ship_act_d_no = p.beansFactory.createTableColumn("Dtl.ship_act_d_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_ship_alloc_sts_no = p.beansFactory.createTableColumn("Dtl.ship_alloc_sts_no", MCColumnType.TEXT);
		p.columnDtl_uplnd_flg = p.beansFactory.createTableColumn("Dtl.uplnd_flg", MCColumnType.CHECK);
		p.columnDtl_dest_cd1 = p.beansFactory.createTableColumn("Dtl.dest_cd1", MCColumnType.TEXT);
		p.columnDtl_dest_cd2 = p.beansFactory.createTableColumn("Dtl.dest_cd2", MCColumnType.TEXT);
		p.columnDtl_dest_cd3 = p.beansFactory.createTableColumn("Dtl.dest_cd3", MCColumnType.TEXT);
		p.columnDtl_sls_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.sls_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_purc_schd_no = p.beansFactory.createTableColumn("Dtl.purc_schd_no", MCColumnType.TEXT);
		p.columnDtl_purc_act_d_no = p.beansFactory.createTableColumn("Dtl.purc_act_d_no", MCColumnType.TEXT);
		p.columnDtl_iv_d_no = p.beansFactory.createTableColumn("Dtl.iv_d_no", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_ptax_cur_amt = p.beansFactory.createTableColumn("Dtl.ptax_cur_amt", MCColumnType.NUMBER);
		p.columnDtl_wtax_rate = p.beansFactory.createTableColumn("Dtl.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_wtax_amt = p.beansFactory.createTableColumn("Dtl.wtax_amt", MCColumnType.NUMBER);
		p.columnDtl_ship_schd_no = p.beansFactory.createTableColumn("Dtl.ship_schd_no", MCColumnType.TEXT);
		p.columnDtl_pr_sts_typ = p.beansFactory.createTableColumn("Dtl.pr_sts_typ", MCColumnType.TEXT);
		p.columnDtl_manual_add_flg = p.beansFactory.createTableColumn("Dtl.manual_add_flg", MCColumnType.CHECK);
		p.columnDtl_existed_flg = p.beansFactory.createTableColumn("Dtl.existed_flg", MCColumnType.CHECK);
		p.columnDtl_purc_ddlv_flg = p.beansFactory.createTableColumn("Dtl.purc_ddlv_flg", MCColumnType.CHECK);
		p.columnDtl_ship_pr_no = p.beansFactory.createTableColumn("Dtl.ship_pr_no", MCColumnType.TEXT);
		p.columnDtl_ship_inst_typ = p.beansFactory.createTableColumn("Dtl.ship_inst_typ", MCColumnType.TEXT);
		p.columnDtl_ship_inst_qty = p.beansFactory.createTableColumn("Dtl.ship_inst_qty", MCColumnType.NUMBER);
		p.columnDtl_ship_act_qty = p.beansFactory.createTableColumn("Dtl.ship_act_qty", MCColumnType.NUMBER);
		p.columnDtl_ship_pr_upd_cntr = p.beansFactory.createTableColumn("Dtl.ship_pr_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_index = p.beansFactory.createTableColumn("Dtl.index", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1740 = p.beansFactory.createButton("Btn.open_MSBEP1740", "open");
		p.Btn_open_MSBEP1750 = p.beansFactory.createButton("Btn.open_MSBEP1750", "open");
		p.Btn_sprt = p.beansFactory.createButton("Btn.sprt", "calc");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_move_top = p.beansFactory.createButton("Btn.move_top", "no_border");
		p.Btn_move_up = p.beansFactory.createButton("Btn.move_up", "no_border");
		p.Btn_move_down = p.beansFactory.createButton("Btn.move_down", "no_border");
		p.Btn_move_bottom = p.beansFactory.createButton("Btn.move_bottom", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_IvReg p) {
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
	protected static void jbInitCnd(MSBEP_IvReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1730.CndR.ope_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ);
		p.CndPanel.setLastBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ.setNextBeans(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1730.CndR.srch_tgt_typ_META);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.Cnd_srch_tgt_typ_nm.setLinkBeans(p.Cnd_srch_tgt_typ);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ_nm.setNextBeans(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1730.CndR.srch_tgt_typ_nm_META);
		p.CndPanel.add(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_no.setNextBeans(p.Cnd_srch_tgt_rev);
		p.Cnd_srch_tgt_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1730.CndR.srch_tgt_no_META);
		p.CndPanel.add(p.Cnd_srch_tgt_rev);
		p.Cnd_srch_tgt_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_srch_tgt_rev.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1730.CndR.srch_tgt_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1730.CndR.latest_flg_META);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_mng_no.setNextBeans(p.Cnd_srch);
		p.Cnd_rcpt_iv_mng_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1730.CndR.rcpt_iv_mng_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
		p.Cnd_srch.setNextBeans(p.Cnd_srch_2);
		p.Cnd_srch_2.setIcon("SEARCH");
		p.Cnd_srch_2.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_2);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.TtlPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_iv_mng_no);
		p.HdrPanel.setLastBeans(p.Hdr_iv_mng_no);
		p.Hdr_iv_mng_no.setNextBeans(p.Hdr_rcpt_iv_mng_no);
		p.Hdr_iv_mng_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_mng_no_META);
		p.HdrPanel.add(p.Hdr_rcpt_iv_mng_no);
		p.Hdr_rcpt_iv_mng_no.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_rcpt_iv_mng_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.rcpt_iv_mng_no_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_sls_basis_typ);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_sls_basis_typ);
		p.Hdr_sls_basis_typ.setNextBeans(p.Hdr_prov_basis_typ);
		p.Hdr_sls_basis_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.sls_basis_typ_META);
		p.HdrPanel.add(p.Hdr_prov_basis_typ);
		p.Hdr_prov_basis_typ.setNextBeans(p.Hdr_iv_no);
		p.Hdr_prov_basis_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.prov_basis_typ_META);
		p.HdrPanel.add(p.Hdr_iv_no_Label);
		p.HdrPanel.add(p.Hdr_iv_no);
		p.Hdr_iv_no.setNextBeans(p.Hdr_is_slo_iv_no);
		p.Hdr_iv_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_no_META);
		p.HdrPanel.add(p.Hdr_is_slo_iv_no);
		p.Hdr_is_slo_iv_no.setNextBeans(p.Hdr_num_flg);
		p.Hdr_is_slo_iv_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.is_slo_iv_no_META);
		p.HdrPanel.add(p.Hdr_num_flg);
		p.Hdr_num_flg.setNextBeans(p.Hdr_iv_rev);
		p.Hdr_num_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.num_flg_META);
		p.HdrPanel.add(p.Hdr_iv_rev);
		p.Hdr_iv_rev.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_iv_rev.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_rev_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_can_flg);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_iv_dt);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.can_flg_META);
		p.HdrPanel.add(p.Hdr_iv_dt_Label);
		p.HdrPanel.add(p.Hdr_iv_dt);
		p.Hdr_iv_dt.setNextBeans(p.Hdr_iv_src_typ);
		p.Hdr_iv_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_dt_META);
		p.Hdr_iv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_iv_src_typ_Label);
		p.HdrPanel.add(p.Hdr_iv_src_typ);
		p.Hdr_iv_src_typ.setNextBeans(p.Hdr_iv_src_typ_nm);
		p.Hdr_iv_src_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_src_typ_META);
		p.HdrPanel.add(p.Hdr_iv_src_typ_nm);
		p.Hdr_iv_src_typ_nm.setNextBeans(p.Hdr_rcpt_iv_no);
		p.Hdr_iv_src_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_src_typ_nm_META);
		p.HdrPanel.add(p.Hdr_rcpt_iv_no_Label);
		p.HdrPanel.add(p.Hdr_rcpt_iv_no);
		p.Hdr_rcpt_iv_no.setNextBeans(p.Hdr_cmpl_schd_dt);
		p.Hdr_rcpt_iv_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.rcpt_iv_no_META);
		p.HdrPanel.add(p.Hdr_cmpl_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_cmpl_schd_dt);
		p.Hdr_cmpl_schd_dt.setNextBeans(p.Hdr_arr_schd_dt);
		p.Hdr_cmpl_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.cmpl_schd_dt_META);
		p.Hdr_cmpl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_arr_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_arr_schd_dt);
		p.Hdr_arr_schd_dt.setNextBeans(p.Hdr_sls_schd_dt);
		p.Hdr_arr_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.arr_schd_dt_META);
		p.Hdr_arr_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_sls_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_sls_schd_dt);
		p.Hdr_sls_schd_dt.setNextBeans(p.Hdr_cmpl_dt);
		p.Hdr_sls_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.sls_schd_dt_META);
		p.Hdr_sls_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_cmpl_dt_Label);
		p.HdrPanel.add(p.Hdr_cmpl_dt);
		p.Hdr_cmpl_dt.setNextBeans(p.Hdr_ac_dt);
		p.Hdr_cmpl_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.cmpl_dt_META);
		p.Hdr_cmpl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_ac_dt_Label);
		p.HdrPanel.add(p.Hdr_ac_dt);
		p.Hdr_ac_dt.setNextBeans(p.Hdr_iv_ship_flg);
		p.Hdr_ac_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ac_dt_META);
		p.Hdr_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_iv_ship_flg);
		p.Hdr_iv_ship_flg.setNextBeans(p.Hdr_iv_immed_prnt_flg);
		p.Hdr_iv_ship_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_ship_flg_META);
		p.HdrPanel.add(p.Hdr_iv_immed_prnt_flg);
		p.Hdr_iv_immed_prnt_flg.setNextBeans(p.Hdr_iv_prnt_flg);
		p.Hdr_iv_immed_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_immed_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_iv_prnt_flg);
		p.Hdr_iv_prnt_flg.setNextBeans(p.Hdr_pl_skip_flg);
		p.Hdr_iv_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_pl_skip_flg);
		p.Hdr_pl_skip_flg.setNextBeans(p.Hdr_pl_reg_flg);
		p.Hdr_pl_skip_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.pl_skip_flg_META);
		p.HdrPanel.add(p.Hdr_pl_reg_flg);
		p.Hdr_pl_reg_flg.setNextBeans(p.Hdr_non_cmpl_flg);
		p.Hdr_pl_reg_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.pl_reg_flg_META);
		p.HdrPanel.add(p.Hdr_non_cmpl_flg);
		p.Hdr_non_cmpl_flg.setNextBeans(p.Hdr_cmpl_flg);
		p.Hdr_non_cmpl_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.non_cmpl_flg_META);
		p.HdrPanel.add(p.Hdr_cmpl_flg);
		p.Hdr_cmpl_flg.setNextBeans(p.Hdr_old_iv_ship_flg);
		p.Hdr_cmpl_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.cmpl_flg_META);
		p.HdrPanel.add(p.Hdr_old_iv_ship_flg);
		p.Hdr_old_iv_ship_flg.setNextBeans(p.Hdr_dlv_id_typ);
		p.Hdr_old_iv_ship_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.old_iv_ship_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_id_typ_Label);
		p.HdrPanel.add(p.Hdr_dlv_id_typ);
		p.Hdr_dlv_id_typ.setNextBeans(p.Hdr_dlv_id_typ_nm);
		p.Hdr_dlv_id_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.dlv_id_typ_META);
		p.HdrPanel.add(p.Hdr_dlv_id_typ_nm);
		p.Hdr_dlv_id_typ_nm.setNextBeans(p.Hdr_dlv_id_cd);
		p.Hdr_dlv_id_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.dlv_id_typ_nm_META);
		p.HdrPanel.add(p.Hdr_dlv_id_cd_Label);
		p.HdrPanel.add(p.Hdr_dlv_id_cd);
		p.Hdr_dlv_id_cd.setNextBeans(p.Hdr_dlv_id_nm);
		p.Hdr_dlv_id_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.dlv_id_cd_META);
		p.HdrPanel.add(p.Hdr_dlv_id_nm);
		p.Hdr_dlv_id_nm.setNextBeans(p.Hdr_dlv_sundry_flg);
		p.Hdr_dlv_id_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.dlv_id_nm_META);
		p.HdrPanel.add(p.Hdr_dlv_sundry_flg);
		p.Hdr_dlv_sundry_flg.setNextBeans(p.Hdr_dlv_addr_p_PPanel);
		p.Hdr_dlv_sundry_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.dlv_sundry_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_addr_p_PPanel);
		p.Hdr_dlv_addr_p_PPanel.setNextBeans(p.Hdr_ship_rqst_id_typ);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_typ_Label);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_typ);
		p.Hdr_ship_rqst_id_typ.setNextBeans(p.Hdr_ship_rqst_id_typ_nm);
		p.Hdr_ship_rqst_id_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ship_rqst_id_typ_META);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_typ_nm);
		p.Hdr_ship_rqst_id_typ_nm.setNextBeans(p.Hdr_ship_rqst_id_cd);
		p.Hdr_ship_rqst_id_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ship_rqst_id_typ_nm_META);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_cd_Label);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_cd);
		p.Hdr_ship_rqst_id_cd.setNextBeans(p.Hdr_ship_rqst_id_nm);
		p.Hdr_ship_rqst_id_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ship_rqst_id_cd_META);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_nm);
		p.Hdr_ship_rqst_id_nm.setNextBeans(p.Hdr_sls_upri_cng_flg);
		p.Hdr_ship_rqst_id_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ship_rqst_id_nm_META);
		p.HdrPanel.add(p.Hdr_sls_upri_cng_flg);
		p.Hdr_sls_upri_cng_flg.setNextBeans(p.Hdr_via_dlv_typ);
		p.Hdr_sls_upri_cng_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.sls_upri_cng_flg_META);
		p.HdrPanel.add(p.Hdr_via_dlv_typ_Label);
		p.HdrPanel.add(p.Hdr_via_dlv_typ);
		p.Hdr_via_dlv_typ.setNextBeans(p.Hdr_via_dlv_typ_nm);
		p.Hdr_via_dlv_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.via_dlv_typ_META);
		p.HdrPanel.add(p.Hdr_via_dlv_typ_nm);
		p.Hdr_via_dlv_typ_nm.setNextBeans(p.Hdr_tdlv_cd);
		p.Hdr_via_dlv_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.via_dlv_typ_nm_META);
		p.HdrPanel.add(p.Hdr_tdlv_cd_Label);
		p.HdrPanel.add(p.Hdr_tdlv_cd);
		p.Hdr_tdlv_cd.setNextBeans(p.Hdr_tdlv_nm);
		p.Hdr_tdlv_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tdlv_cd_META);
		p.HdrPanel.add(p.Hdr_tdlv_nm);
		p.Hdr_tdlv_nm.setNextBeans(p.Hdr_tdlv_sundry_flg);
		p.Hdr_tdlv_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tdlv_nm_META);
		p.HdrPanel.add(p.Hdr_tdlv_sundry_flg);
		p.Hdr_tdlv_sundry_flg.setNextBeans(p.Hdr_tdlv_addr_p_PPanel);
		p.Hdr_tdlv_sundry_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tdlv_sundry_flg_META);
		p.HdrPanel.add(p.Hdr_tdlv_addr_p_PPanel);
		p.Hdr_tdlv_addr_p_PPanel.setNextBeans(p.Hdr_sls_cststk_flg);
		p.HdrPanel.add(p.Hdr_sls_cststk_flg);
		p.Hdr_sls_cststk_flg.setNextBeans(p.Hdr_sls_cmpl_flg);
		p.Hdr_sls_cststk_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.sls_cststk_flg_META);
		p.HdrPanel.add(p.Hdr_sls_cmpl_flg);
		p.Hdr_sls_cmpl_flg.setNextBeans(p.Hdr_trnspt_cd);
		p.Hdr_sls_cmpl_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.sls_cmpl_flg_META);
		p.Hdr_trnspt_cd.setListType(MCListType.STRICT);
		p.Hdr_trnspt_cd.setLinkBeans(p.Hdr_trnspt_nm);
		p.HdrPanel.add(p.Hdr_trnspt_cd_Label);
		p.HdrPanel.add(p.Hdr_trnspt_cd);
		p.Hdr_trnspt_cd.setNextBeans(p.Hdr_trnspt_nm);
		p.Hdr_trnspt_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.trnspt_cd_META);
		p.HdrPanel.add(p.Hdr_trnspt_nm);
		p.Hdr_trnspt_nm.setNextBeans(p.Hdr_vssl_flght);
		p.Hdr_trnspt_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.trnspt_nm_META);
		p.HdrPanel.add(p.Hdr_vssl_flght_Label);
		p.HdrPanel.add(p.Hdr_vssl_flght);
		p.Hdr_vssl_flght.setNextBeans(p.Hdr_load_port_cd);
		p.Hdr_vssl_flght.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.vssl_flght_META);
		p.Hdr_load_port_cd.setListType(MCListType.STRICT);
		p.Hdr_load_port_cd.setLinkBeans(p.Hdr_load_port_nm);
		p.HdrPanel.add(p.Hdr_load_port_cd_Label);
		p.HdrPanel.add(p.Hdr_load_port_cd);
		p.Hdr_load_port_cd.setNextBeans(p.Hdr_load_port_nm);
		p.Hdr_load_port_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.load_port_cd_META);
		p.HdrPanel.add(p.Hdr_load_port_nm);
		p.Hdr_load_port_nm.setNextBeans(p.Hdr_etd_dt);
		p.Hdr_load_port_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.load_port_nm_META);
		p.HdrPanel.add(p.Hdr_etd_dt_Label);
		p.HdrPanel.add(p.Hdr_etd_dt);
		p.Hdr_etd_dt.setNextBeans(p.Hdr_dschrg_port_cd);
		p.Hdr_etd_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.etd_dt_META);
		p.Hdr_etd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr_dschrg_port_cd.setListType(MCListType.STRICT);
		p.Hdr_dschrg_port_cd.setLinkBeans(p.Hdr_dschrg_port_nm);
		p.HdrPanel.add(p.Hdr_dschrg_port_cd_Label);
		p.HdrPanel.add(p.Hdr_dschrg_port_cd);
		p.Hdr_dschrg_port_cd.setNextBeans(p.Hdr_dschrg_port_nm);
		p.Hdr_dschrg_port_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.dschrg_port_cd_META);
		p.HdrPanel.add(p.Hdr_dschrg_port_nm);
		p.Hdr_dschrg_port_nm.setNextBeans(p.Hdr_eta_dt);
		p.Hdr_dschrg_port_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.dschrg_port_nm_META);
		p.HdrPanel.add(p.Hdr_eta_dt_Label);
		p.HdrPanel.add(p.Hdr_eta_dt);
		p.Hdr_eta_dt.setNextBeans(p.Hdr_via_port_cd);
		p.Hdr_eta_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.eta_dt_META);
		p.Hdr_eta_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr_via_port_cd.setListType(MCListType.STRICT);
		p.Hdr_via_port_cd.setLinkBeans(p.Hdr_via_port_nm);
		p.HdrPanel.add(p.Hdr_via_port_cd_Label);
		p.HdrPanel.add(p.Hdr_via_port_cd);
		p.Hdr_via_port_cd.setNextBeans(p.Hdr_via_port_nm);
		p.Hdr_via_port_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.via_port_cd_META);
		p.HdrPanel.add(p.Hdr_via_port_nm);
		p.Hdr_via_port_nm.setNextBeans(p.Hdr_via_schd_dt);
		p.Hdr_via_port_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.via_port_nm_META);
		p.HdrPanel.add(p.Hdr_via_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_via_schd_dt);
		p.Hdr_via_schd_dt.setNextBeans(p.Hdr_tterm_cd1);
		p.Hdr_via_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.via_schd_dt_META);
		p.Hdr_via_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr_tterm_cd1.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd1.setLinkBeans(p.Hdr_tterm_nm1);
		p.HdrPanel.add(p.Hdr_tterm_cd1_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd1);
		p.Hdr_tterm_cd1.setNextBeans(p.Hdr_tterm_nm1);
		p.Hdr_tterm_cd1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tterm_cd1_META);
		p.HdrPanel.add(p.Hdr_tterm_nm1);
		p.Hdr_tterm_nm1.setNextBeans(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_nm1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tterm_nm1_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks1);
		p.Hdr_tterm_rmrks1.setNextBeans(p.Hdr_tterm_cd2);
		p.Hdr_tterm_rmrks1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tterm_rmrks1_META);
		p.Hdr_tterm_cd2.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd2.setLinkBeans(p.Hdr_tterm_nm2);
		p.HdrPanel.add(p.Hdr_tterm_cd2_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd2);
		p.Hdr_tterm_cd2.setNextBeans(p.Hdr_tterm_nm2);
		p.Hdr_tterm_cd2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tterm_cd2_META);
		p.HdrPanel.add(p.Hdr_tterm_nm2);
		p.Hdr_tterm_nm2.setNextBeans(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_nm2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tterm_nm2_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks2);
		p.Hdr_tterm_rmrks2.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_tterm_rmrks2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tterm_rmrks2_META);
		p.Hdr_trd_cur_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cur_cd.setLinkBeans(p.Hdr_trd_cur_nm,p.Hdr_trd_cur_amt_dec_place,p.Hdr_trd_cur_upri_dec_place);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_trd_cur_upri_dec_place);
		p.Hdr_trd_cur_upri_dec_place.setNextBeans(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.trd_cur_upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_dec_place);
		p.Hdr_trd_cur_amt_dec_place.setNextBeans(p.Hdr_trd_amt_rnd_typ);
		p.Hdr_trd_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.trd_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_trd_amt_rnd_typ);
		p.Hdr_trd_amt_rnd_typ.setNextBeans(p.Hdr_trd_tax_rnd_typ);
		p.Hdr_trd_amt_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.trd_amt_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_trd_tax_rnd_typ);
		p.Hdr_trd_tax_rnd_typ.setNextBeans(p.Hdr_base_cur_cd);
		p.Hdr_trd_tax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.trd_tax_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_xrate_cd);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_xrate_cd);
		p.Hdr_xrate_cd.setNextBeans(p.Hdr_xrate_inpt_flg);
		p.Hdr_xrate_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.xrate_cd_META);
		p.HdrPanel.add(p.Hdr_xrate_inpt_flg);
		p.Hdr_xrate_inpt_flg.setNextBeans(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_inpt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.xrate_inpt_flg_META);
		p.HdrPanel.add(p.Hdr_xrate_p_PPanel);
		p.Hdr_xrate_p_PPanel.setNextBeans(p.Hdr_ptax_cur_cd);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_ptax_cur_cd);
		p.Hdr_ptax_cur_cd.setNextBeans(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ptax_cur_cd_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_nm);
		p.Hdr_ptax_cur_nm.setNextBeans(p.Hdr_ptax_cur_amt_dec_place);
		p.Hdr_ptax_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ptax_cur_nm_META);
		p.HdrPanel.add(p.Hdr_ptax_cur_amt_dec_place);
		p.Hdr_ptax_cur_amt_dec_place.setNextBeans(p.Hdr_ptax_xrate_inpt_flg);
		p.Hdr_ptax_cur_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ptax_cur_amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_ptax_xrate_inpt_flg);
		p.Hdr_ptax_xrate_inpt_flg.setNextBeans(p.Hdr_ptax_xrate_p_PPanel);
		p.Hdr_ptax_xrate_inpt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ptax_xrate_inpt_flg_META);
		p.HdrPanel.add(p.Hdr_ptax_xrate_p_PPanel);
		p.Hdr_ptax_xrate_p_PPanel.setNextBeans(p.Hdr_trd_cur_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_p_PPanel);
		p.Hdr_trd_cur_amt_p_PPanel.setNextBeans(p.Hdr_trd_cur_amt_inc_tax_p_PPanel);
		p.HdrPanel.add(p.Hdr_trd_cur_amt_inc_tax_p_PPanel);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.setNextBeans(p.Hdr_tterm_cd3);
		p.Hdr_tterm_cd3.setListType(MCListType.STRICT);
		p.Hdr_tterm_cd3.setLinkBeans(p.Hdr_tterm_nm3);
		p.HdrPanel.add(p.Hdr_tterm_cd3_Label);
		p.HdrPanel.add(p.Hdr_tterm_cd3);
		p.Hdr_tterm_cd3.setNextBeans(p.Hdr_tterm_nm3);
		p.Hdr_tterm_cd3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tterm_cd3_META);
		p.HdrPanel.add(p.Hdr_tterm_nm3);
		p.Hdr_tterm_nm3.setNextBeans(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_nm3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tterm_nm3_META);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3_Label);
		p.HdrPanel.add(p.Hdr_tterm_rmrks3);
		p.Hdr_tterm_rmrks3.setNextBeans(p.Hdr_bill_basis_dt);
		p.Hdr_tterm_rmrks3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.tterm_rmrks3_META);
		p.HdrPanel.add(p.Hdr_bill_basis_dt_Label);
		p.HdrPanel.add(p.Hdr_bill_basis_dt);
		p.Hdr_bill_basis_dt.setNextBeans(p.Hdr_rcv_schd_dt);
		p.Hdr_bill_basis_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.bill_basis_dt_META);
		p.Hdr_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_rcv_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_rcv_schd_dt);
		p.Hdr_rcv_schd_dt.setNextBeans(p.Hdr_lc_no);
		p.Hdr_rcv_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.rcv_schd_dt_META);
		p.Hdr_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_lc_no_Label);
		p.HdrPanel.add(p.Hdr_lc_no);
		p.Hdr_lc_no.setNextBeans(p.Hdr_lc_dt);
		p.Hdr_lc_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.lc_no_META);
		p.HdrPanel.add(p.Hdr_lc_dt_Label);
		p.HdrPanel.add(p.Hdr_lc_dt);
		p.Hdr_lc_dt.setNextBeans(p.Hdr_lc_rmrks);
		p.Hdr_lc_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.lc_dt_META);
		p.Hdr_lc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_lc_rmrks_Label);
		p.HdrPanel.add(p.Hdr_lc_rmrks);
		p.Hdr_lc_rmrks.setNextBeans(p.Hdr_bl_no);
		p.Hdr_lc_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.lc_rmrks_META);
		p.HdrPanel.add(p.Hdr_bl_no_Label);
		p.HdrPanel.add(p.Hdr_bl_no);
		p.Hdr_bl_no.setNextBeans(p.Hdr_bl_dt);
		p.Hdr_bl_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.bl_no_META);
		p.HdrPanel.add(p.Hdr_bl_dt_Label);
		p.HdrPanel.add(p.Hdr_bl_dt);
		p.Hdr_bl_dt.setNextBeans(p.Hdr_bl_rmrks);
		p.Hdr_bl_dt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.bl_dt_META);
		p.Hdr_bl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_bl_rmrks_Label);
		p.HdrPanel.add(p.Hdr_bl_rmrks);
		p.Hdr_bl_rmrks.setNextBeans(p.Hdr_ship_fr_lg_grp_cd);
		p.Hdr_bl_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.bl_rmrks_META);
		p.HdrPanel.add(p.Hdr_ship_fr_lg_grp_cd);
		p.Hdr_ship_fr_lg_grp_cd.setNextBeans(p.Hdr_iv_rmrks);
		p.Hdr_ship_fr_lg_grp_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ship_fr_lg_grp_cd_META);
		p.HdrPanel.add(p.Hdr_iv_rmrks_Label);
		p.HdrPanel.add(p.Hdr_iv_rmrks);
		p.Hdr_iv_rmrks.setNextBeans(p.Hdr_case_mrk1);
		p.Hdr_iv_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_rmrks_META);
		p.HdrPanel.add(p.Hdr_case_mrk1_Label);
		p.HdrPanel.add(p.Hdr_case_mrk1);
		p.Hdr_case_mrk1.setNextBeans(p.Hdr_case_mrk2);
		p.Hdr_case_mrk1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.case_mrk1_META);
		p.HdrPanel.add(p.Hdr_case_mrk2_Label);
		p.HdrPanel.add(p.Hdr_case_mrk2);
		p.Hdr_case_mrk2.setNextBeans(p.Hdr_case_mrk3);
		p.Hdr_case_mrk2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.case_mrk2_META);
		p.HdrPanel.add(p.Hdr_case_mrk3_Label);
		p.HdrPanel.add(p.Hdr_case_mrk3);
		p.Hdr_case_mrk3.setNextBeans(p.Hdr_case_mrk4);
		p.Hdr_case_mrk3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.case_mrk3_META);
		p.HdrPanel.add(p.Hdr_case_mrk4_Label);
		p.HdrPanel.add(p.Hdr_case_mrk4);
		p.Hdr_case_mrk4.setNextBeans(p.Hdr_case_mrk5);
		p.Hdr_case_mrk4.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.case_mrk4_META);
		p.HdrPanel.add(p.Hdr_case_mrk5_Label);
		p.HdrPanel.add(p.Hdr_case_mrk5);
		p.Hdr_case_mrk5.setNextBeans(p.Hdr_case_mrk6);
		p.Hdr_case_mrk5.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.case_mrk5_META);
		p.HdrPanel.add(p.Hdr_case_mrk6_Label);
		p.HdrPanel.add(p.Hdr_case_mrk6);
		p.Hdr_case_mrk6.setNextBeans(p.Hdr_pre_rcpt_iv_flg);
		p.Hdr_case_mrk6.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.case_mrk6_META);
		p.HdrPanel.add(p.Hdr_pre_rcpt_iv_flg);
		p.Hdr_pre_rcpt_iv_flg.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_pre_rcpt_iv_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.pre_rcpt_iv_flg_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_bill_cl_typ);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.sub_char3_META);
		p.HdrPanel.add(p.Hdr_bill_cl_typ);
		p.Hdr_bill_cl_typ.setNextBeans(p.Hdr_purc_ddlv_flg);
		p.Hdr_bill_cl_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.bill_cl_typ_META);
		p.HdrPanel.add(p.Hdr_purc_ddlv_flg);
		p.Hdr_purc_ddlv_flg.setNextBeans(p.Hdr_ar_dpt_typ);
		p.Hdr_purc_ddlv_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.purc_ddlv_flg_META);
		p.HdrPanel.add(p.Hdr_ar_dpt_typ);
		p.Hdr_ar_dpt_typ.setNextBeans(p.Hdr_lnk_ar_dpt_cd);
		p.Hdr_ar_dpt_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ar_dpt_typ_META);
		p.HdrPanel.add(p.Hdr_lnk_ar_dpt_cd);
		p.Hdr_lnk_ar_dpt_cd.setNextBeans(p.Hdr_prnt_lcl_cd);
		p.Hdr_lnk_ar_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.lnk_ar_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_prnt_lcl_cd);
		p.Hdr_prnt_lcl_cd.setNextBeans(p.Hdr_iv_upd_cntr);
		p.Hdr_prnt_lcl_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.prnt_lcl_cd_META);
		p.HdrPanel.add(p.Hdr_iv_upd_cntr);
		p.Hdr_iv_upd_cntr.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.iv_upd_cntr_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1730.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Ttl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTtl(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.add(p.TtlPanel);
		p.TtlPanel.setNextBeans(p.DtlPanel);
		p.TtlPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.TtlPanel.add(p.Ttl_ttl_iv_amt_Label);
		p.TtlPanel.add(p.Ttl_ttl_iv_amt);
		p.TtlPanel.setLastBeans(p.Ttl_ttl_iv_amt);
		p.Ttl_ttl_iv_amt.setNextBeans(p.Ttl_ttl_ncv_amt);
		p.Ttl_ttl_iv_amt.setRow(p.getTtlR(), mcframe.clientMSBE.MSBEP1730.TtlR.ttl_iv_amt_META);
		p.TtlPanel.add(p.Ttl_ttl_ncv_amt_Label);
		p.TtlPanel.add(p.Ttl_ttl_ncv_amt);
		p.Ttl_ttl_ncv_amt.setNextBeans(p.Ttl_ttl_base_amt);
		p.Ttl_ttl_ncv_amt.setRow(p.getTtlR(), mcframe.clientMSBE.MSBEP1730.TtlR.ttl_ncv_amt_META);
		p.TtlPanel.add(p.Ttl_ttl_base_amt_Label);
		p.TtlPanel.add(p.Ttl_ttl_base_amt);
		p.Ttl_ttl_base_amt.setNextBeans(p.Ttl_ttl_freight_amt);
		p.Ttl_ttl_base_amt.setRow(p.getTtlR(), mcframe.clientMSBE.MSBEP1730.TtlR.ttl_base_amt_META);
		p.TtlPanel.add(p.Ttl_ttl_freight_amt_Label);
		p.TtlPanel.add(p.Ttl_ttl_freight_amt);
		p.Ttl_ttl_freight_amt.setNextBeans(p.Ttl_ttl_insurance_amt);
		p.Ttl_ttl_freight_amt.setRow(p.getTtlR(), mcframe.clientMSBE.MSBEP1730.TtlR.ttl_freight_amt_META);
		p.TtlPanel.add(p.Ttl_ttl_insurance_amt_Label);
		p.TtlPanel.add(p.Ttl_ttl_insurance_amt);
		p.Ttl_ttl_insurance_amt.setNextBeans(p.Ttl_ttl_other_amt);
		p.Ttl_ttl_insurance_amt.setRow(p.getTtlR(), mcframe.clientMSBE.MSBEP1730.TtlR.ttl_insurance_amt_META);
		p.TtlPanel.add(p.Ttl_ttl_other_amt_Label);
		p.TtlPanel.add(p.Ttl_ttl_other_amt);
		p.Ttl_ttl_other_amt.setRow(p.getTtlR(), mcframe.clientMSBE.MSBEP1730.TtlR.ttl_other_amt_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBEP_IvReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_IvReg p) {
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
	protected static void jbInitBtn(MSBEP_IvReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1740.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP1740);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP1740);
		p.Btn_open_MSBEP1740.setNextBeans(p.Btn_open_MSBEP1750);
		p.Btn_open_MSBEP1750.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP1750);
		p.Btn_open_MSBEP1750.setNextBeans(p.Btn_sprt);
		p.Btn_sprt.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_sprt);
		p.Btn_sprt.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_move_top);
		p.Btn_move_top.setIcon("MOVE_TOP");
		p.Btn_move_top.setFunctionKey(MCFunctionKey.F18);
		p.BtnPanel.add(p.Btn_move_top);
		p.Btn_move_top.setNextBeans(p.Btn_move_up);
		p.Btn_move_up.setIcon("MOVE_UP");
		p.Btn_move_up.setFunctionKey(MCFunctionKey.F19);
		p.BtnPanel.add(p.Btn_move_up);
		p.Btn_move_up.setNextBeans(p.Btn_move_down);
		p.Btn_move_down.setIcon("MOVE_DOWN");
		p.Btn_move_down.setFunctionKey(MCFunctionKey.F20);
		p.BtnPanel.add(p.Btn_move_down);
		p.Btn_move_down.setNextBeans(p.Btn_move_bottom);
		p.Btn_move_bottom.setIcon("MOVE_BOTTOM");
		p.Btn_move_bottom.setFunctionKey(MCFunctionKey.F21);
		p.BtnPanel.add(p.Btn_move_bottom);
		p.Btn_move_bottom.setNextBeans(p.Btn_ins);
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
	protected static void jbInitEastBtn(MSBEP_IvReg p) {
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
		MSBEP_IvReg_MC.mcInitScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.mcInitCnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.mcInitHdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.mcInitHdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.mcInitTtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.mcInitHdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.mcInitDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.mcInitBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.mcInitEastBtn((MSBEP_IvReg)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitSRCH_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitSRCH_UpriSrch((MSBEP_IvReg)this);

		// [INS]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitINS_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitINS_UpriSrch((MSBEP_IvReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitFIX__I_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__I_UpriSrch((MSBEP_IvReg)this);

		// [UPD1]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitUPD1_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD1_UpriSrch((MSBEP_IvReg)this);

		// [UPD2]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitUPD2_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD2_UpriSrch((MSBEP_IvReg)this);

		// [UPD3]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitUPD3_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitUPD3_UpriSrch((MSBEP_IvReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__U_UpriSrch((MSBEP_IvReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitDEL_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitDEL_UpriSrch((MSBEP_IvReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitFIX__D_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitFIX__D_UpriSrch((MSBEP_IvReg)this);

		// [REF]ステータスのモードの設定
		MSBEP_IvReg_MC.statusInitREF_ScreenOpe((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_Cnd((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_Cnd2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_HdrTab((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_Hdr((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_Ttl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_Hdr2((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_Dtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_MapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_Btn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_EastBtn((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_ShipInstMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_ShipActMapDtl((MSBEP_IvReg)this);
		MSBEP_IvReg_MC.statusInitREF_UpriSrch((MSBEP_IvReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_IvReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_IvReg p) {
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
		p.Cnd_rcpt_iv_mng_no.setListListener(p);
		p.Cnd_rcpt_iv_mng_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
		p.Cnd_srch_2.addAllListener(p);
		p.Cnd_srch_2.setAPMethodName("doCnd_srch_2");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBEP_IvReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBEP_IvReg p) {
		p.Hdr_iv_mng_no.setListListener(p);
		p.Hdr_iv_mng_no.addAllListener(p);
		p.Hdr_rcpt_iv_mng_no.setListListener(p);
		p.Hdr_rcpt_iv_mng_no.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_sls_basis_typ.setListListener(p);
		p.Hdr_sls_basis_typ.addAllListener(p);
		p.Hdr_prov_basis_typ.setListListener(p);
		p.Hdr_prov_basis_typ.addAllListener(p);
		p.Hdr_iv_no.setListListener(p);
		p.Hdr_iv_no.addAllListener(p);
		p.Hdr_is_slo_iv_no.addAllListener(p);
		p.Hdr_num_flg.addAllListener(p);
		p.Hdr_iv_rev.setListListener(p);
		p.Hdr_iv_rev.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_iv_dt.setListListener(p);
		p.Hdr_iv_dt.addAllListener(p);
		p.Hdr_iv_src_typ.setListListener(p);
		p.Hdr_iv_src_typ.addAllListener(p);
		p.Hdr_iv_src_typ_nm.setListListener(p);
		p.Hdr_iv_src_typ_nm.addAllListener(p);
		p.Hdr_rcpt_iv_no.setListListener(p);
		p.Hdr_rcpt_iv_no.addAllListener(p);
		p.Hdr_cmpl_schd_dt.setListListener(p);
		p.Hdr_cmpl_schd_dt.addAllListener(p);
		p.Hdr_arr_schd_dt.setListListener(p);
		p.Hdr_arr_schd_dt.addAllListener(p);
		p.Hdr_sls_schd_dt.setListListener(p);
		p.Hdr_sls_schd_dt.addAllListener(p);
		p.Hdr_cmpl_dt.setListListener(p);
		p.Hdr_cmpl_dt.addAllListener(p);
		p.Hdr_ac_dt.setListListener(p);
		p.Hdr_ac_dt.addAllListener(p);
		p.Hdr_iv_ship_flg.addAllListener(p);
		p.Hdr_iv_immed_prnt_flg.addAllListener(p);
		p.Hdr_iv_prnt_flg.addAllListener(p);
		p.Hdr_pl_skip_flg.addAllListener(p);
		p.Hdr_pl_reg_flg.addAllListener(p);
		p.Hdr_non_cmpl_flg.addAllListener(p);
		p.Hdr_cmpl_flg.addAllListener(p);
		p.Hdr_old_iv_ship_flg.addAllListener(p);
		p.Hdr_dlv_id_typ.setListListener(p);
		p.Hdr_dlv_id_typ.addAllListener(p);
		p.Hdr_dlv_id_typ_nm.setListListener(p);
		p.Hdr_dlv_id_typ_nm.addAllListener(p);
		p.Hdr_dlv_id_cd.setListListener(p);
		p.Hdr_dlv_id_cd.addAllListener(p);
		p.Hdr_dlv_id_nm.setListListener(p);
		p.Hdr_dlv_id_nm.addAllListener(p);
		p.Hdr_dlv_sundry_flg.addAllListener(p);
		p.Hdr_ship_rqst_id_typ.setListListener(p);
		p.Hdr_ship_rqst_id_typ.addAllListener(p);
		p.Hdr_ship_rqst_id_typ_nm.setListListener(p);
		p.Hdr_ship_rqst_id_typ_nm.addAllListener(p);
		p.Hdr_ship_rqst_id_cd.setListListener(p);
		p.Hdr_ship_rqst_id_cd.addAllListener(p);
		p.Hdr_ship_rqst_id_nm.setListListener(p);
		p.Hdr_ship_rqst_id_nm.addAllListener(p);
		p.Hdr_sls_upri_cng_flg.addAllListener(p);
		p.Hdr_via_dlv_typ.setListListener(p);
		p.Hdr_via_dlv_typ.addAllListener(p);
		p.Hdr_via_dlv_typ_nm.setListListener(p);
		p.Hdr_via_dlv_typ_nm.addAllListener(p);
		p.Hdr_tdlv_cd.setListListener(p);
		p.Hdr_tdlv_cd.addAllListener(p);
		p.Hdr_tdlv_nm.setListListener(p);
		p.Hdr_tdlv_nm.addAllListener(p);
		p.Hdr_tdlv_sundry_flg.addAllListener(p);
		p.Hdr_sls_cststk_flg.addAllListener(p);
		p.Hdr_sls_cmpl_flg.addAllListener(p);
		p.Hdr_trnspt_cd.setListListener(p);
		p.Hdr_trnspt_cd.addAllListener(p);
		p.Hdr_trnspt_nm.setListListener(p);
		p.Hdr_trnspt_nm.addAllListener(p);
		p.Hdr_vssl_flght.setListListener(p);
		p.Hdr_vssl_flght.addAllListener(p);
		p.Hdr_load_port_cd.setListListener(p);
		p.Hdr_load_port_cd.addAllListener(p);
		p.Hdr_load_port_nm.setListListener(p);
		p.Hdr_load_port_nm.addAllListener(p);
		p.Hdr_etd_dt.setListListener(p);
		p.Hdr_etd_dt.addAllListener(p);
		p.Hdr_dschrg_port_cd.setListListener(p);
		p.Hdr_dschrg_port_cd.addAllListener(p);
		p.Hdr_dschrg_port_nm.setListListener(p);
		p.Hdr_dschrg_port_nm.addAllListener(p);
		p.Hdr_eta_dt.setListListener(p);
		p.Hdr_eta_dt.addAllListener(p);
		p.Hdr_via_port_cd.setListListener(p);
		p.Hdr_via_port_cd.addAllListener(p);
		p.Hdr_via_port_nm.setListListener(p);
		p.Hdr_via_port_nm.addAllListener(p);
		p.Hdr_via_schd_dt.setListListener(p);
		p.Hdr_via_schd_dt.addAllListener(p);
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
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_trd_cur_upri_dec_place.setListListener(p);
		p.Hdr_trd_cur_upri_dec_place.addAllListener(p);
		p.Hdr_trd_cur_amt_dec_place.setListListener(p);
		p.Hdr_trd_cur_amt_dec_place.addAllListener(p);
		p.Hdr_trd_amt_rnd_typ.setListListener(p);
		p.Hdr_trd_amt_rnd_typ.addAllListener(p);
		p.Hdr_trd_tax_rnd_typ.setListListener(p);
		p.Hdr_trd_tax_rnd_typ.addAllListener(p);
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_base_cur_nm.setListListener(p);
		p.Hdr_base_cur_nm.addAllListener(p);
		p.Hdr_xrate_cd.setListListener(p);
		p.Hdr_xrate_cd.addAllListener(p);
		p.Hdr_xrate_inpt_flg.addAllListener(p);
		p.Hdr_ptax_cur_cd.setListListener(p);
		p.Hdr_ptax_cur_cd.addAllListener(p);
		p.Hdr_ptax_cur_nm.setListListener(p);
		p.Hdr_ptax_cur_nm.addAllListener(p);
		p.Hdr_ptax_cur_amt_dec_place.setListListener(p);
		p.Hdr_ptax_cur_amt_dec_place.addAllListener(p);
		p.Hdr_ptax_xrate_inpt_flg.addAllListener(p);
		p.Hdr_tterm_cd3.setListListener(p);
		p.Hdr_tterm_cd3.addAllListener(p);
		p.Hdr_tterm_nm3.setListListener(p);
		p.Hdr_tterm_nm3.addAllListener(p);
		p.Hdr_tterm_rmrks3.setListListener(p);
		p.Hdr_tterm_rmrks3.addAllListener(p);
		p.Hdr_bill_basis_dt.setListListener(p);
		p.Hdr_bill_basis_dt.addAllListener(p);
		p.Hdr_rcv_schd_dt.setListListener(p);
		p.Hdr_rcv_schd_dt.addAllListener(p);
		p.Hdr_lc_no.setListListener(p);
		p.Hdr_lc_no.addAllListener(p);
		p.Hdr_lc_dt.setListListener(p);
		p.Hdr_lc_dt.addAllListener(p);
		p.Hdr_lc_rmrks.setListListener(p);
		p.Hdr_lc_rmrks.addAllListener(p);
		p.Hdr_bl_no.setListListener(p);
		p.Hdr_bl_no.addAllListener(p);
		p.Hdr_bl_dt.setListListener(p);
		p.Hdr_bl_dt.addAllListener(p);
		p.Hdr_bl_rmrks.setListListener(p);
		p.Hdr_bl_rmrks.addAllListener(p);
		p.Hdr_ship_fr_lg_grp_cd.setListListener(p);
		p.Hdr_ship_fr_lg_grp_cd.addAllListener(p);
		p.Hdr_iv_rmrks.setListListener(p);
		p.Hdr_iv_rmrks.addAllListener(p);
		p.Hdr_case_mrk1.setListListener(p);
		p.Hdr_case_mrk1.addAllListener(p);
		p.Hdr_case_mrk2.setListListener(p);
		p.Hdr_case_mrk2.addAllListener(p);
		p.Hdr_case_mrk3.setListListener(p);
		p.Hdr_case_mrk3.addAllListener(p);
		p.Hdr_case_mrk4.setListListener(p);
		p.Hdr_case_mrk4.addAllListener(p);
		p.Hdr_case_mrk5.setListListener(p);
		p.Hdr_case_mrk5.addAllListener(p);
		p.Hdr_case_mrk6.setListListener(p);
		p.Hdr_case_mrk6.addAllListener(p);
		p.Hdr_pre_rcpt_iv_flg.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_bill_cl_typ.setListListener(p);
		p.Hdr_bill_cl_typ.addAllListener(p);
		p.Hdr_purc_ddlv_flg.addAllListener(p);
		p.Hdr_ar_dpt_typ.setListListener(p);
		p.Hdr_ar_dpt_typ.addAllListener(p);
		p.Hdr_lnk_ar_dpt_cd.setListListener(p);
		p.Hdr_lnk_ar_dpt_cd.addAllListener(p);
		p.Hdr_prnt_lcl_cd.setListListener(p);
		p.Hdr_prnt_lcl_cd.addAllListener(p);
		p.Hdr_iv_upd_cntr.setListListener(p);
		p.Hdr_iv_upd_cntr.addAllListener(p);
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
	 *  [Ttl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTtl(MSBEP_IvReg p) {
		p.Ttl_ttl_iv_amt.setListListener(p);
		p.Ttl_ttl_iv_amt.addAllListener(p);
		p.Ttl_ttl_ncv_amt.setListListener(p);
		p.Ttl_ttl_ncv_amt.addAllListener(p);
		p.Ttl_ttl_base_amt.setListListener(p);
		p.Ttl_ttl_base_amt.addAllListener(p);
		p.Ttl_ttl_freight_amt.setListListener(p);
		p.Ttl_ttl_freight_amt.addAllListener(p);
		p.Ttl_ttl_insurance_amt.setListListener(p);
		p.Ttl_ttl_insurance_amt.addAllListener(p);
		p.Ttl_ttl_other_amt.setListListener(p);
		p.Ttl_ttl_other_amt.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBEP_IvReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_IvReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_iv_mng_no.addAllListener(p);
		p.columnDtl_iv_mng_no.setListListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_bndl_flg.addAllListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_exim_xpns_typ.addAllListener(p);
		p.columnDtl_exim_xpns_typ.setListListener(p);
		p.columnDtl_cntry_org_cd.addAllListener(p);
		p.columnDtl_cntry_org_cd.setListListener(p);
		p.columnDtl_cntry_org_nm.addAllListener(p);
		p.columnDtl_cntry_org_nm.setListListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
		p.columnDtl_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl_upri_qty.addAllListener(p);
		p.columnDtl_upri_qty.setListListener(p);
		p.columnDtl_max_base_unit_qty.addAllListener(p);
		p.columnDtl_max_base_unit_qty.setListListener(p);
		p.columnDtl_max_trd_unit_qty.addAllListener(p);
		p.columnDtl_max_trd_unit_qty.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_schd_trd_cur_dscnt_amt.addAllListener(p);
		p.columnDtl_schd_trd_cur_dscnt_amt.setListListener(p);
		p.columnDtl_schd_base_unit_qty.addAllListener(p);
		p.columnDtl_schd_base_unit_qty.setListListener(p);
		p.columnDtl_cst_po_no.addAllListener(p);
		p.columnDtl_cst_po_no.setListListener(p);
		p.columnDtl_cst_po_d_no.addAllListener(p);
		p.columnDtl_cst_po_d_no.setListListener(p);
		p.columnDtl_multi_ship_fr_lg_grp_flg.addAllListener(p);
		p.columnDtl_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnDtl_ship_fr_lg_grp_cd.setListListener(p);
		p.columnDtl_ship_fr_lg_grp_nm.addAllListener(p);
		p.columnDtl_ship_fr_lg_grp_nm.setListListener(p);
		p.columnDtl_rsn_cd.addAllListener(p);
		p.columnDtl_rsn_cd.setListListener(p);
		p.columnDtl_rsn_nm.addAllListener(p);
		p.columnDtl_rsn_nm.setListListener(p);
		p.columnDtl_sls_acxfr_flg.addAllListener(p);
		p.columnDtl_bd_dpt_cd.addAllListener(p);
		p.columnDtl_bd_dpt_cd.setListListener(p);
		p.columnDtl_bd_dpt_nm.addAllListener(p);
		p.columnDtl_bd_dpt_nm.setListListener(p);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_sls_dpt_wg_cd.addAllListener(p);
		p.columnDtl_sls_dpt_wg_cd.setListListener(p);
		p.columnDtl_ar_dpt_cd.addAllListener(p);
		p.columnDtl_ar_dpt_cd.setListListener(p);
		p.columnDtl_ar_dpt_nm.addAllListener(p);
		p.columnDtl_ar_dpt_nm.setListListener(p);
		p.columnDtl_iv_d_rmrks.addAllListener(p);
		p.columnDtl_iv_d_rmrks.setListListener(p);
		p.columnDtl_trd_rmrks.addAllListener(p);
		p.columnDtl_trd_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_intr_d_rmrks.addAllListener(p);
		p.columnDtl_intr_d_rmrks.setListListener(p);
		p.columnDtl_dtl_sub_char1.addAllListener(p);
		p.columnDtl_dtl_sub_char1.setListListener(p);
		p.columnDtl_dtl_sub_char2.addAllListener(p);
		p.columnDtl_dtl_sub_char2.setListListener(p);
		p.columnDtl_dtl_sub_char3.addAllListener(p);
		p.columnDtl_dtl_sub_char3.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_ship_rqst_no.addAllListener(p);
		p.columnDtl_ship_rqst_no.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_xfr_schd_no.addAllListener(p);
		p.columnDtl_xfr_schd_no.setListListener(p);
		p.columnDtl_ship_inst_no.addAllListener(p);
		p.columnDtl_ship_inst_no.setListListener(p);
		p.columnDtl_ship_inst_d_no.addAllListener(p);
		p.columnDtl_ship_inst_d_no.setListListener(p);
		p.columnDtl_ship_act_no.addAllListener(p);
		p.columnDtl_ship_act_no.setListListener(p);
		p.columnDtl_ship_act_d_no.addAllListener(p);
		p.columnDtl_ship_act_d_no.setListListener(p);
		p.columnDtl_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_dlv_slip_d_no.setListListener(p);
		p.columnDtl_ship_alloc_sts_no.addAllListener(p);
		p.columnDtl_ship_alloc_sts_no.setListListener(p);
		p.columnDtl_uplnd_flg.addAllListener(p);
		p.columnDtl_dest_cd1.addAllListener(p);
		p.columnDtl_dest_cd1.setListListener(p);
		p.columnDtl_dest_cd2.addAllListener(p);
		p.columnDtl_dest_cd2.setListListener(p);
		p.columnDtl_dest_cd3.addAllListener(p);
		p.columnDtl_dest_cd3.setListListener(p);
		p.columnDtl_sls_upri_cng_flg.addAllListener(p);
		p.columnDtl_purc_schd_no.addAllListener(p);
		p.columnDtl_purc_schd_no.setListListener(p);
		p.columnDtl_purc_act_d_no.addAllListener(p);
		p.columnDtl_purc_act_d_no.setListListener(p);
		p.columnDtl_iv_d_no.addAllListener(p);
		p.columnDtl_iv_d_no.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_ptax_cur_amt.addAllListener(p);
		p.columnDtl_ptax_cur_amt.setListListener(p);
		p.columnDtl_wtax_rate.addAllListener(p);
		p.columnDtl_wtax_rate.setListListener(p);
		p.columnDtl_wtax_amt.addAllListener(p);
		p.columnDtl_wtax_amt.setListListener(p);
		p.columnDtl_ship_schd_no.addAllListener(p);
		p.columnDtl_ship_schd_no.setListListener(p);
		p.columnDtl_pr_sts_typ.addAllListener(p);
		p.columnDtl_pr_sts_typ.setListListener(p);
		p.columnDtl_manual_add_flg.addAllListener(p);
		p.columnDtl_existed_flg.addAllListener(p);
		p.columnDtl_purc_ddlv_flg.addAllListener(p);
		p.columnDtl_ship_pr_no.addAllListener(p);
		p.columnDtl_ship_pr_no.setListListener(p);
		p.columnDtl_ship_inst_typ.addAllListener(p);
		p.columnDtl_ship_inst_typ.setListListener(p);
		p.columnDtl_ship_inst_qty.addAllListener(p);
		p.columnDtl_ship_inst_qty.setListListener(p);
		p.columnDtl_ship_act_qty.addAllListener(p);
		p.columnDtl_ship_act_qty.setListListener(p);
		p.columnDtl_ship_pr_upd_cntr.addAllListener(p);
		p.columnDtl_ship_pr_upd_cntr.setListListener(p);
		p.columnDtl_index.addAllListener(p);
		p.columnDtl_index.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_IvReg p) {
		p.Btn_open_MSBEP1740.addAllListener(p);
		p.Btn_open_MSBEP1740.setAPMethodName("doBtn_open_MSBEP1740");
		p.Btn_open_MSBEP1750.addAllListener(p);
		p.Btn_open_MSBEP1750.setAPMethodName("doBtn_open_MSBEP1750");
		p.Btn_sprt.addAllListener(p);
		p.Btn_sprt.setAPMethodName("doBtn_sprt");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_move_top.addAllListener(p);
		p.Btn_move_top.setAPMethodName("doBtn_move_top");
		p.Btn_move_up.addAllListener(p);
		p.Btn_move_up.setAPMethodName("doBtn_move_up");
		p.Btn_move_down.addAllListener(p);
		p.Btn_move_down.setAPMethodName("doBtn_move_down");
		p.Btn_move_bottom.addAllListener(p);
		p.Btn_move_bottom.setAPMethodName("doBtn_move_bottom");
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
	protected static void mcInitEastBtn(MSBEP_IvReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_is_slo_iv_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_arr_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cmpl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_immed_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pl_reg_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_load_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_load_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_via_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_via_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lc_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lc_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lc_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bl_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_case_mrk1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_case_mrk2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_case_mrk3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_case_mrk4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_case_mrk5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_case_mrk6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
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
	 * [SRCH]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_upri_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [SRCH]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [SRCH]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [SRCH]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_UpriSrch(MSBEP_IvReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_mng_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_is_slo_iv_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_iv_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_iv_src_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_arr_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_sls_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_cmpl_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_iv_immed_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_iv_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_pl_reg_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trnspt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_load_port_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_load_port_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_dschrg_port_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_dschrg_port_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_via_port_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_via_port_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_trd_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_bill_basis_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_rcv_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_lc_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_lc_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_lc_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_bl_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_bl_dt.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_bl_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_case_mrk1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_case_mrk2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_case_mrk3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_case_mrk4.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_case_mrk5.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_case_mrk6.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_bill_cl_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
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
	 * [INS]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cntry_org_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_upri_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_iv_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.REQUIRED);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.REQUIRED);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_ar_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MSBEP1750.putMode(p, INS, MCMode.ENABLE);
		p.Btn_sprt.putMode(p, INS, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_move_top.putMode(p, INS, MCMode.ENABLE);
		p.Btn_move_up.putMode(p, INS, MCMode.ENABLE);
		p.Btn_move_down.putMode(p, INS, MCMode.ENABLE);
		p.Btn_move_bottom.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [INS]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [INS]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [INS]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitINS_UpriSrch(MSBEP_IvReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_mng_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_is_slo_iv_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_arr_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cmpl_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_immed_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pl_reg_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_load_port_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_load_port_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_via_port_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_via_port_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lc_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lc_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lc_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bl_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bl_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bl_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_case_mrk1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_case_mrk2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_case_mrk3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_case_mrk4.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_case_mrk5.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_case_mrk6.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
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
	 * [FIX_I]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_upri_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_sprt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [FIX_I]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [FIX_I]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [FIX_I]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_UpriSrch(MSBEP_IvReg p){

	}

	/**
	 * [UPD1]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [UPD1]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, UPD1, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD1, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_mng_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, UPD1, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, UPD1, MCMode.INVISIBLE);

	}

	/**
	 * [UPD1]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [UPD1]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [UPD1]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_is_slo_iv_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_iv_rev.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_iv_src_typ.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_arr_schd_dt.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_sls_schd_dt.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_cmpl_dt.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_iv_immed_prnt_flg.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_iv_prnt_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_pl_reg_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_trnspt_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_load_port_cd.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_load_port_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_dschrg_port_cd.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_dschrg_port_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_via_port_cd.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_via_port_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_tterm_cd1.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_tterm_nm1.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_tterm_cd2.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_tterm_nm2.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_trd_cur_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_xrate_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_ptax_cur_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, UPD1, MCMode.REQUIRED);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_tterm_nm3.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_bill_basis_dt.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_rcv_schd_dt.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_lc_no.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_lc_dt.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_lc_rmrks.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_bl_no.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_bl_dt.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_bl_rmrks.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_case_mrk1.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_case_mrk2.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_case_mrk3.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_case_mrk4.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_case_mrk5.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_case_mrk6.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD1, MCMode.ENABLE);
		p.Hdr_bill_cl_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD1, MCMode.READ_ONLY);

	}

	/**
	 * [UPD1]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, UPD1, MCMode.READ_ONLY);

	}

	/**
	 * [UPD1]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [UPD1]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, UPD1, MCMode.REQUIRED);
		p.columnDtl_trd_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_cntry_org_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD1, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_upri_qty.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(UPD1, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD1, MCMode.REQUIRED);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_iv_amt_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(UPD1, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.REQUIRED);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_rsn_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.REQUIRED);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD1, MCMode.REQUIRED);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_trd_rmrks.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char1.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char2.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char3.putMode(p, UPD1, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(UPD1, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD1, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, UPD1, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, UPD1, MCMode.INVISIBLE);

	}

	/**
	 * [UPD1]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [UPD1]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_open_MSBEP1750.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_sprt.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD1, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_move_top.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_move_up.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_move_down.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_move_bottom.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD1, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD1, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD1, MCMode.DISABLE);

	}

	/**
	 * [UPD1]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [UPD1]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [UPD1]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [UPD1]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD1_UpriSrch(MSBEP_IvReg p){

	}

	/**
	 * [UPD2]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [UPD2]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, UPD2, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD2, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_mng_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, UPD2, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, UPD2, MCMode.INVISIBLE);

	}

	/**
	 * [UPD2]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [UPD2]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [UPD2]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_is_slo_iv_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_iv_rev.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, UPD2, MCMode.REQUIRED);
		p.Hdr_arr_schd_dt.putMode(p, UPD2, MCMode.REQUIRED);
		p.Hdr_sls_schd_dt.putMode(p, UPD2, MCMode.REQUIRED);
		p.Hdr_cmpl_dt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_iv_immed_prnt_flg.putMode(p, UPD2, MCMode.REQUIRED);
		p.Hdr_iv_prnt_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_pl_reg_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_load_port_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_load_port_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_via_port_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_via_port_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, UPD2, MCMode.ENABLE);
		p.Hdr_rcv_schd_dt.putMode(p, UPD2, MCMode.ENABLE);
		p.Hdr_lc_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_lc_dt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_lc_rmrks.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_bl_no.putMode(p, UPD2, MCMode.ENABLE);
		p.Hdr_bl_dt.putMode(p, UPD2, MCMode.ENABLE);
		p.Hdr_bl_rmrks.putMode(p, UPD2, MCMode.ENABLE);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_case_mrk1.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_case_mrk2.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_case_mrk3.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_case_mrk4.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_case_mrk5.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_case_mrk6.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD2, MCMode.READ_ONLY);

	}

	/**
	 * [UPD2]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, UPD2, MCMode.READ_ONLY);

	}

	/**
	 * [UPD2]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [UPD2]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, UPD2, MCMode.REQUIRED);
		p.columnDtl_trd_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_cntry_org_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD2, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_upri_qty.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(UPD2, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD2, MCMode.REQUIRED);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_iv_amt_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(UPD2, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.REQUIRED);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_rsn_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.REQUIRED);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD2, MCMode.REQUIRED);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_trd_rmrks.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char1.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char2.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_dtl_sub_char3.putMode(p, UPD2, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(UPD2, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD2, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, UPD2, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, UPD2, MCMode.INVISIBLE);

	}

	/**
	 * [UPD2]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [UPD2]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, UPD2, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, UPD2, MCMode.ENABLE);
		p.Btn_sprt.putMode(p, UPD2, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD2, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD2, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD2, MCMode.ENABLE);
		p.Btn_move_top.putMode(p, UPD2, MCMode.ENABLE);
		p.Btn_move_up.putMode(p, UPD2, MCMode.ENABLE);
		p.Btn_move_down.putMode(p, UPD2, MCMode.ENABLE);
		p.Btn_move_bottom.putMode(p, UPD2, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD2, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD2, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD2, MCMode.DISABLE);

	}

	/**
	 * [UPD2]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [UPD2]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [UPD2]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [UPD2]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD2_UpriSrch(MSBEP_IvReg p){

	}

	/**
	 * [UPD3]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [UPD3]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, UPD3, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD3, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_mng_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, UPD3, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, UPD3, MCMode.INVISIBLE);

	}

	/**
	 * [UPD3]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [UPD3]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [UPD3]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_is_slo_iv_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_iv_rev.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_arr_schd_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_sls_schd_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_cmpl_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_iv_immed_prnt_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_iv_prnt_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_pl_reg_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_load_port_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_load_port_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_via_port_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_via_port_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_lc_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_lc_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_lc_rmrks.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_bl_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_bl_dt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_bl_rmrks.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_case_mrk1.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_case_mrk2.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_case_mrk3.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_case_mrk4.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_case_mrk5.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_case_mrk6.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Hdr_ins_usr_id.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD3, MCMode.READ_ONLY);

	}

	/**
	 * [UPD3]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, UPD3, MCMode.READ_ONLY);

	}

	/**
	 * [UPD3]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [UPD3]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_upri_qty.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(UPD3, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(UPD3, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(UPD3, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD3, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, UPD3, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, UPD3, MCMode.INVISIBLE);

	}

	/**
	 * [UPD3]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [UPD3]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_sprt.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD3, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD3, MCMode.DISABLE);
		p.Btn_del.putMode(p, UPD3, MCMode.DISABLE);

	}

	/**
	 * [UPD3]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [UPD3]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [UPD3]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [UPD3]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD3_UpriSrch(MSBEP_IvReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_is_slo_iv_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_arr_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cmpl_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_immed_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pl_reg_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_load_port_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_load_port_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_via_port_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_via_port_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lc_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lc_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lc_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bl_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bl_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bl_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_case_mrk1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_case_mrk2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_case_mrk3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_case_mrk4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_case_mrk5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_case_mrk6.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
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
	 * [FIX_U]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_upri_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_sprt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [FIX_U]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [FIX_U]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [FIX_U]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_UpriSrch(MSBEP_IvReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_mng_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_is_slo_iv_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_arr_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cmpl_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_immed_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pl_reg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_load_port_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_load_port_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_via_port_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_via_port_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lc_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lc_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lc_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bl_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bl_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bl_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_case_mrk1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_case_mrk2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_case_mrk3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_case_mrk4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_case_mrk5.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_case_mrk6.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
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
	 * [DEL]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_upri_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_sprt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [DEL]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [DEL]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [DEL]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitDEL_UpriSrch(MSBEP_IvReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_is_slo_iv_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_arr_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cmpl_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_immed_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pl_reg_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_load_port_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_load_port_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_via_port_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_via_port_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lc_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lc_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lc_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bl_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bl_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bl_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_case_mrk1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_case_mrk2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_case_mrk3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_case_mrk4.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_case_mrk5.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_case_mrk6.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
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
	 * [FIX_D]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_upri_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sprt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [FIX_D]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [FIX_D]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [FIX_D]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_UpriSrch(MSBEP_IvReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_IvReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_IvReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_rev.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcpt_iv_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch_2.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBEP_IvReg p){

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBEP_IvReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBEP_IvReg p){
		p.Hdr_iv_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_rcpt_iv_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sls_basis_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_is_slo_iv_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_num_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cmpl_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_arr_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cmpl_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_ship_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_immed_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pl_skip_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pl_reg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_old_iv_ship_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_sundry_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_via_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tdlv_sundry_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_tdlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sls_cststk_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sls_cmpl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trnspt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_vssl_flght.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_load_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_load_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_etd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dschrg_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_eta_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_via_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_via_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_via_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_trd_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ptax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_trd_cur_amt_inc_tax_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_basis_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lc_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lc_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lc_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bl_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bl_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_iv_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_case_mrk1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_case_mrk2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_case_mrk3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_case_mrk4.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_case_mrk5.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_case_mrk6.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pre_rcpt_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_ddlv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ar_dpt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_lnk_ar_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_iv_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
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
	 * [REF]ステータスの[Ttl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ttl(MSBEP_IvReg p){
		p.Ttl_ttl_iv_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Ttl_ttl_ncv_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Ttl_ttl_base_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Ttl_ttl_freight_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Ttl_ttl_insurance_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Ttl_ttl_other_amt.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBEP_IvReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBEP_IvReg p){
		p.columnDtl_iv_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bndl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_exim_xpns_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cntry_org_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_upri_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_max_base_unit_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_max_trd_unit_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_schd_trd_cur_dscnt_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_schd_base_unit_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_iv_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_iv_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_multi_ship_fr_lg_grp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_sls_dpt_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_rqst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xfr_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_act_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_slip_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_alloc_sts_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_uplnd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_cd1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_cd2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_cd3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dlv_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pr_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_manual_add_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_existed_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_act_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_index.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[MapDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_MapDtl(MSBEP_IvReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_IvReg p){
		p.Btn_open_MSBEP1740.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_MSBEP1750.putMode(p, REF, MCMode.ENABLE);
		p.Btn_sprt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_move_top.putMode(p, REF, MCMode.DISABLE);
		p.Btn_move_up.putMode(p, REF, MCMode.DISABLE);
		p.Btn_move_down.putMode(p, REF, MCMode.DISABLE);
		p.Btn_move_bottom.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_IvReg p){

	}

	/**
	 * [REF]ステータスの[ShipInstMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_ShipInstMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [REF]ステータスの[ShipActMapDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_ShipActMapDtl(MSBEP_IvReg p){

	}

	/**
	 * [REF]ステータスの[UpriSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF_UpriSrch(MSBEP_IvReg p){

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
		MSBEP_IvReg_MC.setTableConfigDtl((MSBEP_IvReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_IvReg p) {
		p.columnDtl_iv_mng_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.iv_mng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_mng_no);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_cd_META);
		p.columnDtl_trd_cd.addLinkBeans(p.columnDtl_trd_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_bndl_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.bndl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bndl_flg);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_exim_xpns_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_trd_unit_cd, p.columnDtl_sls_upri_cng_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_exim_xpns_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_trd_unit_cd, p.columnDtl_sls_upri_cng_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_exim_xpns_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_trd_unit_cd, p.columnDtl_sls_upri_cng_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_exim_xpns_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_asset_mng_typ_nm, p.columnDtl_trd_unit_cd, p.columnDtl_sls_upri_cng_flg);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.cst_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_exim_xpns_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.exim_xpns_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_exim_xpns_typ);
		p.columnDtl_cntry_org_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.cntry_org_cd_META);
		p.columnDtl_cntry_org_cd.addLinkBeans(p.columnDtl_cntry_org_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_org_cd);
		p.columnDtl_cntry_org_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.cntry_org_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_org_nm);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_conv_qty,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_upri_qty.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.upri_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upri_qty);
		p.columnDtl_max_base_unit_qty.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.max_base_unit_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_max_base_unit_qty);
		p.columnDtl_max_trd_unit_qty.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.max_trd_unit_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_max_trd_unit_qty);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.gd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.DtlTable.addTable(p.Dtl_trd_cur_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_rate, p.columnDtl_tax_typ, p.columnDtl_inc_tax_flg);
		p.Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setLinkBeans(p.columnDtl_dscnt_rsn_nm);
		p.DtlTable.addTable(p.Dtl_old_trd_cur_upri_p_PPanel.UpriTable);
		p.columnDtl_schd_trd_cur_dscnt_amt.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.schd_trd_cur_dscnt_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_trd_cur_dscnt_amt);
		p.columnDtl_schd_base_unit_qty.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.schd_base_unit_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_base_unit_qty);
		p.DtlTable.addTable(p.Dtl_iv_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_iv_amt_p_PPanel.AmtTable);
		p.columnDtl_cst_po_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.cst_po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_no);
		p.columnDtl_cst_po_d_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.cst_po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_d_no);
		p.DtlTable.addTable(p.Dtl_sno_wrk_p_PPanel.SnoWrkNoTable);
		p.columnDtl_multi_ship_fr_lg_grp_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.multi_ship_fr_lg_grp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_multi_ship_fr_lg_grp_flg);
		p.columnDtl_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_fr_lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_fr_lg_grp_cd);
		p.columnDtl_ship_fr_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_fr_lg_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_fr_lg_grp_nm);
		p.columnDtl_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.rsn_cd_META);
		p.columnDtl_rsn_cd.addLinkBeans(p.columnDtl_rsn_nm,p.columnDtl_sls_acxfr_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_cd);
		p.columnDtl_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_nm);
		p.columnDtl_sls_acxfr_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.sls_acxfr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_acxfr_flg);
		p.columnDtl_bd_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.bd_dpt_cd_META);
		p.columnDtl_bd_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_bd_dpt_cd.addLinkBeans(p.columnDtl_bd_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_cd);
		p.columnDtl_bd_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.bd_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_nm);
		p.DtlTable.addTable(p.Dtl_usr_dpt_p_PPanel.UsrDptTable);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl_sls_dpt_nm, p.columnDtl_sls_dpt_wg_cd);
		p.columnDtl_sls_dpt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.sls_dpt_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_dpt_wg_cd);
		p.columnDtl_ar_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ar_dpt_cd_META);
		p.columnDtl_ar_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_ar_dpt_cd.addLinkBeans(p.columnDtl_ar_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_cd);
		p.columnDtl_ar_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ar_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_nm);
		p.columnDtl_iv_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.iv_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_d_rmrks);
		p.columnDtl_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.intr_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_d_rmrks);
		p.columnDtl_dtl_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.dtl_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_sub_char1);
		p.columnDtl_dtl_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.dtl_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_sub_char2);
		p.columnDtl_dtl_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.dtl_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dtl_sub_char3);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_ship_rqst_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_rqst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_rqst_no);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.columnDtl_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.xfr_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_schd_no);
		p.columnDtl_ship_inst_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_no);
		p.columnDtl_ship_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_inst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_d_no);
		p.columnDtl_ship_act_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_no);
		p.columnDtl_ship_act_d_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_d_no);
		p.columnDtl_dlv_slip_d_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_d_no);
		p.columnDtl_ship_alloc_sts_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_alloc_sts_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_alloc_sts_no);
		p.columnDtl_uplnd_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.uplnd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_uplnd_flg);
		p.columnDtl_dest_cd1.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.dest_cd1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd1);
		p.columnDtl_dest_cd2.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.dest_cd2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd2);
		p.columnDtl_dest_cd3.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.dest_cd3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd3);
		p.columnDtl_sls_upri_cng_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.sls_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_cng_flg);
		p.columnDtl_purc_schd_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.purc_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_schd_no);
		p.columnDtl_purc_act_d_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.purc_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_d_no);
		p.DtlTable.addTable(p.Dtl_dlv_rqst_dt_p_PPanel.YmdHmTable);
		p.columnDtl_iv_d_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.iv_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_d_no);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_ptax_cur_amt.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ptax_cur_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_amt);
		p.columnDtl_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rate);
		p.columnDtl_wtax_amt.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.wtax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_amt);
		p.columnDtl_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_no);
		p.columnDtl_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.pr_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pr_sts_typ);
		p.columnDtl_manual_add_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.manual_add_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_manual_add_flg);
		p.columnDtl_existed_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.existed_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_existed_flg);
		p.columnDtl_purc_ddlv_flg.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.purc_ddlv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_flg);
		p.columnDtl_ship_pr_no.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_pr_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_pr_no);
		p.columnDtl_ship_inst_typ.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_inst_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_typ);
		p.columnDtl_ship_inst_qty.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_inst_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_qty);
		p.columnDtl_ship_act_qty.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_act_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_qty);
		p.columnDtl_ship_pr_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.ship_pr_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_pr_upd_cntr);
		p.columnDtl_index.setMeta(mcframe.clientMSBE.MSBEP1730.DtlR.index_META);
		p.DtlTable.addColumnConfig(p.columnDtl_index);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_srch_tgt_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_srch_tgt_typ_nm.getListConfig().setPutter(getCnd_srch_tgt_typ_nm_ListPutter());
		Hdr_trnspt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trnspt_cd.getListConfig().setPutter(getHdr_trnspt_cd_ListPutter());
		Hdr_load_port_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_load_port_cd.getListConfig().setPutter(getHdr_load_port_cd_ListPutter());
		Hdr_dschrg_port_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_dschrg_port_cd.getListConfig().setPutter(getHdr_dschrg_port_cd_ListPutter());
		Hdr_via_port_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_via_port_cd.getListConfig().setPutter(getHdr_via_port_cd_ListPutter());
		Hdr_tterm_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd1.getListConfig().setPutter(getHdr_tterm_cd1_ListPutter());
		Hdr_tterm_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd2.getListConfig().setPutter(getHdr_tterm_cd2_ListPutter());
		Hdr_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cur_cd.getListConfig().setPutter(getHdr_trd_cur_cd_ListPutter());
		Hdr_tterm_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_tterm_cd3.getListConfig().setPutter(getHdr_tterm_cd3_ListPutter());
		columnDtl_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_cd.getListConfig().setPutter(getDtl_trd_cd_ListPutter());
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
		Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter());
		columnDtl_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rsn_cd.getListConfig().setPutter(getDtl_rsn_cd_ListPutter());
		columnDtl_bd_dpt_cd.getListConfig().setPutter(getDtl_bd_dpt_cd_ListPutter());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnDtl_ar_dpt_cd.getListConfig().setPutter(getDtl_ar_dpt_cd_ListPutter());
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
	 * この画面を[UPD1]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD1Status() {
		status = UPD1;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD2]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD2Status() {
		status = UPD2;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD3]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD3Status() {
		status = UPD3;
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (UPD1.equals(status)) {
			setUPD1Status();
		}
		else if (UPD2.equals(status)) {
			setUPD2Status();
		}
		else if (UPD3.equals(status)) {
			setUPD3Status();
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
		lp.setListLogicId("MS.MSUAP0010.StkSrchTgtTyp");
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
	 * [Hdr_load_port_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_load_port_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.EximPort");
		return lp;
	}
	 
	/**
	 * [Hdr_dschrg_port_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dschrg_port_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.EximPort");
		return lp;
	}
	 
	/**
	 * [Hdr_via_port_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_via_port_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.EximPort");
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
	 * [Hdr_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
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
	 * [Dtl_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
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
	 * [Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}

	/**
	 * [Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsDscntBizRsn");
		return lp;
	}

	/**
	 * [Dtl_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_srch_tgt_typ_nm) return getCnd_srch_tgt_typ_nm(row, info);
		if(combo == Hdr_trnspt_cd) return getHdr_trnspt_cd(row, info);
		if(combo == Hdr_load_port_cd) return getHdr_load_port_cd(row, info);
		if(combo == Hdr_dschrg_port_cd) return getHdr_dschrg_port_cd(row, info);
		if(combo == Hdr_via_port_cd) return getHdr_via_port_cd(row, info);
		if(combo == Hdr_tterm_cd1) return getHdr_tterm_cd1(row, info);
		if(combo == Hdr_tterm_cd2) return getHdr_tterm_cd2(row, info);
		if(combo == Hdr_trd_cur_cd) return getHdr_trd_cur_cd(row, info);
		if(combo == Hdr_tterm_cd3) return getHdr_tterm_cd3(row, info);
		if(combo == columnDtl_trd_cd) return getDtl_trd_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_cntry_org_cd) return getDtl_cntry_org_cd(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == Dtl_trd_cur_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd) return getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(row, info);
		if(combo == columnDtl_rsn_cd) return getDtl_rsn_cd(row, info);
		if(combo == columnDtl_bd_dpt_cd) return getDtl_bd_dpt_cd(row, info);
		if(combo == Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_ar_dpt_cd) return getDtl_ar_dpt_cd(row, info);
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
		else if (ap == Cnd_srch_2) doCnd_srch_2(info);
		else if (ap == Btn_open_MSBEP1740) doBtn_open_MSBEP1740(info);
		else if (ap == Btn_open_MSBEP1750) doBtn_open_MSBEP1750(info);
		else if (ap == Btn_sprt) doBtn_sprt(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_move_top) doBtn_move_top(info);
		else if (ap == Btn_move_up) doBtn_move_up(info);
		else if (ap == Btn_move_down) doBtn_move_down(info);
		else if (ap == Btn_move_bottom) doBtn_move_bottom(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_2(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1740]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1740(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1750]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1750(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[move_top]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_move_top(MCEventInfo info);

	/**
	 * [Btn]パネルの[move_up]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_move_up(MCEventInfo info);

	/**
	 * [Btn]パネルの[move_down]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_move_down(MCEventInfo info);

	/**
	 * [Btn]パネルの[move_bottom]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_move_bottom(MCEventInfo info);

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
		if (vc == Cnd_srch_tgt_rev) return doCnd_srch_tgt_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Cnd_rcpt_iv_mng_no) return doCnd_rcpt_iv_mng_no_VC(info);
		if (vc == Hdr_iv_mng_no) return doHdr_iv_mng_no_VC(info);
		if (vc == Hdr_rcpt_iv_mng_no) return doHdr_rcpt_iv_mng_no_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_sls_basis_typ) return doHdr_sls_basis_typ_VC(info);
		if (vc == Hdr_prov_basis_typ) return doHdr_prov_basis_typ_VC(info);
		if (vc == Hdr_iv_no) return doHdr_iv_no_VC(info);
		if (vc == Hdr_is_slo_iv_no) return doHdr_is_slo_iv_no_VC(info);
		if (vc == Hdr_num_flg) return doHdr_num_flg_VC(info);
		if (vc == Hdr_iv_rev) return doHdr_iv_rev_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_iv_dt) return doHdr_iv_dt_VC(info);
		if (vc == Hdr_iv_src_typ) return doHdr_iv_src_typ_VC(info);
		if (vc == Hdr_iv_src_typ_nm) return doHdr_iv_src_typ_nm_VC(info);
		if (vc == Hdr_rcpt_iv_no) return doHdr_rcpt_iv_no_VC(info);
		if (vc == Hdr_cmpl_schd_dt) return doHdr_cmpl_schd_dt_VC(info);
		if (vc == Hdr_arr_schd_dt) return doHdr_arr_schd_dt_VC(info);
		if (vc == Hdr_sls_schd_dt) return doHdr_sls_schd_dt_VC(info);
		if (vc == Hdr_cmpl_dt) return doHdr_cmpl_dt_VC(info);
		if (vc == Hdr_ac_dt) return doHdr_ac_dt_VC(info);
		if (vc == Hdr_iv_ship_flg) return doHdr_iv_ship_flg_VC(info);
		if (vc == Hdr_iv_immed_prnt_flg) return doHdr_iv_immed_prnt_flg_VC(info);
		if (vc == Hdr_iv_prnt_flg) return doHdr_iv_prnt_flg_VC(info);
		if (vc == Hdr_pl_skip_flg) return doHdr_pl_skip_flg_VC(info);
		if (vc == Hdr_pl_reg_flg) return doHdr_pl_reg_flg_VC(info);
		if (vc == Hdr_non_cmpl_flg) return doHdr_non_cmpl_flg_VC(info);
		if (vc == Hdr_cmpl_flg) return doHdr_cmpl_flg_VC(info);
		if (vc == Hdr_old_iv_ship_flg) return doHdr_old_iv_ship_flg_VC(info);
		if (vc == Hdr_dlv_id_typ) return doHdr_dlv_id_typ_VC(info);
		if (vc == Hdr_dlv_id_typ_nm) return doHdr_dlv_id_typ_nm_VC(info);
		if (vc == Hdr_dlv_id_cd) return doHdr_dlv_id_cd_VC(info);
		if (vc == Hdr_dlv_id_nm) return doHdr_dlv_id_nm_VC(info);
		if (vc == Hdr_dlv_sundry_flg) return doHdr_dlv_sundry_flg_VC(info);
		if (vc == Hdr_ship_rqst_id_typ) return doHdr_ship_rqst_id_typ_VC(info);
		if (vc == Hdr_ship_rqst_id_typ_nm) return doHdr_ship_rqst_id_typ_nm_VC(info);
		if (vc == Hdr_ship_rqst_id_cd) return doHdr_ship_rqst_id_cd_VC(info);
		if (vc == Hdr_ship_rqst_id_nm) return doHdr_ship_rqst_id_nm_VC(info);
		if (vc == Hdr_sls_upri_cng_flg) return doHdr_sls_upri_cng_flg_VC(info);
		if (vc == Hdr_via_dlv_typ) return doHdr_via_dlv_typ_VC(info);
		if (vc == Hdr_via_dlv_typ_nm) return doHdr_via_dlv_typ_nm_VC(info);
		if (vc == Hdr_tdlv_cd) return doHdr_tdlv_cd_VC(info);
		if (vc == Hdr_tdlv_nm) return doHdr_tdlv_nm_VC(info);
		if (vc == Hdr_tdlv_sundry_flg) return doHdr_tdlv_sundry_flg_VC(info);
		if (vc == Hdr_sls_cststk_flg) return doHdr_sls_cststk_flg_VC(info);
		if (vc == Hdr_sls_cmpl_flg) return doHdr_sls_cmpl_flg_VC(info);
		if (vc == Hdr_trnspt_cd) return doHdr_trnspt_cd_VC(info);
		if (vc == Hdr_trnspt_nm) return doHdr_trnspt_nm_VC(info);
		if (vc == Hdr_vssl_flght) return doHdr_vssl_flght_VC(info);
		if (vc == Hdr_load_port_cd) return doHdr_load_port_cd_VC(info);
		if (vc == Hdr_load_port_nm) return doHdr_load_port_nm_VC(info);
		if (vc == Hdr_etd_dt) return doHdr_etd_dt_VC(info);
		if (vc == Hdr_dschrg_port_cd) return doHdr_dschrg_port_cd_VC(info);
		if (vc == Hdr_dschrg_port_nm) return doHdr_dschrg_port_nm_VC(info);
		if (vc == Hdr_eta_dt) return doHdr_eta_dt_VC(info);
		if (vc == Hdr_via_port_cd) return doHdr_via_port_cd_VC(info);
		if (vc == Hdr_via_port_nm) return doHdr_via_port_nm_VC(info);
		if (vc == Hdr_via_schd_dt) return doHdr_via_schd_dt_VC(info);
		if (vc == Hdr_tterm_cd1) return doHdr_tterm_cd1_VC(info);
		if (vc == Hdr_tterm_nm1) return doHdr_tterm_nm1_VC(info);
		if (vc == Hdr_tterm_rmrks1) return doHdr_tterm_rmrks1_VC(info);
		if (vc == Hdr_tterm_cd2) return doHdr_tterm_cd2_VC(info);
		if (vc == Hdr_tterm_nm2) return doHdr_tterm_nm2_VC(info);
		if (vc == Hdr_tterm_rmrks2) return doHdr_tterm_rmrks2_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_trd_cur_upri_dec_place) return doHdr_trd_cur_upri_dec_place_VC(info);
		if (vc == Hdr_trd_cur_amt_dec_place) return doHdr_trd_cur_amt_dec_place_VC(info);
		if (vc == Hdr_trd_amt_rnd_typ) return doHdr_trd_amt_rnd_typ_VC(info);
		if (vc == Hdr_trd_tax_rnd_typ) return doHdr_trd_tax_rnd_typ_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_xrate_cd) return doHdr_xrate_cd_VC(info);
		if (vc == Hdr_xrate_inpt_flg) return doHdr_xrate_inpt_flg_VC(info);
		if (vc == Hdr_ptax_cur_cd) return doHdr_ptax_cur_cd_VC(info);
		if (vc == Hdr_ptax_cur_nm) return doHdr_ptax_cur_nm_VC(info);
		if (vc == Hdr_ptax_cur_amt_dec_place) return doHdr_ptax_cur_amt_dec_place_VC(info);
		if (vc == Hdr_ptax_xrate_inpt_flg) return doHdr_ptax_xrate_inpt_flg_VC(info);
		if (vc == Hdr_tterm_cd3) return doHdr_tterm_cd3_VC(info);
		if (vc == Hdr_tterm_nm3) return doHdr_tterm_nm3_VC(info);
		if (vc == Hdr_tterm_rmrks3) return doHdr_tterm_rmrks3_VC(info);
		if (vc == Hdr_bill_basis_dt) return doHdr_bill_basis_dt_VC(info);
		if (vc == Hdr_rcv_schd_dt) return doHdr_rcv_schd_dt_VC(info);
		if (vc == Hdr_lc_no) return doHdr_lc_no_VC(info);
		if (vc == Hdr_lc_dt) return doHdr_lc_dt_VC(info);
		if (vc == Hdr_lc_rmrks) return doHdr_lc_rmrks_VC(info);
		if (vc == Hdr_bl_no) return doHdr_bl_no_VC(info);
		if (vc == Hdr_bl_dt) return doHdr_bl_dt_VC(info);
		if (vc == Hdr_bl_rmrks) return doHdr_bl_rmrks_VC(info);
		if (vc == Hdr_ship_fr_lg_grp_cd) return doHdr_ship_fr_lg_grp_cd_VC(info);
		if (vc == Hdr_iv_rmrks) return doHdr_iv_rmrks_VC(info);
		if (vc == Hdr_case_mrk1) return doHdr_case_mrk1_VC(info);
		if (vc == Hdr_case_mrk2) return doHdr_case_mrk2_VC(info);
		if (vc == Hdr_case_mrk3) return doHdr_case_mrk3_VC(info);
		if (vc == Hdr_case_mrk4) return doHdr_case_mrk4_VC(info);
		if (vc == Hdr_case_mrk5) return doHdr_case_mrk5_VC(info);
		if (vc == Hdr_case_mrk6) return doHdr_case_mrk6_VC(info);
		if (vc == Hdr_pre_rcpt_iv_flg) return doHdr_pre_rcpt_iv_flg_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_bill_cl_typ) return doHdr_bill_cl_typ_VC(info);
		if (vc == Hdr_purc_ddlv_flg) return doHdr_purc_ddlv_flg_VC(info);
		if (vc == Hdr_ar_dpt_typ) return doHdr_ar_dpt_typ_VC(info);
		if (vc == Hdr_lnk_ar_dpt_cd) return doHdr_lnk_ar_dpt_cd_VC(info);
		if (vc == Hdr_prnt_lcl_cd) return doHdr_prnt_lcl_cd_VC(info);
		if (vc == Hdr_iv_upd_cntr) return doHdr_iv_upd_cntr_VC(info);
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
		if (vc == Ttl_ttl_iv_amt) return doTtl_ttl_iv_amt_VC(info);
		if (vc == Ttl_ttl_ncv_amt) return doTtl_ttl_ncv_amt_VC(info);
		if (vc == Ttl_ttl_base_amt) return doTtl_ttl_base_amt_VC(info);
		if (vc == Ttl_ttl_freight_amt) return doTtl_ttl_freight_amt_VC(info);
		if (vc == Ttl_ttl_insurance_amt) return doTtl_ttl_insurance_amt_VC(info);
		if (vc == Ttl_ttl_other_amt) return doTtl_ttl_other_amt_VC(info);
		if (vc == columnDtl_iv_mng_no) return doDtl_iv_mng_no_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_bndl_flg) return doDtl_bndl_flg_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_exim_xpns_typ) return doDtl_exim_xpns_typ_VC(info);
		if (vc == columnDtl_cntry_org_cd) return doDtl_cntry_org_cd_VC(info);
		if (vc == columnDtl_cntry_org_nm) return doDtl_cntry_org_nm_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_rnd_typ) return doDtl_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_upri_qty) return doDtl_upri_qty_VC(info);
		if (vc == columnDtl_max_base_unit_qty) return doDtl_max_base_unit_qty_VC(info);
		if (vc == columnDtl_max_trd_unit_qty) return doDtl_max_trd_unit_qty_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_schd_trd_cur_dscnt_amt) return doDtl_schd_trd_cur_dscnt_amt_VC(info);
		if (vc == columnDtl_schd_base_unit_qty) return doDtl_schd_base_unit_qty_VC(info);
		if (vc == columnDtl_cst_po_no) return doDtl_cst_po_no_VC(info);
		if (vc == columnDtl_cst_po_d_no) return doDtl_cst_po_d_no_VC(info);
		if (vc == columnDtl_multi_ship_fr_lg_grp_flg) return doDtl_multi_ship_fr_lg_grp_flg_VC(info);
		if (vc == columnDtl_ship_fr_lg_grp_cd) return doDtl_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnDtl_ship_fr_lg_grp_nm) return doDtl_ship_fr_lg_grp_nm_VC(info);
		if (vc == columnDtl_rsn_cd) return doDtl_rsn_cd_VC(info);
		if (vc == columnDtl_rsn_nm) return doDtl_rsn_nm_VC(info);
		if (vc == columnDtl_sls_acxfr_flg) return doDtl_sls_acxfr_flg_VC(info);
		if (vc == columnDtl_bd_dpt_cd) return doDtl_bd_dpt_cd_VC(info);
		if (vc == columnDtl_bd_dpt_nm) return doDtl_bd_dpt_nm_VC(info);
		if (vc == columnDtl_sls_dpt_wg_cd) return doDtl_sls_dpt_wg_cd_VC(info);
		if (vc == columnDtl_ar_dpt_cd) return doDtl_ar_dpt_cd_VC(info);
		if (vc == columnDtl_ar_dpt_nm) return doDtl_ar_dpt_nm_VC(info);
		if (vc == columnDtl_iv_d_rmrks) return doDtl_iv_d_rmrks_VC(info);
		if (vc == columnDtl_trd_rmrks) return doDtl_trd_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_intr_d_rmrks) return doDtl_intr_d_rmrks_VC(info);
		if (vc == columnDtl_dtl_sub_char1) return doDtl_dtl_sub_char1_VC(info);
		if (vc == columnDtl_dtl_sub_char2) return doDtl_dtl_sub_char2_VC(info);
		if (vc == columnDtl_dtl_sub_char3) return doDtl_dtl_sub_char3_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_ship_rqst_no) return doDtl_ship_rqst_no_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_xfr_schd_no) return doDtl_xfr_schd_no_VC(info);
		if (vc == columnDtl_ship_inst_no) return doDtl_ship_inst_no_VC(info);
		if (vc == columnDtl_ship_inst_d_no) return doDtl_ship_inst_d_no_VC(info);
		if (vc == columnDtl_ship_act_no) return doDtl_ship_act_no_VC(info);
		if (vc == columnDtl_ship_act_d_no) return doDtl_ship_act_d_no_VC(info);
		if (vc == columnDtl_dlv_slip_d_no) return doDtl_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_ship_alloc_sts_no) return doDtl_ship_alloc_sts_no_VC(info);
		if (vc == columnDtl_uplnd_flg) return doDtl_uplnd_flg_VC(info);
		if (vc == columnDtl_dest_cd1) return doDtl_dest_cd1_VC(info);
		if (vc == columnDtl_dest_cd2) return doDtl_dest_cd2_VC(info);
		if (vc == columnDtl_dest_cd3) return doDtl_dest_cd3_VC(info);
		if (vc == columnDtl_sls_upri_cng_flg) return doDtl_sls_upri_cng_flg_VC(info);
		if (vc == columnDtl_purc_schd_no) return doDtl_purc_schd_no_VC(info);
		if (vc == columnDtl_purc_act_d_no) return doDtl_purc_act_d_no_VC(info);
		if (vc == columnDtl_iv_d_no) return doDtl_iv_d_no_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_ptax_cur_amt) return doDtl_ptax_cur_amt_VC(info);
		if (vc == columnDtl_wtax_rate) return doDtl_wtax_rate_VC(info);
		if (vc == columnDtl_wtax_amt) return doDtl_wtax_amt_VC(info);
		if (vc == columnDtl_ship_schd_no) return doDtl_ship_schd_no_VC(info);
		if (vc == columnDtl_pr_sts_typ) return doDtl_pr_sts_typ_VC(info);
		if (vc == columnDtl_manual_add_flg) return doDtl_manual_add_flg_VC(info);
		if (vc == columnDtl_existed_flg) return doDtl_existed_flg_VC(info);
		if (vc == columnDtl_purc_ddlv_flg) return doDtl_purc_ddlv_flg_VC(info);
		if (vc == columnDtl_ship_pr_no) return doDtl_ship_pr_no_VC(info);
		if (vc == columnDtl_ship_inst_typ) return doDtl_ship_inst_typ_VC(info);
		if (vc == columnDtl_ship_inst_qty) return doDtl_ship_inst_qty_VC(info);
		if (vc == columnDtl_ship_act_qty) return doDtl_ship_act_qty_VC(info);
		if (vc == columnDtl_ship_pr_upd_cntr) return doDtl_ship_pr_upd_cntr_VC(info);
		if (vc == columnDtl_index) return doDtl_index_VC(info);
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
	 * [Cnd]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcpt_iv_mng_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[sls_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prov_basis_typ_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[is_slo_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_is_slo_iv_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[iv_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_rev_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[iv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_src_typ_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[cmpl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cmpl_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[arr_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_arr_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cmpl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cmpl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_immed_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_immed_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pl_skip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pl_skip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pl_reg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pl_reg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[non_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_non_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[old_iv_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_old_iv_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_rqst_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_rqst_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_rqst_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_via_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_via_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tdlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tdlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tdlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tdlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_cststk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_cststk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_cmpl_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[vssl_flght]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_vssl_flght_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[load_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_load_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[load_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_load_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[etd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_etd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dschrg_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dschrg_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dschrg_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dschrg_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[eta_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_eta_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[via_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_via_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[via_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_via_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[via_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_via_schd_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_upri_dec_place_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_tax_rnd_typ_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xrate_cd_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ptax_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_basis_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[lc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lc_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lc_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lc_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lc_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[case_mrk1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_case_mrk1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[case_mrk2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_case_mrk2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[case_mrk3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_case_mrk3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[case_mrk4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_case_mrk4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[case_mrk5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_case_mrk5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[case_mrk6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_case_mrk6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pre_rcpt_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pre_rcpt_iv_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_cl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_ddlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_ddlv_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[lnk_ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lnk_ar_dpt_cd_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[iv_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_upd_cntr_VC(MCEventInfo info){
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
	 * [Ttl]パネルの[ttl_iv_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTtl_ttl_iv_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ttl]パネルの[ttl_ncv_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTtl_ttl_ncv_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ttl]パネルの[ttl_base_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTtl_ttl_base_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ttl]パネルの[ttl_freight_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTtl_ttl_freight_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ttl]パネルの[ttl_insurance_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTtl_ttl_insurance_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Ttl]パネルの[ttl_other_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTtl_ttl_other_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_mng_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bndl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bndl_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[exim_xpns_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_exim_xpns_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dscnt_itm_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upri_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[max_base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_max_base_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[max_trd_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_max_trd_unit_qty_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[schd_trd_cur_dscnt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_trd_cur_dscnt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_base_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[multi_ship_fr_lg_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_multi_ship_fr_lg_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dtl_sub_char3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_rqst_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_alloc_sts_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_alloc_sts_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[uplnd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_uplnd_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd2_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_cng_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ptax_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_amt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pr_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[manual_add_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_manual_add_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[existed_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_existed_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_inst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_pr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[index]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_index_VC(MCEventInfo info){
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
		else if (nc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NC(info);
		else if (nc == Hdr_iv_mng_no) doHdr_iv_mng_no_NC(info);
		else if (nc == Hdr_rcpt_iv_mng_no) doHdr_rcpt_iv_mng_no_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_sls_basis_typ) doHdr_sls_basis_typ_NC(info);
		else if (nc == Hdr_prov_basis_typ) doHdr_prov_basis_typ_NC(info);
		else if (nc == Hdr_iv_no) doHdr_iv_no_NC(info);
		else if (nc == Hdr_is_slo_iv_no) doHdr_is_slo_iv_no_NC(info);
		else if (nc == Hdr_num_flg) doHdr_num_flg_NC(info);
		else if (nc == Hdr_iv_rev) doHdr_iv_rev_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_iv_dt) doHdr_iv_dt_NC(info);
		else if (nc == Hdr_iv_src_typ) doHdr_iv_src_typ_NC(info);
		else if (nc == Hdr_iv_src_typ_nm) doHdr_iv_src_typ_nm_NC(info);
		else if (nc == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NC(info);
		else if (nc == Hdr_cmpl_schd_dt) doHdr_cmpl_schd_dt_NC(info);
		else if (nc == Hdr_arr_schd_dt) doHdr_arr_schd_dt_NC(info);
		else if (nc == Hdr_sls_schd_dt) doHdr_sls_schd_dt_NC(info);
		else if (nc == Hdr_cmpl_dt) doHdr_cmpl_dt_NC(info);
		else if (nc == Hdr_ac_dt) doHdr_ac_dt_NC(info);
		else if (nc == Hdr_iv_ship_flg) doHdr_iv_ship_flg_NC(info);
		else if (nc == Hdr_iv_immed_prnt_flg) doHdr_iv_immed_prnt_flg_NC(info);
		else if (nc == Hdr_iv_prnt_flg) doHdr_iv_prnt_flg_NC(info);
		else if (nc == Hdr_pl_skip_flg) doHdr_pl_skip_flg_NC(info);
		else if (nc == Hdr_pl_reg_flg) doHdr_pl_reg_flg_NC(info);
		else if (nc == Hdr_non_cmpl_flg) doHdr_non_cmpl_flg_NC(info);
		else if (nc == Hdr_cmpl_flg) doHdr_cmpl_flg_NC(info);
		else if (nc == Hdr_old_iv_ship_flg) doHdr_old_iv_ship_flg_NC(info);
		else if (nc == Hdr_dlv_id_typ) doHdr_dlv_id_typ_NC(info);
		else if (nc == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_NC(info);
		else if (nc == Hdr_dlv_id_cd) doHdr_dlv_id_cd_NC(info);
		else if (nc == Hdr_dlv_id_nm) doHdr_dlv_id_nm_NC(info);
		else if (nc == Hdr_dlv_sundry_flg) doHdr_dlv_sundry_flg_NC(info);
		else if (nc == Hdr_ship_rqst_id_typ) doHdr_ship_rqst_id_typ_NC(info);
		else if (nc == Hdr_ship_rqst_id_typ_nm) doHdr_ship_rqst_id_typ_nm_NC(info);
		else if (nc == Hdr_ship_rqst_id_cd) doHdr_ship_rqst_id_cd_NC(info);
		else if (nc == Hdr_ship_rqst_id_nm) doHdr_ship_rqst_id_nm_NC(info);
		else if (nc == Hdr_sls_upri_cng_flg) doHdr_sls_upri_cng_flg_NC(info);
		else if (nc == Hdr_via_dlv_typ) doHdr_via_dlv_typ_NC(info);
		else if (nc == Hdr_via_dlv_typ_nm) doHdr_via_dlv_typ_nm_NC(info);
		else if (nc == Hdr_tdlv_cd) doHdr_tdlv_cd_NC(info);
		else if (nc == Hdr_tdlv_nm) doHdr_tdlv_nm_NC(info);
		else if (nc == Hdr_tdlv_sundry_flg) doHdr_tdlv_sundry_flg_NC(info);
		else if (nc == Hdr_sls_cststk_flg) doHdr_sls_cststk_flg_NC(info);
		else if (nc == Hdr_sls_cmpl_flg) doHdr_sls_cmpl_flg_NC(info);
		else if (nc == Hdr_trnspt_cd) doHdr_trnspt_cd_NC(info);
		else if (nc == Hdr_trnspt_nm) doHdr_trnspt_nm_NC(info);
		else if (nc == Hdr_vssl_flght) doHdr_vssl_flght_NC(info);
		else if (nc == Hdr_load_port_cd) doHdr_load_port_cd_NC(info);
		else if (nc == Hdr_load_port_nm) doHdr_load_port_nm_NC(info);
		else if (nc == Hdr_etd_dt) doHdr_etd_dt_NC(info);
		else if (nc == Hdr_dschrg_port_cd) doHdr_dschrg_port_cd_NC(info);
		else if (nc == Hdr_dschrg_port_nm) doHdr_dschrg_port_nm_NC(info);
		else if (nc == Hdr_eta_dt) doHdr_eta_dt_NC(info);
		else if (nc == Hdr_via_port_cd) doHdr_via_port_cd_NC(info);
		else if (nc == Hdr_via_port_nm) doHdr_via_port_nm_NC(info);
		else if (nc == Hdr_via_schd_dt) doHdr_via_schd_dt_NC(info);
		else if (nc == Hdr_tterm_cd1) doHdr_tterm_cd1_NC(info);
		else if (nc == Hdr_tterm_nm1) doHdr_tterm_nm1_NC(info);
		else if (nc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NC(info);
		else if (nc == Hdr_tterm_cd2) doHdr_tterm_cd2_NC(info);
		else if (nc == Hdr_tterm_nm2) doHdr_tterm_nm2_NC(info);
		else if (nc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NC(info);
		else if (nc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_trd_amt_rnd_typ) doHdr_trd_amt_rnd_typ_NC(info);
		else if (nc == Hdr_trd_tax_rnd_typ) doHdr_trd_tax_rnd_typ_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_xrate_cd) doHdr_xrate_cd_NC(info);
		else if (nc == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NC(info);
		else if (nc == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NC(info);
		else if (nc == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NC(info);
		else if (nc == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NC(info);
		else if (nc == Hdr_ptax_xrate_inpt_flg) doHdr_ptax_xrate_inpt_flg_NC(info);
		else if (nc == Hdr_tterm_cd3) doHdr_tterm_cd3_NC(info);
		else if (nc == Hdr_tterm_nm3) doHdr_tterm_nm3_NC(info);
		else if (nc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NC(info);
		else if (nc == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NC(info);
		else if (nc == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_NC(info);
		else if (nc == Hdr_lc_no) doHdr_lc_no_NC(info);
		else if (nc == Hdr_lc_dt) doHdr_lc_dt_NC(info);
		else if (nc == Hdr_lc_rmrks) doHdr_lc_rmrks_NC(info);
		else if (nc == Hdr_bl_no) doHdr_bl_no_NC(info);
		else if (nc == Hdr_bl_dt) doHdr_bl_dt_NC(info);
		else if (nc == Hdr_bl_rmrks) doHdr_bl_rmrks_NC(info);
		else if (nc == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_NC(info);
		else if (nc == Hdr_iv_rmrks) doHdr_iv_rmrks_NC(info);
		else if (nc == Hdr_case_mrk1) doHdr_case_mrk1_NC(info);
		else if (nc == Hdr_case_mrk2) doHdr_case_mrk2_NC(info);
		else if (nc == Hdr_case_mrk3) doHdr_case_mrk3_NC(info);
		else if (nc == Hdr_case_mrk4) doHdr_case_mrk4_NC(info);
		else if (nc == Hdr_case_mrk5) doHdr_case_mrk5_NC(info);
		else if (nc == Hdr_case_mrk6) doHdr_case_mrk6_NC(info);
		else if (nc == Hdr_pre_rcpt_iv_flg) doHdr_pre_rcpt_iv_flg_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_bill_cl_typ) doHdr_bill_cl_typ_NC(info);
		else if (nc == Hdr_purc_ddlv_flg) doHdr_purc_ddlv_flg_NC(info);
		else if (nc == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_NC(info);
		else if (nc == Hdr_lnk_ar_dpt_cd) doHdr_lnk_ar_dpt_cd_NC(info);
		else if (nc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NC(info);
		else if (nc == Hdr_iv_upd_cntr) doHdr_iv_upd_cntr_NC(info);
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
		else if (nc == Ttl_ttl_iv_amt) doTtl_ttl_iv_amt_NC(info);
		else if (nc == Ttl_ttl_ncv_amt) doTtl_ttl_ncv_amt_NC(info);
		else if (nc == Ttl_ttl_base_amt) doTtl_ttl_base_amt_NC(info);
		else if (nc == Ttl_ttl_freight_amt) doTtl_ttl_freight_amt_NC(info);
		else if (nc == Ttl_ttl_insurance_amt) doTtl_ttl_insurance_amt_NC(info);
		else if (nc == Ttl_ttl_other_amt) doTtl_ttl_other_amt_NC(info);
		else if (nc == columnDtl_iv_mng_no) doDtl_iv_mng_no_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_bndl_flg) doDtl_bndl_flg_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_exim_xpns_typ) doDtl_exim_xpns_typ_NC(info);
		else if (nc == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NC(info);
		else if (nc == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_upri_qty) doDtl_upri_qty_NC(info);
		else if (nc == columnDtl_max_base_unit_qty) doDtl_max_base_unit_qty_NC(info);
		else if (nc == columnDtl_max_trd_unit_qty) doDtl_max_trd_unit_qty_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_schd_trd_cur_dscnt_amt) doDtl_schd_trd_cur_dscnt_amt_NC(info);
		else if (nc == columnDtl_schd_base_unit_qty) doDtl_schd_base_unit_qty_NC(info);
		else if (nc == columnDtl_cst_po_no) doDtl_cst_po_no_NC(info);
		else if (nc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NC(info);
		else if (nc == columnDtl_multi_ship_fr_lg_grp_flg) doDtl_multi_ship_fr_lg_grp_flg_NC(info);
		else if (nc == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnDtl_ship_fr_lg_grp_nm) doDtl_ship_fr_lg_grp_nm_NC(info);
		else if (nc == columnDtl_rsn_cd) doDtl_rsn_cd_NC(info);
		else if (nc == columnDtl_rsn_nm) doDtl_rsn_nm_NC(info);
		else if (nc == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NC(info);
		else if (nc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NC(info);
		else if (nc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NC(info);
		else if (nc == columnDtl_sls_dpt_wg_cd) doDtl_sls_dpt_wg_cd_NC(info);
		else if (nc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NC(info);
		else if (nc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NC(info);
		else if (nc == columnDtl_iv_d_rmrks) doDtl_iv_d_rmrks_NC(info);
		else if (nc == columnDtl_trd_rmrks) doDtl_trd_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NC(info);
		else if (nc == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_NC(info);
		else if (nc == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_NC(info);
		else if (nc == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_ship_rqst_no) doDtl_ship_rqst_no_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NC(info);
		else if (nc == columnDtl_ship_inst_no) doDtl_ship_inst_no_NC(info);
		else if (nc == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NC(info);
		else if (nc == columnDtl_ship_act_no) doDtl_ship_act_no_NC(info);
		else if (nc == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NC(info);
		else if (nc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NC(info);
		else if (nc == columnDtl_uplnd_flg) doDtl_uplnd_flg_NC(info);
		else if (nc == columnDtl_dest_cd1) doDtl_dest_cd1_NC(info);
		else if (nc == columnDtl_dest_cd2) doDtl_dest_cd2_NC(info);
		else if (nc == columnDtl_dest_cd3) doDtl_dest_cd3_NC(info);
		else if (nc == columnDtl_sls_upri_cng_flg) doDtl_sls_upri_cng_flg_NC(info);
		else if (nc == columnDtl_purc_schd_no) doDtl_purc_schd_no_NC(info);
		else if (nc == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NC(info);
		else if (nc == columnDtl_iv_d_no) doDtl_iv_d_no_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_ptax_cur_amt) doDtl_ptax_cur_amt_NC(info);
		else if (nc == columnDtl_wtax_rate) doDtl_wtax_rate_NC(info);
		else if (nc == columnDtl_wtax_amt) doDtl_wtax_amt_NC(info);
		else if (nc == columnDtl_ship_schd_no) doDtl_ship_schd_no_NC(info);
		else if (nc == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_NC(info);
		else if (nc == columnDtl_manual_add_flg) doDtl_manual_add_flg_NC(info);
		else if (nc == columnDtl_existed_flg) doDtl_existed_flg_NC(info);
		else if (nc == columnDtl_purc_ddlv_flg) doDtl_purc_ddlv_flg_NC(info);
		else if (nc == columnDtl_ship_pr_no) doDtl_ship_pr_no_NC(info);
		else if (nc == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NC(info);
		else if (nc == columnDtl_ship_inst_qty) doDtl_ship_inst_qty_NC(info);
		else if (nc == columnDtl_ship_act_qty) doDtl_ship_act_qty_NC(info);
		else if (nc == columnDtl_ship_pr_upd_cntr) doDtl_ship_pr_upd_cntr_NC(info);
		else if (nc == columnDtl_index) doDtl_index_NC(info);
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
	 * [Cnd]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[is_slo_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_is_slo_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[num_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_num_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_rev_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[iv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[arr_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_arr_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_immed_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_immed_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_skip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_skip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_reg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_reg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[non_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_non_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[old_iv_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_old_iv_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_cststk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_cststk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_cmpl_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[vssl_flght]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vssl_flght_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[load_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_load_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[load_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_load_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[etd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_etd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dschrg_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dschrg_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dschrg_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dschrg_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[eta_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_eta_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_schd_dt_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_tax_rnd_typ_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_xrate_inpt_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk4_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk5_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk6_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_rcpt_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_rcpt_iv_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_cl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ddlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ddlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lnk_ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lnk_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_upd_cntr_NC(MCEventInfo info){
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
	 * [Ttl]パネルの[ttl_iv_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_iv_amt_NC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_ncv_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_ncv_amt_NC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_base_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_base_amt_NC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_freight_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_freight_amt_NC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_insurance_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_insurance_amt_NC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_other_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_other_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_mng_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[bndl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bndl_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[exim_xpns_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_base_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_trd_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_trd_unit_qty_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[schd_trd_cur_dscnt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_cur_dscnt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_base_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[multi_ship_fr_lg_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_multi_ship_fr_lg_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[uplnd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_uplnd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[manual_add_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_manual_add_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[existed_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_existed_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[index]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_index_NC(MCEventInfo info){
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
		else if (ne == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NE(info);
		else if (ne == Hdr_iv_mng_no) doHdr_iv_mng_no_NE(info);
		else if (ne == Hdr_rcpt_iv_mng_no) doHdr_rcpt_iv_mng_no_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_sls_basis_typ) doHdr_sls_basis_typ_NE(info);
		else if (ne == Hdr_prov_basis_typ) doHdr_prov_basis_typ_NE(info);
		else if (ne == Hdr_iv_no) doHdr_iv_no_NE(info);
		else if (ne == Hdr_is_slo_iv_no) doHdr_is_slo_iv_no_NE(info);
		else if (ne == Hdr_num_flg) doHdr_num_flg_NE(info);
		else if (ne == Hdr_iv_rev) doHdr_iv_rev_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_iv_dt) doHdr_iv_dt_NE(info);
		else if (ne == Hdr_iv_src_typ) doHdr_iv_src_typ_NE(info);
		else if (ne == Hdr_iv_src_typ_nm) doHdr_iv_src_typ_nm_NE(info);
		else if (ne == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NE(info);
		else if (ne == Hdr_cmpl_schd_dt) doHdr_cmpl_schd_dt_NE(info);
		else if (ne == Hdr_arr_schd_dt) doHdr_arr_schd_dt_NE(info);
		else if (ne == Hdr_sls_schd_dt) doHdr_sls_schd_dt_NE(info);
		else if (ne == Hdr_cmpl_dt) doHdr_cmpl_dt_NE(info);
		else if (ne == Hdr_ac_dt) doHdr_ac_dt_NE(info);
		else if (ne == Hdr_iv_ship_flg) doHdr_iv_ship_flg_NE(info);
		else if (ne == Hdr_iv_immed_prnt_flg) doHdr_iv_immed_prnt_flg_NE(info);
		else if (ne == Hdr_iv_prnt_flg) doHdr_iv_prnt_flg_NE(info);
		else if (ne == Hdr_pl_skip_flg) doHdr_pl_skip_flg_NE(info);
		else if (ne == Hdr_pl_reg_flg) doHdr_pl_reg_flg_NE(info);
		else if (ne == Hdr_non_cmpl_flg) doHdr_non_cmpl_flg_NE(info);
		else if (ne == Hdr_cmpl_flg) doHdr_cmpl_flg_NE(info);
		else if (ne == Hdr_old_iv_ship_flg) doHdr_old_iv_ship_flg_NE(info);
		else if (ne == Hdr_dlv_id_typ) doHdr_dlv_id_typ_NE(info);
		else if (ne == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_NE(info);
		else if (ne == Hdr_dlv_id_cd) doHdr_dlv_id_cd_NE(info);
		else if (ne == Hdr_dlv_id_nm) doHdr_dlv_id_nm_NE(info);
		else if (ne == Hdr_dlv_sundry_flg) doHdr_dlv_sundry_flg_NE(info);
		else if (ne == Hdr_ship_rqst_id_typ) doHdr_ship_rqst_id_typ_NE(info);
		else if (ne == Hdr_ship_rqst_id_typ_nm) doHdr_ship_rqst_id_typ_nm_NE(info);
		else if (ne == Hdr_ship_rqst_id_cd) doHdr_ship_rqst_id_cd_NE(info);
		else if (ne == Hdr_ship_rqst_id_nm) doHdr_ship_rqst_id_nm_NE(info);
		else if (ne == Hdr_sls_upri_cng_flg) doHdr_sls_upri_cng_flg_NE(info);
		else if (ne == Hdr_via_dlv_typ) doHdr_via_dlv_typ_NE(info);
		else if (ne == Hdr_via_dlv_typ_nm) doHdr_via_dlv_typ_nm_NE(info);
		else if (ne == Hdr_tdlv_cd) doHdr_tdlv_cd_NE(info);
		else if (ne == Hdr_tdlv_nm) doHdr_tdlv_nm_NE(info);
		else if (ne == Hdr_tdlv_sundry_flg) doHdr_tdlv_sundry_flg_NE(info);
		else if (ne == Hdr_sls_cststk_flg) doHdr_sls_cststk_flg_NE(info);
		else if (ne == Hdr_sls_cmpl_flg) doHdr_sls_cmpl_flg_NE(info);
		else if (ne == Hdr_trnspt_cd) doHdr_trnspt_cd_NE(info);
		else if (ne == Hdr_trnspt_nm) doHdr_trnspt_nm_NE(info);
		else if (ne == Hdr_vssl_flght) doHdr_vssl_flght_NE(info);
		else if (ne == Hdr_load_port_cd) doHdr_load_port_cd_NE(info);
		else if (ne == Hdr_load_port_nm) doHdr_load_port_nm_NE(info);
		else if (ne == Hdr_etd_dt) doHdr_etd_dt_NE(info);
		else if (ne == Hdr_dschrg_port_cd) doHdr_dschrg_port_cd_NE(info);
		else if (ne == Hdr_dschrg_port_nm) doHdr_dschrg_port_nm_NE(info);
		else if (ne == Hdr_eta_dt) doHdr_eta_dt_NE(info);
		else if (ne == Hdr_via_port_cd) doHdr_via_port_cd_NE(info);
		else if (ne == Hdr_via_port_nm) doHdr_via_port_nm_NE(info);
		else if (ne == Hdr_via_schd_dt) doHdr_via_schd_dt_NE(info);
		else if (ne == Hdr_tterm_cd1) doHdr_tterm_cd1_NE(info);
		else if (ne == Hdr_tterm_nm1) doHdr_tterm_nm1_NE(info);
		else if (ne == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NE(info);
		else if (ne == Hdr_tterm_cd2) doHdr_tterm_cd2_NE(info);
		else if (ne == Hdr_tterm_nm2) doHdr_tterm_nm2_NE(info);
		else if (ne == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NE(info);
		else if (ne == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_trd_amt_rnd_typ) doHdr_trd_amt_rnd_typ_NE(info);
		else if (ne == Hdr_trd_tax_rnd_typ) doHdr_trd_tax_rnd_typ_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_xrate_cd) doHdr_xrate_cd_NE(info);
		else if (ne == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NE(info);
		else if (ne == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NE(info);
		else if (ne == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NE(info);
		else if (ne == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NE(info);
		else if (ne == Hdr_ptax_xrate_inpt_flg) doHdr_ptax_xrate_inpt_flg_NE(info);
		else if (ne == Hdr_tterm_cd3) doHdr_tterm_cd3_NE(info);
		else if (ne == Hdr_tterm_nm3) doHdr_tterm_nm3_NE(info);
		else if (ne == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NE(info);
		else if (ne == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NE(info);
		else if (ne == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_NE(info);
		else if (ne == Hdr_lc_no) doHdr_lc_no_NE(info);
		else if (ne == Hdr_lc_dt) doHdr_lc_dt_NE(info);
		else if (ne == Hdr_lc_rmrks) doHdr_lc_rmrks_NE(info);
		else if (ne == Hdr_bl_no) doHdr_bl_no_NE(info);
		else if (ne == Hdr_bl_dt) doHdr_bl_dt_NE(info);
		else if (ne == Hdr_bl_rmrks) doHdr_bl_rmrks_NE(info);
		else if (ne == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_NE(info);
		else if (ne == Hdr_iv_rmrks) doHdr_iv_rmrks_NE(info);
		else if (ne == Hdr_case_mrk1) doHdr_case_mrk1_NE(info);
		else if (ne == Hdr_case_mrk2) doHdr_case_mrk2_NE(info);
		else if (ne == Hdr_case_mrk3) doHdr_case_mrk3_NE(info);
		else if (ne == Hdr_case_mrk4) doHdr_case_mrk4_NE(info);
		else if (ne == Hdr_case_mrk5) doHdr_case_mrk5_NE(info);
		else if (ne == Hdr_case_mrk6) doHdr_case_mrk6_NE(info);
		else if (ne == Hdr_pre_rcpt_iv_flg) doHdr_pre_rcpt_iv_flg_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_bill_cl_typ) doHdr_bill_cl_typ_NE(info);
		else if (ne == Hdr_purc_ddlv_flg) doHdr_purc_ddlv_flg_NE(info);
		else if (ne == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_NE(info);
		else if (ne == Hdr_lnk_ar_dpt_cd) doHdr_lnk_ar_dpt_cd_NE(info);
		else if (ne == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NE(info);
		else if (ne == Hdr_iv_upd_cntr) doHdr_iv_upd_cntr_NE(info);
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
		else if (ne == Ttl_ttl_iv_amt) doTtl_ttl_iv_amt_NE(info);
		else if (ne == Ttl_ttl_ncv_amt) doTtl_ttl_ncv_amt_NE(info);
		else if (ne == Ttl_ttl_base_amt) doTtl_ttl_base_amt_NE(info);
		else if (ne == Ttl_ttl_freight_amt) doTtl_ttl_freight_amt_NE(info);
		else if (ne == Ttl_ttl_insurance_amt) doTtl_ttl_insurance_amt_NE(info);
		else if (ne == Ttl_ttl_other_amt) doTtl_ttl_other_amt_NE(info);
		else if (ne == columnDtl_iv_mng_no) doDtl_iv_mng_no_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_bndl_flg) doDtl_bndl_flg_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_exim_xpns_typ) doDtl_exim_xpns_typ_NE(info);
		else if (ne == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NE(info);
		else if (ne == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_upri_qty) doDtl_upri_qty_NE(info);
		else if (ne == columnDtl_max_base_unit_qty) doDtl_max_base_unit_qty_NE(info);
		else if (ne == columnDtl_max_trd_unit_qty) doDtl_max_trd_unit_qty_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_schd_trd_cur_dscnt_amt) doDtl_schd_trd_cur_dscnt_amt_NE(info);
		else if (ne == columnDtl_schd_base_unit_qty) doDtl_schd_base_unit_qty_NE(info);
		else if (ne == columnDtl_cst_po_no) doDtl_cst_po_no_NE(info);
		else if (ne == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NE(info);
		else if (ne == columnDtl_multi_ship_fr_lg_grp_flg) doDtl_multi_ship_fr_lg_grp_flg_NE(info);
		else if (ne == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnDtl_ship_fr_lg_grp_nm) doDtl_ship_fr_lg_grp_nm_NE(info);
		else if (ne == columnDtl_rsn_cd) doDtl_rsn_cd_NE(info);
		else if (ne == columnDtl_rsn_nm) doDtl_rsn_nm_NE(info);
		else if (ne == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NE(info);
		else if (ne == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NE(info);
		else if (ne == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NE(info);
		else if (ne == columnDtl_sls_dpt_wg_cd) doDtl_sls_dpt_wg_cd_NE(info);
		else if (ne == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NE(info);
		else if (ne == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NE(info);
		else if (ne == columnDtl_iv_d_rmrks) doDtl_iv_d_rmrks_NE(info);
		else if (ne == columnDtl_trd_rmrks) doDtl_trd_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NE(info);
		else if (ne == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_NE(info);
		else if (ne == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_NE(info);
		else if (ne == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_ship_rqst_no) doDtl_ship_rqst_no_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NE(info);
		else if (ne == columnDtl_ship_inst_no) doDtl_ship_inst_no_NE(info);
		else if (ne == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NE(info);
		else if (ne == columnDtl_ship_act_no) doDtl_ship_act_no_NE(info);
		else if (ne == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NE(info);
		else if (ne == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NE(info);
		else if (ne == columnDtl_uplnd_flg) doDtl_uplnd_flg_NE(info);
		else if (ne == columnDtl_dest_cd1) doDtl_dest_cd1_NE(info);
		else if (ne == columnDtl_dest_cd2) doDtl_dest_cd2_NE(info);
		else if (ne == columnDtl_dest_cd3) doDtl_dest_cd3_NE(info);
		else if (ne == columnDtl_sls_upri_cng_flg) doDtl_sls_upri_cng_flg_NE(info);
		else if (ne == columnDtl_purc_schd_no) doDtl_purc_schd_no_NE(info);
		else if (ne == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NE(info);
		else if (ne == columnDtl_iv_d_no) doDtl_iv_d_no_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_ptax_cur_amt) doDtl_ptax_cur_amt_NE(info);
		else if (ne == columnDtl_wtax_rate) doDtl_wtax_rate_NE(info);
		else if (ne == columnDtl_wtax_amt) doDtl_wtax_amt_NE(info);
		else if (ne == columnDtl_ship_schd_no) doDtl_ship_schd_no_NE(info);
		else if (ne == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_NE(info);
		else if (ne == columnDtl_manual_add_flg) doDtl_manual_add_flg_NE(info);
		else if (ne == columnDtl_existed_flg) doDtl_existed_flg_NE(info);
		else if (ne == columnDtl_purc_ddlv_flg) doDtl_purc_ddlv_flg_NE(info);
		else if (ne == columnDtl_ship_pr_no) doDtl_ship_pr_no_NE(info);
		else if (ne == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NE(info);
		else if (ne == columnDtl_ship_inst_qty) doDtl_ship_inst_qty_NE(info);
		else if (ne == columnDtl_ship_act_qty) doDtl_ship_act_qty_NE(info);
		else if (ne == columnDtl_ship_pr_upd_cntr) doDtl_ship_pr_upd_cntr_NE(info);
		else if (ne == columnDtl_index) doDtl_index_NE(info);
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
	 * [Cnd]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[is_slo_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_is_slo_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[num_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_num_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_rev_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[iv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[arr_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_arr_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_immed_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_immed_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_skip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_skip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_reg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_reg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[non_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_non_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[old_iv_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_old_iv_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_cststk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_cststk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_cmpl_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[vssl_flght]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vssl_flght_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[load_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_load_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[load_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_load_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[etd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_etd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dschrg_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dschrg_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dschrg_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dschrg_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[eta_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_eta_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_schd_dt_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_tax_rnd_typ_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_xrate_inpt_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk4_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk5_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk6_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_rcpt_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_rcpt_iv_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_cl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ddlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ddlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lnk_ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lnk_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_upd_cntr_NE(MCEventInfo info){
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
	 * [Ttl]パネルの[ttl_iv_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_iv_amt_NE(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_ncv_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_ncv_amt_NE(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_base_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_base_amt_NE(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_freight_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_freight_amt_NE(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_insurance_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_insurance_amt_NE(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_other_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_other_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_mng_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[bndl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bndl_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[exim_xpns_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_base_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_trd_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_trd_unit_qty_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[schd_trd_cur_dscnt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_cur_dscnt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_base_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[multi_ship_fr_lg_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_multi_ship_fr_lg_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[uplnd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_uplnd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[manual_add_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_manual_add_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[existed_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_existed_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[index]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_index_NE(MCEventInfo info){
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
		else if (nx == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NX(info);
		else if (nx == Hdr_iv_mng_no) doHdr_iv_mng_no_NX(info);
		else if (nx == Hdr_rcpt_iv_mng_no) doHdr_rcpt_iv_mng_no_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_sls_basis_typ) doHdr_sls_basis_typ_NX(info);
		else if (nx == Hdr_prov_basis_typ) doHdr_prov_basis_typ_NX(info);
		else if (nx == Hdr_iv_no) doHdr_iv_no_NX(info);
		else if (nx == Hdr_is_slo_iv_no) doHdr_is_slo_iv_no_NX(info);
		else if (nx == Hdr_num_flg) doHdr_num_flg_NX(info);
		else if (nx == Hdr_iv_rev) doHdr_iv_rev_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_iv_dt) doHdr_iv_dt_NX(info);
		else if (nx == Hdr_iv_src_typ) doHdr_iv_src_typ_NX(info);
		else if (nx == Hdr_iv_src_typ_nm) doHdr_iv_src_typ_nm_NX(info);
		else if (nx == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NX(info);
		else if (nx == Hdr_cmpl_schd_dt) doHdr_cmpl_schd_dt_NX(info);
		else if (nx == Hdr_arr_schd_dt) doHdr_arr_schd_dt_NX(info);
		else if (nx == Hdr_sls_schd_dt) doHdr_sls_schd_dt_NX(info);
		else if (nx == Hdr_cmpl_dt) doHdr_cmpl_dt_NX(info);
		else if (nx == Hdr_ac_dt) doHdr_ac_dt_NX(info);
		else if (nx == Hdr_iv_ship_flg) doHdr_iv_ship_flg_NX(info);
		else if (nx == Hdr_iv_immed_prnt_flg) doHdr_iv_immed_prnt_flg_NX(info);
		else if (nx == Hdr_iv_prnt_flg) doHdr_iv_prnt_flg_NX(info);
		else if (nx == Hdr_pl_skip_flg) doHdr_pl_skip_flg_NX(info);
		else if (nx == Hdr_pl_reg_flg) doHdr_pl_reg_flg_NX(info);
		else if (nx == Hdr_non_cmpl_flg) doHdr_non_cmpl_flg_NX(info);
		else if (nx == Hdr_cmpl_flg) doHdr_cmpl_flg_NX(info);
		else if (nx == Hdr_old_iv_ship_flg) doHdr_old_iv_ship_flg_NX(info);
		else if (nx == Hdr_dlv_id_typ) doHdr_dlv_id_typ_NX(info);
		else if (nx == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_NX(info);
		else if (nx == Hdr_dlv_id_cd) doHdr_dlv_id_cd_NX(info);
		else if (nx == Hdr_dlv_id_nm) doHdr_dlv_id_nm_NX(info);
		else if (nx == Hdr_dlv_sundry_flg) doHdr_dlv_sundry_flg_NX(info);
		else if (nx == Hdr_ship_rqst_id_typ) doHdr_ship_rqst_id_typ_NX(info);
		else if (nx == Hdr_ship_rqst_id_typ_nm) doHdr_ship_rqst_id_typ_nm_NX(info);
		else if (nx == Hdr_ship_rqst_id_cd) doHdr_ship_rqst_id_cd_NX(info);
		else if (nx == Hdr_ship_rqst_id_nm) doHdr_ship_rqst_id_nm_NX(info);
		else if (nx == Hdr_sls_upri_cng_flg) doHdr_sls_upri_cng_flg_NX(info);
		else if (nx == Hdr_via_dlv_typ) doHdr_via_dlv_typ_NX(info);
		else if (nx == Hdr_via_dlv_typ_nm) doHdr_via_dlv_typ_nm_NX(info);
		else if (nx == Hdr_tdlv_cd) doHdr_tdlv_cd_NX(info);
		else if (nx == Hdr_tdlv_nm) doHdr_tdlv_nm_NX(info);
		else if (nx == Hdr_tdlv_sundry_flg) doHdr_tdlv_sundry_flg_NX(info);
		else if (nx == Hdr_sls_cststk_flg) doHdr_sls_cststk_flg_NX(info);
		else if (nx == Hdr_sls_cmpl_flg) doHdr_sls_cmpl_flg_NX(info);
		else if (nx == Hdr_trnspt_cd) doHdr_trnspt_cd_NX(info);
		else if (nx == Hdr_trnspt_nm) doHdr_trnspt_nm_NX(info);
		else if (nx == Hdr_vssl_flght) doHdr_vssl_flght_NX(info);
		else if (nx == Hdr_load_port_cd) doHdr_load_port_cd_NX(info);
		else if (nx == Hdr_load_port_nm) doHdr_load_port_nm_NX(info);
		else if (nx == Hdr_etd_dt) doHdr_etd_dt_NX(info);
		else if (nx == Hdr_dschrg_port_cd) doHdr_dschrg_port_cd_NX(info);
		else if (nx == Hdr_dschrg_port_nm) doHdr_dschrg_port_nm_NX(info);
		else if (nx == Hdr_eta_dt) doHdr_eta_dt_NX(info);
		else if (nx == Hdr_via_port_cd) doHdr_via_port_cd_NX(info);
		else if (nx == Hdr_via_port_nm) doHdr_via_port_nm_NX(info);
		else if (nx == Hdr_via_schd_dt) doHdr_via_schd_dt_NX(info);
		else if (nx == Hdr_tterm_cd1) doHdr_tterm_cd1_NX(info);
		else if (nx == Hdr_tterm_nm1) doHdr_tterm_nm1_NX(info);
		else if (nx == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_NX(info);
		else if (nx == Hdr_tterm_cd2) doHdr_tterm_cd2_NX(info);
		else if (nx == Hdr_tterm_nm2) doHdr_tterm_nm2_NX(info);
		else if (nx == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_NX(info);
		else if (nx == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_trd_amt_rnd_typ) doHdr_trd_amt_rnd_typ_NX(info);
		else if (nx == Hdr_trd_tax_rnd_typ) doHdr_trd_tax_rnd_typ_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_xrate_cd) doHdr_xrate_cd_NX(info);
		else if (nx == Hdr_xrate_inpt_flg) doHdr_xrate_inpt_flg_NX(info);
		else if (nx == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_NX(info);
		else if (nx == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_NX(info);
		else if (nx == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_NX(info);
		else if (nx == Hdr_ptax_xrate_inpt_flg) doHdr_ptax_xrate_inpt_flg_NX(info);
		else if (nx == Hdr_tterm_cd3) doHdr_tterm_cd3_NX(info);
		else if (nx == Hdr_tterm_nm3) doHdr_tterm_nm3_NX(info);
		else if (nx == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_NX(info);
		else if (nx == Hdr_bill_basis_dt) doHdr_bill_basis_dt_NX(info);
		else if (nx == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_NX(info);
		else if (nx == Hdr_lc_no) doHdr_lc_no_NX(info);
		else if (nx == Hdr_lc_dt) doHdr_lc_dt_NX(info);
		else if (nx == Hdr_lc_rmrks) doHdr_lc_rmrks_NX(info);
		else if (nx == Hdr_bl_no) doHdr_bl_no_NX(info);
		else if (nx == Hdr_bl_dt) doHdr_bl_dt_NX(info);
		else if (nx == Hdr_bl_rmrks) doHdr_bl_rmrks_NX(info);
		else if (nx == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_NX(info);
		else if (nx == Hdr_iv_rmrks) doHdr_iv_rmrks_NX(info);
		else if (nx == Hdr_case_mrk1) doHdr_case_mrk1_NX(info);
		else if (nx == Hdr_case_mrk2) doHdr_case_mrk2_NX(info);
		else if (nx == Hdr_case_mrk3) doHdr_case_mrk3_NX(info);
		else if (nx == Hdr_case_mrk4) doHdr_case_mrk4_NX(info);
		else if (nx == Hdr_case_mrk5) doHdr_case_mrk5_NX(info);
		else if (nx == Hdr_case_mrk6) doHdr_case_mrk6_NX(info);
		else if (nx == Hdr_pre_rcpt_iv_flg) doHdr_pre_rcpt_iv_flg_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_bill_cl_typ) doHdr_bill_cl_typ_NX(info);
		else if (nx == Hdr_purc_ddlv_flg) doHdr_purc_ddlv_flg_NX(info);
		else if (nx == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_NX(info);
		else if (nx == Hdr_lnk_ar_dpt_cd) doHdr_lnk_ar_dpt_cd_NX(info);
		else if (nx == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NX(info);
		else if (nx == Hdr_iv_upd_cntr) doHdr_iv_upd_cntr_NX(info);
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
		else if (nx == Ttl_ttl_iv_amt) doTtl_ttl_iv_amt_NX(info);
		else if (nx == Ttl_ttl_ncv_amt) doTtl_ttl_ncv_amt_NX(info);
		else if (nx == Ttl_ttl_base_amt) doTtl_ttl_base_amt_NX(info);
		else if (nx == Ttl_ttl_freight_amt) doTtl_ttl_freight_amt_NX(info);
		else if (nx == Ttl_ttl_insurance_amt) doTtl_ttl_insurance_amt_NX(info);
		else if (nx == Ttl_ttl_other_amt) doTtl_ttl_other_amt_NX(info);
		else if (nx == columnDtl_iv_mng_no) doDtl_iv_mng_no_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_bndl_flg) doDtl_bndl_flg_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_exim_xpns_typ) doDtl_exim_xpns_typ_NX(info);
		else if (nx == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NX(info);
		else if (nx == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_upri_qty) doDtl_upri_qty_NX(info);
		else if (nx == columnDtl_max_base_unit_qty) doDtl_max_base_unit_qty_NX(info);
		else if (nx == columnDtl_max_trd_unit_qty) doDtl_max_trd_unit_qty_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_schd_trd_cur_dscnt_amt) doDtl_schd_trd_cur_dscnt_amt_NX(info);
		else if (nx == columnDtl_schd_base_unit_qty) doDtl_schd_base_unit_qty_NX(info);
		else if (nx == columnDtl_cst_po_no) doDtl_cst_po_no_NX(info);
		else if (nx == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NX(info);
		else if (nx == columnDtl_multi_ship_fr_lg_grp_flg) doDtl_multi_ship_fr_lg_grp_flg_NX(info);
		else if (nx == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnDtl_ship_fr_lg_grp_nm) doDtl_ship_fr_lg_grp_nm_NX(info);
		else if (nx == columnDtl_rsn_cd) doDtl_rsn_cd_NX(info);
		else if (nx == columnDtl_rsn_nm) doDtl_rsn_nm_NX(info);
		else if (nx == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NX(info);
		else if (nx == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NX(info);
		else if (nx == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NX(info);
		else if (nx == columnDtl_sls_dpt_wg_cd) doDtl_sls_dpt_wg_cd_NX(info);
		else if (nx == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NX(info);
		else if (nx == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NX(info);
		else if (nx == columnDtl_iv_d_rmrks) doDtl_iv_d_rmrks_NX(info);
		else if (nx == columnDtl_trd_rmrks) doDtl_trd_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NX(info);
		else if (nx == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_NX(info);
		else if (nx == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_NX(info);
		else if (nx == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_ship_rqst_no) doDtl_ship_rqst_no_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NX(info);
		else if (nx == columnDtl_ship_inst_no) doDtl_ship_inst_no_NX(info);
		else if (nx == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NX(info);
		else if (nx == columnDtl_ship_act_no) doDtl_ship_act_no_NX(info);
		else if (nx == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NX(info);
		else if (nx == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NX(info);
		else if (nx == columnDtl_uplnd_flg) doDtl_uplnd_flg_NX(info);
		else if (nx == columnDtl_dest_cd1) doDtl_dest_cd1_NX(info);
		else if (nx == columnDtl_dest_cd2) doDtl_dest_cd2_NX(info);
		else if (nx == columnDtl_dest_cd3) doDtl_dest_cd3_NX(info);
		else if (nx == columnDtl_sls_upri_cng_flg) doDtl_sls_upri_cng_flg_NX(info);
		else if (nx == columnDtl_purc_schd_no) doDtl_purc_schd_no_NX(info);
		else if (nx == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NX(info);
		else if (nx == columnDtl_iv_d_no) doDtl_iv_d_no_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_ptax_cur_amt) doDtl_ptax_cur_amt_NX(info);
		else if (nx == columnDtl_wtax_rate) doDtl_wtax_rate_NX(info);
		else if (nx == columnDtl_wtax_amt) doDtl_wtax_amt_NX(info);
		else if (nx == columnDtl_ship_schd_no) doDtl_ship_schd_no_NX(info);
		else if (nx == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_NX(info);
		else if (nx == columnDtl_manual_add_flg) doDtl_manual_add_flg_NX(info);
		else if (nx == columnDtl_existed_flg) doDtl_existed_flg_NX(info);
		else if (nx == columnDtl_purc_ddlv_flg) doDtl_purc_ddlv_flg_NX(info);
		else if (nx == columnDtl_ship_pr_no) doDtl_ship_pr_no_NX(info);
		else if (nx == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NX(info);
		else if (nx == columnDtl_ship_inst_qty) doDtl_ship_inst_qty_NX(info);
		else if (nx == columnDtl_ship_act_qty) doDtl_ship_act_qty_NX(info);
		else if (nx == columnDtl_ship_pr_upd_cntr) doDtl_ship_pr_upd_cntr_NX(info);
		else if (nx == columnDtl_index) doDtl_index_NX(info);
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
	 * [Cnd]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[is_slo_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_is_slo_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[num_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_num_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_rev_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[iv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[arr_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_arr_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_immed_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_immed_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_skip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_skip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_reg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_reg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[non_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_non_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[old_iv_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_old_iv_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_cststk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_cststk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_cmpl_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[vssl_flght]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vssl_flght_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[load_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_load_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[load_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_load_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[etd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_etd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dschrg_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dschrg_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dschrg_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dschrg_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[eta_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_eta_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_schd_dt_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_tax_rnd_typ_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xrate_cd_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ptax_xrate_inpt_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk4_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk5_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk6_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_rcpt_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_rcpt_iv_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_cl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_ddlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_ddlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lnk_ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lnk_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_upd_cntr_NX(MCEventInfo info){
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
	 * [Ttl]パネルの[ttl_iv_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_iv_amt_NX(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_ncv_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_ncv_amt_NX(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_base_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_base_amt_NX(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_freight_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_freight_amt_NX(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_insurance_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_insurance_amt_NX(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_other_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_other_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_mng_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[bndl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bndl_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[exim_xpns_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_base_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_trd_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_trd_unit_qty_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[schd_trd_cur_dscnt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_cur_dscnt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_base_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[multi_ship_fr_lg_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_multi_ship_fr_lg_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[uplnd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_uplnd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[manual_add_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_manual_add_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[existed_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_existed_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[index]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_index_NX(MCEventInfo info){
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
		else if (lc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_LC(info);
		else if (lc == Hdr_iv_mng_no) doHdr_iv_mng_no_LC(info);
		else if (lc == Hdr_rcpt_iv_mng_no) doHdr_rcpt_iv_mng_no_LC(info);
		else if (lc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_LC(info);
		else if (lc == Hdr_sls_basis_typ) doHdr_sls_basis_typ_LC(info);
		else if (lc == Hdr_prov_basis_typ) doHdr_prov_basis_typ_LC(info);
		else if (lc == Hdr_iv_no) doHdr_iv_no_LC(info);
		else if (lc == Hdr_iv_rev) doHdr_iv_rev_LC(info);
		else if (lc == Hdr_iv_dt) doHdr_iv_dt_LC(info);
		else if (lc == Hdr_iv_src_typ) doHdr_iv_src_typ_LC(info);
		else if (lc == Hdr_iv_src_typ_nm) doHdr_iv_src_typ_nm_LC(info);
		else if (lc == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_LC(info);
		else if (lc == Hdr_cmpl_schd_dt) doHdr_cmpl_schd_dt_LC(info);
		else if (lc == Hdr_arr_schd_dt) doHdr_arr_schd_dt_LC(info);
		else if (lc == Hdr_sls_schd_dt) doHdr_sls_schd_dt_LC(info);
		else if (lc == Hdr_cmpl_dt) doHdr_cmpl_dt_LC(info);
		else if (lc == Hdr_ac_dt) doHdr_ac_dt_LC(info);
		else if (lc == Hdr_dlv_id_typ) doHdr_dlv_id_typ_LC(info);
		else if (lc == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_LC(info);
		else if (lc == Hdr_dlv_id_cd) doHdr_dlv_id_cd_LC(info);
		else if (lc == Hdr_dlv_id_nm) doHdr_dlv_id_nm_LC(info);
		else if (lc == Hdr_ship_rqst_id_typ) doHdr_ship_rqst_id_typ_LC(info);
		else if (lc == Hdr_ship_rqst_id_typ_nm) doHdr_ship_rqst_id_typ_nm_LC(info);
		else if (lc == Hdr_ship_rqst_id_cd) doHdr_ship_rqst_id_cd_LC(info);
		else if (lc == Hdr_ship_rqst_id_nm) doHdr_ship_rqst_id_nm_LC(info);
		else if (lc == Hdr_via_dlv_typ) doHdr_via_dlv_typ_LC(info);
		else if (lc == Hdr_via_dlv_typ_nm) doHdr_via_dlv_typ_nm_LC(info);
		else if (lc == Hdr_tdlv_cd) doHdr_tdlv_cd_LC(info);
		else if (lc == Hdr_tdlv_nm) doHdr_tdlv_nm_LC(info);
		else if (lc == Hdr_trnspt_cd) doHdr_trnspt_cd_LC(info);
		else if (lc == Hdr_trnspt_nm) doHdr_trnspt_nm_LC(info);
		else if (lc == Hdr_vssl_flght) doHdr_vssl_flght_LC(info);
		else if (lc == Hdr_load_port_cd) doHdr_load_port_cd_LC(info);
		else if (lc == Hdr_load_port_nm) doHdr_load_port_nm_LC(info);
		else if (lc == Hdr_etd_dt) doHdr_etd_dt_LC(info);
		else if (lc == Hdr_dschrg_port_cd) doHdr_dschrg_port_cd_LC(info);
		else if (lc == Hdr_dschrg_port_nm) doHdr_dschrg_port_nm_LC(info);
		else if (lc == Hdr_eta_dt) doHdr_eta_dt_LC(info);
		else if (lc == Hdr_via_port_cd) doHdr_via_port_cd_LC(info);
		else if (lc == Hdr_via_port_nm) doHdr_via_port_nm_LC(info);
		else if (lc == Hdr_via_schd_dt) doHdr_via_schd_dt_LC(info);
		else if (lc == Hdr_tterm_cd1) doHdr_tterm_cd1_LC(info);
		else if (lc == Hdr_tterm_nm1) doHdr_tterm_nm1_LC(info);
		else if (lc == Hdr_tterm_rmrks1) doHdr_tterm_rmrks1_LC(info);
		else if (lc == Hdr_tterm_cd2) doHdr_tterm_cd2_LC(info);
		else if (lc == Hdr_tterm_nm2) doHdr_tterm_nm2_LC(info);
		else if (lc == Hdr_tterm_rmrks2) doHdr_tterm_rmrks2_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_trd_cur_upri_dec_place) doHdr_trd_cur_upri_dec_place_LC(info);
		else if (lc == Hdr_trd_cur_amt_dec_place) doHdr_trd_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_trd_amt_rnd_typ) doHdr_trd_amt_rnd_typ_LC(info);
		else if (lc == Hdr_trd_tax_rnd_typ) doHdr_trd_tax_rnd_typ_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_xrate_cd) doHdr_xrate_cd_LC(info);
		else if (lc == Hdr_ptax_cur_cd) doHdr_ptax_cur_cd_LC(info);
		else if (lc == Hdr_ptax_cur_nm) doHdr_ptax_cur_nm_LC(info);
		else if (lc == Hdr_ptax_cur_amt_dec_place) doHdr_ptax_cur_amt_dec_place_LC(info);
		else if (lc == Hdr_tterm_cd3) doHdr_tterm_cd3_LC(info);
		else if (lc == Hdr_tterm_nm3) doHdr_tterm_nm3_LC(info);
		else if (lc == Hdr_tterm_rmrks3) doHdr_tterm_rmrks3_LC(info);
		else if (lc == Hdr_bill_basis_dt) doHdr_bill_basis_dt_LC(info);
		else if (lc == Hdr_rcv_schd_dt) doHdr_rcv_schd_dt_LC(info);
		else if (lc == Hdr_lc_no) doHdr_lc_no_LC(info);
		else if (lc == Hdr_lc_dt) doHdr_lc_dt_LC(info);
		else if (lc == Hdr_lc_rmrks) doHdr_lc_rmrks_LC(info);
		else if (lc == Hdr_bl_no) doHdr_bl_no_LC(info);
		else if (lc == Hdr_bl_dt) doHdr_bl_dt_LC(info);
		else if (lc == Hdr_bl_rmrks) doHdr_bl_rmrks_LC(info);
		else if (lc == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_LC(info);
		else if (lc == Hdr_iv_rmrks) doHdr_iv_rmrks_LC(info);
		else if (lc == Hdr_case_mrk1) doHdr_case_mrk1_LC(info);
		else if (lc == Hdr_case_mrk2) doHdr_case_mrk2_LC(info);
		else if (lc == Hdr_case_mrk3) doHdr_case_mrk3_LC(info);
		else if (lc == Hdr_case_mrk4) doHdr_case_mrk4_LC(info);
		else if (lc == Hdr_case_mrk5) doHdr_case_mrk5_LC(info);
		else if (lc == Hdr_case_mrk6) doHdr_case_mrk6_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_bill_cl_typ) doHdr_bill_cl_typ_LC(info);
		else if (lc == Hdr_ar_dpt_typ) doHdr_ar_dpt_typ_LC(info);
		else if (lc == Hdr_lnk_ar_dpt_cd) doHdr_lnk_ar_dpt_cd_LC(info);
		else if (lc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_LC(info);
		else if (lc == Hdr_iv_upd_cntr) doHdr_iv_upd_cntr_LC(info);
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
		else if (lc == Ttl_ttl_iv_amt) doTtl_ttl_iv_amt_LC(info);
		else if (lc == Ttl_ttl_ncv_amt) doTtl_ttl_ncv_amt_LC(info);
		else if (lc == Ttl_ttl_base_amt) doTtl_ttl_base_amt_LC(info);
		else if (lc == Ttl_ttl_freight_amt) doTtl_ttl_freight_amt_LC(info);
		else if (lc == Ttl_ttl_insurance_amt) doTtl_ttl_insurance_amt_LC(info);
		else if (lc == Ttl_ttl_other_amt) doTtl_ttl_other_amt_LC(info);
		else if (lc == columnDtl_iv_mng_no) doDtl_iv_mng_no_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_exim_xpns_typ) doDtl_exim_xpns_typ_LC(info);
		else if (lc == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_LC(info);
		else if (lc == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_upri_qty) doDtl_upri_qty_LC(info);
		else if (lc == columnDtl_max_base_unit_qty) doDtl_max_base_unit_qty_LC(info);
		else if (lc == columnDtl_max_trd_unit_qty) doDtl_max_trd_unit_qty_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_schd_trd_cur_dscnt_amt) doDtl_schd_trd_cur_dscnt_amt_LC(info);
		else if (lc == columnDtl_schd_base_unit_qty) doDtl_schd_base_unit_qty_LC(info);
		else if (lc == columnDtl_cst_po_no) doDtl_cst_po_no_LC(info);
		else if (lc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_LC(info);
		else if (lc == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnDtl_ship_fr_lg_grp_nm) doDtl_ship_fr_lg_grp_nm_LC(info);
		else if (lc == columnDtl_rsn_cd) doDtl_rsn_cd_LC(info);
		else if (lc == columnDtl_rsn_nm) doDtl_rsn_nm_LC(info);
		else if (lc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_LC(info);
		else if (lc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_LC(info);
		else if (lc == columnDtl_sls_dpt_wg_cd) doDtl_sls_dpt_wg_cd_LC(info);
		else if (lc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_LC(info);
		else if (lc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_LC(info);
		else if (lc == columnDtl_iv_d_rmrks) doDtl_iv_d_rmrks_LC(info);
		else if (lc == columnDtl_trd_rmrks) doDtl_trd_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_LC(info);
		else if (lc == columnDtl_dtl_sub_char1) doDtl_dtl_sub_char1_LC(info);
		else if (lc == columnDtl_dtl_sub_char2) doDtl_dtl_sub_char2_LC(info);
		else if (lc == columnDtl_dtl_sub_char3) doDtl_dtl_sub_char3_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_ship_rqst_no) doDtl_ship_rqst_no_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_LC(info);
		else if (lc == columnDtl_ship_inst_no) doDtl_ship_inst_no_LC(info);
		else if (lc == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_LC(info);
		else if (lc == columnDtl_ship_act_no) doDtl_ship_act_no_LC(info);
		else if (lc == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_LC(info);
		else if (lc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_LC(info);
		else if (lc == columnDtl_dest_cd1) doDtl_dest_cd1_LC(info);
		else if (lc == columnDtl_dest_cd2) doDtl_dest_cd2_LC(info);
		else if (lc == columnDtl_dest_cd3) doDtl_dest_cd3_LC(info);
		else if (lc == columnDtl_purc_schd_no) doDtl_purc_schd_no_LC(info);
		else if (lc == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_LC(info);
		else if (lc == columnDtl_iv_d_no) doDtl_iv_d_no_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_ptax_cur_amt) doDtl_ptax_cur_amt_LC(info);
		else if (lc == columnDtl_wtax_rate) doDtl_wtax_rate_LC(info);
		else if (lc == columnDtl_wtax_amt) doDtl_wtax_amt_LC(info);
		else if (lc == columnDtl_ship_schd_no) doDtl_ship_schd_no_LC(info);
		else if (lc == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_LC(info);
		else if (lc == columnDtl_ship_pr_no) doDtl_ship_pr_no_LC(info);
		else if (lc == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_LC(info);
		else if (lc == columnDtl_ship_inst_qty) doDtl_ship_inst_qty_LC(info);
		else if (lc == columnDtl_ship_act_qty) doDtl_ship_act_qty_LC(info);
		else if (lc == columnDtl_ship_pr_upd_cntr) doDtl_ship_pr_upd_cntr_LC(info);
		else if (lc == columnDtl_index) doDtl_index_LC(info);
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
	 * [Cnd]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[arr_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_arr_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[vssl_flght]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vssl_flght_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[load_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_load_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[load_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_load_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[etd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_etd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dschrg_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dschrg_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dschrg_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dschrg_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[eta_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_eta_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_schd_dt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_tax_rnd_typ_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lc_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lc_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk4_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk5_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[case_mrk6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_case_mrk6_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[bill_cl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lnk_ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lnk_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_upd_cntr_LC(MCEventInfo info){
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
	 * [Ttl]パネルの[ttl_iv_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_iv_amt_LC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_ncv_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_ncv_amt_LC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_base_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_base_amt_LC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_freight_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_freight_amt_LC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_insurance_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_insurance_amt_LC(MCEventInfo info){
	}

	/**
	 * [Ttl]パネルの[ttl_other_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTtl_ttl_other_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_mng_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[exim_xpns_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upri_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_base_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_trd_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_trd_unit_qty_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[schd_trd_cur_dscnt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_trd_cur_dscnt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_base_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dtl_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[index]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_index_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkSrchTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trnspt_cd]の作成メソッド
	 */
	public MCList getHdr_trnspt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrnspt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_load_port_cd]の作成メソッド
	 */
	public MCList getHdr_load_port_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getEximPort(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dschrg_port_cd]の作成メソッド
	 */
	public MCList getHdr_dschrg_port_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getEximPort(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_via_port_cd]の作成メソッド
	 */
	public MCList getHdr_via_port_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getEximPort(row, info);
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
	 * コンボ／リストのリスト[Hdr_trd_cur_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_tterm_cd3]の作成メソッド
	 */
	public MCList getHdr_tterm_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
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
	 * コンボ／リストのリスト[Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ar_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1730.Srch01")) {
			return new MS_MSBEL1730_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1730.Srch02")) {
			return new MS_MSBEL1730_Srch02Bridge();
		}
		if (id.equals("MS.MSBEL1730.Srch04")) {
			return new MS_MSBEL1730_Srch04Bridge();
		}
		if (id.equals("MS.MSBEL1730.Ins01")) {
			return new MS_MSBEL1730_Ins01Bridge();
		}
		if (id.equals("MS.MSBEL1730.Upd01")) {
			return new MS_MSBEL1730_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1730.Del01")) {
			return new MS_MSBEL1730_Del01Bridge();
		}
		if (id.equals("MS.MSBEL1730.Prnt01")) {
			return new MS_MSBEL1730_Prnt01Bridge();
		}
		if (id.equals("MS.MSBEL1730.Sprt01")) {
			return new MS_MSBEL1730_Sprt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1730_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1730_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1730_Srch01Bridge() {
			p_MS_MSBEL1730_Srch01 = new MCParam(PDef.MS_MSBEL1730_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1730_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1730.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.class));

			p_MS_MSBEL1730_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1730_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1730_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1730_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1730_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1730.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1730.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1730.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1730.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR>)down(2);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR> down3() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR>)down(3);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR> down4() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR>)down(4);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1730_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			p_MS_MSBEL1730_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
			p_MS_MSBEL1730_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class));
			p_MS_MSBEL1730_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.class));
			p_MS_MSBEL1730_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1730_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1730.HdrR)p_MS_MSBEL1730_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)p_MS_MSBEL1730_Srch01.getContainerParam().getDownBlock(1));
			setMapDtlL((MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR>)p_MS_MSBEL1730_Srch01.getContainerParam().getDownBlock(2));
			setShipInstMapDtlL((MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR>)p_MS_MSBEL1730_Srch01.getContainerParam().getDownBlock(3));
			setShipActMapDtlL((MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR>)p_MS_MSBEL1730_Srch01.getContainerParam().getDownBlock(4));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getMapDtlL().clear();
			getShipInstMapDtlL().clear();
			getShipActMapDtlL().clear();
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
			result.add(getMapDtlL());
			result.add(getShipInstMapDtlL());
			result.add(getShipActMapDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1730_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1730_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL1730_Srch02Bridge() {
			p_MS_MSBEL1730_Srch02 = new MCParam(PDef.MS_MSBEL1730_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1730_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.Cnd2R.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.class));

			p_MS_MSBEL1730_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1730_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1730_Srch02.addUpBlock(getCnd2L().shallowClone());
			p_MS_MSBEL1730_Srch02.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1730_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1730_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1730.Cnd2R> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.Cnd2R>)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1730.HdrR up1() {
			return (mcframe.clientMSBE.MSBEP1730.HdrR)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1730.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR>)down(2);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR> down3() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR>)down(3);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1730_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
			p_MS_MSBEL1730_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class));
			p_MS_MSBEL1730_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.class));
			p_MS_MSBEL1730_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1730_Srch02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)p_MS_MSBEL1730_Srch02.getContainerParam().getDownBlock(0));
			setMapDtlL((MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR>)p_MS_MSBEL1730_Srch02.getContainerParam().getDownBlock(1));
			setShipInstMapDtlL((MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR>)p_MS_MSBEL1730_Srch02.getContainerParam().getDownBlock(2));
			setShipActMapDtlL((MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR>)p_MS_MSBEL1730_Srch02.getContainerParam().getDownBlock(3));
		}

		protected void clear() {
			getDtlL().clear();
			getMapDtlL().clear();
			getShipInstMapDtlL().clear();
			getShipActMapDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCnd2L());
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getMapDtlL());
			result.add(getShipInstMapDtlL());
			result.add(getShipActMapDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1730_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Srch04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1730_Srch04;

		/** コンストラクタ */
		protected MS_MSBEL1730_Srch04Bridge() {
			p_MS_MSBEL1730_Srch04 = new MCParam(PDef.MS_MSBEL1730_Srch04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1730_Srch04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1730.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.class));

			p_MS_MSBEL1730_Srch04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1730_Srch04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1730_Srch04.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1730_Srch04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1730_Srch04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1730.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1730.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1730.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1730.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR>)down(2);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR> down3() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR>)down(3);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR> down4() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR>)down(4);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1730_Srch04.addDownBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			p_MS_MSBEL1730_Srch04.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
			p_MS_MSBEL1730_Srch04.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class));
			p_MS_MSBEL1730_Srch04.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.class));
			p_MS_MSBEL1730_Srch04.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1730_Srch04;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1730.HdrR)p_MS_MSBEL1730_Srch04.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)p_MS_MSBEL1730_Srch04.getContainerParam().getDownBlock(1));
			setMapDtlL((MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR>)p_MS_MSBEL1730_Srch04.getContainerParam().getDownBlock(2));
			setShipInstMapDtlL((MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR>)p_MS_MSBEL1730_Srch04.getContainerParam().getDownBlock(3));
			setShipActMapDtlL((MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR>)p_MS_MSBEL1730_Srch04.getContainerParam().getDownBlock(4));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getMapDtlL().clear();
			getShipInstMapDtlL().clear();
			getShipActMapDtlL().clear();
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
			result.add(getMapDtlL());
			result.add(getShipInstMapDtlL());
			result.add(getShipActMapDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1730_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1730_Ins01;

		/** コンストラクタ */
		protected MS_MSBEL1730_Ins01Bridge() {
			p_MS_MSBEL1730_Ins01 = new MCParam(PDef.MS_MSBEL1730_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1730_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));

			p_MS_MSBEL1730_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1730_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1730_Ins01.addUpBlock(getHdrR());
			p_MS_MSBEL1730_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1730_Ins01.addUpBlock(getMapDtlL().shallowClone());
			p_MS_MSBEL1730_Ins01.addUpBlock(getShipInstMapDtlL().shallowClone());
			p_MS_MSBEL1730_Ins01.addUpBlock(getShipActMapDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1730_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1730_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1730.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1730.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR>)up(2);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR> up3() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR>)up(3);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR> up4() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR>)up(4);
		}

		protected mcframe.clientMSBE.MSBEP1730.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1730.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1730_Ins01.addDownBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			p_MS_MSBEL1730_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1730_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1730.HdrR)p_MS_MSBEL1730_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)p_MS_MSBEL1730_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getMapDtlL());
			result.add(getShipInstMapDtlL());
			result.add(getShipActMapDtlL());
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
	 * [MS_MSBEL1730_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1730_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1730_Upd01Bridge() {
			p_MS_MSBEL1730_Upd01 = new MCParam(PDef.MS_MSBEL1730_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1730_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));

			p_MS_MSBEL1730_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1730_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1730_Upd01.addUpBlock(getHdrR());
			p_MS_MSBEL1730_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1730_Upd01.addUpBlock(getMapDtlL().shallowClone());
			p_MS_MSBEL1730_Upd01.addUpBlock(getShipInstMapDtlL().shallowClone());
			p_MS_MSBEL1730_Upd01.addUpBlock(getShipActMapDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1730_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1730_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1730.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1730.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR>)up(2);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR> up3() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipInstMapDtlR>)up(3);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR> up4() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.ShipActMapDtlR>)up(4);
		}

		protected mcframe.clientMSBE.MSBEP1730.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1730.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1730_Upd01.addDownBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			p_MS_MSBEL1730_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1730_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1730.HdrR)p_MS_MSBEL1730_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)p_MS_MSBEL1730_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getMapDtlL());
			result.add(getShipInstMapDtlL());
			result.add(getShipActMapDtlL());
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
	 * [MS_MSBEL1730_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1730_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1730_Del01Bridge() {
			p_MS_MSBEL1730_Del01 = new MCParam(PDef.MS_MSBEL1730_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1730_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.MapDtlR.class));
			// Down

			p_MS_MSBEL1730_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1730_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1730_Del01.addUpBlock(getHdrR());
			p_MS_MSBEL1730_Del01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1730_Del01.addUpBlock(getMapDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1730_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1730_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1730.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1730.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.MapDtlR>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL1730_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getMapDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBEL1730_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1730_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL1730_Prnt01Bridge() {
			p_MS_MSBEL1730_Prnt01 = new MCParam(PDef.MS_MSBEL1730_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1730_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1730.HdrR.create());
			// Down

			p_MS_MSBEL1730_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1730_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1730_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1730_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1730_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1730.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1730.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL1730_Prnt01;
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
	 * [MS_MSBEL1730_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1730_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1730_Sprt01;

		/** コンストラクタ */
		protected MS_MSBEL1730_Sprt01Bridge() {
			p_MS_MSBEL1730_Sprt01 = new MCParam(PDef.MS_MSBEL1730_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1730_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.UpriSrchR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.UpriSrchR.class));

			p_MS_MSBEL1730_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1730_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1730_Sprt01.addUpBlock(getUpriSrchL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1730_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1730_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1730.UpriSrchR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.UpriSrchR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1730.UpriSrchR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1730.UpriSrchR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1730_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1730.UpriSrchR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1730_Sprt01;
		}

		protected void show() {
			setUpriSrchL((MCList<mcframe.clientMSBE.MSBEP1730.UpriSrchR>)p_MS_MSBEL1730_Sprt01.getContainerParam().getDownBlock(0));
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
}