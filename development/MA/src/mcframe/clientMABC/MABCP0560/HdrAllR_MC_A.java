package mcframe.clientMABC.MABCP0560;

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
 * ブロック"HdrAll"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrAllR_MC_A extends MCConstRow {

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
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public static final String $bcst_flg = "bcst_flg";
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public static final String $rcst_flg = "rcst_flg";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ar_cred_cd = "ar_cred_cd";
	/**
	 * AR credit managed BP name 債権与信管理先名.<p>
	 *
	 */
	public static final String $ar_cred_nm = "ar_cred_nm";
	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public static final String $bill_dpt_typ = "bill_dpt_typ";
	/**
	 * Billing dept. type name 請求部門区分名.<p>
	 *
	 */
	public static final String $bill_dpt_typ_nm = "bill_dpt_typ_nm";
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bcst_dpt_cd = "bcst_dpt_cd";
	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public static final String $bcst_dpt_nm = "bcst_dpt_nm";
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $check_bcst_dpt_cd = "check_bcst_dpt_cd";
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public static final String $bill_cl_typ_nm = "bill_cl_typ_nm";
	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public static final String $bill_cl_day1 = "bill_cl_day1";
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public static final String $bill_cl_day2 = "bill_cl_day2";
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public static final String $bill_cl_day3 = "bill_cl_day3";
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public static final String $bill_cl_day4 = "bill_cl_day4";
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public static final String $bill_cl_day5 = "bill_cl_day5";
	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public static final String $tax_on_bill_flg = "tax_on_bill_flg";
	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public static final String $bill_tax_rnd_typ = "bill_tax_rnd_typ";
	/**
	 * Billing tax rounding type 請求税額端数処理区分名.<p>
	 *
	 */
	public static final String $bill_tax_rnd_typ_nm = "bill_tax_rnd_typ_nm";
	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public static final String $bill_cl_delay_days = "bill_cl_delay_days";
	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public static final String $bill_cl_ba_typ = "bill_cl_ba_typ";
	/**
	 * Before/after billing closing type name 請求締前後区分名.<p>
	 *
	 */
	public static final String $bill_cl_ba_typ_nm = "bill_cl_ba_typ_nm";
	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public static final String $bill_cal_cd = "bill_cal_cd";
	/**
	 * Billing customer calendar name 請求先カレンダ名.<p>
	 *
	 */
	public static final String $bill_cal_nm = "bill_cal_nm";
	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public static final String $rcv_ba_typ = "rcv_ba_typ";
	/**
	 * Payment receipt schedule before/after type name 入金予定前後区分名.<p>
	 *
	 */
	public static final String $rcv_ba_typ_nm = "rcv_ba_typ_nm";
	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public static final String $auto_line_appl_flg = "auto_line_appl_flg";
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public static final String $sls_interim_cl_flg = "sls_interim_cl_flg";
	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ar_setoff_grp_cd = "ar_setoff_grp_cd";
	/**
	 * AR offset group name 債権相殺グループ名.<p>
	 *
	 */
	public static final String $ar_setoff_grp_nm = "ar_setoff_grp_nm";
	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public static final String $bcst_prnt_typ = "bcst_prnt_typ";
	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public static final String $bcst_prnt_typ_nm = "bcst_prnt_typ_nm";
	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public static final String $bill_zip_cd = "bill_zip_cd";
	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public static final String $bill_addr1 = "bill_addr1";
	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public static final String $bill_addr2 = "bill_addr2";
	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public static final String $bill_addr3 = "bill_addr3";
	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public static final String $bill_addr4 = "bill_addr4";
	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public static final String $bill_bcst_psn = "bill_bcst_psn";
	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public static final String $bill_bcst_psn_title = "bill_bcst_psn_title";
	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public static final String $bill_prnt_typ = "bill_prnt_typ";
	/**
	 * Invoice issue type name 請求書発行区分名.<p>
	 *
	 */
	public static final String $bill_prnt_typ_nm = "bill_prnt_typ_nm";
	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public static final String $sls_dtl_outp_typ = "sls_dtl_outp_typ";
	/**
	 * Sales details output type name 売上明細書出力区分名.<p>
	 *
	 */
	public static final String $sls_dtl_outp_typ_nm = "sls_dtl_outp_typ_nm";
	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public static final String $bill_dtl_outp_flg = "bill_dtl_outp_flg";
	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public static final String $bfw_bal_disp_flg = "bfw_bal_disp_flg";
	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public static final String $bill_dtl_adv_flg = "bill_dtl_adv_flg";
	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public static final String $bill_dtl_rcv_flg = "bill_dtl_rcv_flg";
	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public static final String $bill_dtl_subttl_typ = "bill_dtl_subttl_typ";
	/**
	 * Invoice details subtotal type name 請求書明細小計区分名.<p>
	 *
	 */
	public static final String $bill_dtl_subttl_typ_nm = "bill_dtl_subttl_typ_nm";
	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public static final String $bill_dtl_brk_typ = "bill_dtl_brk_typ";
	/**
	 * Invoice details page break type name 請求書明細改頁区分名.<p>
	 *
	 */
	public static final String $bill_dtl_brk_typ_nm = "bill_dtl_brk_typ_nm";
	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public static final String $bill_dtl_sort_typ = "bill_dtl_sort_typ";
	/**
	 * Invoice details sort order type name 請求書明細並順区分名.<p>
	 *
	 */
	public static final String $bill_dtl_sort_typ_nm = "bill_dtl_sort_typ_nm";
	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public static final String $bill_can_slip_typ = "bill_can_slip_typ";
	/**
	 * Invoice cancel slip display type name 請求書取消伝票表示区分名.<p>
	 *
	 */
	public static final String $bill_can_slip_typ_nm = "bill_can_slip_typ_nm";
	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public static final String $rcv_auto_appl_tgt_flg = "rcv_auto_appl_tgt_flg";
	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public static final String $rcv_amt_match_flg = "rcv_amt_match_flg";
	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public static final String $ar_sttl_typ_match_flg = "ar_sttl_typ_match_flg";
	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public static final String $calc_com_paid_flg = "calc_com_paid_flg";
	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public static final String $auto_appl_delay_days = "auto_appl_delay_days";
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
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
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public static final String $rcst_prnt_typ = "rcst_prnt_typ";
	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public static final String $rcst_prnt_typ_nm = "rcst_prnt_typ_nm";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_flg_META = createCommonMeta($bcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_flg_META = createCommonMeta($rcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_cred_cd_META = createCommonMeta($ar_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_cred_nm_META = createCommonMeta($ar_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_dpt_typ_META = createCommonMeta($bill_dpt_typ, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP);
	public static final MCMeta bill_dpt_typ_nm_META = createCommonMeta($bill_dpt_typ_nm, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP_NM);
	public static final MCMeta bcst_dpt_cd_META = createCommonMeta($bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bcst_dpt_nm_META = createCommonMeta($bcst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta check_bcst_dpt_cd_META = createCommonMeta($check_bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta bill_cl_typ_nm_META = createCommonMeta($bill_cl_typ_nm, mcframe.commonMA.meta.MA_META.BILL_CL_TYP_NM);
	public static final MCMeta bill_cl_day1_META = createCommonMeta($bill_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day2_META = createCommonMeta($bill_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day3_META = createCommonMeta($bill_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day4_META = createCommonMeta($bill_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day5_META = createCommonMeta($bill_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta tax_on_bill_flg_META = createCommonMeta($tax_on_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_rnd_typ_META = createCommonMeta($bill_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta bill_tax_rnd_typ_nm_META = createCommonMeta($bill_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta bill_cl_delay_days_META = createCommonMeta($bill_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta bill_cl_ba_typ_META = createCommonMeta($bill_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta bill_cl_ba_typ_nm_META = createCommonMeta($bill_cl_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta bill_cal_cd_META = createCommonMeta($bill_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta bill_cal_nm_META = createCommonMeta($bill_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta rcv_ba_typ_META = createCommonMeta($rcv_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta rcv_ba_typ_nm_META = createCommonMeta($rcv_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta auto_line_appl_flg_META = createCommonMeta($auto_line_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_interim_cl_flg_META = createCommonMeta($sls_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_setoff_grp_cd_META = createCommonMeta($ar_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta ar_setoff_grp_nm_META = createCommonMeta($ar_setoff_grp_nm, mcframe.commonMA.meta.MA_META.SETOFF_GRP_NM);
	public static final MCMeta bcst_prnt_typ_META = createCommonMeta($bcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bcst_prnt_typ_nm_META = createCommonMeta($bcst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
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
	public static final MCMeta bill_prnt_typ_META = createCommonMeta($bill_prnt_typ, mcframe.commonMA.meta.MA_META.BILL_PRNT_TYP);
	public static final MCMeta bill_prnt_typ_nm_META = createCommonMeta($bill_prnt_typ_nm, mcframe.commonMA.meta.MA_META.BILL_PRNT_TYP_NM);
	public static final MCMeta sls_dtl_outp_typ_META = createCommonMeta($sls_dtl_outp_typ, mcframe.commonMA.meta.MA_META.SLS_DTL_OUTP_TYP);
	public static final MCMeta sls_dtl_outp_typ_nm_META = createCommonMeta($sls_dtl_outp_typ_nm, mcframe.commonMA.meta.MA_META.SLS_DTL_OUTP_TYP_NM);
	public static final MCMeta bill_dtl_outp_flg_META = createCommonMeta($bill_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bfw_bal_disp_flg_META = createCommonMeta($bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_adv_flg_META = createCommonMeta($bill_dtl_adv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_rcv_flg_META = createCommonMeta($bill_dtl_rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_subttl_typ_META = createCommonMeta($bill_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SUBTTL_TYP);
	public static final MCMeta bill_dtl_subttl_typ_nm_META = createCommonMeta($bill_dtl_subttl_typ_nm, mcframe.commonMA.meta.MA_META.BILL_DTL_SUBTTL_TYP_NM);
	public static final MCMeta bill_dtl_brk_typ_META = createCommonMeta($bill_dtl_brk_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_BRK_TYP);
	public static final MCMeta bill_dtl_brk_typ_nm_META = createCommonMeta($bill_dtl_brk_typ_nm, mcframe.commonMA.meta.MA_META.BILL_DTL_BRK_TYP_NM);
	public static final MCMeta bill_dtl_sort_typ_META = createCommonMeta($bill_dtl_sort_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SORT_TYP);
	public static final MCMeta bill_dtl_sort_typ_nm_META = createCommonMeta($bill_dtl_sort_typ_nm, mcframe.commonMA.meta.MA_META.BILL_DTL_SORT_TYP_NM);
	public static final MCMeta bill_can_slip_typ_META = createCommonMeta($bill_can_slip_typ, mcframe.commonMA.meta.MA_META.BILL_CAN_SLIP_TYP);
	public static final MCMeta bill_can_slip_typ_nm_META = createCommonMeta($bill_can_slip_typ_nm, mcframe.commonMA.meta.MA_META.BILL_CAN_SLIP_TYP_NM);
	public static final MCMeta rcv_auto_appl_tgt_flg_META = createCommonMeta($rcv_auto_appl_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_amt_match_flg_META = createCommonMeta($rcv_amt_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_sttl_typ_match_flg_META = createCommonMeta($ar_sttl_typ_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_com_paid_flg_META = createCommonMeta($calc_com_paid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_appl_delay_days_META = createCommonMeta($auto_appl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
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
	public static final MCMeta rcst_prnt_typ_META = createCommonMeta($rcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta rcst_prnt_typ_nm_META = createCommonMeta($rcst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);

	protected static final ConstMetaList<HdrAllR> constMetas = new ConstMetaList<HdrAllR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			bp_cd_META,
			bp_nm_META,
			bcst_flg_META,
			rcst_flg_META,
			rcst_cd_META,
			rcst_nm_META,
			ar_cred_cd_META,
			ar_cred_nm_META,
			bill_dpt_typ_META,
			bill_dpt_typ_nm_META,
			bcst_dpt_cd_META,
			bcst_dpt_nm_META,
			check_bcst_dpt_cd_META,
			bill_cl_typ_META,
			bill_cl_typ_nm_META,
			bill_cl_day1_META,
			bill_cl_day2_META,
			bill_cl_day3_META,
			bill_cl_day4_META,
			bill_cl_day5_META,
			tax_on_bill_flg_META,
			bill_tax_rnd_typ_META,
			bill_tax_rnd_typ_nm_META,
			bill_cl_delay_days_META,
			bill_cl_ba_typ_META,
			bill_cl_ba_typ_nm_META,
			bill_cal_cd_META,
			bill_cal_nm_META,
			rcv_ba_typ_META,
			rcv_ba_typ_nm_META,
			auto_line_appl_flg_META,
			sls_interim_cl_flg_META,
			ar_setoff_grp_cd_META,
			ar_setoff_grp_nm_META,
			bcst_prnt_typ_META,
			bcst_prnt_typ_nm_META,
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
			bill_prnt_typ_META,
			bill_prnt_typ_nm_META,
			sls_dtl_outp_typ_META,
			sls_dtl_outp_typ_nm_META,
			bill_dtl_outp_flg_META,
			bfw_bal_disp_flg_META,
			bill_dtl_adv_flg_META,
			bill_dtl_rcv_flg_META,
			bill_dtl_subttl_typ_META,
			bill_dtl_subttl_typ_nm_META,
			bill_dtl_brk_typ_META,
			bill_dtl_brk_typ_nm_META,
			bill_dtl_sort_typ_META,
			bill_dtl_sort_typ_nm_META,
			bill_can_slip_typ_META,
			bill_can_slip_typ_nm_META,
			rcv_auto_appl_tgt_flg_META,
			rcv_amt_match_flg_META,
			ar_sttl_typ_match_flg_META,
			calc_com_paid_flg_META,
			auto_appl_delay_days_META,
			xfr_psn_META,
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
			rcst_prnt_typ_META,
			rcst_prnt_typ_nm_META
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
				{$ar_cred_cd, "CRED"},	// ar_cred_cd
				{$ar_cred_nm, "CRED"}	// ar_cred_nm
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
	protected HdrAllR_MC_A(ConstMetaList<? extends HdrAllR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrAllR clone() {
		return (HdrAllR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrAllR createInstance() {
		return (HdrAllR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrAllR getValues(String... names) {
		return (HdrAllR) super.getValues(names);
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
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 2, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 2, $bp_nm, value);
	}


	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public boolean bcst_flg() {
		return getConstBoolean(offset + 3, $bcst_flg);
	}

	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public void bcst_flg(boolean value) {
		setConstBoolean(offset + 3, $bcst_flg, value);
	}


	/**
	 * Payer 入金先.<p>
	 *
	 */
	public boolean rcst_flg() {
		return getConstBoolean(offset + 4, $rcst_flg);
	}

	/**
	 * Payer 入金先.<p>
	 *
	 */
	public void rcst_flg(boolean value) {
		setConstBoolean(offset + 4, $rcst_flg, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 5, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 5, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 6, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 6, $rcst_nm, value);
	}


	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public String ar_cred_cd() {
		return getConstString(offset + 7, $ar_cred_cd);
	}

	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public void ar_cred_cd(String value) {
		setConstString(offset + 7, $ar_cred_cd, value);
	}


	/**
	 * AR credit managed BP name 債権与信管理先名.<p>
	 *
	 */
	public String ar_cred_nm() {
		return getConstString(offset + 8, $ar_cred_nm);
	}

	/**
	 * AR credit managed BP name 債権与信管理先名.<p>
	 *
	 */
	public void ar_cred_nm(String value) {
		setConstString(offset + 8, $ar_cred_nm, value);
	}


	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public String bill_dpt_typ() {
		return getConstString(offset + 9, $bill_dpt_typ);
	}

	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public void bill_dpt_typ(String value) {
		setConstString(offset + 9, $bill_dpt_typ, value);
	}


	/**
	 * Billing dept. type name 請求部門区分名.<p>
	 *
	 */
	public String bill_dpt_typ_nm() {
		return getConstString(offset + 10, $bill_dpt_typ_nm);
	}

	/**
	 * Billing dept. type name 請求部門区分名.<p>
	 *
	 */
	public void bill_dpt_typ_nm(String value) {
		setConstString(offset + 10, $bill_dpt_typ_nm, value);
	}


	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public String bcst_dpt_cd() {
		return getConstString(offset + 11, $bcst_dpt_cd);
	}

	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public void bcst_dpt_cd(String value) {
		setConstString(offset + 11, $bcst_dpt_cd, value);
	}


	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public String bcst_dpt_nm() {
		return getConstString(offset + 12, $bcst_dpt_nm);
	}

	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public void bcst_dpt_nm(String value) {
		setConstString(offset + 12, $bcst_dpt_nm, value);
	}


	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public String check_bcst_dpt_cd() {
		return getConstString(offset + 13, $check_bcst_dpt_cd);
	}

	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public void check_bcst_dpt_cd(String value) {
		setConstString(offset + 13, $check_bcst_dpt_cd, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 14, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 14, $bill_cl_typ, value);
	}


	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public String bill_cl_typ_nm() {
		return getConstString(offset + 15, $bill_cl_typ_nm);
	}

	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public void bill_cl_typ_nm(String value) {
		setConstString(offset + 15, $bill_cl_typ_nm, value);
	}


	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCNumber bill_cl_day1() {
		return getConstNumber(offset + 16, $bill_cl_day1);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(MCNumber value) {
		setConstNumber(offset + 16, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(int value) {
		setConstNumber(offset + 16, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(long value) {
		setConstNumber(offset + 16, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(float value) {
		setConstNumber(offset + 16, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(double value) {
		setConstNumber(offset + 16, $bill_cl_day1, value);
	}


	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCNumber bill_cl_day2() {
		return getConstNumber(offset + 17, $bill_cl_day2);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(MCNumber value) {
		setConstNumber(offset + 17, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(int value) {
		setConstNumber(offset + 17, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(long value) {
		setConstNumber(offset + 17, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(float value) {
		setConstNumber(offset + 17, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(double value) {
		setConstNumber(offset + 17, $bill_cl_day2, value);
	}


	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCNumber bill_cl_day3() {
		return getConstNumber(offset + 18, $bill_cl_day3);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(MCNumber value) {
		setConstNumber(offset + 18, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(int value) {
		setConstNumber(offset + 18, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(long value) {
		setConstNumber(offset + 18, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(float value) {
		setConstNumber(offset + 18, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(double value) {
		setConstNumber(offset + 18, $bill_cl_day3, value);
	}


	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCNumber bill_cl_day4() {
		return getConstNumber(offset + 19, $bill_cl_day4);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(MCNumber value) {
		setConstNumber(offset + 19, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(int value) {
		setConstNumber(offset + 19, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(long value) {
		setConstNumber(offset + 19, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(float value) {
		setConstNumber(offset + 19, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(double value) {
		setConstNumber(offset + 19, $bill_cl_day4, value);
	}


	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCNumber bill_cl_day5() {
		return getConstNumber(offset + 20, $bill_cl_day5);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(MCNumber value) {
		setConstNumber(offset + 20, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(int value) {
		setConstNumber(offset + 20, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(long value) {
		setConstNumber(offset + 20, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(float value) {
		setConstNumber(offset + 20, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(double value) {
		setConstNumber(offset + 20, $bill_cl_day5, value);
	}


	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public boolean tax_on_bill_flg() {
		return getConstBoolean(offset + 21, $tax_on_bill_flg);
	}

	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public void tax_on_bill_flg(boolean value) {
		setConstBoolean(offset + 21, $tax_on_bill_flg, value);
	}


	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public String bill_tax_rnd_typ() {
		return getConstString(offset + 22, $bill_tax_rnd_typ);
	}

	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public void bill_tax_rnd_typ(String value) {
		setConstString(offset + 22, $bill_tax_rnd_typ, value);
	}


	/**
	 * Billing tax rounding type 請求税額端数処理区分名.<p>
	 *
	 */
	public String bill_tax_rnd_typ_nm() {
		return getConstString(offset + 23, $bill_tax_rnd_typ_nm);
	}

	/**
	 * Billing tax rounding type 請求税額端数処理区分名.<p>
	 *
	 */
	public void bill_tax_rnd_typ_nm(String value) {
		setConstString(offset + 23, $bill_tax_rnd_typ_nm, value);
	}


	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public MCNumber bill_cl_delay_days() {
		return getConstNumber(offset + 24, $bill_cl_delay_days);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 24, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(int value) {
		setConstNumber(offset + 24, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(long value) {
		setConstNumber(offset + 24, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(float value) {
		setConstNumber(offset + 24, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(double value) {
		setConstNumber(offset + 24, $bill_cl_delay_days, value);
	}


	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public String bill_cl_ba_typ() {
		return getConstString(offset + 25, $bill_cl_ba_typ);
	}

	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public void bill_cl_ba_typ(String value) {
		setConstString(offset + 25, $bill_cl_ba_typ, value);
	}


	/**
	 * Before/after billing closing type name 請求締前後区分名.<p>
	 *
	 */
	public String bill_cl_ba_typ_nm() {
		return getConstString(offset + 26, $bill_cl_ba_typ_nm);
	}

	/**
	 * Before/after billing closing type name 請求締前後区分名.<p>
	 *
	 */
	public void bill_cl_ba_typ_nm(String value) {
		setConstString(offset + 26, $bill_cl_ba_typ_nm, value);
	}


	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public String bill_cal_cd() {
		return getConstString(offset + 27, $bill_cal_cd);
	}

	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public void bill_cal_cd(String value) {
		setConstString(offset + 27, $bill_cal_cd, value);
	}


	/**
	 * Billing customer calendar name 請求先カレンダ名.<p>
	 *
	 */
	public String bill_cal_nm() {
		return getConstString(offset + 28, $bill_cal_nm);
	}

	/**
	 * Billing customer calendar name 請求先カレンダ名.<p>
	 *
	 */
	public void bill_cal_nm(String value) {
		setConstString(offset + 28, $bill_cal_nm, value);
	}


	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public String rcv_ba_typ() {
		return getConstString(offset + 29, $rcv_ba_typ);
	}

	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public void rcv_ba_typ(String value) {
		setConstString(offset + 29, $rcv_ba_typ, value);
	}


	/**
	 * Payment receipt schedule before/after type name 入金予定前後区分名.<p>
	 *
	 */
	public String rcv_ba_typ_nm() {
		return getConstString(offset + 30, $rcv_ba_typ_nm);
	}

	/**
	 * Payment receipt schedule before/after type name 入金予定前後区分名.<p>
	 *
	 */
	public void rcv_ba_typ_nm(String value) {
		setConstString(offset + 30, $rcv_ba_typ_nm, value);
	}


	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public boolean auto_line_appl_flg() {
		return getConstBoolean(offset + 31, $auto_line_appl_flg);
	}

	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public void auto_line_appl_flg(boolean value) {
		setConstBoolean(offset + 31, $auto_line_appl_flg, value);
	}


	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public boolean sls_interim_cl_flg() {
		return getConstBoolean(offset + 32, $sls_interim_cl_flg);
	}

	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public void sls_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 32, $sls_interim_cl_flg, value);
	}


	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public String ar_setoff_grp_cd() {
		return getConstString(offset + 33, $ar_setoff_grp_cd);
	}

	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public void ar_setoff_grp_cd(String value) {
		setConstString(offset + 33, $ar_setoff_grp_cd, value);
	}


	/**
	 * AR offset group name 債権相殺グループ名.<p>
	 *
	 */
	public String ar_setoff_grp_nm() {
		return getConstString(offset + 34, $ar_setoff_grp_nm);
	}

	/**
	 * AR offset group name 債権相殺グループ名.<p>
	 *
	 */
	public void ar_setoff_grp_nm(String value) {
		setConstString(offset + 34, $ar_setoff_grp_nm, value);
	}


	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public String bcst_prnt_typ() {
		return getConstString(offset + 35, $bcst_prnt_typ);
	}

	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public void bcst_prnt_typ(String value) {
		setConstString(offset + 35, $bcst_prnt_typ, value);
	}


	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public String bcst_prnt_typ_nm() {
		return getConstString(offset + 36, $bcst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public void bcst_prnt_typ_nm(String value) {
		setConstString(offset + 36, $bcst_prnt_typ_nm, value);
	}


	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 37, $bill_zip_cd);
	}

	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 37, $bill_zip_cd, value);
	}


	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 38, $bill_addr1);
	}

	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 38, $bill_addr1, value);
	}


	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 39, $bill_addr2);
	}

	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 39, $bill_addr2, value);
	}


	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 40, $bill_addr3);
	}

	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 40, $bill_addr3, value);
	}


	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 41, $bill_addr4);
	}

	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 41, $bill_addr4, value);
	}


	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 42, $bill_tel);
	}

	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 42, $bill_tel, value);
	}


	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 43, $bill_bcst_nm);
	}

	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 43, $bill_bcst_nm, value);
	}


	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 44, $bill_bcst_dpt);
	}

	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 44, $bill_bcst_dpt, value);
	}


	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public String bill_bcst_psn() {
		return getConstString(offset + 45, $bill_bcst_psn);
	}

	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public void bill_bcst_psn(String value) {
		setConstString(offset + 45, $bill_bcst_psn, value);
	}


	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public String bill_bcst_psn_title() {
		return getConstString(offset + 46, $bill_bcst_psn_title);
	}

	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public void bill_bcst_psn_title(String value) {
		setConstString(offset + 46, $bill_bcst_psn_title, value);
	}


	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public String bill_prnt_typ() {
		return getConstString(offset + 47, $bill_prnt_typ);
	}

	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public void bill_prnt_typ(String value) {
		setConstString(offset + 47, $bill_prnt_typ, value);
	}


	/**
	 * Invoice issue type name 請求書発行区分名.<p>
	 *
	 */
	public String bill_prnt_typ_nm() {
		return getConstString(offset + 48, $bill_prnt_typ_nm);
	}

	/**
	 * Invoice issue type name 請求書発行区分名.<p>
	 *
	 */
	public void bill_prnt_typ_nm(String value) {
		setConstString(offset + 48, $bill_prnt_typ_nm, value);
	}


	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public String sls_dtl_outp_typ() {
		return getConstString(offset + 49, $sls_dtl_outp_typ);
	}

	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public void sls_dtl_outp_typ(String value) {
		setConstString(offset + 49, $sls_dtl_outp_typ, value);
	}


	/**
	 * Sales details output type name 売上明細書出力区分名.<p>
	 *
	 */
	public String sls_dtl_outp_typ_nm() {
		return getConstString(offset + 50, $sls_dtl_outp_typ_nm);
	}

	/**
	 * Sales details output type name 売上明細書出力区分名.<p>
	 *
	 */
	public void sls_dtl_outp_typ_nm(String value) {
		setConstString(offset + 50, $sls_dtl_outp_typ_nm, value);
	}


	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public boolean bill_dtl_outp_flg() {
		return getConstBoolean(offset + 51, $bill_dtl_outp_flg);
	}

	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public void bill_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 51, $bill_dtl_outp_flg, value);
	}


	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public boolean bfw_bal_disp_flg() {
		return getConstBoolean(offset + 52, $bfw_bal_disp_flg);
	}

	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public void bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 52, $bfw_bal_disp_flg, value);
	}


	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public boolean bill_dtl_adv_flg() {
		return getConstBoolean(offset + 53, $bill_dtl_adv_flg);
	}

	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public void bill_dtl_adv_flg(boolean value) {
		setConstBoolean(offset + 53, $bill_dtl_adv_flg, value);
	}


	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public boolean bill_dtl_rcv_flg() {
		return getConstBoolean(offset + 54, $bill_dtl_rcv_flg);
	}

	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public void bill_dtl_rcv_flg(boolean value) {
		setConstBoolean(offset + 54, $bill_dtl_rcv_flg, value);
	}


	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public String bill_dtl_subttl_typ() {
		return getConstString(offset + 55, $bill_dtl_subttl_typ);
	}

	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public void bill_dtl_subttl_typ(String value) {
		setConstString(offset + 55, $bill_dtl_subttl_typ, value);
	}


	/**
	 * Invoice details subtotal type name 請求書明細小計区分名.<p>
	 *
	 */
	public String bill_dtl_subttl_typ_nm() {
		return getConstString(offset + 56, $bill_dtl_subttl_typ_nm);
	}

	/**
	 * Invoice details subtotal type name 請求書明細小計区分名.<p>
	 *
	 */
	public void bill_dtl_subttl_typ_nm(String value) {
		setConstString(offset + 56, $bill_dtl_subttl_typ_nm, value);
	}


	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public String bill_dtl_brk_typ() {
		return getConstString(offset + 57, $bill_dtl_brk_typ);
	}

	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public void bill_dtl_brk_typ(String value) {
		setConstString(offset + 57, $bill_dtl_brk_typ, value);
	}


	/**
	 * Invoice details page break type name 請求書明細改頁区分名.<p>
	 *
	 */
	public String bill_dtl_brk_typ_nm() {
		return getConstString(offset + 58, $bill_dtl_brk_typ_nm);
	}

	/**
	 * Invoice details page break type name 請求書明細改頁区分名.<p>
	 *
	 */
	public void bill_dtl_brk_typ_nm(String value) {
		setConstString(offset + 58, $bill_dtl_brk_typ_nm, value);
	}


	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public String bill_dtl_sort_typ() {
		return getConstString(offset + 59, $bill_dtl_sort_typ);
	}

	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public void bill_dtl_sort_typ(String value) {
		setConstString(offset + 59, $bill_dtl_sort_typ, value);
	}


	/**
	 * Invoice details sort order type name 請求書明細並順区分名.<p>
	 *
	 */
	public String bill_dtl_sort_typ_nm() {
		return getConstString(offset + 60, $bill_dtl_sort_typ_nm);
	}

	/**
	 * Invoice details sort order type name 請求書明細並順区分名.<p>
	 *
	 */
	public void bill_dtl_sort_typ_nm(String value) {
		setConstString(offset + 60, $bill_dtl_sort_typ_nm, value);
	}


	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public String bill_can_slip_typ() {
		return getConstString(offset + 61, $bill_can_slip_typ);
	}

	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public void bill_can_slip_typ(String value) {
		setConstString(offset + 61, $bill_can_slip_typ, value);
	}


	/**
	 * Invoice cancel slip display type name 請求書取消伝票表示区分名.<p>
	 *
	 */
	public String bill_can_slip_typ_nm() {
		return getConstString(offset + 62, $bill_can_slip_typ_nm);
	}

	/**
	 * Invoice cancel slip display type name 請求書取消伝票表示区分名.<p>
	 *
	 */
	public void bill_can_slip_typ_nm(String value) {
		setConstString(offset + 62, $bill_can_slip_typ_nm, value);
	}


	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public boolean rcv_auto_appl_tgt_flg() {
		return getConstBoolean(offset + 63, $rcv_auto_appl_tgt_flg);
	}

	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public void rcv_auto_appl_tgt_flg(boolean value) {
		setConstBoolean(offset + 63, $rcv_auto_appl_tgt_flg, value);
	}


	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public boolean rcv_amt_match_flg() {
		return getConstBoolean(offset + 64, $rcv_amt_match_flg);
	}

	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public void rcv_amt_match_flg(boolean value) {
		setConstBoolean(offset + 64, $rcv_amt_match_flg, value);
	}


	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public boolean ar_sttl_typ_match_flg() {
		return getConstBoolean(offset + 65, $ar_sttl_typ_match_flg);
	}

	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public void ar_sttl_typ_match_flg(boolean value) {
		setConstBoolean(offset + 65, $ar_sttl_typ_match_flg, value);
	}


	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public boolean calc_com_paid_flg() {
		return getConstBoolean(offset + 66, $calc_com_paid_flg);
	}

	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public void calc_com_paid_flg(boolean value) {
		setConstBoolean(offset + 66, $calc_com_paid_flg, value);
	}


	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public MCNumber auto_appl_delay_days() {
		return getConstNumber(offset + 67, $auto_appl_delay_days);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(MCNumber value) {
		setConstNumber(offset + 67, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(int value) {
		setConstNumber(offset + 67, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(long value) {
		setConstNumber(offset + 67, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(float value) {
		setConstNumber(offset + 67, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(double value) {
		setConstNumber(offset + 67, $auto_appl_delay_days, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 68, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 68, $xfr_psn, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 69, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 69, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 70, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 70, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 71, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 71, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 72, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 72, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 73, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 73, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 74, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 74, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 75, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 75, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 76, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 76, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 77, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 77, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 78, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 78, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 79, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 79, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 80, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 80, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 81, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 81, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 82, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 82, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 83, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 83, $del_ts, value);
	}


	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public String rcst_prnt_typ() {
		return getConstString(offset + 84, $rcst_prnt_typ);
	}

	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public void rcst_prnt_typ(String value) {
		setConstString(offset + 84, $rcst_prnt_typ, value);
	}


	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public String rcst_prnt_typ_nm() {
		return getConstString(offset + 85, $rcst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public void rcst_prnt_typ_nm(String value) {
		setConstString(offset + 85, $rcst_prnt_typ_nm, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			return ar_cred_nm();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bill_dpt_typ_nm.equalsIgnoreCase(name)) {
			return bill_dpt_typ_nm();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			return bcst_dpt_nm();
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			return check_bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_typ_nm();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ_nm();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ_nm();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			return bill_cal_nm();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($rcv_ba_typ_nm.equalsIgnoreCase(name)) {
			return rcv_ba_typ_nm();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ar_setoff_grp_nm();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bcst_prnt_typ_nm();
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
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bill_prnt_typ_nm();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($sls_dtl_outp_typ_nm.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ_nm();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ_nm();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ_nm();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ_nm();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($bill_can_slip_typ_nm.equalsIgnoreCase(name)) {
			return bill_can_slip_typ_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
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
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return rcst_prnt_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
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
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			return ar_cred_nm();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bill_dpt_typ_nm.equalsIgnoreCase(name)) {
			return bill_dpt_typ_nm();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			return bcst_dpt_nm();
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			return check_bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_typ_nm();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ_nm();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ_nm();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			return bill_cal_nm();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($rcv_ba_typ_nm.equalsIgnoreCase(name)) {
			return rcv_ba_typ_nm();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			return ar_setoff_grp_nm();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bcst_prnt_typ_nm();
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
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bill_prnt_typ_nm();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($sls_dtl_outp_typ_nm.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ_nm();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ_nm();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ_nm();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ_nm();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($bill_can_slip_typ_nm.equalsIgnoreCase(name)) {
			return bill_can_slip_typ_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
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
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return rcst_prnt_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
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
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_adv_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
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
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			ar_cred_nm(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bill_dpt_typ_nm.equalsIgnoreCase(name)) {
			bill_dpt_typ_nm(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			bcst_dpt_nm(value);
			return;
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			check_bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_typ_nm(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ_nm(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_ba_typ_nm(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			bill_cal_nm(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($rcv_ba_typ_nm.equalsIgnoreCase(name)) {
			rcv_ba_typ_nm(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			ar_setoff_grp_nm(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			bcst_prnt_typ_nm(value);
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
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_prnt_typ_nm.equalsIgnoreCase(name)) {
			bill_prnt_typ_nm(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($sls_dtl_outp_typ_nm.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ_nm(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ_nm(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ_nm(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ_nm(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($bill_can_slip_typ_nm.equalsIgnoreCase(name)) {
			bill_can_slip_typ_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
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
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			rcst_prnt_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($ar_cred_nm.equalsIgnoreCase(name)) {
			ar_cred_nm(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bill_dpt_typ_nm.equalsIgnoreCase(name)) {
			bill_dpt_typ_nm(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bcst_dpt_nm.equalsIgnoreCase(name)) {
			bcst_dpt_nm(value);
			return;
		}
		if ($check_bcst_dpt_cd.equalsIgnoreCase(name)) {
			check_bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_typ_nm(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ_nm(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_ba_typ_nm(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($bill_cal_nm.equalsIgnoreCase(name)) {
			bill_cal_nm(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($rcv_ba_typ_nm.equalsIgnoreCase(name)) {
			rcv_ba_typ_nm(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($ar_setoff_grp_nm.equalsIgnoreCase(name)) {
			ar_setoff_grp_nm(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			bcst_prnt_typ_nm(value);
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
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_prnt_typ_nm.equalsIgnoreCase(name)) {
			bill_prnt_typ_nm(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($sls_dtl_outp_typ_nm.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ_nm(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ_nm(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ_nm(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ_nm.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ_nm(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($bill_can_slip_typ_nm.equalsIgnoreCase(name)) {
			bill_can_slip_typ_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
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
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			rcst_prnt_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_adv_flg.equalsIgnoreCase(name)) {
			bill_dtl_adv_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
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
		super.setBooleanNE(name, value);
	}



}

