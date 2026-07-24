package mcframe.commonPFBE.PFBER5260;

import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 *  論理削除ＦＬＧ.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 *  取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 *  取引先別名１.<p>
	 *
	 */
	public static final String $bp_alt_nm1 = "bp_alt_nm1";
	/**
	 *  取引先別名２.<p>
	 *
	 */
	public static final String $bp_alt_nm2 = "bp_alt_nm2";
	/**
	 *  取引先別名３.<p>
	 *
	 */
	public static final String $bp_alt_nm3 = "bp_alt_nm3";
	/**
	 *  取引先別名４.<p>
	 *
	 */
	public static final String $bp_alt_nm4 = "bp_alt_nm4";
	/**
	 *  郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 *  住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 *  住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 *  住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 *  住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 *  法人番号.<p>
	 *
	 */
	public static final String $ein = "ein";
	/**
	 *  標準企業コード.<p>
	 *
	 */
	public static final String $std_co_cd = "std_co_cd";
	/**
	 *  国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 *  地域ＣＤ.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 *  帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 *  取引先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	/**
	 *  取引先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	/**
	 *  取引先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	/**
	 *  取引先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	/**
	 *  取引先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	/**
	 *  取引先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	/**
	 *  取引先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	/**
	 *  取引先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	/**
	 *  取引先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	/**
	 *  取引先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	/**
	 *  取引先配賦グループ.<p>
	 *
	 */
	public static final String $bp_alc_grp = "bp_alc_grp";
	/**
	 *  得意先ＦＬＧ.<p>
	 *
	 */
	public static final String $cst_flg = "cst_flg";
	/**
	 *  売掛先ＦＬＧ.<p>
	 *
	 */
	public static final String $acst_flg = "acst_flg";
	/**
	 *  請求先ＦＬＧ.<p>
	 *
	 */
	public static final String $bcst_flg = "bcst_flg";
	/**
	 *  入金先ＦＬＧ.<p>
	 *
	 */
	public static final String $rcst_flg = "rcst_flg";
	/**
	 *  発注先ＦＬＧ.<p>
	 *
	 */
	public static final String $sppl_flg = "sppl_flg";
	/**
	 *  買掛先ＦＬＧ.<p>
	 *
	 */
	public static final String $asppl_flg = "asppl_flg";
	/**
	 *  支払予定管理先ＦＬＧ.<p>
	 *
	 */
	public static final String $bsppl_flg = "bsppl_flg";
	/**
	 *  支払先ＦＬＧ.<p>
	 *
	 */
	public static final String $psppl_flg = "psppl_flg";
	/**
	 *  与信管理先ＦＬＧ.<p>
	 *
	 */
	public static final String $cred_flg = "cred_flg";
	/**
	 *  納品先ＦＬＧ.<p>
	 *
	 */
	public static final String $dlv_flg = "dlv_flg";
	/**
	 *  メーカＦＬＧ.<p>
	 *
	 */
	public static final String $maker_flg = "maker_flg";
	/**
	 *  仕向先ＦＬＧ.<p>
	 *
	 */
	public static final String $dest_flg = "dest_flg";
	/**
	 *  全社ＦＬＧ.<p>
	 *
	 */
	public static final String $all_com_flg = "all_com_flg";
	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 *  債権部門区分.<p>
	 *
	 */
	public static final String $ar_dpt_typ = "ar_dpt_typ";
	/**
	 *  債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 *  得意先部署.<p>
	 *
	 */
	public static final String $cst_cntct_dpt = "cst_cntct_dpt";
	/**
	 *  得意先担当者.<p>
	 *
	 */
	public static final String $cst_cntct_psn = "cst_cntct_psn";
	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public static final String $cst_cntct_psn_title = "cst_cntct_psn_title";
	/**
	 *  得意先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $cst_sundry_flg = "cst_sundry_flg";
	/**
	 *  販売単価取得区分.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	/**
	 *  販売単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	/**
	 *  販売単価端数処理区分.<p>
	 *
	 */
	public static final String $sls_upri_rnd_typ = "sls_upri_rnd_typ";
	/**
	 *  売上金額端数処理区分.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ = "sls_amt_rnd_typ";
	/**
	 *  売上税計算区分.<p>
	 *
	 */
	public static final String $sls_tax_calc_typ = "sls_tax_calc_typ";
	/**
	 *  売上税額端数処理区分.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ = "sls_tax_rnd_typ";
	/**
	 *  売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 *  請求起算区分.<p>
	 *
	 */
	public static final String $bill_basis_typ = "bill_basis_typ";
	/**
	 *  出荷予定分割区分.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 *  ロット逆転禁止区分.<p>
	 *
	 */
	public static final String $lot_back_stop_typ = "lot_back_stop_typ";
	/**
	 *  ロット明細分割区分.<p>
	 *
	 */
	public static final String $slip_each_lot_typ = "slip_each_lot_typ";
	/**
	 *  得意先納品書ＣＤ.<p>
	 *
	 */
	public static final String $cst_ship_form_cd = "cst_ship_form_cd";
	/**
	 *  現品票発行ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_lst_issue_flg = "stk_lst_issue_flg";
	/**
	 *  現品票ＣＤ.<p>
	 *
	 */
	public static final String $stk_lst_form_cd = "stk_lst_form_cd";
	/**
	 *  売上税ＣＤ.<p>
	 *
	 */
	public static final String $sls_tax_cd = "sls_tax_cd";
	/**
	 *  売上税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_tax_cd_prio_flg = "sls_tax_cd_prio_flg";
	/**
	 *  案件別債権管理ＦＬＧ.<p>
	 *
	 */
	public static final String $wrk_ar_flg = "wrk_ar_flg";
	/**
	 *  得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 *  出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public static final String $ship_lt = "ship_lt";
	/**
	 *  得意先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $cst_tterm_cd1 = "cst_tterm_cd1";
	/**
	 *  得意先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $cst_tterm_cd2 = "cst_tterm_cd2";
	/**
	 *  得意先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $cst_tterm_cd3 = "cst_tterm_cd3";
	/**
	 *  販売分析ＣＤ１.<p>
	 *
	 */
	public static final String $sls_anly_cd1 = "sls_anly_cd1";
	/**
	 *  販売分析ＣＤ２.<p>
	 *
	 */
	public static final String $sls_anly_cd2 = "sls_anly_cd2";
	/**
	 *  販売分析ＣＤ３.<p>
	 *
	 */
	public static final String $sls_anly_cd3 = "sls_anly_cd3";
	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 *  債権与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ar_cred_cd = "ar_cred_cd";
	/**
	 *  請求部門区分.<p>
	 *
	 */
	public static final String $bill_dpt_typ = "bill_dpt_typ";
	/**
	 *  請求先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bcst_dpt_cd = "bcst_dpt_cd";
	/**
	 *  請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 *  請求締日１.<p>
	 *
	 */
	public static final String $bill_cl_day1 = "bill_cl_day1";
	/**
	 *  請求締日２.<p>
	 *
	 */
	public static final String $bill_cl_day2 = "bill_cl_day2";
	/**
	 *  請求締日３.<p>
	 *
	 */
	public static final String $bill_cl_day3 = "bill_cl_day3";
	/**
	 *  請求締日４.<p>
	 *
	 */
	public static final String $bill_cl_day4 = "bill_cl_day4";
	/**
	 *  請求締日５.<p>
	 *
	 */
	public static final String $bill_cl_day5 = "bill_cl_day5";
	/**
	 *  請求税計算ＦＬＧ.<p>
	 *
	 */
	public static final String $tax_on_bill_flg = "tax_on_bill_flg";
	/**
	 *  請求税額端数処理区分.<p>
	 *
	 */
	public static final String $bill_tax_rnd_typ = "bill_tax_rnd_typ";
	/**
	 *  請求締遅延日数.<p>
	 *
	 */
	public static final String $bill_cl_delay_days = "bill_cl_delay_days";
	/**
	 *  請求締前後区分.<p>
	 *
	 */
	public static final String $bill_cl_ba_typ = "bill_cl_ba_typ";
	/**
	 *  売上仮単価締ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_interim_cl_flg = "sls_interim_cl_flg";
	/**
	 *  請求先カレンダＣＤ.<p>
	 *
	 */
	public static final String $bill_cal_cd = "bill_cal_cd";
	/**
	 *  入金予定前後区分.<p>
	 *
	 */
	public static final String $rcv_ba_typ = "rcv_ba_typ";
	/**
	 *  請求書送付郵便番号.<p>
	 *
	 */
	public static final String $bill_zip_cd = "bill_zip_cd";
	/**
	 *  請求書送付住所１.<p>
	 *
	 */
	public static final String $bill_addr1 = "bill_addr1";
	/**
	 *  請求書送付住所２.<p>
	 *
	 */
	public static final String $bill_addr2 = "bill_addr2";
	/**
	 *  請求書送付住所３.<p>
	 *
	 */
	public static final String $bill_addr3 = "bill_addr3";
	/**
	 *  請求書送付住所４.<p>
	 *
	 */
	public static final String $bill_addr4 = "bill_addr4";
	/**
	 *  請求書送付ＴＥＬ.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	/**
	 *  請求書宛先.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	/**
	 *  請求書送付部署.<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	/**
	 *  請求書送付担当者.<p>
	 *
	 */
	public static final String $bill_bcst_psn = "bill_bcst_psn";
	/**
	 *  請求書送付担当者敬称.<p>
	 *
	 */
	public static final String $bill_bcst_psn_title = "bill_bcst_psn_title";
	/**
	 *  請求書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public static final String $bfw_bal_disp_flg = "bfw_bal_disp_flg";
	/**
	 *  売上明細書出力区分.<p>
	 *
	 */
	public static final String $sls_dtl_outp_typ = "sls_dtl_outp_typ";
	/**
	 *  請求書発行区分.<p>
	 *
	 */
	public static final String $bill_prnt_typ = "bill_prnt_typ";
	/**
	 *  請求書明細出力ＦＬＧ.<p>
	 *
	 */
	public static final String $bill_dtl_outp_flg = "bill_dtl_outp_flg";
	/**
	 *  請求書入金予定表示ＦＬＧ.<p>
	 *
	 */
	public static final String $bill_dtl_rcv_flg = "bill_dtl_rcv_flg";
	/**
	 *  請求書前受金表示ＦＬＧ.<p>
	 *
	 */
	public static final String $bill_dtl_adv_flg = "bill_dtl_adv_flg";
	/**
	 *  請求書明細小計区分.<p>
	 *
	 */
	public static final String $bill_dtl_subttl_typ = "bill_dtl_subttl_typ";
	/**
	 *  請求書明細改頁区分.<p>
	 *
	 */
	public static final String $bill_dtl_brk_typ = "bill_dtl_brk_typ";
	/**
	 *  請求書明細並順区分.<p>
	 *
	 */
	public static final String $bill_dtl_sort_typ = "bill_dtl_sort_typ";
	/**
	 *  請求書取消伝票表示区分.<p>
	 *
	 */
	public static final String $bill_can_slip_typ = "bill_can_slip_typ";
	/**
	 *  自動明細消込ＦＬＧ.<p>
	 *
	 */
	public static final String $auto_line_appl_flg = "auto_line_appl_flg";
	/**
	 *  債権相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ar_setoff_grp_cd = "ar_setoff_grp_cd";
	/**
	 *  振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	/**
	 *  入金自動消込対象ＦＬＧ.<p>
	 *
	 */
	public static final String $rcv_auto_appl_tgt_flg = "rcv_auto_appl_tgt_flg";
	/**
	 *  金額考慮ＦＬＧ.<p>
	 *
	 */
	public static final String $rcv_amt_match_flg = "rcv_amt_match_flg";
	/**
	 *  金種考慮ＦＬＧ.<p>
	 *
	 */
	public static final String $ar_sttl_typ_match_flg = "ar_sttl_typ_match_flg";
	/**
	 *  手数料計算ＦＬＧ.<p>
	 *
	 */
	public static final String $calc_com_paid_flg = "calc_com_paid_flg";
	/**
	 *  自動消込基準日遅延日数.<p>
	 *
	 */
	public static final String $auto_appl_delay_days = "auto_appl_delay_days";
	/**
	 *  買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 *  ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public static final String $vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
	/**
	 *  下請対象ＦＬＧ.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 *  注文書表示ＣＤ.<p>
	 *
	 */
	public static final String $po_print_cd = "po_print_cd";
	/**
	 *  発注先納品書ＣＤ.<p>
	 *
	 */
	public static final String $sppl_ship_form_cd = "sppl_ship_form_cd";
	/**
	 *  発注時納品書ＦＬＧ.<p>
	 *
	 */
	public static final String $po_dlv_slip_flg = "po_dlv_slip_flg";
	/**
	 *  納入指示時納品書ＦＬＧ.<p>
	 *
	 */
	public static final String $dlv_inst_dlv_slip_flg = "dlv_inst_dlv_slip_flg";
	/**
	 *  納期回答受領時納品書ＦＬＧ.<p>
	 *
	 */
	public static final String $prms_rcpt_dlv_slip_flg = "prms_rcpt_dlv_slip_flg";
	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 *  発注先部署.<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	/**
	 *  発注先担当者.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public static final String $sppl_cntct_psn_title = "sppl_cntct_psn_title";
	/**
	 *  購買単価取得区分.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	/**
	 *  購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 *  仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 *  仕入税額端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 *  仕入税計算区分.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	/**
	 *  仕入税ＣＤ.<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	/**
	 *  仕入税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_tax_cd_prio_flg = "purc_tax_cd_prio_flg";
	/**
	 *  案件別注文書ＦＬＧ.<p>
	 *
	 */
	public static final String $wrk_po_flg = "wrk_po_flg";
	/**
	 *  案件別債務管理ＦＬＧ.<p>
	 *
	 */
	public static final String $wrk_ap_flg = "wrk_ap_flg";
	/**
	 *  仕入ロット明細分割区分.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ = "purc_slip_each_lot_typ";
	/**
	 *  支給積送管理区分.<p>
	 *
	 */
	public static final String $prov_rcv_typ = "prov_rcv_typ";
	/**
	 *  有償支給先ＦＬＧ.<p>
	 *
	 */
	public static final String $onr_prsppl_flg = "onr_prsppl_flg";
	/**
	 *  外注単価区分.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	/**
	 *  支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 *  支給単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $prov_upri_cng_flg = "prov_upri_cng_flg";
	/**
	 *  支給金額端数処理区分.<p>
	 *
	 */
	public static final String $prov_amt_rnd_typ = "prov_amt_rnd_typ";
	/**
	 *  支給税額端数処理区分.<p>
	 *
	 */
	public static final String $prov_tax_rnd_typ = "prov_tax_rnd_typ";
	/**
	 *  支給税計算区分.<p>
	 *
	 */
	public static final String $prov_tax_calc_typ = "prov_tax_calc_typ";
	/**
	 *  支給税ＣＤ.<p>
	 *
	 */
	public static final String $prov_tax_cd = "prov_tax_cd";
	/**
	 *  支給税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $prov_tax_cd_prio_flg = "prov_tax_cd_prio_flg";
	/**
	 *  発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	/**
	 *  発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 *  受領インボイス重複許可ＦＬＧ.<p>
	 *
	 */
	public static final String $rcpt_iv_dup_flg = "rcpt_iv_dup_flg";
	/**
	 *  納期回答確認ＦＬＧ.<p>
	 *
	 */
	public static final String $prms_recv_flg = "prms_recv_flg";
	/**
	 *  発注先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_tterm_cd1 = "sppl_tterm_cd1";
	/**
	 *  発注先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_tterm_cd2 = "sppl_tterm_cd2";
	/**
	 *  発注先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_tterm_cd3 = "sppl_tterm_cd3";
	/**
	 *  仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 *  債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 *  支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 *  債務与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ap_cred_cd = "ap_cred_cd";
	/**
	 *  支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 *  都度支払ＦＬＧ.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 *  支払締日１.<p>
	 *
	 */
	public static final String $psppl_cl_day1 = "psppl_cl_day1";
	/**
	 *  支払締日２.<p>
	 *
	 */
	public static final String $psppl_cl_day2 = "psppl_cl_day2";
	/**
	 *  支払締日３.<p>
	 *
	 */
	public static final String $psppl_cl_day3 = "psppl_cl_day3";
	/**
	 *  支払締日４.<p>
	 *
	 */
	public static final String $psppl_cl_day4 = "psppl_cl_day4";
	/**
	 *  支払締日５.<p>
	 *
	 */
	public static final String $psppl_cl_day5 = "psppl_cl_day5";
	/**
	 *  仕入仮単価締ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_interim_cl_flg = "purc_interim_cl_flg";
	/**
	 *  債務相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ap_setoff_grp_cd = "ap_setoff_grp_cd";
	/**
	 *  支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	/**
	 *  支払予定前後区分.<p>
	 *
	 */
	public static final String $pay_schd_ba_typ = "pay_schd_ba_typ";
	/**
	 *  支払税計算ＦＬＧ.<p>
	 *
	 */
	public static final String $tax_on_pay_flg = "tax_on_pay_flg";
	/**
	 *  支払税額端数処理区分.<p>
	 *
	 */
	public static final String $pay_tax_rnd_typ = "pay_tax_rnd_typ";
	/**
	 *  バッチ支払予定締ＦＬＧ.<p>
	 *
	 */
	public static final String $batch_pay_schd_cl_flg = "batch_pay_schd_cl_flg";
	/**
	 *  支払予定締遅延日数.<p>
	 *
	 */
	public static final String $pay_schd_cl_delay_days = "pay_schd_cl_delay_days";
	/**
	 *  支払予定締前後区分.<p>
	 *
	 */
	public static final String $pay_schd_cl_ba_typ = "pay_schd_cl_ba_typ";
	/**
	 *  事業者ＮＯ.<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";
	/**
	 *  支払通知書発行対象ＦＬＧ.<p>
	 *
	 */
	public static final String $pay_ntc_prnt_flg = "pay_ntc_prnt_flg";
	/**
	 *  支払通知書送付郵便番号.<p>
	 *
	 */
	public static final String $pay_ntc_zip_cd = "pay_ntc_zip_cd";
	/**
	 *  支払通知書送付住所１.<p>
	 *
	 */
	public static final String $pay_ntc_addr1 = "pay_ntc_addr1";
	/**
	 *  支払通知書送付住所２.<p>
	 *
	 */
	public static final String $pay_ntc_addr2 = "pay_ntc_addr2";
	/**
	 *  支払通知書送付住所３.<p>
	 *
	 */
	public static final String $pay_ntc_addr3 = "pay_ntc_addr3";
	/**
	 *  支払通知書送付住所４.<p>
	 *
	 */
	public static final String $pay_ntc_addr4 = "pay_ntc_addr4";
	/**
	 *  支払通知書宛先.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_nm = "pay_ntc_bsppl_nm";
	/**
	 *  支払通知書送付部署.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_dpt = "pay_ntc_bsppl_dpt";
	/**
	 *  支払通知書送付担当者.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn = "pay_ntc_bsppl_psn";
	/**
	 *  支払通知書送付担当者敬称.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn_title = "pay_ntc_bsppl_psn_title";
	/**
	 *  支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public static final String $pay_ntc_tel = "pay_ntc_tel";
	/**
	 *  支払通知書明細出力ＦＬＧ.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_outp_flg = "pay_ntc_dtl_outp_flg";
	/**
	 *  支払通知書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public static final String $pay_ntc_bfw_bal_disp_flg = "pay_ntc_bfw_bal_disp_flg";
	/**
	 *  支払通知書前渡金表示ＦＬＧ.<p>
	 *
	 */
	public static final String $pay_ntc_adv_pay_flg = "pay_ntc_adv_pay_flg";
	/**
	 *  支払通知書支払予定表示ＦＬＧ.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_pay_flg = "pay_ntc_dtl_pay_flg";
	/**
	 *  支払通知書明細小計区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_subttl_typ = "pay_ntc_dtl_subttl_typ";
	/**
	 *  支払通知書明細改頁区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_brk_typ = "pay_ntc_dtl_brk_typ";
	/**
	 *  支払通知書明細並順区分.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_sort_typ = "pay_ntc_dtl_sort_typ";
	/**
	 *  支払通知書取消伝票表示区分.<p>
	 *
	 */
	public static final String $pay_ntc_can_slip_typ = "pay_ntc_can_slip_typ";
	/**
	 *  支払先備考.<p>
	 *
	 */
	public static final String $psppl_rmrks = "psppl_rmrks";
	/**
	 *  手形サイト上限.<p>
	 *
	 */
	public static final String $note_days = "note_days";
	/**
	 *  支払部門ＣＤ.<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	/**
	 *  納品先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 *  納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 *  納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 *  納品先担当者敬称.<p>
	 *
	 */
	public static final String $dlv_cntct_psn_title = "dlv_cntct_psn_title";
	/**
	 *  価格印字ＦＬＧ.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 *  貸出在庫棚卸対象ＦＬＧ.<p>
	 *
	 */
	public static final String $cnsgn_stktk_flg = "cnsgn_stktk_flg";
	/**
	 *  配送先ＦＬＧ.<p>
	 *
	 */
	public static final String $tdlv_flg = "tdlv_flg";
	/**
	 *  配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 *  配送先必須ＦＬＧ.<p>
	 *
	 */
	public static final String $tdlv_req_flg = "tdlv_req_flg";
	/**
	 *  物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 *  納品先カレンダＣＤ.<p>
	 *
	 */
	public static final String $dlv_cal_cd = "dlv_cal_cd";
	/**
	 *  納品先チャネル１.<p>
	 *
	 */
	public static final String $dlv_chnnl1 = "dlv_chnnl1";
	/**
	 *  納品先チャネル２.<p>
	 *
	 */
	public static final String $dlv_chnnl2 = "dlv_chnnl2";
	/**
	 *  納品先チャネル３.<p>
	 *
	 */
	public static final String $dlv_chnnl3 = "dlv_chnnl3";
	/**
	 *  帳票発行区分（得意先）.<p>
	 *
	 */
	public static final String $cst_prnt_typ = "cst_prnt_typ";
	/**
	 *  帳票発行区分（売掛先）.<p>
	 *
	 */
	public static final String $acst_prnt_typ = "acst_prnt_typ";
	/**
	 *  帳票発行区分（請求先）.<p>
	 *
	 */
	public static final String $bcst_prnt_typ = "bcst_prnt_typ";
	/**
	 *  帳票発行区分（入金先）.<p>
	 *
	 */
	public static final String $rcst_prnt_typ = "rcst_prnt_typ";
	/**
	 *  帳票発行区分（発注先）.<p>
	 *
	 */
	public static final String $sppl_prnt_typ = "sppl_prnt_typ";
	/**
	 *  帳票発行区分（買掛先）.<p>
	 *
	 */
	public static final String $asppl_prnt_typ = "asppl_prnt_typ";
	/**
	 *  帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public static final String $bsppl_prnt_typ = "bsppl_prnt_typ";
	/**
	 *  帳票発行区分（支払先）.<p>
	 *
	 */
	public static final String $psppl_prnt_typ = "psppl_prnt_typ";
	/**
	 *  帳票発行区分（納品先）.<p>
	 *
	 */
	public static final String $dlv_prnt_typ = "dlv_prnt_typ";
	/**
	 *  メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 *  メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 *  メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $if_sub_char1 = "if_sub_char1";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $if_sub_char2 = "if_sub_char2";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $if_sub_char3 = "if_sub_char3";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $if_sub_char4 = "if_sub_char4";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $if_sub_char5 = "if_sub_char5";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $if_sub_char6 = "if_sub_char6";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $if_sub_char7 = "if_sub_char7";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $if_sub_char8 = "if_sub_char8";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $if_sub_char9 = "if_sub_char9";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $if_sub_char10 = "if_sub_char10";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $if_sub_char11 = "if_sub_char11";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $if_sub_char12 = "if_sub_char12";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $if_sub_char13 = "if_sub_char13";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $if_sub_char14 = "if_sub_char14";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $if_sub_char15 = "if_sub_char15";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $if_sub_char16 = "if_sub_char16";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $if_sub_char17 = "if_sub_char17";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $if_sub_char18 = "if_sub_char18";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $if_sub_char19 = "if_sub_char19";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $if_sub_char20 = "if_sub_char20";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $if_sub_char21 = "if_sub_char21";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $if_sub_char22 = "if_sub_char22";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $if_sub_char23 = "if_sub_char23";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $if_sub_char24 = "if_sub_char24";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $if_sub_char25 = "if_sub_char25";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $if_sub_char26 = "if_sub_char26";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $if_sub_char27 = "if_sub_char27";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $if_sub_char28 = "if_sub_char28";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $if_sub_char29 = "if_sub_char29";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $if_sub_char30 = "if_sub_char30";
	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $if_sub_num1 = "if_sub_num1";
	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $if_sub_num2 = "if_sub_num2";
	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $if_sub_num3 = "if_sub_num3";
	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $if_sub_num4 = "if_sub_num4";
	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $if_sub_num5 = "if_sub_num5";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $if_sub_dt1 = "if_sub_dt1";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $if_sub_dt2 = "if_sub_dt2";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $if_sub_dt3 = "if_sub_dt3";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $if_sub_dt4 = "if_sub_dt4";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $if_sub_dt5 = "if_sub_dt5";
	/**
	 *  メモ４.<p>
	 *
	 */
	public static final String $memo4 = "memo4";
	/**
	 *  メモ５.<p>
	 *
	 */
	public static final String $memo5 = "memo5";
	/**
	 *  メモ６.<p>
	 *
	 */
	public static final String $memo6 = "memo6";
	/**
	 *  メモ７.<p>
	 *
	 */
	public static final String $memo7 = "memo7";
	/**
	 *  メモ８.<p>
	 *
	 */
	public static final String $memo8 = "memo8";
	/**
	 *  メモ９.<p>
	 *
	 */
	public static final String $memo9 = "memo9";
	/**
	 *  メモ１０.<p>
	 *
	 */
	public static final String $memo10 = "memo10";
	/**
	 *  メモ１１.<p>
	 *
	 */
	public static final String $memo11 = "memo11";
	/**
	 *  メモ１２.<p>
	 *
	 */
	public static final String $memo12 = "memo12";
	/**
	 *  メモ１３.<p>
	 *
	 */
	public static final String $memo13 = "memo13";
	/**
	 *  メモ１４.<p>
	 *
	 */
	public static final String $memo14 = "memo14";
	/**
	 *  メモ１５.<p>
	 *
	 */
	public static final String $memo15 = "memo15";
	/**
	 *  メモ１６.<p>
	 *
	 */
	public static final String $memo16 = "memo16";
	/**
	 *  メモ１７.<p>
	 *
	 */
	public static final String $memo17 = "memo17";
	/**
	 *  メモ１８.<p>
	 *
	 */
	public static final String $memo18 = "memo18";
	/**
	 *  メモ１９.<p>
	 *
	 */
	public static final String $memo19 = "memo19";
	/**
	 *  メモ２０.<p>
	 *
	 */
	public static final String $memo20 = "memo20";
	/**
	 *  物流グループ混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 *  ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 *  サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_alt_nm1_META = createCommonMeta($bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bp_alt_nm2_META = createCommonMeta($bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bp_alt_nm3_META = createCommonMeta($bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bp_alt_nm4_META = createCommonMeta($bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ein_META = createCommonMeta($ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta std_co_cd_META = createCommonMeta($std_co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_alc_grp_META = createCommonMeta($bp_alc_grp, mcframe.commonMA.meta.MA_META.BP_ALC_GRP);
	public static final MCMeta cst_flg_META = createCommonMeta($cst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_flg_META = createCommonMeta($acst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_flg_META = createCommonMeta($bcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_flg_META = createCommonMeta($rcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_flg_META = createCommonMeta($sppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_flg_META = createCommonMeta($asppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_flg_META = createCommonMeta($bsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_flg_META = createCommonMeta($psppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_flg_META = createCommonMeta($cred_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_flg_META = createCommonMeta($dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_flg_META = createCommonMeta($maker_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_flg_META = createCommonMeta($dest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_com_flg_META = createCommonMeta($all_com_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.AR_DPT_TYP);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta cst_cntct_psn_title_META = createCommonMeta($cst_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta cst_sundry_flg_META = createCommonMeta($cst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_rnd_typ_META = createCommonMeta($sls_upri_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_calc_typ_META = createCommonMeta($sls_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta bill_basis_typ_META = createCommonMeta($bill_basis_typ, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta lot_back_stop_typ_META = createCommonMeta($lot_back_stop_typ, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP);
	public static final MCMeta slip_each_lot_typ_META = createCommonMeta($slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta cst_ship_form_cd_META = createCommonMeta($cst_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta stk_lst_issue_flg_META = createCommonMeta($stk_lst_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_form_cd_META = createCommonMeta($stk_lst_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta sls_tax_cd_META = createCommonMeta($sls_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta sls_tax_cd_prio_flg_META = createCommonMeta($sls_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ar_flg_META = createCommonMeta($wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_lt_META = createCommonMeta($ship_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta cst_tterm_cd1_META = createCommonMeta($cst_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_cd2_META = createCommonMeta($cst_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_cd3_META = createCommonMeta($cst_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sls_anly_cd1_META = createCommonMeta($sls_anly_cd1, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd2_META = createCommonMeta($sls_anly_cd2, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd3_META = createCommonMeta($sls_anly_cd3, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_cred_cd_META = createCommonMeta($ar_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_typ_META = createCommonMeta($bill_dpt_typ, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP);
	public static final MCMeta bcst_dpt_cd_META = createCommonMeta($bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta bill_cl_day1_META = createCommonMeta($bill_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day2_META = createCommonMeta($bill_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day3_META = createCommonMeta($bill_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day4_META = createCommonMeta($bill_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day5_META = createCommonMeta($bill_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta tax_on_bill_flg_META = createCommonMeta($tax_on_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_rnd_typ_META = createCommonMeta($bill_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta bill_cl_delay_days_META = createCommonMeta($bill_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta bill_cl_ba_typ_META = createCommonMeta($bill_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta sls_interim_cl_flg_META = createCommonMeta($sls_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cal_cd_META = createCommonMeta($bill_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rcv_ba_typ_META = createCommonMeta($rcv_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta bill_zip_cd_META = createCommonMeta($bill_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_addr1_META = createCommonMeta($bill_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta bill_addr2_META = createCommonMeta($bill_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta bill_addr3_META = createCommonMeta($bill_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta bill_addr4_META = createCommonMeta($bill_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_bcst_psn_META = createCommonMeta($bill_bcst_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta bill_bcst_psn_title_META = createCommonMeta($bill_bcst_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta bfw_bal_disp_flg_META = createCommonMeta($bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dtl_outp_typ_META = createCommonMeta($sls_dtl_outp_typ, mcframe.commonMA.meta.MA_META.SLS_DTL_OUTP_TYP);
	public static final MCMeta bill_prnt_typ_META = createCommonMeta($bill_prnt_typ, mcframe.commonMA.meta.MA_META.BILL_PRNT_TYP);
	public static final MCMeta bill_dtl_outp_flg_META = createCommonMeta($bill_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_rcv_flg_META = createCommonMeta($bill_dtl_rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_adv_flg_META = createCommonMeta($bill_dtl_adv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_subttl_typ_META = createCommonMeta($bill_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SUBTTL_TYP);
	public static final MCMeta bill_dtl_brk_typ_META = createCommonMeta($bill_dtl_brk_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_BRK_TYP);
	public static final MCMeta bill_dtl_sort_typ_META = createCommonMeta($bill_dtl_sort_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SORT_TYP);
	public static final MCMeta bill_can_slip_typ_META = createCommonMeta($bill_can_slip_typ, mcframe.commonMA.meta.MA_META.BILL_CAN_SLIP_TYP);
	public static final MCMeta auto_line_appl_flg_META = createCommonMeta($auto_line_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_setoff_grp_cd_META = createCommonMeta($ar_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta rcv_auto_appl_tgt_flg_META = createCommonMeta($rcv_auto_appl_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_amt_match_flg_META = createCommonMeta($rcv_amt_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_sttl_typ_match_flg_META = createCommonMeta($ar_sttl_typ_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_com_paid_flg_META = createCommonMeta($calc_com_paid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_appl_delay_days_META = createCommonMeta($auto_appl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta vmi_purc_dpt_cd_META = createCommonMeta($vmi_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_print_cd_META = createCommonMeta($po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta sppl_ship_form_cd_META = createCommonMeta($sppl_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta po_dlv_slip_flg_META = createCommonMeta($po_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_dlv_slip_flg_META = createCommonMeta($dlv_inst_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_rcpt_dlv_slip_flg_META = createCommonMeta($prms_rcpt_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta sppl_cntct_psn_title_META = createCommonMeta($sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_cd_prio_flg_META = createCommonMeta($purc_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_po_flg_META = createCommonMeta($wrk_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ap_flg_META = createCommonMeta($wrk_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_slip_each_lot_typ_META = createCommonMeta($purc_slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta prov_rcv_typ_META = createCommonMeta($prov_rcv_typ, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP);
	public static final MCMeta onr_prsppl_flg_META = createCommonMeta($onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_upri_cng_flg_META = createCommonMeta($prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_amt_rnd_typ_META = createCommonMeta($prov_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_rnd_typ_META = createCommonMeta($prov_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_calc_typ_META = createCommonMeta($prov_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta prov_tax_cd_META = createCommonMeta($prov_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta prov_tax_cd_prio_flg_META = createCommonMeta($prov_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_dup_flg_META = createCommonMeta($rcpt_iv_dup_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_recv_flg_META = createCommonMeta($prms_recv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_tterm_cd1_META = createCommonMeta($sppl_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd2_META = createCommonMeta($sppl_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd3_META = createCommonMeta($sppl_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_cred_cd_META = createCommonMeta($ap_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cl_day1_META = createCommonMeta($psppl_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day2_META = createCommonMeta($psppl_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day3_META = createCommonMeta($psppl_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day4_META = createCommonMeta($psppl_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day5_META = createCommonMeta($psppl_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta purc_interim_cl_flg_META = createCommonMeta($purc_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_setoff_grp_cd_META = createCommonMeta($ap_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_schd_ba_typ_META = createCommonMeta($pay_schd_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta tax_on_pay_flg_META = createCommonMeta($tax_on_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_tax_rnd_typ_META = createCommonMeta($pay_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta batch_pay_schd_cl_flg_META = createCommonMeta($batch_pay_schd_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_schd_cl_delay_days_META = createCommonMeta($pay_schd_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta pay_schd_cl_ba_typ_META = createCommonMeta($pay_schd_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta biz_co_no_META = createCommonMeta($biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta pay_ntc_prnt_flg_META = createCommonMeta($pay_ntc_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_zip_cd_META = createCommonMeta($pay_ntc_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta pay_ntc_addr1_META = createCommonMeta($pay_ntc_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta pay_ntc_addr2_META = createCommonMeta($pay_ntc_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta pay_ntc_addr3_META = createCommonMeta($pay_ntc_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta pay_ntc_addr4_META = createCommonMeta($pay_ntc_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta pay_ntc_bsppl_nm_META = createCommonMeta($pay_ntc_bsppl_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_NM);
	public static final MCMeta pay_ntc_bsppl_dpt_META = createCommonMeta($pay_ntc_bsppl_dpt, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_DPT);
	public static final MCMeta pay_ntc_bsppl_psn_META = createCommonMeta($pay_ntc_bsppl_psn, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_PSN);
	public static final MCMeta pay_ntc_bsppl_psn_title_META = createCommonMeta($pay_ntc_bsppl_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta pay_ntc_tel_META = createCommonMeta($pay_ntc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta pay_ntc_dtl_outp_flg_META = createCommonMeta($pay_ntc_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_bfw_bal_disp_flg_META = createCommonMeta($pay_ntc_bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_adv_pay_flg_META = createCommonMeta($pay_ntc_adv_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_dtl_pay_flg_META = createCommonMeta($pay_ntc_dtl_pay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ntc_dtl_subttl_typ_META = createCommonMeta($pay_ntc_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SUBTTL_TYP);
	public static final MCMeta pay_ntc_dtl_brk_typ_META = createCommonMeta($pay_ntc_dtl_brk_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_BRK_TYP);
	public static final MCMeta pay_ntc_dtl_sort_typ_META = createCommonMeta($pay_ntc_dtl_sort_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_DTL_SORT_TYP);
	public static final MCMeta pay_ntc_can_slip_typ_META = createCommonMeta($pay_ntc_can_slip_typ, mcframe.commonMA.meta.MA_META.PAY_NTC_CAN_SLIP_TYP);
	public static final MCMeta psppl_rmrks_META = createCommonMeta($psppl_rmrks, mcframe.commonMA.meta.MA_META.PSPPL_RMRKS);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_cntct_psn_title_META = createCommonMeta($dlv_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnsgn_stktk_flg_META = createCommonMeta($cnsgn_stktk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_flg_META = createCommonMeta($tdlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta tdlv_req_flg_META = createCommonMeta($tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_cal_cd_META = createCommonMeta($dlv_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta dlv_chnnl1_META = createCommonMeta($dlv_chnnl1, mcframe.commonMA.meta.MA_META.DLV_CHNNL1);
	public static final MCMeta dlv_chnnl2_META = createCommonMeta($dlv_chnnl2, mcframe.commonMA.meta.MA_META.DLV_CHNNL2);
	public static final MCMeta dlv_chnnl3_META = createCommonMeta($dlv_chnnl3, mcframe.commonMA.meta.MA_META.DLV_CHNNL3);
	public static final MCMeta cst_prnt_typ_META = createCommonMeta($cst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta acst_prnt_typ_META = createCommonMeta($acst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bcst_prnt_typ_META = createCommonMeta($bcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta rcst_prnt_typ_META = createCommonMeta($rcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta sppl_prnt_typ_META = createCommonMeta($sppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta asppl_prnt_typ_META = createCommonMeta($asppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bsppl_prnt_typ_META = createCommonMeta($bsppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta psppl_prnt_typ_META = createCommonMeta($psppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta dlv_prnt_typ_META = createCommonMeta($dlv_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta if_sub_char1_META = createCommonMeta($if_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta if_sub_char2_META = createCommonMeta($if_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta if_sub_char3_META = createCommonMeta($if_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta if_sub_char4_META = createCommonMeta($if_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta if_sub_char5_META = createCommonMeta($if_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta if_sub_char6_META = createCommonMeta($if_sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta if_sub_char7_META = createCommonMeta($if_sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta if_sub_char8_META = createCommonMeta($if_sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta if_sub_char9_META = createCommonMeta($if_sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta if_sub_char10_META = createCommonMeta($if_sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta if_sub_char11_META = createCommonMeta($if_sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta if_sub_char12_META = createCommonMeta($if_sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta if_sub_char13_META = createCommonMeta($if_sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta if_sub_char14_META = createCommonMeta($if_sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta if_sub_char15_META = createCommonMeta($if_sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta if_sub_char16_META = createCommonMeta($if_sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta if_sub_char17_META = createCommonMeta($if_sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta if_sub_char18_META = createCommonMeta($if_sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta if_sub_char19_META = createCommonMeta($if_sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta if_sub_char20_META = createCommonMeta($if_sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta if_sub_char21_META = createCommonMeta($if_sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta if_sub_char22_META = createCommonMeta($if_sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta if_sub_char23_META = createCommonMeta($if_sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta if_sub_char24_META = createCommonMeta($if_sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta if_sub_char25_META = createCommonMeta($if_sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta if_sub_char26_META = createCommonMeta($if_sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta if_sub_char27_META = createCommonMeta($if_sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta if_sub_char28_META = createCommonMeta($if_sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta if_sub_char29_META = createCommonMeta($if_sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta if_sub_char30_META = createCommonMeta($if_sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta if_sub_num1_META = createCommonMeta($if_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta if_sub_num2_META = createCommonMeta($if_sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta if_sub_num3_META = createCommonMeta($if_sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta if_sub_num4_META = createCommonMeta($if_sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta if_sub_num5_META = createCommonMeta($if_sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta if_sub_dt1_META = createCommonMeta($if_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt2_META = createCommonMeta($if_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt3_META = createCommonMeta($if_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt4_META = createCommonMeta($if_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt5_META = createCommonMeta($if_sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta memo4_META = createCommonMeta($memo4, mcframe.commonMA.meta.MA_META.MST_MEMO4);
	public static final MCMeta memo5_META = createCommonMeta($memo5, mcframe.commonMA.meta.MA_META.MST_MEMO5);
	public static final MCMeta memo6_META = createCommonMeta($memo6, mcframe.commonMA.meta.MA_META.MST_MEMO6);
	public static final MCMeta memo7_META = createCommonMeta($memo7, mcframe.commonMA.meta.MA_META.MST_MEMO7);
	public static final MCMeta memo8_META = createCommonMeta($memo8, mcframe.commonMA.meta.MA_META.MST_MEMO8);
	public static final MCMeta memo9_META = createCommonMeta($memo9, mcframe.commonMA.meta.MA_META.MST_MEMO9);
	public static final MCMeta memo10_META = createCommonMeta($memo10, mcframe.commonMA.meta.MA_META.MST_MEMO10);
	public static final MCMeta memo11_META = createCommonMeta($memo11, mcframe.commonMA.meta.MA_META.MST_MEMO11);
	public static final MCMeta memo12_META = createCommonMeta($memo12, mcframe.commonMA.meta.MA_META.MST_MEMO12);
	public static final MCMeta memo13_META = createCommonMeta($memo13, mcframe.commonMA.meta.MA_META.MST_MEMO13);
	public static final MCMeta memo14_META = createCommonMeta($memo14, mcframe.commonMA.meta.MA_META.MST_MEMO14);
	public static final MCMeta memo15_META = createCommonMeta($memo15, mcframe.commonMA.meta.MA_META.MST_MEMO15);
	public static final MCMeta memo16_META = createCommonMeta($memo16, mcframe.commonMA.meta.MA_META.MST_MEMO16);
	public static final MCMeta memo17_META = createCommonMeta($memo17, mcframe.commonMA.meta.MA_META.MST_MEMO17);
	public static final MCMeta memo18_META = createCommonMeta($memo18, mcframe.commonMA.meta.MA_META.MST_MEMO18);
	public static final MCMeta memo19_META = createCommonMeta($memo19, mcframe.commonMA.meta.MA_META.MST_MEMO19);
	public static final MCMeta memo20_META = createCommonMeta($memo20, mcframe.commonMA.meta.MA_META.MST_MEMO20);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			data_make_dt_META,
			bp_cd_META,
			del_flg_META,
			bp_nm_META,
			bp_alt_nm1_META,
			bp_alt_nm2_META,
			bp_alt_nm3_META,
			bp_alt_nm4_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			ein_META,
			std_co_cd_META,
			cntry_cd_META,
			area_cd_META,
			cur_cd_META,
			prnt_lcl_cd_META,
			bp_grp_cd1_META,
			bp_grp_cd2_META,
			bp_grp_cd3_META,
			bp_grp_cd4_META,
			bp_grp_cd5_META,
			bp_grp_cd6_META,
			bp_grp_cd7_META,
			bp_grp_cd8_META,
			bp_grp_cd9_META,
			bp_grp_cd10_META,
			bp_alc_grp_META,
			cst_flg_META,
			acst_flg_META,
			bcst_flg_META,
			rcst_flg_META,
			sppl_flg_META,
			asppl_flg_META,
			bsppl_flg_META,
			psppl_flg_META,
			cred_flg_META,
			dlv_flg_META,
			maker_flg_META,
			dest_flg_META,
			all_com_flg_META,
			acst_cd_META,
			ar_dpt_typ_META,
			ar_dpt_cd_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_cntct_psn_title_META,
			cst_sundry_flg_META,
			sls_upri_req_typ_META,
			sls_upri_cng_flg_META,
			sls_upri_rnd_typ_META,
			sls_amt_rnd_typ_META,
			sls_tax_calc_typ_META,
			sls_tax_rnd_typ_META,
			sls_basis_typ_META,
			bill_basis_typ_META,
			ship_schd_split_typ_META,
			bill_crryovr_times_META,
			lot_back_stop_typ_META,
			slip_each_lot_typ_META,
			cst_ship_form_cd_META,
			stk_lst_issue_flg_META,
			stk_lst_form_cd_META,
			sls_tax_cd_META,
			sls_tax_cd_prio_flg_META,
			wrk_ar_flg_META,
			cst_iv_flg_META,
			ship_lt_META,
			cst_tterm_cd1_META,
			cst_tterm_cd2_META,
			cst_tterm_cd3_META,
			sls_anly_cd1_META,
			sls_anly_cd2_META,
			sls_anly_cd3_META,
			bcst_cd_META,
			rcst_cd_META,
			ar_cred_cd_META,
			bill_dpt_typ_META,
			bcst_dpt_cd_META,
			bill_cl_typ_META,
			bill_cl_day1_META,
			bill_cl_day2_META,
			bill_cl_day3_META,
			bill_cl_day4_META,
			bill_cl_day5_META,
			tax_on_bill_flg_META,
			bill_tax_rnd_typ_META,
			bill_cl_delay_days_META,
			bill_cl_ba_typ_META,
			sls_interim_cl_flg_META,
			bill_cal_cd_META,
			rcv_ba_typ_META,
			bill_zip_cd_META,
			bill_addr1_META,
			bill_addr2_META,
			bill_addr3_META,
			bill_addr4_META,
			bill_tel_META,
			bill_bcst_nm_META,
			bill_bcst_dpt_META,
			bill_bcst_psn_META,
			bill_bcst_psn_title_META,
			bfw_bal_disp_flg_META,
			sls_dtl_outp_typ_META,
			bill_prnt_typ_META,
			bill_dtl_outp_flg_META,
			bill_dtl_rcv_flg_META,
			bill_dtl_adv_flg_META,
			bill_dtl_subttl_typ_META,
			bill_dtl_brk_typ_META,
			bill_dtl_sort_typ_META,
			bill_can_slip_typ_META,
			auto_line_appl_flg_META,
			ar_setoff_grp_cd_META,
			xfr_psn_META,
			rcv_auto_appl_tgt_flg_META,
			rcv_amt_match_flg_META,
			ar_sttl_typ_match_flg_META,
			calc_com_paid_flg_META,
			auto_appl_delay_days_META,
			asppl_cd_META,
			vmi_purc_dpt_cd_META,
			subcon_flg_META,
			po_print_cd_META,
			sppl_ship_form_cd_META,
			po_dlv_slip_flg_META,
			dlv_inst_dlv_slip_flg_META,
			prms_rcpt_dlv_slip_flg_META,
			pay_crryovr_times_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_cntct_psn_title_META,
			purc_upri_req_typ_META,
			purc_upri_cng_flg_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_tax_calc_typ_META,
			purc_tax_cd_META,
			purc_tax_cd_prio_flg_META,
			wrk_po_flg_META,
			wrk_ap_flg_META,
			purc_slip_each_lot_typ_META,
			prov_rcv_typ_META,
			onr_prsppl_flg_META,
			outsrc_upri_typ_META,
			prov_basis_typ_META,
			prov_upri_cng_flg_META,
			prov_amt_rnd_typ_META,
			prov_tax_rnd_typ_META,
			prov_tax_calc_typ_META,
			prov_tax_cd_META,
			prov_tax_cd_prio_flg_META,
			sppl_cal_cd_META,
			sppl_iv_flg_META,
			rcpt_iv_dup_flg_META,
			prms_recv_flg_META,
			sppl_tterm_cd1_META,
			sppl_tterm_cd2_META,
			sppl_tterm_cd3_META,
			purc_basis_typ_META,
			repurc_obli_flg_META,
			bsppl_cd_META,
			ap_dpt_cd_META,
			psppl_cd_META,
			ap_cred_cd_META,
			bsppl_dpt_cd_META,
			pay_spot_flg_META,
			psppl_cl_day1_META,
			psppl_cl_day2_META,
			psppl_cl_day3_META,
			psppl_cl_day4_META,
			psppl_cl_day5_META,
			purc_interim_cl_flg_META,
			ap_setoff_grp_cd_META,
			pay_bank_ac_cd_META,
			pay_schd_ba_typ_META,
			tax_on_pay_flg_META,
			pay_tax_rnd_typ_META,
			batch_pay_schd_cl_flg_META,
			pay_schd_cl_delay_days_META,
			pay_schd_cl_ba_typ_META,
			biz_co_no_META,
			pay_ntc_prnt_flg_META,
			pay_ntc_zip_cd_META,
			pay_ntc_addr1_META,
			pay_ntc_addr2_META,
			pay_ntc_addr3_META,
			pay_ntc_addr4_META,
			pay_ntc_bsppl_nm_META,
			pay_ntc_bsppl_dpt_META,
			pay_ntc_bsppl_psn_META,
			pay_ntc_bsppl_psn_title_META,
			pay_ntc_tel_META,
			pay_ntc_dtl_outp_flg_META,
			pay_ntc_bfw_bal_disp_flg_META,
			pay_ntc_adv_pay_flg_META,
			pay_ntc_dtl_pay_flg_META,
			pay_ntc_dtl_subttl_typ_META,
			pay_ntc_dtl_brk_typ_META,
			pay_ntc_dtl_sort_typ_META,
			pay_ntc_can_slip_typ_META,
			psppl_rmrks_META,
			note_days_META,
			pay_dpt_cd_META,
			dlv_sundry_flg_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_cntct_psn_title_META,
			pri_prnt_flg_META,
			cnsgn_stktk_flg_META,
			tdlv_flg_META,
			via_dlv_typ_META,
			tdlv_req_flg_META,
			lg_grp_cd_META,
			dlv_cal_cd_META,
			dlv_chnnl1_META,
			dlv_chnnl2_META,
			dlv_chnnl3_META,
			cst_prnt_typ_META,
			acst_prnt_typ_META,
			bcst_prnt_typ_META,
			rcst_prnt_typ_META,
			sppl_prnt_typ_META,
			asppl_prnt_typ_META,
			bsppl_prnt_typ_META,
			psppl_prnt_typ_META,
			dlv_prnt_typ_META,
			memo1_META,
			memo2_META,
			memo3_META,
			if_sub_char1_META,
			if_sub_char2_META,
			if_sub_char3_META,
			if_sub_char4_META,
			if_sub_char5_META,
			if_sub_char6_META,
			if_sub_char7_META,
			if_sub_char8_META,
			if_sub_char9_META,
			if_sub_char10_META,
			if_sub_char11_META,
			if_sub_char12_META,
			if_sub_char13_META,
			if_sub_char14_META,
			if_sub_char15_META,
			if_sub_char16_META,
			if_sub_char17_META,
			if_sub_char18_META,
			if_sub_char19_META,
			if_sub_char20_META,
			if_sub_char21_META,
			if_sub_char22_META,
			if_sub_char23_META,
			if_sub_char24_META,
			if_sub_char25_META,
			if_sub_char26_META,
			if_sub_char27_META,
			if_sub_char28_META,
			if_sub_char29_META,
			if_sub_char30_META,
			if_sub_num1_META,
			if_sub_num2_META,
			if_sub_num3_META,
			if_sub_num4_META,
			if_sub_num5_META,
			if_sub_dt1_META,
			if_sub_dt2_META,
			if_sub_dt3_META,
			if_sub_dt4_META,
			if_sub_dt5_META,
			memo4_META,
			memo5_META,
			memo6_META,
			memo7_META,
			memo8_META,
			memo9_META,
			memo10_META,
			memo11_META,
			memo12_META,
			memo13_META,
			memo14_META,
			memo15_META,
			memo16_META,
			memo17_META,
			memo18_META,
			memo19_META,
			memo20_META,
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
	 * コンストラクタです。
	 */
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 *  データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 1, $data_make_dt);
	}

	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 1, $data_make_dt, value);
	}


	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 2, $bp_cd);
	}

	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 2, $bp_cd, value);
	}


	/**
	 *  論理削除ＦＬＧ.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 3, $del_flg);
	}

	/**
	 *  論理削除ＦＬＧ.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 3, $del_flg, value);
	}


	/**
	 *  取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 4, $bp_nm);
	}

	/**
	 *  取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 4, $bp_nm, value);
	}


	/**
	 *  取引先別名１.<p>
	 *
	 */
	public String bp_alt_nm1() {
		return getConstString(offset + 5, $bp_alt_nm1);
	}

	/**
	 *  取引先別名１.<p>
	 *
	 */
	public void bp_alt_nm1(String value) {
		setConstString(offset + 5, $bp_alt_nm1, value);
	}


	/**
	 *  取引先別名２.<p>
	 *
	 */
	public String bp_alt_nm2() {
		return getConstString(offset + 6, $bp_alt_nm2);
	}

	/**
	 *  取引先別名２.<p>
	 *
	 */
	public void bp_alt_nm2(String value) {
		setConstString(offset + 6, $bp_alt_nm2, value);
	}


	/**
	 *  取引先別名３.<p>
	 *
	 */
	public String bp_alt_nm3() {
		return getConstString(offset + 7, $bp_alt_nm3);
	}

	/**
	 *  取引先別名３.<p>
	 *
	 */
	public void bp_alt_nm3(String value) {
		setConstString(offset + 7, $bp_alt_nm3, value);
	}


	/**
	 *  取引先別名４.<p>
	 *
	 */
	public String bp_alt_nm4() {
		return getConstString(offset + 8, $bp_alt_nm4);
	}

	/**
	 *  取引先別名４.<p>
	 *
	 */
	public void bp_alt_nm4(String value) {
		setConstString(offset + 8, $bp_alt_nm4, value);
	}


	/**
	 *  郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 9, $zip_cd);
	}

	/**
	 *  郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 9, $zip_cd, value);
	}


	/**
	 *  住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 10, $addr1);
	}

	/**
	 *  住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 10, $addr1, value);
	}


	/**
	 *  住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 11, $addr2);
	}

	/**
	 *  住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 11, $addr2, value);
	}


	/**
	 *  住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 12, $addr3);
	}

	/**
	 *  住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 12, $addr3, value);
	}


	/**
	 *  住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 13, $addr4);
	}

	/**
	 *  住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 13, $addr4, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 14, $tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 14, $tel, value);
	}


	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 15, $fax);
	}

	/**
	 *  ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 15, $fax, value);
	}


	/**
	 *  法人番号.<p>
	 *
	 */
	public String ein() {
		return getConstString(offset + 16, $ein);
	}

	/**
	 *  法人番号.<p>
	 *
	 */
	public void ein(String value) {
		setConstString(offset + 16, $ein, value);
	}


	/**
	 *  標準企業コード.<p>
	 *
	 */
	public String std_co_cd() {
		return getConstString(offset + 17, $std_co_cd);
	}

	/**
	 *  標準企業コード.<p>
	 *
	 */
	public void std_co_cd(String value) {
		setConstString(offset + 17, $std_co_cd, value);
	}


	/**
	 *  国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 18, $cntry_cd);
	}

	/**
	 *  国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 18, $cntry_cd, value);
	}


	/**
	 *  地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 19, $area_cd);
	}

	/**
	 *  地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 19, $area_cd, value);
	}


	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 20, $cur_cd);
	}

	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 20, $cur_cd, value);
	}


	/**
	 *  帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 21, $prnt_lcl_cd);
	}

	/**
	 *  帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 21, $prnt_lcl_cd, value);
	}


	/**
	 *  取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 22, $bp_grp_cd1);
	}

	/**
	 *  取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 22, $bp_grp_cd1, value);
	}


	/**
	 *  取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 23, $bp_grp_cd2);
	}

	/**
	 *  取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 23, $bp_grp_cd2, value);
	}


	/**
	 *  取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 24, $bp_grp_cd3);
	}

	/**
	 *  取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 24, $bp_grp_cd3, value);
	}


	/**
	 *  取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 25, $bp_grp_cd4);
	}

	/**
	 *  取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 25, $bp_grp_cd4, value);
	}


	/**
	 *  取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 26, $bp_grp_cd5);
	}

	/**
	 *  取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 26, $bp_grp_cd5, value);
	}


	/**
	 *  取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 27, $bp_grp_cd6);
	}

	/**
	 *  取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 27, $bp_grp_cd6, value);
	}


	/**
	 *  取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 28, $bp_grp_cd7);
	}

	/**
	 *  取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 28, $bp_grp_cd7, value);
	}


	/**
	 *  取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 29, $bp_grp_cd8);
	}

	/**
	 *  取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 29, $bp_grp_cd8, value);
	}


	/**
	 *  取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 30, $bp_grp_cd9);
	}

	/**
	 *  取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 30, $bp_grp_cd9, value);
	}


	/**
	 *  取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 31, $bp_grp_cd10);
	}

	/**
	 *  取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 31, $bp_grp_cd10, value);
	}


	/**
	 *  取引先配賦グループ.<p>
	 *
	 */
	public String bp_alc_grp() {
		return getConstString(offset + 32, $bp_alc_grp);
	}

	/**
	 *  取引先配賦グループ.<p>
	 *
	 */
	public void bp_alc_grp(String value) {
		setConstString(offset + 32, $bp_alc_grp, value);
	}


	/**
	 *  得意先ＦＬＧ.<p>
	 *
	 */
	public boolean cst_flg() {
		return getConstBoolean(offset + 33, $cst_flg);
	}

	/**
	 *  得意先ＦＬＧ.<p>
	 *
	 */
	public void cst_flg(boolean value) {
		setConstBoolean(offset + 33, $cst_flg, value);
	}


	/**
	 *  売掛先ＦＬＧ.<p>
	 *
	 */
	public boolean acst_flg() {
		return getConstBoolean(offset + 34, $acst_flg);
	}

	/**
	 *  売掛先ＦＬＧ.<p>
	 *
	 */
	public void acst_flg(boolean value) {
		setConstBoolean(offset + 34, $acst_flg, value);
	}


	/**
	 *  請求先ＦＬＧ.<p>
	 *
	 */
	public boolean bcst_flg() {
		return getConstBoolean(offset + 35, $bcst_flg);
	}

	/**
	 *  請求先ＦＬＧ.<p>
	 *
	 */
	public void bcst_flg(boolean value) {
		setConstBoolean(offset + 35, $bcst_flg, value);
	}


	/**
	 *  入金先ＦＬＧ.<p>
	 *
	 */
	public boolean rcst_flg() {
		return getConstBoolean(offset + 36, $rcst_flg);
	}

	/**
	 *  入金先ＦＬＧ.<p>
	 *
	 */
	public void rcst_flg(boolean value) {
		setConstBoolean(offset + 36, $rcst_flg, value);
	}


	/**
	 *  発注先ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_flg() {
		return getConstBoolean(offset + 37, $sppl_flg);
	}

	/**
	 *  発注先ＦＬＧ.<p>
	 *
	 */
	public void sppl_flg(boolean value) {
		setConstBoolean(offset + 37, $sppl_flg, value);
	}


	/**
	 *  買掛先ＦＬＧ.<p>
	 *
	 */
	public boolean asppl_flg() {
		return getConstBoolean(offset + 38, $asppl_flg);
	}

	/**
	 *  買掛先ＦＬＧ.<p>
	 *
	 */
	public void asppl_flg(boolean value) {
		setConstBoolean(offset + 38, $asppl_flg, value);
	}


	/**
	 *  支払予定管理先ＦＬＧ.<p>
	 *
	 */
	public boolean bsppl_flg() {
		return getConstBoolean(offset + 39, $bsppl_flg);
	}

	/**
	 *  支払予定管理先ＦＬＧ.<p>
	 *
	 */
	public void bsppl_flg(boolean value) {
		setConstBoolean(offset + 39, $bsppl_flg, value);
	}


	/**
	 *  支払先ＦＬＧ.<p>
	 *
	 */
	public boolean psppl_flg() {
		return getConstBoolean(offset + 40, $psppl_flg);
	}

	/**
	 *  支払先ＦＬＧ.<p>
	 *
	 */
	public void psppl_flg(boolean value) {
		setConstBoolean(offset + 40, $psppl_flg, value);
	}


	/**
	 *  与信管理先ＦＬＧ.<p>
	 *
	 */
	public boolean cred_flg() {
		return getConstBoolean(offset + 41, $cred_flg);
	}

	/**
	 *  与信管理先ＦＬＧ.<p>
	 *
	 */
	public void cred_flg(boolean value) {
		setConstBoolean(offset + 41, $cred_flg, value);
	}


	/**
	 *  納品先ＦＬＧ.<p>
	 *
	 */
	public boolean dlv_flg() {
		return getConstBoolean(offset + 42, $dlv_flg);
	}

	/**
	 *  納品先ＦＬＧ.<p>
	 *
	 */
	public void dlv_flg(boolean value) {
		setConstBoolean(offset + 42, $dlv_flg, value);
	}


	/**
	 *  メーカＦＬＧ.<p>
	 *
	 */
	public boolean maker_flg() {
		return getConstBoolean(offset + 43, $maker_flg);
	}

	/**
	 *  メーカＦＬＧ.<p>
	 *
	 */
	public void maker_flg(boolean value) {
		setConstBoolean(offset + 43, $maker_flg, value);
	}


	/**
	 *  仕向先ＦＬＧ.<p>
	 *
	 */
	public boolean dest_flg() {
		return getConstBoolean(offset + 44, $dest_flg);
	}

	/**
	 *  仕向先ＦＬＧ.<p>
	 *
	 */
	public void dest_flg(boolean value) {
		setConstBoolean(offset + 44, $dest_flg, value);
	}


	/**
	 *  全社ＦＬＧ.<p>
	 *
	 */
	public boolean all_com_flg() {
		return getConstBoolean(offset + 45, $all_com_flg);
	}

	/**
	 *  全社ＦＬＧ.<p>
	 *
	 */
	public void all_com_flg(boolean value) {
		setConstBoolean(offset + 45, $all_com_flg, value);
	}


	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 46, $acst_cd);
	}

	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 46, $acst_cd, value);
	}


	/**
	 *  債権部門区分.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 47, $ar_dpt_typ);
	}

	/**
	 *  債権部門区分.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 47, $ar_dpt_typ, value);
	}


	/**
	 *  債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 48, $ar_dpt_cd);
	}

	/**
	 *  債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 48, $ar_dpt_cd, value);
	}


	/**
	 *  得意先部署.<p>
	 *
	 */
	public String cst_cntct_dpt() {
		return getConstString(offset + 49, $cst_cntct_dpt);
	}

	/**
	 *  得意先部署.<p>
	 *
	 */
	public void cst_cntct_dpt(String value) {
		setConstString(offset + 49, $cst_cntct_dpt, value);
	}


	/**
	 *  得意先担当者.<p>
	 *
	 */
	public String cst_cntct_psn() {
		return getConstString(offset + 50, $cst_cntct_psn);
	}

	/**
	 *  得意先担当者.<p>
	 *
	 */
	public void cst_cntct_psn(String value) {
		setConstString(offset + 50, $cst_cntct_psn, value);
	}


	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public String cst_cntct_psn_title() {
		return getConstString(offset + 51, $cst_cntct_psn_title);
	}

	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public void cst_cntct_psn_title(String value) {
		setConstString(offset + 51, $cst_cntct_psn_title, value);
	}


	/**
	 *  得意先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean cst_sundry_flg() {
		return getConstBoolean(offset + 52, $cst_sundry_flg);
	}

	/**
	 *  得意先諸口ＦＬＧ.<p>
	 *
	 */
	public void cst_sundry_flg(boolean value) {
		setConstBoolean(offset + 52, $cst_sundry_flg, value);
	}


	/**
	 *  販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 53, $sls_upri_req_typ);
	}

	/**
	 *  販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 53, $sls_upri_req_typ, value);
	}


	/**
	 *  販売単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 54, $sls_upri_cng_flg);
	}

	/**
	 *  販売単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 54, $sls_upri_cng_flg, value);
	}


	/**
	 *  販売単価端数処理区分.<p>
	 *
	 */
	public String sls_upri_rnd_typ() {
		return getConstString(offset + 55, $sls_upri_rnd_typ);
	}

	/**
	 *  販売単価端数処理区分.<p>
	 *
	 */
	public void sls_upri_rnd_typ(String value) {
		setConstString(offset + 55, $sls_upri_rnd_typ, value);
	}


	/**
	 *  売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 56, $sls_amt_rnd_typ);
	}

	/**
	 *  売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 56, $sls_amt_rnd_typ, value);
	}


	/**
	 *  売上税計算区分.<p>
	 *
	 */
	public String sls_tax_calc_typ() {
		return getConstString(offset + 57, $sls_tax_calc_typ);
	}

	/**
	 *  売上税計算区分.<p>
	 *
	 */
	public void sls_tax_calc_typ(String value) {
		setConstString(offset + 57, $sls_tax_calc_typ, value);
	}


	/**
	 *  売上税額端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 58, $sls_tax_rnd_typ);
	}

	/**
	 *  売上税額端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 58, $sls_tax_rnd_typ, value);
	}


	/**
	 *  売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 59, $sls_basis_typ);
	}

	/**
	 *  売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 59, $sls_basis_typ, value);
	}


	/**
	 *  請求起算区分.<p>
	 *
	 */
	public String bill_basis_typ() {
		return getConstString(offset + 60, $bill_basis_typ);
	}

	/**
	 *  請求起算区分.<p>
	 *
	 */
	public void bill_basis_typ(String value) {
		setConstString(offset + 60, $bill_basis_typ, value);
	}


	/**
	 *  出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 61, $ship_schd_split_typ);
	}

	/**
	 *  出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 61, $ship_schd_split_typ, value);
	}


	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 62, $bill_crryovr_times);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 62, $bill_crryovr_times, value);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 62, $bill_crryovr_times, value);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 62, $bill_crryovr_times, value);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 62, $bill_crryovr_times, value);
	}

	/**
	 *  請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 62, $bill_crryovr_times, value);
	}


	/**
	 *  ロット逆転禁止区分.<p>
	 *
	 */
	public String lot_back_stop_typ() {
		return getConstString(offset + 63, $lot_back_stop_typ);
	}

	/**
	 *  ロット逆転禁止区分.<p>
	 *
	 */
	public void lot_back_stop_typ(String value) {
		setConstString(offset + 63, $lot_back_stop_typ, value);
	}


	/**
	 *  ロット明細分割区分.<p>
	 *
	 */
	public String slip_each_lot_typ() {
		return getConstString(offset + 64, $slip_each_lot_typ);
	}

	/**
	 *  ロット明細分割区分.<p>
	 *
	 */
	public void slip_each_lot_typ(String value) {
		setConstString(offset + 64, $slip_each_lot_typ, value);
	}


	/**
	 *  得意先納品書ＣＤ.<p>
	 *
	 */
	public String cst_ship_form_cd() {
		return getConstString(offset + 65, $cst_ship_form_cd);
	}

	/**
	 *  得意先納品書ＣＤ.<p>
	 *
	 */
	public void cst_ship_form_cd(String value) {
		setConstString(offset + 65, $cst_ship_form_cd, value);
	}


	/**
	 *  現品票発行ＦＬＧ.<p>
	 *
	 */
	public boolean stk_lst_issue_flg() {
		return getConstBoolean(offset + 66, $stk_lst_issue_flg);
	}

	/**
	 *  現品票発行ＦＬＧ.<p>
	 *
	 */
	public void stk_lst_issue_flg(boolean value) {
		setConstBoolean(offset + 66, $stk_lst_issue_flg, value);
	}


	/**
	 *  現品票ＣＤ.<p>
	 *
	 */
	public String stk_lst_form_cd() {
		return getConstString(offset + 67, $stk_lst_form_cd);
	}

	/**
	 *  現品票ＣＤ.<p>
	 *
	 */
	public void stk_lst_form_cd(String value) {
		setConstString(offset + 67, $stk_lst_form_cd, value);
	}


	/**
	 *  売上税ＣＤ.<p>
	 *
	 */
	public String sls_tax_cd() {
		return getConstString(offset + 68, $sls_tax_cd);
	}

	/**
	 *  売上税ＣＤ.<p>
	 *
	 */
	public void sls_tax_cd(String value) {
		setConstString(offset + 68, $sls_tax_cd, value);
	}


	/**
	 *  売上税優先ＦＬＧ.<p>
	 *
	 */
	public boolean sls_tax_cd_prio_flg() {
		return getConstBoolean(offset + 69, $sls_tax_cd_prio_flg);
	}

	/**
	 *  売上税優先ＦＬＧ.<p>
	 *
	 */
	public void sls_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 69, $sls_tax_cd_prio_flg, value);
	}


	/**
	 *  案件別債権管理ＦＬＧ.<p>
	 *
	 */
	public boolean wrk_ar_flg() {
		return getConstBoolean(offset + 70, $wrk_ar_flg);
	}

	/**
	 *  案件別債権管理ＦＬＧ.<p>
	 *
	 */
	public void wrk_ar_flg(boolean value) {
		setConstBoolean(offset + 70, $wrk_ar_flg, value);
	}


	/**
	 *  得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 71, $cst_iv_flg);
	}

	/**
	 *  得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 71, $cst_iv_flg, value);
	}


	/**
	 *  出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public MCNumber ship_lt() {
		return getConstNumber(offset + 72, $ship_lt);
	}

	/**
	 *  出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(MCNumber value) {
		setConstNumber(offset + 72, $ship_lt, value);
	}

	/**
	 *  出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(int value) {
		setConstNumber(offset + 72, $ship_lt, value);
	}

	/**
	 *  出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(long value) {
		setConstNumber(offset + 72, $ship_lt, value);
	}

	/**
	 *  出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(float value) {
		setConstNumber(offset + 72, $ship_lt, value);
	}

	/**
	 *  出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void ship_lt(double value) {
		setConstNumber(offset + 72, $ship_lt, value);
	}


	/**
	 *  得意先取引条件ＣＤ１.<p>
	 *
	 */
	public String cst_tterm_cd1() {
		return getConstString(offset + 73, $cst_tterm_cd1);
	}

	/**
	 *  得意先取引条件ＣＤ１.<p>
	 *
	 */
	public void cst_tterm_cd1(String value) {
		setConstString(offset + 73, $cst_tterm_cd1, value);
	}


	/**
	 *  得意先取引条件ＣＤ２.<p>
	 *
	 */
	public String cst_tterm_cd2() {
		return getConstString(offset + 74, $cst_tterm_cd2);
	}

	/**
	 *  得意先取引条件ＣＤ２.<p>
	 *
	 */
	public void cst_tterm_cd2(String value) {
		setConstString(offset + 74, $cst_tterm_cd2, value);
	}


	/**
	 *  得意先取引条件ＣＤ３.<p>
	 *
	 */
	public String cst_tterm_cd3() {
		return getConstString(offset + 75, $cst_tterm_cd3);
	}

	/**
	 *  得意先取引条件ＣＤ３.<p>
	 *
	 */
	public void cst_tterm_cd3(String value) {
		setConstString(offset + 75, $cst_tterm_cd3, value);
	}


	/**
	 *  販売分析ＣＤ１.<p>
	 *
	 */
	public String sls_anly_cd1() {
		return getConstString(offset + 76, $sls_anly_cd1);
	}

	/**
	 *  販売分析ＣＤ１.<p>
	 *
	 */
	public void sls_anly_cd1(String value) {
		setConstString(offset + 76, $sls_anly_cd1, value);
	}


	/**
	 *  販売分析ＣＤ２.<p>
	 *
	 */
	public String sls_anly_cd2() {
		return getConstString(offset + 77, $sls_anly_cd2);
	}

	/**
	 *  販売分析ＣＤ２.<p>
	 *
	 */
	public void sls_anly_cd2(String value) {
		setConstString(offset + 77, $sls_anly_cd2, value);
	}


	/**
	 *  販売分析ＣＤ３.<p>
	 *
	 */
	public String sls_anly_cd3() {
		return getConstString(offset + 78, $sls_anly_cd3);
	}

	/**
	 *  販売分析ＣＤ３.<p>
	 *
	 */
	public void sls_anly_cd3(String value) {
		setConstString(offset + 78, $sls_anly_cd3, value);
	}


	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 79, $bcst_cd);
	}

	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 79, $bcst_cd, value);
	}


	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 80, $rcst_cd);
	}

	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 80, $rcst_cd, value);
	}


	/**
	 *  債権与信管理先ＣＤ.<p>
	 *
	 */
	public String ar_cred_cd() {
		return getConstString(offset + 81, $ar_cred_cd);
	}

	/**
	 *  債権与信管理先ＣＤ.<p>
	 *
	 */
	public void ar_cred_cd(String value) {
		setConstString(offset + 81, $ar_cred_cd, value);
	}


	/**
	 *  請求部門区分.<p>
	 *
	 */
	public String bill_dpt_typ() {
		return getConstString(offset + 82, $bill_dpt_typ);
	}

	/**
	 *  請求部門区分.<p>
	 *
	 */
	public void bill_dpt_typ(String value) {
		setConstString(offset + 82, $bill_dpt_typ, value);
	}


	/**
	 *  請求先担当部門ＣＤ.<p>
	 *
	 */
	public String bcst_dpt_cd() {
		return getConstString(offset + 83, $bcst_dpt_cd);
	}

	/**
	 *  請求先担当部門ＣＤ.<p>
	 *
	 */
	public void bcst_dpt_cd(String value) {
		setConstString(offset + 83, $bcst_dpt_cd, value);
	}


	/**
	 *  請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 84, $bill_cl_typ);
	}

	/**
	 *  請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 84, $bill_cl_typ, value);
	}


	/**
	 *  請求締日１.<p>
	 *
	 */
	public MCNumber bill_cl_day1() {
		return getConstNumber(offset + 85, $bill_cl_day1);
	}

	/**
	 *  請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(MCNumber value) {
		setConstNumber(offset + 85, $bill_cl_day1, value);
	}

	/**
	 *  請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(int value) {
		setConstNumber(offset + 85, $bill_cl_day1, value);
	}

	/**
	 *  請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(long value) {
		setConstNumber(offset + 85, $bill_cl_day1, value);
	}

	/**
	 *  請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(float value) {
		setConstNumber(offset + 85, $bill_cl_day1, value);
	}

	/**
	 *  請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(double value) {
		setConstNumber(offset + 85, $bill_cl_day1, value);
	}


	/**
	 *  請求締日２.<p>
	 *
	 */
	public MCNumber bill_cl_day2() {
		return getConstNumber(offset + 86, $bill_cl_day2);
	}

	/**
	 *  請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(MCNumber value) {
		setConstNumber(offset + 86, $bill_cl_day2, value);
	}

	/**
	 *  請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(int value) {
		setConstNumber(offset + 86, $bill_cl_day2, value);
	}

	/**
	 *  請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(long value) {
		setConstNumber(offset + 86, $bill_cl_day2, value);
	}

	/**
	 *  請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(float value) {
		setConstNumber(offset + 86, $bill_cl_day2, value);
	}

	/**
	 *  請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(double value) {
		setConstNumber(offset + 86, $bill_cl_day2, value);
	}


	/**
	 *  請求締日３.<p>
	 *
	 */
	public MCNumber bill_cl_day3() {
		return getConstNumber(offset + 87, $bill_cl_day3);
	}

	/**
	 *  請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(MCNumber value) {
		setConstNumber(offset + 87, $bill_cl_day3, value);
	}

	/**
	 *  請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(int value) {
		setConstNumber(offset + 87, $bill_cl_day3, value);
	}

	/**
	 *  請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(long value) {
		setConstNumber(offset + 87, $bill_cl_day3, value);
	}

	/**
	 *  請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(float value) {
		setConstNumber(offset + 87, $bill_cl_day3, value);
	}

	/**
	 *  請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(double value) {
		setConstNumber(offset + 87, $bill_cl_day3, value);
	}


	/**
	 *  請求締日４.<p>
	 *
	 */
	public MCNumber bill_cl_day4() {
		return getConstNumber(offset + 88, $bill_cl_day4);
	}

	/**
	 *  請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(MCNumber value) {
		setConstNumber(offset + 88, $bill_cl_day4, value);
	}

	/**
	 *  請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(int value) {
		setConstNumber(offset + 88, $bill_cl_day4, value);
	}

	/**
	 *  請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(long value) {
		setConstNumber(offset + 88, $bill_cl_day4, value);
	}

	/**
	 *  請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(float value) {
		setConstNumber(offset + 88, $bill_cl_day4, value);
	}

	/**
	 *  請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(double value) {
		setConstNumber(offset + 88, $bill_cl_day4, value);
	}


	/**
	 *  請求締日５.<p>
	 *
	 */
	public MCNumber bill_cl_day5() {
		return getConstNumber(offset + 89, $bill_cl_day5);
	}

	/**
	 *  請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(MCNumber value) {
		setConstNumber(offset + 89, $bill_cl_day5, value);
	}

	/**
	 *  請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(int value) {
		setConstNumber(offset + 89, $bill_cl_day5, value);
	}

	/**
	 *  請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(long value) {
		setConstNumber(offset + 89, $bill_cl_day5, value);
	}

	/**
	 *  請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(float value) {
		setConstNumber(offset + 89, $bill_cl_day5, value);
	}

	/**
	 *  請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(double value) {
		setConstNumber(offset + 89, $bill_cl_day5, value);
	}


	/**
	 *  請求税計算ＦＬＧ.<p>
	 *
	 */
	public boolean tax_on_bill_flg() {
		return getConstBoolean(offset + 90, $tax_on_bill_flg);
	}

	/**
	 *  請求税計算ＦＬＧ.<p>
	 *
	 */
	public void tax_on_bill_flg(boolean value) {
		setConstBoolean(offset + 90, $tax_on_bill_flg, value);
	}


	/**
	 *  請求税額端数処理区分.<p>
	 *
	 */
	public String bill_tax_rnd_typ() {
		return getConstString(offset + 91, $bill_tax_rnd_typ);
	}

	/**
	 *  請求税額端数処理区分.<p>
	 *
	 */
	public void bill_tax_rnd_typ(String value) {
		setConstString(offset + 91, $bill_tax_rnd_typ, value);
	}


	/**
	 *  請求締遅延日数.<p>
	 *
	 */
	public MCNumber bill_cl_delay_days() {
		return getConstNumber(offset + 92, $bill_cl_delay_days);
	}

	/**
	 *  請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 92, $bill_cl_delay_days, value);
	}

	/**
	 *  請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(int value) {
		setConstNumber(offset + 92, $bill_cl_delay_days, value);
	}

	/**
	 *  請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(long value) {
		setConstNumber(offset + 92, $bill_cl_delay_days, value);
	}

	/**
	 *  請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(float value) {
		setConstNumber(offset + 92, $bill_cl_delay_days, value);
	}

	/**
	 *  請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(double value) {
		setConstNumber(offset + 92, $bill_cl_delay_days, value);
	}


	/**
	 *  請求締前後区分.<p>
	 *
	 */
	public String bill_cl_ba_typ() {
		return getConstString(offset + 93, $bill_cl_ba_typ);
	}

	/**
	 *  請求締前後区分.<p>
	 *
	 */
	public void bill_cl_ba_typ(String value) {
		setConstString(offset + 93, $bill_cl_ba_typ, value);
	}


	/**
	 *  売上仮単価締ＦＬＧ.<p>
	 *
	 */
	public boolean sls_interim_cl_flg() {
		return getConstBoolean(offset + 94, $sls_interim_cl_flg);
	}

	/**
	 *  売上仮単価締ＦＬＧ.<p>
	 *
	 */
	public void sls_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 94, $sls_interim_cl_flg, value);
	}


	/**
	 *  請求先カレンダＣＤ.<p>
	 *
	 */
	public String bill_cal_cd() {
		return getConstString(offset + 95, $bill_cal_cd);
	}

	/**
	 *  請求先カレンダＣＤ.<p>
	 *
	 */
	public void bill_cal_cd(String value) {
		setConstString(offset + 95, $bill_cal_cd, value);
	}


	/**
	 *  入金予定前後区分.<p>
	 *
	 */
	public String rcv_ba_typ() {
		return getConstString(offset + 96, $rcv_ba_typ);
	}

	/**
	 *  入金予定前後区分.<p>
	 *
	 */
	public void rcv_ba_typ(String value) {
		setConstString(offset + 96, $rcv_ba_typ, value);
	}


	/**
	 *  請求書送付郵便番号.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 97, $bill_zip_cd);
	}

	/**
	 *  請求書送付郵便番号.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 97, $bill_zip_cd, value);
	}


	/**
	 *  請求書送付住所１.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 98, $bill_addr1);
	}

	/**
	 *  請求書送付住所１.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 98, $bill_addr1, value);
	}


	/**
	 *  請求書送付住所２.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 99, $bill_addr2);
	}

	/**
	 *  請求書送付住所２.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 99, $bill_addr2, value);
	}


	/**
	 *  請求書送付住所３.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 100, $bill_addr3);
	}

	/**
	 *  請求書送付住所３.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 100, $bill_addr3, value);
	}


	/**
	 *  請求書送付住所４.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 101, $bill_addr4);
	}

	/**
	 *  請求書送付住所４.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 101, $bill_addr4, value);
	}


	/**
	 *  請求書送付ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 102, $bill_tel);
	}

	/**
	 *  請求書送付ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 102, $bill_tel, value);
	}


	/**
	 *  請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 103, $bill_bcst_nm);
	}

	/**
	 *  請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 103, $bill_bcst_nm, value);
	}


	/**
	 *  請求書送付部署.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 104, $bill_bcst_dpt);
	}

	/**
	 *  請求書送付部署.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 104, $bill_bcst_dpt, value);
	}


	/**
	 *  請求書送付担当者.<p>
	 *
	 */
	public String bill_bcst_psn() {
		return getConstString(offset + 105, $bill_bcst_psn);
	}

	/**
	 *  請求書送付担当者.<p>
	 *
	 */
	public void bill_bcst_psn(String value) {
		setConstString(offset + 105, $bill_bcst_psn, value);
	}


	/**
	 *  請求書送付担当者敬称.<p>
	 *
	 */
	public String bill_bcst_psn_title() {
		return getConstString(offset + 106, $bill_bcst_psn_title);
	}

	/**
	 *  請求書送付担当者敬称.<p>
	 *
	 */
	public void bill_bcst_psn_title(String value) {
		setConstString(offset + 106, $bill_bcst_psn_title, value);
	}


	/**
	 *  請求書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public boolean bfw_bal_disp_flg() {
		return getConstBoolean(offset + 107, $bfw_bal_disp_flg);
	}

	/**
	 *  請求書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public void bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 107, $bfw_bal_disp_flg, value);
	}


	/**
	 *  売上明細書出力区分.<p>
	 *
	 */
	public String sls_dtl_outp_typ() {
		return getConstString(offset + 108, $sls_dtl_outp_typ);
	}

	/**
	 *  売上明細書出力区分.<p>
	 *
	 */
	public void sls_dtl_outp_typ(String value) {
		setConstString(offset + 108, $sls_dtl_outp_typ, value);
	}


	/**
	 *  請求書発行区分.<p>
	 *
	 */
	public String bill_prnt_typ() {
		return getConstString(offset + 109, $bill_prnt_typ);
	}

	/**
	 *  請求書発行区分.<p>
	 *
	 */
	public void bill_prnt_typ(String value) {
		setConstString(offset + 109, $bill_prnt_typ, value);
	}


	/**
	 *  請求書明細出力ＦＬＧ.<p>
	 *
	 */
	public boolean bill_dtl_outp_flg() {
		return getConstBoolean(offset + 110, $bill_dtl_outp_flg);
	}

	/**
	 *  請求書明細出力ＦＬＧ.<p>
	 *
	 */
	public void bill_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 110, $bill_dtl_outp_flg, value);
	}


	/**
	 *  請求書入金予定表示ＦＬＧ.<p>
	 *
	 */
	public boolean bill_dtl_rcv_flg() {
		return getConstBoolean(offset + 111, $bill_dtl_rcv_flg);
	}

	/**
	 *  請求書入金予定表示ＦＬＧ.<p>
	 *
	 */
	public void bill_dtl_rcv_flg(boolean value) {
		setConstBoolean(offset + 111, $bill_dtl_rcv_flg, value);
	}


	/**
	 *  請求書前受金表示ＦＬＧ.<p>
	 *
	 */
	public boolean bill_dtl_adv_flg() {
		return getConstBoolean(offset + 112, $bill_dtl_adv_flg);
	}

	/**
	 *  請求書前受金表示ＦＬＧ.<p>
	 *
	 */
	public void bill_dtl_adv_flg(boolean value) {
		setConstBoolean(offset + 112, $bill_dtl_adv_flg, value);
	}


	/**
	 *  請求書明細小計区分.<p>
	 *
	 */
	public String bill_dtl_subttl_typ() {
		return getConstString(offset + 113, $bill_dtl_subttl_typ);
	}

	/**
	 *  請求書明細小計区分.<p>
	 *
	 */
	public void bill_dtl_subttl_typ(String value) {
		setConstString(offset + 113, $bill_dtl_subttl_typ, value);
	}


	/**
	 *  請求書明細改頁区分.<p>
	 *
	 */
	public String bill_dtl_brk_typ() {
		return getConstString(offset + 114, $bill_dtl_brk_typ);
	}

	/**
	 *  請求書明細改頁区分.<p>
	 *
	 */
	public void bill_dtl_brk_typ(String value) {
		setConstString(offset + 114, $bill_dtl_brk_typ, value);
	}


	/**
	 *  請求書明細並順区分.<p>
	 *
	 */
	public String bill_dtl_sort_typ() {
		return getConstString(offset + 115, $bill_dtl_sort_typ);
	}

	/**
	 *  請求書明細並順区分.<p>
	 *
	 */
	public void bill_dtl_sort_typ(String value) {
		setConstString(offset + 115, $bill_dtl_sort_typ, value);
	}


	/**
	 *  請求書取消伝票表示区分.<p>
	 *
	 */
	public String bill_can_slip_typ() {
		return getConstString(offset + 116, $bill_can_slip_typ);
	}

	/**
	 *  請求書取消伝票表示区分.<p>
	 *
	 */
	public void bill_can_slip_typ(String value) {
		setConstString(offset + 116, $bill_can_slip_typ, value);
	}


	/**
	 *  自動明細消込ＦＬＧ.<p>
	 *
	 */
	public boolean auto_line_appl_flg() {
		return getConstBoolean(offset + 117, $auto_line_appl_flg);
	}

	/**
	 *  自動明細消込ＦＬＧ.<p>
	 *
	 */
	public void auto_line_appl_flg(boolean value) {
		setConstBoolean(offset + 117, $auto_line_appl_flg, value);
	}


	/**
	 *  債権相殺グループＣＤ.<p>
	 *
	 */
	public String ar_setoff_grp_cd() {
		return getConstString(offset + 118, $ar_setoff_grp_cd);
	}

	/**
	 *  債権相殺グループＣＤ.<p>
	 *
	 */
	public void ar_setoff_grp_cd(String value) {
		setConstString(offset + 118, $ar_setoff_grp_cd, value);
	}


	/**
	 *  振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 119, $xfr_psn);
	}

	/**
	 *  振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 119, $xfr_psn, value);
	}


	/**
	 *  入金自動消込対象ＦＬＧ.<p>
	 *
	 */
	public boolean rcv_auto_appl_tgt_flg() {
		return getConstBoolean(offset + 120, $rcv_auto_appl_tgt_flg);
	}

	/**
	 *  入金自動消込対象ＦＬＧ.<p>
	 *
	 */
	public void rcv_auto_appl_tgt_flg(boolean value) {
		setConstBoolean(offset + 120, $rcv_auto_appl_tgt_flg, value);
	}


	/**
	 *  金額考慮ＦＬＧ.<p>
	 *
	 */
	public boolean rcv_amt_match_flg() {
		return getConstBoolean(offset + 121, $rcv_amt_match_flg);
	}

	/**
	 *  金額考慮ＦＬＧ.<p>
	 *
	 */
	public void rcv_amt_match_flg(boolean value) {
		setConstBoolean(offset + 121, $rcv_amt_match_flg, value);
	}


	/**
	 *  金種考慮ＦＬＧ.<p>
	 *
	 */
	public boolean ar_sttl_typ_match_flg() {
		return getConstBoolean(offset + 122, $ar_sttl_typ_match_flg);
	}

	/**
	 *  金種考慮ＦＬＧ.<p>
	 *
	 */
	public void ar_sttl_typ_match_flg(boolean value) {
		setConstBoolean(offset + 122, $ar_sttl_typ_match_flg, value);
	}


	/**
	 *  手数料計算ＦＬＧ.<p>
	 *
	 */
	public boolean calc_com_paid_flg() {
		return getConstBoolean(offset + 123, $calc_com_paid_flg);
	}

	/**
	 *  手数料計算ＦＬＧ.<p>
	 *
	 */
	public void calc_com_paid_flg(boolean value) {
		setConstBoolean(offset + 123, $calc_com_paid_flg, value);
	}


	/**
	 *  自動消込基準日遅延日数.<p>
	 *
	 */
	public MCNumber auto_appl_delay_days() {
		return getConstNumber(offset + 124, $auto_appl_delay_days);
	}

	/**
	 *  自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(MCNumber value) {
		setConstNumber(offset + 124, $auto_appl_delay_days, value);
	}

	/**
	 *  自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(int value) {
		setConstNumber(offset + 124, $auto_appl_delay_days, value);
	}

	/**
	 *  自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(long value) {
		setConstNumber(offset + 124, $auto_appl_delay_days, value);
	}

	/**
	 *  自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(float value) {
		setConstNumber(offset + 124, $auto_appl_delay_days, value);
	}

	/**
	 *  自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(double value) {
		setConstNumber(offset + 124, $auto_appl_delay_days, value);
	}


	/**
	 *  買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 125, $asppl_cd);
	}

	/**
	 *  買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 125, $asppl_cd, value);
	}


	/**
	 *  ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public String vmi_purc_dpt_cd() {
		return getConstString(offset + 126, $vmi_purc_dpt_cd);
	}

	/**
	 *  ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public void vmi_purc_dpt_cd(String value) {
		setConstString(offset + 126, $vmi_purc_dpt_cd, value);
	}


	/**
	 *  下請対象ＦＬＧ.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 127, $subcon_flg);
	}

	/**
	 *  下請対象ＦＬＧ.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 127, $subcon_flg, value);
	}


	/**
	 *  注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return getConstString(offset + 128, $po_print_cd);
	}

	/**
	 *  注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		setConstString(offset + 128, $po_print_cd, value);
	}


	/**
	 *  発注先納品書ＣＤ.<p>
	 *
	 */
	public String sppl_ship_form_cd() {
		return getConstString(offset + 129, $sppl_ship_form_cd);
	}

	/**
	 *  発注先納品書ＣＤ.<p>
	 *
	 */
	public void sppl_ship_form_cd(String value) {
		setConstString(offset + 129, $sppl_ship_form_cd, value);
	}


	/**
	 *  発注時納品書ＦＬＧ.<p>
	 *
	 */
	public boolean po_dlv_slip_flg() {
		return getConstBoolean(offset + 130, $po_dlv_slip_flg);
	}

	/**
	 *  発注時納品書ＦＬＧ.<p>
	 *
	 */
	public void po_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 130, $po_dlv_slip_flg, value);
	}


	/**
	 *  納入指示時納品書ＦＬＧ.<p>
	 *
	 */
	public boolean dlv_inst_dlv_slip_flg() {
		return getConstBoolean(offset + 131, $dlv_inst_dlv_slip_flg);
	}

	/**
	 *  納入指示時納品書ＦＬＧ.<p>
	 *
	 */
	public void dlv_inst_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 131, $dlv_inst_dlv_slip_flg, value);
	}


	/**
	 *  納期回答受領時納品書ＦＬＧ.<p>
	 *
	 */
	public boolean prms_rcpt_dlv_slip_flg() {
		return getConstBoolean(offset + 132, $prms_rcpt_dlv_slip_flg);
	}

	/**
	 *  納期回答受領時納品書ＦＬＧ.<p>
	 *
	 */
	public void prms_rcpt_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 132, $prms_rcpt_dlv_slip_flg, value);
	}


	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 133, $pay_crryovr_times);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 133, $pay_crryovr_times, value);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 133, $pay_crryovr_times, value);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 133, $pay_crryovr_times, value);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 133, $pay_crryovr_times, value);
	}

	/**
	 *  支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 133, $pay_crryovr_times, value);
	}


	/**
	 *  発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 134, $sppl_cntct_dpt);
	}

	/**
	 *  発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 134, $sppl_cntct_dpt, value);
	}


	/**
	 *  発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 135, $sppl_cntct_psn);
	}

	/**
	 *  発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 135, $sppl_cntct_psn, value);
	}


	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 136, $sppl_cntct_psn_title);
	}

	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 136, $sppl_cntct_psn_title, value);
	}


	/**
	 *  購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 137, $purc_upri_req_typ);
	}

	/**
	 *  購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 137, $purc_upri_req_typ, value);
	}


	/**
	 *  購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 138, $purc_upri_cng_flg);
	}

	/**
	 *  購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 138, $purc_upri_cng_flg, value);
	}


	/**
	 *  仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 139, $purc_amt_rnd_typ);
	}

	/**
	 *  仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 139, $purc_amt_rnd_typ, value);
	}


	/**
	 *  仕入税額端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 140, $purc_tax_rnd_typ);
	}

	/**
	 *  仕入税額端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 140, $purc_tax_rnd_typ, value);
	}


	/**
	 *  仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 141, $purc_tax_calc_typ);
	}

	/**
	 *  仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 141, $purc_tax_calc_typ, value);
	}


	/**
	 *  仕入税ＣＤ.<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 142, $purc_tax_cd);
	}

	/**
	 *  仕入税ＣＤ.<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 142, $purc_tax_cd, value);
	}


	/**
	 *  仕入税優先ＦＬＧ.<p>
	 *
	 */
	public boolean purc_tax_cd_prio_flg() {
		return getConstBoolean(offset + 143, $purc_tax_cd_prio_flg);
	}

	/**
	 *  仕入税優先ＦＬＧ.<p>
	 *
	 */
	public void purc_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 143, $purc_tax_cd_prio_flg, value);
	}


	/**
	 *  案件別注文書ＦＬＧ.<p>
	 *
	 */
	public boolean wrk_po_flg() {
		return getConstBoolean(offset + 144, $wrk_po_flg);
	}

	/**
	 *  案件別注文書ＦＬＧ.<p>
	 *
	 */
	public void wrk_po_flg(boolean value) {
		setConstBoolean(offset + 144, $wrk_po_flg, value);
	}


	/**
	 *  案件別債務管理ＦＬＧ.<p>
	 *
	 */
	public boolean wrk_ap_flg() {
		return getConstBoolean(offset + 145, $wrk_ap_flg);
	}

	/**
	 *  案件別債務管理ＦＬＧ.<p>
	 *
	 */
	public void wrk_ap_flg(boolean value) {
		setConstBoolean(offset + 145, $wrk_ap_flg, value);
	}


	/**
	 *  仕入ロット明細分割区分.<p>
	 *
	 */
	public String purc_slip_each_lot_typ() {
		return getConstString(offset + 146, $purc_slip_each_lot_typ);
	}

	/**
	 *  仕入ロット明細分割区分.<p>
	 *
	 */
	public void purc_slip_each_lot_typ(String value) {
		setConstString(offset + 146, $purc_slip_each_lot_typ, value);
	}


	/**
	 *  支給積送管理区分.<p>
	 *
	 */
	public String prov_rcv_typ() {
		return getConstString(offset + 147, $prov_rcv_typ);
	}

	/**
	 *  支給積送管理区分.<p>
	 *
	 */
	public void prov_rcv_typ(String value) {
		setConstString(offset + 147, $prov_rcv_typ, value);
	}


	/**
	 *  有償支給先ＦＬＧ.<p>
	 *
	 */
	public boolean onr_prsppl_flg() {
		return getConstBoolean(offset + 148, $onr_prsppl_flg);
	}

	/**
	 *  有償支給先ＦＬＧ.<p>
	 *
	 */
	public void onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 148, $onr_prsppl_flg, value);
	}


	/**
	 *  外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 149, $outsrc_upri_typ);
	}

	/**
	 *  外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 149, $outsrc_upri_typ, value);
	}


	/**
	 *  支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 150, $prov_basis_typ);
	}

	/**
	 *  支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 150, $prov_basis_typ, value);
	}


	/**
	 *  支給単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean prov_upri_cng_flg() {
		return getConstBoolean(offset + 151, $prov_upri_cng_flg);
	}

	/**
	 *  支給単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 151, $prov_upri_cng_flg, value);
	}


	/**
	 *  支給金額端数処理区分.<p>
	 *
	 */
	public String prov_amt_rnd_typ() {
		return getConstString(offset + 152, $prov_amt_rnd_typ);
	}

	/**
	 *  支給金額端数処理区分.<p>
	 *
	 */
	public void prov_amt_rnd_typ(String value) {
		setConstString(offset + 152, $prov_amt_rnd_typ, value);
	}


	/**
	 *  支給税額端数処理区分.<p>
	 *
	 */
	public String prov_tax_rnd_typ() {
		return getConstString(offset + 153, $prov_tax_rnd_typ);
	}

	/**
	 *  支給税額端数処理区分.<p>
	 *
	 */
	public void prov_tax_rnd_typ(String value) {
		setConstString(offset + 153, $prov_tax_rnd_typ, value);
	}


	/**
	 *  支給税計算区分.<p>
	 *
	 */
	public String prov_tax_calc_typ() {
		return getConstString(offset + 154, $prov_tax_calc_typ);
	}

	/**
	 *  支給税計算区分.<p>
	 *
	 */
	public void prov_tax_calc_typ(String value) {
		setConstString(offset + 154, $prov_tax_calc_typ, value);
	}


	/**
	 *  支給税ＣＤ.<p>
	 *
	 */
	public String prov_tax_cd() {
		return getConstString(offset + 155, $prov_tax_cd);
	}

	/**
	 *  支給税ＣＤ.<p>
	 *
	 */
	public void prov_tax_cd(String value) {
		setConstString(offset + 155, $prov_tax_cd, value);
	}


	/**
	 *  支給税優先ＦＬＧ.<p>
	 *
	 */
	public boolean prov_tax_cd_prio_flg() {
		return getConstBoolean(offset + 156, $prov_tax_cd_prio_flg);
	}

	/**
	 *  支給税優先ＦＬＧ.<p>
	 *
	 */
	public void prov_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 156, $prov_tax_cd_prio_flg, value);
	}


	/**
	 *  発注先カレンダＣＤ.<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 157, $sppl_cal_cd);
	}

	/**
	 *  発注先カレンダＣＤ.<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 157, $sppl_cal_cd, value);
	}


	/**
	 *  発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 158, $sppl_iv_flg);
	}

	/**
	 *  発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 158, $sppl_iv_flg, value);
	}


	/**
	 *  受領インボイス重複許可ＦＬＧ.<p>
	 *
	 */
	public boolean rcpt_iv_dup_flg() {
		return getConstBoolean(offset + 159, $rcpt_iv_dup_flg);
	}

	/**
	 *  受領インボイス重複許可ＦＬＧ.<p>
	 *
	 */
	public void rcpt_iv_dup_flg(boolean value) {
		setConstBoolean(offset + 159, $rcpt_iv_dup_flg, value);
	}


	/**
	 *  納期回答確認ＦＬＧ.<p>
	 *
	 */
	public boolean prms_recv_flg() {
		return getConstBoolean(offset + 160, $prms_recv_flg);
	}

	/**
	 *  納期回答確認ＦＬＧ.<p>
	 *
	 */
	public void prms_recv_flg(boolean value) {
		setConstBoolean(offset + 160, $prms_recv_flg, value);
	}


	/**
	 *  発注先取引条件ＣＤ１.<p>
	 *
	 */
	public String sppl_tterm_cd1() {
		return getConstString(offset + 161, $sppl_tterm_cd1);
	}

	/**
	 *  発注先取引条件ＣＤ１.<p>
	 *
	 */
	public void sppl_tterm_cd1(String value) {
		setConstString(offset + 161, $sppl_tterm_cd1, value);
	}


	/**
	 *  発注先取引条件ＣＤ２.<p>
	 *
	 */
	public String sppl_tterm_cd2() {
		return getConstString(offset + 162, $sppl_tterm_cd2);
	}

	/**
	 *  発注先取引条件ＣＤ２.<p>
	 *
	 */
	public void sppl_tterm_cd2(String value) {
		setConstString(offset + 162, $sppl_tterm_cd2, value);
	}


	/**
	 *  発注先取引条件ＣＤ３.<p>
	 *
	 */
	public String sppl_tterm_cd3() {
		return getConstString(offset + 163, $sppl_tterm_cd3);
	}

	/**
	 *  発注先取引条件ＣＤ３.<p>
	 *
	 */
	public void sppl_tterm_cd3(String value) {
		setConstString(offset + 163, $sppl_tterm_cd3, value);
	}


	/**
	 *  仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 164, $purc_basis_typ);
	}

	/**
	 *  仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 164, $purc_basis_typ, value);
	}


	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 165, $repurc_obli_flg);
	}

	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 165, $repurc_obli_flg, value);
	}


	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 166, $bsppl_cd);
	}

	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 166, $bsppl_cd, value);
	}


	/**
	 *  債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 167, $ap_dpt_cd);
	}

	/**
	 *  債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 167, $ap_dpt_cd, value);
	}


	/**
	 *  支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 168, $psppl_cd);
	}

	/**
	 *  支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 168, $psppl_cd, value);
	}


	/**
	 *  債務与信管理先ＣＤ.<p>
	 *
	 */
	public String ap_cred_cd() {
		return getConstString(offset + 169, $ap_cred_cd);
	}

	/**
	 *  債務与信管理先ＣＤ.<p>
	 *
	 */
	public void ap_cred_cd(String value) {
		setConstString(offset + 169, $ap_cred_cd, value);
	}


	/**
	 *  支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 170, $bsppl_dpt_cd);
	}

	/**
	 *  支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 170, $bsppl_dpt_cd, value);
	}


	/**
	 *  都度支払ＦＬＧ.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 171, $pay_spot_flg);
	}

	/**
	 *  都度支払ＦＬＧ.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 171, $pay_spot_flg, value);
	}


	/**
	 *  支払締日１.<p>
	 *
	 */
	public MCNumber psppl_cl_day1() {
		return getConstNumber(offset + 172, $psppl_cl_day1);
	}

	/**
	 *  支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(MCNumber value) {
		setConstNumber(offset + 172, $psppl_cl_day1, value);
	}

	/**
	 *  支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(int value) {
		setConstNumber(offset + 172, $psppl_cl_day1, value);
	}

	/**
	 *  支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(long value) {
		setConstNumber(offset + 172, $psppl_cl_day1, value);
	}

	/**
	 *  支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(float value) {
		setConstNumber(offset + 172, $psppl_cl_day1, value);
	}

	/**
	 *  支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(double value) {
		setConstNumber(offset + 172, $psppl_cl_day1, value);
	}


	/**
	 *  支払締日２.<p>
	 *
	 */
	public MCNumber psppl_cl_day2() {
		return getConstNumber(offset + 173, $psppl_cl_day2);
	}

	/**
	 *  支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(MCNumber value) {
		setConstNumber(offset + 173, $psppl_cl_day2, value);
	}

	/**
	 *  支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(int value) {
		setConstNumber(offset + 173, $psppl_cl_day2, value);
	}

	/**
	 *  支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(long value) {
		setConstNumber(offset + 173, $psppl_cl_day2, value);
	}

	/**
	 *  支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(float value) {
		setConstNumber(offset + 173, $psppl_cl_day2, value);
	}

	/**
	 *  支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(double value) {
		setConstNumber(offset + 173, $psppl_cl_day2, value);
	}


	/**
	 *  支払締日３.<p>
	 *
	 */
	public MCNumber psppl_cl_day3() {
		return getConstNumber(offset + 174, $psppl_cl_day3);
	}

	/**
	 *  支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(MCNumber value) {
		setConstNumber(offset + 174, $psppl_cl_day3, value);
	}

	/**
	 *  支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(int value) {
		setConstNumber(offset + 174, $psppl_cl_day3, value);
	}

	/**
	 *  支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(long value) {
		setConstNumber(offset + 174, $psppl_cl_day3, value);
	}

	/**
	 *  支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(float value) {
		setConstNumber(offset + 174, $psppl_cl_day3, value);
	}

	/**
	 *  支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(double value) {
		setConstNumber(offset + 174, $psppl_cl_day3, value);
	}


	/**
	 *  支払締日４.<p>
	 *
	 */
	public MCNumber psppl_cl_day4() {
		return getConstNumber(offset + 175, $psppl_cl_day4);
	}

	/**
	 *  支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(MCNumber value) {
		setConstNumber(offset + 175, $psppl_cl_day4, value);
	}

	/**
	 *  支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(int value) {
		setConstNumber(offset + 175, $psppl_cl_day4, value);
	}

	/**
	 *  支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(long value) {
		setConstNumber(offset + 175, $psppl_cl_day4, value);
	}

	/**
	 *  支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(float value) {
		setConstNumber(offset + 175, $psppl_cl_day4, value);
	}

	/**
	 *  支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(double value) {
		setConstNumber(offset + 175, $psppl_cl_day4, value);
	}


	/**
	 *  支払締日５.<p>
	 *
	 */
	public MCNumber psppl_cl_day5() {
		return getConstNumber(offset + 176, $psppl_cl_day5);
	}

	/**
	 *  支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(MCNumber value) {
		setConstNumber(offset + 176, $psppl_cl_day5, value);
	}

	/**
	 *  支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(int value) {
		setConstNumber(offset + 176, $psppl_cl_day5, value);
	}

	/**
	 *  支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(long value) {
		setConstNumber(offset + 176, $psppl_cl_day5, value);
	}

	/**
	 *  支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(float value) {
		setConstNumber(offset + 176, $psppl_cl_day5, value);
	}

	/**
	 *  支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(double value) {
		setConstNumber(offset + 176, $psppl_cl_day5, value);
	}


	/**
	 *  仕入仮単価締ＦＬＧ.<p>
	 *
	 */
	public boolean purc_interim_cl_flg() {
		return getConstBoolean(offset + 177, $purc_interim_cl_flg);
	}

	/**
	 *  仕入仮単価締ＦＬＧ.<p>
	 *
	 */
	public void purc_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 177, $purc_interim_cl_flg, value);
	}


	/**
	 *  債務相殺グループＣＤ.<p>
	 *
	 */
	public String ap_setoff_grp_cd() {
		return getConstString(offset + 178, $ap_setoff_grp_cd);
	}

	/**
	 *  債務相殺グループＣＤ.<p>
	 *
	 */
	public void ap_setoff_grp_cd(String value) {
		setConstString(offset + 178, $ap_setoff_grp_cd, value);
	}


	/**
	 *  支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 179, $pay_bank_ac_cd);
	}

	/**
	 *  支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 179, $pay_bank_ac_cd, value);
	}


	/**
	 *  支払予定前後区分.<p>
	 *
	 */
	public String pay_schd_ba_typ() {
		return getConstString(offset + 180, $pay_schd_ba_typ);
	}

	/**
	 *  支払予定前後区分.<p>
	 *
	 */
	public void pay_schd_ba_typ(String value) {
		setConstString(offset + 180, $pay_schd_ba_typ, value);
	}


	/**
	 *  支払税計算ＦＬＧ.<p>
	 *
	 */
	public boolean tax_on_pay_flg() {
		return getConstBoolean(offset + 181, $tax_on_pay_flg);
	}

	/**
	 *  支払税計算ＦＬＧ.<p>
	 *
	 */
	public void tax_on_pay_flg(boolean value) {
		setConstBoolean(offset + 181, $tax_on_pay_flg, value);
	}


	/**
	 *  支払税額端数処理区分.<p>
	 *
	 */
	public String pay_tax_rnd_typ() {
		return getConstString(offset + 182, $pay_tax_rnd_typ);
	}

	/**
	 *  支払税額端数処理区分.<p>
	 *
	 */
	public void pay_tax_rnd_typ(String value) {
		setConstString(offset + 182, $pay_tax_rnd_typ, value);
	}


	/**
	 *  バッチ支払予定締ＦＬＧ.<p>
	 *
	 */
	public boolean batch_pay_schd_cl_flg() {
		return getConstBoolean(offset + 183, $batch_pay_schd_cl_flg);
	}

	/**
	 *  バッチ支払予定締ＦＬＧ.<p>
	 *
	 */
	public void batch_pay_schd_cl_flg(boolean value) {
		setConstBoolean(offset + 183, $batch_pay_schd_cl_flg, value);
	}


	/**
	 *  支払予定締遅延日数.<p>
	 *
	 */
	public MCNumber pay_schd_cl_delay_days() {
		return getConstNumber(offset + 184, $pay_schd_cl_delay_days);
	}

	/**
	 *  支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 184, $pay_schd_cl_delay_days, value);
	}

	/**
	 *  支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(int value) {
		setConstNumber(offset + 184, $pay_schd_cl_delay_days, value);
	}

	/**
	 *  支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(long value) {
		setConstNumber(offset + 184, $pay_schd_cl_delay_days, value);
	}

	/**
	 *  支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(float value) {
		setConstNumber(offset + 184, $pay_schd_cl_delay_days, value);
	}

	/**
	 *  支払予定締遅延日数.<p>
	 *
	 */
	public void pay_schd_cl_delay_days(double value) {
		setConstNumber(offset + 184, $pay_schd_cl_delay_days, value);
	}


	/**
	 *  支払予定締前後区分.<p>
	 *
	 */
	public String pay_schd_cl_ba_typ() {
		return getConstString(offset + 185, $pay_schd_cl_ba_typ);
	}

	/**
	 *  支払予定締前後区分.<p>
	 *
	 */
	public void pay_schd_cl_ba_typ(String value) {
		setConstString(offset + 185, $pay_schd_cl_ba_typ, value);
	}


	/**
	 *  事業者ＮＯ.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 186, $biz_co_no);
	}

	/**
	 *  事業者ＮＯ.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 186, $biz_co_no, value);
	}


	/**
	 *  支払通知書発行対象ＦＬＧ.<p>
	 *
	 */
	public boolean pay_ntc_prnt_flg() {
		return getConstBoolean(offset + 187, $pay_ntc_prnt_flg);
	}

	/**
	 *  支払通知書発行対象ＦＬＧ.<p>
	 *
	 */
	public void pay_ntc_prnt_flg(boolean value) {
		setConstBoolean(offset + 187, $pay_ntc_prnt_flg, value);
	}


	/**
	 *  支払通知書送付郵便番号.<p>
	 *
	 */
	public String pay_ntc_zip_cd() {
		return getConstString(offset + 188, $pay_ntc_zip_cd);
	}

	/**
	 *  支払通知書送付郵便番号.<p>
	 *
	 */
	public void pay_ntc_zip_cd(String value) {
		setConstString(offset + 188, $pay_ntc_zip_cd, value);
	}


	/**
	 *  支払通知書送付住所１.<p>
	 *
	 */
	public String pay_ntc_addr1() {
		return getConstString(offset + 189, $pay_ntc_addr1);
	}

	/**
	 *  支払通知書送付住所１.<p>
	 *
	 */
	public void pay_ntc_addr1(String value) {
		setConstString(offset + 189, $pay_ntc_addr1, value);
	}


	/**
	 *  支払通知書送付住所２.<p>
	 *
	 */
	public String pay_ntc_addr2() {
		return getConstString(offset + 190, $pay_ntc_addr2);
	}

	/**
	 *  支払通知書送付住所２.<p>
	 *
	 */
	public void pay_ntc_addr2(String value) {
		setConstString(offset + 190, $pay_ntc_addr2, value);
	}


	/**
	 *  支払通知書送付住所３.<p>
	 *
	 */
	public String pay_ntc_addr3() {
		return getConstString(offset + 191, $pay_ntc_addr3);
	}

	/**
	 *  支払通知書送付住所３.<p>
	 *
	 */
	public void pay_ntc_addr3(String value) {
		setConstString(offset + 191, $pay_ntc_addr3, value);
	}


	/**
	 *  支払通知書送付住所４.<p>
	 *
	 */
	public String pay_ntc_addr4() {
		return getConstString(offset + 192, $pay_ntc_addr4);
	}

	/**
	 *  支払通知書送付住所４.<p>
	 *
	 */
	public void pay_ntc_addr4(String value) {
		setConstString(offset + 192, $pay_ntc_addr4, value);
	}


	/**
	 *  支払通知書宛先.<p>
	 *
	 */
	public String pay_ntc_bsppl_nm() {
		return getConstString(offset + 193, $pay_ntc_bsppl_nm);
	}

	/**
	 *  支払通知書宛先.<p>
	 *
	 */
	public void pay_ntc_bsppl_nm(String value) {
		setConstString(offset + 193, $pay_ntc_bsppl_nm, value);
	}


	/**
	 *  支払通知書送付部署.<p>
	 *
	 */
	public String pay_ntc_bsppl_dpt() {
		return getConstString(offset + 194, $pay_ntc_bsppl_dpt);
	}

	/**
	 *  支払通知書送付部署.<p>
	 *
	 */
	public void pay_ntc_bsppl_dpt(String value) {
		setConstString(offset + 194, $pay_ntc_bsppl_dpt, value);
	}


	/**
	 *  支払通知書送付担当者.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn() {
		return getConstString(offset + 195, $pay_ntc_bsppl_psn);
	}

	/**
	 *  支払通知書送付担当者.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn(String value) {
		setConstString(offset + 195, $pay_ntc_bsppl_psn, value);
	}


	/**
	 *  支払通知書送付担当者敬称.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn_title() {
		return getConstString(offset + 196, $pay_ntc_bsppl_psn_title);
	}

	/**
	 *  支払通知書送付担当者敬称.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn_title(String value) {
		setConstString(offset + 196, $pay_ntc_bsppl_psn_title, value);
	}


	/**
	 *  支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public String pay_ntc_tel() {
		return getConstString(offset + 197, $pay_ntc_tel);
	}

	/**
	 *  支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public void pay_ntc_tel(String value) {
		setConstString(offset + 197, $pay_ntc_tel, value);
	}


	/**
	 *  支払通知書明細出力ＦＬＧ.<p>
	 *
	 */
	public boolean pay_ntc_dtl_outp_flg() {
		return getConstBoolean(offset + 198, $pay_ntc_dtl_outp_flg);
	}

	/**
	 *  支払通知書明細出力ＦＬＧ.<p>
	 *
	 */
	public void pay_ntc_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 198, $pay_ntc_dtl_outp_flg, value);
	}


	/**
	 *  支払通知書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public boolean pay_ntc_bfw_bal_disp_flg() {
		return getConstBoolean(offset + 199, $pay_ntc_bfw_bal_disp_flg);
	}

	/**
	 *  支払通知書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public void pay_ntc_bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 199, $pay_ntc_bfw_bal_disp_flg, value);
	}


	/**
	 *  支払通知書前渡金表示ＦＬＧ.<p>
	 *
	 */
	public boolean pay_ntc_adv_pay_flg() {
		return getConstBoolean(offset + 200, $pay_ntc_adv_pay_flg);
	}

	/**
	 *  支払通知書前渡金表示ＦＬＧ.<p>
	 *
	 */
	public void pay_ntc_adv_pay_flg(boolean value) {
		setConstBoolean(offset + 200, $pay_ntc_adv_pay_flg, value);
	}


	/**
	 *  支払通知書支払予定表示ＦＬＧ.<p>
	 *
	 */
	public boolean pay_ntc_dtl_pay_flg() {
		return getConstBoolean(offset + 201, $pay_ntc_dtl_pay_flg);
	}

	/**
	 *  支払通知書支払予定表示ＦＬＧ.<p>
	 *
	 */
	public void pay_ntc_dtl_pay_flg(boolean value) {
		setConstBoolean(offset + 201, $pay_ntc_dtl_pay_flg, value);
	}


	/**
	 *  支払通知書明細小計区分.<p>
	 *
	 */
	public String pay_ntc_dtl_subttl_typ() {
		return getConstString(offset + 202, $pay_ntc_dtl_subttl_typ);
	}

	/**
	 *  支払通知書明細小計区分.<p>
	 *
	 */
	public void pay_ntc_dtl_subttl_typ(String value) {
		setConstString(offset + 202, $pay_ntc_dtl_subttl_typ, value);
	}


	/**
	 *  支払通知書明細改頁区分.<p>
	 *
	 */
	public String pay_ntc_dtl_brk_typ() {
		return getConstString(offset + 203, $pay_ntc_dtl_brk_typ);
	}

	/**
	 *  支払通知書明細改頁区分.<p>
	 *
	 */
	public void pay_ntc_dtl_brk_typ(String value) {
		setConstString(offset + 203, $pay_ntc_dtl_brk_typ, value);
	}


	/**
	 *  支払通知書明細並順区分.<p>
	 *
	 */
	public String pay_ntc_dtl_sort_typ() {
		return getConstString(offset + 204, $pay_ntc_dtl_sort_typ);
	}

	/**
	 *  支払通知書明細並順区分.<p>
	 *
	 */
	public void pay_ntc_dtl_sort_typ(String value) {
		setConstString(offset + 204, $pay_ntc_dtl_sort_typ, value);
	}


	/**
	 *  支払通知書取消伝票表示区分.<p>
	 *
	 */
	public String pay_ntc_can_slip_typ() {
		return getConstString(offset + 205, $pay_ntc_can_slip_typ);
	}

	/**
	 *  支払通知書取消伝票表示区分.<p>
	 *
	 */
	public void pay_ntc_can_slip_typ(String value) {
		setConstString(offset + 205, $pay_ntc_can_slip_typ, value);
	}


	/**
	 *  支払先備考.<p>
	 *
	 */
	public String psppl_rmrks() {
		return getConstString(offset + 206, $psppl_rmrks);
	}

	/**
	 *  支払先備考.<p>
	 *
	 */
	public void psppl_rmrks(String value) {
		setConstString(offset + 206, $psppl_rmrks, value);
	}


	/**
	 *  手形サイト上限.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 207, $note_days);
	}

	/**
	 *  手形サイト上限.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 207, $note_days, value);
	}

	/**
	 *  手形サイト上限.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 207, $note_days, value);
	}

	/**
	 *  手形サイト上限.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 207, $note_days, value);
	}

	/**
	 *  手形サイト上限.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 207, $note_days, value);
	}

	/**
	 *  手形サイト上限.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 207, $note_days, value);
	}


	/**
	 *  支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 208, $pay_dpt_cd);
	}

	/**
	 *  支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 208, $pay_dpt_cd, value);
	}


	/**
	 *  納品先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 209, $dlv_sundry_flg);
	}

	/**
	 *  納品先諸口ＦＬＧ.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 209, $dlv_sundry_flg, value);
	}


	/**
	 *  納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 210, $dlv_cntct_dpt);
	}

	/**
	 *  納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 210, $dlv_cntct_dpt, value);
	}


	/**
	 *  納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 211, $dlv_cntct_psn);
	}

	/**
	 *  納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 211, $dlv_cntct_psn, value);
	}


	/**
	 *  納品先担当者敬称.<p>
	 *
	 */
	public String dlv_cntct_psn_title() {
		return getConstString(offset + 212, $dlv_cntct_psn_title);
	}

	/**
	 *  納品先担当者敬称.<p>
	 *
	 */
	public void dlv_cntct_psn_title(String value) {
		setConstString(offset + 212, $dlv_cntct_psn_title, value);
	}


	/**
	 *  価格印字ＦＬＧ.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 213, $pri_prnt_flg);
	}

	/**
	 *  価格印字ＦＬＧ.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 213, $pri_prnt_flg, value);
	}


	/**
	 *  貸出在庫棚卸対象ＦＬＧ.<p>
	 *
	 */
	public boolean cnsgn_stktk_flg() {
		return getConstBoolean(offset + 214, $cnsgn_stktk_flg);
	}

	/**
	 *  貸出在庫棚卸対象ＦＬＧ.<p>
	 *
	 */
	public void cnsgn_stktk_flg(boolean value) {
		setConstBoolean(offset + 214, $cnsgn_stktk_flg, value);
	}


	/**
	 *  配送先ＦＬＧ.<p>
	 *
	 */
	public boolean tdlv_flg() {
		return getConstBoolean(offset + 215, $tdlv_flg);
	}

	/**
	 *  配送先ＦＬＧ.<p>
	 *
	 */
	public void tdlv_flg(boolean value) {
		setConstBoolean(offset + 215, $tdlv_flg, value);
	}


	/**
	 *  配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 216, $via_dlv_typ);
	}

	/**
	 *  配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 216, $via_dlv_typ, value);
	}


	/**
	 *  配送先必須ＦＬＧ.<p>
	 *
	 */
	public boolean tdlv_req_flg() {
		return getConstBoolean(offset + 217, $tdlv_req_flg);
	}

	/**
	 *  配送先必須ＦＬＧ.<p>
	 *
	 */
	public void tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 217, $tdlv_req_flg, value);
	}


	/**
	 *  物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 218, $lg_grp_cd);
	}

	/**
	 *  物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 218, $lg_grp_cd, value);
	}


	/**
	 *  納品先カレンダＣＤ.<p>
	 *
	 */
	public String dlv_cal_cd() {
		return getConstString(offset + 219, $dlv_cal_cd);
	}

	/**
	 *  納品先カレンダＣＤ.<p>
	 *
	 */
	public void dlv_cal_cd(String value) {
		setConstString(offset + 219, $dlv_cal_cd, value);
	}


	/**
	 *  納品先チャネル１.<p>
	 *
	 */
	public String dlv_chnnl1() {
		return getConstString(offset + 220, $dlv_chnnl1);
	}

	/**
	 *  納品先チャネル１.<p>
	 *
	 */
	public void dlv_chnnl1(String value) {
		setConstString(offset + 220, $dlv_chnnl1, value);
	}


	/**
	 *  納品先チャネル２.<p>
	 *
	 */
	public String dlv_chnnl2() {
		return getConstString(offset + 221, $dlv_chnnl2);
	}

	/**
	 *  納品先チャネル２.<p>
	 *
	 */
	public void dlv_chnnl2(String value) {
		setConstString(offset + 221, $dlv_chnnl2, value);
	}


	/**
	 *  納品先チャネル３.<p>
	 *
	 */
	public String dlv_chnnl3() {
		return getConstString(offset + 222, $dlv_chnnl3);
	}

	/**
	 *  納品先チャネル３.<p>
	 *
	 */
	public void dlv_chnnl3(String value) {
		setConstString(offset + 222, $dlv_chnnl3, value);
	}


	/**
	 *  帳票発行区分（得意先）.<p>
	 *
	 */
	public String cst_prnt_typ() {
		return getConstString(offset + 223, $cst_prnt_typ);
	}

	/**
	 *  帳票発行区分（得意先）.<p>
	 *
	 */
	public void cst_prnt_typ(String value) {
		setConstString(offset + 223, $cst_prnt_typ, value);
	}


	/**
	 *  帳票発行区分（売掛先）.<p>
	 *
	 */
	public String acst_prnt_typ() {
		return getConstString(offset + 224, $acst_prnt_typ);
	}

	/**
	 *  帳票発行区分（売掛先）.<p>
	 *
	 */
	public void acst_prnt_typ(String value) {
		setConstString(offset + 224, $acst_prnt_typ, value);
	}


	/**
	 *  帳票発行区分（請求先）.<p>
	 *
	 */
	public String bcst_prnt_typ() {
		return getConstString(offset + 225, $bcst_prnt_typ);
	}

	/**
	 *  帳票発行区分（請求先）.<p>
	 *
	 */
	public void bcst_prnt_typ(String value) {
		setConstString(offset + 225, $bcst_prnt_typ, value);
	}


	/**
	 *  帳票発行区分（入金先）.<p>
	 *
	 */
	public String rcst_prnt_typ() {
		return getConstString(offset + 226, $rcst_prnt_typ);
	}

	/**
	 *  帳票発行区分（入金先）.<p>
	 *
	 */
	public void rcst_prnt_typ(String value) {
		setConstString(offset + 226, $rcst_prnt_typ, value);
	}


	/**
	 *  帳票発行区分（発注先）.<p>
	 *
	 */
	public String sppl_prnt_typ() {
		return getConstString(offset + 227, $sppl_prnt_typ);
	}

	/**
	 *  帳票発行区分（発注先）.<p>
	 *
	 */
	public void sppl_prnt_typ(String value) {
		setConstString(offset + 227, $sppl_prnt_typ, value);
	}


	/**
	 *  帳票発行区分（買掛先）.<p>
	 *
	 */
	public String asppl_prnt_typ() {
		return getConstString(offset + 228, $asppl_prnt_typ);
	}

	/**
	 *  帳票発行区分（買掛先）.<p>
	 *
	 */
	public void asppl_prnt_typ(String value) {
		setConstString(offset + 228, $asppl_prnt_typ, value);
	}


	/**
	 *  帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public String bsppl_prnt_typ() {
		return getConstString(offset + 229, $bsppl_prnt_typ);
	}

	/**
	 *  帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public void bsppl_prnt_typ(String value) {
		setConstString(offset + 229, $bsppl_prnt_typ, value);
	}


	/**
	 *  帳票発行区分（支払先）.<p>
	 *
	 */
	public String psppl_prnt_typ() {
		return getConstString(offset + 230, $psppl_prnt_typ);
	}

	/**
	 *  帳票発行区分（支払先）.<p>
	 *
	 */
	public void psppl_prnt_typ(String value) {
		setConstString(offset + 230, $psppl_prnt_typ, value);
	}


	/**
	 *  帳票発行区分（納品先）.<p>
	 *
	 */
	public String dlv_prnt_typ() {
		return getConstString(offset + 231, $dlv_prnt_typ);
	}

	/**
	 *  帳票発行区分（納品先）.<p>
	 *
	 */
	public void dlv_prnt_typ(String value) {
		setConstString(offset + 231, $dlv_prnt_typ, value);
	}


	/**
	 *  メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 232, $memo1);
	}

	/**
	 *  メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 232, $memo1, value);
	}


	/**
	 *  メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 233, $memo2);
	}

	/**
	 *  メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 233, $memo2, value);
	}


	/**
	 *  メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 234, $memo3);
	}

	/**
	 *  メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 234, $memo3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 235, $if_sub_char1);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 235, $if_sub_char1, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 236, $if_sub_char2);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 236, $if_sub_char2, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 237, $if_sub_char3);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 237, $if_sub_char3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 238, $if_sub_char4);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 238, $if_sub_char4, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 239, $if_sub_char5);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 239, $if_sub_char5, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 240, $if_sub_char6);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 240, $if_sub_char6, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 241, $if_sub_char7);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 241, $if_sub_char7, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 242, $if_sub_char8);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 242, $if_sub_char8, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 243, $if_sub_char9);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 243, $if_sub_char9, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 244, $if_sub_char10);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 244, $if_sub_char10, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 245, $if_sub_char11);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 245, $if_sub_char11, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 246, $if_sub_char12);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 246, $if_sub_char12, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 247, $if_sub_char13);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 247, $if_sub_char13, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 248, $if_sub_char14);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 248, $if_sub_char14, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 249, $if_sub_char15);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 249, $if_sub_char15, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 250, $if_sub_char16);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 250, $if_sub_char16, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 251, $if_sub_char17);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 251, $if_sub_char17, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 252, $if_sub_char18);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 252, $if_sub_char18, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 253, $if_sub_char19);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 253, $if_sub_char19, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 254, $if_sub_char20);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 254, $if_sub_char20, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 255, $if_sub_char21);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 255, $if_sub_char21, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 256, $if_sub_char22);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 256, $if_sub_char22, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 257, $if_sub_char23);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 257, $if_sub_char23, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 258, $if_sub_char24);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 258, $if_sub_char24, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 259, $if_sub_char25);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 259, $if_sub_char25, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 260, $if_sub_char26);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 260, $if_sub_char26, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 261, $if_sub_char27);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 261, $if_sub_char27, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 262, $if_sub_char28);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 262, $if_sub_char28, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 263, $if_sub_char29);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 263, $if_sub_char29, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 264, $if_sub_char30);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 264, $if_sub_char30, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 265, $if_sub_num1);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 265, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 265, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 265, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 265, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 265, $if_sub_num1, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 266, $if_sub_num2);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 266, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 266, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 266, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 266, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 266, $if_sub_num2, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 267, $if_sub_num3);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 267, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 267, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 267, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 267, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 267, $if_sub_num3, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 268, $if_sub_num4);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 268, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 268, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 268, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 268, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 268, $if_sub_num4, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 269, $if_sub_num5);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 269, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 269, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 269, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 269, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 269, $if_sub_num5, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 270, $if_sub_dt1);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 270, $if_sub_dt1, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 271, $if_sub_dt2);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 271, $if_sub_dt2, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 272, $if_sub_dt3);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 272, $if_sub_dt3, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 273, $if_sub_dt4);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 273, $if_sub_dt4, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 274, $if_sub_dt5);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 274, $if_sub_dt5, value);
	}


	/**
	 *  メモ４.<p>
	 *
	 */
	public String memo4() {
		return getConstString(offset + 275, $memo4);
	}

	/**
	 *  メモ４.<p>
	 *
	 */
	public void memo4(String value) {
		setConstString(offset + 275, $memo4, value);
	}


	/**
	 *  メモ５.<p>
	 *
	 */
	public String memo5() {
		return getConstString(offset + 276, $memo5);
	}

	/**
	 *  メモ５.<p>
	 *
	 */
	public void memo5(String value) {
		setConstString(offset + 276, $memo5, value);
	}


	/**
	 *  メモ６.<p>
	 *
	 */
	public String memo6() {
		return getConstString(offset + 277, $memo6);
	}

	/**
	 *  メモ６.<p>
	 *
	 */
	public void memo6(String value) {
		setConstString(offset + 277, $memo6, value);
	}


	/**
	 *  メモ７.<p>
	 *
	 */
	public String memo7() {
		return getConstString(offset + 278, $memo7);
	}

	/**
	 *  メモ７.<p>
	 *
	 */
	public void memo7(String value) {
		setConstString(offset + 278, $memo7, value);
	}


	/**
	 *  メモ８.<p>
	 *
	 */
	public String memo8() {
		return getConstString(offset + 279, $memo8);
	}

	/**
	 *  メモ８.<p>
	 *
	 */
	public void memo8(String value) {
		setConstString(offset + 279, $memo8, value);
	}


	/**
	 *  メモ９.<p>
	 *
	 */
	public String memo9() {
		return getConstString(offset + 280, $memo9);
	}

	/**
	 *  メモ９.<p>
	 *
	 */
	public void memo9(String value) {
		setConstString(offset + 280, $memo9, value);
	}


	/**
	 *  メモ１０.<p>
	 *
	 */
	public String memo10() {
		return getConstString(offset + 281, $memo10);
	}

	/**
	 *  メモ１０.<p>
	 *
	 */
	public void memo10(String value) {
		setConstString(offset + 281, $memo10, value);
	}


	/**
	 *  メモ１１.<p>
	 *
	 */
	public String memo11() {
		return getConstString(offset + 282, $memo11);
	}

	/**
	 *  メモ１１.<p>
	 *
	 */
	public void memo11(String value) {
		setConstString(offset + 282, $memo11, value);
	}


	/**
	 *  メモ１２.<p>
	 *
	 */
	public String memo12() {
		return getConstString(offset + 283, $memo12);
	}

	/**
	 *  メモ１２.<p>
	 *
	 */
	public void memo12(String value) {
		setConstString(offset + 283, $memo12, value);
	}


	/**
	 *  メモ１３.<p>
	 *
	 */
	public String memo13() {
		return getConstString(offset + 284, $memo13);
	}

	/**
	 *  メモ１３.<p>
	 *
	 */
	public void memo13(String value) {
		setConstString(offset + 284, $memo13, value);
	}


	/**
	 *  メモ１４.<p>
	 *
	 */
	public String memo14() {
		return getConstString(offset + 285, $memo14);
	}

	/**
	 *  メモ１４.<p>
	 *
	 */
	public void memo14(String value) {
		setConstString(offset + 285, $memo14, value);
	}


	/**
	 *  メモ１５.<p>
	 *
	 */
	public String memo15() {
		return getConstString(offset + 286, $memo15);
	}

	/**
	 *  メモ１５.<p>
	 *
	 */
	public void memo15(String value) {
		setConstString(offset + 286, $memo15, value);
	}


	/**
	 *  メモ１６.<p>
	 *
	 */
	public String memo16() {
		return getConstString(offset + 287, $memo16);
	}

	/**
	 *  メモ１６.<p>
	 *
	 */
	public void memo16(String value) {
		setConstString(offset + 287, $memo16, value);
	}


	/**
	 *  メモ１７.<p>
	 *
	 */
	public String memo17() {
		return getConstString(offset + 288, $memo17);
	}

	/**
	 *  メモ１７.<p>
	 *
	 */
	public void memo17(String value) {
		setConstString(offset + 288, $memo17, value);
	}


	/**
	 *  メモ１８.<p>
	 *
	 */
	public String memo18() {
		return getConstString(offset + 289, $memo18);
	}

	/**
	 *  メモ１８.<p>
	 *
	 */
	public void memo18(String value) {
		setConstString(offset + 289, $memo18, value);
	}


	/**
	 *  メモ１９.<p>
	 *
	 */
	public String memo19() {
		return getConstString(offset + 290, $memo19);
	}

	/**
	 *  メモ１９.<p>
	 *
	 */
	public void memo19(String value) {
		setConstString(offset + 290, $memo19, value);
	}


	/**
	 *  メモ２０.<p>
	 *
	 */
	public String memo20() {
		return getConstString(offset + 291, $memo20);
	}

	/**
	 *  メモ２０.<p>
	 *
	 */
	public void memo20(String value) {
		setConstString(offset + 291, $memo20, value);
	}


	/**
	 *  物流グループ混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 292, $not_lg_mix_flg);
	}

	/**
	 *  物流グループ混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 292, $not_lg_mix_flg, value);
	}


	/**
	 *  ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 293, $not_lot_mix_flg);
	}

	/**
	 *  ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 293, $not_lot_mix_flg, value);
	}


	/**
	 *  サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 294, $not_sublot_mix_flg);
	}

	/**
	 *  サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 294, $not_sublot_mix_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
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
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ();
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			return dlv_chnnl1();
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			return dlv_chnnl2();
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			return dlv_chnnl3();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_schd_cl_delay_days();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			return all_com_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_inst_dlv_slip_flg();
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_dup_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_flg();
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_bfw_bal_disp_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_pay_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			return cnsgn_stktk_flg();
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			return tdlv_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
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
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_ba_typ();
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			return pay_tax_rnd_typ();
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_schd_cl_ba_typ();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_subttl_typ();
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_brk_typ();
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_sort_typ();
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			return pay_ntc_can_slip_typ();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			return dlv_chnnl1();
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			return dlv_chnnl2();
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			return dlv_chnnl3();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_schd_cl_delay_days();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			return all_com_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			return po_dlv_slip_flg();
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			return dlv_inst_dlv_slip_flg();
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_dup_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			return tax_on_pay_flg();
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			return batch_pay_schd_cl_flg();
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			return pay_ntc_prnt_flg();
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_bfw_bal_disp_flg();
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_adv_pay_flg();
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_pay_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			return cnsgn_stktk_flg();
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			return tdlv_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
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
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			dlv_chnnl1(value);
			return;
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			dlv_chnnl2(value);
			return;
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			dlv_chnnl3(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			all_com_flg(value);
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
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
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
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_inst_dlv_slip_flg(value);
			return;
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			rcpt_iv_dup_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_flg(value);
			return;
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			pay_ntc_bfw_bal_disp_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_pay_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			cnsgn_stktk_flg(value);
			return;
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			tdlv_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
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
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_schd_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_ba_typ(value);
			return;
		}
		if ($pay_tax_rnd_typ.equalsIgnoreCase(name)) {
			pay_tax_rnd_typ(value);
			return;
		}
		if ($pay_schd_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_schd_cl_ba_typ(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($pay_ntc_dtl_subttl_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_subttl_typ(value);
			return;
		}
		if ($pay_ntc_dtl_brk_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_brk_typ(value);
			return;
		}
		if ($pay_ntc_dtl_sort_typ.equalsIgnoreCase(name)) {
			pay_ntc_dtl_sort_typ(value);
			return;
		}
		if ($pay_ntc_can_slip_typ.equalsIgnoreCase(name)) {
			pay_ntc_can_slip_typ(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			dlv_chnnl1(value);
			return;
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			dlv_chnnl2(value);
			return;
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			dlv_chnnl3(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
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
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($pay_schd_cl_delay_days.equalsIgnoreCase(name)) {
			pay_schd_cl_delay_days(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($all_com_flg.equalsIgnoreCase(name)) {
			all_com_flg(value);
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
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
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
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($po_dlv_slip_flg.equalsIgnoreCase(name)) {
			po_dlv_slip_flg(value);
			return;
		}
		if ($dlv_inst_dlv_slip_flg.equalsIgnoreCase(name)) {
			dlv_inst_dlv_slip_flg(value);
			return;
		}
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($rcpt_iv_dup_flg.equalsIgnoreCase(name)) {
			rcpt_iv_dup_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($tax_on_pay_flg.equalsIgnoreCase(name)) {
			tax_on_pay_flg(value);
			return;
		}
		if ($batch_pay_schd_cl_flg.equalsIgnoreCase(name)) {
			batch_pay_schd_cl_flg(value);
			return;
		}
		if ($pay_ntc_prnt_flg.equalsIgnoreCase(name)) {
			pay_ntc_prnt_flg(value);
			return;
		}
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		if ($pay_ntc_bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			pay_ntc_bfw_bal_disp_flg(value);
			return;
		}
		if ($pay_ntc_adv_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_adv_pay_flg(value);
			return;
		}
		if ($pay_ntc_dtl_pay_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_pay_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			cnsgn_stktk_flg(value);
			return;
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			tdlv_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
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

