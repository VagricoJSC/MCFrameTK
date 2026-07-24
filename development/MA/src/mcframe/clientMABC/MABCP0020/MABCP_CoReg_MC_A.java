package mcframe.clientMABC.MABCP0020;

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
import mcframe.clientMABC.MABCP0020.MABCP_CoReg_MC.MA_MABCL0020_Srch01Caller;
import mcframe.clientMABC.MABCP0020.MABCP_CoReg_MC.MA_MABCL0020_Upd01Caller;

/**
 * 画面"MABCP_CoReg"パネルクラスです。<p>
 *
 * 会社マスタの検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_CoReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP0020";

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
	 * UPD,Create/Modify,0;UPD_ADMIN,Create/Modify (Administrator),2;REF,View,3 UPD,登録・訂正する,0;UPD_ADMIN,登録・訂正する（管理者）,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_UPD_ADMIN = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_co_cd_Label = null;
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_co_cd = null;
	/**
	 * Company name 会社名.<p>
	 *
	 */
	public MCTextField Cnd_co_nm_lcl = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Tab]ブロック関連のField定義
	public MCPanel TabPanel = null;
	public MCTabbedPane TabTab = null;
	// [Tab]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_admin = null;
	// [Upd1]ブロック関連のField定義
	public MCPanel Upd1Panel = null;
	// [Upd1]ブロックの項目のField定義
	// [Upd2]ブロック関連のField定義
	public MCPanel Upd2Panel = null;
	// [Upd2]ブロックの項目のField定義
	// [Upd21]ブロック関連のField定義
	public MCPanel Upd21Panel = null;
	// [Upd21]ブロックの項目のField定義
	// [Upd22]ブロック関連のField定義
	public MCPanel Upd22Panel = null;
	public MCTitledBorder Upd22TitledBorder = null;
	// [Upd22]ブロックの項目のField定義
	// [Upd3]ブロック関連のField定義
	public MCPanel Upd3Panel = null;
	// [Upd3]ブロックの項目のField定義
	// [Upd4]ブロック関連のField定義
	public MCPanel Upd4Panel = null;
	// [Upd4]ブロックの項目のField定義
	// [Base]ブロック関連のField定義
	public MCPanel BasePanel = null;
	// [Base]ブロックの項目のField定義
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public MCTextField Base_co_cd = null;
	public MCLabel Base_co_alt_nm1_Label = null;
	/**
	 * Company alias 1 会社別名１.<p>
	 *
	 */
	public MCTextField Base_co_alt_nm1 = null;
	public MCLabel Base_co_alt_nm2_Label = null;
	/**
	 * Company alias 2 会社別名２.<p>
	 *
	 */
	public MCTextField Base_co_alt_nm2 = null;
	public MCLabel Base_co_alt_nm3_Label = null;
	/**
	 * Company alias 3 会社別名３.<p>
	 *
	 */
	public MCTextField Base_co_alt_nm3 = null;
	public MCLabel Base_co_alt_nm4_Label = null;
	/**
	 * Company alias 4 会社別名４.<p>
	 *
	 */
	public MCTextField Base_co_alt_nm4 = null;
	public MCLabel Base_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField Base_cntry_nm = null;
	public MCLabel Base_area_cd_Label = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCTextField Base_area_nm = null;
	public MCLabel Base_zip_cd_Label = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCTextField Base_zip_cd = null;
	public MCLabel Base_addr1_Label = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCTextField Base_addr1 = null;
	public MCLabel Base_addr2_Label = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCTextField Base_addr2 = null;
	public MCLabel Base_addr3_Label = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCTextField Base_addr3 = null;
	public MCLabel Base_addr4_Label = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCTextField Base_addr4 = null;
	public MCLabel Base_tel_Label = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCTextField Base_tel = null;
	public MCLabel Base_fax_Label = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCTextField Base_fax = null;
	public MCLabel Base_co_repl_nm_Label = null;
	/**
	 * Representative name 代表者名.<p>
	 *
	 */
	public MCTextField Base_co_repl_nm = null;
	public MCLabel Base_biz_co_no_Label = null;
	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public MCTextField Base_biz_co_no = null;
	public MCLabel Base_ein_Label = null;
	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public MCTextField Base_ein = null;
	public MCLabel Base_std_co_cd_Label = null;
	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public MCTextField Base_std_co_cd = null;
	public MCLabel Base_base_cur_cd_Label = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCTextField Base_base_cur_nm = null;
	public MCLabel Base_ptax_cur_cd_Label = null;
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCTextField Base_ptax_cur_nm = null;
	public MCLabel Base_ac_cl_day_Label = null;
	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public MCNumberField Base_ac_cl_day = null;
	public MCLabel Base_ac_cl_mon_base_Label = null;
	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public MCNumberField Base_ac_cl_mon_base = null;
	public MCLabel Base_st_mon_Label = null;
	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public MCNumberField Base_st_mon = null;
	public MCLabel Base_dt_switch_time_Label = null;
	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public MCNumberField Base_dt_switch_time = null;
	public MCLabel Base_std_cal_cd_Label = null;
	/**
	 * Standard calendar cd. 標準カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_std_cal_cd = null;
	/**
	 * Standard calendar name 標準カレンダ名.<p>
	 *
	 */
	public MCTextField Base_std_cal_nm = null;
	/**
	 * AR not used 債権不使用.<p>
	 *
	 */
	public MCCheckBox Base_ar_no_use_flg = null;
	/**
	 * AP not used 債務不使用.<p>
	 *
	 */
	public MCCheckBox Base_ap_no_use_flg = null;
	/**
	 * Temporary AP use 暫定買掛使用.<p>
	 *
	 */
	public MCCheckBox Base_temp_ap_use_flg = null;
	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public MCCheckBox Base_sls_cl_flg = null;
	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public MCCheckBox Base_rcv_cl_flg = null;
	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public MCCheckBox Base_purc_cl_flg = null;
	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public MCCheckBox Base_pay_cl_flg = null;
	public MCLabel Base_sls_cl_cal_cd_Label = null;
	/**
	 * Sales closing calendar cd. 売上締カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_sls_cl_cal_cd = null;
	/**
	 * Sales closing calendar name 売上締カレンダ名.<p>
	 *
	 */
	public MCTextField Base_sls_cl_cal_nm = null;
	public MCLabel Base_sls_cl_delay_days_Label = null;
	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public MCNumberField Base_sls_cl_delay_days = null;
	public MCLabel Base_sls_cl_ba_typ_Label = null;
	/**
	 * Sales closing day before/after type 売上締日前後区分.<p>
	 *
	 */
	public MCTextComboBox Base_sls_cl_ba_typ = null;
	/**
	 * Before/after sales closing day type name 売上締日前後区分名.<p>
	 *
	 */
	public MCTextField Base_sls_cl_ba_typ_nm = null;
	public MCLabel Base_rcv_cl_cal_cd_Label = null;
	/**
	 * Payment received closing calendar cd. 入金締カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_rcv_cl_cal_cd = null;
	/**
	 * Payment received closing calendar name 入金締カレンダ名.<p>
	 *
	 */
	public MCTextField Base_rcv_cl_cal_nm = null;
	public MCLabel Base_rcv_cl_delay_days_Label = null;
	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public MCNumberField Base_rcv_cl_delay_days = null;
	public MCLabel Base_rcv_cl_ba_typ_Label = null;
	/**
	 * Payment received closing day before/after type 入金締日前後区分.<p>
	 *
	 */
	public MCTextComboBox Base_rcv_cl_ba_typ = null;
	/**
	 * Before/after payment received closing day type name 入金締日前後区分名.<p>
	 *
	 */
	public MCTextField Base_rcv_cl_ba_typ_nm = null;
	public MCLabel Base_purc_cl_cal_cd_Label = null;
	/**
	 * Purchase closing calendar cd. 仕入締カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_purc_cl_cal_cd = null;
	/**
	 * Purchase closing calendar name 仕入締カレンダ名.<p>
	 *
	 */
	public MCTextField Base_purc_cl_cal_nm = null;
	public MCLabel Base_purc_cl_delay_days_Label = null;
	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public MCNumberField Base_purc_cl_delay_days = null;
	public MCLabel Base_purc_cl_ba_typ_Label = null;
	/**
	 * Purchase closing day before/after type 仕入締日前後区分.<p>
	 *
	 */
	public MCTextComboBox Base_purc_cl_ba_typ = null;
	/**
	 * Before/after purchase closing day type name 仕入締日前後区分名.<p>
	 *
	 */
	public MCTextField Base_purc_cl_ba_typ_nm = null;
	public MCLabel Base_pay_cl_cal_cd_Label = null;
	/**
	 * Payment closing calendar cd. 支払締カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_pay_cl_cal_cd = null;
	/**
	 * Payment closing calendar name 支払締カレンダ名.<p>
	 *
	 */
	public MCTextField Base_pay_cl_cal_nm = null;
	public MCLabel Base_pay_cl_delay_days_Label = null;
	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public MCNumberField Base_pay_cl_delay_days = null;
	public MCLabel Base_pay_cl_ba_typ_Label = null;
	/**
	 * Payment closing day before/after type 支払締日前後区分.<p>
	 *
	 */
	public MCTextComboBox Base_pay_cl_ba_typ = null;
	/**
	 * Before/after payment closing day type name 支払締日前後区分名.<p>
	 *
	 */
	public MCTextField Base_pay_cl_ba_typ_nm = null;
	public MCLabel Base_stk_cl_cal_cd_Label = null;
	/**
	 * Inventory closing calendar cd. 在庫締カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_stk_cl_cal_cd = null;
	/**
	 * Inventory closing calendar name 在庫締カレンダ名.<p>
	 *
	 */
	public MCTextField Base_stk_cl_cal_nm = null;
	public MCLabel Base_stk_cl_delay_days_Label = null;
	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public MCNumberField Base_stk_cl_delay_days = null;
	public MCLabel Base_stk_cl_ba_typ_Label = null;
	/**
	 * Inventory closing day before/after type 在庫締日前後区分.<p>
	 *
	 */
	public MCTextComboBox Base_stk_cl_ba_typ = null;
	/**
	 * Inventory closing day before/after type name 在庫締日前後区分名.<p>
	 *
	 */
	public MCTextField Base_stk_cl_ba_typ_nm = null;
	public MCLabel Base_bill_cl_cal_cd_Label = null;
	/**
	 * Billing closing calendar cd. 請求締カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_bill_cl_cal_cd = null;
	/**
	 * Billing closing calendar name 請求締カレンダ名.<p>
	 *
	 */
	public MCTextField Base_bill_cl_cal_nm = null;
	public MCLabel Base_pay_schd_cl_cal_cd_Label = null;
	/**
	 * Payment schedule closing calendar cd. 支払予定締カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_pay_schd_cl_cal_cd = null;
	/**
	 * Payment schedule closing calendar name 支払予定締カレンダ名.<p>
	 *
	 */
	public MCTextField Base_pay_schd_cl_cal_nm = null;
	/**
	 * Convert at exchange rate upon billing 請求時為替レート換算.<p>
	 *
	 */
	public MCCheckBox Base_bill_xrate_conv_flg = null;
	/**
	 * Convert at exchange rate upon payment collation 支払照合時為替レート換算.<p>
	 *
	 */
	public MCCheckBox Base_pay_xrate_conv_flg = null;
	public MCLabel Base_sls_xrate_cd_Label = null;
	/**
	 * Sales exchange rate cd. 売上為替レートＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_sls_xrate_cd = null;
	/**
	 * Sales exchange rate name 売上為替レート名.<p>
	 *
	 */
	public MCTextField Base_sls_xrate_nm = null;
	public MCLabel Base_purc_xrate_cd_Label = null;
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_purc_xrate_cd = null;
	/**
	 * Purchase exchange rate name 仕入為替レート名.<p>
	 *
	 */
	public MCTextField Base_purc_xrate_nm = null;
	public MCLabel Base_prov_xrate_cd_Label = null;
	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_prov_xrate_cd = null;
	/**
	 * Supply exchange rate name 支給為替レート名.<p>
	 *
	 */
	public MCTextField Base_prov_xrate_nm = null;
	public MCLabel Base_bill_xrate_cd_Label = null;
	/**
	 * Billing exchange rate cd. 請求為替レートＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_bill_xrate_cd = null;
	/**
	 * Billing exchange rate name 請求為替レート名.<p>
	 *
	 */
	public MCTextField Base_bill_xrate_nm = null;
	public MCLabel Base_pay_xrate_cd_Label = null;
	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_pay_xrate_cd = null;
	/**
	 * Payment collation exchange rate name 支払照合為替レート名.<p>
	 *
	 */
	public MCTextField Base_pay_xrate_nm = null;
	/**
	 * January 1月.<p>
	 *
	 */
	public MCCheckBox Base_mon01_xrate_rev_flg = null;
	/**
	 * February 2月.<p>
	 *
	 */
	public MCCheckBox Base_mon02_xrate_rev_flg = null;
	/**
	 * March 3月.<p>
	 *
	 */
	public MCCheckBox Base_mon03_xrate_rev_flg = null;
	/**
	 * April 4月.<p>
	 *
	 */
	public MCCheckBox Base_mon04_xrate_rev_flg = null;
	/**
	 * May 5月.<p>
	 *
	 */
	public MCCheckBox Base_mon05_xrate_rev_flg = null;
	/**
	 * June 6月.<p>
	 *
	 */
	public MCCheckBox Base_mon06_xrate_rev_flg = null;
	/**
	 * July 7月.<p>
	 *
	 */
	public MCCheckBox Base_mon07_xrate_rev_flg = null;
	/**
	 * August 8月.<p>
	 *
	 */
	public MCCheckBox Base_mon08_xrate_rev_flg = null;
	/**
	 * September 9月.<p>
	 *
	 */
	public MCCheckBox Base_mon09_xrate_rev_flg = null;
	/**
	 * October 10月.<p>
	 *
	 */
	public MCCheckBox Base_mon10_xrate_rev_flg = null;
	/**
	 * November 11月.<p>
	 *
	 */
	public MCCheckBox Base_mon11_xrate_rev_flg = null;
	/**
	 * December 12月.<p>
	 *
	 */
	public MCCheckBox Base_mon12_xrate_rev_flg = null;
	public MCLabel Base_sls_upri_req_typ_Label = null;
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public MCTextComboBox Base_sls_upri_req_typ = null;
	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public MCTextField Base_sls_upri_req_typ_nm = null;
	public MCLabel Base_sls_basis_typ_Label = null;
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public MCTextComboBox Base_sls_basis_typ = null;
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public MCTextField Base_sls_basis_typ_nm = null;
	public MCLabel Base_bill_basis_typ_Label = null;
	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public MCTextComboBox Base_bill_basis_typ = null;
	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public MCTextField Base_bill_basis_typ_nm = null;
	public MCLabel Base_ship_schd_split_typ_Label = null;
	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public MCTextComboBox Base_ship_schd_split_typ = null;
	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public MCTextField Base_ship_schd_split_typ_nm = null;
	public MCLabel Base_xfr_stk_mng_typ_Label = null;
	/**
	 * In-transit inventory controlling site type 積送在庫管轄区分.<p>
	 *
	 */
	public MCTextComboBox Base_xfr_stk_mng_typ = null;
	/**
	 * In-transit inventory controlling site type name 積送在庫管轄区分名.<p>
	 *
	 */
	public MCTextField Base_xfr_stk_mng_typ_nm = null;
	public MCLabel Base_sls_bdj_rnd_typ_Label = null;
	/**
	 * Sales budget unit type 販売予算単位区分.<p>
	 *
	 */
	public MCTextComboBox Base_sls_bdj_rnd_typ = null;
	/**
	 * Sales budget unit type name 販売予算単位区分名.<p>
	 *
	 */
	public MCTextField Base_sls_bdj_rnd_typ_nm = null;
	public MCLabel Base_purc_upri_req_typ_Label = null;
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public MCTextComboBox Base_purc_upri_req_typ = null;
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public MCTextField Base_purc_upri_req_typ_nm = null;
	public MCLabel Base_outsrc_upri_typ_Label = null;
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCTextComboBox Base_outsrc_upri_typ = null;
	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public MCTextField Base_outsrc_upri_typ_nm = null;
	public MCLabel Base_xrate_rnd_typ_Label = null;
	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Base_xrate_rnd_typ = null;
	/**
	 * Exchange rounding type name 為替端数処理区分名.<p>
	 *
	 */
	public MCTextField Base_xrate_rnd_typ_nm = null;
	public MCLabel Base_setoff_tax_rnd_typ_Label = null;
	/**
	 * Offset tax rounding type 相殺税額端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Base_setoff_tax_rnd_typ = null;
	/**
	 * Offset tax amount rounding type 相殺税額端数処理区分名.<p>
	 *
	 */
	public MCTextField Base_setoff_tax_rnd_typ_nm = null;
	public MCLabel Base_com_paid_tax_rnd_typ_Label = null;
	/**
	 * Rounding type (Payment fee tax) 支払手数料税額端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Base_com_paid_tax_rnd_typ = null;
	/**
	 * Payment fee rounding type name 支払手数料税額端数処理区分名.<p>
	 *
	 */
	public MCTextField Base_com_paid_tax_rnd_typ_nm = null;
	public MCLabel Base_wtax_rnd_typ_Label = null;
	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Base_wtax_rnd_typ = null;
	/**
	 * Withholding tax amount rounding type 源泉税額端数処理区分名.<p>
	 *
	 */
	public MCTextField Base_wtax_rnd_typ_nm = null;
	public MCLabel Base_gm_std_upri_typ_Label = null;
	/**
	 * Standard unit cost acquisition type (For gross profit calculation) 標準単価取得区分（粗利計算用）.<p>
	 *
	 */
	public MCTextComboBox Base_gm_std_upri_typ = null;
	/**
	 * Standard unit cost acquisition type name (For gross profit calculation) 標準単価取得区分名（粗利計算用）.<p>
	 *
	 */
	public MCTextField Base_gm_std_upri_typ_nm = null;
	public MCLabel Base_stk_std_upri_typ_Label = null;
	/**
	 * Standard unit cost acquisition type (For inventory valuation) 標準単価取得区分（在庫評価用）.<p>
	 *
	 */
	public MCTextComboBox Base_stk_std_upri_typ = null;
	/**
	 * Standard unit cost acquisition type name (For inventory valuation) 標準単価取得区分名（在庫評価用）.<p>
	 *
	 */
	public MCTextField Base_stk_std_upri_typ_nm = null;
	public MCLabel Base_stk_amt_rnd_typ_Label = null;
	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Base_stk_amt_rnd_typ = null;
	/**
	 * Inventory amount rounding type 在庫金額端数処理区分名.<p>
	 *
	 */
	public MCTextField Base_stk_amt_rnd_typ_nm = null;
	public MCLabel Base_stk_amt_dec_place_Label = null;
	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Base_stk_amt_dec_place = null;
	public MCLabel Base_po_print_cd_Label = null;
	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_po_print_cd = null;
	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public MCTextField Base_po_print_nm = null;
	public MCLabel Base_stk_lst_cnf_num_Label = null;
	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public MCNumberField Base_stk_lst_cnf_num = null;
	public MCLabel Base_stk_lst_limit_num_Label = null;
	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public MCNumberField Base_stk_lst_limit_num = null;
	public MCLabel Base_early_ship_dt_add_days_Label = null;
	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public MCNumberField Base_early_ship_dt_add_days = null;
	public MCLabel Base_ac_slip_digit_Label = null;
	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public MCNumberField Base_ac_slip_digit = null;
	/**
	 * Debit and credit details number 貸借明細番号.<p>
	 *
	 */
	public MCCheckBox Base_ac_slip_seq_flg = null;
	public MCLabel Base_rpt_strg_ext_sys_cd_Label = null;
	/**
	 * Report storage system cd. 帳票保存システムＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_rpt_strg_ext_sys_cd = null;
	/**
	 * Report storage system name 帳票保存システム名.<p>
	 *
	 */
	public MCTextField Base_rpt_strg_ext_sys_nm = null;
	public MCLabel Base_cst_prnt_typ_Label = null;
	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public MCTextComboBox Base_cst_prnt_typ = null;
	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public MCTextField Base_cst_prnt_typ_nm = null;
	public MCLabel Base_acst_prnt_typ_Label = null;
	/**
	 * Report issue type (AR customer) 帳票発行区分（売掛先）.<p>
	 *
	 */
	public MCTextComboBox Base_acst_prnt_typ = null;
	/**
	 * Report issue type name (AR customer) 帳票発行区分名（売掛先）.<p>
	 *
	 */
	public MCTextField Base_acst_prnt_typ_nm = null;
	public MCLabel Base_bcst_prnt_typ_Label = null;
	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public MCTextComboBox Base_bcst_prnt_typ = null;
	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public MCTextField Base_bcst_prnt_typ_nm = null;
	public MCLabel Base_rcst_prnt_typ_Label = null;
	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public MCTextComboBox Base_rcst_prnt_typ = null;
	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public MCTextField Base_rcst_prnt_typ_nm = null;
	public MCLabel Base_dlv_prnt_typ_Label = null;
	/**
	 * Report issue type (Delivery destination) 帳票発行区分（納品先）.<p>
	 *
	 */
	public MCTextComboBox Base_dlv_prnt_typ = null;
	/**
	 * Report issue type name (Delivery destination) 帳票発行区分名（納品先）.<p>
	 *
	 */
	public MCTextField Base_dlv_prnt_typ_nm = null;
	public MCLabel Base_sppl_prnt_typ_Label = null;
	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public MCTextComboBox Base_sppl_prnt_typ = null;
	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public MCTextField Base_sppl_prnt_typ_nm = null;
	public MCLabel Base_asppl_prnt_typ_Label = null;
	/**
	 * Report issue type (AP supplier) 帳票発行区分（買掛先）.<p>
	 *
	 */
	public MCTextComboBox Base_asppl_prnt_typ = null;
	/**
	 * Report issue type name (AP supplier) 帳票発行区分名（買掛先）.<p>
	 *
	 */
	public MCTextField Base_asppl_prnt_typ_nm = null;
	public MCLabel Base_bsppl_prnt_typ_Label = null;
	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public MCTextComboBox Base_bsppl_prnt_typ = null;
	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public MCTextField Base_bsppl_prnt_typ_nm = null;
	public MCLabel Base_psppl_prnt_typ_Label = null;
	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public MCTextComboBox Base_psppl_prnt_typ = null;
	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public MCTextField Base_psppl_prnt_typ_nm = null;
	public MCLabel Base_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Base_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Base_ins_usr_nm = null;
	public MCLabel Base_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Base_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Base_ins_func_nm = null;
	public MCLabel Base_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Base_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Base_upd_usr_nm = null;
	public MCLabel Base_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Base_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Base_upd_func_nm = null;
	public MCLabel Base_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Base_ins_ts = null;
	public MCLabel Base_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Base_upd_ts = null;
	public MCLabel Base_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Base_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Base_upd_cntr = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0020.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_cd = null;
	/**
	 * Company alias 1 会社別名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_alt_nm1 = null;
	/**
	 * Company alias 2 会社別名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_alt_nm2 = null;
	/**
	 * Company alias 3 会社別名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_alt_nm3 = null;
	/**
	 * Company alias 4 会社別名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_alt_nm4 = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fax = null;
	/**
	 * Representative name 代表者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_repl_nm = null;
	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ein = null;
	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_biz_co_no = null;
	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_co_cd = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_cd = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_area_cd = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_cd = null;
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_cd = null;
	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_st_mon = null;
	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt_switch_time = null;
	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_cl_day = null;
	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_cl_mon_base = null;
	/**
	 * Standard calendar cd. 標準カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_cal_cd = null;
	/**
	 * Billing closing calendar cd. 請求締カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_cl_cal_cd = null;
	/**
	 * AR not used 債権不使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_no_use_flg = null;
	/**
	 * AP not used 債務不使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_no_use_flg = null;
	/**
	 * Temporary AP use 暫定買掛使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_temp_ap_use_flg = null;
	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_cl_flg = null;
	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_cl_flg = null;
	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_cl_flg = null;
	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_cl_flg = null;
	/**
	 * Inventory closing calendar cd. 在庫締カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_cl_cal_cd = null;
	/**
	 * Sales closing calendar cd. 売上締カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_cl_cal_cd = null;
	/**
	 * Payment received closing calendar cd. 入金締カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_cl_cal_cd = null;
	/**
	 * Purchase closing calendar cd. 仕入締カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_cl_cal_cd = null;
	/**
	 * Payment closing calendar cd. 支払締カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_cl_cal_cd = null;
	/**
	 * Payment schedule closing calendar cd. 支払予定締カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_schd_cl_cal_cd = null;
	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_cl_delay_days = null;
	/**
	 * Inventory closing day before/after type 在庫締日前後区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_cl_ba_typ = null;
	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_cl_delay_days = null;
	/**
	 * Sales closing day before/after type 売上締日前後区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_cl_ba_typ = null;
	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_cl_delay_days = null;
	/**
	 * Payment received closing day before/after type 入金締日前後区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_cl_ba_typ = null;
	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_cl_delay_days = null;
	/**
	 * Purchase closing day before/after type 仕入締日前後区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_cl_ba_typ = null;
	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_cl_delay_days = null;
	/**
	 * Payment closing day before/after type 支払締日前後区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_cl_ba_typ = null;
	/**
	 * Convert at exchange rate upon billing 請求時為替レート換算.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_xrate_conv_flg = null;
	/**
	 * Convert at exchange rate upon payment collation 支払照合時為替レート換算.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_xrate_conv_flg = null;
	/**
	 * Sales exchange rate cd. 売上為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_xrate_cd = null;
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_xrate_cd = null;
	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_xrate_cd = null;
	/**
	 * Billing exchange rate cd. 請求為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_xrate_cd = null;
	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_xrate_cd = null;
	/**
	 * January １月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon01_xrate_rev_flg = null;
	/**
	 * February ２月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon02_xrate_rev_flg = null;
	/**
	 * March ３月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon03_xrate_rev_flg = null;
	/**
	 * April ４月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon04_xrate_rev_flg = null;
	/**
	 * May ５月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon05_xrate_rev_flg = null;
	/**
	 * June ６月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon06_xrate_rev_flg = null;
	/**
	 * July ７月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon07_xrate_rev_flg = null;
	/**
	 * August ８月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon08_xrate_rev_flg = null;
	/**
	 * September ９月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon09_xrate_rev_flg = null;
	/**
	 * October １０月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon10_xrate_rev_flg = null;
	/**
	 * November １１月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon11_xrate_rev_flg = null;
	/**
	 * December １２月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon12_xrate_rev_flg = null;
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_req_typ = null;
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_req_typ = null;
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_upri_typ = null;
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_basis_typ = null;
	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_basis_typ = null;
	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_split_typ = null;
	/**
	 * In-transit inventory controlled site type 積送在庫管轄先区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_stk_mng_typ = null;
	/**
	 * Offset tax rounding type 相殺税額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_setoff_tax_rnd_typ = null;
	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_rnd_typ = null;
	/**
	 * Rounding type (Payment fee tax) 支払手数料税額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_com_paid_tax_rnd_typ = null;
	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rnd_typ = null;
	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_amt_rnd_typ = null;
	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_amt_dec_place = null;
	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_print_cd = null;
	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_lst_cnf_num = null;
	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_lst_limit_num = null;
	/**
	 * Standard unit cost acquisition type (For gross profit calculation) 標準単価取得区分（粗利計算用）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gm_std_upri_typ = null;
	/**
	 * Standard unit cost acquisition type (For inventory valuation) 標準単価取得区分（在庫評価用）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_std_upri_typ = null;
	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_early_ship_dt_add_days = null;
	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_slip_digit = null;
	/**
	 * Debit and credit details number 貸借明細番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_slip_seq_flg = null;
	/**
	 * Sales budget unit type 販売予算単位区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_bdj_rnd_typ = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_nm = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_area_nm = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_nm = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_nm = null;
	/**
	 * Standard calendar name 標準カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_cal_nm = null;
	/**
	 * Inventory closing calendar name 在庫締カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_cl_cal_nm = null;
	/**
	 * Sales closing calendar name 売上締カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_cl_cal_nm = null;
	/**
	 * Billing closing calendar name 請求締カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_cl_cal_nm = null;
	/**
	 * Payment received closing calendar name 入金締カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_cl_cal_nm = null;
	/**
	 * Purchase closing calendar name 仕入締カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_cl_cal_nm = null;
	/**
	 * Payment closing calendar name 支払締カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_cl_cal_nm = null;
	/**
	 * Payment schedule closing calendar name 支払予定締カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_schd_cl_cal_nm = null;
	/**
	 * Sales exchange rate name 売上為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_xrate_nm = null;
	/**
	 * Purchase exchange rate name 仕入為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_xrate_nm = null;
	/**
	 * Supply exchange rate name 支給為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_xrate_nm = null;
	/**
	 * Billing exchange rate name 請求為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_xrate_nm = null;
	/**
	 * Payment collation exchange rate name 支払照合為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_xrate_nm = null;
	/**
	 * Inventory closing day before/after type name 在庫締日前後区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_cl_ba_typ_nm = null;
	/**
	 * Before/after sales closing day type name 売上締日前後区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_cl_ba_typ_nm = null;
	/**
	 * Before/after payment received closing day type name 入金締日前後区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_cl_ba_typ_nm = null;
	/**
	 * Before/after purchase closing day type name 仕入締日前後区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_cl_ba_typ_nm = null;
	/**
	 * Before/after payment closing day type name 支払締日前後区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_cl_ba_typ_nm = null;
	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_req_typ_nm = null;
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_req_typ_nm = null;
	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_upri_typ_nm = null;
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_basis_typ_nm = null;
	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_basis_typ_nm = null;
	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_split_typ_nm = null;
	/**
	 * In-transit inventory controlling site type name 積送在庫管轄区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_stk_mng_typ_nm = null;
	/**
	 * Exchange rounding type name 為替端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_rnd_typ_nm = null;
	/**
	 * Offset tax amount rounding type 相殺税額端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_setoff_tax_rnd_typ_nm = null;
	/**
	 * Payment fee rounding type name 支払手数料税額端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_com_paid_tax_rnd_typ_nm = null;
	/**
	 * Withholding tax amount rounding type 源泉税額端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rnd_typ_nm = null;
	/**
	 * Inventory amount rounding type 在庫金額端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_amt_rnd_typ_nm = null;
	/**
	 * Sales budget unit type name 販売予算単位区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_bdj_rnd_typ_nm = null;
	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_print_nm = null;
	/**
	 * Standard unit cost acquisition type name (For gross profit calculation) 標準単価取得区分名（粗利計算用）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gm_std_upri_typ_nm = null;
	/**
	 * Standard unit cost acquisition type name (For inventory valuation) 標準単価取得区分名（在庫評価用）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_std_upri_typ_nm = null;
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Report storage system cd. 帳票保存システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_strg_ext_sys_cd = null;
	/**
	 * Report storage system name 帳票保存システム名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_strg_ext_sys_nm = null;
	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_prnt_typ = null;
	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_prnt_typ_nm = null;
	/**
	 * Report issue type (AR customer) 帳票発行区分（売掛先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acst_prnt_typ = null;
	/**
	 * Report issue type name (AR customer) 帳票発行区分名（売掛先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acst_prnt_typ_nm = null;
	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bcst_prnt_typ = null;
	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bcst_prnt_typ_nm = null;
	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcst_prnt_typ = null;
	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcst_prnt_typ_nm = null;
	/**
	 * Report issue type (Delivery destination) 帳票発行区分（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_prnt_typ = null;
	/**
	 * Report issue type name (Delivery destination) 帳票発行区分名（納品先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_prnt_typ_nm = null;
	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_prnt_typ = null;
	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_prnt_typ_nm = null;
	/**
	 * Report issue type (AP supplier) 帳票発行区分（買掛先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asppl_prnt_typ = null;
	/**
	 * Report issue type name (AP supplier) 帳票発行区分名（買掛先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asppl_prnt_typ_nm = null;
	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_prnt_typ = null;
	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_prnt_typ_nm = null;
	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_psppl_prnt_typ = null;
	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_psppl_prnt_typ_nm = null;
	// [SubTab]ブロック関連のField定義
	public MCPanel SubTabPanel = null;
	public MCTabbedPane SubTabTab = null;
	// [SubTab]ブロックの項目のField定義
	// [SubPanel]ブロック関連のField定義
	public MCPanel SubPanelPanel = null;
	// [SubPanel]ブロックの項目のField定義
	// [DtlSub]ブロック関連のField定義
	public MCPanel DtlSubPanel = null;
	public MCScrollPane DtlSubScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0020.DtlSubR> DtlSubTable = null;
	// [DtlSub]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_check = null;
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_co_cd = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D DtlSub_dt_p_PPanel;
	public MCColumnConfig columnDtlSub_st_dt_key;// [DtlSub]の[dt_p.st_dt_key]を[columnDtlSub_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnDtlSub_st_dt;// [DtlSub]の[dt_p.st_dt]を[columnDtlSub_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtlSub_end_dt;// [DtlSub]の[dt_p.end_dt]を[columnDtlSub_end_dt]としてエイリアス定義。
	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_sls_tax_cd = null;
	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_sls_tax_nm = null;
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_purc_tax_cd = null;
	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_purc_tax_nm = null;
	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_prov_tax_cd = null;
	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_prov_tax_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSub_upd_srv_req_no = null;
	// [DtlSubBtn]ブロック関連のField定義
	public MCPanel DtlSubBtnPanel = null;
	// [DtlSubBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlSubBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlSubBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlSubBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlSubBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlSubBtn_rcopy = null;
	// [LclPanel]ブロック関連のField定義
	public MCPanel LclPanelPanel = null;
	// [LclPanel]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0020.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_co_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_nm = null;
	/**
	 * Company alias 1 会社別名１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_co_alt_nm1 = null;
	/**
	 * Company alias 2 会社別名２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_co_alt_nm2 = null;
	/**
	 * Company alias 3 会社別名３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_co_alt_nm3 = null;
	/**
	 * Company alias 4 会社別名４.<p>
	 *
	 */
	public MCColumnConfig columnLcl_co_alt_nm4 = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnLcl_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnLcl_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_fax = null;
	/**
	 * Representative name 代表者名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_co_repl_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_srv_req_no = null;
	// [LclBtn]ブロック関連のField定義
	public MCPanel LclBtnPanel = null;
	// [LclBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtn_rcopy = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [UPD_ADMIN]モードを表す定数 */
	public static final String UPD_ADMIN = "UPD_ADMIN";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, UPD_ADMIN, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0020_Srch01]のCallerの作成 */
	protected MABCP_CoReg_MC.MA_MABCL0020_Srch01Caller createMA_MABCL0020_Srch01() {
		MABCP_CoReg_MC.MA_MABCL0020_Srch01Caller<MABCP_CoReg, MA_MABCL0020_Srch01Bridge>
		caller = ((MABCP_CoReg_MC)this).new MA_MABCL0020_Srch01Caller<MABCP_CoReg, MA_MABCL0020_Srch01Bridge>(
					(MABCP_CoReg)this, new MA_MABCL0020_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0020_Srch01]の呼び出し */
	protected void callMA_MABCL0020_Srch01() {
		MCCaller caller = createMA_MABCL0020_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0020_Upd01]のCallerの作成 */
	protected MABCP_CoReg_MC.MA_MABCL0020_Upd01Caller createMA_MABCL0020_Upd01() {
		MABCP_CoReg_MC.MA_MABCL0020_Upd01Caller<MABCP_CoReg, MA_MABCL0020_Upd01Bridge>
		caller = ((MABCP_CoReg_MC)this).new MA_MABCL0020_Upd01Caller<MABCP_CoReg, MA_MABCL0020_Upd01Bridge>(
					(MABCP_CoReg)this, new MA_MABCL0020_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0020_Upd01]の呼び出し */
	protected void callMA_MABCL0020_Upd01() {
		MCCaller caller = createMA_MABCL0020_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0020.CndR aCndR;
	/** [Base]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0020.BaseR aBaseR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0020.DtlR> aDtlL;
	/** [DtlSub]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0020.DtlSubR> aDtlSubL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0020.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0020.LclR> aLclAllL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0020.CndR createCndR() {
		return mcframe.clientMABC.MABCP0020.CndR.create();
	}

	/**
	 * 項目コピーによってaBaseRを設定します。
	 *
	 * aBaseRのインスタンスは変更されません。
	 *
	 * @param row BaseR
	 */
	public void setBaseR(mcframe.clientMABC.MABCP0020.BaseR row) {
		if (row != null) {
			MCRow.copyall(getBaseR(), row);
		}
	}

	/**
	 * [Base]ブロックのコンテナaBaseRを返します。
	 *
	 * @return BaseR
	 */
	public mcframe.clientMABC.MABCP0020.BaseR getBaseR() {
		return aBaseR;
	}

	/**
	 * aBaseRを作成します。
	 *
	 * @return BaseR
	 */
	public mcframe.clientMABC.MABCP0020.BaseR createBaseR() {
		return mcframe.clientMABC.MABCP0020.BaseR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0020.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0020.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0020.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0020.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0020.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0020.DtlR.class);
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
	 * コピーによってaDtlSubLを設定します。
	 *
	 * aDtlSubLのインスタンスは変更されません。
	 *
	 * @param dataset DtlSubL
	 */
	public void setDtlSubL(MCList<mcframe.clientMABC.MABCP0020.DtlSubR> aList) {
		if (getDtlSubL() != aList) {
			getDtlSubL().setAll(aList);
		}
	}

	/**
	 * [DtlSub]ブロックのコンテナaDtlSubLを返します。
	 *
	 * @return DtlSubL
	 */
	public MCList<mcframe.clientMABC.MABCP0020.DtlSubR> getDtlSubL() {
		return aDtlSubL;
	}

	/**
	 * aDtlSubRを作成します。
	 *
	 * @return DtlSubR
	 */
	public mcframe.clientMABC.MABCP0020.DtlSubR createDtlSubR() {
		return mcframe.clientMABC.MABCP0020.DtlSubR.create();
	}

	/**
	 * aDtlSubLを作成します。
	 *
	 * @return DtlSubL
	 */
	public MCList<mcframe.clientMABC.MABCP0020.DtlSubR> createDtlSubL() {
		return MCList.create(mcframe.clientMABC.MABCP0020.DtlSubR.class);
	}

	/**
	 * DtlSubTableを初期化します。
	 */
	protected void createDtlSubTable(){
		if(DtlSubTable == null){
			DtlSubTable = beansFactory.createTable2("DtlSub.table");
		}
	}

	/**
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABC.MABCP0020.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0020.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0020.LclR createLclR() {
		return mcframe.clientMABC.MABCP0020.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0020.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0020.LclR.class);
	}

	/**
	 * LclTableを初期化します。
	 */
	protected void createLclTable(){
		if(LclTable == null){
			LclTable = beansFactory.createTable2("Lcl.table");
		}
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP0020.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0020.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP0020.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP0020.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0020.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0020.LclR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBaseR())) ret.add(getBaseR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtlSubL())) ret.add(getDtlSubL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getLclAllL())) ret.add(getLclAllL());
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
		if(aCnt == getBaseR()) return "Base";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtlSubL()) return "DtlSub";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getLclAllL()) return "LclAll";
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
		if(bId.equals("Base")) return getBaseR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("DtlSub")) return getDtlSubL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("LclAll")) return getLclAllL();
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
		ret.add(TabPanel);
		ret.add(BtnPanel);
		ret.add(Upd1Panel);
		ret.add(Upd2Panel);
		ret.add(Upd21Panel);
		ret.add(Upd22Panel);
		ret.add(Upd3Panel);
		ret.add(Upd4Panel);
		ret.add(BasePanel);
		ret.add(DtlPanel);
		ret.add(SubTabPanel);
		ret.add(SubPanelPanel);
		ret.add(DtlSubPanel);
		ret.add(DtlSubBtnPanel);
		ret.add(LclPanelPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_CoReg_MC_A() {
		aCndR = createCndR();
		aBaseR = createBaseR();
		aDtlL = createDtlL();
		aDtlSubL = createDtlSubL();
		aLclL = createLclL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_CoReg_MC_A(String name) {
		aCndR = createCndR();
		aBaseR = createBaseR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtlSubL = createDtlSubL();
		createDtlSubTable();
		DtlSubTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_CoReg_MC.jbCreateScreenOpe((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateCnd((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateUpd1((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateUpd2((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateUpd21((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateUpd22((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateUpd3((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateUpd4((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateBase((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateDtl((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateSubTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateSubPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateDtlSub((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateDtlSubBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateLclPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateLcl((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbCreateLclBtn((MABCP_CoReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_CoReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_CoReg p) {
	}

	/**
	 * [Tab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab(MABCP_CoReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_CoReg p) {
	}

	/**
	 * [Upd1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpd1(MABCP_CoReg p) {
	}

	/**
	 * [Upd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpd2(MABCP_CoReg p) {
	}

	/**
	 * [Upd21]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpd21(MABCP_CoReg p) {
	}

	/**
	 * [Upd22]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpd22(MABCP_CoReg p) {
	}

	/**
	 * [Upd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpd3(MABCP_CoReg p) {
	}

	/**
	 * [Upd4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpd4(MABCP_CoReg p) {
	}

	/**
	 * [Base]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase(MABCP_CoReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_CoReg p) {
	}

	/**
	 * [SubTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSubTab(MABCP_CoReg p) {
	}

	/**
	 * [SubPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSubPanel(MABCP_CoReg p) {
	}

	/**
	 * [DtlSub]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlSub(MABCP_CoReg p) {
		p.DtlSub_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABC.MABCP0020.DtlSubR.$dt_p);
		p.DtlSub_dt_p_PPanel.setName("DtlSub.dt_p");
		p.columnDtlSub_st_dt_key = p.DtlSub_dt_p_PPanel.columnDt_st_dt_key;
		p.columnDtlSub_st_dt_key.addAliasName("DtlSub.st_dt_key", p);
		p.columnDtlSub_st_dt = p.DtlSub_dt_p_PPanel.columnDt_st_dt;
		p.columnDtlSub_st_dt.addAliasName("DtlSub.st_dt", p);
		p.columnDtlSub_end_dt = p.DtlSub_dt_p_PPanel.columnDt_end_dt;
		p.columnDtlSub_end_dt.addAliasName("DtlSub.end_dt", p);
	}

	/**
	 * [DtlSubBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlSubBtn(MABCP_CoReg p) {
	}

	/**
	 * [LclPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclPanel(MABCP_CoReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_CoReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_CoReg p) {
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

	
	/** [Base_cntry_cd_ListPutter]の定義 */
	private MCListPutter Base_cntry_cd_p = null;

	/**
	 * [Base_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_cntry_cd_ListPutter() {
		if (Base_cntry_cd_p == null) {
			Base_cntry_cd_p = createBase_cntry_cd_ListPutter(Base_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return Base_cntry_cd_p;
	}
	
	
	/** [Base_area_cd_ListPutter]の定義 */
	private MCListPutter Base_area_cd_p = null;

	/**
	 * [Base_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_area_cd_ListPutter() {
		if (Base_area_cd_p == null) {
			Base_area_cd_p = createBase_area_cd_ListPutter(Base_area_cd, "area_cd", "area_nm");

		}
		return Base_area_cd_p;
	}
	
	
	/** [Base_base_cur_cd_ListPutter]の定義 */
	private MCListPutter Base_base_cur_cd_p = null;

	/**
	 * [Base_base_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_base_cur_cd_ListPutter() {
		if (Base_base_cur_cd_p == null) {
			Base_base_cur_cd_p = createBase_base_cur_cd_ListPutter(Base_base_cur_cd, "base_cur_cd", "base_cur_nm");

		}
		return Base_base_cur_cd_p;
	}
	
	
	/** [Base_ptax_cur_cd_ListPutter]の定義 */
	private MCListPutter Base_ptax_cur_cd_p = null;

	/**
	 * [Base_ptax_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_ptax_cur_cd_ListPutter() {
		if (Base_ptax_cur_cd_p == null) {
			Base_ptax_cur_cd_p = createBase_ptax_cur_cd_ListPutter(Base_ptax_cur_cd, "ptax_cur_cd", "ptax_cur_nm");

		}
		return Base_ptax_cur_cd_p;
	}
	
	
	/** [Base_std_cal_cd_ListPutter]の定義 */
	private MCListPutter Base_std_cal_cd_p = null;

	/**
	 * [Base_std_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_std_cal_cd_ListPutter() {
		if (Base_std_cal_cd_p == null) {
			Base_std_cal_cd_p = createBase_std_cal_cd_ListPutter(Base_std_cal_cd, "std_cal_cd", "std_cal_nm");

		}
		return Base_std_cal_cd_p;
	}
	
	
	/** [Base_sls_cl_cal_cd_ListPutter]の定義 */
	private MCListPutter Base_sls_cl_cal_cd_p = null;

	/**
	 * [Base_sls_cl_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_sls_cl_cal_cd_ListPutter() {
		if (Base_sls_cl_cal_cd_p == null) {
			Base_sls_cl_cal_cd_p = createBase_sls_cl_cal_cd_ListPutter(Base_sls_cl_cal_cd, "sls_cl_cal_cd", "sls_cl_cal_nm");

		}
		return Base_sls_cl_cal_cd_p;
	}
	
	
	/** [Base_sls_cl_ba_typ_ListPutter]の定義 */
	private MCListPutter Base_sls_cl_ba_typ_p = null;

	/**
	 * [Base_sls_cl_ba_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sls_cl_ba_typ_ListPutter() {
		if (Base_sls_cl_ba_typ_p == null) {
			Base_sls_cl_ba_typ_p = createBase_sls_cl_ba_typ_ListPutter(Base_sls_cl_ba_typ, "sls_cl_ba_typ", "sls_cl_ba_typ_nm");

		}
		return Base_sls_cl_ba_typ_p;
	}
	
	
	/** [Base_rcv_cl_cal_cd_ListPutter]の定義 */
	private MCListPutter Base_rcv_cl_cal_cd_p = null;

	/**
	 * [Base_rcv_cl_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_rcv_cl_cal_cd_ListPutter() {
		if (Base_rcv_cl_cal_cd_p == null) {
			Base_rcv_cl_cal_cd_p = createBase_rcv_cl_cal_cd_ListPutter(Base_rcv_cl_cal_cd, "rcv_cl_cal_cd", "rcv_cl_cal_nm");

		}
		return Base_rcv_cl_cal_cd_p;
	}
	
	
	/** [Base_rcv_cl_ba_typ_ListPutter]の定義 */
	private MCListPutter Base_rcv_cl_ba_typ_p = null;

	/**
	 * [Base_rcv_cl_ba_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_rcv_cl_ba_typ_ListPutter() {
		if (Base_rcv_cl_ba_typ_p == null) {
			Base_rcv_cl_ba_typ_p = createBase_rcv_cl_ba_typ_ListPutter(Base_rcv_cl_ba_typ, "rcv_cl_ba_typ", "rcv_cl_ba_typ_nm");

		}
		return Base_rcv_cl_ba_typ_p;
	}
	
	
	/** [Base_purc_cl_cal_cd_ListPutter]の定義 */
	private MCListPutter Base_purc_cl_cal_cd_p = null;

	/**
	 * [Base_purc_cl_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_purc_cl_cal_cd_ListPutter() {
		if (Base_purc_cl_cal_cd_p == null) {
			Base_purc_cl_cal_cd_p = createBase_purc_cl_cal_cd_ListPutter(Base_purc_cl_cal_cd, "purc_cl_cal_cd", "purc_cl_cal_nm");

		}
		return Base_purc_cl_cal_cd_p;
	}
	
	
	/** [Base_purc_cl_ba_typ_ListPutter]の定義 */
	private MCListPutter Base_purc_cl_ba_typ_p = null;

	/**
	 * [Base_purc_cl_ba_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_purc_cl_ba_typ_ListPutter() {
		if (Base_purc_cl_ba_typ_p == null) {
			Base_purc_cl_ba_typ_p = createBase_purc_cl_ba_typ_ListPutter(Base_purc_cl_ba_typ, "purc_cl_ba_typ", "purc_cl_ba_typ_nm");

		}
		return Base_purc_cl_ba_typ_p;
	}
	
	
	/** [Base_pay_cl_cal_cd_ListPutter]の定義 */
	private MCListPutter Base_pay_cl_cal_cd_p = null;

	/**
	 * [Base_pay_cl_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_pay_cl_cal_cd_ListPutter() {
		if (Base_pay_cl_cal_cd_p == null) {
			Base_pay_cl_cal_cd_p = createBase_pay_cl_cal_cd_ListPutter(Base_pay_cl_cal_cd, "pay_cl_cal_cd", "pay_cl_cal_nm");

		}
		return Base_pay_cl_cal_cd_p;
	}
	
	
	/** [Base_pay_cl_ba_typ_ListPutter]の定義 */
	private MCListPutter Base_pay_cl_ba_typ_p = null;

	/**
	 * [Base_pay_cl_ba_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_pay_cl_ba_typ_ListPutter() {
		if (Base_pay_cl_ba_typ_p == null) {
			Base_pay_cl_ba_typ_p = createBase_pay_cl_ba_typ_ListPutter(Base_pay_cl_ba_typ, "pay_cl_ba_typ", "pay_cl_ba_typ_nm");

		}
		return Base_pay_cl_ba_typ_p;
	}
	
	
	/** [Base_stk_cl_cal_cd_ListPutter]の定義 */
	private MCListPutter Base_stk_cl_cal_cd_p = null;

	/**
	 * [Base_stk_cl_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_stk_cl_cal_cd_ListPutter() {
		if (Base_stk_cl_cal_cd_p == null) {
			Base_stk_cl_cal_cd_p = createBase_stk_cl_cal_cd_ListPutter(Base_stk_cl_cal_cd, "stk_cl_cal_cd", "stk_cl_cal_nm");

		}
		return Base_stk_cl_cal_cd_p;
	}
	
	
	/** [Base_stk_cl_ba_typ_ListPutter]の定義 */
	private MCListPutter Base_stk_cl_ba_typ_p = null;

	/**
	 * [Base_stk_cl_ba_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_stk_cl_ba_typ_ListPutter() {
		if (Base_stk_cl_ba_typ_p == null) {
			Base_stk_cl_ba_typ_p = createBase_stk_cl_ba_typ_ListPutter(Base_stk_cl_ba_typ, "stk_cl_ba_typ", "stk_cl_ba_typ_nm");

		}
		return Base_stk_cl_ba_typ_p;
	}
	
	
	/** [Base_bill_cl_cal_cd_ListPutter]の定義 */
	private MCListPutter Base_bill_cl_cal_cd_p = null;

	/**
	 * [Base_bill_cl_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_bill_cl_cal_cd_ListPutter() {
		if (Base_bill_cl_cal_cd_p == null) {
			Base_bill_cl_cal_cd_p = createBase_bill_cl_cal_cd_ListPutter(Base_bill_cl_cal_cd, "bill_cl_cal_cd", "bill_cl_cal_nm");

		}
		return Base_bill_cl_cal_cd_p;
	}
	
	
	/** [Base_pay_schd_cl_cal_cd_ListPutter]の定義 */
	private MCListPutter Base_pay_schd_cl_cal_cd_p = null;

	/**
	 * [Base_pay_schd_cl_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_pay_schd_cl_cal_cd_ListPutter() {
		if (Base_pay_schd_cl_cal_cd_p == null) {
			Base_pay_schd_cl_cal_cd_p = createBase_pay_schd_cl_cal_cd_ListPutter(Base_pay_schd_cl_cal_cd, "pay_schd_cl_cal_cd", "pay_schd_cl_cal_nm");

		}
		return Base_pay_schd_cl_cal_cd_p;
	}
	
	
	/** [Base_sls_xrate_cd_ListPutter]の定義 */
	private MCListPutter Base_sls_xrate_cd_p = null;

	/**
	 * [Base_sls_xrate_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_sls_xrate_cd_ListPutter() {
		if (Base_sls_xrate_cd_p == null) {
			Base_sls_xrate_cd_p = createBase_sls_xrate_cd_ListPutter(Base_sls_xrate_cd, "sls_xrate_cd", "sls_xrate_nm");

		}
		return Base_sls_xrate_cd_p;
	}
	
	
	/** [Base_purc_xrate_cd_ListPutter]の定義 */
	private MCListPutter Base_purc_xrate_cd_p = null;

	/**
	 * [Base_purc_xrate_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_purc_xrate_cd_ListPutter() {
		if (Base_purc_xrate_cd_p == null) {
			Base_purc_xrate_cd_p = createBase_purc_xrate_cd_ListPutter(Base_purc_xrate_cd, "purc_xrate_cd", "purc_xrate_nm");

		}
		return Base_purc_xrate_cd_p;
	}
	
	
	/** [Base_prov_xrate_cd_ListPutter]の定義 */
	private MCListPutter Base_prov_xrate_cd_p = null;

	/**
	 * [Base_prov_xrate_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_prov_xrate_cd_ListPutter() {
		if (Base_prov_xrate_cd_p == null) {
			Base_prov_xrate_cd_p = createBase_prov_xrate_cd_ListPutter(Base_prov_xrate_cd, "prov_xrate_cd", "prov_xrate_nm");

		}
		return Base_prov_xrate_cd_p;
	}
	
	
	/** [Base_bill_xrate_cd_ListPutter]の定義 */
	private MCListPutter Base_bill_xrate_cd_p = null;

	/**
	 * [Base_bill_xrate_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_bill_xrate_cd_ListPutter() {
		if (Base_bill_xrate_cd_p == null) {
			Base_bill_xrate_cd_p = createBase_bill_xrate_cd_ListPutter(Base_bill_xrate_cd, "bill_xrate_cd", "bill_xrate_nm");

		}
		return Base_bill_xrate_cd_p;
	}
	
	
	/** [Base_pay_xrate_cd_ListPutter]の定義 */
	private MCListPutter Base_pay_xrate_cd_p = null;

	/**
	 * [Base_pay_xrate_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_pay_xrate_cd_ListPutter() {
		if (Base_pay_xrate_cd_p == null) {
			Base_pay_xrate_cd_p = createBase_pay_xrate_cd_ListPutter(Base_pay_xrate_cd, "pay_xrate_cd", "pay_xrate_nm");

		}
		return Base_pay_xrate_cd_p;
	}
	
	
	/** [Base_sls_upri_req_typ_ListPutter]の定義 */
	private MCListPutter Base_sls_upri_req_typ_p = null;

	/**
	 * [Base_sls_upri_req_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sls_upri_req_typ_ListPutter() {
		if (Base_sls_upri_req_typ_p == null) {
			Base_sls_upri_req_typ_p = createBase_sls_upri_req_typ_ListPutter(Base_sls_upri_req_typ, "sls_upri_req_typ", "sls_upri_req_typ_nm");

		}
		return Base_sls_upri_req_typ_p;
	}
	
	
	/** [Base_sls_basis_typ_ListPutter]の定義 */
	private MCListPutter Base_sls_basis_typ_p = null;

	/**
	 * [Base_sls_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sls_basis_typ_ListPutter() {
		if (Base_sls_basis_typ_p == null) {
			Base_sls_basis_typ_p = createBase_sls_basis_typ_ListPutter(Base_sls_basis_typ, "sls_basis_typ", "sls_basis_typ_nm");

		}
		return Base_sls_basis_typ_p;
	}
	
	
	/** [Base_bill_basis_typ_ListPutter]の定義 */
	private MCListPutter Base_bill_basis_typ_p = null;

	/**
	 * [Base_bill_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_bill_basis_typ_ListPutter() {
		if (Base_bill_basis_typ_p == null) {
			Base_bill_basis_typ_p = createBase_bill_basis_typ_ListPutter(Base_bill_basis_typ, "bill_basis_typ", "bill_basis_typ_nm");

		}
		return Base_bill_basis_typ_p;
	}
	
	
	/** [Base_ship_schd_split_typ_ListPutter]の定義 */
	private MCListPutter Base_ship_schd_split_typ_p = null;

	/**
	 * [Base_ship_schd_split_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_ship_schd_split_typ_ListPutter() {
		if (Base_ship_schd_split_typ_p == null) {
			Base_ship_schd_split_typ_p = createBase_ship_schd_split_typ_ListPutter(Base_ship_schd_split_typ, "ship_schd_split_typ", "ship_schd_split_typ_nm");

		}
		return Base_ship_schd_split_typ_p;
	}
	
	
	/** [Base_xfr_stk_mng_typ_ListPutter]の定義 */
	private MCListPutter Base_xfr_stk_mng_typ_p = null;

	/**
	 * [Base_xfr_stk_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_xfr_stk_mng_typ_ListPutter() {
		if (Base_xfr_stk_mng_typ_p == null) {
			Base_xfr_stk_mng_typ_p = createBase_xfr_stk_mng_typ_ListPutter(Base_xfr_stk_mng_typ, "xfr_stk_mng_typ", "xfr_stk_mng_typ_nm");

		}
		return Base_xfr_stk_mng_typ_p;
	}
	
	
	/** [Base_sls_bdj_rnd_typ_ListPutter]の定義 */
	private MCListPutter Base_sls_bdj_rnd_typ_p = null;

	/**
	 * [Base_sls_bdj_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sls_bdj_rnd_typ_ListPutter() {
		if (Base_sls_bdj_rnd_typ_p == null) {
			Base_sls_bdj_rnd_typ_p = createBase_sls_bdj_rnd_typ_ListPutter(Base_sls_bdj_rnd_typ, "sls_bdj_rnd_typ", "sls_bdj_rnd_typ_nm");

		}
		return Base_sls_bdj_rnd_typ_p;
	}
	
	
	/** [Base_purc_upri_req_typ_ListPutter]の定義 */
	private MCListPutter Base_purc_upri_req_typ_p = null;

	/**
	 * [Base_purc_upri_req_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_purc_upri_req_typ_ListPutter() {
		if (Base_purc_upri_req_typ_p == null) {
			Base_purc_upri_req_typ_p = createBase_purc_upri_req_typ_ListPutter(Base_purc_upri_req_typ, "purc_upri_req_typ", "purc_upri_req_typ_nm");

		}
		return Base_purc_upri_req_typ_p;
	}
	
	
	/** [Base_outsrc_upri_typ_ListPutter]の定義 */
	private MCListPutter Base_outsrc_upri_typ_p = null;

	/**
	 * [Base_outsrc_upri_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_outsrc_upri_typ_ListPutter() {
		if (Base_outsrc_upri_typ_p == null) {
			Base_outsrc_upri_typ_p = createBase_outsrc_upri_typ_ListPutter(Base_outsrc_upri_typ, "outsrc_upri_typ", "outsrc_upri_typ_nm");

		}
		return Base_outsrc_upri_typ_p;
	}
	
	
	/** [Base_xrate_rnd_typ_ListPutter]の定義 */
	private MCListPutter Base_xrate_rnd_typ_p = null;

	/**
	 * [Base_xrate_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_xrate_rnd_typ_ListPutter() {
		if (Base_xrate_rnd_typ_p == null) {
			Base_xrate_rnd_typ_p = createBase_xrate_rnd_typ_ListPutter(Base_xrate_rnd_typ, "xrate_rnd_typ", "xrate_rnd_typ_nm");

		}
		return Base_xrate_rnd_typ_p;
	}
	
	
	/** [Base_setoff_tax_rnd_typ_ListPutter]の定義 */
	private MCListPutter Base_setoff_tax_rnd_typ_p = null;

	/**
	 * [Base_setoff_tax_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_setoff_tax_rnd_typ_ListPutter() {
		if (Base_setoff_tax_rnd_typ_p == null) {
			Base_setoff_tax_rnd_typ_p = createBase_setoff_tax_rnd_typ_ListPutter(Base_setoff_tax_rnd_typ, "setoff_tax_rnd_typ", "setoff_tax_rnd_typ_nm");

		}
		return Base_setoff_tax_rnd_typ_p;
	}
	
	
	/** [Base_com_paid_tax_rnd_typ_ListPutter]の定義 */
	private MCListPutter Base_com_paid_tax_rnd_typ_p = null;

	/**
	 * [Base_com_paid_tax_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_com_paid_tax_rnd_typ_ListPutter() {
		if (Base_com_paid_tax_rnd_typ_p == null) {
			Base_com_paid_tax_rnd_typ_p = createBase_com_paid_tax_rnd_typ_ListPutter(Base_com_paid_tax_rnd_typ, "com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ_nm");

		}
		return Base_com_paid_tax_rnd_typ_p;
	}
	
	
	/** [Base_wtax_rnd_typ_ListPutter]の定義 */
	private MCListPutter Base_wtax_rnd_typ_p = null;

	/**
	 * [Base_wtax_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_wtax_rnd_typ_ListPutter() {
		if (Base_wtax_rnd_typ_p == null) {
			Base_wtax_rnd_typ_p = createBase_wtax_rnd_typ_ListPutter(Base_wtax_rnd_typ, "wtax_rnd_typ", "wtax_rnd_typ_nm");

		}
		return Base_wtax_rnd_typ_p;
	}
	
	
	/** [Base_gm_std_upri_typ_ListPutter]の定義 */
	private MCListPutter Base_gm_std_upri_typ_p = null;

	/**
	 * [Base_gm_std_upri_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_gm_std_upri_typ_ListPutter() {
		if (Base_gm_std_upri_typ_p == null) {
			Base_gm_std_upri_typ_p = createBase_gm_std_upri_typ_ListPutter(Base_gm_std_upri_typ, "gm_std_upri_typ", "gm_std_upri_typ_nm");

		}
		return Base_gm_std_upri_typ_p;
	}
	
	
	/** [Base_stk_std_upri_typ_ListPutter]の定義 */
	private MCListPutter Base_stk_std_upri_typ_p = null;

	/**
	 * [Base_stk_std_upri_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_stk_std_upri_typ_ListPutter() {
		if (Base_stk_std_upri_typ_p == null) {
			Base_stk_std_upri_typ_p = createBase_stk_std_upri_typ_ListPutter(Base_stk_std_upri_typ, "stk_std_upri_typ", "stk_std_upri_typ_nm");

		}
		return Base_stk_std_upri_typ_p;
	}
	
	
	/** [Base_stk_amt_rnd_typ_ListPutter]の定義 */
	private MCListPutter Base_stk_amt_rnd_typ_p = null;

	/**
	 * [Base_stk_amt_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_stk_amt_rnd_typ_ListPutter() {
		if (Base_stk_amt_rnd_typ_p == null) {
			Base_stk_amt_rnd_typ_p = createBase_stk_amt_rnd_typ_ListPutter(Base_stk_amt_rnd_typ, "stk_amt_rnd_typ", "stk_amt_rnd_typ_nm");

		}
		return Base_stk_amt_rnd_typ_p;
	}
	
	
	/** [Base_po_print_cd_ListPutter]の定義 */
	private MCListPutter Base_po_print_cd_p = null;

	/**
	 * [Base_po_print_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_po_print_cd_ListPutter() {
		if (Base_po_print_cd_p == null) {
			Base_po_print_cd_p = createBase_po_print_cd_ListPutter(Base_po_print_cd, "po_print_cd", "po_print_nm");

		}
		return Base_po_print_cd_p;
	}
	
	
	/** [Base_rpt_strg_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter Base_rpt_strg_ext_sys_cd_p = null;

	/**
	 * [Base_rpt_strg_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_rpt_strg_ext_sys_cd_ListPutter() {
		if (Base_rpt_strg_ext_sys_cd_p == null) {
			Base_rpt_strg_ext_sys_cd_p = createBase_rpt_strg_ext_sys_cd_ListPutter(Base_rpt_strg_ext_sys_cd, "rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_nm");

		}
		return Base_rpt_strg_ext_sys_cd_p;
	}
	
	
	/** [Base_cst_prnt_typ_ListPutter]の定義 */
	private MCListPutter Base_cst_prnt_typ_p = null;

	/**
	 * [Base_cst_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_cst_prnt_typ_ListPutter() {
		if (Base_cst_prnt_typ_p == null) {
			Base_cst_prnt_typ_p = createBase_cst_prnt_typ_ListPutter(Base_cst_prnt_typ, "cst_prnt_typ", "cst_prnt_typ_nm");

		}
		return Base_cst_prnt_typ_p;
	}
	
	
	/** [Base_acst_prnt_typ_ListPutter]の定義 */
	private MCListPutter Base_acst_prnt_typ_p = null;

	/**
	 * [Base_acst_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_acst_prnt_typ_ListPutter() {
		if (Base_acst_prnt_typ_p == null) {
			Base_acst_prnt_typ_p = createBase_acst_prnt_typ_ListPutter(Base_acst_prnt_typ, "acst_prnt_typ", "acst_prnt_typ_nm");

		}
		return Base_acst_prnt_typ_p;
	}
	
	
	/** [Base_bcst_prnt_typ_ListPutter]の定義 */
	private MCListPutter Base_bcst_prnt_typ_p = null;

	/**
	 * [Base_bcst_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_bcst_prnt_typ_ListPutter() {
		if (Base_bcst_prnt_typ_p == null) {
			Base_bcst_prnt_typ_p = createBase_bcst_prnt_typ_ListPutter(Base_bcst_prnt_typ, "bcst_prnt_typ", "bcst_prnt_typ_nm");

		}
		return Base_bcst_prnt_typ_p;
	}
	
	
	/** [Base_rcst_prnt_typ_ListPutter]の定義 */
	private MCListPutter Base_rcst_prnt_typ_p = null;

	/**
	 * [Base_rcst_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_rcst_prnt_typ_ListPutter() {
		if (Base_rcst_prnt_typ_p == null) {
			Base_rcst_prnt_typ_p = createBase_rcst_prnt_typ_ListPutter(Base_rcst_prnt_typ, "rcst_prnt_typ", "rcst_prnt_typ_nm");

		}
		return Base_rcst_prnt_typ_p;
	}
	
	
	/** [Base_dlv_prnt_typ_ListPutter]の定義 */
	private MCListPutter Base_dlv_prnt_typ_p = null;

	/**
	 * [Base_dlv_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_dlv_prnt_typ_ListPutter() {
		if (Base_dlv_prnt_typ_p == null) {
			Base_dlv_prnt_typ_p = createBase_dlv_prnt_typ_ListPutter(Base_dlv_prnt_typ, "dlv_prnt_typ", "dlv_prnt_typ_nm");

		}
		return Base_dlv_prnt_typ_p;
	}
	
	
	/** [Base_sppl_prnt_typ_ListPutter]の定義 */
	private MCListPutter Base_sppl_prnt_typ_p = null;

	/**
	 * [Base_sppl_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sppl_prnt_typ_ListPutter() {
		if (Base_sppl_prnt_typ_p == null) {
			Base_sppl_prnt_typ_p = createBase_sppl_prnt_typ_ListPutter(Base_sppl_prnt_typ, "sppl_prnt_typ", "sppl_prnt_typ_nm");

		}
		return Base_sppl_prnt_typ_p;
	}
	
	
	/** [Base_asppl_prnt_typ_ListPutter]の定義 */
	private MCListPutter Base_asppl_prnt_typ_p = null;

	/**
	 * [Base_asppl_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_asppl_prnt_typ_ListPutter() {
		if (Base_asppl_prnt_typ_p == null) {
			Base_asppl_prnt_typ_p = createBase_asppl_prnt_typ_ListPutter(Base_asppl_prnt_typ, "asppl_prnt_typ", "asppl_prnt_typ_nm");

		}
		return Base_asppl_prnt_typ_p;
	}
	
	
	/** [Base_bsppl_prnt_typ_ListPutter]の定義 */
	private MCListPutter Base_bsppl_prnt_typ_p = null;

	/**
	 * [Base_bsppl_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_bsppl_prnt_typ_ListPutter() {
		if (Base_bsppl_prnt_typ_p == null) {
			Base_bsppl_prnt_typ_p = createBase_bsppl_prnt_typ_ListPutter(Base_bsppl_prnt_typ, "bsppl_prnt_typ", "bsppl_prnt_typ_nm");

		}
		return Base_bsppl_prnt_typ_p;
	}
	
	
	/** [Base_psppl_prnt_typ_ListPutter]の定義 */
	private MCListPutter Base_psppl_prnt_typ_p = null;

	/**
	 * [Base_psppl_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_psppl_prnt_typ_ListPutter() {
		if (Base_psppl_prnt_typ_p == null) {
			Base_psppl_prnt_typ_p = createBase_psppl_prnt_typ_ListPutter(Base_psppl_prnt_typ, "psppl_prnt_typ", "psppl_prnt_typ_nm");

		}
		return Base_psppl_prnt_typ_p;
	}
	
	
	/** [Dtl_rpt_strg_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rpt_strg_ext_sys_cd_p = null;

	/**
	 * [Dtl_rpt_strg_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rpt_strg_ext_sys_cd_ListPutter() {
		if (Dtl_rpt_strg_ext_sys_cd_p == null) {
			Dtl_rpt_strg_ext_sys_cd_p = createDtl_rpt_strg_ext_sys_cd_ListPutter(columnDtl_rpt_strg_ext_sys_cd, "rpt_strg_ext_sys_cd");

		}
		return Dtl_rpt_strg_ext_sys_cd_p;
	}
	
	
	/** [DtlSub_sls_tax_cd_ListPutter]の定義 */
	private MCListPutter DtlSub_sls_tax_cd_p = null;

	/**
	 * [DtlSub_sls_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlSub_sls_tax_cd_ListPutter() {
		if (DtlSub_sls_tax_cd_p == null) {
			DtlSub_sls_tax_cd_p = createDtlSub_sls_tax_cd_ListPutter(columnDtlSub_sls_tax_cd, "sls_tax_cd", "sls_tax_nm");

		}
		return DtlSub_sls_tax_cd_p;
	}
	
	
	/** [DtlSub_purc_tax_cd_ListPutter]の定義 */
	private MCListPutter DtlSub_purc_tax_cd_p = null;

	/**
	 * [DtlSub_purc_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlSub_purc_tax_cd_ListPutter() {
		if (DtlSub_purc_tax_cd_p == null) {
			DtlSub_purc_tax_cd_p = createDtlSub_purc_tax_cd_ListPutter(columnDtlSub_purc_tax_cd, "purc_tax_cd", "purc_tax_nm");

		}
		return DtlSub_purc_tax_cd_p;
	}
	
	
	/** [DtlSub_prov_tax_cd_ListPutter]の定義 */
	private MCListPutter DtlSub_prov_tax_cd_p = null;

	/**
	 * [DtlSub_prov_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlSub_prov_tax_cd_ListPutter() {
		if (DtlSub_prov_tax_cd_p == null) {
			DtlSub_prov_tax_cd_p = createDtlSub_prov_tax_cd_ListPutter(columnDtlSub_prov_tax_cd, "prov_tax_cd", "prov_tax_nm");

		}
		return DtlSub_prov_tax_cd_p;
	}
	
	
	/** [Lcl_lcl_cd_ListPutter]の定義 */
	private MCListPutter Lcl_lcl_cd_p = null;

	/**
	 * [Lcl_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLcl_lcl_cd_ListPutter() {
		if (Lcl_lcl_cd_p == null) {
			Lcl_lcl_cd_p = createLcl_lcl_cd_ListPutter(columnLcl_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return Lcl_lcl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_CoReg create(){
		MABCP_CoReg p = new MABCP_CoReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_CoReg create(String name){
		MABCP_CoReg p = new MABCP_CoReg(name);
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
		MABCP_CoReg_MC.jbfInitScreenOpe((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitCnd((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitUpd1((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitUpd2((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitUpd21((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitUpd22((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitUpd3((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitUpd4((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitBase((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitDtl((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitSubTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitSubPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitDtlSub((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitDtlSubBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitLclPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitLcl((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbfInitLclBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitScreenOpe((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitCnd((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitUpd1((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitUpd2((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitUpd21((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitUpd22((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitUpd3((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitUpd4((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitBase((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitDtl((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitSubTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitSubPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitDtlSub((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitDtlSubBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitLclPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitLcl((MABCP_CoReg)this);
		MABCP_CoReg_MC.jbInitLclBtn((MABCP_CoReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_UPD_ADMIN = p.beansFactory.createRadioButton("Cnd.ope_UPD_ADMIN");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_co_cd_Label = p.beansFactory.createLabel("Cnd.co_cd_Label");
		p.Cnd_co_cd = p.beansFactory.createTextField("Cnd.co_cd");
		p.Cnd_co_cd.setLabel(p.Cnd_co_cd_Label);
		p.Cnd_co_nm_lcl = p.beansFactory.createTextField("Cnd.co_nm_lcl");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.TabPanel = p.beansFactory.createPanel("Tab");
		p.TabTab = p.beansFactory.createTabbedPane("Tab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_admin = p.beansFactory.createButton("Btn.upd_admin", "upd");
	}

	/**
	 * [Upd1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpd1(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd1Panel = p.beansFactory.createPanel("Upd1");
		// ブロックの項目の初期化
	}

	/**
	 * [Upd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpd2(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd2Panel = p.beansFactory.createPanel("Upd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Upd21]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpd21(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd21Panel = p.beansFactory.createPanel("Upd21");
		// ブロックの項目の初期化
	}

	/**
	 * [Upd22]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpd22(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd22Panel = p.beansFactory.createPanel("Upd22");
		p.Upd22TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Upd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpd3(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd3Panel = p.beansFactory.createPanel("Upd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Upd4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpd4(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd4Panel = p.beansFactory.createPanel("Upd4");
		// ブロックの項目の初期化
	}

	/**
	 * [Base]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.BasePanel = p.beansFactory.createPanel("Base");
		// ブロックの項目の初期化
		p.Base_co_cd = p.beansFactory.createTextField("Base.co_cd");
		p.Base_co_alt_nm1_Label = p.beansFactory.createLabel("Base.co_alt_nm1_Label");
		p.Base_co_alt_nm1 = p.beansFactory.createTextField("Base.co_alt_nm1");
		p.Base_co_alt_nm1.setLabel(p.Base_co_alt_nm1_Label);
		p.Base_co_alt_nm2_Label = p.beansFactory.createLabel("Base.co_alt_nm2_Label");
		p.Base_co_alt_nm2 = p.beansFactory.createTextField("Base.co_alt_nm2");
		p.Base_co_alt_nm2.setLabel(p.Base_co_alt_nm2_Label);
		p.Base_co_alt_nm3_Label = p.beansFactory.createLabel("Base.co_alt_nm3_Label");
		p.Base_co_alt_nm3 = p.beansFactory.createTextField("Base.co_alt_nm3");
		p.Base_co_alt_nm3.setLabel(p.Base_co_alt_nm3_Label);
		p.Base_co_alt_nm4_Label = p.beansFactory.createLabel("Base.co_alt_nm4_Label");
		p.Base_co_alt_nm4 = p.beansFactory.createTextField("Base.co_alt_nm4");
		p.Base_co_alt_nm4.setLabel(p.Base_co_alt_nm4_Label);
		p.Base_cntry_cd_Label = p.beansFactory.createLabel("Base.cntry_cd_Label");
		p.Base_cntry_cd = p.beansFactory.createTextComboBox("Base.cntry_cd");
		p.Base_cntry_cd.setLabel(p.Base_cntry_cd_Label);
		p.Base_cntry_nm = p.beansFactory.createTextField("Base.cntry_nm");
		p.Base_area_cd_Label = p.beansFactory.createLabel("Base.area_cd_Label");
		p.Base_area_cd = p.beansFactory.createTextComboBox("Base.area_cd");
		p.Base_area_cd.setLabel(p.Base_area_cd_Label);
		p.Base_area_nm = p.beansFactory.createTextField("Base.area_nm");
		p.Base_zip_cd_Label = p.beansFactory.createLabel("Base.zip_cd_Label");
		p.Base_zip_cd = p.beansFactory.createTextField("Base.zip_cd");
		p.Base_zip_cd.setLabel(p.Base_zip_cd_Label);
		p.Base_addr1_Label = p.beansFactory.createLabel("Base.addr1_Label");
		p.Base_addr1 = p.beansFactory.createTextField("Base.addr1");
		p.Base_addr1.setLabel(p.Base_addr1_Label);
		p.Base_addr2_Label = p.beansFactory.createLabel("Base.addr2_Label");
		p.Base_addr2 = p.beansFactory.createTextField("Base.addr2");
		p.Base_addr2.setLabel(p.Base_addr2_Label);
		p.Base_addr3_Label = p.beansFactory.createLabel("Base.addr3_Label");
		p.Base_addr3 = p.beansFactory.createTextField("Base.addr3");
		p.Base_addr3.setLabel(p.Base_addr3_Label);
		p.Base_addr4_Label = p.beansFactory.createLabel("Base.addr4_Label");
		p.Base_addr4 = p.beansFactory.createTextField("Base.addr4");
		p.Base_addr4.setLabel(p.Base_addr4_Label);
		p.Base_tel_Label = p.beansFactory.createLabel("Base.tel_Label");
		p.Base_tel = p.beansFactory.createTextField("Base.tel");
		p.Base_tel.setLabel(p.Base_tel_Label);
		p.Base_fax_Label = p.beansFactory.createLabel("Base.fax_Label");
		p.Base_fax = p.beansFactory.createTextField("Base.fax");
		p.Base_fax.setLabel(p.Base_fax_Label);
		p.Base_co_repl_nm_Label = p.beansFactory.createLabel("Base.co_repl_nm_Label");
		p.Base_co_repl_nm = p.beansFactory.createTextField("Base.co_repl_nm");
		p.Base_co_repl_nm.setLabel(p.Base_co_repl_nm_Label);
		p.Base_biz_co_no_Label = p.beansFactory.createLabel("Base.biz_co_no_Label");
		p.Base_biz_co_no = p.beansFactory.createTextField("Base.biz_co_no");
		p.Base_biz_co_no.setLabel(p.Base_biz_co_no_Label);
		p.Base_ein_Label = p.beansFactory.createLabel("Base.ein_Label");
		p.Base_ein = p.beansFactory.createTextField("Base.ein");
		p.Base_ein.setLabel(p.Base_ein_Label);
		p.Base_std_co_cd_Label = p.beansFactory.createLabel("Base.std_co_cd_Label");
		p.Base_std_co_cd = p.beansFactory.createTextField("Base.std_co_cd");
		p.Base_std_co_cd.setLabel(p.Base_std_co_cd_Label);
		p.Base_base_cur_cd_Label = p.beansFactory.createLabel("Base.base_cur_cd_Label");
		p.Base_base_cur_cd = p.beansFactory.createTextComboBox("Base.base_cur_cd");
		p.Base_base_cur_cd.setLabel(p.Base_base_cur_cd_Label);
		p.Base_base_cur_nm = p.beansFactory.createTextField("Base.base_cur_nm");
		p.Base_ptax_cur_cd_Label = p.beansFactory.createLabel("Base.ptax_cur_cd_Label");
		p.Base_ptax_cur_cd = p.beansFactory.createTextComboBox("Base.ptax_cur_cd");
		p.Base_ptax_cur_cd.setLabel(p.Base_ptax_cur_cd_Label);
		p.Base_ptax_cur_nm = p.beansFactory.createTextField("Base.ptax_cur_nm");
		p.Base_ac_cl_day_Label = p.beansFactory.createLabel("Base.ac_cl_day_Label");
		p.Base_ac_cl_day = p.beansFactory.createNumberField("Base.ac_cl_day");
		p.Base_ac_cl_day.setLabel(p.Base_ac_cl_day_Label);
		p.Base_ac_cl_mon_base_Label = p.beansFactory.createLabel("Base.ac_cl_mon_base_Label");
		p.Base_ac_cl_mon_base = p.beansFactory.createNumberField("Base.ac_cl_mon_base");
		p.Base_ac_cl_mon_base.setLabel(p.Base_ac_cl_mon_base_Label);
		p.Base_st_mon_Label = p.beansFactory.createLabel("Base.st_mon_Label");
		p.Base_st_mon = p.beansFactory.createNumberField("Base.st_mon");
		p.Base_st_mon.setLabel(p.Base_st_mon_Label);
		p.Base_dt_switch_time_Label = p.beansFactory.createLabel("Base.dt_switch_time_Label");
		p.Base_dt_switch_time = p.beansFactory.createNumberField("Base.dt_switch_time");
		p.Base_dt_switch_time.setLabel(p.Base_dt_switch_time_Label);
		p.Base_std_cal_cd_Label = p.beansFactory.createLabel("Base.std_cal_cd_Label");
		p.Base_std_cal_cd = p.beansFactory.createTextComboBox("Base.std_cal_cd");
		p.Base_std_cal_cd.setLabel(p.Base_std_cal_cd_Label);
		p.Base_std_cal_nm = p.beansFactory.createTextField("Base.std_cal_nm");
		p.Base_ar_no_use_flg = p.beansFactory.createCheckBox("Base.ar_no_use_flg");
		p.Base_ap_no_use_flg = p.beansFactory.createCheckBox("Base.ap_no_use_flg");
		p.Base_temp_ap_use_flg = p.beansFactory.createCheckBox("Base.temp_ap_use_flg");
		p.Base_sls_cl_flg = p.beansFactory.createCheckBox("Base.sls_cl_flg");
		p.Base_rcv_cl_flg = p.beansFactory.createCheckBox("Base.rcv_cl_flg");
		p.Base_purc_cl_flg = p.beansFactory.createCheckBox("Base.purc_cl_flg");
		p.Base_pay_cl_flg = p.beansFactory.createCheckBox("Base.pay_cl_flg");
		p.Base_sls_cl_cal_cd_Label = p.beansFactory.createLabel("Base.sls_cl_cal_cd_Label");
		p.Base_sls_cl_cal_cd = p.beansFactory.createTextComboBox("Base.sls_cl_cal_cd");
		p.Base_sls_cl_cal_cd.setLabel(p.Base_sls_cl_cal_cd_Label);
		p.Base_sls_cl_cal_nm = p.beansFactory.createTextField("Base.sls_cl_cal_nm");
		p.Base_sls_cl_delay_days_Label = p.beansFactory.createLabel("Base.sls_cl_delay_days_Label");
		p.Base_sls_cl_delay_days = p.beansFactory.createNumberField("Base.sls_cl_delay_days");
		p.Base_sls_cl_delay_days.setLabel(p.Base_sls_cl_delay_days_Label);
		p.Base_sls_cl_ba_typ_Label = p.beansFactory.createLabel("Base.sls_cl_ba_typ_Label");
		p.Base_sls_cl_ba_typ = p.beansFactory.createTextComboBox("Base.sls_cl_ba_typ");
		p.Base_sls_cl_ba_typ.setLabel(p.Base_sls_cl_ba_typ_Label);
		p.Base_sls_cl_ba_typ_nm = p.beansFactory.createTextField("Base.sls_cl_ba_typ_nm");
		p.Base_rcv_cl_cal_cd_Label = p.beansFactory.createLabel("Base.rcv_cl_cal_cd_Label");
		p.Base_rcv_cl_cal_cd = p.beansFactory.createTextComboBox("Base.rcv_cl_cal_cd");
		p.Base_rcv_cl_cal_cd.setLabel(p.Base_rcv_cl_cal_cd_Label);
		p.Base_rcv_cl_cal_nm = p.beansFactory.createTextField("Base.rcv_cl_cal_nm");
		p.Base_rcv_cl_delay_days_Label = p.beansFactory.createLabel("Base.rcv_cl_delay_days_Label");
		p.Base_rcv_cl_delay_days = p.beansFactory.createNumberField("Base.rcv_cl_delay_days");
		p.Base_rcv_cl_delay_days.setLabel(p.Base_rcv_cl_delay_days_Label);
		p.Base_rcv_cl_ba_typ_Label = p.beansFactory.createLabel("Base.rcv_cl_ba_typ_Label");
		p.Base_rcv_cl_ba_typ = p.beansFactory.createTextComboBox("Base.rcv_cl_ba_typ");
		p.Base_rcv_cl_ba_typ.setLabel(p.Base_rcv_cl_ba_typ_Label);
		p.Base_rcv_cl_ba_typ_nm = p.beansFactory.createTextField("Base.rcv_cl_ba_typ_nm");
		p.Base_purc_cl_cal_cd_Label = p.beansFactory.createLabel("Base.purc_cl_cal_cd_Label");
		p.Base_purc_cl_cal_cd = p.beansFactory.createTextComboBox("Base.purc_cl_cal_cd");
		p.Base_purc_cl_cal_cd.setLabel(p.Base_purc_cl_cal_cd_Label);
		p.Base_purc_cl_cal_nm = p.beansFactory.createTextField("Base.purc_cl_cal_nm");
		p.Base_purc_cl_delay_days_Label = p.beansFactory.createLabel("Base.purc_cl_delay_days_Label");
		p.Base_purc_cl_delay_days = p.beansFactory.createNumberField("Base.purc_cl_delay_days");
		p.Base_purc_cl_delay_days.setLabel(p.Base_purc_cl_delay_days_Label);
		p.Base_purc_cl_ba_typ_Label = p.beansFactory.createLabel("Base.purc_cl_ba_typ_Label");
		p.Base_purc_cl_ba_typ = p.beansFactory.createTextComboBox("Base.purc_cl_ba_typ");
		p.Base_purc_cl_ba_typ.setLabel(p.Base_purc_cl_ba_typ_Label);
		p.Base_purc_cl_ba_typ_nm = p.beansFactory.createTextField("Base.purc_cl_ba_typ_nm");
		p.Base_pay_cl_cal_cd_Label = p.beansFactory.createLabel("Base.pay_cl_cal_cd_Label");
		p.Base_pay_cl_cal_cd = p.beansFactory.createTextComboBox("Base.pay_cl_cal_cd");
		p.Base_pay_cl_cal_cd.setLabel(p.Base_pay_cl_cal_cd_Label);
		p.Base_pay_cl_cal_nm = p.beansFactory.createTextField("Base.pay_cl_cal_nm");
		p.Base_pay_cl_delay_days_Label = p.beansFactory.createLabel("Base.pay_cl_delay_days_Label");
		p.Base_pay_cl_delay_days = p.beansFactory.createNumberField("Base.pay_cl_delay_days");
		p.Base_pay_cl_delay_days.setLabel(p.Base_pay_cl_delay_days_Label);
		p.Base_pay_cl_ba_typ_Label = p.beansFactory.createLabel("Base.pay_cl_ba_typ_Label");
		p.Base_pay_cl_ba_typ = p.beansFactory.createTextComboBox("Base.pay_cl_ba_typ");
		p.Base_pay_cl_ba_typ.setLabel(p.Base_pay_cl_ba_typ_Label);
		p.Base_pay_cl_ba_typ_nm = p.beansFactory.createTextField("Base.pay_cl_ba_typ_nm");
		p.Base_stk_cl_cal_cd_Label = p.beansFactory.createLabel("Base.stk_cl_cal_cd_Label");
		p.Base_stk_cl_cal_cd = p.beansFactory.createTextComboBox("Base.stk_cl_cal_cd");
		p.Base_stk_cl_cal_cd.setLabel(p.Base_stk_cl_cal_cd_Label);
		p.Base_stk_cl_cal_nm = p.beansFactory.createTextField("Base.stk_cl_cal_nm");
		p.Base_stk_cl_delay_days_Label = p.beansFactory.createLabel("Base.stk_cl_delay_days_Label");
		p.Base_stk_cl_delay_days = p.beansFactory.createNumberField("Base.stk_cl_delay_days");
		p.Base_stk_cl_delay_days.setLabel(p.Base_stk_cl_delay_days_Label);
		p.Base_stk_cl_ba_typ_Label = p.beansFactory.createLabel("Base.stk_cl_ba_typ_Label");
		p.Base_stk_cl_ba_typ = p.beansFactory.createTextComboBox("Base.stk_cl_ba_typ");
		p.Base_stk_cl_ba_typ.setLabel(p.Base_stk_cl_ba_typ_Label);
		p.Base_stk_cl_ba_typ_nm = p.beansFactory.createTextField("Base.stk_cl_ba_typ_nm");
		p.Base_bill_cl_cal_cd_Label = p.beansFactory.createLabel("Base.bill_cl_cal_cd_Label");
		p.Base_bill_cl_cal_cd = p.beansFactory.createTextComboBox("Base.bill_cl_cal_cd");
		p.Base_bill_cl_cal_cd.setLabel(p.Base_bill_cl_cal_cd_Label);
		p.Base_bill_cl_cal_nm = p.beansFactory.createTextField("Base.bill_cl_cal_nm");
		p.Base_pay_schd_cl_cal_cd_Label = p.beansFactory.createLabel("Base.pay_schd_cl_cal_cd_Label");
		p.Base_pay_schd_cl_cal_cd = p.beansFactory.createTextComboBox("Base.pay_schd_cl_cal_cd");
		p.Base_pay_schd_cl_cal_cd.setLabel(p.Base_pay_schd_cl_cal_cd_Label);
		p.Base_pay_schd_cl_cal_nm = p.beansFactory.createTextField("Base.pay_schd_cl_cal_nm");
		p.Base_bill_xrate_conv_flg = p.beansFactory.createCheckBox("Base.bill_xrate_conv_flg");
		p.Base_pay_xrate_conv_flg = p.beansFactory.createCheckBox("Base.pay_xrate_conv_flg");
		p.Base_sls_xrate_cd_Label = p.beansFactory.createLabel("Base.sls_xrate_cd_Label");
		p.Base_sls_xrate_cd = p.beansFactory.createTextComboBox("Base.sls_xrate_cd");
		p.Base_sls_xrate_cd.setLabel(p.Base_sls_xrate_cd_Label);
		p.Base_sls_xrate_nm = p.beansFactory.createTextField("Base.sls_xrate_nm");
		p.Base_purc_xrate_cd_Label = p.beansFactory.createLabel("Base.purc_xrate_cd_Label");
		p.Base_purc_xrate_cd = p.beansFactory.createTextComboBox("Base.purc_xrate_cd");
		p.Base_purc_xrate_cd.setLabel(p.Base_purc_xrate_cd_Label);
		p.Base_purc_xrate_nm = p.beansFactory.createTextField("Base.purc_xrate_nm");
		p.Base_prov_xrate_cd_Label = p.beansFactory.createLabel("Base.prov_xrate_cd_Label");
		p.Base_prov_xrate_cd = p.beansFactory.createTextComboBox("Base.prov_xrate_cd");
		p.Base_prov_xrate_cd.setLabel(p.Base_prov_xrate_cd_Label);
		p.Base_prov_xrate_nm = p.beansFactory.createTextField("Base.prov_xrate_nm");
		p.Base_bill_xrate_cd_Label = p.beansFactory.createLabel("Base.bill_xrate_cd_Label");
		p.Base_bill_xrate_cd = p.beansFactory.createTextComboBox("Base.bill_xrate_cd");
		p.Base_bill_xrate_cd.setLabel(p.Base_bill_xrate_cd_Label);
		p.Base_bill_xrate_nm = p.beansFactory.createTextField("Base.bill_xrate_nm");
		p.Base_pay_xrate_cd_Label = p.beansFactory.createLabel("Base.pay_xrate_cd_Label");
		p.Base_pay_xrate_cd = p.beansFactory.createTextComboBox("Base.pay_xrate_cd");
		p.Base_pay_xrate_cd.setLabel(p.Base_pay_xrate_cd_Label);
		p.Base_pay_xrate_nm = p.beansFactory.createTextField("Base.pay_xrate_nm");
		p.Base_mon01_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon01_xrate_rev_flg");
		p.Base_mon02_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon02_xrate_rev_flg");
		p.Base_mon03_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon03_xrate_rev_flg");
		p.Base_mon04_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon04_xrate_rev_flg");
		p.Base_mon05_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon05_xrate_rev_flg");
		p.Base_mon06_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon06_xrate_rev_flg");
		p.Base_mon07_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon07_xrate_rev_flg");
		p.Base_mon08_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon08_xrate_rev_flg");
		p.Base_mon09_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon09_xrate_rev_flg");
		p.Base_mon10_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon10_xrate_rev_flg");
		p.Base_mon11_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon11_xrate_rev_flg");
		p.Base_mon12_xrate_rev_flg = p.beansFactory.createCheckBox("Base.mon12_xrate_rev_flg");
		p.Base_sls_upri_req_typ_Label = p.beansFactory.createLabel("Base.sls_upri_req_typ_Label");
		p.Base_sls_upri_req_typ = p.beansFactory.createTextComboBox("Base.sls_upri_req_typ");
		p.Base_sls_upri_req_typ.setLabel(p.Base_sls_upri_req_typ_Label);
		p.Base_sls_upri_req_typ_nm = p.beansFactory.createTextField("Base.sls_upri_req_typ_nm");
		p.Base_sls_basis_typ_Label = p.beansFactory.createLabel("Base.sls_basis_typ_Label");
		p.Base_sls_basis_typ = p.beansFactory.createTextComboBox("Base.sls_basis_typ");
		p.Base_sls_basis_typ.setLabel(p.Base_sls_basis_typ_Label);
		p.Base_sls_basis_typ_nm = p.beansFactory.createTextField("Base.sls_basis_typ_nm");
		p.Base_bill_basis_typ_Label = p.beansFactory.createLabel("Base.bill_basis_typ_Label");
		p.Base_bill_basis_typ = p.beansFactory.createTextComboBox("Base.bill_basis_typ");
		p.Base_bill_basis_typ.setLabel(p.Base_bill_basis_typ_Label);
		p.Base_bill_basis_typ_nm = p.beansFactory.createTextField("Base.bill_basis_typ_nm");
		p.Base_ship_schd_split_typ_Label = p.beansFactory.createLabel("Base.ship_schd_split_typ_Label");
		p.Base_ship_schd_split_typ = p.beansFactory.createTextComboBox("Base.ship_schd_split_typ");
		p.Base_ship_schd_split_typ.setLabel(p.Base_ship_schd_split_typ_Label);
		p.Base_ship_schd_split_typ_nm = p.beansFactory.createTextField("Base.ship_schd_split_typ_nm");
		p.Base_xfr_stk_mng_typ_Label = p.beansFactory.createLabel("Base.xfr_stk_mng_typ_Label");
		p.Base_xfr_stk_mng_typ = p.beansFactory.createTextComboBox("Base.xfr_stk_mng_typ");
		p.Base_xfr_stk_mng_typ.setLabel(p.Base_xfr_stk_mng_typ_Label);
		p.Base_xfr_stk_mng_typ_nm = p.beansFactory.createTextField("Base.xfr_stk_mng_typ_nm");
		p.Base_sls_bdj_rnd_typ_Label = p.beansFactory.createLabel("Base.sls_bdj_rnd_typ_Label");
		p.Base_sls_bdj_rnd_typ = p.beansFactory.createTextComboBox("Base.sls_bdj_rnd_typ");
		p.Base_sls_bdj_rnd_typ.setLabel(p.Base_sls_bdj_rnd_typ_Label);
		p.Base_sls_bdj_rnd_typ_nm = p.beansFactory.createTextField("Base.sls_bdj_rnd_typ_nm");
		p.Base_purc_upri_req_typ_Label = p.beansFactory.createLabel("Base.purc_upri_req_typ_Label");
		p.Base_purc_upri_req_typ = p.beansFactory.createTextComboBox("Base.purc_upri_req_typ");
		p.Base_purc_upri_req_typ.setLabel(p.Base_purc_upri_req_typ_Label);
		p.Base_purc_upri_req_typ_nm = p.beansFactory.createTextField("Base.purc_upri_req_typ_nm");
		p.Base_outsrc_upri_typ_Label = p.beansFactory.createLabel("Base.outsrc_upri_typ_Label");
		p.Base_outsrc_upri_typ = p.beansFactory.createTextComboBox("Base.outsrc_upri_typ");
		p.Base_outsrc_upri_typ.setLabel(p.Base_outsrc_upri_typ_Label);
		p.Base_outsrc_upri_typ_nm = p.beansFactory.createTextField("Base.outsrc_upri_typ_nm");
		p.Base_xrate_rnd_typ_Label = p.beansFactory.createLabel("Base.xrate_rnd_typ_Label");
		p.Base_xrate_rnd_typ = p.beansFactory.createTextComboBox("Base.xrate_rnd_typ");
		p.Base_xrate_rnd_typ.setLabel(p.Base_xrate_rnd_typ_Label);
		p.Base_xrate_rnd_typ_nm = p.beansFactory.createTextField("Base.xrate_rnd_typ_nm");
		p.Base_setoff_tax_rnd_typ_Label = p.beansFactory.createLabel("Base.setoff_tax_rnd_typ_Label");
		p.Base_setoff_tax_rnd_typ = p.beansFactory.createTextComboBox("Base.setoff_tax_rnd_typ");
		p.Base_setoff_tax_rnd_typ.setLabel(p.Base_setoff_tax_rnd_typ_Label);
		p.Base_setoff_tax_rnd_typ_nm = p.beansFactory.createTextField("Base.setoff_tax_rnd_typ_nm");
		p.Base_com_paid_tax_rnd_typ_Label = p.beansFactory.createLabel("Base.com_paid_tax_rnd_typ_Label");
		p.Base_com_paid_tax_rnd_typ = p.beansFactory.createTextComboBox("Base.com_paid_tax_rnd_typ");
		p.Base_com_paid_tax_rnd_typ.setLabel(p.Base_com_paid_tax_rnd_typ_Label);
		p.Base_com_paid_tax_rnd_typ_nm = p.beansFactory.createTextField("Base.com_paid_tax_rnd_typ_nm");
		p.Base_wtax_rnd_typ_Label = p.beansFactory.createLabel("Base.wtax_rnd_typ_Label");
		p.Base_wtax_rnd_typ = p.beansFactory.createTextComboBox("Base.wtax_rnd_typ");
		p.Base_wtax_rnd_typ.setLabel(p.Base_wtax_rnd_typ_Label);
		p.Base_wtax_rnd_typ_nm = p.beansFactory.createTextField("Base.wtax_rnd_typ_nm");
		p.Base_gm_std_upri_typ_Label = p.beansFactory.createLabel("Base.gm_std_upri_typ_Label");
		p.Base_gm_std_upri_typ = p.beansFactory.createTextComboBox("Base.gm_std_upri_typ");
		p.Base_gm_std_upri_typ.setLabel(p.Base_gm_std_upri_typ_Label);
		p.Base_gm_std_upri_typ_nm = p.beansFactory.createTextField("Base.gm_std_upri_typ_nm");
		p.Base_stk_std_upri_typ_Label = p.beansFactory.createLabel("Base.stk_std_upri_typ_Label");
		p.Base_stk_std_upri_typ = p.beansFactory.createTextComboBox("Base.stk_std_upri_typ");
		p.Base_stk_std_upri_typ.setLabel(p.Base_stk_std_upri_typ_Label);
		p.Base_stk_std_upri_typ_nm = p.beansFactory.createTextField("Base.stk_std_upri_typ_nm");
		p.Base_stk_amt_rnd_typ_Label = p.beansFactory.createLabel("Base.stk_amt_rnd_typ_Label");
		p.Base_stk_amt_rnd_typ = p.beansFactory.createTextComboBox("Base.stk_amt_rnd_typ");
		p.Base_stk_amt_rnd_typ.setLabel(p.Base_stk_amt_rnd_typ_Label);
		p.Base_stk_amt_rnd_typ_nm = p.beansFactory.createTextField("Base.stk_amt_rnd_typ_nm");
		p.Base_stk_amt_dec_place_Label = p.beansFactory.createLabel("Base.stk_amt_dec_place_Label");
		p.Base_stk_amt_dec_place = p.beansFactory.createNumberField("Base.stk_amt_dec_place");
		p.Base_stk_amt_dec_place.setLabel(p.Base_stk_amt_dec_place_Label);
		p.Base_po_print_cd_Label = p.beansFactory.createLabel("Base.po_print_cd_Label");
		p.Base_po_print_cd = p.beansFactory.createTextComboBox("Base.po_print_cd");
		p.Base_po_print_cd.setLabel(p.Base_po_print_cd_Label);
		p.Base_po_print_nm = p.beansFactory.createTextField("Base.po_print_nm");
		p.Base_stk_lst_cnf_num_Label = p.beansFactory.createLabel("Base.stk_lst_cnf_num_Label");
		p.Base_stk_lst_cnf_num = p.beansFactory.createNumberField("Base.stk_lst_cnf_num");
		p.Base_stk_lst_cnf_num.setLabel(p.Base_stk_lst_cnf_num_Label);
		p.Base_stk_lst_limit_num_Label = p.beansFactory.createLabel("Base.stk_lst_limit_num_Label");
		p.Base_stk_lst_limit_num = p.beansFactory.createNumberField("Base.stk_lst_limit_num");
		p.Base_stk_lst_limit_num.setLabel(p.Base_stk_lst_limit_num_Label);
		p.Base_early_ship_dt_add_days_Label = p.beansFactory.createLabel("Base.early_ship_dt_add_days_Label");
		p.Base_early_ship_dt_add_days = p.beansFactory.createNumberField("Base.early_ship_dt_add_days");
		p.Base_early_ship_dt_add_days.setLabel(p.Base_early_ship_dt_add_days_Label);
		p.Base_ac_slip_digit_Label = p.beansFactory.createLabel("Base.ac_slip_digit_Label");
		p.Base_ac_slip_digit = p.beansFactory.createNumberField("Base.ac_slip_digit");
		p.Base_ac_slip_digit.setLabel(p.Base_ac_slip_digit_Label);
		p.Base_ac_slip_seq_flg = p.beansFactory.createCheckBox("Base.ac_slip_seq_flg");
		p.Base_rpt_strg_ext_sys_cd_Label = p.beansFactory.createLabel("Base.rpt_strg_ext_sys_cd_Label");
		p.Base_rpt_strg_ext_sys_cd = p.beansFactory.createTextComboBox("Base.rpt_strg_ext_sys_cd");
		p.Base_rpt_strg_ext_sys_cd.setLabel(p.Base_rpt_strg_ext_sys_cd_Label);
		p.Base_rpt_strg_ext_sys_nm = p.beansFactory.createTextField("Base.rpt_strg_ext_sys_nm");
		p.Base_cst_prnt_typ_Label = p.beansFactory.createLabel("Base.cst_prnt_typ_Label");
		p.Base_cst_prnt_typ = p.beansFactory.createTextComboBox("Base.cst_prnt_typ");
		p.Base_cst_prnt_typ.setLabel(p.Base_cst_prnt_typ_Label);
		p.Base_cst_prnt_typ_nm = p.beansFactory.createTextField("Base.cst_prnt_typ_nm");
		p.Base_acst_prnt_typ_Label = p.beansFactory.createLabel("Base.acst_prnt_typ_Label");
		p.Base_acst_prnt_typ = p.beansFactory.createTextComboBox("Base.acst_prnt_typ");
		p.Base_acst_prnt_typ.setLabel(p.Base_acst_prnt_typ_Label);
		p.Base_acst_prnt_typ_nm = p.beansFactory.createTextField("Base.acst_prnt_typ_nm");
		p.Base_bcst_prnt_typ_Label = p.beansFactory.createLabel("Base.bcst_prnt_typ_Label");
		p.Base_bcst_prnt_typ = p.beansFactory.createTextComboBox("Base.bcst_prnt_typ");
		p.Base_bcst_prnt_typ.setLabel(p.Base_bcst_prnt_typ_Label);
		p.Base_bcst_prnt_typ_nm = p.beansFactory.createTextField("Base.bcst_prnt_typ_nm");
		p.Base_rcst_prnt_typ_Label = p.beansFactory.createLabel("Base.rcst_prnt_typ_Label");
		p.Base_rcst_prnt_typ = p.beansFactory.createTextComboBox("Base.rcst_prnt_typ");
		p.Base_rcst_prnt_typ.setLabel(p.Base_rcst_prnt_typ_Label);
		p.Base_rcst_prnt_typ_nm = p.beansFactory.createTextField("Base.rcst_prnt_typ_nm");
		p.Base_dlv_prnt_typ_Label = p.beansFactory.createLabel("Base.dlv_prnt_typ_Label");
		p.Base_dlv_prnt_typ = p.beansFactory.createTextComboBox("Base.dlv_prnt_typ");
		p.Base_dlv_prnt_typ.setLabel(p.Base_dlv_prnt_typ_Label);
		p.Base_dlv_prnt_typ_nm = p.beansFactory.createTextField("Base.dlv_prnt_typ_nm");
		p.Base_sppl_prnt_typ_Label = p.beansFactory.createLabel("Base.sppl_prnt_typ_Label");
		p.Base_sppl_prnt_typ = p.beansFactory.createTextComboBox("Base.sppl_prnt_typ");
		p.Base_sppl_prnt_typ.setLabel(p.Base_sppl_prnt_typ_Label);
		p.Base_sppl_prnt_typ_nm = p.beansFactory.createTextField("Base.sppl_prnt_typ_nm");
		p.Base_asppl_prnt_typ_Label = p.beansFactory.createLabel("Base.asppl_prnt_typ_Label");
		p.Base_asppl_prnt_typ = p.beansFactory.createTextComboBox("Base.asppl_prnt_typ");
		p.Base_asppl_prnt_typ.setLabel(p.Base_asppl_prnt_typ_Label);
		p.Base_asppl_prnt_typ_nm = p.beansFactory.createTextField("Base.asppl_prnt_typ_nm");
		p.Base_bsppl_prnt_typ_Label = p.beansFactory.createLabel("Base.bsppl_prnt_typ_Label");
		p.Base_bsppl_prnt_typ = p.beansFactory.createTextComboBox("Base.bsppl_prnt_typ");
		p.Base_bsppl_prnt_typ.setLabel(p.Base_bsppl_prnt_typ_Label);
		p.Base_bsppl_prnt_typ_nm = p.beansFactory.createTextField("Base.bsppl_prnt_typ_nm");
		p.Base_psppl_prnt_typ_Label = p.beansFactory.createLabel("Base.psppl_prnt_typ_Label");
		p.Base_psppl_prnt_typ = p.beansFactory.createTextComboBox("Base.psppl_prnt_typ");
		p.Base_psppl_prnt_typ.setLabel(p.Base_psppl_prnt_typ_Label);
		p.Base_psppl_prnt_typ_nm = p.beansFactory.createTextField("Base.psppl_prnt_typ_nm");
		p.Base_ins_usr_id_Label = p.beansFactory.createLabel("Base.ins_usr_id_Label");
		p.Base_ins_usr_id = p.beansFactory.createTextField("Base.ins_usr_id");
		p.Base_ins_usr_id.setLabel(p.Base_ins_usr_id_Label);
		p.Base_ins_usr_nm = p.beansFactory.createTextField("Base.ins_usr_nm");
		p.Base_ins_func_id_Label = p.beansFactory.createLabel("Base.ins_func_id_Label");
		p.Base_ins_func_id = p.beansFactory.createTextField("Base.ins_func_id");
		p.Base_ins_func_id.setLabel(p.Base_ins_func_id_Label);
		p.Base_ins_func_nm = p.beansFactory.createTextField("Base.ins_func_nm");
		p.Base_upd_usr_id_Label = p.beansFactory.createLabel("Base.upd_usr_id_Label");
		p.Base_upd_usr_id = p.beansFactory.createTextField("Base.upd_usr_id");
		p.Base_upd_usr_id.setLabel(p.Base_upd_usr_id_Label);
		p.Base_upd_usr_nm = p.beansFactory.createTextField("Base.upd_usr_nm");
		p.Base_upd_func_id_Label = p.beansFactory.createLabel("Base.upd_func_id_Label");
		p.Base_upd_func_id = p.beansFactory.createTextField("Base.upd_func_id");
		p.Base_upd_func_id.setLabel(p.Base_upd_func_id_Label);
		p.Base_upd_func_nm = p.beansFactory.createTextField("Base.upd_func_nm");
		p.Base_ins_ts_Label = p.beansFactory.createLabel("Base.ins_ts_Label");
		p.Base_ins_ts = p.beansFactory.createTimestampField("Base.ins_ts");
		p.Base_ins_ts.setLabel(p.Base_ins_ts_Label);
		p.Base_upd_ts_Label = p.beansFactory.createLabel("Base.upd_ts_Label");
		p.Base_upd_ts = p.beansFactory.createTimestampField("Base.upd_ts");
		p.Base_upd_ts.setLabel(p.Base_upd_ts_Label);
		p.Base_upd_srv_req_no_Label = p.beansFactory.createLabel("Base.upd_srv_req_no_Label");
		p.Base_upd_srv_req_no = p.beansFactory.createTextField("Base.upd_srv_req_no");
		p.Base_upd_srv_req_no.setLabel(p.Base_upd_srv_req_no_Label);
		p.Base_upd_cntr = p.beansFactory.createNumberField("Base.upd_cntr");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_co_cd = p.beansFactory.createTableColumn("Dtl.co_cd", MCColumnType.TEXT);
		p.columnDtl_co_alt_nm1 = p.beansFactory.createTableColumn("Dtl.co_alt_nm1", MCColumnType.TEXT);
		p.columnDtl_co_alt_nm2 = p.beansFactory.createTableColumn("Dtl.co_alt_nm2", MCColumnType.TEXT);
		p.columnDtl_co_alt_nm3 = p.beansFactory.createTableColumn("Dtl.co_alt_nm3", MCColumnType.TEXT);
		p.columnDtl_co_alt_nm4 = p.beansFactory.createTableColumn("Dtl.co_alt_nm4", MCColumnType.TEXT);
		p.columnDtl_zip_cd = p.beansFactory.createTableColumn("Dtl.zip_cd", MCColumnType.TEXT);
		p.columnDtl_addr1 = p.beansFactory.createTableColumn("Dtl.addr1", MCColumnType.TEXT);
		p.columnDtl_addr2 = p.beansFactory.createTableColumn("Dtl.addr2", MCColumnType.TEXT);
		p.columnDtl_addr3 = p.beansFactory.createTableColumn("Dtl.addr3", MCColumnType.TEXT);
		p.columnDtl_addr4 = p.beansFactory.createTableColumn("Dtl.addr4", MCColumnType.TEXT);
		p.columnDtl_tel = p.beansFactory.createTableColumn("Dtl.tel", MCColumnType.TEXT);
		p.columnDtl_fax = p.beansFactory.createTableColumn("Dtl.fax", MCColumnType.TEXT);
		p.columnDtl_co_repl_nm = p.beansFactory.createTableColumn("Dtl.co_repl_nm", MCColumnType.TEXT);
		p.columnDtl_ein = p.beansFactory.createTableColumn("Dtl.ein", MCColumnType.TEXT);
		p.columnDtl_biz_co_no = p.beansFactory.createTableColumn("Dtl.biz_co_no", MCColumnType.TEXT);
		p.columnDtl_std_co_cd = p.beansFactory.createTableColumn("Dtl.std_co_cd", MCColumnType.TEXT);
		p.columnDtl_cntry_cd = p.beansFactory.createTableColumn("Dtl.cntry_cd", MCColumnType.TEXT);
		p.columnDtl_area_cd = p.beansFactory.createTableColumn("Dtl.area_cd", MCColumnType.TEXT);
		p.columnDtl_base_cur_cd = p.beansFactory.createTableColumn("Dtl.base_cur_cd", MCColumnType.TEXT);
		p.columnDtl_ptax_cur_cd = p.beansFactory.createTableColumn("Dtl.ptax_cur_cd", MCColumnType.TEXT);
		p.columnDtl_st_mon = p.beansFactory.createTableColumn("Dtl.st_mon", MCColumnType.NUMBER);
		p.columnDtl_dt_switch_time = p.beansFactory.createTableColumn("Dtl.dt_switch_time", MCColumnType.NUMBER);
		p.columnDtl_ac_cl_day = p.beansFactory.createTableColumn("Dtl.ac_cl_day", MCColumnType.NUMBER);
		p.columnDtl_ac_cl_mon_base = p.beansFactory.createTableColumn("Dtl.ac_cl_mon_base", MCColumnType.NUMBER);
		p.columnDtl_std_cal_cd = p.beansFactory.createTableColumn("Dtl.std_cal_cd", MCColumnType.TEXT);
		p.columnDtl_bill_cl_cal_cd = p.beansFactory.createTableColumn("Dtl.bill_cl_cal_cd", MCColumnType.TEXT);
		p.columnDtl_ar_no_use_flg = p.beansFactory.createTableColumn("Dtl.ar_no_use_flg", MCColumnType.CHECK);
		p.columnDtl_ap_no_use_flg = p.beansFactory.createTableColumn("Dtl.ap_no_use_flg", MCColumnType.CHECK);
		p.columnDtl_temp_ap_use_flg = p.beansFactory.createTableColumn("Dtl.temp_ap_use_flg", MCColumnType.CHECK);
		p.columnDtl_sls_cl_flg = p.beansFactory.createTableColumn("Dtl.sls_cl_flg", MCColumnType.CHECK);
		p.columnDtl_rcv_cl_flg = p.beansFactory.createTableColumn("Dtl.rcv_cl_flg", MCColumnType.CHECK);
		p.columnDtl_purc_cl_flg = p.beansFactory.createTableColumn("Dtl.purc_cl_flg", MCColumnType.CHECK);
		p.columnDtl_pay_cl_flg = p.beansFactory.createTableColumn("Dtl.pay_cl_flg", MCColumnType.CHECK);
		p.columnDtl_stk_cl_cal_cd = p.beansFactory.createTableColumn("Dtl.stk_cl_cal_cd", MCColumnType.TEXT);
		p.columnDtl_sls_cl_cal_cd = p.beansFactory.createTableColumn("Dtl.sls_cl_cal_cd", MCColumnType.TEXT);
		p.columnDtl_rcv_cl_cal_cd = p.beansFactory.createTableColumn("Dtl.rcv_cl_cal_cd", MCColumnType.TEXT);
		p.columnDtl_purc_cl_cal_cd = p.beansFactory.createTableColumn("Dtl.purc_cl_cal_cd", MCColumnType.TEXT);
		p.columnDtl_pay_cl_cal_cd = p.beansFactory.createTableColumn("Dtl.pay_cl_cal_cd", MCColumnType.TEXT);
		p.columnDtl_pay_schd_cl_cal_cd = p.beansFactory.createTableColumn("Dtl.pay_schd_cl_cal_cd", MCColumnType.TEXT);
		p.columnDtl_stk_cl_delay_days = p.beansFactory.createTableColumn("Dtl.stk_cl_delay_days", MCColumnType.NUMBER);
		p.columnDtl_stk_cl_ba_typ = p.beansFactory.createTableColumn("Dtl.stk_cl_ba_typ", MCColumnType.TEXT);
		p.columnDtl_sls_cl_delay_days = p.beansFactory.createTableColumn("Dtl.sls_cl_delay_days", MCColumnType.NUMBER);
		p.columnDtl_sls_cl_ba_typ = p.beansFactory.createTableColumn("Dtl.sls_cl_ba_typ", MCColumnType.TEXT);
		p.columnDtl_rcv_cl_delay_days = p.beansFactory.createTableColumn("Dtl.rcv_cl_delay_days", MCColumnType.NUMBER);
		p.columnDtl_rcv_cl_ba_typ = p.beansFactory.createTableColumn("Dtl.rcv_cl_ba_typ", MCColumnType.TEXT);
		p.columnDtl_purc_cl_delay_days = p.beansFactory.createTableColumn("Dtl.purc_cl_delay_days", MCColumnType.NUMBER);
		p.columnDtl_purc_cl_ba_typ = p.beansFactory.createTableColumn("Dtl.purc_cl_ba_typ", MCColumnType.TEXT);
		p.columnDtl_pay_cl_delay_days = p.beansFactory.createTableColumn("Dtl.pay_cl_delay_days", MCColumnType.NUMBER);
		p.columnDtl_pay_cl_ba_typ = p.beansFactory.createTableColumn("Dtl.pay_cl_ba_typ", MCColumnType.TEXT);
		p.columnDtl_bill_xrate_conv_flg = p.beansFactory.createTableColumn("Dtl.bill_xrate_conv_flg", MCColumnType.CHECK);
		p.columnDtl_pay_xrate_conv_flg = p.beansFactory.createTableColumn("Dtl.pay_xrate_conv_flg", MCColumnType.CHECK);
		p.columnDtl_sls_xrate_cd = p.beansFactory.createTableColumn("Dtl.sls_xrate_cd", MCColumnType.TEXT);
		p.columnDtl_purc_xrate_cd = p.beansFactory.createTableColumn("Dtl.purc_xrate_cd", MCColumnType.TEXT);
		p.columnDtl_prov_xrate_cd = p.beansFactory.createTableColumn("Dtl.prov_xrate_cd", MCColumnType.TEXT);
		p.columnDtl_bill_xrate_cd = p.beansFactory.createTableColumn("Dtl.bill_xrate_cd", MCColumnType.TEXT);
		p.columnDtl_pay_xrate_cd = p.beansFactory.createTableColumn("Dtl.pay_xrate_cd", MCColumnType.TEXT);
		p.columnDtl_mon01_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon01_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon02_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon02_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon03_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon03_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon04_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon04_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon05_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon05_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon06_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon06_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon07_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon07_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon08_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon08_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon09_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon09_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon10_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon10_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon11_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon11_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_mon12_xrate_rev_flg = p.beansFactory.createTableColumn("Dtl.mon12_xrate_rev_flg", MCColumnType.CHECK);
		p.columnDtl_sls_upri_req_typ = p.beansFactory.createTableColumn("Dtl.sls_upri_req_typ", MCColumnType.TEXT);
		p.columnDtl_purc_upri_req_typ = p.beansFactory.createTableColumn("Dtl.purc_upri_req_typ", MCColumnType.TEXT);
		p.columnDtl_outsrc_upri_typ = p.beansFactory.createTableColumn("Dtl.outsrc_upri_typ", MCColumnType.TEXT);
		p.columnDtl_sls_basis_typ = p.beansFactory.createTableColumn("Dtl.sls_basis_typ", MCColumnType.TEXT);
		p.columnDtl_bill_basis_typ = p.beansFactory.createTableColumn("Dtl.bill_basis_typ", MCColumnType.TEXT);
		p.columnDtl_ship_schd_split_typ = p.beansFactory.createTableColumn("Dtl.ship_schd_split_typ", MCColumnType.TEXT);
		p.columnDtl_xfr_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.xfr_stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_setoff_tax_rnd_typ = p.beansFactory.createTableColumn("Dtl.setoff_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_xrate_rnd_typ = p.beansFactory.createTableColumn("Dtl.xrate_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_com_paid_tax_rnd_typ = p.beansFactory.createTableColumn("Dtl.com_paid_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_wtax_rnd_typ = p.beansFactory.createTableColumn("Dtl.wtax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_stk_amt_rnd_typ = p.beansFactory.createTableColumn("Dtl.stk_amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_stk_amt_dec_place = p.beansFactory.createTableColumn("Dtl.stk_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_po_print_cd = p.beansFactory.createTableColumn("Dtl.po_print_cd", MCColumnType.TEXT);
		p.columnDtl_stk_lst_cnf_num = p.beansFactory.createTableColumn("Dtl.stk_lst_cnf_num", MCColumnType.NUMBER);
		p.columnDtl_stk_lst_limit_num = p.beansFactory.createTableColumn("Dtl.stk_lst_limit_num", MCColumnType.NUMBER);
		p.columnDtl_gm_std_upri_typ = p.beansFactory.createTableColumn("Dtl.gm_std_upri_typ", MCColumnType.TEXT);
		p.columnDtl_stk_std_upri_typ = p.beansFactory.createTableColumn("Dtl.stk_std_upri_typ", MCColumnType.TEXT);
		p.columnDtl_early_ship_dt_add_days = p.beansFactory.createTableColumn("Dtl.early_ship_dt_add_days", MCColumnType.NUMBER);
		p.columnDtl_ac_slip_digit = p.beansFactory.createTableColumn("Dtl.ac_slip_digit", MCColumnType.NUMBER);
		p.columnDtl_ac_slip_seq_flg = p.beansFactory.createTableColumn("Dtl.ac_slip_seq_flg", MCColumnType.CHECK);
		p.columnDtl_sls_bdj_rnd_typ = p.beansFactory.createTableColumn("Dtl.sls_bdj_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_cntry_nm = p.beansFactory.createTableColumn("Dtl.cntry_nm", MCColumnType.TEXT);
		p.columnDtl_area_nm = p.beansFactory.createTableColumn("Dtl.area_nm", MCColumnType.TEXT);
		p.columnDtl_base_cur_nm = p.beansFactory.createTableColumn("Dtl.base_cur_nm", MCColumnType.TEXT);
		p.columnDtl_ptax_cur_nm = p.beansFactory.createTableColumn("Dtl.ptax_cur_nm", MCColumnType.TEXT);
		p.columnDtl_std_cal_nm = p.beansFactory.createTableColumn("Dtl.std_cal_nm", MCColumnType.TEXT);
		p.columnDtl_stk_cl_cal_nm = p.beansFactory.createTableColumn("Dtl.stk_cl_cal_nm", MCColumnType.TEXT);
		p.columnDtl_sls_cl_cal_nm = p.beansFactory.createTableColumn("Dtl.sls_cl_cal_nm", MCColumnType.TEXT);
		p.columnDtl_bill_cl_cal_nm = p.beansFactory.createTableColumn("Dtl.bill_cl_cal_nm", MCColumnType.TEXT);
		p.columnDtl_rcv_cl_cal_nm = p.beansFactory.createTableColumn("Dtl.rcv_cl_cal_nm", MCColumnType.TEXT);
		p.columnDtl_purc_cl_cal_nm = p.beansFactory.createTableColumn("Dtl.purc_cl_cal_nm", MCColumnType.TEXT);
		p.columnDtl_pay_cl_cal_nm = p.beansFactory.createTableColumn("Dtl.pay_cl_cal_nm", MCColumnType.TEXT);
		p.columnDtl_pay_schd_cl_cal_nm = p.beansFactory.createTableColumn("Dtl.pay_schd_cl_cal_nm", MCColumnType.TEXT);
		p.columnDtl_sls_xrate_nm = p.beansFactory.createTableColumn("Dtl.sls_xrate_nm", MCColumnType.TEXT);
		p.columnDtl_purc_xrate_nm = p.beansFactory.createTableColumn("Dtl.purc_xrate_nm", MCColumnType.TEXT);
		p.columnDtl_prov_xrate_nm = p.beansFactory.createTableColumn("Dtl.prov_xrate_nm", MCColumnType.TEXT);
		p.columnDtl_bill_xrate_nm = p.beansFactory.createTableColumn("Dtl.bill_xrate_nm", MCColumnType.TEXT);
		p.columnDtl_pay_xrate_nm = p.beansFactory.createTableColumn("Dtl.pay_xrate_nm", MCColumnType.TEXT);
		p.columnDtl_stk_cl_ba_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_cl_ba_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sls_cl_ba_typ_nm = p.beansFactory.createTableColumn("Dtl.sls_cl_ba_typ_nm", MCColumnType.TEXT);
		p.columnDtl_rcv_cl_ba_typ_nm = p.beansFactory.createTableColumn("Dtl.rcv_cl_ba_typ_nm", MCColumnType.TEXT);
		p.columnDtl_purc_cl_ba_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_cl_ba_typ_nm", MCColumnType.TEXT);
		p.columnDtl_pay_cl_ba_typ_nm = p.beansFactory.createTableColumn("Dtl.pay_cl_ba_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sls_upri_req_typ_nm = p.beansFactory.createTableColumn("Dtl.sls_upri_req_typ_nm", MCColumnType.TEXT);
		p.columnDtl_purc_upri_req_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_upri_req_typ_nm", MCColumnType.TEXT);
		p.columnDtl_outsrc_upri_typ_nm = p.beansFactory.createTableColumn("Dtl.outsrc_upri_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sls_basis_typ_nm = p.beansFactory.createTableColumn("Dtl.sls_basis_typ_nm", MCColumnType.TEXT);
		p.columnDtl_bill_basis_typ_nm = p.beansFactory.createTableColumn("Dtl.bill_basis_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ship_schd_split_typ_nm = p.beansFactory.createTableColumn("Dtl.ship_schd_split_typ_nm", MCColumnType.TEXT);
		p.columnDtl_xfr_stk_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.xfr_stk_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_xrate_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.xrate_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_setoff_tax_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.setoff_tax_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_com_paid_tax_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.com_paid_tax_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_wtax_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.wtax_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_amt_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_amt_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sls_bdj_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.sls_bdj_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_po_print_nm = p.beansFactory.createTableColumn("Dtl.po_print_nm", MCColumnType.TEXT);
		p.columnDtl_gm_std_upri_typ_nm = p.beansFactory.createTableColumn("Dtl.gm_std_upri_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_std_upri_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_std_upri_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_rpt_strg_ext_sys_cd = p.beansFactory.createTableColumn("Dtl.rpt_strg_ext_sys_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_rpt_strg_ext_sys_nm = p.beansFactory.createTableColumn("Dtl.rpt_strg_ext_sys_nm", MCColumnType.TEXT);
		p.columnDtl_cst_prnt_typ = p.beansFactory.createTableColumn("Dtl.cst_prnt_typ", MCColumnType.TEXT);
		p.columnDtl_cst_prnt_typ_nm = p.beansFactory.createTableColumn("Dtl.cst_prnt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_acst_prnt_typ = p.beansFactory.createTableColumn("Dtl.acst_prnt_typ", MCColumnType.TEXT);
		p.columnDtl_acst_prnt_typ_nm = p.beansFactory.createTableColumn("Dtl.acst_prnt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_bcst_prnt_typ = p.beansFactory.createTableColumn("Dtl.bcst_prnt_typ", MCColumnType.TEXT);
		p.columnDtl_bcst_prnt_typ_nm = p.beansFactory.createTableColumn("Dtl.bcst_prnt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_rcst_prnt_typ = p.beansFactory.createTableColumn("Dtl.rcst_prnt_typ", MCColumnType.TEXT);
		p.columnDtl_rcst_prnt_typ_nm = p.beansFactory.createTableColumn("Dtl.rcst_prnt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_prnt_typ = p.beansFactory.createTableColumn("Dtl.dlv_prnt_typ", MCColumnType.TEXT);
		p.columnDtl_dlv_prnt_typ_nm = p.beansFactory.createTableColumn("Dtl.dlv_prnt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_prnt_typ = p.beansFactory.createTableColumn("Dtl.sppl_prnt_typ", MCColumnType.TEXT);
		p.columnDtl_sppl_prnt_typ_nm = p.beansFactory.createTableColumn("Dtl.sppl_prnt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_asppl_prnt_typ = p.beansFactory.createTableColumn("Dtl.asppl_prnt_typ", MCColumnType.TEXT);
		p.columnDtl_asppl_prnt_typ_nm = p.beansFactory.createTableColumn("Dtl.asppl_prnt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_bsppl_prnt_typ = p.beansFactory.createTableColumn("Dtl.bsppl_prnt_typ", MCColumnType.TEXT);
		p.columnDtl_bsppl_prnt_typ_nm = p.beansFactory.createTableColumn("Dtl.bsppl_prnt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_psppl_prnt_typ = p.beansFactory.createTableColumn("Dtl.psppl_prnt_typ", MCColumnType.TEXT);
		p.columnDtl_psppl_prnt_typ_nm = p.beansFactory.createTableColumn("Dtl.psppl_prnt_typ_nm", MCColumnType.TEXT);
	}

	/**
	 * [SubTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSubTab(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.SubTabPanel = p.beansFactory.createPanel("SubTab");
		p.SubTabTab = p.beansFactory.createTabbedPane("SubTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [SubPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSubPanel(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.SubPanelPanel = p.beansFactory.createPanel("SubPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSub]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlSub(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.DtlSubPanel = p.beansFactory.createPanel("DtlSub");
		p.DtlSubScrollPane = p.beansFactory.createScrollPane("DtlSub.scroll");
		p.createDtlSubTable();
		// ブロックの項目の初期化
		p.columnDtlSub_check = p.beansFactory.createTableColumn("DtlSub.check", MCColumnType.CHECK);
		p.columnDtlSub_co_cd = p.beansFactory.createTableColumn("DtlSub.co_cd", MCColumnType.TEXT);
		p.columnDtlSub_sls_tax_cd = p.beansFactory.createTableColumn("DtlSub.sls_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlSub_sls_tax_nm = p.beansFactory.createTableColumn("DtlSub.sls_tax_nm", MCColumnType.TEXT);
		p.columnDtlSub_purc_tax_cd = p.beansFactory.createTableColumn("DtlSub.purc_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlSub_purc_tax_nm = p.beansFactory.createTableColumn("DtlSub.purc_tax_nm", MCColumnType.TEXT);
		p.columnDtlSub_prov_tax_cd = p.beansFactory.createTableColumn("DtlSub.prov_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlSub_prov_tax_nm = p.beansFactory.createTableColumn("DtlSub.prov_tax_nm", MCColumnType.TEXT);
		p.columnDtlSub_memo1 = p.beansFactory.createTableColumn("DtlSub.memo1", MCColumnType.TEXT);
		p.columnDtlSub_memo2 = p.beansFactory.createTableColumn("DtlSub.memo2", MCColumnType.TEXT);
		p.columnDtlSub_memo3 = p.beansFactory.createTableColumn("DtlSub.memo3", MCColumnType.TEXT);
		p.columnDtlSub_ins_usr_id = p.beansFactory.createTableColumn("DtlSub.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlSub_ins_usr_nm = p.beansFactory.createTableColumn("DtlSub.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlSub_ins_ts = p.beansFactory.createTableColumn("DtlSub.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlSub_ins_func_id = p.beansFactory.createTableColumn("DtlSub.ins_func_id", MCColumnType.TEXT);
		p.columnDtlSub_ins_func_nm = p.beansFactory.createTableColumn("DtlSub.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlSub_upd_cntr = p.beansFactory.createTableColumn("DtlSub.upd_cntr", MCColumnType.NUMBER);
		p.columnDtlSub_upd_usr_id = p.beansFactory.createTableColumn("DtlSub.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlSub_upd_usr_nm = p.beansFactory.createTableColumn("DtlSub.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlSub_upd_ts = p.beansFactory.createTableColumn("DtlSub.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlSub_upd_func_id = p.beansFactory.createTableColumn("DtlSub.upd_func_id", MCColumnType.TEXT);
		p.columnDtlSub_upd_func_nm = p.beansFactory.createTableColumn("DtlSub.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlSub_upd_srv_req_no = p.beansFactory.createTableColumn("DtlSub.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [DtlSubBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlSubBtn(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.DtlSubBtnPanel = p.beansFactory.createPanel("DtlSubBtn");
		// ブロックの項目の初期化
		p.DtlSubBtn_select_all = p.beansFactory.createButton("DtlSubBtn.select_all", "no_border");
		p.DtlSubBtn_deselect_all = p.beansFactory.createButton("DtlSubBtn.deselect_all", "no_border");
		p.DtlSubBtn_radd = p.beansFactory.createButton("DtlSubBtn.radd", "no_border");
		p.DtlSubBtn_rdel = p.beansFactory.createButton("DtlSubBtn.rdel", "no_border");
		p.DtlSubBtn_rcopy = p.beansFactory.createButton("DtlSubBtn.rcopy", "no_border");
	}

	/**
	 * [LclPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclPanel(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.LclPanelPanel = p.beansFactory.createPanel("LclPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_co_cd = p.beansFactory.createTableColumn("Lcl.co_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_co_alt_nm1 = p.beansFactory.createTableColumn("Lcl.co_alt_nm1", MCColumnType.TEXT);
		p.columnLcl_co_alt_nm2 = p.beansFactory.createTableColumn("Lcl.co_alt_nm2", MCColumnType.TEXT);
		p.columnLcl_co_alt_nm3 = p.beansFactory.createTableColumn("Lcl.co_alt_nm3", MCColumnType.TEXT);
		p.columnLcl_co_alt_nm4 = p.beansFactory.createTableColumn("Lcl.co_alt_nm4", MCColumnType.TEXT);
		p.columnLcl_zip_cd = p.beansFactory.createTableColumn("Lcl.zip_cd", MCColumnType.TEXT);
		p.columnLcl_addr1 = p.beansFactory.createTableColumn("Lcl.addr1", MCColumnType.TEXT);
		p.columnLcl_addr2 = p.beansFactory.createTableColumn("Lcl.addr2", MCColumnType.TEXT);
		p.columnLcl_addr3 = p.beansFactory.createTableColumn("Lcl.addr3", MCColumnType.TEXT);
		p.columnLcl_addr4 = p.beansFactory.createTableColumn("Lcl.addr4", MCColumnType.TEXT);
		p.columnLcl_tel = p.beansFactory.createTableColumn("Lcl.tel", MCColumnType.TEXT);
		p.columnLcl_fax = p.beansFactory.createTableColumn("Lcl.fax", MCColumnType.TEXT);
		p.columnLcl_co_repl_nm = p.beansFactory.createTableColumn("Lcl.co_repl_nm", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
		p.columnLcl_ins_usr_id = p.beansFactory.createTableColumn("Lcl.ins_usr_id", MCColumnType.TEXT);
		p.columnLcl_ins_usr_nm = p.beansFactory.createTableColumn("Lcl.ins_usr_nm", MCColumnType.TEXT);
		p.columnLcl_ins_ts = p.beansFactory.createTableColumn("Lcl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_ins_func_id = p.beansFactory.createTableColumn("Lcl.ins_func_id", MCColumnType.TEXT);
		p.columnLcl_ins_func_nm = p.beansFactory.createTableColumn("Lcl.ins_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_cntr = p.beansFactory.createTableColumn("Lcl.upd_cntr", MCColumnType.NUMBER);
		p.columnLcl_upd_usr_id = p.beansFactory.createTableColumn("Lcl.upd_usr_id", MCColumnType.TEXT);
		p.columnLcl_upd_usr_nm = p.beansFactory.createTableColumn("Lcl.upd_usr_nm", MCColumnType.TEXT);
		p.columnLcl_upd_ts = p.beansFactory.createTableColumn("Lcl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_upd_func_id = p.beansFactory.createTableColumn("Lcl.upd_func_id", MCColumnType.TEXT);
		p.columnLcl_upd_func_nm = p.beansFactory.createTableColumn("Lcl.upd_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_srv_req_no = p.beansFactory.createTableColumn("Lcl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel = p.beansFactory.createPanel("LclBtn");
		// ブロックの項目の初期化
		p.LclBtn_select_all = p.beansFactory.createButton("LclBtn.select_all", "no_border");
		p.LclBtn_deselect_all = p.beansFactory.createButton("LclBtn.deselect_all", "no_border");
		p.LclBtn_radd = p.beansFactory.createButton("LclBtn.radd", "no_border");
		p.LclBtn_rdel = p.beansFactory.createButton("LclBtn.rdel", "no_border");
		p.LclBtn_rcopy = p.beansFactory.createButton("LclBtn.rcopy", "no_border");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_CoReg p) {
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
	protected static void jbInitCnd(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.TabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD_ADMIN);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0020.CndR.ope_META);
		p.CndPanel.add(p.Cnd_co_cd_Label);
		p.CndPanel.add(p.Cnd_co_cd);
		p.CndPanel.setLastBeans(p.Cnd_co_cd);
		p.Cnd_co_cd.setNextBeans(p.Cnd_co_nm_lcl);
		p.Cnd_co_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0020.CndR.co_cd_META);
		p.CndPanel.add(p.Cnd_co_nm_lcl);
		p.Cnd_co_nm_lcl.setNextBeans(p.Cnd_srch);
		p.Cnd_co_nm_lcl.setRow(p.getCndR(), mcframe.clientMABC.MABCP0020.CndR.co_nm_lcl_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.add(p.TabPanel);
		p.TabPanel.setNextBeans(p.BtnPanel);
		p.TabPanel.add(p.TabTab);
		p.TabPanel.setLastBeans(p.TabTab);
		p.TabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.TabTab.add(p.Upd1Panel, "Tab.upd1");
		p.TabTab.setLastBeans(p.Upd1Panel);
		p.Upd1Panel.setNextBeans(p.Upd2Panel);
		p.TabTab.add(p.Upd2Panel, "Tab.upd2");
		p.Upd2Panel.setNextBeans(p.Upd3Panel);
		p.TabTab.add(p.Upd3Panel, "Tab.upd3");
		p.Upd3Panel.setNextBeans(p.Upd4Panel);
		p.TabTab.add(p.Upd4Panel, "Tab.upd4");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.BasePanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd_admin);
		p.Btn_upd_admin.setIcon("REGISTER");
		p.Btn_upd_admin.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_admin);
	}

	/**
	 * [Upd1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpd1(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd1Panel.setNextBeans(p.Upd2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Upd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpd2(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd2Panel.setNextBeans(p.Upd3Panel);
		// ブロックの項目の初期化
		p.Upd2Panel.add(p.Upd21Panel, null);
		p.Upd2Panel.setLastBeans(p.Upd21Panel);
		p.Upd21Panel.setNextBeans(p.Upd22Panel);
		p.Upd2Panel.add(p.Upd22Panel, null);
	}

	/**
	 * [Upd21]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpd21(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd21Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Upd22]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpd22(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd22Panel.setBorder(p.Upd22TitledBorder);
		p.Upd22Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Upd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpd3(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.Upd3Panel.setNextBeans(p.Upd4Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Upd4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpd4(MABCP_CoReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Base]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.add(p.BasePanel);
		p.BasePanel.setNextBeans(p.DtlPanel);
		// ブロックの項目の初期化
		p.BasePanel.add(p.Base_co_cd);
		p.BasePanel.setLastBeans(p.Base_co_cd);
		p.Base_co_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.co_cd_META);
		p.Upd1Panel.add(p.Base_co_alt_nm1_Label);
		p.Upd1Panel.add(p.Base_co_alt_nm1);
		p.Upd1Panel.setLastBeans(p.Base_co_alt_nm1);
		p.Base_co_alt_nm1.setNextBeans(p.Base_co_alt_nm2);
		p.Base_co_alt_nm1.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.co_alt_nm1_META);
		p.Upd1Panel.add(p.Base_co_alt_nm2_Label);
		p.Upd1Panel.add(p.Base_co_alt_nm2);
		p.Base_co_alt_nm2.setNextBeans(p.Base_co_alt_nm3);
		p.Base_co_alt_nm2.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.co_alt_nm2_META);
		p.Upd1Panel.add(p.Base_co_alt_nm3_Label);
		p.Upd1Panel.add(p.Base_co_alt_nm3);
		p.Base_co_alt_nm3.setNextBeans(p.Base_co_alt_nm4);
		p.Base_co_alt_nm3.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.co_alt_nm3_META);
		p.Upd1Panel.add(p.Base_co_alt_nm4_Label);
		p.Upd1Panel.add(p.Base_co_alt_nm4);
		p.Base_co_alt_nm4.setNextBeans(p.Base_cntry_cd);
		p.Base_co_alt_nm4.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.co_alt_nm4_META);
		p.Base_cntry_cd.setListType(MCListType.STRICT);
		p.Base_cntry_cd.setLinkBeans(p.Base_cntry_nm);
		p.Upd1Panel.add(p.Base_cntry_cd_Label);
		p.Upd1Panel.add(p.Base_cntry_cd);
		p.Base_cntry_cd.setNextBeans(p.Base_cntry_nm);
		p.Base_cntry_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.cntry_cd_META);
		p.Upd1Panel.add(p.Base_cntry_nm);
		p.Base_cntry_nm.setNextBeans(p.Base_area_cd);
		p.Base_cntry_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.cntry_nm_META);
		p.Base_area_cd.setListType(MCListType.STRICT);
		p.Base_area_cd.setLinkBeans(p.Base_area_nm);
		p.Upd1Panel.add(p.Base_area_cd_Label);
		p.Upd1Panel.add(p.Base_area_cd);
		p.Base_area_cd.setNextBeans(p.Base_area_nm);
		p.Base_area_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.area_cd_META);
		p.Upd1Panel.add(p.Base_area_nm);
		p.Base_area_nm.setNextBeans(p.Base_zip_cd);
		p.Base_area_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.area_nm_META);
		p.Upd1Panel.add(p.Base_zip_cd_Label);
		p.Upd1Panel.add(p.Base_zip_cd);
		p.Base_zip_cd.setNextBeans(p.Base_addr1);
		p.Base_zip_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.zip_cd_META);
		p.Upd1Panel.add(p.Base_addr1_Label);
		p.Upd1Panel.add(p.Base_addr1);
		p.Base_addr1.setNextBeans(p.Base_addr2);
		p.Base_addr1.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.addr1_META);
		p.Upd1Panel.add(p.Base_addr2_Label);
		p.Upd1Panel.add(p.Base_addr2);
		p.Base_addr2.setNextBeans(p.Base_addr3);
		p.Base_addr2.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.addr2_META);
		p.Upd1Panel.add(p.Base_addr3_Label);
		p.Upd1Panel.add(p.Base_addr3);
		p.Base_addr3.setNextBeans(p.Base_addr4);
		p.Base_addr3.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.addr3_META);
		p.Upd1Panel.add(p.Base_addr4_Label);
		p.Upd1Panel.add(p.Base_addr4);
		p.Base_addr4.setNextBeans(p.Base_tel);
		p.Base_addr4.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.addr4_META);
		p.Upd1Panel.add(p.Base_tel_Label);
		p.Upd1Panel.add(p.Base_tel);
		p.Base_tel.setNextBeans(p.Base_fax);
		p.Base_tel.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.tel_META);
		p.Upd1Panel.add(p.Base_fax_Label);
		p.Upd1Panel.add(p.Base_fax);
		p.Base_fax.setNextBeans(p.Base_co_repl_nm);
		p.Base_fax.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.fax_META);
		p.Upd1Panel.add(p.Base_co_repl_nm_Label);
		p.Upd1Panel.add(p.Base_co_repl_nm);
		p.Base_co_repl_nm.setNextBeans(p.Base_biz_co_no);
		p.Base_co_repl_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.co_repl_nm_META);
		p.Upd1Panel.add(p.Base_biz_co_no_Label);
		p.Upd1Panel.add(p.Base_biz_co_no);
		p.Base_biz_co_no.setNextBeans(p.Base_ein);
		p.Base_biz_co_no.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.biz_co_no_META);
		p.Upd1Panel.add(p.Base_ein_Label);
		p.Upd1Panel.add(p.Base_ein);
		p.Base_ein.setNextBeans(p.Base_std_co_cd);
		p.Base_ein.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ein_META);
		p.Upd1Panel.add(p.Base_std_co_cd_Label);
		p.Upd1Panel.add(p.Base_std_co_cd);
		p.Base_std_co_cd.setNextBeans(p.Base_base_cur_cd);
		p.Base_std_co_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.std_co_cd_META);
		p.Base_base_cur_cd.setListType(MCListType.STRICT);
		p.Base_base_cur_cd.setLinkBeans(p.Base_base_cur_nm);
		p.Upd1Panel.add(p.Base_base_cur_cd_Label);
		p.Upd1Panel.add(p.Base_base_cur_cd);
		p.Base_base_cur_cd.setNextBeans(p.Base_base_cur_nm);
		p.Base_base_cur_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.base_cur_cd_META);
		p.Upd1Panel.add(p.Base_base_cur_nm);
		p.Base_base_cur_nm.setNextBeans(p.Base_ptax_cur_cd);
		p.Base_base_cur_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.base_cur_nm_META);
		p.Base_ptax_cur_cd.setListType(MCListType.STRICT);
		p.Base_ptax_cur_cd.setLinkBeans(p.Base_ptax_cur_nm);
		p.Upd1Panel.add(p.Base_ptax_cur_cd_Label);
		p.Upd1Panel.add(p.Base_ptax_cur_cd);
		p.Base_ptax_cur_cd.setNextBeans(p.Base_ptax_cur_nm);
		p.Base_ptax_cur_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ptax_cur_cd_META);
		p.Upd1Panel.add(p.Base_ptax_cur_nm);
		p.Base_ptax_cur_nm.setNextBeans(p.Base_ac_cl_day);
		p.Base_ptax_cur_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ptax_cur_nm_META);
		p.Upd1Panel.add(p.Base_ac_cl_day_Label);
		p.Upd1Panel.add(p.Base_ac_cl_day);
		p.Base_ac_cl_day.setNextBeans(p.Base_ac_cl_mon_base);
		p.Base_ac_cl_day.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ac_cl_day_META);
		p.Upd1Panel.add(p.Base_ac_cl_mon_base_Label);
		p.Upd1Panel.add(p.Base_ac_cl_mon_base);
		p.Base_ac_cl_mon_base.setNextBeans(p.Base_st_mon);
		p.Base_ac_cl_mon_base.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ac_cl_mon_base_META);
		p.Base_ac_cl_mon_base.setMinusEnable(true);
		p.Upd1Panel.add(p.Base_st_mon_Label);
		p.Upd1Panel.add(p.Base_st_mon);
		p.Base_st_mon.setNextBeans(p.Base_dt_switch_time);
		p.Base_st_mon.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.st_mon_META);
		p.Upd1Panel.add(p.Base_dt_switch_time_Label);
		p.Upd1Panel.add(p.Base_dt_switch_time);
		p.Base_dt_switch_time.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.dt_switch_time_META);
		p.Base_dt_switch_time.setMinusEnable(true);
		p.Base_std_cal_cd.setListType(MCListType.STRICT);
		p.Base_std_cal_cd.setLinkBeans(p.Base_std_cal_nm);
		p.Upd21Panel.add(p.Base_std_cal_cd_Label);
		p.Upd21Panel.add(p.Base_std_cal_cd);
		p.Upd21Panel.setLastBeans(p.Base_std_cal_cd);
		p.Base_std_cal_cd.setNextBeans(p.Base_std_cal_nm);
		p.Base_std_cal_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.std_cal_cd_META);
		p.Upd21Panel.add(p.Base_std_cal_nm);
		p.Base_std_cal_nm.setNextBeans(p.Base_ar_no_use_flg);
		p.Base_std_cal_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.std_cal_nm_META);
		p.Upd21Panel.add(p.Base_ar_no_use_flg);
		p.Base_ar_no_use_flg.setNextBeans(p.Base_ap_no_use_flg);
		p.Base_ar_no_use_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ar_no_use_flg_META);
		p.Upd21Panel.add(p.Base_ap_no_use_flg);
		p.Base_ap_no_use_flg.setNextBeans(p.Base_temp_ap_use_flg);
		p.Base_ap_no_use_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ap_no_use_flg_META);
		p.Upd21Panel.add(p.Base_temp_ap_use_flg);
		p.Base_temp_ap_use_flg.setNextBeans(p.Base_sls_cl_flg);
		p.Base_temp_ap_use_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.temp_ap_use_flg_META);
		p.Upd21Panel.add(p.Base_sls_cl_flg);
		p.Base_sls_cl_flg.setNextBeans(p.Base_rcv_cl_flg);
		p.Base_sls_cl_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_cl_flg_META);
		p.Upd21Panel.add(p.Base_rcv_cl_flg);
		p.Base_rcv_cl_flg.setNextBeans(p.Base_purc_cl_flg);
		p.Base_rcv_cl_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rcv_cl_flg_META);
		p.Upd21Panel.add(p.Base_purc_cl_flg);
		p.Base_purc_cl_flg.setNextBeans(p.Base_pay_cl_flg);
		p.Base_purc_cl_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_cl_flg_META);
		p.Upd21Panel.add(p.Base_pay_cl_flg);
		p.Base_pay_cl_flg.setNextBeans(p.Base_sls_cl_cal_cd);
		p.Base_pay_cl_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_cl_flg_META);
		p.Base_sls_cl_cal_cd.setListType(MCListType.STRICT);
		p.Base_sls_cl_cal_cd.setLinkBeans(p.Base_sls_cl_cal_nm);
		p.Upd21Panel.add(p.Base_sls_cl_cal_cd_Label);
		p.Upd21Panel.add(p.Base_sls_cl_cal_cd);
		p.Base_sls_cl_cal_cd.setNextBeans(p.Base_sls_cl_cal_nm);
		p.Base_sls_cl_cal_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_cl_cal_cd_META);
		p.Upd21Panel.add(p.Base_sls_cl_cal_nm);
		p.Base_sls_cl_cal_nm.setNextBeans(p.Base_sls_cl_delay_days);
		p.Base_sls_cl_cal_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_cl_cal_nm_META);
		p.Upd21Panel.add(p.Base_sls_cl_delay_days_Label);
		p.Upd21Panel.add(p.Base_sls_cl_delay_days);
		p.Base_sls_cl_delay_days.setNextBeans(p.Base_sls_cl_ba_typ);
		p.Base_sls_cl_delay_days.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_cl_delay_days_META);
		p.Base_sls_cl_ba_typ.setListType(MCListType.STRICT);
		p.Base_sls_cl_ba_typ.setLinkBeans(p.Base_sls_cl_ba_typ_nm);
		p.Upd21Panel.add(p.Base_sls_cl_ba_typ_Label);
		p.Upd21Panel.add(p.Base_sls_cl_ba_typ);
		p.Base_sls_cl_ba_typ.setNextBeans(p.Base_sls_cl_ba_typ_nm);
		p.Base_sls_cl_ba_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_cl_ba_typ_META);
		p.Upd21Panel.add(p.Base_sls_cl_ba_typ_nm);
		p.Base_sls_cl_ba_typ_nm.setNextBeans(p.Base_rcv_cl_cal_cd);
		p.Base_sls_cl_ba_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_cl_ba_typ_nm_META);
		p.Base_rcv_cl_cal_cd.setListType(MCListType.STRICT);
		p.Base_rcv_cl_cal_cd.setLinkBeans(p.Base_rcv_cl_cal_nm);
		p.Upd21Panel.add(p.Base_rcv_cl_cal_cd_Label);
		p.Upd21Panel.add(p.Base_rcv_cl_cal_cd);
		p.Base_rcv_cl_cal_cd.setNextBeans(p.Base_rcv_cl_cal_nm);
		p.Base_rcv_cl_cal_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rcv_cl_cal_cd_META);
		p.Upd21Panel.add(p.Base_rcv_cl_cal_nm);
		p.Base_rcv_cl_cal_nm.setNextBeans(p.Base_rcv_cl_delay_days);
		p.Base_rcv_cl_cal_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rcv_cl_cal_nm_META);
		p.Upd21Panel.add(p.Base_rcv_cl_delay_days_Label);
		p.Upd21Panel.add(p.Base_rcv_cl_delay_days);
		p.Base_rcv_cl_delay_days.setNextBeans(p.Base_rcv_cl_ba_typ);
		p.Base_rcv_cl_delay_days.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rcv_cl_delay_days_META);
		p.Base_rcv_cl_ba_typ.setListType(MCListType.STRICT);
		p.Base_rcv_cl_ba_typ.setLinkBeans(p.Base_rcv_cl_ba_typ_nm);
		p.Upd21Panel.add(p.Base_rcv_cl_ba_typ_Label);
		p.Upd21Panel.add(p.Base_rcv_cl_ba_typ);
		p.Base_rcv_cl_ba_typ.setNextBeans(p.Base_rcv_cl_ba_typ_nm);
		p.Base_rcv_cl_ba_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rcv_cl_ba_typ_META);
		p.Upd21Panel.add(p.Base_rcv_cl_ba_typ_nm);
		p.Base_rcv_cl_ba_typ_nm.setNextBeans(p.Base_purc_cl_cal_cd);
		p.Base_rcv_cl_ba_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rcv_cl_ba_typ_nm_META);
		p.Base_purc_cl_cal_cd.setListType(MCListType.STRICT);
		p.Base_purc_cl_cal_cd.setLinkBeans(p.Base_purc_cl_cal_nm);
		p.Upd21Panel.add(p.Base_purc_cl_cal_cd_Label);
		p.Upd21Panel.add(p.Base_purc_cl_cal_cd);
		p.Base_purc_cl_cal_cd.setNextBeans(p.Base_purc_cl_cal_nm);
		p.Base_purc_cl_cal_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_cl_cal_cd_META);
		p.Upd21Panel.add(p.Base_purc_cl_cal_nm);
		p.Base_purc_cl_cal_nm.setNextBeans(p.Base_purc_cl_delay_days);
		p.Base_purc_cl_cal_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_cl_cal_nm_META);
		p.Upd21Panel.add(p.Base_purc_cl_delay_days_Label);
		p.Upd21Panel.add(p.Base_purc_cl_delay_days);
		p.Base_purc_cl_delay_days.setNextBeans(p.Base_purc_cl_ba_typ);
		p.Base_purc_cl_delay_days.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_cl_delay_days_META);
		p.Base_purc_cl_ba_typ.setListType(MCListType.STRICT);
		p.Base_purc_cl_ba_typ.setLinkBeans(p.Base_purc_cl_ba_typ_nm);
		p.Upd21Panel.add(p.Base_purc_cl_ba_typ_Label);
		p.Upd21Panel.add(p.Base_purc_cl_ba_typ);
		p.Base_purc_cl_ba_typ.setNextBeans(p.Base_purc_cl_ba_typ_nm);
		p.Base_purc_cl_ba_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_cl_ba_typ_META);
		p.Upd21Panel.add(p.Base_purc_cl_ba_typ_nm);
		p.Base_purc_cl_ba_typ_nm.setNextBeans(p.Base_pay_cl_cal_cd);
		p.Base_purc_cl_ba_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_cl_ba_typ_nm_META);
		p.Base_pay_cl_cal_cd.setListType(MCListType.STRICT);
		p.Base_pay_cl_cal_cd.setLinkBeans(p.Base_pay_cl_cal_nm);
		p.Upd21Panel.add(p.Base_pay_cl_cal_cd_Label);
		p.Upd21Panel.add(p.Base_pay_cl_cal_cd);
		p.Base_pay_cl_cal_cd.setNextBeans(p.Base_pay_cl_cal_nm);
		p.Base_pay_cl_cal_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_cl_cal_cd_META);
		p.Upd21Panel.add(p.Base_pay_cl_cal_nm);
		p.Base_pay_cl_cal_nm.setNextBeans(p.Base_pay_cl_delay_days);
		p.Base_pay_cl_cal_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_cl_cal_nm_META);
		p.Upd21Panel.add(p.Base_pay_cl_delay_days_Label);
		p.Upd21Panel.add(p.Base_pay_cl_delay_days);
		p.Base_pay_cl_delay_days.setNextBeans(p.Base_pay_cl_ba_typ);
		p.Base_pay_cl_delay_days.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_cl_delay_days_META);
		p.Base_pay_cl_ba_typ.setListType(MCListType.STRICT);
		p.Base_pay_cl_ba_typ.setLinkBeans(p.Base_pay_cl_ba_typ_nm);
		p.Upd21Panel.add(p.Base_pay_cl_ba_typ_Label);
		p.Upd21Panel.add(p.Base_pay_cl_ba_typ);
		p.Base_pay_cl_ba_typ.setNextBeans(p.Base_pay_cl_ba_typ_nm);
		p.Base_pay_cl_ba_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_cl_ba_typ_META);
		p.Upd21Panel.add(p.Base_pay_cl_ba_typ_nm);
		p.Base_pay_cl_ba_typ_nm.setNextBeans(p.Base_stk_cl_cal_cd);
		p.Base_pay_cl_ba_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_cl_ba_typ_nm_META);
		p.Base_stk_cl_cal_cd.setListType(MCListType.STRICT);
		p.Base_stk_cl_cal_cd.setLinkBeans(p.Base_stk_cl_cal_nm);
		p.Upd21Panel.add(p.Base_stk_cl_cal_cd_Label);
		p.Upd21Panel.add(p.Base_stk_cl_cal_cd);
		p.Base_stk_cl_cal_cd.setNextBeans(p.Base_stk_cl_cal_nm);
		p.Base_stk_cl_cal_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_cl_cal_cd_META);
		p.Upd21Panel.add(p.Base_stk_cl_cal_nm);
		p.Base_stk_cl_cal_nm.setNextBeans(p.Base_stk_cl_delay_days);
		p.Base_stk_cl_cal_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_cl_cal_nm_META);
		p.Upd21Panel.add(p.Base_stk_cl_delay_days_Label);
		p.Upd21Panel.add(p.Base_stk_cl_delay_days);
		p.Base_stk_cl_delay_days.setNextBeans(p.Base_stk_cl_ba_typ);
		p.Base_stk_cl_delay_days.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_cl_delay_days_META);
		p.Base_stk_cl_ba_typ.setListType(MCListType.STRICT);
		p.Base_stk_cl_ba_typ.setLinkBeans(p.Base_stk_cl_ba_typ_nm);
		p.Upd21Panel.add(p.Base_stk_cl_ba_typ_Label);
		p.Upd21Panel.add(p.Base_stk_cl_ba_typ);
		p.Base_stk_cl_ba_typ.setNextBeans(p.Base_stk_cl_ba_typ_nm);
		p.Base_stk_cl_ba_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_cl_ba_typ_META);
		p.Upd21Panel.add(p.Base_stk_cl_ba_typ_nm);
		p.Base_stk_cl_ba_typ_nm.setNextBeans(p.Base_bill_cl_cal_cd);
		p.Base_stk_cl_ba_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_cl_ba_typ_nm_META);
		p.Base_bill_cl_cal_cd.setListType(MCListType.STRICT);
		p.Base_bill_cl_cal_cd.setLinkBeans(p.Base_bill_cl_cal_nm);
		p.Upd21Panel.add(p.Base_bill_cl_cal_cd_Label);
		p.Upd21Panel.add(p.Base_bill_cl_cal_cd);
		p.Base_bill_cl_cal_cd.setNextBeans(p.Base_bill_cl_cal_nm);
		p.Base_bill_cl_cal_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bill_cl_cal_cd_META);
		p.Upd21Panel.add(p.Base_bill_cl_cal_nm);
		p.Base_bill_cl_cal_nm.setNextBeans(p.Base_pay_schd_cl_cal_cd);
		p.Base_bill_cl_cal_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bill_cl_cal_nm_META);
		p.Base_pay_schd_cl_cal_cd.setListType(MCListType.STRICT);
		p.Base_pay_schd_cl_cal_cd.setLinkBeans(p.Base_pay_schd_cl_cal_nm);
		p.Upd21Panel.add(p.Base_pay_schd_cl_cal_cd_Label);
		p.Upd21Panel.add(p.Base_pay_schd_cl_cal_cd);
		p.Base_pay_schd_cl_cal_cd.setNextBeans(p.Base_pay_schd_cl_cal_nm);
		p.Base_pay_schd_cl_cal_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_schd_cl_cal_cd_META);
		p.Upd21Panel.add(p.Base_pay_schd_cl_cal_nm);
		p.Base_pay_schd_cl_cal_nm.setNextBeans(p.Base_bill_xrate_conv_flg);
		p.Base_pay_schd_cl_cal_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_schd_cl_cal_nm_META);
		p.Upd21Panel.add(p.Base_bill_xrate_conv_flg);
		p.Base_bill_xrate_conv_flg.setNextBeans(p.Base_pay_xrate_conv_flg);
		p.Base_bill_xrate_conv_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bill_xrate_conv_flg_META);
		p.Upd21Panel.add(p.Base_pay_xrate_conv_flg);
		p.Base_pay_xrate_conv_flg.setNextBeans(p.Base_sls_xrate_cd);
		p.Base_pay_xrate_conv_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_xrate_conv_flg_META);
		p.Base_sls_xrate_cd.setListType(MCListType.STRICT);
		p.Base_sls_xrate_cd.setLinkBeans(p.Base_sls_xrate_nm);
		p.Upd21Panel.add(p.Base_sls_xrate_cd_Label);
		p.Upd21Panel.add(p.Base_sls_xrate_cd);
		p.Base_sls_xrate_cd.setNextBeans(p.Base_sls_xrate_nm);
		p.Base_sls_xrate_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_xrate_cd_META);
		p.Upd21Panel.add(p.Base_sls_xrate_nm);
		p.Base_sls_xrate_nm.setNextBeans(p.Base_purc_xrate_cd);
		p.Base_sls_xrate_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_xrate_nm_META);
		p.Base_purc_xrate_cd.setListType(MCListType.STRICT);
		p.Base_purc_xrate_cd.setLinkBeans(p.Base_purc_xrate_nm);
		p.Upd21Panel.add(p.Base_purc_xrate_cd_Label);
		p.Upd21Panel.add(p.Base_purc_xrate_cd);
		p.Base_purc_xrate_cd.setNextBeans(p.Base_purc_xrate_nm);
		p.Base_purc_xrate_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_xrate_cd_META);
		p.Upd21Panel.add(p.Base_purc_xrate_nm);
		p.Base_purc_xrate_nm.setNextBeans(p.Base_prov_xrate_cd);
		p.Base_purc_xrate_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_xrate_nm_META);
		p.Base_prov_xrate_cd.setListType(MCListType.STRICT);
		p.Base_prov_xrate_cd.setLinkBeans(p.Base_prov_xrate_nm);
		p.Upd21Panel.add(p.Base_prov_xrate_cd_Label);
		p.Upd21Panel.add(p.Base_prov_xrate_cd);
		p.Base_prov_xrate_cd.setNextBeans(p.Base_prov_xrate_nm);
		p.Base_prov_xrate_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.prov_xrate_cd_META);
		p.Upd21Panel.add(p.Base_prov_xrate_nm);
		p.Base_prov_xrate_nm.setNextBeans(p.Base_bill_xrate_cd);
		p.Base_prov_xrate_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.prov_xrate_nm_META);
		p.Base_bill_xrate_cd.setListType(MCListType.STRICT);
		p.Base_bill_xrate_cd.setLinkBeans(p.Base_bill_xrate_nm);
		p.Upd21Panel.add(p.Base_bill_xrate_cd_Label);
		p.Upd21Panel.add(p.Base_bill_xrate_cd);
		p.Base_bill_xrate_cd.setNextBeans(p.Base_bill_xrate_nm);
		p.Base_bill_xrate_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bill_xrate_cd_META);
		p.Upd21Panel.add(p.Base_bill_xrate_nm);
		p.Base_bill_xrate_nm.setNextBeans(p.Base_pay_xrate_cd);
		p.Base_bill_xrate_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bill_xrate_nm_META);
		p.Base_pay_xrate_cd.setListType(MCListType.STRICT);
		p.Base_pay_xrate_cd.setLinkBeans(p.Base_pay_xrate_nm);
		p.Upd21Panel.add(p.Base_pay_xrate_cd_Label);
		p.Upd21Panel.add(p.Base_pay_xrate_cd);
		p.Base_pay_xrate_cd.setNextBeans(p.Base_pay_xrate_nm);
		p.Base_pay_xrate_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_xrate_cd_META);
		p.Upd21Panel.add(p.Base_pay_xrate_nm);
		p.Base_pay_xrate_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.pay_xrate_nm_META);
		p.Upd22Panel.add(p.Base_mon01_xrate_rev_flg);
		p.Upd22Panel.setLastBeans(p.Base_mon01_xrate_rev_flg);
		p.Base_mon01_xrate_rev_flg.setNextBeans(p.Base_mon02_xrate_rev_flg);
		p.Base_mon01_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon01_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon02_xrate_rev_flg);
		p.Base_mon02_xrate_rev_flg.setNextBeans(p.Base_mon03_xrate_rev_flg);
		p.Base_mon02_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon02_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon03_xrate_rev_flg);
		p.Base_mon03_xrate_rev_flg.setNextBeans(p.Base_mon04_xrate_rev_flg);
		p.Base_mon03_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon03_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon04_xrate_rev_flg);
		p.Base_mon04_xrate_rev_flg.setNextBeans(p.Base_mon05_xrate_rev_flg);
		p.Base_mon04_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon04_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon05_xrate_rev_flg);
		p.Base_mon05_xrate_rev_flg.setNextBeans(p.Base_mon06_xrate_rev_flg);
		p.Base_mon05_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon05_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon06_xrate_rev_flg);
		p.Base_mon06_xrate_rev_flg.setNextBeans(p.Base_mon07_xrate_rev_flg);
		p.Base_mon06_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon06_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon07_xrate_rev_flg);
		p.Base_mon07_xrate_rev_flg.setNextBeans(p.Base_mon08_xrate_rev_flg);
		p.Base_mon07_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon07_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon08_xrate_rev_flg);
		p.Base_mon08_xrate_rev_flg.setNextBeans(p.Base_mon09_xrate_rev_flg);
		p.Base_mon08_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon08_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon09_xrate_rev_flg);
		p.Base_mon09_xrate_rev_flg.setNextBeans(p.Base_mon10_xrate_rev_flg);
		p.Base_mon09_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon09_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon10_xrate_rev_flg);
		p.Base_mon10_xrate_rev_flg.setNextBeans(p.Base_mon11_xrate_rev_flg);
		p.Base_mon10_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon10_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon11_xrate_rev_flg);
		p.Base_mon11_xrate_rev_flg.setNextBeans(p.Base_mon12_xrate_rev_flg);
		p.Base_mon11_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon11_xrate_rev_flg_META);
		p.Upd22Panel.add(p.Base_mon12_xrate_rev_flg);
		p.Base_mon12_xrate_rev_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.mon12_xrate_rev_flg_META);
		p.Base_sls_upri_req_typ.setListType(MCListType.STRICT);
		p.Base_sls_upri_req_typ.setLinkBeans(p.Base_sls_upri_req_typ_nm);
		p.Upd3Panel.add(p.Base_sls_upri_req_typ_Label);
		p.Upd3Panel.add(p.Base_sls_upri_req_typ);
		p.Upd3Panel.setLastBeans(p.Base_sls_upri_req_typ);
		p.Base_sls_upri_req_typ.setNextBeans(p.Base_sls_upri_req_typ_nm);
		p.Base_sls_upri_req_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_upri_req_typ_META);
		p.Upd3Panel.add(p.Base_sls_upri_req_typ_nm);
		p.Base_sls_upri_req_typ_nm.setNextBeans(p.Base_sls_basis_typ);
		p.Base_sls_upri_req_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_upri_req_typ_nm_META);
		p.Base_sls_basis_typ.setListType(MCListType.STRICT);
		p.Base_sls_basis_typ.setLinkBeans(p.Base_sls_basis_typ_nm);
		p.Upd3Panel.add(p.Base_sls_basis_typ_Label);
		p.Upd3Panel.add(p.Base_sls_basis_typ);
		p.Base_sls_basis_typ.setNextBeans(p.Base_sls_basis_typ_nm);
		p.Base_sls_basis_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_basis_typ_META);
		p.Upd3Panel.add(p.Base_sls_basis_typ_nm);
		p.Base_sls_basis_typ_nm.setNextBeans(p.Base_bill_basis_typ);
		p.Base_sls_basis_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_basis_typ_nm_META);
		p.Base_bill_basis_typ.setListType(MCListType.STRICT);
		p.Base_bill_basis_typ.setLinkBeans(p.Base_bill_basis_typ_nm);
		p.Upd3Panel.add(p.Base_bill_basis_typ_Label);
		p.Upd3Panel.add(p.Base_bill_basis_typ);
		p.Base_bill_basis_typ.setNextBeans(p.Base_bill_basis_typ_nm);
		p.Base_bill_basis_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bill_basis_typ_META);
		p.Upd3Panel.add(p.Base_bill_basis_typ_nm);
		p.Base_bill_basis_typ_nm.setNextBeans(p.Base_ship_schd_split_typ);
		p.Base_bill_basis_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bill_basis_typ_nm_META);
		p.Base_ship_schd_split_typ.setListType(MCListType.STRICT);
		p.Base_ship_schd_split_typ.setLinkBeans(p.Base_ship_schd_split_typ_nm);
		p.Upd3Panel.add(p.Base_ship_schd_split_typ_Label);
		p.Upd3Panel.add(p.Base_ship_schd_split_typ);
		p.Base_ship_schd_split_typ.setNextBeans(p.Base_ship_schd_split_typ_nm);
		p.Base_ship_schd_split_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ship_schd_split_typ_META);
		p.Upd3Panel.add(p.Base_ship_schd_split_typ_nm);
		p.Base_ship_schd_split_typ_nm.setNextBeans(p.Base_xfr_stk_mng_typ);
		p.Base_ship_schd_split_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ship_schd_split_typ_nm_META);
		p.Base_xfr_stk_mng_typ.setListType(MCListType.STRICT);
		p.Base_xfr_stk_mng_typ.setLinkBeans(p.Base_xfr_stk_mng_typ_nm);
		p.Upd3Panel.add(p.Base_xfr_stk_mng_typ_Label);
		p.Upd3Panel.add(p.Base_xfr_stk_mng_typ);
		p.Base_xfr_stk_mng_typ.setNextBeans(p.Base_xfr_stk_mng_typ_nm);
		p.Base_xfr_stk_mng_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.xfr_stk_mng_typ_META);
		p.Upd3Panel.add(p.Base_xfr_stk_mng_typ_nm);
		p.Base_xfr_stk_mng_typ_nm.setNextBeans(p.Base_sls_bdj_rnd_typ);
		p.Base_xfr_stk_mng_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.xfr_stk_mng_typ_nm_META);
		p.Base_sls_bdj_rnd_typ.setListType(MCListType.STRICT);
		p.Base_sls_bdj_rnd_typ.setLinkBeans(p.Base_sls_bdj_rnd_typ_nm);
		p.Upd3Panel.add(p.Base_sls_bdj_rnd_typ_Label);
		p.Upd3Panel.add(p.Base_sls_bdj_rnd_typ);
		p.Base_sls_bdj_rnd_typ.setNextBeans(p.Base_sls_bdj_rnd_typ_nm);
		p.Base_sls_bdj_rnd_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_bdj_rnd_typ_META);
		p.Upd3Panel.add(p.Base_sls_bdj_rnd_typ_nm);
		p.Base_sls_bdj_rnd_typ_nm.setNextBeans(p.Base_purc_upri_req_typ);
		p.Base_sls_bdj_rnd_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sls_bdj_rnd_typ_nm_META);
		p.Base_purc_upri_req_typ.setListType(MCListType.STRICT);
		p.Base_purc_upri_req_typ.setLinkBeans(p.Base_purc_upri_req_typ_nm);
		p.Upd3Panel.add(p.Base_purc_upri_req_typ_Label);
		p.Upd3Panel.add(p.Base_purc_upri_req_typ);
		p.Base_purc_upri_req_typ.setNextBeans(p.Base_purc_upri_req_typ_nm);
		p.Base_purc_upri_req_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_upri_req_typ_META);
		p.Upd3Panel.add(p.Base_purc_upri_req_typ_nm);
		p.Base_purc_upri_req_typ_nm.setNextBeans(p.Base_outsrc_upri_typ);
		p.Base_purc_upri_req_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.purc_upri_req_typ_nm_META);
		p.Base_outsrc_upri_typ.setListType(MCListType.STRICT);
		p.Base_outsrc_upri_typ.setLinkBeans(p.Base_outsrc_upri_typ_nm);
		p.Upd3Panel.add(p.Base_outsrc_upri_typ_Label);
		p.Upd3Panel.add(p.Base_outsrc_upri_typ);
		p.Base_outsrc_upri_typ.setNextBeans(p.Base_outsrc_upri_typ_nm);
		p.Base_outsrc_upri_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.outsrc_upri_typ_META);
		p.Upd3Panel.add(p.Base_outsrc_upri_typ_nm);
		p.Base_outsrc_upri_typ_nm.setNextBeans(p.Base_xrate_rnd_typ);
		p.Base_outsrc_upri_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.outsrc_upri_typ_nm_META);
		p.Base_xrate_rnd_typ.setListType(MCListType.STRICT);
		p.Base_xrate_rnd_typ.setLinkBeans(p.Base_xrate_rnd_typ_nm);
		p.Upd3Panel.add(p.Base_xrate_rnd_typ_Label);
		p.Upd3Panel.add(p.Base_xrate_rnd_typ);
		p.Base_xrate_rnd_typ.setNextBeans(p.Base_xrate_rnd_typ_nm);
		p.Base_xrate_rnd_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.xrate_rnd_typ_META);
		p.Upd3Panel.add(p.Base_xrate_rnd_typ_nm);
		p.Base_xrate_rnd_typ_nm.setNextBeans(p.Base_setoff_tax_rnd_typ);
		p.Base_xrate_rnd_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.xrate_rnd_typ_nm_META);
		p.Base_setoff_tax_rnd_typ.setListType(MCListType.STRICT);
		p.Base_setoff_tax_rnd_typ.setLinkBeans(p.Base_setoff_tax_rnd_typ_nm);
		p.Upd3Panel.add(p.Base_setoff_tax_rnd_typ_Label);
		p.Upd3Panel.add(p.Base_setoff_tax_rnd_typ);
		p.Base_setoff_tax_rnd_typ.setNextBeans(p.Base_setoff_tax_rnd_typ_nm);
		p.Base_setoff_tax_rnd_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.setoff_tax_rnd_typ_META);
		p.Upd3Panel.add(p.Base_setoff_tax_rnd_typ_nm);
		p.Base_setoff_tax_rnd_typ_nm.setNextBeans(p.Base_com_paid_tax_rnd_typ);
		p.Base_setoff_tax_rnd_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.setoff_tax_rnd_typ_nm_META);
		p.Base_com_paid_tax_rnd_typ.setListType(MCListType.STRICT);
		p.Base_com_paid_tax_rnd_typ.setLinkBeans(p.Base_com_paid_tax_rnd_typ_nm);
		p.Upd3Panel.add(p.Base_com_paid_tax_rnd_typ_Label);
		p.Upd3Panel.add(p.Base_com_paid_tax_rnd_typ);
		p.Base_com_paid_tax_rnd_typ.setNextBeans(p.Base_com_paid_tax_rnd_typ_nm);
		p.Base_com_paid_tax_rnd_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.com_paid_tax_rnd_typ_META);
		p.Upd3Panel.add(p.Base_com_paid_tax_rnd_typ_nm);
		p.Base_com_paid_tax_rnd_typ_nm.setNextBeans(p.Base_wtax_rnd_typ);
		p.Base_com_paid_tax_rnd_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.com_paid_tax_rnd_typ_nm_META);
		p.Base_wtax_rnd_typ.setListType(MCListType.STRICT);
		p.Base_wtax_rnd_typ.setLinkBeans(p.Base_wtax_rnd_typ_nm);
		p.Upd3Panel.add(p.Base_wtax_rnd_typ_Label);
		p.Upd3Panel.add(p.Base_wtax_rnd_typ);
		p.Base_wtax_rnd_typ.setNextBeans(p.Base_wtax_rnd_typ_nm);
		p.Base_wtax_rnd_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.wtax_rnd_typ_META);
		p.Upd3Panel.add(p.Base_wtax_rnd_typ_nm);
		p.Base_wtax_rnd_typ_nm.setNextBeans(p.Base_gm_std_upri_typ);
		p.Base_wtax_rnd_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.wtax_rnd_typ_nm_META);
		p.Base_gm_std_upri_typ.setListType(MCListType.STRICT);
		p.Base_gm_std_upri_typ.setLinkBeans(p.Base_gm_std_upri_typ_nm);
		p.Upd3Panel.add(p.Base_gm_std_upri_typ_Label);
		p.Upd3Panel.add(p.Base_gm_std_upri_typ);
		p.Base_gm_std_upri_typ.setNextBeans(p.Base_gm_std_upri_typ_nm);
		p.Base_gm_std_upri_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.gm_std_upri_typ_META);
		p.Upd3Panel.add(p.Base_gm_std_upri_typ_nm);
		p.Base_gm_std_upri_typ_nm.setNextBeans(p.Base_stk_std_upri_typ);
		p.Base_gm_std_upri_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.gm_std_upri_typ_nm_META);
		p.Base_stk_std_upri_typ.setListType(MCListType.STRICT);
		p.Base_stk_std_upri_typ.setLinkBeans(p.Base_stk_std_upri_typ_nm);
		p.Upd3Panel.add(p.Base_stk_std_upri_typ_Label);
		p.Upd3Panel.add(p.Base_stk_std_upri_typ);
		p.Base_stk_std_upri_typ.setNextBeans(p.Base_stk_std_upri_typ_nm);
		p.Base_stk_std_upri_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_std_upri_typ_META);
		p.Upd3Panel.add(p.Base_stk_std_upri_typ_nm);
		p.Base_stk_std_upri_typ_nm.setNextBeans(p.Base_stk_amt_rnd_typ);
		p.Base_stk_std_upri_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_std_upri_typ_nm_META);
		p.Base_stk_amt_rnd_typ.setListType(MCListType.STRICT);
		p.Base_stk_amt_rnd_typ.setLinkBeans(p.Base_stk_amt_rnd_typ_nm);
		p.Upd3Panel.add(p.Base_stk_amt_rnd_typ_Label);
		p.Upd3Panel.add(p.Base_stk_amt_rnd_typ);
		p.Base_stk_amt_rnd_typ.setNextBeans(p.Base_stk_amt_rnd_typ_nm);
		p.Base_stk_amt_rnd_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_amt_rnd_typ_META);
		p.Upd3Panel.add(p.Base_stk_amt_rnd_typ_nm);
		p.Base_stk_amt_rnd_typ_nm.setNextBeans(p.Base_stk_amt_dec_place);
		p.Base_stk_amt_rnd_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_amt_rnd_typ_nm_META);
		p.Upd3Panel.add(p.Base_stk_amt_dec_place_Label);
		p.Upd3Panel.add(p.Base_stk_amt_dec_place);
		p.Base_stk_amt_dec_place.setNextBeans(p.Base_po_print_cd);
		p.Base_stk_amt_dec_place.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_amt_dec_place_META);
		p.Base_po_print_cd.setListType(MCListType.STRICT);
		p.Base_po_print_cd.setLinkBeans(p.Base_po_print_nm);
		p.Upd3Panel.add(p.Base_po_print_cd_Label);
		p.Upd3Panel.add(p.Base_po_print_cd);
		p.Base_po_print_cd.setNextBeans(p.Base_po_print_nm);
		p.Base_po_print_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.po_print_cd_META);
		p.Upd3Panel.add(p.Base_po_print_nm);
		p.Base_po_print_nm.setNextBeans(p.Base_stk_lst_cnf_num);
		p.Base_po_print_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.po_print_nm_META);
		p.Upd3Panel.add(p.Base_stk_lst_cnf_num_Label);
		p.Upd3Panel.add(p.Base_stk_lst_cnf_num);
		p.Base_stk_lst_cnf_num.setNextBeans(p.Base_stk_lst_limit_num);
		p.Base_stk_lst_cnf_num.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_lst_cnf_num_META);
		p.Upd3Panel.add(p.Base_stk_lst_limit_num_Label);
		p.Upd3Panel.add(p.Base_stk_lst_limit_num);
		p.Base_stk_lst_limit_num.setNextBeans(p.Base_early_ship_dt_add_days);
		p.Base_stk_lst_limit_num.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.stk_lst_limit_num_META);
		p.Upd3Panel.add(p.Base_early_ship_dt_add_days_Label);
		p.Upd3Panel.add(p.Base_early_ship_dt_add_days);
		p.Base_early_ship_dt_add_days.setNextBeans(p.Base_ac_slip_digit);
		p.Base_early_ship_dt_add_days.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.early_ship_dt_add_days_META);
		p.Upd3Panel.add(p.Base_ac_slip_digit_Label);
		p.Upd3Panel.add(p.Base_ac_slip_digit);
		p.Base_ac_slip_digit.setNextBeans(p.Base_ac_slip_seq_flg);
		p.Base_ac_slip_digit.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ac_slip_digit_META);
		p.Upd3Panel.add(p.Base_ac_slip_seq_flg);
		p.Base_ac_slip_seq_flg.setNextBeans(p.Base_rpt_strg_ext_sys_cd);
		p.Base_ac_slip_seq_flg.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ac_slip_seq_flg_META);
		p.Base_rpt_strg_ext_sys_cd.setListType(MCListType.STRICT);
		p.Base_rpt_strg_ext_sys_cd.setLinkBeans(p.Base_rpt_strg_ext_sys_nm);
		p.Upd3Panel.add(p.Base_rpt_strg_ext_sys_cd_Label);
		p.Upd3Panel.add(p.Base_rpt_strg_ext_sys_cd);
		p.Base_rpt_strg_ext_sys_cd.setNextBeans(p.Base_rpt_strg_ext_sys_nm);
		p.Base_rpt_strg_ext_sys_cd.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rpt_strg_ext_sys_cd_META);
		p.Upd3Panel.add(p.Base_rpt_strg_ext_sys_nm);
		p.Base_rpt_strg_ext_sys_nm.setNextBeans(p.Base_cst_prnt_typ);
		p.Base_rpt_strg_ext_sys_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rpt_strg_ext_sys_nm_META);
		p.Base_cst_prnt_typ.setListType(MCListType.STRICT);
		p.Base_cst_prnt_typ.setLinkBeans(p.Base_cst_prnt_typ_nm);
		p.Upd3Panel.add(p.Base_cst_prnt_typ_Label);
		p.Upd3Panel.add(p.Base_cst_prnt_typ);
		p.Base_cst_prnt_typ.setNextBeans(p.Base_cst_prnt_typ_nm);
		p.Base_cst_prnt_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.cst_prnt_typ_META);
		p.Upd3Panel.add(p.Base_cst_prnt_typ_nm);
		p.Base_cst_prnt_typ_nm.setNextBeans(p.Base_acst_prnt_typ);
		p.Base_cst_prnt_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.cst_prnt_typ_nm_META);
		p.Base_acst_prnt_typ.setListType(MCListType.STRICT);
		p.Base_acst_prnt_typ.setLinkBeans(p.Base_acst_prnt_typ_nm);
		p.Upd3Panel.add(p.Base_acst_prnt_typ_Label);
		p.Upd3Panel.add(p.Base_acst_prnt_typ);
		p.Base_acst_prnt_typ.setNextBeans(p.Base_acst_prnt_typ_nm);
		p.Base_acst_prnt_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.acst_prnt_typ_META);
		p.Upd3Panel.add(p.Base_acst_prnt_typ_nm);
		p.Base_acst_prnt_typ_nm.setNextBeans(p.Base_bcst_prnt_typ);
		p.Base_acst_prnt_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.acst_prnt_typ_nm_META);
		p.Base_bcst_prnt_typ.setListType(MCListType.STRICT);
		p.Base_bcst_prnt_typ.setLinkBeans(p.Base_bcst_prnt_typ_nm);
		p.Upd3Panel.add(p.Base_bcst_prnt_typ_Label);
		p.Upd3Panel.add(p.Base_bcst_prnt_typ);
		p.Base_bcst_prnt_typ.setNextBeans(p.Base_bcst_prnt_typ_nm);
		p.Base_bcst_prnt_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bcst_prnt_typ_META);
		p.Upd3Panel.add(p.Base_bcst_prnt_typ_nm);
		p.Base_bcst_prnt_typ_nm.setNextBeans(p.Base_rcst_prnt_typ);
		p.Base_bcst_prnt_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bcst_prnt_typ_nm_META);
		p.Base_rcst_prnt_typ.setListType(MCListType.STRICT);
		p.Base_rcst_prnt_typ.setLinkBeans(p.Base_rcst_prnt_typ_nm);
		p.Upd3Panel.add(p.Base_rcst_prnt_typ_Label);
		p.Upd3Panel.add(p.Base_rcst_prnt_typ);
		p.Base_rcst_prnt_typ.setNextBeans(p.Base_rcst_prnt_typ_nm);
		p.Base_rcst_prnt_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rcst_prnt_typ_META);
		p.Upd3Panel.add(p.Base_rcst_prnt_typ_nm);
		p.Base_rcst_prnt_typ_nm.setNextBeans(p.Base_dlv_prnt_typ);
		p.Base_rcst_prnt_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.rcst_prnt_typ_nm_META);
		p.Base_dlv_prnt_typ.setListType(MCListType.STRICT);
		p.Base_dlv_prnt_typ.setLinkBeans(p.Base_dlv_prnt_typ_nm);
		p.Upd3Panel.add(p.Base_dlv_prnt_typ_Label);
		p.Upd3Panel.add(p.Base_dlv_prnt_typ);
		p.Base_dlv_prnt_typ.setNextBeans(p.Base_dlv_prnt_typ_nm);
		p.Base_dlv_prnt_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.dlv_prnt_typ_META);
		p.Upd3Panel.add(p.Base_dlv_prnt_typ_nm);
		p.Base_dlv_prnt_typ_nm.setNextBeans(p.Base_sppl_prnt_typ);
		p.Base_dlv_prnt_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.dlv_prnt_typ_nm_META);
		p.Base_sppl_prnt_typ.setListType(MCListType.STRICT);
		p.Base_sppl_prnt_typ.setLinkBeans(p.Base_sppl_prnt_typ_nm);
		p.Upd3Panel.add(p.Base_sppl_prnt_typ_Label);
		p.Upd3Panel.add(p.Base_sppl_prnt_typ);
		p.Base_sppl_prnt_typ.setNextBeans(p.Base_sppl_prnt_typ_nm);
		p.Base_sppl_prnt_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sppl_prnt_typ_META);
		p.Upd3Panel.add(p.Base_sppl_prnt_typ_nm);
		p.Base_sppl_prnt_typ_nm.setNextBeans(p.Base_asppl_prnt_typ);
		p.Base_sppl_prnt_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.sppl_prnt_typ_nm_META);
		p.Base_asppl_prnt_typ.setListType(MCListType.STRICT);
		p.Base_asppl_prnt_typ.setLinkBeans(p.Base_asppl_prnt_typ_nm);
		p.Upd3Panel.add(p.Base_asppl_prnt_typ_Label);
		p.Upd3Panel.add(p.Base_asppl_prnt_typ);
		p.Base_asppl_prnt_typ.setNextBeans(p.Base_asppl_prnt_typ_nm);
		p.Base_asppl_prnt_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.asppl_prnt_typ_META);
		p.Upd3Panel.add(p.Base_asppl_prnt_typ_nm);
		p.Base_asppl_prnt_typ_nm.setNextBeans(p.Base_bsppl_prnt_typ);
		p.Base_asppl_prnt_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.asppl_prnt_typ_nm_META);
		p.Base_bsppl_prnt_typ.setListType(MCListType.STRICT);
		p.Base_bsppl_prnt_typ.setLinkBeans(p.Base_bsppl_prnt_typ_nm);
		p.Upd3Panel.add(p.Base_bsppl_prnt_typ_Label);
		p.Upd3Panel.add(p.Base_bsppl_prnt_typ);
		p.Base_bsppl_prnt_typ.setNextBeans(p.Base_bsppl_prnt_typ_nm);
		p.Base_bsppl_prnt_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bsppl_prnt_typ_META);
		p.Upd3Panel.add(p.Base_bsppl_prnt_typ_nm);
		p.Base_bsppl_prnt_typ_nm.setNextBeans(p.Base_psppl_prnt_typ);
		p.Base_bsppl_prnt_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.bsppl_prnt_typ_nm_META);
		p.Base_psppl_prnt_typ.setListType(MCListType.STRICT);
		p.Base_psppl_prnt_typ.setLinkBeans(p.Base_psppl_prnt_typ_nm);
		p.Upd3Panel.add(p.Base_psppl_prnt_typ_Label);
		p.Upd3Panel.add(p.Base_psppl_prnt_typ);
		p.Base_psppl_prnt_typ.setNextBeans(p.Base_psppl_prnt_typ_nm);
		p.Base_psppl_prnt_typ.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.psppl_prnt_typ_META);
		p.Upd3Panel.add(p.Base_psppl_prnt_typ_nm);
		p.Base_psppl_prnt_typ_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.psppl_prnt_typ_nm_META);
		p.Upd4Panel.add(p.Base_ins_usr_id_Label);
		p.Upd4Panel.add(p.Base_ins_usr_id);
		p.Upd4Panel.setLastBeans(p.Base_ins_usr_id);
		p.Base_ins_usr_id.setNextBeans(p.Base_ins_usr_nm);
		p.Base_ins_usr_id.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ins_usr_id_META);
		p.Upd4Panel.add(p.Base_ins_usr_nm);
		p.Base_ins_usr_nm.setNextBeans(p.Base_ins_func_id);
		p.Base_ins_usr_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ins_usr_nm_META);
		p.Upd4Panel.add(p.Base_ins_func_id_Label);
		p.Upd4Panel.add(p.Base_ins_func_id);
		p.Base_ins_func_id.setNextBeans(p.Base_ins_func_nm);
		p.Base_ins_func_id.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ins_func_id_META);
		p.Upd4Panel.add(p.Base_ins_func_nm);
		p.Base_ins_func_nm.setNextBeans(p.Base_upd_usr_id);
		p.Base_ins_func_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ins_func_nm_META);
		p.Upd4Panel.add(p.Base_upd_usr_id_Label);
		p.Upd4Panel.add(p.Base_upd_usr_id);
		p.Base_upd_usr_id.setNextBeans(p.Base_upd_usr_nm);
		p.Base_upd_usr_id.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.upd_usr_id_META);
		p.Upd4Panel.add(p.Base_upd_usr_nm);
		p.Base_upd_usr_nm.setNextBeans(p.Base_upd_func_id);
		p.Base_upd_usr_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.upd_usr_nm_META);
		p.Upd4Panel.add(p.Base_upd_func_id_Label);
		p.Upd4Panel.add(p.Base_upd_func_id);
		p.Base_upd_func_id.setNextBeans(p.Base_upd_func_nm);
		p.Base_upd_func_id.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.upd_func_id_META);
		p.Upd4Panel.add(p.Base_upd_func_nm);
		p.Base_upd_func_nm.setNextBeans(p.Base_ins_ts);
		p.Base_upd_func_nm.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.upd_func_nm_META);
		p.Upd4Panel.add(p.Base_ins_ts_Label);
		p.Upd4Panel.add(p.Base_ins_ts);
		p.Base_ins_ts.setNextBeans(p.Base_upd_ts);
		p.Base_ins_ts.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.ins_ts_META);
		p.Base_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Upd4Panel.add(p.Base_upd_ts_Label);
		p.Upd4Panel.add(p.Base_upd_ts);
		p.Base_upd_ts.setNextBeans(p.Base_upd_srv_req_no);
		p.Base_upd_ts.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.upd_ts_META);
		p.Base_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Upd4Panel.add(p.Base_upd_srv_req_no_Label);
		p.Upd4Panel.add(p.Base_upd_srv_req_no);
		p.Base_upd_srv_req_no.setNextBeans(p.Base_upd_cntr);
		p.Base_upd_srv_req_no.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.upd_srv_req_no_META);
		p.Upd4Panel.add(p.Base_upd_cntr);
		p.Base_upd_cntr.setRow(p.getBaseR(), mcframe.clientMABC.MABCP0020.BaseR.upd_cntr_META);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.SubTabPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		// ブロックの項目の初期化
	}

	/**
	 * [SubTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSubTab(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.add(p.SubTabPanel);
		p.SubTabPanel.add(p.SubTabTab);
		p.SubTabPanel.setLastBeans(p.SubTabTab);
		p.SubTabPanel.setLayoutPosition("CB");
		// ブロックの項目の初期化
		p.SubTabTab.add(p.SubPanelPanel, "SubTab.tab1");
		p.SubTabTab.setLastBeans(p.SubPanelPanel);
		p.SubPanelPanel.setNextBeans(p.LclPanelPanel);
		p.SubTabTab.add(p.LclPanelPanel, "SubTab.tab2");
	}

	/**
	 * [SubPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSubPanel(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.SubPanelPanel.setNextBeans(p.LclPanelPanel);
		p.SubPanelPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.SubPanelPanel.add(p.DtlSubPanel, null);
		p.SubPanelPanel.setLastBeans(p.DtlSubPanel);
		p.DtlSubPanel.setNextBeans(p.DtlSubBtnPanel);
		p.SubPanelPanel.add(p.DtlSubBtnPanel, null);
	}

	/**
	 * [DtlSub]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlSub(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.DtlSubPanel.add(p.DtlSubScrollPane);
		p.DtlSubPanel.setLastBeans(p.DtlSubTable);
		p.DtlSubScrollPane.setViewportView(p.DtlSubTable);
		p.DtlSubTable.setList(p.getDtlSubL());
		p.DtlSubPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSubBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlSubBtn(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.DtlSubBtnPanel.setLayoutPosition("SN");
		// ブロックの項目の初期化
		p.DtlSubBtn_select_all.setIcon("SELECT_ALL");
		p.DtlSubBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlSubBtnPanel.add(p.DtlSubBtn_select_all);
		p.DtlSubBtnPanel.setLastBeans(p.DtlSubBtn_select_all);
		p.DtlSubBtn_select_all.setNextBeans(p.DtlSubBtn_deselect_all);
		p.DtlSubBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlSubBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlSubBtnPanel.add(p.DtlSubBtn_deselect_all);
		p.DtlSubBtn_deselect_all.setNextBeans(p.DtlSubBtn_radd);
		p.DtlSubBtn_radd.setIcon("INSERT_RECORD");
		p.DtlSubBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlSubBtnPanel.add(p.DtlSubBtn_radd);
		p.DtlSubBtn_radd.setNextBeans(p.DtlSubBtn_rdel);
		p.DtlSubBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlSubBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlSubBtnPanel.add(p.DtlSubBtn_rdel);
		p.DtlSubBtn_rdel.setNextBeans(p.DtlSubBtn_rcopy);
		p.DtlSubBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlSubBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlSubBtnPanel.add(p.DtlSubBtn_rcopy);
	}

	/**
	 * [LclPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclPanel(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.LclPanelPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.LclPanelPanel.add(p.LclPanel, null);
		p.LclPanelPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclPanelPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.LclPanel.add(p.LclScrollPane);
		p.LclPanel.setLastBeans(p.LclTable);
		p.LclScrollPane.setViewportView(p.LclTable);
		p.LclTable.setList(p.getLclL());
		p.LclPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtn(MABCP_CoReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("SN");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.LclBtnPanel.add(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setNextBeans(p.LclBtn_radd);
		p.LclBtn_radd.setIcon("INSERT_RECORD");
		p.LclBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.LclBtnPanel.add(p.LclBtn_radd);
		p.LclBtn_radd.setNextBeans(p.LclBtn_rdel);
		p.LclBtn_rdel.setIcon("DELETE_RECORD");
		p.LclBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.LclBtnPanel.add(p.LclBtn_rdel);
		p.LclBtn_rdel.setNextBeans(p.LclBtn_rcopy);
		p.LclBtn_rcopy.setIcon("COPY_RECORD");
		p.LclBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.LclBtnPanel.add(p.LclBtn_rcopy);
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
		MABCP_CoReg_MC.mcInitScreenOpe((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitCnd((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitUpd1((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitUpd2((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitUpd21((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitUpd22((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitUpd3((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitUpd4((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitBase((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitDtl((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitSubTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitSubPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitDtlSub((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitDtlSubBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitLclPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitLcl((MABCP_CoReg)this);
		MABCP_CoReg_MC.mcInitLclBtn((MABCP_CoReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_CoReg_MC.statusInitUPD_ScreenOpe((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Cnd((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Tab((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Btn((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Upd1((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Upd2((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Upd21((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Upd22((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Upd3((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Upd4((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Base((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Dtl((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_SubTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_SubPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_DtlSub((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_DtlSubBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_LclPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_Lcl((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_LclAll((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD_LclBtn((MABCP_CoReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_CoReg_MC.statusInitFIX_ScreenOpe((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Cnd((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Tab((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Btn((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Upd1((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Upd2((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Upd21((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Upd22((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Upd3((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Upd4((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Base((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Dtl((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_SubTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_SubPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_DtlSub((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_DtlSubBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_LclPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_Lcl((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_LclAll((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitFIX_LclBtn((MABCP_CoReg)this);

		// [UPD_ADMIN]ステータスのモードの設定
		MABCP_CoReg_MC.statusInitUPD__ADMIN_ScreenOpe((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Cnd((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Tab((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Btn((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Upd1((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Upd2((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Upd21((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Upd22((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Upd3((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Upd4((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Base((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Dtl((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_SubTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_SubPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_DtlSub((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_DtlSubBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_LclPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_Lcl((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_LclAll((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitUPD__ADMIN_LclBtn((MABCP_CoReg)this);

		// [REF]ステータスのモードの設定
		MABCP_CoReg_MC.statusInitREF_ScreenOpe((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Cnd((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Tab((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Btn((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Upd1((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Upd2((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Upd21((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Upd22((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Upd3((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Upd4((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Base((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Dtl((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_SubTab((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_SubPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_DtlSub((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_DtlSubBtn((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_LclPanel((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_Lcl((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_LclAll((MABCP_CoReg)this);
		MABCP_CoReg_MC.statusInitREF_LclBtn((MABCP_CoReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_CoReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_CoReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_UPD_ADMIN.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_co_cd.setListListener(p);
		p.Cnd_co_cd.addAllListener(p);
		p.Cnd_co_nm_lcl.setListListener(p);
		p.Cnd_co_nm_lcl.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Tab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab(MABCP_CoReg p) {
		p.TabTab.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_CoReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_admin.addAllListener(p);
		p.Btn_upd_admin.setAPMethodName("doBtn_upd_admin");
	}

	/**
	 *  [Upd1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpd1(MABCP_CoReg p) {
	}

	/**
	 *  [Upd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpd2(MABCP_CoReg p) {
	}

	/**
	 *  [Upd21]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpd21(MABCP_CoReg p) {
	}

	/**
	 *  [Upd22]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpd22(MABCP_CoReg p) {
	}

	/**
	 *  [Upd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpd3(MABCP_CoReg p) {
	}

	/**
	 *  [Upd4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpd4(MABCP_CoReg p) {
	}

	/**
	 *  [Base]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase(MABCP_CoReg p) {
		p.Base_co_cd.setListListener(p);
		p.Base_co_cd.addAllListener(p);
		p.Base_co_alt_nm1.setListListener(p);
		p.Base_co_alt_nm1.addAllListener(p);
		p.Base_co_alt_nm2.setListListener(p);
		p.Base_co_alt_nm2.addAllListener(p);
		p.Base_co_alt_nm3.setListListener(p);
		p.Base_co_alt_nm3.addAllListener(p);
		p.Base_co_alt_nm4.setListListener(p);
		p.Base_co_alt_nm4.addAllListener(p);
		p.Base_cntry_cd.setListListener(p);
		p.Base_cntry_cd.addAllListener(p);
		p.Base_cntry_nm.setListListener(p);
		p.Base_cntry_nm.addAllListener(p);
		p.Base_area_cd.setListListener(p);
		p.Base_area_cd.addAllListener(p);
		p.Base_area_nm.setListListener(p);
		p.Base_area_nm.addAllListener(p);
		p.Base_zip_cd.setListListener(p);
		p.Base_zip_cd.addAllListener(p);
		p.Base_addr1.setListListener(p);
		p.Base_addr1.addAllListener(p);
		p.Base_addr2.setListListener(p);
		p.Base_addr2.addAllListener(p);
		p.Base_addr3.setListListener(p);
		p.Base_addr3.addAllListener(p);
		p.Base_addr4.setListListener(p);
		p.Base_addr4.addAllListener(p);
		p.Base_tel.setListListener(p);
		p.Base_tel.addAllListener(p);
		p.Base_fax.setListListener(p);
		p.Base_fax.addAllListener(p);
		p.Base_co_repl_nm.setListListener(p);
		p.Base_co_repl_nm.addAllListener(p);
		p.Base_biz_co_no.setListListener(p);
		p.Base_biz_co_no.addAllListener(p);
		p.Base_ein.setListListener(p);
		p.Base_ein.addAllListener(p);
		p.Base_std_co_cd.setListListener(p);
		p.Base_std_co_cd.addAllListener(p);
		p.Base_base_cur_cd.setListListener(p);
		p.Base_base_cur_cd.addAllListener(p);
		p.Base_base_cur_nm.setListListener(p);
		p.Base_base_cur_nm.addAllListener(p);
		p.Base_ptax_cur_cd.setListListener(p);
		p.Base_ptax_cur_cd.addAllListener(p);
		p.Base_ptax_cur_nm.setListListener(p);
		p.Base_ptax_cur_nm.addAllListener(p);
		p.Base_ac_cl_day.setListListener(p);
		p.Base_ac_cl_day.addAllListener(p);
		p.Base_ac_cl_mon_base.setListListener(p);
		p.Base_ac_cl_mon_base.addAllListener(p);
		p.Base_st_mon.setListListener(p);
		p.Base_st_mon.addAllListener(p);
		p.Base_dt_switch_time.setListListener(p);
		p.Base_dt_switch_time.addAllListener(p);
		p.Base_std_cal_cd.setListListener(p);
		p.Base_std_cal_cd.addAllListener(p);
		p.Base_std_cal_nm.setListListener(p);
		p.Base_std_cal_nm.addAllListener(p);
		p.Base_ar_no_use_flg.addAllListener(p);
		p.Base_ap_no_use_flg.addAllListener(p);
		p.Base_temp_ap_use_flg.addAllListener(p);
		p.Base_sls_cl_flg.addAllListener(p);
		p.Base_rcv_cl_flg.addAllListener(p);
		p.Base_purc_cl_flg.addAllListener(p);
		p.Base_pay_cl_flg.addAllListener(p);
		p.Base_sls_cl_cal_cd.setListListener(p);
		p.Base_sls_cl_cal_cd.addAllListener(p);
		p.Base_sls_cl_cal_nm.setListListener(p);
		p.Base_sls_cl_cal_nm.addAllListener(p);
		p.Base_sls_cl_delay_days.setListListener(p);
		p.Base_sls_cl_delay_days.addAllListener(p);
		p.Base_sls_cl_ba_typ.setListListener(p);
		p.Base_sls_cl_ba_typ.addAllListener(p);
		p.Base_sls_cl_ba_typ_nm.setListListener(p);
		p.Base_sls_cl_ba_typ_nm.addAllListener(p);
		p.Base_rcv_cl_cal_cd.setListListener(p);
		p.Base_rcv_cl_cal_cd.addAllListener(p);
		p.Base_rcv_cl_cal_nm.setListListener(p);
		p.Base_rcv_cl_cal_nm.addAllListener(p);
		p.Base_rcv_cl_delay_days.setListListener(p);
		p.Base_rcv_cl_delay_days.addAllListener(p);
		p.Base_rcv_cl_ba_typ.setListListener(p);
		p.Base_rcv_cl_ba_typ.addAllListener(p);
		p.Base_rcv_cl_ba_typ_nm.setListListener(p);
		p.Base_rcv_cl_ba_typ_nm.addAllListener(p);
		p.Base_purc_cl_cal_cd.setListListener(p);
		p.Base_purc_cl_cal_cd.addAllListener(p);
		p.Base_purc_cl_cal_nm.setListListener(p);
		p.Base_purc_cl_cal_nm.addAllListener(p);
		p.Base_purc_cl_delay_days.setListListener(p);
		p.Base_purc_cl_delay_days.addAllListener(p);
		p.Base_purc_cl_ba_typ.setListListener(p);
		p.Base_purc_cl_ba_typ.addAllListener(p);
		p.Base_purc_cl_ba_typ_nm.setListListener(p);
		p.Base_purc_cl_ba_typ_nm.addAllListener(p);
		p.Base_pay_cl_cal_cd.setListListener(p);
		p.Base_pay_cl_cal_cd.addAllListener(p);
		p.Base_pay_cl_cal_nm.setListListener(p);
		p.Base_pay_cl_cal_nm.addAllListener(p);
		p.Base_pay_cl_delay_days.setListListener(p);
		p.Base_pay_cl_delay_days.addAllListener(p);
		p.Base_pay_cl_ba_typ.setListListener(p);
		p.Base_pay_cl_ba_typ.addAllListener(p);
		p.Base_pay_cl_ba_typ_nm.setListListener(p);
		p.Base_pay_cl_ba_typ_nm.addAllListener(p);
		p.Base_stk_cl_cal_cd.setListListener(p);
		p.Base_stk_cl_cal_cd.addAllListener(p);
		p.Base_stk_cl_cal_nm.setListListener(p);
		p.Base_stk_cl_cal_nm.addAllListener(p);
		p.Base_stk_cl_delay_days.setListListener(p);
		p.Base_stk_cl_delay_days.addAllListener(p);
		p.Base_stk_cl_ba_typ.setListListener(p);
		p.Base_stk_cl_ba_typ.addAllListener(p);
		p.Base_stk_cl_ba_typ_nm.setListListener(p);
		p.Base_stk_cl_ba_typ_nm.addAllListener(p);
		p.Base_bill_cl_cal_cd.setListListener(p);
		p.Base_bill_cl_cal_cd.addAllListener(p);
		p.Base_bill_cl_cal_nm.setListListener(p);
		p.Base_bill_cl_cal_nm.addAllListener(p);
		p.Base_pay_schd_cl_cal_cd.setListListener(p);
		p.Base_pay_schd_cl_cal_cd.addAllListener(p);
		p.Base_pay_schd_cl_cal_nm.setListListener(p);
		p.Base_pay_schd_cl_cal_nm.addAllListener(p);
		p.Base_bill_xrate_conv_flg.addAllListener(p);
		p.Base_pay_xrate_conv_flg.addAllListener(p);
		p.Base_sls_xrate_cd.setListListener(p);
		p.Base_sls_xrate_cd.addAllListener(p);
		p.Base_sls_xrate_nm.setListListener(p);
		p.Base_sls_xrate_nm.addAllListener(p);
		p.Base_purc_xrate_cd.setListListener(p);
		p.Base_purc_xrate_cd.addAllListener(p);
		p.Base_purc_xrate_nm.setListListener(p);
		p.Base_purc_xrate_nm.addAllListener(p);
		p.Base_prov_xrate_cd.setListListener(p);
		p.Base_prov_xrate_cd.addAllListener(p);
		p.Base_prov_xrate_nm.setListListener(p);
		p.Base_prov_xrate_nm.addAllListener(p);
		p.Base_bill_xrate_cd.setListListener(p);
		p.Base_bill_xrate_cd.addAllListener(p);
		p.Base_bill_xrate_nm.setListListener(p);
		p.Base_bill_xrate_nm.addAllListener(p);
		p.Base_pay_xrate_cd.setListListener(p);
		p.Base_pay_xrate_cd.addAllListener(p);
		p.Base_pay_xrate_nm.setListListener(p);
		p.Base_pay_xrate_nm.addAllListener(p);
		p.Base_mon01_xrate_rev_flg.addAllListener(p);
		p.Base_mon02_xrate_rev_flg.addAllListener(p);
		p.Base_mon03_xrate_rev_flg.addAllListener(p);
		p.Base_mon04_xrate_rev_flg.addAllListener(p);
		p.Base_mon05_xrate_rev_flg.addAllListener(p);
		p.Base_mon06_xrate_rev_flg.addAllListener(p);
		p.Base_mon07_xrate_rev_flg.addAllListener(p);
		p.Base_mon08_xrate_rev_flg.addAllListener(p);
		p.Base_mon09_xrate_rev_flg.addAllListener(p);
		p.Base_mon10_xrate_rev_flg.addAllListener(p);
		p.Base_mon11_xrate_rev_flg.addAllListener(p);
		p.Base_mon12_xrate_rev_flg.addAllListener(p);
		p.Base_sls_upri_req_typ.setListListener(p);
		p.Base_sls_upri_req_typ.addAllListener(p);
		p.Base_sls_upri_req_typ_nm.setListListener(p);
		p.Base_sls_upri_req_typ_nm.addAllListener(p);
		p.Base_sls_basis_typ.setListListener(p);
		p.Base_sls_basis_typ.addAllListener(p);
		p.Base_sls_basis_typ_nm.setListListener(p);
		p.Base_sls_basis_typ_nm.addAllListener(p);
		p.Base_bill_basis_typ.setListListener(p);
		p.Base_bill_basis_typ.addAllListener(p);
		p.Base_bill_basis_typ_nm.setListListener(p);
		p.Base_bill_basis_typ_nm.addAllListener(p);
		p.Base_ship_schd_split_typ.setListListener(p);
		p.Base_ship_schd_split_typ.addAllListener(p);
		p.Base_ship_schd_split_typ_nm.setListListener(p);
		p.Base_ship_schd_split_typ_nm.addAllListener(p);
		p.Base_xfr_stk_mng_typ.setListListener(p);
		p.Base_xfr_stk_mng_typ.addAllListener(p);
		p.Base_xfr_stk_mng_typ_nm.setListListener(p);
		p.Base_xfr_stk_mng_typ_nm.addAllListener(p);
		p.Base_sls_bdj_rnd_typ.setListListener(p);
		p.Base_sls_bdj_rnd_typ.addAllListener(p);
		p.Base_sls_bdj_rnd_typ_nm.setListListener(p);
		p.Base_sls_bdj_rnd_typ_nm.addAllListener(p);
		p.Base_purc_upri_req_typ.setListListener(p);
		p.Base_purc_upri_req_typ.addAllListener(p);
		p.Base_purc_upri_req_typ_nm.setListListener(p);
		p.Base_purc_upri_req_typ_nm.addAllListener(p);
		p.Base_outsrc_upri_typ.setListListener(p);
		p.Base_outsrc_upri_typ.addAllListener(p);
		p.Base_outsrc_upri_typ_nm.setListListener(p);
		p.Base_outsrc_upri_typ_nm.addAllListener(p);
		p.Base_xrate_rnd_typ.setListListener(p);
		p.Base_xrate_rnd_typ.addAllListener(p);
		p.Base_xrate_rnd_typ_nm.setListListener(p);
		p.Base_xrate_rnd_typ_nm.addAllListener(p);
		p.Base_setoff_tax_rnd_typ.setListListener(p);
		p.Base_setoff_tax_rnd_typ.addAllListener(p);
		p.Base_setoff_tax_rnd_typ_nm.setListListener(p);
		p.Base_setoff_tax_rnd_typ_nm.addAllListener(p);
		p.Base_com_paid_tax_rnd_typ.setListListener(p);
		p.Base_com_paid_tax_rnd_typ.addAllListener(p);
		p.Base_com_paid_tax_rnd_typ_nm.setListListener(p);
		p.Base_com_paid_tax_rnd_typ_nm.addAllListener(p);
		p.Base_wtax_rnd_typ.setListListener(p);
		p.Base_wtax_rnd_typ.addAllListener(p);
		p.Base_wtax_rnd_typ_nm.setListListener(p);
		p.Base_wtax_rnd_typ_nm.addAllListener(p);
		p.Base_gm_std_upri_typ.setListListener(p);
		p.Base_gm_std_upri_typ.addAllListener(p);
		p.Base_gm_std_upri_typ_nm.setListListener(p);
		p.Base_gm_std_upri_typ_nm.addAllListener(p);
		p.Base_stk_std_upri_typ.setListListener(p);
		p.Base_stk_std_upri_typ.addAllListener(p);
		p.Base_stk_std_upri_typ_nm.setListListener(p);
		p.Base_stk_std_upri_typ_nm.addAllListener(p);
		p.Base_stk_amt_rnd_typ.setListListener(p);
		p.Base_stk_amt_rnd_typ.addAllListener(p);
		p.Base_stk_amt_rnd_typ_nm.setListListener(p);
		p.Base_stk_amt_rnd_typ_nm.addAllListener(p);
		p.Base_stk_amt_dec_place.setListListener(p);
		p.Base_stk_amt_dec_place.addAllListener(p);
		p.Base_po_print_cd.setListListener(p);
		p.Base_po_print_cd.addAllListener(p);
		p.Base_po_print_nm.setListListener(p);
		p.Base_po_print_nm.addAllListener(p);
		p.Base_stk_lst_cnf_num.setListListener(p);
		p.Base_stk_lst_cnf_num.addAllListener(p);
		p.Base_stk_lst_limit_num.setListListener(p);
		p.Base_stk_lst_limit_num.addAllListener(p);
		p.Base_early_ship_dt_add_days.setListListener(p);
		p.Base_early_ship_dt_add_days.addAllListener(p);
		p.Base_ac_slip_digit.setListListener(p);
		p.Base_ac_slip_digit.addAllListener(p);
		p.Base_ac_slip_seq_flg.addAllListener(p);
		p.Base_rpt_strg_ext_sys_cd.setListListener(p);
		p.Base_rpt_strg_ext_sys_cd.addAllListener(p);
		p.Base_rpt_strg_ext_sys_nm.setListListener(p);
		p.Base_rpt_strg_ext_sys_nm.addAllListener(p);
		p.Base_cst_prnt_typ.setListListener(p);
		p.Base_cst_prnt_typ.addAllListener(p);
		p.Base_cst_prnt_typ_nm.setListListener(p);
		p.Base_cst_prnt_typ_nm.addAllListener(p);
		p.Base_acst_prnt_typ.setListListener(p);
		p.Base_acst_prnt_typ.addAllListener(p);
		p.Base_acst_prnt_typ_nm.setListListener(p);
		p.Base_acst_prnt_typ_nm.addAllListener(p);
		p.Base_bcst_prnt_typ.setListListener(p);
		p.Base_bcst_prnt_typ.addAllListener(p);
		p.Base_bcst_prnt_typ_nm.setListListener(p);
		p.Base_bcst_prnt_typ_nm.addAllListener(p);
		p.Base_rcst_prnt_typ.setListListener(p);
		p.Base_rcst_prnt_typ.addAllListener(p);
		p.Base_rcst_prnt_typ_nm.setListListener(p);
		p.Base_rcst_prnt_typ_nm.addAllListener(p);
		p.Base_dlv_prnt_typ.setListListener(p);
		p.Base_dlv_prnt_typ.addAllListener(p);
		p.Base_dlv_prnt_typ_nm.setListListener(p);
		p.Base_dlv_prnt_typ_nm.addAllListener(p);
		p.Base_sppl_prnt_typ.setListListener(p);
		p.Base_sppl_prnt_typ.addAllListener(p);
		p.Base_sppl_prnt_typ_nm.setListListener(p);
		p.Base_sppl_prnt_typ_nm.addAllListener(p);
		p.Base_asppl_prnt_typ.setListListener(p);
		p.Base_asppl_prnt_typ.addAllListener(p);
		p.Base_asppl_prnt_typ_nm.setListListener(p);
		p.Base_asppl_prnt_typ_nm.addAllListener(p);
		p.Base_bsppl_prnt_typ.setListListener(p);
		p.Base_bsppl_prnt_typ.addAllListener(p);
		p.Base_bsppl_prnt_typ_nm.setListListener(p);
		p.Base_bsppl_prnt_typ_nm.addAllListener(p);
		p.Base_psppl_prnt_typ.setListListener(p);
		p.Base_psppl_prnt_typ.addAllListener(p);
		p.Base_psppl_prnt_typ_nm.setListListener(p);
		p.Base_psppl_prnt_typ_nm.addAllListener(p);
		p.Base_ins_usr_id.setListListener(p);
		p.Base_ins_usr_id.addAllListener(p);
		p.Base_ins_usr_nm.setListListener(p);
		p.Base_ins_usr_nm.addAllListener(p);
		p.Base_ins_func_id.setListListener(p);
		p.Base_ins_func_id.addAllListener(p);
		p.Base_ins_func_nm.setListListener(p);
		p.Base_ins_func_nm.addAllListener(p);
		p.Base_upd_usr_id.setListListener(p);
		p.Base_upd_usr_id.addAllListener(p);
		p.Base_upd_usr_nm.setListListener(p);
		p.Base_upd_usr_nm.addAllListener(p);
		p.Base_upd_func_id.setListListener(p);
		p.Base_upd_func_id.addAllListener(p);
		p.Base_upd_func_nm.setListListener(p);
		p.Base_upd_func_nm.addAllListener(p);
		p.Base_ins_ts.setListListener(p);
		p.Base_ins_ts.addAllListener(p);
		p.Base_upd_ts.setListListener(p);
		p.Base_upd_ts.addAllListener(p);
		p.Base_upd_srv_req_no.setListListener(p);
		p.Base_upd_srv_req_no.addAllListener(p);
		p.Base_upd_cntr.setListListener(p);
		p.Base_upd_cntr.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_CoReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_co_cd.addAllListener(p);
		p.columnDtl_co_cd.setListListener(p);
		p.columnDtl_co_alt_nm1.addAllListener(p);
		p.columnDtl_co_alt_nm1.setListListener(p);
		p.columnDtl_co_alt_nm2.addAllListener(p);
		p.columnDtl_co_alt_nm2.setListListener(p);
		p.columnDtl_co_alt_nm3.addAllListener(p);
		p.columnDtl_co_alt_nm3.setListListener(p);
		p.columnDtl_co_alt_nm4.addAllListener(p);
		p.columnDtl_co_alt_nm4.setListListener(p);
		p.columnDtl_zip_cd.addAllListener(p);
		p.columnDtl_zip_cd.setListListener(p);
		p.columnDtl_addr1.addAllListener(p);
		p.columnDtl_addr1.setListListener(p);
		p.columnDtl_addr2.addAllListener(p);
		p.columnDtl_addr2.setListListener(p);
		p.columnDtl_addr3.addAllListener(p);
		p.columnDtl_addr3.setListListener(p);
		p.columnDtl_addr4.addAllListener(p);
		p.columnDtl_addr4.setListListener(p);
		p.columnDtl_tel.addAllListener(p);
		p.columnDtl_tel.setListListener(p);
		p.columnDtl_fax.addAllListener(p);
		p.columnDtl_fax.setListListener(p);
		p.columnDtl_co_repl_nm.addAllListener(p);
		p.columnDtl_co_repl_nm.setListListener(p);
		p.columnDtl_ein.addAllListener(p);
		p.columnDtl_ein.setListListener(p);
		p.columnDtl_biz_co_no.addAllListener(p);
		p.columnDtl_biz_co_no.setListListener(p);
		p.columnDtl_std_co_cd.addAllListener(p);
		p.columnDtl_std_co_cd.setListListener(p);
		p.columnDtl_cntry_cd.addAllListener(p);
		p.columnDtl_cntry_cd.setListListener(p);
		p.columnDtl_area_cd.addAllListener(p);
		p.columnDtl_area_cd.setListListener(p);
		p.columnDtl_base_cur_cd.addAllListener(p);
		p.columnDtl_base_cur_cd.setListListener(p);
		p.columnDtl_ptax_cur_cd.addAllListener(p);
		p.columnDtl_ptax_cur_cd.setListListener(p);
		p.columnDtl_st_mon.addAllListener(p);
		p.columnDtl_st_mon.setListListener(p);
		p.columnDtl_dt_switch_time.addAllListener(p);
		p.columnDtl_dt_switch_time.setListListener(p);
		p.columnDtl_ac_cl_day.addAllListener(p);
		p.columnDtl_ac_cl_day.setListListener(p);
		p.columnDtl_ac_cl_mon_base.addAllListener(p);
		p.columnDtl_ac_cl_mon_base.setListListener(p);
		p.columnDtl_std_cal_cd.addAllListener(p);
		p.columnDtl_std_cal_cd.setListListener(p);
		p.columnDtl_bill_cl_cal_cd.addAllListener(p);
		p.columnDtl_bill_cl_cal_cd.setListListener(p);
		p.columnDtl_ar_no_use_flg.addAllListener(p);
		p.columnDtl_ap_no_use_flg.addAllListener(p);
		p.columnDtl_temp_ap_use_flg.addAllListener(p);
		p.columnDtl_sls_cl_flg.addAllListener(p);
		p.columnDtl_rcv_cl_flg.addAllListener(p);
		p.columnDtl_purc_cl_flg.addAllListener(p);
		p.columnDtl_pay_cl_flg.addAllListener(p);
		p.columnDtl_stk_cl_cal_cd.addAllListener(p);
		p.columnDtl_stk_cl_cal_cd.setListListener(p);
		p.columnDtl_sls_cl_cal_cd.addAllListener(p);
		p.columnDtl_sls_cl_cal_cd.setListListener(p);
		p.columnDtl_rcv_cl_cal_cd.addAllListener(p);
		p.columnDtl_rcv_cl_cal_cd.setListListener(p);
		p.columnDtl_purc_cl_cal_cd.addAllListener(p);
		p.columnDtl_purc_cl_cal_cd.setListListener(p);
		p.columnDtl_pay_cl_cal_cd.addAllListener(p);
		p.columnDtl_pay_cl_cal_cd.setListListener(p);
		p.columnDtl_pay_schd_cl_cal_cd.addAllListener(p);
		p.columnDtl_pay_schd_cl_cal_cd.setListListener(p);
		p.columnDtl_stk_cl_delay_days.addAllListener(p);
		p.columnDtl_stk_cl_delay_days.setListListener(p);
		p.columnDtl_stk_cl_ba_typ.addAllListener(p);
		p.columnDtl_stk_cl_ba_typ.setListListener(p);
		p.columnDtl_sls_cl_delay_days.addAllListener(p);
		p.columnDtl_sls_cl_delay_days.setListListener(p);
		p.columnDtl_sls_cl_ba_typ.addAllListener(p);
		p.columnDtl_sls_cl_ba_typ.setListListener(p);
		p.columnDtl_rcv_cl_delay_days.addAllListener(p);
		p.columnDtl_rcv_cl_delay_days.setListListener(p);
		p.columnDtl_rcv_cl_ba_typ.addAllListener(p);
		p.columnDtl_rcv_cl_ba_typ.setListListener(p);
		p.columnDtl_purc_cl_delay_days.addAllListener(p);
		p.columnDtl_purc_cl_delay_days.setListListener(p);
		p.columnDtl_purc_cl_ba_typ.addAllListener(p);
		p.columnDtl_purc_cl_ba_typ.setListListener(p);
		p.columnDtl_pay_cl_delay_days.addAllListener(p);
		p.columnDtl_pay_cl_delay_days.setListListener(p);
		p.columnDtl_pay_cl_ba_typ.addAllListener(p);
		p.columnDtl_pay_cl_ba_typ.setListListener(p);
		p.columnDtl_bill_xrate_conv_flg.addAllListener(p);
		p.columnDtl_pay_xrate_conv_flg.addAllListener(p);
		p.columnDtl_sls_xrate_cd.addAllListener(p);
		p.columnDtl_sls_xrate_cd.setListListener(p);
		p.columnDtl_purc_xrate_cd.addAllListener(p);
		p.columnDtl_purc_xrate_cd.setListListener(p);
		p.columnDtl_prov_xrate_cd.addAllListener(p);
		p.columnDtl_prov_xrate_cd.setListListener(p);
		p.columnDtl_bill_xrate_cd.addAllListener(p);
		p.columnDtl_bill_xrate_cd.setListListener(p);
		p.columnDtl_pay_xrate_cd.addAllListener(p);
		p.columnDtl_pay_xrate_cd.setListListener(p);
		p.columnDtl_mon01_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon02_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon03_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon04_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon05_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon06_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon07_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon08_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon09_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon10_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon11_xrate_rev_flg.addAllListener(p);
		p.columnDtl_mon12_xrate_rev_flg.addAllListener(p);
		p.columnDtl_sls_upri_req_typ.addAllListener(p);
		p.columnDtl_sls_upri_req_typ.setListListener(p);
		p.columnDtl_purc_upri_req_typ.addAllListener(p);
		p.columnDtl_purc_upri_req_typ.setListListener(p);
		p.columnDtl_outsrc_upri_typ.addAllListener(p);
		p.columnDtl_outsrc_upri_typ.setListListener(p);
		p.columnDtl_sls_basis_typ.addAllListener(p);
		p.columnDtl_sls_basis_typ.setListListener(p);
		p.columnDtl_bill_basis_typ.addAllListener(p);
		p.columnDtl_bill_basis_typ.setListListener(p);
		p.columnDtl_ship_schd_split_typ.addAllListener(p);
		p.columnDtl_ship_schd_split_typ.setListListener(p);
		p.columnDtl_xfr_stk_mng_typ.addAllListener(p);
		p.columnDtl_xfr_stk_mng_typ.setListListener(p);
		p.columnDtl_setoff_tax_rnd_typ.addAllListener(p);
		p.columnDtl_setoff_tax_rnd_typ.setListListener(p);
		p.columnDtl_xrate_rnd_typ.addAllListener(p);
		p.columnDtl_xrate_rnd_typ.setListListener(p);
		p.columnDtl_com_paid_tax_rnd_typ.addAllListener(p);
		p.columnDtl_com_paid_tax_rnd_typ.setListListener(p);
		p.columnDtl_wtax_rnd_typ.addAllListener(p);
		p.columnDtl_wtax_rnd_typ.setListListener(p);
		p.columnDtl_stk_amt_rnd_typ.addAllListener(p);
		p.columnDtl_stk_amt_rnd_typ.setListListener(p);
		p.columnDtl_stk_amt_dec_place.addAllListener(p);
		p.columnDtl_stk_amt_dec_place.setListListener(p);
		p.columnDtl_po_print_cd.addAllListener(p);
		p.columnDtl_po_print_cd.setListListener(p);
		p.columnDtl_stk_lst_cnf_num.addAllListener(p);
		p.columnDtl_stk_lst_cnf_num.setListListener(p);
		p.columnDtl_stk_lst_limit_num.addAllListener(p);
		p.columnDtl_stk_lst_limit_num.setListListener(p);
		p.columnDtl_gm_std_upri_typ.addAllListener(p);
		p.columnDtl_gm_std_upri_typ.setListListener(p);
		p.columnDtl_stk_std_upri_typ.addAllListener(p);
		p.columnDtl_stk_std_upri_typ.setListListener(p);
		p.columnDtl_early_ship_dt_add_days.addAllListener(p);
		p.columnDtl_early_ship_dt_add_days.setListListener(p);
		p.columnDtl_ac_slip_digit.addAllListener(p);
		p.columnDtl_ac_slip_digit.setListListener(p);
		p.columnDtl_ac_slip_seq_flg.addAllListener(p);
		p.columnDtl_sls_bdj_rnd_typ.addAllListener(p);
		p.columnDtl_sls_bdj_rnd_typ.setListListener(p);
		p.columnDtl_cntry_nm.addAllListener(p);
		p.columnDtl_cntry_nm.setListListener(p);
		p.columnDtl_area_nm.addAllListener(p);
		p.columnDtl_area_nm.setListListener(p);
		p.columnDtl_base_cur_nm.addAllListener(p);
		p.columnDtl_base_cur_nm.setListListener(p);
		p.columnDtl_ptax_cur_nm.addAllListener(p);
		p.columnDtl_ptax_cur_nm.setListListener(p);
		p.columnDtl_std_cal_nm.addAllListener(p);
		p.columnDtl_std_cal_nm.setListListener(p);
		p.columnDtl_stk_cl_cal_nm.addAllListener(p);
		p.columnDtl_stk_cl_cal_nm.setListListener(p);
		p.columnDtl_sls_cl_cal_nm.addAllListener(p);
		p.columnDtl_sls_cl_cal_nm.setListListener(p);
		p.columnDtl_bill_cl_cal_nm.addAllListener(p);
		p.columnDtl_bill_cl_cal_nm.setListListener(p);
		p.columnDtl_rcv_cl_cal_nm.addAllListener(p);
		p.columnDtl_rcv_cl_cal_nm.setListListener(p);
		p.columnDtl_purc_cl_cal_nm.addAllListener(p);
		p.columnDtl_purc_cl_cal_nm.setListListener(p);
		p.columnDtl_pay_cl_cal_nm.addAllListener(p);
		p.columnDtl_pay_cl_cal_nm.setListListener(p);
		p.columnDtl_pay_schd_cl_cal_nm.addAllListener(p);
		p.columnDtl_pay_schd_cl_cal_nm.setListListener(p);
		p.columnDtl_sls_xrate_nm.addAllListener(p);
		p.columnDtl_sls_xrate_nm.setListListener(p);
		p.columnDtl_purc_xrate_nm.addAllListener(p);
		p.columnDtl_purc_xrate_nm.setListListener(p);
		p.columnDtl_prov_xrate_nm.addAllListener(p);
		p.columnDtl_prov_xrate_nm.setListListener(p);
		p.columnDtl_bill_xrate_nm.addAllListener(p);
		p.columnDtl_bill_xrate_nm.setListListener(p);
		p.columnDtl_pay_xrate_nm.addAllListener(p);
		p.columnDtl_pay_xrate_nm.setListListener(p);
		p.columnDtl_stk_cl_ba_typ_nm.addAllListener(p);
		p.columnDtl_stk_cl_ba_typ_nm.setListListener(p);
		p.columnDtl_sls_cl_ba_typ_nm.addAllListener(p);
		p.columnDtl_sls_cl_ba_typ_nm.setListListener(p);
		p.columnDtl_rcv_cl_ba_typ_nm.addAllListener(p);
		p.columnDtl_rcv_cl_ba_typ_nm.setListListener(p);
		p.columnDtl_purc_cl_ba_typ_nm.addAllListener(p);
		p.columnDtl_purc_cl_ba_typ_nm.setListListener(p);
		p.columnDtl_pay_cl_ba_typ_nm.addAllListener(p);
		p.columnDtl_pay_cl_ba_typ_nm.setListListener(p);
		p.columnDtl_sls_upri_req_typ_nm.addAllListener(p);
		p.columnDtl_sls_upri_req_typ_nm.setListListener(p);
		p.columnDtl_purc_upri_req_typ_nm.addAllListener(p);
		p.columnDtl_purc_upri_req_typ_nm.setListListener(p);
		p.columnDtl_outsrc_upri_typ_nm.addAllListener(p);
		p.columnDtl_outsrc_upri_typ_nm.setListListener(p);
		p.columnDtl_sls_basis_typ_nm.addAllListener(p);
		p.columnDtl_sls_basis_typ_nm.setListListener(p);
		p.columnDtl_bill_basis_typ_nm.addAllListener(p);
		p.columnDtl_bill_basis_typ_nm.setListListener(p);
		p.columnDtl_ship_schd_split_typ_nm.addAllListener(p);
		p.columnDtl_ship_schd_split_typ_nm.setListListener(p);
		p.columnDtl_xfr_stk_mng_typ_nm.addAllListener(p);
		p.columnDtl_xfr_stk_mng_typ_nm.setListListener(p);
		p.columnDtl_xrate_rnd_typ_nm.addAllListener(p);
		p.columnDtl_xrate_rnd_typ_nm.setListListener(p);
		p.columnDtl_setoff_tax_rnd_typ_nm.addAllListener(p);
		p.columnDtl_setoff_tax_rnd_typ_nm.setListListener(p);
		p.columnDtl_com_paid_tax_rnd_typ_nm.addAllListener(p);
		p.columnDtl_com_paid_tax_rnd_typ_nm.setListListener(p);
		p.columnDtl_wtax_rnd_typ_nm.addAllListener(p);
		p.columnDtl_wtax_rnd_typ_nm.setListListener(p);
		p.columnDtl_stk_amt_rnd_typ_nm.addAllListener(p);
		p.columnDtl_stk_amt_rnd_typ_nm.setListListener(p);
		p.columnDtl_sls_bdj_rnd_typ_nm.addAllListener(p);
		p.columnDtl_sls_bdj_rnd_typ_nm.setListListener(p);
		p.columnDtl_po_print_nm.addAllListener(p);
		p.columnDtl_po_print_nm.setListListener(p);
		p.columnDtl_gm_std_upri_typ_nm.addAllListener(p);
		p.columnDtl_gm_std_upri_typ_nm.setListListener(p);
		p.columnDtl_stk_std_upri_typ_nm.addAllListener(p);
		p.columnDtl_stk_std_upri_typ_nm.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_rpt_strg_ext_sys_cd.addAllListener(p);
		p.columnDtl_rpt_strg_ext_sys_cd.setListListener(p);
		p.columnDtl_rpt_strg_ext_sys_nm.addAllListener(p);
		p.columnDtl_rpt_strg_ext_sys_nm.setListListener(p);
		p.columnDtl_cst_prnt_typ.addAllListener(p);
		p.columnDtl_cst_prnt_typ.setListListener(p);
		p.columnDtl_cst_prnt_typ_nm.addAllListener(p);
		p.columnDtl_cst_prnt_typ_nm.setListListener(p);
		p.columnDtl_acst_prnt_typ.addAllListener(p);
		p.columnDtl_acst_prnt_typ.setListListener(p);
		p.columnDtl_acst_prnt_typ_nm.addAllListener(p);
		p.columnDtl_acst_prnt_typ_nm.setListListener(p);
		p.columnDtl_bcst_prnt_typ.addAllListener(p);
		p.columnDtl_bcst_prnt_typ.setListListener(p);
		p.columnDtl_bcst_prnt_typ_nm.addAllListener(p);
		p.columnDtl_bcst_prnt_typ_nm.setListListener(p);
		p.columnDtl_rcst_prnt_typ.addAllListener(p);
		p.columnDtl_rcst_prnt_typ.setListListener(p);
		p.columnDtl_rcst_prnt_typ_nm.addAllListener(p);
		p.columnDtl_rcst_prnt_typ_nm.setListListener(p);
		p.columnDtl_dlv_prnt_typ.addAllListener(p);
		p.columnDtl_dlv_prnt_typ.setListListener(p);
		p.columnDtl_dlv_prnt_typ_nm.addAllListener(p);
		p.columnDtl_dlv_prnt_typ_nm.setListListener(p);
		p.columnDtl_sppl_prnt_typ.addAllListener(p);
		p.columnDtl_sppl_prnt_typ.setListListener(p);
		p.columnDtl_sppl_prnt_typ_nm.addAllListener(p);
		p.columnDtl_sppl_prnt_typ_nm.setListListener(p);
		p.columnDtl_asppl_prnt_typ.addAllListener(p);
		p.columnDtl_asppl_prnt_typ.setListListener(p);
		p.columnDtl_asppl_prnt_typ_nm.addAllListener(p);
		p.columnDtl_asppl_prnt_typ_nm.setListListener(p);
		p.columnDtl_bsppl_prnt_typ.addAllListener(p);
		p.columnDtl_bsppl_prnt_typ.setListListener(p);
		p.columnDtl_bsppl_prnt_typ_nm.addAllListener(p);
		p.columnDtl_bsppl_prnt_typ_nm.setListListener(p);
		p.columnDtl_psppl_prnt_typ.addAllListener(p);
		p.columnDtl_psppl_prnt_typ.setListListener(p);
		p.columnDtl_psppl_prnt_typ_nm.addAllListener(p);
		p.columnDtl_psppl_prnt_typ_nm.setListListener(p);
	}

	/**
	 *  [SubTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSubTab(MABCP_CoReg p) {
		p.SubTabTab.addAllListener(p);
	}

	/**
	 *  [SubPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSubPanel(MABCP_CoReg p) {
	}

	/**
	 *  [DtlSub]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlSub(MABCP_CoReg p) {
		p.DtlSubTable.addAllListener(p);
		p.columnDtlSub_check.addAllListener(p);
		p.columnDtlSub_co_cd.addAllListener(p);
		p.columnDtlSub_co_cd.setListListener(p);
		p.columnDtlSub_sls_tax_cd.addAllListener(p);
		p.columnDtlSub_sls_tax_cd.setListListener(p);
		p.columnDtlSub_sls_tax_nm.addAllListener(p);
		p.columnDtlSub_sls_tax_nm.setListListener(p);
		p.columnDtlSub_purc_tax_cd.addAllListener(p);
		p.columnDtlSub_purc_tax_cd.setListListener(p);
		p.columnDtlSub_purc_tax_nm.addAllListener(p);
		p.columnDtlSub_purc_tax_nm.setListListener(p);
		p.columnDtlSub_prov_tax_cd.addAllListener(p);
		p.columnDtlSub_prov_tax_cd.setListListener(p);
		p.columnDtlSub_prov_tax_nm.addAllListener(p);
		p.columnDtlSub_prov_tax_nm.setListListener(p);
		p.columnDtlSub_memo1.addAllListener(p);
		p.columnDtlSub_memo1.setListListener(p);
		p.columnDtlSub_memo2.addAllListener(p);
		p.columnDtlSub_memo2.setListListener(p);
		p.columnDtlSub_memo3.addAllListener(p);
		p.columnDtlSub_memo3.setListListener(p);
		p.columnDtlSub_ins_usr_id.addAllListener(p);
		p.columnDtlSub_ins_usr_id.setListListener(p);
		p.columnDtlSub_ins_usr_nm.addAllListener(p);
		p.columnDtlSub_ins_usr_nm.setListListener(p);
		p.columnDtlSub_ins_ts.addAllListener(p);
		p.columnDtlSub_ins_ts.setListListener(p);
		p.columnDtlSub_ins_func_id.addAllListener(p);
		p.columnDtlSub_ins_func_id.setListListener(p);
		p.columnDtlSub_ins_func_nm.addAllListener(p);
		p.columnDtlSub_ins_func_nm.setListListener(p);
		p.columnDtlSub_upd_cntr.addAllListener(p);
		p.columnDtlSub_upd_cntr.setListListener(p);
		p.columnDtlSub_upd_usr_id.addAllListener(p);
		p.columnDtlSub_upd_usr_id.setListListener(p);
		p.columnDtlSub_upd_usr_nm.addAllListener(p);
		p.columnDtlSub_upd_usr_nm.setListListener(p);
		p.columnDtlSub_upd_ts.addAllListener(p);
		p.columnDtlSub_upd_ts.setListListener(p);
		p.columnDtlSub_upd_func_id.addAllListener(p);
		p.columnDtlSub_upd_func_id.setListListener(p);
		p.columnDtlSub_upd_func_nm.addAllListener(p);
		p.columnDtlSub_upd_func_nm.setListListener(p);
		p.columnDtlSub_upd_srv_req_no.addAllListener(p);
		p.columnDtlSub_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [DtlSubBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlSubBtn(MABCP_CoReg p) {
		p.DtlSubBtn_select_all.addAllListener(p);
		p.DtlSubBtn_select_all.setAPMethodName("doDtlSubBtn_select_all");
		p.DtlSubBtn_deselect_all.addAllListener(p);
		p.DtlSubBtn_deselect_all.setAPMethodName("doDtlSubBtn_deselect_all");
		p.DtlSubBtn_radd.addAllListener(p);
		p.DtlSubBtn_radd.setAPMethodName("doDtlSubBtn_radd");
		p.DtlSubBtn_rdel.addAllListener(p);
		p.DtlSubBtn_rdel.setAPMethodName("doDtlSubBtn_rdel");
		p.DtlSubBtn_rcopy.addAllListener(p);
		p.DtlSubBtn_rcopy.setAPMethodName("doDtlSubBtn_rcopy");
	}

	/**
	 *  [LclPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclPanel(MABCP_CoReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_CoReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_co_cd.addAllListener(p);
		p.columnLcl_co_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_co_alt_nm1.addAllListener(p);
		p.columnLcl_co_alt_nm1.setListListener(p);
		p.columnLcl_co_alt_nm2.addAllListener(p);
		p.columnLcl_co_alt_nm2.setListListener(p);
		p.columnLcl_co_alt_nm3.addAllListener(p);
		p.columnLcl_co_alt_nm3.setListListener(p);
		p.columnLcl_co_alt_nm4.addAllListener(p);
		p.columnLcl_co_alt_nm4.setListListener(p);
		p.columnLcl_zip_cd.addAllListener(p);
		p.columnLcl_zip_cd.setListListener(p);
		p.columnLcl_addr1.addAllListener(p);
		p.columnLcl_addr1.setListListener(p);
		p.columnLcl_addr2.addAllListener(p);
		p.columnLcl_addr2.setListListener(p);
		p.columnLcl_addr3.addAllListener(p);
		p.columnLcl_addr3.setListListener(p);
		p.columnLcl_addr4.addAllListener(p);
		p.columnLcl_addr4.setListListener(p);
		p.columnLcl_tel.addAllListener(p);
		p.columnLcl_tel.setListListener(p);
		p.columnLcl_fax.addAllListener(p);
		p.columnLcl_fax.setListListener(p);
		p.columnLcl_co_repl_nm.addAllListener(p);
		p.columnLcl_co_repl_nm.setListListener(p);
		p.columnLcl_memo1.addAllListener(p);
		p.columnLcl_memo1.setListListener(p);
		p.columnLcl_memo2.addAllListener(p);
		p.columnLcl_memo2.setListListener(p);
		p.columnLcl_memo3.addAllListener(p);
		p.columnLcl_memo3.setListListener(p);
		p.columnLcl_ins_usr_id.addAllListener(p);
		p.columnLcl_ins_usr_id.setListListener(p);
		p.columnLcl_ins_usr_nm.addAllListener(p);
		p.columnLcl_ins_usr_nm.setListListener(p);
		p.columnLcl_ins_ts.addAllListener(p);
		p.columnLcl_ins_ts.setListListener(p);
		p.columnLcl_ins_func_id.addAllListener(p);
		p.columnLcl_ins_func_id.setListListener(p);
		p.columnLcl_ins_func_nm.addAllListener(p);
		p.columnLcl_ins_func_nm.setListListener(p);
		p.columnLcl_upd_cntr.addAllListener(p);
		p.columnLcl_upd_cntr.setListListener(p);
		p.columnLcl_upd_usr_id.addAllListener(p);
		p.columnLcl_upd_usr_id.setListListener(p);
		p.columnLcl_upd_usr_nm.addAllListener(p);
		p.columnLcl_upd_usr_nm.setListListener(p);
		p.columnLcl_upd_ts.addAllListener(p);
		p.columnLcl_upd_ts.setListListener(p);
		p.columnLcl_upd_func_id.addAllListener(p);
		p.columnLcl_upd_func_id.setListListener(p);
		p.columnLcl_upd_func_nm.addAllListener(p);
		p.columnLcl_upd_func_nm.setListListener(p);
		p.columnLcl_upd_srv_req_no.addAllListener(p);
		p.columnLcl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABCP_CoReg p) {
		p.LclBtn_select_all.addAllListener(p);
		p.LclBtn_select_all.setAPMethodName("doLclBtn_select_all");
		p.LclBtn_deselect_all.addAllListener(p);
		p.LclBtn_deselect_all.setAPMethodName("doLclBtn_deselect_all");
		p.LclBtn_radd.addAllListener(p);
		p.LclBtn_radd.setAPMethodName("doLclBtn_radd");
		p.LclBtn_rdel.addAllListener(p);
		p.LclBtn_rdel.setAPMethodName("doLclBtn_rdel");
		p.LclBtn_rcopy.addAllListener(p);
		p.LclBtn_rcopy.setAPMethodName("doLclBtn_rcopy");
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_CoReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_co_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_co_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_CoReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_admin.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Upd1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Upd1(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[Upd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Upd2(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[Upd21]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Upd21(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[Upd22]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Upd22(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[Upd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Upd3(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[Upd4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Upd4(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base(MABCP_CoReg p){
		p.Base_co_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Base_co_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Base_co_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Base_co_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Base_co_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Base_cntry_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_cntry_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_area_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_area_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_addr1.putMode(p, UPD, MCMode.ENABLE);
		p.Base_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.Base_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.Base_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.Base_tel.putMode(p, UPD, MCMode.ENABLE);
		p.Base_fax.putMode(p, UPD, MCMode.ENABLE);
		p.Base_co_repl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Base_biz_co_no.putMode(p, UPD, MCMode.ENABLE);
		p.Base_ein.putMode(p, UPD, MCMode.ENABLE);
		p.Base_std_co_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_base_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ptax_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ac_cl_day.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_ac_cl_mon_base.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_st_mon.putMode(p, UPD, MCMode.ENABLE);
		p.Base_dt_switch_time.putMode(p, UPD, MCMode.ENABLE);
		p.Base_std_cal_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_std_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ar_no_use_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Base_ap_no_use_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Base_temp_ap_use_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Base_sls_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_rcv_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_purc_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_pay_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sls_cl_cal_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sls_cl_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_sls_cl_delay_days.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sls_cl_ba_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sls_cl_ba_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_rcv_cl_cal_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_rcv_cl_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_rcv_cl_delay_days.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_rcv_cl_ba_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_rcv_cl_ba_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_purc_cl_cal_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_purc_cl_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_purc_cl_delay_days.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_purc_cl_ba_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_purc_cl_ba_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_pay_cl_cal_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_pay_cl_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_pay_cl_delay_days.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_pay_cl_ba_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_pay_cl_ba_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_stk_cl_cal_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_stk_cl_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_stk_cl_delay_days.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_stk_cl_ba_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_stk_cl_ba_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_bill_cl_cal_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_bill_cl_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_pay_schd_cl_cal_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_pay_schd_cl_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_bill_xrate_conv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Base_pay_xrate_conv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Base_sls_xrate_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sls_xrate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_purc_xrate_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_purc_xrate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_prov_xrate_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_prov_xrate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_bill_xrate_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_bill_xrate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_pay_xrate_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_pay_xrate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_mon01_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon02_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon03_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon04_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon05_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon06_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon07_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon08_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon09_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon10_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon11_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mon12_xrate_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sls_upri_req_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sls_upri_req_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_sls_basis_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sls_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_bill_basis_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_bill_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ship_schd_split_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_ship_schd_split_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_xfr_stk_mng_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_xfr_stk_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_sls_bdj_rnd_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_sls_bdj_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_purc_upri_req_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_purc_upri_req_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_outsrc_upri_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_outsrc_upri_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_xrate_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_xrate_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_setoff_tax_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_setoff_tax_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_com_paid_tax_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_com_paid_tax_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_wtax_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_wtax_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_gm_std_upri_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_gm_std_upri_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_stk_std_upri_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_stk_std_upri_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_stk_amt_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_stk_amt_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_stk_amt_dec_place.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_po_print_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_po_print_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_stk_lst_cnf_num.putMode(p, UPD, MCMode.ENABLE);
		p.Base_stk_lst_limit_num.putMode(p, UPD, MCMode.ENABLE);
		p.Base_early_ship_dt_add_days.putMode(p, UPD, MCMode.ENABLE);
		p.Base_ac_slip_digit.putMode(p, UPD, MCMode.ENABLE);
		p.Base_ac_slip_seq_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_rpt_strg_ext_sys_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_rpt_strg_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_cst_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_cst_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_acst_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_acst_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_bcst_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_bcst_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_rcst_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_rcst_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_dlv_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_dlv_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_sppl_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sppl_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_asppl_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_asppl_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_bsppl_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_bsppl_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_psppl_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_psppl_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_CoReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_co_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_addr1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_addr2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_addr3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_addr4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_tel.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_fax.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_co_repl_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ein.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_biz_co_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_std_co_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_area_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_st_mon.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dt_switch_time.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ac_cl_day.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ac_cl_mon_base.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_std_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ar_no_use_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ap_no_use_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_temp_ap_use_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_cl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_delay_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_ba_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_delay_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_ba_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_delay_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_ba_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_delay_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_ba_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_delay_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_ba_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_conv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_conv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon01_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon02_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon03_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon04_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon05_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon06_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon07_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon08_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon09_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon10_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon11_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mon12_xrate_rev_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_basis_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_split_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xfr_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_setoff_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_com_paid_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_po_print_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_cnf_num.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_limit_num.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_gm_std_upri_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_std_upri_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_early_ship_dt_add_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ac_slip_digit.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ac_slip_seq_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_bdj_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_area_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_std_cal_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_cal_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_cal_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_cal_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_cal_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_cal_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_cal_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_cl_cal_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_xrate_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_xrate_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_xrate_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_ba_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_ba_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_ba_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_ba_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_ba_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_basis_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_split_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xfr_stk_mng_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_setoff_tax_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_com_paid_tax_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_bdj_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_po_print_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_gm_std_upri_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_std_upri_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rpt_strg_ext_sys_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rpt_strg_ext_sys_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_acst_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_acst_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bcst_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bcst_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcst_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rcst_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_asppl_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_asppl_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bsppl_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bsppl_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_psppl_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_psppl_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[SubTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SubTab(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[SubPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SubPanel(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[DtlSub]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlSub(MABCP_CoReg p){
		p.columnDtlSub_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlSub_co_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlSub_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtlSub_sls_tax_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlSub_sls_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_purc_tax_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlSub_purc_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_prov_tax_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlSub_prov_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlSub_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlSub_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlSub_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlSub_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSub_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlSubBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlSubBtn(MABCP_CoReg p){
		p.DtlSubBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlSubBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlSubBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlSubBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlSubBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclPanel(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_CoReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_co_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_co_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_co_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_co_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_addr1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_tel.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_fax.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_co_repl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABCP_CoReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_CoReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_CoReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_co_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_co_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_CoReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Upd1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Upd1(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[Upd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Upd2(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[Upd21]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Upd21(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[Upd22]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Upd22(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[Upd3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Upd3(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[Upd4]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Upd4(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Base(MABCP_CoReg p){
		p.Base_co_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.Base_co_alt_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_co_alt_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_co_alt_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_co_alt_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_cntry_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_cntry_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_area_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_area_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_fax.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_co_repl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_biz_co_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ein.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_std_co_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_base_cur_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_base_cur_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ptax_cur_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ptax_cur_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ac_cl_day.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ac_cl_mon_base.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_st_mon.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_dt_switch_time.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_std_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_std_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ar_no_use_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ap_no_use_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_temp_ap_use_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rcv_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_cl_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_cl_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_cl_delay_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_cl_ba_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_cl_ba_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rcv_cl_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rcv_cl_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rcv_cl_delay_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rcv_cl_ba_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rcv_cl_ba_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_cl_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_cl_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_cl_delay_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_cl_ba_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_cl_ba_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_cl_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_cl_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_cl_delay_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_cl_ba_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_cl_ba_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_cl_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_cl_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_cl_delay_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_cl_ba_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_cl_ba_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bill_cl_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bill_cl_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_schd_cl_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_schd_cl_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bill_xrate_conv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_xrate_conv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_xrate_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_xrate_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_xrate_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_xrate_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_prov_xrate_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_prov_xrate_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bill_xrate_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bill_xrate_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_xrate_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pay_xrate_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon01_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon02_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon03_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon04_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon05_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon06_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon07_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon08_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon09_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon10_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon11_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mon12_xrate_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_upri_req_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_upri_req_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_basis_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_basis_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bill_basis_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bill_basis_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ship_schd_split_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ship_schd_split_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_xfr_stk_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_xfr_stk_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_bdj_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sls_bdj_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_upri_req_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_upri_req_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_outsrc_upri_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_outsrc_upri_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_xrate_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_xrate_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_setoff_tax_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_setoff_tax_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_com_paid_tax_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_com_paid_tax_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_wtax_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_wtax_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_gm_std_upri_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_gm_std_upri_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_std_upri_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_std_upri_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_amt_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_amt_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_amt_dec_place.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_po_print_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_po_print_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_lst_cnf_num.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_lst_limit_num.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_early_ship_dt_add_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ac_slip_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ac_slip_seq_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rpt_strg_ext_sys_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rpt_strg_ext_sys_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_cst_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_cst_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_acst_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_acst_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bcst_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bcst_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rcst_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rcst_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_dlv_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_dlv_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sppl_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sppl_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_asppl_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_asppl_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bsppl_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_bsppl_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_psppl_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_psppl_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_CoReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_co_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm1.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm2.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm3.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm4.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_addr1.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_addr2.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_addr3.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_addr4.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_tel.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_fax.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_co_repl_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ein.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_biz_co_no.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_std_co_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_cntry_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_area_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_st_mon.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_dt_switch_time.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ac_cl_day.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ac_cl_mon_base.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_std_cal_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_cal_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ar_no_use_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ap_no_use_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_temp_ap_use_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_cal_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_cal_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_cal_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_cal_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_cal_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_cl_cal_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_delay_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_ba_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_delay_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_ba_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_delay_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_ba_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_delay_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_ba_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_delay_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_ba_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_conv_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_conv_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_xrate_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_xrate_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_prov_xrate_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon01_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon02_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon03_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon04_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon05_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon06_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon07_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon08_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon09_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon10_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon11_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mon12_xrate_rev_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_basis_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_split_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_xfr_stk_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_setoff_tax_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_com_paid_tax_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_po_print_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_cnf_num.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_limit_num.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_gm_std_upri_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_std_upri_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_early_ship_dt_add_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ac_slip_digit.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ac_slip_seq_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_bdj_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_cntry_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_area_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_base_cur_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_std_cal_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_cal_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_cal_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_cal_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_cal_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_cal_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_cal_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_cl_cal_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_xrate_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_xrate_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_prov_xrate_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_ba_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_ba_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_ba_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_ba_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_ba_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_basis_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_split_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_xfr_stk_mng_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_setoff_tax_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_com_paid_tax_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_bdj_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_po_print_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_gm_std_upri_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_std_upri_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rpt_strg_ext_sys_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rpt_strg_ext_sys_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_cst_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_cst_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_acst_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_acst_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bcst_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bcst_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rcst_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rcst_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sppl_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sppl_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_asppl_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_asppl_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bsppl_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bsppl_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_psppl_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_psppl_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[SubTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SubTab(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[SubPanel]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SubPanel(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[DtlSub]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlSub(MABCP_CoReg p){
		p.columnDtlSub_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_co_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlSub_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtlSub_sls_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_sls_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_purc_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_purc_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_prov_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_prov_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlSub_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSub_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlSubBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlSubBtn(MABCP_CoReg p){
		p.DtlSubBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlSubBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlSubBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlSubBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlSubBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclPanel]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclPanel(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_CoReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_co_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_fax.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_co_repl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABCP_CoReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_CoReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_ScreenOpe(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Cnd(MABCP_CoReg p){
		p.Cnd_ope_Group.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Cnd_co_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Cnd_co_nm_lcl.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Tab(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Btn(MABCP_CoReg p){
		p.Btn_upd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.Btn_upd_admin.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Upd1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Upd1(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Upd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Upd2(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Upd21]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Upd21(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Upd22]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Upd22(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Upd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Upd3(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Upd4]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Upd4(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Base(MABCP_CoReg p){
		p.Base_co_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.Base_co_alt_nm1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_co_alt_nm2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_co_alt_nm3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_co_alt_nm4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_cntry_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_cntry_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_area_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_area_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_zip_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_addr1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_addr2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_addr3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_addr4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_tel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_fax.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_co_repl_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_biz_co_no.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_ein.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_std_co_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_base_cur_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_base_cur_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_ptax_cur_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_ptax_cur_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_ac_cl_day.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_ac_cl_mon_base.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_st_mon.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_dt_switch_time.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_std_cal_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_std_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_ar_no_use_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_ap_no_use_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_temp_ap_use_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_sls_cl_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_rcv_cl_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_purc_cl_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_pay_cl_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_sls_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_sls_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_sls_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_sls_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_sls_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_rcv_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_rcv_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_rcv_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_rcv_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_rcv_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_purc_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_purc_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_purc_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_purc_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_purc_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_pay_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_pay_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_pay_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_pay_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_pay_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_stk_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_stk_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_stk_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_stk_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_stk_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_bill_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_bill_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_pay_schd_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_pay_schd_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_bill_xrate_conv_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_pay_xrate_conv_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_sls_xrate_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_sls_xrate_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_purc_xrate_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_purc_xrate_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_prov_xrate_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_prov_xrate_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_bill_xrate_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_bill_xrate_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_pay_xrate_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_pay_xrate_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_mon01_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon02_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon03_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon04_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon05_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon06_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon07_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon08_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon09_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon10_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon11_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_mon12_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_sls_upri_req_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_sls_upri_req_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_sls_basis_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_sls_basis_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_bill_basis_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_bill_basis_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_ship_schd_split_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_ship_schd_split_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_xfr_stk_mng_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_xfr_stk_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_sls_bdj_rnd_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_sls_bdj_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_purc_upri_req_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_purc_upri_req_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_outsrc_upri_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_outsrc_upri_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_xrate_rnd_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_xrate_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_setoff_tax_rnd_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_setoff_tax_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_com_paid_tax_rnd_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_com_paid_tax_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_wtax_rnd_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_wtax_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_gm_std_upri_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_gm_std_upri_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_stk_std_upri_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_stk_std_upri_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_stk_amt_rnd_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_stk_amt_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_stk_amt_dec_place.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_po_print_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_po_print_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_stk_lst_cnf_num.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_stk_lst_limit_num.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_early_ship_dt_add_days.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_ac_slip_digit.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_ac_slip_seq_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_rpt_strg_ext_sys_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Base_rpt_strg_ext_sys_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_cst_prnt_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_cst_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_acst_prnt_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_acst_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_bcst_prnt_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_bcst_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_rcst_prnt_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_rcst_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_dlv_prnt_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_dlv_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_sppl_prnt_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_sppl_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_asppl_prnt_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_asppl_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_bsppl_prnt_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_bsppl_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_psppl_prnt_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Base_psppl_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Dtl(MABCP_CoReg p){
		p.columnDtl_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_co_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm1.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm2.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm3.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm4.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_addr1.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_addr2.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_addr3.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_addr4.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_tel.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_fax.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_co_repl_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ein.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_biz_co_no.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_std_co_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_cntry_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_area_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_st_mon.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_dt_switch_time.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ac_cl_day.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ac_cl_mon_base.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_std_cal_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ar_no_use_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ap_no_use_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_temp_ap_use_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_cl_cal_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_delay_days.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_ba_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_conv_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_conv_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_xrate_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_xrate_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_prov_xrate_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon01_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon02_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon03_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon04_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon05_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon06_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon07_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon08_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon09_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon10_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon11_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_mon12_xrate_rev_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_basis_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_split_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_xfr_stk_mng_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_setoff_tax_rnd_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_com_paid_tax_rnd_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_rnd_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_dec_place.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_po_print_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_cnf_num.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_limit_num.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_gm_std_upri_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_std_upri_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_early_ship_dt_add_days.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ac_slip_digit.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ac_slip_seq_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_bdj_rnd_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_cntry_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_area_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_base_cur_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_std_cal_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_cl_cal_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_xrate_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_xrate_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_prov_xrate_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_ba_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_basis_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_split_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_xfr_stk_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_setoff_tax_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_com_paid_tax_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_bdj_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_po_print_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_gm_std_upri_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_stk_std_upri_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ins_ts.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ins_func_id.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_ts.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_func_id.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rpt_strg_ext_sys_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rpt_strg_ext_sys_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_cst_prnt_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_cst_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_acst_prnt_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_acst_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bcst_prnt_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bcst_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rcst_prnt_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_rcst_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnt_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sppl_prnt_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sppl_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_asppl_prnt_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_asppl_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bsppl_prnt_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_bsppl_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_psppl_prnt_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_psppl_prnt_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[SubTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_SubTab(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[SubPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_SubPanel(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlSub]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlSub(MABCP_CoReg p){
		p.columnDtlSub_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlSub_co_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.DtlSub_dt_p_PPanel.putStatus(UPD_ADMIN, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtlSub_sls_tax_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlSub_sls_tax_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_purc_tax_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlSub_purc_tax_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_prov_tax_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtlSub_prov_tax_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlSub_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlSub_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtlSub_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtlSub_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtlSub_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlSubBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlSubBtn(MABCP_CoReg p){
		p.DtlSubBtn_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlSubBtn_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlSubBtn_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlSubBtn_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlSubBtn_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclPanel(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Lcl(MABCP_CoReg p){
		p.columnLcl_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLcl_co_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_co_alt_nm2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_co_alt_nm3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_co_alt_nm4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_zip_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_addr1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_addr2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_addr3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_addr4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_tel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_fax.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_co_repl_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclAll(MABCP_CoReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclBtn(MABCP_CoReg p){
		p.LclBtn_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_CoReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_co_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_co_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_CoReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Upd1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Upd1(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[Upd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Upd2(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[Upd21]ブロックのモードの設定
	 */
	protected static void statusInitREF_Upd21(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[Upd22]ブロックのモードの設定
	 */
	protected static void statusInitREF_Upd22(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[Upd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Upd3(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[Upd4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Upd4(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base(MABCP_CoReg p){
		p.Base_co_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Base_co_alt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_co_alt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_co_alt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_co_alt_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_area_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_area_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_co_repl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_biz_co_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ein.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_std_co_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ac_cl_day.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ac_cl_mon_base.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_st_mon.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_dt_switch_time.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_std_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_std_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ar_no_use_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ap_no_use_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_temp_ap_use_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_cl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rcv_cl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_cl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_cl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_cl_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_cl_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_cl_delay_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_cl_ba_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_cl_ba_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rcv_cl_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rcv_cl_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rcv_cl_delay_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rcv_cl_ba_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rcv_cl_ba_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_cl_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_cl_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_cl_delay_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_cl_ba_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_cl_ba_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_cl_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_cl_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_cl_delay_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_cl_ba_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_cl_ba_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_cl_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_cl_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_cl_delay_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_cl_ba_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_cl_ba_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bill_cl_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bill_cl_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_schd_cl_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_schd_cl_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bill_xrate_conv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_xrate_conv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_prov_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_prov_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bill_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bill_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pay_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon01_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon02_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon03_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon04_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon05_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon06_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon07_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon08_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon09_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon10_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon11_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mon12_xrate_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_upri_req_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_upri_req_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bill_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bill_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ship_schd_split_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ship_schd_split_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_xfr_stk_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_xfr_stk_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_bdj_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sls_bdj_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_upri_req_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_upri_req_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_outsrc_upri_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_outsrc_upri_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_xrate_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_xrate_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_setoff_tax_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_setoff_tax_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_com_paid_tax_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_com_paid_tax_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_wtax_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_wtax_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_gm_std_upri_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_gm_std_upri_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_std_upri_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_std_upri_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_amt_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_amt_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_amt_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_po_print_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_po_print_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_lst_cnf_num.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_lst_limit_num.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_early_ship_dt_add_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ac_slip_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ac_slip_seq_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rpt_strg_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rpt_strg_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_cst_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_cst_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_acst_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_acst_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bcst_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bcst_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rcst_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rcst_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_dlv_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_dlv_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sppl_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sppl_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_asppl_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_asppl_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bsppl_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_bsppl_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_psppl_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_psppl_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_CoReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_co_alt_nm4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_addr1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_addr2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_addr3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_addr4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_tel.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_fax.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_co_repl_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ein.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_biz_co_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_std_co_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_area_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_st_mon.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dt_switch_time.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ac_cl_day.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ac_cl_mon_base.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_std_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ar_no_use_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ap_no_use_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_temp_ap_use_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_cl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_delay_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_ba_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_delay_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_ba_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_delay_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_ba_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_delay_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_ba_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_delay_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_ba_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_conv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_conv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_prov_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon01_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon02_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon03_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon04_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon05_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon06_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon07_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon08_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon09_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon10_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon11_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mon12_xrate_rev_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_basis_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_split_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xfr_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_setoff_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_com_paid_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_po_print_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_cnf_num.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_lst_limit_num.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_gm_std_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_std_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_early_ship_dt_add_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ac_slip_digit.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ac_slip_seq_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_bdj_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_area_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_cur_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_std_cal_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_cal_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_cal_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bill_cl_cal_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_cal_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_cal_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_cal_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_schd_cl_cal_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_xrate_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_xrate_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_prov_xrate_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bill_xrate_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_xrate_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_cl_ba_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_cl_ba_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcv_cl_ba_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_cl_ba_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pay_cl_ba_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_req_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_basis_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bill_basis_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_split_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xfr_stk_mng_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xrate_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_setoff_tax_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_com_paid_tax_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_amt_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_bdj_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_po_print_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_gm_std_upri_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_std_upri_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rpt_strg_ext_sys_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rpt_strg_ext_sys_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_acst_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_acst_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bcst_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bcst_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcst_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rcst_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sppl_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sppl_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_asppl_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_asppl_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bsppl_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bsppl_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_psppl_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_psppl_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[SubTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_SubTab(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[SubPanel]ブロックのモードの設定
	 */
	protected static void statusInitREF_SubPanel(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[DtlSub]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlSub(MABCP_CoReg p){
		p.columnDtlSub_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlSub_co_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlSub_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtlSub_sls_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_sls_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_purc_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_purc_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_prov_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_prov_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlSub_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSub_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlSubBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlSubBtn(MABCP_CoReg p){
		p.DtlSubBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlSubBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlSubBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlSubBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlSubBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclPanel]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclPanel(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_CoReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_co_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_co_alt_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_co_repl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABCP_CoReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABCP_CoReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABCP_CoReg_MC.setTableConfigDtl((MABCP_CoReg)this);
		MABCP_CoReg_MC.setTableConfigDtlSub((MABCP_CoReg)this);
		MABCP_CoReg_MC.setTableConfigLcl((MABCP_CoReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_CoReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0020.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_co_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.co_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_cd);
		p.columnDtl_co_alt_nm1.setMeta(mcframe.clientMABC.MABCP0020.DtlR.co_alt_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_alt_nm1);
		p.columnDtl_co_alt_nm2.setMeta(mcframe.clientMABC.MABCP0020.DtlR.co_alt_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_alt_nm2);
		p.columnDtl_co_alt_nm3.setMeta(mcframe.clientMABC.MABCP0020.DtlR.co_alt_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_alt_nm3);
		p.columnDtl_co_alt_nm4.setMeta(mcframe.clientMABC.MABCP0020.DtlR.co_alt_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_alt_nm4);
		p.columnDtl_zip_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.zip_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_zip_cd);
		p.columnDtl_addr1.setMeta(mcframe.clientMABC.MABCP0020.DtlR.addr1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr1);
		p.columnDtl_addr2.setMeta(mcframe.clientMABC.MABCP0020.DtlR.addr2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr2);
		p.columnDtl_addr3.setMeta(mcframe.clientMABC.MABCP0020.DtlR.addr3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr3);
		p.columnDtl_addr4.setMeta(mcframe.clientMABC.MABCP0020.DtlR.addr4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr4);
		p.columnDtl_tel.setMeta(mcframe.clientMABC.MABCP0020.DtlR.tel_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tel);
		p.columnDtl_fax.setMeta(mcframe.clientMABC.MABCP0020.DtlR.fax_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fax);
		p.columnDtl_co_repl_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.co_repl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_repl_nm);
		p.columnDtl_ein.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ein_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ein);
		p.columnDtl_biz_co_no.setMeta(mcframe.clientMABC.MABCP0020.DtlR.biz_co_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_biz_co_no);
		p.columnDtl_std_co_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.std_co_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_co_cd);
		p.columnDtl_cntry_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.cntry_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_cd);
		p.columnDtl_area_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.area_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_area_cd);
		p.columnDtl_base_cur_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.base_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_cd);
		p.columnDtl_ptax_cur_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ptax_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_cd);
		p.columnDtl_st_mon.setMeta(mcframe.clientMABC.MABCP0020.DtlR.st_mon_META);
		p.DtlTable.addColumnConfig(p.columnDtl_st_mon);
		p.columnDtl_dt_switch_time.setMeta(mcframe.clientMABC.MABCP0020.DtlR.dt_switch_time_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dt_switch_time);
		p.columnDtl_ac_cl_day.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ac_cl_day_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_cl_day);
		p.columnDtl_ac_cl_mon_base.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ac_cl_mon_base_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_cl_mon_base);
		p.columnDtl_std_cal_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.std_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_cal_cd);
		p.columnDtl_bill_cl_cal_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bill_cl_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_cl_cal_cd);
		p.columnDtl_ar_no_use_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ar_no_use_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_no_use_flg);
		p.columnDtl_ap_no_use_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ap_no_use_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_no_use_flg);
		p.columnDtl_temp_ap_use_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.temp_ap_use_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_temp_ap_use_flg);
		p.columnDtl_sls_cl_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_cl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_cl_flg);
		p.columnDtl_rcv_cl_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rcv_cl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_cl_flg);
		p.columnDtl_purc_cl_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_cl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_cl_flg);
		p.columnDtl_pay_cl_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_cl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_cl_flg);
		p.columnDtl_stk_cl_cal_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_cl_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_cl_cal_cd);
		p.columnDtl_sls_cl_cal_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_cl_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_cl_cal_cd);
		p.columnDtl_rcv_cl_cal_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rcv_cl_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_cl_cal_cd);
		p.columnDtl_purc_cl_cal_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_cl_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_cl_cal_cd);
		p.columnDtl_pay_cl_cal_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_cl_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_cl_cal_cd);
		p.columnDtl_pay_schd_cl_cal_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_schd_cl_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_schd_cl_cal_cd);
		p.columnDtl_stk_cl_delay_days.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_cl_delay_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_cl_delay_days);
		p.columnDtl_stk_cl_ba_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_cl_ba_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_cl_ba_typ);
		p.columnDtl_sls_cl_delay_days.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_cl_delay_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_cl_delay_days);
		p.columnDtl_sls_cl_ba_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_cl_ba_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_cl_ba_typ);
		p.columnDtl_rcv_cl_delay_days.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rcv_cl_delay_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_cl_delay_days);
		p.columnDtl_rcv_cl_ba_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rcv_cl_ba_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_cl_ba_typ);
		p.columnDtl_purc_cl_delay_days.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_cl_delay_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_cl_delay_days);
		p.columnDtl_purc_cl_ba_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_cl_ba_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_cl_ba_typ);
		p.columnDtl_pay_cl_delay_days.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_cl_delay_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_cl_delay_days);
		p.columnDtl_pay_cl_ba_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_cl_ba_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_cl_ba_typ);
		p.columnDtl_bill_xrate_conv_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bill_xrate_conv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_xrate_conv_flg);
		p.columnDtl_pay_xrate_conv_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_xrate_conv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_xrate_conv_flg);
		p.columnDtl_sls_xrate_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_xrate_cd);
		p.columnDtl_purc_xrate_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_xrate_cd);
		p.columnDtl_prov_xrate_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.prov_xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_xrate_cd);
		p.columnDtl_bill_xrate_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bill_xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_xrate_cd);
		p.columnDtl_pay_xrate_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_xrate_cd);
		p.columnDtl_mon01_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon01_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon01_xrate_rev_flg);
		p.columnDtl_mon02_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon02_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon02_xrate_rev_flg);
		p.columnDtl_mon03_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon03_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon03_xrate_rev_flg);
		p.columnDtl_mon04_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon04_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon04_xrate_rev_flg);
		p.columnDtl_mon05_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon05_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon05_xrate_rev_flg);
		p.columnDtl_mon06_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon06_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon06_xrate_rev_flg);
		p.columnDtl_mon07_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon07_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon07_xrate_rev_flg);
		p.columnDtl_mon08_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon08_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon08_xrate_rev_flg);
		p.columnDtl_mon09_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon09_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon09_xrate_rev_flg);
		p.columnDtl_mon10_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon10_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon10_xrate_rev_flg);
		p.columnDtl_mon11_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon11_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon11_xrate_rev_flg);
		p.columnDtl_mon12_xrate_rev_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.mon12_xrate_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon12_xrate_rev_flg);
		p.columnDtl_sls_upri_req_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_upri_req_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_req_typ);
		p.columnDtl_purc_upri_req_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_upri_req_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_req_typ);
		p.columnDtl_outsrc_upri_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.outsrc_upri_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_upri_typ);
		p.columnDtl_sls_basis_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_basis_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_basis_typ);
		p.columnDtl_bill_basis_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bill_basis_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_basis_typ);
		p.columnDtl_ship_schd_split_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ship_schd_split_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_split_typ);
		p.columnDtl_xfr_stk_mng_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.xfr_stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_stk_mng_typ);
		p.columnDtl_setoff_tax_rnd_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.setoff_tax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_setoff_tax_rnd_typ);
		p.columnDtl_xrate_rnd_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.xrate_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_rnd_typ);
		p.columnDtl_com_paid_tax_rnd_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.com_paid_tax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_com_paid_tax_rnd_typ);
		p.columnDtl_wtax_rnd_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.wtax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rnd_typ);
		p.columnDtl_stk_amt_rnd_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_amt_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_amt_rnd_typ);
		p.columnDtl_stk_amt_dec_place.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_amt_dec_place);
		p.columnDtl_po_print_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.po_print_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_print_cd);
		p.columnDtl_stk_lst_cnf_num.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_lst_cnf_num_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_lst_cnf_num);
		p.columnDtl_stk_lst_limit_num.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_lst_limit_num_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_lst_limit_num);
		p.columnDtl_gm_std_upri_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.gm_std_upri_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gm_std_upri_typ);
		p.columnDtl_stk_std_upri_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_std_upri_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_std_upri_typ);
		p.columnDtl_early_ship_dt_add_days.setMeta(mcframe.clientMABC.MABCP0020.DtlR.early_ship_dt_add_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_early_ship_dt_add_days);
		p.columnDtl_ac_slip_digit.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ac_slip_digit_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_digit);
		p.columnDtl_ac_slip_seq_flg.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ac_slip_seq_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_seq_flg);
		p.columnDtl_sls_bdj_rnd_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_bdj_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_bdj_rnd_typ);
		p.columnDtl_cntry_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.cntry_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_nm);
		p.columnDtl_area_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.area_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_area_nm);
		p.columnDtl_base_cur_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.base_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_nm);
		p.columnDtl_ptax_cur_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ptax_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_nm);
		p.columnDtl_std_cal_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.std_cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_cal_nm);
		p.columnDtl_stk_cl_cal_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_cl_cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_cl_cal_nm);
		p.columnDtl_sls_cl_cal_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_cl_cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_cl_cal_nm);
		p.columnDtl_bill_cl_cal_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bill_cl_cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_cl_cal_nm);
		p.columnDtl_rcv_cl_cal_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rcv_cl_cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_cl_cal_nm);
		p.columnDtl_purc_cl_cal_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_cl_cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_cl_cal_nm);
		p.columnDtl_pay_cl_cal_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_cl_cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_cl_cal_nm);
		p.columnDtl_pay_schd_cl_cal_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_schd_cl_cal_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_schd_cl_cal_nm);
		p.columnDtl_sls_xrate_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_xrate_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_xrate_nm);
		p.columnDtl_purc_xrate_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_xrate_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_xrate_nm);
		p.columnDtl_prov_xrate_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.prov_xrate_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_xrate_nm);
		p.columnDtl_bill_xrate_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bill_xrate_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_xrate_nm);
		p.columnDtl_pay_xrate_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_xrate_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_xrate_nm);
		p.columnDtl_stk_cl_ba_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_cl_ba_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_cl_ba_typ_nm);
		p.columnDtl_sls_cl_ba_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_cl_ba_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_cl_ba_typ_nm);
		p.columnDtl_rcv_cl_ba_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rcv_cl_ba_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_cl_ba_typ_nm);
		p.columnDtl_purc_cl_ba_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_cl_ba_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_cl_ba_typ_nm);
		p.columnDtl_pay_cl_ba_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.pay_cl_ba_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_cl_ba_typ_nm);
		p.columnDtl_sls_upri_req_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_upri_req_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_req_typ_nm);
		p.columnDtl_purc_upri_req_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.purc_upri_req_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_req_typ_nm);
		p.columnDtl_outsrc_upri_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.outsrc_upri_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_upri_typ_nm);
		p.columnDtl_sls_basis_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_basis_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_basis_typ_nm);
		p.columnDtl_bill_basis_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bill_basis_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_basis_typ_nm);
		p.columnDtl_ship_schd_split_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ship_schd_split_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_split_typ_nm);
		p.columnDtl_xfr_stk_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.xfr_stk_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_stk_mng_typ_nm);
		p.columnDtl_xrate_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.xrate_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_rnd_typ_nm);
		p.columnDtl_setoff_tax_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.setoff_tax_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_setoff_tax_rnd_typ_nm);
		p.columnDtl_com_paid_tax_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.com_paid_tax_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_com_paid_tax_rnd_typ_nm);
		p.columnDtl_wtax_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.wtax_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rnd_typ_nm);
		p.columnDtl_stk_amt_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_amt_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_amt_rnd_typ_nm);
		p.columnDtl_sls_bdj_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sls_bdj_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_bdj_rnd_typ_nm);
		p.columnDtl_po_print_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.po_print_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_print_nm);
		p.columnDtl_gm_std_upri_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.gm_std_upri_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gm_std_upri_typ_nm);
		p.columnDtl_stk_std_upri_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.stk_std_upri_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_std_upri_typ_nm);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0020.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0020.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0020.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0020.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0020.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_rpt_strg_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rpt_strg_ext_sys_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_strg_ext_sys_cd);
		p.columnDtl_rpt_strg_ext_sys_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rpt_strg_ext_sys_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_strg_ext_sys_nm);
		p.columnDtl_cst_prnt_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.cst_prnt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_prnt_typ);
		p.columnDtl_cst_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.cst_prnt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_prnt_typ_nm);
		p.columnDtl_acst_prnt_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.acst_prnt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acst_prnt_typ);
		p.columnDtl_acst_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.acst_prnt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acst_prnt_typ_nm);
		p.columnDtl_bcst_prnt_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bcst_prnt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bcst_prnt_typ);
		p.columnDtl_bcst_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bcst_prnt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bcst_prnt_typ_nm);
		p.columnDtl_rcst_prnt_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rcst_prnt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcst_prnt_typ);
		p.columnDtl_rcst_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.rcst_prnt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcst_prnt_typ_nm);
		p.columnDtl_dlv_prnt_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.dlv_prnt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_prnt_typ);
		p.columnDtl_dlv_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.dlv_prnt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_prnt_typ_nm);
		p.columnDtl_sppl_prnt_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sppl_prnt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_prnt_typ);
		p.columnDtl_sppl_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.sppl_prnt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_prnt_typ_nm);
		p.columnDtl_asppl_prnt_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.asppl_prnt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asppl_prnt_typ);
		p.columnDtl_asppl_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.asppl_prnt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asppl_prnt_typ_nm);
		p.columnDtl_bsppl_prnt_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bsppl_prnt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_prnt_typ);
		p.columnDtl_bsppl_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.bsppl_prnt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_prnt_typ_nm);
		p.columnDtl_psppl_prnt_typ.setMeta(mcframe.clientMABC.MABCP0020.DtlR.psppl_prnt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_psppl_prnt_typ);
		p.columnDtl_psppl_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlR.psppl_prnt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_psppl_prnt_typ_nm);
	}

	/**
	 * [DtlSub]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlSub(MABCP_CoReg p) {
		p.columnDtlSub_check.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.check_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_check);
		p.columnDtlSub_co_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.co_cd_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_co_cd);
		p.DtlSubTable.addTable(p.DtlSub_dt_p_PPanel.DtTable);
		p.columnDtlSub_sls_tax_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.sls_tax_cd_META);
		p.columnDtlSub_sls_tax_cd.addLinkBeans(p.columnDtlSub_sls_tax_nm);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_sls_tax_cd);
		p.columnDtlSub_sls_tax_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.sls_tax_nm_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_sls_tax_nm);
		p.columnDtlSub_purc_tax_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.purc_tax_cd_META);
		p.columnDtlSub_purc_tax_cd.addLinkBeans(p.columnDtlSub_purc_tax_nm);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_purc_tax_cd);
		p.columnDtlSub_purc_tax_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.purc_tax_nm_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_purc_tax_nm);
		p.columnDtlSub_prov_tax_cd.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.prov_tax_cd_META);
		p.columnDtlSub_prov_tax_cd.addLinkBeans(p.columnDtlSub_prov_tax_nm);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_prov_tax_cd);
		p.columnDtlSub_prov_tax_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.prov_tax_nm_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_prov_tax_nm);
		p.columnDtlSub_memo1.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.memo1_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_memo1);
		p.columnDtlSub_memo2.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.memo2_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_memo2);
		p.columnDtlSub_memo3.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.memo3_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_memo3);
		p.columnDtlSub_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.ins_usr_id_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_ins_usr_id);
		p.columnDtlSub_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.ins_usr_nm_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_ins_usr_nm);
		p.columnDtlSub_ins_ts.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.ins_ts_META);
		p.columnDtlSub_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_ins_ts);
		p.columnDtlSub_ins_func_id.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.ins_func_id_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_ins_func_id);
		p.columnDtlSub_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.ins_func_nm_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_ins_func_nm);
		p.columnDtlSub_upd_cntr.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.upd_cntr_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_upd_cntr);
		p.columnDtlSub_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.upd_usr_id_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_upd_usr_id);
		p.columnDtlSub_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.upd_usr_nm_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_upd_usr_nm);
		p.columnDtlSub_upd_ts.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.upd_ts_META);
		p.columnDtlSub_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_upd_ts);
		p.columnDtlSub_upd_func_id.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.upd_func_id_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_upd_func_id);
		p.columnDtlSub_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.upd_func_nm_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_upd_func_nm);
		p.columnDtlSub_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0020.DtlSubR.upd_srv_req_no_META);
		p.DtlSubTable.addColumnConfig(p.columnDtlSub_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.DtlSubTable.setUnscrollColumn(p.columnDtlSub_end_dt);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_CoReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0020.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_co_cd.setMeta(mcframe.clientMABC.MABCP0020.LclR.co_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_co_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0020.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0020.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_co_alt_nm1.setMeta(mcframe.clientMABC.MABCP0020.LclR.co_alt_nm1_META);
		p.LclTable.addColumnConfig(p.columnLcl_co_alt_nm1);
		p.columnLcl_co_alt_nm2.setMeta(mcframe.clientMABC.MABCP0020.LclR.co_alt_nm2_META);
		p.LclTable.addColumnConfig(p.columnLcl_co_alt_nm2);
		p.columnLcl_co_alt_nm3.setMeta(mcframe.clientMABC.MABCP0020.LclR.co_alt_nm3_META);
		p.LclTable.addColumnConfig(p.columnLcl_co_alt_nm3);
		p.columnLcl_co_alt_nm4.setMeta(mcframe.clientMABC.MABCP0020.LclR.co_alt_nm4_META);
		p.LclTable.addColumnConfig(p.columnLcl_co_alt_nm4);
		p.columnLcl_zip_cd.setMeta(mcframe.clientMABC.MABCP0020.LclR.zip_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_zip_cd);
		p.columnLcl_addr1.setMeta(mcframe.clientMABC.MABCP0020.LclR.addr1_META);
		p.LclTable.addColumnConfig(p.columnLcl_addr1);
		p.columnLcl_addr2.setMeta(mcframe.clientMABC.MABCP0020.LclR.addr2_META);
		p.LclTable.addColumnConfig(p.columnLcl_addr2);
		p.columnLcl_addr3.setMeta(mcframe.clientMABC.MABCP0020.LclR.addr3_META);
		p.LclTable.addColumnConfig(p.columnLcl_addr3);
		p.columnLcl_addr4.setMeta(mcframe.clientMABC.MABCP0020.LclR.addr4_META);
		p.LclTable.addColumnConfig(p.columnLcl_addr4);
		p.columnLcl_tel.setMeta(mcframe.clientMABC.MABCP0020.LclR.tel_META);
		p.LclTable.addColumnConfig(p.columnLcl_tel);
		p.columnLcl_fax.setMeta(mcframe.clientMABC.MABCP0020.LclR.fax_META);
		p.LclTable.addColumnConfig(p.columnLcl_fax);
		p.columnLcl_co_repl_nm.setMeta(mcframe.clientMABC.MABCP0020.LclR.co_repl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_co_repl_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0020.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0020.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0020.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0020.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0020.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0020.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0020.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0020.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0020.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0020.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0020.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0020.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0020.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0020.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0020.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Base_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_cntry_cd.getListConfig().setPutter(getBase_cntry_cd_ListPutter());
		Base_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_area_cd.getListConfig().setPutter(getBase_area_cd_ListPutter());
		Base_base_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_base_cur_cd.getListConfig().setPutter(getBase_base_cur_cd_ListPutter());
		Base_ptax_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_ptax_cur_cd.getListConfig().setPutter(getBase_ptax_cur_cd_ListPutter());
		Base_std_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_std_cal_cd.getListConfig().setPutter(getBase_std_cal_cd_ListPutter());
		Base_sls_cl_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sls_cl_cal_cd.getListConfig().setPutter(getBase_sls_cl_cal_cd_ListPutter());
		Base_sls_cl_ba_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sls_cl_ba_typ.getListConfig().setPutter(getBase_sls_cl_ba_typ_ListPutter());
		Base_rcv_cl_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_rcv_cl_cal_cd.getListConfig().setPutter(getBase_rcv_cl_cal_cd_ListPutter());
		Base_rcv_cl_ba_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_rcv_cl_ba_typ.getListConfig().setPutter(getBase_rcv_cl_ba_typ_ListPutter());
		Base_purc_cl_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_purc_cl_cal_cd.getListConfig().setPutter(getBase_purc_cl_cal_cd_ListPutter());
		Base_purc_cl_ba_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_purc_cl_ba_typ.getListConfig().setPutter(getBase_purc_cl_ba_typ_ListPutter());
		Base_pay_cl_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_pay_cl_cal_cd.getListConfig().setPutter(getBase_pay_cl_cal_cd_ListPutter());
		Base_pay_cl_ba_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_pay_cl_ba_typ.getListConfig().setPutter(getBase_pay_cl_ba_typ_ListPutter());
		Base_stk_cl_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_stk_cl_cal_cd.getListConfig().setPutter(getBase_stk_cl_cal_cd_ListPutter());
		Base_stk_cl_ba_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_stk_cl_ba_typ.getListConfig().setPutter(getBase_stk_cl_ba_typ_ListPutter());
		Base_bill_cl_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_bill_cl_cal_cd.getListConfig().setPutter(getBase_bill_cl_cal_cd_ListPutter());
		Base_pay_schd_cl_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_pay_schd_cl_cal_cd.getListConfig().setPutter(getBase_pay_schd_cl_cal_cd_ListPutter());
		Base_sls_xrate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sls_xrate_cd.getListConfig().setPutter(getBase_sls_xrate_cd_ListPutter());
		Base_purc_xrate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_purc_xrate_cd.getListConfig().setPutter(getBase_purc_xrate_cd_ListPutter());
		Base_prov_xrate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_prov_xrate_cd.getListConfig().setPutter(getBase_prov_xrate_cd_ListPutter());
		Base_bill_xrate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_bill_xrate_cd.getListConfig().setPutter(getBase_bill_xrate_cd_ListPutter());
		Base_pay_xrate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_pay_xrate_cd.getListConfig().setPutter(getBase_pay_xrate_cd_ListPutter());
		Base_sls_upri_req_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sls_upri_req_typ.getListConfig().setPutter(getBase_sls_upri_req_typ_ListPutter());
		Base_sls_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sls_basis_typ.getListConfig().setPutter(getBase_sls_basis_typ_ListPutter());
		Base_bill_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_bill_basis_typ.getListConfig().setPutter(getBase_bill_basis_typ_ListPutter());
		Base_ship_schd_split_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_ship_schd_split_typ.getListConfig().setPutter(getBase_ship_schd_split_typ_ListPutter());
		Base_xfr_stk_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_xfr_stk_mng_typ.getListConfig().setPutter(getBase_xfr_stk_mng_typ_ListPutter());
		Base_sls_bdj_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sls_bdj_rnd_typ.getListConfig().setPutter(getBase_sls_bdj_rnd_typ_ListPutter());
		Base_purc_upri_req_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_purc_upri_req_typ.getListConfig().setPutter(getBase_purc_upri_req_typ_ListPutter());
		Base_outsrc_upri_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_outsrc_upri_typ.getListConfig().setPutter(getBase_outsrc_upri_typ_ListPutter());
		Base_xrate_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_xrate_rnd_typ.getListConfig().setPutter(getBase_xrate_rnd_typ_ListPutter());
		Base_setoff_tax_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_setoff_tax_rnd_typ.getListConfig().setPutter(getBase_setoff_tax_rnd_typ_ListPutter());
		Base_com_paid_tax_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_com_paid_tax_rnd_typ.getListConfig().setPutter(getBase_com_paid_tax_rnd_typ_ListPutter());
		Base_wtax_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_wtax_rnd_typ.getListConfig().setPutter(getBase_wtax_rnd_typ_ListPutter());
		Base_gm_std_upri_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_gm_std_upri_typ.getListConfig().setPutter(getBase_gm_std_upri_typ_ListPutter());
		Base_stk_std_upri_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_stk_std_upri_typ.getListConfig().setPutter(getBase_stk_std_upri_typ_ListPutter());
		Base_stk_amt_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_stk_amt_rnd_typ.getListConfig().setPutter(getBase_stk_amt_rnd_typ_ListPutter());
		Base_po_print_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_po_print_cd.getListConfig().setPutter(getBase_po_print_cd_ListPutter());
		Base_rpt_strg_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_rpt_strg_ext_sys_cd.getListConfig().setPutter(getBase_rpt_strg_ext_sys_cd_ListPutter());
		Base_cst_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_cst_prnt_typ.getListConfig().setPutter(getBase_cst_prnt_typ_ListPutter());
		Base_acst_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_acst_prnt_typ.getListConfig().setPutter(getBase_acst_prnt_typ_ListPutter());
		Base_bcst_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_bcst_prnt_typ.getListConfig().setPutter(getBase_bcst_prnt_typ_ListPutter());
		Base_rcst_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_rcst_prnt_typ.getListConfig().setPutter(getBase_rcst_prnt_typ_ListPutter());
		Base_dlv_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_dlv_prnt_typ.getListConfig().setPutter(getBase_dlv_prnt_typ_ListPutter());
		Base_sppl_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sppl_prnt_typ.getListConfig().setPutter(getBase_sppl_prnt_typ_ListPutter());
		Base_asppl_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_asppl_prnt_typ.getListConfig().setPutter(getBase_asppl_prnt_typ_ListPutter());
		Base_bsppl_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_bsppl_prnt_typ.getListConfig().setPutter(getBase_bsppl_prnt_typ_ListPutter());
		Base_psppl_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_psppl_prnt_typ.getListConfig().setPutter(getBase_psppl_prnt_typ_ListPutter());
		columnDtl_rpt_strg_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rpt_strg_ext_sys_cd.getListConfig().setPutter(getDtl_rpt_strg_ext_sys_cd_ListPutter());
		columnDtlSub_sls_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlSub_sls_tax_cd.getListConfig().setPutter(getDtlSub_sls_tax_cd_ListPutter());
		columnDtlSub_purc_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlSub_purc_tax_cd.getListConfig().setPutter(getDtlSub_purc_tax_cd_ListPutter());
		columnDtlSub_prov_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlSub_prov_tax_cd.getListConfig().setPutter(getDtlSub_prov_tax_cd_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
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
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_ADMIN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_ADMINStatus() {
		status = UPD_ADMIN;
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
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (UPD_ADMIN.equals(status)) {
			setUPD_ADMINStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Base_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Base_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
		return lp;
	}
	 
	/**
	 * [Base_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Base_ptax_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_ptax_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Base_std_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_std_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Base_sls_cl_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_sls_cl_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Base_sls_cl_ba_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sls_cl_ba_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BaTyp");
		return lp;
	}
	 
	/**
	 * [Base_rcv_cl_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_rcv_cl_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Base_rcv_cl_ba_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_rcv_cl_ba_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BaTyp");
		return lp;
	}
	 
	/**
	 * [Base_purc_cl_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_purc_cl_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Base_purc_cl_ba_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_purc_cl_ba_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BaTyp");
		return lp;
	}
	 
	/**
	 * [Base_pay_cl_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_pay_cl_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Base_pay_cl_ba_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_pay_cl_ba_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BaTyp");
		return lp;
	}
	 
	/**
	 * [Base_stk_cl_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_stk_cl_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Base_stk_cl_ba_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_stk_cl_ba_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BaTyp");
		return lp;
	}
	 
	/**
	 * [Base_bill_cl_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_bill_cl_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Base_pay_schd_cl_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_pay_schd_cl_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Base_sls_xrate_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_sls_xrate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 
	/**
	 * [Base_purc_xrate_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_purc_xrate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 
	/**
	 * [Base_prov_xrate_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_prov_xrate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 
	/**
	 * [Base_bill_xrate_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_bill_xrate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 
	/**
	 * [Base_pay_xrate_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_pay_xrate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 
	/**
	 * [Base_sls_upri_req_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sls_upri_req_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsUpriReqTyp");
		return lp;
	}
	 
	/**
	 * [Base_sls_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sls_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsBasisTyp");
		return lp;
	}
	 
	/**
	 * [Base_bill_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_bill_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BillBasisTyp");
		return lp;
	}
	 
	/**
	 * [Base_ship_schd_split_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_ship_schd_split_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipSchdSplitTyp");
		return lp;
	}
	 
	/**
	 * [Base_xfr_stk_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_xfr_stk_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.XfrStkMngTyp");
		return lp;
	}
	 
	/**
	 * [Base_sls_bdj_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sls_bdj_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BigNumRndTyp");
		return lp;
	}
	 
	/**
	 * [Base_purc_upri_req_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_purc_upri_req_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcUpriReqTyp");
		return lp;
	}
	 
	/**
	 * [Base_outsrc_upri_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_outsrc_upri_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.OutsrcUpriTyp");
		return lp;
	}
	 
	/**
	 * [Base_xrate_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_xrate_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Base_setoff_tax_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_setoff_tax_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Base_com_paid_tax_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_com_paid_tax_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Base_wtax_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_wtax_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Base_gm_std_upri_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_gm_std_upri_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StdUpriSelTyp");
		return lp;
	}
	 
	/**
	 * [Base_stk_std_upri_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_stk_std_upri_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StdUpriSelTyp");
		return lp;
	}
	 
	/**
	 * [Base_stk_amt_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_stk_amt_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Base_po_print_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_po_print_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PoPrint");
		return lp;
	}
	 
	/**
	 * [Base_rpt_strg_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_rpt_strg_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSys");
		return lp;
	}
	 
	/**
	 * [Base_cst_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_cst_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Base_acst_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_acst_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Base_bcst_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_bcst_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Base_rcst_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_rcst_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Base_dlv_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_dlv_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Base_sppl_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sppl_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Base_asppl_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_asppl_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Base_bsppl_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_bsppl_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Base_psppl_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_psppl_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_rpt_strg_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rpt_strg_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [DtlSub_sls_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlSub_sls_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}
	 
	/**
	 * [DtlSub_purc_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlSub_purc_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}
	 
	/**
	 * [DtlSub_prov_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlSub_prov_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTax");
		return lp;
	}
	 
	/**
	 * [Lcl_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLcl_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Base_cntry_cd) return getBase_cntry_cd(row, info);
		if(combo == Base_area_cd) return getBase_area_cd(row, info);
		if(combo == Base_base_cur_cd) return getBase_base_cur_cd(row, info);
		if(combo == Base_ptax_cur_cd) return getBase_ptax_cur_cd(row, info);
		if(combo == Base_std_cal_cd) return getBase_std_cal_cd(row, info);
		if(combo == Base_sls_cl_cal_cd) return getBase_sls_cl_cal_cd(row, info);
		if(combo == Base_sls_cl_ba_typ) return getBase_sls_cl_ba_typ(row, info);
		if(combo == Base_rcv_cl_cal_cd) return getBase_rcv_cl_cal_cd(row, info);
		if(combo == Base_rcv_cl_ba_typ) return getBase_rcv_cl_ba_typ(row, info);
		if(combo == Base_purc_cl_cal_cd) return getBase_purc_cl_cal_cd(row, info);
		if(combo == Base_purc_cl_ba_typ) return getBase_purc_cl_ba_typ(row, info);
		if(combo == Base_pay_cl_cal_cd) return getBase_pay_cl_cal_cd(row, info);
		if(combo == Base_pay_cl_ba_typ) return getBase_pay_cl_ba_typ(row, info);
		if(combo == Base_stk_cl_cal_cd) return getBase_stk_cl_cal_cd(row, info);
		if(combo == Base_stk_cl_ba_typ) return getBase_stk_cl_ba_typ(row, info);
		if(combo == Base_bill_cl_cal_cd) return getBase_bill_cl_cal_cd(row, info);
		if(combo == Base_pay_schd_cl_cal_cd) return getBase_pay_schd_cl_cal_cd(row, info);
		if(combo == Base_sls_xrate_cd) return getBase_sls_xrate_cd(row, info);
		if(combo == Base_purc_xrate_cd) return getBase_purc_xrate_cd(row, info);
		if(combo == Base_prov_xrate_cd) return getBase_prov_xrate_cd(row, info);
		if(combo == Base_bill_xrate_cd) return getBase_bill_xrate_cd(row, info);
		if(combo == Base_pay_xrate_cd) return getBase_pay_xrate_cd(row, info);
		if(combo == Base_sls_upri_req_typ) return getBase_sls_upri_req_typ(row, info);
		if(combo == Base_sls_basis_typ) return getBase_sls_basis_typ(row, info);
		if(combo == Base_bill_basis_typ) return getBase_bill_basis_typ(row, info);
		if(combo == Base_ship_schd_split_typ) return getBase_ship_schd_split_typ(row, info);
		if(combo == Base_xfr_stk_mng_typ) return getBase_xfr_stk_mng_typ(row, info);
		if(combo == Base_sls_bdj_rnd_typ) return getBase_sls_bdj_rnd_typ(row, info);
		if(combo == Base_purc_upri_req_typ) return getBase_purc_upri_req_typ(row, info);
		if(combo == Base_outsrc_upri_typ) return getBase_outsrc_upri_typ(row, info);
		if(combo == Base_xrate_rnd_typ) return getBase_xrate_rnd_typ(row, info);
		if(combo == Base_setoff_tax_rnd_typ) return getBase_setoff_tax_rnd_typ(row, info);
		if(combo == Base_com_paid_tax_rnd_typ) return getBase_com_paid_tax_rnd_typ(row, info);
		if(combo == Base_wtax_rnd_typ) return getBase_wtax_rnd_typ(row, info);
		if(combo == Base_gm_std_upri_typ) return getBase_gm_std_upri_typ(row, info);
		if(combo == Base_stk_std_upri_typ) return getBase_stk_std_upri_typ(row, info);
		if(combo == Base_stk_amt_rnd_typ) return getBase_stk_amt_rnd_typ(row, info);
		if(combo == Base_po_print_cd) return getBase_po_print_cd(row, info);
		if(combo == Base_rpt_strg_ext_sys_cd) return getBase_rpt_strg_ext_sys_cd(row, info);
		if(combo == Base_cst_prnt_typ) return getBase_cst_prnt_typ(row, info);
		if(combo == Base_acst_prnt_typ) return getBase_acst_prnt_typ(row, info);
		if(combo == Base_bcst_prnt_typ) return getBase_bcst_prnt_typ(row, info);
		if(combo == Base_rcst_prnt_typ) return getBase_rcst_prnt_typ(row, info);
		if(combo == Base_dlv_prnt_typ) return getBase_dlv_prnt_typ(row, info);
		if(combo == Base_sppl_prnt_typ) return getBase_sppl_prnt_typ(row, info);
		if(combo == Base_asppl_prnt_typ) return getBase_asppl_prnt_typ(row, info);
		if(combo == Base_bsppl_prnt_typ) return getBase_bsppl_prnt_typ(row, info);
		if(combo == Base_psppl_prnt_typ) return getBase_psppl_prnt_typ(row, info);
		if(combo == columnDtl_rpt_strg_ext_sys_cd) return getDtl_rpt_strg_ext_sys_cd(row, info);
		if(combo == columnDtlSub_sls_tax_cd) return getDtlSub_sls_tax_cd(row, info);
		if(combo == columnDtlSub_purc_tax_cd) return getDtlSub_purc_tax_cd(row, info);
		if(combo == columnDtlSub_prov_tax_cd) return getDtlSub_prov_tax_cd(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
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
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_admin) doBtn_upd_admin(info);
		else if (ap == DtlSubBtn_select_all) doDtlSubBtn_select_all(info);
		else if (ap == DtlSubBtn_deselect_all) doDtlSubBtn_deselect_all(info);
		else if (ap == DtlSubBtn_radd) doDtlSubBtn_radd(info);
		else if (ap == DtlSubBtn_rdel) doDtlSubBtn_rdel(info);
		else if (ap == DtlSubBtn_rcopy) doDtlSubBtn_rcopy(info);
		else if (ap == LclBtn_select_all) doLclBtn_select_all(info);
		else if (ap == LclBtn_deselect_all) doLclBtn_deselect_all(info);
		else if (ap == LclBtn_radd) doLclBtn_radd(info);
		else if (ap == LclBtn_rdel) doLclBtn_rdel(info);
		else if (ap == LclBtn_rcopy) doLclBtn_rcopy(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_admin]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_admin(MCEventInfo info);

	/**
	 * [DtlSubBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlSubBtn_select_all(MCEventInfo info);

	/**
	 * [DtlSubBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlSubBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlSubBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlSubBtn_radd(MCEventInfo info);

	/**
	 * [DtlSubBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlSubBtn_rdel(MCEventInfo info);

	/**
	 * [DtlSubBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlSubBtn_rcopy(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_select_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_deselect_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_radd(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rdel(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rcopy(MCEventInfo info);

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
		if (vc == TabTab) return doTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == SubTabTab) return doSubTab_VC(info);
		if (vc == DtlSubTable) return doDtlSub_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_co_cd) return doCnd_co_cd_VC(info);
		if (vc == Cnd_co_nm_lcl) return doCnd_co_nm_lcl_VC(info);
		if (vc == Base_co_cd) return doBase_co_cd_VC(info);
		if (vc == Base_co_alt_nm1) return doBase_co_alt_nm1_VC(info);
		if (vc == Base_co_alt_nm2) return doBase_co_alt_nm2_VC(info);
		if (vc == Base_co_alt_nm3) return doBase_co_alt_nm3_VC(info);
		if (vc == Base_co_alt_nm4) return doBase_co_alt_nm4_VC(info);
		if (vc == Base_cntry_cd) return doBase_cntry_cd_VC(info);
		if (vc == Base_cntry_nm) return doBase_cntry_nm_VC(info);
		if (vc == Base_area_cd) return doBase_area_cd_VC(info);
		if (vc == Base_area_nm) return doBase_area_nm_VC(info);
		if (vc == Base_zip_cd) return doBase_zip_cd_VC(info);
		if (vc == Base_addr1) return doBase_addr1_VC(info);
		if (vc == Base_addr2) return doBase_addr2_VC(info);
		if (vc == Base_addr3) return doBase_addr3_VC(info);
		if (vc == Base_addr4) return doBase_addr4_VC(info);
		if (vc == Base_tel) return doBase_tel_VC(info);
		if (vc == Base_fax) return doBase_fax_VC(info);
		if (vc == Base_co_repl_nm) return doBase_co_repl_nm_VC(info);
		if (vc == Base_biz_co_no) return doBase_biz_co_no_VC(info);
		if (vc == Base_ein) return doBase_ein_VC(info);
		if (vc == Base_std_co_cd) return doBase_std_co_cd_VC(info);
		if (vc == Base_base_cur_cd) return doBase_base_cur_cd_VC(info);
		if (vc == Base_base_cur_nm) return doBase_base_cur_nm_VC(info);
		if (vc == Base_ptax_cur_cd) return doBase_ptax_cur_cd_VC(info);
		if (vc == Base_ptax_cur_nm) return doBase_ptax_cur_nm_VC(info);
		if (vc == Base_ac_cl_day) return doBase_ac_cl_day_VC(info);
		if (vc == Base_ac_cl_mon_base) return doBase_ac_cl_mon_base_VC(info);
		if (vc == Base_st_mon) return doBase_st_mon_VC(info);
		if (vc == Base_dt_switch_time) return doBase_dt_switch_time_VC(info);
		if (vc == Base_std_cal_cd) return doBase_std_cal_cd_VC(info);
		if (vc == Base_std_cal_nm) return doBase_std_cal_nm_VC(info);
		if (vc == Base_ar_no_use_flg) return doBase_ar_no_use_flg_VC(info);
		if (vc == Base_ap_no_use_flg) return doBase_ap_no_use_flg_VC(info);
		if (vc == Base_temp_ap_use_flg) return doBase_temp_ap_use_flg_VC(info);
		if (vc == Base_sls_cl_flg) return doBase_sls_cl_flg_VC(info);
		if (vc == Base_rcv_cl_flg) return doBase_rcv_cl_flg_VC(info);
		if (vc == Base_purc_cl_flg) return doBase_purc_cl_flg_VC(info);
		if (vc == Base_pay_cl_flg) return doBase_pay_cl_flg_VC(info);
		if (vc == Base_sls_cl_cal_cd) return doBase_sls_cl_cal_cd_VC(info);
		if (vc == Base_sls_cl_cal_nm) return doBase_sls_cl_cal_nm_VC(info);
		if (vc == Base_sls_cl_delay_days) return doBase_sls_cl_delay_days_VC(info);
		if (vc == Base_sls_cl_ba_typ) return doBase_sls_cl_ba_typ_VC(info);
		if (vc == Base_sls_cl_ba_typ_nm) return doBase_sls_cl_ba_typ_nm_VC(info);
		if (vc == Base_rcv_cl_cal_cd) return doBase_rcv_cl_cal_cd_VC(info);
		if (vc == Base_rcv_cl_cal_nm) return doBase_rcv_cl_cal_nm_VC(info);
		if (vc == Base_rcv_cl_delay_days) return doBase_rcv_cl_delay_days_VC(info);
		if (vc == Base_rcv_cl_ba_typ) return doBase_rcv_cl_ba_typ_VC(info);
		if (vc == Base_rcv_cl_ba_typ_nm) return doBase_rcv_cl_ba_typ_nm_VC(info);
		if (vc == Base_purc_cl_cal_cd) return doBase_purc_cl_cal_cd_VC(info);
		if (vc == Base_purc_cl_cal_nm) return doBase_purc_cl_cal_nm_VC(info);
		if (vc == Base_purc_cl_delay_days) return doBase_purc_cl_delay_days_VC(info);
		if (vc == Base_purc_cl_ba_typ) return doBase_purc_cl_ba_typ_VC(info);
		if (vc == Base_purc_cl_ba_typ_nm) return doBase_purc_cl_ba_typ_nm_VC(info);
		if (vc == Base_pay_cl_cal_cd) return doBase_pay_cl_cal_cd_VC(info);
		if (vc == Base_pay_cl_cal_nm) return doBase_pay_cl_cal_nm_VC(info);
		if (vc == Base_pay_cl_delay_days) return doBase_pay_cl_delay_days_VC(info);
		if (vc == Base_pay_cl_ba_typ) return doBase_pay_cl_ba_typ_VC(info);
		if (vc == Base_pay_cl_ba_typ_nm) return doBase_pay_cl_ba_typ_nm_VC(info);
		if (vc == Base_stk_cl_cal_cd) return doBase_stk_cl_cal_cd_VC(info);
		if (vc == Base_stk_cl_cal_nm) return doBase_stk_cl_cal_nm_VC(info);
		if (vc == Base_stk_cl_delay_days) return doBase_stk_cl_delay_days_VC(info);
		if (vc == Base_stk_cl_ba_typ) return doBase_stk_cl_ba_typ_VC(info);
		if (vc == Base_stk_cl_ba_typ_nm) return doBase_stk_cl_ba_typ_nm_VC(info);
		if (vc == Base_bill_cl_cal_cd) return doBase_bill_cl_cal_cd_VC(info);
		if (vc == Base_bill_cl_cal_nm) return doBase_bill_cl_cal_nm_VC(info);
		if (vc == Base_pay_schd_cl_cal_cd) return doBase_pay_schd_cl_cal_cd_VC(info);
		if (vc == Base_pay_schd_cl_cal_nm) return doBase_pay_schd_cl_cal_nm_VC(info);
		if (vc == Base_bill_xrate_conv_flg) return doBase_bill_xrate_conv_flg_VC(info);
		if (vc == Base_pay_xrate_conv_flg) return doBase_pay_xrate_conv_flg_VC(info);
		if (vc == Base_sls_xrate_cd) return doBase_sls_xrate_cd_VC(info);
		if (vc == Base_sls_xrate_nm) return doBase_sls_xrate_nm_VC(info);
		if (vc == Base_purc_xrate_cd) return doBase_purc_xrate_cd_VC(info);
		if (vc == Base_purc_xrate_nm) return doBase_purc_xrate_nm_VC(info);
		if (vc == Base_prov_xrate_cd) return doBase_prov_xrate_cd_VC(info);
		if (vc == Base_prov_xrate_nm) return doBase_prov_xrate_nm_VC(info);
		if (vc == Base_bill_xrate_cd) return doBase_bill_xrate_cd_VC(info);
		if (vc == Base_bill_xrate_nm) return doBase_bill_xrate_nm_VC(info);
		if (vc == Base_pay_xrate_cd) return doBase_pay_xrate_cd_VC(info);
		if (vc == Base_pay_xrate_nm) return doBase_pay_xrate_nm_VC(info);
		if (vc == Base_mon01_xrate_rev_flg) return doBase_mon01_xrate_rev_flg_VC(info);
		if (vc == Base_mon02_xrate_rev_flg) return doBase_mon02_xrate_rev_flg_VC(info);
		if (vc == Base_mon03_xrate_rev_flg) return doBase_mon03_xrate_rev_flg_VC(info);
		if (vc == Base_mon04_xrate_rev_flg) return doBase_mon04_xrate_rev_flg_VC(info);
		if (vc == Base_mon05_xrate_rev_flg) return doBase_mon05_xrate_rev_flg_VC(info);
		if (vc == Base_mon06_xrate_rev_flg) return doBase_mon06_xrate_rev_flg_VC(info);
		if (vc == Base_mon07_xrate_rev_flg) return doBase_mon07_xrate_rev_flg_VC(info);
		if (vc == Base_mon08_xrate_rev_flg) return doBase_mon08_xrate_rev_flg_VC(info);
		if (vc == Base_mon09_xrate_rev_flg) return doBase_mon09_xrate_rev_flg_VC(info);
		if (vc == Base_mon10_xrate_rev_flg) return doBase_mon10_xrate_rev_flg_VC(info);
		if (vc == Base_mon11_xrate_rev_flg) return doBase_mon11_xrate_rev_flg_VC(info);
		if (vc == Base_mon12_xrate_rev_flg) return doBase_mon12_xrate_rev_flg_VC(info);
		if (vc == Base_sls_upri_req_typ) return doBase_sls_upri_req_typ_VC(info);
		if (vc == Base_sls_upri_req_typ_nm) return doBase_sls_upri_req_typ_nm_VC(info);
		if (vc == Base_sls_basis_typ) return doBase_sls_basis_typ_VC(info);
		if (vc == Base_sls_basis_typ_nm) return doBase_sls_basis_typ_nm_VC(info);
		if (vc == Base_bill_basis_typ) return doBase_bill_basis_typ_VC(info);
		if (vc == Base_bill_basis_typ_nm) return doBase_bill_basis_typ_nm_VC(info);
		if (vc == Base_ship_schd_split_typ) return doBase_ship_schd_split_typ_VC(info);
		if (vc == Base_ship_schd_split_typ_nm) return doBase_ship_schd_split_typ_nm_VC(info);
		if (vc == Base_xfr_stk_mng_typ) return doBase_xfr_stk_mng_typ_VC(info);
		if (vc == Base_xfr_stk_mng_typ_nm) return doBase_xfr_stk_mng_typ_nm_VC(info);
		if (vc == Base_sls_bdj_rnd_typ) return doBase_sls_bdj_rnd_typ_VC(info);
		if (vc == Base_sls_bdj_rnd_typ_nm) return doBase_sls_bdj_rnd_typ_nm_VC(info);
		if (vc == Base_purc_upri_req_typ) return doBase_purc_upri_req_typ_VC(info);
		if (vc == Base_purc_upri_req_typ_nm) return doBase_purc_upri_req_typ_nm_VC(info);
		if (vc == Base_outsrc_upri_typ) return doBase_outsrc_upri_typ_VC(info);
		if (vc == Base_outsrc_upri_typ_nm) return doBase_outsrc_upri_typ_nm_VC(info);
		if (vc == Base_xrate_rnd_typ) return doBase_xrate_rnd_typ_VC(info);
		if (vc == Base_xrate_rnd_typ_nm) return doBase_xrate_rnd_typ_nm_VC(info);
		if (vc == Base_setoff_tax_rnd_typ) return doBase_setoff_tax_rnd_typ_VC(info);
		if (vc == Base_setoff_tax_rnd_typ_nm) return doBase_setoff_tax_rnd_typ_nm_VC(info);
		if (vc == Base_com_paid_tax_rnd_typ) return doBase_com_paid_tax_rnd_typ_VC(info);
		if (vc == Base_com_paid_tax_rnd_typ_nm) return doBase_com_paid_tax_rnd_typ_nm_VC(info);
		if (vc == Base_wtax_rnd_typ) return doBase_wtax_rnd_typ_VC(info);
		if (vc == Base_wtax_rnd_typ_nm) return doBase_wtax_rnd_typ_nm_VC(info);
		if (vc == Base_gm_std_upri_typ) return doBase_gm_std_upri_typ_VC(info);
		if (vc == Base_gm_std_upri_typ_nm) return doBase_gm_std_upri_typ_nm_VC(info);
		if (vc == Base_stk_std_upri_typ) return doBase_stk_std_upri_typ_VC(info);
		if (vc == Base_stk_std_upri_typ_nm) return doBase_stk_std_upri_typ_nm_VC(info);
		if (vc == Base_stk_amt_rnd_typ) return doBase_stk_amt_rnd_typ_VC(info);
		if (vc == Base_stk_amt_rnd_typ_nm) return doBase_stk_amt_rnd_typ_nm_VC(info);
		if (vc == Base_stk_amt_dec_place) return doBase_stk_amt_dec_place_VC(info);
		if (vc == Base_po_print_cd) return doBase_po_print_cd_VC(info);
		if (vc == Base_po_print_nm) return doBase_po_print_nm_VC(info);
		if (vc == Base_stk_lst_cnf_num) return doBase_stk_lst_cnf_num_VC(info);
		if (vc == Base_stk_lst_limit_num) return doBase_stk_lst_limit_num_VC(info);
		if (vc == Base_early_ship_dt_add_days) return doBase_early_ship_dt_add_days_VC(info);
		if (vc == Base_ac_slip_digit) return doBase_ac_slip_digit_VC(info);
		if (vc == Base_ac_slip_seq_flg) return doBase_ac_slip_seq_flg_VC(info);
		if (vc == Base_rpt_strg_ext_sys_cd) return doBase_rpt_strg_ext_sys_cd_VC(info);
		if (vc == Base_rpt_strg_ext_sys_nm) return doBase_rpt_strg_ext_sys_nm_VC(info);
		if (vc == Base_cst_prnt_typ) return doBase_cst_prnt_typ_VC(info);
		if (vc == Base_cst_prnt_typ_nm) return doBase_cst_prnt_typ_nm_VC(info);
		if (vc == Base_acst_prnt_typ) return doBase_acst_prnt_typ_VC(info);
		if (vc == Base_acst_prnt_typ_nm) return doBase_acst_prnt_typ_nm_VC(info);
		if (vc == Base_bcst_prnt_typ) return doBase_bcst_prnt_typ_VC(info);
		if (vc == Base_bcst_prnt_typ_nm) return doBase_bcst_prnt_typ_nm_VC(info);
		if (vc == Base_rcst_prnt_typ) return doBase_rcst_prnt_typ_VC(info);
		if (vc == Base_rcst_prnt_typ_nm) return doBase_rcst_prnt_typ_nm_VC(info);
		if (vc == Base_dlv_prnt_typ) return doBase_dlv_prnt_typ_VC(info);
		if (vc == Base_dlv_prnt_typ_nm) return doBase_dlv_prnt_typ_nm_VC(info);
		if (vc == Base_sppl_prnt_typ) return doBase_sppl_prnt_typ_VC(info);
		if (vc == Base_sppl_prnt_typ_nm) return doBase_sppl_prnt_typ_nm_VC(info);
		if (vc == Base_asppl_prnt_typ) return doBase_asppl_prnt_typ_VC(info);
		if (vc == Base_asppl_prnt_typ_nm) return doBase_asppl_prnt_typ_nm_VC(info);
		if (vc == Base_bsppl_prnt_typ) return doBase_bsppl_prnt_typ_VC(info);
		if (vc == Base_bsppl_prnt_typ_nm) return doBase_bsppl_prnt_typ_nm_VC(info);
		if (vc == Base_psppl_prnt_typ) return doBase_psppl_prnt_typ_VC(info);
		if (vc == Base_psppl_prnt_typ_nm) return doBase_psppl_prnt_typ_nm_VC(info);
		if (vc == Base_ins_usr_id) return doBase_ins_usr_id_VC(info);
		if (vc == Base_ins_usr_nm) return doBase_ins_usr_nm_VC(info);
		if (vc == Base_ins_func_id) return doBase_ins_func_id_VC(info);
		if (vc == Base_ins_func_nm) return doBase_ins_func_nm_VC(info);
		if (vc == Base_upd_usr_id) return doBase_upd_usr_id_VC(info);
		if (vc == Base_upd_usr_nm) return doBase_upd_usr_nm_VC(info);
		if (vc == Base_upd_func_id) return doBase_upd_func_id_VC(info);
		if (vc == Base_upd_func_nm) return doBase_upd_func_nm_VC(info);
		if (vc == Base_ins_ts) return doBase_ins_ts_VC(info);
		if (vc == Base_upd_ts) return doBase_upd_ts_VC(info);
		if (vc == Base_upd_srv_req_no) return doBase_upd_srv_req_no_VC(info);
		if (vc == Base_upd_cntr) return doBase_upd_cntr_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_co_cd) return doDtl_co_cd_VC(info);
		if (vc == columnDtl_co_alt_nm1) return doDtl_co_alt_nm1_VC(info);
		if (vc == columnDtl_co_alt_nm2) return doDtl_co_alt_nm2_VC(info);
		if (vc == columnDtl_co_alt_nm3) return doDtl_co_alt_nm3_VC(info);
		if (vc == columnDtl_co_alt_nm4) return doDtl_co_alt_nm4_VC(info);
		if (vc == columnDtl_zip_cd) return doDtl_zip_cd_VC(info);
		if (vc == columnDtl_addr1) return doDtl_addr1_VC(info);
		if (vc == columnDtl_addr2) return doDtl_addr2_VC(info);
		if (vc == columnDtl_addr3) return doDtl_addr3_VC(info);
		if (vc == columnDtl_addr4) return doDtl_addr4_VC(info);
		if (vc == columnDtl_tel) return doDtl_tel_VC(info);
		if (vc == columnDtl_fax) return doDtl_fax_VC(info);
		if (vc == columnDtl_co_repl_nm) return doDtl_co_repl_nm_VC(info);
		if (vc == columnDtl_ein) return doDtl_ein_VC(info);
		if (vc == columnDtl_biz_co_no) return doDtl_biz_co_no_VC(info);
		if (vc == columnDtl_std_co_cd) return doDtl_std_co_cd_VC(info);
		if (vc == columnDtl_cntry_cd) return doDtl_cntry_cd_VC(info);
		if (vc == columnDtl_area_cd) return doDtl_area_cd_VC(info);
		if (vc == columnDtl_base_cur_cd) return doDtl_base_cur_cd_VC(info);
		if (vc == columnDtl_ptax_cur_cd) return doDtl_ptax_cur_cd_VC(info);
		if (vc == columnDtl_st_mon) return doDtl_st_mon_VC(info);
		if (vc == columnDtl_dt_switch_time) return doDtl_dt_switch_time_VC(info);
		if (vc == columnDtl_ac_cl_day) return doDtl_ac_cl_day_VC(info);
		if (vc == columnDtl_ac_cl_mon_base) return doDtl_ac_cl_mon_base_VC(info);
		if (vc == columnDtl_std_cal_cd) return doDtl_std_cal_cd_VC(info);
		if (vc == columnDtl_bill_cl_cal_cd) return doDtl_bill_cl_cal_cd_VC(info);
		if (vc == columnDtl_ar_no_use_flg) return doDtl_ar_no_use_flg_VC(info);
		if (vc == columnDtl_ap_no_use_flg) return doDtl_ap_no_use_flg_VC(info);
		if (vc == columnDtl_temp_ap_use_flg) return doDtl_temp_ap_use_flg_VC(info);
		if (vc == columnDtl_sls_cl_flg) return doDtl_sls_cl_flg_VC(info);
		if (vc == columnDtl_rcv_cl_flg) return doDtl_rcv_cl_flg_VC(info);
		if (vc == columnDtl_purc_cl_flg) return doDtl_purc_cl_flg_VC(info);
		if (vc == columnDtl_pay_cl_flg) return doDtl_pay_cl_flg_VC(info);
		if (vc == columnDtl_stk_cl_cal_cd) return doDtl_stk_cl_cal_cd_VC(info);
		if (vc == columnDtl_sls_cl_cal_cd) return doDtl_sls_cl_cal_cd_VC(info);
		if (vc == columnDtl_rcv_cl_cal_cd) return doDtl_rcv_cl_cal_cd_VC(info);
		if (vc == columnDtl_purc_cl_cal_cd) return doDtl_purc_cl_cal_cd_VC(info);
		if (vc == columnDtl_pay_cl_cal_cd) return doDtl_pay_cl_cal_cd_VC(info);
		if (vc == columnDtl_pay_schd_cl_cal_cd) return doDtl_pay_schd_cl_cal_cd_VC(info);
		if (vc == columnDtl_stk_cl_delay_days) return doDtl_stk_cl_delay_days_VC(info);
		if (vc == columnDtl_stk_cl_ba_typ) return doDtl_stk_cl_ba_typ_VC(info);
		if (vc == columnDtl_sls_cl_delay_days) return doDtl_sls_cl_delay_days_VC(info);
		if (vc == columnDtl_sls_cl_ba_typ) return doDtl_sls_cl_ba_typ_VC(info);
		if (vc == columnDtl_rcv_cl_delay_days) return doDtl_rcv_cl_delay_days_VC(info);
		if (vc == columnDtl_rcv_cl_ba_typ) return doDtl_rcv_cl_ba_typ_VC(info);
		if (vc == columnDtl_purc_cl_delay_days) return doDtl_purc_cl_delay_days_VC(info);
		if (vc == columnDtl_purc_cl_ba_typ) return doDtl_purc_cl_ba_typ_VC(info);
		if (vc == columnDtl_pay_cl_delay_days) return doDtl_pay_cl_delay_days_VC(info);
		if (vc == columnDtl_pay_cl_ba_typ) return doDtl_pay_cl_ba_typ_VC(info);
		if (vc == columnDtl_bill_xrate_conv_flg) return doDtl_bill_xrate_conv_flg_VC(info);
		if (vc == columnDtl_pay_xrate_conv_flg) return doDtl_pay_xrate_conv_flg_VC(info);
		if (vc == columnDtl_sls_xrate_cd) return doDtl_sls_xrate_cd_VC(info);
		if (vc == columnDtl_purc_xrate_cd) return doDtl_purc_xrate_cd_VC(info);
		if (vc == columnDtl_prov_xrate_cd) return doDtl_prov_xrate_cd_VC(info);
		if (vc == columnDtl_bill_xrate_cd) return doDtl_bill_xrate_cd_VC(info);
		if (vc == columnDtl_pay_xrate_cd) return doDtl_pay_xrate_cd_VC(info);
		if (vc == columnDtl_mon01_xrate_rev_flg) return doDtl_mon01_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon02_xrate_rev_flg) return doDtl_mon02_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon03_xrate_rev_flg) return doDtl_mon03_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon04_xrate_rev_flg) return doDtl_mon04_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon05_xrate_rev_flg) return doDtl_mon05_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon06_xrate_rev_flg) return doDtl_mon06_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon07_xrate_rev_flg) return doDtl_mon07_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon08_xrate_rev_flg) return doDtl_mon08_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon09_xrate_rev_flg) return doDtl_mon09_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon10_xrate_rev_flg) return doDtl_mon10_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon11_xrate_rev_flg) return doDtl_mon11_xrate_rev_flg_VC(info);
		if (vc == columnDtl_mon12_xrate_rev_flg) return doDtl_mon12_xrate_rev_flg_VC(info);
		if (vc == columnDtl_sls_upri_req_typ) return doDtl_sls_upri_req_typ_VC(info);
		if (vc == columnDtl_purc_upri_req_typ) return doDtl_purc_upri_req_typ_VC(info);
		if (vc == columnDtl_outsrc_upri_typ) return doDtl_outsrc_upri_typ_VC(info);
		if (vc == columnDtl_sls_basis_typ) return doDtl_sls_basis_typ_VC(info);
		if (vc == columnDtl_bill_basis_typ) return doDtl_bill_basis_typ_VC(info);
		if (vc == columnDtl_ship_schd_split_typ) return doDtl_ship_schd_split_typ_VC(info);
		if (vc == columnDtl_xfr_stk_mng_typ) return doDtl_xfr_stk_mng_typ_VC(info);
		if (vc == columnDtl_setoff_tax_rnd_typ) return doDtl_setoff_tax_rnd_typ_VC(info);
		if (vc == columnDtl_xrate_rnd_typ) return doDtl_xrate_rnd_typ_VC(info);
		if (vc == columnDtl_com_paid_tax_rnd_typ) return doDtl_com_paid_tax_rnd_typ_VC(info);
		if (vc == columnDtl_wtax_rnd_typ) return doDtl_wtax_rnd_typ_VC(info);
		if (vc == columnDtl_stk_amt_rnd_typ) return doDtl_stk_amt_rnd_typ_VC(info);
		if (vc == columnDtl_stk_amt_dec_place) return doDtl_stk_amt_dec_place_VC(info);
		if (vc == columnDtl_po_print_cd) return doDtl_po_print_cd_VC(info);
		if (vc == columnDtl_stk_lst_cnf_num) return doDtl_stk_lst_cnf_num_VC(info);
		if (vc == columnDtl_stk_lst_limit_num) return doDtl_stk_lst_limit_num_VC(info);
		if (vc == columnDtl_gm_std_upri_typ) return doDtl_gm_std_upri_typ_VC(info);
		if (vc == columnDtl_stk_std_upri_typ) return doDtl_stk_std_upri_typ_VC(info);
		if (vc == columnDtl_early_ship_dt_add_days) return doDtl_early_ship_dt_add_days_VC(info);
		if (vc == columnDtl_ac_slip_digit) return doDtl_ac_slip_digit_VC(info);
		if (vc == columnDtl_ac_slip_seq_flg) return doDtl_ac_slip_seq_flg_VC(info);
		if (vc == columnDtl_sls_bdj_rnd_typ) return doDtl_sls_bdj_rnd_typ_VC(info);
		if (vc == columnDtl_cntry_nm) return doDtl_cntry_nm_VC(info);
		if (vc == columnDtl_area_nm) return doDtl_area_nm_VC(info);
		if (vc == columnDtl_base_cur_nm) return doDtl_base_cur_nm_VC(info);
		if (vc == columnDtl_ptax_cur_nm) return doDtl_ptax_cur_nm_VC(info);
		if (vc == columnDtl_std_cal_nm) return doDtl_std_cal_nm_VC(info);
		if (vc == columnDtl_stk_cl_cal_nm) return doDtl_stk_cl_cal_nm_VC(info);
		if (vc == columnDtl_sls_cl_cal_nm) return doDtl_sls_cl_cal_nm_VC(info);
		if (vc == columnDtl_bill_cl_cal_nm) return doDtl_bill_cl_cal_nm_VC(info);
		if (vc == columnDtl_rcv_cl_cal_nm) return doDtl_rcv_cl_cal_nm_VC(info);
		if (vc == columnDtl_purc_cl_cal_nm) return doDtl_purc_cl_cal_nm_VC(info);
		if (vc == columnDtl_pay_cl_cal_nm) return doDtl_pay_cl_cal_nm_VC(info);
		if (vc == columnDtl_pay_schd_cl_cal_nm) return doDtl_pay_schd_cl_cal_nm_VC(info);
		if (vc == columnDtl_sls_xrate_nm) return doDtl_sls_xrate_nm_VC(info);
		if (vc == columnDtl_purc_xrate_nm) return doDtl_purc_xrate_nm_VC(info);
		if (vc == columnDtl_prov_xrate_nm) return doDtl_prov_xrate_nm_VC(info);
		if (vc == columnDtl_bill_xrate_nm) return doDtl_bill_xrate_nm_VC(info);
		if (vc == columnDtl_pay_xrate_nm) return doDtl_pay_xrate_nm_VC(info);
		if (vc == columnDtl_stk_cl_ba_typ_nm) return doDtl_stk_cl_ba_typ_nm_VC(info);
		if (vc == columnDtl_sls_cl_ba_typ_nm) return doDtl_sls_cl_ba_typ_nm_VC(info);
		if (vc == columnDtl_rcv_cl_ba_typ_nm) return doDtl_rcv_cl_ba_typ_nm_VC(info);
		if (vc == columnDtl_purc_cl_ba_typ_nm) return doDtl_purc_cl_ba_typ_nm_VC(info);
		if (vc == columnDtl_pay_cl_ba_typ_nm) return doDtl_pay_cl_ba_typ_nm_VC(info);
		if (vc == columnDtl_sls_upri_req_typ_nm) return doDtl_sls_upri_req_typ_nm_VC(info);
		if (vc == columnDtl_purc_upri_req_typ_nm) return doDtl_purc_upri_req_typ_nm_VC(info);
		if (vc == columnDtl_outsrc_upri_typ_nm) return doDtl_outsrc_upri_typ_nm_VC(info);
		if (vc == columnDtl_sls_basis_typ_nm) return doDtl_sls_basis_typ_nm_VC(info);
		if (vc == columnDtl_bill_basis_typ_nm) return doDtl_bill_basis_typ_nm_VC(info);
		if (vc == columnDtl_ship_schd_split_typ_nm) return doDtl_ship_schd_split_typ_nm_VC(info);
		if (vc == columnDtl_xfr_stk_mng_typ_nm) return doDtl_xfr_stk_mng_typ_nm_VC(info);
		if (vc == columnDtl_xrate_rnd_typ_nm) return doDtl_xrate_rnd_typ_nm_VC(info);
		if (vc == columnDtl_setoff_tax_rnd_typ_nm) return doDtl_setoff_tax_rnd_typ_nm_VC(info);
		if (vc == columnDtl_com_paid_tax_rnd_typ_nm) return doDtl_com_paid_tax_rnd_typ_nm_VC(info);
		if (vc == columnDtl_wtax_rnd_typ_nm) return doDtl_wtax_rnd_typ_nm_VC(info);
		if (vc == columnDtl_stk_amt_rnd_typ_nm) return doDtl_stk_amt_rnd_typ_nm_VC(info);
		if (vc == columnDtl_sls_bdj_rnd_typ_nm) return doDtl_sls_bdj_rnd_typ_nm_VC(info);
		if (vc == columnDtl_po_print_nm) return doDtl_po_print_nm_VC(info);
		if (vc == columnDtl_gm_std_upri_typ_nm) return doDtl_gm_std_upri_typ_nm_VC(info);
		if (vc == columnDtl_stk_std_upri_typ_nm) return doDtl_stk_std_upri_typ_nm_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_rpt_strg_ext_sys_cd) return doDtl_rpt_strg_ext_sys_cd_VC(info);
		if (vc == columnDtl_rpt_strg_ext_sys_nm) return doDtl_rpt_strg_ext_sys_nm_VC(info);
		if (vc == columnDtl_cst_prnt_typ) return doDtl_cst_prnt_typ_VC(info);
		if (vc == columnDtl_cst_prnt_typ_nm) return doDtl_cst_prnt_typ_nm_VC(info);
		if (vc == columnDtl_acst_prnt_typ) return doDtl_acst_prnt_typ_VC(info);
		if (vc == columnDtl_acst_prnt_typ_nm) return doDtl_acst_prnt_typ_nm_VC(info);
		if (vc == columnDtl_bcst_prnt_typ) return doDtl_bcst_prnt_typ_VC(info);
		if (vc == columnDtl_bcst_prnt_typ_nm) return doDtl_bcst_prnt_typ_nm_VC(info);
		if (vc == columnDtl_rcst_prnt_typ) return doDtl_rcst_prnt_typ_VC(info);
		if (vc == columnDtl_rcst_prnt_typ_nm) return doDtl_rcst_prnt_typ_nm_VC(info);
		if (vc == columnDtl_dlv_prnt_typ) return doDtl_dlv_prnt_typ_VC(info);
		if (vc == columnDtl_dlv_prnt_typ_nm) return doDtl_dlv_prnt_typ_nm_VC(info);
		if (vc == columnDtl_sppl_prnt_typ) return doDtl_sppl_prnt_typ_VC(info);
		if (vc == columnDtl_sppl_prnt_typ_nm) return doDtl_sppl_prnt_typ_nm_VC(info);
		if (vc == columnDtl_asppl_prnt_typ) return doDtl_asppl_prnt_typ_VC(info);
		if (vc == columnDtl_asppl_prnt_typ_nm) return doDtl_asppl_prnt_typ_nm_VC(info);
		if (vc == columnDtl_bsppl_prnt_typ) return doDtl_bsppl_prnt_typ_VC(info);
		if (vc == columnDtl_bsppl_prnt_typ_nm) return doDtl_bsppl_prnt_typ_nm_VC(info);
		if (vc == columnDtl_psppl_prnt_typ) return doDtl_psppl_prnt_typ_VC(info);
		if (vc == columnDtl_psppl_prnt_typ_nm) return doDtl_psppl_prnt_typ_nm_VC(info);
		if (vc == columnDtlSub_check) return doDtlSub_check_VC(info);
		if (vc == columnDtlSub_co_cd) return doDtlSub_co_cd_VC(info);
		if (vc == columnDtlSub_sls_tax_cd) return doDtlSub_sls_tax_cd_VC(info);
		if (vc == columnDtlSub_sls_tax_nm) return doDtlSub_sls_tax_nm_VC(info);
		if (vc == columnDtlSub_purc_tax_cd) return doDtlSub_purc_tax_cd_VC(info);
		if (vc == columnDtlSub_purc_tax_nm) return doDtlSub_purc_tax_nm_VC(info);
		if (vc == columnDtlSub_prov_tax_cd) return doDtlSub_prov_tax_cd_VC(info);
		if (vc == columnDtlSub_prov_tax_nm) return doDtlSub_prov_tax_nm_VC(info);
		if (vc == columnDtlSub_memo1) return doDtlSub_memo1_VC(info);
		if (vc == columnDtlSub_memo2) return doDtlSub_memo2_VC(info);
		if (vc == columnDtlSub_memo3) return doDtlSub_memo3_VC(info);
		if (vc == columnDtlSub_ins_usr_id) return doDtlSub_ins_usr_id_VC(info);
		if (vc == columnDtlSub_ins_usr_nm) return doDtlSub_ins_usr_nm_VC(info);
		if (vc == columnDtlSub_ins_ts) return doDtlSub_ins_ts_VC(info);
		if (vc == columnDtlSub_ins_func_id) return doDtlSub_ins_func_id_VC(info);
		if (vc == columnDtlSub_ins_func_nm) return doDtlSub_ins_func_nm_VC(info);
		if (vc == columnDtlSub_upd_cntr) return doDtlSub_upd_cntr_VC(info);
		if (vc == columnDtlSub_upd_usr_id) return doDtlSub_upd_usr_id_VC(info);
		if (vc == columnDtlSub_upd_usr_nm) return doDtlSub_upd_usr_nm_VC(info);
		if (vc == columnDtlSub_upd_ts) return doDtlSub_upd_ts_VC(info);
		if (vc == columnDtlSub_upd_func_id) return doDtlSub_upd_func_id_VC(info);
		if (vc == columnDtlSub_upd_func_nm) return doDtlSub_upd_func_nm_VC(info);
		if (vc == columnDtlSub_upd_srv_req_no) return doDtlSub_upd_srv_req_no_VC(info);
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_co_cd) return doLcl_co_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_co_alt_nm1) return doLcl_co_alt_nm1_VC(info);
		if (vc == columnLcl_co_alt_nm2) return doLcl_co_alt_nm2_VC(info);
		if (vc == columnLcl_co_alt_nm3) return doLcl_co_alt_nm3_VC(info);
		if (vc == columnLcl_co_alt_nm4) return doLcl_co_alt_nm4_VC(info);
		if (vc == columnLcl_zip_cd) return doLcl_zip_cd_VC(info);
		if (vc == columnLcl_addr1) return doLcl_addr1_VC(info);
		if (vc == columnLcl_addr2) return doLcl_addr2_VC(info);
		if (vc == columnLcl_addr3) return doLcl_addr3_VC(info);
		if (vc == columnLcl_addr4) return doLcl_addr4_VC(info);
		if (vc == columnLcl_tel) return doLcl_tel_VC(info);
		if (vc == columnLcl_fax) return doLcl_fax_VC(info);
		if (vc == columnLcl_co_repl_nm) return doLcl_co_repl_nm_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
		if (vc == columnLcl_ins_usr_id) return doLcl_ins_usr_id_VC(info);
		if (vc == columnLcl_ins_usr_nm) return doLcl_ins_usr_nm_VC(info);
		if (vc == columnLcl_ins_ts) return doLcl_ins_ts_VC(info);
		if (vc == columnLcl_ins_func_id) return doLcl_ins_func_id_VC(info);
		if (vc == columnLcl_ins_func_nm) return doLcl_ins_func_nm_VC(info);
		if (vc == columnLcl_upd_cntr) return doLcl_upd_cntr_VC(info);
		if (vc == columnLcl_upd_usr_id) return doLcl_upd_usr_id_VC(info);
		if (vc == columnLcl_upd_usr_nm) return doLcl_upd_usr_nm_VC(info);
		if (vc == columnLcl_upd_ts) return doLcl_upd_ts_VC(info);
		if (vc == columnLcl_upd_func_id) return doLcl_upd_func_id_VC(info);
		if (vc == columnLcl_upd_func_nm) return doLcl_upd_func_nm_VC(info);
		if (vc == columnLcl_upd_srv_req_no) return doLcl_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Tab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTab_VC(MCEventInfo info){
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
	 * [SubTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSubTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[co_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_co_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[co_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_co_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[co_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_co_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[co_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_co_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[co_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_co_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[co_repl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_co_repl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[biz_co_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_biz_co_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ein]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ein_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[std_co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_std_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ac_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ac_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ac_cl_mon_base]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ac_cl_mon_base_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[st_mon]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_st_mon_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[dt_switch_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_dt_switch_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[std_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_std_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[std_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_std_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ar_no_use_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ar_no_use_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ap_no_use_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ap_no_use_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[temp_ap_use_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_temp_ap_use_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rcv_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rcv_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rcv_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rcv_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rcv_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rcv_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rcv_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rcv_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bill_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bill_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bill_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bill_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_schd_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_schd_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bill_xrate_conv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bill_xrate_conv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_xrate_conv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_xrate_conv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[prov_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_prov_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[prov_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_prov_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bill_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bill_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bill_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bill_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pay_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pay_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon01_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon01_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon02_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon02_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon03_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon03_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon04_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon04_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon05_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon05_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon06_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon06_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon07_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon07_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon08_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon08_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon09_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon09_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon10_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon10_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon11_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon11_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mon12_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mon12_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_upri_req_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_upri_req_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bill_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bill_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bill_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bill_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ship_schd_split_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ship_schd_split_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_xfr_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_xfr_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_bdj_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sls_bdj_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_upri_req_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_upri_req_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_outsrc_upri_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_xrate_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_xrate_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_setoff_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_setoff_tax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_com_paid_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_com_paid_tax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_wtax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_wtax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_gm_std_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_gm_std_upri_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_std_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_std_upri_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_amt_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[po_print_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_po_print_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[po_print_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_po_print_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_lst_cnf_num]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_lst_cnf_num_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_lst_limit_num]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_lst_limit_num_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[early_ship_dt_add_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_early_ship_dt_add_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ac_slip_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ac_slip_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ac_slip_seq_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ac_slip_seq_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rpt_strg_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rpt_strg_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[cst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_cst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[cst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_cst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[acst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_acst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[acst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_acst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bcst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bcst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rcst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rcst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_dlv_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_dlv_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_asppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_asppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bsppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_bsppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_psppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_psppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_cntr_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[co_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[co_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[co_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[co_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[co_repl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_repl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ein]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ein_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[biz_co_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_biz_co_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[st_mon]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_st_mon_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt_switch_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt_switch_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_cl_mon_base]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_cl_mon_base_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_no_use_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_no_use_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_no_use_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_no_use_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[temp_ap_use_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_temp_ap_use_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_schd_cl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_xrate_conv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_xrate_conv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_xrate_conv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_xrate_conv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon01_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon01_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon02_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon02_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon03_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon03_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon04_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon04_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon05_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon05_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon06_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon06_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon07_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon07_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon08_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon08_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon09_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon09_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon10_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon10_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon11_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon11_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon12_xrate_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon12_xrate_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_req_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_split_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_setoff_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_com_paid_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_print_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_print_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_lst_cnf_num]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_lst_cnf_num_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_lst_limit_num]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_lst_limit_num_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gm_std_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_std_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_early_ship_dt_add_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_slip_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_slip_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_slip_seq_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_slip_seq_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_bdj_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_schd_cl_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_req_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_upri_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_split_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_setoff_tax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_com_paid_tax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_amt_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_bdj_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_print_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gm_std_upri_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_std_upri_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_strg_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_strg_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bcst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bcst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_psppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_psppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[sls_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_sls_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[sls_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_sls_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[purc_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_purc_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[purc_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_purc_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[prov_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_prov_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[prov_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_prov_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSub]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSub_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[co_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_co_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[co_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_co_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[co_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_co_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[co_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_co_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[co_repl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_co_repl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_srv_req_no_VC(MCEventInfo info){
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
		if (nc == TabTab) doTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == SubTabTab) doSubTab_NC(info);
		else if (nc == DtlSubTable) doDtlSub_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_co_cd) doCnd_co_cd_NC(info);
		else if (nc == Cnd_co_nm_lcl) doCnd_co_nm_lcl_NC(info);
		else if (nc == Base_co_cd) doBase_co_cd_NC(info);
		else if (nc == Base_co_alt_nm1) doBase_co_alt_nm1_NC(info);
		else if (nc == Base_co_alt_nm2) doBase_co_alt_nm2_NC(info);
		else if (nc == Base_co_alt_nm3) doBase_co_alt_nm3_NC(info);
		else if (nc == Base_co_alt_nm4) doBase_co_alt_nm4_NC(info);
		else if (nc == Base_cntry_cd) doBase_cntry_cd_NC(info);
		else if (nc == Base_cntry_nm) doBase_cntry_nm_NC(info);
		else if (nc == Base_area_cd) doBase_area_cd_NC(info);
		else if (nc == Base_area_nm) doBase_area_nm_NC(info);
		else if (nc == Base_zip_cd) doBase_zip_cd_NC(info);
		else if (nc == Base_addr1) doBase_addr1_NC(info);
		else if (nc == Base_addr2) doBase_addr2_NC(info);
		else if (nc == Base_addr3) doBase_addr3_NC(info);
		else if (nc == Base_addr4) doBase_addr4_NC(info);
		else if (nc == Base_tel) doBase_tel_NC(info);
		else if (nc == Base_fax) doBase_fax_NC(info);
		else if (nc == Base_co_repl_nm) doBase_co_repl_nm_NC(info);
		else if (nc == Base_biz_co_no) doBase_biz_co_no_NC(info);
		else if (nc == Base_ein) doBase_ein_NC(info);
		else if (nc == Base_std_co_cd) doBase_std_co_cd_NC(info);
		else if (nc == Base_base_cur_cd) doBase_base_cur_cd_NC(info);
		else if (nc == Base_base_cur_nm) doBase_base_cur_nm_NC(info);
		else if (nc == Base_ptax_cur_cd) doBase_ptax_cur_cd_NC(info);
		else if (nc == Base_ptax_cur_nm) doBase_ptax_cur_nm_NC(info);
		else if (nc == Base_ac_cl_day) doBase_ac_cl_day_NC(info);
		else if (nc == Base_ac_cl_mon_base) doBase_ac_cl_mon_base_NC(info);
		else if (nc == Base_st_mon) doBase_st_mon_NC(info);
		else if (nc == Base_dt_switch_time) doBase_dt_switch_time_NC(info);
		else if (nc == Base_std_cal_cd) doBase_std_cal_cd_NC(info);
		else if (nc == Base_std_cal_nm) doBase_std_cal_nm_NC(info);
		else if (nc == Base_ar_no_use_flg) doBase_ar_no_use_flg_NC(info);
		else if (nc == Base_ap_no_use_flg) doBase_ap_no_use_flg_NC(info);
		else if (nc == Base_temp_ap_use_flg) doBase_temp_ap_use_flg_NC(info);
		else if (nc == Base_sls_cl_flg) doBase_sls_cl_flg_NC(info);
		else if (nc == Base_rcv_cl_flg) doBase_rcv_cl_flg_NC(info);
		else if (nc == Base_purc_cl_flg) doBase_purc_cl_flg_NC(info);
		else if (nc == Base_pay_cl_flg) doBase_pay_cl_flg_NC(info);
		else if (nc == Base_sls_cl_cal_cd) doBase_sls_cl_cal_cd_NC(info);
		else if (nc == Base_sls_cl_cal_nm) doBase_sls_cl_cal_nm_NC(info);
		else if (nc == Base_sls_cl_delay_days) doBase_sls_cl_delay_days_NC(info);
		else if (nc == Base_sls_cl_ba_typ) doBase_sls_cl_ba_typ_NC(info);
		else if (nc == Base_sls_cl_ba_typ_nm) doBase_sls_cl_ba_typ_nm_NC(info);
		else if (nc == Base_rcv_cl_cal_cd) doBase_rcv_cl_cal_cd_NC(info);
		else if (nc == Base_rcv_cl_cal_nm) doBase_rcv_cl_cal_nm_NC(info);
		else if (nc == Base_rcv_cl_delay_days) doBase_rcv_cl_delay_days_NC(info);
		else if (nc == Base_rcv_cl_ba_typ) doBase_rcv_cl_ba_typ_NC(info);
		else if (nc == Base_rcv_cl_ba_typ_nm) doBase_rcv_cl_ba_typ_nm_NC(info);
		else if (nc == Base_purc_cl_cal_cd) doBase_purc_cl_cal_cd_NC(info);
		else if (nc == Base_purc_cl_cal_nm) doBase_purc_cl_cal_nm_NC(info);
		else if (nc == Base_purc_cl_delay_days) doBase_purc_cl_delay_days_NC(info);
		else if (nc == Base_purc_cl_ba_typ) doBase_purc_cl_ba_typ_NC(info);
		else if (nc == Base_purc_cl_ba_typ_nm) doBase_purc_cl_ba_typ_nm_NC(info);
		else if (nc == Base_pay_cl_cal_cd) doBase_pay_cl_cal_cd_NC(info);
		else if (nc == Base_pay_cl_cal_nm) doBase_pay_cl_cal_nm_NC(info);
		else if (nc == Base_pay_cl_delay_days) doBase_pay_cl_delay_days_NC(info);
		else if (nc == Base_pay_cl_ba_typ) doBase_pay_cl_ba_typ_NC(info);
		else if (nc == Base_pay_cl_ba_typ_nm) doBase_pay_cl_ba_typ_nm_NC(info);
		else if (nc == Base_stk_cl_cal_cd) doBase_stk_cl_cal_cd_NC(info);
		else if (nc == Base_stk_cl_cal_nm) doBase_stk_cl_cal_nm_NC(info);
		else if (nc == Base_stk_cl_delay_days) doBase_stk_cl_delay_days_NC(info);
		else if (nc == Base_stk_cl_ba_typ) doBase_stk_cl_ba_typ_NC(info);
		else if (nc == Base_stk_cl_ba_typ_nm) doBase_stk_cl_ba_typ_nm_NC(info);
		else if (nc == Base_bill_cl_cal_cd) doBase_bill_cl_cal_cd_NC(info);
		else if (nc == Base_bill_cl_cal_nm) doBase_bill_cl_cal_nm_NC(info);
		else if (nc == Base_pay_schd_cl_cal_cd) doBase_pay_schd_cl_cal_cd_NC(info);
		else if (nc == Base_pay_schd_cl_cal_nm) doBase_pay_schd_cl_cal_nm_NC(info);
		else if (nc == Base_bill_xrate_conv_flg) doBase_bill_xrate_conv_flg_NC(info);
		else if (nc == Base_pay_xrate_conv_flg) doBase_pay_xrate_conv_flg_NC(info);
		else if (nc == Base_sls_xrate_cd) doBase_sls_xrate_cd_NC(info);
		else if (nc == Base_sls_xrate_nm) doBase_sls_xrate_nm_NC(info);
		else if (nc == Base_purc_xrate_cd) doBase_purc_xrate_cd_NC(info);
		else if (nc == Base_purc_xrate_nm) doBase_purc_xrate_nm_NC(info);
		else if (nc == Base_prov_xrate_cd) doBase_prov_xrate_cd_NC(info);
		else if (nc == Base_prov_xrate_nm) doBase_prov_xrate_nm_NC(info);
		else if (nc == Base_bill_xrate_cd) doBase_bill_xrate_cd_NC(info);
		else if (nc == Base_bill_xrate_nm) doBase_bill_xrate_nm_NC(info);
		else if (nc == Base_pay_xrate_cd) doBase_pay_xrate_cd_NC(info);
		else if (nc == Base_pay_xrate_nm) doBase_pay_xrate_nm_NC(info);
		else if (nc == Base_mon01_xrate_rev_flg) doBase_mon01_xrate_rev_flg_NC(info);
		else if (nc == Base_mon02_xrate_rev_flg) doBase_mon02_xrate_rev_flg_NC(info);
		else if (nc == Base_mon03_xrate_rev_flg) doBase_mon03_xrate_rev_flg_NC(info);
		else if (nc == Base_mon04_xrate_rev_flg) doBase_mon04_xrate_rev_flg_NC(info);
		else if (nc == Base_mon05_xrate_rev_flg) doBase_mon05_xrate_rev_flg_NC(info);
		else if (nc == Base_mon06_xrate_rev_flg) doBase_mon06_xrate_rev_flg_NC(info);
		else if (nc == Base_mon07_xrate_rev_flg) doBase_mon07_xrate_rev_flg_NC(info);
		else if (nc == Base_mon08_xrate_rev_flg) doBase_mon08_xrate_rev_flg_NC(info);
		else if (nc == Base_mon09_xrate_rev_flg) doBase_mon09_xrate_rev_flg_NC(info);
		else if (nc == Base_mon10_xrate_rev_flg) doBase_mon10_xrate_rev_flg_NC(info);
		else if (nc == Base_mon11_xrate_rev_flg) doBase_mon11_xrate_rev_flg_NC(info);
		else if (nc == Base_mon12_xrate_rev_flg) doBase_mon12_xrate_rev_flg_NC(info);
		else if (nc == Base_sls_upri_req_typ) doBase_sls_upri_req_typ_NC(info);
		else if (nc == Base_sls_upri_req_typ_nm) doBase_sls_upri_req_typ_nm_NC(info);
		else if (nc == Base_sls_basis_typ) doBase_sls_basis_typ_NC(info);
		else if (nc == Base_sls_basis_typ_nm) doBase_sls_basis_typ_nm_NC(info);
		else if (nc == Base_bill_basis_typ) doBase_bill_basis_typ_NC(info);
		else if (nc == Base_bill_basis_typ_nm) doBase_bill_basis_typ_nm_NC(info);
		else if (nc == Base_ship_schd_split_typ) doBase_ship_schd_split_typ_NC(info);
		else if (nc == Base_ship_schd_split_typ_nm) doBase_ship_schd_split_typ_nm_NC(info);
		else if (nc == Base_xfr_stk_mng_typ) doBase_xfr_stk_mng_typ_NC(info);
		else if (nc == Base_xfr_stk_mng_typ_nm) doBase_xfr_stk_mng_typ_nm_NC(info);
		else if (nc == Base_sls_bdj_rnd_typ) doBase_sls_bdj_rnd_typ_NC(info);
		else if (nc == Base_sls_bdj_rnd_typ_nm) doBase_sls_bdj_rnd_typ_nm_NC(info);
		else if (nc == Base_purc_upri_req_typ) doBase_purc_upri_req_typ_NC(info);
		else if (nc == Base_purc_upri_req_typ_nm) doBase_purc_upri_req_typ_nm_NC(info);
		else if (nc == Base_outsrc_upri_typ) doBase_outsrc_upri_typ_NC(info);
		else if (nc == Base_outsrc_upri_typ_nm) doBase_outsrc_upri_typ_nm_NC(info);
		else if (nc == Base_xrate_rnd_typ) doBase_xrate_rnd_typ_NC(info);
		else if (nc == Base_xrate_rnd_typ_nm) doBase_xrate_rnd_typ_nm_NC(info);
		else if (nc == Base_setoff_tax_rnd_typ) doBase_setoff_tax_rnd_typ_NC(info);
		else if (nc == Base_setoff_tax_rnd_typ_nm) doBase_setoff_tax_rnd_typ_nm_NC(info);
		else if (nc == Base_com_paid_tax_rnd_typ) doBase_com_paid_tax_rnd_typ_NC(info);
		else if (nc == Base_com_paid_tax_rnd_typ_nm) doBase_com_paid_tax_rnd_typ_nm_NC(info);
		else if (nc == Base_wtax_rnd_typ) doBase_wtax_rnd_typ_NC(info);
		else if (nc == Base_wtax_rnd_typ_nm) doBase_wtax_rnd_typ_nm_NC(info);
		else if (nc == Base_gm_std_upri_typ) doBase_gm_std_upri_typ_NC(info);
		else if (nc == Base_gm_std_upri_typ_nm) doBase_gm_std_upri_typ_nm_NC(info);
		else if (nc == Base_stk_std_upri_typ) doBase_stk_std_upri_typ_NC(info);
		else if (nc == Base_stk_std_upri_typ_nm) doBase_stk_std_upri_typ_nm_NC(info);
		else if (nc == Base_stk_amt_rnd_typ) doBase_stk_amt_rnd_typ_NC(info);
		else if (nc == Base_stk_amt_rnd_typ_nm) doBase_stk_amt_rnd_typ_nm_NC(info);
		else if (nc == Base_stk_amt_dec_place) doBase_stk_amt_dec_place_NC(info);
		else if (nc == Base_po_print_cd) doBase_po_print_cd_NC(info);
		else if (nc == Base_po_print_nm) doBase_po_print_nm_NC(info);
		else if (nc == Base_stk_lst_cnf_num) doBase_stk_lst_cnf_num_NC(info);
		else if (nc == Base_stk_lst_limit_num) doBase_stk_lst_limit_num_NC(info);
		else if (nc == Base_early_ship_dt_add_days) doBase_early_ship_dt_add_days_NC(info);
		else if (nc == Base_ac_slip_digit) doBase_ac_slip_digit_NC(info);
		else if (nc == Base_ac_slip_seq_flg) doBase_ac_slip_seq_flg_NC(info);
		else if (nc == Base_rpt_strg_ext_sys_cd) doBase_rpt_strg_ext_sys_cd_NC(info);
		else if (nc == Base_rpt_strg_ext_sys_nm) doBase_rpt_strg_ext_sys_nm_NC(info);
		else if (nc == Base_cst_prnt_typ) doBase_cst_prnt_typ_NC(info);
		else if (nc == Base_cst_prnt_typ_nm) doBase_cst_prnt_typ_nm_NC(info);
		else if (nc == Base_acst_prnt_typ) doBase_acst_prnt_typ_NC(info);
		else if (nc == Base_acst_prnt_typ_nm) doBase_acst_prnt_typ_nm_NC(info);
		else if (nc == Base_bcst_prnt_typ) doBase_bcst_prnt_typ_NC(info);
		else if (nc == Base_bcst_prnt_typ_nm) doBase_bcst_prnt_typ_nm_NC(info);
		else if (nc == Base_rcst_prnt_typ) doBase_rcst_prnt_typ_NC(info);
		else if (nc == Base_rcst_prnt_typ_nm) doBase_rcst_prnt_typ_nm_NC(info);
		else if (nc == Base_dlv_prnt_typ) doBase_dlv_prnt_typ_NC(info);
		else if (nc == Base_dlv_prnt_typ_nm) doBase_dlv_prnt_typ_nm_NC(info);
		else if (nc == Base_sppl_prnt_typ) doBase_sppl_prnt_typ_NC(info);
		else if (nc == Base_sppl_prnt_typ_nm) doBase_sppl_prnt_typ_nm_NC(info);
		else if (nc == Base_asppl_prnt_typ) doBase_asppl_prnt_typ_NC(info);
		else if (nc == Base_asppl_prnt_typ_nm) doBase_asppl_prnt_typ_nm_NC(info);
		else if (nc == Base_bsppl_prnt_typ) doBase_bsppl_prnt_typ_NC(info);
		else if (nc == Base_bsppl_prnt_typ_nm) doBase_bsppl_prnt_typ_nm_NC(info);
		else if (nc == Base_psppl_prnt_typ) doBase_psppl_prnt_typ_NC(info);
		else if (nc == Base_psppl_prnt_typ_nm) doBase_psppl_prnt_typ_nm_NC(info);
		else if (nc == Base_ins_usr_id) doBase_ins_usr_id_NC(info);
		else if (nc == Base_ins_usr_nm) doBase_ins_usr_nm_NC(info);
		else if (nc == Base_ins_func_id) doBase_ins_func_id_NC(info);
		else if (nc == Base_ins_func_nm) doBase_ins_func_nm_NC(info);
		else if (nc == Base_upd_usr_id) doBase_upd_usr_id_NC(info);
		else if (nc == Base_upd_usr_nm) doBase_upd_usr_nm_NC(info);
		else if (nc == Base_upd_func_id) doBase_upd_func_id_NC(info);
		else if (nc == Base_upd_func_nm) doBase_upd_func_nm_NC(info);
		else if (nc == Base_ins_ts) doBase_ins_ts_NC(info);
		else if (nc == Base_upd_ts) doBase_upd_ts_NC(info);
		else if (nc == Base_upd_srv_req_no) doBase_upd_srv_req_no_NC(info);
		else if (nc == Base_upd_cntr) doBase_upd_cntr_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_co_cd) doDtl_co_cd_NC(info);
		else if (nc == columnDtl_co_alt_nm1) doDtl_co_alt_nm1_NC(info);
		else if (nc == columnDtl_co_alt_nm2) doDtl_co_alt_nm2_NC(info);
		else if (nc == columnDtl_co_alt_nm3) doDtl_co_alt_nm3_NC(info);
		else if (nc == columnDtl_co_alt_nm4) doDtl_co_alt_nm4_NC(info);
		else if (nc == columnDtl_zip_cd) doDtl_zip_cd_NC(info);
		else if (nc == columnDtl_addr1) doDtl_addr1_NC(info);
		else if (nc == columnDtl_addr2) doDtl_addr2_NC(info);
		else if (nc == columnDtl_addr3) doDtl_addr3_NC(info);
		else if (nc == columnDtl_addr4) doDtl_addr4_NC(info);
		else if (nc == columnDtl_tel) doDtl_tel_NC(info);
		else if (nc == columnDtl_fax) doDtl_fax_NC(info);
		else if (nc == columnDtl_co_repl_nm) doDtl_co_repl_nm_NC(info);
		else if (nc == columnDtl_ein) doDtl_ein_NC(info);
		else if (nc == columnDtl_biz_co_no) doDtl_biz_co_no_NC(info);
		else if (nc == columnDtl_std_co_cd) doDtl_std_co_cd_NC(info);
		else if (nc == columnDtl_cntry_cd) doDtl_cntry_cd_NC(info);
		else if (nc == columnDtl_area_cd) doDtl_area_cd_NC(info);
		else if (nc == columnDtl_base_cur_cd) doDtl_base_cur_cd_NC(info);
		else if (nc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NC(info);
		else if (nc == columnDtl_st_mon) doDtl_st_mon_NC(info);
		else if (nc == columnDtl_dt_switch_time) doDtl_dt_switch_time_NC(info);
		else if (nc == columnDtl_ac_cl_day) doDtl_ac_cl_day_NC(info);
		else if (nc == columnDtl_ac_cl_mon_base) doDtl_ac_cl_mon_base_NC(info);
		else if (nc == columnDtl_std_cal_cd) doDtl_std_cal_cd_NC(info);
		else if (nc == columnDtl_bill_cl_cal_cd) doDtl_bill_cl_cal_cd_NC(info);
		else if (nc == columnDtl_ar_no_use_flg) doDtl_ar_no_use_flg_NC(info);
		else if (nc == columnDtl_ap_no_use_flg) doDtl_ap_no_use_flg_NC(info);
		else if (nc == columnDtl_temp_ap_use_flg) doDtl_temp_ap_use_flg_NC(info);
		else if (nc == columnDtl_sls_cl_flg) doDtl_sls_cl_flg_NC(info);
		else if (nc == columnDtl_rcv_cl_flg) doDtl_rcv_cl_flg_NC(info);
		else if (nc == columnDtl_purc_cl_flg) doDtl_purc_cl_flg_NC(info);
		else if (nc == columnDtl_pay_cl_flg) doDtl_pay_cl_flg_NC(info);
		else if (nc == columnDtl_stk_cl_cal_cd) doDtl_stk_cl_cal_cd_NC(info);
		else if (nc == columnDtl_sls_cl_cal_cd) doDtl_sls_cl_cal_cd_NC(info);
		else if (nc == columnDtl_rcv_cl_cal_cd) doDtl_rcv_cl_cal_cd_NC(info);
		else if (nc == columnDtl_purc_cl_cal_cd) doDtl_purc_cl_cal_cd_NC(info);
		else if (nc == columnDtl_pay_cl_cal_cd) doDtl_pay_cl_cal_cd_NC(info);
		else if (nc == columnDtl_pay_schd_cl_cal_cd) doDtl_pay_schd_cl_cal_cd_NC(info);
		else if (nc == columnDtl_stk_cl_delay_days) doDtl_stk_cl_delay_days_NC(info);
		else if (nc == columnDtl_stk_cl_ba_typ) doDtl_stk_cl_ba_typ_NC(info);
		else if (nc == columnDtl_sls_cl_delay_days) doDtl_sls_cl_delay_days_NC(info);
		else if (nc == columnDtl_sls_cl_ba_typ) doDtl_sls_cl_ba_typ_NC(info);
		else if (nc == columnDtl_rcv_cl_delay_days) doDtl_rcv_cl_delay_days_NC(info);
		else if (nc == columnDtl_rcv_cl_ba_typ) doDtl_rcv_cl_ba_typ_NC(info);
		else if (nc == columnDtl_purc_cl_delay_days) doDtl_purc_cl_delay_days_NC(info);
		else if (nc == columnDtl_purc_cl_ba_typ) doDtl_purc_cl_ba_typ_NC(info);
		else if (nc == columnDtl_pay_cl_delay_days) doDtl_pay_cl_delay_days_NC(info);
		else if (nc == columnDtl_pay_cl_ba_typ) doDtl_pay_cl_ba_typ_NC(info);
		else if (nc == columnDtl_bill_xrate_conv_flg) doDtl_bill_xrate_conv_flg_NC(info);
		else if (nc == columnDtl_pay_xrate_conv_flg) doDtl_pay_xrate_conv_flg_NC(info);
		else if (nc == columnDtl_sls_xrate_cd) doDtl_sls_xrate_cd_NC(info);
		else if (nc == columnDtl_purc_xrate_cd) doDtl_purc_xrate_cd_NC(info);
		else if (nc == columnDtl_prov_xrate_cd) doDtl_prov_xrate_cd_NC(info);
		else if (nc == columnDtl_bill_xrate_cd) doDtl_bill_xrate_cd_NC(info);
		else if (nc == columnDtl_pay_xrate_cd) doDtl_pay_xrate_cd_NC(info);
		else if (nc == columnDtl_mon01_xrate_rev_flg) doDtl_mon01_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon02_xrate_rev_flg) doDtl_mon02_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon03_xrate_rev_flg) doDtl_mon03_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon04_xrate_rev_flg) doDtl_mon04_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon05_xrate_rev_flg) doDtl_mon05_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon06_xrate_rev_flg) doDtl_mon06_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon07_xrate_rev_flg) doDtl_mon07_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon08_xrate_rev_flg) doDtl_mon08_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon09_xrate_rev_flg) doDtl_mon09_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon10_xrate_rev_flg) doDtl_mon10_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon11_xrate_rev_flg) doDtl_mon11_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_mon12_xrate_rev_flg) doDtl_mon12_xrate_rev_flg_NC(info);
		else if (nc == columnDtl_sls_upri_req_typ) doDtl_sls_upri_req_typ_NC(info);
		else if (nc == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NC(info);
		else if (nc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NC(info);
		else if (nc == columnDtl_sls_basis_typ) doDtl_sls_basis_typ_NC(info);
		else if (nc == columnDtl_bill_basis_typ) doDtl_bill_basis_typ_NC(info);
		else if (nc == columnDtl_ship_schd_split_typ) doDtl_ship_schd_split_typ_NC(info);
		else if (nc == columnDtl_xfr_stk_mng_typ) doDtl_xfr_stk_mng_typ_NC(info);
		else if (nc == columnDtl_setoff_tax_rnd_typ) doDtl_setoff_tax_rnd_typ_NC(info);
		else if (nc == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_NC(info);
		else if (nc == columnDtl_com_paid_tax_rnd_typ) doDtl_com_paid_tax_rnd_typ_NC(info);
		else if (nc == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NC(info);
		else if (nc == columnDtl_stk_amt_rnd_typ) doDtl_stk_amt_rnd_typ_NC(info);
		else if (nc == columnDtl_stk_amt_dec_place) doDtl_stk_amt_dec_place_NC(info);
		else if (nc == columnDtl_po_print_cd) doDtl_po_print_cd_NC(info);
		else if (nc == columnDtl_stk_lst_cnf_num) doDtl_stk_lst_cnf_num_NC(info);
		else if (nc == columnDtl_stk_lst_limit_num) doDtl_stk_lst_limit_num_NC(info);
		else if (nc == columnDtl_gm_std_upri_typ) doDtl_gm_std_upri_typ_NC(info);
		else if (nc == columnDtl_stk_std_upri_typ) doDtl_stk_std_upri_typ_NC(info);
		else if (nc == columnDtl_early_ship_dt_add_days) doDtl_early_ship_dt_add_days_NC(info);
		else if (nc == columnDtl_ac_slip_digit) doDtl_ac_slip_digit_NC(info);
		else if (nc == columnDtl_ac_slip_seq_flg) doDtl_ac_slip_seq_flg_NC(info);
		else if (nc == columnDtl_sls_bdj_rnd_typ) doDtl_sls_bdj_rnd_typ_NC(info);
		else if (nc == columnDtl_cntry_nm) doDtl_cntry_nm_NC(info);
		else if (nc == columnDtl_area_nm) doDtl_area_nm_NC(info);
		else if (nc == columnDtl_base_cur_nm) doDtl_base_cur_nm_NC(info);
		else if (nc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NC(info);
		else if (nc == columnDtl_std_cal_nm) doDtl_std_cal_nm_NC(info);
		else if (nc == columnDtl_stk_cl_cal_nm) doDtl_stk_cl_cal_nm_NC(info);
		else if (nc == columnDtl_sls_cl_cal_nm) doDtl_sls_cl_cal_nm_NC(info);
		else if (nc == columnDtl_bill_cl_cal_nm) doDtl_bill_cl_cal_nm_NC(info);
		else if (nc == columnDtl_rcv_cl_cal_nm) doDtl_rcv_cl_cal_nm_NC(info);
		else if (nc == columnDtl_purc_cl_cal_nm) doDtl_purc_cl_cal_nm_NC(info);
		else if (nc == columnDtl_pay_cl_cal_nm) doDtl_pay_cl_cal_nm_NC(info);
		else if (nc == columnDtl_pay_schd_cl_cal_nm) doDtl_pay_schd_cl_cal_nm_NC(info);
		else if (nc == columnDtl_sls_xrate_nm) doDtl_sls_xrate_nm_NC(info);
		else if (nc == columnDtl_purc_xrate_nm) doDtl_purc_xrate_nm_NC(info);
		else if (nc == columnDtl_prov_xrate_nm) doDtl_prov_xrate_nm_NC(info);
		else if (nc == columnDtl_bill_xrate_nm) doDtl_bill_xrate_nm_NC(info);
		else if (nc == columnDtl_pay_xrate_nm) doDtl_pay_xrate_nm_NC(info);
		else if (nc == columnDtl_stk_cl_ba_typ_nm) doDtl_stk_cl_ba_typ_nm_NC(info);
		else if (nc == columnDtl_sls_cl_ba_typ_nm) doDtl_sls_cl_ba_typ_nm_NC(info);
		else if (nc == columnDtl_rcv_cl_ba_typ_nm) doDtl_rcv_cl_ba_typ_nm_NC(info);
		else if (nc == columnDtl_purc_cl_ba_typ_nm) doDtl_purc_cl_ba_typ_nm_NC(info);
		else if (nc == columnDtl_pay_cl_ba_typ_nm) doDtl_pay_cl_ba_typ_nm_NC(info);
		else if (nc == columnDtl_sls_upri_req_typ_nm) doDtl_sls_upri_req_typ_nm_NC(info);
		else if (nc == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NC(info);
		else if (nc == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_NC(info);
		else if (nc == columnDtl_sls_basis_typ_nm) doDtl_sls_basis_typ_nm_NC(info);
		else if (nc == columnDtl_bill_basis_typ_nm) doDtl_bill_basis_typ_nm_NC(info);
		else if (nc == columnDtl_ship_schd_split_typ_nm) doDtl_ship_schd_split_typ_nm_NC(info);
		else if (nc == columnDtl_xfr_stk_mng_typ_nm) doDtl_xfr_stk_mng_typ_nm_NC(info);
		else if (nc == columnDtl_xrate_rnd_typ_nm) doDtl_xrate_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_setoff_tax_rnd_typ_nm) doDtl_setoff_tax_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_com_paid_tax_rnd_typ_nm) doDtl_com_paid_tax_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_wtax_rnd_typ_nm) doDtl_wtax_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_stk_amt_rnd_typ_nm) doDtl_stk_amt_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_sls_bdj_rnd_typ_nm) doDtl_sls_bdj_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_po_print_nm) doDtl_po_print_nm_NC(info);
		else if (nc == columnDtl_gm_std_upri_typ_nm) doDtl_gm_std_upri_typ_nm_NC(info);
		else if (nc == columnDtl_stk_std_upri_typ_nm) doDtl_stk_std_upri_typ_nm_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_rpt_strg_ext_sys_cd) doDtl_rpt_strg_ext_sys_cd_NC(info);
		else if (nc == columnDtl_rpt_strg_ext_sys_nm) doDtl_rpt_strg_ext_sys_nm_NC(info);
		else if (nc == columnDtl_cst_prnt_typ) doDtl_cst_prnt_typ_NC(info);
		else if (nc == columnDtl_cst_prnt_typ_nm) doDtl_cst_prnt_typ_nm_NC(info);
		else if (nc == columnDtl_acst_prnt_typ) doDtl_acst_prnt_typ_NC(info);
		else if (nc == columnDtl_acst_prnt_typ_nm) doDtl_acst_prnt_typ_nm_NC(info);
		else if (nc == columnDtl_bcst_prnt_typ) doDtl_bcst_prnt_typ_NC(info);
		else if (nc == columnDtl_bcst_prnt_typ_nm) doDtl_bcst_prnt_typ_nm_NC(info);
		else if (nc == columnDtl_rcst_prnt_typ) doDtl_rcst_prnt_typ_NC(info);
		else if (nc == columnDtl_rcst_prnt_typ_nm) doDtl_rcst_prnt_typ_nm_NC(info);
		else if (nc == columnDtl_dlv_prnt_typ) doDtl_dlv_prnt_typ_NC(info);
		else if (nc == columnDtl_dlv_prnt_typ_nm) doDtl_dlv_prnt_typ_nm_NC(info);
		else if (nc == columnDtl_sppl_prnt_typ) doDtl_sppl_prnt_typ_NC(info);
		else if (nc == columnDtl_sppl_prnt_typ_nm) doDtl_sppl_prnt_typ_nm_NC(info);
		else if (nc == columnDtl_asppl_prnt_typ) doDtl_asppl_prnt_typ_NC(info);
		else if (nc == columnDtl_asppl_prnt_typ_nm) doDtl_asppl_prnt_typ_nm_NC(info);
		else if (nc == columnDtl_bsppl_prnt_typ) doDtl_bsppl_prnt_typ_NC(info);
		else if (nc == columnDtl_bsppl_prnt_typ_nm) doDtl_bsppl_prnt_typ_nm_NC(info);
		else if (nc == columnDtl_psppl_prnt_typ) doDtl_psppl_prnt_typ_NC(info);
		else if (nc == columnDtl_psppl_prnt_typ_nm) doDtl_psppl_prnt_typ_nm_NC(info);
		else if (nc == columnDtlSub_check) doDtlSub_check_NC(info);
		else if (nc == columnDtlSub_co_cd) doDtlSub_co_cd_NC(info);
		else if (nc == columnDtlSub_sls_tax_cd) doDtlSub_sls_tax_cd_NC(info);
		else if (nc == columnDtlSub_sls_tax_nm) doDtlSub_sls_tax_nm_NC(info);
		else if (nc == columnDtlSub_purc_tax_cd) doDtlSub_purc_tax_cd_NC(info);
		else if (nc == columnDtlSub_purc_tax_nm) doDtlSub_purc_tax_nm_NC(info);
		else if (nc == columnDtlSub_prov_tax_cd) doDtlSub_prov_tax_cd_NC(info);
		else if (nc == columnDtlSub_prov_tax_nm) doDtlSub_prov_tax_nm_NC(info);
		else if (nc == columnDtlSub_memo1) doDtlSub_memo1_NC(info);
		else if (nc == columnDtlSub_memo2) doDtlSub_memo2_NC(info);
		else if (nc == columnDtlSub_memo3) doDtlSub_memo3_NC(info);
		else if (nc == columnDtlSub_ins_usr_id) doDtlSub_ins_usr_id_NC(info);
		else if (nc == columnDtlSub_ins_usr_nm) doDtlSub_ins_usr_nm_NC(info);
		else if (nc == columnDtlSub_ins_ts) doDtlSub_ins_ts_NC(info);
		else if (nc == columnDtlSub_ins_func_id) doDtlSub_ins_func_id_NC(info);
		else if (nc == columnDtlSub_ins_func_nm) doDtlSub_ins_func_nm_NC(info);
		else if (nc == columnDtlSub_upd_cntr) doDtlSub_upd_cntr_NC(info);
		else if (nc == columnDtlSub_upd_usr_id) doDtlSub_upd_usr_id_NC(info);
		else if (nc == columnDtlSub_upd_usr_nm) doDtlSub_upd_usr_nm_NC(info);
		else if (nc == columnDtlSub_upd_ts) doDtlSub_upd_ts_NC(info);
		else if (nc == columnDtlSub_upd_func_id) doDtlSub_upd_func_id_NC(info);
		else if (nc == columnDtlSub_upd_func_nm) doDtlSub_upd_func_nm_NC(info);
		else if (nc == columnDtlSub_upd_srv_req_no) doDtlSub_upd_srv_req_no_NC(info);
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_co_cd) doLcl_co_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_co_alt_nm1) doLcl_co_alt_nm1_NC(info);
		else if (nc == columnLcl_co_alt_nm2) doLcl_co_alt_nm2_NC(info);
		else if (nc == columnLcl_co_alt_nm3) doLcl_co_alt_nm3_NC(info);
		else if (nc == columnLcl_co_alt_nm4) doLcl_co_alt_nm4_NC(info);
		else if (nc == columnLcl_zip_cd) doLcl_zip_cd_NC(info);
		else if (nc == columnLcl_addr1) doLcl_addr1_NC(info);
		else if (nc == columnLcl_addr2) doLcl_addr2_NC(info);
		else if (nc == columnLcl_addr3) doLcl_addr3_NC(info);
		else if (nc == columnLcl_addr4) doLcl_addr4_NC(info);
		else if (nc == columnLcl_tel) doLcl_tel_NC(info);
		else if (nc == columnLcl_fax) doLcl_fax_NC(info);
		else if (nc == columnLcl_co_repl_nm) doLcl_co_repl_nm_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
		else if (nc == columnLcl_ins_usr_id) doLcl_ins_usr_id_NC(info);
		else if (nc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NC(info);
		else if (nc == columnLcl_ins_ts) doLcl_ins_ts_NC(info);
		else if (nc == columnLcl_ins_func_id) doLcl_ins_func_id_NC(info);
		else if (nc == columnLcl_ins_func_nm) doLcl_ins_func_nm_NC(info);
		else if (nc == columnLcl_upd_cntr) doLcl_upd_cntr_NC(info);
		else if (nc == columnLcl_upd_usr_id) doLcl_upd_usr_id_NC(info);
		else if (nc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NC(info);
		else if (nc == columnLcl_upd_ts) doLcl_upd_ts_NC(info);
		else if (nc == columnLcl_upd_func_id) doLcl_upd_func_id_NC(info);
		else if (nc == columnLcl_upd_func_nm) doLcl_upd_func_nm_NC(info);
		else if (nc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Tab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [SubTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSubTab_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tel_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fax_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_repl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_repl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_co_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_co_no_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ein]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ein_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_cl_mon_base]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_cl_mon_base_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[st_mon]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_st_mon_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dt_switch_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dt_switch_time_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ar_no_use_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ar_no_use_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ap_no_use_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ap_no_use_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[temp_ap_use_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_temp_ap_use_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_schd_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_schd_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_conv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_conv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_conv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_conv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon01_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon01_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon02_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon02_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon03_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon03_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon04_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon04_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon05_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon05_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon06_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon06_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon07_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon07_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon08_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon08_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon09_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon09_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon10_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon10_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon11_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon11_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon12_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon12_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_upri_req_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ship_schd_split_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ship_schd_split_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xfr_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xfr_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_bdj_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_bdj_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_upri_req_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_outsrc_upri_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xrate_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xrate_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_setoff_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_setoff_tax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_com_paid_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_com_paid_tax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wtax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wtax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_gm_std_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_gm_std_upri_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_std_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_std_upri_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[po_print_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_po_print_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[po_print_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_po_print_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_lst_cnf_num]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_lst_cnf_num_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_lst_limit_num]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_lst_limit_num_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[early_ship_dt_add_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_early_ship_dt_add_days_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_slip_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_slip_digit_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_slip_seq_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_slip_seq_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rpt_strg_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rpt_strg_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[acst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_acst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[acst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_acst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bcst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bcst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dlv_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dlv_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bsppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bsppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_psppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_psppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_repl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_repl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ein]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ein_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_co_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_co_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_mon]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_mon_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt_switch_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_switch_time_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_cl_mon_base]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_cl_mon_base_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_no_use_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_no_use_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_no_use_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_no_use_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[temp_ap_use_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_temp_ap_use_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_cl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_conv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_conv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_conv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_conv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon01_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon01_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon02_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon02_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon03_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon03_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon04_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon04_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon05_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon05_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon06_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon06_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon07_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon07_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon08_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon08_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon09_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon09_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon10_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon10_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon11_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon11_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon12_xrate_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon12_xrate_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_split_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_com_paid_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_cnf_num]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_cnf_num_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_limit_num]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_limit_num_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gm_std_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_std_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_early_ship_dt_add_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_digit_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_seq_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_seq_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdj_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_cl_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_split_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_tax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_com_paid_tax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdj_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gm_std_upri_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_std_upri_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_strg_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_strg_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[sls_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_sls_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[sls_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_sls_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[purc_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_purc_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[purc_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_purc_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[prov_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_prov_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[prov_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_prov_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo1_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo2_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo3_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_tel_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fax_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_repl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_repl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == TabTab) doTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == SubTabTab) doSubTab_NE(info);
		else if (ne == DtlSubTable) doDtlSub_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_co_cd) doCnd_co_cd_NE(info);
		else if (ne == Cnd_co_nm_lcl) doCnd_co_nm_lcl_NE(info);
		else if (ne == Base_co_cd) doBase_co_cd_NE(info);
		else if (ne == Base_co_alt_nm1) doBase_co_alt_nm1_NE(info);
		else if (ne == Base_co_alt_nm2) doBase_co_alt_nm2_NE(info);
		else if (ne == Base_co_alt_nm3) doBase_co_alt_nm3_NE(info);
		else if (ne == Base_co_alt_nm4) doBase_co_alt_nm4_NE(info);
		else if (ne == Base_cntry_cd) doBase_cntry_cd_NE(info);
		else if (ne == Base_cntry_nm) doBase_cntry_nm_NE(info);
		else if (ne == Base_area_cd) doBase_area_cd_NE(info);
		else if (ne == Base_area_nm) doBase_area_nm_NE(info);
		else if (ne == Base_zip_cd) doBase_zip_cd_NE(info);
		else if (ne == Base_addr1) doBase_addr1_NE(info);
		else if (ne == Base_addr2) doBase_addr2_NE(info);
		else if (ne == Base_addr3) doBase_addr3_NE(info);
		else if (ne == Base_addr4) doBase_addr4_NE(info);
		else if (ne == Base_tel) doBase_tel_NE(info);
		else if (ne == Base_fax) doBase_fax_NE(info);
		else if (ne == Base_co_repl_nm) doBase_co_repl_nm_NE(info);
		else if (ne == Base_biz_co_no) doBase_biz_co_no_NE(info);
		else if (ne == Base_ein) doBase_ein_NE(info);
		else if (ne == Base_std_co_cd) doBase_std_co_cd_NE(info);
		else if (ne == Base_base_cur_cd) doBase_base_cur_cd_NE(info);
		else if (ne == Base_base_cur_nm) doBase_base_cur_nm_NE(info);
		else if (ne == Base_ptax_cur_cd) doBase_ptax_cur_cd_NE(info);
		else if (ne == Base_ptax_cur_nm) doBase_ptax_cur_nm_NE(info);
		else if (ne == Base_ac_cl_day) doBase_ac_cl_day_NE(info);
		else if (ne == Base_ac_cl_mon_base) doBase_ac_cl_mon_base_NE(info);
		else if (ne == Base_st_mon) doBase_st_mon_NE(info);
		else if (ne == Base_dt_switch_time) doBase_dt_switch_time_NE(info);
		else if (ne == Base_std_cal_cd) doBase_std_cal_cd_NE(info);
		else if (ne == Base_std_cal_nm) doBase_std_cal_nm_NE(info);
		else if (ne == Base_ar_no_use_flg) doBase_ar_no_use_flg_NE(info);
		else if (ne == Base_ap_no_use_flg) doBase_ap_no_use_flg_NE(info);
		else if (ne == Base_temp_ap_use_flg) doBase_temp_ap_use_flg_NE(info);
		else if (ne == Base_sls_cl_flg) doBase_sls_cl_flg_NE(info);
		else if (ne == Base_rcv_cl_flg) doBase_rcv_cl_flg_NE(info);
		else if (ne == Base_purc_cl_flg) doBase_purc_cl_flg_NE(info);
		else if (ne == Base_pay_cl_flg) doBase_pay_cl_flg_NE(info);
		else if (ne == Base_sls_cl_cal_cd) doBase_sls_cl_cal_cd_NE(info);
		else if (ne == Base_sls_cl_cal_nm) doBase_sls_cl_cal_nm_NE(info);
		else if (ne == Base_sls_cl_delay_days) doBase_sls_cl_delay_days_NE(info);
		else if (ne == Base_sls_cl_ba_typ) doBase_sls_cl_ba_typ_NE(info);
		else if (ne == Base_sls_cl_ba_typ_nm) doBase_sls_cl_ba_typ_nm_NE(info);
		else if (ne == Base_rcv_cl_cal_cd) doBase_rcv_cl_cal_cd_NE(info);
		else if (ne == Base_rcv_cl_cal_nm) doBase_rcv_cl_cal_nm_NE(info);
		else if (ne == Base_rcv_cl_delay_days) doBase_rcv_cl_delay_days_NE(info);
		else if (ne == Base_rcv_cl_ba_typ) doBase_rcv_cl_ba_typ_NE(info);
		else if (ne == Base_rcv_cl_ba_typ_nm) doBase_rcv_cl_ba_typ_nm_NE(info);
		else if (ne == Base_purc_cl_cal_cd) doBase_purc_cl_cal_cd_NE(info);
		else if (ne == Base_purc_cl_cal_nm) doBase_purc_cl_cal_nm_NE(info);
		else if (ne == Base_purc_cl_delay_days) doBase_purc_cl_delay_days_NE(info);
		else if (ne == Base_purc_cl_ba_typ) doBase_purc_cl_ba_typ_NE(info);
		else if (ne == Base_purc_cl_ba_typ_nm) doBase_purc_cl_ba_typ_nm_NE(info);
		else if (ne == Base_pay_cl_cal_cd) doBase_pay_cl_cal_cd_NE(info);
		else if (ne == Base_pay_cl_cal_nm) doBase_pay_cl_cal_nm_NE(info);
		else if (ne == Base_pay_cl_delay_days) doBase_pay_cl_delay_days_NE(info);
		else if (ne == Base_pay_cl_ba_typ) doBase_pay_cl_ba_typ_NE(info);
		else if (ne == Base_pay_cl_ba_typ_nm) doBase_pay_cl_ba_typ_nm_NE(info);
		else if (ne == Base_stk_cl_cal_cd) doBase_stk_cl_cal_cd_NE(info);
		else if (ne == Base_stk_cl_cal_nm) doBase_stk_cl_cal_nm_NE(info);
		else if (ne == Base_stk_cl_delay_days) doBase_stk_cl_delay_days_NE(info);
		else if (ne == Base_stk_cl_ba_typ) doBase_stk_cl_ba_typ_NE(info);
		else if (ne == Base_stk_cl_ba_typ_nm) doBase_stk_cl_ba_typ_nm_NE(info);
		else if (ne == Base_bill_cl_cal_cd) doBase_bill_cl_cal_cd_NE(info);
		else if (ne == Base_bill_cl_cal_nm) doBase_bill_cl_cal_nm_NE(info);
		else if (ne == Base_pay_schd_cl_cal_cd) doBase_pay_schd_cl_cal_cd_NE(info);
		else if (ne == Base_pay_schd_cl_cal_nm) doBase_pay_schd_cl_cal_nm_NE(info);
		else if (ne == Base_bill_xrate_conv_flg) doBase_bill_xrate_conv_flg_NE(info);
		else if (ne == Base_pay_xrate_conv_flg) doBase_pay_xrate_conv_flg_NE(info);
		else if (ne == Base_sls_xrate_cd) doBase_sls_xrate_cd_NE(info);
		else if (ne == Base_sls_xrate_nm) doBase_sls_xrate_nm_NE(info);
		else if (ne == Base_purc_xrate_cd) doBase_purc_xrate_cd_NE(info);
		else if (ne == Base_purc_xrate_nm) doBase_purc_xrate_nm_NE(info);
		else if (ne == Base_prov_xrate_cd) doBase_prov_xrate_cd_NE(info);
		else if (ne == Base_prov_xrate_nm) doBase_prov_xrate_nm_NE(info);
		else if (ne == Base_bill_xrate_cd) doBase_bill_xrate_cd_NE(info);
		else if (ne == Base_bill_xrate_nm) doBase_bill_xrate_nm_NE(info);
		else if (ne == Base_pay_xrate_cd) doBase_pay_xrate_cd_NE(info);
		else if (ne == Base_pay_xrate_nm) doBase_pay_xrate_nm_NE(info);
		else if (ne == Base_mon01_xrate_rev_flg) doBase_mon01_xrate_rev_flg_NE(info);
		else if (ne == Base_mon02_xrate_rev_flg) doBase_mon02_xrate_rev_flg_NE(info);
		else if (ne == Base_mon03_xrate_rev_flg) doBase_mon03_xrate_rev_flg_NE(info);
		else if (ne == Base_mon04_xrate_rev_flg) doBase_mon04_xrate_rev_flg_NE(info);
		else if (ne == Base_mon05_xrate_rev_flg) doBase_mon05_xrate_rev_flg_NE(info);
		else if (ne == Base_mon06_xrate_rev_flg) doBase_mon06_xrate_rev_flg_NE(info);
		else if (ne == Base_mon07_xrate_rev_flg) doBase_mon07_xrate_rev_flg_NE(info);
		else if (ne == Base_mon08_xrate_rev_flg) doBase_mon08_xrate_rev_flg_NE(info);
		else if (ne == Base_mon09_xrate_rev_flg) doBase_mon09_xrate_rev_flg_NE(info);
		else if (ne == Base_mon10_xrate_rev_flg) doBase_mon10_xrate_rev_flg_NE(info);
		else if (ne == Base_mon11_xrate_rev_flg) doBase_mon11_xrate_rev_flg_NE(info);
		else if (ne == Base_mon12_xrate_rev_flg) doBase_mon12_xrate_rev_flg_NE(info);
		else if (ne == Base_sls_upri_req_typ) doBase_sls_upri_req_typ_NE(info);
		else if (ne == Base_sls_upri_req_typ_nm) doBase_sls_upri_req_typ_nm_NE(info);
		else if (ne == Base_sls_basis_typ) doBase_sls_basis_typ_NE(info);
		else if (ne == Base_sls_basis_typ_nm) doBase_sls_basis_typ_nm_NE(info);
		else if (ne == Base_bill_basis_typ) doBase_bill_basis_typ_NE(info);
		else if (ne == Base_bill_basis_typ_nm) doBase_bill_basis_typ_nm_NE(info);
		else if (ne == Base_ship_schd_split_typ) doBase_ship_schd_split_typ_NE(info);
		else if (ne == Base_ship_schd_split_typ_nm) doBase_ship_schd_split_typ_nm_NE(info);
		else if (ne == Base_xfr_stk_mng_typ) doBase_xfr_stk_mng_typ_NE(info);
		else if (ne == Base_xfr_stk_mng_typ_nm) doBase_xfr_stk_mng_typ_nm_NE(info);
		else if (ne == Base_sls_bdj_rnd_typ) doBase_sls_bdj_rnd_typ_NE(info);
		else if (ne == Base_sls_bdj_rnd_typ_nm) doBase_sls_bdj_rnd_typ_nm_NE(info);
		else if (ne == Base_purc_upri_req_typ) doBase_purc_upri_req_typ_NE(info);
		else if (ne == Base_purc_upri_req_typ_nm) doBase_purc_upri_req_typ_nm_NE(info);
		else if (ne == Base_outsrc_upri_typ) doBase_outsrc_upri_typ_NE(info);
		else if (ne == Base_outsrc_upri_typ_nm) doBase_outsrc_upri_typ_nm_NE(info);
		else if (ne == Base_xrate_rnd_typ) doBase_xrate_rnd_typ_NE(info);
		else if (ne == Base_xrate_rnd_typ_nm) doBase_xrate_rnd_typ_nm_NE(info);
		else if (ne == Base_setoff_tax_rnd_typ) doBase_setoff_tax_rnd_typ_NE(info);
		else if (ne == Base_setoff_tax_rnd_typ_nm) doBase_setoff_tax_rnd_typ_nm_NE(info);
		else if (ne == Base_com_paid_tax_rnd_typ) doBase_com_paid_tax_rnd_typ_NE(info);
		else if (ne == Base_com_paid_tax_rnd_typ_nm) doBase_com_paid_tax_rnd_typ_nm_NE(info);
		else if (ne == Base_wtax_rnd_typ) doBase_wtax_rnd_typ_NE(info);
		else if (ne == Base_wtax_rnd_typ_nm) doBase_wtax_rnd_typ_nm_NE(info);
		else if (ne == Base_gm_std_upri_typ) doBase_gm_std_upri_typ_NE(info);
		else if (ne == Base_gm_std_upri_typ_nm) doBase_gm_std_upri_typ_nm_NE(info);
		else if (ne == Base_stk_std_upri_typ) doBase_stk_std_upri_typ_NE(info);
		else if (ne == Base_stk_std_upri_typ_nm) doBase_stk_std_upri_typ_nm_NE(info);
		else if (ne == Base_stk_amt_rnd_typ) doBase_stk_amt_rnd_typ_NE(info);
		else if (ne == Base_stk_amt_rnd_typ_nm) doBase_stk_amt_rnd_typ_nm_NE(info);
		else if (ne == Base_stk_amt_dec_place) doBase_stk_amt_dec_place_NE(info);
		else if (ne == Base_po_print_cd) doBase_po_print_cd_NE(info);
		else if (ne == Base_po_print_nm) doBase_po_print_nm_NE(info);
		else if (ne == Base_stk_lst_cnf_num) doBase_stk_lst_cnf_num_NE(info);
		else if (ne == Base_stk_lst_limit_num) doBase_stk_lst_limit_num_NE(info);
		else if (ne == Base_early_ship_dt_add_days) doBase_early_ship_dt_add_days_NE(info);
		else if (ne == Base_ac_slip_digit) doBase_ac_slip_digit_NE(info);
		else if (ne == Base_ac_slip_seq_flg) doBase_ac_slip_seq_flg_NE(info);
		else if (ne == Base_rpt_strg_ext_sys_cd) doBase_rpt_strg_ext_sys_cd_NE(info);
		else if (ne == Base_rpt_strg_ext_sys_nm) doBase_rpt_strg_ext_sys_nm_NE(info);
		else if (ne == Base_cst_prnt_typ) doBase_cst_prnt_typ_NE(info);
		else if (ne == Base_cst_prnt_typ_nm) doBase_cst_prnt_typ_nm_NE(info);
		else if (ne == Base_acst_prnt_typ) doBase_acst_prnt_typ_NE(info);
		else if (ne == Base_acst_prnt_typ_nm) doBase_acst_prnt_typ_nm_NE(info);
		else if (ne == Base_bcst_prnt_typ) doBase_bcst_prnt_typ_NE(info);
		else if (ne == Base_bcst_prnt_typ_nm) doBase_bcst_prnt_typ_nm_NE(info);
		else if (ne == Base_rcst_prnt_typ) doBase_rcst_prnt_typ_NE(info);
		else if (ne == Base_rcst_prnt_typ_nm) doBase_rcst_prnt_typ_nm_NE(info);
		else if (ne == Base_dlv_prnt_typ) doBase_dlv_prnt_typ_NE(info);
		else if (ne == Base_dlv_prnt_typ_nm) doBase_dlv_prnt_typ_nm_NE(info);
		else if (ne == Base_sppl_prnt_typ) doBase_sppl_prnt_typ_NE(info);
		else if (ne == Base_sppl_prnt_typ_nm) doBase_sppl_prnt_typ_nm_NE(info);
		else if (ne == Base_asppl_prnt_typ) doBase_asppl_prnt_typ_NE(info);
		else if (ne == Base_asppl_prnt_typ_nm) doBase_asppl_prnt_typ_nm_NE(info);
		else if (ne == Base_bsppl_prnt_typ) doBase_bsppl_prnt_typ_NE(info);
		else if (ne == Base_bsppl_prnt_typ_nm) doBase_bsppl_prnt_typ_nm_NE(info);
		else if (ne == Base_psppl_prnt_typ) doBase_psppl_prnt_typ_NE(info);
		else if (ne == Base_psppl_prnt_typ_nm) doBase_psppl_prnt_typ_nm_NE(info);
		else if (ne == Base_ins_usr_id) doBase_ins_usr_id_NE(info);
		else if (ne == Base_ins_usr_nm) doBase_ins_usr_nm_NE(info);
		else if (ne == Base_ins_func_id) doBase_ins_func_id_NE(info);
		else if (ne == Base_ins_func_nm) doBase_ins_func_nm_NE(info);
		else if (ne == Base_upd_usr_id) doBase_upd_usr_id_NE(info);
		else if (ne == Base_upd_usr_nm) doBase_upd_usr_nm_NE(info);
		else if (ne == Base_upd_func_id) doBase_upd_func_id_NE(info);
		else if (ne == Base_upd_func_nm) doBase_upd_func_nm_NE(info);
		else if (ne == Base_ins_ts) doBase_ins_ts_NE(info);
		else if (ne == Base_upd_ts) doBase_upd_ts_NE(info);
		else if (ne == Base_upd_srv_req_no) doBase_upd_srv_req_no_NE(info);
		else if (ne == Base_upd_cntr) doBase_upd_cntr_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_co_cd) doDtl_co_cd_NE(info);
		else if (ne == columnDtl_co_alt_nm1) doDtl_co_alt_nm1_NE(info);
		else if (ne == columnDtl_co_alt_nm2) doDtl_co_alt_nm2_NE(info);
		else if (ne == columnDtl_co_alt_nm3) doDtl_co_alt_nm3_NE(info);
		else if (ne == columnDtl_co_alt_nm4) doDtl_co_alt_nm4_NE(info);
		else if (ne == columnDtl_zip_cd) doDtl_zip_cd_NE(info);
		else if (ne == columnDtl_addr1) doDtl_addr1_NE(info);
		else if (ne == columnDtl_addr2) doDtl_addr2_NE(info);
		else if (ne == columnDtl_addr3) doDtl_addr3_NE(info);
		else if (ne == columnDtl_addr4) doDtl_addr4_NE(info);
		else if (ne == columnDtl_tel) doDtl_tel_NE(info);
		else if (ne == columnDtl_fax) doDtl_fax_NE(info);
		else if (ne == columnDtl_co_repl_nm) doDtl_co_repl_nm_NE(info);
		else if (ne == columnDtl_ein) doDtl_ein_NE(info);
		else if (ne == columnDtl_biz_co_no) doDtl_biz_co_no_NE(info);
		else if (ne == columnDtl_std_co_cd) doDtl_std_co_cd_NE(info);
		else if (ne == columnDtl_cntry_cd) doDtl_cntry_cd_NE(info);
		else if (ne == columnDtl_area_cd) doDtl_area_cd_NE(info);
		else if (ne == columnDtl_base_cur_cd) doDtl_base_cur_cd_NE(info);
		else if (ne == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NE(info);
		else if (ne == columnDtl_st_mon) doDtl_st_mon_NE(info);
		else if (ne == columnDtl_dt_switch_time) doDtl_dt_switch_time_NE(info);
		else if (ne == columnDtl_ac_cl_day) doDtl_ac_cl_day_NE(info);
		else if (ne == columnDtl_ac_cl_mon_base) doDtl_ac_cl_mon_base_NE(info);
		else if (ne == columnDtl_std_cal_cd) doDtl_std_cal_cd_NE(info);
		else if (ne == columnDtl_bill_cl_cal_cd) doDtl_bill_cl_cal_cd_NE(info);
		else if (ne == columnDtl_ar_no_use_flg) doDtl_ar_no_use_flg_NE(info);
		else if (ne == columnDtl_ap_no_use_flg) doDtl_ap_no_use_flg_NE(info);
		else if (ne == columnDtl_temp_ap_use_flg) doDtl_temp_ap_use_flg_NE(info);
		else if (ne == columnDtl_sls_cl_flg) doDtl_sls_cl_flg_NE(info);
		else if (ne == columnDtl_rcv_cl_flg) doDtl_rcv_cl_flg_NE(info);
		else if (ne == columnDtl_purc_cl_flg) doDtl_purc_cl_flg_NE(info);
		else if (ne == columnDtl_pay_cl_flg) doDtl_pay_cl_flg_NE(info);
		else if (ne == columnDtl_stk_cl_cal_cd) doDtl_stk_cl_cal_cd_NE(info);
		else if (ne == columnDtl_sls_cl_cal_cd) doDtl_sls_cl_cal_cd_NE(info);
		else if (ne == columnDtl_rcv_cl_cal_cd) doDtl_rcv_cl_cal_cd_NE(info);
		else if (ne == columnDtl_purc_cl_cal_cd) doDtl_purc_cl_cal_cd_NE(info);
		else if (ne == columnDtl_pay_cl_cal_cd) doDtl_pay_cl_cal_cd_NE(info);
		else if (ne == columnDtl_pay_schd_cl_cal_cd) doDtl_pay_schd_cl_cal_cd_NE(info);
		else if (ne == columnDtl_stk_cl_delay_days) doDtl_stk_cl_delay_days_NE(info);
		else if (ne == columnDtl_stk_cl_ba_typ) doDtl_stk_cl_ba_typ_NE(info);
		else if (ne == columnDtl_sls_cl_delay_days) doDtl_sls_cl_delay_days_NE(info);
		else if (ne == columnDtl_sls_cl_ba_typ) doDtl_sls_cl_ba_typ_NE(info);
		else if (ne == columnDtl_rcv_cl_delay_days) doDtl_rcv_cl_delay_days_NE(info);
		else if (ne == columnDtl_rcv_cl_ba_typ) doDtl_rcv_cl_ba_typ_NE(info);
		else if (ne == columnDtl_purc_cl_delay_days) doDtl_purc_cl_delay_days_NE(info);
		else if (ne == columnDtl_purc_cl_ba_typ) doDtl_purc_cl_ba_typ_NE(info);
		else if (ne == columnDtl_pay_cl_delay_days) doDtl_pay_cl_delay_days_NE(info);
		else if (ne == columnDtl_pay_cl_ba_typ) doDtl_pay_cl_ba_typ_NE(info);
		else if (ne == columnDtl_bill_xrate_conv_flg) doDtl_bill_xrate_conv_flg_NE(info);
		else if (ne == columnDtl_pay_xrate_conv_flg) doDtl_pay_xrate_conv_flg_NE(info);
		else if (ne == columnDtl_sls_xrate_cd) doDtl_sls_xrate_cd_NE(info);
		else if (ne == columnDtl_purc_xrate_cd) doDtl_purc_xrate_cd_NE(info);
		else if (ne == columnDtl_prov_xrate_cd) doDtl_prov_xrate_cd_NE(info);
		else if (ne == columnDtl_bill_xrate_cd) doDtl_bill_xrate_cd_NE(info);
		else if (ne == columnDtl_pay_xrate_cd) doDtl_pay_xrate_cd_NE(info);
		else if (ne == columnDtl_mon01_xrate_rev_flg) doDtl_mon01_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon02_xrate_rev_flg) doDtl_mon02_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon03_xrate_rev_flg) doDtl_mon03_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon04_xrate_rev_flg) doDtl_mon04_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon05_xrate_rev_flg) doDtl_mon05_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon06_xrate_rev_flg) doDtl_mon06_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon07_xrate_rev_flg) doDtl_mon07_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon08_xrate_rev_flg) doDtl_mon08_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon09_xrate_rev_flg) doDtl_mon09_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon10_xrate_rev_flg) doDtl_mon10_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon11_xrate_rev_flg) doDtl_mon11_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_mon12_xrate_rev_flg) doDtl_mon12_xrate_rev_flg_NE(info);
		else if (ne == columnDtl_sls_upri_req_typ) doDtl_sls_upri_req_typ_NE(info);
		else if (ne == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NE(info);
		else if (ne == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NE(info);
		else if (ne == columnDtl_sls_basis_typ) doDtl_sls_basis_typ_NE(info);
		else if (ne == columnDtl_bill_basis_typ) doDtl_bill_basis_typ_NE(info);
		else if (ne == columnDtl_ship_schd_split_typ) doDtl_ship_schd_split_typ_NE(info);
		else if (ne == columnDtl_xfr_stk_mng_typ) doDtl_xfr_stk_mng_typ_NE(info);
		else if (ne == columnDtl_setoff_tax_rnd_typ) doDtl_setoff_tax_rnd_typ_NE(info);
		else if (ne == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_NE(info);
		else if (ne == columnDtl_com_paid_tax_rnd_typ) doDtl_com_paid_tax_rnd_typ_NE(info);
		else if (ne == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NE(info);
		else if (ne == columnDtl_stk_amt_rnd_typ) doDtl_stk_amt_rnd_typ_NE(info);
		else if (ne == columnDtl_stk_amt_dec_place) doDtl_stk_amt_dec_place_NE(info);
		else if (ne == columnDtl_po_print_cd) doDtl_po_print_cd_NE(info);
		else if (ne == columnDtl_stk_lst_cnf_num) doDtl_stk_lst_cnf_num_NE(info);
		else if (ne == columnDtl_stk_lst_limit_num) doDtl_stk_lst_limit_num_NE(info);
		else if (ne == columnDtl_gm_std_upri_typ) doDtl_gm_std_upri_typ_NE(info);
		else if (ne == columnDtl_stk_std_upri_typ) doDtl_stk_std_upri_typ_NE(info);
		else if (ne == columnDtl_early_ship_dt_add_days) doDtl_early_ship_dt_add_days_NE(info);
		else if (ne == columnDtl_ac_slip_digit) doDtl_ac_slip_digit_NE(info);
		else if (ne == columnDtl_ac_slip_seq_flg) doDtl_ac_slip_seq_flg_NE(info);
		else if (ne == columnDtl_sls_bdj_rnd_typ) doDtl_sls_bdj_rnd_typ_NE(info);
		else if (ne == columnDtl_cntry_nm) doDtl_cntry_nm_NE(info);
		else if (ne == columnDtl_area_nm) doDtl_area_nm_NE(info);
		else if (ne == columnDtl_base_cur_nm) doDtl_base_cur_nm_NE(info);
		else if (ne == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NE(info);
		else if (ne == columnDtl_std_cal_nm) doDtl_std_cal_nm_NE(info);
		else if (ne == columnDtl_stk_cl_cal_nm) doDtl_stk_cl_cal_nm_NE(info);
		else if (ne == columnDtl_sls_cl_cal_nm) doDtl_sls_cl_cal_nm_NE(info);
		else if (ne == columnDtl_bill_cl_cal_nm) doDtl_bill_cl_cal_nm_NE(info);
		else if (ne == columnDtl_rcv_cl_cal_nm) doDtl_rcv_cl_cal_nm_NE(info);
		else if (ne == columnDtl_purc_cl_cal_nm) doDtl_purc_cl_cal_nm_NE(info);
		else if (ne == columnDtl_pay_cl_cal_nm) doDtl_pay_cl_cal_nm_NE(info);
		else if (ne == columnDtl_pay_schd_cl_cal_nm) doDtl_pay_schd_cl_cal_nm_NE(info);
		else if (ne == columnDtl_sls_xrate_nm) doDtl_sls_xrate_nm_NE(info);
		else if (ne == columnDtl_purc_xrate_nm) doDtl_purc_xrate_nm_NE(info);
		else if (ne == columnDtl_prov_xrate_nm) doDtl_prov_xrate_nm_NE(info);
		else if (ne == columnDtl_bill_xrate_nm) doDtl_bill_xrate_nm_NE(info);
		else if (ne == columnDtl_pay_xrate_nm) doDtl_pay_xrate_nm_NE(info);
		else if (ne == columnDtl_stk_cl_ba_typ_nm) doDtl_stk_cl_ba_typ_nm_NE(info);
		else if (ne == columnDtl_sls_cl_ba_typ_nm) doDtl_sls_cl_ba_typ_nm_NE(info);
		else if (ne == columnDtl_rcv_cl_ba_typ_nm) doDtl_rcv_cl_ba_typ_nm_NE(info);
		else if (ne == columnDtl_purc_cl_ba_typ_nm) doDtl_purc_cl_ba_typ_nm_NE(info);
		else if (ne == columnDtl_pay_cl_ba_typ_nm) doDtl_pay_cl_ba_typ_nm_NE(info);
		else if (ne == columnDtl_sls_upri_req_typ_nm) doDtl_sls_upri_req_typ_nm_NE(info);
		else if (ne == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NE(info);
		else if (ne == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_NE(info);
		else if (ne == columnDtl_sls_basis_typ_nm) doDtl_sls_basis_typ_nm_NE(info);
		else if (ne == columnDtl_bill_basis_typ_nm) doDtl_bill_basis_typ_nm_NE(info);
		else if (ne == columnDtl_ship_schd_split_typ_nm) doDtl_ship_schd_split_typ_nm_NE(info);
		else if (ne == columnDtl_xfr_stk_mng_typ_nm) doDtl_xfr_stk_mng_typ_nm_NE(info);
		else if (ne == columnDtl_xrate_rnd_typ_nm) doDtl_xrate_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_setoff_tax_rnd_typ_nm) doDtl_setoff_tax_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_com_paid_tax_rnd_typ_nm) doDtl_com_paid_tax_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_wtax_rnd_typ_nm) doDtl_wtax_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_stk_amt_rnd_typ_nm) doDtl_stk_amt_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_sls_bdj_rnd_typ_nm) doDtl_sls_bdj_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_po_print_nm) doDtl_po_print_nm_NE(info);
		else if (ne == columnDtl_gm_std_upri_typ_nm) doDtl_gm_std_upri_typ_nm_NE(info);
		else if (ne == columnDtl_stk_std_upri_typ_nm) doDtl_stk_std_upri_typ_nm_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_rpt_strg_ext_sys_cd) doDtl_rpt_strg_ext_sys_cd_NE(info);
		else if (ne == columnDtl_rpt_strg_ext_sys_nm) doDtl_rpt_strg_ext_sys_nm_NE(info);
		else if (ne == columnDtl_cst_prnt_typ) doDtl_cst_prnt_typ_NE(info);
		else if (ne == columnDtl_cst_prnt_typ_nm) doDtl_cst_prnt_typ_nm_NE(info);
		else if (ne == columnDtl_acst_prnt_typ) doDtl_acst_prnt_typ_NE(info);
		else if (ne == columnDtl_acst_prnt_typ_nm) doDtl_acst_prnt_typ_nm_NE(info);
		else if (ne == columnDtl_bcst_prnt_typ) doDtl_bcst_prnt_typ_NE(info);
		else if (ne == columnDtl_bcst_prnt_typ_nm) doDtl_bcst_prnt_typ_nm_NE(info);
		else if (ne == columnDtl_rcst_prnt_typ) doDtl_rcst_prnt_typ_NE(info);
		else if (ne == columnDtl_rcst_prnt_typ_nm) doDtl_rcst_prnt_typ_nm_NE(info);
		else if (ne == columnDtl_dlv_prnt_typ) doDtl_dlv_prnt_typ_NE(info);
		else if (ne == columnDtl_dlv_prnt_typ_nm) doDtl_dlv_prnt_typ_nm_NE(info);
		else if (ne == columnDtl_sppl_prnt_typ) doDtl_sppl_prnt_typ_NE(info);
		else if (ne == columnDtl_sppl_prnt_typ_nm) doDtl_sppl_prnt_typ_nm_NE(info);
		else if (ne == columnDtl_asppl_prnt_typ) doDtl_asppl_prnt_typ_NE(info);
		else if (ne == columnDtl_asppl_prnt_typ_nm) doDtl_asppl_prnt_typ_nm_NE(info);
		else if (ne == columnDtl_bsppl_prnt_typ) doDtl_bsppl_prnt_typ_NE(info);
		else if (ne == columnDtl_bsppl_prnt_typ_nm) doDtl_bsppl_prnt_typ_nm_NE(info);
		else if (ne == columnDtl_psppl_prnt_typ) doDtl_psppl_prnt_typ_NE(info);
		else if (ne == columnDtl_psppl_prnt_typ_nm) doDtl_psppl_prnt_typ_nm_NE(info);
		else if (ne == columnDtlSub_check) doDtlSub_check_NE(info);
		else if (ne == columnDtlSub_co_cd) doDtlSub_co_cd_NE(info);
		else if (ne == columnDtlSub_sls_tax_cd) doDtlSub_sls_tax_cd_NE(info);
		else if (ne == columnDtlSub_sls_tax_nm) doDtlSub_sls_tax_nm_NE(info);
		else if (ne == columnDtlSub_purc_tax_cd) doDtlSub_purc_tax_cd_NE(info);
		else if (ne == columnDtlSub_purc_tax_nm) doDtlSub_purc_tax_nm_NE(info);
		else if (ne == columnDtlSub_prov_tax_cd) doDtlSub_prov_tax_cd_NE(info);
		else if (ne == columnDtlSub_prov_tax_nm) doDtlSub_prov_tax_nm_NE(info);
		else if (ne == columnDtlSub_memo1) doDtlSub_memo1_NE(info);
		else if (ne == columnDtlSub_memo2) doDtlSub_memo2_NE(info);
		else if (ne == columnDtlSub_memo3) doDtlSub_memo3_NE(info);
		else if (ne == columnDtlSub_ins_usr_id) doDtlSub_ins_usr_id_NE(info);
		else if (ne == columnDtlSub_ins_usr_nm) doDtlSub_ins_usr_nm_NE(info);
		else if (ne == columnDtlSub_ins_ts) doDtlSub_ins_ts_NE(info);
		else if (ne == columnDtlSub_ins_func_id) doDtlSub_ins_func_id_NE(info);
		else if (ne == columnDtlSub_ins_func_nm) doDtlSub_ins_func_nm_NE(info);
		else if (ne == columnDtlSub_upd_cntr) doDtlSub_upd_cntr_NE(info);
		else if (ne == columnDtlSub_upd_usr_id) doDtlSub_upd_usr_id_NE(info);
		else if (ne == columnDtlSub_upd_usr_nm) doDtlSub_upd_usr_nm_NE(info);
		else if (ne == columnDtlSub_upd_ts) doDtlSub_upd_ts_NE(info);
		else if (ne == columnDtlSub_upd_func_id) doDtlSub_upd_func_id_NE(info);
		else if (ne == columnDtlSub_upd_func_nm) doDtlSub_upd_func_nm_NE(info);
		else if (ne == columnDtlSub_upd_srv_req_no) doDtlSub_upd_srv_req_no_NE(info);
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_co_cd) doLcl_co_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_co_alt_nm1) doLcl_co_alt_nm1_NE(info);
		else if (ne == columnLcl_co_alt_nm2) doLcl_co_alt_nm2_NE(info);
		else if (ne == columnLcl_co_alt_nm3) doLcl_co_alt_nm3_NE(info);
		else if (ne == columnLcl_co_alt_nm4) doLcl_co_alt_nm4_NE(info);
		else if (ne == columnLcl_zip_cd) doLcl_zip_cd_NE(info);
		else if (ne == columnLcl_addr1) doLcl_addr1_NE(info);
		else if (ne == columnLcl_addr2) doLcl_addr2_NE(info);
		else if (ne == columnLcl_addr3) doLcl_addr3_NE(info);
		else if (ne == columnLcl_addr4) doLcl_addr4_NE(info);
		else if (ne == columnLcl_tel) doLcl_tel_NE(info);
		else if (ne == columnLcl_fax) doLcl_fax_NE(info);
		else if (ne == columnLcl_co_repl_nm) doLcl_co_repl_nm_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
		else if (ne == columnLcl_ins_usr_id) doLcl_ins_usr_id_NE(info);
		else if (ne == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NE(info);
		else if (ne == columnLcl_ins_ts) doLcl_ins_ts_NE(info);
		else if (ne == columnLcl_ins_func_id) doLcl_ins_func_id_NE(info);
		else if (ne == columnLcl_ins_func_nm) doLcl_ins_func_nm_NE(info);
		else if (ne == columnLcl_upd_cntr) doLcl_upd_cntr_NE(info);
		else if (ne == columnLcl_upd_usr_id) doLcl_upd_usr_id_NE(info);
		else if (ne == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NE(info);
		else if (ne == columnLcl_upd_ts) doLcl_upd_ts_NE(info);
		else if (ne == columnLcl_upd_func_id) doLcl_upd_func_id_NE(info);
		else if (ne == columnLcl_upd_func_nm) doLcl_upd_func_nm_NE(info);
		else if (ne == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Tab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [SubTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSubTab_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tel_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fax_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_repl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_repl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_co_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_co_no_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ein]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ein_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_cl_mon_base]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_cl_mon_base_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[st_mon]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_st_mon_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dt_switch_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dt_switch_time_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ar_no_use_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ar_no_use_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ap_no_use_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ap_no_use_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[temp_ap_use_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_temp_ap_use_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_schd_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_schd_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_conv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_conv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_conv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_conv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon01_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon01_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon02_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon02_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon03_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon03_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon04_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon04_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon05_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon05_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon06_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon06_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon07_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon07_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon08_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon08_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon09_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon09_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon10_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon10_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon11_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon11_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon12_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon12_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_upri_req_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ship_schd_split_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ship_schd_split_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xfr_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xfr_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_bdj_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_bdj_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_upri_req_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_outsrc_upri_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xrate_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xrate_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_setoff_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_setoff_tax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_com_paid_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_com_paid_tax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wtax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wtax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_gm_std_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_gm_std_upri_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_std_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_std_upri_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[po_print_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_po_print_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[po_print_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_po_print_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_lst_cnf_num]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_lst_cnf_num_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_lst_limit_num]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_lst_limit_num_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[early_ship_dt_add_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_early_ship_dt_add_days_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_slip_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_slip_digit_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_slip_seq_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_slip_seq_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rpt_strg_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rpt_strg_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[acst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_acst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[acst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_acst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bcst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bcst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dlv_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dlv_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bsppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bsppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_psppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_psppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_repl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_repl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ein]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ein_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_co_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_co_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_mon]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_mon_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt_switch_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_switch_time_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_cl_mon_base]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_cl_mon_base_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_no_use_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_no_use_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_no_use_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_no_use_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[temp_ap_use_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_temp_ap_use_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_cl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_conv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_conv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_conv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_conv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon01_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon01_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon02_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon02_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon03_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon03_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon04_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon04_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon05_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon05_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon06_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon06_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon07_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon07_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon08_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon08_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon09_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon09_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon10_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon10_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon11_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon11_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon12_xrate_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon12_xrate_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_split_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_com_paid_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_cnf_num]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_cnf_num_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_limit_num]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_limit_num_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gm_std_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_std_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_early_ship_dt_add_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_digit_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_seq_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_seq_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdj_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_cl_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_split_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_tax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_com_paid_tax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdj_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gm_std_upri_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_std_upri_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_strg_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_strg_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[sls_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_sls_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[sls_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_sls_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[purc_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_purc_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[purc_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_purc_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[prov_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_prov_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[prov_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_prov_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo1_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo2_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo3_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_tel_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fax_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_repl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_repl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == TabTab) doTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == SubTabTab) doSubTab_NX(info);
		else if (nx == DtlSubTable) doDtlSub_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_co_cd) doCnd_co_cd_NX(info);
		else if (nx == Cnd_co_nm_lcl) doCnd_co_nm_lcl_NX(info);
		else if (nx == Base_co_cd) doBase_co_cd_NX(info);
		else if (nx == Base_co_alt_nm1) doBase_co_alt_nm1_NX(info);
		else if (nx == Base_co_alt_nm2) doBase_co_alt_nm2_NX(info);
		else if (nx == Base_co_alt_nm3) doBase_co_alt_nm3_NX(info);
		else if (nx == Base_co_alt_nm4) doBase_co_alt_nm4_NX(info);
		else if (nx == Base_cntry_cd) doBase_cntry_cd_NX(info);
		else if (nx == Base_cntry_nm) doBase_cntry_nm_NX(info);
		else if (nx == Base_area_cd) doBase_area_cd_NX(info);
		else if (nx == Base_area_nm) doBase_area_nm_NX(info);
		else if (nx == Base_zip_cd) doBase_zip_cd_NX(info);
		else if (nx == Base_addr1) doBase_addr1_NX(info);
		else if (nx == Base_addr2) doBase_addr2_NX(info);
		else if (nx == Base_addr3) doBase_addr3_NX(info);
		else if (nx == Base_addr4) doBase_addr4_NX(info);
		else if (nx == Base_tel) doBase_tel_NX(info);
		else if (nx == Base_fax) doBase_fax_NX(info);
		else if (nx == Base_co_repl_nm) doBase_co_repl_nm_NX(info);
		else if (nx == Base_biz_co_no) doBase_biz_co_no_NX(info);
		else if (nx == Base_ein) doBase_ein_NX(info);
		else if (nx == Base_std_co_cd) doBase_std_co_cd_NX(info);
		else if (nx == Base_base_cur_cd) doBase_base_cur_cd_NX(info);
		else if (nx == Base_base_cur_nm) doBase_base_cur_nm_NX(info);
		else if (nx == Base_ptax_cur_cd) doBase_ptax_cur_cd_NX(info);
		else if (nx == Base_ptax_cur_nm) doBase_ptax_cur_nm_NX(info);
		else if (nx == Base_ac_cl_day) doBase_ac_cl_day_NX(info);
		else if (nx == Base_ac_cl_mon_base) doBase_ac_cl_mon_base_NX(info);
		else if (nx == Base_st_mon) doBase_st_mon_NX(info);
		else if (nx == Base_dt_switch_time) doBase_dt_switch_time_NX(info);
		else if (nx == Base_std_cal_cd) doBase_std_cal_cd_NX(info);
		else if (nx == Base_std_cal_nm) doBase_std_cal_nm_NX(info);
		else if (nx == Base_ar_no_use_flg) doBase_ar_no_use_flg_NX(info);
		else if (nx == Base_ap_no_use_flg) doBase_ap_no_use_flg_NX(info);
		else if (nx == Base_temp_ap_use_flg) doBase_temp_ap_use_flg_NX(info);
		else if (nx == Base_sls_cl_flg) doBase_sls_cl_flg_NX(info);
		else if (nx == Base_rcv_cl_flg) doBase_rcv_cl_flg_NX(info);
		else if (nx == Base_purc_cl_flg) doBase_purc_cl_flg_NX(info);
		else if (nx == Base_pay_cl_flg) doBase_pay_cl_flg_NX(info);
		else if (nx == Base_sls_cl_cal_cd) doBase_sls_cl_cal_cd_NX(info);
		else if (nx == Base_sls_cl_cal_nm) doBase_sls_cl_cal_nm_NX(info);
		else if (nx == Base_sls_cl_delay_days) doBase_sls_cl_delay_days_NX(info);
		else if (nx == Base_sls_cl_ba_typ) doBase_sls_cl_ba_typ_NX(info);
		else if (nx == Base_sls_cl_ba_typ_nm) doBase_sls_cl_ba_typ_nm_NX(info);
		else if (nx == Base_rcv_cl_cal_cd) doBase_rcv_cl_cal_cd_NX(info);
		else if (nx == Base_rcv_cl_cal_nm) doBase_rcv_cl_cal_nm_NX(info);
		else if (nx == Base_rcv_cl_delay_days) doBase_rcv_cl_delay_days_NX(info);
		else if (nx == Base_rcv_cl_ba_typ) doBase_rcv_cl_ba_typ_NX(info);
		else if (nx == Base_rcv_cl_ba_typ_nm) doBase_rcv_cl_ba_typ_nm_NX(info);
		else if (nx == Base_purc_cl_cal_cd) doBase_purc_cl_cal_cd_NX(info);
		else if (nx == Base_purc_cl_cal_nm) doBase_purc_cl_cal_nm_NX(info);
		else if (nx == Base_purc_cl_delay_days) doBase_purc_cl_delay_days_NX(info);
		else if (nx == Base_purc_cl_ba_typ) doBase_purc_cl_ba_typ_NX(info);
		else if (nx == Base_purc_cl_ba_typ_nm) doBase_purc_cl_ba_typ_nm_NX(info);
		else if (nx == Base_pay_cl_cal_cd) doBase_pay_cl_cal_cd_NX(info);
		else if (nx == Base_pay_cl_cal_nm) doBase_pay_cl_cal_nm_NX(info);
		else if (nx == Base_pay_cl_delay_days) doBase_pay_cl_delay_days_NX(info);
		else if (nx == Base_pay_cl_ba_typ) doBase_pay_cl_ba_typ_NX(info);
		else if (nx == Base_pay_cl_ba_typ_nm) doBase_pay_cl_ba_typ_nm_NX(info);
		else if (nx == Base_stk_cl_cal_cd) doBase_stk_cl_cal_cd_NX(info);
		else if (nx == Base_stk_cl_cal_nm) doBase_stk_cl_cal_nm_NX(info);
		else if (nx == Base_stk_cl_delay_days) doBase_stk_cl_delay_days_NX(info);
		else if (nx == Base_stk_cl_ba_typ) doBase_stk_cl_ba_typ_NX(info);
		else if (nx == Base_stk_cl_ba_typ_nm) doBase_stk_cl_ba_typ_nm_NX(info);
		else if (nx == Base_bill_cl_cal_cd) doBase_bill_cl_cal_cd_NX(info);
		else if (nx == Base_bill_cl_cal_nm) doBase_bill_cl_cal_nm_NX(info);
		else if (nx == Base_pay_schd_cl_cal_cd) doBase_pay_schd_cl_cal_cd_NX(info);
		else if (nx == Base_pay_schd_cl_cal_nm) doBase_pay_schd_cl_cal_nm_NX(info);
		else if (nx == Base_bill_xrate_conv_flg) doBase_bill_xrate_conv_flg_NX(info);
		else if (nx == Base_pay_xrate_conv_flg) doBase_pay_xrate_conv_flg_NX(info);
		else if (nx == Base_sls_xrate_cd) doBase_sls_xrate_cd_NX(info);
		else if (nx == Base_sls_xrate_nm) doBase_sls_xrate_nm_NX(info);
		else if (nx == Base_purc_xrate_cd) doBase_purc_xrate_cd_NX(info);
		else if (nx == Base_purc_xrate_nm) doBase_purc_xrate_nm_NX(info);
		else if (nx == Base_prov_xrate_cd) doBase_prov_xrate_cd_NX(info);
		else if (nx == Base_prov_xrate_nm) doBase_prov_xrate_nm_NX(info);
		else if (nx == Base_bill_xrate_cd) doBase_bill_xrate_cd_NX(info);
		else if (nx == Base_bill_xrate_nm) doBase_bill_xrate_nm_NX(info);
		else if (nx == Base_pay_xrate_cd) doBase_pay_xrate_cd_NX(info);
		else if (nx == Base_pay_xrate_nm) doBase_pay_xrate_nm_NX(info);
		else if (nx == Base_mon01_xrate_rev_flg) doBase_mon01_xrate_rev_flg_NX(info);
		else if (nx == Base_mon02_xrate_rev_flg) doBase_mon02_xrate_rev_flg_NX(info);
		else if (nx == Base_mon03_xrate_rev_flg) doBase_mon03_xrate_rev_flg_NX(info);
		else if (nx == Base_mon04_xrate_rev_flg) doBase_mon04_xrate_rev_flg_NX(info);
		else if (nx == Base_mon05_xrate_rev_flg) doBase_mon05_xrate_rev_flg_NX(info);
		else if (nx == Base_mon06_xrate_rev_flg) doBase_mon06_xrate_rev_flg_NX(info);
		else if (nx == Base_mon07_xrate_rev_flg) doBase_mon07_xrate_rev_flg_NX(info);
		else if (nx == Base_mon08_xrate_rev_flg) doBase_mon08_xrate_rev_flg_NX(info);
		else if (nx == Base_mon09_xrate_rev_flg) doBase_mon09_xrate_rev_flg_NX(info);
		else if (nx == Base_mon10_xrate_rev_flg) doBase_mon10_xrate_rev_flg_NX(info);
		else if (nx == Base_mon11_xrate_rev_flg) doBase_mon11_xrate_rev_flg_NX(info);
		else if (nx == Base_mon12_xrate_rev_flg) doBase_mon12_xrate_rev_flg_NX(info);
		else if (nx == Base_sls_upri_req_typ) doBase_sls_upri_req_typ_NX(info);
		else if (nx == Base_sls_upri_req_typ_nm) doBase_sls_upri_req_typ_nm_NX(info);
		else if (nx == Base_sls_basis_typ) doBase_sls_basis_typ_NX(info);
		else if (nx == Base_sls_basis_typ_nm) doBase_sls_basis_typ_nm_NX(info);
		else if (nx == Base_bill_basis_typ) doBase_bill_basis_typ_NX(info);
		else if (nx == Base_bill_basis_typ_nm) doBase_bill_basis_typ_nm_NX(info);
		else if (nx == Base_ship_schd_split_typ) doBase_ship_schd_split_typ_NX(info);
		else if (nx == Base_ship_schd_split_typ_nm) doBase_ship_schd_split_typ_nm_NX(info);
		else if (nx == Base_xfr_stk_mng_typ) doBase_xfr_stk_mng_typ_NX(info);
		else if (nx == Base_xfr_stk_mng_typ_nm) doBase_xfr_stk_mng_typ_nm_NX(info);
		else if (nx == Base_sls_bdj_rnd_typ) doBase_sls_bdj_rnd_typ_NX(info);
		else if (nx == Base_sls_bdj_rnd_typ_nm) doBase_sls_bdj_rnd_typ_nm_NX(info);
		else if (nx == Base_purc_upri_req_typ) doBase_purc_upri_req_typ_NX(info);
		else if (nx == Base_purc_upri_req_typ_nm) doBase_purc_upri_req_typ_nm_NX(info);
		else if (nx == Base_outsrc_upri_typ) doBase_outsrc_upri_typ_NX(info);
		else if (nx == Base_outsrc_upri_typ_nm) doBase_outsrc_upri_typ_nm_NX(info);
		else if (nx == Base_xrate_rnd_typ) doBase_xrate_rnd_typ_NX(info);
		else if (nx == Base_xrate_rnd_typ_nm) doBase_xrate_rnd_typ_nm_NX(info);
		else if (nx == Base_setoff_tax_rnd_typ) doBase_setoff_tax_rnd_typ_NX(info);
		else if (nx == Base_setoff_tax_rnd_typ_nm) doBase_setoff_tax_rnd_typ_nm_NX(info);
		else if (nx == Base_com_paid_tax_rnd_typ) doBase_com_paid_tax_rnd_typ_NX(info);
		else if (nx == Base_com_paid_tax_rnd_typ_nm) doBase_com_paid_tax_rnd_typ_nm_NX(info);
		else if (nx == Base_wtax_rnd_typ) doBase_wtax_rnd_typ_NX(info);
		else if (nx == Base_wtax_rnd_typ_nm) doBase_wtax_rnd_typ_nm_NX(info);
		else if (nx == Base_gm_std_upri_typ) doBase_gm_std_upri_typ_NX(info);
		else if (nx == Base_gm_std_upri_typ_nm) doBase_gm_std_upri_typ_nm_NX(info);
		else if (nx == Base_stk_std_upri_typ) doBase_stk_std_upri_typ_NX(info);
		else if (nx == Base_stk_std_upri_typ_nm) doBase_stk_std_upri_typ_nm_NX(info);
		else if (nx == Base_stk_amt_rnd_typ) doBase_stk_amt_rnd_typ_NX(info);
		else if (nx == Base_stk_amt_rnd_typ_nm) doBase_stk_amt_rnd_typ_nm_NX(info);
		else if (nx == Base_stk_amt_dec_place) doBase_stk_amt_dec_place_NX(info);
		else if (nx == Base_po_print_cd) doBase_po_print_cd_NX(info);
		else if (nx == Base_po_print_nm) doBase_po_print_nm_NX(info);
		else if (nx == Base_stk_lst_cnf_num) doBase_stk_lst_cnf_num_NX(info);
		else if (nx == Base_stk_lst_limit_num) doBase_stk_lst_limit_num_NX(info);
		else if (nx == Base_early_ship_dt_add_days) doBase_early_ship_dt_add_days_NX(info);
		else if (nx == Base_ac_slip_digit) doBase_ac_slip_digit_NX(info);
		else if (nx == Base_ac_slip_seq_flg) doBase_ac_slip_seq_flg_NX(info);
		else if (nx == Base_rpt_strg_ext_sys_cd) doBase_rpt_strg_ext_sys_cd_NX(info);
		else if (nx == Base_rpt_strg_ext_sys_nm) doBase_rpt_strg_ext_sys_nm_NX(info);
		else if (nx == Base_cst_prnt_typ) doBase_cst_prnt_typ_NX(info);
		else if (nx == Base_cst_prnt_typ_nm) doBase_cst_prnt_typ_nm_NX(info);
		else if (nx == Base_acst_prnt_typ) doBase_acst_prnt_typ_NX(info);
		else if (nx == Base_acst_prnt_typ_nm) doBase_acst_prnt_typ_nm_NX(info);
		else if (nx == Base_bcst_prnt_typ) doBase_bcst_prnt_typ_NX(info);
		else if (nx == Base_bcst_prnt_typ_nm) doBase_bcst_prnt_typ_nm_NX(info);
		else if (nx == Base_rcst_prnt_typ) doBase_rcst_prnt_typ_NX(info);
		else if (nx == Base_rcst_prnt_typ_nm) doBase_rcst_prnt_typ_nm_NX(info);
		else if (nx == Base_dlv_prnt_typ) doBase_dlv_prnt_typ_NX(info);
		else if (nx == Base_dlv_prnt_typ_nm) doBase_dlv_prnt_typ_nm_NX(info);
		else if (nx == Base_sppl_prnt_typ) doBase_sppl_prnt_typ_NX(info);
		else if (nx == Base_sppl_prnt_typ_nm) doBase_sppl_prnt_typ_nm_NX(info);
		else if (nx == Base_asppl_prnt_typ) doBase_asppl_prnt_typ_NX(info);
		else if (nx == Base_asppl_prnt_typ_nm) doBase_asppl_prnt_typ_nm_NX(info);
		else if (nx == Base_bsppl_prnt_typ) doBase_bsppl_prnt_typ_NX(info);
		else if (nx == Base_bsppl_prnt_typ_nm) doBase_bsppl_prnt_typ_nm_NX(info);
		else if (nx == Base_psppl_prnt_typ) doBase_psppl_prnt_typ_NX(info);
		else if (nx == Base_psppl_prnt_typ_nm) doBase_psppl_prnt_typ_nm_NX(info);
		else if (nx == Base_ins_usr_id) doBase_ins_usr_id_NX(info);
		else if (nx == Base_ins_usr_nm) doBase_ins_usr_nm_NX(info);
		else if (nx == Base_ins_func_id) doBase_ins_func_id_NX(info);
		else if (nx == Base_ins_func_nm) doBase_ins_func_nm_NX(info);
		else if (nx == Base_upd_usr_id) doBase_upd_usr_id_NX(info);
		else if (nx == Base_upd_usr_nm) doBase_upd_usr_nm_NX(info);
		else if (nx == Base_upd_func_id) doBase_upd_func_id_NX(info);
		else if (nx == Base_upd_func_nm) doBase_upd_func_nm_NX(info);
		else if (nx == Base_ins_ts) doBase_ins_ts_NX(info);
		else if (nx == Base_upd_ts) doBase_upd_ts_NX(info);
		else if (nx == Base_upd_srv_req_no) doBase_upd_srv_req_no_NX(info);
		else if (nx == Base_upd_cntr) doBase_upd_cntr_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_co_cd) doDtl_co_cd_NX(info);
		else if (nx == columnDtl_co_alt_nm1) doDtl_co_alt_nm1_NX(info);
		else if (nx == columnDtl_co_alt_nm2) doDtl_co_alt_nm2_NX(info);
		else if (nx == columnDtl_co_alt_nm3) doDtl_co_alt_nm3_NX(info);
		else if (nx == columnDtl_co_alt_nm4) doDtl_co_alt_nm4_NX(info);
		else if (nx == columnDtl_zip_cd) doDtl_zip_cd_NX(info);
		else if (nx == columnDtl_addr1) doDtl_addr1_NX(info);
		else if (nx == columnDtl_addr2) doDtl_addr2_NX(info);
		else if (nx == columnDtl_addr3) doDtl_addr3_NX(info);
		else if (nx == columnDtl_addr4) doDtl_addr4_NX(info);
		else if (nx == columnDtl_tel) doDtl_tel_NX(info);
		else if (nx == columnDtl_fax) doDtl_fax_NX(info);
		else if (nx == columnDtl_co_repl_nm) doDtl_co_repl_nm_NX(info);
		else if (nx == columnDtl_ein) doDtl_ein_NX(info);
		else if (nx == columnDtl_biz_co_no) doDtl_biz_co_no_NX(info);
		else if (nx == columnDtl_std_co_cd) doDtl_std_co_cd_NX(info);
		else if (nx == columnDtl_cntry_cd) doDtl_cntry_cd_NX(info);
		else if (nx == columnDtl_area_cd) doDtl_area_cd_NX(info);
		else if (nx == columnDtl_base_cur_cd) doDtl_base_cur_cd_NX(info);
		else if (nx == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NX(info);
		else if (nx == columnDtl_st_mon) doDtl_st_mon_NX(info);
		else if (nx == columnDtl_dt_switch_time) doDtl_dt_switch_time_NX(info);
		else if (nx == columnDtl_ac_cl_day) doDtl_ac_cl_day_NX(info);
		else if (nx == columnDtl_ac_cl_mon_base) doDtl_ac_cl_mon_base_NX(info);
		else if (nx == columnDtl_std_cal_cd) doDtl_std_cal_cd_NX(info);
		else if (nx == columnDtl_bill_cl_cal_cd) doDtl_bill_cl_cal_cd_NX(info);
		else if (nx == columnDtl_ar_no_use_flg) doDtl_ar_no_use_flg_NX(info);
		else if (nx == columnDtl_ap_no_use_flg) doDtl_ap_no_use_flg_NX(info);
		else if (nx == columnDtl_temp_ap_use_flg) doDtl_temp_ap_use_flg_NX(info);
		else if (nx == columnDtl_sls_cl_flg) doDtl_sls_cl_flg_NX(info);
		else if (nx == columnDtl_rcv_cl_flg) doDtl_rcv_cl_flg_NX(info);
		else if (nx == columnDtl_purc_cl_flg) doDtl_purc_cl_flg_NX(info);
		else if (nx == columnDtl_pay_cl_flg) doDtl_pay_cl_flg_NX(info);
		else if (nx == columnDtl_stk_cl_cal_cd) doDtl_stk_cl_cal_cd_NX(info);
		else if (nx == columnDtl_sls_cl_cal_cd) doDtl_sls_cl_cal_cd_NX(info);
		else if (nx == columnDtl_rcv_cl_cal_cd) doDtl_rcv_cl_cal_cd_NX(info);
		else if (nx == columnDtl_purc_cl_cal_cd) doDtl_purc_cl_cal_cd_NX(info);
		else if (nx == columnDtl_pay_cl_cal_cd) doDtl_pay_cl_cal_cd_NX(info);
		else if (nx == columnDtl_pay_schd_cl_cal_cd) doDtl_pay_schd_cl_cal_cd_NX(info);
		else if (nx == columnDtl_stk_cl_delay_days) doDtl_stk_cl_delay_days_NX(info);
		else if (nx == columnDtl_stk_cl_ba_typ) doDtl_stk_cl_ba_typ_NX(info);
		else if (nx == columnDtl_sls_cl_delay_days) doDtl_sls_cl_delay_days_NX(info);
		else if (nx == columnDtl_sls_cl_ba_typ) doDtl_sls_cl_ba_typ_NX(info);
		else if (nx == columnDtl_rcv_cl_delay_days) doDtl_rcv_cl_delay_days_NX(info);
		else if (nx == columnDtl_rcv_cl_ba_typ) doDtl_rcv_cl_ba_typ_NX(info);
		else if (nx == columnDtl_purc_cl_delay_days) doDtl_purc_cl_delay_days_NX(info);
		else if (nx == columnDtl_purc_cl_ba_typ) doDtl_purc_cl_ba_typ_NX(info);
		else if (nx == columnDtl_pay_cl_delay_days) doDtl_pay_cl_delay_days_NX(info);
		else if (nx == columnDtl_pay_cl_ba_typ) doDtl_pay_cl_ba_typ_NX(info);
		else if (nx == columnDtl_bill_xrate_conv_flg) doDtl_bill_xrate_conv_flg_NX(info);
		else if (nx == columnDtl_pay_xrate_conv_flg) doDtl_pay_xrate_conv_flg_NX(info);
		else if (nx == columnDtl_sls_xrate_cd) doDtl_sls_xrate_cd_NX(info);
		else if (nx == columnDtl_purc_xrate_cd) doDtl_purc_xrate_cd_NX(info);
		else if (nx == columnDtl_prov_xrate_cd) doDtl_prov_xrate_cd_NX(info);
		else if (nx == columnDtl_bill_xrate_cd) doDtl_bill_xrate_cd_NX(info);
		else if (nx == columnDtl_pay_xrate_cd) doDtl_pay_xrate_cd_NX(info);
		else if (nx == columnDtl_mon01_xrate_rev_flg) doDtl_mon01_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon02_xrate_rev_flg) doDtl_mon02_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon03_xrate_rev_flg) doDtl_mon03_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon04_xrate_rev_flg) doDtl_mon04_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon05_xrate_rev_flg) doDtl_mon05_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon06_xrate_rev_flg) doDtl_mon06_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon07_xrate_rev_flg) doDtl_mon07_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon08_xrate_rev_flg) doDtl_mon08_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon09_xrate_rev_flg) doDtl_mon09_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon10_xrate_rev_flg) doDtl_mon10_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon11_xrate_rev_flg) doDtl_mon11_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_mon12_xrate_rev_flg) doDtl_mon12_xrate_rev_flg_NX(info);
		else if (nx == columnDtl_sls_upri_req_typ) doDtl_sls_upri_req_typ_NX(info);
		else if (nx == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NX(info);
		else if (nx == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NX(info);
		else if (nx == columnDtl_sls_basis_typ) doDtl_sls_basis_typ_NX(info);
		else if (nx == columnDtl_bill_basis_typ) doDtl_bill_basis_typ_NX(info);
		else if (nx == columnDtl_ship_schd_split_typ) doDtl_ship_schd_split_typ_NX(info);
		else if (nx == columnDtl_xfr_stk_mng_typ) doDtl_xfr_stk_mng_typ_NX(info);
		else if (nx == columnDtl_setoff_tax_rnd_typ) doDtl_setoff_tax_rnd_typ_NX(info);
		else if (nx == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_NX(info);
		else if (nx == columnDtl_com_paid_tax_rnd_typ) doDtl_com_paid_tax_rnd_typ_NX(info);
		else if (nx == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NX(info);
		else if (nx == columnDtl_stk_amt_rnd_typ) doDtl_stk_amt_rnd_typ_NX(info);
		else if (nx == columnDtl_stk_amt_dec_place) doDtl_stk_amt_dec_place_NX(info);
		else if (nx == columnDtl_po_print_cd) doDtl_po_print_cd_NX(info);
		else if (nx == columnDtl_stk_lst_cnf_num) doDtl_stk_lst_cnf_num_NX(info);
		else if (nx == columnDtl_stk_lst_limit_num) doDtl_stk_lst_limit_num_NX(info);
		else if (nx == columnDtl_gm_std_upri_typ) doDtl_gm_std_upri_typ_NX(info);
		else if (nx == columnDtl_stk_std_upri_typ) doDtl_stk_std_upri_typ_NX(info);
		else if (nx == columnDtl_early_ship_dt_add_days) doDtl_early_ship_dt_add_days_NX(info);
		else if (nx == columnDtl_ac_slip_digit) doDtl_ac_slip_digit_NX(info);
		else if (nx == columnDtl_ac_slip_seq_flg) doDtl_ac_slip_seq_flg_NX(info);
		else if (nx == columnDtl_sls_bdj_rnd_typ) doDtl_sls_bdj_rnd_typ_NX(info);
		else if (nx == columnDtl_cntry_nm) doDtl_cntry_nm_NX(info);
		else if (nx == columnDtl_area_nm) doDtl_area_nm_NX(info);
		else if (nx == columnDtl_base_cur_nm) doDtl_base_cur_nm_NX(info);
		else if (nx == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NX(info);
		else if (nx == columnDtl_std_cal_nm) doDtl_std_cal_nm_NX(info);
		else if (nx == columnDtl_stk_cl_cal_nm) doDtl_stk_cl_cal_nm_NX(info);
		else if (nx == columnDtl_sls_cl_cal_nm) doDtl_sls_cl_cal_nm_NX(info);
		else if (nx == columnDtl_bill_cl_cal_nm) doDtl_bill_cl_cal_nm_NX(info);
		else if (nx == columnDtl_rcv_cl_cal_nm) doDtl_rcv_cl_cal_nm_NX(info);
		else if (nx == columnDtl_purc_cl_cal_nm) doDtl_purc_cl_cal_nm_NX(info);
		else if (nx == columnDtl_pay_cl_cal_nm) doDtl_pay_cl_cal_nm_NX(info);
		else if (nx == columnDtl_pay_schd_cl_cal_nm) doDtl_pay_schd_cl_cal_nm_NX(info);
		else if (nx == columnDtl_sls_xrate_nm) doDtl_sls_xrate_nm_NX(info);
		else if (nx == columnDtl_purc_xrate_nm) doDtl_purc_xrate_nm_NX(info);
		else if (nx == columnDtl_prov_xrate_nm) doDtl_prov_xrate_nm_NX(info);
		else if (nx == columnDtl_bill_xrate_nm) doDtl_bill_xrate_nm_NX(info);
		else if (nx == columnDtl_pay_xrate_nm) doDtl_pay_xrate_nm_NX(info);
		else if (nx == columnDtl_stk_cl_ba_typ_nm) doDtl_stk_cl_ba_typ_nm_NX(info);
		else if (nx == columnDtl_sls_cl_ba_typ_nm) doDtl_sls_cl_ba_typ_nm_NX(info);
		else if (nx == columnDtl_rcv_cl_ba_typ_nm) doDtl_rcv_cl_ba_typ_nm_NX(info);
		else if (nx == columnDtl_purc_cl_ba_typ_nm) doDtl_purc_cl_ba_typ_nm_NX(info);
		else if (nx == columnDtl_pay_cl_ba_typ_nm) doDtl_pay_cl_ba_typ_nm_NX(info);
		else if (nx == columnDtl_sls_upri_req_typ_nm) doDtl_sls_upri_req_typ_nm_NX(info);
		else if (nx == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NX(info);
		else if (nx == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_NX(info);
		else if (nx == columnDtl_sls_basis_typ_nm) doDtl_sls_basis_typ_nm_NX(info);
		else if (nx == columnDtl_bill_basis_typ_nm) doDtl_bill_basis_typ_nm_NX(info);
		else if (nx == columnDtl_ship_schd_split_typ_nm) doDtl_ship_schd_split_typ_nm_NX(info);
		else if (nx == columnDtl_xfr_stk_mng_typ_nm) doDtl_xfr_stk_mng_typ_nm_NX(info);
		else if (nx == columnDtl_xrate_rnd_typ_nm) doDtl_xrate_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_setoff_tax_rnd_typ_nm) doDtl_setoff_tax_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_com_paid_tax_rnd_typ_nm) doDtl_com_paid_tax_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_wtax_rnd_typ_nm) doDtl_wtax_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_stk_amt_rnd_typ_nm) doDtl_stk_amt_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_sls_bdj_rnd_typ_nm) doDtl_sls_bdj_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_po_print_nm) doDtl_po_print_nm_NX(info);
		else if (nx == columnDtl_gm_std_upri_typ_nm) doDtl_gm_std_upri_typ_nm_NX(info);
		else if (nx == columnDtl_stk_std_upri_typ_nm) doDtl_stk_std_upri_typ_nm_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_rpt_strg_ext_sys_cd) doDtl_rpt_strg_ext_sys_cd_NX(info);
		else if (nx == columnDtl_rpt_strg_ext_sys_nm) doDtl_rpt_strg_ext_sys_nm_NX(info);
		else if (nx == columnDtl_cst_prnt_typ) doDtl_cst_prnt_typ_NX(info);
		else if (nx == columnDtl_cst_prnt_typ_nm) doDtl_cst_prnt_typ_nm_NX(info);
		else if (nx == columnDtl_acst_prnt_typ) doDtl_acst_prnt_typ_NX(info);
		else if (nx == columnDtl_acst_prnt_typ_nm) doDtl_acst_prnt_typ_nm_NX(info);
		else if (nx == columnDtl_bcst_prnt_typ) doDtl_bcst_prnt_typ_NX(info);
		else if (nx == columnDtl_bcst_prnt_typ_nm) doDtl_bcst_prnt_typ_nm_NX(info);
		else if (nx == columnDtl_rcst_prnt_typ) doDtl_rcst_prnt_typ_NX(info);
		else if (nx == columnDtl_rcst_prnt_typ_nm) doDtl_rcst_prnt_typ_nm_NX(info);
		else if (nx == columnDtl_dlv_prnt_typ) doDtl_dlv_prnt_typ_NX(info);
		else if (nx == columnDtl_dlv_prnt_typ_nm) doDtl_dlv_prnt_typ_nm_NX(info);
		else if (nx == columnDtl_sppl_prnt_typ) doDtl_sppl_prnt_typ_NX(info);
		else if (nx == columnDtl_sppl_prnt_typ_nm) doDtl_sppl_prnt_typ_nm_NX(info);
		else if (nx == columnDtl_asppl_prnt_typ) doDtl_asppl_prnt_typ_NX(info);
		else if (nx == columnDtl_asppl_prnt_typ_nm) doDtl_asppl_prnt_typ_nm_NX(info);
		else if (nx == columnDtl_bsppl_prnt_typ) doDtl_bsppl_prnt_typ_NX(info);
		else if (nx == columnDtl_bsppl_prnt_typ_nm) doDtl_bsppl_prnt_typ_nm_NX(info);
		else if (nx == columnDtl_psppl_prnt_typ) doDtl_psppl_prnt_typ_NX(info);
		else if (nx == columnDtl_psppl_prnt_typ_nm) doDtl_psppl_prnt_typ_nm_NX(info);
		else if (nx == columnDtlSub_check) doDtlSub_check_NX(info);
		else if (nx == columnDtlSub_co_cd) doDtlSub_co_cd_NX(info);
		else if (nx == columnDtlSub_sls_tax_cd) doDtlSub_sls_tax_cd_NX(info);
		else if (nx == columnDtlSub_sls_tax_nm) doDtlSub_sls_tax_nm_NX(info);
		else if (nx == columnDtlSub_purc_tax_cd) doDtlSub_purc_tax_cd_NX(info);
		else if (nx == columnDtlSub_purc_tax_nm) doDtlSub_purc_tax_nm_NX(info);
		else if (nx == columnDtlSub_prov_tax_cd) doDtlSub_prov_tax_cd_NX(info);
		else if (nx == columnDtlSub_prov_tax_nm) doDtlSub_prov_tax_nm_NX(info);
		else if (nx == columnDtlSub_memo1) doDtlSub_memo1_NX(info);
		else if (nx == columnDtlSub_memo2) doDtlSub_memo2_NX(info);
		else if (nx == columnDtlSub_memo3) doDtlSub_memo3_NX(info);
		else if (nx == columnDtlSub_ins_usr_id) doDtlSub_ins_usr_id_NX(info);
		else if (nx == columnDtlSub_ins_usr_nm) doDtlSub_ins_usr_nm_NX(info);
		else if (nx == columnDtlSub_ins_ts) doDtlSub_ins_ts_NX(info);
		else if (nx == columnDtlSub_ins_func_id) doDtlSub_ins_func_id_NX(info);
		else if (nx == columnDtlSub_ins_func_nm) doDtlSub_ins_func_nm_NX(info);
		else if (nx == columnDtlSub_upd_cntr) doDtlSub_upd_cntr_NX(info);
		else if (nx == columnDtlSub_upd_usr_id) doDtlSub_upd_usr_id_NX(info);
		else if (nx == columnDtlSub_upd_usr_nm) doDtlSub_upd_usr_nm_NX(info);
		else if (nx == columnDtlSub_upd_ts) doDtlSub_upd_ts_NX(info);
		else if (nx == columnDtlSub_upd_func_id) doDtlSub_upd_func_id_NX(info);
		else if (nx == columnDtlSub_upd_func_nm) doDtlSub_upd_func_nm_NX(info);
		else if (nx == columnDtlSub_upd_srv_req_no) doDtlSub_upd_srv_req_no_NX(info);
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_co_cd) doLcl_co_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_co_alt_nm1) doLcl_co_alt_nm1_NX(info);
		else if (nx == columnLcl_co_alt_nm2) doLcl_co_alt_nm2_NX(info);
		else if (nx == columnLcl_co_alt_nm3) doLcl_co_alt_nm3_NX(info);
		else if (nx == columnLcl_co_alt_nm4) doLcl_co_alt_nm4_NX(info);
		else if (nx == columnLcl_zip_cd) doLcl_zip_cd_NX(info);
		else if (nx == columnLcl_addr1) doLcl_addr1_NX(info);
		else if (nx == columnLcl_addr2) doLcl_addr2_NX(info);
		else if (nx == columnLcl_addr3) doLcl_addr3_NX(info);
		else if (nx == columnLcl_addr4) doLcl_addr4_NX(info);
		else if (nx == columnLcl_tel) doLcl_tel_NX(info);
		else if (nx == columnLcl_fax) doLcl_fax_NX(info);
		else if (nx == columnLcl_co_repl_nm) doLcl_co_repl_nm_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
		else if (nx == columnLcl_ins_usr_id) doLcl_ins_usr_id_NX(info);
		else if (nx == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NX(info);
		else if (nx == columnLcl_ins_ts) doLcl_ins_ts_NX(info);
		else if (nx == columnLcl_ins_func_id) doLcl_ins_func_id_NX(info);
		else if (nx == columnLcl_ins_func_nm) doLcl_ins_func_nm_NX(info);
		else if (nx == columnLcl_upd_cntr) doLcl_upd_cntr_NX(info);
		else if (nx == columnLcl_upd_usr_id) doLcl_upd_usr_id_NX(info);
		else if (nx == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NX(info);
		else if (nx == columnLcl_upd_ts) doLcl_upd_ts_NX(info);
		else if (nx == columnLcl_upd_func_id) doLcl_upd_func_id_NX(info);
		else if (nx == columnLcl_upd_func_nm) doLcl_upd_func_nm_NX(info);
		else if (nx == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Tab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [SubTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSubTab_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tel_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fax_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_repl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_repl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_co_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_co_no_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ein]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ein_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_cl_mon_base]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_cl_mon_base_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[st_mon]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_st_mon_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dt_switch_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dt_switch_time_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ar_no_use_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ar_no_use_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ap_no_use_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ap_no_use_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[temp_ap_use_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_temp_ap_use_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_schd_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_schd_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_conv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_conv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_conv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_conv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon01_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon01_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon02_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon02_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon03_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon03_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon04_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon04_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon05_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon05_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon06_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon06_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon07_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon07_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon08_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon08_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon09_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon09_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon10_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon10_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon11_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon11_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mon12_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mon12_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_upri_req_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ship_schd_split_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ship_schd_split_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xfr_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xfr_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_bdj_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_bdj_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_upri_req_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_outsrc_upri_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xrate_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xrate_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_setoff_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_setoff_tax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_com_paid_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_com_paid_tax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wtax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wtax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_gm_std_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_gm_std_upri_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_std_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_std_upri_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[po_print_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_po_print_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[po_print_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_po_print_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_lst_cnf_num]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_lst_cnf_num_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_lst_limit_num]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_lst_limit_num_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[early_ship_dt_add_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_early_ship_dt_add_days_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_slip_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_slip_digit_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_slip_seq_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_slip_seq_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rpt_strg_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rpt_strg_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[acst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_acst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[acst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_acst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bcst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bcst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dlv_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dlv_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bsppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bsppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_psppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_psppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_repl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_repl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ein]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ein_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_co_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_co_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_mon]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_mon_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt_switch_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_switch_time_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_cl_mon_base]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_cl_mon_base_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_no_use_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_no_use_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_no_use_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_no_use_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[temp_ap_use_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_temp_ap_use_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_cl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_conv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_conv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_conv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_conv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon01_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon01_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon02_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon02_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon03_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon03_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon04_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon04_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon05_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon05_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon06_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon06_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon07_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon07_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon08_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon08_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon09_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon09_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon10_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon10_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon11_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon11_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon12_xrate_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon12_xrate_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_split_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_com_paid_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_cnf_num]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_cnf_num_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_limit_num]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_limit_num_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gm_std_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_std_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_early_ship_dt_add_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_digit_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_seq_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_seq_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdj_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_cl_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_split_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_tax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_com_paid_tax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdj_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gm_std_upri_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_std_upri_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_strg_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_strg_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[sls_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_sls_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[sls_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_sls_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[purc_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_purc_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[purc_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_purc_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[prov_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_prov_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[prov_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_prov_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo1_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo2_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo3_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_tel_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fax_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_repl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_repl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_co_cd) doCnd_co_cd_LC(info);
		else if (lc == Cnd_co_nm_lcl) doCnd_co_nm_lcl_LC(info);
		else if (lc == Base_co_cd) doBase_co_cd_LC(info);
		else if (lc == Base_co_alt_nm1) doBase_co_alt_nm1_LC(info);
		else if (lc == Base_co_alt_nm2) doBase_co_alt_nm2_LC(info);
		else if (lc == Base_co_alt_nm3) doBase_co_alt_nm3_LC(info);
		else if (lc == Base_co_alt_nm4) doBase_co_alt_nm4_LC(info);
		else if (lc == Base_cntry_cd) doBase_cntry_cd_LC(info);
		else if (lc == Base_cntry_nm) doBase_cntry_nm_LC(info);
		else if (lc == Base_area_cd) doBase_area_cd_LC(info);
		else if (lc == Base_area_nm) doBase_area_nm_LC(info);
		else if (lc == Base_zip_cd) doBase_zip_cd_LC(info);
		else if (lc == Base_addr1) doBase_addr1_LC(info);
		else if (lc == Base_addr2) doBase_addr2_LC(info);
		else if (lc == Base_addr3) doBase_addr3_LC(info);
		else if (lc == Base_addr4) doBase_addr4_LC(info);
		else if (lc == Base_tel) doBase_tel_LC(info);
		else if (lc == Base_fax) doBase_fax_LC(info);
		else if (lc == Base_co_repl_nm) doBase_co_repl_nm_LC(info);
		else if (lc == Base_biz_co_no) doBase_biz_co_no_LC(info);
		else if (lc == Base_ein) doBase_ein_LC(info);
		else if (lc == Base_std_co_cd) doBase_std_co_cd_LC(info);
		else if (lc == Base_base_cur_cd) doBase_base_cur_cd_LC(info);
		else if (lc == Base_base_cur_nm) doBase_base_cur_nm_LC(info);
		else if (lc == Base_ptax_cur_cd) doBase_ptax_cur_cd_LC(info);
		else if (lc == Base_ptax_cur_nm) doBase_ptax_cur_nm_LC(info);
		else if (lc == Base_ac_cl_day) doBase_ac_cl_day_LC(info);
		else if (lc == Base_ac_cl_mon_base) doBase_ac_cl_mon_base_LC(info);
		else if (lc == Base_st_mon) doBase_st_mon_LC(info);
		else if (lc == Base_dt_switch_time) doBase_dt_switch_time_LC(info);
		else if (lc == Base_std_cal_cd) doBase_std_cal_cd_LC(info);
		else if (lc == Base_std_cal_nm) doBase_std_cal_nm_LC(info);
		else if (lc == Base_sls_cl_cal_cd) doBase_sls_cl_cal_cd_LC(info);
		else if (lc == Base_sls_cl_cal_nm) doBase_sls_cl_cal_nm_LC(info);
		else if (lc == Base_sls_cl_delay_days) doBase_sls_cl_delay_days_LC(info);
		else if (lc == Base_sls_cl_ba_typ) doBase_sls_cl_ba_typ_LC(info);
		else if (lc == Base_sls_cl_ba_typ_nm) doBase_sls_cl_ba_typ_nm_LC(info);
		else if (lc == Base_rcv_cl_cal_cd) doBase_rcv_cl_cal_cd_LC(info);
		else if (lc == Base_rcv_cl_cal_nm) doBase_rcv_cl_cal_nm_LC(info);
		else if (lc == Base_rcv_cl_delay_days) doBase_rcv_cl_delay_days_LC(info);
		else if (lc == Base_rcv_cl_ba_typ) doBase_rcv_cl_ba_typ_LC(info);
		else if (lc == Base_rcv_cl_ba_typ_nm) doBase_rcv_cl_ba_typ_nm_LC(info);
		else if (lc == Base_purc_cl_cal_cd) doBase_purc_cl_cal_cd_LC(info);
		else if (lc == Base_purc_cl_cal_nm) doBase_purc_cl_cal_nm_LC(info);
		else if (lc == Base_purc_cl_delay_days) doBase_purc_cl_delay_days_LC(info);
		else if (lc == Base_purc_cl_ba_typ) doBase_purc_cl_ba_typ_LC(info);
		else if (lc == Base_purc_cl_ba_typ_nm) doBase_purc_cl_ba_typ_nm_LC(info);
		else if (lc == Base_pay_cl_cal_cd) doBase_pay_cl_cal_cd_LC(info);
		else if (lc == Base_pay_cl_cal_nm) doBase_pay_cl_cal_nm_LC(info);
		else if (lc == Base_pay_cl_delay_days) doBase_pay_cl_delay_days_LC(info);
		else if (lc == Base_pay_cl_ba_typ) doBase_pay_cl_ba_typ_LC(info);
		else if (lc == Base_pay_cl_ba_typ_nm) doBase_pay_cl_ba_typ_nm_LC(info);
		else if (lc == Base_stk_cl_cal_cd) doBase_stk_cl_cal_cd_LC(info);
		else if (lc == Base_stk_cl_cal_nm) doBase_stk_cl_cal_nm_LC(info);
		else if (lc == Base_stk_cl_delay_days) doBase_stk_cl_delay_days_LC(info);
		else if (lc == Base_stk_cl_ba_typ) doBase_stk_cl_ba_typ_LC(info);
		else if (lc == Base_stk_cl_ba_typ_nm) doBase_stk_cl_ba_typ_nm_LC(info);
		else if (lc == Base_bill_cl_cal_cd) doBase_bill_cl_cal_cd_LC(info);
		else if (lc == Base_bill_cl_cal_nm) doBase_bill_cl_cal_nm_LC(info);
		else if (lc == Base_pay_schd_cl_cal_cd) doBase_pay_schd_cl_cal_cd_LC(info);
		else if (lc == Base_pay_schd_cl_cal_nm) doBase_pay_schd_cl_cal_nm_LC(info);
		else if (lc == Base_sls_xrate_cd) doBase_sls_xrate_cd_LC(info);
		else if (lc == Base_sls_xrate_nm) doBase_sls_xrate_nm_LC(info);
		else if (lc == Base_purc_xrate_cd) doBase_purc_xrate_cd_LC(info);
		else if (lc == Base_purc_xrate_nm) doBase_purc_xrate_nm_LC(info);
		else if (lc == Base_prov_xrate_cd) doBase_prov_xrate_cd_LC(info);
		else if (lc == Base_prov_xrate_nm) doBase_prov_xrate_nm_LC(info);
		else if (lc == Base_bill_xrate_cd) doBase_bill_xrate_cd_LC(info);
		else if (lc == Base_bill_xrate_nm) doBase_bill_xrate_nm_LC(info);
		else if (lc == Base_pay_xrate_cd) doBase_pay_xrate_cd_LC(info);
		else if (lc == Base_pay_xrate_nm) doBase_pay_xrate_nm_LC(info);
		else if (lc == Base_sls_upri_req_typ) doBase_sls_upri_req_typ_LC(info);
		else if (lc == Base_sls_upri_req_typ_nm) doBase_sls_upri_req_typ_nm_LC(info);
		else if (lc == Base_sls_basis_typ) doBase_sls_basis_typ_LC(info);
		else if (lc == Base_sls_basis_typ_nm) doBase_sls_basis_typ_nm_LC(info);
		else if (lc == Base_bill_basis_typ) doBase_bill_basis_typ_LC(info);
		else if (lc == Base_bill_basis_typ_nm) doBase_bill_basis_typ_nm_LC(info);
		else if (lc == Base_ship_schd_split_typ) doBase_ship_schd_split_typ_LC(info);
		else if (lc == Base_ship_schd_split_typ_nm) doBase_ship_schd_split_typ_nm_LC(info);
		else if (lc == Base_xfr_stk_mng_typ) doBase_xfr_stk_mng_typ_LC(info);
		else if (lc == Base_xfr_stk_mng_typ_nm) doBase_xfr_stk_mng_typ_nm_LC(info);
		else if (lc == Base_sls_bdj_rnd_typ) doBase_sls_bdj_rnd_typ_LC(info);
		else if (lc == Base_sls_bdj_rnd_typ_nm) doBase_sls_bdj_rnd_typ_nm_LC(info);
		else if (lc == Base_purc_upri_req_typ) doBase_purc_upri_req_typ_LC(info);
		else if (lc == Base_purc_upri_req_typ_nm) doBase_purc_upri_req_typ_nm_LC(info);
		else if (lc == Base_outsrc_upri_typ) doBase_outsrc_upri_typ_LC(info);
		else if (lc == Base_outsrc_upri_typ_nm) doBase_outsrc_upri_typ_nm_LC(info);
		else if (lc == Base_xrate_rnd_typ) doBase_xrate_rnd_typ_LC(info);
		else if (lc == Base_xrate_rnd_typ_nm) doBase_xrate_rnd_typ_nm_LC(info);
		else if (lc == Base_setoff_tax_rnd_typ) doBase_setoff_tax_rnd_typ_LC(info);
		else if (lc == Base_setoff_tax_rnd_typ_nm) doBase_setoff_tax_rnd_typ_nm_LC(info);
		else if (lc == Base_com_paid_tax_rnd_typ) doBase_com_paid_tax_rnd_typ_LC(info);
		else if (lc == Base_com_paid_tax_rnd_typ_nm) doBase_com_paid_tax_rnd_typ_nm_LC(info);
		else if (lc == Base_wtax_rnd_typ) doBase_wtax_rnd_typ_LC(info);
		else if (lc == Base_wtax_rnd_typ_nm) doBase_wtax_rnd_typ_nm_LC(info);
		else if (lc == Base_gm_std_upri_typ) doBase_gm_std_upri_typ_LC(info);
		else if (lc == Base_gm_std_upri_typ_nm) doBase_gm_std_upri_typ_nm_LC(info);
		else if (lc == Base_stk_std_upri_typ) doBase_stk_std_upri_typ_LC(info);
		else if (lc == Base_stk_std_upri_typ_nm) doBase_stk_std_upri_typ_nm_LC(info);
		else if (lc == Base_stk_amt_rnd_typ) doBase_stk_amt_rnd_typ_LC(info);
		else if (lc == Base_stk_amt_rnd_typ_nm) doBase_stk_amt_rnd_typ_nm_LC(info);
		else if (lc == Base_stk_amt_dec_place) doBase_stk_amt_dec_place_LC(info);
		else if (lc == Base_po_print_cd) doBase_po_print_cd_LC(info);
		else if (lc == Base_po_print_nm) doBase_po_print_nm_LC(info);
		else if (lc == Base_stk_lst_cnf_num) doBase_stk_lst_cnf_num_LC(info);
		else if (lc == Base_stk_lst_limit_num) doBase_stk_lst_limit_num_LC(info);
		else if (lc == Base_early_ship_dt_add_days) doBase_early_ship_dt_add_days_LC(info);
		else if (lc == Base_ac_slip_digit) doBase_ac_slip_digit_LC(info);
		else if (lc == Base_rpt_strg_ext_sys_cd) doBase_rpt_strg_ext_sys_cd_LC(info);
		else if (lc == Base_rpt_strg_ext_sys_nm) doBase_rpt_strg_ext_sys_nm_LC(info);
		else if (lc == Base_cst_prnt_typ) doBase_cst_prnt_typ_LC(info);
		else if (lc == Base_cst_prnt_typ_nm) doBase_cst_prnt_typ_nm_LC(info);
		else if (lc == Base_acst_prnt_typ) doBase_acst_prnt_typ_LC(info);
		else if (lc == Base_acst_prnt_typ_nm) doBase_acst_prnt_typ_nm_LC(info);
		else if (lc == Base_bcst_prnt_typ) doBase_bcst_prnt_typ_LC(info);
		else if (lc == Base_bcst_prnt_typ_nm) doBase_bcst_prnt_typ_nm_LC(info);
		else if (lc == Base_rcst_prnt_typ) doBase_rcst_prnt_typ_LC(info);
		else if (lc == Base_rcst_prnt_typ_nm) doBase_rcst_prnt_typ_nm_LC(info);
		else if (lc == Base_dlv_prnt_typ) doBase_dlv_prnt_typ_LC(info);
		else if (lc == Base_dlv_prnt_typ_nm) doBase_dlv_prnt_typ_nm_LC(info);
		else if (lc == Base_sppl_prnt_typ) doBase_sppl_prnt_typ_LC(info);
		else if (lc == Base_sppl_prnt_typ_nm) doBase_sppl_prnt_typ_nm_LC(info);
		else if (lc == Base_asppl_prnt_typ) doBase_asppl_prnt_typ_LC(info);
		else if (lc == Base_asppl_prnt_typ_nm) doBase_asppl_prnt_typ_nm_LC(info);
		else if (lc == Base_bsppl_prnt_typ) doBase_bsppl_prnt_typ_LC(info);
		else if (lc == Base_bsppl_prnt_typ_nm) doBase_bsppl_prnt_typ_nm_LC(info);
		else if (lc == Base_psppl_prnt_typ) doBase_psppl_prnt_typ_LC(info);
		else if (lc == Base_psppl_prnt_typ_nm) doBase_psppl_prnt_typ_nm_LC(info);
		else if (lc == Base_ins_usr_id) doBase_ins_usr_id_LC(info);
		else if (lc == Base_ins_usr_nm) doBase_ins_usr_nm_LC(info);
		else if (lc == Base_ins_func_id) doBase_ins_func_id_LC(info);
		else if (lc == Base_ins_func_nm) doBase_ins_func_nm_LC(info);
		else if (lc == Base_upd_usr_id) doBase_upd_usr_id_LC(info);
		else if (lc == Base_upd_usr_nm) doBase_upd_usr_nm_LC(info);
		else if (lc == Base_upd_func_id) doBase_upd_func_id_LC(info);
		else if (lc == Base_upd_func_nm) doBase_upd_func_nm_LC(info);
		else if (lc == Base_ins_ts) doBase_ins_ts_LC(info);
		else if (lc == Base_upd_ts) doBase_upd_ts_LC(info);
		else if (lc == Base_upd_srv_req_no) doBase_upd_srv_req_no_LC(info);
		else if (lc == Base_upd_cntr) doBase_upd_cntr_LC(info);
		else if (lc == columnDtl_co_cd) doDtl_co_cd_LC(info);
		else if (lc == columnDtl_co_alt_nm1) doDtl_co_alt_nm1_LC(info);
		else if (lc == columnDtl_co_alt_nm2) doDtl_co_alt_nm2_LC(info);
		else if (lc == columnDtl_co_alt_nm3) doDtl_co_alt_nm3_LC(info);
		else if (lc == columnDtl_co_alt_nm4) doDtl_co_alt_nm4_LC(info);
		else if (lc == columnDtl_zip_cd) doDtl_zip_cd_LC(info);
		else if (lc == columnDtl_addr1) doDtl_addr1_LC(info);
		else if (lc == columnDtl_addr2) doDtl_addr2_LC(info);
		else if (lc == columnDtl_addr3) doDtl_addr3_LC(info);
		else if (lc == columnDtl_addr4) doDtl_addr4_LC(info);
		else if (lc == columnDtl_tel) doDtl_tel_LC(info);
		else if (lc == columnDtl_fax) doDtl_fax_LC(info);
		else if (lc == columnDtl_co_repl_nm) doDtl_co_repl_nm_LC(info);
		else if (lc == columnDtl_ein) doDtl_ein_LC(info);
		else if (lc == columnDtl_biz_co_no) doDtl_biz_co_no_LC(info);
		else if (lc == columnDtl_std_co_cd) doDtl_std_co_cd_LC(info);
		else if (lc == columnDtl_cntry_cd) doDtl_cntry_cd_LC(info);
		else if (lc == columnDtl_area_cd) doDtl_area_cd_LC(info);
		else if (lc == columnDtl_base_cur_cd) doDtl_base_cur_cd_LC(info);
		else if (lc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_LC(info);
		else if (lc == columnDtl_st_mon) doDtl_st_mon_LC(info);
		else if (lc == columnDtl_dt_switch_time) doDtl_dt_switch_time_LC(info);
		else if (lc == columnDtl_ac_cl_day) doDtl_ac_cl_day_LC(info);
		else if (lc == columnDtl_ac_cl_mon_base) doDtl_ac_cl_mon_base_LC(info);
		else if (lc == columnDtl_std_cal_cd) doDtl_std_cal_cd_LC(info);
		else if (lc == columnDtl_bill_cl_cal_cd) doDtl_bill_cl_cal_cd_LC(info);
		else if (lc == columnDtl_stk_cl_cal_cd) doDtl_stk_cl_cal_cd_LC(info);
		else if (lc == columnDtl_sls_cl_cal_cd) doDtl_sls_cl_cal_cd_LC(info);
		else if (lc == columnDtl_rcv_cl_cal_cd) doDtl_rcv_cl_cal_cd_LC(info);
		else if (lc == columnDtl_purc_cl_cal_cd) doDtl_purc_cl_cal_cd_LC(info);
		else if (lc == columnDtl_pay_cl_cal_cd) doDtl_pay_cl_cal_cd_LC(info);
		else if (lc == columnDtl_pay_schd_cl_cal_cd) doDtl_pay_schd_cl_cal_cd_LC(info);
		else if (lc == columnDtl_stk_cl_delay_days) doDtl_stk_cl_delay_days_LC(info);
		else if (lc == columnDtl_stk_cl_ba_typ) doDtl_stk_cl_ba_typ_LC(info);
		else if (lc == columnDtl_sls_cl_delay_days) doDtl_sls_cl_delay_days_LC(info);
		else if (lc == columnDtl_sls_cl_ba_typ) doDtl_sls_cl_ba_typ_LC(info);
		else if (lc == columnDtl_rcv_cl_delay_days) doDtl_rcv_cl_delay_days_LC(info);
		else if (lc == columnDtl_rcv_cl_ba_typ) doDtl_rcv_cl_ba_typ_LC(info);
		else if (lc == columnDtl_purc_cl_delay_days) doDtl_purc_cl_delay_days_LC(info);
		else if (lc == columnDtl_purc_cl_ba_typ) doDtl_purc_cl_ba_typ_LC(info);
		else if (lc == columnDtl_pay_cl_delay_days) doDtl_pay_cl_delay_days_LC(info);
		else if (lc == columnDtl_pay_cl_ba_typ) doDtl_pay_cl_ba_typ_LC(info);
		else if (lc == columnDtl_sls_xrate_cd) doDtl_sls_xrate_cd_LC(info);
		else if (lc == columnDtl_purc_xrate_cd) doDtl_purc_xrate_cd_LC(info);
		else if (lc == columnDtl_prov_xrate_cd) doDtl_prov_xrate_cd_LC(info);
		else if (lc == columnDtl_bill_xrate_cd) doDtl_bill_xrate_cd_LC(info);
		else if (lc == columnDtl_pay_xrate_cd) doDtl_pay_xrate_cd_LC(info);
		else if (lc == columnDtl_sls_upri_req_typ) doDtl_sls_upri_req_typ_LC(info);
		else if (lc == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_LC(info);
		else if (lc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_LC(info);
		else if (lc == columnDtl_sls_basis_typ) doDtl_sls_basis_typ_LC(info);
		else if (lc == columnDtl_bill_basis_typ) doDtl_bill_basis_typ_LC(info);
		else if (lc == columnDtl_ship_schd_split_typ) doDtl_ship_schd_split_typ_LC(info);
		else if (lc == columnDtl_xfr_stk_mng_typ) doDtl_xfr_stk_mng_typ_LC(info);
		else if (lc == columnDtl_setoff_tax_rnd_typ) doDtl_setoff_tax_rnd_typ_LC(info);
		else if (lc == columnDtl_xrate_rnd_typ) doDtl_xrate_rnd_typ_LC(info);
		else if (lc == columnDtl_com_paid_tax_rnd_typ) doDtl_com_paid_tax_rnd_typ_LC(info);
		else if (lc == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_LC(info);
		else if (lc == columnDtl_stk_amt_rnd_typ) doDtl_stk_amt_rnd_typ_LC(info);
		else if (lc == columnDtl_stk_amt_dec_place) doDtl_stk_amt_dec_place_LC(info);
		else if (lc == columnDtl_po_print_cd) doDtl_po_print_cd_LC(info);
		else if (lc == columnDtl_stk_lst_cnf_num) doDtl_stk_lst_cnf_num_LC(info);
		else if (lc == columnDtl_stk_lst_limit_num) doDtl_stk_lst_limit_num_LC(info);
		else if (lc == columnDtl_gm_std_upri_typ) doDtl_gm_std_upri_typ_LC(info);
		else if (lc == columnDtl_stk_std_upri_typ) doDtl_stk_std_upri_typ_LC(info);
		else if (lc == columnDtl_early_ship_dt_add_days) doDtl_early_ship_dt_add_days_LC(info);
		else if (lc == columnDtl_ac_slip_digit) doDtl_ac_slip_digit_LC(info);
		else if (lc == columnDtl_sls_bdj_rnd_typ) doDtl_sls_bdj_rnd_typ_LC(info);
		else if (lc == columnDtl_cntry_nm) doDtl_cntry_nm_LC(info);
		else if (lc == columnDtl_area_nm) doDtl_area_nm_LC(info);
		else if (lc == columnDtl_base_cur_nm) doDtl_base_cur_nm_LC(info);
		else if (lc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_LC(info);
		else if (lc == columnDtl_std_cal_nm) doDtl_std_cal_nm_LC(info);
		else if (lc == columnDtl_stk_cl_cal_nm) doDtl_stk_cl_cal_nm_LC(info);
		else if (lc == columnDtl_sls_cl_cal_nm) doDtl_sls_cl_cal_nm_LC(info);
		else if (lc == columnDtl_bill_cl_cal_nm) doDtl_bill_cl_cal_nm_LC(info);
		else if (lc == columnDtl_rcv_cl_cal_nm) doDtl_rcv_cl_cal_nm_LC(info);
		else if (lc == columnDtl_purc_cl_cal_nm) doDtl_purc_cl_cal_nm_LC(info);
		else if (lc == columnDtl_pay_cl_cal_nm) doDtl_pay_cl_cal_nm_LC(info);
		else if (lc == columnDtl_pay_schd_cl_cal_nm) doDtl_pay_schd_cl_cal_nm_LC(info);
		else if (lc == columnDtl_sls_xrate_nm) doDtl_sls_xrate_nm_LC(info);
		else if (lc == columnDtl_purc_xrate_nm) doDtl_purc_xrate_nm_LC(info);
		else if (lc == columnDtl_prov_xrate_nm) doDtl_prov_xrate_nm_LC(info);
		else if (lc == columnDtl_bill_xrate_nm) doDtl_bill_xrate_nm_LC(info);
		else if (lc == columnDtl_pay_xrate_nm) doDtl_pay_xrate_nm_LC(info);
		else if (lc == columnDtl_stk_cl_ba_typ_nm) doDtl_stk_cl_ba_typ_nm_LC(info);
		else if (lc == columnDtl_sls_cl_ba_typ_nm) doDtl_sls_cl_ba_typ_nm_LC(info);
		else if (lc == columnDtl_rcv_cl_ba_typ_nm) doDtl_rcv_cl_ba_typ_nm_LC(info);
		else if (lc == columnDtl_purc_cl_ba_typ_nm) doDtl_purc_cl_ba_typ_nm_LC(info);
		else if (lc == columnDtl_pay_cl_ba_typ_nm) doDtl_pay_cl_ba_typ_nm_LC(info);
		else if (lc == columnDtl_sls_upri_req_typ_nm) doDtl_sls_upri_req_typ_nm_LC(info);
		else if (lc == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_LC(info);
		else if (lc == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_LC(info);
		else if (lc == columnDtl_sls_basis_typ_nm) doDtl_sls_basis_typ_nm_LC(info);
		else if (lc == columnDtl_bill_basis_typ_nm) doDtl_bill_basis_typ_nm_LC(info);
		else if (lc == columnDtl_ship_schd_split_typ_nm) doDtl_ship_schd_split_typ_nm_LC(info);
		else if (lc == columnDtl_xfr_stk_mng_typ_nm) doDtl_xfr_stk_mng_typ_nm_LC(info);
		else if (lc == columnDtl_xrate_rnd_typ_nm) doDtl_xrate_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_setoff_tax_rnd_typ_nm) doDtl_setoff_tax_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_com_paid_tax_rnd_typ_nm) doDtl_com_paid_tax_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_wtax_rnd_typ_nm) doDtl_wtax_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_stk_amt_rnd_typ_nm) doDtl_stk_amt_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_sls_bdj_rnd_typ_nm) doDtl_sls_bdj_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_po_print_nm) doDtl_po_print_nm_LC(info);
		else if (lc == columnDtl_gm_std_upri_typ_nm) doDtl_gm_std_upri_typ_nm_LC(info);
		else if (lc == columnDtl_stk_std_upri_typ_nm) doDtl_stk_std_upri_typ_nm_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_rpt_strg_ext_sys_cd) doDtl_rpt_strg_ext_sys_cd_LC(info);
		else if (lc == columnDtl_rpt_strg_ext_sys_nm) doDtl_rpt_strg_ext_sys_nm_LC(info);
		else if (lc == columnDtl_cst_prnt_typ) doDtl_cst_prnt_typ_LC(info);
		else if (lc == columnDtl_cst_prnt_typ_nm) doDtl_cst_prnt_typ_nm_LC(info);
		else if (lc == columnDtl_acst_prnt_typ) doDtl_acst_prnt_typ_LC(info);
		else if (lc == columnDtl_acst_prnt_typ_nm) doDtl_acst_prnt_typ_nm_LC(info);
		else if (lc == columnDtl_bcst_prnt_typ) doDtl_bcst_prnt_typ_LC(info);
		else if (lc == columnDtl_bcst_prnt_typ_nm) doDtl_bcst_prnt_typ_nm_LC(info);
		else if (lc == columnDtl_rcst_prnt_typ) doDtl_rcst_prnt_typ_LC(info);
		else if (lc == columnDtl_rcst_prnt_typ_nm) doDtl_rcst_prnt_typ_nm_LC(info);
		else if (lc == columnDtl_dlv_prnt_typ) doDtl_dlv_prnt_typ_LC(info);
		else if (lc == columnDtl_dlv_prnt_typ_nm) doDtl_dlv_prnt_typ_nm_LC(info);
		else if (lc == columnDtl_sppl_prnt_typ) doDtl_sppl_prnt_typ_LC(info);
		else if (lc == columnDtl_sppl_prnt_typ_nm) doDtl_sppl_prnt_typ_nm_LC(info);
		else if (lc == columnDtl_asppl_prnt_typ) doDtl_asppl_prnt_typ_LC(info);
		else if (lc == columnDtl_asppl_prnt_typ_nm) doDtl_asppl_prnt_typ_nm_LC(info);
		else if (lc == columnDtl_bsppl_prnt_typ) doDtl_bsppl_prnt_typ_LC(info);
		else if (lc == columnDtl_bsppl_prnt_typ_nm) doDtl_bsppl_prnt_typ_nm_LC(info);
		else if (lc == columnDtl_psppl_prnt_typ) doDtl_psppl_prnt_typ_LC(info);
		else if (lc == columnDtl_psppl_prnt_typ_nm) doDtl_psppl_prnt_typ_nm_LC(info);
		else if (lc == columnDtlSub_co_cd) doDtlSub_co_cd_LC(info);
		else if (lc == columnDtlSub_sls_tax_cd) doDtlSub_sls_tax_cd_LC(info);
		else if (lc == columnDtlSub_sls_tax_nm) doDtlSub_sls_tax_nm_LC(info);
		else if (lc == columnDtlSub_purc_tax_cd) doDtlSub_purc_tax_cd_LC(info);
		else if (lc == columnDtlSub_purc_tax_nm) doDtlSub_purc_tax_nm_LC(info);
		else if (lc == columnDtlSub_prov_tax_cd) doDtlSub_prov_tax_cd_LC(info);
		else if (lc == columnDtlSub_prov_tax_nm) doDtlSub_prov_tax_nm_LC(info);
		else if (lc == columnDtlSub_memo1) doDtlSub_memo1_LC(info);
		else if (lc == columnDtlSub_memo2) doDtlSub_memo2_LC(info);
		else if (lc == columnDtlSub_memo3) doDtlSub_memo3_LC(info);
		else if (lc == columnDtlSub_ins_usr_id) doDtlSub_ins_usr_id_LC(info);
		else if (lc == columnDtlSub_ins_usr_nm) doDtlSub_ins_usr_nm_LC(info);
		else if (lc == columnDtlSub_ins_ts) doDtlSub_ins_ts_LC(info);
		else if (lc == columnDtlSub_ins_func_id) doDtlSub_ins_func_id_LC(info);
		else if (lc == columnDtlSub_ins_func_nm) doDtlSub_ins_func_nm_LC(info);
		else if (lc == columnDtlSub_upd_cntr) doDtlSub_upd_cntr_LC(info);
		else if (lc == columnDtlSub_upd_usr_id) doDtlSub_upd_usr_id_LC(info);
		else if (lc == columnDtlSub_upd_usr_nm) doDtlSub_upd_usr_nm_LC(info);
		else if (lc == columnDtlSub_upd_ts) doDtlSub_upd_ts_LC(info);
		else if (lc == columnDtlSub_upd_func_id) doDtlSub_upd_func_id_LC(info);
		else if (lc == columnDtlSub_upd_func_nm) doDtlSub_upd_func_nm_LC(info);
		else if (lc == columnDtlSub_upd_srv_req_no) doDtlSub_upd_srv_req_no_LC(info);
		else if (lc == columnLcl_co_cd) doLcl_co_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_co_alt_nm1) doLcl_co_alt_nm1_LC(info);
		else if (lc == columnLcl_co_alt_nm2) doLcl_co_alt_nm2_LC(info);
		else if (lc == columnLcl_co_alt_nm3) doLcl_co_alt_nm3_LC(info);
		else if (lc == columnLcl_co_alt_nm4) doLcl_co_alt_nm4_LC(info);
		else if (lc == columnLcl_zip_cd) doLcl_zip_cd_LC(info);
		else if (lc == columnLcl_addr1) doLcl_addr1_LC(info);
		else if (lc == columnLcl_addr2) doLcl_addr2_LC(info);
		else if (lc == columnLcl_addr3) doLcl_addr3_LC(info);
		else if (lc == columnLcl_addr4) doLcl_addr4_LC(info);
		else if (lc == columnLcl_tel) doLcl_tel_LC(info);
		else if (lc == columnLcl_fax) doLcl_fax_LC(info);
		else if (lc == columnLcl_co_repl_nm) doLcl_co_repl_nm_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
		else if (lc == columnLcl_ins_usr_id) doLcl_ins_usr_id_LC(info);
		else if (lc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_LC(info);
		else if (lc == columnLcl_ins_ts) doLcl_ins_ts_LC(info);
		else if (lc == columnLcl_ins_func_id) doLcl_ins_func_id_LC(info);
		else if (lc == columnLcl_ins_func_nm) doLcl_ins_func_nm_LC(info);
		else if (lc == columnLcl_upd_cntr) doLcl_upd_cntr_LC(info);
		else if (lc == columnLcl_upd_usr_id) doLcl_upd_usr_id_LC(info);
		else if (lc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_LC(info);
		else if (lc == columnLcl_upd_ts) doLcl_upd_ts_LC(info);
		else if (lc == columnLcl_upd_func_id) doLcl_upd_func_id_LC(info);
		else if (lc == columnLcl_upd_func_nm) doLcl_upd_func_nm_LC(info);
		else if (lc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tel_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fax_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[co_repl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_co_repl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[biz_co_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_biz_co_no_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ein]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ein_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_cl_mon_base]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_cl_mon_base_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[st_mon]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_st_mon_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dt_switch_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dt_switch_time_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcv_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcv_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_schd_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_schd_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_schd_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pay_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pay_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_upri_req_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_upri_req_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bill_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bill_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ship_schd_split_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ship_schd_split_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ship_schd_split_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xfr_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xfr_stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xfr_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_bdj_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sls_bdj_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sls_bdj_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_upri_req_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_upri_req_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[outsrc_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_outsrc_upri_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xrate_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[xrate_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_xrate_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_setoff_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[setoff_tax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_setoff_tax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_com_paid_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[com_paid_tax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_com_paid_tax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wtax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wtax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wtax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_gm_std_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[gm_std_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_gm_std_upri_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_std_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_std_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_std_upri_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[po_print_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_po_print_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[po_print_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_po_print_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_lst_cnf_num]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_lst_cnf_num_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_lst_limit_num]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_lst_limit_num_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[early_ship_dt_add_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_early_ship_dt_add_days_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ac_slip_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ac_slip_digit_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rpt_strg_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rpt_strg_ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rpt_strg_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[cst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_cst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[acst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_acst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[acst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_acst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bcst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bcst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bcst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rcst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rcst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dlv_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[dlv_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_dlv_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bsppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[bsppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_bsppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_psppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[psppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_psppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_repl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_repl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ein]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ein_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_co_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_co_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_mon]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_mon_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt_switch_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_switch_time_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_cl_mon_base]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_cl_mon_base_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_cl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_split_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_com_paid_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_cnf_num]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_cnf_num_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_limit_num]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_limit_num_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gm_std_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_std_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_early_ship_dt_add_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_digit_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdj_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_cl_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_cl_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_req_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_req_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_split_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_split_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[setoff_tax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_setoff_tax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[com_paid_tax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_com_paid_tax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_amt_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_amt_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_bdj_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_bdj_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_print_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_print_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gm_std_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gm_std_upri_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_std_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_std_upri_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_strg_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_strg_ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_strg_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[sls_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_sls_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[sls_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_sls_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[purc_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_purc_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[purc_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_purc_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[prov_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_prov_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[prov_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_prov_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo1_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo2_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_memo3_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSub]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSub_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_tel_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fax_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[co_repl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_co_repl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Base_cntry_cd]の作成メソッド
	 */
	public MCList getBase_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_area_cd]の作成メソッド
	 */
	public MCList getBase_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_base_cur_cd]の作成メソッド
	 */
	public MCList getBase_base_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_ptax_cur_cd]の作成メソッド
	 */
	public MCList getBase_ptax_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_std_cal_cd]の作成メソッド
	 */
	public MCList getBase_std_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sls_cl_cal_cd]の作成メソッド
	 */
	public MCList getBase_sls_cl_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sls_cl_ba_typ]の作成メソッド
	 */
	public MCList getBase_sls_cl_ba_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_rcv_cl_cal_cd]の作成メソッド
	 */
	public MCList getBase_rcv_cl_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_rcv_cl_ba_typ]の作成メソッド
	 */
	public MCList getBase_rcv_cl_ba_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_purc_cl_cal_cd]の作成メソッド
	 */
	public MCList getBase_purc_cl_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_purc_cl_ba_typ]の作成メソッド
	 */
	public MCList getBase_purc_cl_ba_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_pay_cl_cal_cd]の作成メソッド
	 */
	public MCList getBase_pay_cl_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_pay_cl_ba_typ]の作成メソッド
	 */
	public MCList getBase_pay_cl_ba_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_stk_cl_cal_cd]の作成メソッド
	 */
	public MCList getBase_stk_cl_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_stk_cl_ba_typ]の作成メソッド
	 */
	public MCList getBase_stk_cl_ba_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_bill_cl_cal_cd]の作成メソッド
	 */
	public MCList getBase_bill_cl_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_pay_schd_cl_cal_cd]の作成メソッド
	 */
	public MCList getBase_pay_schd_cl_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sls_xrate_cd]の作成メソッド
	 */
	public MCList getBase_sls_xrate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_purc_xrate_cd]の作成メソッド
	 */
	public MCList getBase_purc_xrate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_prov_xrate_cd]の作成メソッド
	 */
	public MCList getBase_prov_xrate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_bill_xrate_cd]の作成メソッド
	 */
	public MCList getBase_bill_xrate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_pay_xrate_cd]の作成メソッド
	 */
	public MCList getBase_pay_xrate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sls_upri_req_typ]の作成メソッド
	 */
	public MCList getBase_sls_upri_req_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsUpriReqTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sls_basis_typ]の作成メソッド
	 */
	public MCList getBase_sls_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsBasisTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_bill_basis_typ]の作成メソッド
	 */
	public MCList getBase_bill_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBillBasisTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_ship_schd_split_typ]の作成メソッド
	 */
	public MCList getBase_ship_schd_split_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipSchdSplitTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_xfr_stk_mng_typ]の作成メソッド
	 */
	public MCList getBase_xfr_stk_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXfrStkMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sls_bdj_rnd_typ]の作成メソッド
	 */
	public MCList getBase_sls_bdj_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBigNumRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_purc_upri_req_typ]の作成メソッド
	 */
	public MCList getBase_purc_upri_req_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcUpriReqTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_outsrc_upri_typ]の作成メソッド
	 */
	public MCList getBase_outsrc_upri_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOutsrcUpriTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_xrate_rnd_typ]の作成メソッド
	 */
	public MCList getBase_xrate_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_setoff_tax_rnd_typ]の作成メソッド
	 */
	public MCList getBase_setoff_tax_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_com_paid_tax_rnd_typ]の作成メソッド
	 */
	public MCList getBase_com_paid_tax_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_wtax_rnd_typ]の作成メソッド
	 */
	public MCList getBase_wtax_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_gm_std_upri_typ]の作成メソッド
	 */
	public MCList getBase_gm_std_upri_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStdUpriSelTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_stk_std_upri_typ]の作成メソッド
	 */
	public MCList getBase_stk_std_upri_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStdUpriSelTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_stk_amt_rnd_typ]の作成メソッド
	 */
	public MCList getBase_stk_amt_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_po_print_cd]の作成メソッド
	 */
	public MCList getBase_po_print_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPoPrint(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_rpt_strg_ext_sys_cd]の作成メソッド
	 */
	public MCList getBase_rpt_strg_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSys(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_cst_prnt_typ]の作成メソッド
	 */
	public MCList getBase_cst_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_acst_prnt_typ]の作成メソッド
	 */
	public MCList getBase_acst_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_bcst_prnt_typ]の作成メソッド
	 */
	public MCList getBase_bcst_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_rcst_prnt_typ]の作成メソッド
	 */
	public MCList getBase_rcst_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_dlv_prnt_typ]の作成メソッド
	 */
	public MCList getBase_dlv_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sppl_prnt_typ]の作成メソッド
	 */
	public MCList getBase_sppl_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_asppl_prnt_typ]の作成メソッド
	 */
	public MCList getBase_asppl_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_bsppl_prnt_typ]の作成メソッド
	 */
	public MCList getBase_bsppl_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_psppl_prnt_typ]の作成メソッド
	 */
	public MCList getBase_psppl_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rpt_strg_ext_sys_cd]の作成メソッド
	 */
	public MCList getDtl_rpt_strg_ext_sys_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtlSub_sls_tax_cd]の作成メソッド
	 */
	public MCList getDtlSub_sls_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlSub_purc_tax_cd]の作成メソッド
	 */
	public MCList getDtlSub_purc_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlSub_prov_tax_cd]の作成メソッド
	 */
	public MCList getDtlSub_prov_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0020.Srch01")) {
			return new MA_MABCL0020_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0020.Upd01")) {
			return new MA_MABCL0020_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0020_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0020_Srch01Bridge() {
			p_MA_MABCL0020_Srch01 = new MCParam(PDef.MA_MABCL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0020.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0020.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0020.DtlSubR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0020.LclR.class));

			p_MA_MABCL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0020.CndR up0() {
			return (mcframe.clientMABC.MABCP0020.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0020.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0020.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0020.DtlSubR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0020.DtlSubR>)down(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0020.LclR> down2() {
			return (MCList<mcframe.clientMABC.MABCP0020.LclR>)down(2);
		}

		protected void setupDownParam() {
			p_MA_MABCL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0020.DtlR.class));
			p_MA_MABCL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0020.DtlSubR.class));
			p_MA_MABCL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0020.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0020_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0020.DtlR>)p_MA_MABCL0020_Srch01.getContainerParam().getDownBlock(0));
			setDtlSubL((MCList<mcframe.clientMABC.MABCP0020.DtlSubR>)p_MA_MABCL0020_Srch01.getContainerParam().getDownBlock(1));
			setLclAllL((MCList<mcframe.clientMABC.MABCP0020.LclR>)p_MA_MABCL0020_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getDtlL().clear();
			getDtlSubL().clear();
			getLclAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getDtlSubL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0020_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0020_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0020_Upd01Bridge() {
			p_MA_MABCL0020_Upd01 = new MCParam(PDef.MA_MABCL0020_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0020_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0020.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0020.DtlSubR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0020.LclR.class));
			// Down

			p_MA_MABCL0020_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0020_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0020_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0020_Upd01.addUpBlock(getDtlSubL().shallowClone());
			p_MA_MABCL0020_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0020_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0020_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0020.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0020.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0020.DtlSubR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0020.DtlSubR>)up(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0020.LclR> up2() {
			return (MCList<mcframe.clientMABC.MABCP0020.LclR>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0020_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getDtlSubL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}