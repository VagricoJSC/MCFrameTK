package mcframe.serverMSBB.MSBBL1110;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
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
 * ブロック"Srch01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_HdrR_MC_A extends MCConstRow {

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public static final String $qtn_no = "qtn_no";
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public static final String $qtn_rev = "qtn_rev";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Quotation type 見積区分.<p>
	 *
	 */
	public static final String $qtn_typ = "qtn_typ";
	/**
	 * Quotation type name 見積区分名.<p>
	 *
	 */
	public static final String $qtn_typ_nm = "qtn_typ_nm";
	/**
	 * Quotation date 見積日.<p>
	 *
	 */
	public static final String $qtn_dt = "qtn_dt";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $valid_dt = "valid_dt";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $qtn_prnt_flg = "qtn_prnt_flg";
	/**
	 * Quotation issue date 見積書発行日.<p>
	 *
	 */
	public static final String $qtn_prnt_dt = "qtn_prnt_dt";
	/**
	 * Failed order 失注.<p>
	 *
	 */
	public static final String $failure_flg = "failure_flg";
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public static final String $aprv_sts_typ_nm = "aprv_sts_typ_nm";
	/**
	 * Allow correction 訂正可能.<p>
	 *
	 */
	public static final String $aprv_upd_flg = "aprv_upd_flg";
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public static final String $aprv_can_flg = "aprv_can_flg";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public static final String $cst_sundry_flg = "cst_sundry_flg";
	/**
	 * Customer country cd. 得意先国ＣＤ.<p>
	 *
	 */
	public static final String $cst_cntry_cd = "cst_cntry_cd";
	/**
	 * Customer country name 得意先国名.<p>
	 *
	 */
	public static final String $cst_cntry_nm = "cst_cntry_nm";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
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
	 * Customer zip code 得意先郵便番号.<p>
	 *
	 */
	public static final String $cst_zip_cd = "cst_zip_cd";
	/**
	 * Customer address 1 得意先住所１.<p>
	 *
	 */
	public static final String $cst_addr1 = "cst_addr1";
	/**
	 * Customer address 2 得意先住所２.<p>
	 *
	 */
	public static final String $cst_addr2 = "cst_addr2";
	/**
	 * Customer address 3 得意先住所３.<p>
	 *
	 */
	public static final String $cst_addr3 = "cst_addr3";
	/**
	 * Customer address 4 得意先住所４.<p>
	 *
	 */
	public static final String $cst_addr4 = "cst_addr4";
	/**
	 * Customer TEL 得意先ＴＥＬ.<p>
	 *
	 */
	public static final String $cst_tel = "cst_tel";
	/**
	 * Customer FAX 得意先ＦＡＸ.<p>
	 *
	 */
	public static final String $cst_fax = "cst_fax";
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ = "sls_amt_rnd_typ";
	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ = "sls_tax_rnd_typ";
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public static final String $sls_usr_nm = "sls_usr_nm";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public static final String $qtn_term_cd = "qtn_term_cd";
	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public static final String $qtn_term_nm = "qtn_term_nm";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
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
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_upri_dec_place = "base_cur_upri_dec_place";
	/**
	 * Specify rate レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public static final String $cst_qtn_rqst_no = "cst_qtn_rqst_no";
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public static final String $prof_rate = "prof_rate";
	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public static final String $ttl_amt = "ttl_amt";
	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public static final String $ttl_amt_no_cost = "ttl_amt_no_cost";
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
	 * Receiving date 受付日.<p>
	 *
	 */
	public static final String $rcpt_dt = "rcpt_dt";
	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public static final String $rcpt_usr_cd = "rcpt_usr_cd";
	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public static final String $rcpt_usr_nm = "rcpt_usr_nm";
	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public static final String $qtn_rmrks = "qtn_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public static final String $qtn_rslt_rsn_cd = "qtn_rslt_rsn_cd";
	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public static final String $qtn_rslt_rsn_nm = "qtn_rslt_rsn_nm";
	/**
	 * Quotation result reason remarks 見積結果理由備考.<p>
	 *
	 */
	public static final String $qtn_rslt_rsn_rmrks = "qtn_rslt_rsn_rmrks";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public static final String $qtn_prnt_seq = "qtn_prnt_seq";
	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public static final String $qtn_upd_cntr = "qtn_upd_cntr";


	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_typ_META = createCommonMeta($qtn_typ, mcframe.commonMS.meta.MS_META.QTN_TYP);
	public static final MCMeta qtn_typ_nm_META = createCommonMeta($qtn_typ_nm, mcframe.commonMS.meta.MS_META.QTN_TYP_NM);
	public static final MCMeta qtn_dt_META = createCommonMeta($qtn_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_META = createCommonMeta($valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta qtn_prnt_flg_META = createCommonMeta($qtn_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_prnt_dt_META = createCommonMeta($qtn_prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta failure_flg_META = createCommonMeta($failure_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta aprv_upd_flg_META = createCommonMeta($aprv_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_can_flg_META = createCommonMeta($aprv_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_sundry_flg_META = createCommonMeta($cst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_cntry_cd_META = createCommonMeta($cst_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cst_cntry_nm_META = createCommonMeta($cst_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta cst_zip_cd_META = createCommonMeta($cst_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta cst_addr1_META = createCommonMeta($cst_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta cst_addr2_META = createCommonMeta($cst_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta cst_addr3_META = createCommonMeta($cst_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta cst_addr4_META = createCommonMeta($cst_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta cst_tel_META = createCommonMeta($cst_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cst_fax_META = createCommonMeta($cst_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta qtn_term_cd_META = createCommonMeta($qtn_term_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_term_nm_META = createCommonMeta($qtn_term_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta cst_qtn_rqst_no_META = createCommonMeta($cst_qtn_rqst_no, mcframe.commonMA.meta.MA_META.CST_QTN_RQST_NO);
	public static final MCMeta prof_rate_META = createCommonMeta($prof_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_amt_META = createCommonMeta($ttl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_amt_no_cost_META = createCommonMeta($ttl_amt_no_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcpt_usr_nm_META = createCommonMeta($rcpt_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta qtn_rmrks_META = createCommonMeta($qtn_rmrks, mcframe.commonMS.meta.MS_META.QTN_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.QTN_INTR_RMRKS);
	public static final MCMeta qtn_rslt_rsn_cd_META = createCommonMeta($qtn_rslt_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_rslt_rsn_nm_META = createCommonMeta($qtn_rslt_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_rslt_rsn_rmrks_META = createCommonMeta($qtn_rslt_rsn_rmrks, mcframe.commonMS.meta.MS_META.QTN_RSLT_RSN_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta qtn_prnt_seq_META = createCommonMeta($qtn_prnt_seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta qtn_upd_cntr_META = createCommonMeta($qtn_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch01_HdrR> constMetas = new ConstMetaList<Srch01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			qtn_no_META,
			qtn_rev_META,
			can_flg_META,
			qtn_typ_META,
			qtn_typ_nm_META,
			qtn_dt_META,
			valid_dt_META,
			qtn_prnt_flg_META,
			qtn_prnt_dt_META,
			failure_flg_META,
			aprv_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			aprv_upd_flg_META,
			aprv_can_flg_META,
			cst_cd_META,
			cst_sundry_flg_META,
			cst_cntry_cd_META,
			cst_cntry_nm_META,
			cst_nm_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_zip_cd_META,
			cst_addr1_META,
			cst_addr2_META,
			cst_addr3_META,
			cst_addr4_META,
			cst_tel_META,
			cst_fax_META,
			cst_iv_flg_META,
			sls_amt_rnd_typ_META,
			sls_tax_rnd_typ_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			qtn_term_cd_META,
			qtn_term_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_upri_dec_place_META,
			xrate_inpt_flg_META,
			xrate_META,
			xrate_cd_META,
			wrk_no_META,
			wrk_nm_META,
			cst_qtn_rqst_no_META,
			prof_rate_META,
			trd_cur_amt_META,
			trd_cur_inc_tax_amt_META,
			ttl_amt_META,
			ttl_amt_no_cost_META,
			trnspt_cd_META,
			trnspt_nm_META,
			tterm_cd1_META,
			tterm_nm1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_nm2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			rcpt_dt_META,
			rcpt_usr_cd_META,
			rcpt_usr_nm_META,
			qtn_rmrks_META,
			intr_rmrks_META,
			qtn_rslt_rsn_cd_META,
			qtn_rslt_rsn_nm_META,
			qtn_rslt_rsn_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			qtn_prnt_seq_META,
			qtn_upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$qtn_typ, "MSC_QTN_TYP"},	// qtn_typ
				{$aprv_sts_typ, "MAC_APRV_STS_TYP"}	// aprv_sts_typ
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_HdrR_MC_A(ConstMetaList<? extends Srch01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR clone() {
		return (Srch01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR createInstance() {
		return (Srch01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR getValues(String... names) {
		return (Srch01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 0, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 0, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 1, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 1, $trd_nm, value);
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
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 3, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 3, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 4, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 4, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 4, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 4, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 4, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 4, $qtn_rev, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 5, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 5, $can_flg, value);
	}


	/**
	 * Quotation type 見積区分.<p>
	 *
	 */
	public String qtn_typ() {
		return getConstString(offset + 6, $qtn_typ);
	}

	/**
	 * Quotation type 見積区分.<p>
	 *
	 */
	public void qtn_typ(String value) {
		setConstString(offset + 6, $qtn_typ, value);
	}


	/**
	 * Quotation type name 見積区分名.<p>
	 *
	 */
	public String qtn_typ_nm() {
		return getConstString(offset + 7, $qtn_typ_nm);
	}

	/**
	 * Quotation type name 見積区分名.<p>
	 *
	 */
	public void qtn_typ_nm(String value) {
		setConstString(offset + 7, $qtn_typ_nm, value);
	}


	/**
	 * Quotation date 見積日.<p>
	 *
	 */
	public MCDate qtn_dt() {
		return getConstDate(offset + 8, $qtn_dt);
	}

	/**
	 * Quotation date 見積日.<p>
	 *
	 */
	public void qtn_dt(MCDate value) {
		setConstDate(offset + 8, $qtn_dt, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate valid_dt() {
		return getConstDate(offset + 9, $valid_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void valid_dt(MCDate value) {
		setConstDate(offset + 9, $valid_dt, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean qtn_prnt_flg() {
		return getConstBoolean(offset + 10, $qtn_prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void qtn_prnt_flg(boolean value) {
		setConstBoolean(offset + 10, $qtn_prnt_flg, value);
	}


	/**
	 * Quotation issue date 見積書発行日.<p>
	 *
	 */
	public MCDate qtn_prnt_dt() {
		return getConstDate(offset + 11, $qtn_prnt_dt);
	}

	/**
	 * Quotation issue date 見積書発行日.<p>
	 *
	 */
	public void qtn_prnt_dt(MCDate value) {
		setConstDate(offset + 11, $qtn_prnt_dt, value);
	}


	/**
	 * Failed order 失注.<p>
	 *
	 */
	public boolean failure_flg() {
		return getConstBoolean(offset + 12, $failure_flg);
	}

	/**
	 * Failed order 失注.<p>
	 *
	 */
	public void failure_flg(boolean value) {
		setConstBoolean(offset + 12, $failure_flg, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 13, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 13, $aprv_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 14, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 14, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 15, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 15, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 16, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 16, $aprv_sts_typ_nm, value);
	}


	/**
	 * Allow correction 訂正可能.<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 17, $aprv_upd_flg);
	}

	/**
	 * Allow correction 訂正可能.<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 17, $aprv_upd_flg, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean aprv_can_flg() {
		return getConstBoolean(offset + 18, $aprv_can_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void aprv_can_flg(boolean value) {
		setConstBoolean(offset + 18, $aprv_can_flg, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 19, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 19, $cst_cd, value);
	}


	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public boolean cst_sundry_flg() {
		return getConstBoolean(offset + 20, $cst_sundry_flg);
	}

	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public void cst_sundry_flg(boolean value) {
		setConstBoolean(offset + 20, $cst_sundry_flg, value);
	}


	/**
	 * Customer country cd. 得意先国ＣＤ.<p>
	 *
	 */
	public String cst_cntry_cd() {
		return getConstString(offset + 21, $cst_cntry_cd);
	}

	/**
	 * Customer country cd. 得意先国ＣＤ.<p>
	 *
	 */
	public void cst_cntry_cd(String value) {
		setConstString(offset + 21, $cst_cntry_cd, value);
	}


	/**
	 * Customer country name 得意先国名.<p>
	 *
	 */
	public String cst_cntry_nm() {
		return getConstString(offset + 22, $cst_cntry_nm);
	}

	/**
	 * Customer country name 得意先国名.<p>
	 *
	 */
	public void cst_cntry_nm(String value) {
		setConstString(offset + 22, $cst_cntry_nm, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 23, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 23, $cst_nm, value);
	}


	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public String cst_cntct_dpt() {
		return getConstString(offset + 24, $cst_cntct_dpt);
	}

	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public void cst_cntct_dpt(String value) {
		setConstString(offset + 24, $cst_cntct_dpt, value);
	}


	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public String cst_cntct_psn() {
		return getConstString(offset + 25, $cst_cntct_psn);
	}

	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public void cst_cntct_psn(String value) {
		setConstString(offset + 25, $cst_cntct_psn, value);
	}


	/**
	 * Customer zip code 得意先郵便番号.<p>
	 *
	 */
	public String cst_zip_cd() {
		return getConstString(offset + 26, $cst_zip_cd);
	}

	/**
	 * Customer zip code 得意先郵便番号.<p>
	 *
	 */
	public void cst_zip_cd(String value) {
		setConstString(offset + 26, $cst_zip_cd, value);
	}


	/**
	 * Customer address 1 得意先住所１.<p>
	 *
	 */
	public String cst_addr1() {
		return getConstString(offset + 27, $cst_addr1);
	}

	/**
	 * Customer address 1 得意先住所１.<p>
	 *
	 */
	public void cst_addr1(String value) {
		setConstString(offset + 27, $cst_addr1, value);
	}


	/**
	 * Customer address 2 得意先住所２.<p>
	 *
	 */
	public String cst_addr2() {
		return getConstString(offset + 28, $cst_addr2);
	}

	/**
	 * Customer address 2 得意先住所２.<p>
	 *
	 */
	public void cst_addr2(String value) {
		setConstString(offset + 28, $cst_addr2, value);
	}


	/**
	 * Customer address 3 得意先住所３.<p>
	 *
	 */
	public String cst_addr3() {
		return getConstString(offset + 29, $cst_addr3);
	}

	/**
	 * Customer address 3 得意先住所３.<p>
	 *
	 */
	public void cst_addr3(String value) {
		setConstString(offset + 29, $cst_addr3, value);
	}


	/**
	 * Customer address 4 得意先住所４.<p>
	 *
	 */
	public String cst_addr4() {
		return getConstString(offset + 30, $cst_addr4);
	}

	/**
	 * Customer address 4 得意先住所４.<p>
	 *
	 */
	public void cst_addr4(String value) {
		setConstString(offset + 30, $cst_addr4, value);
	}


	/**
	 * Customer TEL 得意先ＴＥＬ.<p>
	 *
	 */
	public String cst_tel() {
		return getConstString(offset + 31, $cst_tel);
	}

	/**
	 * Customer TEL 得意先ＴＥＬ.<p>
	 *
	 */
	public void cst_tel(String value) {
		setConstString(offset + 31, $cst_tel, value);
	}


	/**
	 * Customer FAX 得意先ＦＡＸ.<p>
	 *
	 */
	public String cst_fax() {
		return getConstString(offset + 32, $cst_fax);
	}

	/**
	 * Customer FAX 得意先ＦＡＸ.<p>
	 *
	 */
	public void cst_fax(String value) {
		setConstString(offset + 32, $cst_fax, value);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 33, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 33, $cst_iv_flg, value);
	}


	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 34, $sls_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 34, $sls_amt_rnd_typ, value);
	}


	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 35, $sls_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 35, $sls_tax_rnd_typ, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 36, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 36, $sls_usr_cd, value);
	}


	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 37, $sls_usr_nm);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 37, $sls_usr_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 38, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 38, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 39, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 39, $sls_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 40, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 40, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 41, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 41, $wg_nm, value);
	}


	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public String qtn_term_cd() {
		return getConstString(offset + 42, $qtn_term_cd);
	}

	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public void qtn_term_cd(String value) {
		setConstString(offset + 42, $qtn_term_cd, value);
	}


	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public String qtn_term_nm() {
		return getConstString(offset + 43, $qtn_term_nm);
	}

	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public void qtn_term_nm(String value) {
		setConstString(offset + 43, $qtn_term_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 44, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 44, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 45, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 45, $trd_cur_nm, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 46, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 46, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 46, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 46, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 46, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 46, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 47, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 47, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 47, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 47, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 47, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 47, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 48, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 48, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 49, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 49, $base_cur_nm, value);
	}


	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 50, $base_cur_amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 50, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 50, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 50, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 50, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 50, $base_cur_amt_dec_place, value);
	}


	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 51, $base_cur_upri_dec_place);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 51, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 51, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 51, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 51, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 51, $base_cur_upri_dec_place, value);
	}


	/**
	 * Specify rate レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 52, $xrate_inpt_flg);
	}

	/**
	 * Specify rate レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 52, $xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 53, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 53, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 53, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 53, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 53, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 53, $xrate, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 54, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 54, $xrate_cd, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 55, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 55, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 56, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 56, $wrk_nm, value);
	}


	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public String cst_qtn_rqst_no() {
		return getConstString(offset + 57, $cst_qtn_rqst_no);
	}

	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public void cst_qtn_rqst_no(String value) {
		setConstString(offset + 57, $cst_qtn_rqst_no, value);
	}


	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumber prof_rate() {
		return getConstNumber(offset + 58, $prof_rate);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(MCNumber value) {
		setConstNumber(offset + 58, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(int value) {
		setConstNumber(offset + 58, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(long value) {
		setConstNumber(offset + 58, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(float value) {
		setConstNumber(offset + 58, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(double value) {
		setConstNumber(offset + 58, $prof_rate, value);
	}


	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 59, $trd_cur_amt);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 59, $trd_cur_amt, value);
	}


	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 60, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 60, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 60, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 60, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 60, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included discount amount (Transaction currency) 取引通貨仕切税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 60, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public MCNumber ttl_amt() {
		return getConstNumber(offset + 61, $ttl_amt);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(MCNumber value) {
		setConstNumber(offset + 61, $ttl_amt, value);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(int value) {
		setConstNumber(offset + 61, $ttl_amt, value);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(long value) {
		setConstNumber(offset + 61, $ttl_amt, value);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(float value) {
		setConstNumber(offset + 61, $ttl_amt, value);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(double value) {
		setConstNumber(offset + 61, $ttl_amt, value);
	}


	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public MCNumber ttl_amt_no_cost() {
		return getConstNumber(offset + 62, $ttl_amt_no_cost);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(MCNumber value) {
		setConstNumber(offset + 62, $ttl_amt_no_cost, value);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(int value) {
		setConstNumber(offset + 62, $ttl_amt_no_cost, value);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(long value) {
		setConstNumber(offset + 62, $ttl_amt_no_cost, value);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(float value) {
		setConstNumber(offset + 62, $ttl_amt_no_cost, value);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(double value) {
		setConstNumber(offset + 62, $ttl_amt_no_cost, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 63, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 63, $trnspt_cd, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 64, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 64, $trnspt_nm, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 65, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 65, $tterm_cd1, value);
	}


	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 66, $tterm_nm1);
	}

	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 66, $tterm_nm1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 67, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 67, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 68, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 68, $tterm_cd2, value);
	}


	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 69, $tterm_nm2);
	}

	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 69, $tterm_nm2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 70, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 70, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 71, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 71, $tterm_cd3, value);
	}


	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 72, $tterm_nm3);
	}

	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 72, $tterm_nm3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 73, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 73, $tterm_rmrks3, value);
	}


	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 74, $rcpt_dt);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 74, $rcpt_dt, value);
	}


	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 75, $rcpt_usr_cd);
	}

	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 75, $rcpt_usr_cd, value);
	}


	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public String rcpt_usr_nm() {
		return getConstString(offset + 76, $rcpt_usr_nm);
	}

	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public void rcpt_usr_nm(String value) {
		setConstString(offset + 76, $rcpt_usr_nm, value);
	}


	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public String qtn_rmrks() {
		return getConstString(offset + 77, $qtn_rmrks);
	}

	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public void qtn_rmrks(String value) {
		setConstString(offset + 77, $qtn_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 78, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 78, $intr_rmrks, value);
	}


	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public String qtn_rslt_rsn_cd() {
		return getConstString(offset + 79, $qtn_rslt_rsn_cd);
	}

	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public void qtn_rslt_rsn_cd(String value) {
		setConstString(offset + 79, $qtn_rslt_rsn_cd, value);
	}


	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public String qtn_rslt_rsn_nm() {
		return getConstString(offset + 80, $qtn_rslt_rsn_nm);
	}

	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public void qtn_rslt_rsn_nm(String value) {
		setConstString(offset + 80, $qtn_rslt_rsn_nm, value);
	}


	/**
	 * Quotation result reason remarks 見積結果理由備考.<p>
	 *
	 */
	public String qtn_rslt_rsn_rmrks() {
		return getConstString(offset + 81, $qtn_rslt_rsn_rmrks);
	}

	/**
	 * Quotation result reason remarks 見積結果理由備考.<p>
	 *
	 */
	public void qtn_rslt_rsn_rmrks(String value) {
		setConstString(offset + 81, $qtn_rslt_rsn_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 82, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 82, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 83, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 83, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 84, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 84, $sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 85, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 85, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 86, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 86, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 87, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 87, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 88, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 88, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 89, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 89, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 90, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 90, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 91, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 91, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 92, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 92, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 93, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 93, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 94, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 94, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 95, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 95, $upd_srv_req_no, value);
	}


	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public MCNumber qtn_prnt_seq() {
		return getConstNumber(offset + 96, $qtn_prnt_seq);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(MCNumber value) {
		setConstNumber(offset + 96, $qtn_prnt_seq, value);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(int value) {
		setConstNumber(offset + 96, $qtn_prnt_seq, value);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(long value) {
		setConstNumber(offset + 96, $qtn_prnt_seq, value);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(float value) {
		setConstNumber(offset + 96, $qtn_prnt_seq, value);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(double value) {
		setConstNumber(offset + 96, $qtn_prnt_seq, value);
	}


	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public MCNumber qtn_upd_cntr() {
		return getConstNumber(offset + 97, $qtn_upd_cntr);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(MCNumber value) {
		setConstNumber(offset + 97, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(int value) {
		setConstNumber(offset + 97, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(long value) {
		setConstNumber(offset + 97, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(float value) {
		setConstNumber(offset + 97, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(double value) {
		setConstNumber(offset + 97, $qtn_upd_cntr, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			return qtn_typ();
		}
		if ($qtn_typ_nm.equalsIgnoreCase(name)) {
			return qtn_typ_nm();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_cntry_cd.equalsIgnoreCase(name)) {
			return cst_cntry_cd();
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			return cst_cntry_nm();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			return cst_zip_cd();
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			return cst_addr1();
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			return cst_addr2();
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			return cst_addr3();
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			return cst_addr4();
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			return cst_tel();
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			return cst_fax();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			return qtn_term_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_no();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
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
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_cd();
		}
		if ($qtn_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_nm();
		}
		if ($qtn_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_rmrks();
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			return ttl_amt();
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			return ttl_amt_no_cost();
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			return qtn_prnt_seq();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($qtn_dt.equalsIgnoreCase(name)) {
			return qtn_dt();
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			return valid_dt();
		}
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			return qtn_prnt_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
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
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			return qtn_prnt_flg();
		}
		if ($failure_flg.equalsIgnoreCase(name)) {
			return failure_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			return qtn_typ();
		}
		if ($qtn_typ_nm.equalsIgnoreCase(name)) {
			return qtn_typ_nm();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_cntry_cd.equalsIgnoreCase(name)) {
			return cst_cntry_cd();
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			return cst_cntry_nm();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			return cst_zip_cd();
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			return cst_addr1();
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			return cst_addr2();
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			return cst_addr3();
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			return cst_addr4();
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			return cst_tel();
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			return cst_fax();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			return qtn_term_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_no();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
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
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_cd();
		}
		if ($qtn_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_nm();
		}
		if ($qtn_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_rmrks();
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			return ttl_amt();
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			return ttl_amt_no_cost();
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			return qtn_prnt_seq();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($qtn_dt.equalsIgnoreCase(name)) {
			return qtn_dt();
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			return valid_dt();
		}
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			return qtn_prnt_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
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
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			return qtn_prnt_flg();
		}
		if ($failure_flg.equalsIgnoreCase(name)) {
			return failure_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			qtn_typ(value);
			return;
		}
		if ($qtn_typ_nm.equalsIgnoreCase(name)) {
			qtn_typ_nm(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_cntry_cd.equalsIgnoreCase(name)) {
			cst_cntry_cd(value);
			return;
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			cst_cntry_nm(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			cst_zip_cd(value);
			return;
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			cst_addr1(value);
			return;
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			cst_addr2(value);
			return;
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			cst_addr3(value);
			return;
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			cst_addr4(value);
			return;
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			cst_tel(value);
			return;
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			cst_fax(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
			return;
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			qtn_term_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_no(value);
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			rcpt_usr_nm(value);
			return;
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			qtn_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_rmrks(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($qtn_dt.equalsIgnoreCase(name)) {
			qtn_dt(value);
			return;
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			valid_dt(value);
			return;
		}
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			qtn_prnt_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			qtn_prnt_flg(value);
			return;
		}
		if ($failure_flg.equalsIgnoreCase(name)) {
			failure_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			qtn_typ(value);
			return;
		}
		if ($qtn_typ_nm.equalsIgnoreCase(name)) {
			qtn_typ_nm(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_cntry_cd.equalsIgnoreCase(name)) {
			cst_cntry_cd(value);
			return;
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			cst_cntry_nm(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			cst_zip_cd(value);
			return;
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			cst_addr1(value);
			return;
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			cst_addr2(value);
			return;
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			cst_addr3(value);
			return;
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			cst_addr4(value);
			return;
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			cst_tel(value);
			return;
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			cst_fax(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
			return;
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			qtn_term_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_no(value);
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			rcpt_usr_nm(value);
			return;
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			qtn_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_rmrks(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_amt_no_cost.equalsIgnoreCase(name)) {
			ttl_amt_no_cost(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($qtn_dt.equalsIgnoreCase(name)) {
			qtn_dt(value);
			return;
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			valid_dt(value);
			return;
		}
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			qtn_prnt_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			qtn_prnt_flg(value);
			return;
		}
		if ($failure_flg.equalsIgnoreCase(name)) {
			failure_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

