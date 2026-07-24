package mcframe.clientMSBE.MSBEP1730;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $iv_mng_no = "iv_mng_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Is IV_NO that was numbered beforehand on the sales side 販売側事前に発番したIV_NOか.<p>
	 *
	 */
	public static final String $is_slo_iv_no = "is_slo_iv_no";
	/**
	 * Auto 自動.<p>
	 *
	 */
	public static final String $num_flg = "num_flg";
	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public static final String $iv_rev = "iv_rev";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public static final String $iv_dt = "iv_dt";
	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public static final String $iv_src_typ = "iv_src_typ";
	/**
	 * Invoice creating source type name インボイス作成元区分名.<p>
	 *
	 */
	public static final String $iv_src_typ_nm = "iv_src_typ_nm";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public static final String $cmpl_schd_dt = "cmpl_schd_dt";
	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public static final String $arr_schd_dt = "arr_schd_dt";
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public static final String $sls_schd_dt = "sls_schd_dt";
	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public static final String $cmpl_dt = "cmpl_dt";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public static final String $iv_ship_flg = "iv_ship_flg";
	/**
	 * Invoice immediate issue インボイス即時発行.<p>
	 *
	 */
	public static final String $iv_immed_prnt_flg = "iv_immed_prnt_flg";
	/**
	 * Invoice issued インボイス発行済.<p>
	 *
	 */
	public static final String $iv_prnt_flg = "iv_prnt_flg";
	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public static final String $pl_skip_flg = "pl_skip_flg";
	/**
	 * Packing list entered パッキングリスト登録済.<p>
	 *
	 */
	public static final String $pl_reg_flg = "pl_reg_flg";
	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public static final String $non_cmpl_flg = "non_cmpl_flg";
	/**
	 * Completed 完了済.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	/**
	 * Invoice unit shipping (Initial value) インボイス単位出荷（初期値）.<p>
	 *
	 */
	public static final String $old_iv_ship_flg = "old_iv_ship_flg";
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public static final String $dlv_id_typ_nm = "dlv_id_typ_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	public static final String $dlv_addr_p = "dlv_addr_p";
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ = "ship_rqst_id_typ";
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ_nm = "ship_rqst_id_typ_nm";
	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public static final String $ship_rqst_id_nm = "ship_rqst_id_nm";
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public static final String $via_dlv_typ_nm = "via_dlv_typ_nm";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	public static final String $tdlv_addr_p = "tdlv_addr_p";
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	/**
	 * Sold 売上済.<p>
	 *
	 */
	public static final String $sls_cmpl_flg = "sls_cmpl_flg";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public static final String $vssl_flght = "vssl_flght";
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public static final String $load_port_cd = "load_port_cd";
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public static final String $load_port_nm = "load_port_nm";
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public static final String $etd_dt = "etd_dt";
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public static final String $dschrg_port_cd = "dschrg_port_cd";
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public static final String $dschrg_port_nm = "dschrg_port_nm";
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public static final String $eta_dt = "eta_dt";
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public static final String $via_port_cd = "via_port_cd";
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public static final String $via_port_nm = "via_port_nm";
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public static final String $via_schd_dt = "via_schd_dt";
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public static final String $tterm_nm1 = "tterm_nm1";
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public static final String $tterm_nm2 = "tterm_nm2";
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public static final String $trd_amt_rnd_typ = "trd_amt_rnd_typ";
	/**
	 * Tax amount rounding type 税額端数処理区分.<p>
	 *
	 */
	public static final String $trd_tax_rnd_typ = "trd_tax_rnd_typ";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	public static final String $xrate_p = "xrate_p";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public static final String $ptax_cur_nm = "ptax_cur_nm";
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_amt_dec_place = "ptax_cur_amt_dec_place";
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	public static final String $ptax_xrate_p = "ptax_xrate_p";
	public static final String $trd_cur_amt_p = "trd_cur_amt_p";
	public static final String $trd_cur_amt_inc_tax_p = "trd_cur_amt_inc_tax_p";
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public static final String $lc_no = "lc_no";
	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public static final String $lc_dt = "lc_dt";
	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public static final String $lc_rmrks = "lc_rmrks";
	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public static final String $bl_no = "bl_no";
	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public static final String $bl_dt = "bl_dt";
	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public static final String $bl_rmrks = "bl_rmrks";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public static final String $iv_rmrks = "iv_rmrks";
	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public static final String $case_mrk1 = "case_mrk1";
	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public static final String $case_mrk2 = "case_mrk2";
	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public static final String $case_mrk3 = "case_mrk3";
	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public static final String $case_mrk4 = "case_mrk4";
	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public static final String $case_mrk5 = "case_mrk5";
	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public static final String $case_mrk6 = "case_mrk6";
	/**
	 * Purchase invoice temporary entry flg. 受領インボイス仮登録ＦＬＧ.<p>
	 *
	 */
	public static final String $pre_rcpt_iv_flg = "pre_rcpt_iv_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_ddlv_flg = "purc_ddlv_flg";
	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public static final String $ar_dpt_typ = "ar_dpt_typ";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $lnk_ar_dpt_cd = "lnk_ar_dpt_cd";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $iv_upd_cntr = "iv_upd_cntr";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";

	public static final String $dlv_lg_grp_cd = $dlv_addr_p + ".lg_grp_cd";
	public static final String $dlv_lg_grp_nm = $dlv_addr_p + ".lg_grp_nm";
	public static final String $dlv_cntry_cd = $dlv_addr_p + ".cntry_cd";
	public static final String $dlv_cntry_nm = $dlv_addr_p + ".cntry_nm";
	public static final String $dlv_zip_cd = $dlv_addr_p + ".zip_cd";
	public static final String $dlv_addr1 = $dlv_addr_p + ".addr1";
	public static final String $dlv_addr2 = $dlv_addr_p + ".addr2";
	public static final String $dlv_addr3 = $dlv_addr_p + ".addr3";
	public static final String $dlv_addr4 = $dlv_addr_p + ".addr4";
	public static final String $dlv_tel = $dlv_addr_p + ".tel";
	public static final String $dlv_fax = $dlv_addr_p + ".fax";
	public static final String $dlv_cntct_dpt = $dlv_addr_p + ".cntct_dpt";
	public static final String $dlv_cntct_psn = $dlv_addr_p + ".cntct_psn";
	public static final String $tdlv_lg_grp_cd = $tdlv_addr_p + ".lg_grp_cd";
	public static final String $tdlv_lg_grp_nm = $tdlv_addr_p + ".lg_grp_nm";
	public static final String $tdlv_cntry_cd = $tdlv_addr_p + ".cntry_cd";
	public static final String $tdlv_cntry_nm = $tdlv_addr_p + ".cntry_nm";
	public static final String $tdlv_zip_cd = $tdlv_addr_p + ".zip_cd";
	public static final String $tdlv_addr1 = $tdlv_addr_p + ".addr1";
	public static final String $tdlv_addr2 = $tdlv_addr_p + ".addr2";
	public static final String $tdlv_addr3 = $tdlv_addr_p + ".addr3";
	public static final String $tdlv_addr4 = $tdlv_addr_p + ".addr4";
	public static final String $tdlv_tel = $tdlv_addr_p + ".tel";
	public static final String $tdlv_fax = $tdlv_addr_p + ".fax";
	public static final String $tdlv_cntct_dpt = $tdlv_addr_p + ".cntct_dpt";
	public static final String $tdlv_cntct_psn = $tdlv_addr_p + ".cntct_psn";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $ptax_xrate = $ptax_xrate_p + ".xrate";
	public static final String $trd_cur_amt = $trd_cur_amt_p + ".amt";
	public static final String $trd_cur_amt_inc_tax = $trd_cur_amt_inc_tax_p + ".amt";

	public static final MCMeta iv_mng_no_META = createCommonMeta($iv_mng_no, mcframe.commonMA.meta.MA_META.IV_MNG_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta is_slo_iv_no_META = createCommonMeta($is_slo_iv_no, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_flg_META = createCommonMeta($num_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_rev_META = createCommonMeta($iv_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_dt_META = createCommonMeta($iv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_src_typ_META = createCommonMeta($iv_src_typ, mcframe.commonMS.meta.MS_META.IV_SRC_TYP);
	public static final MCMeta iv_src_typ_nm_META = createCommonMeta($iv_src_typ_nm, mcframe.commonMS.meta.MS_META.IV_SRC_TYP_NM);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta cmpl_schd_dt_META = createCommonMeta($cmpl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_dt_META = createCommonMeta($arr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_schd_dt_META = createCommonMeta($sls_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cmpl_dt_META = createCommonMeta($cmpl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_ship_flg_META = createCommonMeta($iv_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_immed_prnt_flg_META = createCommonMeta($iv_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_prnt_flg_META = createCommonMeta($iv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_skip_flg_META = createCommonMeta($pl_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_reg_flg_META = createCommonMeta($pl_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_cmpl_flg_META = createCommonMeta($non_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_iv_ship_flg_META = createCommonMeta($old_iv_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_addr_p_META = createInnerRowMeta($dlv_addr_p, mcframe.clientMAUB.MAUBP0410.AddrR.class);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta ship_rqst_id_typ_nm_META = createCommonMeta($ship_rqst_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP_NM);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta via_dlv_typ_nm_META = createCommonMeta($via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_addr_p_META = createInnerRowMeta($tdlv_addr_p, mcframe.clientMAUB.MAUBP0410.AddrR.class);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cmpl_flg_META = createCommonMeta($sls_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta load_port_nm_META = createCommonMeta($load_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta dschrg_port_nm_META = createCommonMeta($dschrg_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_port_nm_META = createCommonMeta($via_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_amt_rnd_typ_META = createCommonMeta($trd_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_tax_rnd_typ_META = createCommonMeta($trd_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP0420.XrateR.class);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_p_META = createInnerRowMeta($ptax_xrate_p, mcframe.clientMAUB.MAUBP0420.XrateR.class);
	public static final MCMeta trd_cur_amt_p_META = createInnerRowMeta($trd_cur_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta trd_cur_amt_inc_tax_p_META = createInnerRowMeta($trd_cur_amt_inc_tax_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lc_no_META = createCommonMeta($lc_no, mcframe.commonMA.meta.MA_META.LC_NO);
	public static final MCMeta lc_dt_META = createCommonMeta($lc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lc_rmrks_META = createCommonMeta($lc_rmrks, mcframe.commonMS.meta.MS_META.LC_RMRKS);
	public static final MCMeta bl_no_META = createCommonMeta($bl_no, mcframe.commonMA.meta.MA_META.BL_NO);
	public static final MCMeta bl_dt_META = createCommonMeta($bl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bl_rmrks_META = createCommonMeta($bl_rmrks, mcframe.commonMS.meta.MS_META.BL_RMRKS);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta iv_rmrks_META = createCommonMeta($iv_rmrks, mcframe.commonMS.meta.MS_META.IV_RMRKS);
	public static final MCMeta case_mrk1_META = createCommonMeta($case_mrk1, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk2_META = createCommonMeta($case_mrk2, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk3_META = createCommonMeta($case_mrk3, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk4_META = createCommonMeta($case_mrk4, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk5_META = createCommonMeta($case_mrk5, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk6_META = createCommonMeta($case_mrk6, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta pre_rcpt_iv_flg_META = createCommonMeta($pre_rcpt_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IV_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta purc_ddlv_flg_META = createCommonMeta($purc_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.AR_DPT_TYP);
	public static final MCMeta lnk_ar_dpt_cd_META = createCommonMeta($lnk_ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta iv_upd_cntr_META = createCommonMeta($iv_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			iv_mng_no_META,
			rcpt_iv_mng_no_META,
			trd_ptn_typ_META,
			sls_basis_typ_META,
			prov_basis_typ_META,
			iv_no_META,
			is_slo_iv_no_META,
			num_flg_META,
			iv_rev_META,
			latest_flg_META,
			can_flg_META,
			iv_dt_META,
			iv_src_typ_META,
			iv_src_typ_nm_META,
			rcpt_iv_no_META,
			cmpl_schd_dt_META,
			arr_schd_dt_META,
			sls_schd_dt_META,
			cmpl_dt_META,
			ac_dt_META,
			iv_ship_flg_META,
			iv_immed_prnt_flg_META,
			iv_prnt_flg_META,
			pl_skip_flg_META,
			pl_reg_flg_META,
			non_cmpl_flg_META,
			cmpl_flg_META,
			old_iv_ship_flg_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_sundry_flg_META,
			dlv_addr_p_META,
			ship_rqst_id_typ_META,
			ship_rqst_id_typ_nm_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			sls_upri_cng_flg_META,
			via_dlv_typ_META,
			via_dlv_typ_nm_META,
			tdlv_cd_META,
			tdlv_nm_META,
			tdlv_sundry_flg_META,
			tdlv_addr_p_META,
			sls_cststk_flg_META,
			sls_cmpl_flg_META,
			trnspt_cd_META,
			trnspt_nm_META,
			vssl_flght_META,
			load_port_cd_META,
			load_port_nm_META,
			etd_dt_META,
			dschrg_port_cd_META,
			dschrg_port_nm_META,
			eta_dt_META,
			via_port_cd_META,
			via_port_nm_META,
			via_schd_dt_META,
			tterm_cd1_META,
			tterm_nm1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_nm2_META,
			tterm_rmrks2_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_upri_dec_place_META,
			trd_cur_amt_dec_place_META,
			trd_amt_rnd_typ_META,
			trd_tax_rnd_typ_META,
			base_cur_cd_META,
			base_cur_nm_META,
			xrate_cd_META,
			xrate_inpt_flg_META,
			xrate_p_META,
			ptax_cur_cd_META,
			ptax_cur_nm_META,
			ptax_cur_amt_dec_place_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_p_META,
			trd_cur_amt_p_META,
			trd_cur_amt_inc_tax_p_META,
			tterm_cd3_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			bill_basis_dt_META,
			rcv_schd_dt_META,
			lc_no_META,
			lc_dt_META,
			lc_rmrks_META,
			bl_no_META,
			bl_dt_META,
			bl_rmrks_META,
			ship_fr_lg_grp_cd_META,
			iv_rmrks_META,
			case_mrk1_META,
			case_mrk2_META,
			case_mrk3_META,
			case_mrk4_META,
			case_mrk5_META,
			case_mrk6_META,
			pre_rcpt_iv_flg_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			bill_cl_typ_META,
			purc_ddlv_flg_META,
			ar_dpt_typ_META,
			lnk_ar_dpt_cd_META,
			prnt_lcl_cd_META,
			iv_upd_cntr_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"dlv_lg_grp_cd",
				"dlv_lg_grp_nm",
				"dlv_cntry_cd",
				"dlv_cntry_nm",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"tdlv_lg_grp_cd",
				"tdlv_lg_grp_nm",
				"tdlv_cntry_cd",
				"tdlv_cntry_nm",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"xrate",
				"ptax_xrate",
				"trd_cur_amt",
				"trd_cur_amt_inc_tax"
			},
			{
				$dlv_lg_grp_cd,
				$dlv_lg_grp_nm,
				$dlv_cntry_cd,
				$dlv_cntry_nm,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$tdlv_lg_grp_cd,
				$tdlv_lg_grp_nm,
				$tdlv_cntry_cd,
				$tdlv_cntry_nm,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$xrate,
				$ptax_xrate,
				$trd_cur_amt,
				$trd_cur_amt_inc_tax
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
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
				{$load_port_cd, "port_nm"},	// load_port_cd
				{$dschrg_port_cd, "port_nm"},	// dschrg_port_cd
				{$via_port_cd, "port_nm"},	// via_port_cd
				{$tterm_cd1, "tterm_nm"},	// tterm_cd1
				{$tterm_cd2, "tterm_nm"},	// tterm_cd2
				{$trd_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"},	// trd_cur_cd
				{$tterm_cd3, "tterm_nm"}	// tterm_cd3
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
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"},	// base_cur_nm
				{$xrate_cd, "BASE_CUR"},	// xrate_cd
				{$xrate_inpt_flg, "BASE_CUR"},	// xrate_inpt_flg
				{$xrate_p + ".xrate", "BASE_CUR"},	// xrate_p.xrate
				{$ptax_cur_cd, "PTAX"},	// ptax_cur_cd
				{$ptax_cur_nm, "PTAX"},	// ptax_cur_nm
				{$ptax_cur_amt_dec_place, "PTAX"},	// ptax_cur_amt_dec_place
				{$ptax_xrate_inpt_flg, "PTAX"},	// ptax_xrate_inpt_flg
				{$ptax_xrate_p + ".xrate", "PTAX"},	// ptax_xrate_p.xrate
				{$ship_fr_lg_grp_cd, "LG_GRP"}	// ship_fr_lg_grp_cd
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public String iv_mng_no() {
		return getConstString(offset + 0, $iv_mng_no);
	}

	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public void iv_mng_no(String value) {
		setConstString(offset + 0, $iv_mng_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 1, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 1, $rcpt_iv_mng_no, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 2, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 2, $trd_ptn_typ, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 3, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 3, $sls_basis_typ, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 4, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 4, $prov_basis_typ, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 5, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 5, $iv_no, value);
	}


	/**
	 * Is IV_NO that was numbered beforehand on the sales side 販売側事前に発番したIV_NOか.<p>
	 *
	 */
	public boolean is_slo_iv_no() {
		return getConstBoolean(offset + 6, $is_slo_iv_no);
	}

	/**
	 * Is IV_NO that was numbered beforehand on the sales side 販売側事前に発番したIV_NOか.<p>
	 *
	 */
	public void is_slo_iv_no(boolean value) {
		setConstBoolean(offset + 6, $is_slo_iv_no, value);
	}


	/**
	 * Auto 自動.<p>
	 *
	 */
	public boolean num_flg() {
		return getConstBoolean(offset + 7, $num_flg);
	}

	/**
	 * Auto 自動.<p>
	 *
	 */
	public void num_flg(boolean value) {
		setConstBoolean(offset + 7, $num_flg, value);
	}


	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public MCNumber iv_rev() {
		return getConstNumber(offset + 8, $iv_rev);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(MCNumber value) {
		setConstNumber(offset + 8, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(int value) {
		setConstNumber(offset + 8, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(long value) {
		setConstNumber(offset + 8, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(float value) {
		setConstNumber(offset + 8, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(double value) {
		setConstNumber(offset + 8, $iv_rev, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 9, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 9, $latest_flg, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 10, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 10, $can_flg, value);
	}


	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public MCDate iv_dt() {
		return getConstDate(offset + 11, $iv_dt);
	}

	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		setConstDate(offset + 11, $iv_dt, value);
	}


	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public String iv_src_typ() {
		return getConstString(offset + 12, $iv_src_typ);
	}

	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public void iv_src_typ(String value) {
		setConstString(offset + 12, $iv_src_typ, value);
	}


	/**
	 * Invoice creating source type name インボイス作成元区分名.<p>
	 *
	 */
	public String iv_src_typ_nm() {
		return getConstString(offset + 13, $iv_src_typ_nm);
	}

	/**
	 * Invoice creating source type name インボイス作成元区分名.<p>
	 *
	 */
	public void iv_src_typ_nm(String value) {
		setConstString(offset + 13, $iv_src_typ_nm, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 14, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 14, $rcpt_iv_no, value);
	}


	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public MCDate cmpl_schd_dt() {
		return getConstDate(offset + 15, $cmpl_schd_dt);
	}

	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public void cmpl_schd_dt(MCDate value) {
		setConstDate(offset + 15, $cmpl_schd_dt, value);
	}


	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCDate arr_schd_dt() {
		return getConstDate(offset + 16, $arr_schd_dt);
	}

	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public void arr_schd_dt(MCDate value) {
		setConstDate(offset + 16, $arr_schd_dt, value);
	}


	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCDate sls_schd_dt() {
		return getConstDate(offset + 17, $sls_schd_dt);
	}

	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public void sls_schd_dt(MCDate value) {
		setConstDate(offset + 17, $sls_schd_dt, value);
	}


	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public MCDate cmpl_dt() {
		return getConstDate(offset + 18, $cmpl_dt);
	}

	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public void cmpl_dt(MCDate value) {
		setConstDate(offset + 18, $cmpl_dt, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 19, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 19, $ac_dt, value);
	}


	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public boolean iv_ship_flg() {
		return getConstBoolean(offset + 20, $iv_ship_flg);
	}

	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public void iv_ship_flg(boolean value) {
		setConstBoolean(offset + 20, $iv_ship_flg, value);
	}


	/**
	 * Invoice immediate issue インボイス即時発行.<p>
	 *
	 */
	public boolean iv_immed_prnt_flg() {
		return getConstBoolean(offset + 21, $iv_immed_prnt_flg);
	}

	/**
	 * Invoice immediate issue インボイス即時発行.<p>
	 *
	 */
	public void iv_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 21, $iv_immed_prnt_flg, value);
	}


	/**
	 * Invoice issued インボイス発行済.<p>
	 *
	 */
	public boolean iv_prnt_flg() {
		return getConstBoolean(offset + 22, $iv_prnt_flg);
	}

	/**
	 * Invoice issued インボイス発行済.<p>
	 *
	 */
	public void iv_prnt_flg(boolean value) {
		setConstBoolean(offset + 22, $iv_prnt_flg, value);
	}


	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public boolean pl_skip_flg() {
		return getConstBoolean(offset + 23, $pl_skip_flg);
	}

	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public void pl_skip_flg(boolean value) {
		setConstBoolean(offset + 23, $pl_skip_flg, value);
	}


	/**
	 * Packing list entered パッキングリスト登録済.<p>
	 *
	 */
	public boolean pl_reg_flg() {
		return getConstBoolean(offset + 24, $pl_reg_flg);
	}

	/**
	 * Packing list entered パッキングリスト登録済.<p>
	 *
	 */
	public void pl_reg_flg(boolean value) {
		setConstBoolean(offset + 24, $pl_reg_flg, value);
	}


	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public boolean non_cmpl_flg() {
		return getConstBoolean(offset + 25, $non_cmpl_flg);
	}

	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public void non_cmpl_flg(boolean value) {
		setConstBoolean(offset + 25, $non_cmpl_flg, value);
	}


	/**
	 * Completed 完了済.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 26, $cmpl_flg);
	}

	/**
	 * Completed 完了済.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 26, $cmpl_flg, value);
	}


	/**
	 * Invoice unit shipping (Initial value) インボイス単位出荷（初期値）.<p>
	 *
	 */
	public boolean old_iv_ship_flg() {
		return getConstBoolean(offset + 27, $old_iv_ship_flg);
	}

	/**
	 * Invoice unit shipping (Initial value) インボイス単位出荷（初期値）.<p>
	 *
	 */
	public void old_iv_ship_flg(boolean value) {
		setConstBoolean(offset + 27, $old_iv_ship_flg, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 28, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 28, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 29, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 29, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 30, $dlv_id_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 30, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 31, $dlv_id_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 31, $dlv_id_nm, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 32, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 32, $dlv_sundry_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0410.AddrR dlv_addr_p(){
		return (mcframe.clientMAUB.MAUBP0410.AddrR) getConstInnerRow(offset + 33, $dlv_addr_p);
	}
	
	public void dlv_addr_p(mcframe.clientMAUB.MAUBP0410.AddrR row){
		setConstInnerRow(offset + 33, $dlv_addr_p, row);
	}


	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 34, $ship_rqst_id_typ);
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 34, $ship_rqst_id_typ, value);
	}


	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public String ship_rqst_id_typ_nm() {
		return getConstString(offset + 35, $ship_rqst_id_typ_nm);
	}

	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public void ship_rqst_id_typ_nm(String value) {
		setConstString(offset + 35, $ship_rqst_id_typ_nm, value);
	}


	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 36, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 36, $ship_rqst_id_cd, value);
	}


	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 37, $ship_rqst_id_nm);
	}

	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 37, $ship_rqst_id_nm, value);
	}


	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 38, $sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 38, $sls_upri_cng_flg, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 39, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 39, $via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public String via_dlv_typ_nm() {
		return getConstString(offset + 40, $via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public void via_dlv_typ_nm(String value) {
		setConstString(offset + 40, $via_dlv_typ_nm, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 41, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 41, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 42, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 42, $tdlv_nm, value);
	}


	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 43, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 43, $tdlv_sundry_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0410.AddrR tdlv_addr_p(){
		return (mcframe.clientMAUB.MAUBP0410.AddrR) getConstInnerRow(offset + 44, $tdlv_addr_p);
	}
	
	public void tdlv_addr_p(mcframe.clientMAUB.MAUBP0410.AddrR row){
		setConstInnerRow(offset + 44, $tdlv_addr_p, row);
	}


	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 45, $sls_cststk_flg);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 45, $sls_cststk_flg, value);
	}


	/**
	 * Sold 売上済.<p>
	 *
	 */
	public boolean sls_cmpl_flg() {
		return getConstBoolean(offset + 46, $sls_cmpl_flg);
	}

	/**
	 * Sold 売上済.<p>
	 *
	 */
	public void sls_cmpl_flg(boolean value) {
		setConstBoolean(offset + 46, $sls_cmpl_flg, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 47, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 47, $trnspt_cd, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 48, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 48, $trnspt_nm, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 49, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 49, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 50, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 50, $load_port_cd, value);
	}


	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 51, $load_port_nm);
	}

	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 51, $load_port_nm, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 52, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 52, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 53, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 53, $dschrg_port_cd, value);
	}


	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 54, $dschrg_port_nm);
	}

	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 54, $dschrg_port_nm, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 55, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 55, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 56, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 56, $via_port_cd, value);
	}


	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 57, $via_port_nm);
	}

	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 57, $via_port_nm, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 58, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 58, $via_schd_dt, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 59, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 59, $tterm_cd1, value);
	}


	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 60, $tterm_nm1);
	}

	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 60, $tterm_nm1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 61, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 61, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 62, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 62, $tterm_cd2, value);
	}


	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 63, $tterm_nm2);
	}

	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 63, $tterm_nm2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 64, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 64, $tterm_rmrks2, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 65, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 65, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 66, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 66, $trd_cur_nm, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 67, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 67, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 67, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 67, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 67, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 67, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 68, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 68, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public String trd_amt_rnd_typ() {
		return getConstString(offset + 69, $trd_amt_rnd_typ);
	}

	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public void trd_amt_rnd_typ(String value) {
		setConstString(offset + 69, $trd_amt_rnd_typ, value);
	}


	/**
	 * Tax amount rounding type 税額端数処理区分.<p>
	 *
	 */
	public String trd_tax_rnd_typ() {
		return getConstString(offset + 70, $trd_tax_rnd_typ);
	}

	/**
	 * Tax amount rounding type 税額端数処理区分.<p>
	 *
	 */
	public void trd_tax_rnd_typ(String value) {
		setConstString(offset + 70, $trd_tax_rnd_typ, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 71, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 71, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 72, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 72, $base_cur_nm, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 73, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 73, $xrate_cd, value);
	}


	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 74, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 74, $xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0420.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP0420.XrateR) getConstInnerRow(offset + 75, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP0420.XrateR row){
		setConstInnerRow(offset + 75, $xrate_p, row);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 76, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 76, $ptax_cur_cd, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 77, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 77, $ptax_cur_nm, value);
	}


	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 78, $ptax_cur_amt_dec_place);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 78, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 78, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 78, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 78, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 78, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 79, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 79, $ptax_xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0420.XrateR ptax_xrate_p(){
		return (mcframe.clientMAUB.MAUBP0420.XrateR) getConstInnerRow(offset + 80, $ptax_xrate_p);
	}
	
	public void ptax_xrate_p(mcframe.clientMAUB.MAUBP0420.XrateR row){
		setConstInnerRow(offset + 80, $ptax_xrate_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 81, $trd_cur_amt_p);
	}
	
	public void trd_cur_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 81, $trd_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR trd_cur_amt_inc_tax_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 82, $trd_cur_amt_inc_tax_p);
	}
	
	public void trd_cur_amt_inc_tax_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 82, $trd_cur_amt_inc_tax_p, row);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 83, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 83, $tterm_cd3, value);
	}


	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 84, $tterm_nm3);
	}

	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 84, $tterm_nm3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 85, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 85, $tterm_rmrks3, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 86, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 86, $bill_basis_dt, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 87, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 87, $rcv_schd_dt, value);
	}


	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public String lc_no() {
		return getConstString(offset + 88, $lc_no);
	}

	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public void lc_no(String value) {
		setConstString(offset + 88, $lc_no, value);
	}


	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCDate lc_dt() {
		return getConstDate(offset + 89, $lc_dt);
	}

	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public void lc_dt(MCDate value) {
		setConstDate(offset + 89, $lc_dt, value);
	}


	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public String lc_rmrks() {
		return getConstString(offset + 90, $lc_rmrks);
	}

	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public void lc_rmrks(String value) {
		setConstString(offset + 90, $lc_rmrks, value);
	}


	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public String bl_no() {
		return getConstString(offset + 91, $bl_no);
	}

	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public void bl_no(String value) {
		setConstString(offset + 91, $bl_no, value);
	}


	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCDate bl_dt() {
		return getConstDate(offset + 92, $bl_dt);
	}

	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public void bl_dt(MCDate value) {
		setConstDate(offset + 92, $bl_dt, value);
	}


	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public String bl_rmrks() {
		return getConstString(offset + 93, $bl_rmrks);
	}

	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public void bl_rmrks(String value) {
		setConstString(offset + 93, $bl_rmrks, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 94, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 94, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public String iv_rmrks() {
		return getConstString(offset + 95, $iv_rmrks);
	}

	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public void iv_rmrks(String value) {
		setConstString(offset + 95, $iv_rmrks, value);
	}


	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public String case_mrk1() {
		return getConstString(offset + 96, $case_mrk1);
	}

	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public void case_mrk1(String value) {
		setConstString(offset + 96, $case_mrk1, value);
	}


	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public String case_mrk2() {
		return getConstString(offset + 97, $case_mrk2);
	}

	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public void case_mrk2(String value) {
		setConstString(offset + 97, $case_mrk2, value);
	}


	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public String case_mrk3() {
		return getConstString(offset + 98, $case_mrk3);
	}

	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public void case_mrk3(String value) {
		setConstString(offset + 98, $case_mrk3, value);
	}


	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public String case_mrk4() {
		return getConstString(offset + 99, $case_mrk4);
	}

	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public void case_mrk4(String value) {
		setConstString(offset + 99, $case_mrk4, value);
	}


	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public String case_mrk5() {
		return getConstString(offset + 100, $case_mrk5);
	}

	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public void case_mrk5(String value) {
		setConstString(offset + 100, $case_mrk5, value);
	}


	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public String case_mrk6() {
		return getConstString(offset + 101, $case_mrk6);
	}

	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public void case_mrk6(String value) {
		setConstString(offset + 101, $case_mrk6, value);
	}


	/**
	 * Purchase invoice temporary entry flg. 受領インボイス仮登録ＦＬＧ.<p>
	 *
	 */
	public boolean pre_rcpt_iv_flg() {
		return getConstBoolean(offset + 102, $pre_rcpt_iv_flg);
	}

	/**
	 * Purchase invoice temporary entry flg. 受領インボイス仮登録ＦＬＧ.<p>
	 *
	 */
	public void pre_rcpt_iv_flg(boolean value) {
		setConstBoolean(offset + 102, $pre_rcpt_iv_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 103, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 103, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 104, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 104, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 105, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 105, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 106, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 106, $sub_char3, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 107, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 107, $bill_cl_typ, value);
	}


	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return getConstBoolean(offset + 108, $purc_ddlv_flg);
	}

	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		setConstBoolean(offset + 108, $purc_ddlv_flg, value);
	}


	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 109, $ar_dpt_typ);
	}

	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 109, $ar_dpt_typ, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String lnk_ar_dpt_cd() {
		return getConstString(offset + 110, $lnk_ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void lnk_ar_dpt_cd(String value) {
		setConstString(offset + 110, $lnk_ar_dpt_cd, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 111, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 111, $prnt_lcl_cd, value);
	}


	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber iv_upd_cntr() {
		return getConstNumber(offset + 112, $iv_upd_cntr);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 112, $iv_upd_cntr, value);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(int value) {
		setConstNumber(offset + 112, $iv_upd_cntr, value);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(long value) {
		setConstNumber(offset + 112, $iv_upd_cntr, value);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(float value) {
		setConstNumber(offset + 112, $iv_upd_cntr, value);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(double value) {
		setConstNumber(offset + 112, $iv_upd_cntr, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 113, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 113, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 114, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 114, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 115, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 115, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 116, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 116, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 117, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 117, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 118, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 118, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 119, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 119, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 120, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 120, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 121, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 121, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 122, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 122, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 123, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 123, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			return iv_src_typ();
		}
		if ($iv_src_typ_nm.equalsIgnoreCase(name)) {
			return iv_src_typ_nm();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ_nm();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($trd_amt_rnd_typ.equalsIgnoreCase(name)) {
			return trd_amt_rnd_typ();
		}
		if ($trd_tax_rnd_typ.equalsIgnoreCase(name)) {
			return trd_tax_rnd_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			return case_mrk1();
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			return case_mrk2();
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			return case_mrk3();
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			return case_mrk4();
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			return case_mrk5();
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			return case_mrk6();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($lnk_ar_dpt_cd.equalsIgnoreCase(name)) {
			return lnk_ar_dpt_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			return iv_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			return cmpl_schd_dt();
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($is_slo_iv_no.equalsIgnoreCase(name)) {
			return is_slo_iv_no();
		}
		if ($num_flg.equalsIgnoreCase(name)) {
			return num_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			return iv_ship_flg();
		}
		if ($iv_immed_prnt_flg.equalsIgnoreCase(name)) {
			return iv_immed_prnt_flg();
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			return iv_prnt_flg();
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			return pl_reg_flg();
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			return non_cmpl_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($old_iv_ship_flg.equalsIgnoreCase(name)) {
			return old_iv_ship_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_cmpl_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			return pre_rcpt_iv_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			return iv_src_typ();
		}
		if ($iv_src_typ_nm.equalsIgnoreCase(name)) {
			return iv_src_typ_nm();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ_nm();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($trd_amt_rnd_typ.equalsIgnoreCase(name)) {
			return trd_amt_rnd_typ();
		}
		if ($trd_tax_rnd_typ.equalsIgnoreCase(name)) {
			return trd_tax_rnd_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			return case_mrk1();
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			return case_mrk2();
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			return case_mrk3();
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			return case_mrk4();
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			return case_mrk5();
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			return case_mrk6();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($lnk_ar_dpt_cd.equalsIgnoreCase(name)) {
			return lnk_ar_dpt_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			return iv_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			return cmpl_schd_dt();
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($is_slo_iv_no.equalsIgnoreCase(name)) {
			return is_slo_iv_no();
		}
		if ($num_flg.equalsIgnoreCase(name)) {
			return num_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			return iv_ship_flg();
		}
		if ($iv_immed_prnt_flg.equalsIgnoreCase(name)) {
			return iv_immed_prnt_flg();
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			return iv_prnt_flg();
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			return pl_reg_flg();
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			return non_cmpl_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($old_iv_ship_flg.equalsIgnoreCase(name)) {
			return old_iv_ship_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_cmpl_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			return pre_rcpt_iv_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			iv_src_typ(value);
			return;
		}
		if ($iv_src_typ_nm.equalsIgnoreCase(name)) {
			iv_src_typ_nm(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_typ_nm(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($trd_amt_rnd_typ.equalsIgnoreCase(name)) {
			trd_amt_rnd_typ(value);
			return;
		}
		if ($trd_tax_rnd_typ.equalsIgnoreCase(name)) {
			trd_tax_rnd_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			case_mrk1(value);
			return;
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			case_mrk2(value);
			return;
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			case_mrk3(value);
			return;
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			case_mrk4(value);
			return;
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			case_mrk5(value);
			return;
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			case_mrk6(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($lnk_ar_dpt_cd.equalsIgnoreCase(name)) {
			lnk_ar_dpt_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			cmpl_schd_dt(value);
			return;
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
			return;
		}
		super.setDate(name, value);
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
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($is_slo_iv_no.equalsIgnoreCase(name)) {
			is_slo_iv_no(value);
			return;
		}
		if ($num_flg.equalsIgnoreCase(name)) {
			num_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			iv_ship_flg(value);
			return;
		}
		if ($iv_immed_prnt_flg.equalsIgnoreCase(name)) {
			iv_immed_prnt_flg(value);
			return;
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			iv_prnt_flg(value);
			return;
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			pl_reg_flg(value);
			return;
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			non_cmpl_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($old_iv_ship_flg.equalsIgnoreCase(name)) {
			old_iv_ship_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			sls_cmpl_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			pre_rcpt_iv_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			iv_src_typ(value);
			return;
		}
		if ($iv_src_typ_nm.equalsIgnoreCase(name)) {
			iv_src_typ_nm(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_typ_nm(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($trd_amt_rnd_typ.equalsIgnoreCase(name)) {
			trd_amt_rnd_typ(value);
			return;
		}
		if ($trd_tax_rnd_typ.equalsIgnoreCase(name)) {
			trd_tax_rnd_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			case_mrk1(value);
			return;
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			case_mrk2(value);
			return;
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			case_mrk3(value);
			return;
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			case_mrk4(value);
			return;
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			case_mrk5(value);
			return;
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			case_mrk6(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($lnk_ar_dpt_cd.equalsIgnoreCase(name)) {
			lnk_ar_dpt_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			cmpl_schd_dt(value);
			return;
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
			return;
		}
		super.setDateNE(name, value);
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
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($is_slo_iv_no.equalsIgnoreCase(name)) {
			is_slo_iv_no(value);
			return;
		}
		if ($num_flg.equalsIgnoreCase(name)) {
			num_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			iv_ship_flg(value);
			return;
		}
		if ($iv_immed_prnt_flg.equalsIgnoreCase(name)) {
			iv_immed_prnt_flg(value);
			return;
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			iv_prnt_flg(value);
			return;
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			pl_reg_flg(value);
			return;
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			non_cmpl_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($old_iv_ship_flg.equalsIgnoreCase(name)) {
			old_iv_ship_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			sls_cmpl_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			pre_rcpt_iv_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dlv_addr_p.equalsIgnoreCase(name)) {
			return dlv_addr_p();
		}
		if ($tdlv_addr_p.equalsIgnoreCase(name)) {
			return tdlv_addr_p();
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
		}
		if ($ptax_xrate_p.equalsIgnoreCase(name)) {
			return ptax_xrate_p();
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_amt_p();
		}
		if ($trd_cur_amt_inc_tax_p.equalsIgnoreCase(name)) {
			return trd_cur_amt_inc_tax_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlv_addr_p.equalsIgnoreCase(name)) {
			dlv_addr_p(
				((MCContainerMeta) dlv_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0410.AddrR.class, value)
			);
			return;
		}
		if ($tdlv_addr_p.equalsIgnoreCase(name)) {
			tdlv_addr_p(
				((MCContainerMeta) tdlv_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0410.AddrR.class, value)
			);
			return;
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			xrate_p(
				((MCContainerMeta) xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0420.XrateR.class, value)
			);
			return;
		}
		if ($ptax_xrate_p.equalsIgnoreCase(name)) {
			ptax_xrate_p(
				((MCContainerMeta) ptax_xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0420.XrateR.class, value)
			);
			return;
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			trd_cur_amt_p(
				((MCContainerMeta) trd_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_amt_inc_tax_p.equalsIgnoreCase(name)) {
			trd_cur_amt_inc_tax_p(
				((MCContainerMeta) trd_cur_amt_inc_tax_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String dlv_lg_grp_cd() {
		return dlv_addr_p().lg_grp_cd();
	}

	public void dlv_lg_grp_cd(String value) {
		dlv_addr_p().lg_grp_cd(value);
	}

	public String dlv_lg_grp_nm() {
		return dlv_addr_p().lg_grp_nm();
	}

	public void dlv_lg_grp_nm(String value) {
		dlv_addr_p().lg_grp_nm(value);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return dlv_addr_p().cntry_cd();
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		dlv_addr_p().cntry_cd(value);
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return dlv_addr_p().cntry_nm();
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		dlv_addr_p().cntry_nm(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return dlv_addr_p().zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		dlv_addr_p().zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return dlv_addr_p().addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		dlv_addr_p().addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return dlv_addr_p().addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		dlv_addr_p().addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return dlv_addr_p().addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		dlv_addr_p().addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return dlv_addr_p().addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		dlv_addr_p().addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return dlv_addr_p().tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		dlv_addr_p().tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return dlv_addr_p().fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		dlv_addr_p().fax(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return dlv_addr_p().cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		dlv_addr_p().cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return dlv_addr_p().cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		dlv_addr_p().cntct_psn(value);
	}

	public String tdlv_lg_grp_cd() {
		return tdlv_addr_p().lg_grp_cd();
	}

	public void tdlv_lg_grp_cd(String value) {
		tdlv_addr_p().lg_grp_cd(value);
	}

	public String tdlv_lg_grp_nm() {
		return tdlv_addr_p().lg_grp_nm();
	}

	public void tdlv_lg_grp_nm(String value) {
		tdlv_addr_p().lg_grp_nm(value);
	}

	public String tdlv_cntry_cd() {
		return tdlv_addr_p().cntry_cd();
	}

	public void tdlv_cntry_cd(String value) {
		tdlv_addr_p().cntry_cd(value);
	}

	public String tdlv_cntry_nm() {
		return tdlv_addr_p().cntry_nm();
	}

	public void tdlv_cntry_nm(String value) {
		tdlv_addr_p().cntry_nm(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return tdlv_addr_p().zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		tdlv_addr_p().zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return tdlv_addr_p().addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		tdlv_addr_p().addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return tdlv_addr_p().addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		tdlv_addr_p().addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return tdlv_addr_p().addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		tdlv_addr_p().addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return tdlv_addr_p().addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		tdlv_addr_p().addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return tdlv_addr_p().tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		tdlv_addr_p().tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return tdlv_addr_p().fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		tdlv_addr_p().fax(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return tdlv_addr_p().cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		tdlv_addr_p().cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return tdlv_addr_p().cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		tdlv_addr_p().cntct_psn(value);
	}

	public MCNumber xrate() {
		return xrate_p().xrate();
	}

	public void xrate(MCNumber value) {
		xrate_p().xrate(value);
	}

	public void xrate(int value) {
		xrate_p().xrate(value);
	}

	public void xrate(long value) {
		xrate_p().xrate(value);
	}

	public void xrate(float value) {
		xrate_p().xrate(value);
	}

	public void xrate(double value) {
		xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return ptax_xrate_p().xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		ptax_xrate_p().xrate(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return trd_cur_amt_p().amt();
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt_inc_tax() {
		return trd_cur_amt_inc_tax_p().amt();
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_amt_inc_tax(MCNumber value) {
		trd_cur_amt_inc_tax_p().amt(value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_amt_inc_tax(int value) {
		trd_cur_amt_inc_tax_p().amt(value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_amt_inc_tax(long value) {
		trd_cur_amt_inc_tax_p().amt(value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_amt_inc_tax(float value) {
		trd_cur_amt_inc_tax_p().amt(value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_amt_inc_tax(double value) {
		trd_cur_amt_inc_tax_p().amt(value);
	}

}

