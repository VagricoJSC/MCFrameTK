package mcframe.clientMABC.MABCP0540;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Wrk1HdrAll"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Wrk1HdrAllR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public static final String $acst_flg = "acst_flg";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public static final String $cst_cntct_dpt = "cst_cntct_dpt";
	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public static final String $cst_cntct_psn = "cst_cntct_psn";
	/**
	 * Form of address for Customer PIC 得意先担当者敬称.<p>
	 *
	 */
	public static final String $cst_cntct_psn_title = "cst_cntct_psn_title";
	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public static final String $cst_sundry_flg = "cst_sundry_flg";
	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public static final String $ar_dpt_typ = "ar_dpt_typ";
	/**
	 * AR dept. type name 債権部門区分名.<p>
	 *
	 */
	public static final String $ar_dpt_typ_nm = "ar_dpt_typ_nm";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $check_ar_dpt_cd = "check_ar_dpt_cd";
	/**
	 * Sales unit price rounding type 販売単価端数処理区分.<p>
	 *
	 */
	public static final String $sls_upri_rnd_typ = "sls_upri_rnd_typ";
	/**
	 * Sales unit rounding type name 販売単価端数処理区分名.<p>
	 *
	 */
	public static final String $sls_upri_rnd_typ_nm = "sls_upri_rnd_typ_nm";
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public static final String $sls_upri_req_typ_nm = "sls_upri_req_typ_nm";
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ = "sls_amt_rnd_typ";
	/**
	 * Rounding type name (Sales amount) 売上金額端数処理区分名.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ_nm = "sls_amt_rnd_typ_nm";
	/**
	 * Sales tax calculation type 売上税計算区分.<p>
	 *
	 */
	public static final String $sls_tax_calc_typ = "sls_tax_calc_typ";
	/**
	 * Sales tax calculation type name 売上税計算区分名.<p>
	 *
	 */
	public static final String $sls_tax_calc_typ_nm = "sls_tax_calc_typ_nm";
	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ = "sls_tax_rnd_typ";
	/**
	 * Rounding type 売上税額端数処理区分名.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ_nm = "sls_tax_rnd_typ_nm";
	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public static final String $sls_tax_cd = "sls_tax_cd";
	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public static final String $sls_tax_nm = "sls_tax_nm";
	/**
	 * Sales tax priority 売上税優先.<p>
	 *
	 */
	public static final String $sls_tax_cd_prio_flg = "sls_tax_cd_prio_flg";
	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public static final String $lot_back_stop_typ = "lot_back_stop_typ";
	/**
	 * Lot reverse prohibit type name ロット逆転禁止区分名.<p>
	 *
	 */
	public static final String $lot_back_stop_typ_nm = "lot_back_stop_typ_nm";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public static final String $sls_basis_typ_nm = "sls_basis_typ_nm";
	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public static final String $bill_basis_typ = "bill_basis_typ";
	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public static final String $bill_basis_typ_nm = "bill_basis_typ_nm";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public static final String $slip_each_lot_typ = "slip_each_lot_typ";
	/**
	 * Lot details split type name ロット明細分割区分名.<p>
	 *
	 */
	public static final String $slip_each_lot_typ_nm = "slip_each_lot_typ_nm";
	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public static final String $ship_schd_split_typ_nm = "ship_schd_split_typ_nm";
	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public static final String $stk_lst_issue_flg = "stk_lst_issue_flg";
	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public static final String $stk_lst_form_cd = "stk_lst_form_cd";
	/**
	 * Identification tag name 現品票名.<p>
	 *
	 */
	public static final String $stk_lst_form_nm = "stk_lst_form_nm";
	/**
	 * Customer delivery note cd. 得意先納品書ＣＤ.<p>
	 *
	 */
	public static final String $cst_ship_form_cd = "cst_ship_form_cd";
	/**
	 * Customer delivery note name 得意先納品書名.<p>
	 *
	 */
	public static final String $cst_ship_form_nm = "cst_ship_form_nm";
	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public static final String $wrk_ar_flg = "wrk_ar_flg";
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public static final String $ship_lt = "ship_lt";
	/**
	 * Customer transaction terms cd. 1 得意先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $cst_tterm_cd1 = "cst_tterm_cd1";
	/**
	 * Customer transaction terms name 1 得意先取引条件名１.<p>
	 *
	 */
	public static final String $cst_tterm_nm1 = "cst_tterm_nm1";
	/**
	 * Customer transaction terms cd. 2 得意先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $cst_tterm_cd2 = "cst_tterm_cd2";
	/**
	 * Customer transaction terms name 2 得意先取引条件名２.<p>
	 *
	 */
	public static final String $cst_tterm_nm2 = "cst_tterm_nm2";
	/**
	 * Customer transaction terms cd. 3 得意先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $cst_tterm_cd3 = "cst_tterm_cd3";
	/**
	 * Customer transaction terms name 3 得意先取引条件名３.<p>
	 *
	 */
	public static final String $cst_tterm_nm3 = "cst_tterm_nm3";
	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public static final String $sls_anly_cd1 = "sls_anly_cd1";
	/**
	 * Sales analysis name 1 販売分析名１.<p>
	 *
	 */
	public static final String $sls_anly_nm1 = "sls_anly_nm1";
	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public static final String $sls_anly_cd2 = "sls_anly_cd2";
	/**
	 * Sales analysis name 2 販売分析名２.<p>
	 *
	 */
	public static final String $sls_anly_nm2 = "sls_anly_nm2";
	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public static final String $sls_anly_cd3 = "sls_anly_cd3";
	/**
	 * Sales analysis name 3 販売分析名３.<p>
	 *
	 */
	public static final String $sls_anly_nm3 = "sls_anly_nm3";
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public static final String $bcst_flg = "bcst_flg";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public static final String $cst_prnt_typ = "cst_prnt_typ";
	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public static final String $cst_prnt_typ_nm = "cst_prnt_typ_nm";
	/**
	 * Prohibit mixed distribution group 物流グループ混在不可.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_flg_META = createCommonMeta($acst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta cst_cntct_psn_title_META = createCommonMeta($cst_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta cst_sundry_flg_META = createCommonMeta($cst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.AR_DPT_TYP);
	public static final MCMeta ar_dpt_typ_nm_META = createCommonMeta($ar_dpt_typ_nm, mcframe.commonMA.meta.MA_META.AR_DPT_TYP_NM);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_ar_dpt_cd_META = createCommonMeta($check_ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_upri_rnd_typ_META = createCommonMeta($sls_upri_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_upri_rnd_typ_nm_META = createCommonMeta($sls_upri_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta sls_upri_req_typ_nm_META = createCommonMeta($sls_upri_req_typ_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP_NM);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_amt_rnd_typ_nm_META = createCommonMeta($sls_amt_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta sls_tax_calc_typ_META = createCommonMeta($sls_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta sls_tax_calc_typ_nm_META = createCommonMeta($sls_tax_calc_typ_nm, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP_NM);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_rnd_typ_nm_META = createCommonMeta($sls_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta sls_tax_cd_META = createCommonMeta($sls_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta sls_tax_nm_META = createCommonMeta($sls_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta sls_tax_cd_prio_flg_META = createCommonMeta($sls_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_back_stop_typ_META = createCommonMeta($lot_back_stop_typ, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP);
	public static final MCMeta lot_back_stop_typ_nm_META = createCommonMeta($lot_back_stop_typ_nm, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP_NM);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta sls_basis_typ_nm_META = createCommonMeta($sls_basis_typ_nm, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP_NM);
	public static final MCMeta bill_basis_typ_META = createCommonMeta($bill_basis_typ, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP);
	public static final MCMeta bill_basis_typ_nm_META = createCommonMeta($bill_basis_typ_nm, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP_NM);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta slip_each_lot_typ_META = createCommonMeta($slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta slip_each_lot_typ_nm_META = createCommonMeta($slip_each_lot_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP_NM);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta ship_schd_split_typ_nm_META = createCommonMeta($ship_schd_split_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP_NM);
	public static final MCMeta stk_lst_issue_flg_META = createCommonMeta($stk_lst_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_form_cd_META = createCommonMeta($stk_lst_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta stk_lst_form_nm_META = createCommonMeta($stk_lst_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta cst_ship_form_cd_META = createCommonMeta($cst_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta cst_ship_form_nm_META = createCommonMeta($cst_ship_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta wrk_ar_flg_META = createCommonMeta($wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_lt_META = createCommonMeta($ship_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta cst_tterm_cd1_META = createCommonMeta($cst_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_nm1_META = createCommonMeta($cst_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta cst_tterm_cd2_META = createCommonMeta($cst_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_nm2_META = createCommonMeta($cst_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta cst_tterm_cd3_META = createCommonMeta($cst_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_nm3_META = createCommonMeta($cst_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sls_anly_cd1_META = createCommonMeta($sls_anly_cd1, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_nm1_META = createCommonMeta($sls_anly_nm1, mcframe.commonMA.meta.MA_META.SLS_ANLY_NM);
	public static final MCMeta sls_anly_cd2_META = createCommonMeta($sls_anly_cd2, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_nm2_META = createCommonMeta($sls_anly_nm2, mcframe.commonMA.meta.MA_META.SLS_ANLY_NM);
	public static final MCMeta sls_anly_cd3_META = createCommonMeta($sls_anly_cd3, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_nm3_META = createCommonMeta($sls_anly_nm3, mcframe.commonMA.meta.MA_META.SLS_ANLY_NM);
	public static final MCMeta bcst_flg_META = createCommonMeta($bcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta cst_prnt_typ_META = createCommonMeta($cst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta cst_prnt_typ_nm_META = createCommonMeta($cst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Wrk1HdrAllR> constMetas = new ConstMetaList<Wrk1HdrAllR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			bp_cd_META,
			acst_flg_META,
			acst_cd_META,
			acst_nm_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_cntct_psn_title_META,
			cst_sundry_flg_META,
			ar_dpt_typ_META,
			ar_dpt_typ_nm_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			check_ar_dpt_cd_META,
			sls_upri_rnd_typ_META,
			sls_upri_rnd_typ_nm_META,
			sls_upri_req_typ_META,
			sls_upri_req_typ_nm_META,
			sls_upri_cng_flg_META,
			sls_amt_rnd_typ_META,
			sls_amt_rnd_typ_nm_META,
			sls_tax_calc_typ_META,
			sls_tax_calc_typ_nm_META,
			sls_tax_rnd_typ_META,
			sls_tax_rnd_typ_nm_META,
			sls_tax_cd_META,
			sls_tax_nm_META,
			sls_tax_cd_prio_flg_META,
			lot_back_stop_typ_META,
			lot_back_stop_typ_nm_META,
			sls_basis_typ_META,
			sls_basis_typ_nm_META,
			bill_basis_typ_META,
			bill_basis_typ_nm_META,
			bill_crryovr_times_META,
			slip_each_lot_typ_META,
			slip_each_lot_typ_nm_META,
			ship_schd_split_typ_META,
			ship_schd_split_typ_nm_META,
			stk_lst_issue_flg_META,
			stk_lst_form_cd_META,
			stk_lst_form_nm_META,
			cst_ship_form_cd_META,
			cst_ship_form_nm_META,
			wrk_ar_flg_META,
			cst_iv_flg_META,
			ship_lt_META,
			cst_tterm_cd1_META,
			cst_tterm_nm1_META,
			cst_tterm_cd2_META,
			cst_tterm_nm2_META,
			cst_tterm_cd3_META,
			cst_tterm_nm3_META,
			sls_anly_cd1_META,
			sls_anly_nm1_META,
			sls_anly_cd2_META,
			sls_anly_nm2_META,
			sls_anly_cd3_META,
			sls_anly_nm3_META,
			bcst_flg_META,
			bcst_cd_META,
			bcst_nm_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
			cst_prnt_typ_META,
			cst_prnt_typ_nm_META,
			not_lg_mix_flg_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$bp_cd	// bp_cd
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wrk_ar_flg, "WRK"}	// wrk_ar_flg
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Wrk1HdrAllR_MC_A(ConstMetaList<? extends Wrk1HdrAllR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1HdrAllR clone() {
		return (Wrk1HdrAllR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1HdrAllR createInstance() {
		return (Wrk1HdrAllR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1HdrAllR getValues(String... names) {
		return (Wrk1HdrAllR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 1, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 1, $bp_cd, value);
	}


	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public boolean acst_flg() {
		return getConstBoolean(offset + 2, $acst_flg);
	}

	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public void acst_flg(boolean value) {
		setConstBoolean(offset + 2, $acst_flg, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 3, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 3, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 4, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 4, $acst_nm, value);
	}


	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public String cst_cntct_dpt() {
		return getConstString(offset + 5, $cst_cntct_dpt);
	}

	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public void cst_cntct_dpt(String value) {
		setConstString(offset + 5, $cst_cntct_dpt, value);
	}


	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public String cst_cntct_psn() {
		return getConstString(offset + 6, $cst_cntct_psn);
	}

	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public void cst_cntct_psn(String value) {
		setConstString(offset + 6, $cst_cntct_psn, value);
	}


	/**
	 * Form of address for Customer PIC 得意先担当者敬称.<p>
	 *
	 */
	public String cst_cntct_psn_title() {
		return getConstString(offset + 7, $cst_cntct_psn_title);
	}

	/**
	 * Form of address for Customer PIC 得意先担当者敬称.<p>
	 *
	 */
	public void cst_cntct_psn_title(String value) {
		setConstString(offset + 7, $cst_cntct_psn_title, value);
	}


	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public boolean cst_sundry_flg() {
		return getConstBoolean(offset + 8, $cst_sundry_flg);
	}

	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public void cst_sundry_flg(boolean value) {
		setConstBoolean(offset + 8, $cst_sundry_flg, value);
	}


	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 9, $ar_dpt_typ);
	}

	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 9, $ar_dpt_typ, value);
	}


	/**
	 * AR dept. type name 債権部門区分名.<p>
	 *
	 */
	public String ar_dpt_typ_nm() {
		return getConstString(offset + 10, $ar_dpt_typ_nm);
	}

	/**
	 * AR dept. type name 債権部門区分名.<p>
	 *
	 */
	public void ar_dpt_typ_nm(String value) {
		setConstString(offset + 10, $ar_dpt_typ_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 11, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 11, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 12, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 12, $ar_dpt_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String check_ar_dpt_cd() {
		return getConstString(offset + 13, $check_ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void check_ar_dpt_cd(String value) {
		setConstString(offset + 13, $check_ar_dpt_cd, value);
	}


	/**
	 * Sales unit price rounding type 販売単価端数処理区分.<p>
	 *
	 */
	public String sls_upri_rnd_typ() {
		return getConstString(offset + 14, $sls_upri_rnd_typ);
	}

	/**
	 * Sales unit price rounding type 販売単価端数処理区分.<p>
	 *
	 */
	public void sls_upri_rnd_typ(String value) {
		setConstString(offset + 14, $sls_upri_rnd_typ, value);
	}


	/**
	 * Sales unit rounding type name 販売単価端数処理区分名.<p>
	 *
	 */
	public String sls_upri_rnd_typ_nm() {
		return getConstString(offset + 15, $sls_upri_rnd_typ_nm);
	}

	/**
	 * Sales unit rounding type name 販売単価端数処理区分名.<p>
	 *
	 */
	public void sls_upri_rnd_typ_nm(String value) {
		setConstString(offset + 15, $sls_upri_rnd_typ_nm, value);
	}


	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 16, $sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 16, $sls_upri_req_typ, value);
	}


	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public String sls_upri_req_typ_nm() {
		return getConstString(offset + 17, $sls_upri_req_typ_nm);
	}

	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public void sls_upri_req_typ_nm(String value) {
		setConstString(offset + 17, $sls_upri_req_typ_nm, value);
	}


	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 18, $sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 18, $sls_upri_cng_flg, value);
	}


	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 19, $sls_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 19, $sls_amt_rnd_typ, value);
	}


	/**
	 * Rounding type name (Sales amount) 売上金額端数処理区分名.<p>
	 *
	 */
	public String sls_amt_rnd_typ_nm() {
		return getConstString(offset + 20, $sls_amt_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Sales amount) 売上金額端数処理区分名.<p>
	 *
	 */
	public void sls_amt_rnd_typ_nm(String value) {
		setConstString(offset + 20, $sls_amt_rnd_typ_nm, value);
	}


	/**
	 * Sales tax calculation type 売上税計算区分.<p>
	 *
	 */
	public String sls_tax_calc_typ() {
		return getConstString(offset + 21, $sls_tax_calc_typ);
	}

	/**
	 * Sales tax calculation type 売上税計算区分.<p>
	 *
	 */
	public void sls_tax_calc_typ(String value) {
		setConstString(offset + 21, $sls_tax_calc_typ, value);
	}


	/**
	 * Sales tax calculation type name 売上税計算区分名.<p>
	 *
	 */
	public String sls_tax_calc_typ_nm() {
		return getConstString(offset + 22, $sls_tax_calc_typ_nm);
	}

	/**
	 * Sales tax calculation type name 売上税計算区分名.<p>
	 *
	 */
	public void sls_tax_calc_typ_nm(String value) {
		setConstString(offset + 22, $sls_tax_calc_typ_nm, value);
	}


	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 23, $sls_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 23, $sls_tax_rnd_typ, value);
	}


	/**
	 * Rounding type 売上税額端数処理区分名.<p>
	 *
	 */
	public String sls_tax_rnd_typ_nm() {
		return getConstString(offset + 24, $sls_tax_rnd_typ_nm);
	}

	/**
	 * Rounding type 売上税額端数処理区分名.<p>
	 *
	 */
	public void sls_tax_rnd_typ_nm(String value) {
		setConstString(offset + 24, $sls_tax_rnd_typ_nm, value);
	}


	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public String sls_tax_cd() {
		return getConstString(offset + 25, $sls_tax_cd);
	}

	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public void sls_tax_cd(String value) {
		setConstString(offset + 25, $sls_tax_cd, value);
	}


	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public String sls_tax_nm() {
		return getConstString(offset + 26, $sls_tax_nm);
	}

	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public void sls_tax_nm(String value) {
		setConstString(offset + 26, $sls_tax_nm, value);
	}


	/**
	 * Sales tax priority 売上税優先.<p>
	 *
	 */
	public boolean sls_tax_cd_prio_flg() {
		return getConstBoolean(offset + 27, $sls_tax_cd_prio_flg);
	}

	/**
	 * Sales tax priority 売上税優先.<p>
	 *
	 */
	public void sls_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 27, $sls_tax_cd_prio_flg, value);
	}


	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public String lot_back_stop_typ() {
		return getConstString(offset + 28, $lot_back_stop_typ);
	}

	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public void lot_back_stop_typ(String value) {
		setConstString(offset + 28, $lot_back_stop_typ, value);
	}


	/**
	 * Lot reverse prohibit type name ロット逆転禁止区分名.<p>
	 *
	 */
	public String lot_back_stop_typ_nm() {
		return getConstString(offset + 29, $lot_back_stop_typ_nm);
	}

	/**
	 * Lot reverse prohibit type name ロット逆転禁止区分名.<p>
	 *
	 */
	public void lot_back_stop_typ_nm(String value) {
		setConstString(offset + 29, $lot_back_stop_typ_nm, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 30, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 30, $sls_basis_typ, value);
	}


	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public String sls_basis_typ_nm() {
		return getConstString(offset + 31, $sls_basis_typ_nm);
	}

	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public void sls_basis_typ_nm(String value) {
		setConstString(offset + 31, $sls_basis_typ_nm, value);
	}


	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public String bill_basis_typ() {
		return getConstString(offset + 32, $bill_basis_typ);
	}

	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public void bill_basis_typ(String value) {
		setConstString(offset + 32, $bill_basis_typ, value);
	}


	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public String bill_basis_typ_nm() {
		return getConstString(offset + 33, $bill_basis_typ_nm);
	}

	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public void bill_basis_typ_nm(String value) {
		setConstString(offset + 33, $bill_basis_typ_nm, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 34, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 34, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 34, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 34, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 34, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 34, $bill_crryovr_times, value);
	}


	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public String slip_each_lot_typ() {
		return getConstString(offset + 35, $slip_each_lot_typ);
	}

	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public void slip_each_lot_typ(String value) {
		setConstString(offset + 35, $slip_each_lot_typ, value);
	}


	/**
	 * Lot details split type name ロット明細分割区分名.<p>
	 *
	 */
	public String slip_each_lot_typ_nm() {
		return getConstString(offset + 36, $slip_each_lot_typ_nm);
	}

	/**
	 * Lot details split type name ロット明細分割区分名.<p>
	 *
	 */
	public void slip_each_lot_typ_nm(String value) {
		setConstString(offset + 36, $slip_each_lot_typ_nm, value);
	}


	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 37, $ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 37, $ship_schd_split_typ, value);
	}


	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public String ship_schd_split_typ_nm() {
		return getConstString(offset + 38, $ship_schd_split_typ_nm);
	}

	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public void ship_schd_split_typ_nm(String value) {
		setConstString(offset + 38, $ship_schd_split_typ_nm, value);
	}


	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public boolean stk_lst_issue_flg() {
		return getConstBoolean(offset + 39, $stk_lst_issue_flg);
	}

	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public void stk_lst_issue_flg(boolean value) {
		setConstBoolean(offset + 39, $stk_lst_issue_flg, value);
	}


	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public String stk_lst_form_cd() {
		return getConstString(offset + 40, $stk_lst_form_cd);
	}

	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public void stk_lst_form_cd(String value) {
		setConstString(offset + 40, $stk_lst_form_cd, value);
	}


	/**
	 * Identification tag name 現品票名.<p>
	 *
	 */
	public String stk_lst_form_nm() {
		return getConstString(offset + 41, $stk_lst_form_nm);
	}

	/**
	 * Identification tag name 現品票名.<p>
	 *
	 */
	public void stk_lst_form_nm(String value) {
		setConstString(offset + 41, $stk_lst_form_nm, value);
	}


	/**
	 * Customer delivery note cd. 得意先納品書ＣＤ.<p>
	 *
	 */
	public String cst_ship_form_cd() {
		return getConstString(offset + 42, $cst_ship_form_cd);
	}

	/**
	 * Customer delivery note cd. 得意先納品書ＣＤ.<p>
	 *
	 */
	public void cst_ship_form_cd(String value) {
		setConstString(offset + 42, $cst_ship_form_cd, value);
	}


	/**
	 * Customer delivery note name 得意先納品書名.<p>
	 *
	 */
	public String cst_ship_form_nm() {
		return getConstString(offset + 43, $cst_ship_form_nm);
	}

	/**
	 * Customer delivery note name 得意先納品書名.<p>
	 *
	 */
	public void cst_ship_form_nm(String value) {
		setConstString(offset + 43, $cst_ship_form_nm, value);
	}


	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public boolean wrk_ar_flg() {
		return getConstBoolean(offset + 44, $wrk_ar_flg);
	}

	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public void wrk_ar_flg(boolean value) {
		setConstBoolean(offset + 44, $wrk_ar_flg, value);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 45, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 45, $cst_iv_flg, value);
	}


	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public MCNumber ship_lt() {
		return getConstNumber(offset + 46, $ship_lt);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(MCNumber value) {
		setConstNumber(offset + 46, $ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(int value) {
		setConstNumber(offset + 46, $ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(long value) {
		setConstNumber(offset + 46, $ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(float value) {
		setConstNumber(offset + 46, $ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(double value) {
		setConstNumber(offset + 46, $ship_lt, value);
	}


	/**
	 * Customer transaction terms cd. 1 得意先取引条件ＣＤ１.<p>
	 *
	 */
	public String cst_tterm_cd1() {
		return getConstString(offset + 47, $cst_tterm_cd1);
	}

	/**
	 * Customer transaction terms cd. 1 得意先取引条件ＣＤ１.<p>
	 *
	 */
	public void cst_tterm_cd1(String value) {
		setConstString(offset + 47, $cst_tterm_cd1, value);
	}


	/**
	 * Customer transaction terms name 1 得意先取引条件名１.<p>
	 *
	 */
	public String cst_tterm_nm1() {
		return getConstString(offset + 48, $cst_tterm_nm1);
	}

	/**
	 * Customer transaction terms name 1 得意先取引条件名１.<p>
	 *
	 */
	public void cst_tterm_nm1(String value) {
		setConstString(offset + 48, $cst_tterm_nm1, value);
	}


	/**
	 * Customer transaction terms cd. 2 得意先取引条件ＣＤ２.<p>
	 *
	 */
	public String cst_tterm_cd2() {
		return getConstString(offset + 49, $cst_tterm_cd2);
	}

	/**
	 * Customer transaction terms cd. 2 得意先取引条件ＣＤ２.<p>
	 *
	 */
	public void cst_tterm_cd2(String value) {
		setConstString(offset + 49, $cst_tterm_cd2, value);
	}


	/**
	 * Customer transaction terms name 2 得意先取引条件名２.<p>
	 *
	 */
	public String cst_tterm_nm2() {
		return getConstString(offset + 50, $cst_tterm_nm2);
	}

	/**
	 * Customer transaction terms name 2 得意先取引条件名２.<p>
	 *
	 */
	public void cst_tterm_nm2(String value) {
		setConstString(offset + 50, $cst_tterm_nm2, value);
	}


	/**
	 * Customer transaction terms cd. 3 得意先取引条件ＣＤ３.<p>
	 *
	 */
	public String cst_tterm_cd3() {
		return getConstString(offset + 51, $cst_tterm_cd3);
	}

	/**
	 * Customer transaction terms cd. 3 得意先取引条件ＣＤ３.<p>
	 *
	 */
	public void cst_tterm_cd3(String value) {
		setConstString(offset + 51, $cst_tterm_cd3, value);
	}


	/**
	 * Customer transaction terms name 3 得意先取引条件名３.<p>
	 *
	 */
	public String cst_tterm_nm3() {
		return getConstString(offset + 52, $cst_tterm_nm3);
	}

	/**
	 * Customer transaction terms name 3 得意先取引条件名３.<p>
	 *
	 */
	public void cst_tterm_nm3(String value) {
		setConstString(offset + 52, $cst_tterm_nm3, value);
	}


	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public String sls_anly_cd1() {
		return getConstString(offset + 53, $sls_anly_cd1);
	}

	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public void sls_anly_cd1(String value) {
		setConstString(offset + 53, $sls_anly_cd1, value);
	}


	/**
	 * Sales analysis name 1 販売分析名１.<p>
	 *
	 */
	public String sls_anly_nm1() {
		return getConstString(offset + 54, $sls_anly_nm1);
	}

	/**
	 * Sales analysis name 1 販売分析名１.<p>
	 *
	 */
	public void sls_anly_nm1(String value) {
		setConstString(offset + 54, $sls_anly_nm1, value);
	}


	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public String sls_anly_cd2() {
		return getConstString(offset + 55, $sls_anly_cd2);
	}

	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public void sls_anly_cd2(String value) {
		setConstString(offset + 55, $sls_anly_cd2, value);
	}


	/**
	 * Sales analysis name 2 販売分析名２.<p>
	 *
	 */
	public String sls_anly_nm2() {
		return getConstString(offset + 56, $sls_anly_nm2);
	}

	/**
	 * Sales analysis name 2 販売分析名２.<p>
	 *
	 */
	public void sls_anly_nm2(String value) {
		setConstString(offset + 56, $sls_anly_nm2, value);
	}


	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public String sls_anly_cd3() {
		return getConstString(offset + 57, $sls_anly_cd3);
	}

	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public void sls_anly_cd3(String value) {
		setConstString(offset + 57, $sls_anly_cd3, value);
	}


	/**
	 * Sales analysis name 3 販売分析名３.<p>
	 *
	 */
	public String sls_anly_nm3() {
		return getConstString(offset + 58, $sls_anly_nm3);
	}

	/**
	 * Sales analysis name 3 販売分析名３.<p>
	 *
	 */
	public void sls_anly_nm3(String value) {
		setConstString(offset + 58, $sls_anly_nm3, value);
	}


	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public boolean bcst_flg() {
		return getConstBoolean(offset + 59, $bcst_flg);
	}

	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public void bcst_flg(boolean value) {
		setConstBoolean(offset + 59, $bcst_flg, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 60, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 60, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 61, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 61, $bcst_nm, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 62, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 62, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 63, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 63, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 64, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 64, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 65, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 65, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 66, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 66, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 67, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 68, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 68, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 69, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 69, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 70, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 70, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 71, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 71, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 72, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 72, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 73, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 73, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 74, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 74, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 75, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 75, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 76, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 76, $del_ts, value);
	}


	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public String cst_prnt_typ() {
		return getConstString(offset + 77, $cst_prnt_typ);
	}

	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public void cst_prnt_typ(String value) {
		setConstString(offset + 77, $cst_prnt_typ, value);
	}


	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public String cst_prnt_typ_nm() {
		return getConstString(offset + 78, $cst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public void cst_prnt_typ_nm(String value) {
		setConstString(offset + 78, $cst_prnt_typ_nm, value);
	}


	/**
	 * Prohibit mixed distribution group 物流グループ混在不可.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 79, $not_lg_mix_flg);
	}

	/**
	 * Prohibit mixed distribution group 物流グループ混在不可.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 79, $not_lg_mix_flg, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 80, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 80, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 81, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 81, $not_sublot_mix_flg, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($ar_dpt_typ_nm.equalsIgnoreCase(name)) {
			return ar_dpt_typ_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			return check_ar_dpt_cd();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_upri_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ_nm();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_req_typ_nm();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ_nm();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ_nm();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ_nm();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($lot_back_stop_typ_nm.equalsIgnoreCase(name)) {
			return lot_back_stop_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			return bill_basis_typ_nm();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			return slip_each_lot_typ_nm();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			return ship_schd_split_typ_nm();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			return stk_lst_form_nm();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			return cst_ship_form_nm();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			return cst_tterm_nm1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			return cst_tterm_nm2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			return cst_tterm_nm3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			return sls_anly_nm1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			return sls_anly_nm2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			return sls_anly_nm3();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return cst_prnt_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($ar_dpt_typ_nm.equalsIgnoreCase(name)) {
			return ar_dpt_typ_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			return check_ar_dpt_cd();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_upri_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ_nm();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_req_typ_nm();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ_nm();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ_nm();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ_nm();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($lot_back_stop_typ_nm.equalsIgnoreCase(name)) {
			return lot_back_stop_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			return bill_basis_typ_nm();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			return slip_each_lot_typ_nm();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			return ship_schd_split_typ_nm();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			return stk_lst_form_nm();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			return cst_ship_form_nm();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			return cst_tterm_nm1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			return cst_tterm_nm2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			return cst_tterm_nm3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			return sls_anly_nm1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			return sls_anly_nm2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			return sls_anly_nm3();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return cst_prnt_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($ar_dpt_typ_nm.equalsIgnoreCase(name)) {
			ar_dpt_typ_nm(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			check_ar_dpt_cd(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ_nm(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_req_typ_nm(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ_nm(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			sls_tax_calc_typ_nm(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ_nm(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($lot_back_stop_typ_nm.equalsIgnoreCase(name)) {
			lot_back_stop_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			bill_basis_typ_nm(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			slip_each_lot_typ_nm(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			ship_schd_split_typ_nm(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			stk_lst_form_nm(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			cst_ship_form_nm(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			cst_tterm_nm1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			cst_tterm_nm2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			cst_tterm_nm3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			sls_anly_nm1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			sls_anly_nm2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			sls_anly_nm3(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			cst_prnt_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($ar_dpt_typ_nm.equalsIgnoreCase(name)) {
			ar_dpt_typ_nm(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($check_ar_dpt_cd.equalsIgnoreCase(name)) {
			check_ar_dpt_cd(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ_nm(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_req_typ_nm(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ_nm(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_calc_typ_nm.equalsIgnoreCase(name)) {
			sls_tax_calc_typ_nm(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ_nm(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($lot_back_stop_typ_nm.equalsIgnoreCase(name)) {
			lot_back_stop_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			bill_basis_typ_nm(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($slip_each_lot_typ_nm.equalsIgnoreCase(name)) {
			slip_each_lot_typ_nm(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			ship_schd_split_typ_nm(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($stk_lst_form_nm.equalsIgnoreCase(name)) {
			stk_lst_form_nm(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($cst_ship_form_nm.equalsIgnoreCase(name)) {
			cst_ship_form_nm(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			cst_tterm_nm1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			cst_tterm_nm2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			cst_tterm_nm3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_nm1.equalsIgnoreCase(name)) {
			sls_anly_nm1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_nm2.equalsIgnoreCase(name)) {
			sls_anly_nm2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($sls_anly_nm3.equalsIgnoreCase(name)) {
			sls_anly_nm3(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			cst_prnt_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

